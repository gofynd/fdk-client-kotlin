package com.sdk.application.lead

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface LeadApiList {
    
    
    @GET 
    suspend fun getTicket(@Url url1: String?    )
    : Response<Ticket>
    
    
    @POST 
    suspend fun createHistory(@Url url1: String?    ,@Body body: TicketHistoryPayload)
    : Response<TicketHistory>
    
    
    @POST 
    suspend fun createTicket(@Url url1: String?   ,@Body body: AddTicketPayload)
    : Response<Ticket>
    
    
    @GET 
    suspend fun getCustomForm(@Url url1: String?    )
    : Response<CustomForm>
    
    
    @POST 
    suspend fun submitCustomForm(@Url url1: String?    ,@Body body: CustomFormSubmissionPayload)
    : Response<SubmitCustomFormResponse>
    
    
    @GET 
    suspend fun getParticipantsInsideVideoRoom(@Url url1: String?    )
    : Response<GetParticipantsInsideVideoRoomResponse>
    
    
    @GET 
    suspend fun getTokenForVideoRoom(@Url url1: String?    )
    : Response<GetTokenForVideoRoomResponse>
    
}