package com.sdk.platform.rewards

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface RewardsApiList {
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    suspend fun showGiveaways(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String, @Query("page_size") pageSize: Int, @HeaderMap headers: Map<String, String>? = null)
    : Response<GiveawayResponse>
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    suspend fun saveGiveAway(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Giveaway, @HeaderMap headers: Map<String, String>? = null)
    : Response<Giveaway>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    suspend fun getGiveawayById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Giveaway>
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    suspend fun updateGiveAway(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: Giveaway, @HeaderMap headers: Map<String, String>? = null)
    : Response<Giveaway>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/")
    suspend fun showOffers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<Offer>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    suspend fun getOfferByName(@Path("name") name: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Offer>
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    suspend fun updateOfferByName(@Path("name") name: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Offer, @HeaderMap headers: Map<String, String>? = null)
    : Response<Offer>
    
    @PATCH ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    suspend fun updateUserStatus(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppUser, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppUser>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    suspend fun getUserDetails(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserRes>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/points/history/")
    suspend fun getUserPointsHistory(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HistoryRes>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/configuration/")
    suspend fun getRewardsConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ConfigurationRes>
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/configuration/")
    suspend fun setRewardsConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ConfigurationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SetConfigurationRes>
    
}
