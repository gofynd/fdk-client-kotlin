package com.sdk.application.apis.rewards

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.rewards.*

interface RewardsApiList {
    
    
    @POST 
    fun getPointsOnProduct(@Url url1: String?   ,@Body body: CatalogueOrderRequest)
    : Deferred<Response<CatalogueOrderResponse>>
    
    
    @GET 
    fun getOfferByName(@Url url1: String?    )
    : Deferred<Response<Offer>>
    
    
    @POST 
    fun getOrderDiscount(@Url url1: String?   ,@Body body: OrderDiscountRequest)
    : Deferred<Response<OrderDiscountResponse>>
    
    
    @GET 
    fun getUserPoints(@Url url1: String?   )
    : Deferred<Response<PointsResponse>>
    
    
    @GET 
    fun getUserPointsHistory(@Url url1: String?    ,   @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<PointsHistoryResponse>>
    
    
    @GET 
    fun getUserReferralDetails(@Url url1: String?   )
    : Deferred<Response<ReferralDetailsResponse>>
    
    
    @POST 
    fun redeemReferralCode(@Url url1: String?   ,@Body body: RedeemReferralCodeRequest)
    : Deferred<Response<RedeemReferralCodeResponse>>
    
}