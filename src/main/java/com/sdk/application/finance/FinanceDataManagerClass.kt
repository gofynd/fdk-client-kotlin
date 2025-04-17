package com.sdk.application.finance

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class FinanceDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val financeApiList by lazy {
        generatefinanceApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["customerCreditBalance"] = "/service/application/finance/v1.0/customer-credit-balance".substring(1)
            
                    _relativeUrls["lockUnlockCreditNote"] = "/service/application/finance/v1.0/lock-unlock-credit-note".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }


    private fun generatefinanceApiList(): FinanceApiList? {
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
            namespace = "ApplicationFinance",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(FinanceApiList::class.java) as? FinanceApiList
    }
    
    suspend fun customerCreditBalance(body: CustomerCreditBalanceRequestSchema, headers: Map<String, String> = emptyMap()): Response<CustomerCreditBalanceResponseSchema>? {
        var fullUrl : String? = _relativeUrls["customerCreditBalance"]
        
        return financeApiList?.customerCreditBalance(fullUrl, body = body,headers = headers)}

    
    
    suspend fun lockUnlockCreditNote(body: LockUnlockRequestSchema, headers: Map<String, String> = emptyMap()): Response<LockUnlockResponseSchema>? {
        var fullUrl : String? = _relativeUrls["lockUnlockCreditNote"]
        
        return financeApiList?.lockUnlockCreditNote(fullUrl, body = body,headers = headers)}

    
    
}
