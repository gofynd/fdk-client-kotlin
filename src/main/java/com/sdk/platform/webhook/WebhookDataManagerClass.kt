package com.sdk.platform.webhook

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




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
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(WebhookApiList::class.java) as? WebhookApiList
    }
    
    
    suspend fun fetchAllEventConfigurations( headers: Map<String, String> = emptyMap())
    : Response<EventConfigResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.fetchAllEventConfigurations(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun registerSubscriberToEventV2(body: SubscriberConfigPostRequestV2, headers: Map<String, String> = emptyMap())
    : Response<SubscriberConfigResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.registerSubscriberToEventV2(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSubscriberV2(body: SubscriberConfigUpdateRequestV2, headers: Map<String, String> = emptyMap())
    : Response<SubscriberConfigResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.updateSubscriberV2(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun registerSubscriberToEvent(body: SubscriberConfigPost, headers: Map<String, String> = emptyMap())
    : Response<SubscriberConfigResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.registerSubscriberToEvent(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSubscribersByCompany(pageNo: Int?=null,pageSize: Int?=null,extensionId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SubscriberConfigList>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getSubscribersByCompany(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,extensionId = extensionId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSubscriberConfig(body: SubscriberConfigUpdate, headers: Map<String, String> = emptyMap())
    : Response<SubscriberConfigResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.updateSubscriberConfig(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun upsertSubscriberEvent(body: UpsertSubscriberConfig, headers: Map<String, String> = emptyMap())
    : Response<UpsertSubscriberConfigResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.upsertSubscriberEvent(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSubscriberById(subscriberId: String, headers: Map<String, String> = emptyMap())
    : Response<SubscriberDetails>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getSubscriberById(
        companyId = config.companyId,subscriberId = subscriberId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSubscribersByExtensionId(pageNo: Int?=null,pageSize: Int?=null,extensionId: String, headers: Map<String, String> = emptyMap())
    : Response<SubscriberConfigList>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getSubscribersByExtensionId(
        pageNo = pageNo,pageSize = pageSize,companyId = config.companyId,extensionId = extensionId, headers = headers)
        } else {
            null
        }
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
}
}