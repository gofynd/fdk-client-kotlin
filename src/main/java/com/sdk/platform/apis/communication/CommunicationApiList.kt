package com.sdk.platform.apis.communication

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.communication.*

interface CommunicationApiList {
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    fun getCampaigns(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<Campaigns>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    fun createCampaign(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CampaignReq)
    : Deferred<Response<Campaign>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    fun getCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<Campaign>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    fun updateCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CampaignReq)
    : Deferred<Response<Campaign>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/get-stats/{id}")
    fun getStatsOfCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<GetStats>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    fun getAudiences(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<Audiences>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    fun createAudience(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AudienceReq)
    : Deferred<Response<Audience>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/bigquery-headers")
    fun getBigqueryHeaders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BigqueryHeadersReq)
    : Deferred<Response<BigqueryHeadersRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    fun getAudienceById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<Audience>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    fun updateAudienceById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: AudienceReq)
    : Deferred<Response<Audience>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/get-n-records")
    fun getNSampleRecordsFromCsv(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetNRecordsCsvReq)
    : Deferred<Response<GetNRecordsCsvRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    fun getEmailProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<EmailProviders>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    fun createEmailProvider(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EmailProviderReq)
    : Deferred<Response<EmailProvider>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    fun getEmailProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<EmailProvider>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    fun updateEmailProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EmailProviderReq)
    : Deferred<Response<EmailProvider>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    fun getEmailTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<EmailTemplates>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    fun createEmailTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EmailTemplateReq)
    : Deferred<Response<EmailTemplateRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/system-templates")
    fun getSystemEmailTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<SystemEmailTemplates>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    fun getEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<EmailTemplate>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    fun updateEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EmailTemplateReq)
    : Deferred<Response<EmailTemplateRes>>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    fun deleteEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<EmailTemplateDeleteSuccessRes>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-instant")
    fun sendCommunicationSynchronously(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EngineRequest)
    : Deferred<Response<EngineResponse>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-async")
    fun sendCommunicationAsynchronously(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EngineRequest)
    : Deferred<Response<EngineResponse>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions")
    fun getEventSubscriptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("populate") populate: String?)
    : Deferred<Response<EventSubscriptions>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/jobs")
    fun getJobs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<Jobs>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/trigger-job")
    fun triggerCampaignJob(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: TriggerJobRequest)
    : Deferred<Response<TriggerJobResponse>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/logs")
    fun getJobLogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<JobLogs>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/log")
    fun getCommunicationLogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?, @Query("query") query: HashMap<String,Any>?)
    : Deferred<Response<Logs>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/notification/system-notifications/")
    fun getSystemNotifications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<SystemNotifications>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/send-otp-comms")
    fun sendOtp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SendOtpCommsReq)
    : Deferred<Response<SendOtpCommsRes>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/verify-otp-comms")
    fun verfiyOtp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: VerifyOtpCommsReq)
    : Deferred<Response<VerifyOtpCommsSuccessRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    fun getSmsProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<SmsProviders>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    fun createSmsProvider(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SmsProviderReq)
    : Deferred<Response<SmsProvider>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    fun getSmsProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<SmsProvider>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    fun updateSmsProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SmsProviderReq)
    : Deferred<Response<SmsProvider>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    fun getSmsTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<SmsTemplates>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    fun createSmsTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SmsTemplateReq)
    : Deferred<Response<SmsTemplateRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    fun getSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<SmsTemplate>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    fun updateSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SmsTemplateReq)
    : Deferred<Response<SmsTemplateRes>>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    fun deleteSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<SmsTemplateDeleteSuccessRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/system-templates")
    fun getSystemSystemTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<SystemSmsTemplates>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/voice/providers")
    fun getVoiceProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<VoiceProviders>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/voice/providers")
    fun createVoiceProvider(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: VoiceProviderReq)
    : Deferred<Response<VoiceProvider>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/voice/providers/{id}")
    fun getVoiceProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<VoiceProvider>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/voice/templates")
    fun getVoiceTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<VoiceTemplates>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/voice/templates")
    fun createVoiceTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: VoiceTemplateReq)
    : Deferred<Response<VoiceTemplateRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/voice/templates/{id}")
    fun getVoiceTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<VoiceTemplate>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/voice/templates/{id}")
    fun updateVoiceTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: VoiceTemplateReq)
    : Deferred<Response<VoiceTemplateRes>>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/voice/templates/{id}")
    fun deleteVoiceTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<VoiceTemplateDeleteSuccessRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/voice/system-templates")
    fun getSystemVoiceTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<SystemVoiceTemplates>>
    
}