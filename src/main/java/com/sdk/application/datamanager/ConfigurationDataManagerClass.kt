package com.sdk.application.datamanager

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
            
                    _relativeUrls["getApplication"] = "/service/application/configuration/v1.0/application"?.substring(1)
            
                    _relativeUrls["getOwnerInfo"] = "/service/application/configuration/v1.0/about"?.substring(1)
            
                    _relativeUrls["getBasicDetails"] = "/service/application/configuration/v1.0/detail"?.substring(1)
            
                    _relativeUrls["getIntegrationTokens"] = "/service/application/configuration/v1.0/token"?.substring(1)
            
                    _relativeUrls["getOrderingStores"] = "/service/application/configuration/v1.0/ordering-store/stores"?.substring(1)
            
                    _relativeUrls["getStoreDetailById"] = "/service/application/configuration/v1.0/ordering-store/stores/{store_id}"?.substring(1)
            
                    _relativeUrls["getFeatures"] = "/service/application/configuration/v1.0/feature"?.substring(1)
            
                    _relativeUrls["getContactInfo"] = "/service/application/configuration/v1.0/information"?.substring(1)
            
                    _relativeUrls["getCurrencies"] = "/service/application/configuration/v1.0/currencies"?.substring(1)
            
                    _relativeUrls["getCurrencyById"] = "/service/application/configuration/v1.0/currency/{id}"?.substring(1)
            
                    _relativeUrls["getAppCurrencies"] = "/service/application/configuration/v1.0/currency"?.substring(1)
            
                    _relativeUrls["getLanguages"] = "/service/application/configuration/v1.0/languages"?.substring(1)
            
                    _relativeUrls["getOrderingStoreCookie"] = "/service/application/configuration/v1.0/ordering-store/select"?.substring(1)
            
                    _relativeUrls["removeOrderingStoreCookie"] = "/service/application/configuration/v1.0/ordering-store/select"?.substring(1)
            
                    _relativeUrls["getAppStaffs"] = "/service/application/configuration/v1.0/staff"?.substring(1)
            
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationConfiguration",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ConfigurationApiList::class.java) as? ConfigurationApiList
    }
    
    fun getApplication(): Deferred<Response<Application>>? {
        var fullUrl : String? = _relativeUrls["getApplication"] 
        
        return configurationApiList?.getApplication(fullUrl  )}

    
    
    fun getOwnerInfo(): Deferred<Response<ApplicationAboutResponse>>? {
        var fullUrl : String? = _relativeUrls["getOwnerInfo"] 
        
        return configurationApiList?.getOwnerInfo(fullUrl  )}

    
    
    fun getBasicDetails(): Deferred<Response<ApplicationDetail>>? {
        var fullUrl : String? = _relativeUrls["getBasicDetails"] 
        
        return configurationApiList?.getBasicDetails(fullUrl  )}

    
    
    fun getIntegrationTokens(): Deferred<Response<AppTokenResponse>>? {
        var fullUrl : String? = _relativeUrls["getIntegrationTokens"] 
        
        return configurationApiList?.getIntegrationTokens(fullUrl  )}

    
    
    fun getOrderingStores(pageNo: Int?=null, pageSize: Int?=null, q: String?=null): Deferred<Response<OrderingStores>>? {
        var fullUrl : String? = _relativeUrls["getOrderingStores"] 
        
        return configurationApiList?.getOrderingStores(fullUrl    ,  pageNo = pageNo,    pageSize = pageSize,    q = q)}

    
    
    
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getOrderingStores
    **/
    fun getOrderingStoresPaginator(pageSize: Int?=null, q: String?=null) : Paginator<OrderingStores>{

    val paginator = Paginator<OrderingStores>()

    paginator.setCallBack(object : PaginatorCallback<OrderingStores> {

            override suspend fun onNext(
                onResponse: (Event<OrderingStores>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                var fullUrl : String? = _relativeUrls["getOrderingStores"] 
                
                configurationApiList?.getOrderingStores(fullUrl , pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                        onResponse.invoke(response, null)
                    }

                    error?.let {
                        onResponse.invoke(null,error)
                    }
            }
        }

    })
    
    return paginator
    }
    
    fun getStoreDetailById(storeId: Int): Deferred<Response<OrderingStore>>? {
        var fullUrl : String? = _relativeUrls["getStoreDetailById"] 
        
        fullUrl = fullUrl?.replace("{" + "store_id" +"}",storeId.toString())
        
        return configurationApiList?.getStoreDetailById(fullUrl   )}

    
    
    fun getFeatures(): Deferred<Response<AppFeatureResponse>>? {
        var fullUrl : String? = _relativeUrls["getFeatures"] 
        
        return configurationApiList?.getFeatures(fullUrl  )}

    
    
    fun getContactInfo(): Deferred<Response<ApplicationInformation>>? {
        var fullUrl : String? = _relativeUrls["getContactInfo"] 
        
        return configurationApiList?.getContactInfo(fullUrl  )}

    
    
    fun getCurrencies(): Deferred<Response<CurrenciesResponse>>? {
        var fullUrl : String? = _relativeUrls["getCurrencies"] 
        
        return configurationApiList?.getCurrencies(fullUrl  )}

    
    
    fun getCurrencyById(id: String): Deferred<Response<Currency>>? {
        var fullUrl : String? = _relativeUrls["getCurrencyById"] 
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return configurationApiList?.getCurrencyById(fullUrl   )}

    
    
    fun getAppCurrencies(): Deferred<Response<AppCurrencyResponse>>? {
        var fullUrl : String? = _relativeUrls["getAppCurrencies"] 
        
        return configurationApiList?.getAppCurrencies(fullUrl  )}

    
    
    fun getLanguages(): Deferred<Response<LanguageResponse>>? {
        var fullUrl : String? = _relativeUrls["getLanguages"] 
        
        return configurationApiList?.getLanguages(fullUrl  )}

    
    
    fun getOrderingStoreCookie(body: OrderingStoreSelectRequest): Deferred<Response<SuccessMessageResponse>>? {
        var fullUrl : String? = _relativeUrls["getOrderingStoreCookie"] 
        
        return configurationApiList?.getOrderingStoreCookie(fullUrl  ,body = body)}

    
    
    fun removeOrderingStoreCookie(): Deferred<Response<SuccessMessageResponse>>? {
        var fullUrl : String? = _relativeUrls["removeOrderingStoreCookie"] 
        
        return configurationApiList?.removeOrderingStoreCookie(fullUrl  )}

    
    
    fun getAppStaffs(orderIncent: Boolean?=null, orderingStore: Int?=null, user: String?=null): Deferred<Response<AppStaffResponse>>? {
        var fullUrl : String? = _relativeUrls["getAppStaffs"] 
        
        return configurationApiList?.getAppStaffs(fullUrl    ,  orderIncent = orderIncent,    orderingStore = orderingStore,    user = user)}

    
    
}
