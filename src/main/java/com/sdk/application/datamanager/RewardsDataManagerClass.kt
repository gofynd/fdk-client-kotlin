package com.sdk.application.datamanager

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
            
                    _relativeUrls["getPointsOnProduct"] = "/service/application/rewards/v1.0/catalogue/offer/order/"?.substring(1)
            
                    _relativeUrls["getOfferByName"] = "/service/application/rewards/v1.0/offers/{name}/"?.substring(1)
            
                    _relativeUrls["getOrderDiscount"] = "/service/application/rewards/v1.0/user/offers/order-discount/"?.substring(1)
            
                    _relativeUrls["getUserPoints"] = "/service/application/rewards/v1.0/user/points/"?.substring(1)
            
                    _relativeUrls["getUserPointsHistory"] = "/service/application/rewards/v1.0/user/points/history/"?.substring(1)
            
                    _relativeUrls["getUserReferralDetails"] = "/service/application/rewards/v1.0/user/referral/"?.substring(1)
            
                    _relativeUrls["redeemReferralCode"] = "/service/application/rewards/v1.0/user/referral/redeem/"?.substring(1)
            
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationRewards",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(RewardsApiList::class.java) as? RewardsApiList
    }
    
    fun getPointsOnProduct(body: CatalogueOrderRequest): Deferred<Response<CatalogueOrderResponse>>? {
        var fullUrl : String? = _relativeUrls["getPointsOnProduct"] 
        
        return rewardsApiList?.getPointsOnProduct(fullUrl  ,body = body)}

    
    
    fun getOfferByName(name: String): Deferred<Response<Offer>>? {
        var fullUrl : String? = _relativeUrls["getOfferByName"] 
        
        fullUrl = fullUrl?.replace("{" + "name" +"}",name.toString())
        
        return rewardsApiList?.getOfferByName(fullUrl   )}

    
    
    fun getOrderDiscount(body: OrderDiscountRequest): Deferred<Response<OrderDiscountResponse>>? {
        var fullUrl : String? = _relativeUrls["getOrderDiscount"] 
        
        return rewardsApiList?.getOrderDiscount(fullUrl  ,body = body)}

    
    
    fun getUserPoints(): Deferred<Response<PointsResponse>>? {
        var fullUrl : String? = _relativeUrls["getUserPoints"] 
        
        return rewardsApiList?.getUserPoints(fullUrl  )}

    
    
    fun getUserPointsHistory(pageId: String?=null, pageSize: Int?=null): Deferred<Response<PointsHistoryResponse>>? {
        var fullUrl : String? = _relativeUrls["getUserPointsHistory"] 
        
        return rewardsApiList?.getUserPointsHistory(fullUrl    ,  pageId = pageId,    pageSize = pageSize)}

    
    
    
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getUserPointsHistory
    **/
    fun getUserPointsHistoryPaginator(pageSize: Int?=null) : Paginator<PointsHistoryResponse>{

    val paginator = Paginator<PointsHistoryResponse>()

    paginator.setCallBack(object : PaginatorCallback<PointsHistoryResponse> {

            override suspend fun onNext(
                onResponse: (Event<PointsHistoryResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                var fullUrl : String? = _relativeUrls["getUserPointsHistory"] 
                
                rewardsApiList?.getUserPointsHistory(fullUrl , pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                        onResponse.invoke(response, null)
                    }

                    error?.let {
                        onResponse.invoke(null,error)
                    }
            }
        }

    })
    
    return paginator
    }
    
    fun getUserReferralDetails(): Deferred<Response<ReferralDetailsResponse>>? {
        var fullUrl : String? = _relativeUrls["getUserReferralDetails"] 
        
        return rewardsApiList?.getUserReferralDetails(fullUrl  )}

    
    
    fun redeemReferralCode(body: RedeemReferralCodeRequest): Deferred<Response<RedeemReferralCodeResponse>>? {
        var fullUrl : String? = _relativeUrls["redeemReferralCode"] 
        
        return rewardsApiList?.redeemReferralCode(fullUrl  ,body = body)}

    
    
}
