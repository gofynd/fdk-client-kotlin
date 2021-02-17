package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*
import javax.inject.Inject


class CatalogApiHelperClass : CatalogApiHelperFace  {
    
   private val catalogRetrofitApiList = SDK.catalogRetrofitApiList
    
    override fun getProductDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductDetail>> {
        return catalogRetrofitApiList.getProductDetailBySlug(slug = slug)
    }
    
    override fun getProductSizesBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductSizes>> {
        return catalogRetrofitApiList.getProductSizesBySlug(slug = slug)
    }
    
    override fun getProductPriceBySlug(@Path("slug") slug: String, @Path("size") size: String)
    : Deferred<Response<ProductSizePriceResponse>> {
        return catalogRetrofitApiList.getProductPriceBySlug(slug = slug, size = size)
    }
    
    override fun getProductSellersBySlug(@Path("slug") slug: String, @Path("size") size: String)
    : Deferred<Response<ProductSizeSellersResponse>> {
        return catalogRetrofitApiList.getProductSellersBySlug(slug = slug, size = size)
    }
    
    override fun getProductComparisonBySlugs(@Query("slug") slug: String)
    : Deferred<Response<ProductsComparisonResponse>> {
        return catalogRetrofitApiList.getProductComparisonBySlugs(slug = slug)
    }
    
    override fun getSimilarComparisonProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductCompareResponse>> {
        return catalogRetrofitApiList.getSimilarComparisonProductBySlug(slug = slug)
    }
    
    override fun getComparedFrequentlyProductBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>> {
        return catalogRetrofitApiList.getComparedFrequentlyProductBySlug(slug = slug)
    }
    
    override fun getProductSimilarByIdentifier(@Path("slug") slug: String, @Path("similar_type") similar_type: String)
    : Deferred<Response<SimilarProductByTypeResponse>> {
        return catalogRetrofitApiList.getProductSimilarByIdentifier(slug = slug, similar_type = similar_type)
    }
    
    override fun getProductVariantsBySlug(@Path("slug") slug: String)
    : Deferred<Response<ProductVariantsResponse>> {
        return catalogRetrofitApiList.getProductVariantsBySlug(slug = slug)
    }
    
    override fun getProductStockByIds()
    : Deferred<Response<ProductStockStatusResponse>> {
        return catalogRetrofitApiList.getProductStockByIds()
    }
    
    override fun getProductStockForTimeByIds(@Query("timestamp") timestamp: String)
    : Deferred<Response<ProductStockPolling>> {
        return catalogRetrofitApiList.getProductStockForTimeByIds(timestamp = timestamp)
    }
    
    override fun getProducts()
    : Deferred<Response<ProductListingResponse>> {
        return catalogRetrofitApiList.getProducts()
    }
    
    override fun getBrands()
    : Deferred<Response<BrandListingResponse>> {
        return catalogRetrofitApiList.getBrands()
    }
    
    override fun getBrandDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<BrandDetailResponse>> {
        return catalogRetrofitApiList.getBrandDetailBySlug(slug = slug)
    }
    
    override fun getCategories()
    : Deferred<Response<CategoryListingResponse>> {
        return catalogRetrofitApiList.getCategories()
    }
    
    override fun getCategoryDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CategoryMetaResponse>> {
        return catalogRetrofitApiList.getCategoryDetailBySlug(slug = slug)
    }
    
    override fun getHomeProducts()
    : Deferred<Response<HomeListingResponse>> {
        return catalogRetrofitApiList.getHomeProducts()
    }
    
    override fun getDepartments()
    : Deferred<Response<DepartmentResponse>> {
        return catalogRetrofitApiList.getDepartments()
    }
    
    override fun getSearchResults(@Query("q") q: String)
    : Deferred<Response<AutoCompleteResponse>> {
        return catalogRetrofitApiList.getSearchResults(q = q)
    }
    
    override fun getCollections()
    : Deferred<Response<GetCollectionListingResponse>> {
        return catalogRetrofitApiList.getCollections()
    }
    
