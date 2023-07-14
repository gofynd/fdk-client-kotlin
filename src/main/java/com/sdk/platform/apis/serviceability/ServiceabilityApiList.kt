package com.sdk.platform.apis.serviceability

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.serviceability.*

interface ServiceabilityApiList {
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/serviceability")
    suspend fun getApplicationServiceability(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ApplicationServiceabilityConfigResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/regions")
    suspend fun getEntityRegionView(@Path("company_id") companyId: String,@Body body: EntityRegionView_Request)
    : Response<EntityRegionView_Response>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zones")
    suspend fun getListView(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("is_active") isActive: Boolean?, @Query("channel_ids") channelIds: String?, @Query("q") q: String?)
    : Response<ListViewResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/all-stores")
    suspend fun getCompanyStoreView(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_size") pageSize: Int?)
    : Response<CompanyStoreView_Response>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    suspend fun updateZoneControllerView(@Path("zone_id") zoneId: String, @Path("company_id") companyId: String,@Body body: ZoneUpdateRequest)
    : Response<ZoneSuccessResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    suspend fun getZoneDataView(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String)
    : Response<GetSingleZoneDataViewResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/zone")
    suspend fun createZone(@Path("company_id") companyId: String,@Body body: ZoneRequest)
    : Response<ZoneResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    suspend fun getZonesFromApplicationIdView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("zone_id") zoneId: ArrayList<String>?, @Query("q") q: String?)
    : Response<GetZoneFromApplicationIdViewResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    suspend fun getZoneFromPincodeView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetZoneFromPincodeViewRequest)
    : Response<GetZoneFromPincodeViewResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zones-list")
    suspend fun getZoneListView(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("is_active") isActive: Boolean?, @Query("channel_ids") channelIds: String?, @Query("q") q: String?, @Query("zone_id") zoneId: ArrayList<String>?)
    : Response<ListViewResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/stores/{store_uid}")
    suspend fun getStore(@Path("company_id") companyId: String, @Path("store_uid") storeUid: String)
    : Response<GetStoresViewResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/logistics/stores")
    suspend fun getAllStores(@Path("company_id") companyId: String)
    : Response<GetStoresViewResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/reassign")
    suspend fun getOptimalLocations(@Path("company_id") companyId: String,@Body body: ReAssignStoreRequest)
    : Response<ReAssignStoreResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}")
    suspend fun addAppDp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationCompanyDpViewRequest)
    : Response<ApplicationCompanyDpViewResponse>
    
    @DELETE ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/{courier_partner_id}")
    suspend fun deleteAppDp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("courier_partner_id") courierPartnerId: String)
    : Response<ApplicationCompanyDpViewResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    suspend fun updatePincodeMopView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeMopData)
    : Response<PincodeMOPresponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    suspend fun updatePincodeBulkView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeMopBulkData)
    : Response<PincodeBulkViewResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    suspend fun updatePincodeCoDListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeCodStatusListingRequest)
    : Response<PincodeCodStatusListingResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    suspend fun updatePincodeAuditHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeMopUpdateAuditHistoryRequest)
    : Response<PincodeMopUpdateAuditHistoryResponseData>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/account")
    suspend fun getDpAccount(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_size") pageSize: Int?, @Query("stage") stage: String?, @Query("payment_mode") paymentMode: String?, @Query("transport_type") transportType: String?)
    : Response<CompanyDpAccountListResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier/account")
    suspend fun upsertDpAccount(@Path("company_id") companyId: String,@Body body: CompanyDpAccountRequest)
    : Response<CompanyDpAccountResponse>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules/{rule_uid}")
    suspend fun updateDpRule(@Path("company_id") companyId: String, @Path("rule_uid") ruleUid: String,@Body body: DpRulesUpdateRequest)
    : Response<DpRuleUpdateSuccessResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules/{rule_uid}")
    suspend fun getDpRules(@Path("company_id") companyId: String, @Path("rule_uid") ruleUid: String)
    : Response<DpRuleSuccessResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules")
    suspend fun getDpRuleInsert(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_size") pageSize: Int?)
    : Response<DpMultipleRuleSuccessResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules")
    suspend fun upsertDpRules(@Path("company_id") companyId: String,@Body body: DpRuleRequest)
    : Response<DpRuleSuccessResponse>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier/priority")
    suspend fun upsertDpCompanyRules(@Path("company_id") companyId: String,@Body body: DPCompanyRuleRequest)
    : Response<DPCompanyRuleResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/priority")
    suspend fun getDpCompanyRules(@Path("company_id") companyId: String)
    : Response<DPCompanyRuleResponse>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier/priority")
    suspend fun upsertDpApplicationRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DPApplicationRuleRequest)
    : Response<DPApplicationRuleResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier/priority")
    suspend fun getDpApplicationRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<DPApplicationRuleResponse>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    suspend fun patchApplicationServiceabilitySelfShipment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SelfShipResponse)
    : Response<ApplicationSelfShipConfigResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    suspend fun getApplicationServiceabilitySelfShipment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ApplicationSelfShipConfigResponse>
    
}