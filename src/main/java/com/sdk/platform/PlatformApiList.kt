package com.sdk.platform

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface LeadApiList {
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    fun getTickets(@Path("company_id") companyId: String, @Query("items") items: Boolean?, @Query("filters") filters: Boolean?, @Query("q") q: String?, @Query("status") status: String?, @Query("priority") priority: String?, @Query("category") category: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<TicketList>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    fun createTicket(@Path("company_id") companyId: String,@Body body: AddTicketPayload)
    : Deferred<Response<Ticket>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket")
    fun getTickets(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("items") items: Boolean?, @Query("filters") filters: Boolean?, @Query("q") q: String?, @Query("status") status: String?, @Query("priority") priority: String?, @Query("category") category: String?)
    : Deferred<Response<TicketList>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{ticket_id}")
    fun getTicket(@Path("company_id") companyId: String, @Path("ticket_id") ticketId: String)
    : Deferred<Response<Ticket>>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/ticket/{ticket_id}")
    fun editTicket(@Path("company_id") companyId: String, @Path("ticket_id") ticketId: String,@Body body: EditTicketPayload)
    : Deferred<Response<Ticket>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{ticket_id}")
    fun getTicket(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("ticket_id") ticketId: String)
    : Deferred<Response<Ticket>>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{ticket_id}")
    fun editTicket(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("ticket_id") ticketId: String,@Body body: EditTicketPayload)
    : Deferred<Response<Ticket>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{ticket_id}/history")
    fun createHistory(@Path("company_id") companyId: String, @Path("ticket_id") ticketId: String,@Body body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{ticket_id}/history")
    fun getTicketHistory(@Path("company_id") companyId: String, @Path("ticket_id") ticketId: String)
    : Deferred<Response<TicketHistoryList>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{ticket_id}/history")
    fun createHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("ticket_id") ticketId: String,@Body body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{ticket_id}/history")
    fun getTicketHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("ticket_id") ticketId: String)
    : Deferred<Response<TicketHistoryList>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    fun getCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<CustomForm>>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    fun editCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String,@Body body: EditCustomFormPayload)
    : Deferred<Response<CustomForm>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    fun getCustomForms(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<CustomFormList>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    fun createCustomForm(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateCustomFormPayload)
    : Deferred<Response<CustomForm>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/token")
    fun getTokenForVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/participants")
    fun getVideoParticipants(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room")
    fun openVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateVideoRoomPayload)
    : Deferred<Response<CreateVideoRoomResponse>>
    
    @DELETE ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}")
    fun closeVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<CloseVideoRoomResponse>>
    
}

interface UserApiList {
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/list")
    fun getCustomers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Deferred<Response<CustomerListResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/search")
    fun searchUsers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?)
    : Deferred<Response<UserSearchResponseSchema>>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers")
    fun createUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserRequestSchema)
    : Deferred<Response<CreateUserResponseSchema>>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/{user_id}")
    fun updateUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("user_id") userId: String,@Body body: UpdateUserRequestSchema)
    : Deferred<Response<CreateUserResponseSchema>>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    fun createUserSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserSessionRequestSchema)
    : Deferred<Response<CreateUserSessionResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    fun getPlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<PlatformSchema>>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    fun updatePlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformSchema)
    : Deferred<Response<PlatformSchema>>
    
}

interface PaymentApiList {
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    fun getBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<PaymentGatewayConfigResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    fun saveBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    fun updateBrandPaymentGatewayConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options")
    fun getPaymentModeRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("refresh") refresh: Boolean, @Query("request_type") requestType: String)
    : Deferred<Response<PaymentOptionsResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    fun getAllPayouts(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?)
    : Deferred<Response<PayoutsResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    fun savePayout(@Path("company_id") companyId: String,@Body body: PayoutRequest)
    : Deferred<Response<PayoutResponse>>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    fun updatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: PayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    fun activateAndDectivatePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String,@Body body: UpdatePayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    fun deletePayout(@Path("company_id") companyId: String, @Path("unique_transfer_no") uniqueTransferNo: String)
    : Deferred<Response<DeletePayoutResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    fun getSubscriptionPaymentMethod(@Path("company_id") companyId: String)
    : Deferred<Response<SubscriptionPaymentMethodResponse>>
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    fun deleteSubscriptionPaymentMethod(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String, @Query("payment_method_id") paymentMethodId: String)
    : Deferred<Response<DeleteSubscriptionPaymentMethodResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/configs")
    fun getSubscriptionConfig(@Path("company_id") companyId: String)
    : Deferred<Response<SubscriptionConfigResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/subscription/setup/intent")
    fun saveSubscriptionSetupIntent(@Path("company_id") companyId: String,@Body body: SaveSubscriptionSetupIntentRequest)
    : Deferred<Response<SaveSubscriptionSetupIntentResponse>>
    
}

