package com.sdk.application

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import com.google.gson.annotations.SerializedName


/*
    Model: ProductDetailAttribute
*/
@Parcelize
data class ProductDetailAttribute(
    
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("key")
    var key: String?=null,
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
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
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
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable


/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null
    
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
    Model: Price
*/
@Parcelize
data class Price(
    
    
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("max")
    var max: Double?=null
    
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
    
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null
    
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
    Model: SizeChartValues
*/
@Parcelize
data class SizeChartValues(
    
    
    @SerializedName("col_4")
    var col4: String?=null,
    @SerializedName("col_3")
    var col3: String?=null,
    @SerializedName("col_5")
    var col5: String?=null,
    @SerializedName("col_1")
    var col1: String?=null,
    @SerializedName("col_2")
    var col2: String?=null,
    @SerializedName("col_6")
    var col6: String?=null
    
): Parcelable


/*
    Model: ColumnHeader
*/
@Parcelize
data class ColumnHeader(
    
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("convertable")
    var convertable: Boolean?=null
    
): Parcelable


/*
    Model: ColumnHeaders
*/
@Parcelize
data class ColumnHeaders(
    
    
    @SerializedName("col_4")
    var col4: ColumnHeader?=null,
    @SerializedName("col_3")
    var col3: ColumnHeader?=null,
    @SerializedName("col_5")
    var col5: ColumnHeader?=null,
    @SerializedName("col_1")
    var col1: ColumnHeader?=null,
    @SerializedName("col_2")
    var col2: ColumnHeader?=null,
    @SerializedName("col_6")
    var col6: ColumnHeader?=null
    
): Parcelable


/*
    Model: SizeChart
*/
@Parcelize
data class SizeChart(
    
    
    @SerializedName("image")
    var image: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("size_tip")
    var sizeTip: String?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<SizeChartValues>?=null,
    @SerializedName("headers")
    var headers: ColumnHeaders?=null,
    @SerializedName("unit")
    var unit: String?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable


/*
    Model: ProductSizes
*/
@Parcelize
data class ProductSizes(
    
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSize>?=null,
    @SerializedName("stores")
    var stores: ProductSizeStores?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("size_chart")
    var sizeChart: SizeChart?=null
    
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
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("size_distribution")
    var sizeDistribution: ProductSetDistribution?=null
    
): Parcelable


/*
    Model: ProductStockPrice
*/
@Parcelize
data class ProductStockPrice(
    
    
    @SerializedName("effective")
    var effective: Double?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("marked")
    var marked: Double?=null
    
): Parcelable


/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    
    @SerializedName("level")
    var level: String?=null,
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable


/*
    Model: Seller
*/
@Parcelize
data class Seller(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable


/*
    Model: Store
*/
@Parcelize
data class Store(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable


/*
    Model: ProductSizePriceResponse
*/
@Parcelize
data class ProductSizePriceResponse(
    
    
    @SerializedName("set")
    var set: ProductSet?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    @SerializedName("long_lat")
    var longLat: ArrayList<Double>?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("price_per_price")
    var pricePerPrice: ProductStockPrice?=null,
    @SerializedName("special_badge")
    var specialBadge: String?=null,
    @SerializedName("seller")
    var seller: Seller?=null,
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("store")
    var store: Store?=null,
    @SerializedName("seller_count")
    var sellerCount: Int?=null,
    @SerializedName("pincode")
    var pincode: Int?=null
    
): Parcelable


/*
    Model: ProductSizeSellerFilter
*/
@Parcelize
data class ProductSizeSellerFilter(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable


/*
    Model: ProductSizeSellersResponse
*/
@Parcelize
data class ProductSizeSellersResponse(
    
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSizeSellerFilter>?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<ProductSizePriceResponse>?=null
    
): Parcelable


/*
    Model: AttributeDetail
*/
@Parcelize
data class AttributeDetail(
    
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable


/*
    Model: ProductsComparisonResponse
*/
@Parcelize
data class ProductsComparisonResponse(
    
    
    @SerializedName("attributes_metadata")
    var attributesMetadata: ArrayList<AttributeDetail>?=null,
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null
    
): Parcelable


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
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null
    
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
    
    
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("color_name")
    var colorName: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null
    
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
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable


/*
    Model: CompanyDetail
*/
@Parcelize
data class CompanyDetail(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable


/*
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("store")
    var store: StoreDetail?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("seller")
    var seller: Seller?=null,
    @SerializedName("company")
    var company: CompanyDetail?=null
    
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
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
    
): Parcelable


/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("item_code")
    var itemCode: String?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null
    
): Parcelable


/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("display_format")
    var displayFormat: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    @SerializedName("query_format")
    var queryFormat: String?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("max")
    var max: Int?=null
    
): Parcelable


/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("logo")
    var logo: String?=null,
    @SerializedName("kind")
    var kind: String?=null
    
): Parcelable


/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    
    @SerializedName("values")
    var values: ArrayList<ProductFiltersValue>?=null,
    @SerializedName("key")
    var key: ProductFiltersKey?=null
    
): Parcelable


/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    @SerializedName("page")
    var page: Page?=null,
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
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
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
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable


/*
    Model: DepartmentIdentifier
*/
@Parcelize
data class DepartmentIdentifier(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null
    
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
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    Model: CategoryListingResponse
*/
@Parcelize
data class CategoryListingResponse(
    
    
    @SerializedName("departments")
    var departments: ArrayList<DepartmentIdentifier>?=null,
    @SerializedName("data")
    var data: ArrayList<DepartmentCategoryTree>?=null
    
): Parcelable


/*
    Model: CategoryMetaResponse
*/
@Parcelize
data class CategoryMetaResponse(
    
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
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
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: Department
*/
@Parcelize
data class Department(
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null
    
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
    
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("display")
    var display: String?=null
    
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
    
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable


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
    
): Parcelable


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
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null
    
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
    
    
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("lat_long")
    var latLong: LatLong?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("store_code")
    var storeCode: String?=null
    
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
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("selling")
    var selling: Double?=null,
    @SerializedName("effective")
    var effective: Double?=null,
    @SerializedName("add_on")
    var addOn: Double?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("marked")
    var marked: Double?=null
    
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
    
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null
    
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
    Model: Product
*/
@Parcelize
data class Product(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("images")
    var images: ArrayList<Image>?=null,
    @SerializedName("action")
    var action: ProductAction?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("brand")
    var brand: BaseInfo?=null
    
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
    Model: BasePrice
*/
@Parcelize
data class BasePrice(
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("marked")
    var marked: Double?=null,
    @SerializedName("effective")
    var effective: Double?=null
    
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
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("store")
    var store: BaseInfo?=null
    
): Parcelable


/*
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
): Parcelable


/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    @SerializedName("product")
    var product: Product?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    @SerializedName("article")
    var article: ProductArticle?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("availability")
    var availability: ProductAvailability?=null
    
): Parcelable


/*
    Model: CartCurrency
*/
@Parcelize
data class CartCurrency(
    
    
    @SerializedName("symbol")
    var symbol: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable


/*
    Model: PromiseTimestamp
*/
@Parcelize
data class PromiseTimestamp(
    
    
    @SerializedName("max")
    var max: Double?=null,
    @SerializedName("min")
    var min: Double?=null
    
): Parcelable


/*
    Model: PromiseFormatted
*/
@Parcelize
data class PromiseFormatted(
    
    
    @SerializedName("max")
    var max: String?=null,
    @SerializedName("min")
    var min: String?=null
    
): Parcelable


/*
    Model: ShipmentPromise
*/
@Parcelize
data class ShipmentPromise(
    
    
    @SerializedName("timestamp")
    var timestamp: PromiseTimestamp?=null,
    @SerializedName("formatted")
    var formatted: PromiseFormatted?=null
    
): Parcelable


/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    @SerializedName("key")
    var key: String?=null
    
): Parcelable


/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("coupon")
    var coupon: Double?=null,
    @SerializedName("total")
    var total: Double?=null
    
): Parcelable


/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable


/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("total")
    var total: Double?=null,
    @SerializedName("applicable")
    var applicable: Double?=null
    
): Parcelable


/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null,
    @SerializedName("raw")
    var raw: RawBreakup?=null,
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null,
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null
    
): Parcelable


/*
    Model: CartResponse
*/
@Parcelize
data class CartResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
): Parcelable


/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("pos")
    var pos: Boolean?=null,
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("item_size")
    var itemSize: String?=null
    
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
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("partial")
    var partial: Boolean?=null,
    @SerializedName("cart")
    var cart: CartResponse?=null
    
): Parcelable


/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("item_size")
    var itemSize: String?=null
    
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
    
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("cart")
    var cart: CartResponse?=null
    
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
    Model: PageCoupon
*/
@Parcelize
data class PageCoupon(
    
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable


/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    @SerializedName("title")
    var title: String?=null
    
): Parcelable


/*
    Model: GetCouponResponse
*/
@Parcelize
data class GetCouponResponse(
    
    
    @SerializedName("page")
    var page: PageCoupon?=null,
    @SerializedName("available_coupon_list")
    var availableCouponList: ArrayList<Coupon>?=null
    
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
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("marked")
    var marked: Int?=null
    
): Parcelable


/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("margin")
    var margin: Int?=null,
    @SerializedName("price")
    var price: OfferPrice?=null,
    @SerializedName("best")
    var best: Boolean?=null,
    @SerializedName("auto_applied")
    var autoApplied: Boolean?=null,
    @SerializedName("total")
    var total: Double?=null
    
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
    Model: BulkPriceOffer
*/
@Parcelize
data class BulkPriceOffer(
    
    
    @SerializedName("offers")
    var offers: ArrayList<OfferItem>?=null,
    @SerializedName("seller")
    var seller: OfferSeller?=null
    
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
    
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    @SerializedName("latitude")
    var latitude: Double?=null
    
): Parcelable


/*
    Model: Address
*/
@Parcelize
data class Address(
    
    
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("google_map_point")
    var googleMapPoint: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("state")
    var state: String?=null
    
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
    
    
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("is_updated")
    var isUpdated: Boolean?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null
    
): Parcelable


/*
    Model: DeleteAddressResponse
*/
@Parcelize
data class DeleteAddressResponse(
    
    
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("is_deleted")
    var isDeleted: Boolean?=null
    
): Parcelable


/*
    Model: SelectCartAddressRequest
*/
@Parcelize
data class SelectCartAddressRequest(
    
    
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("address_id")
    var addressId: String?=null,
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable


/*
    Model: UpdateCartPaymentRequest
*/
@Parcelize
data class UpdateCartPaymentRequest(
    
    
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null
    
): Parcelable


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
    @SerializedName("display_message_en")
    var displayMessageEn: String?=null,
    @SerializedName("code")
    var code: String?=null
    
): Parcelable


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
    
): Parcelable


/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("promise")
    var promise: ShipmentPromise?=null,
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    @SerializedName("shipments")
    var shipments: Int?=null,
    @SerializedName("box_type")
    var boxType: String?=null,
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("dp_id")
    var dpId: Int?=null,
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null
    
): Parcelable


/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("error")
    var error: Boolean?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
): Parcelable


/*
    Model: CartCheckoutRequest
*/
@Parcelize
data class CartCheckoutRequest(
    
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    @SerializedName("fyndstore_emp_id")
    var fyndstoreEmpId: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("error_message")
    var errorMessage: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("user_type")
    var userType: String?=null,
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("cod_message")
    var codMessage: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null
    
): Parcelable


/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("cart")
    var cart: CheckCart?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null
    
): Parcelable


/*
    Model: CartMetaRequest
*/
@Parcelize
data class CartMetaRequest(
    
    
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null
    
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
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
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
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: SharedCart
*/
@Parcelize
data class SharedCart(
    
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null
    
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
    
): Parcelable


/*
    Model: CreateUserResponseSchema
*/
@Parcelize
data class CreateUserResponseSchema(
    
    
    @SerializedName("user")
    var user: UserSchema?=null
    
): Parcelable


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
    
): Parcelable


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
    var register: Boolean?=null,
    @SerializedName("mobile_image")
    var mobileImage: String?=null,
    @SerializedName("desktop_image")
    var desktopImage: String?=null
    
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
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null
    
): Parcelable


/*
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    
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
    
): Parcelable


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
    
): Parcelable


/*
    Model: CommunicationConsentChannelsEmail
*/
@Parcelize
data class CommunicationConsentChannelsEmail(
    
    
    @SerializedName("response")
    var response: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable


/*
    Model: CommunicationConsentChannelsSms
*/
@Parcelize
data class CommunicationConsentChannelsSms(
    
    
    @SerializedName("response")
    var response: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    
): Parcelable


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
    Model: CampaignShortLink
*/
@Parcelize
data class CampaignShortLink(
    
    
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
    var campaign: CampaignShortLink?=null,
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
    var campaign: CampaignShortLink?=null,
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
    Model: ErrorRes
*/
@Parcelize
data class ErrorRes(
    
    
    @SerializedName("message")
    var message: String?=null
    
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
    
    
    @SerializedName("merchant_id")
    var merchantId: String?=null,
    @SerializedName("verify_api")
    var verifyApi: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("merchant_key")
    var merchantKey: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("api")
    var api: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("pin")
    var pin: String?=null,
    @SerializedName("sdk")
    var sdk: Boolean?=null,
    @SerializedName("secret")
    var secret: String?=null
    
): Parcelable


/*
    Model: AggregatorsConfigDetailResponse
*/
@Parcelize
data class AggregatorsConfigDetailResponse(
    
    
    @SerializedName("juspay")
    var juspay: AggregatorConfigDetail?=null,
    @SerializedName("ccavenue")
    var ccavenue: AggregatorConfigDetail?=null,
    @SerializedName("payumoney")
    var payumoney: AggregatorConfigDetail?=null,
    @SerializedName("rupifi")
    var rupifi: AggregatorConfigDetail?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("stripe")
    var stripe: AggregatorConfigDetail?=null,
    @SerializedName("razorpay")
    var razorpay: AggregatorConfigDetail?=null,
    @SerializedName("env")
    var env: String?=null,
    @SerializedName("simpl")
    var simpl: AggregatorConfigDetail?=null,
    @SerializedName("mswipe")
    var mswipe: AggregatorConfigDetail?=null
    
): Parcelable


/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable


/*
    Model: HttpErrorCodeAndResponse
*/
@Parcelize
data class HttpErrorCodeAndResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("error")
    var error: ErrorCodeAndDescription?=null
    
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
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: CardPaymentGateway
*/
@Parcelize
data class CardPaymentGateway(
    
    
    @SerializedName("api")
    var api: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("customer_id")
    var customerId: String?=null
    
): Parcelable


/*
    Model: ActiveCardPaymentGatewayResponse
*/
@Parcelize
data class ActiveCardPaymentGatewayResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("cards")
    var cards: CardPaymentGateway?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: Card
*/
@Parcelize
data class Card(
    
    
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null
    
): Parcelable


/*
    Model: ListCardsResponse
*/
@Parcelize
data class ListCardsResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: ArrayList<Card>?=null,
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
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("merchant_params")
    var merchantParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null,
    @SerializedName("payload")
    var payload: String?=null
    
): Parcelable


/*
    Model: ValidateCustomerResponse
*/
@Parcelize
data class ValidateCustomerResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: ChargeCustomerRequest
*/
@Parcelize
data class ChargeCustomerRequest(
    
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("transaction_token")
    var transactionToken: String?=null
    
): Parcelable


/*
    Model: ChargeCustomerResponse
*/
@Parcelize
data class ChargeCustomerResponse(
    
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("delivery_address_id")
    var deliveryAddressId: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("status")
    var status: String?=null
    
): Parcelable


/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    @SerializedName("customer_id")
    var customerId: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null
    
): Parcelable


/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    
    @SerializedName("bqr_image")
    var bqrImage: String?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    @SerializedName("customer_id")
    var customerId: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("vpa")
    var vpa: String?=null
    
): Parcelable


