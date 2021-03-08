package com.sdk.platform
import com.sdk.common.*
import kotlinx.coroutines.Deferred
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response




class LeadDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val leadApiList by lazy {
        generateleadApiList()
    }
    
    private fun generateleadApiList(): LeadApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Lead"
        )
        return retrofitHttpClient?.initializeRestClient(LeadApiList::class.java) as? LeadApiList
    }
    
    
    fun getTickets(items: Boolean?=null, filters: Boolean?=null)
    : Deferred<Response<TicketList>>? {
        return leadApiList?.getTickets(
        companyId = config.companyId, items = items, filters = filters )
    }
    
    
    fun createTicket(body: AddTicketPayload)
    : Deferred<Response<Ticket>>? {
        return leadApiList?.createTicket(
        companyId = config.companyId, body = body)
    }
    
    
    
    fun getTicket(ticketId: String)
    : Deferred<Response<Ticket>>? {
        return leadApiList?.getTicket(
        companyId = config.companyId, ticketId = ticketId )
    }
    
    
    fun editTicket(ticketId: String,body: EditTicketPayload)
    : Deferred<Response<Ticket>>? {
        return leadApiList?.editTicket(
        companyId = config.companyId, ticketId = ticketId, body = body)
    }
    
    
    
    
    fun createHistory(ticketId: String,body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>? {
        return leadApiList?.createHistory(
        companyId = config.companyId, ticketId = ticketId, body = body)
    }
    
    
    fun getTicketHistory(ticketId: String)
    : Deferred<Response<TicketHistoryList>>? {
        return leadApiList?.getTicketHistory(
        companyId = config.companyId, ticketId = ticketId )
    }
    
    
    
    
    
    
    
    
    
    
    

class Application(val applicationId:String,val config: PlatformConfig){

    private val leadApiList by lazy {
        generateleadApiList()
    }

    private fun generateleadApiList(): LeadApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Lead"
        )
        return retrofitHttpClient?.initializeRestClient(LeadApiList::class.java) as? LeadApiList
    }
    
    
    
    
    fun getTickets(items: Boolean?=null, filters: Boolean?=null)
    : Deferred<Response<TicketList>>? {
        return leadApiList?.getTickets(companyId = config.companyId , applicationId = applicationId , items = items, filters = filters )
    }
    
    
    
    
    fun getTicket(ticketId: String)
    : Deferred<Response<Ticket>>? {
        return leadApiList?.getTicket(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId )
    }
    
    
    fun editTicket(ticketId: String,body: EditTicketPayload)
    : Deferred<Response<Ticket>>? {
        return leadApiList?.editTicket(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId, body = body)
    }
    
    
    
    
    fun createHistory(ticketId: String,body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>? {
        return leadApiList?.createHistory(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId, body = body)
    }
    
    
    fun getTicketHistory(ticketId: String)
    : Deferred<Response<TicketHistoryList>>? {
        return leadApiList?.getTicketHistory(companyId = config.companyId , applicationId = applicationId , ticketId = ticketId )
    }
    
    
    fun getCustomForm(slug: String)
    : Deferred<Response<CustomForm>>? {
        return leadApiList?.getCustomForm(companyId = config.companyId , applicationId = applicationId , slug = slug )
    }
    
    
    fun editCustomForm(slug: String,body: EditCustomFormPayload)
    : Deferred<Response<CustomForm>>? {
        return leadApiList?.editCustomForm(companyId = config.companyId , applicationId = applicationId , slug = slug, body = body)
    }
    
    
    fun getCustomForms()
    : Deferred<Response<CustomFormList>>? {
        return leadApiList?.getCustomForms(companyId = config.companyId , applicationId = applicationId  )
    }
    
    
    fun createCustomForm(body: CreateCustomFormPayload)
    : Deferred<Response<CustomForm>>? {
        return leadApiList?.createCustomForm(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun getTokenForVideoRoom(uniqueName: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>? {
        return leadApiList?.getTokenForVideoRoom(companyId = config.companyId , applicationId = applicationId , uniqueName = uniqueName )
    }
    
    
    fun getVideoParticipants(uniqueName: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>? {
        return leadApiList?.getVideoParticipants(companyId = config.companyId , applicationId = applicationId , uniqueName = uniqueName )
    }
    
    
    fun openVideoRoom(body: CreateVideoRoomPayload)
    : Deferred<Response<CreateVideoRoomResponse>>? {
        return leadApiList?.openVideoRoom(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun closeVideoRoom()
    : Deferred<Response<CloseVideoRoomResponse>>? {
        return leadApiList?.closeVideoRoom(companyId = config.companyId , applicationId = applicationId  )
    }
    
}
}

class ThemeDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val themeApiList by lazy {
        generatethemeApiList()
    }
    
    private fun generatethemeApiList(): ThemeApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Theme"
        )
        return retrofitHttpClient?.initializeRestClient(ThemeApiList::class.java) as? ThemeApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

class Application(val applicationId:String,val config: PlatformConfig){

    private val themeApiList by lazy {
        generatethemeApiList()
    }

    private fun generatethemeApiList(): ThemeApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Theme"
        )
        return retrofitHttpClient?.initializeRestClient(ThemeApiList::class.java) as? ThemeApiList
    }
    
    
    fun getThemeLibrary(pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<ThemesListingResponseSchema>>? {
        return themeApiList?.getThemeLibrary(companyId = config.companyId , applicationId = applicationId , pageSize = pageSize, pageNo = pageNo )
    }
    
    
    fun addToThemeLibrary(body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.addToThemeLibrary(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun applyTheme(body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.applyTheme(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun isUpgradable(themeId: String)
    : Deferred<Response<UpgradableThemeSchema>>? {
        return themeApiList?.isUpgradable(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
    }
    
    
    fun upgradeTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.upgradeTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
    }
    
    
    fun getPublicThemes(pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<ThemesListingResponseSchema>>? {
        return themeApiList?.getPublicThemes(companyId = config.companyId , applicationId = applicationId , pageSize = pageSize, pageNo = pageNo )
    }
    
    
    fun createTheme(body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.createTheme(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun getAppliedTheme()
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.getAppliedTheme(companyId = config.companyId , applicationId = applicationId  )
    }
    
    
    fun getFonts()
    : Deferred<Response<FontsSchema>>? {
        return themeApiList?.getFonts(companyId = config.companyId , applicationId = applicationId  )
    }
    
    
    fun getThemeById(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.getThemeById(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
    }
    
    
    fun updateTheme(themeId: String,body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.updateTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId, body = body)
    }
    
    
    fun deleteTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.deleteTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
    }
    
    
    fun getThemeForPreview(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.getThemeForPreview(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
    }
    
    
    fun publishTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.publishTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
    }
    
    
    fun unpublishTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.unpublishTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
    }
    
    
    fun archiveTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.archiveTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
    }
    
    
    fun unarchiveTheme(themeId: String)
    : Deferred<Response<ThemesSchema>>? {
        return themeApiList?.unarchiveTheme(companyId = config.companyId , applicationId = applicationId , themeId = themeId )
    }
    
}
}

class UserDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val userApiList by lazy {
        generateuserApiList()
    }
    
    private fun generateuserApiList(): UserApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "User"
        )
        return retrofitHttpClient?.initializeRestClient(UserApiList::class.java) as? UserApiList
    }
    
    
    
    
    

class Application(val applicationId:String,val config: PlatformConfig){

    private val userApiList by lazy {
        generateuserApiList()
    }

    private fun generateuserApiList(): UserApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "User"
        )
        return retrofitHttpClient?.initializeRestClient(UserApiList::class.java) as? UserApiList
    }
    
    
    fun getCustomers(q: String?=null, pageSize: Int?=null, pageNo: Int?=null)
    : Deferred<Response<CustomerListResponseSchema>>? {
        return userApiList?.getCustomers(companyId = config.companyId , applicationId = applicationId , q = q, pageSize = pageSize, pageNo = pageNo )
    }
    
    
    fun searchUsers(query: String?=null)
    : Deferred<Response<UserSearchResponseSchema>>? {
        return userApiList?.searchUsers(companyId = config.companyId , applicationId = applicationId , query = query )
    }
    
    
    fun getPlatformConfig()
    : Deferred<Response<PlatformSchema>>? {
        return userApiList?.getPlatformConfig(companyId = config.companyId , applicationId = applicationId  )
    }
    
    
    fun updatePlatformConfig(body: PlatformSchema)
    : Deferred<Response<PlatformSchema>>? {
        return userApiList?.updatePlatformConfig(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
}
}

class ContentDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val contentApiList by lazy {
        generatecontentApiList()
    }
    
    private fun generatecontentApiList(): ContentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Content"
        )
        return retrofitHttpClient?.initializeRestClient(ContentApiList::class.java) as? ContentApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

class Application(val applicationId:String,val config: PlatformConfig){

    private val contentApiList by lazy {
        generatecontentApiList()
    }

    private fun generatecontentApiList(): ContentApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Content"
        )
        return retrofitHttpClient?.initializeRestClient(ContentApiList::class.java) as? ContentApiList
    }
    
    
    fun getAnnouncementsList()
    : Deferred<Response<GetAnnouncementListSchema>>? {
        return contentApiList?.getAnnouncementsList(companyId = config.companyId , applicationId = applicationId  )
    }
    
    
    fun createAnnouncement(body: AdminAnnouncementSchema)
    : Deferred<Response<CreateAnnouncementSchema>>? {
        return contentApiList?.createAnnouncement(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun getAnnouncementById(announcementId: String)
    : Deferred<Response<AdminAnnouncementSchema>>? {
        return contentApiList?.getAnnouncementById(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId )
    }
    
    
    fun updateAnnouncement(announcementId: String,body: AdminAnnouncementSchema)
    : Deferred<Response<CreateAnnouncementSchema>>? {
        return contentApiList?.updateAnnouncement(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId, body = body)
    }
    
    
    fun updateAnnouncementSchedule(announcementId: String,body: ScheduleSchema)
    : Deferred<Response<CreateAnnouncementSchema>>? {
        return contentApiList?.updateAnnouncementSchedule(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId, body = body)
    }
    
    
    fun deleteAnnouncement(announcementId: String)
    : Deferred<Response<CreateAnnouncementSchema>>? {
        return contentApiList?.deleteAnnouncement(companyId = config.companyId , applicationId = applicationId , announcementId = announcementId )
    }
    
    
    fun getFaqCategories()
    : Deferred<Response<GetFaqCategoriesSchema>>? {
        return contentApiList?.getFaqCategories(companyId = config.companyId , applicationId = applicationId  )
    }
    
    
    fun getFaqCategoryBySlugOrId(idOrSlug: String)
    : Deferred<Response<GetFaqCategoryByIdOrSlugSchema>>? {
        return contentApiList?.getFaqCategoryBySlugOrId(companyId = config.companyId , applicationId = applicationId , idOrSlug = idOrSlug )
    }
    
    
    fun createFaqCategory(body: CreateFaqCategoryRequestSchema)
    : Deferred<Response<CreateFaqCategorySchema>>? {
        return contentApiList?.createFaqCategory(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun updateFaqCategory(id: String,body: UpdateFaqCategoryRequestSchema)
    : Deferred<Response<CreateFaqCategorySchema>>? {
        return contentApiList?.updateFaqCategory(companyId = config.companyId , applicationId = applicationId , id = id, body = body)
    }
    
    
    fun deleteFaqCategory(id: String)
    : Deferred<Response<CreateFaqCategorySchema>>? {
        return contentApiList?.deleteFaqCategory(companyId = config.companyId , applicationId = applicationId , id = id )
    }
    
    
    fun getFaqsByCategoryIdOrSlug(idOrSlug: String)
    : Deferred<Response<GetFaqSchema>>? {
        return contentApiList?.getFaqsByCategoryIdOrSlug(companyId = config.companyId , applicationId = applicationId , idOrSlug = idOrSlug )
    }
    
    
    fun addFaqToFaqCategory(categoryId: String,body: CreateFaqSchema)
    : Deferred<Response<CreateFaqResponseSchema>>? {
        return contentApiList?.addFaqToFaqCategory(companyId = config.companyId , applicationId = applicationId , categoryId = categoryId, body = body)
    }
    
    
    fun updateFaq(categoryId: String, faqId: String,body: CreateFaqSchema)
    : Deferred<Response<CreateFaqResponseSchema>>? {
        return contentApiList?.updateFaq(companyId = config.companyId , applicationId = applicationId , categoryId = categoryId, faqId = faqId, body = body)
    }
    
    
    fun deleteFaq(categoryId: String, faqId: String)
    : Deferred<Response<CreateFaqResponseSchema>>? {
        return contentApiList?.deleteFaq(companyId = config.companyId , applicationId = applicationId , categoryId = categoryId, faqId = faqId )
    }
    
    
    fun getLegalInformation()
    : Deferred<Response<ApplicationLegal>>? {
        return contentApiList?.getLegalInformation(companyId = config.companyId , applicationId = applicationId  )
    }
    
    
    fun updateLegalInformation(body: ApplicationLegal)
    : Deferred<Response<ApplicationLegal>>? {
        return contentApiList?.updateLegalInformation(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun getSeoConfiguration()
    : Deferred<Response<Seo>>? {
        return contentApiList?.getSeoConfiguration(companyId = config.companyId , applicationId = applicationId  )
    }
    
    
    fun updateSeoConfiguration(body: Seo)
    : Deferred<Response<Seo>>? {
        return contentApiList?.updateSeoConfiguration(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun getSupportInformation()
    : Deferred<Response<Support>>? {
        return contentApiList?.getSupportInformation(companyId = config.companyId , applicationId = applicationId  )
    }
    
    
    fun updateSupportInformation(body: Support)
    : Deferred<Response<Support>>? {
        return contentApiList?.updateSupportInformation(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun createTag(body: CreateTagRequestSchema)
    : Deferred<Response<TagsSchema>>? {
        return contentApiList?.createTag(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun updateTag(body: CreateTagRequestSchema)
    : Deferred<Response<TagsSchema>>? {
        return contentApiList?.updateTag(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun deleteAllTags()
    : Deferred<Response<TagsSchema>>? {
        return contentApiList?.deleteAllTags(companyId = config.companyId , applicationId = applicationId  )
    }
    
    
    fun getTags()
    : Deferred<Response<TagsSchema>>? {
        return contentApiList?.getTags(companyId = config.companyId , applicationId = applicationId  )
    }
    
    
    fun addTag(body: CreateTagRequestSchema)
    : Deferred<Response<TagsSchema>>? {
        return contentApiList?.addTag(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun removeTag(body: RemoveHandpickedSchema)
    : Deferred<Response<TagsSchema>>? {
        return contentApiList?.removeTag(companyId = config.companyId , applicationId = applicationId , body = body)
    }
    
    
    fun editTag(tagId: String,body: UpdateHandpickedSchema)
    : Deferred<Response<TagsSchema>>? {
        return contentApiList?.editTag(companyId = config.companyId , applicationId = applicationId , tagId = tagId, body = body)
    }
    
}
}

class CommunicationDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val communicationApiList by lazy {
        generatecommunicationApiList()
    }
    
    private fun generatecommunicationApiList(): CommunicationApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Communication"
        )
        return retrofitHttpClient?.initializeRestClient(CommunicationApiList::class.java) as? CommunicationApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

class Application(val applicationId:String,val config: PlatformConfig){

    private val communicationApiList by lazy {
        generatecommunicationApiList()
    }

    private fun generatecommunicationApiList(): CommunicationApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Communication"
        )
        return retrofitHttpClient?.initializeRestClient(CommunicationApiList::class.java) as? CommunicationApiList
    }
    
    
    fun getCampaigns()
    : Deferred<Response<Campaigns>>? {
        return communicationApiList?.getCampaigns( )
    }
    
    
    fun createCampaign(body: CampaignReq)
    : Deferred<Response<Campaign>>? {
        return communicationApiList?.createCampaign( body = body)
    }
    
    
    fun getCampaignById(id: String)
    : Deferred<Response<Campaign>>? {
        return communicationApiList?.getCampaignById(id = id )
    }
    
    
    fun updateCampaignById(id: String,body: CampaignReq)
    : Deferred<Response<Campaign>>? {
        return communicationApiList?.updateCampaignById(id = id, body = body)
    }
    
    
    fun getStatsOfCampaignById(id: String)
    : Deferred<Response<GetStats>>? {
        return communicationApiList?.getStatsOfCampaignById(id = id )
    }
    
    
    fun getAudiences()
    : Deferred<Response<Audiences>>? {
        return communicationApiList?.getAudiences( )
    }
    
    
    fun createAudience(body: AudienceReq)
    : Deferred<Response<Audience>>? {
        return communicationApiList?.createAudience( body = body)
    }
    
    
    fun getBigqueryHeaders(body: BigqueryHeadersReq)
    : Deferred<Response<BigqueryHeadersRes>>? {
        return communicationApiList?.getBigqueryHeaders( body = body)
    }
    
    
    fun getAudienceById(id: String)
    : Deferred<Response<Audience>>? {
        return communicationApiList?.getAudienceById(id = id )
    }
    
    
    fun updateAudienceById(id: String,body: AudienceReq)
    : Deferred<Response<Audience>>? {
        return communicationApiList?.updateAudienceById(id = id, body = body)
    }
    
    
    fun getNSampleRecordsFromCsv(body: GetNRecordsCsvReq)
    : Deferred<Response<GetNRecordsCsvRes>>? {
        return communicationApiList?.getNSampleRecordsFromCsv( body = body)
    }
    
    
    fun getEmailProviders(companyId: String, applicationId: String)
    : Deferred<Response<EmailProviders>>? {
        return communicationApiList?.getEmailProviders(companyId = companyId, applicationId = applicationId )
    }
    
    
    fun createEmailProvider(body: EmailProviderReq)
    : Deferred<Response<EmailProvider>>? {
        return communicationApiList?.createEmailProvider( body = body)
    }
    
    
    fun getEmailProviderById(id: String)
    : Deferred<Response<EmailProvider>>? {
        return communicationApiList?.getEmailProviderById(id = id )
    }
    
    
    fun updateEmailProviderById(id: String,body: EmailProviderReq)
    : Deferred<Response<EmailProvider>>? {
        return communicationApiList?.updateEmailProviderById(id = id, body = body)
    }
    
    
    fun getEmailTemplates()
    : Deferred<Response<EmailTemplates>>? {
        return communicationApiList?.getEmailTemplates( )
    }
    
    
    fun createEmailTemplate(body: EmailTemplateReq)
    : Deferred<Response<EmailTemplateRes>>? {
        return communicationApiList?.createEmailTemplate( body = body)
    }
    
    
    fun getSystemEmailTemplates()
    : Deferred<Response<SystemEmailTemplates>>? {
        return communicationApiList?.getSystemEmailTemplates( )
    }
    
    
    fun getEmailTemplateById(id: String)
    : Deferred<Response<EmailTemplate>>? {
        return communicationApiList?.getEmailTemplateById(id = id )
    }
    
    
    fun updateEmailTemplateById(id: String,body: EmailTemplateReq)
    : Deferred<Response<EmailTemplateRes>>? {
        return communicationApiList?.updateEmailTemplateById(id = id, body = body)
    }
    
    
    fun deleteEmailTemplateById(id: String)
    : Deferred<Response<EmailTemplateDeleteSuccessRes>>? {
        return communicationApiList?.deleteEmailTemplateById(id = id )
    }
    
    
    fun getEventSubscriptions(companyId: String, applicationId: String)
    : Deferred<Response<EventSubscriptions>>? {
        return communicationApiList?.getEventSubscriptions(companyId = companyId, applicationId = applicationId )
    }
    
    
    fun getJobs(companyId: String, applicationId: String)
    : Deferred<Response<Jobs>>? {
        return communicationApiList?.getJobs(companyId = companyId, applicationId = applicationId )
    }
    
    
    fun triggerCampaignJob(body: TriggerJobRequest)
    : Deferred<Response<TriggerJobResponse>>? {
        return communicationApiList?.triggerCampaignJob( body = body)
    }
    
    
    fun getJobLogs(companyId: String, applicationId: String)
    : Deferred<Response<JobLogs>>? {
        return communicationApiList?.getJobLogs(companyId = companyId, applicationId = applicationId )
    }
    
    
    fun getCommunicationLogs(companyId: String, applicationId: String)
    : Deferred<Response<Logs>>? {
        return communicationApiList?.getCommunicationLogs(companyId = companyId, applicationId = applicationId )
    }
    
    
    fun getSmsProviders()
    : Deferred<Response<SmsProviders>>? {
        return communicationApiList?.getSmsProviders( )
    }
    
    
    fun createSmsProvider(body: SmsProviderReq)
    : Deferred<Response<SmsProvider>>? {
        return communicationApiList?.createSmsProvider( body = body)
    }
    
    
    fun getSmsProviderById(id: String)
    : Deferred<Response<SmsProvider>>? {
        return communicationApiList?.getSmsProviderById(id = id )
    }
    
    
    fun updateSmsProviderById(id: String,body: SmsProviderReq)
    : Deferred<Response<SmsProvider>>? {
        return communicationApiList?.updateSmsProviderById(id = id, body = body)
    }
    
    
    fun getSmsTemplates()
    : Deferred<Response<SmsTemplates>>? {
        return communicationApiList?.getSmsTemplates( )
    }
    
    
    fun createSmsTemplate(body: SmsTemplateReq)
    : Deferred<Response<SmsTemplateRes>>? {
        return communicationApiList?.createSmsTemplate( body = body)
    }
    
    
    fun getSmsTemplateById(id: String)
    : Deferred<Response<SmsTemplate>>? {
        return communicationApiList?.getSmsTemplateById(id = id )
    }
    
    
    fun updateSmsTemplateById(id: String,body: SmsTemplateReq)
    : Deferred<Response<SmsTemplateRes>>? {
        return communicationApiList?.updateSmsTemplateById(id = id, body = body)
    }
    
    
    fun deleteSmsTemplateById(id: String)
    : Deferred<Response<SmsTemplateDeleteSuccessRes>>? {
        return communicationApiList?.deleteSmsTemplateById(id = id )
    }
    
    
    fun getSystemSystemTemplates()
    : Deferred<Response<SystemSmsTemplates>>? {
        return communicationApiList?.getSystemSystemTemplates( )
    }
    
}
}

class CompanyProfileDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val companyProfileApiList by lazy {
        generatecompanyProfileApiList()
    }
    
    private fun generatecompanyProfileApiList(): CompanyProfileApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "CompanyProfile"
        )
        return retrofitHttpClient?.initializeRestClient(CompanyProfileApiList::class.java) as? CompanyProfileApiList
    }
    
    
    fun registerCompany(body: CompanyStoreSerializerRequest)
    : Deferred<Response<SuccessResponse>>? {
        return companyProfileApiList?.registerCompany(
         body = body)
    }
    
    
    fun cbsOnboardEdit(body: CompanyStoreSerializerRequest)
    : Deferred<Response<SuccessResponse>>? {
        return companyProfileApiList?.cbsOnboardEdit(
        companyId = config.companyId, body = body)
    }
    
    
    fun cbsOnboardGet()
    : Deferred<Response<GetCompanyProfileSerializerResponse>>? {
        return companyProfileApiList?.cbsOnboardGet(
        companyId = config.companyId )
    }
    
    
    fun companyList(sortBy: String?=null, q: String?=null, stage: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<CompanyListSerializer>>? {
        return companyProfileApiList?.companyList(
        sortBy = sortBy, q = q, stage = stage, pageNo = pageNo, pageSize = pageSize )
    }
    
    
    fun getCompanyMetrics()
    : Deferred<Response<MetricsSerializer>>? {
        return companyProfileApiList?.getCompanyMetrics(
        companyId = config.companyId )
    }
    
    
    fun getCountries(type: String?=null, stage: String?=null)
    : Deferred<Response<CountriesResponse>>? {
        return companyProfileApiList?.getCountries(
        type = type, stage = stage )
    }
    
    
    fun verifyGstPan(body: GstPanResponseSerializer)
    : Deferred<Response<SuccessResponse>>? {
        return companyProfileApiList?.verifyGstPan(
         body = body)
    }
    
    
    fun editBrand(brandId: String,body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        return companyProfileApiList?.editBrand(
        brandId = brandId, body = body)
    }
    
    
    fun getBrand(brandId: String)
    : Deferred<Response<GetBrandResponseSerializer>>? {
        return companyProfileApiList?.getBrand(
        brandId = brandId )
    }
    
    
    fun createBrand(body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        return companyProfileApiList?.createBrand(
         body = body)
    }
    
    
    fun createCompanyBrand(body: CompanyBrandPostRequestSerializer)
    : Deferred<Response<SuccessResponse>>? {
        return companyProfileApiList?.createCompanyBrand(
        companyId = config.companyId, body = body)
    }
    
    
    fun getCompanyBrands()
    : Deferred<Response<CompanyBrandListSerializer>>? {
        return companyProfileApiList?.getCompanyBrands(
        companyId = config.companyId )
    }
    
    
    fun createLocation(body: LocationSerializer)
    : Deferred<Response<SuccessResponse>>? {
        return companyProfileApiList?.createLocation(
        companyId = config.companyId, body = body)
    }
    
    
    fun locationList(storeType: String?=null, q: String?=null, stage: String?=null, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<LocationListSerializer>>? {
        return companyProfileApiList?.locationList(
        companyId = config.companyId, storeType = storeType, q = q, stage = stage, pageNo = pageNo, pageSize = pageSize )
    }
    
    
    fun editLocation(locationId: String,body: LocationSerializer)
    : Deferred<Response<SuccessResponse>>? {
        return companyProfileApiList?.editLocation(
        companyId = config.companyId, locationId = locationId, body = body)
    }
    
    
    fun getSingleLocation(locationId: String)
    : Deferred<Response<GetLocationSerializer>>? {
        return companyProfileApiList?.getSingleLocation(
        companyId = config.companyId, locationId = locationId )
    }
    
    
    fun getChoices(choiceType: String?=null)
    : Deferred<Response<ChoicesResponse>>? {
        return companyProfileApiList?.getChoices(
        choiceType = choiceType )
    }
    
    
    fun validateSeller()
    : Deferred<Response<ValidateResponse>>? {
        return companyProfileApiList?.validateSeller(
        companyId = config.companyId )
    }
    

class Application(val applicationId:String,val config: PlatformConfig){

    private val companyProfileApiList by lazy {
        generatecompanyProfileApiList()
    }

    private fun generatecompanyProfileApiList(): CompanyProfileApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "CompanyProfile"
        )
        return retrofitHttpClient?.initializeRestClient(CompanyProfileApiList::class.java) as? CompanyProfileApiList
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}

class InventoryDataManagerClass(val config: PlatformConfig) : BaseRepository() {        
       
    private val inventoryApiList by lazy {
        generateinventoryApiList()
    }
    
    private fun generateinventoryApiList(): InventoryApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Inventory"
        )
        return retrofitHttpClient?.initializeRestClient(InventoryApiList::class.java) as? InventoryApiList
    }
    
    
    fun getJobs(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigRawDTO>>? {
        return inventoryApiList?.getJobs(
        pageNo = pageNo, pageSize = pageSize )
    }
    
    
    fun update(xUserData: String?=null,body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>? {
        return inventoryApiList?.update(
        xUserData = xUserData, body = body)
    }
    
    
    fun create(xUserData: String?=null,body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>? {
        return inventoryApiList?.create(
        xUserData = xUserData, body = body)
    }
    
    
    fun getJobConfigDefaults()
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>? {
        return inventoryApiList?.getJobConfigDefaults(
         )
    }
    
    
    fun getJobsByCompany(pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigRawDTO>>? {
        return inventoryApiList?.getJobsByCompany(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize )
    }
    
    
    fun getJobByCompanyAndIntegration(integrationId: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigDTO>>? {
        return inventoryApiList?.getJobByCompanyAndIntegration(
        companyId = config.companyId, integrationId = integrationId, pageNo = pageNo, pageSize = pageSize )
    }
    
    
    fun getJobByCode(code: String)
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>? {
        return inventoryApiList?.getJobByCode(
        code = code )
    }
    
    
    fun getJobCodesByCompanyAndIntegration(integrationId: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<ResponseEnvelopeListJobConfigListDTO>>? {
        return inventoryApiList?.getJobCodesByCompanyAndIntegration(
        companyId = config.companyId, integrationId = integrationId, pageNo = pageNo, pageSize = pageSize )
    }
    

class Application(val applicationId:String,val config: PlatformConfig){

    private val inventoryApiList by lazy {
        generateinventoryApiList()
    }

    private fun generateinventoryApiList(): InventoryApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerList: Map<String, String> = NetworkUtils.getCommonRestHeaders(applicationConfig = config)
        val headerInterceptor = HeaderInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            config.domain,
            headerList, interceptorMap, "Inventory"
        )
        return retrofitHttpClient?.initializeRestClient(InventoryApiList::class.java) as? InventoryApiList
    }
    
    
    
    
    
    
    
    
    
}
}