package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class OrderDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val orderApiList by lazy {
        generateorderApiList()
    }
    
    private fun generateorderApiList(): OrderApiList? {
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
            namespace = "PlatformOrder",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(OrderApiList::class.java) as? OrderApiList
    }
    
    
    suspend fun shipmentStatusUpdate(body: UpdateShipmentStatusBody)
    : Deferred<Response<UpdateShipmentStatusResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.shipmentStatusUpdate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun activityStatus(bagId: String)
    : Deferred<Response<GetActivityStatus>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.activityStatus(
        companyId = config.companyId, bagId = bagId )
        } else {
            null
        } 
    }
    
    
    suspend fun storeProcessShipmentUpdate(body: UpdateProcessShipmenstRequestBody)
    : Deferred<Response<UpdateProcessShipmenstRequestResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.storeProcessShipmentUpdate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun checkRefund(shipmentId: String)
    : Deferred<Response<HashMap<String,Any>>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.checkRefund(
        companyId = config.companyId, shipmentId = shipmentId )
        } else {
            null
        } 
    }
    
    
    suspend fun shipmentBagsCanBreak(body: CanBreakRequestBody)
    : Deferred<Response<CanBreakResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.shipmentBagsCanBreak(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getOrdersByCompanyId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, isPrioritySort: Boolean?=null, lockStatus: Boolean?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, deploymentStores: String?=null, status: String?=null, dp: String?=null, shortenUrls: Boolean?=null, filterType: String?=null)
    : Deferred<Response<OrderListing>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrdersByCompanyId(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, isPrioritySort = isPrioritySort, lockStatus = lockStatus, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, deploymentStores = deploymentStores, status = status, dp = dp, shortenUrls = shortenUrls, filterType = filterType )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrderLanesCountByCompanyId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, status: String?=null, shortenUrls: Boolean?=null, filterType: String?=null)
    : Deferred<Response<OrderLanesCount>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrderLanesCountByCompanyId(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, status = status, shortenUrls = shortenUrls, filterType = filterType )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrderDetails(orderId: String?=null, next: String?=null, previous: String?=null)
    : Deferred<Response<OrderDetails>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrderDetails(
        companyId = config.companyId, orderId = orderId, next = next, previous = previous )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getPicklistOrdersByCompanyId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, status: String?=null, shortenUrls: Boolean?=null, filterType: String?=null)
    : Deferred<Response<OrderPicklistListing>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getPicklistOrdersByCompanyId(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, status = status, shortenUrls = shortenUrls, filterType = filterType )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    suspend fun getShipmentAddress(shipmentId: String, addressCategory: String)
    : Deferred<Response<GetShipmentAddressResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentAddress(
        companyId = config.companyId, shipmentId = shipmentId, addressCategory = addressCategory )
        } else {
            null
        } 
    }
    
    
    suspend fun updateShipmentAddress(shipmentId: String, addressCategory: String,body: UpdateShipmentAddressRequest)
    : Deferred<Response<UpdateShipmentAddressResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateShipmentAddress(
        companyId = config.companyId, shipmentId = shipmentId, addressCategory = addressCategory, body = body)
        } else {
            null
        } 
    }
    
    
    
    suspend fun getPing()
    : Deferred<Response<GetPingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getPing(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun voiceCallback()
    : Deferred<Response<GetVoiceCallbackResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.voiceCallback(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun voiceClickToCall(caller: String, receiver: String)
    : Deferred<Response<GetClickToCallResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.voiceClickToCall(
        companyId = config.companyId, caller = caller, receiver = receiver )
        } else {
            null
        } 
    }
    
    
    suspend fun createOrder(body: CreateOrderPayload)
    : Deferred<Response<CreateOrderResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.createOrder(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun invalidateShipmentCache(body: InvalidateShipmentCachePayload)
    : Deferred<Response<InvalidateShipmentCacheResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.invalidateShipmentCache(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    suspend fun getOrderDetails1(orderId: String?=null, next: String?=null, previous: String?=null)
    : Deferred<Response<OrderDetails>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getOrderDetails1(companyId = config.companyId , applicationId = applicationId , orderId = orderId, next = next, previous = previous )
        } else {
            null
        }
    }
    
    
    
    suspend fun trackShipmentPlatform(shipmentId: String)
    : Deferred<Response<PlatformShipmentTrack>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackShipmentPlatform(companyId = config.companyId , applicationId = applicationId , shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    suspend fun trackOrder(orderId: String)
    : Deferred<Response<PlatformOrderTrack>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackOrder(companyId = config.companyId , applicationId = applicationId , orderId = orderId )
        } else {
            null
        }
    }
    
    
    suspend fun failedOrders()
    : Deferred<Response<FailedOrders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.failedOrders(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun reprocessOrder(orderId: String)
    : Deferred<Response<UpdateOrderReprocessResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.reprocessOrder(companyId = config.companyId , applicationId = applicationId , orderId = orderId )
        } else {
            null
        }
    }
    
    
    suspend fun updateShipment(shipmentId: String,body: ShipmentUpdateRequest)
    : Deferred<Response<ShipmentUpdateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.updateShipment(companyId = config.companyId , applicationId = applicationId , shipmentId = shipmentId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPlatformShipmentReasons(action: String)
    : Deferred<Response<ShipmentReasonsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getPlatformShipmentReasons(companyId = config.companyId , applicationId = applicationId , action = action )
        } else {
            null
        }
    }
    
    
    suspend fun getShipmentTrackDetails(orderId: String, shipmentId: String)
    : Deferred<Response<ShipmentTrackResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getShipmentTrackDetails(companyId = config.companyId , applicationId = applicationId , orderId = orderId, shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getOrdersByApplicationId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, status: String?=null, dp: String?=null, shortenUrls: Boolean?=null, filterType: String?=null)
    : Deferred<Response<OrderListing>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getOrdersByApplicationId(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, status = status, dp = dp, shortenUrls = shortenUrls, filterType = filterType )
        } else {
            null
        }
    }
    
    
    
    
    
    
}
}