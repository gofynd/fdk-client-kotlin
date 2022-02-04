package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class OrderDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val orderApiList by lazy {
        generateorderApiList()
    }

    private fun generateorderApiList(): OrderApiList? {
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
            namespace = "ApplicationOrder",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(OrderApiList::class.java) as? OrderApiList
    }
    
    fun getOrders(pageNo: Int?=null, pageSize: Int?=null, fromDate: String?=null, toDate: String?=null, status: Int?=null): Deferred<Response<OrderList>>? {
        return orderApiList?.getOrders(pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, status = status)}

    
    
    fun getOrderById(orderId: String): Deferred<Response<OrderById>>? {
        return orderApiList?.getOrderById(orderId = orderId)}

    
    
    fun getShipmentById(shipmentId: String): Deferred<Response<ShipmentById>>? {
        return orderApiList?.getShipmentById(shipmentId = shipmentId)}

    
    
    fun getShipmentReasons(shipmentId: String): Deferred<Response<ShipmentReasons>>? {
        return orderApiList?.getShipmentReasons(shipmentId = shipmentId)}

    
    
    fun updateShipmentStatus(shipmentId: String, body: ShipmentStatusUpdateBody): Deferred<Response<ShipmentStatusUpdate>>? {
        return orderApiList?.updateShipmentStatus(shipmentId = shipmentId, body = body)}

    
    
    fun trackShipment(shipmentId: String): Deferred<Response<ShipmentTrack>>? {
        return orderApiList?.trackShipment(shipmentId = shipmentId)}

    
    
    fun getPosOrderById(orderId: String): Deferred<Response<PosOrderById>>? {
        return orderApiList?.getPosOrderById(orderId = orderId)}

    
    
    fun getCustomerDetailsByShipmentId(orderId: String, shipmentId: String): Deferred<Response<CustomerDetailsByShipmentId>>? {
        return orderApiList?.getCustomerDetailsByShipmentId(orderId = orderId, shipmentId = shipmentId)}

    
    
    fun sendOtpToShipmentCustomer(orderId: String, shipmentId: String): Deferred<Response<sendOTPApplicationResponse>>? {
        return orderApiList?.sendOtpToShipmentCustomer(orderId = orderId, shipmentId = shipmentId)}

    
    
    fun verifyOtpShipmentCustomer(orderId: String, shipmentId: String, body: ReqBodyVerifyOTPShipment): Deferred<Response<ResponseVerifyOTPShipment>>? {
        return orderApiList?.verifyOtpShipmentCustomer(orderId = orderId, shipmentId = shipmentId, body = body)}

    
    
}
