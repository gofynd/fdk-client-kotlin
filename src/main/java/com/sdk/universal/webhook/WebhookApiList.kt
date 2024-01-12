package com.sdk.universal.webhook

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.universal.*

interface WebhookApiList {
    
    
    @GET 
    suspend fun fetchAllWebhookEvents(@Url url1: String?   )
    : Response<EventConfigResponse>
    
    
    @POST 
    suspend fun queryWebhookEventDetails(@Url url1: String?   ,@Body body: ArrayList<EventConfigBase>)
    : Response<EventConfigResponse>
    
    
    @GET 
    suspend fun notifyDepricatedEvent(@Url url1: String?   )
    : Response<EventNotifier>
    
    
    @POST 
    suspend fun testHandlerTransformation(@Url url1: String?   ,@Body body: TransformEventRequest)
    : Response<TransformEventResponse>
    
    
    @POST 
    suspend fun validateSchema(@Url url1: String?   ,@Body body: ValidateSchemaRequest)
    : Response<ValidateSchemaResponse>
    
}
