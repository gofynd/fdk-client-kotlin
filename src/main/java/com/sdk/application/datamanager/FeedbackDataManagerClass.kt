package com.sdk.application.datamanager

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class FeedbackDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {
    
    private val feedbackApiList by lazy {
        generatefeedbackApiList()
    }

    private fun generatefeedbackApiList(): FeedbackApiList? {
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
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "ApplicationFeedback",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(FeedbackApiList::class.java) as? FeedbackApiList
    }
    
    fun createAbuseReport(body: ReportAbuseRequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createAbuseReport(body = body)}

    
    
    fun updateAbuseReport(body: UpdateAbuseStatusRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateAbuseReport(body = body)}

    
    
    fun getAbuseReports(entityId: String, entityType: String, id: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<ReportAbuseGetResponse>>? {
        return feedbackApiList?.getAbuseReports(entityId = entityId, entityType = entityType, id = id, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAbuseReports
    **/
    fun getAbuseReportsPaginator(entityId: String, entityType: String, id: String?=null, pageSize: Int?=null) : Paginator<ReportAbuseGetResponse>{

    val paginator = Paginator<ReportAbuseGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<ReportAbuseGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<ReportAbuseGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getAbuseReports(entityId = entityId, entityType = entityType, id = id, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getAttributes(pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<AttributeResponse>>? {
        return feedbackApiList?.getAttributes(pageNo = pageNo, pageSize = pageSize)}

    
    
    
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAttributes
    **/
    fun getAttributesPaginator(pageSize: Int?=null) : Paginator<AttributeResponse>{

    val paginator = Paginator<AttributeResponse>()

    paginator.setCallBack(object : PaginatorCallback<AttributeResponse> {

            override suspend fun onNext(
                onResponse: (Event<AttributeResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                feedbackApiList?.getAttributes(pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
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
    
    fun createAttribute(body: SaveAttributeRequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createAttribute(body = body)}

    
    
    fun getAttribute(slug: String): Deferred<Response<Attribute>>? {
        return feedbackApiList?.getAttribute(slug = slug)}

    
    
    fun updateAttribute(slug: String, body: UpdateAttributeRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateAttribute(slug = slug, body = body)}

    
    
    fun createComment(body: CommentRequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createComment(body = body)}

    
    
    fun updateComment(body: UpdateCommentRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateComment(body = body)}

    
    
    fun getComments(entityType: String, id: String?=null, entityId: String?=null, userId: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<CommentGetResponse>>? {
        return feedbackApiList?.getComments(entityType = entityType, id = id, entityId = entityId, userId = userId, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getComments
    **/
    fun getCommentsPaginator(entityType: String, id: String?=null, entityId: String?=null, userId: String?=null, pageSize: Int?=null) : Paginator<CommentGetResponse>{

    val paginator = Paginator<CommentGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<CommentGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<CommentGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getComments(entityType = entityType, id = id, entityId = entityId, userId = userId, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun checkEligibility(entityType: String, entityId: String): Deferred<Response<CheckEligibilityResponse>>? {
        return feedbackApiList?.checkEligibility(entityType = entityType, entityId = entityId)}

    
    
    fun deleteMedia(): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.deleteMedia()}

    
    
    fun createMedia(body: AddMediaListRequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createMedia(body = body)}

    
    
    fun updateMedia(body: UpdateMediaListRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateMedia(body = body)}

    
    
    fun getMedias(entityType: String, entityId: String, id: String?=null, type: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<MediaGetResponse>>? {
        return feedbackApiList?.getMedias(entityType = entityType, entityId = entityId, id = id, type = type, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getMedias
    **/
    fun getMediasPaginator(entityType: String, entityId: String, id: String?=null, type: String?=null, pageSize: Int?=null) : Paginator<MediaGetResponse>{

    val paginator = Paginator<MediaGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<MediaGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<MediaGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getMedias(entityType = entityType, entityId = entityId, id = id, type = type, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getReviewSummaries(entityType: String, entityId: String, id: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<ReviewMetricGetResponse>>? {
        return feedbackApiList?.getReviewSummaries(entityType = entityType, entityId = entityId, id = id, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getReviewSummaries
    **/
    fun getReviewSummariesPaginator(entityType: String, entityId: String, id: String?=null, pageSize: Int?=null) : Paginator<ReviewMetricGetResponse>{

    val paginator = Paginator<ReviewMetricGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<ReviewMetricGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<ReviewMetricGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getReviewSummaries(entityType = entityType, entityId = entityId, id = id, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun createReview(body: UpdateReviewRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.createReview(body = body)}

    
    
    fun updateReview(body: UpdateReviewRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateReview(body = body)}

    
    
    fun getReviews(entityType: String, entityId: String, id: String?=null, userId: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attributeRating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, active: Boolean?=null, approve: Boolean?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<ReviewGetResponse>>? {
        return feedbackApiList?.getReviews(entityType = entityType, entityId = entityId, id = id, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, active = active, approve = approve, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getReviews
    **/
    fun getReviewsPaginator(entityType: String, entityId: String, id: String?=null, userId: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attributeRating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, active: Boolean?=null, approve: Boolean?=null, pageSize: Int?=null) : Paginator<ReviewGetResponse>{

    val paginator = Paginator<ReviewGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<ReviewGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<ReviewGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getReviews(entityType = entityType, entityId = entityId, id = id, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, active = active, approve = approve, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getTemplates(templateId: String?=null, entityId: String?=null, entityType: String?=null): Deferred<Response<TemplateGetResponse>>? {
        return feedbackApiList?.getTemplates(templateId = templateId, entityId = entityId, entityType = entityType)}

    
    
    fun createQuestion(body: CreateQNARequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createQuestion(body = body)}

    
    
    fun updateQuestion(body: UpdateQNARequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateQuestion(body = body)}

    
    
    fun getQuestionAndAnswers(entityType: String, entityId: String, id: String?=null, userId: String?=null, showAnswer: Boolean?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<QNAGetResponse>>? {
        return feedbackApiList?.getQuestionAndAnswers(entityType = entityType, entityId = entityId, id = id, userId = userId, showAnswer = showAnswer, pageId = pageId, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getQuestionAndAnswers
    **/
    fun getQuestionAndAnswersPaginator(entityType: String, entityId: String, id: String?=null, userId: String?=null, showAnswer: Boolean?=null, pageSize: Int?=null) : Paginator<QNAGetResponse>{

    val paginator = Paginator<QNAGetResponse>()

    paginator.setCallBack(object : PaginatorCallback<QNAGetResponse> {

            override suspend fun onNext(
                onResponse: (Event<QNAGetResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "cursor"
                feedbackApiList?.getQuestionAndAnswers(entityType = entityType, entityId = entityId, id = id, userId = userId, showAnswer = showAnswer, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
    
    fun getVotes(id: String?=null, refType: String?=null, pageNo: Int?=null, pageSize: Int?=null): Deferred<Response<VoteResponse>>? {
        return feedbackApiList?.getVotes(id = id, refType = refType, pageNo = pageNo, pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getVotes
    **/
    fun getVotesPaginator(id: String?=null, refType: String?=null, pageSize: Int?=null) : Paginator<VoteResponse>{

    val paginator = Paginator<VoteResponse>()

    paginator.setCallBack(object : PaginatorCallback<VoteResponse> {

            override suspend fun onNext(
                onResponse: (Event<VoteResponse>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                feedbackApiList?.getVotes(id = id, refType = refType, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
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
    
    fun createVote(body: VoteRequest): Deferred<Response<InsertResponse>>? {
        return feedbackApiList?.createVote(body = body)}

    
    
    fun updateVote(body: UpdateVoteRequest): Deferred<Response<UpdateResponse>>? {
        return feedbackApiList?.updateVote(body = body)}

    
    
}
