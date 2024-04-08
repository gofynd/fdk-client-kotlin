package com.sdk.universal.billing

import com.sdk.universal.*




import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: ResourceNotFound
*/
@Parcelize
data class ResourceNotFound(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PlanRecurring
*/
@Parcelize
data class PlanRecurring(
    
    
    
    @SerializedName("interval")
    var interval: String?=null,
    
    @SerializedName("interval_count")
    var intervalCount: Double?=null,
    
    @SerializedName("aggregate_usage")
    var aggregateUsage: String?=null,
    
    @SerializedName("usage_type")
    var usageType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DetailList
*/
@Parcelize
data class DetailList(
    
    
    
    @SerializedName("plans")
    var plans: ArrayList<PlanDetails>?=null,
    
    @SerializedName("component_groups")
    var componentGroups: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlanTaxation
*/
@Parcelize
data class PlanTaxation(
    
    
    
    @SerializedName("gst")
    var gst: Double?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: OneTimeFees
*/
@Parcelize
data class OneTimeFees(
    
    
    
    @SerializedName("developement")
    var developement: Int?=null,
    
    @SerializedName("marketing")
    var marketing: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreditLine
*/
@Parcelize
data class CreditLine(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PlanMeta
*/
@Parcelize
data class PlanMeta(
    
    
    
    @SerializedName("plan_platform_display_name")
    var planPlatformDisplayName: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FeatureConfig
*/
@Parcelize
data class FeatureConfig(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("limit")
    var limit: Int?=null,
    
    @SerializedName("hard_limit")
    var hardLimit: Int?=null,
    
    @SerializedName("soft_limit")
    var softLimit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlanConfig
*/
@Parcelize
data class PlanConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("display_text")
    var displayText: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("processing_type")
    var processingType: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("feature_config")
    var featureConfig: FeatureConfig?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("component_id")
    var componentId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("billing_scheme")
    var billingScheme: String?=null,
    
    @SerializedName("bill_type")
    var billType: String?=null,
    
    @SerializedName("price_ui_type")
    var priceUiType: String?=null,
    
    @SerializedName("recurring")
    var recurring: PlanRecurring?=null,
    
    @SerializedName("transform_quantity")
    var transformQuantity: TransformQuantity?=null,
    
    @SerializedName("free_tier")
    var freeTier: FreeTier?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("unit_amount")
    var unitAmount: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("price_type")
    var priceType: String?=null,
    
    @SerializedName("tiers")
    var tiers: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FreeTier
*/
@Parcelize
data class FreeTier(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TransformQuantity
*/
@Parcelize
data class TransformQuantity(
    
    
    
    @SerializedName("divide_by")
    var divideBy: Int?=null,
    
    @SerializedName("round")
    var round: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ComponentsSchema
*/
@Parcelize
data class ComponentsSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("group")
    var group: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("links")
    var links: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("config")
    var config: PlanConfig?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("display_text")
    var displayText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlanDetails
*/
@Parcelize
data class PlanDetails(
    
    
    
    @SerializedName("approved_by")
    var approvedBy: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("recurring")
    var recurring: PlanRecurring?=null,
    
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null,
    
    @SerializedName("company_ids")
    var companyIds: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("plan_group")
    var planGroup: String?=null,
    
    @SerializedName("tag_lines")
    var tagLines: ArrayList<String>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("trial_period")
    var trialPeriod: Double?=null,
    
    @SerializedName("addons")
    var addons: ArrayList<String>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("product_suite_id")
    var productSuiteId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("taxation")
    var taxation: PlanTaxation?=null,
    
    @SerializedName("one_time_fees")
    var oneTimeFees: OneTimeFees?=null,
    
    @SerializedName("credit_line")
    var creditLine: CreditLine?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("meta")
    var meta: PlanMeta?=null,
    
    @SerializedName("components")
    var components: ArrayList<ComponentsSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Recurring
*/
@Parcelize
data class Recurring(
    
    
    
    @SerializedName("interval")
    var interval: String?=null,
    
    @SerializedName("interval_count")
    var intervalCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Taxation
*/
@Parcelize
data class Taxation(
    
    
    
    @SerializedName("gst")
    var gst: Double?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PlanList
*/
@Parcelize
data class PlanList(
    
    
    
    @SerializedName("approved_by")
    var approvedBy: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("recurring")
    var recurring: Recurring?=null,
    
    @SerializedName("taxation")
    var taxation: Taxation?=null,
    
    @SerializedName("one_time_fees")
    var oneTimeFees: OneTimeFees?=null,
    
    @SerializedName("credit_line")
    var creditLine: CreditLine?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("product_suite_id")
    var productSuiteId: String?=null,
    
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("plan_group")
    var planGroup: String?=null,
    
    @SerializedName("tag_lines")
    var tagLines: ArrayList<String>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("trial_period")
    var trialPeriod: Int?=null,
    
    @SerializedName("addons")
    var addons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("company_ids")
    var companyIds: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}





