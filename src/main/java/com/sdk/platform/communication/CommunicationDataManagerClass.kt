package com.sdk.platform.communication

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class CommunicationDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val communicationApiList by lazy {
        generatecommunicationApiList()
    }
    
    private fun generatecommunicationApiList(): CommunicationApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        if(unauthorizedAction != null){
            val accessUnauthorizedInterceptor = AccessUnauthorizedInterceptor(unauthorizedAction)
            interceptorList.add(accessUnauthorizedInterceptor)
        }
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCommunication",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(CommunicationApiList::class.java) as? CommunicationApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getSystemNotifications(pageNo: Int?=null, pageSize: Int?=null)
    : Response<SystemNotifications>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            communicationApiList?.getSystemNotifications(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCampaigns(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Response<Campaigns>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCampaigns(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createCampaign(body: CampaignReq)
    : Response<Campaign>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createCampaign(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCampaignById(id: String)
    : Response<Campaign>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCampaignById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateCampaignById(id: String,body: CampaignReq)
    : Response<Campaign>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateCampaignById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getStatsOfCampaignById(id: String)
    : Response<GetStats>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getStatsOfCampaignById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getAudiences(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Response<Audiences>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getAudiences(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createAudience(body: AudienceReq)
    : Response<Audience>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createAudience(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getBigqueryHeaders(body: BigqueryHeadersReq)
    : Response<BigqueryHeadersRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getBigqueryHeaders(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAudienceById(id: String)
    : Response<Audience>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getAudienceById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateAudienceById(id: String,body: AudienceReq)
    : Response<Audience>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateAudienceById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getNSampleRecordsFromCsv(body: GetNRecordsCsvReq)
    : Response<GetNRecordsCsvRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getNSampleRecordsFromCsv(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailProviders(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Response<EmailProviders>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailProviders(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createEmailProvider(body: EmailProviderReq)
    : Response<EmailProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createEmailProvider(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailProviderById(id: String)
    : Response<EmailProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailProviderById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateEmailProviderById(id: String,body: EmailProviderReq)
    : Response<EmailProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateEmailProviderById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailTemplates(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Response<EmailTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createEmailTemplate(body: EmailTemplateReq)
    : Response<EmailTemplateRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createEmailTemplate(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSystemEmailTemplates(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Response<SystemEmailTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSystemEmailTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun getEmailTemplateById(id: String)
    : Response<EmailTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateEmailTemplateById(id: String,body: EmailTemplateReq)
    : Response<EmailTemplateRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateEmailTemplateById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteEmailTemplateById(id: String)
    : Response<EmailTemplateDeleteSuccessRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteEmailTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun sendCommunicationSynchronously(body: EngineRequest)
    : Response<EngineResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendCommunicationSynchronously(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun sendCommunicationAsynchronously(body: EngineRequest)
    : Response<EngineResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendCommunicationAsynchronously(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getEventSubscriptions(pageNo: Int?=null, pageSize: Int?=null, populate: String?=null)
    : Response<EventSubscriptions>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEventSubscriptions(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, populate = populate )
        } else {
            null
        }
    }
    
    
    suspend fun getJobs(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Response<Jobs>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getJobs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun triggerCampaignJob(body: TriggerJobRequest)
    : Response<TriggerJobResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.triggerCampaignJob(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getJobLogs(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Response<JobLogs>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getJobLogs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun getCommunicationLogs(pageId: String?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null, query: HashMap<String,Any>?=null)
    : Response<Logs>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCommunicationLogs(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize, sort = sort, query = query )
        } else {
            null
        }
    }
    
    
    
    suspend fun sendOtp(body: SendOtpCommsReq)
    : Response<SendOtpCommsRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendOtp(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun verfiyOtp(body: VerifyOtpCommsReq)
    : Response<VerifyOtpCommsSuccessRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.verfiyOtp(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsProviders(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Response<SmsProviders>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsProviders(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createSmsProvider(body: SmsProviderReq)
    : Response<SmsProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createSmsProvider(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsProviderById(id: String)
    : Response<SmsProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsProviderById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateSmsProviderById(id: String,body: SmsProviderReq)
    : Response<SmsProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateSmsProviderById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsTemplates(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Response<SmsTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createSmsTemplate(body: SmsTemplateReq)
    : Response<SmsTemplateRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createSmsTemplate(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsTemplateById(id: String)
    : Response<SmsTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateSmsTemplateById(id: String,body: SmsTemplateReq)
    : Response<SmsTemplateRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateSmsTemplateById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSmsTemplateById(id: String)
    : Response<SmsTemplateDeleteSuccessRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteSmsTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getSystemSystemTemplates(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Response<SystemSmsTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSystemSystemTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
}
}