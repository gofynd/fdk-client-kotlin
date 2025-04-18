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
    
    
    suspend fun getPlatformTickets(items: Boolean?=null,filters: Boolean?=null,q: String?=null,status: String?=null,priority: String?=null,category: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<TicketList>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getPlatformTickets(
        companyId = config.companyId,items = items,filters = filters,q = q,status = status,priority = priority,category = category,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createTicket(body: AddTicketPayload, headers: Map<String, String> = emptyMap())
    : Response<Ticket>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.createTicket(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun getPlatformTicket(id: String, headers: Map<String, String> = emptyMap())
    : Response<Ticket>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getPlatformTicket(
        companyId = config.companyId,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editPlatformTicket(id: String,body: EditTicketPayload, headers: Map<String, String> = emptyMap())
    : Response<Ticket>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.editPlatformTicket(
        companyId = config.companyId,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun createPlatformTicketHistory(id: String,body: TicketHistoryPayload, headers: Map<String, String> = emptyMap())
    : Response<TicketHistory>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.createPlatformTicketHistory(
        companyId = config.companyId,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPlatformTicketHistory(id: String, headers: Map<String, String> = emptyMap())
    : Response<TicketHistoryList>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getPlatformTicketHistory(
        companyId = config.companyId,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    suspend fun getGeneralConfig( headers: Map<String, String> = emptyMap())
    : Response<GeneralConfigResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getGeneralConfig(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    suspend fun getTickets(items: Boolean?=null,filters: Boolean?=null,q: String?=null,status: String?=null,priority: String?=null,category: String?=null, headers: Map<String, String> = emptyMap())
    : Response<TicketList>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTickets(companyId = config.companyId ,applicationId = applicationId ,items = items,filters = filters,q = q,status = status,priority = priority,category = category, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getTicket(id: String, headers: Map<String, String> = emptyMap())
    : Response<Ticket>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTicket(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editTicket(id: String,body: EditTicketPayload, headers: Map<String, String> = emptyMap())
    : Response<Ticket>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.editTicket(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun createNewHistory(id: String,body: TicketHistoryPayload, headers: Map<String, String> = emptyMap())
    : Response<TicketHistory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.createNewHistory(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getTicketHistory(id: String, headers: Map<String, String> = emptyMap())
    : Response<TicketHistoryList>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTicketHistory(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomForm(slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomForm>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getCustomForm(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editCustomForm(slug: String,body: EditCustomFormPayload, headers: Map<String, String> = emptyMap())
    : Response<CustomForm>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.editCustomForm(companyId = config.companyId ,applicationId = applicationId ,slug = slug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteCustomForm(slug: String, headers: Map<String, String> = emptyMap())
    : Response<CustomForm>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.deleteCustomForm(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomForms( headers: Map<String, String> = emptyMap())
    : Response<CustomFormList>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getCustomForms(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCustomForm(body: CreateCustomFormPayload, headers: Map<String, String> = emptyMap())
    : Response<CustomForm>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.createCustomForm(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
}
}