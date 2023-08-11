package com.sdk.platform.inventory

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface InventoryApiList {
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    suspend fun getJobsByCompany(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<ResponseEnvelopeListJobConfigRawDTO>
    
    @PUT ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    suspend fun updateJob(@Path("company_id") companyId: String,@Body body: JobConfigDTO)
    : Response<ResponseEnvelopeString>
    
    @POST ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    suspend fun createJob(@Path("company_id") companyId: String,@Body body: JobConfigDTO)
    : Response<ResponseEnvelopeString>
    
    @POST ("/service/platform/inventory/v1.0/company/{company_id}/kafka/suppressStore")
    suspend fun suppressStores(@Path("company_id") companyId: String,@Body body: SuppressStorePayload)
    : Response<ResponseEnvelopeKafkaResponse>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/slingshot")
    suspend fun getConfigByCompany(@Path("company_id") companyId: String)
    : Response<ResponseEnvelopeListSlingshotConfigurationDetail>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/steps/{job_id}")
    suspend fun getJobSteps(@Path("company_id") companyId: String, @Path("job_id") jobId: String)
    : Response<ResponseEnvelopeListJobStepsDTO>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/integration/{integration_id}")
    suspend fun getJobByCompanyAndIntegration(@Path("company_id") companyId: String, @Path("integration_id") integrationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<ResponseEnvelopeListJobConfigDTO>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/disable/integration/{integration_id}")
    suspend fun disable(@Path("company_id") companyId: String, @Path("integration_id") integrationId: String)
    : Response<ResponseEnvelopeString>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/defaults")
    suspend fun getJobConfigDefaults(@Path("company_id") companyId: String)
    : Response<ResponseEnvelopeJobConfigDTO>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/{code}")
    suspend fun getJobByCode(@Path("company_id") companyId: String, @Path("code") code: String)
    : Response<ResponseEnvelopeJobConfigDTO>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/{code}/metrics")
    suspend fun getJobCodeMetrics(@Path("company_id") companyId: String, @Path("code") code: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("status") status: String?, @Query("date") date: String?)
    : Response<ResponseEnvelopeJobMetricsDto>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/integration/{integration_id}")
    suspend fun getJobCodesByCompanyAndIntegration(@Path("company_id") companyId: String, @Path("integration_id") integrationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<ResponseEnvelopeListJobConfigListDTO>
    
}