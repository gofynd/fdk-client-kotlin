package com.sdk.application.apis.rewards

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.rewards.*

interface RewardsApiList {
    
    
    @GET 
    suspend fun getOfferByName(@Url url1: String?    )
    : Response<Offer>
    
    
    @POST 
    suspend fun catalogueOrder(@Url url1: String?   ,@Body body: CatalogueOrderRequest)
    : Response<CatalogueOrderResponse>
    
    
    @GET 
    suspend fun getUserPointsHistory(@Url url1: String?    ,   @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Response<PointsHistoryResponse>
    
    
    @GET 
    suspend fun getUserPoints(@Url url1: String?   )
    : Response<PointsResponse>
    
    
    @GET 
    suspend fun getUserReferralDetails(@Url url1: String?   )
    : Response<ReferralDetailsResponse>
    
    
    @POST 
    suspend fun getOrderDiscount(@Url url1: String?   ,@Body body: OrderDiscountRequest)
    : Response<OrderDiscountResponse>
    
    
    @POST 
    suspend fun redeemReferralCode(@Url url1: String?   ,@Body body: RedeemReferralCodeRequest)
    : Response<RedeemReferralCodeResponse>
    
}