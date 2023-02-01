package com.sdk.application

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName


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
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("meta")
    var meta: Meta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
    
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null
    
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
    
    
    
    @SerializedName("description")
    var description: @RawValue Any?=null,
    
    @SerializedName("title")
    var title: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ApplicationItemMOQ
*/
@Parcelize
data class ApplicationItemMOQ(
    
    
    
    @SerializedName("maximum")
    var maximum: Int?=null,
    
    @SerializedName("minimum")
    var minimum: Int?=null,
    
    @SerializedName("increment_unit")
    var incrementUnit: Int?=null
    
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
    Model: Price
*/
@Parcelize
data class Price(
    
    
    
    @SerializedName("min")
    var min: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
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
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<CustomMetaFields>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("category_map")
    var categoryMap: ProductCategoryMap?=null,
    
    @SerializedName("seo")
    var seo: ApplicationItemSEO?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("moq")
    var moq: ApplicationItemMOQ?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null
    
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
    Model: SizeChartValues
*/
@Parcelize
data class SizeChartValues(
    
    
    
    @SerializedName("col_4")
    var col4: String?=null,
    
    @SerializedName("col_6")
    var col6: String?=null,
    
    @SerializedName("col_5")
    var col5: String?=null,
    
    @SerializedName("col_3")
    var col3: String?=null,
    
    @SerializedName("col_1")
    var col1: String?=null,
    
    @SerializedName("col_2")
    var col2: String?=null
    
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
    
    @SerializedName("col_6")
    var col6: ColumnHeader?=null,
    
    @SerializedName("col_5")
    var col5: ColumnHeader?=null,
    
    @SerializedName("col_3")
    var col3: ColumnHeader?=null,
    
    @SerializedName("col_1")
    var col1: ColumnHeader?=null,
    
    @SerializedName("col_2")
    var col2: ColumnHeader?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SizeChart
*/
@Parcelize
data class SizeChart(
    
    
    
    @SerializedName("image")
    var image: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<SizeChartValues>?=null,
    
    @SerializedName("headers")
    var headers: ColumnHeaders?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("size_tip")
    var sizeTip: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Dimension
*/
@Parcelize
data class Dimension(
    
    
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null
    
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
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("seller_identifiers")
    var sellerIdentifiers: ArrayList<String>?=null,
    
    @SerializedName("dimension")
    var dimension: Dimension?=null,
    
    @SerializedName("weight")
    var weight: Weight?=null
    
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
    
    
    
    @SerializedName("size_chart")
    var sizeChart: SizeChart?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSize>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    
    @SerializedName("stores")
    var stores: ProductSizeStores?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AttributeDetail
*/
@Parcelize
data class AttributeDetail(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
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
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<CustomMetaFields>?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("color_name")
    var colorName: String?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
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
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
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
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
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
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    
    
    @SerializedName("company")
    var company: CompanyDetail?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("seller")
    var seller: Seller?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("store")
    var store: StoreDetail?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("price")
    var price: ProductStockPrice?=null
    
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
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    
    @SerializedName("display_format")
    var displayFormat: String?=null,
    
    @SerializedName("query_format")
    var queryFormat: String?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("kind")
    var kind: String?=null
    
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
    Model: ProductVariantListingResponse
*/
@Parcelize
data class ProductVariantListingResponse(
    
    
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
    @SerializedName("header")
    var header: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductVariantItemResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<CustomMetaFields>?=null,
    
    @SerializedName("identifiers")
    var identifiers: ArrayList<String>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("variants")
    var variants: ArrayList<ProductVariantListingResponse>?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("category_map")
    var categoryMap: ProductCategoryMap?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("seo")
    var seo: ApplicationItemSEO?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("moq")
    var moq: ApplicationItemMOQ?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null
    
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
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
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
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
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
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DepartmentIdentifier
*/
@Parcelize
data class DepartmentIdentifier(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
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
    
    
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
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
    
    
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<ThirdLevelChild>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
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
    
    
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<SecondLevelChild>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    
    
    @SerializedName("banners")
    var banners: CategoryBanner?=null,
    
    @SerializedName("childs")
    var childs: ArrayList<Child>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
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
    
    
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HomeListingResponse
*/
@Parcelize
data class HomeListingResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Department
*/
@Parcelize
data class Department(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
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
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
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
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<CollectionListingFilterTag>?=null,
    
    @SerializedName("type")
    var type: ArrayList<CollectionListingFilterType>?=null
    
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
    
    
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    
    
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null
    
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
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
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
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    
    @SerializedName("products")
    var products: ArrayList<Int>?=null
    
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
    
    
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("store_email")
    var storeEmail: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("lat_long")
    var latLong: LatLong?=null
    
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
    Model: StoreDepartments
*/
@Parcelize
data class StoreDepartments(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyStore
*/
@Parcelize
data class CompanyStore(
    
    
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreAddressSerializer
*/
@Parcelize
data class StoreAddressSerializer(
    
    
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null
    
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
    
    
    
    @SerializedName("company")
    var company: CompanyStore?=null,
    
    @SerializedName("address")
    var address: StoreAddressSerializer?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<StoreDepartments>?=null,
    
    @SerializedName("manager")
    var manager: StoreManagerSerializer?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationStoreListing
*/
@Parcelize
data class ApplicationStoreListing(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<StoreDepartments>?=null,
    
    @SerializedName("items")
    var items: ArrayList<AppStore>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
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
    
    
    
    @SerializedName("weekday")
    var weekday: String?=null,
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("closing")
    var closing: Time?=null,
    
    @SerializedName("opening")
    var opening: Time?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreDetails
*/
@Parcelize
data class StoreDetails(
    
    
    
    @SerializedName("company")
    var company: CompanyStore?=null,
    
    @SerializedName("address")
    var address: StoreAddressSerializer?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<StoreDepartments>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("manager")
    var manager: StoreManagerSerializer?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<StoreTiming>?=null,
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserDetail
*/
@Parcelize
data class UserDetail(
    
    
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("super_user")
    var superUser: Boolean?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Size
*/
@Parcelize
data class Size(
    
    
    
    @SerializedName("display")
    var display: @RawValue Any?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductGroupPrice
*/
@Parcelize
data class ProductGroupPrice(
    
    
    
    @SerializedName("min_marked")
    var minMarked: Double?=null,
    
    @SerializedName("currency")
    var currency: @RawValue Any?=null,
    
    @SerializedName("min_effective")
    var minEffective: Double?=null,
    
    @SerializedName("max_effective")
    var maxEffective: Double?=null,
    
    @SerializedName("max_marked")
    var maxMarked: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductDetails
*/
@Parcelize
data class ProductDetails(
    
    
    
    @SerializedName("image_nature")
    var imageNature: @RawValue Any?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_code")
    var itemCode: @RawValue Any?=null,
    
    @SerializedName("template_tag")
    var templateTag: @RawValue Any?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("slug")
    var slug: @RawValue Any?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("description")
    var description: @RawValue Any?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("short_description")
    var shortDescription: @RawValue Any?=null,
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: @RawValue Any?=null,
    
    @SerializedName("images")
    var images: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: Int?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("media")
    var media: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("highlights")
    var highlights: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductInGroup
*/
@Parcelize
data class ProductInGroup(
    
    
    
    @SerializedName("product_uid")
    var productUid: Int?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<Size>?=null,
    
    @SerializedName("price")
    var price: ProductGroupPrice?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    
    @SerializedName("product_details")
    var productDetails: ProductDetails?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductGroupingModel
*/
@Parcelize
data class ProductGroupingModel(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: @RawValue Any?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductInGroup>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("_id")
    var id: @RawValue Any?=null,
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetail?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserDetail?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: @RawValue Any?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("choice")
    var choice: @RawValue Any?=null
    
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
    Model: DetailsSchemaV2
*/
@Parcelize
data class DetailsSchemaV2(
    
    
    
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
    var details: ArrayList<DetailsSchemaV2>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: MarketPlaceSttributesSchemaV2
*/
@Parcelize
data class MarketPlaceSttributesSchemaV2(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("details")
    var details: ArrayList<DetailsSchemaV2>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductStockPriceV2
*/
@Parcelize
data class ProductStockPriceV2(
    
    
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ArticleAssignmentV2
*/
@Parcelize
data class ArticleAssignmentV2(
    
    
    
    @SerializedName("strategy")
    var strategy: String?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: StrategyWiseListingSchemaV2
*/
@Parcelize
data class StrategyWiseListingSchemaV2(
    
    
    
    @SerializedName("distance")
    var distance: Int?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("tat")
    var tat: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductStockUnitPriceV2
*/
@Parcelize
data class ProductStockUnitPriceV2(
    
    
    
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
    Model: ReturnConfigSchemaV2
*/
@Parcelize
data class ReturnConfigSchemaV2(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SellerV2
*/
@Parcelize
data class SellerV2(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreV2
*/
@Parcelize
data class StoreV2(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductSetDistributionSizeV2
*/
@Parcelize
data class ProductSetDistributionSizeV2(
    
    
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("pieces")
    var pieces: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductSetDistributionV2
*/
@Parcelize
data class ProductSetDistributionV2(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSetDistributionSizeV2>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ProductSetV2
*/
@Parcelize
data class ProductSetV2(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size_distribution")
    var sizeDistribution: ProductSetDistributionV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductSizePriceResponseV2
*/
@Parcelize
data class ProductSizePriceResponseV2(
    
    
    
    @SerializedName("seller_count")
    var sellerCount: Int?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<SellerGroupAttributes>?=null,
    
    @SerializedName("long_lat")
    var longLat: ArrayList<Double>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("special_badge")
    var specialBadge: String?=null,
    
    @SerializedName("marketplace_attributes")
    var marketplaceAttributes: ArrayList<MarketPlaceSttributesSchemaV2>?=null,
    
    @SerializedName("price_per_piece")
    var pricePerPiece: ProductStockPriceV2?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignmentV2?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null,
    
    @SerializedName("is_cod")
    var isCod: Boolean?=null,
    
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: ArrayList<StrategyWiseListingSchemaV2>?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductStockUnitPriceV2?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfigSchemaV2?=null,
    
    @SerializedName("seller")
    var seller: SellerV2?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("store")
    var store: StoreV2?=null,
    
    @SerializedName("set")
    var set: ProductSetV2?=null,
    
    @SerializedName("price")
    var price: ProductStockPriceV2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductSizeSellerFilterSchemaV2
*/
@Parcelize
data class ProductSizeSellerFilterSchemaV2(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductSizeSellersResponseV2
*/
@Parcelize
data class ProductSizeSellersResponseV2(
    
    
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSizeSellerFilterSchemaV2>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductSizePriceResponseV2>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
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
    Model: CartProduct
*/
@Parcelize
data class CartProduct(
    
    
    
    @SerializedName("images")
    var images: ArrayList<ProductImage>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    
    @SerializedName("action")
    var action: ProductAction?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
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
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("marked")
    var marked: Double?=null
    
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
    Model: ProductArticle
*/
@Parcelize
data class ProductArticle(
    
    
    
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    
    @SerializedName("product_group_tags")
    var productGroupTags: ArrayList<String>?=null,
    
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("store")
    var store: BaseInfo?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    
    
    @SerializedName("selling")
    var selling: Double?=null,
    
    @SerializedName("add_on")
    var addOn: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null
    
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
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("item_brand_name")
    var itemBrandName: String?=null,
    
    @SerializedName("item_slug")
    var itemSlug: String?=null,
    
    @SerializedName("item_price_details")
    var itemPriceDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppliedFreeArticles
*/
@Parcelize
data class AppliedFreeArticles(
    
    
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("free_gift_item_details")
    var freeGiftItemDetails: FreeGiftItem?=null,
    
    @SerializedName("parent_item_identifier")
    var parentItemIdentifier: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
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
    
    @SerializedName("offer")
    var offer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("matched_buy_rules")
    var matchedBuyRules: ArrayList<String>?=null
    
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
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("applied_free_articles")
    var appliedFreeArticles: ArrayList<AppliedFreeArticles>?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("article_quantity")
    var articleQuantity: Int?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("discount_rules")
    var discountRules: ArrayList<DiscountRulesApp>?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
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
    var sizes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    
    
    @SerializedName("product")
    var product: CartProduct?=null,
    
    @SerializedName("article")
    var article: ProductArticle?=null,
    
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    
    @SerializedName("price_per_unit")
    var pricePerUnit: ProductPriceInfo?=null,
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: PromoMeta?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("promotions_applied")
    var promotionsApplied: ArrayList<AppliedPromotion>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("coupon_message")
    var couponMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentSelectionLock
*/
@Parcelize
data class PaymentSelectionLock(
    
    
    
    @SerializedName("default_options")
    var defaultOptions: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
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
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    
    
    @SerializedName("applicable")
    var applicable: Double?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    
    
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    
    @SerializedName("convenience_fee")
    var convenienceFee: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("gst_charges")
    var gstCharges: Double?=null,
    
    @SerializedName("vog")
    var vog: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("mrp_total")
    var mrpTotal: Double?=null,
    
    @SerializedName("coupon")
    var coupon: Double?=null,
    
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    
    @SerializedName("subtotal")
    var subtotal: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    
    
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    
    @SerializedName("raw")
    var raw: RawBreakup?=null,
    
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartDetailResponse
*/
@Parcelize
data class CartDetailResponse(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
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
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null
    
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
    
    @SerializedName("cart")
    var cart: CartDetailResponse?=null,
    
    @SerializedName("partial")
    var partial: Boolean?=null
    
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
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("parent_item_identifiers")
    var parentItemIdentifiers: @RawValue HashMap<String,Any>?=null
    
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
    
    
    
    @SerializedName("coupon_type")
    var couponType: String?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PageCoupon
*/
@Parcelize
data class PageCoupon(
    
    
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null
    
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
    var page: PageCoupon?=null
    
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
    Model: OfferSeller
*/
@Parcelize
data class OfferSeller(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OfferPrice
*/
@Parcelize
data class OfferPrice(
    
    
    
    @SerializedName("marked")
    var marked: Int?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("effective")
    var effective: Int?=null,
    
    @SerializedName("bulk_effective")
    var bulkEffective: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    
    
    @SerializedName("best")
    var best: Boolean?=null,
    
    @SerializedName("price")
    var price: OfferPrice?=null,
    
    @SerializedName("margin")
    var margin: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("auto_applied")
    var autoApplied: Boolean?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkPriceOffer
*/
@Parcelize
data class BulkPriceOffer(
    
    
    
    @SerializedName("seller")
    var seller: OfferSeller?=null,
    
    @SerializedName("offers")
    var offers: ArrayList<OfferItem>?=null
    
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
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("google_map_point")
    var googleMapPoint: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetAddressesResponse
*/
@Parcelize
data class GetAddressesResponse(
    
    
    
    @SerializedName("address")
    var address: ArrayList<Address>?=null
    
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
    
    
    
    @SerializedName("is_updated")
    var isUpdated: Boolean?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
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
    Model: SelectCartAddressRequest
*/
@Parcelize
data class SelectCartAddressRequest(
    
    
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateCartPaymentRequest
*/
@Parcelize
data class UpdateCartPaymentRequest(
    
    
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
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
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
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


/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    
    
    @SerializedName("promise")
    var promise: ShipmentPromise?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("shipments")
    var shipments: Int?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("dp_id")
    var dpId: String?=null,
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("error")
    var error: Boolean?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
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
    Model: StaffCheckout
*/
@Parcelize
data class StaffCheckout(
    
    
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartCheckoutDetailRequest
*/
@Parcelize
data class CartCheckoutDetailRequest(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    
    @SerializedName("custom_meta")
    var customMeta: ArrayList<CartCheckoutCustomMeta>?=null,
    
    @SerializedName("staff")
    var staff: StaffCheckout?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    
    
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("cod_message")
    var codMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    
    
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart")
    var cart: CheckCart?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CartMetaRequest
*/
@Parcelize
data class CartMetaRequest(
    
    
    
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
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
    
    
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SharedCart
*/
@Parcelize
data class SharedCart(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("buy_now")
    var buyNow: Boolean?=null,
    
    @SerializedName("payment_selection_lock")
    var paymentSelectionLock: PaymentSelectionLock?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null
    
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
    Model: FreeGiftItems
*/
@Parcelize
data class FreeGiftItems(
    
    
    
    @SerializedName("item_images_url")
    var itemImagesUrl: ArrayList<String>?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("item_brand_name")
    var itemBrandName: String?=null,
    
    @SerializedName("item_slug")
    var itemSlug: String?=null,
    
    @SerializedName("item_price_details")
    var itemPriceDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PromotionOffer
*/
@Parcelize
data class PromotionOffer(
    
    
    
    @SerializedName("discount_rules")
    var discountRules: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("free_gift_items")
    var freeGiftItems: ArrayList<FreeGiftItems>?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("valid_till")
    var validTill: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null
    
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
    Model: LadderPrice
*/
@Parcelize
data class LadderPrice(
    
    
    
    @SerializedName("marked")
    var marked: Int?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("offer_price")
    var offerPrice: Double?=null,
    
    @SerializedName("effective")
    var effective: Int?=null
    
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
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LadderPriceOffer
*/
@Parcelize
data class LadderPriceOffer(
    
    
    
    @SerializedName("discount_rules")
    var discountRules: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("calculate_on")
    var calculateOn: String?=null,
    
    @SerializedName("promotion_group")
    var promotionGroup: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("free_gift_items")
    var freeGiftItems: ArrayList<FreeGiftItems>?=null,
    
    @SerializedName("offer_text")
    var offerText: String?=null,
    
    @SerializedName("valid_till")
    var validTill: String?=null,
    
    @SerializedName("buy_rules")
    var buyRules: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("offer_prices")
    var offerPrices: ArrayList<LadderOfferItem>?=null,
    
    @SerializedName("description")
    var description: String?=null
    
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
    var currency: CurrencyInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




/*
    Model: ApplicationResponse
*/
@Parcelize
data class ApplicationResponse(
    
    
    
    @SerializedName("application")
    var application: Application?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Currency
*/
@Parcelize
data class Currency(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("decimal_digits")
    var decimalDigits: Int?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Domain
*/
@Parcelize
data class Domain(
    
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("is_primary")
    var isPrimary: Boolean?=null,
    
    @SerializedName("is_shortlink")
    var isShortlink: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_predefined")
    var isPredefined: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationWebsite
*/
@Parcelize
data class ApplicationWebsite(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("basepath")
    var basepath: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ApplicationCors
*/
@Parcelize
data class ApplicationCors(
    
    
    
    @SerializedName("domains")
    var domains: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ApplicationAuth
*/
@Parcelize
data class ApplicationAuth(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ApplicationRedirections
*/
@Parcelize
data class ApplicationRedirections(
    
    
    
    @SerializedName("redirect_from")
    var redirectFrom: String?=null,
    
    @SerializedName("redirect_to")
    var redirectTo: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationMeta
*/
@Parcelize
data class ApplicationMeta(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SecureUrl
*/
@Parcelize
data class SecureUrl(
    
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Application
*/
@Parcelize
data class Application(
    
    
    
    @SerializedName("website")
    var website: ApplicationWebsite?=null,
    
    @SerializedName("cors")
    var cors: ApplicationCors?=null,
    
    @SerializedName("auth")
    var auth: ApplicationAuth?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("cache_ttl")
    var cacheTtl: Int?=null,
    
    @SerializedName("is_internal")
    var isInternal: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("owner")
    var owner: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("redirections")
    var redirections: ArrayList<ApplicationRedirections>?=null,
    
    @SerializedName("meta")
    var meta: ArrayList<ApplicationMeta>?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("banner")
    var banner: SecureUrl?=null,
    
    @SerializedName("logo")
    var logo: SecureUrl?=null,
    
    @SerializedName("favicon")
    var favicon: SecureUrl?=null,
    
    @SerializedName("domains")
    var domains: ArrayList<Domain>?=null,
    
    @SerializedName("app_type")
    var appType: String?=null,
    
    @SerializedName("mobile_logo")
    var mobileLogo: SecureUrl?=null,
    
    @SerializedName("domain")
    var domain: Domain?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: NotFound
*/
@Parcelize
data class NotFound(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
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
    Model: LocationDefaultLanguage
*/
@Parcelize
data class LocationDefaultLanguage(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: LocationDefaultCurrency
*/
@Parcelize
data class LocationDefaultCurrency(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("symbol")
    var symbol: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: LocationCountry
*/
@Parcelize
data class LocationCountry(
    
    
    
    @SerializedName("capital")
    var capital: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("iso2")
    var iso2: String?=null,
    
    @SerializedName("iso3")
    var iso3: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("parent")
    var parent: String?=null,
    
    @SerializedName("phone_code")
    var phoneCode: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("default_currency")
    var defaultCurrency: LocationDefaultCurrency?=null,
    
    @SerializedName("default_language")
    var defaultLanguage: LocationDefaultLanguage?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Locations
*/
@Parcelize
data class Locations(
    
    
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
}




/*
    Model: TicketList
*/
@Parcelize
data class TicketList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Ticket>?=null,
    
    @SerializedName("filters")
    var filters: Filter?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
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
    Model: TicketHistoryList
*/
@Parcelize
data class TicketHistoryList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<TicketHistory>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CustomFormList
*/
@Parcelize
data class CustomFormList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<CustomForm>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateCustomFormPayload
*/
@Parcelize
data class CreateCustomFormPayload(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("inputs")
    var inputs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("header_image")
    var headerImage: String?=null,
    
    @SerializedName("priority")
    var priority: PriorityEnum?=null,
    
    @SerializedName("should_notify")
    var shouldNotify: Boolean?=null,
    
    @SerializedName("success_message")
    var successMessage: String?=null,
    
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EditCustomFormPayload
*/
@Parcelize
data class EditCustomFormPayload(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("inputs")
    var inputs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("priority")
    var priority: PriorityEnum?=null,
    
    @SerializedName("header_image")
    var headerImage: String?=null,
    
    @SerializedName("should_notify")
    var shouldNotify: Boolean?=null,
    
    @SerializedName("login_required")
    var loginRequired: Boolean?=null,
    
    @SerializedName("success_message")
    var successMessage: String?=null,
    
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EditTicketPayload
*/
@Parcelize
data class EditTicketPayload(
    
    
    
    @SerializedName("content")
    var content: TicketContent?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("sub_category")
    var subCategory: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("priority")
    var priority: PriorityEnum?=null,
    
    @SerializedName("assigned_to")
    var assignedTo: AgentChangePayload?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AgentChangePayload
*/
@Parcelize
data class AgentChangePayload(
    
    
    
    @SerializedName("agent_id")
    var agentId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CreateVideoRoomResponse
*/
@Parcelize
data class CreateVideoRoomResponse(
    
    
    
    @SerializedName("unique_name")
    var uniqueName: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CloseVideoRoomResponse
*/
@Parcelize
data class CloseVideoRoomResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CreateVideoRoomPayload
*/
@Parcelize
data class CreateVideoRoomPayload(
    
    
    
    @SerializedName("unique_name")
    var uniqueName: String?=null,
    
    @SerializedName("notify")
    var notify: ArrayList<NotifyUser>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: NotifyUser
*/
@Parcelize
data class NotifyUser(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Filter
*/
@Parcelize
data class Filter(
    
    
    
    @SerializedName("priorities")
    var priorities: ArrayList<Priority>?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<TicketCategory>?=null,
    
    @SerializedName("statuses")
    var statuses: ArrayList<Status>?=null,
    
    @SerializedName("assignees")
    var assignees: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketHistoryPayload
*/
@Parcelize
data class TicketHistoryPayload(
    
    
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: HistoryTypeEnum?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CustomFormSubmissionPayload
*/
@Parcelize
data class CustomFormSubmissionPayload(
    
    
    
    @SerializedName("response")
    var response: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("attachments")
    var attachments: ArrayList<TicketAsset>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetTokenForVideoRoomResponse
*/
@Parcelize
data class GetTokenForVideoRoomResponse(
    
    
    
    @SerializedName("access_token")
    var accessToken: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GetParticipantsInsideVideoRoomResponse
*/
@Parcelize
data class GetParticipantsInsideVideoRoomResponse(
    
    
    
    @SerializedName("participants")
    var participants: ArrayList<Participant>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Participant
*/
@Parcelize
data class Participant(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    
    @SerializedName("identity")
    var identity: String?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Email
*/
@Parcelize
data class Email(
    
    
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Debug
*/
@Parcelize
data class Debug(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SubmitCustomFormResponse
*/
@Parcelize
data class SubmitCustomFormResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("ticket")
    var ticket: Ticket?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TicketContext
*/
@Parcelize
data class TicketContext(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreatedOn
*/
@Parcelize
data class CreatedOn(
    
    
    
    @SerializedName("user_agent")
    var userAgent: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: TicketAsset
*/
@Parcelize
data class TicketAsset(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: TicketAssetTypeEnum?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketContent
*/
@Parcelize
data class TicketContent(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    private var description_b64: String?=null,
    
    
    @SerializedName("attachments")
    var attachments: ArrayList<TicketAsset>?=null
    
): Parcelable {
    
    
    
    
    
    var description : String
    get(){
        try{
            return String(Base64.decode(description_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return description_b64 ?: ""
        }
    }
    set(value){
        description_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
    
    
}


/*
    Model: AddTicketPayload
*/
@Parcelize
data class AddTicketPayload(
    
    
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("priority")
    var priority: PriorityEnum?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("content")
    var content: TicketContent?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Priority
*/
@Parcelize
data class Priority(
    
    
    
    @SerializedName("key")
    var key: PriorityEnum?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("color")
    var color: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Status
*/
@Parcelize
data class Status(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("color")
    var color: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketFeedbackForm
*/
@Parcelize
data class TicketFeedbackForm(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("display")
    var display: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TicketFeedbackList
*/
@Parcelize
data class TicketFeedbackList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<TicketFeedback>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: TicketFeedbackPayload
*/
@Parcelize
data class TicketFeedbackPayload(
    
    
    
    @SerializedName("form_response")
    var formResponse: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SubmitButton
*/
@Parcelize
data class SubmitButton(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("title_color")
    var titleColor: String?=null,
    
    @SerializedName("background_color")
    var backgroundColor: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PollForAssignment
*/
@Parcelize
data class PollForAssignment(
    
    
    
    @SerializedName("duration")
    var duration: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success_message")
    var successMessage: String?=null,
    
    @SerializedName("failure_message")
    var failureMessage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CustomForm
*/
@Parcelize
data class CustomForm(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("header_image")
    var headerImage: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("priority")
    var priority: Priority?=null,
    
    @SerializedName("login_required")
    var loginRequired: Boolean?=null,
    
    @SerializedName("should_notify")
    var shouldNotify: Boolean?=null,
    
    @SerializedName("success_message")
    var successMessage: String?=null,
    
    @SerializedName("submit_button")
    var submitButton: SubmitButton?=null,
    
    @SerializedName("inputs")
    var inputs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("created_on")
    var createdOn: CreatedOn?=null,
    
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CommunicationDetails
*/
@Parcelize
data class CommunicationDetails(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SupportGeneralConfig
*/
@Parcelize
data class SupportGeneralConfig(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("support_email")
    var supportEmail: CommunicationDetails?=null,
    
    @SerializedName("support_phone")
    var supportPhone: CommunicationDetails?=null,
    
    @SerializedName("support_faq")
    var supportFaq: CommunicationDetails?=null,
    
    @SerializedName("show_communication_info")
    var showCommunicationInfo: Boolean?=null,
    
    @SerializedName("support_communication")
    var supportCommunication: CommunicationDetails?=null,
    
    @SerializedName("show_support_dris")
    var showSupportDris: Boolean?=null,
    
    @SerializedName("integration")
    var integration: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FeedbackForm
*/
@Parcelize
data class FeedbackForm(
    
    
    
    @SerializedName("inputs")
    var inputs: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("timestamps")
    var timestamps: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketSubCategory
*/
@Parcelize
data class TicketSubCategory(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("sub_categories")
    var subCategories: TicketSubCategory?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketCategory
*/
@Parcelize
data class TicketCategory(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("sub_categories")
    var subCategories: TicketCategory?=null,
    
    @SerializedName("group_id")
    var groupId: Double?=null,
    
    @SerializedName("feedback_form")
    var feedbackForm: FeedbackForm?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryData
*/
@Parcelize
data class CategoryData(
    
    
    
    @SerializedName("list")
    var list: TicketCategory?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: IntegrationConfig
*/
@Parcelize
data class IntegrationConfig(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("integration_type")
    var integrationType: String?=null,
    
    @SerializedName("base_url")
    var baseUrl: String?=null,
    
    @SerializedName("create_ticket_apikey")
    var createTicketApikey: String?=null,
    
    @SerializedName("update_ticket_apikey")
    var updateTicketApikey: String?=null,
    
    @SerializedName("category_sync_apikey")
    var categorySyncApikey: String?=null,
    
    @SerializedName("category_data")
    var categoryData: CategoryData?=null,
    
    @SerializedName("webhook_apikey")
    var webhookApikey: String?=null,
    
    @SerializedName("config_completed")
    var configCompleted: Boolean?=null,
    
    @SerializedName("allow_ticket_creation")
    var allowTicketCreation: Boolean?=null,
    
    @SerializedName("show_listing")
    var showListing: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FeedbackResponseItem
*/
@Parcelize
data class FeedbackResponseItem(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketFeedback
*/
@Parcelize
data class TicketFeedback(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    
    @SerializedName("company_id")
    var companyId: String?=null,
    
    @SerializedName("response")
    var response: ArrayList<FeedbackResponseItem>?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TicketHistory
*/
@Parcelize
data class TicketHistory(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    
    @SerializedName("created_on")
    var createdOn: CreatedOn?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Ticket
*/
@Parcelize
data class Ticket(
    
    
    
    @SerializedName("context")
    var context: TicketContext?=null,
    
    @SerializedName("created_on")
    var createdOn: CreatedOn?=null,
    
    @SerializedName("response_id")
    var responseId: String?=null,
    
    @SerializedName("content")
    var content: TicketContent?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("sub_category")
    var subCategory: String?=null,
    
    @SerializedName("source")
    var source: TicketSourceEnum?=null,
    
    @SerializedName("status")
    var status: Status?=null,
    
    @SerializedName("priority")
    var priority: Priority?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("assigned_to")
    var assignedTo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_feedback_pending")
    var isFeedbackPending: Boolean?=null,
    
    @SerializedName("integration")
    var integration: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




/*
    Model: AvailablePageSchema
*/
@Parcelize
data class AvailablePageSchema(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("path")
    var path: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sections")
    var sections: ArrayList<AvailablePageSchemaSections>?=null,
    
    @SerializedName("sections_meta")
    var sectionsMeta: ArrayList<AvailablePageSectionMetaAttributes>?=null,
    
    @SerializedName("theme")
    var theme: String?=null,
    
    @SerializedName("seo")
    var seo: AvailablePageSeo?=null,
    
    @SerializedName("props")
    var props: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AvailablePageSectionMetaAttributes
*/
@Parcelize
data class AvailablePageSectionMetaAttributes(
    
    
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AvailablePageSeo
*/
@Parcelize
data class AvailablePageSeo(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AvailablePageSchemaSections
*/
@Parcelize
data class AvailablePageSchemaSections(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("blocks")
    var blocks: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("preset")
    var preset: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("predicate")
    var predicate: AvailablePagePredicate?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AvailablePageScreenPredicate
*/
@Parcelize
data class AvailablePageScreenPredicate(
    
    
    
    @SerializedName("mobile")
    var mobile: Boolean?=null,
    
    @SerializedName("desktop")
    var desktop: Boolean?=null,
    
    @SerializedName("tablet")
    var tablet: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AvailablePageUserPredicate
*/
@Parcelize
data class AvailablePageUserPredicate(
    
    
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null,
    
    @SerializedName("anonymous")
    var anonymous: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AvailablePageRoutePredicate
*/
@Parcelize
data class AvailablePageRoutePredicate(
    
    
    
    @SerializedName("selected")
    var selected: String?=null,
    
    @SerializedName("exact_url")
    var exactUrl: String?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AvailablePagePredicate
*/
@Parcelize
data class AvailablePagePredicate(
    
    
    
    @SerializedName("screen")
    var screen: AvailablePageScreenPredicate?=null,
    
    @SerializedName("user")
    var user: AvailablePageUserPredicate?=null,
    
    @SerializedName("route")
    var route: AvailablePageRoutePredicate?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AllAvailablePageSchema
*/
@Parcelize
data class AllAvailablePageSchema(
    
    
    
    @SerializedName("pages")
    var pages: ArrayList<AvailablePageSchema>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PaginationSchema
*/
@Parcelize
data class PaginationSchema(
    
    
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ThemesListingResponseSchema
*/
@Parcelize
data class ThemesListingResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ThemesSchema>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AddThemeRequestSchema
*/
@Parcelize
data class AddThemeRequestSchema(
    
    
    
    @SerializedName("theme_id")
    var themeId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UpgradableThemeSchema
*/
@Parcelize
data class UpgradableThemeSchema(
    
    
    
    @SerializedName("parent_theme")
    var parentTheme: String?=null,
    
    @SerializedName("applied_theme")
    var appliedTheme: String?=null,
    
    @SerializedName("upgrade")
    var upgrade: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: FontsSchema
*/
@Parcelize
data class FontsSchema(
    
    
    
    @SerializedName("items")
    var items: FontsSchemaItems?=null,
    
    @SerializedName("kind")
    var kind: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BlitzkriegApiErrorSchema
*/
@Parcelize
data class BlitzkriegApiErrorSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: BlitzkriegNotFoundSchema
*/
@Parcelize
data class BlitzkriegNotFoundSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: BlitzkriegInternalServerErrorSchema
*/
@Parcelize
data class BlitzkriegInternalServerErrorSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: FontsSchemaItems
*/
@Parcelize
data class FontsSchemaItems(
    
    
    
    @SerializedName("family")
    var family: String?=null,
    
    @SerializedName("variants")
    var variants: ArrayList<String>?=null,
    
    @SerializedName("subsets")
    var subsets: ArrayList<String>?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("files")
    var files: FontsSchemaItemsFiles?=null,
    
    @SerializedName("category")
    var category: String?=null,
    
    @SerializedName("kind")
    var kind: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FontsSchemaItemsFiles
*/
@Parcelize
data class FontsSchemaItemsFiles(
    
    
    
    @SerializedName("regular")
    var regular: String?=null,
    
    @SerializedName("italic")
    var italic: String?=null,
    
    @SerializedName("bold")
    var bold: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ThemesSchema
*/
@Parcelize
data class ThemesSchema(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("applied")
    var applied: Boolean?=null,
    
    @SerializedName("customized")
    var customized: Boolean?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("version")
    var version: String?=null,
    
    @SerializedName("parent_theme_version")
    var parentThemeVersion: String?=null,
    
    @SerializedName("parent_theme")
    var parentTheme: String?=null,
    
    @SerializedName("information")
    var information: Information?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("src")
    var src: Src?=null,
    
    @SerializedName("assets")
    var assets: AssetsSchema?=null,
    
    @SerializedName("available_sections")
    var availableSections: ArrayList<availableSectionSchema>?=null,
    
    @SerializedName("styles")
    var styles: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("config")
    var config: Config?=null,
    
    @SerializedName("font")
    var font: Font?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null,
    
    @SerializedName("colors")
    var colors: Colors?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: availableSectionSchema
*/
@Parcelize
data class availableSectionSchema(
    
    
    
    @SerializedName("blocks")
    var blocks: ArrayList<Blocks>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("props")
    var props: ArrayList<BlocksProps>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Information
*/
@Parcelize
data class Information(
    
    
    
    @SerializedName("images")
    var images: Images?=null,
    
    @SerializedName("features")
    var features: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Images
*/
@Parcelize
data class Images(
    
    
    
    @SerializedName("desktop")
    var desktop: ArrayList<String>?=null,
    
    @SerializedName("android")
    var android: ArrayList<String>?=null,
    
    @SerializedName("ios")
    var ios: ArrayList<String>?=null,
    
    @SerializedName("thumbnail")
    var thumbnail: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Src
*/
@Parcelize
data class Src(
    
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AssetsSchema
*/
@Parcelize
data class AssetsSchema(
    
    
    
    @SerializedName("umd_js")
    var umdJs: UmdJs?=null,
    
    @SerializedName("common_js")
    var commonJs: CommonJs?=null,
    
    @SerializedName("css")
    var css: Css?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UmdJs
*/
@Parcelize
data class UmdJs(
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("links")
    var links: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CommonJs
*/
@Parcelize
data class CommonJs(
    
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Css
*/
@Parcelize
data class Css(
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("links")
    var links: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Sections
*/
@Parcelize
data class Sections(
    
    
    
    @SerializedName("attributes")
    var attributes: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Config
*/
@Parcelize
data class Config(
    
    
    
    @SerializedName("preset")
    var preset: Preset?=null,
    
    @SerializedName("global_schema")
    var globalSchema: GlobalSchema?=null,
    
    @SerializedName("current")
    var current: String?=null,
    
    @SerializedName("list")
    var list: ArrayList<ListSchemaItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Preset
*/
@Parcelize
data class Preset(
    
    
    
    @SerializedName("pages")
    var pages: ArrayList<AvailablePageSchema>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GlobalSchema
*/
@Parcelize
data class GlobalSchema(
    
    
    
    @SerializedName("props")
    var props: ArrayList<GlobalSchemaProps>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ListSchemaItem
*/
@Parcelize
data class ListSchemaItem(
    
    
    
    @SerializedName("global_config")
    var globalConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page")
    var page: ArrayList<ConfigPage>?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Colors
*/
@Parcelize
data class Colors(
    
    
    
    @SerializedName("bg_color")
    var bgColor: String?=null,
    
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    
    @SerializedName("secondary_color")
    var secondaryColor: String?=null,
    
    @SerializedName("accent_color")
    var accentColor: String?=null,
    
    @SerializedName("link_color")
    var linkColor: String?=null,
    
    @SerializedName("button_secondary_color")
    var buttonSecondaryColor: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Custom
*/
@Parcelize
data class Custom(
    
    
    
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ConfigPage
*/
@Parcelize
data class ConfigPage(
    
    
    
    @SerializedName("settings")
    var settings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page")
    var page: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Font
*/
@Parcelize
data class Font(
    
    
    
    @SerializedName("family")
    var family: String?=null,
    
    @SerializedName("variants")
    var variants: Variants?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Variants
*/
@Parcelize
data class Variants(
    
    
    
    @SerializedName("medium")
    var medium: Medium?=null,
    
    @SerializedName("semi_bold")
    var semiBold: SemiBold?=null,
    
    @SerializedName("bold")
    var bold: Bold?=null,
    
    @SerializedName("light")
    var light: Light?=null,
    
    @SerializedName("regular")
    var regular: Regular?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Medium
*/
@Parcelize
data class Medium(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SemiBold
*/
@Parcelize
data class SemiBold(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Bold
*/
@Parcelize
data class Bold(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Light
*/
@Parcelize
data class Light(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Regular
*/
@Parcelize
data class Regular(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("file")
    var file: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Blocks
*/
@Parcelize
data class Blocks(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("props")
    var props: ArrayList<BlocksProps>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GlobalSchemaProps
*/
@Parcelize
data class GlobalSchemaProps(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("category")
    var category: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BlocksProps
*/
@Parcelize
data class BlocksProps(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("label")
    var label: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}




/*
    Model: BlockUserRequestSchema
*/
@Parcelize
data class BlockUserRequestSchema(
    
    
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("user_id")
    var userId: ArrayList<String>?=null,
    
    @SerializedName("reason")
    var reason: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ArchiveUserRequestSchema
*/
@Parcelize
data class ArchiveUserRequestSchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DeleteApplicationUserRequestSchema
*/
@Parcelize
data class DeleteApplicationUserRequestSchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UnDeleteUserRequestSchema
*/
@Parcelize
data class UnDeleteUserRequestSchema(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: EditEmailRequestSchema
*/
@Parcelize
data class EditEmailRequestSchema(
    
    
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SendVerificationLinkMobileRequestSchema
*/
@Parcelize
data class SendVerificationLinkMobileRequestSchema(
    
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EditMobileRequestSchema
*/
@Parcelize
data class EditMobileRequestSchema(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EditProfileRequestSchema
*/
@Parcelize
data class EditProfileRequestSchema(
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("mobile")
    var mobile: EditProfileMobileSchema?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("dob")
    var dob: String?=null,
    
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    
    @SerializedName("android_hash")
    var androidHash: String?=null,
    
    @SerializedName("sender")
    var sender: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EditProfileMobileSchema
*/
@Parcelize
data class EditProfileMobileSchema(
    
    
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SendEmailOtpRequestSchema
*/
@Parcelize
data class SendEmailOtpRequestSchema(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: VerifyEmailOtpRequestSchema
*/
@Parcelize
data class VerifyEmailOtpRequestSchema(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: VerifyOtpRequestSchema
*/
@Parcelize
data class VerifyOtpRequestSchema(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SendMobileOtpRequestSchema
*/
@Parcelize
data class SendMobileOtpRequestSchema(
    
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("android_hash")
    var androidHash: String?=null,
    
    @SerializedName("force")
    var force: String?=null,
    
    @SerializedName("captcha_code")
    var captchaCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdatePasswordRequestSchema
*/
@Parcelize
data class UpdatePasswordRequestSchema(
    
    
    
    @SerializedName("old_password")
    var oldPassword: String?=null,
    
    @SerializedName("new_password")
    var newPassword: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: FormRegisterRequestSchema
*/
@Parcelize
data class FormRegisterRequestSchema(
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("phone")
    var phone: FormRegisterRequestSchemaPhone?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TokenRequestBodySchema
*/
@Parcelize
data class TokenRequestBodySchema(
    
    
    
    @SerializedName("token")
    var token: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ForgotPasswordRequestSchema
*/
@Parcelize
data class ForgotPasswordRequestSchema(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("password")
    var password: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CodeRequestBodySchema
*/
@Parcelize
data class CodeRequestBodySchema(
    
    
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SendResetPasswordEmailRequestSchema
*/
@Parcelize
data class SendResetPasswordEmailRequestSchema(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("captcha_code")
    var captchaCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SendResetPasswordMobileRequestSchema
*/
@Parcelize
data class SendResetPasswordMobileRequestSchema(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("captcha_code")
    var captchaCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PasswordLoginRequestSchema
*/
@Parcelize
data class PasswordLoginRequestSchema(
    
    
    
    @SerializedName("captcha_code")
    var captchaCode: String?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SendOtpRequestSchema
*/
@Parcelize
data class SendOtpRequestSchema(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("captcha_code")
    var captchaCode: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("android_hash")
    var androidHash: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OAuthRequestSchema
*/
@Parcelize
data class OAuthRequestSchema(
    
    
    
    @SerializedName("is_signed_in")
    var isSignedIn: Boolean?=null,
    
    @SerializedName("oauth2")
    var oauth2: OAuthRequestSchemaOauth2?=null,
    
    @SerializedName("profile")
    var profile: OAuthRequestSchemaProfile?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OAuthRequestAppleSchema
*/
@Parcelize
data class OAuthRequestAppleSchema(
    
    
    
    @SerializedName("user_identifier")
    var userIdentifier: String?=null,
    
    @SerializedName("oauth")
    var oauth: OAuthRequestAppleSchemaOauth?=null,
    
    @SerializedName("profile")
    var profile: OAuthRequestAppleSchemaProfile?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserObjectSchema
*/
@Parcelize
data class UserObjectSchema(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AuthSuccess
*/
@Parcelize
data class AuthSuccess(
    
    
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
    @SerializedName("user_exists")
    var userExists: Boolean?=null,
    
    @SerializedName("user")
    var user: UserSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SendOtpResponse
*/
@Parcelize
data class SendOtpResponse(
    
    
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    
    @SerializedName("resend_token")
    var resendToken: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("resend_email_token")
    var resendEmailToken: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
    @SerializedName("verify_email_otp")
    var verifyEmailOtp: Boolean?=null,
    
    @SerializedName("verify_mobile_otp")
    var verifyMobileOtp: Boolean?=null,
    
    @SerializedName("user_exists")
    var userExists: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProfileEditSuccess
*/
@Parcelize
data class ProfileEditSuccess(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
    @SerializedName("resend_email_token")
    var resendEmailToken: String?=null,
    
    @SerializedName("user_exists")
    var userExists: Boolean?=null,
    
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null,
    
    @SerializedName("verify_email_otp")
    var verifyEmailOtp: Boolean?=null,
    
    @SerializedName("verify_mobile_otp")
    var verifyMobileOtp: Boolean?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    
    @SerializedName("resend_token")
    var resendToken: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LoginSuccess
*/
@Parcelize
data class LoginSuccess(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: VerifyOtpSuccess
*/
@Parcelize
data class VerifyOtpSuccess(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    
    @SerializedName("user_exists")
    var userExists: Boolean?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ResetPasswordSuccess
*/
@Parcelize
data class ResetPasswordSuccess(
    
    
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: RegisterFormSuccess
*/
@Parcelize
data class RegisterFormSuccess(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    
    @SerializedName("resend_token")
    var resendToken: String?=null,
    
    @SerializedName("resend_email_token")
    var resendEmailToken: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("verify_email_otp")
    var verifyEmailOtp: Boolean?=null,
    
    @SerializedName("verify_mobile_otp")
    var verifyMobileOtp: Boolean?=null,
    
    @SerializedName("user_exists")
    var userExists: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: VerifyEmailSuccess
*/
@Parcelize
data class VerifyEmailSuccess(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: HasPasswordSuccess
*/
@Parcelize
data class HasPasswordSuccess(
    
    
    
    @SerializedName("result")
    var result: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: LogoutSuccess
*/
@Parcelize
data class LogoutSuccess(
    
    
    
    @SerializedName("logout")
    var logout: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: BlockUserSuccess
*/
@Parcelize
data class BlockUserSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ArchiveUserSuccess
*/
@Parcelize
data class ArchiveUserSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DeleteUserSuccess
*/
@Parcelize
data class DeleteUserSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UnDeleteUserSuccess
*/
@Parcelize
data class UnDeleteUserSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OtpSuccess
*/
@Parcelize
data class OtpSuccess(
    
    
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null,
    
    @SerializedName("resend_token")
    var resendToken: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: EmailOtpSuccess
*/
@Parcelize
data class EmailOtpSuccess(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SessionListSuccess
*/
@Parcelize
data class SessionListSuccess(
    
    
    
    @SerializedName("sessions")
    var sessions: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: VerifyMobileOTPSuccess
*/
@Parcelize
data class VerifyMobileOTPSuccess(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: VerifyEmailOTPSuccess
*/
@Parcelize
data class VerifyEmailOTPSuccess(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SendMobileVerifyLinkSuccess
*/
@Parcelize
data class SendMobileVerifyLinkSuccess(
    
    
    
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SendEmailVerifyLinkSuccess
*/
@Parcelize
data class SendEmailVerifyLinkSuccess(
    
    
    
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UserSearchResponseSchema
*/
@Parcelize
data class UserSearchResponseSchema(
    
    
    
    @SerializedName("users")
    var users: ArrayList<UserSchema>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CustomerListResponseSchema
*/
@Parcelize
data class CustomerListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UserSchema>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SessionListResponseSchema
*/
@Parcelize
data class SessionListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SessionListResponseInfo>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SessionDeleteResponseSchema
*/
@Parcelize
data class SessionDeleteResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UnauthorizedSchema
*/
@Parcelize
data class UnauthorizedSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UnauthenticatedSchema
*/
@Parcelize
data class UnauthenticatedSchema(
    
    
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: NotFoundSchema
*/
@Parcelize
data class NotFoundSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AuthenticationInternalServerErrorSchema
*/
@Parcelize
data class AuthenticationInternalServerErrorSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AuthenticationApiErrorSchema
*/
@Parcelize
data class AuthenticationApiErrorSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ProfileEditSuccessSchema
*/
@Parcelize
data class ProfileEditSuccessSchema(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("verify_email_otp")
    var verifyEmailOtp: Boolean?=null,
    
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null,
    
    @SerializedName("verify_mobile_otp")
    var verifyMobileOtp: Boolean?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("register_token")
    var registerToken: String?=null,
    
    @SerializedName("user_exists")
    var userExists: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FormRegisterRequestSchemaPhone
*/
@Parcelize
data class FormRegisterRequestSchemaPhone(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OAuthRequestSchemaOauth2
*/
@Parcelize
data class OAuthRequestSchemaOauth2(
    
    
    
    @SerializedName("access_token")
    var accessToken: String?=null,
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("refresh_token")
    var refreshToken: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OAuthRequestSchemaProfile
*/
@Parcelize
data class OAuthRequestSchemaProfile(
    
    
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("image")
    var image: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("full_name")
    var fullName: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OAuthRequestAppleSchemaOauth
*/
@Parcelize
data class OAuthRequestAppleSchemaOauth(
    
    
    
    @SerializedName("identity_token")
    var identityToken: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OAuthRequestAppleSchemaProfile
*/
@Parcelize
data class OAuthRequestAppleSchemaProfile(
    
    
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("full_name")
    var fullName: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AuthSuccessUser
*/
@Parcelize
data class AuthSuccessUser(
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("debug")
    var debug: AuthSuccessUserDebug?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("emails")
    var emails: AuthSuccessUserEmails?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SessionListResponseInfo
*/
@Parcelize
data class SessionListResponseInfo(
    
    
    
    @SerializedName("session_id")
    var sessionId: String?=null,
    
    @SerializedName("user_agent")
    var userAgent: String?=null,
    
    @SerializedName("ip")
    var ip: String?=null,
    
    @SerializedName("domain")
    var domain: String?=null,
    
    @SerializedName("expire_in")
    var expireIn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AuthSuccessUserDebug
*/
@Parcelize
data class AuthSuccessUserDebug(
    
    
    
    @SerializedName("platform")
    var platform: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AuthSuccessUserEmails
*/
@Parcelize
data class AuthSuccessUserEmails(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("active")
    var active: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserGroupResponseSchema
*/
@Parcelize
data class UserGroupResponseSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserGroupListResponseSchema
*/
@Parcelize
data class UserGroupListResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<UserGroupResponseSchema>?=null,
    
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateUserGroupSchema
*/
@Parcelize
data class CreateUserGroupSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateUserRequestSchema
*/
@Parcelize
data class CreateUserRequestSchema(
    
    
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateUserResponseSchema
*/
@Parcelize
data class CreateUserResponseSchema(
    
    
    
    @SerializedName("user")
    var user: UserSchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CreateUserSessionRequestSchema
*/
@Parcelize
data class CreateUserSessionRequestSchema(
    
    
    
    @SerializedName("domain")
    var domain: String?=null,
    
    @SerializedName("max_age")
    var maxAge: Double?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateUserSessionResponseSchema
*/
@Parcelize
data class CreateUserSessionResponseSchema(
    
    
    
    @SerializedName("domain")
    var domain: String?=null,
    
    @SerializedName("max_age")
    var maxAge: Double?=null,
    
    @SerializedName("secure")
    var secure: Boolean?=null,
    
    @SerializedName("http_only")
    var httpOnly: Boolean?=null,
    
    @SerializedName("cookie")
    var cookie: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PlatformSchema
*/
@Parcelize
data class PlatformSchema(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("look_and_feel")
    var lookAndFeel: LookAndFeel?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("forgot_password")
    var forgotPassword: Boolean?=null,
    
    @SerializedName("login")
    var login: Login?=null,
    
    @SerializedName("skip_captcha")
    var skipCaptcha: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: MetaSchema?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("social")
    var social: Social?=null,
    
    @SerializedName("required_fields")
    var requiredFields: RequiredFields?=null,
    
    @SerializedName("register_required_fields")
    var registerRequiredFields: RegisterRequiredFields?=null,
    
    @SerializedName("skip_login")
    var skipLogin: Boolean?=null,
    
    @SerializedName("flash_card")
    var flashCard: FlashCard?=null,
    
    @SerializedName("subtext")
    var subtext: String?=null,
    
    @SerializedName("social_tokens")
    var socialTokens: SocialTokens?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("register")
    var register: Boolean?=null,
    
    @SerializedName("mobile_image")
    var mobileImage: String?=null,
    
    @SerializedName("desktop_image")
    var desktopImage: String?=null,
    
    @SerializedName("delete_account_day")
    var deleteAccountDay: Int?=null,
    
    @SerializedName("delete_account_reasons")
    var deleteAccountReasons: ArrayList<DeleteAccountReasons>?=null,
    
    @SerializedName("delete_account_consent")
    var deleteAccountConsent: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("session_config")
    var sessionConfig: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LookAndFeel
*/
@Parcelize
data class LookAndFeel(
    
    
    
    @SerializedName("card_position")
    var cardPosition: String?=null,
    
    @SerializedName("background_color")
    var backgroundColor: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Login
*/
@Parcelize
data class Login(
    
    
    
    @SerializedName("password")
    var password: Boolean?=null,
    
    @SerializedName("otp")
    var otp: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: MetaSchema
*/
@Parcelize
data class MetaSchema(
    
    
    
    @SerializedName("fynd_default")
    var fyndDefault: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Social
*/
@Parcelize
data class Social(
    
    
    
    @SerializedName("account_kit")
    var accountKit: Boolean?=null,
    
    @SerializedName("facebook")
    var facebook: Boolean?=null,
    
    @SerializedName("google")
    var google: Boolean?=null,
    
    @SerializedName("apple")
    var apple: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RequiredFields
*/
@Parcelize
data class RequiredFields(
    
    
    
    @SerializedName("email")
    var email: PlatformEmail?=null,
    
    @SerializedName("mobile")
    var mobile: PlatformMobile?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PlatformEmail
*/
@Parcelize
data class PlatformEmail(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PlatformMobile
*/
@Parcelize
data class PlatformMobile(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RegisterRequiredFields
*/
@Parcelize
data class RegisterRequiredFields(
    
    
    
    @SerializedName("email")
    var email: RegisterRequiredFieldsEmail?=null,
    
    @SerializedName("mobile")
    var mobile: RegisterRequiredFieldsMobile?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RegisterRequiredFieldsEmail
*/
@Parcelize
data class RegisterRequiredFieldsEmail(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RegisterRequiredFieldsMobile
*/
@Parcelize
data class RegisterRequiredFieldsMobile(
    
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    
    @SerializedName("level")
    var level: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: FlashCard
*/
@Parcelize
data class FlashCard(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("text_color")
    var textColor: String?=null,
    
    @SerializedName("background_color")
    var backgroundColor: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SocialTokens
*/
@Parcelize
data class SocialTokens(
    
    
    
    @SerializedName("facebook")
    var facebook: Facebook?=null,
    
    @SerializedName("account_kit")
    var accountKit: Accountkit?=null,
    
    @SerializedName("google")
    var google: Google?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: DeleteAccountReasons
*/
@Parcelize
data class DeleteAccountReasons(
    
    
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: String?=null,
    
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: DeleteAccountConsent
*/
@Parcelize
data class DeleteAccountConsent(
    
    
    
    @SerializedName("consent_text")
    var consentText: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Facebook
*/
@Parcelize
data class Facebook(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Accountkit
*/
@Parcelize
data class Accountkit(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Google
*/
@Parcelize
data class Google(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SessionExpiry
*/
@Parcelize
data class SessionExpiry(
    
    
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_rolling")
    var isRolling: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateUserGroupSchema
*/
@Parcelize
data class UpdateUserGroupSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("file_url")
    var fileUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateUserRequestSchema
*/
@Parcelize
data class UpdateUserRequestSchema(
    
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("external_id")
    var externalId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("phone_numbers")
    var phoneNumbers: ArrayList<PhoneNumber>?=null,
    
    @SerializedName("emails")
    var emails: ArrayList<Email>?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("dob")
    var dob: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("account_type")
    var accountType: String?=null,
    
    @SerializedName("debug")
    var debug: Debug?=null,
    
    @SerializedName("has_old_password_hash")
    var hasOldPasswordHash: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PhoneNumber
*/
@Parcelize
data class PhoneNumber(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}




/*
    Model: ApplicationLegal
*/
@Parcelize
data class ApplicationLegal(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("tnc")
    var tnc: String?=null,
    
    @SerializedName("policy")
    var policy: String?=null,
    
    @SerializedName("shipping")
    var shipping: String?=null,
    
    @SerializedName("returns")
    var returns: String?=null,
    
    @SerializedName("faq")
    var faq: ArrayList<ApplicationLegalFAQ>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationLegalFAQ
*/
@Parcelize
data class ApplicationLegalFAQ(
    
    
    
    @SerializedName("question")
    var question: String?=null,
    
    @SerializedName("answer")
    var answer: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PathMappingSchema
*/
@Parcelize
data class PathMappingSchema(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("redirect_from")
    var redirectFrom: String?=null,
    
    @SerializedName("redirect_to")
    var redirectTo: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("__source")
    var source: TagSourceSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SeoComponent
*/
@Parcelize
data class SeoComponent(
    
    
    
    @SerializedName("seo")
    var seo: SeoSchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SeoSchema
*/
@Parcelize
data class SeoSchema(
    
    
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("robots_txt")
    var robotsTxt: String?=null,
    
    @SerializedName("sitemap_enabled")
    var sitemapEnabled: Boolean?=null,
    
    @SerializedName("custom_meta_tags")
    var customMetaTags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("details")
    var details: Detail?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CustomMetaTag
*/
@Parcelize
data class CustomMetaTag(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("content")
    var content: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Detail
*/
@Parcelize
data class Detail(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AnnouncementPageSchema
*/
@Parcelize
data class AnnouncementPageSchema(
    
    
    
    @SerializedName("page_slug")
    var pageSlug: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EditorMeta
*/
@Parcelize
data class EditorMeta(
    
    
    
    @SerializedName("foreground_color")
    var foregroundColor: String?=null,
    
    @SerializedName("background_color")
    var backgroundColor: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("content")
    var content: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AnnouncementAuthorSchema
*/
@Parcelize
data class AnnouncementAuthorSchema(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AdminAnnouncementSchema
*/
@Parcelize
data class AdminAnnouncementSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("platforms")
    var platforms: ArrayList<String>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("announcement")
    var announcement: String?=null,
    
    @SerializedName("pages")
    var pages: ArrayList<AnnouncementPageSchema>?=null,
    
    @SerializedName("editor_meta")
    var editorMeta: EditorMeta?=null,
    
    @SerializedName("author")
    var author: AnnouncementAuthorSchema?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    
    @SerializedName("_schedule")
    var schedule: ScheduleSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ScheduleSchema
*/
@Parcelize
data class ScheduleSchema(
    
    
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("duration")
    var duration: Double?=null,
    
    @SerializedName("next_schedule")
    var nextSchedule: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    Model: AnnouncementSchema
*/
@Parcelize
data class AnnouncementSchema(
    
    
    
    @SerializedName("announcement")
    var announcement: String?=null,
    
    @SerializedName("schedule")
    var schedule: ScheduleStartSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ScheduleStartSchema
*/
@Parcelize
data class ScheduleStartSchema(
    
    
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BlogGetResponse
*/
@Parcelize
data class BlogGetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<BlogSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ResourceContent
*/
@Parcelize
data class ResourceContent(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Asset
*/
@Parcelize
data class Asset(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Author
*/
@Parcelize
data class Author(
    
    
    
    @SerializedName("designation")
    var designation: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: BlogSchema
*/
@Parcelize
data class BlogSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("author")
    var author: Author?=null,
    
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    
    @SerializedName("feature_image")
    var featureImage: Asset?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("reading_time")
    var readingTime: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("seo")
    var seo: SEO?=null,
    
    @SerializedName("_schedule")
    var schedule: CronSchedule?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SEO
*/
@Parcelize
data class SEO(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("image")
    var image: SEOImage?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SEOImage
*/
@Parcelize
data class SEOImage(
    
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DateMeta
*/
@Parcelize
data class DateMeta(
    
    
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BlogRequest
*/
@Parcelize
data class BlogRequest(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("author")
    var author: Author?=null,
    
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    
    @SerializedName("feature_image")
    var featureImage: Asset?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("reading_time")
    var readingTime: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("seo")
    var seo: SEO?=null,
    
    @SerializedName("_schedule")
    var schedule: CronSchedule?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetAnnouncementListSchema
*/
@Parcelize
data class GetAnnouncementListSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AdminAnnouncementSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreateAnnouncementSchema
*/
@Parcelize
data class CreateAnnouncementSchema(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: AdminAnnouncementSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DataLoaderResponseSchema
*/
@Parcelize
data class DataLoaderResponseSchema(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("service")
    var service: String?=null,
    
    @SerializedName("operation_id")
    var operationId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("content")
    var content: String?=null,
    
    @SerializedName("__source")
    var source: DataLoaderSourceSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DataLoaderResetResponseSchema
*/
@Parcelize
data class DataLoaderResetResponseSchema(
    
    
    
    @SerializedName("reset")
    var reset: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Navigation
*/
@Parcelize
data class Navigation(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("orientation")
    var orientation: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("position")
    var position: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("navigation")
    var navigation: NavigationReference?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LocaleLanguage
*/
@Parcelize
data class LocaleLanguage(
    
    
    
    @SerializedName("hi")
    var hi: Language?=null,
    
    @SerializedName("ar")
    var ar: Language?=null,
    
    @SerializedName("en_us")
    var enUs: Language?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Language
*/
@Parcelize
data class Language(
    
    
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Action
*/
@Parcelize
data class Action(
    
    
    
    @SerializedName("page")
    var page: ActionPage?=null,
    
    @SerializedName("popup")
    var popup: ActionPage?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ActionPage
*/
@Parcelize
data class ActionPage(
    
    
    
    @SerializedName("params")
    var params: HashMap<String,ArrayList<String>>?=null,
    
    @SerializedName("query")
    var query: HashMap<String,ArrayList<String>>?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: PageType?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: NavigationReference
*/
@Parcelize
data class NavigationReference(
    
    
    
    @SerializedName("acl")
    var acl: ArrayList<String>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: LocaleLanguage?=null,
    
    @SerializedName("image")
    var image: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("sort_order")
    var sortOrder: Int?=null,
    
    @SerializedName("sub_navigation")
    var subNavigation: ArrayList<NavigationReference>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LandingPage
*/
@Parcelize
data class LandingPage(
    
    
    
    @SerializedName("data")
    var data: LandingPageSchema?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ConfigurationSchema
*/
@Parcelize
data class ConfigurationSchema(
    
    
    
    @SerializedName("sleep_time")
    var sleepTime: Int?=null,
    
    @SerializedName("start_on_launch")
    var startOnLaunch: Boolean?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("slide_direction")
    var slideDirection: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SlideshowMedia
*/
@Parcelize
data class SlideshowMedia(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("bg_color")
    var bgColor: String?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("auto_decide_duration")
    var autoDecideDuration: Boolean?=null,
    
    @SerializedName("action")
    var action: Action?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Slideshow
*/
@Parcelize
data class Slideshow(
    
    
    
    @SerializedName("data")
    var data: SlideshowSchema?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AnnouncementsResponseSchema
*/
@Parcelize
data class AnnouncementsResponseSchema(
    
    
    
    @SerializedName("announcements")
    var announcements: HashMap<String,ArrayList<AnnouncementSchema>>?=null,
    
    @SerializedName("refresh_rate")
    var refreshRate: Int?=null,
    
    @SerializedName("refresh_pages")
    var refreshPages: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: FaqResponseSchema
*/
@Parcelize
data class FaqResponseSchema(
    
    
    
    @SerializedName("faqs")
    var faqs: ArrayList<FaqSchema>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UpdateHandpickedSchema
*/
@Parcelize
data class UpdateHandpickedSchema(
    
    
    
    @SerializedName("tag")
    var tag: HandpickedTagSchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: HandpickedTagSchema
*/
@Parcelize
data class HandpickedTagSchema(
    
    
    
    @SerializedName("position")
    var position: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("content")
    var content: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RemoveHandpickedSchema
*/
@Parcelize
data class RemoveHandpickedSchema(
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CreateTagSchema
*/
@Parcelize
data class CreateTagSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("position")
    var position: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("pages")
    var pages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("content")
    var content: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateTagRequestSchema
*/
@Parcelize
data class CreateTagRequestSchema(
    
    
    
    @SerializedName("tags")
    var tags: ArrayList<CreateTagSchema>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DataLoaderSchema
*/
@Parcelize
data class DataLoaderSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("service")
    var service: String?=null,
    
    @SerializedName("operation_id")
    var operationId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("content")
    var content: String?=null,
    
    @SerializedName("__source")
    var source: DataLoaderSourceSchema?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DataLoaderSourceSchema
*/
@Parcelize
data class DataLoaderSourceSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DataLoadersSchema
*/
@Parcelize
data class DataLoadersSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<DataLoaderSchema>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: TagDeleteSuccessResponse
*/
@Parcelize
data class TagDeleteSuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ContentAPIError
*/
@Parcelize
data class ContentAPIError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status")
    var status: Double?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("stack_trace")
    var stackTrace: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CommonError
*/
@Parcelize
data class CommonError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CategorySchema
*/
@Parcelize
data class CategorySchema(
    
    
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("children")
    var children: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("icon_url")
    var iconUrl: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ChildrenSchema
*/
@Parcelize
data class ChildrenSchema(
    
    
    
    @SerializedName("question")
    var question: String?=null,
    
    @SerializedName("answer")
    var answer: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CategoryRequestSchema
*/
@Parcelize
data class CategoryRequestSchema(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: FAQCategorySchema
*/
@Parcelize
data class FAQCategorySchema(
    
    
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("children")
    var children: ArrayList<ChildrenSchema>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("icon_url")
    var iconUrl: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FaqSchema
*/
@Parcelize
data class FaqSchema(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("question")
    var question: String?=null,
    
    @SerializedName("answer")
    var answer: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FAQ
*/
@Parcelize
data class FAQ(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("question")
    var question: String?=null,
    
    @SerializedName("answer")
    var answer: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateFaqResponseSchema
*/
@Parcelize
data class CreateFaqResponseSchema(
    
    
    
    @SerializedName("faq")
    var faq: FaqSchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CreateFaqSchema
*/
@Parcelize
data class CreateFaqSchema(
    
    
    
    @SerializedName("faq")
    var faq: FAQ?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GetFaqSchema
*/
@Parcelize
data class GetFaqSchema(
    
    
    
    @SerializedName("faqs")
    var faqs: ArrayList<FaqSchema>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UpdateFaqCategoryRequestSchema
*/
@Parcelize
data class UpdateFaqCategoryRequestSchema(
    
    
    
    @SerializedName("category")
    var category: CategorySchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CreateFaqCategoryRequestSchema
*/
@Parcelize
data class CreateFaqCategoryRequestSchema(
    
    
    
    @SerializedName("category")
    var category: CategoryRequestSchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CreateFaqCategorySchema
*/
@Parcelize
data class CreateFaqCategorySchema(
    
    
    
    @SerializedName("category")
    var category: CategorySchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GetFaqCategoriesSchema
*/
@Parcelize
data class GetFaqCategoriesSchema(
    
    
    
    @SerializedName("categories")
    var categories: ArrayList<CategorySchema>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GetFaqCategoryBySlugSchema
*/
@Parcelize
data class GetFaqCategoryBySlugSchema(
    
    
    
    @SerializedName("category")
    var category: FAQCategorySchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: LandingPageGetResponse
*/
@Parcelize
data class LandingPageGetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<LandingPageSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: LandingPageSchema
*/
@Parcelize
data class LandingPageSchema(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DefaultNavigationResponse
*/
@Parcelize
data class DefaultNavigationResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<NavigationSchema>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: NavigationGetResponse
*/
@Parcelize
data class NavigationGetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<NavigationSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Orientation
*/
@Parcelize
data class Orientation(
    
    
    
    @SerializedName("portrait")
    var portrait: ArrayList<String>?=null,
    
    @SerializedName("landscape")
    var landscape: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: NavigationSchema
*/
@Parcelize
data class NavigationSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("orientation")
    var orientation: Orientation?=null,
    
    @SerializedName("version")
    var version: Double?=null,
    
    @SerializedName("navigation")
    var navigation: ArrayList<NavigationReference>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: NavigationRequest
*/
@Parcelize
data class NavigationRequest(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    
    @SerializedName("orientation")
    var orientation: Orientation?=null,
    
    @SerializedName("navigation")
    var navigation: ArrayList<NavigationReference>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CustomPageSchema
*/
@Parcelize
data class CustomPageSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("orientation")
    var orientation: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("content")
    var content: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("_schedule")
    var schedule: ScheduleSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ContentSchema
*/
@Parcelize
data class ContentSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CustomPage
*/
@Parcelize
data class CustomPage(
    
    
    
    @SerializedName("data")
    var data: CustomPageSchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: FeatureImage
*/
@Parcelize
data class FeatureImage(
    
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PageGetResponse
*/
@Parcelize
data class PageGetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<PageSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PageSpec
*/
@Parcelize
data class PageSpec(
    
    
    
    @SerializedName("specifications")
    var specifications: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PageSpecParam
*/
@Parcelize
data class PageSpecParam(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("required")
    var required: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PageSpecItem
*/
@Parcelize
data class PageSpecItem(
    
    
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("params")
    var params: ArrayList<PageSpecParam>?=null,
    
    @SerializedName("query")
    var query: ArrayList<PageSpecParam>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PageSchema
*/
@Parcelize
data class PageSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("component_ids")
    var componentIds: ArrayList<String>?=null,
    
    @SerializedName("content")
    var content: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("content_path")
    var contentPath: String?=null,
    
    @SerializedName("created_by")
    var createdBy: CreatedBySchema?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("feature_image")
    var featureImage: Asset?=null,
    
    @SerializedName("page_meta")
    var pageMeta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("_schedule")
    var schedule: ScheduleSchema?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("orientation")
    var orientation: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("seo")
    var seo: SEO?=null,
    
    @SerializedName("visibility")
    var visibility: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreatedBySchema
*/
@Parcelize
data class CreatedBySchema(
    
    
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PageContent
*/
@Parcelize
data class PageContent(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PageMeta
*/
@Parcelize
data class PageMeta(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PageRequest
*/
@Parcelize
data class PageRequest(
    
    
    
    @SerializedName("_schedule")
    var schedule: CronSchedule?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("author")
    var author: Author?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("orientation")
    var orientation: String?=null,
    
    @SerializedName("content")
    var content: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("feature_image")
    var featureImage: Asset?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("reading_time")
    var readingTime: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("seo")
    var seo: SEO?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CronSchedule
*/
@Parcelize
data class CronSchedule(
    
    
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("duration")
    var duration: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PagePublishRequest
*/
@Parcelize
data class PagePublishRequest(
    
    
    
    @SerializedName("publish")
    var publish: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PageMetaSchema
*/
@Parcelize
data class PageMetaSchema(
    
    
    
    @SerializedName("system_pages")
    var systemPages: ArrayList<NavigationSchema>?=null,
    
    @SerializedName("custom_pages")
    var customPages: ArrayList<PageSchema>?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SlideshowGetResponse
*/
@Parcelize
data class SlideshowGetResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SlideshowSchema>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SlideshowSchema
*/
@Parcelize
data class SlideshowSchema(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("configuration")
    var configuration: ConfigurationSchema?=null,
    
    @SerializedName("media")
    var media: ArrayList<SlideshowMedia>?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("archived")
    var archived: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SlideshowRequest
*/
@Parcelize
data class SlideshowRequest(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("configuration")
    var configuration: ConfigurationSchema?=null,
    
    @SerializedName("media")
    var media: SlideshowMedia?=null,
    
    @SerializedName("active")
    var active: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Support
*/
@Parcelize
data class Support(
    
    
    
    @SerializedName("created")
    var created: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("contact")
    var contact: ContactSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PhoneProperties
*/
@Parcelize
data class PhoneProperties(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PhoneSchema
*/
@Parcelize
data class PhoneSchema(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("phone")
    var phone: ArrayList<PhoneProperties>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EmailProperties
*/
@Parcelize
data class EmailProperties(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EmailSchema
*/
@Parcelize
data class EmailSchema(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("email")
    var email: ArrayList<EmailProperties>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ContactSchema
*/
@Parcelize
data class ContactSchema(
    
    
    
    @SerializedName("phone")
    var phone: PhoneSchema?=null,
    
    @SerializedName("email")
    var email: EmailSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TagsSchema
*/
@Parcelize
data class TagsSchema(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<TagSchema>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TagSchema
*/
@Parcelize
data class TagSchema(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("position")
    var position: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("content")
    var content: String?=null,
    
    @SerializedName("pages")
    var pages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("__source")
    var source: TagSourceSchema?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TagSourceSchema
*/
@Parcelize
data class TagSourceSchema(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




/*
    Model: CommunicationConsentReq
*/
@Parcelize
data class CommunicationConsentReq(
    
    
    
    @SerializedName("response")
    var response: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("channel")
    var channel: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CommunicationConsentRes
*/
@Parcelize
data class CommunicationConsentRes(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("channels")
    var channels: CommunicationConsentChannels?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CommunicationConsentChannelsEmail
*/
@Parcelize
data class CommunicationConsentChannelsEmail(
    
    
    
    @SerializedName("response")
    var response: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CommunicationConsentChannelsSms
*/
@Parcelize
data class CommunicationConsentChannelsSms(
    
    
    
    @SerializedName("response")
    var response: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CommunicationConsentChannelsWhatsapp
*/
@Parcelize
data class CommunicationConsentChannelsWhatsapp(
    
    
    
    @SerializedName("response")
    var response: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CommunicationConsentChannels
*/
@Parcelize
data class CommunicationConsentChannels(
    
    
    
    @SerializedName("email")
    var email: CommunicationConsentChannelsEmail?=null,
    
    @SerializedName("sms")
    var sms: CommunicationConsentChannelsSms?=null,
    
    @SerializedName("whatsapp")
    var whatsapp: CommunicationConsentChannelsWhatsapp?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CommunicationConsent
*/
@Parcelize
data class CommunicationConsent(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("channels")
    var channels: CommunicationConsentChannels?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: BadRequestSchema
*/
@Parcelize
data class BadRequestSchema(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PushtokenReq
*/
@Parcelize
data class PushtokenReq(
    
    
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("bundle_identifier")
    var bundleIdentifier: String?=null,
    
    @SerializedName("push_token")
    var pushToken: String?=null,
    
    @SerializedName("unique_device_id")
    var uniqueDeviceId: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PushtokenRes
*/
@Parcelize
data class PushtokenRes(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("bundle_identifier")
    var bundleIdentifier: String?=null,
    
    @SerializedName("push_token")
    var pushToken: String?=null,
    
    @SerializedName("unique_device_id")
    var uniqueDeviceId: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("expired_at")
    var expiredAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




/*
    Model: QRCodeResp
*/
@Parcelize
data class QRCodeResp(
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("svg")
    var svg: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RedirectDevice
*/
@Parcelize
data class RedirectDevice(
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: WebRedirect
*/
@Parcelize
data class WebRedirect(
    
    
    
    @SerializedName("link")
    var link: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Redirects
*/
@Parcelize
data class Redirects(
    
    
    
    @SerializedName("ios")
    var ios: RedirectDevice?=null,
    
    @SerializedName("android")
    var android: RedirectDevice?=null,
    
    @SerializedName("web")
    var web: WebRedirect?=null,
    
    @SerializedName("force_web")
    var forceWeb: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CampaignShortLink
*/
@Parcelize
data class CampaignShortLink(
    
    
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("medium")
    var medium: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Attribution
*/
@Parcelize
data class Attribution(
    
    
    
    @SerializedName("campaign_cookie_expiry")
    var campaignCookieExpiry: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SocialMediaTags
*/
@Parcelize
data class SocialMediaTags(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("image")
    var image: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShortLinkReq
*/
@Parcelize
data class ShortLinkReq(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("hash")
    var hash: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("expire_at")
    var expireAt: String?=null,
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    
    @SerializedName("personalized")
    var personalized: Boolean?=null,
    
    @SerializedName("campaign")
    var campaign: CampaignShortLink?=null,
    
    @SerializedName("redirects")
    var redirects: Redirects?=null,
    
    @SerializedName("attribution")
    var attribution: Attribution?=null,
    
    @SerializedName("social_media_tags")
    var socialMediaTags: SocialMediaTags?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UrlInfo
*/
@Parcelize
data class UrlInfo(
    
    
    
    @SerializedName("original")
    var original: String?=null,
    
    @SerializedName("short")
    var short: String?=null,
    
    @SerializedName("hash")
    var hash: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShortLinkRes
*/
@Parcelize
data class ShortLinkRes(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("url")
    var url: UrlInfo?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("app_redirect")
    var appRedirect: Boolean?=null,
    
    @SerializedName("fallback")
    var fallback: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    
    @SerializedName("expire_at")
    var expireAt: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("personalized")
    var personalized: Boolean?=null,
    
    @SerializedName("campaign")
    var campaign: CampaignShortLink?=null,
    
    @SerializedName("redirects")
    var redirects: Redirects?=null,
    
    @SerializedName("attribution")
    var attribution: Attribution?=null,
    
    @SerializedName("social_media_tags")
    var socialMediaTags: SocialMediaTags?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShortLinkList
*/
@Parcelize
data class ShortLinkList(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ShortLinkRes>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ErrorRes
*/
@Parcelize
data class ErrorRes(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}




/*
    Model: FailedResponse
*/
@Parcelize
data class FailedResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CDN
*/
@Parcelize
data class CDN(
    
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Upload
*/
@Parcelize
data class Upload(
    
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: StartResponse
*/
@Parcelize
data class StartResponse(
    
    
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("operation")
    var operation: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("upload")
    var upload: Upload?=null,
    
    @SerializedName("cdn")
    var cdn: CDN?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StartRequest
*/
@Parcelize
data class StartRequest(
    
    
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompleteResponse
*/
@Parcelize
data class CompleteResponse(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("operation")
    var operation: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("upload")
    var upload: Upload?=null,
    
    @SerializedName("cdn")
    var cdn: CDN?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Opts
*/
@Parcelize
data class Opts(
    
    
    
    @SerializedName("attempts")
    var attempts: Int?=null,
    
    @SerializedName("timestamp")
    var timestamp: Int?=null,
    
    @SerializedName("delay")
    var delay: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CopyFileTask
*/
@Parcelize
data class CopyFileTask(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("data")
    var data: BulkRequest?=null,
    
    @SerializedName("opts")
    var opts: Opts?=null,
    
    @SerializedName("progress")
    var progress: Int?=null,
    
    @SerializedName("delay")
    var delay: Int?=null,
    
    @SerializedName("timestamp")
    var timestamp: Int?=null,
    
    @SerializedName("attempts_made")
    var attemptsMade: Int?=null,
    
    @SerializedName("stacktrace")
    var stacktrace: ArrayList<String>?=null,
    
    @SerializedName("finished_on")
    var finishedOn: Int?=null,
    
    @SerializedName("processed_on")
    var processedOn: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkUploadResponse
*/
@Parcelize
data class BulkUploadResponse(
    
    
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("task")
    var task: CopyFileTask?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ReqConfiguration
*/
@Parcelize
data class ReqConfiguration(
    
    
    
    @SerializedName("concurrency")
    var concurrency: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Destination
*/
@Parcelize
data class Destination(
    
    
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("rewrite")
    var rewrite: String?=null,
    
    @SerializedName("basepath")
    var basepath: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: BulkRequest
*/
@Parcelize
data class BulkRequest(
    
    
    
    @SerializedName("urls")
    var urls: ArrayList<String>?=null,
    
    @SerializedName("destination")
    var destination: Destination?=null,
    
    @SerializedName("configuration")
    var configuration: ReqConfiguration?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Urls
*/
@Parcelize
data class Urls(
    
    
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("signed_url")
    var signedUrl: String?=null,
    
    @SerializedName("expiry")
    var expiry: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SignUrlResponse
*/
@Parcelize
data class SignUrlResponse(
    
    
    
    @SerializedName("urls")
    var urls: ArrayList<Urls>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SignUrlRequest
*/
@Parcelize
data class SignUrlRequest(
    
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    
    @SerializedName("urls")
    var urls: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DbRecord
*/
@Parcelize
data class DbRecord(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("file_name")
    var fileName: String?=null,
    
    @SerializedName("operation")
    var operation: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("upload")
    var upload: Upload?=null,
    
    @SerializedName("cdn")
    var cdn: CDN?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BrowseResponse
*/
@Parcelize
data class BrowseResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<DbRecord>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




/*
    Model: ApplicationAboutResponse
*/
@Parcelize
data class ApplicationAboutResponse(
    
    
    
    @SerializedName("application_info")
    var applicationInfo: ApplicationInfo?=null,
    
    @SerializedName("company_info")
    var companyInfo: CompanyInfo?=null,
    
    @SerializedName("owner_info")
    var ownerInfo: OwnerInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationInfo
*/
@Parcelize
data class ApplicationInfo(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("domain")
    var domain: Domain?=null,
    
    @SerializedName("website")
    var website: ApplicationWebsite?=null,
    
    @SerializedName("cors")
    var cors: ApplicationCors?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: ApplicationMeta?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("banner")
    var banner: SecureUrl?=null,
    
    @SerializedName("logo")
    var logo: SecureUrl?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CompanyInfo
*/
@Parcelize
data class CompanyInfo(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<CompanyAboutAddress>?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OwnerInfo
*/
@Parcelize
data class OwnerInfo(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("emails")
    var emails: ArrayList<UserEmail>?=null,
    
    @SerializedName("phone_numbers")
    var phoneNumbers: ArrayList<UserPhoneNumber>?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("profile_pic")
    var profilePic: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppVersionRequest
*/
@Parcelize
data class AppVersionRequest(
    
    
    
    @SerializedName("application")
    var application: ApplicationVersionRequest?=null,
    
    @SerializedName("device")
    var device: Device?=null,
    
    @SerializedName("locale")
    var locale: String?=null,
    
    @SerializedName("timezone")
    var timezone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationVersionRequest
*/
@Parcelize
data class ApplicationVersionRequest(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("namespace")
    var namespace: String?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("version")
    var version: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Device
*/
@Parcelize
data class Device(
    
    
    
    @SerializedName("build")
    var build: Int?=null,
    
    @SerializedName("model")
    var model: String?=null,
    
    @SerializedName("os")
    var os: OS?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OS
*/
@Parcelize
data class OS(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("version")
    var version: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SupportedLanguage
*/
@Parcelize
data class SupportedLanguage(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: LanguageResponse
*/
@Parcelize
data class LanguageResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<SupportedLanguage>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AppStaffResponse
*/
@Parcelize
data class AppStaffResponse(
    
    
    
    @SerializedName("staff_users")
    var staffUsers: ArrayList<AppStaff>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AppStaffListResponse
*/
@Parcelize
data class AppStaffListResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<AppStaff>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: UpdateDialog
*/
@Parcelize
data class UpdateDialog(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("interval")
    var interval: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OrderingStoreSelectRequest
*/
@Parcelize
data class OrderingStoreSelectRequest(
    
    
    
    @SerializedName("ordering_store")
    var orderingStore: OrderingStoreSelect?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OrderingStoreSelect
*/
@Parcelize
data class OrderingStoreSelect(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AppStaff
*/
@Parcelize
data class AppStaff(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("order_incent")
    var orderIncent: Boolean?=null,
    
    @SerializedName("stores")
    var stores: ArrayList<Int>?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("user")
    var user: String?=null,
    
    @SerializedName("employee_code")
    var employeeCode: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppTokenResponse
*/
@Parcelize
data class AppTokenResponse(
    
    
    
    @SerializedName("tokens")
    var tokens: Tokens?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Tokens
*/
@Parcelize
data class Tokens(
    
    
    
    @SerializedName("firebase")
    var firebase: Firebase?=null,
    
    @SerializedName("moengage")
    var moengage: Moengage?=null,
    
    @SerializedName("segment")
    var segment: Segment?=null,
    
    @SerializedName("gtm")
    var gtm: Gtm?=null,
    
    @SerializedName("freshchat")
    var freshchat: Freshchat?=null,
    
    @SerializedName("safetynet")
    var safetynet: Safetynet?=null,
    
    @SerializedName("fynd_rewards")
    var fyndRewards: FyndRewards?=null,
    
    @SerializedName("google_map")
    var googleMap: GoogleMap?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Firebase
*/
@Parcelize
data class Firebase(
    
    
    
    @SerializedName("credentials")
    var credentials: Credentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Credentials
*/
@Parcelize
data class Credentials(
    
    
    
    @SerializedName("ios")
    var ios: Ios?=null,
    
    @SerializedName("android")
    var android: Android?=null,
    
    @SerializedName("project_id")
    private var project_id_b64: String?=null,
    
    
    @SerializedName("gcm_sender_id")
    private var gcm_sender_id_b64: String?=null,
    
    
    @SerializedName("application_id")
    private var application_id_b64: String?=null,
    
    
    @SerializedName("api_key")
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    
    
    
    
    var projectId : String
    get(){
        try{
            return String(Base64.decode(project_id_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return project_id_b64 ?: ""
        }
    }
    set(value){
        project_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
    var gcmSenderId : String
    get(){
        try{
            return String(Base64.decode(gcm_sender_id_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return gcm_sender_id_b64 ?: ""
        }
    }
    set(value){
        gcm_sender_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
    var applicationId : String
    get(){
        try{
            return String(Base64.decode(application_id_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return application_id_b64 ?: ""
        }
    }
    set(value){
        application_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
}


/*
    Model: Ios
*/
@Parcelize
data class Ios(
    
    
    
    @SerializedName("application_id")
    private var application_id_b64: String?=null,
    
    
    @SerializedName("api_key")
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var applicationId : String
    get(){
        try{
            return String(Base64.decode(application_id_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return application_id_b64 ?: ""
        }
    }
    set(value){
        application_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
}


/*
    Model: Android
*/
@Parcelize
data class Android(
    
    
    
    @SerializedName("application_id")
    private var application_id_b64: String?=null,
    
    
    @SerializedName("api_key")
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var applicationId : String
    get(){
        try{
            return String(Base64.decode(application_id_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return application_id_b64 ?: ""
        }
    }
    set(value){
        application_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
}


/*
    Model: Moengage
*/
@Parcelize
data class Moengage(
    
    
    
    @SerializedName("credentials")
    var credentials: MoengageCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: MoengageCredentials
*/
@Parcelize
data class MoengageCredentials(
    
    
    
    @SerializedName("app_id")
    private var app_id_b64: String?=null
    
    
): Parcelable {
    
    
    
    var appId : String
    get(){
        try{
            return String(Base64.decode(app_id_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return app_id_b64 ?: ""
        }
    }
    set(value){
        app_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
}


/*
    Model: Segment
*/
@Parcelize
data class Segment(
    
    
    
    @SerializedName("credentials")
    var credentials: SegmentCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SegmentCredentials
*/
@Parcelize
data class SegmentCredentials(
    
    
    
    @SerializedName("write_key")
    private var write_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var writeKey : String
    get(){
        try{
            return String(Base64.decode(write_key_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return write_key_b64 ?: ""
        }
    }
    set(value){
        write_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
}


/*
    Model: Gtm
*/
@Parcelize
data class Gtm(
    
    
    
    @SerializedName("credentials")
    var credentials: GtmCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GtmCredentials
*/
@Parcelize
data class GtmCredentials(
    
    
    
    @SerializedName("api_key")
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
}


/*
    Model: Freshchat
*/
@Parcelize
data class Freshchat(
    
    
    
    @SerializedName("credentials")
    var credentials: FreshchatCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: FreshchatCredentials
*/
@Parcelize
data class FreshchatCredentials(
    
    
    
    @SerializedName("app_id")
    private var app_id_b64: String?=null,
    
    
    @SerializedName("app_key")
    private var app_key_b64: String?=null,
    
    
    @SerializedName("web_token")
    private var web_token_b64: String?=null
    
    
): Parcelable {
    
    
    
    var appId : String
    get(){
        try{
            return String(Base64.decode(app_id_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return app_id_b64 ?: ""
        }
    }
    set(value){
        app_id_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
    var appKey : String
    get(){
        try{
            return String(Base64.decode(app_key_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return app_key_b64 ?: ""
        }
    }
    set(value){
        app_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
    var webToken : String
    get(){
        try{
            return String(Base64.decode(web_token_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return web_token_b64 ?: ""
        }
    }
    set(value){
        web_token_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
}


/*
    Model: Safetynet
*/
@Parcelize
data class Safetynet(
    
    
    
    @SerializedName("credentials")
    var credentials: SafetynetCredentials?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SafetynetCredentials
*/
@Parcelize
data class SafetynetCredentials(
    
    
    
    @SerializedName("api_key")
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
}


/*
    Model: FyndRewards
*/
@Parcelize
data class FyndRewards(
    
    
    
    @SerializedName("credentials")
    var credentials: FyndRewardsCredentials?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: FyndRewardsCredentials
*/
@Parcelize
data class FyndRewardsCredentials(
    
    
    
    @SerializedName("public_key")
    private var public_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var publicKey : String
    get(){
        try{
            return String(Base64.decode(public_key_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return public_key_b64 ?: ""
        }
    }
    set(value){
        public_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
}


/*
    Model: GoogleMap
*/
@Parcelize
data class GoogleMap(
    
    
    
    @SerializedName("credentials")
    var credentials: GoogleMapCredentials?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: GoogleMapCredentials
*/
@Parcelize
data class GoogleMapCredentials(
    
    
    
    @SerializedName("api_key")
    private var api_key_b64: String?=null
    
    
): Parcelable {
    
    
    
    var apiKey : String
    get(){
        try{
            return String(Base64.decode(api_key_b64,Base64.NO_WRAP))
        }catch(e: Exception){
            return api_key_b64 ?: ""
        }
    }
    set(value){
        api_key_b64 = Base64.encodeToString(value?.toByteArray(),Base64.NO_WRAP)
    }
    
    
    
}


/*
    Model: RewardPointsConfig
*/
@Parcelize
data class RewardPointsConfig(
    
    
    
    @SerializedName("credit")
    var credit: Credit?=null,
    
    @SerializedName("debit")
    var debit: Debit?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Credit
*/
@Parcelize
data class Credit(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: Debit
*/
@Parcelize
data class Debit(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("auto_apply")
    var autoApply: Boolean?=null,
    
    @SerializedName("strategy_channel")
    var strategyChannel: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductDetailFeature
*/
@Parcelize
data class ProductDetailFeature(
    
    
    
    @SerializedName("similar")
    var similar: ArrayList<String>?=null,
    
    @SerializedName("seller_selection")
    var sellerSelection: Boolean?=null,
    
    @SerializedName("update_product_meta")
    var updateProductMeta: Boolean?=null,
    
    @SerializedName("request_product")
    var requestProduct: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: LaunchPage
*/
@Parcelize
data class LaunchPage(
    
    
    
    @SerializedName("page_type")
    var pageType: String?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: LandingPageFeature
*/
@Parcelize
data class LandingPageFeature(
    
    
    
    @SerializedName("launch_page")
    var launchPage: LaunchPage?=null,
    
    @SerializedName("continue_as_guest")
    var continueAsGuest: Boolean?=null,
    
    @SerializedName("login_btn_text")
    var loginBtnText: String?=null,
    
    @SerializedName("show_domain_textbox")
    var showDomainTextbox: Boolean?=null,
    
    @SerializedName("show_register_btn")
    var showRegisterBtn: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RegistrationPageFeature
*/
@Parcelize
data class RegistrationPageFeature(
    
    
    
    @SerializedName("ask_store_address")
    var askStoreAddress: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AppFeature
*/
@Parcelize
data class AppFeature(
    
    
    
    @SerializedName("product_detail")
    var productDetail: ProductDetailFeature?=null,
    
    @SerializedName("landing_page")
    var landingPage: LandingPageFeature?=null,
    
    @SerializedName("registration_page")
    var registrationPage: RegistrationPageFeature?=null,
    
    @SerializedName("home_page")
    var homePage: HomePageFeature?=null,
    
    @SerializedName("common")
    var common: CommonFeature?=null,
    
    @SerializedName("cart")
    var cart: CartFeature?=null,
    
    @SerializedName("qr")
    var qr: QrFeature?=null,
    
    @SerializedName("pcr")
    var pcr: PcrFeature?=null,
    
    @SerializedName("order")
    var order: OrderFeature?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: HomePageFeature
*/
@Parcelize
data class HomePageFeature(
    
    
    
    @SerializedName("order_processing")
    var orderProcessing: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CommonFeature
*/
@Parcelize
data class CommonFeature(
    
    
    
    @SerializedName("communication_optin_dialog")
    var communicationOptinDialog: CommunicationOptinDialogFeature?=null,
    
    @SerializedName("deployment_store_selection")
    var deploymentStoreSelection: DeploymentStoreSelectionFeature?=null,
    
    @SerializedName("listing_price")
    var listingPrice: ListingPriceFeature?=null,
    
    @SerializedName("currency")
    var currency: CurrencyFeature?=null,
    
    @SerializedName("revenue_engine")
    var revenueEngine: RevenueEngineFeature?=null,
    
    @SerializedName("feedback")
    var feedback: FeedbackFeature?=null,
    
    @SerializedName("compare_products")
    var compareProducts: CompareProductsFeature?=null,
    
    @SerializedName("reward_points")
    var rewardPoints: RewardPointsConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CommunicationOptinDialogFeature
*/
@Parcelize
data class CommunicationOptinDialogFeature(
    
    
    
    @SerializedName("visibility")
    var visibility: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DeploymentStoreSelectionFeature
*/
@Parcelize
data class DeploymentStoreSelectionFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ListingPriceFeature
*/
@Parcelize
data class ListingPriceFeature(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("sort")
    var sort: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CurrencyFeature
*/
@Parcelize
data class CurrencyFeature(
    
    
    
    @SerializedName("value")
    var value: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("default_currency")
    var defaultCurrency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: RevenueEngineFeature
*/
@Parcelize
data class RevenueEngineFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: FeedbackFeature
*/
@Parcelize
data class FeedbackFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CompareProductsFeature
*/
@Parcelize
data class CompareProductsFeature(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CartFeature
*/
@Parcelize
data class CartFeature(
    
    
    
    @SerializedName("gst_input")
    var gstInput: Boolean?=null,
    
    @SerializedName("staff_selection")
    var staffSelection: Boolean?=null,
    
    @SerializedName("placing_for_customer")
    var placingForCustomer: Boolean?=null,
    
    @SerializedName("google_map")
    var googleMap: Boolean?=null,
    
    @SerializedName("revenue_engine_coupon")
    var revenueEngineCoupon: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: QrFeature
*/
@Parcelize
data class QrFeature(
    
    
    
    @SerializedName("application")
    var application: Boolean?=null,
    
    @SerializedName("products")
    var products: Boolean?=null,
    
    @SerializedName("collections")
    var collections: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PcrFeature
*/
@Parcelize
data class PcrFeature(
    
    
    
    @SerializedName("staff_selection")
    var staffSelection: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OrderFeature
*/
@Parcelize
data class OrderFeature(
    
    
    
    @SerializedName("buy_again")
    var buyAgain: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AppFeatureRequest
*/
@Parcelize
data class AppFeatureRequest(
    
    
    
    @SerializedName("feature")
    var feature: AppFeature?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: AppFeatureResponse
*/
@Parcelize
data class AppFeatureResponse(
    
    
    
    @SerializedName("feature")
    var feature: AppFeature?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UnhandledError
*/
@Parcelize
data class UnhandledError(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InvalidPayloadRequest
*/
@Parcelize
data class InvalidPayloadRequest(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: SuccessMessageResponse
*/
@Parcelize
data class SuccessMessageResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InventoryBrandRule
*/
@Parcelize
data class InventoryBrandRule(
    
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: StoreCriteriaRule
*/
@Parcelize
data class StoreCriteriaRule(
    
    
    
    @SerializedName("companies")
    var companies: ArrayList<Int>?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InventoryStoreRule
*/
@Parcelize
data class InventoryStoreRule(
    
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    
    @SerializedName("rules")
    var rules: ArrayList<StoreCriteriaRule>?=null,
    
    @SerializedName("stores")
    var stores: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InventoryPaymentConfig
*/
@Parcelize
data class InventoryPaymentConfig(
    
    
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    
    @SerializedName("source")
    var source: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: StorePriorityRule
*/
@Parcelize
data class StorePriorityRule(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("storetype_order")
    var storetypeOrder: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ArticleAssignmentRule
*/
@Parcelize
data class ArticleAssignmentRule(
    
    
    
    @SerializedName("store_priority")
    var storePriority: StorePriorityRule?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: InventoryArticleAssignment
*/
@Parcelize
data class InventoryArticleAssignment(
    
    
    
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null,
    
    @SerializedName("rules")
    var rules: ArticleAssignmentRule?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CompanyAboutAddress
*/
@Parcelize
data class CompanyAboutAddress(
    
    
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserEmail
*/
@Parcelize
data class UserEmail(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserPhoneNumber
*/
@Parcelize
data class UserPhoneNumber(
    
    
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationInformation
*/
@Parcelize
data class ApplicationInformation(
    
    
    
    @SerializedName("address")
    var address: InformationAddress?=null,
    
    @SerializedName("support")
    var support: InformationSupport?=null,
    
    @SerializedName("social_links")
    var socialLinks: SocialLinks?=null,
    
    @SerializedName("links")
    var links: Links?=null,
    
    @SerializedName("copyright_text")
    var copyrightText: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("business_highlights")
    var businessHighlights: BusinessHighlights?=null,
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InformationAddress
*/
@Parcelize
data class InformationAddress(
    
    
    
    @SerializedName("loc")
    var loc: String?=null,
    
    @SerializedName("address_line")
    var addressLine: ArrayList<String>?=null,
    
    @SerializedName("phone")
    var phone: InformationPhone?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: InformationPhone
*/
@Parcelize
data class InformationPhone(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: InformationSupport
*/
@Parcelize
data class InformationSupport(
    
    
    
    @SerializedName("phone")
    var phone: ArrayList<String>?=null,
    
    @SerializedName("email")
    var email: ArrayList<String>?=null,
    
    @SerializedName("timing")
    var timing: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SocialLinks
*/
@Parcelize
data class SocialLinks(
    
    
    
    @SerializedName("facebook")
    var facebook: FacebookLink?=null,
    
    @SerializedName("instagram")
    var instagram: InstagramLink?=null,
    
    @SerializedName("twitter")
    var twitter: TwitterLink?=null,
    
    @SerializedName("pinterest")
    var pinterest: PinterestLink?=null,
    
    @SerializedName("google_plus")
    var googlePlus: GooglePlusLink?=null,
    
    @SerializedName("youtube")
    var youtube: YoutubeLink?=null,
    
    @SerializedName("linked_in")
    var linkedIn: LinkedInLink?=null,
    
    @SerializedName("vimeo")
    var vimeo: VimeoLink?=null,
    
    @SerializedName("blog_link")
    var blogLink: BlogLink?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FacebookLink
*/
@Parcelize
data class FacebookLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: InstagramLink
*/
@Parcelize
data class InstagramLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TwitterLink
*/
@Parcelize
data class TwitterLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PinterestLink
*/
@Parcelize
data class PinterestLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: GooglePlusLink
*/
@Parcelize
data class GooglePlusLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: YoutubeLink
*/
@Parcelize
data class YoutubeLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: LinkedInLink
*/
@Parcelize
data class LinkedInLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: VimeoLink
*/
@Parcelize
data class VimeoLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: BlogLink
*/
@Parcelize
data class BlogLink(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Links
*/
@Parcelize
data class Links(
    
    
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BusinessHighlights
*/
@Parcelize
data class BusinessHighlights(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("icon")
    var icon: String?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApplicationDetail
*/
@Parcelize
data class ApplicationDetail(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("logo")
    var logo: SecureUrl?=null,
    
    @SerializedName("mobile_logo")
    var mobileLogo: SecureUrl?=null,
    
    @SerializedName("favicon")
    var favicon: SecureUrl?=null,
    
    @SerializedName("banner")
    var banner: SecureUrl?=null,
    
    @SerializedName("domain")
    var domain: Domain?=null,
    
    @SerializedName("domains")
    var domains: ArrayList<Domain>?=null,
    
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CurrenciesResponse
*/
@Parcelize
data class CurrenciesResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Currency>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DefaultCurrency
*/
@Parcelize
data class DefaultCurrency(
    
    
    
    @SerializedName("ref")
    var ref: String?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AppCurrencyResponse
*/
@Parcelize
data class AppCurrencyResponse(
    
    
    
    @SerializedName("application")
    var application: String?=null,
    
    @SerializedName("default_currency")
    var defaultCurrency: DefaultCurrency?=null,
    
    @SerializedName("supported_currency")
    var supportedCurrency: ArrayList<Currency>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: StoreLatLong
*/
@Parcelize
data class StoreLatLong(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OptedStoreAddress
*/
@Parcelize
data class OptedStoreAddress(
    
    
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("lat_long")
    var latLong: StoreLatLong?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderingStore
*/
@Parcelize
data class OrderingStore(
    
    
    
    @SerializedName("address")
    var address: OptedStoreAddress?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderingStores
*/
@Parcelize
data class OrderingStores(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<OrderingStore>?=null,
    
    @SerializedName("deployed_stores")
    var deployedStores: ArrayList<Int>?=null,
    
    @SerializedName("all_stores")
    var allStores: Boolean?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("app")
    var app: String?=null,
    
    @SerializedName("__v")
    var v: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderingStoresResponse
*/
@Parcelize
data class OrderingStoresResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<OrderingStore>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




/*
    Model: AggregatorConfigDetail
*/
@Parcelize
data class AggregatorConfigDetail(
    
    
    
    @SerializedName("merchant_key")
    var merchantKey: String?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("pin")
    var pin: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("merchant_id")
    var merchantId: String?=null,
    
    @SerializedName("sdk")
    var sdk: Boolean?=null,
    
    @SerializedName("api")
    var api: String?=null,
    
    @SerializedName("verify_api")
    var verifyApi: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AggregatorsConfigDetailResponse
*/
@Parcelize
data class AggregatorsConfigDetailResponse(
    
    
    
    @SerializedName("simpl")
    var simpl: AggregatorConfigDetail?=null,
    
    @SerializedName("rupifi")
    var rupifi: AggregatorConfigDetail?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("env")
    var env: String?=null,
    
    @SerializedName("stripe")
    var stripe: AggregatorConfigDetail?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorConfigDetail?=null,
    
    @SerializedName("payumoney")
    var payumoney: AggregatorConfigDetail?=null,
    
    @SerializedName("mswipe")
    var mswipe: AggregatorConfigDetail?=null,
    
    @SerializedName("razorpay")
    var razorpay: AggregatorConfigDetail?=null,
    
    @SerializedName("juspay")
    var juspay: AggregatorConfigDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: HttpErrorCodeAndResponse
*/
@Parcelize
data class HttpErrorCodeAndResponse(
    
    
    
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AttachCardRequest
*/
@Parcelize
data class AttachCardRequest(
    
    
    
    @SerializedName("name_on_card")
    var nameOnCard: String?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("refresh")
    var refresh: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AttachCardsResponse
*/
@Parcelize
data class AttachCardsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CardPaymentGateway
*/
@Parcelize
data class CardPaymentGateway(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("api")
    var api: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ActiveCardPaymentGatewayResponse
*/
@Parcelize
data class ActiveCardPaymentGatewayResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cards")
    var cards: CardPaymentGateway?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Card
*/
@Parcelize
data class Card(
    
    
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ListCardsResponse
*/
@Parcelize
data class ListCardsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<Card>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: DeletehCardRequest
*/
@Parcelize
data class DeletehCardRequest(
    
    
    
    @SerializedName("card_id")
    var cardId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: DeleteCardsResponse
*/
@Parcelize
data class DeleteCardsResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ValidateCustomerRequest
*/
@Parcelize
data class ValidateCustomerRequest(
    
    
    
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("merchant_params")
    var merchantParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("payload")
    var payload: String?=null,
    
    @SerializedName("order_items")
    var orderItems: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ValidateCustomerResponse
*/
@Parcelize
data class ValidateCustomerResponse(
    
    
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ChargeCustomerRequest
*/
@Parcelize
data class ChargeCustomerRequest(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("transaction_token")
    var transactionToken: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ChargeCustomerResponse
*/
@Parcelize
data class ChargeCustomerResponse(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("delivery_address_id")
    var deliveryAddressId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("upi_poll_url")
    var upiPollUrl: String?=null,
    
    @SerializedName("bqr_image")
    var bqrImage: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("virtual_id")
    var virtualId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentStatusUpdateRequest
*/
@Parcelize
data class PaymentStatusUpdateRequest(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentStatusUpdateResponse
*/
@Parcelize
data class PaymentStatusUpdateResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("retry")
    var retry: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentModeLogo
*/
@Parcelize
data class PaymentModeLogo(
    
    
    
    @SerializedName("small")
    var small: String?=null,
    
    @SerializedName("large")
    var large: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: IntentApp
*/
@Parcelize
data class IntentApp(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("package_name")
    var packageName: String?=null,
    
    @SerializedName("logos")
    var logos: PaymentModeLogo?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: IntentAppErrorList
*/
@Parcelize
data class IntentAppErrorList(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("package_name")
    var packageName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("intent_flow")
    var intentFlow: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    
    @SerializedName("compliant_with_tokenisation_guidelines")
    var compliantWithTokenisationGuidelines: Boolean?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("card_token")
    var cardToken: String?=null,
    
    @SerializedName("cod_limit_per_order")
    var codLimitPerOrder: Double?=null,
    
    @SerializedName("intent_app")
    var intentApp: ArrayList<IntentApp>?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    
    @SerializedName("intent_app_error_dict_list")
    var intentAppErrorDictList: ArrayList<IntentAppErrorList>?=null,
    
    @SerializedName("card_name")
    var cardName: String?=null,
    
    @SerializedName("card_reference")
    var cardReference: String?=null,
    
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("cod_limit")
    var codLimit: Double?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("card_number")
    var cardNumber: String?=null,
    
    @SerializedName("nickname")
    var nickname: String?=null,
    
    @SerializedName("card_type")
    var cardType: String?=null,
    
    @SerializedName("remaining_limit")
    var remainingLimit: Double?=null,
    
    @SerializedName("retry_count")
    var retryCount: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    
    @SerializedName("save_card")
    var saveCard: Boolean?=null,
    
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("is_pay_by_card_pl")
    var isPayByCardPl: Boolean?=null,
    
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AggregatorRoute
*/
@Parcelize
data class AggregatorRoute(
    
    
    
    @SerializedName("payment_flow")
    var paymentFlow: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_flow_data")
    var paymentFlowData: String?=null,
    
    @SerializedName("api_link")
    var apiLink: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentFlow
*/
@Parcelize
data class PaymentFlow(
    
    
    
    @SerializedName("simpl")
    var simpl: AggregatorRoute?=null,
    
    @SerializedName("rupifi")
    var rupifi: AggregatorRoute?=null,
    
    @SerializedName("payubiz")
    var payubiz: AggregatorRoute?=null,
    
    @SerializedName("stripe")
    var stripe: AggregatorRoute?=null,
    
    @SerializedName("epaylater")
    var epaylater: AggregatorRoute?=null,
    
    @SerializedName("jiopay")
    var jiopay: AggregatorRoute?=null,
    
    @SerializedName("bqr_razorpay")
    var bqrRazorpay: AggregatorRoute?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorRoute?=null,
    
    @SerializedName("mswipe")
    var mswipe: AggregatorRoute?=null,
    
    @SerializedName("upi_razorpay")
    var upiRazorpay: AggregatorRoute?=null,
    
    @SerializedName("fynd")
    var fynd: AggregatorRoute?=null,
    
    @SerializedName("razorpay")
    var razorpay: AggregatorRoute?=null,
    
    @SerializedName("juspay")
    var juspay: AggregatorRoute?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentOptionAndFlow
*/
@Parcelize
data class PaymentOptionAndFlow(
    
    
    
    @SerializedName("payment_option")
    var paymentOption: ArrayList<RootPaymentMode>?=null,
    
    @SerializedName("payment_flows")
    var paymentFlows: PaymentFlow?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PaymentModeRouteResponse
*/
@Parcelize
data class PaymentModeRouteResponse(
    
    
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptionAndFlow?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RupifiBannerData
*/
@Parcelize
data class RupifiBannerData(
    
    
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("kyc_url")
    var kycUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RupifiBannerResponse
*/
@Parcelize
data class RupifiBannerResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: RupifiBannerData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EpaylaterBannerData
*/
@Parcelize
data class EpaylaterBannerData(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("display")
    var display: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: EpaylaterBannerResponse
*/
@Parcelize
data class EpaylaterBannerResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: EpaylaterBannerData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ResendOrCancelPaymentRequest
*/
@Parcelize
data class ResendOrCancelPaymentRequest(
    
    
    
    @SerializedName("request_type")
    var requestType: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: LinkStatus
*/
@Parcelize
data class LinkStatus(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ResendOrCancelPaymentResponse
*/
@Parcelize
data class ResendOrCancelPaymentResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: LinkStatus?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TransferItemsDetails
*/
@Parcelize
data class TransferItemsDetails(
    
    
    
    @SerializedName("logo_large")
    var logoLarge: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo_small")
    var logoSmall: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TransferModeDetails
*/
@Parcelize
data class TransferModeDetails(
    
    
    
    @SerializedName("items")
    var items: ArrayList<TransferItemsDetails>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TransferModeResponse
*/
@Parcelize
data class TransferModeResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<TransferModeDetails>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: UpdateRefundTransferModeRequest
*/
@Parcelize
data class UpdateRefundTransferModeRequest(
    
    
    
    @SerializedName("enable")
    var enable: Boolean?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: UpdateRefundTransferModeResponse
*/
@Parcelize
data class UpdateRefundTransferModeResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderBeneficiaryResponse
*/
@Parcelize
data class OrderBeneficiaryResponse(
    
    
    
    @SerializedName("show_beneficiary_details")
    var showBeneficiaryDetails: Boolean?=null,
    
    @SerializedName("beneficiaries")
    var beneficiaries: ArrayList<OrderBeneficiaryDetails>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: NotFoundResourceError
*/
@Parcelize
data class NotFoundResourceError(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: IfscCodeResponse
*/
@Parcelize
data class IfscCodeResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AddBeneficiaryViaOtpVerificationRequest
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationRequest(
    
    
    
    @SerializedName("otp")
    var otp: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("hash_key")
    var hashKey: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: AddBeneficiaryViaOtpVerificationResponse
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: WrongOtpError
*/
@Parcelize
data class WrongOtpError(
    
    
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("description")
    var description: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: BeneficiaryModeDetails
*/
@Parcelize
data class BeneficiaryModeDetails(
    
    
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("wallet")
    var wallet: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AddBeneficiaryDetailsRequest
*/
@Parcelize
data class AddBeneficiaryDetailsRequest(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("details")
    var details: BeneficiaryModeDetails?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("delights")
    var delights: Boolean?=null,
    
    @SerializedName("otp")
    var otp: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RefundAccountResponse
*/
@Parcelize
data class RefundAccountResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BankDetailsForOTP
*/
@Parcelize
data class BankDetailsForOTP(
    
    
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AddBeneficiaryDetailsOTPRequest
*/
@Parcelize
data class AddBeneficiaryDetailsOTPRequest(
    
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("details")
    var details: BankDetailsForOTP?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: WalletOtpRequest
*/
@Parcelize
data class WalletOtpRequest(
    
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: WalletOtpResponse
*/
@Parcelize
data class WalletOtpResponse(
    
    
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: SetDefaultBeneficiaryRequest
*/
@Parcelize
data class SetDefaultBeneficiaryRequest(
    
    
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: SetDefaultBeneficiaryResponse
*/
@Parcelize
data class SetDefaultBeneficiaryResponse(
    
    
    
    @SerializedName("is_beneficiary_set")
    var isBeneficiarySet: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetPaymentLinkResponse
*/
@Parcelize
data class GetPaymentLinkResponse(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("payment_link_current_status")
    var paymentLinkCurrentStatus: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ErrorDescription
*/
@Parcelize
data class ErrorDescription(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("expired")
    var expired: Boolean?=null,
    
    @SerializedName("invalid_id")
    var invalidId: Boolean?=null,
    
    @SerializedName("merchant_name")
    var merchantName: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Boolean?=null,
    
    @SerializedName("msg")
    var msg: String?=null,
    
    @SerializedName("payment_transaction_id")
    var paymentTransactionId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreatePaymentLinkMeta
*/
@Parcelize
data class CreatePaymentLinkMeta(
    
    
    
    @SerializedName("amount")
    var amount: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("assign_card_id")
    var assignCardId: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreatePaymentLinkRequest
*/
@Parcelize
data class CreatePaymentLinkRequest(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("external_order_id")
    var externalOrderId: String?=null,
    
    @SerializedName("mobile_number")
    var mobileNumber: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("meta")
    var meta: CreatePaymentLinkMeta?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreatePaymentLinkResponse
*/
@Parcelize
data class CreatePaymentLinkResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_link_url")
    var paymentLinkUrl: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CancelOrResendPaymentLinkRequest
*/
@Parcelize
data class CancelOrResendPaymentLinkRequest(
    
    
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ResendPaymentLinkResponse
*/
@Parcelize
data class ResendPaymentLinkResponse(
    
    
    
    @SerializedName("polling_timeout")
    var pollingTimeout: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CancelPaymentLinkResponse
*/
@Parcelize
data class CancelPaymentLinkResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PollingPaymentLinkResponse
*/
@Parcelize
data class PollingPaymentLinkResponse(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("http_status")
    var httpStatus: Int?=null,
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PaymentMethodsMeta
*/
@Parcelize
data class PaymentMethodsMeta(
    
    
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_gateway")
    var paymentGateway: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateOrderUserPaymentMethods
*/
@Parcelize
data class CreateOrderUserPaymentMethods(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("meta")
    var meta: PaymentMethodsMeta?=null,
    
    @SerializedName("mode")
    var mode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateOrderUserRequest
*/
@Parcelize
data class CreateOrderUserRequest(
    
    
    
    @SerializedName("failure_callback_url")
    var failureCallbackUrl: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("payment_link_id")
    var paymentLinkId: String?=null,
    
    @SerializedName("payment_methods")
    var paymentMethods: CreateOrderUserPaymentMethods?=null,
    
    @SerializedName("success_callback_url")
    var successCallbackUrl: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateOrderUserData
*/
@Parcelize
data class CreateOrderUserData(
    
    
    
    @SerializedName("amount")
    var amount: Double?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreateOrderUserResponse
*/
@Parcelize
data class CreateOrderUserResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("status_code")
    var statusCode: Int?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("payment_confirm_url")
    var paymentConfirmUrl: String?=null,
    
    @SerializedName("data")
    var data: CreateOrderUserData?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BalanceDetails
*/
@Parcelize
data class BalanceDetails(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("formatted_value")
    var formattedValue: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CreditSummary
*/
@Parcelize
data class CreditSummary(
    
    
    
    @SerializedName("balance")
    var balance: BalanceDetails?=null,
    
    @SerializedName("status_message")
    var statusMessage: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("merchant_customer_ref_id")
    var merchantCustomerRefId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CustomerCreditSummaryResponse
*/
@Parcelize
data class CustomerCreditSummaryResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: CreditSummary?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RedirectURL
*/
@Parcelize
data class RedirectURL(
    
    
    
    @SerializedName("signup_url")
    var signupUrl: String?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RedirectToAggregatorResponse
*/
@Parcelize
data class RedirectToAggregatorResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: RedirectURL?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: CreditDetail
*/
@Parcelize
data class CreditDetail(
    
    
    
    @SerializedName("signup_url")
    var signupUrl: String?=null,
    
    @SerializedName("is_registered")
    var isRegistered: Boolean?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CheckCreditResponse
*/
@Parcelize
data class CheckCreditResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: CreditDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: KYCAddress
*/
@Parcelize
data class KYCAddress(
    
    
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("land_mark")
    var landMark: String?=null,
    
    @SerializedName("addressline2")
    var addressline2: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("ownership_type")
    var ownershipType: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("addressline1")
    var addressline1: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserPersonalInfoInDetails
*/
@Parcelize
data class UserPersonalInfoInDetails(
    
    
    
    @SerializedName("mobile_verified")
    var mobileVerified: Boolean?=null,
    
    @SerializedName("gender")
    var gender: String?=null,
    
    @SerializedName("email_verified")
    var emailVerified: Boolean?=null,
    
    @SerializedName("passport")
    var passport: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("driving_license")
    var drivingLicense: String?=null,
    
    @SerializedName("fathers_name")
    var fathersName: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("address_as_per_id")
    var addressAsPerId: KYCAddress?=null,
    
    @SerializedName("mothers_name")
    var mothersName: String?=null,
    
    @SerializedName("voter_id")
    var voterId: String?=null,
    
    @SerializedName("dob")
    var dob: String?=null,
    
    @SerializedName("middle_name")
    var middleName: String?=null,
    
    @SerializedName("pan")
    var pan: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BusinessDetails
*/
@Parcelize
data class BusinessDetails(
    
    
    
    @SerializedName("fssai")
    var fssai: String?=null,
    
    @SerializedName("address")
    var address: KYCAddress?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null,
    
    @SerializedName("fda")
    var fda: String?=null,
    
    @SerializedName("vintage")
    var vintage: String?=null,
    
    @SerializedName("shop_and_establishment")
    var shopAndEstablishment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("business_ownership_type")
    var businessOwnershipType: String?=null,
    
    @SerializedName("pan")
    var pan: String?=null,
    
    @SerializedName("entity_type")
    var entityType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DeviceDetails
*/
@Parcelize
data class DeviceDetails(
    
    
    
    @SerializedName("device_model")
    var deviceModel: String?=null,
    
    @SerializedName("device_make")
    var deviceMake: String?=null,
    
    @SerializedName("device_type")
    var deviceType: String?=null,
    
    @SerializedName("identification_number")
    var identificationNumber: String?=null,
    
    @SerializedName("identifier_type")
    var identifierType: String?=null,
    
    @SerializedName("os_version")
    var osVersion: String?=null,
    
    @SerializedName("os")
    var os: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: MarketplaceInfo
*/
@Parcelize
data class MarketplaceInfo(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("date_of_joining")
    var dateOfJoining: String?=null,
    
    @SerializedName("membership_id")
    var membershipId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CustomerOnboardingRequest
*/
@Parcelize
data class CustomerOnboardingRequest(
    
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("personal_info")
    var personalInfo: UserPersonalInfoInDetails?=null,
    
    @SerializedName("mcc")
    var mcc: String?=null,
    
    @SerializedName("business_info")
    var businessInfo: BusinessDetails?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("device")
    var device: DeviceDetails?=null,
    
    @SerializedName("marketplace_info")
    var marketplaceInfo: MarketplaceInfo?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OnboardSummary
*/
@Parcelize
data class OnboardSummary(
    
    
    
    @SerializedName("redirect_url")
    var redirectUrl: String?=null,
    
    @SerializedName("session")
    var session: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CustomerOnboardingResponse
*/
@Parcelize
data class CustomerOnboardingResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: OnboardSummary?=null
    
): Parcelable {
    
    
    
    
    
    
    
}




/*
    Model: OrderPage
*/
@Parcelize
data class OrderPage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Prices
*/
@Parcelize
data class Prices(
    
    
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentTotalDetails
*/
@Parcelize
data class ShipmentTotalDetails(
    
    
    
    @SerializedName("sizes")
    var sizes: Int?=null,
    
    @SerializedName("total_price")
    var totalPrice: Double?=null,
    
    @SerializedName("pieces")
    var pieces: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TimeStampData
*/
@Parcelize
data class TimeStampData(
    
    
    
    @SerializedName("max")
    var max: String?=null,
    
    @SerializedName("min")
    var min: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Promise
*/
@Parcelize
data class Promise(
    
    
    
    @SerializedName("timestamp")
    var timestamp: TimeStampData?=null,
    
    @SerializedName("show_promise")
    var showPromise: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DeliveryAddress
*/
@Parcelize
data class DeliveryAddress(
    
    
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address_category")
    var addressCategory: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("version")
    var version: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: FulfillingStore
*/
@Parcelize
data class FulfillingStore(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BreakupValues
*/
@Parcelize
data class BreakupValues(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: Invoice
*/
@Parcelize
data class Invoice(
    
    
    
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    
    @SerializedName("label_url")
    var labelUrl: String?=null,
    
    @SerializedName("updated_date")
    var updatedDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: FulfillingCompany
*/
@Parcelize
data class FulfillingCompany(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShipmentPayment
*/
@Parcelize
data class ShipmentPayment(
    
    
    
    @SerializedName("mode")
    var mode: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("mop")
    var mop: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: CurrentStatus
*/
@Parcelize
data class CurrentStatus(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("journey_type")
    var journeyType: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ItemBrand
*/
@Parcelize
data class ItemBrand(
    
    
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Item
*/
@Parcelize
data class Item(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("id")
    var id: Double?=null,
    
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("brand")
    var brand: ItemBrand?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Identifiers
*/
@Parcelize
data class Identifiers(
    
    
    
    @SerializedName("ean")
    var ean: String?=null,
    
    @SerializedName("sku_code")
    var skuCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: FinancialBreakup
*/
@Parcelize
data class FinancialBreakup(
    
    
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    
    @SerializedName("cashback")
    var cashback: Double?=null,
    
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    
    @SerializedName("gst_fee")
    var gstFee: Double?=null,
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("item_name")
    var itemName: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: Identifiers?=null,
    
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AppliedPromos
*/
@Parcelize
data class AppliedPromos(
    
    
    
    @SerializedName("article_quantity")
    var articleQuantity: Double?=null,
    
    @SerializedName("applied_free_articles")
    var appliedFreeArticles: ArrayList<AppliedFreeArticles>?=null,
    
    @SerializedName("promotion_type")
    var promotionType: String?=null,
    
    @SerializedName("mrp_promotion")
    var mrpPromotion: Boolean?=null,
    
    @SerializedName("promo_id")
    var promoId: String?=null,
    
    @SerializedName("promotion_name")
    var promotionName: String?=null,
    
    @SerializedName("amount")
    var amount: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Bags
*/
@Parcelize
data class Bags(
    
    
    
    @SerializedName("returnable_date")
    var returnableDate: String?=null,
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("current_status")
    var currentStatus: CurrentStatus?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("parent_promo_bags")
    var parentPromoBags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("delivery_date")
    var deliveryDate: String?=null,
    
    @SerializedName("item")
    var item: Item?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("applied_promos")
    var appliedPromos: ArrayList<AppliedPromos>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentUserInfo
*/
@Parcelize
data class ShipmentUserInfo(
    
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("first_name")
    var firstName: String?=null,
    
    @SerializedName("last_name")
    var lastName: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: NestedTrackingDetails
*/
@Parcelize
data class NestedTrackingDetails(
    
    
    
    @SerializedName("time")
    var time: String?=null,
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null,
    
    @SerializedName("is_passed")
    var isPassed: Boolean?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TrackingDetails
*/
@Parcelize
data class TrackingDetails(
    
    
    
    @SerializedName("time")
    var time: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("tracking_details")
    var trackingDetails: ArrayList<NestedTrackingDetails>?=null,
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null,
    
    @SerializedName("is_passed")
    var isPassed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentStatus
*/
@Parcelize
data class ShipmentStatus(
    
    
    
    @SerializedName("hex_code")
    var hexCode: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Shipments
*/
@Parcelize
data class Shipments(
    
    
    
    @SerializedName("prices")
    var prices: Prices?=null,
    
    @SerializedName("total_details")
    var totalDetails: ShipmentTotalDetails?=null,
    
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: String?=null,
    
    @SerializedName("delivery_date")
    var deliveryDate: String?=null,
    
    @SerializedName("promise")
    var promise: Promise?=null,
    
    @SerializedName("can_break")
    var canBreak: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: DeliveryAddress?=null,
    
    @SerializedName("traking_no")
    var trakingNo: String?=null,
    
    @SerializedName("custom_meta")
    var customMeta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<BreakupValues>?=null,
    
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    
    @SerializedName("invoice")
    var invoice: Invoice?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("show_download_invoice")
    var showDownloadInvoice: Boolean?=null,
    
    @SerializedName("refund_details")
    var refundDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("beneficiary_details")
    var beneficiaryDetails: Boolean?=null,
    
    @SerializedName("size_info")
    var sizeInfo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("track_url")
    var trackUrl: String?=null,
    
    @SerializedName("need_help_url")
    var needHelpUrl: String?=null,
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("fulfilling_company")
    var fulfillingCompany: FulfillingCompany?=null,
    
    @SerializedName("payment")
    var payment: ShipmentPayment?=null,
    
    @SerializedName("returnable_date")
    var returnableDate: String?=null,
    
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    
    @SerializedName("bags")
    var bags: ArrayList<Bags>?=null,
    
    @SerializedName("awb_no")
    var awbNo: String?=null,
    
    @SerializedName("user_info")
    var userInfo: ShipmentUserInfo?=null,
    
    @SerializedName("tracking_details")
    var trackingDetails: ArrayList<TrackingDetails>?=null,
    
    @SerializedName("shipment_status")
    var shipmentStatus: ShipmentStatus?=null,
    
    @SerializedName("dp_name")
    var dpName: String?=null,
    
    @SerializedName("show_track_link")
    var showTrackLink: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("gender")
    var gender: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: BagsForReorderArticleAssignment
*/
@Parcelize
data class BagsForReorderArticleAssignment(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BagsForReorder
*/
@Parcelize
data class BagsForReorder(
    
    
    
    @SerializedName("item_size")
    var itemSize: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: BagsForReorderArticleAssignment?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderSchema
*/
@Parcelize
data class OrderSchema(
    
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<Shipments>?=null,
    
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    
    @SerializedName("user_info")
    var userInfo: UserInfo?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    
    @SerializedName("bags_for_reorder")
    var bagsForReorder: ArrayList<BagsForReorder>?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<BreakupValues>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderStatuses
*/
@Parcelize
data class OrderStatuses(
    
    
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderFilters
*/
@Parcelize
data class OrderFilters(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<OrderStatuses>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: OrderList
*/
@Parcelize
data class OrderList(
    
    
    
    @SerializedName("page")
    var page: OrderPage?=null,
    
    @SerializedName("items")
    var items: ArrayList<OrderSchema>?=null,
    
    @SerializedName("filters")
    var filters: OrderFilters?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ApefaceApiError
*/
@Parcelize
data class ApefaceApiError(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OrderById
*/
@Parcelize
data class OrderById(
    
    
    
    @SerializedName("order")
    var order: OrderSchema?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ShipmentById
*/
@Parcelize
data class ShipmentById(
    
    
    
    @SerializedName("shipment")
    var shipment: Shipments?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ResponseGetInvoiceShipment
*/
@Parcelize
data class ResponseGetInvoiceShipment(
    
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("presigned_type")
    var presignedType: String?=null,
    
    @SerializedName("presigned_url")
    var presignedUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Track
*/
@Parcelize
data class Track(
    
    
    
    @SerializedName("account_name")
    var accountName: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("awb")
    var awb: String?=null,
    
    @SerializedName("last_location_recieved_at")
    var lastLocationRecievedAt: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("reason")
    var reason: String?=null,
    
    @SerializedName("updated_time")
    var updatedTime: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentTrack
*/
@Parcelize
data class ShipmentTrack(
    
    
    
    @SerializedName("results")
    var results: ArrayList<Track>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CustomerDetailsResponse
*/
@Parcelize
data class CustomerDetailsResponse(
    
    
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: SendOtpToCustomerResponse
*/
@Parcelize
data class SendOtpToCustomerResponse(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("resend_timer")
    var resendTimer: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: VerifyOtp
*/
@Parcelize
data class VerifyOtp(
    
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    
    @SerializedName("otp_code")
    var otpCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: VerifyOtpResponse
*/
@Parcelize
data class VerifyOtpResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: QuestionSet
*/
@Parcelize
data class QuestionSet(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: BagReasonMeta
*/
@Parcelize
data class BagReasonMeta(
    
    
    
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: BagReasons
*/
@Parcelize
data class BagReasons(
    
    
    
    @SerializedName("qc_type")
    var qcType: ArrayList<String>?=null,
    
    @SerializedName("reasons")
    var reasons: ArrayList<BagReasons>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("question_set")
    var questionSet: ArrayList<QuestionSet>?=null,
    
    @SerializedName("meta")
    var meta: BagReasonMeta?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentBagReasons
*/
@Parcelize
data class ShipmentBagReasons(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("reasons")
    var reasons: ArrayList<BagReasons>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShipmentReason
*/
@Parcelize
data class ShipmentReason(
    
    
    
    @SerializedName("flow")
    var flow: String?=null,
    
    @SerializedName("feedback_type")
    var feedbackType: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    
    @SerializedName("reason_id")
    var reasonId: Int?=null,
    
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShipmentReasons
*/
@Parcelize
data class ShipmentReasons(
    
    
    
    @SerializedName("reasons")
    var reasons: ArrayList<ShipmentReason>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ProductsDataUpdatesFilters
*/
@Parcelize
data class ProductsDataUpdatesFilters(
    
    
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductsDataUpdates
*/
@Parcelize
data class ProductsDataUpdates(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<ProductsDataUpdatesFilters>?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntitiesDataUpdates
*/
@Parcelize
data class EntitiesDataUpdates(
    
    
    
    @SerializedName("filters")
    var filters: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: DataUpdates
*/
@Parcelize
data class DataUpdates(
    
    
    
    @SerializedName("products")
    var products: ArrayList<ProductsDataUpdates>?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<EntitiesDataUpdates>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: Products
*/
@Parcelize
data class Products(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductsReasonsFilters
*/
@Parcelize
data class ProductsReasonsFilters(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("line_number")
    var lineNumber: Int?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: ProductsReasonsData
*/
@Parcelize
data class ProductsReasonsData(
    
    
    
    @SerializedName("reason_id")
    var reasonId: Int?=null,
    
    @SerializedName("reason_text")
    var reasonText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ProductsReasons
*/
@Parcelize
data class ProductsReasons(
    
    
    
    @SerializedName("filters")
    var filters: ArrayList<ProductsReasonsFilters>?=null,
    
    @SerializedName("data")
    var data: ProductsReasonsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntityReasonData
*/
@Parcelize
data class EntityReasonData(
    
    
    
    @SerializedName("reason_id")
    var reasonId: Int?=null,
    
    @SerializedName("reason_text")
    var reasonText: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: EntitiesReasons
*/
@Parcelize
data class EntitiesReasons(
    
    
    
    @SerializedName("filters")
    var filters: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("data")
    var data: EntityReasonData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ReasonsData
*/
@Parcelize
data class ReasonsData(
    
    
    
    @SerializedName("products")
    var products: ArrayList<ProductsReasons>?=null,
    
    @SerializedName("entities")
    var entities: ArrayList<EntitiesReasons>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: ShipmentsRequest
*/
@Parcelize
data class ShipmentsRequest(
    
    
    
    @SerializedName("data_updates")
    var dataUpdates: DataUpdates?=null,
    
    @SerializedName("products")
    var products: ArrayList<Products>?=null,
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("reasons")
    var reasons: ReasonsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StatuesRequest
*/
@Parcelize
data class StatuesRequest(
    
    
    
    @SerializedName("exclude_bags_next_state")
    var excludeBagsNextState: String?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentsRequest>?=null,
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: UpdateShipmentStatusRequest
*/
@Parcelize
data class UpdateShipmentStatusRequest(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<StatuesRequest>?=null,
    
    @SerializedName("lock_after_transition")
    var lockAfterTransition: Boolean?=null,
    
    @SerializedName("task")
    var task: Boolean?=null,
    
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null,
    
    @SerializedName("unlock_before_transition")
    var unlockBeforeTransition: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: StatusesBodyResponse
*/
@Parcelize
data class StatusesBodyResponse(
    
    
    
    @SerializedName("shipments")
    var shipments: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ShipmentApplicationStatusResponse
*/
@Parcelize
data class ShipmentApplicationStatusResponse(
    
    
    
    @SerializedName("statuses")
    var statuses: ArrayList<StatusesBodyResponse>?=null
    
): Parcelable {
    
    
    
    
    
}




/*
    Model: RewardsArticle
*/
@Parcelize
data class RewardsArticle(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("points")
    var points: Double?=null,
    
    @SerializedName("price")
    var price: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: CatalogueOrderResponse
*/
@Parcelize
data class CatalogueOrderResponse(
    
    
    
    @SerializedName("articles")
    var articles: ArrayList<RewardsArticle>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: CatalogueOrderRequest
*/
@Parcelize
data class CatalogueOrderRequest(
    
    
    
    @SerializedName("articles")
    var articles: ArrayList<RewardsArticle>?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: PointsResponse
*/
@Parcelize
data class PointsResponse(
    
    
    
    @SerializedName("points")
    var points: Double?=null
    
): Parcelable {
    
    
    
    
    
}


/*
    Model: ReferralDetailsUser
*/
@Parcelize
data class ReferralDetailsUser(
    
    
    
    @SerializedName("blocked")
    var blocked: Boolean?=null,
    
    @SerializedName("points")
    var points: Double?=null,
    
    @SerializedName("redeemed")
    var redeemed: Boolean?=null,
    
    @SerializedName("referral_code")
    var referralCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Offer
*/
@Parcelize
data class Offer(
    
    
    
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("banner_image")
    var bannerImage: Asset?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("rule")
    var rule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("share")
    var share: ShareMessages?=null,
    
    @SerializedName("sub_text")
    var subText: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("updated_by")
    var updatedBy: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("cron")
    var cron: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: Error
*/
@Parcelize
data class Error(
    
    
    
    @SerializedName("code")
    var code: Int?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("info")
    var info: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ShareMessages
*/
@Parcelize
data class ShareMessages(
    
    
    
    @SerializedName("email")
    var email: Int?=null,
    
    @SerializedName("facebook")
    var facebook: String?=null,
    
    @SerializedName("fallback")
    var fallback: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("messenger")
    var messenger: String?=null,
    
    @SerializedName("sms")
    var sms: String?=null,
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("twitter")
    var twitter: String?=null,
    
    @SerializedName("whatsapp")
    var whatsapp: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: ReferralDetailsResponse
*/
@Parcelize
data class ReferralDetailsResponse(
    
    
    
    @SerializedName("referral")
    var referral: Offer?=null,
    
    @SerializedName("share")
    var share: ShareMessages?=null,
    
    @SerializedName("user")
    var user: ReferralDetailsUser?=null,
    
    @SerializedName("referrer_info")
    var referrerInfo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderDiscountRequest
*/
@Parcelize
data class OrderDiscountRequest(
    
    
    
    @SerializedName("order_amount")
    var orderAmount: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: OrderDiscountRuleBucket
*/
@Parcelize
data class OrderDiscountRuleBucket(
    
    
    
    @SerializedName("high")
    var high: Double?=null,
    
    @SerializedName("low")
    var low: Double?=null,
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("value_type")
    var valueType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: DiscountProperties
*/
@Parcelize
data class DiscountProperties(
    
    
    
    @SerializedName("absolute")
    var absolute: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("display_absolute")
    var displayAbsolute: String?=null,
    
    @SerializedName("display_percent")
    var displayPercent: String?=null,
    
    @SerializedName("percent")
    var percent: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: OrderDiscountResponse
*/
@Parcelize
data class OrderDiscountResponse(
    
    
    
    @SerializedName("order_amount")
    var orderAmount: Double?=null,
    
    @SerializedName("points")
    var points: Double?=null,
    
    @SerializedName("discount")
    var discount: DiscountProperties?=null,
    
    @SerializedName("base_discount")
    var baseDiscount: DiscountProperties?=null,
    
    @SerializedName("applied_rule_bucket")
    var appliedRuleBucket: OrderDiscountRuleBucket?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: RedeemReferralCodeRequest
*/
@Parcelize
data class RedeemReferralCodeRequest(
    
    
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    
    @SerializedName("referral_code")
    var referralCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: RedeemReferralCodeResponse
*/
@Parcelize
data class RedeemReferralCodeResponse(
    
    
    
    @SerializedName("redeemed")
    var redeemed: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("referrer_info")
    var referrerInfo: String?=null,
    
    @SerializedName("referrer_id")
    var referrerId: String?=null,
    
    @SerializedName("points")
    var points: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PointsHistoryResponse
*/
@Parcelize
data class PointsHistoryResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<PointsHistory>?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PointsHistory
*/
@Parcelize
data class PointsHistory(
    
    
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    
    @SerializedName("claimed")
    var claimed: Boolean?=null,
    
    @SerializedName("created_at")
    var createdAt: String?=null,
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("points")
    var points: Double?=null,
    
    @SerializedName("remaining_points")
    var remainingPoints: Double?=null,
    
    @SerializedName("text_1")
    var text1: String?=null,
    
    @SerializedName("text_2")
    var text2: String?=null,
    
    @SerializedName("text_3")
    var text3: String?=null,
    
    @SerializedName("txn_name")
    var txnName: String?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
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
    Model: CartPosCheckoutDetailRequest
*/
@Parcelize
data class CartPosCheckoutDetailRequest(
    
    
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("staff")
    var staff: StaffCheckout?=null,
    
    @SerializedName("custom_meta")
    var customMeta: ArrayList<CartCheckoutCustomMeta>?=null,
    
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("address_id")
    var addressId: String?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("order_type")
    var orderType: String?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: String?=null,
    
    @SerializedName("files")
    var files: ArrayList<Files>?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null
    
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
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("phone")
    var phone: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null
    
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
    Model: PincodeErrorSchemaResponse
*/
@Parcelize
data class PincodeErrorSchemaResponse(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: PincodeParentsResponse
*/
@Parcelize
data class PincodeParentsResponse(
    
    
    
    @SerializedName("sub_type")
    var subType: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PincodeMetaResponse
*/
@Parcelize
data class PincodeMetaResponse(
    
    
    
    @SerializedName("internal_zone_id")
    var internalZoneId: Int?=null,
    
    @SerializedName("zone")
    var zone: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: PincodeDataResponse
*/
@Parcelize
data class PincodeDataResponse(
    
    
    
    @SerializedName("parents")
    var parents: ArrayList<PincodeParentsResponse>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("meta")
    var meta: PincodeMetaResponse?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResponse?=null,
    
    @SerializedName("sub_type")
    var subType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: PincodeApiResponse
*/
@Parcelize
data class PincodeApiResponse(
    
    
    
    @SerializedName("error")
    var error: PincodeErrorSchemaResponse?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<PincodeDataResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATCategoryRequest
*/
@Parcelize
data class TATCategoryRequest(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TATArticlesRequest
*/
@Parcelize
data class TATArticlesRequest(
    
    
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATLocationDetailsRequest
*/
@Parcelize
data class TATLocationDetailsRequest(
    
    
    
    @SerializedName("articles")
    var articles: ArrayList<TATArticlesRequest>?=null,
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATViewRequest
*/
@Parcelize
data class TATViewRequest(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<TATLocationDetailsRequest>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATErrorSchemaResponse
*/
@Parcelize
data class TATErrorSchemaResponse(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATTimestampResponse
*/
@Parcelize
data class TATTimestampResponse(
    
    
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TATFormattedResponse
*/
@Parcelize
data class TATFormattedResponse(
    
    
    
    @SerializedName("min")
    var min: String?=null,
    
    @SerializedName("max")
    var max: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TATPromiseResponse
*/
@Parcelize
data class TATPromiseResponse(
    
    
    
    @SerializedName("timestamp")
    var timestamp: TATTimestampResponse?=null,
    
    @SerializedName("formatted")
    var formatted: TATFormattedResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: TATArticlesResponse
*/
@Parcelize
data class TATArticlesResponse(
    
    
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("_manufacturing_time_seconds")
    var manufacturingTimeSeconds: Int?=null,
    
    @SerializedName("error")
    var error: TATErrorSchemaResponse?=null,
    
    @SerializedName("category")
    var category: TATCategoryRequest?=null,
    
    @SerializedName("promise")
    var promise: TATPromiseResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATLocationDetailsResponse
*/
@Parcelize
data class TATLocationDetailsResponse(
    
    
    
    @SerializedName("articles")
    var articles: ArrayList<TATArticlesResponse>?=null,
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}


/*
    Model: TATViewResponse
*/
@Parcelize
data class TATViewResponse(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    
    @SerializedName("source")
    var source: String?=null,
    
    @SerializedName("to_city")
    var toCity: String?=null,
    
    @SerializedName("is_cod_available")
    var isCodAvailable: Boolean?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("journey")
    var journey: String?=null,
    
    @SerializedName("error")
    var error: TATErrorSchemaResponse?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("location_details")
    var locationDetails: ArrayList<TATLocationDetailsResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: GetZoneFromPincodeViewRequest
*/
@Parcelize
data class GetZoneFromPincodeViewRequest(
    
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("country")
    var country: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: GetZoneFromPincodeViewResponse
*/
@Parcelize
data class GetZoneFromPincodeViewResponse(
    
    
    
    @SerializedName("zones")
    var zones: ArrayList<String>?=null,
    
    @SerializedName("serviceability_type")
    var serviceabilityType: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}


/*
    Model: AssignStoreRequest
*/
@Parcelize
data class AssignStoreRequest(
    
    
    
    @SerializedName("identifier")
    var identifier: String?=null,
    
    @SerializedName("application_config")
    var applicationConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("extension_config")
    var extensionConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("customer_details")
    var customerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


/*
    Model: AssignStoreResponse
*/
@Parcelize
data class AssignStoreResponse(
    
    
    
    @SerializedName("assigned_stores")
    var assignedStores: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("article")
    var article: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company")
    var company: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("articles")
    var articles: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("customer_details")
    var customerDetails: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    
    @SerializedName("pystormbreaker_uuid")
    var pystormbreakerUuid: String?=null,
    
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    
    @SerializedName("store")
    var store: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


