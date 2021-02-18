package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

class CatalogDataManagerClass : CatalogDataManager {
    
    private val catalogApiHelperClass = CatalogApiHelperClass()
    
    override fun getProductDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<ProductDetail>> {
        return catalogApiHelperClass.getProductDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getProductSizesBySlug( slug: String,
         store_id: String?
        
    )
    : Deferred<Response<ProductSizes>> {
        return catalogApiHelperClass.getProductSizesBySlug(
        slug = slug,
        store_id = store_id
        
        )
    }
    
    override fun getProductPriceBySlug( slug: String, size: String,
         pincode: Int?, store_id: String?
        
    )
    : Deferred<Response<ProductSizePriceResponse>> {
        return catalogApiHelperClass.getProductPriceBySlug(
        slug = slug,size = size,
        pincode = pincode,store_id = store_id
        
        )
    }
    
    override fun getProductSellersBySlug( slug: String, size: String,
         pincode: Int?, page_no: Int?, page_size: Int?
        
    )
    : Deferred<Response<ProductSizeSellersResponse>> {
        return catalogApiHelperClass.getProductSellersBySlug(
        slug = slug,size = size,
        pincode = pincode,page_no = page_no,page_size = page_size
        
        )
    }
    
    override fun getProductComparisonBySlugs( slug: String
        
        
    )
    : Deferred<Response<ProductsComparisonResponse>> {
        return catalogApiHelperClass.getProductComparisonBySlugs(
        slug = slug
        
        
        )
    }
    
    override fun getSimilarComparisonProductBySlug( slug: String
        
        
    )
    : Deferred<Response<ProductCompareResponse>> {
        return catalogApiHelperClass.getSimilarComparisonProductBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getComparedFrequentlyProductBySlug( slug: String
        
        
    )
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>> {
        return catalogApiHelperClass.getComparedFrequentlyProductBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getProductSimilarByIdentifier( slug: String, similar_type: String
        
        
    )
    : Deferred<Response<SimilarProductByTypeResponse>> {
        return catalogApiHelperClass.getProductSimilarByIdentifier(
        slug = slug,similar_type = similar_type
        
        
        )
    }
    
    override fun getProductVariantsBySlug( slug: String
        
        
    )
    : Deferred<Response<ProductVariantsResponse>> {
        return catalogApiHelperClass.getProductVariantsBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getProductStockByIds(
         item_id: String?, alu: String?, sku_code: String?, ean: String?, upc: String?
        
    )
    : Deferred<Response<ProductStockStatusResponse>> {
        return catalogApiHelperClass.getProductStockByIds(
        
        item_id = item_id,alu = alu,sku_code = sku_code,ean = ean,upc = upc
        
        )
    }
    
    override fun getProductStockForTimeByIds( timestamp: String,
         page_size: Int?, page_id: String?
        
    )
    : Deferred<Response<ProductStockPolling>> {
        return catalogApiHelperClass.getProductStockForTimeByIds(
        timestamp = timestamp,
        page_size = page_size,page_id = page_id
        
        )
    }
    
    override fun getProducts(
         q: String?, f: String?, filters: Boolean?, sort_on: String?, page_id: String?, page_size: Int?, page_no: Int?, page_type: String?
        
    )
    : Deferred<Response<ProductListingResponse>> {
        return catalogApiHelperClass.getProducts(
        
        q = q,f = f,filters = filters,sort_on = sort_on,page_id = page_id,page_size = page_size,page_no = page_no,page_type = page_type
        
        )
    }
    
    override fun getBrands(
         department: String?, page_no: Int?, page_size: Int?
        
    )
    : Deferred<Response<BrandListingResponse>> {
        return catalogApiHelperClass.getBrands(
        
        department = department,page_no = page_no,page_size = page_size
        
        )
    }
    
    override fun getBrandDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<BrandDetailResponse>> {
        return catalogApiHelperClass.getBrandDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getCategories(
         department: String?
        
    )
    : Deferred<Response<CategoryListingResponse>> {
        return catalogApiHelperClass.getCategories(
        
        department = department
        
        )
    }
    
    override fun getCategoryDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<CategoryMetaResponse>> {
        return catalogApiHelperClass.getCategoryDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getHomeProducts(
         sort_on: String?, page_id: String?, page_size: Int?
        
    )
    : Deferred<Response<HomeListingResponse>> {
        return catalogApiHelperClass.getHomeProducts(
        
        sort_on = sort_on,page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun getDepartments(
        
        
    )
    : Deferred<Response<DepartmentResponse>> {
        return catalogApiHelperClass.getDepartments(
        
        
        
        )
    }
    
    override fun getSearchResults( q: String
        
        
    )
    : Deferred<Response<AutoCompleteResponse>> {
        return catalogApiHelperClass.getSearchResults(
        q = q
        
        
        )
    }
    
    override fun getCollections(
         page_id: String?, page_size: Int?
        
    )
    : Deferred<Response<GetCollectionListingResponse>> {
        return catalogApiHelperClass.getCollections(
        
        page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun addCollection(
        
        body: CreateCollection
    )
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogApiHelperClass.addCollection(
        
        
        body = body
        )
    }
    
    override fun getCollectionItemsBySlug( slug: String,
         f: String?, filters: Boolean?, sort_on: String?, page_id: String?, page_size: Int?
        
    )
    : Deferred<Response<GetCollectionListingItemsResponse>> {
        return catalogApiHelperClass.getCollectionItemsBySlug(
        slug = slug,
        f = f,filters = filters,sort_on = sort_on,page_id = page_id,page_size = page_size
        
        )
    }
    
    override fun addCollectionItemsBySlug( slug: String,
        
        body: CollectionItemsRequest
    )
    : Deferred<Response<CollectionItemsResponse>> {
        return catalogApiHelperClass.addCollectionItemsBySlug(
        slug = slug,
        
        body = body
        )
    }
    
    override fun updateCollectionDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<CollectionsUpdateDetailResponse>> {
        return catalogApiHelperClass.updateCollectionDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun deleteCollectionDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<CollectionDetailViewDeleteResponse>> {
        return catalogApiHelperClass.deleteCollectionDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getCollectionDetailBySlug( slug: String
        
        
    )
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogApiHelperClass.getCollectionDetailBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getFollowedListing( collection_type: String
        
        
    )
    : Deferred<Response<GetFollowListingResponse>> {
        return catalogApiHelperClass.getFollowedListing(
        collection_type = collection_type
        
        
        )
    }
    
    override fun unfollowById( collection_type: String, collection_id: Int
        
        
    )
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiHelperClass.unfollowById(
        collection_type = collection_type,collection_id = collection_id
        
        
        )
    }
    
    override fun followById( collection_type: String, collection_id: Int
        
        
    )
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiHelperClass.followById(
        collection_type = collection_type,collection_id = collection_id
        
        
        )
    }
    
    override fun getFollowerCountById( collection_type: String, collection_id: String
        
        
    )
    : Deferred<Response<FollowerCountResponse>> {
        return catalogApiHelperClass.getFollowerCountById(
        collection_type = collection_type,collection_id = collection_id
        
        
        )
    }
    
    override fun getFollowIds(
         collection_type: String?
        
    )
    : Deferred<Response<FollowIdsResponse>> {
        return catalogApiHelperClass.getFollowIds(
        
        collection_type = collection_type
        
        )
    }
    
    override fun getStores(
         page_no: Int?, page_size: Int?, q: String?, range: Int?, latitude: Double?, longitude: Double?
        
    )
    : Deferred<Response<StoreListingResponse>> {
        return catalogApiHelperClass.getStores(
        
        page_no = page_no,page_size = page_size,q = q,range = range,latitude = latitude,longitude = longitude
        
        )
    }
    
}

class LeadDataManagerClass : LeadDataManager {
    
    private val leadApiHelperClass = LeadApiHelperClass()
    
    override fun getTicket( id: String
        
        
    )
    : Deferred<Response<Ticket>> {
        return leadApiHelperClass.getTicket(
        id = id
        
        
        )
    }
    
    override fun createHistoryForTicket( ticket_id: String,
        
        body: TicketHistoryPayload
    )
    : Deferred<Response<TicketHistory>> {
        return leadApiHelperClass.createHistoryForTicket(
        ticket_id = ticket_id,
        
        body = body
        )
    }
    
    override fun createTicket(
        
        body: AddTicketPayload
    )
    : Deferred<Response<Ticket>> {
        return leadApiHelperClass.createTicket(
        
        
        body = body
        )
    }
    
    override fun getCustomForm( slug: String
        
        
    )
    : Deferred<Response<CustomForm>> {
        return leadApiHelperClass.getCustomForm(
        slug = slug
        
        
        )
    }
    
    override fun submitCustomForm( slug: String,
        
        body: CustomFormSubmissionPayload
    )
    : Deferred<Response<SubmitCustomFormResponse>> {
        return leadApiHelperClass.submitCustomForm(
        slug = slug,
        
        body = body
        )
    }
    
    override fun getParticipantsInsideVideoRoom( unique_name: String
        
        
    )
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>> {
        return leadApiHelperClass.getParticipantsInsideVideoRoom(
        unique_name = unique_name
        
        
        )
    }
    
    override fun getTokenForVideoRoom( unique_name: String
        
        
    )
    : Deferred<Response<GetTokenForVideoRoomResponse>> {
        return leadApiHelperClass.getTokenForVideoRoom(
        unique_name = unique_name
        
        
        )
    }
    
}

class ShareDataManagerClass : ShareDataManager {
    
    private val shareApiHelperClass = ShareApiHelperClass()
    
    override fun getApplicationQRCode(
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getApplicationQRCode(
        
        
        
        )
    }
    
    override fun getProductQRCodeBySlug( slug: String
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getProductQRCodeBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getCollectionQRCodeBySlug( slug: String
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getCollectionQRCodeBySlug(
        slug = slug
        
        
        )
    }
    
    override fun getUrlQRCode( url: String
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiHelperClass.getUrlQRCode(
        url = url
        
        
        )
    }
    
    override fun createShortLink(
        
        body: ShortLinkReq
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiHelperClass.createShortLink(
        
        
        body = body
        )
    }
    
    override fun getShortLinkByHash( hash: String
        
        
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiHelperClass.getShortLinkByHash(
        hash = hash
        
        
        )
    }
    
    override fun getOriginalShortLinkByHash( hash: String
        
        
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiHelperClass.getOriginalShortLinkByHash(
        hash = hash
        
        
        )
    }
    
}

