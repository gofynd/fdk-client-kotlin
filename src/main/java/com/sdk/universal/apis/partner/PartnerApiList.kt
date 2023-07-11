package com.sdk.universal.apis.partner

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.universal.*
import com.sdk.universal.models.partner.*

interface PartnerApiList {
    
    
    @GET 
    suspend fun getPanelExtensionDetails(@Url url1: String?    )
    : Response<ExtensionUsingSlug>
    
    
    @GET 
    suspend fun getOrganizationList(@Url url1: String?   )
    : Response<OrganizationList>
    
}
