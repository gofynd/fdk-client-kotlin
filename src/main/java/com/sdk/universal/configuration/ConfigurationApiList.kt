package com.sdk.universal.configuration

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.universal.*

interface ConfigurationApiList {
    
    
    @GET
    suspend fun searchApplication(@Url url1: String?    ,  @Header("authorization") authorization: String?,  @Query("query") query: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationResponse>
    
    
    @GET
    suspend fun getLocations(@Url url1: String?    ,   @Query("location_type") locationType: String?, @Query("id") id: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<Locations>
    
    
    @POST
    suspend fun checkVersionIsUpToDate(@Url url1: String?   ,@Body body: VersionRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<VersionResponse>
    
}
