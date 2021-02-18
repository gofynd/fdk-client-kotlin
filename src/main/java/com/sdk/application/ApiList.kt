package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface CatalogApiList {
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/")
    fun getProductDetailBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<ProductDetail>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/")
    fun getProductSizesBySlug(@Path("slug") slug: String, 
        @Query("store_id") store_id: String?=null
    )
    : Deferred<Response<ProductSizes>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/{size}/price/")
    fun getProductPriceBySlug(@Path("slug") slug: String, @Path("size") size: String, 
        @Query("pincode") pincode: Int?=null, @Query("store_id") store_id: String?=null
    )
    : Deferred<Response<ProductSizePriceResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/{size}/sellers/")
    fun getProductSellersBySlug(@Path("slug") slug: String, @Path("size") size: String, 
        @Query("pincode") pincode: Int?=null, @Query("page_no") page_no: Int?=null, @Query("page_size") page_size: Int?=null
    )
    : Deferred<Response<ProductSizeSellersResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/compare/")
    fun getProductComparisonBySlugs(@Query("slug") slug: String
        
    )
    : Deferred<Response<ProductsComparisonResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compare/")
    fun getSimilarComparisonProductBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<ProductCompareResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compared-frequently/")
    fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/{similar_type}/")
    fun getProductSimilarByIdentifier(@Path("slug") slug: String, @Path("similar_type") similar_type: String
        
    )
    : Deferred<Response<SimilarProductByTypeResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/variants/")
    fun getProductVariantsBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<ProductVariantsResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/")
    fun getProductStockByIds(
        @Query("item_id") item_id: String?=null, @Query("alu") alu: String?=null, @Query("sku_code") sku_code: String?=null, @Query("ean") ean: String?=null, @Query("upc") upc: String?=null
    )
    : Deferred<Response<ProductStockStatusResponse>>
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/poll/")
    fun getProductStockForTimeByIds(@Query("timestamp") timestamp: String, 
        @Query("page_size") page_size: Int?=null, @Query("page_id") page_id: String?=null
    )
    : Deferred<Response<ProductStockPolling>>
    
    @GET ("/service/application/catalog/v1.0/products/")
    fun getProducts(
        @Query("q") q: String?=null, @Query("f") f: String?=null, @Query("filters") filters: Boolean?=null, @Query("sort_on") sort_on: String?=null, @Query("page_id") page_id: String?=null, @Query("page_size") page_size: Int?=null, @Query("page_no") page_no: Int?=null, @Query("page_type") page_type: String?=null
    )
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/brands/")
    fun getBrands(
        @Query("department") department: String?=null, @Query("page_no") page_no: Int?=null, @Query("page_size") page_size: Int?=null
    )
    : Deferred<Response<BrandListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/brands/{slug}/")
    fun getBrandDetailBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<BrandDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/")
    fun getCategories(
        @Query("department") department: String?=null
    )
    : Deferred<Response<CategoryListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/categories/{slug}/")
    fun getCategoryDetailBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<CategoryMetaResponse>>
    
    @GET ("/service/application/catalog/v1.0/home/listing/")
    fun getHomeProducts(
        @Query("sort_on") sort_on: String?=null, @Query("page_id") page_id: String?=null, @Query("page_size") page_size: Int?=null
    )
    : Deferred<Response<HomeListingResponse>>
    
    @GET ("/service/application/catalog/v1.0/departments/")
    fun getDepartments(
        
    )
    : Deferred<Response<DepartmentResponse>>
    
    @GET ("/service/application/catalog/v1.0/auto-complete/")
    fun getSearchResults(@Query("q") q: String
        
    )
    : Deferred<Response<AutoCompleteResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/")
    fun getCollections(
        @Query("page_id") page_id: String?=null, @Query("page_size") page_size: Int?=null
    )
    : Deferred<Response<GetCollectionListingResponse>>
    
    @POST ("/service/application/catalog/v1.0/collections/")
    fun addCollection(
        
    )
    : Deferred<Response<CollectionDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/items/")
    fun getCollectionItemsBySlug(@Path("slug") slug: String, 
        @Query("f") f: String?=null, @Query("filters") filters: Boolean?=null, @Query("sort_on") sort_on: String?=null, @Query("page_id") page_id: String?=null, @Query("page_size") page_size: Int?=null
    )
    : Deferred<Response<GetCollectionListingItemsResponse>>
    
    @POST ("/service/application/catalog/v1.0/collections/{slug}/items/")
    fun addCollectionItemsBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<CollectionItemsResponse>>
    
    @PUT ("/service/application/catalog/v1.0/collections/{slug}/")
    fun updateCollectionDetailBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<CollectionsUpdateDetailResponse>>
    
    @DELETE ("/service/application/catalog/v1.0/collections/{slug}/")
    fun deleteCollectionDetailBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<CollectionDetailViewDeleteResponse>>
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/")
    fun getCollectionDetailBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<CollectionDetailResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/")
    fun getFollowedListing(@Path("collection_type") collection_type: String
        
    )
    : Deferred<Response<GetFollowListingResponse>>
    
    @DELETE ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun unfollowById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int
        
    )
    : Deferred<Response<FollowPostResponse>>
    
    @POST ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    fun followById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int
        
    )
    : Deferred<Response<FollowPostResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/count/")
    fun getFollowerCountById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: String
        
    )
    : Deferred<Response<FollowerCountResponse>>
    
    @GET ("/service/application/catalog/v1.0/follow/ids/")
    fun getFollowIds(
        @Query("collection_type") collection_type: String?=null
    )
    : Deferred<Response<FollowIdsResponse>>
    
    @GET ("/service/application/catalog/v1.0/analytics/store-list/")
    fun getStores(
        @Query("page_no") page_no: Int?=null, @Query("page_size") page_size: Int?=null, @Query("q") q: String?=null, @Query("range") range: Int?=null, @Query("latitude") latitude: Double?=null, @Query("longitude") longitude: Double?=null
    )
    : Deferred<Response<StoreListingResponse>>
    
}

