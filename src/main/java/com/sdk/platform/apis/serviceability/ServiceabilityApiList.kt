package com.sdk.platform.apis.serviceability

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.serviceability.*

interface ServiceabilityApiList {
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/serviceability")
    fun getApplicationServiceability(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationServiceabilityConfigResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/regions")
    fun getEntityRegionView(@Path("company_id") companyId: String,@Body body: EntityRegionView_Request)
    : Deferred<Response<EntityRegionView_Response>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zones")
    fun getListView(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("is_active") isActive: Boolean?, @Query("channel_ids") channelIds: String?, @Query("q") q: String?)
    : Deferred<Response<ListViewResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/all-stores")
    fun getCompanyStoreView(@Path("company_id") companyId: String)
    : Deferred<Response<CompanyStoreView_Response>>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    fun updateZoneControllerView(@Path("zone_id") zoneId: String, @Path("company_id") companyId: String,@Body body: ZoneUpdateRequest)
    : Deferred<Response<ZoneSuccessResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    fun getZoneDataView(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String)
    : Deferred<Response<GetSingleZoneDataViewResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/zone")
    fun createZone(@Path("company_id") companyId: String,@Body body: ZoneRequest)
    : Deferred<Response<ZoneResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    fun getZonesFromApplicationIdView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("zone_id") zoneId: ArrayList<String>?, @Query("q") q: String?)
    : Deferred<Response<GetZoneFromApplicationIdViewResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    fun getZoneFromPincodeView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetZoneFromPincodeViewRequest)
    : Deferred<Response<GetZoneFromPincodeViewResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/stores/{store_uid}")
    fun getStore(@Path("company_id") companyId: String, @Path("store_uid") storeUid: String)
    : Deferred<Response<GetStoresViewResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/logistics/stores")
    fun getAllStores(@Path("company_id") companyId: String)
    : Deferred<Response<GetStoresViewResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/reassign")
    fun getOptimalLocations(@Path("company_id") companyId: String,@Body body: ReAssignStoreRequest)
    : Deferred<Response<ReAssignStoreResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}")
    fun addAppDp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationCompanyDpViewRequest)
    : Deferred<Response<ApplicationCompanyDpViewResponse>>
    
    @DELETE ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/{courier_partner_id}")
    fun deleteAppDp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("courier_partner_id") courierPartnerId: String)
    : Deferred<Response<ApplicationCompanyDpViewResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    fun updatePincodeMopView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeMopData)
    : Deferred<Response<PincodeMOPresponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    fun updatePincodeBulkView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeMopBulkData)
    : Deferred<Response<PincodeBulkViewResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    fun updatePincodeCoDListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeCodStatusListingRequest)
    : Deferred<Response<PincodeCodStatusListingResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    fun updatePincodeAuditHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeMopUpdateAuditHistoryRequest)
    : Deferred<Response<PincodeMopUpdateAuditHistoryResponseData>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/dp-account")
    fun upsertDpAccountView(@Path("company_id") companyId: String,@Body body: CompanyDpAccountRequest)
    : Deferred<Response<CompanyDpAccountResponse>>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/dp-rules/{rule_uid}")
    fun updateDpRuleView(@Path("company_id") companyId: String, @Path("rule_uid") ruleUid: String,@Body body: DpRulesUpdateRequest)
    : Deferred<Response<DpRuleUpdateSuccessResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/dp-rules/{rule_uid}")
    fun getDpRulesView(@Path("company_id") companyId: String, @Path("rule_uid") ruleUid: String)
    : Deferred<Response<DpRuleSuccessResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/dp-rules")
    fun getDpRuleInsertView(@Path("company_id") companyId: String)
    : Deferred<Response<DpMultipleRuleSuccessResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/dp-rules")
    fun upsertDpRulesView(@Path("company_id") companyId: String,@Body body: DpRuleRequest)
    : Deferred<Response<DpRuleSuccessResponse>>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/logistics")
    fun upsertDpCompanyRulesView(@Path("company_id") companyId: String,@Body body: DPCompanyRuleRequest)
    : Deferred<Response<DPCompanyRuleResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/logistics")
    fun getDpCompanyRulesView(@Path("company_id") companyId: String)
    : Deferred<Response<DPCompanyRuleResponse>>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/logistics")
    fun upsertDpApplicationRulesView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DPApplicationRuleRequest)
    : Deferred<Response<DPApplicationRuleResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/logistics")
    fun getDpApplicationRulesView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<DPApplicationRuleResponse>>
    
}