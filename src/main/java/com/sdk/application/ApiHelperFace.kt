package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface ApiHelperFace {

    
    fun getProductDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<ProductDetail>>

    
    fun getProductSizesBySlug(@Path("slug") slug: String)
    :Deferred<Response<ProductSizes>>

    
    fun getProductPriceBySlug(@Path("slug") slug: String, @Path("size") size: String)
    :Deferred<Response<ProductSizePriceResponse>>

    
    fun getProductSellersBySlug(@Path("slug") slug: String, @Path("size") size: String)
    :Deferred<Response<ProductSizeSellersResponse>>

    
    fun getProductComparisonBySlugs(@Query("slug") slug: String)
    :Deferred<Response<ProductsComparisonResponse>>

    
    fun getSimilarComparisonProductBySlug(@Path("slug") slug: String)
    :Deferred<Response<ProductCompareResponse>>

    
    fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String)
    :Deferred<Response<ProductFrequentlyComparedSimilarResponse>>

    
    fun getProductSimilarByIdentifier(@Path("slug") slug: String, @Path("similar_type") similar_type: String)
    :Deferred<Response<SimilarProductByTypeResponse>>

    
    fun getProductVariantsBySlug(@Path("slug") slug: String)
    :Deferred<Response<ProductVariantsResponse>>

    
    fun getProductStockByIds()
    :Deferred<Response<ProductStockStatusResponse>>

    
    fun getProductStockForTimeByIds(@Query("timestamp") timestamp: String)
    :Deferred<Response<ProductStockPolling>>

    
    fun getProducts()
    :Deferred<Response<ProductListingResponse>>

    
    fun getBrands()
    :Deferred<Response<BrandListingResponse>>

    
    fun getBrandDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<BrandDetailResponse>>

    
    fun getCategories()
    :Deferred<Response<CategoryListingResponse>>

    
    fun getCategoryDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<CategoryMetaResponse>>

    
    fun getHomeProducts()
    :Deferred<Response<HomeListingResponse>>

    
    fun getDepartments()
    :Deferred<Response<DepartmentResponse>>

    
    fun getSearchResults(@Query("q") q: String)
    :Deferred<Response<AutoCompleteResponse>>

    
    fun addCollection()
    :Deferred<Response<CollectionDetailResponse>>

    
    fun getCollections()
    :Deferred<Response<GetCollectionListingResponse>>

    
    fun addCollectionItemsBySlug(@Path("slug") slug: String)
    :Deferred<Response<CollectionItemsResponse>>

    
    fun getCollectionItemsBySlug(@Path("slug") slug: String)
    :Deferred<Response<GetCollectionListingItemsResponse>>

    
    fun deleteCollectionDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<CollectionDetailViewDeleteResponse>>

    
    fun updateCollectionDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<CollectionsUpdateDetailResponse>>

    
    fun getCollectionDetailBySlug(@Path("slug") slug: String)
    :Deferred<Response<CollectionDetailResponse>>

    
    fun getFollowedListing(@Path("collection_type") collection_type: String)
    :Deferred<Response<GetFollowListingResponse>>

    
    fun unfollowById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    :Deferred<Response<FollowPostResponse>>

    
    fun followById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    :Deferred<Response<FollowPostResponse>>

    
    fun getFollowerCountById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: String)
    :Deferred<Response<FollowerCountResponse>>

    
    fun getFollowIds()
    :Deferred<Response<FollowIdsResponse>>

    

    
    fun getTicket(@Path("id") id: String)
    :Deferred<Response<Ticket>>

    
    fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    :Deferred<Response<TicketHistory>>

    
    fun createTicket()
    :Deferred<Response<Ticket>>

    
    fun getCustomForm(@Path("slug") slug: String)
    :Deferred<Response<CustomForm>>

    
    fun submitCustomForm(@Path("slug") slug: String)
    :Deferred<Response<SubmitCustomFormResponse>>

    
    fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    :Deferred<Response<GetParticipantsInsideVideoRoomResponse>>

    
    fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    :Deferred<Response<GetTokenForVideoRoomResponse>>

    

}