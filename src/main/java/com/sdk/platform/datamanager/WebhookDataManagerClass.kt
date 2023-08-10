package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.webhook.*
import com.sdk.platform.apis.webhook.*




class WebhookDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val webhookApiList by lazy {
        generatewebhookApiList()
    }
    
    private fun generatewebhookApiList(): WebhookApiList? {
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
            namespace = "PlatformWebhook",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(WebhookApiList::class.java) as? WebhookApiList
    }
    
    
    suspend fun manualRetryOfFailedEvent(body: EventProcessRequest)
    : Deferred<Response<EventProcessedSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.manualRetryOfFailedEvent(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getEventCounts(body: EventProcessRequest)
    : Deferred<Response<FailedEventsCountSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getEventCounts(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getManualRetryStatus()
    : Deferred<Response<RetryStatusResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getManualRetryStatus(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun manualRetryCancel()
    : Deferred<Response<EventSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.manualRetryCancel(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getDeliveryReports(body: EventProcessRequest)
    : Deferred<Response<EventProcessReports>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getDeliveryReports(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun downloadDeliveryReport(body: EventProcessRequest)
    : Deferred<Response<HashMap<String,Any>>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.downloadDeliveryReport(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun pingWebhook(body: PingWebhook)
    : Deferred<Response<PingWebhookResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.pingWebhook(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun fetchAllEventConfigurations()
    : Deferred<Response<EventConfigResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.fetchAllEventConfigurations(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getReportFilters(body: ReportFiltersPayload)
    : Deferred<Response<ReportFilterResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getReportFilters(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getHistoricalReports(body: HistoryPayload)
    : Deferred<Response<HistoryResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getHistoricalReports(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun cancelJobByName(filename: String)
    : Deferred<Response<CancelResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.cancelJobByName(
        companyId = config.companyId, filename = filename )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscribersByCompany(pageNo: Int?=null, pageSize: Int?=null, extensionId: Int?=null)
    : Deferred<Response<SubscriberResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getSubscribersByCompany(
        pageNo = pageNo, pageSize = pageSize, extensionId = extensionId, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun registerSubscriberToEvent(body: SubscriberConfig)
    : Deferred<Response<SubscriberConfig>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.registerSubscriberToEvent(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateSubscriberConfig(body: SubscriberConfig)
    : Deferred<Response<SubscriberConfig>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.updateSubscriberConfig(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriberById(subscriberId: String)
    : Deferred<Response<SubscriberResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getSubscriberById(
        companyId = config.companyId, subscriberId = subscriberId )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscribersByExtensionId(pageNo: Int?=null, pageSize: Int?=null, extensionId: String)
    : Deferred<Response<SubscriberConfigList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getSubscribersByExtensionId(
        pageNo = pageNo, pageSize = pageSize, companyId = config.companyId, extensionId = extensionId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}