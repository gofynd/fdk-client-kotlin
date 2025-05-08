package com.sdk.platform.serviceability

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: Localities
*/
@Parcelize
data class Localities(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("parent_ids")
    var parentIds: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetLocalities
*/
@Parcelize
data class GetLocalities(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Localities>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateZoneConfigRequest
*/
@Parcelize
data class UpdateZoneConfigRequest(
    
    
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ServiceabilityErrorResponse
*/
@Parcelize
data class ServiceabilityErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationServiceabilityConfig
*/
@Parcelize
data class ApplicationServiceabilityConfig(
    
    
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationServiceabilityConfigResponse
*/
@Parcelize
data class ApplicationServiceabilityConfigResponse(
    
    
    
    @SerializedName("error")
    var error: ServiceabilityErrorResponse?=null,
    
    @SerializedName("data")
    var data: ApplicationServiceabilityConfig?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionView_Request
*/
@Parcelize
data class EntityRegionView_Request(
    
    
    
    @SerializedName("sub_type")
    var subType: ArrayList<String>?=null,
    
    @SerializedName("parent_id")
    var parentId: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionView_Error
*/
@Parcelize
data class EntityRegionView_Error(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionView_page
*/
@Parcelize
data class EntityRegionView_page(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: getAppRegionZonesResponse
*/
@Parcelize
data class getAppRegionZonesResponse(
    
    
    
    @SerializedName("page")
    var page: ArrayList<PageSchema>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ListViewItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PageSchema
*/
@Parcelize
data class PageSchema(
    
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionView_Items
*/
@Parcelize
data class EntityRegionView_Items(
    
    
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionView_Response
*/
@Parcelize
data class EntityRegionView_Response(
    
    
    
    @SerializedName("error")
    var error: EntityRegionView_Error?=null,
    
    @SerializedName("page")
    var page: EntityRegionView_page?=null,
    
    @SerializedName("data")
    var data: ArrayList<EntityRegionView_Items>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewSummary
*/
@Parcelize
data class ListViewSummary(
    
    
    
    @SerializedName("total_zones")
    var totalZones: Int?=null,
    
    @SerializedName("total_pincodes_served")
    var totalPincodesServed: Int?=null,
    
    @SerializedName("total_active_zones")
    var totalActiveZones: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneDataItem
*/
@Parcelize
data class ZoneDataItem(
    
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewProduct
*/
@Parcelize
data class ListViewProduct(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewChannels
*/
@Parcelize
data class ListViewChannels(
    
    
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewItems
*/
@Parcelize
data class ListViewItems(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("stores_count")
    var storesCount: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("regions_count")
    var regionsCount: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<ListViewChannels>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewResponse
*/
@Parcelize
data class ListViewResponse(
    
    
    
    @SerializedName("page")
    var page: ZoneDataItem?=null,
    
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
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
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
    
    
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null
    
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
    Model: ZoneMappingDetailType
*/
@Parcelize
data class ZoneMappingDetailType(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("regions")
    var regions: ArrayList<ZoneMappingRegions>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneMappingType
*/
@Parcelize
data class ZoneMappingType(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("regions")
    var regions: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneMappingRegions
*/
@Parcelize
data class ZoneMappingRegions(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("parent_id")
    var parentId: ArrayList<String>?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
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
    var mapping: ArrayList<ZoneMappingType>?=null
    
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
    
    @SerializedName("stores_count")
    var storesCount: Int?=null
    
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
    Model: GetZoneByIdSchema
*/
@Parcelize
data class GetZoneByIdSchema(
    
    
    
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
    var mapping: ArrayList<ZoneMappingDetailType>?=null
    
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
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("product")
    var product: ZoneProductTypes?=null,
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("mapping")
    var mapping: ArrayList<ZoneMappingType>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneResponse
*/
@Parcelize
data class ZoneResponse(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneFromPincodeViewRequest
*/
@Parcelize
data class GetZoneFromPincodeViewRequest(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Zone
*/
@Parcelize
data class Zone(
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null
    
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
    var zones: ArrayList<Zone>?=null
    
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
    Model: ServiceabilityPageResponse
*/
@Parcelize
data class ServiceabilityPageResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MobileNo
*/
@Parcelize
data class MobileNo(
    
    
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ManagerResponse
*/
@Parcelize
data class ManagerResponse(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile_no")
    var mobileNo: MobileNo?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ModifiedByResponse
*/
@Parcelize
data class ModifiedByResponse(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: IntegrationTypeResponse
*/
@Parcelize
data class IntegrationTypeResponse(
    
    
    
    @SerializedName("inventory")
    var inventory: String?=null,
    
    @SerializedName("order")
    var order: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductReturnConfigResponse
*/
@Parcelize
data class ProductReturnConfigResponse(
    
    
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ContactNumberResponse
*/
@Parcelize
data class ContactNumberResponse(
    
    
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AddressResponse
*/
@Parcelize
data class AddressResponse(
    
    
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreatedByResponse
*/
@Parcelize
data class CreatedByResponse(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EwayBillResponse
*/
@Parcelize
data class EwayBillResponse(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EinvoiceResponse
*/
@Parcelize
data class EinvoiceResponse(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GstCredentialsResponse
*/
@Parcelize
data class GstCredentialsResponse(
    
    
    
    @SerializedName("e_waybill")
    var eWaybill: EwayBillResponse?=null,
    
    @SerializedName("e_invoice")
    var eInvoice: EinvoiceResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WarningsResponse
*/
@Parcelize
data class WarningsResponse(
    
    
    
    @SerializedName("store_address")
    var storeAddress: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OpeningClosing
*/
@Parcelize
data class OpeningClosing(
    
    
    
    @SerializedName("minute")
    var minute: Int?=null,
    
    @SerializedName("hour")
    var hour: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TimmingResponse
*/
@Parcelize
data class TimmingResponse(
    
    
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null,
    
    @SerializedName("closing")
    var closing: OpeningClosing?=null,
    
    @SerializedName("opening")
    var opening: OpeningClosing?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DocumentsResponse
*/
@Parcelize
data class DocumentsResponse(
    
    
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Dp
*/
@Parcelize
data class Dp(
    
    
    
    @SerializedName("fm_priority")
    var fmPriority: Int?=null,
    
    @SerializedName("rvp_priority")
    var rvpPriority: Int?=null,
    
    @SerializedName("lm_priority")
    var lmPriority: Int?=null,
    
    @SerializedName("internal_account_id")
    var internalAccountId: String?=null,
    
    @SerializedName("area_code")
    var areaCode: Int?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("operations")
    var operations: ArrayList<String>?=null,
    
    @SerializedName("external_account_id")
    var externalAccountId: String?=null,
    
    @SerializedName("transport_mode")
    var transportMode: String?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticsResponse
*/
@Parcelize
data class LogisticsResponse(
    
    
    
    @SerializedName("override")
    var override: Boolean?=null,
    
    @SerializedName("dp")
    var dp: Dp?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ItemResponse
*/
@Parcelize
data class ItemResponse(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("manager")
    var manager: ManagerResponse?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedByResponse?=null,
    
    @SerializedName("integration_type")
    var integrationType: IntegrationTypeResponse?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigResponse?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<ContactNumberResponse>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: ModifiedByResponse?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("address")
    var address: AddressResponse?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedByResponse?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: GstCredentialsResponse?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("warnings")
    var warnings: WarningsResponse?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<TimmingResponse>?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<DocumentsResponse>?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("company")
    var company: Int?=null,
    
    @SerializedName("_cls")
    var cls: String?=null,
    
    @SerializedName("logistics")
    var logistics: LogisticsResponse?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetStoresViewResponse
*/
@Parcelize
data class GetStoresViewResponse(
    
    
    
    @SerializedName("page")
    var page: ServiceabilityPageResponse?=null,
    
    @SerializedName("items")
    var items: ArrayList<ItemResponse>?=null
    
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
    Model: CommonError
*/
@Parcelize
data class CommonError(
    
    
    
    @SerializedName("status_code")
    var statusCode: String?=null,
    
    @SerializedName("error")
    var error: @RawValue Any?=null,
    
    @SerializedName("success")
    var success: String?=null
    
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
    
    @SerializedName("current")
    var current: Int?=null,
    
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
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
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



             
/*
    Model: ArithmeticOperations
*/
@Parcelize
data class ArithmeticOperations(
    
    
    
    @SerializedName("lt")
    var lt: Int?=null,
    
    @SerializedName("gt")
    var gt: Int?=null,
    
    @SerializedName("lte")
    var lte: Int?=null,
    
    @SerializedName("gte")
    var gte: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SchemeRulesFeatures
*/
@Parcelize
data class SchemeRulesFeatures(
    
    
    
    @SerializedName("quality_check")
    var qualityCheck: Boolean?=null,
    
    @SerializedName("quick_response_code")
    var quickResponseCode: Boolean?=null,
    
    @SerializedName("e_waybill")
    var eWaybill: Boolean?=null,
    
    @SerializedName("multi_part_shipments")
    var multiPartShipments: Boolean?=null,
    
    @SerializedName("flammable")
    var flammable: Boolean?=null,
    
    @SerializedName("hazmat")
    var hazmat: Boolean?=null,
    
    @SerializedName("battery_operated")
    var batteryOperated: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SchemeRules
*/
@Parcelize
data class SchemeRules(
    
    
    
    @SerializedName("weight")
    var weight: ArithmeticOperations?=null,
    
    @SerializedName("transport_type")
    var transportType: ArrayList<String>?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: ArrayList<String>?=null,
    
    @SerializedName("feature")
    var feature: SchemeRulesFeatures?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierAccount
*/
@Parcelize
data class CourierAccount(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("is_own_account")
    var isOwnAccount: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierAccountRequestBody
*/
@Parcelize
data class CourierAccountRequestBody(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("is_own_account")
    var isOwnAccount: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerAccountFailureResponse
*/
@Parcelize
data class CourierPartnerAccountFailureResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ArrayList<ErrorResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Page
*/
@Parcelize
data class Page(
    
    
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRuleCPListResponse
*/
@Parcelize
data class CourierPartnerRuleCPListResponse(
    
    
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("scheme_rules")
    var schemeRules: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRuleResponse
*/
@Parcelize
data class CourierPartnerRuleResponse(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("conditions")
    var conditions: CourierPartnerRuleConditions?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("cp_list")
    var cpList: ArrayList<CourierPartnerRuleCPListResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerList
*/
@Parcelize
data class CourierPartnerList(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("account_id")
    var accountId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocationRuleValues
*/
@Parcelize
data class LocationRuleValues(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("parent_id")
    var parentId: String?=null,
    
    @SerializedName("parent_ids")
    var parentIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationRule
*/
@Parcelize
data class LocationRule(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("includes")
    var includes: ArrayList<LocationRuleValues>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StringComparisonOperations
*/
@Parcelize
data class StringComparisonOperations(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: IntComparisonOperations
*/
@Parcelize
data class IntComparisonOperations(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRuleConditions
*/
@Parcelize
data class CourierPartnerRuleConditions(
    
    
    
    @SerializedName("forward")
    var forward: LocationRule?=null,
    
    @SerializedName("reverse")
    var reverse: LocationRule?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: StringComparisonOperations?=null,
    
    @SerializedName("category_ids")
    var categoryIds: IntComparisonOperations?=null,
    
    @SerializedName("product_ids")
    var productIds: IntComparisonOperations?=null,
    
    @SerializedName("product_tags")
    var productTags: StringComparisonOperations?=null,
    
    @SerializedName("zone_ids")
    var zoneIds: StringComparisonOperations?=null,
    
    @SerializedName("department_ids")
    var departmentIds: IntComparisonOperations?=null,
    
    @SerializedName("brand_ids")
    var brandIds: IntComparisonOperations?=null,
    
    @SerializedName("order_place_date")
    var orderPlaceDate: ArithmeticOperations?=null,
    
    @SerializedName("store_ids")
    var storeIds: IntComparisonOperations?=null,
    
    @SerializedName("store_type")
    var storeType: StringComparisonOperations?=null,
    
    @SerializedName("store_tags")
    var storeTags: StringComparisonOperations?=null,
    
    @SerializedName("shipment_weight")
    var shipmentWeight: ArithmeticOperations?=null,
    
    @SerializedName("shipment_cost")
    var shipmentCost: ArithmeticOperations?=null,
    
    @SerializedName("shipment_volumetric_weight")
    var shipmentVolumetricWeight: ArithmeticOperations?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRule
*/
@Parcelize
data class CourierPartnerRule(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("cp_list")
    var cpList: ArrayList<CourierPartnerList>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("conditions")
    var conditions: CourierPartnerRuleConditions?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FailureResponse
*/
@Parcelize
data class FailureResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ArrayList<ErrorResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRulesListResponse
*/
@Parcelize
data class CourierPartnerRulesListResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CourierPartnerRuleResponse>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyConfig
*/
@Parcelize
data class CompanyConfig(
    
    
    
    @SerializedName("rule_ids")
    var ruleIds: ArrayList<String>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("logistics_as_actual")
    var logisticsAsActual: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneConfig
*/
@Parcelize
data class ZoneConfig(
    
    
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationConfig
*/
@Parcelize
data class ApplicationConfig(
    
    
    
    @SerializedName("rule_ids")
    var ruleIds: ArrayList<String>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("zones")
    var zones: ZoneConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkRegionJobSerializer
*/
@Parcelize
data class BulkRegionJobSerializer(
    
    
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("region")
    var region: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkRegionResponseItemData
*/
@Parcelize
data class BulkRegionResponseItemData(
    
    
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("failed_records")
    var failedRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("success")
    var success: Int?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("error_file_path")
    var errorFilePath: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkRegionResponse
*/
@Parcelize
data class BulkRegionResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BulkRegionResponseItemData>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SelfShipResponse
*/
@Parcelize
data class SelfShipResponse(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("tat")
    var tat: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationSelfShipConfig
*/
@Parcelize
data class ApplicationSelfShipConfig(
    
    
    
    @SerializedName("self_ship")
    var selfShip: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationSelfShipConfigResponse
*/
@Parcelize
data class ApplicationSelfShipConfigResponse(
    
    
    
    @SerializedName("error")
    var error: ServiceabilityErrorResponse?=null,
    
    @SerializedName("data")
    var data: ApplicationSelfShipConfig?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleConfigData
*/
@Parcelize
data class StoreRuleConfigData(
    
    
    
    @SerializedName("rule_ids")
    var ruleIds: ArrayList<String>?=null,
    
    @SerializedName("type_based_priority")
    var typeBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("tag_based_priority")
    var tagBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("store_priority")
    var storePriority: ArrayList<StorePrioritySchema>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerRadiusSchema
*/
@Parcelize
data class CustomerRadiusSchema(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("lt")
    var lt: Int?=null,
    
    @SerializedName("lte")
    var lte: Int?=null,
    
    @SerializedName("gt")
    var gt: Int?=null,
    
    @SerializedName("gte")
    var gte: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleConditionSchema
*/
@Parcelize
data class StoreRuleConditionSchema(
    
    
    
    @SerializedName("department_ids")
    var departmentIds: IntComparisonOperations?=null,
    
    @SerializedName("category_ids")
    var categoryIds: IntComparisonOperations?=null,
    
    @SerializedName("brand_ids")
    var brandIds: IntComparisonOperations?=null,
    
    @SerializedName("to_location")
    var toLocation: LocationRule?=null,
    
    @SerializedName("customer_radius")
    var customerRadius: CustomerRadiusSchema?=null,
    
    @SerializedName("store_type")
    var storeType: StringComparisonOperations?=null,
    
    @SerializedName("product_tags")
    var productTags: StringComparisonOperations?=null,
    
    @SerializedName("product_ids")
    var productIds: IntComparisonOperations?=null,
    
    @SerializedName("store_tags")
    var storeTags: StringComparisonOperations?=null,
    
    @SerializedName("order_place_date")
    var orderPlaceDate: ArithmeticOperations?=null,
    
    @SerializedName("zone_ids")
    var zoneIds: StringComparisonOperations?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleDataSchema
*/
@Parcelize
data class StoreRuleDataSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("type_based_priority")
    var typeBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("tag_based_priority")
    var tagBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("store_priority")
    var storePriority: ArrayList<StorePrioritySchema>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("conditions")
    var conditions: StoreRuleConditionSchema?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StorePrioritySchema
*/
@Parcelize
data class StorePrioritySchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetStoreRulesApiResponse
*/
@Parcelize
data class GetStoreRulesApiResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<StoreRuleDataSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateStoreRuleRequestSchema
*/
@Parcelize
data class CreateStoreRuleRequestSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("conditions")
    var conditions: StoreRuleConditionSchema?=null,
    
    @SerializedName("type_based_priority")
    var typeBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("tag_based_priority")
    var tagBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("store_priority")
    var storePriority: ArrayList<StorePrioritySchema>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleResponseSchema
*/
@Parcelize
data class StoreRuleResponseSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("type_based_priority")
    var typeBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("tag_based_priority")
    var tagBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("store_priority")
    var storePriority: ArrayList<StorePrioritySchema>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("conditions")
    var conditions: StoreRuleConditionSchema?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreRuleUpdateResponseSchema
*/
@Parcelize
data class StoreRuleUpdateResponseSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("type_based_priority")
    var typeBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("tag_based_priority")
    var tagBasedPriority: ArrayList<String>?=null,
    
    @SerializedName("store_priority")
    var storePriority: ArrayList<StorePrioritySchema>?=null,
    
    @SerializedName("sort")
    var sort: ArrayList<String>?=null,
    
    @SerializedName("conditions")
    var conditions: StoreRuleConditionSchema?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ServiceabilityModel
*/
@Parcelize
data class ServiceabilityModel(
    
    
    
    @SerializedName("lm_cod_limit")
    var lmCodLimit: Int?=null,
    
    @SerializedName("is_qc")
    var isQc: Boolean?=null,
    
    @SerializedName("pickup_cutoff")
    var pickupCutoff: String?=null,
    
    @SerializedName("route_code")
    var routeCode: String?=null,
    
    @SerializedName("is_first_mile")
    var isFirstMile: Boolean?=null,
    
    @SerializedName("is_return")
    var isReturn: Boolean?=null,
    
    @SerializedName("is_installation")
    var isInstallation: Boolean?=null,
    
    @SerializedName("is_last_mile")
    var isLastMile: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerSchemeFeatures
*/
@Parcelize
data class CourierPartnerSchemeFeatures(
    
    
    
    @SerializedName("doorstep_qc")
    var doorstepQc: Boolean?=null,
    
    @SerializedName("qr")
    var qr: Boolean?=null,
    
    @SerializedName("mps")
    var mps: Boolean?=null,
    
    @SerializedName("ndr")
    var ndr: Boolean?=null,
    
    @SerializedName("ndr_attempts")
    var ndrAttempts: Int?=null,
    
    @SerializedName("dangerous_goods")
    var dangerousGoods: Boolean?=null,
    
    @SerializedName("fragile_goods")
    var fragileGoods: Boolean?=null,
    
    @SerializedName("restricted_goods")
    var restrictedGoods: Boolean?=null,
    
    @SerializedName("cold_storage_goods")
    var coldStorageGoods: Boolean?=null,
    
    @SerializedName("doorstep_exchange")
    var doorstepExchange: Boolean?=null,
    
    @SerializedName("doorstep_return")
    var doorstepReturn: Boolean?=null,
    
    @SerializedName("product_installation")
    var productInstallation: Boolean?=null,
    
    @SerializedName("openbox_delivery")
    var openboxDelivery: Boolean?=null,
    
    @SerializedName("status_updates")
    var statusUpdates: String?=null,
    
    @SerializedName("multi_pick_single_drop")
    var multiPickSingleDrop: Boolean?=null,
    
    @SerializedName("single_pick_multi_drop")
    var singlePickMultiDrop: Boolean?=null,
    
    @SerializedName("multi_pick_multi_drop")
    var multiPickMultiDrop: Boolean?=null,
    
    @SerializedName("ewaybill")
    var ewaybill: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerSchemeModel
*/
@Parcelize
data class CourierPartnerSchemeModel(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("weight")
    var weight: ArithmeticOperations?=null,
    
    @SerializedName("transport_type")
    var transportType: String?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("delivery_type")
    var deliveryType: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: ArrayList<String>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("feature")
    var feature: CourierPartnerSchemeFeatures?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierAccountResponse
*/
@Parcelize
data class CourierAccountResponse(
    
    
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("is_own_account")
    var isOwnAccount: Boolean?=null,
    
    @SerializedName("scheme_rules")
    var schemeRules: CourierPartnerSchemeModel?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyCourierPartnerAccountListResponse
*/
@Parcelize
data class CompanyCourierPartnerAccountListResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CourierAccountResponse>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterial
*/
@Parcelize
data class PackageMaterial(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("rules")
    var rules: ArrayList<PackageMaterialRule>?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("weight")
    var weight: Double?=null,
    
    @SerializedName("error_rate")
    var errorRate: Double?=null,
    
    @SerializedName("package_type")
    var packageType: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("media")
    var media: ArrayList<String>?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<Channel>?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("max_weight")
    var maxWeight: Double?=null,
    
    @SerializedName("package_vol_weight")
    var packageVolWeight: Double?=null,
    
    @SerializedName("auto_calculate")
    var autoCalculate: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterialResponse
*/
@Parcelize
data class PackageMaterialResponse(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("rules")
    var rules: ArrayList<PackageMaterialRule>?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("weight")
    var weight: Double?=null,
    
    @SerializedName("error_rate")
    var errorRate: Double?=null,
    
    @SerializedName("package_type")
    var packageType: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("media")
    var media: ArrayList<String>?=null,
    
    @SerializedName("channels")
    var channels: ArrayList<Channel>?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("max_weight")
    var maxWeight: Double?=null,
    
    @SerializedName("package_vol_weight")
    var packageVolWeight: Double?=null,
    
    @SerializedName("auto_calculate")
    var autoCalculate: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterialRule
*/
@Parcelize
data class PackageMaterialRule(
    
    
    
    @SerializedName("rule_id")
    var ruleId: String?=null,
    
    @SerializedName("quantity")
    var quantity: PackageMaterialRuleQuantity?=null,
    
    @SerializedName("weight")
    var weight: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageRule
*/
@Parcelize
data class PackageRule(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("product_tag")
    var productTag: PackageRuleProductTag?=null,
    
    @SerializedName("product_id")
    var productId: PackageRuleProduct?=null,
    
    @SerializedName("category_id")
    var categoryId: PackageRuleCategory?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PackageRuleResponse
*/
@Parcelize
data class PackageRuleResponse(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("product_tag")
    var productTag: PackageRuleProductTag?=null,
    
    @SerializedName("product_id")
    var productId: PackageRuleProduct?=null,
    
    @SerializedName("category_id")
    var categoryId: PackageRuleCategory?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Channel
*/
@Parcelize
data class Channel(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterialRuleList
*/
@Parcelize
data class PackageMaterialRuleList(
    
    
    
    @SerializedName("items")
    var items: PackageRuleResponse?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackageMaterialList
*/
@Parcelize
data class PackageMaterialList(
    
    
    
    @SerializedName("items")
    var items: PackageMaterialResponse?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PackageRuleProduct
*/
@Parcelize
data class PackageRuleProduct(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PackageRuleProductTag
*/
@Parcelize
data class PackageRuleProductTag(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PackageRuleCategory
*/
@Parcelize
data class PackageRuleCategory(
    
    
    
    @SerializedName("includes")
    var includes: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PackageMaterialRuleQuantity
*/
@Parcelize
data class PackageMaterialRuleQuantity(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RulePriorityRequest
*/
@Parcelize
data class RulePriorityRequest(
    
    
    
    @SerializedName("rule_id")
    var ruleId: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RulePriorityResponse
*/
@Parcelize
data class RulePriorityResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ServiceabilityLocation
*/
@Parcelize
data class ServiceabilityLocation(
    
    
    
    @SerializedName("longitude")
    var longitude: String?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocationDetailsServiceability
*/
@Parcelize
data class LocationDetailsServiceability(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("location")
    var location: ServiceabilityLocation?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptimalLocationsArticles
*/
@Parcelize
data class OptimalLocationsArticles(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("quantity")
    var quantity: String?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("is_primary_item")
    var isPrimaryItem: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    
    @SerializedName("ignore_locations")
    var ignoreLocations: ArrayList<Int>?=null,
    
    @SerializedName("assign_locations")
    var assignLocations: ArrayList<Int>?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptimlLocationsRequestSchema
*/
@Parcelize
data class OptimlLocationsRequestSchema(
    
    
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_identifier")
    var channelIdentifier: String?=null,
    
    @SerializedName("to_serviceability")
    var toServiceability: LocationDetailsServiceability?=null,
    
    @SerializedName("article")
    var article: OptimalLocationsArticles?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptimalLocationArticlesResponse
*/
@Parcelize
data class OptimalLocationArticlesResponse(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("is_primary_item")
    var isPrimaryItem: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("ignore_locations")
    var ignoreLocations: ArrayList<Int>?=null,
    
    @SerializedName("assign_locations")
    var assignLocations: ArrayList<Int>?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("mto_quantity")
    var mtoQuantity: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptimalLocationAssignedStoresResponse
*/
@Parcelize
data class OptimalLocationAssignedStoresResponse(
    
    
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<OptimalLocationArticlesResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptimalLocationsResponse
*/
@Parcelize
data class OptimalLocationsResponse(
    
    
    
    @SerializedName("assigned_stores")
    var assignedStores: ArrayList<OptimalLocationAssignedStoresResponse>?=null,
    
    @SerializedName("faulty_articles")
    var faultyArticles: ArrayList<ErrorResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}





