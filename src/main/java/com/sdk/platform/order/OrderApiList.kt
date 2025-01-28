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
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/refund/states/config")
    suspend fun postRefundStateConfiguration(@Path("company_id") companyId: String, @Query("app_id") appId: String,@Body body: PostRefundStateConfiguration, @HeaderMap headers: Map<String, String>? = null)
    : Response<PostRefundStateConfigurationResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/refund/states/config")
    suspend fun getRefundStateConfiguration(@Path("company_id") companyId: String, @Query("app_id") appId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetRefundStateConfigurationResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/refund/states")
    suspend fun getRefundEnableStateList(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetRefundStates>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/refund/config")
    suspend fun postRefundConfiguration(@Path("company_id") companyId: String, @Query("app_id") appId: String,@Body body: RefundStateConfigurationManualSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundStateConfigurationManualSchemaResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/refund/config")
    suspend fun getRefundConfiguration(@Path("company_id") companyId: String, @Query("app_id") appId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundStateConfigurationManualSchemaResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/store/reassign-internal")
    suspend fun reassignLocation(@Path("company_id") companyId: String,@Body body: StoreReassign, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreReassignResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/{shipment_id}/refund-options")
    suspend fun getRefundOptions(@Path("shipment_id") shipmentId: String, @Path("company_id") companyId: String, @Query("bag_ids") bagIds: String?, @Query("state") state: String?, @Query("optin_app_id") optinAppId: String?, @Query("optin_company_id") optinCompanyId: Int?, @Query("status") status: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundOptionsSchemaResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/announcements")
    suspend fun getAnnouncements(@Path("company_id") companyId: String, @Query("date") date: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AnnouncementsResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/click2call")
    suspend fun click2Call(@Query("caller") caller: String, @Query("receiver") receiver: String, @Query("bag_id") bagId: String, @Query("caller_id") callerId: String?, @Query("method") method: String?, @Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<Click2CallResponse>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/status-internal")
    suspend fun updateShipmentStatus(@Path("company_id") companyId: String,@Body body: UpdateShipmentStatusRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateShipmentStatusResponseBody>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    suspend fun getShipmentHistory(@Path("company_id") companyId: String, @Query("shipment_id") shipmentId: String?, @Query("bag_id") bagId: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentHistoryResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    suspend fun postShipmentHistory(@Path("company_id") companyId: String,@Body body: PostShipmentHistory, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentHistoryResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/send-sms")
    suspend fun sendSmsNinja(@Path("company_id") companyId: String,@Body body: SendSmsPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<SendSmsResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/update-packaging-dimension")
    suspend fun updatePackagingDimensions(@Path("company_id") companyId: String,@Body body: UpdatePackagingDimensionsPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdatePackagingDimensionsResponse>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/validation")
    suspend fun orderUpdate(@Path("company_id") companyId: String,@Body body: PlatformOrderUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResponseDetail>
    
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
    suspend fun bulkListing(@Path("company_id") companyId: String, @Query("page_size") pageSize: Int, @Query("page_no") pageNo: Int, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @Query("status") status: String?, @Query("bulk_action_type") bulkActionType: String?, @Query("search_key") searchKey: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkListingResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/jobs/{batch_id}")
    suspend fun jobDetails(@Path("company_id") companyId: String, @Path("batch_id") batchId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<JobDetailsResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/jobs/{batch_id}/file")
    suspend fun getFileByStatus(@Path("company_id") companyId: String, @Path("batch_id") batchId: String, @Query("status") status: String, @Query("file_type") fileType: String, @Query("report_type") reportType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<JobFailedResponse>
    
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
    suspend fun getFailedOrderLogs(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search_type") searchType: String?, @Query("search_value") searchValue: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FailedOrderLogs>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/orders/failed/logs/{log_id}")
    suspend fun failedOrderLogDetails(@Path("company_id") companyId: String, @Path("log_id") logId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<FailedOrderLogDetails>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/question")
    suspend fun getQuestions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("is_active") isActive: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule-lane-config")
    suspend fun getRuleLaneConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("search_value") searchValue: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<RuleLaneConfigResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule")
    suspend fun createRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RuleRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<RuleSuccessResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule/{rule_id}")
    suspend fun getRuleById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_id") ruleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RuleResponse>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule/{rule_id}")
    suspend fun updateRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_id") ruleId: String,@Body body: RuleUpdateRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<RuleSuccessResponse>
    
    @DELETE ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule/{rule_id}")
    suspend fun deleteRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("rule_id") ruleId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RuleSuccessResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule-position")
    suspend fun updateRulePosition(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UpdateRulePositionRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<RuleListResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule-parameters")
    suspend fun getRuleParameters(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RuleParametersResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule_list")
    suspend fun getRuleList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RuleListRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<RuleListResponse>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/roles")
    suspend fun getRoleBasedActions(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetActionsResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/debug/order_status")
    suspend fun checkOrderStatus(@Path("company_id") companyId: String,@Body body: OrderStatus, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderStatusResult>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/entity/lock-manager")
    suspend fun updateShipmentLock(@Path("company_id") companyId: String,@Body body: UpdateShipmentLockPayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateShipmentLockResponse>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/create-order")
    suspend fun createOrder(@Path("company_id") companyId: String,@Body body: CreateOrderAPI, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateOrderResponse>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/update")
    suspend fun updateShipment(@Path("company_id") companyId: String,@Body body: UpdateShipmentActionRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateShipmentStatusResponseBody>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/{order_id}")
    suspend fun updateOrder(@Path("company_id") companyId: String, @Path("order_id") orderId: String,@Body body: OrderUpdatePayload, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderUpdateResponseDetail>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/line_number/{line_number}/reasons")
    suspend fun getShipmentBagReasons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("shipment_id") shipmentId: String, @Path("line_number") lineNumber: String, @Query("bag_id") bagId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentBagReasons>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/shipments-listing")
    suspend fun getShipments(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("bag_status") bagStatus: String?, @Query("status_override_lane") statusOverrideLane: Boolean?, @Query("time_to_dispatch") timeToDispatch: Int?, @Query("search_type") searchType: String?, @Query("search_value") searchValue: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channels") salesChannels: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("fetch_active_shipment") fetchActiveShipment: Boolean?, @Query("allow_inactive") allowInactive: Boolean?, @Query("exclude_locked_shipments") excludeLockedShipments: Boolean?, @Query("payment_methods") paymentMethods: String?, @Query("channel_shipment_id") channelShipmentId: String?, @Query("channel_order_id") channelOrderId: String?, @Query("custom_meta") customMeta: String?, @Query("ordering_channel") orderingChannel: String?, @Query("company_affiliate_tag") companyAffiliateTag: String?, @Query("my_orders") myOrders: Boolean?, @Query("platform_user_id") platformUserId: String?, @Query("sort_type") sortType: String?, @Query("show_cross_company_data") showCrossCompanyData: Boolean?, @Query("tags") tags: String?, @Query("customer_id") customerId: String?, @Query("order_type") orderType: String?, @Query("operational_status") operationalStatus: String?, @Query("financial_status") financialStatus: String?, @Query("logistics_status") logisticsStatus: String?, @Query("parent_view_slug") parentViewSlug: String?, @Query("child_view_slug") childViewSlug: String?, @Query("lock_status") lockStatus: String?, @Query("group_entity") groupEntity: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentInternalPlatformViewResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/shipment-details")
    suspend fun getShipmentById(@Path("company_id") companyId: String, @Query("channel_shipment_id") channelShipmentId: String?, @Query("shipment_id") shipmentId: String?, @Query("fetch_active_shipment") fetchActiveShipment: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentInfoResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/order-details")
    suspend fun getOrderById(@Path("company_id") companyId: String, @Query("order_id") orderId: String, @Query("my_orders") myOrders: Boolean?, @Query("allow_inactive") allowInactive: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderDetailsResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/lane-config")
    suspend fun getLaneConfig(@Path("company_id") companyId: String, @Query("super_lane") superLane: String?, @Query("group_entity") groupEntity: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channels") salesChannels: String?, @Query("payment_mode") paymentMode: String?, @Query("bag_status") bagStatus: String?, @Query("search_type") searchType: String?, @Query("search_value") searchValue: String?, @Query("tags") tags: String?, @Query("time_to_dispatch") timeToDispatch: Int?, @Query("payment_methods") paymentMethods: String?, @Query("my_orders") myOrders: Boolean?, @Query("show_cross_company_data") showCrossCompanyData: Boolean?, @Query("order_type") orderType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<LaneConfigResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders-listing")
    suspend fun getOrders(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("bag_status") bagStatus: String?, @Query("time_to_dispatch") timeToDispatch: Int?, @Query("payment_methods") paymentMethods: String?, @Query("tags") tags: String?, @Query("search_value") searchValue: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channels") salesChannels: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_priority_sort") isPrioritySort: Boolean?, @Query("custom_meta") customMeta: ArrayList<HashMap<String,Any>>?, @Query("my_orders") myOrders: Boolean?, @Query("show_cross_company_data") showCrossCompanyData: Boolean?, @Query("customer_id") customerId: String?, @Query("order_type") orderType: String?, @Query("operational_status") operationalStatus: String?, @Query("financial_status") financialStatus: String?, @Query("logistics_status") logisticsStatus: String?, @Query("parent_view_slug") parentViewSlug: String?, @Query("child_view_slug") childViewSlug: String?, @Query("group_entity") groupEntity: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderListingResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/shipments")
    suspend fun getApplicationShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_id") searchId: String?, @Query("search_value") searchValue: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("customer_id") customerId: String?, @Query("is_priority_sort") isPrioritySort: Boolean?, @Query("exclude_locked_shipments") excludeLockedShipments: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentInternalPlatformViewResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    suspend fun trackShipmentPlatform(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("shipment_id") shipmentId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformShipmentTrack>
    
    @PUT ("/service/platform/order/v1.0/company/{company_id}/view/position")
    suspend fun updateUserViewPosition(@Path("company_id") companyId: String,@Body body: UserViewPosition, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateUpdateDeleteResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/views")
    suspend fun getUserViews(@Path("company_id") companyId: String, @Query("show_in") showIn: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<UserViewsResponse>
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/views")
    suspend fun addUserViews(@Path("company_id") companyId: String,@Body body: UserViewsResponse, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateUpdateDeleteResponse>
    
    @PUT ("/service/platform/order/v1.0/company/{company_id}/views")
    suspend fun updateUserViews(@Path("company_id") companyId: String,@Body body: UserViewsResponse, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateUpdateDeleteResponse>
    
    @DELETE ("/service/platform/order/v1.0/company/{company_id}/views")
    suspend fun deleteUserViews(@Path("company_id") companyId: String, @Query("view_id") viewId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateUpdateDeleteResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/filters")
    suspend fun getGlobalFilters(@Path("company_id") companyId: String, @Query("show_in") showIn: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GlobalFiltersResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/filter-listing")
    suspend fun getfilters(@Path("company_id") companyId: String, @Query("view") view: String, @Query("group_entity") groupEntity: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FiltersResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/generate/file")
    suspend fun getBulkShipmentExcelFile(@Path("company_id") companyId: String, @Query("sales_channels") salesChannels: String?, @Query("dp_ids") dpIds: String?, @Query("start_date") startDate: String?, @Query("end_date") endDate: String?, @Query("stores") stores: String?, @Query("tags") tags: String?, @Query("bag_status") bagStatus: String?, @Query("payment_methods") paymentMethods: String?, @Query("file_type") fileType: String?, @Query("time_to_dispatch") timeToDispatch: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<TemplateDownloadResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/bulk-action/get-seller-templates")
    suspend fun getBulkActionTemplate(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<BulkActionTemplateResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/bulk-action/download-seller-templates")
    suspend fun downloadBulkActionTemplate(@Path("company_id") companyId: String, @Query("template_slug") templateSlug: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<TemplateDownloadResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/shipments/{shipment_id}/bags/{bag_id}/state/{state}/reasons")
    suspend fun getShipmentReasons(@Path("company_id") companyId: String, @Path("shipment_id") shipmentId: String, @Path("bag_id") bagId: String, @Path("state") state: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformShipmentReasonsResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/reasons/{action}")
    suspend fun getPlatformShipmentReasons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("action") action: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentReasonsResponse>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/bag-details")
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
