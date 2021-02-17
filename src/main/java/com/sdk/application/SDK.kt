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
    private var retrofitHttpClient: RetrofitHttpClient? = null

    
    lateinit var catalogRetrofitApiList : CatalogApiList
    
    lateinit var leadRetrofitApiList : LeadApiList
    
    lateinit var shareRetrofitApiList : ShareApiList
    

    fun init(domain: String = "https://api.fynd.com", application: Application): SDK {
        this.domain = domain
        this.application = application
        initializeHttpClient(application)
        return this
    }

    fun setApplicationCredentials(applicationId: String, applicationToken: String) {
        this.applicationId = applicationId
        this.applicationToken = applicationToken
    }

    private fun initializeHttpClient(app: Application) {
        if (retrofitHttpClient == null) {
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
        retrofitHttpClient = HttpClient.initialize(
            app, domain,
            headerList, interceptorMap, "uniket"
        )
    }
    initializeApiList()
}

fun initializeApiList(){

    catalogRetrofitApiList = retrofitHttpClient?.initializeRestClient(CatalogApiList::class.java) as CatalogApiList
    
    leadRetrofitApiList = retrofitHttpClient?.initializeRestClient(LeadApiList::class.java) as LeadApiList
    
    shareRetrofitApiList = retrofitHttpClient?.initializeRestClient(ShareApiList::class.java) as ShareApiList
    
}

fun getCookiesManager(): CookieManager? {
    return retrofitHttpClient?.cookieManager
}

fun getRetrofitHttpClient(): RetrofitHttpClient? {
    return retrofitHttpClient
}

}