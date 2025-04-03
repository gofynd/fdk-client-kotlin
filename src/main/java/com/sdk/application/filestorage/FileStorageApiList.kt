package com.sdk.application.filestorage

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface FileStorageApiList {
    
    
    @POST
    suspend fun startUpload(@Url url1: String?    ,@Body body: StartRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<StartResponse>
    
    
    @POST
    suspend fun completeUpload(@Url url1: String?    ,@Body body: StartResponse, @HeaderMap headers: Map<String, String>? = null)
    : Response<CompleteResponse>
    
    
    @POST
    suspend fun signUrls(@Url url1: String?   ,@Body body: SignUrlRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<SignUrlResponse>
    
}
