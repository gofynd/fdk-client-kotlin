package com.sdk.application

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import com.google.gson.annotations.SerializedName


/*
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
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
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

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
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("details")
    var details: ArrayList<ProductDetailAttribute>?=null
): Parcelable

/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("color")
    var color: String?=null
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
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    @SerializedName("quantity")
    var quantity: Int?=null
): Parcelable

/*
    Model: Price
*/
@Parcelize
data class Price(
    
    @SerializedName("max")
    var max: Double?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("min")
    var min: Double?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
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
    Model: ProductSizeStores
*/
@Parcelize
data class ProductSizeStores(
    
    @SerializedName("count")
    var count: Int?=null
): Parcelable

/*
    Model: ProductSizes
*/
@Parcelize
data class ProductSizes(
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("size_chart")
    var sizeChart: @RawValue HashMap<String,Any>?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSize>?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("stores")
    var stores: ProductSizeStores?=null
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
    
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("seller")
    var seller: Seller?=null,
    @SerializedName("long_lat")
    var longLat: ArrayList<Double>?=null,
    @SerializedName("store")
    var store: Store?=null,
    @SerializedName("special_badge")
    var specialBadge: String?=null,
    @SerializedName("seller_count")
    var sellerCount: Int?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("set")
    var set: @RawValue HashMap<String,Any>?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("price_per_price")
    var pricePerPrice: ProductStockPrice?=null,
    @SerializedName("price")
    var price: ProductStockPrice?=null
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
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null
): Parcelable

/*
    Model: ProductSizeSellerFilter
*/
@Parcelize
data class ProductSizeSellerFilter(
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
): Parcelable

/*
    Model: ProductSizeSellersResponse
*/
@Parcelize
data class ProductSizeSellersResponse(
    
    @SerializedName("items")
    var items: ArrayList<ProductSizePriceResponse>?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSizeSellerFilter>?=null
): Parcelable

/*
    Model: AttributeDetail
*/
@Parcelize
data class AttributeDetail(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("description")
    var description: String?=null
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
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("attributes_metadata")
    var attributesMetadata: ArrayList<AttributeDetail>?=null,
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null
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
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("color_name")
    var colorName: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

/*
    Model: ProductVariantResponse
*/
@Parcelize
data class ProductVariantResponse(
    
    @SerializedName("items")
    var items: ArrayList<ProductVariantItemResponse>?=null,
    @SerializedName("header")
    var header: String?=null,
    @SerializedName("display_type")
    var displayType: String?=null
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
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("code")
    var code: String?=null
): Parcelable

/*
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    @SerializedName("company")
    var company: CompanyDetail?=null,
    @SerializedName("seller")
    var seller: Seller?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("store")
    var store: StoreDetail?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    @SerializedName("uid")
    var uid: String?=null
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
    
    @SerializedName("items")
    var items: ArrayList<ProductStockStatusItem>?=null,
    @SerializedName("page")
    var page: Page?=null
): Parcelable

/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("color")
    var color: String?=null
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
    @SerializedName("kind")
    var kind: String?=null,
    @SerializedName("logo")
    var logo: String?=null
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("query_format")
    var queryFormat: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("max")
    var max: Int?=null,
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    @SerializedName("display_format")
    var displayFormat: String?=null
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
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
): Parcelable

/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null,
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null
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
    
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    @SerializedName("items")
    var items: ArrayList<BrandItem>?=null,
    @SerializedName("page")
    var page: Page?=null
): Parcelable

/*
    Model: BrandDetailResponse
*/
@Parcelize
data class BrandDetailResponse(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("uid")
    var uid: Int?=null
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
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    @SerializedName("items")
    var items: ArrayList<CategoryItems>?=null,
    @SerializedName("department")
    var department: String?=null
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
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

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
): Parcelable

/*
    Model: Department
*/
@Parcelize
data class Department(
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
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
    Model: Query
*/
@Parcelize
data class Query(
    
    @SerializedName("brand")
    var brand: ArrayList<String>?=null,
    @SerializedName("category")
    var category: ArrayList<String>?=null
): Parcelable

/*
    Model: AutocompletePage
*/
@Parcelize
data class AutocompletePage(
    
    @SerializedName("query")
    var query: Query?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: Action
*/
@Parcelize
data class Action(
    
    @SerializedName("page")
    var page: AutocompletePage?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: AutocompleteItem
*/
@Parcelize
data class AutocompleteItem(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("action")
    var action: Action?=null,
    @SerializedName("logo")
    var logo: Media?=null
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
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
): Parcelable

/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null
): Parcelable

/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    @SerializedName("type")
    var type: ArrayList<CollectionListingFilterType>?=null,
    @SerializedName("tags")
    var tags: ArrayList<CollectionListingFilterTag>?=null
): Parcelable

/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null,
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    @SerializedName("page")
    var page: Page?=null
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: GetFollowListingResponse
*/
@Parcelize
data class GetFollowListingResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: Page?=null
): Parcelable

/*
    Model: FollowPostResponse
*/
@Parcelize
data class FollowPostResponse(
    
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("message")
    var message: String?=null
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
    
    @SerializedName("collections")
    var collections: ArrayList<Int>?=null,
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("products")
    var products: ArrayList<Int>?=null
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
    
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null,
    @SerializedName("lat_long")
    var latLong: LatLong?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
): Parcelable

/*
    Model: StoreListingResponse
*/
@Parcelize
data class StoreListingResponse(
    
    @SerializedName("items")
    var items: ArrayList<Store1>?=null,
    @SerializedName("page")
    var page: Page?=null
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
    Model: Image
*/
@Parcelize
data class Image(
    
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    @SerializedName("url")
    var url: String?=null
): Parcelable

/*
    Model: Product
*/
@Parcelize
data class Product(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("action")
    var action: ProductAction?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    @SerializedName("images")
    var images: ArrayList<Image>?=null
): Parcelable

/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    @SerializedName("marked")
    var marked: Double?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("effective")
    var effective: Double?=null,
    @SerializedName("selling")
    var selling: Double?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("add_on")
    var addOn: Double?=null
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
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null
): Parcelable

/*
    Model: BasePrice
*/
@Parcelize
data class BasePrice(
    
    @SerializedName("marked")
    var marked: Double?=null,
    @SerializedName("effective")
    var effective: Double?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
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
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("store")
    var store: BaseInfo?=null
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
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    @SerializedName("product")
    var product: Product?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("article")
    var article: ProductArticle?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null
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
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("description")
    var description: String?=null
): Parcelable

/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    @SerializedName("total")
    var total: Double?=null,
    @SerializedName("coupon")
    var coupon: Double?=null,
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null
): Parcelable

/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("value")
    var value: Double?=null
): Parcelable