/*
    Model: PaymentStatusUpdateRequest
*/
@Parcelize
data class PaymentStatusUpdateRequest(
    
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("contact")
    var contact: String?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    @SerializedName("email")
    var email: String?=null,
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
    Model: PaymentModeLogo
*/
@Parcelize
data class PaymentModeLogo(
    
    
    @SerializedName("small")
    var small: String?=null,
    @SerializedName("large")
    var large: String?=null
    
): Parcelable


/*
    Model: PaymentModeList
*/
@Parcelize
data class PaymentModeList(
    
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("intent_flow")
    var intentFlow: String?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null
    
): Parcelable


/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null
    
): Parcelable


/*
    Model: AggregatorRoute
*/
@Parcelize
data class AggregatorRoute(
    
    
    @SerializedName("api_link")
    var apiLink: String?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payment_flow")
    var paymentFlow: String?=null
    
): Parcelable


/*
    Model: PaymentFlow
*/
@Parcelize
data class PaymentFlow(
    
    
    @SerializedName("fynd")
    var fynd: AggregatorRoute?=null,
    @SerializedName("juspay")
    var juspay: AggregatorRoute?=null,
    @SerializedName("ccavenue")
    var ccavenue: AggregatorRoute?=null,
    @SerializedName("bqr_razorpay")
    var bqrRazorpay: AggregatorRoute?=null,
    @SerializedName("rupifi")
    var rupifi: AggregatorRoute?=null,
    @SerializedName("payubiz")
    var payubiz: AggregatorRoute?=null,
    @SerializedName("upi_razorpay")
    var upiRazorpay: AggregatorRoute?=null,
    @SerializedName("stripe")
    var stripe: AggregatorRoute?=null,
    @SerializedName("razorpay")
    var razorpay: AggregatorRoute?=null,
    @SerializedName("simpl")
    var simpl: AggregatorRoute?=null,
    @SerializedName("msipe")
    var msipe: AggregatorRoute?=null
    
): Parcelable


