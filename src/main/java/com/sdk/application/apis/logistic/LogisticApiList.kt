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
    fun getPincodeCity(@Url url1: String?     ,  @Query("country_code") countryCode: String?)
    : Deferred<Response<PincodeApiResponse>>
    
    
    @POST 
    fun getTatProduct(@Url url1: String?   ,@Body body: TATViewRequest)
    : Deferred<Response<TATViewResponse>>
    
    
    @POST 
    fun getEntityList(@Url url1: String?    ,   @Query("page") page: String?, @Query("limit") limit: String?, @Body body: EntityListRequest)
    : Deferred<Response<EntityListResponse>>
    
    
    @POST 
    fun getPincodeZones(@Url url1: String?   ,@Body body: GetZoneFromPincodeViewRequest)
    : Deferred<Response<GetZoneFromPincodeViewResponse>>
    
    
    @POST 
    fun assignLocations(@Url url1: String?   ,@Body body: AssignStoreRequest)
    : Deferred<Response<AssignStoreResponse>>
    
}