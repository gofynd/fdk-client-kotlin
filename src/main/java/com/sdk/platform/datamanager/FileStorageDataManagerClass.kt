package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.filestorage.*
import com.sdk.platform.apis.filestorage.*




class FileStorageDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val fileStorageApiList by lazy {
        generatefileStorageApiList()
    }
    
    private fun generatefileStorageApiList(): FileStorageApiList? {
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
            namespace = "PlatformFileStorage",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(FileStorageApiList::class.java) as? FileStorageApiList
    }
    
    
    suspend fun startUpload(namespace: String,body: StartRequest)
    : Deferred<Response<StartResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.startUpload(
        namespace = namespace, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun completeUpload(namespace: String,body: StartResponse)
    : Deferred<Response<CompleteResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.completeUpload(
        namespace = namespace, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun getSignUrls(body: SignUrlRequest)
    : Deferred<Response<SignUrlResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.getSignUrls(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun copyFiles(sync: Boolean?=null,body: BulkRequest)
    : Deferred<Response<BulkUploadResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.copyFiles(
        sync = sync, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    suspend fun browse(namespace: String, pageNo: Int?=null)
    : Deferred<Response<BrowseResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.browse(
        namespace = namespace, companyId = config.companyId, pageNo = pageNo )
        } else {
            null
        } 
    }
    
    
    
    suspend fun proxy(url: String)
    : Deferred<Response<ResponseBody>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.proxy(
        companyId = config.companyId, url = url )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    suspend fun appStartUpload(namespace: String,body: StartRequest)
    : Deferred<Response<StartResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.appStartUpload(namespace = namespace, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun appCompleteUpload(namespace: String,body: StartResponse)
    : Deferred<Response<CompleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.appCompleteUpload(namespace = namespace, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun appCopyFiles(sync: Boolean?=null,body: BulkRequest)
    : Deferred<Response<BulkUploadResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.appCopyFiles(sync = sync, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    suspend fun browse(namespace: String, pageNo: Int?=null)
    : Deferred<Response<BrowseResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.browse(namespace = namespace, companyId = config.companyId , applicationId = applicationId , pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
    /**
    *
    * Summary: Paginator for browse
    **/
    fun browsePaginator(
    namespace: String
    
    ) : Paginator<BrowseResponse>{
        val paginator = Paginator<BrowseResponse>()
        paginator.setCallBack(object : PaginatorCallback<BrowseResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<BrowseResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    fileStorageApiList?.browse(namespace = namespace, companyId = config.companyId , applicationId = applicationId , pageNo = pageNo)?.safeAwait{ response, error ->
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