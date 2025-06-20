package com.sdk.application.lead

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class LeadDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val leadApiList by lazy {
        generateleadApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getTicket"] = "/service/application/lead/v1.0/ticket/{id}".substring(1)
            
                    _relativeUrls["createHistory"] = "/service/application/lead/v1.0/ticket/{id}/history".substring(1)
            
                    _relativeUrls["createTicket"] = "/service/application/lead/v1.0/ticket/".substring(1)
            
                    _relativeUrls["getCustomForm"] = "/service/application/lead/v1.0/form/{slug}".substring(1)
            
                    _relativeUrls["submitCustomForm"] = "/service/application/lead/v1.0/form/{slug}/submit".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }


    private fun generateleadApiList(): LeadApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
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
            namespace = "ApplicationLead",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(LeadApiList::class.java) as? LeadApiList
    }
    
    suspend fun getTicket(id: String, headers: Map<String, String> = emptyMap()): Response<Ticket>? {
        var fullUrl : String? = _relativeUrls["getTicket"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return leadApiList?.getTicket(fullUrl,  headers = headers)}

    
    
    suspend fun createHistory(id: String,body: TicketHistoryPayload, headers: Map<String, String> = emptyMap()): Response<TicketHistory>? {
        var fullUrl : String? = _relativeUrls["createHistory"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return leadApiList?.createHistory(fullUrl,  body = body,headers = headers)}

    
    
    suspend fun createTicket(body: AddTicketPayload, headers: Map<String, String> = emptyMap()): Response<Ticket>? {
        var fullUrl : String? = _relativeUrls["createTicket"]
        
        return leadApiList?.createTicket(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getCustomForm(slug: String, headers: Map<String, String> = emptyMap()): Response<CustomForm>? {
        var fullUrl : String? = _relativeUrls["getCustomForm"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return leadApiList?.getCustomForm(fullUrl,  headers = headers)}

    
    
    suspend fun submitCustomForm(slug: String,body: CustomFormSubmissionPayload, headers: Map<String, String> = emptyMap()): Response<SubmitCustomFormDetails>? {
        var fullUrl : String? = _relativeUrls["submitCustomForm"]
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return leadApiList?.submitCustomForm(fullUrl,  body = body,headers = headers)}

    
    
}
