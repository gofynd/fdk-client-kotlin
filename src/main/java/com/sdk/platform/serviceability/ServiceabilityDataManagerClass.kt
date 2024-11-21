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
    
    
    suspend fun getZones(pageNo: Int?=null,pageSize: Int?=null,isActive: Boolean?=null,channelId: String?=null,q: String?=null,countryIsoCode: String?=null,state: String?=null,city: String?=null,pincode: String?=null,sector: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ListViewResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getZones(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,isActive = isActive,channelId = channelId,q = q,countryIsoCode = countryIsoCode,state = state,city = city,pincode = pincode,sector = sector, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createZone(body: CreateZoneData, headers: Map<String, String> = emptyMap())
    : Response<ZoneResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createZone(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateZoneById(zoneId: String,body: UpdateZoneData, headers: Map<String, String> = emptyMap())
    : Response<ZoneSuccessResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateZoneById(
        companyId = config.companyId,zoneId = zoneId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getZoneById(zoneId: String, headers: Map<String, String> = emptyMap())
    : Response<GetZoneByIdSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getZoneById(
        companyId = config.companyId,zoneId = zoneId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAllStores( headers: Map<String, String> = emptyMap())
    : Response<GetStoresViewResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getAllStores(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    suspend fun createCourierPartnerAccount(body: CourierAccountDetailsBody, headers: Map<String, String> = emptyMap())
    : Response<CourierAccount>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createCourierPartnerAccount(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerAccounts(pageNo: Int?=null,pageSize: Int?=null,stage: String?=null,paymentMode: String?=null,transportType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CompanyCourierPartnerAccountListResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCourierPartnerAccounts(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,stage = stage,paymentMode = paymentMode,transportType = transportType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCourierPartnerAccount(accountId: String,body: CourierAccountUpdateDetails, headers: Map<String, String> = emptyMap())
    : Response<CourierAccountResult>? {

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
    
    
    
    
    
    
    
    suspend fun updateCompanyConfiguration(body: CompanyConfig, headers: Map<String, String> = emptyMap())
    : Response<CompanyConfig>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateCompanyConfiguration(
        companyId = config.companyId, body = body,headers = headers)
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
    
    
    suspend fun getServiceability(extensionId: String,schemeId: String,regionId: String, headers: Map<String, String> = emptyMap())
    : Response<ServiceabilityModel>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getServiceability(
        companyId = config.companyId,extensionId = extensionId,schemeId = schemeId,regionId = regionId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateServiceability(extensionId: String,schemeId: String,regionId: String,body: ServiceabilityModel, headers: Map<String, String> = emptyMap())
    : Response<ServiceabilityModel>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateServiceability(
        companyId = config.companyId,extensionId = extensionId,schemeId = schemeId,regionId = regionId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createPackageMaterial(body: PackageMaterial, headers: Map<String, String> = emptyMap())
    : Response<PackageMaterialResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createPackageMaterial(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPackageMaterialList(pageNo: Int?=null,pageSize: Int?=null,q: String?=null,size: String?=null,packageType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PackageMaterialList>? {

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
    
    
    suspend fun getPackageMaterialRules(pageNo: Int?=null,pageSize: Int?=null,isActive: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PackageMaterialRuleList>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterialRules(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,isActive = isActive, headers = headers)
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
    
    
    suspend fun getPackageMaterialRule(ruleId: String, headers: Map<String, String> = emptyMap())
    : Response<PackageRuleResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterialRule(
        companyId = config.companyId,ruleId = ruleId, headers = headers)
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
    : Response<PackageMaterialResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterials(
        companyId = config.companyId,packageMaterialId = packageMaterialId, headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun getOptimalLocations(body: OptimlLocationsDetailsSchema, headers: Map<String, String> = emptyMap())
    : Response<OptimalLocationsResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getOptimalLocations(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
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
    
    
    
    
    
    
    suspend fun updateCourierRule(ruleId: String,body: CourierPartnerRule, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerRuleResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateCourierRule(companyId = config.companyId ,applicationId = applicationId ,ruleId = ruleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerRule(ruleId: String, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerRuleResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getCourierPartnerRule(companyId = config.companyId ,applicationId = applicationId ,ruleId = ruleId, headers = headers)
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
    
    
    
    
    suspend fun updateApplicationConfiguration(body: ApplicationConfig, headers: Map<String, String> = emptyMap())
    : Response<ApplicationConfig>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateApplicationConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationConfiguration( headers: Map<String, String> = emptyMap())
    : Response<ApplicationConfig>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getApplicationConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun patchApplicationServiceabilitySelfShipment(body: SelfShipResult, headers: Map<String, String> = emptyMap())
    : Response<ApplicationSelfShipConfigResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.patchApplicationServiceabilitySelfShipment(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationServiceabilitySelfShipment( headers: Map<String, String> = emptyMap())
    : Response<ApplicationSelfShipConfigResult>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getApplicationServiceabilitySelfShipment(companyId = config.companyId ,applicationId = applicationId , headers = headers)
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
    
    
}
}