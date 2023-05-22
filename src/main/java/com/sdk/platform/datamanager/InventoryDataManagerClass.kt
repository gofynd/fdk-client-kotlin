package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.inventory.*
import com.sdk.platform.apis.inventory.*




class InventoryDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
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
            namespace = "PlatformInventory",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey,
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
    
    
    suspend fun suppressStores(body: SuppressStorePayload)
    : Deferred<Response<ResponseEnvelopeKafkaResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.suppressStores(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getConfigByCompany()
    : Deferred<Response<ResponseEnvelopeListSlingshotConfigurationDetail>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getConfigByCompany(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobSteps(jobId: String)
    : Deferred<Response<ResponseEnvelopeListJobStepsDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobSteps(
        companyId = config.companyId, jobId = jobId )
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
    
    
    suspend fun disable(integrationId: String)
    : Deferred<Response<ResponseEnvelopeString>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.disable(
        companyId = config.companyId, integrationId = integrationId )
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
    
    
    suspend fun getJobCodeMetrics(code: String, pageNo: Int?=null, pageSize: Int?=null, status: String?=null, date: String?=null)
    : Deferred<Response<ResponseEnvelopeJobMetricsDto>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobCodeMetrics(
        companyId = config.companyId, code = code, pageNo = pageNo, pageSize = pageSize, status = status, date = date )
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