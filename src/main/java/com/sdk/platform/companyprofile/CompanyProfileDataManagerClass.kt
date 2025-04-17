package com.sdk.platform.companyprofile

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class CompanyProfileDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val companyProfileApiList by lazy {
        generatecompanyProfileApiList()
    }

    private fun generatecompanyProfileApiList(): CompanyProfileApiList? {
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
            namespace = "PlatformCompanyProfile",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(CompanyProfileApiList::class.java) as? CompanyProfileApiList
    }
    
    
    suspend fun cbsOnboardGet( headers: Map<String, String> = emptyMap())
    : Response<GetCompanyProfileSerializerResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.cbsOnboardGet(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateCompany(body: UpdateCompany, headers: Map<String, String> = emptyMap())
    : Response<ProfileSuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.updateCompany(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCompanyMetrics( headers: Map<String, String> = emptyMap())
    : Response<MetricsSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getCompanyMetrics(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBrand(brandId: String, headers: Map<String, String> = emptyMap())
    : Response<GetBrandResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getBrand(
        companyId = config.companyId,brandId = brandId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun editBrand(brandId: String,body: UpdateBrandRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<ProfileSuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.editBrand(
        companyId = config.companyId,brandId = brandId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createBrand(body: CreateBrandRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<ProfileSuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createBrand(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBrands(pageNo: Int?=null,pageSize: Int?=null,q: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CompanyBrandListSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getBrands(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,q = q, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getBrands
    **/
    fun getBrandsPaginator(companyId: String, pageSize: Int?=null, q: String?=null) : Paginator<CompanyBrandListSchema>{
        val paginator = Paginator<CompanyBrandListSchema>()
        paginator.setCallBack(object : PaginatorCallback<CompanyBrandListSchema> {

            override suspend fun onNext(
                onResponse: (Event<CompanyBrandListSchema>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    companyProfileApiList?.getBrands(
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
    
    suspend fun createCompanyBrandMapping(body: CompanyBrandPostRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<ProfileSuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createCompanyBrandMapping(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getLocations(storeType: String?=null,q: String?=null,stage: String?=null,pageNo: Int?=null,pageSize: Int?=null,locationIds: ArrayList<Int>?=null,types: ArrayList<String>?=null,tags: ArrayList<String>?=null, headers: Map<String, String> = emptyMap())
    : Response<LocationListSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getLocations(
        companyId = config.companyId,storeType = storeType,q = q,stage = stage,pageNo = pageNo,pageSize = pageSize,locationIds = locationIds,types = types,tags = tags, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createLocation(body: LocationSchema, headers: Map<String, String> = emptyMap())
    : Response<ProfileSuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createLocation(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getLocationDetail(locationId: String, headers: Map<String, String> = emptyMap())
    : Response<GetLocationSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getLocationDetail(
        companyId = config.companyId,locationId = locationId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateLocation(locationId: String,body: LocationSchema, headers: Map<String, String> = emptyMap())
    : Response<ProfileSuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.updateLocation(
        companyId = config.companyId,locationId = locationId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createLocationBulk(body: BulkLocationSchema, headers: Map<String, String> = emptyMap())
    : Response<ProfileSuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createLocationBulk(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getLocationTags( headers: Map<String, String> = emptyMap())
    : Response<StoreTagsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getLocationTags(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}