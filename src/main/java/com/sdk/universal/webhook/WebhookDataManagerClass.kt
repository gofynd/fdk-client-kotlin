package com.sdk.universal.webhook

import com.sdk.common.*
import com.sdk.universal.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class WebhookDataManagerClass(val config: PublicConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val webhookApiList by lazy {
        generatewebhookApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["fetchAllWebhookEvents"] = "/service/common/webhook/v1.0/events".substring(1)
            
                    _relativeUrls["queryWebhookEventDetails"] = "/service/common/webhook/v1.0/events/query-event-details".substring(1)
            
                    _relativeUrls["notifyDepricatedEvent"] = "/service/common/webhook/v1.0/events/depricated-event-notifier".substring(1)
            
                    _relativeUrls["testHandlerTransformation"] = "/service/common/webhook/v1.0/events/transform-event".substring(1)
            
                    _relativeUrls["validateSchema"] = "/service/common/webhook/v1.0/events/validate-event-schema".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }


    private fun generatewebhookApiList(): WebhookApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = PublicHeaderInterceptor(config)
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
            namespace = "PublicWebhook",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(WebhookApiList::class.java) as? WebhookApiList
    }
    
    suspend fun fetchAllWebhookEvents( headers: Map<String, String> = emptyMap()): Response<EventDetails>? {
        var fullUrl : String? = _relativeUrls["fetchAllWebhookEvents"]
        
        return webhookApiList?.fetchAllWebhookEvents(fullUrl, headers = headers)}

    
    
    suspend fun queryWebhookEventDetails(body: ArrayList<EventConfigBase>, headers: Map<String, String> = emptyMap()): Response<EventDetails>? {
        var fullUrl : String? = _relativeUrls["queryWebhookEventDetails"]
        
        return webhookApiList?.queryWebhookEventDetails(fullUrl, body = body,headers = headers)}

    
    
    suspend fun notifyDepricatedEvent( headers: Map<String, String> = emptyMap()): Response<EventNotifier>? {
        var fullUrl : String? = _relativeUrls["notifyDepricatedEvent"]
        
        return webhookApiList?.notifyDepricatedEvent(fullUrl, headers = headers)}

    
    
    suspend fun testHandlerTransformation(body: TransformEventPayload, headers: Map<String, String> = emptyMap()): Response<TransformEventResult>? {
        var fullUrl : String? = _relativeUrls["testHandlerTransformation"]
        
        return webhookApiList?.testHandlerTransformation(fullUrl, body = body,headers = headers)}

    
    
    suspend fun validateSchema(body: ValidateSchemaPayload, headers: Map<String, String> = emptyMap()): Response<ValidateSchemaResult>? {
        var fullUrl : String? = _relativeUrls["validateSchema"]
        
        return webhookApiList?.validateSchema(fullUrl, body = body,headers = headers)}

    
    
}