/*
    Model: PaymentOptionAndFlow
*/
@Parcelize
data class PaymentOptionAndFlow(
    
    
    @SerializedName("payment_option")
    var paymentOption: ArrayList<RootPaymentMode>?=null,
    @SerializedName("payment_flows")
    var paymentFlows: PaymentFlow?=null
    
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
    
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    @SerializedName("bank_name")
    var bankName: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("branch_name")
    var branchName: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("comment")
    var comment: Boolean?=null,
    @SerializedName("account_no")
    var accountNo: String?=null,
    @SerializedName("mobile")
    var mobile: Boolean?=null,
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null
    
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
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("description")
    var description: String?=null
    
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
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("description")
    var description: String?=null
    
): Parcelable


/*
    Model: AddBeneficiaryViaOtpVerificationRequest
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationRequest(
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("hash_key")
    var hashKey: String?=null,
    @SerializedName("otp")
    var otp: String?=null
    
): Parcelable


/*
    Model: AddBeneficiaryViaOtpVerificationResponse
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationResponse(
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("hash_key")
    var hashKey: String?=null,
    @SerializedName("otp")
    var otp: String?=null
    
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
    
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    @SerializedName("bank_name")
    var bankName: String?=null,
    @SerializedName("branch_name")
    var branchName: String?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("account_no")
    var accountNo: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null
    
): Parcelable


/*
    Model: AddBeneficiaryDetailsRequest
*/
@Parcelize
data class AddBeneficiaryDetailsRequest(
    
    
    @SerializedName("delights")
    var delights: Boolean?=null,
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    @SerializedName("details")
    var details: BankDetails?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("transfer_mode")
    var transferMode: String?=null
    
): Parcelable


