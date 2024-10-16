package com.sdk.platform.audittrail

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface AuditTrailApiList {
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/audit/logs/create")
    suspend fun createAuditLog(@Path("company_id") companyId: String,@Body body: RequestBodyAuditLog, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateLogResp>
    
}
