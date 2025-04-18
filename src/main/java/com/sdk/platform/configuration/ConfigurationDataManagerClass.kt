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
    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getApplications
    **/
    fun getApplicationsPaginator(companyId: String, pageSize: Int?=null, q: String?=null) : Paginator<ApplicationsResponse>{
        val paginator = Paginator<ApplicationsResponse>()
        paginator.setCallBack(object : PaginatorCallback<ApplicationsResponse> {

            override suspend fun onNext(
                onResponse: (Event<ApplicationsResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getApplications(
                    companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, q = q
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
    
    
    
    suspend fun getCurrencies( headers: Map<String, String> = emptyMap())
    : Response<CurrenciesResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getCurrencies(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createCurrency(body: Currency, headers: Map<String, String> = emptyMap())
    : Response<Currency>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.createCurrency(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCurrency(id: String, headers: Map<String, String> = emptyMap())
    : Response<Currency>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getCurrency(
        companyId = config.companyId,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCurrency(id: String,body: Currency, headers: Map<String, String> = emptyMap())
    : Response<Currency>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.updateCurrency(
        companyId = config.companyId,id = id, body = body,headers = headers)
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
    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCompanyByBrands
    **/
    fun getCompanyByBrandsPaginator(companyId: String, pageSize: Int?=null,body: CompanyByBrandsRequest) : Paginator<CompanyByBrandsResponse>{
        val paginator = Paginator<CompanyByBrandsResponse>()
        paginator.setCallBack(object : PaginatorCallback<CompanyByBrandsResponse> {

            override suspend fun onNext(
                onResponse: (Event<CompanyByBrandsResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getCompanyByBrands(
                    companyId = config.companyId, pageNo = pageNo, pageSize = pageSize,
                    body = body )?.safeAwait{ response, error ->
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
    
    suspend fun getStoreByBrands(pageNo: Int?=null,pageSize: Int?=null,body: StoreByBrandsRequest, headers: Map<String, String> = emptyMap())
    : Response<StoreByBrandsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getStoreByBrands(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getStoreByBrands
    **/
    fun getStoreByBrandsPaginator(companyId: String, pageSize: Int?=null,body: StoreByBrandsRequest) : Paginator<StoreByBrandsResponse>{
        val paginator = Paginator<StoreByBrandsResponse>()
        paginator.setCallBack(object : PaginatorCallback<StoreByBrandsResponse> {

            override suspend fun onNext(
                onResponse: (Event<StoreByBrandsResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getStoreByBrands(
                    companyId = config.companyId, pageNo = pageNo, pageSize = pageSize,
                    body = body )?.safeAwait{ response, error ->
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
    
    suspend fun getOtherSellerApplications(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<OtherSellerApplications>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getOtherSellerApplications(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getOtherSellerApplications
    **/
    fun getOtherSellerApplicationsPaginator(companyId: String, pageSize: Int?=null) : Paginator<OtherSellerApplications>{
        val paginator = Paginator<OtherSellerApplications>()
        paginator.setCallBack(object : PaginatorCallback<OtherSellerApplications> {

            override suspend fun onNext(
                onResponse: (Event<OtherSellerApplications>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getOtherSellerApplications(
                    companyId = config.companyId, pageNo = pageNo, pageSize = pageSize
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
    
    suspend fun getOtherSellerApplicationById(appId: String, headers: Map<String, String> = emptyMap())
    : Response<OptedApplicationResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getOtherSellerApplicationById(
        companyId = config.companyId,appId = appId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun optOutFromApplication(appId: String,body: OptOutInventory, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessageResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.optOutFromApplication(
        companyId = config.companyId,appId = appId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    suspend fun getLocations(locationType: String?=null,id: String?=null, headers: Map<String, String> = emptyMap())
    : Response<Locations>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getLocations(
        companyId = config.companyId,locationType = locationType,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    suspend fun getStoresForACompany(company: String, headers: Map<String, String> = emptyMap())
    : Response<ListStoreResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getStoresForACompany(
        companyId = config.companyId,company = company, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDomainOptions( headers: Map<String, String> = emptyMap())
    : Response<DomainOptionsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            configurationApiList?.getDomainOptions(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppCompanies
    **/
    fun getAppCompaniesPaginator(
    uid: Int?=null, pageSize: Int?=null
    
    ) : Paginator<CompaniesResponse>{
        val paginator = Paginator<CompaniesResponse>()
        paginator.setCallBack(object : PaginatorCallback<CompaniesResponse> {

            override suspend fun onNext(
                onResponse: (Event<CompaniesResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getAppCompanies(companyId = config.companyId , applicationId = applicationId , uid = uid, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun getAppStores(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<StoresResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getAppStores(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAppStores
    **/
    fun getAppStoresPaginator(
    pageSize: Int?=null
    
    ) : Paginator<StoresResponse>{
        val paginator = Paginator<StoresResponse>()
        paginator.setCallBack(object : PaginatorCallback<StoresResponse> {

            override suspend fun onNext(
                onResponse: (Event<StoresResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getAppStores(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    
    suspend fun getApplicationConfiguration( headers: Map<String, String> = emptyMap())
    : Response<OwnerAppConfig>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getApplicationConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
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
    
    
    suspend fun createAppCurrencyConfig(body: AppSupportedCurrency, headers: Map<String, String> = emptyMap())
    : Response<AppSupportedCurrency>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.createAppCurrencyConfig(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getOrderingStoresByFilter
    **/
    fun getOrderingStoresByFilterPaginator(
    pageSize: Int?=null,
    body: FilterOrderingStoreRequest
    ) : Paginator<OrderingStores>{
        val paginator = Paginator<OrderingStores>()
        paginator.setCallBack(object : PaginatorCallback<OrderingStores> {

            override suspend fun onNext(
                onResponse: (Event<OrderingStores>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getOrderingStoresByFilter(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize,body = body )?.safeAwait{ response, error ->
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
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getStaffOrderingStores
    **/
    fun getStaffOrderingStoresPaginator(
    pageSize: Int?=null, q: String?=null
    
    ) : Paginator<OrderingStoresResponse>{
        val paginator = Paginator<OrderingStoresResponse>()
        paginator.setCallBack(object : PaginatorCallback<OrderingStoresResponse> {

            override suspend fun onNext(
                onResponse: (Event<OrderingStoresResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getStaffOrderingStores(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait{ response, error ->
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
    
    
    suspend fun getStoreDetailById(storeId: String, headers: Map<String, String> = emptyMap())
    : Response<OrderingStore>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getStoreDetailById(companyId = config.companyId ,applicationId = applicationId ,storeId = storeId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOrderingStores(pageNo: Int?=null,pageSize: Int?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<OrderingStores>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getOrderingStores(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getOrderingStores
    **/
    fun getOrderingStoresPaginator(
    pageSize: Int?=null, q: String?=null
    
    ) : Paginator<OrderingStores>{
        val paginator = Paginator<OrderingStores>()
        paginator.setCallBack(object : PaginatorCallback<OrderingStores> {

            override suspend fun onNext(
                onResponse: (Event<OrderingStores>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    configurationApiList?.getOrderingStores(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait{ response, error ->
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
    
    
    suspend fun removeDomainById(domainId: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessageResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.removeDomainById(companyId = config.companyId ,applicationId = applicationId ,domainId = domainId, headers = headers)
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
    : Response<Application>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getApplicationById(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateApplication(body: Application, headers: Map<String, String> = emptyMap())
    : Response<Application>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateApplication(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    suspend fun getApplicationDomainAvailibility(body: DomainSuggestionsRequest, headers: Map<String, String> = emptyMap())
    : Response<DomainSuggestionsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getApplicationDomainAvailibility(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    suspend fun updateApplicationVersion(body: PlatformVersionRequest, headers: Map<String, String> = emptyMap())
    : Response<PlatformVersion>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateApplicationVersion(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createTokens( headers: Map<String, String> = emptyMap())
    : Response<Application>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.createTokens(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteToken(token: String, headers: Map<String, String> = emptyMap())
    : Response<Application>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.deleteToken(companyId = config.companyId ,applicationId = applicationId ,token = token, headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun getUrlRedirections( headers: Map<String, String> = emptyMap())
    : Response<UrlRedirectionResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getUrlRedirections(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createUrlRedirection(body: UrlRedirectionRequest, headers: Map<String, String> = emptyMap())
    : Response<UrlRedirection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.createUrlRedirection(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUrlRedirection(redirectionDomainId: String, headers: Map<String, String> = emptyMap())
    : Response<UrlRedirection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.getUrlRedirection(companyId = config.companyId ,redirectionDomainId = redirectionDomainId,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateUrlRedirection(redirectionDomainId: String,body: UrlRedirection, headers: Map<String, String> = emptyMap())
    : Response<UrlRedirection>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.updateUrlRedirection(redirectionDomainId = redirectionDomainId,companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteUrlRedirection(redirectionDomainId: String, headers: Map<String, String> = emptyMap())
    : Response<SuccessMessageResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                configurationApiList?.deleteUrlRedirection(redirectionDomainId = redirectionDomainId,companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    
}
}