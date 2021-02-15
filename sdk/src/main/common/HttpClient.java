package common;

import android.app.Application;

import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.logging.HttpLoggingInterceptor;

public class HttpClient {

    private static Map<String, RetrofitHttpClient> clientMap = new HashMap<>();

    static CookieManager cookieManager;

    static CookieJar cookieJar;
    static HttpLoggingInterceptor.Level httpLoggingInterceptor = HttpLoggingInterceptor.Level.NONE;

    public static void setHttpLoggingInterceptor(HttpLoggingInterceptor.Level httpLoggingInterceptor) {
        HttpClient.httpLoggingInterceptor = httpLoggingInterceptor;
    }

    public static RetrofitHttpClient initialize
            (Application app, String baseUrl, Map<String, String> headers,
             Map<String, List<Interceptor>> interceptorList, String namespace) {
        if (null == cookieManager) {
            cookieManager = new CookieManager(new PersistentCookieStore
                    (app.getApplicationContext()), CookiePolicy.ACCEPT_ALL);
            cookieJar = new JavaNetCookieJar(cookieManager);
        }

        if (null == clientMap.get(namespace)) {
            RetrofitHttpClient retrofitHttpClient = new RetrofitHttpClient(app, baseUrl,
                    headers, interceptorList, cookieJar, cookieManager);

            clientMap.put(namespace, retrofitHttpClient);
        }
        return clientMap.get(namespace);
    }
}
