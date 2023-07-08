package com.sdk.platform.apis.order

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.order.*

interface OrderApiList {
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/actions/status")
    fun shipmentStatusUpdate(@Path("company_id") companyId: String,@Body body: UpdateShipmentStatusBody)
    : Deferred<Response<UpdateShipmentStatusResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/actions/activity/status")
    fun activityStatus(@Path("company_id") companyId: String, @Query("bag_id") bagId: String)
    : Deferred<Response<GetActivityStatus>>
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/actions/store/process-shipments")
    fun storeProcessShipmentUpdate(@Path("company_id") companyId: String,@Body body: UpdateProcessShipmenstRequestBody)
    : Deferred<Response<UpdateProcessShipmenstRequestResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/actions/check-refund/{shipment_id}")
    fun checkRefund(@Path("company_id") companyId: String, @Path("shipment_id") shipmentId: String)
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/actions/can-break")
    fun shipmentBagsCanBreak(@Path("company_id") companyId: String,@Body body: CanBreakRequestBody)
    : Deferred<Response<CanBreakResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders")
    fun getOrdersByCompanyId(@Path("company_id") companyId: String, @Query("page_no") pageNo: String?, @Query("page_size") pageSize: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("is_priority_sort") isPrioritySort: Boolean?, @Query("lock_status") lockStatus: Boolean?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("sales_channels") salesChannels: String?, @Query("order_id") orderId: String?, @Query("stores") stores: String?, @Query("deployment_stores") deploymentStores: String?, @Query("status") status: String?, @Query("dp") dp: String?, @Query("shorten_urls") shortenUrls: Boolean?, @Query("filter_type") filterType: String?)
    : Deferred<Response<OrderListing>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/lane-count")
    fun getOrderLanesCountByCompanyId(@Path("company_id") companyId: String, @Query("page_no") pageNo: String?, @Query("page_size") pageSize: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("sales_channels") salesChannels: String?, @Query("order_id") orderId: String?, @Query("stores") stores: String?, @Query("status") status: String?, @Query("shorten_urls") shortenUrls: Boolean?, @Query("filter_type") filterType: String?)
    : Deferred<Response<OrderLanesCount>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/details")
    fun getOrderDetails(@Path("company_id") companyId: String, @Query("order_id") orderId: String?, @Query("next") next: String?, @Query("previous") previous: String?)
    : Deferred<Response<OrderDetails>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/details")
    fun getOrderDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("order_id") orderId: String?, @Query("next") next: String?, @Query("previous") previous: String?)
    : Deferred<Response<OrderDetails>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/picklist")
    fun getPicklistOrdersByCompanyId(@Path("company_id") companyId: String, @Query("page_no") pageNo: String?, @Query("page_size") pageSize: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("sales_channels") salesChannels: String?, @Query("order_id") orderId: String?, @Query("stores") stores: String?, @Query("status") status: String?, @Query("shorten_urls") shortenUrls: Boolean?, @Query("filter_type") filterType: String?)
    : Deferred<Response<OrderPicklistListing>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    fun trackShipmentPlatform(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("shipment_id") shipmentId: String)
    : Deferred<Response<PlatformShipmentTrack>>
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/{order_id}/track")
    fun trackOrder(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("order_id") orderId: String)
    : Deferred<Response<PlatformOrderTrack>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/failed")
    fun failedOrders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<FailedOrders>>
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/{order_id}/reprocess")
    fun reprocessOrder(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("order_id") orderId: String)
    : Deferred<Response<UpdateOrderReprocessResponse>>
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/update")
    fun updateShipment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("shipment_id") shipmentId: String,@Body body: ShipmentUpdateRequest)
    : Deferred<Response<ShipmentUpdateResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/reasons/{action}")
    fun getPlatformShipmentReasons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("action") action: String)
    : Deferred<Response<ShipmentReasonsResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/{order_id}/shipments/{shipment_id}/track")
    fun getShipmentTrackDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("order_id") orderId: String, @Path("shipment_id") shipmentId: String)
    : Deferred<Response<ShipmentTrackResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/shipments/{shipment_id}/address/{address_category}")
    fun getShipmentAddress(@Path("company_id") companyId: String, @Path("shipment_id") shipmentId: String, @Path("address_category") addressCategory: String)
    : Deferred<Response<GetShipmentAddressResponse>>
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/orders/shipments/{shipment_id}/address/{address_category}")
    fun updateShipmentAddress(@Path("company_id") companyId: String, @Path("shipment_id") shipmentId: String, @Path("address_category") addressCategory: String,@Body body: UpdateShipmentAddressRequest)
    : Deferred<Response<UpdateShipmentAddressResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders")
    fun getOrdersByApplicationId(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: String?, @Query("page_size") pageSize: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("sales_channels") salesChannels: String?, @Query("order_id") orderId: String?, @Query("stores") stores: String?, @Query("status") status: String?, @Query("dp") dp: String?, @Query("shorten_urls") shortenUrls: Boolean?, @Query("filter_type") filterType: String?)
    : Deferred<Response<OrderListing>>
    
}