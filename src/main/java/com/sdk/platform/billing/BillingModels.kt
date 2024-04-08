package com.sdk.platform.billing

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: PaymentCollectRes
*/
@Parcelize
data class PaymentCollectRes(
    
    
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionChargeRes
*/
@Parcelize
data class SubscriptionChargeRes(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("product_suit_id")
    var productSuitId: String?=null,
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("trial_days")
    var trialDays: Double?=null,
    
    @SerializedName("activated_on")
    var activatedOn: String?=null,
    
    @SerializedName("cancelled_on")
    var cancelledOn: String?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("line_items")
    var lineItems: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PostDowngradeRes
*/
@Parcelize
data class PostDowngradeRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: DowngradeRes?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DowngradeRes
*/
@Parcelize
data class DowngradeRes(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("activated")
    var activated: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("plan_id")
    var planId: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("request_user_id")
    var requestUserId: String?=null,
    
    @SerializedName("subscription_id")
    var subscriptionId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusData
*/
@Parcelize
data class PaymentStatusData(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("webhook_response")
    var webhookResponse: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("aggregator_status")
    var aggregatorStatus: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentStatusResponse
*/
@Parcelize
data class PaymentStatusResponse(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("data")
    var data: PaymentStatusData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BadRequest
*/
@Parcelize
data class BadRequest(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ResourceNotFound
*/
@Parcelize
data class ResourceNotFound(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("code")
    var code: @RawValue Any?=null,
    
    @SerializedName("success")
    var success: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
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
    Model: CheckValidityResponse
*/
@Parcelize
data class CheckValidityResponse(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("discount_amount")
    var discountAmount: Double?=null
    
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
    Model: PlanMeta
*/
@Parcelize
data class PlanMeta(
    
    
    
    @SerializedName("seller_status")
    var sellerStatus: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("plan_platform_display_name")
    var planPlatformDisplayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Plan
*/
@Parcelize
data class Plan(
    
    
    
    @SerializedName("fee_components")
    var feeComponents: @RawValue ArrayList<Any>?=null,
    
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
    var taxation: Taxation?=null,
    
    @SerializedName("one_time_fees")
    var oneTimeFees: OneTimeFees?=null,
    
    @SerializedName("credit_line")
    var creditLine: CreditLine?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("company_ids")
    var companyIds: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("activated_on")
    var activatedOn: String?=null,
    
    @SerializedName("meta")
    var meta: PlanMeta?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionTrialPeriod
*/
@Parcelize
data class SubscriptionTrialPeriod(
    
    
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EntityChargePrice
*/
@Parcelize
data class EntityChargePrice(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EntityChargeRecurring
*/
@Parcelize
data class EntityChargeRecurring(
    
    
    
    @SerializedName("interval")
    var interval: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ChargeLineItem
*/
@Parcelize
data class ChargeLineItem(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("term")
    var term: String?=null,
    
    @SerializedName("pricing_type")
    var pricingType: String?=null,
    
    @SerializedName("price")
    var price: EntityChargePrice?=null,
    
    @SerializedName("recurring")
    var recurring: EntityChargeRecurring?=null,
    
    @SerializedName("capped_amount")
    var cappedAmount: Double?=null,
    
    @SerializedName("trial_days")
    var trialDays: Int?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("metadata")
    var metadata: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateSubscriptionCharge
*/
@Parcelize
data class CreateSubscriptionCharge(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("trial_days")
    var trialDays: Int?=null,
    
    @SerializedName("line_items")
    var lineItems: ArrayList<ChargeLineItem>?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("return_url")
    var returnUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OneTimeChargeItem
*/
@Parcelize
data class OneTimeChargeItem(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("term")
    var term: String?=null,
    
    @SerializedName("pricing_type")
    var pricingType: String?=null,
    
    @SerializedName("price")
    var price: EntityChargePrice?=null,
    
    @SerializedName("capped_amount")
    var cappedAmount: Double?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("metadata")
    var metadata: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOneTimeCharge
*/
@Parcelize
data class CreateOneTimeCharge(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("charge")
    var charge: OneTimeChargeItem?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("return_url")
    var returnUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CurrentPeriod
*/
@Parcelize
data class CurrentPeriod(
    
    
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionCharge
*/
@Parcelize
data class SubscriptionCharge(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("term")
    var term: String?=null,
    
    @SerializedName("pricing_type")
    var pricingType: String?=null,
    
    @SerializedName("price")
    var price: EntityChargePrice?=null,
    
    @SerializedName("recurring")
    var recurring: EntityChargeRecurring?=null,
    
    @SerializedName("capped_amount")
    var cappedAmount: Double?=null,
    
    @SerializedName("activated_on")
    var activatedOn: String?=null,
    
    @SerializedName("cancelled_on")
    var cancelledOn: String?=null,
    
    @SerializedName("billing_date")
    var billingDate: String?=null,
    
    @SerializedName("current_period")
    var currentPeriod: CurrentPeriod?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("metadata")
    var metadata: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntitySubscription
*/
@Parcelize
data class EntitySubscription(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("activated_on")
    var activatedOn: String?=null,
    
    @SerializedName("cancelled_on")
    var cancelledOn: String?=null,
    
    @SerializedName("trial_days")
    var trialDays: Int?=null,
    
    @SerializedName("trial_period")
    var trialPeriod: SubscriptionTrialPeriod?=null,
    
    @SerializedName("metadata")
    var metadata: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("line_items")
    var lineItems: ArrayList<SubscriptionCharge>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeRecurring
*/
@Parcelize
data class ChargeRecurring(
    
    
    
    @SerializedName("interval")
    var interval: String?=null,
    
    @SerializedName("interval_time")
    var intervalTime: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ChargeDetails
*/
@Parcelize
data class ChargeDetails(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("term")
    var term: String?=null,
    
    @SerializedName("charge_type")
    var chargeType: String?=null,
    
    @SerializedName("pricing_type")
    var pricingType: String?=null,
    
    @SerializedName("price")
    var price: EntityChargePrice?=null,
    
    @SerializedName("recurring")
    var recurring: ChargeRecurring?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("capped_amount")
    var cappedAmount: Double?=null,
    
    @SerializedName("activated_on")
    var activatedOn: String?=null,
    
    @SerializedName("cancelled_on")
    var cancelledOn: String?=null,
    
    @SerializedName("billing_date")
    var billingDate: String?=null,
    
    @SerializedName("current_period")
    var currentPeriod: SubscriptionTrialPeriod?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("__v")
    var v: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OneTimeChargeEntity
*/
@Parcelize
data class OneTimeChargeEntity(
    
    
    
    @SerializedName("term")
    var term: String?=null,
    
    @SerializedName("charge_type")
    var chargeType: String?=null,
    
    @SerializedName("capped_amount")
    var cappedAmount: Double?=null,
    
    @SerializedName("billing_date")
    var billingDate: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("activated_on")
    var activatedOn: String?=null,
    
    @SerializedName("cancelled_on")
    var cancelledOn: String?=null,
    
    @SerializedName("metadata")
    var metadata: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_url")
    var returnUrl: String?=null,
    
    @SerializedName("is_test")
    var isTest: Boolean?=null,
    
    @SerializedName("pricing_type")
    var pricingType: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: EntityChargePrice?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateOneTimeChargeResponse
*/
@Parcelize
data class CreateOneTimeChargeResponse(
    
    
    
    @SerializedName("charge")
    var charge: Charge?=null,
    
    @SerializedName("confirm_url")
    var confirmUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Charge
*/
@Parcelize
data class Charge(
    
    
    
    @SerializedName("final_charge")
    var finalCharge: OneTimeChargeEntity?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CreateSubscriptionResponse
*/
@Parcelize
data class CreateSubscriptionResponse(
    
    
    
    @SerializedName("subscription")
    var subscription: EntitySubscription?=null,
    
    @SerializedName("confirm_url")
    var confirmUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceDetailsPeriod
*/
@Parcelize
data class InvoiceDetailsPeriod(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceDetailsClient
*/
@Parcelize
data class InvoiceDetailsClient(
    
    
    
    @SerializedName("address_lines")
    var addressLines: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceDetailsStatusTrail
*/
@Parcelize
data class InvoiceDetailsStatusTrail(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("timestamp")
    var timestamp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoicePaymentMethod
*/
@Parcelize
data class InvoicePaymentMethod(
    
    
    
    @SerializedName("pg_payment_method_id")
    var pgPaymentMethodId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InvoiceDetails
*/
@Parcelize
data class InvoiceDetails(
    
    
    
    @SerializedName("period")
    var period: InvoiceDetailsPeriod?=null,
    
    @SerializedName("client")
    var client: InvoiceDetailsClient?=null,
    
    @SerializedName("auto_advance")
    var autoAdvance: Boolean?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("paid")
    var paid: Boolean?=null,
    
    @SerializedName("attemp")
    var attemp: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("collection_method")
    var collectionMethod: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("pg_data")
    var pgData: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("receipt_number")
    var receiptNumber: String?=null,
    
    @SerializedName("statement_descriptor")
    var statementDescriptor: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("status_trail")
    var statusTrail: ArrayList<InvoiceDetailsStatusTrail>?=null,
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("subscription")
    var subscription: String?=null,
    
    @SerializedName("next_action_time")
    var nextActionTime: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("hash_identifier")
    var hashIdentifier: String?=null,
    
    @SerializedName("payment_method")
    var paymentMethod: InvoicePaymentMethod?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceItemsPlanRecurring
*/
@Parcelize
data class InvoiceItemsPlanRecurring(
    
    
    
    @SerializedName("interval")
    var interval: String?=null,
    
    @SerializedName("interval_count")
    var intervalCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceItemsPlan
*/
@Parcelize
data class InvoiceItemsPlan(
    
    
    
    @SerializedName("recurring")
    var recurring: InvoiceItemsPlanRecurring?=null,
    
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
    var trialPeriod: Int?=null,
    
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
    var amount: Int?=null,
    
    @SerializedName("product_suite_id")
    var productSuiteId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceItemsPeriod
*/
@Parcelize
data class InvoiceItemsPeriod(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceItems
*/
@Parcelize
data class InvoiceItems(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("plan")
    var plan: InvoiceItemsPlan?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("period")
    var period: InvoiceItemsPeriod?=null,
    
    @SerializedName("unit_amount")
    var unitAmount: Double?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Invoice
*/
@Parcelize
data class Invoice(
    
    
    
    @SerializedName("invoice")
    var invoice: InvoiceDetails?=null,
    
    @SerializedName("invoice_items")
    var invoiceItems: ArrayList<InvoiceItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvoicesDataClient
*/
@Parcelize
data class InvoicesDataClient(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("address_lines")
    var addressLines: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoicesDataPeriod
*/
@Parcelize
data class InvoicesDataPeriod(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InvoicesDataPaymentMethod
*/
@Parcelize
data class InvoicesDataPaymentMethod(
    
    
    
    @SerializedName("pg_payment_method_id")
    var pgPaymentMethodId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InvoicesData
*/
@Parcelize
data class InvoicesData(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("documents")
    var documents: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment")
    var payment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("old_settlement")
    var oldSettlement: Double?=null,
    
    @SerializedName("credit_balance")
    var creditBalance: Double?=null,
    
    @SerializedName("discount")
    var discount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("taxation")
    var taxation: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("credit_note_amount")
    var creditNoteAmount: Double?=null,
    
    @SerializedName("client")
    var client: InvoicesDataClient?=null,
    
    @SerializedName("auto_advance")
    var autoAdvance: Boolean?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("paid")
    var paid: Boolean?=null,
    
    @SerializedName("attemp")
    var attemp: Int?=null,
    
    @SerializedName("collection_method")
    var collectionMethod: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("pg_data")
    var pgData: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("period")
    var period: InvoicesDataPeriod?=null,
    
    @SerializedName("receipt_number")
    var receiptNumber: String?=null,
    
    @SerializedName("statement_descriptor")
    var statementDescriptor: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("status_trail")
    var statusTrail: ArrayList<InvoiceDetailsStatusTrail>?=null,
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("subscription")
    var subscription: String?=null,
    
    @SerializedName("next_action_time")
    var nextActionTime: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("hash_identifier")
    var hashIdentifier: String?=null,
    
    @SerializedName("payment_method")
    var paymentMethod: InvoicesDataPaymentMethod?=null,
    
    @SerializedName("invoice_items")
    var invoiceItems: ArrayList<InvoiceItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Invoices
*/
@Parcelize
data class Invoices(
    
    
    
    @SerializedName("data")
    var data: ArrayList<InvoicesData>?=null,
    
    @SerializedName("start")
    var start: Int?=null,
    
    @SerializedName("end")
    var end: Int?=null,
    
    @SerializedName("limit")
    var limit: Int?=null,
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Phone
*/
@Parcelize
data class Phone(
    
    
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("phone_country_code")
    var phoneCountryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionBillingAddress
*/
@Parcelize
data class SubscriptionBillingAddress(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("line1")
    var line1: String?=null,
    
    @SerializedName("line2")
    var line2: String?=null,
    
    @SerializedName("postal_code")
    var postalCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionCustomer
*/
@Parcelize
data class SubscriptionCustomer(
    
    
    
    @SerializedName("phone")
    var phone: Phone?=null,
    
    @SerializedName("billing_address")
    var billingAddress: SubscriptionBillingAddress?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("documents")
    var documents: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("consent")
    var consent: Boolean?=null,
    
    @SerializedName("comms")
    var comms: Boolean?=null,
    
    @SerializedName("credit_balance")
    var creditBalance: Int?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionCustomerCreate
*/
@Parcelize
data class SubscriptionCustomerCreate(
    
    
    
    @SerializedName("phone")
    var phone: Phone?=null,
    
    @SerializedName("billing_address")
    var billingAddress: SubscriptionBillingAddress?=null,
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionCurrentPeriod
*/
@Parcelize
data class SubscriptionCurrentPeriod(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionPauseCollection
*/
@Parcelize
data class SubscriptionPauseCollection(
    
    
    
    @SerializedName("behavior")
    var behavior: String?=null,
    
    @SerializedName("resume_at")
    var resumeAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionTrial
*/
@Parcelize
data class SubscriptionTrial(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionInvoiceSettings
*/
@Parcelize
data class SubscriptionInvoiceSettings(
    
    
    
    @SerializedName("generation")
    var generation: Boolean?=null,
    
    @SerializedName("charging")
    var charging: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Subscription
*/
@Parcelize
data class Subscription(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("current_period")
    var currentPeriod: SubscriptionCurrentPeriod?=null,
    
    @SerializedName("pause_collection")
    var pauseCollection: SubscriptionPauseCollection?=null,
    
    @SerializedName("trial")
    var trial: SubscriptionTrial?=null,
    
    @SerializedName("invoice_settings")
    var invoiceSettings: SubscriptionInvoiceSettings?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("cancel_at_period_end")
    var cancelAtPeriodEnd: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("plan_id")
    var planId: String?=null,
    
    @SerializedName("product_suite_id")
    var productSuiteId: String?=null,
    
    @SerializedName("plan_data")
    var planData: Plan?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("collection_method")
    var collectionMethod: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("latest_invoice")
    var latestInvoice: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("freezed")
    var freezed: Boolean?=null,
    
    @SerializedName("cancel_at")
    var cancelAt: String?=null,
    
    @SerializedName("canceled_at")
    var canceledAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionStatus
*/
@Parcelize
data class SubscriptionStatus(
    
    
    
    @SerializedName("is_enabled")
    var isEnabled: Boolean?=null,
    
    @SerializedName("subscription")
    var subscription: Subscription?=null,
    
    @SerializedName("latest_invoice")
    var latestInvoice: InvoicesData?=null,
    
    @SerializedName("next_plan")
    var nextPlan: Plan?=null,
    
    @SerializedName("current_subscriptions")
    var currentSubscriptions: ArrayList<Subscription>?=null,
    
    @SerializedName("mandate_amount")
    var mandateAmount: Double?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionLimitApplication
*/
@Parcelize
data class SubscriptionLimitApplication(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("hard_limit")
    var hardLimit: Int?=null,
    
    @SerializedName("soft_limit")
    var softLimit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionLimitMarketplace
*/
@Parcelize
data class SubscriptionLimitMarketplace(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SubscriptionLimitOtherPlatform
*/
@Parcelize
data class SubscriptionLimitOtherPlatform(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SubscriptionLimitTeam
*/
@Parcelize
data class SubscriptionLimitTeam(
    
    
    
    @SerializedName("limit")
    var limit: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SubscriptionLimitProducts
*/
@Parcelize
data class SubscriptionLimitProducts(
    
    
    
    @SerializedName("bulk")
    var bulk: Boolean?=null,
    
    @SerializedName("limit")
    var limit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionLimitExtensions
*/
@Parcelize
data class SubscriptionLimitExtensions(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("limit")
    var limit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionLimitIntegrations
*/
@Parcelize
data class SubscriptionLimitIntegrations(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("limit")
    var limit: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionLimit
*/
@Parcelize
data class SubscriptionLimit(
    
    
    
    @SerializedName("application")
    var application: SubscriptionLimitApplication?=null,
    
    @SerializedName("marketplace")
    var marketplace: SubscriptionLimitMarketplace?=null,
    
    @SerializedName("other_platform")
    var otherPlatform: SubscriptionLimitOtherPlatform?=null,
    
    @SerializedName("team")
    var team: SubscriptionLimitTeam?=null,
    
    @SerializedName("products")
    var products: SubscriptionLimitProducts?=null,
    
    @SerializedName("extensions")
    var extensions: SubscriptionLimitExtensions?=null,
    
    @SerializedName("integrations")
    var integrations: SubscriptionLimitIntegrations?=null,
    
    @SerializedName("is_trial_plan")
    var isTrialPlan: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IntentReq
*/
@Parcelize
data class IntentReq(
    
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("plan_id")
    var planId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PutIntentReq
*/
@Parcelize
data class PutIntentReq(
    
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("setup_intent_id")
    var setupIntentId: String?=null,
    
    @SerializedName("payment_method_id")
    var paymentMethodId: String?=null,
    
    @SerializedName("set_default")
    var setDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionActivateReq
*/
@Parcelize
data class SubscriptionActivateReq(
    
    
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("product_suite")
    var productSuite: String?=null,
    
    @SerializedName("plan_id")
    var planId: String?=null,
    
    @SerializedName("payment_method")
    var paymentMethod: String?=null,
    
    @SerializedName("subscription_id")
    var subscriptionId: String?=null,
    
    @SerializedName("coupon")
    var coupon: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionActivateRes
*/
@Parcelize
data class SubscriptionActivateRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: Subscription?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CancelSubscriptionReq
*/
@Parcelize
data class CancelSubscriptionReq(
    
    
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("product_suite")
    var productSuite: String?=null,
    
    @SerializedName("subscription_id")
    var subscriptionId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CancelSubscriptionRes
*/
@Parcelize
data class CancelSubscriptionRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: Subscription?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlanStatusUpdateReq
*/
@Parcelize
data class PlanStatusUpdateReq(
    
    
    
    @SerializedName("plan_id")
    var planId: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("seller_status")
    var sellerStatus: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SunscribePlan
*/
@Parcelize
data class SunscribePlan(
    
    
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("collection_type")
    var collectionType: String?=null,
    
    @SerializedName("plan_id")
    var planId: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("meta")
    var meta: Meta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    
    @SerializedName("subscribe")
    var subscribe: Boolean?=null,
    
    @SerializedName("is_custom_plan")
    var isCustomPlan: Boolean?=null,
    
    @SerializedName("is_plan_upgrade")
    var isPlanUpgrade: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscribePlanRes
*/
@Parcelize
data class SubscribePlanRes(
    
    
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("meta")
    var meta: Meta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EntityDetail
*/
@Parcelize
data class EntityDetail(
    
    
    
    @SerializedName("entity")
    var entity: String?=null,
    
    @SerializedName("item")
    var item: Subscription?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentOptions
*/
@Parcelize
data class PaymentOptions(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("aggregator_id")
    var aggregatorId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyPaymentReq
*/
@Parcelize
data class VerifyPaymentReq(
    
    
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("razorpay_order_id")
    var razorpayOrderId: String?=null,
    
    @SerializedName("razorpay_signature")
    var razorpaySignature: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("provider_type")
    var providerType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Documents
*/
@Parcelize
data class Documents(
    
    
    
    @SerializedName("pan")
    var pan: String?=null,
    
    @SerializedName("gst")
    var gst: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BillingAddress
*/
@Parcelize
data class BillingAddress(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("line1")
    var line1: String?=null,
    
    @SerializedName("line2")
    var line2: String?=null,
    
    @SerializedName("postal_code")
    var postalCode: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Currency
*/
@Parcelize
data class Currency(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BusinessCountryInfo
*/
@Parcelize
data class BusinessCountryInfo(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("currency")
    var currency: Currency?=null,
    
    @SerializedName("timezone")
    var timezone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriberData
*/
@Parcelize
data class SubscriberData(
    
    
    
    @SerializedName("pg_user_exists")
    var pgUserExists: Boolean?=null,
    
    @SerializedName("id")
    var id: @RawValue Any?=null,
    
    @SerializedName("pg_customer_id")
    var pgCustomerId: String?=null,
    
    @SerializedName("default_payment_method")
    var defaultPaymentMethod: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Subscriber
*/
@Parcelize
data class Subscriber(
    
    
    
    @SerializedName("documents")
    var documents: Documents?=null,
    
    @SerializedName("phone")
    var phone: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("billing_address")
    var billingAddress: BillingAddress?=null,
    
    @SerializedName("consent")
    var consent: Boolean?=null,
    
    @SerializedName("comms")
    var comms: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("business_country_info")
    var businessCountryInfo: BusinessCountryInfo?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("credit_balance")
    var creditBalance: Int?=null,
    
    @SerializedName("data")
    var data: SubscriberData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Author
*/
@Parcelize
data class Author(
    
    
    
    @SerializedName("modified_by_details")
    var modifiedByDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: EndingBalance
*/
@Parcelize
data class EndingBalance(
    
    
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("old_entry_ref")
    var oldEntryRef: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentData
*/
@Parcelize
data class PaymentData(
    
    
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreditTransaction
*/
@Parcelize
data class CreditTransaction(
    
    
    
    @SerializedName("entity")
    var entity: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("author")
    var author: Author?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_test")
    var isTest: @RawValue Any?=null,
    
    @SerializedName("ending_balance")
    var endingBalance: EndingBalance?=null,
    
    @SerializedName("payment")
    var payment: PaymentData?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyPaymentData
*/
@Parcelize
data class VerifyPaymentData(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("subscriber")
    var subscriber: Subscriber?=null,
    
    @SerializedName("credit_transaction")
    var creditTransaction: CreditTransaction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VerifyPaymentRes
*/
@Parcelize
data class VerifyPaymentRes(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("data")
    var data: VerifyPaymentData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DefaultMerchants
*/
@Parcelize
data class DefaultMerchants(
    
    
    
    @SerializedName("stripe")
    var stripe: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GlobalSettingsPayment
*/
@Parcelize
data class GlobalSettingsPayment(
    
    
    
    @SerializedName("default_merchants")
    var defaultMerchants: DefaultMerchants?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GlobalSettingsData
*/
@Parcelize
data class GlobalSettingsData(
    
    
    
    @SerializedName("payment")
    var payment: GlobalSettingsPayment?=null,
    
    @SerializedName("freeze_panel")
    var freezePanel: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GlobalSettings
*/
@Parcelize
data class GlobalSettings(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("data")
    var data: GlobalSettingsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MethodChecks
*/
@Parcelize
data class MethodChecks(
    
    
    
    @SerializedName("address_line1_check")
    var addressLine1Check: String?=null,
    
    @SerializedName("address_postal_code_check")
    var addressPostalCodeCheck: String?=null,
    
    @SerializedName("cvc_check")
    var cvcCheck: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MethodNetworks
*/
@Parcelize
data class MethodNetworks(
    
    
    
    @SerializedName("available")
    var available: ArrayList<String>?=null,
    
    @SerializedName("preferred")
    var preferred: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MethodSecureUsage
*/
@Parcelize
data class MethodSecureUsage(
    
    
    
    @SerializedName("supported")
    var supported: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: MethodDetails
*/
@Parcelize
data class MethodDetails(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("mandate_available")
    var mandateAvailable: Boolean?=null,
    
    @SerializedName("mandate_amount")
    var mandateAmount: Double?=null,
    
    @SerializedName("pg_payment_method_id")
    var pgPaymentMethodId: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("data")
    var data: SubscriptionMethodData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionMethodData
*/
@Parcelize
data class SubscriptionMethodData(
    
    
    
    @SerializedName("brand")
    var brand: String?=null,
    
    @SerializedName("checks")
    var checks: MethodChecks?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("exp_month")
    var expMonth: Double?=null,
    
    @SerializedName("exp_year")
    var expYear: Double?=null,
    
    @SerializedName("fingerprint")
    var fingerprint: String?=null,
    
    @SerializedName("funding")
    var funding: String?=null,
    
    @SerializedName("generated_from")
    var generatedFrom: String?=null,
    
    @SerializedName("last4")
    var last4: String?=null,
    
    @SerializedName("networks")
    var networks: MethodNetworks?=null,
    
    @SerializedName("three_d_secure_usage")
    var threeDSecureUsage: MethodSecureUsage?=null,
    
    @SerializedName("wallet")
    var wallet: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionMethods
*/
@Parcelize
data class SubscriptionMethods(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<MethodDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigPublicKey
*/
@Parcelize
data class ConfigPublicKey(
    
    
    
    @SerializedName("public_key")
    var publicKey: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ConfigRes
*/
@Parcelize
data class ConfigRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("config")
    var config: ConfigPublicKey?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlanChangeData
*/
@Parcelize
data class PlanChangeData(
    
    
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("credit_note_amount")
    var creditNoteAmount: Double?=null,
    
    @SerializedName("settlement")
    var settlement: Double?=null,
    
    @SerializedName("taxable_amount")
    var taxableAmount: Double?=null,
    
    @SerializedName("gst_amount")
    var gstAmount: Double?=null,
    
    @SerializedName("gross_total")
    var grossTotal: Double?=null,
    
    @SerializedName("gst")
    var gst: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlanChangeDetails
*/
@Parcelize
data class PlanChangeDetails(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("data")
    var data: PlanChangeData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TransactionMeta
*/
@Parcelize
data class TransactionMeta(
    
    
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentTransactionDetails
*/
@Parcelize
data class PaymentTransactionDetails(
    
    
    
    @SerializedName("aggregator")
    var aggregator: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("collection_type")
    var collectionType: String?=null,
    
    @SerializedName("meta")
    var meta: TransactionMeta?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentItems
*/
@Parcelize
data class PaymentItems(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetPaymentOptions
*/
@Parcelize
data class GetPaymentOptions(
    
    
    
    @SerializedName("payment_options")
    var paymentOptions: ArrayList<PaymentItems>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: TopupReq
*/
@Parcelize
data class TopupReq(
    
    
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("provider_type")
    var providerType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetupMandateReq
*/
@Parcelize
data class SetupMandateReq(
    
    
    
    @SerializedName("intent_id")
    var intentId: String?=null,
    
    @SerializedName("payment_method_id")
    var paymentMethodId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SetupPaymentReq
*/
@Parcelize
data class SetupPaymentReq(
    
    
    
    @SerializedName("payment_method")
    var paymentMethod: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("plan_id")
    var planId: String?=null,
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionRenewReq
*/
@Parcelize
data class SubscriptionRenewReq(
    
    
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("collection_type")
    var collectionType: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("meta")
    var meta: RenewMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RenewMeta
*/
@Parcelize
data class RenewMeta(
    
    
    
    @SerializedName("invoice_payment")
    var invoicePayment: Boolean?=null,
    
    @SerializedName("renew")
    var renew: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionMethodsReq
*/
@Parcelize
data class SubscriptionMethodsReq(
    
    
    
    @SerializedName("unique_external_id")
    var uniqueExternalId: String?=null,
    
    @SerializedName("setup_intent_id")
    var setupIntentId: String?=null,
    
    @SerializedName("pg_payment_method_id")
    var pgPaymentMethodId: String?=null,
    
    @SerializedName("set_default")
    var setDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreditTransactionResponse
*/
@Parcelize
data class CreditTransactionResponse(
    
    
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("limit")
    var limit: Int?=null,
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("pages")
    var pages: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<CreditTransaction>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DowngradePlanReq
*/
@Parcelize
data class DowngradePlanReq(
    
    
    
    @SerializedName("unique_id")
    var uniqueId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("product_suite")
    var productSuite: String?=null,
    
    @SerializedName("plan_id")
    var planId: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null
    
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
    Model: StatusMessage
*/
@Parcelize
data class StatusMessage(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCollectReq
*/
@Parcelize
data class PaymentCollectReq(
    
    
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("credit_balance")
    var creditBalance: Boolean?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("payment_method")
    var paymentMethod: String?=null,
    
    @SerializedName("invoice_id")
    var invoiceId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionRenewResMeta
*/
@Parcelize
data class SubscriptionRenewResMeta(
    
    
    
    @SerializedName("invoice_payment")
    var invoicePayment: Boolean?=null,
    
    @SerializedName("renew")
    var renew: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SubscriptionRenewRes
*/
@Parcelize
data class SubscriptionRenewRes(
    
    
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("transaction_id")
    var transactionId: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("meta")
    var meta: SubscriptionRenewResMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetupIntentRes
*/
@Parcelize
data class SetupIntentRes(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: SetupIntentData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SetupIntentData
*/
@Parcelize
data class SetupIntentData(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("client_secret")
    var clientSecret: String?=null,
    
    @SerializedName("customer")
    var customer: @RawValue Any?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetupPayment
*/
@Parcelize
data class SetupPayment(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("customer")
    var customer: @RawValue Any?=null,
    
    @SerializedName("client_secret")
    var clientSecret: String?=null,
    
    @SerializedName("payment_method")
    var paymentMethod: String?=null,
    
    @SerializedName("mandate")
    var mandate: String?=null,
    
    @SerializedName("payment_method_options")
    var paymentMethodOptions: PaymentMethodOptions?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethodOptions
*/
@Parcelize
data class PaymentMethodOptions(
    
    
    
    @SerializedName("card")
    var card: Card?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Card
*/
@Parcelize
data class Card(
    
    
    
    @SerializedName("mandate_options")
    var mandateOptions: MandateOptions?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: MandateOptions
*/
@Parcelize
data class MandateOptions(
    
    
    
    @SerializedName("amount")
    var amount: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Message
*/
@Parcelize
data class Message(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: TopupRes
*/
@Parcelize
data class TopupRes(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("transaction_id")
    var transactionId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CancelTopupReq
*/
@Parcelize
data class CancelTopupReq(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CancelTopupRes
*/
@Parcelize
data class CancelTopupRes(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("subscriber_id")
    var subscriberId: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("__v")
    var v: Double?=null,
    
    @SerializedName("aggregator_status")
    var aggregatorStatus: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DefaultReq
*/
@Parcelize
data class DefaultReq(
    
    
    
    @SerializedName("payment_method_id")
    var paymentMethodId: String?=null
    
): Parcelable {
    
    
    
    
    
}





