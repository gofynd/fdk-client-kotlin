package com.sdk.application.communication

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface CommunicationApiList {
    
    
    @GET 
    suspend fun getCommunicationConsent(@Url url1: String?   )
    : Response<CommunicationConsent>
    
    
    @POST 
    suspend fun upsertCommunicationConsent(@Url url1: String?   ,@Body body: CommunicationConsentReq)
    : Response<CommunicationConsentRes>
    
    
    @POST 
    suspend fun upsertAppPushtoken(@Url url1: String?   ,@Body body: PushtokenReq)
    : Response<PushtokenRes>
    
}