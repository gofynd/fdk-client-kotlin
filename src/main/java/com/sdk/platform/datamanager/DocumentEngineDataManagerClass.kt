package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class DocumentEngineDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val documentEngineApiList by lazy {
        generatedocumentEngineApiList()
    }
    
    private fun generatedocumentEngineApiList(): DocumentEngineApiList? {
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
            namespace = "PlatformDocumentEngine",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(DocumentEngineApiList::class.java) as? DocumentEngineApiList
    }
    
    
    suspend fun generateBulkPackageLabel(body: GenerateBulkPackageLabel)
    : Deferred<Response<SuccessResponseGenerateBulk>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            documentEngineApiList?.generateBulkPackageLabel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun generateBulkBoxLabel(body: GenerateBulkBoxLabel)
    : Deferred<Response<SuccessResponseGenerateBulk>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            documentEngineApiList?.generateBulkBoxLabel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun generateBulkShipmentLabel(body: GenerateBulkShipmentLabel)
    : Deferred<Response<SuccessResponseGenerateBulk>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            documentEngineApiList?.generateBulkShipmentLabel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun generateNoc(body: GenerateNoc)
    : Deferred<Response<SuccessResponseGenerateBulk>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            documentEngineApiList?.generateNoc(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getLabelStatus(uid: String)
    : Deferred<Response<StatusSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            documentEngineApiList?.getLabelStatus(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun getNocStatus(uid: String)
    : Deferred<Response<StatusSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            documentEngineApiList?.getNocStatus(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun getPresignedURL(body: InvoiceLabelPresignedRequestBody)
    : Deferred<Response<SignedSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            documentEngineApiList?.getPresignedURL(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getLabelPresignedURL(uid: String)
    : Deferred<Response<SignedSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            documentEngineApiList?.getLabelPresignedURL(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun getNocPresignedURL(uid: String)
    : Deferred<Response<SignedSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            documentEngineApiList?.getNocPresignedURL(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
}
}