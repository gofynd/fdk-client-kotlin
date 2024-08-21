package com.sdk.platform.order

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface OrderApiList {
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/update-cache")
    suspend fun invalidateShipmentCache(@Path("company_id") companyId: String,@Body body: InvalidateShipmentCachePayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<InvalidateShipmentCacheResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/store/reassign-internal")
    suspend fun reassignLocation(@Path("company_id") companyId: String,@Body body: StoreReassign, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreReassignResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/entity/lock-manager")
    suspend fun updateShipmentLock(@Path("company_id") companyId: String,@Body body: UpdateShipmentLockPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateShipmentLockResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/announcements")
    suspend fun getAnnouncements(@Path("company_id") companyId: String, @Query("date") date: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AnnouncementsResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/delight/update-address")
    suspend fun updateAddress(@Query("shipment_id") shipmentId: String, @Query("name") name: String?, @Query("address") address: String?, @Query("address_type") addressType: String?, @Query("pincode") pincode: String?, @Query("phone") phone: String?, @Query("email") email: String?, @Query("landmark") landmark: String?, @Query("address_category") addressCategory: String, @Query("city") city: String?, @Query("state") state: String?, @Query("country") country: String?, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BaseResponse>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/status-internal")
    suspend fun updateShipmentStatus(@Path("company_id") companyId: String,@Body body: UpdateShipmentStatusRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateShipmentStatusResponseBody>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/roles")
    suspend fun getRoleBasedActions(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetActionsResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    suspend fun getShipmentHistory(@Path("company_id") companyId: String, @Query("shipment_id") shipmentId: String?, @Query("bag_id") bagId: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentHistoryResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    suspend fun postShipmentHistory(@Path("company_id") companyId: String,@Body body: PostShipmentHistory, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentHistoryResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/send-sms")
    suspend fun sendSmsNinja(@Path("company_id") companyId: String,@Body body: SendSmsPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderStatusResult>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/update-packaging-dimension")
    suspend fun updatePackagingDimensions(@Path("company_id") companyId: String,@Body body: UpdatePackagingDimensionsPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdatePackagingDimensionsResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/create-order")
    suspend fun createOrder(@Path("company_id") companyId: String,@Body body: CreateOrderAPI, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateOrderResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/order-config")
    suspend fun getChannelConfig(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateChannelConfigData>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/order-config")
    suspend fun createChannelConfig(@Path("company_id") companyId: String,@Body body: CreateChannelConfigData, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateChannelConfigResponse>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/validation")
    suspend fun orderUpdate(@Path("company_id") companyId: String,@Body body: PlatformOrderUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResponseDetail>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/debug/order_status")
    suspend fun checkOrderStatus(@Path("company_id") companyId: String,@Body body: OrderStatus, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderStatusResult>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/bag/state/transition")
    suspend fun getStateTransitionMap(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BagStateTransitionMap>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/allowed/state/transition")
    suspend fun getAllowedStateTransition(@Path("company_id") companyId: String, @Query("ordering_channel") orderingChannel: String, @Query("status") status: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RoleBaseStateTransitionMapping>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/customer-credit-balance")
    suspend fun fetchCreditBalanceDetail(@Path("company_id") companyId: String,@Body body: FetchCreditBalanceRequestPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<FetchCreditBalanceResponsePayload>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/refund-mode-config")
    suspend fun fetchRefundModeConfig(@Path("company_id") companyId: String,@Body body: RefundModeConfigRequestPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundModeConfigResponsePayload>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/user/attach")
    suspend fun attachOrderUser(@Path("company_id") companyId: String,@Body body: AttachOrderUser, @HeaderMap headers: Map<String, String>? = null)
    : Response<AttachOrderUserResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/user/send/otp/mobile")
    suspend fun sendUserMobileOTP(@Path("company_id") companyId: String,@Body body: SendUserMobileOTP, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendUserMobileOtpResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/user/verify/otp")
    suspend fun verifyMobileOTP(@Path("company_id") companyId: String,@Body body: VerifyMobileOTP, @HeaderMap headers: Map<String, String>? = null)
    : Response<VerifyOtpResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/reports/lanes/download")
    suspend fun downloadLanesReport(@Path("company_id") companyId: String,@Body body: BulkReportsDownloadRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkReportsDownloadResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/jobs/state-transition")
    suspend fun bulkStateTransistion(@Path("company_id") companyId: String,@Body body: BulkStateTransistionRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkStateTransistionResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/jobs")
    suspend fun bulkListing(@Path("company_id") companyId: String, @Query("page_size") pageSize: Int, @Query("page_no") pageNo: Int, @Query("start_date") startDate: String, @Query("end_date") endDate: String, @Query("status") status: String?, @Query("bulk_action_type") bulkActionType: String?, @Query("search_key") searchKey: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkListingResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/jobs/{batch_id}")
    suspend fun jobDetails(@Path("company_id") companyId: String, @Path("batch_id") batchId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<JobDetailsResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/jobs/{batch_id}/file")
    suspend fun getFileByStatus(@Path("company_id") companyId: String, @Path("batch_id") batchId: String, @Query("status") status: String, @Query("file_type") fileType: String, @Query("report_type") reportType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<JobFailedResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/manifest/shipments-listing")
    suspend fun getManifestShipments(@Path("company_id") companyId: String, @Query("dp_ids") dpIds: String, @Query("stores") stores: Int, @Query("to_date") toDate: String, @Query("from_date") fromDate: String, @Query("dp_name") dpName: String?, @Query("sales_channels") salesChannels: String?, @Query("search_type") searchType: String?, @Query("search_value") searchValue: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ManifestShipmentListing>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/manifests")
    suspend fun getManifests(@Path("company_id") companyId: String, @Query("status") status: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @Query("search_type") searchType: String?, @Query("store_id") storeId: Int?, @Query("search_value") searchValue: String?, @Query("dp_ids") dpIds: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ManifestList>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/manifests")
    suspend fun processManifests(@Path("company_id") companyId: String,@Body body: ProcessManifest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProcessManifestItemResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/manifests/{manifest_id}")
    suspend fun getManifestDetails(@Path("company_id") companyId: String, @Path("manifest_id") manifestId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ManifestDetails>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/manifest/dispatch")
    suspend fun dispatchManifests(@Path("company_id") companyId: String,@Body body: DispatchManifest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/manifest/{manifest_id}/upload-consent")
    suspend fun uploadConsents(@Path("company_id") companyId: String, @Path("manifest_id") manifestId: String,@Body body: UploadConsent, @HeaderMap headers: Map<String, String>? = null)
    : Response<SuccessResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/filter/listing")
    suspend fun getManifestfilters(@Path("company_id") companyId: String, @Query("view") view: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ManifestFiltersResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/einvoice/retry/irn")
    suspend fun eInvoiceRetry(@Path("company_id") companyId: String,@Body body: EInvoiceRetry, @HeaderMap headers: Map<String, String>? = null)
    : Response<EInvoiceRetryResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/tracking")
    suspend fun trackShipment(@Path("company_id") companyId: String, @Query("shipment_id") shipmentId: String?, @Query("awb") awb: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerTrackingResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/tracking")
    suspend fun updateShipmentTracking(@Path("company_id") companyId: String,@Body body: CourierPartnerTrackingDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<CourierPartnerTrackingDetails>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/orders/failed")
    suspend fun failedOrderLogs(@Path("company_id") companyId: String, @Query("application_id") applicationId: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search_type") searchType: String?, @Query("search_value") searchValue: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FailedOrderLogs>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/{invoice_type}/id/generate")
    suspend fun generateInvoiceID(@Path("company_id") companyId: String, @Path("invoice_type") invoiceType: String,@Body body: GenerateInvoiceIDRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<GenerateInvoiceIDResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/orders/failed/logs/{log_id}")
    suspend fun failedOrderLogDetails(@Path("company_id") companyId: String, @Path("log_id") logId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<FailedOrderLogDetails>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/process-manifest")
    suspend fun generateProcessManifest(@Path("company_id") companyId: String,@Body body: ProcessManifestRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ManifestResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/state/manager/config")
    suspend fun addStateManagerConfig(@Path("company_id") companyId: String,@Body body: TransitionConfigPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<ConfigUpdatedResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/state/manager/config")
    suspend fun getStateManagerConfig(@Path("company_id") companyId: String, @Query("app_id") appId: String?, @Query("ordering_channel") orderingChannel: String?, @Query("entity") entity: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/line_number/{line_number}/reasons")
    suspend fun getShipmentBagReasons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("shipment_id") shipmentId: String, @Path("line_number") lineNumber: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentBagReasons>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/shipments-listing")
    suspend fun getShipments(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("bag_status") bagStatus: String?, @Query("status_override_lane") statusOverrideLane: Boolean?, @Query("time_to_dispatch") timeToDispatch: Int?, @Query("search_type") searchType: String?, @Query("search_value") searchValue: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channels") salesChannels: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("fetch_active_shipment") fetchActiveShipment: Boolean?, @Query("allow_inactive") allowInactive: Boolean?, @Query("exclude_locked_shipments") excludeLockedShipments: Boolean?, @Query("payment_methods") paymentMethods: String?, @Query("channel_shipment_id") channelShipmentId: String?, @Query("channel_order_id") channelOrderId: String?, @Query("custom_meta") customMeta: String?, @Query("ordering_channel") orderingChannel: String?, @Query("company_affiliate_tag") companyAffiliateTag: String?, @Query("my_orders") myOrders: Boolean?, @Query("platform_user_id") platformUserId: String?, @Query("sort_type") sortType: String?, @Query("show_cross_company_data") showCrossCompanyData: Boolean?, @Query("tags") tags: String?, @Query("customer_id") customerId: String?, @Query("order_type") orderType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentInternalPlatformViewResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/shipment-details")
    suspend fun getShipmentById(@Path("company_id") companyId: String, @Query("channel_shipment_id") channelShipmentId: String?, @Query("shipment_id") shipmentId: String?, @Query("fetch_active_shipment") fetchActiveShipment: Boolean?, @Query("allow_inactive") allowInactive: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentInfoResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/order-details")
    suspend fun getOrderById(@Path("company_id") companyId: String, @Query("order_id") orderId: String, @Query("my_orders") myOrders: Boolean?, @Query("allow_inactive") allowInactive: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderDetailsResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/lane-config/")
    suspend fun getLaneConfig(@Path("company_id") companyId: String, @Query("super_lane") superLane: String?, @Query("group_entity") groupEntity: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channels") salesChannels: String?, @Query("payment_mode") paymentMode: String?, @Query("bag_status") bagStatus: String?, @Query("search_type") searchType: String?, @Query("search_value") searchValue: String?, @Query("tags") tags: String?, @Query("time_to_dispatch") timeToDispatch: Int?, @Query("payment_methods") paymentMethods: String?, @Query("my_orders") myOrders: Boolean?, @Query("show_cross_company_data") showCrossCompanyData: Boolean?, @Query("order_type") orderType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<LaneConfigResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders-listing")
    suspend fun getOrders(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("bag_status") bagStatus: String?, @Query("time_to_dispatch") timeToDispatch: Int?, @Query("payment_methods") paymentMethods: String?, @Query("tags") tags: String?, @Query("search_value") searchValue: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channels") salesChannels: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_priority_sort") isPrioritySort: Boolean?, @Query("custom_meta") customMeta: String?, @Query("my_orders") myOrders: Boolean?, @Query("show_cross_company_data") showCrossCompanyData: Boolean?, @Query("customer_id") customerId: String?, @Query("order_type") orderType: String?, @Query("allow_inactive") allowInactive: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderListingResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/shipments/")
    suspend fun getApplicationShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_id") searchId: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("customer_id") customerId: String?, @Query("is_priority_sort") isPrioritySort: Boolean?, @Query("exclude_locked_shipments") excludeLockedShipments: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentInternalPlatformViewResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    suspend fun trackShipmentPlatform(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("shipment_id") shipmentId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformShipmentTrack>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/filter-listing")
    suspend fun getfilters(@Path("company_id") companyId: String, @Query("view") view: String, @Query("group_entity") groupEntity: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FiltersResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/generate/file")
    suspend fun getBulkShipmentExcelFile(@Path("company_id") companyId: String, @Query("sales_channels") salesChannels: String?, @Query("dp_ids") dpIds: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @Query("stores") stores: String?, @Query("tags") tags: String?, @Query("bag_status") bagStatus: String?, @Query("payment_methods") paymentMethods: String?, @Query("file_type") fileType: String?, @Query("time_to_dispatch") timeToDispatch: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FileResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/bulk-action/get-seller-templates")
    suspend fun getBulkActionTemplate(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkActionTemplateResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/bulk-action/download-seller-templates")
    suspend fun downloadBulkActionTemplate(@Path("company_id") companyId: String, @Query("template_slug") templateSlug: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FileResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/shipments/{shipment_id}/bags/{bag_id}/state/{state}/reasons")
    suspend fun getShipmentReasons(@Path("company_id") companyId: String, @Path("shipment_id") shipmentId: String, @Path("bag_id") bagId: String, @Path("state") state: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformShipmentReasonsResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/reasons/{action}")
    suspend fun getPlatformShipmentReasons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("action") action: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentReasonsResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/bag-details/")
    suspend fun getBagById(@Path("company_id") companyId: String, @Query("bag_id") bagId: String?, @Query("channel_bag_id") channelBagId: String?, @Query("channel_id") channelId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BagDetailsPlatformResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/bags")
    suspend fun getBags(@Path("company_id") companyId: String, @Query("bag_ids") bagIds: String?, @Query("shipment_ids") shipmentIds: String?, @Query("order_ids") orderIds: String?, @Query("channel_bag_ids") channelBagIds: String?, @Query("channel_shipment_ids") channelShipmentIds: String?, @Query("channel_order_ids") channelOrderIds: String?, @Query("channel_id") channelId: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetBagsPlatformResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/{order_id}/generate/pos-receipt")
    suspend fun generatePOSReceiptByOrderId(@Path("company_id") companyId: String, @Path("order_id") orderId: String, @Query("shipment_id") shipmentId: String?, @Query("document_type") documentType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeneratePosOrderReceiptResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/jobs/templates")
    suspend fun getAllowedTemplatesForBulk(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AllowedTemplatesResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/jobs/templates/{template_name}")
    suspend fun getTemplate(@Path("company_id") companyId: String, @Path("template_name") templateName: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<TemplateDownloadResponse>
    
}
