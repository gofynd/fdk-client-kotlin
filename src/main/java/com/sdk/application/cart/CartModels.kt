package com.sdk.application.cart

import com.sdk.application.*





import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
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
    Model: PromoDiscountRuleOffer
*/
@Parcelize
data class PromoDiscountRuleOffer(
    
    
    
    @SerializedName("max_offer_quantity")
    var maxOfferQuantity: Double?=null,
    
    @SerializedName("discount_percentage")
    var discountPercentage: Double?=null,
    
    @SerializedName("discount_amount")
    var discountAmount: Double?=null
    
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
    var buyRules: ArrayList<String>?=null,
    
    @SerializedName("all_items")
    var allItems: Boolean?=null
    
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
    Model: PaymentSelectionLock
*/
@Parcelize
data class PaymentSelectionLock(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("default_options")
    var defaultOptions: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null
    
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
    
    
    
    @SerializedName("base")
    var base: BasePrice?=null,
    
    @SerializedName("converted")
    var converted: BasePrice?=null
    
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
    Model: BaseChargeCurrency
*/
@Parcelize
data class BaseChargeCurrency(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ChargesAmount
*/
@Parcelize
data class ChargesAmount(
    
    
    
    @SerializedName("ordering_currency")
    var orderingCurrency: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("base_currency")
    var baseCurrency: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Charges
*/
@Parcelize
data class Charges(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("amount")
    var amount: ChargesAmount?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("allow_refund")
    var allowRefund: Boolean?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    
    
    
    @SerializedName("base")
    var base: ProductPrice?=null,
    
    @SerializedName("converted")
    var converted: ProductPrice?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPricePerUnit
*/
@Parcelize
data class ProductPricePerUnit(
    
    
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("selling_price")
    var sellingPrice: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("add_on")
    var addOn: Double?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPricePerUnitInfo
*/
@Parcelize
data class ProductPricePerUnitInfo(
    
    
    
    @SerializedName("base")
    var base: ProductPricePerUnit?=null,
    
    @SerializedName("converted")
    var converted: ProductPricePerUnit?=null
    
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
    
    
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    
    @SerializedName("available_sizes")
    var availableSizes: ArrayList<ProductAvailabilitySize>?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Long?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null
    
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
    Model: Tags
*/
@Parcelize
data class Tags(
    
    
    
    @SerializedName("tags")
    var tags: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductImage
*/
@Parcelize
data class ProductImage(
    
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
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
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("l1_categories")
    var l1Categories: ArrayList<Double>?=null,
    
    @SerializedName("l2_categories")
    var l2Categories: ArrayList<Double>?=null,
    
    @SerializedName("l3_categories")
    var l3Categories: ArrayList<Double>?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Double>?=null
    
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
    
    @SerializedName("seller_count")
    var sellerCount: Double?=null,
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("discount_meta")
    var discountMeta: DiscountMeta?=null,
    
    @SerializedName("journey_wise_promise")
    var journeyWisePromise: ArrayList<JourneyPromiseObject>?=null,
    
    @SerializedName("distance")
    var distance: Double?=null
    
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
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("preset")
    var preset: Double?=null
    
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
    Model: CartDetailResponse
*/
@Parcelize
data class CartDetailResponse(
    
    
    
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
    
    @SerializedName("custom_cart")
    var customCart: CustomCart?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error_code")
    var errorCode: String?=null
    
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
    
    @SerializedName("price_factory_type_id")
    var priceFactoryTypeId: String?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: ArrayList<HashMap<String,String>>?=null,
    
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
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null,
    
    @SerializedName("partial")
    var partial: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error_code")
    var errorCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price_factory_type_id")
    var priceFactoryTypeId: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
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
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("error_code")
    var errorCode: String?=null
    
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
    Model: CartItemCountResponseV2
*/
@Parcelize
data class CartItemCountResponseV2(
    
    
    
    @SerializedName("user_all_cart_articles_quantity_count")
    var userAllCartArticlesQuantityCount: Int?=null,
    
    @SerializedName("user_all_cart_article_count")
    var userAllCartArticleCount: Int?=null,
    
    @SerializedName("custom_cart_count")
    var customCartCount: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_cart_ordered_count")
    var customCartOrderedCount: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    Model: OfferPrice
*/
@Parcelize
data class OfferPrice(
    
    
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("bulk_effective")
    var bulkEffective: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("effective")
    var effective: Int?=null,
    
    @SerializedName("marked")
    var marked: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    
    
    @SerializedName("price")
    var price: OfferPrice?=null,
    
    @SerializedName("margin")
    var margin: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("best")
    var best: Boolean?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("auto_applied")
    var autoApplied: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OfferSeller
*/
@Parcelize
data class OfferSeller(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkPriceOffer
*/
@Parcelize
data class BulkPriceOffer(
    
    
    
    @SerializedName("offers")
    var offers: ArrayList<OfferItem>?=null,
    
    @SerializedName("seller")
    var seller: OfferSeller?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkPriceResponse
*/
@Parcelize
data class BulkPriceResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<BulkPriceOffer>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: RewardPointRequest
*/
@Parcelize
data class RewardPointRequest(
    
    
    
    @SerializedName("points")
    var points: Boolean?=null
    
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
    Model: Address
*/
@Parcelize
data class Address(
    
    
    
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
    var customJson: @RawValue HashMap<String,Any>?=null,
    
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
    Model: GetAddressesResponse
*/
@Parcelize
data class GetAddressesResponse(
    
    
    
    @SerializedName("pii_masking")
    var piiMasking: Boolean?=null,
    
    @SerializedName("address")
    var address: ArrayList<Address>?=null,
    
    @SerializedName("validation_config")
    var validationConfig: ValidationConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SaveAddressResponse
*/
@Parcelize
data class SaveAddressResponse(
    
    
    
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
    Model: UpdateAddressResponse
*/
@Parcelize
data class UpdateAddressResponse(
    
    
    
    @SerializedName("is_updated")
    var isUpdated: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null
    
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
    var isDeleted: Boolean?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SelectCartAddressRequest
*/
@Parcelize
data class SelectCartAddressRequest(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null
    
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
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null
    
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
    var discount: Double?=null
    
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
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    
    
    @SerializedName("shipments")
    var shipments: Int?=null,
    
    @SerializedName("promise")
    var promise: ShipmentPromise?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("meta")
    var meta: ShipmentMeta?=null,
    
    @SerializedName("logistics_meta")
    var logisticsMeta: ShipmentLogisticsMeta?=null,
    
    @SerializedName("error")
    var error: ShipmentError?=null,
    
    @SerializedName("journey_wise_promise")
    var journeyWisePromise: ArrayList<JourneyPromiseObject>?=null,
    
    @SerializedName("distance")
    var distance: Double?=null
    
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
    var shippingZone: String?=null
    
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
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    
    
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
    var shipments: ArrayList<ShipmentResponse>?=null,
    
    @SerializedName("error")
    var error: Boolean?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error_code")
    var errorCode: String?=null
    
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
    Model: CustomerDetails
*/
@Parcelize
data class CustomerDetails(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StaffCheckout
*/
@Parcelize
data class StaffCheckout(
    
    
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartCheckoutDetailRequest
*/
@Parcelize
data class CartCheckoutDetailRequest(
    
    
    
    @SerializedName("custom_meta")
    var customMeta: ArrayList<CartCheckoutCustomMeta>?=null,
    
    @SerializedName("customer_details")
    var customerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff")
    var staff: StaffCheckout?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
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
    
    
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("cod_message")
    var codMessage: String?=null,
    
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
    var priceAdjustmentApplied: ArrayList<PriceAdjustmentApplied>?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error_code")
    var errorCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null,
    
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("cart")
    var cart: CheckCart?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GiftDetail
*/
@Parcelize
data class GiftDetail(
    
    
    
    @SerializedName("is_gift_applied")
    var isGiftApplied: Boolean?=null,
    
    @SerializedName("gift_message")
    var giftMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleGiftDetail
*/
@Parcelize
data class ArticleGiftDetail(
    
    
    
    @SerializedName("article_id")
    var articleId: GiftDetail?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CartMetaRequest
*/
@Parcelize
data class CartMetaRequest(
    
    
    
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
    Model: CartMetaResponse
*/
@Parcelize
data class CartMetaResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CartMetaMissingResponse
*/
@Parcelize
data class CartMetaMissingResponse(
    
    
    
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
    var deliverySlots: ArrayList<String>?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null
    
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
    
    
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null,
    
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
    
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    
    @SerializedName("is_pan_received")
    var isPanReceived: Boolean?=null,
    
    @SerializedName("custom_cart_meta")
    var customCartMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SharedCartResponse
*/
@Parcelize
data class SharedCartResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("cart")
    var cart: SharedCart?=null
    
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
    
    @SerializedName("item_brand_name")
    var itemBrandName: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
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
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionOffersResponse
*/
@Parcelize
data class PromotionOffersResponse(
    
    
    
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
    var promotionName: String?=null,
    
    @SerializedName("valid_till")
    var validTill: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PromotionPaymentOffersResponse
*/
@Parcelize
data class PromotionPaymentOffersResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("promotions")
    var promotions: ArrayList<PromotionPaymentOffer>?=null
    
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
    Model: StandardError
*/
@Parcelize
data class StandardError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: LadderPrice
*/
@Parcelize
data class LadderPrice(
    
    
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("offer_price")
    var offerPrice: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("effective")
    var effective: Int?=null,
    
    @SerializedName("marked")
    var marked: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LadderOfferItem
*/
@Parcelize
data class LadderOfferItem(
    
    
    
    @SerializedName("price")
    var price: LadderPrice?=null,
    
    @SerializedName("margin")
    var margin: Int?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LadderPriceOffer
*/
@Parcelize
data class LadderPriceOffer(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("valid_till")
    var validTill: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("offer_prices")
    var offerPrices: ArrayList<LadderOfferItem>?=null,
    
    @SerializedName("free_gift_items")
    var freeGiftItems: ArrayList<FreeGiftItems>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CurrencyInfo
*/
@Parcelize
data class CurrencyInfo(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LadderPriceOffers
*/
@Parcelize
data class LadderPriceOffers(
    
    
    
    @SerializedName("available_offers")
    var availableOffers: ArrayList<LadderPriceOffer>?=null,
    
    @SerializedName("currency")
    var currency: CurrencyInfo?=null,
    
    @SerializedName("store_id")
    var storeId: ArrayList<Double>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMeta
*/
@Parcelize
data class PaymentMeta(
    
    
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentMethod
*/
@Parcelize
data class PaymentMethod(
    
    
    
    @SerializedName("payment_meta")
    var paymentMeta: PaymentMeta?=null,
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("payment")
    var payment: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("payment_extra_identifiers")
    var paymentExtraIdentifiers: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartCheckoutDetailV2Request
*/
@Parcelize
data class CartCheckoutDetailV2Request(
    
    
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("customer_details")
    var customerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: ArrayList<PaymentMethod>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff")
    var staff: StaffCheckout?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
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
    Model: CartMetaConfigListResponse
*/
@Parcelize
data class CartMetaConfigListResponse(
    
    
    
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
    var isActive: Boolean?=null,
    
    @SerializedName("article_tags")
    var articleTags: ArrayList<String>?=null
    
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
    Model: CartConfigDetailObj
*/
@Parcelize
data class CartConfigDetailObj(
    
    
    
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
    var lastModifiedBy: String?=null,
    
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
    var deliveryCharges: DeliveryChargesConfig?=null,
    
    @SerializedName("revenue_engine_coupon")
    var revenueEngineCoupon: Boolean?=null,
    
    @SerializedName("gift_pricing")
    var giftPricing: Double?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
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
    
    @SerializedName("hide_on_storefront")
    var hideOnStorefront: Boolean?=null,
    
    @SerializedName("pan_card")
    var panCard: PanCard?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_universal")
    var isUniversal: Boolean?=null,
    
    @SerializedName("international_delivery_charges")
    var internationalDeliveryCharges: DeliveryChargesConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartConfigDetailResponse
*/
@Parcelize
data class CartConfigDetailResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: CartConfigDetailObj?=null
    
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
    var address: ArrayList<Address>?=null,
    
    @SerializedName("pii_masking")
    var piiMasking: Boolean?=null,
    
    @SerializedName("validation_config")
    var validationConfig: ValidationConfig?=null
    
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
    Model: DeliveryPromiseObject
*/
@Parcelize
data class DeliveryPromiseObject(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JourneyPromiseObject
*/
@Parcelize
data class JourneyPromiseObject(
    
    
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: DeliveryPromiseObject?=null
    
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





