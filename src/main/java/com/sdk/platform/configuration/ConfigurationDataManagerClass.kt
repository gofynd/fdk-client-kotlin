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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun createApplication(body: CreateApplicationRequest, headers: Map<String, String> = emptyMap())
    : Response<CreateAppResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.createApplication(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getApplications(pageNo: Int?=null,pageSize: Int?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ApplicationsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getApplications(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun getCurrencies( headers: Map<String, String> = emptyMap())
    : Response<CurrenciesResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getCurrencies(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDomainAvailibility(body: DomainSuggestionsRequest, headers: Map<String, String> = emptyMap())
    : Response<DomainSuggestionsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getDomainAvailibility(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBrandsByCompany(q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<BrandsByCompanyResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getBrandsByCompany(
        companyId = config.companyId,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCompanyByBrands(pageNo: Int?=null,pageSize: Int?=null,body: CompanyByBrandsRequest, headers: Map<String, String> = emptyMap())
    : Response<CompanyByBrandsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getCompanyByBrands(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getStoreByBrands(pageNo: Int?=null,pageSize: Int?=null,body: StoreByBrandsRequest, headers: Map<String, String> = emptyMap())
    : Response<StoreByBrandsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getStoreByBrands(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOtherSellerApplications(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<OtherSellerApplications>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getOtherSellerApplications(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOtherSellerApplicationById(id: String, headers: Map<String, String> = emptyMap())
    : Response<OptedApplicationResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getOtherSellerApplicationById(
        companyId = config.companyId,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun optOutFromApplication(id: String,body: OptOutInventory, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessageResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.optOutFromApplication(
        companyId = config.companyId,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getBuildConfig(platformType: String, headers: Map<String, String> = emptyMap())
    : Response<MobileAppConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getBuildConfig(companyId = config.companyId ,applicationId = applicationId ,platformType = platformType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateBuildConfig(platformType: String,body: MobileAppConfigRequest, headers: Map<String, String> = emptyMap())
    : Response<MobileAppConfiguration>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateBuildConfig(companyId = config.companyId ,applicationId = applicationId ,platformType = platformType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPreviousVersions(platformType: String, headers: Map<String, String> = emptyMap())
    : Response<BuildVersionHistory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getPreviousVersions(companyId = config.companyId ,applicationId = applicationId ,platformType = platformType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppFeatures( headers: Map<String, String> = emptyMap())
    : Response<AppFeatureResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppFeatures(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppFeatures(body: AppFeatureRequest, headers: Map<String, String> = emptyMap())
    : Response<AppFeature>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppFeatures(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun modifyAppFeatures(body: AppFeatureRequest, headers: Map<String, String> = emptyMap())
    : Response<AppFeature>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.modifyAppFeatures(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppBasicDetails( headers: Map<String, String> = emptyMap())
    : Response<ApplicationDetail>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppBasicDetails(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppBasicDetails(body: ApplicationDetail, headers: Map<String, String> = emptyMap())
    : Response<ApplicationDetail>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppBasicDetails(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppContactInfo( headers: Map<String, String> = emptyMap())
    : Response<ApplicationInformation>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppContactInfo(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppContactInfo(body: ApplicationInformation, headers: Map<String, String> = emptyMap())
    : Response<ApplicationInformation>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppContactInfo(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppApiTokens( headers: Map<String, String> = emptyMap())
    : Response<TokenResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppApiTokens(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppApiTokens(body: TokenResponse, headers: Map<String, String> = emptyMap())
    : Response<TokenResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppApiTokens(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCompanies(uid: Int?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<CompaniesResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppCompanies(companyId = config.companyId ,applicationId = applicationId ,uid = uid,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppStores(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<StoresResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppStores(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInventoryConfig( headers: Map<String, String> = emptyMap())
    : Response<ApplicationInventory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getInventoryConfig(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateInventoryConfig(body: ApplicationInventory, headers: Map<String, String> = emptyMap())
    : Response<ApplicationInventory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateInventoryConfig(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun partiallyUpdateInventoryConfig(body: AppInventoryPartialUpdate, headers: Map<String, String> = emptyMap())
    : Response<ApplicationInventory>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.partiallyUpdateInventoryConfig(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppCurrencyConfig( headers: Map<String, String> = emptyMap())
    : Response<AppSupportedCurrency>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppCurrencyConfig(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAppCurrencyConfig(body: AppSupportedCurrency, headers: Map<String, String> = emptyMap())
    : Response<AppSupportedCurrency>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateAppCurrencyConfig(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAppSupportedCurrency( headers: Map<String, String> = emptyMap())
    : Response<AppCurrencyResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppSupportedCurrency(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOrderingStoresByFilter(pageNo: Int?=null,pageSize: Int?=null,body: FilterOrderingStoreRequest, headers: Map<String, String> = emptyMap())
    : Response<OrderingStores>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getOrderingStoresByFilter(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateOrderingStoreConfig(body: OrderingStoreConfig, headers: Map<String, String> = emptyMap())
    : Response<DeploymentMeta>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateOrderingStoreConfig(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOrderingStoreConfig( headers: Map<String, String> = emptyMap())
    : Response<OrderingStoreConfig>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getOrderingStoreConfig(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getStaffOrderingStores(pageNo: Int?=null,pageSize: Int?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<OrderingStoresResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getStaffOrderingStores(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOrderingStoreCookie(body: OrderingStoreSelectRequest, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessageResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getOrderingStoreCookie(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun removeOrderingStoreCookie( headers: Map<String, String> = emptyMap())
    : Response<SuccessMessageResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.removeOrderingStoreCookie(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDomains( headers: Map<String, String> = emptyMap())
    : Response<DomainsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getDomains(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addDomain(body: DomainAddRequest, headers: Map<String, String> = emptyMap())
    : Response<Domain>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.addDomain(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun removeDomainById(id: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessageResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.removeDomainById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun changeDomainType(body: UpdateDomainTypeRequest, headers: Map<String, String> = emptyMap())
    : Response<DomainsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.changeDomainType(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDomainStatus(body: DomainStatusRequest, headers: Map<String, String> = emptyMap())
    : Response<DomainStatusResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getDomainStatus(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getApplicationById( headers: Map<String, String> = emptyMap())
    : Response<ApplicationById>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getApplicationById(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
}
}