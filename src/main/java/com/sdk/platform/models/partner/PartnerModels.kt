package com.sdk.platform.models.partner

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: ExtensionResponse
*/
@Parcelize
data class ExtensionResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ExtensionListItems>?=null,
    
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ExtensionListItems
*/
@Parcelize
data class ExtensionListItems(
    
    
    
    @SerializedName("base_url")
    var baseUrl: String?=null,
    
    @SerializedName("callbacks")
    var callbacks: Callback?=null,
    
    @SerializedName("contact_email")
    var contactEmail: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("developed_by_name")
    var developedByName: String?=null,
    
    @SerializedName("ext_version")
    var extVersion: String?=null,
    
    @SerializedName("extention_type")
    var extentionType: String?=null,
    
    @SerializedName("is_application_level")
    var isApplicationLevel: Boolean?=null,
    
    @SerializedName("is_coming_soon")
    var isComingSoon: Boolean?=null,
    
    @SerializedName("is_saleschannel")
    var isSaleschannel: Boolean?=null,
    
    @SerializedName("logo")
    var logo: Logo?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("scope")
    var scope: ArrayList<String>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("is_hidden")
    var isHidden: Boolean?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("organization_id")
    var organizationId: String?=null,
    
    @SerializedName("whitelisted_urls")
    var whitelistedUrls: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ExtensionCommon
*/
@Parcelize
data class ExtensionCommon(
    
    
    
    @SerializedName("base_url")
    var baseUrl: String?=null,
    
    @SerializedName("callbacks")
    var callbacks: Callback?=null,
    
    @SerializedName("contact_email")
    var contactEmail: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("developed_by_name")
    var developedByName: String?=null,
    
    @SerializedName("ext_version")
    var extVersion: String?=null,
    
    @SerializedName("extention_type")
    var extentionType: String?=null,
    
    @SerializedName("is_application_level")
    var isApplicationLevel: Boolean?=null,
    
    @SerializedName("is_coming_soon")
    var isComingSoon: Boolean?=null,
    
    @SerializedName("is_saleschannel")
    var isSaleschannel: Boolean?=null,
    
    @SerializedName("logo")
    var logo: Logo?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("scope")
    var scope: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ExtensionList
*/
@Parcelize
data class ExtensionList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ExtensionItems>?=null,
    
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ExtensionItems
*/
@Parcelize
data class ExtensionItems(
    
    
    
    @SerializedName("base_url")
    var baseUrl: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("developed_by_name")
    var developedByName: String?=null,
    
    @SerializedName("ext_version")
    var extVersion: String?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("extention_type")
    var extentionType: String?=null,
    
    @SerializedName("installed")
    var installed: Boolean?=null,
    
    @SerializedName("is_saleschannel")
    var isSaleschannel: Boolean?=null,
    
    @SerializedName("launch_url")
    var launchUrl: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: Logo?=null,
    
    @SerializedName("scope")
    var scope: ArrayList<Scope>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Scope
*/
@Parcelize
data class Scope(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Pagination
*/
@Parcelize
data class Pagination(
    
    
    
    @SerializedName("current")
    var current: Double?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Double?=null,
    
    @SerializedName("size")
    var size: Double?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ExtensionSuggestionList
*/
@Parcelize
data class ExtensionSuggestionList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ExtensionSuggestion>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OrganizationBasicInfo
*/
@Parcelize
data class OrganizationBasicInfo(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ExtensionSuggestion
*/
@Parcelize
data class ExtensionSuggestion(
    
    
    
    @SerializedName("listing_info")
    var listingInfo: ListingInfo?=null,
    
    @SerializedName("organization")
    var organization: OrganizationBasicInfo?=null,
    
    @SerializedName("organization_id")
    var organizationId: String?=null,
    
    @SerializedName("plans")
    var plans: ArrayList<Plan>?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Plan
*/
@Parcelize
data class Plan(
    
    
    
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
    var price: Price?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ListingInfo
*/
@Parcelize
data class ListingInfo(
    
    
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tagline")
    var tagline: String?=null,
    
    @SerializedName("keywords")
    var keywords: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Callback
*/
@Parcelize
data class Callback(
    
    
    
    @SerializedName("auth")
    var auth: String?=null,
    
    @SerializedName("auto_install")
    var autoInstall: String?=null,
    
    @SerializedName("install")
    var install: String?=null,
    
    @SerializedName("setup")
    var setup: String?=null,
    
    @SerializedName("uninstall")
    var uninstall: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Logo
*/
@Parcelize
data class Logo(
    
    
    
    @SerializedName("large")
    var large: String?=null,
    
    @SerializedName("small")
    var small: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Category
*/
@Parcelize
data class Category(
    
    
    
    @SerializedName("category_l1")
    var categoryL1: ArrayList<CategoryL1>?=null,
    
    @SerializedName("category_l2")
    var categoryL2: ArrayList<CategoryL2>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CommingSoon
*/
@Parcelize
data class CommingSoon(
    
    
    
    @SerializedName("is_coming_soon")
    var isComingSoon: Boolean?=null,
    
    @SerializedName("upvote_count")
    var upvoteCount: Double?=null
    
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
    Model: ExtensionDetails
*/
@Parcelize
data class ExtensionDetails(
    
    
    
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
    
    @SerializedName("price")
    var price: Price?=null,
    
    @SerializedName("trial_days")
    var trialDays: Double?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PublicExtension
*/
@Parcelize
data class PublicExtension(
    
    
    
    @SerializedName("category")
    var category: Category?=null,
    
    @SerializedName("coming_soon")
    var comingSoon: CommingSoon?=null,
    
    @SerializedName("contact_info")
    var contactInfo: ContactInfo?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("details")
    var details: ExtensionDetails?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("is_coming_soon")
    var isComingSoon: Boolean?=null,
    
    @SerializedName("listing_info")
    var listingInfo: ListingInfo?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("organization")
    var organization: OrganizationBasicInfo?=null,
    
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
    Model: UninstallExtension
*/
@Parcelize
data class UninstallExtension(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SubscriptionRequest
*/
@Parcelize
data class SubscriptionRequest(
    
    
    
    @SerializedName("approved")
    var approved: String?=null,
    
    @SerializedName("client_id")
    var clientId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("credit_balance")
    var creditBalance: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionRes
*/
@Parcelize
data class SubscriptionRes(
    
    
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PartnerInviteDetails
*/
@Parcelize
data class PartnerInviteDetails(
    
    
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("approved_permissions")
    var approvedPermissions: ApprovedPermissions?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("company_id")
    var companyId: Double?=null,
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("organization_id")
    var organizationId: String?=null,
    
    @SerializedName("organization_name")
    var organizationName: String?=null,
    
    @SerializedName("request_status")
    var requestStatus: String?=null,
    
    @SerializedName("requested_permissions")
    var requestedPermissions: RequestedPermissions?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApprovedPermissions
*/
@Parcelize
data class ApprovedPermissions(
    
    
    
    @SerializedName("application_role")
    var applicationRole: ArrayList<String>?=null,
    
    @SerializedName("company_permissions")
    var companyPermissions: ArrayList<String>?=null,
    
    @SerializedName("company_role")
    var companyRole: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RequestedPermissions
*/
@Parcelize
data class RequestedPermissions(
    
    
    
    @SerializedName("application_permissions")
    var applicationPermissions: ArrayList<String>?=null,
    
    @SerializedName("application_role")
    var applicationRole: ArrayList<String>?=null,
    
    @SerializedName("company_permissions")
    var companyPermissions: ArrayList<String>?=null,
    
    @SerializedName("company_role")
    var companyRole: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ModifyPartnerReq
*/
@Parcelize
data class ModifyPartnerReq(
    
    
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("approved_permissions")
    var approvedPermissions: ApprovedPermissionsInfo?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("company_id")
    var companyId: Double?=null,
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("organization_id")
    var organizationId: String?=null,
    
    @SerializedName("organization_name")
    var organizationName: String?=null,
    
    @SerializedName("request_status")
    var requestStatus: String?=null,
    
    @SerializedName("requested_permissions")
    var requestedPermissions: RequestedPermissions?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApprovedPermissionsInfo
*/
@Parcelize
data class ApprovedPermissionsInfo(
    
    
    
    @SerializedName("application_permissions")
    var applicationPermissions: HashMap<String,ApplicationPermissions>?=null,
    
    @SerializedName("company_permissions")
    var companyPermissions: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationPermissions
*/
@Parcelize
data class ApplicationPermissions(
    
    
    
    @SerializedName("permissions")
    var permissions: ArrayList<String>?=null,
    
    @SerializedName("roles")
    var roles: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PartnerRequestList
*/
@Parcelize
data class PartnerRequestList(
    
    
    
    @SerializedName("items")
    var items: PartnerList?=null,
    
    @SerializedName("page")
    var page: Pagination?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PartnerList
*/
@Parcelize
data class PartnerList(
    
    
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("approved_permissions")
    var approvedPermissions: ApprovedPermissionsInfo?=null,
    
    @SerializedName("approver_id")
    var approverId: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("company_id")
    var companyId: Double?=null,
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("organization_id")
    var organizationId: String?=null,
    
    @SerializedName("organization_name")
    var organizationName: String?=null,
    
    @SerializedName("request_status")
    var requestStatus: String?=null,
    
    @SerializedName("requested_permissions")
    var requestedPermissions: RequestedPermissions?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetupProductRes
*/
@Parcelize
data class SetupProductRes(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("next_step")
    var nextStep: Double?=null,
    
    @SerializedName("cli_wait_time")
    var cliWaitTime: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddProxyReq
*/
@Parcelize
data class AddProxyReq(
    
    
    
    @SerializedName("attached_path")
    var attachedPath: String?=null,
    
    @SerializedName("proxy_url")
    var proxyUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AddProxyResponse
*/
@Parcelize
data class AddProxyResponse(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("attached_path")
    var attachedPath: String?=null,
    
    @SerializedName("proxy_url")
    var proxyUrl: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("extension_id")
    var extensionId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: getProxyPathRes
*/
@Parcelize
data class getProxyPathRes(
    
    
    
    @SerializedName("page")
    var page: Pagination?=null,
    
    @SerializedName("items")
    var items: ArrayList<AddProxyResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RemoveProxyResponse
*/
@Parcelize
data class RemoveProxyResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: APIError
*/
@Parcelize
data class APIError(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



