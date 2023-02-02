package com.sdk.platform

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody

import retrofit2.http.*

interface CommonApiList {
    
    @GET ("/service/common/configuration/v1.0/application/search-application")
    fun searchApplication(@Header("authorization") authorization: String?, @Query("query") query: String?)
    : Deferred<Response<ApplicationResponse>>
    
    @GET ("/service/common/configuration/v1.0/location")
    fun getLocations(@Query("location_type") locationType: String?, @Query("id") id: String?)
    : Deferred<Response<Locations>>
    
}

interface LeadApiList {
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    fun getTickets(@Path("company_id") companyId: String, @Query("items") items: Boolean?, @Query("filters") filters: Boolean?, @Query("q") q: String?, @Query("status") status: String?, @Query("priority") priority: PriorityEnum?, @Query("category") category: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<TicketList>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    fun createTicket(@Path("company_id") companyId: String,@Body body: AddTicketPayload)
    : Deferred<Response<Ticket>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket")
    fun getTickets(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("items") items: Boolean?, @Query("filters") filters: Boolean?, @Query("q") q: String?, @Query("status") status: String?, @Query("priority") priority: PriorityEnum?, @Query("category") category: String?)
    : Deferred<Response<TicketList>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    fun getTicket(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<Ticket>>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    fun editTicket(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: EditTicketPayload)
    : Deferred<Response<Ticket>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    fun getTicket(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<Ticket>>
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    fun editTicket(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EditTicketPayload)
    : Deferred<Response<Ticket>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    fun createHistory(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    fun getTicketHistory(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<TicketHistoryList>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    fun getFeedbacks(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<TicketFeedbackList>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    fun submitFeedback(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: TicketFeedbackPayload)
    : Deferred<Response<TicketFeedback>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    fun createHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: TicketHistoryPayload)
    : Deferred<Response<TicketHistory>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    fun getTicketHistory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
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
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/video/room/{unique_name}/token")
    fun getTokenForVideoRoom(@Path("company_id") companyId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/token")
    fun getTokenForVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<GetTokenForVideoRoomResponse>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/video/room/{unique_name}/participants")
    fun getVideoParticipants(@Path("company_id") companyId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/participants")
    fun getVideoParticipants(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<GetParticipantsInsideVideoRoomResponse>>
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room")
    fun openVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateVideoRoomPayload)
    : Deferred<Response<CreateVideoRoomResponse>>
    
    @DELETE ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}")
    fun closeVideoRoom(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("unique_name") uniqueName: String)
    : Deferred<Response<CloseVideoRoomResponse>>
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/general-config")
    fun getGeneralConfig(@Path("company_id") companyId: String)
    : Deferred<Response<CloseVideoRoomResponse>>
    
}

interface ThemeApiList {
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    fun getAllPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<AllAvailablePageSchema>>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    fun createPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: AvailablePageSchema)
    : Deferred<Response<AvailablePageSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    fun updateMultiplePages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: AllAvailablePageSchema)
    : Deferred<Response<AllAvailablePageSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    fun getPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String)
    : Deferred<Response<AvailablePageSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    fun updatePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String,@Body body: AvailablePageSchema)
    : Deferred<Response<AvailablePageSchema>>
    
    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    fun deletePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String, @Path("page_value") pageValue: String)
    : Deferred<Response<AvailablePageSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    fun getThemeLibrary(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Deferred<Response<ThemesListingResponseSchema>>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    fun addToThemeLibrary(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/apply")
    fun applyTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddThemeRequestSchema)
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/upgradable")
    fun isUpgradable(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<UpgradableThemeSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/upgrade")
    fun upgradeTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/list/public")
    fun getPublicThemes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Deferred<Response<ThemesListingResponseSchema>>
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/")
    fun createTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/")
    fun getAppliedTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/fonts")
    fun getFonts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<FontsSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    fun getThemeById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    fun updateTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String,@Body body: ThemesSchema)
    : Deferred<Response<ThemesSchema>>
    
    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    fun deleteTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/preview")
    fun getThemeForPreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/publish")
    fun publishTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unpublish")
    fun unpublishTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/archive")
    fun archiveTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unarchive")
    fun unarchiveTheme(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<ThemesSchema>>
    
    @HEAD ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/polling")
    fun getThemeLastModified(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("theme_id") themeId: String)
    : Deferred<Response<Void>>
    
}

interface UserApiList {
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/list")
    fun getCustomers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: HashMap<String,Any>?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Deferred<Response<CustomerListResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/search")
    fun searchUsers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?)
    : Deferred<Response<UserSearchResponseSchema>>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers")
    fun createUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserRequestSchema)
    : Deferred<Response<CreateUserResponseSchema>>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/activation")
    fun blockOrUnblockUsers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BlockUserRequestSchema)
    : Deferred<Response<BlockUserSuccess>>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/archive")
    fun archiveUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ArchiveUserRequestSchema)
    : Deferred<Response<ArchiveUserSuccess>>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/undelete")
    fun unDeleteUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: UnDeleteUserRequestSchema)
    : Deferred<Response<UnDeleteUserSuccess>>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/{user_id}")
    fun updateUser(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("user_id") userId: String,@Body body: UpdateUserRequestSchema)
    : Deferred<Response<CreateUserResponseSchema>>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    fun createUserSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserSessionRequestSchema)
    : Deferred<Response<CreateUserSessionResponseSchema>>
    
    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    fun deleteSession(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String)
    : Deferred<Response<SessionDeleteResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sessions")
    fun getActiveSessions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String)
    : Deferred<Response<SessionListResponseSchema>>
    
    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sessions")
    fun deleteActiveSessions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String)
    : Deferred<Response<SessionDeleteResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    fun getPlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<PlatformSchema>>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    fun updatePlatformConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PlatformSchema)
    : Deferred<Response<PlatformSchema>>
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group")
    fun createUserGroup(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateUserGroupSchema)
    : Deferred<Response<UserGroupResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group")
    fun getUserGroups(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: String?, @Query("page_size") pageSize: String?, @Query("name") name: String?, @Query("status") status: String?)
    : Deferred<Response<UserGroupListResponseSchema>>
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    fun updateUserGroup(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("group_id") groupId: String,@Body body: UpdateUserGroupSchema)
    : Deferred<Response<UserGroupResponseSchema>>
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    fun getUserGroupById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("group_id") groupId: String)
    : Deferred<Response<UserGroupResponseSchema>>
    
}

