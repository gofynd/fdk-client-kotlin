package com.sdk.platform.analytics

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface AnalyticsApiList {
    
    @POST ("/service/platform/insights/v2.0/company/{company_id}/application/{application_id}/job/execute")
    suspend fun executeJobForProvidedParametersV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: JobExecute, @HeaderMap headers: Map<String, String>? = null)
    : Response<JobExecutionResult>
    
    @POST ("/service/platform/insights/v2.0/company/{company_id}/application/{application_id}/job/download")
    suspend fun startDownloadForQueryV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("export_type") exportType: String,@Body body: FileDownloadRequestBody, @HeaderMap headers: Map<String, String>? = null)
    : Response<HashMap<String,Any>>
    
    @GET ("/service/platform/insights/v2.0/company/{company_id}/application/{application_id}/job/{file_name}/status")
    suspend fun checkJobStatusByNameV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("file_name") fileName: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<JobStatus>
    
}
