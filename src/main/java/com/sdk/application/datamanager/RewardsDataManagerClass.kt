package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class RewardsDataManagerClass(val config: ApplicationConfig) : BaseRepository() {
    
    private val rewardsApiList by lazy {
        generaterewardsApiList()
    }

    private fun generaterewardsApiList(): RewardsApiList? {
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
            namespace = "ApplicationRewards",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(RewardsApiList::class.java) as? RewardsApiList
    }
    
    fun getPointsOnProduct(body: CatalogueOrderRequest): Deferred<Response<CatalogueOrderResponse>>? {
        return rewardsApiList?.getPointsOnProduct(body = body)}

    
    
    fun getOfferByName(name: String): Deferred<Response<Offer>>? {
        return rewardsApiList?.getOfferByName(name = name)}

    
    
    fun getOrderDiscount(body: OrderDiscountRequest): Deferred<Response<OrderDiscountResponse>>? {
        return rewardsApiList?.getOrderDiscount(body = body)}

    
    
    fun getUserPoints(): Deferred<Response<PointsResponse>>? {
        return rewardsApiList?.getUserPoints()}

    
    
    fun getUserPointsHistory(pageId: String?=null, pageSize: Int?=null): Deferred<Response<PointsHistoryResponse>>? {
        return rewardsApiList?.getUserPointsHistory(pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
            
                
            
        
            
                
            
            
        
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
                rewardsApiList?.getUserPointsHistory(pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
        return rewardsApiList?.getUserReferralDetails()}

    
    
    fun redeemReferralCode(body: RedeemReferralCodeRequest): Deferred<Response<RedeemReferralCodeResponse>>? {
        return rewardsApiList?.redeemReferralCode(body = body)}

    
    
}
