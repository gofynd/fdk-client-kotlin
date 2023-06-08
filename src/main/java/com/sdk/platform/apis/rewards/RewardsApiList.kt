package com.sdk.platform.apis.rewards

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.rewards.*

interface RewardsApiList {
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/")
    fun getGiveaways(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GiveawayResponse>>
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/")
    fun createGiveaway(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Giveaway)
    : Deferred<Response<Giveaway>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}/")
    fun getGiveawayByID(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<Giveaway>>
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}/")
    fun updateGiveaway(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: Giveaway)
    : Deferred<Response<Giveaway>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/")
    fun getOffers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ArrayList<Offer>>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    fun getOfferByName(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Header("cookie") cookie: String, @Path("name") name: String)
    : Deferred<Response<Offer>>
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    fun updateOfferByName(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("name") name: String,@Body body: Offer)
    : Deferred<Response<Offer>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    fun getUserAvailablePoints(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("user_id") userId: String)
    : Deferred<Response<UserRes>>
    
    @PATCH ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    fun updateUserStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("user_id") userId: String,@Body body: AppUser)
    : Deferred<Response<AppUser>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/points/history/")
    fun getUserPointsHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("user_id") userId: String, @Query("page_id") pageId: String?, @Query("page_limit") pageLimit: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<HistoryRes>>
    
}