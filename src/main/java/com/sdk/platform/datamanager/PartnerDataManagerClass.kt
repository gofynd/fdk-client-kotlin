package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.partner.*
import com.sdk.platform.apis.partner.*




class PartnerDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val partnerApiList by lazy {
        generatepartnerApiList()
    }
    
    private fun generatepartnerApiList(): PartnerApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        if(unauthorizedAction != null){
            val accessUnauthorizedInterceptor = AccessUnauthorizedInterceptor(unauthorizedAction)
            interceptorList.add(accessUnauthorizedInterceptor)
        }
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformPartner",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey,
        )
        return retrofitHttpClient?.initializeRestClient(PartnerApiList::class.java) as? PartnerApiList
    }
    
    
    suspend fun subscribeExtension(entity: String, extensionId: String, entityId: String,body: SubscriptionRequest)
    : Deferred<Response<SubscriptionRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            partnerApiList?.subscribeExtension(
        companyId = config.companyId, entity = entity, extensionId = extensionId, entityId = entityId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getExtensionsForCompany(pageSize: Double?=null, tag: String?=null, currentPage: String?=null, pageNo: Double?=null, filterBy: String?=null)
    : Deferred<Response<ExtensionList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            partnerApiList?.getExtensionsForCompany(
        companyId = config.companyId, pageSize = pageSize, tag = tag, currentPage = currentPage, pageNo = pageNo, filterBy = filterBy )
        } else {
            null
        } 
    }
    
    
    suspend fun getPublicExtension(extensionId: String)
    : Deferred<Response<PublicExtension>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            partnerApiList?.getPublicExtension(
        companyId = config.companyId, extensionId = extensionId )
        } else {
            null
        } 
    }
    
    
    suspend fun getExtensionById(extensionId: String)
    : Deferred<Response<ExtensionCommon>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            partnerApiList?.getExtensionById(
        companyId = config.companyId, extensionId = extensionId )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteExtensionById(extensionId: String, message: String, uninstallReasonType: String)
    : Deferred<Response<UninstallExtension>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            partnerApiList?.deleteExtensionById(
        companyId = config.companyId, extensionId = extensionId, message = message, uninstallReasonType = uninstallReasonType )
        } else {
            null
        } 
    }
    
    
    suspend fun getPrivateExtensions(pageSize: Double?=null, pageNo: Double?=null, query: String?=null)
    : Deferred<Response<ExtensionResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            partnerApiList?.getPrivateExtensions(
        companyId = config.companyId, pageSize = pageSize, pageNo = pageNo, query = query )
        } else {
            null
        } 
    }
    
    
    suspend fun getExtensionsSuggestions(pageSize: Double?=null)
    : Deferred<Response<ExtensionSuggestionList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            partnerApiList?.getExtensionsSuggestions(
        companyId = config.companyId, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getPartnerInvites(requestStatus: String?=null, pageSize: String?=null, pageNo: String?=null)
    : Deferred<Response<PartnerRequestList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            partnerApiList?.getPartnerInvites(
        companyId = config.companyId, requestStatus = requestStatus, pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        } 
    }
    
    
    suspend fun getPartnerRequestDetails(inviteId: String)
    : Deferred<Response<PartnerInviteDetails>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            partnerApiList?.getPartnerRequestDetails(
        companyId = config.companyId, inviteId = inviteId )
        } else {
            null
        } 
    }
    
    
    suspend fun modifyPartnerRequest(inviteId: String,body: ModifyPartnerReq)
    : Deferred<Response<PartnerInviteDetails>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            partnerApiList?.modifyPartnerRequest(
        companyId = config.companyId, inviteId = inviteId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun setupProducts(requestId: String?=null)
    : Deferred<Response<SetupProductRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            partnerApiList?.setupProducts(
        companyId = config.companyId, requestId = requestId )
        } else {
            null
        } 
    }
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getProxyPath(extensionId: String?=null)
    : Deferred<Response<getProxyPathRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                partnerApiList?.getProxyPath(companyId = config.companyId , applicationId = applicationId , extensionId = extensionId )
        } else {
            null
        }
    }
    
    
    suspend fun addProxyPath(extensionId: String,body: AddProxyReq)
    : Deferred<Response<AddProxyResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                partnerApiList?.addProxyPath(companyId = config.companyId , applicationId = applicationId , extensionId = extensionId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getProxyPathAttachedPath(extensionId: String?=null, attachedPath: String?=null)
    : Deferred<Response<AddProxyResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                partnerApiList?.getProxyPathAttachedPath(companyId = config.companyId , applicationId = applicationId , extensionId = extensionId, attachedPath = attachedPath )
        } else {
            null
        }
    }
    
    
    suspend fun removeProxyPath(extensionId: String, attachedPath: String)
    : Deferred<Response<RemoveProxyResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                partnerApiList?.removeProxyPath(companyId = config.companyId , applicationId = applicationId , extensionId = extensionId, attachedPath = attachedPath )
        } else {
            null
        }
    }
    
}
}