interface OrderApiList {
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/actions/status")
    fun shipmentStatusUpdate(@Path("company_id") companyId: String,@Body body: UpdateShipmentStatusBody)
    : Deferred<Response<UpdateShipmentStatusResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/actions/activity/status")
    fun activityStatus(@Path("company_id") companyId: String, @Query("bag_id") bagId: String)
    : Deferred<Response<GetActivityStatus>>
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/actions/store/process-shipments")
    fun storeProcessShipmentUpdate(@Path("company_id") companyId: String,@Body body: UpdateProcessShipmenstRequestBody)
    : Deferred<Response<UpdateProcessShipmenstRequestResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders")
    fun getOrdersByCompanyId(@Path("company_id") companyId: String, @Query("page_no") pageNo: String?, @Query("page_size") pageSize: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("sales_channels") salesChannels: String?, @Query("order_id") orderId: String?, @Query("stores") stores: String?, @Query("status") status: String?, @Query("shorten_urls") shortenUrls: Boolean?, @Query("filter_type") filterType: String?)
    : Deferred<Response<OrderListing>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    fun trackShipmentPlatform(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("shipment_id") shipmentId: String)
    : Deferred<Response<PlatformShipmentTrack>>
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/{order_id}/track")
    fun trackOrder(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("order_id") orderId: String)
    : Deferred<Response<PlatformOrderTrack>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/failed")
    fun failedOrders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<FailedOrders>>
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/{order_id}/reprocess")
    fun reprocessOrder(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("order_id") orderId: String)
    : Deferred<Response<UpdateOrderReprocessResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/ping")
    fun getPing(@Path("company_id") companyId: String)
    : Deferred<Response<GetPingResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/voice/callback")
    fun voiceCallback(@Path("company_id") companyId: String)
    : Deferred<Response<GetVoiceCallbackResponse>>
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/voice/click-to-call")
    fun voiceClickToCall(@Path("company_id") companyId: String, @Query("caller") caller: String, @Query("receiver") receiver: String)
    : Deferred<Response<GetClickToCallResponse>>
    
}

