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

    
    
    suspend fun showGiveaways(pageId: String,pageSize: Int, headers: Map<String, String> = emptyMap())
    : Response<ListGiveaway>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.showGiveaways(companyId = config.companyId ,applicationId = applicationId ,pageId = pageId,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun saveGiveAway(body: Giveaway, headers: Map<String, String> = emptyMap())
    : Response<Giveaway>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.saveGiveAway(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getGiveawayById(id: String, headers: Map<String, String> = emptyMap())
    : Response<Giveaway>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getGiveawayById(companyId = config.companyId ,applicationId = applicationId ,id = id, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateGiveAway(id: String,body: Giveaway, headers: Map<String, String> = emptyMap())
    : Response<Giveaway>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateGiveAway(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun showOffers( headers: Map<String, String> = emptyMap())
    : Response<ArrayList<Offer>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.showOffers(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getOfferByName(name: String, headers: Map<String, String> = emptyMap())
    : Response<Offer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getOfferByName(name = name,companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateOfferByName(name: String,body: Offer, headers: Map<String, String> = emptyMap())
    : Response<Offer>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateOfferByName(name = name,companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateUserStatus(userId: String,body: AppUser, headers: Map<String, String> = emptyMap())
    : Response<AppUser>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.updateUserStatus(userId = userId,companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUserDetails(userId: String, headers: Map<String, String> = emptyMap())
    : Response<UserRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getUserDetails(userId = userId,companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getUserPointsHistory(userId: String,pageId: String?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<HistoryRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getUserPointsHistory(userId = userId,companyId = config.companyId ,applicationId = applicationId ,pageId = pageId,pageSize = pageSize, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getRewardsConfiguration( headers: Map<String, String> = emptyMap())
    : Response<ConfigurationRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.getRewardsConfiguration(companyId = config.companyId ,applicationId = applicationId , headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun setRewardsConfiguration(body: SetConfiguration, headers: Map<String, String> = emptyMap())
    : Response<SetConfigurationRes>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                rewardsApiList?.setRewardsConfiguration(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
}
}