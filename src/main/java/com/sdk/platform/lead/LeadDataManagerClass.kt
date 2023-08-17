package com.sdk.platform.lead

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class LeadDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
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
            namespace = "PlatformLead",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(LeadApiList::class.java) as? LeadApiList
    }
    
    
    suspend fun getPlatformTickets(items: Boolean?=null, filters: Boolean?=null, q: String?=null, status: String?=null, priority: PriorityEnum?=null, category: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<TicketList>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getPlatformTickets(
        companyId = config.companyId, items = items, filters = filters, q = q, status = status, priority = priority, category = category, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun createTicket(body: AddTicketPayload)
    : Response<Ticket>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.createTicket(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    suspend fun getPlatformTicket(id: String)
    : Response<Ticket>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getPlatformTicket(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun editPlatformTicket(id: String,body: EditTicketPayload)
    : Response<Ticket>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.editPlatformTicket(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun createPlatformTicketHistory(id: String,body: TicketHistoryPayload)
    : Response<TicketHistory>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.createPlatformTicketHistory(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getPlatformTicketHistory(id: String)
    : Response<TicketHistoryList>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getPlatformTicketHistory(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun getFeedbacks(id: String)
    : Response<TicketFeedbackList>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getFeedbacks(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun submitFeedback(id: String,body: TicketFeedbackPayload)
    : Response<TicketFeedback>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.submitFeedback(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    suspend fun getTokenForPlatformVideoRoom(uniqueName: String)
    : Response<GetTokenForVideoRoomResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getTokenForPlatformVideoRoom(
        companyId = config.companyId, uniqueName = uniqueName )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getPlatformVideoParticipants(uniqueName: String)
    : Response<GetParticipantsInsideVideoRoomResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getPlatformVideoParticipants(
        companyId = config.companyId, uniqueName = uniqueName )
        } else {
            null
        } 
    }
    
    
    
    
    
    suspend fun getGeneralConfig()
    : Response<CloseVideoRoomResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getGeneralConfig(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    suspend fun getTickets(items: Boolean?=null, filters: Boolean?=null, q: String?=null, status: String?=null, priority: PriorityEnum?=null, category: String?=null)
    : Response<TicketList>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTickets(companyId = config.companyId , applicationId = applicationId , items = items, filters = filters, q = q, status = status, priority = priority, category = category )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getTicket(id: String)
    : Response<Ticket>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTicket(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun editTicket(id: String,body: EditTicketPayload)
    : Response<Ticket>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.editTicket(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    
    
    
    
    suspend fun createHistory(id: String,body: TicketHistoryPayload)
    : Response<TicketHistory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.createHistory(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getTicketHistory(id: String)
    : Response<TicketHistoryList>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTicketHistory(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun getCustomForm(slug: String)
    : Response<CustomForm>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getCustomForm(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun editCustomForm(slug: String,body: EditCustomFormPayload)
    : Response<CustomForm>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.editCustomForm(companyId = config.companyId , applicationId = applicationId , slug = slug, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomForms()
    : Response<CustomFormList>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getCustomForms(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createCustomForm(body: CreateCustomFormPayload)
    : Response<CustomForm>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.createCustomForm(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    suspend fun getTokenForVideoRoom(uniqueName: String)
    : Response<GetTokenForVideoRoomResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTokenForVideoRoom(companyId = config.companyId , applicationId = applicationId , uniqueName = uniqueName )
        } else {
            null
        }
    }
    
    
    
    suspend fun getVideoParticipants(uniqueName: String)
    : Response<GetParticipantsInsideVideoRoomResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getVideoParticipants(companyId = config.companyId , applicationId = applicationId , uniqueName = uniqueName )
        } else {
            null
        }
    }
    
    
    suspend fun openVideoRoom(body: CreateVideoRoomPayload)
    : Response<CreateVideoRoomResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.openVideoRoom(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun closeVideoRoom(uniqueName: String)
    : Response<CloseVideoRoomResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.closeVideoRoom(companyId = config.companyId , applicationId = applicationId , uniqueName = uniqueName )
        } else {
            null
        }
    }
    
    
}
}