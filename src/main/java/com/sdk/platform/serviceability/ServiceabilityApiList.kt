package com.sdk.platform.serviceability

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface ServiceabilityApiList {
    
    @POST ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones")
    suspend fun createZone(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateZoneV2Data, @HeaderMap headers: Map<String, String>? = null)
    : Response<ZoneResponseV2>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones")
    suspend fun getZones(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("stage") stage: String?, @Query("type") type: String?, @Query("access_level") accessLevel: String?, @Query("status") status: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("is_active") isActive: Boolean?, @Query("q") q: String?, @Query("country_iso_code") countryIsoCode: String?, @Query("pincode") pincode: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("sector") sector: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ListViewResponseV2>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    suspend fun getZone(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetZoneByIdSchema>
    
    @PATCH ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    suspend fun updateZone(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String, @Path("application_id") applicationId: String,@Body body: UpdateZoneDataV2, @HeaderMap headers: Map<String, String>? = null)
    : Response<ZoneUpdateSuccessResponse>
    
    @DELETE ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    suspend fun deleteZone(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ZoneDeleteSuccessResponse>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}/details")
    suspend fun getZoneDetails(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetZoneByIdDetailsSchema>
    
    @POST ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk")
    suspend fun createBulkZone(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateBulkZoneData, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateBulkZoneResponse>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/history")
    suspend fun getBulkZone(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetBulkZoneHistory>
    
    @POST ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/export")
    suspend fun createBulkExport(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BulkCreateZoneExport, @HeaderMap headers: Map<String, String>? = null)
    : Response<ZoneBulkExport>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/export/{batch_id}")
    suspend fun getBulkExport(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("batch_id") batchId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetZoneBulkExport>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    suspend fun updatePincodeMopView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeMopData, @HeaderMap headers: Map<String, String>? = null)
    : Response<PincodeMOPresponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    suspend fun updatePincodeBulkView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeMopBulkData, @HeaderMap headers: Map<String, String>? = null)
    : Response<PincodeBulkViewResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    suspend fun updatePincodeCoDListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeCodStatusListingRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PincodeCodStatusListingResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    suspend fun updatePincodeAuditHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PincodeMopUpdateAuditHistoryRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PincodeMopUpdateAuditHistoryResponseData>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas")
    suspend fun createGeoArea(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GeoAreaRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaResponseBody>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas")
    suspend fun getGeoAreas(@Path("application_id") applicationId: String, @Path("company_id") companyId: String, @Query("page_size") pageSize: Int?, @Query("is_active") isActive: Boolean?, @Query("page_no") pageNo: Int?, @Query("type") type: String?, @Query("q") q: String?, @Query("country_iso_code") countryIsoCode: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("pincode") pincode: String?, @Query("sector") sector: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaGetResponseBody>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/{geoarea_id}")
    suspend fun getGeoArea(@Path("company_id") companyId: String, @Path("geoarea_id") geoareaId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaResponse>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/{geoarea_id}")
    suspend fun updateGeoArea(@Path("company_id") companyId: String, @Path("geoarea_id") geoareaId: String, @Path("application_id") applicationId: String,@Body body: GeoAreaRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaPutResponseBody>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk")
    suspend fun createBulkGeoArea(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BulkGeoAreaDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkGeoAreaResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/{geoarea_id}")
    suspend fun getBulkGeoArea(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("geoarea_id") geoareaId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkGeoAreaGetResponse>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/{geoarea_id}")
    suspend fun updateBulkGeoArea(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("geoarea_id") geoareaId: String,@Body body: BulkGeoAreaDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkGeoAreaResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk/export/{geoarea_id}")
    suspend fun createGeoAreaExportJob(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("geoarea_id") geoareaId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaBulkCreationResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk/export/{geoarea_id}")
    suspend fun getGeoAreaExportJobStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("geoarea_id") geoareaId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaBulkExportResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk/export")
    suspend fun createBulkGeoAreaExport(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PriceBulkGeoAreaExportRequestPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<PriceGeoAreaExportResult>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk")
    suspend fun createBulkGeoAreas(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PriceBulkGeoAreaPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkGeoAreaResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk/history")
    suspend fun getBulkGeoAreasHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetBulkPriceZoneHistory>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk/sample")
    suspend fun getBulkGeoAreasSample(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResponseBody>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/export/{batch_id}")
    suspend fun getGeoAreasExportStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("batch_id") batchId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetExportPriceZoneHistory>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/selfship")
    suspend fun updateCompanySelfShip(@Path("company_id") companyId: String,@Body body: CompanySelfShip, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanySelfShip>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/selfship")
    suspend fun getCompanySelfShip(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanySelfShip>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    suspend fun createCourierPartnerAccount(@Path("company_id") companyId: String,@Body body: CourierAccount, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierAccount>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    suspend fun getCourierPartnerAccounts(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("stage") stage: String?, @Query("payment_mode") paymentMode: String?, @Query("transport_type") transportType: String?, @Query("account_ids") accountIds: ArrayList<String>?, @Query("self_ship") selfShip: Boolean?, @Query("own_account") ownAccount: Boolean?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyCourierPartnerAccountListResponse>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    suspend fun updateCourierPartnerAccount(@Path("company_id") companyId: String, @Path("account_id") accountId: String,@Body body: CourierAccount, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierAccount>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    suspend fun getCourierPartnerAccount(@Path("company_id") companyId: String, @Path("account_id") accountId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierAccountResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    suspend fun createCourierPartnerRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CourierPartnerRule, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerRuleResponseSchema>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    suspend fun getCourierPartnerRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("status") status: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerRulesListResponse>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_uid}")
    suspend fun updateCourierRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_uid") ruleUid: String,@Body body: CourierPartnerRule, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerRuleResponseSchema>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_uid}")
    suspend fun getCourierPartnerRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_uid") ruleUid: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerRuleResponseSchema>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    suspend fun updateCompanyConfiguration(@Path("company_id") companyId: String,@Body body: CompanyConfigurationShema, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyConfig>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    suspend fun getCompanyConfiguration(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompanyConfig>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun updateApplicationConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationConfigPutRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationConfigPutResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun getApplicationConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationConfigGetResponse>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    suspend fun patchApplicationConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationConfigPatchRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationConfigPatchResponse>
    
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
    : Response<GetStoreRulesApiResponse>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules")
    suspend fun createStoreRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateStoreRuleRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreRuleResponseSchema>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/priority")
    suspend fun updateStoreRulePriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RulePriorityRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<RulePriorityResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}")
    suspend fun getStoreRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_uid") ruleUid: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreRuleDataSchema>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}")
    suspend fun updateStoreRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_uid") ruleUid: String,@Body body: CreateStoreRuleRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreRuleUpdateResponseSchema>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    suspend fun createPackageMaterial(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?,@Body body: PackageMaterial, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    suspend fun getPackageMaterialList(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("size") size: String?, @Query("package_type") packageType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialList>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules")
    suspend fun createPackageMaterialRule(@Path("company_id") companyId: String,@Body body: PackageRuleRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageRuleResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}/details")
    suspend fun getPackageMaterialRuleDetails(@Path("company_id") companyId: String, @Path("rule_id") ruleId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_active") isActive: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageRuleResult>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/details")
    suspend fun getListPackageMaterialRuleDetails(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_active") isActive: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialRuleList>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    suspend fun getPackageMaterialRule(@Path("company_id") companyId: String, @Path("rule_id") ruleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageRuleResult>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    suspend fun updatePackageMaterialRule(@Path("company_id") companyId: String, @Path("rule_id") ruleId: String,@Body body: PackageRuleRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageRuleResult>
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    suspend fun updatePackageMaterials(@Path("company_id") companyId: String, @Path("package_material_id") packageMaterialId: String,@Body body: PackageMaterial, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    suspend fun getPackageMaterials(@Path("company_id") companyId: String, @Path("package_material_id") packageMaterialId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PackageMaterialResponse>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/priority")
    suspend fun updateCourierPartnerRulePriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RulePriorityRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<RulePriorityResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/list")
    suspend fun getInstalledCourierPartnerExtensions(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_installed") isInstalled: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<InstallCourierPartnerResponseSchema>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/localities")
    suspend fun getLocalitiesByPrefix(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetLocalities>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/localities/{locality_type}/{locality_value}")
    suspend fun getLocality(@Path("company_id") companyId: String, @Path("locality_type") localityType: String, @Path("locality_value") localityValue: String, @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetLocality>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/localities/{locality_type}")
    suspend fun getLocalities(@Path("company_id") companyId: String, @Path("locality_type") localityType: String, @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("name") name: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetLocalities>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/countries/{country_iso_code}")
    suspend fun getCountry(@Path("company_id") companyId: String, @Path("country_iso_code") countryIsoCode: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCountry>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/countries")
    suspend fun getCountries(@Path("company_id") companyId: String, @Query("onboard") onboard: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("hierarchy") hierarchy: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCountries>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/country/{country_iso_code}/address/templates/{template_name}/validate")
    suspend fun validateAddress(@Path("company_id") companyId: String, @Path("country_iso_code") countryIsoCode: String, @Path("template_name") templateName: String,@Body body: ValidateAddressRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateAddressRequest>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/optimal-locations")
    suspend fun getOptimalLocations(@Path("company_id") companyId: String,@Body body: OptimlLocationsRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<OptimalLocationsResponse>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_uid}/details")
    suspend fun getCourierPartnerRuleDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_uid") ruleUid: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerRuleResponseDetailSchema>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}/details")
    suspend fun getStoreRuleDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_uid") ruleUid: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreRuleDataDetailsSchema>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/sample")
    suspend fun downloadGeoareaSampleFile(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResponseBody>
    
    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/sample/{product_type}")
    suspend fun downloadZoneSampleFile(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("product_type") productType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResponseBody>
    
}
