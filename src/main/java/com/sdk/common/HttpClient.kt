package com.sdk.common

import okhttp3.CookieJar
import okhttp3.Interceptor
import okhttp3.JavaNetCookieJar
import okhttp3.logging.HttpLoggingInterceptor
import java.net.CookieManager
import java.net.CookiePolicy
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
        baseUrl: String, headers: Map<String, String>,
        interceptorList: Map<String, List<Interceptor>>, namespace: String
    ): RetrofitHttpClient? {
        if (null == cookieManager) {
            cookieManager = CookieManager(PersistentCookieStore(), CookiePolicy.ACCEPT_ALL)
            cookieJar = JavaNetCookieJar(cookieManager)
        }
        if (null == clientMap[namespace]) {
            val retrofitHttpClient = RetrofitHttpClient(
                baseUrl,
                headers, interceptorList, cookieJar, cookieManager
            )
            clientMap[namespace] = retrofitHttpClient
        }
        return clientMap[namespace]
    }
}