package com.sdk.platform.share

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface ShareApiList {
    
    @POST ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/")
    suspend fun createShortLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ShortLinkReq)
    : Response<ShortLinkRes>
    
    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/")
    suspend fun getShortLinks(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("created_by") createdBy: String?, @Query("active") active: String?, @Query("q") q: String?)
    : Response<ShortLinkList>
    
    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/{hash}/")
    suspend fun getShortLinkByHash(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("hash") hash: String)
    : Response<ShortLinkRes>
    
    @PATCH ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/{id}/")
    suspend fun updateShortLinkById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: ShortLinkReq)
    : Response<ShortLinkRes>
    
    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/click-stats")
    suspend fun getShortLinkClickStats(@Query("surl_id") surlId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Response<ClickStatsResponse>
    
}