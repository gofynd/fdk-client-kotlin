package com.sdk.platform.webhook

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface WebhookApiList {
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/retry")
    suspend fun manualRetryOfFailedEvent(@Path("company_id") companyId: String,@Body body: EventProcessRequest)
    : Response<EventProcessedSuccessResponse>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/retry/events/counts")
    suspend fun getEventCounts(@Path("company_id") companyId: String,@Body body: EventProcessRequest)
    : Response<FailedEventsCountSuccessResponse>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/retry/status")
    suspend fun getManualRetryStatus(@Path("company_id") companyId: String)
    : Response<RetryStatusResponse>
    
    @DELETE ("/service/platform/webhook/v1.0/company/{company_id}/retry/cancel")
    suspend fun manualRetryCancel(@Path("company_id") companyId: String)
    : Response<EventSuccessResponse>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/event_processed")
    suspend fun getDeliveryReports(@Path("company_id") companyId: String,@Body body: EventProcessRequest)
    : Response<EventProcessReports>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/download")
    suspend fun downloadDeliveryReport(@Path("company_id") companyId: String,@Body body: EventProcessRequest)
    : Response<HashMap<String,Any>>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/ping")
    suspend fun pingWebhook(@Path("company_id") companyId: String,@Body body: PingWebhook)
    : Response<PingWebhookResponse>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    suspend fun fetchAllEventConfigurations(@Path("company_id") companyId: String)
    : Response<EventConfigResponse>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/filters")
    suspend fun getReportFilters(@Path("company_id") companyId: String,@Body body: ReportFiltersPayload)
    : Response<ReportFilterResponse>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/history")
    suspend fun getHistoricalReports(@Path("company_id") companyId: String,@Body body: HistoryPayload)
    : Response<HistoryResponse>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/reports/cancel/file/{filename}")
    suspend fun cancelJobByName(@Path("company_id") companyId: String, @Path("filename") filename: String)
    : Response<CancelResponse>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    suspend fun getSubscribersByCompany(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("extension_id") extensionId: Int?, @Path("company_id") companyId: String)
    : Response<SubscriberResponse>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    suspend fun registerSubscriberToEvent(@Path("company_id") companyId: String,@Body body: SubscriberConfig)
    : Response<SubscriberConfig>
    
    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    suspend fun updateSubscriberConfig(@Path("company_id") companyId: String,@Body body: SubscriberConfig)
    : Response<SubscriberConfig>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    suspend fun getSubscriberById(@Path("company_id") companyId: String, @Path("subscriber_id") subscriberId: String)
    : Response<SubscriberResponse>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber")
    suspend fun getSubscribersByExtensionId(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("company_id") companyId: String, @Path("extension_id") extensionId: String)
    : Response<SubscriberConfigList>
    
}