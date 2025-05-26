package com.sdk.universal.content

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.universal.*

interface ContentApiList {
    
    
    @GET
    suspend fun getCredentialsByEntity(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<CredentialsSchema>
    
}
