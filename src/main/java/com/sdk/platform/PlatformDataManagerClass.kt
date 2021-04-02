package com.sdk.platform

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import com.sdk.common.*




class LeadDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val leadApiList by lazy {
        generateleadApiList()
    }
    
    private fun generateleadApiList(): LeadApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformLead",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(LeadApiList::class.java) as? LeadApiList
    }
    
    
    suspend fun getTickets(items: Boolean?=null, filters: Boolean?=null, q: String?=null, status: String?=null, priority: String?=null, category: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<TicketList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getTickets(
        companyId = config.companyId, items = items, filters = filters, q = q, status = status, priority = priority, category = category, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun createTicket(body: AddTicketPayload)
    : Deferred<Response<Ticket>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.createTicket(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    suspend fun getTicket(ticketId: String)
    : Deferred<Response<Ticket>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getTicket(
        companyId = config.companyId, ticketId = ticketId )
        } else {
            null
        } 
    }
    
    
    suspend fun editTicket(ticketId: String,body: EditTicketPayload)
    : Deferred<Response<Ticket>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.editTicket(
        companyId = config.companyId, ticketId = ticketId, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun createHistory(ticketId: String,body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.createHistory(
        companyId = config.companyId, ticketId = ticketId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getTicketHistory(ticketId: String)
    : Deferred<Response<TicketHistoryList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            leadApiList?.getTicketHistory(
        companyId = config.companyId, ticketId = ticketId )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    suspend fun getTickets(items: Boolean?=null, filters: Boolean?=null, q: String?=null, status: String?=null, priority: String?=null, category: String?=null)
    : Deferred<Response<TicketList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTickets(companyId = config.companyId , applicationId = applicationId , items = items, filters = filters, q = q, status = status, priority = priority, category = category )
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getTicket(ticketId: String)
    : Deferred<Response<Ticket>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTicket(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId )
        } else {
            null
        }
    }
    
    
    suspend fun editTicket(ticketId: String,body: EditTicketPayload)
    : Deferred<Response<Ticket>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.editTicket(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId, body = body)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun createHistory(ticketId: String,body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.createHistory(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getTicketHistory(ticketId: String)
    : Deferred<Response<TicketHistoryList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTicketHistory(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId )
        } else {
            null
        }
    }
    
    
    suspend fun getCustomForm(slug: String)
    : Deferred<Response<CustomForm>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getCustomForm(companyId = config.companyId , applicationId = applicationId , slug = slug )
        } else {
            null
        }
    }
    
    
    suspend fun editCustomForm(slug: String,body: EditCustomFormPayload)
    : Deferred<Response<CustomForm>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.editCustomForm(companyId = config.companyId , applicationId = applicationId , slug = slug, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomForms()
    : Deferred<Response<CustomFormList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getCustomForms(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun createCustomForm(body: CreateCustomFormPayload)
    : Deferred<Response<CustomForm>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.createCustomForm(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getTokenForVideoRoom(uniqueName: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getTokenForVideoRoom(companyId = config.companyId , applicationId = applicationId , uniqueName = uniqueName )
        } else {
            null
        }
    }
    
    
    suspend fun getVideoParticipants(uniqueName: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.getVideoParticipants(companyId = config.companyId , applicationId = applicationId , uniqueName = uniqueName )
        } else {
            null
        }
    }
    
    
    suspend fun openVideoRoom(body: CreateVideoRoomPayload)
    : Deferred<Response<CreateVideoRoomResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.openVideoRoom(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun closeVideoRoom(uniqueName: String)
    : Deferred<Response<CloseVideoRoomResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                leadApiList?.closeVideoRoom(companyId = config.companyId , applicationId = applicationId , uniqueName = uniqueName )
        } else {
            null
        }
    }
    
}
}

class ThemeDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val themeApiList by lazy {
        generatethemeApiList()
    }
    
    private fun generatethemeApiList(): ThemeApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformTheme",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ThemeApiList::class.java) as? ThemeApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getThemeLibrary(pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<ThemesListingResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeLibrary(companyId = config.companyId , applicationId = applicationId , pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    suspend fun addToThemeLibrary(body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.addToThemeLibrary(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun applyTheme(body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.applyTheme(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun isUpgradable(themeId: String)
    : Deferred<Response<UpgradableThemeSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.isUpgradable(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun upgradeTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.upgradeTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun getPublicThemes(pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<ThemesListingResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getPublicThemes(companyId = config.companyId , applicationId = applicationId , pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    suspend fun createTheme(body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.createTheme(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getAppliedTheme()
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getAppliedTheme(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getFonts()
    : Deferred<Response<FontsSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getFonts(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getThemeById(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeById(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun updateTheme(themeId: String,body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.updateTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
        } else {
            null
        }
    }
    
    
    suspend fun deleteTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.deleteTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun getThemeForPreview(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.getThemeForPreview(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun publishTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.publishTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun unpublishTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.unpublishTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun archiveTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.archiveTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
    
    suspend fun unarchiveTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                themeApiList?.unarchiveTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
        } else {
            null
        }
    }
    
}
}

class UserDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val userApiList by lazy {
        generateuserApiList()
    }
    
    private fun generateuserApiList(): UserApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformUser",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(UserApiList::class.java) as? UserApiList
    }
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getCustomers(q: String?=null, pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<CustomerListResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getCustomers(companyId = config.companyId , applicationId = applicationId , q = q, pageSize = pageSize, pageNo = pageNo )
        } else {
            null
        }
    }
    
    
    suspend fun searchUsers(q: String?=null)
    : Deferred<Response<UserSearchResponseSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.searchUsers(companyId = config.companyId , applicationId = applicationId , q = q )
        } else {
            null
        }
    }
    
    
    suspend fun getPlatformConfig()
    : Deferred<Response<PlatformSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.getPlatformConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun updatePlatformConfig(body: PlatformSchema)
    : Deferred<Response<PlatformSchema>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                userApiList?.updatePlatformConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
}
}

class PaymentDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val paymentApiList by lazy {
        generatepaymentApiList()
    }
    
    private fun generatepaymentApiList(): PaymentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformPayment",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(PaymentApiList::class.java) as? PaymentApiList
    }
    
    
    
    
    
    
    suspend fun getAllPayouts(uniqueExternalId: String?=null)
    : Deferred<Response<PayoutsResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getAllPayouts(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId )
        } else {
            null
        } 
    }
    
    
    suspend fun savePayout(body: PayoutRequest)
    : Deferred<Response<PayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.savePayout(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updatePayout(uniqueTransferNo: String,body: PayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.updatePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun activateAndDectivatePayout(uniqueTransferNo: String,body: UpdatePayoutRequest)
    : Deferred<Response<UpdatePayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.activateAndDectivatePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deletePayout(uniqueTransferNo: String)
    : Deferred<Response<DeletePayoutResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.deletePayout(
        companyId = config.companyId, uniqueTransferNo = uniqueTransferNo )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionPaymentMethod()
    : Deferred<Response<SubscriptionPaymentMethodResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getSubscriptionPaymentMethod(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun deleteSubscriptionPaymentMethod(uniqueExternalId: String, paymentMethodId: String)
    : Deferred<Response<DeleteSubscriptionPaymentMethodResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.deleteSubscriptionPaymentMethod(
        companyId = config.companyId, uniqueExternalId = uniqueExternalId, paymentMethodId = paymentMethodId )
        } else {
            null
        } 
    }
    
    
    suspend fun getSubscriptionConfig()
    : Deferred<Response<SubscriptionConfigResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.getSubscriptionConfig(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun saveSubscriptionSetupIntent(body: SaveSubscriptionSetupIntentRequest)
    : Deferred<Response<SaveSubscriptionSetupIntentResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            paymentApiList?.saveSubscriptionSetupIntent(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getBrandPaymentGatewayConfig()
    : Deferred<Response<PaymentGatewayConfigResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getBrandPaymentGatewayConfig(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun saveBrandPaymentGatewayConfig(body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.saveBrandPaymentGatewayConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun updateBrandPaymentGatewayConfig(body: PaymentGatewayConfigRequest)
    : Deferred<Response<PaymentGatewayToBeReviewed>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.updateBrandPaymentGatewayConfig(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getPaymentModeRoutes(refresh: Boolean, requestType: String)
    : Deferred<Response<PaymentOptionsResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                paymentApiList?.getPaymentModeRoutes(companyId = config.companyId , applicationId = applicationId , refresh = refresh, requestType = requestType )
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    
    
    
}
}

class OrderDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val orderApiList by lazy {
        generateorderApiList()
    }
    
    private fun generateorderApiList(): OrderApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformOrder",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(OrderApiList::class.java) as? OrderApiList
    }
    
    
    suspend fun shipmentStatusUpdate(body: UpdateShipmentStatusBody)
    : Deferred<Response<UpdateShipmentStatusResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.shipmentStatusUpdate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun activityStatus(bagId: String)
    : Deferred<Response<GetActivityStatus>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.activityStatus(
        companyId = config.companyId, bagId = bagId )
        } else {
            null
        } 
    }
    
    
    suspend fun storeProcessShipmentUpdate(body: UpdateProcessShipmenstRequestBody)
    : Deferred<Response<UpdateProcessShipmenstRequestResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.storeProcessShipmentUpdate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getOrdersByCompanyId(pageNo: String?=null, pageSize: String?=null, fromDate: String?=null, toDate: String?=null, q: String?=null, stage: String?=null, salesChannels: String?=null, orderId: String?=null, stores: String?=null, status: String?=null, shortenUrls: Boolean?=null, filterType: String?=null)
    : Deferred<Response<OrderListing>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getOrdersByCompanyId(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, fromDate = fromDate, toDate = toDate, q = q, stage = stage, salesChannels = salesChannels, orderId = orderId, stores = stores, status = status, shortenUrls = shortenUrls, filterType = filterType )
        } else {
            null
        } 
    }
    
    
    
    
    
    
    suspend fun getPing()
    : Deferred<Response<GetPingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.getPing(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun voiceCallback()
    : Deferred<Response<GetVoiceCallbackResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.voiceCallback(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun voiceClickToCall(caller: String, receiver: String)
    : Deferred<Response<GetClickToCallResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            orderApiList?.voiceClickToCall(
        companyId = config.companyId, caller = caller, receiver = receiver )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    suspend fun trackShipmentPlatform(shipmentId: String)
    : Deferred<Response<PlatformShipmentTrack>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackShipmentPlatform(companyId = config.companyId , applicationId = applicationId , shipmentId = shipmentId )
        } else {
            null
        }
    }
    
    
    suspend fun trackOrder(orderId: String)
    : Deferred<Response<PlatformOrderTrack>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.trackOrder(companyId = config.companyId , applicationId = applicationId , orderId = orderId )
        } else {
            null
        }
    }
    
    
    suspend fun failedOrders()
    : Deferred<Response<FailedOrders>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.failedOrders(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun reprocessOrder(orderId: String)
    : Deferred<Response<UpdateOrderReprocessResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                orderApiList?.reprocessOrder(companyId = config.companyId , applicationId = applicationId , orderId = orderId )
        } else {
            null
        }
    }
    
    
    
    
}
}

class CompanyProfileDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val companyProfileApiList by lazy {
        generatecompanyProfileApiList()
    }
    
    private fun generatecompanyProfileApiList(): CompanyProfileApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformCompanyProfile",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(CompanyProfileApiList::class.java) as? CompanyProfileApiList
    }
    
    
    suspend fun updateCompany(body: CompanyStoreSerializerRequest)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.updateCompany(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun cbsOnboardGet()
    : Deferred<Response<GetCompanyProfileSerializerResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.cbsOnboardGet(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getCompanyMetrics()
    : Deferred<Response<MetricsSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getCompanyMetrics(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun editBrand(brandId: String,body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.editBrand(
        companyId = config.companyId, brandId = brandId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getBrand(brandId: String)
    : Deferred<Response<GetBrandResponseSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getBrand(
        companyId = config.companyId, brandId = brandId )
        } else {
            null
        } 
    }
    
    
    suspend fun createBrand(body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createBrand(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createBrand(body: CompanyBrandPostRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createBrand(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getBrands()
    : Deferred<Response<CompanyBrandListSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getBrands(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun createLocation(body: LocationSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.createLocation(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getLocations(storeType: String?=null, q: String?=null, stage: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<LocationListSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getLocations(
        companyId = config.companyId, storeType = storeType, q = q, stage = stage, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun updateLocation(locationId: String,body: LocationSerializer)
    : Deferred<Response<SuccessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.updateLocation(
        companyId = config.companyId, locationId = locationId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getLocationDetail(locationId: String)
    : Deferred<Response<GetLocationSerializer>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            companyProfileApiList?.getLocationDetail(
        companyId = config.companyId, locationId = locationId )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
}
}

class AssetsDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val assetsApiList by lazy {
        generateassetsApiList()
    }
    
    private fun generateassetsApiList(): AssetsApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformAssets",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(AssetsApiList::class.java) as? AssetsApiList
    }
    
    
    suspend fun startUpload(namespace: String,body: StartRequest)
    : Deferred<Response<StartResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.startUpload(
        namespace = namespace, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun completeUpload(namespace: String,body: StartResponse)
    : Deferred<Response<CompleteResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.completeUpload(
        namespace = namespace, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    
    suspend fun getSignUrls(body: SignUrlRequest)
    : Deferred<Response<SignUrlResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.getSignUrls(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun copyFiles(sync: Boolean?=null,body: BulkRequest)
    : Deferred<Response<BulkResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.copyFiles(
        sync = sync, companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    
    suspend fun browse(namespace: String)
    : Deferred<Response<BrowseResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.browse(
        namespace = namespace, companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    
    suspend fun proxy(url: String)
    : Deferred<Response<String>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            assetsApiList?.proxy(
        companyId = config.companyId, url = url )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    suspend fun appStartUpload(namespace: String,body: StartRequest)
    : Deferred<Response<StartResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                assetsApiList?.appStartUpload(namespace = namespace, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun appCompleteUpload(namespace: String,body: StartResponse)
    : Deferred<Response<CompleteResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                assetsApiList?.appCompleteUpload(namespace = namespace, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun appCopyFiles(sync: Boolean?=null,body: BulkRequest)
    : Deferred<Response<BulkResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                assetsApiList?.appCopyFiles(sync = sync, companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    
    suspend fun appBrowse(namespace: String)
    : Deferred<Response<BrowseResponse>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                assetsApiList?.appBrowse(namespace = namespace, companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for appBrowse
    **/
    fun appBrowsePaginator(
    namespace: String
    
    ) : Paginator<BrowseResponse>{
        val paginator = Paginator<BrowseResponse>()
        paginator.setCallBack(object : PaginatorCallback<BrowseResponse> {
            override suspend fun onNext(
                onSuccess: (Event<BrowseResponse>) -> Unit,
                onFailure: (FdkError) -> Unit ) {

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    assetsApiList?.appBrowse(namespace = namespace, companyId = config.companyId , applicationId = applicationId )?.safeAwait(
                    onSuccess = { response ->
                    val page = response.peekContent()?.page
                    
                    onSuccess.invoke(response)
                },
                    onFailure = { error ->
                        onFailure.invoke(error)
                    })
                
                } else {
                    null
                 }
            }

            override suspend fun onNext(
                onResponse: (Event<BrowseResponse>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    assetsApiList?.appBrowse(namespace = namespace, companyId = config.companyId , applicationId = applicationId )?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
}
}

class ShareDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val shareApiList by lazy {
        generateshareApiList()
    }
    
    private fun generateshareApiList(): ShareApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformShare",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(ShareApiList::class.java) as? ShareApiList
    }
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun createShortLink(body: ShortLinkReq)
    : Deferred<Response<ShortLinkRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.createShortLink(companyId = config.companyId , applicationId = applicationId , body = body)
        } else {
            null
        }
    }
    
    
    suspend fun getShortLinks(pageNo: String?=null, pageSize: String?=null, createdBy: String?=null, active: String?=null, q: String?=null)
    : Deferred<Response<ShortLinkList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinks(companyId = config.companyId , applicationId = applicationId , pageNo = pageNo, pageSize = pageSize, createdBy = createdBy, active = active, q = q )
        } else {
            null
        }
    }
    
    
    suspend fun getShortLinkByHash(hash: String)
    : Deferred<Response<ShortLinkRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.getShortLinkByHash(companyId = config.companyId , applicationId = applicationId , hash = hash )
        } else {
            null
        }
    }
    
    
    suspend fun updateShortLinkById(id: String)
    : Deferred<Response<ShortLinkRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                shareApiList?.updateShortLinkById(companyId = config.companyId , applicationId = applicationId , id = id )
        } else {
            null
        }
    }
    
}
}

class InventoryDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val inventoryApiList by lazy {
        generateinventoryApiList()
    }
    
    private fun generateinventoryApiList(): InventoryApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformInventory",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(InventoryApiList::class.java) as? InventoryApiList
    }
    
    
    suspend fun getJobsByCompany(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigRawDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobsByCompany(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun updateJob(xUserData: String?=null,body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.updateJob(
        companyId = config.companyId, xUserData = xUserData, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createJob(xUserData: String?=null,body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.createJob(
        companyId = config.companyId, xUserData = xUserData, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getJobByCompanyAndIntegration(integrationId: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobByCompanyAndIntegration(
        companyId = config.companyId, integrationId = integrationId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobConfigDefaults()
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobConfigDefaults(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobByCode(code: String)
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobByCode(
        companyId = config.companyId, code = code )
        } else {
            null
        } 
    }
    
    
    suspend fun getJobCodesByCompanyAndIntegration(integrationId: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigListDTO>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            inventoryApiList?.getJobCodesByCompanyAndIntegration(
        companyId = config.companyId, integrationId = integrationId, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
}
}

class MarketplacesDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val marketplacesApiList by lazy {
        generatemarketplacesApiList()
    }
    
    private fun generatemarketplacesApiList(): MarketplacesApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformMarketplaces",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(MarketplacesApiList::class.java) as? MarketplacesApiList
    }
    
    
    suspend fun getAvailableChannels()
    : Deferred<Response<AllChannels>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.getAvailableChannels(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getChannels()
    : Deferred<Response<HashMap<String,Any>>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.getChannels(
        companyId = config.companyId )
        } else {
            null
        } 
    }
    
    
    suspend fun getChannel(channel: String)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.getChannel(
        companyId = config.companyId, channel = channel )
        } else {
            null
        } 
    }
    
    
    suspend fun registerMyntraChannel(body: MyntraPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.registerMyntraChannel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateMyntraChannelCredentials(body: MyntraPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateMyntraChannelCredentials(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun registerAmazonChannel(body: AmazonPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.registerAmazonChannel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateAmazonChannelCredentials(body: AmazonPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateAmazonChannelCredentials(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun registerFlipkartChannel(flipkartChannel: String,body: FlipkartPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.registerFlipkartChannel(
        companyId = config.companyId, flipkartChannel = flipkartChannel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateFlipkartChannelCredentials(flipkartChannel: String,body: FlipkartPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateFlipkartChannelCredentials(
        companyId = config.companyId, flipkartChannel = flipkartChannel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun registerTatacliqChannel(tatacliqChannel: String,body: TatacliqPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.registerTatacliqChannel(
        companyId = config.companyId, tatacliqChannel = tatacliqChannel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateTatacliqChannelCredentials(tatacliqChannel: String,body: TatacliqPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateTatacliqChannelCredentials(
        companyId = config.companyId, tatacliqChannel = tatacliqChannel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun registerAjioChannel(body: AjioPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.registerAjioChannel(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateAjioChannelCredentials(body: AjioPayload)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateAjioChannelCredentials(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun updateChannelInventoryConfig(channel: String, validateCred: String?=null,body: InventoryConfig)
    : Deferred<Response<MkpResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateChannelInventoryConfig(
        companyId = config.companyId, channel = channel, validateCred = validateCred, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getChannelLocationConfig(channel: String)
    : Deferred<Response<StoreMapping>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.getChannelLocationConfig(
        companyId = config.companyId, channel = channel )
        } else {
            null
        } 
    }
    
    
    suspend fun updateChannelLocationConfig(channel: String,body: StoreMappingPayload)
    : Deferred<Response<StoreMapping>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateChannelLocationConfig(
        companyId = config.companyId, channel = channel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getChannelStatus(channel: String)
    : Deferred<Response<StatusPayload>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.getChannelStatus(
        companyId = config.companyId, channel = channel )
        } else {
            null
        } 
    }
    
    
    suspend fun updateChannelStatus(channel: String,body: StatusPayload)
    : Deferred<Response<StatusResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.updateChannelStatus(
        companyId = config.companyId, channel = channel, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun triggerChannelInventoryUpdates(channel: String, updateType: String,body: SyncPayload)
    : Deferred<Response<SyncResp>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            marketplacesApiList?.triggerChannelInventoryUpdates(
        companyId = config.companyId, channel = channel, updateType = updateType, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}

class AnalyticsDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val analyticsApiList by lazy {
        generateanalyticsApiList()
    }
    
    private fun generateanalyticsApiList(): AnalyticsApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformAnalytics",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(AnalyticsApiList::class.java) as? AnalyticsApiList
    }
    
    
    
    
    
    
    
    
    
    
    suspend fun createExportJob(exportType: String,body: ExportJobReq)
    : Deferred<Response<ExportJobRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.createExportJob(
        companyId = config.companyId, exportType = exportType, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getExportJobStatus(exportType: String, jobId: String)
    : Deferred<Response<ExportJobStatusRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.getExportJobStatus(
        companyId = config.companyId, exportType = exportType, jobId = jobId )
        } else {
            null
        } 
    }
    
    
    suspend fun getLogsList(logType: String, pageNo: String?=null, pageSize: String?=null,body: GetLogsListReq)
    : Deferred<Response<GetLogsListRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.getLogsList(
        companyId = config.companyId, logType = logType, pageNo = pageNo, pageSize = pageSize, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun searchLogs(pageNo: String?=null, pageSize: String?=null, logType: String,body: SearchLogReq)
    : Deferred<Response<SearchLogRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.searchLogs(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, logType = logType, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getStatiscticsGroups()
    : Deferred<Response<StatsGroups>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getStatiscticsGroups(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getStatiscticsGroupComponents(groupName: String)
    : Deferred<Response<StatsGroupComponents>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getStatiscticsGroupComponents(companyId = config.companyId , applicationId = applicationId , groupName = groupName )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentStatsCSV(componentName: String)
    : Deferred<Response<String>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getComponentStatsCSV(companyId = config.companyId , applicationId = applicationId , componentName = componentName )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentStatsPDF(componentName: String)
    : Deferred<Response<String>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getComponentStatsPDF(companyId = config.companyId , applicationId = applicationId , componentName = componentName )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentStats(componentName: String)
    : Deferred<Response<StatsRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getComponentStats(companyId = config.companyId , applicationId = applicationId , componentName = componentName )
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonCartList(from: String, to: String, pageNo: String?=null, pageSize: String?=null)
    : Deferred<Response<AbandonCartsList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getAbandonCartList(companyId = config.companyId , applicationId = applicationId , from = from, to = to, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonCartsCSV(from: String, to: String)
    : Deferred<Response<String>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getAbandonCartsCSV(companyId = config.companyId , applicationId = applicationId , from = from, to = to )
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonCartDetail(cartId: String)
    : Deferred<Response<AbandonCartDetail>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getAbandonCartDetail(companyId = config.companyId , applicationId = applicationId , cartId = cartId )
        } else {
            null
        }
    }
    
    
    
    
    
}
}