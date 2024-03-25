package com.sdk.platform.analytics

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface AnalyticsApiList {
    
    @POST ("/service/platform/insights/v2.0/company/{company_id}/application/{application_id}/provider/{provider}/job/execute")
    suspend fun executeJobForProvidedParametersV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("provider") provider: String, @Query("datasource") datasource: String, @Query("export_type") exportType: String,@Body body: JobExecute)
    : Response<HashMap<String,Any>>
    
    @POST ("/service/platform/insights/v2.0/company/{company_id}/application/{application_id}/provider/{provider}/job/download")
    suspend fun startDownloadForQueryV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("provider") provider: String, @Query("datasource") datasource: String, @Query("export_type") exportType: String,@Body body: JobExecute)
    : Response<String>
    
    @GET ("/service/platform/insights/v2.0/company/{company_id}/application/{application_id}/provider/{provider}/job/{file_name}/status")
    suspend fun checkJobStatusByNameV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("provider") provider: String, @Query("export_type") exportType: String, @Path("file_name") fileName: String)
    : Response<HashMap<String,Any>>
    
}