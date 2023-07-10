package com.sdk.application.apis.logistic

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.logistic.*

interface LogisticApiList {
    
    
    @GET 
    fun getPincodeCity(@Url url1: String?    )
    : Deferred<Response<PincodeApiResponse>>
    
    
    @POST 
    fun getTatProduct(@Url url1: String?   ,@Body body: TATViewRequest)
    : Deferred<Response<TATViewResponse>>
    
    
    @GET 
    fun getAllCountries(@Url url1: String?   )
    : Deferred<Response<CountryListResponse>>
    
    
    @POST 
    fun getPincodeZones(@Url url1: String?   ,@Body body: GetZoneFromPincodeViewRequest)
    : Deferred<Response<GetZoneFromPincodeViewResponse>>
    
    
    @POST 
    fun getOptimalLocations(@Url url1: String?   ,@Body body: ReAssignStoreRequest)
    : Deferred<Response<ReAssignStoreResponse>>
    
}