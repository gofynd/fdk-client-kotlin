package com.sdk.platform.order

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class OrderDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val orderApiList by lazy {
        generateorderApiList()
    }

    private fun generateorderApiList(): OrderApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
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
            namespace = "PlatformOrder",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(OrderApiList::class.java) as? OrderApiList
    }
    
    
    suspend fun invalidateShipmentCache(body: InvalidateShipmentCachePayload, headers: Map<String, String> = emptyMap())
    : Response<InvalidateShipmentCacheResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.invalidateShipmentCache(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun reassignLocation(body: StoreReassign, headers: Map<String, String> = emptyMap())
    : Response<StoreReassignResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.reassignLocation(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateShipmentLock(body: UpdateShipmentLockPayload, headers: Map<String, String> = emptyMap())
    : Response<UpdateShipmentLockResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateShipmentLock(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAnnouncements(date: String?=null, headers: Map<String, String> = emptyMap())
    : Response<AnnouncementsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getAnnouncements(
        companyId = config.companyId,date = date, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateAddress(shipmentId: String,body: UpdateAddressRequestBody, headers: Map<String, String> = emptyMap())
    : Response<BaseResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateAddress(
        companyId = config.companyId,shipmentId = shipmentId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateShipmentStatus(body: UpdateShipmentStatusRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<UpdateShipmentStatusResponseBody>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateShipmentStatus(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getRoleBasedActions( headers: Map<String, String> = emptyMap())
    : Response<GetActionsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getRoleBasedActions(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getShipmentHistory(shipmentId: String?=null,bagId: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<ShipmentHistoryResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentHistory(
        companyId = config.companyId,shipmentId = shipmentId,bagId = bagId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun postShipmentHistory(body: PostShipmentHistory, headers: Map<String, String> = emptyMap())
    : Response<ShipmentHistoryResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.postShipmentHistory(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun sendSmsNinja(body: SendSmsPayload, headers: Map<String, String> = emptyMap())
    : Response<BaseResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.sendSmsNinja(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePackagingDimensions(body: UpdatePackagingDimensionsPayload, headers: Map<String, String> = emptyMap())
    : Response<UpdatePackagingDimensionsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updatePackagingDimensions(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createOrder(body: CreateOrderAPI, headers: Map<String, String> = emptyMap())
    : Response<CreateOrderResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.createOrder(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getChannelConfig( headers: Map<String, String> = emptyMap())
    : Response<CreateChannelConfigData>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getChannelConfig(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createChannelConfig(body: CreateChannelConfigData, headers: Map<String, String> = emptyMap())
    : Response<CreateChannelConfigResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.createChannelConfig(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun orderUpdate(body: PlatformOrderUpdate, headers: Map<String, String> = emptyMap())
    : Response<ResponseDetail>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.orderUpdate(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun checkOrderStatus(body: OrderStatus, headers: Map<String, String> = emptyMap())
    : Response<OrderStatusResult>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.checkOrderStatus(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getStateTransitionMap( headers: Map<String, String> = emptyMap())
    : Response<BagStateTransitionMap>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getStateTransitionMap(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAllowedStateTransition(orderingChannel: String,status: String, headers: Map<String, String> = emptyMap())
    : Response<RoleBaseStateTransitionMapping>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getAllowedStateTransition(
        companyId = config.companyId,orderingChannel = orderingChannel,status = status, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun fetchRefundModeConfig(body: RefundModeConfigRequestPayload, headers: Map<String, String> = emptyMap())
    : Response<RefundModeConfigResponsePayload>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.fetchRefundModeConfig(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun attachOrderUser(body: AttachOrderUser, headers: Map<String, String> = emptyMap())
    : Response<AttachOrderUserResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.attachOrderUser(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun sendUserMobileOTP(body: SendUserMobileOTP, headers: Map<String, String> = emptyMap())
    : Response<SendUserMobileOtpResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.sendUserMobileOTP(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun verifyMobileOTP(body: VerifyMobileOTP, headers: Map<String, String> = emptyMap())
    : Response<VerifyOtpResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.verifyMobileOTP(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun downloadLanesReport(body: BulkReportsDownloadRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<BulkReportsDownloadResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.downloadLanesReport(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun bulkStateTransistion(body: BulkStateTransistionRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<BulkStateTransistionResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.bulkStateTransistion(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun bulkListing(pageSize: Int,pageNo: Int,startDate: String,endDate: String,status: String?=null,bulkActionType: String?=null,searchKey: String?=null, headers: Map<String, String> = emptyMap())
    : Response<BulkListingResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.bulkListing(
        companyId = config.companyId,pageSize = pageSize,pageNo = pageNo,startDate = startDate,endDate = endDate,status = status,bulkActionType = bulkActionType,searchKey = searchKey, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun jobDetails(batchId: String, headers: Map<String, String> = emptyMap())
    : Response<JobDetailsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.jobDetails(
        companyId = config.companyId,batchId = batchId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getFileByStatus(batchId: String,status: String,fileType: String,reportType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<JobFailedResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getFileByStatus(
        companyId = config.companyId,batchId = batchId,status = status,fileType = fileType,reportType = reportType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getManifestShipments(dpIds: String,stores: Int,toDate: String,fromDate: String,dpName: String?=null,salesChannels: String?=null,searchType: String?=null,searchValue: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<ManifestShipmentListing>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getManifestShipments(
        companyId = config.companyId,dpIds = dpIds,stores = stores,toDate = toDate,fromDate = fromDate,dpName = dpName,salesChannels = salesChannels,searchType = searchType,searchValue = searchValue,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getManifests(status: String?=null,startDate: String?=null,endDate: String?=null,searchType: String?=null,storeId: Int?=null,searchValue: String?=null,dpIds: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<ManifestList>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getManifests(
        companyId = config.companyId,status = status,startDate = startDate,endDate = endDate,searchType = searchType,storeId = storeId,searchValue = searchValue,dpIds = dpIds,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun generateProcessManifest(body: ProcessManifestRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<ManifestResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.generateProcessManifest(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getManifestDetails(manifestId: String,dpIds: String?=null,endDate: String?=null,startDate: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<ManifestDetails>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getManifestDetails(
        companyId = config.companyId,manifestId = manifestId,dpIds = dpIds,endDate = endDate,startDate = startDate,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun dispatchManifests(body: DispatchManifest, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.dispatchManifests(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun uploadConsents(body: UploadManifestConsent, headers: Map<String, String> = emptyMap())
    : Response<SuccessResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.uploadConsents(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getManifestfilters(view: String, headers: Map<String, String> = emptyMap())
    : Response<ManifestFiltersResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getManifestfilters(
        companyId = config.companyId,view = view, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun eInvoiceRetry(body: EInvoiceRetry, headers: Map<String, String> = emptyMap())
    : Response<EInvoiceRetryResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.eInvoiceRetry(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun trackShipment(shipmentId: String?=null,awb: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerTrackingResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.trackShipment(
        companyId = config.companyId,shipmentId = shipmentId,awb = awb,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateShipmentTracking(body: CourierPartnerTrackingDetails, headers: Map<String, String> = emptyMap())
    : Response<CourierPartnerTrackingDetails>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateShipmentTracking(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun failedOrderLogs(applicationId: String?=null,pageNo: Int?=null,pageSize: Int?=null,searchType: String?=null,searchValue: String?=null, headers: Map<String, String> = emptyMap())
    : Response<FailedOrderLogs>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.failedOrderLogs(
        companyId = config.companyId,applicationId = applicationId,pageNo = pageNo,pageSize = pageSize,searchType = searchType,searchValue = searchValue, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun generateInvoiceID(invoiceType: String,body: GenerateInvoiceIDRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<GenerateInvoiceIDResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.generateInvoiceID(
        companyId = config.companyId,invoiceType = invoiceType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun failedOrderLogDetails(logId: String, headers: Map<String, String> = emptyMap())
    : Response<FailedOrderLogDetails>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.failedOrderLogDetails(
        companyId = config.companyId,logId = logId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addStateManagerConfig(body: TransitionConfigPayload, headers: Map<String, String> = emptyMap())
    : Response<ConfigUpdatedResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.addStateManagerConfig(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getStateManagerConfig(appId: String?=null,orderingChannel: String?=null,entity: String?=null, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getStateManagerConfig(
        companyId = config.companyId,appId = appId,orderingChannel = orderingChannel,entity = entity, headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun updatePaymentInfo(body: UpdateShipmentPaymentMode, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updatePaymentInfo(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun getShipments(lane: String?=null,bagStatus: String?=null,statusAssigned: String?=null,statusOverrideLane: Boolean?=null,timeToDispatch: Int?=null,searchType: String?=null,searchValue: String?=null,fromDate: String?=null,toDate: String?=null,startDate: String?=null,endDate: String?=null,statusAssignedStartDate: String?=null,statusAssignedEndDate: String?=null,dpIds: String?=null,stores: String?=null,salesChannels: String?=null,pageNo: Int?=null,pageSize: Int?=null,fetchActiveShipment: Boolean?=null,allowInactive: Boolean?=null,excludeLockedShipments: Boolean?=null,paymentMethods: String?=null,channelShipmentId: String?=null,channelOrderId: String?=null,customMeta: String?=null,orderingChannel: String?=null,companyAffiliateTag: String?=null,myOrders: Boolean?=null,platformUserId: String?=null,sortType: String?=null,showCrossCompanyData: Boolean?=null,tags: String?=null,customerId: String?=null,orderType: String?=null,groupEntity: String?=null,enforceDateFilter: Boolean?=null,fulfillmentType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ShipmentInternalPlatformViewResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipments(
        companyId = config.companyId,lane = lane,bagStatus = bagStatus,statusAssigned = statusAssigned,statusOverrideLane = statusOverrideLane,timeToDispatch = timeToDispatch,searchType = searchType,searchValue = searchValue,fromDate = fromDate,toDate = toDate,startDate = startDate,endDate = endDate,statusAssignedStartDate = statusAssignedStartDate,statusAssignedEndDate = statusAssignedEndDate,dpIds = dpIds,stores = stores,salesChannels = salesChannels,pageNo = pageNo,pageSize = pageSize,fetchActiveShipment = fetchActiveShipment,allowInactive = allowInactive,excludeLockedShipments = excludeLockedShipments,paymentMethods = paymentMethods,channelShipmentId = channelShipmentId,channelOrderId = channelOrderId,customMeta = customMeta,orderingChannel = orderingChannel,companyAffiliateTag = companyAffiliateTag,myOrders = myOrders,platformUserId = platformUserId,sortType = sortType,showCrossCompanyData = showCrossCompanyData,tags = tags,customerId = customerId,orderType = orderType,groupEntity = groupEntity,enforceDateFilter = enforceDateFilter,fulfillmentType = fulfillmentType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getShipmentById(channelShipmentId: String?=null,shipmentId: String?=null,fetchActiveShipment: Boolean?=null,allowInactive: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<ShipmentInfoResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentById(
        companyId = config.companyId,channelShipmentId = channelShipmentId,shipmentId = shipmentId,fetchActiveShipment = fetchActiveShipment,allowInactive = allowInactive, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOrderById(orderId: String,myOrders: Boolean?=null,allowInactive: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<OrderDetailsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrderById(
        companyId = config.companyId,orderId = orderId,myOrders = myOrders,allowInactive = allowInactive, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getLaneConfig(superLane: String?=null,groupEntity: String?=null,fromDate: String?=null,toDate: String?=null,startDate: String?=null,endDate: String?=null,dpIds: String?=null,stores: String?=null,salesChannels: String?=null,paymentMode: String?=null,bagStatus: String?=null,searchType: String?=null,searchValue: String?=null,tags: String?=null,timeToDispatch: Int?=null,paymentMethods: String?=null,myOrders: Boolean?=null,showCrossCompanyData: Boolean?=null,orderType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<LaneConfigResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getLaneConfig(
        companyId = config.companyId,superLane = superLane,groupEntity = groupEntity,fromDate = fromDate,toDate = toDate,startDate = startDate,endDate = endDate,dpIds = dpIds,stores = stores,salesChannels = salesChannels,paymentMode = paymentMode,bagStatus = bagStatus,searchType = searchType,searchValue = searchValue,tags = tags,timeToDispatch = timeToDispatch,paymentMethods = paymentMethods,myOrders = myOrders,showCrossCompanyData = showCrossCompanyData,orderType = orderType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOrders(lane: String?=null,searchType: String?=null,bagStatus: String?=null,timeToDispatch: Int?=null,paymentMethods: String?=null,tags: String?=null,searchValue: String?=null,fromDate: String?=null,toDate: String?=null,startDate: String?=null,endDate: String?=null,dpIds: String?=null,stores: String?=null,salesChannels: String?=null,pageNo: Int?=null,pageSize: Int?=null,isPrioritySort: Boolean?=null,customMeta: String?=null,myOrders: Boolean?=null,showCrossCompanyData: Boolean?=null,customerId: String?=null,orderType: String?=null,allowInactive: Boolean?=null,groupEntity: String?=null,enforceDateFilter: Boolean?=null,fulfillmentType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<OrderListingResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrders(
        companyId = config.companyId,lane = lane,searchType = searchType,bagStatus = bagStatus,timeToDispatch = timeToDispatch,paymentMethods = paymentMethods,tags = tags,searchValue = searchValue,fromDate = fromDate,toDate = toDate,startDate = startDate,endDate = endDate,dpIds = dpIds,stores = stores,salesChannels = salesChannels,pageNo = pageNo,pageSize = pageSize,isPrioritySort = isPrioritySort,customMeta = customMeta,myOrders = myOrders,showCrossCompanyData = showCrossCompanyData,customerId = customerId,orderType = orderType,allowInactive = allowInactive,groupEntity = groupEntity,enforceDateFilter = enforceDateFilter,fulfillmentType = fulfillmentType, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getfilters(view: String,groupEntity: String?=null, headers: Map<String, String> = emptyMap())
    : Response<FiltersResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getfilters(
        companyId = config.companyId,view = view,groupEntity = groupEntity, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBulkShipmentExcelFile(salesChannels: String?=null,dpIds: String?=null,startDate: String?=null,endDate: String?=null,stores: String?=null,tags: String?=null,bagStatus: String?=null,paymentMethods: String?=null,fileType: String?=null,timeToDispatch: Int?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<FileResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkShipmentExcelFile(
        companyId = config.companyId,salesChannels = salesChannels,dpIds = dpIds,startDate = startDate,endDate = endDate,stores = stores,tags = tags,bagStatus = bagStatus,paymentMethods = paymentMethods,fileType = fileType,timeToDispatch = timeToDispatch,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBulkActionTemplate( headers: Map<String, String> = emptyMap())
    : Response<BulkActionTemplateResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkActionTemplate(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun downloadBulkActionTemplate(templateSlug: String?=null, headers: Map<String, String> = emptyMap())
    : Response<FileResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.downloadBulkActionTemplate(
        companyId = config.companyId,templateSlug = templateSlug, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getShipmentReasons(shipmentId: String,bagId: String,state: String, headers: Map<String, String> = emptyMap())
    : Response<PlatformShipmentReasonsResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentReasons(
        companyId = config.companyId,shipmentId = shipmentId,bagId = bagId,state = state, headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun getBagById(bagId: String?=null,channelBagId: String?=null,channelId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<BagDetailsPlatformResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBagById(
        companyId = config.companyId,bagId = bagId,channelBagId = channelBagId,channelId = channelId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBags(bagIds: String?=null,shipmentIds: String?=null,orderIds: String?=null,channelBagIds: String?=null,channelShipmentIds: String?=null,channelOrderIds: String?=null,channelId: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<GetBagsPlatformResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBags(
        companyId = config.companyId,bagIds = bagIds,shipmentIds = shipmentIds,orderIds = orderIds,channelBagIds = channelBagIds,channelShipmentIds = channelShipmentIds,channelOrderIds = channelOrderIds,channelId = channelId,pageNo = pageNo,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun generatePOSReceiptByOrderId(orderId: String,shipmentId: String?=null,documentType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GeneratePosOrderReceiptResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.generatePOSReceiptByOrderId(
        companyId = config.companyId,orderId = orderId,shipmentId = shipmentId,documentType = documentType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAllowedTemplatesForBulk( headers: Map<String, String> = emptyMap())
    : Response<AllowedTemplatesResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getAllowedTemplatesForBulk(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getTemplate(templateName: String, headers: Map<String, String> = emptyMap())
    : Response<TemplateDownloadResponseSchema>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getTemplate(
        companyId = config.companyId,templateName = templateName, headers = headers)
        } else {
            null
        }
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getRules(body: RuleListRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<RuleListResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getRules(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun getShipmentBagReasons(shipmentId: String,lineNumber: String, headers: Map<String, String> = emptyMap())
    : Response<ShipmentBagReasons>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getShipmentBagReasons(companyId = config.companyId ,applicationId = applicationId ,shipmentId = shipmentId,lineNumber = lineNumber, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    suspend fun getApplicationShipments(lane: String?=null,searchType: String?=null,searchId: String?=null,fromDate: String?=null,toDate: String?=null,dpIds: String?=null,orderingCompanyId: String?=null,stores: String?=null,salesChannel: String?=null,requestByExt: String?=null,pageNo: Int?=null,pageSize: Int?=null,customerId: String?=null,isPrioritySort: Boolean?=null,excludeLockedShipments: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<ShipmentInternalPlatformViewResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getApplicationShipments(companyId = config.companyId ,applicationId = applicationId ,lane = lane,searchType = searchType,searchId = searchId,fromDate = fromDate,toDate = toDate,dpIds = dpIds,orderingCompanyId = orderingCompanyId,stores = stores,salesChannel = salesChannel,requestByExt = requestByExt,pageNo = pageNo,pageSize = pageSize,customerId = customerId,isPrioritySort = isPrioritySort,excludeLockedShipments = excludeLockedShipments, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun trackShipmentPlatform(shipmentId: String, headers: Map<String, String> = emptyMap())
    : Response<PlatformShipmentTrack>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackShipmentPlatform(companyId = config.companyId ,applicationId = applicationId ,shipmentId = shipmentId, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    suspend fun getPlatformShipmentReasons(action: String, headers: Map<String, String> = emptyMap())
    : Response<ShipmentReasonsResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getPlatformShipmentReasons(companyId = config.companyId ,applicationId = applicationId ,action = action, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
}
}