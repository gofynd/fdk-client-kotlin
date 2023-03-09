package com.sdk.application.apis.documentengine

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.documentengine.*

interface DocumentEngineApiList {
    
    
    @GET 
    fun getInvoiceByShipmentId(@Url url1: String?     ,  @Query("parameters") parameters: invoiceParameter?)
    : Deferred<Response<ResponseGetInvoiceShipment>>
    
    
    @GET 
    fun getCreditNoteByShipmentId(@Url url1: String?     ,  @Query("parameters") parameters: creditNoteParameter?)
    : Deferred<Response<ResponseGetInvoiceShipment>>
    
}