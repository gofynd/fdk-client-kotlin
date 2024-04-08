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
    
    
    @GET 
    suspend fun getZones(@Url url1: String?      ,          @Query("stage") stage: String?, @Query("page_size") pageSize: Int?, @Query("is_active") isActive: Boolean?, @Query("q") q: String?, @Query("country_iso_code") countryIsoCode: String?, @Query("pincode") pincode: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("sector") sector: String?)
    : Response<ListViewResponseV2>
    
    
    @GET 
    suspend fun getGeoAreas(@Url url1: String?      ,         @Query("page_size") pageSize: Int?, @Query("is_active") isActive: Boolean?, @Query("q") q: String?, @Query("country_iso_code") countryIsoCode: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("pincode") pincode: String?, @Query("sector") sector: String?)
    : Response<GeoAreaGetResponseBody>
    
    
    @GET 
    suspend fun getCountries(@Url url1: String?    ,      @Query("onboard") onboard: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("hierarchy") hierarchy: String?)
    : Response<GetCountries>
    
    
    @GET 
    suspend fun getCountry(@Url url1: String?    )
    : Response<GetCountry>
    
    
    @GET 
    suspend fun getLocalities(@Url url1: String?     ,        @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("name") name: String?)
    : Response<GetLocalities>
    
    
    @GET 
    suspend fun getLocality(@Url url1: String?      ,    @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?)
    : Response<GetLocality>
    
    
    @POST 
    suspend fun validateAddress(@Url url1: String?     ,@Body body: ValidateAddressRequest)
    : Response<ValidateAddressRequest>
    
    
    @POST 
    suspend fun createShipments(@Url url1: String?     ,@Body body: GenerateShipmentsRequest)
    : Response<GenerateShipmentsAndCourierPartnerResponse>
    
}