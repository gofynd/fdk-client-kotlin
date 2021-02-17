package com.sdk.application

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue



/*
    Model: Media
*/
@Parcelize
data class Media(
    
    val type: String?=null,
    
    val url: String?=null
    
): Parcelable

/*
    Model: ProductListingActionPage
*/
@Parcelize
data class ProductListingActionPage(
    
    val query: @RawValue HashMap<String,Any>?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: ProductListingAction
*/
@Parcelize
data class ProductListingAction(
    
    val type: String?=null,
    
    val page: ProductListingActionPage?=null
    
): Parcelable

/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    val name: String?=null,
    
    val action: ProductListingAction?=null,
    
    val uid: Int?=null,
    
    val logo: Media?=null
    
): Parcelable

/*
    Model: ProductDetailAttribute
*/
@Parcelize
data class ProductDetailAttribute(
    
    val key: String?=null,
    
    val type: String?=null,
    
    val value: String?=null
    
): Parcelable

/*
    Model: ProductDetailGroupedAttribute
*/
@Parcelize
data class ProductDetailGroupedAttribute(
    
    val title: String?=null,
    
    val details: ArrayList<ProductDetailAttribute>?=null
    
): Parcelable

/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    val tryouts: ArrayList<String>?=null,
    
    val promoMeta: @RawValue HashMap<String,Any>?=null,
    
    val imageNature: String?=null,
    
    val medias: ArrayList<Media>?=null,
    
    val productOnlineDate: String?=null,
    
    val name: String?=null,
    
    val ratingCount: Int?=null,
    
    val brand: ProductBrand?=null,
    
    val groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    val attributes: @RawValue HashMap<String,Any>?=null,
    
    val teaserTag: @RawValue HashMap<String,Any>?=null,
    
    val hasVariant: Boolean?=null,
    
    val highlights: ArrayList<String>?=null,
    
    val similars: ArrayList<String>?=null,
    
    val slug: String?=null,
    
    val type: String?=null,
    
    val rating: Double?=null,
    
    val itemType: String?=null,
    
    val categories: ArrayList<ProductBrand>?=null,
    
    val uid: Int?=null,
    
    val color: String?=null
    
): Parcelable

/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    val error: String?=null
    
): Parcelable

/*
    Model: ProductSizeStores
*/
@Parcelize
data class ProductSizeStores(
    
    val count: Int?=null
    
): Parcelable

/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    val value: String?=null,
    
    val isAvailable: Boolean?=null,
    
    val display: String?=null,
    
    val quantity: Int?=null
    
): Parcelable

/*
    Model: Price
*/
@Parcelize
data class Price(
    
    val currencyCode: String?=null,
    
    val currencySymbol: String?=null,
    
    val min: Double?=null,
    
    val max: Double?=null
    
): Parcelable

/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    val marked: Price?=null,
    
    val effective: Price?=null
    
): Parcelable

/*
    Model: ProductSizes
*/
@Parcelize
data class ProductSizes(
    
    val stores: ProductSizeStores?=null,
    
    val promoMeta: @RawValue HashMap<String,Any>?=null,
    
    val sizeChart: @RawValue HashMap<String,Any>?=null,
    
    val sizes: ArrayList<ProductSize>?=null,
    
    val discount: String?=null,
    
    val sellable: Boolean?=null,
    
    val price: ProductListingPrice?=null
    
): Parcelable

/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    val strategy: String?=null,
    
    val level: String?=null
    
): Parcelable

/*
    Model: Store
*/
@Parcelize
data class Store(
    
    val name: String?=null,
    
    val count: Int?=null,
    
    val uid: Int?=null
    
): Parcelable

/*
    Model: Seller
*/
@Parcelize
data class Seller(
    
    val name: String?=null,
    
    val count: Int?=null,
    
    val uid: Int?=null
    
): Parcelable

/*
    Model: ProductStockPrice
*/
@Parcelize
data class ProductStockPrice(
    
    val marked: Double?=null,
    
    val effective: Double?=null,
    
    val currency: String?=null
    
): Parcelable

/*
    Model: ProductSizePriceResponse
*/
@Parcelize
data class ProductSizePriceResponse(
    
    val articleAssignment: ArticleAssignment?=null,
    
    val store: Store?=null,
    
    val set: @RawValue HashMap<String,Any>?=null,
    
    val seller: Seller?=null,
    
    val quantity: Int?=null,
    
    val strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val articleId: String?=null,
    
    val itemType: String?=null,
    
    val promoMeta: @RawValue HashMap<String,Any>?=null,
    
    val specialBadge: String?=null,
    
    val pincode: Int?=null,
    
    val longLat: ArrayList<Double>?=null,
    
    val discount: String?=null,
    
    val sellerCount: Int?=null,
    
    val pricePerPrice: ProductStockPrice?=null,
    
    val price: ProductStockPrice?=null
    
): Parcelable

/*
    Model: ProductSizeSellerFilter
*/
@Parcelize
data class ProductSizeSellerFilter(
    
    val name: String?=null,
    
    val value: String?=null,
    
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: ProductPage
*/
@Parcelize
data class ProductPage(
    
    val totalItem: Int?=null,
    
    val nextId: String?=null,
    
    val current: Int?=null,
    
    val hasNext: Boolean?=null,
    
    val hasPrevious: Boolean?=null
    
): Parcelable

/*
    Model: ProductSizeSellersResponse
*/
@Parcelize
data class ProductSizeSellersResponse(
    
    val sortOn: ArrayList<ProductSizeSellerFilter>?=null,
    
    val items: ArrayList<ProductSizePriceResponse>?=null,
    
    val page: ProductPage?=null
    
): Parcelable

/*
    Model: AttributeDetail
*/
@Parcelize
data class AttributeDetail(
    
    val key: String?=null,
    
    val display: String?=null,
    
    val description: String?=null
    
): Parcelable

/*
    Model: ProductsComparisonResponse
*/
@Parcelize
data class ProductsComparisonResponse(
    
    val items: ArrayList<ProductDetail>?=null,
    
    val attributesMetadata: ArrayList<AttributeDetail>?=null
    
): Parcelable

/*
    Model: ProductCompareResponse
*/
@Parcelize
data class ProductCompareResponse(
    
    val items: ArrayList<ProductDetail>?=null,
    
    val attributesMetadata: ArrayList<AttributeDetail>?=null,
    
    val subtitle: String?=null,
    
    val title: String?=null
    
): Parcelable

/*
    Model: ProductFrequentlyComparedSimilarResponse
*/
@Parcelize
data class ProductFrequentlyComparedSimilarResponse(
    
    val similars: ArrayList<ProductCompareResponse>?=null
    
): Parcelable

/*
    Model: ProductSimilarItem
*/
@Parcelize
data class ProductSimilarItem(
    
    val items: ArrayList<ProductDetail>?=null,
    
    val subtitle: String?=null,
    
    val title: String?=null
    
): Parcelable

/*
    Model: SimilarProductByTypeResponse
*/
@Parcelize
data class SimilarProductByTypeResponse(
    
    val similars: ArrayList<ProductSimilarItem>?=null
    
): Parcelable

/*
    Model: ProductVariantItemResponse
*/
@Parcelize
data class ProductVariantItemResponse(
    
    val name: String?=null,
    
    val slug: String?=null,
    
    val value: String?=null,
    
    val isAvailable: Boolean?=null,
    
    val medias: ArrayList<Media>?=null,
    
    val action: ProductListingAction?=null,
    
    val uid: Int?=null,
    
    val colorName: String?=null,
    
    val color: String?=null
    
): Parcelable

/*
    Model: ProductVariantResponse
*/
@Parcelize
data class ProductVariantResponse(
    
    val items: ArrayList<ProductVariantItemResponse>?=null,
    
    val displayType: String?=null,
    
    val header: String?=null
    
): Parcelable

/*
    Model: ProductVariantsResponse
*/
@Parcelize
data class ProductVariantsResponse(
    
    val variants: ArrayList<ProductVariantResponse>?=null
    
): Parcelable

/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    val name: String?=null,
    
    val code: String?=null,
    
    val id: Int?=null,
    
    val city: String?=null
    
): Parcelable

/*
    Model: CompanyDetail
*/
@Parcelize
data class CompanyDetail(
    
    val name: String?=null,
    
    val id: Int?=null
    
): Parcelable

/*
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    val store: StoreDetail?=null,
    
    val identifier: @RawValue HashMap<String,Any>?=null,
    
    val seller: Seller?=null,
    
    val quantity: Int?=null,
    
    val itemId: Int?=null,
    
    val size: String?=null,
    
    val uid: String?=null,
    
    val company: CompanyDetail?=null,
    
    val price: ProductStockPrice?=null
    
): Parcelable

/*
    Model: ProductStockStatusResponse
*/
@Parcelize
data class ProductStockStatusResponse(
    
    val items: ArrayList<ProductStockStatusItem>?=null
    
): Parcelable

/*
    Model: ProductStockPolling
*/
@Parcelize
data class ProductStockPolling(
    
    val items: ArrayList<ProductStockStatusItem>?=null,
    
    val page: ProductPage?=null
    
): Parcelable

/*
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    val name: String?=null,
    
    val value: String?=null,
    
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    val name: String?=null,
    
    val display: String?=null
    
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    val count: Int?=null,
    
    val display: String?=null,
    
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    val key: ProductFiltersKey?=null,
    
    val values: ArrayList<ProductFiltersValue>?=null
    
): Parcelable

/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    val sortOn: ArrayList<ProductSortOn>?=null,
    
    val items: ArrayList<ProductDetail>?=null,
    
    val filter: ArrayList<ProductFilters>?=null,
    
    val page: ProductPage?=null
    
): Parcelable

/*
    Model: ImageUrls
*/
@Parcelize
data class ImageUrls(
    
    val landscape: Media?=null,
    
    val portrait: Media?=null
    
): Parcelable

/*
    Model: BrandItem
*/
@Parcelize
data class BrandItem(
    
    val name: String?=null,
    
    val departments: ArrayList<String>?=null,
    
    val slug: String?=null,
    
    val action: ProductListingAction?=null,
    
    val uid: Int?=null,
    
    val discount: String?=null,
    
    val banners: ImageUrls?=null,
    
    val logo: Media?=null
    
): Parcelable

/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    val items: ArrayList<BrandItem>?=null,
    
    val page: ProductPage?=null
    
): Parcelable

/*
    Model: BrandDetailResponse
*/
@Parcelize
data class BrandDetailResponse(
    
    val name: String?=null,
    
    val banners: ImageUrls?=null,
    
    val uid: Int?=null,
    
    val logo: Media?=null
    
): Parcelable

/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    val name: String?=null,
    
    val slug: String?=null,
    
    val childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val action: ProductListingAction?=null,
    
    val uid: Int?=null,
    
    val banners: ImageUrls?=null
    
): Parcelable

/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    val department: String?=null,
    
    val items: ArrayList<CategoryItems>?=null
    
): Parcelable

/*
    Model: DepartmentIdentifier
*/
@Parcelize
data class DepartmentIdentifier(
    
    val uid: Int?=null,
    
    val slug: String?=null
    
): Parcelable

/*
    Model: CategoryListingResponse
*/
@Parcelize
data class CategoryListingResponse(
    
    val data: ArrayList<DepartmentCategoryTree>?=null,
    
    val departments: ArrayList<DepartmentIdentifier>?=null
    
): Parcelable

/*
    Model: CategoryMetaResponse
*/
@Parcelize
data class CategoryMetaResponse(
    
    val name: String?=null,
    
    val banners: ImageUrls?=null,
    
    val uid: Int?=null,
    
    val logo: Media?=null
    
): Parcelable

/*
    Model: Page
*/
@Parcelize
data class Page(
    
    val pageSize: Int?=null,
    
    val page: Int?=null
    
): Parcelable

/*
    Model: HomeListingResponse
*/
@Parcelize
data class HomeListingResponse(
    
    val items: ArrayList<ProductDetail>?=null,
    
    val message: String?=null,
    
    val page: Page?=null
    
): Parcelable

/*
    Model: Department
*/
@Parcelize
data class Department(
    
    val name: String?=null,
    
    val slug: String?=null,
    
    val uid: Int?=null,
    
    val priorityOrder: Int?=null,
    
    val logo: Media?=null
    
): Parcelable

/*
    Model: DepartmentResponse
*/
@Parcelize
data class DepartmentResponse(
    
    val items: ArrayList<Department>?=null
    
): Parcelable

/*
    Model: AutocompleteItem
*/
@Parcelize
data class AutocompleteItem(
    
    val logo: Media?=null,
    
    val action: @RawValue HashMap<String,Any>?=null,
    
    val display: String?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: AutoCompleteResponse
*/
@Parcelize
data class AutoCompleteResponse(
    
    val items: ArrayList<AutocompleteItem>?=null
    
): Parcelable

/*
    Model: SeoDetail
*/
@Parcelize
data class SeoDetail(
    
    val description: String?=null,
    
    val title: String?=null
    
): Parcelable

/*
    Model: CollectionImage
*/
@Parcelize
data class CollectionImage(
    
    val aspectRatio: String?=null,
    
    val url: String?=null
    
): Parcelable

/*
    Model: CollectionBanner
*/
@Parcelize
data class CollectionBanner(
    
    val portrait: CollectionImage?=null,
    
    val landscape: CollectionImage?=null
    
): Parcelable

/*
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    val duration: Int?=null,
    
    val start: String?=null,
    
    val cron: String?=null,
    
    val end: String?=null
    
): Parcelable

/*
    Model: CollectionBadge
*/
@Parcelize
data class CollectionBadge(
    
    val text: String?=null,
    
    val color: String?=null
    
): Parcelable

/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    val userId: String?=null,
    
    val uid: String?=null,
    
    val email: String?=null,
    
    val username: String?=null
    
): Parcelable

