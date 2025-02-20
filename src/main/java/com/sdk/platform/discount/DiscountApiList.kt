package com.sdk.platform.discount

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface DiscountApiList {
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/")
    suspend fun getDiscounts(@Path("company_id") companyId: String, @Query("view") view: String?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("archived") archived: Boolean?, @Query("month") month: Int?, @Query("year") year: Int?, @Query("type") type: String?, @Query("app_ids") appIds: ArrayList<String>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ListOrCalender>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/job/")
    suspend fun createDiscount(@Path("company_id") companyId: String,@Body body: CreateUpdateDiscount, @HeaderMap headers: Map<String, String>? = null)
    : Response<DiscountJob>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    suspend fun getDiscount(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DiscountJob>
    
    @PUT ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    suspend fun updateDiscount(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: CreateUpdateDiscount, @HeaderMap headers: Map<String, String>? = null)
    : Response<DiscountJob>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/items/")
    suspend fun upsertDiscountItems(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: BulkDiscount, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/validation/")
    suspend fun validateDiscountFile(@Path("company_id") companyId: String, @Query("discount") discount: String?,@Body body: FileJobRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<FileJobResponseSchema>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/{type}/download/")
    suspend fun downloadDiscountFile(@Path("company_id") companyId: String, @Path("type") type: String,@Body body: DownloadFileJob, @HeaderMap headers: Map<String, String>? = null)
    : Response<FileJobResponseSchema>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    suspend fun getValidationJob(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<FileJobResponseSchema>
    
    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    suspend fun cancelValidationJob(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CancelJobResponseSchema>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    suspend fun getDownloadJob(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<FileJobResponseSchema>
    
    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    suspend fun cancelDownloadJob(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<CancelJobResponseSchema>
    
}
