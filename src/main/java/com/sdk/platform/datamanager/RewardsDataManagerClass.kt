package com.sdk.platform.datamanager

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
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(RewardsApiList::class.java) as? RewardsApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun showGiveaways(pageId: String, pageSize: Int)
    : Deferred<Response<GiveawayResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.showGiveaways(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun saveGiveAway(body: Giveaway)
    : Deferred<Response<Giveaway>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.saveGiveAway(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getGiveawayById(id: String)
    : Deferred<Response<Giveaway>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getGiveawayById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateGiveAway(id: String,body: Giveaway)
    : Deferred<Response<Giveaway>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateGiveAway(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getGiveawayAudienceStatus(audienceId: String)
    : Deferred<Response<GiveawayAudience>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getGiveawayAudienceStatus(audienceId = audienceId, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun showOffers()
    : Deferred<Response<ArrayList<Offer>>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.showOffers(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getOfferByName(name: String, cookie: String)
    : Deferred<Response<Offer>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getOfferByName(name = name, companyId = config.companyId , applicationId = applicationId , cookie = cookie )
        } else {
            null
        }
    }
    
    
    suspend fun updateOfferByName(name: String,body: Offer)
    : Deferred<Response<Offer>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateOfferByName(name = name, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateUserStatus(userId: String,body: AppUser)
    : Deferred<Response<AppUser>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateUserStatus(userId = userId, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun user(userId: String)
    : Deferred<Response<UserRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.user(userId = userId, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getPointsHistory(userId: String, pageId: String?=null, pageSize: Int?=null)
    : Deferred<Response<HistoryRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getPointsHistory(userId = userId, companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getPointsHistory
    **/
    fun getPointsHistoryPaginator(
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
                    rewardsApiList?.getPointsHistory(userId = userId, companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
}
}