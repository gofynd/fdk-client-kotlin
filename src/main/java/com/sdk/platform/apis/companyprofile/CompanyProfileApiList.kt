package com.sdk.platform.apis.companyprofile

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.companyprofile.*

interface CompanyProfileApiList {
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}")
    fun cbsOnboardGet(@Path("company_id") companyId: String)
    : Deferred<Response<GetCompanyProfileSerializerResponse>>
    
    @PATCH ("/service/platform/company-profile/v1.0/company/{company_id}")
    fun updateCompany(@Path("company_id") companyId: String,@Body body: UpdateCompany)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/metrics")
    fun getCompanyMetrics(@Path("company_id") companyId: String)
    : Deferred<Response<MetricsSerializer>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    fun getBrand(@Path("company_id") companyId: String, @Path("brand_id") brandId: String)
    : Deferred<Response<GetBrandResponseSerializer>>
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    fun editBrand(@Path("company_id") companyId: String, @Path("brand_id") brandId: String,@Body body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/brand/")
    fun createBrand(@Path("company_id") companyId: String,@Body body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    fun getBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<CompanyBrandListSerializer>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    fun createCompanyBrandMapping(@Path("company_id") companyId: String,@Body body: CompanyBrandPostRequestSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    fun getLocations(@Path("company_id") companyId: String, @Query("store_type") storeType: String?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("location_ids") locationIds: ArrayList<Int>?)
    : Deferred<Response<LocationListSerializer>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    fun createLocation(@Path("company_id") companyId: String,@Body body: LocationSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    fun getLocationDetail(@Path("company_id") companyId: String, @Path("location_id") locationId: String)
    : Deferred<Response<GetLocationSerializer>>
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    fun updateLocation(@Path("company_id") companyId: String, @Path("location_id") locationId: String,@Body body: LocationSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location/bulk")
    fun createLocationBulk(@Path("company_id") companyId: String,@Body body: BulkLocationSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
}