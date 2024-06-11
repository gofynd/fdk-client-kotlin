package com.sdk.application.webhook

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class WebhookDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val webhookApiList by lazy {
        generatewebhookApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["saveClickEvent"] = "/service/application/webhook/v1.0/click-analytics/events".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generatewebhookApiList(): WebhookApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
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
            namespace = "ApplicationWebhook",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(WebhookApiList::class.java) as? WebhookApiList
    }
    
    suspend fun saveClickEvent(body: ClickEventRequest): Response<ClickEventResponse>? {
        var fullUrl : String? = _relativeUrls["saveClickEvent"] 
        
        return webhookApiList?.saveClickEvent(fullUrl  ,body = body)}

    
    
}
