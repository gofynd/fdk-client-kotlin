package com.sdk.platform.datamanager

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
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ServiceabilityApiList::class.java) as? ServiceabilityApiList
    }
    
    
    
    
    suspend fun getEntityRegionView(body: EntityRegionViewRequest)
    : Deferred<Response<EntityRegionViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getEntityRegionView(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getListView(pageNumber: Int?=null, pageNo: Int?=null, pageSize: Int?=null, name: String?=null, isActive: Boolean?=null, channelIds: String?=null, q: String?=null, zoneId: ArrayList<String>?=null)
    : Deferred<Response<ListViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getListView(
        companyId = config.companyId, pageNumber = pageNumber, pageNo = pageNo, pageSize = pageSize, name = name, isActive = isActive, channelIds = channelIds, q = q, zoneId = zoneId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyStoreView()
    : Deferred<Response<CompanyStoreView_Response>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getCompanyStoreView(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getZoneDataView(zoneId: String)
    : Deferred<Response<GetSingleZoneDataViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getZoneDataView(
        companyId = config.companyId, zoneId = zoneId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateZoneControllerView(zoneId: String,body: ZoneUpdateRequest)
    : Deferred<Response<ZoneSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.updateZoneControllerView(
        zoneId = zoneId, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun upsertZoneControllerView(body: ZoneRequest)
    : Deferred<Response<ZoneResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.upsertZoneControllerView(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun getZoneListView(pageNumber: Int?=null, pageNo: Int?=null, pageSize: Int?=null, name: String?=null, isActive: Boolean?=null, channelIds: String?=null, q: String?=null, zoneId: ArrayList<String>?=null)
    : Deferred<Response<ListViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            serviceabilityApiList?.getZoneListView(
        companyId = config.companyId, pageNumber = pageNumber, pageNo = pageNo, pageSize = pageSize, name = name, isActive = isActive, channelIds = channelIds, q = q, zoneId = zoneId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun postApplicationServiceability(body: ApplicationServiceabilityConfig)
    : Deferred<Response<ApplicationServiceabilityConfigResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.postApplicationServiceability(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationServiceability()
    : Deferred<Response<ApplicationServiceabilityConfigResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getApplicationServiceability(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    suspend fun getZoneFromPincodeView(country: String?=null,body: GetZoneFromPincodeViewRequest)
    : Deferred<Response<GetZoneFromPincodeViewResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getZoneFromPincodeView(companyId = config.companyId , applicationId = applicationId , country = country, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getZonesFromApplicationIdView(pageNo: Int?=null, pageSize: Int?=null, zoneId: ArrayList<String>?=null, q: String?=null)
    : Deferred<Response<GetZoneFromApplicationIdViewResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                serviceabilityApiList?.getZonesFromApplicationIdView(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, zoneId = zoneId, q = q )
        } else {
            null
        }
    }
    
    
}
}