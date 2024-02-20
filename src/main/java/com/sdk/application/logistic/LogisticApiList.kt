package com.sdk.application.logistic

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface LogisticApiList {
    
    
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
    suspend fun getLocations(@Url url1: String?    ,          @Query("x-application-id") xApplicationId: String, @Query("x-application-data") xApplicationData: String, @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("pincode") pincode: Int?, @Query("sector") sector: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<GetStoreResponse>
    
    
    @GET 
    suspend fun getCountries(@Url url1: String?    ,     @Query("onboarding") onboarding: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Response<GetCountries>
    
    
    @GET 
    suspend fun getCountry(@Url url1: String?    )
    : Response<GetCountry>
    
    
    @GET 
    suspend fun getLocalities(@Url url1: String?     ,       @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Response<GetLocalities>
    
    
    @GET 
    suspend fun getLocality(@Url url1: String?      ,    @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?)
    : Response<GetLocality>
    
    
    @POST 
    suspend fun validateAddress(@Url url1: String?     ,@Body body: ValidateAddressRequest)
    : Response<ValidateAddressRequest>
    
}