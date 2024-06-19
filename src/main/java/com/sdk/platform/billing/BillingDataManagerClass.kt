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
    
    
    suspend fun currentAppLimit(productSuite: String?=null, type: String?=null)
    : Response<SubscriptionLimit>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.currentAppLimit(
        companyId = config.companyId, productSuite = productSuite, type = type )
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
    
    
    suspend fun getInvoices()
    : Response<Invoices>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getInvoices(
        companyId = config.companyId )
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
    
    
    suspend fun checkCouponValidity(plan: String, couponCode: String)
    : Response<CheckValidityResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.checkCouponValidity(
        companyId = config.companyId, plan = plan, couponCode = couponCode )
        } else {
            null
        } 
    }
    
    
    suspend fun paymentStatus(orderId: String)
    : Response<PaymentStatusResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.paymentStatus(
        companyId = config.companyId, orderId = orderId )
        } else {
            null
        } 
    }
    
    
    suspend fun creditTransaction(uniqueId: Int, productSuite: String, type: String, pageSize: Int?=null, pageNo: Int?=null, startDate: String?=null, endDate: String?=null, searchType: String?=null, searchValue: String?=null)
    : Response<CreditTransactionResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.creditTransaction(
        companyId = config.companyId, uniqueId = uniqueId, productSuite = productSuite, type = type, pageSize = pageSize, pageNo = pageNo, startDate = startDate, endDate = endDate, searchType = searchType, searchValue = searchValue )
        } else {
            null
        } 
    }
    
    
    suspend fun updateConsent(subscriberId: String)
    : Response<StatusMessage>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.updateConsent(
        companyId = config.companyId, subscriberId = subscriberId )
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
    
    
    suspend fun subscriptionConfigs()
    : Response<ConfigRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionConfigs(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getBankList()
    : Response<String>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getBankList(
        companyId = config.companyId )
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
    
    
    suspend fun paymentInitiate(body: SunscribePlan)
    : Response<SubscribePlanRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.paymentInitiate(
        companyId = config.companyId, body = body)
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
    
    
    suspend fun getChargeDetails(extensionId: String, chargeId: String)
    : Response<ChargeDetails>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getChargeDetails(
        companyId = config.companyId, extensionId = extensionId, chargeId = chargeId )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionCharge(extensionId: String, subscriptionId: String)
    : Response<SubscriptionChargeRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getSubscriptionCharge(
        companyId = config.companyId, extensionId = extensionId, subscriptionId = subscriptionId )
        } else {
            null
        } 
    }
    
    
    suspend fun cancelSubscriptionCharge(extensionId: String, subscriptionId: String)
    : Response<SubscriptionChargeRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.cancelSubscriptionCharge(
        companyId = config.companyId, extensionId = extensionId, subscriptionId = subscriptionId )
        } else {
            null
        } 
    }
    
    
    suspend fun upgradePlan(body: SubscriptionMethodsReq)
    : Response<ResourceNotFound>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.upgradePlan(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun subscriptionMethods(uniqueExternalId: String)
    : Response<SubscriptionMethods>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionMethods(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId )
        } else {
            null
        } 
    }
    
    
    suspend fun subscriptionMethodsDelete(uniqueExternalId: String, paymentMethodId: String)
    : Response<ResourceNotFound>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionMethodsDelete(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId, paymentMethodId = paymentMethodId )
        } else {
            null
        } 
    }
    
    
    suspend fun planDowngradeGet()
    : Response<DowngradeRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.planDowngradeGet(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun planDowngrade(body: DowngradePlanReq)
    : Response<PostDowngradeRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.planDowngrade(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun subscriptionPlanChange(productSuite: String?=null, coupon: String?=null, uniqueId: Int?=null, platform: String?=null, planId: String?=null)
    : Response<PlanChangeDetails>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionPlanChange(
        companyId = config.companyId, productSuite = productSuite, coupon = coupon, uniqueId = uniqueId, platform = platform, planId = planId )
        } else {
            null
        } 
    }
    
    
    suspend fun changePlan(body: SubscriptionActivateReq)
    : Response<SubscriptionActivateRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.changePlan(
        companyId = config.companyId, body = body)
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
    
    
    suspend fun methodDefault(body: DefaultReq)
    : Response<Message>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.methodDefault(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun topupCredit(body: TopupReq)
    : Response<TopupRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.topupCredit(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun topupCancelCredit(body: CancelTopupReq)
    : Response<CancelTopupRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.topupCancelCredit(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun setupPayment(body: SetupPaymentReq)
    : Response<SetupPayment>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.setupPayment(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun setupMandate(body: SetupMandateReq)
    : Response<Message>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.setupMandate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun setupIntent(body: IntentReq)
    : Response<SetupIntentRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.setupIntent(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateSetupIntent(body: PutIntentReq)
    : Response<StatusMessage>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.updateSetupIntent(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun subscriptionRenew(body: SubscriptionRenewReq)
    : Response<SubscriptionRenewRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionRenew(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun paymentCollect(body: PaymentCollectReq)
    : Response<PaymentCollectRes>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.paymentCollect(
        companyId = config.companyId, body = body)
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
    
    
    suspend fun getentityDetail(entityName: String, entityId: String?=null, channel: String, component: String?=null, componentName: String?=null)
    : Response<ArrayList<EntityDetail>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getentityDetail(
        companyId = config.companyId, entityName = entityName, entityId = entityId, channel = channel, component = component, componentName = componentName )
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
    
    
    suspend fun getInvoiceById(invoiceId: String)
    : Response<InvoiceData>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getInvoiceById(
        companyId = config.companyId, invoiceId = invoiceId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}