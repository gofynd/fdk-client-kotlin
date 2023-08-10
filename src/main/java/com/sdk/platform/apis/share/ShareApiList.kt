package com.sdk.platform.apis.share

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.share.*

interface ShareApiList {
    
    @POST ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/")
    fun createShortLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>
    
    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/")
    fun getShortLinks(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("created_by") createdBy: String?, @Query("active") active: String?, @Query("q") q: String?)
    : Deferred<Response<ShortLinkList>>
    
    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/{hash}/")
    fun getShortLinkByHash(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>>
    
    @PATCH ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/{id}/")
    fun updateShortLinkById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>
    
    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/click-stats")
    fun getShortLinkClickStats(@Query("surl_id") surlId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ClickStatsResponse>>
    
}