package com.sdk.application.apis.share

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.share.*

interface ShareApiList {
    
    
    @POST 
    suspend fun getApplicationQRCode(@Url url1: String?   )
    : Response<QRCodeResp>
    
    
    @POST 
    suspend fun getProductQRCodeBySlug(@Url url1: String?    )
    : Response<QRCodeResp>
    
    
    @POST 
    suspend fun getCollectionQRCodeBySlug(@Url url1: String?    )
    : Response<QRCodeResp>
    
    
    @POST 
    suspend fun getUrlQRCode(@Url url1: String?    ,  @Query("url") url: String)
    : Response<QRCodeResp>
    
    
    @POST 
    suspend fun createShortLink(@Url url1: String?   ,@Body body: ShortLinkReq)
    : Response<ShortLinkRes>
    
    
    @GET 
    suspend fun getShortLinkByHash(@Url url1: String?    )
    : Response<ShortLinkRes>
    
    
    @GET 
    suspend fun getOriginalShortLinkByHash(@Url url1: String?    )
    : Response<ShortLinkRes>
    
}