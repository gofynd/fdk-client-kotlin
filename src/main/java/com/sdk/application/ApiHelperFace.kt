package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*


interface CatalogApiHelperFace {
    
    fun getProductDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<ProductDetail>>
    
    fun getProductSizesBySlug( slug: String,
         store_id: String?=null
        
    )
    :Deferred<Response<ProductSizes>>
    
    fun getProductPriceBySlug( slug: String, size: String,
         pincode: Int?=null, store_id: String?=null
        
    )
    :Deferred<Response<ProductSizePriceResponse>>
    
    fun getProductSellersBySlug( slug: String, size: String,
         pincode: Int?=null, page_no: Int?=null, page_size: Int?=null
        
    )
    :Deferred<Response<ProductSizeSellersResponse>>
    
    fun getProductComparisonBySlugs( slug: String
        
        
    )
    :Deferred<Response<ProductsComparisonResponse>>
    
    fun getSimilarComparisonProductBySlug( slug: String
        
        
    )
    :Deferred<Response<ProductCompareResponse>>
    
    fun getComparedFrequentlyProductBySlug( slug: String
        
        
    )
    :Deferred<Response<ProductFrequentlyComparedSimilarResponse>>
    
    fun getProductSimilarByIdentifier( slug: String, similar_type: String
        
        
    )
    :Deferred<Response<SimilarProductByTypeResponse>>
    
    fun getProductVariantsBySlug( slug: String
        
        
    )
    :Deferred<Response<ProductVariantsResponse>>
    
    fun getProductStockByIds(
         item_id: String?=null, alu: String?=null, sku_code: String?=null, ean: String?=null, upc: String?=null
        
    )
    :Deferred<Response<ProductStockStatusResponse>>
    
    fun getProductStockForTimeByIds( timestamp: String,
         page_size: Int?=null, page_id: String?=null
        
    )
    :Deferred<Response<ProductStockPolling>>
    
    fun getProducts(
         q: String?=null, f: String?=null, filters: Boolean?=null, sort_on: String?=null, page_id: String?=null, page_size: Int?=null, page_no: Int?=null, page_type: String?=null
        
    )
    :Deferred<Response<ProductListingResponse>>
    
    fun getBrands(
         department: String?=null, page_no: Int?=null, page_size: Int?=null
        
    )
    :Deferred<Response<BrandListingResponse>>
    
    fun getBrandDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<BrandDetailResponse>>
    
    fun getCategories(
         department: String?=null
        
    )
    :Deferred<Response<CategoryListingResponse>>
    
    fun getCategoryDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<CategoryMetaResponse>>
    
    fun getHomeProducts(
         sort_on: String?=null, page_id: String?=null, page_size: Int?=null
        
    )
    :Deferred<Response<HomeListingResponse>>
    
    fun getDepartments(
        
        
    )
    :Deferred<Response<DepartmentResponse>>
    
    fun getSearchResults( q: String
        
        
    )
    :Deferred<Response<AutoCompleteResponse>>
    
    fun getCollections(
         page_id: String?=null, page_size: Int?=null
        
    )
    :Deferred<Response<GetCollectionListingResponse>>
    
    fun addCollection(
        
        body: CreateCollection
    )
    :Deferred<Response<CollectionDetailResponse>>
    
    fun getCollectionItemsBySlug( slug: String,
         f: String?=null, filters: Boolean?=null, sort_on: String?=null, page_id: String?=null, page_size: Int?=null
        
    )
    :Deferred<Response<GetCollectionListingItemsResponse>>
    
    fun addCollectionItemsBySlug( slug: String,
        
        body: CollectionItemsRequest
    )
    :Deferred<Response<CollectionItemsResponse>>
    
    fun deleteCollectionDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<CollectionDetailViewDeleteResponse>>
    
    fun getCollectionDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<CollectionDetailResponse>>
    
    fun updateCollectionDetailBySlug( slug: String
        
        
    )
    :Deferred<Response<CollectionsUpdateDetailResponse>>
    
    fun getFollowedListing( collection_type: String
        
        
    )
    :Deferred<Response<GetFollowListingResponse>>
    
    fun unfollowById( collection_type: String, collection_id: Int
        
        
    )
    :Deferred<Response<FollowPostResponse>>
    
    fun followById( collection_type: String, collection_id: Int
        
        
    )
    :Deferred<Response<FollowPostResponse>>
    
    fun getFollowerCountById( collection_type: String, collection_id: String
        
        
    )
    :Deferred<Response<FollowerCountResponse>>
    
    fun getFollowIds(
         collection_type: String?=null
        
    )
    :Deferred<Response<FollowIdsResponse>>
    
    fun getStores(
         page_no: Int?=null, page_size: Int?=null, q: String?=null, range: Int?=null, latitude: Double?=null, longitude: Double?=null
        
    )
    :Deferred<Response<StoreListingResponse>>
    
}

interface LeadApiHelperFace {
    
    fun getTicket( id: String
        
        
    )
    :Deferred<Response<Ticket>>
    
    fun createHistoryForTicket( ticket_id: String,
        
        body: TicketHistoryPayload
    )
    :Deferred<Response<TicketHistory>>
    
    fun createTicket(
        
        body: AddTicketPayload
    )
    :Deferred<Response<Ticket>>
    
    fun getCustomForm( slug: String
        
        
    )
    :Deferred<Response<CustomForm>>
    
    fun submitCustomForm( slug: String,
        
        body: CustomFormSubmissionPayload
    )
    :Deferred<Response<SubmitCustomFormResponse>>
    
    fun getParticipantsInsideVideoRoom( unique_name: String
        
        
    )
    :Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    fun getTokenForVideoRoom( unique_name: String
        
        
    )
    :Deferred<Response<GetTokenForVideoRoomResponse>>
    
}

interface ShareApiHelperFace {
    
    fun getApplicationQRCode(
        
        
    )
    :Deferred<Response<QRCodeResp>>
    
    fun getProductQRCodeBySlug( slug: String
        
        
    )
    :Deferred<Response<QRCodeResp>>
    
    fun getCollectionQRCodeBySlug( slug: String
        
        
    )
    :Deferred<Response<QRCodeResp>>
    
    fun getUrlQRCode( url: String
        
        
    )
    :Deferred<Response<QRCodeResp>>
    
    fun createShortLink(
        
        body: ShortLinkReq
    )
    :Deferred<Response<ShortLinkRes>>
    
    fun getShortLinkByHash( hash: String
        
        
    )
    :Deferred<Response<ShortLinkRes>>
    
    fun getOriginalShortLinkByHash( hash: String
        
        
    )
    :Deferred<Response<ShortLinkRes>>
    
}

