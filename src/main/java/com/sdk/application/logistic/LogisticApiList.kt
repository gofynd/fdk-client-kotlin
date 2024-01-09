package com.sdk.application.logistic

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface LogisticApiList {
    
    
    @GET 
    suspend fun getPincodeCity(@Url url1: String?    )
    : Response<PincodeApiResponse>
    
    
    @POST 
    suspend fun getTatProduct(@Url url1: String?   ,@Body body: TATViewRequest)
    : Response<TATViewResponse>
    
    
    @GET 
    suspend fun getAllCountries(@Url url1: String?   )
    : Response<CountryListResponse>
    
    
    @POST 
    suspend fun getPincodeZones(@Url url1: String?   ,@Body body: GetZoneFromPincodeViewRequest)
    : Response<GetZoneFromPincodeViewResponse>
    
    
    @POST 
    suspend fun getOptimalLocations(@Url url1: String?   ,@Body body: ReAssignStoreRequest)
    : Response<ReAssignStoreResponse>
    
}