package com.sdk.common

import okhttp3.Interceptor
import okhttp3.Response

class RequestSignerInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = RequestSigner(chain.request()).sign()
            return chain.proceed(request)
    }
}