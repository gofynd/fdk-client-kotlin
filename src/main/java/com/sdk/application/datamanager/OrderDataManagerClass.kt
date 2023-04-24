package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import com.sdk.application.models.order.*
import com.sdk.application.apis.order.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class OrderDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val orderApiList by lazy {
        generateorderApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getOrders"] = "/service/application/order/v1.0/orders".substring(1)
            
                    _relativeUrls["getOrderById"] = "/service/application/order/v1.0/orders/{order_id}".substring(1)
            
                    _relativeUrls["getPosOrderById"] = "/service/application/order/v1.0/orders/pos-order/{order_id}".substring(1)
            
                    _relativeUrls["getShipmentById"] = "/service/application/order/v1.0/orders/shipments/{shipment_id}".substring(1)
            
                    _relativeUrls["getInvoiceByShipmentId"] = "/service/application/order/v1.0/orders/shipments/{shipment_id}/invoice".substring(1)
            
                    _relativeUrls["trackShipment"] = "/service/application/order/v1.0/orders/shipments/{shipment_id}/track".substring(1)
            
                    _relativeUrls["getCustomerDetailsByShipmentId"] = "/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/customer-details".substring(1)
            
                    _relativeUrls["sendOtpToShipmentCustomer"] = "/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/send/".substring(1)
            
                    _relativeUrls["verifyOtpShipmentCustomer"] = "/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/verify/".substring(1)
            
                    _relativeUrls["getShipmentBagReasons"] = "/service/application/order/v1.0/orders/shipments/{shipment_id}/bags/{bag_id}/reasons".substring(1)
            
                    _relativeUrls["getShipmentReasons"] = "/service/application/order/v1.0/orders/shipments/{shipment_id}/reasons".substring(1)
            
                    _relativeUrls["updateShipmentStatus"] = "/service/application/order/v1.0/orders/shipments/{shipment_id}/status".substring(1)
            
                    _relativeUrls["getProducts"] = "/service/application/order/v1.0/products".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
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
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationOrder",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(OrderApiList::class.java) as? OrderApiList
    }
    
    fun getOrders(status: Int?=null, pageNo: Int?=null, pageSize: Int?=null, fromDate: String?=null, toDate: String?=null, customMeta: String?=null): Deferred<Response<OrderList>>? {
        var fullUrl : String? = _relativeUrls["getOrders"] 
        
        return orderApiList?.getOrders(fullUrl    ,  status = status,    pageNo = pageNo,    pageSize = pageSize,    fromDate = fromDate,    toDate = toDate,    customMeta = customMeta)}

    
    
    fun getOrderById(orderId: String): Deferred<Response<OrderById>>? {
        var fullUrl : String? = _relativeUrls["getOrderById"] 
        
        fullUrl = fullUrl?.replace("{" + "order_id" +"}",orderId.toString())
        
        return orderApiList?.getOrderById(fullUrl   )}

    
    
    fun getPosOrderById(orderId: String): Deferred<Response<OrderList>>? {
        var fullUrl : String? = _relativeUrls["getPosOrderById"] 
        
        fullUrl = fullUrl?.replace("{" + "order_id" +"}",orderId.toString())
        
        return orderApiList?.getPosOrderById(fullUrl   )}

    
    
    fun getShipmentById(shipmentId: String): Deferred<Response<ShipmentById>>? {
        var fullUrl : String? = _relativeUrls["getShipmentById"] 
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.getShipmentById(fullUrl   )}

    
    
    fun getInvoiceByShipmentId(shipmentId: String): Deferred<Response<ResponseGetInvoiceShipment>>? {
        var fullUrl : String? = _relativeUrls["getInvoiceByShipmentId"] 
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.getInvoiceByShipmentId(fullUrl   )}

    
    
    fun trackShipment(shipmentId: String): Deferred<Response<ShipmentTrack>>? {
        var fullUrl : String? = _relativeUrls["trackShipment"] 
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.trackShipment(fullUrl   )}

    
    
    fun getCustomerDetailsByShipmentId(orderId: String, shipmentId: String): Deferred<Response<CustomerDetailsResponse>>? {
        var fullUrl : String? = _relativeUrls["getCustomerDetailsByShipmentId"] 
        
        fullUrl = fullUrl?.replace("{" + "order_id" +"}",orderId.toString())
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.getCustomerDetailsByShipmentId(fullUrl    )}

    
    
    fun sendOtpToShipmentCustomer(orderId: String, shipmentId: String): Deferred<Response<SendOtpToCustomerResponse>>? {
        var fullUrl : String? = _relativeUrls["sendOtpToShipmentCustomer"] 
        
        fullUrl = fullUrl?.replace("{" + "order_id" +"}",orderId.toString())
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.sendOtpToShipmentCustomer(fullUrl    )}

    
    
    fun verifyOtpShipmentCustomer(orderId: String, shipmentId: String, body: VerifyOtp): Deferred<Response<VerifyOtpResponse>>? {
        var fullUrl : String? = _relativeUrls["verifyOtpShipmentCustomer"] 
        
        fullUrl = fullUrl?.replace("{" + "order_id" +"}",orderId.toString())
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.verifyOtpShipmentCustomer(fullUrl    ,body = body)}

    
    
    fun getShipmentBagReasons(shipmentId: String, bagId: String): Deferred<Response<ShipmentBagReasons>>? {
        var fullUrl : String? = _relativeUrls["getShipmentBagReasons"] 
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        fullUrl = fullUrl?.replace("{" + "bag_id" +"}",bagId.toString())
        
        return orderApiList?.getShipmentBagReasons(fullUrl    )}

    
    
    fun getShipmentReasons(shipmentId: String): Deferred<Response<ShipmentReasons>>? {
        var fullUrl : String? = _relativeUrls["getShipmentReasons"] 
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.getShipmentReasons(fullUrl   )}

    
    
    fun updateShipmentStatus(shipmentId: String, body: UpdateShipmentStatusRequest): Deferred<Response<ShipmentApplicationStatusResponse>>? {
        var fullUrl : String? = _relativeUrls["updateShipmentStatus"] 
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.updateShipmentStatus(fullUrl   ,body = body)}

    
    
    fun getProducts(companyId: Int, status: Int?=null, pageNo: Int?=null, pageSize: Int?=null, fromDate: String?=null, toDate: String?=null, searchValue: String?=null): Deferred<Response<ProductListResponse>>? {
        var fullUrl : String? = _relativeUrls["getProducts"] 
        
        fullUrl = fullUrl?.replace("{" + "company_id" +"}",companyId.toString())
        
        return orderApiList?.getProducts(fullUrl     ,  status = status,    pageNo = pageNo,    pageSize = pageSize,    fromDate = fromDate,    toDate = toDate,    searchValue = searchValue)}

    
    
}
