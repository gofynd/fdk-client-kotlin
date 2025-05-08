package com.sdk.platform.serviceability

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: UpdateZoneConfigDetails
*/
@Parcelize
data class UpdateZoneConfigDetails(
    
    
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ServiceabilityErrorResult
*/
@Parcelize
data class ServiceabilityErrorResult(
    
    
    
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
    Model: ApplicationServiceabilityConfigResult
*/
@Parcelize
data class ApplicationServiceabilityConfigResult(
    
    
    
    @SerializedName("error")
    var error: ServiceabilityErrorResult?=null,
    
    @SerializedName("data")
    var data: ApplicationServiceabilityConfig?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionView_Details
*/
@Parcelize
data class EntityRegionView_Details(
    
    
    
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
    Model: getAppRegionZonesResult
*/
@Parcelize
data class getAppRegionZonesResult(
    
    
    
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
    Model: EntityRegionView_Result
*/
@Parcelize
data class EntityRegionView_Result(
    
    
    
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
    Model: ListViewResult
*/
@Parcelize
data class ListViewResult(
    
    
    
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
    Model: CompanyStoreView_Result
*/
@Parcelize
data class CompanyStoreView_Result(
    
    
    
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
    Model: ZoneUpdateDetails
*/
@Parcelize
data class ZoneUpdateDetails(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("data")
    var data: UpdateZoneData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneSuccessResult
*/
@Parcelize
data class ZoneSuccessResult(
    
    
    
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
    
    @SerializedName("assignment_preference")
    var assignmentPreference: String?=null,
    
    @SerializedName("stores_count")
    var storesCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetSingleZoneDataViewResult
*/
@Parcelize
data class GetSingleZoneDataViewResult(
    
    
    
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
    var mapping: ArrayList<ZoneMappingDetailType>?=null,
    
    @SerializedName("stores_count")
    var storesCount: Int?=null
    
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
    
    @SerializedName("region_type")
    var regionType: String?=null,
    
    @SerializedName("mapping")
    var mapping: ArrayList<ZoneMappingType>?=null,
    
    @SerializedName("product")
    var product: ZoneProductTypes?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneResult
*/
@Parcelize
data class ZoneResult(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneFromPincodeViewDetails
*/
@Parcelize
data class GetZoneFromPincodeViewDetails(
    
    
    
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
    Model: GetZoneFromPincodeViewResult
*/
@Parcelize
data class GetZoneFromPincodeViewResult(
    
    
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null,
    
    @SerializedName("zones")
    var zones: ArrayList<Zone>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetZoneFromApplicationIdViewResult
*/
@Parcelize
data class GetZoneFromApplicationIdViewResult(
    
    
    
    @SerializedName("page")
    var page: ArrayList<ZoneDataItem>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ListViewItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ServiceabilityPageResult
*/
@Parcelize
data class ServiceabilityPageResult(
    
    
    
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
    Model: ManagerResult
*/
@Parcelize
data class ManagerResult(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile_no")
    var mobileNo: MobileNo?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ModifiedByResult
*/
@Parcelize
data class ModifiedByResult(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: IntegrationTypeResult
*/
@Parcelize
data class IntegrationTypeResult(
    
    
    
    @SerializedName("inventory")
    var inventory: String?=null,
    
    @SerializedName("order")
    var order: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductReturnConfigResult
*/
@Parcelize
data class ProductReturnConfigResult(
    
    
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ContactNumberResult
*/
@Parcelize
data class ContactNumberResult(
    
    
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AddressResult
*/
@Parcelize
data class AddressResult(
    
    
    
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
    Model: CreatedByResult
*/
@Parcelize
data class CreatedByResult(
    
    
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EwayBillResult
*/
@Parcelize
data class EwayBillResult(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EinvoiceResult
*/
@Parcelize
data class EinvoiceResult(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GstCredentialsResult
*/
@Parcelize
data class GstCredentialsResult(
    
    
    
    @SerializedName("e_waybill")
    var eWaybill: EwayBillResult?=null,
    
    @SerializedName("e_invoice")
    var eInvoice: EinvoiceResult?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: WarningsResult
*/
@Parcelize
data class WarningsResult(
    
    
    
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
    Model: TimmingResult
*/
@Parcelize
data class TimmingResult(
    
    
    
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
    Model: DocumentsResult
*/
@Parcelize
data class DocumentsResult(
    
    
    
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
    Model: LogisticsResult
*/
@Parcelize
data class LogisticsResult(
    
    
    
    @SerializedName("override")
    var override: Boolean?=null,
    
    @SerializedName("dp")
    var dp: Dp?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ItemResult
*/
@Parcelize
data class ItemResult(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("manager")
    var manager: ManagerResult?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedByResult?=null,
    
    @SerializedName("integration_type")
    var integrationType: IntegrationTypeResult?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigResult?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<ContactNumberResult>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: ModifiedByResult?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("address")
    var address: AddressResult?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedByResult?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: GstCredentialsResult?=null,
    
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
    var warnings: WarningsResult?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<TimmingResult>?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<DocumentsResult>?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("company")
    var company: Int?=null,
    
    @SerializedName("_cls")
    var cls: String?=null,
    
    @SerializedName("logistics")
    var logistics: LogisticsResult?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetStoresViewResult
*/
@Parcelize
data class GetStoresViewResult(
    
    
    
    @SerializedName("page")
    var page: ServiceabilityPageResult?=null,
    
    @SerializedName("items")
    var items: ArrayList<ItemResult>?=null
    
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
    Model: PincodeMopUpdateResult
*/
@Parcelize
data class PincodeMopUpdateResult(
    
    
    
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
    Model: PincodeMOPResult
*/
@Parcelize
data class PincodeMOPResult(
    
    
    
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
    var updatedPincodes: ArrayList<PincodeMopUpdateResult>?=null
    
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
    Model: PincodeBulkViewResult
*/
@Parcelize
data class PincodeBulkViewResult(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("s3_url")
    var s3Url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusListingDetails
*/
@Parcelize
data class PincodeCodStatusListingDetails(
    
    
    
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
    Model: PincodeCodStatusItem
*/
@Parcelize
data class PincodeCodStatusItem(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeCodStatusListingResult
*/
@Parcelize
data class PincodeCodStatusListingResult(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeCodStatusListingResult>?=null,
    
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
    Model: PincodeMopUpdateAuditHistoryDetails
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryDetails(
    
    
    
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
    Model: PincodeMopUpdateAuditHistoryResult
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryResult(
    
    
    
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
    Model: PincodeMopUpdateAuditHistoryResultData
*/
@Parcelize
data class PincodeMopUpdateAuditHistoryResultData(
    
    
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("page")
    var page: PincodeMopUpdateAuditHistoryPaging?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeMopUpdateAuditHistoryResult>?=null
    
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
    Model: CourierAccountUpdateDetails
*/
@Parcelize
data class CourierAccountUpdateDetails(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
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
    Model: CourierAccount
*/
@Parcelize
data class CourierAccount(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
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
    var isOwnAccount: Boolean?=null,
    
    @SerializedName("scheme_rules")
    var schemeRules: CourierPartnerSchemeModel?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierAccountDetailsBody
*/
@Parcelize
data class CourierAccountDetailsBody(
    
    
    
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
    Model: ErrorResult
*/
@Parcelize
data class ErrorResult(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerAccountFailureResult
*/
@Parcelize
data class CourierPartnerAccountFailureResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ArrayList<ErrorResult>?=null
    
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
    Model: CourierPartnerRuleCPListResult
*/
@Parcelize
data class CourierPartnerRuleCPListResult(
    
    
    
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
    Model: CourierPartnerRuleResult
*/
@Parcelize
data class CourierPartnerRuleResult(
    
    
    
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
    var cpList: ArrayList<CourierPartnerRuleCPListResult>?=null
    
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
    var parentId: ArrayList<String>?=null,
    
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
    var sort: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FailureResult
*/
@Parcelize
data class FailureResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ArrayList<ErrorResult>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerRulesListResult
*/
@Parcelize
data class CourierPartnerRulesListResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CourierPartnerRuleResult>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsArticles
*/
@Parcelize
data class ShipmentsArticles(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("category_id")
    var categoryId: Int?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentDimension
*/
@Parcelize
data class ShipmentDimension(
    
    
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Shipments
*/
@Parcelize
data class Shipments(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("location_id")
    var locationId: Double?=null,
    
    @SerializedName("location_tags")
    var locationTags: ArrayList<String>?=null,
    
    @SerializedName("shipment_weight")
    var shipmentWeight: Double?=null,
    
    @SerializedName("shipment_volumetric_weight")
    var shipmentVolumetricWeight: Double?=null,
    
    @SerializedName("shipment_cost")
    var shipmentCost: Double?=null,
    
    @SerializedName("shipment_dimension")
    var shipmentDimension: ShipmentDimension?=null,
    
    @SerializedName("courier_partner_schemes")
    var courierPartnerSchemes: ArrayList<String>?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ShipmentsArticles>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentCourierPartnerDetails
*/
@Parcelize
data class ShipmentCourierPartnerDetails(
    
    
    
    @SerializedName("from_location")
    var fromLocation: ShipmentsCourierPartnersServiceability?=null,
    
    @SerializedName("to_location")
    var toLocation: ShipmentsCourierPartnersServiceability?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<Shipments>?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerPromise
*/
@Parcelize
data class CourierPartnerPromise(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartners
*/
@Parcelize
data class CourierPartners(
    
    
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: CourierPartnerPromise?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentCourierPartners
*/
@Parcelize
data class ShipmentCourierPartners(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("courier_partners")
    var courierPartners: ArrayList<CourierPartners>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentCourierPartnerResult
*/
@Parcelize
data class ShipmentCourierPartnerResult(
    
    
    
    @SerializedName("courier_partners")
    var courierPartners: ArrayList<CourierPartners>?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentCourierPartners>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsCourierPartnersServiceability
*/
@Parcelize
data class ShipmentsCourierPartnersServiceability(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("sector_code")
    var sectorCode: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("city_code")
    var cityCode: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
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
    var logisticsAsActual: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneConfig
*/
@Parcelize
data class ZoneConfig(
    
    
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null,
    
    @SerializedName("active_count")
    var activeCount: Int?=null,
    
    @SerializedName("total_count")
    var totalCount: Int?=null
    
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
    Model: BulkRegionJobDetails
*/
@Parcelize
data class BulkRegionJobDetails(
    
    
    
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
    Model: BulkRegionResultItemData
*/
@Parcelize
data class BulkRegionResultItemData(
    
    
    
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
    Model: BulkRegionResult
*/
@Parcelize
data class BulkRegionResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BulkRegionResultItemData>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SelfShipResult
*/
@Parcelize
data class SelfShipResult(
    
    
    
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
    var selfShip: SelfShipResult?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationSelfShipConfigResult
*/
@Parcelize
data class ApplicationSelfShipConfigResult(
    
    
    
    @SerializedName("error")
    var error: ServiceabilityErrorResult?=null,
    
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
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetStoreRulesApiResult
*/
@Parcelize
data class GetStoreRulesApiResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<StoreRuleDataSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateStoreRuleDetailsSchema
*/
@Parcelize
data class CreateStoreRuleDetailsSchema(
    
    
    
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
    Model: StoreRuleResultSchema
*/
@Parcelize
data class StoreRuleResultSchema(
    
    
    
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
    Model: StoreRuleUpdateResultSchema
*/
@Parcelize
data class StoreRuleUpdateResultSchema(
    
    
    
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
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("scheme_id")
    var schemeId: String?=null,
    
    @SerializedName("volumetric_weight")
    var volumetricWeight: ArithmeticOperations?=null,
    
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
    Model: CourierAccountResult
*/
@Parcelize
data class CourierAccountResult(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
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
    var isOwnAccount: Boolean?=null,
    
    @SerializedName("scheme_rules")
    var schemeRules: CourierPartnerSchemeModel?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyCourierPartnerAccountListResult
*/
@Parcelize
data class CompanyCourierPartnerAccountListResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CourierAccountResult>?=null,
    
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
    Model: PackageMaterialResult
*/
@Parcelize
data class PackageMaterialResult(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
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
    Model: PackageRuleResult
*/
@Parcelize
data class PackageRuleResult(
    
    
    
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
    var items: PackageRuleResult?=null,
    
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
    var items: PackageMaterialResult?=null,
    
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
    Model: RulePriorityDetails
*/
@Parcelize
data class RulePriorityDetails(
    
    
    
    @SerializedName("rule_id")
    var ruleId: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RulePriorityResult
*/
@Parcelize
data class RulePriorityResult(
    
    
    
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
    var quantity: Int?=null,
    
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
    Model: OptimlLocationsDetailsSchema
*/
@Parcelize
data class OptimlLocationsDetailsSchema(
    
    
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_identifier")
    var channelIdentifier: String?=null,
    
    @SerializedName("to_serviceability")
    var toServiceability: LocationDetailsServiceability?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<OptimalLocationsArticles>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptimalLocationArticlesResult
*/
@Parcelize
data class OptimalLocationArticlesResult(
    
    
    
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
    Model: OptimalLocationAssignedStoresResult
*/
@Parcelize
data class OptimalLocationAssignedStoresResult(
    
    
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<OptimalLocationArticlesResult>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptimalLocationsResult
*/
@Parcelize
data class OptimalLocationsResult(
    
    
    
    @SerializedName("assigned_stores")
    var assignedStores: ArrayList<OptimalLocationAssignedStoresResult>?=null,
    
    @SerializedName("faulty_articles")
    var faultyArticles: ArrayList<ErrorResult>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ValidationError
*/
@Parcelize
data class ValidationError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("field")
    var field: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StandardError
*/
@Parcelize
data class StandardError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}





