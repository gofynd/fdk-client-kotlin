package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.communication.*
import com.sdk.platform.apis.communication.*




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
            certPublicKey = config.certPublicKey,
        )
        return retrofitHttpClient?.initializeRestClient(CommunicationApiList::class.java) as? CommunicationApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getSystemNotifications(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<SystemNotifications>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            communicationApiList?.getSystemNotifications(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCampaigns(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<Campaigns>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCampaigns(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createCampaign(body: CampaignReq)
    : Deferred<Response<Campaign>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createCampaign(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCampaignById(id: String)
    : Deferred<Response<Campaign>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCampaignById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateCampaignById(id: String,body: CampaignReq)
    : Deferred<Response<Campaign>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateCampaignById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getStatsOfCampaignById(id: String)
    : Deferred<Response<GetStats>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getStatsOfCampaignById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getAudiences(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<Audiences>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getAudiences(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createAudience(body: AudienceReq)
    : Deferred<Response<Audience>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createAudience(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getBigqueryHeaders(body: BigqueryHeadersReq)
    : Deferred<Response<BigqueryHeadersRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getBigqueryHeaders(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAudienceById(id: String)
    : Deferred<Response<Audience>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getAudienceById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateAudienceById(id: String,body: AudienceReq)
    : Deferred<Response<Audience>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateAudienceById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getNSampleRecordsFromCsv(body: GetNRecordsCsvReq)
    : Deferred<Response<GetNRecordsCsvRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getNSampleRecordsFromCsv(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailProviders(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<EmailProviders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailProviders(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createEmailProvider(body: EmailProviderReq)
    : Deferred<Response<EmailProvider>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createEmailProvider(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailProviderById(id: String)
    : Deferred<Response<EmailProvider>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailProviderById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateEmailProviderById(id: String,body: EmailProviderReq)
    : Deferred<Response<EmailProvider>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateEmailProviderById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailTemplates(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<EmailTemplates>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createEmailTemplate(body: EmailTemplateReq)
    : Deferred<Response<EmailTemplateRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createEmailTemplate(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSystemEmailTemplates(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<SystemEmailTemplates>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSystemEmailTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun getEmailTemplateById(id: String)
    : Deferred<Response<EmailTemplate>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateEmailTemplateById(id: String,body: EmailTemplateReq)
    : Deferred<Response<EmailTemplateRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateEmailTemplateById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteEmailTemplateById(id: String)
    : Deferred<Response<EmailTemplateDeleteSuccessRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteEmailTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun sendCommunicationSynchronously(body: EngineRequest)
    : Deferred<Response<EngineResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendCommunicationSynchronously(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun sendCommunicationAsynchronously(body: EngineRequest)
    : Deferred<Response<EngineResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendCommunicationAsynchronously(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getEventSubscriptions(pageNo: Int?=null, pageSize: Int?=null, populate: String?=null)
    : Deferred<Response<EventSubscriptions>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEventSubscriptions(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, populate = populate )
        } else {
            null
        }
    }
    
    
    suspend fun getJobs(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<Jobs>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getJobs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun triggerCampaignJob(body: TriggerJobRequest)
    : Deferred<Response<TriggerJobResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.triggerCampaignJob(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getJobLogs(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<JobLogs>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getJobLogs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun getCommunicationLogs(pageId: String?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null, query: HashMap<String,Any>?=null)
    : Deferred<Response<Logs>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCommunicationLogs(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize, sort = sort, query = query )
        } else {
            null
        }
    }
    
    
    
    suspend fun sendOtp(body: SendOtpCommsReq)
    : Deferred<Response<SendOtpCommsRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendOtp(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun verfiyOtp(body: VerifyOtpCommsReq)
    : Deferred<Response<VerifyOtpCommsSuccessRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.verfiyOtp(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsProviders(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<SmsProviders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsProviders(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createSmsProvider(body: SmsProviderReq)
    : Deferred<Response<SmsProvider>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createSmsProvider(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsProviderById(id: String)
    : Deferred<Response<SmsProvider>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsProviderById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateSmsProviderById(id: String,body: SmsProviderReq)
    : Deferred<Response<SmsProvider>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateSmsProviderById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsTemplates(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<SmsTemplates>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createSmsTemplate(body: SmsTemplateReq)
    : Deferred<Response<SmsTemplateRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createSmsTemplate(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsTemplateById(id: String)
    : Deferred<Response<SmsTemplate>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateSmsTemplateById(id: String,body: SmsTemplateReq)
    : Deferred<Response<SmsTemplateRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateSmsTemplateById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSmsTemplateById(id: String)
    : Deferred<Response<SmsTemplateDeleteSuccessRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteSmsTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getSystemSystemTemplates(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<SystemSmsTemplates>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSystemSystemTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun getVoiceProviders(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<VoiceProviders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getVoiceProviders(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createVoiceProvider(body: VoiceProviderReq)
    : Deferred<Response<VoiceProvider>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createVoiceProvider(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getVoiceProviderById(id: String)
    : Deferred<Response<VoiceProvider>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getVoiceProviderById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getVoiceTemplates(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<VoiceTemplates>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getVoiceTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    suspend fun createVoiceTemplate(body: VoiceTemplateReq)
    : Deferred<Response<VoiceTemplateRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createVoiceTemplate(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getVoiceTemplateById(id: String)
    : Deferred<Response<VoiceTemplate>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getVoiceTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateVoiceTemplateById(id: String,body: VoiceTemplateReq)
    : Deferred<Response<VoiceTemplateRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateVoiceTemplateById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteVoiceTemplateById(id: String)
    : Deferred<Response<VoiceTemplateDeleteSuccessRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteVoiceTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getSystemVoiceTemplates(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<SystemVoiceTemplates>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSystemVoiceTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
}
}