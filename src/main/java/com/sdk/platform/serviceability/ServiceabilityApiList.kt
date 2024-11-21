package com.sdk.platform.serviceability

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface ServiceabilityApiList {
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/zones")
    suspend fun getZones(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_active") isActive: Boolean?, @Query("channel_id") channelId: String?, @Query("q") q: String?, @Query("country_iso_code") countryIsoCode: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("pincode") pincode: String?, @Query("sector") sector: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ListViewResult>
    
    @POST ("/service/platform/logistics/v2.0/company/{company_id}/zones")
    suspend fun createZone(@Path("company_id") companyId: String,@Body body: CreateZoneData, @HeaderMap headers: Map<String, String>? = null)
    : Response<ZoneResult>
    
    @PUT ("/service/platform/logistics/v2.0/company/{company_id}/zones/{zone_id}")
    suspend fun updateZoneById(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String,@Body body: UpdateZoneData, @HeaderMap headers: Map<String, String>? = null)
    : Response<ZoneSuccessResult>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/zones/{zone_id}")
    suspend fun getZoneById(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetZoneByIdSchema>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/logistics/stores")
    suspend fun getAllStores(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetStoresViewResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    suspend fun updatePincodeMopView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeMopData, @HeaderMap headers: Map<String, String>? = null)
    : Response<PincodeMOPResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    suspend fun updatePincodeBulkView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeMopBulkData, @HeaderMap headers: Map<String, String>? = null)
    : Response<PincodeBulkViewResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    suspend fun updatePincodeCoDListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_number") pageNumber: Int?, @Query("page_size") pageSize: Int?,@Body body: PincodeCodStatusListingDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<PincodeCodStatusListingResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    suspend fun updatePincodeAuditHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_number") pageNumber: Int?, @Query("page_size") pageSize: Int?,@Body body: PincodeMopUpdateAuditHistoryDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<PincodeMopUpdateAuditHistoryResultData>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    suspend fun createCourierPartnerAccount(@Path("company_id") companyId: String,@Body body: CourierAccountDetailsBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierAccount>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    suspend fun getCourierPartnerAccounts(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("stage") stage: String?, @Query("payment_mode") paymentMode: String?, @Query("transport_type") transportType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyCourierPartnerAccountListResult>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    suspend fun updateCourierPartnerAccount(@Path("company_id") companyId: String, @Path("account_id") accountId: String,@Body body: CourierAccountUpdateDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierAccountResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    suspend fun getCourierPartnerAccount(@Path("company_id") companyId: String, @Path("account_id") accountId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierAccountResult>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_id}")
    suspend fun updateCourierRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_id") ruleId: String,@Body body: CourierPartnerRule, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerRuleResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_id}")
    suspend fun getCourierPartnerRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_id") ruleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerRuleResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    suspend fun createCourierPartnerRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CourierPartnerRule, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerRuleResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    suspend fun getCourierPartnerRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("status") status: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerRulesListResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/shipment/courier-partners")
    suspend fun getCourierPartners(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ShipmentCourierPartnerDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentCourierPartnerResult>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    suspend fun updateCompanyConfiguration(@Path("company_id") companyId: String,@Body body: CompanyConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyConfig>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    suspend fun getCompanyConfiguration(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyConfig>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun updateApplicationConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationConfig, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationConfig>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun getApplicationConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationConfig>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    suspend fun bulkTat(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("scheme_id") schemeId: String,@Body body: BulkRegionJobDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkRegionResultItemData>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    suspend fun getBulkTat(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("scheme_id") schemeId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("batch_id") batchId: String?, @Query("action") action: String?, @Query("status") status: String?, @Query("country") country: String?, @Query("region") region: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkRegionResult>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    suspend fun patchApplicationServiceabilitySelfShipment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SelfShipResult, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationSelfShipConfigResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    suspend fun getApplicationServiceabilitySelfShipment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationSelfShipConfigResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/configuration")
    suspend fun getApplicationConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreRuleConfigData>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/configuration")
    suspend fun insertApplicationConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: StoreRuleConfigData, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreRuleConfigData>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/configuration")
    suspend fun updateStoreRulesConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: StoreRuleConfigData, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreRuleConfigData>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules")
    suspend fun getStoreRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("status") status: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetStoreRulesApiResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules")
    suspend fun createStoreRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateStoreRuleDetailsSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreRuleResultSchema>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}")
    suspend fun getStoreRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_uid") ruleUid: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreRuleDataSchema>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}")
    suspend fun updateStoreRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_uid") ruleUid: String,@Body body: CreateStoreRuleDetailsSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreRuleUpdateResultSchema>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    suspend fun bulkServiceability(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("scheme_id") schemeId: String,@Body body: BulkRegionJobDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkRegionResultItemData>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    suspend fun getBulkServiceability(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("scheme_id") schemeId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("batch_id") batchId: String?, @Query("action") action: String?, @Query("status") status: String?, @Query("country") country: String?, @Query("region") region: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkRegionResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/region/{region_id}")
    suspend fun getServiceability(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("scheme_id") schemeId: String, @Path("region_id") regionId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ServiceabilityModel>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/region/{region_id}")
    suspend fun updateServiceability(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("scheme_id") schemeId: String, @Path("region_id") regionId: String,@Body body: ServiceabilityModel, @HeaderMap headers: Map<String, String>? = null)
    : Response<ServiceabilityModel>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    suspend fun createPackageMaterial(@Path("company_id") companyId: String,@Body body: PackageMaterial, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    suspend fun getPackageMaterialList(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("size") size: String?, @Query("package_type") packageType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialList>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules")
    suspend fun createPackageMaterialRule(@Path("company_id") companyId: String,@Body body: PackageRule, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageRuleResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules")
    suspend fun getPackageMaterialRules(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_active") isActive: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialRuleList>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    suspend fun updatePackageMaterialRule(@Path("company_id") companyId: String, @Path("rule_id") ruleId: String,@Body body: PackageRule, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageRuleResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    suspend fun getPackageMaterialRule(@Path("company_id") companyId: String, @Path("rule_id") ruleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageRuleResult>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    suspend fun updatePackageMaterials(@Path("company_id") companyId: String, @Path("package_material_id") packageMaterialId: String,@Body body: PackageMaterial, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    suspend fun getPackageMaterials(@Path("company_id") companyId: String, @Path("package_material_id") packageMaterialId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialResult>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/priority")
    suspend fun updateCourierPartnerRulePriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RulePriorityDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<RulePriorityResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/optimal-locations")
    suspend fun getOptimalLocations(@Path("company_id") companyId: String,@Body body: OptimlLocationsDetailsSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptimalLocationsResult>
    
}
