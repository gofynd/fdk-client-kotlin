package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class OrderManageDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val orderManageApiList by lazy {
        generateorderManageApiList()
    }
    
    private fun generateorderManageApiList(): OrderManageApiList? {
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
            namespace = "PlatformOrderManage",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(OrderManageApiList::class.java) as? OrderManageApiList
    }
    
    
    suspend fun invalidateShipmentCache(body: InvalidateShipmentCachePayload)
    : Deferred<Response<InvalidateShipmentCacheResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.invalidateShipmentCache(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun reassignLocation(body: StoreReassign)
    : Deferred<Response<StoreReassignResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.reassignLocation(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateShipmentLock(body: UpdateShipmentLockPayload)
    : Deferred<Response<UpdateShipmentLockResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.updateShipmentLock(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getAnnouncements(date: String?=null)
    : Deferred<Response<AnnouncementsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.getAnnouncements(
        companyId = config.companyId, date = date )
        } else {
            null
        } 
    }
    
    
    suspend fun updateAddress(shipmentId: String, name: String?=null, address: String?=null, addressType: String?=null, pincode: String?=null, phone: String?=null, email: String?=null, landmark: String?=null, addressCategory: String, city: String?=null, state: String?=null, country: String?=null)
    : Deferred<Response<BaseResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.updateAddress(
        shipmentId = shipmentId, name = name, address = address, addressType = addressType, pincode = pincode, phone = phone, email = email, landmark = landmark, addressCategory = addressCategory, city = city, state = state, country = country, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun click2Call(caller: String, receiver: String, bagId: String, callingTo: String?=null, callerId: String?=null)
    : Deferred<Response<Click2CallResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.click2Call(
        caller = caller, receiver = receiver, bagId = bagId, callingTo = callingTo, callerId = callerId, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateShipmentStatus(body: UpdateShipmentStatusRequest)
    : Deferred<Response<UpdateShipmentStatusResponseBody>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.updateShipmentStatus(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun processManifest(body: CreateOrderPayload)
    : Deferred<Response<CreateOrderResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.processManifest(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun dispatchManifest(body: DispatchManifest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.dispatchManifest(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getRoleBasedActions()
    : Deferred<Response<GetActionsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.getRoleBasedActions(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentHistory(shipmentId: Int?=null, bagId: Int?=null)
    : Deferred<Response<ShipmentHistoryResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.getShipmentHistory(
        companyId = config.companyId, shipmentId = shipmentId, bagId = bagId )
        } else {
            null
        } 
    }
    
    
    suspend fun sendSmsNinja(body: SendSmsPayload)
    : Deferred<Response<OrderStatusResult>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.sendSmsNinja(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun platformManualAssignDPToShipment(body: ManualAssignDPToShipment)
    : Deferred<Response<ManualAssignDPToShipmentResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.platformManualAssignDPToShipment(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updatePackagingDimensions(body: CreateOrderPayload)
    : Deferred<Response<CreateOrderResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.updatePackagingDimensions(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createOrder(body: CreateOrderAPI)
    : Deferred<Response<CreateOrderResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.createOrder(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getChannelConfig()
    : Deferred<Response<CreateChannelConfigData>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.getChannelConfig(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun createChannelConfig(body: CreateChannelConfigData)
    : Deferred<Response<CreateChannelConfigResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.createChannelConfig(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun uploadConsent(body: UploadConsent)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.uploadConsent(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun orderUpdate(body: PlatformOrderUpdate)
    : Deferred<Response<ResponseDetail>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.orderUpdate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun checkOrderStatus(body: OrderStatus)
    : Deferred<Response<OrderStatusResult>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.checkOrderStatus(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun sendSmsNinjaPlatform()
    : Deferred<Response<OrderStatusResult>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderManageApiList?.sendSmsNinjaPlatform(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}