package com.sdk.application.webhook

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface WebhookApiList {
    
    
    @POST 
    suspend fun saveClickEvent(@Url url1: String?   ,@Body body: ClickEventRequest)
    : Response<ClickEventResponse>
    
}