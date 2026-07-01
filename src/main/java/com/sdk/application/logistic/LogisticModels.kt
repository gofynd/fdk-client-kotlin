package com.sdk.application.logistic

import com.sdk.application.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: FulfillmentOptionsList
*/
@Parcelize
data class FulfillmentOptionsList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<FulfillmentOptionItem>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateAddressDetails
*/
@Parcelize
data class ValidateAddressDetails(
    
    
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("address_meta")
    var addressMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeDetailsResult
*/
@Parcelize
data class PincodeDetailsResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeData>?=null,
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResult?=null,
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryResult
*/
@Parcelize
data class CountryResult(
    
    
    
    @SerializedName("results")
    var results: ArrayList<CountryEntity>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetCountries
*/
@Parcelize
data class GetCountries(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetCountriesItems>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountry
*/
@Parcelize
data class GetCountry(
    
    
    
    @SerializedName("meta")
    var meta: CountryMetaFields?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("timezones")
    var timezones: ArrayList<String>?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<CountryHierarchy>?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null,
    
    @SerializedName("longitude")
    var longitude: String?=null,
    
    @SerializedName("currency")
    var currency: CurrencyObject?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("fields")
    var fields: GetCountryFields?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetLocalitiesApp
*/
@Parcelize
data class GetLocalitiesApp(
    
    
    
    @SerializedName("items")
    var items: ArrayList<LocalitiesApp>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetLocalityApp
*/
@Parcelize
data class GetLocalityApp(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null,
    
    @SerializedName("serviceability")
    var serviceability: @RawValue Any?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_ids")
    var parentIds: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("localities")
    var localities: ArrayList<LocalityParent>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResult
*/
@Parcelize
data class ErrorResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: Error?=null
    
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
    var shipments: ArrayList<CPShipments>?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null
    
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
    var shipments: ArrayList<ShipmentCourierPartners>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: CourierPartnerPromise?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetPromiseDetails
*/
@Parcelize
data class GetPromiseDetails(
    
    
    
    @SerializedName("items")
    var items: ArrayList<StorePromise>?=null,
    
    @SerializedName("promise")
    var promise: Promise?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResultApp
*/
@Parcelize
data class ErrorResultApp(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("error")
    var error: String?=null
    
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



             
/*
    Model: FulfillmentOptionItem
*/
@Parcelize
data class FulfillmentOptionItem(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeData
*/
@Parcelize
data class PincodeData(
    
    
    
    @SerializedName("parents")
    var parents: ArrayList<PincodeParentsResult>?=null,
    
    @SerializedName("meta")
    var meta: PincodeMetaResult?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResult?=null,
    
    @SerializedName("meta_code")
    var metaCode: CountryMeta?=null,
    
    @SerializedName("lat_long")
    var latLong: PincodesLatLongData?=null,
    
    @SerializedName("localities")
    var localities: ArrayList<LocalityParent>?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeParentsResult
*/
@Parcelize
data class PincodeParentsResult(
    
    
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeMetaResult
*/
@Parcelize
data class PincodeMetaResult(
    
    
    
    @SerializedName("zone")
    var zone: String?=null,
    
    @SerializedName("internal_zone_id")
    var internalZoneId: Int?=null,
    
    @SerializedName("deliverables")
    var deliverables: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeErrorSchemaResult
*/
@Parcelize
data class PincodeErrorSchemaResult(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryMeta
*/
@Parcelize
data class CountryMeta(
    
    
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("currency")
    var currency: CurrencyObject?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("parent_id")
    var parentId: String?=null,
    
    @SerializedName("zone")
    var zone: String?=null,
    
    @SerializedName("deliverables")
    var deliverables: ArrayList<String>?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<CountryHierarchy>?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null,
    
    @SerializedName("longitude")
    var longitude: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("isd_code")
    var isdCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CurrencyObject
*/
@Parcelize
data class CurrencyObject(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryHierarchy
*/
@Parcelize
data class CountryHierarchy(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodesLatLongData
*/
@Parcelize
data class PincodesLatLongData(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocalityParent
*/
@Parcelize
data class LocalityParent(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_ids")
    var parentIds: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("serviceability")
    var serviceability: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("currency")
    var currency: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null,
    
    @SerializedName("longitude")
    var longitude: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryEntity
*/
@Parcelize
data class CountryEntity(
    
    
    
    @SerializedName("meta")
    var meta: CountryMeta?=null,
    
    @SerializedName("logistics")
    var logistics: LogisticsResult?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("parent_id")
    var parentId: ArrayList<String>?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("onboarding_allowed")
    var onboardingAllowed: Boolean?=null,
    
    @SerializedName("serviceability")
    var serviceability: @RawValue Any?=null,
    
    @SerializedName("lat_long")
    var latLong: PincodeLatLongData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticsResult
*/
@Parcelize
data class LogisticsResult(
    
    
    
    @SerializedName("dp")
    var dp: HashMap<String,DP>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DP
*/
@Parcelize
data class DP(
    
    
    
    @SerializedName("fm_priority")
    var fmPriority: Int?=null,
    
    @SerializedName("lm_priority")
    var lmPriority: Int?=null,
    
    @SerializedName("rvp_priority")
    var rvpPriority: Int?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("operations")
    var operations: ArrayList<String>?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null,
    
    @SerializedName("internal_account_id")
    var internalAccountId: String?=null,
    
    @SerializedName("external_account_id")
    var externalAccountId: String?=null,
    
    @SerializedName("transport_mode")
    var transportMode: String?=null
    
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
    
    @SerializedName("is_reverse_pickup")
    var isReversePickup: Boolean?=null,
    
    @SerializedName("is_return")
    var isReturn: Boolean?=null,
    
    @SerializedName("is_installation")
    var isInstallation: Boolean?=null,
    
    @SerializedName("is_last_mile")
    var isLastMile: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeLatLongData
*/
@Parcelize
data class PincodeLatLongData(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountriesItems
*/
@Parcelize
data class GetCountriesItems(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("timezones")
    var timezones: ArrayList<String>?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<HierarchyItems>?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("currency")
    var currency: CurrencyObject?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null,
    
    @SerializedName("longitude")
    var longitude: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("has_next_hierarchy")
    var hasNextHierarchy: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HierarchyItems
*/
@Parcelize
data class HierarchyItems(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
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
    var size: Int?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryMetaFields
*/
@Parcelize
data class CountryMetaFields(
    
    
    
    @SerializedName("application_fields")
    var applicationFields: ApplicationFields?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationFields
*/
@Parcelize
data class ApplicationFields(
    
    
    
    @SerializedName("address")
    var address: ArrayList<GetCountryFieldsAddress>?=null,
    
    @SerializedName("serviceability_fields")
    var serviceabilityFields: ArrayList<String>?=null,
    
    @SerializedName("address_template")
    var addressTemplate: GetCountryFieldsAddressTemplateApplication?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountryFieldsAddress
*/
@Parcelize
data class GetCountryFieldsAddress(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("edit")
    var edit: Boolean?=null,
    
    @SerializedName("input")
    var input: String?=null,
    
    @SerializedName("validation")
    var validation: FieldValidation?=null,
    
    @SerializedName("values")
    var values: GetCountryFieldsAddressValues?=null,
    
    @SerializedName("error_text")
    var errorText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FieldValidation
*/
@Parcelize
data class FieldValidation(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("regex")
    var regex: FieldValidationRegex?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FieldValidationRegex
*/
@Parcelize
data class FieldValidationRegex(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("length")
    var length: LengthValidation?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LengthValidation
*/
@Parcelize
data class LengthValidation(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountryFieldsAddressValues
*/
@Parcelize
data class GetCountryFieldsAddressValues(
    
    
    
    @SerializedName("get_one")
    var getOne: GetOneOrAll?=null,
    
    @SerializedName("get_all")
    var getAll: GetOneOrAll?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetOneOrAll
*/
@Parcelize
data class GetOneOrAll(
    
    
    
    @SerializedName("operation_id")
    var operationId: String?=null,
    
    @SerializedName("params")
    var params: GetOneOrAllParams?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetOneOrAllParams
*/
@Parcelize
data class GetOneOrAllParams(
    
    
    
    @SerializedName("path")
    var path: GetOneOrAllPath?=null,
    
    @SerializedName("query")
    var query: GetOneOrAllQuery?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetOneOrAllPath
*/
@Parcelize
data class GetOneOrAllPath(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetOneOrAllQuery
*/
@Parcelize
data class GetOneOrAllQuery(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountryFieldsAddressTemplateApplication
*/
@Parcelize
data class GetCountryFieldsAddressTemplateApplication(
    
    
    
    @SerializedName("checkout_form")
    var checkoutForm: String?=null,
    
    @SerializedName("store_os_form")
    var storeOsForm: String?=null,
    
    @SerializedName("default_display")
    var defaultDisplay: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountryFields
*/
@Parcelize
data class GetCountryFields(
    
    
    
    @SerializedName("address")
    var address: ArrayList<GetCountryFieldsAddress>?=null,
    
    @SerializedName("serviceability_fields")
    var serviceabilityFields: ArrayList<String>?=null,
    
    @SerializedName("address_template")
    var addressTemplate: GetCountryFieldsAddressTemplate?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountryFieldsAddressTemplate
*/
@Parcelize
data class GetCountryFieldsAddressTemplate(
    
    
    
    @SerializedName("checkout_form")
    var checkoutForm: String?=null,
    
    @SerializedName("store_os_form")
    var storeOsForm: String?=null,
    
    @SerializedName("default_display")
    var defaultDisplay: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocalitiesApp
*/
@Parcelize
data class LocalitiesApp(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("parent_ids")
    var parentIds: ArrayList<String>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("lat_long")
    var latLong: PincodeLatLongData?=null,
    
    @SerializedName("parent_uid")
    var parentUid: String?=null,
    
    @SerializedName("localities")
    var localities: ArrayList<LocalityParent>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("currency")
    var currency: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("latitude")
    var latitude: String?=null,
    
    @SerializedName("longitude")
    var longitude: String?=null
    
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
    Model: CPShipments
*/
@Parcelize
data class CPShipments(
    
    
    
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
    
    @SerializedName("location_type")
    var locationType: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ShipmentsArticles>?=null
    
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
    var width: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentsArticles
*/
@Parcelize
data class ShipmentsArticles(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("sla")
    var sla: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("weight")
    var weight: ArticleWeight?=null,
    
    @SerializedName("attributes")
    var attributes: ArticleAttributes?=null,
    
    @SerializedName("category_id")
    var categoryId: Int?=null,
    
    @SerializedName("department_id")
    var departmentId: Int?=null,
    
    @SerializedName("dimension")
    var dimension: ArticleDimension?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("mto_quantity")
    var mtoQuantity: Int?=null,
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("set")
    var set: ArticleSet?=null,
    
    @SerializedName("set_quantity")
    var setQuantity: Int?=null,
    
    @SerializedName("delivery_slots")
    var deliverySlots: ArticleDeliverySlots?=null,
    
    @SerializedName("return_reason")
    var returnReason: ArticleReturnReason?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleWeight
*/
@Parcelize
data class ArticleWeight(
    
    
    
    @SerializedName("shipping")
    var shipping: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAttributes
*/
@Parcelize
data class ArticleAttributes(
    
    
    
    @SerializedName("battery_operated")
    var batteryOperated: String?=null,
    
    @SerializedName("is_flammable")
    var isFlammable: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleDimension
*/
@Parcelize
data class ArticleDimension(
    
    
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("width")
    var width: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleSet
*/
@Parcelize
data class ArticleSet(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size_distribution")
    var sizeDistribution: ArticleSizeDistribution?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleSizeDistribution
*/
@Parcelize
data class ArticleSizeDistribution(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<SetSize>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SetSize
*/
@Parcelize
data class SetSize(
    
    
    
    @SerializedName("pieces")
    var pieces: Int?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleDeliverySlots
*/
@Parcelize
data class ArticleDeliverySlots(
    
    
    
    @SerializedName("delivery_date")
    var deliveryDate: String?=null,
    
    @SerializedName("min_slot")
    var minSlot: String?=null,
    
    @SerializedName("max_slot")
    var maxSlot: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleReturnReason
*/
@Parcelize
data class ArticleReturnReason(
    
    
    
    @SerializedName("qc_type")
    var qcType: ArrayList<String>?=null
    
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
    Model: CourierPartnerPromise
*/
@Parcelize
data class CourierPartnerPromise(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("attributes")
    var attributes: CourierPartnerAttributes?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CourierPartnerAttributes
*/
@Parcelize
data class CourierPartnerAttributes(
    
    
    
    @SerializedName("tat")
    var tat: CourierPartnerTAT?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CourierPartnerTAT
*/
@Parcelize
data class CourierPartnerTAT(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
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
    var courierPartners: ArrayList<CourierPartners>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: CourierPartnerPromise?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StorePromise
*/
@Parcelize
data class StorePromise(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("promise")
    var promise: Promise?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Promise
*/
@Parcelize
data class Promise(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionStores
*/
@Parcelize
data class FulfillmentOptionStores(
    
    
    
    @SerializedName("items")
    var items: ArrayList<FulfillmentOptionStore>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FulfillmentOptionStore
*/
@Parcelize
data class FulfillmentOptionStore(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("address")
    var address: Address?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("avg_order_processing_time")
    var avgOrderProcessingTime: Int?=null,
    
    @SerializedName("timezone")
    var timezone: String?=null,
    
    @SerializedName("holiday_list")
    var holidayList: ArrayList<ArrayList<String>>?=null,
    
    @SerializedName("customfields")
    var customfields: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_open")
    var isOpen: Boolean?=null,
    
    @SerializedName("promise_customfields")
    var promiseCustomfields: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("distance")
    var distance: StoreDistance?=null,
    
    @SerializedName("timing")
    var timing: StoreTimingDetails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Address
*/
@Parcelize
data class Address(
    
    
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("postal_code")
    var postalCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("lat_long")
    var latLong: LatLong?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LatLong
*/
@Parcelize
data class LatLong(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDistance
*/
@Parcelize
data class StoreDistance(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreTimingDetails
*/
@Parcelize
data class StoreTimingDetails(
    
    
    
    @SerializedName("operational_timing")
    var operationalTiming: ArrayList<StoreTiming>?=null,
    
    @SerializedName("order_acceptance_timing")
    var orderAcceptanceTiming: ArrayList<StoreTiming>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreTiming
*/
@Parcelize
data class StoreTiming(
    
    
    
    @SerializedName("weekday")
    var weekday: String?=null,
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("opening")
    var opening: Time?=null,
    
    @SerializedName("closing")
    var closing: Time?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Time
*/
@Parcelize
data class Time(
    
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}





