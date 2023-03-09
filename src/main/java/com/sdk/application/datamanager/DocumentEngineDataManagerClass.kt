package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import com.sdk.application.models.documentengine.*
import com.sdk.application.apis.documentengine.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class DocumentEngineDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val documentEngineApiList by lazy {
        generatedocumentEngineApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getInvoiceByShipmentId"] = "/service/application/document/v1.0/orders/shipments/{shipment_id}/invoice".substring(1)
            
                    _relativeUrls["getCreditNoteByShipmentId"] = "/service/application/document/v1.0/orders/shipments/{shipment_id}/credit-note".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generatedocumentEngineApiList(): DocumentEngineApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
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
            namespace = "ApplicationDocumentEngine",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(DocumentEngineApiList::class.java) as? DocumentEngineApiList
    }
    
    fun getInvoiceByShipmentId(shipmentId: String, parameters: invoiceParameter?=null): Deferred<Response<ResponseGetInvoiceShipment>>? {
        var fullUrl : String? = _relativeUrls["getInvoiceByShipmentId"] 
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return documentEngineApiList?.getInvoiceByShipmentId(fullUrl     ,  parameters = parameters)}

    
    
    fun getCreditNoteByShipmentId(shipmentId: String, parameters: creditNoteParameter?=null): Deferred<Response<ResponseGetInvoiceShipment>>? {
        var fullUrl : String? = _relativeUrls["getCreditNoteByShipmentId"] 
        
        fullUrl = fullUrl?.replace("{" + "shipment_id" +"}",shipmentId.toString())
        
        return documentEngineApiList?.getCreditNoteByShipmentId(fullUrl     ,  parameters = parameters)}

    
    
}
