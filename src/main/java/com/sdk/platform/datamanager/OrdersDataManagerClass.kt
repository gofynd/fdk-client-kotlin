package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class OrdersDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val ordersApiList by lazy {
        generateordersApiList()
    }
    
    private fun generateordersApiList(): OrdersApiList? {
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformOrders",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(OrdersApiList::class.java) as? OrdersApiList
    }
    
    
    suspend fun getShipmentDetails(shipmentId: String, orderingCompanyId: String?=null, requestByExt: String?=null)
    : Deferred<Response<ShipmentInfoResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getShipmentDetails(
        companyId = config.companyId, shipmentId = shipmentId, orderingCompanyId = orderingCompanyId, requestByExt = requestByExt )
        } else {
            null
        } 
    }
    
    
    suspend fun getLaneConfig(superLane: String?=null, groupEntity: String?=null, fromDate: String?=null, toDate: String?=null)
    : Deferred<Response<LaneConfigResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getLaneConfig(
        companyId = config.companyId, superLane = superLane, groupEntity = groupEntity, fromDate = fromDate, toDate = toDate )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrderShipmentDetails(orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getOrderShipmentDetails(
        companyId = config.companyId, orderId = orderId )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentList(lane: String?=null, searchType: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, customerId: String?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getShipmentList(
        companyId = config.companyId, lane = lane, searchType = searchType, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, customerId = customerId, isPrioritySort = isPrioritySort )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentToManifest(groupEntity: String, salesChannel: String?=null, dpIds: String?=null)
    : Deferred<Response<ManifestShipmentResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getShipmentToManifest(
        companyId = config.companyId, groupEntity = groupEntity, salesChannel = salesChannel, dpIds = dpIds )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrders(lane: String?=null, searchType: String?=null, searchValue: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, stores: String?=null, salesChannel: String?=null, pageNo: Int?=null, pageSize: Int?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<OrderListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getOrders(
        companyId = config.companyId, lane = lane, searchType = searchType, searchValue = searchValue, fromDate = fromDate, toDate = toDate, dpIds = dpIds, stores = stores, salesChannel = salesChannel, pageNo = pageNo, pageSize = pageSize, isPrioritySort = isPrioritySort )
        } else {
            null
        } 
    }
    
    
    suspend fun getfilters(view: String)
    : Deferred<Response<FiltersResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getfilters(
        companyId = config.companyId, view = view )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
}
}