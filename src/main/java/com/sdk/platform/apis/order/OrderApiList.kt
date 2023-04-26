package com.sdk.platform.apis.order

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.order.*

interface OrderApiList {
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipments-listing")
    fun getShipments(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("bag_status") bagStatus: String?, @Query("status_override_lane") statusOverrideLane: Boolean?, @Query("search_type") searchType: String?, @Query("search_value") searchValue: String?, @Query("search_id") searchId: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channels") salesChannels: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_priority_sort") isPrioritySort: Boolean?, @Query("fetch_active_shipment") fetchActiveShipment: Boolean?, @Query("exclude_locked_shipments") excludeLockedShipments: Boolean?, @Query("payment_methods") paymentMethods: String?, @Query("channel_shipment_id") channelShipmentId: String?, @Query("channel_order_id") channelOrderId: String?, @Query("custom_meta") customMeta: String?, @Query("ordering_channel") orderingChannel: String?, @Query("company_affiliate_tag") companyAffiliateTag: String?)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipment-details")
    fun getShipmentById(@Path("company_id") companyId: String, @Query("channel_shipment_id") channelShipmentId: String?, @Query("shipment_id") shipmentId: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("request_by_ext") requestByExt: String?)
    : Deferred<Response<ShipmentInfoResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipments-invoice")
    fun getAssetByShipmentIds(@Path("company_id") companyId: String, @Query("shipment_ids") shipmentIds: String, @Query("invoice") invoice: Boolean?, @Query("expires_in") expiresIn: String?)
    : Deferred<Response<ResponseGetAssetShipment>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/order-details")
    fun getOrderById(@Path("company_id") companyId: String, @Query("order_id") orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/lane-config/")
    fun getLaneConfig(@Path("company_id") companyId: String, @Query("super_lane") superLane: String?, @Query("group_entity") groupEntity: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("payment_mode") paymentMode: String?, @Query("bag_status") bagStatus: String?)
    : Deferred<Response<LaneConfigResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/application/{application_id}/shipments/")
    fun getApplicationShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_id") searchId: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("customer_id") customerId: String?, @Query("is_priority_sort") isPrioritySort: Boolean?)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/orders-listing")
    fun getOrders(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("bag_status") bagStatus: String?, @Query("time_to_dispatch") timeToDispatch: String?, @Query("payment_methods") paymentMethods: String?, @Query("tags") tags: String?, @Query("search_value") searchValue: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channels") salesChannels: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_priority_sort") isPrioritySort: Boolean?, @Query("custom_meta") customMeta: String?)
    : Deferred<Response<OrderListingResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipment/metrics-count/")
    fun getMetricCount(@Path("company_id") companyId: String, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?)
    : Deferred<Response<MetricCountResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/application/{application_id}/order-details")
    fun getAppOrderShipmentDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("order_id") orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    fun trackShipmentPlatform(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("shipment_id") shipmentId: String)
    : Deferred<Response<PlatformShipmentTrack>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/filter-listing")
    fun getfilters(@Path("company_id") companyId: String, @Query("view") view: String, @Query("group_entity") groupEntity: String?)
    : Deferred<Response<FiltersResponse>>
    
    @POST ("/service/platform/orders/v1.0/company/{company_id}/reports/shipment")
    fun createShipmentReport(@Path("company_id") companyId: String, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?)
    : Deferred<Response<Success>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/reports/shipment-listing")
    fun getReportsShipmentListing(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<OmsReports>>
    
    @POST ("/service/platform/orders/v1.0/company/{company_id}/upsert/jiocode/article")
    fun upsertJioCode(@Path("company_id") companyId: String,@Body body: JioCodeUpsertPayload)
    : Deferred<Response<JioCodeUpsertResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bulk-action/invoice")
    fun getBulkInvoice(@Path("company_id") companyId: String, @Query("batch_id") batchId: String, @Query("doc_type") docType: String)
    : Deferred<Response<BulkInvoicingResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/invoice-label-external")
    fun getBulkInvoiceLabel(@Path("company_id") companyId: String, @Query("batch_id") batchId: String)
    : Deferred<Response<BulkInvoiceLabelResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/generate/file")
    fun getBulkShipmentExcelFile(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_id") searchId: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("customer_id") customerId: String?, @Query("is_priority_sort") isPrioritySort: Boolean?)
    : Deferred<Response<FileResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bulk-action/listing")
    fun getBulkList(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_id") searchId: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("customer_id") customerId: String?, @Query("is_priority_sort") isPrioritySort: Boolean?)
    : Deferred<Response<BulkListingResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bulk-action-failed-report/")
    fun getBulkActionFailedReport(@Path("company_id") companyId: String, @Query("batch_id") batchId: String, @Query("report_type") reportType: String?)
    : Deferred<Response<FileResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipments/{shipment_id}/bags/{bag_id}/state/{state}/reasons")
    fun getShipmentReasons(@Path("company_id") companyId: String, @Path("shipment_id") shipmentId: String, @Path("bag_id") bagId: String, @Path("state") state: String)
    : Deferred<Response<PlatformShipmentReasonsResponse>>
    
    @POST ("/service/platform/orders/v2.0/company/{company_id}/bulk-action/")
    fun bulkActionProcessXlsxFile(@Path("company_id") companyId: String,@Body body: BulkActionPayload)
    : Deferred<Response<BulkActionResponse>>
    
    @GET ("/service/platform/orders/v2.0/company/{company_id}/bulk-action/{batch_id}")
    fun bulkActionDetails(@Path("company_id") companyId: String, @Path("batch_id") batchId: String)
    : Deferred<Response<BulkActionDetailsResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bag-details/")
    fun getBagById(@Path("company_id") companyId: String, @Query("bag_id") bagId: String?, @Query("channel_bag_id") channelBagId: String?, @Query("channel_id") channelId: String?)
    : Deferred<Response<BagDetailsPlatformResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bags")
    fun getBags(@Path("company_id") companyId: String, @Query("bag_ids") bagIds: String?, @Query("shipment_ids") shipmentIds: String?, @Query("order_ids") orderIds: String?, @Query("channel_bag_ids") channelBagIds: String?, @Query("channel_shipment_ids") channelShipmentIds: String?, @Query("channel_order_ids") channelOrderIds: String?, @Query("channel_id") channelId: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetBagsPlatformResponse>>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/update-cache")
    fun invalidateShipmentCache(@Path("company_id") companyId: String,@Body body: InvalidateShipmentCachePayload)
    : Deferred<Response<InvalidateShipmentCacheResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/store/reassign-internal")
    fun reassignLocation(@Path("company_id") companyId: String,@Body body: StoreReassign)
    : Deferred<Response<StoreReassignResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/entity/lock-manager")
    fun updateShipmentLock(@Path("company_id") companyId: String,@Body body: UpdateShipmentLockPayload)
    : Deferred<Response<UpdateShipmentLockResponse>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/announcements")
    fun getAnnouncements(@Path("company_id") companyId: String, @Query("date") date: String?)
    : Deferred<Response<AnnouncementsResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/delight/update-address")
    fun updateAddress(@Query("shipment_id") shipmentId: String, @Query("name") name: String?, @Query("address") address: String?, @Query("address_type") addressType: String?, @Query("pincode") pincode: String?, @Query("phone") phone: String?, @Query("email") email: String?, @Query("landmark") landmark: String?, @Query("address_category") addressCategory: String, @Query("city") city: String?, @Query("state") state: String?, @Query("country") country: String?, @Path("company_id") companyId: String)
    : Deferred<Response<BaseResponse>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/click2call")
    fun click2Call(@Query("caller") caller: String, @Query("receiver") receiver: String, @Query("bag_id") bagId: String, @Query("calling_to") callingTo: String?, @Query("caller_id") callerId: String?, @Path("company_id") companyId: String)
    : Deferred<Response<Click2CallResponse>>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/status-internal")
    fun updateShipmentStatus(@Path("company_id") companyId: String,@Body body: UpdateShipmentStatusRequest)
    : Deferred<Response<UpdateShipmentStatusResponseBody>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/process-manifest")
    fun processManifest(@Path("company_id") companyId: String,@Body body: CreateOrderPayload)
    : Deferred<Response<CreateOrderResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/manifest/dispatch")
    fun dispatchManifest(@Path("company_id") companyId: String,@Body body: DispatchManifest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/roles")
    fun getRoleBasedActions(@Path("company_id") companyId: String)
    : Deferred<Response<GetActionsResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    fun postShipmentHistory(@Path("company_id") companyId: String,@Body body: PostShipmentHistory)
    : Deferred<Response<ShipmentHistoryResponse>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    fun getShipmentHistory(@Path("company_id") companyId: String, @Query("shipment_id") shipmentId: Int?, @Query("bag_id") bagId: Int?)
    : Deferred<Response<ShipmentHistoryResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/send-sms")
    fun sendSmsNinja(@Path("company_id") companyId: String,@Body body: SendSmsPayload)
    : Deferred<Response<OrderStatusResult>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/oms/manual-place-shipment")
    fun platformManualAssignDPToShipment(@Path("company_id") companyId: String,@Body body: ManualAssignDPToShipment)
    : Deferred<Response<ManualAssignDPToShipmentResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/update-packaging-dimension")
    fun updatePackagingDimensions(@Path("company_id") companyId: String,@Body body: CreateOrderPayload)
    : Deferred<Response<CreateOrderResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/create-order")
    fun createOrder(@Path("company_id") companyId: String,@Body body: CreateOrderAPI)
    : Deferred<Response<CreateOrderResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/order-config")
    fun createChannelConfig(@Path("company_id") companyId: String,@Body body: CreateChannelConfigData)
    : Deferred<Response<CreateChannelConfigResponse>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/order-config")
    fun getChannelConfig(@Path("company_id") companyId: String)
    : Deferred<Response<CreateChannelConfigData>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/manifest/uploadConsent")
    fun uploadConsent(@Path("company_id") companyId: String,@Body body: UploadConsent)
    : Deferred<Response<SuccessResponse>>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/validation")
    fun orderUpdate(@Path("company_id") companyId: String,@Body body: PlatformOrderUpdate)
    : Deferred<Response<ResponseDetail>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/debug/order_status")
    fun checkOrderStatus(@Path("company_id") companyId: String,@Body body: OrderStatus)
    : Deferred<Response<OrderStatusResult>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/bag/state/transition")
    fun sendSmsNinjaPlatform(@Path("company_id") companyId: String)
    : Deferred<Response<OrderStatusResult>>
    
}