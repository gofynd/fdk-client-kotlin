package com.sdk.platform.partner

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface PartnerApiList {
    
    @POST ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}")
    suspend fun addProxyPath(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("extension_id") extensionId: String,@Body body: AddProxyReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<ExtensionProxyPathCreation>
    
    @DELETE ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}/{attached_path}")
    suspend fun removeProxyPath(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("extension_id") extensionId: String, @Path("attached_path") attachedPath: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ExtensionProxyPathDelete>
    
}
