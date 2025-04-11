package com.sdk.platform.cart

import com.sdk.platform.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: CouponDateMeta
*/
@Parcelize
data class CouponDateMeta(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("approved_on")
    var approvedOn: String?=null,
    
    @SerializedName("rejected_on")
    var rejectedOn: String?=null,
    
    @SerializedName("reviewed_on")
    var reviewedOn: String?=null
    
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
    Model: CouponAuthor
*/
@Parcelize
data class CouponAuthor(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("approved_by")
    var approvedBy: String?=null,
    
    @SerializedName("rejected_by")
    var rejectedBy: String?=null,
    
    @SerializedName("reviewed_by")
    var reviewedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: State
*/
@Parcelize
data class State(
    
    
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("is_display")
    var isDisplay: Boolean?=null,
    
    @SerializedName("is_public")
    var isPublic: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
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
    
    @SerializedName("iins")
    var iins: ArrayList<String>?=null,
    
    @SerializedName("types")
    var types: ArrayList<String>?=null,
    
    @SerializedName("networks")
    var networks: ArrayList<String>?=null,
    
    @SerializedName("uses")
    var uses: PaymentAllowValue?=null
    
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
    
    
    
    @SerializedName("cancellation_allowed")
    var cancellationAllowed: Boolean?=null,
    
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null
    
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
    Model: UsesRemaining
*/
@Parcelize
data class UsesRemaining(
    
    
    
    @SerializedName("user")
    var user: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("app")
    var app: Int?=null
    
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
    Model: Restrictions
*/
@Parcelize
data class Restrictions(
    
    
    
    @SerializedName("payments")
    var payments: HashMap<String,PaymentModes>?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("price_range")
    var priceRange: PriceRange?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrder?=null,
    
    @SerializedName("bulk_bundle")
    var bulkBundle: BulkBundleRestriction?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("coupon_allowed")
    var couponAllowed: Boolean?=null,
    
    @SerializedName("uses")
    var uses: UsesRestriction?=null,
    
    @SerializedName("ordering_stores")
    var orderingStores: ArrayList<Int>?=null
    
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
    Model: NextSchedule
*/
@Parcelize
data class NextSchedule(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CouponSchedule
*/
@Parcelize
data class CouponSchedule(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: ArrayList<NextSchedule>?=null,
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("duration")
    var duration: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Rule
*/
@Parcelize
data class Rule(
    
    
    
    @SerializedName("key")
    var key: Double?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("discount_qty")
    var discountQty: Double?=null,
    
    @SerializedName("min")
    var min: Double?=null
    
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
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("auto")
    var auto: DisplayMetaDict?=null,
    
    @SerializedName("apply")
    var apply: DisplayMetaDict?=null,
    
    @SerializedName("remove")
    var remove: DisplayMetaDict?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Identifier
*/
@Parcelize
data class Identifier(
    
    
    
    @SerializedName("brand_id")
    var brandId: ArrayList<Int>?=null,
    
    @SerializedName("email_domain")
    var emailDomain: ArrayList<String>?=null,
    
    @SerializedName("company_id")
    var companyId: ArrayList<Int>?=null,
    
    @SerializedName("store_id")
    var storeId: ArrayList<Int>?=null,
    
    @SerializedName("collection_id")
    var collectionId: ArrayList<String>?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("category_id")
    var categoryId: ArrayList<Int>?=null,
    
    @SerializedName("article_id")
    var articleId: ArrayList<String>?=null,
    
    @SerializedName("exclude_brand_id")
    var excludeBrandId: ArrayList<Int>?=null
    
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
    Model: RuleDefinition
*/
@Parcelize
data class RuleDefinition(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_exact")
    var isExact: Boolean?=null,
    
    @SerializedName("applicable_on")
    var applicableOn: String?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("value_type")
    var valueType: String?=null,
    
    @SerializedName("scope")
    var scope: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponAdd
*/
@Parcelize
data class CouponAdd(
    
    
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    
    @SerializedName("validation")
    var validation: Validation?=null,
    
    @SerializedName("action")
    var action: CouponAction?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("coupon_prefix")
    var couponPrefix: String?=null,
    
    @SerializedName("coupon_counts")
    var couponCounts: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("validity")
    var validity: Validity?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Page
*/
@Parcelize
data class Page(
    
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("last_id")
    var lastId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponObj
*/
@Parcelize
data class CouponObj(
    
    
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<CouponMedias>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponsResult
*/
@Parcelize
data class CouponsResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CouponObj>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("draft")
    var draft: Double?=null,
    
    @SerializedName("review")
    var review: Double?=null,
    
    @SerializedName("rejected")
    var rejected: Double?=null,
    
    @SerializedName("approved")
    var approved: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponMedias
*/
@Parcelize
data class CouponMedias(
    
    
    
    @SerializedName("alt")
    var alt: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponDetailObj
*/
@Parcelize
data class CouponDetailObj(
    
    
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    
    @SerializedName("validation")
    var validation: Validation?=null,
    
    @SerializedName("action")
    var action: CouponAction?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("validity")
    var validity: Validity?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("coupon_prefix")
    var couponPrefix: String?=null,
    
    @SerializedName("coupon_counts")
    var couponCounts: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponDetailResult
*/
@Parcelize
data class CouponDetailResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: CouponDetailObj?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TagsViewResult
*/
@Parcelize
data class TagsViewResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SuccessMessage
*/
@Parcelize
data class SuccessMessage(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaConfigOperationErrorResult
*/
@Parcelize
data class CartMetaConfigOperationErrorResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("errors")
    var errors: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponUpdate
*/
@Parcelize
data class CouponUpdate(
    
    
    
    @SerializedName("date_meta")
    var dateMeta: CouponDateMeta?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("author")
    var author: CouponAuthor?=null,
    
    @SerializedName("state")
    var state: State?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions?=null,
    
    @SerializedName("validation")
    var validation: Validation?=null,
    
    @SerializedName("action")
    var action: CouponAction?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_schedule")
    var schedule: CouponSchedule?=null,
    
    @SerializedName("rule")
    var rule: ArrayList<Rule>?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("coupon_prefix")
    var couponPrefix: String?=null,
    
    @SerializedName("coupon_counts")
    var couponCounts: Int?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("type_slug")
    var typeSlug: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifier?=null,
    
    @SerializedName("validity")
    var validity: Validity?=null,
    
    @SerializedName("rule_definition")
    var ruleDefinition: RuleDefinition?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null
    
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
    Model: DisplayMeta1
*/
@Parcelize
data class DisplayMeta1(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("offer_label")
    var offerLabel: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompareObject
*/
@Parcelize
data class CompareObject(
    
    
    
    @SerializedName("equals")
    var equals: Double?=null,
    
    @SerializedName("greater_than")
    var greaterThan: Double?=null,
    
    @SerializedName("less_than_equals")
    var lessThanEquals: Double?=null,
    
    @SerializedName("less_than")
    var lessThan: Double?=null,
    
    @SerializedName("greater_than_equals")
    var greaterThanEquals: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ItemSizeMapping
*/
@Parcelize
data class ItemSizeMapping(
    
    
    
    @SerializedName("item_size_mapping")
    var itemSizeMapping: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ItemCriteria
*/
@Parcelize
data class ItemCriteria(
    
    
    
    @SerializedName("cart_quantity")
    var cartQuantity: CompareObject?=null,
    
    @SerializedName("available_zones")
    var availableZones: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_company")
    var itemExcludeCompany: ArrayList<Int>?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Int>?=null,
    
    @SerializedName("item_l1_category")
    var itemL1Category: ArrayList<Int>?=null,
    
    @SerializedName("cart_total")
    var cartTotal: CompareObject?=null,
    
    @SerializedName("cart_unique_item_quantity")
    var cartUniqueItemQuantity: CompareObject?=null,
    
    @SerializedName("cart_unique_item_amount")
    var cartUniqueItemAmount: CompareObject?=null,
    
    @SerializedName("item_exclude_id")
    var itemExcludeId: ArrayList<Int>?=null,
    
    @SerializedName("all_items")
    var allItems: Boolean?=null,
    
    @SerializedName("item_exclude_l1_category")
    var itemExcludeL1Category: ArrayList<Int>?=null,
    
    @SerializedName("item_size")
    var itemSize: ArrayList<String>?=null,
    
    @SerializedName("item_store")
    var itemStore: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_sku")
    var itemExcludeSku: ArrayList<String>?=null,
    
    @SerializedName("item_department")
    var itemDepartment: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_store")
    var itemExcludeStore: ArrayList<Int>?=null,
    
    @SerializedName("item_brand")
    var itemBrand: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_department")
    var itemExcludeDepartment: ArrayList<Int>?=null,
    
    @SerializedName("item_exclude_category")
    var itemExcludeCategory: ArrayList<Int>?=null,
    
    @SerializedName("item_category")
    var itemCategory: ArrayList<Int>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_brand")
    var itemExcludeBrand: ArrayList<Int>?=null,
    
    @SerializedName("item_l2_category")
    var itemL2Category: ArrayList<Int>?=null,
    
    @SerializedName("item_company")
    var itemCompany: ArrayList<Int>?=null,
    
    @SerializedName("item_tags")
    var itemTags: ArrayList<String>?=null,
    
    @SerializedName("item_exclude_l2_category")
    var itemExcludeL2Category: ArrayList<Int>?=null,
    
    @SerializedName("item_sku")
    var itemSku: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountOffer
*/
@Parcelize
data class DiscountOffer(
    
    
    
    @SerializedName("max_discount_amount")
    var maxDiscountAmount: Double?=null,
    
    @SerializedName("discount_price")
    var discountPrice: Double?=null,
    
    @SerializedName("apportion_discount")
    var apportionDiscount: Boolean?=null,
    
    @SerializedName("partial_can_ret")
    var partialCanRet: Boolean?=null,
    
    @SerializedName("max_usage_per_transaction")
    var maxUsagePerTransaction: Int?=null,
    
    @SerializedName("min_offer_quantity")
    var minOfferQuantity: Int?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("discount_amount")
    var discountAmount: Double?=null,
    
    @SerializedName("discount_percentage")
    var discountPercentage: Double?=null,
    
    @SerializedName("max_offer_quantity")
    var maxOfferQuantity: Int?=null
    
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
    
    @SerializedName("meta")
    var meta: ItemSizeMapping?=null,
    
    @SerializedName("offer")
    var offer: DiscountOffer?=null
    
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
    
    
    
    @SerializedName("cancellation_allowed")
    var cancellationAllowed: Boolean?=null,
    
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null
    
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
    Model: Restrictions1
*/
@Parcelize
data class Restrictions1(
    
    
    
    @SerializedName("payments")
    var payments: PaymentModes?=null,
    
    @SerializedName("user_registered")
    var userRegistered: UserRegistered?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("post_order")
    var postOrder: PostOrder1?=null,
    
    @SerializedName("user_groups")
    var userGroups: ArrayList<Int>?=null,
    
    @SerializedName("order_quantity")
    var orderQuantity: Int?=null,
    
    @SerializedName("anonymous_users")
    var anonymousUsers: Boolean?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("uses")
    var uses: UsesRestriction1?=null,
    
    @SerializedName("ordering_stores")
    var orderingStores: ArrayList<Int>?=null,
    
    @SerializedName("user_type")
    var userType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionSchedule
*/
@Parcelize
data class PromotionSchedule(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: ArrayList<NextSchedule>?=null,
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("duration")
    var duration: Int?=null
    
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
    var modifiedBy: String?=null,
    
    @SerializedName("approved_by")
    var approvedBy: String?=null,
    
    @SerializedName("rejected_by")
    var rejectedBy: String?=null,
    
    @SerializedName("reviewed_by")
    var reviewedBy: String?=null
    
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
    Model: PromotionDateMeta
*/
@Parcelize
data class PromotionDateMeta(
    
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("approved_on")
    var approvedOn: String?=null,
    
    @SerializedName("rejected_on")
    var rejectedOn: String?=null,
    
    @SerializedName("reviewed_on")
    var reviewedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionListItem
*/
@Parcelize
data class PromotionListItem(
    
    
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("is_processed")
    var isProcessed: Boolean?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionsResult
*/
@Parcelize
data class PromotionsResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<PromotionListItem>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("draft")
    var draft: Double?=null,
    
    @SerializedName("review")
    var review: Double?=null,
    
    @SerializedName("rejected")
    var rejected: Double?=null,
    
    @SerializedName("approved")
    var approved: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionAdd
*/
@Parcelize
data class PromotionAdd(
    
    
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("is_processed")
    var isProcessed: Boolean?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("indexed_criteria")
    var indexedCriteria: ArrayList<PromoIndexedCriteria>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionAddResult
*/
@Parcelize
data class PromotionAddResult(
    
    
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("is_processed")
    var isProcessed: Boolean?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("indexed_criteria")
    var indexedCriteria: ArrayList<PromoIndexedCriteria>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("is_bank_offer")
    var isBankOffer: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionUpdate
*/
@Parcelize
data class PromotionUpdate(
    
    
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionUpdateResult
*/
@Parcelize
data class PromotionUpdateResult(
    
    
    
    @SerializedName("stackable")
    var stackable: Boolean?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("apply_exclusive")
    var applyExclusive: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("is_processed")
    var isProcessed: Boolean?=null,
    
    @SerializedName("promo_group")
    var promoGroup: String?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("apply_all_discount")
    var applyAllDiscount: Boolean?=null,
    
    @SerializedName("display_meta")
    var displayMeta: DisplayMeta1?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRule>?=null,
    
    @SerializedName("restrictions")
    var restrictions: Restrictions1?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("_schedule")
    var schedule: PromotionSchedule?=null,
    
    @SerializedName("post_order_action")
    var postOrderAction: PromotionAction?=null,
    
    @SerializedName("apply_priority")
    var applyPriority: Int?=null,
    
    @SerializedName("author")
    var author: PromotionAuthor?=null,
    
    @SerializedName("visiblility")
    var visiblility: Visibility?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("date_meta")
    var dateMeta: PromotionDateMeta?=null,
    
    @SerializedName("indexed_criteria")
    var indexedCriteria: ArrayList<PromoIndexedCriteria>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("is_bank_offer")
    var isBankOffer: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromoIndexedCriteria
*/
@Parcelize
data class PromoIndexedCriteria(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionPartialUpdate
*/
@Parcelize
data class PromotionPartialUpdate(
    
    
    
    @SerializedName("publish")
    var publish: Boolean?=null,
    
    @SerializedName("schedule")
    var schedule: PromotionSchedule?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ActivePromos
*/
@Parcelize
data class ActivePromos(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("entity_slug")
    var entitySlug: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("example")
    var example: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("is_hidden")
    var isHidden: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ActivePromosResult
*/
@Parcelize
data class ActivePromosResult(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<ActivePromos>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Charges
*/
@Parcelize
data class Charges(
    
    
    
    @SerializedName("charges")
    var charges: Int?=null,
    
    @SerializedName("threshold")
    var threshold: Int?=null
    
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
    Model: OrderPlacing
*/
@Parcelize
data class OrderPlacing(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PanCard
*/
@Parcelize
data class PanCard(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("cod_threshold_amount")
    var codThresholdAmount: Int?=null,
    
    @SerializedName("online_threshold_amount")
    var onlineThresholdAmount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaConfigUpdate
*/
@Parcelize
data class CartMetaConfigUpdate(
    
    
    
    @SerializedName("min_cart_value")
    var minCartValue: Int?=null,
    
    @SerializedName("max_cart_value")
    var maxCartValue: Int?=null,
    
    @SerializedName("bulk_coupons")
    var bulkCoupons: Boolean?=null,
    
    @SerializedName("max_cart_items")
    var maxCartItems: Int?=null,
    
    @SerializedName("gift_display_text")
    var giftDisplayText: String?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: DeliveryCharges?=null,
    
    @SerializedName("international_delivery_charges")
    var internationalDeliveryCharges: DeliveryCharges?=null,
    
    @SerializedName("revenue_engine_coupon")
    var revenueEngineCoupon: Boolean?=null,
    
    @SerializedName("gift_pricing")
    var giftPricing: Double?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_universal")
    var isUniversal: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Double?=null,
    
    @SerializedName("updated_on")
    var updatedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("last_modified_by")
    var lastModifiedBy: String?=null,
    
    @SerializedName("order_placing")
    var orderPlacing: OrderPlacing?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("article_tags")
    var articleTags: ArrayList<String>?=null,
    
    @SerializedName("allow_coupon_with_rewards")
    var allowCouponWithRewards: Boolean?=null,
    
    @SerializedName("gst_input")
    var gstInput: Boolean?=null,
    
    @SerializedName("staff_selection")
    var staffSelection: Boolean?=null,
    
    @SerializedName("placing_for_customer")
    var placingForCustomer: Boolean?=null,
    
    @SerializedName("pan_card")
    var panCard: PanCard?=null,
    
    @SerializedName("empty_cart")
    var emptyCart: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("hide_on_storefront")
    var hideOnStorefront: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TimeStampIDResult
*/
@Parcelize
data class TimeStampIDResult(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("updated_on")
    var updatedOn: String?=null,
    
    @SerializedName("last_modified_by")
    var lastModifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaConfigDetailResult
*/
@Parcelize
data class CartMetaConfigDetailResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: CartMetaConfigUpdate?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaConfigListResult
*/
@Parcelize
data class CartMetaConfigListResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<CartMetaConfigListObject>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaConfigListObject
*/
@Parcelize
data class CartMetaConfigListObject(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaConfigAddResult
*/
@Parcelize
data class CartMetaConfigAddResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: CartMetaConfigAdd?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaConfigAdd
*/
@Parcelize
data class CartMetaConfigAdd(
    
    
    
    @SerializedName("min_cart_value")
    var minCartValue: Int?=null,
    
    @SerializedName("max_cart_value")
    var maxCartValue: Int?=null,
    
    @SerializedName("bulk_coupons")
    var bulkCoupons: Boolean?=null,
    
    @SerializedName("max_cart_items")
    var maxCartItems: Int?=null,
    
    @SerializedName("gift_display_text")
    var giftDisplayText: String?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: DeliveryCharges?=null,
    
    @SerializedName("international_delivery_charges")
    var internationalDeliveryCharges: DeliveryCharges?=null,
    
    @SerializedName("revenue_engine_coupon")
    var revenueEngineCoupon: Boolean?=null,
    
    @SerializedName("gift_pricing")
    var giftPricing: Double?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_universal")
    var isUniversal: Boolean?=null,
    
    @SerializedName("company_id")
    var companyId: Double?=null,
    
    @SerializedName("updated_on")
    var updatedOn: String?=null,
    
    @SerializedName("last_modified_by")
    var lastModifiedBy: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("order_placing")
    var orderPlacing: OrderPlacing?=null,
    
    @SerializedName("article_tags")
    var articleTags: ArrayList<String>?=null,
    
    @SerializedName("allow_coupon_with_rewards")
    var allowCouponWithRewards: Boolean?=null,
    
    @SerializedName("gst_input")
    var gstInput: Boolean?=null,
    
    @SerializedName("staff_selection")
    var staffSelection: Boolean?=null,
    
    @SerializedName("placing_for_customer")
    var placingForCustomer: Boolean?=null,
    
    @SerializedName("pan_card")
    var panCard: PanCard?=null,
    
    @SerializedName("empty_cart")
    var emptyCart: Boolean?=null,
    
    @SerializedName("hide_on_storefront")
    var hideOnStorefront: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Article
*/
@Parcelize
data class Article(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PriceAdjustmentRestrictions
*/
@Parcelize
data class PriceAdjustmentRestrictions(
    
    
    
    @SerializedName("post_order")
    var postOrder: PostOrder1?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Collection
*/
@Parcelize
data class Collection(
    
    
    
    @SerializedName("refund_by")
    var refundBy: String?=null,
    
    @SerializedName("collected_by")
    var collectedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PriceAdjustmentUpdate
*/
@Parcelize
data class PriceAdjustmentUpdate(
    
    
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("apply_expiry")
    var applyExpiry: String?=null,
    
    @SerializedName("restrictions")
    var restrictions: PriceAdjustmentRestrictions?=null,
    
    @SerializedName("article_level_distribution")
    var articleLevelDistribution: Boolean?=null,
    
    @SerializedName("collection")
    var collection: Collection?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("allowed_refund")
    var allowedRefund: Boolean?=null,
    
    @SerializedName("is_authenticated")
    var isAuthenticated: Boolean?=null,
    
    @SerializedName("article_ids")
    var articleIds: ArrayList<Article>?=null,
    
    @SerializedName("remove_articles")
    var removeArticles: Boolean?=null,
    
    @SerializedName("auto_remove")
    var autoRemove: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("distribution_logic")
    var distributionLogic: DistributionLogic?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PriceAdjustment
*/
@Parcelize
data class PriceAdjustment(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("apply_expiry")
    var applyExpiry: String?=null,
    
    @SerializedName("restrictions")
    var restrictions: PriceAdjustmentRestrictions?=null,
    
    @SerializedName("article_level_distribution")
    var articleLevelDistribution: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("collection")
    var collection: Collection?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("allowed_refund")
    var allowedRefund: Boolean?=null,
    
    @SerializedName("is_authenticated")
    var isAuthenticated: Boolean?=null,
    
    @SerializedName("article_ids")
    var articleIds: ArrayList<Article>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("remove_articles")
    var removeArticles: Boolean?=null,
    
    @SerializedName("auto_remove")
    var autoRemove: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("expire_at")
    var expireAt: String?=null,
    
    @SerializedName("distribution_logic")
    var distributionLogic: DistributionLogic?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddPriceAdjustmentResult
*/
@Parcelize
data class AddPriceAdjustmentResult(
    
    
    
    @SerializedName("data")
    var data: PriceAdjustment?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpdatePriceAdjustmentResult
*/
@Parcelize
data class UpdatePriceAdjustmentResult(
    
    
    
    @SerializedName("data")
    var data: PriceAdjustment?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PriceAdjustmentResult
*/
@Parcelize
data class PriceAdjustmentResult(
    
    
    
    @SerializedName("data")
    var data: ArrayList<PriceAdjustment>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("price_adjustments")
    var priceAdjustments: ArrayList<PriceAdjustment>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetPriceAdjustmentResult
*/
@Parcelize
data class GetPriceAdjustmentResult(
    
    
    
    @SerializedName("data")
    var data: ArrayList<PriceAdjustment>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PriceAdjustmentAdd
*/
@Parcelize
data class PriceAdjustmentAdd(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("apply_expiry")
    var applyExpiry: String?=null,
    
    @SerializedName("restrictions")
    var restrictions: PriceAdjustmentRestrictions?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("article_level_distribution")
    var articleLevelDistribution: Boolean?=null,
    
    @SerializedName("collection")
    var collection: Collection?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("allowed_refund")
    var allowedRefund: Boolean?=null,
    
    @SerializedName("is_authenticated")
    var isAuthenticated: Boolean?=null,
    
    @SerializedName("article_ids")
    var articleIds: ArrayList<Article>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("remove_articles")
    var removeArticles: Boolean?=null,
    
    @SerializedName("auto_remove")
    var autoRemove: Boolean?=null,
    
    @SerializedName("distribution_logic")
    var distributionLogic: DistributionLogic?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DistributionRule
*/
@Parcelize
data class DistributionRule(
    
    
    
    @SerializedName("conditions")
    var conditions: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Distribution
*/
@Parcelize
data class Distribution(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("logic")
    var logic: String?=null,
    
    @SerializedName("rule")
    var rule: DistributionRule?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DistributionLogic
*/
@Parcelize
data class DistributionLogic(
    
    
    
    @SerializedName("distribution_level")
    var distributionLevel: String?=null,
    
    @SerializedName("distribution")
    var distribution: Distribution?=null
    
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
    Model: OpenapiCartDetailsPayload
*/
@Parcelize
data class OpenapiCartDetailsPayload(
    
    
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<CartItem>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    
    @SerializedName("original")
    var original: Double?=null,
    
    @SerializedName("attr")
    var attr: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("applicable")
    var applicable: Double?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    
    
    @SerializedName("promotion")
    var promotion: Double?=null,
    
    @SerializedName("coupon")
    var coupon: Double?=null,
    
    @SerializedName("gst_charges")
    var gstCharges: Double?=null,
    
    @SerializedName("mrp_total")
    var mrpTotal: Double?=null,
    
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    
    @SerializedName("vog")
    var vog: Double?=null,
    
    @SerializedName("gift_card")
    var giftCard: Double?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("sub_total")
    var subTotal: Double?=null,
    
    @SerializedName("convenience_fee")
    var convenienceFee: Double?=null,
    
    @SerializedName("total_charge")
    var totalCharge: Double?=null,
    
    @SerializedName("mop_total")
    var mopTotal: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    
    
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null,
    
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    
    @SerializedName("raw")
    var raw: RawBreakup?=null
    
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
    Model: Tags
*/
@Parcelize
data class Tags(
    
    
    
    @SerializedName("tags")
    var tags: @RawValue HashMap<String,Any>?=null
    
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
    Model: ActionQuery
*/
@Parcelize
data class ActionQuery(
    
    
    
    @SerializedName("product_slug")
    var productSlug: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductActionParams
*/
@Parcelize
data class ProductActionParams(
    
    
    
    @SerializedName("slug")
    var slug: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductActionPage
*/
@Parcelize
data class ProductActionPage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("params")
    var params: ProductActionParams?=null
    
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
    var query: ActionQuery?=null,
    
    @SerializedName("page")
    var page: ProductActionPage?=null
    
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
    Model: CartProduct
*/
@Parcelize
data class CartProduct(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<ProductImage>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    
    @SerializedName("action")
    var action: ProductAction?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null
    
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
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("selling")
    var selling: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAppliedPriceAdjustment
*/
@Parcelize
data class ArticleAppliedPriceAdjustment(
    
    
    
    @SerializedName("adjusted_value")
    var adjustedValue: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_level_distribution")
    var articleLevelDistribution: Boolean?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("applied_quantity")
    var appliedQuantity: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
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
    Model: StoreInfo
*/
@Parcelize
data class StoreInfo(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleGiftCard
*/
@Parcelize
data class ArticleGiftCard(
    
    
    
    @SerializedName("gift_price")
    var giftPrice: Double?=null,
    
    @SerializedName("display_text")
    var displayText: String?=null,
    
    @SerializedName("is_gift_applied")
    var isGiftApplied: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductArticle
*/
@Parcelize
data class ProductArticle(
    
    
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    
    @SerializedName("cart_item_meta")
    var cartItemMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_gift_visible")
    var isGiftVisible: Boolean?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("gift_card")
    var giftCard: ArticleGiftCard?=null,
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("mto_quantity")
    var mtoQuantity: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("store")
    var store: StoreInfo?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromoDiscountRuleOffer
*/
@Parcelize
data class PromoDiscountRuleOffer(
    
    
    
    @SerializedName("max_offer_quantity")
    var maxOfferQuantity: Double?=null,
    
    @SerializedName("discount_percentage")
    var discountPercentage: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PromoDiscountRuleRawOffer
*/
@Parcelize
data class PromoDiscountRuleRawOffer(
    
    
    
    @SerializedName("buy_condition")
    var buyCondition: String?=null,
    
    @SerializedName("discount_type")
    var discountType: String?=null,
    
    @SerializedName("offer")
    var offer: PromoDiscountRuleOffer?=null,
    
    @SerializedName("item_criteria")
    var itemCriteria: PromoDiscountRuleItemCriteria?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromoDiscountRuleItemCriteria
*/
@Parcelize
data class PromoDiscountRuleItemCriteria(
    
    
    
    @SerializedName("item_id")
    var itemId: ArrayList<Double>?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountRulesApp
*/
@Parcelize
data class DiscountRulesApp(
    
    
    
    @SerializedName("offer")
    var offer: PromoDiscountRuleOffer?=null,
    
    @SerializedName("raw_offer")
    var rawOffer: PromoDiscountRuleRawOffer?=null,
    
    @SerializedName("item_criteria")
    var itemCriteria: PromoDiscountRuleItemCriteria?=null,
    
    @SerializedName("matched_buy_rules")
    var matchedBuyRules: ArrayList<String>?=null
    
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
    var freeGiftItemDetails: FreeGiftItems?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromoBuyRuleCartConditions
*/
@Parcelize
data class PromoBuyRuleCartConditions(
    
    
    
    @SerializedName("cart_quantity")
    var cartQuantity: PromoBuyRuleCompareFieldsTypes?=null,
    
    @SerializedName("cart_total")
    var cartTotal: PromoBuyRuleCompareFieldsTypes?=null,
    
    @SerializedName("item_id")
    var itemId: ArrayList<Double>?=null,
    
    @SerializedName("item_store")
    var itemStore: ArrayList<Double>?=null,
    
    @SerializedName("item_company")
    var itemCompany: ArrayList<Double>?=null,
    
    @SerializedName("item_brand")
    var itemBrand: ArrayList<Double>?=null,
    
    @SerializedName("item_exclude_brand")
    var itemExcludeBrand: ArrayList<Double>?=null,
    
    @SerializedName("item_category")
    var itemCategory: ArrayList<Double>?=null,
    
    @SerializedName("item_exclude_category")
    var itemExcludeCategory: ArrayList<Double>?=null,
    
    @SerializedName("item_l1_category")
    var itemL1Category: ArrayList<Double>?=null,
    
    @SerializedName("item_exclude_l1_category")
    var itemExcludeL1Category: ArrayList<Double>?=null,
    
    @SerializedName("item_l2_category")
    var itemL2Category: ArrayList<Double>?=null,
    
    @SerializedName("item_exclude_l2_category")
    var itemExcludeL2Category: ArrayList<Double>?=null,
    
    @SerializedName("item_department")
    var itemDepartment: ArrayList<Double>?=null,
    
    @SerializedName("item_exclude_id")
    var itemExcludeId: ArrayList<Double>?=null,
    
    @SerializedName("available_zones")
    var availableZones: ArrayList<Double>?=null,
    
    @SerializedName("product_tags")
    var productTags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromoBuyRuleCompareFieldsTypes
*/
@Parcelize
data class PromoBuyRuleCompareFieldsTypes(
    
    
    
    @SerializedName("greater_than_equals")
    var greaterThanEquals: Double?=null,
    
    @SerializedName("greater_than")
    var greaterThan: Double?=null,
    
    @SerializedName("equals")
    var equals: Double?=null,
    
    @SerializedName("less_than")
    var lessThan: Double?=null,
    
    @SerializedName("less_than_equals")
    var lessThanEquals: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BuyRules
*/
@Parcelize
data class BuyRules(
    
    
    
    @SerializedName("cart_conditions")
    var cartConditions: PromoBuyRuleCartConditions?=null,
    
    @SerializedName("item_criteria")
    var itemCriteria: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("all_items")
    var allItems: Boolean?=null,
    
    @SerializedName("mrp_promo")
    var mrpPromo: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedPromotion
*/
@Parcelize
data class AppliedPromotion(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null,
    
    @SerializedName("original_article_quantity")
    var originalArticleQuantity: Int?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRulesApp>?=null,
    
    @SerializedName("applied_free_articles")
    var appliedFreeArticles: ArrayList<AppliedFreeArticles>?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<BuyRules>?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("float_amount")
    var floatAmount: String?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("offer_label")
    var offerLabel: String?=null,
    
    @SerializedName("return_allowed")
    var returnAllowed: Boolean?=null,
    
    @SerializedName("cancellation_allowed")
    var cancellationAllowed: Boolean?=null,
    
    @SerializedName("promo_code")
    var promoCode: String?=null,
    
    @SerializedName("free_quantity")
    var freeQuantity: Int?=null,
    
    @SerializedName("offer_description")
    var offerDescription: String?=null
    
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
    Model: PromiseISOFormat
*/
@Parcelize
data class PromiseISOFormat(
    
    
    
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
    var timestamp: PromiseTimestamp?=null,
    
    @SerializedName("iso")
    var iso: PromiseISOFormat?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponDetails
*/
@Parcelize
data class CouponDetails(
    
    
    
    @SerializedName("discount_total_quantity")
    var discountTotalQuantity: Double?=null,
    
    @SerializedName("discount_single_quantity")
    var discountSingleQuantity: Double?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("add_on")
    var addOn: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("selling")
    var selling: Double?=null,
    
    @SerializedName("selling_price")
    var sellingPrice: Double?=null
    
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
    Model: ProductAvailabilitySize
*/
@Parcelize
data class ProductAvailabilitySize(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
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
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    
    @SerializedName("available_sizes")
    var availableSizes: ArrayList<ProductAvailabilitySize>?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null
    
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
    Model: ParentItemIdentifiers
*/
@Parcelize
data class ParentItemIdentifiers(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("parent_item_size")
    var parentItemSize: String?=null,
    
    @SerializedName("parent_item_id")
    var parentItemId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartItemMOQ
*/
@Parcelize
data class CartItemMOQ(
    
    
    
    @SerializedName("increment_unit")
    var incrementUnit: Double?=null,
    
    @SerializedName("maximum")
    var maximum: Double?=null,
    
    @SerializedName("minimum")
    var minimum: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartItemCustomOrder
*/
@Parcelize
data class CartItemCustomOrder(
    
    
    
    @SerializedName("is_custom_order")
    var isCustomOrder: Boolean?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Double?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("product")
    var product: CartProduct?=null,
    
    @SerializedName("product_ean_id")
    var productEanId: String?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("article")
    var article: ProductArticle?=null,
    
    @SerializedName("promotions_applied")
    var promotionsApplied: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("coupon")
    var coupon: CouponDetails?=null,
    
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price_adjustment_applied")
    var priceAdjustmentApplied: ArrayList<ArticleAppliedPriceAdjustment>?=null,
    
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    
    @SerializedName("moq")
    var moq: CartItemMOQ?=null,
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductPriceInfo?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: PromoMeta?=null,
    
    @SerializedName("custom_order")
    var customOrder: CartItemCustomOrder?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<Double>?=null,
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("discount_meta")
    var discountMeta: DiscountMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DiscountMeta
*/
@Parcelize
data class DiscountMeta(
    
    
    
    @SerializedName("timer")
    var timer: Boolean?=null,
    
    @SerializedName("start_timer_in_minutes")
    var startTimerInMinutes: Double?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PriceAdjustmentApplied
*/
@Parcelize
data class PriceAdjustmentApplied(
    
    
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("adjusted_value")
    var adjustedValue: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("applied_quantity")
    var appliedQuantity: Double?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_level_distribution")
    var articleLevelDistribution: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenapiCartDetailsResult
*/
@Parcelize
data class OpenapiCartDetailsResult(
    
    
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("common_config")
    var commonConfig: CartCommonConfig?=null,
    
    @SerializedName("coupon")
    var coupon: CartDetailCoupon?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("notification")
    var notification: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff_user_id")
    var staffUserId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("custom_cart")
    var customCart: CustomCart?=null,
    
    @SerializedName("price_adjustment_applied")
    var priceAdjustmentApplied: ArrayList<CartAppliedPriceAdjustment>?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiErrorResult
*/
@Parcelize
data class OpenApiErrorResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShippingAddress
*/
@Parcelize
data class ShippingAddress(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address")
    var address: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiCartServiceabilityPayload
*/
@Parcelize
data class OpenApiCartServiceabilityPayload(
    
    
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<CartItem>?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddress?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiCartServiceabilityResult
*/
@Parcelize
data class OpenApiCartServiceabilityResult(
    
    
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("common_config")
    var commonConfig: CartCommonConfig?=null,
    
    @SerializedName("coupon")
    var coupon: CartDetailCoupon?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("notification")
    var notification: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff_user_id")
    var staffUserId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("custom_cart")
    var customCart: CustomCart?=null,
    
    @SerializedName("price_adjustment_applied")
    var priceAdjustmentApplied: ArrayList<CartAppliedPriceAdjustment>?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null
    
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
    Model: MultiTenderPaymentMeta
*/
@Parcelize
data class MultiTenderPaymentMeta(
    
    
    
    @SerializedName("payment_id")
    var paymentId: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("current_status")
    var currentStatus: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MultiTenderPaymentMethod
*/
@Parcelize
data class MultiTenderPaymentMethod(
    
    
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("meta")
    var meta: MultiTenderPaymentMeta?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiOrderItem
*/
@Parcelize
data class OpenApiOrderItem(
    
    
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFiles>?=null,
    
    @SerializedName("meta")
    var meta: CartItemMeta?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_id")
    var productId: Int?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiPlatformCheckoutReq
*/
@Parcelize
data class OpenApiPlatformCheckoutReq(
    
    
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<OpenApiOrderItem>?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: ShippingAddress?=null,
    
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Double?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<MultiTenderPaymentMethod>?=null,
    
    @SerializedName("employee_discount")
    var employeeDiscount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("coupon")
    var coupon: String?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: ShippingAddress?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null,
    
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("files")
    var files: ArrayList<OpenApiFiles>?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("platform_order_id")
    var platformOrderId: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OpenApiCheckoutResult
*/
@Parcelize
data class OpenApiCheckoutResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
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
    
    
    
    @SerializedName("expire_at")
    var expireAt: String?=null,
    
    @SerializedName("promotion")
    var promotion: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("coupon")
    var coupon: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("bulk_coupon_discount")
    var bulkCouponDiscount: Double?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fc_index_map")
    var fcIndexMap: ArrayList<Int>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payments")
    var payments: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("shipments")
    var shipments: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("is_archive")
    var isArchive: Boolean?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("cashback")
    var cashback: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("merge_qty")
    var mergeQty: Boolean?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AbandonedCartResult
*/
@Parcelize
data class AbandonedCartResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AbandonedCart>?=null,
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
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
    Model: CartCurrency
*/
@Parcelize
data class CartCurrency(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartCouponMedias
*/
@Parcelize
data class CartCouponMedias(
    
    
    
    @SerializedName("alt")
    var alt: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartDetailCoupon
*/
@Parcelize
data class CartDetailCoupon(
    
    
    
    @SerializedName("cashback_amount")
    var cashbackAmount: Double?=null,
    
    @SerializedName("cashback_message_primary")
    var cashbackMessagePrimary: String?=null,
    
    @SerializedName("cashback_message_secondary")
    var cashbackMessageSecondary: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("coupon_description")
    var couponDescription: String?=null,
    
    @SerializedName("coupon_id")
    var couponId: String?=null,
    
    @SerializedName("coupon_subtitle")
    var couponSubtitle: String?=null,
    
    @SerializedName("coupon_title")
    var couponTitle: String?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("maximum_discount_value")
    var maximumDiscountValue: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<CartCouponMedias>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ChargesThreshold
*/
@Parcelize
data class ChargesThreshold(
    
    
    
    @SerializedName("charges")
    var charges: Double?=null,
    
    @SerializedName("threshold")
    var threshold: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DeliveryChargesConfig
*/
@Parcelize
data class DeliveryChargesConfig(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("charges")
    var charges: ArrayList<ChargesThreshold>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartCommonConfig
*/
@Parcelize
data class CartCommonConfig(
    
    
    
    @SerializedName("delivery_charges_config")
    var deliveryChargesConfig: DeliveryChargesConfig?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CartAppliedPriceAdjustment
*/
@Parcelize
data class CartAppliedPriceAdjustment(
    
    
    
    @SerializedName("remove_articles")
    var removeArticles: Boolean?=null,
    
    @SerializedName("adjusted_value")
    var adjustedValue: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_level_distribution")
    var articleLevelDistribution: Boolean?=null,
    
    @SerializedName("auto_remove")
    var autoRemove: Boolean?=null,
    
    @SerializedName("applied_articles_ids")
    var appliedArticlesIds: ArrayList<String>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("_type")
    var type: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("restrictions")
    var restrictions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomCart
*/
@Parcelize
data class CustomCart(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("cart_name")
    var cartName: String?=null,
    
    @SerializedName("cart_type")
    var cartType: String?=null,
    
    @SerializedName("is_universal")
    var isUniversal: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartDetailResult
*/
@Parcelize
data class CartDetailResult(
    
    
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("common_config")
    var commonConfig: CartCommonConfig?=null,
    
    @SerializedName("coupon")
    var coupon: CartDetailCoupon?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("notification")
    var notification: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff_user_id")
    var staffUserId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("price_adjustment_applied")
    var priceAdjustmentApplied: ArrayList<CartAppliedPriceAdjustment>?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null,
    
    @SerializedName("custom_cart")
    var customCart: CustomCart?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: ArrayList<HashMap<String,String>>?=null,
    
    @SerializedName("price_factory_type_id")
    var priceFactoryTypeId: String?=null,
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AddCartPayload
*/
@Parcelize
data class AddCartPayload(
    
    
    
    @SerializedName("new_cart")
    var newCart: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<AddProductCart>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AddCartDetailResult
*/
@Parcelize
data class AddCartDetailResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResult?=null,
    
    @SerializedName("partial")
    var partial: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price_factory_type_id")
    var priceFactoryTypeId: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FreeGiftItemCreation
*/
@Parcelize
data class FreeGiftItemCreation(
    
    
    
    @SerializedName("promotion_id")
    var promotionId: String?=null,
    
    @SerializedName("item_id")
    var itemId: String?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartPayload
*/
@Parcelize
data class UpdateCartPayload(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UpdateProductCart>?=null,
    
    @SerializedName("free_gift_items")
    var freeGiftItems: ArrayList<FreeGiftItemCreation>?=null,
    
    @SerializedName("operation")
    var operation: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartDetailResult
*/
@Parcelize
data class UpdateCartDetailResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResult?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OverrideCartItemPromo
*/
@Parcelize
data class OverrideCartItemPromo(
    
    
    
    @SerializedName("restrictions")
    var restrictions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("promo_amount")
    var promoAmount: String?=null,
    
    @SerializedName("promo_desc")
    var promoDesc: String?=null,
    
    @SerializedName("rwrd_tndr")
    var rwrdTndr: String?=null,
    
    @SerializedName("item_list")
    var itemList: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("parent_promo_id")
    var parentPromoId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OverrideCartItem
*/
@Parcelize
data class OverrideCartItem(
    
    
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("promo_list")
    var promoList: ArrayList<OverrideCartItemPromo>?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OverrideCheckoutReq
*/
@Parcelize
data class OverrideCheckoutReq(
    
    
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("cart_items")
    var cartItems: ArrayList<OverrideCartItem>?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("shipping_address")
    var shippingAddress: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OverrideCheckoutResult
*/
@Parcelize
data class OverrideCheckoutResult(
    
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart")
    var cart: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetShareCartLinkPayload
*/
@Parcelize
data class GetShareCartLinkPayload(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetShareCartLinkResult
*/
@Parcelize
data class GetShareCartLinkResult(
    
    
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("share_url")
    var shareUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SharedCartDetails
*/
@Parcelize
data class SharedCartDetails(
    
    
    
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("selected_staff")
    var selectedStaff: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
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
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("common_config")
    var commonConfig: CartCommonConfig?=null,
    
    @SerializedName("coupon")
    var coupon: CartDetailCoupon?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("notification")
    var notification: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff_user_id")
    var staffUserId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("custom_cart")
    var customCart: CustomCart?=null,
    
    @SerializedName("price_adjustment_applied")
    var priceAdjustmentApplied: ArrayList<CartAppliedPriceAdjustment>?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SharedCartResult
*/
@Parcelize
data class SharedCartResult(
    
    
    
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
    
    
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_value")
    var cartValue: Double?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("item_counts")
    var itemCounts: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MultiCartResult
*/
@Parcelize
data class MultiCartResult(
    
    
    
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
    Model: UserCartMappingResult
*/
@Parcelize
data class UserCartMappingResult(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResult?=null,
    
    @SerializedName("user")
    var user: CartMappingUserInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartMappingUserInfo
*/
@Parcelize
data class CartMappingUserInfo(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("external_id")
    var externalId: String?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformAddCartPayload
*/
@Parcelize
data class PlatformAddCartPayload(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("new_cart")
    var newCart: Boolean?=null,
    
    @SerializedName("items")
    var items: ArrayList<AddProductCart>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformUpdateCartPayload
*/
@Parcelize
data class PlatformUpdateCartPayload(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<UpdateProductCart>?=null,
    
    @SerializedName("free_gift_items")
    var freeGiftItems: ArrayList<FreeGiftItemCreation>?=null,
    
    @SerializedName("operation")
    var operation: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteCartPayload
*/
@Parcelize
data class DeleteCartPayload(
    
    
    
    @SerializedName("cart_id_list")
    var cartIdList: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DeleteCartDetailResult
*/
@Parcelize
data class DeleteCartDetailResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartItemCountResult
*/
@Parcelize
data class CartItemCountResult(
    
    
    
    @SerializedName("user_cart_items_count")
    var userCartItemsCount: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("start_date")
    var startDate: String?=null,
    
    @SerializedName("end_date")
    var endDate: String?=null,
    
    @SerializedName("coupon_applicable_message")
    var couponApplicableMessage: String?=null,
    
    @SerializedName("is_bank_offer")
    var isBankOffer: Boolean?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("coupon_amount")
    var couponAmount: Double?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<CartCouponMedias>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PageCoupon
*/
@Parcelize
data class PageCoupon(
    
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCouponResult
*/
@Parcelize
data class GetCouponResult(
    
    
    
    @SerializedName("available_coupon_list")
    var availableCouponList: ArrayList<Coupon>?=null,
    
    @SerializedName("page")
    var page: PageCoupon?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplyCouponPayload
*/
@Parcelize
data class ApplyCouponPayload(
    
    
    
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
    
    
    
    @SerializedName("pincode")
    var pincode: Double?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("created_by_user_id")
    var createdByUserId: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("google_map_point")
    var googleMapPoint: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: AddressCustomJson?=null,
    
    @SerializedName("uid")
    var uid: Double?=null,
    
    @SerializedName("is_anonymous")
    var isAnonymous: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("expire_at")
    var expireAt: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("store_name")
    var storeName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddressCustomJson
*/
@Parcelize
data class AddressCustomJson(
    
    
    
    @SerializedName("meta_data")
    var metaData: String?=null,
    
    @SerializedName("meta_data_int")
    var metaDataInt: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ValidationConfig
*/
@Parcelize
data class ValidationConfig(
    
    
    
    @SerializedName("address_max_limit")
    var addressMaxLimit: Int?=null,
    
    @SerializedName("user_address_count")
    var userAddressCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformGetAddressesResult
*/
@Parcelize
data class PlatformGetAddressesResult(
    
    
    
    @SerializedName("address")
    var address: ArrayList<PlatformAddress>?=null,
    
    @SerializedName("pii_masking")
    var piiMasking: Boolean?=null,
    
    @SerializedName("validation_config")
    var validationConfig: ValidationConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SaveAddressResult
*/
@Parcelize
data class SaveAddressResult(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("address_id")
    var addressId: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateAddressResult
*/
@Parcelize
data class UpdateAddressResult(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_updated")
    var isUpdated: Boolean?=null,
    
    @SerializedName("address_id")
    var addressId: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteAddressResult
*/
@Parcelize
data class DeleteAddressResult(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformSelectCartAddressPayload
*/
@Parcelize
data class PlatformSelectCartAddressPayload(
    
    
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentArticle
*/
@Parcelize
data class ShipmentArticle(
    
    
    
    @SerializedName("meta")
    var meta: String?=null,
    
    @SerializedName("quantity")
    var quantity: String?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentError
*/
@Parcelize
data class ShipmentError(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: ArrayList<String>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformShipmentResult
*/
@Parcelize
data class PlatformShipmentResult(
    
    
    
    @SerializedName("shipments")
    var shipments: Int?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("promise")
    var promise: ShipmentPromise?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<ShipmentArticle>?=null,
    
    @SerializedName("meta")
    var meta: ShipmentMeta?=null,
    
    @SerializedName("logistics_meta")
    var logisticsMeta: ShipmentLogisticsMeta?=null,
    
    @SerializedName("error")
    var error: ShipmentError?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentMeta
*/
@Parcelize
data class ShipmentMeta(
    
    
    
    @SerializedName("packaging_name")
    var packagingName: String?=null,
    
    @SerializedName("dimension")
    var dimension: ShipmentMetaDimension?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: String?=null,
    
    @SerializedName("dp_sort_key")
    var dpSortKey: String?=null,
    
    @SerializedName("shipment_weight")
    var shipmentWeight: Double?=null,
    
    @SerializedName("shipment_volumetric_weight")
    var shipmentVolumetricWeight: Double?=null,
    
    @SerializedName("shipment_chargeable_weight")
    var shipmentChargeableWeight: Double?=null,
    
    @SerializedName("shipping_zone")
    var shippingZone: String?=null,
    
    @SerializedName("debug")
    var debug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentMetaDimension
*/
@Parcelize
data class ShipmentMetaDimension(
    
    
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentLogisticsMeta
*/
@Parcelize
data class ShipmentLogisticsMeta(
    
    
    
    @SerializedName("account_options")
    var accountOptions: ArrayList<ShipmentLogisticsMetaAccount>?=null,
    
    @SerializedName("account_info")
    var accountInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dp_sort_key")
    var dpSortKey: String?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentLogisticsMetaAccount
*/
@Parcelize
data class ShipmentLogisticsMetaAccount(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("fm_priority")
    var fmPriority: Double?=null,
    
    @SerializedName("lm_priority")
    var lmPriority: Double?=null,
    
    @SerializedName("rvp_priority")
    var rvpPriority: Double?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("parent_id")
    var parentId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: String?=null,
    
    @SerializedName("internal_account_id")
    var internalAccountId: String?=null,
    
    @SerializedName("external_account_id")
    var externalAccountId: String?=null,
    
    @SerializedName("f_priority")
    var fPriority: Double?=null,
    
    @SerializedName("r_priority")
    var rPriority: Double?=null,
    
    @SerializedName("dp_shipping_charges")
    var dpShippingCharges: Double?=null,
    
    @SerializedName("qc_enabled")
    var qcEnabled: Boolean?=null,
    
    @SerializedName("area_code")
    var areaCode: ShipmentLogisticsMetaAccountAreaCode?=null,
    
    @SerializedName("operations")
    var operations: ArrayList<String>?=null,
    
    @SerializedName("dp_tat")
    var dpTat: ShipmentLogisticsMetaAccountDpTat?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentLogisticsMetaAccountAreaCode
*/
@Parcelize
data class ShipmentLogisticsMetaAccountAreaCode(
    
    
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("destination")
    var destination: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentLogisticsMetaAccountDpTat
*/
@Parcelize
data class ShipmentLogisticsMetaAccountDpTat(
    
    
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformCartShipmentsResult
*/
@Parcelize
data class PlatformCartShipmentsResult(
    
    
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("common_config")
    var commonConfig: CartCommonConfig?=null,
    
    @SerializedName("coupon")
    var coupon: CartDetailCoupon?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("notification")
    var notification: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff_user_id")
    var staffUserId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("custom_cart")
    var customCart: CustomCart?=null,
    
    @SerializedName("price_adjustment_applied")
    var priceAdjustmentApplied: ArrayList<CartAppliedPriceAdjustment>?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<PlatformShipmentResult>?=null,
    
    @SerializedName("error")
    var error: Boolean?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartShipmentItem
*/
@Parcelize
data class UpdateCartShipmentItem(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("article_uid")
    var articleUid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartShipmentPayload
*/
@Parcelize
data class UpdateCartShipmentPayload(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<UpdateCartShipmentItem>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PlatformCartMetaPayload
*/
@Parcelize
data class PlatformCartMetaPayload(
    
    
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("gift_details")
    var giftDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("staff_user_id")
    var staffUserId: String?=null,
    
    @SerializedName("delivery_slots")
    var deliverySlots: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaResult
*/
@Parcelize
data class CartMetaResult(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaMissingResult
*/
@Parcelize
data class CartMetaMissingResult(
    
    
    
    @SerializedName("errors")
    var errors: CartMetaFieldsValidation?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("meta")
    var meta: CartMetaFieldsValidation?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaFieldsValidation
*/
@Parcelize
data class CartMetaFieldsValidation(
    
    
    
    @SerializedName("pan_no")
    var panNo: ArrayList<String>?=null,
    
    @SerializedName("gstin")
    var gstin: ArrayList<String>?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: ArrayList<String>?=null,
    
    @SerializedName("comment")
    var comment: ArrayList<String>?=null,
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: ArrayList<String>?=null,
    
    @SerializedName("gift_details")
    var giftDetails: ArrayList<String>?=null,
    
    @SerializedName("staff_user_id")
    var staffUserId: ArrayList<String>?=null,
    
    @SerializedName("delivery_slots")
    var deliverySlots: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StaffCheckout
*/
@Parcelize
data class StaffCheckout(
    
    
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomerDetails
*/
@Parcelize
data class CustomerDetails(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
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
    Model: CartCheckoutCustomMeta
*/
@Parcelize
data class CartCheckoutCustomMeta(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformCartCheckoutDetailPayload
*/
@Parcelize
data class PlatformCartCheckoutDetailPayload(
    
    
    
    @SerializedName("custom_meta")
    var customMeta: ArrayList<CartCheckoutCustomMeta>?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("customer_details")
    var customerDetails: CustomerDetails?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff")
    var staff: StaffCheckout?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("files")
    var files: ArrayList<Files>?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("payment_extra_identifiers")
    var paymentExtraIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("iin")
    var iin: String?=null,
    
    @SerializedName("network")
    var network: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("common_config")
    var commonConfig: CartCommonConfig?=null,
    
    @SerializedName("coupon")
    var coupon: CartDetailCoupon?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("notification")
    var notification: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff_user_id")
    var staffUserId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("custom_cart")
    var customCart: CustomCart?=null,
    
    @SerializedName("price_adjustment_applied")
    var priceAdjustmentApplied: ArrayList<CartAppliedPriceAdjustment>?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("cod_message")
    var codMessage: String?=null,
    
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartCheckoutResult
*/
@Parcelize
data class CartCheckoutResult(
    
    
    
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart")
    var cart: CheckCart?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartDeliveryModesResult
*/
@Parcelize
data class CartDeliveryModesResult(
    
    
    
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
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("store_manager_name")
    var storeManagerName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("sector")
    var sector: String?=null,
    
    @SerializedName("state_code")
    var stateCode: String?=null,
    
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDetailsResult
*/
@Parcelize
data class StoreDetailsResult(
    
    
    
    @SerializedName("items")
    var items: ArrayList<PickupStoreDetail>?=null,
    
    @SerializedName("data")
    var data: ArrayList<PickupStoreDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartPaymentPayload
*/
@Parcelize
data class UpdateCartPaymentPayload(
    
    
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponValidity
*/
@Parcelize
data class CouponValidity(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("next_validation_required")
    var nextValidationRequired: Boolean?=null,
    
    @SerializedName("valid")
    var valid: Boolean?=null,
    
    @SerializedName("display_message_en")
    var displayMessageEn: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("error_en")
    var errorEn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCouponValidate
*/
@Parcelize
data class PaymentCouponValidate(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("coupon_validity")
    var couponValidity: CouponValidity?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMeta
*/
@Parcelize
data class PaymentMeta(
    
    
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethod
*/
@Parcelize
data class PaymentMethod(
    
    
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("payment")
    var payment: String?=null,
    
    @SerializedName("payment_meta")
    var paymentMeta: PaymentMeta?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("payment_extra_identifiers")
    var paymentExtraIdentifiers: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PlatformCartCheckoutDetailV2Payload
*/
@Parcelize
data class PlatformCartCheckoutDetailV2Payload(
    
    
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_meta")
    var customMeta: ArrayList<CartCheckoutCustomMeta>?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("customer_details")
    var customerDetails: CustomerDetails?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethod>?=null,
    
    @SerializedName("staff")
    var staff: StaffCheckout?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("files")
    var files: ArrayList<Files>?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("iin")
    var iin: String?=null,
    
    @SerializedName("network")
    var network: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartPaymentPayloadV2
*/
@Parcelize
data class UpdateCartPaymentPayloadV2(
    
    
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethod>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PriceMinMax
*/
@Parcelize
data class PriceMinMax(
    
    
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ItemPriceDetails
*/
@Parcelize
data class ItemPriceDetails(
    
    
    
    @SerializedName("marked")
    var marked: PriceMinMax?=null,
    
    @SerializedName("effective")
    var effective: PriceMinMax?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticlePriceDetails
*/
@Parcelize
data class ArticlePriceDetails(
    
    
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("effective")
    var effective: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FreeGiftItems
*/
@Parcelize
data class FreeGiftItems(
    
    
    
    @SerializedName("item_slug")
    var itemSlug: String?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("item_price_details")
    var itemPriceDetails: ItemPriceDetails?=null,
    
    @SerializedName("article_price")
    var articlePrice: ArticlePriceDetails?=null,
    
    @SerializedName("item_brand_name")
    var itemBrandName: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("available_sizes")
    var availableSizes: ArrayList<String>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("item_images_url")
    var itemImagesUrl: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionOffer
*/
@Parcelize
data class PromotionOffer(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("valid_till")
    var validTill: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("free_gift_items")
    var freeGiftItems: ArrayList<FreeGiftItems>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_bank_offer")
    var isBankOffer: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionOffersResult
*/
@Parcelize
data class PromotionOffersResult(
    
    
    
    @SerializedName("available_promotions")
    var availablePromotions: ArrayList<PromotionOffer>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PromotionPaymentOffer
*/
@Parcelize
data class PromotionPaymentOffer(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionPaymentOffersDetails
*/
@Parcelize
data class PromotionPaymentOffersDetails(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("promotions")
    var promotions: ArrayList<PromotionPaymentOffer>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CouponOptions
*/
@Parcelize
data class CouponOptions(
    
    
    
    @SerializedName("types")
    var types: CouponOptionTypes?=null,
    
    @SerializedName("scopes")
    var scopes: CouponOptionScopes?=null,
    
    @SerializedName("applicable_on")
    var applicableOn: CouponOptionsApplicable?=null,
    
    @SerializedName("value_types")
    var valueTypes: CouponOptionsValueTypes?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: CouponOptionsCalculate?=null,
    
    @SerializedName("payable_category")
    var payableCategory: CouponOptionsPayableCategory?=null,
    
    @SerializedName("txn_mode")
    var txnMode: CouponOptionsTxnMode?=null,
    
    @SerializedName("payable_by")
    var payableBy: CouponOptionsPayableBy?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponOptionTypes
*/
@Parcelize
data class CouponOptionTypes(
    
    
    
    @SerializedName("absolute")
    var absolute: String?=null,
    
    @SerializedName("percentage")
    var percentage: String?=null,
    
    @SerializedName("bogo")
    var bogo: String?=null,
    
    @SerializedName("bundle")
    var bundle: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponOptionScopes
*/
@Parcelize
data class CouponOptionScopes(
    
    
    
    @SerializedName("category_id")
    var categoryId: String?=null,
    
    @SerializedName("brand_id")
    var brandId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("store_id")
    var storeId: String?=null,
    
    @SerializedName("collection_id")
    var collectionId: String?=null,
    
    @SerializedName("exclude_brand_id")
    var excludeBrandId: String?=null,
    
    @SerializedName("category_department")
    var categoryDepartment: String?=null,
    
    @SerializedName("l1_category_id")
    var l1CategoryId: String?=null,
    
    @SerializedName("l2_category_id")
    var l2CategoryId: String?=null,
    
    @SerializedName("exclude_category_id")
    var excludeCategoryId: String?=null,
    
    @SerializedName("exclude_l1_category_id")
    var excludeL1CategoryId: String?=null,
    
    @SerializedName("exclude_l2_category_id")
    var excludeL2CategoryId: String?=null,
    
    @SerializedName("item_tags")
    var itemTags: String?=null,
    
    @SerializedName("tags")
    var tags: String?=null,
    
    @SerializedName("zones_id")
    var zonesId: String?=null,
    
    @SerializedName("cart_type")
    var cartType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponOptionsApplicable
*/
@Parcelize
data class CouponOptionsApplicable(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("quantity")
    var quantity: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CouponOptionsValueTypes
*/
@Parcelize
data class CouponOptionsValueTypes(
    
    
    
    @SerializedName("absolute")
    var absolute: String?=null,
    
    @SerializedName("percentage")
    var percentage: String?=null,
    
    @SerializedName("quantity")
    var quantity: String?=null,
    
    @SerializedName("flat_price")
    var flatPrice: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponOptionsCalculate
*/
@Parcelize
data class CouponOptionsCalculate(
    
    
    
    @SerializedName("mrp")
    var mrp: String?=null,
    
    @SerializedName("esp")
    var esp: String?=null,
    
    @SerializedName("tp")
    var tp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponOptionsPayableCategory
*/
@Parcelize
data class CouponOptionsPayableCategory(
    
    
    
    @SerializedName("fynd")
    var fynd: String?=null,
    
    @SerializedName("seller")
    var seller: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CouponOptionsTxnMode
*/
@Parcelize
data class CouponOptionsTxnMode(
    
    
    
    @SerializedName("fynd_cash")
    var fyndCash: String?=null,
    
    @SerializedName("cash")
    var cash: String?=null,
    
    @SerializedName("coupon")
    var coupon: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponOptionsPayableBy
*/
@Parcelize
data class CouponOptionsPayableBy(
    
    
    
    @SerializedName("fynd_marketing")
    var fyndMarketing: String?=null,
    
    @SerializedName("fynd")
    var fynd: String?=null,
    
    @SerializedName("fynd_store")
    var fyndStore: String?=null,
    
    @SerializedName("fynd_delights")
    var fyndDelights: String?=null,
    
    @SerializedName("fynd_ops")
    var fyndOps: String?=null,
    
    @SerializedName("fynd_inventory")
    var fyndInventory: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SelectAddressResponseError
*/
@Parcelize
data class SelectAddressResponseError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Double?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("address")
    var address: AllAddressForSelectAddress?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AllAddressForSelectAddress
*/
@Parcelize
data class AllAddressForSelectAddress(
    
    
    
    @SerializedName("address")
    var address: ArrayList<PlatformAddress>?=null,
    
    @SerializedName("pii_masking")
    var piiMasking: Boolean?=null,
    
    @SerializedName("validation_config")
    var validationConfig: ValidationConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OperationErrorResult
*/
@Parcelize
data class OperationErrorResult(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ValidationError
*/
@Parcelize
data class ValidationError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("field")
    var field: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}





