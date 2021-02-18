package com.sdk.application

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue


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
    
    val page: ProductListingActionPage?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: Media
*/
@Parcelize
data class Media(
    
    val url: String?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    val action: ProductListingAction?=null,
    
    val name: String?=null,
    
    val logo: Media?=null,
    
    val uid: Int?=null
    
): Parcelable

/*
    Model: ProductDetailAttribute
*/
@Parcelize
data class ProductDetailAttribute(
    
    val key: String?=null,
    
    val value: String?=null,
    
    val type: String?=null
    
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
    
    val name: String?=null,
    
    val attributes: @RawValue HashMap<String,Any>?=null,
    
    val imageNature: String?=null,
    
    val itemType: String?=null,
    
    val slug: String?=null,
    
    val tryouts: ArrayList<String>?=null,
    
    val rating: Double?=null,
    
    val brand: ProductBrand?=null,
    
    val uid: Int?=null,
    
    val ratingCount: Int?=null,
    
    val promoMeta: @RawValue HashMap<String,Any>?=null,
    
    val hasVariant: Boolean?=null,
    
    val highlights: ArrayList<String>?=null,
    
    val color: String?=null,
    
    val similars: ArrayList<String>?=null,
    
    val groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    val categories: ArrayList<ProductBrand>?=null,
    
    val productOnlineDate: String?=null,
    
    val type: String?=null,
    
    val medias: ArrayList<Media>?=null,
    
    val teaserTag: @RawValue HashMap<String,Any>?=null
    
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
    
    val display: String?=null,
    
    val isAvailable: Boolean?=null,
    
    val quantity: Int?=null,
    
    val value: String?=null
    
): Parcelable

/*
    Model: Price
*/
@Parcelize
data class Price(
    
    val max: Double?=null,
    
    val min: Double?=null,
    
    val currencyCode: String?=null,
    
    val currencySymbol: String?=null
    
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
    
    val discount: String?=null,
    
    val promoMeta: @RawValue HashMap<String,Any>?=null,
    
    val sizeChart: @RawValue HashMap<String,Any>?=null,
    
    val stores: ProductSizeStores?=null,
    
    val sellable: Boolean?=null,
    
    val sizes: ArrayList<ProductSize>?=null,
    
    val price: ProductListingPrice?=null
    
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
    Model: Store
*/
@Parcelize
data class Store(
    
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
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    val level: String?=null,
    
    val strategy: String?=null
    
): Parcelable

/*
    Model: ProductSizePriceResponse
*/
@Parcelize
data class ProductSizePriceResponse(
    
    val discount: String?=null,
    
    val seller: Seller?=null,
    
    val store: Store?=null,
    
    val promoMeta: @RawValue HashMap<String,Any>?=null,
    
    val quantity: Int?=null,
    
    val sellerCount: Int?=null,
    
    val longLat: ArrayList<Double>?=null,
    
    val set: @RawValue HashMap<String,Any>?=null,
    
    val itemType: String?=null,
    
    val pricePerPrice: ProductStockPrice?=null,
    
    val specialBadge: String?=null,
    
    val strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val price: ProductStockPrice?=null,
    
    val articleId: String?=null,
    
    val articleAssignment: ArticleAssignment?=null,
    
    val pincode: Int?=null
    
): Parcelable

/*
    Model: ProductPage
*/
@Parcelize
data class ProductPage(
    
    val current: Int?=null,
    
    val totalItem: Int?=null,
    
    val hasPrevious: Boolean?=null,
    
    val nextId: String?=null,
    
    val hasNext: Boolean?=null
    
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
    Model: ProductSizeSellersResponse
*/
@Parcelize
data class ProductSizeSellersResponse(
    
    val page: ProductPage?=null,
    
    val items: ArrayList<ProductSizePriceResponse>?=null,
    
    val sortOn: ArrayList<ProductSizeSellerFilter>?=null
    
): Parcelable

/*
    Model: AttributeDetail
*/
@Parcelize
data class AttributeDetail(
    
    val display: String?=null,
    
    val key: String?=null,
    
    val description: String?=null
    
): Parcelable

/*
    Model: ProductsComparisonResponse
*/
@Parcelize
data class ProductsComparisonResponse(
    
    val attributesMetadata: ArrayList<AttributeDetail>?=null,
    
    val items: ArrayList<ProductDetail>?=null
    
): Parcelable

/*
    Model: ProductCompareResponse
*/
@Parcelize
data class ProductCompareResponse(
    
    val title: String?=null,
    
    val items: ArrayList<ProductDetail>?=null,
    
    val attributesMetadata: ArrayList<AttributeDetail>?=null,
    
    val subtitle: String?=null
    
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
    
    val title: String?=null,
    
    val items: ArrayList<ProductDetail>?=null,
    
    val subtitle: String?=null
    
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
    
    val action: ProductListingAction?=null,
    
    val name: String?=null,
    
    val medias: ArrayList<Media>?=null,
    
    val colorName: String?=null,
    
    val color: String?=null,
    
    val uid: Int?=null,
    
    val slug: String?=null,
    
    val isAvailable: Boolean?=null,
    
    val value: String?=null
    
): Parcelable

/*
    Model: ProductVariantResponse
*/
@Parcelize
data class ProductVariantResponse(
    
    val displayType: String?=null,
    
    val header: String?=null,
    
    val items: ArrayList<ProductVariantItemResponse>?=null
    
): Parcelable

/*
    Model: ProductVariantsResponse
*/
@Parcelize
data class ProductVariantsResponse(
    
    val variants: ArrayList<ProductVariantResponse>?=null
    
): Parcelable

/*
    Model: CompanyDetail
*/
@Parcelize
data class CompanyDetail(
    
    val id: Int?=null,
    
    val name: String?=null
    
): Parcelable

/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    val id: Int?=null,
    
    val name: String?=null,
    
    val city: String?=null,
    
    val code: String?=null
    
): Parcelable

/*
    Model: ProductStockStatusItem
*/
@Parcelize
data class ProductStockStatusItem(
    
    val seller: Seller?=null,
    
    val company: CompanyDetail?=null,
    
    val quantity: Int?=null,
    
    val identifier: @RawValue HashMap<String,Any>?=null,
    
    val size: String?=null,
    
    val uid: String?=null,
    
    val price: ProductStockPrice?=null,
    
    val store: StoreDetail?=null,
    
    val itemId: Int?=null
    
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
    
    val page: ProductPage?=null,
    
    val items: ArrayList<ProductStockStatusItem>?=null
    
): Parcelable

/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    val display: String?=null,
    
    val count: Int?=null,
    
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    val display: String?=null,
    
    val name: String?=null
    
): Parcelable

