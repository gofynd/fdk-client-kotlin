package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

class CatalogDataManagerClass : CatalogDataManager {
    
    private val catalogApiHelperClass = CatalogApiHelperClass()
    
    override fun getProductDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductDetail>> {
        return catalogApiHelperClass.getProductDetailBySlug(slug = slug)
    }
    
    override fun getProductSizesBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductSizes>> {
        return catalogApiHelperClass.getProductSizesBySlug(slug = slug)
    }
    
    override fun getProductPriceBySlug(@Path("slug") slug: String, @Path("size") size: String)
    : Deferred<Response<ProductSizePriceResponse>> {
        return catalogApiHelperClass.getProductPriceBySlug(slug = slug, size = size)
    }
    
    override fun getProductSellersBySlug(@Path("slug") slug: String, @Path("size") size: String)
    : Deferred<Response<ProductSizeSellersResponse>> {
        return catalogApiHelperClass.getProductSellersBySlug(slug = slug, size = size)
    }
    
    override fun getProductComparisonBySlugs(@Query("slug") slug: String)
    : Deferred<Response<ProductsComparisonResponse>> {
        return catalogApiHelperClass.getProductComparisonBySlugs(slug = slug)
    }
    
    override fun getSimilarComparisonProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductCompareResponse>> {
        return catalogApiHelperClass.getSimilarComparisonProductBySlug(slug = slug)
    }
    
    override fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>> {
        return catalogApiHelperClass.getComparedFrequentlyProductBySlug(slug = slug)
    }
    
    override fun getProductSimilarByIdentifier(@Path("slug") slug: String, @Path("similar_type") similar_type: String)
    : Deferred<Response<SimilarProductByTypeResponse>> {
        return catalogApiHelperClass.getProductSimilarByIdentifier(slug = slug, similar_type = similar_type)
    }
    
    override fun getProductVariantsBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductVariantsResponse>> {
        return catalogApiHelperClass.getProductVariantsBySlug(slug = slug)
    }
    
    override fun getProductStockByIds()
    : Deferred<Response<ProductStockStatusResponse>> {
        return catalogApiHelperClass.getProductStockByIds()
    }
    
    override fun getProductStockForTimeByIds(@Query("timestamp") timestamp: String)
    : Deferred<Response<ProductStockPolling>> {
        return catalogApiHelperClass.getProductStockForTimeByIds(timestamp = timestamp)
    }
    
    override fun getProducts()
    : Deferred<Response<ProductListingResponse>> {
        return catalogApiHelperClass.getProducts()
    }
    
    override fun getBrands()
    : Deferred<Response<BrandListingResponse>> {
        return catalogApiHelperClass.getBrands()
    }
    
    override fun getBrandDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<BrandDetailResponse>> {
        return catalogApiHelperClass.getBrandDetailBySlug(slug = slug)
    }
    
    override fun getCategories()
    : Deferred<Response<CategoryListingResponse>> {
        return catalogApiHelperClass.getCategories()
    }
    
    override fun getCategoryDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CategoryMetaResponse>> {
        return catalogApiHelperClass.getCategoryDetailBySlug(slug = slug)
    }
    
    override fun getHomeProducts()
    : Deferred<Response<HomeListingResponse>> {
        return catalogApiHelperClass.getHomeProducts()
    }
    
    override fun getDepartments()
    : Deferred<Response<DepartmentResponse>> {
        return catalogApiHelperClass.getDepartments()
    }
    
    override fun getSearchResults(@Query("q") q: String)
    : Deferred<Response<AutoCompleteResponse>> {
        return catalogApiHelperClass.getSearchResults(q = q)
    }
    
    override fun getCollections()
    : Deferred<Response<GetCollectionListingResponse>> {
        return catalogApiHelperClass.getCollections()
    }
    
    override fun addCollection()
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogApiHelperClass.addCollection()
    }
    
    override fun getCollectionItemsBySlug(@Path("slug") slug: String)
    : Deferred<Response<GetCollectionListingItemsResponse>> {
        return catalogApiHelperClass.getCollectionItemsBySlug(slug = slug)
    }
    
    override fun addCollectionItemsBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionItemsResponse>> {
        return catalogApiHelperClass.addCollectionItemsBySlug(slug = slug)
    }
    
    override fun updateCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionsUpdateDetailResponse>> {
        return catalogApiHelperClass.updateCollectionDetailBySlug(slug = slug)
    }
    
    override fun deleteCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailViewDeleteResponse>> {
        return catalogApiHelperClass.deleteCollectionDetailBySlug(slug = slug)
    }
    
    override fun getCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogApiHelperClass.getCollectionDetailBySlug(slug = slug)
    }
    
    override fun getFollowedListing(@Path("collection_type") collection_type: String)
    : Deferred<Response<GetFollowListingResponse>> {
        return catalogApiHelperClass.getFollowedListing(collection_type = collection_type)
    }
    
    override fun unfollowById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiHelperClass.unfollowById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun followById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiHelperClass.followById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun getFollowerCountById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: String)
    : Deferred<Response<FollowerCountResponse>> {
        return catalogApiHelperClass.getFollowerCountById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun getFollowIds()
    : Deferred<Response<FollowIdsResponse>> {
        return catalogApiHelperClass.getFollowIds()
    }
    
    override fun getStores()
    : Deferred<Response<StoreListingResponse>> {
        return catalogApiHelperClass.getStores()
    }
    
}

class LeadDataManagerClass : LeadDataManager {
    
    private val leadApiHelperClass = LeadApiHelperClass()
    
    override fun getTicket(@Path("id") id: String)
    : Deferred<Response<Ticket>> {
        return leadApiHelperClass.getTicket(id = id)
    }
    
    override fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    : Deferred<Response<TicketHistory>> {
        return leadApiHelperClass.createHistoryForTicket(ticket_id = ticket_id)
    }
    
    override fun createTicket()
    : Deferred<Response<Ticket>> {
        return leadApiHelperClass.createTicket()
    }
    
    override fun getCustomForm(@Path("slug") slug: String)
    : Deferred<Response<CustomForm>> {
        return leadApiHelperClass.getCustomForm(slug = slug)
    }
    
    override fun submitCustomForm(@Path("slug") slug: String)
    : Deferred<Response<SubmitCustomFormResponse>> {
        return leadApiHelperClass.submitCustomForm(slug = slug)
    }
    
    override fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>> {
        return leadApiHelperClass.getParticipantsInsideVideoRoom(unique_name = unique_name)
    }
    
    override fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>> {
        return leadApiHelperClass.getTokenForVideoRoom(unique_name = unique_name)
    }
    
}

class ShareDataManagerClass : ShareDataManager {
    
    private val shareApiHelperClass = ShareApiHelperClass()
    
    override fun getApplicationQRCode()
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getApplicationQRCode()
    }
    
    override fun getProductQRCodeBySlug(@Path("slug") slug: String)
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getProductQRCodeBySlug(slug = slug)
    }
    
    override fun getCollectionQRCodeBySlug(@Path("slug") slug: String)
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getCollectionQRCodeBySlug(slug = slug)
    }
    
    override fun getUrlQRCode(@Query("url") url: String)
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getUrlQRCode(url = url)
    }
    
    override fun createShortLink()
    : Deferred<Response<ShortLinkRes>> {
        return shareApiHelperClass.createShortLink()
    }
    
    override fun getShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>> {
        return shareApiHelperClass.getShortLinkByHash(hash = hash)
    }
    
    override fun getOriginalShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>> {
        return shareApiHelperClass.getOriginalShortLinkByHash(hash = hash)
    }
    
}

