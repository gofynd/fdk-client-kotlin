package com.sdk.universal.apis.inventory

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.universal.*
import com.sdk.universal.models.inventory.*

interface InventoryApiList {
    
    
    @GET 
    fun getJobCodesMetrics(@Url url1: String?    ,   @Query("daily_job") dailyJob: Boolean?, @Query("job_code") jobCode: String?)
    : Deferred<Response<ResponseEnvelopeObject>>
    
    
    @POST 
    fun saveJobCodesMetrics(@Url url1: String?   ,@Body body: EmailJobMetrics)
    : Deferred<Response<ResponseEnvelopeEmailJobMetrics>>
    
    
    @GET 
    fun getConfigByApiKey(@Url url1: String?    ,  @Query("apikey") apikey: String)
    : Deferred<Response<ResponseEnvelopeSlingshotConfigurationDetail>>
    
    
    @GET 
    fun getApiKey(@Url url1: String?    ,   @Query("user_name") userName: String, @Query("password") password: String)
    : Deferred<Response<ResponseEnvelopeApikeyModel>>
    
    
    @GET 
    fun getJobByCode(@Url url1: String?    )
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>
    
    
    @GET 
    fun getJobConfigByIntegrationType(@Url url1: String?    ,   @Query("integration_type") integrationType: String, @Query("disable") disable: Boolean?)
    : Deferred<Response<ResponseEnvelopeListJobConfigDTO>>
    
}
