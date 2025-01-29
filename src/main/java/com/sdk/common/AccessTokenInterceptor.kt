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
            if (!original.headers.names().contains("User-Agent")) {
                header("User-Agent", platformConfig?.userAgent ?: "")
            }

            if (!original.headers.names().contains("Authorization")) {
                header("Authorization", "Bearer ${platformConfig?.oauthClient?.token?.token}")
            }

            if (!original.headers.names().contains("x-fp-sdk-version")) {
                header("x-fp-sdk-version", "3.1.0-beta.1")
            }

            if (!original.headers.names().contains("x-currency-code")) {
                header("x-currency-code", platformConfig?.currencyCode ?: "INR")
            }

            platformConfig?.locationDetail?.let {
                if (!original.headers.names().contains("x-location-detail")) {
                    header("x-location-detail", HttpClient.gson.toJson(it))
                }
            }
            platformConfig?.extraHeaders?.let {
                for ((key, value) in it) {
                    if (!original.headers.names().contains(key)) {
                        header(key, value)
                    }
                }
            }
        }
        val request = builder.build()
        return chain.proceed(request)
    }
}
