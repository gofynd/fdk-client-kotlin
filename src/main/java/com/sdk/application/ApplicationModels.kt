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
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("url")
    var url: String?=null
): Parcelable

/*
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
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
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("page")
    var page: ProductListingActionPage?=null
): Parcelable

/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
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
    
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("key")
    var key: String?=null
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
    
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null
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
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null
): Parcelable

/*
    Model: Price
*/
@Parcelize
data class Price(
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("min")
    var min: Double?=null,
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
    
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSize>?=null,
    @SerializedName("size_chart")
    var sizeChart: @RawValue HashMap<String,Any>?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("stores")
    var stores: ProductSizeStores?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null
): Parcelable

/*
    Model: Store
*/
@Parcelize
data class Store(
    
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
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
    Model: ProductSizePriceResponse
*/
@Parcelize
data class ProductSizePriceResponse(
    
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("seller_count")
    var sellerCount: Int?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("set")
    var set: @RawValue HashMap<String,Any>?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("long_lat")
    var longLat: ArrayList<Double>?=null,
    @SerializedName("store")
    var store: Store?=null,
    @SerializedName("special_badge")
    var specialBadge: String?=null,
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    @SerializedName("seller")
    var seller: Seller?=null,
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    @SerializedName("price_per_price")
    var pricePerPrice: ProductStockPrice?=null
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
    Model: Page
*/
@Parcelize
data class Page(
    
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("next_id")
    var nextId: String?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null
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
    
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("attributes_metadata")
    var attributesMetadata: ArrayList<AttributeDetail>?=null,
    @SerializedName("title")
    var title: String?=null
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
    
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
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
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("color_name")
    var colorName: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("color")
    var color: String?=null
): Parcelable

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
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("city")
    var city: String?=null
): Parcelable

/*
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    @SerializedName("company")
    var company: CompanyDetail?=null,
    @SerializedName("store")
    var store: StoreDetail?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    @SerializedName("seller")
    var seller: Seller?=null,
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
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<ProductStockStatusItem>?=null
): Parcelable

/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("kind")
    var kind: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: String?=null
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    @SerializedName("display_format")
    var displayFormat: String?=null,
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("min")
    var min: Int?=null,
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("query_format")
    var queryFormat: String?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("max")
    var max: Int?=null
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
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null
): Parcelable

/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null
): Parcelable

/*
    Model: ImageUrls
*/
@Parcelize
data class ImageUrls(
    
    @SerializedName("portrait")
    var portrait: Media?=null,
    @SerializedName("landscape")
    var landscape: Media?=null
): Parcelable

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
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: Int?=null
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
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("uid")
    var uid: Int?=null
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
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("slug")
    var slug: String?=null
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
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null
): Parcelable

/*
    Model: Department
*/
@Parcelize
data class Department(
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: Media?=null,
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
    Model: PageQuery
*/
@Parcelize
data class PageQuery(
    
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
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("page_query")
    var pageQuery: PageQuery?=null
): Parcelable

/*
    Model: Action
*/
@Parcelize
data class Action(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("page")
    var page: AutocompletePage?=null
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
): Parcelable

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
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null
): Parcelable

/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null
): Parcelable

/*
    Model: GetFollowListingResponse
*/
@Parcelize
data class GetFollowListingResponse(
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
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
    
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("lat_long")
    var latLong: LatLong?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("uid")
    var uid: Int?=null
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
    Model: CartProductIdentifer
*/
@Parcelize
data class CartProductIdentifer(
    
    @SerializedName("identifier")
    var identifier: String?=null
): Parcelable

/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("effective")
    var effective: Double?=null,
    @SerializedName("marked")
    var marked: Double?=null,
    @SerializedName("selling")
    var selling: Double?=null,
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
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null
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
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("store")
    var store: BaseInfo?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("seller")
    var seller: BaseInfo?=null
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
    
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("query")
    var query: ActionQuery?=null
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
    Model: Product
*/
@Parcelize
data class Product(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("action")
    var action: ProductAction?=null,
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("images")
    var images: ArrayList<Image>?=null,
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null
): Parcelable

/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    @SerializedName("bulk_offer")
    var bulkOffer: @RawValue HashMap<String,Any>?=null,
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    @SerializedName("article")
    var article: ProductArticle?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("product")
    var product: Product?=null
): Parcelable

