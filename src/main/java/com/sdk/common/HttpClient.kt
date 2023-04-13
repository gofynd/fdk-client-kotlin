package com.sdk.common

import com.google.gson.Gson
import com.google.gson.GsonBuilder
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
    private var currentDomainUrl = ""
    val gson: Gson by lazy { getGsonInstance() }

    private fun getGsonInstance(): Gson {
        return GsonBuilder()
            .registerTypeAdapterFactory(IgnoreJsonParsingExceptionsTypeAdapterFactory())
            .setLenient()
            .create()
    }

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
        persistentCookieStore: CookieStore? = null,
        certPublicKey: String? = null
    ): RetrofitHttpClient? {
        if (persistentCookieStore != null) {
            cookieManager = CookieManager(persistentCookieStore, CookiePolicy.ACCEPT_ALL)
            cookieManager?.let {
                cookieJar = JavaNetCookieJar(it)
            }
        }
        if (!currentDomainUrl.equals(baseUrl, ignoreCase = true)) {
            clientMap.clear()
            currentDomainUrl = baseUrl
        }
        if (null == clientMap[namespace]) {
            val retrofitHttpClient = RetrofitHttpClient(
                baseUrl,
                headers, interceptorList, cookieJar, cookieManager, persistentCookieStore, certPublicKey
            )
            clientMap[namespace] = retrofitHttpClient
        }
        return clientMap[namespace]
    }

    fun setDebuggable(debuggable: Boolean) {
        httpsLoggingInterceptor = if (debuggable) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }
    }

    fun reset() {
        clientMap.clear()
    }

}