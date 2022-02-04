package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class PaymentDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val paymentApiList by lazy {
        generatepaymentApiList()
    }

    private fun generatepaymentApiList(): PaymentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
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
        return paymentApiList?.getAggregatorsConfig(xApiToken = xApiToken, refresh = refresh)}

    
    
    fun attachCardToCustomer(body: AttachCardRequest): Deferred<Response<AttachCardsResponse>>? {
        return paymentApiList?.attachCardToCustomer(body = body)}

    
    
    fun getActiveCardAggregator(refresh: Boolean?=null): Deferred<Response<ActiveCardPaymentGatewayResponse>>? {
        return paymentApiList?.getActiveCardAggregator(refresh = refresh)}

    
    
    fun getActiveUserCards(forceRefresh: Boolean?=null): Deferred<Response<ListCardsResponse>>? {
        return paymentApiList?.getActiveUserCards(forceRefresh = forceRefresh)}

    
    
    fun deleteUserCard(body: DeletehCardRequest): Deferred<Response<DeleteCardsResponse>>? {
        return paymentApiList?.deleteUserCard(body = body)}

    
    
    fun verifyCustomerForPayment(body: ValidateCustomerRequest): Deferred<Response<ValidateCustomerResponse>>? {
        return paymentApiList?.verifyCustomerForPayment(body = body)}

    
    
    fun verifyAndChargePayment(body: ChargeCustomerRequest): Deferred<Response<ChargeCustomerResponse>>? {
        return paymentApiList?.verifyAndChargePayment(body = body)}

    
    
    fun initialisePayment(body: PaymentInitializationRequest): Deferred<Response<PaymentInitializationResponse>>? {
        return paymentApiList?.initialisePayment(body = body)}

    
    
    fun checkAndUpdatePaymentStatus(body: PaymentStatusUpdateRequest): Deferred<Response<PaymentStatusUpdateResponse>>? {
        return paymentApiList?.checkAndUpdatePaymentStatus(body = body)}

    
    
    fun getPaymentModeRoutes(amount: Int, cartId: String, pincode: String, checkoutMode: String, refresh: Boolean?=null, cardReference: String?=null, userDetails: String?=null): Deferred<Response<PaymentModeRouteResponse>>? {
        return paymentApiList?.getPaymentModeRoutes(amount = amount, cartId = cartId, pincode = pincode, checkoutMode = checkoutMode, refresh = refresh, cardReference = cardReference, userDetails = userDetails)}

    
    
    fun getPosPaymentModeRoutes(amount: Int, cartId: String, pincode: String, checkoutMode: String, refresh: Boolean?=null, cardReference: String?=null, orderType: String, userDetails: String?=null): Deferred<Response<PaymentModeRouteResponse>>? {
        return paymentApiList?.getPosPaymentModeRoutes(amount = amount, cartId = cartId, pincode = pincode, checkoutMode = checkoutMode, refresh = refresh, cardReference = cardReference, orderType = orderType, userDetails = userDetails)}

    
    
    fun getRupifiBannerDetails(): Deferred<Response<RupifiBannerResponse>>? {
        return paymentApiList?.getRupifiBannerDetails()}

    
    
    fun getEpaylaterBannerDetails(): Deferred<Response<EpaylaterBannerResponse>>? {
        return paymentApiList?.getEpaylaterBannerDetails()}

    
    
    fun getActiveRefundTransferModes(): Deferred<Response<TransferModeResponse>>? {
        return paymentApiList?.getActiveRefundTransferModes()}

    
    
    fun enableOrDisableRefundTransferMode(body: UpdateRefundTransferModeRequest): Deferred<Response<UpdateRefundTransferModeResponse>>? {
        return paymentApiList?.enableOrDisableRefundTransferMode(body = body)}

    
    
    fun getUserBeneficiariesDetail(orderId: String): Deferred<Response<OrderBeneficiaryResponse>>? {
        return paymentApiList?.getUserBeneficiariesDetail(orderId = orderId)}

    
    
    fun verifyIfscCode(ifscCode: String?=null): Deferred<Response<IfscCodeResponse>>? {
        return paymentApiList?.verifyIfscCode(ifscCode = ifscCode)}

    
    
    fun getOrderBeneficiariesDetail(orderId: String): Deferred<Response<OrderBeneficiaryResponse>>? {
        return paymentApiList?.getOrderBeneficiariesDetail(orderId = orderId)}

    
    
    fun verifyOtpAndAddBeneficiaryForBank(body: AddBeneficiaryViaOtpVerificationRequest): Deferred<Response<AddBeneficiaryViaOtpVerificationResponse>>? {
        return paymentApiList?.verifyOtpAndAddBeneficiaryForBank(body = body)}

    
    
    fun addBeneficiaryDetails(body: AddBeneficiaryDetailsRequest): Deferred<Response<RefundAccountResponse>>? {
        return paymentApiList?.addBeneficiaryDetails(body = body)}

    
    
    fun addRefundBankAccountUsingOTP(body: AddBeneficiaryDetailsOTPRequest): Deferred<Response<RefundAccountResponse>>? {
        return paymentApiList?.addRefundBankAccountUsingOTP(body = body)}

    
    
    fun verifyOtpAndAddBeneficiaryForWallet(body: WalletOtpRequest): Deferred<Response<WalletOtpResponse>>? {
        return paymentApiList?.verifyOtpAndAddBeneficiaryForWallet(body = body)}

    
    
    fun updateDefaultBeneficiary(body: SetDefaultBeneficiaryRequest): Deferred<Response<SetDefaultBeneficiaryResponse>>? {
        return paymentApiList?.updateDefaultBeneficiary(body = body)}

    
    
    fun CustomerCreditSummary(aggregator: String?=null): Deferred<Response<CustomerCreditSummaryResponse>>? {
        return paymentApiList?.CustomerCreditSummary(aggregator = aggregator)}

    
    
    fun RedirectToAggregator(aggregator: String?=null): Deferred<Response<RedirectToAggregatorResponse>>? {
        return paymentApiList?.RedirectToAggregator(aggregator = aggregator)}

    
    
    fun CheckCredit(aggregator: String?=null): Deferred<Response<CheckCreditResponse>>? {
        return paymentApiList?.CheckCredit(aggregator = aggregator)}

    
    
    fun CustomerOnboard(body: CustomerOnboardingRequest): Deferred<Response<CustomerOnboardingResponse>>? {
        return paymentApiList?.CustomerOnboard(body = body)}

    
    
}
