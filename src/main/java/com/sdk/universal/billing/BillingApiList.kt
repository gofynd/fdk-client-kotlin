package com.sdk.universal.billing

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.universal.*

interface BillingApiList {
    
    
    @GET
    suspend fun getStandardPlans(@Url url1: String?    ,  @Query("platform") platform: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<DetailList>
    
    
    @GET
    suspend fun getPlanDetails(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<PlanDetails>
    
    
    @GET
    suspend fun planList(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<PlanList>>
    
    
    @GET
    suspend fun getTenureConfig(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<TenureConfigResponse>
    
}
