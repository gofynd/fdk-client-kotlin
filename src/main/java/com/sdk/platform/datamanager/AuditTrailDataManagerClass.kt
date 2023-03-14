package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.audittrail.*
import com.sdk.platform.apis.audittrail.*




class AuditTrailDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val auditTrailApiList by lazy {
        generateauditTrailApiList()
    }
    
    private fun generateauditTrailApiList(): AuditTrailApiList? {
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
            namespace = "PlatformAuditTrail",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(AuditTrailApiList::class.java) as? AuditTrailApiList
    }
    
    
    suspend fun getAuditLogs(qs: String)
    : Deferred<Response<LogSchemaResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            auditTrailApiList?.getAuditLogs(
        companyId = config.companyId, qs = qs )
        } else {
            null
        } 
    }
    
    
    suspend fun createAuditLog(body: RequestBodyAuditLog)
    : Deferred<Response<CreateLogResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            auditTrailApiList?.createAuditLog(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getAuditLog(id: String)
    : Deferred<Response<LogSchemaResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            auditTrailApiList?.getAuditLog(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun getEntityTypes()
    : Deferred<Response<EntityTypesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            auditTrailApiList?.getEntityTypes(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
}
}