interface ContentApiList {
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    fun getAnnouncementsList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetAnnouncementListSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    fun createAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AdminAnnouncementSchema)
    : Deferred<Response<CreateAnnouncementSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    fun getAnnouncementById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String)
    : Deferred<Response<AdminAnnouncementSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    fun updateAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String,@Body body: AdminAnnouncementSchema)
    : Deferred<Response<CreateAnnouncementSchema>>
    
    @PATCH ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    fun updateAnnouncementSchedule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String,@Body body: ScheduleSchema)
    : Deferred<Response<CreateAnnouncementSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    fun deleteAnnouncement(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("announcement_id") announcementId: String)
    : Deferred<Response<CreateAnnouncementSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    fun createBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BlogRequest)
    : Deferred<Response<BlogSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    fun getBlogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BlogGetResponse>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    fun updateBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: BlogRequest)
    : Deferred<Response<BlogSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    fun deleteBlog(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<BlogSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{slug}")
    fun getComponentById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<BlogSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    fun addDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DataLoaderSchema)
    : Deferred<Response<DataLoaderResponseSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    fun getDataLoaders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<DataLoadersSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    fun deleteDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String)
    : Deferred<Response<DataLoaderResponseSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    fun editDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String,@Body body: DataLoaderSchema)
    : Deferred<Response<DataLoaderResponseSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}/select")
    fun selectDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("data_loader_id") dataLoaderId: String)
    : Deferred<Response<DataLoaderResponseSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{service}/{operation_id}/reset")
    fun resetDataLoader(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("service") service: String, @Path("operation_id") operationId: String)
    : Deferred<Response<DataLoaderResetResponseSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/categories")
    fun getFaqCategories(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetFaqCategoriesSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}")
    fun getFaqCategoryBySlugOrId(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String)
    : Deferred<Response<GetFaqCategoryBySlugSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category")
    fun createFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateFaqCategoryRequestSchema)
    : Deferred<Response<CreateFaqCategorySchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    fun updateFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateFaqCategoryRequestSchema)
    : Deferred<Response<CreateFaqCategorySchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    fun deleteFaqCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<FaqSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}/faqs")
    fun getFaqsByCategoryIdOrSlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String)
    : Deferred<Response<GetFaqSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faqs")
    fun addFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String,@Body body: CreateFaqSchema)
    : Deferred<Response<CreateFaqResponseSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    fun updateFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String, @Path("faq_id") faqId: String,@Body body: CreateFaqSchema)
    : Deferred<Response<CreateFaqResponseSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    fun deleteFaq(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_id") categoryId: String, @Path("faq_id") faqId: String)
    : Deferred<Response<CreateFaqResponseSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/{id_or_slug}")
    fun getFaqByIdOrSlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id_or_slug") idOrSlug: String)
    : Deferred<Response<CreateFaqResponseSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    fun getLandingPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<LandingPageGetResponse>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    fun createLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: LandingPageSchema)
    : Deferred<Response<LandingPageSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    fun updateLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: LandingPageSchema)
    : Deferred<Response<LandingPageSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    fun deleteLandingPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<LandingPageSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    fun getLegalInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationLegal>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    fun updateLegalInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: ApplicationLegal)
    : Deferred<Response<ApplicationLegal>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    fun getNavigations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("device_platform") devicePlatform: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<NavigationGetResponse>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    fun createNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: NavigationRequest)
    : Deferred<Response<NavigationSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/default")
    fun getDefaultNavigations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<DefaultNavigationResponse>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{slug}")
    fun getNavigationBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Query("device_platform") devicePlatform: String)
    : Deferred<Response<NavigationSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    fun updateNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: NavigationRequest)
    : Deferred<Response<NavigationSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    fun deleteNavigation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<NavigationSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/meta")
    fun getPageMeta(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_type") pageType: String?, @Query("cart_pages") cartPages: Boolean?)
    : Deferred<Response<PageMetaSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/spec")
    fun getPageSpec(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<PageSpec>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/publish/{slug}")
    fun updatePagePreview(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String,@Body body: PagePublishRequest)
    : Deferred<Response<PageSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/{id}")
    fun deletePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<PageSchema>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    fun addPathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PathMappingSchema)
    : Deferred<Response<PathMappingSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    fun getPathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?)
    : Deferred<Response<PathMappingSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    fun getPathRedirectionRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String)
    : Deferred<Response<PathMappingSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    fun updatePathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String,@Body body: PathMappingSchema)
    : Deferred<Response<PathMappingSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    fun deletePathRedirectionRules(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("path_id") pathId: String)
    : Deferred<Response<HashMap<String,Any>>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    fun getSEOConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<SeoComponent>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    fun updateSEOConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SeoComponent)
    : Deferred<Response<SeoSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/")
    fun getSlideshows(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("device_platform") devicePlatform: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<SlideshowGetResponse>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/")
    fun createSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SlideshowRequest)
    : Deferred<Response<SlideshowSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{slug}")
    fun getSlideshowBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String, @Query("device_platform") devicePlatform: String)
    : Deferred<Response<SlideshowSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    fun updateSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SlideshowRequest)
    : Deferred<Response<SlideshowSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    fun deleteSlideshow(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<SlideshowSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    fun getSupportInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<Support>>
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    fun updateSupportInformation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Support)
    : Deferred<Response<Support>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    fun updateInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateTagRequestSchema)
    : Deferred<Response<TagsSchema>>
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    fun deleteAllInjectableTags(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<TagsSchema>>
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    fun getInjectableTags(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<TagsSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/add")
    fun addInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateTagRequestSchema)
    : Deferred<Response<TagsSchema>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/remove/handpicked")
    fun removeInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: RemoveHandpickedSchema)
    : Deferred<Response<TagDeleteSuccessResponse>>
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/edit/handpicked/{tag_id}")
    fun editInjectableTag(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("tag_id") tagId: String,@Body body: UpdateHandpickedSchema)
    : Deferred<Response<TagsSchema>>
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    fun createPage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PageRequest)
    : Deferred<Response<PageSchema>>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    fun getPages(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<PageGetResponse>>
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{id}")
    fun updatePage(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PageSchema)
    : Deferred<Response<PageSchema>>
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{slug}")
    fun getPageBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<PageSchema>>
    
}

interface BillingApiList {
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/coupon/check-validity")
    fun checkCouponValidity(@Path("company_id") companyId: String, @Query("plan") plan: String, @Query("coupon_code") couponCode: String)
    : Deferred<Response<CheckValidityResponse>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription")
    fun createSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String,@Body body: CreateSubscriptionCharge)
    : Deferred<Response<CreateSubscriptionResponse>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}")
    fun getSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("subscription_id") subscriptionId: String)
    : Deferred<Response<EntitySubscription>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}/cancel")
    fun cancelSubscriptionCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("subscription_id") subscriptionId: String)
    : Deferred<Response<EntitySubscription>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/one_time_charge")
    fun createOneTimeCharge(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String,@Body body: CreateOneTimeCharge)
    : Deferred<Response<CreateOneTimeChargeResponse>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/charge/{charge_id}")
    fun getChargeDetails(@Path("company_id") companyId: String, @Path("extension_id") extensionId: String, @Path("charge_id") chargeId: String)
    : Deferred<Response<OneTimeChargeEntity>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/list")
    fun getInvoices(@Path("company_id") companyId: String)
    : Deferred<Response<Invoices>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/{invoice_id}")
    fun getInvoiceById(@Path("company_id") companyId: String, @Path("invoice_id") invoiceId: String)
    : Deferred<Response<Invoice>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    fun getCustomerDetail(@Path("company_id") companyId: String)
    : Deferred<Response<SubscriptionCustomer>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    fun upsertCustomerDetail(@Path("company_id") companyId: String,@Body body: SubscriptionCustomerCreate)
    : Deferred<Response<SubscriptionCustomer>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current")
    fun getSubscription(@Path("company_id") companyId: String)
    : Deferred<Response<SubscriptionStatus>>
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current-limit")
    fun getFeatureLimitConfig(@Path("company_id") companyId: String)
    : Deferred<Response<SubscriptionLimit>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/activate")
    fun activateSubscriptionPlan(@Path("company_id") companyId: String,@Body body: SubscriptionActivateReq)
    : Deferred<Response<SubscriptionActivateRes>>
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/cancel")
    fun cancelSubscriptionPlan(@Path("company_id") companyId: String,@Body body: CancelSubscriptionReq)
    : Deferred<Response<CancelSubscriptionRes>>
    
}