/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: Double?=null
): Parcelable

/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    @SerializedName("raw")
    var raw: RawBreakup?=null,
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null,
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null
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
    Model: CartResponse
*/
@Parcelize
data class CartResponse(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("comment")
    var comment: String?=null
): Parcelable

/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("pos")
    var pos: Boolean?=null,
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
    
    @SerializedName("partial")
    var partial: Boolean?=null,
    @SerializedName("cart")
    var cart: CartResponse?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
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
    
    @SerializedName("cart")
    var cart: CartResponse?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
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
    
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null
): Parcelable

/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("sub_title")
    var subTitle: String?=null,
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null
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
    
    @SerializedName("marked")
    var marked: Int?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("effective")
    var effective: Int?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("bulk_effective")
    var bulkEffective: Double?=null
): Parcelable

/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("price")
    var price: OfferPrice?=null,
    @SerializedName("total")
    var total: Double?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("auto_applied")
    var autoApplied: Boolean?=null,
    @SerializedName("margin")
    var margin: Int?=null,
    @SerializedName("best")
    var best: Boolean?=null
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
    
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("city")
    var city: String?=null
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
    
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("success")
    var success: String?=null
): Parcelable

/*
    Model: UpdateAddressResponse
*/
@Parcelize
data class UpdateAddressResponse(
    
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("is_updated")
    var isUpdated: Boolean?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("success")
    var success: Boolean?=null
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
    
    @SerializedName("address_id")
    var addressId: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null
): Parcelable

/*
    Model: UpdateCartPaymentRequest
*/
@Parcelize
data class UpdateCartPaymentRequest(
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null
): Parcelable

/*
    Model: CouponValidity
*/
@Parcelize
data class CouponValidity(
    
    @SerializedName("discount")
    var discount: Double?=null,
    @SerializedName("display_message_en")
    var displayMessageEn: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("valid")
    var valid: Boolean?=null
): Parcelable

/*
    Model: PaymentUpdate
*/
@Parcelize
data class PaymentUpdate(
    
    @SerializedName("coupon_validity")
    var couponValidity: CouponValidity?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    @SerializedName("box_type")
    var boxType: String?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    @SerializedName("dp_id")
    var dpId: Int?=null,
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    @SerializedName("shipments")
    var shipments: Int?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    @SerializedName("promise")
    var promise: ShipmentPromise?=null
): Parcelable

/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("comment")
    var comment: String?=null
): Parcelable

/*
    Model: CartCheckoutRequest
*/
@Parcelize
data class CartCheckoutRequest(
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("fyndstore_emp_id")
    var fyndstoreEmpId: String?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null
): Parcelable

/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("cod_message")
    var codMessage: String?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("error_message")
    var errorMessage: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("user_type")
    var userType: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("comment")
    var comment: String?=null
): Parcelable

/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("cart")
    var cart: CheckCart?=null,
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null
): Parcelable

/*
    Model: CartMetaRequest
*/
@Parcelize
data class CartMetaRequest(
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
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
    
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("share_url")
    var shareUrl: String?=null
): Parcelable

/*
    Model: SharedCartDetails
*/
@Parcelize
data class SharedCartDetails(
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null,
    @SerializedName("token")
    var token: String?=null
): Parcelable

/*
    Model: SharedCart
*/
@Parcelize
data class SharedCart(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("comment")
    var comment: String?=null
): Parcelable

