package com.sdk.application

import com.sdk.common.HeaderInterceptor
import com.sdk.common.HttpClient
import com.sdk.common.NetworkUtils
import com.sdk.common.RequestSignerInterceptor
import kotlinx.coroutines.Deferred
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class CatalogApiHelperClass(val config: ApplicationConfig) : CatalogApiHelperFace  {
    
   private val catalogApiList: CatalogApiList by lazy {
        generatecatalogApiList()
    }

    
    override fun getProductDetailBySlug(
         slug: String
        
        
    )
    : Deferred<Response<ProductDetail>> {
        return catalogApiList.getProductDetailBySlug(
            slug = slug
            
            
        )
    }
    
    override fun getProductSizesBySlug(
         slug: String,
         store_id: String?
        
    )
    : Deferred<Response<ProductSizes>> {
        return catalogApiList.getProductSizesBySlug(
            slug = slug,
            store_id = store_id
            
        )
    }
    
    override fun getProductPriceBySlug(
         slug: String, size: String,
         pincode: Int?, store_id: String?
        
    )
    : Deferred<Response<ProductSizePriceResponse>> {
        return catalogApiList.getProductPriceBySlug(
            slug = slug,size = size,
            pincode = pincode,store_id = store_id
            
        )
    }
    
    override fun getProductSellersBySlug(
         slug: String, size: String,
         pincode: Int?, page_no: Int?, page_size: Int?
        
    )
    : Deferred<Response<ProductSizeSellersResponse>> {
        return catalogApiList.getProductSellersBySlug(
            slug = slug,size = size,
            pincode = pincode,page_no = page_no,page_size = page_size
            
        )
    }
    
    override fun getProductComparisonBySlugs(
         slug: String
        
        
    )
    : Deferred<Response<ProductsComparisonResponse>> {
        return catalogApiList.getProductComparisonBySlugs(
            slug = slug
            
            
        )
    }
    
    override fun getSimilarComparisonProductBySlug(
         slug: String
        
        
    )
    : Deferred<Response<ProductCompareResponse>> {
        return catalogApiList.getSimilarComparisonProductBySlug(
            slug = slug
            
            
        )
    }
    
    override fun getComparedFrequentlyProductBySlug(
         slug: String
        
        
    )
    : Deferred<Response<ProductFrequentlyComparedSimilarResponse>> {
        return catalogApiList.getComparedFrequentlyProductBySlug(
            slug = slug
            
            
        )
    }
    
    override fun getProductSimilarByIdentifier(
         slug: String, similar_type: String
        
        
    )
    : Deferred<Response<SimilarProductByTypeResponse>> {
        return catalogApiList.getProductSimilarByIdentifier(
            slug = slug,similar_type = similar_type
            
            
        )
    }
    
    override fun getProductVariantsBySlug(
         slug: String
        
        
    )
    : Deferred<Response<ProductVariantsResponse>> {
        return catalogApiList.getProductVariantsBySlug(
            slug = slug
            
            
        )
    }
    
    override fun getProductStockByIds(
        
         item_id: String?, alu: String?, sku_code: String?, ean: String?, upc: String?
        
    )
    : Deferred<Response<ProductStockStatusResponse>> {
        return catalogApiList.getProductStockByIds(
            
            item_id = item_id,alu = alu,sku_code = sku_code,ean = ean,upc = upc
            
        )
    }
    
    override fun getProductStockForTimeByIds(
         timestamp: String,
         page_size: Int?, page_id: String?
        
    )
    : Deferred<Response<ProductStockPolling>> {
        return catalogApiList.getProductStockForTimeByIds(
            timestamp = timestamp,
            page_size = page_size,page_id = page_id
            
        )
    }
    
    override fun getProducts(
        
         q: String?, f: String?, filters: Boolean?, sort_on: String?, page_id: String?, page_size: Int?, page_no: Int?, page_type: String?
        
    )
    : Deferred<Response<ProductListingResponse>> {
        return catalogApiList.getProducts(
            
            q = q,f = f,filters = filters,sort_on = sort_on,page_id = page_id,page_size = page_size,page_no = page_no,page_type = page_type
            
        )
    }
    
    override fun getBrands(
        
         department: String?, page_no: Int?, page_size: Int?
        
    )
    : Deferred<Response<BrandListingResponse>> {
        return catalogApiList.getBrands(
            
            department = department,page_no = page_no,page_size = page_size
            
        )
    }
    
    override fun getBrandDetailBySlug(
         slug: String
        
        
    )
    : Deferred<Response<BrandDetailResponse>> {
        return catalogApiList.getBrandDetailBySlug(
            slug = slug
            
            
        )
    }
    
    override fun getCategories(
        
         department: String?
        
    )
    : Deferred<Response<CategoryListingResponse>> {
        return catalogApiList.getCategories(
            
            department = department
            
        )
    }
    
    override fun getCategoryDetailBySlug(
         slug: String
        
        
    )
    : Deferred<Response<CategoryMetaResponse>> {
        return catalogApiList.getCategoryDetailBySlug(
            slug = slug
            
            
        )
    }
    
    override fun getHomeProducts(
        
         sort_on: String?, page_id: String?, page_size: Int?
        
    )
    : Deferred<Response<HomeListingResponse>> {
        return catalogApiList.getHomeProducts(
            
            sort_on = sort_on,page_id = page_id,page_size = page_size
            
        )
    }
    
    override fun getDepartments(
        
        
        
    )
    : Deferred<Response<DepartmentResponse>> {
        return catalogApiList.getDepartments(
            
            
            
        )
    }
    
    override fun getSearchResults(
         q: String
        
        
    )
    : Deferred<Response<AutoCompleteResponse>> {
        return catalogApiList.getSearchResults(
            q = q
            
            
        )
    }
    
    override fun addCollection(
        
        
        body: CreateCollection
    )
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogApiList.addCollection(
            
            
            body = body
        )
    }
    
    override fun getCollections(
        
         page_id: String?, page_size: Int?
        
    )
    : Deferred<Response<GetCollectionListingResponse>> {
        return catalogApiList.getCollections(
            
            page_id = page_id,page_size = page_size
            
        )
    }
    
    override fun addCollectionItemsBySlug(
         slug: String,
        
        body: CollectionItemsRequest
    )
    : Deferred<Response<CollectionItemsResponse>> {
        return catalogApiList.addCollectionItemsBySlug(
            slug = slug,
            
            body = body
        )
    }
    
    override fun getCollectionItemsBySlug(
         slug: String,
         f: String?, filters: Boolean?, sort_on: String?, page_id: String?, page_size: Int?
        
    )
    : Deferred<Response<GetCollectionListingItemsResponse>> {
        return catalogApiList.getCollectionItemsBySlug(
            slug = slug,
            f = f,filters = filters,sort_on = sort_on,page_id = page_id,page_size = page_size
            
        )
    }
    
    override fun updateCollectionDetailBySlug(
         slug: String
        
        
    )
    : Deferred<Response<CollectionsUpdateDetailResponse>> {
        return catalogApiList.updateCollectionDetailBySlug(
            slug = slug
            
            
        )
    }
    
    override fun getCollectionDetailBySlug(
         slug: String
        
        
    )
    : Deferred<Response<CollectionDetailResponse>> {
        return catalogApiList.getCollectionDetailBySlug(
            slug = slug
            
            
        )
    }
    
    override fun deleteCollectionDetailBySlug(
         slug: String
        
        
    )
    : Deferred<Response<CollectionDetailViewDeleteResponse>> {
        return catalogApiList.deleteCollectionDetailBySlug(
            slug = slug
            
            
        )
    }
    
    override fun getFollowedListing(
         collection_type: String
        
        
    )
    : Deferred<Response<GetFollowListingResponse>> {
        return catalogApiList.getFollowedListing(
            collection_type = collection_type
            
            
        )
    }
    
    override fun followById(
         collection_type: String, collection_id: Int
        
        
    )
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiList.followById(
            collection_type = collection_type,collection_id = collection_id
            
            
        )
    }
    
    override fun unfollowById(
         collection_type: String, collection_id: Int
        
        
    )
    : Deferred<Response<FollowPostResponse>> {
        return catalogApiList.unfollowById(
            collection_type = collection_type,collection_id = collection_id
            
            
        )
    }
    
    override fun getFollowerCountById(
         collection_type: String, collection_id: String
        
        
    )
    : Deferred<Response<FollowerCountResponse>> {
        return catalogApiList.getFollowerCountById(
            collection_type = collection_type,collection_id = collection_id
            
            
        )
    }
    
    override fun getFollowIds(
        
         collection_type: String?
        
    )
    : Deferred<Response<FollowIdsResponse>> {
        return catalogApiList.getFollowIds(
            
            collection_type = collection_type
            
        )
    }
    
    override fun getStores(
        
         page_no: Int?, page_size: Int?, q: String?, range: Int?, latitude: Double?, longitude: Double?
        
    )
    : Deferred<Response<StoreListingResponse>> {
        return catalogApiList.getStores(
            
            page_no = page_no,page_size = page_size,q = q,range = range,latitude = latitude,longitude = longitude
            
        )
    }
    

    private fun generatecatalogApiList(): CatalogApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Catalog"
        )
        return retrofitHttpClient?.initializeRestClient(CatalogApiList::class.java) as CatalogApiList
    }
}

