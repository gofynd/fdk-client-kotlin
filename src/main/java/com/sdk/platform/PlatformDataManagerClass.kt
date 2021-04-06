package com.sdk.platform

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import com.sdk.common.*




class LeadDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val leadApiList by lazy {
        generateleadApiList()
    }
    
    private fun generateleadApiList(): LeadApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformLead",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(LeadApiList::class.java) as? LeadApiList
    }
    
    
    suspend fun getTickets(items: Boolean?=null, filters: Boolean?=null, q: String?=null, status: String?=null, priority: String?=null, category: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<TicketList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getTickets(
        companyId = config.companyId, items = items, filters = filters, q = q, status = status, priority = priority, category = category, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun createTicket(body: AddTicketPayload)
    : Deferred<Response<Ticket>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.createTicket(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    suspend fun getTicket(ticketId: String)
    : Deferred<Response<Ticket>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getTicket(
        companyId = config.companyId, ticketId = ticketId )
        } else {
            null
        } 
    }
    
    
    suspend fun editTicket(ticketId: String,body: EditTicketPayload)
    : Deferred<Response<Ticket>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.editTicket(
        companyId = config.companyId, ticketId = ticketId, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun createHistory(ticketId: String,body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.createHistory(
        companyId = config.companyId, ticketId = ticketId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getTicketHistory(ticketId: String)
    : Deferred<Response<TicketHistoryList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getTicketHistory(
        companyId = config.companyId, ticketId = ticketId )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    suspend fun getTickets(items: Boolean?=null, filters: Boolean?=null, q: String?=null, status: String?=null, priority: String?=null, category: String?=null)
    : Deferred<Response<TicketList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTickets(companyId = config.companyId , applicationId = applicationId , items = items, filters = filters, q = q, status = status, priority = priority, category = category )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getTicket(ticketId: String)
    : Deferred<Response<Ticket>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTicket(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId )
        } else {
            null
        }
    }
    
    
    suspend fun editTicket(ticketId: String,body: EditTicketPayload)
    : Deferred<Response<Ticket>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.editTicket(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId, body = body)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun createHistory(ticketId: String,body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.createHistory(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getTicketHistory(ticketId: String)
    : Deferred<Response<TicketHistoryList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTicketHistory(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId )
        } else {
            null
        }
    }
    
    
    suspend fun getCustomForm(slug: String)
    : Deferred<Response<CustomForm>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getCustomForm(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun editCustomForm(slug: String,body: EditCustomFormPayload)
    : Deferred<Response<CustomForm>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.editCustomForm(companyId = config.companyId , applicationId = applicationId , slug = slug, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomForms()
    : Deferred<Response<CustomFormList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getCustomForms(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createCustomForm(body: CreateCustomFormPayload)
    : Deferred<Response<CustomForm>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.createCustomForm(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getTokenForVideoRoom(uniqueName: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTokenForVideoRoom(companyId = config.companyId , applicationId = applicationId , uniqueName = uniqueName )
        } else {
            null
        }
    }
    
    
    suspend fun getVideoParticipants(uniqueName: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getVideoParticipants(companyId = config.companyId , applicationId = applicationId , uniqueName = uniqueName )
        } else {
            null
        }
    }
    
    
    suspend fun openVideoRoom(body: CreateVideoRoomPayload)
    : Deferred<Response<CreateVideoRoomResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.openVideoRoom(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun closeVideoRoom(uniqueName: String)
    : Deferred<Response<CloseVideoRoomResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.closeVideoRoom(companyId = config.companyId , applicationId = applicationId , uniqueName = uniqueName )
        } else {
            null
        }
    }
    
}
}

class ThemeDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val themeApiList by lazy {
        generatethemeApiList()
    }
    
    private fun generatethemeApiList(): ThemeApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformTheme",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ThemeApiList::class.java) as? ThemeApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getThemeLibrary(pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<ThemesListingResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeLibrary(companyId = config.companyId , applicationId = applicationId , pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    suspend fun addToThemeLibrary(body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.addToThemeLibrary(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun applyTheme(body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.applyTheme(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun isUpgradable(themeId: String)
    : Deferred<Response<UpgradableThemeSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.isUpgradable(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun upgradeTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.upgradeTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun getPublicThemes(pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<ThemesListingResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getPublicThemes(companyId = config.companyId , applicationId = applicationId , pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    suspend fun createTheme(body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.createTheme(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppliedTheme()
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getAppliedTheme(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getFonts()
    : Deferred<Response<FontsSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getFonts(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getThemeById(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeById(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun updateTheme(themeId: String,body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.updateTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.deleteTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun getThemeForPreview(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeForPreview(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun publishTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.publishTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun unpublishTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.unpublishTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun archiveTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.archiveTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun unarchiveTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.unarchiveTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
}
}

class UserDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val userApiList by lazy {
        generateuserApiList()
    }
    
    private fun generateuserApiList(): UserApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformUser",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(UserApiList::class.java) as? UserApiList
    }
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCustomers(q: String?=null, pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<CustomerListResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getCustomers(companyId = config.companyId , applicationId = applicationId , q = q, pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    suspend fun searchUsers(q: String?=null)
    : Deferred<Response<UserSearchResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.searchUsers(companyId = config.companyId , applicationId = applicationId , q = q )
        } else {
            null
        }
    }
    
    
    suspend fun getPlatformConfig()
    : Deferred<Response<PlatformSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getPlatformConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updatePlatformConfig(body: PlatformSchema)
    : Deferred<Response<PlatformSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updatePlatformConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
}
}

class CommunicationDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCommunication",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CommunicationApiList::class.java) as? CommunicationApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getSystemNotifications(query: HashMap<String,Any>?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<SystemNotifications>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            communicationApiList?.getSystemNotifications(
        companyId = config.companyId, query = query, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCampaigns()
    : Deferred<Response<Campaigns>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCampaigns(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCampaigns
    **/
    fun getCampaignsPaginator(
    
    
    ) : Paginator<Campaigns>{
        val paginator = Paginator<Campaigns>()
        paginator.setCallBack(object : PaginatorCallback<Campaigns> {
            override suspend fun onNext(
                onSuccess: (Event<Campaigns>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getCampaigns(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<Campaigns>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getCampaigns(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    
    suspend fun getAudiences()
    : Deferred<Response<Audiences>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getAudiences(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAudiences
    **/
    fun getAudiencesPaginator(
    
    
    ) : Paginator<Audiences>{
        val paginator = Paginator<Audiences>()
        paginator.setCallBack(object : PaginatorCallback<Audiences> {
            override suspend fun onNext(
                onSuccess: (Event<Audiences>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getAudiences(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<Audiences>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getAudiences(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    
    suspend fun getEmailProviders()
    : Deferred<Response<EmailProviders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailProviders(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getEmailProviders
    **/
    fun getEmailProvidersPaginator(
    
    
    ) : Paginator<EmailProviders>{
        val paginator = Paginator<EmailProviders>()
        paginator.setCallBack(object : PaginatorCallback<EmailProviders> {
            override suspend fun onNext(
                onSuccess: (Event<EmailProviders>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getEmailProviders(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<EmailProviders>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getEmailProviders(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    
    suspend fun getEmailTemplates()
    : Deferred<Response<EmailTemplates>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEmailTemplates(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getEmailTemplates
    **/
    fun getEmailTemplatesPaginator(
    
    
    ) : Paginator<EmailTemplates>{
        val paginator = Paginator<EmailTemplates>()
        paginator.setCallBack(object : PaginatorCallback<EmailTemplates> {
            override suspend fun onNext(
                onSuccess: (Event<EmailTemplates>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getEmailTemplates(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<EmailTemplates>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getEmailTemplates(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    
    suspend fun getSystemEmailTemplates()
    : Deferred<Response<SystemEmailTemplates>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSystemEmailTemplates(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSystemEmailTemplates
    **/
    fun getSystemEmailTemplatesPaginator(
    
    
    ) : Paginator<SystemEmailTemplates>{
        val paginator = Paginator<SystemEmailTemplates>()
        paginator.setCallBack(object : PaginatorCallback<SystemEmailTemplates> {
            override suspend fun onNext(
                onSuccess: (Event<SystemEmailTemplates>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSystemEmailTemplates(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<SystemEmailTemplates>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSystemEmailTemplates(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    
    suspend fun getEventSubscriptions()
    : Deferred<Response<EventSubscriptions>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getEventSubscriptions(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getEventSubscriptions
    **/
    fun getEventSubscriptionsPaginator(
    
    
    ) : Paginator<EventSubscriptions>{
        val paginator = Paginator<EventSubscriptions>()
        paginator.setCallBack(object : PaginatorCallback<EventSubscriptions> {
            override suspend fun onNext(
                onSuccess: (Event<EventSubscriptions>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getEventSubscriptions(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<EventSubscriptions>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getEventSubscriptions(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    suspend fun getJobs()
    : Deferred<Response<Jobs>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getJobs(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getJobs
    **/
    fun getJobsPaginator(
    
    
    ) : Paginator<Jobs>{
        val paginator = Paginator<Jobs>()
        paginator.setCallBack(object : PaginatorCallback<Jobs> {
            override suspend fun onNext(
                onSuccess: (Event<Jobs>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getJobs(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<Jobs>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getJobs(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    
    suspend fun getJobLogs()
    : Deferred<Response<JobLogs>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getJobLogs(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getJobLogs
    **/
    fun getJobLogsPaginator(
    
    
    ) : Paginator<JobLogs>{
        val paginator = Paginator<JobLogs>()
        paginator.setCallBack(object : PaginatorCallback<JobLogs> {
            override suspend fun onNext(
                onSuccess: (Event<JobLogs>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getJobLogs(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<JobLogs>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getJobLogs(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    suspend fun getCommunicationLogs()
    : Deferred<Response<Logs>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getCommunicationLogs(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCommunicationLogs
    **/
    fun getCommunicationLogsPaginator(
    
    
    ) : Paginator<Logs>{
        val paginator = Paginator<Logs>()
        paginator.setCallBack(object : PaginatorCallback<Logs> {
            override suspend fun onNext(
                onSuccess: (Event<Logs>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getCommunicationLogs(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<Logs>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getCommunicationLogs(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    
    suspend fun getSmsProviders()
    : Deferred<Response<SmsProviders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsProviders(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSmsProviders
    **/
    fun getSmsProvidersPaginator(
    
    
    ) : Paginator<SmsProviders>{
        val paginator = Paginator<SmsProviders>()
        paginator.setCallBack(object : PaginatorCallback<SmsProviders> {
            override suspend fun onNext(
                onSuccess: (Event<SmsProviders>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSmsProviders(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<SmsProviders>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSmsProviders(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    
    suspend fun getSmsTemplates()
    : Deferred<Response<SmsTemplates>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSmsTemplates(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSmsTemplates
    **/
    fun getSmsTemplatesPaginator(
    
    
    ) : Paginator<SmsTemplates>{
        val paginator = Paginator<SmsTemplates>()
        paginator.setCallBack(object : PaginatorCallback<SmsTemplates> {
            override suspend fun onNext(
                onSuccess: (Event<SmsTemplates>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSmsTemplates(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<SmsTemplates>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSmsTemplates(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    
    suspend fun getSystemSystemTemplates()
    : Deferred<Response<SystemSmsTemplates>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                communicationApiList?.getSystemSystemTemplates(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSystemSystemTemplates
    **/
    fun getSystemSystemTemplatesPaginator(
    
    
    ) : Paginator<SystemSmsTemplates>{
        val paginator = Paginator<SystemSmsTemplates>()
        paginator.setCallBack(object : PaginatorCallback<SystemSmsTemplates> {
            override suspend fun onNext(
                onSuccess: (Event<SystemSmsTemplates>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSystemSystemTemplates(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<SystemSmsTemplates>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    communicationApiList?.getSystemSystemTemplates(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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

class PaymentDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val paymentApiList by lazy {
        generatepaymentApiList()
    }
    
    private fun generatepaymentApiList(): PaymentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformPayment",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(PaymentApiList::class.java) as? PaymentApiList
    }
    
    
    
    
    
    
    suspend fun getAllPayouts(uniqueExternalId: String?=null)
    : Deferred<Response<PayoutsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getAllPayouts(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId )
        } else {
            null
        } 
    }
    
    
    suspend fun savePayout(body: PayoutRequest)
    : Deferred<Response<PayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.savePayout(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updatePayout(uniqueTransferNo: String,body: PayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.updatePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun activateAndDectivatePayout(uniqueTransferNo: String,body: UpdatePayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.activateAndDectivatePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deletePayout(uniqueTransferNo: String)
    : Deferred<Response<DeletePayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.deletePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionPaymentMethod()
    : Deferred<Response<SubscriptionPaymentMethodResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getSubscriptionPaymentMethod(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteSubscriptionPaymentMethod(uniqueExternalId: String, paymentMethodId: String)
    : Deferred<Response<DeleteSubscriptionPaymentMethodResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.deleteSubscriptionPaymentMethod(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId, paymentMethodId = paymentMethodId )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionConfig()
    : Deferred<Response<SubscriptionConfigResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getSubscriptionConfig(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun saveSubscriptionSetupIntent(body: SaveSubscriptionSetupIntentRequest)
    : Deferred<Response<SaveSubscriptionSetupIntentResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.saveSubscriptionSetupIntent(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getBrandPaymentGatewayConfig()
    : Deferred<Response<PaymentGatewayConfigResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getBrandPaymentGatewayConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun saveBrandPaymentGatewayConfig(body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.saveBrandPaymentGatewayConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateBrandPaymentGatewayConfig(body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.updateBrandPaymentGatewayConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentModeRoutes(refresh: Boolean, requestType: String)
    : Deferred<Response<PaymentOptionsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentModeRoutes(companyId = config.companyId , applicationId = applicationId , refresh = refresh, requestType = requestType )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
}
}

class OrderDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val orderApiList by lazy {
        generateorderApiList()
    }
    
    private fun generateorderApiList(): OrderApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformOrder",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(OrderApiList::class.java) as? OrderApiList
    }
    
    
    suspend fun shipmentStatusUpdate(body: UpdateShipmentStatusBody)
    : Deferred<Response<UpdateShipmentStatusResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.shipmentStatusUpdate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun activityStatus(bagId: String)
    : Deferred<Response<GetActivityStatus>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.activityStatus(
        companyId = config.companyId, bagId = bagId )
        } else {
            null
        } 
    }
    
    
    suspend fun storeProcessShipmentUpdate(body: UpdateProcessShipmenstRequestBody)
    : Deferred<Response<UpdateProcessShipmenstRequestResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.storeProcessShipmentUpdate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getOrdersByCompanyId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, status: String?=null, shortenUrls: Boolean?=null, filterType: String?=null)
    : Deferred<Response<OrderListing>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrdersByCompanyId(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, status = status, shortenUrls = shortenUrls, filterType = filterType )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    suspend fun getPing()
    : Deferred<Response<GetPingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getPing(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun voiceCallback()
    : Deferred<Response<GetVoiceCallbackResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.voiceCallback(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun voiceClickToCall(caller: String, receiver: String)
    : Deferred<Response<GetClickToCallResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.voiceClickToCall(
        companyId = config.companyId, caller = caller, receiver = receiver )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    suspend fun trackShipmentPlatform(shipmentId: String)
    : Deferred<Response<PlatformShipmentTrack>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackShipmentPlatform(companyId = config.companyId , applicationId = applicationId , shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    suspend fun trackOrder(orderId: String)
    : Deferred<Response<PlatformOrderTrack>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackOrder(companyId = config.companyId , applicationId = applicationId , orderId = orderId )
        } else {
            null
        }
    }
    
    
    suspend fun failedOrders()
    : Deferred<Response<FailedOrders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.failedOrders(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun reprocessOrder(orderId: String)
    : Deferred<Response<UpdateOrderReprocessResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.reprocessOrder(companyId = config.companyId , applicationId = applicationId , orderId = orderId )
        } else {
            null
        }
    }
    
    
    
    
}
}

class CatalogDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val catalogApiList by lazy {
        generatecatalogApiList()
    }
    
    private fun generatecatalogApiList(): CatalogApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCatalog",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CatalogApiList::class.java) as? CatalogApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun createProductBundle(body: ProductBundleRequest)
    : Deferred<Response<GetProductBundleCreateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductBundle(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductBundle(q: String?=null)
    : Deferred<Response<GetProductBundleListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBundle(
        companyId = config.companyId, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun updateProductBundle(id: String,body: ProductBundleUpdateRequest)
    : Deferred<Response<GetProductBundleCreateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateProductBundle(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductBundleDetail(id: String)
    : Deferred<Response<GetProductBundleResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBundleDetail(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun createSizeGuide(body: ValidateSizeGuide)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createSizeGuide(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSizeGuides(active: Boolean?=null, q: String?=null, tag: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ListSizeGuide>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSizeGuides(
        companyId = config.companyId, active = active, q = q, tag = tag, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun updateSizeGuide(id: String,body: ValidateSizeGuide)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateSizeGuide(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSizeGuide(id: String)
    : Deferred<Response<SizeGuideResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSizeGuide(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getSellerInsights(sellerAppId: String)
    : Deferred<Response<CrossSellingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getSellerInsights(
        companyId = config.companyId, sellerAppId = sellerAppId )
        } else {
            null
        } 
    }
    
    
    suspend fun createMarketplaceOptin(marketplace: String,body: OptInPostRequest)
    : Deferred<Response<UpdatedResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createMarketplaceOptin(
        companyId = config.companyId, marketplace = marketplace, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getMarketplaceOptinDetail()
    : Deferred<Response<GetOptInPlatform>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getMarketplaceOptinDetail(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyDetail()
    : Deferred<Response<OptinCompanyDetail>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyDetail(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyBrandDetail(isActive: Boolean?=null, q: Boolean?=null, pageNo: Int?=null, pageSize: Int?=null, marketplace: String?=null)
    : Deferred<Response<OptinCompanyBrandDetailsView>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyBrandDetail(
        companyId = config.companyId, isActive = isActive, q = q, pageNo = pageNo, pageSize = pageSize, marketplace = marketplace )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyMetrics()
    : Deferred<Response<OptinCompanyMetrics>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyMetrics(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getStoreDetail(q: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<OptinStoreDetails>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getStoreDetail(
        companyId = config.companyId, q = q, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun listProductTemplateCategories(departments: String, itemType: String)
    : Deferred<Response<ProdcutTemplateCategoriesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateCategories(
        companyId = config.companyId, departments = departments, itemType = itemType )
        } else {
            null
        } 
    }
    
    
    suspend fun listDepartmentsData()
    : Deferred<Response<DepartmentsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listDepartmentsData(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getDepartmentData(uid: String)
    : Deferred<Response<DepartmentsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getDepartmentData(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun listProductTemplate(departments: String)
    : Deferred<Response<TemplatesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplate(
        companyId = config.companyId, departments = departments )
        } else {
            null
        } 
    }
    
    
    suspend fun validateProductTemplate(slug: String)
    : Deferred<Response<TemplatesValidationResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.validateProductTemplate(
        companyId = config.companyId, slug = slug )
        } else {
            null
        } 
    }
    
    
    suspend fun downloadProductTemplateViews(slug: String)
    : Deferred<Response<String>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.downloadProductTemplateViews(
        companyId = config.companyId, slug = slug )
        } else {
            null
        } 
    }
    
    
    suspend fun downloadProductTemplateView(itemType: String)
    : Deferred<Response<String>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.downloadProductTemplateView(
        companyId = config.companyId, itemType = itemType )
        } else {
            null
        } 
    }
    
    
    suspend fun validateProductTemplateSchema(itemType: String)
    : Deferred<Response<InventoryValidationResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.validateProductTemplateSchema(
        companyId = config.companyId, itemType = itemType )
        } else {
            null
        } 
    }
    
    
    suspend fun listHSNCodes()
    : Deferred<Response<HSNCodesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listHSNCodes(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun listProductTemplateExportDetails()
    : Deferred<Response<TemplatesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateExportDetails(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun listTemplateBrandTypeValues(filter: String)
    : Deferred<Response<ProductConfligurationDownloads>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listTemplateBrandTypeValues(
        companyId = config.companyId, filter = filter )
        } else {
            null
        } 
    }
    
    
    suspend fun createCategories(body: CategoryRequestBody)
    : Deferred<Response<CategoryCreateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createCategories(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun listCategories(level: String?=null, q: String?=null)
    : Deferred<Response<CategoryResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listCategories(
        companyId = config.companyId, level = level, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun updateCategory(uid: String,body: CategoryRequestBody)
    : Deferred<Response<CategoryUpdateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateCategory(
        companyId = config.companyId, uid = uid, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCategoryData(uid: String)
    : Deferred<Response<Category>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCategoryData(
        companyId = config.companyId, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun createProduct(body: ProductCreateUpdate)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProduct(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProducts(brandIds: Double?=null, categoryIds: Double?=null, search: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ProductListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProducts(
        companyId = config.companyId, brandIds = brandIds, categoryIds = categoryIds, search = search, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteProduct(itemId: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteProduct(
        companyId = config.companyId, itemId = itemId )
        } else {
            null
        } 
    }
    
    
    suspend fun editProduct(itemId: String,body: ProductCreateUpdate)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.editProduct(
        companyId = config.companyId, itemId = itemId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProduct(itemCode: String?=null, itemId: String, brandUid: Int?=null, uid: Int?=null)
    : Deferred<Response<Product>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProduct(
        itemCode = itemCode, companyId = config.companyId, itemId = itemId, brandUid = brandUid, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun getProductValidation()
    : Deferred<Response<ValidateProduct>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductValidation(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getProductSize(itemCode: String?=null, itemId: String, brandUid: Int?=null, uid: Int?=null)
    : Deferred<Response<ProductListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductSize(
        itemCode = itemCode, companyId = config.companyId, itemId = itemId, brandUid = brandUid, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun updateProductAssetsInBulk(body: BulkJob)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateProductAssetsInBulk(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductBulkUploadHistory(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ProductBulkRequestList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBulkUploadHistory(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteProductBulkJob(batchId: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteProductBulkJob(
        companyId = config.companyId, batchId = batchId )
        } else {
            null
        } 
    }
    
    
    suspend fun createProductsInBulk(batchId: String,body: BulkProductRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductsInBulk(
        companyId = config.companyId, batchId = batchId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyTags()
    : Deferred<Response<ProductTagsViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCompanyTags(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun createProductAssetsInBulk(body: ProductBulkAssets)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductAssetsInBulk(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getProductAssetsInBulk(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<BulkAssetResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductAssetsInBulk(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteSize(itemId: String, size: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteSize(
        companyId = config.companyId, itemId = itemId, size = size )
        } else {
            null
        } 
    }
    
    
    suspend fun addInventory(itemId: String, size: String,body: InventoryRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.addInventory(
        companyId = config.companyId, itemId = itemId, size = size, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getInventory(itemId: String, size: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<InventoryRequest1>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventory(
        companyId = config.companyId, itemId = itemId, size = size, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteInventory(itemId: String, locationId: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteInventory(
        companyId = config.companyId, itemId = itemId, locationId = locationId )
        } else {
            null
        } 
    }
    
    
    suspend fun createBulkInventoryJob(body: BulkJob)
    : Deferred<Response<CommonResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkInventoryJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryBulkUploadHistory(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<BulkRequestGet>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBulkUploadHistory(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteBulkInventoryJob()
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteBulkInventoryJob(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun createBulkInventory(body: InventoryBulkRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkInventory(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createInventoryExportJob(body: InventoryExportRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createInventoryExportJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryExport()
    : Deferred<Response<InventoryExportJob>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryExport(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun exportInventoryConfig(filterType: String?=null)
    : Deferred<Response<InventoryConfig>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.exportInventoryConfig(
        companyId = config.companyId, filterType = filterType )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun deleteSearchKeywords(id: String)
    : Deferred<Response<DeleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateSearchKeywords(id: String,body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSearchKeywords(id: String)
    : Deferred<Response<GetSearchWordsDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun createCustomKeyword(body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCustomKeyword(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAllSearchKeyword()
    : Deferred<Response<GetSearchWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllSearchKeyword(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun deleteAutocompleteKeyword(id: String)
    : Deferred<Response<DeleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteAutocompleteKeyword(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateAutocompleteKeyword(id: String,body: CreateAutocompleteKeyword)
    : Deferred<Response<GetAutocompleteWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAutocompleteKeyword(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompleteKeywordDetail(id: String)
    : Deferred<Response<GetAutocompleteWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteKeywordDetail(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun createCustomAutocompleteRule(body: CreateAutocompleteKeyword)
    : Deferred<Response<CreateAutocompleteWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCustomAutocompleteRule(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAutocompleteConfig()
    : Deferred<Response<GetAutocompleteWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    suspend fun getCatalogConfiguration()
    : Deferred<Response<GetCatalogConfigurationMetaData>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCatalogConfiguration(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createConfigurationProductListing(body: AppConfiguration)
    : Deferred<Response<GetAppCatalogConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createConfigurationProductListing(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurations()
    : Deferred<Response<GetAppCatalogConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurations(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createConfigurationByType(type: String,body: AppConfiguration)
    : Deferred<Response<GetAppCatalogConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createConfigurationByType(companyId = config.companyId , applicationId = applicationId , type = type, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getConfigurationByType(type: String)
    : Deferred<Response<GetAppCatalogEntityConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getConfigurationByType(companyId = config.companyId , applicationId = applicationId , type = type )
        } else {
            null
        }
    }
    
    
    suspend fun getQueryFilters()
    : Deferred<Response<GetCollectionQueryOptionResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getQueryFilters(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createCollection(body: CreateCollection)
    : Deferred<Response<CollectionCreateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCollection(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAllCollections()
    : Deferred<Response<GetCollectionListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllCollections(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getCollectionDetail(slug: String)
    : Deferred<Response<CollectionDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCollectionDetail(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun deleteCollection(id: String)
    : Deferred<Response<DeleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteCollection(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateCollection(id: String)
    : Deferred<Response<CollectionCreateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateCollection(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun addCollectionItems(id: String,body: CollectionItemRequest)
    : Deferred<Response<UpdatedResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.addCollectionItems(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCollectionItems(id: String, sortOn: String?=null, pageId: String?=null, pageSize: Int?=null)
    : Deferred<Response<GetCollectionItemsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCollectionItems(companyId = config.companyId , applicationId = applicationId , id = id, sortOn = sortOn, pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun getCatalogInsights(brand: String?=null)
    : Deferred<Response<CatalogInsightResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCatalogInsights(companyId = config.companyId , applicationId = applicationId , brand = brand )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}

class CompanyProfileDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val companyProfileApiList by lazy {
        generatecompanyProfileApiList()
    }
    
    private fun generatecompanyProfileApiList(): CompanyProfileApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCompanyProfile",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CompanyProfileApiList::class.java) as? CompanyProfileApiList
    }
    
    
    suspend fun updateCompany(body: CompanyStoreSerializerRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.updateCompany(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun cbsOnboardGet()
    : Deferred<Response<GetCompanyProfileSerializerResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.cbsOnboardGet(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyMetrics()
    : Deferred<Response<MetricsSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getCompanyMetrics(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBrand(brandId: String)
    : Deferred<Response<GetBrandResponseSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getBrand(
        companyId = config.companyId, brandId = brandId )
        } else {
            null
        } 
    }
    
    
    suspend fun editBrand(brandId: String,body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.editBrand(
        companyId = config.companyId, brandId = brandId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createBrand(body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createBrand(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createBrand(body: CompanyBrandPostRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createBrand(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getBrands()
    : Deferred<Response<CompanyBrandListSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getBrands(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun createLocation(body: LocationSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createLocation(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getLocations(storeType: String?=null, q: String?=null, stage: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<LocationListSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getLocations(
        companyId = config.companyId, storeType = storeType, q = q, stage = stage, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getLocationDetail(locationId: String)
    : Deferred<Response<GetLocationSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getLocationDetail(
        companyId = config.companyId, locationId = locationId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateLocation(locationId: String,body: LocationSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.updateLocation(
        companyId = config.companyId, locationId = locationId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
}
}

class AssetsDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val assetsApiList by lazy {
        generateassetsApiList()
    }
    
    private fun generateassetsApiList(): AssetsApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformAssets",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(AssetsApiList::class.java) as? AssetsApiList
    }
    
    
    suspend fun startUpload(namespace: String,body: StartRequest)
    : Deferred<Response<StartResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.startUpload(
        namespace = namespace, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun completeUpload(namespace: String,body: StartResponse)
    : Deferred<Response<CompleteResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.completeUpload(
        namespace = namespace, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun getSignUrls(body: SignUrlRequest)
    : Deferred<Response<SignUrlResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.getSignUrls(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun copyFiles(sync: Boolean?=null,body: BulkRequest)
    : Deferred<Response<BulkResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.copyFiles(
        sync = sync, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    suspend fun browse(namespace: String)
    : Deferred<Response<BrowseResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.browse(
        namespace = namespace, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    
    suspend fun proxy(url: String)
    : Deferred<Response<String>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.proxy(
        companyId = config.companyId, url = url )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    suspend fun appStartUpload(namespace: String,body: StartRequest)
    : Deferred<Response<StartResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                assetsApiList?.appStartUpload(namespace = namespace, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun appCompleteUpload(namespace: String,body: StartResponse)
    : Deferred<Response<CompleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                assetsApiList?.appCompleteUpload(namespace = namespace, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun appCopyFiles(sync: Boolean?=null,body: BulkRequest)
    : Deferred<Response<BulkResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                assetsApiList?.appCopyFiles(sync = sync, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    suspend fun appBrowse(namespace: String)
    : Deferred<Response<BrowseResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                assetsApiList?.appBrowse(namespace = namespace, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for appBrowse
    **/
    fun appBrowsePaginator(
    namespace: String
    
    ) : Paginator<BrowseResponse>{
        val paginator = Paginator<BrowseResponse>()
        paginator.setCallBack(object : PaginatorCallback<BrowseResponse> {
            override suspend fun onNext(
                onSuccess: (Event<BrowseResponse>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    assetsApiList?.appBrowse(namespace = namespace, companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<BrowseResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    assetsApiList?.appBrowse(namespace = namespace, companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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

class ShareDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val shareApiList by lazy {
        generateshareApiList()
    }
    
    private fun generateshareApiList(): ShareApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformShare",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ShareApiList::class.java) as? ShareApiList
    }
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun createShortLink(body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.createShortLink(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getShortLinks(pageNo: String?=null, pageSize: String?=null, createdBy: String?=null, active: String?=null, q: String?=null)
    : Deferred<Response<ShortLinkList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinks(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, createdBy = createdBy, active = active, q = q )
        } else {
            null
        }
    }
    
    
    suspend fun getShortLinkByHash(hash: String)
    : Deferred<Response<ShortLinkRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinkByHash(companyId = config.companyId , applicationId = applicationId , hash = hash )
        } else {
            null
        }
    }
    
    
    suspend fun updateShortLinkById(id: String)
    : Deferred<Response<ShortLinkRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.updateShortLinkById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
}
}

class ConfigurationDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val configurationApiList by lazy {
        generateconfigurationApiList()
    }
    
    private fun generateconfigurationApiList(): ConfigurationApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformConfiguration",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ConfigurationApiList::class.java) as? ConfigurationApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun createApplication(body: CreateApplicationRequest)
    : Deferred<Response<CreateAppResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.createApplication(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getApplications(pageNo: Int?=null, pageSize: Int?=null, q: HashMap<String,Any>?=null)
    : Deferred<Response<ApplicationsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getApplications(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getCurrencies()
    : Deferred<Response<CurrenciesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getCurrencies(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getDomainAvailibility(body: DomainSuggestionsRequest)
    : Deferred<Response<DomainSuggestionsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getDomainAvailibility(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getIntegrationById(id: String)
    : Deferred<Response<Integration>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getIntegrationById(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun getAvailableOptIns(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<GetIntegrationsOptInsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getAvailableOptIns(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getSelectedOptIns(level: String, uid: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<GetIntegrationsOptInsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getSelectedOptIns(
        companyId = config.companyId, level = level, uid = uid, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getIntegrationLevelConfig(id: String, level: String)
    : Deferred<Response<IntegrationConfigResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getIntegrationLevelConfig(
        companyId = config.companyId, id = id, level = level )
        } else {
            null
        } 
    }
    
    
    suspend fun getIntegrationByLevelId(id: String, level: String, uid: String)
    : Deferred<Response<IntegrationLevel>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getIntegrationByLevelId(
        companyId = config.companyId, id = id, level = level, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun getLevelActiveIntegrations(id: String, level: String, uid: String)
    : Deferred<Response<OptedStoreIntegration>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getLevelActiveIntegrations(
        companyId = config.companyId, id = id, level = level, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun getBrandsByCompany(q: String?=null)
    : Deferred<Response<BrandsByCompanyResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getBrandsByCompany(
        companyId = config.companyId, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyByBrands(pageNo: Int?=null, pageSize: Int?=null,body: CompanyByBrandsRequest)
    : Deferred<Response<CompanyByBrandsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getCompanyByBrands(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getStoreByBrands(pageNo: Int?=null, pageSize: Int?=null,body: StoreByBrandsRequest)
    : Deferred<Response<StoreByBrandsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getStoreByBrands(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getOtherSellerApplications()
    : Deferred<Response<OtherSellerApplications>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getOtherSellerApplications(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getOtherSellerApplicationById(id: String)
    : Deferred<Response<OptedApplicationResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getOtherSellerApplicationById(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun optOutFromApplication(id: String,body: OptOutInventory)
    : Deferred<Response<SuccessMessageResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.optOutFromApplication(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getBuildConfig(platformType: String)
    : Deferred<Response<MobileAppConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getBuildConfig(companyId = config.companyId , applicationId = applicationId , platformType = platformType )
        } else {
            null
        }
    }
    
    
    suspend fun updateBuildConfig(platformType: String,body: MobileAppConfigRequest)
    : Deferred<Response<MobileAppConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateBuildConfig(companyId = config.companyId , applicationId = applicationId , platformType = platformType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPreviousVersions(platformType: String)
    : Deferred<Response<BuildVersionHistory>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getPreviousVersions(companyId = config.companyId , applicationId = applicationId , platformType = platformType )
        } else {
            null
        }
    }
    
    
    suspend fun getAppFeatures()
    : Deferred<Response<AppFeatureResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppFeatures(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppFeatures(body: AppFeatureRequest)
    : Deferred<Response<AppFeature>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppFeatures(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppBasicDetails()
    : Deferred<Response<ApplicationDetail>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppBasicDetails(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppBasicDetails(body: ApplicationDetail)
    : Deferred<Response<ApplicationDetail>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppBasicDetails(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppContactInfo()
    : Deferred<Response<ApplicationInformation>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppContactInfo(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppContactInfo(body: ApplicationInformation)
    : Deferred<Response<ApplicationInformation>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppContactInfo(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppApiTokens()
    : Deferred<Response<TokenResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppApiTokens(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppApiTokens(body: TokenResponse)
    : Deferred<Response<TokenResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppApiTokens(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCompanies()
    : Deferred<Response<CompaniesResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppCompanies(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppCompanies
    **/
    fun getAppCompaniesPaginator(
    
    
    ) : Paginator<CompaniesResponse>{
        val paginator = Paginator<CompaniesResponse>()
        paginator.setCallBack(object : PaginatorCallback<CompaniesResponse> {
            override suspend fun onNext(
                onSuccess: (Event<CompaniesResponse>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getAppCompanies(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<CompaniesResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getAppCompanies(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    suspend fun getAppStores()
    : Deferred<Response<StoresResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppStores(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppStores
    **/
    fun getAppStoresPaginator(
    
    
    ) : Paginator<StoresResponse>{
        val paginator = Paginator<StoresResponse>()
        paginator.setCallBack(object : PaginatorCallback<StoresResponse> {
            override suspend fun onNext(
                onSuccess: (Event<StoresResponse>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getAppStores(companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<StoresResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getAppStores(companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    suspend fun getInventoryConfig()
    : Deferred<Response<ApplicationInventory>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getInventoryConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateInventoryConfig(body: ApplicationInventory)
    : Deferred<Response<ApplicationInventory>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateInventoryConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun partiallyUpdateInventoryConfig(body: AppInventoryPartialUpdate)
    : Deferred<Response<ApplicationInventory>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.partiallyUpdateInventoryConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCurrencyConfig()
    : Deferred<Response<AppSupportedCurrency>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppCurrencyConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCurrencyConfig(body: AppSupportedCurrency)
    : Deferred<Response<AppSupportedCurrency>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppCurrencyConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getOrderingStoresByFilter(body: FilterOrderingStoreRequest)
    : Deferred<Response<OrderingStores>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getOrderingStoresByFilter(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getOrderingStoresByFilter
    **/
    fun getOrderingStoresByFilterPaginator(
    
    body: FilterOrderingStoreRequest
    ) : Paginator<OrderingStores>{
        val paginator = Paginator<OrderingStores>()
        paginator.setCallBack(object : PaginatorCallback<OrderingStores> {
            override suspend fun onNext(
                onSuccess: (Event<OrderingStores>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getOrderingStoresByFilter(companyId = config.companyId , applicationId = applicationId ,body: FilterOrderingStoreRequest)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<OrderingStores>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getOrderingStoresByFilter(companyId = config.companyId , applicationId = applicationId ,body: FilterOrderingStoreRequest)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    suspend fun updateOrderingStoreConfig(body: OrderingStoreConfig)
    : Deferred<Response<DeploymentMeta>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateOrderingStoreConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getDomains()
    : Deferred<Response<DomainsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getDomains(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun addDomain(body: DomainAddRequest)
    : Deferred<Response<Domain>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.addDomain(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun removeDomainById(id: String)
    : Deferred<Response<SuccessMessageResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.removeDomainById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun changeDomainType(body: UpdateDomainTypeRequest)
    : Deferred<Response<DomainsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.changeDomainType(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getDomainStatus(body: DomainStatusRequest)
    : Deferred<Response<DomainStatusResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getDomainStatus(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getApplicationById()
    : Deferred<Response<Application>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getApplicationById(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}

class CartDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val cartApiList by lazy {
        generatecartApiList()
    }
    
    private fun generatecartApiList(): CartApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCart",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CartApiList::class.java) as? CartApiList
    }
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCoupons(pageNo: Int?=null, pageSize: Int?=null, isArchived: Boolean?=null, title: String?=null, isPublic: Boolean?=null, isDisplay: Boolean?=null, typeSlug: String?=null, code: String?=null)
    : Deferred<Response<CouponsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCoupons(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, isArchived = isArchived, title = title, isPublic = isPublic, isDisplay = isDisplay, typeSlug = typeSlug, code = code )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCoupons
    **/
    fun getCouponsPaginator(
    pageSize: Int?=null, isArchived: Boolean?=null, title: String?=null, isPublic: Boolean?=null, isDisplay: Boolean?=null, typeSlug: String?=null, code: String?=null
    
    ) : Paginator<CouponsResponse>{
        val paginator = Paginator<CouponsResponse>()
        paginator.setCallBack(object : PaginatorCallback<CouponsResponse> {
            override suspend fun onNext(
                onSuccess: (Event<CouponsResponse>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    cartApiList?.getCoupons(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, isArchived = isArchived, title = title, isPublic = isPublic, isDisplay = isDisplay, typeSlug = typeSlug, code = code)?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<CouponsResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    cartApiList?.getCoupons(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, isArchived = isArchived, title = title, isPublic = isPublic, isDisplay = isDisplay, typeSlug = typeSlug, code = code)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
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
    
    suspend fun createCoupon(body: CouponAdd)
    : Deferred<Response<SuccessMessage>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.createCoupon(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCouponById(id: String)
    : Deferred<Response<CouponUpdate>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.getCouponById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateCoupon(id: String,body: CouponUpdate)
    : Deferred<Response<SuccessMessage>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCoupon(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateCouponPartially(id: String,body: CouponPartialUpdate)
    : Deferred<Response<SuccessMessage>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.updateCouponPartially(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
}
}

class MarketplacesDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val marketplacesApiList by lazy {
        generatemarketplacesApiList()
    }
    
    private fun generatemarketplacesApiList(): MarketplacesApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformMarketplaces",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(MarketplacesApiList::class.java) as? MarketplacesApiList
    }
    
    
    suspend fun getAvailableChannels()
    : Deferred<Response<AllChannels>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.getAvailableChannels(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getChannels()
    : Deferred<Response<HashMap<String,Any>>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.getChannels(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getChannel(channel: String)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.getChannel(
        companyId = config.companyId, channel = channel )
        } else {
            null
        } 
    }
    
    
    suspend fun registerMyntraChannel(body: MyntraPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.registerMyntraChannel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateMyntraChannelCredentials(body: MyntraPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateMyntraChannelCredentials(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun registerAmazonChannel(body: AmazonPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.registerAmazonChannel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateAmazonChannelCredentials(body: AmazonPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateAmazonChannelCredentials(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun registerFlipkartChannel(flipkartChannel: String,body: FlipkartPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.registerFlipkartChannel(
        companyId = config.companyId, flipkartChannel = flipkartChannel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateFlipkartChannelCredentials(flipkartChannel: String,body: FlipkartPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateFlipkartChannelCredentials(
        companyId = config.companyId, flipkartChannel = flipkartChannel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun registerTatacliqChannel(tatacliqChannel: String,body: TatacliqPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.registerTatacliqChannel(
        companyId = config.companyId, tatacliqChannel = tatacliqChannel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateTatacliqChannelCredentials(tatacliqChannel: String,body: TatacliqPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateTatacliqChannelCredentials(
        companyId = config.companyId, tatacliqChannel = tatacliqChannel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun registerAjioChannel(body: AjioPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.registerAjioChannel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateAjioChannelCredentials(body: AjioPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateAjioChannelCredentials(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateChannelInventoryConfig(channel: String, validateCred: String?=null,body: InventoryConfig)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateChannelInventoryConfig(
        companyId = config.companyId, channel = channel, validateCred = validateCred, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getChannelLocationConfig(channel: String)
    : Deferred<Response<StoreMapping>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.getChannelLocationConfig(
        companyId = config.companyId, channel = channel )
        } else {
            null
        } 
    }
    
    
    suspend fun updateChannelLocationConfig(channel: String,body: StoreMappingPayload)
    : Deferred<Response<StoreMapping>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateChannelLocationConfig(
        companyId = config.companyId, channel = channel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getChannelStatus(channel: String)
    : Deferred<Response<StatusPayload>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.getChannelStatus(
        companyId = config.companyId, channel = channel )
        } else {
            null
        } 
    }
    
    
    suspend fun updateChannelStatus(channel: String,body: StatusPayload)
    : Deferred<Response<StatusResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateChannelStatus(
        companyId = config.companyId, channel = channel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun triggerChannelInventoryUpdates(channel: String, updateType: String,body: SyncPayload)
    : Deferred<Response<SyncResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.triggerChannelInventoryUpdates(
        companyId = config.companyId, channel = channel, updateType = updateType, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}

class AnalyticsDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val analyticsApiList by lazy {
        generateanalyticsApiList()
    }
    
    private fun generateanalyticsApiList(): AnalyticsApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformAnalytics",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(AnalyticsApiList::class.java) as? AnalyticsApiList
    }
    
    
    
    
    
    
    
    
    
    
    suspend fun createExportJob(exportType: String,body: ExportJobReq)
    : Deferred<Response<ExportJobRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.createExportJob(
        companyId = config.companyId, exportType = exportType, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getExportJobStatus(exportType: String, jobId: String)
    : Deferred<Response<ExportJobStatusRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.getExportJobStatus(
        companyId = config.companyId, exportType = exportType, jobId = jobId )
        } else {
            null
        } 
    }
    
    
    suspend fun getLogsList(logType: String, pageNo: String?=null, pageSize: String?=null,body: GetLogsListReq)
    : Deferred<Response<GetLogsListRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.getLogsList(
        companyId = config.companyId, logType = logType, pageNo = pageNo, pageSize = pageSize, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun searchLogs(pageNo: String?=null, pageSize: String?=null, logType: String,body: SearchLogReq)
    : Deferred<Response<SearchLogRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.searchLogs(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, logType = logType, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getStatiscticsGroups()
    : Deferred<Response<StatsGroups>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getStatiscticsGroups(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getStatiscticsGroupComponents(groupName: String)
    : Deferred<Response<StatsGroupComponents>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getStatiscticsGroupComponents(companyId = config.companyId , applicationId = applicationId , groupName = groupName )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentStatsCSV(componentName: String)
    : Deferred<Response<String>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getComponentStatsCSV(companyId = config.companyId , applicationId = applicationId , componentName = componentName )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentStatsPDF(componentName: String)
    : Deferred<Response<String>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getComponentStatsPDF(companyId = config.companyId , applicationId = applicationId , componentName = componentName )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentStats(componentName: String)
    : Deferred<Response<StatsRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getComponentStats(companyId = config.companyId , applicationId = applicationId , componentName = componentName )
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonCartList(from: String, to: String, pageNo: String?=null, pageSize: String?=null)
    : Deferred<Response<AbandonCartsList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getAbandonCartList(companyId = config.companyId , applicationId = applicationId , from = from, to = to, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonCartsCSV(from: String, to: String)
    : Deferred<Response<String>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getAbandonCartsCSV(companyId = config.companyId , applicationId = applicationId , from = from, to = to )
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonCartDetail(cartId: String)
    : Deferred<Response<AbandonCartDetail>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getAbandonCartDetail(companyId = config.companyId , applicationId = applicationId , cartId = cartId )
        } else {
            null
        }
    }
    
    
    
    
    
}
}