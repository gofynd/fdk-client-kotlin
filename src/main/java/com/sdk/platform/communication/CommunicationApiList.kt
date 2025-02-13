package com.sdk.platform.communication

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface CommunicationApiList {
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/engine/send-sync")
    suspend fun sendByCompanyCommunicationSynchronously(@Header("x-application-id") xApplicationId: String, @Path("company_id") companyId: String,@Body body: EngineRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendInstantResponse>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-sync")
    suspend fun sendEngineCommunicationSynchronously(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EngineRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendInstantResponse>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/engine/send-async")
    suspend fun senByCompanyCommunicationAsynchronously(@Header("x-application-id") xApplicationId: String, @Path("company_id") companyId: String,@Body body: EngineRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<EngineResponse>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-async")
    suspend fun sendCommunicationAsynchronously(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EngineRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<EngineResponse>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-instant")
    suspend fun sendCommunicationSynchronously(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EngineRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendInstantResponse>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/engine/send-instant")
    suspend fun sendByCompanyCommunicationInstantly(@Header("x-application-id") xApplicationId: String, @Path("company_id") companyId: String,@Body body: EngineRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendInstantResponse>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions")
    suspend fun getEventSubscriptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("populate") populate: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<EventSubscriptions>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions")
    suspend fun createEventSubscriptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SubscriptionsObject, @HeaderMap headers: Map<String, String>? = null)
    : Response<EventSubscriptionsBulkUpdateResponse>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/bulkUpdate")
    suspend fun createEventSubscriptionsByBulk(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EventSubscriptionsBulkUpdateRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<EventSubscriptionsBulkUpdateResponse>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/{id}")
    suspend fun getEventSubscriptionsById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("populate") populate: String?, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EventSubscription>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/{id}")
    suspend fun editEventSubscriptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SubscriptionsObjectRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<EventSubscriptionsBulkUpdateResponse>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/{id}")
    suspend fun deleteEventSubscriptionsById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EventSubscription>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    suspend fun getEmailTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<EmailTemplates>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    suspend fun createEmailTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EmailTemplateReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<EmailTemplate>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    suspend fun getEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EmailTemplate>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    suspend fun updateEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EmailTemplateReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<EmailTemplate>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    suspend fun deleteEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BasicDelete>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/system-templates")
    suspend fun getSystemEmailTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<SystemEmailTemplate>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/subscribedTemplates")
    suspend fun getSubscribedEmailTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("query") query: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscribedEmailTemplates>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    suspend fun getEmailProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<EmailProviders>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    suspend fun createEmailProvider(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EmailProviderReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<EmailProvider>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    suspend fun getEmailProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EmailProvider>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    suspend fun updateEmailProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EmailProviderReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<EmailProvider>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    suspend fun deleteEmailProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BasicDelete>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/default-providers")
    suspend fun getDefaultEmailProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<DefaultEmailProviders>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    suspend fun getSmsProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SmsProviders>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    suspend fun createSmsProvider(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SmsProviderReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<SmsProvider>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    suspend fun getSmsProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SmsProvider>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    suspend fun updateSmsProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SmsProviderReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<SmsProvider>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    suspend fun deleteSmsProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BasicDelete>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/default-providers")
    suspend fun getDefaultSmsProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<DefaultSmsProviders>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    suspend fun getSmsTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SmsTemplates>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    suspend fun createSmsTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SmsTemplateReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<SmsTemplate>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    suspend fun getSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SmsTemplate>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    suspend fun updateSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SmsTemplateReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<SmsTemplate>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    suspend fun deleteSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BasicDelete>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/system-templates")
    suspend fun getSystemSmsTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<SystemSmsTemplates>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/subscribedTemplates")
    suspend fun getSubscribedSmsTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("query") query: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscribedSmsTemplates>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/trigger-job")
    suspend fun triggerCampaignJob(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: TriggerJobRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<TriggerJobResponse>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/jobs")
    suspend fun getJobs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Jobs>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/jobs")
    suspend fun createJobs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateJobsReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateJobsRes>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/logs")
    suspend fun getJobLogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<JobLogs>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/global-variables")
    suspend fun getGlobalVariables(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GlobalVariablesGetResponse>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/global-variables")
    suspend fun postGlobalVariables(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GlobalVariablesReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<GlobalVariablesPostResponse>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/log")
    suspend fun getCommunicationLogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: HashMap<String,Any>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Logs>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/app-provider/update-provider")
    suspend fun updateAppProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppProviderReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppProvider>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/app-provider/get-provider")
    suspend fun getAppProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AppProvider>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/app-provider/global-providers")
    suspend fun getGlobalProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GlobalProviders>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/app-provider/global-providers")
    suspend fun updateAppProvidersGlobalProvider(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppProvidersGlobalProviderRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateAppProvidersGlobalProviderResponse>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasource/dummy-data-source-meta")
    suspend fun getDummyDatasourcesMeta(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: Int, @HeaderMap headers: Map<String, String>? = null)
    : Response<DummyDatasourcesMeta>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasource/dummy-data-sources")
    suspend fun getDummyDatasources(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ArrayList<DummyDatasources>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    suspend fun getAudiences(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Audiences>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    suspend fun createAudience(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AudienceReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<Audience>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    suspend fun getAudienceById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Audience>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    suspend fun updateAudienceById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: AudienceReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<Audience>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    suspend fun deleteAudienceById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: AudienceReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<BasicDelete>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/get-n-records")
    suspend fun getNSampleRecordsFromCsvByGet(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("count") count: Int?, @Query("header") header: Boolean?, @Query("url") url: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetNRecordsCsvRes>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/get-n-records")
    suspend fun getNSampleRecordsFromCsv(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetNRecordsCsvReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetNRecordsCsvRes>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    suspend fun getCampaigns(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("query") query: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Campaigns>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    suspend fun createCampaign(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CampaignReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<Campaign>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    suspend fun getCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Campaign>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    suspend fun updateCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CampaignReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<Campaign>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    suspend fun deleteCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BasicDelete>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/get-stats/{id}")
    suspend fun getStatsOfCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetStats>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/notification/system-notifications")
    suspend fun getSystemNotifications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: String?, @Query("query") query: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SystemNotifications>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/send-otp-comms")
    suspend fun sendOtp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("ci") ci: Boolean?,@Body body: SendOtpCommsReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendOtpCommsRes>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/verify-otp-comms")
    suspend fun verfiyOtp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: VerifyOtpCommsReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<VerifyOtpCommsSuccessRes>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/otp-configuration")
    suspend fun getOtpConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OtpConfiguration>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/otp-configuration")
    suspend fun updateOtpConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OtpConfiguration, @HeaderMap headers: Map<String, String>? = null)
    : Response<OtpConfiguration>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/pn/tokens")
    suspend fun createAppPushtoken(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PushtokenReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<PushtokenRes>
    
}
