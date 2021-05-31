package com.sdk.common

import android.os.Build
import android.util.Log
import com.google.gson.GsonBuilder
import com.moczul.ok2curl.CurlInterceptor
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.sdk.common.HttpClient.getHttpLoggingInterceptor
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Type
import java.net.CookieManager
import java.net.CookiePolicy
import java.net.CookieStore
import java.security.KeyStore
import java.security.cert.X509Certificate
import java.util.*
import java.util.concurrent.TimeUnit
import javax.net.ssl.*


class RetrofitHttpClient constructor(
    private val baseUrl: String,
    private val headerList: Map<String, String>? = null,
    var interceptorMap: Map<String, List<Interceptor>>? = null,
    private var cookieJar: CookieJar?,
    var cookieManager: CookieManager?,
    val persistentCookieStore: CookieStore? = null
) {

    var apiService: Any? = null

    var okHttpClient: OkHttpClient?

    init {
        okHttpClient = unsafeOkHttpClient
    }

    // Create a trust manager that does not validate certificate chains
    private val unsafeOkHttpClient: OkHttpClient
        //            // Install the all-trusting trust manager
//            final SSLContext sslContext = SSLContext.getInstance("SSL");
//            sslContext.init(null, trustAllCerts
//
//            , new java.security.SecureRandom());
//            // Create an ssl socket factory with our all-trusting manager
//            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
        //cache = new Cache(new File(this.appInstance.getCacheDir(), "http"), SIZE_OF_CACHE);
        get() = try {
            // Create a trust manager that does not validate certificate chains
            val trustAllCerts = arrayOf<TrustManager>(
                object : X509TrustManager {
                    override fun checkClientTrusted(
                        chain: Array<X509Certificate>,
                        authType: String
                    ) {
                    }

                    override fun checkServerTrusted(
                        chain: Array<X509Certificate>,
                        authType: String
                    ) {
                    }

                    override fun getAcceptedIssuers(): Array<X509Certificate> {
                        return arrayOf()
                    }
                }
            )

            //            // Install the all-trusting trust manager
            //            final SSLContext sslContext = SSLContext.getInstance("SSL");
            //            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            //            // Create an ssl socket factory with our all-trusting manager
            //            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
            var cache: Cache
            val SIZE_OF_CACHE = 10 * 1024 * 1024.toLong()
            //cache = new Cache(new File(this.appInstance.getCacheDir(), "http"), SIZE_OF_CACHE);
            val logging = HttpLoggingInterceptor()
            logging.level = getHttpLoggingInterceptor()
            if ((null == cookieManager || null == cookieJar) && persistentCookieStore != null) {
                cookieManager = CookieManager(persistentCookieStore, CookiePolicy.ACCEPT_ALL)
                cookieJar = JavaNetCookieJar(cookieManager)
            }

            val okHttpClient = BaseOkhttpClient.okHttpClient

            val builder = okHttpClient.newBuilder()

            cookieJar?.let {
                builder.cookieJar(it)
            }

            builder
                .addNetworkInterceptor(logging) //.sslSocketFactory(sslSocketFactory)
                .retryOnConnectionFailure(true)
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .hostnameVerifier { hostname: String?, session: SSLSession? -> true }
            if (interceptorMap != null) {
                for ((key, value) in interceptorMap!!) for (interceptor in value) if ("network".equals(
                        key, ignoreCase = true
                    )
                ) builder.addNetworkInterceptor(interceptor) else builder.addInterceptor(interceptor)
            }
            builder.addInterceptor(CurlInterceptor { message -> Log.v("Ok2Curl", message ?: "") })
            if (null != headerList) {
                builder.addInterceptor { chain: Interceptor.Chain ->
                    val original = chain.request()
                    val builder1 = original.newBuilder()
                    for ((key, value) in headerList) builder1.header(
                        key,
                        value
                    )
                    chain.proceed(builder1.build())
                }
            }
            enableTls12OnPreLollipop(builder).build()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    /* if (BuildConfig.DEBUG || "pre_release".equalsIgnoreCase(BuildConfig.BUILD_TYPE))
            return HttpLoggingInterceptor.Level.BODY;*/
    private val logLevel: HttpLoggingInterceptor.Level
        get() =/* if (BuildConfig.DEBUG || "pre_release".equalsIgnoreCase(BuildConfig.BUILD_TYPE))
                return HttpLoggingInterceptor.Level.BODY;*/
            HttpLoggingInterceptor.Level.NONE

    fun initializeRestClient(apiServiceClass: Class<*>?): Any? {
        val gson = GsonBuilder()
            .registerTypeAdapterFactory(ItemTypeAdapterFactory())
            .setLenient()
            .create()
        if (okHttpClient == null) okHttpClient = unsafeOkHttpClient
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(NullOnEmptyConverterFactory())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        val restBuilder = retrofit.build()
        apiService = restBuilder.create(apiServiceClass)
        return apiService
    }

    fun clearCookies() {
        if (cookieManager != null) {
            cookieManager!!.cookieStore.removeAll()
        }
    }

    fun clearCache() {
        try {
            okHttpClient!!.cache()!!.evictAll()
        } catch (e: Exception) {
            //CodeReuseUtility.handledExceptionLogging(e);
        }
    }

    private inner class NullOnEmptyConverterFactory : Converter.Factory() {
        override fun responseBodyConverter(
            type: Type,
            annotations: Array<Annotation>,
            retrofit: Retrofit
        ): Converter<ResponseBody, *> {
            val delegate: Converter<ResponseBody, *> =
                retrofit.nextResponseBodyConverter<Any>(this, type, annotations)
            return Converter { body: ResponseBody ->
                if (body.contentLength() == 0L) return@Converter null
                delegate.convert(body)
            }
        }
    }

    companion object {
        private fun enableTls12OnPreLollipop(client: OkHttpClient.Builder): OkHttpClient.Builder {
            try {
                val trustManagerFactory = TrustManagerFactory.getInstance(
                    TrustManagerFactory.getDefaultAlgorithm()
                )
                trustManagerFactory.init(null as KeyStore?)
                val trustManagers = trustManagerFactory.trustManagers
                check(!(trustManagers.size != 1 || trustManagers[0] !is X509TrustManager)) {
                    ("Unexpected default trust managers:"
                            + Arrays.toString(trustManagers))
                }
                val trustManager = trustManagers[0] as X509TrustManager
                val sslContext = SSLContext.getInstance("TLSv1.2")
                sslContext.init(null, arrayOf<TrustManager>(trustManager), null)
                try {
                    //client.sslSocketFactory(new Tls12SocketFactory(sslContext.getSocketFactory()), trustManager);
                    client.sslSocketFactory(sslContext.socketFactory, trustManager)
                    val cs = ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                        .tlsVersions(TlsVersion.TLS_1_2)
                        .build()
                    val specs: MutableList<ConnectionSpec> = ArrayList()
                    specs.add(cs)
                    specs.add(ConnectionSpec.COMPATIBLE_TLS)
                    specs.add(ConnectionSpec.CLEARTEXT)
                    client.connectionSpecs(specs)
                } catch (exc: Exception) {
                    Log.e("OkHttpTLSCompat", "Error while setting TLS 1.2", exc)
                }

                if (Build.VERSION.SDK_INT < 22) {
                    try {
                        client.sslSocketFactory(sslContext.socketFactory, trustManager)
                        val cs = ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                            .tlsVersions(TlsVersion.TLS_1_2)
                            .build()
                        val specs: MutableList<ConnectionSpec> = ArrayList()
                        specs.add(cs)
                        specs.add(ConnectionSpec.COMPATIBLE_TLS)
                        specs.add(ConnectionSpec.CLEARTEXT)
                        client.connectionSpecs(specs)
                    } catch (exc: java.lang.Exception) {
                        Log.e("OkHttpTLSCompat", "Error while setting TLS 1.2", exc)
                    }
                } else {
                    // client.sslSocketFactory(new Tls12SocketFactory(sslContext.getSocketFactory()), trustManager);
                    client.sslSocketFactory(Tls12SocketFactory(), trustManager)
                }

            } catch (exc: Exception) {
                Log.e("OkHttpTLSCompat", "Error while setting TLS 1.2", exc)
            }
            return client
        }
    }

}