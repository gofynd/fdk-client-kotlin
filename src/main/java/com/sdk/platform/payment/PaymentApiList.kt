package com.sdk.platform.payment

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface PaymentApiList {
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    suspend fun getBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("aggregator") aggregator: String, @Query("config_type") configType: String?)
    : Response<PaymentGatewayConfigResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    suspend fun saveBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentGatewayConfigRequest)
    : Response<PaymentGatewayToBeReviewed>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options")
    suspend fun getPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("refresh") refresh: Boolean, @Query("amount") amount: Int, @Query("request_type") requestType: String, @Query("order_id") orderId: String?, @Query("shipment_id") shipmentId: String?)
    : Response<PaymentOptionsResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun getAllPayouts(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?)
    : Response<PayoutsResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun savePayout(@Path("company_id") companyId: String,@Body body: PayoutRequest)
    : Response<PayoutResponse>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun updatePayouts(@Path("company_id") companyId: String,@Body body: PayoutRequest)
    : Response<UpdatePayoutResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun activateAndDectivatePayouts(@Path("company_id") companyId: String,@Body body: UpdatePayoutRequest)
    : Response<UpdatePayoutResponse>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    suspend fun deletePayouts(@Path("company_id") companyId: String, @Query("unique_transfer_no") uniqueTransferNo: String)
    : Response<DeletePayoutResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun getAllPayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String, @Query("unique_external_id") uniqueExternalId: String?)
    : Response<PayoutsResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    suspend fun savePayouts(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: PayoutRequest)
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
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    suspend fun getBankAccountDetailsOpenAPI(@Query("order_id") orderId: String, @Query("request_hash") requestHash: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GetRefundAccountResponse>
    
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
    : Response<GetUserCODLimitResponse>
    
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
    suspend fun getPosPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("amount") amount: Int, @Query("cart_id") cartId: String?, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String?, @Query("refresh") refresh: Boolean?, @Query("order_id") orderId: String?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?, @Query("display_split") displaySplit: Boolean?, @Query("advance_payment") advancePayment: Boolean?, @Query("shipment_id") shipmentId: String?)
    : Response<PaymentModeRouteResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/request")
    suspend fun initialisePayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentInitializationRequest)
    : Response<PaymentInitializationResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm/polling")
    suspend fun checkAndUpdatePaymentStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentStatusUpdateRequest)
    : Response<PaymentStatusUpdateResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/cancel")
    suspend fun resendOrCancelPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ResendOrCancelPaymentRequest)
    : Response<ResendOrCancelPaymentResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/payment-status-bulk")
    suspend fun paymentStatusBulk(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentStatusBulkHandlerRequest)
    : Response<PaymentStatusBulkHandlerResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/onboard/{aggregator}")
    suspend fun oauthGetUrl(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator") aggregator: String, @Query("success_redirect_url") successRedirectUrl: String?, @Query("failure_redirect_url") failureRedirectUrl: String?)
    : Response<GetOauthUrlResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/revoke/{aggregator}")
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
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link")
    suspend fun getPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String)
    : Response<GetPaymentLinkResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link")
    suspend fun createPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreatePaymentLinkRequest)
    : Response<CreatePaymentLinkResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/{id}")
    suspend fun getPaymentLinkId(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("payment_link_id") paymentLinkId: String)
    : Response<GetPaymentLinkResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/polling-payment-link")
    suspend fun pollingPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_link_id") paymentLinkId: String?)
    : Response<PollingPaymentLinkResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/resend-payment-link")
    suspend fun resendPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkRequest)
    : Response<ResendPaymentLinkResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/cancel-payment-link")
    suspend fun cancelPaymentLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CancelOrResendPaymentLinkRequest)
    : Response<CancelPaymentLinkResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment_modes/sequencing")
    suspend fun getPaymentModeSequencing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("business_unit") businessUnit: String, @Query("device") device: String)
    : Response<PaymentModeResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment_modes/sequencing")
    suspend fun patchPaymentModeSequencing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformPaymentModeRequest)
    : Response<AggregatorConfigResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    suspend fun getPaymentModeControlRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String)
    : Response<PlatformOfflineAdvanceResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    suspend fun setMerchantModeControlRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String,@Body body: PlatformOfflineAdvanceRequest)
    : Response<PlatformOfflineAdvanceResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    suspend fun getPaymentModeCustomConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String)
    : Response<PaymentCustomConfigResponseSchema>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    suspend fun setPaymentModeCustomConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("mode") mode: String,@Body body: PaymentCustomConfigRequestSchema)
    : Response<PaymentCustomConfigResponseSchema>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payment/methods/configs")
    suspend fun getPaymentMethodConfig(@Path("company_id") companyId: String)
    : Response<PaymentMethodConfigResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/codes")
    suspend fun getPaymentCodeOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GetPaymentCodeResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    suspend fun getPaymentSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String)
    : Response<GetPaymentSessionResponse>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    suspend fun updatePaymentSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String,@Body body: PaymentSessionRequestSerializer)
    : Response<PaymentSessionResponseSerializer>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/{gid}/refund/session/{request_id}")
    suspend fun updateRefundSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("gid") gid: String, @Path("request_id") requestId: String,@Body body: RefundSessionRequestSerializer)
    : Response<RefundSessionResponseSerializer>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    suspend fun getMerchantPaymentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("payment_option_type") paymentOptionType: String?)
    : Response<PlatformOnlineOfflinePaymentResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    suspend fun patchMerchantPaymentOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: MerchantPaymentModeRequest)
    : Response<PatchPlatformOnlineOfflinePaymentResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/all-devices")
    suspend fun getDevices(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<GetDeviceResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    suspend fun getMerchantAggregatorPaymentModeDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String, @Query("business_unit") businessUnit: String, @Query("device") device: String)
    : Response<AggregatorPlatformPaymentModeResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    suspend fun patchMerchantAggregatorPaymentModeDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String,@Body body: PlatformPaymentModeRequest)
    : Response<PlatformPaymentModeResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator")
    suspend fun getPGConfigAggregators(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<AggregatorConfigResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator/credential/history")
    suspend fun getAggregatorCredentialHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("aggregator") aggregator: String, @Query("config_type") configType: String)
    : Response<AggregatorHistoryResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator/credential")
    suspend fun getAggregatorCredential(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("aggregator") aggregator: String, @Query("config_type") configType: String)
    : Response<AggregatorCredentialResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator/credential")
    suspend fun updateAggregatorCredential(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AggregatorCredentialRequest)
    : Response<PatchAggregatorCredentialResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}/{business_unit}")
    suspend fun getMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("business_unit") businessUnit: String)
    : Response<RefundPriorityResponseSerializer>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}/{business_unit}")
    suspend fun createMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("business_unit") businessUnit: String,@Body body: RefundPriorityRequestSerializer)
    : Response<RefundPriorityResponseSerializer>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}/{business_unit}")
    suspend fun updateMerchantRefundPriority(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("business_unit") businessUnit: String,@Body body: RefundPriorityRequestSerializer)
    : Response<RefundPriorityResponseSerializer>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment-orders")
    suspend fun createPaymentOrder(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentOrderRequest)
    : Response<PaymentOrderResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment_modes/sequencing/copy-config")
    suspend fun copyConfigPaymentModes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformPaymentModeCopyConfigRequest)
    : Response<AggregatorConfigResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/copy-config")
    suspend fun copyConfigAggPaymentModes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String,@Body body: PlatformPaymentModeCopyConfigRequest)
    : Response<AggregatorConfigResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    suspend fun getMerchantAggregatorAppVersion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String, @Query("business_unit") businessUnit: String, @Query("device") device: String, @Query("payment_mode_id") paymentModeId: Int?, @Query("sub_payment_mode") subPaymentMode: String?)
    : Response<AggregatorVersionResponse>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    suspend fun patchMerchantPaymentOptionVersion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("aggregator_id") aggregatorId: String,@Body body: AggregatorControlRequest)
    : Response<AggregatorConfigResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account_create")
    suspend fun addRefundBankAccount(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddBeneficiaryDetailsOTPRequest)
    : Response<RefundAccountResponse>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account/{beneficiary_id}")
    suspend fun deleteBeneficiaryDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("beneficiary_id") beneficiaryId: String)
    : Response<DeleteRefundAccountResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/refundoptions")
    suspend fun getRefundOptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("configuration") configuration: String, @Query("product_type") productType: String?, @Query("amount") amount: Int?, @Query("optin_app_id") optinAppId: String?, @Query("optin_company_id") optinCompanyId: String?, @Query("order_type") orderType: String?)
    : Response<ShipmentRefundResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/refundoptions")
    suspend fun setRefundOptionforShipment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ShipmentRefundRequest)
    : Response<ShipmentRefundResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/selected_refund_options")
    suspend fun getSelectedRefundOption(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("shipment_id") shipmentId: String, @Query("order_id") orderId: String)
    : Response<SelectedRefundOptionResponse>
    
    @GET ("/service/platform/payment/v2.0/company/{company_id}/application/{application_id}/refund/user/beneficiary")
    suspend fun getUserBeneficiariesDetailV2(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("order_id") orderId: String?, @Query("shipment_id") shipmentId: String?, @Query("mop") mop: String?)
    : Response<OrderBeneficiaryResponseSchemaV2>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/validate/beneficiary-address")
    suspend fun validateBeneficiaryAddress(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ValidateValidateAddressRequest)
    : Response<ValidateValidateAddressResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/beneficiary/default")
    suspend fun updateDefaultBeneficiary(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SetDefaultBeneficiaryRequest)
    : Response<SetDefaultBeneficiaryResponse>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/pennydrop/validation")
    suspend fun getPennyDropValidation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<PennyDropValidationResponse>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/pennydrop/validation")
    suspend fun updatePennyDropValidation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UpdatePennyDropValidationRequest)
    : Response<PennyDropValidationResponse>
    
}