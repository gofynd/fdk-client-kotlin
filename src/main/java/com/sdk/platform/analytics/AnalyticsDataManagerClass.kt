package com.sdk.platform.analytics

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class AnalyticsDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val analyticsApiList by lazy {
        generateanalyticsApiList()
    }
    
    private fun generateanalyticsApiList(): AnalyticsApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        if(unauthorizedAction != null){
            val accessUnauthorizedInterceptor = AccessUnauthorizedInterceptor(unauthorizedAction)
            interceptorList.add(accessUnauthorizedInterceptor)
        }
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformAnalytics",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(AnalyticsApiList::class.java) as? AnalyticsApiList
    }
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun executeJobForProvidedParametersV2(provider: String, datasource: String, exportType: String,body: JobExecute)
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.executeJobForProvidedParametersV2(companyId = config.companyId , applicationId = applicationId , provider = provider, datasource = datasource, exportType = exportType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun startDownloadForQueryV2(provider: String, datasource: String, exportType: String,body: JobExecute)
    : Response<String>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.startDownloadForQueryV2(companyId = config.companyId , applicationId = applicationId , provider = provider, datasource = datasource, exportType = exportType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun checkJobStatusByNameV2(provider: String, exportType: String, fileName: String)
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.checkJobStatusByNameV2(companyId = config.companyId , applicationId = applicationId , provider = provider, exportType = exportType, fileName = fileName )
        } else {
            null
        }
    }
    
}
}