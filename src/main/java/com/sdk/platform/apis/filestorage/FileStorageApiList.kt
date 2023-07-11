package com.sdk.platform.apis.filestorage

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.filestorage.*

interface FileStorageApiList {
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/start/")
    suspend fun startUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String,@Body body: StartRequest)
    : Response<StartResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/complete/")
    suspend fun completeUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String,@Body body: StartResponse)
    : Response<CompleteResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/start/")
    suspend fun appStartUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: StartRequest)
    : Response<StartResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/complete/")
    suspend fun appCompleteUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: StartResponse)
    : Response<CompleteResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/sign-urls/")
    suspend fun getSignUrls(@Path("company_id") companyId: String,@Body body: SignUrlRequest)
    : Response<SignUrlResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/uploads/copy/")
    suspend fun copyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String,@Body body: BulkRequest)
    : Response<BulkUploadResponse>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/uploads/copy/")
    suspend fun appCopyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BulkRequest)
    : Response<BulkUploadResponse>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse/")
    suspend fun browse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Query("page_no") pageNo: Int?)
    : Response<BrowseResponse>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse/")
    suspend fun appbrowse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?)
    : Response<BrowseResponse>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/proxy/")
    suspend fun proxy(@Path("company_id") companyId: String, @Query("url") url: String)
    : Response<ResponseBody>
    
}