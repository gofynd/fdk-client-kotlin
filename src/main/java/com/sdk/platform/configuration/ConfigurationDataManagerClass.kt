package com.sdk.platform.configuration

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class ConfigurationDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val configurationApiList by lazy {
        generateconfigurationApiList()
    }
    
    private fun generateconfigurationApiList(): ConfigurationApiList? {
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
            namespace = "PlatformConfiguration",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(ConfigurationApiList::class.java) as? ConfigurationApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun createApplication(body: CreateApplicationRequest)
    : Response<CreateAppResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.createApplication(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getApplications(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Response<ApplicationsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getApplications(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getCurrencies()
    : Response<CurrenciesResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getCurrencies(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getDomainAvailibility(body: DomainSuggestionsRequest)
    : Response<DomainSuggestionsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getDomainAvailibility(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getIntegrationById(id: String)
    : Response<Integration>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getIntegrationById(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun getAvailableOptIns(pageNo: Int?=null, pageSize: Int?=null)
    : Response<GetIntegrationsOptInsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getAvailableOptIns(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getSelectedOptIns(level: String, uid: String, pageNo: Int?=null, pageSize: Int?=null)
    : Response<GetIntegrationsOptInsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getSelectedOptIns(
        companyId = config.companyId, level = level, uid = uid, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getIntegrationLevelConfig(id: String, level: String, opted: Boolean?=null, checkPermission: Boolean?=null)
    : Response<IntegrationConfigResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getIntegrationLevelConfig(
        companyId = config.companyId, id = id, level = level, opted = opted, checkPermission = checkPermission )
        } else {
            null
        } 
    }
    
    
    suspend fun updateLevelIntegration(id: String, level: String,body: UpdateIntegrationLevelRequest)
    : Response<IntegrationLevel>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.updateLevelIntegration(
        companyId = config.companyId, id = id, level = level, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getIntegrationByLevelId(id: String, level: String, uid: String)
    : Response<IntegrationLevel>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getIntegrationByLevelId(
        companyId = config.companyId, id = id, level = level, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun updateLevelUidIntegration(id: String, level: String, uid: String,body: IntegrationLevel)
    : Response<IntegrationLevel>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.updateLevelUidIntegration(
        companyId = config.companyId, id = id, level = level, uid = uid, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getLevelActiveIntegrations(id: String, level: String, uid: String)
    : Response<OptedStoreIntegration>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getLevelActiveIntegrations(
        companyId = config.companyId, id = id, level = level, uid = uid )
        } else {
            null
        } 
    }
    
    
    suspend fun getBrandsByCompany(q: String?=null)
    : Response<BrandsByCompanyResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getBrandsByCompany(
        companyId = config.companyId, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyByBrands(pageNo: Int?=null, pageSize: Int?=null,body: CompanyByBrandsRequest)
    : Response<CompanyByBrandsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getCompanyByBrands(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getStoreByBrands(pageNo: Int?=null, pageSize: Int?=null,body: StoreByBrandsRequest)
    : Response<StoreByBrandsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getStoreByBrands(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getOtherSellerApplications(pageNo: Int?=null, pageSize: Int?=null)
    : Response<OtherSellerApplications>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getOtherSellerApplications(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getOtherSellerApplicationById(id: String)
    : Response<OptedApplicationResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getOtherSellerApplicationById(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun optOutFromApplication(id: String,body: OptOutInventory)
    : Response<SuccessMessageResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.optOutFromApplication(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getBuildConfig(platformType: String)
    : Response<MobileAppConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getBuildConfig(companyId = config.companyId , applicationId = applicationId , platformType = platformType )
        } else {
            null
        }
    }
    
    
    suspend fun updateBuildConfig(platformType: String,body: MobileAppConfigRequest)
    : Response<MobileAppConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateBuildConfig(companyId = config.companyId , applicationId = applicationId , platformType = platformType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPreviousVersions(platformType: String)
    : Response<BuildVersionHistory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getPreviousVersions(companyId = config.companyId , applicationId = applicationId , platformType = platformType )
        } else {
            null
        }
    }
    
    
    suspend fun getAppFeatures()
    : Response<AppFeatureResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppFeatures(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppFeatures(body: AppFeatureRequest)
    : Response<AppFeature>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppFeatures(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun modifyAppFeatures(body: AppFeatureRequest)
    : Response<AppFeature>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.modifyAppFeatures(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppBasicDetails()
    : Response<ApplicationDetail>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppBasicDetails(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppBasicDetails(body: ApplicationDetail)
    : Response<ApplicationDetail>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppBasicDetails(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppContactInfo()
    : Response<ApplicationInformation>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppContactInfo(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppContactInfo(body: ApplicationInformation)
    : Response<ApplicationInformation>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppContactInfo(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppApiTokens()
    : Response<TokenResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppApiTokens(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppApiTokens(body: TokenResponse)
    : Response<TokenResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppApiTokens(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCompanies(uid: Int?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<CompaniesResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppCompanies(companyId = config.companyId , applicationId = applicationId , uid = uid, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun getAppStores(pageNo: Int?=null, pageSize: Int?=null)
    : Response<StoresResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppStores(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun getInventoryConfig()
    : Response<ApplicationInventory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getInventoryConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateInventoryConfig(body: ApplicationInventory)
    : Response<ApplicationInventory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateInventoryConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun partiallyUpdateInventoryConfig(body: AppInventoryPartialUpdate)
    : Response<ApplicationInventory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.partiallyUpdateInventoryConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCurrencyConfig()
    : Response<AppSupportedCurrency>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppCurrencyConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCurrencyConfig(body: AppSupportedCurrency)
    : Response<AppSupportedCurrency>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppCurrencyConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppSupportedCurrency()
    : Response<AppCurrencyResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppSupportedCurrency(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getOrderingStoresByFilter(pageNo: Int?=null, pageSize: Int?=null,body: FilterOrderingStoreRequest)
    : Response<OrderingStores>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getOrderingStoresByFilter(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateOrderingStoreConfig(body: OrderingStoreConfig)
    : Response<DeploymentMeta>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateOrderingStoreConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getOrderingStoreConfig()
    : Response<OrderingStoreConfig>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getOrderingStoreConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getStaffOrderingStores(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Response<OrderingStoresResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getStaffOrderingStores(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        }
    }
    
    
    suspend fun getOrderingStoreCookie(body: OrderingStoreSelectRequest)
    : Response<SuccessMessageResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getOrderingStoreCookie(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun removeOrderingStoreCookie()
    : Response<SuccessMessageResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.removeOrderingStoreCookie(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getDomains()
    : Response<DomainsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getDomains(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun addDomain(body: DomainAddRequest)
    : Response<Domain>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.addDomain(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun removeDomainById(id: String)
    : Response<SuccessMessageResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.removeDomainById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun changeDomainType(body: UpdateDomainTypeRequest)
    : Response<DomainsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.changeDomainType(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getDomainStatus(body: DomainStatusRequest)
    : Response<DomainStatusResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getDomainStatus(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getApplicationById()
    : Response<ApplicationById>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getApplicationById(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}