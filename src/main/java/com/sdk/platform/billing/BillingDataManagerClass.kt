package com.sdk.platform.billing

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class BillingDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val billingApiList by lazy {
        generatebillingApiList()
    }

    private fun generatebillingApiList(): BillingApiList? {
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
            namespace = "PlatformBilling",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(BillingApiList::class.java) as? BillingApiList
    }
    
    
    suspend fun getChargeDetails(extensionId: String,chargeId: String, headers: Map<String, String> = emptyMap())
    : Response<ChargeDetails>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getChargeDetails(
        companyId = config.companyId,extensionId = extensionId,chargeId = chargeId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getSubscriptionCharge(extensionId: String,subscriptionId: String, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionChargeRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.getSubscriptionCharge(
        companyId = config.companyId,extensionId = extensionId,subscriptionId = subscriptionId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun cancelSubscriptionCharge(extensionId: String,subscriptionId: String, headers: Map<String, String> = emptyMap())
    : Response<SubscriptionChargeRes>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.cancelSubscriptionCharge(
        companyId = config.companyId,extensionId = extensionId,subscriptionId = subscriptionId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createOneTimeCharge(extensionId: String,body: CreateOneTimeCharge, headers: Map<String, String> = emptyMap())
    : Response<CreateOneTimeChargeResponseSchemas>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.createOneTimeCharge(
        companyId = config.companyId,extensionId = extensionId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createSubscriptionCharge(extensionId: String,body: CreateSubscriptionCharge, headers: Map<String, String> = emptyMap())
    : Response<CreateSubscription>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            billingApiList?.createSubscriptionCharge(
        companyId = config.companyId,extensionId = extensionId, body = body,headers = headers)
        } else {
            null
        }
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
}
}