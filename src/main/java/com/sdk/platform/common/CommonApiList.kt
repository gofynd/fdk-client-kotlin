package com.sdk.platform.common

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface CommonApiList {
    
    @GET ("/service/common/configuration/v1.0/application/search-application")
    suspend fun searchApplication(@Header("authorization") authorization: String?, @Query("query") query: String?)
    : Response<ApplicationResponse>
    
    @GET ("/service/common/configuration/v1.0/location")
    suspend fun getLocations(@Query("location_type") locationType: String?, @Query("id") id: String?)
    : Response<Locations>
    
}