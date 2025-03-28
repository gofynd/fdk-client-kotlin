package com.sdk.application.communication

import com.sdk.application.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
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
    Model: OtpConfigurationExpiryDuration
*/
@Parcelize
data class OtpConfigurationExpiryDuration(
    
    
    
    @SerializedName("time")
    var time: Double?=null,
    
    @SerializedName("denomination")
    var denomination: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OtpConfigurationExpiry
*/
@Parcelize
data class OtpConfigurationExpiry(
    
    
    
    @SerializedName("duration")
    var duration: OtpConfigurationExpiryDuration?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OtpConfigurationRateLimit
*/
@Parcelize
data class OtpConfigurationRateLimit(
    
    
    
    @SerializedName("duration")
    var duration: Double?=null,
    
    @SerializedName("limit")
    var limit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OtpConfiguration
*/
@Parcelize
data class OtpConfiguration(
    
    
    
    @SerializedName("otp_length")
    var otpLength: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("expiry")
    var expiry: OtpConfigurationExpiry?=null,
    
    @SerializedName("rate_limit")
    var rateLimit: OtpConfigurationRateLimit?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}





