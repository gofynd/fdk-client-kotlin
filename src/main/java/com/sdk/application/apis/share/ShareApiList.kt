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
    fun getApplicationQRCode(@Url url1: String?   )
    : Deferred<Response<QRCodeResp>>
    
    
    @POST 
    fun getProductQRCodeBySlug(@Url url1: String?    )
    : Deferred<Response<QRCodeResp>>
    
    
    @POST 
    fun getCollectionQRCodeBySlug(@Url url1: String?    )
    : Deferred<Response<QRCodeResp>>
    
    
    @POST 
    fun getUrlQRCode(@Url url1: String?    ,  @Query("url") url: String)
    : Deferred<Response<QRCodeResp>>
    
    
    @POST 
    fun createShortLink(@Url url1: String?   ,@Body body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>
    
    
    @GET 
    fun getShortLinkByHash(@Url url1: String?    )
    : Deferred<Response<ShortLinkRes>>
    
    
    @GET 
    fun getOriginalShortLinkByHash(@Url url1: String?    )
    : Deferred<Response<ShortLinkRes>>
    
}