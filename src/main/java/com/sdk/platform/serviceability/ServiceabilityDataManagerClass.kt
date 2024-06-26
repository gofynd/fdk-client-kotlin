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
    
    
    suspend fun getZones(pageNo: Int?=null, pageSize: Int?=null, isActive: Boolean?=null, channelId: String?=null, q: String?=null, countryIsoCode: String?=null, state: String?=null, city: String?=null, pincode: String?=null, sector: String?=null)
    : Response<ListViewResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getZones(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, isActive = isActive, channelId = channelId, q = q, countryIsoCode = countryIsoCode, state = state, city = city, pincode = pincode, sector = sector )
        } else {
            null
        } 
    }
    
    
    suspend fun createZone(body: CreateZoneData)
    : Response<ZoneResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createZone(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateZoneById(zoneId: String,body: UpdateZoneData)
    : Response<ZoneSuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateZoneById(
        companyId = config.companyId, zoneId = zoneId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getZoneById(zoneId: String)
    : Response<GetZoneByIdSchema>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getZoneById(
        companyId = config.companyId, zoneId = zoneId )
        } else {
            null
        } 
    }
    
    
    suspend fun getAllStores()
    : Response<GetStoresViewResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getAllStores(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    suspend fun createCourierPartnerAccount(body: CourierAccountRequestBody)
    : Response<CourierAccount>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createCourierPartnerAccount(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCourierPartnerAccounts(pageNo: Int?=null, pageSize: Int?=null, stage: String?=null, paymentMode: String?=null, transportType: String?=null)
    : Response<CompanyCourierPartnerAccountListResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCourierPartnerAccounts(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, stage = stage, paymentMode = paymentMode, transportType = transportType )
        } else {
            null
        } 
    }
    
    
    suspend fun updateCourierPartnerAccount(accountId: String,body: CourierAccount)
    : Response<CourierAccountResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateCourierPartnerAccount(
        companyId = config.companyId, accountId = accountId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCourierPartnerAccount(accountId: String)
    : Response<CourierAccountResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCourierPartnerAccount(
        companyId = config.companyId, accountId = accountId )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    suspend fun updateCompanyConfiguration(body: CompanyConfig)
    : Response<CompanyConfig>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateCompanyConfiguration(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyConfiguration()
    : Response<CompanyConfig>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCompanyConfiguration(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun bulkTat(extensionId: String, schemeId: String,body: BulkRegionJobSerializer)
    : Response<BulkRegionResponseItemData>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.bulkTat(
        companyId = config.companyId, extensionId = extensionId, schemeId = schemeId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkTat(extensionId: String, schemeId: String, pageNo: Int?=null, pageSize: Int?=null, batchId: String?=null, action: String?=null, status: String?=null, country: String?=null, region: String?=null, startDate: String?=null, endDate: String?=null)
    : Response<BulkRegionResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getBulkTat(
        companyId = config.companyId, extensionId = extensionId, schemeId = schemeId, pageNo = pageNo, pageSize = pageSize, batchId = batchId, action = action, status = status, country = country, region = region, startDate = startDate, endDate = endDate )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    suspend fun bulkServiceability(extensionId: String, schemeId: String,body: BulkRegionJobSerializer)
    : Response<BulkRegionResponseItemData>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.bulkServiceability(
        companyId = config.companyId, extensionId = extensionId, schemeId = schemeId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkServiceability(extensionId: String, schemeId: String, pageNo: Int?=null, pageSize: Int?=null, batchId: String?=null, action: String?=null, status: String?=null, country: String?=null, region: String?=null, startDate: String?=null, endDate: String?=null)
    : Response<BulkRegionResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getBulkServiceability(
        companyId = config.companyId, extensionId = extensionId, schemeId = schemeId, pageNo = pageNo, pageSize = pageSize, batchId = batchId, action = action, status = status, country = country, region = region, startDate = startDate, endDate = endDate )
        } else {
            null
        } 
    }
    
    
    suspend fun getServiceability(extensionId: String, schemeId: String, regionId: String)
    : Response<ServiceabilityModel>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getServiceability(
        companyId = config.companyId, extensionId = extensionId, schemeId = schemeId, regionId = regionId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateServiceability(extensionId: String, schemeId: String, regionId: String,body: ServiceabilityModel)
    : Response<ServiceabilityModel>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateServiceability(
        companyId = config.companyId, extensionId = extensionId, schemeId = schemeId, regionId = regionId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createPackageMaterial(body: PackageMaterial)
    : Response<PackageMaterialResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createPackageMaterial(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getPackageMaterialList(pageNo: Int?=null, pageSize: Int?=null, q: String?=null, size: String?=null, packageType: String?=null)
    : Response<PackageMaterialList>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterialList(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, q = q, size = size, packageType = packageType )
        } else {
            null
        } 
    }
    
    
    suspend fun createPackageMaterialRule(body: PackageRule)
    : Response<PackageRuleResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createPackageMaterialRule(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getPackageMaterialRules(pageNo: Int?=null, pageSize: Int?=null, isActive: String?=null)
    : Response<PackageMaterialRuleList>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterialRules(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, isActive = isActive )
        } else {
            null
        } 
    }
    
    
    suspend fun updatePackageMaterialRule(ruleId: String,body: PackageRule)
    : Response<PackageRuleResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updatePackageMaterialRule(
        companyId = config.companyId, ruleId = ruleId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getPackageMaterialRule(ruleId: String)
    : Response<PackageRuleResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterialRule(
        companyId = config.companyId, ruleId = ruleId )
        } else {
            null
        } 
    }
    
    
    suspend fun updatePackageMaterials(packageMaterialId: String,body: PackageMaterial)
    : Response<PackageMaterialResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updatePackageMaterials(
        companyId = config.companyId, packageMaterialId = packageMaterialId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getPackageMaterials(packageMaterialId: String)
    : Response<PackageMaterialResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterials(
        companyId = config.companyId, packageMaterialId = packageMaterialId )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getOptimalLocations(body: OptimlLocationsRequestSchema)
    : Response<OptimalLocationsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getOptimalLocations(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    suspend fun updatePincodeMopView(body: PincodeMopData)
    : Response<PincodeMOPresponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeMopView(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeBulkView(body: PincodeMopBulkData)
    : Response<PincodeBulkViewResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeBulkView(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeCoDListing(body: PincodeCodStatusListingRequest)
    : Response<PincodeCodStatusListingResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeCoDListing(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeAuditHistory(body: PincodeMopUpdateAuditHistoryRequest)
    : Response<PincodeMopUpdateAuditHistoryResponseData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeAuditHistory(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    
    
    
    suspend fun updateCourierRule(ruleId: String,body: CourierPartnerRule)
    : Response<CourierPartnerRule>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateCourierRule(companyId = config.companyId , applicationId = applicationId , ruleId = ruleId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerRule(ruleId: String)
    : Response<CourierPartnerRule>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getCourierPartnerRule(companyId = config.companyId , applicationId = applicationId , ruleId = ruleId )
        } else {
            null
        }
    }
    
    
    suspend fun createCourierPartnerRule(body: CourierPartnerRule)
    : Response<CourierPartnerRule>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createCourierPartnerRule(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerRules(pageNo: Int?=null, pageSize: Int?=null, status: String?=null)
    : Response<CourierPartnerRulesListResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getCourierPartnerRules(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, status = status )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun updateApplicationConfiguration(body: ApplicationConfig)
    : Response<ApplicationConfig>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateApplicationConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationConfiguration()
    : Response<ApplicationConfig>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getApplicationConfiguration(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun patchApplicationServiceabilitySelfShipment(body: SelfShipResponse)
    : Response<ApplicationSelfShipConfigResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.patchApplicationServiceabilitySelfShipment(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationServiceabilitySelfShipment()
    : Response<ApplicationSelfShipConfigResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getApplicationServiceabilitySelfShipment(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationConfig()
    : Response<StoreRuleConfigData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getApplicationConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun insertApplicationConfig(body: StoreRuleConfigData)
    : Response<StoreRuleConfigData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.insertApplicationConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateStoreRulesConfig(body: StoreRuleConfigData)
    : Response<StoreRuleConfigData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateStoreRulesConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getStoreRules(pageNo: Int?=null, pageSize: Int?=null, status: String?=null)
    : Response<GetStoreRulesApiResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getStoreRules(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, status = status )
        } else {
            null
        }
    }
    
    
    suspend fun createStoreRules(body: CreateStoreRuleRequestSchema)
    : Response<StoreRuleResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createStoreRules(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getStoreRule(ruleUid: String)
    : Response<StoreRuleDataSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getStoreRule(companyId = config.companyId , applicationId = applicationId , ruleUid = ruleUid )
        } else {
            null
        }
    }
    
    
    suspend fun updateStoreRules(ruleUid: String,body: CreateStoreRuleRequestSchema)
    : Response<StoreRuleUpdateResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateStoreRules(companyId = config.companyId , applicationId = applicationId , ruleUid = ruleUid, body = body)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun updateCourierPartnerRulePriority(body: RulePriorityRequest)
    : Response<RulePriorityResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateCourierPartnerRulePriority(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
}
}