package com.sdk.application.order

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface OrderApiList {
    
    
    @GET 
    suspend fun getOrders(@Url url1: String?    ,         @Query("status") status: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @Query("custom_meta") customMeta: String?)
    : Response<OrderList>
    
    
    @GET 
    suspend fun getOrderById(@Url url1: String?     ,  @Query("allow_inactive") allowInactive: Boolean?)
    : Response<OrderById>
    
    
    @GET 
    suspend fun getPosOrderById(@Url url1: String?    )
    : Response<OrderById>
    
    
    @GET 
    suspend fun getShipmentById(@Url url1: String?     ,  @Query("allow_inactive") allowInactive: Boolean?)
    : Response<ShipmentById>
    
    
    @GET 
    suspend fun getInvoiceByShipmentId(@Url url1: String?    )
    : Response<ResponseGetInvoiceShipment>
    
    
    @GET 
    suspend fun trackShipment(@Url url1: String?    )
    : Response<ShipmentTrack>
    
    
    @GET 
    suspend fun getCustomerDetailsByShipmentId(@Url url1: String?     )
    : Response<CustomerDetailsResponse>
    
    
    @POST 
    suspend fun sendOtpToShipmentCustomer(@Url url1: String?     )
    : Response<SendOtpToCustomerResponse>
    
    
    @POST 
    suspend fun verifyOtpShipmentCustomer(@Url url1: String?     ,@Body body: VerifyOtp)
    : Response<VerifyOtpResponse>
    
    
    @GET 
    suspend fun getShipmentBagReasons(@Url url1: String?     )
    : Response<ShipmentBagReasons>
    
    
    @GET 
    suspend fun getShipmentReasons(@Url url1: String?    )
    : Response<ShipmentReasons>
    
    
    @PUT 
    suspend fun updateShipmentStatus(@Url url1: String?    ,@Body body: UpdateShipmentStatusRequest)
    : Response<ShipmentApplicationStatusResponse>
    
}