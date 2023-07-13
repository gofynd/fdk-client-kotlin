package com.sdk.platform.apis.discount

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.discount.*

interface DiscountApiList {
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/")
    suspend fun getDiscounts(@Path("company_id") companyId: String, @Query("view") view: String?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("archived") archived: Boolean?, @Query("month") month: Int?, @Query("year") year: Int?, @Query("type") type: String?, @Query("app_ids") appIds: ArrayList<String>?)
    : Response<ListOrCalender>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/job/")
    suspend fun createDiscount(@Path("company_id") companyId: String,@Body body: CreateUpdateDiscount)
    : Response<DiscountJob>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    suspend fun getDiscount(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<DiscountJob>
    
    @PUT ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    suspend fun updateDiscount(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: CreateUpdateDiscount)
    : Response<DiscountJob>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/items/")
    suspend fun upsertDiscountItems(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: BulkDiscount)
    : Response<HashMap<String,Any>>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/validation/")
    suspend fun validateDiscountFile(@Path("company_id") companyId: String, @Query("discount") discount: String?,@Body body: FileJobRequest)
    : Response<FileJobResponse>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/{type}/download/")
    suspend fun downloadDiscountFile(@Path("company_id") companyId: String, @Path("type") type: String,@Body body: DownloadFileJob)
    : Response<FileJobResponse>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    suspend fun getValidationJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<FileJobResponse>
    
    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    suspend fun cancelValidationJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<CancelJobResponse>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    suspend fun getDownloadJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<FileJobResponse>
    
    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    suspend fun cancelDownloadJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Response<CancelJobResponse>
    
}