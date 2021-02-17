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

