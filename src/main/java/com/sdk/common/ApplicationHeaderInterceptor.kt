package com.sdk.common

import android.util.Base64
import com.sdk.application.ApplicationConfig
import okhttp3.Interceptor
import okhttp3.Response

class ApplicationHeaderInterceptor(
    private val applicationConfig: ApplicationConfig? = null
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val builder = original.newBuilder()
        builder.apply {
            header("User-Agent", applicationConfig?.userAgent ?: "")
            val applicationId = applicationConfig?.applicationId ?: ""
            val applicationToken = applicationConfig?.applicationToken ?: ""
            val languageCode = applicationConfig?.languageCode ?: "en-IN"
            val currencyCode = applicationConfig?.currencyCode ?: "INR"

            header("x-application-id", applicationId)
            header("x-application-token", applicationToken)
            header("Accept-Language", languageCode)
            header("x-currency-code", currencyCode)
            
            val bearerToken =
                Base64.encodeToString(
                    "$applicationId:$applicationToken".toByteArray(),
                    Base64.NO_WRAP
                )
            header("Authorization", "Bearer $bearerToken")
        }
        val request = builder.build()
        return chain.proceed(request)
    }
}