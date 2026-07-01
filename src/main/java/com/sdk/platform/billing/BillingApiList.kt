package com.sdk.platform.billing

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface BillingApiList {
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/charge/{charge_id}")
    suspend fun getChargeDetails(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("charge_id") chargeId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ChargeDetails>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}")
    suspend fun getSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("subscription_id") subscriptionId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriptionChargeRes>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}/cancel")
    suspend fun cancelSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("subscription_id") subscriptionId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriptionChargeRes>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/one_time_charge")
    suspend fun createOneTimeCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String,@Body body: CreateOneTimeCharge, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateOneTimeChargeResponseSchemas>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription")
    suspend fun createSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String,@Body body: CreateSubscriptionCharge, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateSubscription>
    
}
