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
    
    
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_id")
    var channelId: String?=null,
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ServiceabilityrErrorResponse
*/
@Parcelize
data class ServiceabilityrErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationServiceabilityConfigResponse
*/
@Parcelize
data class ApplicationServiceabilityConfigResponse(
    
    
    
    @SerializedName("data")
    var data: ApplicationServiceabilityConfig?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: ServiceabilityrErrorResponse?=null
    
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
    Model: EntityRegionView_Items
*/
@Parcelize
data class EntityRegionView_Items(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionView_page
*/
@Parcelize
data class EntityRegionView_page(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
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
    Model: EntityRegionView_Response
*/
@Parcelize
data class EntityRegionView_Response(
    
    
    
    @SerializedName("data")
    var data: ArrayList<EntityRegionView_Items>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("page")
    var page: EntityRegionView_page?=null,
    
    @SerializedName("error")
    var error: EntityRegionView_Error?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewSummary
*/
@Parcelize
data class ListViewSummary(
    
    
    
    @SerializedName("total_active_zones")
    var totalActiveZones: Int?=null,
    
    @SerializedName("total_pincodes_served")
    var totalPincodesServed: Int?=null,
    
    @SerializedName("total_zones")
    var totalZones: Int?=null
    
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
    
    
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_id")
    var channelId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewItems
*/
@Parcelize
data class ListViewItems(
    
    
    
    @SerializedName("product")
    var product: ListViewProduct?=null,
    
    @SerializedName("pincodes_count")
    var pincodesCount: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("channels")
    var channels: ListViewChannels?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("stores_count")
    var storesCount: Int?=null,
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneDataItem
*/
@Parcelize
data class ZoneDataItem(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewResponse
*/
@Parcelize
data class ListViewResponse(
    
    
    
    @SerializedName("summary")
    var summary: ArrayList<ListViewSummary>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ListViewItems>?=null,
    
    @SerializedName("page")
    var page: ArrayList<ZoneDataItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyStoreView_PageItems
*/
@Parcelize
data class CompanyStoreView_PageItems(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyStoreView_Response
*/
@Parcelize
data class CompanyStoreView_Response(
    
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("page")
    var page: ArrayList<CompanyStoreView_PageItems>?=null
    
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
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneMappingType
*/
@Parcelize
data class ZoneMappingType(
    
    
    
    @SerializedName("pincode")
    var pincode: ArrayList<String>?=null,
    
    @SerializedName("state")
    var state: ArrayList<String>?=null,
    
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
    
    
    
    @SerializedName("data")
    var data: UpdateZoneData?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null
    
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
    
    
    
    @SerializedName("data")
    var data: CreateZoneData?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null
    
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
    Model: GetZoneFromApplicationIdViewResponse
*/
@Parcelize
data class GetZoneFromApplicationIdViewResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ListViewItems>?=null,
    
    @SerializedName("page")
    var page: ArrayList<ZoneDataItem>?=null
    
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
    Model: ContactNumberResponse
*/
@Parcelize
data class ContactNumberResponse(
    
    
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AddressResponse
*/
@Parcelize
data class AddressResponse(
    
    
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DocumentsResponse
*/
@Parcelize
data class DocumentsResponse(
    
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    Model: CreatedByResponse
*/
@Parcelize
data class CreatedByResponse(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
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
    Model: Dp
*/
@Parcelize
data class Dp(
    
    
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("lm_priority")
    var lmPriority: Int?=null,
    
    @SerializedName("internal_account_id")
    var internalAccountId: String?=null,
    
    @SerializedName("rvp_priority")
    var rvpPriority: Int?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null,
    
    @SerializedName("fm_priority")
    var fmPriority: Int?=null,
    
    @SerializedName("operations")
    var operations: ArrayList<String>?=null,
    
    @SerializedName("transport_mode")
    var transportMode: String?=null,
    
    @SerializedName("area_code")
    var areaCode: Int?=null,
    
    @SerializedName("external_account_id")
    var externalAccountId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticsResponse
*/
@Parcelize
data class LogisticsResponse(
    
    
    
    @SerializedName("dp")
    var dp: Dp?=null,
    
    @SerializedName("override")
    var override: Boolean?=null
    
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
    
    
    
    @SerializedName("opening")
    var opening: OpeningClosing?=null,
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("closing")
    var closing: OpeningClosing?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ModifiedByResponse
*/
@Parcelize
data class ModifiedByResponse(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: IntegrationTypeResponse
*/
@Parcelize
data class IntegrationTypeResponse(
    
    
    
    @SerializedName("order")
    var order: String?=null,
    
    @SerializedName("inventory")
    var inventory: String?=null
    
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
    Model: MobileNo
*/
@Parcelize
data class MobileNo(
    
    
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ManagerResponse
*/
@Parcelize
data class ManagerResponse(
    
    
    
    @SerializedName("mobile_no")
    var mobileNo: MobileNo?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ItemResponse
*/
@Parcelize
data class ItemResponse(
    
    
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<ContactNumberResponse>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company")
    var company: Int?=null,
    
    @SerializedName("address")
    var address: AddressResponse?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<DocumentsResponse>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: GstCredentialsResponse?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedByResponse?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigResponse?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logistics")
    var logistics: LogisticsResponse?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<TimmingResponse>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: ModifiedByResponse?=null,
    
    @SerializedName("_cls")
    var cls: String?=null,
    
    @SerializedName("integration_type")
    var integrationType: IntegrationTypeResponse?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("warnings")
    var warnings: WarningsResponse?=null,
    
    @SerializedName("manager")
    var manager: ManagerResponse?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedByResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PageResponse
*/
@Parcelize
data class PageResponse(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetStoresViewResponse
*/
@Parcelize
data class GetStoresViewResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ItemResponse>?=null,
    
    @SerializedName("page")
    var page: PageResponse?=null
    
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
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current_page_number")
    var currentPageNumber: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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



