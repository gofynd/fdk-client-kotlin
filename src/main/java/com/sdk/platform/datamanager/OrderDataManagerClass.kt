package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.order.*
import com.sdk.platform.apis.order.*




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
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(OrderApiList::class.java) as? OrderApiList
    }
    
    
    suspend fun getShipments(lane: String?=null, bagStatus: String?=null, statusOverrideLane: Boolean?=null, searchType: String?=null, searchValue: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannels: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, isPrioritySort: Boolean?=null, fetchActiveShipment: Boolean?=null, excludeLockedShipments: Boolean?=null, paymentMethods: String?=null, channelShipmentId: String?=null, channelOrderId: String?=null, customMeta: String?=null, orderingChannel: String?=null, companyAffiliateTag: String?=null)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipments(
        companyId = config.companyId, lane = lane, bagStatus = bagStatus, statusOverrideLane = statusOverrideLane, searchType = searchType, searchValue = searchValue, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannels = salesChannels, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, isPrioritySort = isPrioritySort, fetchActiveShipment = fetchActiveShipment, excludeLockedShipments = excludeLockedShipments, paymentMethods = paymentMethods, channelShipmentId = channelShipmentId, channelOrderId = channelOrderId, customMeta = customMeta, orderingChannel = orderingChannel, companyAffiliateTag = companyAffiliateTag )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentById(channelShipmentId: String?=null, shipmentId: String?=null, orderingCompanyId: String?=null, requestByExt: String?=null)
    : Deferred<Response<ShipmentInfoResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentById(
        companyId = config.companyId, channelShipmentId = channelShipmentId, shipmentId = shipmentId, orderingCompanyId = orderingCompanyId, requestByExt = requestByExt )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrderById(orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrderById(
        companyId = config.companyId, orderId = orderId )
        } else {
            null
        } 
    }
    
    
    suspend fun getLaneConfig(superLane: String?=null, groupEntity: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, stores: String?=null, salesChannel: String?=null, paymentMode: String?=null, bagStatus: String?=null)
    : Deferred<Response<LaneConfigResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getLaneConfig(
        companyId = config.companyId, superLane = superLane, groupEntity = groupEntity, fromDate = fromDate, toDate = toDate, dpIds = dpIds, stores = stores, salesChannel = salesChannel, paymentMode = paymentMode, bagStatus = bagStatus )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getOrders(lane: String?=null, searchType: String?=null, bagStatus: String?=null, timeToDispatch: String?=null, paymentMethods: String?=null, tags: String?=null, searchValue: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, stores: String?=null, salesChannels: String?=null, pageNo: Int?=null, pageSize: Int?=null, isPrioritySort: Boolean?=null, customMeta: String?=null)
    : Deferred<Response<OrderListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrders(
        companyId = config.companyId, lane = lane, searchType = searchType, bagStatus = bagStatus, timeToDispatch = timeToDispatch, paymentMethods = paymentMethods, tags = tags, searchValue = searchValue, fromDate = fromDate, toDate = toDate, dpIds = dpIds, stores = stores, salesChannels = salesChannels, pageNo = pageNo, pageSize = pageSize, isPrioritySort = isPrioritySort, customMeta = customMeta )
        } else {
            null
        } 
    }
    
    
    suspend fun getMetricCount(fromDate: String?=null, toDate: String?=null)
    : Deferred<Response<MetricCountResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getMetricCount(
        companyId = config.companyId, fromDate = fromDate, toDate = toDate )
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun getfilters(view: String, groupEntity: String?=null)
    : Deferred<Response<FiltersResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getfilters(
        companyId = config.companyId, view = view, groupEntity = groupEntity )
        } else {
            null
        } 
    }
    
    
    suspend fun createShipmentReport(fromDate: String?=null, toDate: String?=null)
    : Deferred<Response<Success>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.createShipmentReport(
        companyId = config.companyId, fromDate = fromDate, toDate = toDate )
        } else {
            null
        } 
    }
    
    
    suspend fun getReportsShipmentListing(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<OmsReports>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getReportsShipmentListing(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun upsertJioCode(body: JioCodeUpsertPayload)
    : Deferred<Response<JioCodeUpsertResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.upsertJioCode(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkInvoice(batchId: String, docType: String)
    : Deferred<Response<BulkInvoicingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkInvoice(
        companyId = config.companyId, batchId = batchId, docType = docType )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkInvoiceLabel(batchId: String)
    : Deferred<Response<BulkInvoiceLabelResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkInvoiceLabel(
        companyId = config.companyId, batchId = batchId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkShipmentExcelFile(lane: String?=null, searchType: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, customerId: String?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<FileResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkShipmentExcelFile(
        companyId = config.companyId, lane = lane, searchType = searchType, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, customerId = customerId, isPrioritySort = isPrioritySort )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkList(lane: String?=null, searchType: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, customerId: String?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<BulkListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkList(
        companyId = config.companyId, lane = lane, searchType = searchType, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, customerId = customerId, isPrioritySort = isPrioritySort )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkActionFailedReport(batchId: String, reportType: String?=null)
    : Deferred<Response<FileResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBulkActionFailedReport(
        companyId = config.companyId, batchId = batchId, reportType = reportType )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentReasons(shipmentId: String, bagId: String, state: String)
    : Deferred<Response<PlatformShipmentReasonsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getShipmentReasons(
        companyId = config.companyId, shipmentId = shipmentId, bagId = bagId, state = state )
        } else {
            null
        } 
    }
    
    
    suspend fun bulkActionProcessXlsxFile(body: BulkActionPayload)
    : Deferred<Response<BulkActionResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.bulkActionProcessXlsxFile(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun bulkActionDetails(batchId: String)
    : Deferred<Response<BulkActionDetailsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.bulkActionDetails(
        companyId = config.companyId, batchId = batchId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBagById(bagId: String?=null, channelBagId: String?=null, channelId: String?=null)
    : Deferred<Response<BagDetailsPlatformResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBagById(
        companyId = config.companyId, bagId = bagId, channelBagId = channelBagId, channelId = channelId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBags(bagIds: String?=null, shipmentIds: String?=null, orderIds: String?=null, channelBagIds: String?=null, channelShipmentIds: String?=null, channelOrderIds: String?=null, channelId: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<GetBagsPlatformResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getBags(
        companyId = config.companyId, bagIds = bagIds, shipmentIds = shipmentIds, orderIds = orderIds, channelBagIds = channelBagIds, channelShipmentIds = channelShipmentIds, channelOrderIds = channelOrderIds, channelId = channelId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    suspend fun getApplicationShipments(lane: String?=null, searchType: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, customerId: String?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getApplicationShipments(companyId = config.companyId , applicationId = applicationId , lane = lane, searchType = searchType, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, customerId = customerId, isPrioritySort = isPrioritySort )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getAppOrderShipmentDetails(orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.getAppOrderShipmentDetails(companyId = config.companyId , applicationId = applicationId , orderId = orderId )
        } else {
            null
        }
    }
    
    
    suspend fun trackPlatformShipment(shipmentId: String)
    : Deferred<Response<PlatformShipmentTrack>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackPlatformShipment(companyId = config.companyId , applicationId = applicationId , shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}