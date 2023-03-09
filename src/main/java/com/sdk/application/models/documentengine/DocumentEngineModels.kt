package com.sdk.application.models.documentengine

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: creditNoteParameter
*/
@Parcelize
data class creditNoteParameter(
    
    
    
    @SerializedName("expires_in")
    var expiresIn: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: invoiceParameter
*/
@Parcelize
data class invoiceParameter(
    
    
    
    @SerializedName("document_type")
    var documentType: String?=null,
    
    @SerializedName("expires_in")
    var expiresIn: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ResponseGetInvoiceShipment
*/
@Parcelize
data class ResponseGetInvoiceShipment(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("presigned_type")
    var presignedType: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("presigned_url")
    var presignedUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: getInvoiceByShipmentId400Response
*/
@Parcelize
data class getInvoiceByShipmentId400Response(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: getInvoiceByShipmentId500Response
*/
@Parcelize
data class getInvoiceByShipmentId500Response(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("presigned_type")
    var presignedType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ReqBodyPresignedPOST
*/
@Parcelize
data class ReqBodyPresignedPOST(
    
    
    
    @SerializedName("event")
    var event: String?=null,
    
    @SerializedName("media_type")
    var mediaType: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("expires_in")
    var expiresIn: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ResponsePresignedGETURL
*/
@Parcelize
data class ResponsePresignedGETURL(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("presigned_type")
    var presignedType: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("presigned_url")
    var presignedUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponsePresignedUrl
*/
@Parcelize
data class ErrorResponsePresignedUrl(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



