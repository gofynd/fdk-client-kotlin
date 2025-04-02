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
            
                    _relativeUrls["updateUserCard"] = "/service/application/payment/v1.0/card/aggregator".substring(1)
            
                    _relativeUrls["getActiveUserCards"] = "/service/application/payment/v1.0/cards".substring(1)
            
                    _relativeUrls["updateActiveCards"] = "/service/application/payment/v1.0/cards".substring(1)
            
                    _relativeUrls["deleteUserCard"] = "/service/application/payment/v1.0/card/remove".substring(1)
            
                    _relativeUrls["verifyCustomerForPayment"] = "/service/application/payment/v1.0/payment/customer/validation".substring(1)
            
                    _relativeUrls["verifyAndChargePayment"] = "/service/application/payment/v1.0/payment/confirm/charge".substring(1)
            
                    _relativeUrls["initialisePayment"] = "/service/application/payment/v1.0/payment/request".substring(1)
            
                    _relativeUrls["checkAndUpdatePaymentStatus"] = "/service/application/payment/v1.0/payment/confirm/polling".substring(1)
            
                    _relativeUrls["getPaymentModeRoutes"] = "/service/application/payment/v1.0/payment/options".substring(1)
            
                    _relativeUrls["getPosPaymentModeRoutes"] = "/service/application/payment/v1.0/payment/options/pos".substring(1)
            
                    _relativeUrls["walletLinkInitiate"] = "/service/application/payment/v1.0/payment/options/wallet/link".substring(1)
            
                    _relativeUrls["linkWallet"] = "/service/application/payment/v1.0/payment/options/wallet/verify".substring(1)
            
                    _relativeUrls["delinkWallet"] = "/service/application/payment/v1.0/payment/options/wallet/delink".substring(1)
            
                    _relativeUrls["getRupifiBannerDetails"] = "/service/application/payment/v1.0/rupifi/banner".substring(1)
            
                    _relativeUrls["getEpaylaterBannerDetails"] = "/service/application/payment/v1.0/epaylater/banner".substring(1)
            
                    _relativeUrls["resendOrCancelPayment"] = "/service/application/payment/v1.0/payment/resend_or_cancel".substring(1)
            
                    _relativeUrls["renderHTML"] = "/service/application/payment/v1.0/payment/html/render".substring(1)
            
                    _relativeUrls["validateVPA"] = "/service/application/payment/v1.0/validate-vpa".substring(1)
            
                    _relativeUrls["cardDetails"] = "/service/application/payment/v1.0/cards/info/{card_info}".substring(1)
            
                    _relativeUrls["getActiveRefundTransferModes"] = "/service/application/payment/v1.0/refund/transfer-mode".substring(1)
            
                    _relativeUrls["enableOrDisableRefundTransferMode"] = "/service/application/payment/v1.0/refund/transfer-mode".substring(1)
            
                    _relativeUrls["getUserBeneficiariesDetail"] = "/service/application/payment/v1.0/refund/user/beneficiary".substring(1)
            
                    _relativeUrls["verifyIfscCode"] = "/service/application/payment/v1.0/ifsc-code/verify".substring(1)
            
                    _relativeUrls["getOrderBeneficiariesDetail"] = "/service/application/payment/v1.0/refund/order/beneficiaries".substring(1)
            
                    _relativeUrls["addBeneficiaryDetails"] = "/service/application/payment/v1.0/refund/account".substring(1)
            
                    _relativeUrls["deleteBeneficiaryDetails"] = "/service/application/payment/v1.0/refund/account".substring(1)
            
                    _relativeUrls["verifyOtpAndAddBeneficiaryForBank"] = "/service/application/payment/v1.0/refund/verification/bank".substring(1)
            
                    _relativeUrls["addRefundBankAccountUsingOTP"] = "/service/application/payment/v1.0/refund/account/otp".substring(1)
            
                    _relativeUrls["getotpOrderBeneficiariesDetail"] = "/service/application/payment/v1.0/refund/account/otp".substring(1)
            
                    _relativeUrls["verifyOtpAndAddBeneficiaryForWallet"] = "/service/application/payment/v1.0/refund/verification/wallet".substring(1)
            
                    _relativeUrls["updateDefaultBeneficiary"] = "/service/application/payment/v1.0/refund/beneficiary/default".substring(1)
            
                    _relativeUrls["getBenficiaryOrder"] = "/service/application/payment/v1.0/refund/beneficiaries/orders".substring(1)
            
                    _relativeUrls["getPaymentLink"] = "/service/application/payment/v1.0/create-payment-link".substring(1)
            
                    _relativeUrls["createPaymentLink"] = "/service/application/payment/v1.0/create-payment-link".substring(1)
            
                    _relativeUrls["getPaymentLinkId"] = "/service/application/payment/v1.0/create-payment-link/{id}".substring(1)
            
                    _relativeUrls["resendPaymentLink"] = "/service/application/payment/v1.0/resend-payment-link".substring(1)
            
                    _relativeUrls["getPaymentModeRoutesPaymentLink"] = "/service/application/payment/v1.0/payment/options/link".substring(1)
            
                    _relativeUrls["pollingPaymentLink"] = "/service/application/payment/v1.0/polling-payment-link".substring(1)
            
                    _relativeUrls["createOrderHandlerPaymentLink"] = "/service/application/payment/v1.0/create-order/link".substring(1)
            
                    _relativeUrls["initialisePaymentPaymentLink"] = "/service/application/payment/v1.0/payment/request/link".substring(1)
            
                    _relativeUrls["checkAndUpdatePaymentStatusPaymentLink"] = "/service/application/payment/v1.0/payment/confirm/polling/link".substring(1)
            
                    _relativeUrls["customerCreditSummary"] = "/service/application/payment/v1.0/payment/credit-summary".substring(1)
            
                    _relativeUrls["redirectToAggregator"] = "/service/application/payment/v1.0/payment/redirect-to-aggregator".substring(1)
            
                    _relativeUrls["checkCredit"] = "/service/application/payment/v1.0/check-credits".substring(1)
            
                    _relativeUrls["customerOnboard"] = "/service/application/payment/v1.0/credit-onboard".substring(1)
            
                    _relativeUrls["outstandingOrderDetails"] = "/service/application/payment/v1.0/payment/outstanding-orders".substring(1)
            
                    _relativeUrls["cancelPaymentLink"] = "/service/application/payment/v1.0/cancel-payment-link".substring(1)
            
                    _relativeUrls["paidOrderDetails"] = "/service/application/payment/v1.0/payment/paid-orders".substring(1)
            
                    _relativeUrls["createPaymentOrder"] = "/service/application/payment/v1.0/payment-orders".substring(1)
            
                    _relativeUrls["setRefundOptionforShipment"] = "/service/application/payment/v1.0/payment/refundoptions".substring(1)
            
                    _relativeUrls["getSelectedRefundOption"] = "/service/application/payment/v1.0/payment/selected_refund_options".substring(1)
            
                    _relativeUrls["getUserBeneficiariesDetailV2"] = "/service/application/payment/v2.0/refund/user/beneficiary".substring(1)
            
                    _relativeUrls["validateBeneficiaryAddress"] = "/service/application/payment/v1.0/validate/beneficiary-address".substring(1)
            
                    _relativeUrls["confirmPayment"] = "/service/application/payment/v1.0/payment/confirm".substring(1)
            
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
    
    suspend fun getAggregatorsConfig(xApiToken: String?=null,refresh: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<AggregatorsConfigDetailResponse>? {
        var fullUrl : String? = _relativeUrls["getAggregatorsConfig"]
        
        return paymentApiList?.getAggregatorsConfig(fullUrl,   xApiToken = xApiToken,  refresh = refresh,headers = headers)}

    
    
    suspend fun attachCardToCustomer(body: AttachCardRequest, headers: Map<String, String> = emptyMap()): Response<AttachCardsResponse>? {
        var fullUrl : String? = _relativeUrls["attachCardToCustomer"]
        
        return paymentApiList?.attachCardToCustomer(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getActiveCardAggregator(refresh: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<ActiveCardPaymentGatewayResponse>? {
        var fullUrl : String? = _relativeUrls["getActiveCardAggregator"]
        
        return paymentApiList?.getActiveCardAggregator(fullUrl,   refresh = refresh,headers = headers)}

    
    
    suspend fun updateUserCard(body: UpdateAggregatorCardRequest, headers: Map<String, String> = emptyMap()): Response<UpdateAggregatorCardResponse>? {
        var fullUrl : String? = _relativeUrls["updateUserCard"]
        
        return paymentApiList?.updateUserCard(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getActiveUserCards(forceRefresh: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<ListCardsResponse>? {
        var fullUrl : String? = _relativeUrls["getActiveUserCards"]
        
        return paymentApiList?.getActiveUserCards(fullUrl,   forceRefresh = forceRefresh,headers = headers)}

    
    
    suspend fun updateActiveCards(body: UpdateAggregatorCardRequest, headers: Map<String, String> = emptyMap()): Response<UpdateCardResponse>? {
        var fullUrl : String? = _relativeUrls["updateActiveCards"]
        
        return paymentApiList?.updateActiveCards(fullUrl, body = body,headers = headers)}

    
    
    suspend fun deleteUserCard(body: DeletehCardRequest, headers: Map<String, String> = emptyMap()): Response<DeleteCardsResponse>? {
        var fullUrl : String? = _relativeUrls["deleteUserCard"]
        
        return paymentApiList?.deleteUserCard(fullUrl, body = body,headers = headers)}

    
    
    suspend fun verifyCustomerForPayment(body: ValidateCustomerRequest, headers: Map<String, String> = emptyMap()): Response<ValidateCustomerResponse>? {
        var fullUrl : String? = _relativeUrls["verifyCustomerForPayment"]
        
        return paymentApiList?.verifyCustomerForPayment(fullUrl, body = body,headers = headers)}

    
    
    suspend fun verifyAndChargePayment(body: ChargeCustomerRequest, headers: Map<String, String> = emptyMap()): Response<ChargeCustomerResponse>? {
        var fullUrl : String? = _relativeUrls["verifyAndChargePayment"]
        
        return paymentApiList?.verifyAndChargePayment(fullUrl, body = body,headers = headers)}

    
    
    suspend fun initialisePayment(body: PaymentInitializationRequest, headers: Map<String, String> = emptyMap()): Response<PaymentInitializationResponse>? {
        var fullUrl : String? = _relativeUrls["initialisePayment"]
        
        return paymentApiList?.initialisePayment(fullUrl, body = body,headers = headers)}

    
    
    suspend fun checkAndUpdatePaymentStatus(body: PaymentStatusUpdateRequest, headers: Map<String, String> = emptyMap()): Response<PaymentStatusUpdateResponse>? {
        var fullUrl : String? = _relativeUrls["checkAndUpdatePaymentStatus"]
        
        return paymentApiList?.checkAndUpdatePaymentStatus(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getPaymentModeRoutes(amount: Int,cartId: String?=null,checkoutMode: String?=null,refresh: Boolean?=null,orderId: String?=null,cardReference: String?=null,userDetails: String?=null,displaySplit: Boolean?=null,advancePayment: Boolean?=null,shipmentId: String?=null, headers: Map<String, String> = emptyMap()): Response<PaymentModeRouteResponse>? {
        var fullUrl : String? = _relativeUrls["getPaymentModeRoutes"]
        
        return paymentApiList?.getPaymentModeRoutes(fullUrl,   amount = amount,  cartId = cartId,  checkoutMode = checkoutMode,  refresh = refresh,  orderId = orderId,  cardReference = cardReference,  userDetails = userDetails,  displaySplit = displaySplit,  advancePayment = advancePayment,  shipmentId = shipmentId,headers = headers)}

    
    
    suspend fun getPosPaymentModeRoutes(amount: Int,cartId: String?=null,pincode: String,checkoutMode: String?=null,refresh: Boolean?=null,cardReference: String?=null,orderType: String,userDetails: String?=null, headers: Map<String, String> = emptyMap()): Response<PaymentModeRouteResponse>? {
        var fullUrl : String? = _relativeUrls["getPosPaymentModeRoutes"]
        
        return paymentApiList?.getPosPaymentModeRoutes(fullUrl,   amount = amount,  cartId = cartId,  pincode = pincode,  checkoutMode = checkoutMode,  refresh = refresh,  cardReference = cardReference,  orderType = orderType,  userDetails = userDetails,headers = headers)}

    
    
    suspend fun walletLinkInitiate(body: WalletLinkRequestSchema, headers: Map<String, String> = emptyMap()): Response<WalletResponseSchema>? {
        var fullUrl : String? = _relativeUrls["walletLinkInitiate"]
        
        return paymentApiList?.walletLinkInitiate(fullUrl, body = body,headers = headers)}

    
    
    suspend fun linkWallet(body: WalletVerifyRequestSchema, headers: Map<String, String> = emptyMap()): Response<WalletResponseSchema>? {
        var fullUrl : String? = _relativeUrls["linkWallet"]
        
        return paymentApiList?.linkWallet(fullUrl, body = body,headers = headers)}

    
    
    suspend fun delinkWallet(body: WalletDelinkRequestSchema, headers: Map<String, String> = emptyMap()): Response<WalletResponseSchema>? {
        var fullUrl : String? = _relativeUrls["delinkWallet"]
        
        return paymentApiList?.delinkWallet(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getRupifiBannerDetails( headers: Map<String, String> = emptyMap()): Response<RupifiBannerResponse>? {
        var fullUrl : String? = _relativeUrls["getRupifiBannerDetails"]
        
        return paymentApiList?.getRupifiBannerDetails(fullUrl, headers = headers)}

    
    
    suspend fun getEpaylaterBannerDetails( headers: Map<String, String> = emptyMap()): Response<EpaylaterBannerResponse>? {
        var fullUrl : String? = _relativeUrls["getEpaylaterBannerDetails"]
        
        return paymentApiList?.getEpaylaterBannerDetails(fullUrl, headers = headers)}

    
    
    suspend fun resendOrCancelPayment(body: ResendOrCancelPaymentRequest, headers: Map<String, String> = emptyMap()): Response<ResendOrCancelPaymentResponse>? {
        var fullUrl : String? = _relativeUrls["resendOrCancelPayment"]
        
        return paymentApiList?.resendOrCancelPayment(fullUrl, body = body,headers = headers)}

    
    
    suspend fun renderHTML(body: renderHTMLRequest, headers: Map<String, String> = emptyMap()): Response<renderHTMLResponse>? {
        var fullUrl : String? = _relativeUrls["renderHTML"]
        
        return paymentApiList?.renderHTML(fullUrl, body = body,headers = headers)}

    
    
    suspend fun validateVPA(body: ValidateVPARequest, headers: Map<String, String> = emptyMap()): Response<ValidateVPAResponse>? {
        var fullUrl : String? = _relativeUrls["validateVPA"]
        
        return paymentApiList?.validateVPA(fullUrl, body = body,headers = headers)}

    
    
    suspend fun cardDetails(cardInfo: String,aggregator: String?=null, headers: Map<String, String> = emptyMap()): Response<CardDetailsResponse>? {
        var fullUrl : String? = _relativeUrls["cardDetails"]
        
        fullUrl = fullUrl?.replace("{" + "card_info" +"}",cardInfo.toString())
        
        return paymentApiList?.cardDetails(fullUrl,    aggregator = aggregator,headers = headers)}

    
    
    suspend fun getActiveRefundTransferModes( headers: Map<String, String> = emptyMap()): Response<TransferModeResponse>? {
        var fullUrl : String? = _relativeUrls["getActiveRefundTransferModes"]
        
        return paymentApiList?.getActiveRefundTransferModes(fullUrl, headers = headers)}

    
    
    suspend fun enableOrDisableRefundTransferMode(body: UpdateRefundTransferModeRequest, headers: Map<String, String> = emptyMap()): Response<UpdateRefundTransferModeResponse>? {
        var fullUrl : String? = _relativeUrls["enableOrDisableRefundTransferMode"]
        
        return paymentApiList?.enableOrDisableRefundTransferMode(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getUserBeneficiariesDetail(orderId: String, headers: Map<String, String> = emptyMap()): Response<OrderBeneficiaryResponse>? {
        var fullUrl : String? = _relativeUrls["getUserBeneficiariesDetail"]
        
        return paymentApiList?.getUserBeneficiariesDetail(fullUrl,   orderId = orderId,headers = headers)}

    
    
    suspend fun verifyIfscCode(ifscCode: String?=null, headers: Map<String, String> = emptyMap()): Response<IfscCodeResponse>? {
        var fullUrl : String? = _relativeUrls["verifyIfscCode"]
        
        return paymentApiList?.verifyIfscCode(fullUrl,   ifscCode = ifscCode,headers = headers)}

    
    
    suspend fun getOrderBeneficiariesDetail(orderId: String, headers: Map<String, String> = emptyMap()): Response<OrderBeneficiaryResponse>? {
        var fullUrl : String? = _relativeUrls["getOrderBeneficiariesDetail"]
        
        return paymentApiList?.getOrderBeneficiariesDetail(fullUrl,   orderId = orderId,headers = headers)}

    
    
    suspend fun addBeneficiaryDetails(body: AddBeneficiaryDetailsRequest, headers: Map<String, String> = emptyMap()): Response<RefundAccountResponse>? {
        var fullUrl : String? = _relativeUrls["addBeneficiaryDetails"]
        
        return paymentApiList?.addBeneficiaryDetails(fullUrl, body = body,headers = headers)}

    
    
    suspend fun deleteBeneficiaryDetails(body: DeleteBeneficiaryRequest, headers: Map<String, String> = emptyMap()): Response<DeleteRefundAccountResponse>? {
        var fullUrl : String? = _relativeUrls["deleteBeneficiaryDetails"]
        
        return paymentApiList?.deleteBeneficiaryDetails(fullUrl, body = body,headers = headers)}

    
    
    suspend fun verifyOtpAndAddBeneficiaryForBank(body: AddBeneficiaryViaOtpVerificationRequest, headers: Map<String, String> = emptyMap()): Response<AddBeneficiaryViaOtpVerificationResponse>? {
        var fullUrl : String? = _relativeUrls["verifyOtpAndAddBeneficiaryForBank"]
        
        return paymentApiList?.verifyOtpAndAddBeneficiaryForBank(fullUrl, body = body,headers = headers)}

    
    
    suspend fun addRefundBankAccountUsingOTP(body: AddBeneficiaryDetailsOTPRequest, headers: Map<String, String> = emptyMap()): Response<PostAddBeneficiaryDetailsOTPResponse>? {
        var fullUrl : String? = _relativeUrls["addRefundBankAccountUsingOTP"]
        
        return paymentApiList?.addRefundBankAccountUsingOTP(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getotpOrderBeneficiariesDetail(orderId: String,requestHash: String, headers: Map<String, String> = emptyMap()): Response<AddBeneficiaryDetailsOTPResponse>? {
        var fullUrl : String? = _relativeUrls["getotpOrderBeneficiariesDetail"]
        
        return paymentApiList?.getotpOrderBeneficiariesDetail(fullUrl,   orderId = orderId,  requestHash = requestHash,headers = headers)}

    
    
    suspend fun verifyOtpAndAddBeneficiaryForWallet(body: WalletOtpRequest, headers: Map<String, String> = emptyMap()): Response<WalletOtpResponse>? {
        var fullUrl : String? = _relativeUrls["verifyOtpAndAddBeneficiaryForWallet"]
        
        return paymentApiList?.verifyOtpAndAddBeneficiaryForWallet(fullUrl, body = body,headers = headers)}

    
    
    suspend fun updateDefaultBeneficiary(body: SetDefaultBeneficiaryRequest, headers: Map<String, String> = emptyMap()): Response<SetDefaultBeneficiaryResponse>? {
        var fullUrl : String? = _relativeUrls["updateDefaultBeneficiary"]
        
        return paymentApiList?.updateDefaultBeneficiary(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getBenficiaryOrder(body: RefundOrderBenRequest, headers: Map<String, String> = emptyMap()): Response<RefundOrderBenResponse>? {
        var fullUrl : String? = _relativeUrls["getBenficiaryOrder"]
        
        return paymentApiList?.getBenficiaryOrder(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getPaymentLink(paymentLinkId: String?=null, headers: Map<String, String> = emptyMap()): Response<GetPaymentLinkResponse>? {
        var fullUrl : String? = _relativeUrls["getPaymentLink"]
        
        return paymentApiList?.getPaymentLink(fullUrl,   paymentLinkId = paymentLinkId,headers = headers)}

    
    
    suspend fun createPaymentLink(body: CreatePaymentLinkRequest, headers: Map<String, String> = emptyMap()): Response<CreatePaymentLinkResponse>? {
        var fullUrl : String? = _relativeUrls["createPaymentLink"]
        
        return paymentApiList?.createPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getPaymentLinkId(id: String,paymentLinkId: String, headers: Map<String, String> = emptyMap()): Response<GetPaymentLinkResponse>? {
        var fullUrl : String? = _relativeUrls["getPaymentLinkId"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return paymentApiList?.getPaymentLinkId(fullUrl,    paymentLinkId = paymentLinkId,headers = headers)}

    
    
    suspend fun resendPaymentLink(body: CancelOrResendPaymentLinkRequest, headers: Map<String, String> = emptyMap()): Response<ResendPaymentLinkResponse>? {
        var fullUrl : String? = _relativeUrls["resendPaymentLink"]
        
        return paymentApiList?.resendPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getPaymentModeRoutesPaymentLink(paymentLinkId: String, headers: Map<String, String> = emptyMap()): Response<PaymentModeRouteResponse>? {
        var fullUrl : String? = _relativeUrls["getPaymentModeRoutesPaymentLink"]
        
        return paymentApiList?.getPaymentModeRoutesPaymentLink(fullUrl,   paymentLinkId = paymentLinkId,headers = headers)}

    
    
    suspend fun pollingPaymentLink(paymentLinkId: String, headers: Map<String, String> = emptyMap()): Response<PollingPaymentLinkResponse>? {
        var fullUrl : String? = _relativeUrls["pollingPaymentLink"]
        
        return paymentApiList?.pollingPaymentLink(fullUrl,   paymentLinkId = paymentLinkId,headers = headers)}

    
    
    suspend fun createOrderHandlerPaymentLink(body: CreateOrderUserRequest, headers: Map<String, String> = emptyMap()): Response<CreateOrderUserResponse>? {
        var fullUrl : String? = _relativeUrls["createOrderHandlerPaymentLink"]
        
        return paymentApiList?.createOrderHandlerPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun initialisePaymentPaymentLink(body: PaymentInitializationRequest, headers: Map<String, String> = emptyMap()): Response<PaymentInitializationResponse>? {
        var fullUrl : String? = _relativeUrls["initialisePaymentPaymentLink"]
        
        return paymentApiList?.initialisePaymentPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun checkAndUpdatePaymentStatusPaymentLink(body: PaymentStatusUpdateRequest, headers: Map<String, String> = emptyMap()): Response<PaymentStatusUpdateResponse>? {
        var fullUrl : String? = _relativeUrls["checkAndUpdatePaymentStatusPaymentLink"]
        
        return paymentApiList?.checkAndUpdatePaymentStatusPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun customerCreditSummary(aggregator: String?=null, headers: Map<String, String> = emptyMap()): Response<CustomerCreditSummaryResponse>? {
        var fullUrl : String? = _relativeUrls["customerCreditSummary"]
        
        return paymentApiList?.customerCreditSummary(fullUrl,   aggregator = aggregator,headers = headers)}

    
    
    suspend fun redirectToAggregator(source: String?=null,aggregator: String?=null, headers: Map<String, String> = emptyMap()): Response<RedirectToAggregatorResponse>? {
        var fullUrl : String? = _relativeUrls["redirectToAggregator"]
        
        return paymentApiList?.redirectToAggregator(fullUrl,   source = source,  aggregator = aggregator,headers = headers)}

    
    
    suspend fun checkCredit(aggregator: String?=null, headers: Map<String, String> = emptyMap()): Response<CheckCreditResponse>? {
        var fullUrl : String? = _relativeUrls["checkCredit"]
        
        return paymentApiList?.checkCredit(fullUrl,   aggregator = aggregator,headers = headers)}

    
    
    suspend fun customerOnboard(body: CustomerOnboardingRequest, headers: Map<String, String> = emptyMap()): Response<CustomerOnboardingResponse>? {
        var fullUrl : String? = _relativeUrls["customerOnboard"]
        
        return paymentApiList?.customerOnboard(fullUrl, body = body,headers = headers)}

    
    
    suspend fun outstandingOrderDetails(aggregator: String?=null, headers: Map<String, String> = emptyMap()): Response<OutstandingOrderDetailsResponse>? {
        var fullUrl : String? = _relativeUrls["outstandingOrderDetails"]
        
        return paymentApiList?.outstandingOrderDetails(fullUrl,   aggregator = aggregator,headers = headers)}

    
    
    suspend fun cancelPaymentLink(body: CancelOrResendPaymentLinkRequest, headers: Map<String, String> = emptyMap()): Response<CancelPaymentLinkResponse>? {
        var fullUrl : String? = _relativeUrls["cancelPaymentLink"]
        
        return paymentApiList?.cancelPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun paidOrderDetails(aggregator: String?=null, headers: Map<String, String> = emptyMap()): Response<PaidOrderDetailsResponse>? {
        var fullUrl : String? = _relativeUrls["paidOrderDetails"]
        
        return paymentApiList?.paidOrderDetails(fullUrl,   aggregator = aggregator,headers = headers)}

    
    
    suspend fun createPaymentOrder(body: PaymentOrderRequest, headers: Map<String, String> = emptyMap()): Response<PaymentOrderResponse>? {
        var fullUrl : String? = _relativeUrls["createPaymentOrder"]
        
        return paymentApiList?.createPaymentOrder(fullUrl, body = body,headers = headers)}

    
    
    suspend fun setRefundOptionforShipment(body: ShipmentRefundRequest, headers: Map<String, String> = emptyMap()): Response<ShipmentRefundResponse>? {
        var fullUrl : String? = _relativeUrls["setRefundOptionforShipment"]
        
        return paymentApiList?.setRefundOptionforShipment(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getSelectedRefundOption(shipmentId: String,orderId: String, headers: Map<String, String> = emptyMap()): Response<SelectedRefundOptionResponse>? {
        var fullUrl : String? = _relativeUrls["getSelectedRefundOption"]
        
        return paymentApiList?.getSelectedRefundOption(fullUrl,   shipmentId = shipmentId,  orderId = orderId,headers = headers)}

    
    
    suspend fun getUserBeneficiariesDetailV2(orderId: String?=null,shipmentId: String?=null,mop: String?=null, headers: Map<String, String> = emptyMap()): Response<OrderBeneficiaryResponseSchemaV2>? {
        var fullUrl : String? = _relativeUrls["getUserBeneficiariesDetailV2"]
        
        return paymentApiList?.getUserBeneficiariesDetailV2(fullUrl,   orderId = orderId,  shipmentId = shipmentId,  mop = mop,headers = headers)}

    
    
    suspend fun validateBeneficiaryAddress(body: ValidateValidateAddressRequest, headers: Map<String, String> = emptyMap()): Response<ValidateValidateAddressResponse>? {
        var fullUrl : String? = _relativeUrls["validateBeneficiaryAddress"]
        
        return paymentApiList?.validateBeneficiaryAddress(fullUrl, body = body,headers = headers)}

    
    
    suspend fun confirmPayment(body: PaymentConfirmationRequest, headers: Map<String, String> = emptyMap()): Response<PaymentConfirmationResponse>? {
        var fullUrl : String? = _relativeUrls["confirmPayment"]
        
        return paymentApiList?.confirmPayment(fullUrl, body = body,headers = headers)}

    
    
}