/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    val values: ArrayList<ProductFiltersValue>?=null,
    
    val key: ProductFiltersKey?=null
    
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
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    val page: ProductPage?=null,
    
    val filter: ArrayList<ProductFilters>?=null,
    
    val items: ArrayList<ProductDetail>?=null,
    
    val sortOn: ArrayList<ProductSortOn>?=null
    
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
    
    val banners: ImageUrls?=null,
    
    val discount: String?=null,
    
    val name: String?=null,
    
    val action: ProductListingAction?=null,
    
    val logo: Media?=null,
    
    val departments: ArrayList<String>?=null,
    
    val uid: Int?=null,
    
    val slug: String?=null
    
): Parcelable

/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    val page: ProductPage?=null,
    
    val items: ArrayList<BrandItem>?=null
    
): Parcelable

/*
    Model: BrandDetailResponse
*/
@Parcelize
data class BrandDetailResponse(
    
    val banners: ImageUrls?=null,
    
    val name: String?=null,
    
    val logo: Media?=null,
    
    val uid: Int?=null
    
): Parcelable

/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    val banners: ImageUrls?=null,
    
    val action: ProductListingAction?=null,
    
    val name: String?=null,
    
    val childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    val uid: Int?=null,
    
    val slug: String?=null
    
): Parcelable

/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    val items: ArrayList<CategoryItems>?=null,
    
    val department: String?=null
    
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
    
    val banners: ImageUrls?=null,
    
    val name: String?=null,
    
    val logo: Media?=null,
    
    val uid: Int?=null
    
): Parcelable

/*
    Model: Page
*/
@Parcelize
data class Page(
    
    val page: Int?=null,
    
    val pageSize: Int?=null
    
): Parcelable

/*
    Model: HomeListingResponse
*/
@Parcelize
data class HomeListingResponse(
    
    val page: Page?=null,
    
    val items: ArrayList<ProductDetail>?=null,
    
    val message: String?=null
    
): Parcelable

/*
    Model: Department
*/
@Parcelize
data class Department(
    
    val name: String?=null,
    
    val logo: Media?=null,
    
    val slug: String?=null,
    
    val uid: Int?=null,
    
    val priorityOrder: Int?=null
    
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
    
    val action: @RawValue HashMap<String,Any>?=null,
    
    val display: String?=null,
    
    val logo: Media?=null,
    
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
    Model: Schedule
*/
@Parcelize
data class Schedule(
    
    val start: String?=null,
    
    val duration: Int?=null,
    
    val cron: String?=null,
    
    val end: String?=null
    
): Parcelable

/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    val username: String?=null,
    
    val email: String?=null,
    
    val userId: String?=null,
    
    val uid: String?=null
    
): Parcelable

/*
    Model: SeoDetail
*/
@Parcelize
data class SeoDetail(
    
    val title: String?=null,
    
    val description: String?=null
    
): Parcelable

/*
    Model: CollectionImage
*/
@Parcelize
data class CollectionImage(
    
    val url: String?=null,
    
    val aspectRatio: String?=null
    
): Parcelable

/*
    Model: CollectionBanner
*/
@Parcelize
data class CollectionBanner(
    
    val landscape: CollectionImage?=null,
    
    val portrait: CollectionImage?=null
    
): Parcelable

/*
    Model: CollectionBadge
*/
@Parcelize
data class CollectionBadge(
    
    val color: String?=null,
    
    val text: String?=null
    
): Parcelable

