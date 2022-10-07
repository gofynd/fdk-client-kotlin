package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class FinanceDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val financeApiList by lazy {
        generatefinanceApiList()
    }
    
    private fun generatefinanceApiList(): FinanceApiList? {
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
            namespace = "PlatformFinance",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(FinanceApiList::class.java) as? FinanceApiList
    }
    
    
    suspend fun companyId(body: GenerateReportRequest)
    : Deferred<Response<GenerateReportJson>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.companyId(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun companyId(body: DownloadReport)
    : Deferred<Response<DownloadReportList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.companyId(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun companyId(body: GetEngineRequest)
    : Deferred<Response<GetEngineResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.companyId(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun companyId(body: GetReasonRequest)
    : Deferred<Response<GetReasonResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.companyId(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun companyId(body: GetReportListRequest)
    : Deferred<Response<GetEngineResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.companyId(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
}
}