package com.sdk.application.catalog

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*

interface CatalogApiList {
    
    
    @GET 
    suspend fun getProductDetailBySlug(@Url url1: String?    )
    : Response<ProductDetail>
    
    
    @GET 
    suspend fun getProductSizesBySlug(@Url url1: String?     ,  @Query("store_id") storeId: Int?)
    : Response<ProductSizes>
    
    
    @GET 
    suspend fun getProductComparisonBySlugs(@Url url1: String?    ,  @Query("slug") slug: ArrayList<String>)
    : Response<ProductsComparisonResponse>
    
    
    @GET 
    suspend fun getSimilarComparisonProductBySlug(@Url url1: String?    )
    : Response<ProductCompareResponse>
    
    
    @GET 
    suspend fun getComparedFrequentlyProductBySlug(@Url url1: String?    )
    : Response<ProductFrequentlyComparedSimilarResponse>
    
    
    @GET 
    suspend fun getProductVariantsBySlug(@Url url1: String?    )
    : Response<ProductVariantsResponse>
    
    
    @GET 
    suspend fun getProductStockByIds(@Url url1: String?    ,      @Query("item_id") itemId: String?, @Query("alu") alu: String?, @Query("sku_code") skuCode: String?, @Query("ean") ean: String?, @Query("upc") upc: String?)
    : Response<ProductStockStatusResponse>
    
    
    @GET 
    suspend fun getProductStockForTimeByIds(@Url url1: String?    ,    @Query("timestamp") timestamp: String, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?)
    : Response<ProductStockPolling>
    
    
    @GET 
    suspend fun getProducts(@Url url1: String?    ,         @Query("q") q: String?, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?)
    : Response<ProductListingResponse>
    
    
    @GET 
    suspend fun getBrands(@Url url1: String?    ,    @Query("department") department: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<BrandListingResponse>
    
    
    @GET 
    suspend fun getBrandDetailBySlug(@Url url1: String?    )
    : Response<BrandDetailResponse>
    
    
    @GET 
    suspend fun getCategories(@Url url1: String?    ,  @Query("department") department: String?)
    : Response<CategoryListingResponse>
    
    
    @GET 
    suspend fun getCategoryDetailBySlug(@Url url1: String?    )
    : Response<CategoryMetaResponse>
    
    
    @GET 
    suspend fun getHomeProducts(@Url url1: String?    ,    @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Response<HomeListingResponse>
    
    
    @GET 
    suspend fun getDepartments(@Url url1: String?   )
    : Response<DepartmentResponse>
    
    
    @GET 
    suspend fun getSearchResults(@Url url1: String?    ,  @Query("q") q: String)
    : Response<AutoCompleteResponse>
    
    
    @GET 
    suspend fun getCollections(@Url url1: String?    ,     @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("tag") tag: ArrayList<String>?, @Query("q") q: String?)
    : Response<GetCollectionListingResponse>
    
    
    @GET 
    suspend fun getCollectionItemsBySlug(@Url url1: String?     ,         @Query("f") f: String?, @Query("q") q: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?)
    : Response<ProductListingResponse>
    
    
    @GET 
    suspend fun getCollectionDetailBySlug(@Url url1: String?    )
    : Response<CollectionDetailResponse>
    
    
    @GET 
    suspend fun getFollowedListing(@Url url1: String?     ,   @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Response<GetFollowListingResponse>
    
    
    @DELETE 
    suspend fun unfollowById(@Url url1: String?     )
    : Response<FollowPostResponse>
    
    
    @POST 
    suspend fun followById(@Url url1: String?     )
    : Response<FollowPostResponse>
    
    
    @GET 
    suspend fun getFollowerCountById(@Url url1: String?     )
    : Response<FollowerCountResponse>
    
    
    @GET 
    suspend fun getFollowIds(@Url url1: String?    ,  @Query("collection_type") collectionType: String?)
    : Response<FollowIdsResponse>
    
    
    @GET 
    suspend fun getStores(@Url url1: String?    ,         @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?, @Query("tags") tags: String?)
    : Response<StoreListingResponse>
    
    
    @GET 
    suspend fun getInStockLocations(@Url url1: String?    ,        @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?)
    : Response<ApplicationStoreListing>
    
    
    @GET 
    suspend fun getLocationDetailsById(@Url url1: String?    )
    : Response<StoreDetails>
    
    
    @GET 
    suspend fun getProductBundlesBySlug(@Url url1: String?    ,   @Query("slug") slug: String?, @Query("id") id: String?)
    : Response<ProductBundle>
    
    
    @GET 
    suspend fun getProductPriceBySlug(@Url url1: String?      ,    @Query("store_id") storeId: Int?, @Query("pincode") pincode: String?, @Query("moq") moq: Int?)
    : Response<ProductSizePriceResponseV3>
    
    
    @GET 
    suspend fun getProductSellersBySlug(@Url url1: String?      ,     @Query("pincode") pincode: String?, @Query("strategy") strategy: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Response<ProductSizeSellersResponseV3>
    
}