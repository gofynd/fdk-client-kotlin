package com.sdk.application.payment

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class PaymentDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val paymentApiList by lazy {
        generatepaymentApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getAggregatorsConfig"] = "/service/application/payment/v1.0/config/aggregators/key".substring(1)
            
                    _relativeUrls["attachCardToCustomer"] = "/service/application/payment/v1.0/card/attach".substring(1)
            
                    _relativeUrls["getActiveCardAggregator"] = "/service/application/payment/v1.0/card/aggregator".substring(1)
            
                    _relativeUrls["getActiveUserCards"] = "/service/application/payment/v1.0/cards".substring(1)
            
                    _relativeUrls["deleteUserCard"] = "/service/application/payment/v1.0/card/remove".substring(1)
            
                    _relativeUrls["verifyCustomerForPayment"] = "/service/application/payment/v1.0/payment/customer/validation".substring(1)
            
                    _relativeUrls["verifyAndChargePayment"] = "/service/application/payment/v1.0/payment/confirm/charge".substring(1)
            
                    _relativeUrls["initialisePayment"] = "/service/application/payment/v1.0/payment/request".substring(1)
            
                    _relativeUrls["checkAndUpdatePaymentStatus"] = "/service/application/payment/v1.0/payment/confirm/polling".substring(1)
            
                    _relativeUrls["getPaymentModeRoutes"] = "/service/application/payment/v1.0/payment/options".substring(1)
            
                    _relativeUrls["getPosPaymentModeRoutes"] = "/service/application/payment/v1.0/payment/options/pos".substring(1)
            
                    _relativeUrls["walletLinkInitate"] = "/service/application/payment/v1.0/payment/options/wallet/link".substring(1)
            
                    _relativeUrls["linkWallet"] = "/service/application/payment/v1.0/payment/options/wallet/verify".substring(1)
            
                    _relativeUrls["delinkWallet"] = "/service/application/payment/v1.0/payment/options/wallet/delink".substring(1)
            
                    _relativeUrls["getRupifiBannerDetails"] = "/service/application/payment/v1.0/rupifi/banner".substring(1)
            
                    _relativeUrls["getEpaylaterBannerDetails"] = "/service/application/payment/v1.0/epaylater/banner".substring(1)
            
                    _relativeUrls["resendOrCancelPayment"] = "/service/application/payment/v1.0/payment/resend_or_cancel".substring(1)
            
                    _relativeUrls["renderHTML"] = "/service/application/payment/v1.0/payment/html/render/".substring(1)
            
                    _relativeUrls["validateVPA"] = "/service/application/payment/v1.0/validate-vpa".substring(1)
            
                    _relativeUrls["cardDetails"] = "/service/application/payment/v1.0/cards/info/{card_info}".substring(1)
            
                    _relativeUrls["getActiveRefundTransferModes"] = "/service/application/payment/v1.0/refund/transfer-mode".substring(1)
            
                    _relativeUrls["enableOrDisableRefundTransferMode"] = "/service/application/payment/v1.0/refund/transfer-mode".substring(1)
            
                    _relativeUrls["getUserBeneficiariesDetail"] = "/service/application/payment/v1.0/refund/user/beneficiary".substring(1)
            
                    _relativeUrls["verifyIfscCode"] = "/service/application/payment/v1.0/ifsc-code/verify".substring(1)
            
                    _relativeUrls["getOrderBeneficiariesDetail"] = "/service/application/payment/v1.0/refund/order/beneficiaries".substring(1)
            
                    _relativeUrls["verifyOtpAndAddBeneficiaryForBank"] = "/service/application/payment/v1.0/refund/verification/bank".substring(1)
            
                    _relativeUrls["addBeneficiaryDetails"] = "/service/application/payment/v1.0/refund/account".substring(1)
            
                    _relativeUrls["addRefundBankAccountUsingOTP"] = "/service/application/payment/v1.0/refund/account/otp".substring(1)
            
                    _relativeUrls["verifyOtpAndAddBeneficiaryForWallet"] = "/service/application/payment/v1.0/refund/verification/wallet".substring(1)
            
                    _relativeUrls["updateDefaultBeneficiary"] = "/service/application/payment/v1.0/refund/beneficiary/default".substring(1)
            
                    _relativeUrls["getPaymentLink"] = "/service/application/payment/v1.0/create-payment-link/".substring(1)
            
                    _relativeUrls["createPaymentLink"] = "/service/application/payment/v1.0/create-payment-link/".substring(1)
            
                    _relativeUrls["resendPaymentLink"] = "/service/application/payment/v1.0/resend-payment-link/".substring(1)
            
                    _relativeUrls["cancelPaymentLink"] = "/service/application/payment/v1.0/cancel-payment-link/".substring(1)
            
                    _relativeUrls["getPaymentModeRoutesPaymentLink"] = "/service/application/payment/v1.0/payment/options/link/".substring(1)
            
                    _relativeUrls["pollingPaymentLink"] = "/service/application/payment/v1.0/polling-payment-link/".substring(1)
            
                    _relativeUrls["createOrderHandlerPaymentLink"] = "/service/application/payment/v1.0/create-order/link/".substring(1)
            
                    _relativeUrls["initialisePaymentPaymentLink"] = "/service/application/payment/v1.0/payment/request/link/".substring(1)
            
                    _relativeUrls["checkAndUpdatePaymentStatusPaymentLink"] = "/service/application/payment/v1.0/payment/confirm/polling/link/".substring(1)
            
                    _relativeUrls["customerCreditSummary"] = "/service/application/payment/v1.0/payment/credit-summary/".substring(1)
            
                    _relativeUrls["redirectToAggregator"] = "/service/application/payment/v1.0/payment/redirect-to-aggregator/".substring(1)
            
                    _relativeUrls["checkCredit"] = "/service/application/payment/v1.0/check-credits/".substring(1)
            
                    _relativeUrls["customerOnboard"] = "/service/application/payment/v1.0/credit-onboard/".substring(1)
            
                    _relativeUrls["outstandingOrderDetails"] = "/service/application/payment/v1.0/payment/outstanding-orders/".substring(1)
            
                    _relativeUrls["paidOrderDetails"] = "/service/application/payment/v1.0/payment/paid-orders/".substring(1)
            
                    _relativeUrls["createPaymentOrder"] = "/service/application/payment/v1.0/payment-orders/".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generatepaymentApiList(): PaymentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        if(unauthorizedAction != null){
            val accessUnauthorizedInterceptor = AccessUnauthorizedInterceptor(unauthorizedAction)
            interceptorList.add(accessUnauthorizedInterceptor)
        }
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationPayment",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(PaymentApiList::class.java) as? PaymentApiList
    }
    
    suspend fun getAggregatorsConfig(xApiToken: String?=null, refresh: Boolean?=null): Response<AggregatorsConfigDetailResponse>? {
        var fullUrl : String? = _relativeUrls["getAggregatorsConfig"] 
        
        return paymentApiList?.getAggregatorsConfig(fullUrl    ,  xApiToken = xApiToken,    refresh = refresh)}

    
    
    suspend fun attachCardToCustomer(body: AttachCardRequest): Response<AttachCardsResponse>? {
        var fullUrl : String? = _relativeUrls["attachCardToCustomer"] 
        
        return paymentApiList?.attachCardToCustomer(fullUrl  ,body = body)}

    
    
    suspend fun getActiveCardAggregator(refresh: Boolean?=null): Response<ActiveCardPaymentGatewayResponse>? {
        var fullUrl : String? = _relativeUrls["getActiveCardAggregator"] 
        
        return paymentApiList?.getActiveCardAggregator(fullUrl    ,  refresh = refresh)}

    
    
    suspend fun getActiveUserCards(forceRefresh: Boolean?=null): Response<ListCardsResponse>? {
        var fullUrl : String? = _relativeUrls["getActiveUserCards"] 
        
        return paymentApiList?.getActiveUserCards(fullUrl    ,  forceRefresh = forceRefresh)}

    
    
    suspend fun deleteUserCard(body: DeletehCardRequest): Response<DeleteCardsResponse>? {
        var fullUrl : String? = _relativeUrls["deleteUserCard"] 
        
        return paymentApiList?.deleteUserCard(fullUrl  ,body = body)}

    
    
    suspend fun verifyCustomerForPayment(body: ValidateCustomerRequest): Response<ValidateCustomerResponse>? {
        var fullUrl : String? = _relativeUrls["verifyCustomerForPayment"] 
        
        return paymentApiList?.verifyCustomerForPayment(fullUrl  ,body = body)}

    
    
    suspend fun verifyAndChargePayment(body: ChargeCustomerRequest): Response<ChargeCustomerResponse>? {
        var fullUrl : String? = _relativeUrls["verifyAndChargePayment"] 
        
        return paymentApiList?.verifyAndChargePayment(fullUrl  ,body = body)}

    
    
    suspend fun initialisePayment(body: PaymentInitializationRequest): Response<PaymentInitializationResponse>? {
        var fullUrl : String? = _relativeUrls["initialisePayment"] 
        
        return paymentApiList?.initialisePayment(fullUrl  ,body = body)}

    
    
    suspend fun checkAndUpdatePaymentStatus(body: PaymentStatusUpdateRequest): Response<PaymentStatusUpdateResponse>? {
        var fullUrl : String? = _relativeUrls["checkAndUpdatePaymentStatus"] 
        
        return paymentApiList?.checkAndUpdatePaymentStatus(fullUrl  ,body = body)}

    
    
    suspend fun getPaymentModeRoutes(amount: Int, cartId: String?=null, checkoutMode: String?=null, refresh: Boolean?=null, orderId: String?=null, cardReference: String?=null, userDetails: String?=null, displaySplit: Boolean?=null, advancePayment: Boolean?=null, shipmentId: String?=null): Response<PaymentModeRouteResponse>? {
        var fullUrl : String? = _relativeUrls["getPaymentModeRoutes"] 
        
        return paymentApiList?.getPaymentModeRoutes(fullUrl    ,  amount = amount,    cartId = cartId,    checkoutMode = checkoutMode,    refresh = refresh,    orderId = orderId,    cardReference = cardReference,    userDetails = userDetails,    displaySplit = displaySplit,    advancePayment = advancePayment,    shipmentId = shipmentId)}

    
    
    suspend fun getPosPaymentModeRoutes(amount: Int, cartId: String?=null, pincode: String, checkoutMode: String?=null, refresh: Boolean?=null, cardReference: String?=null, orderType: String, userDetails: String?=null): Response<PaymentModeRouteResponse>? {
        var fullUrl : String? = _relativeUrls["getPosPaymentModeRoutes"] 
        
        return paymentApiList?.getPosPaymentModeRoutes(fullUrl    ,  amount = amount,    cartId = cartId,    pincode = pincode,    checkoutMode = checkoutMode,    refresh = refresh,    cardReference = cardReference,    orderType = orderType,    userDetails = userDetails)}

    
    
    suspend fun walletLinkInitate(body: WalletLinkRequestSchema): Response<WalletResponseSchema>? {
        var fullUrl : String? = _relativeUrls["walletLinkInitate"] 
        
        return paymentApiList?.walletLinkInitate(fullUrl  ,body = body)}

    
    
    suspend fun linkWallet(body: WalletVerifyRequestSchema): Response<WalletResponseSchema>? {
        var fullUrl : String? = _relativeUrls["linkWallet"] 
        
        return paymentApiList?.linkWallet(fullUrl  ,body = body)}

    
    
    suspend fun delinkWallet(body: WalletDelinkRequestSchema): Response<WalletResponseSchema>? {
        var fullUrl : String? = _relativeUrls["delinkWallet"] 
        
        return paymentApiList?.delinkWallet(fullUrl  ,body = body)}

    
    
    suspend fun getRupifiBannerDetails(): Response<RupifiBannerResponse>? {
        var fullUrl : String? = _relativeUrls["getRupifiBannerDetails"] 
        
        return paymentApiList?.getRupifiBannerDetails(fullUrl  )}

    
    
    suspend fun getEpaylaterBannerDetails(): Response<EpaylaterBannerResponse>? {
        var fullUrl : String? = _relativeUrls["getEpaylaterBannerDetails"] 
        
        return paymentApiList?.getEpaylaterBannerDetails(fullUrl  )}

    
    
    suspend fun resendOrCancelPayment(body: ResendOrCancelPaymentRequest): Response<ResendOrCancelPaymentResponse>? {
        var fullUrl : String? = _relativeUrls["resendOrCancelPayment"] 
        
        return paymentApiList?.resendOrCancelPayment(fullUrl  ,body = body)}

    
    
    suspend fun renderHTML(body: renderHTMLRequest): Response<renderHTMLResponse>? {
        var fullUrl : String? = _relativeUrls["renderHTML"] 
        
        return paymentApiList?.renderHTML(fullUrl  ,body = body)}

    
    
    suspend fun validateVPA(body: ValidateVPARequest): Response<ValidateVPAResponse>? {
        var fullUrl : String? = _relativeUrls["validateVPA"] 
        
        return paymentApiList?.validateVPA(fullUrl  ,body = body)}

    
    
    suspend fun cardDetails(cardInfo: String, aggregator: String?=null): Response<CardDetailsResponse>? {
        var fullUrl : String? = _relativeUrls["cardDetails"] 
        
        fullUrl = fullUrl?.replace("{" + "card_info" +"}",cardInfo.toString())
        
        return paymentApiList?.cardDetails(fullUrl     ,  aggregator = aggregator)}

    
    
    suspend fun getActiveRefundTransferModes(): Response<TransferModeResponse>? {
        var fullUrl : String? = _relativeUrls["getActiveRefundTransferModes"] 
        
        return paymentApiList?.getActiveRefundTransferModes(fullUrl  )}

    
    
    suspend fun enableOrDisableRefundTransferMode(body: UpdateRefundTransferModeRequest): Response<UpdateRefundTransferModeResponse>? {
        var fullUrl : String? = _relativeUrls["enableOrDisableRefundTransferMode"] 
        
        return paymentApiList?.enableOrDisableRefundTransferMode(fullUrl  ,body = body)}

    
    
    suspend fun getUserBeneficiariesDetail(orderId: String): Response<OrderBeneficiaryResponse>? {
        var fullUrl : String? = _relativeUrls["getUserBeneficiariesDetail"] 
        
        return paymentApiList?.getUserBeneficiariesDetail(fullUrl    ,  orderId = orderId)}

    
    
    suspend fun verifyIfscCode(ifscCode: String?=null): Response<IfscCodeResponse>? {
        var fullUrl : String? = _relativeUrls["verifyIfscCode"] 
        
        return paymentApiList?.verifyIfscCode(fullUrl    ,  ifscCode = ifscCode)}

    
    
    suspend fun getOrderBeneficiariesDetail(orderId: String): Response<OrderBeneficiaryResponse>? {
        var fullUrl : String? = _relativeUrls["getOrderBeneficiariesDetail"] 
        
        return paymentApiList?.getOrderBeneficiariesDetail(fullUrl    ,  orderId = orderId)}

    
    
    suspend fun verifyOtpAndAddBeneficiaryForBank(body: AddBeneficiaryViaOtpVerificationRequest): Response<AddBeneficiaryViaOtpVerificationResponse>? {
        var fullUrl : String? = _relativeUrls["verifyOtpAndAddBeneficiaryForBank"] 
        
        return paymentApiList?.verifyOtpAndAddBeneficiaryForBank(fullUrl  ,body = body)}

    
    
    suspend fun addBeneficiaryDetails(body: AddBeneficiaryDetailsRequest): Response<RefundAccountResponse>? {
        var fullUrl : String? = _relativeUrls["addBeneficiaryDetails"] 
        
        return paymentApiList?.addBeneficiaryDetails(fullUrl  ,body = body)}

    
    
    suspend fun addRefundBankAccountUsingOTP(body: AddBeneficiaryDetailsOTPRequest): Response<RefundAccountResponse>? {
        var fullUrl : String? = _relativeUrls["addRefundBankAccountUsingOTP"] 
        
        return paymentApiList?.addRefundBankAccountUsingOTP(fullUrl  ,body = body)}

    
    
    suspend fun verifyOtpAndAddBeneficiaryForWallet(body: WalletOtpRequest): Response<WalletOtpResponse>? {
        var fullUrl : String? = _relativeUrls["verifyOtpAndAddBeneficiaryForWallet"] 
        
        return paymentApiList?.verifyOtpAndAddBeneficiaryForWallet(fullUrl  ,body = body)}

    
    
    suspend fun updateDefaultBeneficiary(body: SetDefaultBeneficiaryRequest): Response<SetDefaultBeneficiaryResponse>? {
        var fullUrl : String? = _relativeUrls["updateDefaultBeneficiary"] 
        
        return paymentApiList?.updateDefaultBeneficiary(fullUrl  ,body = body)}

    
    
    suspend fun getPaymentLink(paymentLinkId: String?=null): Response<GetPaymentLinkResponse>? {
        var fullUrl : String? = _relativeUrls["getPaymentLink"] 
        
        return paymentApiList?.getPaymentLink(fullUrl    ,  paymentLinkId = paymentLinkId)}

    
    
    suspend fun createPaymentLink(body: CreatePaymentLinkRequest): Response<CreatePaymentLinkResponse>? {
        var fullUrl : String? = _relativeUrls["createPaymentLink"] 
        
        return paymentApiList?.createPaymentLink(fullUrl  ,body = body)}

    
    
    suspend fun resendPaymentLink(body: CancelOrResendPaymentLinkRequest): Response<ResendPaymentLinkResponse>? {
        var fullUrl : String? = _relativeUrls["resendPaymentLink"] 
        
        return paymentApiList?.resendPaymentLink(fullUrl  ,body = body)}

    
    
    suspend fun cancelPaymentLink(body: CancelOrResendPaymentLinkRequest): Response<CancelPaymentLinkResponse>? {
        var fullUrl : String? = _relativeUrls["cancelPaymentLink"] 
        
        return paymentApiList?.cancelPaymentLink(fullUrl  ,body = body)}

    
    
    suspend fun getPaymentModeRoutesPaymentLink(paymentLinkId: String): Response<PaymentModeRouteResponse>? {
        var fullUrl : String? = _relativeUrls["getPaymentModeRoutesPaymentLink"] 
        
        return paymentApiList?.getPaymentModeRoutesPaymentLink(fullUrl    ,  paymentLinkId = paymentLinkId)}

    
    
    suspend fun pollingPaymentLink(paymentLinkId: String?=null): Response<PollingPaymentLinkResponse>? {
        var fullUrl : String? = _relativeUrls["pollingPaymentLink"] 
        
        return paymentApiList?.pollingPaymentLink(fullUrl    ,  paymentLinkId = paymentLinkId)}

    
    
    suspend fun createOrderHandlerPaymentLink(body: CreateOrderUserRequest): Response<CreateOrderUserResponse>? {
        var fullUrl : String? = _relativeUrls["createOrderHandlerPaymentLink"] 
        
        return paymentApiList?.createOrderHandlerPaymentLink(fullUrl  ,body = body)}

    
    
    suspend fun initialisePaymentPaymentLink(body: PaymentInitializationRequest): Response<PaymentInitializationResponse>? {
        var fullUrl : String? = _relativeUrls["initialisePaymentPaymentLink"] 
        
        return paymentApiList?.initialisePaymentPaymentLink(fullUrl  ,body = body)}

    
    
    suspend fun checkAndUpdatePaymentStatusPaymentLink(body: PaymentStatusUpdateRequest): Response<PaymentStatusUpdateResponse>? {
        var fullUrl : String? = _relativeUrls["checkAndUpdatePaymentStatusPaymentLink"] 
        
        return paymentApiList?.checkAndUpdatePaymentStatusPaymentLink(fullUrl  ,body = body)}

    
    
    suspend fun customerCreditSummary(aggregator: String?=null): Response<CustomerCreditSummaryResponse>? {
        var fullUrl : String? = _relativeUrls["customerCreditSummary"] 
        
        return paymentApiList?.customerCreditSummary(fullUrl    ,  aggregator = aggregator)}

    
    
    suspend fun redirectToAggregator(source: String?=null, aggregator: String?=null): Response<RedirectToAggregatorResponse>? {
        var fullUrl : String? = _relativeUrls["redirectToAggregator"] 
        
        return paymentApiList?.redirectToAggregator(fullUrl    ,  source = source,    aggregator = aggregator)}

    
    
    suspend fun checkCredit(aggregator: String?=null): Response<CheckCreditResponse>? {
        var fullUrl : String? = _relativeUrls["checkCredit"] 
        
        return paymentApiList?.checkCredit(fullUrl    ,  aggregator = aggregator)}

    
    
    suspend fun customerOnboard(body: CustomerOnboardingRequest): Response<CustomerOnboardingResponse>? {
        var fullUrl : String? = _relativeUrls["customerOnboard"] 
        
        return paymentApiList?.customerOnboard(fullUrl  ,body = body)}

    
    
    suspend fun outstandingOrderDetails(aggregator: String?=null): Response<OutstandingOrderDetailsResponse>? {
        var fullUrl : String? = _relativeUrls["outstandingOrderDetails"] 
        
        return paymentApiList?.outstandingOrderDetails(fullUrl    ,  aggregator = aggregator)}

    
    
    suspend fun paidOrderDetails(aggregator: String?=null): Response<PaidOrderDetailsResponse>? {
        var fullUrl : String? = _relativeUrls["paidOrderDetails"] 
        
        return paymentApiList?.paidOrderDetails(fullUrl    ,  aggregator = aggregator)}

    
    
    suspend fun createPaymentOrder(body: PaymentOrderRequest): Response<PaymentOrderResponse>? {
        var fullUrl : String? = _relativeUrls["createPaymentOrder"] 
        
        return paymentApiList?.createPaymentOrder(fullUrl  ,body = body)}

    
    
}
