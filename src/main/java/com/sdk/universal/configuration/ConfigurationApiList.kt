package com.sdk.universal.configuration

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.universal.*

interface ConfigurationApiList {
    
    
    @GET 
    suspend fun searchApplication(@Url url1: String?    ,  @Header("authorization") authorization: String?,  @Query("query") query: String?)
    : Response<ApplicationResponse>
    
    
    @GET 
    suspend fun getLocations(@Url url1: String?    ,   @Query("location_type") locationType: String?, @Query("id") id: String?)
    : Response<Locations>
    
}
