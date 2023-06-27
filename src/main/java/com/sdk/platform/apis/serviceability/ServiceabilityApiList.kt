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
    fun getCompanyStoreView(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<CompanyStoreView_Response>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    fun getZoneDataView(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String)
    : Deferred<Response<GetSingleZoneDataViewResponse>>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    fun updateZoneControllerView(@Path("zone_id") zoneId: String, @Path("company_id") companyId: String,@Body body: ZoneUpdateRequest)
    : Deferred<Response<ZoneSuccessResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/zone")
    fun createZone(@Path("company_id") companyId: String,@Body body: ZoneRequest)
    : Deferred<Response<ZoneResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    fun getZoneFromPincodeView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetZoneFromPincodeViewRequest)
    : Deferred<Response<GetZoneFromPincodeViewResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    fun getZonesFromApplicationIdView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("zone_id") zoneId: ArrayList<String>?, @Query("q") q: String?)
    : Deferred<Response<GetZoneFromApplicationIdViewResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zones-list")
    fun getZoneListView(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("is_active") isActive: Boolean?, @Query("channel_ids") channelIds: String?, @Query("q") q: String?, @Query("zone_id") zoneId: ArrayList<String>?)
    : Deferred<Response<ListViewResponse>>
    
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
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/tat/bulk")
    fun postRegionJobBulk(@Path("company_id") companyId: String,@Body body: BulkRegionJobSerializer)
    : Deferred<Response<PostBulkRegionJobResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/tat/bulk")
    fun getRegionJobBulk(@Path("company_id") companyId: String, @Query("current_page_number") currentPageNumber: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetBulkRegionJobResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/tat/bulk/{batch_id}")
    fun getRegionJobBulkBatchId(@Path("batch_id") batchId: String, @Path("company_id") companyId: String)
    : Deferred<Response<GetBulkRegionJobResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier/account")
    fun upsertDpAccount(@Path("company_id") companyId: String,@Body body: CompanyDpAccountRequest)
    : Deferred<Response<CompanyDpAccountResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/account")
    fun getDpAccountList(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_size") pageSize: Int?, @Query("stage") stage: String?, @Query("payment_mode") paymentMode: String?, @Query("transport_type") transportType: String?)
    : Deferred<Response<CompanyDpAccountListResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules/{rule_uid}")
    fun getDpRule(@Path("company_id") companyId: String, @Path("rule_uid") ruleUid: String)
    : Deferred<Response<DpRuleSuccessResponse>>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules/{rule_uid}")
    fun updateDpRule(@Path("company_id") companyId: String, @Path("rule_uid") ruleUid: String,@Body body: DpRulesUpdateRequest)
    : Deferred<Response<DpRuleUpdateSuccessResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules")
    fun createDpRule(@Path("company_id") companyId: String,@Body body: DpRuleRequest)
    : Deferred<Response<DpRuleSuccessResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules")
    fun getDpRuleList(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<DpMultipleRuleSuccessResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/priority")
    fun getDpCompanyRulePriority(@Path("company_id") companyId: String)
    : Deferred<Response<DPCompanyRuleResponse>>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier/priority")
    fun upsertDpCompanyRulePriority(@Path("company_id") companyId: String,@Body body: DPCompanyRuleRequest)
    : Deferred<Response<DPCompanyRuleResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier/priority")
    fun getDpApplicationRulePriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<DPApplicationRuleResponse>>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier/priority")
    fun upsertDpApplicationRulePriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DPApplicationRuleRequest)
    : Deferred<Response<DPApplicationRuleResponse>>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    fun patchApplicationServiceabilitySelfShipment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SelfShipResponse)
    : Deferred<Response<ApplicationSelfShipConfigResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    fun getApplicationServiceabilitySelfShipment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationSelfShipConfigResponse>>
    
}