package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.rewards.*
import com.sdk.platform.apis.rewards.*




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

    
    
    suspend fun getGiveaways(pageId: String?=null, pageSize: Int?=null)
    : Deferred<Response<GiveawayResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getGiveaways(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getGiveaways
    **/
    fun getGiveawaysPaginator(
    pageSize: Int?=null
    
    ) : Paginator<GiveawayResponse>{
        val paginator = Paginator<GiveawayResponse>()
        paginator.setCallBack(object : PaginatorCallback<GiveawayResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<GiveawayResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    rewardsApiList?.getGiveaways(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createGiveaway(body: Giveaway)
    : Deferred<Response<Giveaway>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.createGiveaway(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getGiveawayByID(id: String)
    : Deferred<Response<Giveaway>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getGiveawayByID(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateGiveaway(id: String,body: Giveaway)
    : Deferred<Response<Giveaway>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateGiveaway(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getOffers()
    : Deferred<Response<ArrayList<Offer>>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getOffers(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getOfferByName(cookie: String, name: String)
    : Deferred<Response<Offer>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getOfferByName(companyId = config.companyId , applicationId = applicationId , cookie = cookie, name = name )
        } else {
            null
        }
    }
    
    
    suspend fun updateOfferByName(name: String,body: Offer)
    : Deferred<Response<Offer>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateOfferByName(companyId = config.companyId , applicationId = applicationId , name = name, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getUserAvailablePoints(userId: String)
    : Deferred<Response<UserRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getUserAvailablePoints(companyId = config.companyId , applicationId = applicationId , userId = userId )
        } else {
            null
        }
    }
    
    
    suspend fun updateUserStatus(userId: String,body: AppUser)
    : Deferred<Response<AppUser>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateUserStatus(companyId = config.companyId , applicationId = applicationId , userId = userId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getUserPointsHistory(userId: String, pageId: String?=null, pageLimit: Int?=null, pageSize: Int?=null)
    : Deferred<Response<HistoryRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getUserPointsHistory(companyId = config.companyId , applicationId = applicationId , userId = userId, pageId = pageId, pageLimit = pageLimit, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getUserPointsHistory
    **/
    fun getUserPointsHistoryPaginator(
    userId: String, pageLimit: Int?=null, pageSize: Int?=null
    
    ) : Paginator<HistoryRes>{
        val paginator = Paginator<HistoryRes>()
        paginator.setCallBack(object : PaginatorCallback<HistoryRes> {
            
            override suspend fun onNext(
                onResponse: (Event<HistoryRes>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    rewardsApiList?.getUserPointsHistory(companyId = config.companyId , applicationId = applicationId , userId = userId, pageId = pageId, pageLimit = pageLimit, pageSize = pageSize)?.safeAwait{ response, error ->
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