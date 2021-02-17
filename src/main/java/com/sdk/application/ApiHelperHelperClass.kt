package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*
import javax.inject.Inject

class ApiHelperHelperClass @Inject constructor(private val apiList: ApiList) : ApiHelperFace  {

    
    override fun getProductDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductDetail>> {
        return apiList.getProductDetailBySlug(slug = slug)
    }
    
    override fun getProductSizesBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductSizes>> {
        return apiList.getProductSizesBySlug(slug = slug)
    }
    
    override fun getProductPriceBySlug(@Path("slug") slug: String, @Path("size") size: String)
    : Deferred<Response<ProductSizePriceResponse>> {
        return apiList.getProductPriceBySlug(slug = slug, size = size)
    }
    
    override fun getProductSellersBySlug(@Path("slug") slug: String, @Path("size") size: String)
    : Deferred<Response<ProductSizeSellersResponse>> {
        return apiList.getProductSellersBySlug(slug = slug, size = size)
    }
    
    override fun getProductComparisonBySlugs(@Query("slug") slug: String)
    : Deferred<Response<ProductsComparisonResponse>> {
        return apiList.getProductComparisonBySlugs(slug = slug)
    }
    
    override fun getSimilarComparisonProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductCompareResponse>> {
        return apiList.getSimilarComparisonProductBySlug(slug = slug)
    }
    
    override fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>> {
        return apiList.getComparedFrequentlyProductBySlug(slug = slug)
    }
    
    override fun getProductSimilarByIdentifier(@Path("slug") slug: String, @Path("similar_type") similar_type: String)
    : Deferred<Response<SimilarProductByTypeResponse>> {
        return apiList.getProductSimilarByIdentifier(slug = slug, similar_type = similar_type)
    }
    
    override fun getProductVariantsBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductVariantsResponse>> {
        return apiList.getProductVariantsBySlug(slug = slug)
    }
    
    override fun getProductStockByIds()
    : Deferred<Response<ProductStockStatusResponse>> {
        return apiList.getProductStockByIds()
    }
    
    override fun getProductStockForTimeByIds(@Query("timestamp") timestamp: String)
    : Deferred<Response<ProductStockPolling>> {
        return apiList.getProductStockForTimeByIds(timestamp = timestamp)
    }
    
    override fun getProducts()
    : Deferred<Response<ProductListingResponse>> {
        return apiList.getProducts()
    }
    
    override fun getBrands()
    : Deferred<Response<BrandListingResponse>> {
        return apiList.getBrands()
    }
    
    override fun getBrandDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<BrandDetailResponse>> {
        return apiList.getBrandDetailBySlug(slug = slug)
    }
    
    override fun getCategories()
    : Deferred<Response<CategoryListingResponse>> {
        return apiList.getCategories()
    }
    
    override fun getCategoryDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CategoryMetaResponse>> {
        return apiList.getCategoryDetailBySlug(slug = slug)
    }
    
    override fun getHomeProducts()
    : Deferred<Response<HomeListingResponse>> {
        return apiList.getHomeProducts()
    }
    
    override fun getDepartments()
    : Deferred<Response<DepartmentResponse>> {
        return apiList.getDepartments()
    }
    
    override fun getSearchResults(@Query("q") q: String)
    : Deferred<Response<AutoCompleteResponse>> {
        return apiList.getSearchResults(q = q)
    }
    
    override fun addCollection()
    : Deferred<Response<CollectionDetailResponse>> {
        return apiList.addCollection()
    }
    
    override fun getCollections()
    : Deferred<Response<GetCollectionListingResponse>> {
        return apiList.getCollections()
    }
    
    override fun addCollectionItemsBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionItemsResponse>> {
        return apiList.addCollectionItemsBySlug(slug = slug)
    }
    
    override fun getCollectionItemsBySlug(@Path("slug") slug: String)
    : Deferred<Response<GetCollectionListingItemsResponse>> {
        return apiList.getCollectionItemsBySlug(slug = slug)
    }
    
    override fun deleteCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailViewDeleteResponse>> {
        return apiList.deleteCollectionDetailBySlug(slug = slug)
    }
    
    override fun updateCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionsUpdateDetailResponse>> {
        return apiList.updateCollectionDetailBySlug(slug = slug)
    }
    
    override fun getCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>> {
        return apiList.getCollectionDetailBySlug(slug = slug)
    }
    
    override fun getFollowedListing(@Path("collection_type") collection_type: String)
    : Deferred<Response<GetFollowListingResponse>> {
        return apiList.getFollowedListing(collection_type = collection_type)
    }
    
    override fun unfollowById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    : Deferred<Response<FollowPostResponse>> {
        return apiList.unfollowById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun followById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    : Deferred<Response<FollowPostResponse>> {
        return apiList.followById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun getFollowerCountById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: String)
    : Deferred<Response<FollowerCountResponse>> {
        return apiList.getFollowerCountById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun getFollowIds()
    : Deferred<Response<FollowIdsResponse>> {
        return apiList.getFollowIds()
    }
    

    
    override fun getTicket(@Path("id") id: String)
    : Deferred<Response<Ticket>> {
        return apiList.getTicket(id = id)
    }
    
    override fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    : Deferred<Response<TicketHistory>> {
        return apiList.createHistoryForTicket(ticket_id = ticket_id)
    }
    
    override fun createTicket()
    : Deferred<Response<Ticket>> {
        return apiList.createTicket()
    }
    
    override fun getCustomForm(@Path("slug") slug: String)
    : Deferred<Response<CustomForm>> {
        return apiList.getCustomForm(slug = slug)
    }
    
    override fun submitCustomForm(@Path("slug") slug: String)
    : Deferred<Response<SubmitCustomFormResponse>> {
        return apiList.submitCustomForm(slug = slug)
    }
    
    override fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>> {
        return apiList.getParticipantsInsideVideoRoom(unique_name = unique_name)
    }
    
    override fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>> {
        return apiList.getTokenForVideoRoom(unique_name = unique_name)
    }
    

}