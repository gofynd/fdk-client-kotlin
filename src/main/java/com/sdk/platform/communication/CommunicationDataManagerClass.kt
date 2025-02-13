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
    
    
    suspend fun sendByCompanyCommunicationSynchronously(xApplicationId: String,body: EngineRequest, headers: Map<String, String> = emptyMap())
    : Response<SendInstantResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            communicationApiList?.sendByCompanyCommunicationSynchronously(
        xApplicationId = xApplicationId,companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun senByCompanyCommunicationAsynchronously(xApplicationId: String,body: EngineRequest, headers: Map<String, String> = emptyMap())
    : Response<EngineResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            communicationApiList?.senByCompanyCommunicationAsynchronously(
        xApplicationId = xApplicationId,companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun sendByCompanyCommunicationInstantly(xApplicationId: String,body: EngineRequest, headers: Map<String, String> = emptyMap())
    : Response<SendInstantResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            communicationApiList?.sendByCompanyCommunicationInstantly(
        xApplicationId = xApplicationId,companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getSystemNotifications(pageNo: Int?=null,pageSize: Int?=null,sort: String?=null,query: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SystemNotifications>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            communicationApiList?.getSystemNotifications(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSystemNotifications
    **/
    fun getSystemNotificationsPaginator(companyId: String, pageSize: Int?=null, sort: String?=null, query: String?=null) : Paginator<SystemNotifications>{
        val paginator = Paginator<SystemNotifications>()
        paginator.setCallBack(object : PaginatorCallback<SystemNotifications> {

            override suspend fun onNext(
                onResponse: (Event<SystemNotifications>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSystemNotifications(
                    companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, sort = sort, query = query
                    )?.safeAwait{ response, error ->
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
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    suspend fun sendEngineCommunicationSynchronously(body: EngineRequest, headers: Map<String, String> = emptyMap())
    : Response<SendInstantResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendEngineCommunicationSynchronously(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
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
    
    
    suspend fun sendCommunicationSynchronously(body: EngineRequest, headers: Map<String, String> = emptyMap())
    : Response<SendInstantResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendCommunicationSynchronously(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
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
    
    suspend fun createEventSubscriptions(body: SubscriptionsObject, headers: Map<String, String> = emptyMap())
    : Response<EventSubscription>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createEventSubscriptions(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
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
    
    
    suspend fun getEventSubscriptionsById(populate: String?=null,id: String, headers: Map<String, String> = emptyMap())
    : Response<EventSubscription>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEventSubscriptionsById(companyId = config.companyId ,applicationId = applicationId ,populate = populate,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editEventSubscriptions(id: String,body: SubscriptionsObjectRequest, headers: Map<String, String> = emptyMap())
    : Response<EventSubscription>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.editEventSubscriptions(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteEventSubscriptionsById(id: String, headers: Map<String, String> = emptyMap())
    : Response<EventSubscription>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteEventSubscriptionsById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailTemplates(pageNo: Int?=null,pageSize: Int?=null,sort: String?=null,query: String?=null, headers: Map<String, String> = emptyMap())
    : Response<EmailTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailTemplates(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getEmailTemplates
    **/
    fun getEmailTemplatesPaginator(
    pageSize: Int?=null, sort: String?=null, query: String?=null
    
    ) : Paginator<EmailTemplates>{
        val paginator = Paginator<EmailTemplates>()
        paginator.setCallBack(object : PaginatorCallback<EmailTemplates> {

            override suspend fun onNext(
                onResponse: (Event<EmailTemplates>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getEmailTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort, query = query)?.safeAwait{ response, error ->
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
    
    suspend fun createEmailTemplate(body: EmailTemplateReq, headers: Map<String, String> = emptyMap())
    : Response<EmailTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createEmailTemplate(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
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
    : Response<BasicDelete>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteEmailTemplateById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSystemEmailTemplates( headers: Map<String, String> = emptyMap())
    : Response<ArrayList<SystemEmailTemplate>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSystemEmailTemplates(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSubscribedEmailTemplates(pageNo: Int?=null,pageSize: Int?=null,query: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SubscribedEmailTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSubscribedEmailTemplates(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getEmailProviders(pageNo: Int?=null,pageSize: Int?=null,sort: String?=null,query: String?=null, headers: Map<String, String> = emptyMap())
    : Response<EmailProviders>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailProviders(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getEmailProviders
    **/
    fun getEmailProvidersPaginator(
    pageSize: Int?=null, sort: String?=null, query: String?=null
    
    ) : Paginator<EmailProviders>{
        val paginator = Paginator<EmailProviders>()
        paginator.setCallBack(object : PaginatorCallback<EmailProviders> {

            override suspend fun onNext(
                onResponse: (Event<EmailProviders>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getEmailProviders(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort, query = query)?.safeAwait{ response, error ->
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
    : Response<BasicDelete>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteEmailProviderById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDefaultEmailProviders( headers: Map<String, String> = emptyMap())
    : Response<ArrayList<DefaultEmailProviders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getDefaultEmailProviders(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsProviders(pageNo: Int?=null,pageSize: Int?=null,sort: String?=null,query: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SmsProviders>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsProviders(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createSmsProvider(body: SmsProviderReq, headers: Map<String, String> = emptyMap())
    : Response<SmsProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createSmsProvider(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSmsProviderById(id: String, headers: Map<String, String> = emptyMap())
    : Response<SmsProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsProviderById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSmsProviderById(id: String,body: SmsProviderReq, headers: Map<String, String> = emptyMap())
    : Response<SmsProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateSmsProviderById(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSmsProviderById(id: String, headers: Map<String, String> = emptyMap())
    : Response<BasicDelete>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteSmsProviderById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
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
    
    
    suspend fun getSmsTemplates(pageNo: Int?=null,pageSize: Int?=null,sort: String?=null,query: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SmsTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsTemplates(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSmsTemplates
    **/
    fun getSmsTemplatesPaginator(
    pageSize: Int?=null, sort: String?=null, query: String?=null
    
    ) : Paginator<SmsTemplates>{
        val paginator = Paginator<SmsTemplates>()
        paginator.setCallBack(object : PaginatorCallback<SmsTemplates> {

            override suspend fun onNext(
                onResponse: (Event<SmsTemplates>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSmsTemplates(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort, query = query)?.safeAwait{ response, error ->
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
    
    suspend fun createSmsTemplate(body: SmsTemplateReq, headers: Map<String, String> = emptyMap())
    : Response<SmsTemplate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createSmsTemplate(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
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
    : Response<BasicDelete>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteSmsTemplateById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
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
    
    
    suspend fun getSubscribedSmsTemplates(pageNo: Int?=null,pageSize: Int?=null,query: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SubscribedSmsTemplates>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSubscribedSmsTemplates(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,query = query, headers = headers)
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
    
    
    suspend fun getJobs(pageNo: Int?=null,pageSize: Int?=null,sort: String?=null,query: String?=null, headers: Map<String, String> = emptyMap())
    : Response<Jobs>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getJobs(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getJobs
    **/
    fun getJobsPaginator(
    pageSize: Int?=null, sort: String?=null, query: String?=null
    
    ) : Paginator<Jobs>{
        val paginator = Paginator<Jobs>()
        paginator.setCallBack(object : PaginatorCallback<Jobs> {

            override suspend fun onNext(
                onResponse: (Event<Jobs>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getJobs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort, query = query)?.safeAwait{ response, error ->
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
    
    suspend fun createJobs(body: CreateJobsReq, headers: Map<String, String> = emptyMap())
    : Response<CreateJobsRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createJobs(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getJobLogs(pageNo: Int?=null,pageSize: Int?=null,sort: String?=null,query: String?=null, headers: Map<String, String> = emptyMap())
    : Response<JobLogs>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getJobLogs(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getJobLogs
    **/
    fun getJobLogsPaginator(
    pageSize: Int?=null, sort: String?=null, query: String?=null
    
    ) : Paginator<JobLogs>{
        val paginator = Paginator<JobLogs>()
        paginator.setCallBack(object : PaginatorCallback<JobLogs> {

            override suspend fun onNext(
                onResponse: (Event<JobLogs>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getJobLogs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort, query = query)?.safeAwait{ response, error ->
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
    
    
    suspend fun getCommunicationLogs(pageNo: Int?=null,pageSize: Int?=null,sort: String?=null,query: HashMap<String,Any>?=null, headers: Map<String, String> = emptyMap())
    : Response<Logs>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCommunicationLogs(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCommunicationLogs
    **/
    fun getCommunicationLogsPaginator(
    pageSize: Int?=null, sort: String?=null, query: HashMap<String,Any>?=null
    
    ) : Paginator<Logs>{
        val paginator = Paginator<Logs>()
        paginator.setCallBack(object : PaginatorCallback<Logs> {

            override suspend fun onNext(
                onResponse: (Event<Logs>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getCommunicationLogs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort, query = query)?.safeAwait{ response, error ->
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
    
    suspend fun updateAppProviders(body: AppProviderReq, headers: Map<String, String> = emptyMap())
    : Response<AppProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateAppProviders(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppProviders( headers: Map<String, String> = emptyMap())
    : Response<AppProvider>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getAppProviders(companyId = config.companyId ,applicationId = applicationId , headers = headers)
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
    
    
    suspend fun updateAppProvidersGlobalProvider(body: AppProvidersGlobalProviderRequest, headers: Map<String, String> = emptyMap())
    : Response<UpdateAppProvidersGlobalProviderResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateAppProvidersGlobalProvider(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDummyDatasourcesMeta(id: Int, headers: Map<String, String> = emptyMap())
    : Response<DummyDatasourcesMeta>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getDummyDatasourcesMeta(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
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
    
    
    suspend fun getAudiences(pageNo: Int?=null,pageSize: Int?=null,sort: String?=null,query: String?=null, headers: Map<String, String> = emptyMap())
    : Response<Audiences>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getAudiences(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,sort = sort,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAudiences
    **/
    fun getAudiencesPaginator(
    pageSize: Int?=null, sort: String?=null, query: String?=null
    
    ) : Paginator<Audiences>{
        val paginator = Paginator<Audiences>()
        paginator.setCallBack(object : PaginatorCallback<Audiences> {

            override suspend fun onNext(
                onResponse: (Event<Audiences>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getAudiences(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, sort = sort, query = query)?.safeAwait{ response, error ->
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
    : Response<BasicDelete>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteAudienceById(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getNSampleRecordsFromCsvByGet(count: Int?=null,header: Boolean?=null,url: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetNRecordsCsvRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getNSampleRecordsFromCsvByGet(companyId = config.companyId ,applicationId = applicationId ,count = count,header = header,url = url, headers = headers)
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
    
    
    suspend fun getCampaigns(query: String?=null,pageNo: Int?=null,pageSize: Int?=null,sort: String?=null, headers: Map<String, String> = emptyMap())
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
    
    
    suspend fun deleteCampaignById(id: String, headers: Map<String, String> = emptyMap())
    : Response<BasicDelete>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.deleteCampaignById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
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
    
    
    
    suspend fun sendOtp(ci: Boolean?=null,body: SendOtpCommsReq, headers: Map<String, String> = emptyMap())
    : Response<SendOtpCommsRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.sendOtp(companyId = config.companyId ,applicationId = applicationId ,ci = ci, body = body,headers = headers)
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
    
    
    suspend fun updateOtpConfiguration(body: OtpConfiguration, headers: Map<String, String> = emptyMap())
    : Response<OtpConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.updateOtpConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createAppPushtoken(body: PushtokenReq, headers: Map<String, String> = emptyMap())
    : Response<PushtokenRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.createAppPushtoken(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
}
}