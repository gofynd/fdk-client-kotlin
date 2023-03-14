package com.sdk.platform.apis.filestorage

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.filestorage.*

interface FileStorageApiList {
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/start/")
    fun startUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String,@Body body: StartRequest)
    : Deferred<Response<StartResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/complete/")
    fun completeUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String,@Body body: StartResponse)
    : Deferred<Response<CompleteResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/start/")
    fun appStartUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: StartRequest)
    : Deferred<Response<StartResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/complete/")
    fun appCompleteUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: StartResponse)
    : Deferred<Response<CompleteResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/sign-urls/")
    fun getSignUrls(@Path("company_id") companyId: String,@Body body: SignUrlRequest)
    : Deferred<Response<SignUrlResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/uploads/copy/")
    fun copyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String,@Body body: BulkRequest)
    : Deferred<Response<BulkUploadResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/uploads/copy/")
    fun appCopyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BulkRequest)
    : Deferred<Response<BulkUploadResponse>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse/")
    fun browse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Query("page_no") pageNo: Int?)
    : Deferred<Response<BrowseResponse>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse/")
    fun browse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?)
    : Deferred<Response<BrowseResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/proxy/")
    fun proxy(@Path("company_id") companyId: String, @Query("url") url: String)
    : Deferred<Response<ResponseBody>>
    
}