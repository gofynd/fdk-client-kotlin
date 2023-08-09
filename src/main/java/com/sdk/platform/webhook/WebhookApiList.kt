package com.sdk.platform.webhook

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface WebhookApiList {
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    suspend fun getSubscribersByCompany(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("company_id") companyId: String, @Query("extension_id") extensionId: String?)
    : Response<SubscriberResponse>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    suspend fun registerSubscriberToEvent(@Path("company_id") companyId: String,@Body body: SubscriberConfig)
    : Response<SubscriberConfig>
    
    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    suspend fun updateSubscriberConfig(@Path("company_id") companyId: String,@Body body: SubscriberConfig)
    : Response<SubscriberConfig>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber")
    suspend fun getSubscribersByExtensionId(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("company_id") companyId: String, @Path("extension_id") extensionId: String)
    : Response<SubscriberConfigList>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    suspend fun getSubscriberById(@Path("company_id") companyId: String, @Path("subscriber_id") subscriberId: String)
    : Response<SubscriberResponse>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    suspend fun fetchAllEventConfigurations(@Path("company_id") companyId: String)
    : Response<EventConfigResponse>
    
}