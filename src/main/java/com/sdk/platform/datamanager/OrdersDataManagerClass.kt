package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class OrdersDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val ordersApiList by lazy {
        generateordersApiList()
    }
    
    private fun generateordersApiList(): OrdersApiList? {
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
            namespace = "PlatformOrders",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(OrdersApiList::class.java) as? OrdersApiList
    }
    
    
    suspend fun getShipments(lane: String?=null, searchType: String?=null, searchValue: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, isPrioritySort: Boolean?=null, excludeLockedShipments: Boolean?=null, paymentMethods: String?=null, channelShipmentId: String?=null, channelOrderId: String?=null, customMeta: String?=null)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getShipments(
        companyId = config.companyId, lane = lane, searchType = searchType, searchValue = searchValue, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, isPrioritySort = isPrioritySort, excludeLockedShipments = excludeLockedShipments, paymentMethods = paymentMethods, channelShipmentId = channelShipmentId, channelOrderId = channelOrderId, customMeta = customMeta )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentById(channelShipmentId: String?=null, shipmentId: String?=null, orderingCompanyId: String?=null, requestByExt: String?=null)
    : Deferred<Response<ShipmentInfoResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getShipmentById(
        companyId = config.companyId, channelShipmentId = channelShipmentId, shipmentId = shipmentId, orderingCompanyId = orderingCompanyId, requestByExt = requestByExt )
        } else {
            null
        } 
    }
    
    
    suspend fun getOrderById(orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getOrderById(
        companyId = config.companyId, orderId = orderId )
        } else {
            null
        } 
    }
    
    
    suspend fun getLaneConfig(superLane: String?=null, groupEntity: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, stores: String?=null, salesChannel: String?=null, paymentMode: String?=null, bagStatus: String?=null)
    : Deferred<Response<LaneConfigResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getLaneConfig(
        companyId = config.companyId, superLane = superLane, groupEntity = groupEntity, fromDate = fromDate, toDate = toDate, dpIds = dpIds, stores = stores, salesChannel = salesChannel, paymentMode = paymentMode, bagStatus = bagStatus )
        } else {
            null
        } 
    }
    
    
    
    suspend fun getOrders(lane: String?=null, searchType: String?=null, searchValue: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, stores: String?=null, salesChannel: String?=null, pageNo: Int?=null, pageSize: Int?=null, isPrioritySort: Boolean?=null, customMeta: String?=null)
    : Deferred<Response<OrderListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getOrders(
        companyId = config.companyId, lane = lane, searchType = searchType, searchValue = searchValue, fromDate = fromDate, toDate = toDate, dpIds = dpIds, stores = stores, salesChannel = salesChannel, pageNo = pageNo, pageSize = pageSize, isPrioritySort = isPrioritySort, customMeta = customMeta )
        } else {
            null
        } 
    }
    
    
    suspend fun getMetricCount(fromDate: String?=null, toDate: String?=null)
    : Deferred<Response<MetricCountResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getMetricCount(
        companyId = config.companyId, fromDate = fromDate, toDate = toDate )
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun getfilters(view: String, groupEntity: String?=null)
    : Deferred<Response<FiltersResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getfilters(
        companyId = config.companyId, view = view, groupEntity = groupEntity )
        } else {
            null
        } 
    }
    
    
    suspend fun createShipmentReport(fromDate: String?=null, toDate: String?=null)
    : Deferred<Response<Success>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.createShipmentReport(
        companyId = config.companyId, fromDate = fromDate, toDate = toDate )
        } else {
            null
        } 
    }
    
    
    suspend fun getReportsShipmentListing(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<OmsReports>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getReportsShipmentListing(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun upsertJioCode(body: JioCodeUpsertPayload)
    : Deferred<Response<JioCodeUpsertResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.upsertJioCode(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkInvoice(batchId: String, docType: String)
    : Deferred<Response<BulkInvoicingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getBulkInvoice(
        companyId = config.companyId, batchId = batchId, docType = docType )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkInvoiceLabel(batchId: String)
    : Deferred<Response<BulkInvoiceLabelResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getBulkInvoiceLabel(
        companyId = config.companyId, batchId = batchId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkShipmentExcelFile(lane: String?=null, searchType: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, customerId: String?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<FileResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getBulkShipmentExcelFile(
        companyId = config.companyId, lane = lane, searchType = searchType, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, customerId = customerId, isPrioritySort = isPrioritySort )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkList(lane: String?=null, searchType: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, customerId: String?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<BulkListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getBulkList(
        companyId = config.companyId, lane = lane, searchType = searchType, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, customerId = customerId, isPrioritySort = isPrioritySort )
        } else {
            null
        } 
    }
    
    
    suspend fun getManifestList(status: String?=null, storeId: Int?=null, pageNo: Int?=null, pageSize: Int?=null, searchValue: String?=null, fromDate: String?=null, toDate: String?=null)
    : Deferred<Response<GeneratedManifestResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getManifestList(
        companyId = config.companyId, status = status, storeId = storeId, pageNo = pageNo, pageSize = pageSize, searchValue = searchValue, fromDate = fromDate, toDate = toDate )
        } else {
            null
        } 
    }
    
    
    suspend fun getManifestDetailsWithShipments(manifestId: String, fromDate: String?=null, toDate: String?=null, storeId: Int, page: Int?=null, pageSize: Int?=null, lane: String?=null, dpIds: Int?=null, searchType: String?=null, searchValue: String?=null)
    : Deferred<Response<ManifestDetailResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getManifestDetailsWithShipments(
        companyId = config.companyId, manifestId = manifestId, fromDate = fromDate, toDate = toDate, storeId = storeId, page = page, pageSize = pageSize, lane = lane, dpIds = dpIds, searchType = searchType, searchValue = searchValue )
        } else {
            null
        } 
    }
    
    
    suspend fun getBulkActionFailedReport(batchId: String, reportType: String?=null)
    : Deferred<Response<FileResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getBulkActionFailedReport(
        companyId = config.companyId, batchId = batchId, reportType = reportType )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentReasons(shipmentId: String, bagId: String, state: String)
    : Deferred<Response<PlatformShipmentReasonsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getShipmentReasons(
        companyId = config.companyId, shipmentId = shipmentId, bagId = bagId, state = state )
        } else {
            null
        } 
    }
    
    
    suspend fun bulkActionProcessXlsxFile(body: BulkActionPayload)
    : Deferred<Response<BulkActionResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.bulkActionProcessXlsxFile(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun bulkActionDetails(batchId: String)
    : Deferred<Response<BulkActionDetailsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.bulkActionDetails(
        companyId = config.companyId, batchId = batchId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBagById(bagId: String?=null, channelBagId: String?=null, channelId: String?=null)
    : Deferred<Response<BagDetailsPlatformResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getBagById(
        companyId = config.companyId, bagId = bagId, channelBagId = channelBagId, channelId = channelId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBags(bagIds: String?=null, shipmentIds: String?=null, orderIds: String?=null, channelBagIds: String?=null, channelShipmentIds: String?=null, channelOrderIds: String?=null, channelId: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<GetBagsPlatformResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getBags(
        companyId = config.companyId, bagIds = bagIds, shipmentIds = shipmentIds, orderIds = orderIds, channelBagIds = channelBagIds, channelShipmentIds = channelShipmentIds, channelOrderIds = channelOrderIds, channelId = channelId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    suspend fun getApplicationShipments(lane: String?=null, searchType: String?=null, searchId: String?=null, fromDate: String?=null, toDate: String?=null, dpIds: String?=null, orderingCompanyId: String?=null, stores: String?=null, salesChannel: String?=null, requestByExt: String?=null, pageNo: Int?=null, pageSize: Int?=null, customerId: String?=null, isPrioritySort: Boolean?=null)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                ordersApiList?.getApplicationShipments(companyId = config.companyId , applicationId = applicationId , lane = lane, searchType = searchType, searchId = searchId, fromDate = fromDate, toDate = toDate, dpIds = dpIds, orderingCompanyId = orderingCompanyId, stores = stores, salesChannel = salesChannel, requestByExt = requestByExt, pageNo = pageNo, pageSize = pageSize, customerId = customerId, isPrioritySort = isPrioritySort )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getAppOrderShipmentDetails(orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                ordersApiList?.getAppOrderShipmentDetails(companyId = config.companyId , applicationId = applicationId , orderId = orderId )
        } else {
            null
        }
    }
    
    
    suspend fun trackPlatformShipment(shipmentId: String)
    : Deferred<Response<PlatformShipmentTrack>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                ordersApiList?.trackPlatformShipment(companyId = config.companyId , applicationId = applicationId , shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}