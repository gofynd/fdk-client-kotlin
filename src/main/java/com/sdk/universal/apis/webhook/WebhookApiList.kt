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
    fun fetchAllWebhookEvents(@Url url1: String?   )
    : Deferred<Response<EventConfigResponse>>
    
    
    @POST 
    fun queryWebhookEventDetails(@Url url1: String?   ,@Body body: ArrayList<EventConfigBase>)
    : Deferred<Response<EventConfigResponse>>
    
}
