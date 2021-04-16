# FDK Application Front API Documentaion


* [Lead](#Lead) - Handles communication between Administrator <-> Staff and Staff <-> Users 
* [Feedback](#Feedback) - User Reviews and Rating System 
* [Theme](#Theme) - Responsible for themes 
* [User](#User) - Authentication Service 
* [Content](#Content) - Content System 
* [Billing](#Billing) - Handle platform subscription 
* [Communication](#Communication) - Manages email, sms, push notifications sent to users 
* [Payment](#Payment) - Collect payment through many payment gateway i.e Stripe, Razorpay, Juspay etc.into Fynd or Self account 
* [Order](#Order) - Handles Platform websites OMS 
* [Catalog](#Catalog) - Catalog API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features.  
* [CompanyProfile](#CompanyProfile) - Company Profile API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features.  
* [FileStorage](#FileStorage) - File Storage 
* [Share](#Share) - Short link and QR Code 
* [Inventory](#Inventory) -  
* [Configuration](#Configuration) - Application configuration apis 
* [Cart](#Cart) - Cart APIs 
* [Marketplaces](#Marketplaces) - Marketplaces 
* [Rewards](#Rewards) - Rewards 
* [Analytics](#Analytics) - Perceptor analytics 

----
----

### Classes and Methods


* [Lead](#Lead)
  * [Lead#getTickets](#leadgettickets)
  * [Lead#createTicket](#leadcreateticket)
  * [Lead#getTickets](#leadgettickets)
  * [Lead#getTicket](#leadgetticket)
  * [Lead#editTicket](#leadeditticket)
  * [Lead#getTicket](#leadgetticket)
  * [Lead#editTicket](#leadeditticket)
  * [Lead#createHistory](#leadcreatehistory)
  * [Lead#getTicketHistory](#leadgettickethistory)
  * [Lead#createHistory](#leadcreatehistory)
  * [Lead#getTicketHistory](#leadgettickethistory)
  * [Lead#getCustomForm](#leadgetcustomform)
  * [Lead#editCustomForm](#leadeditcustomform)
  * [Lead#getCustomForms](#leadgetcustomforms)
  * [Lead#createCustomForm](#leadcreatecustomform)
  * [Lead#getTokenForVideoRoom](#leadgettokenforvideoroom)
  * [Lead#getVideoParticipants](#leadgetvideoparticipants)
  * [Lead#openVideoRoom](#leadopenvideoroom)
  * [Lead#closeVideoRoom](#leadclosevideoroom)
 
* [Feedback](#Feedback)
  * [Feedback#getAttributes](#feedbackgetattributes)
  * [Feedback#getCustomerReviews](#feedbackgetcustomerreviews)
  * [Feedback#updateApprove](#feedbackupdateapprove)
  * [Feedback#getHistory](#feedbackgethistory)
  * [Feedback#getApplicationTemplates](#feedbackgetapplicationtemplates)
  * [Feedback#createTemplate](#feedbackcreatetemplate)
  * [Feedback#getTemplateById](#feedbackgettemplatebyid)
  * [Feedback#updateTemplate](#feedbackupdatetemplate)
  * [Feedback#updateTemplateStatus](#feedbackupdatetemplatestatus)
 
* [Theme](#Theme)
  * [Theme#getThemeLibrary](#themegetthemelibrary)
  * [Theme#addToThemeLibrary](#themeaddtothemelibrary)
  * [Theme#applyTheme](#themeapplytheme)
  * [Theme#isUpgradable](#themeisupgradable)
  * [Theme#upgradeTheme](#themeupgradetheme)
  * [Theme#getPublicThemes](#themegetpublicthemes)
  * [Theme#createTheme](#themecreatetheme)
  * [Theme#getAppliedTheme](#themegetappliedtheme)
  * [Theme#getFonts](#themegetfonts)
  * [Theme#getThemeById](#themegetthemebyid)
  * [Theme#updateTheme](#themeupdatetheme)
  * [Theme#deleteTheme](#themedeletetheme)
  * [Theme#getThemeForPreview](#themegetthemeforpreview)
  * [Theme#publishTheme](#themepublishtheme)
  * [Theme#unpublishTheme](#themeunpublishtheme)
  * [Theme#archiveTheme](#themearchivetheme)
  * [Theme#unarchiveTheme](#themeunarchivetheme)
 
* [User](#User)
  * [User#getCustomers](#usergetcustomers)
  * [User#searchUsers](#usersearchusers)
  * [User#getPlatformConfig](#usergetplatformconfig)
  * [User#updatePlatformConfig](#userupdateplatformconfig)
 
* [Content](#Content)
  * [Content#getAnnouncementsList](#contentgetannouncementslist)
  * [Content#createAnnouncement](#contentcreateannouncement)
  * [Content#getAnnouncementById](#contentgetannouncementbyid)
  * [Content#updateAnnouncement](#contentupdateannouncement)
  * [Content#updateAnnouncementSchedule](#contentupdateannouncementschedule)
  * [Content#deleteAnnouncement](#contentdeleteannouncement)
  * [Content#createBlog](#contentcreateblog)
  * [Content#getBlogs](#contentgetblogs)
  * [Content#updateBlog](#contentupdateblog)
  * [Content#deleteBlog](#contentdeleteblog)
  * [Content#getComponentById](#contentgetcomponentbyid)
  * [Content#getFaqCategories](#contentgetfaqcategories)
  * [Content#getFaqCategoryBySlugOrId](#contentgetfaqcategorybyslugorid)
  * [Content#createFaqCategory](#contentcreatefaqcategory)
  * [Content#updateFaqCategory](#contentupdatefaqcategory)
  * [Content#deleteFaqCategory](#contentdeletefaqcategory)
  * [Content#getFaqsByCategoryIdOrSlug](#contentgetfaqsbycategoryidorslug)
  * [Content#addFaq](#contentaddfaq)
  * [Content#updateFaq](#contentupdatefaq)
  * [Content#deleteFaq](#contentdeletefaq)
  * [Content#getFaqByIdOrSlug](#contentgetfaqbyidorslug)
  * [Content#getLandingPages](#contentgetlandingpages)
  * [Content#createLandingPage](#contentcreatelandingpage)
  * [Content#updateLandingPage](#contentupdatelandingpage)
  * [Content#deleteLandingPage](#contentdeletelandingpage)
  * [Content#getLegalInformation](#contentgetlegalinformation)
  * [Content#updateLegalInformation](#contentupdatelegalinformation)
  * [Content#getNavigations](#contentgetnavigations)
  * [Content#createNavigation](#contentcreatenavigation)
  * [Content#getDefaultNavigations](#contentgetdefaultnavigations)
  * [Content#getNavigationBySlug](#contentgetnavigationbyslug)
  * [Content#updateNavigation](#contentupdatenavigation)
  * [Content#deleteNavigation](#contentdeletenavigation)
  * [Content#getPageMeta](#contentgetpagemeta)
  * [Content#getPageSpec](#contentgetpagespec)
  * [Content#createPage](#contentcreatepage)
  * [Content#getPages](#contentgetpages)
  * [Content#createPagePreview](#contentcreatepagepreview)
  * [Content#updatePagePreview](#contentupdatepagepreview)
  * [Content#updatePage](#contentupdatepage)
  * [Content#deletePage](#contentdeletepage)
  * [Content#getPageBySlug](#contentgetpagebyslug)
  * [Content#getSEOConfiguration](#contentgetseoconfiguration)
  * [Content#updateSEOConfiguration](#contentupdateseoconfiguration)
  * [Content#getSlideshows](#contentgetslideshows)
  * [Content#createSlideshow](#contentcreateslideshow)
  * [Content#getSlideshowBySlug](#contentgetslideshowbyslug)
  * [Content#updateSlideshow](#contentupdateslideshow)
  * [Content#deleteSlideshow](#contentdeleteslideshow)
  * [Content#getSupportInformation](#contentgetsupportinformation)
  * [Content#updateSupportInformation](#contentupdatesupportinformation)
  * [Content#createInjectableTag](#contentcreateinjectabletag)
  * [Content#updateInjectableTag](#contentupdateinjectabletag)
  * [Content#deleteAllInjectableTags](#contentdeleteallinjectabletags)
  * [Content#getInjectableTags](#contentgetinjectabletags)
  * [Content#addInjectableTag](#contentaddinjectabletag)
  * [Content#removeInjectableTag](#contentremoveinjectabletag)
  * [Content#editInjectableTag](#contenteditinjectabletag)
 
* [Billing](#Billing)
  * [Billing#getInvoices](#billinggetinvoices)
  * [Billing#getInvoiceById](#billinggetinvoicebyid)
  * [Billing#getCustomerDetail](#billinggetcustomerdetail)
  * [Billing#upsertCustomerDetail](#billingupsertcustomerdetail)
  * [Billing#getSubscription](#billinggetsubscription)
  * [Billing#getFeatureLimitConfig](#billinggetfeaturelimitconfig)
  * [Billing#activateSubscriptionPlan](#billingactivatesubscriptionplan)
  * [Billing#cancelSubscriptionPlan](#billingcancelsubscriptionplan)
 
* [Communication](#Communication)
  * [Communication#getCampaigns](#communicationgetcampaigns)
  * [Communication#createCampaign](#communicationcreatecampaign)
  * [Communication#getCampaignById](#communicationgetcampaignbyid)
  * [Communication#updateCampaignById](#communicationupdatecampaignbyid)
  * [Communication#getStatsOfCampaignById](#communicationgetstatsofcampaignbyid)
  * [Communication#getAudiences](#communicationgetaudiences)
  * [Communication#createAudience](#communicationcreateaudience)
  * [Communication#getBigqueryHeaders](#communicationgetbigqueryheaders)
  * [Communication#getAudienceById](#communicationgetaudiencebyid)
  * [Communication#updateAudienceById](#communicationupdateaudiencebyid)
  * [Communication#getNSampleRecordsFromCsv](#communicationgetnsamplerecordsfromcsv)
  * [Communication#getEmailProviders](#communicationgetemailproviders)
  * [Communication#createEmailProvider](#communicationcreateemailprovider)
  * [Communication#getEmailProviderById](#communicationgetemailproviderbyid)
  * [Communication#updateEmailProviderById](#communicationupdateemailproviderbyid)
  * [Communication#getEmailTemplates](#communicationgetemailtemplates)
  * [Communication#createEmailTemplate](#communicationcreateemailtemplate)
  * [Communication#getSystemEmailTemplates](#communicationgetsystememailtemplates)
  * [Communication#getEmailTemplateById](#communicationgetemailtemplatebyid)
  * [Communication#updateEmailTemplateById](#communicationupdateemailtemplatebyid)
  * [Communication#deleteEmailTemplateById](#communicationdeleteemailtemplatebyid)
  * [Communication#getEventSubscriptions](#communicationgeteventsubscriptions)
  * [Communication#getJobs](#communicationgetjobs)
  * [Communication#triggerCampaignJob](#communicationtriggercampaignjob)
  * [Communication#getJobLogs](#communicationgetjoblogs)
  * [Communication#getCommunicationLogs](#communicationgetcommunicationlogs)
  * [Communication#getSystemNotifications](#communicationgetsystemnotifications)
  * [Communication#getSmsProviders](#communicationgetsmsproviders)
  * [Communication#createSmsProvider](#communicationcreatesmsprovider)
  * [Communication#getSmsProviderById](#communicationgetsmsproviderbyid)
  * [Communication#updateSmsProviderById](#communicationupdatesmsproviderbyid)
  * [Communication#getSmsTemplates](#communicationgetsmstemplates)
  * [Communication#createSmsTemplate](#communicationcreatesmstemplate)
  * [Communication#getSmsTemplateById](#communicationgetsmstemplatebyid)
  * [Communication#updateSmsTemplateById](#communicationupdatesmstemplatebyid)
  * [Communication#deleteSmsTemplateById](#communicationdeletesmstemplatebyid)
  * [Communication#getSystemSystemTemplates](#communicationgetsystemsystemtemplates)
 
* [Payment](#Payment)
  * [Payment#getBrandPaymentGatewayConfig](#paymentgetbrandpaymentgatewayconfig)
  * [Payment#saveBrandPaymentGatewayConfig](#paymentsavebrandpaymentgatewayconfig)
  * [Payment#updateBrandPaymentGatewayConfig](#paymentupdatebrandpaymentgatewayconfig)
  * [Payment#getPaymentModeRoutes](#paymentgetpaymentmoderoutes)
  * [Payment#getAllPayouts](#paymentgetallpayouts)
  * [Payment#savePayout](#paymentsavepayout)
  * [Payment#updatePayout](#paymentupdatepayout)
  * [Payment#activateAndDectivatePayout](#paymentactivateanddectivatepayout)
  * [Payment#deletePayout](#paymentdeletepayout)
  * [Payment#getSubscriptionPaymentMethod](#paymentgetsubscriptionpaymentmethod)
  * [Payment#deleteSubscriptionPaymentMethod](#paymentdeletesubscriptionpaymentmethod)
  * [Payment#getSubscriptionConfig](#paymentgetsubscriptionconfig)
  * [Payment#saveSubscriptionSetupIntent](#paymentsavesubscriptionsetupintent)
 
* [Order](#Order)
  * [Order#shipmentStatusUpdate](#ordershipmentstatusupdate)
  * [Order#activityStatus](#orderactivitystatus)
  * [Order#storeProcessShipmentUpdate](#orderstoreprocessshipmentupdate)
  * [Order#getOrdersByCompanyId](#ordergetordersbycompanyid)
  * [Order#trackShipmentPlatform](#ordertrackshipmentplatform)
  * [Order#trackOrder](#ordertrackorder)
  * [Order#failedOrders](#orderfailedorders)
  * [Order#reprocessOrder](#orderreprocessorder)
  * [Order#getPing](#ordergetping)
  * [Order#voiceCallback](#ordervoicecallback)
  * [Order#voiceClickToCall](#ordervoiceclicktocall)
 
* [Catalog](#Catalog)
  * [Catalog#deleteSearchKeywords](#catalogdeletesearchkeywords)
  * [Catalog#updateSearchKeywords](#catalogupdatesearchkeywords)
  * [Catalog#getSearchKeywords](#cataloggetsearchkeywords)
  * [Catalog#createCustomKeyword](#catalogcreatecustomkeyword)
  * [Catalog#getAllSearchKeyword](#cataloggetallsearchkeyword)
  * [Catalog#deleteAutocompleteKeyword](#catalogdeleteautocompletekeyword)
  * [Catalog#updateAutocompleteKeyword](#catalogupdateautocompletekeyword)
  * [Catalog#getAutocompleteKeywordDetail](#cataloggetautocompletekeyworddetail)
  * [Catalog#createCustomAutocompleteRule](#catalogcreatecustomautocompleterule)
  * [Catalog#getAutocompleteConfig](#cataloggetautocompleteconfig)
  * [Catalog#createProductBundle](#catalogcreateproductbundle)
  * [Catalog#getProductBundle](#cataloggetproductbundle)
  * [Catalog#updateProductBundle](#catalogupdateproductbundle)
  * [Catalog#getProductBundleDetail](#cataloggetproductbundledetail)
  * [Catalog#createSizeGuide](#catalogcreatesizeguide)
  * [Catalog#getSizeGuides](#cataloggetsizeguides)
  * [Catalog#updateSizeGuide](#catalogupdatesizeguide)
  * [Catalog#getSizeGuide](#cataloggetsizeguide)
  * [Catalog#getCatalogConfiguration](#cataloggetcatalogconfiguration)
  * [Catalog#createConfigurationProductListing](#catalogcreateconfigurationproductlisting)
  * [Catalog#getConfigurations](#cataloggetconfigurations)
  * [Catalog#createConfigurationByType](#catalogcreateconfigurationbytype)
  * [Catalog#getConfigurationByType](#cataloggetconfigurationbytype)
  * [Catalog#getQueryFilters](#cataloggetqueryfilters)
  * [Catalog#createCollection](#catalogcreatecollection)
  * [Catalog#getAllCollections](#cataloggetallcollections)
  * [Catalog#getCollectionDetail](#cataloggetcollectiondetail)
  * [Catalog#deleteCollection](#catalogdeletecollection)
  * [Catalog#updateCollection](#catalogupdatecollection)
  * [Catalog#addCollectionItems](#catalogaddcollectionitems)
  * [Catalog#getCollectionItems](#cataloggetcollectionitems)
  * [Catalog#getCatalogInsights](#cataloggetcataloginsights)
  * [Catalog#getSellerInsights](#cataloggetsellerinsights)
  * [Catalog#createMarketplaceOptin](#catalogcreatemarketplaceoptin)
  * [Catalog#getMarketplaceOptinDetail](#cataloggetmarketplaceoptindetail)
  * [Catalog#getCompanyDetail](#cataloggetcompanydetail)
  * [Catalog#getCompanyBrandDetail](#cataloggetcompanybranddetail)
  * [Catalog#getCompanyMetrics](#cataloggetcompanymetrics)
  * [Catalog#getStoreDetail](#cataloggetstoredetail)
  * [Catalog#listProductTemplateCategories](#cataloglistproducttemplatecategories)
  * [Catalog#listDepartmentsData](#cataloglistdepartmentsdata)
  * [Catalog#getDepartmentData](#cataloggetdepartmentdata)
  * [Catalog#listProductTemplate](#cataloglistproducttemplate)
  * [Catalog#validateProductTemplate](#catalogvalidateproducttemplate)
  * [Catalog#downloadProductTemplateViews](#catalogdownloadproducttemplateviews)
  * [Catalog#downloadProductTemplateView](#catalogdownloadproducttemplateview)
  * [Catalog#validateProductTemplateSchema](#catalogvalidateproducttemplateschema)
  * [Catalog#listHSNCodes](#cataloglisthsncodes)
  * [Catalog#listProductTemplateExportDetails](#cataloglistproducttemplateexportdetails)
  * [Catalog#listTemplateBrandTypeValues](#cataloglisttemplatebrandtypevalues)
  * [Catalog#createCategories](#catalogcreatecategories)
  * [Catalog#listCategories](#cataloglistcategories)
  * [Catalog#updateCategory](#catalogupdatecategory)
  * [Catalog#getCategoryData](#cataloggetcategorydata)
  * [Catalog#createProduct](#catalogcreateproduct)
  * [Catalog#getProducts](#cataloggetproducts)
  * [Catalog#deleteProduct](#catalogdeleteproduct)
  * [Catalog#editProduct](#catalogeditproduct)
  * [Catalog#getProduct](#cataloggetproduct)
  * [Catalog#getProductValidation](#cataloggetproductvalidation)
  * [Catalog#getProductSize](#cataloggetproductsize)
  * [Catalog#updateProductAssetsInBulk](#catalogupdateproductassetsinbulk)
  * [Catalog#getProductBulkUploadHistory](#cataloggetproductbulkuploadhistory)
  * [Catalog#createProductsInBulk](#catalogcreateproductsinbulk)
  * [Catalog#deleteProductBulkJob](#catalogdeleteproductbulkjob)
  * [Catalog#getCompanyTags](#cataloggetcompanytags)
  * [Catalog#createProductAssetsInBulk](#catalogcreateproductassetsinbulk)
  * [Catalog#getProductAssetsInBulk](#cataloggetproductassetsinbulk)
  * [Catalog#deleteSize](#catalogdeletesize)
  * [Catalog#addInventory](#catalogaddinventory)
  * [Catalog#getInventory](#cataloggetinventory)
  * [Catalog#deleteInventory](#catalogdeleteinventory)
  * [Catalog#createBulkInventoryJob](#catalogcreatebulkinventoryjob)
  * [Catalog#getInventoryBulkUploadHistory](#cataloggetinventorybulkuploadhistory)
  * [Catalog#createBulkInventory](#catalogcreatebulkinventory)
  * [Catalog#deleteBulkInventoryJob](#catalogdeletebulkinventoryjob)
  * [Catalog#createInventoryExportJob](#catalogcreateinventoryexportjob)
  * [Catalog#getInventoryExport](#cataloggetinventoryexport)
  * [Catalog#exportInventoryConfig](#catalogexportinventoryconfig)
  * [Catalog#createHsnCode](#catalogcreatehsncode)
  * [Catalog#getAllHsnCodes](#cataloggetallhsncodes)
  * [Catalog#updateHsnCode](#catalogupdatehsncode)
  * [Catalog#getHsnCode](#cataloggethsncode)
  * [Catalog#bulkHsnCode](#catalogbulkhsncode)
 
* [CompanyProfile](#CompanyProfile)
  * [CompanyProfile#updateCompany](#companyprofileupdatecompany)
  * [CompanyProfile#cbsOnboardGet](#companyprofilecbsonboardget)
  * [CompanyProfile#getCompanyMetrics](#companyprofilegetcompanymetrics)
  * [CompanyProfile#editBrand](#companyprofileeditbrand)
  * [CompanyProfile#getBrand](#companyprofilegetbrand)
  * [CompanyProfile#createBrand](#companyprofilecreatebrand)
  * [CompanyProfile#getBrands](#companyprofilegetbrands)
  * [CompanyProfile#createCompanyBrandMapping](#companyprofilecreatecompanybrandmapping)
  * [CompanyProfile#getLocations](#companyprofilegetlocations)
  * [CompanyProfile#createLocation](#companyprofilecreatelocation)
  * [CompanyProfile#updateLocation](#companyprofileupdatelocation)
  * [CompanyProfile#getLocationDetail](#companyprofilegetlocationdetail)
 
* [FileStorage](#FileStorage)
  * [FileStorage#startUpload](#filestoragestartupload)
  * [FileStorage#completeUpload](#filestoragecompleteupload)
  * [FileStorage#appStartUpload](#filestorageappstartupload)
  * [FileStorage#appCompleteUpload](#filestorageappcompleteupload)
  * [FileStorage#getSignUrls](#filestoragegetsignurls)
  * [FileStorage#copyFiles](#filestoragecopyfiles)
  * [FileStorage#appCopyFiles](#filestorageappcopyfiles)
  * [FileStorage#browse](#filestoragebrowse)
  * [FileStorage#appBrowse](#filestorageappbrowse)
  * [FileStorage#proxy](#filestorageproxy)
 
* [Share](#Share)
  * [Share#createShortLink](#sharecreateshortlink)
  * [Share#getShortLinks](#sharegetshortlinks)
  * [Share#getShortLinkByHash](#sharegetshortlinkbyhash)
  * [Share#updateShortLinkById](#shareupdateshortlinkbyid)
 
* [Inventory](#Inventory)
  * [Inventory#getJobsByCompany](#inventorygetjobsbycompany)
  * [Inventory#updateJob](#inventoryupdatejob)
  * [Inventory#createJob](#inventorycreatejob)
  * [Inventory#getJobByCompanyAndIntegration](#inventorygetjobbycompanyandintegration)
  * [Inventory#getJobConfigDefaults](#inventorygetjobconfigdefaults)
  * [Inventory#getJobByCode](#inventorygetjobbycode)
  * [Inventory#getJobCodesByCompanyAndIntegration](#inventorygetjobcodesbycompanyandintegration)
 
* [Configuration](#Configuration)
  * [Configuration#getBuildConfig](#configurationgetbuildconfig)
  * [Configuration#updateBuildConfig](#configurationupdatebuildconfig)
  * [Configuration#getPreviousVersions](#configurationgetpreviousversions)
  * [Configuration#getAppFeatures](#configurationgetappfeatures)
  * [Configuration#updateAppFeatures](#configurationupdateappfeatures)
  * [Configuration#getAppBasicDetails](#configurationgetappbasicdetails)
  * [Configuration#updateAppBasicDetails](#configurationupdateappbasicdetails)
  * [Configuration#getAppContactInfo](#configurationgetappcontactinfo)
  * [Configuration#updateAppContactInfo](#configurationupdateappcontactinfo)
  * [Configuration#getAppApiTokens](#configurationgetappapitokens)
  * [Configuration#updateAppApiTokens](#configurationupdateappapitokens)
  * [Configuration#getAppCompanies](#configurationgetappcompanies)
  * [Configuration#getAppStores](#configurationgetappstores)
  * [Configuration#getInventoryConfig](#configurationgetinventoryconfig)
  * [Configuration#updateInventoryConfig](#configurationupdateinventoryconfig)
  * [Configuration#partiallyUpdateInventoryConfig](#configurationpartiallyupdateinventoryconfig)
  * [Configuration#getAppCurrencyConfig](#configurationgetappcurrencyconfig)
  * [Configuration#updateAppCurrencyConfig](#configurationupdateappcurrencyconfig)
  * [Configuration#getOrderingStoresByFilter](#configurationgetorderingstoresbyfilter)
  * [Configuration#updateOrderingStoreConfig](#configurationupdateorderingstoreconfig)
  * [Configuration#getDomains](#configurationgetdomains)
  * [Configuration#addDomain](#configurationadddomain)
  * [Configuration#removeDomainById](#configurationremovedomainbyid)
  * [Configuration#changeDomainType](#configurationchangedomaintype)
  * [Configuration#getDomainStatus](#configurationgetdomainstatus)
  * [Configuration#createApplication](#configurationcreateapplication)
  * [Configuration#getApplications](#configurationgetapplications)
  * [Configuration#getApplicationById](#configurationgetapplicationbyid)
  * [Configuration#getCurrencies](#configurationgetcurrencies)
  * [Configuration#getDomainAvailibility](#configurationgetdomainavailibility)
  * [Configuration#getIntegrationById](#configurationgetintegrationbyid)
  * [Configuration#getAvailableOptIns](#configurationgetavailableoptins)
  * [Configuration#getSelectedOptIns](#configurationgetselectedoptins)
  * [Configuration#getIntegrationLevelConfig](#configurationgetintegrationlevelconfig)
  * [Configuration#getIntegrationByLevelId](#configurationgetintegrationbylevelid)
  * [Configuration#getLevelActiveIntegrations](#configurationgetlevelactiveintegrations)
  * [Configuration#getBrandsByCompany](#configurationgetbrandsbycompany)
  * [Configuration#getCompanyByBrands](#configurationgetcompanybybrands)
  * [Configuration#getStoreByBrands](#configurationgetstorebybrands)
  * [Configuration#getOtherSellerApplications](#configurationgetothersellerapplications)
  * [Configuration#getOtherSellerApplicationById](#configurationgetothersellerapplicationbyid)
  * [Configuration#optOutFromApplication](#configurationoptoutfromapplication)
 
* [Cart](#Cart)
  * [Cart#getCoupons](#cartgetcoupons)
  * [Cart#createCoupon](#cartcreatecoupon)
  * [Cart#getCouponById](#cartgetcouponbyid)
  * [Cart#updateCoupon](#cartupdatecoupon)
  * [Cart#updateCouponPartially](#cartupdatecouponpartially)
 
* [Marketplaces](#Marketplaces)
  * [Marketplaces#getAvailableChannels](#marketplacesgetavailablechannels)
  * [Marketplaces#getChannels](#marketplacesgetchannels)
  * [Marketplaces#getChannel](#marketplacesgetchannel)
  * [Marketplaces#registerMyntraChannel](#marketplacesregistermyntrachannel)
  * [Marketplaces#updateMyntraChannelCredentials](#marketplacesupdatemyntrachannelcredentials)
  * [Marketplaces#registerAmazonChannel](#marketplacesregisteramazonchannel)
  * [Marketplaces#updateAmazonChannelCredentials](#marketplacesupdateamazonchannelcredentials)
  * [Marketplaces#registerFlipkartChannel](#marketplacesregisterflipkartchannel)
  * [Marketplaces#updateFlipkartChannelCredentials](#marketplacesupdateflipkartchannelcredentials)
  * [Marketplaces#registerTatacliqChannel](#marketplacesregistertatacliqchannel)
  * [Marketplaces#updateTatacliqChannelCredentials](#marketplacesupdatetatacliqchannelcredentials)
  * [Marketplaces#registerAjioChannel](#marketplacesregisterajiochannel)
  * [Marketplaces#updateAjioChannelCredentials](#marketplacesupdateajiochannelcredentials)
  * [Marketplaces#updateChannelInventorySyncConfig](#marketplacesupdatechannelinventorysyncconfig)
  * [Marketplaces#getChannelLocationConfig](#marketplacesgetchannellocationconfig)
  * [Marketplaces#updateChannelLocationConfig](#marketplacesupdatechannellocationconfig)
  * [Marketplaces#getChannelStatus](#marketplacesgetchannelstatus)
  * [Marketplaces#updateChannelStatus](#marketplacesupdatechannelstatus)
  * [Marketplaces#triggerChannelInventoryUpdates](#marketplacestriggerchannelinventoryupdates)
 
* [Rewards](#Rewards)
  * [Rewards#getGiveaways](#rewardsgetgiveaways)
  * [Rewards#createGiveaway](#rewardscreategiveaway)
  * [Rewards#getGiveawayByID](#rewardsgetgiveawaybyid)
  * [Rewards#updateGiveaway](#rewardsupdategiveaway)
  * [Rewards#getOffers](#rewardsgetoffers)
  * [Rewards#getOfferByName](#rewardsgetofferbyname)
  * [Rewards#updateOfferByName](#rewardsupdateofferbyname)
  * [Rewards#getUserAvailablePoints](#rewardsgetuseravailablepoints)
  * [Rewards#updateUserStatus](#rewardsupdateuserstatus)
  * [Rewards#getUserPointsHistory](#rewardsgetuserpointshistory)
 
* [Analytics](#Analytics)
  * [Analytics#getStatiscticsGroups](#analyticsgetstatiscticsgroups)
  * [Analytics#getStatiscticsGroupComponents](#analyticsgetstatiscticsgroupcomponents)
  * [Analytics#getComponentStatsCSV](#analyticsgetcomponentstatscsv)
  * [Analytics#getComponentStatsPDF](#analyticsgetcomponentstatspdf)
  * [Analytics#getComponentStats](#analyticsgetcomponentstats)
  * [Analytics#getAbandonCartList](#analyticsgetabandoncartlist)
  * [Analytics#getAbandonCartsCSV](#analyticsgetabandoncartscsv)
  * [Analytics#getAbandonCartDetail](#analyticsgetabandoncartdetail)
  * [Analytics#createExportJob](#analyticscreateexportjob)
  * [Analytics#getExportJobStatus](#analyticsgetexportjobstatus)
  * [Analytics#getLogsList](#analyticsgetlogslist)
  * [Analytics#searchLogs](#analyticssearchlogs)
 

---
---



## Lead

```javascript
const { Configuration, Lead } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const lead = new Lead(conf);

```


#### Lead#getTickets
Gets the list of company level tickets and/or ticket filters depending on query params

```kotlin
lead.getTickets(companyId: companyId, items: items, filters: filters, q: q, status: status, priority: priority, category: category, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for which the data will be returned | 
| items | boolean | Decides that the reponse will contain the list of tickets | 
| filters | boolean | Decides that the reponse will contain the ticket filters | 
| q | string | Search through ticket titles and description | 
| status | string | Filter tickets on status | 
| priority | string | Filter tickets on priority | 
| category | string | Filter tickets on category | 
| page_no | integer | The page number to navigate through the given set of results. | 
| page_size | integer | Number of items to retrieve in each page. Default is 12. | 


Gets the list of company level tickets and/or ticket filters


---


#### Lead#createTicket
Creates a company level ticket

```kotlin
lead.createTicket(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for which the data will be returned | 


Creates a company level ticket


---


#### Lead#getTickets
Gets the list of Application level Tickets and/or ticket filters depending on query params

```kotlin
lead.getTickets(companyId: companyId, applicationId: applicationId, items: items, filters: filters, q: q, status: status, priority: priority, category: category).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for which the data will be returned | 
| items | boolean | Decides that the reponse will contain the list of tickets | 
| filters | boolean | Decides that the reponse will contain the ticket filters | 
| q | string | Search through ticket titles and description | 
| status | string | Filter tickets on status | 
| priority | string | Filter tickets on priority | 
| category | string | Filter tickets on category | 


Gets the list of Application level Tickets and/or ticket filters


---


#### Lead#getTicket
Retreives ticket details of a company level ticket with ticket ID

```kotlin
lead.getTicket(companyId: companyId, ticketId: ticketId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for which the data will be returned | 
| ticket_id | string | Tiket ID of the ticket to be fetched | 


Retreives ticket details of a company level ticket


---


#### Lead#editTicket
Edits ticket details of a company level ticket

```kotlin
lead.editTicket(companyId: companyId, ticketId: ticketId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for ticket | 
| ticket_id | string | Ticket ID of ticket to be edited | 


Edits ticket details of a company level ticket such as status, priority, category, tags, attachments, assigne & ticket content changes


---


#### Lead#getTicket
Retreives ticket details of a application level ticket

```kotlin
lead.getTicket(companyId: companyId, applicationId: applicationId, ticketId: ticketId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for which the data will be returned | 
| ticket_id | string | Tiket ID of the ticket to be fetched | 


Retreives ticket details of a application level ticket with ticket ID


---


#### Lead#editTicket
Edits ticket details of a application level ticket

```kotlin
lead.editTicket(companyId: companyId, applicationId: applicationId, ticketId: ticketId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for ticket | 
| ticket_id | string | Ticket ID of ticket to be edited | 


Edits ticket details of a application level ticket such as status, priority, category, tags, attachments, assigne & ticket content changes


---


#### Lead#createHistory
Create history for specific company level ticket

```kotlin
lead.createHistory(companyId: companyId, ticketId: ticketId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for ticket | 
| ticket_id | string | Ticket ID for which history is created | 


Create history for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.


---


#### Lead#getTicketHistory
Gets history list for specific company level ticket

```kotlin
lead.getTicketHistory(companyId: companyId, ticketId: ticketId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for ticket | 
| ticket_id | string | Ticket ID for which history is to be fetched | 


Gets history list for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.


---


#### Lead#createHistory
Create history for specific application level ticket

```kotlin
lead.createHistory(companyId: companyId, applicationId: applicationId, ticketId: ticketId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for ticket | 
| ticket_id | string | Ticket ID for which history is created | 


Create history for specific application level ticket, this history is seen on ticket detail page, this can be comment, log or rating.


---


#### Lead#getTicketHistory
Gets history list for specific application level ticket

```kotlin
lead.getTicketHistory(companyId: companyId, applicationId: applicationId, ticketId: ticketId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of application | 
| application_id | string | Application ID for ticket | 
| ticket_id | string | Ticket ID for which history is to be fetched | 


Gets history list for specific application level ticket, this history is seen on ticket detail page, this can be comment, log or rating.


---


#### Lead#getCustomForm
Get specific custom form using it's slug

```kotlin
lead.getCustomForm(companyId: companyId, applicationId: applicationId, slug: slug).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for the form | 
| slug | string | Slug of form whose response is getting submitted | 


Get specific custom form using it's slug, this is used to view the form.


---


#### Lead#editCustomForm
Edit the given custom form

```kotlin
lead.editCustomForm(companyId: companyId, applicationId: applicationId, slug: slug, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for the form | 
| slug | string | Slug of form whose response is getting submitted | 


Edit the given custom form field such as adding or deleting input, assignee, title, decription, notification and polling information.


---


#### Lead#getCustomForms
Get list of custom form

```kotlin
lead.getCustomForms(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for the form | 


Get list of custom form for given application


---


#### Lead#createCustomForm
Creates a new custom form

```kotlin
lead.createCustomForm(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for the form | 


Creates a new custom form for given application


---


#### Lead#getTokenForVideoRoom
Get Token to join a specific Video Room using it's unqiue name

```kotlin
lead.getTokenForVideoRoom(companyId: companyId, applicationId: applicationId, uniqueName: uniqueName).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for video room | 
| unique_name | string | Unique name of video room | 


Get Token to join a specific Video Room using it's unqiue name, this Token is your ticket to Room and also creates your identity there.


---


#### Lead#getVideoParticipants
Get participants of a specific Video Room using it's unique name

```kotlin
lead.getVideoParticipants(companyId: companyId, applicationId: applicationId, uniqueName: uniqueName).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for video room | 
| unique_name | string | Unique name of Video Room | 


Get participants of a specific Video Room using it's unique name, this can be used to check if people are already there in the room and also to show their names.


---


#### Lead#openVideoRoom
Open a video room.

```kotlin
lead.openVideoRoom(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for video room | 


Open a video room.


---


#### Lead#closeVideoRoom
Close the video room and force all participants to leave.

```kotlin
lead.closeVideoRoom(companyId: companyId, applicationId: applicationId, uniqueName: uniqueName).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for video room | 
| unique_name | string | Unique name of Video Room | 


Close the video room and force all participants to leave.


---



---
---


## Feedback

```javascript
const { Configuration, Feedback } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const feedback = new Feedback(conf);

```


#### Feedback#getAttributes
Get list of attribute data

```kotlin
feedback.getAttributes(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| page_no | integer | pagination page no | 
| page_size | integer | pagination page size | 


Provides a list of all attribute data.


---


#### Feedback#getCustomerReviews
Get list of customer reviews [admin]

```kotlin
feedback.getCustomerReviews(companyId: companyId, applicationId: applicationId, id: id, entityId: entityId, entityType: entityType, userId: userId, media: media, rating: rating, attributeRating: attributeRating, facets: facets, sort: sort, next: next, start: start, limit: limit, count: count, pageId: pageId, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| id | string | review id | 
| entity_id | string | entity id | 
| entity_type | string | entity type | 
| user_id | string | user id | 
| media | string | media type e.g. image | video | video_file | video_link | 
| rating | array | rating filter, 1-5 | 
| attribute_rating | array | attribute rating filter with ma,e of attribute | 
| facets | boolean | facets (true|false) | 
| sort | string | sort by : default | top | recent | 
| next | string | pagination next | 
| start | string | pagination start | 
| limit | string | pagination limit | 
| count | string | pagination count | 
| page_id | string | pagination page id | 
| page_size | integer | pagination page size | 


The endpoint provides a list of customer reviews based on entity and provided filters


---


#### Feedback#updateApprove
update approve details

```kotlin
feedback.updateApprove(companyId: companyId, applicationId: applicationId, reviewId: reviewId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| review_id | string | review id | 


The is used to update approve details like status and description text


---


#### Feedback#getHistory
get history details

```kotlin
feedback.getHistory(companyId: companyId, applicationId: applicationId, reviewId: reviewId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| review_id | string | review id | 


The is used to get the history details like status and description text


---


#### Feedback#getApplicationTemplates
Get list of templates

```kotlin
feedback.getApplicationTemplates(companyId: companyId, applicationId: applicationId, pageId: pageId, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| page_id | string | pagination page id | 
| page_size | integer | pagination page size | 


Get all templates of application


---


#### Feedback#createTemplate
Create a new template

```kotlin
feedback.createTemplate(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 


Create a new template for review with following data:
- Enable media, rating and review
- Rating - active/inactive/selected rate choices, attributes, text on rate, comment for each rate, type
- Review - header, title, description, image and video meta, enable votes


---


#### Feedback#getTemplateById
Get a template by ID

```kotlin
feedback.getTemplateById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| id | string | template id | 


Get the template for product or l3 type by ID


---


#### Feedback#updateTemplate
Update a template's status

```kotlin
feedback.updateTemplate(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| id | string | template id | 


Update existing template status, active/archive


---


#### Feedback#updateTemplateStatus
Update a template's status

```kotlin
feedback.updateTemplateStatus(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| id | string | template id | 


Update existing template status, active/archive


---



---
---


## Theme

```javascript
const { Configuration, Theme } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const theme = new Theme(conf);

```


#### Theme#getThemeLibrary
Gets list of themes in theme library

```kotlin
theme.getThemeLibrary(companyId: companyId, applicationId: applicationId, pageSize: pageSize, pageNo: pageNo).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| page_size | integer | Number of items to retrieve in each page. Default is 10. | 
| page_no | integer | Page number. Default is 1. | 


Gets list of themes in theme library


---


#### Theme#addToThemeLibrary
Add theme to theme library

```kotlin
theme.addToThemeLibrary(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Add theme to theme library


---


#### Theme#applyTheme
Apply theme

```kotlin
theme.applyTheme(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Apply theme


---


#### Theme#isUpgradable
Checks if theme is upgradable

```kotlin
theme.isUpgradable(companyId: companyId, applicationId: applicationId, themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| theme_id | string | Theme ID | 


Checks if theme is upgradable


---


#### Theme#upgradeTheme
Upgrades theme

```kotlin
theme.upgradeTheme(companyId: companyId, applicationId: applicationId, themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| theme_id | string | Theme ID | 


Upgrades theme


---


#### Theme#getPublicThemes
Gets public themes

```kotlin
theme.getPublicThemes(companyId: companyId, applicationId: applicationId, pageSize: pageSize, pageNo: pageNo).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| page_size | integer | Number of items to retrieve in each page. Default is 10. | 
| page_no | integer | Page number. Default is 1. | 


Gets public themes


---


#### Theme#createTheme
Create new theme

```kotlin
theme.createTheme(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Create new theme


---


#### Theme#getAppliedTheme
Get applied theme

```kotlin
theme.getAppliedTheme(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Get applied theme


---


#### Theme#getFonts
Gets fonts

```kotlin
theme.getFonts(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Gets fonts


---


#### Theme#getThemeById
Gets theme by id

```kotlin
theme.getThemeById(companyId: companyId, applicationId: applicationId, themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| theme_id | string | Theme ID | 


Gets theme by id


---


#### Theme#updateTheme
Update theme

```kotlin
theme.updateTheme(companyId: companyId, applicationId: applicationId, themeId: themeId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| theme_id | string | Theme ID | 


Update theme


---


#### Theme#deleteTheme
Delete theme

```kotlin
theme.deleteTheme(companyId: companyId, applicationId: applicationId, themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| theme_id | string | Theme ID | 


Delete theme


---


#### Theme#getThemeForPreview
Gets theme for preview

```kotlin
theme.getThemeForPreview(companyId: companyId, applicationId: applicationId, themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| theme_id | string | Theme ID | 


Gets theme for preview


---


#### Theme#publishTheme
Publish theme

```kotlin
theme.publishTheme(companyId: companyId, applicationId: applicationId, themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| theme_id | string | Theme ID | 


Publish theme


---


#### Theme#unpublishTheme
Unpublish theme

```kotlin
theme.unpublishTheme(companyId: companyId, applicationId: applicationId, themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| theme_id | string | Theme ID | 


Unpublish theme


---


#### Theme#archiveTheme
Archive theme

```kotlin
theme.archiveTheme(companyId: companyId, applicationId: applicationId, themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| theme_id | string | Theme ID | 


Archive theme


---


#### Theme#unarchiveTheme
Unarchive theme

```kotlin
theme.unarchiveTheme(companyId: companyId, applicationId: applicationId, themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| theme_id | string | Theme ID | 


Unarchive theme


---



---
---


## User

```javascript
const { Configuration, User } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const user = new User(conf);

```


#### User#getCustomers
Gets list of customers

```kotlin
user.getCustomers(companyId: companyId, applicationId: applicationId, q: q, pageSize: pageSize, pageNo: pageNo).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| q | string | The search query. This can be a partial or complete name of a either a product, brand or category | 
| page_size | integer | Number of items to retrieve in each page. Default is 10. | 
| page_no | integer | Page number. Default is 1. | 


Used to get application customers list


---


#### User#searchUsers
Search users

```kotlin
user.searchUsers(companyId: companyId, applicationId: applicationId, q: q).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| q | string | The search query. This can be a partial or complete name of a either a product, brand or category | 


Search users


---


#### User#getPlatformConfig
Get platform config

```kotlin
user.getPlatformConfig(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Used to get platform config


---


#### User#updatePlatformConfig
Update platform config

```kotlin
user.updatePlatformConfig(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Used to update platform config


---



---
---


## Content

```javascript
const { Configuration, Content } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const content = new Content(conf);

```


#### Content#getAnnouncementsList
Get annoucements list

```kotlin
content.getAnnouncementsList(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| page_no | integer | Each response will contain **page_no** param, which should be sent back to make pagination work. | 
| page_size | integer | Number of items to retrieve in each page. | 


Get list of announcements


---


#### Content#createAnnouncement
Create an annoucement

```kotlin
content.createAnnouncement(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Create an announcement


---


#### Content#getAnnouncementById
Get annoucement by id

```kotlin
content.getAnnouncementById(companyId: companyId, applicationId: applicationId, announcementId: announcementId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| announcement_id | string | Announcement ID | 


Get announcement by id


---


#### Content#updateAnnouncement
Update an annoucement

```kotlin
content.updateAnnouncement(companyId: companyId, applicationId: applicationId, announcementId: announcementId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| announcement_id | string | Announcement ID | 


Update an announcement


---


#### Content#updateAnnouncementSchedule
Update schedule or published status of an annoucement

```kotlin
content.updateAnnouncementSchedule(companyId: companyId, applicationId: applicationId, announcementId: announcementId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| announcement_id | string | Announcement ID | 


Update schedule or published status of an announcement


---


#### Content#deleteAnnouncement
Delete annoucement by id

```kotlin
content.deleteAnnouncement(companyId: companyId, applicationId: applicationId, announcementId: announcementId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| announcement_id | string | Announcement ID | 


Delete announcement by id


---


#### Content#createBlog
Create blog

```kotlin
content.createBlog(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 


Use this to create a blog.


---


#### Content#getBlogs
Get blogs

```kotlin
content.getBlogs(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| page_no | integer | Each response will contain **page_no** param, which should be sent back to make pagination work. | 
| page_size | integer | Number of items to retrieve in each page. | 


Use this to get blogs.


---


#### Content#updateBlog
Update blog

```kotlin
content.updateBlog(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| id | string | Blog Id | 


Use this to update blog.


---


#### Content#deleteBlog
Delete blogs

```kotlin
content.deleteBlog(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| id | string | Blog Id | 


Use this to delete blogs.


---


#### Content#getComponentById
Get components by component Id

```kotlin
content.getComponentById(companyId: companyId, applicationId: applicationId, slug: slug).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| slug | string | slug of page to be fetched | 


The endpoint fetches the component by component Id


---


#### Content#getFaqCategories
Get FAQ categories list

```kotlin
content.getFaqCategories(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Get list of FAQ categories


---


#### Content#getFaqCategoryBySlugOrId
Get FAQ category by slug or id

```kotlin
content.getFaqCategoryBySlugOrId(companyId: companyId, applicationId: applicationId, idOrSlug: idOrSlug).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| id_or_slug | string | Slug or Id of FAQ Category | 


Get FAQ category by slug or id


---


#### Content#createFaqCategory
Creates a FAQ category

```kotlin
content.createFaqCategory(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Add Faq Category


---


#### Content#updateFaqCategory
Updates a FAQ category

```kotlin
content.updateFaqCategory(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| id | string | Faq category ID | 


Update Faq Category


---


#### Content#deleteFaqCategory
Deletes a FAQ category

```kotlin
content.deleteFaqCategory(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| id | string | Faq category ID | 


Delete Faq Category


---


#### Content#getFaqsByCategoryIdOrSlug
Get FAQs of a Faq Category id or slug

```kotlin
content.getFaqsByCategoryIdOrSlug(companyId: companyId, applicationId: applicationId, idOrSlug: idOrSlug).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| id_or_slug | string | Faq category ID or slug | 


Get FAQs of a Faq Category `id` or `slug`


---


#### Content#addFaq
Creates FAQs for category whose `id` is specified

```kotlin
content.addFaq(companyId: companyId, applicationId: applicationId, categoryId: categoryId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| category_id | string | Faq category ID | 


Creates FAQs for category whose `id` is specified


---


#### Content#updateFaq
Updates FAQ

```kotlin
content.updateFaq(companyId: companyId, applicationId: applicationId, categoryId: categoryId, faqId: faqId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| category_id | string | Faq category ID | 
| faq_id | string | Faq ID | 


Updates FAQ


---


#### Content#deleteFaq
Delete FAQ

```kotlin
content.deleteFaq(companyId: companyId, applicationId: applicationId, categoryId: categoryId, faqId: faqId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| category_id | string | Faq category ID | 
| faq_id | string | Faq ID | 


Delete FAQ


---


#### Content#getFaqByIdOrSlug
Get frequently asked question

```kotlin
content.getFaqByIdOrSlug(companyId: companyId, applicationId: applicationId, idOrSlug: idOrSlug).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| id_or_slug | string | Slug or Id of FAQ | 


Get frequently asked questions list. These will be helpful for users to using website.


---


#### Content#getLandingPages
Get landing-pages

```kotlin
content.getLandingPages(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| page_no | integer | Each response will contain **page_no** param, which should be sent back to make pagination work. | 
| page_size | integer | Number of items to retrieve in each page. | 


Use this to get landing-pages.


---


#### Content#createLandingPage
Create landing-page

```kotlin
content.createLandingPage(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Use this to create landing-page.


---


#### Content#updateLandingPage
Update landing-page

```kotlin
content.updateLandingPage(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| id | string | Landing page ID | 


Use this to update landing-page.


---


#### Content#deleteLandingPage
Delete landing-page

```kotlin
content.deleteLandingPage(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| id | string | Landing page ID | 


Use this to delete landing-page.


---


#### Content#getLegalInformation
Get legal information

```kotlin
content.getLegalInformation(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Get legal information of application, which includes policy, Terms and Conditions, and FAQ information of application.


---


#### Content#updateLegalInformation
Save legal information

```kotlin
content.updateLegalInformation(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Save legal information of application, which includes Policy, Terms and Conditions, and FAQ information of application.


---


#### Content#getNavigations
Get navigations

```kotlin
content.getNavigations(companyId: companyId, applicationId: applicationId, devicePlatform: devicePlatform, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| device_platform | string | Device platform | 
| page_no | integer | Each response will contain **page_no** param, which should be sent back to make pagination work. | 
| page_size | integer | Number of items to retrieve in each page. | 


Use this to get navigations.


---


#### Content#createNavigation
Create navigation

```kotlin
content.createNavigation(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Use this to create navigation.


---


#### Content#getDefaultNavigations
Get default navigations

```kotlin
content.getDefaultNavigations(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Use this to get default navigations.


---


#### Content#getNavigationBySlug
Get navigation by slug

```kotlin
content.getNavigationBySlug(companyId: companyId, applicationId: applicationId, slug: slug, devicePlatform: devicePlatform).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| slug | string | Slug | 
| device_platform | string | Device platform | 


Use this to get navigation by slug.


---


#### Content#updateNavigation
Update navigation

```kotlin
content.updateNavigation(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| id | string | Navigation ID | 


Use this to update navigation.


---


#### Content#deleteNavigation
Delete navigation

```kotlin
content.deleteNavigation(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| id | string | Navigation ID | 


Use this to delete navigation.


---


#### Content#getPageMeta
Get page meta

```kotlin
content.getPageMeta(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 


Use this to get Page Meta.


---


#### Content#getPageSpec
Get page spec

```kotlin
content.getPageSpec(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Use this to get page spec.


---


#### Content#createPage
Create page

```kotlin
content.createPage(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 


Use this to create a page.


---


#### Content#getPages
Get pages

```kotlin
content.getPages(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| page_no | integer | Each response will contain **page_no** param, which should be sent back to make pagination work. | 
| page_size | integer | Number of items to retrieve in each page. | 


Use this to get pages.


---


#### Content#createPagePreview
Create page preview

```kotlin
content.createPagePreview(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 


Use this to create a page preview.


---


#### Content#updatePagePreview
Update page

```kotlin
content.updatePagePreview(companyId: companyId, applicationId: applicationId, slug: slug, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| slug | string | Page publish slug | 


Use this to update page.


---


#### Content#updatePage
Update page

```kotlin
content.updatePage(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| id | string | Page Id | 


Use this to update page.


---


#### Content#deletePage
Delete page

```kotlin
content.deletePage(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| id | string | Page Id | 


Use this to delete page.


---


#### Content#getPageBySlug
Get pages by component Id

```kotlin
content.getPageBySlug(companyId: companyId, applicationId: applicationId, slug: slug).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| slug | string | Slug of page to be fetched | 


The endpoint fetches the component by component Id


---


#### Content#getSEOConfiguration
Get seo of application

```kotlin
content.getSEOConfiguration(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Get seo of application


---


#### Content#updateSEOConfiguration
Update seo of application

```kotlin
content.updateSEOConfiguration(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Update seo of application


---


#### Content#getSlideshows
Get slideshows

```kotlin
content.getSlideshows(companyId: companyId, applicationId: applicationId, devicePlatform: devicePlatform, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| device_platform | string | Device platform | 
| page_no | integer | Each response will contain **page_no** param, which should be sent back to make pagination work. | 
| page_size | integer | Number of items to retrieve in each page. | 


Use this to get slideshows.


---


#### Content#createSlideshow
Create slideshow

```kotlin
content.createSlideshow(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Use this to create slideshow.


---


#### Content#getSlideshowBySlug
Get slideshow by slug

```kotlin
content.getSlideshowBySlug(companyId: companyId, applicationId: applicationId, slug: slug, devicePlatform: devicePlatform).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| slug | string | Slug | 
| device_platform | string | Device platform | 


Use this to get slideshow by slug.


---


#### Content#updateSlideshow
Update slideshow

```kotlin
content.updateSlideshow(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| id | string | Slideshow ID | 


Use this to update slideshow.


---


#### Content#deleteSlideshow
Delete slideshow

```kotlin
content.deleteSlideshow(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| id | string | Slideshow ID | 


Use this to delete slideshow.


---


#### Content#getSupportInformation
Get support information

```kotlin
content.getSupportInformation(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Get contact details for customer support. Including emails and phone numbers


---


#### Content#updateSupportInformation
Update support data of application

```kotlin
content.updateSupportInformation(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Update support data of application


---


#### Content#createInjectableTag
Creates Tag

```kotlin
content.createInjectableTag(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Create tags


---


#### Content#updateInjectableTag
Updates a Tag

```kotlin
content.updateInjectableTag(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Update tag


---


#### Content#deleteAllInjectableTags
Delete tags for application

```kotlin
content.deleteAllInjectableTags(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Delete tags for application


---


#### Content#getInjectableTags
Get tags for application

```kotlin
content.getInjectableTags(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Get tags for application


---


#### Content#addInjectableTag
Adds a Tag

```kotlin
content.addInjectableTag(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Add tag


---


#### Content#removeInjectableTag
Removes a Tag

```kotlin
content.removeInjectableTag(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Remove a particular tag


---


#### Content#editInjectableTag
Edits a Tag by Id

```kotlin
content.editInjectableTag(companyId: companyId, applicationId: applicationId, tagId: tagId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| tag_id | string | Tag ID | 


Edits a particular tag


---



---
---


## Billing

```javascript
const { Configuration, Billing } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const billing = new Billing(conf);

```


#### Billing#getInvoices
Get invoices

```kotlin
billing.getInvoices(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Customer unique id. In case of company it will be company id. | 


Get invoices.


---


#### Billing#getInvoiceById
Get invoice by id

```kotlin
billing.getInvoiceById(companyId: companyId, invoiceId: invoiceId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Customer unique id. In case of company it will be company id. | 
| invoice_id | string | Invoice id | 


Get invoice by id.


---


#### Billing#getCustomerDetail
Get subscription customer detail

```kotlin
billing.getCustomerDetail(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Customer unique id. In case of company it will be company id. | 


Get subscription customer detail.


---


#### Billing#upsertCustomerDetail
Upsert subscription customer detail

```kotlin
billing.upsertCustomerDetail(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Customer unique id. In case of company it will be company id. | 


Upsert subscription customer detail.


---


#### Billing#getSubscription
Get current subscription detail

```kotlin
billing.getSubscription(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Customer unique id. In case of company it will be company id. | 


If subscription is active then it will return is_enabled true and return subscription object. If subscription is not active then is_enabled false and message.



---


#### Billing#getFeatureLimitConfig
Get subscription subscription limits

```kotlin
billing.getFeatureLimitConfig(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Customer unique id. In case of company it will be company id. | 


Get subscription subscription limits.


---


#### Billing#activateSubscriptionPlan
Activate subscription

```kotlin
billing.activateSubscriptionPlan(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Customer unique id. In case of company it will be company id. | 


It will activate subscription plan for customer


---


#### Billing#cancelSubscriptionPlan
Cancel subscription

```kotlin
billing.cancelSubscriptionPlan(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Customer unique id. In case of company it will be company id. | 


It will cancel current active subscription.


---



---
---


## Communication

```javascript
const { Configuration, Communication } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const communication = new Communication(conf);

```


#### Communication#getCampaigns
Get campaigns

```kotlin
communication.getCampaigns(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, sort: sort).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 
| sort | object | To sort based on created_at | 


Get campaigns


---


#### Communication#createCampaign
Create campaign

```kotlin
communication.createCampaign(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create campaign


---


#### Communication#getCampaignById
Get campaign by id

```kotlin
communication.getCampaignById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Campaign id | 


Get campaign by id


---


#### Communication#updateCampaignById
Update campaign by id

```kotlin
communication.updateCampaignById(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Campaign id | 


Update campaign by id


---


#### Communication#getStatsOfCampaignById
Get stats of campaign by id

```kotlin
communication.getStatsOfCampaignById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Campaign id | 


Get stats of campaign by id


---


#### Communication#getAudiences
Get audiences

```kotlin
communication.getAudiences(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, sort: sort).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 
| sort | object | To sort based on created_at | 


Get audiences


---


#### Communication#createAudience
Create audience

```kotlin
communication.createAudience(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create audience


---


#### Communication#getBigqueryHeaders
Get bigquery headers

```kotlin
communication.getBigqueryHeaders(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get bigquery headers


---


#### Communication#getAudienceById
Get audience by id

```kotlin
communication.getAudienceById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Audience id | 


Get audience by id


---


#### Communication#updateAudienceById
Update audience by id

```kotlin
communication.updateAudienceById(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Audience id | 


Update audience by id


---


#### Communication#getNSampleRecordsFromCsv
Get n sample records from csv

```kotlin
communication.getNSampleRecordsFromCsv(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get n sample records from csv


---


#### Communication#getEmailProviders
Get email providers

```kotlin
communication.getEmailProviders(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, sort: sort).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 
| sort | object | To sort based on created_at | 


Get email providers


---


#### Communication#createEmailProvider
Create email provider

```kotlin
communication.createEmailProvider(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create email provider


---


#### Communication#getEmailProviderById
Get email provider by id

```kotlin
communication.getEmailProviderById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Email provider id | 


Get email provider by id


---


#### Communication#updateEmailProviderById
Update email provider by id

```kotlin
communication.updateEmailProviderById(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Email provider id | 


Update email provider by id


---


#### Communication#getEmailTemplates
Get email templates

```kotlin
communication.getEmailTemplates(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, sort: sort).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 
| sort | object | To sort based on created_at | 


Get email templates


---


#### Communication#createEmailTemplate
Create email template

```kotlin
communication.createEmailTemplate(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create email template


---


#### Communication#getSystemEmailTemplates
Get system email templates

```kotlin
communication.getSystemEmailTemplates(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, sort: sort).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 
| sort | object | To sort based on created_at | 


Get system email templates


---


#### Communication#getEmailTemplateById
Get email template by id

```kotlin
communication.getEmailTemplateById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Email template id | 


Get email template by id


---


#### Communication#updateEmailTemplateById
Update email template by id

```kotlin
communication.updateEmailTemplateById(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Email template id | 


Update email template by id


---


#### Communication#deleteEmailTemplateById
Delete email template by id

```kotlin
communication.deleteEmailTemplateById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Email template id | 


Delete email template by id


---


#### Communication#getEventSubscriptions
Get event subscriptions

```kotlin
communication.getEventSubscriptions(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, populate: populate).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 
| populate | string | populate fields | 


Get event subscriptions


---


#### Communication#getJobs
Get jobs

```kotlin
communication.getJobs(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, sort: sort).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 
| sort | object | To sort based on created_at | 


Get jobs


---


#### Communication#triggerCampaignJob
Trigger campaign job

```kotlin
communication.triggerCampaignJob(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Trigger campaign job


---


#### Communication#getJobLogs
Get job logs

```kotlin
communication.getJobLogs(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, sort: sort).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 
| sort | object | To sort based on created_at | 


Get job logs


---


#### Communication#getCommunicationLogs
Get communication logs

```kotlin
communication.getCommunicationLogs(companyId: companyId, applicationId: applicationId, pageId: pageId, pageSize: pageSize, sort: sort, query: query).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_id | string | Current page no | 
| page_size | integer | Current request items count | 
| sort | object | To sort based on _id | 
| query | object |  | 


Get communication logs


---


#### Communication#getSystemNotifications
Get system notifications

```kotlin
communication.getSystemNotifications(companyId: companyId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| page_no | integer |  | 
| page_size | integer |  | 


Get system notifications


---


#### Communication#getSmsProviders
Get sms providers

```kotlin
communication.getSmsProviders(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, sort: sort).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 
| sort | object | To sort based on created_at | 


Get sms providers


---


#### Communication#createSmsProvider
Create sms provider

```kotlin
communication.createSmsProvider(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create sms provider


---


#### Communication#getSmsProviderById
Get sms provider by id

```kotlin
communication.getSmsProviderById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Sms provider id | 


Get sms provider by id


---


#### Communication#updateSmsProviderById
Update sms provider by id

```kotlin
communication.updateSmsProviderById(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Sms provider id | 


Update sms provider by id


---


#### Communication#getSmsTemplates
Get sms templates

```kotlin
communication.getSmsTemplates(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, sort: sort).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 
| sort | object | To sort based on created_at | 


Get sms templates


---


#### Communication#createSmsTemplate
Create sms template

```kotlin
communication.createSmsTemplate(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create sms template


---


#### Communication#getSmsTemplateById
Get sms template by id

```kotlin
communication.getSmsTemplateById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Sms template id | 


Get sms template by id


---


#### Communication#updateSmsTemplateById
Update sms template by id

```kotlin
communication.updateSmsTemplateById(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Sms template id | 


Update sms template by id


---


#### Communication#deleteSmsTemplateById
Delete sms template by id

```kotlin
communication.deleteSmsTemplateById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| id | string | Sms template id | 


Delete sms template by id


---


#### Communication#getSystemSystemTemplates
Get system sms templates

```kotlin
communication.getSystemSystemTemplates(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, sort: sort).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 
| sort | object | To sort based on created_at | 


Get system sms templates


---



---
---


## Payment

```javascript
const { Configuration, Payment } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const payment = new Payment(conf);

```


#### Payment#getBrandPaymentGatewayConfig
Get All Brand Payment Gateway Config Secret

```kotlin
payment.getBrandPaymentGatewayConfig(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| application_id | string | Application id | 


Get All Brand Payment Gateway Config Secret


---


#### Payment#saveBrandPaymentGatewayConfig
Save Config Secret For Brand Payment Gateway

```kotlin
payment.saveBrandPaymentGatewayConfig(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| application_id | string | Application id | 


Save Config Secret For Brand Payment Gateway


---


#### Payment#updateBrandPaymentGatewayConfig
Save Config Secret For Brand Payment Gateway

```kotlin
payment.updateBrandPaymentGatewayConfig(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| application_id | string | Application id | 


Save Config Secret For Brand Payment Gateway


---


#### Payment#getPaymentModeRoutes
Get All Valid Payment Options

```kotlin
payment.getPaymentModeRoutes(companyId: companyId, applicationId: applicationId, refresh: refresh, requestType: requestType).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| application_id | string | Application id | 
| refresh | boolean |  | 
| request_type | string |  | 


Use this API to get Get All Valid Payment Options for making payment


---


#### Payment#getAllPayouts
Get All Payouts

```kotlin
payment.getAllPayouts(companyId: companyId, uniqueExternalId: uniqueExternalId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| unique_external_id | string | Fetch payouts using unique external id | 


Get All Payouts


---


#### Payment#savePayout
Save Payout

```kotlin
payment.savePayout(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 


Save Payout


---


#### Payment#updatePayout
Update Payout

```kotlin
payment.updatePayout(companyId: companyId, uniqueTransferNo: uniqueTransferNo, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| unique_transfer_no | string | Unique transfer id | 


Update Payout


---


#### Payment#activateAndDectivatePayout
Partial Update Payout

```kotlin
payment.activateAndDectivatePayout(companyId: companyId, uniqueTransferNo: uniqueTransferNo, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| unique_transfer_no | string | Unique transfer id | 


Partial Update Payout


---


#### Payment#deletePayout
Delete Payout

```kotlin
payment.deletePayout(companyId: companyId, uniqueTransferNo: uniqueTransferNo).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| unique_transfer_no | string | Unique transfer id | 


Delete Payout


---


#### Payment#getSubscriptionPaymentMethod
List Subscription Payment Method

```kotlin
payment.getSubscriptionPaymentMethod(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 


Get all  Subscription  Payment Method


---


#### Payment#deleteSubscriptionPaymentMethod
Delete Subscription Payment Method

```kotlin
payment.deleteSubscriptionPaymentMethod(companyId: companyId, uniqueExternalId: uniqueExternalId, paymentMethodId: paymentMethodId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| unique_external_id | string |  | 
| payment_method_id | string |  | 


Uses this api to Delete Subscription Payment Method


---


#### Payment#getSubscriptionConfig
List Subscription Config

```kotlin
payment.getSubscriptionConfig(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 


Get all  Subscription Config details


---


#### Payment#saveSubscriptionSetupIntent
Save Subscription Setup Intent

```kotlin
payment.saveSubscriptionSetupIntent(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 


Uses this api to Save Subscription Setup Intent


---



---
---


## Order

```javascript
const { Configuration, Order } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const order = new Order(conf);

```


#### Order#shipmentStatusUpdate
Update status of Shipment

```kotlin
order.shipmentStatusUpdate(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Update Shipment Status


---


#### Order#activityStatus
Get Activity Status

```kotlin
order.activityStatus(companyId: companyId, bagId: bagId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| bag_id | string | Bag Id | 


Get Activity Status


---


#### Order#storeProcessShipmentUpdate
Update Store Process-Shipment

```kotlin
order.storeProcessShipmentUpdate(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Update Store Process-Shipment


---


#### Order#getOrdersByCompanyId
Get Orders for company based on Company Id

```kotlin
order.getOrdersByCompanyId(companyId: companyId, pageNo: pageNo, pageSize: pageSize, fromDate: fromDate, toDate: toDate, q: q, stage: stage, salesChannels: salesChannels, orderId: orderId, stores: stores, status: status, shortenUrls: shortenUrls, filterType: filterType).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| page_no | string | Current page number | 
| page_size | string | Page limit | 
| from_date | string | From Date | 
| to_date | string | To Date | 
| q | string | Keyword for Search | 
| stage | string | Specefic Order Stage | 
| sales_channels | string | Selected Sales Channel | 
| order_id | string | Order Id | 
| stores | string | Selected Stores | 
| status | string | Status of order | 
| shorten_urls | boolean | Shorten URL option | 
| filter_type | string | Filters | 


Get Orders


---


#### Order#trackShipmentPlatform
Track Shipment by shipment id, for application based on application Id

```kotlin
order.trackShipmentPlatform(companyId: companyId, applicationId: applicationId, shipmentId: shipmentId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| shipment_id | string | Shipment Id | 


Shipment Track


---


#### Order#trackOrder
Track Order by order id, for application based on application Id

```kotlin
order.trackOrder(companyId: companyId, applicationId: applicationId, orderId: orderId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| order_id | string | Order Id | 


Order Track


---


#### Order#failedOrders
Get all failed orders application wise

```kotlin
order.failedOrders(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 


Failed Orders


---


#### Order#reprocessOrder
Reprocess order by order id

```kotlin
order.reprocessOrder(companyId: companyId, applicationId: applicationId, orderId: orderId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| order_id | string | Order Id | 


Order Reprocess


---


#### Order#getPing
Get Ping

```kotlin
order.getPing(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Get Ping


---


#### Order#voiceCallback
Get Voice Callback

```kotlin
order.voiceCallback(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Voice Callback


---


#### Order#voiceClickToCall
Get Voice Click to Call

```kotlin
order.voiceClickToCall(companyId: companyId, caller: caller, receiver: receiver).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| caller | string | Caller contact number | 
| receiver | string | Receiver contact number | 


Voice Click to Call


---



---
---


## Catalog

```javascript
const { Configuration, Catalog } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const catalog = new Catalog(conf);

```


#### Catalog#deleteSearchKeywords
Delete a Search Keywords

```kotlin
catalog.deleteSearchKeywords(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. | 


Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully


---


#### Catalog#updateSearchKeywords
Update Search Keyword

```kotlin
catalog.updateSearchKeywords(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. | 


Update Search Keyword by its id. On successful request, returns the updated collection


---


#### Catalog#getSearchKeywords
Get a Search Keywords Details

```kotlin
catalog.getSearchKeywords(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. | 


Get the details of a words by its `id`. If successful, returns a Collection resource in the response body specified in `GetSearchWordsDetailResponseSchema`


---


#### Catalog#createCustomKeyword
Add a Custom Search Keywords

```kotlin
catalog.createCustomKeyword(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Create a Custom Search Keywords. See `CreateSearchKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateSearchKeywordSchema`


---


#### Catalog#getAllSearchKeyword
List all Search Custom Keyword Listing

```kotlin
catalog.getAllSearchKeyword(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Custom Search Keyword allows you to map conditions with keywords to give you the ultimate results


---


#### Catalog#deleteAutocompleteKeyword
Delete a Autocomplete Keywords

```kotlin
catalog.deleteAutocompleteKeyword(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. | 


Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully


---


#### Catalog#updateAutocompleteKeyword
Create & Update Autocomplete Keyword

```kotlin
catalog.updateAutocompleteKeyword(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. | 


Update a mapping by it's id. On successful request, returns the updated Keyword mapping


---


#### Catalog#getAutocompleteKeywordDetail
Get a Autocomplete Keywords Details

```kotlin
catalog.getAutocompleteKeywordDetail(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. | 


Get the details of a words by its `id`. If successful, returns a keywords resource in the response body specified in `GetAutocompleteWordsResponseSchema`


---


#### Catalog#createCustomAutocompleteRule
Add a Custom Autocomplete Keywords

```kotlin
catalog.createCustomAutocompleteRule(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Create a Custom Autocomplete Keywords. See `CreateAutocompleteKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateAutocompleteKeywordSchema`


---


#### Catalog#getAutocompleteConfig
List all Autocomplete Keyword Listing

```kotlin
catalog.getAutocompleteConfig(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Custom Autocomplete Keyword allows you to map conditions with keywords to give you the ultimate results


---


#### Catalog#createProductBundle
Create Product Bundle

```kotlin
catalog.createProductBundle(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


Create Product Bundle. See `ProductBundleRequest` for the request body parameter need to create a product bundle. On successful request, returns in `ProductBundleRequest` with id


---


#### Catalog#getProductBundle
List all Product Bundles

```kotlin
catalog.getProductBundle(companyId: companyId, q: q).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| q | string | A search string that is searched with product bundle name. | 


Get all product bundles for a particular company


---


#### Catalog#updateProductBundle
Update a Product Bundle

```kotlin
catalog.updateProductBundle(companyId: companyId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. | 


Update a Product Bundle by its id. On successful request, returns the updated product bundle


---


#### Catalog#getProductBundleDetail
Get a particular Product Bundle details

```kotlin
catalog.getProductBundleDetail(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. | 


Get a particular Bundle details by its `id`. If successful, returns a Product bundle resource in the response body specified in `GetProductBundleResponse`


---


#### Catalog#createSizeGuide
Create a size guide.

```kotlin
catalog.createSizeGuide(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the size guide is to be created. | 


This API allows to create a size guide associated to a brand.


---


#### Catalog#getSizeGuides
Get list of size guides

```kotlin
catalog.getSizeGuides(companyId: companyId, active: active, q: q, tag: tag, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company for which the size guides are to be fetched. | 
| active | boolean | filter size guide on basis of active, in-active | 
| q | string | Query that is to be searched. | 
| tag | string | to filter size guide on basis of tag. | 
| page_no | integer | The page number to navigate through the given set of results | 
| page_size | integer | Number of items to retrieve in each page. Default is 10. | 


This API allows to view all the size guides associated to the seller.


---


#### Catalog#updateSizeGuide
Edit a size guide.

```kotlin
catalog.updateSizeGuide(companyId: companyId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company. | 
| id | string | Mongo id of the size guide to be edited | 


This API allows to edit a size guide.


---


#### Catalog#getSizeGuide
Get a single size guide.

```kotlin
catalog.getSizeGuide(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to size guide. | 
| id | string | Id of the size guide to be viewed. | 


This API helps to get data associated to a size guide.


---


#### Catalog#getCatalogConfiguration
Get configuration meta  details for catalog for admin panel

```kotlin
catalog.getCatalogConfiguration(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


configuration meta  details for catalog.


---


#### Catalog#createConfigurationProductListing
Add configuration for products & listings

```kotlin
catalog.createConfigurationProductListing(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Add configuration for products & listing.


---


#### Catalog#getConfigurations
Get configured details for catalog

```kotlin
catalog.getConfigurations(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


configured details for catalog.


---


#### Catalog#createConfigurationByType
Add configuration for categories and brands

```kotlin
catalog.createConfigurationByType(companyId: companyId, applicationId: applicationId, type: type, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| type | string | type can be brands, categories etc. | 


Add configuration for categories & brands.


---


#### Catalog#getConfigurationByType
Get configured details for catalog

```kotlin
catalog.getConfigurationByType(companyId: companyId, applicationId: applicationId, type: type).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| type | string | type can be brands, categories etc. | 


configured details for catalog.


---


#### Catalog#getQueryFilters
Get query filters to configure a collection

```kotlin
catalog.getQueryFilters(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Get query filters to configure a collection


---


#### Catalog#createCollection
Add a Collection

```kotlin
catalog.createCollection(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Create a collection. See `CreateCollectionRequestSchema` for the list of attributes needed to create a collection and collections/query-options for the available options to create a collection. On successful request, returns a paginated list of collections specified in `CollectionCreateResponse`


---


#### Catalog#getAllCollections
List all the collections

```kotlin
catalog.getAllCollections(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


A Collection allows you to organize your products into hierarchical groups. For example, a dress might be in the category _Clothing_, the individual product might also be in the collection _Summer_. On successful request, returns all the collections as specified in `CollectionListingSchema`


---


#### Catalog#getCollectionDetail
Get a particular collection

```kotlin
catalog.getCollectionDetail(companyId: companyId, applicationId: applicationId, slug: slug).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| slug | string | A `slug` is a human readable, URL friendly unique identifier of an object. Pass the `slug` of the collection which you want to retrieve. | 


Get the details of a collection by its `slug`. If successful, returns a Collection resource in the response body specified in `CollectionDetailResponse`


---


#### Catalog#deleteCollection
Delete a Collection

```kotlin
catalog.deleteCollection(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier of a collection. | 


Delete a collection by it's id. Returns an object that tells whether the collection was deleted successfully


---


#### Catalog#updateCollection
Update a collection

```kotlin
catalog.updateCollection(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier of a collection. | 


Update a collection by it's id. On successful request, returns the updated collection


---


#### Catalog#addCollectionItems
Add items to a collection

```kotlin
catalog.addCollectionItems(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier of a collection. | 


Adds items to a collection specified by its `id`. See `CollectionItemRequest` for the list of attributes needed to add items to an collection.


---


#### Catalog#getCollectionItems
Get the items for a collection

```kotlin
catalog.getCollectionItems(companyId: companyId, applicationId: applicationId, id: id, sortOn: sortOn, pageId: pageId, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier of a collection. | 
| sort_on | string | Each response will contain sort_on param, which should be sent back to make pagination work. | 
| page_id | string | Each response will contain next_id param, which should be sent back to make pagination work. | 
| page_size | integer | Number of items to retrieve in each page. Default is 12. | 


Get items from a collection specified by its `id`.


---


#### Catalog#getCatalogInsights
Analytics data of catalog and inventory.

```kotlin
catalog.getCatalogInsights(companyId: companyId, applicationId: applicationId, brand: brand).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| brand | string | Brand slug | 


Catalog Insights api returns the count of catalog related data like products, brands, departments and categories that have been made live as per configuration of the app.


---


#### Catalog#getSellerInsights
Analytics data of catalog and inventory that are being cross-selled.

```kotlin
catalog.getSellerInsights(companyId: companyId, sellerAppId: sellerAppId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| seller_app_id | string | Id of the seller application which is serving the invetory/catalog of the company | 


Analytics data of catalog and inventory that are being cross-selled.


---


#### Catalog#createMarketplaceOptin
Create/Update opt-in infomation.

```kotlin
catalog.createMarketplaceOptin(companyId: companyId, marketplace: marketplace, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | The company id for which the detail needs to be retrieved. | 
| marketplace | string | The marketplace for which the detail needs to be retrieved. | 


Use this API to create/update opt-in information for given platform. If successful, returns data in the response body as specified in `OptInPostResponseSchema`


---


#### Catalog#getMarketplaceOptinDetail
Get opt-in infomation.

```kotlin
catalog.getMarketplaceOptinDetail(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer |  | 


Use this API to fetch opt-in information for all the platforms. If successful, returns a logs in the response body as specified in `GetOptInPlatformSchema`


---


#### Catalog#getCompanyDetail
Get the Company details.

```kotlin
catalog.getCompanyDetail(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | The company id for which the detail needs to be retrieved. | 


Get the details of the company associated with the given company_id passed.


---


#### Catalog#getCompanyBrandDetail
Get the Company Brand details of Optin.

```kotlin
catalog.getCompanyBrandDetail(companyId: companyId, isActive: isActive, q: q, pageNo: pageNo, pageSize: pageSize, marketplace: marketplace).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | The company id for which the detail needs to be retrieved. | 
| is_active | boolean | The is_active status for the optin id. | 
| q | boolean | The search value to filter the list. | 
| page_no | integer | The number of page for the company id. | 
| page_size | integer | Number of records that can be seen on the page for the company id. | 
| marketplace | string | The marketplace platform associated with the company id. | 


Get the details of the Brands associated with the given company_id passed.


---


#### Catalog#getCompanyMetrics
Get the Company metrics

```kotlin
catalog.getCompanyMetrics(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | The company id for which the detail needs to be retrieved. | 


Get the Company metrics associated with the company ID passed.


---


#### Catalog#getStoreDetail
Get the Store details.

```kotlin
catalog.getStoreDetail(companyId: companyId, q: q, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | The company id for which the detail needs to be retrieved. | 
| q | string | The search related the store for the company id. | 
| page_no | integer | The number of page for the company id. | 
| page_size | integer | Number of records that can be seen on the page for the company id. | 


Get the details of the store associated with the company ID passed.


---


#### Catalog#listProductTemplateCategories
List Department specifiec product categories

```kotlin
catalog.listProductTemplateCategories(companyId: companyId, departments: departments, itemType: itemType).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| departments | string | A `department` is name of a departments whose category needs to be listed. Can specify multiple departments. | 
| item_type | string | An `item_type` is the type of item, it can be `set`, `standard`, `digital`, etc. | 


Allows you to list all product categories values for the departments specified


---


#### Catalog#listDepartmentsData
List all Departments

```kotlin
catalog.listDepartmentsData(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


Allows you to list all departments, also can search using name and filter active and incative departments, and item type


---


#### Catalog#getDepartmentData
Get specific departments details by passing in unique id of the department

```kotlin
catalog.getDepartmentData(companyId: companyId, uid: uid).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| uid | string | A `uid` is a unique identifier of a department. | 


Allows you to get department data, by uid


---


#### Catalog#listProductTemplate
List all Templates

```kotlin
catalog.listProductTemplate(companyId: companyId, departments: departments).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| departments | string | A `departments` is the name of a particular department. | 


Allows you to list all product templates, also can filter by department


---


#### Catalog#validateProductTemplate
Validate Product Template Schema

```kotlin
catalog.validateProductTemplate(companyId: companyId, slug: slug).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| slug | string | A `slug` is a unique identifier for a particular template. | 


Allows you to list all product templates validation values for all the fields present in the database


---


#### Catalog#downloadProductTemplateViews
Download Product Template View

```kotlin
catalog.downloadProductTemplateViews(companyId: companyId, slug: slug).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| slug | string | A `slug` is a unique identifier for a particular template. | 


Allows you to download product template data


---


#### Catalog#downloadProductTemplateView
Download Product Template View

```kotlin
catalog.downloadProductTemplateView(companyId: companyId, itemType: itemType).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| item_type | string | An `item_type` defines the type of item. | 


Allows you to download product template data


---


#### Catalog#validateProductTemplateSchema
Validate Product Template Schema

```kotlin
catalog.validateProductTemplateSchema(companyId: companyId, itemType: itemType).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| item_type | string | An `item_type` defines the type of item. The default value is standard. | 


Allows you to list all product templates validation values for all the fields present in the database


---


#### Catalog#listHSNCodes
List HSN Codes

```kotlin
catalog.listHSNCodes(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


Allows you to list all hsn Codes


---


#### Catalog#listProductTemplateExportDetails
Allows you to list all product templates export list details

```kotlin
catalog.listProductTemplateExportDetails(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


Can vies details including trigger data, task id , etc.


---


#### Catalog#listTemplateBrandTypeValues
Allows you to list all values for Templates, Brands or Type

```kotlin
catalog.listTemplateBrandTypeValues(companyId: companyId, filter: filter).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| filter | string | A `filter` is the unique identifier of the type of value required. | 


The filter type query parameter defines what type of data to return. The type of query returns the valid values for the same


---


#### Catalog#createCategories
Create product categories

```kotlin
catalog.createCategories(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


This API lets user create product categories


---


#### Catalog#listCategories
Get product categories list

```kotlin
catalog.listCategories(companyId: companyId, level: level, q: q).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| level | string | Get category for multiple levels | 
| q | string | Get multiple categories filtered by search string | 


This API gets meta associated to product categories.


---


#### Catalog#updateCategory
Update product categories

```kotlin
catalog.updateCategory(companyId: companyId, uid: uid, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| uid | string | Category unique id | 


Update a product category using this apu


---


#### Catalog#getCategoryData
Get product category by uid

```kotlin
catalog.getCategoryData(companyId: companyId, uid: uid).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| uid | string | Category unique id | 


This API gets meta associated to product categories.


---


#### Catalog#createProduct
Create a product.

```kotlin
catalog.createProduct(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to product that is to be viewed. | 


This API allows to create product.


---


#### Catalog#getProducts
Get product list

```kotlin
catalog.getProducts(companyId: companyId, brandIds: brandIds, categoryIds: categoryIds, search: search, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | number | Get list of products filtered by company Id | 
| brand_ids | number | Get multiple products filtered by brand Ids | 
| category_ids | number | Get multiple products filtered by category Ids | 
| search | string | Get multiple products filtered by search string | 
| page_no | integer | The page number to navigate through the given set of results | 
| page_size | integer | Number of items to retrieve in each page. Default is 10. | 


This API gets meta associated to products.


---


#### Catalog#deleteProduct
Delete a product.

```kotlin
catalog.deleteProduct(companyId: companyId, itemId: itemId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id of the company associated to product that is to be deleted. | 
| item_id | integer | Id of the product to be updated. | 


This API allows to delete product.


---


#### Catalog#editProduct
Edit a product.

```kotlin
catalog.editProduct(companyId: companyId, itemId: itemId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to product that is to be viewed. | 
| item_id | integer | Id of the product to be updated. | 


This API allows to edit product.


---


#### Catalog#getProduct
Get a single product.

```kotlin
catalog.getProduct(itemCode: itemCode, companyId: companyId, itemId: itemId, brandUid: brandUid, uid: uid).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| item_code | string | Item code of the product. | 
| company_id | integer | Company Id of the product. | 
| item_id | integer | Item Id of the product. | 
| brand_uid | integer | Brand Id of the product. | 
| uid | integer | Id of the product. | 


This API helps to get data associated to a particular product.


---


#### Catalog#getProductValidation
Validate product/size data

```kotlin
catalog.getProductValidation(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | number | Validates data against given company | 


This API validates product data.


---


#### Catalog#getProductSize
Get a single product size.

```kotlin
catalog.getProductSize(itemCode: itemCode, companyId: companyId, itemId: itemId, brandUid: brandUid, uid: uid).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| item_code | string | Item code of the product size. | 
| company_id | integer | Company Id of the product size. | 
| item_id | integer | Item Id of the product size. | 
| brand_uid | integer | Brand Id of the product size. | 
| uid | integer | Id of the product size. | 


This API helps to get data associated to a particular product size.


---


#### Catalog#updateProductAssetsInBulk
Create a Bulk asset upload Job.

```kotlin
catalog.updateProductAssetsInBulk(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which assets to be uploaded. | 


This API helps to create a bulk asset upload job.


---


#### Catalog#getProductBulkUploadHistory
Get a list of all bulk product upload jobs.

```kotlin
catalog.getProductBulkUploadHistory(companyId: companyId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id of of which Product Bulk Upload History to be obtained. | 
| page_no | integer | The page number to navigate through the given set of results | 
| page_size | integer | Number of items to retrieve in each page. Default is 12. | 


This API helps to get bulk product upload jobs data.


---


#### Catalog#createProductsInBulk
Create products in bulk associated with given batch Id.

```kotlin
catalog.createProductsInBulk(companyId: companyId, batchId: batchId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which assets to be uploaded. | 
| batch_id | string | Batch Id in which assets to be uploaded. | 


This API helps to create products in bulk push to kafka for approval/creation.


---


#### Catalog#deleteProductBulkJob
Delete Bulk product job.

```kotlin
catalog.deleteProductBulkJob(companyId: companyId, batchId: batchId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id of the company associated to size that is to be deleted. | 
| batch_id | integer | Batch Id of the bulk product job to be deleted. | 


This API allows to delete bulk product job associated with company.


---


#### Catalog#getCompanyTags
Get a list of all tags associated with company.

```kotlin
catalog.getCompanyTags(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id of the product size. | 


This API helps to get tags data associated to a particular copmpany.


---


#### Catalog#createProductAssetsInBulk
Create a Bulk asset upload Job.

```kotlin
catalog.createProductAssetsInBulk(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which assets to be uploaded. | 


This API helps to create a bulk asset upload job.


---


#### Catalog#getProductAssetsInBulk
Get a list of all bulk asset jobs.

```kotlin
catalog.getProductAssetsInBulk(companyId: companyId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id of the product size. | 
| page_no | integer | The page number to navigate through the given set of results | 
| page_size | integer | Number of items to retrieve in each page. Default is 12. | 


This API helps to get bulk asset jobs data associated to a particular company.


---


#### Catalog#deleteSize
Delete a Size associated with product.

```kotlin
catalog.deleteSize(companyId: companyId, itemId: itemId, size: size).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id of the company associated to size that is to be deleted. | 
| item_id | integer | Item Id of the product associated with size to be deleted. | 
| size | integer | size to be deleted. | 


This API allows to delete size associated with product.


---


#### Catalog#addInventory
Add Inventory for particular size and store.

```kotlin
catalog.addInventory(companyId: companyId, itemId: itemId, size: size, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to product that is to be viewed. | 
| item_id | number | Item of the company associated to product that is to be viewed. | 
| size | string | Size in which inventory is to be added. | 


This API allows add Inventory for particular size and store.


---


#### Catalog#getInventory
Get Inventory for company

```kotlin
catalog.getInventory(companyId: companyId, itemId: itemId, size: size, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to product that is to be viewed. | 
| item_id | string | Item code of the product of which size is to be get. | 
| size | string | Size of which inventory is to get. | 
| page_no | integer | The page number to navigate through the given set of results | 
| page_size | integer | Number of items to retrieve in each page. Default is 12. | 


This API allows get Inventory data for particular company grouped by size and store.


---


#### Catalog#deleteInventory
Delete a Inventory.

```kotlin
catalog.deleteInventory(companyId: companyId, itemId: itemId, locationId: locationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id of the company associated with Inventory that is to be deleted. | 
| item_id | integer | Id of the product associated with Inventory to be deleted. | 
| location_id | number | Location ID of store of which inventory is to be deleted. | 


This API allows to delete inventory of a particular product for particular company.


---


#### Catalog#createBulkInventoryJob
Create a Bulk Inventory upload Job.

```kotlin
catalog.createBulkInventoryJob(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which Inventory to be uploaded. | 


This API helps to create a bulk Inventory upload job.


---


#### Catalog#getInventoryBulkUploadHistory
Get a list of all bulk Inventory upload jobs.

```kotlin
catalog.getInventoryBulkUploadHistory(companyId: companyId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id of of which Inventory Bulk Upload History to be obtained. | 
| page_no | integer | The page number to navigate through the given set of results | 
| page_size | integer | Number of items to retrieve in each page. Default is 12. | 


This API helps to get bulk Inventory upload jobs data.


---


#### Catalog#createBulkInventory
Create products in bulk associated with given batch Id.

```kotlin
catalog.createBulkInventory(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which Inventory is to be uploaded. | 


This API helps to create products in bulk push to kafka for approval/creation.


---


#### Catalog#deleteBulkInventoryJob
Delete Bulk Inventory job.

```kotlin
catalog.deleteBulkInventoryJob(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id of the company of which bulk Inventory job is to be deleted. | 


This API allows to delete bulk Inventory job associated with company.


---


#### Catalog#createInventoryExportJob
Create a Inventory export Job.

```kotlin
catalog.createInventoryExportJob(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which assets to be uploaded. | 


This API helps to create a Inventory export job.


---


#### Catalog#getInventoryExport
Get Inventory export history.

```kotlin
catalog.getInventoryExport(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which assets to be uploaded. | 


This API helps to get Inventory export history.


---


#### Catalog#exportInventoryConfig
Get List of different filters for inventory export

```kotlin
catalog.exportInventoryConfig(companyId: companyId, filterType: filterType).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to product that is to be viewed. | 
| filter_type | string | filter type from any one of ['brand', 'store', 'type'] | 


This API allows get List of different filters like brand, store, and type for inventory export.


---


#### Catalog#createHsnCode
Create Hsn Code.

```kotlin
catalog.createHsnCode(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 


Create Hsn Code.


---


#### Catalog#getAllHsnCodes
Hsn Code List.

```kotlin
catalog.getAllHsnCodes(companyId: companyId, pageNo: pageNo, pageSize: pageSize, q: q).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| page_no | integer | page no | 
| page_size | integer | page size | 
| q | string | search using hsn code. | 


Hsn Code List.


---


#### Catalog#updateHsnCode
Update Hsn Code.

```kotlin
catalog.updateHsnCode(companyId: companyId, uid: uid, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| uid | integer | uid | 


Update Hsn Code.


---


#### Catalog#getHsnCode
Fetch Hsn Code.

```kotlin
catalog.getHsnCode(companyId: companyId, uid: uid).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| uid | integer | uid | 


Fetch Hsn Code.


---


#### Catalog#bulkHsnCode
Bulk Create or Update Hsn Code.

```kotlin
catalog.bulkHsnCode(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 


Bulk Create or Update Hsn Code.


---



---
---


## CompanyProfile

```javascript
const { Configuration, CompanyProfile } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const companyprofile = new CompanyProfile(conf);

```


#### CompanyProfile#updateCompany
Edit company profile

```kotlin
companyprofile.updateCompany(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


This API allows to edit the company profile of the seller account.


---


#### CompanyProfile#cbsOnboardGet
Get company profile

```kotlin
companyprofile.cbsOnboardGet(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


This API allows to view the company profile of the seller account.


---


#### CompanyProfile#getCompanyMetrics
Get company metrics

```kotlin
companyprofile.getCompanyMetrics(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


This API allows to view the company metrics, i.e. the status of its brand and stores. Also its allows to view the number of products, company documents & store documents which are verified and unverified.


---


#### CompanyProfile#editBrand
Edit a brand.

```kotlin
companyprofile.editBrand(companyId: companyId, brandId: brandId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to brand that is to be viewed. | 
| brand_id | string | Id of the brand to be viewed. | 


This API allows to edit meta of a brand.


---


#### CompanyProfile#getBrand
Get a single brand.

```kotlin
companyprofile.getBrand(companyId: companyId, brandId: brandId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to brand that is to be viewed. | 
| brand_id | string | Id of the brand to be viewed. | 


This API helps to get data associated to a particular brand.


---


#### CompanyProfile#createBrand
Create a Brand.

```kotlin
companyprofile.createBrand(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company. | 


This API allows to create a brand associated to a company.


---


#### CompanyProfile#getBrands
Get brands associated to a company

```kotlin
companyprofile.getBrands(companyId: companyId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company. | 
| page_no | integer | The page number to navigate through the given set of results | 
| page_size | integer | Number of items to retrieve in each page. Default is 10. | 


This API helps to get view brands associated to a particular company.


---


#### CompanyProfile#createCompanyBrandMapping
Create a company brand mapping.

```kotlin
companyprofile.createCompanyBrandMapping(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the brand is to be mapped. | 


This API allows to create a company brand mapping, for a already existing brand in the system.


---


#### CompanyProfile#getLocations
Get list of locations

```kotlin
companyprofile.getLocations(companyId: companyId, storeType: storeType, q: q, stage: stage, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company whose locations are to fetched | 
| store_type | string | Helps to sort the location list on the basis of location type. | 
| q | string | Query that is to be searched. | 
| stage | string | to filter companies on basis of verified or unverified companies. | 
| page_no | integer | The page number to navigate through the given set of results | 
| page_size | integer | Number of items to retrieve in each page. Default is 10. | 


This API allows to view all the locations asscoiated to a company.


---


#### CompanyProfile#createLocation
Create a location asscoiated to a company.

```kotlin
companyprofile.createLocation(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the location is to be created. | 


This API allows to create a location associated to a company.


---


#### CompanyProfile#updateLocation
Edit a location asscoiated to a company.

```kotlin
companyprofile.updateLocation(companyId: companyId, locationId: locationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the location is to be created. | 
| location_id | string | Id of the location which you want to edit. | 


This API allows to edit a location associated to a company.


---


#### CompanyProfile#getLocationDetail
Get details of a specific location.

```kotlin
companyprofile.getLocationDetail(companyId: companyId, locationId: locationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the location lies. | 
| location_id | string | Id of the location which you want to view. | 


This API helps to get data associated to a specific location.


---



---
---


## FileStorage

```javascript
const { Configuration, FileStorage } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const filestorage = new FileStorage(conf);

```


#### FileStorage#startUpload
This operation initiates upload and returns storage link which is valid for 30 Minutes. You can use that storage link to make subsequent upload request with file buffer or blob.

```kotlin
filestorage.startUpload(namespace: namespace, companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| namespace | string | bucket name | 
| company_id | integer | company_id | 


Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `startUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `startUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `completeUpload` api to complete the upload process.
This operation will return the url for the uploaded file.



---


#### FileStorage#completeUpload
This will complete the upload process. After successfully uploading file, you can call this operation to complete the upload process.

```kotlin
filestorage.completeUpload(namespace: namespace, companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| namespace | string | bucket name | 
| company_id | integer | company_id | 


Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `startUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `startUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `completeUpload` api to complete the upload process.
This operation will return the url for the uploaded file.



---


#### FileStorage#appStartUpload
This operation initiates upload and returns storage link which is valid for 30 Minutes. You can use that storage link to make subsequent upload request with file buffer or blob.

```kotlin
filestorage.appStartUpload(namespace: namespace, companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| namespace | string | bucket name | 
| company_id | integer | company_id | 
| application_id | string | application id | 


Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `appStartUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `appStartUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `appCompleteUpload` api to complete the upload process.
This operation will return the url for the uploaded file.



---


#### FileStorage#appCompleteUpload
This will complete the upload process. After successfully uploading file, you can call this operation to complete the upload process.

```kotlin
filestorage.appCompleteUpload(namespace: namespace, companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| namespace | string | bucket name | 
| company_id | integer | company_id | 
| application_id | string | application id | 


Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `appStartUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `appStartUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `appCompleteUpload` api to complete the upload process.
This operation will return the url for the uploaded file.



---


#### FileStorage#getSignUrls
Explain here

```kotlin
filestorage.getSignUrls(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | company_id | 


Describe here


---


#### FileStorage#copyFiles
Copy Files

```kotlin
filestorage.copyFiles(sync: sync, companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| sync | boolean | sync | 
| company_id | integer | company_id | 


Copy Files


---


#### FileStorage#appCopyFiles
Copy Files

```kotlin
filestorage.appCopyFiles(sync: sync, companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| sync | boolean | sync | 
| company_id | integer | company_id | 
| application_id | integer | application_id | 


Copy Files


---


#### FileStorage#browse
Browse Files

```kotlin
filestorage.browse(namespace: namespace, companyId: companyId, pageNo: pageNo).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| namespace | string | bucket name | 
| company_id | integer | company_id | 
| page_no | integer | page no | 


Browse Files


---


#### FileStorage#appBrowse
Browse Files

```kotlin
filestorage.appBrowse(namespace: namespace, companyId: companyId, applicationId: applicationId, pageNo: pageNo).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| namespace | string | bucket name | 
| company_id | integer | company_id | 
| application_id | integer | application_id | 
| page_no | integer | page no | 


Browse Files


---


#### FileStorage#proxy
Proxy

```kotlin
filestorage.proxy(companyId: companyId, url: url).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | company_id | 
| url | string | url | 


Proxy


---



---
---


## Share

```javascript
const { Configuration, Share } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const share = new Share(conf);

```


#### Share#createShortLink
Create short link

```kotlin
share.createShortLink(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 


Create short link


---


#### Share#getShortLinks
Get short links

```kotlin
share.getShortLinks(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, createdBy: createdBy, active: active, q: q).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| page_no | integer | Current page number | 
| page_size | integer | Current page size | 
| created_by | string | Short link creator | 
| active | string | Short link active status | 
| q | string | Search text for original and short url | 


Get short links


---


#### Share#getShortLinkByHash
Get short link by hash

```kotlin
share.getShortLinkByHash(companyId: companyId, applicationId: applicationId, hash: hash).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| hash | string | Hash of short url | 


Get short link by hash


---


#### Share#updateShortLinkById
Update short link by id

```kotlin
share.updateShortLinkById(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| id | string | Short link document identifier | 


Update short link by id


---



---
---


## Inventory

```javascript
const { Configuration, Inventory } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const inventory = new Inventory(conf);

```


#### Inventory#getJobsByCompany
Get Job Configs For A Company

```kotlin
inventory.getJobsByCompany(companyId: companyId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| page_no | integer | Page Number | 
| page_size | integer | Page Size | 


REST Endpoint that returns all job configs for a company


---


#### Inventory#updateJob
Updates An Existing Job Config

```kotlin
inventory.updateJob(companyId: companyId, xUserData: xUserData, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| x-user-data | string |  | 


REST Endpoint that updates a job config


---


#### Inventory#createJob
Creates A New Job Config

```kotlin
inventory.createJob(companyId: companyId, xUserData: xUserData, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| x-user-data | string |  | 


REST Endpoint that creates a new job config


---


#### Inventory#getJobByCompanyAndIntegration
Get Job Configs By Company And Integration

```kotlin
inventory.getJobByCompanyAndIntegration(companyId: companyId, integrationId: integrationId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| integration_id | string | Integration Id | 
| page_no | integer | Page Number | 
| page_size | integer | Page Size | 


REST Endpoint that returns all job configs by company And integration


---


#### Inventory#getJobConfigDefaults
Get Job Configs Defaults

```kotlin
inventory.getJobConfigDefaults(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 


REST Endpoint that returns default fields job configs by company And integration


---


#### Inventory#getJobByCode
Get Job Config By Code

```kotlin
inventory.getJobByCode(companyId: companyId, code: code).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| code | string | Job Code | 


REST Endpoint that returns job config by code


---


#### Inventory#getJobCodesByCompanyAndIntegration
Get Job Codes By Company And Integration

```kotlin
inventory.getJobCodesByCompanyAndIntegration(companyId: companyId, integrationId: integrationId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| integration_id | string | Integration Id | 
| page_no | integer | Page Number | 
| page_size | integer | Page Size | 


REST Endpoint that returns all job codes by company And integration


---



---
---


## Configuration

```javascript
const { Configuration, Configuration } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const configuration = new Configuration(conf);

```


#### Configuration#getBuildConfig
Get latest build config

```kotlin
configuration.getBuildConfig(companyId: companyId, applicationId: applicationId, platformType: platformType).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 
| platform_type | string | Current platform name | 


Get latest build config


---


#### Configuration#updateBuildConfig
Update build config for next build

```kotlin
configuration.updateBuildConfig(companyId: companyId, applicationId: applicationId, platformType: platformType, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 
| platform_type | string | Current platform name | 


Update build config for next build


---


#### Configuration#getPreviousVersions
Get previous versions

```kotlin
configuration.getPreviousVersions(companyId: companyId, applicationId: applicationId, platformType: platformType).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 
| platform_type | string | Current platform name | 


Get previous versions


---


#### Configuration#getAppFeatures
Get features of application

```kotlin
configuration.getAppFeatures(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get features of application


---


#### Configuration#updateAppFeatures
Update features of application

```kotlin
configuration.updateAppFeatures(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Update features of application


---


#### Configuration#getAppBasicDetails
Get basic application details

```kotlin
configuration.getAppBasicDetails(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get basic application details like name


---


#### Configuration#updateAppBasicDetails
Add or update application's basic details

```kotlin
configuration.updateAppBasicDetails(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Add or update application's basic details


---


#### Configuration#getAppContactInfo
Get application information

```kotlin
configuration.getAppContactInfo(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get Application Current Information. This includes information about social links, address and contact information of company/seller/brand of the application.


---


#### Configuration#updateAppContactInfo
Get application information

```kotlin
configuration.updateAppContactInfo(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Save Application Current Information. This includes information about social links, address and contact information of an application.


---


#### Configuration#getAppApiTokens
Get social tokens

```kotlin
configuration.getAppApiTokens(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get social tokens.


---


#### Configuration#updateAppApiTokens
Add social tokens

```kotlin
configuration.updateAppApiTokens(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Add social tokens.


---


#### Configuration#getAppCompanies
Application inventory enabled companies

```kotlin
configuration.getAppCompanies(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 


Application inventory enabled companies.


---


#### Configuration#getAppStores
Application inventory enabled stores

```kotlin
configuration.getAppStores(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 


Application inventory enabled stores.


---


#### Configuration#getInventoryConfig
Get application configuration

```kotlin
configuration.getInventoryConfig(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get application configuration for various features and data


---


#### Configuration#updateInventoryConfig
Update application configuration

```kotlin
configuration.updateInventoryConfig(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Update application configuration for various features and data


---


#### Configuration#partiallyUpdateInventoryConfig
Partially update application configuration

```kotlin
configuration.partiallyUpdateInventoryConfig(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Partially update application configuration for various features and data


---


#### Configuration#getAppCurrencyConfig
Get application enabled currency list

```kotlin
configuration.getAppCurrencyConfig(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get application enabled currency list


---


#### Configuration#updateAppCurrencyConfig
Add initial application supported currency

```kotlin
configuration.updateAppCurrencyConfig(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Add initial application supported currency for various features and data. Default INR will be enabled.


---


#### Configuration#getOrderingStoresByFilter
Get ordering store by filter

```kotlin
configuration.getOrderingStoresByFilter(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 


Get ordering store by filter


---


#### Configuration#updateOrderingStoreConfig
Add/Update ordering store config

```kotlin
configuration.updateOrderingStoreConfig(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Add/Update ordering store config.


---


#### Configuration#getDomains
Get attached domain list

```kotlin
configuration.getDomains(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get attached domain list.


---


#### Configuration#addDomain
Add new domain to application

```kotlin
configuration.addDomain(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Add new domain to application.


---


#### Configuration#removeDomainById
Remove attached domain

```kotlin
configuration.removeDomainById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 
| id | string | Domain _id | 


Remove attached domain.


---


#### Configuration#changeDomainType
Change domain type

```kotlin
configuration.changeDomainType(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Change a domain to Primary or Shortlink domain


---


#### Configuration#getDomainStatus
Get domain connected status.

```kotlin
configuration.getDomainStatus(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get domain connected status. Check if domain is live and mapped to appropriate IP to fynd servers.


---


#### Configuration#createApplication
Create application

```kotlin
configuration.createApplication(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 


Create new application


---


#### Configuration#getApplications
Get list of application under company

```kotlin
configuration.getApplications(companyId: companyId, pageNo: pageNo, pageSize: pageSize, q: q).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| page_no | integer |  | 
| page_size | integer |  | 
| q | string | Url encoded object used as mongodb query | 


Get list of application under company


---


#### Configuration#getApplicationById
Get application data from id

```kotlin
configuration.getApplicationById(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get application data from id


---


#### Configuration#getCurrencies
Get all currencies

```kotlin
configuration.getCurrencies(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 


Get all currencies


---


#### Configuration#getDomainAvailibility
Check domain availibility before linking to application

```kotlin
configuration.getDomainAvailibility(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 


Check domain availibility before linking to application. Also sends domain suggestions with similar to queried domain. \ Custom domain search is currently powered by GoDaddy provider.


---


#### Configuration#getIntegrationById
Get integration data

```kotlin
configuration.getIntegrationById(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| id | integer | Integration id | 


Get integration data


---


#### Configuration#getAvailableOptIns
Get all available integration opt-ins

```kotlin
configuration.getAvailableOptIns(companyId: companyId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 


Get all available integration opt-ins


---


#### Configuration#getSelectedOptIns
Get company/store level integration opt-ins

```kotlin
configuration.getSelectedOptIns(companyId: companyId, level: level, uid: uid, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| level | string | Integration level | 
| uid | integer | Integration level uid | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 


Get company/store level integration opt-ins


---


#### Configuration#getIntegrationLevelConfig
Get integration level config

```kotlin
configuration.getIntegrationLevelConfig(companyId: companyId, id: id, level: level, opted: opted, checkPermission: checkPermission).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| id | string | Integration id | 
| level | string | Integration level | 
| opted | boolean | Filter on opted stores | 
| check_permission | boolean | Filter on if permissions are present | 


Get integration level config


---


#### Configuration#getIntegrationByLevelId
Get level data for integration

```kotlin
configuration.getIntegrationByLevelId(companyId: companyId, id: id, level: level, uid: uid).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| id | string | Integration id | 
| level | string | Integration level | 
| uid | integer | Integration level uid | 


Get level data for integration


---


#### Configuration#getLevelActiveIntegrations
Check store has active integration

```kotlin
configuration.getLevelActiveIntegrations(companyId: companyId, id: id, level: level, uid: uid).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| id | string | Integration id | 
| level | string | Integration level | 
| uid | integer | Integration level uid | 


API checks if a store is already opted in any other integrations


---


#### Configuration#getBrandsByCompany
Get brands by company

```kotlin
configuration.getBrandsByCompany(companyId: companyId, q: q).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| q | string | Search text for brand name | 


Get brands by company


---


#### Configuration#getCompanyByBrands
Get company by brand uids

```kotlin
configuration.getCompanyByBrands(companyId: companyId, pageNo: pageNo, pageSize: pageSize, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 


Get company by brand uids


---


#### Configuration#getStoreByBrands
Get stores by brand uids

```kotlin
configuration.getStoreByBrands(companyId: companyId, pageNo: pageNo, pageSize: pageSize, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 


Get stores by brand uids


---


#### Configuration#getOtherSellerApplications
Get other seller applications

```kotlin
configuration.getOtherSellerApplications(companyId: companyId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| page_no | integer | Current page no | 
| page_size | integer | Current request items count | 


Get other seller applications who has opted current company as inventory


---


#### Configuration#getOtherSellerApplicationById
Get other seller applications

```kotlin
configuration.getOtherSellerApplicationById(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| id | string | Application Id | 


Get other seller application


---


#### Configuration#optOutFromApplication
Opt out company or store from other seller application

```kotlin
configuration.optOutFromApplication(companyId: companyId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| id | string | Application Id | 


Opt out company or store from other seller application


---



---
---


## Cart

```javascript
const { Configuration, Cart } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const cart = new Cart(conf);

```


#### Cart#getCoupons
Get with single coupon details or coupon list

```kotlin
cart.getCoupons(companyId: companyId, applicationId: applicationId, pageNo: pageNo, pageSize: pageSize, isArchived: isArchived, title: title, isPublic: isPublic, isDisplay: isDisplay, typeSlug: typeSlug, code: code).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current Application _id | 
| page_no | integer |  | 
| page_size | integer |  | 
| is_archived | boolean |  | 
| title | string |  | 
| is_public | boolean |  | 
| is_display | boolean |  | 
| type_slug | string |  | 
| code | string |  | 


Get coupon list with pagination


---


#### Cart#createCoupon
Create new coupon

```kotlin
cart.createCoupon(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current Application _id | 


Create new coupon


---


#### Cart#getCouponById
Get with single coupon details or coupon list

```kotlin
cart.getCouponById(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current Application _id | 
| id | string |  | 


Get single coupon details with `id` in path param


---


#### Cart#updateCoupon
Update existing coupon configuration

```kotlin
cart.updateCoupon(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current Application _id | 
| id | string |  | 


Update coupon with id sent in `id`


---


#### Cart#updateCouponPartially
Update coupon archive state and schedule

```kotlin
cart.updateCouponPartially(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current Application _id | 
| id | string |  | 


Update archive/unarchive and change schedule for coupon


---



---
---


## Marketplaces

```javascript
const { Configuration, Marketplaces } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const marketplaces = new Marketplaces(conf);

```


#### Marketplaces#getAvailableChannels
Get available marketplace channels

```kotlin
marketplaces.getAvailableChannels(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Get available marketplace channels


---


#### Marketplaces#getChannels
Get all registered marketplace channels for a seller

```kotlin
marketplaces.getChannels(companyId: companyId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Get all registered marketplace channels for a seller


---


#### Marketplaces#getChannel
Get registered marketplace channel credential configuration for a seller

```kotlin
marketplaces.getChannel(companyId: companyId, channel: channel).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 


Get registered marketplace channel credentials configuration for a seller


---


#### Marketplaces#registerMyntraChannel
Create Myntra marketplace channel for a seller

```kotlin
marketplaces.registerMyntraChannel(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Create Myntra marketplace channel for a seller


---


#### Marketplaces#updateMyntraChannelCredentials
Update Myntra marketplace channel credentials for a seller

```kotlin
marketplaces.updateMyntraChannelCredentials(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Update Myntra marketplace channel credentials for a seller


---


#### Marketplaces#registerAmazonChannel
Create Amazon marketplace channel for a seller

```kotlin
marketplaces.registerAmazonChannel(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Create Amazon marketplace channel for a seller


---


#### Marketplaces#updateAmazonChannelCredentials
Update Amazon marketplace channel credentials for a seller

```kotlin
marketplaces.updateAmazonChannelCredentials(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Update Amazon marketplace channel credentials for a seller


---


#### Marketplaces#registerFlipkartChannel
Create Flipkart / Flipkart Assured marketplace channel for a seller

```kotlin
marketplaces.registerFlipkartChannel(companyId: companyId, flipkartChannel: flipkartChannel, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| flipkart_channel | string | Name of marketplace channel | 


Create Flipkart / Flipkart Assured marketplace channel for a seller


---


#### Marketplaces#updateFlipkartChannelCredentials
Update Flipkart / Flipkart Assured marketplace channel credentials for a seller

```kotlin
marketplaces.updateFlipkartChannelCredentials(companyId: companyId, flipkartChannel: flipkartChannel, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| flipkart_channel | string | Name of marketplace channel | 


Update Flipkart / Flipkart Assured marketplace channel credentials for a seller


---


#### Marketplaces#registerTatacliqChannel
Create Tatacliq / Tatacliq Luxury marketplace channel for a seller

```kotlin
marketplaces.registerTatacliqChannel(companyId: companyId, tatacliqChannel: tatacliqChannel, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| tatacliq_channel | string | Name of marketplace channel | 


Create Tatacliq / Tatacliq Luxury marketplace channel for a seller


---


#### Marketplaces#updateTatacliqChannelCredentials
Update Tatacliq / Tatacliq Luxury Assured marketplace channel credentials for a seller

```kotlin
marketplaces.updateTatacliqChannelCredentials(companyId: companyId, tatacliqChannel: tatacliqChannel, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| tatacliq_channel | string | Name of marketplace channel | 


Update Tatacliq / Tatacliq Luxury marketplace channel credentials for a seller


---


#### Marketplaces#registerAjioChannel
Create Ajio marketplace channel for a seller

```kotlin
marketplaces.registerAjioChannel(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Create Ajio marketplace channel for a seller


---


#### Marketplaces#updateAjioChannelCredentials
Update Ajio marketplace channel credentials for a seller

```kotlin
marketplaces.updateAjioChannelCredentials(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Update Ajio marketplace channel credentials for a seller


---


#### Marketplaces#updateChannelInventorySyncConfig
Update inventory sync configuration of marketplace channel for a seller

```kotlin
marketplaces.updateChannelInventorySyncConfig(companyId: companyId, channel: channel, validateCred: validateCred, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 
| validate_cred | string | Validate marketplace cred while saving inventory config | 


Update inventory sync configuration of marketplace channel for a seller


---


#### Marketplaces#getChannelLocationConfig
Get marketplace channel location config for a seller

```kotlin
marketplaces.getChannelLocationConfig(companyId: companyId, channel: channel).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 


Get marketplace channel location config for a seller


---


#### Marketplaces#updateChannelLocationConfig
update marketplace channel location config for a seller

```kotlin
marketplaces.updateChannelLocationConfig(companyId: companyId, channel: channel, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 


update marketplace channel location config for a seller


---


#### Marketplaces#getChannelStatus
Get marketplace channel active status for a seller

```kotlin
marketplaces.getChannelStatus(companyId: companyId, channel: channel).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 


Get marketplace channel active status for a seller


---


#### Marketplaces#updateChannelStatus
Update marketplace channel active status for a seller

```kotlin
marketplaces.updateChannelStatus(companyId: companyId, channel: channel, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 


Update marketplace channel active status for a seller


---


#### Marketplaces#triggerChannelInventoryUpdates
Trigger marketplace channel inventory updates for a seller

```kotlin
marketplaces.triggerChannelInventoryUpdates(companyId: companyId, channel: channel, updateType: updateType, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 
| update_type | string | Inventory update type | 


Trigger marketplace channel inventory updates for a seller


---



---
---


## Rewards

```javascript
const { Configuration, Rewards } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const rewards = new Rewards(conf);

```


#### Rewards#getGiveaways
List of giveaways of the current application.

```kotlin
rewards.getGiveaways(companyId: companyId, applicationId: applicationId, pageId: pageId, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| page_id | string | pagination page id | 
| page_size | integer | pagination page size | 


List of giveaways of the current application.


---


#### Rewards#createGiveaway
Adds a new giveaway.

```kotlin
rewards.createGiveaway(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 


Adds a new giveaway.


---


#### Rewards#getGiveawayByID
Get giveaway by ID.

```kotlin
rewards.getGiveawayByID(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| id | string | Giveaway ID | 


Get giveaway by ID.


---


#### Rewards#updateGiveaway
Updates the giveaway by it's ID.

```kotlin
rewards.updateGiveaway(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| id | string | Giveaway ID | 


Updates the giveaway by it's ID.


---


#### Rewards#getOffers
List of offer of the current application.

```kotlin
rewards.getOffers(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 


List of offer of the current application.


---


#### Rewards#getOfferByName
Get offer by name.

```kotlin
rewards.getOfferByName(companyId: companyId, applicationId: applicationId, cookie: cookie, name: name).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| cookie | string | User's session cookie. This cookie is set in browser cookie when logged-in to fynd's authentication system i.e. `Grimlock` or by using grimlock-backend SDK for backend implementation. | 
| name | string | Offer name | 


Get offer by name.


---


#### Rewards#updateOfferByName
Updates the offer by name.

```kotlin
rewards.updateOfferByName(companyId: companyId, applicationId: applicationId, name: name, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| name | string | Offer name | 


Updates the offer by name.


---


#### Rewards#getUserAvailablePoints
User's reward details.

```kotlin
rewards.getUserAvailablePoints(companyId: companyId, applicationId: applicationId, userId: userId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| user_id | string | user id | 


User's reward details.


---


#### Rewards#updateUserStatus
Update User status

```kotlin
rewards.updateUserStatus(companyId: companyId, applicationId: applicationId, userId: userId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| user_id | string | user id | 


Update user status, active/archive


---


#### Rewards#getUserPointsHistory
Get list of points transactions.

```kotlin
rewards.getUserPointsHistory(companyId: companyId, applicationId: applicationId, userId: userId, pageId: pageId, pageLimit: pageLimit, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | company id | 
| application_id | string | application id | 
| user_id | string | user id | 
| page_id | string | PageID is the ID of the requested page. For first request it should be kept empty. | 
| page_limit | integer | PageLimit is the number of requested items in response. | 
| page_size | integer | PageSize is the number of requested items in response. | 


Get list of points transactions.
The list of points history is paginated.


---



---
---


## Analytics

```javascript
const { Configuration, Analytics } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const analytics = new Analytics(conf);

```


#### Analytics#getStatiscticsGroups
Get statistics groups

```kotlin
analytics.getStatiscticsGroups(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 


Get statistics groups


---


#### Analytics#getStatiscticsGroupComponents
Get statistics group components

```kotlin
analytics.getStatiscticsGroupComponents(companyId: companyId, applicationId: applicationId, groupName: groupName).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| group_name | string | Group name | 


Get statistics group components


---


#### Analytics#getComponentStatsCSV
Get component statistics csv

```kotlin
analytics.getComponentStatsCSV(companyId: companyId, applicationId: applicationId, componentName: componentName).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| component_name | string | Component name | 


Get component statistics csv


---


#### Analytics#getComponentStatsPDF
Get component statistics pdf

```kotlin
analytics.getComponentStatsPDF(companyId: companyId, applicationId: applicationId, componentName: componentName).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| component_name | string | Component name | 


Get component statistics pdf


---


#### Analytics#getComponentStats
Get component statistics

```kotlin
analytics.getComponentStats(companyId: companyId, applicationId: applicationId, componentName: componentName).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| component_name | string | Component name | 


Get component statistics


---


#### Analytics#getAbandonCartList
Get abandon carts list

```kotlin
analytics.getAbandonCartList(companyId: companyId, applicationId: applicationId, fromDate: fromDate, toDate: toDate, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| from_date | string | From date | 
| to_date | string | To date | 
| page_no | integer | Current page number | 
| page_size | integer | Current page size | 


Get abandon carts list


---


#### Analytics#getAbandonCartsCSV
Get abandon carts csv

```kotlin
analytics.getAbandonCartsCSV(companyId: companyId, applicationId: applicationId, fromDate: fromDate, toDate: toDate).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| from_date | string | From date | 
| to_date | string | To date | 


Get abandon carts csv


---


#### Analytics#getAbandonCartDetail
Get abandon carts details

```kotlin
analytics.getAbandonCartDetail(companyId: companyId, applicationId: applicationId, cartId: cartId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| cart_id | string | Cart Id | 


Get abandon cart details


---


#### Analytics#createExportJob
Create data export job in required format

```kotlin
analytics.createExportJob(companyId: companyId, exportType: exportType, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| export_type | string | Export type / format | 


Create data export job in required format


---


#### Analytics#getExportJobStatus
Get data export job status

```kotlin
analytics.getExportJobStatus(companyId: companyId, exportType: exportType, jobId: jobId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| export_type | string | Export type / format | 
| job_id | string | Export job id | 


Get data export job status


---


#### Analytics#getLogsList
Get logs list

```kotlin
analytics.getLogsList(companyId: companyId, logType: logType, pageNo: pageNo, pageSize: pageSize, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| log_type | string | Log type | 
| page_no | integer | Current page number | 
| page_size | integer | Current page size | 


Get logs list


---


#### Analytics#searchLogs
Search logs

```kotlin
analytics.searchLogs(companyId: companyId, pageNo: pageNo, pageSize: pageSize, logType: logType, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| page_no | integer | Current page number | 
| page_size | integer | Current page size | 
| log_type | string | Log type | 


Search logs


---



---
---
