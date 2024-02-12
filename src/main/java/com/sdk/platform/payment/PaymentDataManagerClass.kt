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
    
    
    
    
    
    suspend fun getAllPayouts(uniqueExternalId: String?=null)
    : Response<PayoutsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getAllPayouts(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId )
        } else {
            null
        } 
    }
    
    
    suspend fun savePayout(body: PayoutRequest)
    : Response<PayoutResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.savePayout(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updatePayout(uniqueTransferNo: String,body: PayoutRequest)
    : Response<UpdatePayoutResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.updatePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun activateAndDectivatePayout(uniqueTransferNo: String,body: UpdatePayoutRequest)
    : Response<UpdatePayoutResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.activateAndDectivatePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deletePayout(uniqueTransferNo: String)
    : Response<DeletePayoutResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.deletePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionPaymentMethod(uniqueExternalId: String?=null)
    : Response<SubscriptionPaymentMethodResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getSubscriptionPaymentMethod(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteSubscriptionPaymentMethod(uniqueExternalId: String, paymentMethodId: String)
    : Response<DeleteSubscriptionPaymentMethodResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.deleteSubscriptionPaymentMethod(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId, paymentMethodId = paymentMethodId )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionConfig()
    : Response<SubscriptionConfigResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getSubscriptionConfig(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun saveSubscriptionSetupIntent(body: SaveSubscriptionSetupIntentRequest)
    : Response<SaveSubscriptionSetupIntentResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.saveSubscriptionSetupIntent(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun verifyIfscCode(ifscCode: String?=null)
    : Response<IfscCodeResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.verifyIfscCode(
        companyId = config.companyId, ifscCode = ifscCode )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getBrandPaymentGatewayConfig(aggregator: String?=null, configType: String?=null)
    : Response<PaymentGatewayConfigResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getBrandPaymentGatewayConfig(companyId = config.companyId , applicationId = applicationId , aggregator = aggregator, configType = configType )
        } else {
            null
        }
    }
    
    
    suspend fun saveBrandPaymentGatewayConfig(body: PaymentGatewayConfigRequest)
    : Response<PaymentGatewayToBeReviewed>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.saveBrandPaymentGatewayConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentModeRoutes(refresh: Boolean, requestType: String, orderId: String?=null, shipmentId: String?=null)
    : Response<PaymentOptionsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentModeRoutes(companyId = config.companyId , applicationId = applicationId , refresh = refresh, requestType = requestType, orderId = orderId, shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    suspend fun getBankAccountDetailsOpenAPI(orderId: String, requestHash: String?=null)
    : Response<RefundAccountResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getBankAccountDetailsOpenAPI(orderId = orderId, requestHash = requestHash, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun addRefundBankAccountUsingOTP(body: AddBeneficiaryDetailsOTPRequest)
    : Response<RefundAccountResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.addRefundBankAccountUsingOTP(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    suspend fun getUserOrderBeneficiaries(orderId: String)
    : Response<OrderBeneficiaryResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getUserOrderBeneficiaries(orderId = orderId, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getUserBeneficiaries(orderId: String)
    : Response<OrderBeneficiaryResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getUserBeneficiaries(orderId = orderId, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun confirmPayment(body: PaymentConfirmationRequest)
    : Response<PaymentConfirmationResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.confirmPayment(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getUserCODlimitRoutes(merchantUserId: String, mobileNo: String)
    : Response<GetUserCODLimitResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getUserCODlimitRoutes(companyId = config.companyId , applicationId = applicationId , merchantUserId = merchantUserId, mobileNo = mobileNo )
        } else {
            null
        }
    }
    
    
    suspend fun setUserCODlimitRoutes(body: SetCODForUserRequest)
    : Response<SetCODOptionResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.setUserCODlimitRoutes(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun edcAggregatorsAndModelList()
    : Response<EdcAggregatorAndModelListResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.edcAggregatorsAndModelList(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun edcDeviceStats()
    : Response<EdcDeviceStatsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.edcDeviceStats(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateEdcDevice(body: EdcAddRequest)
    : Response<EdcDeviceAddResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.updateEdcDevice(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getEdcDevice(terminalUniqueIdentifier: String)
    : Response<EdcDeviceDetailsResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getEdcDevice(companyId = config.companyId , applicationId = applicationId , terminalUniqueIdentifier = terminalUniqueIdentifier )
        } else {
            null
        }
    }
    
    
    suspend fun addEdcDevice(terminalUniqueIdentifier: String,body: EdcUpdateRequest)
    : Response<EdcDeviceUpdateResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.addEdcDevice(companyId = config.companyId , applicationId = applicationId , terminalUniqueIdentifier = terminalUniqueIdentifier, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun edcDeviceList(pageNo: Int?=null, pageSize: Int?=null, isActive: Boolean?=null, storeId: Int?=null, deviceTag: String?=null)
    : Response<EdcDeviceListResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.edcDeviceList(pageNo = pageNo, pageSize = pageSize, isActive = isActive, storeId = storeId, deviceTag = deviceTag, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getPosPaymentModeRoutes(amount: Int, cartId: String?=null, pincode: String, checkoutMode: String?=null, refresh: Boolean?=null, orderId: String?=null, cardReference: String?=null, orderType: String, userDetails: String?=null, displaySplit: Boolean?=null, advancePayment: Boolean?=null, shipmentId: String?=null)
    : Response<PaymentModeRouteResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPosPaymentModeRoutes(companyId = config.companyId , applicationId = applicationId , amount = amount, cartId = cartId, pincode = pincode, checkoutMode = checkoutMode, refresh = refresh, orderId = orderId, cardReference = cardReference, orderType = orderType, userDetails = userDetails, displaySplit = displaySplit, advancePayment = advancePayment, shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    suspend fun initialisePayment(body: PaymentInitializationRequest)
    : Response<PaymentInitializationResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.initialisePayment(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun checkAndUpdatePaymentStatus(body: PaymentStatusUpdateRequest)
    : Response<PaymentStatusUpdateResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.checkAndUpdatePaymentStatus(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun resendOrCancelPayment(body: ResendOrCancelPaymentRequest)
    : Response<ResendOrCancelPaymentResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.resendOrCancelPayment(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun paymentStatusBulk(body: PaymentStatusBulkHandlerRequest)
    : Response<PaymentStatusBulkHandlerResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.paymentStatusBulk(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun oauthGetUrl(aggregator: String, successRedirectUrl: String?=null, failureRedirectUrl: String?=null)
    : Response<GetOauthUrlResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.oauthGetUrl(companyId = config.companyId , applicationId = applicationId , aggregator = aggregator, successRedirectUrl = successRedirectUrl, failureRedirectUrl = failureRedirectUrl )
        } else {
            null
        }
    }
    
    
    suspend fun revokeOauthToken(aggregator: String)
    : Response<RevokeOAuthToken>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.revokeOauthToken(companyId = config.companyId , applicationId = applicationId , aggregator = aggregator )
        } else {
            null
        }
    }
    
    
    suspend fun repaymentDetails(body: RepaymentDetailsSerialiserPayAll)
    : Response<RepaymentResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.repaymentDetails(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun merchantOnBoarding(body: MerchantOnBoardingRequest)
    : Response<MerchantOnBoardingResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.merchantOnBoarding(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun verifyCustomerForPayment(body: ValidateCustomerRequest)
    : Response<ValidateCustomerResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.verifyCustomerForPayment(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentLink(paymentLinkId: String?=null)
    : Response<GetPaymentLinkResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentLink(companyId = config.companyId , applicationId = applicationId , paymentLinkId = paymentLinkId )
        } else {
            null
        }
    }
    
    
    suspend fun createPaymentLink(body: CreatePaymentLinkRequest)
    : Response<CreatePaymentLinkResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.createPaymentLink(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun pollingPaymentLink(paymentLinkId: String?=null)
    : Response<PollingPaymentLinkResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.pollingPaymentLink(companyId = config.companyId , applicationId = applicationId , paymentLinkId = paymentLinkId )
        } else {
            null
        }
    }
    
    
    suspend fun resendPaymentLink(body: CancelOrResendPaymentLinkRequest)
    : Response<ResendPaymentLinkResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.resendPaymentLink(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun cancelPaymentLink(body: CancelOrResendPaymentLinkRequest)
    : Response<CancelPaymentLinkResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.cancelPaymentLink(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentModeControlRoutes(mode: String)
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentModeControlRoutes(companyId = config.companyId , applicationId = applicationId , mode = mode )
        } else {
            null
        }
    }
    
    
    suspend fun setMerchantModeControlRoutes(mode: String,body: MerchantPaymentModeRequest)
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.setMerchantModeControlRoutes(companyId = config.companyId , applicationId = applicationId , mode = mode, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentModeCustomConfig(mode: String)
    : Response<PaymentCustomConfigResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentModeCustomConfig(companyId = config.companyId , applicationId = applicationId , mode = mode )
        } else {
            null
        }
    }
    
    
    suspend fun setPaymentModeCustomConfig(mode: String,body: PaymentCustomConfigRequestSchema)
    : Response<PaymentCustomConfigResponseSchema>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.setPaymentModeCustomConfig(companyId = config.companyId , applicationId = applicationId , mode = mode, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentCodeOption()
    : Response<GetPaymentCodeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentCodeOption(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentSession(gid: String, lineItem: Boolean?=null)
    : Response<PaymentSessionSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentSession(companyId = config.companyId , applicationId = applicationId , gid = gid, lineItem = lineItem )
        } else {
            null
        }
    }
    
    
    suspend fun updatePaymentSession(gid: String,body: PaymentSessionRequestSerializer)
    : Response<PaymentSessionResponseSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.updatePaymentSession(companyId = config.companyId , applicationId = applicationId , gid = gid, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateRefundSession(gid: String, requestId: String,body: RefundSessionRequestSerializer)
    : Response<RefundSessionResponseSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.updateRefundSession(companyId = config.companyId , applicationId = applicationId , gid = gid, requestId = requestId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchantPaymentOption()
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getMerchantPaymentOption(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun patchMerchantPaymentOption(body: MerchnatPaymentModeRequest)
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.patchMerchantPaymentOption(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchantAggregatorPaymentModeDetails(aggregatorId: String, businessUnit: String, device: String)
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getMerchantAggregatorPaymentModeDetails(companyId = config.companyId , applicationId = applicationId , aggregatorId = aggregatorId, businessUnit = businessUnit, device = device )
        } else {
            null
        }
    }
    
    
    suspend fun patchMerchantAggregatorPaymentModeDetails(aggregatorId: String,body: PlatformPaymentModeResponse)
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.patchMerchantAggregatorPaymentModeDetails(companyId = config.companyId , applicationId = applicationId , aggregatorId = aggregatorId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPGConfigAggregators()
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPGConfigAggregators(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getMerchantRefundPriority(configType: String)
    : Response<RefundPriorityResponseSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getMerchantRefundPriority(companyId = config.companyId , applicationId = applicationId , configType = configType )
        } else {
            null
        }
    }
    
    
    suspend fun createMerchantRefundPriority(configType: String,body: RefundPriorityRequestSerializer)
    : Response<RefundPriorityResponseSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.createMerchantRefundPriority(companyId = config.companyId , applicationId = applicationId , configType = configType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateMerchantRefundPriority(configType: String,body: RefundPriorityRequestSerializer)
    : Response<RefundPriorityResponseSerializer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.updateMerchantRefundPriority(companyId = config.companyId , applicationId = applicationId , configType = configType, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun createPaymentOrder(body: PaymentOrderRequest)
    : Response<PaymentOrderResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.createPaymentOrder(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getMerchantAggregatorAppVersion(aggregatorId: String, businessUnit: String, device: String, paymentModeId: Int?=null, subPaymentMode: String?=null)
    : Response<AggregatorVersionResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getMerchantAggregatorAppVersion(companyId = config.companyId , applicationId = applicationId , aggregatorId = aggregatorId, businessUnit = businessUnit, device = device, paymentModeId = paymentModeId, subPaymentMode = subPaymentMode )
        } else {
            null
        }
    }
    
    
    suspend fun patchMerchantPaymentOptionVersion(aggregatorId: String,body: AggregatorControlRequest)
    : Response<PlatformPaymentModeResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.patchMerchantPaymentOptionVersion(companyId = config.companyId , applicationId = applicationId , aggregatorId = aggregatorId, body = body)
        } else {
            null
        }
    }
    
}
}