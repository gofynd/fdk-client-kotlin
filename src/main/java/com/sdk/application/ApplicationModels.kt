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
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("logo")
    var logo: Media?=null
): Parcelable

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
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null
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
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("max")
    var max: Double?=null,
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
    Model: ProductSizes
*/
@Parcelize
data class ProductSizes(
    
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("size_chart")
    var sizeChart: @RawValue HashMap<String,Any>?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSize>?=null,
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
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("count")
    var count: Int?=null
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
    Model: Store
*/
@Parcelize
data class Store(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("count")
    var count: Int?=null
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
    Model: ProductSizePriceResponse
*/
@Parcelize
data class ProductSizePriceResponse(
    
    @SerializedName("seller")
    var seller: Seller?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("price_per_price")
    var pricePerPrice: ProductStockPrice?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("special_badge")
    var specialBadge: String?=null,
    @SerializedName("seller_count")
    var sellerCount: Int?=null,
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("store")
    var store: Store?=null,
    @SerializedName("set")
    var set: @RawValue HashMap<String,Any>?=null,
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
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
    @SerializedName("next_id")
    var nextId: String?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("size")
    var size: Int?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("item_total")
    var itemTotal: Int?=null
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
    @SerializedName("attributes_metadata")
    var attributesMetadata: ArrayList<AttributeDetail>?=null,
    @SerializedName("title")
    var title: String?=null,
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
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("color_name")
    var colorName: String?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("slug")
    var slug: String?=null
): Parcelable

/*
    Model: ProductVariantResponse
*/
@Parcelize
data class ProductVariantResponse(
    
    @SerializedName("items")
    var items: ArrayList<ProductVariantItemResponse>?=null,
    @SerializedName("display_type")
    var displayType: String?=null,
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
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("code")
    var code: String?=null
): Parcelable

/*
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    @SerializedName("seller")
    var seller: Seller?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("company")
    var company: CompanyDetail?=null,
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    @SerializedName("store")
    var store: StoreDetail?=null,
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null
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
    
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("kind")
    var kind: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("logo")
    var logo: String?=null
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    @SerializedName("value")
    var value: String?=null,
    @SerializedName("max")
    var max: Int?=null,
    @SerializedName("display_format")
    var displayFormat: String?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("query_format")
    var queryFormat: String?=null,
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("count")
    var count: Int?=null,
    @SerializedName("min")
    var min: Int?=null
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
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    @SerializedName("image_nature")
    var imageNature: String?=null,
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("item_type")
    var itemType: String?=null,
    @SerializedName("rating")
    var rating: Double?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("color")
    var color: String?=null,
    @SerializedName("teaser_tag")
    var teaserTag: String?=null,
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null
): Parcelable

/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null
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
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("logo")
    var logo: Media?=null
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
    
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null
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
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null
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
    
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null
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
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("logo")
    var logo: Media?=null
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
    
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("action")
    var action: @RawValue HashMap<String,Any>?=null
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
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("action")
    var action: ProductListingAction?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    @SerializedName("page")
    var page: Page?=null,
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("logo")
    var logo: Media?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    @SerializedName("app_id")
    var appId: String?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("banners")
    var banners: ImageUrls?=null
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
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    @SerializedName("products")
    var products: ArrayList<Int>?=null,
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
    
    @SerializedName("type")
    var type: String?=null,
    @SerializedName("coordinates")
    var coordinates: ArrayList<Double>?=null
): Parcelable

/*
    Model: Store1
*/
@Parcelize
data class Store1(
    
    @SerializedName("lat_long")
    var latLong: LatLong?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("pincode")
    var pincode: Int?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("store_email")
    var storeEmail: String?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country")
    var country: String?=null
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
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    @SerializedName("total")
    var total: Double?=null,
    @SerializedName("coupon")
    var coupon: Double?=null
): Parcelable

/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    @SerializedName("description")
    var description: String?=null,
    @SerializedName("applicable")
    var applicable: Double?=null,
    @SerializedName("total")
    var total: Double?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null
): Parcelable

/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("display")
    var display: String?=null
): Parcelable

/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("value")
    var value: Double?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: CartBreakup
