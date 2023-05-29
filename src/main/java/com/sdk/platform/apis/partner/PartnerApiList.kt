package com.sdk.platform.apis.partner

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.partner.*

interface PartnerApiList {
    
    @POST ("/service/platform/partners/v1.0/company/{company_id}/extension/{extension_id}/{entity}/{entity_id}/charge_consent")
    fun subscribeExtension(@Path("company_id") companyId: String, @Path("entity") entity: String, @Path("extension_id") extensionId: String, @Path("entity_id") entityId: String,@Body body: SubscriptionRequest)
    : Deferred<Response<SubscriptionRes>>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/extensions")
    fun getExtensionsForCompany(@Path("company_id") companyId: String, @Query("page_size") pageSize: Double?, @Query("tag") tag: String?, @Query("current_page") currentPage: String?, @Query("page_no") pageNo: Double?, @Query("filter_by") filterBy: String?)
    : Deferred<Response<ExtensionList>>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/public-extension/{extension_id}")
    fun getPublicExtension(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String)
    : Deferred<Response<PublicExtension>>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/extension/{extension_id}")
    fun getExtensionById(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String)
    : Deferred<Response<ExtensionCommon>>
    
    @DELETE ("/service/platform/partners/v1.0/company/{company_id}/extension/{extension_id}")
    fun deleteExtensionById(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Query("message") message: String, @Query("uninstall_reason_type") uninstallReasonType: String)
    : Deferred<Response<UninstallExtension>>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/private-extensions")
    fun getPrivateExtensions(@Path("company_id") companyId: String, @Query("page_size") pageSize: Double?, @Query("page_no") pageNo: Double?, @Query("query") query: String?)
    : Deferred<Response<ExtensionResponse>>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/extension/suggestions")
    fun getExtensionsSuggestions(@Path("company_id") companyId: String, @Query("page_size") pageSize: Double?)
    : Deferred<Response<ExtensionSuggestionList>>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/partner-request")
    fun getPartnerInvites(@Path("company_id") companyId: String, @Query("request_status") requestStatus: String?, @Query("page_size") pageSize: String?, @Query("page_no") pageNo: String?)
    : Deferred<Response<PartnerRequestList>>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/partner-request/{invite_id}")
    fun getPartnerRequestDetails(@Path("company_id") companyId: String, @Path("invite_id") inviteId: String)
    : Deferred<Response<PartnerInviteDetails>>
    
    @PUT ("/service/platform/partners/v1.0/company/{company_id}/partner-request/{invite_id}")
    fun modifyPartnerRequest(@Path("company_id") companyId: String, @Path("invite_id") inviteId: String,@Body body: ModifyPartnerReq)
    : Deferred<Response<PartnerInviteDetails>>
    
    @POST ("/service/platform/partners/v1.0/company/{company_id}/setup")
    fun setupProducts(@Path("company_id") companyId: String, @Query("request_id") requestId: String?)
    : Deferred<Response<SetupProductRes>>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}")
    fun getProxyPath(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("extension_id") extensionId: String?)
    : Deferred<Response<getProxyPathRes>>
    
    @POST ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}")
    fun addProxyPath(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("extension_id") extensionId: String,@Body body: AddProxyReq)
    : Deferred<Response<AddProxyResponse>>
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}/{attached_path}")
    fun getProxyPathAttachedPath(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("extension_id") extensionId: String?, @Path("attached_path") attachedPath: String?)
    : Deferred<Response<AddProxyResponse>>
    
    @DELETE ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}/{attached_path}")
    fun removeProxyPath(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("extension_id") extensionId: String, @Path("attached_path") attachedPath: String)
    : Deferred<Response<RemoveProxyResponse>>
    
}