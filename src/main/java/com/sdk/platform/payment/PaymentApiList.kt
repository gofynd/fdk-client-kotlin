package com.sdk.platform.payment

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface PaymentApiList {
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    suspend fun getBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<PaymentGatewayConfigResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    suspend fun saveBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentGatewayConfigRequest)
    : Response<PaymentGatewayToBeReviewed>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options")
    suspend fun getPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("refresh") refresh: Boolean, @Query("request_type") requestType: String)
    : Response<PaymentOptionsResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun getAllPayouts(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?)
    : Response<PayoutsResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun savePayout(@Path("company_id") companyId: String,@Body body: PayoutRequest)
    : Response<PayoutResponse>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun updatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: PayoutRequest)
    : Response<UpdatePayoutResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun activateAndDectivatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: UpdatePayoutRequest)
    : Response<UpdatePayoutResponse>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun deletePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String)
    : Response<DeletePayoutResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    suspend fun getSubscriptionPaymentMethod(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?)
    : Response<SubscriptionPaymentMethodResponse>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    suspend fun deleteSubscriptionPaymentMethod(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String, @Query("payment_method_id") paymentMethodId: String)
    : Response<DeleteSubscriptionPaymentMethodResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/configs")
    suspend fun getSubscriptionConfig(@Path("company_id") companyId: String)
    : Response<SubscriptionConfigResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/subscription/setup/intent")
    suspend fun saveSubscriptionSetupIntent(@Path("company_id") companyId: String,@Body body: SaveSubscriptionSetupIntentRequest)
    : Response<SaveSubscriptionSetupIntentResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    suspend fun getBankAccountDetailsOpenAPI(@Query("order_id") orderId: String, @Query("request_hash") requestHash: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<RefundAccountResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    suspend fun addRefundBankAccountUsingOTP(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddBeneficiaryDetailsOTPRequest)
    : Response<RefundAccountResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/ifsc-code/verify")
    suspend fun verifyIfscCode(@Path("company_id") companyId: String, @Query("ifsc_code") ifscCode: String?)
    : Response<IfscCodeResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/order")
    suspend fun getUserOrderBeneficiaries(@Query("order_id") orderId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<OrderBeneficiaryResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/user")
    suspend fun getUserBeneficiaries(@Query("order_id") orderId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<OrderBeneficiaryResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm")
    suspend fun confirmPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentConfirmationRequest)
    : Response<PaymentConfirmationResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    suspend fun getUserCODlimitRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("merchant_user_id") merchantUserId: String, @Query("mobile_no") mobileNo: String)
    : Response<GetUserCODLimitResponse>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    suspend fun setUserCODlimitRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SetCODForUserRequest)
    : Response<SetCODOptionResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-aggregator-list")
    suspend fun edcAggregatorsAndModelList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<EdcAggregatorAndModelListResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-stats")
    suspend fun edcDeviceStats(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<EdcDeviceStatsResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device")
    suspend fun updateEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EdcAddRequest)
    : Response<EdcDeviceAddResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    suspend fun getEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("terminal_unique_identifier") terminalUniqueIdentifier: String)
    : Response<EdcDeviceDetailsResponse>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    suspend fun addEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("terminal_unique_identifier") terminalUniqueIdentifier: String,@Body body: EdcUpdateRequest)
    : Response<EdcDeviceUpdateResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-list")
    suspend fun edcDeviceList(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_active") isActive: Boolean?, @Query("store_id") storeId: Int?, @Query("device_tag") deviceTag: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<EdcDeviceListResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/pos")
    suspend fun getPosPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String, @Query("refresh") refresh: Boolean?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?)
    : Response<PaymentOptionsResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/request")
    suspend fun initialisePayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentInitializationRequest)
    : Response<PaymentInitializationResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm/polling")
    suspend fun checkAndUpdatePaymentStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentStatusUpdateRequest)
    : Response<PaymentStatusUpdateResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/cancel")
    suspend fun resendOrCancelPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ResendOrCancelPaymentRequest)
    : Response<ResendOrCancelPaymentResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/payment-status-bulk/")
    suspend fun paymentStatusBulk(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentStatusBulkHandlerRequest)
    : Response<PaymentStatusBulkHandlerResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/onboard/{aggregator}/")
    suspend fun oauthGetUrl(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator") aggregator: String, @Query("success_redirect_url") successRedirectUrl: String?, @Query("failure_redirect_url") failureRedirectUrl: String?)
    : Response<GetOauthUrlResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/revoke/{aggregator}/")
    suspend fun revokeOauthToken(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator") aggregator: String)
    : Response<RevokeOAuthToken>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/repayment-details")
    suspend fun repaymentDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RepaymentDetailsSerialiserPayAll)
    : Response<RepaymentResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/merchant-onboarding")
    suspend fun merchantOnBoarding(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: MerchantOnBoardingRequest)
    : Response<MerchantOnBoardingResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/customer/validation")
    suspend fun verifyCustomerForPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ValidateCustomerRequest)
    : Response<ValidateCustomerResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    suspend fun getPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String?)
    : Response<GetPaymentLinkResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    suspend fun createPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreatePaymentLinkRequest)
    : Response<CreatePaymentLinkResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/polling-payment-link/")
    suspend fun pollingPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String?)
    : Response<PollingPaymentLinkResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/resend-payment-link/")
    suspend fun resendPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkRequest)
    : Response<ResendPaymentLinkResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/cancel-payment-link/")
    suspend fun cancelPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkRequest)
    : Response<CancelPaymentLinkResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/codes")
    suspend fun getPaymentCodeOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GetPaymentCodeResponse>
    
}