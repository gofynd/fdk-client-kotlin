package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class OrderInvoiceEngineDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val orderInvoiceEngineApiList by lazy {
        generateorderInvoiceEngineApiList()
    }
    
    private fun generateorderInvoiceEngineApiList(): OrderInvoiceEngineApiList? {
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
            namespace = "PlatformOrderInvoiceEngine",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(OrderInvoiceEngineApiList::class.java) as? OrderInvoiceEngineApiList
    }
    
    
    suspend fun generateBulkPackageLabel(body: GenerateBulkPackageLabel)
    : Deferred<Response<SuccessResponseGenerateBulk>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderInvoiceEngineApiList?.generateBulkPackageLabel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun generateBulkBoxLabel(body: GenerateBulkBoxLabel)
    : Deferred<Response<SuccessResponseGenerateBulk>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderInvoiceEngineApiList?.generateBulkBoxLabel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun generateBulkShipmentLabel(body: GenerateBulkShipmentLabel)
    : Deferred<Response<SuccessResponseGenerateBulk>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderInvoiceEngineApiList?.generateBulkShipmentLabel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getLabelStatus(uid: String)
    : Deferred<Response<StatusSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderInvoiceEngineApiList?.getLabelStatus(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun getLabelPresignedURL(uid: String)
    : Deferred<Response<SignedSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderInvoiceEngineApiList?.getLabelPresignedURL(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
}
}