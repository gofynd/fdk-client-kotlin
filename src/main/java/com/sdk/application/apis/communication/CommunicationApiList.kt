package com.sdk.application.apis.communication

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.communication.*

interface CommunicationApiList {
    
    
    @GET 
    fun getCommunicationConsent(@Url url1: String?   )
    : Deferred<Response<CommunicationConsent>>
    
    
    @POST 
    fun upsertCommunicationConsent(@Url url1: String?   ,@Body body: CommunicationConsentReq)
    : Deferred<Response<CommunicationConsentRes>>
    
    
    @POST 
    fun upsertAppPushtoken(@Url url1: String?   ,@Body body: PushtokenReq)
    : Deferred<Response<PushtokenRes>>
    
}