interface CatalogApiList {
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun deleteSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun getSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<GetSearchWordsDetailResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun updateSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    fun getAllSearchKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetSearchWordsResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    fun createCustomKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    fun deleteAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    fun getAutocompleteKeywordDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<GetAutocompleteWordsResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    fun updateAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateAutocompleteKeyword)
    : Deferred<Response<GetAutocompleteWordsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    fun getAutocompleteConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetAutocompleteWordsResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    fun createCustomAutocompleteRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateAutocompleteKeyword)
    : Deferred<Response<CreateAutocompleteWordsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    fun getProductBundle(@Path("company_id") companyId: String, @Query("q") q: String?)
    : Deferred<Response<GetProductBundleListingResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    fun createProductBundle(@Path("company_id") companyId: String,@Body body: ProductBundleRequest)
    : Deferred<Response<GetProductBundleCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    fun getProductBundleDetail(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<GetProductBundleResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    fun updateProductBundle(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: ProductBundleUpdateRequest)
    : Deferred<Response<GetProductBundleCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    fun getSizeGuides(@Path("company_id") companyId: String, @Query("active") active: Boolean?, @Query("q") q: String?, @Query("tag") tag: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ListSizeGuide>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    fun createSizeGuide(@Path("company_id") companyId: String,@Body body: ValidateSizeGuide)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    fun getSizeGuide(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<SizeGuideResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    fun updateSizeGuide(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: ValidateSizeGuide)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/metadata/")
    fun getCatalogConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetCatalogConfigurationMetaData>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    fun getConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetAppCatalogConfiguration>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    fun createConfigurationProductListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppConfiguration)
    : Deferred<Response<GetAppCatalogConfiguration>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    fun getConfigurationByType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String)
    : Deferred<Response<GetAppCatalogEntityConfiguration>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    fun createConfigurationByType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("type") type: String,@Body body: AppConfiguration)
    : Deferred<Response<GetAppCatalogConfiguration>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/query-options/")
    fun getQueryFilters(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetCollectionQueryOptionResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    fun getAllCollections(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetCollectionListingResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    fun createCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateCollection)
    : Deferred<Response<CollectionCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{slug}/")
    fun getCollectionDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    fun deleteCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    fun updateCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<CollectionCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    fun getCollectionItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetCollectionItemsResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    fun addCollectionItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CollectionItemRequest)
    : Deferred<Response<UpdatedResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/analytics/insights/")
    fun getCatalogInsights(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("brand") brand: String?)
    : Deferred<Response<CatalogInsightResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/cross-selling/{seller_app_id}/analytics/insights/")
    fun getSellerInsights(@Path("company_id") companyId: String, @Path("seller_app_id") sellerAppId: String)
    : Deferred<Response<CrossSellingResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/{marketplace}/optin/")
    fun createMarketplaceOptin(@Path("company_id") companyId: String, @Path("marketplace") marketplace: String,@Body body: OptInPostRequest)
    : Deferred<Response<UpdatedResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/")
    fun getMarketplaceOptinDetail(@Path("company_id") companyId: String)
    : Deferred<Response<GetOptInPlatform>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-details/")
    fun getCompanyDetail(@Path("company_id") companyId: String)
    : Deferred<Response<OptinCompanyDetail>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-brand-details/")
    fun getCompanyBrandDetail(@Path("company_id") companyId: String, @Query("is_active") isActive: Boolean?, @Query("q") q: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("marketplace") marketplace: String?)
    : Deferred<Response<OptinCompanyBrandDetailsView>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-metrics/")
    fun getCompanyMetrics(@Path("company_id") companyId: String)
    : Deferred<Response<OptinCompanyMetrics>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/location-details/")
    fun getStoreDetail(@Path("company_id") companyId: String, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<OptinStoreDetails>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/categories/")
    fun listProductTemplateCategories(@Path("company_id") companyId: String, @Query("departments") departments: String, @Query("item_type") itemType: String)
    : Deferred<Response<ProdcutTemplateCategoriesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    fun listDepartmentsData(@Path("company_id") companyId: String)
    : Deferred<Response<DepartmentsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    fun getDepartmentData(@Path("company_id") companyId: String, @Path("uid") uid: String)
    : Deferred<Response<DepartmentsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/")
    fun listProductTemplate(@Path("company_id") companyId: String, @Query("departments") departments: String)
    : Deferred<Response<TemplatesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/validation/schema/")
    fun validateProductTemplate(@Path("company_id") companyId: String, @Path("slug") slug: String)
    : Deferred<Response<TemplatesValidationResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/download/")
    fun downloadProductTemplateViews(@Path("company_id") companyId: String, @Path("slug") slug: String)
    : Deferred<Response<String>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/download/")
    fun downloadProductTemplateView(@Path("company_id") companyId: String, @Query("item_type") itemType: String)
    : Deferred<Response<String>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/validation/schema/")
    fun validateProductTemplateSchema(@Path("company_id") companyId: String, @Query("item_type") itemType: String)
    : Deferred<Response<InventoryValidationResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/hsn/")
    fun listHSNCodes(@Path("company_id") companyId: String)
    : Deferred<Response<HSNCodesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/downloads/")
    fun listProductTemplateExportDetails(@Path("company_id") companyId: String)
    : Deferred<Response<TemplatesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/downloads/configuration/")
    fun listTemplateBrandTypeValues(@Path("company_id") companyId: String, @Query("filter") filter: String)
    : Deferred<Response<ProductConfligurationDownloads>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    fun listCategories(@Path("company_id") companyId: String, @Query("level") level: String?, @Query("q") q: String?)
    : Deferred<Response<CategoryResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    fun createCategories(@Path("company_id") companyId: String,@Body body: CategoryRequestBody)
    : Deferred<Response<CategoryCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    fun getCategoryData(@Path("company_id") companyId: String, @Path("uid") uid: String)
    : Deferred<Response<Category>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    fun updateCategory(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: CategoryRequestBody)
    : Deferred<Response<CategoryUpdateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/")
    fun getProducts(@Path("company_id") companyId: String, @Query("brand_ids") brandIds: Double?, @Query("category_ids") categoryIds: Double?, @Query("search") search: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductListingResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/")
    fun createProduct(@Path("company_id") companyId: String,@Body body: ProductCreateUpdate)
    : Deferred<Response<SuccessResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/")
    fun deleteProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/")
    fun getProduct(@Query("item_code") itemCode: String?, @Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("uid") uid: Int?)
    : Deferred<Response<Product>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/")
    fun editProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String,@Body body: ProductCreateUpdate)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/validation/")
    fun getProductValidation(@Path("company_id") companyId: String)
    : Deferred<Response<ValidateProduct>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/")
    fun getProductSize(@Query("item_code") itemCode: String?, @Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("uid") uid: Int?)
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    fun getProductBulkUploadHistory(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductBulkRequestList>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    fun updateProductAssetsInBulk(@Path("company_id") companyId: String,@Body body: BulkJob)
    : Deferred<Response<SuccessResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    fun deleteProductBulkJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String)
    : Deferred<Response<SuccessResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    fun createProductsInBulk(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: BulkProductRequest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/tags")
    fun getCompanyTags(@Path("company_id") companyId: String)
    : Deferred<Response<ProductTagsViewResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    fun getProductAssetsInBulk(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BulkAssetResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    fun createProductAssetsInBulk(@Path("company_id") companyId: String,@Body body: ProductBulkAssets)
    : Deferred<Response<SuccessResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    fun deleteSize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}/")
    fun getInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<InventoryRequest>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}/")
    fun addInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String,@Body body: InventoryRequest1)
    : Deferred<Response<SuccessResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/<size>/location/{location_id}/")
    fun deleteInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("location_id") locationId: String)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    fun getInventoryBulkUploadHistory(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BulkRequestGet>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    fun createBulkInventoryJob(@Path("company_id") companyId: String,@Body body: BulkJob)
    : Deferred<Response<CommonResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/<batch_id>/")
    fun deleteBulkInventoryJob(@Path("company_id") companyId: String)
    : Deferred<Response<SuccessResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/<batch_id>/")
    fun createBulkInventory(@Path("company_id") companyId: String,@Body body: InventoryBulkRequest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    fun getInventoryExport(@Path("company_id") companyId: String)
    : Deferred<Response<InventoryExportJob>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    fun createInventoryExportJob(@Path("company_id") companyId: String,@Body body: InventoryExportRequest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/configuration/")
    fun exportInventoryConfig(@Path("company_id") companyId: String, @Query("filter_type") filterType: String?)
    : Deferred<Response<InventoryConfig>>
    
}

interface FileStorageApiList {
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/start/")
    fun startUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String,@Body body: StartRequest)
    : Deferred<Response<StartResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/complete/")
    fun completeUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String,@Body body: StartResponse)
    : Deferred<Response<CompleteResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/start/")
    fun appStartUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: StartRequest)
    : Deferred<Response<StartResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/complete/")
    fun appCompleteUpload(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: StartResponse)
    : Deferred<Response<CompleteResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/sign-urls/")
    fun getSignUrls(@Path("company_id") companyId: String,@Body body: SignUrlRequest)
    : Deferred<Response<SignUrlResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/uploads/copy/")
    fun copyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String,@Body body: BulkRequest)
    : Deferred<Response<BulkResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/uploads/copy/")
    fun appCopyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BulkRequest)
    : Deferred<Response<BulkResponse>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse/")
    fun browse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Query("page_no") pageNo: Int?)
    : Deferred<Response<BrowseResponse>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse/")
    fun appBrowse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?)
    : Deferred<Response<BrowseResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/proxy/")
    fun proxy(@Path("company_id") companyId: String, @Query("url") url: String)
    : Deferred<Response<String>>
    
}

