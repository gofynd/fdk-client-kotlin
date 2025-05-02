package com.sdk.platform.audittrail

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface AuditTrailApiList {
    
    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/logs")
    suspend fun getAuditLogs(@Path("company_id") companyId: String, @Query("qs") qs: String, @Query("limit") limit: Int?, @Query("sort") sort: HashMap<String,Any>?, @HeaderMap headers: Map<String, String>? = null)
    : Response<LogSchemaResponse>
    
    @POST ("/service/platform/audit-trail/v1.0/company/{company_id}/logs")
    suspend fun createAuditLog(@Path("company_id") companyId: String,@Body body: RequestBodyAuditLog, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateLogResponse>
    
    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/logs/{id}")
    suspend fun getAuditLog(@Path("company_id") companyId: String, @Path("id") id: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<LogSchemaResponse>
    
    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/entity-types")
    suspend fun getEntityTypes(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EntityTypesResponse>
    
}
