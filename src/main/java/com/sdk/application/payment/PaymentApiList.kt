package com.sdk.application.payment

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface PaymentApiList {
    
    
    @GET 
    suspend fun getAggregatorsConfig(@Url url1: String?    ,  @Header("x-api-token") xApiToken: String?,  @Query("refresh") refresh: Boolean?)
    : Response<AggregatorsConfigDetailResponse>
    
    
    @POST 
    suspend fun attachCardToCustomer(@Url url1: String?   ,@Body body: AttachCardRequest)
    : Response<AttachCardsResponse>
    
    
    @GET 
    suspend fun getActiveCardAggregator(@Url url1: String?    ,  @Query("refresh") refresh: Boolean?)
    : Response<ActiveCardPaymentGatewayResponse>
    
    
    @GET 
    suspend fun getActiveUserCards(@Url url1: String?    ,  @Query("force_refresh") forceRefresh: Boolean?)
    : Response<ListCardsResponse>
    
    
    @POST 
    suspend fun deleteUserCard(@Url url1: String?   ,@Body body: DeletehCardRequest)
    : Response<DeleteCardsResponse>
    
    
    @POST 
    suspend fun verifyCustomerForPayment(@Url url1: String?   ,@Body body: ValidateCustomerRequest)
    : Response<ValidateCustomerResponse>
    
    
    @POST 
    suspend fun verifyAndChargePayment(@Url url1: String?   ,@Body body: ChargeCustomerRequest)
    : Response<ChargeCustomerResponse>
    
    
    @POST 
    suspend fun initialisePayment(@Url url1: String?   ,@Body body: PaymentInitializationRequest)
    : Response<PaymentInitializationResponse>
    
    
    @POST 
    suspend fun checkAndUpdatePaymentStatus(@Url url1: String?   ,@Body body: PaymentStatusUpdateRequest)
    : Response<PaymentStatusUpdateResponse>
    
    
    @GET 
    suspend fun getPaymentModeRoutes(@Url url1: String?    ,           @Query("amount") amount: Int, @Query("cart_id") cartId: String?, @Query("checkout_mode") checkoutMode: String?, @Query("refresh") refresh: Boolean?, @Query("order_id") orderId: String?, @Query("card_reference") cardReference: String?, @Query("user_details") userDetails: String?, @Query("display_split") displaySplit: Boolean?, @Query("advance_payment") advancePayment: Boolean?, @Query("shipment_id") shipmentId: String?)
    : Response<PaymentModeRouteResponse>
    
    
    @GET 
    suspend fun getPosPaymentModeRoutes(@Url url1: String?    ,         @Query("amount") amount: Int, @Query("cart_id") cartId: String?, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String?, @Query("refresh") refresh: Boolean?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?)
    : Response<PaymentModeRouteResponse>
    
    
    @POST 
    suspend fun walletLinkInitiate(@Url url1: String?   ,@Body body: WalletLinkRequestSchema)
    : Response<WalletResponseSchema>
    
    
    @POST 
    suspend fun linkWallet(@Url url1: String?   ,@Body body: WalletVerifyRequestSchema)
    : Response<WalletResponseSchema>
    
    
    @POST 
    suspend fun delinkWallet(@Url url1: String?   ,@Body body: WalletDelinkRequestSchema)
    : Response<WalletResponseSchema>
    
    
    @GET 
    suspend fun getRupifiBannerDetails(@Url url1: String?   )
    : Response<RupifiBannerResponse>
    
    
    @GET 
    suspend fun getEpaylaterBannerDetails(@Url url1: String?   )
    : Response<EpaylaterBannerResponse>
    
    
    @POST 
    suspend fun resendOrCancelPayment(@Url url1: String?   ,@Body body: ResendOrCancelPaymentRequest)
    : Response<ResendOrCancelPaymentResponse>
    
    
    @POST 
    suspend fun renderHTML(@Url url1: String?   ,@Body body: renderHTMLRequest)
    : Response<renderHTMLResponse>
    
    
    @POST 
    suspend fun validateVPA(@Url url1: String?   ,@Body body: ValidateVPARequest)
    : Response<ValidateVPAResponse>
    
    
    @GET 
    suspend fun cardDetails(@Url url1: String?     ,  @Query("aggregator") aggregator: String?)
    : Response<CardDetailsResponse>
    
    
    @GET 
    suspend fun getActiveRefundTransferModes(@Url url1: String?   )
    : Response<TransferModeResponse>
    
    
    @PUT 
    suspend fun enableOrDisableRefundTransferMode(@Url url1: String?   ,@Body body: UpdateRefundTransferModeRequest)
    : Response<UpdateRefundTransferModeResponse>
    
    
    @GET 
    suspend fun getUserBeneficiariesDetail(@Url url1: String?    ,  @Query("order_id") orderId: String)
    : Response<OrderBeneficiaryResponse>
    
    
    @GET 
    suspend fun verifyIfscCode(@Url url1: String?    ,  @Query("ifsc_code") ifscCode: String?)
    : Response<IfscCodeResponse>
    
    
    @GET 
    suspend fun getOrderBeneficiariesDetail(@Url url1: String?    ,  @Query("order_id") orderId: String)
    : Response<OrderBeneficiaryResponse>
    
    
    @POST 
    suspend fun verifyOtpAndAddBeneficiaryForBank(@Url url1: String?   ,@Body body: AddBeneficiaryViaOtpVerificationRequest)
    : Response<AddBeneficiaryViaOtpVerificationResponse>
    
    
    @POST 
    suspend fun addBeneficiaryDetails(@Url url1: String?   ,@Body body: AddBeneficiaryDetailsRequest)
    : Response<RefundAccountResponse>
    
    
    @POST 
    suspend fun addRefundBankAccountUsingOTP(@Url url1: String?   ,@Body body: AddBeneficiaryDetailsOTPRequest)
    : Response<RefundAccountResponse>
    
    
    @POST 
    suspend fun verifyOtpAndAddBeneficiaryForWallet(@Url url1: String?   ,@Body body: WalletOtpRequest)
    : Response<WalletOtpResponse>
    
    
    @POST 
    suspend fun updateDefaultBeneficiary(@Url url1: String?   ,@Body body: SetDefaultBeneficiaryRequest)
    : Response<SetDefaultBeneficiaryResponse>
    
    
    @GET 
    suspend fun getPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String?)
    : Response<GetPaymentLinkResponse>
    
    
    @POST 
    suspend fun createPaymentLink(@Url url1: String?   ,@Body body: CreatePaymentLinkRequest)
    : Response<CreatePaymentLinkResponse>
    
    
    @POST 
    suspend fun resendPaymentLink(@Url url1: String?   ,@Body body: CancelOrResendPaymentLinkRequest)
    : Response<ResendPaymentLinkResponse>
    
    
    @POST 
    suspend fun cancelPaymentLink(@Url url1: String?   ,@Body body: CancelOrResendPaymentLinkRequest)
    : Response<CancelPaymentLinkResponse>
    
    
    @GET 
    suspend fun getPaymentModeRoutesPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String)
    : Response<PaymentModeRouteResponse>
    
    
    @GET 
    suspend fun pollingPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String?)
    : Response<PollingPaymentLinkResponse>
    
    
    @POST 
    suspend fun createOrderHandlerPaymentLink(@Url url1: String?   ,@Body body: CreateOrderUserRequest)
    : Response<CreateOrderUserResponse>
    
    
    @POST 
    suspend fun initialisePaymentPaymentLink(@Url url1: String?   ,@Body body: PaymentInitializationRequest)
    : Response<PaymentInitializationResponse>
    
    
    @POST 
    suspend fun checkAndUpdatePaymentStatusPaymentLink(@Url url1: String?   ,@Body body: PaymentStatusUpdateRequest)
    : Response<PaymentStatusUpdateResponse>
    
    
    @GET 
    suspend fun customerCreditSummary(@Url url1: String?    ,  @Query("aggregator") aggregator: String?)
    : Response<CustomerCreditSummaryResponse>
    
    
    @GET 
    suspend fun redirectToAggregator(@Url url1: String?    ,   @Query("source") source: String?, @Query("aggregator") aggregator: String?)
    : Response<RedirectToAggregatorResponse>
    
    
    @GET 
    suspend fun checkCredit(@Url url1: String?    ,  @Query("aggregator") aggregator: String?)
    : Response<CheckCreditResponse>
    
    
    @POST 
    suspend fun customerOnboard(@Url url1: String?   ,@Body body: CustomerOnboardingRequest)
    : Response<CustomerOnboardingResponse>
    
    
    @GET 
    suspend fun outstandingOrderDetails(@Url url1: String?    ,  @Query("aggregator") aggregator: String?)
    : Response<OutstandingOrderDetailsResponse>
    
    
    @GET 
    suspend fun paidOrderDetails(@Url url1: String?    ,  @Query("aggregator") aggregator: String?)
    : Response<PaidOrderDetailsResponse>
    
    
    @POST 
    suspend fun createPaymentOrder(@Url url1: String?   ,@Body body: PaymentOrderRequest)
    : Response<PaymentOrderResponse>
    
}