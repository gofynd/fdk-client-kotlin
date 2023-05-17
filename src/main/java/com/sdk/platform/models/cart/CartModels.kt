package com.sdk.platform.models.cart

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: RuleDefinitionSchema
*/
@Parcelize
data class RuleDefinitionSchema(
    
    
    
    @SerializedName("scope")
    var scope: ArrayList<String>?=null,
    
    @SerializedName("is_exact")
    var isExact: Boolean?=null,
    
    @SerializedName("applicable_on")
    var applicableOn: String?=null,
    
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value_type")
    var valueType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StateSchema
*/
@Parcelize
data class StateSchema(
    
    
    
    @SerializedName("is_display")
    var isDisplay: Boolean?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("is_public")
    var isPublic: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponScheduleSchema
*/
@Parcelize
data class CouponScheduleSchema(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("duration")
    var duration: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: IdentifierSchema
*/
@Parcelize
data class IdentifierSchema(
    
    
    
    @SerializedName("brand_id")
    var brandId: ArrayList<Int>?=null,
    
    @SerializedName("article_id")
    var articleId: ArrayList<String>?=null,
    
    @SerializedName("category_id")
    var categoryId: ArrayList<Int>?=null,
    
    @SerializedName("email_domain")
    var emailDomain: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: ArrayList<Int>?=null,
    
    @SerializedName("collection_id")
    var collectionId: ArrayList<String>?=null,
    
    @SerializedName("store_id")
    var storeId: ArrayList<Int>?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    
    @SerializedName("exclude_brand_id")
    var excludeBrandId: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidationSchema
*/
@Parcelize
data class ValidationSchema(
    
    
    
    @SerializedName("user_registered_after")
    var userRegisteredAfter: String?=null,
    
    @SerializedName("app_id")
    var appId: ArrayList<String>?=null,
    
    @SerializedName("anonymous")
    var anonymous: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponActionSchema
*/
@Parcelize
data class CouponActionSchema(
    
    
    
    @SerializedName("action_date")
    var actionDate: String?=null,
    
    @SerializedName("txn_mode")
    var txnMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentAllowValueSchema
*/
@Parcelize
data class PaymentAllowValueSchema(
    
    
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentModesSchema
*/
@Parcelize
data class PaymentModesSchema(
    
    
    
    @SerializedName("networks")
    var networks: ArrayList<String>?=null,
    
    @SerializedName("uses")
    var uses: PaymentAllowValueSchema?=null,
    
    @SerializedName("types")
    var types: ArrayList<String>?=null,
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PriceRangeSchema
*/
@Parcelize
data class PriceRangeSchema(
    
    
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UsesRemainingSchema
*/
@Parcelize
data class UsesRemainingSchema(
    
    
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("app")
    var app: Int?=null,
    
    @SerializedName("user")
    var user: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UsesRestrictionSchema
*/
@Parcelize
data class UsesRestrictionSchema(
    
    
    
    @SerializedName("remaining")
    var remaining: UsesRemainingSchema?=null,
    
    @SerializedName("maximum")
    var maximum: UsesRemainingSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkBundleRestriction
*/
@Parcelize
data class BulkBundleRestriction(
    
    
    
    @SerializedName("multi_store_allowed")
    var multiStoreAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PostOrderSchema
*/
@Parcelize
data class PostOrderSchema(
    
    
    
    @SerializedName("cancellation_allowed")
    var cancellationAllowed: Boolean?=null,
    
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RestrictionsSchema
*/
@Parcelize
data class RestrictionsSchema(
    
    
    
    @SerializedName("payments")
    var payments: HashMap<String,PaymentModesSchema>?=null,
    
    @SerializedName("price_range")
    var priceRange: PriceRangeSchema?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("uses")
    var uses: UsesRestrictionSchema?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("ordering_stores")
    var orderingStores: ArrayList<Int>?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("bulk_bundle")
    var bulkBundle: BulkBundleRestriction?=null,
    
    @SerializedName("coupon_allowed")
    var couponAllowed: Boolean?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrderSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponDateMetaSchema
*/
@Parcelize
data class CouponDateMetaSchema(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ValiditySchema
*/
@Parcelize
data class ValiditySchema(
    
    
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CouponAuthorSchema
*/
@Parcelize
data class CouponAuthorSchema(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RuleSchema
*/
@Parcelize
data class RuleSchema(
    
    
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("discount_qty")
    var discountQty: Double?=null,
    
    @SerializedName("key")
    var key: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayMetaDictSchema
*/
@Parcelize
data class DisplayMetaDictSchema(
    
    
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayMetaSchema
*/
@Parcelize
data class DisplayMetaSchema(
    
    
    
    @SerializedName("remove")
    var remove: DisplayMetaDictSchema?=null,
    
    @SerializedName("auto")
    var auto: DisplayMetaDictSchema?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("apply")
    var apply: DisplayMetaDictSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OwnershipSchema
*/
@Parcelize
data class OwnershipSchema(
    
    
    
    @SerializedName("payable_category")
    var payableCategory: String?=null,
    
    @SerializedName("payable_by")
    var payableBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CouponAddSchema
*/
@Parcelize
data class CouponAddSchema(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinitionSchema?=null,
    
    @SerializedName("state")
    var state: StateSchema?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponScheduleSchema?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: IdentifierSchema?=null,
    
    @SerializedName("validation")
    var validation: ValidationSchema?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("action")
    var action: CouponActionSchema?=null,
    
    @SerializedName("restrictions")
    var restrictions: RestrictionsSchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMetaSchema?=null,
    
    @SerializedName("validity")
    var validity: ValiditySchema?=null,
    
    @SerializedName("author")
    var author: CouponAuthorSchema?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<RuleSchema>?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMetaSchema?=null,
    
    @SerializedName("ownership")
    var ownership: OwnershipSchema?=null
    
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
    Model: CouponsResponse
*/
@Parcelize
data class CouponsResponse(
    
    
    
    @SerializedName("items")
    var items: CouponAddSchema?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SuccessMessage
*/
@Parcelize
data class SuccessMessage(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OperationErrorResponse
*/
@Parcelize
data class OperationErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CouponUpdateSchema
*/
@Parcelize
data class CouponUpdateSchema(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinitionSchema?=null,
    
    @SerializedName("state")
    var state: StateSchema?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponScheduleSchema?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: IdentifierSchema?=null,
    
    @SerializedName("validation")
    var validation: ValidationSchema?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("action")
    var action: CouponActionSchema?=null,
    
    @SerializedName("restrictions")
    var restrictions: RestrictionsSchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMetaSchema?=null,
    
    @SerializedName("validity")
    var validity: ValiditySchema?=null,
    
    @SerializedName("author")
    var author: CouponAuthorSchema?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<RuleSchema>?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMetaSchema?=null,
    
    @SerializedName("ownership")
    var ownership: OwnershipSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponPartialUpdate
*/
@Parcelize
data class CouponPartialUpdate(
    
    
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    
    @SerializedName("schedule")
    var schedule: CouponScheduleSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountOfferSchema
*/
@Parcelize
data class DiscountOfferSchema(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("apportion_discount")
    var apportionDiscount: Boolean?=null,
    
    @SerializedName("discount_amount")
    var discountAmount: Double?=null,
    
    @SerializedName("min_offer_quantity")
    var minOfferQuantity: Int?=null,
    
    @SerializedName("discount_percentage")
    var discountPercentage: Double?=null,
    
    @SerializedName("max_offer_quantity")
    var maxOfferQuantity: Int?=null,
    
    @SerializedName("discount_price")
    var discountPrice: Double?=null,
    
    @SerializedName("max_usage_per_transaction")
    var maxUsagePerTransaction: Int?=null,
    
    @SerializedName("partial_can_ret")
    var partialCanRet: Boolean?=null,
    
    @SerializedName("max_discount_amount")
    var maxDiscountAmount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompareObjectSchema
*/
@Parcelize
data class CompareObjectSchema(
    
    
    
    @SerializedName("less_than_equals")
    var lessThanEquals: Double?=null,
    
    @SerializedName("equals")
    var equals: Double?=null,
    
    @SerializedName("less_than")
    var lessThan: Double?=null,
    
    @SerializedName("greater_than")
    var greaterThan: Double?=null,
    
    @SerializedName("greater_than_equals")
    var greaterThanEquals: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ItemCriteriaSchema
*/
@Parcelize
data class ItemCriteriaSchema(
    
    
    
    @SerializedName("item_sku")
    var itemSku: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_l2_category")
    var itemExcludeL2Category: ArrayList<Int>?=null,
    
    @SerializedName("item_brand")
    var itemBrand: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_l1_category")
    var itemExcludeL1Category: ArrayList<Int>?=null,
    
    @SerializedName("item_l2_category")
    var itemL2Category: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_id")
    var itemExcludeId: ArrayList<Int>?=null,
    
    @SerializedName("item_store")
    var itemStore: ArrayList<Int>?=null,
    
    @SerializedName("product_tags")
    var productTags: ArrayList<String>?=null,
    
    @SerializedName("available_zones")
    var availableZones: ArrayList<String>?=null,
    
    @SerializedName("cart_unique_item_amount")
    var cartUniqueItemAmount: CompareObjectSchema?=null,
    
    @SerializedName("cart_unique_item_quantity")
    var cartUniqueItemQuantity: CompareObjectSchema?=null,
    
    @SerializedName("all_items")
    var allItems: Boolean?=null,
    
    @SerializedName("item_exclude_store")
    var itemExcludeStore: ArrayList<Int>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_category")
    var itemExcludeCategory: ArrayList<Int>?=null,
    
    @SerializedName("item_category")
    var itemCategory: ArrayList<Int>?=null,
    
    @SerializedName("item_l1_category")
    var itemL1Category: ArrayList<Int>?=null,
    
    @SerializedName("item_size")
    var itemSize: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_department")
    var itemExcludeDepartment: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_brand")
    var itemExcludeBrand: ArrayList<Int>?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    
    @SerializedName("item_tags")
    var itemTags: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_sku")
    var itemExcludeSku: ArrayList<String>?=null,
    
    @SerializedName("cart_quantity")
    var cartQuantity: CompareObjectSchema?=null,
    
    @SerializedName("cart_total")
    var cartTotal: CompareObjectSchema?=null,
    
    @SerializedName("item_exclude_company")
    var itemExcludeCompany: ArrayList<Int>?=null,
    
    @SerializedName("item_department")
    var itemDepartment: ArrayList<Int>?=null,
    
    @SerializedName("item_company")
    var itemCompany: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountRuleSchema
*/
@Parcelize
data class DiscountRuleSchema(
    
    
    
    @SerializedName("discount_type")
    var discountType: String?=null,
    
    @SerializedName("offer")
    var offer: DiscountOfferSchema?=null,
    
    @SerializedName("item_criteria")
    var itemCriteria: ItemCriteriaSchema?=null,
    
    @SerializedName("buy_condition")
    var buyCondition: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OwnershipSchema1
*/
@Parcelize
data class OwnershipSchema1(
    
    
    
    @SerializedName("payable_category")
    var payableCategory: String?=null,
    
    @SerializedName("payable_by")
    var payableBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionActionSchema
*/
@Parcelize
data class PromotionActionSchema(
    
    
    
    @SerializedName("action_type")
    var actionType: String?=null,
    
    @SerializedName("action_date")
    var actionDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: VisibilitySchema
*/
@Parcelize
data class VisibilitySchema(
    
    
    
    @SerializedName("pdp")
    var pdp: Boolean?=null,
    
    @SerializedName("coupon_list")
    var couponList: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionDateMetaSchema
*/
@Parcelize
data class PromotionDateMetaSchema(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionAuthorSchema
*/
@Parcelize
data class PromotionAuthorSchema(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayMetaSchema1
*/
@Parcelize
data class DisplayMetaSchema1(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("offer_label")
    var offerLabel: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionScheduleSchema
*/
@Parcelize
data class PromotionScheduleSchema(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("duration")
    var duration: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentAllowValueSchema1
*/
@Parcelize
data class PaymentAllowValueSchema1(
    
    
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PromotionPaymentModesSchema
*/
@Parcelize
data class PromotionPaymentModesSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null,
    
    @SerializedName("uses")
    var uses: PaymentAllowValueSchema1?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UsesRemainingSchema1
*/
@Parcelize
data class UsesRemainingSchema1(
    
    
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("user")
    var user: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UsesRestrictionSchema1
*/
@Parcelize
data class UsesRestrictionSchema1(
    
    
    
    @SerializedName("remaining")
    var remaining: UsesRemainingSchema1?=null,
    
    @SerializedName("maximum")
    var maximum: UsesRemainingSchema1?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserRegisteredSchema
*/
@Parcelize
data class UserRegisteredSchema(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PostOrderSchema1
*/
@Parcelize
data class PostOrderSchema1(
    
    
    
    @SerializedName("cancellation_allowed")
    var cancellationAllowed: Boolean?=null,
    
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RestrictionsSchema1
*/
@Parcelize
data class RestrictionsSchema1(
    
    
    
    @SerializedName("payments")
    var payments: ArrayList<PromotionPaymentModesSchema>?=null,
    
    @SerializedName("anonymous_users")
    var anonymousUsers: Boolean?=null,
    
    @SerializedName("order_quantity")
    var orderQuantity: Int?=null,
    
    @SerializedName("uses")
    var uses: UsesRestrictionSchema1?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("user_registered")
    var userRegistered: UserRegisteredSchema?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrderSchema1?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionListItem
*/
@Parcelize
data class PromotionListItem(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRuleSchema>?=null,
    
    @SerializedName("ownership")
    var ownership: OwnershipSchema1?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionActionSchema?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("visiblility")
    var visiblility: VisibilitySchema?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteriaSchema>?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMetaSchema?=null,
    
    @SerializedName("author")
    var author: PromotionAuthorSchema?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMetaSchema1?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionScheduleSchema?=null,
    
    @SerializedName("restrictions")
    var restrictions: RestrictionsSchema1?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionsResponse
*/
@Parcelize
data class PromotionsResponse(
    
    
    
    @SerializedName("items")
    var items: PromotionListItem?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionAddSchema
*/
@Parcelize
data class PromotionAddSchema(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRuleSchema>?=null,
    
    @SerializedName("ownership")
    var ownership: OwnershipSchema1?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionActionSchema?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("visiblility")
    var visiblility: VisibilitySchema?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteriaSchema>?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMetaSchema?=null,
    
    @SerializedName("author")
    var author: PromotionAuthorSchema?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMetaSchema1?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionScheduleSchema?=null,
    
    @SerializedName("restrictions")
    var restrictions: RestrictionsSchema1?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionUpdateSchema
*/
@Parcelize
data class PromotionUpdateSchema(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRuleSchema>?=null,
    
    @SerializedName("ownership")
    var ownership: OwnershipSchema1?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionActionSchema?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("visiblility")
    var visiblility: VisibilitySchema?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteriaSchema>?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMetaSchema?=null,
    
    @SerializedName("author")
    var author: PromotionAuthorSchema?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMetaSchema1?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionScheduleSchema?=null,
    
    @SerializedName("restrictions")
    var restrictions: RestrictionsSchema1?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionPartialUpdate
*/
@Parcelize
data class PromotionPartialUpdate(
    
    
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    
    @SerializedName("schedule")
    var schedule: PromotionScheduleSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ActivePromosResponse
*/
@Parcelize
data class ActivePromosResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("entity_slug")
    var entitySlug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("example")
    var example: String?=null,
    
    @SerializedName("is_hidden")
    var isHidden: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartItemSchema
*/
@Parcelize
data class CartItemSchema(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("product_id")
    var productId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenapiCartDetailsRequest
*/
@Parcelize
data class OpenapiCartDetailsRequest(
    
    
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<CartItemSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CouponBreakupSchema
*/
@Parcelize
data class CouponBreakupSchema(
    
    
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RawBreakupSchema
*/
@Parcelize
data class RawBreakupSchema(
    
    
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("mrp_total")
    var mrpTotal: Double?=null,
    
    @SerializedName("gift_card")
    var giftCard: Double?=null,
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("coupon")
    var coupon: Double?=null,
    
    @SerializedName("convenience_fee")
    var convenienceFee: Double?=null,
    
    @SerializedName("vog")
    var vog: Double?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    
    @SerializedName("gst_charges")
    var gstCharges: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    
    
    @SerializedName("applicable")
    var applicable: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayBreakupSchema
*/
@Parcelize
data class DisplayBreakupSchema(
    
    
    
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartBreakupSchema
*/
@Parcelize
data class CartBreakupSchema(
    
    
    
    @SerializedName("coupon")
    var coupon: CouponBreakupSchema?=null,
    
    @SerializedName("raw")
    var raw: RawBreakupSchema?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    
    @SerializedName("display")
    var display: ArrayList<DisplayBreakupSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Ownership
*/
@Parcelize
data class Ownership(
    
    
    
    @SerializedName("payable_category")
    var payableCategory: String?=null,
    
    @SerializedName("payable_by")
    var payableBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FreeGiftItemSchema
*/
@Parcelize
data class FreeGiftItemSchema(
    
    
    
    @SerializedName("item_slug")
    var itemSlug: String?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("item_images_url")
    var itemImagesUrl: ArrayList<String>?=null,
    
    @SerializedName("item_price_details")
    var itemPriceDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_brand_name")
    var itemBrandName: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedFreeArticlesSchema
*/
@Parcelize
data class AppliedFreeArticlesSchema(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("free_gift_item_details")
    var freeGiftItemDetails: FreeGiftItemSchema?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("parent_item_identifier")
    var parentItemIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountRulesAppSchema
*/
@Parcelize
data class DiscountRulesAppSchema(
    
    
    
    @SerializedName("raw_offer")
    var rawOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("offer")
    var offer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_criteria")
    var itemCriteria: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("matched_buy_rules")
    var matchedBuyRules: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BuyRulesSchema
*/
@Parcelize
data class BuyRulesSchema(
    
    
    
    @SerializedName("item_criteria")
    var itemCriteria: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_conditions")
    var cartConditions: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedPromotion
*/
@Parcelize
data class AppliedPromotion(
    
    
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("applied_free_articles")
    var appliedFreeArticles: ArrayList<AppliedFreeArticlesSchema>?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRulesAppSchema>?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<BuyRulesSchema>?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromoMeta
*/
@Parcelize
data class PromoMeta(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CouponDetails
*/
@Parcelize
data class CouponDetails(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("discount_single_quantity")
    var discountSingleQuantity: Double?=null,
    
    @SerializedName("discount_total_quantity")
    var discountTotalQuantity: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("selling")
    var selling: Double?=null,
    
    @SerializedName("add_on")
    var addOn: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("marked")
    var marked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPriceInfo
*/
@Parcelize
data class ProductPriceInfo(
    
    
    
    @SerializedName("converted")
    var converted: ProductPrice?=null,
    
    @SerializedName("base")
    var base: ProductPrice?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromiseTimestamp
*/
@Parcelize
data class PromiseTimestamp(
    
    
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("min")
    var min: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromiseFormatted
*/
@Parcelize
data class PromiseFormatted(
    
    
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("min")
    var min: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentPromise
*/
@Parcelize
data class ShipmentPromise(
    
    
    
    @SerializedName("timestamp")
    var timestamp: PromiseTimestamp?=null,
    
    @SerializedName("formatted")
    var formatted: PromiseFormatted?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartProductIdentifer
*/
@Parcelize
data class CartProductIdentifer(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductAvailabilitySize
*/
@Parcelize
data class ProductAvailabilitySize(
    
    
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("available_sizes")
    var availableSizes: ArrayList<ProductAvailabilitySize>?=null,
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BaseInfo
*/
@Parcelize
data class BaseInfo(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryInfo
*/
@Parcelize
data class CategoryInfo(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: NetQuantity
*/
@Parcelize
data class NetQuantity(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ActionQuery
*/
@Parcelize
data class ActionQuery(
    
    
    
    @SerializedName("product_slug")
    var productSlug: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductAction
*/
@Parcelize
data class ProductAction(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("query")
    var query: ActionQuery?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductImage
*/
@Parcelize
data class ProductImage(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Tags
*/
@Parcelize
data class Tags(
    
    
    
    @SerializedName("tags")
    var tags: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CartProduct
*/
@Parcelize
data class CartProduct(
    
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("action")
    var action: ProductAction?=null,
    
    @SerializedName("images")
    var images: ArrayList<ProductImage>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: Tags?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BasePriceSchema
*/
@Parcelize
data class BasePriceSchema(
    
    
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticlePriceInfo
*/
@Parcelize
data class ArticlePriceInfo(
    
    
    
    @SerializedName("converted")
    var converted: BasePriceSchema?=null,
    
    @SerializedName("base")
    var base: BasePriceSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductArticle
*/
@Parcelize
data class ProductArticle(
    
    
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("gift_card")
    var giftCard: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_gift_visible")
    var isGiftVisible: Boolean?=null,
    
    @SerializedName("store")
    var store: BaseInfo?=null,
    
    @SerializedName("cart_item_meta")
    var cartItemMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    
    
    @SerializedName("promotions_applied")
    var promotionsApplied: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("moq")
    var moq: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: PromoMeta?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("coupon")
    var coupon: CouponDetails?=null,
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductPriceInfo?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    
    @SerializedName("product")
    var product: CartProduct?=null,
    
    @SerializedName("article")
    var article: ProductArticle?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenapiCartDetailsResponse
*/
@Parcelize
data class OpenapiCartDetailsResponse(
    
    
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakupSchema?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiErrorResponse
*/
@Parcelize
data class OpenApiErrorResponse(
    
    
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShippingAddressSchema
*/
@Parcelize
data class ShippingAddressSchema(
    
    
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("phone")
    var phone: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiCartServiceabilityRequest
*/
@Parcelize
data class OpenApiCartServiceabilityRequest(
    
    
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<CartItemSchema>?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddressSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiCartServiceabilityResponse
*/
@Parcelize
data class OpenApiCartServiceabilityResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakupSchema?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MultiTenderPaymentMeta
*/
@Parcelize
data class MultiTenderPaymentMeta(
    
    
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MultiTenderPaymentMethod
*/
@Parcelize
data class MultiTenderPaymentMethod(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("meta")
    var meta: MultiTenderPaymentMeta?=null,
    
    @SerializedName("mode")
    var mode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartItemMeta
*/
@Parcelize
data class CartItemMeta(
    
    
    
    @SerializedName("primary_item")
    var primaryItem: Boolean?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiFilesSchema
*/
@Parcelize
data class OpenApiFilesSchema(
    
    
    
    @SerializedName("values")
    var values: ArrayList<String>?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiOrderItemSchema
*/
@Parcelize
data class OpenApiOrderItemSchema(
    
    
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("meta")
    var meta: CartItemMeta?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFilesSchema>?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("product_id")
    var productId: Int?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiPlatformCheckoutReqSchema
*/
@Parcelize
data class OpenApiPlatformCheckoutReqSchema(
    
    
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<OpenApiOrderItemSchema>?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddressSchema?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("coupon")
    var coupon: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFilesSchema>?=null,
    
    @SerializedName("billing_address")
    var billingAddress: ShippingAddressSchema?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiCheckoutResponse
*/
@Parcelize
data class OpenApiCheckoutResponse(
    
    
    
    @SerializedName("order_ref_id")
    var orderRefId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AbandonedCart
*/
@Parcelize
data class AbandonedCart(
    
    
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("is_archive")
    var isArchive: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("bulk_coupon_discount")
    var bulkCouponDiscount: Double?=null,
    
    @SerializedName("promotion")
    var promotion: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipments")
    var shipments: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("fc_index_map")
    var fcIndexMap: ArrayList<Int>?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payments")
    var payments: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("merge_qty")
    var mergeQty: Boolean?=null,
    
    @SerializedName("cashback")
    var cashback: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("expire_at")
    var expireAt: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AbandonedCartResponseSchema
*/
@Parcelize
data class AbandonedCartResponseSchema(
    
    
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<AbandonedCart>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentSelectionLock
*/
@Parcelize
data class PaymentSelectionLock(
    
    
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("default_options")
    var defaultOptions: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartCurrencySchema
*/
@Parcelize
data class CartCurrencySchema(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartDetailResponse
*/
@Parcelize
data class CartDetailResponse(
    
    
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrencySchema?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakupSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: ArrayList<HashMap<String,String>>?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddCartRequest
*/
@Parcelize
data class AddCartRequest(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AddProductCart>?=null,
    
    @SerializedName("new_cart")
    var newCart: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AddCartDetailResponse
*/
@Parcelize
data class AddCartDetailResponse(
    
    
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null,
    
    @SerializedName("partial")
    var partial: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartRequest
*/
@Parcelize
data class UpdateCartRequest(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UpdateProductCart>?=null,
    
    @SerializedName("operation")
    var operation: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartDetailResponse
*/
@Parcelize
data class UpdateCartDetailResponse(
    
    
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetShareCartLinkRequest
*/
@Parcelize
data class GetShareCartLinkRequest(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetShareCartLinkResponse
*/
@Parcelize
data class GetShareCartLinkResponse(
    
    
    
    @SerializedName("share_url")
    var shareUrl: String?=null,
    
    @SerializedName("token")
    var token: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SharedCartDetails
*/
@Parcelize
data class SharedCartDetails(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SharedCart
*/
@Parcelize
data class SharedCart(
    
    
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrencySchema?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakupSchema?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SharedCartResponse
*/
@Parcelize
data class SharedCartResponse(
    
    
    
    @SerializedName("cart")
    var cart: SharedCart?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartListSchema
*/
@Parcelize
data class CartListSchema(
    
    
    
    @SerializedName("item_counts")
    var itemCounts: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MultiCartResponseSchema
*/
@Parcelize
data class MultiCartResponseSchema(
    
    
    
    @SerializedName("data")
    var data: ArrayList<CartListSchema>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateUserCartMapping
*/
@Parcelize
data class UpdateUserCartMapping(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UserInfoSchema
*/
@Parcelize
data class UserInfoSchema(
    
    
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("external_id")
    var externalId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserCartMappingResponse
*/
@Parcelize
data class UserCartMappingResponse(
    
    
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("user")
    var user: UserInfoSchema?=null,
    
    @SerializedName("currency")
    var currency: CartCurrencySchema?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakupSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteCartRequest
*/
@Parcelize
data class DeleteCartRequest(
    
    
    
    @SerializedName("cart_id_list")
    var cartIdList: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DeleteCartDetailResponse
*/
@Parcelize
data class DeleteCartDetailResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartItemCountResponse
*/
@Parcelize
data class CartItemCountResponse(
    
    
    
    @SerializedName("user_cart_items_count")
    var userCartItemsCount: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PageCouponSchema
*/
@Parcelize
data class PageCouponSchema(
    
    
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCouponResponse
*/
@Parcelize
data class GetCouponResponse(
    
    
    
    @SerializedName("available_coupon_list")
    var availableCouponList: ArrayList<Coupon>?=null,
    
    @SerializedName("page")
    var page: PageCouponSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplyCouponRequest
*/
@Parcelize
data class ApplyCouponRequest(
    
    
    
    @SerializedName("coupon_code")
    var couponCode: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GeoLocation
*/
@Parcelize
data class GeoLocation(
    
    
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformAddress
*/
@Parcelize
data class PlatformAddress(
    
    
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by_user_id")
    var createdByUserId: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("google_map_point")
    var googleMapPoint: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("country")
    var country: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformGetAddressesResponse
*/
@Parcelize
data class PlatformGetAddressesResponse(
    
    
    
    @SerializedName("address")
    var address: ArrayList<PlatformAddress>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SaveAddressResponse
*/
@Parcelize
data class SaveAddressResponse(
    
    
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateAddressResponse
*/
@Parcelize
data class UpdateAddressResponse(
    
    
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("is_updated")
    var isUpdated: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteAddressResponse
*/
@Parcelize
data class DeleteAddressResponse(
    
    
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformSelectCartAddressRequest
*/
@Parcelize
data class PlatformSelectCartAddressRequest(
    
    
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    
    
    @SerializedName("shipments")
    var shipments: Int?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("promise")
    var promise: ShipmentPromise?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrencySchema?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakupSchema?=null,
    
    @SerializedName("error")
    var error: Boolean?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartShipmentItem
*/
@Parcelize
data class UpdateCartShipmentItem(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("article_uid")
    var articleUid: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartShipmentRequest
*/
@Parcelize
data class UpdateCartShipmentRequest(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<UpdateCartShipmentItem>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GiftDetailSchema
*/
@Parcelize
data class GiftDetailSchema(
    
    
    
    @SerializedName("gift_message")
    var giftMessage: String?=null,
    
    @SerializedName("is_gift_applied")
    var isGiftApplied: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleGiftDetailSchema
*/
@Parcelize
data class ArticleGiftDetailSchema(
    
    
    
    @SerializedName("article_id")
    var articleId: GiftDetailSchema?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PlatformCartMetaRequest
*/
@Parcelize
data class PlatformCartMetaRequest(
    
    
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("gift_details")
    var giftDetails: ArticleGiftDetailSchema?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaResponse
*/
@Parcelize
data class CartMetaResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CartMetaMissingResponse
*/
@Parcelize
data class CartMetaMissingResponse(
    
    
    
    @SerializedName("errors")
    var errors: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: StaffCheckoutSchema
*/
@Parcelize
data class StaffCheckoutSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FilesSchema
*/
@Parcelize
data class FilesSchema(
    
    
    
    @SerializedName("values")
    var values: ArrayList<String>?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformCartCheckoutDetailRequest
*/
@Parcelize
data class PlatformCartCheckoutDetailRequest(
    
    
    
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("staff")
    var staff: StaffCheckoutSchema?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("files")
    var files: ArrayList<FilesSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CheckCartSchema
*/
@Parcelize
data class CheckCartSchema(
    
    
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrencySchema?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakupSchema?=null,
    
    @SerializedName("cod_message")
    var codMessage: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartCheckoutResponseSchema
*/
@Parcelize
data class CartCheckoutResponseSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("cart")
    var cart: CheckCartSchema?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartDeliveryModesResponse
*/
@Parcelize
data class CartDeliveryModesResponse(
    
    
    
    @SerializedName("pickup_stores")
    var pickupStores: ArrayList<Int>?=null,
    
    @SerializedName("available_modes")
    var availableModes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PickupStoreDetail
*/
@Parcelize
data class PickupStoreDetail(
    
    
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDetailsResponse
*/
@Parcelize
data class StoreDetailsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<PickupStoreDetail>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UpdateCartPaymentRequest
*/
@Parcelize
data class UpdateCartPaymentRequest(
    
    
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponValidity
*/
@Parcelize
data class CouponValidity(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("valid")
    var valid: Boolean?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("display_message_en")
    var displayMessageEn: String?=null,
    
    @SerializedName("discount")
    var discount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCouponValidateSchema
*/
@Parcelize
data class PaymentCouponValidateSchema(
    
    
    
    @SerializedName("coupon_validity")
    var couponValidity: CouponValidity?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMetaSchema
*/
@Parcelize
data class PaymentMetaSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethodSchema
*/
@Parcelize
data class PaymentMethodSchema(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("payment")
    var payment: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("payment_meta")
    var paymentMeta: PaymentMetaSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformCartCheckoutDetailV2Request
*/
@Parcelize
data class PlatformCartCheckoutDetailV2Request(
    
    
    
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethodSchema>?=null,
    
    @SerializedName("staff")
    var staff: StaffCheckoutSchema?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("files")
    var files: ArrayList<FilesSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartPaymentRequestV2
*/
@Parcelize
data class UpdateCartPaymentRequestV2(
    
    
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethodSchema>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



