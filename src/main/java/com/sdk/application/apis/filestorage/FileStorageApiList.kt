package com.sdk.application.apis.filestorage

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.filestorage.*

interface FileStorageApiList {
    
    
    @POST 
    suspend fun startUpload(@Url url1: String?    ,@Body body: StartRequest)
    : Response<StartResponse>
    
    
    @POST 
    suspend fun completeUpload(@Url url1: String?    ,@Body body: StartResponse)
    : Response<CompleteResponse>
    
    
    @POST 
    suspend fun signUrls(@Url url1: String?   ,@Body body: SignUrlRequest)
    : Response<SignUrlResponse>
    
}