package com.sdk.common

import okhttp3.CookieJar
import okhttp3.Interceptor
import okhttp3.JavaNetCookieJar
import okhttp3.logging.HttpLoggingInterceptor
import java.net.CookieManager
import java.net.CookiePolicy
import java.net.CookieStore
import java.util.*

object HttpClient {
    private val clientMap: MutableMap<String, RetrofitHttpClient?> = HashMap()
    var cookieManager: CookieManager? = null
    var cookieJar: CookieJar? = null
    var httpsLoggingInterceptor = HttpLoggingInterceptor.Level.NONE
    fun setHttpLoggingInterceptor(httpLoggingInterceptor: HttpLoggingInterceptor.Level) {
        this.httpsLoggingInterceptor = httpLoggingInterceptor
    }

    fun getHttpLoggingInterceptor(): HttpLoggingInterceptor.Level {
        return httpsLoggingInterceptor
    }

    fun initialize(
        baseUrl: String,
        headers: Map<String, String>? = null,
        interceptorList: Map<String, List<Interceptor>>? = null,
        namespace: String = "client",
        persistentCookieStore: CookieStore? = null
    ): RetrofitHttpClient? {
        if (persistentCookieStore != null) {
            cookieManager = CookieManager(persistentCookieStore, CookiePolicy.ACCEPT_ALL)
            cookieJar = JavaNetCookieJar(cookieManager)
        }
        if (null == clientMap[namespace]) {
            val retrofitHttpClient = RetrofitHttpClient(
                baseUrl,
                headers, interceptorList, cookieJar, cookieManager, persistentCookieStore
            )
            clientMap[namespace] = retrofitHttpClient
        }
        return clientMap[namespace]
    }
}