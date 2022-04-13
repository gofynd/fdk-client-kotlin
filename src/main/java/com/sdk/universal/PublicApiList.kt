package com.sdk.universal

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url


interface ConfigurationApiList {
    
    
    @GET 
    fun searchApplication(@Url url1: String?    ,  @Header("authorization") authorization: String?,  @Query("query") query: String?)
    : Deferred<Response<ApplicationResponse>>
    
    
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

interface InventoryApiList {
    
    
    @GET 
    fun getJobByCode(@Url url1: String?    )
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>
    
    
    @GET 
    fun getJobConfigByIntegrationType(@Url url1: String?    ,   @Query("integration_type") integrationType: String, @Query("disable") disable: Boolean?)
    : Deferred<Response<ResponseEnvelopeListJobConfigDTO>>
    
    
    @GET 
    fun getJobCodesMetrics(@Url url1: String?    ,   @Query("daily_job") dailyJob: Boolean?, @Query("job_code") jobCode: String?)
    : Deferred<Response<ResponseEnvelopeObject>>
    
    
    @POST 
    fun saveJobCodesMetrics(@Url url1: String?   ,@Body body: EmailJobMetrics)
    : Deferred<Response<ResponseEnvelopeEmailJobMetrics>>
    
}


