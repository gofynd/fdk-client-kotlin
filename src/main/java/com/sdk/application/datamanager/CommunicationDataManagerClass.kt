package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class CommunicationDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val communicationApiList by lazy {
        generatecommunicationApiList()
    }

    private fun generatecommunicationApiList(): CommunicationApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
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
        return communicationApiList?.getCommunicationConsent()}

    
    
    fun upsertCommunicationConsent(body: CommunicationConsentReq): Deferred<Response<CommunicationConsentRes>>? {
        return communicationApiList?.upsertCommunicationConsent(body = body)}

    
    
    fun upsertAppPushtoken(body: PushtokenReq): Deferred<Response<PushtokenRes>>? {
        return communicationApiList?.upsertAppPushtoken(body = body)}

    
    
}
