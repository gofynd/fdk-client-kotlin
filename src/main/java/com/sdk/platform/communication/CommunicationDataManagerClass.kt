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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getSystemNotifications(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<SystemNotifications>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            communicationApiList?.getSystemNotifications(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getAppProviders( headers: Map<String, String> = emptyMap())
    : Response<AppProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getAppProviders(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppProviders(body: AppProviderReq, headers: Map<String, String> = emptyMap())
    : Response<AppProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateAppProviders(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getGlobalProviders( headers: Map<String, String> = emptyMap())
    : Response<GlobalProviders>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getGlobalProviders(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailProviders(pageNo: Int?=null,pageSize: Int?=null,sort: HashMap<String,Any>?=null,query: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<EmailProviders>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailProviders(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createEmailProvider(body: EmailProviderReq, headers: Map<String, String> = emptyMap())
    : Response<EmailProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createEmailProvider(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailProviderById(id: String, headers: Map<String, String> = emptyMap())
    : Response<EmailProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailProviderById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateEmailProviderById(id: String,body: EmailProviderReq, headers: Map<String, String> = emptyMap())
    : Response<EmailProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateEmailProviderById(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteEmailProviderById(id: String, headers: Map<String, String> = emptyMap())
    : Response<GenericDelete>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteEmailProviderById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsProviders(pageNo: Int?=null,pageSize: Int?=null,sort: HashMap<String,Any>?=null,query: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsProviders(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createSmsProvider(body: SmsProviderReq, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createSmsProvider(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDefaultSmsProviders( headers: Map<String, String> = emptyMap())
    : Response<ArrayList<DefaultSmsProviders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getDefaultSmsProviders(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsProviderById(id: String, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsProviderById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSmsProviderById(id: String,body: SmsProviderReq, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateSmsProviderById(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSmsProviderById(id: String, headers: Map<String, String> = emptyMap())
    : Response<GenericDelete>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteSmsProviderById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCampaigns(query: HashMap<String,Any>?=null,pageNo: Int?=null,pageSize: Int?=null,sort: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<Campaigns>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCampaigns(companyId = config.companyId ,applicationId = applicationId ,query = query,pageNo = pageNo,pageSize = pageSize,sort = sort, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCampaign(body: CampaignReq, headers: Map<String, String> = emptyMap())
    : Response<Campaign>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createCampaign(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCampaignById(id: String, headers: Map<String, String> = emptyMap())
    : Response<Campaign>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCampaignById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCampaignById(id: String,body: CampaignReq, headers: Map<String, String> = emptyMap())
    : Response<Campaign>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateCampaignById(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getStatsOfCampaignById(id: String, headers: Map<String, String> = emptyMap())
    : Response<GetStats>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getStatsOfCampaignById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBigQueryRowCountById(id: String, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getBigQueryRowCountById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createBigQueryRowCount( headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createBigQueryRowCount(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBigQueryHeadersById(id: String, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getBigQueryHeadersById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createBigQueryNCount( headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createBigQueryNCount(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createBigQueryHeaders( headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createBigQueryHeaders(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSystemAudiences( headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSystemAudiences(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAudiences(pageNo: Int?=null,pageSize: Int?=null,sort: HashMap<String,Any>?=null,query: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<Audiences>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getAudiences(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAudience(body: AudienceReq, headers: Map<String, String> = emptyMap())
    : Response<Audience>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createAudience(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAudienceById(id: String, headers: Map<String, String> = emptyMap())
    : Response<Audience>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getAudienceById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAudienceById(id: String,body: AudienceReq, headers: Map<String, String> = emptyMap())
    : Response<Audience>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateAudienceById(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAudienceById(id: String,body: AudienceReq, headers: Map<String, String> = emptyMap())
    : Response<Audience>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteAudienceById(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDummyDatasources( headers: Map<String, String> = emptyMap())
    : Response<ArrayList<DummyDatasources>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getDummyDatasources(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDummyDatasourcesMeta(id: String, headers: Map<String, String> = emptyMap())
    : Response<DummyDatasourcesMeta>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getDummyDatasourcesMeta(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getNSampleRecordsFromCsvByGet( headers: Map<String, String> = emptyMap())
    : Response<GetNRecordsCsvRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getNSampleRecordsFromCsvByGet(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getNSampleRecordsFromCsv(body: GetNRecordsCsvReq, headers: Map<String, String> = emptyMap())
    : Response<GetNRecordsCsvRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getNSampleRecordsFromCsv(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailTemplates(pageNo: Int?=null,pageSize: Int?=null,sort: HashMap<String,Any>?=null,query: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<EmailTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailTemplates(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createEmailTemplate(body: EmailTemplateReq, headers: Map<String, String> = emptyMap())
    : Response<EmailTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createEmailTemplate(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSystemEmailTemplates( headers: Map<String, String> = emptyMap())
    : Response<SystemEmailTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSystemEmailTemplates(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailTemplateById(id: String, headers: Map<String, String> = emptyMap())
    : Response<EmailTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailTemplateById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateEmailTemplateById(id: String,body: EmailTemplateReq, headers: Map<String, String> = emptyMap())
    : Response<EmailTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateEmailTemplateById(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteEmailTemplateById(id: String, headers: Map<String, String> = emptyMap())
    : Response<GenericDelete>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteEmailTemplateById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSubscribedEmailTemplates(pageNo: Int?=null,pageSize: Int?=null,query: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<EmailTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSubscribedEmailTemplates(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsTemplates(pageNo: Int?=null,pageSize: Int?=null,sort: HashMap<String,Any>?=null,query: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<SmsTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsTemplates(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createSmsTemplate(body: SmsTemplateReq, headers: Map<String, String> = emptyMap())
    : Response<SmsTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createSmsTemplate(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSystemSmsTemplates( headers: Map<String, String> = emptyMap())
    : Response<ArrayList<SystemSmsTemplates>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSystemSmsTemplates(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsTemplateById(id: String, headers: Map<String, String> = emptyMap())
    : Response<SmsTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsTemplateById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSmsTemplateById(id: String,body: SmsTemplateReq, headers: Map<String, String> = emptyMap())
    : Response<SmsTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateSmsTemplateById(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSmsTemplateById(id: String, headers: Map<String, String> = emptyMap())
    : Response<GenericDelete>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteSmsTemplateById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSubscribedSmsTemplates(pageNo: Int?=null,pageSize: Int?=null,query: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<SmsTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSubscribedSmsTemplates(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun sendCommunicationSynchronously(body: EngineRequest, headers: Map<String, String> = emptyMap())
    : Response<EngineResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendCommunicationSynchronously(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun sendCommunicationAsynchronously(body: EngineRequest, headers: Map<String, String> = emptyMap())
    : Response<EngineResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendCommunicationAsynchronously(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getEventSubscriptions(pageNo: Int?=null,pageSize: Int?=null,populate: String?=null, headers: Map<String, String> = emptyMap())
    : Response<EventSubscriptions>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEventSubscriptions(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,populate = populate, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createEventSubscriptions(body: SubscriptionsObject, headers: Map<String, String> = emptyMap())
    : Response<EventSubscriptionsBulkUpdateResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createEventSubscriptions(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getEventSubscriptionsById(id: String,populate: String?=null, headers: Map<String, String> = emptyMap())
    : Response<EventSubscription>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEventSubscriptionsById(companyId = config.companyId ,applicationId = applicationId ,id = id,populate = populate, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editEventSubscriptions(id: String,body: SubscriptionsObject, headers: Map<String, String> = emptyMap())
    : Response<EventSubscriptionsBulkUpdateResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.editEventSubscriptions(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteEventSubscriptionsById(id: String, headers: Map<String, String> = emptyMap())
    : Response<GenericDelete>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteEventSubscriptionsById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createEventSubscriptionsByBulk(body: EventSubscriptionsBulkUpdateRequest, headers: Map<String, String> = emptyMap())
    : Response<ArrayList<EventSubscriptionsBulkUpdateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createEventSubscriptionsByBulk(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getGlobalVariables( headers: Map<String, String> = emptyMap())
    : Response<GlobalVariablesGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getGlobalVariables(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun postGlobalVariables(body: GlobalVariablesReq, headers: Map<String, String> = emptyMap())
    : Response<GlobalVariablesPostResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.postGlobalVariables(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getJobs(pageNo: Int?=null,pageSize: Int?=null,sort: HashMap<String,Any>?=null,query: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<Jobs>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getJobs(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createJobs(body: CreateJobsReq, headers: Map<String, String> = emptyMap())
    : Response<CreateJobsRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createJobs(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun triggerCampaignJob(body: TriggerJobRequest, headers: Map<String, String> = emptyMap())
    : Response<TriggerJobResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.triggerCampaignJob(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getJobLogs(pageNo: Int?=null,pageSize: Int?=null,sort: HashMap<String,Any>?=null,query: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<JobLogs>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getJobLogs(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCommunicationLogs(pageId: String?=null,pageSize: Int?=null,sort: HashMap<String,Any>?=null,query: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<Logs>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCommunicationLogs(companyId = config.companyId ,applicationId = applicationId ,pageId = pageId,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun sendOtp(body: SendOtpCommsReq, headers: Map<String, String> = emptyMap())
    : Response<SendOtpCommsRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendOtp(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun verfiyOtp(body: VerifyOtpCommsReq, headers: Map<String, String> = emptyMap())
    : Response<VerifyOtpCommsSuccessRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.verfiyOtp(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOtpConfiguration( headers: Map<String, String> = emptyMap())
    : Response<OtpConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getOtpConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateOtpConfiguration( headers: Map<String, String> = emptyMap())
    : Response<OtpConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateOtpConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
}
}