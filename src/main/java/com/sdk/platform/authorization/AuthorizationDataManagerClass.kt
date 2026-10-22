package com.sdk.platform.authorization

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class AuthorizationDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val authorizationApiList by lazy {
        generateauthorizationApiList()
    }

    private fun generateauthorizationApiList(): AuthorizationApiList? {
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
            namespace = "PlatformAuthorization",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(AuthorizationApiList::class.java) as? AuthorizationApiList
    }
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getApplicationStaffList(pageNo: Int?=null,pageSize: Int?=null,orderIncent: Boolean?=null,orderingStore: Int?=null,user: String?=null,userName: String?=null, headers: Map<String, String> = emptyMap())
    : Response<ApplicationStaffPage>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                authorizationApiList?.getApplicationStaffList(companyId = config.companyId ,applicationId = applicationId ,pageNo = pageNo,pageSize = pageSize,orderIncent = orderIncent,orderingStore = orderingStore,user = user,userName = userName, headers = headers)
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getApplicationStaffList
    **/
    fun getApplicationStaffListPaginator(
    pageSize: Int?=null, orderIncent: Boolean?=null, orderingStore: Int?=null, user: String?=null, userName: String?=null
    
    ) : Paginator<ApplicationStaffPage>{
        val paginator = Paginator<ApplicationStaffPage>()
        paginator.setCallBack(object : PaginatorCallback<ApplicationStaffPage> {

            override suspend fun onNext(
                onResponse: (Event<ApplicationStaffPage>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    authorizationApiList?.getApplicationStaffList(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, orderIncent = orderIncent, orderingStore = orderingStore, user = user, userName = userName)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
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