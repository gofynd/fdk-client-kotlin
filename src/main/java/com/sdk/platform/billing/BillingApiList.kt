package com.sdk.platform.billing

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface BillingApiList {
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    suspend fun getCustomerDetail(@Path("company_id") companyId: String)
    : Response<SubscriptionCustomer>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    suspend fun upsertCustomerDetail(@Path("company_id") companyId: String,@Body body: SubscriptionCustomerCreate)
    : Response<SubscriptionCustomer>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current")
    suspend fun getSubscription(@Path("company_id") companyId: String)
    : Response<SubscriptionStatus>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current-app-limit")
    suspend fun currentAppLimit(@Path("company_id") companyId: String, @Query("product_suite") productSuite: String?, @Query("type") type: String?)
    : Response<SubscriptionLimit>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current-limit")
    suspend fun getFeatureLimitConfig(@Path("company_id") companyId: String, @Query("product_suite") productSuite: String?, @Query("type") type: String?)
    : Response<SubscriptionLimit>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/list")
    suspend fun getInvoices(@Path("company_id") companyId: String)
    : Response<Invoices>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/global-settings")
    suspend fun globalSettings(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int, @Query("page_size") pageSize: Int, @Query("query") query: HashMap<String,Any>)
    : Response<GlobalSettings>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/coupon/check-validity")
    suspend fun checkCouponValidity(@Path("company_id") companyId: String, @Query("plan") plan: String, @Query("coupon_code") couponCode: String)
    : Response<CheckValidityResponse>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/payment-status")
    suspend fun paymentStatus(@Path("company_id") companyId: String, @Query("order_id") orderId: String)
    : Response<PaymentStatusResponse>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/credit-transaction")
    suspend fun creditTransaction(@Path("company_id") companyId: String, @Query("unique_id") uniqueId: Int, @Query("product_suite") productSuite: String, @Query("type") type: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("sort") sort: HashMap<String,Any>?, @Query("query") query: HashMap<String,Any>?)
    : Response<CreditTransactionResponse>
    
    @PUT ("/service/platform/billing/v1.0/company/{company_id}/subscription/consent")
    suspend fun updateConsent(@Path("company_id") companyId: String, @Query("subscriber_id") subscriberId: String)
    : Response<StatusMessage>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/plans")
    suspend fun getEnterprisePlans(@Path("company_id") companyId: String)
    : Response<ArrayList<Plan>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/configs")
    suspend fun subscriptionConfigs(@Path("company_id") companyId: String)
    : Response<ConfigRes>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/payment/bank/list")
    suspend fun getBankList(@Path("company_id") companyId: String)
    : Response<String>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/payment/transaction/{transaction_id}")
    suspend fun getPaymentTransaction(@Path("company_id") companyId: String, @Path("transaction_id") transactionId: String)
    : Response<PaymentTransactionDetails>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/payment/options")
    suspend fun getPaymentOptions(@Path("company_id") companyId: String, @Query("transaction_id") transactionId: String)
    : Response<GetPaymentOptions>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/payment/initiate")
    suspend fun paymentInitiate(@Path("company_id") companyId: String,@Body body: SunscribePlan)
    : Response<SubscribePlanRes>
    
    @PATCH ("/service/platform/billing/v1.0/company/{company_id}/plan/status")
    suspend fun planStatusUpdate(@Path("company_id") companyId: String,@Body body: PlanStatusUpdateReq)
    : Response<Plan>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/charge/{charge_id}")
    suspend fun getChargeDetails(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("charge_id") chargeId: String)
    : Response<ChargeDetails>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}")
    suspend fun getSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("subscription_id") subscriptionId: String)
    : Response<SubscriptionChargeRes>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}/cancel")
    suspend fun cancelSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("subscription_id") subscriptionId: String)
    : Response<SubscriptionChargeRes>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/methods")
    suspend fun upgradePlan(@Path("company_id") companyId: String,@Body body: SubscriptionMethodsReq)
    : Response<ResourceNotFound>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/methods")
    suspend fun subscriptionMethods(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String)
    : Response<SubscriptionMethods>
    
    @DELETE ("/service/platform/billing/v1.0/company/{company_id}/subscription/methods")
    suspend fun subscriptionMethodsDelete(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String, @Query("payment_method_id") paymentMethodId: String)
    : Response<ResourceNotFound>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/plan-change/downgrade")
    suspend fun planDowngradeGet(@Path("company_id") companyId: String)
    : Response<DowngradeRes>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/plan-change/downgrade")
    suspend fun planDowngrade(@Path("company_id") companyId: String,@Body body: DowngradePlanReq)
    : Response<PostDowngradeRes>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/plan-change")
    suspend fun subscriptionPlanChange(@Path("company_id") companyId: String, @Query("product_suite") productSuite: String?, @Query("coupon") coupon: String?, @Query("unique_id") uniqueId: Int?, @Query("platform") platform: String?, @Query("plan_id") planId: String?)
    : Response<PlanChangeDetails>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/plan-change")
    suspend fun changePlan(@Path("company_id") companyId: String,@Body body: SubscriptionActivateReq)
    : Response<SubscriptionActivateRes>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/activate")
    suspend fun activateSubscriptionPlan(@Path("company_id") companyId: String,@Body body: SubscriptionActivateReq)
    : Response<SubscriptionActivateRes>
    
    @PUT ("/service/platform/billing/v1.0/company/{company_id}/subscription/method/default")
    suspend fun methodDefault(@Path("company_id") companyId: String,@Body body: DefaultReq)
    : Response<Message>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/topup")
    suspend fun topupCredit(@Path("company_id") companyId: String,@Body body: TopupReq)
    : Response<TopupRes>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/topup/cancel")
    suspend fun topupCancelCredit(@Path("company_id") companyId: String,@Body body: CancelTopupReq)
    : Response<CancelTopupRes>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/setup/payment")
    suspend fun setupPayment(@Path("company_id") companyId: String,@Body body: SetupPaymentReq)
    : Response<SetupPayment>
    
    @PATCH ("/service/platform/billing/v1.0/company/{company_id}/subscription/setup/mandate")
    suspend fun setupMandate(@Path("company_id") companyId: String,@Body body: SetupMandateReq)
    : Response<Message>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/setup/intent")
    suspend fun setupIntent(@Path("company_id") companyId: String,@Body body: IntentReq)
    : Response<SetupIntentRes>
    
    @PUT ("/service/platform/billing/v1.0/company/{company_id}/subscription/setup/intent")
    suspend fun updateSetupIntent(@Path("company_id") companyId: String,@Body body: PutIntentReq)
    : Response<StatusMessage>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/renew")
    suspend fun subscriptionRenew(@Path("company_id") companyId: String,@Body body: SubscriptionRenewReq)
    : Response<SubscriptionRenewRes>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/payment/collect")
    suspend fun paymentCollect(@Path("company_id") companyId: String,@Body body: PaymentCollectReq)
    : Response<PaymentCollectRes>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/one_time_charge")
    suspend fun createOneTimeCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String,@Body body: CreateOneTimeCharge)
    : Response<CreateOneTimeChargeResponse>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/entity/detail")
    suspend fun getentityDetail(@Path("company_id") companyId: String, @Query("entity_name") entityName: String, @Query("entity_id") entityId: String?, @Query("channel") channel: String, @Query("component") component: String?, @Query("component_name") componentName: String?)
    : Response<ArrayList<EntityDetail>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/cancel")
    suspend fun cancelSubscriptionPlan(@Path("company_id") companyId: String,@Body body: CancelSubscriptionReq)
    : Response<CancelSubscriptionRes>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/payment-options")
    suspend fun paymentOptions(@Path("company_id") companyId: String, @Query("code") code: String)
    : Response<PaymentOptions>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/verify-payment")
    suspend fun verifyPayment(@Path("company_id") companyId: String,@Body body: VerifyPaymentReq)
    : Response<VerifyPaymentRes>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/{invoice_id}")
    suspend fun getInvoiceById(@Path("company_id") companyId: String, @Path("invoice_id") invoiceId: String)
    : Response<InvoiceData>
    
}