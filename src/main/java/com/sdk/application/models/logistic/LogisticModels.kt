package com.sdk.application.models.logistic

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
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
    Model: PincodeMetaResponse
*/
@Parcelize
data class PincodeMetaResponse(
    
    
    
    @SerializedName("internal_zone_id")
    var internalZoneId: Int?=null,
    
    @SerializedName("zone")
    var zone: String?=null,
    
    @SerializedName("deliverables")
    var deliverables: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeParentsResponse
*/
@Parcelize
data class PincodeParentsResponse(
    
    
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeDataResponse
*/
@Parcelize
data class PincodeDataResponse(
    
    
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResponse?=null,
    
    @SerializedName("meta")
    var meta: PincodeMetaResponse?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("parents")
    var parents: ArrayList<PincodeParentsResponse>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeApiResponse
*/
@Parcelize
data class PincodeApiResponse(
    
    
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResponse?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeDataResponse>?=null,
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null
    
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
    
    
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATLocationDetailsRequest
*/
@Parcelize
data class TATLocationDetailsRequest(
    
    
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<TATArticlesRequest>?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATViewRequest
*/
@Parcelize
data class TATViewRequest(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
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
    Model: TATFormattedResponse
*/
@Parcelize
data class TATFormattedResponse(
    
    
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("min")
    var min: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TATTimestampResponse
*/
@Parcelize
data class TATTimestampResponse(
    
    
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
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
    
    
    
    @SerializedName("promise")
    var promise: TATPromiseResponse?=null,
    
    @SerializedName("error")
    var error: TATErrorSchemaResponse?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("_manufacturing_time_seconds")
    var manufacturingTimeSeconds: Int?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATLocationDetailsResponse
*/
@Parcelize
data class TATLocationDetailsResponse(
    
    
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<TATArticlesResponse>?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATViewResponse
*/
@Parcelize
data class TATViewResponse(
    
    
    
    @SerializedName("error")
    var error: TATErrorSchemaResponse?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("to_city")
    var toCity: String?=null,
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<TATLocationDetailsResponse>?=null,
    
    @SerializedName("journey")
    var journey: String?=null
    
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