/*
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    val seo: SeoDetail?=null,
    
    val query: @RawValue HashMap<String,Any>?=null,
    
    val description: String?=null,
    
    val visibleFacetsKeys: ArrayList<String>?=null,
    
    val isActive: Boolean?=null,
    
    val meta: @RawValue HashMap<String,Any>?=null,
    
    val localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    val tags: ArrayList<String>?=null,
    
    val allowFacets: Boolean?=null,
    
    val banners: CollectionBanner?=null,
    
    val name: String?=null,
    
    val sortOn: String?=null,
    
    val schedule: Schedule?=null,
    
    val slug: String?=null,
    
    val badge: CollectionBadge?=null,
    
    val customJson: @RawValue HashMap<String,Any>?=null,
    
    val type: String?=null,
    
    val published: Boolean?=null,
    
    val appId: String?=null,
    
    val createdBy: UserInfo?=null,
    
    val modifiedBy: UserInfo?=null,
    
    val allowSort: Boolean?=null,
    
    val logo: CollectionImage?=null
    
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    val name: String?=null,
    
    val seo: SeoDetail?=null,
    
    val schedule: @RawValue HashMap<String,Any>?=null,
    
    val query: @RawValue HashMap<String,Any>?=null,
    
    val description: String?=null,
    
    val slug: String?=null,
    
    val appId: String?=null,
    
    val badge: @RawValue HashMap<String,Any>?=null,
    
    val visibleFacetsKeys: ArrayList<String>?=null,
    
    val isActive: Boolean?=null,
    
    val meta: @RawValue HashMap<String,Any>?=null,
    
    val allowFacets: Boolean?=null,
    
    val type: String?=null,
    
    val allowSort: Boolean?=null,
    
    val banners: ImageUrls?=null,
    
    val tag: ArrayList<String>?=null,
    
    val cron: @RawValue HashMap<String,Any>?=null,
    
    val logo: Media?=null
    
): Parcelable

/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    val seo: SeoDetail?=null,
    
    val query: @RawValue HashMap<String,Any>?=null,
    
    val description: String?=null,
    
    val visibleFacetsKeys: ArrayList<String>?=null,
    
    val isActive: Boolean?=null,
    
    val meta: @RawValue HashMap<String,Any>?=null,
    
    val allowFacets: Boolean?=null,
    
    val banners: ImageUrls?=null,
    
    val tag: ArrayList<String>?=null,
    
    val name: String?=null,
    
    val action: ProductListingAction?=null,
    
    val schedule: @RawValue HashMap<String,Any>?=null,
    
    val slug: String?=null,
    
    val badge: @RawValue HashMap<String,Any>?=null,
    
    val type: String?=null,
    
    val cron: @RawValue HashMap<String,Any>?=null,
    
    val appId: String?=null,
    
    val allowSort: Boolean?=null,
    
    val uid: String?=null,
    
    val logo: Media?=null
    
): Parcelable

/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    val name: String?=null,
    
    val display: String?=null,
    
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    val name: String?=null,
    
    val display: String?=null,
    
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    val tags: ArrayList<CollectionListingFilterTag>?=null,
    
    val type: ArrayList<CollectionListingFilterType>?=null
    
): Parcelable

/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    val items: ArrayList<GetCollectionDetailNest>?=null,
    
    val filters: CollectionListingFilter?=null,
    
    val page: ProductPage?=null
    
): Parcelable

/*
    Model: CollectionItem
*/
@Parcelize
data class CollectionItem(
    
    val itemId: Int?=null,
    
    val action: String?=null
    
): Parcelable

/*
    Model: CollectionItemsRequest
*/
@Parcelize
data class CollectionItemsRequest(
    
    val query: @RawValue HashMap<String,Any>?=null,
    
    val pageNo: Int?=null,
    
    val type: String?=null,
    
    val pageSize: Int?=null,
    
    val items: ArrayList<CollectionItem>?=null
    
): Parcelable

/*
    Model: CollectionItemsResponse
*/
@Parcelize
data class CollectionItemsResponse(
    
    val detail: String?=null
    
): Parcelable

/*
    Model: GetCollectionListingItemsResponse
*/
@Parcelize
data class GetCollectionListingItemsResponse(
    
    val sortOn: ArrayList<ProductSortOn>?=null,
    
    val items: ArrayList<ProductDetail>?=null,
    
    val filters: ArrayList<ProductFilters>?=null,
    
    val page: ProductPage?=null
    
): Parcelable

/*
    Model: CollectionDetailViewDeleteResponse
*/
@Parcelize
data class CollectionDetailViewDeleteResponse(
    
    val detail: String?=null
    
): Parcelable

/*
    Model: CollectionsUpdateDetailResponse
*/
@Parcelize
data class CollectionsUpdateDetailResponse(
    
    val data: ArrayList<CollectionDetailResponse>?=null
    
): Parcelable

/*
    Model: GetFollowListingResponse
*/
@Parcelize
data class GetFollowListingResponse(
    
    val items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val page: ProductPage?=null
    
): Parcelable

/*
    Model: FollowPostResponse
*/
@Parcelize
data class FollowPostResponse(
    
    val id: String?=null,
    
    val message: String?=null
    
): Parcelable

/*
    Model: FollowerCountResponse
*/
@Parcelize
data class FollowerCountResponse(
    
    val count: Int?=null
    
): Parcelable

/*
    Model: FollowIdsData
*/
@Parcelize
data class FollowIdsData(
    
    val brands: ArrayList<Int>?=null,
    
    val products: ArrayList<Int>?=null,
    
    val collections: ArrayList<Int>?=null
    
): Parcelable

/*
    Model: FollowIdsResponse
*/
@Parcelize
data class FollowIdsResponse(
    
    val data: FollowIdsData?=null
    
): Parcelable



/*
    Model: GetCartResponse
*/
@Parcelize
data class GetCartResponse(
    
    val codAvailable: Boolean?=null,
    
    val restrictCheckout: Boolean?=null,
    
    val gstin: String?=null,
    
    val breakupValues: @RawValue HashMap<String,Any>?=null,
    
    val couponDetails: String?=null,
    
    val breakupValuesAnalytics: String?=null,
    
    val creditDetails: String?=null,
    
    val isValid: Boolean?=null,
    
    val items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val cartId: Int?=null,
    
    val checkoutMode: String?=null,
    
    val couponText: String?=null,
    
    val message: String?=null,
    
    val lastModified: String?=null,
    
    val deliveryChargeInfo: String?=null
    
): Parcelable

/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    val storeId: Int?=null,
    
    val sellerId: Int?=null,
    
    val itemSize: Int?=null,
    
    val articleAssignment: @RawValue HashMap<String,Any>?=null,
    
    val pos: Boolean?=null,
    
    val articleId: String?=null,
    
    val itemId: Int?=null,
    
    val display: String?=null,
    
    val quantity: Int?=null
    
): Parcelable

/*
    Model: AddCartRequest
*/
@Parcelize
data class AddCartRequest(
    
    val items: ArrayList<AddProductCart>?=null
    
): Parcelable

/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    val total: Int?=null,
    
    val deliveryCharge: Int?=null,
    
    val coupon: Int?=null,
    
    val codCharge: Int?=null,
    
    val fyndCash: Int?=null,
    
    val subtotal: Int?=null,
    
    val youSaved: Int?=null
    
): Parcelable

/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    val type: String?=null,
    
    val value: Int?=null,
    
    val code: String?=null,
    
    val message: String?=null,
    
    val uid: Int?=null,
    
    val isApplied: Boolean?=null
    
): Parcelable

/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    val currencyCode: String?=null,
    
    val key: String?=null,
    
    val value: Int?=null,
    
    val currencySymbol: String?=null,
    
    val display: String?=null
    
): Parcelable

/*
    Model: BaseLoyaltyPoints
*/
@Parcelize
data class BaseLoyaltyPoints(
    
    val description: String?=null,
    
    val total: Double?=null,
    
    val applicable: Int?=null,
    
    val isApplied: Boolean?=null
    
): Parcelable

/*
    Model: BaseCartBreakup
*/
@Parcelize
data class BaseCartBreakup(
    
    val raw: RawBreakup?=null,
    
    val coupon: CouponBreakup?=null,
    
    val display: DisplayBreakup?=null,
    
    val loyaltyPoints: BaseLoyaltyPoints?=null
    
): Parcelable

/*
    Model: PaymentFlow
*/
@Parcelize
data class PaymentFlow(
    
    val paymentFlow: String?=null,
    
    val data: @RawValue HashMap<String,Any>?=null,
    
    val apiLink: String?=null
    
): Parcelable

/*
    Model: PaymentFlows
*/
@Parcelize
data class PaymentFlows(
    
    val juspay: PaymentFlow?=null,
    
    val razorpay: PaymentFlow?=null,
    
    val simpl: PaymentFlow?=null,
    
    val fynd: PaymentFlow?=null,
    
    val upiRazorpay: PaymentFlow?=null
    
): Parcelable

/*
    Model: PaymentOption
*/
@Parcelize
data class PaymentOption(
    
    val displayPriority: Int?=null,
    
    val name: String?=null,
    
    val paymentModeId: Int?=null,
    
    val list: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val displayName: String?=null
    
): Parcelable

/*
    Model: PaymentOptions
*/
@Parcelize
data class PaymentOptions(
    
    val paymentFlows: PaymentFlows?=null,
    
    val default: @RawValue HashMap<String,Any>?=null,
    
    val paymentOption: ArrayList<PaymentOption>?=null
    
): Parcelable

/*
    Model: CartCurrency
*/
@Parcelize
data class CartCurrency(
    
    val code: String?=null,
    
    val symbol: String?=null
    
): Parcelable

/*
    Model: ActionQuery
*/
@Parcelize
data class ActionQuery(
    
    val productSlug: ArrayList<String>?=null
    
): Parcelable

/*
    Model: Action
*/
@Parcelize
data class Action(
    
    val url: String?=null,
    
    val type: String?=null,
    
    val query: ActionQuery?=null
    
): Parcelable

/*
    Model: CategoryInfo
*/
@Parcelize
data class CategoryInfo(
    
    val uid: Int?=null,
    
    val name: Int?=null
    
): Parcelable

/*
    Model: BaseInfo
*/
@Parcelize
data class BaseInfo(
    
    val uid: Int?=null,
    
    val name: String?=null
    
): Parcelable

/*
    Model: Image
*/
@Parcelize
data class Image(
    
    val secureUrl: String?=null,
    
    val url: String?=null,
    
    val aspectRatio: String?=null
    
): Parcelable

/*
    Model: Product
*/
@Parcelize
data class Product(
    
    val type: String?=null,
    
    val name: String?=null,
    
    val action: Action?=null,
    
    val categories: ArrayList<CategoryInfo>?=null,
    
    val brand: BaseInfo?=null,
    
    val images: ArrayList<Image>?=null,
    
    val uid: Int?=null,
    
    val slug: String?=null
    
): Parcelable

/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    val currencyCode: String?=null,
    
    val addOn: Double?=null,
    
    val currencySymbol: String?=null,
    
    val selling: Double?=null,
    
    val marked: Double?=null,
    
    val effective: Double?=null
    
): Parcelable

/*
    Model: ProductPriceInfo
*/
@Parcelize
data class ProductPriceInfo(
    
    val base: ProductPrice?=null,
    
    val converted: ProductPrice?=null
    
): Parcelable

/*
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    val deliverable: Boolean?=null,
    
    val outOfStock: Boolean?=null,
    
    val otherStoreQuantity: Int?=null,
    
    val isValid: Boolean?=null,
    
    val sizes: ArrayList<String>?=null
    
): Parcelable

/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    val key: String?=null,
    
    val product: Product?=null,
    
    val article: String?=null,
    
    val bulkOffer: String?=null,
    
    val price: ProductPriceInfo?=null,
    
    val discount: String?=null,
    
    val couponMessage: String?=null,
    
    val message: String?=null,
    
    val quantity: Int?=null,
    
    val availability: ProductAvailability?=null
    
): Parcelable

/*
    Model: CartResponse
*/
@Parcelize
data class CartResponse(
    
    val restrictCheckout: Boolean?=null,
    
    val gstin: String?=null,
    
    val breakupValues: BaseCartBreakup?=null,
    
    val paymentOptions: PaymentOptions?=null,
    
    val isValid: Boolean?=null,
    
    val currency: CartCurrency?=null,
    
    val items: ArrayList<CartProductInfo>?=null,
    
    val cartId: Int?=null,
    
    val checkoutMode: String?=null,
    
    val couponText: String?=null,
    
    val message: String?=null,
    
    val uid: String?=null,
    
    val lastModified: String?=null,
    
    val deliveryChargeInfo: String?=null
    
): Parcelable

/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    val itemSize: Int?=null,
    
    val articleId: String?=null,
    
    val itemIndex: Int?=null,
    
    val itemId: Int?=null,
    
    val quantity: Int?=null
    
): Parcelable

/*
    Model: UpdateCartRequest
*/
@Parcelize
data class UpdateCartRequest(
    
    val operation: String?=null,
    
    val items: ArrayList<UpdateProductCart>?=null
    
): Parcelable

/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    val maxDiscountValue: Double?=null,
    
    val subTitle: String?=null,
    
    val isApplicable: Boolean?=null,
    
    val title: String?=null,
    
    val couponCode: String?=null,
    
    val expiresOn: String?=null,
    
    val couponValue: Double?=null,
    
    val minimumCartValue: Double?=null,
    
    val message: String?=null,
    
    val uid: Int?=null,
    
    val isApplied: Boolean?=null
    
): Parcelable

/*
    Model: PageCoupon
*/
@Parcelize
data class PageCoupon(
    
    val total: Int?=null,
    
    val totalItemCount: Int?=null,
    
    val hasPrevious: Boolean?=null,
    
    val hasNext: Boolean?=null,
    
    val current: Int?=null
    
): Parcelable

