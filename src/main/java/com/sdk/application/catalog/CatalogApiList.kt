package com.sdk.application.catalog

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.application.*

interface CatalogApiList {
    
    
    @GET
    suspend fun getProductDetailBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductDetail>
    
    
    @GET
    suspend fun getProductBundleItems(@Url url1: String?     ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductBundleItems>
    
    
    @GET
    suspend fun getProductBundlesByChildSku(@Url url1: String?      ,   @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductBundleItemsWithSlug>
    
    
    @GET
    suspend fun getProductSizesBySlug(@Url url1: String?     ,  @Query("store_id") storeId: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductSizes>
    
    
    @GET
    suspend fun getProductComparisonBySlugs(@Url url1: String?    ,  @Query("slug") slug: ArrayList<String>, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductsComparisonResponseSchema>
    
    
    @GET
    suspend fun getSimilarComparisonProductBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductCompareResponseSchema>
    
    
    @GET
    suspend fun getComparedFrequentlyProductBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductFrequentlyComparedSimilarResponseSchema>
    
    
    @GET
    suspend fun getProductVariantsBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductVariantsResponseSchema>
    
    
    @GET
    suspend fun getProductStockByIds(@Url url1: String?    ,      @Query("item_id") itemId: Int?, @Query("alu") alu: String?, @Query("sku_code") skuCode: String?, @Query("ean") ean: String?, @Query("upc") upc: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductStockStatusResponseSchema>
    
    
    @GET
    suspend fun getProductStockForTimeByIds(@Url url1: String?    ,    @Query("timestamp") timestamp: String, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductStockPolling>
    
    
    @GET
    suspend fun getProducts(@Url url1: String?    ,         @Query("q") q: String?, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductListingResponseSchema>
    
    
    @GET
    suspend fun getBrands(@Url url1: String?    ,    @Query("department") department: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BrandListingResponseSchema>
    
    
    @GET
    suspend fun getBrandDetailBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<BrandDetailResponseSchema>
    
    
    @GET
    suspend fun getCategories(@Url url1: String?    ,  @Query("department") department: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CategoryListingResponseSchema>
    
    
    @GET
    suspend fun getCategoryDetailBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<CategoryMetaResponseSchema>
    
    
    @GET
    suspend fun getHomeProducts(@Url url1: String?    ,    @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HomeListingResponseSchema>
    
    
    @GET
    suspend fun getDepartments(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentResponseSchema>
    
    
    @GET
    suspend fun getSearchResults(@Url url1: String?    ,  @Query("q") q: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AutoCompleteResponseSchema>
    
    
    @GET
    suspend fun getCollections(@Url url1: String?    ,     @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("tag") tag: ArrayList<String>?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCollectionListingResponseSchema>
    
    
    @GET
    suspend fun getCollectionItemsBySlug(@Url url1: String?     ,         @Query("f") f: String?, @Query("q") q: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductListingResponseSchema>
    
    
    @GET
    suspend fun getCollectionDetailBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<CollectionDetailResponseSchema>
    
    
    @GET
    suspend fun getFollowedListing(@Url url1: String?     ,   @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetFollowListingResponseSchema>
    
    
    @DELETE
    suspend fun unfollowById(@Url url1: String?     , @HeaderMap headers: Map<String, String>? = null)
    : Response<FollowPostResponseSchema>
    
    
    @POST
    suspend fun followById(@Url url1: String?     , @HeaderMap headers: Map<String, String>? = null)
    : Response<FollowPostResponseSchema>
    
    
    @GET
    suspend fun getFollowerCountById(@Url url1: String?     , @HeaderMap headers: Map<String, String>? = null)
    : Response<FollowerCountResponseSchema>
    
    
    @GET
    suspend fun getFollowIds(@Url url1: String?    ,  @Query("collection_type") collectionType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FollowIdsResponseSchema>
    
    
    @GET
    suspend fun getStores(@Url url1: String?    ,         @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?, @Query("tags") tags: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreListingResponseSchema>
    
    
    @GET
    suspend fun getInStockLocations(@Url url1: String?    ,        @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationStoreListing>
    
    
    @GET
    suspend fun getLocationDetailsById(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreDetails>
    
    
    @GET
    suspend fun getProductPriceBySlug(@Url url1: String?      ,    @Query("store_id") storeId: Int?, @Query("moq") moq: Int?, @Query("fulfillment_option_slug") fulfillmentOptionSlug: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductSizePriceResponseV4>
    
    
    @GET
    suspend fun getProductSellersBySlug(@Url url1: String?      ,     @Query("strategy") strategy: String?, @Query("fulfillment_option_slug") fulfillmentOptionSlug: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductSizeSellersResponseV4>
    
    
    @GET
    suspend fun listCountryCurrencyMappings(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<AvailableCountrySchema>
    
}
