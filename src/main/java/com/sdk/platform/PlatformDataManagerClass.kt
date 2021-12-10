package com.sdk.platform

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*




class CommonDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val commonApiList by lazy {
        generatecommonApiList()
    }
    
    private fun generatecommonApiList(): CommonApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCommon",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CommonApiList::class.java) as? CommonApiList
    }
    
    
    suspend fun getLocations(locationType: String?=null, id: String?=null)
    : Deferred<Response<Locations>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            commonApiList?.getLocations(
        locationType = locationType, id = id )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
}
}

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
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformLead",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(LeadApiList::class.java) as? LeadApiList
    }
    
    
    suspend fun getTickets(items: Boolean?=null, filters: Boolean?=null, q: String?=null, status: String?=null, priority: PriorityEnum?=null, category: String?=null, pageNo: Int?=null, pageSize: Int?=null)
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
    
    
    
    suspend fun getTicket(id: String)
    : Deferred<Response<Ticket>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getTicket(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun editTicket(id: String,body: EditTicketPayload)
    : Deferred<Response<Ticket>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.editTicket(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun createHistory(id: String,body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.createHistory(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getTicketHistory(id: String)
    : Deferred<Response<TicketHistoryList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getTicketHistory(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun getFeedbacks(id: String)
    : Deferred<Response<TicketFeedbackList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getFeedbacks(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun submitFeedback(id: String,body: TicketFeedbackPayload)
    : Deferred<Response<TicketFeedback>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.submitFeedback(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    suspend fun getTokenForVideoRoom(uniqueName: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getTokenForVideoRoom(
        companyId = config.companyId, uniqueName = uniqueName )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getVideoParticipants(uniqueName: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getVideoParticipants(
        companyId = config.companyId, uniqueName = uniqueName )
        } else {
            null
        } 
    }
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    suspend fun getTickets(items: Boolean?=null, filters: Boolean?=null, q: String?=null, status: String?=null, priority: PriorityEnum?=null, category: String?=null)
    : Deferred<Response<TicketList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTickets(companyId = config.companyId , applicationId = applicationId , items = items, filters = filters, q = q, status = status, priority = priority, category = category )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getTicket(id: String)
    : Deferred<Response<Ticket>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTicket(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun editTicket(id: String,body: EditTicketPayload)
    : Deferred<Response<Ticket>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.editTicket(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    
    
    
    
    suspend fun createHistory(id: String,body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.createHistory(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getTicketHistory(id: String)
    : Deferred<Response<TicketHistoryList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTicketHistory(companyId = config.companyId , applicationId = applicationId , id = id )
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

class FeedbackDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val feedbackApiList by lazy {
        generatefeedbackApiList()
    }
    
    private fun generatefeedbackApiList(): FeedbackApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformFeedback",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(FeedbackApiList::class.java) as? FeedbackApiList
    }
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getAttributes(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<FeedbackAttributes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.getAttributes(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAttributes
    **/
    fun getAttributesPaginator(
    pageSize: Int?=null
    
    ) : Paginator<FeedbackAttributes>{
        val paginator = Paginator<FeedbackAttributes>()
        paginator.setCallBack(object : PaginatorCallback<FeedbackAttributes> {
            
            override suspend fun onNext(
                onResponse: (Event<FeedbackAttributes>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    feedbackApiList?.getAttributes(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun getCustomerReviews(id: String?=null, entityId: String?=null, entityType: String?=null, userId: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attributeRating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, next: String?=null, start: String?=null, limit: String?=null, count: String?=null, pageId: String?=null, pageSize: Int?=null)
    : Deferred<Response<GetReviewResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.getCustomerReviews(companyId = config.companyId , applicationId = applicationId , id = id, entityId = entityId, entityType = entityType, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, next = next, start = start, limit = limit, count = count, pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCustomerReviews
    **/
    fun getCustomerReviewsPaginator(
    id: String?=null, entityId: String?=null, entityType: String?=null, userId: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attributeRating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, next: String?=null, start: String?=null, limit: String?=null, count: String?=null, pageSize: Int?=null
    
    ) : Paginator<GetReviewResponse>{
        val paginator = Paginator<GetReviewResponse>()
        paginator.setCallBack(object : PaginatorCallback<GetReviewResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<GetReviewResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    feedbackApiList?.getCustomerReviews(companyId = config.companyId , applicationId = applicationId , id = id, entityId = entityId, entityType = entityType, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, next = next, start = start, limit = limit, count = count, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun updateApprove(reviewId: String,body: ApproveRequest)
    : Deferred<Response<UpdateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.updateApprove(companyId = config.companyId , applicationId = applicationId , reviewId = reviewId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getHistory(reviewId: String)
    : Deferred<Response<ArrayList<ActivityDump>>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.getHistory(companyId = config.companyId , applicationId = applicationId , reviewId = reviewId )
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationTemplates(pageId: String?=null, pageSize: Int?=null)
    : Deferred<Response<TemplateGetResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.getApplicationTemplates(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getApplicationTemplates
    **/
    fun getApplicationTemplatesPaginator(
    pageSize: Int?=null
    
    ) : Paginator<TemplateGetResponse>{
        val paginator = Paginator<TemplateGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<TemplateGetResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<TemplateGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    feedbackApiList?.getApplicationTemplates(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createTemplate(body: TemplateRequestList)
    : Deferred<Response<InsertResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.createTemplate(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getTemplateById(id: String)
    : Deferred<Response<Template>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.getTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateTemplate(id: String,body: UpdateTemplateRequest)
    : Deferred<Response<UpdateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.updateTemplate(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateTemplateStatus(id: String,body: UpdateTemplateStatusRequest)
    : Deferred<Response<UpdateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.updateTemplateStatus(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
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
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformTheme",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ThemeApiList::class.java) as? ThemeApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getAllPages(themeId: String)
    : Deferred<Response<AllAvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getAllPages(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun createPage(themeId: String,body: AvailablePageSchema)
    : Deferred<Response<AvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.createPage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateMultiplePages(themeId: String,body: AllAvailablePageSchema)
    : Deferred<Response<AllAvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.updateMultiplePages(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPage(themeId: String, pageValue: String)
    : Deferred<Response<AvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getPage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, pageValue = pageValue )
        } else {
            null
        }
    }
    
    
    suspend fun updatePage(themeId: String, pageValue: String,body: AvailablePageSchema)
    : Deferred<Response<AvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.updatePage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, pageValue = pageValue, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deletePage(themeId: String, pageValue: String)
    : Deferred<Response<AvailablePageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.deletePage(companyId = config.companyId , applicationId = applicationId , themeId = themeId, pageValue = pageValue )
        } else {
            null
        }
    }
    
    
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
        HttpClient.setDebuggable(config.debuggable)
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
    
    
    suspend fun searchUsers(q: HashMap<String,Any>?=null)
    : Deferred<Response<UserSearchResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.searchUsers(companyId = config.companyId , applicationId = applicationId , q = q )
        } else {
            null
        }
    }
    
    
    suspend fun createUser(body: CreateUserRequestSchema)
    : Deferred<Response<CreateUserResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.createUser(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateUser(userId: String,body: UpdateUserRequestSchema)
    : Deferred<Response<CreateUserResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updateUser(companyId = config.companyId , applicationId = applicationId , userId = userId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun createUserSession(body: CreateUserSessionRequestSchema)
    : Deferred<Response<CreateUserSessionResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.createUserSession(companyId = config.companyId , applicationId = applicationId , body = body)
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

class ContentDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val contentApiList by lazy {
        generatecontentApiList()
    }
    
    private fun generatecontentApiList(): ContentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformContent",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ContentApiList::class.java) as? ContentApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getAnnouncementsList(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<GetAnnouncementListSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAnnouncementsList(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAnnouncementsList
    **/
    fun getAnnouncementsListPaginator(
    pageSize: Int?=null
    
    ) : Paginator<GetAnnouncementListSchema>{
        val paginator = Paginator<GetAnnouncementListSchema>()
        paginator.setCallBack(object : PaginatorCallback<GetAnnouncementListSchema> {
            
            override suspend fun onNext(
                onResponse: (Event<GetAnnouncementListSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getAnnouncementsList(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createAnnouncement(body: AdminAnnouncementSchema)
    : Deferred<Response<CreateAnnouncementSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createAnnouncement(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAnnouncementById(announcementId: String)
    : Deferred<Response<AdminAnnouncementSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getAnnouncementById(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId )
        } else {
            null
        }
    }
    
    
    suspend fun updateAnnouncement(announcementId: String,body: AdminAnnouncementSchema)
    : Deferred<Response<CreateAnnouncementSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAnnouncement(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateAnnouncementSchedule(announcementId: String,body: ScheduleSchema)
    : Deferred<Response<CreateAnnouncementSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateAnnouncementSchedule(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAnnouncement(announcementId: String)
    : Deferred<Response<CreateAnnouncementSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAnnouncement(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId )
        } else {
            null
        }
    }
    
    
    suspend fun createBlog(body: BlogRequest)
    : Deferred<Response<BlogSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createBlog(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getBlogs(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<BlogGetResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getBlogs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getBlogs
    **/
    fun getBlogsPaginator(
    pageSize: Int?=null
    
    ) : Paginator<BlogGetResponse>{
        val paginator = Paginator<BlogGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<BlogGetResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<BlogGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getBlogs(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun updateBlog(id: String,body: BlogRequest)
    : Deferred<Response<BlogSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateBlog(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteBlog(id: String)
    : Deferred<Response<BlogSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteBlog(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentById(slug: String)
    : Deferred<Response<BlogSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getComponentById(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun getFaqCategories()
    : Deferred<Response<GetFaqCategoriesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqCategories(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getFaqCategoryBySlugOrId(idOrSlug: String)
    : Deferred<Response<GetFaqCategoryBySlugSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqCategoryBySlugOrId(companyId = config.companyId , applicationId = applicationId , idOrSlug = idOrSlug )
        } else {
            null
        }
    }
    
    
    suspend fun createFaqCategory(body: CreateFaqCategoryRequestSchema)
    : Deferred<Response<CreateFaqCategorySchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createFaqCategory(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateFaqCategory(id: String,body: UpdateFaqCategoryRequestSchema)
    : Deferred<Response<CreateFaqCategorySchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateFaqCategory(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteFaqCategory(id: String)
    : Deferred<Response<FaqSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteFaqCategory(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getFaqsByCategoryIdOrSlug(idOrSlug: String)
    : Deferred<Response<GetFaqSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqsByCategoryIdOrSlug(companyId = config.companyId , applicationId = applicationId , idOrSlug = idOrSlug )
        } else {
            null
        }
    }
    
    
    suspend fun addFaq(categoryId: String,body: CreateFaqSchema)
    : Deferred<Response<CreateFaqResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.addFaq(companyId = config.companyId , applicationId = applicationId , categoryId = categoryId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateFaq(categoryId: String, faqId: String,body: CreateFaqSchema)
    : Deferred<Response<CreateFaqResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateFaq(companyId = config.companyId , applicationId = applicationId , categoryId = categoryId, faqId = faqId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteFaq(categoryId: String, faqId: String)
    : Deferred<Response<CreateFaqResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteFaq(companyId = config.companyId , applicationId = applicationId , categoryId = categoryId, faqId = faqId )
        } else {
            null
        }
    }
    
    
    suspend fun getFaqByIdOrSlug(idOrSlug: String)
    : Deferred<Response<CreateFaqResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getFaqByIdOrSlug(companyId = config.companyId , applicationId = applicationId , idOrSlug = idOrSlug )
        } else {
            null
        }
    }
    
    
    suspend fun getLandingPages(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<LandingPageGetResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getLandingPages(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getLandingPages
    **/
    fun getLandingPagesPaginator(
    pageSize: Int?=null
    
    ) : Paginator<LandingPageGetResponse>{
        val paginator = Paginator<LandingPageGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<LandingPageGetResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<LandingPageGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getLandingPages(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createLandingPage(body: LandingPageSchema)
    : Deferred<Response<LandingPageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createLandingPage(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateLandingPage(id: String,body: LandingPageSchema)
    : Deferred<Response<LandingPageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateLandingPage(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteLandingPage(id: String)
    : Deferred<Response<LandingPageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteLandingPage(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getLegalInformation()
    : Deferred<Response<ApplicationLegal>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getLegalInformation(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateLegalInformation(body: ApplicationLegal)
    : Deferred<Response<ApplicationLegal>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateLegalInformation(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getNavigations(devicePlatform: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<NavigationGetResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getNavigations(companyId = config.companyId , applicationId = applicationId , devicePlatform = devicePlatform, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getNavigations
    **/
    fun getNavigationsPaginator(
    devicePlatform: String, pageSize: Int?=null
    
    ) : Paginator<NavigationGetResponse>{
        val paginator = Paginator<NavigationGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<NavigationGetResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<NavigationGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getNavigations(companyId = config.companyId , applicationId = applicationId , devicePlatform = devicePlatform, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createNavigation(body: NavigationRequest)
    : Deferred<Response<NavigationSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createNavigation(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getDefaultNavigations()
    : Deferred<Response<DefaultNavigationResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getDefaultNavigations(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getNavigationBySlug(slug: String, devicePlatform: String)
    : Deferred<Response<NavigationSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getNavigationBySlug(companyId = config.companyId , applicationId = applicationId , slug = slug, devicePlatform = devicePlatform )
        } else {
            null
        }
    }
    
    
    suspend fun updateNavigation(id: String,body: NavigationRequest)
    : Deferred<Response<NavigationSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateNavigation(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteNavigation(id: String)
    : Deferred<Response<NavigationSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteNavigation(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getPageMeta(pageType: String?=null, cartPages: Boolean?=null)
    : Deferred<Response<PageMetaSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPageMeta(companyId = config.companyId , applicationId = applicationId , pageType = pageType, cartPages = cartPages )
        } else {
            null
        }
    }
    
    
    suspend fun getPageSpec()
    : Deferred<Response<PageSpec>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPageSpec(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createPagePreview(body: PageRequest)
    : Deferred<Response<PageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createPagePreview(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updatePagePreview(slug: String,body: PagePublishRequest)
    : Deferred<Response<PageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updatePagePreview(companyId = config.companyId , applicationId = applicationId , slug = slug, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deletePage(id: String)
    : Deferred<Response<PageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deletePage(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updatePathRedirectionRules(body: PathMappingSchema)
    : Deferred<Response<PathMappingSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updatePathRedirectionRules(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPathRedirectionRules()
    : Deferred<Response<PathMappingSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPathRedirectionRules(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getSEOConfiguration()
    : Deferred<Response<SeoComponent>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSEOConfiguration(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateSEOConfiguration(body: SeoComponent)
    : Deferred<Response<SeoSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateSEOConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSlideshows(devicePlatform: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<SlideshowGetResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSlideshows(companyId = config.companyId , applicationId = applicationId , devicePlatform = devicePlatform, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getSlideshows
    **/
    fun getSlideshowsPaginator(
    devicePlatform: String, pageSize: Int?=null
    
    ) : Paginator<SlideshowGetResponse>{
        val paginator = Paginator<SlideshowGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<SlideshowGetResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<SlideshowGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getSlideshows(companyId = config.companyId , applicationId = applicationId , devicePlatform = devicePlatform, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createSlideshow(body: SlideshowRequest)
    : Deferred<Response<SlideshowSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createSlideshow(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getSlideshowBySlug(slug: String, devicePlatform: String)
    : Deferred<Response<SlideshowSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSlideshowBySlug(companyId = config.companyId , applicationId = applicationId , slug = slug, devicePlatform = devicePlatform )
        } else {
            null
        }
    }
    
    
    suspend fun updateSlideshow(id: String,body: SlideshowRequest)
    : Deferred<Response<SlideshowSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateSlideshow(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSlideshow(id: String)
    : Deferred<Response<SlideshowSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteSlideshow(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getSupportInformation()
    : Deferred<Response<Support>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getSupportInformation(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateSupportInformation(body: Support)
    : Deferred<Response<Support>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateSupportInformation(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateInjectableTag(body: CreateTagRequestSchema)
    : Deferred<Response<TagsSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updateInjectableTag(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteAllInjectableTags()
    : Deferred<Response<TagsSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.deleteAllInjectableTags(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getInjectableTags()
    : Deferred<Response<TagsSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getInjectableTags(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun addInjectableTag(body: CreateTagRequestSchema)
    : Deferred<Response<TagsSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.addInjectableTag(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun removeInjectableTag(body: RemoveHandpickedSchema)
    : Deferred<Response<TagDeleteSuccessResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.removeInjectableTag(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun editInjectableTag(tagId: String,body: UpdateHandpickedSchema)
    : Deferred<Response<TagsSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.editInjectableTag(companyId = config.companyId , applicationId = applicationId , tagId = tagId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun createPage(body: PageRequest)
    : Deferred<Response<PageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.createPage(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPages(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<PageGetResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPages(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getPages
    **/
    fun getPagesPaginator(
    pageSize: Int?=null
    
    ) : Paginator<PageGetResponse>{
        val paginator = Paginator<PageGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<PageGetResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<PageGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    contentApiList?.getPages(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun updatePage(id: String,body: PageSchema)
    : Deferred<Response<PageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.updatePage(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPageBySlug(slug: String)
    : Deferred<Response<PageSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                contentApiList?.getPageBySlug(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
}
}

class BillingDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val billingApiList by lazy {
        generatebillingApiList()
    }
    
    private fun generatebillingApiList(): BillingApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformBilling",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(BillingApiList::class.java) as? BillingApiList
    }
    
    
    suspend fun createSubscriptionCharge(extensionId: String,body: CreateSubscriptionCharge)
    : Deferred<Response<CreateSubscriptionResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.createSubscriptionCharge(
        companyId = config.companyId, extensionId = extensionId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionCharge(extensionId: String, subscriptionId: String)
    : Deferred<Response<EntitySubscription>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getSubscriptionCharge(
        companyId = config.companyId, extensionId = extensionId, subscriptionId = subscriptionId )
        } else {
            null
        } 
    }
    
    
    suspend fun cancelSubscriptionCharge(extensionId: String, subscriptionId: String)
    : Deferred<Response<EntitySubscription>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.cancelSubscriptionCharge(
        companyId = config.companyId, extensionId = extensionId, subscriptionId = subscriptionId )
        } else {
            null
        } 
    }
    
    
    suspend fun getInvoices()
    : Deferred<Response<Invoices>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getInvoices(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getInvoiceById(invoiceId: String)
    : Deferred<Response<Invoice>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getInvoiceById(
        companyId = config.companyId, invoiceId = invoiceId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCustomerDetail()
    : Deferred<Response<SubscriptionCustomer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getCustomerDetail(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun upsertCustomerDetail(body: SubscriptionCustomerCreate)
    : Deferred<Response<SubscriptionCustomer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.upsertCustomerDetail(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscription()
    : Deferred<Response<SubscriptionStatus>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getSubscription(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getFeatureLimitConfig()
    : Deferred<Response<SubscriptionLimit>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getFeatureLimitConfig(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun activateSubscriptionPlan(body: SubscriptionActivateReq)
    : Deferred<Response<SubscriptionActivateRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.activateSubscriptionPlan(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun cancelSubscriptionPlan(body: CancelSubscriptionReq)
    : Deferred<Response<CancelSubscriptionRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.cancelSubscriptionPlan(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
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
        HttpClient.setDebuggable(config.debuggable)
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
    
    
    suspend fun getSubscriptionPaymentMethod(uniqueExternalId: String?=null)
    : Deferred<Response<SubscriptionPaymentMethodResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getSubscriptionPaymentMethod(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId )
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
    
    
    
    suspend fun verifyIfscCode(ifscCode: String?=null)
    : Deferred<Response<IfscCodeResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.verifyIfscCode(
        companyId = config.companyId, ifscCode = ifscCode )
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
    
    
    
    
    
    
    
    
    
    
    
    suspend fun addBeneficiaryDetails(body: AddBeneficiaryDetailsRequest)
    : Deferred<Response<RefundAccountResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.addBeneficiaryDetails(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    suspend fun getUserOrderBeneficiaries(orderId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getUserOrderBeneficiaries(orderId = orderId, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getUserBeneficiaries(orderId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getUserBeneficiaries(orderId = orderId, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun confirmPayment(body: PaymentConfirmationRequest)
    : Deferred<Response<PaymentConfirmationResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.confirmPayment(companyId = config.companyId , applicationId = applicationId , body = body)
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
        HttpClient.setDebuggable(config.debuggable)
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
    
    
    suspend fun checkRefund(shipmentId: String)
    : Deferred<Response<HashMap<String,Any>>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.checkRefund(
        companyId = config.companyId, shipmentId = shipmentId )
        } else {
            null
        } 
    }
    
    
    suspend fun ShipmentBagsCanBreak(body: CanBreakRequestBody)
    : Deferred<Response<CanBreakResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.ShipmentBagsCanBreak(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getOrdersByCompanyId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, isPrioritySort: Boolean?=null, lockStatus: Boolean?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, deploymentStores: String?=null, status: String?=null, dp: String?=null, shortenUrls: Boolean?=null, filterType: String?=null)
    : Deferred<Response<OrderListing>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrdersByCompanyId(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, isPrioritySort = isPrioritySort, lockStatus = lockStatus, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, deploymentStores = deploymentStores, status = status, dp = dp, shortenUrls = shortenUrls, filterType = filterType )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrderLanesCountByCompanyId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, status: String?=null, shortenUrls: Boolean?=null, filterType: String?=null)
    : Deferred<Response<OrderLanesCount>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrderLanesCountByCompanyId(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, status = status, shortenUrls = shortenUrls, filterType = filterType )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrderDetails(orderId: String?=null, next: String?=null, previous: String?=null)
    : Deferred<Response<OrderDetails>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrderDetails(
        companyId = config.companyId, orderId = orderId, next = next, previous = previous )
        } else {
            null
        } 
    }
    
    
    suspend fun getPicklistOrdersByCompanyId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, status: String?=null, shortenUrls: Boolean?=null, filterType: String?=null)
    : Deferred<Response<OrderPicklistListing>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getPicklistOrdersByCompanyId(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, status = status, shortenUrls = shortenUrls, filterType = filterType )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    suspend fun getShipmentAddress(shipmentId: String, addressCategory: String)
    : Deferred<Response<GetShipmentAddressResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentAddress(
        companyId = config.companyId, shipmentId = shipmentId, addressCategory = addressCategory )
        } else {
            null
        } 
    }
    
    
    suspend fun updateShipmentAddress(shipmentId: String, addressCategory: String,body: UpdateShipmentAddressRequest)
    : Deferred<Response<UpdateShipmentAddressResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateShipmentAddress(
        companyId = config.companyId, shipmentId = shipmentId, addressCategory = addressCategory, body = body)
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
    
    
    suspend fun updateShipment(shipmentId: String,body: ShipmentUpdateRequest)
    : Deferred<Response<ShipmentUpdateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.updateShipment(companyId = config.companyId , applicationId = applicationId , shipmentId = shipmentId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPlatformShipmentReasons(action: String)
    : Deferred<Response<ShipmentReasonsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getPlatformShipmentReasons(companyId = config.companyId , applicationId = applicationId , action = action )
        } else {
            null
        }
    }
    
    
    suspend fun getShipmentTrackDetails(orderId: String, shipmentId: String)
    : Deferred<Response<ShipmentTrackResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getShipmentTrackDetails(companyId = config.companyId , applicationId = applicationId , orderId = orderId, shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getOrdersByApplicationId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, status: String?=null, dp: String?=null, shortenUrls: Boolean?=null, filterType: String?=null)
    : Deferred<Response<OrderListing>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getOrdersByApplicationId(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, status = status, dp = dp, shortenUrls = shortenUrls, filterType = filterType )
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
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCatalog",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CatalogApiList::class.java) as? CatalogApiList
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
    
    
    suspend fun createProductBundle(body: ProductBundleRequest)
    : Deferred<Response<GetProductBundleCreateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductBundle(
        companyId = config.companyId, body = body)
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
    
    
    suspend fun updateProductBundle(id: String,body: ProductBundleUpdateRequest)
    : Deferred<Response<GetProductBundleCreateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateProductBundle(
        companyId = config.companyId, id = id, body = body)
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
    
    
    suspend fun createSizeGuide(body: ValidateSizeGuide)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createSizeGuide(
        companyId = config.companyId, body = body)
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
    
    
    suspend fun updateSizeGuide(id: String,body: ValidateSizeGuide)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateSizeGuide(
        companyId = config.companyId, id = id, body = body)
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
    
    
    suspend fun getGenderAttribute(attributeSlug: String)
    : Deferred<Response<GenderDetail>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getGenderAttribute(
        companyId = config.companyId, attributeSlug = attributeSlug )
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
    
    
    suspend fun listDepartmentsData(pageNo: Int?=null, pageSize: Int?=null, name: String?=null, search: String?=null, isActive: Boolean?=null)
    : Deferred<Response<DepartmentsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listDepartmentsData(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, name = name, search = search, isActive = isActive )
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
    
    
    suspend fun listProductTemplate(department: String)
    : Deferred<Response<TemplatesResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplate(
        companyId = config.companyId, department = department )
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
    : Deferred<Response<ResponseBody>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.downloadProductTemplateViews(
        companyId = config.companyId, slug = slug )
        } else {
            null
        } 
    }
    
    
    suspend fun downloadProductTemplateView(itemType: String)
    : Deferred<Response<ResponseBody>>? {
        
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
    : Deferred<Response<ProductDownloadsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listProductTemplateExportDetails(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun listTemplateBrandTypeValues(filter: String)
    : Deferred<Response<ProductConfigurationDownloads>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listTemplateBrandTypeValues(
        companyId = config.companyId, filter = filter )
        } else {
            null
        } 
    }
    
    
    suspend fun listCategories(level: String?=null, departments: String?=null, q: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<CategoryResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.listCategories(
        companyId = config.companyId, level = level, departments = departments, q = q, pageNo = pageNo, pageSize = pageSize )
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
    
    
    suspend fun getCategoryData(uid: String)
    : Deferred<Response<SingleCategoryResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getCategoryData(
        companyId = config.companyId, uid = uid )
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
    
    
    suspend fun getProducts(brandIds: ArrayList<Int>?=null, categoryIds: ArrayList<Int>?=null, itemIds: ArrayList<Int>?=null, departmentIds: ArrayList<Int>?=null, itemCode: ArrayList<Double>?=null, q: String?=null, tags: ArrayList<String>?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ProductListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProducts(
        companyId = config.companyId, brandIds = brandIds, categoryIds = categoryIds, itemIds = itemIds, departmentIds = departmentIds, itemCode = itemCode, q = q, tags = tags, pageNo = pageNo, pageSize = pageSize )
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
    
    
    suspend fun getProduct(itemCode: String?=null, itemId: String, brandUid: Int?=null)
    : Deferred<Response<Product>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProduct(
        itemCode = itemCode, companyId = config.companyId, itemId = itemId, brandUid = brandUid )
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
    
    
    suspend fun deleteProduct(itemId: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteProduct(
        companyId = config.companyId, itemId = itemId )
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
    
    
    suspend fun getProductBulkUploadHistory(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ProductBulkRequestList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductBulkUploadHistory(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
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
    
    
    suspend fun createProductsInBulk(batchId: String,body: BulkProductRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductsInBulk(
        companyId = config.companyId, batchId = batchId, body = body)
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
    
    
    suspend fun getProductTags()
    : Deferred<Response<ProductTagsViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getProductTags(
        companyId = config.companyId )
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
    
    
    suspend fun createProductAssetsInBulk(body: ProductBulkAssets)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createProductAssetsInBulk(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deleteSize(itemId: String, size: String)
    : Deferred<Response<ProductSizeDeleteResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteSize(
        companyId = config.companyId, itemId = itemId, size = size )
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryBySize(itemId: String, size: String, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, sellable: Boolean?=null)
    : Deferred<Response<InventoryResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBySize(
        companyId = config.companyId, itemId = itemId, size = size, pageNo = pageNo, pageSize = pageSize, q = q, sellable = sellable )
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
    
    
    suspend fun getInventoryBySizeIdentifier(itemId: String, sizeIdentifier: String, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, locationIds: ArrayList<Int>?=null)
    : Deferred<Response<InventoryResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBySizeIdentifier(
        companyId = config.companyId, itemId = itemId, sizeIdentifier = sizeIdentifier, pageNo = pageNo, pageSize = pageSize, q = q, locationIds = locationIds )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteInventory(size: String, itemId: String, locationId: String)
    : Deferred<Response<InventoryDelete>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteInventory(
        companyId = config.companyId, size = size, itemId = itemId, locationId = locationId )
        } else {
            null
        } 
    }
    
    
    suspend fun getInventoryBulkUploadHistory(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<BulkInventoryGet>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getInventoryBulkUploadHistory(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
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
    
    
    suspend fun createBulkInventory(batchId: String,body: InventoryBulkRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createBulkInventory(
        companyId = config.companyId, batchId = batchId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deleteBulkInventoryJob(batchId: String)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.deleteBulkInventoryJob(
        companyId = config.companyId, batchId = batchId )
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
    
    
    suspend fun createInventoryExportJob(body: InventoryExportRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createInventoryExportJob(
        companyId = config.companyId, body = body)
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
    
    
    suspend fun getAllHsnCodes(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Deferred<Response<HsnCodesListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getAllHsnCodes(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun createHsnCode(body: HsnUpsert)
    : Deferred<Response<HsnCode>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.createHsnCode(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getHsnCode(id: String)
    : Deferred<Response<HsnCode>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getHsnCode(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun updateHsnCode(id: String,body: HsnUpsert)
    : Deferred<Response<HsnCode>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.updateHsnCode(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun bulkHsnCode(body: BulkHsnUpsert)
    : Deferred<Response<BulkHsnResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.bulkHsnCode(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    suspend fun getOptimalLocations(body: AssignStore)
    : Deferred<Response<StoreAssignResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            catalogApiList?.getOptimalLocations(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getSearchKeywords(id: String)
    : Deferred<Response<GetSearchWordsDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id )
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
    
    
    suspend fun deleteSearchKeywords(id: String)
    : Deferred<Response<DeleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.deleteSearchKeywords(companyId = config.companyId , applicationId = applicationId , id = id )
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
    
    
    suspend fun createCustomKeyword(body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createCustomKeyword(companyId = config.companyId , applicationId = applicationId , body = body)
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
    
    
    suspend fun updateAutocompleteKeyword(id: String,body: CreateAutocompleteKeyword)
    : Deferred<Response<GetAutocompleteWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateAutocompleteKeyword(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
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
    
    
    suspend fun getAutocompleteConfig()
    : Deferred<Response<GetAutocompleteWordsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAutocompleteConfig(companyId = config.companyId , applicationId = applicationId  )
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
    
    
    
    
    
    
    
    
    
    
    suspend fun getCatalogConfiguration()
    : Deferred<Response<GetCatalogConfigurationMetaData>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCatalogConfiguration(companyId = config.companyId , applicationId = applicationId  )
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
    
    
    suspend fun createConfigurationProductListing(body: AppConfiguration)
    : Deferred<Response<GetAppCatalogConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createConfigurationProductListing(companyId = config.companyId , applicationId = applicationId , body = body)
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
    
    
    suspend fun createConfigurationByType(type: String,body: AppConfiguration)
    : Deferred<Response<GetAppCatalogConfiguration>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.createConfigurationByType(companyId = config.companyId , applicationId = applicationId , type = type, body = body)
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
    
    
    suspend fun getAllCollections()
    : Deferred<Response<GetCollectionListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAllCollections(companyId = config.companyId , applicationId = applicationId  )
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
    
    
    suspend fun getCollectionDetail(slug: String)
    : Deferred<Response<CollectionDetailResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCollectionDetail(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun updateCollection(id: String,body: UpdateCollection)
    : Deferred<Response<UpdateCollection>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.updateCollection(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
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
    
    
    suspend fun getCollectionItems(id: String, sortOn: String?=null, pageId: String?=null, pageSize: Int?=null)
    : Deferred<Response<GetCollectionItemsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCollectionItems(companyId = config.companyId , applicationId = applicationId , id = id, sortOn = sortOn, pageId = pageId, pageSize = pageSize )
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
    
    
    suspend fun getCatalogInsights(brand: String?=null)
    : Deferred<Response<CatalogInsightResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCatalogInsights(companyId = config.companyId , applicationId = applicationId , brand = brand )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getApplicationBrands(department: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<BrandListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getApplicationBrands(companyId = config.companyId , applicationId = applicationId , department = department, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getApplicationBrands
    **/
    fun getApplicationBrandsPaginator(
    department: String?=null, pageSize: Int?=null
    
    ) : Paginator<BrandListingResponse>{
        val paginator = Paginator<BrandListingResponse>()
        paginator.setCallBack(object : PaginatorCallback<BrandListingResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<BrandListingResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    catalogApiList?.getApplicationBrands(companyId = config.companyId , applicationId = applicationId , department = department, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun getDepartments()
    : Deferred<Response<DepartmentResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getDepartments(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getCategories(department: String?=null)
    : Deferred<Response<CategoryListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getCategories(companyId = config.companyId , applicationId = applicationId , department = department )
        } else {
            null
        }
    }
    
    
    suspend fun getAppicationProducts(q: String?=null, f: String?=null, filters: Boolean?=null, sortOn: String?=null, pageId: String?=null, pageSize: Int?=null, pageNo: Int?=null, pageType: String?=null, itemIds: ArrayList<Int>?=null)
    : Deferred<Response<ApplicationProductListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppicationProducts(companyId = config.companyId , applicationId = applicationId , q = q, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType, itemIds = itemIds )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppicationProducts
    **/
    fun getAppicationProductsPaginator(
    q: String?=null, f: String?=null, filters: Boolean?=null, sortOn: String?=null, pageSize: Int?=null, itemIds: ArrayList<Int>?=null
    
    ) : Paginator<ApplicationProductListingResponse>{
        val paginator = Paginator<ApplicationProductListingResponse>()
        paginator.setCallBack(object : PaginatorCallback<ApplicationProductListingResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<ApplicationProductListingResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    catalogApiList?.getAppicationProducts(companyId = config.companyId , applicationId = applicationId , q = q, f = f, filters = filters, sortOn = sortOn, pageId = pageId, pageSize = pageSize, pageNo = pageNo, pageType = pageType, itemIds = itemIds)?.safeAwait{ response, error ->
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
    
    suspend fun getProductDetailBySlug(slug: String)
    : Deferred<Response<ProductDetail>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getProductDetailBySlug(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun getAppProducts(brandIds: ArrayList<Int>?=null, categoryIds: ArrayList<Int>?=null, departmentIds: ArrayList<Int>?=null, tags: ArrayList<String>?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Deferred<Response<ProductListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                catalogApiList?.getAppProducts(companyId = config.companyId , applicationId = applicationId , brandIds = brandIds, categoryIds = categoryIds, departmentIds = departmentIds, tags = tags, pageNo = pageNo, pageSize = pageSize, q = q )
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
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCompanyProfile",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CompanyProfileApiList::class.java) as? CompanyProfileApiList
    }
    
    
    suspend fun updateCompany(body: UpdateCompany)
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
    
    
    suspend fun editBrand(brandId: String,body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.editBrand(
        companyId = config.companyId, brandId = brandId, body = body)
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
    
    
    suspend fun createBrand(body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createBrand(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createCompanyBrandMapping(body: CompanyBrandPostRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createCompanyBrandMapping(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getBrands(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Deferred<Response<CompanyBrandListSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getBrands(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, q = q )
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
    
    
    suspend fun updateLocation(locationId: String,body: LocationSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.updateLocation(
        companyId = config.companyId, locationId = locationId, body = body)
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
    
    
    suspend fun createLocationBulk(body: BulkLocationSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createLocationBulk(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}

class FileStorageDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val fileStorageApiList by lazy {
        generatefileStorageApiList()
    }
    
    private fun generatefileStorageApiList(): FileStorageApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformFileStorage",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(FileStorageApiList::class.java) as? FileStorageApiList
    }
    
    
    suspend fun startUpload(namespace: String,body: StartRequest)
    : Deferred<Response<StartResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.startUpload(
        namespace = namespace, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun completeUpload(namespace: String,body: StartResponse)
    : Deferred<Response<CompleteResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.completeUpload(
        namespace = namespace, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun getSignUrls(body: SignUrlRequest)
    : Deferred<Response<SignUrlResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.getSignUrls(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun copyFiles(sync: Boolean?=null,body: BulkRequest)
    : Deferred<Response<BulkResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.copyFiles(
        sync = sync, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    suspend fun browse(namespace: String, pageNo: Int?=null)
    : Deferred<Response<BrowseResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.browse(
        namespace = namespace, companyId = config.companyId, pageNo = pageNo )
        } else {
            null
        } 
    }
    
    
    
    suspend fun proxy(url: String)
    : Deferred<Response<ResponseBody>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.proxy(
        companyId = config.companyId, url = url )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    suspend fun appStartUpload(namespace: String,body: StartRequest)
    : Deferred<Response<StartResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.appStartUpload(namespace = namespace, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun appCompleteUpload(namespace: String,body: StartResponse)
    : Deferred<Response<CompleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.appCompleteUpload(namespace = namespace, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun appCopyFiles(sync: Boolean?=null,body: BulkRequest)
    : Deferred<Response<BulkResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.appCopyFiles(sync = sync, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    suspend fun browse(namespace: String, pageNo: Int?=null)
    : Deferred<Response<BrowseResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.browse(namespace = namespace, companyId = config.companyId , applicationId = applicationId , pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
    /**
    *
    * Summary: Paginator for browse
    **/
    fun browsePaginator(
    namespace: String
    
    ) : Paginator<BrowseResponse>{
        val paginator = Paginator<BrowseResponse>()
        paginator.setCallBack(object : PaginatorCallback<BrowseResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<BrowseResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    fileStorageApiList?.browse(namespace = namespace, companyId = config.companyId , applicationId = applicationId , pageNo = pageNo)?.safeAwait{ response, error ->
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
        HttpClient.setDebuggable(config.debuggable)
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
    
    
    suspend fun getShortLinks(pageNo: Int?=null, pageSize: Int?=null, createdBy: String?=null, active: String?=null, q: String?=null)
    : Deferred<Response<ShortLinkList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinks(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, createdBy = createdBy, active = active, q = q )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getShortLinks
    **/
    fun getShortLinksPaginator(
    pageSize: Int?=null, createdBy: String?=null, active: String?=null, q: String?=null
    
    ) : Paginator<ShortLinkList>{
        val paginator = Paginator<ShortLinkList>()
        paginator.setCallBack(object : PaginatorCallback<ShortLinkList> {
            
            override suspend fun onNext(
                onResponse: (Event<ShortLinkList>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    shareApiList?.getShortLinks(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, createdBy = createdBy, active = active, q = q)?.safeAwait{ response, error ->
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
    
    suspend fun getShortLinkByHash(hash: String)
    : Deferred<Response<ShortLinkRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinkByHash(companyId = config.companyId , applicationId = applicationId , hash = hash )
        } else {
            null
        }
    }
    
    
    suspend fun updateShortLinkById(id: String,body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.updateShortLinkById(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
}
}

class InventoryDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val inventoryApiList by lazy {
        generateinventoryApiList()
    }
    
    private fun generateinventoryApiList(): InventoryApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformInventory",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(InventoryApiList::class.java) as? InventoryApiList
    }
    
    
    suspend fun getJobsByCompany(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigRawDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobsByCompany(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun updateJob(body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.updateJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createJob(body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.createJob(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getJobSteps(jobId: String)
    : Deferred<Response<ResponseEnvelopeListJobStepsDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobSteps(
        companyId = config.companyId, jobId = jobId )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobByCompanyAndIntegration(integrationId: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobByCompanyAndIntegration(
        companyId = config.companyId, integrationId = integrationId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun disable(integrationId: String)
    : Deferred<Response<ResponseEnvelopeString>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.disable(
        companyId = config.companyId, integrationId = integrationId )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobConfigDefaults()
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobConfigDefaults(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobByCode(code: String)
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobByCode(
        companyId = config.companyId, code = code )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobCodeMetrics(code: String, pageNo: Int?=null, pageSize: Int?=null, status: String?=null, date: String?=null)
    : Deferred<Response<ResponseEnvelopeJobMetricsDto>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobCodeMetrics(
        companyId = config.companyId, code = code, pageNo = pageNo, pageSize = pageSize, status = status, date = date )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobCodesByCompanyAndIntegration(integrationId: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigListDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobCodesByCompanyAndIntegration(
        companyId = config.companyId, integrationId = integrationId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
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
        HttpClient.setDebuggable(config.debuggable)
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
    
    
    suspend fun getApplications(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
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
    
    
    suspend fun getIntegrationLevelConfig(id: String, level: String, opted: Boolean?=null, checkPermission: Boolean?=null)
    : Deferred<Response<IntegrationConfigResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getIntegrationLevelConfig(
        companyId = config.companyId, id = id, level = level, opted = opted, checkPermission = checkPermission )
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
    
    
    suspend fun updateLevelUidIntegration(id: String, level: String, uid: String,body: IntegrationLevel)
    : Deferred<Response<IntegrationLevel>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.updateLevelUidIntegration(
        companyId = config.companyId, id = id, level = level, uid = uid, body = body)
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
    
    
    suspend fun updateLevelIntegration(id: String, level: String,body: UpdateIntegrationLevelRequest)
    : Deferred<Response<IntegrationLevel>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.updateLevelIntegration(
        companyId = config.companyId, id = id, level = level, body = body)
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
    
    
    suspend fun getOtherSellerApplications(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<OtherSellerApplications>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getOtherSellerApplications(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
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
    
    
    suspend fun getAppCompanies(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<CompaniesResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppCompanies(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppCompanies
    **/
    fun getAppCompaniesPaginator(
    pageSize: Int?=null
    
    ) : Paginator<CompaniesResponse>{
        val paginator = Paginator<CompaniesResponse>()
        paginator.setCallBack(object : PaginatorCallback<CompaniesResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<CompaniesResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getAppCompanies(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun getAppStores(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<StoresResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppStores(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppStores
    **/
    fun getAppStoresPaginator(
    pageSize: Int?=null
    
    ) : Paginator<StoresResponse>{
        val paginator = Paginator<StoresResponse>()
        paginator.setCallBack(object : PaginatorCallback<StoresResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<StoresResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getAppStores(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    
    suspend fun getAppSupportedCurrency()
    : Deferred<Response<AppCurrencyResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppSupportedCurrency(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getOrderingStoresByFilter(pageNo: Int?=null, pageSize: Int?=null,body: FilterOrderingStoreRequest)
    : Deferred<Response<OrderingStores>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getOrderingStoresByFilter(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, body = body)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getOrderingStoresByFilter
    **/
    fun getOrderingStoresByFilterPaginator(
    pageSize: Int?=null,
    body: FilterOrderingStoreRequest
    ) : Paginator<OrderingStores>{
        val paginator = Paginator<OrderingStores>()
        paginator.setCallBack(object : PaginatorCallback<OrderingStores> {
            
            override suspend fun onNext(
                onResponse: (Event<OrderingStores>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getOrderingStoresByFilter(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize,body = body )?.safeAwait{ response, error ->
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
    
    suspend fun updateOrderingStoreConfig(body: OrderingStoreConfig)
    : Deferred<Response<DeploymentMeta>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateOrderingStoreConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getStaffOrderingStores(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Deferred<Response<OrderingStoresResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getStaffOrderingStores(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getStaffOrderingStores
    **/
    fun getStaffOrderingStoresPaginator(
    pageSize: Int?=null, q: String?=null
    
    ) : Paginator<OrderingStoresResponse>{
        val paginator = Paginator<OrderingStoresResponse>()
        paginator.setCallBack(object : PaginatorCallback<OrderingStoresResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<OrderingStoresResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getStaffOrderingStores(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait{ response, error ->
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
        HttpClient.setDebuggable(config.debuggable)
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
                onResponse: (Event<CouponsResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    cartApiList?.getCoupons(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, isArchived = isArchived, title = title, isPublic = isPublic, isDisplay = isDisplay, typeSlug = typeSlug, code = code)?.safeAwait{ response, error ->
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
    
    
    suspend fun fetchAndvalidateCartItems(body: OpenapiCartDetailsRequest)
    : Deferred<Response<OpenapiCartDetailsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.fetchAndvalidateCartItems(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun checkCartServiceability(body: OpenApiCartServiceabilityRequest)
    : Deferred<Response<OpenApiCartServiceabilityResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.checkCartServiceability(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun checkoutCart(body: OpenApiPlatformCheckoutReq)
    : Deferred<Response<OpenApiCheckoutResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                cartApiList?.checkoutCart(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
}
}

class RewardsDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val rewardsApiList by lazy {
        generaterewardsApiList()
    }
    
    private fun generaterewardsApiList(): RewardsApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformRewards",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(RewardsApiList::class.java) as? RewardsApiList
    }
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getGiveaways(pageId: String?=null, pageSize: Int?=null)
    : Deferred<Response<GiveawayResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getGiveaways(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getGiveaways
    **/
    fun getGiveawaysPaginator(
    pageSize: Int?=null
    
    ) : Paginator<GiveawayResponse>{
        val paginator = Paginator<GiveawayResponse>()
        paginator.setCallBack(object : PaginatorCallback<GiveawayResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<GiveawayResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    rewardsApiList?.getGiveaways(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createGiveaway(body: Giveaway)
    : Deferred<Response<Giveaway>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.createGiveaway(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getGiveawayByID(id: String)
    : Deferred<Response<Giveaway>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getGiveawayByID(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateGiveaway(id: String,body: Giveaway)
    : Deferred<Response<Giveaway>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateGiveaway(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getOffers()
    : Deferred<Response<ArrayList<Offer>>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getOffers(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getOfferByName(cookie: String, name: String)
    : Deferred<Response<Offer>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getOfferByName(companyId = config.companyId , applicationId = applicationId , cookie = cookie, name = name )
        } else {
            null
        }
    }
    
    
    suspend fun updateOfferByName(name: String,body: Offer)
    : Deferred<Response<Offer>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateOfferByName(companyId = config.companyId , applicationId = applicationId , name = name, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getUserAvailablePoints(userId: String)
    : Deferred<Response<UserRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getUserAvailablePoints(companyId = config.companyId , applicationId = applicationId , userId = userId )
        } else {
            null
        }
    }
    
    
    suspend fun updateUserStatus(userId: String,body: AppUser)
    : Deferred<Response<AppUser>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateUserStatus(companyId = config.companyId , applicationId = applicationId , userId = userId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getUserPointsHistory(userId: String, pageId: String?=null, pageLimit: Int?=null, pageSize: Int?=null)
    : Deferred<Response<HistoryRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getUserPointsHistory(companyId = config.companyId , applicationId = applicationId , userId = userId, pageId = pageId, pageLimit = pageLimit, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getUserPointsHistory
    **/
    fun getUserPointsHistoryPaginator(
    userId: String, pageLimit: Int?=null, pageSize: Int?=null
    
    ) : Paginator<HistoryRes>{
        val paginator = Paginator<HistoryRes>()
        paginator.setCallBack(object : PaginatorCallback<HistoryRes> {
            
            override suspend fun onNext(
                onResponse: (Event<HistoryRes>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    rewardsApiList?.getUserPointsHistory(companyId = config.companyId , applicationId = applicationId , userId = userId, pageId = pageId, pageLimit = pageLimit, pageSize = pageSize)?.safeAwait{ response, error ->
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
        HttpClient.setDebuggable(config.debuggable)
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
    
    
    suspend fun getLogsList(logType: String, pageNo: Int?=null, pageSize: Int?=null,body: GetLogsListReq)
    : Deferred<Response<GetLogsListRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.getLogsList(
        companyId = config.companyId, logType = logType, pageNo = pageNo, pageSize = pageSize, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun searchLogs(pageNo: Int?=null, pageSize: Int?=null, logType: String,body: SearchLogReq)
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
    : Deferred<Response<ResponseBody>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getComponentStatsCSV(companyId = config.companyId , applicationId = applicationId , componentName = componentName )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentStatsPDF(componentName: String)
    : Deferred<Response<ResponseBody>>? {
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
    
    
    suspend fun getAbandonCartList(fromDate: String, toDate: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<AbandonCartsList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getAbandonCartList(companyId = config.companyId , applicationId = applicationId , fromDate = fromDate, toDate = toDate, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAbandonCartList
    **/
    fun getAbandonCartListPaginator(
    fromDate: String, toDate: String, pageSize: Int?=null
    
    ) : Paginator<AbandonCartsList>{
        val paginator = Paginator<AbandonCartsList>()
        paginator.setCallBack(object : PaginatorCallback<AbandonCartsList> {
            
            override suspend fun onNext(
                onResponse: (Event<AbandonCartsList>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    analyticsApiList?.getAbandonCartList(companyId = config.companyId , applicationId = applicationId , fromDate = fromDate, toDate = toDate, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun getAbandonCartsCSV(fromDate: String, toDate: String)
    : Deferred<Response<ResponseBody>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getAbandonCartsCSV(companyId = config.companyId , applicationId = applicationId , fromDate = fromDate, toDate = toDate )
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

class DiscountDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val discountApiList by lazy {
        generatediscountApiList()
    }
    
    private fun generatediscountApiList(): DiscountApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformDiscount",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(DiscountApiList::class.java) as? DiscountApiList
    }
    
    
    suspend fun getDiscounts(view: String?=null, q: String?=null, pageNo: Int?=null, pageSize: Int?=null, archived: Boolean?=null, month: Int?=null, year: Int?=null, type: String?=null, appIds: ArrayList<String>?=null)
    : Deferred<Response<ListOrCalender>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.getDiscounts(
        companyId = config.companyId, view = view, q = q, pageNo = pageNo, pageSize = pageSize, archived = archived, month = month, year = year, type = type, appIds = appIds )
        } else {
            null
        } 
    }
    
    
    suspend fun createDiscount(body: CreateUpdateDiscount)
    : Deferred<Response<DiscountJob>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.createDiscount(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getDiscount(id: String)
    : Deferred<Response<DiscountJob>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.getDiscount(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun updateDiscount(id: String,body: CreateUpdateDiscount)
    : Deferred<Response<DiscountJob>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.updateDiscount(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun validateDiscountFile(discount: String?=null,body: DiscountJob)
    : Deferred<Response<FileJobResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.validateDiscountFile(
        companyId = config.companyId, discount = discount, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun downloadDiscountFile(type: String,body: DownloadFileJob)
    : Deferred<Response<FileJobResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.downloadDiscountFile(
        companyId = config.companyId, type = type, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getValidationJob(id: String)
    : Deferred<Response<FileJobResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.getValidationJob(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun cancelValidationJob(id: String)
    : Deferred<Response<CancelJobResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.cancelValidationJob(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun getDownloadJob(id: String)
    : Deferred<Response<FileJobResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.getDownloadJob(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun cancelDownloadJob(id: String)
    : Deferred<Response<CancelJobResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.cancelDownloadJob(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
}
}

class PartnerDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val partnerApiList by lazy {
        generatepartnerApiList()
    }
    
    private fun generatepartnerApiList(): PartnerApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformPartner",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(PartnerApiList::class.java) as? PartnerApiList
    }
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun addProxyPath(extensionId: String,body: AddProxyReq)
    : Deferred<Response<AddProxyResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                partnerApiList?.addProxyPath(companyId = config.companyId , applicationId = applicationId , extensionId = extensionId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun removeProxyPath(extensionId: String, attachedPath: String)
    : Deferred<Response<RemoveProxyResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                partnerApiList?.removeProxyPath(companyId = config.companyId , applicationId = applicationId , extensionId = extensionId, attachedPath = attachedPath )
        } else {
            null
        }
    }
    
}
}

class WebhookDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val webhookApiList by lazy {
        generatewebhookApiList()
    }
    
    private fun generatewebhookApiList(): WebhookApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformWebhook",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(WebhookApiList::class.java) as? WebhookApiList
    }
    
    
    suspend fun getSubscribersByCompany(pageNo: Int?=null, pageSize: Int?=null, extensionId: String?=null)
    : Deferred<Response<SubscriberResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getSubscribersByCompany(
        pageNo = pageNo, pageSize = pageSize, companyId = config.companyId, extensionId = extensionId )
        } else {
            null
        } 
    }
    
    
    suspend fun registerSubscriberToEvent(body: SubscriberConfig)
    : Deferred<Response<SubscriberConfig>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.registerSubscriberToEvent(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateSubscriberConfig(body: SubscriberConfig)
    : Deferred<Response<SubscriberConfig>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.updateSubscriberConfig(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscribersByExtensionId(pageNo: Int?=null, pageSize: Int?=null, extensionId: String)
    : Deferred<Response<SubscriberResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getSubscribersByExtensionId(
        pageNo = pageNo, pageSize = pageSize, companyId = config.companyId, extensionId = extensionId )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriberById(subscriberId: String)
    : Deferred<Response<SubscriberResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.getSubscriberById(
        companyId = config.companyId, subscriberId = subscriberId )
        } else {
            null
        } 
    }
    
    
    suspend fun fetchAllEventConfigurations()
    : Deferred<Response<EventConfigList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            webhookApiList?.fetchAllEventConfigurations(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
}
}