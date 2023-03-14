package com.sdk.platform.apis.serviceability

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.serviceability.*

interface ServiceabilityApiList {
    
    @POST ("/service/platform/logistics-internal/v1.0/company/{company_id}/application/{application_id}/serviceability")
    fun postApplicationServiceability(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationServiceabilityConfig)
    : Deferred<Response<ApplicationServiceabilityConfigResponse>>
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/application/{application_id}/serviceability")
    fun getApplicationServiceability(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationServiceabilityConfigResponse>>
    
    @POST ("/service/platform/logistics-internal/v1.0/company/{company_id}/regions")
    fun getEntityRegionView(@Path("company_id") companyId: String,@Body body: EntityRegionViewRequest)
    : Deferred<Response<EntityRegionViewResponse>>
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/zones")
    fun getListView(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("is_active") isActive: Boolean?, @Query("channel_ids") channelIds: String?, @Query("q") q: String?, @Query("zone_id") zoneId: ArrayList<String>?)
    : Deferred<Response<ListViewResponse>>
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/all-stores")
    fun getCompanyStoreView(@Path("company_id") companyId: String)
    : Deferred<Response<CompanyStoreView_Response>>
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/zone/{zone_id}")
    fun getZoneDataView(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String)
    : Deferred<Response<GetSingleZoneDataViewResponse>>
    
    @PUT ("/service/platform/logistics-internal/v1.0/company/{company_id}/zone/{zone_id}")
    fun updateZoneControllerView(@Path("zone_id") zoneId: String, @Path("company_id") companyId: String,@Body body: ZoneUpdateRequest)
    : Deferred<Response<ZoneSuccessResponse>>
    
    @POST ("/service/platform/logistics-internal/v1.0/company/{company_id}/zone")
    fun upsertZoneControllerView(@Path("company_id") companyId: String,@Body body: ZoneRequest)
    : Deferred<Response<ZoneResponse>>
    
    @POST ("/service/platform/logistics-internal/v1.0/company/{company_id}/application/{application_id}/zones")
    fun getZoneFromPincodeView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetZoneFromPincodeViewRequest)
    : Deferred<Response<GetZoneFromPincodeViewResponse>>
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/application/{application_id}/zones")
    fun getZonesFromApplicationIdView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("zone_id") zoneId: ArrayList<String>?, @Query("q") q: String?)
    : Deferred<Response<GetZoneFromApplicationIdViewResponse>>
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/zones-list")
    fun getZoneListView(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("is_active") isActive: Boolean?, @Query("channel_ids") channelIds: String?, @Query("q") q: String?, @Query("zone_id") zoneId: ArrayList<String>?)
    : Deferred<Response<ListViewResponse>>
    
}