/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null
): Parcelable

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
    var description: String?=null
): Parcelable

/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    @SerializedName("message")
    var message: ArrayList<String>?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("display")
    var display: String?=null,
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
    @SerializedName("coupon")
    var coupon: Double?=null,
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("total")
    var total: Double?=null
): Parcelable

/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null,
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null,
    @SerializedName("raw")
    var raw: RawBreakup?=null
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
    Model: PromiseTimestamp
*/
@Parcelize
data class PromiseTimestamp(
    
    @SerializedName("max")
    var max: Int?=null,
    @SerializedName("min")
    var min: Int?=null
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
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null
): Parcelable

/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    @SerializedName("item_size")
    var itemSize: String?=null,
    @SerializedName("pos")
    var pos: Boolean?=null
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("cart")
    var cart: CartResponse?=null,
    @SerializedName("partial")
    var partial: Boolean?=null,
    @SerializedName("message")
    var message: String?=null
): Parcelable

/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    @SerializedName("item_index")
    var itemIndex: Int?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("identifiers")
    var identifiers: CartProductIdentifer?=null,
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("cart")
    var cart: CartResponse?=null,
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
    
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("current")
    var current: Int?=null
): Parcelable

/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    @SerializedName("sub_title")
    var subTitle: String?=null,
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null
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
    
    @SerializedName("bulk_effective")
    var bulkEffective: Double?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("effective")
    var effective: Int?=null,
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
    @SerializedName("auto_applied")
    var autoApplied: Boolean?=null,
    @SerializedName("margin")
    var margin: Int?=null,
    @SerializedName("price")
    var price: OfferPrice?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("best")
    var best: Boolean?=null,
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
    
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("country_code")
    var countryCode: String?=null
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
    
    @SerializedName("success")
    var success: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null
): Parcelable

/*
    Model: UpdateAddressResponse
*/
@Parcelize
data class UpdateAddressResponse(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("is_updated")
    var isUpdated: Boolean?=null
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
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null
): Parcelable

/*
    Model: CouponValidity
*/
@Parcelize
data class CouponValidity(
    
    @SerializedName("display_message_en")
    var displayMessageEn: String?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("discount")
    var discount: Double?=null,
    @SerializedName("valid")
    var valid: Boolean?=null
): Parcelable

/*
    Model: PaymentUpdate
*/
@Parcelize
data class PaymentUpdate(
    
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null,
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
    @SerializedName("dp_id")
    var dpId: Int?=null,
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("box_type")
    var boxType: String?=null,
    @SerializedName("shipments")
    var shipments: Int?=null,
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    @SerializedName("promise")
    var promise: ShipmentPromise?=null,
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null
): Parcelable

/*
    Model: CartCheckoutRequest
*/
@Parcelize
data class CartCheckoutRequest(
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("fyndstore_emp_id")
    var fyndstoreEmpId: String?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null
): Parcelable

/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("cod_message")
    var codMessage: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("error_message")
    var errorMessage: String?=null,
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("user_type")
    var userType: String?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null
): Parcelable

/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    @SerializedName("cart")
    var cart: CheckCart?=null
): Parcelable

/*
    Model: CartMetaRequest
*/
@Parcelize
data class CartMetaRequest(
    
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("pick_up_customer_details")
    var pickUpCustomerDetails: @RawValue HashMap<String,Any>?=null,
    @SerializedName("comment")
    var comment: String?=null
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
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: SharedCart
*/
@Parcelize
data class SharedCart(
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null
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
    
    @SerializedName("article_uid")
    var articleUid: String?=null,
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
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
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("pick_at_store_uid")
    var pickAtStoreUid: Int?=null,
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("pos")
    var pos: Boolean?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("files")
    var files: Files?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("order_type")
    var orderType: String?=null,
    @SerializedName("delivery_address")
    var deliveryAddress: @RawValue HashMap<String,Any>?=null
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
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("phone")
    var phone: String?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null
): Parcelable

/*
    Model: StoreDetailsResponse
*/
@Parcelize
data class StoreDetailsResponse(
    
    @SerializedName("items")
    var items: ArrayList<PickupStoreDetail>?=null
): Parcelable

