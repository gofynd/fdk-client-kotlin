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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun updateCompanySelfShip(body: CompanySelfShip)
    : Response<CompanySelfShip>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateCompanySelfShip(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanySelfShip()
    : Response<CompanySelfShip>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCompanySelfShip(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun createCourierPartnerAccount(body: CourierAccount)
    : Response<CourierAccount>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createCourierPartnerAccount(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCourierPartnerAccounts(pageNo: Int?=null, pageSize: Int?=null, stage: String?=null, paymentMode: String?=null, transportType: String?=null, accountIds: ArrayList<String>?=null)
    : Response<CompanyCourierPartnerAccountListResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCourierPartnerAccounts(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, stage = stage, paymentMode = paymentMode, transportType = transportType, accountIds = accountIds )
        } else {
            null
        } 
    }
    
    
    suspend fun updateCourierPartnerAccount(accountId: String,body: CourierAccount)
    : Response<CourierAccount>? {
        
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
    
    
    
    
    
    
    suspend fun updateCompanyConfiguration(body: CompanyConfigurationShema)
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun createPackageMaterial(pageNo: Int,body: PackageMaterial)
    : Response<PackageMaterialResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createPackageMaterial(
        companyId = config.companyId, pageNo = pageNo, body = body)
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
    
    
    suspend fun createPackageMaterialRule(body: PackageRuleRequest)
    : Response<PackageRuleResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createPackageMaterialRule(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getPackageMaterialRuleDetails(ruleId: String, pageNo: Int?=null, pageSize: Int?=null, isActive: String?=null)
    : Response<PackageMaterialRule>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterialRuleDetails(
        companyId = config.companyId, ruleId = ruleId, pageNo = pageNo, pageSize = pageSize, isActive = isActive )
        } else {
            null
        } 
    }
    
    
    suspend fun getListPackageMaterialRuleDetails(pageNo: Int?=null, pageSize: Int?=null, isActive: String?=null)
    : Response<PackageMaterialRuleList>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getListPackageMaterialRuleDetails(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, isActive = isActive )
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
    
    
    suspend fun updatePackageMaterialRule(ruleId: String,body: PackageRuleRequest)
    : Response<PackageRuleResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updatePackageMaterialRule(
        companyId = config.companyId, ruleId = ruleId, body = body)
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
    
    
    
    suspend fun getInstalledCourierPartnerExtensions(pageNo: Int?=null, pageSize: Int?=null, isInstalled: String?=null)
    : Response<InstallCourierPartnerResponseSchema>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getInstalledCourierPartnerExtensions(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, isInstalled = isInstalled )
        } else {
            null
        } 
    }
    
    
    suspend fun getLocality(localityType: String, localityValue: String, country: String?=null, state: String?=null, city: String?=null)
    : Response<GetLocality>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getLocality(
        companyId = config.companyId, localityType = localityType, localityValue = localityValue, country = country, state = state, city = city )
        } else {
            null
        } 
    }
    
    
    suspend fun getLocalities(localityType: String, country: String?=null, state: String?=null, city: String?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, name: String?=null)
    : Response<GetLocalities>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getLocalities(
        companyId = config.companyId, localityType = localityType, country = country, state = state, city = city, pageNo = pageNo, pageSize = pageSize, q = q, name = name )
        } else {
            null
        } 
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getLocalities
    **/
    fun getLocalitiesPaginator(companyId: String, localityType: String, country: String?=null, state: String?=null, city: String?=null, pageSize: Int?=null, q: String?=null, name: String?=null) : Paginator<GetLocalities>{
        val paginator = Paginator<GetLocalities>()
        paginator.setCallBack(object : PaginatorCallback<GetLocalities> {
           
            override suspend fun onNext(
                onResponse: (Event<GetLocalities>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    serviceabilityApiList?.getLocalities(
                    companyId = config.companyId, localityType = localityType, country = country, state = state, city = city, pageNo = pageNo, pageSize = pageSize, q = q, name = name
                    )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        

    })
        return paginator
    }
    
    suspend fun getCountry(countryIsoCode: String)
    : Response<GetCountry>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCountry(
        companyId = config.companyId, countryIsoCode = countryIsoCode )
        } else {
            null
        } 
    }
    
    
    suspend fun getCountries(onboard: Boolean?=null, pageNo: Int?=null, pageSize: Int?=null, q: String?=null, hierarchy: String?=null)
    : Response<GetCountries>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCountries(
        companyId = config.companyId, onboard = onboard, pageNo = pageNo, pageSize = pageSize, q = q, hierarchy = hierarchy )
        } else {
            null
        } 
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCountries
    **/
    fun getCountriesPaginator(companyId: String, onboard: Boolean?=null, pageSize: Int?=null, q: String?=null, hierarchy: String?=null) : Paginator<GetCountries>{
        val paginator = Paginator<GetCountries>()
        paginator.setCallBack(object : PaginatorCallback<GetCountries> {
           
            override suspend fun onNext(
                onResponse: (Event<GetCountries>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    serviceabilityApiList?.getCountries(
                    companyId = config.companyId, onboard = onboard, pageNo = pageNo, pageSize = pageSize, q = q, hierarchy = hierarchy
                    )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        

    })
        return paginator
    }
    
    suspend fun validateAddress(countryIsoCode: String, templateName: String,body: ValidateAddressRequest)
    : Response<ValidateAddressRequest>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.validateAddress(
        companyId = config.companyId, countryIsoCode = countryIsoCode, templateName = templateName, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun createZone(body: CreateZoneV2Data)
    : Response<ZoneResponseV2>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createZone(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getZones(stage: String?=null, pageSize: Int?=null, isActive: Boolean?=null, q: String?=null, countryIsoCode: String?=null, pincode: String?=null, state: String?=null, city: String?=null, sector: String?=null)
    : Response<ListViewResponseV2>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getZones(companyId = config.companyId , applicationId = applicationId , stage = stage, pageSize = pageSize, isActive = isActive, q = q, countryIsoCode = countryIsoCode, pincode = pincode, state = state, city = city, sector = sector )
        } else {
            null
        }
    }
    
    
    suspend fun getZone(zoneId: String)
    : Response<GetZoneByIdSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getZone(companyId = config.companyId , zoneId = zoneId, applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateZone(zoneId: String,body: UpdateZoneDataV2)
    : Response<ZoneUpdateSuccessResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateZone(companyId = config.companyId , zoneId = zoneId, applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteZone(zoneId: String)
    : Response<ZoneDeleteSuccessResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.deleteZone(companyId = config.companyId , zoneId = zoneId, applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createBulkZone(body: CreateBulkZoneData)
    : Response<CreateBulkZoneResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createBulkZone(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getBulkZone()
    : Response<GetBulkZoneHistory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getBulkZone(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createBulkExport(body: BulkCreateZoneExport)
    : Response<ZoneBulkExport>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createBulkExport(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getBulkExport(batchId: String)
    : Response<GetZoneBulkExport>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getBulkExport(companyId = config.companyId , applicationId = applicationId , batchId = batchId )
        } else {
            null
        }
    }
    
    
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
    
    
    suspend fun createGeoArea(body: GeoAreaRequestBody)
    : Response<GeoAreaResponseBody>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createGeoArea(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getGeoAreas(pageSize: Int?=null, isActive: Boolean?=null, q: String?=null, countryIsoCode: String?=null, state: String?=null, city: String?=null, pincode: String?=null, sector: String?=null)
    : Response<GeoAreaGetResponseBody>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getGeoAreas(applicationId = applicationId , companyId = config.companyId , pageSize = pageSize, isActive = isActive, q = q, countryIsoCode = countryIsoCode, state = state, city = city, pincode = pincode, sector = sector )
        } else {
            null
        }
    }
    
    
    suspend fun getGeoArea(geoareaId: String)
    : Response<GeoAreaResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getGeoArea(companyId = config.companyId , geoareaId = geoareaId, applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateGeoArea(geoareaId: String,body: GeoAreaRequestBody)
    : Response<GeoAreaPutResponseBody>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateGeoArea(companyId = config.companyId , geoareaId = geoareaId, applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun createBulkGeoArea(body: BulkGeoAreaRequestBody)
    : Response<BulkGeoAreaResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createBulkGeoArea(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getBulkGeoArea(geoareaId: String)
    : Response<BulkGeoAreaGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getBulkGeoArea(companyId = config.companyId , applicationId = applicationId , geoareaId = geoareaId )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    suspend fun createCourierPartnerRule(body: CourierPartnerRule)
    : Response<CourierPartnerRuleResponseSchema>? {
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
    
    
    suspend fun updateCourierRule(ruleUid: String,body: CourierPartnerRule)
    : Response<CourierPartnerRuleResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateCourierRule(companyId = config.companyId , applicationId = applicationId , ruleUid = ruleUid, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerRule(ruleUid: String)
    : Response<CourierPartnerRuleResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getCourierPartnerRule(companyId = config.companyId , applicationId = applicationId , ruleUid = ruleUid )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun updateApplicationConfiguration(body: ApplicationConfigPutRequest)
    : Response<ApplicationConfigPutResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateApplicationConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationConfiguration()
    : Response<ApplicationConfigGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getApplicationConfiguration(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun patchApplicationConfiguration(body: ApplicationConfigPatchRequest)
    : Response<ApplicationConfigPatchResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.patchApplicationConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
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
    
    
    suspend fun updateStoreRulePriority(body: RulePriorityRequest)
    : Response<RulePriorityResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateStoreRulePriority(companyId = config.companyId , applicationId = applicationId , body = body)
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