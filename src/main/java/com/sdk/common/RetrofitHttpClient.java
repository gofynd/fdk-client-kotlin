package com.sdk.common;


import android.app.Application;
import android.os.Build;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RetrofitHttpClient {

    Map<String, List<Interceptor>> interceptorMap;
    private Object apiService;
    private OkHttpClient okHttpClient;
    private CookieManager cookieManager;
    private Application appInstance;
    private String baseUrl;
    private Map<String, String> headerList;
    private CookieJar cookieJar;


    RetrofitHttpClient
            (Application app, String baseUrl, Map<String, String> httpHeaderList,
             Map<String, List<Interceptor>> interceptorMap,
             CookieJar cookieJar, CookieManager cookieManager) {
        this.appInstance = app;
        this.baseUrl = baseUrl;
        this.headerList = httpHeaderList;
        this.interceptorMap = interceptorMap;
        this.cookieManager = cookieManager;
        this.cookieJar = cookieJar;
        okHttpClient = getUnsafeOkHttpClient();
    }

    private static OkHttpClient.Builder enableTls12OnPreLollipop(OkHttpClient.Builder client) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(
                    TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new IllegalStateException("Unexpected default trust managers:"
                        + Arrays.toString(trustManagers));
            }
            X509TrustManager trustManager = (X509TrustManager) trustManagers[0];
            SSLContext sslContext = SSLContext.getInstance("TLSv1.2");

            sslContext.init(null, new TrustManager[]{trustManager}, null);

            if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT < 22) {
                try {
                    //client.sslSocketFactory(new Tls12SocketFactory(sslContext.getSocketFactory()), trustManager);
                    client.sslSocketFactory(sslContext.getSocketFactory(), trustManager);
                    ConnectionSpec cs = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                            .tlsVersions(TlsVersion.TLS_1_2)
                            .build();

                    List<ConnectionSpec> specs = new ArrayList<>();
                    specs.add(cs);
                    specs.add(ConnectionSpec.COMPATIBLE_TLS);
                    specs.add(ConnectionSpec.CLEARTEXT);

                    client.connectionSpecs(specs);
                } catch (Exception exc) {
                    Log.e("OkHttpTLSCompat", "Error while setting TLS 1.2", exc);
                }
            } else {
                // client.sslSocketFactory(new Tls12SocketFactory(sslContext.getSocketFactory()), trustManager);
                client.sslSocketFactory(new Tls12SocketFactory(), trustManager);

            }


        } catch (Exception exc) {
            Log.e("OkHttpTLSCompat", "Error while setting TLS 1.2", exc);
        }


        return client;
    }

    public CookieManager getCookieManager() {
        return cookieManager;
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }

    private OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

//            // Install the all-trusting trust manager
//            final SSLContext sslContext = SSLContext.getInstance("SSL");
//            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
//            // Create an ssl socket factory with our all-trusting manager
//            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            Cache cache;
            long SIZE_OF_CACHE = 10 * 1024 * 1024;
            cache = new Cache(new File(this.appInstance.getCacheDir(), "http"), SIZE_OF_CACHE);

            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpClient.httpLoggingInterceptor);
            if (null == cookieManager || null == cookieJar) {
                cookieManager = new CookieManager(new PersistentCookieStore
                        (this.appInstance.getApplicationContext()), CookiePolicy.ACCEPT_ALL);
                cookieJar = new JavaNetCookieJar(cookieManager);
            }
            OkHttpClient.Builder builder = new OkHttpClient.Builder()
                    .cookieJar(cookieJar)
                    .addNetworkInterceptor(logging)
                    //.sslSocketFactory(sslSocketFactory)
                    .retryOnConnectionFailure(true)
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .hostnameVerifier((hostname, session) -> true);

            if (interceptorMap != null) {
                for (Map.Entry<String, List<Interceptor>> entry : interceptorMap.entrySet())
                    for (Interceptor interceptor : entry.getValue())
                        if ("network".equalsIgnoreCase(entry.getKey()))
                            builder.addNetworkInterceptor(interceptor);
                        else
                            builder.addInterceptor(interceptor);

            }

            if(null != headerList) {
                builder.addInterceptor(chain -> {
                    Request original = chain.request();

                    Request.Builder builder1 = original.newBuilder();


                    for (Map.Entry<String, String> entry : headerList.entrySet())
                        builder1.header(entry.getKey(), entry.getValue());

                    return chain.proceed(builder1.build());
                });
            }

            return enableTls12OnPreLollipop(builder).build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private HttpLoggingInterceptor.Level getLogLevel() {
       /* if (BuildConfig.DEBUG || "pre_release".equalsIgnoreCase(BuildConfig.BUILD_TYPE))
            return HttpLoggingInterceptor.Level.BODY;*/
        return HttpLoggingInterceptor.Level.NONE;
    }

    public Object initializeRestClient(Class<?> apiServiceClass) {

        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new ItemTypeAdapterFactory())
                .setLenient()
                .create();
        if (okHttpClient == null)
            okHttpClient = getUnsafeOkHttpClient();

        Retrofit.Builder retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(new NullOnEmptyConverterFactory())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(CoroutineCallAdapterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create());

        Retrofit restBuilder = retrofit.build();
        this.apiService = restBuilder.create(apiServiceClass);
        return this.apiService;
    }

    public Object getHttpService() {
        return this.apiService;
    }

    public void clearCookies() {
        if (cookieManager != null) {
            cookieManager.getCookieStore().removeAll();
        }
    }


    public void clearCache() {
        try {
            okHttpClient.cache().evictAll();
        } catch (Exception e) {
            //CodeReuseUtility.handledExceptionLogging(e);
        }
    }


    private class NullOnEmptyConverterFactory extends Converter.Factory {
        @Override
        public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
            final Converter<ResponseBody, ?> delegate = retrofit.nextResponseBodyConverter(this, type, annotations);
            return body -> {
                if (body.contentLength() == 0) return null;
                return delegate.convert(body);
            };
        }
    }
}

