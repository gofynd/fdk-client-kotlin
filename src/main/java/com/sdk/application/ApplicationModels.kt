package com.sdk.application

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import com.google.gson.annotations.SerializedName


/*
    Model: Media
*/
@Parcelize
data class Media(
    
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: ProductListingAction
*/
@Parcelize
data class ProductListingAction(
    
    
    @SerializedName("page")
    var page: ProductListingActionPage?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable


/*
    Model: ProductDetailAttribute
*/
@Parcelize
data class ProductDetailAttribute(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: ProductDetailGroupedAttribute
*/
@Parcelize
data class ProductDetailGroupedAttribute(
    
    
    @SerializedName("details")
    var details: ArrayList<ProductDetailAttribute>?=null,
    @SerializedName("title")
    var title: String?=null
    
): Parcelable


/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable


/*
    Model: ProductSizeStores
*/
@Parcelize
data class ProductSizeStores(
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable


/*
    Model: ColumnHeader
*/
@Parcelize
data class ColumnHeader(
    
    
    @SerializedName("convertable")
    var convertable: Boolean?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable


/*
    Model: ColumnHeaders
*/
@Parcelize
data class ColumnHeaders(
    
    
    @SerializedName("col_4")
    var col4: ColumnHeader?=null,
    @SerializedName("col_6")
    var col6: ColumnHeader?=null,
    @SerializedName("col_1")
    var col1: ColumnHeader?=null,
    @SerializedName("col_3")
    var col3: ColumnHeader?=null,
    @SerializedName("col_5")
    var col5: ColumnHeader?=null,
    @SerializedName("col_2")
    var col2: ColumnHeader?=null
    
): Parcelable


/*
    Model: SizeChartValues
*/
@Parcelize
data class SizeChartValues(
    
    
    @SerializedName("col_4")
    var col4: String?=null,
    @SerializedName("col_6")
    var col6: String?=null,
    @SerializedName("col_1")
    var col1: String?=null,
    @SerializedName("col_3")
    var col3: String?=null,
    @SerializedName("col_5")
    var col5: String?=null,
    @SerializedName("col_2")
    var col2: String?=null
    
): Parcelable


/*
    Model: SizeChart
*/
@Parcelize
data class SizeChart(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("image")
    var image: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("headers")
    var headers: ColumnHeaders?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("size_tip")
    var sizeTip: String?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<SizeChartValues>?=null
    
): Parcelable


/*
    Model: Price
*/
@Parcelize
data class Price(
    
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("max")
    var max: Double?=null,
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable


/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    
    @SerializedName("effective")
    var effective: Price?=null,
    @SerializedName("marked")
    var marked: Price?=null
    
): Parcelable


/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable


/*
    Model: ProductSizes
*/
@Parcelize
data class ProductSizes(
    
    
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("stores")
    var stores: ProductSizeStores?=null,
    @SerializedName("size_chart")
    var sizeChart: SizeChart?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSize>?=null
    
): Parcelable


/*
    Model: ProductSetDistributionSize
*/
@Parcelize
data class ProductSetDistributionSize(
    
    
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("pieces")
    var pieces: Int?=null
    
): Parcelable


/*
    Model: ProductSetDistribution
*/
@Parcelize
data class ProductSetDistribution(
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSetDistributionSize>?=null
    
): Parcelable


/*
    Model: ProductSet
*/
@Parcelize
data class ProductSet(
    
    
    @SerializedName("size_distribution")
    var sizeDistribution: ProductSetDistribution?=null,
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable


/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    
    @SerializedName("strategy")
    var strategy: String?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable


/*
    Model: Store
*/
@Parcelize
data class Store(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable


/*
    Model: Seller
*/
@Parcelize
data class Seller(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: ProductSizePriceResponse
*/
@Parcelize
data class ProductSizePriceResponse(
    
    
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("set")
    var set: ProductSet?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("store")
    var store: Store?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("seller_count")
    var sellerCount: Int?=null,
    @SerializedName("special_badge")
    var specialBadge: String?=null,
    @SerializedName("seller")
    var seller: Seller?=null,
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    @SerializedName("price_per_price")
    var pricePerPrice: ProductStockPrice?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("long_lat")
    var longLat: ArrayList<Double>?=null
    
): Parcelable


/*
    Model: Page
*/
@Parcelize
data class Page(
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("next_id")
    var nextId: String?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable


/*
    Model: ProductSizeSellerFilter
*/
@Parcelize
data class ProductSizeSellerFilter(
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable


/*
    Model: ProductSizeSellersResponse
*/
@Parcelize
data class ProductSizeSellersResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSizeSellerFilter>?=null,
    @SerializedName("items")
    var items: ArrayList<ProductSizePriceResponse>?=null
    
): Parcelable


/*
    Model: AttributeDetail
*/
@Parcelize
data class AttributeDetail(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("key")
    var key: String?=null
    
): Parcelable


/*
    Model: ProductsComparisonResponse
*/
@Parcelize
data class ProductsComparisonResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null,
    @SerializedName("attributes_metadata")
    var attributesMetadata: ArrayList<AttributeDetail>?=null
    
): Parcelable


/*
    Model: ProductCompareResponse
*/
@Parcelize
data class ProductCompareResponse(
    
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("attributes_metadata")
    var attributesMetadata: ArrayList<AttributeDetail>?=null
    
): Parcelable


/*
    Model: ProductFrequentlyComparedSimilarResponse
*/
@Parcelize
data class ProductFrequentlyComparedSimilarResponse(
    
    
    @SerializedName("similars")
    var similars: ArrayList<ProductCompareResponse>?=null
    
): Parcelable


/*
    Model: ProductSimilarItem
*/
@Parcelize
data class ProductSimilarItem(
    
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null,
    @SerializedName("title")
    var title: String?=null
    
): Parcelable


/*
    Model: SimilarProductByTypeResponse
*/
@Parcelize
data class SimilarProductByTypeResponse(
    
    
    @SerializedName("similars")
    var similars: ArrayList<ProductSimilarItem>?=null
    
): Parcelable


/*
    Model: ProductVariantItemResponse
*/
@Parcelize
data class ProductVariantItemResponse(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("color_name")
    var colorName: String?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("color")
    var color: String?=null
    
): Parcelable


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
    var header: String?=null
    
): Parcelable


/*
    Model: ProductVariantsResponse
*/
@Parcelize
data class ProductVariantsResponse(
    
    
    @SerializedName("variants")
    var variants: ArrayList<ProductVariantResponse>?=null
    
): Parcelable


/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable


/*
    Model: CompanyDetail
*/
@Parcelize
data class CompanyDetail(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable


/*
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("store")
    var store: StoreDetail?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("seller")
    var seller: Seller?=null,
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    @SerializedName("company")
    var company: CompanyDetail?=null,
    @SerializedName("size")
    var size: String?=null
    
): Parcelable


/*
    Model: ProductStockStatusResponse
*/
@Parcelize
data class ProductStockStatusResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<ProductStockStatusItem>?=null
    
): Parcelable


/*
    Model: ProductStockPolling
*/
@Parcelize
data class ProductStockPolling(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<ProductStockStatusItem>?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("kind")
    var kind: String?=null
    
): Parcelable


/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    
    @SerializedName("query_format")
    var queryFormat: String?=null,
    @SerializedName("display_format")
    var displayFormat: String?=null,
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("max")
    var max: Int?=null,
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null
    
): Parcelable


/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    
    @SerializedName("key")
    var key: ProductFiltersKey?=null,
    @SerializedName("values")
    var values: ArrayList<ProductFiltersValue>?=null
    
): Parcelable


/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null
    
): Parcelable


/*
    Model: ImageUrls
*/
@Parcelize
data class ImageUrls(
    
    
    @SerializedName("landscape")
    var landscape: Media?=null,
    @SerializedName("portrait")
    var portrait: Media?=null
    
): Parcelable


/*
    Model: BrandItem
*/
@Parcelize
data class BrandItem(
    
    
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable


/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<BrandItem>?=null
    
): Parcelable


/*
    Model: BrandDetailResponse
*/
@Parcelize
data class BrandDetailResponse(
    
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable


/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null
    
): Parcelable


/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    
    @SerializedName("department")
    var department: String?=null,
    @SerializedName("items")
    var items: ArrayList<CategoryItems>?=null
    
): Parcelable


/*
    Model: DepartmentIdentifier
*/
@Parcelize
data class DepartmentIdentifier(
    
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable


/*
    Model: CategoryListingResponse
*/
@Parcelize
data class CategoryListingResponse(
    
    
    @SerializedName("data")
    var data: ArrayList<DepartmentCategoryTree>?=null,
    @SerializedName("departments")
    var departments: ArrayList<DepartmentIdentifier>?=null
    
): Parcelable


/*
    Model: CategoryMetaResponse
*/
@Parcelize
data class CategoryMetaResponse(
    
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable


/*
    Model: HomeListingResponse
*/
@Parcelize
data class HomeListingResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null
    
): Parcelable


/*
    Model: Department
*/
@Parcelize
data class Department(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable


/*
    Model: DepartmentResponse
*/
@Parcelize
data class DepartmentResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<Department>?=null
    
): Parcelable


/*
    Model: AutocompleteItem
*/
@Parcelize
data class AutocompleteItem(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: AutoCompleteResponse
*/
@Parcelize
data class AutoCompleteResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<AutocompleteItem>?=null
    
): Parcelable


/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    
    @SerializedName("tags")
    var tags: ArrayList<CollectionListingFilterTag>?=null,
    @SerializedName("type")
    var type: ArrayList<CollectionListingFilterType>?=null
    
): Parcelable


/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null,
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null
    
): Parcelable


/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable


/*
    Model: GetFollowListingResponse
*/
@Parcelize
data class GetFollowListingResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null
    
): Parcelable


/*
    Model: FollowPostResponse
*/
@Parcelize
data class FollowPostResponse(
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("id")
    var id: String?=null
    
): Parcelable


/*
    Model: FollowerCountResponse
*/
@Parcelize
data class FollowerCountResponse(
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable


/*
    Model: FollowIdsData
*/
@Parcelize
data class FollowIdsData(
    
    
    @SerializedName("products")
    var products: ArrayList<Int>?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("collections")
    var collections: ArrayList<Int>?=null
    
): Parcelable


/*
    Model: FollowIdsResponse
*/
@Parcelize
data class FollowIdsResponse(
    
    
    @SerializedName("data")
    var data: FollowIdsData?=null
    
): Parcelable


/*
    Model: LatLong
*/
@Parcelize
data class LatLong(
    
    
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: Store1
*/
@Parcelize
data class Store1(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("lat_long")
    var latLong: LatLong?=null
    
): Parcelable


/*
    Model: StoreListingResponse
*/
@Parcelize
data class StoreListingResponse(
    
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<Store1>?=null
    
): Parcelable




/*
    Model: CartCurrency
*/
@Parcelize
data class CartCurrency(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("symbol")
    var symbol: String?=null
    
): Parcelable


/*
    Model: CartProductIdentifer
*/
@Parcelize
data class CartProductIdentifer(
    
    
    @SerializedName("identifier")
    var identifier: String?=null
    
): Parcelable


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
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null
    
): Parcelable


/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("marked")
    var marked: Double?=null,
    @SerializedName("selling")
    var selling: Double?=null,
    @SerializedName("add_on")
    var addOn: Double?=null,
    @SerializedName("effective")
    var effective: Double?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable


/*
    Model: ProductPriceInfo
*/
@Parcelize
data class ProductPriceInfo(
    
    
    @SerializedName("converted")
    var converted: ProductPrice?=null,
    @SerializedName("base")
    var base: ProductPrice?=null
    
): Parcelable


/*
    Model: Image
*/
@Parcelize
data class Image(
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable


/*
    Model: BaseInfo
*/
@Parcelize
data class BaseInfo(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable


/*
    Model: CategoryInfo
*/
@Parcelize
data class CategoryInfo(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable


/*
    Model: ActionQuery
*/
@Parcelize
data class ActionQuery(
    
    
    @SerializedName("product_slug")
    var productSlug: ArrayList<String>?=null
    
): Parcelable


/*
    Model: ProductAction
*/
@Parcelize
data class ProductAction(
    
    
    @SerializedName("query")
    var query: ActionQuery?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable


/*
    Model: Product
*/
@Parcelize
data class Product(
    
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("images")
    var images: ArrayList<Image>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("action")
    var action: ProductAction?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: ArticlePriceInfo
*/
@Parcelize
data class ArticlePriceInfo(
    
    
    @SerializedName("converted")
    var converted: BasePrice?=null,
    @SerializedName("base")
    var base: BasePrice?=null
    
): Parcelable


/*
    Model: ProductArticle
*/
@Parcelize
data class ProductArticle(
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    @SerializedName("store")
    var store: BaseInfo?=null
    
): Parcelable


/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("product")
    var product: Product?=null,
    @SerializedName("article")
    var article: ProductArticle?=null
    
): Parcelable


/*
    Model: PromiseFormatted
*/
@Parcelize
data class PromiseFormatted(
    
    
    @SerializedName("min")
    var min: String?=null,
    @SerializedName("max")
    var max: String?=null
    
): Parcelable


/*
    Model: PromiseTimestamp
*/
@Parcelize
data class PromiseTimestamp(
    
    
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable


/*
    Model: ShipmentPromise
*/
@Parcelize
data class ShipmentPromise(
    
    
    @SerializedName("formatted")
    var formatted: PromiseFormatted?=null,
    @SerializedName("timestamp")
    var timestamp: PromiseTimestamp?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable


/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("total")
    var total: Double?=null,
    @SerializedName("coupon")
    var coupon: Double?=null
    
): Parcelable


/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: CartResponse
*/
@Parcelize
data class CartResponse(
    
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
): Parcelable


/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("item_size")
    var itemSize: String?=null,
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    @SerializedName("article_id")
    var articleId: String?=null
    
): Parcelable


/*
    Model: AddCartRequest
*/
@Parcelize
data class AddCartRequest(
    
    
    @SerializedName("items")
    var items: ArrayList<AddProductCart>?=null
    
): Parcelable


/*
    Model: AddCartResponse
*/
@Parcelize
data class AddCartResponse(
    
    
    @SerializedName("partial")
    var partial: Boolean?=null,
    @SerializedName("cart")
    var cart: CartResponse?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable


/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("item_size")
    var itemSize: String?=null,
    @SerializedName("article_id")
    var articleId: String?=null
    
): Parcelable


/*
    Model: UpdateCartRequest
*/
@Parcelize
data class UpdateCartRequest(
    
    
    @SerializedName("items")
    var items: ArrayList<UpdateProductCart>?=null,
    @SerializedName("operation")
    var operation: String?=null
    
): Parcelable


/*
    Model: UpdateCartResponse
*/
@Parcelize
data class UpdateCartResponse(
    
    
    @SerializedName("cart")
    var cart: CartResponse?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable


/*
    Model: CartItemCountResponse
*/
@Parcelize
data class CartItemCountResponse(
    
    
    @SerializedName("user_cart_items_count")
    var userCartItemsCount: Int?=null
    
): Parcelable


/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("sub_title")
    var subTitle: String?=null
    
): Parcelable


/*
    Model: PageCoupon
*/
@Parcelize
data class PageCoupon(
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable


/*
    Model: GetCouponResponse
*/
@Parcelize
data class GetCouponResponse(
    
    
    @SerializedName("available_coupon_list")
    var availableCouponList: ArrayList<Coupon>?=null,
    @SerializedName("page")
    var page: PageCoupon?=null
    
): Parcelable


/*
    Model: ApplyCouponRequest
*/
@Parcelize
data class ApplyCouponRequest(
    
    
    @SerializedName("coupon_code")
    var couponCode: String?=null
    
): Parcelable


/*
    Model: OfferSeller
*/
@Parcelize
data class OfferSeller(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable


/*
    Model: OfferPrice
*/
@Parcelize
data class OfferPrice(
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("marked")
    var marked: Int?=null,
    @SerializedName("bulk_effective")
    var bulkEffective: Double?=null,
    @SerializedName("effective")
    var effective: Int?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable


/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("auto_applied")
    var autoApplied: Boolean?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("price")
    var price: OfferPrice?=null,
    @SerializedName("best")
    var best: Boolean?=null,
    @SerializedName("margin")
    var margin: Int?=null,
    @SerializedName("total")
    var total: Double?=null
    
): Parcelable


/*
    Model: BulkPriceOffer
*/
@Parcelize
data class BulkPriceOffer(
    
    
    @SerializedName("seller")
    var seller: OfferSeller?=null,
    @SerializedName("offers")
    var offers: ArrayList<OfferItem>?=null
    
): Parcelable


/*
    Model: BulkPriceResponse
*/
@Parcelize
data class BulkPriceResponse(
    
    
    @SerializedName("data")
    var data: ArrayList<BulkPriceOffer>?=null
    
): Parcelable


/*
    Model: GeoLocation
*/
@Parcelize
data class GeoLocation(
    
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("longitude")
    var longitude: Double?=null
    
): Parcelable


/*
    Model: Address
*/
@Parcelize
data class Address(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("area")
    var area: String?=null
    
): Parcelable


/*
    Model: GetAddressesResponse
*/
@Parcelize
data class GetAddressesResponse(
    
    
    @SerializedName("address")
    var address: ArrayList<Address>?=null
    
): Parcelable


/*
    Model: SaveAddressResponse
*/
@Parcelize
data class SaveAddressResponse(
    
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("success")
    var success: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null
    
): Parcelable


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
    @SerializedName("address_id")
    var addressId: Int?=null
    
): Parcelable


/*
    Model: DeleteAddressResponse
*/
@Parcelize
data class DeleteAddressResponse(
    
    
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null,
    @SerializedName("address_id")
    var addressId: Int?=null
    
): Parcelable


/*
    Model: SelectCartAddressRequest
*/
@Parcelize
data class SelectCartAddressRequest(
    
    
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("address_id")
    var addressId: String?=null
    
): Parcelable


/*
    Model: UpdateCartPaymentRequest
*/
@Parcelize
data class UpdateCartPaymentRequest(
    
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null
    
): Parcelable


/*
    Model: CouponValidity
*/
@Parcelize
data class CouponValidity(
    
    
    @SerializedName("valid")
    var valid: Boolean?=null,
    @SerializedName("display_message_en")
    var displayMessageEn: String?=null,
    @SerializedName("discount")
    var discount: Double?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable


/*
    Model: PaymentUpdate
*/
@Parcelize
data class PaymentUpdate(
    
    
    @SerializedName("coupon_validity")
    var couponValidity: CouponValidity?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable


/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    @SerializedName("promise")
    var promise: ShipmentPromise?=null,
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    @SerializedName("box_type")
    var boxType: String?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("dp_id")
    var dpId: Int?=null,
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    @SerializedName("shipments")
    var shipments: Int?=null
    
): Parcelable


/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
): Parcelable


/*
    Model: CartCheckoutRequest
*/
@Parcelize
data class CartCheckoutRequest(
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("fyndstore_emp_id")
    var fyndstoreEmpId: String?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null,
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    @SerializedName("user_type")
    var userType: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("cod_message")
    var codMessage: String?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("error_message")
    var errorMessage: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
): Parcelable


/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("cart")
    var cart: CheckCart?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: CartMetaRequest
*/
@Parcelize
data class CartMetaRequest(
    
    
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: CartMetaResponse
*/
@Parcelize
data class CartMetaResponse(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: CartMetaMissingResponse
*/
@Parcelize
data class CartMetaMissingResponse(
    
    
    @SerializedName("errors")
    var errors: ArrayList<String>?=null
    
): Parcelable


/*
    Model: GetShareCartLinkRequest
*/
@Parcelize
data class GetShareCartLinkRequest(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: GetShareCartLinkResponse
*/
@Parcelize
data class GetShareCartLinkResponse(
    
    
    @SerializedName("share_url")
    var shareUrl: String?=null,
    @SerializedName("token")
    var token: String?=null
    
): Parcelable


/*
    Model: SharedCartDetails
*/
@Parcelize
data class SharedCartDetails(
    
    
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    @SerializedName("token")
    var token: String?=null
    
): Parcelable


/*
    Model: SharedCart
*/
@Parcelize
data class SharedCart(
    
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null
    
): Parcelable


/*
    Model: SharedCartResponse
*/
@Parcelize
data class SharedCartResponse(
    
    
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("cart")
    var cart: SharedCart?=null
    
): Parcelable




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
    
): Parcelable


/*
    Model: TicketHistoryList
*/
@Parcelize
data class TicketHistoryList(
    
    
    @SerializedName("docs")
    var docs: ArrayList<TicketHistory>?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null,
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable


/*
    Model: CustomFormList
*/
@Parcelize
data class CustomFormList(
    
    
    @SerializedName("docs")
    var docs: ArrayList<CustomForm>?=null,
    @SerializedName("limit")
    var limit: Int?=null,
    @SerializedName("page")
    var page: Int?=null,
    @SerializedName("pages")
    var pages: Int?=null,
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable


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
    @SerializedName("should_notify")
    var shouldNotify: Boolean?=null,
    @SerializedName("success_message")
    var successMessage: String?=null,
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: EditTicketPayload
*/
@Parcelize
data class EditTicketPayload(
    
    
    @SerializedName("content")
    var content: TicketContent?=null,
    @SerializedName("category")
    var category: String?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("assigned_to")
    var assignedTo: AgentChangePayload?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable


/*
    Model: AgentChangePayload
*/
@Parcelize
data class AgentChangePayload(
    
    
    @SerializedName("agent_id")
    var agentId: String?=null
    
): Parcelable


/*
    Model: CreateVideoRoomResponse
*/
@Parcelize
data class CreateVideoRoomResponse(
    
    
    @SerializedName("unique_name")
    var uniqueName: String?=null
    
): Parcelable


/*
    Model: CloseVideoRoomResponse
*/
@Parcelize
data class CloseVideoRoomResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable


/*
    Model: CreateVideoRoomPayload
*/
@Parcelize
data class CreateVideoRoomPayload(
    
    
    @SerializedName("unique_name")
    var uniqueName: String?=null,
    @SerializedName("notify")
    var notify: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: TicketHistoryPayload
*/
@Parcelize
data class TicketHistoryPayload(
    
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: CustomFormSubmissionPayload
*/
@Parcelize
data class CustomFormSubmissionPayload(
    
    
    @SerializedName("response")
    var response: ArrayList<KeyValue>?=null
    
): Parcelable


/*
    Model: KeyValue
*/
@Parcelize
data class KeyValue(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable


/*
    Model: GetTokenForVideoRoomResponse
*/
@Parcelize
data class GetTokenForVideoRoomResponse(
    
    
    @SerializedName("access_token")
    var accessToken: String?=null
    
): Parcelable


/*
    Model: GetParticipantsInsideVideoRoomResponse
*/
@Parcelize
data class GetParticipantsInsideVideoRoomResponse(
    
    
    @SerializedName("participants")
    var participants: ArrayList<Participant>?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null,
    @SerializedName("phone_numbers")
    var phoneNumbers: ArrayList<PhoneNumber>?=null,
    @SerializedName("emails")
    var emails: ArrayList<Email>?=null,
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("profile_pic_url")
    var profilePicUrl: String?=null,
    @SerializedName("username")
    var username: String?=null,
    @SerializedName("account_type")
    var accountType: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: Debug
*/
@Parcelize
data class Debug(
    
    
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("platform")
    var platform: String?=null
    
): Parcelable


/*
    Model: SubmitCustomFormResponse
*/
@Parcelize
data class SubmitCustomFormResponse(
    
    
    @SerializedName("ticket")
    var ticket: Ticket?=null
    
): Parcelable


/*
    Model: TicketContext
*/
@Parcelize
data class TicketContext(
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("company_id")
    var companyId: String?=null
    
): Parcelable


/*
    Model: CreatedOn
*/
@Parcelize
data class CreatedOn(
    
    
    @SerializedName("user_agent")
    var userAgent: String?=null
    
): Parcelable


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
    var type: String?=null
    
): Parcelable


/*
    Model: TicketContent
*/
@Parcelize
data class TicketContent(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("attachments")
    var attachments: ArrayList<TicketAsset>?=null
    
): Parcelable


/*
    Model: AddTicketPayload
*/
@Parcelize
data class AddTicketPayload(
    
    
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("priority")
    var priority: String?=null,
    @SerializedName("category")
    var category: String?=null,
    @SerializedName("content")
    var content: TicketContent?=null
    
): Parcelable


/*
    Model: Priority
*/
@Parcelize
data class Priority(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("color")
    var color: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: TicketCategory
*/
@Parcelize
data class TicketCategory(
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("form")
    var form: CustomForm?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("poll_for_assignment")
    var pollForAssignment: PollForAssignment?=null,
    @SerializedName("_id")
    var id: String?=null
    
): Parcelable


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
    
): Parcelable


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
    @SerializedName("ticket_id")
    var ticketId: String?=null,
    @SerializedName("category")
    var category: TicketCategory?=null,
    @SerializedName("source")
    var source: String?=null,
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
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable




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
    
): Parcelable


/*
    Model: ThemesListingResponseSchema
*/
@Parcelize
data class ThemesListingResponseSchema(
    
    
    @SerializedName("items")
    var items: ArrayList<ThemesSchema>?=null,
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable


/*
    Model: AddThemeRequestSchema
*/
@Parcelize
data class AddThemeRequestSchema(
    
    
    @SerializedName("theme_id")
    var themeId: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: FontsSchema
*/
@Parcelize
data class FontsSchema(
    
    
    @SerializedName("items")
    var items: FontsSchemaItems?=null,
    @SerializedName("kind")
    var kind: String?=null
    
): Parcelable


/*
    Model: BlitzkriegApiErrorSchema
*/
@Parcelize
data class BlitzkriegApiErrorSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: BlitzkriegNotFoundSchema
*/
@Parcelize
data class BlitzkriegNotFoundSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: BlitzkriegInternalServerErrorSchema
*/
@Parcelize
data class BlitzkriegInternalServerErrorSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    @SerializedName("available_pages")
    var availablePages: AvailablePages?=null,
    @SerializedName("available_sections")
    var availableSections: ArrayList<availableSectionSchema>?=null,
    @SerializedName("sections")
    var sections: ArrayList<sectionSchema>?=null,
    @SerializedName("constants")
    var constants: @RawValue HashMap<String,Any>?=null,
    @SerializedName("styles")
    var styles: @RawValue HashMap<String,Any>?=null,
    @SerializedName("config")
    var config: Config?=null,
    @SerializedName("settings")
    var settings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("font")
    var font: Font?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("__v")
    var v: Int?=null,
    @SerializedName("colors")
    var colors: Colors?=null
    
): Parcelable


/*
    Model: pagesSchema
*/
@Parcelize
data class pagesSchema(
    
    
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("path")
    var path: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("sections")
    var sections: Sections?=null
    
): Parcelable


/*
    Model: availableSectionSchema
*/
@Parcelize
data class availableSectionSchema(
    
    
    @SerializedName("blocks")
    var blocks: Blocks?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("label")
    var label: String?=null,
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: sectionSchema
*/
@Parcelize
data class sectionSchema(
    
    
    @SerializedName("page_key")
    var pageKey: String?=null,
    @SerializedName("page_sections")
    var pageSections: PageSections?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: Src
*/
@Parcelize
data class Src(
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: UmdJs
*/
@Parcelize
data class UmdJs(
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


/*
    Model: CommonJs
*/
@Parcelize
data class CommonJs(
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


/*
    Model: Css
*/
@Parcelize
data class Css(
    
    
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


/*
    Model: AvailablePages
*/
@Parcelize
data class AvailablePages(
    
    
    @SerializedName("path")
    var path: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("seo")
    var seo: Seo?=null,
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null,
    @SerializedName("sections")
    var sections: Sections?=null
    
): Parcelable


/*
    Model: Seo
*/
@Parcelize
data class Seo(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable


/*
    Model: Sections
*/
@Parcelize
data class Sections(
    
    
    @SerializedName("attributes")
    var attributes: String?=null
    
): Parcelable


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
    var list: ListSchema?=null
    
): Parcelable


/*
    Model: Preset
*/
@Parcelize
data class Preset(
    
    
    @SerializedName("sections")
    var sections: sectionSchema?=null
    
): Parcelable


/*
    Model: GlobalSchema
*/
@Parcelize
data class GlobalSchema(
    
    
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: ListSchema
*/
@Parcelize
data class ListSchema(
    
    
    @SerializedName("global")
    var global: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page")
    var page: ConfigPage?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: Custom
*/
@Parcelize
data class Custom(
    
    
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: ConfigPage
*/
@Parcelize
data class ConfigPage(
    
    
    @SerializedName("settings")
    var settings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page")
    var page: String?=null
    
): Parcelable


/*
    Model: Font
*/
@Parcelize
data class Font(
    
    
    @SerializedName("family")
    var family: String?=null,
    @SerializedName("variants")
    var variants: Variants?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: Medium
*/
@Parcelize
data class Medium(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file")
    var file: String?=null
    
): Parcelable


/*
    Model: SemiBold
*/
@Parcelize
data class SemiBold(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file")
    var file: String?=null
    
): Parcelable


/*
    Model: Bold
*/
@Parcelize
data class Bold(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file")
    var file: String?=null
    
): Parcelable


/*
    Model: Light
*/
@Parcelize
data class Light(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file")
    var file: String?=null
    
): Parcelable


/*
    Model: Regular
*/
@Parcelize
data class Regular(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("file")
    var file: String?=null
    
): Parcelable


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
    var props: BlocksProps?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: PageSections
*/
@Parcelize
data class PageSections(
    
    
    @SerializedName("blocks")
    var blocks: PageSectionsBlocks?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("label")
    var label: String?=null,
    @SerializedName("props")
    var props: @RawValue HashMap<String,Any>?=null,
    @SerializedName("preset")
    var preset: @RawValue HashMap<String,Any>?=null,
    @SerializedName("predicate")
    var predicate: Predicate?=null
    
): Parcelable


/*
    Model: PageSectionsBlocks
*/
@Parcelize
data class PageSectionsBlocks(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("props")
    var props: PageSectionsBlocksProps?=null
    
): Parcelable


/*
    Model: PageSectionsBlocksProps
*/
@Parcelize
data class PageSectionsBlocksProps(
    
    
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("label")
    var label: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: Predicate
*/
@Parcelize
data class Predicate(
    
    
    @SerializedName("screen")
    var screen: Screen?=null,
    @SerializedName("user")
    var user: PredicateUserSchema?=null,
    @SerializedName("route")
    var route: Route?=null
    
): Parcelable


/*
    Model: Screen
*/
@Parcelize
data class Screen(
    
    
    @SerializedName("mobile")
    var mobile: Boolean?=null,
    @SerializedName("desktop")
    var desktop: Boolean?=null,
    @SerializedName("tablet")
    var tablet: Boolean?=null
    
): Parcelable


/*
    Model: PredicateUserSchema
*/
@Parcelize
data class PredicateUserSchema(
    
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null,
    @SerializedName("anonymous")
    var anonymous: Boolean?=null
    
): Parcelable


/*
    Model: Route
*/
@Parcelize
data class Route(
    
    
    @SerializedName("selected")
    var selected: String?=null,
    @SerializedName("exact_url")
    var exactUrl: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
): Parcelable




/*
    Model: EditEmailRequestSchema
*/
@Parcelize
data class EditEmailRequestSchema(
    
    
    @SerializedName("email")
    var email: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: EditMobileRequestSchema
*/
@Parcelize
data class EditMobileRequestSchema(
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("phone")
    var phone: String?=null
    
): Parcelable


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
    var mobile: String?=null,
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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    var force: String?=null
    
): Parcelable


/*
    Model: UpdatePasswordRequestSchema
*/
@Parcelize
data class UpdatePasswordRequestSchema(
    
    
    @SerializedName("old_password")
    var oldPassword: String?=null,
    @SerializedName("new_password")
    var newPassword: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: TokenRequestBodySchema
*/
@Parcelize
data class TokenRequestBodySchema(
    
    
    @SerializedName("token")
    var token: String?=null
    
): Parcelable


/*
    Model: ForgotPasswordRequestSchema
*/
@Parcelize
data class ForgotPasswordRequestSchema(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("password")
    var password: String?=null
    
): Parcelable


/*
    Model: CodeRequestBodySchema
*/
@Parcelize
data class CodeRequestBodySchema(
    
    
    @SerializedName("code")
    var code: String?=null
    
): Parcelable


/*
    Model: SendResetPasswordEmailRequestSchema
*/
@Parcelize
data class SendResetPasswordEmailRequestSchema(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("captcha_code")
    var captchaCode: String?=null
    
): Parcelable


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
    
): Parcelable


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
    var mobile: String?=null
    
): Parcelable


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
    
): Parcelable


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
    var user: AuthSuccessUser?=null
    
): Parcelable


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
    var countryCode: String?=null
    
): Parcelable


/*
    Model: LoginSuccess
*/
@Parcelize
data class LoginSuccess(
    
    
    @SerializedName("user")
    var user: UserSchema?=null
    
): Parcelable


/*
    Model: VerifyOtpSuccess
*/
@Parcelize
data class VerifyOtpSuccess(
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("user_exists")
    var userExists: Boolean?=null
    
): Parcelable


/*
    Model: ResetPasswordSuccess
*/
@Parcelize
data class ResetPasswordSuccess(
    
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable


/*
    Model: RegisterFormSuccess
*/
@Parcelize
data class RegisterFormSuccess(
    
    
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
    var countryCode: String?=null
    
): Parcelable


/*
    Model: VerifyEmailSuccess
*/
@Parcelize
data class VerifyEmailSuccess(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: HasPasswordSuccess
*/
@Parcelize
data class HasPasswordSuccess(
    
    
    @SerializedName("result")
    var result: Boolean?=null
    
): Parcelable


/*
    Model: LogoutSuccess
*/
@Parcelize
data class LogoutSuccess(
    
    
    @SerializedName("logout")
    var logout: Boolean?=null
    
): Parcelable


/*
    Model: OtpSuccess
*/
@Parcelize
data class OtpSuccess(
    
    
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
    var countryCode: String?=null
    
): Parcelable


/*
    Model: EmailOtpSuccess
*/
@Parcelize
data class EmailOtpSuccess(
    
    
    @SerializedName("resend_token")
    var resendToken: String?=null
    
): Parcelable


/*
    Model: SessionListSuccess
*/
@Parcelize
data class SessionListSuccess(
    
    
    @SerializedName("sessions")
    var sessions: ArrayList<String>?=null
    
): Parcelable


/*
    Model: VerifyMobileOTPSuccess
*/
@Parcelize
data class VerifyMobileOTPSuccess(
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
    
): Parcelable


/*
    Model: VerifyEmailOTPSuccess
*/
@Parcelize
data class VerifyEmailOTPSuccess(
    
    
    @SerializedName("user")
    var user: UserSchema?=null,
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
    
): Parcelable


/*
    Model: SendMobileVerifyLinkSuccess
*/
@Parcelize
data class SendMobileVerifyLinkSuccess(
    
    
    @SerializedName("verify_mobile_link")
    var verifyMobileLink: Boolean?=null
    
): Parcelable


/*
    Model: SendEmailVerifyLinkSuccess
*/
@Parcelize
data class SendEmailVerifyLinkSuccess(
    
    
    @SerializedName("verify_email_link")
    var verifyEmailLink: Boolean?=null
    
): Parcelable


/*
    Model: UserSearchResponseSchema
*/
@Parcelize
data class UserSearchResponseSchema(
    
    
    @SerializedName("users")
    var users: ArrayList<UserSchema>?=null
    
): Parcelable


/*
    Model: CustomerListResponseSchema
*/
@Parcelize
data class CustomerListResponseSchema(
    
    
    @SerializedName("items")
    var items: ArrayList<UserSchema>?=null,
    @SerializedName("page")
    var page: PaginationSchema?=null
    
): Parcelable


/*
    Model: UnauthorizedSchema
*/
@Parcelize
data class UnauthorizedSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: UnauthenticatedSchema
*/
@Parcelize
data class UnauthenticatedSchema(
    
    
    @SerializedName("authenticated")
    var authenticated: Boolean?=null
    
): Parcelable


/*
    Model: NotFoundSchema
*/
@Parcelize
data class NotFoundSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: AuthenticationApiErrorSchema
*/
@Parcelize
data class AuthenticationApiErrorSchema(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: FormRegisterRequestSchemaPhone
*/
@Parcelize
data class FormRegisterRequestSchemaPhone(
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: AuthSuccessUserDebug
*/
@Parcelize
data class AuthSuccessUserDebug(
    
    
    @SerializedName("platform")
    var platform: String?=null
    
): Parcelable


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
    
): Parcelable


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
    var register: Boolean?=null
    
): Parcelable


/*
    Model: LookAndFeel
*/
@Parcelize
data class LookAndFeel(
    
    
    @SerializedName("card_position")
    var cardPosition: String?=null,
    @SerializedName("background_color")
    var backgroundColor: String?=null
    
): Parcelable


/*
    Model: Login
*/
@Parcelize
data class Login(
    
    
    @SerializedName("password")
    var password: Boolean?=null,
    @SerializedName("otp")
    var otp: Boolean?=null
    
): Parcelable


/*
    Model: MetaSchema
*/
@Parcelize
data class MetaSchema(
    
    
    @SerializedName("fynd_default")
    var fyndDefault: Boolean?=null
    
): Parcelable


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
    var google: Boolean?=null
    
): Parcelable


/*
    Model: RequiredFields
*/
@Parcelize
data class RequiredFields(
    
    
    @SerializedName("email")
    var email: Email?=null,
    @SerializedName("mobile")
    var mobile: Mobile?=null
    
): Parcelable


/*
    Model: Mobile
*/
@Parcelize
data class Mobile(
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable


/*
    Model: RegisterRequiredFields
*/
@Parcelize
data class RegisterRequiredFields(
    
    
    @SerializedName("email")
    var email: RegisterRequiredFieldsEmail?=null,
    @SerializedName("mobile")
    var mobile: RegisterRequiredFieldsMobile?=null
    
): Parcelable


/*
    Model: RegisterRequiredFieldsEmail
*/
@Parcelize
data class RegisterRequiredFieldsEmail(
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable


/*
    Model: RegisterRequiredFieldsMobile
*/
@Parcelize
data class RegisterRequiredFieldsMobile(
    
    
    @SerializedName("is_required")
    var isRequired: Boolean?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: Facebook
*/
@Parcelize
data class Facebook(
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable


/*
    Model: Accountkit
*/
@Parcelize
data class Accountkit(
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable


/*
    Model: Google
*/
@Parcelize
data class Google(
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable




/*
    Model: QRCodeResp
*/
@Parcelize
data class QRCodeResp(
    
    
    @SerializedName("link")
    var link: String?=null,
    @SerializedName("svg")
    var svg: String?=null
    
): Parcelable


/*
    Model: RedirectDevice
*/
@Parcelize
data class RedirectDevice(
    
    
    @SerializedName("link")
    var link: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: WebRedirect
*/
@Parcelize
data class WebRedirect(
    
    
    @SerializedName("link")
    var link: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: Campaign
*/
@Parcelize
data class Campaign(
    
    
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("medium")
    var medium: String?=null
    
): Parcelable


/*
    Model: Attribution
*/
@Parcelize
data class Attribution(
    
    
    @SerializedName("campaign_cookie_expiry")
    var campaignCookieExpiry: String?=null
    
): Parcelable


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
    
): Parcelable


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
    var campaign: Campaign?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null,
    @SerializedName("attribution")
    var attribution: Attribution?=null,
    @SerializedName("social_media_tags")
    var socialMediaTags: SocialMediaTags?=null,
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable


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
    
): Parcelable


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
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("personalized")
    var personalized: Boolean?=null,
    @SerializedName("campaign")
    var campaign: Campaign?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null,
    @SerializedName("attribution")
    var attribution: Attribution?=null,
    @SerializedName("social_media_tags")
    var socialMediaTags: SocialMediaTags?=null,
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable


/*
    Model: ShortLinkList
*/
@Parcelize
data class ShortLinkList(
    
    
    @SerializedName("items")
    var items: ArrayList<ShortLinkRes>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable




/*
    Model: FailedResponse
*/
@Parcelize
data class FailedResponse(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: CDN
*/
@Parcelize
data class CDN(
    
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable


/*
    Model: Upload
*/
@Parcelize
data class Upload(
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    @SerializedName("url")
    var url: String?=null
    
): Parcelable


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
    var cdn: CDN?=null
    
): Parcelable


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
    var tags: ArrayList<String>?=null
    
): Parcelable


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
    @SerializedName("success")
    var success: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: BulkResponse
*/
@Parcelize
data class BulkResponse(
    
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    @SerializedName("task")
    var task: CopyFileTask?=null
    
): Parcelable


/*
    Model: ReqConfiguration
*/
@Parcelize
data class ReqConfiguration(
    
    
    @SerializedName("concurrency")
    var concurrency: Int?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: SignUrlResponse
*/
@Parcelize
data class SignUrlResponse(
    
    
    @SerializedName("urls")
    var urls: ArrayList<Urls>?=null
    
): Parcelable


/*
    Model: SignUrlRequest
*/
@Parcelize
data class SignUrlRequest(
    
    
    @SerializedName("expiry")
    var expiry: Int?=null,
    @SerializedName("urls")
    var urls: ArrayList<String>?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: BrowseResponse
*/
@Parcelize
data class BrowseResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<DbRecord>?=null,
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable




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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: OS
*/
@Parcelize
data class OS(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("version")
    var version: String?=null
    
): Parcelable


/*
    Model: SupportedLanguage
*/
@Parcelize
data class SupportedLanguage(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable


/*
    Model: LanguageResponse
*/
@Parcelize
data class LanguageResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<SupportedLanguage>?=null
    
): Parcelable


/*
    Model: AppStaffResponse
*/
@Parcelize
data class AppStaffResponse(
    
    
    @SerializedName("staff_users")
    var staffUsers: ArrayList<AppStaff>?=null
    
): Parcelable


/*
    Model: UpdateDialog
*/
@Parcelize
data class UpdateDialog(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("interval")
    var interval: Int?=null
    
): Parcelable


/*
    Model: OrderingStoreSelectRequest
*/
@Parcelize
data class OrderingStoreSelectRequest(
    
    
    @SerializedName("ordering_store")
    var orderingStore: OrderingStoreSelect?=null
    
): Parcelable


/*
    Model: OrderingStoreSelect
*/
@Parcelize
data class OrderingStoreSelect(
    
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("store_code")
    var storeCode: String?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: LaunchPage
*/
@Parcelize
data class LaunchPage(
    
    
    @SerializedName("page_type")
    var pageType: String?=null,
    @SerializedName("params")
    var params: String?=null,
    @SerializedName("query")
    var query: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: RegistrationPageFeature
*/
@Parcelize
data class RegistrationPageFeature(
    
    
    @SerializedName("ask_store_address")
    var askStoreAddress: Boolean?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: HomePageFeature
*/
@Parcelize
data class HomePageFeature(
    
    
    @SerializedName("order_processing")
    var orderProcessing: Boolean?=null
    
): Parcelable


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
    @SerializedName("listing_page")
    var listingPage: ListingPageFeature?=null,
    @SerializedName("currency")
    var currency: CurrencyFeature?=null,
    @SerializedName("revenue_engine")
    var revenueEngine: RevenueEngineFeature?=null,
    @SerializedName("feedback")
    var feedback: FeedbackFeature?=null,
    @SerializedName("compare_products")
    var compareProducts: CompareProductsFeature?=null
    
): Parcelable


/*
    Model: CommunicationOptinDialogFeature
*/
@Parcelize
data class CommunicationOptinDialogFeature(
    
    
    @SerializedName("visibility")
    var visibility: Boolean?=null
    
): Parcelable


/*
    Model: DeploymentStoreSelectionFeature
*/
@Parcelize
data class DeploymentStoreSelectionFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: ListingPriceFeature
*/
@Parcelize
data class ListingPriceFeature(
    
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("sort")
    var sort: String?=null
    
): Parcelable


/*
    Model: ListingPageFeature
*/
@Parcelize
data class ListingPageFeature(
    
    
    @SerializedName("sort_on")
    var sortOn: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: RevenueEngineFeature
*/
@Parcelize
data class RevenueEngineFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable


/*
    Model: FeedbackFeature
*/
@Parcelize
data class FeedbackFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable


/*
    Model: CompareProductsFeature
*/
@Parcelize
data class CompareProductsFeature(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable


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
    var googleMap: Boolean?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: PcrFeature
*/
@Parcelize
data class PcrFeature(
    
    
    @SerializedName("staff_selection")
    var staffSelection: Boolean?=null
    
): Parcelable


/*
    Model: OrderFeature
*/
@Parcelize
data class OrderFeature(
    
    
    @SerializedName("buy_again")
    var buyAgain: Boolean?=null
    
): Parcelable


/*
    Model: AppFeatureRequest
*/
@Parcelize
data class AppFeatureRequest(
    
    
    @SerializedName("feature")
    var feature: AppFeature?=null
    
): Parcelable


/*
    Model: AppFeatureResponse
*/
@Parcelize
data class AppFeatureResponse(
    
    
    @SerializedName("feature")
    var feature: AppFeature?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: Domain
*/
@Parcelize
data class Domain(
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("is_primary")
    var isPrimary: Boolean?=null,
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    @SerializedName("is_shortlink")
    var isShortlink: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable


/*
    Model: ApplicationWebsite
*/
@Parcelize
data class ApplicationWebsite(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("basepath")
    var basepath: String?=null
    
): Parcelable


/*
    Model: ApplicationCors
*/
@Parcelize
data class ApplicationCors(
    
    
    @SerializedName("domains")
    var domains: ArrayList<String>?=null
    
): Parcelable


/*
    Model: ApplicationAuth
*/
@Parcelize
data class ApplicationAuth(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable


/*
    Model: ApplicationRedirections
*/
@Parcelize
data class ApplicationRedirections(
    
    
    @SerializedName("from")
    var from: String?=null,
    @SerializedName("redirect_to")
    var redirectTo: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: ApplicationMeta
*/
@Parcelize
data class ApplicationMeta(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: String?=null
    
): Parcelable


/*
    Model: SecureUrl
*/
@Parcelize
data class SecureUrl(
    
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: NotFound
*/
@Parcelize
data class NotFound(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: UnhandledError
*/
@Parcelize
data class UnhandledError(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: InvalidPayloadRequest
*/
@Parcelize
data class InvalidPayloadRequest(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: SuccessMessageResponse
*/
@Parcelize
data class SuccessMessageResponse(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: InventoryBrandRule
*/
@Parcelize
data class InventoryBrandRule(
    
    
    @SerializedName("criteria")
    var criteria: String?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable


/*
    Model: StoreCriteriaRule
*/
@Parcelize
data class StoreCriteriaRule(
    
    
    @SerializedName("companies")
    var companies: ArrayList<Int>?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: InventoryPaymentConfig
*/
@Parcelize
data class InventoryPaymentConfig(
    
    
    @SerializedName("mode_of_payment")
    var modeOfPayment: String?=null,
    @SerializedName("source")
    var source: String?=null
    
): Parcelable


/*
    Model: StorePriorityRule
*/
@Parcelize
data class StorePriorityRule(
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    @SerializedName("storetype_order")
    var storetypeOrder: ArrayList<String>?=null
    
): Parcelable


/*
    Model: ArticleAssignmentRule
*/
@Parcelize
data class ArticleAssignmentRule(
    
    
    @SerializedName("store_priority")
    var storePriority: StorePriorityRule?=null
    
): Parcelable


/*
    Model: InventoryArticleAssignment
*/
@Parcelize
data class InventoryArticleAssignment(
    
    
    @SerializedName("post_order_reassignment")
    var postOrderReassignment: Boolean?=null,
    @SerializedName("enforced_stores")
    var enforcedStores: ArrayList<Int>?=null,
    @SerializedName("rules")
    var rules: ArticleAssignmentRule?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: InformationPhone
*/
@Parcelize
data class InformationPhone(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("number")
    var number: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: SocialLinks
*/
@Parcelize
data class SocialLinks(
    
    
    @SerializedName("facebook")
    var facebook: Facebook?=null,
    @SerializedName("instagram")
    var instagram: Instagram?=null,
    @SerializedName("twitter")
    var twitter: Twitter?=null,
    @SerializedName("pinterest")
    var pinterest: Pinterest?=null,
    @SerializedName("google_plus")
    var googlePlus: GooglePlus?=null,
    @SerializedName("youtube")
    var youtube: Youtube?=null,
    @SerializedName("linked_in")
    var linkedIn: LinkedIn?=null,
    @SerializedName("vimeo")
    var vimeo: Vimeo?=null,
    @SerializedName("blog_link")
    var blogLink: BlogLink?=null
    
): Parcelable


/*
    Model: Instagram
*/
@Parcelize
data class Instagram(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


/*
    Model: Twitter
*/
@Parcelize
data class Twitter(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


/*
    Model: Pinterest
*/
@Parcelize
data class Pinterest(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


/*
    Model: GooglePlus
*/
@Parcelize
data class GooglePlus(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


/*
    Model: Youtube
*/
@Parcelize
data class Youtube(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


/*
    Model: LinkedIn
*/
@Parcelize
data class LinkedIn(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


/*
    Model: Vimeo
*/
@Parcelize
data class Vimeo(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("icon")
    var icon: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: Links
*/
@Parcelize
data class Links(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("link")
    var link: String?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: CurrenciesResponse
*/
@Parcelize
data class CurrenciesResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<Currency>?=null
    
): Parcelable


/*
    Model: StoreLatLong
*/
@Parcelize
data class StoreLatLong(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


/*
    Model: TokenResponse
*/
@Parcelize
data class TokenResponse(
    
    
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
    
): Parcelable


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
    @SerializedName("auth")
    var auth: Auth?=null,
    @SerializedName("google_map")
    var googleMap: GoogleMap?=null
    
): Parcelable


/*
    Model: Firebase
*/
@Parcelize
data class Firebase(
    
    
    @SerializedName("credentials")
    var credentials: Credentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable


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
    var projectId: String?=null,
    @SerializedName("gcm_sender_id")
    var gcmSenderId: String?=null,
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable


/*
    Model: Ios
*/
@Parcelize
data class Ios(
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable


/*
    Model: Android
*/
@Parcelize
data class Android(
    
    
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable


/*
    Model: Moengage
*/
@Parcelize
data class Moengage(
    
    
    @SerializedName("credentials")
    var credentials: MoengageCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable


/*
    Model: MoengageCredentials
*/
@Parcelize
data class MoengageCredentials(
    
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable


/*
    Model: Segment
*/
@Parcelize
data class Segment(
    
    
    @SerializedName("credentials")
    var credentials: SegmentCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable


/*
    Model: SegmentCredentials
*/
@Parcelize
data class SegmentCredentials(
    
    
    @SerializedName("write_key")
    var writeKey: String?=null
    
): Parcelable


/*
    Model: Gtm
*/
@Parcelize
data class Gtm(
    
    
    @SerializedName("credentials")
    var credentials: GtmCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable


/*
    Model: GtmCredentials
*/
@Parcelize
data class GtmCredentials(
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable


/*
    Model: Freshchat
*/
@Parcelize
data class Freshchat(
    
    
    @SerializedName("credentials")
    var credentials: FreshchatCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable


/*
    Model: FreshchatCredentials
*/
@Parcelize
data class FreshchatCredentials(
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("app_key")
    var appKey: String?=null,
    @SerializedName("web_token")
    var webToken: String?=null
    
): Parcelable


/*
    Model: Safetynet
*/
@Parcelize
data class Safetynet(
    
    
    @SerializedName("credentials")
    var credentials: SafetynetCredentials?=null,
    @SerializedName("enabled")
    var enabled: Boolean?=null
    
): Parcelable


/*
    Model: SafetynetCredentials
*/
@Parcelize
data class SafetynetCredentials(
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable


/*
    Model: FyndRewards
*/
@Parcelize
data class FyndRewards(
    
    
    @SerializedName("credentials")
    var credentials: FyndRewardsCredentials?=null
    
): Parcelable


/*
    Model: FyndRewardsCredentials
*/
@Parcelize
data class FyndRewardsCredentials(
    
    
    @SerializedName("public_key")
    var publicKey: String?=null
    
): Parcelable


/*
    Model: Auth
*/
@Parcelize
data class Auth(
    
    
    @SerializedName("google")
    var google: Google?=null,
    @SerializedName("facebook")
    var facebook: Facebook?=null,
    @SerializedName("accountkit")
    var accountkit: Accountkit?=null
    
): Parcelable


/*
    Model: GoogleMap
*/
@Parcelize
data class GoogleMap(
    
    
    @SerializedName("credentials")
    var credentials: GoogleMapCredentials?=null
    
): Parcelable


/*
    Model: GoogleMapCredentials
*/
@Parcelize
data class GoogleMapCredentials(
    
    
    @SerializedName("api_key")
    var apiKey: String?=null
    
): Parcelable




/*
    Model: AggregatorConfigDetail
*/
@Parcelize
data class AggregatorConfigDetail(
    
    
    @SerializedName("verify_api")
    var verifyApi: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("secret")
    var secret: String?=null,
    @SerializedName("merchant_id")
    var merchantId: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("sdk")
    var sdk: Boolean?=null,
    @SerializedName("pin")
    var pin: String?=null,
    @SerializedName("api")
    var api: String?=null,
    @SerializedName("merchant_key")
    var merchantKey: String?=null
    
): Parcelable


/*
    Model: AggregatorsConfigDetailResponse
*/
@Parcelize
data class AggregatorsConfigDetailResponse(
    
    
    @SerializedName("mswipe")
    var mswipe: AggregatorConfigDetail?=null,
    @SerializedName("ccavenue")
    var ccavenue: AggregatorConfigDetail?=null,
    @SerializedName("rupifi")
    var rupifi: AggregatorConfigDetail?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("env")
    var env: String?=null,
    @SerializedName("stripe")
    var stripe: AggregatorConfigDetail?=null,
    @SerializedName("juspay")
    var juspay: AggregatorConfigDetail?=null,
    @SerializedName("payumoney")
    var payumoney: AggregatorConfigDetail?=null,
    @SerializedName("simpl")
    var simpl: AggregatorConfigDetail?=null,
    @SerializedName("razorpay")
    var razorpay: AggregatorConfigDetail?=null
    
): Parcelable


/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable


/*
    Model: HttpErrorCodeAndResponse
*/
@Parcelize
data class HttpErrorCodeAndResponse(
    
    
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable


/*
    Model: AttachCardRequest
*/
@Parcelize
data class AttachCardRequest(
    
    
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("refresh")
    var refresh: Boolean?=null
    
): Parcelable


/*
    Model: AttachCardsResponse
*/
@Parcelize
data class AttachCardsResponse(
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: ActiveCardPaymentGatewayResponse
*/
@Parcelize
data class ActiveCardPaymentGatewayResponse(
    
    
    @SerializedName("cards")
    var cards: CardPaymentGateway?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: Card
*/
@Parcelize
data class Card(
    
    
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
    
): Parcelable


/*
    Model: ListCardsResponse
*/
@Parcelize
data class ListCardsResponse(
    
    
    @SerializedName("data")
    var data: ArrayList<Card>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: DeletehCardRequest
*/
@Parcelize
data class DeletehCardRequest(
    
    
    @SerializedName("card_id")
    var cardId: String?=null
    
): Parcelable


/*
    Model: DeleteCardsResponse
*/
@Parcelize
data class DeleteCardsResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: ValidateCustomerRequest
*/
@Parcelize
data class ValidateCustomerRequest(
    
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    @SerializedName("payload")
    var payload: String?=null,
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("merchant_params")
    var merchantParams: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: ValidateCustomerResponse
*/
@Parcelize
data class ValidateCustomerResponse(
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: ChargeCustomerRequest
*/
@Parcelize
data class ChargeCustomerRequest(
    
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("transaction_token")
    var transactionToken: String?=null,
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable


/*
    Model: ChargeCustomerResponse
*/
@Parcelize
data class ChargeCustomerResponse(
    
    
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("delivery_address_id")
    var deliveryAddressId: String?=null,
    @SerializedName("cart_id")
    var cartId: String?=null
    
): Parcelable


/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    @SerializedName("timeout")
    var timeout: Int?=null
    
): Parcelable


/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    
    @SerializedName("bqr_image")
    var bqrImage: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("customer_id")
    var customerId: String?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    @SerializedName("vpa")
    var vpa: String?=null
    
): Parcelable


/*
    Model: PaymentStatusUpdateRequest
*/
@Parcelize
data class PaymentStatusUpdateRequest(
    
    
    @SerializedName("contact")
    var contact: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("customer_id")
    var customerId: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("vpa")
    var vpa: String?=null
    
): Parcelable


/*
    Model: PaymentStatusUpdateResponse
*/
@Parcelize
data class PaymentStatusUpdateResponse(
    
    
    @SerializedName("retry")
    var retry: Boolean?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
    
): Parcelable


/*
    Model: AggregatorRoute
*/
@Parcelize
data class AggregatorRoute(
    
    
    @SerializedName("payment_flow")
    var paymentFlow: String?=null,
    @SerializedName("api_link")
    var apiLink: String?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: PaymentFlow
*/
@Parcelize
data class PaymentFlow(
    
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorRoute?=null,
    @SerializedName("rupifi")
    var rupifi: AggregatorRoute?=null,
    @SerializedName("bqr_razorpay")
    var bqrRazorpay: AggregatorRoute?=null,
    @SerializedName("fynd")
    var fynd: AggregatorRoute?=null,
    @SerializedName("stripe")
    var stripe: AggregatorRoute?=null,
    @SerializedName("juspay")
    var juspay: AggregatorRoute?=null,
    @SerializedName("upi_razorpay")
    var upiRazorpay: AggregatorRoute?=null,
    @SerializedName("payubiz")
    var payubiz: AggregatorRoute?=null,
    @SerializedName("simpl")
    var simpl: AggregatorRoute?=null,
    @SerializedName("msipe")
    var msipe: AggregatorRoute?=null,
    @SerializedName("razorpay")
    var razorpay: AggregatorRoute?=null
    
): Parcelable


/*
    Model: PaymentModeLogo
*/
@Parcelize
data class PaymentModeLogo(
    
    
    @SerializedName("large")
    var large: String?=null,
    @SerializedName("small")
    var small: String?=null
    
): Parcelable


/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("intent_flow")
    var intentFlow: String?=null,
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
    
): Parcelable


/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
    
): Parcelable


/*
    Model: PaymentOptionAndFlow
*/
@Parcelize
data class PaymentOptionAndFlow(
    
    
    @SerializedName("payment_flows")
    var paymentFlows: PaymentFlow?=null,
    @SerializedName("payment_option")
    var paymentOption: ArrayList<RootPaymentMode>?=null
    
): Parcelable


/*
    Model: PaymentModeRouteResponse
*/
@Parcelize
data class PaymentModeRouteResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptionAndFlow?=null
    
): Parcelable


/*
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    
    @SerializedName("mobile")
    var mobile: Boolean?=null,
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("branch_name")
    var branchName: Boolean?=null,
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("account_no")
    var accountNo: String?=null,
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("bank_name")
    var bankName: String?=null,
    @SerializedName("comment")
    var comment: Boolean?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable


/*
    Model: OrderBeneficiaryResponse
*/
@Parcelize
data class OrderBeneficiaryResponse(
    
    
    @SerializedName("beneficiaries")
    var beneficiaries: ArrayList<OrderBeneficiaryDetails>?=null
    
): Parcelable


/*
    Model: NotFoundResourceError
*/
@Parcelize
data class NotFoundResourceError(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable


/*
    Model: AddBeneficiaryViaOtpVerificationRequest
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationRequest(
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("otp")
    var otp: String?=null,
    @SerializedName("hash_key")
    var hashKey: String?=null
    
): Parcelable


/*
    Model: AddBeneficiaryViaOtpVerificationResponse
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationResponse(
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("otp")
    var otp: String?=null,
    @SerializedName("hash_key")
    var hashKey: String?=null
    
): Parcelable


/*
    Model: WrongOtpError
*/
@Parcelize
data class WrongOtpError(
    
    
    @SerializedName("success")
    var success: String?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable


/*
    Model: BankDetails
*/
@Parcelize
data class BankDetails(
    
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    @SerializedName("bank_name")
    var bankName: String?=null,
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("account_no")
    var accountNo: String?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("ifsc_code")
    var ifscCode: String?=null
    
): Parcelable


/*
    Model: AddBeneficiaryDetailsRequest
*/
@Parcelize
data class AddBeneficiaryDetailsRequest(
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("delights")
    var delights: Boolean?=null,
    @SerializedName("details")
    var details: BankDetails?=null
    
): Parcelable


/*
    Model: RefundAccountResponse
*/
@Parcelize
data class RefundAccountResponse(
    
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: WalletOtpRequest
*/
@Parcelize
data class WalletOtpRequest(
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("mobile")
    var mobile: Boolean?=null
    
): Parcelable


/*
    Model: WalletOtpResponse
*/
@Parcelize
data class WalletOtpResponse(
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: String?=null,
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable


/*
    Model: SetDefaultBeneficiaryRequest
*/
@Parcelize
data class SetDefaultBeneficiaryRequest(
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null
    
): Parcelable


/*
    Model: SetDefaultBeneficiaryResponse
*/
@Parcelize
data class SetDefaultBeneficiaryResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("is_beneficiary_set")
    var isBeneficiarySet: Boolean?=null
    
): Parcelable




/*
    Model: OrderById
*/
@Parcelize
data class OrderById(
    
    
    @SerializedName("order")
    var order: OrderSchema?=null
    
): Parcelable


/*
    Model: OrderList
*/
@Parcelize
data class OrderList(
    
    
    @SerializedName("orders")
    var orders: ArrayList<OrderSchema>?=null,
    @SerializedName("page")
    var page: OrderPage?=null
    
): Parcelable


/*
    Model: OrderPage
*/
@Parcelize
data class OrderPage(
    
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable


/*
    Model: ShipmentById
*/
@Parcelize
data class ShipmentById(
    
    
    @SerializedName("shipment")
    var shipment: Shipments?=null
    
): Parcelable


/*
    Model: ShipmentReasons
*/
@Parcelize
data class ShipmentReasons(
    
    
    @SerializedName("reasons")
    var reasons: ArrayList<Reasons>?=null
    
): Parcelable


/*
    Model: ShipmentStatusUpdateBody
*/
@Parcelize
data class ShipmentStatusUpdateBody(
    
    
    @SerializedName("shipments")
    var shipments: Shipments?=null,
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null,
    @SerializedName("task")
    var task: Boolean?=null
    
): Parcelable


/*
    Model: Shipments
*/
@Parcelize
data class Shipments(
    
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<BreakupValues>?=null,
    @SerializedName("enable_can_return")
    var enableCanReturn: Boolean?=null,
    @SerializedName("payment_mode_source")
    var paymentModeSource: String?=null,
    @SerializedName("shipment_images")
    var shipmentImages: ArrayList<String>?=null,
    @SerializedName("track_url")
    var trackUrl: String?=null,
    @SerializedName("traking_no")
    var trakingNo: String?=null,
    @SerializedName("tracking_details")
    var trackingDetails: ArrayList<TrackingDetails>?=null,
    @SerializedName("beneficiary_details")
    var beneficiaryDetails: Boolean?=null,
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("prices")
    var prices: Prices?=null,
    @SerializedName("need_help_url")
    var needHelpUrl: String?=null,
    @SerializedName("total_bags")
    var totalBags: Int?=null,
    @SerializedName("items")
    var items: ArrayList<ProductItems>?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: DeliveryAddress?=null,
    @SerializedName("payment_status")
    var paymentStatus: String?=null,
    @SerializedName("invoice")
    var invoice: Invoice?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("promise")
    var promise: Promise?=null,
    @SerializedName("fulfilling_store")
    var fulfillingStore: FulfillingStore?=null,
    @SerializedName("total_items")
    var totalItems: Int?=null,
    @SerializedName("bags")
    var bags: ArrayList<Bags>?=null,
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    @SerializedName("payment_logo")
    var paymentLogo: String?=null,
    @SerializedName("shipment_created_at")
    var shipmentCreatedAt: String?=null,
    @SerializedName("shipment_status")
    var shipmentStatus: ShipmentStatus?=null,
    @SerializedName("user_info")
    var userInfo: ShipmentUserInfo?=null,
    @SerializedName("meta")
    var meta: ShipmentMeta?=null
    
): Parcelable


/*
    Model: ShipmentId
*/
@Parcelize
data class ShipmentId(
    
    
    @SerializedName("status_update")
    var statusUpdate: StatusUpdate?=null,
    @SerializedName("message")
    var message: @RawValue ArrayList<Any>?=null,
    @SerializedName("error")
    var error: String?=null,
    @SerializedName("status")
    var status: Boolean?=null
    
): Parcelable


/*
    Model: StatusUpdate
*/
@Parcelize
data class StatusUpdate(
    
    
    @SerializedName("status")
    var status: String?=null
    
): Parcelable


/*
    Model: ShipmentStatusUpdate
*/
@Parcelize
data class ShipmentStatusUpdate(
    
    
    @SerializedName("shipments")
    var shipments: Shipments?=null
    
): Parcelable


/*
    Model: ShipmentTrack
*/
@Parcelize
data class ShipmentTrack(
    
    
    @SerializedName("results")
    var results: ArrayList<Track>?=null
    
): Parcelable


/*
    Model: OrderSchema
*/
@Parcelize
data class OrderSchema(
    
    
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: ArrayList<BreakupValues>?=null,
    @SerializedName("order_created_time")
    var orderCreatedTime: String?=null,
    @SerializedName("shipments")
    var shipments: ArrayList<Shipments>?=null,
    @SerializedName("total_shipments_in_order")
    var totalShipmentsInOrder: Int?=null,
    @SerializedName("user_info")
    var userInfo: UserInfo?=null
    
): Parcelable


/*
    Model: PosOrderById
*/
@Parcelize
data class PosOrderById(
    
    
    @SerializedName("order")
    var order: OrderSchema?=null
    
): Parcelable


/*
    Model: Bags
*/
@Parcelize
data class Bags(
    
    
    @SerializedName("item")
    var item: Item?=null,
    @SerializedName("prices")
    var prices: Prices?=null,
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    @SerializedName("current_status")
    var currentStatus: CurrentStatus?=null,
    @SerializedName("bag_status")
    var bagStatus: ArrayList<BagStatus>?=null,
    @SerializedName("dates")
    var dates: Dates?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("status")
    var status: BagState?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("financial_breakup")
    var financialBreakup: ArrayList<FinancialBreakup>?=null,
    @SerializedName("reasons")
    var reasons: ArrayList<BagReasons>?=null,
    @SerializedName("article")
    var article: Article?=null,
    @SerializedName("journey_type")
    var journeyType: String?=null,
    @SerializedName("current_operational_status")
    var currentOperationalStatus: CurrentOperationalStatus?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("brand")
    var brand: Brand?=null,
    @SerializedName("affiliate_bag_details")
    var affiliateBagDetails: AffiliateBagDetails?=null,
    @SerializedName("gst_details")
    var gstDetails: GstDetails?=null,
    @SerializedName("bag_id")
    var bagId: Int?=null,
    @SerializedName("bag_update_time")
    var bagUpdateTime: Int?=null
    
): Parcelable


/*
    Model: Item
*/
@Parcelize
data class Item(
    
    
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    @SerializedName("brand")
    var brand: String?=null,
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("l2_category")
    var l2Category: ArrayList<String>?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    @SerializedName("last_updated_at")
    var lastUpdatedAt: String?=null,
    @SerializedName("slug_key")
    var slugKey: String?=null,
    @SerializedName("attributes")
    var attributes: BagItemAttributes?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    @SerializedName("image")
    var image: ArrayList<String>?=null
    
): Parcelable


/*
    Model: BagItemAttributes
*/
@Parcelize
data class BagItemAttributes(
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("brand_name")
    var brandName: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null
    
): Parcelable


/*
    Model: Prices
*/
@Parcelize
data class Prices(
    
    
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    @SerializedName("cashback")
    var cashback: Double?=null,
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    @SerializedName("discount")
    var discount: Double?=null,
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null
    
): Parcelable


/*
    Model: CurrentStatus
*/
@Parcelize
data class CurrentStatus(
    
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("bag_id")
    var bagId: Int?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("state_id")
    var stateId: Int?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStateMapper?=null
    
): Parcelable


/*
    Model: BagStateMapper
*/
@Parcelize
data class BagStateMapper(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("app_state_name")
    var appStateName: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("app_facing")
    var appFacing: Boolean?=null,
    @SerializedName("notify_customer")
    var notifyCustomer: Boolean?=null,
    @SerializedName("journey_type")
    var journeyType: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("state_type")
    var stateType: String?=null
    
): Parcelable


/*
    Model: BagStatus
*/
@Parcelize
data class BagStatus(
    
    
    @SerializedName("bag_id")
    var bagId: Int?=null,
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("bag_state_mapper")
    var bagStateMapper: BagStatusBagStateMapper?=null,
    @SerializedName("state_id")
    var stateId: Int?=null,
    @SerializedName("created_at")
    var createdAt: String?=null
    
): Parcelable


/*
    Model: BagStatusBagStateMapper
*/
@Parcelize
data class BagStatusBagStateMapper(
    
    
    @SerializedName("app_state_name")
    var appStateName: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    @SerializedName("app_facing")
    var appFacing: Boolean?=null,
    @SerializedName("notify_customer")
    var notifyCustomer: Boolean?=null,
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("journey_type")
    var journeyType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable


/*
    Model: Dates
*/
@Parcelize
data class Dates(
    
    
    @SerializedName("order_created")
    var orderCreated: String?=null
    
): Parcelable


/*
    Model: BagState
*/
@Parcelize
data class BagState(
    
    
    @SerializedName("is_returnable")
    var isReturnable: Boolean?=null,
    @SerializedName("can_be_cancelled")
    var canBeCancelled: Boolean?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("is_customer_return_allowed")
    var isCustomerReturnAllowed: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null
    
): Parcelable


/*
    Model: FinancialBreakup
*/
@Parcelize
data class FinancialBreakup(
    
    
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("amount_paid_roundoff")
    var amountPaidRoundoff: Double?=null,
    @SerializedName("gst_fee")
    var gstFee: String?=null,
    @SerializedName("refund_credit")
    var refundCredit: Double?=null,
    @SerializedName("cashback")
    var cashback: Double?=null,
    @SerializedName("refund_amount")
    var refundAmount: Double?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Double?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("total_units")
    var totalUnits: Int?=null,
    @SerializedName("discount")
    var discount: Double?=null,
    @SerializedName("amount_paid")
    var amountPaid: Double?=null,
    @SerializedName("fynd_credits")
    var fyndCredits: Double?=null,
    @SerializedName("added_to_fynd_cash")
    var addedToFyndCash: Boolean?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    @SerializedName("coupon_effective_discount")
    var couponEffectiveDiscount: Double?=null,
    @SerializedName("transfer_price")
    var transferPrice: Double?=null,
    @SerializedName("identifiers")
    var identifiers: Identifiers?=null,
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    @SerializedName("cod_charges")
    var codCharges: Double?=null,
    @SerializedName("item_name")
    var itemName: String?=null,
    @SerializedName("cashback_applied")
    var cashbackApplied: Double?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null
    
): Parcelable


/*
    Model: Identifiers
*/
@Parcelize
data class Identifiers(
    
    
    @SerializedName("ean")
    var ean: String?=null,
    @SerializedName("sku_code")
    var skuCode: String?=null
    
): Parcelable


/*
    Model: BagReasons
*/
@Parcelize
data class BagReasons(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("bag_id")
    var bagId: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable


/*
    Model: Article
*/
@Parcelize
data class Article(
    
    
    @SerializedName("esp_modified")
    var espModified: Boolean?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("identifiers")
    var identifiers: ArticleIdentifiers?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable


/*
    Model: ArticleIdentifiers
*/
@Parcelize
data class ArticleIdentifiers(
    
    
    @SerializedName("ean")
    var ean: String?=null,
    @SerializedName("sku_code")
    var skuCode: String?=null
    
): Parcelable


/*
    Model: ReturnConfig
*/
@Parcelize
data class ReturnConfig(
    
    
    @SerializedName("time")
    var time: Int?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("returnable")
    var returnable: Boolean?=null
    
): Parcelable


/*
    Model: CurrentOperationalStatus
*/
@Parcelize
data class CurrentOperationalStatus(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("state_id")
    var stateId: Int?=null,
    @SerializedName("kafka_sync")
    var kafkaSync: Boolean?=null,
    @SerializedName("reasons")
    var reasons: ArrayList<CurrentOperationalStatusReasons>?=null,
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("bag_id")
    var bagId: Int?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("bag_state_mapper")
    var bagStateMapper: CurrentOperationalStatusBagStateMapper?=null
    
): Parcelable


/*
    Model: CurrentOperationalStatusReasons
*/
@Parcelize
data class CurrentOperationalStatusReasons(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable


/*
    Model: CurrentOperationalStatusBagStateMapper
*/
@Parcelize
data class CurrentOperationalStatusBagStateMapper(
    
    
    @SerializedName("state_type")
    var stateType: String?=null,
    @SerializedName("app_state_name")
    var appStateName: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("journey_type")
    var journeyType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("app_display_name")
    var appDisplayName: String?=null,
    @SerializedName("app_facing")
    var appFacing: Boolean?=null,
    @SerializedName("notify_customer")
    var notifyCustomer: Boolean?=null
    
): Parcelable


/*
    Model: Brand
*/
@Parcelize
data class Brand(
    
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("brand_name")
    var brandName: String?=null,
    @SerializedName("is_virtual_invoice")
    var isVirtualInvoice: Boolean?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("credit_note_allowed")
    var creditNoteAllowed: Boolean?=null,
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable


/*
    Model: AffiliateBagDetails
*/
@Parcelize
data class AffiliateBagDetails(
    
    
    @SerializedName("affiliate_bag_id")
    var affiliateBagId: String?=null,
    @SerializedName("affiliate_order_id")
    var affiliateOrderId: String?=null,
    @SerializedName("affiliate_meta")
    var affiliateMeta: AffiliateMeta?=null,
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Int?=null,
    @SerializedName("employee_discount")
    var employeeDiscount: Int?=null
    
): Parcelable


/*
    Model: AffiliateMeta
*/
@Parcelize
data class AffiliateMeta(
    
    
    @SerializedName("size_level_total_qty")
    var sizeLevelTotalQty: Int?=null,
    @SerializedName("fynd")
    var fynd: Fynd?=null,
    @SerializedName("is_priority")
    var isPriority: Boolean?=null,
    @SerializedName("employee_discount")
    var employeeDiscount: Int?=null,
    @SerializedName("loyalty_discount")
    var loyaltyDiscount: Int?=null
    
): Parcelable


/*
    Model: Fynd
*/
@Parcelize
data class Fynd(
    
    
    @SerializedName("fulfilment_identifier")
    var fulfilmentIdentifier: String?=null
    
): Parcelable


/*
    Model: GstDetails
*/
@Parcelize
data class GstDetails(
    
    
    @SerializedName("value_of_good")
    var valueOfGood: Double?=null,
    @SerializedName("gst_tax_percentage")
    var gstTaxPercentage: Double?=null,
    @SerializedName("is_default_hsn_code")
    var isDefaultHsnCode: Boolean?=null,
    @SerializedName("brand_calculated_amount")
    var brandCalculatedAmount: Double?=null,
    @SerializedName("gst_fee")
    var gstFee: String?=null,
    @SerializedName("gst_tag")
    var gstTag: String?=null,
    @SerializedName("hsn_code")
    var hsnCode: String?=null
    
): Parcelable


/*
    Model: BreakupValues
*/
@Parcelize
data class BreakupValues(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("name")
    var name: String?=null
    
): Parcelable


/*
    Model: DeliveryAddress
*/
@Parcelize
data class DeliveryAddress(
    
    
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("address_category")
    var addressCategory: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("address")
    var address: String?=null
    
): Parcelable


/*
    Model: FulfillingStore
*/
@Parcelize
data class FulfillingStore(
    
    
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("store_address_json")
    var storeAddressJson: StoreAddressJson?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null,
    @SerializedName("brand_store_tags")
    var brandStoreTags: @RawValue ArrayList<Any>?=null,
    @SerializedName("location_type")
    var locationType: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("is_enabled_for_recon")
    var isEnabledForRecon: Boolean?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("meta")
    var meta: FulfillingStoreMeta?=null,
    @SerializedName("fulfillment_channel")
    var fulfillmentChannel: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("login_username")
    var loginUsername: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("packaging_material_count")
    var packagingMaterialCount: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable


/*
    Model: StoreAddressJson
*/
@Parcelize
data class StoreAddressJson(
    
    
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("address2")
    var address2: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("latitude")
    var latitude: Double?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("address_category")
    var addressCategory: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("pincode")
    var pincode: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("address1")
    var address1: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("contact_person")
    var contactPerson: String?=null
    
): Parcelable


/*
    Model: FulfillingStoreMeta
*/
@Parcelize
data class FulfillingStoreMeta(
    
    
    @SerializedName("additional_contact_details")
    var additionalContactDetails: AdditionalContactDetails?=null,
    @SerializedName("timing")
    var timing: ArrayList<Timing>?=null,
    @SerializedName("documents")
    var documents: Documents?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("stage")
    var stage: String?=null,
    @SerializedName("gst_number")
    var gstNumber: String?=null,
    @SerializedName("allow_dp_assignment_from_fynd")
    var allowDpAssignmentFromFynd: Boolean?=null
    
): Parcelable


/*
    Model: AdditionalContactDetails
*/
@Parcelize
data class AdditionalContactDetails(
    
    
    @SerializedName("number")
    var number: @RawValue ArrayList<Any>?=null
    
): Parcelable


/*
    Model: Timing
*/
@Parcelize
data class Timing(
    
    
    @SerializedName("opening")
    var opening: Opening?=null,
    @SerializedName("weekday")
    var weekday: String?=null,
    @SerializedName("open")
    var open: Boolean?=null,
    @SerializedName("closing")
    var closing: Closing?=null
    
): Parcelable


/*
    Model: Opening
*/
@Parcelize
data class Opening(
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable


/*
    Model: Closing
*/
@Parcelize
data class Closing(
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable


/*
    Model: Documents
*/
@Parcelize
data class Documents(
    
    
    @SerializedName("gst")
    var gst: Gst?=null
    
): Parcelable


/*
    Model: Gst
*/
@Parcelize
data class Gst(
    
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("legal_name")
    var legalName: String?=null,
    @SerializedName("type")
    var type: String?=null
    
): Parcelable


/*
    Model: Invoice
*/
@Parcelize
data class Invoice(
    
    
    @SerializedName("updated_date")
    var updatedDate: String?=null,
    @SerializedName("invoice_url")
    var invoiceUrl: String?=null,
    @SerializedName("label_url")
    var labelUrl: String?=null
    
): Parcelable


/*
    Model: ProductItems
*/
@Parcelize
data class ProductItems(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("last_updated_at")
    var lastUpdatedAt: String?=null,
    @SerializedName("brand")
    var brand: String?=null,
    @SerializedName("image")
    var image: ArrayList<String>?=null,
    @SerializedName("l3_category")
    var l3Category: Int?=null,
    @SerializedName("brand_id")
    var brandId: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("can_cancel")
    var canCancel: Boolean?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("slug_key")
    var slugKey: String?=null,
    @SerializedName("l3_category_name")
    var l3CategoryName: String?=null,
    @SerializedName("l2_category")
    var l2Category: ArrayList<String>?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    @SerializedName("l1_category")
    var l1Category: ArrayList<String>?=null,
    @SerializedName("attributes")
    var attributes: ProductItemAttributes?=null
    
): Parcelable


/*
    Model: ProductItemAttributes
*/
@Parcelize
data class ProductItemAttributes(
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("brand_name")
    var brandName: String?=null,
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null
    
): Parcelable


/*
    Model: ShipmentMeta
*/
@Parcelize
data class ShipmentMeta(
    
    
    @SerializedName("timestamp")
    var timestamp: Timestamp?=null,
    @SerializedName("bag_weight")
    var bagWeight: @RawValue HashMap<String,Any>?=null,
    @SerializedName("dp_options")
    var dpOptions: DpOptions?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("same_store_available")
    var sameStoreAvailable: Boolean?=null,
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null,
    @SerializedName("dp_id")
    var dpId: String?=null,
    @SerializedName("weight")
    var weight: Int?=null,
    @SerializedName("formatted")
    var formatted: Formatted?=null,
    @SerializedName("debug_info")
    var debugInfo: DebugInfo?=null,
    @SerializedName("dp_sort_key")
    var dpSortKey: String?=null,
    @SerializedName("packaging_name")
    var packagingName: String?=null
    
): Parcelable


/*
    Model: Timestamp
*/
@Parcelize
data class Timestamp(
    
    
    @SerializedName("max")
    var max: String?=null,
    @SerializedName("min")
    var min: String?=null
    
): Parcelable


/*
    Model: DpOptions
*/
@Parcelize
data class DpOptions(
    
    
    @SerializedName("dp_option_id")
    var dpOptionId: DpOptionId?=null
    
): Parcelable


/*
    Model: DpOptionId
*/
@Parcelize
data class DpOptionId(
    
    
    @SerializedName("f_priority")
    var fPriority: Int?=null,
    @SerializedName("operations")
    var operations: String?=null,
    @SerializedName("r_priority")
    var rPriority: Int?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("fm_priority")
    var fmPriority: Int?=null,
    @SerializedName("lm_priority")
    var lmPriority: Int?=null,
    @SerializedName("rvp_priority")
    var rvpPriority: Int?=null,
    @SerializedName("assign_dp_from_sb")
    var assignDpFromSb: Boolean?=null
    
): Parcelable


/*
    Model: Formatted
*/
@Parcelize
data class Formatted(
    
    
    @SerializedName("max")
    var max: String?=null,
    @SerializedName("min")
    var min: String?=null
    
): Parcelable


/*
    Model: DebugInfo
*/
@Parcelize
data class DebugInfo(
    
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null
    
): Parcelable


/*
    Model: Promise
*/
@Parcelize
data class Promise(
    
    
    @SerializedName("timestamp")
    var timestamp: Timestamp?=null
    
): Parcelable


/*
    Model: Reasons
*/
@Parcelize
data class Reasons(
    
    
    @SerializedName("reason_text")
    var reasonText: String?=null,
    @SerializedName("show_text_area")
    var showTextArea: Boolean?=null,
    @SerializedName("feedback_type")
    var feedbackType: String?=null,
    @SerializedName("flow")
    var flow: String?=null,
    @SerializedName("reason_id")
    var reasonId: Int?=null,
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable


/*
    Model: ShipmentStatus
*/
@Parcelize
data class ShipmentStatus(
    
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("hex_code")
    var hexCode: String?=null
    
): Parcelable


/*
    Model: ShipmentUserInfo
*/
@Parcelize
data class ShipmentUserInfo(
    
    
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("first_name")
    var firstName: String?=null,
    @SerializedName("last_name")
    var lastName: String?=null
    
): Parcelable


/*
    Model: Track
*/
@Parcelize
data class Track(
    
    
    @SerializedName("awb")
    var awb: String?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("last_location_recieved_at")
    var lastLocationRecievedAt: String?=null,
    @SerializedName("reason")
    var reason: String?=null,
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("updated_time")
    var updatedTime: String?=null,
    @SerializedName("account_name")
    var accountName: String?=null
    
): Parcelable


/*
    Model: TrackingDetails
*/
@Parcelize
data class TrackingDetails(
    
    
    @SerializedName("is_current")
    var isCurrent: Boolean?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("time")
    var time: String?=null,
    @SerializedName("is_passed")
    var isPassed: String?=null
    
): Parcelable


/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    
    @SerializedName("gender")
    var gender: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("email")
    var email: String?=null
    
): Parcelable


/*
    Model: ApefaceApiError
*/
@Parcelize
data class ApefaceApiError(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable




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
    
): Parcelable


/*
    Model: UpdateCartShipmentRequest
*/
@Parcelize
data class UpdateCartShipmentRequest(
    
    
    @SerializedName("shipments")
    var shipments: ArrayList<UpdateCartShipmentItem>?=null
    
): Parcelable


/*
    Model: Files
*/
@Parcelize
data class Files(
    
    
    @SerializedName("values")
    var values: ArrayList<String>?=null,
    @SerializedName("key")
    var key: String?=null
    
): Parcelable


/*
    Model: CartPosCheckoutRequest
*/
@Parcelize
data class CartPosCheckoutRequest(
    
    
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    @SerializedName("files")
    var files: ArrayList<Files>?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("fyndstore_emp_id")
    var fyndstoreEmpId: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("pos")
    var pos: Boolean?=null
    
): Parcelable


/*
    Model: CartDeliveryModesResponse
*/
@Parcelize
data class CartDeliveryModesResponse(
    
    
    @SerializedName("pickup_stores")
    var pickupStores: ArrayList<Int>?=null,
    @SerializedName("available_modes")
    var availableModes: ArrayList<String>?=null
    
): Parcelable


/*
    Model: PickupStoreDetail
*/
@Parcelize
data class PickupStoreDetail(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null
    
): Parcelable


/*
    Model: StoreDetailsResponse
*/
@Parcelize
data class StoreDetailsResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<PickupStoreDetail>?=null
    
): Parcelable




/*
    Model: GetPincodeCityResponse
*/
@Parcelize
data class GetPincodeCityResponse(
    
    
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: ArrayList<LogisticPincodeData>?=null
    
): Parcelable


/*
    Model: LogisticPincodeData
*/
@Parcelize
data class LogisticPincodeData(
    
    
    @SerializedName("meta")
    var meta: LogisticMeta?=null,
    @SerializedName("parents")
    var parents: ArrayList<LogisticParents>?=null,
    @SerializedName("sub_type")
    var subType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("error")
    var error: LogisticError?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable


/*
    Model: LogisticMeta
*/
@Parcelize
data class LogisticMeta(
    
    
    @SerializedName("zone")
    var zone: String?=null,
    @SerializedName("deliverables")
    var deliverables: @RawValue ArrayList<Any>?=null
    
): Parcelable


/*
    Model: LogisticParents
*/
@Parcelize
data class LogisticParents(
    
    
    @SerializedName("sub_type")
    var subType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable


/*
    Model: LogisticError
*/
@Parcelize
data class LogisticError(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: GetTatProductReqBody
*/
@Parcelize
data class GetTatProductReqBody(
    
    
    @SerializedName("location_details")
    var locationDetails: LocationDetails?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("identifier")
    var identifier: String?=null,
    @SerializedName("journey")
    var journey: String?=null
    
): Parcelable


/*
    Model: LocationDetails
*/
@Parcelize
data class LocationDetails(
    
    
    @SerializedName("from_pincode")
    var fromPincode: String?=null,
    @SerializedName("articles")
    var articles: TatProductArticles?=null,
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null
    
): Parcelable


/*
    Model: TatProductArticles
*/
@Parcelize
data class TatProductArticles(
    
    
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    @SerializedName("category")
    var category: LogisticResponseCategory?=null,
    @SerializedName("promise")
    var promise: LogisticPromise?=null
    
): Parcelable


/*
    Model: LogisticRequestCategory
*/
@Parcelize
data class LogisticRequestCategory(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable


/*
    Model: LogisticPromise
*/
@Parcelize
data class LogisticPromise(
    
    
    @SerializedName("timestamp")
    var timestamp: LogisticTimestamp?=null,
    @SerializedName("formatted")
    var formatted: Formatted?=null
    
): Parcelable


/*
    Model: LogisticTimestamp
*/
@Parcelize
data class LogisticTimestamp(
    
    
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable


/*
    Model: GetTatProductResponse
*/
@Parcelize
data class GetTatProductResponse(
    
    
    @SerializedName("location_details")
    var locationDetails: LocationDetails?=null,
    @SerializedName("request_uuid")
    var requestUuid: String?=null,
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    @SerializedName("to_city")
    var toCity: String?=null,
    @SerializedName("source")
    var source: String?=null,
    @SerializedName("to_pincode")
    var toPincode: String?=null,
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("identifier")
    var identifier: String?=null,
    @SerializedName("journey")
    var journey: String?=null
    
): Parcelable


/*
    Model: LogisticResponseCategory
*/
@Parcelize
data class LogisticResponseCategory(
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("level")
    var level: String?=null
    
): Parcelable


