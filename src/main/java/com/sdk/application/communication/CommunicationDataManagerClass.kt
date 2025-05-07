package com.sdk.application.communication

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
            
                    _relativeUrls["getCommunicationConsent"] = "/service/application/communication/v1.0/consent".substring(1)
            
                    _relativeUrls["upsertCommunicationConsent"] = "/service/application/communication/v1.0/consent".substring(1)
            
                    _relativeUrls["getCurrentCommunicationConsent"] = "/service/application/communication/v1.0/current/communication/consent".substring(1)
            
                    _relativeUrls["upsertCurrentCommunicationConsent"] = "/service/application/communication/v1.0/current/communication/consent".substring(1)
            
                    _relativeUrls["getOtpConfiguration"] = "/service/application/communication/v1.0/otp/otp-configuration".substring(1)
            
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
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationCommunication",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(CommunicationApiList::class.java) as? CommunicationApiList
    }
    
    suspend fun getCommunicationConsent( headers: Map<String, String> = emptyMap()): Response<CommunicationConsent>? {
        var fullUrl : String? = _relativeUrls["getCommunicationConsent"]
        
        return communicationApiList?.getCommunicationConsent(fullUrl, headers = headers)}

    
    
    suspend fun upsertCommunicationConsent(body: CommunicationConsentReq, headers: Map<String, String> = emptyMap()): Response<CommunicationConsentRes>? {
        var fullUrl : String? = _relativeUrls["upsertCommunicationConsent"]
        
        return communicationApiList?.upsertCommunicationConsent(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getCurrentCommunicationConsent( headers: Map<String, String> = emptyMap()): Response<CommunicationConsent>? {
        var fullUrl : String? = _relativeUrls["getCurrentCommunicationConsent"]
        
        return communicationApiList?.getCurrentCommunicationConsent(fullUrl, headers = headers)}

    
    
    suspend fun upsertCurrentCommunicationConsent(body: CommunicationConsentReq, headers: Map<String, String> = emptyMap()): Response<CommunicationConsentRes>? {
        var fullUrl : String? = _relativeUrls["upsertCurrentCommunicationConsent"]
        
        return communicationApiList?.upsertCurrentCommunicationConsent(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getOtpConfiguration( headers: Map<String, String> = emptyMap()): Response<OtpConfiguration>? {
        var fullUrl : String? = _relativeUrls["getOtpConfiguration"]
        
        return communicationApiList?.getOtpConfiguration(fullUrl, headers = headers)}

    
    
}
