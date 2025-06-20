package com.sdk.platform.filestorage

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface FileStorageApiList {
    
    @POST ("/service/platform/assets/v2.0/company/{company_id}/namespaces/{namespace}/upload/start")
    suspend fun startUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String,@Body body: FileUploadStart, @HeaderMap headers: Map<String, String>? = null)
    : Response<FileUpload>
    
    @POST ("/service/platform/assets/v2.0/company/{company_id}/namespaces/{namespace}/upload/complete")
    suspend fun completeUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String,@Body body: FileUpload, @HeaderMap headers: Map<String, String>? = null)
    : Response<FileUploadComplete>
    
    @POST ("/service/platform/assets/v2.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/start")
    suspend fun appStartUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: FileUploadStart, @HeaderMap headers: Map<String, String>? = null)
    : Response<FileUpload>
    
    @POST ("/service/platform/assets/v2.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/complete")
    suspend fun appCompleteUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: FileUpload, @HeaderMap headers: Map<String, String>? = null)
    : Response<FileUploadComplete>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/sign-urls")
    suspend fun getSignUrls(@Path("company_id") companyId: String,@Body body: SignUrl, @HeaderMap headers: Map<String, String>? = null)
    : Response<SignUrlResult>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/uploads/copy")
    suspend fun copyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String,@Body body: CopyFiles, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse")
    suspend fun browse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Query("page") page: Int?, @Query("limit") limit: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse")
    suspend fun appbrowse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page") page: Int?, @Query("limit") limit: Int?, @Query("search") search: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse")
    suspend fun browsefiles(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page") page: Int?, @Query("limit") limit: Int?, @Query("search") search: String?,@Body body: ExtensionSlug, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/proxy")
    suspend fun proxy(@Path("company_id") companyId: String, @Query("url") url: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProxyFileAccess>
    
}
