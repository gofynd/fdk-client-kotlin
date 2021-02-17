package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface ApiHelperFace {

    
    fun getTicket(@Path("id") id: String)
    :Deferred<Response<Ticket>>

    
    fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    :Deferred<Response<TicketHistory>>

    
    fun createTicket()
    :Deferred<Response<Ticket>>

    
    fun getCustomForm(@Path("slug") slug: String)
    :Deferred<Response<CustomForm>>

    
    fun submitCustomForm(@Path("slug") slug: String)
    :Deferred<Response<SubmitCustomFormResponse>>

    
    fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    :Deferred<Response<GetParticipantsInsideVideoRoomResponse>>

    
    fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    :Deferred<Response<GetTokenForVideoRoomResponse>>

    

}