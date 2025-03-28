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
    : Response<AggregatorsConfigDetail>
    
    
    @POST
    suspend fun attachCardToCustomer(@Url url1: String?   ,@Body body: AttachCard, @HeaderMap headers: Map<String, String>? = null)
    : Response<AttachCardsDetails>
    
    
    @GET
    suspend fun getActiveCardAggregator(@Url url1: String?    ,  @Query("refresh") refresh: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ActiveCardPaymentGatewayDetails>
    
    
    @POST
    suspend fun updateUserCard(@Url url1: String?   ,@Body body: UpdateAggregatorCardReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateAggregatorCardDetails>
    
    
    @GET
    suspend fun getActiveUserCards(@Url url1: String?    ,  @Query("force_refresh") forceRefresh: Boolean?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ListCardsDetails>
    
    
    @POST
    suspend fun updateActiveCards(@Url url1: String?   ,@Body body: UpdateAggregatorCardReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<UpdateCard>
    
    
    @POST
    suspend fun deleteUserCard(@Url url1: String?   ,@Body body: DeleteCard, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteCardsDetails>
    
    
    @POST
    suspend fun verifyCustomerForPayment(@Url url1: String?   ,@Body body: ValidateCustomer, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateCustomerDetails>
    
    
    @POST
    suspend fun verifyAndChargePayment(@Url url1: String?   ,@Body body: ChargeCustomer, @HeaderMap headers: Map<String, String>? = null)
    : Response<ChargeCustomerDetails>
    
    
    @POST
    suspend fun initialisePayment(@Url url1: String?   ,@Body body: PaymentInitialization, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentInitializationDetails>
    
    
    @POST
    suspend fun checkAndUpdatePaymentStatus(@Url url1: String?   ,@Body body: PaymentStatusUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentStatusUpdateDetails>
    
    
    @GET
    suspend fun getPaymentModeRoutes(@Url url1: String?    ,           @Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("checkout_mode") checkoutMode: String?, @Query("refresh") refresh: Boolean?, @Query("order_id") orderId: String?, @Query("card_reference") cardReference: String?, @Query("user_details") userDetails: String?, @Query("display_split") displaySplit: Boolean?, @Query("advance_payment") advancePayment: Boolean?, @Query("shipment_id") shipmentId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentModeRouteDetails>
    
    
    @GET
    suspend fun getPosPaymentModeRoutes(@Url url1: String?    ,         @Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String?, @Query("refresh") refresh: Boolean?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentModeRouteDetails>
    
    
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
    : Response<RupifiBannerDetails>
    
    
    @GET
    suspend fun getEpaylaterBannerDetails(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<EpaylaterBannerDetails>
    
    
    @POST
    suspend fun resendOrCancelPayment(@Url url1: String?   ,@Body body: ResendOrCancelPayment, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResendOrCancelPaymentDetails>
    
    
    @POST
    suspend fun renderHTML(@Url url1: String?   ,@Body body: RenderHTML, @HeaderMap headers: Map<String, String>? = null)
    : Response<RenderHTMLDetails>
    
    
    @POST
    suspend fun validateVPA(@Url url1: String?   ,@Body body: ValidateVPA, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateVPADetails>
    
    
    @GET
    suspend fun cardDetails(@Url url1: String?     ,  @Query("aggregator") aggregator: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CardDetailsFetchedDetails>
    
    
    @GET
    suspend fun getActiveRefundTransferModes(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<TransferModeFetchDetails>
    
    
    @PUT
    suspend fun enableOrDisableRefundTransferMode(@Url url1: String?   ,@Body body: UpdateRefundTransferMode, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundTransferModeUpdateDetails>
    
    
    @GET
    suspend fun getUserBeneficiariesDetail(@Url url1: String?    ,  @Query("order_id") orderId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderBeneficiaryFetchDetails>
    
    
    @GET
    suspend fun verifyIfscCode(@Url url1: String?    ,  @Query("ifsc_code") ifscCode: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<IfscCodeDetails>
    
    
    @GET
    suspend fun getOrderBeneficiariesDetail(@Url url1: String?    ,  @Query("order_id") orderId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderBeneficiaryFetchDetails>
    
    
    @POST
    suspend fun addBeneficiaryDetails(@Url url1: String?   ,@Body body: AddBeneficiaryDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundAccountDetails>
    
    
    @PATCH
    suspend fun deleteBeneficiaryDetails(@Url url1: String?   ,@Body body: DeleteBeneficiary, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteRefundAccountDetails>
    
    
    @POST
    suspend fun verifyOtpAndAddBeneficiaryForBank(@Url url1: String?   ,@Body body: AddBeneficiaryViaOtpVerification, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddBeneficiaryViaOtpVerificationDetails>
    
    
    @POST
    suspend fun addRefundBankAccountUsingOTP(@Url url1: String?   ,@Body body: AddBeneficiaryDetailsOTP, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundAccountDetails>
    
    
    @GET
    suspend fun getotpOrderBeneficiariesDetail(@Url url1: String?    ,   @Query("order_id") orderId: String, @Query("request_hash") requestHash: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AddBeneficiaryDetailsOTPDetails>
    
    
    @POST
    suspend fun verifyOtpAndAddBeneficiaryForWallet(@Url url1: String?   ,@Body body: WalletOtp, @HeaderMap headers: Map<String, String>? = null)
    : Response<WalletOtpDetails>
    
    
    @POST
    suspend fun updateDefaultBeneficiary(@Url url1: String?   ,@Body body: SetDefaultBeneficiary, @HeaderMap headers: Map<String, String>? = null)
    : Response<SetDefaultBeneficiaryDetails>
    
    
    @POST
    suspend fun getBenficiaryOrder(@Url url1: String?   ,@Body body: RefundOrderBen, @HeaderMap headers: Map<String, String>? = null)
    : Response<RefundOrderBenDetails>
    
    
    @GET
    suspend fun getPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentLinkDetails>
    
    
    @POST
    suspend fun createPaymentLink(@Url url1: String?   ,@Body body: CreatePaymentLink, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreatePaymentLinkDetails>
    
    
    @GET
    suspend fun getPaymentLinkId(@Url url1: String?     ,  @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPaymentLinkDetails>
    
    
    @POST
    suspend fun resendPaymentLink(@Url url1: String?   ,@Body body: CancelOrResendPaymentLink, @HeaderMap headers: Map<String, String>? = null)
    : Response<ResendPaymentLinkDetails>
    
    
    @GET
    suspend fun getPaymentModeRoutesPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentModeRouteDetails>
    
    
    @GET
    suspend fun pollingPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<PollingPaymentLinkDetails>
    
    
    @POST
    suspend fun createOrderHandlerPaymentLink(@Url url1: String?   ,@Body body: CreateOrderUser, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateOrderUserDetails>
    
    
    @POST
    suspend fun initialisePaymentPaymentLink(@Url url1: String?   ,@Body body: PaymentInitialization, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentInitializationDetails>
    
    
    @POST
    suspend fun checkAndUpdatePaymentStatusPaymentLink(@Url url1: String?   ,@Body body: PaymentStatusUpdate, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentStatusUpdateDetails>
    
    
    @GET
    suspend fun customerCreditSummary(@Url url1: String?    ,  @Query("aggregator") aggregator: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomerCreditSummaryDetails>
    
    
    @GET
    suspend fun redirectToAggregator(@Url url1: String?    ,   @Query("source") source: String?, @Query("aggregator") aggregator: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<RedirectToAggregatorDetails>
    
    
    @GET
    suspend fun checkCredit(@Url url1: String?    ,  @Query("aggregator") aggregator: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CheckCreditDetails>
    
    
    @POST
    suspend fun customerOnboard(@Url url1: String?   ,@Body body: CustomerOnboarding, @HeaderMap headers: Map<String, String>? = null)
    : Response<CustomerOnboardingDetails>
    
    
    @GET
    suspend fun outstandingOrderDetails(@Url url1: String?    ,  @Query("aggregator") aggregator: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OutstandingOrderDetails>
    
    
    @POST
    suspend fun cancelPaymentLink(@Url url1: String?   ,@Body body: CancelOrResendPaymentLink, @HeaderMap headers: Map<String, String>? = null)
    : Response<CancelPaymentLinkDetails>
    
    
    @GET
    suspend fun paidOrderDetails(@Url url1: String?    ,  @Query("aggregator") aggregator: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaidOrderDetails>
    
    
    @POST
    suspend fun createPaymentOrder(@Url url1: String?   ,@Body body: PaymentOrder, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentOrderDetails>
    
    
    @POST
    suspend fun setRefundOptionforShipment(@Url url1: String?   ,@Body body: ShipmentRefund, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentRefundDetails>
    
    
    @GET
    suspend fun getSelectedRefundOption(@Url url1: String?    ,   @Query("shipment_id") shipmentId: String, @Query("order_id") orderId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<SelectedRefundOptionDetails>
    
    
    @GET
    suspend fun getUserBeneficiariesDetailV2(@Url url1: String?    ,    @Query("order_id") orderId: String?, @Query("shipment_id") shipmentId: String?, @Query("mop") mop: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrderBeneficiaryDetailsSchemaV2>
    
    
    @POST
    suspend fun validateBeneficiaryAddress(@Url url1: String?   ,@Body body: ValidateValidateAddress, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateValidateAddressDetails>
    
    
    @POST
    suspend fun confirmPayment(@Url url1: String?   ,@Body body: PaymentConfirmation, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentConfirmationDetails>
    
}
