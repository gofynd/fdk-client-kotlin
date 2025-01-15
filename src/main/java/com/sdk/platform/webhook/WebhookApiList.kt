package com.sdk.platform.webhook

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface WebhookApiList {
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    suspend fun fetchAllEventConfigurations(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EventConfigResult>
    
    @POST ("/service/platform/webhook/v2.0/company/{company_id}/subscriber/")
    suspend fun registerSubscriberToEventV2(@Path("company_id") companyId: String,@Body body: SubscriberConfigPostRequestV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriberConfigResult>
    
    @PUT ("/service/platform/webhook/v2.0/company/{company_id}/subscriber/")
    suspend fun updateSubscriberV2(@Path("company_id") companyId: String,@Body body: SubscriberConfigUpdateRequestV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriberConfigResult>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    suspend fun registerSubscriberToEvent(@Path("company_id") companyId: String,@Body body: SubscriberConfigPost, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriberConfigResult>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    suspend fun getSubscribersByCompany(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("extension_id") extensionId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriberConfigList>
    
    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    suspend fun updateSubscriberConfig(@Path("company_id") companyId: String,@Body body: SubscriberConfigUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriberConfigResult>
    
    @PUT ("/service/platform/webhook/v3.0/company/{company_id}/subscriber/")
    suspend fun upsertSubscriberEvent(@Path("company_id") companyId: String,@Body body: UpsertSubscriberConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpsertSubscriberConfigResult>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    suspend fun getSubscriberById(@Path("company_id") companyId: String, @Path("subscriber_id") subscriberId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriberDetails>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber/")
    suspend fun getSubscribersByExtensionId(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriberConfigList>
    
}
