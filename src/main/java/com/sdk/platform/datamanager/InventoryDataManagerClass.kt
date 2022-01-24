package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class InventoryDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val inventoryApiList by lazy {
        generateinventoryApiList()
    }
    
    private fun generateinventoryApiList(): InventoryApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformInventory",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(InventoryApiList::class.java) as? InventoryApiList
    }
    
    
    suspend fun getJobsByCompany(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigRawDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobsByCompany(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun updateJob(body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.updateJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createJob(body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.createJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getJobByCompanyAndIntegration(integrationId: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobByCompanyAndIntegration(
        companyId = config.companyId, integrationId = integrationId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobConfigDefaults()
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobConfigDefaults(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobByCode(code: String)
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobByCode(
        companyId = config.companyId, code = code )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobCodeMetrics(code: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeJobMetricsDto>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobCodeMetrics(
        companyId = config.companyId, code = code, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobCodesByCompanyAndIntegration(integrationId: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigListDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobCodesByCompanyAndIntegration(
        companyId = config.companyId, integrationId = integrationId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
}
}