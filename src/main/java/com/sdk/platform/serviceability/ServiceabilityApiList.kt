package com.sdk.platform.serviceability

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface ServiceabilityApiList {
    
    @POST ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones")
    suspend fun createZone(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateZoneDataSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<ZoneSchema>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones")
    suspend fun getZones(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("stage") stage: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("fulfillment_option_slug") fulfillmentOptionSlug: String?, @Query("is_active") isActive: Boolean?, @Query("q") q: String?, @Query("country_iso_code") countryIsoCode: String?, @Query("pincode") pincode: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("sector") sector: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ListViewSchema>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    suspend fun getZone(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetZoneByIdSchema>
    
    @PATCH ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    suspend fun updateZone(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String, @Path("application_id") applicationId: String,@Body body: UpdateZoneData, @HeaderMap headers: Map<String, String>? = null)
    : Response<ZoneUpdateSuccessResult>
    
    @DELETE ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    suspend fun deleteZone(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ZoneDeleteSuccessResult>
    
    @POST ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/export")
    suspend fun createBulkExport(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BulkCreateZoneExport, @HeaderMap headers: Map<String, String>? = null)
    : Response<ZoneBulkExport>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/export/{batch_id}")
    suspend fun getBulkExport(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("batch_id") batchId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetZoneBulkExport>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas")
    suspend fun createGeoArea(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GeoAreaRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaResponseBody>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas")
    suspend fun getGeoAreas(@Path("application_id") applicationId: String, @Path("company_id") companyId: String, @Query("page_size") pageSize: Int?, @Query("is_active") isActive: Boolean?, @Query("page_no") pageNo: Int?, @Query("type") type: String?, @Query("q") q: String?, @Query("country_iso_code") countryIsoCode: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("pincode") pincode: String?, @Query("sector") sector: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaGetResponseBody>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/{geoarea_id}")
    suspend fun getGeoArea(@Path("company_id") companyId: String, @Path("geoarea_id") geoareaId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaDetails>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/{geoarea_id}")
    suspend fun updateGeoArea(@Path("company_id") companyId: String, @Path("geoarea_id") geoareaId: String, @Path("application_id") applicationId: String,@Body body: GeoAreaRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaPutResponseBody>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk")
    suspend fun createBulkGeoArea(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BulkGeoAreaDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkGeoAreaResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/{geoarea_id}")
    suspend fun getBulkGeoArea(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("geoarea_id") geoareaId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkGeoAreaGetResult>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/{geoarea_id}")
    suspend fun updateBulkGeoArea(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("geoarea_id") geoareaId: String,@Body body: BulkGeoAreaDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkGeoAreaResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk/export/{geoarea_id}")
    suspend fun createGeoAreaExportJob(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("geoarea_id") geoareaId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaBulkCreationResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk/export/{geoarea_id}")
    suspend fun getGeoAreaExportJobStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("geoarea_id") geoareaId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaBulkExportResult>
    
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
    : Response<CourierAccountDetailsBody>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    suspend fun getCourierPartnerAccounts(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("stage") stage: String?, @Query("payment_mode") paymentMode: String?, @Query("transport_type") transportType: String?, @Query("account_ids") accountIds: ArrayList<String>?, @Query("self_ship") selfShip: Boolean?, @Query("own_account") ownAccount: Boolean?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyCourierPartnerAccountListResult>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    suspend fun updateCourierPartnerAccount(@Path("company_id") companyId: String, @Path("account_id") accountId: String,@Body body: CourierAccountDetailsBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierAccountDetailsBody>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    suspend fun getCourierPartnerAccount(@Path("company_id") companyId: String, @Path("account_id") accountId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierAccountResult>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_uid}")
    suspend fun updateCourierRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_uid") ruleUid: String,@Body body: CourierPartnerRule, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerRuleResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_uid}")
    suspend fun getCourierPartnerRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_uid") ruleUid: String, @HeaderMap headers: Map<String, String>? = null)
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
    suspend fun updateCompanyConfiguration(@Path("company_id") companyId: String, @Query("fulfillment_option_slug") fulfillmentOptionSlug: String,@Body body: CompanyConfigurationSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyConfig>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    suspend fun getCompanyConfiguration(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyConfig>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun getApplicationConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationConfigGetResult>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun patchApplicationConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationConfigPatch, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationConfigPatchResult>
    
    @POST ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    suspend fun bulkTat(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("scheme_id") schemeId: String,@Body body: BulkRegionJobDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkRegionResultItemData>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    suspend fun getBulkTat(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("scheme_id") schemeId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("batch_id") batchId: String?, @Query("action") action: String?, @Query("status") status: String?, @Query("country") country: String?, @Query("region") region: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkRegionResult>
    
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
    
    @POST ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    suspend fun bulkServiceability(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("scheme_id") schemeId: String,@Body body: BulkRegionJobDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkRegionResultItemData>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    suspend fun getBulkServiceability(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("scheme_id") schemeId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("batch_id") batchId: String?, @Query("action") action: String?, @Query("status") status: String?, @Query("country") country: String?, @Query("region") region: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkRegionResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    suspend fun createPackageMaterial(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?,@Body body: PackageMaterial, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    suspend fun getPackageMaterialList(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("size") size: String?, @Query("package_type") packageType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackagesListResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules")
    suspend fun createPackageMaterialRule(@Path("company_id") companyId: String,@Body body: PackageRule, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageRuleResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    suspend fun getPackageMaterialRule(@Path("company_id") companyId: String, @Path("rule_id") ruleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageRuleResult>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    suspend fun updatePackageMaterialRule(@Path("company_id") companyId: String, @Path("rule_id") ruleId: String,@Body body: PackageRule, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageRuleResult>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    suspend fun updatePackageMaterials(@Path("company_id") companyId: String, @Path("package_material_id") packageMaterialId: String,@Body body: PackageMaterial, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    suspend fun getPackageMaterials(@Path("company_id") companyId: String, @Path("package_material_id") packageMaterialId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageItem>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/priority")
    suspend fun updateCourierPartnerRulePriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RulePriorityDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<RulePriorityResult>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/priority")
    suspend fun updateStoreRulePriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RulePriorityDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<RulePriorityResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/optimal-locations")
    suspend fun getOptimalLocations(@Path("company_id") companyId: String,@Body body: OptimlLocationsRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptimalLocationsResult>
    
    @POST ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/scheme")
    suspend fun createCourierPartnerScheme(@Path("company_id") companyId: String,@Body body: CourierPartnerSchemeDetailsModel, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerSchemeModelSchema>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/scheme")
    suspend fun getCourierPartnerSchemes(@Path("company_id") companyId: String, @Query("scheme_type") schemeType: String?, @Query("payment_mode") paymentMode: String?, @Query("capabilities") capabilities: ArrayList<String>?, @Query("scheme_ids") schemeIds: ArrayList<String>?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerSchemeList>
    
    @PUT ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/scheme/{scheme_id}")
    suspend fun updateCourierPartnerScheme(@Path("scheme_id") schemeId: String, @Path("company_id") companyId: String,@Body body: CourierPartnerSchemeUpdateDetailsSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerSchemeModelSchema>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/scheme/{scheme_id}")
    suspend fun getCourierPartnerScheme(@Path("scheme_id") schemeId: String, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerSchemeModelSchema>
    
    @POST ("/service/platform/logistics/v2.0/company/{company_id}/localities/bulk-sample")
    suspend fun sampleFileServiceability(@Path("company_id") companyId: String,@Body body: BulkRegionServiceabilityTatDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkRegionServiceabilityTatResultItemData>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/localities/bulk-sample")
    suspend fun getSampleFileServiceabilityStatus(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("batch_id") batchId: String?, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkRegionServiceabilityTatResult>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/countries")
    suspend fun getCountries(@Path("company_id") companyId: String, @Query("onboard") onboard: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("hierarchy") hierarchy: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCountries>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/list")
    suspend fun getInstalledCourierPartnerExtensions(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_installed") isInstalled: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InstallCourierPartnerResponseSchema>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/selfship")
    suspend fun getSelfShipDetails(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SelfshipSchema>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/selfship")
    suspend fun updateSelfShipDetails(@Path("company_id") companyId: String,@Body body: SelfshipSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<SelfshipSchema>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/sample")
    suspend fun downloadGeoareaSampleFile(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResponseBody>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/fulfillment-options")
    suspend fun createFulfillmentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: FulfillmentOption, @HeaderMap headers: Map<String, String>? = null)
    : Response<FulfillmentOption>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/fulfillment-options")
    suspend fun getFulfillmentOptionsList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("product_slug") productSlug: String?, @Query("store_id") storeId: Int?, @Query("status") status: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FulfillmentOptionsList>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/fulfillment-options/{slug}")
    suspend fun getFulfillmentOptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Query("product_id") productId: Int?, @Query("store_id") storeId: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FulfillmentOption>
    
    @DELETE ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/fulfillment-options/{slug}")
    suspend fun deleteFulfillmentOptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OperationResponseSchema>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/fulfillment-options/{slug}")
    suspend fun putFulfillmentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String,@Body body: FulfillmentOption, @HeaderMap headers: Map<String, String>? = null)
    : Response<FulfillmentOption>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/fulfillment-options/{slug}/products")
    suspend fun getFulfillmentOptionProducts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Query("q") q: String?, @Query("store_id") storeId: Int, @HeaderMap headers: Map<String, String>? = null)
    : Response<FulfillmentOptionProducts>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/fulfillment-options/{slug}/stores")
    suspend fun getFulfillmentOptionStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FulfillmentOptionStores>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/fulfillment-options/bulk")
    suspend fun uploadBulkFulfillmentOptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: FulfillmentOptionBulk, @HeaderMap headers: Map<String, String>? = null)
    : Response<FulfillmentOptionBulkData>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/fulfillment-options/bulk/validate/{type}")
    suspend fun validateBulkFulfillmentOptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String,@Body body: FulfillmentOptionBulkValidate, @HeaderMap headers: Map<String, String>? = null)
    : Response<FulfillmentOptionBulkValidateData>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/fulfillment-options/poll/validate/{bulk_id}")
    suspend fun getBulkFulfillmentValidationStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("bulk_id") bulkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<FulfillmentOptionBulkValidate>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/shipments")
    suspend fun createShipments(@Header("x-ordering-source") xOrderingSource: String?, @Path("application_id") applicationId: String, @Path("company_id") companyId: String,@Body body: PlatformShipmentsRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformShipmentsResponseSchema>
    
}
