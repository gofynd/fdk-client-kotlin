package com.sdk.universal.partner

import com.sdk.universal.*




import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: CategoryL1
*/
@Parcelize
data class CategoryL1(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("level")
    var level: Double?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryL2
*/
@Parcelize
data class CategoryL2(
    
    
    
    @SerializedName("parent")
    var parent: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("level")
    var level: Double?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryCommon
*/
@Parcelize
data class CategoryCommon(
    
    
    
    @SerializedName("category_l1")
    var categoryL1: ArrayList<CategoryL1>?=null,
    
    @SerializedName("category_l2")
    var categoryL2: ArrayList<CategoryL2>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ContactInfo
*/
@Parcelize
data class ContactInfo(
    
    
    
    @SerializedName("support")
    var support: Support?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ExtensionUsingSlug
*/
@Parcelize
data class ExtensionUsingSlug(
    
    
    
    @SerializedName("category")
    var category: CategoryCommon?=null,
    
    @SerializedName("contact_info")
    var contactInfo: ContactInfo?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("details")
    var details: Details?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("is_coming_soon")
    var isComingSoon: Boolean?=null,
    
    @SerializedName("listing_info")
    var listingInfo: ListingInfo?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("organization")
    var organization: Organization?=null,
    
    @SerializedName("organization_id")
    var organizationId: String?=null,
    
    @SerializedName("plan_type")
    var planType: String?=null,
    
    @SerializedName("plans")
    var plans: ArrayList<Plans>?=null,
    
    @SerializedName("plans_url")
    var plansUrl: String?=null,
    
    @SerializedName("review_instructions")
    var reviewInstructions: String?=null,
    
    @SerializedName("scope")
    var scope: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Organization
*/
@Parcelize
data class Organization(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ListingInfo
*/
@Parcelize
data class ListingInfo(
    
    
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("keywords")
    var keywords: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tagline")
    var tagline: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Benefits
*/
@Parcelize
data class Benefits(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Screenshots
*/
@Parcelize
data class Screenshots(
    
    
    
    @SerializedName("desktop")
    var desktop: ArrayList<String>?=null,
    
    @SerializedName("mobile")
    var mobile: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Details
*/
@Parcelize
data class Details(
    
    
    
    @SerializedName("benefits")
    var benefits: ArrayList<Benefits>?=null,
    
    @SerializedName("demo_url")
    var demoUrl: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("integration")
    var integration: ArrayList<String>?=null,
    
    @SerializedName("video_url")
    var videoUrl: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("youtube")
    var youtube: ArrayList<String>?=null,
    
    @SerializedName("screenshots")
    var screenshots: Screenshots?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Support
*/
@Parcelize
data class Support(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("faq_url")
    var faqUrl: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("privacy_policy_url")
    var privacyPolicyUrl: String?=null,
    
    @SerializedName("website_url")
    var websiteUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Price
*/
@Parcelize
data class Price(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Plans
*/
@Parcelize
data class Plans(
    
    
    
    @SerializedName("additional_charges")
    var additionalCharges: String?=null,
    
    @SerializedName("features")
    var features: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("trial_days")
    var trialDays: Double?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("price")
    var price: Price?=null,
    
    @SerializedName("recurring")
    var recurring: Recurring?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Recurring
*/
@Parcelize
data class Recurring(
    
    
    
    @SerializedName("recurring_time")
    var recurringTime: Double?=null,
    
    @SerializedName("yearly_amount")
    var yearlyAmount: Double?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}