*/
@Parcelize
data class CartBreakup(
    
    @SerializedName("raw")
    var raw: RawBreakup?=null,
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null,
    @SerializedName("display")
    var display: ArrayList<DisplayBreakup>?=null,
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null
): Parcelable

/*
    Model: PaymentFlow
*/
@Parcelize
data class PaymentFlow(
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("api_link")
    var apiLink: String?=null,
    @SerializedName("payment_flow")
    var paymentFlow: String?=null
): Parcelable

/*
    Model: PaymentFlows
*/
@Parcelize
data class PaymentFlows(
    
    @SerializedName("Razorpay")
    var razorpay: PaymentFlow?=null,
    @SerializedName("UPI_Razorpay")
    var upiRazorpay: PaymentFlow?=null,
    @SerializedName("Simpl")
    var simpl: PaymentFlow?=null,
    @SerializedName("Juspay")
    var juspay: PaymentFlow?=null,
    @SerializedName("Fynd")
    var fynd: PaymentFlow?=null
): Parcelable

/*
    Model: PaymentOption
*/
@Parcelize
data class PaymentOption(
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("payment_mode_id")
    var paymentModeId: Int?=null,
    @SerializedName("list")
    var list: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("display_name")
    var displayName: String?=null
): Parcelable

/*
    Model: PaymentOptions
*/
@Parcelize
data class PaymentOptions(
    
    @SerializedName("payment_flows")
    var paymentFlows: PaymentFlows?=null,
    @SerializedName("payment_option")
    var paymentOption: ArrayList<PaymentOption>?=null
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
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("marked")
    var marked: Double?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("add_on")
    var addOn: Double?=null,
    @SerializedName("effective")
    var effective: Double?=null,
    @SerializedName("selling")
    var selling: Double?=null
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
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("deliverable")
    var deliverable: Boolean?=null
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
    var name: Int?=null,
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
    Model: Action
*/
@Parcelize
data class Action(
    
    @SerializedName("query")
    var query: ActionQuery?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: Image
*/
@Parcelize
data class Image(
    
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    @SerializedName("url")
    var url: String?=null,
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null
): Parcelable

/*
    Model: Product
*/
@Parcelize
data class Product(
    
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("action")
    var action: Action?=null,
    @SerializedName("slug")
    var slug: String?=null,
    @SerializedName("images")
    var images: ArrayList<Image>?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: ArticlePriceInfo
*/
@Parcelize
data class ArticlePriceInfo(
    
    @SerializedName("converted")
    var converted: Price?=null,
    @SerializedName("base")
    var base: Price?=null
): Parcelable

/*
    Model: ProductArticle
*/
@Parcelize
data class ProductArticle(
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("store")
    var store: String?=null,
    @SerializedName("size")
    var size: String?=null,
    @SerializedName("price")
    var price: ArticlePriceInfo?=null,
    @SerializedName("seller")
    var seller: BaseInfo?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("type")
    var type: String?=null
): Parcelable

/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    @SerializedName("discount")
    var discount: String?=null,
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    @SerializedName("bulk_offer")
    var bulkOffer: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("price")
    var price: ProductPriceInfo?=null,
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    @SerializedName("product")
    var product: Product?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("article")
    var article: ProductArticle?=null
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
    Model: CartResponse
*/
@Parcelize
data class CartResponse(
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: ArrayList<String>?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null
): Parcelable

/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    @SerializedName("display")
    var display: String?=null,
    @SerializedName("item_size")
    var itemSize: String?=null,
    @SerializedName("store_id")
    var storeId: Int?=null,
    @SerializedName("pos")
    var pos: Boolean?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("quantity")
    var quantity: Int?=null
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
    @SerializedName("partial")
    var partial: Boolean?=null,
    @SerializedName("success")
    var success: Boolean?=null,
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
    @SerializedName("article_id")
    var articleId: String?=null,
    @SerializedName("item_size")
    var itemSize: Int?=null,
    @SerializedName("item_id")
    var itemId: Int?=null,
    @SerializedName("quantity")
    var quantity: Int?=null
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
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    @SerializedName("current")
    var current: Int?=null,
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    @SerializedName("total")
    var total: Int?=null,
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null
): Parcelable

/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    @SerializedName("sub_title")
    var subTitle: String?=null,
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null,
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
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
    
    @SerializedName("bulk_effective")
    var bulkEffective: Double?=null,
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    @SerializedName("marked")
    var marked: Int?=null,
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    @SerializedName("effective")
    var effective: Int?=null
): Parcelable

/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    @SerializedName("auto_applied")
    var autoApplied: Boolean?=null,
    @SerializedName("price")
    var price: OfferPrice?=null,
    @SerializedName("best")
    var best: Boolean?=null,
    @SerializedName("total")
    var total: Double?=null,
    @SerializedName("margin")
    var margin: Int?=null,
    @SerializedName("quantity")
    var quantity: Int?=null,
    @SerializedName("type")
    var type: String?=null
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
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("phone")
    var phone: Int?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("uid")
    var uid: Int?=null
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
    Model: UpdateAddressRequest
*/
@Parcelize
data class UpdateAddressRequest(
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("phone")
    var phone: Int?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("uid")
    var uid: Int?=null
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
    Model: AddressResponse
*/
@Parcelize
data class AddressResponse(
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("city")
    var city: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("address_type")
    var addressType: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("area")
    var area: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("geo_location")
    var geoLocation: GeoLocation?=null,
    @SerializedName("area_code")
    var areaCode: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    @SerializedName("country")
    var country: String?=null,
    @SerializedName("landmark")
    var landmark: String?=null,
    @SerializedName("phone")
    var phone: Int?=null,
    @SerializedName("state")
    var state: String?=null,
    @SerializedName("country_code")
    var countryCode: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("tags")
    var tags: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("uid")
    var uid: Int?=null
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
    
    @SerializedName("uid")
    var uid: Int?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null
): Parcelable

/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null,
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    @SerializedName("dp_id")
    var dpId: Int?=null,
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    @SerializedName("promise")
    var promise: String?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("shipments")
    var shipments: Int?=null,
    @SerializedName("box_type")
    var boxType: String?=null
): Parcelable

/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: ArrayList<String>?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null
): Parcelable

