package com.sdk.platform.apis.common

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.common.*

interface CommonApiList {
    
    @GET ("/service/common/configuration/v1.0/application/search-application")
    fun searchApplication(@Header("authorization") authorization: String?, @Query("query") query: String?)
    : Deferred<Response<ApplicationResponse>>
    
    @GET ("/service/common/configuration/v1.0/location")
    fun getLocations(@Query("location_type") locationType: String?, @Query("id") id: String?)
    : Deferred<Response<Locations>>
    
}