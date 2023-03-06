package com.sdk.platform.apis.feedback

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.feedback.*

interface FeedbackApiList {
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/attributes/")
    fun getAttributes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<FeedbackAttributes>>
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/reviews/")
    fun getCustomerReviews(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("entity_id") entityId: String?, @Query("entity_type") entityType: String?, @Query("user_id") userId: String?, @Query("media") media: String?, @Query("rating") rating: ArrayList<Double>?, @Query("attribute_rating") attributeRating: ArrayList<String>?, @Query("facets") facets: Boolean?, @Query("sort") sort: String?, @Query("next") next: String?, @Query("start") start: String?, @Query("limit") limit: String?, @Query("count") count: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetReviewResponse>>
    
    @PUT ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/reviews/{review_id}/approve/")
    fun updateApprove(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("review_id") reviewId: String,@Body body: ApproveRequest)
    : Deferred<Response<UpdateResponse>>
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/reviews/{review_id}/history/")
    fun getHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("review_id") reviewId: String)
    : Deferred<Response<ArrayList<ActivityDump>>>
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/")
    fun getApplicationTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<TemplateGetResponse>>
    
    @POST ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/")
    fun createTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: TemplateRequestList)
    : Deferred<Response<InsertResponse>>
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/{id}/")
    fun getTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<Template>>
    
    @PUT ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/{id}/")
    fun updateTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateTemplateRequest)
    : Deferred<Response<UpdateResponse>>
    
    @PATCH ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/{id}/status/")
    fun updateTemplateStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateTemplateStatusRequest)
    : Deferred<Response<UpdateResponse>>
    
}