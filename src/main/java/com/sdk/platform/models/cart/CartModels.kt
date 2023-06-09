package com.sdk.platform.models.cart

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: CouponSchedule
*/
@Parcelize
data class CouponSchedule(
    
    
    
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Validity
*/
@Parcelize
data class Validity(
    
    
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UsesRemaining
*/
@Parcelize
data class UsesRemaining(
    
    
    
    @SerializedName("user")
    var user: Int?=null,
    
    @SerializedName("app")
    var app: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UsesRestriction
*/
@Parcelize
data class UsesRestriction(
    
    
    
    @SerializedName("maximum")
    var maximum: UsesRemaining?=null,
    
    @SerializedName("remaining")
    var remaining: UsesRemaining?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PriceRange
*/
@Parcelize
data class PriceRange(
    
    
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PostOrder
*/
@Parcelize
data class PostOrder(
    
    
    
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null,
    
    @SerializedName("cancellation_allowed")
    var cancellationAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentAllowValue
*/
@Parcelize
data class PaymentAllowValue(
    
    
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PaymentModes
*/
@Parcelize
data class PaymentModes(
    
    
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null,
    
    @SerializedName("networks")
    var networks: ArrayList<String>?=null,
    
    @SerializedName("uses")
    var uses: PaymentAllowValue?=null,
    
    @SerializedName("types")
    var types: ArrayList<String>?=null
    
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
    Model: Restrictions
*/
@Parcelize
data class Restrictions(
    
    
    
    @SerializedName("coupon_allowed")
    var couponAllowed: Boolean?=null,
    
    @SerializedName("uses")
    var uses: UsesRestriction?=null,
    
    @SerializedName("price_range")
    var priceRange: PriceRange?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("ordering_stores")
    var orderingStores: ArrayList<Int>?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrder?=null,
    
    @SerializedName("payments")
    var payments: HashMap<String,PaymentModes>?=null,
    
    @SerializedName("bulk_bundle")
    var bulkBundle: BulkBundleRestriction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    
    
    @SerializedName("store_id")
    var storeId: ArrayList<Int>?=null,
    
    @SerializedName("article_id")
    var articleId: ArrayList<String>?=null,
    
    @SerializedName("exclude_brand_id")
    var excludeBrandId: ArrayList<Int>?=null,
    
    @SerializedName("company_id")
    var companyId: ArrayList<Int>?=null,
    
    @SerializedName("collection_id")
    var collectionId: ArrayList<String>?=null,
    
    @SerializedName("category_id")
    var categoryId: ArrayList<Int>?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    
    @SerializedName("brand_id")
    var brandId: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayMetaDict
*/
@Parcelize
data class DisplayMetaDict(
    
    
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayMeta
*/
@Parcelize
data class DisplayMeta(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("apply")
    var apply: DisplayMetaDict?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("remove")
    var remove: DisplayMetaDict?=null,
    
    @SerializedName("auto")
    var auto: DisplayMetaDict?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponDateMeta
*/
@Parcelize
data class CouponDateMeta(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Rule
*/
@Parcelize
data class Rule(
    
    
    
    @SerializedName("key")
    var key: Double?=null,
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("discount_qty")
    var discountQty: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: State
*/
@Parcelize
data class State(
    
    
    
    @SerializedName("is_public")
    var isPublic: Boolean?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("is_display")
    var isDisplay: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponAuthor
*/
@Parcelize
data class CouponAuthor(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CouponAction
*/
@Parcelize
data class CouponAction(
    
    
    
    @SerializedName("action_date")
    var actionDate: String?=null,
    
    @SerializedName("txn_mode")
    var txnMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: RuleDefinition
*/
@Parcelize
data class RuleDefinition(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value_type")
    var valueType: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("scope")
    var scope: ArrayList<String>?=null,
    
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    
    @SerializedName("applicable_on")
    var applicableOn: String?=null,
    
    @SerializedName("is_exact")
    var isExact: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Ownership
*/
@Parcelize
data class Ownership(
    
    
    
    @SerializedName("payable_by")
    var payableBy: String?=null,
    
    @SerializedName("payable_category")
    var payableCategory: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Validation
*/
@Parcelize
data class Validation(
    
    
    
    @SerializedName("app_id")
    var appId: ArrayList<String>?=null,
    
    @SerializedName("user_registered_after")
    var userRegisteredAfter: String?=null,
    
    @SerializedName("anonymous")
    var anonymous: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponAdd
*/
@Parcelize
data class CouponAdd(
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("validity")
    var validity: Validity?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("action")
    var action: CouponAction?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("validation")
    var validation: Validation?=null
    
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
    var items: CouponAdd?=null,
    
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
    Model: CouponUpdate
*/
@Parcelize
data class CouponUpdate(
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("validity")
    var validity: Validity?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("action")
    var action: CouponAction?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("validation")
    var validation: Validation?=null
    
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
    var schedule: CouponSchedule?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Visibility
*/
@Parcelize
data class Visibility(
    
    
    
    @SerializedName("pdp")
    var pdp: Boolean?=null,
    
    @SerializedName("coupon_list")
    var couponList: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompareObject
*/
@Parcelize
data class CompareObject(
    
    
    
    @SerializedName("greater_than")
    var greaterThan: Double?=null,
    
    @SerializedName("equals")
    var equals: Double?=null,
    
    @SerializedName("less_than")
    var lessThan: Double?=null,
    
    @SerializedName("less_than_equals")
    var lessThanEquals: Double?=null,
    
    @SerializedName("greater_than_equals")
    var greaterThanEquals: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ItemCriteria
*/
@Parcelize
data class ItemCriteria(
    
    
    
    @SerializedName("cart_total")
    var cartTotal: CompareObject?=null,
    
    @SerializedName("cart_quantity")
    var cartQuantity: CompareObject?=null,
    
    @SerializedName("cart_unique_item_quantity")
    var cartUniqueItemQuantity: CompareObject?=null,
    
    @SerializedName("item_exclude_brand")
    var itemExcludeBrand: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_category")
    var itemExcludeCategory: ArrayList<Int>?=null,
    
    @SerializedName("item_store")
    var itemStore: ArrayList<Int>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_store")
    var itemExcludeStore: ArrayList<Int>?=null,
    
    @SerializedName("item_company")
    var itemCompany: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_sku")
    var itemExcludeSku: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_id")
    var itemExcludeId: ArrayList<Int>?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    
    @SerializedName("item_category")
    var itemCategory: ArrayList<Int>?=null,
    
    @SerializedName("cart_unique_item_amount")
    var cartUniqueItemAmount: CompareObject?=null,
    
    @SerializedName("item_brand")
    var itemBrand: ArrayList<Int>?=null,
    
    @SerializedName("item_size")
    var itemSize: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_company")
    var itemExcludeCompany: ArrayList<Int>?=null,
    
    @SerializedName("all_items")
    var allItems: Boolean?=null,
    
    @SerializedName("item_sku")
    var itemSku: ArrayList<String>?=null,
    
    @SerializedName("available_zones")
    var availableZones: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountOffer
*/
@Parcelize
data class DiscountOffer(
    
    
    
    @SerializedName("partial_can_ret")
    var partialCanRet: Boolean?=null,
    
    @SerializedName("discount_amount")
    var discountAmount: Double?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("max_discount_amount")
    var maxDiscountAmount: Double?=null,
    
    @SerializedName("max_offer_quantity")
    var maxOfferQuantity: Int?=null,
    
    @SerializedName("min_offer_quantity")
    var minOfferQuantity: Int?=null,
    
    @SerializedName("discount_percentage")
    var discountPercentage: Double?=null,
    
    @SerializedName("discount_price")
    var discountPrice: Double?=null,
    
    @SerializedName("max_usage_per_transaction")
    var maxUsagePerTransaction: Int?=null,
    
    @SerializedName("apportion_discount")
    var apportionDiscount: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountRule
*/
@Parcelize
data class DiscountRule(
    
    
    
    @SerializedName("discount_type")
    var discountType: String?=null,
    
    @SerializedName("buy_condition")
    var buyCondition: String?=null,
    
    @SerializedName("item_criteria")
    var itemCriteria: ItemCriteria?=null,
    
    @SerializedName("offer")
    var offer: DiscountOffer?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionSchedule
*/
@Parcelize
data class PromotionSchedule(
    
    
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Ownership1
*/
@Parcelize
data class Ownership1(
    
    
    
    @SerializedName("payable_by")
    var payableBy: String?=null,
    
    @SerializedName("payable_category")
    var payableCategory: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UsesRemaining1
*/
@Parcelize
data class UsesRemaining1(
    
    
    
    @SerializedName("user")
    var user: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UsesRestriction1
*/
@Parcelize
data class UsesRestriction1(
    
    
    
    @SerializedName("maximum")
    var maximum: UsesRemaining1?=null,
    
    @SerializedName("remaining")
    var remaining: UsesRemaining1?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserRegistered
*/
@Parcelize
data class UserRegistered(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PostOrder1
*/
@Parcelize
data class PostOrder1(
    
    
    
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null,
    
    @SerializedName("cancellation_allowed")
    var cancellationAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentAllowValue1
*/
@Parcelize
data class PaymentAllowValue1(
    
    
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PromotionPaymentModes
*/
@Parcelize
data class PromotionPaymentModes(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("uses")
    var uses: PaymentAllowValue1?=null,
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Restrictions1
*/
@Parcelize
data class Restrictions1(
    
    
    
    @SerializedName("anonymous_users")
    var anonymousUsers: Boolean?=null,
    
    @SerializedName("uses")
    var uses: UsesRestriction1?=null,
    
    @SerializedName("user_registered")
    var userRegistered: UserRegistered?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrder1?=null,
    
    @SerializedName("payments")
    var payments: ArrayList<PromotionPaymentModes>?=null,
    
    @SerializedName("order_quantity")
    var orderQuantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionDateMeta
*/
@Parcelize
data class PromotionDateMeta(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionAction
*/
@Parcelize
data class PromotionAction(
    
    
    
    @SerializedName("action_date")
    var actionDate: String?=null,
    
    @SerializedName("action_type")
    var actionType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionAuthor
*/
@Parcelize
data class PromotionAuthor(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayMeta1
*/
@Parcelize
data class DisplayMeta1(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionListItem
*/
@Parcelize
data class PromotionListItem(
    
    
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null
    
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
    Model: PromotionAdd
*/
@Parcelize
data class PromotionAdd(
    
    
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionUpdate
*/
@Parcelize
data class PromotionUpdate(
    
    
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null
    
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
    var schedule: PromotionSchedule?=null
    
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
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("example")
    var example: String?=null,
    
    @SerializedName("is_hidden")
    var isHidden: Boolean?=null,
    
    @SerializedName("entity_slug")
    var entitySlug: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Charges
*/
@Parcelize
data class Charges(
    
    
    
    @SerializedName("threshold")
    var threshold: Int?=null,
    
    @SerializedName("charges")
    var charges: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DeliveryCharges
*/
@Parcelize
data class DeliveryCharges(
    
    
    
    @SerializedName("charges")
    var charges: ArrayList<Charges>?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaConfigUpdate
*/
@Parcelize
data class CartMetaConfigUpdate(
    
    
    
    @SerializedName("gift_pricing")
    var giftPricing: Double?=null,
    
    @SerializedName("bulk_coupons")
    var bulkCoupons: Boolean?=null,
    
    @SerializedName("min_cart_value")
    var minCartValue: Int?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: DeliveryCharges?=null,
    
    @SerializedName("gift_display_text")
    var giftDisplayText: String?=null,
    
    @SerializedName("revenue_engine_coupon")
    var revenueEngineCoupon: Boolean?=null,
    
    @SerializedName("max_cart_items")
    var maxCartItems: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaConfigAdd
*/
@Parcelize
data class CartMetaConfigAdd(
    
    
    
    @SerializedName("gift_pricing")
    var giftPricing: Double?=null,
    
    @SerializedName("bulk_coupons")
    var bulkCoupons: Boolean?=null,
    
    @SerializedName("min_cart_value")
    var minCartValue: Int?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: DeliveryCharges?=null,
    
    @SerializedName("gift_display_text")
    var giftDisplayText: String?=null,
    
    @SerializedName("revenue_engine_coupon")
    var revenueEngineCoupon: Boolean?=null,
    
    @SerializedName("max_cart_items")
    var maxCartItems: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartItem
*/
@Parcelize
data class CartItem(
    
    
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
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
    var cartItems: ArrayList<CartItem>?=null
    
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
    Model: ShipmentPromise
*/
@Parcelize
data class ShipmentPromise(
    
    
    
    @SerializedName("formatted")
    var formatted: PromiseFormatted?=null,
    
    @SerializedName("timestamp")
    var timestamp: PromiseTimestamp?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BasePrice
*/
@Parcelize
data class BasePrice(
    
    
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
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
    var converted: BasePrice?=null,
    
    @SerializedName("base")
    var base: BasePrice?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BaseInfo
*/
@Parcelize
data class BaseInfo(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductArticle
*/
@Parcelize
data class ProductArticle(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    
    @SerializedName("store")
    var store: BaseInfo?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductAvailabilitySize
*/
@Parcelize
data class ProductAvailabilitySize(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("available_sizes")
    var availableSizes: ArrayList<ProductAvailabilitySize>?=null,
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("selling")
    var selling: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("add_on")
    var addOn: Double?=null
    
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
    Model: CartProductIdentifer
*/
@Parcelize
data class CartProductIdentifer(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null
    
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
    Model: CategoryInfo
*/
@Parcelize
data class CategoryInfo(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
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
    
    @SerializedName("query")
    var query: ActionQuery?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductImage
*/
@Parcelize
data class ProductImage(
    
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartProduct
*/
@Parcelize
data class CartProduct(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    
    @SerializedName("action")
    var action: ProductAction?=null,
    
    @SerializedName("images")
    var images: ArrayList<ProductImage>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BuyRules
*/
@Parcelize
data class BuyRules(
    
    
    
    @SerializedName("item_criteria")
    var itemCriteria: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_conditions")
    var cartConditions: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FreeGiftItem
*/
@Parcelize
data class FreeGiftItem(
    
    
    
    @SerializedName("item_slug")
    var itemSlug: String?=null,
    
    @SerializedName("item_images_url")
    var itemImagesUrl: ArrayList<String>?=null,
    
    @SerializedName("item_brand_name")
    var itemBrandName: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_price_details")
    var itemPriceDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedFreeArticles
*/
@Parcelize
data class AppliedFreeArticles(
    
    
    
    @SerializedName("parent_item_identifier")
    var parentItemIdentifier: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("free_gift_item_details")
    var freeGiftItemDetails: FreeGiftItem?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountRulesApp
*/
@Parcelize
data class DiscountRulesApp(
    
    
    
    @SerializedName("matched_buy_rules")
    var matchedBuyRules: ArrayList<String>?=null,
    
    @SerializedName("item_criteria")
    var itemCriteria: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("raw_offer")
    var rawOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("offer")
    var offer: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Ownership2
*/
@Parcelize
data class Ownership2(
    
    
    
    @SerializedName("payable_by")
    var payableBy: String?=null,
    
    @SerializedName("payable_category")
    var payableCategory: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedPromotion
*/
@Parcelize
data class AppliedPromotion(
    
    
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<BuyRules>?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null,
    
    @SerializedName("applied_free_articles")
    var appliedFreeArticles: ArrayList<AppliedFreeArticles>?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRulesApp>?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership2?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("article")
    var article: ProductArticle?=null,
    
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("moq")
    var moq: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: PromoMeta?=null,
    
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product")
    var product: CartProduct?=null,
    
    @SerializedName("promotions_applied")
    var promotionsApplied: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductPriceInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("applicable")
    var applicable: Double?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("total")
    var total: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    
    
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    
    @SerializedName("convenience_fee")
    var convenienceFee: Double?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("vog")
    var vog: Double?=null,
    
    @SerializedName("gst_charges")
    var gstCharges: Double?=null,
    
    @SerializedName("mrp_total")
    var mrpTotal: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    
    @SerializedName("coupon")
    var coupon: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null,
    
    @SerializedName("raw")
    var raw: RawBreakup?=null,
    
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenapiCartDetailsResponse
*/
@Parcelize
data class OpenapiCartDetailsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiErrorResponse
*/
@Parcelize
data class OpenApiErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShippingAddress
*/
@Parcelize
data class ShippingAddress(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiCartServiceabilityRequest
*/
@Parcelize
data class OpenApiCartServiceabilityRequest(
    
    
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddress?=null,
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<CartItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiCartServiceabilityResponse
*/
@Parcelize
data class OpenApiCartServiceabilityResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiFiles
*/
@Parcelize
data class OpenApiFiles(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("values")
    var values: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MultiTenderPaymentMeta
*/
@Parcelize
data class MultiTenderPaymentMeta(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
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
    Model: OpenApiOrderItem
*/
@Parcelize
data class OpenApiOrderItem(
    
    
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFiles>?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("product_id")
    var productId: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("meta")
    var meta: CartItemMeta?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiPlatformCheckoutReq
*/
@Parcelize
data class OpenApiPlatformCheckoutReq(
    
    
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddress?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFiles>?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("coupon")
    var coupon: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: ShippingAddress?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<OpenApiOrderItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiCheckoutResponse
*/
@Parcelize
data class OpenApiCheckoutResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("order_ref_id")
    var orderRefId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AbandonedCart
*/
@Parcelize
data class AbandonedCart(
    
    
    
    @SerializedName("cod_charges")
    var codCharges: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("merge_qty")
    var mergeQty: Boolean?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("bulk_coupon_discount")
    var bulkCouponDiscount: Double?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("payments")
    var payments: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promotion")
    var promotion: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cashback")
    var cashback: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipments")
    var shipments: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fc_index_map")
    var fcIndexMap: ArrayList<Int>?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("expire_at")
    var expireAt: String?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("is_archive")
    var isArchive: Boolean?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AbandonedCartResponse
*/
@Parcelize
data class AbandonedCartResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: ArrayList<AbandonedCart>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartCurrency
*/
@Parcelize
data class CartCurrency(
    
    
    
    @SerializedName("symbol")
    var symbol: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentSelectionLock
*/
@Parcelize
data class PaymentSelectionLock(
    
    
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("default_options")
    var defaultOptions: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartDetailResponse
*/
@Parcelize
data class CartDetailResponse(
    
    
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: ArrayList<HashMap<String,String>>?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddCartRequest
*/
@Parcelize
data class AddCartRequest(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AddProductCart>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AddCartDetailResponse
*/
@Parcelize
data class AddCartDetailResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("partial")
    var partial: Boolean?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
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
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OverrideCartItemPromo
*/
@Parcelize
data class OverrideCartItemPromo(
    
    
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("promo_amount")
    var promoAmount: String?=null,
    
    @SerializedName("item_list")
    var itemList: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("promo_desc")
    var promoDesc: String?=null,
    
    @SerializedName("rwrd_tndr")
    var rwrdTndr: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OverrideCartItem
*/
@Parcelize
data class OverrideCartItem(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("promo_list")
    var promoList: ArrayList<OverrideCartItemPromo>?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OverrideCheckoutReq
*/
@Parcelize
data class OverrideCheckoutReq(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<OverrideCartItem>?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OverrideCheckoutResponse
*/
@Parcelize
data class OverrideCheckoutResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("cart")
    var cart: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



