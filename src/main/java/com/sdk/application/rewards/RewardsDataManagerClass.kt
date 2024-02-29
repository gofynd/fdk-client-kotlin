package com.sdk.application.rewards

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class RewardsDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val rewardsApiList by lazy {
        generaterewardsApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getOfferByName"] = "/service/application/rewards/v1.0/offers/{name}/".substring(1)
            
                    _relativeUrls["catalogueOrder"] = "/service/application/rewards/v1.0/catalogue/offer/order/".substring(1)
            
                    _relativeUrls["getUserPointsHistory"] = "/service/application/rewards/v1.0/user/points/history/".substring(1)
            
                    _relativeUrls["getUserPoints"] = "/service/application/rewards/v1.0/user/points/".substring(1)
            
                    _relativeUrls["getUserReferralDetails"] = "/service/application/rewards/v1.0/user/referral/".substring(1)
            
                    _relativeUrls["getOrderDiscount"] = "/service/application/rewards/v1.0/user/offer/order-discount/".substring(1)
            
                    _relativeUrls["redeemReferralCode"] = "/service/application/rewards/v1.0/user/referral/redeem/".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }
    

    private fun generaterewardsApiList(): RewardsApiList? {
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
            namespace = "ApplicationRewards",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(RewardsApiList::class.java) as? RewardsApiList
    }
    
    suspend fun getOfferByName(name: String): Response<Offer>? {
        var fullUrl : String? = _relativeUrls["getOfferByName"] 
        
        fullUrl = fullUrl?.replace("{" + "name" +"}",name.toString())
        
        return rewardsApiList?.getOfferByName(fullUrl   )}

    
    
    suspend fun catalogueOrder(body: CatalogueOrderRequest): Response<CatalogueOrderResponse>? {
        var fullUrl : String? = _relativeUrls["catalogueOrder"] 
        
        return rewardsApiList?.catalogueOrder(fullUrl  ,body = body)}

    
    
    suspend fun getUserPointsHistory(pageId: String?=null, pageSize: Int?=null): Response<PointsHistoryResponse>? {
        var fullUrl : String? = _relativeUrls["getUserPointsHistory"] 
        
        return rewardsApiList?.getUserPointsHistory(fullUrl    ,  pageId = pageId,    pageSize = pageSize)}

    
    
    suspend fun getUserPoints(): Response<PointsResponse>? {
        var fullUrl : String? = _relativeUrls["getUserPoints"] 
        
        return rewardsApiList?.getUserPoints(fullUrl  )}

    
    
    suspend fun getUserReferralDetails(): Response<ReferralDetailsResponse>? {
        var fullUrl : String? = _relativeUrls["getUserReferralDetails"] 
        
        return rewardsApiList?.getUserReferralDetails(fullUrl  )}

    
    
    suspend fun getOrderDiscount(body: OrderDiscountRequest): Response<OrderDiscountResponse>? {
        var fullUrl : String? = _relativeUrls["getOrderDiscount"] 
        
        return rewardsApiList?.getOrderDiscount(fullUrl  ,body = body)}

    
    
    suspend fun redeemReferralCode(body: RedeemReferralCodeRequest): Response<RedeemReferralCodeResponse>? {
        var fullUrl : String? = _relativeUrls["redeemReferralCode"] 
        
        return rewardsApiList?.redeemReferralCode(fullUrl  ,body = body)}

    
    
}
