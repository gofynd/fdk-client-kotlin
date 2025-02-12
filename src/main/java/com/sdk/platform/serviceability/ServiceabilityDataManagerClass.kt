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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun updateCompanySelfShip(body: CompanySelfShip, headers: Map<String, String> = emptyMap())
    : Response<CompanySelfShip>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateCompanySelfShip(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCompanySelfShip( headers: Map<String, String> = emptyMap())
    : Response<CompanySelfShip>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCompanySelfShip(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCourierPartnerAccount(body: CourierAccount, headers: Map<String, String> = emptyMap())
    : Response<CourierAccount>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createCourierPartnerAccount(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerAccounts(pageNo: Int?=null,pageSize: Int?=null,stage: String?=null,paymentMode: String?=null,transportType: String?=null,accountIds: ArrayList<String>?=null,selfShip: Boolean?=null,ownAccount: Boolean?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CompanyCourierPartnerAccountListResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCourierPartnerAccounts(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,stage = stage,paymentMode = paymentMode,transportType = transportType,accountIds = accountIds,selfShip = selfShip,ownAccount = ownAccount,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCourierPartnerAccount(accountId: String,body: CourierAccount, headers: Map<String, String> = emptyMap())
    : Response<CourierAccount>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateCourierPartnerAccount(
        companyId = config.companyId,accountId = accountId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerAccount(accountId: String, headers: Map<String, String> = emptyMap())
    : Response<CourierAccountResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCourierPartnerAccount(
        companyId = config.companyId,accountId = accountId, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    suspend fun updateCompanyConfiguration(body: CompanyConfigurationShema, headers: Map<String, String> = emptyMap())
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun createPackageMaterial(pageNo: Int?=null,body: PackageMaterial, headers: Map<String, String> = emptyMap())
    : Response<PackageMaterialResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createPackageMaterial(
        companyId = config.companyId,pageNo = pageNo, body = body,headers = headers)
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
    
    
    suspend fun createPackageMaterialRule(body: PackageRuleRequest, headers: Map<String, String> = emptyMap())
    : Response<PackageRuleResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.createPackageMaterialRule(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPackageMaterialRuleDetails(ruleId: String,pageNo: Int?=null,pageSize: Int?=null,isActive: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PackageRuleResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterialRuleDetails(
        companyId = config.companyId,ruleId = ruleId,pageNo = pageNo,pageSize = pageSize,isActive = isActive, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getListPackageMaterialRuleDetails(pageNo: Int?=null,pageSize: Int?=null,isActive: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PackageMaterialRuleList>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getListPackageMaterialRuleDetails(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,isActive = isActive, headers = headers)
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
    
    
    suspend fun updatePackageMaterialRule(ruleId: String,body: PackageRuleRequest, headers: Map<String, String> = emptyMap())
    : Response<PackageRuleResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updatePackageMaterialRule(
        companyId = config.companyId,ruleId = ruleId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePackageMaterials(packageMaterialId: String,body: PackageMaterial, headers: Map<String, String> = emptyMap())
    : Response<PackageMaterialResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updatePackageMaterials(
        companyId = config.companyId,packageMaterialId = packageMaterialId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPackageMaterials(packageMaterialId: String, headers: Map<String, String> = emptyMap())
    : Response<PackageMaterialResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getPackageMaterials(
        companyId = config.companyId,packageMaterialId = packageMaterialId, headers = headers)
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
    
    
    suspend fun getLocality(localityType: String,localityValue: String,country: String?=null,state: String?=null,city: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetLocality>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getLocality(
        companyId = config.companyId,localityType = localityType,localityValue = localityValue,country = country,state = state,city = city, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getLocalities(localityType: String,country: String?=null,state: String?=null,city: String?=null,pageNo: Int?=null,pageSize: Int?=null,q: String?=null,name: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetLocalities>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getLocalities(
        companyId = config.companyId,localityType = localityType,country = country,state = state,city = city,pageNo = pageNo,pageSize = pageSize,q = q,name = name, headers = headers)
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
    
    suspend fun getCountry(countryIsoCode: String, headers: Map<String, String> = emptyMap())
    : Response<GetCountry>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCountry(
        companyId = config.companyId,countryIsoCode = countryIsoCode, headers = headers)
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
    
    
    suspend fun validateAddress(countryIsoCode: String,templateName: String,body: ValidateAddressRequest, headers: Map<String, String> = emptyMap())
    : Response<ValidateAddressRequest>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.validateAddress(
        companyId = config.companyId,countryIsoCode = countryIsoCode,templateName = templateName, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOptimalLocations(body: OptimlLocationsRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<OptimalLocationsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getOptimalLocations(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun createZone(body: CreateZoneV2Data, headers: Map<String, String> = emptyMap())
    : Response<ZoneResponseV2>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createZone(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getZones(stage: String?=null,type: String?=null,pageSize: Int?=null,pageNo: Int?=null,isActive: Boolean?=null,q: String?=null,countryIsoCode: String?=null,pincode: String?=null,state: String?=null,city: String?=null,sector: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ListViewResponseV2>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getZones(companyId = config.companyId ,applicationId = applicationId ,stage = stage,type = type,pageSize = pageSize,pageNo = pageNo,isActive = isActive,q = q,countryIsoCode = countryIsoCode,pincode = pincode,state = state,city = city,sector = sector, headers = headers)
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
    
    
    suspend fun updateZone(zoneId: String,body: UpdateZoneDataV2, headers: Map<String, String> = emptyMap())
    : Response<ZoneUpdateSuccessResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateZone(companyId = config.companyId ,zoneId = zoneId,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteZone(zoneId: String, headers: Map<String, String> = emptyMap())
    : Response<ZoneDeleteSuccessResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.deleteZone(companyId = config.companyId ,zoneId = zoneId,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getZoneDetails(zoneId: String, headers: Map<String, String> = emptyMap())
    : Response<GetZoneByIdDetailsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getZoneDetails(companyId = config.companyId ,zoneId = zoneId,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createBulkZone(body: CreateBulkZoneData, headers: Map<String, String> = emptyMap())
    : Response<CreateBulkZoneResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createBulkZone(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBulkZone( headers: Map<String, String> = emptyMap())
    : Response<GetBulkZoneHistory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getBulkZone(companyId = config.companyId ,applicationId = applicationId , headers = headers)
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
    
    
    suspend fun updatePincodeMopView(body: PincodeMopData, headers: Map<String, String> = emptyMap())
    : Response<PincodeMOPresponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeMopView(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeBulkView(body: PincodeMopBulkData, headers: Map<String, String> = emptyMap())
    : Response<PincodeBulkViewResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeBulkView(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeCoDListing(body: PincodeCodStatusListingRequest, headers: Map<String, String> = emptyMap())
    : Response<PincodeCodStatusListingResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeCoDListing(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeAuditHistory(body: PincodeMopUpdateAuditHistoryRequest, headers: Map<String, String> = emptyMap())
    : Response<PincodeMopUpdateAuditHistoryResponseData>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updatePincodeAuditHistory(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
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
    : Response<GeoAreaResponse>? {
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
    : Response<BulkGeoAreaGetResponse>? {
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
    
    
    
    
    
    
    
    
    suspend fun createCourierPartnerRule(body: CourierPartnerRule, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerRuleResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createCourierPartnerRule(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerRules(pageNo: Int?=null,pageSize: Int?=null,status: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerRulesListResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getCourierPartnerRules(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,status = status, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCourierRule(ruleUid: String,body: CourierPartnerRule, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerRuleResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateCourierRule(companyId = config.companyId ,applicationId = applicationId ,ruleUid = ruleUid, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCourierPartnerRule(ruleUid: String, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerRuleResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getCourierPartnerRule(companyId = config.companyId ,applicationId = applicationId ,ruleUid = ruleUid, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun updateApplicationConfiguration(body: ApplicationConfigPutRequest, headers: Map<String, String> = emptyMap())
    : Response<ApplicationConfigPutResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateApplicationConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationConfiguration( headers: Map<String, String> = emptyMap())
    : Response<ApplicationConfigGetResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getApplicationConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun patchApplicationConfiguration(body: ApplicationConfigPatchRequest, headers: Map<String, String> = emptyMap())
    : Response<ApplicationConfigPatchResponse>? {
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
    : Response<GetStoreRulesApiResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getStoreRules(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,status = status, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createStoreRules(body: CreateStoreRuleRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<StoreRuleResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.createStoreRules(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateStoreRulePriority(body: RulePriorityRequest, headers: Map<String, String> = emptyMap())
    : Response<RulePriorityResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateStoreRulePriority(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
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
    
    
    suspend fun updateStoreRules(ruleUid: String,body: CreateStoreRuleRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<StoreRuleUpdateResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateStoreRules(companyId = config.companyId ,applicationId = applicationId ,ruleUid = ruleUid, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    suspend fun updateCourierPartnerRulePriority(body: RulePriorityRequest, headers: Map<String, String> = emptyMap())
    : Response<RulePriorityResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.updateCourierPartnerRulePriority(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    suspend fun getCourierPartnerRuleDetails(ruleUid: String, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerRuleResponseDetailSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getCourierPartnerRuleDetails(companyId = config.companyId ,applicationId = applicationId ,ruleUid = ruleUid, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getStoreRuleDetails(ruleUid: String, headers: Map<String, String> = emptyMap())
    : Response<StoreRuleDataDetailsSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getStoreRuleDetails(companyId = config.companyId ,applicationId = applicationId ,ruleUid = ruleUid, headers = headers)
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
    
    
    suspend fun downloadZoneSampleFile(productType: String, headers: Map<String, String> = emptyMap())
    : Response<ResponseBody>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.downloadZoneSampleFile(companyId = config.companyId ,applicationId = applicationId ,productType = productType, headers = headers)
        } else {
            null
        }
    }
    
}
}