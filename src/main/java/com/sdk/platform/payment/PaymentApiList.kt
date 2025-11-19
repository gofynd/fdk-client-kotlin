package com.sdk.platform.payment

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface PaymentApiList {
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    suspend fun getBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("aggregator") aggregator: String, @Query("config_type") configType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentGatewayConfigDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    suspend fun saveBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentGatewayConfigCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentGatewayToBeReviewed>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options")
    suspend fun getPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("refresh") refresh: Boolean?, @Query("request_type") requestType: String?, @Query("order_id") orderId: String?, @Query("shipment_id") shipmentId: String?, @Query("amount") amount: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentOptionsDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun getAllPayouts(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PayoutsDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun savePayout(@Path("company_id") companyId: String,@Body body: PayoutCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PayoutDetails>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun updatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: PayoutCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdatePayoutDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun activateAndDectivatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: UpdatePayoutCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdatePayoutDetails>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun deletePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeletePayoutDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    suspend fun getSubscriptionPaymentMethod(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriptionPaymentMethodDetails>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    suspend fun deleteSubscriptionPaymentMethod(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String, @Query("payment_method_id") paymentMethodId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteSubscriptionPaymentMethodDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/configs")
    suspend fun getSubscriptionConfig(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriptionConfigDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/subscription/setup/intent")
    suspend fun saveSubscriptionSetupIntent(@Path("company_id") companyId: String,@Body body: SaveSubscriptionSetupIntentCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<SaveSubscriptionSetupIntentDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    suspend fun getBankAccountDetailsOpenAPI(@Query("order_id") orderId: String, @Query("request_hash") requestHash: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundAccountDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    suspend fun addRefundBankAccountUsingOTP(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddBeneficiaryDetailsOTPCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundAccountDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/ifsc-code/verify")
    suspend fun verifyIfscCode(@Path("company_id") companyId: String, @Query("ifsc_code") ifscCode: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<IfscCodeDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/order")
    suspend fun getUserOrderBeneficiaries(@Query("order_id") orderId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderBeneficiaryFetchResults>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/user")
    suspend fun getUserBeneficiaries(@Query("order_id") orderId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderBeneficiaryFetchResults>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm")
    suspend fun confirmPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentConfirmationCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentConfirmationDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    suspend fun getUserCODlimitRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("merchant_user_id") merchantUserId: String, @Query("mobile_no") mobileNo: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetUserCODLimitDetails>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    suspend fun setUserCODlimitRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SetCODForUserCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<SetCODOptionDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/pos")
    suspend fun getPosPaymentModeRoutes(@Header("x-ordering-source") xOrderingSource: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("amount") amount: Int, @Query("cart_id") cartId: String?, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String?, @Query("refresh") refresh: Boolean?, @Query("order_id") orderId: String?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?, @Query("display_split") displaySplit: Boolean?, @Query("advance_payment") advancePayment: Boolean?, @Query("shipment_id") shipmentId: String?, @Query("customer_id") customerId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentModeRouteDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/request")
    suspend fun initialisePayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentInitializationCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentInitializationDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm/polling")
    suspend fun checkAndUpdatePaymentStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentStatusUpdateCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentStatusUpdateDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/cancel")
    suspend fun resendOrCancelPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ResendOrCancelPaymentCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResendOrCancelPaymentDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/payment-status-bulk/")
    suspend fun paymentStatusBulk(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentStatusBulkHandlerCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentStatusBulkHandlerDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/onboard/{aggregator}/")
    suspend fun oauthGetUrl(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator") aggregator: String, @Query("success_redirect_url") successRedirectUrl: String?, @Query("failure_redirect_url") failureRedirectUrl: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetOauthUrlDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/revoke/{aggregator}/")
    suspend fun revokeOauthToken(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator") aggregator: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RevokeOAuthToken>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/customer/validation")
    suspend fun verifyCustomerForPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ValidateCustomerCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateCustomerDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    suspend fun getPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentLinkDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    suspend fun createPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreatePaymentLinkCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreatePaymentLinkDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/polling-payment-link/")
    suspend fun pollingPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PollingPaymentLinkDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/resend-payment-link/")
    suspend fun resendPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResendPaymentLinkDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/cancel-payment-link/")
    suspend fun cancelPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<CancelPaymentLinkDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    suspend fun getPaymentModeControlRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    suspend fun setMerchantModeControlRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String,@Body body: MerchantPaymentModeCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    suspend fun getPaymentModeCustomConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentCustomConfigResponseSchema>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    suspend fun setPaymentModeCustomConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String,@Body body: PaymentCustomConfigRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentCustomConfigResponseSchema>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/codes")
    suspend fun getPaymentCodeOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentCodeDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    suspend fun getPaymentSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String, @Query("line-item") lineItem: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentSessionFetchDetails>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    suspend fun updatePaymentSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String,@Body body: PaymentSessionCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentSessionPutDetails>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/{gid}/refund/session/{request_id}")
    suspend fun updateRefundSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String, @Path("request_id") requestId: String,@Body body: RefundSessionCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundSessionDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    suspend fun getMerchantPaymentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    suspend fun patchMerchantPaymentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: MerchnatPaymentModeCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    suspend fun getMerchantAggregatorPaymentModeDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String, @Query("business_unit") businessUnit: String, @Query("device") device: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    suspend fun patchMerchantAggregatorPaymentModeDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String,@Body body: PlatformPaymentModeDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator")
    suspend fun getPGConfigAggregators(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    suspend fun getMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundPriorityDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    suspend fun createMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: RefundPriorityCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundPriorityDetails>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    suspend fun updateMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: RefundPriorityCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundPriorityDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment-orders/")
    suspend fun createPaymentOrder(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentOrderCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentOrderDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    suspend fun getMerchantAggregatorAppVersion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String, @Query("business_unit") businessUnit: String, @Query("device") device: String, @Query("payment_mode_id") paymentModeId: Int?, @Query("sub_payment_mode") subPaymentMode: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorVersionDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    suspend fun patchMerchantPaymentOptionVersion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String,@Body body: PatchAggregatorControl, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/validate/customer-credits")
    suspend fun validateCustomerAndCreditSummary(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CustomerValidationSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateCustomerCreditSchema>
    
}
