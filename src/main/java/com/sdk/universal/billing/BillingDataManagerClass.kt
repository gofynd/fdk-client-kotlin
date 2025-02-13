package com.sdk.universal.billing

import com.sdk.common.*
import com.sdk.universal.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class BillingDataManagerClass(val config: PublicConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val billingApiList by lazy {
        generatebillingApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getStandardPlans"] = "/service/public/billing/v1.0/plan/detailed-list/".substring(1)
            
                    _relativeUrls["getPlanDetails"] = "/service/public/billing/v1.0/plan/details/{plan_id}".substring(1)
            
                    _relativeUrls["planList"] = "/service/public/billing/v1.0/plan/list".substring(1)
            
                    _relativeUrls["getTenureConfig"] = "/service/public/billing/v1.0/tenure-config/{country_code}".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }


    private fun generatebillingApiList(): BillingApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = PublicHeaderInterceptor(config)
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
            namespace = "PublicBilling",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(BillingApiList::class.java) as? BillingApiList
    }
    
    suspend fun getStandardPlans(platform: String?=null, headers: Map<String, String> = emptyMap()): Response<DetailList>? {
        var fullUrl : String? = _relativeUrls["getStandardPlans"]
        
        return billingApiList?.getStandardPlans(fullUrl,   platform = platform,headers = headers)}

    
    
    suspend fun getPlanDetails(planId: String, headers: Map<String, String> = emptyMap()): Response<PlanDetails>? {
        var fullUrl : String? = _relativeUrls["getPlanDetails"]
        
        fullUrl = fullUrl?.replace("{" + "plan_id" +"}",planId.toString())
        
        return billingApiList?.getPlanDetails(fullUrl,  headers = headers)}

    
    
    suspend fun planList( headers: Map<String, String> = emptyMap()): Response<ArrayList<PlanList>>? {
        var fullUrl : String? = _relativeUrls["planList"]
        
        return billingApiList?.planList(fullUrl, headers = headers)}

    
    
    suspend fun getTenureConfig(countryCode: String, headers: Map<String, String> = emptyMap()): Response<TenureConfigResponse>? {
        var fullUrl : String? = _relativeUrls["getTenureConfig"]
        
        fullUrl = fullUrl?.replace("{" + "country_code" +"}",countryCode.toString())
        
        return billingApiList?.getTenureConfig(fullUrl,  headers = headers)}

    
    
}
