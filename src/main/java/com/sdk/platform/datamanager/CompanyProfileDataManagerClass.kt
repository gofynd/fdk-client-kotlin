package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.companyprofile.*
import com.sdk.platform.apis.companyprofile.*




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
            certPublicKey = config.certPublicKey,
        )
        return retrofitHttpClient?.initializeRestClient(CompanyProfileApiList::class.java) as? CompanyProfileApiList
    }
    
    
    suspend fun cbsOnboardGet()
    : Deferred<Response<GetCompanyProfileSerializerResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.cbsOnboardGet(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateCompany(body: UpdateCompany)
    : Deferred<Response<ProfileSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.updateCompany(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyMetrics()
    : Deferred<Response<MetricsSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getCompanyMetrics(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBrand(brandId: String)
    : Deferred<Response<GetBrandResponseSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getBrand(
        companyId = config.companyId, brandId = brandId )
        } else {
            null
        } 
    }
    
    
    suspend fun editBrand(brandId: String,body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<ProfileSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.editBrand(
        companyId = config.companyId, brandId = brandId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createBrand(body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<ProfileSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createBrand(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getBrands(pageNo: Int?=null, pageSize: Int?=null, q: String?=null)
    : Deferred<Response<CompanyBrandListSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getBrands(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun createCompanyBrandMapping(body: CompanyBrandPostRequestSerializer)
    : Deferred<Response<ProfileSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createCompanyBrandMapping(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getLocations(storeType: String?=null, q: String?=null, stage: String?=null, pageNo: Int?=null, pageSize: Int?=null, locationIds: ArrayList<Int>?=null)
    : Deferred<Response<LocationListSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getLocations(
        companyId = config.companyId, storeType = storeType, q = q, stage = stage, pageNo = pageNo, pageSize = pageSize, locationIds = locationIds )
        } else {
            null
        } 
    }
    
    
    suspend fun createLocation(body: LocationSerializer)
    : Deferred<Response<ProfileSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createLocation(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getLocationDetail(locationId: String)
    : Deferred<Response<GetLocationSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getLocationDetail(
        companyId = config.companyId, locationId = locationId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateLocation(locationId: String,body: LocationSerializer)
    : Deferred<Response<ProfileSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.updateLocation(
        companyId = config.companyId, locationId = locationId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createLocationBulk(body: BulkLocationSerializer)
    : Deferred<Response<ProfileSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createLocationBulk(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}