    override fun addCollection()
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogRetrofitApiList.addCollection()
    }
    
    override fun getCollectionItemsBySlug(@Path("slug") slug: String)
    : Deferred<Response<GetCollectionListingItemsResponse>> {
        return catalogRetrofitApiList.getCollectionItemsBySlug(slug = slug)
    }
    
    override fun addCollectionItemsBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionItemsResponse>> {
        return catalogRetrofitApiList.addCollectionItemsBySlug(slug = slug)
    }
    
    override fun updateCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionsUpdateDetailResponse>> {
        return catalogRetrofitApiList.updateCollectionDetailBySlug(slug = slug)
    }
    
    override fun getCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogRetrofitApiList.getCollectionDetailBySlug(slug = slug)
    }
    
    override fun deleteCollectionDetailBySlug(@Path("slug") slug: String)
    : Deferred<Response<CollectionDetailViewDeleteResponse>> {
        return catalogRetrofitApiList.deleteCollectionDetailBySlug(slug = slug)
    }
    
    override fun getFollowedListing(@Path("collection_type") collection_type: String)
    : Deferred<Response<GetFollowListingResponse>> {
        return catalogRetrofitApiList.getFollowedListing(collection_type = collection_type)
    }
    
    override fun followById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    : Deferred<Response<FollowPostResponse>> {
        return catalogRetrofitApiList.followById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun unfollowById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: Int)
    : Deferred<Response<FollowPostResponse>> {
        return catalogRetrofitApiList.unfollowById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun getFollowerCountById(@Path("collection_type") collection_type: String, @Path("collection_id") collection_id: String)
    : Deferred<Response<FollowerCountResponse>> {
        return catalogRetrofitApiList.getFollowerCountById(collection_type = collection_type, collection_id = collection_id)
    }
    
    override fun getFollowIds()
    : Deferred<Response<FollowIdsResponse>> {
        return catalogRetrofitApiList.getFollowIds()
    }
    
    override fun getStores()
    : Deferred<Response<StoreListingResponse>> {
        return catalogRetrofitApiList.getStores()
    }
    
}

class LeadApiHelperClass : LeadApiHelperFace  {
    
   private val leadRetrofitApiList = SDK.leadRetrofitApiList
    
    override fun getTicket(@Path("id") id: String)
    : Deferred<Response<Ticket>> {
        return leadRetrofitApiList.getTicket(id = id)
    }
    
    override fun createHistoryForTicket(@Path("ticket_id") ticket_id: String)
    : Deferred<Response<TicketHistory>> {
        return leadRetrofitApiList.createHistoryForTicket(ticket_id = ticket_id)
    }
    
    override fun createTicket()
    : Deferred<Response<Ticket>> {
        return leadRetrofitApiList.createTicket()
    }
    
    override fun getCustomForm(@Path("slug") slug: String)
    : Deferred<Response<CustomForm>> {
        return leadRetrofitApiList.getCustomForm(slug = slug)
    }
    
    override fun submitCustomForm(@Path("slug") slug: String)
    : Deferred<Response<SubmitCustomFormResponse>> {
        return leadRetrofitApiList.submitCustomForm(slug = slug)
    }
    
    override fun getParticipantsInsideVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>> {
        return leadRetrofitApiList.getParticipantsInsideVideoRoom(unique_name = unique_name)
    }
    
    override fun getTokenForVideoRoom(@Path("unique_name") unique_name: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>> {
        return leadRetrofitApiList.getTokenForVideoRoom(unique_name = unique_name)
    }
    
}

class ShareApiHelperClass : ShareApiHelperFace  {
    
   private val shareRetrofitApiList = SDK.shareRetrofitApiList
    
    override fun getApplicationQRCode()
    : Deferred<Response<QRCodeResp>> {
        return shareRetrofitApiList.getApplicationQRCode()
    }
    
    override fun getProductQRCodeBySlug(@Path("slug") slug: String)
    : Deferred<Response<QRCodeResp>> {
        return shareRetrofitApiList.getProductQRCodeBySlug(slug = slug)
    }
    
    override fun getCollectionQRCodeBySlug(@Path("slug") slug: String)
    : Deferred<Response<QRCodeResp>> {
        return shareRetrofitApiList.getCollectionQRCodeBySlug(slug = slug)
    }
    
    override fun getUrlQRCode(@Query("url") url: String)
    : Deferred<Response<QRCodeResp>> {
        return shareRetrofitApiList.getUrlQRCode(url = url)
    }
    
    override fun createShortLink()
    : Deferred<Response<ShortLinkRes>> {
        return shareRetrofitApiList.createShortLink()
    }
    
    override fun getShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>> {
        return shareRetrofitApiList.getShortLinkByHash(hash = hash)
    }
    
    override fun getOriginalShortLinkByHash(@Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>> {
        return shareRetrofitApiList.getOriginalShortLinkByHash(hash = hash)
    }
    
}
