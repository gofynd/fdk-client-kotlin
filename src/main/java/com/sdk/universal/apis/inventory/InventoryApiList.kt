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
    suspend fun getJobCodesMetrics(@Url url1: String?    ,   @Query("daily_job") dailyJob: Boolean?, @Query("job_code") jobCode: String?)
    : Response<ResponseEnvelopeObject>
    
    
    @POST 
    suspend fun saveJobCodesMetrics(@Url url1: String?   ,@Body body: EmailJobMetrics)
    : Response<ResponseEnvelopeEmailJobMetrics>
    
    
    @GET 
    suspend fun getConfigByApiKey(@Url url1: String?    ,  @Query("apikey") apikey: String)
    : Response<ResponseEnvelopeSlingshotConfigurationDetail>
    
    
    @GET 
    suspend fun getApiKey(@Url url1: String?    ,   @Query("user_name") userName: String, @Query("password") password: String)
    : Response<ResponseEnvelopeApikeyModel>
    
    
    @GET 
    suspend fun getJobByCode(@Url url1: String?    )
    : Response<ResponseEnvelopeJobConfigDTO>
    
    
    @GET 
    suspend fun getJobConfigByIntegrationType(@Url url1: String?    ,   @Query("integration_type") integrationType: String, @Query("disable") disable: Boolean?)
    : Response<ResponseEnvelopeListJobConfigDTO>
    
}
