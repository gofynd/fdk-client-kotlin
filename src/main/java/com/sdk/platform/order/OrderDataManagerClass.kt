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
    
    
    suspend fun invalidateShipmentCache(body: InvalidateShipmentCachePayload)
    : Response<InvalidateShipmentCacheResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.invalidateShipmentCache(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun reassignLocation(body: StoreReassign)
    : Response<StoreReassignResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.reassignLocation(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateShipmentLock(body: UpdateShipmentLockPayload)
    : Response<UpdateShipmentLockResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateShipmentLock(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getAnnouncements(date: String?=null)
    : Response<AnnouncementsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getAnnouncements(
        companyId = config.companyId, date = date )
        } else {
            null
        } 
    }
    
    
    suspend fun updateAddress(shipmentId: String, name: String?=null, address: String?=null, addressType: String?=null, pincode: String?=null, phone: String?=null, email: String?=null, landmark: String?=null, addressCategory: String, city: String?=null, state: String?=null, country: String?=null)
    : Response<BaseResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateAddress(
        shipmentId = shipmentId, name = name, address = address, addressType = addressType, pincode = pincode, phone = phone, email = email, landmark = landmark, addressCategory = addressCategory, city = city, state = state, country = country, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun click2Call(caller: String, receiver: String, bagId: String, callerId: String?=null, method: String?=null)
    : Response<Click2CallResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.click2Call(
        caller = caller, receiver = receiver, bagId = bagId, callerId = callerId, method = method, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun updateShipmentStatus(body: UpdateShipmentStatusRequest)
    : Response<UpdateShipmentStatusResponseBody>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateShipmentStatus(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun processManifest(body: CreateOrderPayload)
    : Response<CreateOrderResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.processManifest(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun dispatchManifest(body: DispatchManifest)
    : Response<SuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.dispatchManifest(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getRoleBasedActions()
    : Response<GetActionsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getRoleBasedActions(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentHistory(shipmentId: String?=null, bagId: Int?=null)
    : Response<ShipmentHistoryResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentHistory(
        companyId = config.companyId, shipmentId = shipmentId, bagId = bagId )
        } else {
            null
        } 
    }
    
    
    suspend fun postShipmentHistory(body: PostShipmentHistory)
    : Response<ShipmentHistoryResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.postShipmentHistory(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun sendSmsNinja(body: SendSmsPayload)
    : Response<OrderStatusResult>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.sendSmsNinja(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updatePackagingDimensions(body: UpdatePackagingDimensionsPayload)
    : Response<UpdatePackagingDimensionsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updatePackagingDimensions(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createOrder(body: CreateOrderAPI)
    : Response<CreateOrderResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.createOrder(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getChannelConfig()
    : Response<CreateChannelConfigData>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getChannelConfig(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun createChannelConfig(body: CreateChannelConfigData)
    : Response<CreateChannelConfigResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.createChannelConfig(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun uploadConsent(body: UploadConsent)
    : Response<SuccessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.uploadConsent(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun orderUpdate(body: PlatformOrderUpdate)
    : Response<ResponseDetail>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.orderUpdate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun checkOrderStatus(body: OrderStatus)
    : Response<OrderStatusResult>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.checkOrderStatus(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getStateTransitionMap()
    : Response<BagStateTransitionMap>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getStateTransitionMap(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getAllowedStateTransition(orderingChannel: String, status: String)
    : Response<RoleBaseStateTransitionMapping>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getAllowedStateTransition(
        companyId = config.companyId, orderingChannel = orderingChannel, status = status )
        } else {
            null
        } 
    }
    
    
    suspend fun fetchCreditBalanceDetail(body: FetchCreditBalanceRequestPayload)
    : Response<FetchCreditBalanceResponsePayload>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.fetchCreditBalanceDetail(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun fetchRefundModeConfig(body: RefundModeConfigRequestPayload)
    : Response<RefundModeConfigResponsePayload>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.fetchRefundModeConfig(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun attachOrderUser(body: AttachOrderUser)
    : Response<AttachOrderUserResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.attachOrderUser(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun sendUserMobileOTP(body: SendUserMobileOTP)
    : Response<SendUserMobileOtpResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.sendUserMobileOTP(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun verifyMobileOTP(body: VerifyMobileOTP)
    : Response<VerifyOtpResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.verifyMobileOTP(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun downloadLanesReport(body: BulkReportsDownloadRequest)
    : Response<BulkReportsDownloadResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.downloadLanesReport(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun eInvoiceRetry(body: EInvoiceRetry)
    : Response<EInvoiceRetryResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.eInvoiceRetry(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun trackShipment(shipmentId: String?=null, awb: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<CourierPartnerTrackingResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.trackShipment(
        companyId = config.companyId, shipmentId = shipmentId, awb = awb, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun updateShipmentTracking(body: CourierPartnerTrackingDetails)
    : Response<CourierPartnerTrackingDetails>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.updateShipmentTracking(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getShipments(lane: String?=null, bagStatus: String?=null, statusOverrideLane: Boolean?=null, timeToDispatch: Double?=null, searchType: String?=null, searchValue: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, stores: String?=null, salesChannels: String?=null, pageNo: Int?=null, pageSize: Int?=null, fetchActiveShipment: Boolean?=null, excludeLockedShipments: Boolean?=null, paymentMethods: String?=null, channelShipmentId: String?=null, channelOrderId: String?=null, customMeta: String?=null, orderingChannel: String?=null, companyAffiliateTag: String?=null, myOrders: Boolean?=null, platformUserId: String?=null, sortType: String?=null, showCrossCompanyData: Boolean?=null, tags: String?=null, customerId: String?=null, orderType: String?=null)
    : Response<ShipmentInternalPlatformViewResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipments(
        companyId = config.companyId, lane = lane, bagStatus = bagStatus, statusOverrideLane = statusOverrideLane, timeToDispatch = timeToDispatch, searchType = searchType, searchValue = searchValue, fromDate = fromDate, toDate = toDate, dpIds = dpIds, stores = stores, salesChannels = salesChannels, pageNo = pageNo, pageSize = pageSize, fetchActiveShipment = fetchActiveShipment, excludeLockedShipments = excludeLockedShipments, paymentMethods = paymentMethods, channelShipmentId = channelShipmentId, channelOrderId = channelOrderId, customMeta = customMeta, orderingChannel = orderingChannel, companyAffiliateTag = companyAffiliateTag, myOrders = myOrders, platformUserId = platformUserId, sortType = sortType, showCrossCompanyData = showCrossCompanyData, tags = tags, customerId = customerId, orderType = orderType )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentById(channelShipmentId: String?=null, shipmentId: String?=null)
    : Response<ShipmentInfoResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentById(
        companyId = config.companyId, channelShipmentId = channelShipmentId, shipmentId = shipmentId )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrderById(orderId: String)
    : Response<OrderDetailsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrderById(
        companyId = config.companyId, orderId = orderId )
        } else {
            null
        } 
    }
    
    
    suspend fun getLaneConfig(superLane: String?=null, groupEntity: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, stores: String?=null, salesChannels: String?=null, paymentMode: String?=null, bagStatus: String?=null, searchType: String?=null, searchValue: String?=null, tags: String?=null, timeToDispatch: String?=null, paymentMethods: String?=null, myOrders: Boolean?=null, showCrossCompanyData: Boolean?=null, orderType: String?=null)
    : Response<LaneConfigResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getLaneConfig(
        companyId = config.companyId, superLane = superLane, groupEntity = groupEntity, fromDate = fromDate, toDate = toDate, dpIds = dpIds, stores = stores, salesChannels = salesChannels, paymentMode = paymentMode, bagStatus = bagStatus, searchType = searchType, searchValue = searchValue, tags = tags, timeToDispatch = timeToDispatch, paymentMethods = paymentMethods, myOrders = myOrders, showCrossCompanyData = showCrossCompanyData, orderType = orderType )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrders(lane: String?=null, searchType: String?=null, bagStatus: String?=null, timeToDispatch: String?=null, paymentMethods: String?=null, tags: String?=null, searchValue: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, stores: String?=null, salesChannels: String?=null, pageNo: Int?=null, pageSize: Int?=null, isPrioritySort: Boolean?=null, customMeta: String?=null, myOrders: Boolean?=null, showCrossCompanyData: Boolean?=null, customerId: String?=null, orderType: String?=null)
    : Response<OrderListingResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrders(
        companyId = config.companyId, lane = lane, searchType = searchType, bagStatus = bagStatus, timeToDispatch = timeToDispatch, paymentMethods = paymentMethods, tags = tags, searchValue = searchValue, fromDate = fromDate, toDate = toDate, dpIds = dpIds, stores = stores, salesChannels = salesChannels, pageNo = pageNo, pageSize = pageSize, isPrioritySort = isPrioritySort, customMeta = customMeta, myOrders = myOrders, showCrossCompanyData = showCrossCompanyData, customerId = customerId, orderType = orderType )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getfilters(view: String, groupEntity: String?=null)
    : Response<FiltersResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getfilters(
        companyId = config.companyId, view = view, groupEntity = groupEntity )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkShipmentExcelFile(salesChannels: String?=null, dpIds: String?=null, fromDate: String?=null, toDate: String?=null, stores: String?=null, tags: String?=null, bagStatus: String?=null, paymentMethods: String?=null, fileType: String?=null, timeToDispatch: Int?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<FileResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkShipmentExcelFile(
        companyId = config.companyId, salesChannels = salesChannels, dpIds = dpIds, fromDate = fromDate, toDate = toDate, stores = stores, tags = tags, bagStatus = bagStatus, paymentMethods = paymentMethods, fileType = fileType, timeToDispatch = timeToDispatch, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkActionTemplate()
    : Response<BulkActionTemplateResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkActionTemplate(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun downloadBulkActionTemplate(templateSlug: String?=null)
    : Response<FileResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.downloadBulkActionTemplate(
        companyId = config.companyId, templateSlug = templateSlug )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentReasons(shipmentId: String, bagId: String, state: String)
    : Response<PlatformShipmentReasonsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentReasons(
        companyId = config.companyId, shipmentId = shipmentId, bagId = bagId, state = state )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getBagById(bagId: String?=null, channelBagId: String?=null, channelId: String?=null)
    : Response<BagDetailsPlatformResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBagById(
        companyId = config.companyId, bagId = bagId, channelBagId = channelBagId, channelId = channelId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBags(bagIds: String?=null, shipmentIds: String?=null, orderIds: String?=null, channelBagIds: String?=null, channelShipmentIds: String?=null, channelOrderIds: String?=null, channelId: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Response<GetBagsPlatformResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBags(
        companyId = config.companyId, bagIds = bagIds, shipmentIds = shipmentIds, orderIds = orderIds, channelBagIds = channelBagIds, channelShipmentIds = channelShipmentIds, channelOrderIds = channelOrderIds, channelId = channelId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun generatePOSReceiptByOrderId(orderId: String, shipmentId: String?=null, documentType: String?=null)
    : Response<GeneratePosOrderReceiptResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.generatePOSReceiptByOrderId(
        companyId = config.companyId, orderId = orderId, shipmentId = shipmentId, documentType = documentType )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun trackShipmentPlatform(shipmentId: String)
    : Response<PlatformShipmentTrack>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackShipmentPlatform(companyId = config.companyId , applicationId = applicationId , shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    suspend fun getPlatformShipmentReasons(action: String)
    : Response<ShipmentReasonsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getPlatformShipmentReasons(companyId = config.companyId , applicationId = applicationId , action = action )
        } else {
            null
        }
    }
    
    
    
    
}
}