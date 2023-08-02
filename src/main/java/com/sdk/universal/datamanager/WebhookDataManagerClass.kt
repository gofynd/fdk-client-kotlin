package com.sdk.universal.datamanager

import com.sdk.common.*
import com.sdk.universal.*
import com.sdk.universal.models.webhook.*
import com.sdk.universal.apis.webhook.*
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
    
    fun fetchAllWebhookEvents(): Deferred<Response<EventConfigResponse>>? {
        var fullUrl : String? = _relativeUrls["fetchAllWebhookEvents"] 
        
        return webhookApiList?.fetchAllWebhookEvents(fullUrl  )}

    
    
    fun queryWebhookEventDetails(body: ArrayList<EventConfigBase>): Deferred<Response<EventConfigResponse>>? {
        var fullUrl : String? = _relativeUrls["queryWebhookEventDetails"] 
        
        return webhookApiList?.queryWebhookEventDetails(fullUrl  ,body = body)}

    
    
}
