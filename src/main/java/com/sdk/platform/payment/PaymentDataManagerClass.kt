package com.sdk.platform.payment

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class PaymentDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val paymentApiList by lazy {
        generatepaymentApiList()
    }

    private fun generatepaymentApiList(): PaymentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
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
            namespace = "PlatformPayment",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(PaymentApiList::class.java) as? PaymentApiList
    }
    
    
    
    
    
    suspend fun getAllPayouts(uniqueExternalId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PayoutsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getAllPayouts(
        companyId = config.companyId,uniqueExternalId = uniqueExternalId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun savePayout(body: PayoutRequest, headers: Map<String, String> = emptyMap())
    : Response<PayoutResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.savePayout(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePayout(uniqueTransferNo: String,body: PayoutRequest, headers: Map<String, String> = emptyMap())
    : Response<UpdatePayoutResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.updatePayout(
        companyId = config.companyId,uniqueTransferNo = uniqueTransferNo, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun activateAndDectivatePayout(uniqueTransferNo: String,body: UpdatePayoutRequest, headers: Map<String, String> = emptyMap())
    : Response<UpdatePayoutResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.activateAndDectivatePayout(
        companyId = config.companyId,uniqueTransferNo = uniqueTransferNo, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deletePayout(uniqueTransferNo: String, headers: Map<String, String> = emptyMap())
    : Response<DeletePayoutResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.deletePayout(
        companyId = config.companyId,uniqueTransferNo = uniqueTransferNo, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSubscriptionPaymentMethod(uniqueExternalId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionPaymentMethodResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getSubscriptionPaymentMethod(
        companyId = config.companyId,uniqueExternalId = uniqueExternalId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteSubscriptionPaymentMethod(uniqueExternalId: String,paymentMethodId: String, headers: Map<String, String> = emptyMap())
    : Response<DeleteSubscriptionPaymentMethodResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.deleteSubscriptionPaymentMethod(
        companyId = config.companyId,uniqueExternalId = uniqueExternalId,paymentMethodId = paymentMethodId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSubscriptionConfig( headers: Map<String, String> = emptyMap())
    : Response<SubscriptionConfigResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getSubscriptionConfig(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun saveSubscriptionSetupIntent(body: SaveSubscriptionSetupIntentRequest, headers: Map<String, String> = emptyMap())
    : Response<SaveSubscriptionSetupIntentResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.saveSubscriptionSetupIntent(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun verifyIfscCode(ifscCode: String, headers: Map<String, String> = emptyMap())
    : Response<IfscCodeResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.verifyIfscCode(
        companyId = config.companyId,ifscCode = ifscCode, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getBrandPaymentGatewayConfig(aggregator: String,configType: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PaymentGatewayConfigResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getBrandPaymentGatewayConfig(companyId = config.companyId ,applicationId = applicationId ,aggregator = aggregator,configType = configType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun saveBrandPaymentGatewayConfig(body: PaymentGatewayConfigRequest, headers: Map<String, String> = emptyMap())
    : Response<PaymentGatewayToBeReviewed>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.saveBrandPaymentGatewayConfig(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentModeRoutes(refresh: Boolean?=null,requestType: String?=null,orderId: String?=null,shipmentId: String?=null,amount: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<PaymentOptionsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentModeRoutes(companyId = config.companyId ,applicationId = applicationId ,refresh = refresh,requestType = requestType,orderId = orderId,shipmentId = shipmentId,amount = amount, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getBankAccountDetailsOpenAPI(orderId: String,requestHash: String?=null, headers: Map<String, String> = emptyMap())
    : Response<RefundAccountResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getBankAccountDetailsOpenAPI(orderId = orderId,requestHash = requestHash,companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addRefundBankAccountUsingOTP(body: AddBeneficiaryDetailsOTPRequest, headers: Map<String, String> = emptyMap())
    : Response<RefundAccountResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.addRefundBankAccountUsingOTP(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun getUserOrderBeneficiaries(orderId: String, headers: Map<String, String> = emptyMap())
    : Response<OrderBeneficiaryResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getUserOrderBeneficiaries(orderId = orderId,companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUserBeneficiaries(orderId: String, headers: Map<String, String> = emptyMap())
    : Response<OrderBeneficiaryResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getUserBeneficiaries(orderId = orderId,companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun confirmPayment(body: PaymentConfirmationRequest, headers: Map<String, String> = emptyMap())
    : Response<PaymentConfirmationResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.confirmPayment(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUserCODlimitRoutes(merchantUserId: String,mobileNo: String, headers: Map<String, String> = emptyMap())
    : Response<GetUserCODLimitResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getUserCODlimitRoutes(companyId = config.companyId ,applicationId = applicationId ,merchantUserId = merchantUserId,mobileNo = mobileNo, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun setUserCODlimitRoutes(body: SetCODForUserRequest, headers: Map<String, String> = emptyMap())
    : Response<SetCODOptionResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.setUserCODlimitRoutes(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun edcAggregatorsAndModelList( headers: Map<String, String> = emptyMap())
    : Response<EdcAggregatorAndModelListResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.edcAggregatorsAndModelList(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun edcDeviceStats( headers: Map<String, String> = emptyMap())
    : Response<EdcDeviceStatsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.edcDeviceStats(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateEdcDevice(body: EdcAddRequest, headers: Map<String, String> = emptyMap())
    : Response<EdcDeviceAddResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.updateEdcDevice(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getEdcDevice(terminalUniqueIdentifier: String, headers: Map<String, String> = emptyMap())
    : Response<EdcDeviceDetailsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getEdcDevice(companyId = config.companyId ,applicationId = applicationId ,terminalUniqueIdentifier = terminalUniqueIdentifier, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun addEdcDevice(terminalUniqueIdentifier: String,body: EdcUpdateRequest, headers: Map<String, String> = emptyMap())
    : Response<EdcDeviceUpdateResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.addEdcDevice(companyId = config.companyId ,applicationId = applicationId ,terminalUniqueIdentifier = terminalUniqueIdentifier, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun edcDeviceList(pageNo: Int?=null,pageSize: Int?=null,isActive: Boolean?=null,storeId: Int?=null,deviceTag: String?=null, headers: Map<String, String> = emptyMap())
    : Response<EdcDeviceListResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.edcDeviceList(pageNo = pageNo,pageSize = pageSize,isActive = isActive,storeId = storeId,deviceTag = deviceTag,companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPosPaymentModeRoutes(amount: Int,cartId: String?=null,pincode: String,checkoutMode: String?=null,refresh: Boolean?=null,orderId: String?=null,cardReference: String?=null,orderType: String,userDetails: String?=null,displaySplit: Boolean?=null,advancePayment: Boolean?=null,shipmentId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PaymentModeRouteResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPosPaymentModeRoutes(companyId = config.companyId ,applicationId = applicationId ,amount = amount,cartId = cartId,pincode = pincode,checkoutMode = checkoutMode,refresh = refresh,orderId = orderId,cardReference = cardReference,orderType = orderType,userDetails = userDetails,displaySplit = displaySplit,advancePayment = advancePayment,shipmentId = shipmentId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun initialisePayment(body: PaymentInitializationRequest, headers: Map<String, String> = emptyMap())
    : Response<PaymentInitializationResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.initialisePayment(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun checkAndUpdatePaymentStatus(body: PaymentStatusUpdateRequest, headers: Map<String, String> = emptyMap())
    : Response<PaymentStatusUpdateResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.checkAndUpdatePaymentStatus(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun resendOrCancelPayment(body: ResendOrCancelPaymentRequest, headers: Map<String, String> = emptyMap())
    : Response<ResendOrCancelPaymentResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.resendOrCancelPayment(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun paymentStatusBulk(body: PaymentStatusBulkHandlerRequest, headers: Map<String, String> = emptyMap())
    : Response<PaymentStatusBulkHandlerResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.paymentStatusBulk(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun oauthGetUrl(aggregator: String,successRedirectUrl: String?=null,failureRedirectUrl: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetOauthUrlResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.oauthGetUrl(companyId = config.companyId ,applicationId = applicationId ,aggregator = aggregator,successRedirectUrl = successRedirectUrl,failureRedirectUrl = failureRedirectUrl, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun revokeOauthToken(aggregator: String, headers: Map<String, String> = emptyMap())
    : Response<RevokeOAuthToken>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.revokeOauthToken(companyId = config.companyId ,applicationId = applicationId ,aggregator = aggregator, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun repaymentDetails(body: RepaymentDetailsSerialiserPayAll, headers: Map<String, String> = emptyMap())
    : Response<RepaymentResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.repaymentDetails(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun merchantOnBoarding(body: MerchantOnBoardingRequest, headers: Map<String, String> = emptyMap())
    : Response<MerchantOnBoardingResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.merchantOnBoarding(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun verifyCustomerForPayment(body: ValidateCustomerRequest, headers: Map<String, String> = emptyMap())
    : Response<ValidateCustomerResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.verifyCustomerForPayment(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentLink(paymentLinkId: String, headers: Map<String, String> = emptyMap())
    : Response<GetPaymentLinkResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentLink(companyId = config.companyId ,applicationId = applicationId ,paymentLinkId = paymentLinkId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createPaymentLink(body: CreatePaymentLinkRequest, headers: Map<String, String> = emptyMap())
    : Response<CreatePaymentLinkResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.createPaymentLink(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun pollingPaymentLink(paymentLinkId: String, headers: Map<String, String> = emptyMap())
    : Response<PollingPaymentLinkResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.pollingPaymentLink(companyId = config.companyId ,applicationId = applicationId ,paymentLinkId = paymentLinkId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun resendPaymentLink(body: CancelOrResendPaymentLinkRequest, headers: Map<String, String> = emptyMap())
    : Response<ResendPaymentLinkResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.resendPaymentLink(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun cancelPaymentLink(body: CancelOrResendPaymentLinkRequest, headers: Map<String, String> = emptyMap())
    : Response<CancelPaymentLinkResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.cancelPaymentLink(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentModeControlRoutes(mode: String, headers: Map<String, String> = emptyMap())
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentModeControlRoutes(companyId = config.companyId ,applicationId = applicationId ,mode = mode, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun setMerchantModeControlRoutes(mode: String,body: MerchantPaymentModeRequest, headers: Map<String, String> = emptyMap())
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.setMerchantModeControlRoutes(companyId = config.companyId ,applicationId = applicationId ,mode = mode, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentModeCustomConfig(mode: String, headers: Map<String, String> = emptyMap())
    : Response<PaymentCustomConfigResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentModeCustomConfig(companyId = config.companyId ,applicationId = applicationId ,mode = mode, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun setPaymentModeCustomConfig(mode: String,body: PaymentCustomConfigRequestSchema, headers: Map<String, String> = emptyMap())
    : Response<PaymentCustomConfigResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.setPaymentModeCustomConfig(companyId = config.companyId ,applicationId = applicationId ,mode = mode, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentCodeOption( headers: Map<String, String> = emptyMap())
    : Response<GetPaymentCodeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentCodeOption(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentSession(gid: String,lineItem: Boolean?=null, headers: Map<String, String> = emptyMap())
    : Response<PaymentSessionSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentSession(companyId = config.companyId ,applicationId = applicationId ,gid = gid,lineItem = lineItem, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updatePaymentSession(gid: String,body: PaymentSessionRequestSerializer, headers: Map<String, String> = emptyMap())
    : Response<PaymentSessionResponseSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.updatePaymentSession(companyId = config.companyId ,applicationId = applicationId ,gid = gid, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateRefundSession(gid: String,requestId: String,body: RefundSessionRequestSerializer, headers: Map<String, String> = emptyMap())
    : Response<RefundSessionResponseSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.updateRefundSession(companyId = config.companyId ,applicationId = applicationId ,gid = gid,requestId = requestId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchantPaymentOption( headers: Map<String, String> = emptyMap())
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getMerchantPaymentOption(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun patchMerchantPaymentOption(body: MerchnatPaymentModeRequest, headers: Map<String, String> = emptyMap())
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.patchMerchantPaymentOption(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchantAggregatorPaymentModeDetails(aggregatorId: String,businessUnit: String,device: String, headers: Map<String, String> = emptyMap())
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getMerchantAggregatorPaymentModeDetails(companyId = config.companyId ,applicationId = applicationId ,aggregatorId = aggregatorId,businessUnit = businessUnit,device = device, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun patchMerchantAggregatorPaymentModeDetails(aggregatorId: String,body: PlatformPaymentModeResponse, headers: Map<String, String> = emptyMap())
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.patchMerchantAggregatorPaymentModeDetails(companyId = config.companyId ,applicationId = applicationId ,aggregatorId = aggregatorId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPGConfigAggregators( headers: Map<String, String> = emptyMap())
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPGConfigAggregators(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchantRefundPriority(configType: String, headers: Map<String, String> = emptyMap())
    : Response<RefundPriorityResponseSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getMerchantRefundPriority(companyId = config.companyId ,applicationId = applicationId ,configType = configType, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createMerchantRefundPriority(configType: String,body: RefundPriorityRequestSerializer, headers: Map<String, String> = emptyMap())
    : Response<RefundPriorityResponseSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.createMerchantRefundPriority(companyId = config.companyId ,applicationId = applicationId ,configType = configType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchantRefundPriority(configType: String,body: RefundPriorityRequestSerializer, headers: Map<String, String> = emptyMap())
    : Response<RefundPriorityResponseSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.updateMerchantRefundPriority(companyId = config.companyId ,applicationId = applicationId ,configType = configType, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createPaymentOrder(body: PaymentOrderRequest, headers: Map<String, String> = emptyMap())
    : Response<PaymentOrderResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.createPaymentOrder(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchantAggregatorAppVersion(aggregatorId: String,businessUnit: String,device: String,paymentModeId: Int?=null,subPaymentMode: String?=null, headers: Map<String, String> = emptyMap())
    : Response<AggregatorVersionResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getMerchantAggregatorAppVersion(companyId = config.companyId ,applicationId = applicationId ,aggregatorId = aggregatorId,businessUnit = businessUnit,device = device,paymentModeId = paymentModeId,subPaymentMode = subPaymentMode, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun patchMerchantPaymentOptionVersion(aggregatorId: String,body: AggregatorControlRequest, headers: Map<String, String> = emptyMap())
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.patchMerchantPaymentOptionVersion(companyId = config.companyId ,applicationId = applicationId ,aggregatorId = aggregatorId, body = body,headers = headers)
        } else {
            null
        }
    }
    
}
}