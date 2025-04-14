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
    suspend fun catalogueOrder(@Url url1: String?   ,@Body body: CatalogueOrderCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<CatalogueOrderDetails>
    
    
    @GET
    suspend fun getUserPointsHistory(@Url url1: String?    ,   @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PointsHistoryDetails>
    
    
    @GET
    suspend fun getUserPoints(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<PointsDetails>
    
    
    @GET
    suspend fun getUserReferralDetails(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<ReferralDetails>
    
    
    @POST
    suspend fun getOrderDiscount(@Url url1: String?   ,@Body body: RetrieveOrderDiscount, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderDiscountDetails>
    
    
    @POST
    suspend fun redeemReferralCode(@Url url1: String?   ,@Body body: RedeemReferralCode, @HeaderMap headers: Map<String, String>? = null)
    : Response<RedeemReferralCodeDetails>
    
}
