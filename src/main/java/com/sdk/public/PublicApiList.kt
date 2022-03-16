package com.sdk.public

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url


interface ConfigurationApiList {
    
    
    @GET 
    fun getLocations(@Url url1: String?    ,   @Query("location_type") locationType: String?, @Query("id") id: String?)
    : Deferred<Response<Locations>>
    
}

interface WebhookApiList {
    
    
    @GET 
    fun fetchAllWebhookEvents(@Url url1: String?   )
    : Deferred<Response<EventConfigResponse>>
    
    
    @POST 
    fun queryWebhookEventDetails(@Url url1: String?   ,@Body body: ArrayList<EventConfigBase>)
    : Deferred<Response<EventConfigResponse>>
    
}