class LeadApiHelperClass(val config: ApplicationConfig) : LeadApiHelperFace  {
    
   private val leadApiList: LeadApiList by lazy {
        generateleadApiList()
    }

    
    override fun getTicket(
         id: String
        
        
    )
    : Deferred<Response<Ticket>> {
        return leadApiList.getTicket(
            id = id
            
            
        )
    }
    
    override fun createHistoryForTicket(
         ticket_id: String,
        
        body: TicketHistoryPayload
    )
    : Deferred<Response<TicketHistory>> {
        return leadApiList.createHistoryForTicket(
            ticket_id = ticket_id,
            
            body = body
        )
    }
    
    override fun createTicket(
        
        
        body: AddTicketPayload
    )
    : Deferred<Response<Ticket>> {
        return leadApiList.createTicket(
            
            
            body = body
        )
    }
    
    override fun getCustomForm(
         slug: String
        
        
    )
    : Deferred<Response<CustomForm>> {
        return leadApiList.getCustomForm(
            slug = slug
            
            
        )
    }
    
    override fun submitCustomForm(
         slug: String,
        
        body: CustomFormSubmissionPayload
    )
    : Deferred<Response<SubmitCustomFormResponse>> {
        return leadApiList.submitCustomForm(
            slug = slug,
            
            body = body
        )
    }
    
