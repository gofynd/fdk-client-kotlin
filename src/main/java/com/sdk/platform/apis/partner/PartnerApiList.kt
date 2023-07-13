package com.sdk.platform.apis.partner

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.partner.*

interface PartnerApiList {
    
    @POST ("/service/platform/partners/v1.0/company/{company_id}/extension/{extension_id}/{entity}/{entity_id}/charge_consent")
    suspend fun subscribeExtension(@Path("company_id") companyId: String, @Path("entity") entity: String, @Path("extension_id") extensionId: String, @Path("entity_id") entityId: String,@Body body: SubscriptionRequest)
    : Response<SubscriptionRes>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/extensions")
    suspend fun getExtensionsForCompany(@Path("company_id") companyId: String, @Query("page_size") pageSize: Double?, @Query("tag") tag: String?, @Query("current_page") currentPage: String?, @Query("page_no") pageNo: Double?, @Query("filter_by") filterBy: String?, @Query("query") query: String?)
    : Response<ExtensionList>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/public-extension/{extension_id}")
    suspend fun getPublicExtension(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String)
    : Response<PublicExtension>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/extension/{extension_id}")
    suspend fun getExtensionById(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String)
    : Response<ExtensionCommon>
    
    @DELETE ("/service/platform/partners/v1.0/company/{company_id}/extension/{extension_id}")
    suspend fun deleteExtensionById(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Query("message") message: String, @Query("uninstall_reason_type") uninstallReasonType: String)
    : Response<UninstallExtension>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/private-extensions")
    suspend fun getPrivateExtensions(@Path("company_id") companyId: String, @Query("page_size") pageSize: Double?, @Query("page_no") pageNo: Double?, @Query("query") query: String?)
    : Response<ExtensionResponse>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/extension/suggestions")
    suspend fun getExtensionsSuggestions(@Path("company_id") companyId: String, @Query("page_size") pageSize: Double?)
    : Response<ExtensionSuggestionList>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/partner-request")
    suspend fun getPartnerInvites(@Path("company_id") companyId: String, @Query("request_status") requestStatus: String?, @Query("page_size") pageSize: String?, @Query("page_no") pageNo: String?)
    : Response<PartnerRequestList>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/partner-request/{invite_id}")
    suspend fun getPartnerRequestDetails(@Path("company_id") companyId: String, @Path("invite_id") inviteId: String)
    : Response<PartnerInviteDetails>
    
    @PUT ("/service/platform/partners/v1.0/company/{company_id}/partner-request/{invite_id}")
    suspend fun modifyPartnerRequest(@Path("company_id") companyId: String, @Path("invite_id") inviteId: String,@Body body: ModifyPartnerReq)
    : Response<PartnerInviteDetails>
    
    @POST ("/service/platform/partners/v1.0/company/{company_id}/setup")
    suspend fun setupProducts(@Path("company_id") companyId: String, @Query("request_id") requestId: String?)
    : Response<SetupProductRes>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}")
    suspend fun getProxyPath(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("extension_id") extensionId: String?)
    : Response<getProxyPathRes>
    
    @POST ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}")
    suspend fun addProxyPath(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("extension_id") extensionId: String,@Body body: AddProxyReq)
    : Response<AddProxyResponse>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}/{attached_path}")
    suspend fun getProxyPathAttachedPath(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("extension_id") extensionId: String?, @Path("attached_path") attachedPath: String?)
    : Response<AddProxyResponse>
    
    @DELETE ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}/{attached_path}")
    suspend fun removeProxyPath(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("extension_id") extensionId: String, @Path("attached_path") attachedPath: String)
    : Response<RemoveProxyResponse>
    
}