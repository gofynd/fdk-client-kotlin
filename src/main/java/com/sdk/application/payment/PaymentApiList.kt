package com.sdk.application.payment

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface PaymentApiList {
    
    
    @GET
    suspend fun getAggregatorsConfig(@Url url1: String?    ,  @Header("x-api-token") xApiToken: String?,  @Query("refresh") refresh: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<AggregatorsConfigDetailResponse>
    
    
    @POST
    suspend fun attachCardToCustomer(@Url url1: String?   ,@Body body: AttachCardRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<AttachCardsResponse>
    
    
    @GET
    suspend fun getActiveCardAggregator(@Url url1: String?    ,  @Query("refresh") refresh: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ActiveCardPaymentGatewayResponse>
    
    
    @POST
    suspend fun updateUserCard(@Url url1: String?   ,@Body body: UpdateAggregatorCardRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateAggregatorCardResponse>
    
    
    @GET
    suspend fun getActiveUserCards(@Url url1: String?    ,  @Query("force_refresh") forceRefresh: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ListCardsResponse>
    
    
    @POST
    suspend fun updateActiveCards(@Url url1: String?   ,@Body body: UpdateAggregatorCardRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCardResponse>
    
    
    @POST
    suspend fun deleteUserCard(@Url url1: String?   ,@Body body: DeletehCardRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteCardsResponse>
    
    
    @POST
    suspend fun verifyCustomerForPayment(@Url url1: String?   ,@Body body: ValidateCustomerRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateCustomerResponse>
    
    
    @POST
    suspend fun verifyAndChargePayment(@Url url1: String?   ,@Body body: ChargeCustomerRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ChargeCustomerResponse>
    
    
    @POST
    suspend fun initialisePayment(@Url url1: String?   ,@Body body: PaymentInitializationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentInitializationResponse>
    
    
    @POST
    suspend fun checkAndUpdatePaymentStatus(@Url url1: String?   ,@Body body: PaymentStatusUpdateRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentStatusUpdateResponse>
    
    
    @GET
    suspend fun getPaymentModeRoutes(@Url url1: String?    ,           @Query("amount") amount: Int, @Query("cart_id") cartId: String?, @Query("checkout_mode") checkoutMode: String?, @Query("refresh") refresh: Boolean?, @Query("order_id") orderId: String?, @Query("card_reference") cardReference: String?, @Query("user_details") userDetails: String?, @Query("display_split") displaySplit: Boolean?, @Query("advance_payment") advancePayment: Boolean?, @Query("shipment_id") shipmentId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentModeRouteResponse>
    
    
    @GET
    suspend fun getPosPaymentModeRoutes(@Url url1: String?    ,         @Query("amount") amount: Int, @Query("cart_id") cartId: String?, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String?, @Query("refresh") refresh: Boolean?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentModeRouteResponse>
    
    
    @POST
    suspend fun walletLinkInitiate(@Url url1: String?   ,@Body body: WalletLinkRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<WalletResponseSchema>
    
    
    @POST
    suspend fun linkWallet(@Url url1: String?   ,@Body body: WalletVerifyRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<WalletResponseSchema>
    
    
    @POST
    suspend fun delinkWallet(@Url url1: String?   ,@Body body: WalletDelinkRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<WalletResponseSchema>
    
    
    @GET
    suspend fun getRupifiBannerDetails(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<RupifiBannerResponse>
    
    
    @GET
    suspend fun getEpaylaterBannerDetails(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<EpaylaterBannerResponse>
    
    
    @POST
    suspend fun resendOrCancelPayment(@Url url1: String?   ,@Body body: ResendOrCancelPaymentRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResendOrCancelPaymentResponse>
    
    
    @POST
    suspend fun renderHTML(@Url url1: String?   ,@Body body: renderHTMLRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<renderHTMLResponse>
    
    
    @POST
    suspend fun validateVPA(@Url url1: String?   ,@Body body: ValidateVPARequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateVPAResponse>
    
    
    @GET
    suspend fun cardDetails(@Url url1: String?     ,  @Query("aggregator") aggregator: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CardDetailsResponse>
    
    
    @GET
    suspend fun getActiveRefundTransferModes(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<TransferModeResponse>
    
    
    @PUT
    suspend fun enableOrDisableRefundTransferMode(@Url url1: String?   ,@Body body: UpdateRefundTransferModeRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateRefundTransferModeResponse>
    
    
    @GET
    suspend fun getUserBeneficiariesDetail(@Url url1: String?    ,  @Query("order_id") orderId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderBeneficiaryResponse>
    
    
    @GET
    suspend fun verifyIfscCode(@Url url1: String?    ,  @Query("ifsc_code") ifscCode: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<IfscCodeResponse>
    
    
    @GET
    suspend fun getOrderBeneficiariesDetail(@Url url1: String?    ,  @Query("order_id") orderId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderBeneficiaryResponse>
    
    
    @POST
    suspend fun addBeneficiaryDetails(@Url url1: String?   ,@Body body: AddBeneficiaryDetailsRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundAccountResponse>
    
    
    @PATCH
    suspend fun deleteBeneficiaryDetails(@Url url1: String?   ,@Body body: DeleteBeneficiaryRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteRefundAccountResponse>
    
    
    @POST
    suspend fun verifyOtpAndAddBeneficiaryForBank(@Url url1: String?   ,@Body body: AddBeneficiaryViaOtpVerificationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddBeneficiaryViaOtpVerificationResponse>
    
    
    @POST
    suspend fun addRefundBankAccountUsingOTP(@Url url1: String?   ,@Body body: AddBeneficiaryDetailsOTPRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PostAddBeneficiaryDetailsOTPResponse>
    
    
    @GET
    suspend fun getotpOrderBeneficiariesDetail(@Url url1: String?    ,   @Query("order_id") orderId: String, @Query("request_hash") requestHash: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddBeneficiaryDetailsOTPResponse>
    
    
    @POST
    suspend fun verifyOtpAndAddBeneficiaryForWallet(@Url url1: String?   ,@Body body: WalletOtpRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<WalletOtpResponse>
    
    
    @POST
    suspend fun updateDefaultBeneficiary(@Url url1: String?   ,@Body body: SetDefaultBeneficiaryRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SetDefaultBeneficiaryResponse>
    
    
    @POST
    suspend fun getBenficiaryOrder(@Url url1: String?   ,@Body body: RefundOrderBenRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundOrderBenResponse>
    
    
    @GET
    suspend fun getPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentLinkResponse>
    
    
    @POST
    suspend fun createPaymentLink(@Url url1: String?   ,@Body body: CreatePaymentLinkRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreatePaymentLinkResponse>
    
    
    @GET
    suspend fun getPaymentLinkId(@Url url1: String?     ,  @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentLinkResponse>
    
    
    @POST
    suspend fun resendPaymentLink(@Url url1: String?   ,@Body body: CancelOrResendPaymentLinkRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResendPaymentLinkResponse>
    
    
    @GET
    suspend fun getPaymentModeRoutesPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentModeRouteResponse>
    
    
    @GET
    suspend fun pollingPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PollingPaymentLinkResponse>
    
    
    @POST
    suspend fun createOrderHandlerPaymentLink(@Url url1: String?   ,@Body body: CreateOrderUserRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateOrderUserResponse>
    
    
    @POST
    suspend fun initialisePaymentPaymentLink(@Url url1: String?   ,@Body body: PaymentInitializationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentInitializationResponse>
    
    
    @POST
    suspend fun checkAndUpdatePaymentStatusPaymentLink(@Url url1: String?   ,@Body body: PaymentStatusUpdateRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentStatusUpdateResponse>
    
    
    @GET
    suspend fun customerCreditSummary(@Url url1: String?    ,  @Query("aggregator") aggregator: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomerCreditSummaryResponse>
    
    
    @GET
    suspend fun redirectToAggregator(@Url url1: String?    ,   @Query("source") source: String?, @Query("aggregator") aggregator: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<RedirectToAggregatorResponse>
    
    
    @GET
    suspend fun checkCredit(@Url url1: String?    ,  @Query("aggregator") aggregator: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CheckCreditResponse>
    
    
    @POST
    suspend fun customerOnboard(@Url url1: String?   ,@Body body: CustomerOnboardingRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomerOnboardingResponse>
    
    
    @GET
    suspend fun outstandingOrderDetails(@Url url1: String?    ,  @Query("aggregator") aggregator: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OutstandingOrderDetailsResponse>
    
    
    @POST
    suspend fun cancelPaymentLink(@Url url1: String?   ,@Body body: CancelOrResendPaymentLinkRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<CancelPaymentLinkResponse>
    
    
    @GET
    suspend fun paidOrderDetails(@Url url1: String?    ,  @Query("aggregator") aggregator: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaidOrderDetailsResponse>
    
    
    @POST
    suspend fun createPaymentOrder(@Url url1: String?   ,@Body body: PaymentOrderRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentOrderResponse>
    
    
    @POST
    suspend fun setRefundOptionforShipment(@Url url1: String?   ,@Body body: ShipmentRefundRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentRefundResponse>
    
    
    @GET
    suspend fun getSelectedRefundOption(@Url url1: String?    ,   @Query("shipment_id") shipmentId: String, @Query("order_id") orderId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SelectedRefundOptionResponse>
    
    
    @GET
    suspend fun getUserBeneficiariesDetailV2(@Url url1: String?    ,    @Query("order_id") orderId: String?, @Query("shipment_id") shipmentId: String?, @Query("mop") mop: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderBeneficiaryResponseSchemaV2>
    
    
    @POST
    suspend fun validateBeneficiaryAddress(@Url url1: String?   ,@Body body: ValidateValidateAddressRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateValidateAddressResponse>
    
    
    @POST
    suspend fun confirmPayment(@Url url1: String?   ,@Body body: PaymentConfirmationRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentConfirmationResponse>
    
}
