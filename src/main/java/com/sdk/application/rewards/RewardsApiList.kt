package com.sdk.application.rewards

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface RewardsApiList {
    
    
    @GET
    suspend fun getOfferByName(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<Offer>
    
    
    @POST
    suspend fun catalogueOrder(@Url url1: String?   ,@Body body: CatalogueOrderRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CatalogueOrderResponse>
    
    
    @GET
    suspend fun getUserPointsHistory(@Url url1: String?    ,   @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PointsHistoryResponse>
    
    
    @GET
    suspend fun getUserPoints(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<PointsResponse>
    
    
    @GET
    suspend fun getUserReferralDetails(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<ReferralDetailsResponse>
    
    
    @POST
    suspend fun getOrderDiscount(@Url url1: String?   ,@Body body: OrderDiscountRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderDiscountResponse>
    
    
    @POST
    suspend fun redeemReferralCode(@Url url1: String?   ,@Body body: RedeemReferralCodeRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<RedeemReferralCodeResponse>
    
}
