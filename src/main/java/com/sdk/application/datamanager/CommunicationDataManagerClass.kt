package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class CommunicationDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val communicationApiList by lazy {
        generatecommunicationApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getCommunicationConsent"] = "/service/application/communication/v1.0/consent"?.substring(1)
            
                    _relativeUrls["upsertCommunicationConsent"] = "/service/application/communication/v1.0/consent"?.substring(1)
            
                    _relativeUrls["upsertAppPushtoken"] = "/service/application/communication/v1.0/pn-token"?.substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generatecommunicationApiList(): CommunicationApiList? {
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationCommunication",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CommunicationApiList::class.java) as? CommunicationApiList
    }
    
    fun getCommunicationConsent(): Deferred<Response<CommunicationConsent>>? {
        var fullUrl : String? = _relativeUrls["getCommunicationConsent"] 
        
        return communicationApiList?.getCommunicationConsent(fullUrl  )}

    
    
    fun upsertCommunicationConsent(body: CommunicationConsentReq): Deferred<Response<CommunicationConsentRes>>? {
        var fullUrl : String? = _relativeUrls["upsertCommunicationConsent"] 
        
        return communicationApiList?.upsertCommunicationConsent(fullUrl  ,body = body)}

    
    
    fun upsertAppPushtoken(body: PushtokenReq): Deferred<Response<PushtokenRes>>? {
        var fullUrl : String? = _relativeUrls["upsertAppPushtoken"] 
        
        return communicationApiList?.upsertAppPushtoken(fullUrl  ,body = body)}

    
    
}
