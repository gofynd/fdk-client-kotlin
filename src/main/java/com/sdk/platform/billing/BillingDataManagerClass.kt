package com.sdk.platform.billing

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




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
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(BillingApiList::class.java) as? BillingApiList
    }
    
    
    suspend fun checkCouponValidity(plan: String, couponCode: String)
    : Response<CheckValidityResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.checkCouponValidity(
        companyId = config.companyId, plan = plan, couponCode = couponCode )
        } else {
            null
        } 
    }
    
    
    suspend fun createSubscriptionCharge(extensionId: String,body: CreateSubscriptionCharge)
    : Response<CreateSubscriptionResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.createSubscriptionCharge(
        companyId = config.companyId, extensionId = extensionId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionCharge(extensionId: String, subscriptionId: String)
    : Response<EntitySubscription>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getSubscriptionCharge(
        companyId = config.companyId, extensionId = extensionId, subscriptionId = subscriptionId )
        } else {
            null
        } 
    }
    
    
    suspend fun cancelSubscriptionCharge(extensionId: String, subscriptionId: String)
    : Response<EntitySubscription>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.cancelSubscriptionCharge(
        companyId = config.companyId, extensionId = extensionId, subscriptionId = subscriptionId )
        } else {
            null
        } 
    }
    
    
    suspend fun createOneTimeCharge(extensionId: String,body: CreateOneTimeCharge)
    : Response<CreateOneTimeChargeResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.createOneTimeCharge(
        companyId = config.companyId, extensionId = extensionId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getChargeDetails(extensionId: String, chargeId: String)
    : Response<OneTimeChargeEntity>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getChargeDetails(
        companyId = config.companyId, extensionId = extensionId, chargeId = chargeId )
        } else {
            null
        } 
    }
    
    
    suspend fun getInvoices()
    : Response<Invoices>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getInvoices(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getInvoiceById(invoiceId: String)
    : Response<Invoice>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getInvoiceById(
        companyId = config.companyId, invoiceId = invoiceId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCustomerDetail()
    : Response<SubscriptionCustomer>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getCustomerDetail(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun upsertCustomerDetail(body: SubscriptionCustomerCreate)
    : Response<SubscriptionCustomer>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.upsertCustomerDetail(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscription()
    : Response<SubscriptionStatus>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getSubscription(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getFeatureLimitConfig(productSuite: String?=null, type: String?=null)
    : Response<SubscriptionLimit>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getFeatureLimitConfig(
        companyId = config.companyId, productSuite = productSuite, type = type )
        } else {
            null
        } 
    }
    
    
    suspend fun activateSubscriptionPlan(body: SubscriptionActivateReq)
    : Response<SubscriptionActivateRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.activateSubscriptionPlan(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun cancelSubscriptionPlan(body: CancelSubscriptionReq)
    : Response<CancelSubscriptionRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.cancelSubscriptionPlan(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getEnterprisePlans()
    : Response<ArrayList<Plan>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getEnterprisePlans(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun planStatusUpdate(body: PlanStatusUpdateReq)
    : Response<Plan>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.planStatusUpdate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun subscripePlan(body: SunscribePlan)
    : Response<SubscribePlanRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscripePlan(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getentityDetail(entityName: String, entityId: String?=null, channel: String, component: String?=null, componentName: String?=null)
    : Response<EntityResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getentityDetail(
        companyId = config.companyId, entityName = entityName, entityId = entityId, channel = channel, component = component, componentName = componentName )
        } else {
            null
        } 
    }
    
    
    suspend fun paymentOptions(code: String)
    : Response<PaymentOptions>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.paymentOptions(
        companyId = config.companyId, code = code )
        } else {
            null
        } 
    }
    
    
    suspend fun verifyPayment(body: VerifyPaymentReq)
    : Response<VerifyPaymentRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.verifyPayment(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun globalSettings(pageNo: Int, pageSize: Int, query: HashMap<String,Any>)
    : Response<GlobalSettings>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.globalSettings(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, query = query )
        } else {
            null
        } 
    }
    
    
    suspend fun subscriptionMethods(uniqueExternalId: HashMap<String,Any>)
    : Response<SubscriptionMethods>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionMethods(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId )
        } else {
            null
        } 
    }
    
    
    suspend fun subscriptionConfigs()
    : Response<ConfigRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionConfigs(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun subscriptionPlanChange(productSuite: String?=null, uniqueId: Int?=null, platform: String?=null)
    : Response<PlanChangeDetails>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionPlanChange(
        companyId = config.companyId, productSuite = productSuite, uniqueId = uniqueId, platform = platform )
        } else {
            null
        } 
    }
    
    
    suspend fun getPaymentTransaction(transactionId: String)
    : Response<PaymentTransactionDetails>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getPaymentTransaction(
        companyId = config.companyId, transactionId = transactionId )
        } else {
            null
        } 
    }
    
    
    suspend fun getPaymentOptions(transactionId: String)
    : Response<GetPaymentOptions>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getPaymentOptions(
        companyId = config.companyId, transactionId = transactionId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}