/*
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    val name: String?=null,
    
    val visibleFacetsKeys: ArrayList<String>?=null,
    
    val slug: String?=null,
    
    val sortOn: String?=null,
    
    val isActive: Boolean?=null,
    
    val schedule: Schedule?=null,
    
    val createdBy: UserInfo?=null,
    
    val published: Boolean?=null,
    
    val meta: @RawValue HashMap<String,Any>?=null,
    
    val query: @RawValue HashMap<String,Any>?=null,
    
    val description: String?=null,
    
    val seo: SeoDetail?=null,
    
    val allowSort: Boolean?=null,
    
    val banners: CollectionBanner?=null,
    
    val tags: ArrayList<String>?=null,
    
    val localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    val type: String?=null,
    
    val logo: CollectionImage?=null,
    
    val allowFacets: Boolean?=null,
    
    val appId: String?=null,
    
    val modifiedBy: UserInfo?=null,
    
    val badge: CollectionBadge?=null,
    
    val customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    val banners: ImageUrls?=null,
    
    val name: String?=null,
    
    val cron: @RawValue HashMap<String,Any>?=null,
    
    val logo: Media?=null,
    
    val meta: @RawValue HashMap<String,Any>?=null,
    
    val badge: @RawValue HashMap<String,Any>?=null,
    
    val query: @RawValue HashMap<String,Any>?=null,
    
    val description: String?=null,
    
    val visibleFacetsKeys: ArrayList<String>?=null,
    
    val allowFacets: Boolean?=null,
    
    val appId: String?=null,
    
    val allowSort: Boolean?=null,
    
    val seo: SeoDetail?=null,
    
    val slug: String?=null,
    
    val tag: ArrayList<String>?=null,
    
    val isActive: Boolean?=null,
    
    val schedule: @RawValue HashMap<String,Any>?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    val action: ProductListingAction?=null,
    
    val name: String?=null,
    
    val visibleFacetsKeys: ArrayList<String>?=null,
    
    val slug: String?=null,
    
    val tag: ArrayList<String>?=null,
    
    val isActive: Boolean?=null,
    
    val schedule: @RawValue HashMap<String,Any>?=null,
    
    val meta: @RawValue HashMap<String,Any>?=null,
    
    val query: @RawValue HashMap<String,Any>?=null,
    
    val description: String?=null,
    
    val seo: SeoDetail?=null,
    
    val uid: String?=null,
    
    val allowSort: Boolean?=null,
    
    val banners: ImageUrls?=null,
    
    val type: String?=null,
    
    val cron: @RawValue HashMap<String,Any>?=null,
    
    val logo: Media?=null,
    
    val allowFacets: Boolean?=null,
    
    val appId: String?=null,
    
    val badge: @RawValue HashMap<String,Any>?=null
    
): Parcelable

/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    val display: String?=null,
    
    val name: String?=null,
    
    val isSelected: Boolean?=null
    
): Parcelable

/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    val display: String?=null,
    
    val name: String?=null,
    
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
    
    val page: ProductPage?=null,
    
    val items: ArrayList<GetCollectionDetailNest>?=null,
    
    val filters: CollectionListingFilter?=null
    
): Parcelable

/*
    Model: CollectionItem
*/
@Parcelize
data class CollectionItem(
    
    val action: String?=null,
    
    val itemId: Int?=null
    
): Parcelable

/*
    Model: CollectionItemsRequest
*/
@Parcelize
data class CollectionItemsRequest(
    
    val items: ArrayList<CollectionItem>?=null,
    
    val pageSize: Int?=null,
    
    val query: @RawValue HashMap<String,Any>?=null,
    
    val pageNo: Int?=null,
    
    val type: String?=null
    
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
    
    val page: ProductPage?=null,
    
    val items: ArrayList<ProductDetail>?=null,
    
    val sortOn: ArrayList<ProductSortOn>?=null,
    
    val filters: ArrayList<ProductFilters>?=null
    
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
    
    val page: ProductPage?=null,
    
    val items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
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
    
    val products: ArrayList<Int>?=null,
    
    val collections: ArrayList<Int>?=null,
    
    val brands: ArrayList<Int>?=null
    
): Parcelable

/*
    Model: FollowIdsResponse
*/
@Parcelize
data class FollowIdsResponse(
    
    val data: FollowIdsData?=null
    
): Parcelable

/*
    Model: LatLong
*/
@Parcelize
data class LatLong(
    
    val coordinates: ArrayList<Double>?=null,
    
    val type: String?=null
    
): Parcelable

/*
    Model: Store1
*/
@Parcelize
data class Store1(
    
    val state: String?=null,
    
    val name: String?=null,
    
    val latLong: LatLong?=null,
    
    val country: String?=null,
    
    val uid: Int?=null,
    
    val address: String?=null,
    
    val storeCode: String?=null,
    
    val city: String?=null,
    
    val storeEmail: String?=null,
    
    val pincode: Int?=null
    
): Parcelable

/*
    Model: StoreListingResponse
*/
@Parcelize
data class StoreListingResponse(
    
    val page: ProductPage?=null,
    
    val items: ArrayList<Store1>?=null
    
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

