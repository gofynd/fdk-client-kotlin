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
    fun getJobConfigByIntegrationType(@Url url1: String?    ,   @Query("integration_type") integrationType: String, @Query("disable") disable: Boolean?)
    : Deferred<Response<ResponseEnvelopeListJobConfigDTO>>
    
    
    @GET 
    fun getJobCodesMetrics(@Url url1: String?    ,   @Query("daily_job") dailyJob: Boolean?, @Query("job_code") jobCode: String?)
    : Deferred<Response<ResponseEnvelopeObject>>
    
    
    @POST 
    fun saveJobCodesMetrics(@Url url1: String?   ,@Body body: EmailJobMetrics)
    : Deferred<Response<ResponseEnvelopeEmailJobMetrics>>
    
}
