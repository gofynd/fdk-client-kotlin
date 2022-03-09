package com.sdk.common

import com.sdk.platform.PlatformConfig
import okhttp3.Interceptor
import okhttp3.Response

class AccessTokenInterceptor(
    val platformConfig: PlatformConfig? = null
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        
        val builder = original.newBuilder()
            .header("Authorization", "Bearer ${platformConfig?.oauthClient?.token?.token}")
            .header("x-fp-sdk-version", "0.1.14")
	platformConfig?.extraHeaders?.let {
                for ((key, value) in it) {
                    builder.header(key,value)
            	}
            }
        val request = builder.build()
        return chain.proceed(request)
    }
}
