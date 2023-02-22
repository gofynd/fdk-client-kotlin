package com.sdk.platform.apis.webhook

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.webhook.*

interface WebhookApiList {
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    fun getSubscribersByCompany(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("company_id") companyId: String, @Query("extension_id") extensionId: String?)
    : Deferred<Response<SubscriberResponse>>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    fun registerSubscriberToEvent(@Path("company_id") companyId: String,@Body body: SubscriberConfig)
    : Deferred<Response<SubscriberConfig>>
    
    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    fun updateSubscriberConfig(@Path("company_id") companyId: String,@Body body: SubscriberConfig)
    : Deferred<Response<SubscriberConfig>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber")
    fun getSubscribersByExtensionId(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("company_id") companyId: String, @Path("extension_id") extensionId: String)
    : Deferred<Response<SubscriberConfigList>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    fun getSubscriberById(@Path("company_id") companyId: String, @Path("subscriber_id") subscriberId: String)
    : Deferred<Response<SubscriberResponse>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    fun fetchAllEventConfigurations(@Path("company_id") companyId: String)
    : Deferred<Response<EventConfigResponse>>
    
}