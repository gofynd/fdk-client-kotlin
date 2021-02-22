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
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
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
    Model: ProductSizeStores
*/
@Parcelize
data class ProductSizeStores(
    
    @SerializedName("count")
    var count: Int?=null
    
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
    
    @SerializedName("max")
    var max: Double?=null,
    
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
    Model: ProductSizes
*/
@Parcelize
data class ProductSizes(
    
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSize>?=null,
    
    @SerializedName("size_chart")
    var sizeChart: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("stores")
    var stores: ProductSizeStores?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null
    
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
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
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
    
    @SerializedName("set")
    var set: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price_per_price")
    var pricePerPrice: ProductStockPrice?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("store")
    var store: Store?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("long_lat")
    var longLat: ArrayList<Double>?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("special_badge")
    var specialBadge: String?=null,
    
    @SerializedName("seller_count")
    var sellerCount: Int?=null,
    
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null
    
): Parcelable

/*
    Model: ProductPage
*/
@Parcelize
data class ProductPage(
    
    @SerializedName("total_item")
    var totalItem: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
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
    var page: ProductPage?=null,
    
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
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("key")
    var key: String?=null
    
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
    
    @SerializedName("attributes_metadata")
    var attributesMetadata: ArrayList<AttributeDetail>?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
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
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("color_name")
    var colorName: String?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null
    
): Parcelable

/*
    Model: ProductVariantResponse
*/
@Parcelize
data class ProductVariantResponse(
    
    @SerializedName("header")
    var header: String?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductVariantItemResponse>?=null
    
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
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("city")
    var city: String?=null
    
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
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("seller")
    var seller: Seller?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("store")
    var store: StoreDetail?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    
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
    var page: ProductPage?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductStockStatusItem>?=null
    
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable

/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
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
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    @SerializedName("filter")
    var filter: ArrayList<ProductFilters>?=null,
    
    @SerializedName("page")
    var page: ProductPage?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null
    
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
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable

/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    @SerializedName("page")
    var page: ProductPage?=null,
    
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
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
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
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
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
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable

/*
    Model: Page
*/
@Parcelize
data class Page(
    
    @SerializedName("page")
    var page: Int?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null
    
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
    var items: ArrayList<ProductDetail>?=null
    
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
    
    @SerializedName("logo")
    var logo: Media?=null,
    
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
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
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
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable

/*
    Model: CollectionBadge
*/
@Parcelize
data class CollectionBadge(
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("color")
    var color: String?=null
    
): Parcelable

/*
    Model: CollectionImage
*/
@Parcelize
data class CollectionImage(
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null
    
): Parcelable

/*
    Model: SeoDetail
*/
@Parcelize
data class SeoDetail(
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable

/*
    Model: CollectionBanner
*/
@Parcelize
data class CollectionBanner(
    
    @SerializedName("portrait")
    var portrait: CollectionImage?=null,
    
    @SerializedName("landscape")
    var landscape: CollectionImage?=null
    
): Parcelable

/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("cron")
    var cron: String?=null,
    
    @SerializedName("duration")
    var duration: Int?=null
    
): Parcelable

/*
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("badge")
    var badge: CollectionBadge?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null
    
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
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null
    
): Parcelable

/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    
    @SerializedName("page")
    var page: ProductPage?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null
    
): Parcelable

/*
    Model: CollectionItem
*/
@Parcelize
data class CollectionItem(
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable

/*
    Model: CollectionItemsRequest
*/
@Parcelize
data class CollectionItemsRequest(
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<CollectionItem>?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: CollectionItemsResponse
*/
@Parcelize
data class CollectionItemsResponse(
    
    @SerializedName("detail")
    var detail: String?=null
    
): Parcelable

/*
    Model: GetCollectionListingItemsResponse
*/
@Parcelize
data class GetCollectionListingItemsResponse(
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    
    @SerializedName("page")
    var page: ProductPage?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null
    
): Parcelable

/*
    Model: CollectionsUpdateDetailResponse
*/
@Parcelize
data class CollectionsUpdateDetailResponse(
    
    @SerializedName("data")
    var data: ArrayList<CollectionDetailResponse>?=null
    
): Parcelable

/*
    Model: CollectionDetailViewDeleteResponse
*/
@Parcelize
data class CollectionDetailViewDeleteResponse(
    
    @SerializedName("detail")
    var detail: String?=null
    
): Parcelable

/*
    Model: GetFollowListingResponse
*/
@Parcelize
data class GetFollowListingResponse(
    
    @SerializedName("page")
    var page: ProductPage?=null,
    
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
    
    @SerializedName("brands")
    var brands: ArrayList<Int>?=null,
    
    @SerializedName("collections")
    var collections: ArrayList<Int>?=null,
    
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
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("lat_long")
    var latLong: LatLong?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("store_email")
    var storeEmail: String?=null
    
): Parcelable

/*
    Model: StoreListingResponse
*/
@Parcelize
data class StoreListingResponse(
    
    @SerializedName("page")
    var page: ProductPage?=null,
    
    @SerializedName("items")
    var items: ArrayList<Store1>?=null
    
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
    Model: Context
*/
@Parcelize
data class Context(
    
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
    Model: Content
*/
@Parcelize
data class Content(
    
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
    var content: Content?=null
    
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
    var display: String?=null
    
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
    var context: Context?=null,
    
    @SerializedName("created_on")
    var createdOn: CreatedOn?=null,
    
    @SerializedName("response_id")
    var responseId: String?=null,
    
    @SerializedName("content")
    var content: Content?=null,
    
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

