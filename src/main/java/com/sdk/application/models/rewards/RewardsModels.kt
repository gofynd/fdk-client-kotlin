package com.sdk.application.models.rewards

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: RewardsArticle
*/
@Parcelize
data class RewardsArticle(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("points")
    var points: Double?=null,
    
    @SerializedName("price")
    var price: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CatalogueOrderResponse
*/
@Parcelize
data class CatalogueOrderResponse(
    
    
    
    @SerializedName("articles")
    var articles: ArrayList<RewardsArticle>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CatalogueOrderRequest
*/
@Parcelize
data class CatalogueOrderRequest(
    
    
    
    @SerializedName("articles")
    var articles: ArrayList<RewardsArticle>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PointsResponse
*/
@Parcelize
data class PointsResponse(
    
    
    
    @SerializedName("points")
    var points: Double?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ReferralDetailsUser
*/
@Parcelize
data class ReferralDetailsUser(
    
    
    
    @SerializedName("blocked")
    var blocked: Boolean?=null,
    
    @SerializedName("points")
    var points: Double?=null,
    
    @SerializedName("redeemed")
    var redeemed: Boolean?=null,
    
    @SerializedName("referral_code")
    var referralCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Offer
*/
@Parcelize
data class Offer(
    
    
    
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("banner_image")
    var bannerImage: Asset?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("rule")
    var rule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("share")
    var share: ShareMessages?=null,
    
    @SerializedName("sub_text")
    var subText: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("cron")
    var cron: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("code")
    var code: Int?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Asset
*/
@Parcelize
data class Asset(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShareMessages
*/
@Parcelize
data class ShareMessages(
    
    
    
    @SerializedName("email")
    var email: Int?=null,
    
    @SerializedName("facebook")
    var facebook: String?=null,
    
    @SerializedName("fallback")
    var fallback: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("messenger")
    var messenger: String?=null,
    
    @SerializedName("sms")
    var sms: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("twitter")
    var twitter: String?=null,
    
    @SerializedName("whatsapp")
    var whatsapp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReferralDetailsResponse
*/
@Parcelize
data class ReferralDetailsResponse(
    
    
    
    @SerializedName("referral")
    var referral: Offer?=null,
    
    @SerializedName("share")
    var share: ShareMessages?=null,
    
    @SerializedName("user")
    var user: ReferralDetailsUser?=null,
    
    @SerializedName("referrer_info")
    var referrerInfo: String?=null,
    
    @SerializedName("terms_conditions_link")
    var termsConditionsLink: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDiscountRequest
*/
@Parcelize
data class OrderDiscountRequest(
    
    
    
    @SerializedName("order_amount")
    var orderAmount: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDiscountRuleBucket
*/
@Parcelize
data class OrderDiscountRuleBucket(
    
    
    
    @SerializedName("high")
    var high: Double?=null,
    
    @SerializedName("low")
    var low: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("value_type")
    var valueType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountProperties
*/
@Parcelize
data class DiscountProperties(
    
    
    
    @SerializedName("absolute")
    var absolute: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("display_absolute")
    var displayAbsolute: String?=null,
    
    @SerializedName("display_percent")
    var displayPercent: String?=null,
    
    @SerializedName("percent")
    var percent: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OrderDiscountResponse
*/
@Parcelize
data class OrderDiscountResponse(
    
    
    
    @SerializedName("order_amount")
    var orderAmount: Double?=null,
    
    @SerializedName("points")
    var points: Double?=null,
    
    @SerializedName("discount")
    var discount: DiscountProperties?=null,
    
    @SerializedName("base_discount")
    var baseDiscount: DiscountProperties?=null,
    
    @SerializedName("applied_rule_bucket")
    var appliedRuleBucket: OrderDiscountRuleBucket?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RedeemReferralCodeRequest
*/
@Parcelize
data class RedeemReferralCodeRequest(
    
    
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("referral_code")
    var referralCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RedeemReferralCodeResponse
*/
@Parcelize
data class RedeemReferralCodeResponse(
    
    
    
    @SerializedName("redeemed")
    var redeemed: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("referrer_info")
    var referrerInfo: String?=null,
    
    @SerializedName("referrer_id")
    var referrerId: String?=null,
    
    @SerializedName("points")
    var points: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PointsHistoryResponse
*/
@Parcelize
data class PointsHistoryResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<PointsHistory>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PointsHistory
*/
@Parcelize
data class PointsHistory(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("claimed")
    var claimed: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("points")
    var points: Double?=null,
    
    @SerializedName("remaining_points")
    var remainingPoints: Double?=null,
    
    @SerializedName("text_1")
    var text1: String?=null,
    
    @SerializedName("text_2")
    var text2: String?=null,
    
    @SerializedName("text_3")
    var text3: String?=null,
    
    @SerializedName("txn_name")
    var txnName: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
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



