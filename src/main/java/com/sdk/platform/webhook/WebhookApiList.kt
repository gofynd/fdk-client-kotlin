package com.sdk.platform.webhook

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface WebhookApiList {
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/download")
    suspend fun downloadDeliveryReport(@Path("company_id") companyId: String,@Body body: EventProcessRequest)
    : Response<DownloadReportResponse>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/ping")
    suspend fun pingWebhook(@Path("company_id") companyId: String,@Body body: PingWebhook)
    : Response<PingWebhookResponse>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/filters")
    suspend fun getReportFilters(@Path("company_id") companyId: String,@Body body: ReportFiltersPayload)
    : Response<ArrayList<ReportFilterResponse>>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/history")
    suspend fun getHistoricalReports(@Path("company_id") companyId: String,@Body body: HistoryPayload)
    : Response<HistoryResponse>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/reports/cancel/file/{filename}")
    suspend fun cancelJobByName(@Path("company_id") companyId: String, @Path("filename") filename: String)
    : Response<CancelResponse>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/event_processed")
    suspend fun getDeliveryReports(@Path("company_id") companyId: String,@Body body: EventProcessRequest)
    : Response<EventProcessReports>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    suspend fun fetchAllEventConfigurations(@Path("company_id") companyId: String)
    : Response<EventConfigResponse>
    
    @POST ("/service/platform/webhook/v2.0/company/{company_id}/subscriber/")
    suspend fun registerSubscriberToEventV2(@Path("company_id") companyId: String,@Body body: SubscriberConfigPostRequestV2)
    : Response<SubscriberConfigResponse>
    
    @PUT ("/service/platform/webhook/v2.0/company/{company_id}/subscriber/")
    suspend fun updateSubscriberV2(@Path("company_id") companyId: String,@Body body: SubscriberConfigUpdateRequestV2)
    : Response<SubscriberConfigResponse>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    suspend fun registerSubscriberToEvent(@Path("company_id") companyId: String,@Body body: SubscriberConfigPost)
    : Response<SubscriberConfigResponse>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    suspend fun getSubscribersByCompany(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("extension_id") extensionId: String?)
    : Response<SubscriberConfigList>
    
    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    suspend fun updateSubscriberConfig(@Path("company_id") companyId: String,@Body body: SubscriberConfigUpdate)
    : Response<SubscriberConfigResponse>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    suspend fun getSubscriberById(@Path("company_id") companyId: String, @Path("subscriber_id") subscriberId: String)
    : Response<SubscriberResponse>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber/")
    suspend fun getSubscribersByExtensionId(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("company_id") companyId: String, @Path("extension_id") extensionId: String)
    : Response<SubscriberConfigList>
    
}