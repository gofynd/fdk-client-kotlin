package com.sdk.platform.apis.rewards

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.rewards.*

interface RewardsApiList {
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    suspend fun showGiveaways(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String, @Query("page_size") pageSize: Int)
    : Response<GiveawayResponse>
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    suspend fun saveGiveAway(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Giveaway)
    : Response<Giveaway>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    suspend fun getGiveawayById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<Giveaway>
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    suspend fun updateGiveAway(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: Giveaway)
    : Response<Giveaway>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/")
    suspend fun showOffers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ArrayList<Offer>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    suspend fun getOfferByName(@Path("name") name: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<Offer>
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    suspend fun updateOfferByName(@Path("name") name: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Offer)
    : Response<Offer>
    
    @PATCH ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    suspend fun updateUserStatus(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppUser)
    : Response<AppUser>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    suspend fun getUserDetails(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<UserRes>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/points/history/")
    suspend fun getUserPointsHistory(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Response<HistoryRes>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/configuration/")
    suspend fun getRewardsConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ConfigurationRes>
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/configuration/")
    suspend fun setRewardsConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ConfigurationRequest)
    : Response<SetConfigurationRes>
    
}