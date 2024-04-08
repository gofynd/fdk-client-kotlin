package com.sdk.platform.discount

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class DiscountDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val discountApiList by lazy {
        generatediscountApiList()
    }
    
    private fun generatediscountApiList(): DiscountApiList? {
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
            namespace = "PlatformDiscount",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(DiscountApiList::class.java) as? DiscountApiList
    }
    
    
    suspend fun getDiscounts(view: String?=null, q: String?=null, pageNo: Int?=null, pageSize: Int?=null, archived: Boolean?=null, month: Int?=null, year: Int?=null, type: String?=null, appIds: ArrayList<String>?=null)
    : Response<ListOrCalender>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.getDiscounts(
        companyId = config.companyId, view = view, q = q, pageNo = pageNo, pageSize = pageSize, archived = archived, month = month, year = year, type = type, appIds = appIds )
        } else {
            null
        } 
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getDiscounts
    **/
    fun getDiscountsPaginator(companyId: String, view: String?=null, q: String?=null, pageSize: Int?=null, archived: Boolean?=null, month: Int?=null, year: Int?=null, type: String?=null, appIds: ArrayList<String>?=null) : Paginator<ListOrCalender>{
        val paginator = Paginator<ListOrCalender>()
        paginator.setCallBack(object : PaginatorCallback<ListOrCalender> {
           
            override suspend fun onNext(
                onResponse: (Event<ListOrCalender>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    discountApiList?.getDiscounts(
                    companyId = config.companyId, view = view, q = q, pageNo = pageNo, pageSize = pageSize, archived = archived, month = month, year = year, type = type, appIds = appIds
                    )?.safeAwait{ response, error ->
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
    
    suspend fun createDiscount(body: CreateUpdateDiscount)
    : Response<DiscountJob>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.createDiscount(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getDiscount(id: String)
    : Response<DiscountJob>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.getDiscount(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun updateDiscount(id: String,body: CreateUpdateDiscount)
    : Response<DiscountJob>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.updateDiscount(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun upsertDiscountItems(id: String,body: BulkDiscount)
    : Response<HashMap<String,Any>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.upsertDiscountItems(
        companyId = config.companyId, id = id, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun validateDiscountFile(discount: String?=null,body: FileJobRequest)
    : Response<FileJobResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.validateDiscountFile(
        companyId = config.companyId, discount = discount, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun downloadDiscountFile(type: String,body: DownloadFileJob)
    : Response<FileJobResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.downloadDiscountFile(
        companyId = config.companyId, type = type, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getValidationJob(id: String)
    : Response<FileJobResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.getValidationJob(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun cancelValidationJob(id: String)
    : Response<CancelJobResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.cancelValidationJob(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun getDownloadJob(id: String)
    : Response<FileJobResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.getDownloadJob(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    
    
    suspend fun cancelDownloadJob(id: String)
    : Response<CancelJobResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            discountApiList?.cancelDownloadJob(
        companyId = config.companyId, id = id )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
}
}