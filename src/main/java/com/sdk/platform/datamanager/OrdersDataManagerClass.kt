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
    
    
    suspend fun getOrderShipmentDetails(shipmentId: String)
    : Deferred<Response<ShipmentDetailsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getOrderShipmentDetails(
        companyId = config.companyId, shipmentId = shipmentId )
        } else {
            null
        } 
    }
    
    
    suspend fun getShipmentDetails(orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            ordersApiList?.getShipmentDetails(
        companyId = config.companyId, orderId = orderId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
}
}