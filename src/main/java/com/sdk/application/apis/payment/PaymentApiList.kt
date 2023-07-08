package com.sdk.application.apis.payment

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.payment.*

interface PaymentApiList {
    
    
    @GET 
    fun getAggregatorsConfig(@Url url1: String?    ,  @Header("x-api-token") xApiToken: String?,  @Query("refresh") refresh: Boolean?)
    : Deferred<Response<AggregatorsConfigDetailResponse>>
    
    
    @POST 
    fun attachCardToCustomer(@Url url1: String?   ,@Body body: AttachCardRequest)
    : Deferred<Response<AttachCardsResponse>>
    
    
    @GET 
    fun getActiveCardAggregator(@Url url1: String?    ,  @Query("refresh") refresh: Boolean?)
    : Deferred<Response<ActiveCardPaymentGatewayResponse>>
    
    
    @GET 
    fun getActiveUserCards(@Url url1: String?    ,  @Query("force_refresh") forceRefresh: Boolean?)
    : Deferred<Response<ListCardsResponse>>
    
    
    @POST 
    fun deleteUserCard(@Url url1: String?   ,@Body body: DeletehCardRequest)
    : Deferred<Response<DeleteCardsResponse>>
    
    
    @POST 
    fun verifyCustomerForPayment(@Url url1: String?   ,@Body body: ValidateCustomerRequest)
    : Deferred<Response<ValidateCustomerResponse>>
    
    
    @POST 
    fun verifyAndChargePayment(@Url url1: String?   ,@Body body: ChargeCustomerRequest)
    : Deferred<Response<ChargeCustomerResponse>>
    
    
    @POST 
    fun initialisePayment(@Url url1: String?   ,@Body body: PaymentInitializationRequest)
    : Deferred<Response<PaymentInitializationResponse>>
    
    
    @POST 
    fun checkAndUpdatePaymentStatus(@Url url1: String?   ,@Body body: PaymentStatusUpdateRequest)
    : Deferred<Response<PaymentStatusUpdateResponse>>
    
    
    @GET 
    fun getPaymentModeRoutes(@Url url1: String?    ,        @Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String, @Query("refresh") refresh: Boolean?, @Query("card_reference") cardReference: String?, @Query("user_details") userDetails: String?)
    : Deferred<Response<PaymentModeRouteResponse>>
    
    
    @GET 
    fun getPosPaymentModeRoutes(@Url url1: String?    ,         @Query("amount") amount: Int, @Query("cart_id") cartId: String, @Query("pincode") pincode: String, @Query("checkout_mode") checkoutMode: String, @Query("refresh") refresh: Boolean?, @Query("card_reference") cardReference: String?, @Query("order_type") orderType: String, @Query("user_details") userDetails: String?)
    : Deferred<Response<PaymentModeRouteResponse>>
    
    
    @GET 
    fun getRupifiBannerDetails(@Url url1: String?   )
    : Deferred<Response<RupifiBannerResponse>>
    
    
    @GET 
    fun getEpaylaterBannerDetails(@Url url1: String?   )
    : Deferred<Response<EpaylaterBannerResponse>>
    
    
    @POST 
    fun resendOrCancelPayment(@Url url1: String?   ,@Body body: ResendOrCancelPaymentRequest)
    : Deferred<Response<ResendOrCancelPaymentResponse>>
    
    
    @POST 
    fun renderHTML(@Url url1: String?   ,@Body body: renderHTMLRequest)
    : Deferred<Response<renderHTMLResponse>>
    
    
    @POST 
    fun validateVPA(@Url url1: String?   ,@Body body: ValidateVPARequest)
    : Deferred<Response<ValidateVPAResponse>>
    
    
    @GET 
    fun getActiveRefundTransferModes(@Url url1: String?   )
    : Deferred<Response<TransferModeResponse>>
    
    
    @PUT 
    fun enableOrDisableRefundTransferMode(@Url url1: String?   ,@Body body: UpdateRefundTransferModeRequest)
    : Deferred<Response<UpdateRefundTransferModeResponse>>
    
    
    @GET 
    fun getUserBeneficiariesDetail(@Url url1: String?    ,  @Query("order_id") orderId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    
    @GET 
    fun verifyIfscCode(@Url url1: String?    ,  @Query("ifsc_code") ifscCode: String?)
    : Deferred<Response<IfscCodeResponse>>
    
    
    @GET 
    fun getOrderBeneficiariesDetail(@Url url1: String?    ,  @Query("order_id") orderId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    
    @POST 
    fun verifyOtpAndAddBeneficiaryForBank(@Url url1: String?   ,@Body body: AddBeneficiaryViaOtpVerificationRequest)
    : Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>>
    
    
    @POST 
    fun addBeneficiaryDetails(@Url url1: String?   ,@Body body: AddBeneficiaryDetailsRequest)
    : Deferred<Response<RefundAccountResponse>>
    
    
    @POST 
    fun addRefundBankAccountUsingOTP(@Url url1: String?   ,@Body body: AddBeneficiaryDetailsOTPRequest)
    : Deferred<Response<RefundAccountResponse>>
    
    
    @POST 
    fun verifyOtpAndAddBeneficiaryForWallet(@Url url1: String?   ,@Body body: WalletOtpRequest)
    : Deferred<Response<WalletOtpResponse>>
    
    
    @POST 
    fun updateDefaultBeneficiary(@Url url1: String?   ,@Body body: SetDefaultBeneficiaryRequest)
    : Deferred<Response<SetDefaultBeneficiaryResponse>>
    
    
    @GET 
    fun getPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String?)
    : Deferred<Response<GetPaymentLinkResponse>>
    
    
    @POST 
    fun createPaymentLink(@Url url1: String?   ,@Body body: CreatePaymentLinkRequest)
    : Deferred<Response<CreatePaymentLinkResponse>>
    
    
    @POST 
    fun resendPaymentLink(@Url url1: String?   ,@Body body: CancelOrResendPaymentLinkRequest)
    : Deferred<Response<ResendPaymentLinkResponse>>
    
    
    @POST 
    fun cancelPaymentLink(@Url url1: String?   ,@Body body: CancelOrResendPaymentLinkRequest)
    : Deferred<Response<CancelPaymentLinkResponse>>
    
    
    @GET 
    fun getPaymentModeRoutesPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String)
    : Deferred<Response<PaymentModeRouteResponse>>
    
    
    @GET 
    fun pollingPaymentLink(@Url url1: String?    ,  @Query("payment_link_id") paymentLinkId: String?)
    : Deferred<Response<PollingPaymentLinkResponse>>
    
    
    @POST 
    fun createOrderHandlerPaymentLink(@Url url1: String?   ,@Body body: CreateOrderUserRequest)
    : Deferred<Response<CreateOrderUserResponse>>
    
    
    @POST 
    fun initialisePaymentPaymentLink(@Url url1: String?   ,@Body body: PaymentInitializationRequest)
    : Deferred<Response<PaymentInitializationResponse>>
    
    
    @POST 
    fun checkAndUpdatePaymentStatusPaymentLink(@Url url1: String?   ,@Body body: PaymentStatusUpdateRequest)
    : Deferred<Response<PaymentStatusUpdateResponse>>
    
    
    @GET 
    fun customerCreditSummary(@Url url1: String?    ,  @Query("aggregator") aggregator: String?)
    : Deferred<Response<CustomerCreditSummaryResponse>>
    
    
    @GET 
    fun redirectToAggregator(@Url url1: String?    ,   @Query("source") source: String?, @Query("aggregator") aggregator: String?)
    : Deferred<Response<RedirectToAggregatorResponse>>
    
    
    @GET 
    fun checkCredit(@Url url1: String?    ,  @Query("aggregator") aggregator: String?)
    : Deferred<Response<CheckCreditResponse>>
    
    
    @POST 
    fun customerOnboard(@Url url1: String?   ,@Body body: CustomerOnboardingRequest)
    : Deferred<Response<CustomerOnboardingResponse>>
    
}