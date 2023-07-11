package com.sdk.universal.apis.webhook

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.universal.*
import com.sdk.universal.models.webhook.*

interface WebhookApiList {
    
    
    @GET 
    suspend fun fetchAllWebhookEvents(@Url url1: String?   )
    : Response<EventConfigResponse>
    
    
    @POST 
    suspend fun queryWebhookEventDetails(@Url url1: String?   ,@Body body: ArrayList<EventConfigBase>)
    : Response<EventConfigResponse>
    
}
