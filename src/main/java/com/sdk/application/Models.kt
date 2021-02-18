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
    
    @SerializedName(type")
    val type: String?=null,
    
    @SerializedName(query")
    val query: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ProductListingAction
*/
@Parcelize
data class ProductListingAction(
    
    @SerializedName(page")
    val page: ProductListingActionPage?=null,
    
    @SerializedName(type")
    val type: String?=null
    
): Parcelable

/*
    Model: Media
*/
@Parcelize
data class Media(
    
    @SerializedName(type")
    val type: String?=null,
    
    @SerializedName(url")
    val url: String?=null
    
): Parcelable

/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(action")
    val action: ProductListingAction?=null,
    
    @SerializedName(logo")
    val logo: Media?=null,
    
    @SerializedName(name")
    val name: String?=null
    
): Parcelable

/*
    Model: ProductDetailAttribute
*/
@Parcelize
data class ProductDetailAttribute(
    
    @SerializedName(type")
    val type: String?=null,
    
    @SerializedName(value")
    val value: String?=null,
    
    @SerializedName(key")
    val key: String?=null
    
): Parcelable

/*
    Model: ProductDetailGroupedAttribute
*/
@Parcelize
data class ProductDetailGroupedAttribute(
    
    @SerializedName(title")
    val title: String?=null,
    
    @SerializedName(details")
    val details: ArrayList<ProductDetailAttribute>?=null
    
): Parcelable

/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    @SerializedName(categories")
    val categories: ArrayList<ProductBrand>?=null,
    
    @SerializedName(slug")
    val slug: String?=null,
    
    @SerializedName(has_variant")
    val hasVariant: Boolean?=null,
    
    @SerializedName(rating_count")
    val ratingCount: Int?=null,
    
    @SerializedName(teaser_tag")
    val teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(tryouts")
    val tryouts: ArrayList<String>?=null,
    
    @SerializedName(product_online_date")
    val productOnlineDate: String?=null,
    
    @SerializedName(attributes")
    val attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(rating")
    val rating: Double?=null,
    
    @SerializedName(image_nature")
    val imageNature: String?=null,
    
    @SerializedName(color")
    val color: String?=null,
    
    @SerializedName(item_type")
    val itemType: String?=null,
    
    @SerializedName(similars")
    val similars: ArrayList<String>?=null,
    
    @SerializedName(brand")
    val brand: ProductBrand?=null,
    
    @SerializedName(medias")
    val medias: ArrayList<Media>?=null,
    
    @SerializedName(promo_meta")
    val promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(type")
    val type: String?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(grouped_attributes")
    val groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName(highlights")
    val highlights: ArrayList<String>?=null
    
): Parcelable

/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    @SerializedName(error")
    val error: String?=null
    
): Parcelable

/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    @SerializedName(is_available")
    val isAvailable: Boolean?=null,
    
    @SerializedName(display")
    val display: String?=null,
    
    @SerializedName(quantity")
    val quantity: Int?=null,
    
    @SerializedName(value")
    val value: String?=null
    
): Parcelable

/*
    Model: ProductSizeStores
*/
@Parcelize
data class ProductSizeStores(
    
    @SerializedName(count")
    val count: Int?=null
    
): Parcelable

/*
    Model: Price
*/
@Parcelize
data class Price(
    
    @SerializedName(currency_code")
    val currencyCode: String?=null,
    
    @SerializedName(currency_symbol")
    val currencySymbol: String?=null,
    
    @SerializedName(min")
    val min: Double?=null,
    
    @SerializedName(max")
    val max: Double?=null
    
): Parcelable

/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    @SerializedName(marked")
    val marked: Price?=null,
    
    @SerializedName(effective")
    val effective: Price?=null
    
): Parcelable

/*
    Model: ProductSizes
*/
@Parcelize
data class ProductSizes(
    
    @SerializedName(sizes")
    val sizes: ArrayList<ProductSize>?=null,
    
    @SerializedName(sellable")
    val sellable: Boolean?=null,
    
    @SerializedName(promo_meta")
    val promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(size_chart")
    val sizeChart: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(stores")
    val stores: ProductSizeStores?=null,
    
    @SerializedName(discount")
    val discount: String?=null,
    
    @SerializedName(price")
    val price: ProductListingPrice?=null
    
): Parcelable

/*
    Model: Store
*/
@Parcelize
data class Store(
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(count")
    val count: Int?=null,
    
    @SerializedName(name")
    val name: String?=null
    
): Parcelable

/*
    Model: Seller
*/
@Parcelize
data class Seller(
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(count")
    val count: Int?=null,
    
    @SerializedName(name")
    val name: String?=null
    
): Parcelable

/*
    Model: ProductStockPrice
*/
@Parcelize
data class ProductStockPrice(
    
    @SerializedName(marked")
    val marked: Double?=null,
    
    @SerializedName(effective")
    val effective: Double?=null,
    
    @SerializedName(currency")
    val currency: String?=null
    
): Parcelable

/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    @SerializedName(level")
    val level: String?=null,
    
    @SerializedName(strategy")
    val strategy: String?=null
    
): Parcelable

/*
    Model: ProductSizePriceResponse
*/
@Parcelize
data class ProductSizePriceResponse(
    
    @SerializedName(special_badge")
    val specialBadge: String?=null,
    
    @SerializedName(store")
    val store: Store?=null,
    
    @SerializedName(set")
    val set: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(seller_count")
    val sellerCount: Int?=null,
    
    @SerializedName(seller")
    val seller: Seller?=null,
    
    @SerializedName(strategy_wise_listing")
    val strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName(promo_meta")
    val promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(price_per_price")
    val pricePerPrice: ProductStockPrice?=null,
    
    @SerializedName(pincode")
    val pincode: Int?=null,
    
    @SerializedName(article_id")
    val articleId: String?=null,
    
    @SerializedName(quantity")
    val quantity: Int?=null,
    
    @SerializedName(discount")
    val discount: String?=null,
    
    @SerializedName(item_type")
    val itemType: String?=null,
    
    @SerializedName(article_assignment")
    val articleAssignment: ArticleAssignment?=null,
    
    @SerializedName(long_lat")
    val longLat: ArrayList<Double>?=null,
    
    @SerializedName(price")
    val price: ProductStockPrice?=null
    
): Parcelable

/*
    Model: ProductPage
*/
@Parcelize
data class ProductPage(
    
    @SerializedName(has_next")
    val hasNext: Boolean?=null,
    
    @SerializedName(total_item")
    val totalItem: Int?=null,
    
    @SerializedName(next_id")
    val nextId: String?=null,
    
    @SerializedName(has_previous")
    val hasPrevious: Boolean?=null,
    
    @SerializedName(current")
    val current: Int?=null
    
): Parcelable

/*
    Model: ProductSizeSellerFilter
*/
@Parcelize
data class ProductSizeSellerFilter(
    
    @SerializedName(value")
    val value: String?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(is_selected")
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: ProductSizeSellersResponse
*/
@Parcelize
data class ProductSizeSellersResponse(
    
    @SerializedName(items")
    val items: ArrayList<ProductSizePriceResponse>?=null,
    
    @SerializedName(page")
    val page: ProductPage?=null,
    
    @SerializedName(sort_on")
    val sortOn: ArrayList<ProductSizeSellerFilter>?=null
    
): Parcelable

/*
    Model: AttributeDetail
*/
@Parcelize
data class AttributeDetail(
    
    @SerializedName(display")
    val display: String?=null,
    
    @SerializedName(description")
    val description: String?=null,
    
    @SerializedName(key")
    val key: String?=null
    
): Parcelable

/*
    Model: ProductsComparisonResponse
*/
@Parcelize
data class ProductsComparisonResponse(
    
    @SerializedName(items")
    val items: ArrayList<ProductDetail>?=null,
    
    @SerializedName(attributes_metadata")
    val attributesMetadata: ArrayList<AttributeDetail>?=null
    
): Parcelable

/*
    Model: ProductCompareResponse
*/
@Parcelize
data class ProductCompareResponse(
    
    @SerializedName(subtitle")
    val subtitle: String?=null,
    
    @SerializedName(attributes_metadata")
    val attributesMetadata: ArrayList<AttributeDetail>?=null,
    
    @SerializedName(title")
    val title: String?=null,
    
    @SerializedName(items")
    val items: ArrayList<ProductDetail>?=null
    
): Parcelable

/*
    Model: ProductFrequentlyComparedSimilarResponse
*/
@Parcelize
data class ProductFrequentlyComparedSimilarResponse(
    
    @SerializedName(similars")
    val similars: ArrayList<ProductCompareResponse>?=null
    
): Parcelable

/*
    Model: ProductSimilarItem
*/
@Parcelize
data class ProductSimilarItem(
    
    @SerializedName(subtitle")
    val subtitle: String?=null,
    
    @SerializedName(title")
    val title: String?=null,
    
    @SerializedName(items")
    val items: ArrayList<ProductDetail>?=null
    
): Parcelable

/*
    Model: SimilarProductByTypeResponse
*/
@Parcelize
data class SimilarProductByTypeResponse(
    
    @SerializedName(similars")
    val similars: ArrayList<ProductSimilarItem>?=null
    
): Parcelable

/*
    Model: ProductVariantItemResponse
*/
@Parcelize
data class ProductVariantItemResponse(
    
    @SerializedName(action")
    val action: ProductListingAction?=null,
    
    @SerializedName(medias")
    val medias: ArrayList<Media>?=null,
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(color_name")
    val colorName: String?=null,
    
    @SerializedName(is_available")
    val isAvailable: Boolean?=null,
    
    @SerializedName(slug")
    val slug: String?=null,
    
    @SerializedName(color")
    val color: String?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(value")
    val value: String?=null
    
): Parcelable

/*
    Model: ProductVariantResponse
*/
@Parcelize
data class ProductVariantResponse(
    
    @SerializedName(items")
    val items: ArrayList<ProductVariantItemResponse>?=null,
    
    @SerializedName(display_type")
    val displayType: String?=null,
    
    @SerializedName(header")
    val header: String?=null
    
): Parcelable

/*
    Model: ProductVariantsResponse
*/
@Parcelize
data class ProductVariantsResponse(
    
    @SerializedName(variants")
    val variants: ArrayList<ProductVariantResponse>?=null
    
): Parcelable

/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    @SerializedName(id")
    val id: Int?=null,
    
    @SerializedName(city")
    val city: String?=null,
    
    @SerializedName(code")
    val code: String?=null,
    
    @SerializedName(name")
    val name: String?=null
    
): Parcelable

/*
    Model: CompanyDetail
*/
@Parcelize
data class CompanyDetail(
    
    @SerializedName(id")
    val id: Int?=null,
    
    @SerializedName(name")
    val name: String?=null
    
): Parcelable

/*
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    @SerializedName(store")
    val store: StoreDetail?=null,
    
    @SerializedName(identifier")
    val identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(uid")
    val uid: String?=null,
    
    @SerializedName(company")
    val company: CompanyDetail?=null,
    
    @SerializedName(size")
    val size: String?=null,
    
    @SerializedName(quantity")
    val quantity: Int?=null,
    
    @SerializedName(item_id")
    val itemId: Int?=null,
    
    @SerializedName(seller")
    val seller: Seller?=null,
    
    @SerializedName(price")
    val price: ProductStockPrice?=null
    
): Parcelable

/*
    Model: ProductStockStatusResponse
*/
@Parcelize
data class ProductStockStatusResponse(
    
    @SerializedName(items")
    val items: ArrayList<ProductStockStatusItem>?=null
    
): Parcelable

/*
    Model: ProductStockPolling
*/
@Parcelize
data class ProductStockPolling(
    
    @SerializedName(items")
    val items: ArrayList<ProductStockStatusItem>?=null,
    
    @SerializedName(page")
    val page: ProductPage?=null
    
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    @SerializedName(display")
    val display: String?=null,
    
    @SerializedName(count")
    val count: Int?=null,
    
    @SerializedName(is_selected")
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    @SerializedName(display")
    val display: String?=null,
    
    @SerializedName(name")
    val name: String?=null
    
): Parcelable

/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    @SerializedName(values")
    val values: ArrayList<ProductFiltersValue>?=null,
    
    @SerializedName(key")
    val key: ProductFiltersKey?=null
    
): Parcelable

/*
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    @SerializedName(value")
    val value: String?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(is_selected")
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    @SerializedName(items")
    val items: ArrayList<ProductDetail>?=null,
    
    @SerializedName(filter")
    val filter: ArrayList<ProductFilters>?=null,
    
    @SerializedName(sort_on")
    val sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName(page")
    val page: ProductPage?=null
    
): Parcelable

/*
    Model: ImageUrls
*/
@Parcelize
data class ImageUrls(
    
    @SerializedName(landscape")
    val landscape: Media?=null,
    
    @SerializedName(portrait")
    val portrait: Media?=null
    
): Parcelable

/*
    Model: BrandItem
*/
@Parcelize
data class BrandItem(
    
    @SerializedName(action")
    val action: ProductListingAction?=null,
    
    @SerializedName(departments")
    val departments: ArrayList<String>?=null,
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(banners")
    val banners: ImageUrls?=null,
    
    @SerializedName(slug")
    val slug: String?=null,
    
    @SerializedName(logo")
    val logo: Media?=null,
    
    @SerializedName(discount")
    val discount: String?=null,
    
    @SerializedName(name")
    val name: String?=null
    
): Parcelable

/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    @SerializedName(items")
    val items: ArrayList<BrandItem>?=null,
    
    @SerializedName(page")
    val page: ProductPage?=null
    
): Parcelable

/*
    Model: BrandDetailResponse
*/
@Parcelize
data class BrandDetailResponse(
    
    @SerializedName(logo")
    val logo: Media?=null,
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(banners")
    val banners: ImageUrls?=null
    
): Parcelable

/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    @SerializedName(action")
    val action: ProductListingAction?=null,
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(childs")
    val childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName(banners")
    val banners: ImageUrls?=null,
    
    @SerializedName(slug")
    val slug: String?=null,
    
    @SerializedName(name")
    val name: String?=null
    
): Parcelable

/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    @SerializedName(department")
    val department: String?=null,
    
    @SerializedName(items")
    val items: ArrayList<CategoryItems>?=null
    
): Parcelable

/*
    Model: DepartmentIdentifier
*/
@Parcelize
data class DepartmentIdentifier(
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(slug")
    val slug: String?=null
    
): Parcelable

/*
    Model: CategoryListingResponse
*/
@Parcelize
data class CategoryListingResponse(
    
    @SerializedName(data")
    val data: ArrayList<DepartmentCategoryTree>?=null,
    
    @SerializedName(departments")
    val departments: ArrayList<DepartmentIdentifier>?=null
    
): Parcelable

/*
    Model: CategoryMetaResponse
*/
@Parcelize
data class CategoryMetaResponse(
    
    @SerializedName(logo")
    val logo: Media?=null,
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(banners")
    val banners: ImageUrls?=null
    
): Parcelable

/*
    Model: Page
*/
@Parcelize
data class Page(
    
    @SerializedName(page")
    val page: Int?=null,
    
    @SerializedName(page_size")
    val pageSize: Int?=null
    
): Parcelable

/*
    Model: HomeListingResponse
*/
@Parcelize
data class HomeListingResponse(
    
    @SerializedName(items")
    val items: ArrayList<ProductDetail>?=null,
    
    @SerializedName(page")
    val page: Page?=null,
    
    @SerializedName(message")
    val message: String?=null
    
): Parcelable

/*
    Model: Department
*/
@Parcelize
data class Department(
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(priority_order")
    val priorityOrder: Int?=null,
    
    @SerializedName(slug")
    val slug: String?=null,
    
    @SerializedName(logo")
    val logo: Media?=null,
    
    @SerializedName(name")
    val name: String?=null
    
): Parcelable

/*
    Model: DepartmentResponse
*/
@Parcelize
data class DepartmentResponse(
    
    @SerializedName(items")
    val items: ArrayList<Department>?=null
    
): Parcelable

/*
    Model: AutocompleteItem
*/
@Parcelize
data class AutocompleteItem(
    
    @SerializedName(logo")
    val logo: Media?=null,
    
    @SerializedName(display")
    val display: String?=null,
    
    @SerializedName(action")
    val action: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(type")
    val type: String?=null
    
): Parcelable

/*
    Model: AutoCompleteResponse
*/
@Parcelize
data class AutoCompleteResponse(
    
    @SerializedName(items")
    val items: ArrayList<AutocompleteItem>?=null
    
): Parcelable

/*
    Model: SeoDetail
*/
@Parcelize
data class SeoDetail(
    
    @SerializedName(title")
    val title: String?=null,
    
    @SerializedName(description")
    val description: String?=null
    
): Parcelable

/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    @SerializedName(slug")
    val slug: String?=null,
    
    @SerializedName(tag")
    val tag: ArrayList<String>?=null,
    
    @SerializedName(badge")
    val badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(allow_sort")
    val allowSort: Boolean?=null,
    
    @SerializedName(cron")
    val cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(action")
    val action: ProductListingAction?=null,
    
    @SerializedName(visible_facets_keys")
    val visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName(meta")
    val meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(_schedule")
    val schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(app_id")
    val appId: String?=null,
    
    @SerializedName(is_active")
    val isActive: Boolean?=null,
    
    @SerializedName(description")
    val description: String?=null,
    
    @SerializedName(banners")
    val banners: ImageUrls?=null,
    
    @SerializedName(query")
    val query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(allow_facets")
    val allowFacets: Boolean?=null,
    
    @SerializedName(seo")
    val seo: SeoDetail?=null,
    
    @SerializedName(type")
    val type: String?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(uid")
    val uid: String?=null,
    
    @SerializedName(logo")
    val logo: Media?=null
    
): Parcelable

/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    @SerializedName(display")
    val display: String?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(is_selected")
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    @SerializedName(display")
    val display: String?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(is_selected")
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    @SerializedName(type")
    val type: ArrayList<CollectionListingFilterType>?=null,
    
    @SerializedName(tags")
    val tags: ArrayList<CollectionListingFilterTag>?=null
    
): Parcelable

/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    @SerializedName(items")
    val items: ArrayList<GetCollectionDetailNest>?=null,
    
    @SerializedName(page")
    val page: ProductPage?=null,
    
    @SerializedName(filters")
    val filters: CollectionListingFilter?=null
    
): Parcelable

/*
    Model: CollectionBadge
*/
@Parcelize
data class CollectionBadge(
    
    @SerializedName(text")
    val text: String?=null,
    
    @SerializedName(color")
    val color: String?=null
    
): Parcelable

/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    @SerializedName(uid")
    val uid: String?=null,
    
    @SerializedName(username")
    val username: String?=null,
    
    @SerializedName(user_id")
    val userId: String?=null,
    
    @SerializedName(email")
    val email: String?=null
    
): Parcelable

/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    @SerializedName(cron")
    val cron: String?=null,
    
    @SerializedName(end")
    val end: String?=null,
    
    @SerializedName(duration")
    val duration: Int?=null,
    
    @SerializedName(start")
    val start: String?=null
    
): Parcelable

/*
    Model: CollectionImage
*/
@Parcelize
data class CollectionImage(
    
    @SerializedName(url")
    val url: String?=null,
    
    @SerializedName(aspect_ratio")
    val aspectRatio: String?=null
    
): Parcelable

/*
    Model: CollectionBanner
*/
@Parcelize
data class CollectionBanner(
    
    @SerializedName(landscape")
    val landscape: CollectionImage?=null,
    
    @SerializedName(portrait")
    val portrait: CollectionImage?=null
    
): Parcelable

/*
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    @SerializedName(_locale_language")
    val localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(slug")
    val slug: String?=null,
    
    @SerializedName(_custom_json")
    val customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(sort_on")
    val sortOn: String?=null,
    
    @SerializedName(badge")
    val badge: CollectionBadge?=null,
    
    @SerializedName(allow_sort")
    val allowSort: Boolean?=null,
    
    @SerializedName(visible_facets_keys")
    val visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName(modified_by")
    val modifiedBy: UserInfo?=null,
    
    @SerializedName(meta")
    val meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(_schedule")
    val schedule: Schedule?=null,
    
    @SerializedName(tags")
    val tags: ArrayList<String>?=null,
    
    @SerializedName(app_id")
    val appId: String?=null,
    
    @SerializedName(banners")
    val banners: CollectionBanner?=null,
    
    @SerializedName(query")
    val query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(is_active")
    val isActive: Boolean?=null,
    
    @SerializedName(description")
    val description: String?=null,
    
    @SerializedName(allow_facets")
    val allowFacets: Boolean?=null,
    
    @SerializedName(seo")
    val seo: SeoDetail?=null,
    
    @SerializedName(type")
    val type: String?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(logo")
    val logo: CollectionImage?=null,
    
    @SerializedName(published")
    val published: Boolean?=null,
    
    @SerializedName(created_by")
    val createdBy: UserInfo?=null
    
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    @SerializedName(meta")
    val meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(cron")
    val cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(app_id")
    val appId: String?=null,
    
    @SerializedName(visible_facets_keys")
    val visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName(is_active")
    val isActive: Boolean?=null,
    
    @SerializedName(description")
    val description: String?=null,
    
    @SerializedName(banners")
    val banners: ImageUrls?=null,
    
    @SerializedName(query")
    val query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(slug")
    val slug: String?=null,
    
    @SerializedName(allow_facets")
    val allowFacets: Boolean?=null,
    
    @SerializedName(logo")
    val logo: Media?=null,
    
    @SerializedName(seo")
    val seo: SeoDetail?=null,
    
    @SerializedName(tag")
    val tag: ArrayList<String>?=null,
    
    @SerializedName(type")
    val type: String?=null,
    
    @SerializedName(badge")
    val badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(_schedule")
    val schedule: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(allow_sort")
    val allowSort: Boolean?=null
    
): Parcelable

/*
    Model: GetCollectionListingItemsResponse
*/
@Parcelize
data class GetCollectionListingItemsResponse(
    
    @SerializedName(items")
    val items: ArrayList<ProductDetail>?=null,
    
    @SerializedName(page")
    val page: ProductPage?=null,
    
    @SerializedName(sort_on")
    val sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName(filters")
    val filters: ArrayList<ProductFilters>?=null
    
): Parcelable

/*
    Model: CollectionItem
*/
@Parcelize
data class CollectionItem(
    
    @SerializedName(action")
    val action: String?=null,
    
    @SerializedName(item_id")
    val itemId: Int?=null
    
): Parcelable

/*
    Model: CollectionItemsRequest
*/
@Parcelize
data class CollectionItemsRequest(
    
    @SerializedName(page_size")
    val pageSize: Int?=null,
    
    @SerializedName(query")
    val query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(items")
    val items: ArrayList<CollectionItem>?=null,
    
    @SerializedName(page_no")
    val pageNo: Int?=null,
    
    @SerializedName(type")
    val type: String?=null
    
): Parcelable

/*
    Model: CollectionItemsResponse
*/
@Parcelize
data class CollectionItemsResponse(
    
    @SerializedName(detail")
    val detail: String?=null
    
): Parcelable

/*
    Model: CollectionsUpdateDetailResponse
*/
@Parcelize
data class CollectionsUpdateDetailResponse(
    
    @SerializedName(data")
    val data: ArrayList<CollectionDetailResponse>?=null
    
): Parcelable

/*
    Model: CollectionDetailViewDeleteResponse
*/
@Parcelize
data class CollectionDetailViewDeleteResponse(
    
    @SerializedName(detail")
    val detail: String?=null
    
): Parcelable

/*
    Model: GetFollowListingResponse
*/
@Parcelize
data class GetFollowListingResponse(
    
    @SerializedName(items")
    val items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName(page")
    val page: ProductPage?=null
    
): Parcelable

/*
    Model: FollowPostResponse
*/
@Parcelize
data class FollowPostResponse(
    
    @SerializedName(message")
    val message: String?=null,
    
    @SerializedName(id")
    val id: String?=null
    
): Parcelable

/*
    Model: FollowerCountResponse
*/
@Parcelize
data class FollowerCountResponse(
    
    @SerializedName(count")
    val count: Int?=null
    
): Parcelable

/*
    Model: FollowIdsData
*/
@Parcelize
data class FollowIdsData(
    
    @SerializedName(brands")
    val brands: ArrayList<Int>?=null,
    
    @SerializedName(collections")
    val collections: ArrayList<Int>?=null,
    
    @SerializedName(products")
    val products: ArrayList<Int>?=null
    
): Parcelable

/*
    Model: FollowIdsResponse
*/
@Parcelize
data class FollowIdsResponse(
    
    @SerializedName(data")
    val data: FollowIdsData?=null
    
): Parcelable

/*
    Model: LatLong
*/
@Parcelize
data class LatLong(
    
    @SerializedName(type")
    val type: String?=null,
    
    @SerializedName(coordinates")
    val coordinates: ArrayList<Double>?=null
    
): Parcelable

/*
    Model: Store1
*/
@Parcelize
data class Store1(
    
    @SerializedName(store_code")
    val storeCode: String?=null,
    
    @SerializedName(store_email")
    val storeEmail: String?=null,
    
    @SerializedName(uid")
    val uid: Int?=null,
    
    @SerializedName(city")
    val city: String?=null,
    
    @SerializedName(lat_long")
    val latLong: LatLong?=null,
    
    @SerializedName(pincode")
    val pincode: Int?=null,
    
    @SerializedName(state")
    val state: String?=null,
    
    @SerializedName(name")
    val name: String?=null,
    
    @SerializedName(address")
    val address: String?=null,
    
    @SerializedName(country")
    val country: String?=null
    
): Parcelable

/*
    Model: StoreListingResponse
*/
@Parcelize
data class StoreListingResponse(
    
    @SerializedName(items")
    val items: ArrayList<Store1>?=null,
    
    @SerializedName(page")
    val page: ProductPage?=null
    
): Parcelable



/*
    Model: TicketHistoryPayload
*/
@Parcelize
data class TicketHistoryPayload(
    
    @SerializedName(value")
    val value: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(type")
    val type: String?=null
    
): Parcelable

/*
    Model: CustomFormSubmissionPayload
*/
@Parcelize
data class CustomFormSubmissionPayload(
    
    @SerializedName(response")
    val response: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: GetTokenForVideoRoomResponse
*/
@Parcelize
data class GetTokenForVideoRoomResponse(
    
    @SerializedName(access_token")
    val accessToken: String?=null
    
): Parcelable

/*
    Model: GetParticipantsInsideVideoRoomResponse
*/
@Parcelize
data class GetParticipantsInsideVideoRoomResponse(
    
    @SerializedName(participants")
    val participants: @RawValue ArrayList<Any>?=null
    
): Parcelable

/*
    Model: SubmitCustomFormResponse
*/
@Parcelize
data class SubmitCustomFormResponse(
    
    @SerializedName(ticket")
    val ticket: Ticket?=null
    
): Parcelable

/*
    Model: Context
*/
@Parcelize
data class Context(
    
    @SerializedName(application_id")
    val applicationId: String?=null,
    
    @SerializedName(company_id")
    val companyId: String?=null
    
): Parcelable

/*
    Model: CreatedOn
*/
@Parcelize
data class CreatedOn(
    
    @SerializedName(user_agent")
    val userAgent: String?=null
    
): Parcelable

/*
    Model: Asset
*/
@Parcelize
data class Asset(
    
    @SerializedName(display")
    val display: String?=null,
    
    @SerializedName(value")
    val value: String?=null,
    
    @SerializedName(type")
    val type: String?=null
    
): Parcelable

/*
    Model: Content
*/
@Parcelize
data class Content(
    
    @SerializedName(title")
    val title: String?=null,
    
    @SerializedName(description")
    val description: String?=null,
    
    @SerializedName(attachments")
    val attachments: ArrayList<Asset>?=null
    
): Parcelable

/*
    Model: APIError
*/
@Parcelize
data class APIError(
    
    @SerializedName(code")
    val code: Double?=null,
    
    @SerializedName(error")
    val error: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(message")
    val message: String?=null
    
): Parcelable

/*
    Model: AddTicketPayload
*/
@Parcelize
data class AddTicketPayload(
    
    @SerializedName(status")
    val status: String?=null,
    
    @SerializedName(priority")
    val priority: String?=null,
    
    @SerializedName(category")
    val category: String?=null,
    
    @SerializedName(content")
    val content: Content?=null
    
): Parcelable

/*
    Model: Priority
*/
@Parcelize
data class Priority(
    
    @SerializedName(key")
    val key: String?=null,
    
    @SerializedName(display")
    val display: String?=null,
    
    @SerializedName(color")
    val color: String?=null
    
): Parcelable

/*
    Model: Status
*/
@Parcelize
data class Status(
    
    @SerializedName(key")
    val key: String?=null,
    
    @SerializedName(display")
    val display: String?=null,
    
    @SerializedName(color")
    val color: String?=null
    
): Parcelable

/*
    Model: Category
*/
@Parcelize
data class Category(
    
    @SerializedName(key")
    val key: String?=null,
    
    @SerializedName(display")
    val display: String?=null
    
): Parcelable

/*
    Model: SubmitButton
*/
@Parcelize
data class SubmitButton(
    
    @SerializedName(title")
    val title: String?=null,
    
    @SerializedName(title_color")
    val titleColor: String?=null,
    
    @SerializedName(background_color")
    val backgroundColor: String?=null
    
): Parcelable

/*
    Model: PollForAssignment
*/
@Parcelize
data class PollForAssignment(
    
    @SerializedName(duration")
    val duration: Double?=null,
    
    @SerializedName(message")
    val message: String?=null,
    
    @SerializedName(success_message")
    val successMessage: String?=null,
    
    @SerializedName(failure_message")
    val failureMessage: String?=null
    
): Parcelable

/*
    Model: CustomForm
*/
@Parcelize
data class CustomForm(
    
    @SerializedName(application_id")
    val applicationId: String?=null,
    
    @SerializedName(slug")
    val slug: String?=null,
    
    @SerializedName(header_image")
    val headerImage: String?=null,
    
    @SerializedName(title")
    val title: String?=null,
    
    @SerializedName(description")
    val description: String?=null,
    
    @SerializedName(login_required")
    val loginRequired: Boolean?=null,
    
    @SerializedName(should_notify")
    val shouldNotify: Boolean?=null,
    
    @SerializedName(success_message")
    val successMessage: String?=null,
    
    @SerializedName(submit_button")
    val submitButton: SubmitButton?=null,
    
    @SerializedName(inputs")
    val inputs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName(created_on")
    val createdOn: CreatedOn?=null,
    
    @SerializedName(created_by")
    val createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(poll_for_assignment")
    val pollForAssignment: PollForAssignment?=null,
    
    @SerializedName(_id")
    val id: String?=null,
    
    @SerializedName(updatedAt")
    val updatedAt: String?=null,
    
    @SerializedName(createdAt")
    val createdAt: String?=null
    
): Parcelable

/*
    Model: TicketHistory
*/
@Parcelize
data class TicketHistory(
    
    @SerializedName(type")
    val type: String?=null,
    
    @SerializedName(value")
    val value: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(ticket_id")
    val ticketId: String?=null,
    
    @SerializedName(created_on")
    val createdOn: CreatedOn?=null,
    
    @SerializedName(created_by")
    val createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(_id")
    val id: String?=null,
    
    @SerializedName(updatedAt")
    val updatedAt: String?=null,
    
    @SerializedName(createdAt")
    val createdAt: String?=null
    
): Parcelable

/*
    Model: Ticket
*/
@Parcelize
data class Ticket(
    
    @SerializedName(context")
    val context: Context?=null,
    
    @SerializedName(created_on")
    val createdOn: CreatedOn?=null,
    
    @SerializedName(response_id")
    val responseId: String?=null,
    
    @SerializedName(content")
    val content: Content?=null,
    
    @SerializedName(ticket_id")
    val ticketId: String?=null,
    
    @SerializedName(category")
    val category: Category?=null,
    
    @SerializedName(source")
    val source: String?=null,
    
    @SerializedName(status")
    val status: Status?=null,
    
    @SerializedName(priority")
    val priority: Priority?=null,
    
    @SerializedName(created_by")
    val createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(assigned_to")
    val assignedTo: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(tags")
    val tags: ArrayList<String>?=null,
    
    @SerializedName(_custom_json")
    val customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(_id")
    val id: String?=null,
    
    @SerializedName(updatedAt")
    val updatedAt: String?=null,
    
    @SerializedName(createdAt")
    val createdAt: String?=null
    
): Parcelable



/*
    Model: QRCodeResp
*/
@Parcelize
data class QRCodeResp(
    
    @SerializedName(link")
    val link: String?=null,
    
    @SerializedName(svg")
    val svg: String?=null
    
): Parcelable

/*
    Model: RedirectDevice
*/
@Parcelize
data class RedirectDevice(
    
    @SerializedName(link")
    val link: String?=null,
    
    @SerializedName(type")
    val type: String?=null
    
): Parcelable

/*
    Model: Redirects
*/
@Parcelize
data class Redirects(
    
    @SerializedName(ios")
    val ios: RedirectDevice?=null,
    
    @SerializedName(android")
    val android: RedirectDevice?=null,
    
    @SerializedName(web")
    val web: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(force_web")
    val forceWeb: Boolean?=null
    
): Parcelable

/*
    Model: ShortLinkReq
*/
@Parcelize
data class ShortLinkReq(
    
    @SerializedName(title")
    val title: String?=null,
    
    @SerializedName(url")
    val url: String?=null,
    
    @SerializedName(hash")
    val hash: String?=null,
    
    @SerializedName(active")
    val active: String?=null,
    
    @SerializedName(type")
    val type: String?=null,
    
    @SerializedName(expire_at")
    val expireAt: String?=null,
    
    @SerializedName(enable_tracking")
    val enableTracking: Boolean?=null,
    
    @SerializedName(redirects")
    val redirects: Redirects?=null
    
): Parcelable

/*
    Model: ShortLinkRes
*/
@Parcelize
data class ShortLinkRes(
    
    @SerializedName(title")
    val title: String?=null,
    
    @SerializedName(url")
    val url: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName(created_by")
    val createdBy: String?=null,
    
    @SerializedName(personalized")
    val personalized: String?=null,
    
    @SerializedName(app_redirect")
    val appRedirect: String?=null,
    
    @SerializedName(fallback")
    val fallback: String?=null,
    
    @SerializedName(active")
    val active: Boolean?=null,
    
    @SerializedName(_id")
    val id: String?=null,
    
    @SerializedName(enable_tracking")
    val enableTracking: Boolean?=null,
    
    @SerializedName(expire_at")
    val expireAt: Boolean?=null,
    
    @SerializedName(application")
    val application: String?=null,
    
    @SerializedName(user_id")
    val userId: Boolean?=null,
    
    @SerializedName(created_at")
    val createdAt: Boolean?=null,
    
    @SerializedName(updated_at")
    val updatedAt: Boolean?=null,
    
    @SerializedName(redirects")
    val redirects: Redirects?=null
    
): Parcelable

