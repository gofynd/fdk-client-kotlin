package com.sdk.platform.apis.inventory

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.inventory.*

interface InventoryApiList {
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    fun getJobsByCompany(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ResponseEnvelopeListJobConfigRawDTO>>
    
    @PUT ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    fun updateJob(@Path("company_id") companyId: String,@Body body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>
    
    @POST ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    fun createJob(@Path("company_id") companyId: String,@Body body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/steps/{job_id}")
    fun getJobSteps(@Path("company_id") companyId: String, @Path("job_id") jobId: String)
    : Deferred<Response<ResponseEnvelopeListJobStepsDTO>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/integration/{integration_id}")
    fun getJobByCompanyAndIntegration(@Path("company_id") companyId: String, @Path("integration_id") integrationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ResponseEnvelopeListJobConfigDTO>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/disable/integration/{integration_id}")
    fun disable(@Path("company_id") companyId: String, @Path("integration_id") integrationId: String)
    : Deferred<Response<ResponseEnvelopeString>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/defaults")
    fun getJobConfigDefaults(@Path("company_id") companyId: String)
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/{code}")
    fun getJobByCode(@Path("company_id") companyId: String, @Path("code") code: String)
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/{code}/metrics")
    fun getJobCodeMetrics(@Path("company_id") companyId: String, @Path("code") code: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("status") status: String?, @Query("date") date: String?)
    : Deferred<Response<ResponseEnvelopeJobMetricsDto>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/integration/{integration_id}")
    fun getJobCodesByCompanyAndIntegration(@Path("company_id") companyId: String, @Path("integration_id") integrationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ResponseEnvelopeListJobConfigListDTO>>
    
}