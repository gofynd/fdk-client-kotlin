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
            
                    _relativeUrls["getOfferByName"] = "/service/application/rewards/v1.0/offers/{name}/"?.substring(1)
            
                    _relativeUrls["catalogueOrder"] = "/service/application/rewards/v1.0/catalogue/offer/order/"?.substring(1)
            
                    _relativeUrls["getPointsHistory"] = "/service/application/rewards/v1.0/user/points/history/"?.substring(1)
            
                    _relativeUrls["getPoints"] = "/service/application/rewards/v1.0/user/points/"?.substring(1)
            
                    _relativeUrls["referral"] = "/service/application/rewards/v1.0/user/referral/"?.substring(1)
            
                    _relativeUrls["orderDiscount"] = "/service/application/rewards/v1.0/user/offer/order-discount/"?.substring(1)
            
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
    
    fun getOfferByName(name: String): Deferred<Response<Offer>>? {
        var fullUrl : String? = _relativeUrls["getOfferByName"] 
        
        fullUrl = fullUrl?.replace("{" + "name" +"}",name.toString())
        
        return rewardsApiList?.getOfferByName(fullUrl   )}

    
    
    fun catalogueOrder(body: CatalogueOrderRequest): Deferred<Response<CatalogueOrderResponse>>? {
        var fullUrl : String? = _relativeUrls["catalogueOrder"] 
        
        return rewardsApiList?.catalogueOrder(fullUrl  ,body = body)}

    
    
    fun getPointsHistory(pageId: String?=null, pageSize: Int?=null): Deferred<Response<PointsHistoryResponse>>? {
        var fullUrl : String? = _relativeUrls["getPointsHistory"] 
        
        return rewardsApiList?.getPointsHistory(fullUrl    ,  pageId = pageId,    pageSize = pageSize)}

    
    
    
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getPointsHistory
    **/
    fun getPointsHistoryPaginator(pageSize: Int?=null) : Paginator<PointsHistoryResponse>{

    val paginator = Paginator<PointsHistoryResponse>()

    paginator.setCallBack(object : PaginatorCallback<PointsHistoryResponse> {

            override suspend fun onNext(
                onResponse: (Event<PointsHistoryResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                var fullUrl : String? = _relativeUrls["getPointsHistory"] 
                
                rewardsApiList?.getPointsHistory(fullUrl , pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getPoints(): Deferred<Response<PointsResponse>>? {
        var fullUrl : String? = _relativeUrls["getPoints"] 
        
        return rewardsApiList?.getPoints(fullUrl  )}

    
    
    fun referral(): Deferred<Response<ReferralDetailsResponse>>? {
        var fullUrl : String? = _relativeUrls["referral"] 
        
        return rewardsApiList?.referral(fullUrl  )}

    
    
    fun orderDiscount(body: OrderDiscountRequest): Deferred<Response<OrderDiscountResponse>>? {
        var fullUrl : String? = _relativeUrls["orderDiscount"] 
        
        return rewardsApiList?.orderDiscount(fullUrl  ,body = body)}

    
    
    fun redeemReferralCode(body: RedeemReferralCodeRequest): Deferred<Response<RedeemReferralCodeResponse>>? {
        var fullUrl : String? = _relativeUrls["redeemReferralCode"] 
        
        return rewardsApiList?.redeemReferralCode(fullUrl  ,body = body)}

    
    
}
