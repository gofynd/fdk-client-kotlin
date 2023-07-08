package com.sdk.application.models.logistic

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: GetPincodeCityResponse
*/
@Parcelize
data class GetPincodeCityResponse(
    
    
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<LogisticPincodeData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticPincodeData
*/
@Parcelize
data class LogisticPincodeData(
    
    
    
    @SerializedName("meta")
    var meta: LogisticMeta?=null,
    
    @SerializedName("parents")
    var parents: ArrayList<LogisticParents>?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("error")
    var error: LogisticError?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticMeta
*/
@Parcelize
data class LogisticMeta(
    
    
    
    @SerializedName("zone")
    var zone: String?=null,
    
    @SerializedName("deliverables")
    var deliverables: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticParents
*/
@Parcelize
data class LogisticParents(
    
    
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticError
*/
@Parcelize
data class LogisticError(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetPincodeZonesReqBody
*/
@Parcelize
data class GetPincodeZonesReqBody(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetPincodeZonesResponse
*/
@Parcelize
data class GetPincodeZonesResponse(
    
    
    
    @SerializedName("zones")
    var zones: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetTatProductReqBody
*/
@Parcelize
data class GetTatProductReqBody(
    
    
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<LocationDetailsReq>?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationDetailsReq
*/
@Parcelize
data class LocationDetailsReq(
    
    
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<TatReqProductArticles>?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TatReqProductArticles
*/
@Parcelize
data class TatReqProductArticles(
    
    
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("category")
    var category: LogisticRequestCategory?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticRequestCategory
*/
@Parcelize
data class LogisticRequestCategory(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetTatProductResponse
*/
@Parcelize
data class GetTatProductResponse(
    
    
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<LocationDetails>?=null,
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("to_city")
    var toCity: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("journey")
    var journey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationDetails
*/
@Parcelize
data class LocationDetails(
    
    
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<TatProductArticles>?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TatProductArticles
*/
@Parcelize
data class TatProductArticles(
    
    
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("category")
    var category: LogisticResponseCategory?=null,
    
    @SerializedName("promise")
    var promise: LogisticPromise?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticResponseCategory
*/
@Parcelize
data class LogisticResponseCategory(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticPromise
*/
@Parcelize
data class LogisticPromise(
    
    
    
    @SerializedName("timestamp")
    var timestamp: LogisticTimestamp?=null,
    
    @SerializedName("formatted")
    var formatted: Formatted?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LogisticTimestamp
*/
@Parcelize
data class LogisticTimestamp(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Formatted
*/
@Parcelize
data class Formatted(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApefaceApiError
*/
@Parcelize
data class ApefaceApiError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



