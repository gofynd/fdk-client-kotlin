package com.sdk.application.logistic

import com.sdk.application.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: GetStoreResponse
*/
@Parcelize
data class GetStoreResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<StoreItemResponse>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreItemResponse
*/
@Parcelize
data class StoreItemResponse(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("processing_time")
    var processingTime: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidateAddressRequest
*/
@Parcelize
data class ValidateAddressRequest(
    
    
    
    @SerializedName("address")
    var address: String?=null,
    
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
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeParentsResponse
*/
@Parcelize
data class PincodeParentsResponse(
    
    
    
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
    Model: PincodeMetaResponse
*/
@Parcelize
data class PincodeMetaResponse(
    
    
    
    @SerializedName("zone")
    var zone: String?=null,
    
    @SerializedName("internal_zone_id")
    var internalZoneId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeErrorSchemaResponse
*/
@Parcelize
data class PincodeErrorSchemaResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryMetaResponse
*/
@Parcelize
data class CountryMetaResponse(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("isd_code")
    var isdCode: String?=null
    
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
    var coordinates: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeDataResponse
*/
@Parcelize
data class PincodeDataResponse(
    
    
    
    @SerializedName("parents")
    var parents: ArrayList<PincodeParentsResponse>?=null,
    
    @SerializedName("meta")
    var meta: PincodeMetaResponse?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResponse?=null,
    
    @SerializedName("meta_code")
    var metaCode: CountryMetaResponse?=null,
    
    @SerializedName("lat_long")
    var latLong: PincodeLatLongData?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeApiResponse
*/
@Parcelize
data class PincodeApiResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeDataResponse>?=null,
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATCategoryRequest
*/
@Parcelize
data class TATCategoryRequest(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TATArticlesRequest
*/
@Parcelize
data class TATArticlesRequest(
    
    
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATLocationDetailsRequest
*/
@Parcelize
data class TATLocationDetailsRequest(
    
    
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<TATArticlesRequest>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATViewRequest
*/
@Parcelize
data class TATViewRequest(
    
    
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<TATLocationDetailsRequest>?=null,
    
    @SerializedName("journey")
    var journey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATErrorSchemaResponse
*/
@Parcelize
data class TATErrorSchemaResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATTimestampResponse
*/
@Parcelize
data class TATTimestampResponse(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TATFormattedResponse
*/
@Parcelize
data class TATFormattedResponse(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TATPromiseResponse
*/
@Parcelize
data class TATPromiseResponse(
    
    
    
    @SerializedName("timestamp")
    var timestamp: TATTimestampResponse?=null,
    
    @SerializedName("formatted")
    var formatted: TATFormattedResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TATArticlesResponse
*/
@Parcelize
data class TATArticlesResponse(
    
    
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("error")
    var error: TATErrorSchemaResponse?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("promise")
    var promise: TATPromiseResponse?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null,
    
    @SerializedName("_manufacturing_time_seconds")
    var manufacturingTimeSeconds: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATLocationDetailsResponse
*/
@Parcelize
data class TATLocationDetailsResponse(
    
    
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<TATArticlesResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATViewResponse
*/
@Parcelize
data class TATViewResponse(
    
    
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: TATErrorSchemaResponse?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    
    @SerializedName("to_city")
    var toCity: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<TATLocationDetailsResponse>?=null,
    
    @SerializedName("journey")
    var journey: String?=null
    
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
    Model: LogisticsResponse
*/
@Parcelize
data class LogisticsResponse(
    
    
    
    @SerializedName("dp")
    var dp: HashMap<String,DP>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CountryEntityResponse
*/
@Parcelize
data class CountryEntityResponse(
    
    
    
    @SerializedName("meta")
    var meta: CountryMetaResponse?=null,
    
    @SerializedName("logistics")
    var logistics: LogisticsResponse?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("parent_id")
    var parentId: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryListResponse
*/
@Parcelize
data class CountryListResponse(
    
    
    
    @SerializedName("results")
    var results: ArrayList<CountryEntityResponse>?=null
    
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
    Model: ReAssignStoreRequest
*/
@Parcelize
data class ReAssignStoreRequest(
    
    
    
    @SerializedName("configuration")
    var configuration: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("ignored_locations")
    var ignoredLocations: ArrayList<Int>?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReAssignStoreResponse
*/
@Parcelize
data class ReAssignStoreResponse(
    
    
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("pystormbreaker_uuid")
    var pystormbreakerUuid: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("assigned_stores")
    var assignedStores: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CountryHierarchy
*/
@Parcelize
data class CountryHierarchy(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
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
    Model: CountryObject
*/
@Parcelize
data class CountryObject(
    
    
    
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
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCountries
*/
@Parcelize
data class GetCountries(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CountryObject>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetOneOrAllPath
*/
@Parcelize
data class GetOneOrAllPath(
    
    
    
    @SerializedName("locality_type")
    var localityType: String?=null,
    
    @SerializedName("locality_value")
    var localityValue: String?=null
    
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
    Model: GetCountry
*/
@Parcelize
data class GetCountry(
    
    
    
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
    var type: String?=null,
    
    @SerializedName("localities")
    var localities: ArrayList<LocalityParent>?=null
    
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
    Model: GetLocality
*/
@Parcelize
data class GetLocality(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("parent_ids")
    var parentIds: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("localities")
    var localities: ArrayList<LocalityParent>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}





