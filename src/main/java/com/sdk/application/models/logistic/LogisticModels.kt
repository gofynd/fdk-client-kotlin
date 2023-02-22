package com.sdk.application.models.logistic

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

/*
    Model: PincodeLatLongData
*/
@Parcelize
data class PincodeLatLongData(
    
    
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PincodeParentsResponse
*/
@Parcelize
data class PincodeParentsResponse(
    
    
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
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
    Model: CountryMetaResponse
*/
@Parcelize
data class CountryMetaResponse(
    
    
    
    @SerializedName("isd_code")
    var isdCode: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
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
    Model: PincodeDataResponse
*/
@Parcelize
data class PincodeDataResponse(
    
    
    
    @SerializedName("lat_long")
    var latLong: PincodeLatLongData?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("parents")
    var parents: ArrayList<PincodeParentsResponse>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("meta")
    var meta: PincodeMetaResponse?=null,
    
    @SerializedName("meta_code")
    var metaCode: CountryMetaResponse?=null,
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResponse?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PincodeApiResponse
*/
@Parcelize
data class PincodeApiResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<PincodeDataResponse>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATCategoryRequest
*/
@Parcelize
data class TATCategoryRequest(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TATArticlesRequest
*/
@Parcelize
data class TATArticlesRequest(
    
    
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATLocationDetailsRequest
*/
@Parcelize
data class TATLocationDetailsRequest(
    
    
    
    @SerializedName("articles")
    var articles: ArrayList<TATArticlesRequest>?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATViewRequest
*/
@Parcelize
data class TATViewRequest(
    
    
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<TATLocationDetailsRequest>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null
    
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
    Model: TATPromiseResponse
*/
@Parcelize
data class TATPromiseResponse(
    
    
    
    @SerializedName("formatted")
    var formatted: TATFormattedResponse?=null,
    
    @SerializedName("timestamp")
    var timestamp: TATTimestampResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TATArticlesResponse
*/
@Parcelize
data class TATArticlesResponse(
    
    
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("promise")
    var promise: TATPromiseResponse?=null,
    
    @SerializedName("_manufacturing_time_seconds")
    var manufacturingTimeSeconds: Int?=null,
    
    @SerializedName("error")
    var error: TATErrorSchemaResponse?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATLocationDetailsResponse
*/
@Parcelize
data class TATLocationDetailsResponse(
    
    
    
    @SerializedName("articles")
    var articles: ArrayList<TATArticlesResponse>?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATViewResponse
*/
@Parcelize
data class TATViewResponse(
    
    
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("error")
    var error: TATErrorSchemaResponse?=null,
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<TATLocationDetailsResponse>?=null,
    
    @SerializedName("to_city")
    var toCity: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SubtypeRequest
*/
@Parcelize
data class SubtypeRequest(
    
    
    
    @SerializedName("sub_type")
    var subType: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: EntityListRequest
*/
@Parcelize
data class EntityListRequest(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<SubtypeRequest>?=null
    
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
    Model: PincodeEntityResponse
*/
@Parcelize
data class PincodeEntityResponse(
    
    
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_sname")
    var displaySname: String?=null,
    
    @SerializedName("logistics")
    var logistics: LogisticsResponse?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("parents")
    var parents: ArrayList<PincodeParentsResponse>?=null,
    
    @SerializedName("meta")
    var meta: CountryMetaResponse?=null,
    
    @SerializedName("parent_id")
    var parentId: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EntityListResponse
*/
@Parcelize
data class EntityListResponse(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("results")
    var results: ArrayList<PincodeEntityResponse>?=null
    
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
    Model: AssignStoreRequest
*/
@Parcelize
data class AssignStoreRequest(
    
    
    
    @SerializedName("application_config")
    var applicationConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("customer_details")
    var customerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("extension_config")
    var extensionConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AssignStoreResponse
*/
@Parcelize
data class AssignStoreResponse(
    
    
    
    @SerializedName("customer_details")
    var customerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store")
    var store: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    
    @SerializedName("pystormbreaker_uuid")
    var pystormbreakerUuid: String?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("assigned_stores")
    var assignedStores: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("company")
    var company: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("article")
    var article: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


