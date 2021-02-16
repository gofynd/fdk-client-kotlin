package com.sdk.common

import android.app.Application
import okhttp3.Headers
import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor(val app: Application) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response = chain.run {
        val original = chain.request()
        val headers = Headers.Builder()
        val originalHeaders = original.headers()
        headers.addAll(originalHeaders)
        val networkHeaders = NetworkUtils.interceptHeaders(app)
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