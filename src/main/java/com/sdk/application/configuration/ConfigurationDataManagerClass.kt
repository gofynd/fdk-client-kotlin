package com.sdk.application.configuration

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class ConfigurationDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val configurationApiList by lazy {
        generateconfigurationApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getApplication"] = "/service/application/configuration/v1.0/application".substring(1)
            
                    _relativeUrls["getOwnerInfo"] = "/service/application/configuration/v1.0/about".substring(1)
            
                    _relativeUrls["getBasicDetails"] = "/service/application/configuration/v1.0/detail".substring(1)
            
                    _relativeUrls["getIntegrationTokens"] = "/service/application/configuration/v1.0/token".substring(1)
            
                    _relativeUrls["getOrderingStores"] = "/service/application/configuration/v1.0/ordering-store/stores".substring(1)
            
                    _relativeUrls["getStoreDetailById"] = "/service/application/configuration/v1.0/ordering-store/stores/{store_id}".substring(1)
            
                    _relativeUrls["getFeatures"] = "/service/application/configuration/v1.0/feature".substring(1)
            
                    _relativeUrls["getContactInfo"] = "/service/application/configuration/v1.0/information".substring(1)
            
                    _relativeUrls["getCurrencies"] = "/service/application/configuration/v1.0/currencies".substring(1)
            
                    _relativeUrls["getCurrencyById"] = "/service/application/configuration/v1.0/currency/{id}".substring(1)
            
                    _relativeUrls["getAppCurrencies"] = "/service/application/configuration/v1.0/currency".substring(1)
            
                    _relativeUrls["getLanguages"] = "/service/application/configuration/v1.0/languages".substring(1)
            
                    _relativeUrls["getOrderingStoreCookie"] = "/service/application/configuration/v1.0/ordering-store/select".substring(1)
            
                    _relativeUrls["removeOrderingStoreCookie"] = "/service/application/configuration/v1.0/ordering-store/select".substring(1)
            
                    _relativeUrls["getAppStaffList"] = "/service/application/configuration/v1.0/staff/list".substring(1)
            
                    _relativeUrls["getAppStaffs"] = "/service/application/configuration/v1.0/staff".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generateconfigurationApiList(): ConfigurationApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
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
            namespace = "ApplicationConfiguration",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(ConfigurationApiList::class.java) as? ConfigurationApiList
    }
    
    suspend fun getApplication(): Response<Application>? {
        var fullUrl : String? = _relativeUrls["getApplication"] 
        
        return configurationApiList?.getApplication(fullUrl  )}

    
    
    suspend fun getOwnerInfo(): Response<ApplicationAboutResponse>? {
        var fullUrl : String? = _relativeUrls["getOwnerInfo"] 
        
        return configurationApiList?.getOwnerInfo(fullUrl  )}

    
    
    suspend fun getBasicDetails(): Response<ApplicationDetail>? {
        var fullUrl : String? = _relativeUrls["getBasicDetails"] 
        
        return configurationApiList?.getBasicDetails(fullUrl  )}

    
    
    suspend fun getIntegrationTokens(): Response<AppTokenResponse>? {
        var fullUrl : String? = _relativeUrls["getIntegrationTokens"] 
        
        return configurationApiList?.getIntegrationTokens(fullUrl  )}

    
    
    suspend fun getOrderingStores(pageNo: Int?=null, pageSize: Int?=null, q: String?=null): Response<OrderingStores>? {
        var fullUrl : String? = _relativeUrls["getOrderingStores"] 
        
        return configurationApiList?.getOrderingStores(fullUrl    ,  pageNo = pageNo,    pageSize = pageSize,    q = q)}

    
    
    suspend fun getStoreDetailById(storeId: Int): Response<OrderingStore>? {
        var fullUrl : String? = _relativeUrls["getStoreDetailById"] 
        
        fullUrl = fullUrl?.replace("{" + "store_id" +"}",storeId.toString())
        
        return configurationApiList?.getStoreDetailById(fullUrl   )}

    
    
    suspend fun getFeatures(): Response<AppFeatureResponse>? {
        var fullUrl : String? = _relativeUrls["getFeatures"] 
        
        return configurationApiList?.getFeatures(fullUrl  )}

    
    
    suspend fun getContactInfo(): Response<ApplicationInformation>? {
        var fullUrl : String? = _relativeUrls["getContactInfo"] 
        
        return configurationApiList?.getContactInfo(fullUrl  )}

    
    
    suspend fun getCurrencies(): Response<CurrenciesResponse>? {
        var fullUrl : String? = _relativeUrls["getCurrencies"] 
        
        return configurationApiList?.getCurrencies(fullUrl  )}

    
    
    suspend fun getCurrencyById(id: String): Response<Currency>? {
        var fullUrl : String? = _relativeUrls["getCurrencyById"] 
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return configurationApiList?.getCurrencyById(fullUrl   )}

    
    
    suspend fun getAppCurrencies(): Response<AppCurrencyResponse>? {
        var fullUrl : String? = _relativeUrls["getAppCurrencies"] 
        
        return configurationApiList?.getAppCurrencies(fullUrl  )}

    
    
    suspend fun getLanguages(): Response<LanguageResponse>? {
        var fullUrl : String? = _relativeUrls["getLanguages"] 
        
        return configurationApiList?.getLanguages(fullUrl  )}

    
    
    suspend fun getOrderingStoreCookie(body: OrderingStoreSelectRequest): Response<SuccessMessageResponse>? {
        var fullUrl : String? = _relativeUrls["getOrderingStoreCookie"] 
        
        return configurationApiList?.getOrderingStoreCookie(fullUrl  ,body = body)}

    
    
    suspend fun removeOrderingStoreCookie(): Response<SuccessMessageResponse>? {
        var fullUrl : String? = _relativeUrls["removeOrderingStoreCookie"] 
        
        return configurationApiList?.removeOrderingStoreCookie(fullUrl  )}

    
    
    suspend fun getAppStaffList(pageNo: Int?=null, pageSize: Int?=null, orderIncent: Boolean?=null, orderingStore: Int?=null, user: String?=null, userName: String?=null): Response<AppStaffListResponse>? {
        var fullUrl : String? = _relativeUrls["getAppStaffList"] 
        
        return configurationApiList?.getAppStaffList(fullUrl    ,  pageNo = pageNo,    pageSize = pageSize,    orderIncent = orderIncent,    orderingStore = orderingStore,    user = user,    userName = userName)}

    
    
    suspend fun getAppStaffs(orderIncent: Boolean?=null, orderingStore: Int?=null, user: String?=null): Response<AppStaffResponse>? {
        var fullUrl : String? = _relativeUrls["getAppStaffs"] 
        
        return configurationApiList?.getAppStaffs(fullUrl    ,  orderIncent = orderIncent,    orderingStore = orderingStore,    user = user)}

    
    
}
