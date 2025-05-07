package com.sdk.application.lead

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface LeadApiList {
    
    
    @GET
    suspend fun getTicket(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<Ticket>
    
    
    @POST
    suspend fun createHistory(@Url url1: String?    ,@Body body: TicketHistoryPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<TicketHistory>
    
    
    @POST
    suspend fun createTicket(@Url url1: String?   ,@Body body: AddTicketPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<Ticket>
    
    
    @GET
    suspend fun getCustomForm(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomForm>
    
    
    @POST
    suspend fun submitCustomForm(@Url url1: String?    ,@Body body: CustomFormSubmissionPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubmitCustomFormResponseSchema>
    
}
