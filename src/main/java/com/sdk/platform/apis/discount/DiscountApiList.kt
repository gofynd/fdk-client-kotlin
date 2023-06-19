package com.sdk.platform.apis.discount

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.discount.*

interface DiscountApiList {
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/")
    fun getDiscounts(@Path("company_id") companyId: String, @Query("view") view: String?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("archived") archived: Boolean?, @Query("month") month: Int?, @Query("year") year: Int?, @Query("type") type: String?, @Query("app_ids") appIds: ArrayList<String>?)
    : Deferred<Response<ListOrCalender>>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/job/")
    fun createDiscount(@Path("company_id") companyId: String,@Body body: CreateUpdateDiscount)
    : Deferred<Response<DiscountJob>>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    fun getDiscount(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<DiscountJob>>
    
    @PUT ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    fun updateDiscount(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: CreateUpdateDiscount)
    : Deferred<Response<DiscountJob>>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/items/")
    fun upsertDiscountItems(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: BulkDiscount)
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/validation/")
    fun validateDiscountFile(@Path("company_id") companyId: String, @Query("discount") discount: String?,@Body body: DiscountJob)
    : Deferred<Response<FileJobResponse>>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/{type}/download/")
    fun downloadDiscountFile(@Path("company_id") companyId: String, @Path("type") type: String,@Body body: DownloadFileJob)
    : Deferred<Response<FileJobResponse>>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    fun getValidationJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<FileJobResponse>>
    
    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    fun cancelValidationJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<CancelJobResponse>>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    fun getDownloadJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<FileJobResponse>>
    
    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    fun cancelDownloadJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<CancelJobResponse>>
    
}