package com.sdk.platform.apis.audittrail

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.audittrail.*

interface AuditTrailApiList {
    
    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/logs/")
    fun getAuditLogs(@Path("company_id") companyId: String, @Query("qs") qs: String)
    : Deferred<Response<LogSchemaResponse>>
    
    @POST ("/service/platform/audit-trail/v1.0/company/{company_id}/logs/")
    fun createAuditLog(@Path("company_id") companyId: String,@Body body: RequestBodyAuditLog)
    : Deferred<Response<CreateLogResponse>>
    
    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/logs/{id}")
    fun getAuditLog(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<LogSchemaResponse>>
    
    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/entity-types")
    fun getEntityTypes(@Path("company_id") companyId: String)
    : Deferred<Response<EntityTypesResponse>>
    
}