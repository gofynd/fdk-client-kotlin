package com.sdk.common
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import kotlin.jvm.Throws

class AuthenticationInterceptor(private val authToken: String) : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val builder = original.newBuilder()
                .header("Authorization", authToken)
        val request = builder.build()
        if (original.url().toString().contains("/search-application")) {
            return chain.proceed(request)
        } else {
            return chain.proceed(original)
        }
    }
}