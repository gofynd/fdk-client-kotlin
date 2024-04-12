package com.sdk.universal.billing

import com.sdk.universal.*




import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: InternalServerError
*/
@Parcelize
data class InternalServerError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
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
    var intervalCount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Plan
*/
@Parcelize
data class Plan(
    
    
    
    @SerializedName("recurring")
    var recurring: PlanRecurring?=null,
    
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null,
    
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
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DetailList
*/
@Parcelize
data class DetailList(
    
    
    
    @SerializedName("plans")
    var plans: ArrayList<Plan>?=null,
    
    @SerializedName("trial_plan")
    var trialPlan: Plan?=null,
    
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
    var enabled: Boolean?=null
    
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
    var modifiedAt: String?=null
    
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
    
    
    
    @SerializedName("recurring")
    var recurring: PlanRecurring?=null,
    
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null,
    
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





