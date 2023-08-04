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
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-aggregator-list")
    fun edcAggregatorsAndModelList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<EdcAggregatorAndModelListResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-stats")
    fun edcDeviceStats(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<EdcDeviceStatsResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device")
    fun updateEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EdcAddRequest)
    : Deferred<Response<EdcDeviceAddResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    fun getEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("terminal_unique_identifier") terminalUniqueIdentifier: String)
    : Deferred<Response<EdcDeviceDetailsResponse>>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    fun addEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("terminal_unique_identifier") terminalUniqueIdentifier: String,@Body body: EdcUpdateRequest)
    : Deferred<Response<EdcDeviceUpdateResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-list")
    fun edcDeviceList(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_active") isActive: Boolean?, @Query("store_id") storeId: Int?, @Query("device_tag") deviceTag: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<EdcDeviceListResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/pos")
    fun getPosPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String, @Query("refresh") refresh: Boolean?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?)
    : Deferred<Response<PaymentOptionsResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/request")
    fun initialisePayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentInitializationRequest)
    : Deferred<Response<PaymentInitializationResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm/polling")
    fun checkAndUpdatePaymentStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentStatusUpdateRequest)
    : Deferred<Response<PaymentStatusUpdateResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/cancel")
    fun resendOrCancelPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ResendOrCancelPaymentRequest)
    : Deferred<Response<ResendOrCancelPaymentResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/payment-status-bulk/")
    fun paymentStatusBulk(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentStatusBulkHandlerRequest)
    : Deferred<Response<PaymentStatusBulkHandlerResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/onboard/{aggregator}/")
    fun oauthGetUrl(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator") aggregator: String, @Query("success_redirect_url") successRedirectUrl: String?, @Query("failure_redirect_url") failureRedirectUrl: String?)
    : Deferred<Response<GetOauthUrlResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/revoke/{aggregator}/")
    fun revokeOauthToken(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator") aggregator: String)
    : Deferred<Response<RevokeOAuthToken>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/repayment-details")
    fun repaymentDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RepaymentDetailsSerialiserPayAll)
    : Deferred<Response<RepaymentResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/merchant-onboarding")
    fun merchantOnBoarding(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: MerchantOnBoardingRequest)
    : Deferred<Response<MerchantOnBoardingResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/customer/validation")
    fun verifyCustomerForPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ValidateCustomerRequest)
    : Deferred<Response<ValidateCustomerResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    fun getPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String?)
    : Deferred<Response<GetPaymentLinkResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    fun createPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreatePaymentLinkRequest)
    : Deferred<Response<CreatePaymentLinkResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/polling-payment-link/")
    fun pollingPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String?)
    : Deferred<Response<PollingPaymentLinkResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/resend-payment-link/")
    fun resendPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkRequest)
    : Deferred<Response<ResendPaymentLinkResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/cancel-payment-link/")
    fun cancelPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkRequest)
    : Deferred<Response<CancelPaymentLinkResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/codes")
    fun getPaymentCodeOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetPaymentCodeResponse>>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    fun updatePaymentSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String,@Body body: PaymentSessionRequestSerializer)
    : Deferred<Response<PaymentSessionResponseSerializer>>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/{gid}/refund/session/{request_id}")
    fun updateRefundSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String, @Path("request_id") requestId: String,@Body body: RefundSessionRequestSerializer)
    : Deferred<Response<RefundSessionResponseSerializer>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    fun getMerchantPaymentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<MerchnatPaymentModeResponse>>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    fun patchMerchantPaymentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: MerchnatPaymentModeResponse)
    : Deferred<Response<MerchnatPaymentModeResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    fun getMerchantAggregatorPaymentModeDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String, @Query("business_unit") businessUnit: String, @Query("device") device: String)
    : Deferred<Response<MerchnatPaymentModeResponse>>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    fun patchMerchantAggregatorPaymentModeDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String,@Body body: MerchnatPaymentModeResponse)
    : Deferred<Response<MerchnatPaymentModeResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator")
    fun getPGConfigAggregators(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<MerchnatPaymentModeResponse>>
    
}