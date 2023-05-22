package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.logistics.*
import com.sdk.platform.apis.logistics.*




class LogisticsDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val logisticsApiList by lazy {
        generatelogisticsApiList()
    }
    
    private fun generatelogisticsApiList(): LogisticsApiList? {
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
            namespace = "PlatformLogistics",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey,
        )
        return retrofitHttpClient?.initializeRestClient(LogisticsApiList::class.java) as? LogisticsApiList
    }
    
    
    
    suspend fun getEntityRegionView(body: EntityRegionView_Request)
    : Deferred<Response<EntityRegionView_Response>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            logisticsApiList?.getEntityRegionView(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getListView(pageNumber: Int?=null, pageSize: Int?=null, name: String?=null, isActive: Boolean?=null, channelIds: String?=null, q: String?=null)
    : Deferred<Response<ListViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            logisticsApiList?.getListView(
        companyId = config.companyId, pageNumber = pageNumber, pageSize = pageSize, name = name, isActive = isActive, channelIds = channelIds, q = q )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyStoreView()
    : Deferred<Response<CompanyStoreView_Response>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            logisticsApiList?.getCompanyStoreView(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateZoneControllerView(zoneId: String,body: ZoneUpdateRequest)
    : Deferred<Response<ZoneSuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            logisticsApiList?.updateZoneControllerView(
        zoneId = zoneId, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getZoneDataView(zoneId: String)
    : Deferred<Response<GetSingleZoneDataViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            logisticsApiList?.getZoneDataView(
        companyId = config.companyId, zoneId = zoneId )
        } else {
            null
        } 
    }
    
    
    suspend fun createZone(body: ZoneRequest)
    : Deferred<Response<ZoneResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            logisticsApiList?.createZone(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun getStore(storeUid: String)
    : Deferred<Response<GetStoresViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            logisticsApiList?.getStore(
        companyId = config.companyId, storeUid = storeUid )
        } else {
            null
        } 
    }
    
    
    suspend fun getAllStores()
    : Deferred<Response<GetStoresViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            logisticsApiList?.getAllStores(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getApplicationServiceability()
    : Deferred<Response<ApplicationServiceabilityConfigResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                logisticsApiList?.getApplicationServiceability(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    suspend fun getZoneFromPincodeView(body: GetZoneFromPincodeViewRequest)
    : Deferred<Response<GetZoneFromPincodeViewResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                logisticsApiList?.getZoneFromPincodeView(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getZonesFromApplicationIdView(pageNo: Int?=null, pageSize: Int?=null, zoneId: ArrayList<String>?=null, q: String?=null)
    : Deferred<Response<GetZoneFromApplicationIdViewResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                logisticsApiList?.getZonesFromApplicationIdView(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, zoneId = zoneId, q = q )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun updatePincodeMopView(body: PincodeMopData)
    : Deferred<Response<PincodeMOPresponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                logisticsApiList?.updatePincodeMopView(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeBulkView(body: PincodeMopBulkData)
    : Deferred<Response<PincodeBulkViewResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                logisticsApiList?.updatePincodeBulkView(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeCoDListing(body: PincodeCodStatusListingRequest)
    : Deferred<Response<PincodeCodStatusListingResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                logisticsApiList?.updatePincodeCoDListing(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updatePincodeAuditHistory(body: PincodeMopUpdateAuditHistoryRequest)
    : Deferred<Response<PincodeMopUpdateAuditHistoryResponseData>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                logisticsApiList?.updatePincodeAuditHistory(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
}
}