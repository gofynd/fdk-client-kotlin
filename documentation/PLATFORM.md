# FDK Platform Front API Documentaion


* [Common](#Common) - Application configuration apis 
* [Lead](#Lead) - Handles communication between Administrator <-> Staff and Staff <-> Users 
* [Feedback](#Feedback) - User Reviews and Rating System 
* [Theme](#Theme) - Responsible for themes 
* [User](#User) - Authentication Service 
* [Content](#Content) - Content System 
* [Assignment](#Assignment) -  
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
* [Rewards](#Rewards) - Rewards 
* [Analytics](#Analytics) - Perceptor analytics 
* [Discount](#Discount) - Discount 
* [Partner](#Partner) - Partner configuration apis 
* [Webhook](#Webhook) - Webhook dispatcher with retry and one event to many subscriber vice versa 

----
----

### Classes and Methods


* [Common](#Common)
  * [Common#getLocations](#commongetlocations)
 
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
  * [Lead#getFeedbacks](#leadgetfeedbacks)
  * [Lead#submitFeedback](#leadsubmitfeedback)
  * [Lead#createHistory](#leadcreatehistory)
  * [Lead#getTicketHistory](#leadgettickethistory)
  * [Lead#getCustomForm](#leadgetcustomform)
  * [Lead#editCustomForm](#leadeditcustomform)
  * [Lead#getCustomForms](#leadgetcustomforms)
  * [Lead#createCustomForm](#leadcreatecustomform)
  * [Lead#getTokenForVideoRoom](#leadgettokenforvideoroom)
  * [Lead#getTokenForVideoRoom](#leadgettokenforvideoroom)
  * [Lead#getVideoParticipants](#leadgetvideoparticipants)
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
  * [Theme#getAllPages](#themegetallpages)
  * [Theme#createPage](#themecreatepage)
  * [Theme#updateMultiplePages](#themeupdatemultiplepages)
  * [Theme#getPage](#themegetpage)
  * [Theme#updatePage](#themeupdatepage)
  * [Theme#deletePage](#themedeletepage)
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
  * [User#createUser](#usercreateuser)
  * [User#updateUser](#userupdateuser)
  * [User#createUserSession](#usercreateusersession)
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
  * [Content#updateInjectableTag](#contentupdateinjectabletag)
  * [Content#deleteAllInjectableTags](#contentdeleteallinjectabletags)
  * [Content#getInjectableTags](#contentgetinjectabletags)
  * [Content#addInjectableTag](#contentaddinjectabletag)
  * [Content#removeInjectableTag](#contentremoveinjectabletag)
  * [Content#editInjectableTag](#contenteditinjectabletag)
 
* [Assignment](#Assignment)
  * [Assignment#createPickupLocation](#assignmentcreatepickuplocation)
  * [Assignment#getPickupLocation](#assignmentgetpickuplocation)
  * [Assignment#updatePickupLocation](#assignmentupdatepickuplocation)
  * [Assignment#getPickupLocationById](#assignmentgetpickuplocationbyid)
  * [Assignment#createPickupConfiguration](#assignmentcreatepickupconfiguration)
  * [Assignment#getPickupConfiguration](#assignmentgetpickupconfiguration)
  * [Assignment#getAllocationConfiguration](#assignmentgetallocationconfiguration)
  * [Assignment#createAllocationConfiguration](#assignmentcreateallocationconfiguration)
  * [Assignment#updateAllocationConfiguration](#assignmentupdateallocationconfiguration)
  * [Assignment#getAllocationLocations](#assignmentgetallocationlocations)
  * [Assignment#getAllocationLocationById](#assignmentgetallocationlocationbyid)
  * [Assignment#updateAllocationLocation](#assignmentupdateallocationlocation)
  * [Assignment#createAllocationLocation](#assignmentcreateallocationlocation)
  * [Assignment#getDestinationZones](#assignmentgetdestinationzones)
  * [Assignment#postDestinationZone](#assignmentpostdestinationzone)
  * [Assignment#getDestinationZoneById](#assignmentgetdestinationzonebyid)
  * [Assignment#updateDestinationZone](#assignmentupdatedestinationzone)
 
* [Billing](#Billing)
  * [Billing#createSubscriptionCharge](#billingcreatesubscriptioncharge)
  * [Billing#getSubscriptionCharge](#billinggetsubscriptioncharge)
  * [Billing#cancelSubscriptionCharge](#billingcancelsubscriptioncharge)
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
  * [Payment#addBeneficiaryDetails](#paymentaddbeneficiarydetails)
  * [Payment#verifyIfscCode](#paymentverifyifsccode)
  * [Payment#getUserOrderBeneficiaries](#paymentgetuserorderbeneficiaries)
  * [Payment#getUserBeneficiaries](#paymentgetuserbeneficiaries)
 
* [Order](#Order)
  * [Order#shipmentStatusUpdate](#ordershipmentstatusupdate)
  * [Order#activityStatus](#orderactivitystatus)
  * [Order#storeProcessShipmentUpdate](#orderstoreprocessshipmentupdate)
  * [Order#checkRefund](#ordercheckrefund)
  * [Order#getOrdersByCompanyId](#ordergetordersbycompanyid)
  * [Order#getOrderDetails](#ordergetorderdetails)
  * [Order#getPicklistOrdersByCompanyId](#ordergetpicklistordersbycompanyid)
  * [Order#trackShipmentPlatform](#ordertrackshipmentplatform)
  * [Order#trackOrder](#ordertrackorder)
  * [Order#failedOrders](#orderfailedorders)
  * [Order#reprocessOrder](#orderreprocessorder)
  * [Order#updateShipment](#orderupdateshipment)
  * [Order#getPlatformShipmentReasons](#ordergetplatformshipmentreasons)
  * [Order#getShipmentTrackDetails](#ordergetshipmenttrackdetails)
  * [Order#getShipmentAddress](#ordergetshipmentaddress)
  * [Order#updateShipmentAddress](#orderupdateshipmentaddress)
  * [Order#getPing](#ordergetping)
  * [Order#voiceCallback](#ordervoicecallback)
  * [Order#voiceClickToCall](#ordervoiceclicktocall)
 
* [Catalog](#Catalog)
  * [Catalog#deleteSearchKeywords](#catalogdeletesearchkeywords)
  * [Catalog#updateSearchKeywords](#catalogupdatesearchkeywords)
  * [Catalog#getSearchKeywords](#cataloggetsearchkeywords)
  * [Catalog#getAllSearchKeyword](#cataloggetallsearchkeyword)
  * [Catalog#createCustomKeyword](#catalogcreatecustomkeyword)
  * [Catalog#deleteAutocompleteKeyword](#catalogdeleteautocompletekeyword)
  * [Catalog#updateAutocompleteKeyword](#catalogupdateautocompletekeyword)
  * [Catalog#getAutocompleteKeywordDetail](#cataloggetautocompletekeyworddetail)
  * [Catalog#getAutocompleteConfig](#cataloggetautocompleteconfig)
  * [Catalog#createCustomAutocompleteRule](#catalogcreatecustomautocompleterule)
  * [Catalog#getProductBundle](#cataloggetproductbundle)
  * [Catalog#createProductBundle](#catalogcreateproductbundle)
  * [Catalog#updateProductBundle](#catalogupdateproductbundle)
  * [Catalog#getProductBundleDetail](#cataloggetproductbundledetail)
  * [Catalog#getSizeGuides](#cataloggetsizeguides)
  * [Catalog#createSizeGuide](#catalogcreatesizeguide)
  * [Catalog#updateSizeGuide](#catalogupdatesizeguide)
  * [Catalog#getSizeGuide](#cataloggetsizeguide)
  * [Catalog#getCatalogConfiguration](#cataloggetcatalogconfiguration)
  * [Catalog#getConfigurations](#cataloggetconfigurations)
  * [Catalog#createConfigurationProductListing](#catalogcreateconfigurationproductlisting)
  * [Catalog#getConfigurationByType](#cataloggetconfigurationbytype)
  * [Catalog#createConfigurationByType](#catalogcreateconfigurationbytype)
  * [Catalog#getQueryFilters](#cataloggetqueryfilters)
  * [Catalog#getAllCollections](#cataloggetallcollections)
  * [Catalog#createCollection](#catalogcreatecollection)
  * [Catalog#getCollectionDetail](#cataloggetcollectiondetail)
  * [Catalog#deleteCollection](#catalogdeletecollection)
  * [Catalog#updateCollection](#catalogupdatecollection)
  * [Catalog#getCollectionItems](#cataloggetcollectionitems)
  * [Catalog#addCollectionItems](#catalogaddcollectionitems)
  * [Catalog#getCatalogInsights](#cataloggetcataloginsights)
  * [Catalog#getSellerInsights](#cataloggetsellerinsights)
  * [Catalog#createMarketplaceOptin](#catalogcreatemarketplaceoptin)
  * [Catalog#getMarketplaceOptinDetail](#cataloggetmarketplaceoptindetail)
  * [Catalog#getCompanyDetail](#cataloggetcompanydetail)
  * [Catalog#getCompanyBrandDetail](#cataloggetcompanybranddetail)
  * [Catalog#getCompanyMetrics](#cataloggetcompanymetrics)
  * [Catalog#getStoreDetail](#cataloggetstoredetail)
  * [Catalog#getGenderAttribute](#cataloggetgenderattribute)
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
  * [Catalog#listCategories](#cataloglistcategories)
  * [Catalog#createCategories](#catalogcreatecategories)
  * [Catalog#updateCategory](#catalogupdatecategory)
  * [Catalog#getCategoryData](#cataloggetcategorydata)
  * [Catalog#getProducts](#cataloggetproducts)
  * [Catalog#createProduct](#catalogcreateproduct)
  * [Catalog#deleteProduct](#catalogdeleteproduct)
  * [Catalog#editProduct](#catalogeditproduct)
  * [Catalog#getProduct](#cataloggetproduct)
  * [Catalog#getProductValidation](#cataloggetproductvalidation)
  * [Catalog#getProductSize](#cataloggetproductsize)
  * [Catalog#getProductBulkUploadHistory](#cataloggetproductbulkuploadhistory)
  * [Catalog#updateProductAssetsInBulk](#catalogupdateproductassetsinbulk)
  * [Catalog#deleteProductBulkJob](#catalogdeleteproductbulkjob)
  * [Catalog#createProductsInBulk](#catalogcreateproductsinbulk)
  * [Catalog#getCompanyTags](#cataloggetcompanytags)
  * [Catalog#getProductAssetsInBulk](#cataloggetproductassetsinbulk)
  * [Catalog#createProductAssetsInBulk](#catalogcreateproductassetsinbulk)
  * [Catalog#deleteSize](#catalogdeletesize)
  * [Catalog#getInventory](#cataloggetinventory)
  * [Catalog#addInventory](#catalogaddinventory)
  * [Catalog#deleteInventory](#catalogdeleteinventory)
  * [Catalog#getInventoryBulkUploadHistory](#cataloggetinventorybulkuploadhistory)
  * [Catalog#createBulkInventoryJob](#catalogcreatebulkinventoryjob)
  * [Catalog#deleteBulkInventoryJob](#catalogdeletebulkinventoryjob)
  * [Catalog#createBulkInventory](#catalogcreatebulkinventory)
  * [Catalog#getInventoryExport](#cataloggetinventoryexport)
  * [Catalog#createInventoryExportJob](#catalogcreateinventoryexportjob)
  * [Catalog#exportInventoryConfig](#catalogexportinventoryconfig)
  * [Catalog#getAllHsnCodes](#cataloggetallhsncodes)
  * [Catalog#createHsnCode](#catalogcreatehsncode)
  * [Catalog#updateHsnCode](#catalogupdatehsncode)
  * [Catalog#getHsnCode](#cataloggethsncode)
  * [Catalog#bulkHsnCode](#catalogbulkhsncode)
  * [Catalog#getApplicationBrands](#cataloggetapplicationbrands)
  * [Catalog#getDepartments](#cataloggetdepartments)
  * [Catalog#getCategories](#cataloggetcategories)
  * [Catalog#getAppicationProducts](#cataloggetappicationproducts)
  * [Catalog#getProductDetailBySlug](#cataloggetproductdetailbyslug)
 
* [CompanyProfile](#CompanyProfile)
  * [CompanyProfile#updateCompany](#companyprofileupdatecompany)
  * [CompanyProfile#cbsOnboardGet](#companyprofilecbsonboardget)
  * [CompanyProfile#getCompanyMetrics](#companyprofilegetcompanymetrics)
  * [CompanyProfile#editBrand](#companyprofileeditbrand)
  * [CompanyProfile#getBrand](#companyprofilegetbrand)
  * [CompanyProfile#createBrand](#companyprofilecreatebrand)
  * [CompanyProfile#createCompanyBrandMapping](#companyprofilecreatecompanybrandmapping)
  * [CompanyProfile#getBrands](#companyprofilegetbrands)
  * [CompanyProfile#createLocation](#companyprofilecreatelocation)
  * [CompanyProfile#getLocations](#companyprofilegetlocations)
  * [CompanyProfile#updateLocation](#companyprofileupdatelocation)
  * [CompanyProfile#getLocationDetail](#companyprofilegetlocationdetail)
  * [CompanyProfile#createLocationBulk](#companyprofilecreatelocationbulk)
 
* [FileStorage](#FileStorage)
  * [FileStorage#startUpload](#filestoragestartupload)
  * [FileStorage#completeUpload](#filestoragecompleteupload)
  * [FileStorage#appStartUpload](#filestorageappstartupload)
  * [FileStorage#appCompleteUpload](#filestorageappcompleteupload)
  * [FileStorage#getSignUrls](#filestoragegetsignurls)
  * [FileStorage#copyFiles](#filestoragecopyfiles)
  * [FileStorage#appCopyFiles](#filestorageappcopyfiles)
  * [FileStorage#browse](#filestoragebrowse)
  * [FileStorage#browse](#filestoragebrowse)
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
  * [Inventory#getJobCodeMetrics](#inventorygetjobcodemetrics)
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
 
* [Discount](#Discount)
  * [Discount#getDiscounts](#discountgetdiscounts)
  * [Discount#createDiscount](#discountcreatediscount)
  * [Discount#getDiscount](#discountgetdiscount)
  * [Discount#updateDiscount](#discountupdatediscount)
  * [Discount#validateDiscountFile](#discountvalidatediscountfile)
  * [Discount#downloadDiscountFile](#discountdownloaddiscountfile)
  * [Discount#getValidationJob](#discountgetvalidationjob)
  * [Discount#cancelValidationJob](#discountcancelvalidationjob)
  * [Discount#getDownloadJob](#discountgetdownloadjob)
  * [Discount#cancelDownloadJob](#discountcanceldownloadjob)
 
* [Partner](#Partner)
  * [Partner#addProxyPath](#partneraddproxypath)
  * [Partner#removeProxyPath](#partnerremoveproxypath)
 
* [Webhook](#Webhook)
  * [Webhook#getSubscribersByCompanyAndEventId](#webhookgetsubscribersbycompanyandeventid)
  * [Webhook#registerSubscriberToEvent](#webhookregistersubscribertoevent)
  * [Webhook#updateSubscriberConfig](#webhookupdatesubscriberconfig)
 

---
---



## Common


#### getLocations
Get countries, states, cities

```kotlin
common.getLocations(locationType: locationType, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| locationType | String? | Provide location type to query on |   
| id | String? | Field is optional when location_type is country. If querying for state, provide id of country. If querying for city, provide id of state. |  





*Success Response*



Success


Schema: `Locations`






---



---
---


## Lead


#### getTickets
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
| companyId | String? | Company ID for which the data will be returned |   
| items | Boolean? | Decides that the reponse will contain the list of tickets |   
| filters | Boolean? | Decides that the reponse will contain the ticket filters |   
| q | String? | Search through ticket titles and description |   
| status | String? | Filter tickets on status |   
| priority | PriorityEnum? | Filter tickets on priority |   
| category | String? | Filter tickets on category |   
| pageNo | Int? | The page number to navigate through the given set of results. |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 12. |  



Gets the list of company level tickets and/or ticket filters

*Success Response*



Success


Schema: `TicketList`






---


#### createTicket
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
| companyId | String? | Company ID for which the data will be returned |  



Creates a company level ticket

*Success Response*



Success


Schema: `Ticket`






---


#### getTickets
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for which the data will be returned |   
| items | Boolean? | Decides that the reponse will contain the list of tickets |   
| filters | Boolean? | Decides that the reponse will contain the ticket filters |   
| q | String? | Search through ticket titles and description |   
| status | String? | Filter tickets on status |   
| priority | PriorityEnum? | Filter tickets on priority |   
| category | String? | Filter tickets on category |  



Gets the list of Application level Tickets and/or ticket filters

*Success Response*



Success


Schema: `TicketList`






---


#### getTicket
Retreives ticket details of a company level ticket with ticket ID

```kotlin
lead.getTicket(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for which the data will be returned |   
| id | String? | Tiket ID of the ticket to be fetched |  



Retreives ticket details of a company level ticket

*Success Response*



Success


Schema: `Ticket`






---


#### editTicket
Edits ticket details of a company level ticket

```kotlin
lead.editTicket(companyId: companyId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for ticket |   
| id | String? | Ticket ID of ticket to be edited |  



Edits ticket details of a company level ticket such as status, priority, category, tags, attachments, assigne & ticket content changes

*Success Response*



Success


Schema: `Ticket`






---


#### getTicket
Retreives ticket details of a application level ticket

```kotlin
lead.getTicket(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for which the data will be returned |   
| id | String? | Tiket ID of the ticket to be fetched |  



Retreives ticket details of a application level ticket with ticket ID

*Success Response*



Success


Schema: `Ticket`






---


#### editTicket
Edits ticket details of a application level ticket

```kotlin
lead.editTicket(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for ticket |   
| id | String? | Ticket ID of ticket to be edited |  



Edits ticket details of a application level ticket such as status, priority, category, tags, attachments, assigne & ticket content changes

*Success Response*



Success


Schema: `Ticket`






---


#### createHistory
Create history for specific company level ticket

```kotlin
lead.createHistory(companyId: companyId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for ticket |   
| id | String? | Ticket ID for which history is created |  



Create history for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Success Response*



Success


Schema: `TicketHistory`






---


#### getTicketHistory
Gets history list for specific company level ticket

```kotlin
lead.getTicketHistory(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for ticket |   
| id | String? | Ticket ID for which history is to be fetched |  



Gets history list for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Success Response*



Success


Schema: `TicketHistoryList`






---


#### getFeedbacks
Gets a list of feedback submitted against that ticket

```kotlin
lead.getFeedbacks(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for ticket |   
| id | String? | Ticket ID for which feedbacks are to be fetched |  



Gets a list of feedback submitted against that ticket

*Success Response*



Success


Schema: `TicketFeedbackList`






---


#### submitFeedback
Submit a response for feeback form against that ticket

```kotlin
lead.submitFeedback(companyId: companyId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID for ticket |   
| id | String? | Ticket ID for which feedback is to be submitted |  



Submit a response for feeback form against that ticket

*Success Response*



Success


Schema: `TicketFeedback`






---


#### createHistory
Create history for specific application level ticket

```kotlin
lead.createHistory(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for ticket |   
| id | String? | Ticket ID for which history is created |  



Create history for specific application level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Success Response*



Success


Schema: `TicketHistory`






---


#### getTicketHistory
Gets history list for specific application level ticket

```kotlin
lead.getTicketHistory(companyId: companyId, applicationId: applicationId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of application |   
| applicationId | String? | Application ID for ticket |   
| id | String? | Ticket ID for which history is to be fetched |  



Gets history list for specific application level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Success Response*



Success


Schema: `TicketHistoryList`






---


#### getCustomForm
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for the form |   
| slug | String? | Slug of form whose response is getting submitted |  



Get specific custom form using it's slug, this is used to view the form.

*Success Response*



Success


Schema: `CustomForm`






---


#### editCustomForm
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for the form |   
| slug | String? | Slug of form whose response is getting submitted |  



Edit the given custom form field such as adding or deleting input, assignee, title, decription, notification and polling information.

*Success Response*



Success


Schema: `CustomForm`






---


#### getCustomForms
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for the form |  



Get list of custom form for given application

*Success Response*



Success


Schema: `CustomFormList`






---


#### createCustomForm
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for the form |  



Creates a new custom form for given application

*Success Response*



Success


Schema: `CustomForm`






---


#### getTokenForVideoRoom
Get Token to join a specific Video Room using it's unqiue name

```kotlin
lead.getTokenForVideoRoom(companyId: companyId, uniqueName: uniqueName).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id for video room |   
| uniqueName | String? | Unique name of video room |  



Get Token to join a specific Video Room using it's unqiue name, this Token is your ticket to Room and also creates your identity there.

*Success Response*



Success


Schema: `GetTokenForVideoRoomResponse`






---


#### getTokenForVideoRoom
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for video room |   
| uniqueName | String? | Unique name of video room |  



Get Token to join a specific Video Room using it's unqiue name, this Token is your ticket to Room and also creates your identity there.

*Success Response*



Success


Schema: `GetTokenForVideoRoomResponse`






---


#### getVideoParticipants
Get participants of a specific Video Room using it's unique name

```kotlin
lead.getVideoParticipants(companyId: companyId, uniqueName: uniqueName).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id for video room |   
| uniqueName | String? | Unique name of Video Room |  



Get participants of a specific Video Room using it's unique name, this can be used to check if people are already there in the room and also to show their names.

*Success Response*



Success


Schema: `GetParticipantsInsideVideoRoomResponse`






---


#### getVideoParticipants
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for video room |   
| uniqueName | String? | Unique name of Video Room |  



Get participants of a specific Video Room using it's unique name, this can be used to check if people are already there in the room and also to show their names.

*Success Response*



Success


Schema: `GetParticipantsInsideVideoRoomResponse`






---


#### openVideoRoom
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for video room |  



Open a video room.

*Success Response*



Success


Schema: `CreateVideoRoomResponse`






---


#### closeVideoRoom
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for video room |   
| uniqueName | String? | Unique name of Video Room |  



Close the video room and force all participants to leave.

*Success Response*



Success


Schema: `CloseVideoRoomResponse`






---



---
---


## Feedback


#### getAttributes
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| pageNo | Int? | pagination page no |   
| pageSize | Int? | pagination page size |  



Provides a list of all attribute data.

*Success Response*



ok


Schema: `FeedbackAttributes`






---


#### getCustomerReviews
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | review id |   
| entityId | String? | entity id |   
| entityType | String? | entity type |   
| userId | String? | user id |   
| media | String? | media type e.g. image | video | video_file | video_link |   
| rating | ArrayList<Double>? | rating filter, 1-5 |   
| attributeRating | ArrayList<String>? | attribute rating filter with ma,e of attribute |   
| facets | Boolean? | facets (true|false) |   
| sort | String? | sort by : default | top | recent |   
| next | String? | pagination next |   
| start | String? | pagination start |   
| limit | String? | pagination limit |   
| count | String? | pagination count |   
| pageId | String? | pagination page id |   
| pageSize | Int? | pagination page size |  



The endpoint provides a list of customer reviews based on entity and provided filters

*Success Response*



Success


Schema: `GetReviewResponse`






---


#### updateApprove
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| reviewId | String? | review id |  



The is used to update approve details like status and description text

*Success Response*



ok


Schema: `UpdateResponse`






---


#### getHistory
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| reviewId | String? | review id |  



The is used to get the history details like status and description text

*Success Response*



ok


Schema: `ArrayList<ActivityDump>`






---


#### getApplicationTemplates
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| pageId | String? | pagination page id |   
| pageSize | Int? | pagination page size |  



Get all templates of application

*Success Response*



Success


Schema: `TemplateGetResponse`






---


#### createTemplate
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
| companyId | String? | company id |   
| applicationId | String? | application id |  



Create a new template for review with following data:
- Enable media, rating and review
- Rating - active/inactive/selected rate choices, attributes, text on rate, comment for each rate, type
- Review - header, title, description, image and video meta, enable votes

*Success Response*



Success


Schema: `InsertResponse`






---


#### getTemplateById
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | template id |  



Get the template for product or l3 type by ID

*Success Response*



Success


Schema: `Template`






---


#### updateTemplate
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | template id |  



Update existing template status, active/archive

*Success Response*



Success


Schema: `UpdateResponse`






---


#### updateTemplateStatus
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | template id |  



Update existing template status, active/archive

*Success Response*



Success


Schema: `UpdateResponse`






---



---
---


## Theme


#### getAllPages
Get all pages of a theme

```kotlin
theme.getAllPages(companyId: companyId, applicationId: applicationId, themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme to be retrieved |  



Use this API to retrieve all the available pages of a theme by its ID.

*Success Response*



Success. Returns an array all the pages of the theme. Refer `AllAvailablePageSchema` for more details.


Schema: `AllAvailablePageSchema`






---


#### createPage
Create a page 

```kotlin
theme.createPage(companyId: companyId, applicationId: applicationId, themeId: themeId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme |  



Use this API to create a page for a theme by its ID.

*Success Response*



Success. Returns the page of the theme. Refer `AvailablePageSchema` for more details.


Schema: `AvailablePageSchema`






---


#### updateMultiplePages
Update multiple pages of a theme

```kotlin
theme.updateMultiplePages(companyId: companyId, applicationId: applicationId, themeId: themeId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme to be retrieved |  



Use this API to update multiple pages of a theme by its ID.

*Success Response*



Success. Returns an array all the pages of the theme. Refer `AllAvailablePageSchema` for more details.


Schema: `AllAvailablePageSchema`






---


#### getPage
Get page of a theme

```kotlin
theme.getPage(companyId: companyId, applicationId: applicationId, themeId: themeId, pageValue: pageValue).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme to be retrieved |   
| pageValue | String? | Value of the page to be retrieved |  



Use this API to retrieve a page of a theme.

*Success Response*



Success. Returns an object of the page.  Refer `AvailablePageSchema` for more details.


Schema: `AvailablePageSchema`






---


#### updatePage
Updates a page 

```kotlin
theme.updatePage(companyId: companyId, applicationId: applicationId, themeId: themeId, pageValue: pageValue, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme |   
| pageValue | String? | Value of the page to be updated |  



Use this API to update a page for a theme by its ID.

*Success Response*



Success. Returns a the page of the theme. Refer `AvailablePageSchema` for more details.


Schema: `AvailablePageSchema`






---


#### deletePage
Deletes a page 

```kotlin
theme.deletePage(companyId: companyId, applicationId: applicationId, themeId: themeId, pageValue: pageValue).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| themeId | String? | ID of the theme |   
| pageValue | String? | Value of the page to be updated |  



Use this API to delete a page for a theme by its ID and page_value.

*Success Response*



Success. Returns a the page of the theme. Refer `AvailablePageSchema` for more details.


Schema: `AvailablePageSchema`






---


#### getThemeLibrary
Get a list of themes from the theme library

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| pageSize | Int? | The number of items to retrieve in each page. Default value is 10.  |   
| pageNo | Int? | The page number to navigate through the given set of results. Default value is 1. |  



Theme library is a personalized collection of themes that are chosen and added from the available themes. Use this API to fetch a list of themes from the library along with their configuration details. 

*Success Response*



Success. Refer `ThemesListingResponseSchema` for more details.


Schema: `ThemesListingResponseSchema`






---


#### addToThemeLibrary
Add a theme to the theme library

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Theme library is a personalized collection of themes that are chosen and added from the available themes. Use this API to choose a theme and add it to the theme library.

*Success Response*



Success. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---


#### applyTheme
Apply a theme

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Use this API to apply a theme to the website.

*Success Response*



Success. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---


#### isUpgradable
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| themeId | String? | Theme ID |  



There's always a possibility that new features get added to a theme. Use this API to check if the applied theme has an upgrade available.

*Success Response*



Success. If the boolean value of `upgrade` returns **true**, the theme can be upgraded. Refer `UpgradableThemeSchema` for more details.


Schema: `UpgradableThemeSchema`






---


#### upgradeTheme
Upgrade a theme

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| themeId | String? | ID allotted to the theme. |  



Use this API to upgrade the current theme to its latest version.

*Success Response*



Success. Upgrades the theme and shares the details of the new version in the response. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---


#### getPublicThemes
Get all public themes

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| pageSize | Int? | The number of items to retrieve in each page. Default value is 10.  |   
| pageNo | Int? | The page number to navigate through the given set of results. Default value is 1.  |  



Use this API to get a list of free themes that you can apply to your website.

*Success Response*



Success. Refer `ThemesListingResponseSchema` for more details.


Schema: `ThemesListingResponseSchema`






---


#### createTheme
Create a new theme

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Themes improve the look and appearance of a website. Use this API to create a theme.

*Success Response*



Theme


Schema: `ThemesSchema`






---


#### getAppliedTheme
Get the applied theme

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Use this API to retrieve the theme that is currently applied to the website along with its details.

*Success Response*



Success. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---


#### getFonts
Get all the supported fonts in a theme

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Font is a collection of characters with a similar design. Use this API to retrieve a list of website fonts.

*Success Response*



Success. Refer `FontsSchema` for more details.


Schema: `FontsSchema`






---


#### getThemeById
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| themeId | String? | ID allotted to the theme. |  



Use this API to retrieve the details of a specific theme by using its ID.

*Success Response*



Success. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---


#### updateTheme
Update a theme

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| themeId | String? | ID allotted to the theme. |  



Use this API to edit an existing theme. You can customize the website font, sections, images, styles, and many more.

*Success Response*



Success. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---


#### deleteTheme
Delete a theme

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| themeId | String? | ID allotted to the theme. |  



Use this API to delete a theme from the theme library.

*Success Response*



Success. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---


#### getThemeForPreview
Get a theme preview

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| themeId | String? | ID allotted to the theme. |  



A theme can be previewed before applying it. Use this API to retrieve the theme preview by using its ID.

*Success Response*



Success. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---


#### publishTheme
Publish a theme

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| themeId | String? | ID allotted to the theme. |  



Use this API to publish a theme that is either newly created or edited.

*Success Response*



Success. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---


#### unpublishTheme
Unpublish a theme

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| themeId | String? | ID allotted to the theme. |  



Use this API to remove an existing theme from the list of available themes.

*Success Response*



Success. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---


#### archiveTheme
Archive a theme

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| themeId | String? | ID allotted to the theme. |  



Use this API to store an existing theme but not delete it so that it can be used in future if required. 

*Success Response*



Success. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---


#### unarchiveTheme
Unarchive a theme

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| themeId | String? | ID allotted to the theme. |  



Use this API to restore an archived theme and bring it back for editing or publishing. 

*Success Response*



Success. Refer `ThemesSchema` for more details.


Schema: `ThemesSchema`






---



---
---


## User


#### getCustomers
Get a list of customers

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| q | String? | The search query. Mobile number or email ID of a customer. |   
| pageSize | Int? | The number of items to retrieve in each page. Default value is 10. |   
| pageNo | Int? | The page number to navigate through the given set of results. Default value is 1.  |  



Use this API to retrieve a list of customers who have registered in the application.

*Success Response*



Success. Refer `CustomerListResponseSchema` for more details.


Schema: `CustomerListResponseSchema`






---


#### searchUsers
Search an existing user.

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| q | String? | The search query. Mobile number or email ID of a customer. |  



Use this API to retrieve an existing user from a list.

*Success Response*



Success. Returns first name, last name, emails, phone number and gender of the user. Refer `UserSearchResponseSchema` for more details.


Schema: `UserSearchResponseSchema`






---


#### createUser
Create user

```kotlin
user.createUser(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Create user

*Success Response*



User create


Schema: `CreateUserResponseSchema`






---


#### updateUser
Update user

```kotlin
user.updateUser(companyId: companyId, applicationId: applicationId, userId: userId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| userId | String? | User ID |  



Update user

*Success Response*



User update


Schema: `CreateUserResponseSchema`






---


#### createUserSession
Create user session

```kotlin
user.createUserSession(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Create user session

*Success Response*



Create user session


Schema: `CreateUserSessionResponseSchema`






---


#### getPlatformConfig
Get platform configurations

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Use this API to get all the platform configurations such as mobile image, desktop image, social logins, and all other text.

*Success Response*



Success. Returns a JSON object containing the all the platform configurations. Refer `PlatformSchema` for more details.


Schema: `PlatformSchema`






---


#### updatePlatformConfig
Update platform configurations

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Use this API to edit the existing platform configurations such as mobile image, desktop image, social logins, and all other text.

*Success Response*



Success. Returns a JSON object with the updated platform configurations. Refer `PlatformSchema` for more details.


Schema: `PlatformSchema`






---



---
---


## Content


#### getAnnouncementsList
Get a list of announcements

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| pageNo | Int? | The page number to navigate through the given set of results. Default value is 1. |   
| pageSize | Int? | The number of items to retrieve in each page. Default value is 10. |  



Announcements are useful to highlight a message or information on top of a webpage. Use this API to retrieve a list of announcements.	

*Success Response*



Success. Refer `GetAnnouncementListSchema` for more details.


Schema: `GetAnnouncementListSchema`






---


#### createAnnouncement
Create an announcement

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Announcements are useful to highlight a message or information on top of a webpage. Use this API to create an announcement.

*Success Response*



Success. Refer `CreateAnnouncementSchema` for more details.


Schema: `CreateAnnouncementSchema`






---


#### getAnnouncementById
Get announcement by ID

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| announcementId | String? | ID allotted to the announcement. |  



Use this API to retrieve an announcement and its details such as the target platform and pages on which it's applicable

*Success Response*



Success. Refer `AdminAnnouncementSchema` for more details.


Schema: `AdminAnnouncementSchema`






---


#### updateAnnouncement
Update an announcement

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| announcementId | String? | ID allotted to the announcement. |  



Use this API to edit an existing announcement and its details such as the target platform and pages on which it's applicable

*Success Response*



Success. Refer `CreateAnnouncementSchema` for more details.


Schema: `CreateAnnouncementSchema`






---


#### updateAnnouncementSchedule
Update the schedule and the publish status of an announcement

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| announcementId | String? | ID allotted to the announcement. |  



Use this API to edit the duration, i.e. start date-time and end date-time of an announcement. Moreover, you can enable/disable an announcement using this API.

*Success Response*



Success. Refer `CreateAnnouncementSchema` for more details.


Schema: `CreateAnnouncementSchema`






---


#### deleteAnnouncement
Delete announcement by id

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| announcementId | String? | ID allotted to the announcement. |  



Use this API to delete an existing announcement.

*Success Response*



Success.


Schema: `CreateAnnouncementSchema`






---


#### createBlog
Create a blog

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Use this API to create a blog.

*Success Response*



Success. Refer `BlogSchema` for more details.


Schema: `BlogSchema`






---


#### getBlogs
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| pageNo | Int? | The page number to navigate through the given set of results. Default value is 1. |   
| pageSize | Int? | The number of items to retrieve in each page. Default value is 10. |  



Use this API to get a list of blogs along with their details, such as the title, reading time, publish status, feature image, tags, author, etc.

*Success Response*



Success. Refer `BlogGetResponse` for more details.


Schema: `BlogGetResponse`






---


#### updateBlog
Update a blog

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to the blog. |  



Use this API to update the details of an existing blog which includes title, feature image, content, SEO details, expiry, etc.

*Success Response*



Success.


Schema: `BlogSchema`






---


#### deleteBlog
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to the blog. |  



Use this API to delete a blog.

*Success Response*



Success.


Schema: `BlogSchema`






---


#### getComponentById
Get components of a blog

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| slug | String? | A short, human-readable, URL-friendly identifier of a blog page. You can get slug value of a blog from `getBlogs` API. |  



Use this API to retrieve the components of a blog, such as title, slug, feature image, content, schedule, publish status, author, etc.

*Success Response*



Success. Returns a a JSON object with components. Refer `BlogSchema` for more details.


Schema: `BlogSchema`






---


#### getFaqCategories
Get a list of FAQ categories

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



FAQs can be divided into categories. Use this API to get a list of FAQ categories.

*Success Response*



Success. Refer `GetFaqCategoriesSchema` for more details.


Schema: `GetFaqCategoriesSchema`






---


#### getFaqCategoryBySlugOrId
Get an FAQ category by slug or id

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| idOrSlug | String? | ID or the slug allotted to an FAQ category. Slug is a short, human-readable, URL-friendly identifier of an object. You can get slug value of an FAQ category from `getFaqCategories` API. |  



FAQs can be divided into categories. Use this API to get an FAQ categories using its slug or ID.

*Success Response*



Success. Refer `GetFaqCategoryBySlugSchema` for more details.


Schema: `GetFaqCategoryBySlugSchema`






---


#### createFaqCategory
Create an FAQ category

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



FAQs help users to solve an issue or know more about a process. FAQs can be categorized separately, for e.g. some questions can be related to payment, some could be related to purchase, shipping, navigating, etc. Use this API to create an FAQ category.

*Success Response*



Success.


Schema: `CreateFaqCategorySchema`






---


#### updateFaqCategory
Update an FAQ category

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to an FAQ category. |  



Use this API to edit an existing FAQ category.

*Success Response*



Success.


Schema: `CreateFaqCategorySchema`






---


#### deleteFaqCategory
Delete an FAQ category

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to an FAQ category. |  



Use this API to delete an FAQ category.

*Success Response*



Success.


Schema: `FaqSchema`






---


#### getFaqsByCategoryIdOrSlug
Get question and answers within an FAQ category

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| idOrSlug | String? | ID or the slug allotted to an FAQ category. Slug is a short, human-readable, URL-friendly identifier of an object. You can get slug value of an FAQ category from `getFaqCategories` API. |  



Use this API to retrieve all the commonly asked question and answers belonging to an FAQ category.

*Success Response*



Success. Refer `GetFaqSchema` for more details.


Schema: `GetFaqSchema`






---


#### addFaq
Create an FAQ

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| categoryId | String? | ID allotted to an FAQ category. |  



FAQs help users to solve an issue or know more about a process. Use this API to create an FAQ for a given FAQ category.

*Success Response*



Success.


Schema: `CreateFaqResponseSchema`






---


#### updateFaq
Update an FAQ

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| categoryId | String? | ID allotted to an FAQ category. |   
| faqId | String? | ID allotted to an FAQ. |  



Use this API to edit an existing FAQ.

*Success Response*



Success.


Schema: `CreateFaqResponseSchema`






---


#### deleteFaq
Delete an FAQ

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| categoryId | String? | ID allotted to an FAQ category. |   
| faqId | String? | ID allotted to an FAQ. |  



Use this API to delete an existing FAQ.

*Success Response*



Success.


Schema: `CreateFaqResponseSchema`






---


#### getFaqByIdOrSlug
Get an FAQ

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| idOrSlug | String? | ID or the slug allotted to an FAQ category. Slug is a short, human-readable, URL-friendly identifier of an object. You can get slug value of an FAQ category from `getFaqCategories` API. |  



Use this API to retrieve a specific FAQ. You will get the question and answer of that FAQ.

*Success Response*



Success. Refer `CreateFaqResponseSchema` for more details.


Schema: `CreateFaqResponseSchema`






---


#### getLandingPages
Get landing pages

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| pageNo | Int? | The page number to navigate through the given set of results. Default value is 1. |   
| pageSize | Int? | The number of items to retrieve in each page. Default value is 10. |  



Landing page is the first page that a prospect lands upon while visiting a website. Use this API to fetch a list of landing pages.

*Success Response*



Success. Refer `LandingPageGetResponse` for more details.


Schema: `LandingPageGetResponse`






---


#### createLandingPage
Create a landing page

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Landing page is the first page that a prospect lands upon while visiting a website. Use this API to create a landing page.

*Success Response*



Success.


Schema: `LandingPageSchema`






---


#### updateLandingPage
Update a landing page

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to a landing page. |  



Use this API to edit the details of an existing landing page.

*Success Response*



Success.


Schema: `LandingPageSchema`






---


#### deleteLandingPage
Delete a landing page

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to a landing page. |  



Use this API to delete an existing landing page.

*Success Response*



Success.


Schema: `LandingPageSchema`






---


#### getLegalInformation
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Use this API to get the legal information of an application, which includes Policy, Terms and Conditions, Shipping Policy and FAQ regarding the application.

*Success Response*



Success. Refer `ApplicationLegal` for more details.


Schema: `ApplicationLegal`






---


#### updateLegalInformation
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Use this API to edit, update and save the legal information of an application, which includes Policy, Terms and Conditions, Shipping Policy and FAQ regarding the application.

*Success Response*



Success. Refer `ApplicationLegal` for more details.


Schema: `ApplicationLegal`






---


#### getNavigations
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| devicePlatform | String? | Filter navigations by platform. Acceptable values are: web, android, ios, all |   
| pageNo | Int? | The page number to navigate through the given set of results. Default value is 1. |   
| pageSize | Int? | The number of items to retrieve in each page. Default value is 10. |  



Use this API to fetch the navigations details which includes the items of the navigation pane. It also shows the orientation, links, sub-navigations, etc.

*Success Response*



Success. Refer `NavigationGetResponse` for more details.


Schema: `NavigationGetResponse`






---


#### createNavigation
Create a navigation

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Navigation is the arrangement of navigational items to ease the accessibility of resources for users on a website. Use this API to create a navigation.

*Success Response*



Success.


Schema: `NavigationSchema`






---


#### getDefaultNavigations
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



On any website (application), there are navigations that are present by default. Use this API to retrieve those default navigations.

*Success Response*



Success. Refer `DefaultNavigationResponse` for more details.


Schema: `DefaultNavigationResponse`






---


#### getNavigationBySlug
Get a navigation by slug

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| slug | String? | A short, human-readable, URL-friendly identifier of a navigation. You can get slug value of a navigation from `getNavigations` API. |   
| devicePlatform | String? | Filter navigations by platform. Acceptable values are: web, android, ios, all |  



Use this API to retrieve a navigation by its slug.

*Success Response*



Success. Refer `NavigationSchema` for more details.


Schema: `NavigationSchema`






---


#### updateNavigation
Update a navigation

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to the navigation. |  



Use this API to edit the details of an existing navigation.

*Success Response*



Success.


Schema: `NavigationSchema`






---


#### deleteNavigation
Delete a navigation

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to the navigation. |  



Use this API to delete an existing navigation.

*Success Response*



Success.


Schema: `NavigationSchema`






---


#### getPageMeta
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Use this API to get the meta of custom pages (blog, page) and default system pages (e.g. home/brand/category/collection).

*Success Response*



Success. Refer `PageMetaSchema` for more details.


Schema: `PageMetaSchema`






---


#### getPageSpec
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Use this API to get the specifications of a page, such as page type, display name, params and query.

*Success Response*



Success. Refer `PageSpec` for more details.


Schema: `PageSpec`






---


#### createPage
Create a page

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Use this API to create a custom page using a title, seo, publish status, feature image, tags, meta, etc.

*Success Response*



Success. Refer `PageSchema` for more details.


Schema: `PageSchema`






---


#### getPages
Get a list of pages

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| pageNo | Int? | The page number to navigate through the given set of results. Default value is 1. |   
| pageSize | Int? | The number of items to retrieve in each page. Default value is 10. |  



Use this API to retrieve a list of pages.

*Success Response*



Success. Refer `PageGetResponse` for more details.


Schema: `PageGetResponse`






---


#### createPagePreview
Create a page preview

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Use this API to create a page preview to check the appearance of a custom page.

*Success Response*



Success. Refer `PageSchema` for more details.


Schema: `PageSchema`






---


#### updatePagePreview
Change the publish status of a page

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| slug | String? | A short, human-readable, URL-friendly identifier of a page. You can get slug value of a page from `getPages` API. |  



Use this API to change the publish status of an existing page. Allows you to publish and unpublish the page.

*Success Response*



Success.


Schema: `PageSchema`






---


#### updatePage
Update a page

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to the page. |  



Use this API to edit the details of an existing page, such as its title, seo, publish status, feature image, tags, schedule, etc.

*Success Response*



Success. Refer `PageSchema` for more details.


Schema: `PageSchema`






---


#### deletePage
Delete a page

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to the page. |  



Use this API to delete an existing page.

*Success Response*



Success.


Schema: `PageSchema`






---


#### getPageBySlug
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| slug | String? | A short, human-readable, URL-friendly identifier of a page. You can get slug value of a page from `getPages` API. |  



Use this API to retrieve the components of a page, such as its title, seo, publish status, feature image, tags, schedule, etc.

*Success Response*



Success. Returns a JSON object of components. Refer `PageSchema` for more details.


Schema: `PageSchema`






---


#### getSEOConfiguration
Get SEO configuration of an application

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Use this API to know how the SEO is configured in the application. This includes the sitemap, robot.txt, custom meta tags, etc.

*Success Response*



Success. Refer `SeoComponent` for more details.


Schema: `SeoComponent`






---


#### updateSEOConfiguration
Update SEO of application

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



Use this API to edit the SEO details of an application. This includes the sitemap, robot.txt, custom meta tags, etc.

*Success Response*



Success. Refer `SeoSchema` for more details.


Schema: `SeoSchema`






---


#### getSlideshows
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| devicePlatform | String? | Filter slideshows by platform. Acceptable values are: web, android, ios and all |   
| pageNo | Int? | The page number to navigate through the given set of results. Default value is 1. |   
| pageSize | Int? | The number of items to retrieve in each page. Default value is 10. |  



A slideshow is a group of images, videos or a combination of both that are shown on the website in the form of slides. Use this API to fetch a list of slideshows.

*Success Response*



Success. Refer `SlideshowGetResponse` for more details.


Schema: `SlideshowGetResponse`






---


#### createSlideshow
Create a slideshow

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |  



A slideshow is a group of images, videos or a combination of both that are shown on the website in the form of slides. Use this API to create a slideshow.

*Success Response*



Success. Refer `SlideshowSchema` for more details.


Schema: `SlideshowSchema`






---


#### getSlideshowBySlug
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| slug | String? | A short, human-readable, URL-friendly identifier of a slideshow. You can get slug value of a page from `getSlideshows` API. |   
| devicePlatform | String? | Filter slideshows by platform. Acceptable values are: web, android, ios and all |  



Use this API to retrieve the details of a slideshow by its slug.

*Success Response*



Success. Refer `SlideshowSchema` for more details.


Schema: `SlideshowSchema`






---


#### updateSlideshow
Update a slideshow

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to the slideshow. |  



Use this API to edit the details of an existing slideshow.

*Success Response*



Success. Refer `SlideshowSchema` for more details.


Schema: `SlideshowSchema`






---


#### deleteSlideshow
Delete a slideshow

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform |   
| applicationId | String? | Numeric ID allotted to an application created within a business account. |   
| id | String? | ID allotted to the slideshow. |  



Use this API to delete an existing slideshow.

*Success Response*



Success.


Schema: `SlideshowSchema`






---


#### getSupportInformation
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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Use this API to get the contact details for customer support, including emails and phone numbers.

*Success Response*



Success. Refer `Support` for more details.


Schema: `Support`






---


#### updateSupportInformation
Update the support data of an application

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Use this API to edit the existing contact details for customer support, including emails and phone numbers.

*Success Response*



Success. Refer `Support` for more details.


Schema: `Support`






---


#### updateInjectableTag
Update a tag

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Use this API to edit the details of an existing tag. This includes the tag name, tag type (css/js), url and position of the tag.

*Success Response*



Success.


Schema: `TagsSchema`






---


#### deleteAllInjectableTags
Delete tags in application

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Use this API to delete all the existing tags at once.

*Success Response*



Success.


Schema: `TagsSchema`






---


#### getInjectableTags
Get all the tags in an application

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Use this API to get all the CSS and JS injected in the application in the form of tags.

*Success Response*



Success. Refer `TagsSchema` for more details.


Schema: `TagsSchema`






---


#### addInjectableTag
Add a tag

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



CSS and JS can be injected in the application (website) with the help of tags. Use this API to create such tags by entering the tag name, tag type (css/js), url and position of the tag.

*Success Response*



Success.


Schema: `TagsSchema`






---


#### removeInjectableTag
Remove a tag

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |  



Use this API to delete an existing tag.

*Success Response*



Success.


Schema: `TagsSchema`






---


#### editInjectableTag
Edit a tag by id

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
| companyId | String? | Numeric ID allotted to a business account on Fynd Platform. |   
| applicationId | String? | Alphanumeric ID allotted to an application created within a business account. |   
| tagId | String? | ID allotted to the tag. |  



Use this API to edit the details of an existing tag by its ID.

*Success Response*



Success.


Schema: `TagsSchema`






---



---
---


## Assignment


#### createPickupLocation


```kotlin
assignment.createPickupLocation(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Create a new Pickup point for an application.


*Success Response*



Success Response - Store Updated


Schema: `Success`






---


#### getPickupLocation


```kotlin
assignment.getPickupLocation(q: q, pageNo: pageNo, pageSize: pageSize, companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| q | String? | Search query |   
| pageNo | Int? | Request a page number |   
| pageSize | Int? | Request a page size |   
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Update list of pickup points for an application.


*Success Response*



Success Response


Schema: `PickupPointResponse`






---


#### updatePickupLocation


```kotlin
assignment.updatePickupLocation(id: id, companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Pickup Point ID |   
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Update Pickup Point for an application. Pickup Point once created
can be updated using this API. 'x-application-id'm and request body are required to trigger
a successful update.


*Success Response*



Success Response - Store Updated


Schema: `Success`






---


#### getPickupLocationById


```kotlin
assignment.getPickupLocationById(id: id, companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Pickup Point Id |   
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



This API returns Pickup point data for an id. Returns not found if no data exists for the
store id passed.


*Success Response*



Success Response


Schema: `PickupPointSchema`






---


#### createPickupConfiguration


```kotlin
assignment.createPickupConfiguration(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Create a new pickup configuration for an application id. Only one configuration can be
created per application id.


*Success Response*



Success Response - Store Updated


Schema: `Success`






---


#### getPickupConfiguration


```kotlin
assignment.getPickupConfiguration(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Let pickup configuration for an application. z-application-id is required in
the header to fetch the data.


*Success Response*



Success Response


Schema: `PickupResponse`






---


#### getAllocationConfiguration


```kotlin
assignment.getAllocationConfiguration(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Get Shipping configuration for an application. Returns the global shipping configuration
including shipping priority and default strategy, etc. Every application can have one set of
configuration each. The endpoint requires an application id to get the data.


*Success Response*



Success Response


Schema: `ShippingResponse`






---


#### createAllocationConfiguration


```kotlin
assignment.createAllocationConfiguration(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Create a new Shipping configuration for an application The configuration is for
all the stores under an application. There can be only one configuration for an
application i.e, for an application configuration can be created only once.


*Success Response*



Success Response - Store Updated


Schema: `Success`






---


#### updateAllocationConfiguration


```kotlin
assignment.updateAllocationConfiguration(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Update Shipping configuration for an application. Application configuration once created
can be updated using this API. 'x-application-id'm and request body are required to trigger
a successful update.


*Success Response*



Success Response - Store Updated


Schema: `Success`






---


#### getAllocationLocations


```kotlin
assignment.getAllocationLocations(q: q, pageNo: pageNo, pageSize: pageSize, type: type, companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| q | String? | Search query |   
| pageNo | Int? | Request a page number |   
| pageSize | Int? | Request a page size |   
| type | String? | Type can be 'standard' or 'advanced' |   
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



List Stores of an application. Two types of stores are listed,
some having allocation types as standard and others, advanced.
API has support for pagination, filter by type and search by name.


*Success Response*



Success Response


Schema: `StoreListResponse`






---


#### getAllocationLocationById


```kotlin
assignment.getAllocationLocationById(id: id, companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Store Id |   
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



This API returns store data for an id. Returns not found if no data exists for the
store id passed. The data is returned from sixspeed database which includes only the
shipping configuration of the stores including store id and app id.


*Success Response*



Success Response


Schema: `StoreResponse`






---


#### updateAllocationLocation


```kotlin
assignment.updateAllocationLocation(id: id, companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Store Id |   
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



A store configuration once created can be updated via this API. Store id in request params
and udpated request body are required to successfully update the store data.


*Success Response*



Success Response - Store Updated


Schema: `Success`






---


#### createAllocationLocation


```kotlin
assignment.createAllocationLocation(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Create a new store shipping configuratiion. The configuration is stored into the
sixspeed database. One one store data can be created for one store id. Ther can be one
default configuration and multiple non-default ones. The default is not binded with product
tags while others are required to be.


*Success Response*



Success Response - Store Updated


Schema: `Success`






---


#### getDestinationZones


```kotlin
assignment.getDestinationZones(q: q, pageNo: pageNo, pageSize: pageSize, companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| q | String? | Search query |   
| pageNo | Int? | Request a page number |   
| pageSize | Int? | Request a page size |   
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Get a list of zones created, where every zone has a unique name and id. They can be
of three different types, radius, pincode and country.


*Success Response*



Success Response


Schema: `ZoneListResponse`






---


#### postDestinationZone


```kotlin
assignment.postDestinationZone(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



This API lets you create a zone which can be used further be mapped with store
configuration rules to defined a shipping rule. Either of the three details need to
be passed, zone_detail, pincode and region.


*Success Response*



Success Response - Zone Created


Schema: `Success`






---


#### getDestinationZoneById


```kotlin
assignment.getDestinationZoneById(id: id, companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Store Id |   
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Returns zone data for the specified zone id. Id is the required parameter and returns
not found if no data is found for the passed zone id.


*Success Response*



Success Response


Schema: `ZoneSchema`






---


#### updateDestinationZone


```kotlin
assignment.updateDestinationZone(id: id, companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| id | Double? | Store Id |   
| companyId | Int? | Company Id |   
| applicationId | String? | Application Id |  



Zone once created can be updated using this API. Zone id and request body are the required
data to update a zone.


*Success Response*



Success Response - Zone Updated


Schema: `Success`






---



---
---


## Billing


#### createSubscriptionCharge
Create subscription charge

```kotlin
billing.createSubscriptionCharge(companyId: companyId, extensionId: extensionId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |   
| extensionId | String? | Extension _id |  



Register subscription charge for a seller of your extension.

*Success Response*



Success


Schema: `CreateSubscriptionResponse`






---


#### getSubscriptionCharge
Get subscription charge details

```kotlin
billing.getSubscriptionCharge(companyId: companyId, extensionId: extensionId, subscriptionId: subscriptionId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |   
| extensionId | String? | Extension _id |   
| subscriptionId | String? | Subscription charge _id |  



Get created subscription charge details

*Success Response*



Success


Schema: `EntitySubscription`






---


#### cancelSubscriptionCharge
Cancel subscription charge

```kotlin
billing.cancelSubscriptionCharge(companyId: companyId, extensionId: extensionId, subscriptionId: subscriptionId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Customer unique id. In case of company it will be company id. |   
| extensionId | String? | Extension _id |   
| subscriptionId | String? | Subscription charge _id |  



Cancel subscription and attached charges.

*Success Response*



Success


Schema: `EntitySubscription`






---


#### getInvoices
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
| companyId | String? | Customer unique id. In case of company it will be company id. |  



Get invoices.

*Success Response*



Success


Schema: `Invoices`






---


#### getInvoiceById
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
| companyId | String? | Customer unique id. In case of company it will be company id. |   
| invoiceId | String? | Invoice id |  



Get invoice by id.

*Success Response*



Success


Schema: `Invoice`






---


#### getCustomerDetail
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
| companyId | String? | Customer unique id. In case of company it will be company id. |  



Get subscription customer detail.

*Success Response*



Success


Schema: `SubscriptionCustomer`






---


#### upsertCustomerDetail
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
| companyId | String? | Customer unique id. In case of company it will be company id. |  



Upsert subscription customer detail.

*Success Response*



Success


Schema: `SubscriptionCustomer`






---


#### getSubscription
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
| companyId | String? | Customer unique id. In case of company it will be company id. |  



If subscription is active then it will return is_enabled true and return subscription object. If subscription is not active then is_enabled false and message.


*Success Response*



Success


Schema: `SubscriptionStatus`






---


#### getFeatureLimitConfig
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
| companyId | String? | Customer unique id. In case of company it will be company id. |  



Get subscription subscription limits.

*Success Response*



Success


Schema: `SubscriptionLimit`






---


#### activateSubscriptionPlan
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
| companyId | String? | Customer unique id. In case of company it will be company id. |  



It will activate subscription plan for customer

*Success Response*



Success


Schema: `SubscriptionActivateRes`






---


#### cancelSubscriptionPlan
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
| companyId | String? | Customer unique id. In case of company it will be company id. |  



It will cancel current active subscription.

*Success Response*



Success


Schema: `CancelSubscriptionRes`






---



---
---


## Communication


#### getCampaigns
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |   
| sort | HashMap<String,Any>? | To sort based on created_at |  



Get campaigns

*Success Response*



Success


Schema: `Campaigns`






---


#### createCampaign
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create campaign

*Success Response*



Success


Schema: `Campaign`






---


#### getCampaignById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Campaign id |  



Get campaign by id

*Success Response*



Success


Schema: `Campaign`






---


#### updateCampaignById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Campaign id |  



Update campaign by id

*Success Response*



Success


Schema: `Campaign`






---


#### getStatsOfCampaignById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Campaign id |  



Get stats of campaign by id

*Success Response*



Success


Schema: `GetStats`






---


#### getAudiences
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |   
| sort | HashMap<String,Any>? | To sort based on created_at |  



Get audiences

*Success Response*



Success


Schema: `Audiences`






---


#### createAudience
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create audience

*Success Response*



Success


Schema: `Audience`






---


#### getBigqueryHeaders
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Get bigquery headers

*Success Response*



Success


Schema: `BigqueryHeadersRes`






---


#### getAudienceById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Audience id |  



Get audience by id

*Success Response*



Success


Schema: `Audience`






---


#### updateAudienceById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Audience id |  



Update audience by id

*Success Response*



Success


Schema: `Audience`






---


#### getNSampleRecordsFromCsv
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Get n sample records from csv

*Success Response*



Success


Schema: `GetNRecordsCsvRes`






---


#### getEmailProviders
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |   
| sort | HashMap<String,Any>? | To sort based on created_at |  



Get email providers

*Success Response*



Success


Schema: `EmailProviders`






---


#### createEmailProvider
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create email provider

*Success Response*



Success


Schema: `EmailProvider`






---


#### getEmailProviderById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Email provider id |  



Get email provider by id

*Success Response*



Success


Schema: `EmailProvider`






---


#### updateEmailProviderById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Email provider id |  



Update email provider by id

*Success Response*



Success


Schema: `EmailProvider`






---


#### getEmailTemplates
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |   
| sort | HashMap<String,Any>? | To sort based on created_at |  



Get email templates

*Success Response*



Success


Schema: `EmailTemplates`






---


#### createEmailTemplate
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create email template

*Success Response*



Success


Schema: `EmailTemplateRes`






---


#### getSystemEmailTemplates
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |   
| sort | HashMap<String,Any>? | To sort based on created_at |  



Get system email templates

*Success Response*



Success


Schema: `SystemEmailTemplates`






---


#### getEmailTemplateById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Email template id |  



Get email template by id

*Success Response*



Success


Schema: `EmailTemplate`






---


#### updateEmailTemplateById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Email template id |  



Update email template by id

*Success Response*



Success


Schema: `EmailTemplateRes`






---


#### deleteEmailTemplateById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Email template id |  



Delete email template by id

*Success Response*



Success


Schema: `EmailTemplateDeleteSuccessRes`






---


#### getEventSubscriptions
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |   
| populate | String? | populate fields |  



Get event subscriptions

*Success Response*



Success


Schema: `EventSubscriptions`






---


#### getJobs
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |   
| sort | HashMap<String,Any>? | To sort based on created_at |  



Get jobs

*Success Response*



Success


Schema: `Jobs`






---


#### triggerCampaignJob
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Trigger campaign job

*Success Response*



Success


Schema: `TriggerJobResponse`






---


#### getJobLogs
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |   
| sort | HashMap<String,Any>? | To sort based on created_at |  



Get job logs

*Success Response*



Success


Schema: `JobLogs`






---


#### getCommunicationLogs
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageId | String? | Current page no |   
| pageSize | Int? | Current request items count |   
| sort | HashMap<String,Any>? | To sort based on _id |   
| query | HashMap<String,Any>? |  |  



Get communication logs

*Success Response*



Success


Schema: `Logs`






---


#### getSystemNotifications
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
| companyId | String? | Company id |   
| pageNo | Int? |  |   
| pageSize | Int? |  |  



Get system notifications

*Success Response*



Success


Schema: `SystemNotifications`






---


#### getSmsProviders
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |   
| sort | HashMap<String,Any>? | To sort based on created_at |  



Get sms providers

*Success Response*



Success


Schema: `SmsProviders`






---


#### createSmsProvider
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create sms provider

*Success Response*



Success


Schema: `SmsProvider`






---


#### getSmsProviderById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Sms provider id |  



Get sms provider by id

*Success Response*



Success


Schema: `SmsProvider`






---


#### updateSmsProviderById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Sms provider id |  



Update sms provider by id

*Success Response*



Success


Schema: `SmsProvider`






---


#### getSmsTemplates
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |   
| sort | HashMap<String,Any>? | To sort based on created_at |  



Get sms templates

*Success Response*



Success


Schema: `SmsTemplates`






---


#### createSmsTemplate
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |  



Create sms template

*Success Response*



Success


Schema: `SmsTemplateRes`






---


#### getSmsTemplateById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Sms template id |  



Get sms template by id

*Success Response*



Success


Schema: `SmsTemplate`






---


#### updateSmsTemplateById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Sms template id |  



Update sms template by id

*Success Response*



Success


Schema: `SmsTemplateRes`






---


#### deleteSmsTemplateById
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| id | String? | Sms template id |  



Delete sms template by id

*Success Response*



Success


Schema: `SmsTemplateDeleteSuccessRes`






---


#### getSystemSystemTemplates
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
| companyId | String? | Company id |   
| applicationId | String? | Application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |   
| sort | HashMap<String,Any>? | To sort based on created_at |  



Get system sms templates

*Success Response*



Success


Schema: `SystemSmsTemplates`






---



---
---


## Payment


#### getBrandPaymentGatewayConfig
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
| companyId | Int? | Company Id |   
| applicationId | String? | Application id |  



Get All Brand Payment Gateway Config Secret

*Success Response*



Refund Transfer Mode


Schema: `PaymentGatewayConfigResponse`






---


#### saveBrandPaymentGatewayConfig
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
| companyId | Int? | Company Id |   
| applicationId | String? | Application id |  



Save Config Secret For Brand Payment Gateway

*Success Response*



Save Config Secret For Brand Payment Gateway Success Response.


Schema: `PaymentGatewayToBeReviewed`






---


#### updateBrandPaymentGatewayConfig
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
| companyId | Int? | Company Id |   
| applicationId | String? | Application id |  



Save Config Secret For Brand Payment Gateway

*Success Response*



Save Config Secret For Brand Payment Gateway Success Response.


Schema: `PaymentGatewayToBeReviewed`






---


#### getPaymentModeRoutes
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
| companyId | Int? | Company Id |   
| applicationId | String? | Application id |   
| refresh | Boolean? |  |   
| requestType | String? |  |  



Use this API to get Get All Valid Payment Options for making payment

*Success Response*



Success


Schema: `PaymentOptionsResponse`






---


#### getAllPayouts
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
| companyId | Int? | Company Id |   
| uniqueExternalId | String? | Fetch payouts using unique external id |  



Get All Payouts

*Success Response*



payouts response object


Schema: `PayoutsResponse`






---


#### savePayout
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
| companyId | Int? | Company Id |  



Save Payout

*Success Response*



save payout response object


Schema: `PayoutResponse`






---


#### updatePayout
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
| companyId | Int? | Company Id |   
| uniqueTransferNo | String? | Unique transfer id |  



Update Payout

*Success Response*



save payout response object


Schema: `UpdatePayoutResponse`






---


#### activateAndDectivatePayout
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
| companyId | Int? | Company Id |   
| uniqueTransferNo | String? | Unique transfer id |  



Partial Update Payout

*Success Response*



save payout response object


Schema: `UpdatePayoutResponse`






---


#### deletePayout
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
| companyId | Int? | Company Id |   
| uniqueTransferNo | String? | Unique transfer id |  



Delete Payout

*Success Response*



delete payout response object


Schema: `DeletePayoutResponse`






---


#### getSubscriptionPaymentMethod
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
| companyId | Int? | Company Id |  



Get all  Subscription  Payment Method

*Success Response*



List Subscription Payment Method Response


Schema: `SubscriptionPaymentMethodResponse`






---


#### deleteSubscriptionPaymentMethod
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
| companyId | Int? | Company Id |   
| uniqueExternalId | String? |  |   
| paymentMethodId | String? |  |  



Uses this api to Delete Subscription Payment Method

*Success Response*



Delete Subscription Payment Method Response.


Schema: `DeleteSubscriptionPaymentMethodResponse`






---


#### getSubscriptionConfig
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
| companyId | Int? | Company Id |  



Get all  Subscription Config details

*Success Response*



List Subscription Config Response


Schema: `SubscriptionConfigResponse`






---


#### saveSubscriptionSetupIntent
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
| companyId | Int? | Company Id |  



Uses this api to Save Subscription Setup Intent

*Success Response*



Save Subscription Setup Intent Response.


Schema: `SaveSubscriptionSetupIntentResponse`






---


#### addBeneficiaryDetails
Save bank details for cancelled/returned order

```kotlin
payment.addBeneficiaryDetails(companyId: companyId, applicationId: applicationId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |   
| applicationId | String? | Application id |  



Use this API to save bank details for returned/cancelled order to refund amount in his account.

*Success Response*



Success


Schema: `RefundAccountResponse`






---


#### verifyIfscCode
Ifsc Code Verification

```kotlin
payment.verifyIfscCode(companyId: companyId, ifscCode: ifscCode).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |   
| ifscCode | String? |  |  



Get True/False for correct IFSC Code for adding bank details for refund

*Success Response*



Bank details on correct Ifsc Code


Schema: `IfscCodeResponse`






---


#### getUserOrderBeneficiaries
List Order Beneficiary

```kotlin
payment.getUserOrderBeneficiaries(orderId: orderId, companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| orderId | String? |  |   
| companyId | Int? | Company Id |   
| applicationId | String? | Application id |  



Get all active  beneficiary details added by the user for refund

*Success Response*



List Order Beneficiary


Schema: `OrderBeneficiaryResponse`






---


#### getUserBeneficiaries
List User Beneficiary

```kotlin
payment.getUserBeneficiaries(orderId: orderId, companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| orderId | String? |  |   
| companyId | Int? | Company Id |   
| applicationId | String? | Application id |  



Get all active  beneficiary details added by the user for refund

*Success Response*



List User Beneficiary


Schema: `OrderBeneficiaryResponse`






---



---
---


## Order


#### shipmentStatusUpdate
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
| companyId | String? | Company Id |  



Update Shipment Status

*Success Response*



Success


Schema: `UpdateShipmentStatusResponse`






---


#### activityStatus
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
| companyId | String? | Company Id |   
| bagId | String? | Bag Id |  



Get Activity Status

*Success Response*



Success


Schema: `GetActivityStatus`






---


#### storeProcessShipmentUpdate
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
| companyId | String? | Company Id |  



Update Store Process-Shipment

*Success Response*



Success


Schema: `UpdateProcessShipmenstRequestResponse`






---


#### checkRefund
Check Refund is available or not

```kotlin
order.checkRefund(companyId: companyId, shipmentId: shipmentId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| shipmentId | String? | Shipment Id |  



Check Refund is available or not

*Success Response*



Success


Schema: `HashMap<String,Any>`






---


#### getOrdersByCompanyId
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
| companyId | String? | Company Id |   
| pageNo | String? | Current page number |   
| pageSize | String? | Page limit |   
| fromDate | String? | From Date |   
| toDate | String? | To Date |   
| q | String? | Keyword for Search |   
| stage | String? | Specefic Order Stage |   
| salesChannels | String? | Selected Sales Channel |   
| orderId | String? | Order Id |   
| stores | String? | Selected Stores |   
| status | String? | Status of order |   
| shortenUrls | Boolean? | Shorten URL option |   
| filterType | String? | Filters |  



Get Orders

*Success Response*



Success


Schema: `OrderListing`






---


#### getOrderDetails
Get Order Details for company based on Company Id and Order Id

```kotlin
order.getOrderDetails(companyId: companyId, orderId: orderId, next: next, previous: previous).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| orderId | String? | Order Id |   
| next | String? | Next |   
| previous | String? | Previous |  



Get Orders

*Success Response*



Success


Schema: `OrderDetails`






---


#### getPicklistOrdersByCompanyId
Get Orders for company based on Company Id

```kotlin
order.getPicklistOrdersByCompanyId(companyId: companyId, pageNo: pageNo, pageSize: pageSize, fromDate: fromDate, toDate: toDate, q: q, stage: stage, salesChannels: salesChannels, orderId: orderId, stores: stores, status: status, shortenUrls: shortenUrls, filterType: filterType).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| pageNo | String? | Current page number |   
| pageSize | String? | Page limit |   
| fromDate | String? | From Date |   
| toDate | String? | To Date |   
| q | String? | Keyword for Search |   
| stage | String? | Specefic Order Stage |   
| salesChannels | String? | Selected Sales Channel |   
| orderId | String? | Order Id |   
| stores | String? | Selected Stores |   
| status | String? | Status of order |   
| shortenUrls | Boolean? | Shorten URL option |   
| filterType | String? | Filters |  



Get Orders

*Success Response*



Success


Schema: `OrderPicklistListing`






---


#### trackShipmentPlatform
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| shipmentId | String? | Shipment Id |  



Shipment Track

*Success Response*



Success


Schema: `PlatformShipmentTrack`






---


#### trackOrder
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| orderId | String? | Order Id |  



Order Track

*Success Response*



Success


Schema: `PlatformOrderTrack`






---


#### failedOrders
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |  



Failed Orders

*Success Response*



Success


Schema: `FailedOrders`






---


#### reprocessOrder
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| orderId | String? | Order Id |  



Order Reprocess

*Success Response*



Success


Schema: `UpdateOrderReprocessResponse`






---


#### updateShipment
Use this API to update the shipment using its shipment ID.

```kotlin
order.updateShipment(companyId: companyId, applicationId: applicationId, shipmentId: shipmentId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| shipmentId | String? | ID of the shipment. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |  



Update the shipment

*Success Response*



Success. Check the example shown below or refer `ShipmentUpdateRequest` for more details.


Schema: `ShipmentUpdateResponse`






---


#### getPlatformShipmentReasons
Use this API to retrieve the issues that led to the cancellation of bags within a shipment.

```kotlin
order.getPlatformShipmentReasons(companyId: companyId, applicationId: applicationId, action: action).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| action | String? | Action |  



Get reasons behind full or partial cancellation of a shipment

*Success Response*



Success. Check the example shown below or refer `ShipmentReasonsResponse` for more details.


Schema: `ShipmentReasonsResponse`






---


#### getShipmentTrackDetails
Use this API to track a shipment using its shipment ID.

```kotlin
order.getShipmentTrackDetails(companyId: companyId, applicationId: applicationId, orderId: orderId, shipmentId: shipmentId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| orderId | String? | ID of the order. |   
| shipmentId | String? | ID of the shipment. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |  



Track shipment

*Success Response*



Success. Check the example shown below or refer `ShipmentTrackResponse` for more details.


Schema: `ShipmentTrackResponse`






---


#### getShipmentAddress
Use this API to get address of a shipment using its shipment ID and Address Category.

```kotlin
order.getShipmentAddress(companyId: companyId, shipmentId: shipmentId, addressCategory: addressCategory).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| shipmentId | String? | ID of the shipment. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |   
| addressCategory | String? | Category of the address it falls into(billing or delivery). |  



Get Shipment Address

*Success Response*



Success. Check the example shown below or refer `GetShipmentAddressResponse` for more details.


Schema: `GetShipmentAddressResponse`






---


#### updateShipmentAddress
Use this API to update address of a shipment using its shipment ID and Address Category.

```kotlin
order.updateShipmentAddress(companyId: companyId, shipmentId: shipmentId, addressCategory: addressCategory, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id |   
| shipmentId | String? | ID of the shipment. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |   
| addressCategory | String? | Category of the address it falls into(billing or delivery). |  



Update Shipment Address

*Success Response*



Success. Check the example shown below or refer `UpdateShipmentAddressResponse` for more details.


Schema: `UpdateShipmentAddressResponse`






---


#### getPing
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
| companyId | String? | Company Id |  



Get Ping

*Success Response*



Success


Schema: `GetPingResponse`






---


#### voiceCallback
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
| companyId | String? | Company Id |  



Voice Callback

*Success Response*



Success


Schema: `GetVoiceCallbackResponse`






---


#### voiceClickToCall
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
| companyId | String? | Company Id |   
| caller | String? | Caller contact number |   
| receiver | String? | Receiver contact number |  



Voice Click to Call

*Success Response*



Success


Schema: `GetClickToCallResponse`






---



---
---


## Catalog


#### deleteSearchKeywords
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully

*Success Response*



Status object. Tells whether the operation was successful. See example below or refer `DeleteResponse`


Schema: `DeleteResponse`






---


#### updateSearchKeywords
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Update Search Keyword by its id. On successful request, returns the updated collection

*Success Response*



The Collection object. See example below or refer `GetSearchWordsDataSchema` for details.


Schema: `GetSearchWordsData`






---


#### getSearchKeywords
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. |  



Get the details of a words by its `id`. If successful, returns a Collection resource in the response body specified in `GetSearchWordsDetailResponseSchema`

*Success Response*



The Collection object. See example below or refer `GetSearchWordsDetailResponseSchema` for details


Schema: `GetSearchWordsDetailResponse`






---


#### getAllSearchKeyword
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Custom Search Keyword allows you to map conditions with keywords to give you the ultimate results

*Success Response*



List of custom search keywords. See example below or refer `GetSearchWordsResponseSchema` for details


Schema: `GetSearchWordsResponse`






---


#### createCustomKeyword
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Create a Custom Search Keywords. See `CreateSearchKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateSearchKeywordSchema`

*Success Response*



Get keyword object with id that is added. See example below or refer `GetSearchWordsDataSchema` for details


Schema: `GetSearchWordsData`






---


#### deleteAutocompleteKeyword
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully

*Success Response*



Status object. Tells whether the operation was successful. See example below or refer `DeleteResponse`


Schema: `DeleteResponse`






---


#### updateAutocompleteKeyword
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Update a mapping by it's id. On successful request, returns the updated Keyword mapping

*Success Response*



The Mapping object. See example below or refer `GetAutocompleteWordsResponseSchema` for details.


Schema: `GetAutocompleteWordsResponse`






---


#### getAutocompleteKeywordDetail
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. |  



Get the details of a words by its `id`. If successful, returns a keywords resource in the response body specified in `GetAutocompleteWordsResponseSchema`

*Success Response*



The mapping object. See example below or refer `GetAutocompleteWordsResponseSchema` for details


Schema: `GetAutocompleteWordsResponse`






---


#### getAutocompleteConfig
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Custom Autocomplete Keyword allows you to map conditions with keywords to give you the ultimate results

*Success Response*



List of custom autocomplete keywords. See example below or refer `GetAutocompleteWordsResponseSchema` for details


Schema: `GetAutocompleteWordsResponse`






---


#### createCustomAutocompleteRule
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Create a Custom Autocomplete Keywords. See `CreateAutocompleteKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateAutocompleteKeywordSchema`

*Success Response*



List of all the collections including the one you added. See example below or refer `CreateAutocompleteWordsResponseSchema` for details


Schema: `CreateAutocompleteWordsResponse`






---


#### getProductBundle
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| q | String? | A search string that is searched with product bundle name. |  



Get all product bundles for a particular company

*Success Response*



List of bundle configured for a company. See example below or refer `GetProductBundleListingResponse` for details


Schema: `GetProductBundleListingResponse`






---


#### createProductBundle
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



Create Product Bundle. See `ProductBundleRequest` for the request body parameter need to create a product bundle. On successful request, returns in `ProductBundleRequest` with id

*Success Response*



Get bundle with id that is added. See example below or refer `GetProductBundleCreateResponse` for details


Schema: `GetProductBundleCreateResponse`






---


#### updateProductBundle
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Update a Product Bundle by its id. On successful request, returns the updated product bundle

*Success Response*



The Collection object. See example below or refer `GetProductBundleCreateResponse` for details.


Schema: `GetProductBundleCreateResponse`






---


#### getProductBundleDetail
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| id | String? | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. |  



Get a particular Bundle details by its `id`. If successful, returns a Product bundle resource in the response body specified in `GetProductBundleResponse`

*Success Response*



The Collection object. See example below or refer `GetProductBundleResponse` for details


Schema: `GetProductBundleResponse`






---


#### getSizeGuides
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
| companyId | String? | Id of the company for which the size guides are to be fetched. |   
| active | Boolean? | filter size guide on basis of active, in-active |   
| q | String? | Query that is to be searched. |   
| tag | String? | to filter size guide on basis of tag. |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 10. |  



This API allows to view all the size guides associated to the seller.

*Success Response*



Size guide object. See example below or refer `ListSizeGuide` for details


Schema: `ListSizeGuide`






---


#### createSizeGuide
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
| companyId | String? | Id of the company inside which the size guide is to be created. |  



This API allows to create a size guide associated to a brand.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### updateSizeGuide
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
| companyId | String? | Id of the company. |   
| id | String? | Mongo id of the size guide to be edited |  



This API allows to edit a size guide.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### getSizeGuide
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
| companyId | String? | Id of the company associated to size guide. |   
| id | String? | Id of the size guide to be viewed. |  



This API helps to get data associated to a size guide.

*Success Response*



Brand object. See example below or refer `SizeGuideResponseSchema` for details


Schema: `SizeGuideResponse`






---


#### getCatalogConfiguration
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



configuration meta  details for catalog.

*Success Response*



configuration details for catalog. See example below or refer `GetCatalogConfigurationMetaDataSchema` for details


Schema: `GetCatalogConfigurationMetaData`






---


#### getConfigurations
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



configured details for catalog.

*Success Response*



Get application level configured catalog details. See example below or refer `GetAppCatalogConfigurationSchema` for details


Schema: `GetAppCatalogConfiguration`






---


#### createConfigurationProductListing
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Add configuration for products & listing.

*Success Response*



success flag will tell whether the operation was successful.


Schema: `GetAppCatalogConfiguration`






---


#### getConfigurationByType
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| type | String? | type can be brands, categories etc. |  



configured details for catalog.

*Success Response*



Get application level configured catalog details. See example below or refer `GetAppCatalogEntityConfigurationSchema` for details


Schema: `GetAppCatalogEntityConfiguration`






---


#### createConfigurationByType
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| type | String? | type can be brands, categories etc. |  



Add configuration for categories & brands.

*Success Response*



success flag will tell whether the operation was successful.


Schema: `GetAppCatalogConfiguration`






---


#### getQueryFilters
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Get query filters to configure a collection

*Success Response*



The attached items of an collection. See example below or refer `GetCollectionQueryOptionResponse` for details


Schema: `GetCollectionQueryOptionResponse`






---


#### getAllCollections
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



A Collection allows you to organize your products into hierarchical groups. For example, a dress might be in the category _Clothing_, the individual product might also be in the collection _Summer_. On successful request, returns all the collections as specified in `CollectionListingSchema`

*Success Response*



List of collections. See example below or refer `GetCollectionListingResponse` for details


Schema: `GetCollectionListingResponse`






---


#### createCollection
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Create a collection. See `CreateCollectionRequestSchema` for the list of attributes needed to create a collection and collections/query-options for the available options to create a collection. On successful request, returns a paginated list of collections specified in `CollectionCreateResponse`

*Success Response*



List of all the collections including the one you added. See example below or refer `CollectionCreateResponse` for details


Schema: `CollectionCreateResponse`






---


#### getCollectionDetail
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| slug | String? | A `slug` is a human readable, URL friendly unique identifier of an object. Pass the `slug` of the collection which you want to retrieve. |  



Get the details of a collection by its `slug`. If successful, returns a Collection resource in the response body specified in `CollectionDetailResponse`

*Success Response*



The Collection object. See example below or refer `CollectionDetailResponse` for details


Schema: `CollectionDetailResponse`






---


#### deleteCollection
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier of a collection. |  



Delete a collection by it's id. Returns an object that tells whether the collection was deleted successfully

*Success Response*



Status object. Tells whether the operation was successful. See example below or refer `DeleteResponse`


Schema: `DeleteResponse`






---


#### updateCollection
Update a collection

```kotlin
catalog.updateCollection(companyId: companyId, applicationId: applicationId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier of a collection. |  



Update a collection by it's id. On successful request, returns the updated collection

*Success Response*



The Collection object. See example below or refer `UpdateCollectionSchema` for details.


Schema: `UpdateCollection`






---


#### getCollectionItems
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier of a collection. |   
| sortOn | String? | Each response will contain sort_on param, which should be sent back to make pagination work. |   
| pageId | String? | Each response will contain next_id param, which should be sent back to make pagination work. |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 12. |  



Get items from a collection specified by its `id`.

*Success Response*



The attached items of an collection. See example below or refer `GetCollectionItemsResponseSchema` for details


Schema: `GetCollectionItemsResponse`






---


#### addCollectionItems
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier of a collection. |  



Adds items to a collection specified by its `id`. See `CollectionItemRequest` for the list of attributes needed to add items to an collection.

*Success Response*



Status object. Tells whether the operation was successful.


Schema: `UpdatedResponse`






---


#### getCatalogInsights
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| brand | String? | Brand slug |  



Catalog Insights api returns the count of catalog related data like products, brands, departments and categories that have been made live as per configuration of the app.

*Success Response*



Response Data


Schema: `CatalogInsightResponse`






---


#### getSellerInsights
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| sellerAppId | String? | Id of the seller application which is serving the invetory/catalog of the company |  



Analytics data of catalog and inventory that are being cross-selled.

*Success Response*



Response Data


Schema: `CrossSellingResponse`






---


#### createMarketplaceOptin
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
| companyId | Int? | The company id for which the detail needs to be retrieved. |   
| marketplace | String? | The marketplace for which the detail needs to be retrieved. |  



Use this API to create/update opt-in information for given platform. If successful, returns data in the response body as specified in `OptInPostResponseSchema`

*Success Response*



See example below or refer `UpdatedResponse` for details.


Schema: `UpdatedResponse`






---


#### getMarketplaceOptinDetail
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
| companyId | Int? |  |  



Use this API to fetch opt-in information for all the platforms. If successful, returns a logs in the response body as specified in `GetOptInPlatformSchema`

*Success Response*



See example below or refer `GetOptInPlatformSchema` for details.


Schema: `GetOptInPlatform`






---


#### getCompanyDetail
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
| companyId | Int? | The company id for which the detail needs to be retrieved. |  



Get the details of the company associated with the given company_id passed.

*Success Response*



See example below or refer `OptinCompanyDetailSchema` for details


Schema: `OptinCompanyDetail`






---


#### getCompanyBrandDetail
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
| companyId | Int? | The company id for which the detail needs to be retrieved. |   
| isActive | Boolean? | The is_active status for the optin id. |   
| q | Boolean? | The search value to filter the list. |   
| pageNo | Int? | The number of page for the company id. |   
| pageSize | Int? | Number of records that can be seen on the page for the company id. |   
| marketplace | String? | The marketplace platform associated with the company id. |  



Get the details of the Brands associated with the given company_id passed.

*Success Response*



See example below or refer `OptinCompanyBrandDetailsView` for details


Schema: `OptinCompanyBrandDetailsView`






---


#### getCompanyMetrics
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
| companyId | Int? | The company id for which the detail needs to be retrieved. |  



Get the Company metrics associated with the company ID passed.

*Success Response*



See example below or refer `OptinCompanyMetrics` for details


Schema: `OptinCompanyMetrics`






---


#### getStoreDetail
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
| companyId | Int? | The company id for which the detail needs to be retrieved. |   
| q | String? | The search related the store for the company id. |   
| pageNo | Int? | The number of page for the company id. |   
| pageSize | Int? | Number of records that can be seen on the page for the company id. |  



Get the details of the store associated with the company ID passed.

*Success Response*



See example below or refer `OptinStoreDetailsSchema` for details


Schema: `OptinStoreDetails`






---


#### getGenderAttribute
Get gender attribute details

```kotlin
catalog.getGenderAttribute(companyId: companyId, attributeSlug: attributeSlug).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | company for which you want to view the genders |   
| attributeSlug | String? | slug of the attribute for which you want to view the genders |  



This API allows to view the gender attribute details.

*Success Response*



Size guide object. See example below or refer `GenderDetailSchema` for details


Schema: `GenderDetail`






---


#### listProductTemplateCategories
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| departments | String? | A `department` is name of a departments whose category needs to be listed. Can specify multiple departments. |   
| itemType | String? | An `item_type` is the type of item, it can be `set`, `standard`, `digital`, etc. |  



Allows you to list all product categories values for the departments specified

*Success Response*



List of all categories attached to departments specified. See example below or refer `ProdcutTemplateCategoriesResponse` for details


Schema: `ProdcutTemplateCategoriesResponse`






---


#### listDepartmentsData
List all Departments

```kotlin
catalog.listDepartmentsData(companyId: companyId, pageNo: pageNo, pageSize: pageSize, name: name, search: search, isActive: isActive).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 10. |   
| name | String? | Can search departments by passing name. |   
| search | String? | Can search departments by passing name of the department in search parameter. |   
| isActive | Boolean? | Can query for departments based on whether they are active or inactive. |  



Allows you to list all departments, also can search using name and filter active and incative departments, and item type

*Success Response*



List of departments data. See example below or refer `DepartmentsResponse` for details


Schema: `DepartmentsResponse`






---


#### getDepartmentData
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| uid | String? | A `uid` is a unique identifier of a department. |  



Allows you to get department data, by uid

*Success Response*



Departments Data. See example below or refer `DepartmentsResponse` for details


Schema: `DepartmentsResponse`






---


#### listProductTemplate
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| departments | String? | A `departments` is the name of a particular department. |  



Allows you to list all product templates, also can filter by department

*Success Response*



List of product templates. See example below or refer `TemplatesResponse` for details


Schema: `TemplatesResponse`






---


#### validateProductTemplate
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| slug | String? | A `slug` is a unique identifier for a particular template. |  



Allows you to list all product templates validation values for all the fields present in the database

*Success Response*



List of fields and validation values fro each. See example below or refer `TemplatesValidationResponse` for details


Schema: `TemplatesValidationResponse`






---


#### downloadProductTemplateViews
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| slug | String? | A `slug` is a unique identifier for a particular template. |  



Allows you to download product template data

*Success Response*



CSV File of product template data. See example below or refer `TemplatesResponse` for details


Schema: `String`






---


#### downloadProductTemplateView
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| itemType | String? | An `item_type` defines the type of item. |  



Allows you to download product template data

*Success Response*



CSV File of product template data.


Schema: `String`






---


#### validateProductTemplateSchema
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| itemType | String? | An `item_type` defines the type of item. The default value is standard. |  



Allows you to list all product templates validation values for all the fields present in the database

*Success Response*



List of fields and validation values fro each. See example below or refer `InventoryValidationResponse` for details


Schema: `InventoryValidationResponse`






---


#### listHSNCodes
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



Allows you to list all hsn Codes

*Success Response*



List of all HSN Codes. See example below or refer `HSNCodesResponse` for details


Schema: `HSNCodesResponse`






---


#### listProductTemplateExportDetails
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



Can view details including trigger data, task id , etc.

*Success Response*



List of Product Downloads Data. See example below or refer `ProductDownloadsResponse` for details


Schema: `ProductDownloadsResponse`






---


#### listTemplateBrandTypeValues
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| filter | String? | A `filter` is the unique identifier of the type of value required. |  



The filter type query parameter defines what type of data to return. The type of query returns the valid values for the same

*Success Response*



See example below or refer `ProductConfigurationDownloadsSchema` for details


Schema: `ProductConfigurationDownloads`






---


#### listCategories
Get product categories list

```kotlin
catalog.listCategories(companyId: companyId, level: level, departments: departments, q: q, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| level | String? | Get category for multiple levels |   
| departments | String? | Get category for multiple departments filtered |   
| q | String? | Get multiple categories filtered by search string |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 10. |  



This API gets meta associated to product categories.

*Success Response*



Category Meta. See example below or refer `CategoryResponse` for details


Schema: `CategoryResponse`






---


#### createCategories
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



This API lets user create product categories

*Success Response*



Category Meta. See example below or refer `CategoryCreateResponse` for details


Schema: `CategoryCreateResponse`






---


#### updateCategory
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| uid | String? | Category unique id |  



Update a product category using this apu

*Success Response*



Category Meta. See example below or refer `CategoryUpdateResponse` for details


Schema: `CategoryUpdateResponse`






---


#### getCategoryData
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| uid | String? | Category unique id |  



This API gets meta associated to product categories.

*Success Response*



Get Data for one category. See example below or refer `CategoryResponse` for details


Schema: `SingleCategoryResponse`






---


#### getProducts
Get product list

```kotlin
catalog.getProducts(companyId: companyId, brandIds: brandIds, categoryIds: categoryIds, q: q, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Double? | Get list of products filtered by company Id |   
| brandIds | Double? | Get multiple products filtered by brand Ids |   
| categoryIds | Double? | Get multiple products filtered by category Ids |   
| q | String? | Get multiple products filtered by q string |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 10. |  



This API gets meta associated to products.

*Success Response*



Product Meta. See example below for details


Schema: `ProductListingResponse`






---


#### createProduct
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
| companyId | String? | Id of the company associated to product that is to be viewed. |  



This API allows to create product.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### deleteProduct
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
| companyId | String? | Company Id of the company associated to product that is to be deleted. |   
| itemId | Int? | Id of the product to be updated. |  



This API allows to delete product.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### editProduct
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
| companyId | String? | Id of the company associated to product that is to be viewed. |   
| itemId | Int? | Id of the product to be updated. |  



This API allows to edit product.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### getProduct
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
| itemCode | String? | Item code of the product. |   
| companyId | Int? | Company Id of the product. |   
| itemId | Int? | Item Id of the product. |   
| brandUid | Int? | Brand Id of the product. |   
| uid | Int? | Id of the product. |  



This API helps to get data associated to a particular product.

*Success Response*



Product object. See example below or refer `product.utils.format_product_response` for details


Schema: `Product`






---


#### getProductValidation
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
| companyId | Double? | Validates data against given company |  



This API validates product data.

*Success Response*



Validate Meta. See example below for details


Schema: `ValidateProduct`






---


#### getProductSize
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
| itemCode | String? | Item code of the product size. |   
| companyId | Int? | Company Id of the product size. |   
| itemId | Int? | Item Id of the product size. |   
| brandUid | Int? | Brand Id of the product size. |   
| uid | Int? | Id of the product size. |  



This API helps to get data associated to a particular product size.

*Success Response*



Product object. See example below for details


Schema: `ProductListingResponse`






---


#### getProductBulkUploadHistory
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
| companyId | Int? | Company Id of of which Product Bulk Upload History to be obtained. |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 12. |  



This API helps to get bulk product upload jobs data.

*Success Response*



List of bulk product upload jobs. See `BulkRequestGetSchema` for details


Schema: `ProductBulkRequestList`






---


#### updateProductAssetsInBulk
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
| companyId | Int? | Company Id in which assets to be uploaded. |  



This API helps to create a bulk asset upload job.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### deleteProductBulkJob
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
| companyId | String? | Company Id of the company associated to size that is to be deleted. |   
| batchId | Int? | Batch Id of the bulk product job to be deleted. |  



This API allows to delete bulk product job associated with company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### createProductsInBulk
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
| companyId | Int? | Company Id in which assets to be uploaded. |   
| batchId | String? | Batch Id in which assets to be uploaded. |  



This API helps to create products in bulk push to kafka for approval/creation.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### getCompanyTags
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
| companyId | Int? | Company Id of the product size. |  



This API helps to get tags data associated to a particular copmpany.

*Success Response*



Tag List. See example below for details


Schema: `ProductTagsViewResponse`






---


#### getProductAssetsInBulk
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
| companyId | Int? | Company Id of the product size. |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 12. |  



This API helps to get bulk asset jobs data associated to a particular company.

*Success Response*



List of bulk asset jobs List. See `BulkUtil.modify_batch_response` for details


Schema: `BulkAssetResponse`






---


#### createProductAssetsInBulk
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
| companyId | Int? | Company Id in which assets to be uploaded. |  



This API helps to create a bulk asset upload job.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### deleteSize
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
| companyId | String? | Company Id of the company associated to size that is to be deleted. |   
| itemId | Int? | Item Id of the product associated with size to be deleted. |   
| size | Int? | size to be deleted. |  



This API allows to delete size associated with product.

*Success Response*



Returns a success response


Schema: `ProductSizeDeleteResponse`






---


#### getInventory
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
| companyId | String? | Id of the company associated to product that is to be viewed. |   
| itemId | String? | Item code of the product of which size is to be get. |   
| size | String? | Size of which inventory is to get. |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 12. |  



This API allows get Inventory data for particular company grouped by size and store.

*Success Response*



returns a list of all inventory grouped by size and store


Schema: `InventoryResponse`






---


#### addInventory
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
| companyId | String? | Id of the company associated to product that is to be viewed. |   
| itemId | Double? | Item code of the product of which size is to be get. |   
| size | String? | Size in which inventory is to be added. |  



This API allows add Inventory for particular size and store.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### deleteInventory
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
| companyId | String? | Company Id of the company associated with Inventory that is to be deleted. |   
| itemId | Int? | Id of the product associated with Inventory to be deleted. |   
| locationId | Double? | Location ID of store of which inventory is to be deleted. |  



This API allows to delete inventory of a particular product for particular company.

*Success Response*



Returns a success response


Schema: `InventoryDelete`






---


#### getInventoryBulkUploadHistory
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
| companyId | Int? | Company Id of of which Inventory Bulk Upload History to be obtained. |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 12. |  



This API helps to get bulk Inventory upload jobs data.

*Success Response*



List of bulk Inventory upload jobs. See `BulkInventoryGetSchema` for details


Schema: `BulkInventoryGet`






---


#### createBulkInventoryJob
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
| companyId | Int? | Company Id in which Inventory to be uploaded. |  



This API helps to create a bulk Inventory upload job.

*Success Response*



Returns a success response


Schema: `CommonResponse`






---


#### deleteBulkInventoryJob
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
| companyId | String? | Company Id of the company of which bulk Inventory job is to be deleted. |  



This API allows to delete bulk Inventory job associated with company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### createBulkInventory
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
| companyId | Int? | Company Id in which Inventory is to be uploaded. |  



This API helps to create products in bulk push to kafka for approval/creation.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### getInventoryExport
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
| companyId | Int? | Company Id in which assets to be uploaded. |  



This API helps to get Inventory export history.

*Success Response*



Returns a list of inventory export jobs


Schema: `InventoryExportJob`






---


#### createInventoryExportJob
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
| companyId | Int? | Company Id in which assets to be uploaded. |  



This API helps to create a Inventory export job.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### exportInventoryConfig
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
| companyId | String? | Id of the company associated to product that is to be viewed. |   
| filterType | String? | filter type from any one of ['brand', 'store', 'type'] |  



This API allows get List of different filters like brand, store, and type for inventory export.

*Success Response*



returns filters configuration for inventory export


Schema: `InventoryConfig`






---


#### getAllHsnCodes
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
| companyId | String? | company id |   
| pageNo | Int? | page no |   
| pageSize | Int? | page size |   
| q | String? | search using hsn code. |  



Hsn Code List.

*Success Response*



List of all HSN Codes. See example below or refer `HsnCodesListingResponseSchema` for details


Schema: `HsnCodesListingResponse`






---


#### createHsnCode
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
| companyId | String? | company id |  



Create Hsn Code.

*Success Response*



See example below for details


Schema: `HsnCode`






---


#### updateHsnCode
Update Hsn Code.

```kotlin
catalog.updateHsnCode(companyId: companyId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| id | String? | Unique id |  



Update Hsn Code.

*Success Response*



See example below for details


Schema: `HsnCode`






---


#### getHsnCode
Fetch Hsn Code.

```kotlin
catalog.getHsnCode(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | company id |   
| id | String? | Unique id |  



Fetch Hsn Code.

*Success Response*



See example below details


Schema: `HsnCode`






---


#### bulkHsnCode
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
| companyId | String? | company id |  



Bulk Create or Update Hsn Code.

*Success Response*



See example below for details


Schema: `BulkHsnResponse`






---


#### getApplicationBrands
List all the brands

```kotlin
catalog.getApplicationBrands(companyId: companyId, applicationId: applicationId, department: department, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| department | String? | The name of the department. Use this parameter to filter products by a particular department. See below the list of available departments. You can retrieve available departments from the **v1.0/departments/** API |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 12. |  



A brand is the name under which a product is being sold. Use this API to list all the brands. You can pass optionally filter the brands by the department. If successful, returns a paginated list of brands specified in `BrandListingResponse`

*Success Response*



List of Brands. See example below or refer `BrandListingResponse` for details


Schema: `BrandListingResponse`






---


#### getDepartments
List all the departments

```kotlin
catalog.getDepartments(companyId: companyId, applicationId: applicationId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |  



Departments are a way to categorise similar products. A product can lie in multiple departments. For example, a skirt can below to the 'Women's Fashion' Department while a handbag can lie in 'Women's Accessories' Department. Use this API to list all the departments. If successful, returns the list of departments specified in `DepartmentResponse`

*Success Response*



List of Departments. See example below or refer `DepartmentResponse` for details.


Schema: `DepartmentResponse`






---


#### getCategories
List all the categories

```kotlin
catalog.getCategories(companyId: companyId, applicationId: applicationId, department: department).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| department | String? | The name of the department. Use this parameter to filter products by a particular department. See below the list of available departments. You can retrieve available departments from the **v1.0/departments/** API |  



List all the categories. You can optionally pass filter the brands by the department. If successful, returns a paginated list of brands specified in `CategoryListingResponse`

*Success Response*



List of Categories. See example below or refer `CategoryListingResponse` for details.


Schema: `CategoryListingResponse`






---


#### getAppicationProducts
List the products

```kotlin
catalog.getAppicationProducts(companyId: companyId, applicationId: applicationId, q: q, f: f, filters: filters, sortOn: sortOn, pageId: pageId, pageSize: pageSize, pageNo: pageNo, pageType: pageType).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| q | String? | The search query. This can be a partial or complete name of a either a product, brand or category |   
| f | String? | The search filter parameters. All the parameter filtered from filter parameters will be passed in **f** parameter in this format. **?f=brand:voi-jeans||and:::category:t-shirts||shirts** |   
| filters | Boolean? | Pass `filters` parameter to fetch the filter details. This flag is used to fetch all filters |   
| sortOn | String? | The order to sort the list of products on. The supported sort parameters are popularity, price, redemption and discount in either ascending or descending order. See the supported values below. |   
| pageId | String? | Each response will contain **page_id** param, which should be sent back to make pagination work. |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 12. |   
| pageNo | Int? | If page_type is number then pass it to fetch page items. Default is 1. |   
| pageType | String? | For pagination type should be cursor or number. Default is cursor. |  



List all the products associated with a brand, collection or category in a requested sort order. The API additionally supports arbitrary search queries that may refer the name of any product, brand, category or collection. If successful, returns a paginated list of products specified in `ApplicationProductListingResponse`

*Success Response*



List of Products. See example below or refer `ApplicationProductListingResponse` for details


Schema: `ApplicationProductListingResponse`






---


#### getProductDetailBySlug
Get a product

```kotlin
catalog.getProductDetailBySlug(companyId: companyId, applicationId: applicationId, slug: slug).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| slug | String? | The unique identifier of a product. i.e; `slug` of a product. You can retrieve these from the APIs that list products like **v1.0/products/** |  



Products are the core resource of an application. Products can be associated by categories, collections, brands and more. This API retrieves the product specified by the given **slug**. If successful, returns a Product resource in the response body specified in `ProductDetail`

*Success Response*



The Product object. See example below or refer `ProductDetail` for details.


Schema: `ProductDetail`






---



---
---


## CompanyProfile


#### updateCompany
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



This API allows to edit the company profile of the seller account.

*Success Response*



Returns a success message


Schema: `SuccessResponse`






---


#### cbsOnboardGet
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



This API allows to view the company profile of the seller account.

*Success Response*



Company profile object. See example below or refer `GetCompanyProfileSerializerResponse` for details


Schema: `GetCompanyProfileSerializerResponse`






---


#### getCompanyMetrics
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



This API allows to view the company metrics, i.e. the status of its brand and stores. Also its allows to view the number of products, company documents & store documents which are verified and unverified.

*Success Response*



Metrics response object. See example below or refer `MetricsSerializer` for details


Schema: `MetricsSerializer`






---


#### editBrand
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
| companyId | String? | Id of the company associated to brand that is to be viewed. |   
| brandId | String? | Id of the brand to be viewed. |  



This API allows to edit meta of a brand.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### getBrand
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
| companyId | String? | Id of the company associated to brand that is to be viewed. |   
| brandId | String? | Id of the brand to be viewed. |  



This API helps to get data associated to a particular brand.

*Success Response*



Brand object. See example below or refer `GetBrandResponseSerializer` for details


Schema: `GetBrandResponseSerializer`






---


#### createBrand
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
| companyId | String? | Id of the company. |  



This API allows to create a brand associated to a company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### createCompanyBrandMapping
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
| companyId | String? | Id of the company inside which the brand is to be mapped. |  



This API allows to create a company brand mapping, for a already existing brand in the system.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### getBrands
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
| companyId | String? | Id of the company. |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 10. |  



This API helps to get view brands associated to a particular company.

*Success Response*



Brand object. See example below or refer `CompanyBrandListSerializer` for details


Schema: `CompanyBrandListSerializer`






---


#### createLocation
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
| companyId | String? | Id of the company inside which the location is to be created. |  



This API allows to create a location associated to a company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### getLocations
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
| companyId | String? | Id of the company whose locations are to fetched |   
| storeType | String? | Helps to sort the location list on the basis of location type. |   
| q | String? | Query that is to be searched. |   
| stage | String? | to filter companies on basis of verified or unverified companies. |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 10. |  



This API allows to view all the locations asscoiated to a company.

*Success Response*



Company profile object. See example below or refer `LocationListSerializer` for details


Schema: `LocationListSerializer`






---


#### updateLocation
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
| companyId | String? | Id of the company inside which the location is to be created. |   
| locationId | String? | Id of the location which you want to edit. |  



This API allows to edit a location associated to a company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---


#### getLocationDetail
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
| companyId | String? | Id of the company inside which the location lies. |   
| locationId | String? | Id of the location which you want to view. |  



This API helps to get data associated to a specific location.

*Success Response*



Brand object. See example below or refer `GetLocationSerializer` for details


Schema: `GetLocationSerializer`






---


#### createLocationBulk
Create a location asscoiated to a company in bulk.

```kotlin
companyprofile.createLocationBulk(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Id of the company inside which the location is to be created. |  



This API allows to create a location associated to a company.

*Success Response*



Returns a success response


Schema: `SuccessResponse`






---



---
---


## FileStorage


#### startUpload
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
| namespace | String? | bucket name |   
| companyId | Int? | company_id |  



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


*Success Response*



Success


Schema: `StartResponse`






---


#### completeUpload
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
| namespace | String? | bucket name |   
| companyId | Int? | company_id |  



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


*Success Response*



Success


Schema: `CompleteResponse`






---


#### appStartUpload
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
| namespace | String? | bucket name |   
| companyId | Int? | company_id |   
| applicationId | String? | application id |  



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


*Success Response*



Success


Schema: `StartResponse`






---


#### appCompleteUpload
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
| namespace | String? | bucket name |   
| companyId | Int? | company_id |   
| applicationId | String? | application id |  



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


*Success Response*



Success


Schema: `CompleteResponse`






---


#### getSignUrls
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
| companyId | Int? | company_id |  



Describe here

*Success Response*



Success


Schema: `SignUrlResponse`






---


#### copyFiles
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
| sync | Boolean? | sync |   
| companyId | Int? | company_id |  



Copy Files

*Success Response*



Success


Schema: `BulkResponse`






---


#### appCopyFiles
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
| sync | Boolean? | sync |   
| companyId | Int? | company_id |   
| applicationId | Int? | application_id |  



Copy Files

*Success Response*



Success


Schema: `BulkResponse`






---


#### browse
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
| namespace | String? | bucket name |   
| companyId | Int? | company_id |   
| pageNo | Int? | page no |  



Browse Files

*Success Response*



Success


Schema: `BrowseResponse`






---


#### browse
Browse Files

```kotlin
filestorage.browse(namespace: namespace, companyId: companyId, applicationId: applicationId, pageNo: pageNo).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| namespace | String? | bucket name |   
| companyId | Int? | company_id |   
| applicationId | Int? | application_id |   
| pageNo | Int? | page no |  



Browse Files

*Success Response*



Success


Schema: `BrowseResponse`






---


#### proxy
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
| companyId | Int? | company_id |   
| url | String? | url |  



Proxy

*Success Response*



Success


Schema: `String`






---



---
---


## Share


#### createShortLink
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |  



Create short link

*Success Response*



Success


Schema: `ShortLinkRes`






---


#### getShortLinks
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| pageNo | Int? | Current page number |   
| pageSize | Int? | Current page size |   
| createdBy | String? | Short link creator |   
| active | String? | Short link active status |   
| q | String? | Search text for original and short url |  



Get short links

*Success Response*



Success


Schema: `ShortLinkList`






---


#### getShortLinkByHash
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| hash | String? | Hash of short url |  



Get short link by hash

*Success Response*



Success


Schema: `ShortLinkRes`






---


#### updateShortLinkById
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| id | String? | Short link document identifier |  



Update short link by id

*Success Response*



Success


Schema: `ShortLinkRes`






---



---
---


## Inventory


#### getJobsByCompany
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
| companyId | Int? | Company Id |   
| pageNo | Int? | Page Number |   
| pageSize | Int? | Page Size |  



REST Endpoint that returns all job configs for a company

*Success Response*



Successful operation


Schema: `ResponseEnvelopeListJobConfigRawDTO`






---


#### updateJob
Updates An Existing Job Config

```kotlin
inventory.updateJob(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |  



REST Endpoint that updates a job config

*Success Response*




---


#### createJob
Creates A New Job Config

```kotlin
inventory.createJob(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |  



REST Endpoint that creates a new job config

*Success Response*



Job Config Created Successfully


Schema: `ResponseEnvelopeString`






---


#### getJobByCompanyAndIntegration
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
| companyId | Int? | Company Id |   
| integrationId | String? | Integration Id |   
| pageNo | Int? | Page Number |   
| pageSize | Int? | Page Size |  



REST Endpoint that returns all job configs by company And integration

*Success Response*



Successful operation


Schema: `ResponseEnvelopeListJobConfigDTO`






---


#### getJobConfigDefaults
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
| companyId | Int? | Company Id |  



REST Endpoint that returns default fields job configs by company And integration

*Success Response*



Successful operation


Schema: `ResponseEnvelopeJobConfigDTO`






---


#### getJobByCode
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
| companyId | Int? | Company Id |   
| code | String? | Job Code |  



REST Endpoint that returns job config by code

*Success Response*



Successful operation


Schema: `ResponseEnvelopeJobConfigDTO`






---


#### getJobCodeMetrics
Get Job Metrics

```kotlin
inventory.getJobCodeMetrics(companyId: companyId, code: code, pageNo: pageNo, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | Company Id |   
| code | String? | Code |   
| pageNo | Int? | Page Number |   
| pageSize | Int? | Page Size |  



REST Endpoint that returns Inventory Run History For A Job Code

*Success Response*



Successful operation


Schema: `ResponseEnvelopeJobMetricsDto`






---


#### getJobCodesByCompanyAndIntegration
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
| companyId | Int? | Company Id |   
| integrationId | String? | Integration Id |   
| pageNo | Int? | Page Number |   
| pageSize | Int? | Page Size |  



REST Endpoint that returns all job codes by company And integration

*Success Response*



Successful operation


Schema: `ResponseEnvelopeListJobConfigListDTO`






---



---
---


## Configuration


#### getBuildConfig
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| platformType | String? | Current platform name |  



Get latest build config

*Success Response*



Success


Schema: `MobileAppConfiguration`






---


#### updateBuildConfig
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| platformType | String? | Current platform name |  



Update build config for next build

*Success Response*



Success


Schema: `MobileAppConfiguration`






---


#### getPreviousVersions
Get previous build versions

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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| platformType | String? | Current platform name |  



Get previous build versions

*Success Response*



Success


Schema: `BuildVersionHistory`






---


#### getAppFeatures
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get features of application

*Success Response*



Success


Schema: `AppFeatureResponse`






---


#### updateAppFeatures
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Update features of application

*Success Response*



Success


Schema: `AppFeature`






---


#### getAppBasicDetails
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get basic application details like name

*Success Response*



Success


Schema: `ApplicationDetail`






---


#### updateAppBasicDetails
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Add or update application's basic details

*Success Response*



Success


Schema: `ApplicationDetail`






---


#### getAppContactInfo
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get Application Current Information. This includes information about social links, address and contact information of company/seller/brand of the application.

*Success Response*



Success


Schema: `ApplicationInformation`






---


#### updateAppContactInfo
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Save Application Current Information. This includes information about social links, address and contact information of an application.

*Success Response*



Success


Schema: `ApplicationInformation`






---


#### getAppApiTokens
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get social tokens.

*Success Response*



Success


Schema: `TokenResponse`






---


#### updateAppApiTokens
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Add social tokens.

*Success Response*



Success


Schema: `TokenResponse`






---


#### getAppCompanies
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |  



Application inventory enabled companies.

*Success Response*



Success


Schema: `CompaniesResponse`






---


#### getAppStores
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |  



Application inventory enabled stores.

*Success Response*



Success


Schema: `StoresResponse`






---


#### getInventoryConfig
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get application configuration for various features and data

*Success Response*



Success


Schema: `ApplicationInventory`






---


#### updateInventoryConfig
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Update application configuration for various features and data

*Success Response*



Success


Schema: `ApplicationInventory`






---


#### partiallyUpdateInventoryConfig
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Partially update application configuration for various features and data

*Success Response*



Success


Schema: `ApplicationInventory`






---


#### getAppCurrencyConfig
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get application enabled currency list

*Success Response*



Success


Schema: `AppSupportedCurrency`






---


#### updateAppCurrencyConfig
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Add initial application supported currency for various features and data. Default INR will be enabled.

*Success Response*



Success


Schema: `AppSupportedCurrency`






---


#### getOrderingStoresByFilter
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |  



Get ordering store by filter

*Success Response*



Success


Schema: `OrderingStores`






---


#### updateOrderingStoreConfig
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Add/Update ordering store config.

*Success Response*



Success


Schema: `DeploymentMeta`






---


#### getDomains
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get attached domain list.

*Success Response*



Success


Schema: `DomainsResponse`






---


#### addDomain
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Add new domain to application.

*Success Response*



Success


Schema: `Domain`






---


#### removeDomainById
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| id | String? | Domain _id |  



Remove attached domain.

*Success Response*



Success


Schema: `SuccessMessageResponse`






---


#### changeDomainType
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Change a domain to Primary or Shortlink domain

*Success Response*



Success


Schema: `DomainsResponse`






---


#### getDomainStatus
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get domain connected status. Check if domain is live and mapped to appropriate IP to fynd servers.

*Success Response*



Success


Schema: `DomainStatusResponse`






---


#### createApplication
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
| companyId | String? | Current company id |  



Create new application

*Success Response*



Success


Schema: `CreateAppResponse`






---


#### getApplications
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
| companyId | String? | Current company id |   
| pageNo | Int? |  |   
| pageSize | Int? |  |   
| q | String? | Url encoded object used as mongodb query |  



Get list of application under company

*Success Response*



Success


Schema: `ApplicationsResponse`






---


#### getApplicationById
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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |  



Get application data from id

*Success Response*



Success


Schema: `Application`






---


#### getCurrencies
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
| companyId | String? | Current company id |  



Get all currencies

*Success Response*



Currencies Success response


Schema: `CurrenciesResponse`






---


#### getDomainAvailibility
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
| companyId | String? | Current company id |  



Check domain availibility before linking to application. Also sends domain suggestions with similar to queried domain. \ Custom domain search is currently powered by GoDaddy provider.

*Success Response*



Success


Schema: `DomainSuggestionsResponse`






---


#### getIntegrationById
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
| companyId | String? | Current company id |   
| id | Int? | Integration id |  



Get integration data

*Success Response*



Success


Schema: `Integration`






---


#### getAvailableOptIns
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
| companyId | String? | Current company id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |  



Get all available integration opt-ins

*Success Response*



Success


Schema: `GetIntegrationsOptInsResponse`






---


#### getSelectedOptIns
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
| companyId | String? | Current company id |   
| level | String? | Integration level |   
| uid | Int? | Integration level uid |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |  



Get company/store level integration opt-ins

*Success Response*



Success


Schema: `GetIntegrationsOptInsResponse`






---


#### getIntegrationLevelConfig
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
| companyId | String? | Current company id |   
| id | String? | Integration id |   
| level | String? | Integration level |   
| opted | Boolean? | Filter on opted stores |   
| checkPermission | Boolean? | Filter on if permissions are present |  



Get integration level config

*Success Response*



Success


Schema: `IntegrationConfigResponse`






---


#### getIntegrationByLevelId
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
| companyId | String? | Current company id |   
| id | String? | Integration id |   
| level | String? | Integration level |   
| uid | Int? | Integration level uid |  



Get level data for integration

*Success Response*



Success


Schema: `IntegrationLevel`






---


#### getLevelActiveIntegrations
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
| companyId | String? | Current company id |   
| id | String? | Integration id |   
| level | String? | Integration level |   
| uid | Int? | Integration level uid |  



API checks if a store is already opted in any other integrations

*Success Response*



Success


Schema: `OptedStoreIntegration`






---


#### getBrandsByCompany
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
| companyId | String? | Current company id |   
| q | String? | Search text for brand name |  



Get brands by company

*Success Response*



Success


Schema: `BrandsByCompanyResponse`






---


#### getCompanyByBrands
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
| companyId | String? | Current company id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |  



Get company by brand uids

*Success Response*



Success


Schema: `CompanyByBrandsResponse`






---


#### getStoreByBrands
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
| companyId | String? | Current company id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |  



Get stores by brand uids

*Success Response*



Success


Schema: `StoreByBrandsResponse`






---


#### getOtherSellerApplications
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
| companyId | String? | Current company id |   
| pageNo | Int? | Current page no |   
| pageSize | Int? | Current request items count |  



Get other seller applications who has opted current company as inventory

*Success Response*



Success


Schema: `OtherSellerApplications`






---


#### getOtherSellerApplicationById
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
| companyId | String? | Current company id |   
| id | String? | Application Id |  



Get other seller application

*Success Response*



Success


Schema: `OptedApplicationResponse`






---


#### optOutFromApplication
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
| companyId | String? | Current company id |   
| id | String? | Application Id |  



Opt out company or store from other seller application

*Success Response*



Success


Schema: `SuccessMessageResponse`






---



---
---


## Cart


#### getCoupons
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
| companyId | String? | Current company id |   
| applicationId | String? | Current Application _id |   
| pageNo | Int? |  |   
| pageSize | Int? |  |   
| isArchived | Boolean? |  |   
| title | String? |  |   
| isPublic | Boolean? |  |   
| isDisplay | Boolean? |  |   
| typeSlug | String? |  |   
| code | String? |  |  



Get coupon list with pagination

*Success Response*



Coupon List for sent page_size and page_no


Schema: `CouponsResponse`






---


#### createCoupon
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
| companyId | String? | Current company id |   
| applicationId | String? | Current Application _id |  



Create new coupon

*Success Response*




---


#### getCouponById
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
| companyId | String? | Current company id |   
| applicationId | String? | Current Application _id |   
| id | String? |  |  



Get single coupon details with `id` in path param

*Success Response*



Coupon object for sent `id`


Schema: `CouponUpdate`






---


#### updateCoupon
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
| companyId | String? | Current company id |   
| applicationId | String? | Current Application _id |   
| id | String? |  |  



Update coupon with id sent in `id`

*Success Response*



Coupon updated successfully


Schema: `SuccessMessage`






---


#### updateCouponPartially
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
| companyId | String? | Current company id |   
| applicationId | String? | Current Application _id |   
| id | String? |  |  



Update archive/unarchive and change schedule for coupon

*Success Response*



Coupon updated successfully


Schema: `SuccessMessage`






---



---
---


## Rewards


#### getGiveaways
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| pageId | String? | pagination page id |   
| pageSize | Int? | pagination page size |  



List of giveaways of the current application.

*Success Response*



ok


Schema: `GiveawayResponse`






---


#### createGiveaway
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
| companyId | String? | company id |   
| applicationId | String? | application id |  



Adds a new giveaway.

*Success Response*



ok


Schema: `Giveaway`






---


#### getGiveawayByID
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | Giveaway ID |  



Get giveaway by ID.

*Success Response*



ok


Schema: `Giveaway`






---


#### updateGiveaway
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| id | String? | Giveaway ID |  



Updates the giveaway by it's ID.

*Success Response*



ok


Schema: `Giveaway`






---


#### getOffers
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
| companyId | String? | company id |   
| applicationId | String? | application id |  



List of offer of the current application.

*Success Response*



ok


Schema: `ArrayList<Offer>`






---


#### getOfferByName
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| cookie | String? | User's session cookie. This cookie is set in browser cookie when logged-in to fynd's authentication system i.e. `Grimlock` or by using grimlock-backend SDK for backend implementation. |   
| name | String? | Offer name |  



Get offer by name.

*Success Response*



ok


Schema: `Offer`






---


#### updateOfferByName
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| name | String? | Offer name |  



Updates the offer by name.

*Success Response*



ok


Schema: `Offer`






---


#### getUserAvailablePoints
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| userId | String? | user id |  



User's reward details.

*Success Response*



ok


Schema: `UserRes`






---


#### updateUserStatus
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| userId | String? | user id |  



Update user status, active/archive

*Success Response*



Success


Schema: `AppUser`






---


#### getUserPointsHistory
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
| companyId | String? | company id |   
| applicationId | String? | application id |   
| userId | String? | user id |   
| pageId | String? | PageID is the ID of the requested page. For first request it should be kept empty. |   
| pageLimit | Int? | PageLimit is the number of requested items in response. |   
| pageSize | Int? | PageSize is the number of requested items in response. |  



Get list of points transactions.
The list of points history is paginated.

*Success Response*



ok


Schema: `HistoryRes`






---



---
---


## Analytics


#### getStatiscticsGroups
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |  



Get statistics groups

*Success Response*



Success


Schema: `StatsGroups`






---


#### getStatiscticsGroupComponents
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| groupName | String? | Group name |  



Get statistics group components

*Success Response*



Success


Schema: `StatsGroupComponents`






---


#### getComponentStatsCSV
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| componentName | String? | Component name |  



Get component statistics csv

*Success Response*



Success


Schema: `String`






---


#### getComponentStatsPDF
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| componentName | String? | Component name |  



Get component statistics pdf

*Success Response*



Success


Schema: `String`






---


#### getComponentStats
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| componentName | String? | Component name |  



Get component statistics

*Success Response*



Success


Schema: `StatsRes`






---


#### getAbandonCartList
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| fromDate | String? | From date |   
| toDate | String? | To date |   
| pageNo | Int? | Current page number |   
| pageSize | Int? | Current page size |  



Get abandon carts list

*Success Response*



Success


Schema: `AbandonCartsList`






---


#### getAbandonCartsCSV
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| fromDate | String? | From date |   
| toDate | String? | To date |  



Get abandon carts csv

*Success Response*



Success


Schema: `String`






---


#### getAbandonCartDetail
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
| companyId | String? | Company Id |   
| applicationId | String? | Application Id |   
| cartId | String? | Cart Id |  



Get abandon cart details

*Success Response*



Success


Schema: `AbandonCartDetail`






---


#### createExportJob
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
| companyId | String? | Company Id |   
| exportType | String? | Export type / format |  



Create data export job in required format

*Success Response*



Success


Schema: `ExportJobRes`






---


#### getExportJobStatus
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
| companyId | String? | Company Id |   
| exportType | String? | Export type / format |   
| jobId | String? | Export job id |  



Get data export job status

*Success Response*



Success


Schema: `ExportJobStatusRes`






---


#### getLogsList
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
| companyId | String? | Company Id |   
| logType | String? | Log type |   
| pageNo | Int? | Current page number |   
| pageSize | Int? | Current page size |  



Get logs list

*Success Response*



Success


Schema: `GetLogsListRes`






---


#### searchLogs
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
| companyId | String? | Company Id |   
| pageNo | Int? | Current page number |   
| pageSize | Int? | Current page size |   
| logType | String? | Log type |  



Search logs

*Success Response*



Success


Schema: `SearchLogRes`






---



---
---


## Discount


#### getDiscounts
Fetch discount list.

```kotlin
discount.getDiscounts(companyId: companyId, view: view, q: q, pageNo: pageNo, pageSize: pageSize, archived: archived, month: month, year: year, type: type, appIds: appIds).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | company_id |   
| view | String? | listing or calender.  Default is listing. |   
| q | String? | The search query. This can be a partial or complete name of a discount. |   
| pageNo | Int? | page number. Default is 1. |   
| pageSize | Int? | page size. Default is 12. |   
| archived | Boolean? | archived. Default is false. |   
| month | Int? | month. Default is current month. |   
| year | Int? | year. Default is current year. |   
| type | String? | basic or custom. |   
| appIds | ArrayList<String>? | application ids. |  



Fetch discount list.

*Success Response*



Success


Schema: `ListOrCalender`






---


#### createDiscount
Create Discount.

```kotlin
discount.createDiscount(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | company_id |  



Create Discount.

*Success Response*



Success


Schema: `DiscountJob`






---


#### getDiscount
Fetch discount.

```kotlin
discount.getDiscount(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | company_id |   
| id | String? | unique id. |  



Fetch discount.

*Success Response*



Success


Schema: `DiscountJob`






---


#### updateDiscount
Create Discount.

```kotlin
discount.updateDiscount(companyId: companyId, id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | company_id |   
| id | String? | id |  



Create Discount.

*Success Response*



Success


Schema: `DiscountJob`






---


#### validateDiscountFile
Validate File.

```kotlin
discount.validateDiscountFile(companyId: companyId, discount: discount, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | company_id |   
| discount | String? | discount |  



Validate File.

*Success Response*



Success


Schema: `FileJobResponse`






---


#### downloadDiscountFile
Validate File.

```kotlin
discount.downloadDiscountFile(companyId: companyId, type: type, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | company_id |   
| type | String? | type |  



Validate File.

*Success Response*



Success


Schema: `FileJobResponse`






---


#### getValidationJob
Validate File Job.

```kotlin
discount.getValidationJob(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | company_id |   
| id | String? | id |  



Validate File Job.

*Success Response*



Success


Schema: `FileJobResponse`






---


#### cancelValidationJob
Cancel Validation Job.

```kotlin
discount.cancelValidationJob(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | company_id |   
| id | String? | id |  



Cancel Validation Job.

*Success Response*



Success


Schema: `CancelJobResponse`






---


#### getDownloadJob
Download File Job.

```kotlin
discount.getDownloadJob(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | company_id |   
| id | String? | id |  



Download File Job.

*Success Response*



Success


Schema: `FileJobResponse`






---


#### cancelDownloadJob
Cancel Download Job.

```kotlin
discount.cancelDownloadJob(companyId: companyId, id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | Int? | company_id |   
| id | String? | id |  



Cancel Download Job.

*Success Response*



Success


Schema: `CancelJobResponse`






---



---
---


## Partner


#### addProxyPath
Add proxy path for external url

```kotlin
partner.addProxyPath(companyId: companyId, applicationId: applicationId, extensionId: extensionId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| extensionId | String? | Extension id |  



Add proxy path for external url

*Success Response*



Success


Schema: `AddProxyResponse`






---


#### removeProxyPath
Remove proxy path for external url

```kotlin
partner.removeProxyPath(companyId: companyId, applicationId: applicationId, extensionId: extensionId, attachedPath: attachedPath).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| extensionId | String? | Extension id |   
| attachedPath | String? | Attachaed path slug |  



Remove proxy path for external url

*Success Response*




---



---
---


## Webhook


#### getSubscribersByCompanyAndEventId
Get Subscribers By Company And Event

```kotlin
webhook.getSubscribersByCompanyAndEventId(pageNo: pageNo, pageSize: pageSize, companyId: companyId, eventId: eventId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| pageNo | Int? | Page Number |   
| pageSize | Int? | Page Size |   
| companyId | String? | Company ID of the application |   
| eventId | Int? | Event Id of the application |  



Get Subscribers By Company And Event

*Success Response*



Success


Schema: `SubscriberConfigList`






---


#### registerSubscriberToEvent
Register Subscriber

```kotlin
webhook.registerSubscriberToEvent(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company Id of the application |  



Register Subscriber

*Success Response*



Success


Schema: `SubscriberConfig`






---


#### updateSubscriberConfig
Update Subscriber

```kotlin
webhook.updateSubscriberConfig(companyId: companyId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```

| Argument  |  Type  | Description |
| --------- | ----  | --- | 
| companyId | String? | Company ID of the application |  



Update Subscriber

*Success Response*



Success


Schema: `SubscriberConfig`






---



---
---
