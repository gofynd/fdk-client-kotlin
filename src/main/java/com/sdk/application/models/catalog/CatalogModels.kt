package com.sdk.application.models.catalog

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: ApplicationItemMOQ
*/
@Parcelize
data class ApplicationItemMOQ(
    
    
    
    @SerializedName("maximum")
    var maximum: Int?=null,
    
    @SerializedName("increment_unit")
    var incrementUnit: Int?=null,
    
    @SerializedName("minimum")
    var minimum: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Media
*/
@Parcelize
data class Media(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("alt")
    var alt: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("meta")
    var meta: Meta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetailAttribute
*/
@Parcelize
data class ProductDetailAttribute(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetailGroupedAttribute
*/
@Parcelize
data class ProductDetailGroupedAttribute(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("details")
    var details: ArrayList<ProductDetailAttribute>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingAction
*/
@Parcelize
data class ProductListingAction(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("page")
    var page: ProductListingActionPage?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NetQuantity
*/
@Parcelize
data class NetQuantity(
    
    
    
    @SerializedName("unit")
    var unit: @RawValue Any?=null,
    
    @SerializedName("value")
    var value: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductCategoryMap
*/
@Parcelize
data class ProductCategoryMap(
    
    
    
    @SerializedName("l3")
    var l3: ProductBrand?=null,
    
    @SerializedName("l1")
    var l1: ProductBrand?=null,
    
    @SerializedName("l2")
    var l2: ProductBrand?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationItemSEO
*/
@Parcelize
data class ApplicationItemSEO(
    
    
    
    @SerializedName("title")
    var title: @RawValue Any?=null,
    
    @SerializedName("description")
    var description: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetailCustomOrder
*/
@Parcelize
data class ProductDetailCustomOrder(
    
    
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("is_custom_order")
    var isCustomOrder: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Price
*/
@Parcelize
data class Price(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("max")
    var max: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    
    
    @SerializedName("effective")
    var effective: Price?=null,
    
    @SerializedName("marked")
    var marked: Price?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomMetaFields
*/
@Parcelize
data class CustomMetaFields(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    
    
    @SerializedName("moq")
    var moq: ApplicationItemMOQ?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("category_map")
    var categoryMap: ProductCategoryMap?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("seo")
    var seo: ApplicationItemSEO?=null,
    
    @SerializedName("custom_order")
    var customOrder: ProductDetailCustomOrder?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<CustomMetaFields>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: Weight
*/
@Parcelize
data class Weight(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("shipping")
    var shipping: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Dimension
*/
@Parcelize
data class Dimension(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("weight")
    var weight: Weight?=null,
    
    @SerializedName("seller_identifiers")
    var sellerIdentifiers: ArrayList<String>?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("dimension")
    var dimension: Dimension?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SizeChartValues
*/
@Parcelize
data class SizeChartValues(
    
    
    
    @SerializedName("col_4")
    var col4: String?=null,
    
    @SerializedName("col_5")
    var col5: String?=null,
    
    @SerializedName("col_2")
    var col2: String?=null,
    
    @SerializedName("col_3")
    var col3: String?=null,
    
    @SerializedName("col_6")
    var col6: String?=null,
    
    @SerializedName("col_1")
    var col1: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ColumnHeader
*/
@Parcelize
data class ColumnHeader(
    
    
    
    @SerializedName("convertable")
    var convertable: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ColumnHeaders
*/
@Parcelize
data class ColumnHeaders(
    
    
    
    @SerializedName("col_4")
    var col4: ColumnHeader?=null,
    
    @SerializedName("col_5")
    var col5: ColumnHeader?=null,
    
    @SerializedName("col_2")
    var col2: ColumnHeader?=null,
    
    @SerializedName("col_3")
    var col3: ColumnHeader?=null,
    
    @SerializedName("col_6")
    var col6: ColumnHeader?=null,
    
    @SerializedName("col_1")
    var col1: ColumnHeader?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SizeChart
*/
@Parcelize
data class SizeChart(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("size_tip")
    var sizeTip: String?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<SizeChartValues>?=null,
    
    @SerializedName("image")
    var image: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("headers")
    var headers: ColumnHeaders?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSizeStores
*/
@Parcelize
data class ProductSizeStores(
    
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductSizes
*/
@Parcelize
data class ProductSizes(
    
    
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSize>?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("size_chart")
    var sizeChart: SizeChart?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    
    @SerializedName("stores")
    var stores: ProductSizeStores?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeDetail
*/
@Parcelize
data class AttributeDetail(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeMetadata
*/
@Parcelize
data class AttributeMetadata(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("details")
    var details: ArrayList<AttributeDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductsComparisonResponse
*/
@Parcelize
data class ProductsComparisonResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null,
    
    @SerializedName("attributes_metadata")
    var attributesMetadata: ArrayList<AttributeMetadata>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductCompareResponse
*/
@Parcelize
data class ProductCompareResponse(
    
    
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null,
    
    @SerializedName("attributes_metadata")
    var attributesMetadata: ArrayList<AttributeMetadata>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFrequentlyComparedSimilarResponse
*/
@Parcelize
data class ProductFrequentlyComparedSimilarResponse(
    
    
    
    @SerializedName("similars")
    var similars: ProductCompareResponse?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductVariantItemResponse
*/
@Parcelize
data class ProductVariantItemResponse(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("color_name")
    var colorName: String?=null,
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<CustomMetaFields>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductVariantResponse
*/
@Parcelize
data class ProductVariantResponse(
    
    
    
    @SerializedName("header")
    var header: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductVariantItemResponse>?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductVariantsResponse
*/
@Parcelize
data class ProductVariantsResponse(
    
    
    
    @SerializedName("variants")
    var variants: ArrayList<ProductVariantResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductStockPrice
*/
@Parcelize
data class ProductStockPrice(
    
    
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Seller
*/
@Parcelize
data class Seller(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyDetail
*/
@Parcelize
data class CompanyDetail(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    
    @SerializedName("store")
    var store: StoreDetail?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("seller")
    var seller: Seller?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("company")
    var company: CompanyDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductStockStatusResponse
*/
@Parcelize
data class ProductStockStatusResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductStockStatusItem>?=null
    
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
    Model: ProductStockPolling
*/
@Parcelize
data class ProductStockPolling(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductStockStatusItem>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductVariantListingResponse
*/
@Parcelize
data class ProductVariantListingResponse(
    
    
    
    @SerializedName("header")
    var header: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductVariantItemResponse>?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    
    
    @SerializedName("moq")
    var moq: ApplicationItemMOQ?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("variants")
    var variants: ArrayList<ProductVariantListingResponse>?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("category_map")
    var categoryMap: ProductCategoryMap?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("seo")
    var seo: ApplicationItemSEO?=null,
    
    @SerializedName("custom_order")
    var customOrder: ProductDetailCustomOrder?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<CustomMetaFields>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("identifiers")
    var identifiers: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("kind")
    var kind: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    
    @SerializedName("display_format")
    var displayFormat: String?=null,
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("query_format")
    var queryFormat: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    
    
    @SerializedName("key")
    var key: ProductFiltersKey?=null,
    
    @SerializedName("values")
    var values: ArrayList<ProductFiltersValue>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ImageUrls
*/
@Parcelize
data class ImageUrls(
    
    
    
    @SerializedName("landscape")
    var landscape: Media?=null,
    
    @SerializedName("portrait")
    var portrait: Media?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BrandItem
*/
@Parcelize
data class BrandItem(
    
    
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BrandItem>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BrandDetailResponse
*/
@Parcelize
data class BrandDetailResponse(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ThirdLevelChild
*/
@Parcelize
data class ThirdLevelChild(
    
    
    
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SecondLevelChild
*/
@Parcelize
data class SecondLevelChild(
    
    
    
    @SerializedName("childs")
    var childs: ArrayList<ThirdLevelChild>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Child
*/
@Parcelize
data class Child(
    
    
    
    @SerializedName("childs")
    var childs: ArrayList<SecondLevelChild>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryBanner
*/
@Parcelize
data class CategoryBanner(
    
    
    
    @SerializedName("landscape")
    var landscape: Media?=null,
    
    @SerializedName("portrait")
    var portrait: Media?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    
    
    @SerializedName("childs")
    var childs: ArrayList<Child>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: CategoryBanner?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    
    
    @SerializedName("department")
    var department: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CategoryItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentIdentifier
*/
@Parcelize
data class DepartmentIdentifier(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryListingResponse
*/
@Parcelize
data class CategoryListingResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<DepartmentCategoryTree>?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<DepartmentIdentifier>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryMetaResponse
*/
@Parcelize
data class CategoryMetaResponse(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HomeListingResponse
*/
@Parcelize
data class HomeListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Department
*/
@Parcelize
data class Department(
    
    
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentResponse
*/
@Parcelize
data class DepartmentResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Department>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AutocompleteItem
*/
@Parcelize
data class AutocompleteItem(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AutoCompleteResponse
*/
@Parcelize
data class AutoCompleteResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AutocompleteItem>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CollectionQuery
*/
@Parcelize
data class CollectionQuery(
    
    
    
    @SerializedName("value")
    var value: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("op")
    var op: String?=null,
    
    @SerializedName("attribute")
    var attribute: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    
    
    @SerializedName("type")
    var type: ArrayList<CollectionListingFilterType>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<CollectionListingFilterTag>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetFollowListingResponse
*/
@Parcelize
data class GetFollowListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FollowPostResponse
*/
@Parcelize
data class FollowPostResponse(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: FollowerCountResponse
*/
@Parcelize
data class FollowerCountResponse(
    
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FollowIdsData
*/
@Parcelize
data class FollowIdsData(
    
    
    
    @SerializedName("collections")
    var collections: ArrayList<Int>?=null,
    
    @SerializedName("products")
    var products: ArrayList<Int>?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FollowIdsResponse
*/
@Parcelize
data class FollowIdsResponse(
    
    
    
    @SerializedName("data")
    var data: FollowIdsData?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: LatLong
*/
@Parcelize
data class LatLong(
    
    
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Store
*/
@Parcelize
data class Store(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("lat_long")
    var latLong: LatLong?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("store_email")
    var storeEmail: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreListingResponse
*/
@Parcelize
data class StoreListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Store>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SellerPhoneNumber
*/
@Parcelize
data class SellerPhoneNumber(
    
    
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreManagerSerializer
*/
@Parcelize
data class StoreManagerSerializer(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("mobile_no")
    var mobileNo: SellerPhoneNumber?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreAddressSerializer
*/
@Parcelize
data class StoreAddressSerializer(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyStore
*/
@Parcelize
data class CompanyStore(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDepartments
*/
@Parcelize
data class StoreDepartments(
    
    
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("logo")
    var logo: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppStore
*/
@Parcelize
data class AppStore(
    
    
    
    @SerializedName("manager")
    var manager: StoreManagerSerializer?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("address")
    var address: StoreAddressSerializer?=null,
    
    @SerializedName("company")
    var company: CompanyStore?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<StoreDepartments>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationStoreListing
*/
@Parcelize
data class ApplicationStoreListing(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AppStore>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("filters")
    var filters: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Time
*/
@Parcelize
data class Time(
    
    
    
    @SerializedName("minute")
    var minute: Int?=null,
    
    @SerializedName("hour")
    var hour: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreTiming
*/
@Parcelize
data class StoreTiming(
    
    
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null,
    
    @SerializedName("opening")
    var opening: Time?=null,
    
    @SerializedName("closing")
    var closing: Time?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDetails
*/
@Parcelize
data class StoreDetails(
    
    
    
    @SerializedName("manager")
    var manager: StoreManagerSerializer?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("address")
    var address: StoreAddressSerializer?=null,
    
    @SerializedName("company")
    var company: CompanyStore?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<StoreDepartments>?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<StoreTiming>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDetail
*/
@Parcelize
data class UserDetail(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("super_user")
    var superUser: Boolean?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Size
*/
@Parcelize
data class Size(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("display")
    var display: @RawValue Any?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductGroupPrice
*/
@Parcelize
data class ProductGroupPrice(
    
    
    
    @SerializedName("currency")
    var currency: @RawValue Any?=null,
    
    @SerializedName("max_effective")
    var maxEffective: Double?=null,
    
    @SerializedName("min_effective")
    var minEffective: Double?=null,
    
    @SerializedName("max_marked")
    var maxMarked: Double?=null,
    
    @SerializedName("min_marked")
    var minMarked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetails
*/
@Parcelize
data class ProductDetails(
    
    
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    
    @SerializedName("short_description")
    var shortDescription: @RawValue Any?=null,
    
    @SerializedName("description")
    var description: @RawValue Any?=null,
    
    @SerializedName("highlights")
    var highlights: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_code")
    var itemCode: @RawValue Any?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("images")
    var images: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("image_nature")
    var imageNature: @RawValue Any?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: @RawValue Any?=null,
    
    @SerializedName("name")
    var name: @RawValue Any?=null,
    
    @SerializedName("slug")
    var slug: @RawValue Any?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: Int?=null,
    
    @SerializedName("media")
    var media: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("template_tag")
    var templateTag: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductInGroup
*/
@Parcelize
data class ProductInGroup(
    
    
    
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<Size>?=null,
    
    @SerializedName("price")
    var price: ProductGroupPrice?=null,
    
    @SerializedName("product_details")
    var productDetails: ProductDetails?=null,
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("product_uid")
    var productUid: Int?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductGroupingModel
*/
@Parcelize
data class ProductGroupingModel(
    
    
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetail?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserDetail?=null,
    
    @SerializedName("choice")
    var choice: @RawValue Any?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductInGroup>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: @RawValue Any?=null,
    
    @SerializedName("name")
    var name: @RawValue Any?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("slug")
    var slug: @RawValue Any?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("logo")
    var logo: @RawValue Any?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBundle
*/
@Parcelize
data class ProductBundle(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductGroupingModel>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductSetDistributionSizeV3
*/
@Parcelize
data class ProductSetDistributionSizeV3(
    
    
    
    @SerializedName("pieces")
    var pieces: Int?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSetDistributionV3
*/
@Parcelize
data class ProductSetDistributionV3(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSetDistributionSizeV3>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductSetV3
*/
@Parcelize
data class ProductSetV3(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size_distribution")
    var sizeDistribution: ProductSetDistributionV3?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DetailsSchemaV3
*/
@Parcelize
data class DetailsSchemaV3(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SellerGroupAttributes
*/
@Parcelize
data class SellerGroupAttributes(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("details")
    var details: ArrayList<DetailsSchemaV3>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MarketPlaceSttributesSchemaV3
*/
@Parcelize
data class MarketPlaceSttributesSchemaV3(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("details")
    var details: ArrayList<DetailsSchemaV3>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ReturnConfigSchemaV3
*/
@Parcelize
data class ReturnConfigSchemaV3(
    
    
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("returnable")
    var returnable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreV3
*/
@Parcelize
data class StoreV3(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductStockUnitPriceV3
*/
@Parcelize
data class ProductStockUnitPriceV3(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("price")
    var price: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SellerV3
*/
@Parcelize
data class SellerV3(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StrategyWiseListingSchemaV3
*/
@Parcelize
data class StrategyWiseListingSchemaV3(
    
    
    
    @SerializedName("distance")
    var distance: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("tat")
    var tat: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductStockPriceV3
*/
@Parcelize
data class ProductStockPriceV3(
    
    
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAssignmentV3
*/
@Parcelize
data class ArticleAssignmentV3(
    
    
    
    @SerializedName("strategy")
    var strategy: String?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSizePriceResponseV3
*/
@Parcelize
data class ProductSizePriceResponseV3(
    
    
    
    @SerializedName("set")
    var set: ProductSetV3?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<SellerGroupAttributes>?=null,
    
    @SerializedName("marketplace_attributes")
    var marketplaceAttributes: ArrayList<MarketPlaceSttributesSchemaV3>?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfigSchemaV3?=null,
    
    @SerializedName("store")
    var store: StoreV3?=null,
    
    @SerializedName("is_cod")
    var isCod: Boolean?=null,
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductStockUnitPriceV3?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("seller")
    var seller: SellerV3?=null,
    
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: ArrayList<StrategyWiseListingSchemaV3>?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("price")
    var price: ProductStockPriceV3?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignmentV3?=null,
    
    @SerializedName("price_per_piece")
    var pricePerPiece: ProductStockPriceV3?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("seller_count")
    var sellerCount: Int?=null,
    
    @SerializedName("special_badge")
    var specialBadge: String?=null,
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null,
    
    @SerializedName("long_lat")
    var longLat: ArrayList<Double>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSizeSellerFilterSchemaV3
*/
@Parcelize
data class ProductSizeSellerFilterSchemaV3(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSizeSellersResponseV3
*/
@Parcelize
data class ProductSizeSellersResponseV3(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductSizePriceResponseV3>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSizeSellerFilterSchemaV3>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