interface CommunicationApiList {
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    fun getCampaigns(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<Campaigns>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    fun createCampaign(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CampaignReq)
    : Deferred<Response<Campaign>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    fun getCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<Campaign>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    fun updateCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CampaignReq)
    : Deferred<Response<Campaign>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/get-stats/{id}")
    fun getStatsOfCampaignById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<GetStats>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    fun getAudiences(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<Audiences>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    fun createAudience(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AudienceReq)
    : Deferred<Response<Audience>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/bigquery-headers")
    fun getBigqueryHeaders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BigqueryHeadersReq)
    : Deferred<Response<BigqueryHeadersRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    fun getAudienceById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<Audience>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    fun updateAudienceById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: AudienceReq)
    : Deferred<Response<Audience>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/get-n-records")
    fun getNSampleRecordsFromCsv(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetNRecordsCsvReq)
    : Deferred<Response<GetNRecordsCsvRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    fun getEmailProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<EmailProviders>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    fun createEmailProvider(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EmailProviderReq)
    : Deferred<Response<EmailProvider>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    fun getEmailProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<EmailProvider>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    fun updateEmailProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EmailProviderReq)
    : Deferred<Response<EmailProvider>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    fun getEmailTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<EmailTemplates>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    fun createEmailTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EmailTemplateReq)
    : Deferred<Response<EmailTemplateRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/system-templates")
    fun getSystemEmailTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<SystemEmailTemplates>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    fun getEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<EmailTemplate>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    fun updateEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: EmailTemplateReq)
    : Deferred<Response<EmailTemplateRes>>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    fun deleteEmailTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<EmailTemplateDeleteSuccessRes>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-instant")
    fun sendCommunicationSynchronously(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EngineRequest)
    : Deferred<Response<EngineResponse>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-async")
    fun sendCommunicationAsynchronously(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: EngineRequest)
    : Deferred<Response<EngineResponse>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions")
    fun getEventSubscriptions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("populate") populate: String?)
    : Deferred<Response<EventSubscriptions>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/jobs")
    fun getJobs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<Jobs>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/trigger-job")
    fun triggerCampaignJob(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: TriggerJobRequest)
    : Deferred<Response<TriggerJobResponse>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/logs")
    fun getJobLogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<JobLogs>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/log")
    fun getCommunicationLogs(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?, @Query("query") query: HashMap<String,Any>?)
    : Deferred<Response<Logs>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/notification/system-notifications/")
    fun getSystemNotifications(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<SystemNotifications>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/send-otp-comms")
    fun sendOtp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SendOtpCommsReq)
    : Deferred<Response<SendOtpCommsRes>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/verify-otp-comms")
    fun verfiyOtp(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: VerifyOtpCommsReq)
    : Deferred<Response<VerifyOtpCommsSuccessRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    fun getSmsProviders(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<SmsProviders>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    fun createSmsProvider(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SmsProviderReq)
    : Deferred<Response<SmsProvider>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    fun getSmsProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<SmsProvider>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    fun updateSmsProviderById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SmsProviderReq)
    : Deferred<Response<SmsProvider>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    fun getSmsTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<SmsTemplates>>
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    fun createSmsTemplate(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SmsTemplateReq)
    : Deferred<Response<SmsTemplateRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    fun getSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<SmsTemplate>>
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    fun updateSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: SmsTemplateReq)
    : Deferred<Response<SmsTemplateRes>>
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    fun deleteSmsTemplateById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<SmsTemplateDeleteSuccessRes>>
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/system-templates")
    fun getSystemSystemTemplates(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("sort") sort: HashMap<String,Any>?)
    : Deferred<Response<SystemSmsTemplates>>
    
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
    fun getSubscriptionPaymentMethod(@Path("company_id") companyId: String, @Query("unique_external_id") uniqueExternalId: String?)
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
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    fun getBankAccountDetailsOpenAPI(@Query("order_id") orderId: String, @Query("request_hash") requestHash: String?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<RefundAccountResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    fun addRefundBankAccountUsingOTP(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AddBeneficiaryDetailsOTPRequest)
    : Deferred<Response<RefundAccountResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/ifsc-code/verify")
    fun verifyIfscCode(@Path("company_id") companyId: String, @Query("ifsc_code") ifscCode: String?)
    : Deferred<Response<IfscCodeResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/order")
    fun getUserOrderBeneficiaries(@Query("order_id") orderId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/user")
    fun getUserBeneficiaries(@Query("order_id") orderId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<OrderBeneficiaryResponse>>
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm")
    fun confirmPayment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PaymentConfirmationRequest)
    : Deferred<Response<PaymentConfirmationResponse>>
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    fun getUserCODlimitRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("merchant_user_id") merchantUserId: String, @Query("mobile_no") mobileNo: String)
    : Deferred<Response<GetUserCODLimitResponse>>
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    fun setUserCODlimitRoutes(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: SetCODForUserRequest)
    : Deferred<Response<SetCODOptionResponse>>
    
}

