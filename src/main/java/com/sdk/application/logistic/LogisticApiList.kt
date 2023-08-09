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
    
    
    @GET 
    suspend fun getCountries(@Url url1: String?    ,  @Query("onboarding") onboarding: Boolean?)
    : Response<GetCountries>
    
    
    @GET 
    suspend fun getCountry(@Url url1: String?    )
    : Response<GetCountry>
    
    
    @GET 
    suspend fun getLocalities(@Url url1: String?     ,    @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?)
    : Response<GetLocalities>
    
    
    @GET 
    suspend fun getLocality(@Url url1: String?      ,    @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?)
    : Response<GetLocality>
    
}