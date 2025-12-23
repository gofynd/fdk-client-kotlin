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
    suspend fun getAllCountries(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<CountryResult>
    
    
    @GET
    suspend fun getCountries(@Url url1: String?    ,       @Query("onboarding") onboarding: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("hierarchy") hierarchy: String?, @Query("phone_code") phoneCode: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCountries>
    
    
    @GET
    suspend fun getCountry(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCountry>
    
    
    @GET
    suspend fun getDeliveryPromise(@Url url1: String?    ,  @Header("x-location-detail") xLocationDetail: String,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPromiseDetails>
    
    
    @GET
    suspend fun getLocalities(@Url url1: String?     ,        @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("sector") sector: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetLocalitiesApp>
    
    
    @GET
    suspend fun getLocality(@Url url1: String?      ,     @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("sector") sector: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetLocalityApp>
    
    
    @POST
    suspend fun validateAddress(@Url url1: String?     ,@Body body: ValidateAddressDetails, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateAddressDetails>
    
    
    @GET
    suspend fun getFulfillmentOptions(@Url url1: String?    ,  @Header("x-application-data") xApplicationData: String,   @Query("product_slug") productSlug: String?, @Query("store_id") storeId: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FulfillmentOptionsList>
    
    
    @GET
    suspend fun getFulfillmentOptionStores(@Url url1: String?     ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FulfillmentOptionStores>
    
}
