package com.sdk.application.apis.common

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.common.*

interface CommonApiList {
    
    
    @GET 
    fun searchApplication(@Url url1: String?    ,  @Header("authorization") authorization: String?,  @Query("query") query: String?)
    : Deferred<Response<ApplicationResponse>>
    
    
    @GET 
    fun getLocations(@Url url1: String?    ,   @Query("location_type") locationType: String?, @Query("id") id: String?)
    : Deferred<Response<Locations>>
    
}