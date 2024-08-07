package com.sdk.application.share

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface ShareApiList {
    
    
    @POST
    suspend fun getApplicationQRCode(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<QRCodeResp>
    
    
    @POST
    suspend fun getProductQRCodeBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<QRCodeResp>
    
    
    @POST
    suspend fun getCollectionQRCodeBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<QRCodeResp>
    
    
    @POST
    suspend fun getUrlQRCode(@Url url1: String?    ,  @Query("url") url: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<QRCodeResp>
    
    
    @POST
    suspend fun createShortLink(@Url url1: String?   ,@Body body: ShortLinkReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShortLinkRes>
    
    
    @GET
    suspend fun getShortLinkByHash(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<ShortLinkRes>
    
    
    @GET
    suspend fun getOriginalShortLinkByHash(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<ShortLinkRes>
    
}
