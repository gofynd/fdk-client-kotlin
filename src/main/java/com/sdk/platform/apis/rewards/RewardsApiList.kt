package com.sdk.platform.apis.rewards

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.rewards.*

interface RewardsApiList {
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    fun showGiveaways(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String, @Query("page_size") pageSize: Int)
    : Deferred<Response<GiveawayResponse>>
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    fun saveGiveAway(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Giveaway)
    : Deferred<Response<Giveaway>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    fun getGiveawayById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<Giveaway>>
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    fun updateGiveAway(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: Giveaway)
    : Deferred<Response<Giveaway>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/:id/audience/{audience_id}/status")
    fun getGiveawayAudienceStatus(@Path("id") id: String, @Path("audience_id") audienceId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GiveawayAudience>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/")
    fun showOffers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ArrayList<Offer>>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    fun getOfferByName(@Path("name") name: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<Offer>>
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    fun updateOfferByName(@Path("name") name: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Offer)
    : Deferred<Response<Offer>>
    
    @PATCH ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    fun updateUserStatus(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppUser)
    : Deferred<Response<AppUser>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    fun getUserDetails(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<UserRes>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/points/history/")
    fun getUserPointsHistory(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<HistoryRes>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/configuration/")
    fun getRewardsConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ConfigurationRes>>
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/configuration/")
    fun setRewardsConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ConfigurationRequest)
    : Deferred<Response<SetConfigurationRes>>
    
}