interface OrderApiList {
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipments-listing")
    fun getShipments(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_value") searchValue: String?, @Query("search_id") searchId: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_priority_sort") isPrioritySort: Boolean?, @Query("exclude_locked_shipments") excludeLockedShipments: Boolean?, @Query("payment_methods") paymentMethods: String?, @Query("channel_shipment_id") channelShipmentId: String?, @Query("channel_order_id") channelOrderId: String?, @Query("custom_meta") customMeta: String?)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipment-details")
    fun getShipmentById(@Path("company_id") companyId: String, @Query("channel_shipment_id") channelShipmentId: String?, @Query("shipment_id") shipmentId: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("request_by_ext") requestByExt: String?)
    : Deferred<Response<ShipmentInfoResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/order-details")
    fun getOrderById(@Path("company_id") companyId: String, @Query("order_id") orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/lane-config/")
    fun getLaneConfig(@Path("company_id") companyId: String, @Query("super_lane") superLane: String?, @Query("group_entity") groupEntity: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("payment_mode") paymentMode: String?, @Query("bag_status") bagStatus: String?)
    : Deferred<Response<LaneConfigResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/application/{application_id}/shipments/")
    fun getApplicationShipments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_id") searchId: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("customer_id") customerId: String?, @Query("is_priority_sort") isPrioritySort: Boolean?)
    : Deferred<Response<ShipmentInternalPlatformViewResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/orders-listing")
    fun getOrders(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_value") searchValue: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("is_priority_sort") isPrioritySort: Boolean?, @Query("custom_meta") customMeta: String?)
    : Deferred<Response<OrderListingResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipment/metrics-count/")
    fun getMetricCount(@Path("company_id") companyId: String, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?)
    : Deferred<Response<MetricCountResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/application/{application_id}/order-details")
    fun getAppOrderShipmentDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("order_id") orderId: String)
    : Deferred<Response<ShipmentDetailsResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    fun trackPlatformShipment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("shipment_id") shipmentId: String)
    : Deferred<Response<PlatformShipmentTrack>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/filter-listing")
    fun getfilters(@Path("company_id") companyId: String, @Query("view") view: String, @Query("group_entity") groupEntity: String?)
    : Deferred<Response<FiltersResponse>>
    
    @POST ("/service/platform/orders/v1.0/company/{company_id}/reports/shipment")
    fun createShipmentReport(@Path("company_id") companyId: String, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?)
    : Deferred<Response<Success>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/reports/shipment-listing")
    fun getReportsShipmentListing(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<OmsReports>>
    
    @POST ("/service/platform/orders/v1.0/company/{company_id}/upsert/jiocode/article")
    fun upsertJioCode(@Path("company_id") companyId: String,@Body body: JioCodeUpsertPayload)
    : Deferred<Response<JioCodeUpsertResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bulk-action/invoice")
    fun getBulkInvoice(@Path("company_id") companyId: String, @Query("batch_id") batchId: String, @Query("doc_type") docType: String)
    : Deferred<Response<BulkInvoicingResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/invoice-label-external")
    fun getBulkInvoiceLabel(@Path("company_id") companyId: String, @Query("batch_id") batchId: String)
    : Deferred<Response<BulkInvoiceLabelResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/generate/file")
    fun getBulkShipmentExcelFile(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_id") searchId: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("customer_id") customerId: String?, @Query("is_priority_sort") isPrioritySort: Boolean?)
    : Deferred<Response<FileResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bulk-action/listing")
    fun getBulkList(@Path("company_id") companyId: String, @Query("lane") lane: String?, @Query("search_type") searchType: String?, @Query("search_id") searchId: String?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("dp_ids") dpIds: String?, @Query("ordering_company_id") orderingCompanyId: String?, @Query("stores") stores: String?, @Query("sales_channel") salesChannel: String?, @Query("request_by_ext") requestByExt: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("customer_id") customerId: String?, @Query("is_priority_sort") isPrioritySort: Boolean?)
    : Deferred<Response<BulkListingResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bulk-action-failed-report/")
    fun getBulkActionFailedReport(@Path("company_id") companyId: String, @Query("batch_id") batchId: String, @Query("report_type") reportType: String?)
    : Deferred<Response<FileResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipments/{shipment_id}/bags/{bag_id}/state/{state}/reasons")
    fun getShipmentReasons(@Path("company_id") companyId: String, @Path("shipment_id") shipmentId: String, @Path("bag_id") bagId: String, @Path("state") state: String)
    : Deferred<Response<PlatformShipmentReasonsResponse>>
    
    @POST ("/service/platform/orders/v2.0/company/{company_id}/bulk-action/")
    fun bulkActionProcessXlsxFile(@Path("company_id") companyId: String,@Body body: BulkActionPayload)
    : Deferred<Response<BulkActionResponse>>
    
    @GET ("/service/platform/orders/v2.0/company/{company_id}/bulk-action/{batch_id}")
    fun bulkActionDetails(@Path("company_id") companyId: String, @Path("batch_id") batchId: String)
    : Deferred<Response<BulkActionDetailsResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bag-details/")
    fun getBagById(@Path("company_id") companyId: String, @Query("bag_id") bagId: String?, @Query("channel_bag_id") channelBagId: String?, @Query("channel_id") channelId: String?)
    : Deferred<Response<BagDetailsPlatformResponse>>
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bags")
    fun getBags(@Path("company_id") companyId: String, @Query("bag_ids") bagIds: String?, @Query("shipment_ids") shipmentIds: String?, @Query("order_ids") orderIds: String?, @Query("channel_bag_ids") channelBagIds: String?, @Query("channel_shipment_ids") channelShipmentIds: String?, @Query("channel_order_ids") channelOrderIds: String?, @Query("channel_id") channelId: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetBagsPlatformResponse>>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/update-cache")
    fun invalidateShipmentCache(@Path("company_id") companyId: String,@Body body: InvalidateShipmentCachePayload)
    : Deferred<Response<InvalidateShipmentCacheResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/store/reassign-internal")
    fun reassignLocation(@Path("company_id") companyId: String,@Body body: StoreReassign)
    : Deferred<Response<StoreReassignResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/entity/lock-manager")
    fun updateShipmentLock(@Path("company_id") companyId: String,@Body body: UpdateShipmentLockPayload)
    : Deferred<Response<UpdateShipmentLockResponse>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/announcements")
    fun getAnnouncements(@Path("company_id") companyId: String, @Query("date") date: String?)
    : Deferred<Response<AnnouncementsResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/delight/update-address")
    fun updateAddress(@Query("shipment_id") shipmentId: String, @Query("name") name: String?, @Query("address") address: String?, @Query("address_type") addressType: String?, @Query("pincode") pincode: String?, @Query("phone") phone: String?, @Query("email") email: String?, @Query("landmark") landmark: String?, @Query("address_category") addressCategory: String, @Query("city") city: String?, @Query("state") state: String?, @Query("country") country: String?, @Path("company_id") companyId: String)
    : Deferred<Response<BaseResponse>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/click2call")
    fun click2Call(@Query("caller") caller: String, @Query("receiver") receiver: String, @Query("bag_id") bagId: String, @Query("calling_to") callingTo: String?, @Query("caller_id") callerId: String?, @Path("company_id") companyId: String)
    : Deferred<Response<Click2CallResponse>>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/status-internal")
    fun updateShipmentStatus(@Path("company_id") companyId: String,@Body body: UpdateShipmentStatusRequest)
    : Deferred<Response<UpdateShipmentStatusResponseBody>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/process-manifest")
    fun processManifest(@Path("company_id") companyId: String,@Body body: CreateOrderPayload)
    : Deferred<Response<CreateOrderResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/manifest/dispatch")
    fun dispatchManifest(@Path("company_id") companyId: String,@Body body: DispatchManifest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/roles")
    fun getRoleBasedActions(@Path("company_id") companyId: String)
    : Deferred<Response<GetActionsResponse>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    fun getShipmentHistory(@Path("company_id") companyId: String, @Query("shipment_id") shipmentId: Int?, @Query("bag_id") bagId: Int?)
    : Deferred<Response<ShipmentHistoryResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/send-sms")
    fun sendSmsNinja(@Path("company_id") companyId: String,@Body body: SendSmsPayload)
    : Deferred<Response<OrderStatusResult>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/oms/manual-place-shipment")
    fun platformManualAssignDPToShipment(@Path("company_id") companyId: String,@Body body: ManualAssignDPToShipment)
    : Deferred<Response<ManualAssignDPToShipmentResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/update-packaging-dimension")
    fun updatePackagingDimensions(@Path("company_id") companyId: String,@Body body: CreateOrderPayload)
    : Deferred<Response<CreateOrderResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/create-order")
    fun createOrder(@Path("company_id") companyId: String,@Body body: CreateOrderAPI)
    : Deferred<Response<CreateOrderResponse>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/order-config")
    fun getChannelConfig(@Path("company_id") companyId: String)
    : Deferred<Response<CreateChannelConfigData>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/order-config")
    fun createChannelConfig(@Path("company_id") companyId: String,@Body body: CreateChannelConfigData)
    : Deferred<Response<CreateChannelConfigResponse>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/manifest/uploadConsent")
    fun uploadConsent(@Path("company_id") companyId: String,@Body body: UploadConsent)
    : Deferred<Response<SuccessResponse>>
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/validation")
    fun orderUpdate(@Path("company_id") companyId: String,@Body body: PlatformOrderUpdate)
    : Deferred<Response<ResponseDetail>>
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/debug/order_status")
    fun checkOrderStatus(@Path("company_id") companyId: String,@Body body: OrderStatus)
    : Deferred<Response<OrderStatusResult>>
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/bag/state/transition")
    fun sendSmsNinjaPlatform(@Path("company_id") companyId: String)
    : Deferred<Response<OrderStatusResult>>
    
}

interface CatalogApiList {
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun getSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<GetSearchWordsDetailResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun updateSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    fun deleteSearchKeywords(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    fun getAllSearchKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetSearchWordsResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    fun createCustomKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateSearchKeyword)
    : Deferred<Response<GetSearchWordsData>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    fun getAutocompleteKeywordDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<GetAutocompleteWordsResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    fun updateAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: CreateAutocompleteKeyword)
    : Deferred<Response<GetAutocompleteWordsResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    fun deleteAutocompleteKeyword(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    fun getAutocompleteConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GetAutocompleteWordsResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    fun createCustomAutocompleteRule(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateAutocompleteKeyword)
    : Deferred<Response<CreateAutocompleteWordsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    fun getProductBundle(@Path("company_id") companyId: String, @Query("q") q: String?, @Query("slug") slug: ArrayList<String>?)
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
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    fun getAppProduct(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String)
    : Deferred<Response<OwnerAppItemResponse>>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    fun updateAppProduct(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String,@Body body: ApplicationItemMeta)
    : Deferred<Response<SuccessResponse1>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/metadata/")
    fun getConfigurationMetadata(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("template_slug") templateSlug: String?)
    : Deferred<Response<GetConfigMetadataResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    fun getGroupConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search") search: String?, @Query("template_slug") templateSlug: String?)
    : Deferred<Response<GetConfigResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    fun createGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: AppConfigurationDetail)
    : Deferred<Response<AppConfigurationDetail>>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    fun updateGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("group_slug") groupSlug: String,@Body body: AppConfigurationDetail)
    : Deferred<Response<AppConfigurationDetail>>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    fun deleteGroupConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("group_slug") groupSlug: String)
    : Deferred<Response<ConfigSuccessResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    fun getListingConfigurations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("search") search: String?)
    : Deferred<Response<GetConfigResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    fun createListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String,@Body body: AppConfigurationsSort)
    : Deferred<Response<AppConfigurationsSort>>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    fun updateListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("config_id") configId: String,@Body body: AppConfigurationsSort)
    : Deferred<Response<AppConfigurationsSort>>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    fun deleteListingConfiguration(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("config_type") configType: String, @Path("config_id") configId: String)
    : Deferred<Response<ConfigSuccessResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/filter/allow_single")
    fun updateAllowSingle(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AllowSingleRequest)
    : Deferred<Response<ConfigSuccessResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/sort/default_key")
    fun updateDefaultSort(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: DefaultKeyRequest)
    : Deferred<Response<ConfigSuccessResponse>>
    
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
    fun getAllCollections(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("schedule_status") scheduleStatus: String?, @Query("type") type: String?, @Query("tags") tags: ArrayList<String>?, @Query("is_active") isActive: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<GetCollectionListingResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    fun createCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: CreateCollection)
    : Deferred<Response<CollectionCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{slug}/")
    fun getCollectionDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<CollectionDetailResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    fun updateCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: UpdateCollection)
    : Deferred<Response<UpdateCollection>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    fun deleteCollection(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<DeleteResponse>>
    
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
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/{attribute_slug}")
    fun getGenderAttribute(@Path("company_id") companyId: String, @Path("attribute_slug") attributeSlug: String)
    : Deferred<Response<GenderDetail>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/categories/")
    fun listProductTemplateCategories(@Path("company_id") companyId: String, @Query("departments") departments: String, @Query("item_type") itemType: String)
    : Deferred<Response<ProdcutTemplateCategoriesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    fun listDepartmentsData(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("search") search: String?, @Query("is_active") isActive: Boolean?)
    : Deferred<Response<DepartmentsResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    fun createDepartments(@Path("company_id") companyId: String,@Body body: DepartmentCreateUpdate)
    : Deferred<Response<DepartmentCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    fun getDepartmentData(@Path("company_id") companyId: String, @Path("uid") uid: String)
    : Deferred<Response<DepartmentsResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    fun updateDepartment(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: DepartmentCreateUpdate)
    : Deferred<Response<DepartmentModel>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/")
    fun listProductTemplate(@Path("company_id") companyId: String, @Query("department") department: String)
    : Deferred<Response<TemplatesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/validation/schema/")
    fun validateProductTemplate(@Path("company_id") companyId: String, @Path("slug") slug: String)
    : Deferred<Response<TemplatesValidationResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/download/")
    fun downloadProductTemplateViews(@Path("company_id") companyId: String, @Path("slug") slug: String)
    : Deferred<Response<ResponseBody>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/download/")
    fun downloadInventoryTemplateView(@Path("company_id") companyId: String, @Query("item_type") itemType: String)
    : Deferred<Response<ResponseBody>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/validation/schema/")
    fun validateProductTemplateSchema(@Path("company_id") companyId: String, @Query("item_type") itemType: String)
    : Deferred<Response<InventoryValidationResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/hsn/")
    fun listHSNCodes(@Path("company_id") companyId: String)
    : Deferred<Response<HSNCodesResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/downloads/")
    fun listProductTemplateExportDetails(@Path("company_id") companyId: String)
    : Deferred<Response<ProductDownloadsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/downloads/configuration/")
    fun listTemplateBrandTypeValues(@Path("company_id") companyId: String, @Query("filter") filter: String, @Query("template_tag") templateTag: String?, @Query("item_type") itemType: String?)
    : Deferred<Response<ProductConfigurationDownloads>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    fun listCategories(@Path("company_id") companyId: String, @Query("level") level: String?, @Query("departments") departments: String?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<CategoryResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    fun createCategories(@Path("company_id") companyId: String,@Body body: CategoryRequestBody)
    : Deferred<Response<CategoryCreateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    fun getCategoryData(@Path("company_id") companyId: String, @Path("uid") uid: String)
    : Deferred<Response<SingleCategoryResponse>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    fun updateCategory(@Path("company_id") companyId: String, @Path("uid") uid: String,@Body body: CategoryRequestBody)
    : Deferred<Response<CategoryUpdateResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/")
    fun getProducts(@Path("company_id") companyId: String, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("category_ids") categoryIds: ArrayList<Int>?, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("department_ids") departmentIds: ArrayList<Int>?, @Query("item_code") itemCode: ArrayList<String>?, @Query("q") q: String?, @Query("tags") tags: ArrayList<String>?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductListingResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/")
    fun createProduct(@Path("company_id") companyId: String,@Body body: ProductCreateUpdateSchemaV2)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/variants/{variant_type}")
    fun getVariantsOfProducts(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("variant_type") variantType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductVariantsResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/")
    fun getProductAttributes(@Path("company_id") companyId: String, @Query("category") category: String, @Query("filter") filter: Boolean?)
    : Deferred<Response<ProductAttributesResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    fun getProduct(@Query("item_code") itemCode: String?, @Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?)
    : Deferred<Response<Product>>
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    fun editProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String,@Body body: ProductCreateUpdateSchemaV2)
    : Deferred<Response<SuccessResponseProduct>>
    
    @PATCH ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    fun patchProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String,@Body body: ProductPatch)
    : Deferred<Response<SuccessResponse>>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    fun deleteProduct(@Path("company_id") companyId: String, @Path("item_id") itemId: String)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/all_sizes")
    fun allSizes(@Path("company_id") companyId: String, @Path("item_id") itemId: String)
    : Deferred<Response<ListALLSizes>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/validation/")
    fun getProductValidation(@Path("company_id") companyId: String)
    : Deferred<Response<ValidateProduct>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/")
    fun getProductSize(@Query("item_code") itemCode: String?, @Path("company_id") companyId: String, @Path("item_id") itemId: String, @Query("brand_uid") brandUid: Int?, @Query("uid") uid: Int?)
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    fun getProductBulkUploadHistory(@Path("company_id") companyId: String, @Query("search") search: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ProductBulkRequestList>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    fun createBulkProductUploadJob(@Path("company_id") companyId: String,@Body body: BulkJob)
    : Deferred<Response<BulkResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/bulk")
    fun uploadBulkProducts(@Path("company_id") companyId: String, @Query("department") department: String, @Query("product_type") productType: String,@Body body: BulkJob)
    : Deferred<Response<BulkResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    fun deleteProductBulkJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String)
    : Deferred<Response<SuccessResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    fun createProductsInBulk(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: BulkProductRequest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/tags")
    fun getProductTags(@Path("company_id") companyId: String)
    : Deferred<Response<ProductTagsViewResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    fun getProductAssetsInBulk(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BulkAssetResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    fun createProductAssetsInBulk(@Path("company_id") companyId: String,@Body body: ProductBulkAssets)
    : Deferred<Response<SuccessResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    fun deleteSize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String)
    : Deferred<Response<ProductSizeDeleteResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    fun getInventoryBySize(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("sellable") sellable: Boolean?)
    : Deferred<Response<InventoryResponsePaginated>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    fun addInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size") size: String,@Body body: InventoryRequest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/inventory/{size_identifier}")
    fun getInventoryBySizeIdentifier(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("size_identifier") sizeIdentifier: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("location_ids") locationIds: ArrayList<Int>?)
    : Deferred<Response<InventorySellerIdentifierResponsePaginated>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{item_id}/inventory/{size_identifier}")
    fun getDiscountedInventoryBySizeIdentifier(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("item_id") itemId: String, @Path("size_identifier") sizeIdentifier: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("location_ids") locationIds: ArrayList<Int>?)
    : Deferred<Response<InventorySellerIdentifierResponsePaginated>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}/location/{location_id}/")
    fun deleteInventory(@Path("company_id") companyId: String, @Path("size") size: String, @Path("item_id") itemId: String, @Path("location_id") locationId: String)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    fun getInventoryBulkUploadHistory(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<BulkInventoryGet>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    fun createBulkInventoryJob(@Path("company_id") companyId: String,@Body body: BulkJob)
    : Deferred<Response<BulkResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventories")
    fun getInventories(@Path("company_id") companyId: String, @Query("item_id") itemId: String?, @Query("size") size: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("sellable") sellable: Boolean?, @Query("store_ids") storeIds: ArrayList<Int>?, @Query("size_identifier") sizeIdentifier: String?)
    : Deferred<Response<GetInventoriesResponse>>
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    fun deleteBulkInventoryJob(@Path("company_id") companyId: String, @Path("batch_id") batchId: String)
    : Deferred<Response<SuccessResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    fun createBulkInventory(@Path("company_id") companyId: String, @Path("batch_id") batchId: String,@Body body: InventoryBulkRequest)
    : Deferred<Response<SuccessResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    fun getInventoryExport(@Path("company_id") companyId: String)
    : Deferred<Response<InventoryExportJob>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    fun createInventoryExportJob(@Path("company_id") companyId: String,@Body body: InventoryExportRequest)
    : Deferred<Response<InventoryExportResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/configuration/")
    fun exportInventoryConfig(@Path("company_id") companyId: String, @Query("filter_type") filterType: String?)
    : Deferred<Response<InventoryConfig>>
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}/")
    fun deleteRealtimeInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("seller_identifier") sellerIdentifier: String,@Body body: InventoryRequestSchemaV2)
    : Deferred<Response<InventoryUpdateResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}/")
    fun updateRealtimeInventory(@Path("company_id") companyId: String, @Path("item_id") itemId: String, @Path("seller_identifier") sellerIdentifier: String,@Body body: InventoryRequestSchemaV2)
    : Deferred<Response<InventoryUpdateResponse>>
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/")
    fun updateInventories(@Path("company_id") companyId: String,@Body body: InventoryRequestSchemaV2)
    : Deferred<Response<InventoryUpdateResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/hsn/")
    fun getAllHsnCodes(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<HsnCodesListingResponse>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/hsn/")
    fun createHsnCode(@Path("company_id") companyId: String,@Body body: HsnUpsert)
    : Deferred<Response<HsnCode>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    fun getHsnCode(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<HsnCode>>
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    fun updateHsnCode(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: HsnUpsert)
    : Deferred<Response<HsnCode>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/hsn/bulk/")
    fun bulkHsnCode(@Path("company_id") companyId: String,@Body body: BulkHsnUpsert)
    : Deferred<Response<BulkHsnResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/")
    fun getAllProductHsnCodes(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("type") type: String?, @Path("company_id") companyId: String)
    : Deferred<Response<HsnCodesListingResponseSchemaV2>>
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/location/reassign/")
    fun getOptimalLocations(@Path("company_id") companyId: String,@Body body: AssignStore)
    : Deferred<Response<StoreAssignResponse>>
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/{reporting_hsn}")
    fun getSingleProductHSNCode(@Path("reporting_hsn") reportingHsn: String, @Path("company_id") companyId: String)
    : Deferred<Response<HSNDataInsertV2>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brands")
    fun getApplicationBrands(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department") department: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("brand_id") brandId: ArrayList<Int>?)
    : Deferred<Response<BrandListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/departments")
    fun getDepartments(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<DepartmentResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/categories")
    fun getCategories(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department") department: String?)
    : Deferred<Response<CategoryListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products")
    fun getAppicationProducts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("q") q: String?, @Query("f") f: String?, @Query("c") c: String?, @Query("filters") filters: Boolean?, @Query("is_dependent") isDependent: Boolean?, @Query("sort_on") sortOn: String?, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?, @Query("page_no") pageNo: Int?, @Query("page_type") pageType: String?, @Query("item_ids") itemIds: ArrayList<Int>?)
    : Deferred<Response<ApplicationProductListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{slug}")
    fun getProductDetailBySlug(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("slug") slug: String)
    : Deferred<Response<ProductDetail>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/raw-products/")
    fun getAppProducts(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("category_ids") categoryIds: ArrayList<Int>?, @Query("department_ids") departmentIds: ArrayList<Int>?, @Query("tags") tags: ArrayList<String>?, @Query("is_dependent") isDependent: Boolean?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<ProductListingResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/inventory/")
    fun getAppInventory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("item_ids") itemIds: ArrayList<Int>?, @Query("store_ids") storeIds: ArrayList<Int>?, @Query("brand_ids") brandIds: ArrayList<Int>?, @Query("seller_identifiers") sellerIdentifiers: ArrayList<String>?, @Query("timestamp") timestamp: String?, @Query("page_size") pageSize: Int?, @Query("page_id") pageId: String?)
    : Deferred<Response<InventoryStockResponse>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/locations")
    fun getAppLocations(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("store_type") storeType: String?, @Query("uid") uid: ArrayList<Int>?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<LocationListSerializer>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand")
    fun getApplicationBrandListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<BrandListingResponse>>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand/{brand_uid}")
    fun updateAppBrand(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("brand_uid") brandUid: String,@Body body: ApplicationBrandJson)
    : Deferred<Response<SuccessResponse1>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category")
    fun getApplicationCategoryListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("department_id") departmentId: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<BrandListingResponse>>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category/{category_uid}")
    fun updateAppCategory(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("category_uid") categoryUid: String,@Body body: ApplicationCategoryJson)
    : Deferred<Response<SuccessResponse1>>
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department")
    fun getApplicationDepartmentListing(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<ApplicationDepartmentListingResponse>>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department/{department_uid}")
    fun updateAppDepartment(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("department_uid") departmentUid: String,@Body body: ApplicationDepartmentJson)
    : Deferred<Response<SuccessResponse1>>
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/store/{store_uid}")
    fun updateAppLocation(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("store_uid") storeUid: String,@Body body: ApplicationStoreJson)
    : Deferred<Response<SuccessResponse1>>
    
}

interface CompanyProfileApiList {
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}")
    fun cbsOnboardGet(@Path("company_id") companyId: String)
    : Deferred<Response<GetCompanyProfileSerializerResponse>>
    
    @PATCH ("/service/platform/company-profile/v1.0/company/{company_id}")
    fun updateCompany(@Path("company_id") companyId: String,@Body body: UpdateCompany)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/metrics")
    fun getCompanyMetrics(@Path("company_id") companyId: String)
    : Deferred<Response<MetricsSerializer>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    fun getBrand(@Path("company_id") companyId: String, @Path("brand_id") brandId: String)
    : Deferred<Response<GetBrandResponseSerializer>>
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    fun editBrand(@Path("company_id") companyId: String, @Path("brand_id") brandId: String,@Body body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/brand/")
    fun createBrand(@Path("company_id") companyId: String,@Body body: CreateUpdateBrandRequestSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    fun getBrands(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<CompanyBrandListSerializer>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    fun createCompanyBrandMapping(@Path("company_id") companyId: String,@Body body: CompanyBrandPostRequestSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    fun getLocations(@Path("company_id") companyId: String, @Query("store_type") storeType: String?, @Query("q") q: String?, @Query("stage") stage: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("location_ids") locationIds: ArrayList<Int>?)
    : Deferred<Response<LocationListSerializer>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    fun createLocation(@Path("company_id") companyId: String,@Body body: LocationSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    fun getLocationDetail(@Path("company_id") companyId: String, @Path("location_id") locationId: String)
    : Deferred<Response<GetLocationSerializer>>
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    fun updateLocation(@Path("company_id") companyId: String, @Path("location_id") locationId: String,@Body body: LocationSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location/bulk")
    fun createLocationBulk(@Path("company_id") companyId: String,@Body body: BulkLocationSerializer)
    : Deferred<Response<ProfileSuccessResponse>>
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location/reassign")
    fun getOptimalLocations(@Path("company_id") companyId: String,@Body body: AssignStoreRequestValidator)
    : Deferred<Response<AssignStoreResponseSerializer>>
    
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
    : Deferred<Response<BulkUploadResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/uploads/copy/")
    fun appCopyFiles(@Query("sync") sync: Boolean?, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: BulkRequest)
    : Deferred<Response<BulkUploadResponse>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse/")
    fun browse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Query("page_no") pageNo: Int?)
    : Deferred<Response<BrowseResponse>>
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse/")
    fun browse(@Path("namespace") namespace: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?)
    : Deferred<Response<BrowseResponse>>
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/proxy/")
    fun proxy(@Path("company_id") companyId: String, @Query("url") url: String)
    : Deferred<Response<ResponseBody>>
    
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

interface InventoryApiList {
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    fun getJobsByCompany(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ResponseEnvelopeListJobConfigRawDTO>>
    
    @PUT ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    fun updateJob(@Path("company_id") companyId: String,@Body body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>
    
    @POST ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    fun createJob(@Path("company_id") companyId: String,@Body body: JobConfigDTO)
    : Deferred<Response<ResponseEnvelopeString>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/steps/{job_id}")
    fun getJobSteps(@Path("company_id") companyId: String, @Path("job_id") jobId: String)
    : Deferred<Response<ResponseEnvelopeListJobStepsDTO>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/integration/{integration_id}")
    fun getJobByCompanyAndIntegration(@Path("company_id") companyId: String, @Path("integration_id") integrationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ResponseEnvelopeListJobConfigDTO>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/disable/integration/{integration_id}")
    fun disable(@Path("company_id") companyId: String, @Path("integration_id") integrationId: String)
    : Deferred<Response<ResponseEnvelopeString>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/defaults")
    fun getJobConfigDefaults(@Path("company_id") companyId: String)
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/{code}")
    fun getJobByCode(@Path("company_id") companyId: String, @Path("code") code: String)
    : Deferred<Response<ResponseEnvelopeJobConfigDTO>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/{code}/metrics")
    fun getJobCodeMetrics(@Path("company_id") companyId: String, @Path("code") code: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("status") status: String?, @Query("date") date: String?)
    : Deferred<Response<ResponseEnvelopeJobMetricsDto>>
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/integration/{integration_id}")
    fun getJobCodesByCompanyAndIntegration(@Path("company_id") companyId: String, @Path("integration_id") integrationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<ResponseEnvelopeListJobConfigListDTO>>
    
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
    fun getAppCompanies(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("uid") uid: Int?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
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
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency/supported")
    fun getAppSupportedCurrency(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<AppCurrencyResponse>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/stores/filter")
    fun getOrderingStoresByFilter(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: FilterOrderingStoreRequest)
    : Deferred<Response<OrderingStores>>
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    fun updateOrderingStoreConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OrderingStoreConfig)
    : Deferred<Response<DeploymentMeta>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/staff-stores")
    fun getStaffOrderingStores(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?)
    : Deferred<Response<OrderingStoresResponse>>
    
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
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/new/{id}/{level}")
    fun getIntegrationLevelConfig(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Query("opted") opted: Boolean?, @Query("check_permission") checkPermission: Boolean?)
    : Deferred<Response<IntegrationConfigResponse>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}/{uid}")
    fun getIntegrationByLevelId(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Path("uid") uid: String)
    : Deferred<Response<IntegrationLevel>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}/{uid}")
    fun updateLevelUidIntegration(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Path("uid") uid: String,@Body body: IntegrationLevel)
    : Deferred<Response<IntegrationLevel>>
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/check/configuration/{id}/{level}/{uid}")
    fun getLevelActiveIntegrations(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String, @Path("uid") uid: String, @Query("permission") permission: String?)
    : Deferred<Response<OptedStoreIntegration>>
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}")
    fun updateLevelIntegration(@Path("company_id") companyId: String, @Path("id") id: String, @Path("level") level: String,@Body body: UpdateIntegrationLevelRequest)
    : Deferred<Response<IntegrationLevel>>
    
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
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    fun getPromotions(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("q") q: String?, @Query("status") status: String?, @Query("promo_group") promoGroup: String?, @Query("promotion_type") promotionType: String?, @Query("fp_panel") fpPanel: String?, @Query("promotion_id") promotionId: String?)
    : Deferred<Response<PromotionsResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    fun createPromotion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: PromotionAdd)
    : Deferred<Response<PromotionAdd>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    fun getPromotionById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<PromotionUpdate>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    fun updatePromotion(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PromotionUpdate)
    : Deferred<Response<PromotionUpdate>>
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    fun updatePromotionPartially(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: PromotionPartialUpdate)
    : Deferred<Response<SuccessMessage>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promo-coupons")
    fun getPromosCouponConfig(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ActivePromosResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/validate")
    fun fetchAndvalidateCartItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenapiCartDetailsRequest)
    : Deferred<Response<OpenapiCartDetailsResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/serviceability")
    fun checkCartServiceability(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenApiCartServiceabilityRequest)
    : Deferred<Response<OpenApiCartServiceabilityResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/checkout")
    fun checkoutCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: OpenApiPlatformCheckoutReq)
    : Deferred<Response<OpenApiCheckoutResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts")
    fun getAbandonedCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("from_date") fromDate: String?, @Query("to_date") toDate: String?, @Query("anonymous_cart") anonymousCart: Boolean?, @Query("last_id") lastId: String?, @Query("sort_on") sortOn: String?)
    : Deferred<Response<AbandonedCartResponse>>
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/cart/detail")
    fun getAbandonedCartDetails(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("id") id: String?, @Query("i") i: Boolean?, @Query("b") b: Boolean?)
    : Deferred<Response<CartDetailResponse>>
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    fun addItems(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String, @Query("b") b: Boolean?,@Body body: AddCartRequest)
    : Deferred<Response<AddCartDetailResponse>>
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    fun updateCart(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String, @Query("b") b: Boolean?,@Body body: UpdateCartRequest)
    : Deferred<Response<UpdateCartDetailResponse>>
    
}

interface RewardsApiList {
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    fun showGiveaways(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String, @Query("page_size") pageSize: Int)
    : Deferred<Response<GiveawayResponse>>
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    fun saveGiveAway(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Giveaway)
    : Deferred<Response<Giveaway>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    fun getGiveawayById(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String)
    : Deferred<Response<Giveaway>>
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    fun updateGiveAway(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("id") id: String,@Body body: Giveaway)
    : Deferred<Response<Giveaway>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/audience/{audience_id}/status")
    fun getGiveawayAudienceStatus(@Path("audience_id") audienceId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<GiveawayAudience>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/")
    fun showOffers(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ArrayList<Offer>>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    fun getOfferByName(@Path("name") name: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Header("cookie") cookie: String)
    : Deferred<Response<Offer>>
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    fun updateOfferByName(@Path("name") name: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: Offer)
    : Deferred<Response<Offer>>
    
    @PATCH ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    fun updateUserStatus(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: AppUser)
    : Deferred<Response<AppUser>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    fun user(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<UserRes>>
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/points/history/")
    fun getPointsHistory(@Path("user_id") userId: String, @Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Query("page_id") pageId: String?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<HistoryRes>>
    
}

interface AnalyticsApiList {
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/group")
    fun getStatiscticsGroups(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<StatsGroups>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/group/{group_name}")
    fun getStatiscticsGroupComponents(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("group_name") groupName: String)
    : Deferred<Response<StatsGroupComponents>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}.csv")
    fun getComponentStatsCSV(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("component_name") componentName: String)
    : Deferred<Response<ResponseBody>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}.pdf")
    fun getComponentStatsPDF(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("component_name") componentName: String)
    : Deferred<Response<ResponseBody>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}")
    fun getComponentStats(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("component_name") componentName: String)
    : Deferred<Response<StatsRes>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/from/{from_date}/to/{to_date}/abandon-cart/")
    fun getAbandonCartList(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("from_date") fromDate: String, @Path("to_date") toDate: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?)
    : Deferred<Response<AbandonCartsList>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/{from_date}/to/{to_date}/abandon-cart.csv")
    fun getAbandonCartsCSV(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("from_date") fromDate: String, @Path("to_date") toDate: String)
    : Deferred<Response<ResponseBody>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/abandon-cart/{cart_id}")
    fun getAbandonCartDetail(@Path("company_id") companyId: String, @Path("application_id") applicationId: String, @Path("cart_id") cartId: String)
    : Deferred<Response<AbandonCartDetail>>
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/export/{export_type}")
    fun createExportJob(@Path("company_id") companyId: String, @Path("export_type") exportType: String,@Body body: ExportJobReq)
    : Deferred<Response<ExportJobRes>>
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/export/{export_type}/job/{job_id}")
    fun getExportJobStatus(@Path("company_id") companyId: String, @Path("export_type") exportType: String, @Path("job_id") jobId: String)
    : Deferred<Response<ExportJobStatusRes>>
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/logs/{log_type}")
    fun getLogsList(@Path("company_id") companyId: String, @Path("log_type") logType: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?,@Body body: GetLogsListReq)
    : Deferred<Response<GetLogsListRes>>
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/logs/{log_type}/search")
    fun searchLogs(@Path("company_id") companyId: String, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("log_type") logType: String,@Body body: SearchLogReq)
    : Deferred<Response<SearchLogRes>>
    
}

interface DiscountApiList {
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/")
    fun getDiscounts(@Path("company_id") companyId: String, @Query("view") view: String?, @Query("q") q: String?, @Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Query("archived") archived: Boolean?, @Query("month") month: Int?, @Query("year") year: Int?, @Query("type") type: String?, @Query("app_ids") appIds: ArrayList<String>?)
    : Deferred<Response<ListOrCalender>>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/job/")
    fun createDiscount(@Path("company_id") companyId: String,@Body body: CreateUpdateDiscount)
    : Deferred<Response<DiscountJob>>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    fun getDiscount(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<DiscountJob>>
    
    @PUT ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    fun updateDiscount(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: CreateUpdateDiscount)
    : Deferred<Response<DiscountJob>>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/items/")
    fun upsertDiscountItems(@Path("company_id") companyId: String, @Path("id") id: String,@Body body: BulkDiscount)
    : Deferred<Response<HashMap<String,Any>>>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/validation/")
    fun validateDiscountFile(@Path("company_id") companyId: String, @Query("discount") discount: String?,@Body body: DiscountJob)
    : Deferred<Response<FileJobResponse>>
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/{type}/download/")
    fun downloadDiscountFile(@Path("company_id") companyId: String, @Path("type") type: String,@Body body: DownloadFileJob)
    : Deferred<Response<FileJobResponse>>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    fun getValidationJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<FileJobResponse>>
    
    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    fun cancelValidationJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<CancelJobResponse>>
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    fun getDownloadJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<FileJobResponse>>
    
    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    fun cancelDownloadJob(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<CancelJobResponse>>
    
}

interface WebhookApiList {
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    fun getSubscribersByCompany(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("company_id") companyId: String, @Query("extension_id") extensionId: String?)
    : Deferred<Response<SubscriberResponse>>
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    fun registerSubscriberToEvent(@Path("company_id") companyId: String,@Body body: SubscriberConfig)
    : Deferred<Response<SubscriberConfig>>
    
    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    fun updateSubscriberConfig(@Path("company_id") companyId: String,@Body body: SubscriberConfig)
    : Deferred<Response<SubscriberConfig>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber")
    fun getSubscribersByExtensionId(@Query("page_no") pageNo: Int?, @Query("page_size") pageSize: Int?, @Path("company_id") companyId: String, @Path("extension_id") extensionId: String)
    : Deferred<Response<SubscriberConfigList>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    fun getSubscriberById(@Path("company_id") companyId: String, @Path("subscriber_id") subscriberId: String)
    : Deferred<Response<SubscriberResponse>>
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    fun fetchAllEventConfigurations(@Path("company_id") companyId: String)
    : Deferred<Response<EventConfigResponse>>
    
}

interface AuditTrailApiList {
    
    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/logs/")
    fun getAuditLogs(@Path("company_id") companyId: String, @Query("qs") qs: String)
    : Deferred<Response<LogSchemaResponse>>
    
    @POST ("/service/platform/audit-trail/v1.0/company/{company_id}/logs/")
    fun createAuditLog(@Path("company_id") companyId: String,@Body body: RequestBodyAuditLog)
    : Deferred<Response<CreateLogResponse>>
    
    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/logs/{id}")
    fun getAuditLog(@Path("company_id") companyId: String, @Path("id") id: String)
    : Deferred<Response<LogSchemaResponse>>
    
    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/entity-types")
    fun getEntityTypes(@Path("company_id") companyId: String)
    : Deferred<Response<EntityTypesResponse>>
    
}

interface LogisticApiList {
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/serviceability")
    fun getApplicationServiceability(@Path("company_id") companyId: String, @Path("application_id") applicationId: String)
    : Deferred<Response<ApplicationServiceabilityConfigResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/regions")
    fun getEntityRegionView(@Path("company_id") companyId: String,@Body body: EntityRegionView_Request)
    : Deferred<Response<EntityRegionView_Response>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zones")
    fun getListView(@Path("company_id") companyId: String, @Query("page_number") pageNumber: Int?, @Query("page_size") pageSize: Int?, @Query("name") name: String?, @Query("is_active") isActive: Boolean?, @Query("channel_ids") channelIds: String?)
    : Deferred<Response<ListViewResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/all-stores")
    fun getCompanyStoreView(@Path("company_id") companyId: String)
    : Deferred<Response<CompanyStoreView_Response>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    fun getZoneDataView(@Path("company_id") companyId: String, @Path("zone_id") zoneId: String)
    : Deferred<Response<GetSingleZoneDataViewResponse>>
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    fun updateZoneControllerView(@Path("zone_id") zoneId: String, @Path("company_id") companyId: String,@Body body: ZoneUpdateRequest)
    : Deferred<Response<ZoneSuccessResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/zone/")
    fun insertZoneControllerView(@Path("company_id") companyId: String,@Body body: ZoneRequest)
    : Deferred<Response<ZoneResponse>>
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    fun upsertZoneControllerView(@Path("company_id") companyId: String, @Path("application_id") applicationId: String,@Body body: GetZoneFromPincodeViewRequest)
    : Deferred<Response<GetZoneFromPincodeViewResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/stores/{store_uid}")
    fun getStore(@Path("company_id") companyId: String, @Path("store_uid") storeUid: String)
    : Deferred<Response<GetStoresViewResponse>>
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/logistics/stores")
    fun getAllStores(@Path("company_id") companyId: String)
    : Deferred<Response<GetStoresViewResponse>>
    
}
        