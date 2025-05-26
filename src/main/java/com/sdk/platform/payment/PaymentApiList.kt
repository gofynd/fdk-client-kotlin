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
    : Response<PaymentGatewayConfigResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    suspend fun saveBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentGatewayConfigRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentGatewayToBeReviewed>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options")
    suspend fun getPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("refresh") refresh: Boolean?, @Query("request_type") requestType: String?, @Query("order_id") orderId: String?, @Query("shipment_id") shipmentId: String?, @Query("amount") amount: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentOptionsResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun getAllPayouts(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PayoutsResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun savePayout(@Path("company_id") companyId: String,@Body body: PayoutRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PayoutResponse>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun updatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: PayoutRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdatePayoutResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun activateAndDectivatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: UpdatePayoutRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdatePayoutResponse>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun deletePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeletePayoutResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    suspend fun getSubscriptionPaymentMethod(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriptionPaymentMethodResponse>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    suspend fun deleteSubscriptionPaymentMethod(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String, @Query("payment_method_id") paymentMethodId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteSubscriptionPaymentMethodResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/configs")
    suspend fun getSubscriptionConfig(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SubscriptionConfigResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/subscription/setup/intent")
    suspend fun saveSubscriptionSetupIntent(@Path("company_id") companyId: String,@Body body: SaveSubscriptionSetupIntentRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SaveSubscriptionSetupIntentResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    suspend fun getBankAccountDetailsOpenAPI(@Query("order_id") orderId: String, @Query("request_hash") requestHash: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundAccountResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    suspend fun addRefundBankAccountUsingOTP(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddBeneficiaryDetailsOTPRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundAccountResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/ifsc-code/verify")
    suspend fun verifyIfscCode(@Path("company_id") companyId: String, @Query("ifsc_code") ifscCode: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<IfscCodeResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/order")
    suspend fun getUserOrderBeneficiaries(@Query("order_id") orderId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderBeneficiaryResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/user")
    suspend fun getUserBeneficiaries(@Query("order_id") orderId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderBeneficiaryResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm")
    suspend fun confirmPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentConfirmationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentConfirmationResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    suspend fun getUserCODlimitRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("merchant_user_id") merchantUserId: String, @Query("mobile_no") mobileNo: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetUserCODLimitResponse>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    suspend fun setUserCODlimitRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SetCODForUserRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SetCODOptionResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-aggregator-list")
    suspend fun edcAggregatorsAndModelList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcAggregatorAndModelListResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-stats")
    suspend fun edcDeviceStats(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcDeviceStatsResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device")
    suspend fun updateEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EdcAddRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcDeviceAddResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    suspend fun getEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("terminal_unique_identifier") terminalUniqueIdentifier: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcDeviceDetailsResponse>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    suspend fun addEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("terminal_unique_identifier") terminalUniqueIdentifier: String,@Body body: EdcUpdateRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcDeviceUpdateResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-list")
    suspend fun edcDeviceList(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_active") isActive: Boolean?, @Query("store_id") storeId: Int?, @Query("device_tag") deviceTag: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcDeviceListResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/pos")
    suspend fun getPosPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("amount") amount: Int, @Query("cart_id") cartId: String?, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String?, @Query("refresh") refresh: Boolean?, @Query("order_id") orderId: String?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?, @Query("display_split") displaySplit: Boolean?, @Query("advance_payment") advancePayment: Boolean?, @Query("shipment_id") shipmentId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentModeRouteResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/request")
    suspend fun initialisePayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentInitializationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentInitializationResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm/polling")
    suspend fun checkAndUpdatePaymentStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentStatusUpdateRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentStatusUpdateResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/cancel")
    suspend fun resendOrCancelPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ResendOrCancelPaymentRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResendOrCancelPaymentResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/payment-status-bulk/")
    suspend fun paymentStatusBulk(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentStatusBulkHandlerRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentStatusBulkHandlerResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/onboard/{aggregator}/")
    suspend fun oauthGetUrl(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator") aggregator: String, @Query("success_redirect_url") successRedirectUrl: String?, @Query("failure_redirect_url") failureRedirectUrl: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetOauthUrlResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/revoke/{aggregator}/")
    suspend fun revokeOauthToken(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator") aggregator: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RevokeOAuthToken>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/repayment-details")
    suspend fun repaymentDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RepaymentDetailsSerialiserPayAll, @HeaderMap headers: Map<String, String>? = null)
    : Response<RepaymentResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/merchant-onboarding")
    suspend fun merchantOnBoarding(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: MerchantOnBoardingRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<MerchantOnBoardingResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/customer/validation")
    suspend fun verifyCustomerForPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ValidateCustomerRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateCustomerResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    suspend fun getPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentLinkResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    suspend fun createPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreatePaymentLinkRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreatePaymentLinkResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/polling-payment-link/")
    suspend fun pollingPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PollingPaymentLinkResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/resend-payment-link/")
    suspend fun resendPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResendPaymentLinkResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/cancel-payment-link/")
    suspend fun cancelPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CancelPaymentLinkResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    suspend fun getPaymentModeControlRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    suspend fun setMerchantModeControlRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String,@Body body: MerchantPaymentModeRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    suspend fun getPaymentModeCustomConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentCustomConfigResponseSchema>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    suspend fun setPaymentModeCustomConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String,@Body body: PaymentCustomConfigRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentCustomConfigResponseSchema>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/codes")
    suspend fun getPaymentCodeOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentCodeResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    suspend fun getPaymentSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String, @Query("line-item") lineItem: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentSessionSerializer>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    suspend fun updatePaymentSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String,@Body body: PaymentSessionRequestSerializer, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentSessionResponseSerializer>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/{gid}/refund/session/{request_id}")
    suspend fun updateRefundSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String, @Path("request_id") requestId: String,@Body body: RefundSessionRequestSerializer, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundSessionResponseSerializer>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    suspend fun getMerchantPaymentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    suspend fun patchMerchantPaymentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: MerchnatPaymentModeRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    suspend fun getMerchantAggregatorPaymentModeDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String, @Query("business_unit") businessUnit: String, @Query("device") device: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    suspend fun patchMerchantAggregatorPaymentModeDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String,@Body body: PlatformPaymentModeResponse, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator")
    suspend fun getPGConfigAggregators(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    suspend fun getMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundPriorityResponseSerializer>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    suspend fun createMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: RefundPriorityRequestSerializer, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundPriorityResponseSerializer>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    suspend fun updateMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: RefundPriorityRequestSerializer, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundPriorityResponseSerializer>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment-orders/")
    suspend fun createPaymentOrder(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentOrderRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentOrderResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    suspend fun getMerchantAggregatorAppVersion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String, @Query("business_unit") businessUnit: String, @Query("device") device: String, @Query("payment_mode_id") paymentModeId: Int?, @Query("sub_payment_mode") subPaymentMode: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorVersionResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    suspend fun patchMerchantPaymentOptionVersion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String,@Body body: AggregatorControlRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeResponse>
    
}
