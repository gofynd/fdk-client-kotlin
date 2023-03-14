package com.sdk.platform.models.serviceability

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: ApplicationServiceabilityConfig
*/
@Parcelize
data class ApplicationServiceabilityConfig(
    
    
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ServiceabilityErrorResponse
*/
@Parcelize
data class ServiceabilityErrorResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationServiceabilityResponse
*/
@Parcelize
data class ApplicationServiceabilityResponse(
    
    
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationServiceabilityConfigResponse
*/
@Parcelize
data class ApplicationServiceabilityConfigResponse(
    
    
    
    @SerializedName("error")
    var error: ServiceabilityErrorResponse?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ApplicationServiceabilityResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionViewRequest
*/
@Parcelize
data class EntityRegionViewRequest(
    
    
    
    @SerializedName("sub_type")
    var subType: ArrayList<String>?=null,
    
    @SerializedName("parent_id")
    var parentId: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionViewPage
*/
@Parcelize
data class EntityRegionViewPage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionViewError
*/
@Parcelize
data class EntityRegionViewError(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionViewItems
*/
@Parcelize
data class EntityRegionViewItems(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionViewResponse
*/
@Parcelize
data class EntityRegionViewResponse(
    
    
    
    @SerializedName("page")
    var page: EntityRegionViewPage?=null,
    
    @SerializedName("error")
    var error: EntityRegionViewError?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<EntityRegionViewItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneDataItem
*/
@Parcelize
data class ZoneDataItem(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewSummary
*/
@Parcelize
data class ListViewSummary(
    
    
    
    @SerializedName("total_active_zones")
    var totalActiveZones: Int?=null,
    
    @SerializedName("total_zones")
    var totalZones: Int?=null,
    
    @SerializedName("total_pincodes_served")
    var totalPincodesServed: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewChannels
*/
@Parcelize
data class ListViewChannels(
    
    
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_id")
    var channelId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewProduct
*/
@Parcelize
data class ListViewProduct(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewItems
*/
@Parcelize
data class ListViewItems(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("channels")
    var channels: ListViewChannels?=null,
    
    @SerializedName("pincodes_count")
    var pincodesCount: Int?=null,
    
    @SerializedName("product")
    var product: ListViewProduct?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("stores_count")
    var storesCount: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewResponse
*/
@Parcelize
data class ListViewResponse(
    
    
    
    @SerializedName("page")
    var page: ArrayList<ZoneDataItem>?=null,
    
    @SerializedName("summary")
    var summary: ArrayList<ListViewSummary>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ListViewItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyStoreView_PageItems
*/
@Parcelize
data class CompanyStoreView_PageItems(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyStoreView_Response
*/
@Parcelize
data class CompanyStoreView_Response(
    
    
    
    @SerializedName("page")
    var page: ArrayList<CompanyStoreView_PageItems>?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneDataViewChannels
*/
@Parcelize
data class GetZoneDataViewChannels(
    
    
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_id")
    var channelId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneProductTypes
*/
@Parcelize
data class ZoneProductTypes(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneMappingType
*/
@Parcelize
data class ZoneMappingType(
    
    
    
    @SerializedName("state")
    var state: ArrayList<String>?=null,
    
    @SerializedName("pincode")
    var pincode: ArrayList<String>?=null,
    
    @SerializedName("country")
    var country: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneDataViewItems
*/
@Parcelize
data class GetZoneDataViewItems(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<GetZoneDataViewChannels>?=null,
    
    @SerializedName("product")
    var product: ZoneProductTypes?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("mapping")
    var mapping: ArrayList<ZoneMappingType>?=null,
    
    @SerializedName("assignment_preference")
    var assignmentPreference: String?=null,
    
    @SerializedName("stores_count")
    var storesCount: Int?=null,
    
    @SerializedName("pincodes_count")
    var pincodesCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetSingleZoneDataViewResponse
*/
@Parcelize
data class GetSingleZoneDataViewResponse(
    
    
    
    @SerializedName("data")
    var data: GetZoneDataViewItems?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateZoneData
*/
@Parcelize
data class UpdateZoneData(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<GetZoneDataViewChannels>?=null,
    
    @SerializedName("product")
    var product: ZoneProductTypes?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("mapping")
    var mapping: ArrayList<ZoneMappingType>?=null,
    
    @SerializedName("assignment_preference")
    var assignmentPreference: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneUpdateRequest
*/
@Parcelize
data class ZoneUpdateRequest(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("data")
    var data: UpdateZoneData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneSuccessResponse
*/
@Parcelize
data class ZoneSuccessResponse(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateZoneData
*/
@Parcelize
data class CreateZoneData(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<GetZoneDataViewChannels>?=null,
    
    @SerializedName("product")
    var product: ZoneProductTypes?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("mapping")
    var mapping: ArrayList<ZoneMappingType>?=null,
    
    @SerializedName("assignment_preference")
    var assignmentPreference: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneRequest
*/
@Parcelize
data class ZoneRequest(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("data")
    var data: CreateZoneData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneResponse
*/
@Parcelize
data class ZoneResponse(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("zone_id")
    var zoneId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneFromPincodeViewRequest
*/
@Parcelize
data class GetZoneFromPincodeViewRequest(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("country")
    var country: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneFromPincodeViewResponse
*/
@Parcelize
data class GetZoneFromPincodeViewResponse(
    
    
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null,
    
    @SerializedName("zones")
    var zones: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneFromApplicationIdViewResponse
*/
@Parcelize
data class GetZoneFromApplicationIdViewResponse(
    
    
    
    @SerializedName("page")
    var page: ArrayList<ZoneDataItem>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ListViewItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopData
*/
@Parcelize
data class PincodeMopData(
    
    
    
    @SerializedName("pincodes")
    var pincodes: ArrayList<Int>?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopUpdateResponse
*/
@Parcelize
data class PincodeMopUpdateResponse(
    
    
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMOPresponse
*/
@Parcelize
data class PincodeMOPresponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("pincodes")
    var pincodes: ArrayList<Int>?=null,
    
    @SerializedName("updated_pincodes")
    var updatedPincodes: ArrayList<PincodeMopUpdateResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopBulkData
*/
@Parcelize
data class PincodeMopBulkData(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("s3_url")
    var s3Url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeBulkViewResponse
*/
@Parcelize
data class PincodeBulkViewResponse(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("s3_url")
    var s3Url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusListingRequest
*/
@Parcelize
data class PincodeCodStatusListingRequest(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("current_page_number")
    var currentPageNumber: Int?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusListingResponse
*/
@Parcelize
data class PincodeCodStatusListingResponse(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeCodStatusListingResponse>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("errors")
    var errors: ArrayList<Error>?=null,
    
    @SerializedName("page")
    var page: PincodeCodStatusListingPage?=null,
    
    @SerializedName("summary")
    var summary: PincodeCodStatusListingSummary?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusListingPage
*/
@Parcelize
data class PincodeCodStatusListingPage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current_page_number")
    var currentPageNumber: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusListingSummary
*/
@Parcelize
data class PincodeCodStatusListingSummary(
    
    
    
    @SerializedName("total_active_pincodes")
    var totalActivePincodes: Int?=null,
    
    @SerializedName("total_inactive_pincodes")
    var totalInactivePincodes: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopUpdateAuditHistoryRequest
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryRequest(
    
    
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopUpdateAuditHistoryPaging
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryPaging(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopUpdateAuditHistoryResponse
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryResponse(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("error_file_s3_url")
    var errorFileS3Url: String?=null,
    
    @SerializedName("s3_url")
    var s3Url: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMopUpdateAuditHistoryResponseData
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryResponseData(
    
    
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("page")
    var page: PincodeMopUpdateAuditHistoryPaging?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeMopUpdateAuditHistoryResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



