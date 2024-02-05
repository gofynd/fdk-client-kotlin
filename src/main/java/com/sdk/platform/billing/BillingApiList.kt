package com.sdk.platform.billing

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface BillingApiList {
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/coupon/check-validity")
    suspend fun checkCouponValidity(@Path("company_id") companyId: String, @Query("plan") plan: String, @Query("coupon_code") couponCode: String)
    : Response<CheckValidityResponse>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription")
    suspend fun createSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String,@Body body: CreateSubscriptionCharge)
    : Response<CreateSubscriptionResponse>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}")
    suspend fun getSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("subscription_id") subscriptionId: String)
    : Response<EntitySubscription>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}/cancel")
    suspend fun cancelSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("subscription_id") subscriptionId: String)
    : Response<EntitySubscription>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/one_time_charge")
    suspend fun createOneTimeCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String,@Body body: CreateOneTimeCharge)
    : Response<CreateOneTimeChargeResponse>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/charge/{charge_id}")
    suspend fun getChargeDetails(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("charge_id") chargeId: String)
    : Response<OneTimeChargeEntity>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/list")
    suspend fun getInvoices(@Path("company_id") companyId: String)
    : Response<Invoices>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/{invoice_id}")
    suspend fun getInvoiceById(@Path("company_id") companyId: String, @Path("invoice_id") invoiceId: String)
    : Response<Invoice>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    suspend fun getCustomerDetail(@Path("company_id") companyId: String)
    : Response<SubscriptionCustomer>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    suspend fun upsertCustomerDetail(@Path("company_id") companyId: String,@Body body: SubscriptionCustomerCreate)
    : Response<SubscriptionCustomer>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current")
    suspend fun getSubscription(@Path("company_id") companyId: String)
    : Response<SubscriptionStatus>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current-limit")
    suspend fun getFeatureLimitConfig(@Path("company_id") companyId: String, @Query("product_suite") productSuite: String?, @Query("type") type: String?)
    : Response<SubscriptionLimit>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/activate")
    suspend fun activateSubscriptionPlan(@Path("company_id") companyId: String,@Body body: SubscriptionActivateReq)
    : Response<SubscriptionActivateRes>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/cancel")
    suspend fun cancelSubscriptionPlan(@Path("company_id") companyId: String,@Body body: CancelSubscriptionReq)
    : Response<CancelSubscriptionRes>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/plans")
    suspend fun getEnterprisePlans(@Path("company_id") companyId: String)
    : Response<ArrayList<Plan>>
    
    @PATCH ("/service/platform/billing/v1.0/company/{company_id}/plan/status")
    suspend fun planStatusUpdate(@Path("company_id") companyId: String,@Body body: PlanStatusUpdateReq)
    : Response<Plan>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/payment/initiate")
    suspend fun subscripePlan(@Path("company_id") companyId: String,@Body body: SunscribePlan)
    : Response<SubscribePlanRes>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/entity/detail")
    suspend fun getentityDetail(@Path("company_id") companyId: String, @Query("entity_name") entityName: String, @Query("entity_id") entityId: String?, @Query("channel") channel: String, @Query("component") component: String?, @Query("component_name") componentName: String?)
    : Response<EntityResponse>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/payment-options")
    suspend fun paymentOptions(@Path("company_id") companyId: String, @Query("code") code: String)
    : Response<PaymentOptions>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/verify-payment")
    suspend fun verifyPayment(@Path("company_id") companyId: String,@Body body: VerifyPaymentReq)
    : Response<VerifyPaymentRes>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/global-settings")
    suspend fun globalSettings(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int, @Query("page_size") pageSize: Int, @Query("query") query: HashMap<String,Any>)
    : Response<GlobalSettings>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/methods")
    suspend fun subscriptionMethods(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: HashMap<String,Any>)
    : Response<SubscriptionMethods>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/configs")
    suspend fun subscriptionConfigs(@Path("company_id") companyId: String)
    : Response<ConfigRes>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/plan-change")
    suspend fun subscriptionPlanChange(@Path("company_id") companyId: String, @Query("product_suite") productSuite: String?, @Query("unique_id") uniqueId: Int?, @Query("platform") platform: String?)
    : Response<PlanChangeDetails>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/payment/transaction/{transactionId}")
    suspend fun getPaymentTransaction(@Path("company_id") companyId: String, @Path("transactionId") transactionId: String)
    : Response<PaymentTransactionDetails>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/payment/options")
    suspend fun getPaymentOptions(@Path("company_id") companyId: String, @Query("transaction_id") transactionId: String)
    : Response<GetPaymentOptions>
    
}