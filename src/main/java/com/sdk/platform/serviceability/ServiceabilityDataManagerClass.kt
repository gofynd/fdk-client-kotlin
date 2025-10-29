package com.sdk.platform.serviceability

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class ServiceabilityDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val serviceabilityApiList by lazy {
        generateserviceabilityApiList()
    }

    private fun generateserviceabilityApiList(): ServiceabilityApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        if(unauthorizedAction != null){
            val accessUnauthorizedInterceptor = AccessUnauthorizedInterceptor(unauthorizedAction)
            interceptorList.add(accessUnauthorizedInterceptor)
        }
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformServiceability",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(ServiceabilityApiList::class.java) as? ServiceabilityApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun createCourierPartnerAccount(body: CourierAccountDetailsBody, headers: Map<String, String> = emptyMap())
    : Response<CourierAccountDetailsBody>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createCourierPartnerAccount(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerAccounts(pageNo: Int?=null,pageSize: Int?=null,stage: String?=null,paymentMode: String?=null,transportType: String?=null,accountIds: ArrayList<String>?=null,selfShip: Boolean?=null,ownAccount: Boolean?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CompanyCourierPartnerAccountListResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCourierPartnerAccounts(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,stage = stage,paymentMode = paymentMode,transportType = transportType,accountIds = accountIds,selfShip = selfShip,ownAccount = ownAccount,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCourierPartnerAccount(accountId: String,body: CourierAccountDetailsBody, headers: Map<String, String> = emptyMap())
    : Response<CourierAccountDetailsBody>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateCourierPartnerAccount(
        companyId = config.companyId,accountId = accountId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerAccount(accountId: String, headers: Map<String, String> = emptyMap())
    : Response<CourierAccountResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCourierPartnerAccount(
        companyId = config.companyId,accountId = accountId, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    suspend fun updateCompanyConfiguration(fulfillmentOptionSlug: String,body: CompanyConfigurationSchema, headers: Map<String, String> = emptyMap())
    : Response<CompanyConfig>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateCompanyConfiguration(
        companyId = config.companyId,fulfillmentOptionSlug = fulfillmentOptionSlug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCompanyConfiguration( headers: Map<String, String> = emptyMap())
    : Response<CompanyConfig>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCompanyConfiguration(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    suspend fun bulkTat(extensionId: String,schemeId: String,body: BulkRegionJobDetails, headers: Map<String, String> = emptyMap())
    : Response<BulkRegionResultItemData>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.bulkTat(
        companyId = config.companyId,extensionId = extensionId,schemeId = schemeId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBulkTat(extensionId: String,schemeId: String,pageNo: Int?=null,pageSize: Int?=null,batchId: String?=null,action: String?=null,status: String?=null,country: String?=null,region: String?=null,startDate: String?=null,endDate: String?=null, headers: Map<String, String> = emptyMap())
    : Response<BulkRegionResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getBulkTat(
        companyId = config.companyId,extensionId = extensionId,schemeId = schemeId,pageNo = pageNo,pageSize = pageSize,batchId = batchId,action = action,status = status,country = country,region = region,startDate = startDate,endDate = endDate, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    suspend fun bulkServiceability(extensionId: String,schemeId: String,body: BulkRegionJobDetails, headers: Map<String, String> = emptyMap())
    : Response<BulkRegionResultItemData>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.bulkServiceability(
        companyId = config.companyId,extensionId = extensionId,schemeId = schemeId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBulkServiceability(extensionId: String,schemeId: String,pageNo: Int?=null,pageSize: Int?=null,batchId: String?=null,action: String?=null,status: String?=null,country: String?=null,region: String?=null,startDate: String?=null,endDate: String?=null, headers: Map<String, String> = emptyMap())
    : Response<BulkRegionResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getBulkServiceability(
        companyId = config.companyId,extensionId = extensionId,schemeId = schemeId,pageNo = pageNo,pageSize = pageSize,batchId = batchId,action = action,status = status,country = country,region = region,startDate = startDate,endDate = endDate, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createPackageMaterial(pageNo: Int?=null,body: PackageMaterial, headers: Map<String, String> = emptyMap())
    : Response<PackageMaterialResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createPackageMaterial(
        companyId = config.companyId,pageNo = pageNo, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPackageMaterialList(pageNo: Int?=null,pageSize: Int?=null,q: String?=null,size: String?=null,packageType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PackagesListResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterialList(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,q = q,size = size,packageType = packageType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createPackageMaterialRule(body: PackageRule, headers: Map<String, String> = emptyMap())
    : Response<PackageRuleResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createPackageMaterialRule(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPackageMaterialRule(ruleId: String, headers: Map<String, String> = emptyMap())
    : Response<PackageRuleResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterialRule(
        companyId = config.companyId,ruleId = ruleId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePackageMaterialRule(ruleId: String,body: PackageRule, headers: Map<String, String> = emptyMap())
    : Response<PackageRuleResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updatePackageMaterialRule(
        companyId = config.companyId,ruleId = ruleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePackageMaterials(packageMaterialId: String,body: PackageMaterial, headers: Map<String, String> = emptyMap())
    : Response<PackageMaterialResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updatePackageMaterials(
        companyId = config.companyId,packageMaterialId = packageMaterialId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPackageMaterials(packageMaterialId: String, headers: Map<String, String> = emptyMap())
    : Response<PackageItem>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterials(
        companyId = config.companyId,packageMaterialId = packageMaterialId, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getOptimalLocations(body: OptimlLocationsRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<OptimalLocationsResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getOptimalLocations(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCourierPartnerScheme(body: CourierPartnerSchemeDetailsModel, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerSchemeModelSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createCourierPartnerScheme(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerSchemes(schemeType: String?=null,paymentMode: String?=null,capabilities: ArrayList<String>?=null,schemeIds: ArrayList<String>?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerSchemeList>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCourierPartnerSchemes(
        companyId = config.companyId,schemeType = schemeType,paymentMode = paymentMode,capabilities = capabilities,schemeIds = schemeIds,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCourierPartnerScheme(schemeId: String,body: CourierPartnerSchemeUpdateDetailsSchema, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerSchemeModelSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateCourierPartnerScheme(
        schemeId = schemeId,companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerScheme(schemeId: String, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerSchemeModelSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCourierPartnerScheme(
        schemeId = schemeId,companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun sampleFileServiceability(body: BulkRegionServiceabilityTatDetails, headers: Map<String, String> = emptyMap())
    : Response<BulkRegionServiceabilityTatResultItemData>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.sampleFileServiceability(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSampleFileServiceabilityStatus(pageNo: Int?=null,pageSize: Int?=null,batchId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<BulkRegionServiceabilityTatResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getSampleFileServiceabilityStatus(
        pageNo = pageNo,pageSize = pageSize,batchId = batchId,companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCountries(onboard: Boolean?=null,pageNo: Int?=null,pageSize: Int?=null,q: String?=null,hierarchy: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetCountries>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCountries(
        companyId = config.companyId,onboard = onboard,pageNo = pageNo,pageSize = pageSize,q = q,hierarchy = hierarchy, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInstalledCourierPartnerExtensions(pageNo: Int?=null,pageSize: Int?=null,isInstalled: String?=null, headers: Map<String, String> = emptyMap())
    : Response<InstallCourierPartnerResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getInstalledCourierPartnerExtensions(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,isInstalled = isInstalled, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSelfShipDetails( headers: Map<String, String> = emptyMap())
    : Response<SelfshipSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getSelfShipDetails(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSelfShipDetails(body: SelfshipSchema, headers: Map<String, String> = emptyMap())
    : Response<SelfshipSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateSelfShipDetails(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun createZone(body: CreateZoneDataSchema, headers: Map<String, String> = emptyMap())
    : Response<ZoneSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createZone(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getZones(stage: String?=null,pageSize: Int?=null,pageNo: Int?=null,fulfillmentOptionSlug: String?=null,isActive: Boolean?=null,q: String?=null,countryIsoCode: String?=null,pincode: String?=null,state: String?=null,city: String?=null,sector: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ListViewSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getZones(companyId = config.companyId ,applicationId = applicationId ,stage = stage,pageSize = pageSize,pageNo = pageNo,fulfillmentOptionSlug = fulfillmentOptionSlug,isActive = isActive,q = q,countryIsoCode = countryIsoCode,pincode = pincode,state = state,city = city,sector = sector, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getZone(zoneId: String, headers: Map<String, String> = emptyMap())
    : Response<GetZoneByIdSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getZone(companyId = config.companyId ,zoneId = zoneId,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateZone(zoneId: String,body: UpdateZoneData, headers: Map<String, String> = emptyMap())
    : Response<ZoneUpdateSuccessResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateZone(companyId = config.companyId ,zoneId = zoneId,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteZone(zoneId: String, headers: Map<String, String> = emptyMap())
    : Response<ZoneDeleteSuccessResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.deleteZone(companyId = config.companyId ,zoneId = zoneId,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createBulkExport(body: BulkCreateZoneExport, headers: Map<String, String> = emptyMap())
    : Response<ZoneBulkExport>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createBulkExport(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBulkExport(batchId: String, headers: Map<String, String> = emptyMap())
    : Response<GetZoneBulkExport>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getBulkExport(companyId = config.companyId ,applicationId = applicationId ,batchId = batchId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createGeoArea(body: GeoAreaRequestBody, headers: Map<String, String> = emptyMap())
    : Response<GeoAreaResponseBody>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createGeoArea(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getGeoAreas(pageSize: Int?=null,isActive: Boolean?=null,pageNo: Int?=null,type: String?=null,q: String?=null,countryIsoCode: String?=null,state: String?=null,city: String?=null,pincode: String?=null,sector: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GeoAreaGetResponseBody>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getGeoAreas(applicationId = applicationId ,companyId = config.companyId ,pageSize = pageSize,isActive = isActive,pageNo = pageNo,type = type,q = q,countryIsoCode = countryIsoCode,state = state,city = city,pincode = pincode,sector = sector, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getGeoArea(geoareaId: String, headers: Map<String, String> = emptyMap())
    : Response<GeoAreaDetails>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getGeoArea(companyId = config.companyId ,geoareaId = geoareaId,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateGeoArea(geoareaId: String,body: GeoAreaRequestBody, headers: Map<String, String> = emptyMap())
    : Response<GeoAreaPutResponseBody>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateGeoArea(companyId = config.companyId ,geoareaId = geoareaId,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createBulkGeoArea(body: BulkGeoAreaDetails, headers: Map<String, String> = emptyMap())
    : Response<BulkGeoAreaResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createBulkGeoArea(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBulkGeoArea(geoareaId: String, headers: Map<String, String> = emptyMap())
    : Response<BulkGeoAreaGetResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getBulkGeoArea(companyId = config.companyId ,applicationId = applicationId ,geoareaId = geoareaId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateBulkGeoArea(geoareaId: String,body: BulkGeoAreaDetails, headers: Map<String, String> = emptyMap())
    : Response<BulkGeoAreaResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateBulkGeoArea(companyId = config.companyId ,applicationId = applicationId ,geoareaId = geoareaId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createGeoAreaExportJob(geoareaId: String, headers: Map<String, String> = emptyMap())
    : Response<GeoAreaBulkCreationResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createGeoAreaExportJob(companyId = config.companyId ,applicationId = applicationId ,geoareaId = geoareaId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getGeoAreaExportJobStatus(geoareaId: String, headers: Map<String, String> = emptyMap())
    : Response<GeoAreaBulkExportResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getGeoAreaExportJobStatus(companyId = config.companyId ,applicationId = applicationId ,geoareaId = geoareaId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeMopView(body: PincodeMopData, headers: Map<String, String> = emptyMap())
    : Response<PincodeMOPResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeMopView(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeBulkView(body: PincodeMopBulkData, headers: Map<String, String> = emptyMap())
    : Response<PincodeBulkViewResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeBulkView(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeCoDListing(pageNumber: Int?=null,pageSize: Int?=null,body: PincodeCodStatusListingDetails, headers: Map<String, String> = emptyMap())
    : Response<PincodeCodStatusListingResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeCoDListing(companyId = config.companyId ,applicationId = applicationId ,pageNumber = pageNumber,pageSize = pageSize, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeAuditHistory(pageNumber: Int?=null,pageSize: Int?=null,body: PincodeMopUpdateAuditHistoryDetails, headers: Map<String, String> = emptyMap())
    : Response<PincodeMopUpdateAuditHistoryResultData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeAuditHistory(companyId = config.companyId ,applicationId = applicationId ,pageNumber = pageNumber,pageSize = pageSize, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    suspend fun updateCourierRule(ruleUid: String,body: CourierPartnerRule, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerRuleResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateCourierRule(companyId = config.companyId ,applicationId = applicationId ,ruleUid = ruleUid, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerRule(ruleUid: String, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerRuleResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getCourierPartnerRule(companyId = config.companyId ,applicationId = applicationId ,ruleUid = ruleUid, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCourierPartnerRule(body: CourierPartnerRule, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerRuleResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createCourierPartnerRule(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerRules(pageNo: Int?=null,pageSize: Int?=null,status: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerRulesListResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getCourierPartnerRules(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,status = status, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartners(body: ShipmentCourierPartnerDetails, headers: Map<String, String> = emptyMap())
    : Response<ShipmentCourierPartnerResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getCourierPartners(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun updateApplicationConfiguration(body: ApplicationConfigPutDetail, headers: Map<String, String> = emptyMap())
    : Response<ApplicationConfigPut>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateApplicationConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationConfiguration( headers: Map<String, String> = emptyMap())
    : Response<ApplicationConfigGetResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getApplicationConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun patchApplicationConfiguration(body: ApplicationConfigPatch, headers: Map<String, String> = emptyMap())
    : Response<ApplicationConfigPatchResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.patchApplicationConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getApplicationConfig( headers: Map<String, String> = emptyMap())
    : Response<StoreRuleConfigData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getApplicationConfig(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun insertApplicationConfig(body: StoreRuleConfigData, headers: Map<String, String> = emptyMap())
    : Response<StoreRuleConfigData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.insertApplicationConfig(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateStoreRulesConfig(body: StoreRuleConfigData, headers: Map<String, String> = emptyMap())
    : Response<StoreRuleConfigData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateStoreRulesConfig(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getStoreRules(pageNo: Int?=null,pageSize: Int?=null,status: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetStoreRulesApiResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getStoreRules(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,status = status, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createStoreRules(body: CreateStoreRuleDetailsSchema, headers: Map<String, String> = emptyMap())
    : Response<StoreRuleResultSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createStoreRules(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getStoreRule(ruleUid: String, headers: Map<String, String> = emptyMap())
    : Response<StoreRuleDataSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getStoreRule(companyId = config.companyId ,applicationId = applicationId ,ruleUid = ruleUid, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateStoreRules(ruleUid: String,body: CreateStoreRuleDetailsSchema, headers: Map<String, String> = emptyMap())
    : Response<StoreRuleUpdateResultSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateStoreRules(companyId = config.companyId ,applicationId = applicationId ,ruleUid = ruleUid, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    suspend fun updateCourierPartnerRulePriority(body: RulePriorityDetails, headers: Map<String, String> = emptyMap())
    : Response<RulePriorityResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateCourierPartnerRulePriority(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateStoreRulePriority(body: RulePriorityDetails, headers: Map<String, String> = emptyMap())
    : Response<RulePriorityResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateStoreRulePriority(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun downloadGeoareaSampleFile( headers: Map<String, String> = emptyMap())
    : Response<ResponseBody>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.downloadGeoareaSampleFile(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createFulfillmentOption(body: FulfillmentOption, headers: Map<String, String> = emptyMap())
    : Response<FulfillmentOption>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createFulfillmentOption(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getFulfillmentOptionsList(productSlug: String?=null,storeId: Int?=null,status: String?=null, headers: Map<String, String> = emptyMap())
    : Response<FulfillmentOptionsList>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getFulfillmentOptionsList(companyId = config.companyId ,applicationId = applicationId ,productSlug = productSlug,storeId = storeId,status = status, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getFulfillmentOptions(slug: String,productId: Int?=null,storeId: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<FulfillmentOption>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getFulfillmentOptions(companyId = config.companyId ,applicationId = applicationId ,slug = slug,productId = productId,storeId = storeId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteFulfillmentOptions(slug: String, headers: Map<String, String> = emptyMap())
    : Response<OperationResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.deleteFulfillmentOptions(companyId = config.companyId ,applicationId = applicationId ,slug = slug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun putFulfillmentOption(slug: String,body: FulfillmentOption, headers: Map<String, String> = emptyMap())
    : Response<FulfillmentOption>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.putFulfillmentOption(companyId = config.companyId ,applicationId = applicationId ,slug = slug, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getFulfillmentOptionProducts(slug: String,q: String?=null,storeId: Int, headers: Map<String, String> = emptyMap())
    : Response<FulfillmentOptionProducts>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getFulfillmentOptionProducts(companyId = config.companyId ,applicationId = applicationId ,slug = slug,q = q,storeId = storeId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getFulfillmentOptionStores(slug: String,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<FulfillmentOptionStores>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getFulfillmentOptionStores(companyId = config.companyId ,applicationId = applicationId ,slug = slug,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun uploadBulkFulfillmentOptions(body: FulfillmentOptionBulk, headers: Map<String, String> = emptyMap())
    : Response<FulfillmentOptionBulkData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.uploadBulkFulfillmentOptions(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun validateBulkFulfillmentOptions(type: String,body: FulfillmentOptionBulkValidate, headers: Map<String, String> = emptyMap())
    : Response<FulfillmentOptionBulkValidateData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.validateBulkFulfillmentOptions(companyId = config.companyId ,applicationId = applicationId ,type = type, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBulkFulfillmentValidationStatus(bulkId: String, headers: Map<String, String> = emptyMap())
    : Response<FulfillmentOptionBulkValidate>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getBulkFulfillmentValidationStatus(companyId = config.companyId ,applicationId = applicationId ,bulkId = bulkId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createShipments(xOrderingSource: String?=null,body: PlatformShipmentsRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<PlatformShipmentsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createShipments(xOrderingSource = xOrderingSource,applicationId = applicationId ,companyId = config.companyId , body = body,headers = headers)
        } else {
            null
        }
    }
    
}
}