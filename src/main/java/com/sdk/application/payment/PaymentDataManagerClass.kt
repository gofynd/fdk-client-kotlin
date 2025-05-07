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
    
    suspend fun getAggregatorsConfig(xApiToken: String?=null,refresh: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<AggregatorsConfigDetail>? {
        var fullUrl : String? = _relativeUrls["getAggregatorsConfig"]
        
        return paymentApiList?.getAggregatorsConfig(fullUrl,   xApiToken = xApiToken,  refresh = refresh,headers = headers)}

    
    
    suspend fun attachCardToCustomer(body: AttachCard, headers: Map<String, String> = emptyMap()): Response<AttachCardsDetails>? {
        var fullUrl : String? = _relativeUrls["attachCardToCustomer"]
        
        return paymentApiList?.attachCardToCustomer(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getActiveCardAggregator(refresh: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<ActiveCardPaymentGatewayDetails>? {
        var fullUrl : String? = _relativeUrls["getActiveCardAggregator"]
        
        return paymentApiList?.getActiveCardAggregator(fullUrl,   refresh = refresh,headers = headers)}

    
    
    suspend fun updateUserCard(body: UpdateAggregatorCardReq, headers: Map<String, String> = emptyMap()): Response<UpdateAggregatorCardDetails>? {
        var fullUrl : String? = _relativeUrls["updateUserCard"]
        
        return paymentApiList?.updateUserCard(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getActiveUserCards(forceRefresh: Boolean?=null, headers: Map<String, String> = emptyMap()): Response<ListCardsDetails>? {
        var fullUrl : String? = _relativeUrls["getActiveUserCards"]
        
        return paymentApiList?.getActiveUserCards(fullUrl,   forceRefresh = forceRefresh,headers = headers)}

    
    
    suspend fun updateActiveCards(body: UpdateAggregatorCardReq, headers: Map<String, String> = emptyMap()): Response<UpdateCard>? {
        var fullUrl : String? = _relativeUrls["updateActiveCards"]
        
        return paymentApiList?.updateActiveCards(fullUrl, body = body,headers = headers)}

    
    
    suspend fun deleteUserCard(body: DeleteCard, headers: Map<String, String> = emptyMap()): Response<DeleteCardsDetails>? {
        var fullUrl : String? = _relativeUrls["deleteUserCard"]
        
        return paymentApiList?.deleteUserCard(fullUrl, body = body,headers = headers)}

    
    
    suspend fun verifyCustomerForPayment(body: ValidateCustomer, headers: Map<String, String> = emptyMap()): Response<ValidateCustomerDetails>? {
        var fullUrl : String? = _relativeUrls["verifyCustomerForPayment"]
        
        return paymentApiList?.verifyCustomerForPayment(fullUrl, body = body,headers = headers)}

    
    
    suspend fun verifyAndChargePayment(body: ChargeCustomer, headers: Map<String, String> = emptyMap()): Response<ChargeCustomerDetails>? {
        var fullUrl : String? = _relativeUrls["verifyAndChargePayment"]
        
        return paymentApiList?.verifyAndChargePayment(fullUrl, body = body,headers = headers)}

    
    
    suspend fun initialisePayment(body: PaymentInitialization, headers: Map<String, String> = emptyMap()): Response<PaymentInitializationDetails>? {
        var fullUrl : String? = _relativeUrls["initialisePayment"]
        
        return paymentApiList?.initialisePayment(fullUrl, body = body,headers = headers)}

    
    
    suspend fun checkAndUpdatePaymentStatus(body: PaymentStatusUpdate, headers: Map<String, String> = emptyMap()): Response<PaymentStatusUpdateDetails>? {
        var fullUrl : String? = _relativeUrls["checkAndUpdatePaymentStatus"]
        
        return paymentApiList?.checkAndUpdatePaymentStatus(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getPaymentModeRoutes(amount: Int,cartId: String,checkoutMode: String?=null,refresh: Boolean?=null,orderId: String?=null,cardReference: String?=null,userDetails: String?=null,displaySplit: Boolean?=null,advancePayment: Boolean?=null,shipmentId: String?=null, headers: Map<String, String> = emptyMap()): Response<PaymentModeRouteDetails>? {
        var fullUrl : String? = _relativeUrls["getPaymentModeRoutes"]
        
        return paymentApiList?.getPaymentModeRoutes(fullUrl,   amount = amount,  cartId = cartId,  checkoutMode = checkoutMode,  refresh = refresh,  orderId = orderId,  cardReference = cardReference,  userDetails = userDetails,  displaySplit = displaySplit,  advancePayment = advancePayment,  shipmentId = shipmentId,headers = headers)}

    
    
    suspend fun getPosPaymentModeRoutes(amount: Int,cartId: String,pincode: String,checkoutMode: String?=null,refresh: Boolean?=null,cardReference: String?=null,orderType: String,userDetails: String?=null, headers: Map<String, String> = emptyMap()): Response<PaymentModeRouteDetails>? {
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

    
    
    suspend fun getRupifiBannerDetails( headers: Map<String, String> = emptyMap()): Response<RupifiBannerDetails>? {
        var fullUrl : String? = _relativeUrls["getRupifiBannerDetails"]
        
        return paymentApiList?.getRupifiBannerDetails(fullUrl, headers = headers)}

    
    
    suspend fun getEpaylaterBannerDetails( headers: Map<String, String> = emptyMap()): Response<EpaylaterBannerDetails>? {
        var fullUrl : String? = _relativeUrls["getEpaylaterBannerDetails"]
        
        return paymentApiList?.getEpaylaterBannerDetails(fullUrl, headers = headers)}

    
    
    suspend fun resendOrCancelPayment(body: ResendOrCancelPayment, headers: Map<String, String> = emptyMap()): Response<ResendOrCancelPaymentDetails>? {
        var fullUrl : String? = _relativeUrls["resendOrCancelPayment"]
        
        return paymentApiList?.resendOrCancelPayment(fullUrl, body = body,headers = headers)}

    
    
    suspend fun renderHTML(body: RenderHTML, headers: Map<String, String> = emptyMap()): Response<RenderHTMLDetails>? {
        var fullUrl : String? = _relativeUrls["renderHTML"]
        
        return paymentApiList?.renderHTML(fullUrl, body = body,headers = headers)}

    
    
    suspend fun validateVPA(body: ValidateVPA, headers: Map<String, String> = emptyMap()): Response<ValidateVPADetails>? {
        var fullUrl : String? = _relativeUrls["validateVPA"]
        
        return paymentApiList?.validateVPA(fullUrl, body = body,headers = headers)}

    
    
    suspend fun cardDetails(cardInfo: String,aggregator: String?=null, headers: Map<String, String> = emptyMap()): Response<CardDetailsFetchedDetails>? {
        var fullUrl : String? = _relativeUrls["cardDetails"]
        
        fullUrl = fullUrl?.replace("{" + "card_info" +"}",cardInfo.toString())
        
        return paymentApiList?.cardDetails(fullUrl,    aggregator = aggregator,headers = headers)}

    
    
    suspend fun getActiveRefundTransferModes( headers: Map<String, String> = emptyMap()): Response<TransferModeFetchDetails>? {
        var fullUrl : String? = _relativeUrls["getActiveRefundTransferModes"]
        
        return paymentApiList?.getActiveRefundTransferModes(fullUrl, headers = headers)}

    
    
    suspend fun enableOrDisableRefundTransferMode(body: UpdateRefundTransferMode, headers: Map<String, String> = emptyMap()): Response<RefundTransferModeUpdateDetails>? {
        var fullUrl : String? = _relativeUrls["enableOrDisableRefundTransferMode"]
        
        return paymentApiList?.enableOrDisableRefundTransferMode(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getUserBeneficiariesDetail(orderId: String, headers: Map<String, String> = emptyMap()): Response<OrderBeneficiaryFetchDetails>? {
        var fullUrl : String? = _relativeUrls["getUserBeneficiariesDetail"]
        
        return paymentApiList?.getUserBeneficiariesDetail(fullUrl,   orderId = orderId,headers = headers)}

    
    
    suspend fun verifyIfscCode(ifscCode: String?=null, headers: Map<String, String> = emptyMap()): Response<IfscCodeDetails>? {
        var fullUrl : String? = _relativeUrls["verifyIfscCode"]
        
        return paymentApiList?.verifyIfscCode(fullUrl,   ifscCode = ifscCode,headers = headers)}

    
    
    suspend fun getOrderBeneficiariesDetail(orderId: String, headers: Map<String, String> = emptyMap()): Response<OrderBeneficiaryFetchDetails>? {
        var fullUrl : String? = _relativeUrls["getOrderBeneficiariesDetail"]
        
        return paymentApiList?.getOrderBeneficiariesDetail(fullUrl,   orderId = orderId,headers = headers)}

    
    
    suspend fun addBeneficiaryDetails(body: AddBeneficiaryDetails, headers: Map<String, String> = emptyMap()): Response<RefundAccountDetails>? {
        var fullUrl : String? = _relativeUrls["addBeneficiaryDetails"]
        
        return paymentApiList?.addBeneficiaryDetails(fullUrl, body = body,headers = headers)}

    
    
    suspend fun deleteBeneficiaryDetails(body: DeleteBeneficiary, headers: Map<String, String> = emptyMap()): Response<DeleteRefundAccountDetails>? {
        var fullUrl : String? = _relativeUrls["deleteBeneficiaryDetails"]
        
        return paymentApiList?.deleteBeneficiaryDetails(fullUrl, body = body,headers = headers)}

    
    
    suspend fun verifyOtpAndAddBeneficiaryForBank(body: AddBeneficiaryViaOtpVerification, headers: Map<String, String> = emptyMap()): Response<AddBeneficiaryViaOtpVerificationDetails>? {
        var fullUrl : String? = _relativeUrls["verifyOtpAndAddBeneficiaryForBank"]
        
        return paymentApiList?.verifyOtpAndAddBeneficiaryForBank(fullUrl, body = body,headers = headers)}

    
    
    suspend fun addRefundBankAccountUsingOTP(body: AddBeneficiaryDetailsOTP, headers: Map<String, String> = emptyMap()): Response<RefundAccountDetails>? {
        var fullUrl : String? = _relativeUrls["addRefundBankAccountUsingOTP"]
        
        return paymentApiList?.addRefundBankAccountUsingOTP(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getotpOrderBeneficiariesDetail(orderId: String,requestHash: String, headers: Map<String, String> = emptyMap()): Response<AddBeneficiaryDetailsOTPDetails>? {
        var fullUrl : String? = _relativeUrls["getotpOrderBeneficiariesDetail"]
        
        return paymentApiList?.getotpOrderBeneficiariesDetail(fullUrl,   orderId = orderId,  requestHash = requestHash,headers = headers)}

    
    
    suspend fun verifyOtpAndAddBeneficiaryForWallet(body: WalletOtp, headers: Map<String, String> = emptyMap()): Response<WalletOtpDetails>? {
        var fullUrl : String? = _relativeUrls["verifyOtpAndAddBeneficiaryForWallet"]
        
        return paymentApiList?.verifyOtpAndAddBeneficiaryForWallet(fullUrl, body = body,headers = headers)}

    
    
    suspend fun updateDefaultBeneficiary(body: SetDefaultBeneficiary, headers: Map<String, String> = emptyMap()): Response<SetDefaultBeneficiaryDetails>? {
        var fullUrl : String? = _relativeUrls["updateDefaultBeneficiary"]
        
        return paymentApiList?.updateDefaultBeneficiary(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getBenficiaryOrder(body: RefundOrderBen, headers: Map<String, String> = emptyMap()): Response<RefundOrderBenDetails>? {
        var fullUrl : String? = _relativeUrls["getBenficiaryOrder"]
        
        return paymentApiList?.getBenficiaryOrder(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getPaymentLink(paymentLinkId: String?=null, headers: Map<String, String> = emptyMap()): Response<GetPaymentLinkDetails>? {
        var fullUrl : String? = _relativeUrls["getPaymentLink"]
        
        return paymentApiList?.getPaymentLink(fullUrl,   paymentLinkId = paymentLinkId,headers = headers)}

    
    
    suspend fun createPaymentLink(body: CreatePaymentLink, headers: Map<String, String> = emptyMap()): Response<CreatePaymentLinkDetails>? {
        var fullUrl : String? = _relativeUrls["createPaymentLink"]
        
        return paymentApiList?.createPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getPaymentLinkId(id: String,paymentLinkId: String, headers: Map<String, String> = emptyMap()): Response<GetPaymentLinkDetails>? {
        var fullUrl : String? = _relativeUrls["getPaymentLinkId"]
        
        fullUrl = fullUrl?.replace("{" + "id" +"}",id.toString())
        
        return paymentApiList?.getPaymentLinkId(fullUrl,    paymentLinkId = paymentLinkId,headers = headers)}

    
    
    suspend fun resendPaymentLink(body: CancelOrResendPaymentLink, headers: Map<String, String> = emptyMap()): Response<ResendPaymentLinkDetails>? {
        var fullUrl : String? = _relativeUrls["resendPaymentLink"]
        
        return paymentApiList?.resendPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getPaymentModeRoutesPaymentLink(paymentLinkId: String, headers: Map<String, String> = emptyMap()): Response<PaymentModeRouteDetails>? {
        var fullUrl : String? = _relativeUrls["getPaymentModeRoutesPaymentLink"]
        
        return paymentApiList?.getPaymentModeRoutesPaymentLink(fullUrl,   paymentLinkId = paymentLinkId,headers = headers)}

    
    
    suspend fun pollingPaymentLink(paymentLinkId: String, headers: Map<String, String> = emptyMap()): Response<PollingPaymentLinkDetails>? {
        var fullUrl : String? = _relativeUrls["pollingPaymentLink"]
        
        return paymentApiList?.pollingPaymentLink(fullUrl,   paymentLinkId = paymentLinkId,headers = headers)}

    
    
    suspend fun createOrderHandlerPaymentLink(body: CreateOrderUser, headers: Map<String, String> = emptyMap()): Response<CreateOrderUserDetails>? {
        var fullUrl : String? = _relativeUrls["createOrderHandlerPaymentLink"]
        
        return paymentApiList?.createOrderHandlerPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun initialisePaymentPaymentLink(body: PaymentInitialization, headers: Map<String, String> = emptyMap()): Response<PaymentInitializationDetails>? {
        var fullUrl : String? = _relativeUrls["initialisePaymentPaymentLink"]
        
        return paymentApiList?.initialisePaymentPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun checkAndUpdatePaymentStatusPaymentLink(body: PaymentStatusUpdate, headers: Map<String, String> = emptyMap()): Response<PaymentStatusUpdateDetails>? {
        var fullUrl : String? = _relativeUrls["checkAndUpdatePaymentStatusPaymentLink"]
        
        return paymentApiList?.checkAndUpdatePaymentStatusPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun customerCreditSummary(aggregator: String?=null, headers: Map<String, String> = emptyMap()): Response<CustomerCreditSummaryDetails>? {
        var fullUrl : String? = _relativeUrls["customerCreditSummary"]
        
        return paymentApiList?.customerCreditSummary(fullUrl,   aggregator = aggregator,headers = headers)}

    
    
    suspend fun redirectToAggregator(source: String?=null,aggregator: String, headers: Map<String, String> = emptyMap()): Response<RedirectToAggregatorDetails>? {
        var fullUrl : String? = _relativeUrls["redirectToAggregator"]
        
        return paymentApiList?.redirectToAggregator(fullUrl,   source = source,  aggregator = aggregator,headers = headers)}

    
    
    suspend fun checkCredit(aggregator: String?=null, headers: Map<String, String> = emptyMap()): Response<CheckCreditDetails>? {
        var fullUrl : String? = _relativeUrls["checkCredit"]
        
        return paymentApiList?.checkCredit(fullUrl,   aggregator = aggregator,headers = headers)}

    
    
    suspend fun customerOnboard(body: CustomerOnboarding, headers: Map<String, String> = emptyMap()): Response<CustomerOnboardingDetails>? {
        var fullUrl : String? = _relativeUrls["customerOnboard"]
        
        return paymentApiList?.customerOnboard(fullUrl, body = body,headers = headers)}

    
    
    suspend fun outstandingOrderDetails(aggregator: String?=null, headers: Map<String, String> = emptyMap()): Response<OutstandingOrderDetails>? {
        var fullUrl : String? = _relativeUrls["outstandingOrderDetails"]
        
        return paymentApiList?.outstandingOrderDetails(fullUrl,   aggregator = aggregator,headers = headers)}

    
    
    suspend fun cancelPaymentLink(body: CancelOrResendPaymentLink, headers: Map<String, String> = emptyMap()): Response<CancelPaymentLinkDetails>? {
        var fullUrl : String? = _relativeUrls["cancelPaymentLink"]
        
        return paymentApiList?.cancelPaymentLink(fullUrl, body = body,headers = headers)}

    
    
    suspend fun paidOrderDetails(aggregator: String?=null, headers: Map<String, String> = emptyMap()): Response<PaidOrderDetails>? {
        var fullUrl : String? = _relativeUrls["paidOrderDetails"]
        
        return paymentApiList?.paidOrderDetails(fullUrl,   aggregator = aggregator,headers = headers)}

    
    
    suspend fun createPaymentOrder(body: PaymentOrder, headers: Map<String, String> = emptyMap()): Response<PaymentOrderDetails>? {
        var fullUrl : String? = _relativeUrls["createPaymentOrder"]
        
        return paymentApiList?.createPaymentOrder(fullUrl, body = body,headers = headers)}

    
    
    suspend fun setRefundOptionforShipment(body: ShipmentRefund, headers: Map<String, String> = emptyMap()): Response<ShipmentRefundDetails>? {
        var fullUrl : String? = _relativeUrls["setRefundOptionforShipment"]
        
        return paymentApiList?.setRefundOptionforShipment(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getSelectedRefundOption(shipmentId: String,orderId: String, headers: Map<String, String> = emptyMap()): Response<SelectedRefundOptionDetails>? {
        var fullUrl : String? = _relativeUrls["getSelectedRefundOption"]
        
        return paymentApiList?.getSelectedRefundOption(fullUrl,   shipmentId = shipmentId,  orderId = orderId,headers = headers)}

    
    
    suspend fun getUserBeneficiariesDetailV2(orderId: String?=null,shipmentId: String?=null,mop: String?=null, headers: Map<String, String> = emptyMap()): Response<OrderBeneficiaryDetailsSchemaV2>? {
        var fullUrl : String? = _relativeUrls["getUserBeneficiariesDetailV2"]
        
        return paymentApiList?.getUserBeneficiariesDetailV2(fullUrl,   orderId = orderId,  shipmentId = shipmentId,  mop = mop,headers = headers)}

    
    
    suspend fun validateBeneficiaryAddress(body: ValidateValidateAddress, headers: Map<String, String> = emptyMap()): Response<ValidateValidateAddressDetails>? {
        var fullUrl : String? = _relativeUrls["validateBeneficiaryAddress"]
        
        return paymentApiList?.validateBeneficiaryAddress(fullUrl, body = body,headers = headers)}

    
    
    suspend fun confirmPayment(body: PaymentConfirmation, headers: Map<String, String> = emptyMap()): Response<PaymentConfirmationDetails>? {
        var fullUrl : String? = _relativeUrls["confirmPayment"]
        
        return paymentApiList?.confirmPayment(fullUrl, body = body,headers = headers)}

    
    
}
