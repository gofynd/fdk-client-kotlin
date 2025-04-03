package com.sdk.platform.lead

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface LeadApiList {
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    suspend fun getPlatformTickets(@Path("company_id") companyId: String, @Query("items") items: Boolean?, @Query("filters") filters: Boolean?, @Query("q") q: String?, @Query("status") status: String?, @Query("priority") priority: PriorityEnum?, @Query("category") category: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<TicketList>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    suspend fun createTicket(@Path("company_id") companyId: String,@Body body: AddTicketPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<Ticket>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket")
    suspend fun getNewTickets(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("items") items: Boolean?, @Query("filters") filters: Boolean?, @Query("q") q: String?, @Query("status") status: String?, @Query("priority") priority: PriorityEnum?, @Query("category") category: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<TicketList>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    suspend fun getPlatformTicket(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Ticket>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    suspend fun editPlatformTicket(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: EditTicketPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<Ticket>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    suspend fun getNewTicket(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Ticket>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    suspend fun editNewTicket(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EditTicketPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<Ticket>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    suspend fun createPlatformTicketHistory(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: TicketHistoryPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<TicketHistory>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    suspend fun getPlatformTicketHistory(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<TicketHistoryList>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    suspend fun getFeedbacks(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<TicketFeedbackList>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    suspend fun submitFeedback(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: TicketFeedbackPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<TicketFeedback>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    suspend fun createNewHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: TicketHistoryPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<TicketHistory>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    suspend fun getNewTicketHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<TicketHistoryList>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    suspend fun getCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomForm>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    suspend fun editCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String,@Body body: EditCustomFormPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomForm>
    
    @DELETE ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    suspend fun deleteCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomForm>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    suspend fun getCustomForms(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomFormList>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    suspend fun createCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateCustomFormPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomForm>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/general-config")
    suspend fun getGeneralConfig(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeneralConfigResponse>
    
}
