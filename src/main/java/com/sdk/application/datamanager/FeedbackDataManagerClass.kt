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

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["createAbuseReport"] = "/service/application/feedback/v1.0/abuse/"?.substring(1)
            
                    _relativeUrls["updateAbuseReport"] = "/service/application/feedback/v1.0/abuse/"?.substring(1)
            
                    _relativeUrls["getAbuseReports"] = "/service/application/feedback/v1.0/abuse/entity/{entity_type}/entity-id/{entity_id}"?.substring(1)
            
                    _relativeUrls["getAttributes"] = "/service/application/feedback/v1.0/attributes/"?.substring(1)
            
                    _relativeUrls["createAttribute"] = "/service/application/feedback/v1.0/attributes/"?.substring(1)
            
                    _relativeUrls["getAttribute"] = "/service/application/feedback/v1.0/attributes/{slug}"?.substring(1)
            
                    _relativeUrls["updateAttribute"] = "/service/application/feedback/v1.0/attributes/{slug}"?.substring(1)
            
                    _relativeUrls["createComment"] = "/service/application/feedback/v1.0/comment/"?.substring(1)
            
                    _relativeUrls["updateComment"] = "/service/application/feedback/v1.0/comment/"?.substring(1)
            
                    _relativeUrls["getComments"] = "/service/application/feedback/v1.0/comment/entity/{entity_type}"?.substring(1)
            
                    _relativeUrls["checkEligibility"] = "/service/application/feedback/v1.0/config/entity/{entity_type}/entity-id/{entity_id}"?.substring(1)
            
                    _relativeUrls["deleteMedia"] = "/service/application/feedback/v1.0/media/"?.substring(1)
            
                    _relativeUrls["createMedia"] = "/service/application/feedback/v1.0/media/"?.substring(1)
            
                    _relativeUrls["updateMedia"] = "/service/application/feedback/v1.0/media/"?.substring(1)
            
                    _relativeUrls["getMedias"] = "/service/application/feedback/v1.0/media/entity/{entity_type}/entity-id/{entity_id}"?.substring(1)
            
                    _relativeUrls["getReviewSummaries"] = "/service/application/feedback/v1.0/rating/summary/entity/{entity_type}/entity-id/{entity_id}"?.substring(1)
            
                    _relativeUrls["createReview"] = "/service/application/feedback/v1.0/review/"?.substring(1)
            
                    _relativeUrls["updateReview"] = "/service/application/feedback/v1.0/review/"?.substring(1)
            
                    _relativeUrls["getReviews"] = "/service/application/feedback/v1.0/review/entity/{entity_type}/entity-id/{entity_id}"?.substring(1)
            
                    _relativeUrls["getTemplates"] = "/service/application/feedback/v1.0/template/"?.substring(1)
            
                    _relativeUrls["createQuestion"] = "/service/application/feedback/v1.0/template/qna/"?.substring(1)
            
                    _relativeUrls["updateQuestion"] = "/service/application/feedback/v1.0/template/qna/"?.substring(1)
            
                    _relativeUrls["getQuestionAndAnswers"] = "/service/application/feedback/v1.0/template/qna/entity/{entity_type}/entity-id/{entity_id}"?.substring(1)
            
                    _relativeUrls["getVotes"] = "/service/application/feedback/v1.0/vote/"?.substring(1)
            
                    _relativeUrls["createVote"] = "/service/application/feedback/v1.0/vote/"?.substring(1)
            
                    _relativeUrls["updateVote"] = "/service/application/feedback/v1.0/vote/"?.substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
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
        var fullUrl : String? = _relativeUrls["createAbuseReport"] 
        
        return feedbackApiList?.createAbuseReport(fullUrl  ,body = body)}

    
    
    fun updateAbuseReport(body: UpdateAbuseStatusRequest): Deferred<Response<UpdateResponse>>? {
        var fullUrl : String? = _relativeUrls["updateAbuseReport"] 
        
        return feedbackApiList?.updateAbuseReport(fullUrl  ,body = body)}

    
    
    fun getAbuseReports(entityId: String, entityType: String, id: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<ReportAbuseGetResponse>>? {
        var fullUrl : String? = _relativeUrls["getAbuseReports"] 
        
        fullUrl = fullUrl?.replace("{" + "entity_id" +"}",entityId.toString())
        
        fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
        
        return feedbackApiList?.getAbuseReports(fullUrl      ,  id = id,    pageId = pageId,    pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getAbuseReports"] 
                
                fullUrl = fullUrl?.replace("{" + "entity_id" +"}",entityId.toString())
                
                fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
                
                feedbackApiList?.getAbuseReports(fullUrl , id = id, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
        var fullUrl : String? = _relativeUrls["getAttributes"] 
        
        return feedbackApiList?.getAttributes(fullUrl    ,  pageNo = pageNo,    pageSize = pageSize)}

    
    
    
        
            
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getAttributes"] 
                
                feedbackApiList?.getAttributes(fullUrl , pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
        var fullUrl : String? = _relativeUrls["createAttribute"] 
        
        return feedbackApiList?.createAttribute(fullUrl  ,body = body)}

    
    
    fun getAttribute(slug: String): Deferred<Response<Attribute>>? {
        var fullUrl : String? = _relativeUrls["getAttribute"] 
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return feedbackApiList?.getAttribute(fullUrl   )}

    
    
    fun updateAttribute(slug: String, body: UpdateAttributeRequest): Deferred<Response<UpdateResponse>>? {
        var fullUrl : String? = _relativeUrls["updateAttribute"] 
        
        fullUrl = fullUrl?.replace("{" + "slug" +"}",slug.toString())
        
        return feedbackApiList?.updateAttribute(fullUrl   ,body = body)}

    
    
    fun createComment(body: CommentRequest): Deferred<Response<InsertResponse>>? {
        var fullUrl : String? = _relativeUrls["createComment"] 
        
        return feedbackApiList?.createComment(fullUrl  ,body = body)}

    
    
    fun updateComment(body: UpdateCommentRequest): Deferred<Response<UpdateResponse>>? {
        var fullUrl : String? = _relativeUrls["updateComment"] 
        
        return feedbackApiList?.updateComment(fullUrl  ,body = body)}

    
    
    fun getComments(entityType: String, id: String?=null, entityId: String?=null, userId: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<CommentGetResponse>>? {
        var fullUrl : String? = _relativeUrls["getComments"] 
        
        fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
        
        return feedbackApiList?.getComments(fullUrl     ,  id = id,    entityId = entityId,    userId = userId,    pageId = pageId,    pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getComments"] 
                
                fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
                
                feedbackApiList?.getComments(fullUrl , id = id, entityId = entityId, userId = userId, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
        var fullUrl : String? = _relativeUrls["checkEligibility"] 
        
        fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
        
        fullUrl = fullUrl?.replace("{" + "entity_id" +"}",entityId.toString())
        
        return feedbackApiList?.checkEligibility(fullUrl    )}

    
    
    fun deleteMedia(ids: ArrayList<String>): Deferred<Response<UpdateResponse>>? {
        var fullUrl : String? = _relativeUrls["deleteMedia"] 
        
        return feedbackApiList?.deleteMedia(fullUrl    ,  ids = ids)}

    
    
    fun createMedia(body: AddMediaListRequest): Deferred<Response<InsertResponse>>? {
        var fullUrl : String? = _relativeUrls["createMedia"] 
        
        return feedbackApiList?.createMedia(fullUrl  ,body = body)}

    
    
    fun updateMedia(body: UpdateMediaListRequest): Deferred<Response<UpdateResponse>>? {
        var fullUrl : String? = _relativeUrls["updateMedia"] 
        
        return feedbackApiList?.updateMedia(fullUrl  ,body = body)}

    
    
    fun getMedias(entityType: String, entityId: String, id: String?=null, type: String?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<MediaGetResponse>>? {
        var fullUrl : String? = _relativeUrls["getMedias"] 
        
        fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
        
        fullUrl = fullUrl?.replace("{" + "entity_id" +"}",entityId.toString())
        
        return feedbackApiList?.getMedias(fullUrl      ,  id = id,    type = type,    pageId = pageId,    pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getMedias"] 
                
                fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
                
                fullUrl = fullUrl?.replace("{" + "entity_id" +"}",entityId.toString())
                
                feedbackApiList?.getMedias(fullUrl , id = id, type = type, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
        var fullUrl : String? = _relativeUrls["getReviewSummaries"] 
        
        fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
        
        fullUrl = fullUrl?.replace("{" + "entity_id" +"}",entityId.toString())
        
        return feedbackApiList?.getReviewSummaries(fullUrl      ,  id = id,    pageId = pageId,    pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getReviewSummaries"] 
                
                fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
                
                fullUrl = fullUrl?.replace("{" + "entity_id" +"}",entityId.toString())
                
                feedbackApiList?.getReviewSummaries(fullUrl , id = id, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
        var fullUrl : String? = _relativeUrls["createReview"] 
        
        return feedbackApiList?.createReview(fullUrl  ,body = body)}

    
    
    fun updateReview(body: UpdateReviewRequest): Deferred<Response<UpdateResponse>>? {
        var fullUrl : String? = _relativeUrls["updateReview"] 
        
        return feedbackApiList?.updateReview(fullUrl  ,body = body)}

    
    
    fun getReviews(entityType: String, entityId: String, id: String?=null, userId: String?=null, media: String?=null, rating: ArrayList<Double>?=null, attributeRating: ArrayList<String>?=null, facets: Boolean?=null, sort: String?=null, active: Boolean?=null, approve: Boolean?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<ReviewGetResponse>>? {
        var fullUrl : String? = _relativeUrls["getReviews"] 
        
        fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
        
        fullUrl = fullUrl?.replace("{" + "entity_id" +"}",entityId.toString())
        
        return feedbackApiList?.getReviews(fullUrl      ,  id = id,    userId = userId,    media = media,    rating = rating,    attributeRating = attributeRating,    facets = facets,    sort = sort,    active = active,    approve = approve,    pageId = pageId,    pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getReviews"] 
                
                fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
                
                fullUrl = fullUrl?.replace("{" + "entity_id" +"}",entityId.toString())
                
                feedbackApiList?.getReviews(fullUrl , id = id, userId = userId, media = media, rating = rating, attributeRating = attributeRating, facets = facets, sort = sort, active = active, approve = approve, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
        var fullUrl : String? = _relativeUrls["getTemplates"] 
        
        return feedbackApiList?.getTemplates(fullUrl    ,  templateId = templateId,    entityId = entityId,    entityType = entityType)}

    
    
    fun createQuestion(body: CreateQNARequest): Deferred<Response<InsertResponse>>? {
        var fullUrl : String? = _relativeUrls["createQuestion"] 
        
        return feedbackApiList?.createQuestion(fullUrl  ,body = body)}

    
    
    fun updateQuestion(body: UpdateQNARequest): Deferred<Response<UpdateResponse>>? {
        var fullUrl : String? = _relativeUrls["updateQuestion"] 
        
        return feedbackApiList?.updateQuestion(fullUrl  ,body = body)}

    
    
    fun getQuestionAndAnswers(entityType: String, entityId: String, id: String?=null, userId: String?=null, showAnswer: Boolean?=null, pageId: String?=null, pageSize: Int?=null): Deferred<Response<QNAGetResponse>>? {
        var fullUrl : String? = _relativeUrls["getQuestionAndAnswers"] 
        
        fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
        
        fullUrl = fullUrl?.replace("{" + "entity_id" +"}",entityId.toString())
        
        return feedbackApiList?.getQuestionAndAnswers(fullUrl      ,  id = id,    userId = userId,    showAnswer = showAnswer,    pageId = pageId,    pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
                
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getQuestionAndAnswers"] 
                
                fullUrl = fullUrl?.replace("{" + "entity_type" +"}",entityType.toString())
                
                fullUrl = fullUrl?.replace("{" + "entity_id" +"}",entityId.toString())
                
                feedbackApiList?.getQuestionAndAnswers(fullUrl , id = id, userId = userId, showAnswer = showAnswer, pageId = pageId, pageSize = pageSize)?.safeAwait{ response, error ->
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
        var fullUrl : String? = _relativeUrls["getVotes"] 
        
        return feedbackApiList?.getVotes(fullUrl    ,  id = id,    refType = refType,    pageNo = pageNo,    pageSize = pageSize)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
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
                var fullUrl : String? = _relativeUrls["getVotes"] 
                
                feedbackApiList?.getVotes(fullUrl , id = id, refType = refType, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
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
        var fullUrl : String? = _relativeUrls["createVote"] 
        
        return feedbackApiList?.createVote(fullUrl  ,body = body)}

    
    
    fun updateVote(body: UpdateVoteRequest): Deferred<Response<UpdateResponse>>? {
        var fullUrl : String? = _relativeUrls["updateVote"] 
        
        return feedbackApiList?.updateVote(fullUrl  ,body = body)}

    
    
}
