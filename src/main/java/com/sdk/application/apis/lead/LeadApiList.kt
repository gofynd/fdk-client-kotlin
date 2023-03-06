package com.sdk.application.apis.lead

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.lead.*

interface LeadApiList {
    
    
    @GET 
    fun getTicket(@Url url1: String?    )
    : Deferred<Response<Ticket>>
    
    
    @POST 
    fun createHistory(@Url url1: String?    ,@Body body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>
    
    
    @POST 
    fun createTicket(@Url url1: String?   ,@Body body: AddTicketPayload)
    : Deferred<Response<Ticket>>
    
    
    @GET 
    fun getCustomForm(@Url url1: String?    )
    : Deferred<Response<CustomForm>>
    
    
    @POST 
    fun submitCustomForm(@Url url1: String?    ,@Body body: CustomFormSubmissionPayload)
    : Deferred<Response<SubmitCustomFormResponse>>
    
    
    @GET 
    fun getParticipantsInsideVideoRoom(@Url url1: String?    )
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    
    @GET 
    fun getTokenForVideoRoom(@Url url1: String?    )
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
}