package com.sdk.universal.billing

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.universal.*

interface BillingApiList {
    
    
    @GET 
    suspend fun getStandardPlans(@Url url1: String?    ,  @Query("platform_type") platformType: String)
    : Response<DetailList>
    
    
    @GET 
    suspend fun getPlanDetails(@Url url1: String?    )
    : Response<PlanDetails>
    
}
