package com.sdk.platform.apis.billing

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.billing.*

interface BillingApiList {
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/coupon/check-validity")
    fun checkCouponValidity(@Path("company_id") companyId: String, @Query("plan") plan: String, @Query("coupon_code") couponCode: String)
    : Deferred<Response<CheckValidityResponse>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription")
    fun createSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String,@Body body: CreateSubscriptionCharge)
    : Deferred<Response<CreateSubscriptionResponse>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}")
    fun getSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("subscription_id") subscriptionId: String)
    : Deferred<Response<EntitySubscription>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}/cancel")
    fun cancelSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("subscription_id") subscriptionId: String)
    : Deferred<Response<EntitySubscription>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/one_time_charge")
    fun createOneTimeCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String,@Body body: CreateOneTimeCharge)
    : Deferred<Response<CreateOneTimeChargeResponse>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/charge/{charge_id}")
    fun getChargeDetails(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("charge_id") chargeId: String)
    : Deferred<Response<OneTimeChargeEntity>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/list")
    fun getInvoices(@Path("company_id") companyId: String)
    : Deferred<Response<Invoices>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/{invoice_id}")
    fun getInvoiceById(@Path("company_id") companyId: String, @Path("invoice_id") invoiceId: String)
    : Deferred<Response<Invoice>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    fun getCustomerDetail(@Path("company_id") companyId: String)
    : Deferred<Response<SubscriptionCustomer>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    fun upsertCustomerDetail(@Path("company_id") companyId: String,@Body body: SubscriptionCustomerCreate)
    : Deferred<Response<SubscriptionCustomer>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current")
    fun getSubscription(@Path("company_id") companyId: String)
    : Deferred<Response<SubscriptionStatus>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current-limit")
    fun getFeatureLimitConfig(@Path("company_id") companyId: String)
    : Deferred<Response<SubscriptionLimit>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/activate")
    fun activateSubscriptionPlan(@Path("company_id") companyId: String,@Body body: SubscriptionActivateReq)
    : Deferred<Response<SubscriptionActivateRes>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/cancel")
    fun cancelSubscriptionPlan(@Path("company_id") companyId: String,@Body body: CancelSubscriptionReq)
    : Deferred<Response<CancelSubscriptionRes>>
    
}