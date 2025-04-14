package com.sdk.application.finance

import com.sdk.application.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: CustomerCreditBalanceRequestSchema
*/
@Parcelize
data class CustomerCreditBalanceRequestSchema(
    
    
    
    @SerializedName("data")
    var data: CustomerCreditBalanceReqData?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CustomerCreditBalanceReqData
*/
@Parcelize
data class CustomerCreditBalanceReqData(
    
    
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("customer_mobile_number")
    var customerMobileNumber: String?=null,
    
    @SerializedName("customer_email")
    var customerEmail: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerCreditBalanceResponseSchema
*/
@Parcelize
data class CustomerCreditBalanceResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: CustomerCreditBalanceResData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerCreditBalanceResData
*/
@Parcelize
data class CustomerCreditBalanceResData(
    
    
    
    @SerializedName("customer_mobile_number")
    var customerMobileNumber: String?=null,
    
    @SerializedName("customer_email")
    var customerEmail: String?=null,
    
    @SerializedName("total_credited_balance")
    var totalCreditedBalance: Double?=null,
    
    @SerializedName("total_locked_amount")
    var totalLockedAmount: Double?=null,
    
    @SerializedName("allowed_redemption_amount")
    var allowedRedemptionAmount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("meta")
    var meta: ErrorMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorMeta
*/
@Parcelize
data class ErrorMeta(
    
    
    
    @SerializedName("columns_errors")
    var columnsErrors: ArrayList<ErrorMetaItems>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ErrorMetaItems
*/
@Parcelize
data class ErrorMetaItems(
    
    
    
    @SerializedName("code")
    var code: Int?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LockUnlockRequestData
*/
@Parcelize
data class LockUnlockRequestData(
    
    
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("affiliate_id")
    var affiliateId: String?=null,
    
    @SerializedName("ordering_channel")
    var orderingChannel: String?=null,
    
    @SerializedName("credit_note_number")
    var creditNoteNumber: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("request_type")
    var requestType: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LockUnlockRequestSchema
*/
@Parcelize
data class LockUnlockRequestSchema(
    
    
    
    @SerializedName("data")
    var data: LockUnlockRequestData?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: LockUnlockResponseData
*/
@Parcelize
data class LockUnlockResponseData(
    
    
    
    @SerializedName("credit_note_number")
    var creditNoteNumber: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LockUnlockResponseSchema
*/
@Parcelize
data class LockUnlockResponseSchema(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: LockUnlockResponseData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}





