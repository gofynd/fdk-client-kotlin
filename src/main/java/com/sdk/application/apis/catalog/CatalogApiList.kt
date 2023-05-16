package com.sdk.application.apis.catalog

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import com.sdk.application.*
import com.sdk.application.models.catalog.*

interface CatalogApiList {
    
    
    @GET 
    fun getProductDetailBySlug(@Url url1: String?    )
    : Deferred<Response<ProductDetail>>
    
    
    @GET 
    fun getProductSizesBySlug(@Url url1: String?     ,  @Query("store_id") storeId: Int?)
    : Deferred<Response<ProductSizes>>
    
    
    @GET 
    fun getProductComparisonBySlugs(@Url url1: String?    ,  @Query("slug") slug: ArrayList<String>)
    : Deferred<Response<ProductsComparisonResponse>>
    
    
    @GET 
    fun getSimilarComparisonProductBySlug(@Url url1: String?    )
    : Deferred<Response<ProductCompareResponse>>
    
    
    @GET 
    fun getComparedFrequentlyProductBySlug(@Url url1: String?    )
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>>
    
    
    @GET 
    fun getProductVariantsBySlug(@Url url1: String?    )
    : Deferred<Response<ProductVariantsResponse>>
    
    
    @GET 
    fun getProductStockByIds(@Url url1: String?    ,      @Query("item_id") itemId: String?, @Query("alu") alu: String?, @Query("sku_code") skuCode: String?, @Query("ean") ean: String?, @Query("upc") upc: String?)
    : Deferred<Response<ProductStockStatusResponse>>
    
    
    @GET 
    fun getProductStockForTimeByIds(@Url url1: String?    ,    @Query("timestamp") timestamp: String, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?)
    : Deferred<Response<ProductStockPolling>>
    
    
    @GET 
    fun getProducts(@Url url1: String?    ,         @Query("q") q: String?, @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?)
    : Deferred<Response<ProductListingResponse>>
    
    
    @GET 
    fun getBrands(@Url url1: String?    ,    @Query("department") department: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BrandListingResponse>>
    
    
    @GET 
    fun getBrandDetailBySlug(@Url url1: String?    )
    : Deferred<Response<BrandDetailResponse>>
    
    
    @GET 
    fun getCategories(@Url url1: String?    ,  @Query("department") department: String?)
    : Deferred<Response<CategoryListingResponse>>
    
    
    @GET 
    fun getCategoryDetailBySlug(@Url url1: String?    )
    : Deferred<Response<CategoryMetaResponse>>
    
    
    @GET 
    fun getHomeProducts(@Url url1: String?    ,    @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<HomeListingResponse>>
    
    
    @GET 
    fun getDepartments(@Url url1: String?   )
    : Deferred<Response<DepartmentResponse>>
    
    
    @GET 
    fun getSearchResults(@Url url1: String?    ,  @Query("q") q: String)
    : Deferred<Response<AutoCompleteResponse>>
    
    
    @GET 
    fun getCollections(@Url url1: String?    ,     @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("tag") tag: ArrayList<String>?, @Query("q") q: String?)
    : Deferred<Response<GetCollectionListingResponse>>
    
    
    @GET 
    fun getCollectionItemsBySlug(@Url url1: String?     ,        @Query("f") f: String?, @Query("filters") filters: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?)
    : Deferred<Response<ProductListingResponse>>
    
    
    @GET 
    fun getCollectionDetailBySlug(@Url url1: String?    )
    : Deferred<Response<CollectionDetailResponse>>
    
    
    @GET 
    fun getFollowedListing(@Url url1: String?     ,   @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetFollowListingResponse>>
    
    
    @DELETE 
    fun unfollowById(@Url url1: String?     )
    : Deferred<Response<FollowPostResponse>>
    
    
    @POST 
    fun followById(@Url url1: String?     )
    : Deferred<Response<FollowPostResponse>>
    
    
    @GET 
    fun getFollowerCountById(@Url url1: String?     )
    : Deferred<Response<FollowerCountResponse>>
    
    
    @GET 
    fun getFollowIds(@Url url1: String?    ,  @Query("collection_type") collectionType: String?)
    : Deferred<Response<FollowIdsResponse>>
    
    
    @GET 
    fun getStores(@Url url1: String?    ,        @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?)
    : Deferred<Response<StoreListingResponse>>
    
    
    @GET 
    fun getInStockLocations(@Url url1: String?    ,        @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("city") city: String?, @Query("range") range: Int?, @Query("latitude") latitude: Double?, @Query("longitude") longitude: Double?)
    : Deferred<Response<ApplicationStoreListing>>
    
    
    @GET 
    fun getLocationDetailsById(@Url url1: String?    )
    : Deferred<Response<StoreDetails>>
    
    
    @GET 
    fun getProductBundlesBySlug(@Url url1: String?    ,   @Query("slug") slug: String?, @Query("id") id: String?)
    : Deferred<Response<ProductBundle>>
    
    
    @GET 
    fun getProductPriceBySlug(@Url url1: String?      ,    @Query("store_id") storeId: Int?, @Query("pincode") pincode: String?, @Query("moq") moq: Int?)
    : Deferred<Response<ProductSizePriceResponseV3>>
    
    
    @GET 
    fun getProductSellersBySlug(@Url url1: String?      ,     @Query("pincode") pincode: String?, @Query("strategy") strategy: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductSizeSellersResponseV3>>
    
}