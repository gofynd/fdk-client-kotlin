package com.sdk.platform.lead

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface LeadApiList {
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    suspend fun getTickets(@Path("company_id") companyId: String, @Query("items") items: Boolean?, @Query("filters") filters: Boolean?, @Query("q") q: String?, @Query("status") status: String?, @Query("priority") priority: PriorityEnum?, @Query("category") category: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<TicketList>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    suspend fun createTicket(@Path("company_id") companyId: String,@Body body: AddTicketPayload)
    : Response<Ticket>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket")
    suspend fun getNewTickets(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("items") items: Boolean?, @Query("filters") filters: Boolean?, @Query("q") q: String?, @Query("status") status: String?, @Query("priority") priority: PriorityEnum?, @Query("category") category: String?)
    : Response<TicketList>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    suspend fun getTicket(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<Ticket>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    suspend fun editTicket(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: EditTicketPayload)
    : Response<Ticket>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    suspend fun getNewTicket(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<Ticket>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    suspend fun editNewTicket(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EditTicketPayload)
    : Response<Ticket>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    suspend fun createHistory(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: TicketHistoryPayload)
    : Response<TicketHistory>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    suspend fun getTicketHistory(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<TicketHistoryList>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    suspend fun getFeedbacks(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<TicketFeedbackList>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    suspend fun submitFeedback(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: TicketFeedbackPayload)
    : Response<TicketFeedback>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    suspend fun createNewHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: TicketHistoryPayload)
    : Response<TicketHistory>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    suspend fun getNewTicketHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<TicketHistoryList>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    suspend fun getCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Response<CustomForm>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    suspend fun editCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String,@Body body: EditCustomFormPayload)
    : Response<CustomForm>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    suspend fun getCustomForms(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<CustomFormList>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    suspend fun createCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateCustomFormPayload)
    : Response<CustomForm>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/video/room/{unique_name}/token")
    suspend fun getTokenForVideoRoom(@Path("company_id") companyId: String, @Path("unique_name") uniqueName: String)
    : Response<GetTokenForVideoRoomResponse>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/token")
    suspend fun getNewTokenForVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Response<GetTokenForVideoRoomResponse>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/video/room/{unique_name}/participants")
    suspend fun getVideoParticipants(@Path("company_id") companyId: String, @Path("unique_name") uniqueName: String)
    : Response<GetParticipantsInsideVideoRoomResponse>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/participants")
    suspend fun getNewVideoParticipants(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Response<GetParticipantsInsideVideoRoomResponse>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room")
    suspend fun openVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateVideoRoomPayload)
    : Response<CreateVideoRoomResponse>
    
    @DELETE ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}")
    suspend fun closeVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Response<CloseVideoRoomResponse>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/general-config")
    suspend fun getGeneralConfig(@Path("company_id") companyId: String)
    : Response<CloseVideoRoomResponse>
    
}