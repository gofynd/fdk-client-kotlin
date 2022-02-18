package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class FeedbackDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val feedbackApiList by lazy {
        generatefeedbackApiList()
    }
    
    private fun generatefeedbackApiList(): FeedbackApiList? {
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformFeedback",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(FeedbackApiList::class.java) as? FeedbackApiList
    }
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getAttributes(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<FeedbackAttributes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.getAttributes(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAttributes
    **/
    fun getAttributesPaginator(
    pageSize: Int?=null
    
    ) : Paginator<FeedbackAttributes>{
        val paginator = Paginator<FeedbackAttributes>()
        paginator.setCallBack(object : PaginatorCallback<FeedbackAttributes> {
            
            override suspend fun onNext(
                onResponse: (Event<FeedbackAttributes>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    feedbackApiList?.getAttributes(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun getCustomerReviews(id: String?=null, entityId: String?=null, entityType: String?=null, userId: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attributeRating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, next: String?=null, start: String?=null, limit: String?=null, count: String?=null, pageId: String?=null, pageSize: Int?=null)
    : Deferred<Response<GetReviewResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.getCustomerReviews(companyId = config.companyId , applicationId = applicationId , id = id, entityId = entityId, entityType = entityType, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, next = next, start = start, limit = limit, count = count, pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCustomerReviews
    **/
    fun getCustomerReviewsPaginator(
    id: String?=null, entityId: String?=null, entityType: String?=null, userId: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attributeRating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, next: String?=null, start: String?=null, limit: String?=null, count: String?=null, pageSize: Int?=null
    
    ) : Paginator<GetReviewResponse>{
        val paginator = Paginator<GetReviewResponse>()
        paginator.setCallBack(object : PaginatorCallback<GetReviewResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<GetReviewResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    feedbackApiList?.getCustomerReviews(companyId = config.companyId , applicationId = applicationId , id = id, entityId = entityId, entityType = entityType, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, next = next, start = start, limit = limit, count = count, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun updateApprove(reviewId: String,body: ApproveRequest)
    : Deferred<Response<UpdateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.updateApprove(companyId = config.companyId , applicationId = applicationId , reviewId = reviewId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getHistory(reviewId: String)
    : Deferred<Response<ArrayList<ActivityDump>>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.getHistory(companyId = config.companyId , applicationId = applicationId , reviewId = reviewId )
        } else {
            null
        }
    }
    
    
    suspend fun getApplicationTemplates(pageId: String?=null, pageSize: Int?=null)
    : Deferred<Response<TemplateGetResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.getApplicationTemplates(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getApplicationTemplates
    **/
    fun getApplicationTemplatesPaginator(
    pageSize: Int?=null
    
    ) : Paginator<TemplateGetResponse>{
        val paginator = Paginator<TemplateGetResponse>()
        paginator.setCallBack(object : PaginatorCallback<TemplateGetResponse> {
            
            override suspend fun onNext(
                onResponse: (Event<TemplateGetResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "cursor"
                    feedbackApiList?.getApplicationTemplates(companyId = config.companyId , applicationId = applicationId , pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    suspend fun createTemplate(body: TemplateRequestList)
    : Deferred<Response<InsertResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.createTemplate(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getTemplateById(id: String)
    : Deferred<Response<Template>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.getTemplateById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
    
    suspend fun updateTemplate(id: String,body: UpdateTemplateRequest)
    : Deferred<Response<UpdateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.updateTemplate(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateTemplateStatus(id: String,body: UpdateTemplateStatusRequest)
    : Deferred<Response<UpdateResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                feedbackApiList?.updateTemplateStatus(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
        } else {
            null
        }
    }
    
}
}