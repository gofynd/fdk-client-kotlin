package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




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
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
}
}