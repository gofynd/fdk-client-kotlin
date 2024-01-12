package com.sdk.common

import com.sdk.platform.PlatformConfig
import okhttp3.Interceptor
import okhttp3.Response

class AccessTokenInterceptor(
    val platformConfig: PlatformConfig? = null
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        
        val builder = original.newBuilder().apply {
            header("User-Agent", platformConfig?.userAgent ?: "")
            header("Authorization", "Bearer ${platformConfig?.oauthClient?.token?.token}")
            header("x-fp-sdk-version", "1.4.0-beta.2")
            header("x-currency-code", platformConfig?.currencyCode ?: "INR")
            platformConfig?.locationDetail?.let {
                header("x-location-detail", HttpClient.gson.toJson(it))
            }
            platformConfig?.extraHeaders?.let {
                for ((key, value) in it) {
                    header(key, value)
                }
            }
        }
        val request = builder.build()
        return chain.proceed(request)
    }
}
