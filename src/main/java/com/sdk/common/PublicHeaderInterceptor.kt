package com.sdk.common

import com.sdk.public.PublicConfig
import okhttp3.Interceptor
import okhttp3.Response

class PublicHeaderInterceptor(
    val publicConfig: PublicConfig? = null
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        
        val builder = original.newBuilder()
            .header("x-fp-sdk-version", "0.1.15")
	publicConfig?.extraHeaders?.let {
                for ((key, value) in it) {
                    builder.header(key,value)
            	}
            }
        val request = builder.build()
        return chain.proceed(request)
    }
}
