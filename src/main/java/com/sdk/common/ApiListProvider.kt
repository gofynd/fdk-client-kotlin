package com.sdk.common

import com.sdk.application.ApiList
import com.sdk.application.SDK
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor

object ApiListProvider{
    fun getApiList(): ApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(SDK.application!!)

        val authCredentials = Credentials.basic("slingshotapptoken", "slingsh0t@ppt0ken#fynd")
        val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(SDK.application!!)
        val requestSignerInterceptor = RequestSignerInterceptor()

        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            SDK.application, SDK.domain,
            headerList, interceptorMap, "uniket"
        )
        val cookieManager = retrofitHttpClient.cookieManager
        val okHttpClient = retrofitHttpClient.okHttpClient
        val apiService = retrofitHttpClient.initializeRestClient(ApiList::class.java) as ApiList
        return apiService
    }
}