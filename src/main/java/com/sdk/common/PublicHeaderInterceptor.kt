package com.sdk.common

import com.sdk.universal.PublicConfig
import okhttp3.Interceptor
import okhttp3.Response

class PublicHeaderInterceptor(
    val publicConfig: PublicConfig? = null
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        
        val builder = original.newBuilder()
            .header("x-fp-sdk-version", "3.14.0")
	publicConfig?.extraHeaders?.let {
                for ((key, value) in it) {
                    if (!original.headers.names().contains(key)) {
                        builder.header(key,value)
                    }
            	}
            }
        val request = builder.build()
        return chain.proceed(request)
    }
}
