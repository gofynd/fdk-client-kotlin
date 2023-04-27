package com.sdk.application.models.catalog

import com.sdk.application.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
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
    
    
    
    @SerializedName("alt")
    var alt: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("meta")
    var meta: Meta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationItemMOQ
*/
@Parcelize
data class ApplicationItemMOQ(
    
    
    
    @SerializedName("minimum")
    var minimum: Int?=null,
    
    @SerializedName("maximum")
    var maximum: Int?=null,
    
    @SerializedName("increment_unit")
    var incrementUnit: Int?=null
    
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
    Model: ProductCategoryMap
*/
@Parcelize
data class ProductCategoryMap(
    
    
    
    @SerializedName("l2")
    var l2: ProductBrand?=null,
    
    @SerializedName("l3")
    var l3: ProductBrand?=null,
    
    @SerializedName("l1")
    var l1: ProductBrand?=null
    
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
    var value: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CustomMetaFields
*/
@Parcelize
data class CustomMetaFields(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationItemSEO
*/
@Parcelize
data class ApplicationItemSEO(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetailAttribute
*/
@Parcelize
data class ProductDetailAttribute(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
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
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    
    
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    
    @SerializedName("moq")
    var moq: ApplicationItemMOQ?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("category_map")
    var categoryMap: ProductCategoryMap?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<CustomMetaFields>?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("seo")
    var seo: ApplicationItemSEO?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null
    
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
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("shipping")
    var shipping: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Dimension
*/
@Parcelize
data class Dimension(
    
    
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    
    
    @SerializedName("weight")
    var weight: Weight?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("dimension")
    var dimension: Dimension?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("seller_identifiers")
    var sellerIdentifiers: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SizeChartValues
*/
@Parcelize
data class SizeChartValues(
    
    
    
    @SerializedName("col_3")
    var col3: String?=null,
    
    @SerializedName("col_4")
    var col4: String?=null,
    
    @SerializedName("col_6")
    var col6: String?=null,
    
    @SerializedName("col_2")
    var col2: String?=null,
    
    @SerializedName("col_5")
    var col5: String?=null,
    
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
    
    
    
    @SerializedName("col_3")
    var col3: ColumnHeader?=null,
    
    @SerializedName("col_4")
    var col4: ColumnHeader?=null,
    
    @SerializedName("col_6")
    var col6: ColumnHeader?=null,
    
    @SerializedName("col_2")
    var col2: ColumnHeader?=null,
    
    @SerializedName("col_5")
    var col5: ColumnHeader?=null,
    
    @SerializedName("col_1")
    var col1: ColumnHeader?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SizeChart
*/
@Parcelize
data class SizeChart(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<SizeChartValues>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("headers")
    var headers: ColumnHeaders?=null,
    
    @SerializedName("image")
    var image: String?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("size_tip")
    var sizeTip: String?=null
    
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
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSize>?=null,
    
    @SerializedName("size_chart")
    var sizeChart: SizeChart?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
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
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
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
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
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
    
    
    
    @SerializedName("color_name")
    var colorName: String?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<CustomMetaFields>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductVariantResponse
*/
@Parcelize
data class ProductVariantResponse(
    
    
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductVariantItemResponse>?=null,
    
    @SerializedName("header")
    var header: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
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
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyDetail
*/
@Parcelize
data class CompanyDetail(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductStockPrice
*/
@Parcelize
data class ProductStockPrice(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Seller
*/
@Parcelize
data class Seller(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store")
    var store: StoreDetail?=null,
    
    @SerializedName("company")
    var company: CompanyDetail?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("seller")
    var seller: Seller?=null
    
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
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductVariantItemResponse>?=null,
    
    @SerializedName("header")
    var header: String?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    
    
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    
    @SerializedName("moq")
    var moq: ApplicationItemMOQ?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("variants")
    var variants: ArrayList<ProductVariantListingResponse>?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("category_map")
    var categoryMap: ProductCategoryMap?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<CustomMetaFields>?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("seo")
    var seo: ApplicationItemSEO?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    
    @SerializedName("display_format")
    var displayFormat: String?=null,
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("query_format")
    var queryFormat: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    
    
    @SerializedName("kind")
    var kind: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    
    
    @SerializedName("values")
    var values: ArrayList<ProductFiltersValue>?=null,
    
    @SerializedName("key")
    var key: ProductFiltersKey?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
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
    
    
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: Media?=null
    
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
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: Media?=null
    
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
    Model: ThirdLevelChild
*/
@Parcelize
data class ThirdLevelChild(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SecondLevelChild
*/
@Parcelize
data class SecondLevelChild(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<ThirdLevelChild>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Child
*/
@Parcelize
data class Child(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<SecondLevelChild>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("banners")
    var banners: CategoryBanner?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<Child>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CategoryItems>?=null,
    
    @SerializedName("department")
    var department: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryListingResponse
*/
@Parcelize
data class CategoryListingResponse(
    
    
    
    @SerializedName("departments")
    var departments: ArrayList<DepartmentIdentifier>?=null,
    
    @SerializedName("data")
    var data: ArrayList<DepartmentCategoryTree>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryMetaResponse
*/
@Parcelize
data class CategoryMetaResponse(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
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
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
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
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: Media?=null
    
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
    
    
    
    @SerializedName("op")
    var op: String?=null,
    
    @SerializedName("attribute")
    var attribute: String?=null,
    
    @SerializedName("value")
    var value: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
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
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null
    
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
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Store
*/
@Parcelize
data class Store(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("lat_long")
    var latLong: LatLong?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("store_email")
    var storeEmail: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("state")
    var state: String?=null
    
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
    
    
    
    @SerializedName("number")
    var number: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyStore
*/
@Parcelize
data class CompanyStore(
    
    
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDepartments
*/
@Parcelize
data class StoreDepartments(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreAddressSerializer
*/
@Parcelize
data class StoreAddressSerializer(
    
    
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("state")
    var state: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreManagerSerializer
*/
@Parcelize
data class StoreManagerSerializer(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("mobile_no")
    var mobileNo: SellerPhoneNumber?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppStore
*/
@Parcelize
data class AppStore(
    
    
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("company")
    var company: CompanyStore?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<StoreDepartments>?=null,
    
    @SerializedName("address")
    var address: StoreAddressSerializer?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("manager")
    var manager: StoreManagerSerializer?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
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
    var filters: ArrayList<StoreDepartments>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Time
*/
@Parcelize
data class Time(
    
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreTiming
*/
@Parcelize
data class StoreTiming(
    
    
    
    @SerializedName("closing")
    var closing: Time?=null,
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("opening")
    var opening: Time?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDetails
*/
@Parcelize
data class StoreDetails(
    
    
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("company")
    var company: CompanyStore?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<StoreDepartments>?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<StoreTiming>?=null,
    
    @SerializedName("address")
    var address: StoreAddressSerializer?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("manager")
    var manager: StoreManagerSerializer?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDetail
*/
@Parcelize
data class UserDetail(
    
    
    
    @SerializedName("super_user")
    var superUser: Boolean?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Size
*/
@Parcelize
data class Size(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetails
*/
@Parcelize
data class ProductDetails(
    
    
    
    @SerializedName("media")
    var media: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: Int?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductGroupPrice
*/
@Parcelize
data class ProductGroupPrice(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("min_marked")
    var minMarked: Double?=null,
    
    @SerializedName("min_effective")
    var minEffective: Double?=null,
    
    @SerializedName("max_effective")
    var maxEffective: Double?=null,
    
    @SerializedName("max_marked")
    var maxMarked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductInGroup
*/
@Parcelize
data class ProductInGroup(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<Size>?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("product_uid")
    var productUid: Int?=null,
    
    @SerializedName("product_details")
    var productDetails: ProductDetails?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    
    @SerializedName("price")
    var price: ProductGroupPrice?=null,
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductGroupingModel
*/
@Parcelize
data class ProductGroupingModel(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: @RawValue Any?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserDetail?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductInGroup>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetail?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
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
    Model: ProductStockUnitPriceV3
*/
@Parcelize
data class ProductStockUnitPriceV3(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("price")
    var price: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductStockPriceV3
*/
@Parcelize
data class ProductStockPriceV3(
    
    
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAssignmentV3
*/
@Parcelize
data class ArticleAssignmentV3(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StrategyWiseListingSchemaV3
*/
@Parcelize
data class StrategyWiseListingSchemaV3(
    
    
    
    @SerializedName("tat")
    var tat: Int?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("distance")
    var distance: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DetailsSchemaV3
*/
@Parcelize
data class DetailsSchemaV3(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
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
    Model: StoreV3
*/
@Parcelize
data class StoreV3(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReturnConfigSchemaV3
*/
@Parcelize
data class ReturnConfigSchemaV3(
    
    
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SellerV3
*/
@Parcelize
data class SellerV3(
    
    
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
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
    Model: ProductSizePriceResponseV3
*/
@Parcelize
data class ProductSizePriceResponseV3(
    
    
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null,
    
    @SerializedName("special_badge")
    var specialBadge: String?=null,
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductStockUnitPriceV3?=null,
    
    @SerializedName("price_per_piece")
    var pricePerPiece: ProductStockPriceV3?=null,
    
    @SerializedName("seller_count")
    var sellerCount: Int?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignmentV3?=null,
    
    @SerializedName("long_lat")
    var longLat: ArrayList<Double>?=null,
    
    @SerializedName("price")
    var price: ProductStockPriceV3?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: ArrayList<StrategyWiseListingSchemaV3>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("marketplace_attributes")
    var marketplaceAttributes: ArrayList<MarketPlaceSttributesSchemaV3>?=null,
    
    @SerializedName("store")
    var store: StoreV3?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfigSchemaV3?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("seller")
    var seller: SellerV3?=null,
    
    @SerializedName("is_cod")
    var isCod: Boolean?=null,
    
    @SerializedName("set")
    var set: ProductSetV3?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<SellerGroupAttributes>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSizeSellerFilterSchemaV3
*/
@Parcelize
data class ProductSizeSellerFilterSchemaV3(
    
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
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



