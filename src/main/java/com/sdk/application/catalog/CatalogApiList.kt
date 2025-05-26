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
    suspend fun getProductSizesBySlug(@Url url1: String?     ,  @Query("store_id") storeId: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductSizes>
    
    
    @GET
    suspend fun getProductComparisonBySlugs(@Url url1: String?    ,  @Query("slug") slug: ArrayList<String>, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductsComparisonResponse>
    
    
    @GET
    suspend fun getSimilarComparisonProductBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductCompareResponse>
    
    
    @GET
    suspend fun getComparedFrequentlyProductBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductFrequentlyComparedSimilarResponse>
    
    
    @GET
    suspend fun getProductVariantsBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductVariantsResponse>
    
    
    @GET
    suspend fun getProductStockByIds(@Url url1: String?    ,      @Query("item_id") itemId: String?, @Query("alu") alu: String?, @Query("sku_code") skuCode: String?, @Query("ean") ean: String?, @Query("upc") upc: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductStockStatusResponse>
    
    
    @GET
    suspend fun getProductStockForTimeByIds(@Url url1: String?    ,    @Query("timestamp") timestamp: String, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductStockPolling>
    
    
    @GET
    suspend fun getProducts(@Url url1: String?    ,         @Query("q") q: String?, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductListingResponse>
    
    
    @GET
    suspend fun getBrands(@Url url1: String?    ,    @Query("department") department: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<BrandListingResponse>
    
    
    @GET
    suspend fun getBrandDetailBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<BrandDetailResponse>
    
    
    @GET
    suspend fun getCategories(@Url url1: String?    ,  @Query("department") department: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<CategoryListingResponse>
    
    
    @GET
    suspend fun getCategoryDetailBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<CategoryMetaResponse>
    
    
    @GET
    suspend fun getHomeProducts(@Url url1: String?    ,    @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<HomeListingResponse>
    
    
    @GET
    suspend fun getDepartments(@Url url1: String?   , @HeaderMap headers: Map<String, String>? = null)
    : Response<DepartmentResponse>
    
    
    @GET
    suspend fun getSearchResults(@Url url1: String?    ,  @Query("q") q: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<AutoCompleteResponse>
    
    
    @GET
    suspend fun getCollections(@Url url1: String?    ,     @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("tag") tag: ArrayList<String>?, @Query("q") q: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCollectionListingResponse>
    
    
    @GET
    suspend fun getCollectionItemsBySlug(@Url url1: String?     ,         @Query("f") f: String?, @Query("q") q: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductListingResponse>
    
    
    @GET
    suspend fun getCollectionDetailBySlug(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<CollectionDetailResponse>
    
    
    @GET
    suspend fun getFollowedListing(@Url url1: String?     ,   @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetFollowListingResponse>
    
    
    @DELETE
    suspend fun unfollowById(@Url url1: String?     , @HeaderMap headers: Map<String, String>? = null)
    : Response<FollowPostResponse>
    
    
    @POST
    suspend fun followById(@Url url1: String?     , @HeaderMap headers: Map<String, String>? = null)
    : Response<FollowPostResponse>
    
    
    @GET
    suspend fun getFollowerCountById(@Url url1: String?     , @HeaderMap headers: Map<String, String>? = null)
    : Response<FollowerCountResponse>
    
    
    @GET
    suspend fun getFollowIds(@Url url1: String?    ,  @Query("collection_type") collectionType: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<FollowIdsResponse>
    
    
    @GET
    suspend fun getStores(@Url url1: String?    ,         @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?, @Query("tags") tags: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreListingResponse>
    
    
    @GET
    suspend fun getInStockLocations(@Url url1: String?    ,        @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ApplicationStoreListing>
    
    
    @GET
    suspend fun getLocationDetailsById(@Url url1: String?    , @HeaderMap headers: Map<String, String>? = null)
    : Response<StoreDetails>
    
    
    @GET
    suspend fun getProductBundlesBySlug(@Url url1: String?    ,   @Query("slug") slug: String?, @Query("id") id: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductBundle>
    
    
    @GET
    suspend fun getProductPriceBySlug(@Url url1: String?      ,   @Query("store_id") storeId: Int?, @Query("moq") moq: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductSizePriceResponseV3>
    
    
    @POST
    suspend fun getProductsServiceability(@Url url1: String?   ,@Body body: ProductSizePriceServiceabilityRequest, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductSizePriceServiceabilityResponse>
    
    
    @GET
    suspend fun getProductSellersBySlug(@Url url1: String?      ,    @Query("strategy") strategy: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @HeaderMap headers: Map<String, String>? = null)
    : Response<ProductSizeSellersResponseV3>
    
}
