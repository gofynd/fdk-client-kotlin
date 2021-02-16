package com.sdk.application

import android.app.Application
import com.fynd.sdk.R
import com.sdk.common.*
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.net.CookieManager

object SDK {

    var applicationId: String? = null
    var applicationToken: String? = null
    var domain: String = "https://api.fynd.com"
    var application: Application? = null
    private var cookieManager: CookieManager? = null
    private var okHttpClient: OkHttpClient? = null

    fun init(domain: String = "https://api.fynd.com", application: Application): SDK {
        this.domain = domain
        this.application = application
        return this
    }

    fun setApplicationCredentials(applicationId: String, applicationToken: String) {
        this.applicationId = applicationId
        this.applicationToken = applicationToken
    }

    fun getApiList(app: Application): ApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(app)

        val authCredentials = Credentials.basic(
            app.getString(R.string.auth_user_name),
            app.getString(R.string.auth_user_password)
        )
        val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(app)
        val requestSignerInterceptor = RequestSignerInterceptor()

        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            app, domain,
            headerList, interceptorMap, "uniket"
        )
        cookieManager = retrofitHttpClient.cookieManager
        okHttpClient = retrofitHttpClient.okHttpClient
        return retrofitHttpClient.initializeRestClient(ApiList::class.java) as ApiList
    }

    fun getCookiesManager(): CookieManager? {
        return cookieManager
    }

    fun getOkHttpsClient(): OkHttpClient? {
        return okHttpClient
    }

}