/*
    Model: GetCouponResponse
*/
@Parcelize
data class GetCouponResponse(
    
    val availableCouponList: ArrayList<Coupon>?=null,
    
    val page: PageCoupon?=null
    
): Parcelable

/*
    Model: RawCartCoupon
*/
@Parcelize
data class RawCartCoupon(
    
    val vog: Double?=null,
    
    val convenienceFee: Double?=null,
    
    val mrpTotal: Double?=null,
    
    val total: Double?=null,
    
    val deliveryCharge: Double?=null,
    
    val coupon: Double?=null,
    
    val codCharge: Double?=null,
    
    val fyndCash: Double?=null,
    
    val subtotal: Double?=null,
    
    val discount: Double?=null,
    
    val youSaved: Double?=null,
    
    val gstCharges: Double?=null
    
): Parcelable

/*
    Model: CartCoupon
*/
@Parcelize
data class CartCoupon(
    
    val type: String?=null,
    
    val value: Int?=null,
    
    val code: String?=null,
    
    val message: String?=null,
    
    val uid: Int?=null,
    
    val isApplied: Boolean?=null
    
): Parcelable

/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    val description: String?=null,
    
    val total: Int?=null,
    
    val applicable: String?=null,
    
    val isApplied: Boolean?=null
    
): Parcelable

/*
    Model: SaveCoupon
*/
@Parcelize
data class SaveCoupon(
    
    val display: ArrayList<String>?=null,
    
    val raw: RawCartCoupon?=null,
    
    val coupon: CartCoupon?=null,
    
    val loyaltyPoints: LoyaltyPoints?=null
    
): Parcelable

/*
    Model: SaveCouponResponse
*/
@Parcelize
data class SaveCouponResponse(
    
    val restrictCheckout: Boolean?=null,
    
    val gstin: String?=null,
    
    val breakupValues: SaveCoupon?=null,
    
    val isValid: Boolean?=null,
    
    val items: ArrayList<String>?=null,
    
    val cartId: Int?=null,
    
    val checkoutMode: String?=null,
    
    val couponText: String?=null,
    
    val message: String?=null,
    
    val uid: Int?=null,
    
    val lastModified: String?=null,
    
    val deliveryChargeInfo: String?=null
    
): Parcelable

/*
    Model: OfferSeller
*/
@Parcelize
data class OfferSeller(
    
    val uid: Int?=null,
    
    val name: String?=null
    
): Parcelable

/*
    Model: OfferPrice
*/
@Parcelize
data class OfferPrice(
    
    val currencyCode: String?=null,
    
    val bulkEffective: Double?=null,
    
    val currencySymbol: String?=null,
    
    val marked: Int?=null,
    
    val effective: Int?=null
    
): Parcelable

/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    val best: Boolean?=null,
    
    val type: String?=null,
    
    val total: Double?=null,
    
    val price: OfferPrice?=null,
    
    val margin: Int?=null,
    
    val autoApplied: Boolean?=null,
    
    val quantity: Int?=null
    
): Parcelable

/*
    Model: BulkPriceOffer
*/
@Parcelize
data class BulkPriceOffer(
    
    val seller: OfferSeller?=null,
    
    val offers: ArrayList<OfferItem>?=null
    
): Parcelable

/*
    Model: BulkPriceResponse
*/
@Parcelize
data class BulkPriceResponse(
    
    val data: ArrayList<BulkPriceOffer>?=null
    
): Parcelable

/*
    Model: Address
*/
@Parcelize
data class Address(
    
    val isActive: Boolean?=null,
    
    val areaCodeSlug: String?=null,
    
    val isDefaultAddress: Boolean?=null,
    
    val countryCode: String?=null,
    
    val email: String?=null,
    
    val state: String?=null,
    
    val name: String?=null,
    
    val addressId: Int?=null,
    
    val checkoutMode: String?=null,
    
    val address: String?=null,
    
    val userId: String?=null,
    
    val phone: Int?=null,
    
    val geoLocation: @RawValue HashMap<String,Any>?=null,
    
    val area: String?=null,
    
    val city: String?=null,
    
    val addressType: String?=null,
    
    val country: String?=null,
    
    val landmark: String?=null,
    
    val areaCode: String?=null,
    
    val meta: @RawValue HashMap<String,Any>?=null,
    
    val uid: Int?=null
    
): Parcelable

/*
    Model: GetAddressResponse
*/
@Parcelize
data class GetAddressResponse(
    
    val address: ArrayList<Address>?=null
    
): Parcelable

/*
    Model: SaveAddressRequest
*/
@Parcelize
data class SaveAddressRequest(
    
    val name: String?=null,
    
    val phone: Int?=null,
    
    val area: String?=null,
    
    val landmark: String?=null,
    
    val isDefaultAddress: Boolean?=null,
    
    val address: String?=null,
    
    val email: String?=null,
    
    val pincode: Int?=null,
    
    val addressType: String?=null
    
): Parcelable

/*
    Model: SaveAddressResponse
*/
@Parcelize
data class SaveAddressResponse(
    
    val addressId: Int?=null,
    
    val isDefaultAddress: Boolean?=null,
    
    val success: String?=null
    
): Parcelable

/*
    Model: UpdateAddressRequest
*/
@Parcelize
data class UpdateAddressRequest(
    
    val name: String?=null,
    
    val phone: Int?=null,
    
    val area: String?=null,
    
    val landmark: String?=null,
    
    val isDefaultAddress: Boolean?=null,
    
    val address: String?=null,
    
    val email: String?=null,
    
    val pincode: Int?=null,
    
    val addressType: String?=null
    
): Parcelable

/*
    Model: UpdateAddressResponse
*/
@Parcelize
data class UpdateAddressResponse(
    
    val addressId: Int?=null,
    
    val isDefaultAddress: Boolean?=null,
    
    val success: Boolean?=null,
    
    val isUpdated: Boolean?=null
    
): Parcelable

/*
    Model: DeleteAddressResponse
*/
@Parcelize
data class DeleteAddressResponse(
    
    val addressId: Int?=null,
    
    val isDeleted: Boolean?=null
    
): Parcelable

/*
    Model: SelectCartAddressRequest
*/
@Parcelize
data class SelectCartAddressRequest(
    
    val billingAddressId: Int?=null,
    
    val addressId: String?=null,
    
    val uid: String?=null
    
): Parcelable

/*
    Model: UpdateCartPaymentRequest
*/
@Parcelize
data class UpdateCartPaymentRequest(
    
    val paymentIdentifier: String?=null,
    
    val addressId: Int?=null,
    
    val merchantCode: String?=null,
    
    val paymentMode: String?=null,
    
    val aggregatorName: String?=null,
    
    val uid: Int?=null
    
): Parcelable

/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    val fulfillmentId: Int?=null,
    
    val dpId: Int?=null,
    
    val promise: String?=null,
    
    val items: ArrayList<CartProductInfo>?=null,
    
    val boxType: String?=null,
    
    val shipmentType: String?=null,
    
    val shipments: Int?=null,
    
    val fulfillmentType: String?=null,
    
    val dpOptions: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    val restrictCheckout: Boolean?=null,
    
    val gstin: String?=null,
    
    val breakupValues: BaseCartBreakup?=null,
    
    val paymentOptions: PaymentOptions?=null,
    
    val isValid: Boolean?=null,
    
    val currency: CartCurrency?=null,
    
    val cartId: Int?=null,
    
    val shipments: ArrayList<ShipmentResponse>?=null,
    
    val checkoutMode: String?=null,
    
    val couponText: String?=null,
    
    val message: String?=null,
    
    val uid: String?=null,
    
    val lastModified: String?=null,
    
    val deliveryChargeInfo: String?=null
    
): Parcelable

/*
    Model: CartCheckoutRequest
*/
@Parcelize
data class CartCheckoutRequest(
    
    val billingAddress: @RawValue HashMap<String,Any>?=null,
    
    val paymentIdentifier: String?=null,
    
    val aggregator: String?=null,
    
    val addressId: Int?=null,
    
    val merchantCode: String?=null,
    
    val paymentMode: String?=null,
    
    val extraMeta: @RawValue HashMap<String,Any>?=null,
    
    val billingAddressId: Int?=null,
    
    val callbackUrl: String?=null,
    
    val fyndstoreEmpId: String?=null,
    
    val staff: @RawValue HashMap<String,Any>?=null,
    
    val meta: @RawValue HashMap<String,Any>?=null,
    
    val orderingStore: Int?=null,
    
    val paymentParams: @RawValue HashMap<String,Any>?=null,
    
    val paymentAutoConfirm: Boolean?=null
    
): Parcelable

/*
    Model: DeliverySlot
*/
@Parcelize
data class DeliverySlot(
    
    val deliverySlotTiming: String?=null,
    
    val default: Boolean?=null,
    
    val deliverySlotId: Int?=null
    
): Parcelable

/*
    Model: DeliverySlotDate
*/
@Parcelize
data class DeliverySlotDate(
    
    val deliverySlot: ArrayList<DeliverySlot>?=null,
    
    val date: String?=null
    
): Parcelable

/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    val paymentOptions: PaymentOptions?=null,
    
    val deliveryCharges: Int?=null,
    
    val items: ArrayList<CartProductInfo>?=null,
    
    val message: String?=null,
    
    val lastModified: String?=null,
    
    val deliveryChargeInfo: String?=null,
    
    val breakupValues: BaseCartBreakup?=null,
    
    val currency: CartCurrency?=null,
    
    val success: Boolean?=null,
    
    val cartId: Int?=null,
    
    val checkoutMode: String?=null,
    
    val codMessage: String?=null,
    
    val storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val codAvailable: Boolean?=null,
    
    val deliverySlots: ArrayList<DeliverySlotDate>?=null,
    
    val isValid: Boolean?=null,
    
    val codCharges: Int?=null,
    
    val couponText: String?=null,
    
    val deliveryChargeOrderValue: Int?=null,
    
    val userType: String?=null,
    
    val errorMessage: String?=null,
    
    val restrictCheckout: Boolean?=null,
    
    val gstin: String?=null,
    
    val storeCode: String?=null,
    
    val uid: String?=null,
    
    val orderId: String?=null
    
): Parcelable

/*
    Model: OrderData
*/
@Parcelize
data class OrderData(
    
    val orderId: String?=null
    
): Parcelable

/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    val cart: CheckCart?=null,
    
    val appInterceptUrl: String?=null,
    
    val success: Boolean?=null,
    
    val data: OrderData?=null,
    
    val message: String?=null,
    
    val callbackUrl: String?=null,
    
    val orderId: String?=null
    
): Parcelable

/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    val orderingStore: Int?=null,
    
    val selectedStaff: String?=null
    
): Parcelable

/*
    Model: SharedCartDetails
*/
@Parcelize
data class SharedCartDetails(
    
    val token: String?=null,
    
    val createdOn: String?=null,
    
    val source: @RawValue HashMap<String,Any>?=null,
    
    val user: @RawValue HashMap<String,Any>?=null,
    
    val meta: Meta?=null
    
): Parcelable

/*
    Model: SharedCartResponse
*/
@Parcelize
data class SharedCartResponse(
    
    val restrictCheckout: Boolean?=null,
    
    val gstin: String?=null,
    
    val breakupValues: BaseCartBreakup?=null,
    
    val paymentOptions: PaymentOptions?=null,
    
    val isValid: Boolean?=null,
    
    val currency: CartCurrency?=null,
    
    val items: ArrayList<CartProductInfo>?=null,
    
    val sharedCartDetails: SharedCartDetails?=null,
    
    val cartId: Int?=null,
    
    val checkoutMode: String?=null,
    
    val couponText: String?=null,
    
    val message: String?=null,
    
    val uid: String?=null,
    
    val lastModified: String?=null,
    
    val deliveryChargeInfo: String?=null
    
): Parcelable



