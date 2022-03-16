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
        return configurationApiList?.getApplication()}

    
    
    fun getOwnerInfo(): Deferred<Response<ApplicationAboutResponse>>? {
        return configurationApiList?.getOwnerInfo()}

    
    
    fun getBasicDetails(): Deferred<Response<ApplicationDetail>>? {
        return configurationApiList?.getBasicDetails()}

    
    
    fun getIntegrationTokens(): Deferred<Response<AppTokenResponse>>? {
        return configurationApiList?.getIntegrationTokens()}

    
    
    fun getOrderingStores(pageNo: Int?=null, pageSize: Int?=null, q: String?=null): Deferred<Response<OrderingStores>>? {
        return configurationApiList?.getOrderingStores(pageNo = pageNo, pageSize = pageSize, q = q)}

    
    
    
        
            
            
        
            
                
            
            
        
            
                
            
            
        
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
                configurationApiList?.getOrderingStores(pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait{ response, error ->
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
        return configurationApiList?.getStoreDetailById(storeId = storeId)}

    
    
    fun getFeatures(): Deferred<Response<AppFeatureResponse>>? {
        return configurationApiList?.getFeatures()}

    
    
    fun getContactInfo(): Deferred<Response<ApplicationInformation>>? {
        return configurationApiList?.getContactInfo()}

    
    
    fun getCurrencies(): Deferred<Response<CurrenciesResponse>>? {
        return configurationApiList?.getCurrencies()}

    
    
    fun getCurrencyById(id: String): Deferred<Response<Currency>>? {
        return configurationApiList?.getCurrencyById(id = id)}

    
    
    fun getAppCurrencies(): Deferred<Response<AppCurrencyResponse>>? {
        return configurationApiList?.getAppCurrencies()}

    
    
    fun getLanguages(): Deferred<Response<LanguageResponse>>? {
        return configurationApiList?.getLanguages()}

    
    
    fun getOrderingStoreCookie(body: OrderingStoreSelectRequest): Deferred<Response<SuccessMessageResponse>>? {
        return configurationApiList?.getOrderingStoreCookie(body = body)}

    
    
    fun removeOrderingStoreCookie(): Deferred<Response<SuccessMessageResponse>>? {
        return configurationApiList?.removeOrderingStoreCookie()}

    
    
    fun getAppStaffs(orderIncent: Boolean?=null, orderingStore: Int?=null, user: String?=null): Deferred<Response<AppStaffResponse>>? {
        return configurationApiList?.getAppStaffs(orderIncent = orderIncent, orderingStore = orderingStore, user = user)}

    
    
}
