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
    fun getShipmentById(@Url url1: String?    )
    : Deferred<Response<ShipmentById>>
    
    
    @GET 
    fun getCustomerDetailsByShipmentId(@Url url1: String?     )
    : Deferred<Response<CustomerDetailsResponse>>
    
    
    @POST 
    fun sendOtpToShipmentCustomer(@Url url1: String?     )
    : Deferred<Response<SendOtpToCustomerResponse>>
    
    
    @GET 
    fun getShipmentReasons(@Url url1: String?     ,  @Query("bag_id") bagId: String)
    : Deferred<Response<ShipmentReasonsResponse>>
    
    
    @POST 
    fun verifyOtpShipmentCustomer(@Url url1: String?     ,@Body body: VerifyOtp)
    : Deferred<Response<VerifyOtpResponse>>
    
    
    @GET 
    fun getOrders(@Url url1: String?    ,      @Query("status") status: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?)
    : Deferred<Response<OrderList>>
    
    
    @GET 
    fun getOrderById(@Url url1: String?    )
    : Deferred<Response<OrderList>>
    
    
    @GET 
    fun getPosOrderById(@Url url1: String?    )
    : Deferred<Response<OrderList>>
    
    
    @GET 
    fun trackShipment(@Url url1: String?    )
    : Deferred<Response<TrackShipmentResponse>>
    
    
    @PUT 
    fun updateShipmentStatus(@Url url1: String?    ,@Body body: ShipmentStatusUpdateBody)
    : Deferred<Response<ShipmentStatusUpdate>>
    
}