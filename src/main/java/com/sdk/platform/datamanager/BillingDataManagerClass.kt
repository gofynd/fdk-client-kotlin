package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.billing.*
import com.sdk.platform.apis.billing.*




class BillingDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val billingApiList by lazy {
        generatebillingApiList()
    }
    
    private fun generatebillingApiList(): BillingApiList? {
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
            namespace = "PlatformBilling",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey,
        )
        return retrofitHttpClient?.initializeRestClient(BillingApiList::class.java) as? BillingApiList
    }
    
    
    suspend fun checkCouponValidity(plan: String, couponCode: String)
    : Deferred<Response<CheckValidityResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.checkCouponValidity(
        companyId = config.companyId, plan = plan, couponCode = couponCode )
        } else {
            null
        } 
    }
    
    
    suspend fun createSubscriptionCharge(extensionId: String,body: CreateSubscriptionCharge)
    : Deferred<Response<CreateSubscriptionResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.createSubscriptionCharge(
        companyId = config.companyId, extensionId = extensionId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionCharge(extensionId: String, subscriptionId: String)
    : Deferred<Response<EntitySubscription>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getSubscriptionCharge(
        companyId = config.companyId, extensionId = extensionId, subscriptionId = subscriptionId )
        } else {
            null
        } 
    }
    
    
    suspend fun cancelSubscriptionCharge(extensionId: String, subscriptionId: String)
    : Deferred<Response<EntitySubscription>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.cancelSubscriptionCharge(
        companyId = config.companyId, extensionId = extensionId, subscriptionId = subscriptionId )
        } else {
            null
        } 
    }
    
    
    suspend fun createOneTimeCharge(extensionId: String,body: CreateOneTimeCharge)
    : Deferred<Response<CreateOneTimeChargeResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.createOneTimeCharge(
        companyId = config.companyId, extensionId = extensionId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getChargeDetails(extensionId: String, chargeId: String)
    : Deferred<Response<OneTimeChargeEntity>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getChargeDetails(
        companyId = config.companyId, extensionId = extensionId, chargeId = chargeId )
        } else {
            null
        } 
    }
    
    
    suspend fun getInvoices()
    : Deferred<Response<Invoices>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getInvoices(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getInvoiceById(invoiceId: String)
    : Deferred<Response<Invoice>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getInvoiceById(
        companyId = config.companyId, invoiceId = invoiceId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCustomerDetail()
    : Deferred<Response<SubscriptionCustomer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getCustomerDetail(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun upsertCustomerDetail(body: SubscriptionCustomerCreate)
    : Deferred<Response<SubscriptionCustomer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.upsertCustomerDetail(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscription()
    : Deferred<Response<SubscriptionStatus>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getSubscription(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getFeatureLimitConfig()
    : Deferred<Response<SubscriptionLimit>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getFeatureLimitConfig(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun activateSubscriptionPlan(body: SubscriptionActivateReq)
    : Deferred<Response<SubscriptionActivateRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.activateSubscriptionPlan(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun cancelSubscriptionPlan(body: CancelSubscriptionReq)
    : Deferred<Response<CancelSubscriptionRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.cancelSubscriptionPlan(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}