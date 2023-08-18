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
    : Response<BulkUploadSyncMode>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/uploads/copy")
    suspend fun appCopyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CopyFiles)
    : Response<BulkUploadSyncMode>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse")
    suspend fun browse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Query("page") page: Int?, @Query("limit") limit: Int?)
    : Response<BrowseResponse>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse")
    suspend fun appbrowse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page") page: Int?, @Query("limit") limit: Int?)
    : Response<BrowseResponse>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/proxy")
    suspend fun proxy(@Path("company_id") companyId: String, @Query("url") url: String)
    : Response<ResponseBody>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/types")
    suspend fun getPdfTypes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ArrayList<InvoiceTypesResponse>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/mapper")
    suspend fun getDefaultPdfData(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("pdf_type_id") pdfTypeId: Int)
    : Response<ArrayList<DummyTemplateDataItems>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config")
    suspend fun getDefaultHtmlTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("pdf_type_id") pdfTypeId: Int, @Query("format") format: String)
    : Response<ArrayList<PdfConfigSuccess>>
    
    @PUT ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config")
    suspend fun saveHtmlTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: pdfConfig)
    : Response<ArrayList<PdfConfigSaveSuccess>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/render")
    suspend fun previewTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: pdfRender)
    : Response<String>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/default-template")
    suspend fun getDefaultPdfTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("pdf_type_id") pdfTypeId: Int, @Query("format") format: String)
    : Response<ArrayList<PdfDefaultTemplateSuccess>>
    
}