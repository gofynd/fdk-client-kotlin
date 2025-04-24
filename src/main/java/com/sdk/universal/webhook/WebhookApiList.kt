package com.sdk.universal.webhook

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.universal.*

interface WebhookApiList {
    
    
    @GET
    suspend fun fetchAllWebhookEvents(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<EventDetails>
    
    
    @POST
    suspend fun queryWebhookEventDetails(@Url url1: String?   ,@Body body: ArrayList<EventConfigBase>, @HeaderMap headers: Map<String, String>? = null)
    : Response<EventDetails>
    
    
    @GET
    suspend fun notifyDepricatedEvent(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<EventNotifier>
    
    
    @POST
    suspend fun testHandlerTransformation(@Url url1: String?   ,@Body body: TransformEventPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<TransformEventResult>
    
    
    @POST
    suspend fun validateSchema(@Url url1: String?   ,@Body body: ValidateSchemaPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateSchemaResult>
    
}
