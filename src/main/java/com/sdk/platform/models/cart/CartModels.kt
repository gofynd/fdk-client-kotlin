package com.sdk.platform.models.cart

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
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
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    
    @SerializedName("company_id")
    var companyId: ArrayList<Int>?=null,
    
    @SerializedName("category_id")
    var categoryId: ArrayList<Int>?=null,
    
    @SerializedName("exclude_brand_id")
    var excludeBrandId: ArrayList<Int>?=null,
    
    @SerializedName("article_id")
    var articleId: ArrayList<String>?=null,
    
    @SerializedName("collection_id")
    var collectionId: ArrayList<String>?=null,
    
    @SerializedName("brand_id")
    var brandId: ArrayList<Int>?=null,
    
    @SerializedName("store_id")
    var storeId: ArrayList<Int>?=null
    
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
    Model: State
*/
@Parcelize
data class State(
    
    
    
    @SerializedName("is_display")
    var isDisplay: Boolean?=null,
    
    @SerializedName("is_public")
    var isPublic: Boolean?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null
    
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
    Model: DisplayMetaDict
*/
@Parcelize
data class DisplayMetaDict(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayMeta
*/
@Parcelize
data class DisplayMeta(
    
    
    
    @SerializedName("apply")
    var apply: DisplayMetaDict?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("remove")
    var remove: DisplayMetaDict?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("auto")
    var auto: DisplayMetaDict?=null
    
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
    Model: BulkBundleRestriction
*/
@Parcelize
data class BulkBundleRestriction(
    
    
    
    @SerializedName("multi_store_allowed")
    var multiStoreAllowed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PriceRange
*/
@Parcelize
data class PriceRange(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UsesRemaining
*/
@Parcelize
data class UsesRemaining(
    
    
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("app")
    var app: Int?=null,
    
    @SerializedName("user")
    var user: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UsesRestriction
*/
@Parcelize
data class UsesRestriction(
    
    
    
    @SerializedName("remaining")
    var remaining: UsesRemaining?=null,
    
    @SerializedName("maximum")
    var maximum: UsesRemaining?=null
    
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
    
    
    
    @SerializedName("types")
    var types: ArrayList<String>?=null,
    
    @SerializedName("networks")
    var networks: ArrayList<String>?=null,
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null,
    
    @SerializedName("uses")
    var uses: PaymentAllowValue?=null
    
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
    Model: Restrictions
*/
@Parcelize
data class Restrictions(
    
    
    
    @SerializedName("coupon_allowed")
    var couponAllowed: Boolean?=null,
    
    @SerializedName("bulk_bundle")
    var bulkBundle: BulkBundleRestriction?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("price_range")
    var priceRange: PriceRange?=null,
    
    @SerializedName("uses")
    var uses: UsesRestriction?=null,
    
    @SerializedName("payments")
    var payments: HashMap<String,PaymentModes>?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrder?=null,
    
    @SerializedName("ordering_stores")
    var orderingStores: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponSchedule
*/
@Parcelize
data class CouponSchedule(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("cron")
    var cron: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Validation
*/
@Parcelize
data class Validation(
    
    
    
    @SerializedName("app_id")
    var appId: ArrayList<String>?=null,
    
    @SerializedName("anonymous")
    var anonymous: Boolean?=null,
    
    @SerializedName("user_registered_after")
    var userRegisteredAfter: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RuleDefinition
*/
@Parcelize
data class RuleDefinition(
    
    
    
    @SerializedName("scope")
    var scope: ArrayList<String>?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("applicable_on")
    var applicableOn: String?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    
    @SerializedName("value_type")
    var valueType: String?=null,
    
    @SerializedName("is_exact")
    var isExact: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Rule
*/
@Parcelize
data class Rule(
    
    
    
    @SerializedName("key")
    var key: Double?=null,
    
    @SerializedName("discount_qty")
    var discountQty: Double?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponAdd
*/
@Parcelize
data class CouponAdd(
    
    
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("validity")
    var validity: Validity?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("action")
    var action: CouponAction?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("validation")
    var validation: Validation?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponsResponse
*/
@Parcelize
data class CouponsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: CouponAdd?=null
    
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
    
    
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("validity")
    var validity: Validity?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("action")
    var action: CouponAction?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("validation")
    var validation: Validation?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponPartialUpdate
*/
@Parcelize
data class CouponPartialUpdate(
    
    
    
    @SerializedName("schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("archive")
    var archive: Boolean?=null
    
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
    Model: Visibility
*/
@Parcelize
data class Visibility(
    
    
    
    @SerializedName("coupon_list")
    var couponList: Boolean?=null,
    
    @SerializedName("pdp")
    var pdp: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Ownership1
*/
@Parcelize
data class Ownership1(
    
    
    
    @SerializedName("payable_category")
    var payableCategory: String?=null,
    
    @SerializedName("payable_by")
    var payableBy: String?=null
    
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
    Model: PromotionSchedule
*/
@Parcelize
data class PromotionSchedule(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("cron")
    var cron: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UsesRemaining1
*/
@Parcelize
data class UsesRemaining1(
    
    
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("user")
    var user: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UsesRestriction1
*/
@Parcelize
data class UsesRestriction1(
    
    
    
    @SerializedName("remaining")
    var remaining: UsesRemaining1?=null,
    
    @SerializedName("maximum")
    var maximum: UsesRemaining1?=null
    
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
    
    
    
    @SerializedName("uses")
    var uses: PaymentAllowValue1?=null,
    
    @SerializedName("codes")
    var codes: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    Model: Restrictions1
*/
@Parcelize
data class Restrictions1(
    
    
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("uses")
    var uses: UsesRestriction1?=null,
    
    @SerializedName("user_registered")
    var userRegistered: UserRegistered?=null,
    
    @SerializedName("payments")
    var payments: ArrayList<PromotionPaymentModes>?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("anonymous_users")
    var anonymousUsers: Boolean?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrder1?=null,
    
    @SerializedName("order_quantity")
    var orderQuantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompareObject
*/
@Parcelize
data class CompareObject(
    
    
    
    @SerializedName("greater_than")
    var greaterThan: Double?=null,
    
    @SerializedName("less_than_equals")
    var lessThanEquals: Double?=null,
    
    @SerializedName("less_than")
    var lessThan: Double?=null,
    
    @SerializedName("greater_than_equals")
    var greaterThanEquals: Double?=null,
    
    @SerializedName("equals")
    var equals: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ItemCriteria
*/
@Parcelize
data class ItemCriteria(
    
    
    
    @SerializedName("product_tags")
    var productTags: ArrayList<String>?=null,
    
    @SerializedName("cart_unique_item_quantity")
    var cartUniqueItemQuantity: CompareObject?=null,
    
    @SerializedName("cart_total")
    var cartTotal: CompareObject?=null,
    
    @SerializedName("cart_quantity")
    var cartQuantity: CompareObject?=null,
    
    @SerializedName("all_items")
    var allItems: Boolean?=null,
    
    @SerializedName("item_exclude_sku")
    var itemExcludeSku: ArrayList<String>?=null,
    
    @SerializedName("item_company")
    var itemCompany: ArrayList<Int>?=null,
    
    @SerializedName("item_category")
    var itemCategory: ArrayList<Int>?=null,
    
    @SerializedName("item_size")
    var itemSize: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_brand")
    var itemExcludeBrand: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_id")
    var itemExcludeId: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_store")
    var itemExcludeStore: ArrayList<Int>?=null,
    
    @SerializedName("item_sku")
    var itemSku: ArrayList<String>?=null,
    
    @SerializedName("cart_unique_item_amount")
    var cartUniqueItemAmount: CompareObject?=null,
    
    @SerializedName("item_exclude_category")
    var itemExcludeCategory: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_company")
    var itemExcludeCompany: ArrayList<Int>?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    
    @SerializedName("item_store")
    var itemStore: ArrayList<Int>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<String>?=null,
    
    @SerializedName("available_zones")
    var availableZones: ArrayList<String>?=null,
    
    @SerializedName("item_brand")
    var itemBrand: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountOffer
*/
@Parcelize
data class DiscountOffer(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("discount_price")
    var discountPrice: Double?=null,
    
    @SerializedName("discount_amount")
    var discountAmount: Double?=null,
    
    @SerializedName("max_offer_quantity")
    var maxOfferQuantity: Int?=null,
    
    @SerializedName("max_discount_amount")
    var maxDiscountAmount: Double?=null,
    
    @SerializedName("discount_percentage")
    var discountPercentage: Double?=null,
    
    @SerializedName("partial_can_ret")
    var partialCanRet: Boolean?=null,
    
    @SerializedName("apportion_discount")
    var apportionDiscount: Boolean?=null,
    
    @SerializedName("min_offer_quantity")
    var minOfferQuantity: Int?=null,
    
    @SerializedName("max_usage_per_transaction")
    var maxUsagePerTransaction: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountRule
*/
@Parcelize
data class DiscountRule(
    
    
    
    @SerializedName("item_criteria")
    var itemCriteria: ItemCriteria?=null,
    
    @SerializedName("offer")
    var offer: DiscountOffer?=null,
    
    @SerializedName("discount_type")
    var discountType: String?=null,
    
    @SerializedName("buy_condition")
    var buyCondition: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayMeta1
*/
@Parcelize
data class DisplayMeta1(
    
    
    
    @SerializedName("offer_label")
    var offerLabel: String?=null,
    
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
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionsResponse
*/
@Parcelize
data class PromotionsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: PromotionListItem?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionAdd
*/
@Parcelize
data class PromotionAdd(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionUpdate
*/
@Parcelize
data class PromotionUpdate(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership1?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: HashMap<String,ItemCriteria>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionPartialUpdate
*/
@Parcelize
data class PromotionPartialUpdate(
    
    
    
    @SerializedName("schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("archive")
    var archive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ActivePromosResponse
*/
@Parcelize
data class ActivePromosResponse(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("entity_slug")
    var entitySlug: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("example")
    var example: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("is_hidden")
    var isHidden: Boolean?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartItem
*/
@Parcelize
data class CartItem(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("product_id")
    var productId: String?=null,
    
    @SerializedName("size")
    var size: String?=null
    
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
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("add_on")
    var addOn: Double?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("selling")
    var selling: Double?=null
    
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
    Model: PromiseTimestamp
*/
@Parcelize
data class PromiseTimestamp(
    
    
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromiseFormatted
*/
@Parcelize
data class PromiseFormatted(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
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
    Model: ProductAvailabilitySize
*/
@Parcelize
data class ProductAvailabilitySize(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    
    @SerializedName("available_sizes")
    var availableSizes: ArrayList<ProductAvailabilitySize>?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FreeGiftItem
*/
@Parcelize
data class FreeGiftItem(
    
    
    
    @SerializedName("item_slug")
    var itemSlug: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_price_details")
    var itemPriceDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("item_brand_name")
    var itemBrandName: String?=null,
    
    @SerializedName("item_images_url")
    var itemImagesUrl: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedFreeArticles
*/
@Parcelize
data class AppliedFreeArticles(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("free_gift_item_details")
    var freeGiftItemDetails: FreeGiftItem?=null,
    
    @SerializedName("parent_item_identifier")
    var parentItemIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Ownership2
*/
@Parcelize
data class Ownership2(
    
    
    
    @SerializedName("payable_category")
    var payableCategory: String?=null,
    
    @SerializedName("payable_by")
    var payableBy: String?=null
    
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
    Model: DiscountRulesApp
*/
@Parcelize
data class DiscountRulesApp(
    
    
    
    @SerializedName("item_criteria")
    var itemCriteria: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("matched_buy_rules")
    var matchedBuyRules: ArrayList<String>?=null,
    
    @SerializedName("offer")
    var offer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("raw_offer")
    var rawOffer: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedPromotion
*/
@Parcelize
data class AppliedPromotion(
    
    
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("applied_free_articles")
    var appliedFreeArticles: ArrayList<AppliedFreeArticles>?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership2?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<BuyRules>?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRulesApp>?=null
    
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
    
    
    
    @SerializedName("query")
    var query: ActionQuery?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    Model: NetQuantity
*/
@Parcelize
data class NetQuantity(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductImage
*/
@Parcelize
data class ProductImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartProduct
*/
@Parcelize
data class CartProduct(
    
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductAction?=null,
    
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("images")
    var images: ArrayList<ProductImage>?=null,
    
    @SerializedName("name")
    var name: String?=null
    
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
    Model: BasePrice
*/
@Parcelize
data class BasePrice(
    
    
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
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
    Model: ProductArticle
*/
@Parcelize
data class ProductArticle(
    
    
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store")
    var store: BaseInfo?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductPriceInfo?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    
    @SerializedName("promotions_applied")
    var promotionsApplied: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("moq")
    var moq: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product")
    var product: CartProduct?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: PromoMeta?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("article")
    var article: ProductArticle?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("message")
    var message: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("applicable")
    var applicable: Double?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("total")
    var total: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    
    
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("convenience_fee")
    var convenienceFee: Double?=null,
    
    @SerializedName("mrp_total")
    var mrpTotal: Double?=null,
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("vog")
    var vog: Double?=null,
    
    @SerializedName("coupon")
    var coupon: Double?=null,
    
    @SerializedName("gst_charges")
    var gstCharges: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    
    
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    
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
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
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
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShippingAddress
*/
@Parcelize
data class ShippingAddress(
    
    
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null
    
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
    
    
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartItemMeta
*/
@Parcelize
data class CartItemMeta(
    
    
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("primary_item")
    var primaryItem: Boolean?=null
    
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
    
    
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MultiTenderPaymentMethod
*/
@Parcelize
data class MultiTenderPaymentMethod(
    
    
    
    @SerializedName("meta")
    var meta: MultiTenderPaymentMeta?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("mode")
    var mode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiOrderItem
*/
@Parcelize
data class OpenApiOrderItem(
    
    
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("product_id")
    var productId: Int?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("meta")
    var meta: CartItemMeta?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFiles>?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiPlatformCheckoutReq
*/
@Parcelize
data class OpenApiPlatformCheckoutReq(
    
    
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("billing_address")
    var billingAddress: ShippingAddress?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("coupon")
    var coupon: String?=null,
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<OpenApiOrderItem>?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddress?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFiles>?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiCheckoutResponse
*/
@Parcelize
data class OpenApiCheckoutResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("order_ref_id")
    var orderRefId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AbandonedCart
*/
@Parcelize
data class AbandonedCart(
    
    
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promotion")
    var promotion: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fc_index_map")
    var fcIndexMap: ArrayList<Int>?=null,
    
    @SerializedName("expire_at")
    var expireAt: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cashback")
    var cashback: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("merge_qty")
    var mergeQty: Boolean?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("payments")
    var payments: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("is_archive")
    var isArchive: Boolean?=null,
    
    @SerializedName("shipments")
    var shipments: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("bulk_coupon_discount")
    var bulkCouponDiscount: Double?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AbandonedCartResponse
*/
@Parcelize
data class AbandonedCartResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: ArrayList<AbandonedCart>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentSelectionLock
*/
@Parcelize
data class PaymentSelectionLock(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("default_options")
    var defaultOptions: String?=null
    
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
    Model: CartDetailResponse
*/
@Parcelize
data class CartDetailResponse(
    
    
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: ArrayList<HashMap<String,String>>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddCartRequest
*/
@Parcelize
data class AddCartRequest(
    
    
    
    @SerializedName("new_cart")
    var newCart: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<AddProductCart>?=null
    
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartRequest
*/
@Parcelize
data class UpdateCartRequest(
    
    
    
    @SerializedName("operation")
    var operation: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<UpdateProductCart>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartDetailResponse
*/
@Parcelize
data class UpdateCartDetailResponse(
    
    
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetShareCartLinkRequest
*/
@Parcelize
data class GetShareCartLinkRequest(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
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
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SharedCart
*/
@Parcelize
data class SharedCart(
    
    
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null
    
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
    Model: CartList
*/
@Parcelize
data class CartList(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("item_counts")
    var itemCounts: Int?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MultiCartResponse
*/
@Parcelize
data class MultiCartResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<CartList>?=null
    
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
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("external_id")
    var externalId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserCartMappingResponse
*/
@Parcelize
data class UserCartMappingResponse(
    
    
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("user")
    var user: UserInfo?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null
    
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
    Model: PageCoupon
*/
@Parcelize
data class PageCoupon(
    
    
    
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCouponResponse
*/
@Parcelize
data class GetCouponResponse(
    
    
    
    @SerializedName("page")
    var page: PageCoupon?=null,
    
    @SerializedName("available_coupon_list")
    var availableCouponList: ArrayList<Coupon>?=null
    
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
    
    
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformAddress
*/
@Parcelize
data class PlatformAddress(
    
    
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("google_map_point")
    var googleMapPoint: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("created_by_user_id")
    var createdByUserId: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
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
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateAddressResponse
*/
@Parcelize
data class UpdateAddressResponse(
    
    
    
    @SerializedName("is_updated")
    var isUpdated: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteAddressResponse
*/
@Parcelize
data class DeleteAddressResponse(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformSelectCartAddressRequest
*/
@Parcelize
data class PlatformSelectCartAddressRequest(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("shipments")
    var shipments: Int?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("promise")
    var promise: ShipmentPromise?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("error")
    var error: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("comment")
    var comment: String?=null
    
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
    Model: PlatformCartMetaRequest
*/
@Parcelize
data class PlatformCartMetaRequest(
    
    
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null
    
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
    Model: Files
*/
@Parcelize
data class Files(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("values")
    var values: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StaffCheckout
*/
@Parcelize
data class StaffCheckout(
    
    
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformCartCheckoutDetailRequest
*/
@Parcelize
data class PlatformCartCheckoutDetailRequest(
    
    
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("files")
    var files: ArrayList<Files>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("staff")
    var staff: StaffCheckout?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    
    
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("cod_message")
    var codMessage: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    
    @SerializedName("cart")
    var cart: CheckCart?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartDeliveryModesResponse
*/
@Parcelize
data class CartDeliveryModesResponse(
    
    
    
    @SerializedName("available_modes")
    var availableModes: ArrayList<String>?=null,
    
    @SerializedName("pickup_stores")
    var pickupStores: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PickupStoreDetail
*/
@Parcelize
data class PickupStoreDetail(
    
    
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null
    
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
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponValidity
*/
@Parcelize
data class CouponValidity(
    
    
    
    @SerializedName("valid")
    var valid: Boolean?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("display_message_en")
    var displayMessageEn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCouponValidate
*/
@Parcelize
data class PaymentCouponValidate(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("coupon_validity")
    var couponValidity: CouponValidity?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



