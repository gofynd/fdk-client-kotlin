package com.sdk.common

import okhttp3.Interceptor
import okhttp3.Response


class AccessUnauthorizedInterceptor(val unauthorizedAction: (url: String, responseCode: Int) -> Unit) :
    Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        if (response.code == 401) {
            unauthorizedAction(chain.request().url.toString(), 401)
        }
        return response
    }
}