interface ShareApiList {
    
    @POST ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/")
    fun createShortLink(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>
    
    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/")
    fun getShortLinks(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("created_by") createdBy: String?, @Query("active") active: String?, @Query("q") q: String?)
    : Deferred<Response<ShortLinkList>>
    
    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/{hash}/")
    fun getShortLinkByHash(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("hash") hash: String)
    : Deferred<Response<ShortLinkRes>>
    
    @PATCH ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/{id}/")
    fun updateShortLinkById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>
    
}

interface ConfigurationApiList {
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    fun getBuildConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String)
    : Deferred<Response<MobileAppConfiguration>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    fun updateBuildConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String,@Body body: MobileAppConfigRequest)
    : Deferred<Response<MobileAppConfiguration>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/versions")
    fun getPreviousVersions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("platform_type") platformType: String)
    : Deferred<Response<BuildVersionHistory>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    fun getAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<AppFeatureResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    fun updateAppFeatures(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppFeatureRequest)
    : Deferred<Response<AppFeature>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    fun getAppBasicDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationDetail>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    fun updateAppBasicDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationDetail)
    : Deferred<Response<ApplicationDetail>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    fun getAppContactInfo(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationInformation>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    fun updateAppContactInfo(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationInformation)
    : Deferred<Response<ApplicationInformation>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    fun getAppApiTokens(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<TokenResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    fun updateAppApiTokens(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: TokenResponse)
    : Deferred<Response<TokenResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/companies")
    fun getAppCompanies(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<CompaniesResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/stores")
    fun getAppStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<StoresResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    fun getInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationInventory>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    fun updateInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationInventory)
    : Deferred<Response<ApplicationInventory>>
    
    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    fun partiallyUpdateInventoryConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppInventoryPartialUpdate)
    : Deferred<Response<ApplicationInventory>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    fun getAppCurrencyConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<AppSupportedCurrency>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    fun updateAppCurrencyConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppSupportedCurrency)
    : Deferred<Response<AppSupportedCurrency>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/stores/filter")
    fun getOrderingStoresByFilter(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: FilterOrderingStoreRequest)
    : Deferred<Response<OrderingStores>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    fun updateOrderingStoreConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OrderingStoreConfig)
    : Deferred<Response<DeploymentMeta>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    fun getDomains(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<DomainsResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    fun addDomain(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DomainAddRequest)
    : Deferred<Response<Domain>>
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/{id}")
    fun removeDomainById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<SuccessMessageResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/set-domain")
    fun changeDomainType(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UpdateDomainTypeRequest)
    : Deferred<Response<DomainsResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/domain-status")
    fun getDomainStatus(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DomainStatusRequest)
    : Deferred<Response<DomainStatusResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application")
    fun createApplication(@Path("company_id") companyId: String,@Body body: CreateApplicationRequest)
    : Deferred<Response<CreateAppResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application")
    fun getApplications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<ApplicationsResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    fun getApplicationById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<Application>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    fun getCurrencies(@Path("company_id") companyId: String)
    : Deferred<Response<CurrenciesResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/domain/suggestions")
    fun getDomainAvailibility(@Path("company_id") companyId: String,@Body body: DomainSuggestionsRequest)
    : Deferred<Response<DomainSuggestionsResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration/{id}")
    fun getIntegrationById(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<Integration>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/available")
    fun getAvailableOptIns(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetIntegrationsOptInsResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/selected/{level}/{uid}")
    fun getSelectedOptIns(@Path("company_id") companyId: String, @Path("level") level: String, @Path("uid") uid: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetIntegrationsOptInsResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}")
    fun getIntegrationLevelConfig(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String)
    : Deferred<Response<IntegrationConfigResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}/{uid}")
    fun getIntegrationByLevelId(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Path("uid") uid: String)
    : Deferred<Response<IntegrationLevel>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/check/configuration/{id}/{level}/{uid}")
    fun getLevelActiveIntegrations(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Path("uid") uid: String)
    : Deferred<Response<OptedStoreIntegration>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/brands-by-companies")
    fun getBrandsByCompany(@Path("company_id") companyId: String, @Query("q") q: String?)
    : Deferred<Response<BrandsByCompanyResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/companies-by-brands")
    fun getCompanyByBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: CompanyByBrandsRequest)
    : Deferred<Response<CompanyByBrandsResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/stores-by-brands")
    fun getStoreByBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: StoreByBrandsRequest)
    : Deferred<Response<StoreByBrandsResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/")
    fun getOtherSellerApplications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<OtherSellerApplications>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}")
    fun getOtherSellerApplicationById(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<OptedApplicationResponse>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}/opt_out")
    fun optOutFromApplication(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: OptOutInventory)
    : Deferred<Response<SuccessMessageResponse>>
    
}

interface CartApiList {
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    fun getCoupons(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_archived") isArchived: Boolean?, @Query("title") title: String?, @Query("is_public") isPublic: Boolean?, @Query("is_display") isDisplay: Boolean?, @Query("type_slug") typeSlug: String?, @Query("code") code: String?)
    : Deferred<Response<CouponsResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    fun createCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CouponAdd)
    : Deferred<Response<SuccessMessage>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    fun getCouponById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<CouponUpdate>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    fun updateCoupon(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CouponUpdate)
    : Deferred<Response<SuccessMessage>>
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    fun updateCouponPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CouponPartialUpdate)
    : Deferred<Response<SuccessMessage>>
    
}

