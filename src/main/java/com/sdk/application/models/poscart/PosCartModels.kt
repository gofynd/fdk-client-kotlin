package com.sdk.application.models.poscart

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
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
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("add_on")
    var addOn: Double?=null,
    
    @SerializedName("selling")
    var selling: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
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
    Model: ProductAvailabilitySize
*/
@Parcelize
data class ProductAvailabilitySize(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("available_sizes")
    var availableSizes: ArrayList<ProductAvailabilitySize>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BasePrice
*/
@Parcelize
data class BasePrice(
    
    
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
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
    Model: StoreInfo
*/
@Parcelize
data class StoreInfo(
    
    
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
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
    
    
    
    @SerializedName("gift_card")
    var giftCard: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_gift_visible")
    var isGiftVisible: Boolean?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("store")
    var store: StoreInfo?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cart_item_meta")
    var cartItemMeta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductImage
*/
@Parcelize
data class ProductImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    
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
    Model: CartProduct
*/
@Parcelize
data class CartProduct(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<ProductImage>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    
    @SerializedName("action")
    var action: ProductAction?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: Tags?=null
    
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
    
    
    
    @SerializedName("item_images_url")
    var itemImagesUrl: ArrayList<String>?=null,
    
    @SerializedName("item_price_details")
    var itemPriceDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("item_slug")
    var itemSlug: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_brand_name")
    var itemBrandName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedFreeArticles
*/
@Parcelize
data class AppliedFreeArticles(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("free_gift_item_details")
    var freeGiftItemDetails: FreeGiftItem?=null,
    
    @SerializedName("parent_item_identifier")
    var parentItemIdentifier: String?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null
    
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
    Model: DiscountRulesApp
*/
@Parcelize
data class DiscountRulesApp(
    
    
    
    @SerializedName("raw_offer")
    var rawOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_criteria")
    var itemCriteria: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("matched_buy_rules")
    var matchedBuyRules: ArrayList<String>?=null,
    
    @SerializedName("offer")
    var offer: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppliedPromotion
*/
@Parcelize
data class AppliedPromotion(
    
    
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: ArrayList<BuyRules>?=null,
    
    @SerializedName("applied_free_articles")
    var appliedFreeArticles: ArrayList<AppliedFreeArticles>?=null,
    
    @SerializedName("ownership")
    var ownership: Ownership?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRulesApp>?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null
    
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
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    
    
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    
    @SerializedName("article")
    var article: ProductArticle?=null,
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product")
    var product: CartProduct?=null,
    
    @SerializedName("moq")
    var moq: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("coupon")
    var coupon: CouponDetails?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductPriceInfo?=null,
    
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promotions_applied")
    var promotionsApplied: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: PromoMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("coupon")
    var coupon: Double?=null,
    
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    
    @SerializedName("convenience_fee")
    var convenienceFee: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("vog")
    var vog: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("gst_charges")
    var gstCharges: Double?=null,
    
    @SerializedName("mrp_total")
    var mrpTotal: Double?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    
    @SerializedName("gift_card")
    var giftCard: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("applicable")
    var applicable: Double?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    
    
    @SerializedName("raw")
    var raw: RawBreakup?=null,
    
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null
    
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
    Model: CartDetailResponse
*/
@Parcelize
data class CartDetailResponse(
    
    
    
    @SerializedName("pan_no")
    var panNo: String?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("pan_config")
    var panConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("applied_promo_details")
    var appliedPromoDetails: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: ArrayList<HashMap<String,String>>?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null
    
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
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("partial")
    var partial: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
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
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null,
    
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
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null
    
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
    
    @SerializedName("effective")
    var effective: Int?=null,
    
    @SerializedName("bulk_effective")
    var bulkEffective: Double?=null,
    
    @SerializedName("marked")
    var marked: Int?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    
    
    @SerializedName("price")
    var price: OfferPrice?=null,
    
    @SerializedName("auto_applied")
    var autoApplied: Boolean?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("best")
    var best: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("margin")
    var margin: Int?=null
    
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
    var seller: OfferSeller?=null
    
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
    
    
    
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("google_map_point")
    var googleMapPoint: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("created_by_user_id")
    var createdByUserId: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("country_iso_code")
    var countryIsoCode: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("country_phone_code")
    var countryPhoneCode: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
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
    var address: ArrayList<Address>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SaveAddressResponse
*/
@Parcelize
data class SaveAddressResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_updated")
    var isUpdated: Boolean?=null,
    
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
    Model: SelectCartAddressRequest
*/
@Parcelize
data class SelectCartAddressRequest(
    
    
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartPaymentRequest
*/
@Parcelize
data class UpdateCartPaymentRequest(
    
    
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CouponValidity
*/
@Parcelize
data class CouponValidity(
    
    
    
    @SerializedName("display_message_en")
    var displayMessageEn: String?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("valid")
    var valid: Boolean?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PaymentCouponValidate
*/
@Parcelize
data class PaymentCouponValidate(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("coupon_validity")
    var couponValidity: CouponValidity?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("promise")
    var promise: ShipmentPromise?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("shipments")
    var shipments: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    
    @SerializedName("error")
    var error: Boolean?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCartShipmentItem
*/
@Parcelize
data class UpdateCartShipmentItem(
    
    
    
    @SerializedName("article_uid")
    var articleUid: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
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
    Model: CartCheckoutCustomMeta
*/
@Parcelize
data class CartCheckoutCustomMeta(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
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
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("user")
    var user: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartPosCheckoutDetailRequest
*/
@Parcelize
data class CartPosCheckoutDetailRequest(
    
    
    
    @SerializedName("custom_meta")
    var customMeta: ArrayList<CartCheckoutCustomMeta>?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("files")
    var files: ArrayList<Files>?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff")
    var staff: StaffCheckout?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("cod_message")
    var codMessage: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("cart")
    var cart: CheckCart?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null
    
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
    
    
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("gift_details")
    var giftDetails: ArticleGiftDetail?=null
    
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
    var errors: ArrayList<String>?=null
    
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
    
    
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("email")
    var email: String?=null
    
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
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("token")
    var token: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SharedCart
*/
@Parcelize
data class SharedCart(
    
    
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null
    
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