/*
    Model: CartCheckoutRequest
*/
@Parcelize
data class CartCheckoutRequest(
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    @SerializedName("address_id")
    var addressId: Int?=null,
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    @SerializedName("fyndstore_emp_id")
    var fyndstoreEmpId: String?=null
): Parcelable

/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("user_type")
    var userType: String?=null,
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    @SerializedName("cod_message")
    var codMessage: String?=null,
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    @SerializedName("store_code")
    var storeCode: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: ArrayList<String>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("error_message")
    var errorMessage: String?=null,
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null
): Parcelable

/*
    Model: OrderData
*/
@Parcelize
data class OrderData(
    
    @SerializedName("order_id")
    var orderId: String?=null
): Parcelable

/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    @SerializedName("cart")
    var cart: CheckCart?=null,
    @SerializedName("data")
    var data: OrderData?=null,
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
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
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
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
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("token")
    var token: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null
): Parcelable

/*
    Model: SharedCart
*/
@Parcelize
data class SharedCart(
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    @SerializedName("breakup_values")
    var breakupValues: CartBreakup?=null,
    @SerializedName("coupon_text")
    var couponText: String?=null,
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    @SerializedName("uid")
    var uid: String?=null,
    @SerializedName("gstin")
    var gstin: String?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("delivery_promise")
    var deliveryPromise: ShipmentPromise?=null,
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: ArrayList<String>?=null,
    @SerializedName("cart_id")
    var cartId: Int?=null,
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    @SerializedName("currency")
    var currency: CartCurrency?=null
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
    
    @SerializedName("docs")
    var docs: ArrayList<Ticket>?=null,
    @SerializedName("filters")
    var filters: Filter?=null,
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
    var participants: @RawValue ArrayList<Any>?=null
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
    Model: Asset
*/
@Parcelize
data class Asset(
    
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
    var attachments: ArrayList<Asset>?=null
): Parcelable

/*
    Model: APIError
*/
@Parcelize
data class APIError(
    
    @SerializedName("code")
    var code: Double?=null,
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    @SerializedName("message")
    var message: String?=null
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
    Model: Components
*/
@Parcelize
data class Components(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("key_values")
    var keyValues: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("archived")
    var archived: Boolean?=null
): Parcelable

/*
    Model: KeyValueRequestBody
*/
@Parcelize
data class KeyValueRequestBody(
    
    @SerializedName("key_values")
    var keyValues: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null
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
    Model: KeyValue
*/
@Parcelize
data class KeyValue(
    
    @SerializedName("_id")
    var id: String?=null,
    @SerializedName("application")
    var application: String?=null,
    @SerializedName("key_values")
    var keyValues: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    @SerializedName("date_meta")
    var dateMeta: @RawValue HashMap<String,Any>?=null,
    @SerializedName("archived")
    var archived: Boolean?=null
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
    Model: AggregatorConfigDetail
*/
@Parcelize
data class AggregatorConfigDetail(
    
    @SerializedName("merchant_key")
    var merchantKey: String?=null,
    @SerializedName("verify_api")
    var verifyApi: String?=null,
    @SerializedName("api")
    var api: String?=null,
    @SerializedName("user_id")
    var userId: String?=null,
    @SerializedName("merchant_id")
    var merchantId: String?=null,
    @SerializedName("sdk")
    var sdk: Boolean?=null,
    @SerializedName("config_type")
    var configType: String?=null,
    @SerializedName("key")
    var key: String?=null,
    @SerializedName("pin")
    var pin: String?=null,
    @SerializedName("secret")
    var secret: String?=null
): Parcelable

/*
    Model: AggregatorsConfigDetailResponse
*/
@Parcelize
data class AggregatorsConfigDetailResponse(
    
    @SerializedName("mswipe")
    var mswipe: AggregatorConfigDetail?=null,
    @SerializedName("stripe")
    var stripe: AggregatorConfigDetail?=null,
    @SerializedName("juspay")
    var juspay: AggregatorConfigDetail?=null,
    @SerializedName("simpl")
    var simpl: AggregatorConfigDetail?=null,
    @SerializedName("payumoney")
    var payumoney: AggregatorConfigDetail?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("razorpay")
    var razorpay: AggregatorConfigDetail?=null,
    @SerializedName("ccavenue")
    var ccavenue: AggregatorConfigDetail?=null,
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
    @SerializedName("api")
    var api: String?=null,
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
    
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null
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
    
    @SerializedName("payload")
    var payload: String?=null,
    @SerializedName("merchant_params")
    var merchantParams: @RawValue HashMap<String,Any>?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null
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
    
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("verified")
    var verified: Boolean?=null,
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
    
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("cart_id")
    var cartId: String?=null,
    @SerializedName("delivery_address_id")
    var deliveryAddressId: String?=null
): Parcelable

/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("customer_id")
    var customerId: String?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    @SerializedName("timeout")
    var timeout: Int?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null
): Parcelable

/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("vpa")
    var vpa: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("customer_id")
    var customerId: String?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("message")
    var message: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("contact")
    var contact: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("currency")
    var currency: String?=null
): Parcelable

/*
    Model: PaymentStatusUpdateRequest
*/
@Parcelize
data class PaymentStatusUpdateRequest(
    
    @SerializedName("amount")
    var amount: Int?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("status")
    var status: String?=null,
    @SerializedName("vpa")
    var vpa: String?=null,
    @SerializedName("aggregator")
    var aggregator: String?=null,
    @SerializedName("customer_id")
    var customerId: String?=null,
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    @SerializedName("contact")
    var contact: String?=null,
    @SerializedName("order_id")
    var orderId: String?=null,
    @SerializedName("method")
    var method: String?=null,
    @SerializedName("currency")
    var currency: String?=null
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
    
    @SerializedName("exp_year")
    var expYear: Int?=null,
    @SerializedName("exp_month")
    var expMonth: Int?=null,
    @SerializedName("card_number")
    var cardNumber: String?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("card_id")
    var cardId: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("expired")
    var expired: Boolean?=null,
    @SerializedName("card_token")
    var cardToken: String?=null,
    @SerializedName("card_reference")
    var cardReference: String?=null,
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    @SerializedName("card_brand_image")
    var cardBrandImage: String?=null,
    @SerializedName("card_fingerprint")
    var cardFingerprint: String?=null,
    @SerializedName("nickname")
    var nickname: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("card_type")
    var cardType: String?=null,
    @SerializedName("card_issuer")
    var cardIssuer: String?=null,
    @SerializedName("card_isin")
    var cardIsin: String?=null,
    @SerializedName("card_name")
    var cardName: String?=null,
    @SerializedName("logo_url")
    var logoUrl: PaymentModeLogo?=null,
    @SerializedName("code")
    var code: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("card_brand")
    var cardBrand: String?=null
): Parcelable

/*
    Model: RootPaymentMode
*/
@Parcelize
data class RootPaymentMode(
    
    @SerializedName("anonymous_enable")
    var anonymousEnable: Boolean?=null,
    @SerializedName("list")
    var list: ArrayList<PaymentModeList>?=null,
    @SerializedName("name")
    var name: String?=null,
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    @SerializedName("add_card_enabled")
    var addCardEnabled: Boolean?=null
): Parcelable

/*
    Model: AggregatorRoute
*/
@Parcelize
data class AggregatorRoute(
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null,
    @SerializedName("payment_flow")
    var paymentFlow: String?=null,
    @SerializedName("api_link")
    var apiLink: String?=null
): Parcelable

/*
    Model: PaymentModeRouteResponse
*/
@Parcelize
data class PaymentModeRouteResponse(
    
    @SerializedName("payment_options")
    var paymentOptions: ArrayList<RootPaymentMode>?=null,
    @SerializedName("payment_flows")
    var paymentFlows: PaymentFlow?=null,
    @SerializedName("success")
    var success: Boolean?=null
): Parcelable

/*
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("branch_name")
    var branchName: Boolean?=null,
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    @SerializedName("account_no")
    var accountNo: String?=null,
    @SerializedName("id")
    var id: Int?=null,
    @SerializedName("title")
    var title: String?=null,
    @SerializedName("delights_user_name")
    var delightsUserName: String?=null,
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    @SerializedName("bank_name")
    var bankName: String?=null,
    @SerializedName("subtitle")
    var subtitle: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("comment")
    var comment: Boolean?=null,
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    @SerializedName("display_name")
    var displayName: String?=null,
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    @SerializedName("created_on")
    var createdOn: String?=null,
    @SerializedName("mobile")
    var mobile: Boolean?=null
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
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
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
    @SerializedName("email")
    var email: String?=null,
    @SerializedName("bank_name")
    var bankName: String?=null,
    @SerializedName("branch_name")
    var branchName: String?=null,
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    @SerializedName("address")
    var address: String?=null,
    @SerializedName("comment")
    var comment: String?=null,
    @SerializedName("account_no")
    var accountNo: String?=null,
    @SerializedName("mobile")
    var mobile: String?=null
): Parcelable

/*
    Model: AddBeneficiaryDetailsRequest
*/
@Parcelize
data class AddBeneficiaryDetailsRequest(
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    @SerializedName("delights")
    var delights: Boolean?=null,
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
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: String?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("request_id")
    var requestId: String?=null
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
    var order: @RawValue HashMap<String,Any>?=null
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
    @SerializedName("quantity")
    var quantity: Int?=null,
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
    Model: StoreDetailsResponse
*/
@Parcelize
data class StoreDetailsResponse(
    
    @SerializedName("items")
    var items: ArrayList<StoreDetail>?=null
): Parcelable



/*
    Model: GetPincodeCityResponse
*/
@Parcelize
data class GetPincodeCityResponse(
    
    @SerializedName("stormbreaker_uuid")
    var stormbreakerUuid: String?=null,
    @SerializedName("error")
    var error: @RawValue HashMap<String,Any>?=null,
    @SerializedName("success")
    var success: Boolean?=null,
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    @SerializedName("request_uuid")
    var requestUuid: String?=null
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

