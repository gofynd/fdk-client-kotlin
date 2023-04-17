package com.sdk.platform.apis.documentengine

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.documentengine.*

interface DocumentEngineApiList {
    
    @POST ("/service/platform/document/v1.0/company/{company_id}/generate-bulk-package-label")
    fun generateBulkPackageLabel(@Path("company_id") companyId: String,@Body body: GenerateBulkPackageLabel)
    : Deferred<Response<SuccessResponseGenerateBulk>>
    
    @POST ("/service/platform/document/v1.0/company/{company_id}/generate-bulk-box-label")
    fun generateBulkBoxLabel(@Path("company_id") companyId: String,@Body body: GenerateBulkBoxLabel)
    : Deferred<Response<SuccessResponseGenerateBulk>>
    
    @POST ("/service/platform/document/v1.0/company/{company_id}/generate-bulk-shipment-label")
    fun generateBulkShipmentLabel(@Path("company_id") companyId: String,@Body body: GenerateBulkShipmentLabel)
    : Deferred<Response<SuccessResponseGenerateBulk>>
    
    @POST ("/service/platform/document/v1.0/company/{company_id}/generate-noc")
    fun generateNoc(@Path("company_id") companyId: String,@Body body: GenerateNoc)
    : Deferred<Response<SuccessResponseGenerateBulk>>
    
    @GET ("/service/platform/document/v1.0/company/{company_id}/get-label-list")
    fun getLabelStatus(@Path("company_id") companyId: String, @Query("uid") uid: String)
    : Deferred<Response<StatusSuccessResponse>>
    
    @GET ("/service/platform/document/v1.0/company/{company_id}/get-noc-status")
    fun getNocStatus(@Path("company_id") companyId: String, @Query("uid") uid: String)
    : Deferred<Response<StatusSuccessResponse>>
    
    @POST ("/service/platform/document/v1.0/company/{company_id}/get-single-presigned-url")
    fun getPresignedURL(@Path("company_id") companyId: String,@Body body: InvoiceLabelPresignedRequestBody)
    : Deferred<Response<SignedSuccessResponse>>
    
    @GET ("/service/platform/document/v1.0/company/{company_id}/get-label-presigned-url")
    fun getLabelPresignedURL(@Path("company_id") companyId: String, @Query("uid") uid: String)
    : Deferred<Response<SignedSuccessResponse>>
    
    @GET ("/service/platform/document/v1.0/company/{company_id}/get-noc-presigned-url")
    fun getNocPresignedURL(@Path("company_id") companyId: String, @Query("uid") uid: String)
    : Deferred<Response<SignedSuccessResponse>>
    
}