package com.sdk.universal.partner

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.universal.*

interface PartnerApiList {
    
    
    @GET
    suspend fun getPanelExtensionDetails(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<ExtensionUsingSlug>
    
}
