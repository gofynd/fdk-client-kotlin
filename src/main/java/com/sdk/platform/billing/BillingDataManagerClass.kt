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
    
    
    suspend fun getCustomerDetail( headers: Map<String, String> = emptyMap())
    : Response<SubscriptionCustomer>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getCustomerDetail(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun upsertCustomerDetail(body: SubscriptionCustomerCreate, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionCustomer>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.upsertCustomerDetail(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSubscription( headers: Map<String, String> = emptyMap())
    : Response<SubscriptionStatus>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getSubscription(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun currentAppLimit(productSuite: String?=null,type: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionLimit>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.currentAppLimit(
        companyId = config.companyId,productSuite = productSuite,type = type, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun currentLimit(productSuite: String?=null,type: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionLimit>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.currentLimit(
        companyId = config.companyId,productSuite = productSuite,type = type, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInvoices( headers: Map<String, String> = emptyMap())
    : Response<Invoices>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getInvoices(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun globalSettings(pageNo: Int,pageSize: Int,query: HashMap<String,Any>, headers: Map<String, String> = emptyMap())
    : Response<GlobalSettings>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.globalSettings(
        companyId = config.companyId,pageNo = pageNo,pageSize = pageSize,query = query, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun checkCouponValidity(plan: String,couponCode: String, headers: Map<String, String> = emptyMap())
    : Response<CheckValidityResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.checkCouponValidity(
        companyId = config.companyId,plan = plan,couponCode = couponCode, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun paymentStatus(orderId: String, headers: Map<String, String> = emptyMap())
    : Response<PaymentStatusResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.paymentStatus(
        companyId = config.companyId,orderId = orderId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun creditTransaction(uniqueId: Int,productSuite: String,type: String,pageSize: Int?=null,pageNo: Int?=null,startDate: String?=null,endDate: String?=null,searchType: String?=null,searchValue: String?=null, headers: Map<String, String> = emptyMap())
    : Response<CreditTransactionResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.creditTransaction(
        companyId = config.companyId,uniqueId = uniqueId,productSuite = productSuite,type = type,pageSize = pageSize,pageNo = pageNo,startDate = startDate,endDate = endDate,searchType = searchType,searchValue = searchValue, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateConsent(subscriberId: String, headers: Map<String, String> = emptyMap())
    : Response<StatusMessage>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.updateConsent(
        companyId = config.companyId,subscriberId = subscriberId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getEnterprisePlans( headers: Map<String, String> = emptyMap())
    : Response<ArrayList<Plan>>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getEnterprisePlans(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun subscriptionConfigs( headers: Map<String, String> = emptyMap())
    : Response<ConfigRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionConfigs(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getBankList( headers: Map<String, String> = emptyMap())
    : Response<String>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getBankList(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentTransaction(transactionId: String, headers: Map<String, String> = emptyMap())
    : Response<PaymentTransactionDetails>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getPaymentTransaction(
        companyId = config.companyId,transactionId = transactionId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentOptions(transactionId: String, headers: Map<String, String> = emptyMap())
    : Response<GetPaymentOptions>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getPaymentOptions(
        companyId = config.companyId,transactionId = transactionId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun paymentInitiate(body: SubscribePlan, headers: Map<String, String> = emptyMap())
    : Response<SubscribePlanRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.paymentInitiate(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun planStatusUpdate(body: PlanStatusUpdateReq, headers: Map<String, String> = emptyMap())
    : Response<Plan>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.planStatusUpdate(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getChargeDetails(extensionId: String,chargeId: String, headers: Map<String, String> = emptyMap())
    : Response<ChargeDetails>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getChargeDetails(
        companyId = config.companyId,extensionId = extensionId,chargeId = chargeId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSubscriptionCharge(extensionId: String,subscriptionId: String, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionChargeRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getSubscriptionCharge(
        companyId = config.companyId,extensionId = extensionId,subscriptionId = subscriptionId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun cancelSubscriptionCharge(extensionId: String,subscriptionId: String, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionChargeRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.cancelSubscriptionCharge(
        companyId = config.companyId,extensionId = extensionId,subscriptionId = subscriptionId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun upgradePlan(body: SubscriptionMethodsReq, headers: Map<String, String> = emptyMap())
    : Response<ResourceNotFound>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.upgradePlan(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun subscriptionMethods(uniqueExternalId: String, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionMethods>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionMethods(
        companyId = config.companyId,uniqueExternalId = uniqueExternalId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun subscriptionMethodsDelete(uniqueExternalId: String,paymentMethodId: String, headers: Map<String, String> = emptyMap())
    : Response<ResourceNotFound>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionMethodsDelete(
        companyId = config.companyId,uniqueExternalId = uniqueExternalId,paymentMethodId = paymentMethodId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun planDowngradeGet( headers: Map<String, String> = emptyMap())
    : Response<DowngradeRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.planDowngradeGet(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun planDowngrade(body: DowngradePlanReq, headers: Map<String, String> = emptyMap())
    : Response<PostDowngradeRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.planDowngrade(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun subscriptionPlanChange(productSuite: String?=null,coupon: String?=null,uniqueId: Int?=null,platform: String?=null,planId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PlanChangeDetails>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionPlanChange(
        companyId = config.companyId,productSuite = productSuite,coupon = coupon,uniqueId = uniqueId,platform = platform,planId = planId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun changePlan(body: SubscriptionActivateReq, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionActivateRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.changePlan(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun activateSubscriptionPlan(body: SubscriptionActivateReq, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionActivateRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.activateSubscriptionPlan(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun methodDefault(body: DefaultReq, headers: Map<String, String> = emptyMap())
    : Response<Message>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.methodDefault(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun topupCredit(body: TopupReq, headers: Map<String, String> = emptyMap())
    : Response<TopupRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.topupCredit(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun topupCancelCredit(body: CancelTopupReq, headers: Map<String, String> = emptyMap())
    : Response<CancelTopupRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.topupCancelCredit(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun setupPayment(body: SetupPaymentReq, headers: Map<String, String> = emptyMap())
    : Response<SetupPayment>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.setupPayment(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun setupMandate(body: SetupMandateReq, headers: Map<String, String> = emptyMap())
    : Response<Message>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.setupMandate(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun setupIntent(body: IntentReq, headers: Map<String, String> = emptyMap())
    : Response<SetupIntentRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.setupIntent(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateSetupIntent(body: PutIntentReq, headers: Map<String, String> = emptyMap())
    : Response<StatusMessage>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.updateSetupIntent(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun subscriptionRenew(body: SubscriptionRenewReq, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionRenewRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.subscriptionRenew(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun paymentCollect(body: PaymentCollectReq, headers: Map<String, String> = emptyMap())
    : Response<PaymentCollectRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.paymentCollect(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createOneTimeCharge(extensionId: String,body: CreateOneTimeCharge, headers: Map<String, String> = emptyMap())
    : Response<CreateOneTimeChargeResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.createOneTimeCharge(
        companyId = config.companyId,extensionId = extensionId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getentityDetail(entityName: String,entityId: String?=null,channel: String,component: String?=null,componentName: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ArrayList<EntityDetail>>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getentityDetail(
        companyId = config.companyId,entityName = entityName,entityId = entityId,channel = channel,component = component,componentName = componentName, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun cancelSubscriptionPlan(body: CancelSubscriptionReq, headers: Map<String, String> = emptyMap())
    : Response<CancelSubscriptionRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.cancelSubscriptionPlan(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun paymentOptions(code: String, headers: Map<String, String> = emptyMap())
    : Response<PaymentOptions>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.paymentOptions(
        companyId = config.companyId,code = code, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun verifyPayment(body: VerifyPaymentReq, headers: Map<String, String> = emptyMap())
    : Response<VerifyPaymentRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.verifyPayment(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getInvoiceById(invoiceId: String, headers: Map<String, String> = emptyMap())
    : Response<InvoiceData>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getInvoiceById(
        companyId = config.companyId,invoiceId = invoiceId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createSubscriptionCharge(extensionId: String,body: CreateSubscriptionCharge, headers: Map<String, String> = emptyMap())
    : Response<CreateSubscriptionResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.createSubscriptionCharge(
        companyId = config.companyId,extensionId = extensionId, body = body,headers = headers)
        } else {
            null
        }
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}