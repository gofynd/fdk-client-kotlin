package com.sdk.application.models.logistic

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: PincodeErrorSchemaResponse
*/
@Parcelize
data class PincodeErrorSchemaResponse(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeParentsResponse
*/
@Parcelize
data class PincodeParentsResponse(
    
    
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
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
    var zone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PincodeDataResponse
*/
@Parcelize
data class PincodeDataResponse(
    
    
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResponse?=null,
    
    @SerializedName("parents")
    var parents: ArrayList<PincodeParentsResponse>?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: PincodeMetaResponse?=null,
    
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeDataResponse>?=null
    
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
    
    @SerializedName("available_quantity")
    var availableQuantity: Int?=null,
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null
    
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
    
    
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<TATLocationDetailsRequest>?=null,
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TATErrorSchemaResponse
*/
@Parcelize
data class TATErrorSchemaResponse(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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
    
    
    
    @SerializedName("error")
    var error: TATErrorSchemaResponse?=null,
    
    @SerializedName("_manufacturing_time_seconds")
    var manufacturingTimeSeconds: Int?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("promise")
    var promise: TATPromiseResponse?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null
    
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
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("to_city")
    var toCity: String?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<TATLocationDetailsResponse>?=null,
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    
    @SerializedName("source")
    var source: String?=null
    
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



