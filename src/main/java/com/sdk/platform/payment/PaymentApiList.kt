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
    suspend fun getPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("refresh") refresh: Boolean?, @Query("amount") amount: Int, @Query("request_type") requestType: String?, @Query("order_id") orderId: String?, @Query("shipment_id") shipmentId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentOptionsDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun getAllPayouts(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PayoutsDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun savePayout(@Path("company_id") companyId: String,@Body body: PayoutCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PayoutDetails>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun updatePayouts(@Path("company_id") companyId: String,@Body body: PayoutCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdatePayoutDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun activateAndDectivatePayouts(@Path("company_id") companyId: String,@Body body: UpdatePayoutCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdatePayoutDetails>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun deletePayouts(@Path("company_id") companyId: String, @Query("unique_transfer_no") uniqueTransferNo: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeletePayoutDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun getAllPayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String, @Query("unique_external_id") uniqueExternalId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PayoutsDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun savePayouts(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: PayoutCreation, @HeaderMap headers: Map<String, String>? = null)
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
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    suspend fun getBankAccountDetailsOpenAPI(@Query("order_id") orderId: String, @Query("request_hash") requestHash: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetRefundAccountDetails>
    
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
    : Response<GetUserCODLimitDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-aggregator-list")
    suspend fun edcAggregatorsAndModelList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcAggregatorAndModelListDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-stats")
    suspend fun edcDeviceStats(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcDeviceStatsDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device")
    suspend fun updateEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EdcAddCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcDeviceAddDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    suspend fun getEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("terminal_unique_identifier") terminalUniqueIdentifier: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcDeviceDetails>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    suspend fun addEdcDevice(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("terminal_unique_identifier") terminalUniqueIdentifier: String,@Body body: EdcUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcDeviceUpdateDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-list")
    suspend fun edcDeviceList(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_active") isActive: Boolean?, @Query("store_id") storeId: Int?, @Query("device_tag") deviceTag: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<EdcDeviceListDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/pos")
    suspend fun getPosPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("amount") amount: Int, @Query("cart_id") cartId: String?, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String?, @Query("refresh") refresh: Boolean?, @Query("order_id") orderId: String?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?, @Query("display_split") displaySplit: Boolean?, @Query("advance_payment") advancePayment: Boolean?, @Query("shipment_id") shipmentId: String?, @HeaderMap headers: Map<String, String>? = null)
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
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/payment-status-bulk")
    suspend fun paymentStatusBulk(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentStatusBulkHandlerCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentStatusBulkHandlerDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/onboard/{aggregator}")
    suspend fun oauthGetUrl(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator") aggregator: String, @Query("success_redirect_url") successRedirectUrl: String?, @Query("failure_redirect_url") failureRedirectUrl: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetOauthUrlDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/revoke/{aggregator}")
    suspend fun revokeOauthToken(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator") aggregator: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RevokeOAuthToken>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/repayment-details")
    suspend fun repaymentDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RepaymentDetailsSerialiserPayAll, @HeaderMap headers: Map<String, String>? = null)
    : Response<RepaymentDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/merchant-onboarding")
    suspend fun merchantOnBoarding(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: MerchantOnBoardingCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<MerchantOnBoardingDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/customer/validation")
    suspend fun verifyCustomerForPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ValidateCustomerCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateCustomerDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link")
    suspend fun getPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentLinkDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link")
    suspend fun createPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreatePaymentLinkCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreatePaymentLinkDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/{id}")
    suspend fun getPaymentLinkId(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentLinkDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/polling-payment-link")
    suspend fun pollingPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PollingPaymentLinkDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/resend-payment-link")
    suspend fun resendPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResendPaymentLinkDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/cancel-payment-link")
    suspend fun cancelPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<CancelPaymentLinkDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment_modes/sequencing")
    suspend fun getPaymentModeSequencing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("business_unit") businessUnit: String, @Query("device") device: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentModeDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment_modes/sequencing")
    suspend fun patchPaymentModeSequencing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformPaymentMode, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorConfigDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    suspend fun getPaymentModeControlRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformOfflineAdvanceDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    suspend fun setMerchantModeControlRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String,@Body body: PlatformOfflineAdvance, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformOfflineAdvanceDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    suspend fun getPaymentModeCustomConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentCustomConfigResponseSchema>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    suspend fun setPaymentModeCustomConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String,@Body body: PaymentCustomConfigRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentCustomConfigResponseSchema>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payment/methods/configs")
    suspend fun getPaymentMethodConfig(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentMethodConfigDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/codes")
    suspend fun getPaymentCodeOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentCodeDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    suspend fun getPaymentSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String, @Query("line-item") lineItem: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentSessionDetails>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    suspend fun updatePaymentSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String,@Body body: PaymentSessionCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentSessionPutDetails>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/{gid}/refund/session/{request_id}")
    suspend fun updateRefundSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String, @Path("request_id") requestId: String,@Body body: RefundSessionCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundSessionDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    suspend fun getMerchantPaymentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_option_type") paymentOptionType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformOnlineOfflinePaymentDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    suspend fun patchMerchantPaymentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: MerchnatPaymentModeCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PatchPlatformOnlineOfflinePaymentDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/all-devices")
    suspend fun getDevices(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetDevice>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    suspend fun getMerchantAggregatorPaymentModeDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String, @Query("business_unit") businessUnit: String, @Query("device") device: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorPlatformPaymentModeDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    suspend fun patchMerchantAggregatorPaymentModeDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String,@Body body: PlatformPaymentMode, @HeaderMap headers: Map<String, String>? = null)
    : Response<PlatformPaymentModeDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator")
    suspend fun getPGConfigAggregators(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorConfigDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator/credential/history")
    suspend fun getAggregatorCredentialHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("aggregator") aggregator: String, @Query("config_type") configType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorHistoryDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator/credential")
    suspend fun getAggregatorCredential(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("aggregator") aggregator: String, @Query("config_type") configType: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorCredentialRes>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator/credential")
    suspend fun updateAggregatorCredential(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AggregatorCredentialReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<PatchAggregatorCredentialDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}/{business_unit}")
    suspend fun getMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("business_unit") businessUnit: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundPriorityDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}/{business_unit}")
    suspend fun createMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("business_unit") businessUnit: String,@Body body: RefundPriorityCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundPriorityDetails>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}/{business_unit}")
    suspend fun updateMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("business_unit") businessUnit: String,@Body body: RefundPriorityCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundPriorityDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment-orders")
    suspend fun createPaymentOrder(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentOrderCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentOrderDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment_modes/sequencing/copy-config")
    suspend fun copyConfigPaymentModes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformPaymentModeCopyConfigCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorConfigDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/copy-config")
    suspend fun copyConfigAggPaymentModes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String,@Body body: PlatformPaymentModeCopyConfigCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorConfigDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    suspend fun getMerchantAggregatorAppVersion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String, @Query("business_unit") businessUnit: String, @Query("device") device: String, @Query("payment_mode_id") paymentModeId: Int?, @Query("sub_payment_mode") subPaymentMode: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorVersionDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    suspend fun patchMerchantPaymentOptionVersion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String,@Body body: PatchAggregatorControl, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorConfigDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account_create")
    suspend fun addRefundBankAccount(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddBeneficiaryDetailsOTPCreation, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundAccountDetails>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account_create")
    suspend fun deleteBeneficiaryDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DeleteBeneficiary, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteRefundAccountDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/refundoptions")
    suspend fun setRefundOptionforShipment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ShipmentRefundDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentRefundRes>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/selected_refund_options")
    suspend fun getSelectedRefundOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("shipment_id") shipmentId: String, @Query("order_id") orderId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SelectedRefundOptionDetails>
    
    @GET ("/service/platform/payment/v2.0/company/{company_id}/application/{application_id}/refund/user/beneficiary")
    suspend fun getUserBeneficiariesDetailV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("order_id") orderId: String?, @Query("shipment_id") shipmentId: String?, @Query("mop") mop: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderBeneficiaryResponseSchemaV2>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/validate/beneficiary-address")
    suspend fun validateBeneficiaryAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ValidateValidateAddress, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateValidateAddressDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/beneficiary/default")
    suspend fun updateDefaultBeneficiary(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SetDefaultBeneficiary, @HeaderMap headers: Map<String, String>? = null)
    : Response<SetDefaultBeneficiaryDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/pennydrop/validation")
    suspend fun getPennyDropValidation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PennyDropValidationDetails>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/pennydrop/validation")
    suspend fun updatePennyDropValidation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UpdatePennyDropValidation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PennyDropValidationDetails>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refunds/beneficiary-details/{shipment_id}")
    suspend fun getShipmentBeneficiary(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("shipment_id") shipmentId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentBeneficiaryDetailsRes>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/transactions")
    suspend fun getTransactions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("user_id") userId: String?, @Query("page_size") pageSize: Int?, @Query("page_number") pageNumber: Int?, @Query("order_id") orderId: String?, @Query("shipment_id") shipmentId: String?, @Query("transaction_id") transactionId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<TransactionsResponseSchema>
    
}
