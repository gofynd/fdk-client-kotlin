package com.sdk.platform.apis.webhook

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.webhook.*

interface WebhookApiList {
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/retry")
    fun manualRetryOfFailedEvent(@Path("company_id") companyId: String,@Body body: EventProcessRequest)
    : Deferred<Response<EventProcessedSuccessResponse>>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/retry/events/counts")
    fun getEventCounts(@Path("company_id") companyId: String,@Body body: EventProcessRequest)
    : Deferred<Response<FailedEventsCountSuccessResponse>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/retry/status")
    fun getManualRetryStatus(@Path("company_id") companyId: String)
    : Deferred<Response<RetryStatusResponse>>
    
    @DELETE ("/service/platform/webhook/v1.0/company/{company_id}/retry/cancel")
    fun manualRetryCancel(@Path("company_id") companyId: String)
    : Deferred<Response<EventSuccessResponse>>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/event_processed")
    fun getDeliveryReports(@Path("company_id") companyId: String,@Body body: EventProcessRequest)
    : Deferred<Response<EventProcessReports>>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/download")
    fun downloadDeliveryReport(@Path("company_id") companyId: String,@Body body: EventProcessRequest)
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/ping")
    fun pingWebhook(@Path("company_id") companyId: String,@Body body: PingWebhook)
    : Deferred<Response<PingWebhookResponse>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    fun fetchAllEventConfigurations(@Path("company_id") companyId: String)
    : Deferred<Response<EventConfigResponse>>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/filters")
    fun getReportFilters(@Path("company_id") companyId: String,@Body body: ReportFiltersPayload)
    : Deferred<Response<ReportFilterResponse>>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/history")
    fun getHistoricalReports(@Path("company_id") companyId: String,@Body body: HistoryPayload)
    : Deferred<Response<HistoryResponse>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/reports/cancel/file/{filename}")
    fun cancelJobByName(@Path("company_id") companyId: String, @Path("filename") filename: String)
    : Deferred<Response<CancelResponse>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    fun getSubscribersByCompany(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("extension_id") extensionId: Int?, @Path("company_id") companyId: String)
    : Deferred<Response<SubscriberResponse>>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    fun registerSubscriberToEvent(@Path("company_id") companyId: String,@Body body: SubscriberConfig)
    : Deferred<Response<SubscriberConfig>>
    
    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    fun updateSubscriberConfig(@Path("company_id") companyId: String,@Body body: SubscriberConfig)
    : Deferred<Response<SubscriberConfig>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    fun getSubscriberById(@Path("company_id") companyId: String, @Path("subscriber_id") subscriberId: String)
    : Deferred<Response<SubscriberResponse>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber")
    fun getSubscribersByExtensionId(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("company_id") companyId: String, @Path("extension_id") extensionId: String)
    : Deferred<Response<SubscriberConfigList>>
    
}