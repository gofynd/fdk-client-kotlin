package com.sdk.platform.apis.payment

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.payment.*

interface PaymentApiList {
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    fun getBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<PaymentGatewayConfigResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    fun saveBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    fun updateBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options")
    fun getPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("refresh") refresh: Boolean, @Query("request_type") requestType: String)
    : Deferred<Response<PaymentOptionsResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    fun getAllPayouts(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?)
    : Deferred<Response<PayoutsResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    fun savePayout(@Path("company_id") companyId: String,@Body body: PayoutRequest)
    : Deferred<Response<PayoutResponse>>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    fun updatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: PayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    fun activateAndDectivatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: UpdatePayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    fun deletePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String)
    : Deferred<Response<DeletePayoutResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    fun getSubscriptionPaymentMethod(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?)
    : Deferred<Response<SubscriptionPaymentMethodResponse>>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    fun deleteSubscriptionPaymentMethod(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String, @Query("payment_method_id") paymentMethodId: String)
    : Deferred<Response<DeleteSubscriptionPaymentMethodResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/configs")
    fun getSubscriptionConfig(@Path("company_id") companyId: String)
    : Deferred<Response<SubscriptionConfigResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/subscription/setup/intent")
    fun saveSubscriptionSetupIntent(@Path("company_id") companyId: String,@Body body: SaveSubscriptionSetupIntentRequest)
    : Deferred<Response<SaveSubscriptionSetupIntentResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    fun getBankAccountDetailsOpenAPI(@Query("order_id") orderId: String, @Query("request_hash") requestHash: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<RefundAccountResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    fun addRefundBankAccountUsingOTP(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddBeneficiaryDetailsOTPRequest)
    : Deferred<Response<RefundAccountResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/ifsc-code/verify")
    fun verifyIfscCode(@Path("company_id") companyId: String, @Query("ifsc_code") ifscCode: String?)
    : Deferred<Response<IfscCodeResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/order")
    fun getUserOrderBeneficiaries(@Query("order_id") orderId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/user")
    fun getUserBeneficiaries(@Query("order_id") orderId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm")
    fun confirmPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentConfirmationRequest)
    : Deferred<Response<PaymentConfirmationResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    fun getUserCODlimitRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("merchant_user_id") merchantUserId: String, @Query("mobile_no") mobileNo: String)
    : Deferred<Response<GetUserCODLimitResponse>>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    fun setUserCODlimitRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SetCODForUserRequest)
    : Deferred<Response<SetCODOptionResponse>>
    
}