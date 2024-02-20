package com.sdk.platform.rewards

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class RewardsDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val rewardsApiList by lazy {
        generaterewardsApiList()
    }
    
    private fun generaterewardsApiList(): RewardsApiList? {
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
            namespace = "PlatformRewards",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(RewardsApiList::class.java) as? RewardsApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun showGiveaways(pageId: String, pageSize: Int)
    : Response<GiveawayResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.showGiveaways(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun saveGiveAway(body: Giveaway)
    : Response<Giveaway>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.saveGiveAway(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getGiveawayById(id: String)
    : Response<Giveaway>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getGiveawayById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateGiveAway(id: String,body: Giveaway)
    : Response<Giveaway>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateGiveAway(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun showOffers()
    : Response<ArrayList<Offer>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.showOffers(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getOfferByName(name: String)
    : Response<Offer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getOfferByName(name = name, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updateOfferByName(name: String,body: Offer)
    : Response<Offer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateOfferByName(name = name, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateUserStatus(userId: String,body: AppUser)
    : Response<AppUser>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateUserStatus(userId = userId, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getUserDetails(userId: String)
    : Response<UserRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getUserDetails(userId = userId, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getUserPointsHistory(userId: String, pageId: String?=null, pageSize: Int?=null)
    : Response<HistoryRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getUserPointsHistory(userId = userId, companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getUserPointsHistory
    **/
    fun getUserPointsHistoryPaginator(
    userId: String, pageSize: Int?=null
    
    ) : Paginator<HistoryRes>{
        val paginator = Paginator<HistoryRes>()
        paginator.setCallBack(object : PaginatorCallback<HistoryRes> {
            
            override suspend fun onNext(
                onResponse: (Event<HistoryRes>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    rewardsApiList?.getUserPointsHistory(userId = userId, companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,nextId=page?.nextId)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    suspend fun getRewardsConfiguration()
    : Response<ConfigurationRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getRewardsConfiguration(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun setRewardsConfiguration(body: ConfigurationRequest)
    : Response<SetConfigurationRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.setRewardsConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
}
}