/*
    Model: RefundAccountResponse
*/
@Parcelize
data class RefundAccountResponse(
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


/*
    Model: WalletOtpRequest
*/
@Parcelize
data class WalletOtpRequest(
    
    
    @SerializedName("mobile")
    var mobile: Boolean?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
    
): Parcelable


/*
    Model: WalletOtpResponse
*/
@Parcelize
data class WalletOtpResponse(
    
    
    @SerializedName("request_id")
    var requestId: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: String?=null
    
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
    
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("values")
    var values: ArrayList<String>?=null
    
): Parcelable


/*
    Model: CartPosCheckoutRequest
*/
@Parcelize
data class CartPosCheckoutRequest(
    
    
    @SerializedName("fyndstore_emp_id")
    var fyndstoreEmpId: String?=null,
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("files")
    var files: ArrayList<Files>?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("pos")
    var pos: Boolean?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address_id")
    var addressId: Int?=null
    
): Parcelable


/*
    Model: CartDeliveryModesResponse
*/
@Parcelize
data class CartDeliveryModesResponse(
    
    
    @SerializedName("available_modes")
    var availableModes: ArrayList<String>?=null,
    @SerializedName("pickup_stores")
    var pickupStores: ArrayList<Int>?=null
    
): Parcelable


/*
    Model: PickupStoreDetail
*/
@Parcelize
data class PickupStoreDetail(
    
    
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
    
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
    Model: Formatted
*/
@Parcelize
data class Formatted(
    
    
    @SerializedName("min")
    var min: String?=null,
    @SerializedName("max")
    var max: String?=null
    
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


/*
    Model: ApefaceApiError
*/
@Parcelize
data class ApefaceApiError(
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable


