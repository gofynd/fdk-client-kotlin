package com.sdk.application.datamanager

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
            
                    _relativeUrls["getAggregatorsConfig"] = "/service/application/payment/v1.0/config/aggregators/key"?.substring(1)
            
                    _relativeUrls["attachCardToCustomer"] = "/service/application/payment/v1.0/card/attach"?.substring(1)
            
                    _relativeUrls["getActiveCardAggregator"] = "/service/application/payment/v1.0/card/aggregator"?.substring(1)
            
                    _relativeUrls["getActiveUserCards"] = "/service/application/payment/v1.0/cards"?.substring(1)
            
                    _relativeUrls["deleteUserCard"] = "/service/application/payment/v1.0/card/remove"?.substring(1)
            
                    _relativeUrls["verifyCustomerForPayment"] = "/service/application/payment/v1.0/payment/customer/validation"?.substring(1)
            
                    _relativeUrls["verifyAndChargePayment"] = "/service/application/payment/v1.0/payment/confirm/charge"?.substring(1)
            
                    _relativeUrls["initialisePayment"] = "/service/application/payment/v1.0/payment/request"?.substring(1)
            
                    _relativeUrls["checkAndUpdatePaymentStatus"] = "/service/application/payment/v1.0/payment/confirm/polling"?.substring(1)
            
                    _relativeUrls["getPaymentModeRoutes"] = "/service/application/payment/v1.0/payment/options"?.substring(1)
            
                    _relativeUrls["getPosPaymentModeRoutes"] = "/service/application/payment/v1.0/payment/options/pos"?.substring(1)
            
                    _relativeUrls["getRupifiBannerDetails"] = "/service/application/payment/v1.0/rupifi/banner"?.substring(1)
            
                    _relativeUrls["getActiveRefundTransferModes"] = "/service/application/payment/v1.0/refund/transfer-mode"?.substring(1)
            
                    _relativeUrls["enableOrDisableRefundTransferMode"] = "/service/application/payment/v1.0/refund/transfer-mode"?.substring(1)
            
                    _relativeUrls["getUserBeneficiariesDetail"] = "/service/application/payment/v1.0/refund/user/beneficiary"?.substring(1)
            
                    _relativeUrls["verifyIfscCode"] = "/service/application/payment/v1.0/ifsc-code/verify"?.substring(1)
            
                    _relativeUrls["getOrderBeneficiariesDetail"] = "/service/application/payment/v1.0/refund/order/beneficiaries"?.substring(1)
            
                    _relativeUrls["verifyOtpAndAddBeneficiaryForBank"] = "/service/application/payment/v1.0/refund/verification/bank"?.substring(1)
            
                    _relativeUrls["addBeneficiaryDetails"] = "/service/application/payment/v1.0/refund/account"?.substring(1)
            
                    _relativeUrls["addRefundBankAccountUsingOTP"] = "/service/application/payment/v1.0/refund/account/otp"?.substring(1)
            
                    _relativeUrls["verifyOtpAndAddBeneficiaryForWallet"] = "/service/application/payment/v1.0/refund/verification/wallet"?.substring(1)
            
                    _relativeUrls["updateDefaultBeneficiary"] = "/service/application/payment/v1.0/refund/beneficiary/default"?.substring(1)
            
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationPayment",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(PaymentApiList::class.java) as? PaymentApiList
    }
    
    fun getAggregatorsConfig(xApiToken: String?=null, refresh: Boolean?=null): Deferred<Response<AggregatorsConfigDetailResponse>>? {
        var fullUrl : String? = _relativeUrls["getAggregatorsConfig"] 
        
        return paymentApiList?.getAggregatorsConfig(fullUrl    ,  xApiToken = xApiToken,    refresh = refresh)}

    
    
    fun attachCardToCustomer(body: AttachCardRequest): Deferred<Response<AttachCardsResponse>>? {
        var fullUrl : String? = _relativeUrls["attachCardToCustomer"] 
        
        return paymentApiList?.attachCardToCustomer(fullUrl  ,body = body)}

    
    
    fun getActiveCardAggregator(refresh: Boolean?=null): Deferred<Response<ActiveCardPaymentGatewayResponse>>? {
        var fullUrl : String? = _relativeUrls["getActiveCardAggregator"] 
        
        return paymentApiList?.getActiveCardAggregator(fullUrl    ,  refresh = refresh)}

    
    
    fun getActiveUserCards(forceRefresh: Boolean?=null): Deferred<Response<ListCardsResponse>>? {
        var fullUrl : String? = _relativeUrls["getActiveUserCards"] 
        
        return paymentApiList?.getActiveUserCards(fullUrl    ,  forceRefresh = forceRefresh)}

    
    
    fun deleteUserCard(body: DeletehCardRequest): Deferred<Response<DeleteCardsResponse>>? {
        var fullUrl : String? = _relativeUrls["deleteUserCard"] 
        
        return paymentApiList?.deleteUserCard(fullUrl  ,body = body)}

    
    
    fun verifyCustomerForPayment(body: ValidateCustomerRequest): Deferred<Response<ValidateCustomerResponse>>? {
        var fullUrl : String? = _relativeUrls["verifyCustomerForPayment"] 
        
        return paymentApiList?.verifyCustomerForPayment(fullUrl  ,body = body)}

    
    
    fun verifyAndChargePayment(body: ChargeCustomerRequest): Deferred<Response<ChargeCustomerResponse>>? {
        var fullUrl : String? = _relativeUrls["verifyAndChargePayment"] 
        
        return paymentApiList?.verifyAndChargePayment(fullUrl  ,body = body)}

    
    
    fun initialisePayment(body: PaymentInitializationRequest): Deferred<Response<PaymentInitializationResponse>>? {
        var fullUrl : String? = _relativeUrls["initialisePayment"] 
        
        return paymentApiList?.initialisePayment(fullUrl  ,body = body)}

    
    
    fun checkAndUpdatePaymentStatus(body: PaymentStatusUpdateRequest): Deferred<Response<PaymentStatusUpdateResponse>>? {
        var fullUrl : String? = _relativeUrls["checkAndUpdatePaymentStatus"] 
        
        return paymentApiList?.checkAndUpdatePaymentStatus(fullUrl  ,body = body)}

    
    
    fun getPaymentModeRoutes(amount: Int, cartId: String, pincode: String, checkoutMode: String, refresh: Boolean?=null, cardReference: String?=null, userDetails: String?=null): Deferred<Response<PaymentModeRouteResponse>>? {
        var fullUrl : String? = _relativeUrls["getPaymentModeRoutes"] 
        
        return paymentApiList?.getPaymentModeRoutes(fullUrl    ,  amount = amount,    cartId = cartId,    pincode = pincode,    checkoutMode = checkoutMode,    refresh = refresh,    cardReference = cardReference,    userDetails = userDetails)}

    
    
    fun getPosPaymentModeRoutes(amount: Int, cartId: String, pincode: String, checkoutMode: String, refresh: Boolean?=null, cardReference: String?=null, orderType: String, userDetails: String?=null): Deferred<Response<PaymentModeRouteResponse>>? {
        var fullUrl : String? = _relativeUrls["getPosPaymentModeRoutes"] 
        
        return paymentApiList?.getPosPaymentModeRoutes(fullUrl    ,  amount = amount,    cartId = cartId,    pincode = pincode,    checkoutMode = checkoutMode,    refresh = refresh,    cardReference = cardReference,    orderType = orderType,    userDetails = userDetails)}

    
    
    fun getRupifiBannerDetails(): Deferred<Response<RupifiBannerResponse>>? {
        var fullUrl : String? = _relativeUrls["getRupifiBannerDetails"] 
        
        return paymentApiList?.getRupifiBannerDetails(fullUrl  )}

    
    
    fun getActiveRefundTransferModes(): Deferred<Response<TransferModeResponse>>? {
        var fullUrl : String? = _relativeUrls["getActiveRefundTransferModes"] 
        
        return paymentApiList?.getActiveRefundTransferModes(fullUrl  )}

    
    
    fun enableOrDisableRefundTransferMode(body: UpdateRefundTransferModeRequest): Deferred<Response<UpdateRefundTransferModeResponse>>? {
        var fullUrl : String? = _relativeUrls["enableOrDisableRefundTransferMode"] 
        
        return paymentApiList?.enableOrDisableRefundTransferMode(fullUrl  ,body = body)}

    
    
    fun getUserBeneficiariesDetail(orderId: String): Deferred<Response<OrderBeneficiaryResponse>>? {
        var fullUrl : String? = _relativeUrls["getUserBeneficiariesDetail"] 
        
        return paymentApiList?.getUserBeneficiariesDetail(fullUrl    ,  orderId = orderId)}

    
    
    fun verifyIfscCode(ifscCode: String?=null): Deferred<Response<IfscCodeResponse>>? {
        var fullUrl : String? = _relativeUrls["verifyIfscCode"] 
        
        return paymentApiList?.verifyIfscCode(fullUrl    ,  ifscCode = ifscCode)}

    
    
    fun getOrderBeneficiariesDetail(orderId: String): Deferred<Response<OrderBeneficiaryResponse>>? {
        var fullUrl : String? = _relativeUrls["getOrderBeneficiariesDetail"] 
        
        return paymentApiList?.getOrderBeneficiariesDetail(fullUrl    ,  orderId = orderId)}

    
    
    fun verifyOtpAndAddBeneficiaryForBank(body: AddBeneficiaryViaOtpVerificationRequest): Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>>? {
        var fullUrl : String? = _relativeUrls["verifyOtpAndAddBeneficiaryForBank"] 
        
        return paymentApiList?.verifyOtpAndAddBeneficiaryForBank(fullUrl  ,body = body)}

    
    
    fun addBeneficiaryDetails(body: AddBeneficiaryDetailsRequest): Deferred<Response<RefundAccountResponse>>? {
        var fullUrl : String? = _relativeUrls["addBeneficiaryDetails"] 
        
        return paymentApiList?.addBeneficiaryDetails(fullUrl  ,body = body)}

    
    
    fun addRefundBankAccountUsingOTP(body: AddBeneficiaryDetailsOTPRequest): Deferred<Response<RefundAccountResponse>>? {
        var fullUrl : String? = _relativeUrls["addRefundBankAccountUsingOTP"] 
        
        return paymentApiList?.addRefundBankAccountUsingOTP(fullUrl  ,body = body)}

    
    
    fun verifyOtpAndAddBeneficiaryForWallet(body: WalletOtpRequest): Deferred<Response<WalletOtpResponse>>? {
        var fullUrl : String? = _relativeUrls["verifyOtpAndAddBeneficiaryForWallet"] 
        
        return paymentApiList?.verifyOtpAndAddBeneficiaryForWallet(fullUrl  ,body = body)}

    
    
    fun updateDefaultBeneficiary(body: SetDefaultBeneficiaryRequest): Deferred<Response<SetDefaultBeneficiaryResponse>>? {
        var fullUrl : String? = _relativeUrls["updateDefaultBeneficiary"] 
        
        return paymentApiList?.updateDefaultBeneficiary(fullUrl  ,body = body)}

    
    
}