interface LeadApiList {
    
    @GET ("/service/application/lead/v1.0/ticket/{id}")
    fun getTicket(@Path("id") id: String
        
    )
    : Deferred<Response<Ticket>>
    
    @POST ("/service/application/lead/v1.0/ticket/{ticket_id}/history")
    fun createHistoryForTicket(@Path("ticket_id") ticket_id: String
        
    )
    : Deferred<Response<TicketHistory>>
    
    @POST ("/service/application/lead/v1.0/ticket/")
    fun createTicket(
        
    )
    : Deferred<Response<Ticket>>
    
    @GET ("/service/application/lead/v1.0/form/{slug}")
    fun getCustomForm(@Path("slug") slug: String
        
    )
    : Deferred<Response<CustomForm>>
    
    @POST ("/service/application/lead/v1.0/form/{slug}/submit")
    fun submitCustomForm(@Path("slug") slug: String
        
    )
    : Deferred<Response<SubmitCustomFormResponse>>
    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/participants")
    fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String
        
    )
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/token")
    fun getTokenForVideoRoom(@Path("unique_name") unique_name: String
        
    )
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
}

interface ShareApiList {
    
    @POST ("/service/application/share/v1.0/qr/")
    fun getApplicationQRCode(
        
    )
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/qr/products/{slug}/")
    fun getProductQRCodeBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/qr/collection/{slug}/")
    fun getCollectionQRCodeBySlug(@Path("slug") slug: String
        
    )
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/qr/url/")
    fun getUrlQRCode(@Query("url") url: String
        
    )
    : Deferred<Response<QRCodeResp>>
    
    @POST ("/service/application/share/v1.0/links/short-link/")
    fun createShortLink(
        
    )
    : Deferred<Response<ShortLinkRes>>
    
    @GET ("/service/application/share/v1.0/links/short-link/{hash}/")
    fun getShortLinkByHash(@Path("hash") hash: String
        
    )
    : Deferred<Response<ShortLinkRes>>
    
    @GET ("/service/application/share/v1.0/links/short-link/{hash}/original/")
    fun getOriginalShortLinkByHash(@Path("hash") hash: String
        
    )
    : Deferred<Response<ShortLinkRes>>
    
}

