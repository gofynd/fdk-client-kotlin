package com.sdk.platform.filestorage

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface FileStorageApiList {
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/start")
    suspend fun startUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String,@Body body: StartRequest)
    : Response<StartResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/complete")
    suspend fun completeUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String,@Body body: StartResponse)
    : Response<CompleteResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/start")
    suspend fun appStartUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: StartRequest)
    : Response<StartResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/complete")
    suspend fun appCompleteUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: StartResponse)
    : Response<CompleteResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/sign-urls")
    suspend fun getSignUrls(@Path("company_id") companyId: String,@Body body: SignUrlRequest)
    : Response<SignUrlResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/uploads/copy")
    suspend fun copyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String,@Body body: CopyFiles)
    : Response<HashMap<String,Any>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/uploads/copy")
    suspend fun appCopyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CopyFiles)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse")
    suspend fun browse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Query("page") page: Int?, @Query("limit") limit: Int?)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse")
    suspend fun appbrowse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page") page: Int?, @Query("limit") limit: Int?, @Query("search") search: String?)
    : Response<HashMap<String,Any>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse")
    suspend fun browsefiles(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page") page: Int?, @Query("limit") limit: Int?, @Query("search") search: String?,@Body body: ExtensionSlug)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/types")
    suspend fun getPdfTypes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("country_code") countryCode: String?, @Query("store_os") storeOs: Boolean)
    : Response<InvoiceTypesResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/types")
    suspend fun savePdfTypes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UpdatePdfTypeRequest)
    : Response<PdfTypeIdResponse>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/types/{id}")
    suspend fun fetchPdfTypeById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<PdfTypeIdResponse>
    
    @PUT ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/types/{id}")
    suspend fun updatePdfTypeById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdatePdfTypeRequest)
    : Response<PdfTypeIdResponse>
    
    @DELETE ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/types/{id}")
    suspend fun deletePdfType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/mapper")
    suspend fun getDefaultPdfData(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("pdf_type_id") pdfTypeId: Int, @Query("country_code") countryCode: String?)
    : Response<DummyTemplateDataItems>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/mapper")
    suspend fun savePdfPayloadData(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: savePdfPayload)
    : Response<DummyPayloadById>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/mapper/{id}")
    suspend fun getPdfPayloadById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<DummyPayloadById>
    
    @PUT ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/mapper/{id}")
    suspend fun updatePdfPayloadDataById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: DummyPayloadById)
    : Response<DummyPayloadById>
    
    @DELETE ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/mapper/{id}")
    suspend fun deletePdfPayloadById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<DummyPayloadById>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config/{id}")
    suspend fun getConfigHtmlTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<HashMap<String,Any>>
    
    @PUT ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config/{id}")
    suspend fun updateHtmlTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PdfConfig)
    : Response<PdfConfigSaveSuccess>
    
    @DELETE ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config/{id}")
    suspend fun deletePdfConfigTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config")
    suspend fun getDefaultHtmlTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("pdf_type_id") pdfTypeId: Int, @Query("format") format: String, @Query("country_code") countryCode: String?)
    : Response<PdfConfigSuccess>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config")
    suspend fun saveHtmlTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PdfConfig)
    : Response<PdfConfigSaveSuccess>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/default-template")
    suspend fun getDefaultPdfTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("pdf_type_id") pdfTypeId: Int, @Query("format") format: String, @Query("country_code") countryCode: String?)
    : Response<PdfDefaultTemplateSuccess>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/default-template")
    suspend fun createTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateTemplate)
    : Response<PdfTemplateCreateSuccess>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/payment-receipt")
    suspend fun generatePaymentReceipt(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentReceiptRequestBody)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/default-template/{id}")
    suspend fun fetchPdfDefaultTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<PdfDefaultTemplateResponse>
    
    @PUT ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/default-template/{id}")
    suspend fun updateTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateTemplate)
    : Response<PdfConfigurationResponse>
    
    @DELETE ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/default-template/{id}")
    suspend fun deletePdfTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/proxy")
    suspend fun proxy(@Path("company_id") companyId: String, @Query("url") url: String)
    : Response<ProxyResponse>
    
}