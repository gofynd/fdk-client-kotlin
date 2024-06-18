package com.sdk.platform.companyprofile

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface CompanyProfileApiList {
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}")
    suspend fun cbsOnboardGet(@Path("company_id") companyId: String)
    : Response<GetCompanyProfileSerializerResponse>
    
    @PATCH ("/service/platform/company-profile/v1.0/company/{company_id}")
    suspend fun updateCompany(@Path("company_id") companyId: String,@Body body: UpdateCompany)
    : Response<ProfileSuccessResponse>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/metrics")
    suspend fun getCompanyMetrics(@Path("company_id") companyId: String)
    : Response<MetricsSerializer>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    suspend fun getBrand(@Path("company_id") companyId: String, @Path("brand_id") brandId: String)
    : Response<GetBrandResponseSerializer>
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    suspend fun editBrand(@Path("company_id") companyId: String, @Path("brand_id") brandId: String,@Body body: UpdateBrandRequestSerializer)
    : Response<ProfileSuccessResponse>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/brand/")
    suspend fun createBrand(@Path("company_id") companyId: String,@Body body: CreateBrandRequestSerializer)
    : Response<ProfileSuccessResponse>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    suspend fun getBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Response<CompanyBrandListSerializer>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    suspend fun createCompanyBrandMapping(@Path("company_id") companyId: String,@Body body: CompanyBrandPostRequestSerializer)
    : Response<ProfileSuccessResponse>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    suspend fun getLocations(@Path("company_id") companyId: String, @Query("store_type") storeType: String?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("location_ids") locationIds: ArrayList<Int>?, @Query("types") types: ArrayList<String>?, @Query("tags") tags: ArrayList<String>?)
    : Response<LocationListSerializer>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    suspend fun createLocation(@Path("company_id") companyId: String,@Body body: LocationSerializer)
    : Response<ProfileSuccessResponse>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    suspend fun getLocationDetail(@Path("company_id") companyId: String, @Path("location_id") locationId: String)
    : Response<GetLocationSerializer>
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    suspend fun updateLocation(@Path("company_id") companyId: String, @Path("location_id") locationId: String,@Body body: LocationSerializer)
    : Response<ProfileSuccessResponse>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location/bulk")
    suspend fun createLocationBulk(@Path("company_id") companyId: String,@Body body: BulkLocationSerializer)
    : Response<ProfileSuccessResponse>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location/tags")
    suspend fun getLocationTags(@Path("company_id") companyId: String)
    : Response<StoreTagsResponseSchema>
    
}