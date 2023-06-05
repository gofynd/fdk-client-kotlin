package com.sdk.platform.apis.analytics

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.analytics.*

interface AnalyticsApiList {
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/group")
    fun getStatiscticsGroups(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<StatsGroups>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/group/{group_name}")
    fun getStatiscticsGroupComponents(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("group_name") groupName: String)
    : Deferred<Response<StatsGroupComponents>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}.csv")
    fun getComponentStatsCSV(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("component_name") componentName: String)
    : Deferred<Response<ResponseBody>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}.pdf")
    fun getComponentStatsPDF(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("component_name") componentName: String)
    : Deferred<Response<ResponseBody>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}")
    fun getComponentStats(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("component_name") componentName: String)
    : Deferred<Response<StatsRes>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/from/{from_date}/to/{to_date}/abandon-cart/")
    fun getAbandonCartList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("from_date") fromDate: String, @Path("to_date") toDate: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<AbandonCartsList>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/{from_date}/to/{to_date}/abandon-cart.csv")
    fun getAbandonCartsCSV(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("from_date") fromDate: String, @Path("to_date") toDate: String)
    : Deferred<Response<ResponseBody>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/abandon-cart/{cart_id}")
    fun getAbandonCartDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String)
    : Deferred<Response<AbandonCartDetail>>
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/export/{export_type}")
    fun createExportJob(@Path("company_id") companyId: String, @Path("export_type") exportType: String,@Body body: ExportJobReq)
    : Deferred<Response<ExportJobRes>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/export/{export_type}/job/{job_id}")
    fun getExportJobStatus(@Path("company_id") companyId: String, @Path("export_type") exportType: String, @Path("job_id") jobId: String)
    : Deferred<Response<ExportJobStatusRes>>
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/logs/{log_type}")
    fun getLogsList(@Path("company_id") companyId: String, @Path("log_type") logType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: GetLogsListReq)
    : Deferred<Response<GetLogsListRes>>
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/logs/{log_type}/search")
    fun searchLogs(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("log_type") logType: String,@Body body: SearchLogReq)
    : Deferred<Response<SearchLogRes>>
    
}