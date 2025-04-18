package com.sdk.application.order

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

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getShipmentRefundSummary"] = "/service/application/order-manage/v1.0/shipment/{shipment_id}/refund-summary".substring(1)
            
                    _relativeUrls["getRefundOptions"] = "/service/application/order-manage/v1.0/shipment/{shipment_id}/refund-options".substring(1)
            
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
    
    suspend fun getShipmentRefundSummary(shipmentId: String, headers: Map<String, String> = emptyMap()): Response<ShipmentRefundSummaryResponse>? {
        var fullUrl : String? = _relativeUrls["getShipmentRefundSummary"]
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.getShipmentRefundSummary(fullUrl,  headers = headers)}

    
    
    suspend fun getRefundOptions(shipmentId: String,bagIds: String?=null,state: String?=null,optinAppId: String?=null,optinCompanyId: Int?=null,status: String?=null, headers: Map<String, String> = emptyMap()): Response<RefundOptionsSchemaResponse>? {
        var fullUrl : String? = _relativeUrls["getRefundOptions"]
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.getRefundOptions(fullUrl,    bagIds = bagIds,  state = state,  optinAppId = optinAppId,  optinCompanyId = optinCompanyId,  status = status,headers = headers)}

    
    
    suspend fun getOrders(status: Int?=null,pageNo: Int?=null,pageSize: Int?=null,fromDate: String?=null,toDate: String?=null,startDate: String?=null,endDate: String?=null,customMeta: String?=null, headers: Map<String, String> = emptyMap()): Response<OrderList>? {
        var fullUrl : String? = _relativeUrls["getOrders"]
        
        return orderApiList?.getOrders(fullUrl,   status = status,  pageNo = pageNo,  pageSize = pageSize,  fromDate = fromDate,  toDate = toDate,  startDate = startDate,  endDate = endDate,  customMeta = customMeta,headers = headers)}

    
    
    suspend fun getOrderById(orderId: String,allowInactive: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<OrderById>? {
        var fullUrl : String? = _relativeUrls["getOrderById"]
        
        fullUrl = fullUrl?.replace("{" + "order_id" +"}",orderId.toString())
        
        return orderApiList?.getOrderById(fullUrl,    allowInactive = allowInactive,headers = headers)}

    
    
    suspend fun getPosOrderById(orderId: String, headers: Map<String, String> = emptyMap()): Response<OrderById>? {
        var fullUrl : String? = _relativeUrls["getPosOrderById"]
        
        fullUrl = fullUrl?.replace("{" + "order_id" +"}",orderId.toString())
        
        return orderApiList?.getPosOrderById(fullUrl,  headers = headers)}

    
    
    suspend fun getShipmentById(shipmentId: String,allowInactive: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<ShipmentById>? {
        var fullUrl : String? = _relativeUrls["getShipmentById"]
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.getShipmentById(fullUrl,    allowInactive = allowInactive,headers = headers)}

    
    
    suspend fun getInvoiceByShipmentId(shipmentId: String, headers: Map<String, String> = emptyMap()): Response<ResponseGetInvoiceShipment>? {
        var fullUrl : String? = _relativeUrls["getInvoiceByShipmentId"]
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.getInvoiceByShipmentId(fullUrl,  headers = headers)}

    
    
    suspend fun trackShipment(shipmentId: String, headers: Map<String, String> = emptyMap()): Response<ShipmentTrack>? {
        var fullUrl : String? = _relativeUrls["trackShipment"]
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.trackShipment(fullUrl,  headers = headers)}

    
    
    suspend fun getCustomerDetailsByShipmentId(orderId: String,shipmentId: String, headers: Map<String, String> = emptyMap()): Response<CustomerDetailsResponse>? {
        var fullUrl : String? = _relativeUrls["getCustomerDetailsByShipmentId"]
        
        fullUrl = fullUrl?.replace("{" + "order_id" +"}",orderId.toString())
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.getCustomerDetailsByShipmentId(fullUrl,   headers = headers)}

    
    
    suspend fun sendOtpToShipmentCustomer(orderId: String,shipmentId: String, headers: Map<String, String> = emptyMap()): Response<SendOtpToCustomerResponse>? {
        var fullUrl : String? = _relativeUrls["sendOtpToShipmentCustomer"]
        
        fullUrl = fullUrl?.replace("{" + "order_id" +"}",orderId.toString())
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.sendOtpToShipmentCustomer(fullUrl,   headers = headers)}

    
    
    suspend fun verifyOtpShipmentCustomer(orderId: String,shipmentId: String,body: VerifyOtp, headers: Map<String, String> = emptyMap()): Response<VerifyOtpResponse>? {
        var fullUrl : String? = _relativeUrls["verifyOtpShipmentCustomer"]
        
        fullUrl = fullUrl?.replace("{" + "order_id" +"}",orderId.toString())
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.verifyOtpShipmentCustomer(fullUrl,   body = body,headers = headers)}

    
    
    suspend fun getShipmentBagReasons(shipmentId: String,bagId: String, headers: Map<String, String> = emptyMap()): Response<ShipmentBagReasons>? {
        var fullUrl : String? = _relativeUrls["getShipmentBagReasons"]
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        fullUrl = fullUrl?.replace("{" + "bag_id" +"}",bagId.toString())
        
        return orderApiList?.getShipmentBagReasons(fullUrl,   headers = headers)}

    
    
    suspend fun getShipmentReasons(shipmentId: String, headers: Map<String, String> = emptyMap()): Response<ShipmentReasons>? {
        var fullUrl : String? = _relativeUrls["getShipmentReasons"]
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.getShipmentReasons(fullUrl,  headers = headers)}

    
    
    suspend fun updateShipmentStatus(shipmentId: String,body: UpdateShipmentStatusRequest, headers: Map<String, String> = emptyMap()): Response<ShipmentApplicationStatusResponse>? {
        var fullUrl : String? = _relativeUrls["updateShipmentStatus"]
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return orderApiList?.updateShipmentStatus(fullUrl,  body = body,headers = headers)}

    
    
}
