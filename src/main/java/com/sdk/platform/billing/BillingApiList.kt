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
    suspend fun getFeatureLimitConfig(@Path("company_id") companyId: String)
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
    
}