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
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
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
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
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
    
    @SerializedName("marked")
    var marked: Price?=null,
    
    @SerializedName("effective")
    var effective: Price?=null
    
): Parcelable

/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("display")
    var display: String?=null
    
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
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<ProductSize>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("size_chart")
    var sizeChart: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stores")
    var stores: ProductSizeStores?=null
    
): Parcelable

/*
    Model: Seller
*/
@Parcelize
data class Seller(
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: ProductStockPrice
*/
@Parcelize
data class ProductStockPrice(
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("effective")
    var effective: Double?=null
    
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
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable

/*
    Model: ProductSizePriceResponse
*/
@Parcelize
data class ProductSizePriceResponse(
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller")
    var seller: Seller?=null,
    
    @SerializedName("price_per_price")
    var pricePerPrice: ProductStockPrice?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("set")
    var set: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null,
    
    @SerializedName("special_badge")
    var specialBadge: String?=null,
    
    @SerializedName("long_lat")
    var longLat: ArrayList<Double>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("store")
    var store: Store?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("seller_count")
    var sellerCount: Int?=null
    
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
    Model: ProductPage
*/
@Parcelize
data class ProductPage(
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("total_item")
    var totalItem: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null
    
): Parcelable

/*
    Model: ProductSizeSellersResponse
*/
@Parcelize
data class ProductSizeSellersResponse(
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSizeSellerFilter>?=null,
    
    @SerializedName("page")
    var page: ProductPage?=null,
    
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
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
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
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null
    
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
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductDetail>?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null
    
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
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("color_name")
    var colorName: String?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
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
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
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
    
    @SerializedName("seller")
    var seller: Seller?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: ProductStockPrice?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("store")
    var store: StoreDetail?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
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
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("kind")
    var kind: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    @SerializedName("min")
    var min: Int?=null,
    
    @SerializedName("query_format")
    var queryFormat: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("display_format")
    var displayFormat: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("selected_max")
    var selectedMax: Int?=null
    
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
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media>?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<ProductBrand>?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("filter")
    var filter: ArrayList<ProductFilters>?=null,
    
    @SerializedName("page")
    var page: ProductPage?=null,
    
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
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null
    
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
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
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
    
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null
    
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
    
    @SerializedName("logo")
    var logo: Media?=null,
    
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
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    
    @SerializedName("page_no")
    var pageNo: Int?=null
    
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
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
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
    Model: AutocompleteItem
*/
@Parcelize
data class AutocompleteItem(
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
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
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("email")
    var email: String?=null
    
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
    Model: CollectionImage
*/
@Parcelize
data class CollectionImage(
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable

/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("cron")
    var cron: String?=null
    
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
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("badge")
    var badge: CollectionBadge?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_schedule")
    var schedule: Schedule?=null,
    
    @SerializedName("banners")
    var banners: CollectionBanner?=null
    
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null
    
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
    
    @SerializedName("action")
    var action: ProductListingAction?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null
    
): Parcelable

/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    @SerializedName("page")
    var page: ProductPage?=null,
    
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    
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
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CollectionItem>?=null,
    
    @SerializedName("page_no")
    var pageNo: Int?=null
    
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
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("store_email")
    var storeEmail: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("lat_long")
    var latLong: LatLong?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null
    
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
    Model: AggregatorConfigDetail
*/
@Parcelize
data class AggregatorConfigDetail(
    
    @SerializedName("pin")
    var pin: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("merchant_id")
    var merchantId: String?=null,
    
    @SerializedName("verify_api")
    var verifyApi: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("sdk")
    var sdk: Boolean?=null,
    
    @SerializedName("secret")
    var secret: String?=null,
    
    @SerializedName("merchant_key")
    var merchantKey: String?=null,
    
    @SerializedName("api")
    var api: String?=null
    
): Parcelable

/*
    Model: AggregatorsConfigDetailResponse
*/
@Parcelize
data class AggregatorsConfigDetailResponse(
    
    @SerializedName("razorpay")
    var razorpay: AggregatorConfigDetail?=null,
    
    @SerializedName("payumoney")
    var payumoney: AggregatorConfigDetail?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("ccavenue")
    var ccavenue: AggregatorConfigDetail?=null,
    
    @SerializedName("juspay")
    var juspay: AggregatorConfigDetail?=null,
    
    @SerializedName("simpl")
    var simpl: AggregatorConfigDetail?=null,
    
    @SerializedName("stripe")
    var stripe: AggregatorConfigDetail?=null,
    
    @SerializedName("rupifi")
    var rupifi: AggregatorConfigDetail?=null,
    
    @SerializedName("mswipe")
    var mswipe: AggregatorConfigDetail?=null,
    
    @SerializedName("env")
    var env: String?=null
    
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
    
    @SerializedName("refresh")
    var refresh: Boolean?=null,
    
    @SerializedName("card_id")
    var cardId: String?=null
    
): Parcelable

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
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

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
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: ValidateCustomerRequest
*/
@Parcelize
data class ValidateCustomerRequest(
    
    @SerializedName("merchant_params")
    var merchantParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("transaction_amount_in_paise")
    var transactionAmountInPaise: Int?=null,
    
    @SerializedName("payload")
    var payload: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable

/*
    Model: ValidateCustomerResponse
*/
@Parcelize
data class ValidateCustomerResponse(
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ChargeCustomerRequest
*/
@Parcelize
data class ChargeCustomerRequest(
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("transaction_token")
    var transactionToken: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
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
    
    @SerializedName("delivery_address_id")
    var deliveryAddressId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("cart_id")
    var cartId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable

/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    @SerializedName("razorpay_payment_id")
    var razorpayPaymentId: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("aggregator_order_id")
    var aggregatorOrderId: String?=null,
    
    @SerializedName("polling_url")
    var pollingUrl: String?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("timeout")
    var timeout: Int?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("virtual_id")
    var virtualId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable

/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
): Parcelable

/*
    Model: PaymentStatusUpdateRequest
*/
@Parcelize
data class PaymentStatusUpdateRequest(
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("method")
    var method: String?=null,
    
    @SerializedName("vpa")
    var vpa: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("amount")
    var amount: Int?=null,
    
    @SerializedName("merchant_order_id")
    var merchantOrderId: String?=null,
    
    @SerializedName("customer_id")
    var customerId: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
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
    Model: PaymentOptionsDetails
*/
@Parcelize
data class PaymentOptionsDetails(
    
    @SerializedName("payment_option")
    var paymentOption: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: PaymentOptionsResponse
*/
@Parcelize
data class PaymentOptionsResponse(
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptionsDetails?=null
    
): Parcelable

/*
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    @SerializedName("comment")
    var comment: Boolean?=null,
    
    @SerializedName("transfer_mode")
    var transferMode: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile")
    var mobile: Boolean?=null,
    
    @SerializedName("branch_name")
    var branchName: Boolean?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
    @SerializedName("account_holder")
    var accountHolder: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
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
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable

/*
    Model: AddBeneficiaryViaOtpVerificationRequest
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationRequest(
    
    @SerializedName("otp")
    var otp: String?=null,
    
    @SerializedName("hash_key")
    var hashKey: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable

/*
    Model: AddBeneficiaryViaOtpVerificationResponse
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationResponse(
    
    @SerializedName("otp")
    var otp: String?=null,
    
    @SerializedName("hash_key")
    var hashKey: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable

/*
    Model: WrongOtpError
*/
@Parcelize
data class WrongOtpError(
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("success")
    var success: String?=null
    
): Parcelable

/*
    Model: BankDetails
*/
@Parcelize
data class BankDetails(
    
    @SerializedName("comment")
    var comment: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("ifsc_code")
    var ifscCode: String?=null,
    
    @SerializedName("mobile")
    var mobile: String?=null,
    
    @SerializedName("branch_name")
    var branchName: String?=null,
    
    @SerializedName("bank_name")
    var bankName: String?=null,
    
    @SerializedName("account_no")
    var accountNo: String?=null,
    
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
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("shipment_id")
    var shipmentId: String?=null,
    
    @SerializedName("details")
    var details: BankDetails?=null,
    
    @SerializedName("delights")
    var delights: Boolean?=null
    
): Parcelable

/*
    Model: RefundAccountResponse
*/
@Parcelize
data class RefundAccountResponse(
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("is_verified_flag")
    var isVerifiedFlag: String?=null,
    
    @SerializedName("request_id")
    var requestId: String?=null
    
): Parcelable

/*
    Model: SetDefaultBeneficiaryRequest
*/
@Parcelize
data class SetDefaultBeneficiaryRequest(
    
    @SerializedName("beneficiary_id")
    var beneficiaryId: String?=null,
    
    @SerializedName("order_id")
    var orderId: String?=null
    
): Parcelable

/*
    Model: SetDefaultBeneficiaryResponse
*/
@Parcelize
data class SetDefaultBeneficiaryResponse(
    
    @SerializedName("is_beneficiary_set")
    var isBeneficiarySet: Boolean?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
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
    Model: GetCartResponse
*/
@Parcelize
data class GetCartResponse(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("credit_details")
    var creditDetails: String?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("coupon_details")
    var couponDetails: String?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("breakup_values_analytics")
    var breakupValuesAnalytics: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
): Parcelable

/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("item_size")
    var itemSize: Int?=null,
    
    @SerializedName("pos")
    var pos: Boolean?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
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
    Model: CategoryInfo
*/
@Parcelize
data class CategoryInfo(
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: Int?=null
    
): Parcelable

/*
    Model: BaseInfo
*/
@Parcelize
data class BaseInfo(
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
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
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("query")
    var query: ActionQuery?=null
    
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
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<CategoryInfo>?=null,
    
    @SerializedName("brand")
    var brand: BaseInfo?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("images")
    var images: ArrayList<Image>?=null
    
): Parcelable

/*
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    @SerializedName("out_of_stock")
    var outOfStock: Boolean?=null,
    
    @SerializedName("other_store_quantity")
    var otherStoreQuantity: Int?=null,
    
    @SerializedName("deliverable")
    var deliverable: Boolean?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null
    
): Parcelable

/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    @SerializedName("add_on")
    var addOn: Double?=null,
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("selling")
    var selling: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable

/*
    Model: ProductPriceInfo
*/
@Parcelize
data class ProductPriceInfo(
    
    @SerializedName("base")
    var base: ProductPrice?=null,
    
    @SerializedName("converted")
    var converted: ProductPrice?=null
    
): Parcelable

/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    @SerializedName("product")
    var product: Product?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("article")
    var article: String?=null,
    
    @SerializedName("coupon_message")
    var couponMessage: String?=null,
    
    @SerializedName("bulk_offer")
    var bulkOffer: String?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("availability")
    var availability: ProductAvailability?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("price")
    var price: ProductPriceInfo?=null
    
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
    var value: Int?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable

/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    @SerializedName("subtotal")
    var subtotal: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Int?=null,
    
    @SerializedName("you_saved")
    var youSaved: Int?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Int?=null,
    
    @SerializedName("fynd_cash")
    var fyndCash: Int?=null,
    
    @SerializedName("coupon")
    var coupon: Int?=null
    
): Parcelable

/*
    Model: BaseLoyaltyPoints
*/
@Parcelize
data class BaseLoyaltyPoints(
    
    @SerializedName("applicable")
    var applicable: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("total")
    var total: Double?=null
    
): Parcelable

/*
    Model: BaseCartBreakup
*/
@Parcelize
data class BaseCartBreakup(
    
    @SerializedName("display")
    var display: DisplayBreakup?=null,
    
    @SerializedName("coupon")
    var coupon: CouponBreakup?=null,
    
    @SerializedName("raw")
    var raw: RawBreakup?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: BaseLoyaltyPoints?=null
    
): Parcelable

/*
    Model: PaymentOption
*/
@Parcelize
data class PaymentOption(
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("list")
    var list: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("display_priority")
    var displayPriority: Int?=null,
    
    @SerializedName("payment_mode_id")
    var paymentModeId: Int?=null
    
): Parcelable

/*
    Model: PaymentFlow
*/
@Parcelize
data class PaymentFlow(
    
    @SerializedName("api_link")
    var apiLink: String?=null,
    
    @SerializedName("payment_flow")
    var paymentFlow: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: PaymentFlows
*/
@Parcelize
data class PaymentFlows(
    
    @SerializedName("Fynd")
    var fynd: PaymentFlow?=null,
    
    @SerializedName("Simpl")
    var simpl: PaymentFlow?=null,
    
    @SerializedName("Razorpay")
    var razorpay: PaymentFlow?=null,
    
    @SerializedName("UPI_Razorpay")
    var upiRazorpay: PaymentFlow?=null,
    
    @SerializedName("Juspay")
    var juspay: PaymentFlow?=null
    
): Parcelable

/*
    Model: PaymentOptions
*/
@Parcelize
data class PaymentOptions(
    
    @SerializedName("payment_option")
    var paymentOption: ArrayList<PaymentOption>?=null,
    
    @SerializedName("payment_flows")
    var paymentFlows: PaymentFlows?=null,
    
    @SerializedName("default")
    var default: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: CartResponse
*/
@Parcelize
data class CartResponse(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: BaseCartBreakup?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
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
    
    @SerializedName("item_size")
    var itemSize: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("article_id")
    var articleId: String?=null
    
): Parcelable

/*
    Model: UpdateCartRequest
*/
@Parcelize
data class UpdateCartRequest(
    
    @SerializedName("operation")
    var operation: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<UpdateProductCart>?=null
    
): Parcelable

/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("is_applicable")
    var isApplicable: Boolean?=null,
    
    @SerializedName("coupon_value")
    var couponValue: Double?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("sub_title")
    var subTitle: String?=null,
    
    @SerializedName("expires_on")
    var expiresOn: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("minimum_cart_value")
    var minimumCartValue: Double?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("coupon_code")
    var couponCode: String?=null,
    
    @SerializedName("max_discount_value")
    var maxDiscountValue: Double?=null
    
): Parcelable

/*
    Model: PageCoupon
*/
@Parcelize
data class PageCoupon(
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("total_item_count")
    var totalItemCount: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
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
    Model: CartCoupon
*/
@Parcelize
data class CartCoupon(
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("value")
    var value: Int?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable

/*
    Model: RawCartCoupon
*/
@Parcelize
data class RawCartCoupon(
    
    @SerializedName("subtotal")
    var subtotal: Double?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("you_saved")
    var youSaved: Double?=null,
    
    @SerializedName("convenience_fee")
    var convenienceFee: Double?=null,
    
    @SerializedName("mrp_total")
    var mrpTotal: Double?=null,
    
    @SerializedName("delivery_charge")
    var deliveryCharge: Double?=null,
    
    @SerializedName("gst_charges")
    var gstCharges: Double?=null,
    
    @SerializedName("cod_charge")
    var codCharge: Double?=null,
    
    @SerializedName("fynd_cash")
    var fyndCash: Double?=null,
    
    @SerializedName("coupon")
    var coupon: Double?=null,
    
    @SerializedName("discount")
    var discount: Double?=null,
    
    @SerializedName("vog")
    var vog: Double?=null
    
): Parcelable

/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    @SerializedName("applicable")
    var applicable: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_applied")
    var isApplied: Boolean?=null,
    
    @SerializedName("total")
    var total: Int?=null
    
): Parcelable

/*
    Model: SaveCoupon
*/
@Parcelize
data class SaveCoupon(
    
    @SerializedName("coupon")
    var coupon: CartCoupon?=null,
    
    @SerializedName("display")
    var display: ArrayList<String>?=null,
    
    @SerializedName("raw")
    var raw: RawCartCoupon?=null,
    
    @SerializedName("loyalty_points")
    var loyaltyPoints: LoyaltyPoints?=null
    
): Parcelable

/*
    Model: SaveCouponResponse
*/
@Parcelize
data class SaveCouponResponse(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("items")
    var items: ArrayList<String>?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: SaveCoupon?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
): Parcelable

/*
    Model: OfferPrice
*/
@Parcelize
data class OfferPrice(
    
    @SerializedName("marked")
    var marked: Int?=null,
    
    @SerializedName("effective")
    var effective: Int?=null,
    
    @SerializedName("bulk_effective")
    var bulkEffective: Double?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null
    
): Parcelable

/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    @SerializedName("auto_applied")
    var autoApplied: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("best")
    var best: Boolean?=null,
    
    @SerializedName("margin")
    var margin: Int?=null,
    
    @SerializedName("total")
    var total: Double?=null,
    
    @SerializedName("price")
    var price: OfferPrice?=null
    
): Parcelable

/*
    Model: OfferSeller
*/
@Parcelize
data class OfferSeller(
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
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
    Model: Address
*/
@Parcelize
data class Address(
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("area_code")
    var areaCode: String?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("address_id")
    var addressId: Int?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("area_code_slug")
    var areaCodeSlug: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("geo_location")
    var geoLocation: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("city")
    var city: String?=null,
    
    @SerializedName("address")
    var address: String?=null
    
): Parcelable

/*
    Model: GetAddressResponse
*/
@Parcelize
data class GetAddressResponse(
    
    @SerializedName("address")
    var address: ArrayList<Address>?=null
    
): Parcelable

/*
    Model: SaveAddressRequest
*/
@Parcelize
data class SaveAddressRequest(
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null
    
): Parcelable

/*
    Model: SaveAddressResponse
*/
@Parcelize
data class SaveAddressResponse(
    
    @SerializedName("address_id")
    var addressId: Int?=null,
    
    @SerializedName("success")
    var success: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null
    
): Parcelable

/*
    Model: UpdateAddressRequest
*/
@Parcelize
data class UpdateAddressRequest(
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("phone")
    var phone: Int?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("area")
    var area: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("is_default_address")
    var isDefaultAddress: Boolean?=null
    
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
    
    @SerializedName("success")
    var success: Boolean?=null,
    
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
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("aggregator_name")
    var aggregatorName: String?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("address_id")
    var addressId: Int?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null
    
): Parcelable

/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    @SerializedName("fulfillment_type")
    var fulfillmentType: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("box_type")
    var boxType: String?=null,
    
    @SerializedName("shipment_type")
    var shipmentType: String?=null,
    
    @SerializedName("promise")
    var promise: String?=null,
    
    @SerializedName("dp_id")
    var dpId: Int?=null,
    
    @SerializedName("shipments")
    var shipments: Int?=null,
    
    @SerializedName("fulfillment_id")
    var fulfillmentId: Int?=null,
    
    @SerializedName("dp_options")
    var dpOptions: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: BaseCartBreakup?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("shipments")
    var shipments: ArrayList<ShipmentResponse>?=null,
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
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
    Model: CartCheckoutRequest
*/
@Parcelize
data class CartCheckoutRequest(
    
    @SerializedName("extra_meta")
    var extraMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("billing_address")
    var billingAddress: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_mode")
    var paymentMode: String?=null,
    
    @SerializedName("fyndstore_emp_id")
    var fyndstoreEmpId: String?=null,
    
    @SerializedName("merchant_code")
    var merchantCode: String?=null,
    
    @SerializedName("payment_auto_confirm")
    var paymentAutoConfirm: Boolean?=null,
    
    @SerializedName("address_id")
    var addressId: Int?=null,
    
    @SerializedName("billing_address_id")
    var billingAddressId: Int?=null,
    
    @SerializedName("payment_params")
    var paymentParams: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("payment_identifier")
    var paymentIdentifier: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null,
    
    @SerializedName("staff")
    var staff: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("aggregator")
    var aggregator: String?=null
    
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
    Model: DeliverySlot
*/
@Parcelize
data class DeliverySlot(
    
    @SerializedName("default")
    var default: Boolean?=null,
    
    @SerializedName("delivery_slot_timing")
    var deliverySlotTiming: String?=null,
    
    @SerializedName("delivery_slot_id")
    var deliverySlotId: Int?=null
    
): Parcelable

/*
    Model: DeliverySlotDate
*/
@Parcelize
data class DeliverySlotDate(
    
    @SerializedName("date")
    var date: String?=null,
    
    @SerializedName("delivery_slot")
    var deliverySlot: ArrayList<DeliverySlot>?=null
    
): Parcelable

/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("cod_available")
    var codAvailable: Boolean?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("store_emps")
    var storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("cod_message")
    var codMessage: String?=null,
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("delivery_slots")
    var deliverySlots: ArrayList<DeliverySlotDate>?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("delivery_charge_order_value")
    var deliveryChargeOrderValue: Int?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: BaseCartBreakup?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("cod_charges")
    var codCharges: Int?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("error_message")
    var errorMessage: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("delivery_charges")
    var deliveryCharges: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    
    @SerializedName("user_type")
    var userType: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
): Parcelable

/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    @SerializedName("order_id")
    var orderId: String?=null,
    
    @SerializedName("app_intercept_url")
    var appInterceptUrl: String?=null,
    
    @SerializedName("data")
    var data: OrderData?=null,
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("callback_url")
    var callbackUrl: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("cart")
    var cart: CheckCart?=null
    
): Parcelable

/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    @SerializedName("selected_staff")
    var selectedStaff: String?=null,
    
    @SerializedName("ordering_store")
    var orderingStore: Int?=null
    
): Parcelable

/*
    Model: SharedCartDetails
*/
@Parcelize
data class SharedCartDetails(
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("meta")
    var meta: Meta?=null,
    
    @SerializedName("source")
    var source: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: SharedCartResponse
*/
@Parcelize
data class SharedCartResponse(
    
    @SerializedName("delivery_charge_info")
    var deliveryChargeInfo: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("currency")
    var currency: CartCurrency?=null,
    
    @SerializedName("items")
    var items: ArrayList<CartProductInfo>?=null,
    
    @SerializedName("restrict_checkout")
    var restrictCheckout: Boolean?=null,
    
    @SerializedName("shared_cart_details")
    var sharedCartDetails: SharedCartDetails?=null,
    
    @SerializedName("breakup_values")
    var breakupValues: BaseCartBreakup?=null,
    
    @SerializedName("coupon_text")
    var couponText: String?=null,
    
    @SerializedName("is_valid")
    var isValid: Boolean?=null,
    
    @SerializedName("last_modified")
    var lastModified: String?=null,
    
    @SerializedName("checkout_mode")
    var checkoutMode: String?=null,
    
    @SerializedName("cart_id")
    var cartId: Int?=null,
    
    @SerializedName("payment_options")
    var paymentOptions: PaymentOptions?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("gstin")
    var gstin: String?=null
    
): Parcelable

