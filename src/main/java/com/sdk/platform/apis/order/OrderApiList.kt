package com.sdk.platform.apis.order

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.order.*

interface OrderApiList {
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipment-details/{shipment_id}")
    fun getShipmentDetails(@Path("company_id") companyId: String, @Path("shipment_id") shipmentId: String, @Query("ordering_company_id") orderingCompanyId: String?, @Query("request_by_ext") requestByExt: String?)
    : Deferred<Response<ShipmentInfoResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/lane-config/")
    fun getLaneConfig(@Path("company_id") companyId: String, @Query("super_lane") superLane: String?, @Query("group_entity") groupEntity: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("payment_mode") paymentMode: String?, @Query("bag_status") bagStatus: String?)
    : Deferred<Response<LaneConfigResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/order-details")
    fun getOrderShipmentDetails(@Path("company_id") companyId: String, @Query("order_id") orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipments-listing")
    fun getShipmentList(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_id") searchId: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("customer_id") customerId: String?, @Query("is_priority_sort") isPrioritySort: Boolean?)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/manifest-listing")
    fun getShipmentToManifest(@Path("company_id") companyId: String, @Query("group_entity") groupEntity: String, @Query("sales_channel") salesChannel: String?, @Query("dp_ids") dpIds: String?)
    : Deferred<Response<ManifestShipmentResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/orders-listing")
    fun getOrders(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_value") searchValue: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_priority_sort") isPrioritySort: Boolean?)
    : Deferred<Response<OrderListingResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipment/metrics-count")
    fun getMetricCount(@Path("company_id") companyId: String, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?)
    : Deferred<Response<MetricCountResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/filter-listing")
    fun getfilters(@Path("company_id") companyId: String, @Query("view") view: String)
    : Deferred<Response<FiltersResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/application/{application_id}/shipments")
    fun getApplicationShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_id") searchId: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("customer_id") customerId: String?, @Query("is_priority_sort") isPrioritySort: Boolean?)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>
    
    @POST ("/service/platform/orders/v1.0/company/{company_id}/reports/shipment")
    fun createShipmentReport(@Path("company_id") companyId: String, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?)
    : Deferred<Response<Success>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/reports/shipment-listing")
    fun getReportsShipmentListing(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<OmsReports>>
    
    @POST ("/service/platform/orders/v1.0/company/{company_id}/upsert/jiocode/article")
    fun upsertJioCode(@Path("company_id") companyId: String,@Body body: JioCodeUpsertPayload)
    : Deferred<Response<JioCodeUpsertResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/status-internal")
    fun statusInternalUpdate(@Path("company_id") companyId: String,@Body body: PlatformShipmentStatusInternal)
    : Deferred<Response<ResponseDetail>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    fun getShipmentHistory(@Path("company_id") companyId: String, @Query("bag_id") bagId: Int)
    : Deferred<Response<ShipmentHistoryResponse>>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/validation")
    fun orderUpdate(@Path("company_id") companyId: String,@Body body: PlatformOrderUpdate)
    : Deferred<Response<ResponseDetail>>
    
}