    override fun getParticipantsInsideVideoRoom(
         unique_name: String
        
        
    )
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>> {
        return leadApiList.getParticipantsInsideVideoRoom(
            unique_name = unique_name
            
            
        )
    }
    
    override fun getTokenForVideoRoom(
         unique_name: String
        
        
    )
    : Deferred<Response<GetTokenForVideoRoomResponse>> {
        return leadApiList.getTokenForVideoRoom(
            unique_name = unique_name
            
            
        )
    }
    

    private fun generateleadApiList(): LeadApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Lead"
        )
        return retrofitHttpClient?.initializeRestClient(LeadApiList::class.java) as LeadApiList
    }
}

class ShareApiHelperClass(val config: ApplicationConfig) : ShareApiHelperFace  {
    
   private val shareApiList: ShareApiList by lazy {
        generateshareApiList()
    }

    
    override fun getApplicationQRCode(
        
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiList.getApplicationQRCode(
            
            
            
        )
    }
    
    override fun getProductQRCodeBySlug(
         slug: String
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiList.getProductQRCodeBySlug(
            slug = slug
            
            
        )
    }
    
    override fun getCollectionQRCodeBySlug(
         slug: String
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiList.getCollectionQRCodeBySlug(
            slug = slug
            
            
        )
    }
    
    override fun getUrlQRCode(
         url: String
        
        
    )
    : Deferred<Response<QRCodeResp>> {
        return shareApiList.getUrlQRCode(
            url = url
            
            
        )
    }
    
    override fun createShortLink(
        
        
        body: ShortLinkReq
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiList.createShortLink(
            
            
            body = body
        )
    }
    
    override fun getShortLinkByHash(
         hash: String
        
        
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiList.getShortLinkByHash(
            hash = hash
            
            
        )
    }
    
    override fun getOriginalShortLinkByHash(
         hash: String
        
        
    )
    : Deferred<Response<ShortLinkRes>> {
        return shareApiList.getOriginalShortLinkByHash(
            hash = hash
            
            
        )
    }
    

    private fun generateshareApiList(): ShareApiList {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(config)
        val authCredentials = Credentials.basic(
            config.auth_user_name ?: "",
            config.auth_user_password
        )
        //val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        //interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Share"
        )
        return retrofitHttpClient?.initializeRestClient(ShareApiList::class.java) as ShareApiList
    }
}