/*
    Model: TicketHistoryPayload
*/
@Parcelize
data class TicketHistoryPayload(
    
    val value: @RawValue HashMap<String,Any>?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: CustomFormSubmissionPayload
*/
@Parcelize
data class CustomFormSubmissionPayload(
    
    val response: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: GetTokenForVideoRoomResponse
*/
@Parcelize
data class GetTokenForVideoRoomResponse(
    
    val accessToken: String?=null
    
): Parcelable

/*
    Model: GetParticipantsInsideVideoRoomResponse
*/
@Parcelize
data class GetParticipantsInsideVideoRoomResponse(
    
    val participants: @RawValue ArrayList<Any>?=null
    
): Parcelable

/*
    Model: SubmitCustomFormResponse
*/
@Parcelize
data class SubmitCustomFormResponse(
    
    val ticket: Ticket?=null
    
): Parcelable

/*
    Model: Context
*/
@Parcelize
data class Context(
    
    val applicationId: String?=null,
    
    val companyId: String?=null
    
): Parcelable

/*
    Model: CreatedOn
*/
@Parcelize
data class CreatedOn(
    
    val userAgent: String?=null
    
): Parcelable

/*
    Model: Asset
*/
@Parcelize
data class Asset(
    
    val display: String?=null,
    
    val value: String?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: Content
*/
@Parcelize
data class Content(
    
    val title: String?=null,
    
    val description: String?=null,
    
    val attachments: ArrayList<Asset>?=null
    
): Parcelable

/*
    Model: APIError
*/
@Parcelize
data class APIError(
    
    val code: Double?=null,
    
    val error: @RawValue HashMap<String,Any>?=null,
    
    val message: String?=null
    
): Parcelable

/*
    Model: AddTicketPayload
*/
@Parcelize
data class AddTicketPayload(
    
    val status: String?=null,
    
    val priority: String?=null,
    
    val category: String?=null,
    
    val content: Content?=null
    
): Parcelable

/*
    Model: Priority
*/
@Parcelize
data class Priority(
    
    val key: String?=null,
    
    val display: String?=null,
    
    val color: String?=null
    
): Parcelable

/*
    Model: Status
*/
@Parcelize
data class Status(
    
    val key: String?=null,
    
    val display: String?=null,
    
    val color: String?=null
    
): Parcelable

/*
    Model: Category
*/
@Parcelize
data class Category(
    
    val key: String?=null,
    
    val display: String?=null
    
): Parcelable

/*
    Model: SubmitButton
*/
@Parcelize
data class SubmitButton(
    
    val title: String?=null,
    
    val titleColor: String?=null,
    
    val backgroundColor: String?=null
    
): Parcelable

/*
    Model: PollForAssignment
*/
@Parcelize
data class PollForAssignment(
    
    val duration: Double?=null,
    
    val message: String?=null,
    
    val successMessage: String?=null,
    
    val failureMessage: String?=null
    
): Parcelable

/*
    Model: CustomForm
*/
@Parcelize
data class CustomForm(
    
    val applicationId: String?=null,
    
    val slug: String?=null,
    
    val headerImage: String?=null,
    
    val title: String?=null,
    
    val description: String?=null,
    
    val loginRequired: Boolean?=null,
    
    val shouldNotify: Boolean?=null,
    
    val successMessage: String?=null,
    
    val submitButton: SubmitButton?=null,
    
    val inputs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val createdOn: CreatedOn?=null,
    
    val createdBy: @RawValue HashMap<String,Any>?=null,
    
    val pollForAssignment: PollForAssignment?=null,
    
    val id: String?=null,
    
    val updatedAt: String?=null,
    
    val createdAt: String?=null
    
): Parcelable

/*
    Model: TicketHistory
*/
@Parcelize
data class TicketHistory(
    
    val type: String?=null,
    
    val value: @RawValue HashMap<String,Any>?=null,
    
    val ticketId: String?=null,
    
    val createdOn: CreatedOn?=null,
    
    val createdBy: @RawValue HashMap<String,Any>?=null,
    
    val id: String?=null,
    
    val updatedAt: String?=null,
    
    val createdAt: String?=null
    
): Parcelable

/*
    Model: Ticket
*/
@Parcelize
data class Ticket(
    
    val context: Context?=null,
    
    val createdOn: CreatedOn?=null,
    
    val responseId: String?=null,
    
    val content: Content?=null,
    
    val ticketId: String?=null,
    
    val category: Category?=null,
    
    val source: String?=null,
    
    val status: Status?=null,
    
    val priority: Priority?=null,
    
    val createdBy: @RawValue HashMap<String,Any>?=null,
    
    val assignedTo: @RawValue HashMap<String,Any>?=null,
    
    val tags: ArrayList<String>?=null,
    
    val customJson: @RawValue HashMap<String,Any>?=null,
    
    val id: String?=null,
    
    val updatedAt: String?=null,
    
    val createdAt: String?=null
    
): Parcelable



/*
    Model: ThemesSchema
*/
@Parcelize
data class ThemesSchema(
    
    val application: String?=null,
    
    val applied: Boolean?=null,
    
    val customized: Boolean?=null,
    
    val published: Boolean?=null,
    
    val archived: Boolean?=null,
    
    val createdAt: String?=null,
    
    val updatedAt: String?=null,
    
    val version: String?=null,
    
    val parentThemeVersion: String?=null,
    
    val parentTheme: String?=null,
    
    val information: @RawValue HashMap<String,Any>?=null,
    
    val tags: ArrayList<String>?=null,
    
    val src: @RawValue HashMap<String,Any>?=null,
    
    val assets: @RawValue HashMap<String,Any>?=null,
    
    val availablePages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val pages: @RawValue HashMap<String,Any>?=null,
    
    val availableSections: ArrayList<availableSectionSchema>?=null,
    
    val sections: ArrayList<sectionSchema>?=null,
    
    val constants: @RawValue HashMap<String,Any>?=null,
    
    val styles: @RawValue HashMap<String,Any>?=null,
    
    val config: @RawValue HashMap<String,Any>?=null,
    
    val settings: @RawValue HashMap<String,Any>?=null,
    
    val font: @RawValue HashMap<String,Any>?=null,
    
    val id: String?=null,
    
    val v: Int?=null,
    
    val colors: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: pagesSchema
*/
@Parcelize
data class pagesSchema(
    
    val text: String?=null,
    
    val path: String?=null,
    
    val type: String?=null,
    
    val value: String?=null,
    
    val sections: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: availableSectionSchema
*/
@Parcelize
data class availableSectionSchema(
    
    val blocks: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val name: String?=null,
    
    val label: String?=null,
    
    val props: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: sectionSchema
*/
@Parcelize
data class sectionSchema(
    
    val pageKey: String?=null,
    
    val pageSections: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable



/*
    Model: PlatformSchema
*/
@Parcelize
data class PlatformSchema(
    
    val display: String?=null,
    
    val lookAndFeel: @RawValue HashMap<String,Any>?=null,
    
    val updatedAt: String?=null,
    
    val active: Boolean?=null,
    
    val forgotPassword: Boolean?=null,
    
    val login: @RawValue HashMap<String,Any>?=null,
    
    val skipCaptcha: Boolean?=null,
    
    val name: String?=null,
    
    val meta: @RawValue HashMap<String,Any>?=null,
    
    val id: String?=null,
    
    val social: @RawValue HashMap<String,Any>?=null,
    
    val requiredFields: @RawValue HashMap<String,Any>?=null,
    
    val registerRequiredFields: @RawValue HashMap<String,Any>?=null,
    
    val skipLogin: Boolean?=null,
    
    val flashCard: @RawValue HashMap<String,Any>?=null,
    
    val subtext: String?=null,
    
    val socialTokens: @RawValue HashMap<String,Any>?=null,
    
    val createdAt: String?=null,
    
    val register: Boolean?=null
    
): Parcelable

/*
    Model: UserSchema
*/
@Parcelize
data class UserSchema(
    
    val firstName: String?=null,
    
    val lastName: String?=null,
    
    val phoneNumbers: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val emails: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val gender: String?=null,
    
    val active: Boolean?=null,
    
    val profilePicUrl: String?=null,
    
    val username: String?=null,
    
    val accountType: String?=null,
    
    val uid: String?=null,
    
    val debug: @RawValue HashMap<String,Any>?=null,
    
    val hasOldPasswordHash: Boolean?=null,
    
    val id: String?=null,
    
    val createdAt: String?=null,
    
    val updatedAt: String?=null
    
): Parcelable



/*
    Model: ApplicationLegal
*/
@Parcelize
data class ApplicationLegal(
    
    val application: String?=null,
    
    val tnc: String?=null,
    
    val policy: String?=null,
    
    val faq: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val id: String?=null,
    
    val updatedAt: String?=null,
    
    val createdAt: String?=null,
    
    val v: Double?=null
    
): Parcelable

/*
    Model: Seo
*/
@Parcelize
data class Seo(
    
    val app: String?=null,
    
    val robotsTxt: String?=null,
    
    val sitemapEnabled: Boolean?=null,
    
    val customMetaTags: @RawValue ArrayList<Any>?=null,
    
    val appDetails: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: StorefrontAnnouncement
*/
@Parcelize
data class StorefrontAnnouncement(
    
    val announcements: @RawValue HashMap<String,Any>?=null,
    
    val refreshRate: Int?=null,
    
    val refreshPages: ArrayList<String>?=null
    
): Parcelable

/*
    Model: AdminAnnouncementSchema
*/
@Parcelize
data class AdminAnnouncementSchema(
    
    val id: String?=null,
    
    val platform: ArrayList<String>?=null,
    
    val title: String?=null,
    
    val announcement: String?=null,
    
    val pages: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val editorMeta: @RawValue HashMap<String,Any>?=null,
    
    val author: @RawValue HashMap<String,Any>?=null,
    
    val createdAt: String?=null,
    
    val app: String?=null,
    
    val modifiedAt: String?=null,
    
    val schedule: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ScheduleSchema
*/
@Parcelize
data class ScheduleSchema(
    
    val schedule: @RawValue HashMap<String,Any>?=null,
    
    val published: Boolean?=null
    
): Parcelable

/*
    Model: Navigation
*/
@Parcelize
data class Navigation(
    
    val name: String?=null,
    
    val slug: String?=null,
    
    val orientation: String?=null,
    
    val createdBy: @RawValue HashMap<String,Any>?=null,
    
    val dateMeta: @RawValue HashMap<String,Any>?=null,
    
    val id: String?=null,
    
    val position: String?=null,
    
    val application: String?=null,
    
    val platform: String?=null,
    
    val navigation: NavigationRef?=null
    
): Parcelable

/*
    Model: NavigationRef
*/
@Parcelize
data class NavigationRef(
    
    val acl: @RawValue ArrayList<Any>?=null,
    
    val localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    val image: String?=null,
    
    val type: String?=null,
    
    val action: @RawValue HashMap<String,Any>?=null,
    
    val active: Boolean?=null,
    
    val display: String?=null,
    
    val sortOrder: Int?=null,
    
    val subNavigation: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: LandingPage
*/
@Parcelize
data class LandingPage(
    
    val slug: String?=null,
    
    val action: @RawValue HashMap<String,Any>?=null,
    
    val platform: @RawValue ArrayList<Any>?=null,
    
    val createdBy: @RawValue HashMap<String,Any>?=null,
    
    val dateMeta: @RawValue HashMap<String,Any>?=null,
    
    val id: String?=null,
    
    val application: String?=null
    
): Parcelable

/*
    Model: Slideshow
*/
@Parcelize
data class Slideshow(
    
    val id: String?=null,
    
    val slug: String?=null,
    
    val dateMeta: @RawValue HashMap<String,Any>?=null,
    
    val application: String?=null,
    
    val name: String?=null,
    
    val platform: String?=null,
    
    val configuration: @RawValue HashMap<String,Any>?=null,
    
    val media: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val active: Boolean?=null
    
): Parcelable

/*
    Model: Faq
*/
@Parcelize
data class Faq(
    
    val id: String?=null,
    
    val question: String?=null,
    
    val answer: String?=null,
    
    val slug: String?=null,
    
    val application: String?=null,
    
    val v: Int?=null
    
): Parcelable

/*
    Model: CustomPage
*/
@Parcelize
data class CustomPage(
    
    val data: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: CustomBlog
*/
@Parcelize
data class CustomBlog(
    
    val data: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: Support
*/
@Parcelize
data class Support(
    
    val created: Boolean?=null,
    
    val id: String?=null,
    
    val configType: String?=null,
    
    val application: String?=null,
    
    val createdAt: String?=null,
    
    val updatedAt: String?=null,
    
    val contact: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: TagsSchema
*/
@Parcelize
data class TagsSchema(
    
    val application: String?=null,
    
    val id: String?=null,
    
    val tags: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable



/*
    Model: CommunicationConsentReq
*/
@Parcelize
data class CommunicationConsentReq(
    
    val response: String?=null,
    
    val action: String?=null,
    
    val channel: String?=null
    
): Parcelable

/*
    Model: CommunicationConsentRes
*/
@Parcelize
data class CommunicationConsentRes(
    
    val appId: String?=null,
    
    val userId: String?=null,
    
    val channels: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: CommunicationConsent
*/
@Parcelize
data class CommunicationConsent(
    
    val appId: String?=null,
    
    val userId: String?=null,
    
    val channels: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: PushtokenReq
*/
@Parcelize
data class PushtokenReq(
    
    val action: String?=null,
    
    val bundleIdentifier: String?=null,
    
    val pushToken: String?=null,
    
    val uniqueDeviceId: String?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: PushtokenRes
*/
@Parcelize
data class PushtokenRes(
    
    val id: String?=null,
    
    val bundleIdentifier: String?=null,
    
    val pushToken: String?=null,
    
    val uniqueDeviceId: String?=null,
    
    val type: String?=null,
    
    val platform: String?=null,
    
    val applicationId: String?=null,
    
    val userId: String?=null,
    
    val createdAt: String?=null,
    
    val updatedAt: String?=null,
    
    val expiredAt: String?=null
    
): Parcelable



/*
    Model: QRCodeResp
*/
@Parcelize
data class QRCodeResp(
    
    val link: String?=null,
    
    val svg: String?=null
    
): Parcelable

/*
    Model: RedirectDevice
*/
@Parcelize
data class RedirectDevice(
    
    val link: String?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: Redirects
*/
@Parcelize
data class Redirects(
    
    val ios: RedirectDevice?=null,
    
    val android: RedirectDevice?=null,
    
    val web: @RawValue HashMap<String,Any>?=null,
    
    val forceWeb: Boolean?=null
    
): Parcelable

/*
    Model: ShortLinkReq
*/
@Parcelize
data class ShortLinkReq(
    
    val title: String?=null,
    
    val url: String?=null,
    
    val hash: String?=null,
    
    val active: String?=null,
    
    val type: String?=null,
    
    val expireAt: String?=null,
    
    val enableTracking: Boolean?=null,
    
    val redirects: Redirects?=null
    
): Parcelable

/*
    Model: ShortLinkRes
*/
@Parcelize
data class ShortLinkRes(
    
    val title: String?=null,
    
    val url: @RawValue HashMap<String,Any>?=null,
    
    val createdBy: String?=null,
    
    val personalized: String?=null,
    
    val appRedirect: String?=null,
    
    val fallback: String?=null,
    
    val active: Boolean?=null,
    
    val id: String?=null,
    
    val enableTracking: Boolean?=null,
    
    val expireAt: Boolean?=null,
    
    val application: String?=null,
    
    val userId: Boolean?=null,
    
    val createdAt: Boolean?=null,
    
    val updatedAt: Boolean?=null,
    
    val redirects: Redirects?=null
    
): Parcelable



/*
    Model: failedResponse
*/
@Parcelize
data class failedResponse(
    
    val message: String?=null
    
): Parcelable

/*
    Model: cdn
*/
@Parcelize
data class cdn(
    
    val url: String?=null
    
): Parcelable

/*
    Model: upload
*/
@Parcelize
data class upload(
    
    val expiry: Int?=null,
    
    val url: String?=null
    
): Parcelable

/*
    Model: startResponse
*/
@Parcelize
data class startResponse(
    
    val fileName: String?=null,
    
    val filePath: String?=null,
    
    val contentType: String?=null,
    
    val method: String?=null,
    
    val namespace: String?=null,
    
    val operation: String?=null,
    
    val size: Int?=null,
    
    val upload: upload?=null,
    
    val cdn: cdn?=null
    
): Parcelable

/*
    Model: startRequest
*/
@Parcelize
data class startRequest(
    
    val fileName: String?=null,
    
    val contentType: String?=null,
    
    val size: Int?=null,
    
    val tags: ArrayList<String>?=null
    
): Parcelable

/*
    Model: completeResponse
*/
@Parcelize
data class completeResponse(
    
    val id: String?=null,
    
    val fileName: String?=null,
    
    val filePath: String?=null,
    
    val contentType: String?=null,
    
    val method: String?=null,
    
    val namespace: String?=null,
    
    val operation: String?=null,
    
    val size: Int?=null,
    
    val upload: upload?=null,
    
    val cdn: cdn?=null,
    
    val success: String?=null,
    
    val tags: ArrayList<String>?=null,
    
    val createdOn: String?=null,
    
    val modifiedOn: String?=null
    
): Parcelable



/*
    Model: ApplicationAboutResponse
*/
@Parcelize
data class ApplicationAboutResponse(
    
    val applicationInfo: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ApplicationDetailResponse
*/
@Parcelize
data class ApplicationDetailResponse(
    
    val name: String?=null,
    
    val description: String?=null,
    
    val logo: @RawValue HashMap<String,Any>?=null,
    
    val mobileLogo: @RawValue HashMap<String,Any>?=null,
    
    val favicon: @RawValue HashMap<String,Any>?=null,
    
    val banner: @RawValue HashMap<String,Any>?=null,
    
    val domain: Domain?=null,
    
    val domains: ArrayList<Domain>?=null,
    
    val companyId: Int?=null,
    
    val id: String?=null
    
): Parcelable

/*
    Model: AppVersionRequest
*/
@Parcelize
data class AppVersionRequest(
    
    val application: ApplicationVersionRequest?=null,
    
    val device: Device?=null,
    
    val locale: String?=null,
    
    val timezone: String?=null
    
): Parcelable

/*
    Model: ApplicationVersionRequest
*/
@Parcelize
data class ApplicationVersionRequest(
    
    val id: String?=null,
    
    val name: String?=null,
    
    val namespace: String?=null,
    
    val token: String?=null,
    
    val version: String?=null
    
): Parcelable

/*
    Model: Device
*/
@Parcelize
data class Device(
    
    val build: Int?=null,
    
    val model: String?=null,
    
    val os: OS?=null
    
): Parcelable

/*
    Model: OS
*/
@Parcelize
data class OS(
    
    val name: String?=null,
    
    val version: String?=null
    
): Parcelable

/*
    Model: AppFeatureResponse
*/
@Parcelize
data class AppFeatureResponse(
    
    val feature: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: Store
*/
@Parcelize
data class Store(
    
    val address: @RawValue HashMap<String,Any>?=null,
    
    val id: String?=null,
    
    val uid: Int?=null,
    
    val name: String?=null,
    
    val displayName: String?=null,
    
    val storeType: String?=null,
    
    val storeCode: String?=null,
    
    val pincode: Int?=null,
    
    val code: String?=null
    
): Parcelable

/*
    Model: OrderingStores
*/
@Parcelize
data class OrderingStores(
    
    val page: @RawValue HashMap<String,Any>?=null,
    
    val items: ArrayList<Store>?=null,
    
    val deployedStores: ArrayList<Int>?=null,
    
    val allStores: Boolean?=null,
    
    val enabled: Boolean?=null,
    
    val type: String?=null,
    
    val id: String?=null,
    
    val app: String?=null,
    
    val v: Int?=null
    
): Parcelable

/*
    Model: ApplicationInformation
*/
@Parcelize
data class ApplicationInformation(
    
    val address: @RawValue HashMap<String,Any>?=null,
    
    val support: @RawValue HashMap<String,Any>?=null,
    
    val socialLinks: @RawValue HashMap<String,Any>?=null,
    
    val links: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val copyrightText: String?=null,
    
    val id: String?=null,
    
    val businessHighlights: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val application: String?=null,
    
    val createdAt: String?=null,
    
    val updatedAt: String?=null,
    
    val v: Int?=null
    
): Parcelable

/*
    Model: LanguageResponse
*/
@Parcelize
data class LanguageResponse(
    
): Parcelable

/*
    Model: TokensResponse
*/
@Parcelize
data class TokensResponse(
    
    val tokens: @RawValue HashMap<String,Any>?=null,
    
    val id: String?=null,
    
    val application: String?=null,
    
    val createdAt: String?=null,
    
    val updatedAt: String?=null,
    
    val v: Int?=null
    
): Parcelable

/*
    Model: Currency
*/
@Parcelize
data class Currency(
    
    val id: String?=null,
    
    val isActive: Boolean?=null,
    
    val name: String?=null,
    
    val code: String?=null,
    
    val createdAt: String?=null,
    
    val updatedAt: String?=null,
    
    val decimalDigits: Int?=null,
    
    val symbol: String?=null
    
): Parcelable

/*
    Model: Domain
*/
@Parcelize
data class Domain(
    
    val verified: Boolean?=null,
    
    val isPrimary: Boolean?=null,
    
    val isDefault: Boolean?=null,
    
    val isShortlink: Boolean?=null,
    
    val id: String?=null,
    
    val name: String?=null
    
): Parcelable

/*
    Model: Application
*/
@Parcelize
data class Application(
    
    val website: @RawValue HashMap<String,Any>?=null,
    
    val cors: @RawValue HashMap<String,Any>?=null,
    
    val auth: @RawValue HashMap<String,Any>?=null,
    
    val description: String?=null,
    
    val channelType: String?=null,
    
    val cacheTtl: Int?=null,
    
    val internal: Boolean?=null,
    
    val isActive: Boolean?=null,
    
    val id: String?=null,
    
    val name: String?=null,
    
    val owner: String?=null,
    
    val companyId: Int?=null,
    
    val token: String?=null,
    
    val redirections: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val meta: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val createdAt: String?=null,
    
    val updatedAt: String?=null,
    
    val v: Int?=null,
    
    val banner: @RawValue HashMap<String,Any>?=null,
    
    val logo: @RawValue HashMap<String,Any>?=null,
    
    val favicon: @RawValue HashMap<String,Any>?=null,
    
    val domains: ArrayList<Domain>?=null,
    
    val appType: String?=null,
    
    val mobileLogo: @RawValue HashMap<String,Any>?=null,
    
    val domain: Domain?=null,
    
    val id: String?=null
    
): Parcelable

/*
    Model: NotFound
*/
@Parcelize
data class NotFound(
    
    val message: String?=null
    
): Parcelable

/*
    Model: App
*/
@Parcelize
data class App(
    
    val companyId: String?=null,
    
    val channelType: String?=null,
    
    val auth: @RawValue HashMap<String,Any>?=null,
    
    val name: String?=null,
    
    val desc: String?=null
    
): Parcelable

/*
    Model: AppInventory
*/
@Parcelize
data class AppInventory(
    
    val brand: @RawValue HashMap<String,Any>?=null,
    
    val store: @RawValue HashMap<String,Any>?=null,
    
    val image: ArrayList<String>?=null,
    
    val franchiseEnabled: Boolean?=null,
    
    val outOfStock: Boolean?=null,
    
    val payment: @RawValue HashMap<String,Any>?=null,
    
    val articleAssignment: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: AppDomain
*/
@Parcelize
data class AppDomain(
    
    val name: String?=null
    
): Parcelable

/*
    Model: CreateApplicationRequest
*/
@Parcelize
data class CreateApplicationRequest(
    
    val app: App?=null,
    
    val configuration: AppInventory?=null,
    
    val domain: AppDomain?=null
    
): Parcelable

/*
    Model: OtherSellerApplication
*/
@Parcelize
data class OtherSellerApplication(
    
    val name: String?=null,
    
    val description: String?=null,
    
    val id: String?=null,
    
    val domain: String?=null,
    
    val company: @RawValue HashMap<String,Any>?=null,
    
    val optType: String?=null
    
): Parcelable



/*
    Model: AggregatorConfigDetail
*/
@Parcelize
data class AggregatorConfigDetail(
    
    val key: String?=null,
    
    val configType: String?=null,
    
    val verifyApi: String?=null,
    
    val api: String?=null,
    
    val userId: String?=null,
    
    val sdk: Boolean?=null,
    
    val merchantId: String?=null,
    
    val pin: String?=null,
    
    val secret: String?=null,
    
    val merchantKey: String?=null
    
): Parcelable

/*
    Model: AggregatorsConfigDetailResponse
*/
@Parcelize
data class AggregatorsConfigDetailResponse(
    
    val rupifi: AggregatorConfigDetail?=null,
    
    val payumoney: AggregatorConfigDetail?=null,
    
    val ccavenue: AggregatorConfigDetail?=null,
    
    val juspay: AggregatorConfigDetail?=null,
    
    val razorpay: AggregatorConfigDetail?=null,
    
    val env: String?=null,
    
    val mswipe: AggregatorConfigDetail?=null,
    
    val stripe: AggregatorConfigDetail?=null,
    
    val simpl: AggregatorConfigDetail?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: ErrorCodeAndDescription
*/
@Parcelize
data class ErrorCodeAndDescription(
    
    val code: String?=null,
    
    val description: String?=null
    
): Parcelable

/*
    Model: HttpErrorCodeAndResponse
*/
@Parcelize
data class HttpErrorCodeAndResponse(
    
    val error: ErrorCodeAndDescription?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: AttachCardRequest
*/
@Parcelize
data class AttachCardRequest(
    
    val cardId: String?=null,
    
    val refresh: Boolean?=null
    
): Parcelable

/*
    Model: AttachCardsResponse
*/
@Parcelize
data class AttachCardsResponse(
    
    val data: @RawValue HashMap<String,Any>?=null,
    
    val message: String?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: CardPaymentGateway
*/
@Parcelize
data class CardPaymentGateway(
    
    val api: String?=null,
    
    val customerId: String?=null,
    
    val aggregator: String?=null
    
): Parcelable

/*
    Model: ActiveCardPaymentGatewayResponse
*/
@Parcelize
data class ActiveCardPaymentGatewayResponse(
    
    val cards: CardPaymentGateway?=null,
    
    val message: String?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: ListCardsResponse
*/
@Parcelize
data class ListCardsResponse(
    
    val data: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val message: String?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: DeletehCardRequest
*/
@Parcelize
data class DeletehCardRequest(
    
    val cardId: String?=null
    
): Parcelable

/*
    Model: DeleteCardsResponse
*/
@Parcelize
data class DeleteCardsResponse(
    
    val message: String?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: ValidateCustomerRequest
*/
@Parcelize
data class ValidateCustomerRequest(
    
    val merchantParams: @RawValue HashMap<String,Any>?=null,
    
    val payload: String?=null,
    
    val aggregator: String?=null,
    
    val transactionAmountInPaise: Int?=null,
    
    val phoneNumber: String?=null
    
): Parcelable

/*
    Model: ValidateCustomerResponse
*/
@Parcelize
data class ValidateCustomerResponse(
    
    val data: @RawValue HashMap<String,Any>?=null,
    
    val message: String?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: ChargeCustomerRequest
*/
@Parcelize
data class ChargeCustomerRequest(
    
    val amount: Int?=null,
    
    val aggregator: String?=null,
    
    val transactionToken: String?=null,
    
    val verified: Boolean?=null,
    
    val orderId: String?=null
    
): Parcelable

/*
    Model: ChargeCustomerResponse
*/
@Parcelize
data class ChargeCustomerResponse(
    
    val cartId: String?=null,
    
    val status: String?=null,
    
    val aggregator: String?=null,
    
    val orderId: String?=null,
    
    val message: String?=null,
    
    val deliveryAddressId: String?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: PaymentInitializationRequest
*/
@Parcelize
data class PaymentInitializationRequest(
    
    val razorpayPaymentId: String?=null,
    
    val pollingUrl: String?=null,
    
    val merchantOrderId: String?=null,
    
    val virtualId: String?=null,
    
    val aggregator: String?=null,
    
    val method: String?=null,
    
    val customerId: String?=null,
    
    val timeout: Int?=null,
    
    val aggregatorOrderId: String?=null
    
): Parcelable

/*
    Model: PaymentInitializationResponse
*/
@Parcelize
data class PaymentInitializationResponse(
    
    val status: String?=null,
    
    val email: String?=null,
    
    val contact: String?=null,
    
    val amount: Int?=null,
    
    val aggregator: String?=null,
    
    val vpa: String?=null,
    
    val currency: String?=null,
    
    val method: String?=null,
    
    val customerId: String?=null,
    
    val orderId: String?=null,
    
    val merchantOrderId: String?=null,
    
    val message: String?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: PaymentStatusUpdateRequest
*/
@Parcelize
data class PaymentStatusUpdateRequest(
    
    val status: String?=null,
    
    val email: String?=null,
    
    val contact: String?=null,
    
    val amount: Int?=null,
    
    val aggregator: String?=null,
    
    val vpa: String?=null,
    
    val currency: String?=null,
    
    val method: String?=null,
    
    val customerId: String?=null,
    
    val orderId: String?=null,
    
    val merchantOrderId: String?=null
    
): Parcelable

/*
    Model: PaymentStatusUpdateResponse
*/
@Parcelize
data class PaymentStatusUpdateResponse(
    
    val aggregatorName: String?=null,
    
    val retry: Boolean?=null,
    
    val status: String?=null
    
): Parcelable

/*
    Model: OrderBeneficiaryDetails
*/
@Parcelize
data class OrderBeneficiaryDetails(
    
    val subtitle: String?=null,
    
    val title: String?=null,
    
    val delightsUserName: String?=null,
    
    val modifiedOn: String?=null,
    
    val accountHolder: String?=null,
    
    val mobile: Boolean?=null,
    
    val beneficiaryId: String?=null,
    
    val ifscCode: String?=null,
    
    val id: Int?=null,
    
    val isActive: Boolean?=null,
    
    val email: String?=null,
    
    val bankName: String?=null,
    
    val transferMode: String?=null,
    
    val accountNo: String?=null,
    
    val createdOn: String?=null,
    
    val address: String?=null,
    
    val branchName: Boolean?=null,
    
    val comment: Boolean?=null,
    
    val displayName: String?=null
    
): Parcelable

/*
    Model: OrderBeneficiaryResponse
*/
@Parcelize
data class OrderBeneficiaryResponse(
    
    val beneficiaries: ArrayList<OrderBeneficiaryDetails>?=null
    
): Parcelable

/*
    Model: NotFoundResourceError
*/
@Parcelize
data class NotFoundResourceError(
    
    val code: String?=null,
    
    val description: String?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: IfscCodeResponse
*/
@Parcelize
data class IfscCodeResponse(
    
    val success: Boolean?=null,
    
    val branchName: String?=null,
    
    val bankName: String?=null
    
): Parcelable

/*
    Model: ErrorCodeDescription
*/
@Parcelize
data class ErrorCodeDescription(
    
    val code: String?=null,
    
    val description: String?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: AddBeneficiaryViaOtpVerificationRequest
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationRequest(
    
    val requestId: String?=null,
    
    val otp: String?=null,
    
    val hashKey: String?=null
    
): Parcelable

/*
    Model: AddBeneficiaryViaOtpVerificationResponse
*/
@Parcelize
data class AddBeneficiaryViaOtpVerificationResponse(
    
    val requestId: String?=null,
    
    val otp: String?=null,
    
    val hashKey: String?=null
    
): Parcelable

/*
    Model: WrongOtpError
*/
@Parcelize
data class WrongOtpError(
    
    val description: String?=null,
    
    val success: String?=null
    
): Parcelable

/*
    Model: BankDetails
*/
@Parcelize
data class BankDetails(
    
    val ifscCode: String?=null,
    
    val accountHolder: String?=null,
    
    val address: String?=null,
    
    val comment: String?=null,
    
    val email: String?=null,
    
    val branchName: String?=null,
    
    val mobile: String?=null,
    
    val bankName: String?=null,
    
    val accountNo: String?=null
    
): Parcelable

/*
    Model: AddBeneficiaryDetailsRequest
*/
@Parcelize
data class AddBeneficiaryDetailsRequest(
    
    val details: BankDetails?=null,
    
    val delights: Boolean?=null,
    
    val shipmentId: String?=null,
    
    val orderId: String?=null,
    
    val transferMode: String?=null
    
): Parcelable

/*
    Model: WalletOtpRequest
*/
@Parcelize
data class WalletOtpRequest(
    
    val countryCode: String?=null,
    
    val mobile: Boolean?=null
    
): Parcelable

/*
    Model: WalletOtpResponse
*/
@Parcelize
data class WalletOtpResponse(
    
    val requestId: String?=null,
    
    val isVerifiedFlag: String?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: SetDefaultBeneficiaryRequest
*/
@Parcelize
data class SetDefaultBeneficiaryRequest(
    
    val beneficiaryId: String?=null,
    
    val orderId: String?=null
    
): Parcelable

/*
    Model: SetDefaultBeneficiaryResponse
*/
@Parcelize
data class SetDefaultBeneficiaryResponse(
    
    val isBeneficiarySet: Boolean?=null,
    
    val success: Boolean?=null
    
): Parcelable



/*
    Model: ApefaceApiError
*/
@Parcelize
data class ApefaceApiError(
    
    val message: String?=null
    
): Parcelable

/*
    Model: OrderById
*/
@Parcelize
data class OrderById(
    
    val order: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: OrderList
*/
@Parcelize
data class OrderList(
    
    val orders: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val page: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ShipmentById
*/
@Parcelize
data class ShipmentById(
    
    val shipment: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ShipmentReasons
*/
@Parcelize
data class ShipmentReasons(
    
    val reasons: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable

/*
    Model: ShipmentStatusUpdateBody
*/
@Parcelize
data class ShipmentStatusUpdateBody(
    
    val shipments: @RawValue HashMap<String,Any>?=null,
    
    val forceTransition: Boolean?=null,
    
    val task: Boolean?=null
    
): Parcelable

/*
    Model: ShipmentStatusUpdate
*/
@Parcelize
data class ShipmentStatusUpdate(
    
    val shipments: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: ShipmentTrack
*/
@Parcelize
data class ShipmentTrack(
    
    val results: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable



/*
    Model: CatalogueOrderRequest
*/
@Parcelize
data class CatalogueOrderRequest(
    
    val articles: ArrayList<types.Article>?=null
    
): Parcelable

/*
    Model: CatalogueOrderResponse
*/
@Parcelize
data class CatalogueOrderResponse(
    
    val articles: ArrayList<types.Article>?=null
    
): Parcelable

/*
    Model: Discount
*/
@Parcelize
data class Discount(
    
    val absolute: Double?=null,
    
    val currency: String?=null,
    
    val displayAbsolute: String?=null,
    
    val displayPercent: String?=null,
    
    val percent: Double?=null
    
): Parcelable

/*
    Model: Error
*/
@Parcelize
data class Error(
    
    val code: Int?=null,
    
    val exception: String?=null,
    
    val info: String?=null,
    
    val message: String?=null
    
): Parcelable

/*
    Model: Offer
*/
@Parcelize
data class Offer(
    
    val schedule: String?=null,
    
    val active: Boolean?=null,
    
    val applicationId: String?=null,
    
    val bannerImage: types.Asset?=null,
    
    val createdAt: String?=null,
    
    val infoAction: types.Action?=null,
    
    val name: String?=null,
    
    val rule: @RawValue HashMap<String,Any>?=null,
    
    val share: ShareMessages?=null,
    
    val subText: String?=null,
    
    val text: String?=null,
    
    val type: String?=null,
    
    val updatedAt: String?=null,
    
    val updatedBy: String?=null,
    
    val url: String?=null
    
): Parcelable

/*
    Model: OrderDiscountRuleBucket
*/
@Parcelize
data class OrderDiscountRuleBucket(
    
    val high: Double?=null,
    
    val low: Double?=null,
    
    val max: Double?=null,
    
    val value: Double?=null,
    
    val valueType: String?=null
    
): Parcelable

/*
    Model: PointsHistory
*/
@Parcelize
data class PointsHistory(
    
    val id: String?=null,
    
    val applicationId: String?=null,
    
    val claimed: Boolean?=null,
    
    val createdAt: String?=null,
    
    val expiresOn: String?=null,
    
    val meta: String?=null,
    
    val points: Double?=null,
    
    val remainingPoints: Double?=null,
    
    val text1: String?=null,
    
    val text2: String?=null,
    
    val text3: String?=null,
    
    val txnName: String?=null,
    
    val updatedAt: String?=null,
    
    val userId: String?=null
    
): Parcelable

/*
    Model: PointsHistoryRequest
*/
@Parcelize
data class PointsHistoryRequest(
    
    val pageId: String?=null,
    
    val pageLimit: Int?=null,
    
    val pageSize: Int?=null
    
): Parcelable

/*
    Model: PointsHistoryResponse
*/
@Parcelize
data class PointsHistoryResponse(
    
    val history: ArrayList<PointsHistory>?=null,
    
    val page: types.PageX?=null,
    
    val points: Double?=null
    
): Parcelable

/*
    Model: ShareMessages
*/
@Parcelize
data class ShareMessages(
    
    val default: String?=null,
    
    val email: String?=null,
    
    val facebook: String?=null,
    
    val fallback: String?=null,
    
    val message: String?=null,
    
    val messenger: String?=null,
    
    val sms: String?=null,
    
    val twitter: String?=null,
    
    val whatsapp: String?=null
    
): Parcelable

/*
    Model: points.OrderDiscountReq
*/
@Parcelize
data class points.OrderDiscountReq(
    
    val currency: String?=null,
    
    val orderAmount: Double?=null
    
): Parcelable

/*
    Model: points.OrderDiscountRes
*/
@Parcelize
data class points.OrderDiscountRes(
    
    val appliedRuleBucket: OrderDiscountRuleBucket?=null,
    
    val baseDiscount: Discount?=null,
    
    val discount: Discount?=null,
    
    val orderAmount: Double?=null,
    
    val points: Double?=null
    
): Parcelable

/*
    Model: points.PointsRes
*/
@Parcelize
data class points.PointsRes(
    
    val points: Double?=null
    
): Parcelable

/*
    Model: points.RedeemReferralCodeReq
*/
@Parcelize
data class points.RedeemReferralCodeReq(
    
    val deviceId: String?=null,
    
    val referralCode: String?=null
    
): Parcelable

/*
    Model: points.RedeemReferralCodeRes
*/
@Parcelize
data class points.RedeemReferralCodeRes(
    
    val message: String?=null,
    
    val points: Double?=null,
    
    val redeemed: Boolean?=null,
    
    val referrerId: String?=null,
    
    val referrerInfo: String?=null
    
): Parcelable

/*
    Model: points.ReferralInfoRes
*/
@Parcelize
data class points.ReferralInfoRes(
    
    val referral: Offer?=null,
    
    val referrerInfo: String?=null,
    
    val share: ShareMessages?=null,
    
    val user: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: rewarduser.Referral
*/
@Parcelize
data class rewarduser.Referral(
    
    val code: String?=null
    
): Parcelable

/*
    Model: rewarduser.User
*/
@Parcelize
data class rewarduser.User(
    
    val id: String?=null,
    
    val active: Boolean?=null,
    
    val createdAt: String?=null,
    
    val referral: rewarduser.Referral?=null,
    
    val uid: Int?=null,
    
    val updatedAt: String?=null,
    
    val userBlockReason: String?=null,
    
    val userId: String?=null
    
): Parcelable

/*
    Model: types.Action
*/
@Parcelize
data class types.Action(
    
    val page: @RawValue HashMap<String,Any>?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: types.Article
*/
@Parcelize
data class types.Article(
    
    val id: String?=null,
    
    val points: Double?=null,
    
    val price: Double?=null
    
): Parcelable

/*
    Model: types.Asset
*/
@Parcelize
data class types.Asset(
    
    val aspectRatio: String?=null,
    
    val id: String?=null,
    
    val secureUrl: String?=null
    
): Parcelable

/*
    Model: types.PageX
*/
@Parcelize
data class types.PageX(
    
    val hasNext: Boolean?=null,
    
    val itemTotal: Int?=null,
    
    val nextPageId: String?=null
    
): Parcelable



/*
    Model: Access
*/
@Parcelize
data class Access(
    
    val answer: Boolean?=null,
    
    val askQuestion: Boolean?=null,
    
    val comment: Boolean?=null,
    
    val rnr: Boolean?=null
    
): Parcelable

/*
    Model: AddMediaListRequest
*/
@Parcelize
data class AddMediaListRequest(
    
    val entityId: String?=null,
    
    val entityType: String?=null,
    
    val mediaList: ArrayList<AddMediaRequest>?=null,
    
    val refId: String?=null,
    
    val refType: String?=null
    
): Parcelable

/*
    Model: AddMediaRequest
*/
@Parcelize
data class AddMediaRequest(
    
    val cloudId: String?=null,
    
    val cloudName: String?=null,
    
    val cloudProvider: String?=null,
    
    val entityId: String?=null,
    
    val entityType: String?=null,
    
    val mediaUrl: String?=null,
    
    val refId: String?=null,
    
    val refType: String?=null,
    
    val tags: ArrayList<String>?=null,
    
    val thumbnailUrl: String?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: Attribute
*/
@Parcelize
data class Attribute(
    
    val createdOn: String?=null,
    
    val description: String?=null,
    
    val id: String?=null,
    
    val modifiedOn: String?=null,
    
    val name: String?=null,
    
    val slug: String?=null,
    
    val tags: ArrayList<TagMeta>?=null
    
): Parcelable

/*
    Model: AttributeObject
*/
@Parcelize
data class AttributeObject(
    
    val description: String?=null,
    
    val name: String?=null,
    
    val slug: String?=null,
    
    val title: String?=null,
    
    val type: String?=null,
    
    val value: Double?=null
    
): Parcelable

/*
    Model: CheckEligibilityResponse
*/
@Parcelize
data class CheckEligibilityResponse(
    
    val access: Access?=null,
    
    val mediaCloud: MediaCloud?=null
    
): Parcelable

/*
    Model: Cloud
*/
@Parcelize
data class Cloud(
    
    val id: String?=null,
    
    val name: String?=null,
    
    val provider: String?=null
    
): Parcelable

/*
    Model: CommentRequest
*/
@Parcelize
data class CommentRequest(
    
    val comment: ArrayList<String>?=null,
    
    val entityId: String?=null,
    
    val entityType: String?=null
    
): Parcelable

/*
    Model: CreateQNARequest
*/
@Parcelize
data class CreateQNARequest(
    
    val choices: ArrayList<String>?=null,
    
    val entityId: String?=null,
    
    val entityType: String?=null,
    
    val maxLen: Int?=null,
    
    val sortPriority: Int?=null,
    
    val tags: ArrayList<String>?=null,
    
    val text: String?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: DeviceMeta
*/
@Parcelize
data class DeviceMeta(
    
    val appVersion: String?=null,
    
    val platform: String?=null
    
): Parcelable

/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    val message: String?=null,
    
    val success: Boolean?=null
    
): Parcelable

/*
    Model: MediaCloud
*/
@Parcelize
data class MediaCloud(
    
    val key: String?=null,
    
    val name: String?=null,
    
    val namespace: String?=null,
    
    val path: String?=null,
    
    val provider: String?=null,
    
    val secret: String?=null
    
): Parcelable

/*
    Model: MediaMeta
*/
@Parcelize
data class MediaMeta(
    
    val cloud: Cloud?=null,
    
    val comment: ArrayList<String>?=null,
    
    val description: String?=null,
    
    val id: String?=null,
    
    val type: String?=null,
    
    val url: Url?=null
    
): Parcelable

/*
    Model: PageCursor
*/
@Parcelize
data class PageCursor(
    
    val hasNext: Boolean?=null,
    
    val hasPrevious: Boolean?=null,
    
    val itemTotal: Int?=null,
    
    val nextId: String?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: PageNumber
*/
@Parcelize
data class PageNumber(
    
    val current: Int?=null,
    
    val hasNext: Boolean?=null,
    
    val itemTotal: Int?=null,
    
    val size: Int?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: ReportAbuseRequest
*/
@Parcelize
data class ReportAbuseRequest(
    
    val description: String?=null,
    
    val entityId: String?=null,
    
    val entityType: String?=null
    
): Parcelable

/*
    Model: SaveAttributeRequest
*/
@Parcelize
data class SaveAttributeRequest(
    
    val description: String?=null,
    
    val name: String?=null,
    
    val slug: String?=null
    
): Parcelable

/*
    Model: TagMeta
*/
@Parcelize
data class TagMeta(
    
    val media: ArrayList<MediaMeta>?=null,
    
    val name: String?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: UpdateAbuseStatusRequest
*/
@Parcelize
data class UpdateAbuseStatusRequest(
    
    val abusive: Boolean?=null,
    
    val active: Boolean?=null,
    
    val approve: Boolean?=null,
    
    val description: String?=null,
    
    val entityId: String?=null,
    
    val entityType: String?=null,
    
    val id: String?=null
    
): Parcelable

/*
    Model: UpdateAttributeRequest
*/
@Parcelize
data class UpdateAttributeRequest(
    
    val description: String?=null,
    
    val name: String?=null,
    
    val slug: String?=null
    
): Parcelable

/*
    Model: UpdateCommentRequest
*/
@Parcelize
data class UpdateCommentRequest(
    
    val active: Boolean?=null,
    
    val approve: Boolean?=null,
    
    val comment: ArrayList<String>?=null,
    
    val id: String?=null
    
): Parcelable

/*
    Model: UpdateMediaListRequest
*/
@Parcelize
data class UpdateMediaListRequest(
    
    val approve: Boolean?=null,
    
    val archive: Boolean?=null,
    
    val entityType: String?=null,
    
    val ids: ArrayList<String>?=null
    
): Parcelable

/*
    Model: UpdateQNARequest
*/
@Parcelize
data class UpdateQNARequest(
    
    val active: Boolean?=null,
    
    val approve: Boolean?=null,
    
    val choices: ArrayList<String>?=null,
    
    val id: String?=null,
    
    val tags: ArrayList<String>?=null
    
): Parcelable

/*
    Model: UpdateReviewRequest
*/
@Parcelize
data class UpdateReviewRequest(
    
    val active: Boolean?=null,
    
    val application: String?=null,
    
    val approve: Boolean?=null,
    
    val archive: Boolean?=null,
    
    val attributesRating: ArrayList<AttributeObject>?=null,
    
    val description: String?=null,
    
    val deviceMeta: DeviceMeta?=null,
    
    val entityId: String?=null,
    
    val entityType: String?=null,
    
    val mediaResource: ArrayList<MediaMeta>?=null,
    
    val rating: Double?=null,
    
    val reviewId: String?=null,
    
    val templateId: String?=null,
    
    val title: String?=null
    
): Parcelable

/*
    Model: UpdateVoteRequest
*/
@Parcelize
data class UpdateVoteRequest(
    
    val action: String?=null,
    
    val active: Boolean?=null,
    
    val id: String?=null,
    
    val refId: String?=null,
    
    val refType: String?=null
    
): Parcelable

/*
    Model: Url
*/
@Parcelize
data class Url(
    
    val main: String?=null,
    
    val thumbnail: String?=null
    
): Parcelable

/*
    Model: VoteRequest
*/
@Parcelize
data class VoteRequest(
    
    val action: String?=null,
    
    val entityId: String?=null,
    
    val entityType: String?=null,
    
    val refId: String?=null,
    
    val refType: String?=null
    
): Parcelable

/*
    Model: XCursorGetResponse
*/
@Parcelize
data class XCursorGetResponse(
    
    val items: @RawValue HashMap<String,Any>?=null,
    
    val page: PageCursor?=null
    
): Parcelable

/*
    Model: XInsertResponse
*/
@Parcelize
data class XInsertResponse(
    
    val ids: String?=null
    
): Parcelable

/*
    Model: XNumberGetResponse
*/
@Parcelize
data class XNumberGetResponse(
    
    val items: @RawValue HashMap<String,Any>?=null,
    
    val page: PageNumber?=null
    
): Parcelable

/*
    Model: XUpdateResponse
*/
@Parcelize
data class XUpdateResponse(
    
    val id: String?=null
    
): Parcelable



/*
    Model: GetCartResponse
*/
@Parcelize
data class GetCartResponse(
    
    val message: String?=null,
    
    val items: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val gstin: String?=null,
    
    val lastModified: String?=null,
    
    val breakupValues: @RawValue HashMap<String,Any>?=null,
    
    val couponText: String?=null,
    
    val breakupValuesAnalytics: String?=null,
    
    val couponDetails: String?=null,
    
    val restrictCheckout: Boolean?=null,
    
    val cartId: Int?=null,
    
    val codAvailable: Boolean?=null,
    
    val isValid: Boolean?=null,
    
    val deliveryChargeInfo: String?=null,
    
    val checkoutMode: String?=null,
    
    val creditDetails: String?=null
    
): Parcelable

/*
    Model: AddProductCart
*/
@Parcelize
data class AddProductCart(
    
    val itemId: Int?=null,
    
    val articleAssignment: @RawValue HashMap<String,Any>?=null,
    
    val display: String?=null,
    
    val articleId: String?=null,
    
    val storeId: Int?=null,
    
    val itemSize: Int?=null,
    
    val pos: Boolean?=null,
    
    val sellerId: Int?=null,
    
    val quantity: Int?=null
    
): Parcelable

/*
    Model: AddCartRequest
*/
@Parcelize
data class AddCartRequest(
    
    val items: ArrayList<AddProductCart>?=null
    
): Parcelable

/*
    Model: ProductPrice
*/
@Parcelize
data class ProductPrice(
    
    val addOn: Double?=null,
    
    val marked: Double?=null,
    
    val currencyCode: String?=null,
    
    val selling: Double?=null,
    
    val effective: Double?=null,
    
    val currencySymbol: String?=null
    
): Parcelable

/*
    Model: ProductPriceInfo
*/
@Parcelize
data class ProductPriceInfo(
    
    val base: ProductPrice?=null,
    
    val converted: ProductPrice?=null
    
): Parcelable

/*
    Model: CategoryInfo
*/
@Parcelize
data class CategoryInfo(
    
    val name: Int?=null,
    
    val uid: Int?=null
    
): Parcelable

/*
    Model: BaseInfo
*/
@Parcelize
data class BaseInfo(
    
    val name: String?=null,
    
    val uid: Int?=null
    
): Parcelable

/*
    Model: Image
*/
@Parcelize
data class Image(
    
    val aspectRatio: String?=null,
    
    val url: String?=null,
    
    val secureUrl: String?=null
    
): Parcelable

/*
    Model: ActionQuery
*/
@Parcelize
data class ActionQuery(
    
    val productSlug: ArrayList<String>?=null
    
): Parcelable

/*
    Model: Action
*/
@Parcelize
data class Action(
    
    val url: String?=null,
    
    val type: String?=null,
    
    val query: ActionQuery?=null
    
): Parcelable

/*
    Model: Product
*/
@Parcelize
data class Product(
    
    val categories: ArrayList<CategoryInfo>?=null,
    
    val slug: String?=null,
    
    val brand: BaseInfo?=null,
    
    val uid: Int?=null,
    
    val images: ArrayList<Image>?=null,
    
    val name: String?=null,
    
    val type: String?=null,
    
    val action: Action?=null
    
): Parcelable

/*
    Model: ProductAvailability
*/
@Parcelize
data class ProductAvailability(
    
    val outOfStock: Boolean?=null,
    
    val sizes: ArrayList<String>?=null,
    
    val isValid: Boolean?=null,
    
    val deliverable: Boolean?=null,
    
    val otherStoreQuantity: Int?=null
    
): Parcelable

/*
    Model: CartProductInfo
*/
@Parcelize
data class CartProductInfo(
    
    val message: String?=null,
    
    val bulkOffer: String?=null,
    
    val key: String?=null,
    
    val couponMessage: String?=null,
    
    val article: String?=null,
    
    val price: ProductPriceInfo?=null,
    
    val discount: String?=null,
    
    val product: Product?=null,
    
    val quantity: Int?=null,
    
    val availability: ProductAvailability?=null
    
): Parcelable

/*
    Model: RawBreakup
*/
@Parcelize
data class RawBreakup(
    
    val fyndCash: Int?=null,
    
    val youSaved: Int?=null,
    
    val codCharge: Int?=null,
    
    val subtotal: Int?=null,
    
    val coupon: Int?=null,
    
    val total: Int?=null,
    
    val deliveryCharge: Int?=null
    
): Parcelable

/*
    Model: BaseLoyaltyPoints
*/
@Parcelize
data class BaseLoyaltyPoints(
    
    val isApplied: Boolean?=null,
    
    val description: String?=null,
    
    val total: Double?=null,
    
    val applicable: Int?=null
    
): Parcelable

/*
    Model: DisplayBreakup
*/
@Parcelize
data class DisplayBreakup(
    
    val key: String?=null,
    
    val display: String?=null,
    
    val currencyCode: String?=null,
    
    val value: Int?=null,
    
    val currencySymbol: String?=null
    
): Parcelable

/*
    Model: CouponBreakup
*/
@Parcelize
data class CouponBreakup(
    
    val message: String?=null,
    
    val type: String?=null,
    
    val code: String?=null,
    
    val value: Int?=null,
    
    val uid: Int?=null,
    
    val isApplied: Boolean?=null
    
): Parcelable

/*
    Model: BaseCartBreakup
*/
@Parcelize
data class BaseCartBreakup(
    
    val raw: RawBreakup?=null,
    
    val loyaltyPoints: BaseLoyaltyPoints?=null,
    
    val display: DisplayBreakup?=null,
    
    val coupon: CouponBreakup?=null
    
): Parcelable

/*
    Model: CartCurrency
*/
@Parcelize
data class CartCurrency(
    
    val symbol: String?=null,
    
    val code: String?=null
    
): Parcelable

/*
    Model: PaymentOption
*/
@Parcelize
data class PaymentOption(
    
    val list: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val displayName: String?=null,
    
    val paymentModeId: Int?=null,
    
    val displayPriority: Int?=null,
    
    val name: String?=null
    
): Parcelable

/*
    Model: PaymentFlow
*/
@Parcelize
data class PaymentFlow(
    
    val paymentFlow: String?=null,
    
    val apiLink: String?=null,
    
    val data: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: PaymentFlows
*/
@Parcelize
data class PaymentFlows(
    
    val juspay: PaymentFlow?=null,
    
    val simpl: PaymentFlow?=null,
    
    val upiRazorpay: PaymentFlow?=null,
    
    val fynd: PaymentFlow?=null,
    
    val razorpay: PaymentFlow?=null
    
): Parcelable

/*
    Model: PaymentOptions
*/
@Parcelize
data class PaymentOptions(
    
    val paymentOption: ArrayList<PaymentOption>?=null,
    
    val default: @RawValue HashMap<String,Any>?=null,
    
    val paymentFlows: PaymentFlows?=null
    
): Parcelable

/*
    Model: CartResponse
*/
@Parcelize
data class CartResponse(
    
    val message: String?=null,
    
    val items: ArrayList<CartProductInfo>?=null,
    
    val lastModified: String?=null,
    
    val breakupValues: BaseCartBreakup?=null,
    
    val couponText: String?=null,
    
    val checkoutMode: String?=null,
    
    val currency: CartCurrency?=null,
    
    val cartId: Int?=null,
    
    val paymentOptions: PaymentOptions?=null,
    
    val isValid: Boolean?=null,
    
    val uid: String?=null,
    
    val deliveryChargeInfo: String?=null,
    
    val gstin: String?=null,
    
    val restrictCheckout: Boolean?=null
    
): Parcelable

/*
    Model: UpdateProductCart
*/
@Parcelize
data class UpdateProductCart(
    
    val itemId: Int?=null,
    
    val articleId: String?=null,
    
    val itemSize: Int?=null,
    
    val itemIndex: Int?=null,
    
    val quantity: Int?=null
    
): Parcelable

/*
    Model: UpdateCartRequest
*/
@Parcelize
data class UpdateCartRequest(
    
    val items: ArrayList<UpdateProductCart>?=null,
    
    val operation: String?=null
    
): Parcelable

/*
    Model: PageCoupon
*/
@Parcelize
data class PageCoupon(
    
    val hasNext: Boolean?=null,
    
    val current: Int?=null,
    
    val hasPrevious: Boolean?=null,
    
    val totalItemCount: Int?=null,
    
    val total: Int?=null
    
): Parcelable

/*
    Model: Coupon
*/
@Parcelize
data class Coupon(
    
    val message: String?=null,
    
    val maxDiscountValue: Double?=null,
    
    val couponValue: Double?=null,
    
    val title: String?=null,
    
    val couponCode: String?=null,
    
    val expiresOn: String?=null,
    
    val isApplicable: Boolean?=null,
    
    val minimumCartValue: Double?=null,
    
    val subTitle: String?=null,
    
    val uid: Int?=null,
    
    val isApplied: Boolean?=null
    
): Parcelable

/*
    Model: GetCouponResponse
*/
@Parcelize
data class GetCouponResponse(
    
    val page: PageCoupon?=null,
    
    val availableCouponList: ArrayList<Coupon>?=null
    
): Parcelable

/*
    Model: RawCartCoupon
*/
@Parcelize
data class RawCartCoupon(
    
    val fyndCash: Double?=null,
    
    val youSaved: Double?=null,
    
    val mrpTotal: Double?=null,
    
    val vog: Double?=null,
    
    val codCharge: Double?=null,
    
    val gstCharges: Double?=null,
    
    val coupon: Double?=null,
    
    val subtotal: Double?=null,
    
    val total: Double?=null,
    
    val convenienceFee: Double?=null,
    
    val discount: Double?=null,
    
    val deliveryCharge: Double?=null
    
): Parcelable

/*
    Model: CartCoupon
*/
@Parcelize
data class CartCoupon(
    
    val message: String?=null,
    
    val type: String?=null,
    
    val code: String?=null,
    
    val value: Int?=null,
    
    val uid: Int?=null,
    
    val isApplied: Boolean?=null
    
): Parcelable

/*
    Model: LoyaltyPoints
*/
@Parcelize
data class LoyaltyPoints(
    
    val isApplied: Boolean?=null,
    
    val description: String?=null,
    
    val total: Int?=null,
    
    val applicable: String?=null
    
): Parcelable

/*
    Model: SaveCoupon
*/
@Parcelize
data class SaveCoupon(
    
    val raw: RawCartCoupon?=null,
    
    val coupon: CartCoupon?=null,
    
    val display: ArrayList<String>?=null,
    
    val loyaltyPoints: LoyaltyPoints?=null
    
): Parcelable

/*
    Model: SaveCouponResponse
*/
@Parcelize
data class SaveCouponResponse(
    
    val message: String?=null,
    
    val items: ArrayList<String>?=null,
    
    val lastModified: String?=null,
    
    val couponText: String?=null,
    
    val breakupValues: SaveCoupon?=null,
    
    val checkoutMode: String?=null,
    
    val cartId: Int?=null,
    
    val isValid: Boolean?=null,
    
    val uid: Int?=null,
    
    val deliveryChargeInfo: String?=null,
    
    val gstin: String?=null,
    
    val restrictCheckout: Boolean?=null
    
): Parcelable

/*
    Model: OfferPrice
*/
@Parcelize
data class OfferPrice(
    
    val marked: Int?=null,
    
    val currencyCode: String?=null,
    
    val bulkEffective: Double?=null,
    
    val effective: Int?=null,
    
    val currencySymbol: String?=null
    
): Parcelable

/*
    Model: OfferItem
*/
@Parcelize
data class OfferItem(
    
    val margin: Int?=null,
    
    val autoApplied: Boolean?=null,
    
    val price: OfferPrice?=null,
    
    val total: Double?=null,
    
    val best: Boolean?=null,
    
    val type: String?=null,
    
    val quantity: Int?=null
    
): Parcelable

/*
    Model: OfferSeller
*/
@Parcelize
data class OfferSeller(
    
    val name: String?=null,
    
    val uid: Int?=null
    
): Parcelable

/*
    Model: BulkPriceOffer
*/
@Parcelize
data class BulkPriceOffer(
    
    val offers: ArrayList<OfferItem>?=null,
    
    val seller: OfferSeller?=null
    
): Parcelable

/*
    Model: BulkPriceResponse
*/
@Parcelize
data class BulkPriceResponse(
    
    val data: ArrayList<BulkPriceOffer>?=null
    
): Parcelable

/*
    Model: Address
*/
@Parcelize
data class Address(
    
    val addressId: Int?=null,
    
    val email: String?=null,
    
    val isDefaultAddress: Boolean?=null,
    
    val userId: String?=null,
    
    val addressType: String?=null,
    
    val area: String?=null,
    
    val phone: Int?=null,
    
    val name: String?=null,
    
    val uid: Int?=null,
    
    val state: String?=null,
    
    val areaCode: String?=null,
    
    val meta: @RawValue HashMap<String,Any>?=null,
    
    val countryCode: String?=null,
    
    val city: String?=null,
    
    val landmark: String?=null,
    
    val country: String?=null,
    
    val areaCodeSlug: String?=null,
    
    val isActive: Boolean?=null,
    
    val geoLocation: @RawValue HashMap<String,Any>?=null,
    
    val checkoutMode: String?=null,
    
    val address: String?=null
    
): Parcelable

/*
    Model: GetAddressResponse
*/
@Parcelize
data class GetAddressResponse(
    
    val address: ArrayList<Address>?=null
    
): Parcelable

/*
    Model: SaveAddressRequest
*/
@Parcelize
data class SaveAddressRequest(
    
    val email: String?=null,
    
    val isDefaultAddress: Boolean?=null,
    
    val addressType: String?=null,
    
    val area: String?=null,
    
    val pincode: Int?=null,
    
    val phone: Int?=null,
    
    val landmark: String?=null,
    
    val name: String?=null,
    
    val address: String?=null
    
): Parcelable

/*
    Model: SaveAddressResponse
*/
@Parcelize
data class SaveAddressResponse(
    
    val addressId: Int?=null,
    
    val success: String?=null,
    
    val isDefaultAddress: Boolean?=null
    
): Parcelable

/*
    Model: UpdateAddressRequest
*/
@Parcelize
data class UpdateAddressRequest(
    
    val email: String?=null,
    
    val isDefaultAddress: Boolean?=null,
    
    val addressType: String?=null,
    
    val area: String?=null,
    
    val pincode: Int?=null,
    
    val phone: Int?=null,
    
    val landmark: String?=null,
    
    val name: String?=null,
    
    val address: String?=null
    
): Parcelable

/*
    Model: UpdateAddressResponse
*/
@Parcelize
data class UpdateAddressResponse(
    
    val addressId: Int?=null,
    
    val success: Boolean?=null,
    
    val isUpdated: Boolean?=null,
    
    val isDefaultAddress: Boolean?=null
    
): Parcelable

/*
    Model: DeleteAddressResponse
*/
@Parcelize
data class DeleteAddressResponse(
    
    val addressId: Int?=null,
    
    val isDeleted: Boolean?=null
    
): Parcelable

/*
    Model: SelectCartAddressRequest
*/
@Parcelize
data class SelectCartAddressRequest(
    
    val addressId: String?=null,
    
    val billingAddressId: Int?=null,
    
    val uid: String?=null
    
): Parcelable

/*
    Model: UpdateCartPaymentRequest
*/
@Parcelize
data class UpdateCartPaymentRequest(
    
    val addressId: Int?=null,
    
    val merchantCode: String?=null,
    
    val paymentMode: String?=null,
    
    val aggregatorName: String?=null,
    
    val uid: Int?=null,
    
    val paymentIdentifier: String?=null
    
): Parcelable

/*
    Model: ShipmentResponse
*/
@Parcelize
data class ShipmentResponse(
    
    val promise: String?=null,
    
    val items: ArrayList<CartProductInfo>?=null,
    
    val dpId: Int?=null,
    
    val shipments: Int?=null,
    
    val fulfillmentType: String?=null,
    
    val dpOptions: @RawValue HashMap<String,Any>?=null,
    
    val fulfillmentId: Int?=null,
    
    val boxType: String?=null,
    
    val shipmentType: String?=null
    
): Parcelable

/*
    Model: CartShipmentsResponse
*/
@Parcelize
data class CartShipmentsResponse(
    
    val message: String?=null,
    
    val lastModified: String?=null,
    
    val shipments: ArrayList<ShipmentResponse>?=null,
    
    val breakupValues: BaseCartBreakup?=null,
    
    val couponText: String?=null,
    
    val checkoutMode: String?=null,
    
    val currency: CartCurrency?=null,
    
    val cartId: Int?=null,
    
    val paymentOptions: PaymentOptions?=null,
    
    val isValid: Boolean?=null,
    
    val uid: String?=null,
    
    val deliveryChargeInfo: String?=null,
    
    val gstin: String?=null,
    
    val restrictCheckout: Boolean?=null
    
): Parcelable

/*
    Model: UpdateCartShipmentItem
*/
@Parcelize
data class UpdateCartShipmentItem(
    
    val articleUid: String?=null,
    
    val shipmentType: String?=null,
    
    val quantity: Int?=null
    
): Parcelable

/*
    Model: UpdateCartShipmentRequest
*/
@Parcelize
data class UpdateCartShipmentRequest(
    
    val shipments: ArrayList<UpdateCartShipmentItem>?=null
    
): Parcelable

/*
    Model: CartCheckoutRequest
*/
@Parcelize
data class CartCheckoutRequest(
    
    val addressId: Int?=null,
    
    val fyndstoreEmpId: String?=null,
    
    val merchantCode: String?=null,
    
    val callbackUrl: String?=null,
    
    val extraMeta: @RawValue HashMap<String,Any>?=null,
    
    val paymentMode: String?=null,
    
    val paymentAutoConfirm: Boolean?=null,
    
    val billingAddress: @RawValue HashMap<String,Any>?=null,
    
    val orderingStore: Int?=null,
    
    val staff: @RawValue HashMap<String,Any>?=null,
    
    val paymentParams: @RawValue HashMap<String,Any>?=null,
    
    val paymentIdentifier: String?=null,
    
    val billingAddressId: Int?=null,
    
    val meta: @RawValue HashMap<String,Any>?=null,
    
    val aggregator: String?=null
    
): Parcelable

/*
    Model: DeliverySlot
*/
@Parcelize
data class DeliverySlot(
    
    val default: Boolean?=null,
    
    val deliverySlotTiming: String?=null,
    
    val deliverySlotId: Int?=null
    
): Parcelable

/*
    Model: DeliverySlotDate
*/
@Parcelize
data class DeliverySlotDate(
    
    val date: String?=null,
    
    val deliverySlot: ArrayList<DeliverySlot>?=null
    
): Parcelable

/*
    Model: CheckCart
*/
@Parcelize
data class CheckCart(
    
    val deliveryChargeOrderValue: Int?=null,
    
    val couponText: String?=null,
    
    val codMessage: String?=null,
    
    val isValid: Boolean?=null,
    
    val uid: String?=null,
    
    val restrictCheckout: Boolean?=null,
    
    val storeCode: String?=null,
    
    val success: Boolean?=null,
    
    val paymentOptions: PaymentOptions?=null,
    
    val codAvailable: Boolean?=null,
    
    val deliveryChargeInfo: String?=null,
    
    val gstin: String?=null,
    
    val items: ArrayList<CartProductInfo>?=null,
    
    val breakupValues: BaseCartBreakup?=null,
    
    val checkoutMode: String?=null,
    
    val storeEmps: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val userType: String?=null,
    
    val orderId: String?=null,
    
    val message: String?=null,
    
    val currency: CartCurrency?=null,
    
    val codCharges: Int?=null,
    
    val deliveryCharges: Int?=null,
    
    val deliverySlots: ArrayList<DeliverySlotDate>?=null,
    
    val cartId: Int?=null,
    
    val errorMessage: String?=null,
    
    val lastModified: String?=null
    
): Parcelable

/*
    Model: OrderData
*/
@Parcelize
data class OrderData(
    
    val orderId: String?=null
    
): Parcelable

/*
    Model: CartCheckoutResponse
*/
@Parcelize
data class CartCheckoutResponse(
    
    val message: String?=null,
    
    val cart: CheckCart?=null,
    
    val callbackUrl: String?=null,
    
    val success: Boolean?=null,
    
    val appInterceptUrl: String?=null,
    
    val data: OrderData?=null,
    
    val orderId: String?=null
    
): Parcelable

/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    val selectedStaff: String?=null,
    
    val orderingStore: Int?=null
    
): Parcelable

/*
    Model: SharedCartDetails
*/
@Parcelize
data class SharedCartDetails(
    
    val token: String?=null,
    
    val user: @RawValue HashMap<String,Any>?=null,
    
    val source: @RawValue HashMap<String,Any>?=null,
    
    val meta: Meta?=null,
    
    val createdOn: String?=null
    
): Parcelable

/*
    Model: SharedCartResponse
*/
@Parcelize
data class SharedCartResponse(
    
    val message: String?=null,
    
    val items: ArrayList<CartProductInfo>?=null,
    
    val lastModified: String?=null,
    
    val breakupValues: BaseCartBreakup?=null,
    
    val couponText: String?=null,
    
    val checkoutMode: String?=null,
    
    val currency: CartCurrency?=null,
    
    val cartId: Int?=null,
    
    val paymentOptions: PaymentOptions?=null,
    
    val isValid: Boolean?=null,
    
    val uid: String?=null,
    
    val deliveryChargeInfo: String?=null,
    
    val gstin: String?=null,
    
    val restrictCheckout: Boolean?=null,
    
    val sharedCartDetails: SharedCartDetails?=null
    
): Parcelable

