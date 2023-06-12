package com.sdk.application.apis.order

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.order.*

interface OrderApiList {
    
    
    @GET 
    fun getOrders(@Url url1: String?    ,       @Query("status") status: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("custom_meta") customMeta: String?)
    : Deferred<Response<OrderList>>
    
    
    @GET 
    fun getOrderById(@Url url1: String?    )
    : Deferred<Response<OrderById>>
    
    
    @GET 
    fun getPosOrderById(@Url url1: String?    )
    : Deferred<Response<OrderList>>
    
    
    @GET 
    fun getShipmentById(@Url url1: String?    )
    : Deferred<Response<ShipmentById>>
    
    
    @GET 
    fun getInvoiceByShipmentId(@Url url1: String?    )
    : Deferred<Response<ResponseGetInvoiceShipment>>
    
    
    @GET 
    fun trackShipment(@Url url1: String?    )
    : Deferred<Response<ShipmentTrack>>
    
    
    @GET 
    fun getCustomerDetailsByShipmentId(@Url url1: String?     )
    : Deferred<Response<CustomerDetailsResponse>>
    
    
    @POST 
    fun sendOtpToShipmentCustomer(@Url url1: String?     )
    : Deferred<Response<SendOtpToCustomerResponse>>
    
    
    @POST 
    fun verifyOtpShipmentCustomer(@Url url1: String?     ,@Body body: VerifyOtp)
    : Deferred<Response<VerifyOtpResponse>>
    
    
    @GET 
    fun getShipmentBagReasons(@Url url1: String?     )
    : Deferred<Response<ShipmentBagReasons>>
    
    
    @GET 
    fun getShipmentReasons(@Url url1: String?    )
    : Deferred<Response<ShipmentReasons>>
    
    
    @PUT 
    fun updateShipmentStatus(@Url url1: String?    ,@Body body: UpdateShipmentStatusRequest)
    : Deferred<Response<ShipmentApplicationStatusResponse>>
    
}