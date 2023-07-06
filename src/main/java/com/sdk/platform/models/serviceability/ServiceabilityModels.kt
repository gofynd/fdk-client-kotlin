package com.sdk.platform.models.serviceability

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: ApplicationServiceabilityConfig
*/
@Parcelize
data class ApplicationServiceabilityConfig(
    
    
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("channel_id")
    var channelId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ServiceabilityErrorResponse
*/
@Parcelize
data class ServiceabilityErrorResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
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
    var error: ServiceabilityErrorResponse?=null
    
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
    Model: EntityRegionView_page
*/
@Parcelize
data class EntityRegionView_page(
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
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
    Model: EntityRegionView_Error
*/
@Parcelize
data class EntityRegionView_Error(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityRegionView_Response
*/
@Parcelize
data class EntityRegionView_Response(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("page")
    var page: EntityRegionView_page?=null,
    
    @SerializedName("data")
    var data: ArrayList<EntityRegionView_Items>?=null,
    
    @SerializedName("error")
    var error: EntityRegionView_Error?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ZoneDataItem
*/
@Parcelize
data class ZoneDataItem(
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
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
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ListViewItems
*/
@Parcelize
data class ListViewItems(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("stores_count")
    var storesCount: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("pincodes_count")
    var pincodesCount: Int?=null,
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("channels")
    var channels: ListViewChannels?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("product")
    var product: ListViewProduct?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
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
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
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
    
    
    
    @SerializedName("state")
    var state: ArrayList<String>?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: ArrayList<String>?=null
    
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
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
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
    
    
    
    @SerializedName("zone_id")
    var zoneId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null
    
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
    Model: GetZoneFromPincodeViewResponse
*/
@Parcelize
data class GetZoneFromPincodeViewResponse(
    
    
    
    @SerializedName("zones")
    var zones: ArrayList<String>?=null,
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null
    
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
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
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
    Model: ProductReturnConfigResponse
*/
@Parcelize
data class ProductReturnConfigResponse(
    
    
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OpeningClosing
*/
@Parcelize
data class OpeningClosing(
    
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TimmingResponse
*/
@Parcelize
data class TimmingResponse(
    
    
    
    @SerializedName("opening")
    var opening: OpeningClosing?=null,
    
    @SerializedName("closing")
    var closing: OpeningClosing?=null,
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddressResponse
*/
@Parcelize
data class AddressResponse(
    
    
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null
    
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
    Model: DocumentsResponse
*/
@Parcelize
data class DocumentsResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
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
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile_no")
    var mobileNo: MobileNo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Dp
*/
@Parcelize
data class Dp(
    
    
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null,
    
    @SerializedName("operations")
    var operations: ArrayList<String>?=null,
    
    @SerializedName("rvp_priority")
    var rvpPriority: Int?=null,
    
    @SerializedName("lm_priority")
    var lmPriority: Int?=null,
    
    @SerializedName("fm_priority")
    var fmPriority: Int?=null,
    
    @SerializedName("internal_account_id")
    var internalAccountId: String?=null,
    
    @SerializedName("external_account_id")
    var externalAccountId: String?=null,
    
    @SerializedName("transport_mode")
    var transportMode: String?=null,
    
    @SerializedName("area_code")
    var areaCode: Int?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null
    
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
    Model: WarningsResponse
*/
@Parcelize
data class WarningsResponse(
    
    
    
    @SerializedName("store_address")
    var storeAddress: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ItemResponse
*/
@Parcelize
data class ItemResponse(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedByResponse?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("integration_type")
    var integrationType: IntegrationTypeResponse?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: ModifiedByResponse?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigResponse?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<TimmingResponse>?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("address")
    var address: AddressResponse?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: GstCredentialsResponse?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("company")
    var company: Int?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<DocumentsResponse>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: ModifiedByResponse?=null,
    
    @SerializedName("manager")
    var manager: ManagerResponse?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logistics")
    var logistics: LogisticsResponse?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("_cls")
    var cls: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<ContactNumberResponse>?=null,
    
    @SerializedName("warnings")
    var warnings: WarningsResponse?=null
    
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
    Model: ReAssignStoreRequest
*/
@Parcelize
data class ReAssignStoreRequest(
    
    
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("configuration")
    var configuration: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ignored_locations")
    var ignoredLocations: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReAssignStoreResponse
*/
@Parcelize
data class ReAssignStoreResponse(
    
    
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationCompanyDpViewRequest
*/
@Parcelize
data class ApplicationCompanyDpViewRequest(
    
    
    
    @SerializedName("dp_id")
    var dpId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationCompanyDpViewResponse
*/
@Parcelize
data class ApplicationCompanyDpViewResponse(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("courier_partner_id")
    var courierPartnerId: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
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
    
    
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("status_code")
    var statusCode: String?=null,
    
    @SerializedName("error")
    var error: @RawValue Any?=null
    
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
    
    
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
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



             
/*
    Model: Dp1
*/
@Parcelize
data class Dp1(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("plan_rules")
    var planRules: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("plan_id")
    var planId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyDpAccountRequest
*/
@Parcelize
data class CompanyDpAccountRequest(
    
    
    
    @SerializedName("data")
    var data: ArrayList<Dp1>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CompanyDpAccountResponse
*/
@Parcelize
data class CompanyDpAccountResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DpAccountFailureResponse
*/
@Parcelize
data class DpAccountFailureResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
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
    Model: CompanyDpAccountListResponse
*/
@Parcelize
data class CompanyDpAccountListResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<Dp1>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DpRulesUpdateRequest
*/
@Parcelize
data class DpRulesUpdateRequest(
    
    
    
    @SerializedName("conditions")
    var conditions: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("dp_ids")
    var dpIds: @RawValue HashMap<String,HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DpRuleResponse
*/
@Parcelize
data class DpRuleResponse(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("conditions")
    var conditions: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("dp_ids")
    var dpIds: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DpRuleUpdateSuccessResponse
*/
@Parcelize
data class DpRuleUpdateSuccessResponse(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: DpRuleResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FailureResponse
*/
@Parcelize
data class FailureResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("error")
    var error: ArrayList<ErrorResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DpSchemaInRuleListing
*/
@Parcelize
data class DpSchemaInRuleListing(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("plan_rules")
    var planRules: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stage")
    var stage: String?=null,
    
    @SerializedName("account_id")
    var accountId: String?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("is_self_ship")
    var isSelfShip: Boolean?=null,
    
    @SerializedName("plan_id")
    var planId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DpRule
*/
@Parcelize
data class DpRule(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("conditions")
    var conditions: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("dp_ids")
    var dpIds: HashMap<String,DpSchemaInRuleListing>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DpRuleSuccessResponse
*/
@Parcelize
data class DpRuleSuccessResponse(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: DpRule?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DpIds
*/
@Parcelize
data class DpIds(
    
    
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DpRuleRequest
*/
@Parcelize
data class DpRuleRequest(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("conditions")
    var conditions: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("dp_ids")
    var dpIds: HashMap<String,DpIds>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DpMultipleRuleSuccessResponse
*/
@Parcelize
data class DpMultipleRuleSuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<DpRule>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DPCompanyRuleRequest
*/
@Parcelize
data class DPCompanyRuleRequest(
    
    
    
    @SerializedName("rule_ids")
    var ruleIds: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DPCompanyRuleResponse
*/
@Parcelize
data class DPCompanyRuleResponse(
    
    
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<DpRuleResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DPApplicationRuleRequest
*/
@Parcelize
data class DPApplicationRuleRequest(
    
    
    
    @SerializedName("shipping_rules")
    var shippingRules: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DPApplicationRuleResponse
*/
@Parcelize
data class DPApplicationRuleResponse(
    
    
    
    @SerializedName("status_code")
    var statusCode: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<DpRuleResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SelfShipResponse
*/
@Parcelize
data class SelfShipResponse(
    
    
    
    @SerializedName("tat")
    var tat: Double?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationSelfShipConfig
*/
@Parcelize
data class ApplicationSelfShipConfig(
    
    
    
    @SerializedName("self_ship")
    var selfShip: SelfShipResponse?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationSelfShipConfigResponse
*/
@Parcelize
data class ApplicationSelfShipConfigResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ApplicationSelfShipConfig?=null,
    
    @SerializedName("error")
    var error: ServiceabilityErrorResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



