package com.sdk.platform.apis.lead

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.lead.*

interface LeadApiList {
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    fun getTickets(@Path("company_id") companyId: String, @Query("items") items: Boolean?, @Query("filters") filters: Boolean?, @Query("q") q: String?, @Query("status") status: String?, @Query("priority") priority: PriorityEnum?, @Query("category") category: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<TicketList>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    fun createTicket(@Path("company_id") companyId: String,@Body body: AddTicketPayload)
    : Deferred<Response<Ticket>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket")
    fun getTickets(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("items") items: Boolean?, @Query("filters") filters: Boolean?, @Query("q") q: String?, @Query("status") status: String?, @Query("priority") priority: PriorityEnum?, @Query("category") category: String?)
    : Deferred<Response<TicketList>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    fun getTicket(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<Ticket>>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    fun editTicket(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: EditTicketPayload)
    : Deferred<Response<Ticket>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    fun getTicket(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<Ticket>>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    fun editTicket(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EditTicketPayload)
    : Deferred<Response<Ticket>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    fun createHistory(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    fun getTicketHistory(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<TicketHistoryList>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    fun getFeedbacks(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<TicketFeedbackList>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    fun submitFeedback(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: TicketFeedbackPayload)
    : Deferred<Response<TicketFeedback>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    fun createHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    fun getTicketHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<TicketHistoryList>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    fun getCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<CustomForm>>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    fun editCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String,@Body body: EditCustomFormPayload)
    : Deferred<Response<CustomForm>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    fun getCustomForms(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<CustomFormList>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    fun createCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateCustomFormPayload)
    : Deferred<Response<CustomForm>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/video/room/{unique_name}/token")
    fun getTokenForVideoRoom(@Path("company_id") companyId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/token")
    fun getTokenForVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/video/room/{unique_name}/participants")
    fun getVideoParticipants(@Path("company_id") companyId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/participants")
    fun getVideoParticipants(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room")
    fun openVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateVideoRoomPayload)
    : Deferred<Response<CreateVideoRoomResponse>>
    
    @DELETE ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}")
    fun closeVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<CloseVideoRoomResponse>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/general-config")
    fun getGeneralConfig(@Path("company_id") companyId: String)
    : Deferred<Response<CloseVideoRoomResponse>>
    
}