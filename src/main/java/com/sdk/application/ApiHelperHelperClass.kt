package com.sdk.application

import com.sdk.common.ApiListProvider
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.Path

class ApiHelperHelperClass @Inject constructor(private val apiList: ApiList) : ApiHelperFace  {

    
    override fun getTicket(@Path("id") id: String)
    : Deferred<Response<Ticket>> {
        return apiList.getTicket(id = id)
    }
    
    override fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    : Deferred<Response<TicketHistory>> {
        return apiList.createHistoryForTicket(ticket_id = ticket_id)
    }
    
    override fun createTicket()
    : Deferred<Response<Ticket>> {
        return apiList.createTicket()
    }
    
    override fun getCustomForm(@Path("slug") slug: String)
    : Deferred<Response<CustomForm>> {
        return apiList.getCustomForm(slug = slug)
    }
    
    override fun submitCustomForm(@Path("slug") slug: String)
    : Deferred<Response<SubmitCustomFormResponse>> {
        return apiList.submitCustomForm(slug = slug)
    }
    
    override fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>> {
        return apiList.getParticipantsInsideVideoRoom(unique_name = unique_name)
    }
    
    override fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>> {
        return apiList.getTokenForVideoRoom(unique_name = unique_name)
    }
    

}