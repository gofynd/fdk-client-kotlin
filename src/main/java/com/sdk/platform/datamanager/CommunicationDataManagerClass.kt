package com.sdk.platform.datamanager

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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCommunication",
            persistentCookieStore = config.persistentCookieStore
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCampaigns
    **/
    fun getCampaignsPaginator(
    pageSize: Int?=null, sort: HashMap<String,Any>?=null
    
    ) : Paginator<Campaigns>{
        val paginator = Paginator<Campaigns>()
        paginator.setCallBack(object : PaginatorCallback<Campaigns> {
            
            override suspend fun onNext(
                onResponse: (Event<Campaigns>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getCampaigns(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAudiences
    **/
    fun getAudiencesPaginator(
    pageSize: Int?=null, sort: HashMap<String,Any>?=null
    
    ) : Paginator<Audiences>{
        val paginator = Paginator<Audiences>()
        paginator.setCallBack(object : PaginatorCallback<Audiences> {
            
            override suspend fun onNext(
                onResponse: (Event<Audiences>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getAudiences(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getEmailProviders
    **/
    fun getEmailProvidersPaginator(
    pageSize: Int?=null, sort: HashMap<String,Any>?=null
    
    ) : Paginator<EmailProviders>{
        val paginator = Paginator<EmailProviders>()
        paginator.setCallBack(object : PaginatorCallback<EmailProviders> {
            
            override suspend fun onNext(
                onResponse: (Event<EmailProviders>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getEmailProviders(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getEmailTemplates
    **/
    fun getEmailTemplatesPaginator(
    pageSize: Int?=null, sort: HashMap<String,Any>?=null
    
    ) : Paginator<EmailTemplates>{
        val paginator = Paginator<EmailTemplates>()
        paginator.setCallBack(object : PaginatorCallback<EmailTemplates> {
            
            override suspend fun onNext(
                onResponse: (Event<EmailTemplates>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getEmailTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSystemEmailTemplates
    **/
    fun getSystemEmailTemplatesPaginator(
    pageSize: Int?=null, sort: HashMap<String,Any>?=null
    
    ) : Paginator<SystemEmailTemplates>{
        val paginator = Paginator<SystemEmailTemplates>()
        paginator.setCallBack(object : PaginatorCallback<SystemEmailTemplates> {
            
            override suspend fun onNext(
                onResponse: (Event<SystemEmailTemplates>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSystemEmailTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getEventSubscriptions
    **/
    fun getEventSubscriptionsPaginator(
    pageSize: Int?=null, populate: String?=null
    
    ) : Paginator<EventSubscriptions>{
        val paginator = Paginator<EventSubscriptions>()
        paginator.setCallBack(object : PaginatorCallback<EventSubscriptions> {
            
            override suspend fun onNext(
                onResponse: (Event<EventSubscriptions>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getEventSubscriptions(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, populate = populate)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    suspend fun getJobs(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<Jobs>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getJobs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getJobs
    **/
    fun getJobsPaginator(
    pageSize: Int?=null, sort: HashMap<String,Any>?=null
    
    ) : Paginator<Jobs>{
        val paginator = Paginator<Jobs>()
        paginator.setCallBack(object : PaginatorCallback<Jobs> {
            
            override suspend fun onNext(
                onResponse: (Event<Jobs>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getJobs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getJobLogs
    **/
    fun getJobLogsPaginator(
    pageSize: Int?=null, sort: HashMap<String,Any>?=null
    
    ) : Paginator<JobLogs>{
        val paginator = Paginator<JobLogs>()
        paginator.setCallBack(object : PaginatorCallback<JobLogs> {
            
            override suspend fun onNext(
                onResponse: (Event<JobLogs>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getJobLogs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    suspend fun getCommunicationLogs(pageId: String?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null, query: HashMap<String,Any>?=null)
    : Deferred<Response<Logs>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCommunicationLogs(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize, sort = sort, query = query )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCommunicationLogs
    **/
    fun getCommunicationLogsPaginator(
    pageSize: Int?=null, sort: HashMap<String,Any>?=null, query: HashMap<String,Any>?=null
    
    ) : Paginator<Logs>{
        val paginator = Paginator<Logs>()
        paginator.setCallBack(object : PaginatorCallback<Logs> {
            
            override suspend fun onNext(
                onResponse: (Event<Logs>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    communicationApiList?.getCommunicationLogs(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize, sort = sort, query = query)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    
    suspend fun getSmsProviders(pageNo: Int?=null, pageSize: Int?=null, sort: HashMap<String,Any>?=null)
    : Deferred<Response<SmsProviders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsProviders(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSmsProviders
    **/
    fun getSmsProvidersPaginator(
    pageSize: Int?=null, sort: HashMap<String,Any>?=null
    
    ) : Paginator<SmsProviders>{
        val paginator = Paginator<SmsProviders>()
        paginator.setCallBack(object : PaginatorCallback<SmsProviders> {
            
            override suspend fun onNext(
                onResponse: (Event<SmsProviders>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSmsProviders(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSmsTemplates
    **/
    fun getSmsTemplatesPaginator(
    pageSize: Int?=null, sort: HashMap<String,Any>?=null
    
    ) : Paginator<SmsTemplates>{
        val paginator = Paginator<SmsTemplates>()
        paginator.setCallBack(object : PaginatorCallback<SmsTemplates> {
            
            override suspend fun onNext(
                onResponse: (Event<SmsTemplates>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSmsTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSystemSystemTemplates
    **/
    fun getSystemSystemTemplatesPaginator(
    pageSize: Int?=null, sort: HashMap<String,Any>?=null
    
    ) : Paginator<SystemSmsTemplates>{
        val paginator = Paginator<SystemSmsTemplates>()
        paginator.setCallBack(object : PaginatorCallback<SystemSmsTemplates> {
            
            override suspend fun onNext(
                onResponse: (Event<SystemSmsTemplates>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSystemSystemTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
}
}