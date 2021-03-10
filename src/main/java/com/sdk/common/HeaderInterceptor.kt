package com.sdk.common

import com.sdk.application.ApplicationConfig
import com.sdk.platform.PlatformConfig
import okhttp3.Headers
import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor(
    private val applicationConfig: ApplicationConfig? = null
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response = chain.run {
        val original = chain.request()
        val headers = Headers.Builder()
        val originalHeaders = original.headers()
        headers.addAll(originalHeaders)
        val networkHeaders = NetworkUtils.interceptHeaders(applicationConfig)
        for ((key, value) in networkHeaders)
            headers.add(key, value)
        proceed(
            if (!original.url().toString().contains("/search-application")) {
                request()
                    .newBuilder()
                    .headers(headers.build())
                    .build()
            } else {
                original
            }
        )
    }
}