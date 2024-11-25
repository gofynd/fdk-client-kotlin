package com.sdk.application.logistic

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface LogisticApiList {
    
    
    @GET
    suspend fun getPincodeCity(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<PincodeDetails>
    
    
    @POST
    suspend fun getTatProduct(@Url url1: String?   ,@Body body: TATViewDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<TATViewResult>
    
    
    @GET
    suspend fun getAllCountries(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<CountryListResult>
    
    
    @POST
    suspend fun getPincodeZones(@Url url1: String?   ,@Body body: GetZoneFromPincodeViewDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetZoneFromPincodeViewResult>
    
    
    @POST
    suspend fun getOptimalLocations(@Url url1: String?   ,@Body body: ReAssignStoreDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<ReAssignStoreResult>
    
    
    @POST
    suspend fun getCourierPartners(@Url url1: String?     ,@Body body: ShipmentCourierPartnerDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<ShipmentCourierPartnerResult>
    
    
    @GET
    suspend fun getLocations(@Url url1: String?    ,          @Query("x-application-id") xApplicationId: String, @Query("x-application-data") xApplicationData: String, @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("pincode") pincode: Int?, @Query("sector") sector: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetStoreResult>
    
    
    @GET
    suspend fun getCountries(@Url url1: String?    ,      @Query("onboarding") onboarding: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("hierarchy") hierarchy: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCountries>
    
    
    @GET
    suspend fun getCountry(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCountry>
    
    
    @GET
    suspend fun getDeliveryPromise(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPromiseDetails>
    
    
    @GET
    suspend fun getLocalities(@Url url1: String?     ,        @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("sector") sector: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetLocalities>
    
    
    @GET
    suspend fun getLocality(@Url url1: String?      ,    @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetLocality>
    
    
    @POST
    suspend fun validateAddress(@Url url1: String?     ,@Body body: ValidateAddressDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateAddressDetails>
    
}