/*
    Model: SharedCartResponse
*/
@Parcelize
data class SharedCartResponse(
    
    @SerializedName("cart")
    var cart: SharedCart?=null,
    @SerializedName("error")
    var error: String?=null
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
    var priorities: Priority?=null,
    @SerializedName("categories")
    var categories: Category?=null,
    @SerializedName("statuses")
    var statuses: Status?=null,
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
    var response: @RawValue ArrayList<HashMap<String,Any>>?=null
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
    var phoneNumbers: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("emails")
    var emails: @RawValue ArrayList<HashMap<String,Any>>?=null,
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
    var debug: @RawValue HashMap<String,Any>?=null,
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
    Model: Category
*/
@Parcelize
data class Category(
    
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
    var id: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null
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
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("createdAt")
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
    var category: Category?=null,
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
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("createdAt")
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
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("kind")
    var kind: String?=null
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
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("version")
    var version: String?=null,
    @SerializedName("parentThemeVersion")
    var parentThemeVersion: String?=null,
    @SerializedName("parentTheme")
    var parentTheme: String?=null,
    @SerializedName("information")
    var information: @RawValue HashMap<String,Any>?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("src")
    var src: @RawValue HashMap<String,Any>?=null,
    @SerializedName("assets")
    var assets: @RawValue HashMap<String,Any>?=null,
    @SerializedName("available_pages")
    var availablePages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("pages")
    var pages: @RawValue HashMap<String,Any>?=null,
    @SerializedName("available_sections")
    var availableSections: ArrayList<availableSectionSchema>?=null,
    @SerializedName("sections")
    var sections: ArrayList<sectionSchema>?=null,
    @SerializedName("constants")
    var constants: @RawValue HashMap<String,Any>?=null,
    @SerializedName("styles")
    var styles: @RawValue HashMap<String,Any>?=null,
    @SerializedName("config")
    var config: @RawValue HashMap<String,Any>?=null,
    @SerializedName("settings")
    var settings: @RawValue HashMap<String,Any>?=null,
    @SerializedName("font")
    var font: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("__v")
    var v: Int?=null,
    @SerializedName("colors")
    var colors: @RawValue HashMap<String,Any>?=null
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
    var sections: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: availableSectionSchema
*/
@Parcelize
data class availableSectionSchema(
    
    @SerializedName("blocks")
    var blocks: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("label")
    var label: String?=null,
    @SerializedName("props")
    var props: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: sectionSchema
*/
@Parcelize
data class sectionSchema(
    
    @SerializedName("page_key")
    var pageKey: String?=null,
    @SerializedName("page_sections")
    var pageSections: @RawValue ArrayList<HashMap<String,Any>>?=null
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
    @SerializedName("androidHash")
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
    @SerializedName("androidHash")
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
    var phone: @RawValue HashMap<String,Any>?=null,
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
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null
): Parcelable

/*
    Model: PasswordLoginRequestSchema
*/
@Parcelize
data class PasswordLoginRequestSchema(
    
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null,
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
    @SerializedName("g-recaptcha-response")
    var gRecaptchaResponse: String?=null,
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
    var oauth2: @RawValue HashMap<String,Any>?=null,
    @SerializedName("profile")
    var profile: @RawValue HashMap<String,Any>?=null
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
    var user: @RawValue HashMap<String,Any>?=null
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
    @SerializedName("userExists")
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
    Model: PlatformSchema
*/
@Parcelize
data class PlatformSchema(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("look_and_feel")
    var lookAndFeel: @RawValue HashMap<String,Any>?=null,
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("forgot_password")
    var forgotPassword: Boolean?=null,
    @SerializedName("login")
    var login: @RawValue HashMap<String,Any>?=null,
    @SerializedName("skip_captcha")
    var skipCaptcha: Boolean?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("social")
    var social: @RawValue HashMap<String,Any>?=null,
    @SerializedName("required_fields")
    var requiredFields: @RawValue HashMap<String,Any>?=null,
    @SerializedName("register_required_fields")
    var registerRequiredFields: @RawValue HashMap<String,Any>?=null,
    @SerializedName("skip_login")
    var skipLogin: Boolean?=null,
    @SerializedName("flash_card")
    var flashCard: @RawValue HashMap<String,Any>?=null,
    @SerializedName("subtext")
    var subtext: String?=null,
    @SerializedName("social_tokens")
    var socialTokens: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("register")
    var register: Boolean?=null
): Parcelable



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
    @SerializedName("faq")
    var faq: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("__v")
    var v: Double?=null
): Parcelable

/*
    Model: Seo
*/
@Parcelize
data class Seo(
    
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("robots_txt")
    var robotsTxt: String?=null,
    @SerializedName("sitemap_enabled")
    var sitemapEnabled: Boolean?=null,
    @SerializedName("custom_meta_tags")
    var customMetaTags: @RawValue ArrayList<Any>?=null,
    @SerializedName("details")
    var details: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: StorefrontAnnouncement
*/
@Parcelize
data class StorefrontAnnouncement(
    
    @SerializedName("announcements")
    var announcements: @RawValue HashMap<String,Any>?=null,
    @SerializedName("refresh_rate")
    var refreshRate: Int?=null,
    @SerializedName("refresh_pages")
    var refreshPages: ArrayList<String>?=null
): Parcelable

/*
    Model: AdminAnnouncementSchema
*/
@Parcelize
data class AdminAnnouncementSchema(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("announcement")
    var announcement: String?=null,
    @SerializedName("pages")
    var pages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("editor_meta")
    var editorMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("modified_at")
    var modifiedAt: String?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ScheduleSchema
*/
@Parcelize
data class ScheduleSchema(
    
    @SerializedName("schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null
): Parcelable

/*
    Model: BlogGetResponse
*/
@Parcelize
data class BlogGetResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ResourceContent
*/
@Parcelize
data class ResourceContent(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: String?=null
): Parcelable

/*
    Model: Asset
*/
@Parcelize
data class Asset(
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
): Parcelable

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
): Parcelable

/*
    Model: BlogSchema
*/
@Parcelize
data class BlogSchema(
    
    @SerializedName("_id")
    var id: @RawValue ArrayList<Any>?=null,
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("archived")
    var archived: Boolean?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
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
    @SerializedName("DateMeta")
    var dateMeta: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: BlogRequest
*/
@Parcelize
data class BlogRequest(
    
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("reading_time")
    var readingTime: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("title")
    var title: String?=null
): Parcelable

/*
    Model: GetAnnouncementListSchema
*/
@Parcelize
data class GetAnnouncementListSchema(
    
    @SerializedName("items")
    var items: ArrayList<AdminAnnouncementSchema>?=null
): Parcelable

/*
    Model: CreateAnnouncementSchema
*/
@Parcelize
data class CreateAnnouncementSchema(
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("data")
    var data: AdminAnnouncementSchema?=null
): Parcelable

/*
    Model: FaqSchema
*/
@Parcelize
data class FaqSchema(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("__v")
    var v: Int?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("question")
    var question: String?=null,
    @SerializedName("answer")
    var answer: String?=null
): Parcelable

/*
    Model: CreateFaqResponseSchema
*/
@Parcelize
data class CreateFaqResponseSchema(
    
    @SerializedName("faq")
    var faq: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CreateFaqSchema
*/
@Parcelize
data class CreateFaqSchema(
    
    @SerializedName("faq")
    var faq: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: GetFaqSchema
*/
@Parcelize
data class GetFaqSchema(
    
    @SerializedName("faqs")
    var faqs: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: UpdateFaqCategoryRequestSchema
*/
@Parcelize
data class UpdateFaqCategoryRequestSchema(
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CreateFaqCategoryRequestSchema
*/
@Parcelize
data class CreateFaqCategoryRequestSchema(
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CreateFaqCategorySchema
*/
@Parcelize
data class CreateFaqCategorySchema(
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: GetFaqCategoriesSchema
*/
@Parcelize
data class GetFaqCategoriesSchema(
    
    @SerializedName("categories")
    var categories: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: GetFaqCategoryByIdOrSlugSchema
*/
@Parcelize
data class GetFaqCategoryByIdOrSlugSchema(
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null
): Parcelable

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
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("position")
    var position: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("navigation")
    var navigation: NavigationRef?=null
): Parcelable

/*
    Model: NavigationRef
*/
@Parcelize
data class NavigationRef(
    
    @SerializedName("acl")
    var acl: @RawValue ArrayList<Any>?=null,
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("image")
    var image: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("action")
    var action: @RawValue HashMap<String,Any>?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("sort_order")
    var sortOrder: Int?=null,
    @SerializedName("sub_navigation")
    var subNavigation: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: LandingPage
*/
@Parcelize
data class LandingPage(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("action")
    var action: @RawValue HashMap<String,Any>?=null,
    @SerializedName("platform")
    var platform: @RawValue ArrayList<Any>?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null
): Parcelable

/*
    Model: Slideshow
*/
@Parcelize
data class Slideshow(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("configuration")
    var configuration: @RawValue HashMap<String,Any>?=null,
    @SerializedName("media")
    var media: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("active")
    var active: Boolean?=null
): Parcelable

/*
    Model: AnnouncementsResponseSchema
*/
@Parcelize
data class AnnouncementsResponseSchema(
    
    @SerializedName("announcements")
    var announcements: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: FaqResponseSchema
*/
@Parcelize
data class FaqResponseSchema(
    
    @SerializedName("faqs")
    var faqs: ArrayList<Faq>?=null
): Parcelable

/*
    Model: UpdateHandpickedSchema
*/
@Parcelize
data class UpdateHandpickedSchema(
    
    @SerializedName("tag")
    var tag: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: RemoveHandpickedSchema
*/
@Parcelize
data class RemoveHandpickedSchema(
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
): Parcelable

/*
    Model: TagsSchema
*/
@Parcelize
data class TagsSchema(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: CreateTagRequestSchema
*/
@Parcelize
data class CreateTagRequestSchema(
    
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: APIError
*/
@Parcelize
data class APIError(
    
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
): Parcelable

/*
    Model: Faq
*/
@Parcelize
data class Faq(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("question")
    var question: String?=null,
    @SerializedName("answer")
    var answer: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("__v")
    var v: Int?=null
): Parcelable

/*
    Model: LandingPageGetResponse
*/
@Parcelize
data class LandingPageGetResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: LandingPageSchema
*/
@Parcelize
data class LandingPageSchema(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("action")
    var action: @RawValue HashMap<String,Any>?=null,
    @SerializedName("platform")
    var platform: ArrayList<String>?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("archived")
    var archived: Boolean?=null
): Parcelable

/*
    Model: LandingPageRequest
*/
@Parcelize
data class LandingPageRequest(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("action")
    var action: @RawValue HashMap<String,Any>?=null,
    @SerializedName("platform")
    var platform: ArrayList<String>?=null
): Parcelable

/*
    Model: DefaultNavigationResponse
*/
@Parcelize
data class DefaultNavigationResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: NavigationGetResponse
*/
@Parcelize
data class NavigationGetResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

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
    @SerializedName("orientation")
    var orientation: @RawValue HashMap<String,Any>?=null,
    @SerializedName("navigation")
    var navigation: @RawValue HashMap<String,Any>?=null
): Parcelable

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
    var orientation: @RawValue HashMap<String,Any>?=null,
    @SerializedName("navigation")
    var navigation: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CustomPage
*/
@Parcelize
data class CustomPage(
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CustomBlog
*/
@Parcelize
data class CustomBlog(
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: PageGetResponse
*/
@Parcelize
data class PageGetResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: PageSpec
*/
@Parcelize
data class PageSpec(
    
    @SerializedName("specifications")
    var specifications: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

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
    var params: ArrayList<String>?=null,
    @SerializedName("query")
    var query: ArrayList<String>?=null
): Parcelable

/*
    Model: PageSchema
*/
@Parcelize
data class PageSchema(
    
    @SerializedName("_id")
    var id: @RawValue ArrayList<Any>?=null,
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: @RawValue ArrayList<Any>?=null,
    @SerializedName("component_ids")
    var componentIds: ArrayList<String>?=null,
    @SerializedName("content")
    var content: ArrayList<PageContent>?=null,
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page_meta")
    var pageMeta: ArrayList<PageMeta>?=null,
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
    @SerializedName("visibility")
    var visibility: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CreatedBy
*/
@Parcelize
data class CreatedBy(
    
    @SerializedName("id")
    var id: String?=null
): Parcelable

/*
    Model: DateMeta
*/
@Parcelize
data class DateMeta(
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null
): Parcelable

/*
    Model: PageContent
*/
@Parcelize
data class PageContent(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: PageMeta
*/
@Parcelize
data class PageMeta(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: PageRequest
*/
@Parcelize
data class PageRequest(
    
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("author")
    var author: @RawValue HashMap<String,Any>?=null,
    @SerializedName("content")
    var content: ArrayList<ResourceContent>?=null,
    @SerializedName("feature_image")
    var featureImage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("published")
    var published: Boolean?=null,
    @SerializedName("reading_time")
    var readingTime: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("title")
    var title: String?=null
): Parcelable

/*
    Model: PagePublishRequest
*/
@Parcelize
data class PagePublishRequest(
    
    @SerializedName("publish")
    var publish: Boolean?=null
): Parcelable

/*
    Model: PageMetaSchema
*/
@Parcelize
data class PageMetaSchema(
    
    @SerializedName("system_pages")
    var systemPages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("custom_pages")
    var customPages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("application_id")
    var applicationId: String?=null
): Parcelable

/*
    Model: SlideshowGetResponse
*/
@Parcelize
data class SlideshowGetResponse(
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

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
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("platform")
    var platform: String?=null,
    @SerializedName("configuration")
    var configuration: @RawValue HashMap<String,Any>?=null,
    @SerializedName("media")
    var media: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("archived")
    var archived: Boolean?=null
): Parcelable

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
    var configuration: @RawValue HashMap<String,Any>?=null,
    @SerializedName("media")
    var media: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("active")
    var active: Boolean?=null
): Parcelable

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
    var contact: @RawValue HashMap<String,Any>?=null
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
    
    @SerializedName("appId")
    var appId: String?=null,
    @SerializedName("userId")
    var userId: String?=null,
    @SerializedName("channels")
    var channels: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CommunicationConsent
*/
@Parcelize
data class CommunicationConsent(
    
    @SerializedName("appId")
    var appId: String?=null,
    @SerializedName("userId")
    var userId: String?=null,
    @SerializedName("channels")
    var channels: @RawValue HashMap<String,Any>?=null
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
    Model: Redirects
*/
@Parcelize
data class Redirects(
    
    @SerializedName("ios")
    var ios: RedirectDevice?=null,
    @SerializedName("android")
    var android: RedirectDevice?=null,
    @SerializedName("web")
    var web: @RawValue HashMap<String,Any>?=null,
    @SerializedName("force_web")
    var forceWeb: Boolean?=null
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
    var active: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("expire_at")
    var expireAt: String?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null
): Parcelable

/*
    Model: ShortLinkRes
*/
@Parcelize
data class ShortLinkRes(
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("url")
    var url: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_by")
    var createdBy: String?=null,
    @SerializedName("personalized")
    var personalized: String?=null,
    @SerializedName("app_redirect")
    var appRedirect: String?=null,
    @SerializedName("fallback")
    var fallback: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("enable_tracking")
    var enableTracking: Boolean?=null,
    @SerializedName("expire_at")
    var expireAt: Boolean?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("user_id")
    var userId: Boolean?=null,
    @SerializedName("created_at")
    var createdAt: Boolean?=null,
    @SerializedName("updated_at")
    var updatedAt: Boolean?=null,
    @SerializedName("redirects")
    var redirects: Redirects?=null
): Parcelable

/*
    Model: ShortLinkList
*/
@Parcelize
data class ShortLinkList(
    
    @SerializedName("items")
    var items: ArrayList<ShortLinkRes>?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: String?=null,
    @SerializedName("type")
    var type: String?=null
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
    Model: ApplicationAboutResponse
*/
@Parcelize
data class ApplicationAboutResponse(
    
    @SerializedName("application_info")
    var applicationInfo: @RawValue HashMap<String,Any>?=null
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
    Model: Language
*/
@Parcelize
data class Language(
    
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
    var items: ArrayList<Language>?=null
): Parcelable

/*
    Model: TokensResponse
*/
@Parcelize
data class TokensResponse(
    
    @SerializedName("tokens")
    var tokens: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
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
    var homePage: @RawValue HashMap<String,Any>?=null,
    @SerializedName("common")
    var common: @RawValue HashMap<String,Any>?=null,
    @SerializedName("cart")
    var cart: @RawValue HashMap<String,Any>?=null,
    @SerializedName("qr")
    var qr: @RawValue HashMap<String,Any>?=null,
    @SerializedName("pcr")
    var pcr: @RawValue HashMap<String,Any>?=null,
    @SerializedName("order")
    var order: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("app")
    var app: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
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
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
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
    @SerializedName("redirectTo")
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
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
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
    @SerializedName("mobileLogo")
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
    @SerializedName("countryCode")
    var countryCode: Int?=null,
    @SerializedName("phone")
    var phone: String?=null
): Parcelable

/*
    Model: Pagination
*/
@Parcelize
data class Pagination(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null
): Parcelable

/*
    Model: ApplicationInformation
*/
@Parcelize
data class ApplicationInformation(
    
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null,
    @SerializedName("support")
    var support: @RawValue HashMap<String,Any>?=null,
    @SerializedName("social_links")
    var socialLinks: @RawValue HashMap<String,Any>?=null,
    @SerializedName("links")
    var links: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("copyright_text")
    var copyrightText: String?=null,
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("business_highlights")
    var businessHighlights: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("createdAt")
    var createdAt: String?=null,
    @SerializedName("updatedAt")
    var updatedAt: String?=null,
    @SerializedName("__v")
    var v: Int?=null
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
    @SerializedName("mobileLogo")
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
    Model: OrderingStore
*/
@Parcelize
data class OrderingStore(
    
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null,
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
    var page: Pagination?=null,
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
    Model: AggregatorConfigDetail
*/
@Parcelize
data class AggregatorConfigDetail(
    
    @SerializedName("api")
    var api: String?=null,
    @SerializedName("secret")
    var secret: String?=null,
    @SerializedName("sdk")
    var sdk: Boolean?=null,
    @SerializedName("verify_api")
    var verifyApi: String?=null,
    @SerializedName("merchant_id")
    var merchantId: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("pin")
    var pin: String?=null,
    @SerializedName("merchant_key")
    var merchantKey: String?=null
): Parcelable

/*
    Model: AggregatorsConfigDetailResponse
*/
@Parcelize
data class AggregatorsConfigDetailResponse(
    
    @SerializedName("payumoney")
    var payumoney: AggregatorConfigDetail?=null,
    @SerializedName("mswipe")
    var mswipe: AggregatorConfigDetail?=null,
    @SerializedName("juspay")
    var juspay: AggregatorConfigDetail?=null,
    @SerializedName("simpl")
    var simpl: AggregatorConfigDetail?=null,
    @SerializedName("stripe")
    var stripe: AggregatorConfigDetail?=null,
    @SerializedName("razorpay")
    var razorpay: AggregatorConfigDetail?=null,
    @SerializedName("ccavenue")
    var ccavenue: AggregatorConfigDetail?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("env")
    var env: String?=null,
    @SerializedName("rupifi")
    var rupifi: AggregatorConfigDetail?=null
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
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null
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
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("payload")
    var payload: String?=null,
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null,
    @SerializedName("merchant_params")
    var merchantParams: @RawValue HashMap<String,Any>?=null
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
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("transaction_token")
    var transactionToken: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null
): Parcelable

/*
    Model: ChargeCustomerResponse
*/
@Parcelize
data class ChargeCustomerResponse(
    
    @SerializedName("delivery_address_id")
    var deliveryAddressId: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("cart_id")
    var cartId: String?=null,
    @SerializedName("status")
    var status: String?=null
): Parcelable

/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    @SerializedName("customer_id")
    var customerId: String?=null
): Parcelable

/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    @SerializedName("vpa")
    var vpa: String?=null,
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    @SerializedName("customer_id")
    var customerId: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("bqr_image")
    var bqrImage: String?=null,
    @SerializedName("status")
    var status: String?=null
): Parcelable

/*
    Model: PaymentStatusUpdateRequest
*/
@Parcelize
data class PaymentStatusUpdateRequest(
    
    @SerializedName("contact")
    var contact: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    @SerializedName("vpa")
    var vpa: String?=null,
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("customer_id")
    var customerId: String?=null,
    @SerializedName("status")
    var status: String?=null
): Parcelable

/*
    Model: PaymentStatusUpdateResponse
*/
@Parcelize
data class PaymentStatusUpdateResponse(
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("retry")
    var retry: Boolean?=null
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
    
    @SerializedName("retry_count")
    var retryCount: Int?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("intent_flow")
    var intentFlow: String?=null,
    @SerializedName("fynd_vpa")
    var fyndVpa: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("intent_app_error_list")
    var intentAppErrorList: ArrayList<String>?=null,
    @SerializedName("card_type")
    var cardType: String?=null
): Parcelable

/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null
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
    
    @SerializedName("UPI_Razorpay")
    var upiRazorpay: AggregatorRoute?=null,
    @SerializedName("Razorpay")
    var razorpay: AggregatorRoute?=null,
    @SerializedName("Juspay")
    var juspay: AggregatorRoute?=null,
    @SerializedName("Payubiz")
    var payubiz: AggregatorRoute?=null,
    @SerializedName("BQR_Razorpay")
    var bqrRazorpay: AggregatorRoute?=null,
    @SerializedName("Stripe")
    var stripe: AggregatorRoute?=null,
    @SerializedName("Ccavenue")
    var ccavenue: AggregatorRoute?=null,
    @SerializedName("Rupifi")
    var rupifi: AggregatorRoute?=null,
    @SerializedName("Fynd")
    var fynd: AggregatorRoute?=null,
    @SerializedName("Simpl")
    var simpl: AggregatorRoute?=null
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
    @SerializedName("comment")
    var comment: Boolean?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    @SerializedName("bank_name")
    var bankName: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("account_no")
    var accountNo: String?=null,
    @SerializedName("mobile")
    var mobile: Boolean?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("branch_name")
    var branchName: Boolean?=null,
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null
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
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("description")
    var description: String?=null
): Parcelable

/*
    Model: IfscCodeResponse
*/
@Parcelize
data class IfscCodeResponse(
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("bank_name")
    var bankName: String?=null
): Parcelable

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
): Parcelable

/*
    Model: AddBeneficiaryViaOtpVerificationRequest
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationRequest(
    
    @SerializedName("hash_key")
    var hashKey: String?=null,
    @SerializedName("otp")
    var otp: String?=null,
    @SerializedName("request_id")
    var requestId: String?=null
): Parcelable

/*
    Model: AddBeneficiaryViaOtpVerificationResponse
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationResponse(
    
    @SerializedName("hash_key")
    var hashKey: String?=null,
    @SerializedName("otp")
    var otp: String?=null,
    @SerializedName("request_id")
    var requestId: String?=null
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
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("bank_name")
    var bankName: String?=null,
    @SerializedName("branch_name")
    var branchName: String?=null,
    @SerializedName("account_holder")
    var accountHolder: String?=null
): Parcelable

/*
    Model: AddBeneficiaryDetailsRequest
*/
@Parcelize
data class AddBeneficiaryDetailsRequest(
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    @SerializedName("delights")
    var delights: Boolean?=null,
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    @SerializedName("details")
    var details: BankDetails?=null,
    @SerializedName("order_id")
    var orderId: String?=null
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null,
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
    var orders: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ShipmentById
*/
@Parcelize
data class ShipmentById(
    
    @SerializedName("shipment")
    var shipment: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ShipmentReasons
*/
@Parcelize
data class ShipmentReasons(
    
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: ShipmentStatusUpdateBody
*/
@Parcelize
data class ShipmentStatusUpdateBody(
    
    @SerializedName("shipments")
    var shipments: @RawValue HashMap<String,Any>?=null,
    @SerializedName("force_transition")
    var forceTransition: Boolean?=null,
    @SerializedName("task")
    var task: Boolean?=null
): Parcelable

/*
    Model: ShipmentStatusUpdate
*/
@Parcelize
data class ShipmentStatusUpdate(
    
    @SerializedName("shipments")
    var shipments: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ShipmentTrack
*/
@Parcelize
data class ShipmentTrack(
    
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: Bags
*/
@Parcelize
data class Bags(
    
    @SerializedName("item")
    var item: @RawValue HashMap<String,Any>?=null,
    @SerializedName("prices")
    var prices: @RawValue HashMap<String,Any>?=null,
    @SerializedName("promotion_effective_discount")
    var promotionEffectiveDiscount: Int?=null,
    @SerializedName("current_status")
    var currentStatus: @RawValue HashMap<String,Any>?=null,
    @SerializedName("bag_status")
    var bagStatus: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("dates")
    var dates: @RawValue HashMap<String,Any>?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("status")
    var status: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("financial_breakup")
    var financialBreakup: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("reasons")
    var reasons: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("article")
    var article: @RawValue HashMap<String,Any>?=null,
    @SerializedName("journey_type")
    var journeyType: String?=null,
    @SerializedName("current_operational_status")
    var currentOperationalStatus: @RawValue HashMap<String,Any>?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("brand")
    var brand: @RawValue HashMap<String,Any>?=null,
    @SerializedName("affiliate_bag_details")
    var affiliateBagDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("gst_details")
    var gstDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("bag_id")
    var bagId: Int?=null,
    @SerializedName("bag_update_time")
    var bagUpdateTime: Int?=null
): Parcelable

/*
    Model: BreakupValues
*/
@Parcelize
data class BreakupValues(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: Int?=null,
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
    var latitude: Int?=null,
    @SerializedName("longitude")
    var longitude: Int?=null,
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
    var image: @RawValue ArrayList<Any>?=null,
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
    var l2Category: @RawValue ArrayList<Any>?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("can_return")
    var canReturn: Boolean?=null,
    @SerializedName("l1_category")
    var l1Category: @RawValue ArrayList<Any>?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ShipmentMeta
*/
@Parcelize
data class ShipmentMeta(
    
    @SerializedName("timestamp")
    var timestamp: @RawValue HashMap<String,Any>?=null,
    @SerializedName("bag_weight")
    var bagWeight: @RawValue HashMap<String,Any>?=null,
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
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
    var formatted: @RawValue HashMap<String,Any>?=null,
    @SerializedName("debug_info")
    var debugInfo: @RawValue HashMap<String,Any>?=null,
    @SerializedName("dp_sort_key")
    var dpSortKey: String?=null,
    @SerializedName("packaging_name")
    var packagingName: String?=null
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
    Model: Prices
*/
@Parcelize
data class Prices(
    
    @SerializedName("amount_paid")
    var amountPaid: Int?=null,
    @SerializedName("price_marked")
    var priceMarked: Int?=null,
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    @SerializedName("discount")
    var discount: Int?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Int?=null,
    @SerializedName("fynd_credits")
    var fyndCredits: Int?=null,
    @SerializedName("cashback")
    var cashback: Int?=null,
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    @SerializedName("value_of_good")
    var valueOfGood: Int?=null,
    @SerializedName("refund_amount")
    var refundAmount: Int?=null,
    @SerializedName("coupon_value")
    var couponValue: Int?=null,
    @SerializedName("cashback_applied")
    var cashbackApplied: Int?=null,
    @SerializedName("refund_credit")
    var refundCredit: Int?=null
): Parcelable

/*
    Model: ShipmentStatus
*/
@Parcelize
data class ShipmentStatus(
    
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("hex_code")
    var hexCode: Int?=null
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
    Model: Shipments
*/
@Parcelize
data class Shipments(
    
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
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
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
    Model: Article
*/
@Parcelize
data class Article(
    
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("points")
    var points: Double?=null,
    @SerializedName("price")
    var price: Double?=null
): Parcelable

/*
    Model: CatalogueOrderRequest
*/
@Parcelize
data class CatalogueOrderRequest(
    
    @SerializedName("articles")
    var articles: ArrayList<Article>?=null
): Parcelable

/*
    Model: CatalogueOrderResponse
*/
@Parcelize
data class CatalogueOrderResponse(
    
    @SerializedName("articles")
    var articles: ArrayList<Article>?=null
): Parcelable

/*
    Model: CursorPage
*/
@Parcelize
data class CursorPage(
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("next_id")
    var nextId: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: Discount
*/
@Parcelize
data class Discount(
    
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
): Parcelable

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
): Parcelable

/*
    Model: Offer
*/
@Parcelize
data class Offer(
    
    @SerializedName("_schedule")
    var schedule: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("application_id")
    var applicationId: String?=null,
    @SerializedName("banner_image")
    var bannerImage: Asset?=null,
    @SerializedName("created_at")
    var createdAt: String?=null,
    @SerializedName("info_action")
    var infoAction: Action?=null,
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
): Parcelable

/*
    Model: OrderDiscountRequest
*/
@Parcelize
data class OrderDiscountRequest(
    
    @SerializedName("currency")
    var currency: String?=null,
    @SerializedName("order_amount")
    var orderAmount: Double?=null
): Parcelable

/*
    Model: OrderDiscountResponse
*/
@Parcelize
data class OrderDiscountResponse(
    
    @SerializedName("applied_rule_bucket")
    var appliedRuleBucket: OrderDiscountRuleBucket?=null,
    @SerializedName("base_discount")
    var baseDiscount: Discount?=null,
    @SerializedName("discount")
    var discount: Discount?=null,
    @SerializedName("order_amount")
    var orderAmount: Double?=null,
    @SerializedName("points")
    var points: Double?=null
): Parcelable

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
): Parcelable

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
    var meta: String?=null,
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
): Parcelable

/*
    Model: PointsHistoryResponse
*/
@Parcelize
data class PointsHistoryResponse(
    
    @SerializedName("history")
    var history: ArrayList<PointsHistory>?=null,
    @SerializedName("page")
    var page: CursorPage?=null
): Parcelable

/*
    Model: PointsResponse
*/
@Parcelize
data class PointsResponse(
    
    @SerializedName("points")
    var points: Double?=null
): Parcelable

/*
    Model: RedeemReferralCodeRequest
*/
@Parcelize
data class RedeemReferralCodeRequest(
    
    @SerializedName("device_id")
    var deviceId: String?=null,
    @SerializedName("referral_code")
    var referralCode: String?=null
): Parcelable

/*
    Model: RedeemReferralCodeResponse
*/
@Parcelize
data class RedeemReferralCodeResponse(
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("points")
    var points: Double?=null,
    @SerializedName("redeemed")
    var redeemed: Boolean?=null,
    @SerializedName("referrer_id")
    var referrerId: String?=null,
    @SerializedName("referrer_info")
    var referrerInfo: String?=null
): Parcelable

/*
    Model: ReferralDetailsResponse
*/
@Parcelize
data class ReferralDetailsResponse(
    
    @SerializedName("referral")
    var referral: Offer?=null,
    @SerializedName("referrer_info")
    var referrerInfo: String?=null,
    @SerializedName("share")
    var share: ShareMessages?=null,
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: ShareMessages
*/
@Parcelize
data class ShareMessages(
    
    @SerializedName("email")
    var email: String?=null,
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
): Parcelable



/*
    Model: Access
*/
@Parcelize
data class Access(
    
    @SerializedName("answer")
    var answer: Boolean?=null,
    @SerializedName("ask_question")
    var askQuestion: Boolean?=null,
    @SerializedName("comment")
    var comment: Boolean?=null,
    @SerializedName("rnr")
    var rnr: Boolean?=null
): Parcelable

/*
    Model: AddMediaListRequest
*/
@Parcelize
data class AddMediaListRequest(
    
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("media_list")
    var mediaList: ArrayList<AddMediaRequest>?=null,
    @SerializedName("ref_id")
    var refId: String?=null,
    @SerializedName("ref_type")
    var refType: String?=null
): Parcelable

/*
    Model: AddMediaRequest
*/
@Parcelize
data class AddMediaRequest(
    
    @SerializedName("cloud_id")
    var cloudId: String?=null,
    @SerializedName("cloud_name")
    var cloudName: String?=null,
    @SerializedName("cloud_provider")
    var cloudProvider: String?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("media_url")
    var mediaUrl: String?=null,
    @SerializedName("ref_id")
    var refId: String?=null,
    @SerializedName("ref_type")
    var refType: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("thumbnail_url")
    var thumbnailUrl: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: Attribute
*/
@Parcelize
data class Attribute(
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<TagMeta>?=null
): Parcelable

/*
    Model: AttributeObject
*/
@Parcelize
data class AttributeObject(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("value")
    var value: Double?=null
): Parcelable

/*
    Model: CheckEligibilityResponse
*/
@Parcelize
data class CheckEligibilityResponse(
    
    @SerializedName("access")
    var access: Access?=null,
    @SerializedName("media_cloud")
    var mediaCloud: MediaCloud?=null
): Parcelable

/*
    Model: Cloud
*/
@Parcelize
data class Cloud(
    
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("provider")
    var provider: String?=null
): Parcelable

/*
    Model: CommentRequest
*/
@Parcelize
data class CommentRequest(
    
    @SerializedName("comment")
    var comment: ArrayList<String>?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null
): Parcelable

/*
    Model: CreateQNARequest
*/
@Parcelize
data class CreateQNARequest(
    
    @SerializedName("choices")
    var choices: ArrayList<String>?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("max_len")
    var maxLen: Int?=null,
    @SerializedName("sort_priority")
    var sortPriority: Int?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    @SerializedName("text")
    var text: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: DeviceMeta
*/
@Parcelize
data class DeviceMeta(
    
    @SerializedName("app_version")
    var appVersion: String?=null,
    @SerializedName("platform")
    var platform: String?=null
): Parcelable

/*
    Model: MediaCloud
*/
@Parcelize
data class MediaCloud(
    
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("namespace")
    var namespace: String?=null,
    @SerializedName("path")
    var path: String?=null,
    @SerializedName("provider")
    var provider: String?=null,
    @SerializedName("secret")
    var secret: String?=null
): Parcelable

/*
    Model: MediaMeta
*/
@Parcelize
data class MediaMeta(
    
    @SerializedName("cloud")
    var cloud: Cloud?=null,
    @SerializedName("comment")
    var comment: ArrayList<String>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("url")
    var url: Url?=null
): Parcelable

/*
    Model: PageCursor
*/
@Parcelize
data class PageCursor(
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("next_id")
    var nextId: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: PageNumber
*/
@Parcelize
data class PageNumber(
    
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: ReportAbuseRequest
*/
@Parcelize
data class ReportAbuseRequest(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null
): Parcelable

/*
    Model: SaveAttributeRequest
*/
@Parcelize
data class SaveAttributeRequest(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null
): Parcelable

/*
    Model: TagMeta
*/
@Parcelize
data class TagMeta(
    
    @SerializedName("media")
    var media: ArrayList<MediaMeta>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: UpdateAbuseStatusRequest
*/
@Parcelize
data class UpdateAbuseStatusRequest(
    
    @SerializedName("abusive")
    var abusive: Boolean?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("approve")
    var approve: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("id")
    var id: String?=null
): Parcelable

/*
    Model: UpdateAttributeRequest
*/
@Parcelize
data class UpdateAttributeRequest(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null
): Parcelable

/*
    Model: UpdateCommentRequest
*/
@Parcelize
data class UpdateCommentRequest(
    
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("approve")
    var approve: Boolean?=null,
    @SerializedName("comment")
    var comment: ArrayList<String>?=null,
    @SerializedName("id")
    var id: String?=null
): Parcelable

/*
    Model: UpdateMediaListRequest
*/
@Parcelize
data class UpdateMediaListRequest(
    
    @SerializedName("approve")
    var approve: Boolean?=null,
    @SerializedName("archive")
    var archive: Boolean?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("ids")
    var ids: ArrayList<String>?=null
): Parcelable

/*
    Model: UpdateQNARequest
*/
@Parcelize
data class UpdateQNARequest(
    
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("approve")
    var approve: Boolean?=null,
    @SerializedName("choices")
    var choices: ArrayList<String>?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
): Parcelable

/*
    Model: UpdateReviewRequest
*/
@Parcelize
data class UpdateReviewRequest(
    
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("approve")
    var approve: Boolean?=null,
    @SerializedName("archive")
    var archive: Boolean?=null,
    @SerializedName("attributes_rating")
    var attributesRating: ArrayList<AttributeObject>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("device_meta")
    var deviceMeta: DeviceMeta?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("media_resource")
    var mediaResource: ArrayList<MediaMeta>?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("review_id")
    var reviewId: String?=null,
    @SerializedName("template_id")
    var templateId: String?=null,
    @SerializedName("title")
    var title: String?=null
): Parcelable

/*
    Model: UpdateVoteRequest
*/
@Parcelize
data class UpdateVoteRequest(
    
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("active")
    var active: Boolean?=null,
    @SerializedName("id")
    var id: String?=null,
    @SerializedName("ref_id")
    var refId: String?=null,
    @SerializedName("ref_type")
    var refType: String?=null
): Parcelable

/*
    Model: Url
*/
@Parcelize
data class Url(
    
    @SerializedName("main")
    var main: String?=null,
    @SerializedName("thumbnail")
    var thumbnail: String?=null
): Parcelable

/*
    Model: VoteRequest
*/
@Parcelize
data class VoteRequest(
    
    @SerializedName("action")
    var action: String?=null,
    @SerializedName("entity_id")
    var entityId: String?=null,
    @SerializedName("entity_type")
    var entityType: String?=null,
    @SerializedName("ref_id")
    var refId: String?=null,
    @SerializedName("ref_type")
    var refType: String?=null
): Parcelable

/*
    Model: XCursorGetResponse
*/
@Parcelize
data class XCursorGetResponse(
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page")
    var page: PageCursor?=null
): Parcelable

/*
    Model: XInsertResponse
*/
@Parcelize
data class XInsertResponse(
    
    @SerializedName("ids")
    var ids: String?=null
): Parcelable

/*
    Model: XNumberGetResponse
*/
@Parcelize
data class XNumberGetResponse(
    
    @SerializedName("items")
    var items: @RawValue HashMap<String,Any>?=null,
    @SerializedName("page")
    var page: PageNumber?=null
): Parcelable

/*
    Model: XUpdateResponse
*/
@Parcelize
data class XUpdateResponse(
    
    @SerializedName("id")
    var id: String?=null
): Parcelable



/*
    Model: UpdateCartShipmentItem
*/
@Parcelize
data class UpdateCartShipmentItem(
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    @SerializedName("article_uid")
    var articleUid: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null
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
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("files")
    var files: Files?=null,
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("pos")
    var pos: Boolean?=null,
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("fyndstore_emp_id")
    var fyndstoreEmpId: String?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null
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
    
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("address")
    var address: String?=null
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
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
): Parcelable

/*
    Model: GetTatProductReqBody
*/
@Parcelize
data class GetTatProductReqBody(
    
    @SerializedName("location_details")
    var locationDetails: @RawValue ArrayList<HashMap<String,Any>>?=null,
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
    Model: GetTatProductResponse
*/
@Parcelize
data class GetTatProductResponse(
    
    @SerializedName("location_details")
    var locationDetails: @RawValue ArrayList<HashMap<String,Any>>?=null,
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

