package com.sdk.application.models.communication

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: CommunicationConsentReq
*/
@Parcelize
data class CommunicationConsentReq(
    
    
    
    @SerializedName("response")
    var response: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("channel")
    var channel: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CommunicationConsentRes
*/
@Parcelize
data class CommunicationConsentRes(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("channels")
    var channels: CommunicationConsentChannels?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CommunicationConsentChannelsEmail
*/
@Parcelize
data class CommunicationConsentChannelsEmail(
    
    
    
    @SerializedName("response")
    var response: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CommunicationConsentChannelsSms
*/
@Parcelize
data class CommunicationConsentChannelsSms(
    
    
    
    @SerializedName("response")
    var response: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CommunicationConsentChannelsWhatsapp
*/
@Parcelize
data class CommunicationConsentChannelsWhatsapp(
    
    
    
    @SerializedName("response")
    var response: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CommunicationConsentChannels
*/
@Parcelize
data class CommunicationConsentChannels(
    
    
    
    @SerializedName("email")
    var email: CommunicationConsentChannelsEmail?=null,
    
    @SerializedName("sms")
    var sms: CommunicationConsentChannelsSms?=null,
    
    @SerializedName("whatsapp")
    var whatsapp: CommunicationConsentChannelsWhatsapp?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CommunicationConsent
*/
@Parcelize
data class CommunicationConsent(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("channels")
    var channels: CommunicationConsentChannels?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BadRequestSchema
*/
@Parcelize
data class BadRequestSchema(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: NotFound
*/
@Parcelize
data class NotFound(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PushtokenReq
*/
@Parcelize
data class PushtokenReq(
    
    
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("bundle_identifier")
    var bundleIdentifier: String?=null,
    
    @SerializedName("push_token")
    var pushToken: String?=null,
    
    @SerializedName("unique_device_id")
    var uniqueDeviceId: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PushtokenRes
*/
@Parcelize
data class PushtokenRes(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("bundle_identifier")
    var bundleIdentifier: String?=null,
    
    @SerializedName("push_token")
    var pushToken: String?=null,
    
    @SerializedName("unique_device_id")
    var uniqueDeviceId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("expired_at")
    var expiredAt: String?=null
    
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



