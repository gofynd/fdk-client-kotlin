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
    : Response<PincodeApiResponseSchema>
    
    
    @GET
    suspend fun getAllCountries(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<CountryListResponseSchema>
    
    
    @GET
    suspend fun getZones(@Url url1: String?      ,              @Query("stage") stage: String?, @Query("type") type: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("is_active") isActive: Boolean?, @Query("q") q: String?, @Query("country_iso_code") countryIsoCode: String?, @Query("pincode") pincode: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("sector") sector: String?, @Query("store_uid") storeUid: Int?, @Query("region_uid") regionUid: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ListViewResponseSchemaV2>
    
    
    @GET
    suspend fun getGeoAreas(@Url url1: String?      ,           @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("type") type: String?, @Query("is_active") isActive: Boolean?, @Query("q") q: String?, @Query("country_iso_code") countryIsoCode: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("pincode") pincode: String?, @Query("sector") sector: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GeoAreaGetResponseBody>
    
    
    @GET
    suspend fun getCountries(@Url url1: String?    ,      @Query("onboard") onboard: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("hierarchy") hierarchy: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCountries>
    
    
    @GET
    suspend fun getCountry(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCountry>
    
    
    @GET
    suspend fun getLocalitiesByPrefix(@Url url1: String?    ,    @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetLocalities>
    
    
    @GET
    suspend fun getLocalities(@Url url1: String?     ,        @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("name") name: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetLocalities>
    
    
    @GET
    suspend fun getLocality(@Url url1: String?      ,    @Query("country") country: String?, @Query("state") state: String?, @Query("city") city: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetLocality>
    
    
    @POST
    suspend fun validateAddress(@Url url1: String?     ,@Body body: ValidateAddressRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<ValidateAddressRequestSchema>
    
    
    @POST
    suspend fun createShipments(@Url url1: String?     ,@Body body: GenerateShipmentsRequestSchema, @HeaderMap headers: Map<String, String>? = null)
    : Response<GenerateShipmentsAndCourierPartnerResponseSchema>
    
    
    @GET
    suspend fun getDeliveryPromise(@Url url1: String?    ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPromiseDetails>
    
}
