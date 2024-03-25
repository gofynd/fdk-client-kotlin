package com.sdk.platform.communication

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface CommunicationApiList {
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions")
    suspend fun getEventSubscriptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("populate") populate: String?)
    : Response<EventSubscriptions>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions")
    suspend fun createEventSubscriptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SubscriptionsObject)
    : Response<EventSubscriptionsBulkUpdateResponse>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/trigger-job")
    suspend fun triggerCampaignJob(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: TriggerJobRequest)
    : Response<TriggerJobResponse>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    suspend fun getEmailProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?)
    : Response<EmailProviders>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    suspend fun createEmailProvider(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EmailProviderReq)
    : Response<EmailProvider>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    suspend fun getEmailProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<EmailProvider>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    suspend fun updateEmailProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EmailProviderReq)
    : Response<EmailProvider>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    suspend fun deleteEmailProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<BasicDelete>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/app-provider/global-providers")
    suspend fun getGlobalProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GlobalProviders>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasource/dummy-data-source-meta")
    suspend fun getDummyDatasourcesMeta(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: Int)
    : Response<DummyDatasourcesMeta>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasource/dummy-data-sources")
    suspend fun getDummyDatasources(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ArrayList<DummyDatasources>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/default-providers")
    suspend fun getDefaultSmsProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ArrayList<DefaultSmsProviders>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    suspend fun getAudiences(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?)
    : Response<Audiences>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    suspend fun createAudience(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AudienceReq)
    : Response<Audience>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    suspend fun getAudienceById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<Audience>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    suspend fun updateAudienceById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: AudienceReq)
    : Response<Audience>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    suspend fun deleteAudienceById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: AudienceReq)
    : Response<BasicDelete>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/app-provider/update-provider")
    suspend fun updateAppProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppProviderReq)
    : Response<AppProvider>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/app-provider/get-provider")
    suspend fun getAppProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<AppProvider>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/system-templates")
    suspend fun getSystemEmailTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ArrayList<SystemEmailTemplate>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/subscribedTemplates")
    suspend fun getSubscribedEmailTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("query") query: String?)
    : Response<SubscribedEmailTemplates>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/system-templates")
    suspend fun getSystemSmsTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ArrayList<SystemSmsTemplates>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    suspend fun getSmsTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?)
    : Response<SmsTemplates>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    suspend fun createSmsTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SmsTemplateReq)
    : Response<SmsTemplate>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/jobs")
    suspend fun getJobs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?)
    : Response<Jobs>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/jobs")
    suspend fun createJobs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateJobsReq)
    : Response<CreateJobsRes>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/logs")
    suspend fun getJobLogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?)
    : Response<JobLogs>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    suspend fun getSmsProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?)
    : Response<SmsProviders>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    suspend fun createSmsProvider(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SmsProviderReq)
    : Response<SmsProvider>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    suspend fun getSmsProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<SmsProvider>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    suspend fun updateSmsProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SmsProviderReq)
    : Response<SmsProvider>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    suspend fun deleteSmsProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<BasicDelete>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    suspend fun getEmailTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?)
    : Response<EmailTemplates>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    suspend fun createEmailTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EmailTemplateReq)
    : Response<EmailTemplate>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    suspend fun getEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<EmailTemplate>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    suspend fun updateEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EmailTemplateReq)
    : Response<EmailTemplate>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    suspend fun deleteEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<BasicDelete>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    suspend fun getSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<SmsTemplate>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    suspend fun updateSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SmsTemplateReq)
    : Response<SmsTemplate>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    suspend fun deleteSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<BasicDelete>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    suspend fun getCampaigns(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("query") query: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?)
    : Response<Campaigns>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    suspend fun createCampaign(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CampaignReq)
    : Response<Campaign>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    suspend fun getCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<Campaign>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    suspend fun updateCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CampaignReq)
    : Response<Campaign>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/get-stats/{id}")
    suspend fun getStatsOfCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<GetStats>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/bulkUpdate")
    suspend fun createEventSubscriptionsByBulk(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EventSubscriptionsBulkUpdateRequest)
    : Response<ArrayList<EventSubscriptionsBulkUpdateResponse>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/notification/system-notifications/")
    suspend fun getSystemNotifications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?)
    : Response<SystemNotifications>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/subscribedTemplates")
    suspend fun getSubscribedSmsTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("query") query: String?)
    : Response<SubscribedSmsTemplates>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/global-variables")
    suspend fun getGlobalVariables(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GlobalVariablesGetResponse>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/global-variables")
    suspend fun postGlobalVariables(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GlobalVariablesReq)
    : Response<GlobalVariablesPostResponse>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/send-otp-comms")
    suspend fun sendOtp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("ci") ci: Boolean?,@Body body: SendOtpCommsReq)
    : Response<SendOtpCommsRes>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/verify-otp-comms")
    suspend fun verfiyOtp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: VerifyOtpCommsReq)
    : Response<VerifyOtpCommsSuccessRes>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/otp-configuration")
    suspend fun getOtpConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<OtpConfiguration>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/otp-configuration")
    suspend fun updateOtpConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<OtpConfiguration>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/log")
    suspend fun getCommunicationLogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: HashMap<String,Any>?)
    : Response<Logs>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/{id}")
    suspend fun getEventSubscriptionsById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("populate") populate: String?, @Path("id") id: String)
    : Response<EventSubscription>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/{id}")
    suspend fun editEventSubscriptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SubscriptionsObjectRequest)
    : Response<EventSubscriptionsBulkUpdateResponse>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/{id}")
    suspend fun deleteEventSubscriptionsById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<EventSubscription>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/get-n-records")
    suspend fun getNSampleRecordsFromCsvByGet(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("count") count: Int?, @Query("header") header: Boolean?, @Query("url") url: String?)
    : Response<GetNRecordsCsvRes>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/get-n-records")
    suspend fun getNSampleRecordsFromCsv(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetNRecordsCsvReq)
    : Response<GetNRecordsCsvRes>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-instant")
    suspend fun sendCommunicationSynchronously(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EngineRequest)
    : Response<SendInstantResponse>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-async")
    suspend fun sendCommunicationAsynchronously(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EngineRequest)
    : Response<EngineResponse>
    
}