package com.sdk.application.models.communication

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



             
/*
    Model: GenericPage
*/
@Parcelize
data class GenericPage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenericSuccess
*/
@Parcelize
data class GenericSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GenericError
*/
@Parcelize
data class GenericError(
    
    
    
    @SerializedName("message")
    var message: Message?=null,
    
    @SerializedName("sentry")
    var sentry: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GenericDelete
*/
@Parcelize
data class GenericDelete(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("acknowledged")
    var acknowledged: Boolean?=null,
    
    @SerializedName("affected")
    var affected: Int?=null,
    
    @SerializedName("operation")
    var operation: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Message
*/
@Parcelize
data class Message(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("operation")
    var operation: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EnabledObj
*/
@Parcelize
data class EnabledObj(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InvalidRangeErrorReqPositive
*/
@Parcelize
data class InvalidRangeErrorReqPositive(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: Int?=null,
    
    @SerializedName("sentry")
    var sentry: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvalidInputRequiredByteOrHexError
*/
@Parcelize
data class InvalidInputRequiredByteOrHexError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("sentry")
    var sentry: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: NameValidatorError
*/
@Parcelize
data class NameValidatorError(
    
    
    
    @SerializedName("message")
    var message: NameValidatorErrorMessage?=null,
    
    @SerializedName("sentry")
    var sentry: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: NameValidatorErrorMessage
*/
@Parcelize
data class NameValidatorErrorMessage(
    
    
    
    @SerializedName("name")
    var name: ValidatorErrorBody?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApikeyValidatorError
*/
@Parcelize
data class ApikeyValidatorError(
    
    
    
    @SerializedName("message")
    var message: ApikeyValidatorErrorMessage?=null,
    
    @SerializedName("sentry")
    var sentry: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApikeyValidatorErrorMessage
*/
@Parcelize
data class ApikeyValidatorErrorMessage(
    
    
    
    @SerializedName("api_key")
    var apiKey: ValidatorErrorBody?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FeedidValidatorError
*/
@Parcelize
data class FeedidValidatorError(
    
    
    
    @SerializedName("message")
    var message: FeedidValidatorErrorMessage?=null,
    
    @SerializedName("sentry")
    var sentry: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FeedidValidatorErrorMessage
*/
@Parcelize
data class FeedidValidatorErrorMessage(
    
    
    
    @SerializedName("feedid")
    var feedid: ValidatorErrorBody?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UsernameValidatorError
*/
@Parcelize
data class UsernameValidatorError(
    
    
    
    @SerializedName("message")
    var message: UsernameValidatorErrorMessage?=null,
    
    @SerializedName("sentry")
    var sentry: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UsernameValidatorErrorMessage
*/
@Parcelize
data class UsernameValidatorErrorMessage(
    
    
    
    @SerializedName("username")
    var username: ValidatorErrorBody?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PasswordValidatorError
*/
@Parcelize
data class PasswordValidatorError(
    
    
    
    @SerializedName("message")
    var message: PasswordValidatorErrorMessage?=null,
    
    @SerializedName("sentry")
    var sentry: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PasswordValidatorErrorMessage
*/
@Parcelize
data class PasswordValidatorErrorMessage(
    
    
    
    @SerializedName("password")
    var password: ValidatorErrorBody?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidatorErrorBody
*/
@Parcelize
data class ValidatorErrorBody(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("properties")
    var properties: ValidatorErrorMessageProperties?=null,
    
    @SerializedName("kind")
    var kind: String?=null,
    
    @SerializedName("path")
    var path: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidatorErrorMessageProperties
*/
@Parcelize
data class ValidatorErrorMessageProperties(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("path")
    var path: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CastToStringFail
*/
@Parcelize
data class CastToStringFail(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("sentry")
    var sentry: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvalidID
*/
@Parcelize
data class InvalidID(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("sentry")
    var sentry: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



