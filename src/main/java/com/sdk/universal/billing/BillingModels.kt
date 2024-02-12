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





