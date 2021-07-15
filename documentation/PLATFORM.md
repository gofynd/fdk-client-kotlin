

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

### Classes and Methods


* ## [Common](#Common)
  * [Common#getLocations](#commongetlocations)
 
* ## [Lead](#Lead)
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
 
* ## [Feedback](#Feedback)
  * [Feedback#getAttributes](#feedbackgetattributes)
  * [Feedback#getCustomerReviews](#feedbackgetcustomerreviews)
  * [Feedback#updateApprove](#feedbackupdateapprove)
  * [Feedback#getHistory](#feedbackgethistory)
  * [Feedback#getApplicationTemplates](#feedbackgetapplicationtemplates)
  * [Feedback#createTemplate](#feedbackcreatetemplate)
  * [Feedback#getTemplateById](#feedbackgettemplatebyid)
  * [Feedback#updateTemplate](#feedbackupdatetemplate)
  * [Feedback#updateTemplateStatus](#feedbackupdatetemplatestatus)
 
* ## [Theme](#Theme)
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
 
* ## [User](#User)
  * [User#getCustomers](#usergetcustomers)
  * [User#searchUsers](#usersearchusers)
  * [User#createUser](#usercreateuser)
  * [User#updateUser](#userupdateuser)
  * [User#createUserSession](#usercreateusersession)
  * [User#getPlatformConfig](#usergetplatformconfig)
  * [User#updatePlatformConfig](#userupdateplatformconfig)
 
* ## [Content](#Content)
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
 
* ## [Assignment](#Assignment)
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
 
* ## [Billing](#Billing)
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
 
* ## [Communication](#Communication)
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
 
* ## [Payment](#Payment)
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
 
* ## [Order](#Order)
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
 
* ## [Catalog](#Catalog)
  * [Catalog#updateSearchKeywords](#catalogupdatesearchkeywords)
  * [Catalog#getSearchKeywords](#cataloggetsearchkeywords)
  * [Catalog#deleteSearchKeywords](#catalogdeletesearchkeywords)
  * [Catalog#createCustomKeyword](#catalogcreatecustomkeyword)
  * [Catalog#getAllSearchKeyword](#cataloggetallsearchkeyword)
  * [Catalog#updateAutocompleteKeyword](#catalogupdateautocompletekeyword)
  * [Catalog#getAutocompleteKeywordDetail](#cataloggetautocompletekeyworddetail)
  * [Catalog#deleteAutocompleteKeyword](#catalogdeleteautocompletekeyword)
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
  * [Catalog#updateCollection](#catalogupdatecollection)
  * [Catalog#deleteCollection](#catalogdeletecollection)
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
  * [Catalog#createCategories](#catalogcreatecategories)
  * [Catalog#listCategories](#cataloglistcategories)
  * [Catalog#updateCategory](#catalogupdatecategory)
  * [Catalog#getCategoryData](#cataloggetcategorydata)
  * [Catalog#createProduct](#catalogcreateproduct)
  * [Catalog#getProducts](#cataloggetproducts)
  * [Catalog#editProduct](#catalogeditproduct)
  * [Catalog#getProduct](#cataloggetproduct)
  * [Catalog#deleteProduct](#catalogdeleteproduct)
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
  * [Catalog#getInventoryBySize](#cataloggetinventorybysize)
  * [Catalog#getInventoryBySizeIdentifier](#cataloggetinventorybysizeidentifier)
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
  * [Catalog#getApplicationBrands](#cataloggetapplicationbrands)
  * [Catalog#getDepartments](#cataloggetdepartments)
  * [Catalog#getCategories](#cataloggetcategories)
  * [Catalog#getAppicationProducts](#cataloggetappicationproducts)
  * [Catalog#getProductDetailBySlug](#cataloggetproductdetailbyslug)
 
* ## [CompanyProfile](#CompanyProfile)
  * [CompanyProfile#cbsOnboardGet](#companyprofilecbsonboardget)
  * [CompanyProfile#updateCompany](#companyprofileupdatecompany)
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
  * [CompanyProfile#createLocationBulk](#companyprofilecreatelocationbulk)
 
* ## [FileStorage](#FileStorage)
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
 
* ## [Share](#Share)
  * [Share#createShortLink](#sharecreateshortlink)
  * [Share#getShortLinks](#sharegetshortlinks)
  * [Share#getShortLinkByHash](#sharegetshortlinkbyhash)
  * [Share#updateShortLinkById](#shareupdateshortlinkbyid)
 
* ## [Inventory](#Inventory)
  * [Inventory#getJobsByCompany](#inventorygetjobsbycompany)
  * [Inventory#updateJob](#inventoryupdatejob)
  * [Inventory#createJob](#inventorycreatejob)
  * [Inventory#getJobByCompanyAndIntegration](#inventorygetjobbycompanyandintegration)
  * [Inventory#getJobConfigDefaults](#inventorygetjobconfigdefaults)
  * [Inventory#getJobByCode](#inventorygetjobbycode)
  * [Inventory#getJobCodeMetrics](#inventorygetjobcodemetrics)
  * [Inventory#getJobCodesByCompanyAndIntegration](#inventorygetjobcodesbycompanyandintegration)
 
* ## [Configuration](#Configuration)
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
 
* ## [Cart](#Cart)
  * [Cart#getCoupons](#cartgetcoupons)
  * [Cart#createCoupon](#cartcreatecoupon)
  * [Cart#getCouponById](#cartgetcouponbyid)
  * [Cart#updateCoupon](#cartupdatecoupon)
  * [Cart#updateCouponPartially](#cartupdatecouponpartially)
 
* ## [Rewards](#Rewards)
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
 
* ## [Analytics](#Analytics)
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
 
* ## [Discount](#Discount)
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
 
* ## [Partner](#Partner)
  * [Partner#addProxyPath](#partneraddproxypath)
  * [Partner#removeProxyPath](#partnerremoveproxypath)
 
* ## [Webhook](#Webhook)
  * [Webhook#getSubscribersByCompanyAndEventId](#webhookgetsubscribersbycompanyandeventid)
  * [Webhook#registerSubscriberToEvent](#webhookregistersubscribertoevent)
  * [Webhook#updateSubscriberConfig](#webhookupdatesubscriberconfig)
 

---



## Common


#### getLocations
Get countries, states, cities



```kotlin
common.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```






*Returned Response*




[Locations](#Locations)

Success






---




## Lead


#### getTickets
Gets the list of company level tickets and/or ticket filters depending on query params



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Gets the list of company level tickets and/or ticket filters

*Returned Response*




[TicketList](#TicketList)

Success






---


#### createTicket
Creates a company level ticket



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Creates a company level ticket

*Returned Response*




[Ticket](#Ticket)

Success






---


#### getTickets
Gets the list of Application level Tickets and/or ticket filters depending on query params



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Gets the list of Application level Tickets and/or ticket filters

*Returned Response*




[TicketList](#TicketList)

Success






---


#### getTicket
Retreives ticket details of a company level ticket with ticket ID



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Retreives ticket details of a company level ticket

*Returned Response*




[Ticket](#Ticket)

Success






---


#### editTicket
Edits ticket details of a company level ticket



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Edits ticket details of a company level ticket such as status, priority, category, tags, attachments, assigne & ticket content changes

*Returned Response*




[Ticket](#Ticket)

Success






---


#### getTicket
Retreives ticket details of a application level ticket



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Retreives ticket details of a application level ticket with ticket ID

*Returned Response*




[Ticket](#Ticket)

Success






---


#### editTicket
Edits ticket details of a application level ticket



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Edits ticket details of a application level ticket such as status, priority, category, tags, attachments, assigne & ticket content changes

*Returned Response*




[Ticket](#Ticket)

Success






---


#### createHistory
Create history for specific company level ticket



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create history for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Returned Response*




[TicketHistory](#TicketHistory)

Success






---


#### getTicketHistory
Gets history list for specific company level ticket



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Gets history list for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Returned Response*




[TicketHistoryList](#TicketHistoryList)

Success






---


#### getFeedbacks
Gets a list of feedback submitted against that ticket



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Gets a list of feedback submitted against that ticket

*Returned Response*




[TicketFeedbackList](#TicketFeedbackList)

Success






---


#### submitFeedback
Submit a response for feeback form against that ticket



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Submit a response for feeback form against that ticket

*Returned Response*




[TicketFeedback](#TicketFeedback)

Success






---


#### createHistory
Create history for specific application level ticket



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create history for specific application level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Returned Response*




[TicketHistory](#TicketHistory)

Success






---


#### getTicketHistory
Gets history list for specific application level ticket



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Gets history list for specific application level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Returned Response*




[TicketHistoryList](#TicketHistoryList)

Success






---


#### getCustomForm
Get specific custom form using it's slug



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get specific custom form using it's slug, this is used to view the form.

*Returned Response*




[CustomForm](#CustomForm)

Success






---


#### editCustomForm
Edit the given custom form



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Edit the given custom form field such as adding or deleting input, assignee, title, decription, notification and polling information.

*Returned Response*




[CustomForm](#CustomForm)

Success






---


#### getCustomForms
Get list of custom form



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get list of custom form for given application

*Returned Response*




[CustomFormList](#CustomFormList)

Success






---


#### createCustomForm
Creates a new custom form



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Creates a new custom form for given application

*Returned Response*




[CustomForm](#CustomForm)

Success






---


#### getTokenForVideoRoom
Get Token to join a specific Video Room using it's unqiue name



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get Token to join a specific Video Room using it's unqiue name, this Token is your ticket to Room and also creates your identity there.

*Returned Response*




[GetTokenForVideoRoomResponse](#GetTokenForVideoRoomResponse)

Success






---


#### getTokenForVideoRoom
Get Token to join a specific Video Room using it's unqiue name



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get Token to join a specific Video Room using it's unqiue name, this Token is your ticket to Room and also creates your identity there.

*Returned Response*




[GetTokenForVideoRoomResponse](#GetTokenForVideoRoomResponse)

Success






---


#### getVideoParticipants
Get participants of a specific Video Room using it's unique name



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get participants of a specific Video Room using it's unique name, this can be used to check if people are already there in the room and also to show their names.

*Returned Response*




[GetParticipantsInsideVideoRoomResponse](#GetParticipantsInsideVideoRoomResponse)

Success






---


#### getVideoParticipants
Get participants of a specific Video Room using it's unique name



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get participants of a specific Video Room using it's unique name, this can be used to check if people are already there in the room and also to show their names.

*Returned Response*




[GetParticipantsInsideVideoRoomResponse](#GetParticipantsInsideVideoRoomResponse)

Success






---


#### openVideoRoom
Open a video room.



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Open a video room.

*Returned Response*




[CreateVideoRoomResponse](#CreateVideoRoomResponse)

Success






---


#### closeVideoRoom
Close the video room and force all participants to leave.



```kotlin
lead.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Close the video room and force all participants to leave.

*Returned Response*




[CloseVideoRoomResponse](#CloseVideoRoomResponse)

Success






---




## Feedback


#### getAttributes
Get list of attribute data



```kotlin
feedback.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Provides a list of all attribute data.

*Returned Response*




[FeedbackAttributes](#FeedbackAttributes)

ok






---


#### getCustomerReviews
Get list of customer reviews [admin]



```kotlin
feedback.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




The endpoint provides a list of customer reviews based on entity and provided filters

*Returned Response*




[GetReviewResponse](#GetReviewResponse)

Success






---


#### updateApprove
update approve details



```kotlin
feedback.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




The is used to update approve details like status and description text

*Returned Response*




[UpdateResponse](#UpdateResponse)

ok






---


#### getHistory
get history details



```kotlin
feedback.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




The is used to get the history details like status and description text

*Returned Response*




[ArrayList<ActivityDump>](#ArrayList<ActivityDump>)

ok






---


#### getApplicationTemplates
Get list of templates



```kotlin
feedback.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get all templates of application

*Returned Response*




[TemplateGetResponse](#TemplateGetResponse)

Success






---


#### createTemplate
Create a new template



```kotlin
feedback.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create a new template for review with following data:
- Enable media, rating and review
- Rating - active/inactive/selected rate choices, attributes, text on rate, comment for each rate, type
- Review - header, title, description, image and video meta, enable votes

*Returned Response*




[InsertResponse](#InsertResponse)

Success






---


#### getTemplateById
Get a template by ID



```kotlin
feedback.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get the template for product or l3 type by ID

*Returned Response*




[Template](#Template)

Success






---


#### updateTemplate
Update a template's status



```kotlin
feedback.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update existing template status, active/archive

*Returned Response*




[UpdateResponse](#UpdateResponse)

Success






---


#### updateTemplateStatus
Update a template's status



```kotlin
feedback.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update existing template status, active/archive

*Returned Response*




[UpdateResponse](#UpdateResponse)

Success






---




## Theme


#### getAllPages
Get all pages of a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve all the available pages of a theme by its ID.

*Returned Response*




[AllAvailablePageSchema](#AllAvailablePageSchema)

Success. Returns an array all the pages of the theme. Refer `AllAvailablePageSchema` for more details.






---


#### createPage
Create a page 



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to create a page for a theme by its ID.

*Returned Response*




[AvailablePageSchema](#AvailablePageSchema)

Success. Returns the page of the theme. Refer `AvailablePageSchema` for more details.






---


#### updateMultiplePages
Update multiple pages of a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to update multiple pages of a theme by its ID.

*Returned Response*




[AllAvailablePageSchema](#AllAvailablePageSchema)

Success. Returns an array all the pages of the theme. Refer `AllAvailablePageSchema` for more details.






---


#### getPage
Get page of a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve a page of a theme.

*Returned Response*




[AvailablePageSchema](#AvailablePageSchema)

Success. Returns an object of the page.  Refer `AvailablePageSchema` for more details.






---


#### updatePage
Updates a page 



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to update a page for a theme by its ID.

*Returned Response*




[AvailablePageSchema](#AvailablePageSchema)

Success. Returns a the page of the theme. Refer `AvailablePageSchema` for more details.






---


#### deletePage
Deletes a page 



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete a page for a theme by its ID and page_value.

*Returned Response*




[AvailablePageSchema](#AvailablePageSchema)

Success. Returns a the page of the theme. Refer `AvailablePageSchema` for more details.






---


#### getThemeLibrary
Get a list of themes from the theme library



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Theme library is a personalized collection of themes that are chosen and added from the available themes. Use this API to fetch a list of themes from the library along with their configuration details. 

*Returned Response*




[ThemesListingResponseSchema](#ThemesListingResponseSchema)

Success. Refer `ThemesListingResponseSchema` for more details.






---


#### addToThemeLibrary
Add a theme to the theme library



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Theme library is a personalized collection of themes that are chosen and added from the available themes. Use this API to choose a theme and add it to the theme library.

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Refer `ThemesSchema` for more details.






---


#### applyTheme
Apply a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to apply a theme to the website.

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Refer `ThemesSchema` for more details.






---


#### isUpgradable
Checks if theme is upgradable



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




There's always a possibility that new features get added to a theme. Use this API to check if the applied theme has an upgrade available.

*Returned Response*




[UpgradableThemeSchema](#UpgradableThemeSchema)

Success. If the boolean value of `upgrade` returns **true**, the theme can be upgraded. Refer `UpgradableThemeSchema` for more details.






---


#### upgradeTheme
Upgrade a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to upgrade the current theme to its latest version.

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Upgrades the theme and shares the details of the new version in the response. Refer `ThemesSchema` for more details.






---


#### getPublicThemes
Get all public themes



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to get a list of free themes that you can apply to your website.

*Returned Response*




[ThemesListingResponseSchema](#ThemesListingResponseSchema)

Success. Refer `ThemesListingResponseSchema` for more details.






---


#### createTheme
Create a new theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Themes improve the look and appearance of a website. Use this API to create a theme.

*Returned Response*




[ThemesSchema](#ThemesSchema)

Theme






---


#### getAppliedTheme
Get the applied theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve the theme that is currently applied to the website along with its details.

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Refer `ThemesSchema` for more details.






---


#### getFonts
Get all the supported fonts in a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Font is a collection of characters with a similar design. Use this API to retrieve a list of website fonts.

*Returned Response*




[FontsSchema](#FontsSchema)

Success. Refer `FontsSchema` for more details.






---


#### getThemeById
Gets theme by id



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve the details of a specific theme by using its ID.

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Refer `ThemesSchema` for more details.






---


#### updateTheme
Update a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit an existing theme. You can customize the website font, sections, images, styles, and many more.

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Refer `ThemesSchema` for more details.






---


#### deleteTheme
Delete a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete a theme from the theme library.

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Refer `ThemesSchema` for more details.






---


#### getThemeForPreview
Get a theme preview



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




A theme can be previewed before applying it. Use this API to retrieve the theme preview by using its ID.

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Refer `ThemesSchema` for more details.






---


#### publishTheme
Publish a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to publish a theme that is either newly created or edited.

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Refer `ThemesSchema` for more details.






---


#### unpublishTheme
Unpublish a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to remove an existing theme from the list of available themes.

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Refer `ThemesSchema` for more details.






---


#### archiveTheme
Archive a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to store an existing theme but not delete it so that it can be used in future if required. 

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Refer `ThemesSchema` for more details.






---


#### unarchiveTheme
Unarchive a theme



```kotlin
theme.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to restore an archived theme and bring it back for editing or publishing. 

*Returned Response*




[ThemesSchema](#ThemesSchema)

Success. Refer `ThemesSchema` for more details.






---




## User


#### getCustomers
Get a list of customers



```kotlin
user.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve a list of customers who have registered in the application.

*Returned Response*




[CustomerListResponseSchema](#CustomerListResponseSchema)

Success. Refer `CustomerListResponseSchema` for more details.






---


#### searchUsers
Search an existing user.



```kotlin
user.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve an existing user from a list.

*Returned Response*




[UserSearchResponseSchema](#UserSearchResponseSchema)

Success. Returns first name, last name, emails, phone number and gender of the user. Refer `UserSearchResponseSchema` for more details.






---


#### createUser
Create user



```kotlin
user.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create user

*Returned Response*




[CreateUserResponseSchema](#CreateUserResponseSchema)

User create






---


#### updateUser
Update user



```kotlin
user.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update user

*Returned Response*




[CreateUserResponseSchema](#CreateUserResponseSchema)

User update






---


#### createUserSession
Create user session



```kotlin
user.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create user session

*Returned Response*




[CreateUserSessionResponseSchema](#CreateUserSessionResponseSchema)

Create user session






---


#### getPlatformConfig
Get platform configurations



```kotlin
user.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to get all the platform configurations such as mobile image, desktop image, social logins, and all other text.

*Returned Response*




[PlatformSchema](#PlatformSchema)

Success. Returns a JSON object containing the all the platform configurations. Refer `PlatformSchema` for more details.






---


#### updatePlatformConfig
Update platform configurations



```kotlin
user.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit the existing platform configurations such as mobile image, desktop image, social logins, and all other text.

*Returned Response*




[PlatformSchema](#PlatformSchema)

Success. Returns a JSON object with the updated platform configurations. Refer `PlatformSchema` for more details.






---




## Content


#### getAnnouncementsList
Get a list of announcements



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Announcements are useful to highlight a message or information on top of a webpage. Use this API to retrieve a list of announcements.	

*Returned Response*




[GetAnnouncementListSchema](#GetAnnouncementListSchema)

Success. Refer `GetAnnouncementListSchema` for more details.






---


#### createAnnouncement
Create an announcement



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Announcements are useful to highlight a message or information on top of a webpage. Use this API to create an announcement.

*Returned Response*




[CreateAnnouncementSchema](#CreateAnnouncementSchema)

Success. Refer `CreateAnnouncementSchema` for more details.






---


#### getAnnouncementById
Get announcement by ID



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve an announcement and its details such as the target platform and pages on which it's applicable

*Returned Response*




[AdminAnnouncementSchema](#AdminAnnouncementSchema)

Success. Refer `AdminAnnouncementSchema` for more details.






---


#### updateAnnouncement
Update an announcement



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit an existing announcement and its details such as the target platform and pages on which it's applicable

*Returned Response*




[CreateAnnouncementSchema](#CreateAnnouncementSchema)

Success. Refer `CreateAnnouncementSchema` for more details.






---


#### updateAnnouncementSchedule
Update the schedule and the publish status of an announcement



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit the duration, i.e. start date-time and end date-time of an announcement. Moreover, you can enable/disable an announcement using this API.

*Returned Response*




[CreateAnnouncementSchema](#CreateAnnouncementSchema)

Success. Refer `CreateAnnouncementSchema` for more details.






---


#### deleteAnnouncement
Delete announcement by id



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete an existing announcement.

*Returned Response*




[CreateAnnouncementSchema](#CreateAnnouncementSchema)

Success.






---


#### createBlog
Create a blog



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to create a blog.

*Returned Response*




[BlogSchema](#BlogSchema)

Success. Refer `BlogSchema` for more details.






---


#### getBlogs
Get blogs



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to get a list of blogs along with their details, such as the title, reading time, publish status, feature image, tags, author, etc.

*Returned Response*




[BlogGetResponse](#BlogGetResponse)

Success. Refer `BlogGetResponse` for more details.






---


#### updateBlog
Update a blog



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to update the details of an existing blog which includes title, feature image, content, SEO details, expiry, etc.

*Returned Response*




[BlogSchema](#BlogSchema)

Success.






---


#### deleteBlog
Delete blogs



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete a blog.

*Returned Response*




[BlogSchema](#BlogSchema)

Success.






---


#### getComponentById
Get components of a blog



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve the components of a blog, such as title, slug, feature image, content, schedule, publish status, author, etc.

*Returned Response*




[BlogSchema](#BlogSchema)

Success. Returns a a JSON object with components. Refer `BlogSchema` for more details.






---


#### getFaqCategories
Get a list of FAQ categories



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




FAQs can be divided into categories. Use this API to get a list of FAQ categories.

*Returned Response*




[GetFaqCategoriesSchema](#GetFaqCategoriesSchema)

Success. Refer `GetFaqCategoriesSchema` for more details.






---


#### getFaqCategoryBySlugOrId
Get an FAQ category by slug or id



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




FAQs can be divided into categories. Use this API to get an FAQ categories using its slug or ID.

*Returned Response*




[GetFaqCategoryBySlugSchema](#GetFaqCategoryBySlugSchema)

Success. Refer `GetFaqCategoryBySlugSchema` for more details.






---


#### createFaqCategory
Create an FAQ category



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




FAQs help users to solve an issue or know more about a process. FAQs can be categorized separately, for e.g. some questions can be related to payment, some could be related to purchase, shipping, navigating, etc. Use this API to create an FAQ category.

*Returned Response*




[CreateFaqCategorySchema](#CreateFaqCategorySchema)

Success.






---


#### updateFaqCategory
Update an FAQ category



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit an existing FAQ category.

*Returned Response*




[CreateFaqCategorySchema](#CreateFaqCategorySchema)

Success.






---


#### deleteFaqCategory
Delete an FAQ category



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete an FAQ category.

*Returned Response*




[FaqSchema](#FaqSchema)

Success.






---


#### getFaqsByCategoryIdOrSlug
Get question and answers within an FAQ category



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve all the commonly asked question and answers belonging to an FAQ category.

*Returned Response*




[GetFaqSchema](#GetFaqSchema)

Success. Refer `GetFaqSchema` for more details.






---


#### addFaq
Create an FAQ



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




FAQs help users to solve an issue or know more about a process. Use this API to create an FAQ for a given FAQ category.

*Returned Response*




[CreateFaqResponseSchema](#CreateFaqResponseSchema)

Success.






---


#### updateFaq
Update an FAQ



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit an existing FAQ.

*Returned Response*




[CreateFaqResponseSchema](#CreateFaqResponseSchema)

Success.






---


#### deleteFaq
Delete an FAQ



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete an existing FAQ.

*Returned Response*




[CreateFaqResponseSchema](#CreateFaqResponseSchema)

Success.






---


#### getFaqByIdOrSlug
Get an FAQ



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve a specific FAQ. You will get the question and answer of that FAQ.

*Returned Response*




[CreateFaqResponseSchema](#CreateFaqResponseSchema)

Success. Refer `CreateFaqResponseSchema` for more details.






---


#### getLandingPages
Get landing pages



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Landing page is the first page that a prospect lands upon while visiting a website. Use this API to fetch a list of landing pages.

*Returned Response*




[LandingPageGetResponse](#LandingPageGetResponse)

Success. Refer `LandingPageGetResponse` for more details.






---


#### createLandingPage
Create a landing page



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Landing page is the first page that a prospect lands upon while visiting a website. Use this API to create a landing page.

*Returned Response*




[LandingPageSchema](#LandingPageSchema)

Success.






---


#### updateLandingPage
Update a landing page



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit the details of an existing landing page.

*Returned Response*




[LandingPageSchema](#LandingPageSchema)

Success.






---


#### deleteLandingPage
Delete a landing page



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete an existing landing page.

*Returned Response*




[LandingPageSchema](#LandingPageSchema)

Success.






---


#### getLegalInformation
Get legal information



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to get the legal information of an application, which includes Policy, Terms and Conditions, Shipping Policy and FAQ regarding the application.

*Returned Response*




[ApplicationLegal](#ApplicationLegal)

Success. Refer `ApplicationLegal` for more details.






---


#### updateLegalInformation
Save legal information



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit, update and save the legal information of an application, which includes Policy, Terms and Conditions, Shipping Policy and FAQ regarding the application.

*Returned Response*




[ApplicationLegal](#ApplicationLegal)

Success. Refer `ApplicationLegal` for more details.






---


#### getNavigations
Get navigations



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to fetch the navigations details which includes the items of the navigation pane. It also shows the orientation, links, sub-navigations, etc.

*Returned Response*




[NavigationGetResponse](#NavigationGetResponse)

Success. Refer `NavigationGetResponse` for more details.






---


#### createNavigation
Create a navigation



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Navigation is the arrangement of navigational items to ease the accessibility of resources for users on a website. Use this API to create a navigation.

*Returned Response*




[NavigationSchema](#NavigationSchema)

Success.






---


#### getDefaultNavigations
Get default navigations



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




On any website (application), there are navigations that are present by default. Use this API to retrieve those default navigations.

*Returned Response*




[DefaultNavigationResponse](#DefaultNavigationResponse)

Success. Refer `DefaultNavigationResponse` for more details.






---


#### getNavigationBySlug
Get a navigation by slug



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve a navigation by its slug.

*Returned Response*




[NavigationSchema](#NavigationSchema)

Success. Refer `NavigationSchema` for more details.






---


#### updateNavigation
Update a navigation



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit the details of an existing navigation.

*Returned Response*




[NavigationSchema](#NavigationSchema)

Success.






---


#### deleteNavigation
Delete a navigation



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete an existing navigation.

*Returned Response*




[NavigationSchema](#NavigationSchema)

Success.






---


#### getPageMeta
Get page meta



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to get the meta of custom pages (blog, page) and default system pages (e.g. home/brand/category/collection).

*Returned Response*




[PageMetaSchema](#PageMetaSchema)

Success. Refer `PageMetaSchema` for more details.






---


#### getPageSpec
Get page spec



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to get the specifications of a page, such as page type, display name, params and query.

*Returned Response*




[PageSpec](#PageSpec)

Success. Refer `PageSpec` for more details.






---


#### createPage
Create a page



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to create a custom page using a title, seo, publish status, feature image, tags, meta, etc.

*Returned Response*




[PageSchema](#PageSchema)

Success. Refer `PageSchema` for more details.






---


#### getPages
Get a list of pages



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve a list of pages.

*Returned Response*




[PageGetResponse](#PageGetResponse)

Success. Refer `PageGetResponse` for more details.






---


#### createPagePreview
Create a page preview



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to create a page preview to check the appearance of a custom page.

*Returned Response*




[PageSchema](#PageSchema)

Success. Refer `PageSchema` for more details.






---


#### updatePagePreview
Change the publish status of a page



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to change the publish status of an existing page. Allows you to publish and unpublish the page.

*Returned Response*




[PageSchema](#PageSchema)

Success.






---


#### updatePage
Update a page



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit the details of an existing page, such as its title, seo, publish status, feature image, tags, schedule, etc.

*Returned Response*




[PageSchema](#PageSchema)

Success. Refer `PageSchema` for more details.






---


#### deletePage
Delete a page



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete an existing page.

*Returned Response*




[PageSchema](#PageSchema)

Success.






---


#### getPageBySlug
Get pages by component Id



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve the components of a page, such as its title, seo, publish status, feature image, tags, schedule, etc.

*Returned Response*




[PageSchema](#PageSchema)

Success. Returns a JSON object of components. Refer `PageSchema` for more details.






---


#### getSEOConfiguration
Get SEO configuration of an application



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to know how the SEO is configured in the application. This includes the sitemap, robot.txt, custom meta tags, etc.

*Returned Response*




[SeoComponent](#SeoComponent)

Success. Refer `SeoComponent` for more details.






---


#### updateSEOConfiguration
Update SEO of application



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit the SEO details of an application. This includes the sitemap, robot.txt, custom meta tags, etc.

*Returned Response*




[SeoSchema](#SeoSchema)

Success. Refer `SeoSchema` for more details.






---


#### getSlideshows
Get slideshows



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




A slideshow is a group of images, videos or a combination of both that are shown on the website in the form of slides. Use this API to fetch a list of slideshows.

*Returned Response*




[SlideshowGetResponse](#SlideshowGetResponse)

Success. Refer `SlideshowGetResponse` for more details.






---


#### createSlideshow
Create a slideshow



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




A slideshow is a group of images, videos or a combination of both that are shown on the website in the form of slides. Use this API to create a slideshow.

*Returned Response*




[SlideshowSchema](#SlideshowSchema)

Success. Refer `SlideshowSchema` for more details.






---


#### getSlideshowBySlug
Get slideshow by slug



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to retrieve the details of a slideshow by its slug.

*Returned Response*




[SlideshowSchema](#SlideshowSchema)

Success. Refer `SlideshowSchema` for more details.






---


#### updateSlideshow
Update a slideshow



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit the details of an existing slideshow.

*Returned Response*




[SlideshowSchema](#SlideshowSchema)

Success. Refer `SlideshowSchema` for more details.






---


#### deleteSlideshow
Delete a slideshow



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete an existing slideshow.

*Returned Response*




[SlideshowSchema](#SlideshowSchema)

Success.






---


#### getSupportInformation
Get support information



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to get the contact details for customer support, including emails and phone numbers.

*Returned Response*




[Support](#Support)

Success. Refer `Support` for more details.






---


#### updateSupportInformation
Update the support data of an application



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit the existing contact details for customer support, including emails and phone numbers.

*Returned Response*




[Support](#Support)

Success. Refer `Support` for more details.






---


#### updateInjectableTag
Update a tag



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit the details of an existing tag. This includes the tag name, tag type (css/js), url and position of the tag.

*Returned Response*




[TagsSchema](#TagsSchema)

Success.






---


#### deleteAllInjectableTags
Delete tags in application



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete all the existing tags at once.

*Returned Response*




[TagsSchema](#TagsSchema)

Success.






---


#### getInjectableTags
Get all the tags in an application



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to get all the CSS and JS injected in the application in the form of tags.

*Returned Response*




[TagsSchema](#TagsSchema)

Success. Refer `TagsSchema` for more details.






---


#### addInjectableTag
Add a tag



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




CSS and JS can be injected in the application (website) with the help of tags. Use this API to create such tags by entering the tag name, tag type (css/js), url and position of the tag.

*Returned Response*




[TagsSchema](#TagsSchema)

Success.






---


#### removeInjectableTag
Remove a tag



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to delete an existing tag.

*Returned Response*




[TagsSchema](#TagsSchema)

Success.






---


#### editInjectableTag
Edit a tag by id



```kotlin
content.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to edit the details of an existing tag by its ID.

*Returned Response*




[TagsSchema](#TagsSchema)

Success.






---




## Assignment


#### createPickupLocation




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create a new Pickup point for an application.


*Returned Response*




[Success](#Success)

Success Response - Store Updated






---


#### getPickupLocation




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update list of pickup points for an application.


*Returned Response*




[PickupPointResponse](#PickupPointResponse)

Success Response






---


#### updatePickupLocation




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update Pickup Point for an application. Pickup Point once created
can be updated using this API. 'x-application-id'm and request body are required to trigger
a successful update.


*Returned Response*




[Success](#Success)

Success Response - Store Updated






---


#### getPickupLocationById




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API returns Pickup point data for an id. Returns not found if no data exists for the
store id passed.


*Returned Response*




[PickupPointSchema](#PickupPointSchema)

Success Response






---


#### createPickupConfiguration




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create a new pickup configuration for an application id. Only one configuration can be
created per application id.


*Returned Response*




[Success](#Success)

Success Response - Store Updated






---


#### getPickupConfiguration




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Let pickup configuration for an application. z-application-id is required in
the header to fetch the data.


*Returned Response*




[PickupResponse](#PickupResponse)

Success Response






---


#### getAllocationConfiguration




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get Shipping configuration for an application. Returns the global shipping configuration
including shipping priority and default strategy, etc. Every application can have one set of
configuration each. The endpoint requires an application id to get the data.


*Returned Response*




[ShippingResponse](#ShippingResponse)

Success Response






---


#### createAllocationConfiguration




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create a new Shipping configuration for an application The configuration is for
all the stores under an application. There can be only one configuration for an
application i.e, for an application configuration can be created only once.


*Returned Response*




[Success](#Success)

Success Response - Store Updated






---


#### updateAllocationConfiguration




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update Shipping configuration for an application. Application configuration once created
can be updated using this API. 'x-application-id'm and request body are required to trigger
a successful update.


*Returned Response*




[Success](#Success)

Success Response - Store Updated






---


#### getAllocationLocations




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




List Stores of an application. Two types of stores are listed,
some having allocation types as standard and others, advanced.
API has support for pagination, filter by type and search by name.


*Returned Response*




[StoreListResponse](#StoreListResponse)

Success Response






---


#### getAllocationLocationById




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API returns store data for an id. Returns not found if no data exists for the
store id passed. The data is returned from sixspeed database which includes only the
shipping configuration of the stores including store id and app id.


*Returned Response*




[StoreResponse](#StoreResponse)

Success Response






---


#### updateAllocationLocation




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




A store configuration once created can be updated via this API. Store id in request params
and udpated request body are required to successfully update the store data.


*Returned Response*




[Success](#Success)

Success Response - Store Updated






---


#### createAllocationLocation




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create a new store shipping configuratiion. The configuration is stored into the
sixspeed database. One one store data can be created for one store id. Ther can be one
default configuration and multiple non-default ones. The default is not binded with product
tags while others are required to be.


*Returned Response*




[Success](#Success)

Success Response - Store Updated






---


#### getDestinationZones




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get a list of zones created, where every zone has a unique name and id. They can be
of three different types, radius, pincode and country.


*Returned Response*




[ZoneListResponse](#ZoneListResponse)

Success Response






---


#### postDestinationZone




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API lets you create a zone which can be used further be mapped with store
configuration rules to defined a shipping rule. Either of the three details need to
be passed, zone_detail, pincode and region.


*Returned Response*




[Success](#Success)

Success Response - Zone Created






---


#### getDestinationZoneById




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Returns zone data for the specified zone id. Id is the required parameter and returns
not found if no data is found for the passed zone id.


*Returned Response*




[ZoneSchema](#ZoneSchema)

Success Response






---


#### updateDestinationZone




```kotlin
assignment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Zone once created can be updated using this API. Zone id and request body are the required
data to update a zone.


*Returned Response*




[Success](#Success)

Success Response - Zone Updated






---




## Billing


#### createSubscriptionCharge
Create subscription charge



```kotlin
billing.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Register subscription charge for a seller of your extension.

*Returned Response*




[CreateSubscriptionResponse](#CreateSubscriptionResponse)

Success






---


#### getSubscriptionCharge
Get subscription charge details



```kotlin
billing.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get created subscription charge details

*Returned Response*




[EntitySubscription](#EntitySubscription)

Success






---


#### cancelSubscriptionCharge
Cancel subscription charge



```kotlin
billing.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Cancel subscription and attached charges.

*Returned Response*




[EntitySubscription](#EntitySubscription)

Success






---


#### getInvoices
Get invoices



```kotlin
billing.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get invoices.

*Returned Response*




[Invoices](#Invoices)

Success






---


#### getInvoiceById
Get invoice by id



```kotlin
billing.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get invoice by id.

*Returned Response*




[Invoice](#Invoice)

Success






---


#### getCustomerDetail
Get subscription customer detail



```kotlin
billing.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get subscription customer detail.

*Returned Response*




[SubscriptionCustomer](#SubscriptionCustomer)

Success






---


#### upsertCustomerDetail
Upsert subscription customer detail



```kotlin
billing.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Upsert subscription customer detail.

*Returned Response*




[SubscriptionCustomer](#SubscriptionCustomer)

Success






---


#### getSubscription
Get current subscription detail



```kotlin
billing.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




If subscription is active then it will return is_enabled true and return subscription object. If subscription is not active then is_enabled false and message.


*Returned Response*




[SubscriptionStatus](#SubscriptionStatus)

Success






---


#### getFeatureLimitConfig
Get subscription subscription limits



```kotlin
billing.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get subscription subscription limits.

*Returned Response*




[SubscriptionLimit](#SubscriptionLimit)

Success






---


#### activateSubscriptionPlan
Activate subscription



```kotlin
billing.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




It will activate subscription plan for customer

*Returned Response*




[SubscriptionActivateRes](#SubscriptionActivateRes)

Success






---


#### cancelSubscriptionPlan
Cancel subscription



```kotlin
billing.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




It will cancel current active subscription.

*Returned Response*




[CancelSubscriptionRes](#CancelSubscriptionRes)

Success






---




## Communication


#### getCampaigns
Get campaigns



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get campaigns

*Returned Response*




[Campaigns](#Campaigns)

Success






---


#### createCampaign
Create campaign



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create campaign

*Returned Response*




[Campaign](#Campaign)

Success






---


#### getCampaignById
Get campaign by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get campaign by id

*Returned Response*




[Campaign](#Campaign)

Success






---


#### updateCampaignById
Update campaign by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update campaign by id

*Returned Response*




[Campaign](#Campaign)

Success






---


#### getStatsOfCampaignById
Get stats of campaign by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get stats of campaign by id

*Returned Response*




[GetStats](#GetStats)

Success






---


#### getAudiences
Get audiences



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get audiences

*Returned Response*




[Audiences](#Audiences)

Success






---


#### createAudience
Create audience



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create audience

*Returned Response*




[Audience](#Audience)

Success






---


#### getBigqueryHeaders
Get bigquery headers



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get bigquery headers

*Returned Response*




[BigqueryHeadersRes](#BigqueryHeadersRes)

Success






---


#### getAudienceById
Get audience by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get audience by id

*Returned Response*




[Audience](#Audience)

Success






---


#### updateAudienceById
Update audience by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update audience by id

*Returned Response*




[Audience](#Audience)

Success






---


#### getNSampleRecordsFromCsv
Get n sample records from csv



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get n sample records from csv

*Returned Response*




[GetNRecordsCsvRes](#GetNRecordsCsvRes)

Success






---


#### getEmailProviders
Get email providers



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get email providers

*Returned Response*




[EmailProviders](#EmailProviders)

Success






---


#### createEmailProvider
Create email provider



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create email provider

*Returned Response*




[EmailProvider](#EmailProvider)

Success






---


#### getEmailProviderById
Get email provider by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get email provider by id

*Returned Response*




[EmailProvider](#EmailProvider)

Success






---


#### updateEmailProviderById
Update email provider by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update email provider by id

*Returned Response*




[EmailProvider](#EmailProvider)

Success






---


#### getEmailTemplates
Get email templates



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get email templates

*Returned Response*




[EmailTemplates](#EmailTemplates)

Success






---


#### createEmailTemplate
Create email template



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create email template

*Returned Response*




[EmailTemplateRes](#EmailTemplateRes)

Success






---


#### getSystemEmailTemplates
Get system email templates



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get system email templates

*Returned Response*




[SystemEmailTemplates](#SystemEmailTemplates)

Success






---


#### getEmailTemplateById
Get email template by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get email template by id

*Returned Response*




[EmailTemplate](#EmailTemplate)

Success






---


#### updateEmailTemplateById
Update email template by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update email template by id

*Returned Response*




[EmailTemplateRes](#EmailTemplateRes)

Success






---


#### deleteEmailTemplateById
Delete email template by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Delete email template by id

*Returned Response*




[EmailTemplateDeleteSuccessRes](#EmailTemplateDeleteSuccessRes)

Success






---


#### getEventSubscriptions
Get event subscriptions



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get event subscriptions

*Returned Response*




[EventSubscriptions](#EventSubscriptions)

Success






---


#### getJobs
Get jobs



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get jobs

*Returned Response*




[Jobs](#Jobs)

Success






---


#### triggerCampaignJob
Trigger campaign job



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Trigger campaign job

*Returned Response*




[TriggerJobResponse](#TriggerJobResponse)

Success






---


#### getJobLogs
Get job logs



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get job logs

*Returned Response*




[JobLogs](#JobLogs)

Success






---


#### getCommunicationLogs
Get communication logs



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get communication logs

*Returned Response*




[Logs](#Logs)

Success






---


#### getSystemNotifications
Get system notifications



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get system notifications

*Returned Response*




[SystemNotifications](#SystemNotifications)

Success






---


#### getSmsProviders
Get sms providers



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get sms providers

*Returned Response*




[SmsProviders](#SmsProviders)

Success






---


#### createSmsProvider
Create sms provider



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create sms provider

*Returned Response*




[SmsProvider](#SmsProvider)

Success






---


#### getSmsProviderById
Get sms provider by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get sms provider by id

*Returned Response*




[SmsProvider](#SmsProvider)

Success






---


#### updateSmsProviderById
Update sms provider by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update sms provider by id

*Returned Response*




[SmsProvider](#SmsProvider)

Success






---


#### getSmsTemplates
Get sms templates



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get sms templates

*Returned Response*




[SmsTemplates](#SmsTemplates)

Success






---


#### createSmsTemplate
Create sms template



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create sms template

*Returned Response*




[SmsTemplateRes](#SmsTemplateRes)

Success






---


#### getSmsTemplateById
Get sms template by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get sms template by id

*Returned Response*




[SmsTemplate](#SmsTemplate)

Success






---


#### updateSmsTemplateById
Update sms template by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update sms template by id

*Returned Response*




[SmsTemplateRes](#SmsTemplateRes)

Success






---


#### deleteSmsTemplateById
Delete sms template by id



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Delete sms template by id

*Returned Response*




[SmsTemplateDeleteSuccessRes](#SmsTemplateDeleteSuccessRes)

Success






---


#### getSystemSystemTemplates
Get system sms templates



```kotlin
communication.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get system sms templates

*Returned Response*




[SystemSmsTemplates](#SystemSmsTemplates)

Success






---




## Payment


#### getBrandPaymentGatewayConfig
Get All Brand Payment Gateway Config Secret



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get All Brand Payment Gateway Config Secret

*Returned Response*




[PaymentGatewayConfigResponse](#PaymentGatewayConfigResponse)

Refund Transfer Mode






---


#### saveBrandPaymentGatewayConfig
Save Config Secret For Brand Payment Gateway



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Save Config Secret For Brand Payment Gateway

*Returned Response*




[PaymentGatewayToBeReviewed](#PaymentGatewayToBeReviewed)

Save Config Secret For Brand Payment Gateway Success Response.






---


#### updateBrandPaymentGatewayConfig
Save Config Secret For Brand Payment Gateway



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Save Config Secret For Brand Payment Gateway

*Returned Response*




[PaymentGatewayToBeReviewed](#PaymentGatewayToBeReviewed)

Save Config Secret For Brand Payment Gateway Success Response.






---


#### getPaymentModeRoutes
Get All Valid Payment Options



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to get Get All Valid Payment Options for making payment

*Returned Response*




[PaymentOptionsResponse](#PaymentOptionsResponse)

Success






---


#### getAllPayouts
Get All Payouts



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get All Payouts

*Returned Response*




[PayoutsResponse](#PayoutsResponse)

payouts response object






---


#### savePayout
Save Payout



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Save Payout

*Returned Response*




[PayoutResponse](#PayoutResponse)

save payout response object






---


#### updatePayout
Update Payout



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update Payout

*Returned Response*




[UpdatePayoutResponse](#UpdatePayoutResponse)

save payout response object






---


#### activateAndDectivatePayout
Partial Update Payout



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Partial Update Payout

*Returned Response*




[UpdatePayoutResponse](#UpdatePayoutResponse)

save payout response object






---


#### deletePayout
Delete Payout



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Delete Payout

*Returned Response*




[DeletePayoutResponse](#DeletePayoutResponse)

delete payout response object






---


#### getSubscriptionPaymentMethod
List Subscription Payment Method



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get all  Subscription  Payment Method

*Returned Response*




[SubscriptionPaymentMethodResponse](#SubscriptionPaymentMethodResponse)

List Subscription Payment Method Response






---


#### deleteSubscriptionPaymentMethod
Delete Subscription Payment Method



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Uses this api to Delete Subscription Payment Method

*Returned Response*




[DeleteSubscriptionPaymentMethodResponse](#DeleteSubscriptionPaymentMethodResponse)

Delete Subscription Payment Method Response.






---


#### getSubscriptionConfig
List Subscription Config



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get all  Subscription Config details

*Returned Response*




[SubscriptionConfigResponse](#SubscriptionConfigResponse)

List Subscription Config Response






---


#### saveSubscriptionSetupIntent
Save Subscription Setup Intent



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Uses this api to Save Subscription Setup Intent

*Returned Response*




[SaveSubscriptionSetupIntentResponse](#SaveSubscriptionSetupIntentResponse)

Save Subscription Setup Intent Response.






---


#### addBeneficiaryDetails
Save bank details for cancelled/returned order



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to save bank details for returned/cancelled order to refund amount in his account.

*Returned Response*




[RefundAccountResponse](#RefundAccountResponse)

Success






---


#### verifyIfscCode
Ifsc Code Verification



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get True/False for correct IFSC Code for adding bank details for refund

*Returned Response*




[IfscCodeResponse](#IfscCodeResponse)

Bank details on correct Ifsc Code






---


#### getUserOrderBeneficiaries
List Order Beneficiary



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get all active  beneficiary details added by the user for refund

*Returned Response*




[OrderBeneficiaryResponse](#OrderBeneficiaryResponse)

List Order Beneficiary






---


#### getUserBeneficiaries
List User Beneficiary



```kotlin
payment.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get all active  beneficiary details added by the user for refund

*Returned Response*




[OrderBeneficiaryResponse](#OrderBeneficiaryResponse)

List User Beneficiary






---




## Order


#### shipmentStatusUpdate
Update status of Shipment



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update Shipment Status

*Returned Response*




[UpdateShipmentStatusResponse](#UpdateShipmentStatusResponse)

Success






---


#### activityStatus
Get Activity Status



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get Activity Status

*Returned Response*




[GetActivityStatus](#GetActivityStatus)

Success






---


#### storeProcessShipmentUpdate
Update Store Process-Shipment



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update Store Process-Shipment

*Returned Response*




[UpdateProcessShipmenstRequestResponse](#UpdateProcessShipmenstRequestResponse)

Success






---


#### checkRefund
Check Refund is available or not



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Check Refund is available or not

*Returned Response*




[HashMap<String,Any>](#HashMap<String,Any>)

Success






---


#### getOrdersByCompanyId
Get Orders for company based on Company Id



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get Orders

*Returned Response*




[OrderListing](#OrderListing)

Success






---


#### getOrderDetails
Get Order Details for company based on Company Id and Order Id



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get Orders

*Returned Response*




[OrderDetails](#OrderDetails)

Success






---


#### getPicklistOrdersByCompanyId
Get Orders for company based on Company Id



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get Orders

*Returned Response*




[OrderPicklistListing](#OrderPicklistListing)

Success






---


#### trackShipmentPlatform
Track Shipment by shipment id, for application based on application Id



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Shipment Track

*Returned Response*




[PlatformShipmentTrack](#PlatformShipmentTrack)

Success






---


#### trackOrder
Track Order by order id, for application based on application Id



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Order Track

*Returned Response*




[PlatformOrderTrack](#PlatformOrderTrack)

Success






---


#### failedOrders
Get all failed orders application wise



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Failed Orders

*Returned Response*




[FailedOrders](#FailedOrders)

Success






---


#### reprocessOrder
Reprocess order by order id



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Order Reprocess

*Returned Response*




[UpdateOrderReprocessResponse](#UpdateOrderReprocessResponse)

Success






---


#### updateShipment
Use this API to update the shipment using its shipment ID.



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update the shipment

*Returned Response*




[ShipmentUpdateResponse](#ShipmentUpdateResponse)

Success. Check the example shown below or refer `ShipmentUpdateRequest` for more details.






---


#### getPlatformShipmentReasons
Use this API to retrieve the issues that led to the cancellation of bags within a shipment.



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get reasons behind full or partial cancellation of a shipment

*Returned Response*




[ShipmentReasonsResponse](#ShipmentReasonsResponse)

Success. Check the example shown below or refer `ShipmentReasonsResponse` for more details.






---


#### getShipmentTrackDetails
Use this API to track a shipment using its shipment ID.



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Track shipment

*Returned Response*




[ShipmentTrackResponse](#ShipmentTrackResponse)

Success. Check the example shown below or refer `ShipmentTrackResponse` for more details.






---


#### getShipmentAddress
Use this API to get address of a shipment using its shipment ID and Address Category.



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get Shipment Address

*Returned Response*




[GetShipmentAddressResponse](#GetShipmentAddressResponse)

Success. Check the example shown below or refer `GetShipmentAddressResponse` for more details.






---


#### updateShipmentAddress
Use this API to update address of a shipment using its shipment ID and Address Category.



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update Shipment Address

*Returned Response*




[UpdateShipmentAddressResponse](#UpdateShipmentAddressResponse)

Success. Check the example shown below or refer `UpdateShipmentAddressResponse` for more details.






---


#### getPing
Get Ping



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get Ping

*Returned Response*




[GetPingResponse](#GetPingResponse)

Success






---


#### voiceCallback
Get Voice Callback



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Voice Callback

*Returned Response*




[GetVoiceCallbackResponse](#GetVoiceCallbackResponse)

Success






---


#### voiceClickToCall
Get Voice Click to Call



```kotlin
order.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Voice Click to Call

*Returned Response*




[GetClickToCallResponse](#GetClickToCallResponse)

Success






---




## Catalog


#### updateSearchKeywords
Update Search Keyword



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update Search Keyword by its id. On successful request, returns the updated collection

*Returned Response*




[GetSearchWordsData](#GetSearchWordsData)

The Collection object. See example below or refer `GetSearchWordsDataSchema` for details.






---


#### getSearchKeywords
Get a Search Keywords Details



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get the details of a words by its `id`. If successful, returns a Collection resource in the response body specified in `GetSearchWordsDetailResponseSchema`

*Returned Response*




[GetSearchWordsDetailResponse](#GetSearchWordsDetailResponse)

The Collection object. See example below or refer `GetSearchWordsDetailResponseSchema` for details






---


#### deleteSearchKeywords
Delete a Search Keywords



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully

*Returned Response*




[DeleteResponse](#DeleteResponse)

Status object. Tells whether the operation was successful. See example below or refer `DeleteResponse`






---


#### createCustomKeyword
Add a Custom Search Keywords



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create a Custom Search Keywords. See `CreateSearchKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateSearchKeywordSchema`

*Returned Response*




[GetSearchWordsData](#GetSearchWordsData)

Get keyword object with id that is added. See example below or refer `GetSearchWordsDataSchema` for details






---


#### getAllSearchKeyword
List all Search Custom Keyword Listing



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Custom Search Keyword allows you to map conditions with keywords to give you the ultimate results

*Returned Response*




[GetSearchWordsResponse](#GetSearchWordsResponse)

List of custom search keywords. See example below or refer `GetSearchWordsResponseSchema` for details






---


#### updateAutocompleteKeyword
Create & Update Autocomplete Keyword



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update a mapping by it's id. On successful request, returns the updated Keyword mapping

*Returned Response*




[GetAutocompleteWordsResponse](#GetAutocompleteWordsResponse)

The Mapping object. See example below or refer `GetAutocompleteWordsResponseSchema` for details.






---


#### getAutocompleteKeywordDetail
Get a Autocomplete Keywords Details



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get the details of a words by its `id`. If successful, returns a keywords resource in the response body specified in `GetAutocompleteWordsResponseSchema`

*Returned Response*




[GetAutocompleteWordsResponse](#GetAutocompleteWordsResponse)

The mapping object. See example below or refer `GetAutocompleteWordsResponseSchema` for details






---


#### deleteAutocompleteKeyword
Delete a Autocomplete Keywords



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully

*Returned Response*




[DeleteResponse](#DeleteResponse)

Status object. Tells whether the operation was successful. See example below or refer `DeleteResponse`






---


#### createCustomAutocompleteRule
Add a Custom Autocomplete Keywords



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create a Custom Autocomplete Keywords. See `CreateAutocompleteKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateAutocompleteKeywordSchema`

*Returned Response*




[CreateAutocompleteWordsResponse](#CreateAutocompleteWordsResponse)

List of all the collections including the one you added. See example below or refer `CreateAutocompleteWordsResponseSchema` for details






---


#### getAutocompleteConfig
List all Autocomplete Keyword Listing



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Custom Autocomplete Keyword allows you to map conditions with keywords to give you the ultimate results

*Returned Response*




[GetAutocompleteWordsResponse](#GetAutocompleteWordsResponse)

List of custom autocomplete keywords. See example below or refer `GetAutocompleteWordsResponseSchema` for details






---


#### createProductBundle
Create Product Bundle



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create Product Bundle. See `ProductBundleRequest` for the request body parameter need to create a product bundle. On successful request, returns in `ProductBundleRequest` with id

*Returned Response*




[GetProductBundleCreateResponse](#GetProductBundleCreateResponse)

Get bundle with id that is added. See example below or refer `GetProductBundleCreateResponse` for details






---


#### getProductBundle
List all Product Bundles



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get all product bundles for a particular company

*Returned Response*




[GetProductBundleListingResponse](#GetProductBundleListingResponse)

List of bundle configured for a company. See example below or refer `GetProductBundleListingResponse` for details






---


#### updateProductBundle
Update a Product Bundle



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update a Product Bundle by its id. On successful request, returns the updated product bundle

*Returned Response*




[GetProductBundleCreateResponse](#GetProductBundleCreateResponse)

The Collection object. See example below or refer `GetProductBundleCreateResponse` for details.






---


#### getProductBundleDetail
Get a particular Product Bundle details



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get a particular Bundle details by its `id`. If successful, returns a Product bundle resource in the response body specified in `GetProductBundleResponse`

*Returned Response*




[GetProductBundleResponse](#GetProductBundleResponse)

The Collection object. See example below or refer `GetProductBundleResponse` for details






---


#### createSizeGuide
Create a size guide.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to create a size guide associated to a brand.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getSizeGuides
Get list of size guides



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to view all the size guides associated to the seller.

*Returned Response*




[ListSizeGuide](#ListSizeGuide)

Size guide object. See example below or refer `ListSizeGuide` for details






---


#### updateSizeGuide
Edit a size guide.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to edit a size guide.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getSizeGuide
Get a single size guide.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to get data associated to a size guide.

*Returned Response*




[SizeGuideResponse](#SizeGuideResponse)

Brand object. See example below or refer `SizeGuideResponseSchema` for details






---


#### getCatalogConfiguration
Get configuration meta  details for catalog for admin panel



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




configuration meta  details for catalog.

*Returned Response*




[GetCatalogConfigurationMetaData](#GetCatalogConfigurationMetaData)

configuration details for catalog. See example below or refer `GetCatalogConfigurationMetaDataSchema` for details






---


#### createConfigurationProductListing
Add configuration for products & listings



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Add configuration for products & listing.

*Returned Response*




[GetAppCatalogConfiguration](#GetAppCatalogConfiguration)

success flag will tell whether the operation was successful.






---


#### getConfigurations
Get configured details for catalog



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




configured details for catalog.

*Returned Response*




[GetAppCatalogConfiguration](#GetAppCatalogConfiguration)

Get application level configured catalog details. See example below or refer `GetAppCatalogConfigurationSchema` for details






---


#### createConfigurationByType
Add configuration for categories and brands



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Add configuration for categories & brands.

*Returned Response*




[GetAppCatalogConfiguration](#GetAppCatalogConfiguration)

success flag will tell whether the operation was successful.






---


#### getConfigurationByType
Get configured details for catalog



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




configured details for catalog.

*Returned Response*




[GetAppCatalogEntityConfiguration](#GetAppCatalogEntityConfiguration)

Get application level configured catalog details. See example below or refer `GetAppCatalogEntityConfigurationSchema` for details






---


#### getQueryFilters
Get query filters to configure a collection



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get query filters to configure a collection

*Returned Response*




[GetCollectionQueryOptionResponse](#GetCollectionQueryOptionResponse)

The attached items of an collection. See example below or refer `GetCollectionQueryOptionResponse` for details






---


#### createCollection
Add a Collection



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create a collection. See `CreateCollectionRequestSchema` for the list of attributes needed to create a collection and collections/query-options for the available options to create a collection. On successful request, returns a paginated list of collections specified in `CollectionCreateResponse`

*Returned Response*




[CollectionCreateResponse](#CollectionCreateResponse)

List of all the collections including the one you added. See example below or refer `CollectionCreateResponse` for details






---


#### getAllCollections
List all the collections



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




A Collection allows you to organize your products into hierarchical groups. For example, a dress might be in the category _Clothing_, the individual product might also be in the collection _Summer_. On successful request, returns all the collections as specified in `CollectionListingSchema`

*Returned Response*




[GetCollectionListingResponse](#GetCollectionListingResponse)

List of collections. See example below or refer `GetCollectionListingResponse` for details






---


#### getCollectionDetail
Get a particular collection



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get the details of a collection by its `slug`. If successful, returns a Collection resource in the response body specified in `CollectionDetailResponse`

*Returned Response*




[CollectionDetailResponse](#CollectionDetailResponse)

The Collection object. See example below or refer `CollectionDetailResponse` for details






---


#### updateCollection
Update a collection



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update a collection by it's id. On successful request, returns the updated collection

*Returned Response*




[UpdateCollection](#UpdateCollection)

The Collection object. See example below or refer `UpdateCollectionSchema` for details.






---


#### deleteCollection
Delete a Collection



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Delete a collection by it's id. Returns an object that tells whether the collection was deleted successfully

*Returned Response*




[DeleteResponse](#DeleteResponse)

Status object. Tells whether the operation was successful. See example below or refer `DeleteResponse`






---


#### addCollectionItems
Add items to a collection



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Adds items to a collection specified by its `id`. See `CollectionItemRequest` for the list of attributes needed to add items to an collection.

*Returned Response*




[UpdatedResponse](#UpdatedResponse)

Status object. Tells whether the operation was successful.






---


#### getCollectionItems
Get the items for a collection



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get items from a collection specified by its `id`.

*Returned Response*




[GetCollectionItemsResponse](#GetCollectionItemsResponse)

The attached items of an collection. See example below or refer `GetCollectionItemsResponseSchema` for details






---


#### getCatalogInsights
Analytics data of catalog and inventory.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Catalog Insights api returns the count of catalog related data like products, brands, departments and categories that have been made live as per configuration of the app.

*Returned Response*




[CatalogInsightResponse](#CatalogInsightResponse)

Response Data






---


#### getSellerInsights
Analytics data of catalog and inventory that are being cross-selled.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Analytics data of catalog and inventory that are being cross-selled.

*Returned Response*




[CrossSellingResponse](#CrossSellingResponse)

Response Data






---


#### createMarketplaceOptin
Create/Update opt-in infomation.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to create/update opt-in information for given platform. If successful, returns data in the response body as specified in `OptInPostResponseSchema`

*Returned Response*




[UpdatedResponse](#UpdatedResponse)

See example below or refer `UpdatedResponse` for details.






---


#### getMarketplaceOptinDetail
Get opt-in infomation.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Use this API to fetch opt-in information for all the platforms. If successful, returns a logs in the response body as specified in `GetOptInPlatformSchema`

*Returned Response*




[GetOptInPlatform](#GetOptInPlatform)

See example below or refer `GetOptInPlatformSchema` for details.






---


#### getCompanyDetail
Get the Company details.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get the details of the company associated with the given company_id passed.

*Returned Response*




[OptinCompanyDetail](#OptinCompanyDetail)

See example below or refer `OptinCompanyDetailSchema` for details






---


#### getCompanyBrandDetail
Get the Company Brand details of Optin.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get the details of the Brands associated with the given company_id passed.

*Returned Response*




[OptinCompanyBrandDetailsView](#OptinCompanyBrandDetailsView)

See example below or refer `OptinCompanyBrandDetailsView` for details






---


#### getCompanyMetrics
Get the Company metrics



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get the Company metrics associated with the company ID passed.

*Returned Response*




[OptinCompanyMetrics](#OptinCompanyMetrics)

See example below or refer `OptinCompanyMetrics` for details






---


#### getStoreDetail
Get the Store details.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get the details of the store associated with the company ID passed.

*Returned Response*




[OptinStoreDetails](#OptinStoreDetails)

See example below or refer `OptinStoreDetailsSchema` for details






---


#### getGenderAttribute
Get gender attribute details



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to view the gender attribute details.

*Returned Response*




[GenderDetail](#GenderDetail)

Size guide object. See example below or refer `GenderDetailSchema` for details






---


#### listProductTemplateCategories
List Department specifiec product categories



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Allows you to list all product categories values for the departments specified

*Returned Response*




[ProdcutTemplateCategoriesResponse](#ProdcutTemplateCategoriesResponse)

List of all categories attached to departments specified. See example below or refer `ProdcutTemplateCategoriesResponse` for details






---


#### listDepartmentsData
List all Departments



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Allows you to list all departments, also can search using name and filter active and incative departments, and item type

*Returned Response*




[DepartmentsResponse](#DepartmentsResponse)

List of departments data. See example below or refer `DepartmentsResponse` for details






---


#### getDepartmentData
Get specific departments details by passing in unique id of the department



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Allows you to get department data, by uid

*Returned Response*




[DepartmentsResponse](#DepartmentsResponse)

Departments Data. See example below or refer `DepartmentsResponse` for details






---


#### listProductTemplate
List all Templates



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Allows you to list all product templates, also can filter by department

*Returned Response*




[TemplatesResponse](#TemplatesResponse)

List of product templates. See example below or refer `TemplatesResponse` for details






---


#### validateProductTemplate
Validate Product Template Schema



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Allows you to list all product templates validation values for all the fields present in the database

*Returned Response*




[TemplatesValidationResponse](#TemplatesValidationResponse)

List of fields and validation values fro each. See example below or refer `TemplatesValidationResponse` for details






---


#### downloadProductTemplateViews
Download Product Template View



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Allows you to download product template data

*Returned Response*




[String](#String)

CSV File of product template data. See example below or refer `TemplatesResponse` for details






---


#### downloadProductTemplateView
Download Product Template View



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Allows you to download product template data

*Returned Response*




[String](#String)

CSV File of product template data.






---


#### validateProductTemplateSchema
Validate Product Template Schema



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Allows you to list all product templates validation values for all the fields present in the database

*Returned Response*




[InventoryValidationResponse](#InventoryValidationResponse)

List of fields and validation values fro each. See example below or refer `InventoryValidationResponse` for details






---


#### listHSNCodes
List HSN Codes



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Allows you to list all hsn Codes

*Returned Response*




[HSNCodesResponse](#HSNCodesResponse)

List of all HSN Codes. See example below or refer `HSNCodesResponse` for details






---


#### listProductTemplateExportDetails
Allows you to list all product templates export list details



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Can view details including trigger data, task id , etc.

*Returned Response*




[ProductDownloadsResponse](#ProductDownloadsResponse)

List of Product Downloads Data. See example below or refer `ProductDownloadsResponse` for details






---


#### listTemplateBrandTypeValues
Allows you to list all values for Templates, Brands or Type



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




The filter type query parameter defines what type of data to return. The type of query returns the valid values for the same

*Returned Response*




[ProductConfigurationDownloads](#ProductConfigurationDownloads)

See example below or refer `ProductConfigurationDownloadsSchema` for details






---


#### createCategories
Create product categories



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API lets user create product categories

*Returned Response*




[CategoryCreateResponse](#CategoryCreateResponse)

Category Meta. See example below or refer `CategoryCreateResponse` for details






---


#### listCategories
Get product categories list



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API gets meta associated to product categories.

*Returned Response*




[CategoryResponse](#CategoryResponse)

Category Meta. See example below or refer `CategoryResponse` for details






---


#### updateCategory
Update product categories



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update a product category using this apu

*Returned Response*




[CategoryUpdateResponse](#CategoryUpdateResponse)

Category Meta. See example below or refer `CategoryUpdateResponse` for details






---


#### getCategoryData
Get product category by uid



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API gets meta associated to product categories.

*Returned Response*




[SingleCategoryResponse](#SingleCategoryResponse)

Get Data for one category. See example below or refer `CategoryResponse` for details






---


#### createProduct
Create a product.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to create product.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getProducts
Get product list



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API gets meta associated to products.

*Returned Response*




[ProductListingResponse](#ProductListingResponse)

Product Meta. See example below for details






---


#### editProduct
Edit a product.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to edit product.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getProduct
Get a single product.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to get data associated to a particular product.

*Returned Response*




[Product](#Product)

Product object. See example below or refer `product.utils.format_product_response` for details






---


#### deleteProduct
Delete a product.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to delete product.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getProductValidation
Validate product/size data



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API validates product data.

*Returned Response*




[ValidateProduct](#ValidateProduct)

Validate Meta. See example below for details






---


#### getProductSize
Get a single product size.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to get data associated to a particular product size.

*Returned Response*




[ProductListingResponse](#ProductListingResponse)

Product object. See example below for details






---


#### updateProductAssetsInBulk
Create a Bulk asset upload Job.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to create a bulk asset upload job.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getProductBulkUploadHistory
Get a list of all bulk product upload jobs.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to get bulk product upload jobs data.

*Returned Response*




[ProductBulkRequestList](#ProductBulkRequestList)

List of bulk product upload jobs. See `BulkRequestGetSchema` for details






---


#### createProductsInBulk
Create products in bulk associated with given batch Id.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to create products in bulk push to kafka for approval/creation.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### deleteProductBulkJob
Delete Bulk product job.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to delete bulk product job associated with company.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getCompanyTags
Get a list of all tags associated with company.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to get tags data associated to a particular copmpany.

*Returned Response*




[ProductTagsViewResponse](#ProductTagsViewResponse)

Tag List. See example below for details






---


#### createProductAssetsInBulk
Create a Bulk asset upload Job.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to create a bulk asset upload job.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getProductAssetsInBulk
Get a list of all bulk asset jobs.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to get bulk asset jobs data associated to a particular company.

*Returned Response*




[BulkAssetResponse](#BulkAssetResponse)

List of bulk asset jobs List. See `BulkUtil.modify_batch_response` for details






---


#### deleteSize
Delete a Size associated with product.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to delete size associated with product.

*Returned Response*




[ProductSizeDeleteResponse](#ProductSizeDeleteResponse)

Returns a success response






---


#### addInventory
Add Inventory for particular size and store.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows add Inventory for particular size and store.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getInventoryBySize
Get Inventory for company



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows get Inventory data for particular company grouped by size and store.

*Returned Response*




[InventoryResponse](#InventoryResponse)

returns a list of all inventory grouped by size and store






---


#### getInventoryBySizeIdentifier
Get Inventory for company



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows get Inventory data for particular company grouped by size and store.

*Returned Response*




[InventoryResponse](#InventoryResponse)

returns a list of all inventory grouped by size and store






---


#### deleteInventory
Delete a Inventory.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to delete inventory of a particular product for particular company.

*Returned Response*




[InventoryDelete](#InventoryDelete)

Returns a success response






---


#### createBulkInventoryJob
Create a Bulk Inventory upload Job.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to create a bulk Inventory upload job.

*Returned Response*




[CommonResponse](#CommonResponse)

Returns a success response






---


#### getInventoryBulkUploadHistory
Get a list of all bulk Inventory upload jobs.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to get bulk Inventory upload jobs data.

*Returned Response*




[BulkInventoryGet](#BulkInventoryGet)

List of bulk Inventory upload jobs. See `BulkInventoryGetSchema` for details






---


#### createBulkInventory
Create products in bulk associated with given batch Id.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to create products in bulk push to kafka for approval/creation.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### deleteBulkInventoryJob
Delete Bulk Inventory job.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to delete bulk Inventory job associated with company.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### createInventoryExportJob
Create a Inventory export Job.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to create a Inventory export job.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getInventoryExport
Get Inventory export history.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to get Inventory export history.

*Returned Response*




[InventoryExportJob](#InventoryExportJob)

Returns a list of inventory export jobs






---


#### exportInventoryConfig
Get List of different filters for inventory export



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows get List of different filters like brand, store, and type for inventory export.

*Returned Response*




[InventoryConfig](#InventoryConfig)

returns filters configuration for inventory export






---


#### createHsnCode
Create Hsn Code.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create Hsn Code.

*Returned Response*




[HsnCode](#HsnCode)

See example below for details






---


#### getAllHsnCodes
Hsn Code List.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Hsn Code List.

*Returned Response*




[HsnCodesListingResponse](#HsnCodesListingResponse)

List of all HSN Codes. See example below or refer `HsnCodesListingResponseSchema` for details






---


#### updateHsnCode
Update Hsn Code.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update Hsn Code.

*Returned Response*




[HsnCode](#HsnCode)

See example below for details






---


#### getHsnCode
Fetch Hsn Code.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Fetch Hsn Code.

*Returned Response*




[HsnCode](#HsnCode)

See example below details






---


#### bulkHsnCode
Bulk Create or Update Hsn Code.



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Bulk Create or Update Hsn Code.

*Returned Response*




[BulkHsnResponse](#BulkHsnResponse)

See example below for details






---


#### getApplicationBrands
List all the brands



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




A brand is the name under which a product is being sold. Use this API to list all the brands. You can pass optionally filter the brands by the department. If successful, returns a paginated list of brands specified in `BrandListingResponse`

*Returned Response*




[BrandListingResponse](#BrandListingResponse)

List of Brands. See example below or refer `BrandListingResponse` for details






---


#### getDepartments
List all the departments



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Departments are a way to categorise similar products. A product can lie in multiple departments. For example, a skirt can below to the 'Women's Fashion' Department while a handbag can lie in 'Women's Accessories' Department. Use this API to list all the departments. If successful, returns the list of departments specified in `DepartmentResponse`

*Returned Response*




[DepartmentResponse](#DepartmentResponse)

List of Departments. See example below or refer `DepartmentResponse` for details.






---


#### getCategories
List all the categories



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




List all the categories. You can optionally pass filter the brands by the department. If successful, returns a paginated list of brands specified in `CategoryListingResponse`

*Returned Response*




[CategoryListingResponse](#CategoryListingResponse)

List of Categories. See example below or refer `CategoryListingResponse` for details.






---


#### getAppicationProducts
List the products



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




List all the products associated with a brand, collection or category in a requested sort order. The API additionally supports arbitrary search queries that may refer the name of any product, brand, category or collection. If successful, returns a paginated list of products specified in `ApplicationProductListingResponse`

*Returned Response*




[ApplicationProductListingResponse](#ApplicationProductListingResponse)

List of Products. See example below or refer `ApplicationProductListingResponse` for details






---


#### getProductDetailBySlug
Get a product



```kotlin
catalog.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Products are the core resource of an application. Products can be associated by categories, collections, brands and more. This API retrieves the product specified by the given **slug**. If successful, returns a Product resource in the response body specified in `ProductDetail`

*Returned Response*




[ProductDetail](#ProductDetail)

The Product object. See example below or refer `ProductDetail` for details.






---




## CompanyProfile


#### cbsOnboardGet
Get company profile



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to view the company profile of the seller account.

*Returned Response*




[GetCompanyProfileSerializerResponse](#GetCompanyProfileSerializerResponse)

Company profile object. See example below or refer `GetCompanyProfileSerializerResponse` for details






---


#### updateCompany
Edit company profile



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to edit the company profile of the seller account.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success message






---


#### getCompanyMetrics
Get company metrics



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to view the company metrics, i.e. the status of its brand and stores. Also its allows to view the number of products, company documents & store documents which are verified and unverified.

*Returned Response*




[MetricsSerializer](#MetricsSerializer)

Metrics response object. See example below or refer `MetricsSerializer` for details






---


#### editBrand
Edit a brand.



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to edit meta of a brand.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getBrand
Get a single brand.



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to get data associated to a particular brand.

*Returned Response*




[GetBrandResponseSerializer](#GetBrandResponseSerializer)

Brand object. See example below or refer `GetBrandResponseSerializer` for details






---


#### createBrand
Create a Brand.



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to create a brand associated to a company.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getBrands
Get brands associated to a company



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to get view brands associated to a particular company.

*Returned Response*




[CompanyBrandListSerializer](#CompanyBrandListSerializer)

Brand object. See example below or refer `CompanyBrandListSerializer` for details






---


#### createCompanyBrandMapping
Create a company brand mapping.



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to create a company brand mapping, for a already existing brand in the system.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getLocations
Get list of locations



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to view all the locations asscoiated to a company.

*Returned Response*




[LocationListSerializer](#LocationListSerializer)

Company profile object. See example below or refer `LocationListSerializer` for details






---


#### createLocation
Create a location asscoiated to a company.



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to create a location associated to a company.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### updateLocation
Edit a location asscoiated to a company.



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to edit a location associated to a company.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---


#### getLocationDetail
Get details of a specific location.



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API helps to get data associated to a specific location.

*Returned Response*




[GetLocationSerializer](#GetLocationSerializer)

Brand object. See example below or refer `GetLocationSerializer` for details






---


#### createLocationBulk
Create a location asscoiated to a company in bulk.



```kotlin
companyprofile.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




This API allows to create a location associated to a company.

*Returned Response*




[SuccessResponse](#SuccessResponse)

Returns a success response






---




## FileStorage


#### startUpload
This operation initiates upload and returns storage link which is valid for 30 Minutes. You can use that storage link to make subsequent upload request with file buffer or blob.



```kotlin
filestorage.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




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


*Returned Response*




[StartResponse](#StartResponse)

Success






---


#### completeUpload
This will complete the upload process. After successfully uploading file, you can call this operation to complete the upload process.



```kotlin
filestorage.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




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


*Returned Response*




[CompleteResponse](#CompleteResponse)

Success






---


#### appStartUpload
This operation initiates upload and returns storage link which is valid for 30 Minutes. You can use that storage link to make subsequent upload request with file buffer or blob.



```kotlin
filestorage.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




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


*Returned Response*




[StartResponse](#StartResponse)

Success






---


#### appCompleteUpload
This will complete the upload process. After successfully uploading file, you can call this operation to complete the upload process.



```kotlin
filestorage.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




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


*Returned Response*




[CompleteResponse](#CompleteResponse)

Success






---


#### getSignUrls
Explain here



```kotlin
filestorage.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Describe here

*Returned Response*




[SignUrlResponse](#SignUrlResponse)

Success






---


#### copyFiles
Copy Files



```kotlin
filestorage.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Copy Files

*Returned Response*




[BulkResponse](#BulkResponse)

Success






---


#### appCopyFiles
Copy Files



```kotlin
filestorage.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Copy Files

*Returned Response*




[BulkResponse](#BulkResponse)

Success






---


#### browse
Browse Files



```kotlin
filestorage.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Browse Files

*Returned Response*




[BrowseResponse](#BrowseResponse)

Success






---


#### browse
Browse Files



```kotlin
filestorage.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Browse Files

*Returned Response*




[BrowseResponse](#BrowseResponse)

Success






---


#### proxy
Proxy



```kotlin
filestorage.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Proxy

*Returned Response*




[String](#String)

Success






---




## Share


#### createShortLink
Create short link



```kotlin
share.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create short link

*Returned Response*




[ShortLinkRes](#ShortLinkRes)

Success






---


#### getShortLinks
Get short links



```kotlin
share.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get short links

*Returned Response*




[ShortLinkList](#ShortLinkList)

Success






---


#### getShortLinkByHash
Get short link by hash



```kotlin
share.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get short link by hash

*Returned Response*




[ShortLinkRes](#ShortLinkRes)

Success






---


#### updateShortLinkById
Update short link by id



```kotlin
share.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update short link by id

*Returned Response*




[ShortLinkRes](#ShortLinkRes)

Success






---




## Inventory


#### getJobsByCompany
Get Job Configs For A Company



```kotlin
inventory.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




REST Endpoint that returns all job configs for a company

*Returned Response*




[ResponseEnvelopeListJobConfigRawDTO](#ResponseEnvelopeListJobConfigRawDTO)

Successful operation






---


#### updateJob
Updates An Existing Job Config



```kotlin
inventory.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




REST Endpoint that updates a job config

*Returned Response*




---


#### createJob
Creates A New Job Config



```kotlin
inventory.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




REST Endpoint that creates a new job config

*Returned Response*




[ResponseEnvelopeString](#ResponseEnvelopeString)

Job Config Created Successfully






---


#### getJobByCompanyAndIntegration
Get Job Configs By Company And Integration



```kotlin
inventory.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




REST Endpoint that returns all job configs by company And integration

*Returned Response*




[ResponseEnvelopeListJobConfigDTO](#ResponseEnvelopeListJobConfigDTO)

Successful operation






---


#### getJobConfigDefaults
Get Job Configs Defaults



```kotlin
inventory.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




REST Endpoint that returns default fields job configs by company And integration

*Returned Response*




[ResponseEnvelopeJobConfigDTO](#ResponseEnvelopeJobConfigDTO)

Successful operation






---


#### getJobByCode
Get Job Config By Code



```kotlin
inventory.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




REST Endpoint that returns job config by code

*Returned Response*




[ResponseEnvelopeJobConfigDTO](#ResponseEnvelopeJobConfigDTO)

Successful operation






---


#### getJobCodeMetrics
Get Job Metrics



```kotlin
inventory.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




REST Endpoint that returns Inventory Run History For A Job Code

*Returned Response*




[ResponseEnvelopeJobMetricsDto](#ResponseEnvelopeJobMetricsDto)

Successful operation






---


#### getJobCodesByCompanyAndIntegration
Get Job Codes By Company And Integration



```kotlin
inventory.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




REST Endpoint that returns all job codes by company And integration

*Returned Response*




[ResponseEnvelopeListJobConfigListDTO](#ResponseEnvelopeListJobConfigListDTO)

Successful operation






---




## Configuration


#### getBuildConfig
Get latest build config



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get latest build config

*Returned Response*




[MobileAppConfiguration](#MobileAppConfiguration)

Success






---


#### updateBuildConfig
Update build config for next build



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update build config for next build

*Returned Response*




[MobileAppConfiguration](#MobileAppConfiguration)

Success






---


#### getPreviousVersions
Get previous build versions



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get previous build versions

*Returned Response*




[BuildVersionHistory](#BuildVersionHistory)

Success






---


#### getAppFeatures
Get features of application



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get features of application

*Returned Response*




[AppFeatureResponse](#AppFeatureResponse)

Success






---


#### updateAppFeatures
Update features of application



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update features of application

*Returned Response*




[AppFeature](#AppFeature)

Success






---


#### getAppBasicDetails
Get basic application details



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get basic application details like name

*Returned Response*




[ApplicationDetail](#ApplicationDetail)

Success






---


#### updateAppBasicDetails
Add or update application's basic details



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Add or update application's basic details

*Returned Response*




[ApplicationDetail](#ApplicationDetail)

Success






---


#### getAppContactInfo
Get application information



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get Application Current Information. This includes information about social links, address and contact information of company/seller/brand of the application.

*Returned Response*




[ApplicationInformation](#ApplicationInformation)

Success






---


#### updateAppContactInfo
Get application information



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Save Application Current Information. This includes information about social links, address and contact information of an application.

*Returned Response*




[ApplicationInformation](#ApplicationInformation)

Success






---


#### getAppApiTokens
Get social tokens



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get social tokens.

*Returned Response*




[TokenResponse](#TokenResponse)

Success






---


#### updateAppApiTokens
Add social tokens



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Add social tokens.

*Returned Response*




[TokenResponse](#TokenResponse)

Success






---


#### getAppCompanies
Application inventory enabled companies



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Application inventory enabled companies.

*Returned Response*




[CompaniesResponse](#CompaniesResponse)

Success






---


#### getAppStores
Application inventory enabled stores



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Application inventory enabled stores.

*Returned Response*




[StoresResponse](#StoresResponse)

Success






---


#### getInventoryConfig
Get application configuration



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get application configuration for various features and data

*Returned Response*




[ApplicationInventory](#ApplicationInventory)

Success






---


#### updateInventoryConfig
Update application configuration



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update application configuration for various features and data

*Returned Response*




[ApplicationInventory](#ApplicationInventory)

Success






---


#### partiallyUpdateInventoryConfig
Partially update application configuration



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Partially update application configuration for various features and data

*Returned Response*




[ApplicationInventory](#ApplicationInventory)

Success






---


#### getAppCurrencyConfig
Get application enabled currency list



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get application enabled currency list

*Returned Response*




[AppSupportedCurrency](#AppSupportedCurrency)

Success






---


#### updateAppCurrencyConfig
Add initial application supported currency



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Add initial application supported currency for various features and data. Default INR will be enabled.

*Returned Response*




[AppSupportedCurrency](#AppSupportedCurrency)

Success






---


#### getOrderingStoresByFilter
Get ordering store by filter



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get ordering store by filter

*Returned Response*




[OrderingStores](#OrderingStores)

Success






---


#### updateOrderingStoreConfig
Add/Update ordering store config



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Add/Update ordering store config.

*Returned Response*




[DeploymentMeta](#DeploymentMeta)

Success






---


#### getDomains
Get attached domain list



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get attached domain list.

*Returned Response*




[DomainsResponse](#DomainsResponse)

Success






---


#### addDomain
Add new domain to application



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Add new domain to application.

*Returned Response*




[Domain](#Domain)

Success






---


#### removeDomainById
Remove attached domain



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Remove attached domain.

*Returned Response*




[SuccessMessageResponse](#SuccessMessageResponse)

Success






---


#### changeDomainType
Change domain type



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Change a domain to Primary or Shortlink domain

*Returned Response*




[DomainsResponse](#DomainsResponse)

Success






---


#### getDomainStatus
Get domain connected status.



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get domain connected status. Check if domain is live and mapped to appropriate IP to fynd servers.

*Returned Response*




[DomainStatusResponse](#DomainStatusResponse)

Success






---


#### createApplication
Create application



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create new application

*Returned Response*




[CreateAppResponse](#CreateAppResponse)

Success






---


#### getApplications
Get list of application under company



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get list of application under company

*Returned Response*




[ApplicationsResponse](#ApplicationsResponse)

Success






---


#### getApplicationById
Get application data from id



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get application data from id

*Returned Response*




[Application](#Application)

Success






---


#### getCurrencies
Get all currencies



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get all currencies

*Returned Response*




[CurrenciesResponse](#CurrenciesResponse)

Currencies Success response






---


#### getDomainAvailibility
Check domain availibility before linking to application



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Check domain availibility before linking to application. Also sends domain suggestions with similar to queried domain. \ Custom domain search is currently powered by GoDaddy provider.

*Returned Response*




[DomainSuggestionsResponse](#DomainSuggestionsResponse)

Success






---


#### getIntegrationById
Get integration data



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get integration data

*Returned Response*




[Integration](#Integration)

Success






---


#### getAvailableOptIns
Get all available integration opt-ins



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get all available integration opt-ins

*Returned Response*




[GetIntegrationsOptInsResponse](#GetIntegrationsOptInsResponse)

Success






---


#### getSelectedOptIns
Get company/store level integration opt-ins



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get company/store level integration opt-ins

*Returned Response*




[GetIntegrationsOptInsResponse](#GetIntegrationsOptInsResponse)

Success






---


#### getIntegrationLevelConfig
Get integration level config



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get integration level config

*Returned Response*




[IntegrationConfigResponse](#IntegrationConfigResponse)

Success






---


#### getIntegrationByLevelId
Get level data for integration



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get level data for integration

*Returned Response*




[IntegrationLevel](#IntegrationLevel)

Success






---


#### getLevelActiveIntegrations
Check store has active integration



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




API checks if a store is already opted in any other integrations

*Returned Response*




[OptedStoreIntegration](#OptedStoreIntegration)

Success






---


#### getBrandsByCompany
Get brands by company



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get brands by company

*Returned Response*




[BrandsByCompanyResponse](#BrandsByCompanyResponse)

Success






---


#### getCompanyByBrands
Get company by brand uids



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get company by brand uids

*Returned Response*




[CompanyByBrandsResponse](#CompanyByBrandsResponse)

Success






---


#### getStoreByBrands
Get stores by brand uids



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get stores by brand uids

*Returned Response*




[StoreByBrandsResponse](#StoreByBrandsResponse)

Success






---


#### getOtherSellerApplications
Get other seller applications



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get other seller applications who has opted current company as inventory

*Returned Response*




[OtherSellerApplications](#OtherSellerApplications)

Success






---


#### getOtherSellerApplicationById
Get other seller applications



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get other seller application

*Returned Response*




[OptedApplicationResponse](#OptedApplicationResponse)

Success






---


#### optOutFromApplication
Opt out company or store from other seller application



```kotlin
configuration.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Opt out company or store from other seller application

*Returned Response*




[SuccessMessageResponse](#SuccessMessageResponse)

Success






---




## Cart


#### getCoupons
Get with single coupon details or coupon list



```kotlin
cart.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get coupon list with pagination

*Returned Response*




[CouponsResponse](#CouponsResponse)

Coupon List for sent page_size and page_no






---


#### createCoupon
Create new coupon



```kotlin
cart.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create new coupon

*Returned Response*




---


#### getCouponById
Get with single coupon details or coupon list



```kotlin
cart.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get single coupon details with `id` in path param

*Returned Response*




[CouponUpdate](#CouponUpdate)

Coupon object for sent `id`






---


#### updateCoupon
Update existing coupon configuration



```kotlin
cart.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update coupon with id sent in `id`

*Returned Response*




[SuccessMessage](#SuccessMessage)

Coupon updated successfully






---


#### updateCouponPartially
Update coupon archive state and schedule



```kotlin
cart.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update archive/unarchive and change schedule for coupon

*Returned Response*




[SuccessMessage](#SuccessMessage)

Coupon updated successfully






---




## Rewards


#### getGiveaways
List of giveaways of the current application.



```kotlin
rewards.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




List of giveaways of the current application.

*Returned Response*




[GiveawayResponse](#GiveawayResponse)

ok






---


#### createGiveaway
Adds a new giveaway.



```kotlin
rewards.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Adds a new giveaway.

*Returned Response*




[Giveaway](#Giveaway)

ok






---


#### getGiveawayByID
Get giveaway by ID.



```kotlin
rewards.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get giveaway by ID.

*Returned Response*




[Giveaway](#Giveaway)

ok






---


#### updateGiveaway
Updates the giveaway by it's ID.



```kotlin
rewards.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Updates the giveaway by it's ID.

*Returned Response*




[Giveaway](#Giveaway)

ok






---


#### getOffers
List of offer of the current application.



```kotlin
rewards.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




List of offer of the current application.

*Returned Response*




[ArrayList<Offer>](#ArrayList<Offer>)

ok






---


#### getOfferByName
Get offer by name.



```kotlin
rewards.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get offer by name.

*Returned Response*




[Offer](#Offer)

ok






---


#### updateOfferByName
Updates the offer by name.



```kotlin
rewards.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Updates the offer by name.

*Returned Response*




[Offer](#Offer)

ok






---


#### getUserAvailablePoints
User's reward details.



```kotlin
rewards.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




User's reward details.

*Returned Response*




[UserRes](#UserRes)

ok






---


#### updateUserStatus
Update User status



```kotlin
rewards.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update user status, active/archive

*Returned Response*




[AppUser](#AppUser)

Success






---


#### getUserPointsHistory
Get list of points transactions.



```kotlin
rewards.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get list of points transactions.
The list of points history is paginated.

*Returned Response*




[HistoryRes](#HistoryRes)

ok






---




## Analytics


#### getStatiscticsGroups
Get statistics groups



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get statistics groups

*Returned Response*




[StatsGroups](#StatsGroups)

Success






---


#### getStatiscticsGroupComponents
Get statistics group components



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get statistics group components

*Returned Response*




[StatsGroupComponents](#StatsGroupComponents)

Success






---


#### getComponentStatsCSV
Get component statistics csv



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get component statistics csv

*Returned Response*




[String](#String)

Success






---


#### getComponentStatsPDF
Get component statistics pdf



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get component statistics pdf

*Returned Response*




[String](#String)

Success






---


#### getComponentStats
Get component statistics



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get component statistics

*Returned Response*




[StatsRes](#StatsRes)

Success






---


#### getAbandonCartList
Get abandon carts list



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get abandon carts list

*Returned Response*




[AbandonCartsList](#AbandonCartsList)

Success






---


#### getAbandonCartsCSV
Get abandon carts csv



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get abandon carts csv

*Returned Response*




[String](#String)

Success






---


#### getAbandonCartDetail
Get abandon carts details



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get abandon cart details

*Returned Response*




[AbandonCartDetail](#AbandonCartDetail)

Success






---


#### createExportJob
Create data export job in required format



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create data export job in required format

*Returned Response*




[ExportJobRes](#ExportJobRes)

Success






---


#### getExportJobStatus
Get data export job status



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get data export job status

*Returned Response*




[ExportJobStatusRes](#ExportJobStatusRes)

Success






---


#### getLogsList
Get logs list



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get logs list

*Returned Response*




[GetLogsListRes](#GetLogsListRes)

Success






---


#### searchLogs
Search logs



```kotlin
analytics.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Search logs

*Returned Response*




[SearchLogRes](#SearchLogRes)

Success






---




## Discount


#### getDiscounts
Fetch discount list.



```kotlin
discount.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Fetch discount list.

*Returned Response*




[ListOrCalender](#ListOrCalender)

Success






---


#### createDiscount
Create Discount.



```kotlin
discount.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create Discount.

*Returned Response*




[DiscountJob](#DiscountJob)

Success






---


#### getDiscount
Fetch discount.



```kotlin
discount.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Fetch discount.

*Returned Response*




[DiscountJob](#DiscountJob)

Success






---


#### updateDiscount
Create Discount.



```kotlin
discount.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Create Discount.

*Returned Response*




[DiscountJob](#DiscountJob)

Success






---


#### validateDiscountFile
Validate File.



```kotlin
discount.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Validate File.

*Returned Response*




[FileJobResponse](#FileJobResponse)

Success






---


#### downloadDiscountFile
Validate File.



```kotlin
discount.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Validate File.

*Returned Response*




[FileJobResponse](#FileJobResponse)

Success






---


#### getValidationJob
Validate File Job.



```kotlin
discount.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Validate File Job.

*Returned Response*




[FileJobResponse](#FileJobResponse)

Success






---


#### cancelValidationJob
Cancel Validation Job.



```kotlin
discount.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Cancel Validation Job.

*Returned Response*




[CancelJobResponse](#CancelJobResponse)

Success






---


#### getDownloadJob
Download File Job.



```kotlin
discount.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Download File Job.

*Returned Response*




[FileJobResponse](#FileJobResponse)

Success






---


#### cancelDownloadJob
Cancel Download Job.



```kotlin
discount.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Cancel Download Job.

*Returned Response*




[CancelJobResponse](#CancelJobResponse)

Success






---




## Partner


#### addProxyPath
Add proxy path for external url



```kotlin
partner.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Add proxy path for external url

*Returned Response*




[AddProxyResponse](#AddProxyResponse)

Success






---


#### removeProxyPath
Remove proxy path for external url



```kotlin
partner.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Remove proxy path for external url

*Returned Response*




---




## Webhook


#### getSubscribersByCompanyAndEventId
Get Subscribers By Company And Event



```kotlin
webhook.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Get Subscribers By Company And Event

*Returned Response*




[SubscriberConfigList](#SubscriberConfigList)

Success






---


#### registerSubscriberToEvent
Register Subscriber



```kotlin
webhook.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Register Subscriber

*Returned Response*




[SubscriberConfig](#SubscriberConfig)

Success






---


#### updateSubscriberConfig
Update Subscriber



```kotlin
webhook.().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




Update Subscriber

*Returned Response*




[SubscriberConfig](#SubscriberConfig)

Success






---





### Schemas


 
 
 #### [LocationDefaultLanguage](#LocationDefaultLanguage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [LocationDefaultCurrency](#LocationDefaultCurrency)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | symbol | String |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [LocationCountry](#LocationCountry)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | capital | String |  no  |  |
 | currency | String |  no  |  |
 | iso2 | String |  no  |  |
 | iso3 | String |  no  |  |
 | name | String |  no  |  |
 | parent | String |  no  |  |
 | phone_code | String |  no  |  |
 | type | String |  no  |  |
 | uid | Int |  no  |  |
 | __v | Int |  no  |  |
 | _id | String |  no  |  |
 | default_currency | [LocationDefaultCurrency](#LocationDefaultCurrency) |  no  |  |
 | default_language | [LocationDefaultLanguage](#LocationDefaultLanguage) |  no  |  |

---


 
 
 #### [Locations](#Locations)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[LocationCountry](#LocationCountry)> |  no  |  |

---




 
 
 #### [TicketList](#TicketList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Ticket](#Ticket)> |  no  | List of tickets |
 | filters | [Filter](#Filter) |  no  | All the filters available for tickets |
 | page | [Page](#Page) |  no  | Describes the pagination state |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | item_total | Int |  no  |  |
 | next_id | String |  no  |  |
 | has_previous | Boolean |  no  |  |
 | has_next | Boolean |  no  |  |
 | current | Int |  no  |  |
 | type | String? |  yes  |  |
 | size | Int |  no  |  |

---


 
 
 #### [TicketHistoryList](#TicketHistoryList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[TicketHistory](#TicketHistory)> |  no  | List of ticket history |
 | page | [Page](#Page) |  no  | Describes the pagination state |

---


 
 
 #### [CustomFormList](#CustomFormList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CustomForm](#CustomForm)> |  no  | List of forms |
 | page | [Page](#Page) |  no  | Describes the pagination state |

---


 
 
 #### [CreateCustomFormPayload](#CreateCustomFormPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String? |  yes  | Slug for the form |
 | title | String? |  yes  | Title for the form |
 | inputs | ArrayList<HashMap<String,Any>>? |  yes  | List of all the form components |
 | description | String |  no  | Description of the form |
 | header_image | String |  no  | Header image that is to be shown for the form |
 | priority | Any? |  yes  | Describes the priority of the tickets created by the form |
 | should_notify | Boolean |  no  | Indicates if staff should be notified when a response is received |
 | success_message | String |  no  | Success message that will be shown on submission |
 | poll_for_assignment | [PollForAssignment](#PollForAssignment) |  no  | Describes how polling will be done for the tickets createds |

---


 
 
 #### [EditCustomFormPayload](#EditCustomFormPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  | Title for the form |
 | inputs | ArrayList<HashMap<String,Any>>? |  yes  | List of all the form components |
 | description | String |  no  | Description of the form |
 | priority | Any? |  yes  | Describes the priority of the tickets created by the form |
 | header_image | String |  no  | Header image that is to be shown for the form |
 | should_notify | Boolean |  no  | Indicates if staff should be notified when a response is received |
 | login_required | Boolean |  no  | Denotes if login is required to make a form response submission |
 | success_message | String |  no  | Success message that will be shown on submission |
 | poll_for_assignment | [PollForAssignment](#PollForAssignment) |  no  | Describes how polling will be done for the tickets createds |

---


 
 
 #### [EditTicketPayload](#EditTicketPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | content | [TicketContent](#TicketContent) |  no  | Ticket conetent details |
 | category | String |  no  | Category assigned to the ticket |
 | sub_category | String |  no  | Sub-category assigned to the ticket |
 | source | String |  no  | Denotes if the ticket was created at company or application level |
 | status | String |  no  | Denotes in what state is the ticket |
 | priority | Any |  no  | Denotes the priority of ticket |
 | assigned_to | [AgentChangePayload](#AgentChangePayload) |  no  | Details of support staff to whom ticket is assigned |
 | tags | ArrayList<String> |  no  | Tags relevant to ticket |

---


 
 
 #### [AgentChangePayload](#AgentChangePayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | agent_id | String? |  yes  | Agent's unique ID |

---


 
 
 #### [CreateVideoRoomResponse](#CreateVideoRoomResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unique_name | String? |  yes  | Video Room's unique name |

---


 
 
 #### [CloseVideoRoomResponse](#CloseVideoRoomResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  | Denotes if operation was successfully |

---


 
 
 #### [CreateVideoRoomPayload](#CreateVideoRoomPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unique_name | String? |  yes  | Ticket id |
 | notify | ArrayList<[NotifyUser](#NotifyUser)> |  no  | List of people to be notified |

---


 
 
 #### [NotifyUser](#NotifyUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country_code | String? |  yes  | Country code |
 | phone_number | String? |  yes  | Phone number |

---


 
 
 #### [Filter](#Filter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priorities | ArrayList<[Priority](#Priority)>? |  yes  | List of possible priorities for tickets |
 | categories | ArrayList<[TicketCategory](#TicketCategory)> |  no  | List of possible categories for tickets |
 | statuses | ArrayList<[Status](#Status)>? |  yes  | List of possible statuses for tickets |
 | assignees | ArrayList<HashMap<String,Any>>? |  yes  | List of support staff availble for tickets assignment |

---


 
 
 #### [TicketHistoryPayload](#TicketHistoryPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | HashMap<String,Any>? |  yes  | Details of history event |
 | type | Any? |  yes  | Type of history event |

---


 
 
 #### [CustomFormSubmissionPayload](#CustomFormSubmissionPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | response | ArrayList<[KeyValue](#KeyValue)>? |  yes  | Form response |
 | attachments | ArrayList<[TicketAsset](#TicketAsset)> |  no  | List of all attachments related to the form |

---


 
 
 #### [KeyValue](#KeyValue)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  | Parameter for evaluating |
 | value | HashMap<String,Any>? |  yes  | Response for the parameter |

---


 
 
 #### [GetTokenForVideoRoomResponse](#GetTokenForVideoRoomResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | access_token | String? |  yes  | Access token to be used for video room |

---


 
 
 #### [GetParticipantsInsideVideoRoomResponse](#GetParticipantsInsideVideoRoomResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | participants | ArrayList<[Participant](#Participant)>? |  yes  | List of participants of the video room |

---


 
 
 #### [Participant](#Participant)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  | Details of participant |
 | identity | String |  no  | Unique identifier of participant |
 | status | String |  no  | Status of participant |

---


 
 
 #### [PhoneNumber](#PhoneNumber)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean |  no  | Denotes if the phone number is active |
 | primary | Boolean |  no  | Denotes it's the primary phone number for the account |
 | verified | Boolean |  no  | Denotes it's a verified phone number |
 | phone | String |  no  | Phone number |
 | country_code | Int |  no  | Country code |

---


 
 
 #### [Email](#Email)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | primary | Boolean |  no  | Denotes it's the primary email for the account |
 | verified | Boolean |  no  | Denotes it's a verified email |
 | email | String |  no  | Email Address |
 | active | Boolean |  no  | Denotes if the email is active |

---


 
 
 #### [Debug](#Debug)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | source | String |  no  | Source of user |
 | platform | String |  no  | Platform of user |

---


 
 
 #### [SubmitCustomFormResponse](#SubmitCustomFormResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ticket | [Ticket](#Ticket)? |  yes  | Ticket created on form submission |

---


 
 
 #### [TicketContext](#TicketContext)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application_id | String |  no  | Application ID related to the ticket |
 | company_id | String? |  yes  | Company ID related to the ticket |

---


 
 
 #### [CreatedOn](#CreatedOn)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user_agent | String? |  yes  | Useragent details |

---


 
 
 #### [TicketAsset](#TicketAsset)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  | Display text for asset |
 | value | String? |  yes  | To be used for details |
 | type | Any? |  yes  | Type of asset |

---


 
 
 #### [TicketContent](#TicketContent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  | Title for ticket |
 | description | String |  no  | Long description of issue |
 | attachments | ArrayList<[TicketAsset](#TicketAsset)> |  no  | List of all attachments related to the ticket |

---


 
 
 #### [AddTicketPayload](#AddTicketPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | created_by | HashMap<String,Any> |  no  | Creator of the ticket |
 | status | String |  no  | Status of the ticket |
 | priority | Any |  no  | Priority of the ticket |
 | category | String? |  yes  | Category of the ticket |
 | content | [TicketContent](#TicketContent)? |  yes  | Content for the ticket |

---


 
 
 #### [Priority](#Priority)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | [PriorityEnum](#PriorityEnum)? |  yes  | Key for priority |
 | display | String? |  yes  | Display text for priority |
 | color | String? |  yes  | Color for priority |

---


 
 
 #### [Status](#Status)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  | Key for status |
 | display | String? |  yes  | Display text for status |
 | color | String? |  yes  | Color for status |

---


 
 
 #### [TicketCategory](#TicketCategory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  | Key for category |
 | display | String? |  yes  | Display text for category |
 | form | [CustomForm](#CustomForm) |  no  | Form related to the category |
 | sub_categories | ArrayList<[TicketSubCategory](#TicketSubCategory)> |  no  | Sub-category related to the category |
 | feedback_form | [TicketFeedbackForm](#TicketFeedbackForm) |  no  | Feedback form of category used to submit ticket feedback |

---


 
 
 #### [TicketSubCategory](#TicketSubCategory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  | Key for sub-category |
 | display | String? |  yes  | Display text for sub-category |

---


 
 
 #### [TicketFeedbackForm](#TicketFeedbackForm)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  | Feedback form title that will be shown to the user |
 | display | ArrayList<HashMap<String,Any>> |  no  | List of all the form fields |

---


 
 
 #### [TicketFeedbackList](#TicketFeedbackList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[TicketFeedback](#TicketFeedback)> |  no  | List of all ticket feedback for the ticket |

---


 
 
 #### [TicketFeedbackPayload](#TicketFeedbackPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | form_response | HashMap<String,Any> |  no  | Key-value pairs of all the form fields and their response |

---


 
 
 #### [SubmitButton](#SubmitButton)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  | Title for submit button |
 | title_color | String? |  yes  | Title color submit button |
 | background_color | String? |  yes  | Color for submit button |

---


 
 
 #### [PollForAssignment](#PollForAssignment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | duration | Double? |  yes  | Duration for polling of staff |
 | message | String? |  yes  | Message for polling |
 | success_message | String? |  yes  | Message for successful polling |
 | failure_message | String? |  yes  | Message if polling failed |

---


 
 
 #### [CustomForm](#CustomForm)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application_id | String? |  yes  | Application ID for form |
 | slug | String? |  yes  | Slug for the form, which is to be used for accessing the form |
 | header_image | String |  no  | Form header image that will be shown to the user |
 | title | String? |  yes  | Form title that will be shown to the user |
 | description | String |  no  | Form description that will be shown to the user |
 | priority | [Priority](#Priority)? |  yes  | Sets priority of tickets created by form response |
 | login_required | Boolean? |  yes  | Denotes if login is required to make a form response submission |
 | should_notify | Boolean? |  yes  | Denotes if new response submission for the form should be notified to the assignees |
 | success_message | String |  no  | Message that is to be shown on succesfull form response submission |
 | submit_button | [SubmitButton](#SubmitButton) |  no  | Details for submit button |
 | inputs | ArrayList<HashMap<String,Any>>? |  yes  | List of all the form fields |
 | created_on | [CreatedOn](#CreatedOn) |  no  | Gives details of when the form was created |
 | created_by | HashMap<String,Any> |  no  | Gives details of user who created the form |
 | poll_for_assignment | [PollForAssignment](#PollForAssignment) |  no  | Details of how polling should be done for support |
 | _id | String? |  yes  | Unique identifier for the form |

---


 
 
 #### [FeedbackResponseItem](#FeedbackResponseItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  | Question/Title of the form field |
 | key | String? |  yes  | Key of the form field |
 | value | String? |  yes  | User response value for the form field |

---


 
 
 #### [TicketFeedback](#TicketFeedback)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String? |  yes  | Unique identifier for the feedback |
 | ticket_id | String? |  yes  | Readable ticket number |
 | company_id | String? |  yes  | Company id for which ticket was raised |
 | response | ArrayList<[FeedbackResponseItem](#FeedbackResponseItem)>? |  yes  |  |
 | category | String |  no  | Category of the ticket |
 | user | HashMap<String,Any> |  no  | User who submitted the feedback |
 | updated_at | String |  no  | Time when the feedback was last updated |
 | created_at | String |  no  | Time when the feedback was created |

---


 
 
 #### [TicketHistory](#TicketHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  | Type of the history event |
 | value | HashMap<String,Any>? |  yes  | Data of the history event |
 | ticket_id | String? |  yes  | Readable ticket number |
 | created_on | [CreatedOn](#CreatedOn) |  no  | Time of creation of the history event |
 | created_by | HashMap<String,Any> |  no  | User who created the history event |
 | _id | String? |  yes  | Unique identifier of the history event |
 | updated_at | String |  no  | Time of last update of the history event |
 | created_at | String |  no  | Time of creation of the history event |

---


 
 
 #### [Ticket](#Ticket)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | context | [TicketContext](#TicketContext) |  no  | Details of company and application realated to the ticket |
 | created_on | [CreatedOn](#CreatedOn) |  no  | Details of company and application realated to the ticket |
 | response_id | String |  no  | Details of company and application realated to the ticket |
 | content | [TicketContent](#TicketContent) |  no  | Ticket conetent details |
 | ticket_id | String? |  yes  | Readable ticket number |
 | category | [TicketCategory](#TicketCategory)? |  yes  | Category assigned to the ticket |
 | sub_category | [TicketSubCategory](#TicketSubCategory) |  no  | Sub-category assigned to the ticket |
 | source | Any? |  yes  | Denotes if the ticket was created at company or application level |
 | status | [Status](#Status)? |  yes  | Denotes in what state is the ticket |
 | priority | [Priority](#Priority)? |  yes  | Denotes the priority of ticket |
 | created_by | HashMap<String,Any> |  no  | User details of ticket creator |
 | assigned_to | HashMap<String,Any> |  no  | Details of support staff to whom ticket is assigned |
 | tags | ArrayList<String> |  no  | Tags relevant to ticket |
 | _custom_json | HashMap<String,Any> |  no  | custom json relevant to the ticket |
 | is_feedback_pending | Boolean |  no  | Denotes if feedback submission is pending for the ticket |
 | _id | String? |  yes  | Unique identifier for the ticket |
 | updated_at | String |  no  | Time when the ticket was last updated |
 | created_at | String |  no  | Time when the ticket was created |

---




 
 
 #### [Activity](#Activity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current_state | HashMap<String,Any> |  no  |  |
 | document_id | String |  no  |  |
 | previous_state | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ActivityDump](#ActivityDump)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | activity | [Activity](#Activity) |  no  |  |
 | created_by | [CreatedBy](#CreatedBy) |  no  |  |
 | date_meta | [DateMeta](#DateMeta) |  no  |  |
 | id | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [AddMediaListRequest](#AddMediaListRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entity_id | String |  no  |  |
 | entity_type | String |  no  |  |
 | media_list | ArrayList<[AddMediaRequest](#AddMediaRequest)> |  no  |  |
 | ref_id | String |  no  |  |
 | ref_type | String |  no  |  |

---


 
 
 #### [AddMediaRequest](#AddMediaRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cloud_id | String |  no  |  |
 | cloud_name | String |  no  |  |
 | cloud_provider | String |  no  |  |
 | entity_id | String |  no  |  |
 | entity_type | String |  no  |  |
 | media_url | String |  no  |  |
 | ref_id | String |  no  |  |
 | ref_type | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | thumbnail_url | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ApproveRequest](#ApproveRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | approve | Boolean |  no  |  |
 | entity_type | String |  no  |  |
 | id | String? |  yes  |  |
 | reason | String |  no  |  |

---


 
 
 #### [Attribute](#Attribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | date_meta | [DateMeta](#DateMeta) |  no  |  |
 | description | String |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | tags | ArrayList<[TagMeta](#TagMeta)> |  no  |  |

---


 
 
 #### [AttributeObject](#AttributeObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | name | String? |  yes  |  |
 | slug | String |  no  |  |
 | title | String |  no  |  |
 | type | String? |  yes  |  |
 | value | Double? |  yes  |  |

---


 
 
 #### [CreatedBy](#CreatedBy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | tags | ArrayList<[TagMeta](#TagMeta)> |  no  |  |

---


 
 
 #### [CursorGetResponse](#CursorGetResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<HashMap<String,Any>> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [DateMeta](#DateMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | created_on | String |  no  |  |
 | modified_on | String |  no  |  |

---


 
 
 #### [DeviceMeta](#DeviceMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app_version | String |  no  |  |
 | platform | String |  no  |  |

---


 
 
 #### [Entity](#Entity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [EntityRequest](#EntityRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entity_id | String |  no  |  |
 | entity_type | String |  no  |  |

---


 
 
 #### [FeedbackAttributes](#FeedbackAttributes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Attribute](#Attribute)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [FeedbackError](#FeedbackError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | HashMap<String,Any> |  no  |  |
 | exception | String |  no  |  |
 | info | String |  no  |  |
 | message | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | request_id | String |  no  |  |
 | stack_trace | String |  no  |  |
 | status | Int |  no  |  |

---


 
 
 #### [FeedbackState](#FeedbackState)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean |  no  |  |
 | archive | Boolean |  no  |  |
 | media | String |  no  | image, video, any |
 | qna | Boolean |  no  |  |
 | rating | Boolean |  no  |  |
 | review | Boolean |  no  |  |

---


 
 
 #### [GetResponse](#GetResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | HashMap<String,Any> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [GetReviewResponse](#GetReviewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | facets | ArrayList<[ReviewFacet](#ReviewFacet)> |  no  |  |
 | items | ArrayList<HashMap<String,Any>> |  no  |  |
 | page | [Page](#Page) |  no  |  |
 | sort | ArrayList<[SortMethod](#SortMethod)> |  no  |  |

---


 
 
 #### [InsertResponse](#InsertResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |

---


 
 
 #### [MediaMeta](#MediaMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max_count | Int |  no  |  |
 | size | Int |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [MediaMetaRequest](#MediaMetaRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max_count | Int? |  yes  |  |
 | size | Int? |  yes  |  |

---


 
 
 #### [NumberGetResponse](#NumberGetResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<HashMap<String,Any>> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [PageCursor](#PageCursor)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Int |  no  |  |
 | has_next | Boolean |  no  |  |
 | has_previous | Boolean |  no  |  |
 | item_total | Int |  no  |  |
 | next_id | String |  no  |  |
 | size | Int? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [PageNumber](#PageNumber)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Int |  no  |  |
 | has_next | Boolean |  no  |  |
 | item_total | Int |  no  |  |
 | size | Int |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [Rating](#Rating)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | ArrayList<[Attribute](#Attribute)> |  no  |  |
 | attributes_slugs | ArrayList<String> |  no  |  |
 | ui | [UI](#UI) |  no  |  |

---


 
 
 #### [RatingRequest](#RatingRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | ArrayList<String>? |  yes  |  |
 | ui | [UI](#UI) |  no  |  |

---


 
 
 #### [ReportAbuseRequest](#ReportAbuseRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | entity_id | String? |  yes  |  |
 | entity_type | String? |  yes  |  |

---


 
 
 #### [Review](#Review)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | header | String |  no  |  |
 | image_meta | [MediaMeta](#MediaMeta) |  no  |  |
 | title | String |  no  |  |
 | video_meta | [MediaMeta](#MediaMeta) |  no  |  |
 | vote_allowed | Boolean |  no  |  |

---


 
 
 #### [ReviewFacet](#ReviewFacet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | name | String |  no  |  |
 | selected | Boolean |  no  |  |
 | slug | String |  no  |  |
 | type | String |  no  | rating, attributerating |

---


 
 
 #### [ReviewRequest](#ReviewRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String? |  yes  |  |
 | header | String? |  yes  |  |
 | image_meta | [MediaMetaRequest](#MediaMetaRequest)? |  yes  |  |
 | is_vote_allowed | Boolean? |  yes  |  |
 | title | String? |  yes  |  |
 | video_meta | [MediaMetaRequest](#MediaMetaRequest)? |  yes  |  |

---


 
 
 #### [SaveAttributeRequest](#SaveAttributeRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |

---


 
 
 #### [SortMethod](#SortMethod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | selected | Boolean |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [TagMeta](#TagMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | media | ArrayList<[MediaMeta](#MediaMeta)> |  no  |  |
 | name | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [Template](#Template)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | date_meta | [DateMeta](#DateMeta) |  no  |  |
 | entity | [Entity](#Entity) |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | rating | [Rating](#Rating) |  no  |  |
 | review | [Review](#Review) |  no  |  |
 | state | [FeedbackState](#FeedbackState) |  no  |  |
 | tags | ArrayList<[TagMeta](#TagMeta)> |  no  |  |

---


 
 
 #### [TemplateGetResponse](#TemplateGetResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Template](#Template)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [TemplateRequest](#TemplateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean? |  yes  |  |
 | enable_media_type | String |  no  | image | video | any |
 | enable_qna | Boolean |  no  |  |
 | enable_rating | Boolean? |  yes  |  |
 | enable_review | Boolean? |  yes  |  |
 | entity | [EntityRequest](#EntityRequest)? |  yes  |  |
 | rating | [RatingRequest](#RatingRequest)? |  yes  |  |
 | review | [ReviewRequest](#ReviewRequest)? |  yes  |  |

---


 
 
 #### [TemplateRequestList](#TemplateRequestList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | template_list | ArrayList<[TemplateRequest](#TemplateRequest)>? |  yes  |  |

---


 
 
 #### [UI](#UI)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | feedback_question | ArrayList<String> |  no  |  |
 | icon | [UIIcon](#UIIcon) |  no  |  |
 | text | ArrayList<String> |  no  |  |
 | type | String |  no  | star | images | gifs | smileys |

---


 
 
 #### [UIIcon](#UIIcon)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | String |  no  |  |
 | inactive | String |  no  |  |
 | selected | ArrayList<String> |  no  |  |

---


 
 
 #### [UpdateAttributeRequest](#UpdateAttributeRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | name | String? |  yes  |  |
 | slug | String |  no  |  |

---


 
 
 #### [UpdateResponse](#UpdateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |

---


 
 
 #### [UpdateReviewRequest](#UpdateReviewRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean |  no  |  |
 | application | String |  no  |  |
 | approve | Boolean |  no  |  |
 | archive | Boolean |  no  |  |
 | attributes_rating | ArrayList<[AttributeObject](#AttributeObject)> |  no  |  |
 | description | String |  no  |  |
 | device_meta | [DeviceMeta](#DeviceMeta) |  no  |  |
 | entity_id | String |  no  |  |
 | entity_type | String |  no  |  |
 | media_resource | ArrayList<[MediaMeta](#MediaMeta)> |  no  |  |
 | rating | Double |  no  |  |
 | review_id | String |  no  |  |
 | template_id | String |  no  |  |
 | title | String |  no  |  |

---


 
 
 #### [UpdateTemplateRequest](#UpdateTemplateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean? |  yes  |  |
 | enable_media_type | String |  no  | image | video | any |
 | enable_qna | Boolean |  no  |  |
 | enable_rating | Boolean? |  yes  |  |
 | enable_review | Boolean? |  yes  |  |
 | entity | [EntityRequest](#EntityRequest)? |  yes  |  |
 | rating | [RatingRequest](#RatingRequest)? |  yes  |  |
 | review | [ReviewRequest](#ReviewRequest)? |  yes  |  |

---


 
 
 #### [UpdateTemplateStatusRequest](#UpdateTemplateStatusRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean |  no  |  |
 | archive | Boolean |  no  |  |

---




 
 
 #### [AvailablePageSchema](#AvailablePageSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | text | String |  no  |  |
 | path | String |  no  |  |
 | type | String |  no  |  |
 | sections | ArrayList<[AvailablePageSchemaSections](#AvailablePageSchemaSections)> |  no  |  |
 | sections_meta | ArrayList<[AvailablePageSectionMetaAttributes](#AvailablePageSectionMetaAttributes)> |  no  |  |
 | theme | String |  no  |  |
 | seo | [AvailablePageSeo](#AvailablePageSeo) |  no  |  |
 | props | ArrayList<HashMap<String,Any>> |  no  |  |
 | _id | String |  no  |  |

---


 
 
 #### [AvailablePageSectionMetaAttributes](#AvailablePageSectionMetaAttributes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | HashMap<String,Any> |  no  |  |

---


 
 
 #### [AvailablePageSeo](#AvailablePageSeo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | description | String |  no  |  |
 | _id | String |  no  |  |

---


 
 
 #### [AvailablePageSchemaSections](#AvailablePageSchemaSections)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | label | String |  no  |  |
 | props | HashMap<String,Any> |  no  |  |
 | blocks | ArrayList<HashMap<String,Any>> |  no  |  |
 | preset | HashMap<String,Any> |  no  |  |
 | predicate | [AvailablePagePredicate](#AvailablePagePredicate) |  no  |  |

---


 
 
 #### [AvailablePageScreenPredicate](#AvailablePageScreenPredicate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | Boolean |  no  |  |
 | desktop | Boolean |  no  |  |
 | tablet | Boolean |  no  |  |

---


 
 
 #### [AvailablePageUserPredicate](#AvailablePageUserPredicate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | authenticated | Boolean |  no  |  |
 | anonymous | Boolean |  no  |  |

---


 
 
 #### [AvailablePageRoutePredicate](#AvailablePageRoutePredicate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | selected | String |  no  |  |
 | exact_url | String |  no  |  |
 | query | HashMap<String,Any> |  no  |  |

---


 
 
 #### [AvailablePagePredicate](#AvailablePagePredicate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | screen | [AvailablePageScreenPredicate](#AvailablePageScreenPredicate) |  no  |  |
 | user | [AvailablePageUserPredicate](#AvailablePageUserPredicate) |  no  |  |
 | route | [AvailablePageRoutePredicate](#AvailablePageRoutePredicate) |  no  |  |

---


 
 
 #### [AllAvailablePageSchema](#AllAvailablePageSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pages | ArrayList<[AvailablePageSchema](#AvailablePageSchema)> |  no  |  |

---


 
 
 #### [PaginationSchema](#PaginationSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | Int |  no  |  |
 | item_total | Int |  no  |  |
 | has_next | Boolean |  no  |  |
 | type | String |  no  |  |
 | current | Int |  no  |  |

---


 
 
 #### [ThemesListingResponseSchema](#ThemesListingResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ThemesSchema](#ThemesSchema)> |  no  |  |
 | page | [PaginationSchema](#PaginationSchema) |  no  |  |

---


 
 
 #### [AddThemeRequestSchema](#AddThemeRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | theme_id | String |  no  |  |

---


 
 
 #### [UpgradableThemeSchema](#UpgradableThemeSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | parent_theme | String |  no  |  |
 | applied_theme | String |  no  |  |
 | upgrade | Boolean |  no  |  |

---


 
 
 #### [FontsSchema](#FontsSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [FontsSchemaItems](#FontsSchemaItems) |  no  |  |
 | kind | String |  no  |  |

---


 
 
 #### [BlitzkriegApiErrorSchema](#BlitzkriegApiErrorSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [BlitzkriegNotFoundSchema](#BlitzkriegNotFoundSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [BlitzkriegInternalServerErrorSchema](#BlitzkriegInternalServerErrorSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [FontsSchemaItems](#FontsSchemaItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | family | String |  no  |  |
 | variants | ArrayList<String> |  no  |  |
 | subsets | ArrayList<String> |  no  |  |
 | version | String |  no  |  |
 | last_modified | String |  no  |  |
 | files | [FontsSchemaItemsFiles](#FontsSchemaItemsFiles) |  no  |  |
 | category | String |  no  |  |
 | kind | String |  no  |  |

---


 
 
 #### [FontsSchemaItemsFiles](#FontsSchemaItemsFiles)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | regular | String |  no  |  |
 | italic | String |  no  |  |
 | bold | String |  no  |  |

---


 
 
 #### [ThemesSchema](#ThemesSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application | String |  no  |  |
 | applied | Boolean |  no  |  |
 | customized | Boolean |  no  |  |
 | published | Boolean |  no  |  |
 | archived | Boolean |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | version | String |  no  |  |
 | parent_theme_version | String |  no  |  |
 | parent_theme | String |  no  |  |
 | information | [Information](#Information) |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | src | [Src](#Src) |  no  |  |
 | assets | [AssetsSchema](#AssetsSchema) |  no  |  |
 | available_sections | ArrayList<[availableSectionSchema](#availableSectionSchema)> |  no  |  |
 | constants | HashMap<String,Any> |  no  |  |
 | styles | HashMap<String,Any> |  no  |  |
 | config | [Config](#Config) |  no  |  |
 | settings | HashMap<String,Any> |  no  |  |
 | font | [Font](#Font) |  no  |  |
 | _id | String |  no  |  |
 | __v | Int |  no  |  |
 | colors | [Colors](#Colors) |  no  |  |

---


 
 
 #### [availableSectionSchema](#availableSectionSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | blocks | ArrayList<[Blocks](#Blocks)> |  no  |  |
 | name | String |  no  |  |
 | label | String |  no  |  |
 | props | ArrayList<[BlocksProps](#BlocksProps)> |  no  |  |

---


 
 
 #### [Information](#Information)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | images | [Images](#Images) |  no  |  |
 | features | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |

---


 
 
 #### [Images](#Images)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | desktop | ArrayList<String> |  no  |  |
 | android | ArrayList<String> |  no  |  |
 | ios | ArrayList<String> |  no  |  |
 | thumbnail | ArrayList<String> |  no  |  |

---


 
 
 #### [Src](#Src)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | link | String |  no  |  |

---


 
 
 #### [AssetsSchema](#AssetsSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | umd_js | [UmdJs](#UmdJs) |  no  |  |
 | common_js | [CommonJs](#CommonJs) |  no  |  |
 | css | [Css](#Css) |  no  |  |

---


 
 
 #### [UmdJs](#UmdJs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | link | String |  no  |  |

---


 
 
 #### [CommonJs](#CommonJs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | link | String |  no  |  |

---


 
 
 #### [Css](#Css)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | link | String |  no  |  |

---


 
 
 #### [Seo](#Seo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | description | String |  no  |  |

---


 
 
 #### [Sections](#Sections)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | String |  no  |  |

---


 
 
 #### [Config](#Config)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | preset | [Preset](#Preset) |  no  |  |
 | global_schema | [GlobalSchema](#GlobalSchema) |  no  |  |
 | current | String |  no  |  |
 | list | ArrayList<[ListSchemaItem](#ListSchemaItem)> |  no  |  |

---


 
 
 #### [Preset](#Preset)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pages | ArrayList<[AvailablePageSchema](#AvailablePageSchema)> |  no  |  |

---


 
 
 #### [GlobalSchema](#GlobalSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | props | ArrayList<[GlobalSchemaProps](#GlobalSchemaProps)> |  no  |  |

---


 
 
 #### [ListSchemaItem](#ListSchemaItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | global | HashMap<String,Any> |  no  |  |
 | page | ArrayList<[ConfigPage](#ConfigPage)> |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [Colors](#Colors)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bg_color | String |  no  |  |
 | primary_color | String |  no  |  |
 | secondary_color | String |  no  |  |
 | accent_color | String |  no  |  |
 | link_color | String |  no  |  |
 | button_secondary_color | String |  no  |  |

---


 
 
 #### [Custom](#Custom)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | props | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ConfigPage](#ConfigPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | settings | HashMap<String,Any> |  no  |  |
 | page | String |  no  |  |

---


 
 
 #### [Font](#Font)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | family | String |  no  |  |
 | variants | [Variants](#Variants) |  no  |  |

---


 
 
 #### [Variants](#Variants)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | medium | [Medium](#Medium) |  no  |  |
 | semi_bold | [SemiBold](#SemiBold) |  no  |  |
 | bold | [Bold](#Bold) |  no  |  |
 | light | [Light](#Light) |  no  |  |
 | regular | [Regular](#Regular) |  no  |  |

---


 
 
 #### [Medium](#Medium)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | file | String |  no  |  |

---


 
 
 #### [SemiBold](#SemiBold)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | file | String |  no  |  |

---


 
 
 #### [Bold](#Bold)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | file | String |  no  |  |

---


 
 
 #### [Light](#Light)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | file | String |  no  |  |

---


 
 
 #### [Regular](#Regular)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | file | String |  no  |  |

---


 
 
 #### [Blocks](#Blocks)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | name | String |  no  |  |
 | props | ArrayList<[BlocksProps](#BlocksProps)> |  no  |  |

---


 
 
 #### [GlobalSchemaProps](#GlobalSchemaProps)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | label | String |  no  |  |
 | type | String |  no  |  |
 | category | String |  no  |  |

---


 
 
 #### [BlocksProps](#BlocksProps)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | label | String |  no  |  |
 | type | String |  no  |  |

---




 
 
 #### [EditEmailRequestSchema](#EditEmailRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |

---


 
 
 #### [SendVerificationLinkMobileRequestSchema](#SendVerificationLinkMobileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Boolean |  no  |  |
 | active | Boolean |  no  |  |
 | country_code | String |  no  |  |
 | phone | String |  no  |  |
 | primary | Boolean |  no  |  |

---


 
 
 #### [EditMobileRequestSchema](#EditMobileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country_code | String |  no  |  |
 | phone | String |  no  |  |

---


 
 
 #### [EditProfileRequestSchema](#EditProfileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | first_name | String |  no  |  |
 | last_name | String |  no  |  |
 | mobile | [EditProfileMobileSchema](#EditProfileMobileSchema) |  no  |  |
 | country_code | String |  no  |  |
 | email | String |  no  |  |
 | gender | String |  no  |  |
 | dob | String |  no  |  |
 | profile_pic_url | String |  no  |  |
 | android_hash | String |  no  |  |
 | sender | String |  no  |  |
 | register_token | String |  no  |  |

---


 
 
 #### [EditProfileMobileSchema](#EditProfileMobileSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | String |  no  |  |
 | country_code | String |  no  |  |

---


 
 
 #### [SendEmailOtpRequestSchema](#SendEmailOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | action | String |  no  |  |
 | token | String |  no  |  |
 | register_token | String |  no  |  |

---


 
 
 #### [VerifyEmailOtpRequestSchema](#VerifyEmailOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | action | String |  no  |  |
 | register_token | String |  no  |  |
 | otp | String |  no  |  |

---


 
 
 #### [VerifyOtpRequestSchema](#VerifyOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | request_id | String |  no  |  |
 | register_token | String |  no  |  |
 | otp | String |  no  |  |

---


 
 
 #### [SendMobileOtpRequestSchema](#SendMobileOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String |  no  |  |
 | country_code | String |  no  |  |
 | action | String |  no  |  |
 | token | String |  no  |  |
 | android_hash | String |  no  |  |
 | force | String |  no  |  |
 | captcha_code | String |  no  |  |

---


 
 
 #### [UpdatePasswordRequestSchema](#UpdatePasswordRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | old_password | String |  no  |  |
 | new_password | String |  no  |  |

---


 
 
 #### [FormRegisterRequestSchema](#FormRegisterRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | first_name | String |  no  |  |
 | last_name | String |  no  |  |
 | gender | String |  no  |  |
 | email | String |  no  |  |
 | password | String |  no  |  |
 | phone | [FormRegisterRequestSchemaPhone](#FormRegisterRequestSchemaPhone) |  no  |  |
 | register_token | String |  no  |  |

---


 
 
 #### [TokenRequestBodySchema](#TokenRequestBodySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | token | String |  no  |  |

---


 
 
 #### [ForgotPasswordRequestSchema](#ForgotPasswordRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  |  |
 | password | String |  no  |  |

---


 
 
 #### [CodeRequestBodySchema](#CodeRequestBodySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  |  |

---


 
 
 #### [SendResetPasswordEmailRequestSchema](#SendResetPasswordEmailRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | captcha_code | String |  no  |  |

---


 
 
 #### [PasswordLoginRequestSchema](#PasswordLoginRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | captcha_code | String |  no  |  |
 | password | String |  no  |  |
 | username | String |  no  |  |

---


 
 
 #### [SendOtpRequestSchema](#SendOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country_code | String |  no  |  |
 | captcha_code | String |  no  |  |
 | mobile | String |  no  |  |

---


 
 
 #### [OAuthRequestSchema](#OAuthRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_signed_in | Boolean |  no  |  |
 | oauth2 | [OAuthRequestSchemaOauth2](#OAuthRequestSchemaOauth2) |  no  |  |
 | profile | [OAuthRequestSchemaProfile](#OAuthRequestSchemaProfile) |  no  |  |

---


 
 
 #### [UserObjectSchema](#UserObjectSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  |  |

---


 
 
 #### [AuthSuccess](#AuthSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | register_token | String |  no  |  |
 | user_exists | Boolean |  no  |  |
 | user | [UserSchema](#UserSchema) |  no  |  |

---


 
 
 #### [SendOtpResponse](#SendOtpResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | resend_timer | Int |  no  |  |
 | resend_token | String |  no  |  |
 | success | Boolean |  no  |  |
 | request_id | String |  no  |  |
 | message | String |  no  |  |
 | mobile | String |  no  |  |
 | country_code | String |  no  |  |
 | email | String |  no  |  |
 | resend_email_token | String |  no  |  |
 | register_token | String |  no  |  |
 | verify_email_otp | Boolean |  no  |  |
 | verify_mobile_otp | Boolean |  no  |  |
 | user_exists | Boolean |  no  |  |

---


 
 
 #### [ProfileEditSuccess](#ProfileEditSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  |  |
 | register_token | String |  no  |  |
 | user_exists | Boolean |  no  |  |
 | verify_email_link | Boolean |  no  |  |
 | verify_email_otp | Boolean |  no  |  |
 | verify_mobile_otp | Boolean |  no  |  |
 | email | String |  no  |  |

---


 
 
 #### [LoginSuccess](#LoginSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  |  |
 | request_id | String |  no  |  |
 | register_token | String |  no  |  |

---


 
 
 #### [VerifyOtpSuccess](#VerifyOtpSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  |  |
 | user_exists | Boolean |  no  |  |
 | register_token | String |  no  |  |

---


 
 
 #### [ResetPasswordSuccess](#ResetPasswordSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |

---


 
 
 #### [RegisterFormSuccess](#RegisterFormSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | resend_timer | Int |  no  |  |
 | resend_token | String |  no  |  |
 | resend_email_token | String |  no  |  |
 | register_token | String |  no  |  |
 | success | Boolean |  no  |  |
 | request_id | String |  no  |  |
 | message | String |  no  |  |
 | mobile | String |  no  |  |
 | country_code | String |  no  |  |
 | verify_email_otp | Boolean |  no  |  |
 | verify_mobile_otp | Boolean |  no  |  |
 | user_exists | Boolean |  no  |  |

---


 
 
 #### [VerifyEmailSuccess](#VerifyEmailSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [HasPasswordSuccess](#HasPasswordSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | Boolean |  no  |  |

---


 
 
 #### [LogoutSuccess](#LogoutSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logout | Boolean |  no  |  |

---


 
 
 #### [OtpSuccess](#OtpSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | resend_timer | Int |  no  |  |
 | resend_token | String |  no  |  |
 | register_token | String |  no  |  |
 | success | Boolean |  no  |  |
 | request_id | String |  no  |  |
 | message | String |  no  |  |
 | mobile | String |  no  |  |
 | country_code | String |  no  |  |

---


 
 
 #### [EmailOtpSuccess](#EmailOtpSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |

---


 
 
 #### [SessionListSuccess](#SessionListSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sessions | ArrayList<String> |  no  |  |

---


 
 
 #### [VerifyMobileOTPSuccess](#VerifyMobileOTPSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  |  |
 | verify_mobile_link | Boolean |  no  |  |

---


 
 
 #### [VerifyEmailOTPSuccess](#VerifyEmailOTPSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  |  |
 | verify_email_link | Boolean |  no  |  |

---


 
 
 #### [SendMobileVerifyLinkSuccess](#SendMobileVerifyLinkSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verify_mobile_link | Boolean |  no  |  |

---


 
 
 #### [SendEmailVerifyLinkSuccess](#SendEmailVerifyLinkSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verify_email_link | Boolean |  no  |  |

---


 
 
 #### [UserSearchResponseSchema](#UserSearchResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | users | ArrayList<[UserSchema](#UserSchema)> |  no  |  |

---


 
 
 #### [CustomerListResponseSchema](#CustomerListResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[UserSchema](#UserSchema)> |  no  |  |
 | page | [PaginationSchema](#PaginationSchema) |  no  |  |

---


 
 
 #### [UnauthorizedSchema](#UnauthorizedSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [UnauthenticatedSchema](#UnauthenticatedSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | authenticated | Boolean |  no  |  |

---


 
 
 #### [NotFoundSchema](#NotFoundSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [AuthenticationInternalServerErrorSchema](#AuthenticationInternalServerErrorSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [AuthenticationApiErrorSchema](#AuthenticationApiErrorSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [ProfileEditSuccessSchema](#ProfileEditSuccessSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | verify_email_otp | Boolean |  no  |  |
 | verify_email_link | Boolean |  no  |  |
 | verify_mobile_otp | Boolean |  no  |  |
 | user | String |  no  |  |
 | register_token | String |  no  |  |
 | user_exists | Boolean |  no  |  |

---


 
 
 #### [FormRegisterRequestSchemaPhone](#FormRegisterRequestSchemaPhone)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country_code | String |  no  |  |
 | mobile | String |  no  |  |

---


 
 
 #### [OAuthRequestSchemaOauth2](#OAuthRequestSchemaOauth2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | access_token | String |  no  |  |
 | expiry | Int |  no  |  |
 | refresh_token | String |  no  |  |

---


 
 
 #### [OAuthRequestSchemaProfile](#OAuthRequestSchemaProfile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | last_name | String |  no  |  |
 | image | String |  no  |  |
 | id | String |  no  |  |
 | email | String |  no  |  |
 | full_name | String |  no  |  |
 | first_name | String |  no  |  |

---


 
 
 #### [AuthSuccessUser](#AuthSuccessUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | first_name | String |  no  |  |
 | last_name | String |  no  |  |
 | debug | [AuthSuccessUserDebug](#AuthSuccessUserDebug) |  no  |  |
 | active | Boolean |  no  |  |
 | emails | [AuthSuccessUserEmails](#AuthSuccessUserEmails) |  no  |  |

---


 
 
 #### [AuthSuccessUserDebug](#AuthSuccessUserDebug)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | platform | String |  no  |  |

---


 
 
 #### [AuthSuccessUserEmails](#AuthSuccessUserEmails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | verified | Boolean |  no  |  |
 | primary | Boolean |  no  |  |
 | active | Boolean |  no  |  |

---


 
 
 #### [CreateUserRequestSchema](#CreateUserRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone_number | String? |  yes  |  |
 | email | String |  no  |  |
 | first_name | String |  no  |  |
 | last_name | String |  no  |  |
 | gender | String |  no  |  |
 | username | String? |  yes  |  |
 | meta | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CreateUserResponseSchema](#CreateUserResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  |  |

---


 
 
 #### [CreateUserSessionRequestSchema](#CreateUserSessionRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domain | String |  no  |  |
 | max_age | Double |  no  |  |
 | user_id | String |  no  |  |

---


 
 
 #### [CreateUserSessionResponseSchema](#CreateUserSessionResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domain | String |  no  |  |
 | max_age | Double |  no  |  |
 | secure | Boolean |  no  |  |
 | http_only | Boolean |  no  |  |
 | cookie | HashMap<String,Any> |  no  |  |

---


 
 
 #### [PlatformSchema](#PlatformSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | look_and_feel | [LookAndFeel](#LookAndFeel) |  no  |  |
 | updated_at | String |  no  |  |
 | active | Boolean |  no  |  |
 | forgot_password | Boolean |  no  |  |
 | login | [Login](#Login) |  no  |  |
 | skip_captcha | Boolean |  no  |  |
 | name | String |  no  |  |
 | meta | [MetaSchema](#MetaSchema) |  no  |  |
 | _id | String |  no  |  |
 | social | [Social](#Social) |  no  |  |
 | required_fields | [RequiredFields](#RequiredFields) |  no  |  |
 | register_required_fields | [RegisterRequiredFields](#RegisterRequiredFields) |  no  |  |
 | skip_login | Boolean |  no  |  |
 | flash_card | [FlashCard](#FlashCard) |  no  |  |
 | subtext | String |  no  |  |
 | social_tokens | [SocialTokens](#SocialTokens) |  no  |  |
 | created_at | String |  no  |  |
 | register | Boolean |  no  |  |
 | mobile_image | String |  no  |  |
 | desktop_image | String |  no  |  |

---


 
 
 #### [LookAndFeel](#LookAndFeel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | card_position | String |  no  |  |
 | background_color | String |  no  |  |

---


 
 
 #### [Login](#Login)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | password | Boolean |  no  |  |
 | otp | Boolean |  no  |  |

---


 
 
 #### [MetaSchema](#MetaSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fynd_default | Boolean |  no  |  |

---


 
 
 #### [Social](#Social)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | account_kit | Boolean |  no  |  |
 | facebook | Boolean |  no  |  |
 | google | Boolean |  no  |  |

---


 
 
 #### [RequiredFields](#RequiredFields)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | [PlatformEmail](#PlatformEmail) |  no  |  |
 | mobile | [PlatformMobile](#PlatformMobile) |  no  |  |

---


 
 
 #### [PlatformEmail](#PlatformEmail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_required | Boolean |  no  |  |
 | level | String |  no  |  |

---


 
 
 #### [PlatformMobile](#PlatformMobile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_required | Boolean |  no  |  |
 | level | String |  no  |  |

---


 
 
 #### [RegisterRequiredFields](#RegisterRequiredFields)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | [RegisterRequiredFieldsEmail](#RegisterRequiredFieldsEmail) |  no  |  |
 | mobile | [RegisterRequiredFieldsMobile](#RegisterRequiredFieldsMobile) |  no  |  |

---


 
 
 #### [RegisterRequiredFieldsEmail](#RegisterRequiredFieldsEmail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_required | Boolean |  no  |  |
 | level | String |  no  |  |

---


 
 
 #### [RegisterRequiredFieldsMobile](#RegisterRequiredFieldsMobile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_required | Boolean |  no  |  |
 | level | String |  no  |  |

---


 
 
 #### [FlashCard](#FlashCard)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | text_color | String |  no  |  |
 | background_color | String |  no  |  |

---


 
 
 #### [SocialTokens](#SocialTokens)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | facebook | [Facebook](#Facebook) |  no  |  |
 | account_kit | [Accountkit](#Accountkit) |  no  |  |
 | google | [Google](#Google) |  no  |  |

---


 
 
 #### [Facebook](#Facebook)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app_id | String |  no  |  |

---


 
 
 #### [Accountkit](#Accountkit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app_id | String |  no  |  |

---


 
 
 #### [Google](#Google)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app_id | String |  no  |  |

---


 
 
 #### [UpdateUserRequestSchema](#UpdateUserRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | first_name | String |  no  |  |
 | last_name | String |  no  |  |
 | gender | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |

---


 
 
 #### [UserSchema](#UserSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | first_name | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | last_name | String |  no  |  |
 | phone_numbers | ArrayList<[PhoneNumber](#PhoneNumber)> |  no  |  |
 | emails | ArrayList<[Email](#Email)> |  no  |  |
 | gender | String |  no  |  |
 | dob | String |  no  |  |
 | active | Boolean |  no  |  |
 | profile_pic_url | String |  no  |  |
 | username | String |  no  |  |
 | account_type | String |  no  |  |
 | uid | String |  no  |  |
 | debug | [Debug](#Debug) |  no  |  |
 | has_old_password_hash | Boolean |  no  |  |
 | _id | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |

---




 
 
 #### [ApplicationLegal](#ApplicationLegal)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application | String |  no  |  |
 | tnc | String |  no  |  |
 | policy | String |  no  |  |
 | shipping | String |  no  |  |
 | faq | ArrayList<[ApplicationLegalFAQ](#ApplicationLegalFAQ)> |  no  |  |
 | _id | String |  no  |  |
 | updated_at | String |  no  |  |
 | created_at | String |  no  |  |

---


 
 
 #### [ApplicationLegalFAQ](#ApplicationLegalFAQ)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | question | String |  no  |  |
 | answer | String |  no  |  |

---


 
 
 #### [SeoComponent](#SeoComponent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | seo | [SeoSchema](#SeoSchema) |  no  |  |

---


 
 
 #### [SeoSchema](#SeoSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app | String |  no  |  |
 | _id | String |  no  |  |
 | robots_txt | String |  no  |  |
 | sitemap_enabled | Boolean |  no  |  |
 | custom_meta_tags | ArrayList<HashMap<String,Any>> |  no  |  |
 | details | [Detail](#Detail) |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |

---


 
 
 #### [CustomMetaTag](#CustomMetaTag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | content | String |  no  |  |
 | _id | String |  no  |  |

---


 
 
 #### [Detail](#Detail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | description | String |  no  |  |

---


 
 
 #### [AnnouncementPageSchema](#AnnouncementPageSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page_slug | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [EditorMeta](#EditorMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | foreground_color | String |  no  |  |
 | background_color | String |  no  |  |
 | content_type | String |  no  |  |
 | content | String |  no  |  |

---


 
 
 #### [AnnouncementAuthorSchema](#AnnouncementAuthorSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | created_by | String |  no  |  |
 | modified_by | String |  no  |  |

---


 
 
 #### [AdminAnnouncementSchema](#AdminAnnouncementSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | platforms | ArrayList<String> |  no  |  |
 | title | String |  no  |  |
 | announcement | String |  no  |  |
 | pages | ArrayList<[AnnouncementPageSchema](#AnnouncementPageSchema)> |  no  |  |
 | editor_meta | [EditorMeta](#EditorMeta) |  no  |  |
 | author | [AnnouncementAuthorSchema](#AnnouncementAuthorSchema) |  no  |  |
 | created_at | String |  no  |  |
 | app | String |  no  |  |
 | modified_at | String |  no  |  |
 | _schedule | [ScheduleSchema](#ScheduleSchema) |  no  |  |

---


 
 
 #### [ScheduleSchema](#ScheduleSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cron | String |  no  |  |
 | start | String |  no  |  |
 | end | String |  no  |  |
 | duration | Double |  no  |  |
 | next_schedule | ArrayList<HashMap<String,Any>> |  no  |  |

---


 
 
 #### [NextSchedule](#NextSchedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start | String |  no  |  |
 | end | String |  no  |  |

---


 
 
 #### [AnnouncementSchema](#AnnouncementSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | announcement | String |  no  |  |
 | schedule | [ScheduleStartSchema](#ScheduleStartSchema) |  no  |  |

---


 
 
 #### [ScheduleStartSchema](#ScheduleStartSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start | String |  no  |  |
 | end | String |  no  |  |

---


 
 
 #### [BlogGetResponse](#BlogGetResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[BlogSchema](#BlogSchema)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [ResourceContent](#ResourceContent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [Asset](#Asset)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspect_ratio | String |  no  |  |
 | id | String |  no  |  |
 | secure_url | String |  no  |  |

---


 
 
 #### [Author](#Author)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | designation | String |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [BlogSchema](#BlogSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | application | String |  no  |  |
 | archived | Boolean |  no  |  |
 | author | [Author](#Author) |  no  |  |
 | content | ArrayList<[ResourceContent](#ResourceContent)> |  no  |  |
 | feature_image | [Asset](#Asset) |  no  |  |
 | published | Boolean |  no  |  |
 | reading_time | String |  no  |  |
 | slug | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | seo | [SEO](#SEO) |  no  |  |
 | _schedule | [CronSchedule](#CronSchedule) |  no  |  |
 | title | String |  no  |  |
 | date_meta | [DateMeta](#DateMeta) |  no  |  |

---


 
 
 #### [SEO](#SEO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | image | [SEOImage](#SEOImage) |  no  |  |
 | title | String |  no  |  |

---


 
 
 #### [SEOImage](#SEOImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |

---


 
 
 #### [BlogRequest](#BlogRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application | String |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | author | [Author](#Author) |  no  |  |
 | content | ArrayList<[ResourceContent](#ResourceContent)> |  no  |  |
 | feature_image | [Asset](#Asset) |  no  |  |
 | published | Boolean |  no  |  |
 | reading_time | String |  no  |  |
 | slug | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | title | String |  no  |  |
 | seo | [SEO](#SEO) |  no  |  |
 | _schedule | [CronSchedule](#CronSchedule) |  no  |  |

---


 
 
 #### [GetAnnouncementListSchema](#GetAnnouncementListSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[AdminAnnouncementSchema](#AdminAnnouncementSchema)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [CreateAnnouncementSchema](#CreateAnnouncementSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | data | [AdminAnnouncementSchema](#AdminAnnouncementSchema) |  no  |  |

---


 
 
 #### [Navigation](#Navigation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | orientation | String |  no  |  |
 | created_by | [CreatedBySchema](#CreatedBySchema) |  no  |  |
 | date_meta | [DateMeta](#DateMeta) |  no  |  |
 | _id | String |  no  |  |
 | position | String |  no  |  |
 | application | String |  no  |  |
 | platform | String |  no  |  |
 | navigation | [NavigationReference](#NavigationReference) |  no  |  |

---


 
 
 #### [LocaleLanguage](#LocaleLanguage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hi | [Language](#Language) |  no  |  |
 | ar | [Language](#Language) |  no  |  |
 | en_us | [Language](#Language) |  no  |  |

---


 
 
 #### [Language](#Language)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |

---


 
 
 #### [Action](#Action)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [ActionPage](#ActionPage) |  no  |  |
 | popup | [ActionPage](#ActionPage) |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ActionPage](#ActionPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | params | HashMap<String,ArrayList<String>> |  no  |  |
 | query | HashMap<String,ArrayList<String>> |  no  |  |
 | url | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [NavigationReference](#NavigationReference)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | acl | ArrayList<String> |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | _locale_language | [LocaleLanguage](#LocaleLanguage) |  no  |  |
 | image | String |  no  |  |
 | type | String |  no  |  |
 | action | [Action](#Action) |  no  |  |
 | active | Boolean |  no  |  |
 | display | String |  no  |  |
 | sort_order | Int |  no  |  |
 | sub_navigation | ArrayList<[NavigationReference](#NavigationReference)> |  no  |  |

---


 
 
 #### [LandingPage](#LandingPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [LandingPageSchema](#LandingPageSchema) |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [ConfigurationSchema](#ConfigurationSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sleep_time | Int |  no  |  |
 | start_on_launch | Boolean |  no  |  |
 | duration | Int |  no  |  |
 | slide_direction | String |  no  |  |

---


 
 
 #### [SlideshowMedia](#SlideshowMedia)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | url | String |  no  |  |
 | bg_color | String |  no  |  |
 | duration | Int |  no  |  |
 | auto_decide_duration | Boolean |  no  |  |
 | action | [Action](#Action) |  no  |  |

---


 
 
 #### [Slideshow](#Slideshow)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [SlideshowSchema](#SlideshowSchema) |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [AnnouncementsResponseSchema](#AnnouncementsResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | announcements | HashMap<String,ArrayList<[AnnouncementSchema](#AnnouncementSchema)>> |  no  |  |
 | refresh_rate | Int |  no  | number of seconds after which api should hit again to fetch new announcements |
 | refresh_pages | ArrayList<String> |  no  | list of page slugs on which announcement should be fetched as soon as they are loaded |

---


 
 
 #### [FaqResponseSchema](#FaqResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | faqs | ArrayList<[FaqSchema](#FaqSchema)> |  no  |  |

---


 
 
 #### [UpdateHandpickedSchema](#UpdateHandpickedSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tag | [HandpickedTagSchema](#HandpickedTagSchema) |  no  |  |

---


 
 
 #### [HandpickedTagSchema](#HandpickedTagSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | position | String |  no  |  |
 | attributes | HashMap<String,Any> |  no  |  |
 | name | String |  no  |  |
 | url | String |  no  |  |
 | type | String |  no  |  |
 | sub_type | String |  no  |  |
 | content | String |  no  |  |

---


 
 
 #### [RemoveHandpickedSchema](#RemoveHandpickedSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tags | ArrayList<String> |  no  |  |

---


 
 
 #### [CreateTagSchema](#CreateTagSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | sub_type | String |  no  |  |
 | _id | String |  no  |  |
 | type | String |  no  |  |
 | url | String |  no  |  |
 | position | String |  no  |  |
 | attributes | HashMap<String,Any> |  no  |  |
 | content | String |  no  |  |

---


 
 
 #### [CreateTagRequestSchema](#CreateTagRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tags | ArrayList<[CreateTagSchema](#CreateTagSchema)> |  no  |  |

---


 
 
 #### [APIError](#APIError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | status | Double |  no  |  |
 | code | String |  no  |  |
 | exception | String |  no  |  |
 | info | String |  no  |  |
 | request_id | String |  no  |  |
 | stack_trace | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CategorySchema](#CategorySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | index | Int |  no  |  |
 | title | String |  no  |  |
 | description | String |  no  |  |
 | children | ArrayList<String> |  no  |  |
 | _id | String |  no  |  |
 | slug | String |  no  |  |
 | application | String |  no  |  |
 | icon_url | String |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ChildrenSchema](#ChildrenSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | question | String |  no  |  |
 | answer | String |  no  |  |
 | slug | String |  no  |  |
 | application | String |  no  |  |
 | _id | String |  no  |  |

---


 
 
 #### [CategoryRequestSchema](#CategoryRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String |  no  |  |
 | title | String |  no  |  |

---


 
 
 #### [FAQCategorySchema](#FAQCategorySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | index | Int |  no  |  |
 | title | String |  no  |  |
 | description | String |  no  |  |
 | children | ArrayList<[ChildrenSchema](#ChildrenSchema)> |  no  |  |
 | _id | String |  no  |  |
 | slug | String |  no  |  |
 | application | String |  no  |  |
 | icon_url | String |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |

---


 
 
 #### [FaqSchema](#FaqSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String |  no  |  |
 | application | String |  no  |  |
 | _id | String |  no  |  |
 | question | String |  no  |  |
 | answer | String |  no  |  |

---


 
 
 #### [FAQ](#FAQ)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String |  no  |  |
 | question | String |  no  |  |
 | answer | String |  no  |  |

---


 
 
 #### [CreateFaqResponseSchema](#CreateFaqResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | faq | [FaqSchema](#FaqSchema) |  no  |  |

---


 
 
 #### [CreateFaqSchema](#CreateFaqSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | faq | [FAQ](#FAQ) |  no  |  |

---


 
 
 #### [GetFaqSchema](#GetFaqSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | faqs | ArrayList<HashMap<String,Any>> |  no  |  |

---


 
 
 #### [UpdateFaqCategoryRequestSchema](#UpdateFaqCategoryRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | category | [CategorySchema](#CategorySchema) |  no  |  |

---


 
 
 #### [CreateFaqCategoryRequestSchema](#CreateFaqCategoryRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | category | [CategoryRequestSchema](#CategoryRequestSchema) |  no  |  |

---


 
 
 #### [CreateFaqCategorySchema](#CreateFaqCategorySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | category | [CategorySchema](#CategorySchema) |  no  |  |

---


 
 
 #### [GetFaqCategoriesSchema](#GetFaqCategoriesSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | categories | ArrayList<[CategorySchema](#CategorySchema)> |  no  |  |

---


 
 
 #### [GetFaqCategoryBySlugSchema](#GetFaqCategoryBySlugSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | category | [FAQCategorySchema](#FAQCategorySchema) |  no  |  |

---


 
 
 #### [LandingPageGetResponse](#LandingPageGetResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[LandingPageSchema](#LandingPageSchema)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [LandingPageSchema](#LandingPageSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String |  no  |  |
 | action | [Action](#Action) |  no  |  |
 | platform | ArrayList<String> |  no  |  |
 | created_by | [CreatedBySchema](#CreatedBySchema) |  no  |  |
 | date_meta | [DateMeta](#DateMeta) |  no  |  |
 | _id | String |  no  |  |
 | application | String |  no  |  |
 | archived | Boolean |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |

---


 
 
 #### [DefaultNavigationResponse](#DefaultNavigationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[NavigationSchema](#NavigationSchema)> |  no  |  |

---


 
 
 #### [NavigationGetResponse](#NavigationGetResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[NavigationSchema](#NavigationSchema)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [Orientation](#Orientation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | portrait | ArrayList<String> |  no  |  |
 | landscape | ArrayList<String> |  no  |  |

---


 
 
 #### [NavigationSchema](#NavigationSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | application | String |  no  |  |
 | archived | Boolean |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | platform | ArrayList<String> |  no  |  |
 | created_by | [CreatedBySchema](#CreatedBySchema) |  no  |  |
 | date_meta | [DateMeta](#DateMeta) |  no  |  |
 | orientation | [Orientation](#Orientation) |  no  |  |
 | version | Double |  no  |  |
 | navigation | ArrayList<[NavigationReference](#NavigationReference)> |  no  |  |

---


 
 
 #### [NavigationRequest](#NavigationRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | platform | ArrayList<String> |  no  |  |
 | orientation | [Orientation](#Orientation) |  no  |  |
 | navigation | ArrayList<[NavigationReference](#NavigationReference)> |  no  |  |

---


 
 
 #### [CustomPageSchema](#CustomPageSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | platform | String |  no  |  |
 | title | String |  no  |  |
 | slug | String |  no  |  |
 | type | String |  no  |  |
 | orientation | String |  no  |  |
 | application | String |  no  |  |
 | description | String |  no  |  |
 | published | Boolean |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | content | ArrayList<HashMap<String,Any>> |  no  |  |
 | created_by | [CreatedBySchema](#CreatedBySchema) |  no  |  |
 | date_meta | [DateMeta](#DateMeta) |  no  |  |
 | _schedule | [ScheduleSchema](#ScheduleSchema) |  no  |  |

---


 
 
 #### [ContentSchema](#ContentSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | value | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CustomPage](#CustomPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [CustomPageSchema](#CustomPageSchema) |  no  |  |

---


 
 
 #### [FeatureImage](#FeatureImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | secure_url | String |  no  |  |

---


 
 
 #### [PageGetResponse](#PageGetResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[PageSchema](#PageSchema)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [PageSpec](#PageSpec)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | specifications | ArrayList<HashMap<String,Any>> |  no  |  |

---


 
 
 #### [PageSpecParam](#PageSpecParam)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | required | Boolean |  no  |  |

---


 
 
 #### [PageSpecItem](#PageSpecItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page_type | String |  no  |  |
 | display_name | String |  no  |  |
 | params | ArrayList<[PageSpecParam](#PageSpecParam)> |  no  |  |
 | query | ArrayList<[PageSpecParam](#PageSpecParam)> |  no  |  |

---


 
 
 #### [PageSchema](#PageSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | application | String |  no  |  |
 | component_ids | ArrayList<String> |  no  | Components can be used to store multiple components |
 | content | ArrayList<[PageContent](#PageContent)> |  no  |  |
 | created_by | [CreatedBySchema](#CreatedBySchema) |  no  |  |
 | date_meta | [DateMeta](#DateMeta) |  no  |  |
 | description | String |  no  |  |
 | feature_image | [Asset](#Asset) |  no  |  |
 | page_meta | ArrayList<[PageMeta](#PageMeta)> |  no  |  |
 | _schedule | [ScheduleSchema](#ScheduleSchema) |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | orientation | String |  no  |  |
 | platform | String |  no  |  |
 | published | Boolean |  no  |  |
 | slug | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | title | String |  no  |  |
 | type | String |  no  |  |
 | seo | [SEO](#SEO) |  no  |  |
 | visibility | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CreatedBySchema](#CreatedBySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |

---


 
 
 #### [PageContent](#PageContent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | value | HashMap<String,Any> |  no  |  |

---


 
 
 #### [PageMeta](#PageMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | value | HashMap<String,Any> |  no  |  |

---


 
 
 #### [PageRequest](#PageRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _schedule | [CronSchedule](#CronSchedule) |  no  |  |
 | application | String |  no  |  |
 | author | [Author](#Author) |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | orientation | String |  no  |  |
 | content | ArrayList<HashMap<String,Any>> |  no  |  |
 | feature_image | [Asset](#Asset) |  no  |  |
 | published | Boolean |  no  |  |
 | reading_time | String |  no  |  |
 | slug | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | seo | [SEO](#SEO) |  no  |  |
 | title | String |  no  |  |

---


 
 
 #### [CronSchedule](#CronSchedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cron | String |  no  |  |
 | start | String |  no  |  |
 | end | String |  no  |  |
 | duration | Double |  no  |  |

---


 
 
 #### [PagePublishRequest](#PagePublishRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | publish | Boolean |  no  |  |

---


 
 
 #### [PageMetaSchema](#PageMetaSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | system_pages | ArrayList<[NavigationSchema](#NavigationSchema)> |  no  |  |
 | custom_pages | ArrayList<[PageSchema](#PageSchema)> |  no  |  |
 | application_id | String |  no  |  |

---


 
 
 #### [SlideshowGetResponse](#SlideshowGetResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[SlideshowSchema](#SlideshowSchema)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [SlideshowSchema](#SlideshowSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | slug | String |  no  |  |
 | date_meta | [DateMeta](#DateMeta) |  no  |  |
 | application | String |  no  |  |
 | platform | String |  no  |  |
 | configuration | [ConfigurationSchema](#ConfigurationSchema) |  no  |  |
 | media | ArrayList<[SlideshowMedia](#SlideshowMedia)> |  no  |  |
 | active | Boolean |  no  |  |
 | archived | Boolean |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |

---


 
 
 #### [SlideshowRequest](#SlideshowRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String |  no  |  |
 | platform | String |  no  |  |
 | configuration | [ConfigurationSchema](#ConfigurationSchema) |  no  |  |
 | media | [SlideshowMedia](#SlideshowMedia) |  no  |  |
 | active | Boolean |  no  |  |

---


 
 
 #### [Support](#Support)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | created | Boolean |  no  |  |
 | _id | String |  no  |  |
 | config_type | String |  no  |  |
 | application | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | contact | [ContactSchema](#ContactSchema) |  no  |  |

---


 
 
 #### [PhoneProperties](#PhoneProperties)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | code | String |  no  |  |
 | number | String |  no  |  |

---


 
 
 #### [PhoneSchema](#PhoneSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean |  no  |  |
 | phone | ArrayList<[PhoneProperties](#PhoneProperties)> |  no  |  |

---


 
 
 #### [EmailProperties](#EmailProperties)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [EmailSchema](#EmailSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean |  no  |  |
 | email | ArrayList<[EmailProperties](#EmailProperties)> |  no  |  |

---


 
 
 #### [ContactSchema](#ContactSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | [PhoneSchema](#PhoneSchema) |  no  |  |
 | email | [EmailSchema](#EmailSchema) |  no  |  |

---


 
 
 #### [TagsSchema](#TagsSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application | String |  no  |  |
 | _id | String |  no  |  |
 | tags | ArrayList<[TagSchema](#TagSchema)> |  no  |  |

---


 
 
 #### [TagSchema](#TagSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | url | String |  no  |  |
 | type | String |  no  |  |
 | sub_type | String |  no  |  |
 | _id | String |  no  |  |
 | position | String |  no  |  |
 | attributes | HashMap<String,Any> |  no  |  |
 | content | String |  no  |  |

---




 
 
 #### [ErrorResponseSchema](#ErrorResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Reason for failure |
 | code | Double |  no  | error code |

---


 
 
 #### [Success](#Success)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [CreatedModifiedByObject](#CreatedModifiedByObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String |  no  |  |
 | user_id | String |  no  |  |

---


 
 
 #### [PickupPointResponse](#PickupPointResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ItemProperties](#ItemProperties)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [PickupPointSchema](#PickupPointSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | notification_emails | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | code | String |  no  |  |
 | address | [AddressObject](#AddressObject) |  no  |  |
 | additional_contacts | [AdditionalContactsObject](#AdditionalContactsObject) |  no  |  |
 | timing | ArrayList<[AdditionalContactsObject](#AdditionalContactsObject)> |  no  |  |
 | created_by | [CreatedModifiedByObject](#CreatedModifiedByObject) |  no  |  |
 | modified_by | [TimingObject](#TimingObject) |  no  |  |
 | created_on | String |  no  |  |
 | modified_on | String |  no  |  |

---


 
 
 #### [ItemProperties](#ItemProperties)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | notification_emails | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | code | String |  no  |  |
 | address | [AddressObject](#AddressObject) |  no  |  |
 | additional_contacts | [AdditionalContactsObject](#AdditionalContactsObject) |  no  |  |
 | timing | ArrayList<[AdditionalContactsObject](#AdditionalContactsObject)> |  no  |  |
 | created_by | [CreatedModifiedByObject](#CreatedModifiedByObject) |  no  |  |
 | modified_by | [TimingObject](#TimingObject) |  no  |  |
 | created_on | String |  no  |  |
 | modified_on | String |  no  |  |

---


 
 
 #### [AddressObject](#AddressObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address1 | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | pincode | Double |  no  |  |
 | country | String |  no  |  |
 | country_code | String |  no  |  |

---


 
 
 #### [AdditionalContactsObject](#AdditionalContactsObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | Double |  no  |  |
 | country_code | Double |  no  |  |

---


 
 
 #### [TimingObject](#TimingObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | opening | [OpeningClosingObject](#OpeningClosingObject) |  no  |  |
 | closing | [OpeningClosingObject](#OpeningClosingObject) |  no  |  |
 | open | Boolean |  no  |  |
 | weekday | String |  no  |  |

---


 
 
 #### [OpeningClosingObject](#OpeningClosingObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hour | String |  no  |  |
 | minute | String |  no  |  |

---


 
 
 #### [PickupResponse](#PickupResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[PickupResponseItems](#PickupResponseItems)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [PickupConfiguration](#PickupConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | datetime_check | Boolean |  no  |  |
 | header | String |  no  |  |
 | instruction_for_customer | String |  no  |  |

---


 
 
 #### [PickupResponseItems](#PickupResponseItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | datetime_check | Boolean |  no  |  |
 | header | String |  no  |  |
 | instruction_for_customer | String |  no  |  |
 | app_id | String |  no  |  |

---


 
 
 #### [ShippingSchema](#ShippingSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | assignment | [AssignmentSchema](#AssignmentSchema) |  no  |  |
 | _id | String |  no  |  |
 | app_id | String |  no  |  |

---


 
 
 #### [ShippingResponse](#ShippingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [ShippingSchema](#ShippingSchema) |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [AssignmentSchema](#AssignmentSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfillment_priority | [FulfillmentPriorityObject](#FulfillmentPriorityObject) |  no  |  |
 | default_sort_strategy | String |  no  |  |

---


 
 
 #### [FulfillmentPriorityObject](#FulfillmentPriorityObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priorities | String |  no  |  |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [StoreSchema](#StoreSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | assignment | [StoreAssignmentObject](#StoreAssignmentObject) |  no  |  |
 | _id | String |  no  |  |

---


 
 
 #### [StoreResponse](#StoreResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [StoreSchema](#StoreSchema) |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [StoreAssignmentObject](#StoreAssignmentObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | strategy | [StrategyObject](#StrategyObject) |  no  |  |
 | assignment_type | String |  no  |  |

---


 
 
 #### [StrategyObject](#StrategyObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rules | ArrayList<[StrategyItems](#StrategyItems)> |  no  |  |

---


 
 
 #### [StrategyItems](#StrategyItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | product_tags | ArrayList<String> |  no  |  |
 | zone | String |  no  |  |

---


 
 
 #### [StoreListResponse](#StoreListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<HashMap<String,Any>> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [ZoneSchema](#ZoneSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zone_detail | [ZoneDetailsObject](#ZoneDetailsObject) |  no  |  |
 | _id | String |  no  |  |

---


 
 
 #### [ZoneListResponse](#ZoneListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ZoneSchema](#ZoneSchema)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [RegionObject](#RegionObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | state | String |  no  |  |

---


 
 
 #### [PincodeObject](#PincodeObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode_list | ArrayList<Double> |  no  |  |

---


 
 
 #### [RadiusObject](#RadiusObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | Double |  no  |  |

---


 
 
 #### [ZoneDetailsObject](#ZoneDetailsObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | radius | [RadiusObject](#RadiusObject) |  no  |  |
 | pincode | [PincodeObject](#PincodeObject) |  no  |  |
 | region | [RegionObject](#RegionObject) |  no  |  |

---




 
 
 #### [UnauthenticatedUser](#UnauthenticatedUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Failure message. |

---


 
 
 #### [UnauthenticatedApplication](#UnauthenticatedApplication)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Failure message. |

---


 
 
 #### [BadRequest](#BadRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Failure message. |

---


 
 
 #### [ResourceNotFound](#ResourceNotFound)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Resource not found with {id} |

---


 
 
 #### [InternalServerError](#InternalServerError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Internal server Server error |
 | code | String |  no  | Error code |

---


 
 
 #### [PlanRecurring](#PlanRecurring)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | interval | String |  no  |  |
 | interval_count | Double |  no  |  |

---


 
 
 #### [Plan](#Plan)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recurring | [PlanRecurring](#PlanRecurring) |  no  |  |
 | is_trial_plan | Boolean |  no  |  |
 | plan_group | String |  no  |  |
 | tag_lines | ArrayList<String> |  no  |  |
 | currency | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | is_visible | Boolean |  no  |  |
 | trial_period | Double |  no  |  |
 | addons | ArrayList<String> |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | type | String |  no  |  |
 | country | String |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | amount | Double |  no  |  |
 | product_suite_id | String |  no  |  |
 | created_at | String |  no  |  |
 | modified_at | String |  no  |  |

---


 
 
 #### [DetailedPlanComponents](#DetailedPlanComponents)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | description | String |  no  |  |
 | group | String |  no  |  |
 | icon | String |  no  |  |
 | links | HashMap<String,Any> |  no  |  |
 | enabled | Boolean |  no  |  |
 | display_text | String |  no  |  |

---


 
 
 #### [DetailedPlan](#DetailedPlan)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recurring | [PlanRecurring](#PlanRecurring) |  no  |  |
 | is_trial_plan | Boolean |  no  |  |
 | plan_group | String |  no  |  |
 | tag_lines | ArrayList<String> |  no  |  |
 | currency | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | is_visible | Boolean |  no  |  |
 | trial_period | Double |  no  |  |
 | addons | ArrayList<String> |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | type | String |  no  |  |
 | country | String |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | amount | Double |  no  |  |
 | product_suite_id | String |  no  |  |
 | created_at | String |  no  |  |
 | modified_at | String |  no  |  |
 | components | ArrayList<[DetailedPlanComponents](#DetailedPlanComponents)> |  no  |  |

---


 
 
 #### [SubscriptionTrialPeriod](#SubscriptionTrialPeriod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start_date | String |  no  |  |
 | end_date | String |  no  |  |

---


 
 
 #### [EntityChargePrice](#EntityChargePrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | Double? |  yes  |  |
 | currency_code | String? |  yes  |  |

---


 
 
 #### [EntityChargeRecurring](#EntityChargeRecurring)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | interval | String? |  yes  |  |
 | interval_time | Int? |  yes  |  |

---


 
 
 #### [ChargeLineItem](#ChargeLineItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | term | String? |  yes  |  |
 | pricing_type | String? |  yes  |  |
 | price | [EntityChargePrice](#EntityChargePrice)? |  yes  |  |
 | recurring | [EntityChargeRecurring](#EntityChargeRecurring) |  no  |  |
 | capped_amount | Double |  no  |  |
 | trial_days | Int |  no  |  |
 | is_test | Boolean |  no  |  |
 | metadata | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CreateSubscriptionCharge](#CreateSubscriptionCharge)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | trial_days | Int |  no  |  |
 | line_items | ArrayList<[ChargeLineItem](#ChargeLineItem)>? |  yes  |  |
 | is_test | Boolean |  no  |  |
 | return_url | String? |  yes  |  |

---


 
 
 #### [CurrentPeriod](#CurrentPeriod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start_date | String |  no  |  |
 | end_date | String |  no  |  |

---


 
 
 #### [SubscriptionCharge](#SubscriptionCharge)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | term | String |  no  |  |
 | pricing_type | String |  no  |  |
 | price | [EntityChargePrice](#EntityChargePrice) |  no  |  |
 | recurring | [EntityChargeRecurring](#EntityChargeRecurring) |  no  |  |
 | capped_amount | Double |  no  |  |
 | activated_on | String |  no  |  |
 | cancelled_on | String |  no  |  |
 | billing_date | String |  no  |  |
 | current_period | [CurrentPeriod](#CurrentPeriod) |  no  |  |
 | status | String |  no  |  |
 | is_test | Boolean |  no  |  |
 | metadata | HashMap<String,Any> |  no  |  |

---


 
 
 #### [EntitySubscription](#EntitySubscription)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | status | String |  no  |  |
 | company_id | Int |  no  |  |
 | activated_on | String |  no  |  |
 | cancelled_on | String |  no  |  |
 | trial_days | Int |  no  |  |
 | trial_period | [SubscriptionTrialPeriod](#SubscriptionTrialPeriod) |  no  |  |
 | metadata | HashMap<String,Any> |  no  |  |
 | line_items | ArrayList<[SubscriptionCharge](#SubscriptionCharge)> |  no  |  |

---


 
 
 #### [CreateSubscriptionResponse](#CreateSubscriptionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subscription | [EntitySubscription](#EntitySubscription) |  no  |  |
 | confirm_url | String |  no  |  |

---


 
 
 #### [InvoiceDetailsPeriod](#InvoiceDetailsPeriod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start | String |  no  |  |
 | end | String |  no  |  |

---


 
 
 #### [InvoiceDetailsClient](#InvoiceDetailsClient)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address_lines | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | email | String |  no  |  |
 | phone | String |  no  |  |

---


 
 
 #### [InvoiceDetailsStatusTrail](#InvoiceDetailsStatusTrail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | value | String |  no  |  |
 | timestamp | String |  no  |  |

---


 
 
 #### [InvoiceDetailsPaymentMethodsDataChecks](#InvoiceDetailsPaymentMethodsDataChecks)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cvc_check | String |  no  |  |
 | address_line1_check | String |  no  |  |
 | address_postal_code_check | String |  no  |  |

---


 
 
 #### [InvoiceDetailsPaymentMethodsDataNetworks](#InvoiceDetailsPaymentMethodsDataNetworks)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | available | ArrayList<String> |  no  |  |
 | preferred | String |  no  |  |

---


 
 
 #### [InvoiceDetailsPaymentMethodsDataThreeDSecureUsage](#InvoiceDetailsPaymentMethodsDataThreeDSecureUsage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | supported | Boolean |  no  |  |

---


 
 
 #### [InvoiceDetailsPaymentMethodsData](#InvoiceDetailsPaymentMethodsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | String |  no  |  |
 | last4 | String |  no  |  |
 | checks | [InvoiceDetailsPaymentMethodsDataChecks](#InvoiceDetailsPaymentMethodsDataChecks) |  no  |  |
 | wallet | String |  no  |  |
 | country | String |  no  |  |
 | funding | String |  no  |  |
 | exp_year | Int |  no  |  |
 | networks | [InvoiceDetailsPaymentMethodsDataNetworks](#InvoiceDetailsPaymentMethodsDataNetworks) |  no  |  |
 | exp_month | Int |  no  |  |
 | fingerprint | String |  no  |  |
 | generated_from | String |  no  |  |
 | three_d_secure_usage | [InvoiceDetailsPaymentMethodsDataThreeDSecureUsage](#InvoiceDetailsPaymentMethodsDataThreeDSecureUsage) |  no  |  |

---


 
 
 #### [InvoiceDetailsPaymentMethods](#InvoiceDetailsPaymentMethods)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | type | String |  no  |  |
 | pg_payment_method_id | String |  no  |  |
 | data | [InvoiceDetailsPaymentMethodsData](#InvoiceDetailsPaymentMethodsData) |  no  |  |
 | is_default | Boolean |  no  |  |

---


 
 
 #### [InvoicePaymentMethod](#InvoicePaymentMethod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pg_payment_method_id | String |  no  |  |

---


 
 
 #### [InvoiceDetails](#InvoiceDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | period | [InvoiceDetailsPeriod](#InvoiceDetailsPeriod) |  no  |  |
 | client | [InvoiceDetailsClient](#InvoiceDetailsClient) |  no  |  |
 | auto_advance | Boolean |  no  |  |
 | currency | String |  no  |  |
 | paid | Boolean |  no  |  |
 | attemp | Int |  no  |  |
 | _id | String |  no  |  |
 | collection_method | String |  no  |  |
 | subscriber_id | String |  no  |  |
 | invoice_url | String |  no  |  |
 | number | String |  no  |  |
 | pg_data | HashMap<String,Any> |  no  |  |
 | receipt_number | String |  no  |  |
 | statement_descriptor | String |  no  |  |
 | current_status | String |  no  |  |
 | status_trail | ArrayList<[InvoiceDetailsStatusTrail](#InvoiceDetailsStatusTrail)> |  no  |  |
 | subtotal | Double |  no  |  |
 | total | Double |  no  |  |
 | subscription | String |  no  |  |
 | next_action_time | String |  no  |  |
 | created_at | String |  no  |  |
 | modified_at | String |  no  |  |
 | hash_identifier | String |  no  |  |
 | payment_method | [InvoicePaymentMethod](#InvoicePaymentMethod) |  no  |  |

---


 
 
 #### [InvoiceItemsPlanRecurring](#InvoiceItemsPlanRecurring)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | interval | String |  no  |  |
 | interval_count | Int |  no  |  |

---


 
 
 #### [InvoiceItemsPlan](#InvoiceItemsPlan)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recurring | [InvoiceItemsPlanRecurring](#InvoiceItemsPlanRecurring) |  no  |  |
 | is_trial_plan | Boolean |  no  |  |
 | plan_group | String |  no  |  |
 | tag_lines | ArrayList<String> |  no  |  |
 | currency | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | is_visible | Boolean |  no  |  |
 | trial_period | Int |  no  |  |
 | addons | ArrayList<String> |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | type | String |  no  |  |
 | country | String |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | amount | Int |  no  |  |
 | product_suite_id | String |  no  |  |
 | created_at | String |  no  |  |
 | modified_at | String |  no  |  |

---


 
 
 #### [InvoiceItemsPeriod](#InvoiceItemsPeriod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start | String |  no  |  |
 | end | String |  no  |  |

---


 
 
 #### [InvoiceItems](#InvoiceItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | currency | String |  no  |  |
 | plan | [InvoiceItemsPlan](#InvoiceItemsPlan) |  no  |  |
 | name | String |  no  |  |
 | quantity | Int |  no  |  |
 | description | String |  no  |  |
 | period | [InvoiceItemsPeriod](#InvoiceItemsPeriod) |  no  |  |
 | unit_amount | Double |  no  |  |
 | amount | Double |  no  |  |
 | type | String |  no  |  |
 | invoice_id | String |  no  |  |
 | created_at | String |  no  |  |
 | modified_at | String |  no  |  |

---


 
 
 #### [Invoice](#Invoice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoice | [InvoiceDetails](#InvoiceDetails) |  no  |  |
 | invoice_items | ArrayList<[InvoiceItems](#InvoiceItems)> |  no  |  |

---


 
 
 #### [InvoicesDataClient](#InvoicesDataClient)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | email | String |  no  |  |
 | phone | String |  no  |  |
 | address_lines | ArrayList<String> |  no  |  |

---


 
 
 #### [InvoicesDataPeriod](#InvoicesDataPeriod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start | String |  no  |  |
 | end | String |  no  |  |

---


 
 
 #### [InvoicesDataPaymentMethod](#InvoicesDataPaymentMethod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pg_payment_method_id | String |  no  |  |

---


 
 
 #### [InvoicesData](#InvoicesData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | client | [InvoicesDataClient](#InvoicesDataClient) |  no  |  |
 | auto_advance | Boolean |  no  |  |
 | currency | String |  no  |  |
 | paid | Boolean |  no  |  |
 | attemp | Int |  no  |  |
 | collection_method | String |  no  |  |
 | subscriber_id | String |  no  |  |
 | invoice_url | String |  no  |  |
 | number | String |  no  |  |
 | pg_data | HashMap<String,Any> |  no  |  |
 | period | [InvoicesDataPeriod](#InvoicesDataPeriod) |  no  |  |
 | receipt_number | String |  no  |  |
 | statement_descriptor | String |  no  |  |
 | current_status | String |  no  |  |
 | status_trail | ArrayList<[InvoiceDetailsStatusTrail](#InvoiceDetailsStatusTrail)> |  no  |  |
 | subtotal | Double |  no  |  |
 | total | Double |  no  |  |
 | subscription | String |  no  |  |
 | next_action_time | String |  no  |  |
 | created_at | String |  no  |  |
 | modified_at | String |  no  |  |
 | hash_identifier | String |  no  |  |
 | payment_method | [InvoicesDataPaymentMethod](#InvoicesDataPaymentMethod) |  no  |  |
 | invoice_items | ArrayList<[InvoiceItems](#InvoiceItems)> |  no  |  |

---


 
 
 #### [Invoices](#Invoices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[InvoicesData](#InvoicesData)> |  no  |  |
 | start | Int |  no  |  |
 | end | Int |  no  |  |
 | limit | Int |  no  |  |
 | page | Int |  no  |  |
 | total | Int |  no  |  |

---


 
 
 #### [Phone](#Phone)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone_number | String |  no  |  |
 | phone_country_code | String |  no  |  |

---


 
 
 #### [SubscriptionBillingAddress](#SubscriptionBillingAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | state | String |  no  |  |
 | city | String |  no  |  |
 | line1 | String |  no  |  |
 | line2 | String |  no  |  |
 | postal_code | String |  no  |  |

---


 
 
 #### [SubscriptionCustomer](#SubscriptionCustomer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | [Phone](#Phone) |  no  |  |
 | billing_address | [SubscriptionBillingAddress](#SubscriptionBillingAddress) |  no  |  |
 | _id | String |  no  |  |
 | unique_id | String |  no  |  |
 | type | String |  no  |  |
 | name | String |  no  |  |
 | email | String |  no  |  |
 | created_at | String |  no  |  |
 | modified_at | String |  no  |  |
 | data | HashMap<String,Any> |  no  |  |

---


 
 
 #### [SubscriptionCustomerCreate](#SubscriptionCustomerCreate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | [Phone](#Phone) |  no  |  |
 | billing_address | [SubscriptionBillingAddress](#SubscriptionBillingAddress) |  no  |  |
 | unique_id | String |  no  |  |
 | type | String |  no  |  |
 | name | String |  no  |  |
 | email | String |  no  |  |

---


 
 
 #### [SubscriptionCurrentPeriod](#SubscriptionCurrentPeriod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start | String |  no  |  |
 | end | String |  no  |  |

---


 
 
 #### [SubscriptionPauseCollection](#SubscriptionPauseCollection)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | behavior | String |  no  |  |
 | resume_at | String |  no  |  |

---


 
 
 #### [SubscriptionTrial](#SubscriptionTrial)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start | String |  no  |  |
 | end | String |  no  |  |

---


 
 
 #### [SubscriptionInvoiceSettings](#SubscriptionInvoiceSettings)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | generation | Boolean |  no  |  |
 | charging | Boolean |  no  |  |

---


 
 
 #### [Subscription](#Subscription)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current_period | [SubscriptionCurrentPeriod](#SubscriptionCurrentPeriod) |  no  |  |
 | pause_collection | [SubscriptionPauseCollection](#SubscriptionPauseCollection) |  no  |  |
 | trial | [SubscriptionTrial](#SubscriptionTrial) |  no  |  |
 | invoice_settings | [SubscriptionInvoiceSettings](#SubscriptionInvoiceSettings) |  no  |  |
 | is_active | Boolean |  no  |  |
 | cancel_at_period_end | Boolean |  no  |  |
 | _id | String |  no  |  |
 | subscriber_id | String |  no  |  |
 | plan_id | String |  no  |  |
 | product_suite_id | String |  no  |  |
 | plan_data | [Plan](#Plan) |  no  |  |
 | current_status | String |  no  |  |
 | collection_method | String |  no  |  |
 | created_at | String |  no  |  |
 | modified_at | String |  no  |  |
 | latest_invoice | String |  no  |  |

---


 
 
 #### [SubscriptionStatus](#SubscriptionStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_enabled | Boolean |  no  |  |
 | subscription | [Subscription](#Subscription) |  no  |  |

---


 
 
 #### [SubscriptionLimitApplication](#SubscriptionLimitApplication)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | hard_limit | Int |  no  |  |
 | soft_limit | Int |  no  |  |

---


 
 
 #### [SubscriptionLimitMarketplace](#SubscriptionLimitMarketplace)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [SubscriptionLimitOtherPlatform](#SubscriptionLimitOtherPlatform)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [SubscriptionLimitTeam](#SubscriptionLimitTeam)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | limit | Int |  no  |  |

---


 
 
 #### [SubscriptionLimitProducts](#SubscriptionLimitProducts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bulk | Boolean |  no  |  |
 | limit | Int |  no  |  |

---


 
 
 #### [SubscriptionLimitExtensions](#SubscriptionLimitExtensions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | limit | Int |  no  |  |

---


 
 
 #### [SubscriptionLimitIntegrations](#SubscriptionLimitIntegrations)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | limit | Int |  no  |  |

---


 
 
 #### [SubscriptionLimit](#SubscriptionLimit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application | [SubscriptionLimitApplication](#SubscriptionLimitApplication) |  no  |  |
 | marketplace | [SubscriptionLimitMarketplace](#SubscriptionLimitMarketplace) |  no  |  |
 | other_platform | [SubscriptionLimitOtherPlatform](#SubscriptionLimitOtherPlatform) |  no  |  |
 | team | [SubscriptionLimitTeam](#SubscriptionLimitTeam) |  no  |  |
 | products | [SubscriptionLimitProducts](#SubscriptionLimitProducts) |  no  |  |
 | extensions | [SubscriptionLimitExtensions](#SubscriptionLimitExtensions) |  no  |  |
 | integrations | [SubscriptionLimitIntegrations](#SubscriptionLimitIntegrations) |  no  |  |
 | is_trial_plan | Boolean |  no  |  |

---


 
 
 #### [SubscriptionActivateReq](#SubscriptionActivateReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unique_id | String |  no  |  |
 | type | String |  no  |  |
 | product_suite | String |  no  |  |
 | plan_id | String |  no  |  |
 | payment_method | String |  no  |  |

---


 
 
 #### [SubscriptionActivateRes](#SubscriptionActivateRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | data | [Subscription](#Subscription) |  no  |  |

---


 
 
 #### [CancelSubscriptionReq](#CancelSubscriptionReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unique_id | String |  no  |  |
 | type | String |  no  |  |
 | product_suite | String |  no  |  |
 | subscription_id | String |  no  |  |

---


 
 
 #### [CancelSubscriptionRes](#CancelSubscriptionRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | data | [Subscription](#Subscription) |  no  |  |

---




 
 
 #### [StatsImported](#StatsImported)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |

---


 
 
 #### [StatsProcessedEmail](#StatsProcessedEmail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Int |  no  |  |
 | failed | Int |  no  |  |
 | suppressed | Int |  no  |  |

---


 
 
 #### [StatsProcessedSms](#StatsProcessedSms)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Int |  no  |  |
 | failed | Int |  no  |  |
 | suppressed | Int |  no  |  |

---


 
 
 #### [StatsProcessed](#StatsProcessed)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | [StatsProcessedEmail](#StatsProcessedEmail) |  no  |  |
 | sms | [StatsProcessedSms](#StatsProcessedSms) |  no  |  |

---


 
 
 #### [Stats](#Stats)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | imported | Any |  no  |  |
 | processed | Any |  no  |  |

---


 
 
 #### [GetStats](#GetStats)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Stats](#Stats)> |  no  |  |

---


 
 
 #### [CampaignReq](#CampaignReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | headers | ArrayList<String> |  no  |  |
 | is_active | Boolean |  no  |  |
 | name | String |  no  |  |
 | file_url | String |  no  |  |
 | type | String |  no  |  |
 | records_count | Int |  no  |  |
 | application | String |  no  |  |

---


 
 
 #### [RecipientHeaders](#RecipientHeaders)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |

---


 
 
 #### [CampaignEmailTemplate](#CampaignEmailTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [CampignEmailProvider](#CampignEmailProvider)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | from_name | String |  no  |  |
 | from_email | String |  no  |  |

---


 
 
 #### [CampaignEmail](#CampaignEmail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | template | [CampaignEmailTemplate](#CampaignEmailTemplate) |  no  |  |
 | provider | [CampignEmailProvider](#CampignEmailProvider) |  no  |  |

---


 
 
 #### [Campaign](#Campaign)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recipient_headers | [RecipientHeaders](#RecipientHeaders) |  no  |  |
 | email | [CampaignEmail](#CampaignEmail) |  no  |  |
 | description | String |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | is_active | Boolean |  no  |  |
 | _id | String |  no  |  |
 | datasource | String |  no  |  |
 | type | String |  no  |  |
 | name | String |  no  |  |
 | application | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | slug | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [Campaigns](#Campaigns)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Campaign](#Campaign)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [BigqueryHeadersReq](#BigqueryHeadersReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | query | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [BigqueryHeadersResHeaders](#BigqueryHeadersResHeaders)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [BigqueryHeadersRes](#BigqueryHeadersRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | headers | ArrayList<[BigqueryHeadersResHeaders](#BigqueryHeadersResHeaders)> |  no  |  |

---


 
 
 #### [GetNRecordsCsvReq](#GetNRecordsCsvReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | header | Boolean |  no  |  |
 | count | Int |  no  |  |

---


 
 
 #### [GetNRecordsCsvResItems](#GetNRecordsCsvResItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone_number | String |  no  |  |
 | email | String |  no  |  |
 | firstname | String |  no  |  |
 | lastname | String |  no  |  |
 | orderid | String |  no  |  |

---


 
 
 #### [GetNRecordsCsvRes](#GetNRecordsCsvRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetNRecordsCsvResItems](#GetNRecordsCsvResItems)> |  no  |  |

---


 
 
 #### [AudienceReq](#AudienceReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | headers | ArrayList<String> |  no  |  |
 | is_active | Boolean |  no  |  |
 | name | String |  no  |  |
 | file_url | String |  no  |  |
 | type | String |  no  |  |
 | records_count | Int |  no  |  |
 | application | String |  no  |  |

---


 
 
 #### [Audience](#Audience)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | headers | ArrayList<String> |  no  |  |
 | is_active | Boolean |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | file_url | String |  no  |  |
 | type | String |  no  |  |
 | records_count | Int |  no  |  |
 | application | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | slug | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [Audiences](#Audiences)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Audience](#Audience)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [EmailProviderReqFrom](#EmailProviderReqFrom)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | email | String |  no  |  |
 | is_default | Boolean |  no  |  |

---


 
 
 #### [EmailProviderReq](#EmailProviderReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | api_key | String |  no  |  |
 | type | String |  no  |  |
 | provider | String |  no  |  |
 | from | ArrayList<[EmailProviderReqFrom](#EmailProviderReqFrom)> |  no  |  |

---


 
 
 #### [EmailProvider](#EmailProvider)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | provider | String |  no  |  |
 | from | ArrayList<[EmailProviderReqFrom](#EmailProviderReqFrom)> |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | api_key | String |  no  |  |
 | application | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | slug | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [EmailProviders](#EmailProviders)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[EmailProvider](#EmailProvider)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [EmailTemplateDeleteSuccessRes](#EmailTemplateDeleteSuccessRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [EmailTemplateDeleteFailureRes](#EmailTemplateDeleteFailureRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [EmailTemplateKeys](#EmailTemplateKeys)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | to | String |  no  |  |
 | cc | String |  no  |  |
 | bcc | String |  no  |  |

---


 
 
 #### [EmailTemplateHeaders](#EmailTemplateHeaders)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [EmailTemplateReq](#EmailTemplateReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | keys | [EmailTemplateKeys](#EmailTemplateKeys) |  no  |  |
 | from | String |  no  |  |
 | static_to | ArrayList<String> |  no  |  |
 | static_cc | ArrayList<String> |  no  |  |
 | static_bcc | ArrayList<String> |  no  |  |
 | reply_to | String |  no  |  |
 | headers | ArrayList<[EmailTemplateHeaders](#EmailTemplateHeaders)> |  no  |  |
 | subject | [TemplateAndType](#TemplateAndType) |  no  |  |
 | html | [TemplateAndType](#TemplateAndType) |  no  |  |
 | text | [TemplateAndType](#TemplateAndType) |  no  |  |
 | attachments | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |

---


 
 
 #### [TemplateAndType](#TemplateAndType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | template_type | String |  no  |  |
 | template | String |  no  |  |

---


 
 
 #### [EmailTemplateRes](#EmailTemplateRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_system | Boolean |  no  |  |
 | is_internal | Boolean |  no  |  |
 | description | String |  no  |  |
 | static_to | ArrayList<String> |  no  |  |
 | static_cc | ArrayList<String> |  no  |  |
 | static_bcc | ArrayList<String> |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |
 | published | Boolean |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | keys | [EmailTemplateKeys](#EmailTemplateKeys) |  no  |  |
 | from | String |  no  |  |
 | reply_to | String |  no  |  |
 | headers | ArrayList<[EmailTemplateHeaders](#EmailTemplateHeaders)> |  no  |  |
 | subject | [TemplateAndType](#TemplateAndType) |  no  |  |
 | html | [TemplateAndType](#TemplateAndType) |  no  |  |
 | text | [TemplateAndType](#TemplateAndType) |  no  |  |
 | attachments | ArrayList<Any> |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | slug | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [EmailTemplate](#EmailTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_system | Boolean |  no  |  |
 | is_internal | Boolean |  no  |  |
 | description | String |  no  |  |
 | static_to | ArrayList<Any> |  no  |  |
 | static_cc | ArrayList<Any> |  no  |  |
 | static_bcc | ArrayList<Any> |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |
 | published | Boolean |  no  |  |
 | _id | String |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | from | String |  no  |  |
 | from_name | String |  no  |  |
 | subject | [TemplateAndType](#TemplateAndType) |  no  |  |
 | html | [TemplateAndType](#TemplateAndType) |  no  |  |
 | text | [TemplateAndType](#TemplateAndType) |  no  |  |
 | headers | ArrayList<Any> |  no  |  |
 | attachments | ArrayList<Any> |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [SystemEmailTemplate](#SystemEmailTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_system | Boolean |  no  |  |
 | is_internal | Boolean |  no  |  |
 | description | String |  no  |  |
 | static_to | ArrayList<Any> |  no  |  |
 | static_cc | ArrayList<Any> |  no  |  |
 | static_bcc | ArrayList<Any> |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |
 | published | Boolean |  no  |  |
 | _id | String |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | from | String |  no  |  |
 | from_name | String |  no  |  |
 | subject | [TemplateAndType](#TemplateAndType) |  no  |  |
 | html | [TemplateAndType](#TemplateAndType) |  no  |  |
 | text | [TemplateAndType](#TemplateAndType) |  no  |  |
 | headers | ArrayList<Any> |  no  |  |
 | attachments | ArrayList<Any> |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [EmailTemplates](#EmailTemplates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[EmailTemplate](#EmailTemplate)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [SystemEmailTemplates](#SystemEmailTemplates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[SystemEmailTemplate](#SystemEmailTemplate)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [EventSubscriptionTemplateSms](#EventSubscriptionTemplateSms)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subscribed | Boolean |  no  |  |
 | template | String |  no  |  |

---


 
 
 #### [EventSubscriptionTemplateEmail](#EventSubscriptionTemplateEmail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subscribed | Boolean |  no  |  |
 | template | String |  no  |  |

---


 
 
 #### [EventSubscriptionTemplate](#EventSubscriptionTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sms | [EventSubscriptionTemplateSms](#EventSubscriptionTemplateSms) |  no  |  |
 | email | [EventSubscriptionTemplateEmail](#EventSubscriptionTemplateEmail) |  no  |  |

---


 
 
 #### [EventSubscription](#EventSubscription)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | template | [EventSubscriptionTemplate](#EventSubscriptionTemplate) |  no  |  |
 | is_default | Boolean |  no  |  |
 | _id | String |  no  |  |
 | application | String |  no  |  |
 | event | String |  no  |  |
 | slug | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [EventSubscriptions](#EventSubscriptions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[EventSubscription](#EventSubscription)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [TriggerJobResponse](#TriggerJobResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | Int |  no  |  |

---


 
 
 #### [TriggerJobRequest](#TriggerJobRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | job_id | String |  no  |  |

---


 
 
 #### [Job](#Job)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | completed | Boolean |  no  |  |
 | is_active | Boolean |  no  |  |
 | _id | String |  no  |  |
 | campaign | String |  no  |  |
 | application | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [Jobs](#Jobs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Job](#Job)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [JobLog](#JobLog)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | imported | Any |  no  |  |
 | processed | Any |  no  |  |
 | _id | String |  no  |  |
 | job | String |  no  |  |
 | campaign | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [JobLogs](#JobLogs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[JobLog](#JobLog)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [LogEmail](#LogEmail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | template | String |  no  |  |

---


 
 
 #### [LogPushnotification](#LogPushnotification)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pushtokens | ArrayList<String> |  no  |  |

---


 
 
 #### [LogMeta](#LogMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | identifier | String |  no  |  |
 | key | String |  no  |  |
 | offset | String |  no  |  |
 | partition | String |  no  |  |
 | topic | String |  no  |  |

---


 
 
 #### [Log](#Log)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | [LogEmail](#LogEmail) |  no  |  |
 | pushnotification | [LogPushnotification](#LogPushnotification) |  no  |  |
 | meta | [LogMeta](#LogMeta) |  no  |  |
 | _id | String |  no  |  |
 | application | String |  no  |  |
 | service | String |  no  |  |
 | step | String |  no  |  |
 | status | String |  no  |  |
 | data | Any |  no  |  |
 | expire_at | String |  no  |  |
 | created_at | String |  no  |  |

---


 
 
 #### [Logs](#Logs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Log](#Log)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [PushtokenReq](#PushtokenReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | String |  no  |  |
 | bundle_identifier | String |  no  |  |
 | push_token | String |  no  |  |
 | unique_device_id | String |  no  |  |

---


 
 
 #### [PushtokenRes](#PushtokenRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | bundle_identifier | String |  no  |  |
 | push_token | String |  no  |  |
 | unique_device_id | String |  no  |  |
 | type | String |  no  |  |
 | platform | String |  no  |  |
 | application_id | String |  no  |  |
 | user_id | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | expired_at | String |  no  |  |

---


 
 
 #### [SmsProviderReq](#SmsProviderReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | sender | String |  no  |  |
 | username | String |  no  |  |
 | authkey | String |  no  |  |
 | type | String |  no  |  |
 | provider | String |  no  |  |

---


 
 
 #### [SmsProvider](#SmsProvider)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rpt | Int |  no  |  |
 | type | String |  no  |  |
 | provider | String |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | sender | String |  no  |  |
 | username | String |  no  |  |
 | authkey | String |  no  |  |
 | application | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | slug | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [SmsProviders](#SmsProviders)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[SmsProvider](#SmsProvider)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [SmsTemplateDeleteSuccessRes](#SmsTemplateDeleteSuccessRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [SmsTemplateDeleteFailureRes](#SmsTemplateDeleteFailureRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [SmsTemplateMessage](#SmsTemplateMessage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | template_type | String |  no  |  |
 | template | String |  no  |  |

---


 
 
 #### [SmsTemplateReq](#SmsTemplateReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | message | [SmsTemplateMessage](#SmsTemplateMessage) |  no  |  |
 | template_variables | Any |  no  |  |
 | attachments | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |

---


 
 
 #### [SmsTemplateRes](#SmsTemplateRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_system | Boolean |  no  |  |
 | is_internal | Boolean |  no  |  |
 | description | String |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |
 | published | Boolean |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | message | [SmsTemplateMessage](#SmsTemplateMessage) |  no  |  |
 | template_variables | Any |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | slug | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [SmsTemplate](#SmsTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_system | Boolean |  no  |  |
 | is_internal | Boolean |  no  |  |
 | description | String |  no  |  |
 | priority | String |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | published | Boolean |  no  |  |
 | _id | String |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | message | [SmsTemplateMessage](#SmsTemplateMessage) |  no  |  |
 | template_variables | Any |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [SystemSmsTemplate](#SystemSmsTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_system | Boolean |  no  |  |
 | is_internal | Boolean |  no  |  |
 | description | String |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |
 | published | Boolean |  no  |  |
 | _id | String |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | message | [SmsTemplateMessage](#SmsTemplateMessage) |  no  |  |
 | template_variables | Any |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [SmsTemplates](#SmsTemplates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[SmsTemplate](#SmsTemplate)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [SystemSmsTemplates](#SystemSmsTemplates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[SystemSmsTemplate](#SystemSmsTemplate)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [Notification](#Notification)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | body | String |  no  |  |
 | subtitle | String |  no  |  |
 | icon | String |  no  |  |
 | deeplink | String |  no  |  |
 | click_action | String |  no  |  |

---


 
 
 #### [SystemNotificationUser](#SystemNotificationUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [SystemNotificationSettings](#SystemNotificationSettings)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sound | Boolean |  no  |  |
 | priority | String |  no  |  |
 | time_to_live | String |  no  |  |

---


 
 
 #### [SystemNotification](#SystemNotification)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | notification | [Notification](#Notification) |  no  |  |
 | user | [SystemNotificationUser](#SystemNotificationUser) |  no  |  |
 | settings | [SystemNotificationUser](#SystemNotificationUser) |  no  |  |
 | _id | String |  no  |  |
 | group | String |  no  |  |
 | created_at | String |  no  |  |

---


 
 
 #### [SystemNotificationsPage](#SystemNotificationsPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | current | Int |  no  |  |
 | size | Int |  no  |  |
 | item_total | Int |  no  |  |
 | has_next | Boolean |  no  |  |

---


 
 
 #### [SystemNotifications](#SystemNotifications)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[SystemNotification](#SystemNotification)> |  no  |  |
 | last_read_anchor | Int |  no  |  |
 | page | [Page](#Page) |  no  |  |

---




 
 
 #### [PaymentGatewayConfigResponse](#PaymentGatewayConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app_id | String? |  yes  | Application Id to which Payment config Mapped |
 | success | Boolean? |  yes  | Response is successful or not |
 | excluded_fields | ArrayList<String>? |  yes  | List of all excluded  options with their Details. |
 | aggregators | ArrayList<HashMap<String,Any>> |  no  | List of all speceific Payment options with their Details. |
 | created | Boolean? |  yes  | Response is created or not |
 | display_fields | ArrayList<String>? |  yes  | List of all included  options with their Details. |

---


 
 
 #### [ErrorCodeDescription](#ErrorCodeDescription)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String? |  yes  | Error human understandable description. |
 | success | Boolean? |  yes  | Response is successful or not |
 | code | String? |  yes  | Error descrption code. |

---


 
 
 #### [PaymentGatewayConfig](#PaymentGatewayConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | merchant_salt | String? |  yes  | Merchant key of the payment aggregator |
 | secret | String? |  yes  | Secret Key of the payment aggregator |
 | config_type | String? |  yes  | Config Type of the aggregator |
 | key | String? |  yes  | Api key of the payment aggregator |
 | is_active | Boolean |  no  | Enable/ Disable Flag |

---


 
 
 #### [PaymentGatewayConfigRequest](#PaymentGatewayConfigRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aggregator_name | [PaymentGatewayConfig](#PaymentGatewayConfig) |  no  |  |
 | app_id | String? |  yes  | Application Id to which Payment config Mapped |
 | is_active | Boolean |  no  | Enable/ Disable Flag |

---


 
 
 #### [PaymentGatewayToBeReviewed](#PaymentGatewayToBeReviewed)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aggregator | ArrayList<String>? |  yes  | List of added payment gateway |
 | success | Boolean? |  yes  | Response is successful or not |

---


 
 
 #### [ErrorCodeAndDescription](#ErrorCodeAndDescription)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String? |  yes  | Error human understandable description. |
 | code | String? |  yes  | Error descrption code. |

---


 
 
 #### [HttpErrorCodeAndResponse](#HttpErrorCodeAndResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  | Response is successful or not |
 | error | [ErrorCodeAndDescription](#ErrorCodeAndDescription)? |  yes  |  |

---


 
 
 #### [PaymentModeLogo](#PaymentModeLogo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | large | String? |  yes  | large |
 | small | String? |  yes  | smalll |

---


 
 
 #### [PaymentModeList](#PaymentModeList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | card_name | String |  no  | card_name |
 | name | String |  no  | name |
 | card_brand_image | String |  no  | card_brand_image |
 | fynd_vpa | String |  no  | fynd_vpa |
 | card_isin | String |  no  | card_isin |
 | card_fingerprint | String |  no  | card_fingerprint |
 | card_id | String |  no  | card_id |
 | card_token | String |  no  | card_token |
 | exp_month | Int |  no  | exp_month |
 | code | String |  no  | code |
 | display_name | String |  no  | display name |
 | card_type | String |  no  | card_type |
 | aggregator_name | String? |  yes  | aggregator_name |
 | card_number | String |  no  | card_number |
 | card_brand | String |  no  | card_brand |
 | card_reference | String |  no  | card_reference |
 | expired | Boolean |  no  | expired |
 | card_issuer | String |  no  | card_issuer |
 | intent_flow | String |  no  | intent_flow |
 | timeout | Int |  no  | timeout |
 | logo_url | [PaymentModeLogo](#PaymentModeLogo) |  no  | Logo |
 | nickname | String |  no  | nickname |
 | merchant_code | String |  no  | merchant code |
 | display_priority | Int |  no  | Dispaly Priority |
 | exp_year | Int |  no  | exp_year |
 | retry_count | Int |  no  | retry_count |
 | intent_app_error_list | ArrayList<String> |  no  | intent_app_error_list |

---


 
 
 #### [RootPaymentMode](#RootPaymentMode)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  | Payment mode name |
 | display_priority | Int? |  yes  | Dispaly Priority |
 | anonymous_enable | Boolean |  no  | Annonymous card flag |
 | display_name | String? |  yes  | Payment mode display name |
 | list | ArrayList<[PaymentModeList](#PaymentModeList)> |  no  | Payment mode |
 | aggregator_name | String |  no  | Dispaly Priority |
 | add_card_enabled | Boolean |  no  | Annonymous card flag |

---


 
 
 #### [PaymentOptions](#PaymentOptions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payment_option | ArrayList<[RootPaymentMode](#RootPaymentMode)>? |  yes  | Payment options |

---


 
 
 #### [PaymentOptionsResponse](#PaymentOptionsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payment_options | [PaymentOptions](#PaymentOptions)? |  yes  | Payment options |
 | success | Boolean? |  yes  | Response is successful or not |

---


 
 
 #### [PayoutsResponse](#PayoutsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customers | HashMap<String,Any>? |  yes  | customers details object |
 | transfer_type | String? |  yes  | transafer type |
 | unique_transfer_no | HashMap<String,Any>? |  yes  | display priority of the payment mode |
 | is_active | Boolean? |  yes  | Enable/DIsable Flag Payout |
 | more_attributes | HashMap<String,Any>? |  yes  | bank details object |
 | payouts_aggregators | ArrayList<HashMap<String,Any>>? |  yes  | payout aggregator object |
 | is_default | Boolean? |  yes  | default or not  |

---


 
 
 #### [PayoutBankDetails](#PayoutBankDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | state | String |  no  |  |
 | account_no | String |  no  |  |
 | account_type | String? |  yes  |  |
 | ifsc_code | String? |  yes  |  |
 | city | String |  no  |  |
 | branch_name | String |  no  |  |
 | bank_name | String |  no  |  |
 | country | String |  no  |  |
 | pincode | Int |  no  |  |
 | account_holder | String |  no  |  |

---


 
 
 #### [PayoutRequest](#PayoutRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | users | HashMap<String,Any>? |  yes  | payout users object |
 | transfer_type | String? |  yes  | transafer type |
 | aggregator | String? |  yes  | Aggregator Name |
 | is_active | Boolean? |  yes  | Enable/Disable Flag Payout |
 | unique_external_id | String? |  yes  | Unique Id of Payout |
 | bank_details | [PayoutBankDetails](#PayoutBankDetails)? |  yes  | payout bank details object |

---


 
 
 #### [PayoutResponse](#PayoutResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  | Response is successful or not |
 | users | HashMap<String,Any>? |  yes  | users details object |
 | payouts | HashMap<String,Any>? |  yes  | payout  object |
 | transfer_type | String? |  yes  | transfer type |
 | aggregator | String? |  yes  | Aggregator Name |
 | created | Boolean? |  yes  | created flag |
 | unique_transfer_no | String? |  yes  | unique transfer no |
 | is_active | Boolean? |  yes  | Enable/DIsable Flag Payout |
 | bank_details | HashMap<String,Any>? |  yes  | payout bank_details object |
 | payment_status | String? |  yes  | status of payment |

---


 
 
 #### [UpdatePayoutResponse](#UpdatePayoutResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_default | Boolean? |  yes  | Enable/Disable Default Payout |
 | success | Boolean? |  yes  | Response is successful or not |
 | is_active | Boolean? |  yes  | Enable/DIsable Flag Payout |

---


 
 
 #### [UpdatePayoutRequest](#UpdatePayoutRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_default | Boolean? |  yes  | Enable/Disable Default Payout |
 | is_active | Boolean? |  yes  | Enable/Disable Flag Payout |
 | unique_external_id | String? |  yes  | Unique Id of Payout |

---


 
 
 #### [DeletePayoutResponse](#DeletePayoutResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  | Response is successful or not |

---


 
 
 #### [SubscriptionPaymentMethodResponse](#SubscriptionPaymentMethodResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<HashMap<String,Any>>? |  yes  | Subscription Payment Method Object |
 | success | Boolean? |  yes  | Response is successful or not |

---


 
 
 #### [DeleteSubscriptionPaymentMethodResponse](#DeleteSubscriptionPaymentMethodResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  | Success or failure. |

---


 
 
 #### [SubscriptionConfigResponse](#SubscriptionConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aggregator | String? |  yes  | Aggregator Name |
 | config | HashMap<String,Any>? |  yes  | Aggregator Config |
 | success | Boolean? |  yes  | Response is successful or not |

---


 
 
 #### [SaveSubscriptionSetupIntentRequest](#SaveSubscriptionSetupIntentRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unique_external_id | String? |  yes  | Unique id i.e company:id |

---


 
 
 #### [SaveSubscriptionSetupIntentResponse](#SaveSubscriptionSetupIntentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | HashMap<String,Any>? |  yes  | Subscription Payment Method Object |
 | success | Boolean? |  yes  | Response is successful or not |

---


 
 
 #### [BeneficiaryModeDetails](#BeneficiaryModeDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  | Email of the Account Holder |
 | address | String |  no  | Address of the User |
 | account_no | String? |  yes  | Account NUmber of the Account Holder |
 | comment | String |  no  | Remarks added by The user |
 | ifsc_code | String? |  yes  | Ifsc Code of the Account |
 | mobile | String? |  yes  | Moblie Number of the User |
 | branch_name | String? |  yes  | Branch Name of the Account |
 | bank_name | String? |  yes  | Bank Name of the Account |
 | vpa | String |  no  |  |
 | wallet | String |  no  |  |
 | account_holder | String? |  yes  | Name of the Account Holder |

---


 
 
 #### [AddBeneficiaryDetailsRequest](#AddBeneficiaryDetailsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order_id | String? |  yes  | Merchant Order Id |
 | transfer_mode | String? |  yes  | Transfer Mode of the Beneficiary to be added |
 | delights | Boolean? |  yes  | True if  beneficiary to be added by delights or False if by User |
 | otp | String |  no  |  |
 | request_id | String |  no  |  |
 | shipment_id | String? |  yes  | Shipment Id of the respective Merchant Order Id |
 | details | [BeneficiaryModeDetails](#BeneficiaryModeDetails)? |  yes  | Beneficiary bank details |

---


 
 
 #### [RefundAccountResponse](#RefundAccountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  | Response message |
 | data | HashMap<String,Any> |  no  | Refund account data. |
 | success | Boolean? |  yes  | Success or failure flag. |

---


 
 
 #### [NotFoundResourceError](#NotFoundResourceError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String? |  yes  | Not Found |
 | success | Boolean? |  yes  | Response is successful or not |
 | code | String? |  yes  | Bad Request Data |

---


 
 
 #### [IfscCodeResponse](#IfscCodeResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bank_name | String? |  yes  | Bank Name Of Account |
 | success | Boolean |  no  | Response is successful or not |
 | branch_name | String? |  yes  | Branch Name Of Account |

---


 
 
 #### [OrderBeneficiaryDetails](#OrderBeneficiaryDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  | EMail of User |
 | address | String? |  yes  | Address of User |
 | id | Int? |  yes  |   |
 | transfer_mode | String? |  yes  | Transfer Mode Of Account |
 | title | String? |  yes  | Title Of Account |
 | created_on | String? |  yes  | Creation Date of Beneficiary |
 | ifsc_code | String? |  yes  | Ifsc Code Of Account |
 | display_name | String? |  yes  | Display Name Of Account |
 | is_active | Boolean? |  yes  | Boolean Flag whether Beneficiary set or not |
 | bank_name | String? |  yes  | Bank Name Of Account |
 | delights_user_name | String? |  yes  | User Id Who filled the Beneficiary  |
 | beneficiary_id | String? |  yes  | Benenficiary Id |
 | subtitle | String? |  yes  | SHort Title Of Account |
 | account_no | String? |  yes  | Account Number |
 | comment | Boolean |  no  | Remarks |
 | mobile | Boolean |  no  | MObile no of User |
 | branch_name | Boolean |  no  | Branch Name Of Account |
 | modified_on | String? |  yes  | MOdification Date of Beneficiary |
 | account_holder | String? |  yes  | Account Holder Name |

---


 
 
 #### [OrderBeneficiaryResponse](#OrderBeneficiaryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | beneficiaries | ArrayList<[OrderBeneficiaryDetails](#OrderBeneficiaryDetails)>? |  yes  | All Beneficiaries Of An Order |
 | show_beneficiary_details | Boolean |  no  | Show beneficiary details or not. |

---




 
 
 #### [GetActivityStatus](#GetActivityStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | activity_history | [ActivityHistory](#ActivityHistory)? |  yes  |  |

---


 
 
 #### [ActivityHistory](#ActivityHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdat | String |  no  |  |
 | message | String |  no  |  |
 | type | String |  no  |  |
 | user | String |  no  |  |

---


 
 
 #### [FailedOrders](#FailedOrders)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orders | [FailOrder](#FailOrder)? |  yes  |  |

---


 
 
 #### [FailOrder](#FailOrder)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | updated_at | String |  no  |  |
 | _id | String |  no  |  |
 | reason | String |  no  |  |
 | marketplace_order | [MarketplaceOrder](#MarketplaceOrder) |  no  |  |
 | marketplace_order_id | String |  no  |  |
 | created_at | String |  no  |  |
 | app_id | String |  no  |  |
 | marketplace | String |  no  |  |
 | company_id | Int |  no  |  |

---


 
 
 #### [MarketplaceOrder](#MarketplaceOrder)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order_status_url | String |  no  |  |
 | admin_graphql_api_id | String |  no  |  |
 | email | String |  no  |  |
 | test | Boolean |  no  |  |
 | note | String |  no  |  |
 | total_price | String |  no  |  |
 | app_id | Int |  no  |  |
 | total_discounts_set | [TotalDiscountsSet](#TotalDiscountsSet) |  no  |  |
 | total_price_set | [TotalPriceSet](#TotalPriceSet) |  no  |  |
 | total_tax_set | [TotalTaxSet](#TotalTaxSet) |  no  |  |
 | gateway | String |  no  |  |
 | name | String |  no  |  |
 | subtotal_price_set | [SubtotalPriceSet](#SubtotalPriceSet) |  no  |  |
 | number | Int |  no  |  |
 | buyer_accepts_marketing | Boolean |  no  |  |
 | contact_email | String |  no  |  |
 | token | String |  no  |  |
 | source_name | String |  no  |  |
 | payment_gateway_names | ArrayList<Any> |  no  |  |
 | presentment_currency | String |  no  |  |
 | subtotal_price | String |  no  |  |
 | processed_at | String |  no  |  |
 | order_number | Int |  no  |  |
 | total_tip_received | String |  no  |  |
 | id | Int |  no  |  |
 | confirmed | Boolean |  no  |  |
 | currency | String |  no  |  |
 | total_line_items_price | String |  no  |  |
 | line_items | [LineItems](#LineItems) |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | total_weight | Int |  no  |  |
 | billing_address | [BillingAddress](#BillingAddress) |  no  |  |
 | total_shipping_price_set | [TotalShippingPriceSet](#TotalShippingPriceSet) |  no  |  |
 | customer | [Customer](#Customer) |  no  |  |
 | total_discounts | String |  no  |  |
 | total_line_items_price_set | [TotalLineItemsPriceSet](#TotalLineItemsPriceSet) |  no  |  |
 | tags | String |  no  |  |
 | total_price_usd | String |  no  |  |
 | user_id | Int |  no  |  |
 | total_tax | String |  no  |  |
 | processing_method | String |  no  |  |
 | shipping_address | [ShippingAddress](#ShippingAddress) |  no  |  |
 | taxes_included | Boolean |  no  |  |
 | financial_status | String |  no  |  |

---


 
 
 #### [TotalDiscountsSet](#TotalDiscountsSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | presentment_money | [PresentmentMoney](#PresentmentMoney) |  no  |  |
 | shop_money | [ShopMoney](#ShopMoney) |  no  |  |

---


 
 
 #### [PresentmentMoney](#PresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [ShopMoney](#ShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [TotalPriceSet](#TotalPriceSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shop_money | [TotalPriceSetShopMoney](#TotalPriceSetShopMoney) |  no  |  |
 | presentment_money | [TotalPriceSetPresentmentMoney](#TotalPriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [TotalPriceSetShopMoney](#TotalPriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [TotalPriceSetPresentmentMoney](#TotalPriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [TotalTaxSet](#TotalTaxSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shop_money | [TotalTaxSetShopMoney](#TotalTaxSetShopMoney) |  no  |  |
 | presentment_money | [TotalTaxSetPresentmentMoney](#TotalTaxSetPresentmentMoney) |  no  |  |

---


 
 
 #### [TotalTaxSetShopMoney](#TotalTaxSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [TotalTaxSetPresentmentMoney](#TotalTaxSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [SubtotalPriceSet](#SubtotalPriceSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shop_money | [SubtotalPriceSetShopMoney](#SubtotalPriceSetShopMoney) |  no  |  |
 | presentment_money | [SubtotalPriceSetPresentmentMoney](#SubtotalPriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [SubtotalPriceSetShopMoney](#SubtotalPriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [SubtotalPriceSetPresentmentMoney](#SubtotalPriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [LineItems](#LineItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sku | String |  no  |  |
 | fulfillable_quantity | Int |  no  |  |
 | grams | Int |  no  |  |
 | total_discount | String |  no  |  |
 | article | [LineItemsArticle](#LineItemsArticle) |  no  |  |
 | title | String |  no  |  |
 | variant_inventory_management | String |  no  |  |
 | id | Int |  no  |  |
 | variant_id | Int |  no  |  |
 | variant_title | String |  no  |  |
 | product_exists | Boolean |  no  |  |
 | price | String |  no  |  |
 | admin_graphql_api_id | String |  no  |  |
 | quantity | Int |  no  |  |
 | vendor | String |  no  |  |
 | fulfillment_service | String |  no  |  |
 | taxable | Boolean |  no  |  |
 | name | String |  no  |  |
 | product_id | Int |  no  |  |
 | price_set | [PriceSet](#PriceSet) |  no  |  |
 | tax_lines | [TaxLines](#TaxLines) |  no  |  |
 | requires_shipping | Boolean |  no  |  |
 | gift_card | Boolean |  no  |  |
 | total_discount_set | [TotalDiscountSet](#TotalDiscountSet) |  no  |  |

---


 
 
 #### [LineItemsArticle](#LineItemsArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantities | [Quantities](#Quantities) |  no  |  |
 | old_article_uid | String |  no  |  |
 | total_quantity | Int |  no  |  |
 | manufacturer | [Manufacturer](#Manufacturer) |  no  |  |
 | price | [ArticlePrice](#ArticlePrice) |  no  |  |
 | track_inventory | Boolean |  no  |  |
 | company | [Company](#Company) |  no  |  |
 | is_active | Boolean |  no  |  |
 | date_meta | [FailOrderDateMeta](#FailOrderDateMeta) |  no  |  |
 | fragile | Boolean |  no  |  |
 | marketplace_identifiers | [MarketplaceIdentifiers](#MarketplaceIdentifiers) |  no  |  |
 | size | String |  no  |  |
 | is_set | Boolean |  no  |  |
 | dimension | [Dimension](#Dimension) |  no  |  |
 | weight | [Weight](#Weight) |  no  |  |
 | store | [Store](#Store) |  no  |  |
 | meta | [ArticleMeta](#ArticleMeta) |  no  |  |
 | uid | String |  no  |  |
 | brand | [ArticleBrand](#ArticleBrand) |  no  |  |
 | item_id | Int |  no  |  |
 | fynd_article_code | String |  no  |  |
 | _id | String |  no  |  |
 | identifier | [LineItemsArticleIdentifier](#LineItemsArticleIdentifier) |  no  |  |
 | seller_identifier | String |  no  |  |
 | fynd_item_code | String |  no  |  |
 | country_of_origin | String |  no  |  |

---


 
 
 #### [Quantities](#Quantities)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | not_available | [NotAvailable](#NotAvailable) |  no  |  |
 | sellable | [Sellable](#Sellable) |  no  |  |
 | order_committed | [OrderCommitted](#OrderCommitted) |  no  |  |
 | damaged | [Damaged](#Damaged) |  no  |  |

---


 
 
 #### [NotAvailable](#NotAvailable)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |
 | updated_at | String |  no  |  |

---


 
 
 #### [Sellable](#Sellable)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |
 | updated_at | String |  no  |  |

---


 
 
 #### [OrderCommitted](#OrderCommitted)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |
 | updated_at | String |  no  |  |

---


 
 
 #### [Damaged](#Damaged)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | updated_at | String |  no  |  |
 | count | Int |  no  |  |

---


 
 
 #### [Manufacturer](#Manufacturer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_default | Boolean |  no  |  |
 | address | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [ArticlePrice](#ArticlePrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marked | Int |  no  |  |
 | currency | String |  no  |  |
 | effective | Int |  no  |  |
 | transfer | Int |  no  |  |

---


 
 
 #### [Company](#Company)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | company_type | String |  no  |  |
 | business_type | String |  no  |  |
 | company_name | String |  no  |  |
 | created_on | String |  no  |  |
 | pan_no | String |  no  |  |
 | return_allowed | Boolean |  no  |  |
 | meta | String |  no  |  |
 | exchange_allowed | Boolean |  no  |  |
 | agreement_start_date | String |  no  |  |
 | exchange_within_days | Int |  no  |  |
 | payment_procesing_charge | Int |  no  |  |
 | fynd_a_fit_available | Boolean |  no  |  |
 | modified_on | String |  no  |  |
 | return_within_days | Int |  no  |  |

---


 
 
 #### [FailOrderDateMeta](#FailOrderDateMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | added_on_store | String |  no  |  |
 | inventory_updated_on | String |  no  |  |
 | created_on | String |  no  |  |
 | modified_on | String |  no  |  |

---


 
 
 #### [MarketplaceIdentifiers](#MarketplaceIdentifiers)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tatacliq_luxury | [TatacliqLuxury](#TatacliqLuxury) |  no  |  |

---


 
 
 #### [TatacliqLuxury](#TatacliqLuxury)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sku | String |  no  |  |

---


 
 
 #### [Dimension](#Dimension)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | height | Int |  no  |  |
 | width | Int |  no  |  |
 | unit | String |  no  |  |
 | length | Int |  no  |  |
 | is_default | Boolean |  no  |  |

---


 
 
 #### [Weight](#Weight)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_default | Boolean |  no  |  |
 | unit | String |  no  |  |
 | shipping | Int |  no  |  |

---


 
 
 #### [Store](#Store)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |

---


 
 
 #### [ArticleMeta](#ArticleMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | service | String |  no  |  |

---


 
 
 #### [ArticleBrand](#ArticleBrand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | id | Int |  no  |  |

---


 
 
 #### [LineItemsArticleIdentifier](#LineItemsArticleIdentifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sku_code | String |  no  |  |

---


 
 
 #### [PriceSet](#PriceSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shop_money | [PriceSetShopMoney](#PriceSetShopMoney) |  no  |  |
 | presentment_money | [PriceSetPresentmentMoney](#PriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [PriceSetShopMoney](#PriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [PriceSetPresentmentMoney](#PriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [TaxLines](#TaxLines)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | price | String |  no  |  |
 | rate | Int |  no  |  |
 | price_set | [TaxLinesPriceSet](#TaxLinesPriceSet) |  no  |  |

---


 
 
 #### [TaxLinesPriceSet](#TaxLinesPriceSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shop_money | [TaxLinesPriceSetShopMoney](#TaxLinesPriceSetShopMoney) |  no  |  |
 | presentment_money | [TaxLinesPriceSetPresentmentMoney](#TaxLinesPriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [TaxLinesPriceSetShopMoney](#TaxLinesPriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [TaxLinesPriceSetPresentmentMoney](#TaxLinesPriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency_code | String |  no  |  |
 | amount | String |  no  |  |

---


 
 
 #### [TotalDiscountSet](#TotalDiscountSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | presentment_money | [TotalDiscountSetPresentmentMoney](#TotalDiscountSetPresentmentMoney) |  no  |  |
 | shop_money | [TotalDiscountSetShopMoney](#TotalDiscountSetShopMoney) |  no  |  |

---


 
 
 #### [TotalDiscountSetPresentmentMoney](#TotalDiscountSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [TotalDiscountSetShopMoney](#TotalDiscountSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [BillingAddress](#BillingAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address1 | String |  no  |  |
 | city | String |  no  |  |
 | zip | String |  no  |  |
 | last_name | String |  no  |  |
 | address2 | String |  no  |  |
 | longitude | Double |  no  |  |
 | province_code | String |  no  |  |
 | phone | String |  no  |  |
 | company | String |  no  |  |
 | latitude | Double |  no  |  |
 | name | String |  no  |  |
 | country | String |  no  |  |
 | country_code | String |  no  |  |
 | first_name | String |  no  |  |
 | province | String |  no  |  |

---


 
 
 #### [TotalShippingPriceSet](#TotalShippingPriceSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shop_money | [TotalShippingPriceSetShopMoney](#TotalShippingPriceSetShopMoney) |  no  |  |
 | presentment_money | [TotalShippingPriceSetPresentmentMoney](#TotalShippingPriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [TotalShippingPriceSetShopMoney](#TotalShippingPriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [TotalShippingPriceSetPresentmentMoney](#TotalShippingPriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [Customer](#Customer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | created_at | String |  no  |  |
 | id | Int |  no  |  |
 | last_name | String |  no  |  |
 | state | String |  no  |  |
 | last_order_id | Int |  no  |  |
 | note | String |  no  |  |
 | verified_email | Boolean |  no  |  |
 | phone | String |  no  |  |
 | accepts_marketing | Boolean |  no  |  |
 | first_name | String |  no  |  |
 | tags | String |  no  |  |
 | last_order_name | String |  no  |  |
 | orders_count | Int |  no  |  |
 | total_spent | String |  no  |  |
 | tax_exempt | Boolean |  no  |  |
 | currency | String |  no  |  |
 | accepts_marketing_updated_at | String |  no  |  |
 | email | String |  no  |  |
 | updated_at | String |  no  |  |
 | admin_graphql_api_id | String |  no  |  |
 | default_address | [DefaultAddress](#DefaultAddress) |  no  |  |

---


 
 
 #### [DefaultAddress](#DefaultAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | last_name | String |  no  |  |
 | name | String |  no  |  |
 | province_code | String |  no  |  |
 | country_code | String |  no  |  |
 | is_default | Boolean |  no  |  |
 | id | Int |  no  |  |
 | customer_id | Int |  no  |  |
 | first_name | String |  no  |  |
 | address1 | String |  no  |  |
 | phone | String |  no  |  |
 | country_name | String |  no  |  |
 | company | String |  no  |  |
 | address2 | String |  no  |  |
 | city | String |  no  |  |
 | province | String |  no  |  |
 | country | String |  no  |  |
 | zip | String |  no  |  |

---


 
 
 #### [TotalLineItemsPriceSet](#TotalLineItemsPriceSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shop_money | [TotalLineItemsPriceSetShopMoney](#TotalLineItemsPriceSetShopMoney) |  no  |  |
 | presentment_money | [TotalLineItemsPriceSetPresentmentMoney](#TotalLineItemsPriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [TotalLineItemsPriceSetShopMoney](#TotalLineItemsPriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [TotalLineItemsPriceSetPresentmentMoney](#TotalLineItemsPriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currency_code | String |  no  |  |

---


 
 
 #### [ShippingAddress](#ShippingAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address1 | String |  no  |  |
 | zip | String |  no  |  |
 | address2 | String |  no  |  |
 | country_code | String |  no  |  |
 | country | String |  no  |  |
 | last_name | String |  no  |  |
 | latitude | Double |  no  |  |
 | province_code | String |  no  |  |
 | first_name | String |  no  |  |
 | phone | String |  no  |  |
 | province | String |  no  |  |
 | longitude | Double |  no  |  |
 | city | String |  no  |  |
 | company | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [OrderListing](#OrderListing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[OrderItems](#OrderItems)>? |  yes  |  |
 | filters | [Filters](#Filters)? |  yes  |  |
 | next_order_status | HashMap<String,Any>? |  yes  |  |
 | page | [PlatformOrderPage](#PlatformOrderPage)? |  yes  |  |
 | applied_filters | [AppliedFilters](#AppliedFilters)? |  yes  |  |

---


 
 
 #### [OrderItems](#OrderItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [PlatformOrderUserInfo](#PlatformOrderUserInfo) |  no  |  |
 | delivery_address | [PlatformDeliveryAddress](#PlatformDeliveryAddress) |  no  |  |
 | channel | [Channel](#Channel) |  no  |  |
 | id | String |  no  |  |
 | application | [PlatformApplication](#PlatformApplication) |  no  |  |
 | shipments | [PlatformShipment](#PlatformShipment) |  no  |  |
 | created_at | String |  no  |  |
 | total_shipments_in_order | Int |  no  |  |

---


 
 
 #### [PlatformOrderUserInfo](#PlatformOrderUserInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String |  no  |  |
 | first_name | String |  no  |  |
 | gender | String |  no  |  |
 | email | String |  no  |  |
 | last_name | String |  no  |  |
 | is_anonymous_user | Boolean |  no  |  |
 | uid | Int |  no  |  |
 | avis_user_id | String |  no  |  |

---


 
 
 #### [PlatformDeliveryAddress](#PlatformDeliveryAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | area | String |  no  |  |
 | state | String |  no  |  |
 | country | String |  no  |  |
 | version | String |  no  |  |
 | address1 | String |  no  |  |
 | latitude | Double |  no  |  |
 | updated_at | String |  no  |  |
 | city | String |  no  |  |
 | landmark | String |  no  |  |
 | created_at | String |  no  |  |
 | name | String |  no  |  |
 | address | String |  no  |  |
 | phone | String |  no  |  |
 | longitude | Double |  no  |  |
 | address_type | String |  no  |  |
 | email | String |  no  |  |
 | pincode | String |  no  |  |
 | address2 | String |  no  |  |
 | contact_person | String |  no  |  |
 | address_category | String |  no  |  |

---


 
 
 #### [Channel](#Channel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [PlatformApplication](#PlatformApplication)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |

---


 
 
 #### [PlatformShipment](#PlatformShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | [PlatformShipmentStatus](#PlatformShipmentStatus) |  no  |  |
 | bags | [Bags](#Bags) |  no  |  |
 | prices | [ShipmentPrices](#ShipmentPrices) |  no  |  |
 | id | String |  no  |  |
 | gst | [ShipmentGst](#ShipmentGst) |  no  |  |
 | total_shipment_bags | Int |  no  |  |

---


 
 
 #### [PlatformShipmentStatus](#PlatformShipmentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | bag_list | ArrayList<Int> |  no  |  |
 | created_at | String |  no  |  |
 | status | String |  no  |  |
 | name | String |  no  |  |
 | progress | Int |  no  |  |
 | shipment_id | String |  no  |  |
 | current_shipment_status | String |  no  |  |
 | color_code | String |  no  |  |

---


 
 
 #### [Bags](#Bags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | item | [BagItem](#BagItem) |  no  |  |
 | id | Int |  no  |  |

---


 
 
 #### [BagItem](#BagItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | size | String |  no  |  |
 | slug_key | String |  no  |  |
 | can_return | Boolean |  no  |  |
 | brand_id | Int |  no  |  |
 | l2_category | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | code | String |  no  |  |
 | can_cancel | Boolean |  no  |  |
 | attributes | [BagItemAttributes](#BagItemAttributes) |  no  |  |
 | l3_category_name | String |  no  |  |
 | l3_category | Int |  no  |  |
 | l1_category | ArrayList<String> |  no  |  |
 | image | ArrayList<String> |  no  |  |
 | brand | String |  no  |  |
 | last_updated_at | String |  no  |  |

---


 
 
 #### [BagItemAttributes](#BagItemAttributes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | item_code | String |  no  |  |
 | brand_name | String |  no  |  |
 | country_of_origin | String |  no  |  |

---


 
 
 #### [ShipmentPrices](#ShipmentPrices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | refund_amount | Double |  no  |  |
 | cashback_applied | Double |  no  |  |
 | transfer_price | Double |  no  |  |
 | coupon_value | Double |  no  |  |
 | amount_paid | Double |  no  |  |
 | delivery_charge | Double |  no  |  |
 | coupon_effective_discount | Double |  no  |  |
 | cod_charges | Double |  no  |  |
 | refund_credit | Double |  no  |  |
 | added_to_fynd_cash | Boolean |  no  |  |
 | gst_tax_percentage | Double |  no  |  |
 | price_marked | Double |  no  |  |
 | price_effective | Double |  no  |  |
 | discount | Double |  no  |  |
 | promotion_effective_discount | Double |  no  |  |
 | amount_paid_roundoff | Double |  no  |  |
 | fynd_credits | Double |  no  |  |
 | brand_calculated_amount | Double |  no  |  |
 | cashback | Double |  no  |  |
 | value_of_good | Double |  no  |  |

---


 
 
 #### [Payments](#Payments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_active | Boolean |  no  |  |
 | display_name | String |  no  |  |
 | logo | String |  no  |  |
 | source | String |  no  |  |
 | source_nickname | String |  no  |  |
 | display_priority | Int |  no  |  |
 | id | Int |  no  |  |
 | mode | String |  no  |  |
 | payment_identifier | String |  no  |  |

---


 
 
 #### [Filters](#Filters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stages | [Stages](#Stages) |  no  |  |

---


 
 
 #### [Stages](#Stages)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | value | String |  no  |  |
 | is_default | Boolean |  no  |  |
 | filters | [StagesFilters](#StagesFilters) |  no  |  |

---


 
 
 #### [StagesFilters](#StagesFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | value | String |  no  |  |
 | type | String |  no  |  |
 | options | [Options](#Options) |  no  |  |

---


 
 
 #### [Options](#Options)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [PlatformOrderPage](#PlatformOrderPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | next | String |  no  |  |
 | previous | String |  no  |  |
 | type | String |  no  |  |
 | size | Int |  no  |  |
 | current | Int |  no  |  |
 | has_next | Boolean |  no  |  |
 | item_total | [ItemTotal](#ItemTotal) |  no  |  |

---


 
 
 #### [ItemTotal](#ItemTotal)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | new | Int |  no  |  |
 | processing | Int |  no  |  |
 | returns | Int |  no  |  |
 | all | Int |  no  |  |

---


 
 
 #### [AppliedFilters](#AppliedFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stage | String |  no  |  |
 | stores | ArrayList<String> |  no  |  |
 | from_date | String |  no  |  |
 | to_date | String |  no  |  |

---


 
 
 #### [OrderDetails](#OrderDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[OrderPicklistListing](#OrderPicklistListing)>? |  yes  |  |
 | page | [PlatformOrderPage](#PlatformOrderPage)? |  yes  |  |
 | filters | [Filters](#Filters)? |  yes  |  |
 | next_order_status | HashMap<String,Any>? |  yes  |  |
 | applied_filters | [AppliedFilters](#AppliedFilters)? |  yes  |  |

---


 
 
 #### [OrderDetailsItem](#OrderDetailsItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [PlatformOrderUserInfo](#PlatformOrderUserInfo) |  no  |  |
 | delivery_address | [PlatformDeliveryAddress](#PlatformDeliveryAddress) |  no  |  |
 | channel | [Channel](#Channel) |  no  |  |
 | breakup_values | [PlatformBreakupValues](#PlatformBreakupValues) |  no  |  |
 | id | String |  no  |  |
 | application | [PlatformApplication](#PlatformApplication) |  no  |  |
 | shipments | [PlatformShipmentDetails](#PlatformShipmentDetails) |  no  |  |
 | created_at | String |  no  |  |
 | total_shipments_in_order | Int |  no  |  |
 | payments | [ItemsPayments](#ItemsPayments) |  no  |  |

---


 
 
 #### [PlatformBreakupValues](#PlatformBreakupValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | value | Double |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [ArticleAssignment](#ArticleAssignment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | strategy | String |  no  |  |
 | level | String |  no  |  |

---


 
 
 #### [PlatformShipmentDetails](#PlatformShipmentDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | [PlatformShipmentDetailsStatus](#PlatformShipmentDetailsStatus) |  no  |  |
 | bags | [BagsDetails](#BagsDetails) |  no  |  |
 | prices | [ShipmentPrices](#ShipmentPrices) |  no  |  |
 | breakup_values | [ShipmentBreakupValues](#ShipmentBreakupValues) |  no  |  |
 | id | String |  no  |  |
 | dp_details | [DpDetails](#DpDetails) |  no  |  |
 | invoice | [ShipmentInvoice](#ShipmentInvoice) |  no  |  |
 | fulfilling_store | [PlatformFulfillingStore](#PlatformFulfillingStore) |  no  |  |
 | payments | [Payments](#Payments) |  no  |  |
 | gst | [ShipmentGst](#ShipmentGst) |  no  |  |
 | company | [Company](#Company) |  no  |  |
 | brand | [PlatformShipmentDetailsBrand](#PlatformShipmentDetailsBrand) |  no  |  |
 | coupon | HashMap<String,Any> |  no  |  |
 | order_source | String |  no  |  |
 | is_not_fynd_source | Boolean |  no  |  |
 | comment | String |  no  |  |
 | promise | [Promise](#Promise) |  no  |  |
 | tracking_details | [ShipmentTrackingDetails](#ShipmentTrackingDetails) |  no  |  |
 | is_fynd_coupon | Boolean |  no  |  |
 | order_type | String |  no  |  |
 | total_shipment_bags | Int |  no  |  |
 | pod | HashMap<String,Any> |  no  |  |
 | lock_status | Boolean |  no  |  |
 | ordering_channel | String |  no  |  |

---


 
 
 #### [PlatformShipmentDetailsStatus](#PlatformShipmentDetailsStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | bag_list | ArrayList<Int> |  no  |  |
 | created_at | String |  no  |  |
 | status | String |  no  |  |
 | name | String |  no  |  |
 | progress | Int |  no  |  |
 | shipment_id | String |  no  |  |
 | current_shipment_status | String |  no  |  |
 | color_code | String |  no  |  |

---


 
 
 #### [BagsDetails](#BagsDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | financial_breakup | ArrayList<[BagFinancialBreakup](#BagFinancialBreakup)> |  no  |  |
 | status | [BagCurrStatus](#BagCurrStatus) |  no  |  |
 | item | [BagItem](#BagItem) |  no  |  |
 | article | [BagArticle](#BagArticle) |  no  |  |
 | id | Int |  no  |  |
 | prices | [BagPrices](#BagPrices) |  no  |  |
 | gst_details | [GstDetails](#GstDetails) |  no  |  |
 | breakup_values | [BagBreakupValues](#BagBreakupValues) |  no  |  |
 | update_time | Int |  no  |  |
 | current_status | [BagCurrentStatus](#BagCurrentStatus) |  no  |  |
 | bag_status | [BagStatus](#BagStatus) |  no  |  |

---


 
 
 #### [BagFinancialBreakup](#BagFinancialBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value_of_good | Double |  no  |  |
 | hsn_code | String |  no  |  |
 | price_effective | Double |  no  |  |
 | cod_charges | Double |  no  |  |
 | gst_fee | String |  no  |  |
 | fynd_credits | Double |  no  |  |
 | refund_amount | Double |  no  |  |
 | cashback_applied | Double |  no  |  |
 | transfer_price | Double |  no  |  |
 | amount_paid_roundoff | Double |  no  |  |
 | coupon_value | Double |  no  |  |
 | amount_paid | Double |  no  |  |
 | gst_tax_percentage | Double |  no  |  |
 | size | String |  no  |  |
 | total_units | Int |  no  |  |
 | discount | Double |  no  |  |
 | coupon_effective_discount | Double |  no  |  |
 | cashback | Double |  no  |  |
 | promotion_effective_discount | Double |  no  |  |
 | gst_tag | String |  no  |  |
 | delivery_charge | Double |  no  |  |
 | refund_credit | Double |  no  |  |
 | price_marked | Double |  no  |  |
 | identifiers | [Identifiers](#Identifiers) |  no  |  |
 | item_name | String |  no  |  |
 | added_to_fynd_cash | Boolean |  no  |  |
 | brand_calculated_amount | Double |  no  |  |

---


 
 
 #### [Identifiers](#Identifiers)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ean | String |  no  |  |

---


 
 
 #### [BagCurrStatus](#BagCurrStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enable_tracking | Boolean |  no  |  |
 | is_customer_return_allowed | Boolean |  no  |  |
 | is_active | Boolean |  no  |  |
 | is_returnable | Boolean |  no  |  |
 | can_be_cancelled | Boolean |  no  |  |

---


 
 
 #### [BagArticle](#BagArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifiers | [ArticleIdentifiers](#ArticleIdentifiers) |  no  |  |
 | esp_modified | Boolean |  no  |  |
 | is_set | Boolean |  no  |  |
 | size | String |  no  |  |
 | code | String |  no  |  |
 | set | [Set](#Set) |  no  |  |
 | seller_identifier | String |  no  |  |
 | return_config | [BagArticleReturnConfig](#BagArticleReturnConfig) |  no  |  |
 | _id | String |  no  |  |
 | uid | String |  no  |  |
 | child_details | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ArticleIdentifiers](#ArticleIdentifiers)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ean | String |  no  |  |

---


 
 
 #### [Set](#Set)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Int |  no  |  |
 | size_distribution | [SetSizeDistribution](#SetSizeDistribution) |  no  |  |

---


 
 
 #### [SetSizeDistribution](#SetSizeDistribution)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sizes | [Sizes](#Sizes) |  no  |  |

---


 
 
 #### [Sizes](#Sizes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | String |  no  |  |
 | pieces | Int |  no  |  |

---


 
 
 #### [BagArticleReturnConfig](#BagArticleReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | time | Int |  no  |  |
 | unit | String |  no  |  |
 | returnable | Boolean |  no  |  |

---


 
 
 #### [GstDetails](#GstDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand_calculated_amount | Double |  no  |  |
 | gst_fee | String |  no  |  |
 | gst_tag | String |  no  |  |
 | hsn_code | String |  no  |  |
 | value_of_good | Double |  no  |  |
 | gst_tax_percentage | Double |  no  |  |
 | is_default_hsn_code | Boolean |  no  |  |

---


 
 
 #### [BagBreakupValues](#BagBreakupValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | display | String |  no  |  |
 | value | Double |  no  |  |

---


 
 
 #### [BagCurrentStatus](#BagCurrentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | updated_at | String |  no  |  |
 | bag_state_mapper | [BagStateMapper](#BagStateMapper) |  no  |  |
 | status | String |  no  |  |
 | state_type | String |  no  |  |

---


 
 
 #### [BagStateMapper](#BagStateMapper)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app_state_name | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | display_name | String |  no  |  |
 | name | String |  no  |  |
 | app_display_name | String |  no  |  |

---


 
 
 #### [BagStatus](#BagStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | state_type | String |  no  |  |
 | updated_at | String |  no  |  |
 | bag_state_mapper | [BagStatusBagStateMapper](#BagStatusBagStateMapper) |  no  |  |

---


 
 
 #### [BagStatusBagStateMapper](#BagStatusBagStateMapper)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_active | Boolean |  no  |  |
 | display_name | String |  no  |  |
 | name | String |  no  |  |
 | app_display_name | String |  no  |  |
 | app_state_name | String |  no  |  |

---


 
 
 #### [BagPrices](#BagPrices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cashback | Double |  no  |  |
 | refund_credit | Double |  no  |  |
 | coupon_value | Double |  no  |  |
 | delivery_charge | Double |  no  |  |
 | fynd_credits | Double |  no  |  |
 | price_marked | Double |  no  |  |
 | cashback_applied | Double |  no  |  |
 | value_of_good | Double |  no  |  |
 | amount_paid_roundoff | Double |  no  |  |
 | amount_paid | Double |  no  |  |
 | cod_charges | Double |  no  |  |
 | price_effective | Double |  no  |  |
 | refund_amount | Double |  no  |  |
 | discount | Double |  no  |  |

---


 
 
 #### [ShipmentBreakupValues](#ShipmentBreakupValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | display | String |  no  |  |
 | value | Double |  no  |  |

---


 
 
 #### [DpDetails](#DpDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gst_tag | String |  no  |  |

---


 
 
 #### [ShipmentInvoice](#ShipmentInvoice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payment_type | String |  no  |  |
 | updated_date | String |  no  |  |
 | invoice_url | String |  no  |  |
 | label_url | String |  no  |  |
 | payment_mode | String |  no  |  |
 | amount_to_collect | Double |  no  |  |
 | rto_address | [RtoAddress](#RtoAddress) |  no  |  |

---


 
 
 #### [RtoAddress](#RtoAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | id | Int |  no  |  |
 | phone | String |  no  |  |
 | location_type | String |  no  |  |
 | store_address_json | [StoreAddressJson](#StoreAddressJson) |  no  |  |
 | code | String |  no  |  |
 | address1 | String |  no  |  |
 | city | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |
 | company_id | Int |  no  |  |
 | contact_person | String |  no  |  |
 | state | String |  no  |  |
 | store_email | String |  no  |  |
 | address2 | String |  no  |  |

---


 
 
 #### [StoreAddressJson](#StoreAddressJson)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | latitude | Double |  no  |  |
 | updated_at | String |  no  |  |
 | area | String |  no  |  |
 | state | String |  no  |  |
 | address_type | String |  no  |  |
 | city | String |  no  |  |
 | pincode | String |  no  |  |
 | address1 | String |  no  |  |
 | address2 | String |  no  |  |
 | longitude | Double |  no  |  |
 | email | String |  no  |  |
 | phone | String |  no  |  |
 | created_at | String |  no  |  |
 | contact_person | String |  no  |  |
 | address_category | String |  no  |  |
 | version | String |  no  |  |
 | landmark | String |  no  |  |

---


 
 
 #### [PlatformFulfillingStore](#PlatformFulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | packaging_material_count | Int |  no  |  |
 | location_type | String |  no  |  |
 | code | String |  no  |  |
 | city | String |  no  |  |
 | meta | [FulfillingStoreMeta](#FulfillingStoreMeta) |  no  |  |
 | name | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | address1 | String |  no  |  |
 | store_email | String |  no  |  |
 | is_archived | Boolean |  no  |  |
 | state | String |  no  |  |
 | address2 | String |  no  |  |
 | contact_person | String |  no  |  |
 | phone | String |  no  |  |
 | is_enabled_for_recon | Boolean |  no  |  |
 | fulfillment_channel | String |  no  |  |
 | created_at | String |  no  |  |
 | id | Int |  no  |  |
 | pincode | String |  no  |  |
 | brand_store_tags | ArrayList<String> |  no  |  |
 | company_id | Int |  no  |  |
 | store_address_json | [FulfillingStoreStoreAddressJson](#FulfillingStoreStoreAddressJson) |  no  |  |
 | updated_at | String |  no  |  |
 | login_username | String |  no  |  |
 | country | String |  no  |  |

---


 
 
 #### [FulfillingStoreMeta](#FulfillingStoreMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | additional_contact_details | [AdditionalContactDetails](#AdditionalContactDetails) |  no  |  |
 | documents | [Documents](#Documents) |  no  |  |
 | gst_number | String |  no  |  |
 | display_name | String |  no  |  |
 | product_return_config | [ProductReturnConfig](#ProductReturnConfig) |  no  |  |
 | allow_dp_assignment_from_fynd | Boolean |  no  |  |
 | stage | String |  no  |  |
 | timing | [Timing](#Timing) |  no  |  |

---


 
 
 #### [AdditionalContactDetails](#AdditionalContactDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | ArrayList<String> |  no  |  |

---


 
 
 #### [Documents](#Documents)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gst | [Gst](#Gst) |  no  |  |

---


 
 
 #### [Gst](#Gst)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | legal_name | String |  no  |  |
 | type | String |  no  |  |
 | value | String |  no  |  |
 | verified | Boolean |  no  |  |

---


 
 
 #### [ProductReturnConfig](#ProductReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | on_same_store | Boolean |  no  |  |

---


 
 
 #### [Timing](#Timing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | opening | [Opening](#Opening) |  no  |  |
 | weekday | String |  no  |  |
 | open | Boolean |  no  |  |
 | closing | [Closing](#Closing) |  no  |  |

---


 
 
 #### [Opening](#Opening)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | minute | Int |  no  |  |
 | hour | Int |  no  |  |

---


 
 
 #### [Closing](#Closing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hour | Int |  no  |  |
 | minute | Int |  no  |  |

---


 
 
 #### [FulfillingStoreStoreAddressJson](#FulfillingStoreStoreAddressJson)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address2 | String |  no  |  |
 | area | String |  no  |  |
 | email | String |  no  |  |
 | phone | String |  no  |  |
 | state | String |  no  |  |
 | contact_person | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |
 | version | String |  no  |  |
 | created_at | String |  no  |  |
 | address_type | String |  no  |  |
 | city | String |  no  |  |
 | address1 | String |  no  |  |
 | landmark | String |  no  |  |
 | latitude | Double |  no  |  |
 | longitude | Double |  no  |  |
 | updated_at | String |  no  |  |
 | address_category | String |  no  |  |

---


 
 
 #### [ShipmentGst](#ShipmentGst)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand_calculated_amount | Double |  no  |  |
 | value_of_good | Double |  no  |  |
 | gst_fee | Double |  no  |  |

---


 
 
 #### [PlatformShipmentDetailsBrand](#PlatformShipmentDetailsBrand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credit_note_allowed | Boolean |  no  |  |
 | brand_name | String |  no  |  |
 | modified_on | String |  no  |  |
 | id | Int |  no  |  |
 | is_virtual_invoice | Boolean |  no  |  |
 | created_on | String |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [Promise](#Promise)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | [Timestamp](#Timestamp) |  no  |  |

---


 
 
 #### [Timestamp](#Timestamp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | String |  no  |  |
 | max | String |  no  |  |

---


 
 
 #### [ShipmentTrackingDetails](#ShipmentTrackingDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | time | String |  no  |  |
 | is_passed | Boolean |  no  |  |
 | is_current | Boolean |  no  |  |

---


 
 
 #### [ItemsPayments](#ItemsPayments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display_priority | Int |  no  |  |
 | id | Int |  no  |  |
 | is_active | Boolean |  no  |  |
 | display_name | String |  no  |  |
 | logo | String |  no  |  |
 | payment_identifier | String |  no  |  |
 | source_nickname | String |  no  |  |
 | mode | String |  no  |  |
 | source | String |  no  |  |

---


 
 
 #### [PlatformOrderDetailsPage](#PlatformOrderDetailsPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | next | String |  no  |  |
 | previous | String |  no  |  |

---


 
 
 #### [UpdateOrderReprocessResponse](#UpdateOrderReprocessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |

---


 
 
 #### [PlatformOrderTrack](#PlatformOrderTrack)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | request_id | String? |  yes  |  |
 | message | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | country_code | String? |  yes  |  |
 | resend_timer | Int? |  yes  |  |
 | resend_token | String |  no  |  |

---


 
 
 #### [OrderPicklistListing](#OrderPicklistListing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [PlatformOrderUserInfo](#PlatformOrderUserInfo) |  no  |  |
 | delivery_address | [PlatformDeliveryAddress](#PlatformDeliveryAddress) |  no  |  |
 | channel | [Channel](#Channel) |  no  |  |
 | breakup_values | [PlatformBreakupValues](#PlatformBreakupValues) |  no  |  |
 | id | String |  no  |  |
 | application | [PlatformApplication](#PlatformApplication) |  no  |  |
 | shipments | [PlatformShipmentDetails](#PlatformShipmentDetails) |  no  |  |
 | created_at | String |  no  |  |
 | total_shipments_in_order | Int |  no  |  |
 | payments | [ItemsPayments](#ItemsPayments) |  no  |  |

---


 
 
 #### [GetPingResponse](#GetPingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ping | String? |  yes  |  |

---


 
 
 #### [GetShipmentAddressResponse](#GetShipmentAddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | data | [DataShipmentAddress](#DataShipmentAddress)? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [DataShipmentAddress](#DataShipmentAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | city | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |
 | phone | String |  no  |  |
 | area | String |  no  |  |
 | address | String |  no  |  |
 | landmark | String |  no  |  |
 | state | String |  no  |  |
 | address_type | String |  no  |  |
 | address_category | String |  no  |  |
 | email | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [UpdateShipmentAddressRequest](#UpdateShipmentAddressRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | address | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | state | String? |  yes  |  |
 | address_type | String? |  yes  |  |
 | country | String? |  yes  |  |
 | name | String? |  yes  |  |
 | phone | String? |  yes  |  |
 | area | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | city | String? |  yes  |  |

---


 
 
 #### [UpdateShipmentAddressResponse](#UpdateShipmentAddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [ShipmentTrackResponse](#ShipmentTrackResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bag_list | ArrayList<[ShipmentTrackResponseBagListItem](#ShipmentTrackResponseBagListItem)>? |  yes  |  |
 | message | String? |  yes  |  |
 | order_value | Int? |  yes  |  |

---


 
 
 #### [ShipmentTrackResponseBagListItem](#ShipmentTrackResponseBagListItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enable_tracking | Boolean |  no  |  |
 | price | String |  no  |  |
 | time_slot | String |  no  |  |
 | product_name | String |  no  |  |
 | can_return | Boolean |  no  |  |
 | order_date | String |  no  |  |
 | is_try_at_home | Boolean |  no  |  |
 | breakup_values | ArrayList<[ShipmentTrackResponseBagListItemBreakValues](#ShipmentTrackResponseBagListItemBreakValues)> |  no  |  |
 | statuses | ArrayList<[ShipmentTrackResponseBagListItemStatuses](#ShipmentTrackResponseBagListItemStatuses)> |  no  |  |
 | is_active | Boolean |  no  |  |
 | bag_id | String |  no  |  |
 | order_id | String |  no  |  |
 | size | String |  no  |  |
 | payment_mode_source | String |  no  |  |
 | dp_details | [ShipmentTrackResponseBagListItemDpDetails](#ShipmentTrackResponseBagListItemDpDetails) |  no  |  |
 | product_id | Int |  no  |  |
 | product_image | [ShipmentTrackResponseBagListItemsProductImage](#ShipmentTrackResponseBagListItemsProductImage) |  no  |  |
 | brand_name | String |  no  |  |
 | price_marked | String |  no  |  |
 | status | String |  no  |  |
 | can_cancel | Boolean |  no  |  |
 | payment_mode | String |  no  |  |
 | fynd_cash_msg | String |  no  |  |
 | delivery_address | String |  no  |  |

---


 
 
 #### [ShipmentTrackResponseBagListItemBreakValues](#ShipmentTrackResponseBagListItemBreakValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | display | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [ShipmentTrackResponseBagListItemStatuses](#ShipmentTrackResponseBagListItemStatuses)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | nps_rating | Int |  no  |  |
 | nps_string | String |  no  |  |
 | progress_status | ArrayList<[ShipmentTrackResponseBagListItemStatusesProgress](#ShipmentTrackResponseBagListItemStatusesProgress)> |  no  |  |
 | flow_type | String |  no  |  |
 | status_progress | Int |  no  |  |
 | is_nps_done | Boolean |  no  |  |
 | header_message | String |  no  |  |
 | is_delayed | String |  no  |  |
 | tracking_list | ArrayList<[ShipmentTrackResponseBagListItemStatusesTrack](#ShipmentTrackResponseBagListItemStatusesTrack)> |  no  |  |

---


 
 
 #### [ShipmentTrackResponseBagListItemStatusesProgress](#ShipmentTrackResponseBagListItemStatusesProgress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | type | String |  no  |  |
 | state | Boolean |  no  |  |

---


 
 
 #### [ShipmentTrackResponseBagListItemStatusesTrack](#ShipmentTrackResponseBagListItemStatusesTrack)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | time | String |  no  |  |
 | is_passed | Boolean |  no  |  |
 | is_current | Boolean |  no  |  |

---


 
 
 #### [ShipmentTrackResponseBagListItemDpDetails](#ShipmentTrackResponseBagListItemDpDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tracking_no | String |  no  |  |
 | courier | String |  no  |  |

---


 
 
 #### [ShipmentTrackResponseBagListItemsProductImage](#ShipmentTrackResponseBagListItemsProductImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspect_ratio | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [UpdateShipmentStatusResponse](#UpdateShipmentStatusResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | HashMap<String,Any>? |  yes  |  |
 | error_shipments | ArrayList<Any> |  no  |  |

---


 
 
 #### [UpdateShipmentStatusBody](#UpdateShipmentStatusBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | HashMap<String,Any>? |  yes  |  |
 | force_transition | Boolean? |  yes  |  |
 | task | Boolean? |  yes  |  |

---


 
 
 #### [ShipmentReasonsResponse](#ShipmentReasonsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | reasons | ArrayList<[ShipmentResponseReasons](#ShipmentResponseReasons)>? |  yes  |  |

---


 
 
 #### [ShipmentResponseReasons](#ShipmentResponseReasons)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reason_id | Double |  no  |  |
 | reason | String |  no  |  |

---


 
 
 #### [PlatformShipmentTrack](#PlatformShipmentTrack)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | results | [Results](#Results)? |  yes  |  |

---


 
 
 #### [Results](#Results)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | awb | String |  no  |  |
 | updated_at | String |  no  |  |
 | last_location_recieved_at | String |  no  |  |
 | reason | String |  no  |  |
 | shipment_type | String |  no  |  |
 | status | String |  no  |  |
 | updated_time | String |  no  |  |
 | account_name | String |  no  |  |

---


 
 
 #### [ShipmentUpdateRequest](#ShipmentUpdateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bags | ArrayList<String>? |  yes  |  |
 | reason | HashMap<String,Any>? |  yes  |  |
 | comments | String? |  yes  |  |
 | action | String? |  yes  |  |

---


 
 
 #### [ShipmentUpdateResponse](#ShipmentUpdateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [UpdateProcessShipmenstRequestBody](#UpdateProcessShipmenstRequestBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipment_ids | ArrayList<String>? |  yes  |  |
 | expected_status | String? |  yes  |  |

---


 
 
 #### [UpdateProcessShipmenstRequestResponse](#UpdateProcessShipmenstRequestResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [GetVoiceCallbackResponse](#GetVoiceCallbackResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [GetClickToCallResponse](#GetClickToCallResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [ApefaceApiError](#ApefaceApiError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---




 
 
 #### [SearchKeywordResult](#SearchKeywordResult)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sort_on | String? |  yes  |  |
 | query | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [CreateSearchKeyword](#CreateSearchKeyword)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | is_active | Boolean |  no  |  |
 | app_id | String |  no  |  |
 | result | [SearchKeywordResult](#SearchKeywordResult)? |  yes  |  |
 | words | ArrayList<String> |  no  |  |

---


 
 
 #### [GetSearchWordsData](#GetSearchWordsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | app_id | String |  no  |  |
 | result | HashMap<String,Any> |  no  |  |
 | words | ArrayList<String> |  no  |  |
 | uid | String |  no  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | Int |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | message | String |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [GetSearchWordsDetailResponse](#GetSearchWordsDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | [GetSearchWordsData](#GetSearchWordsData) |  no  |  |

---


 
 
 #### [DeleteResponse](#DeleteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [GetSearchWordsResponse](#GetSearchWordsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[GetSearchWordsData](#GetSearchWordsData)> |  no  |  |

---


 
 
 #### [AutocompletePageAction](#AutocompletePageAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | params | HashMap<String,Any> |  no  |  |
 | url | String |  no  |  |
 | type | String? |  yes  |  |
 | query | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [AutocompleteAction](#AutocompleteAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [AutocompletePageAction](#AutocompletePageAction) |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [Media](#Media)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [AutocompleteResult](#AutocompleteResult)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | action | [AutocompleteAction](#AutocompleteAction) |  no  |  |
 | logo | [Media](#Media) |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CreateAutocompleteKeyword](#CreateAutocompleteKeyword)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | is_active | Boolean |  no  |  |
 | app_id | String |  no  |  |
 | results | ArrayList<[AutocompleteResult](#AutocompleteResult)> |  no  |  |
 | words | ArrayList<String> |  no  |  |

---


 
 
 #### [GetAutocompleteWordsData](#GetAutocompleteWordsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | app_id | String |  no  |  |
 | results | ArrayList<HashMap<String,Any>> |  no  |  |
 | words | ArrayList<String> |  no  |  |
 | uid | String |  no  |  |

---


 
 
 #### [GetAutocompleteWordsResponse](#GetAutocompleteWordsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[GetAutocompleteWordsData](#GetAutocompleteWordsData)> |  no  |  |

---


 
 
 #### [CreateAutocompleteWordsResponse](#CreateAutocompleteWordsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | words | ArrayList<String> |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | results | ArrayList<HashMap<String,Any>> |  no  |  |
 | app_id | String |  no  |  |

---


 
 
 #### [ProductBundleItem](#ProductBundleItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allow_remove | Boolean |  no  |  |
 | max_quantity | Int? |  yes  |  |
 | product_uid | Int? |  yes  |  |
 | auto_select | Boolean |  no  |  |
 | min_quantity | Int? |  yes  |  |
 | auto_add_to_cart | Boolean |  no  |  |

---


 
 
 #### [ProductBundleRequest](#ProductBundleRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | same_store_assignment | Boolean |  no  |  |
 | choice | String? |  yes  |  |
 | created_on | String |  no  |  |
 | is_active | Boolean? |  yes  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | slug | String? |  yes  |  |
 | products | ArrayList<[ProductBundleItem](#ProductBundleItem)>? |  yes  |  |
 | modified_on | String |  no  |  |
 | created_by | HashMap<String,Any> |  no  |  |
 | page_visibility | ArrayList<String> |  no  |  |
 | modified_by | HashMap<String,Any> |  no  |  |
 | name | String? |  yes  |  |
 | logo | String |  no  |  |

---


 
 
 #### [GetProductBundleCreateResponse](#GetProductBundleCreateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | same_store_assignment | Boolean |  no  |  |
 | choice | String? |  yes  |  |
 | created_on | String |  no  |  |
 | is_active | Boolean? |  yes  |  |
 | company_id | Int |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | slug | String? |  yes  |  |
 | products | ArrayList<[ProductBundleItem](#ProductBundleItem)>? |  yes  |  |
 | modified_on | String |  no  |  |
 | id | String |  no  |  |
 | created_by | HashMap<String,Any> |  no  |  |
 | page_visibility | ArrayList<String> |  no  |  |
 | modified_by | HashMap<String,Any> |  no  |  |
 | name | String? |  yes  |  |
 | logo | String |  no  |  |

---


 
 
 #### [GetProductBundleListingResponse](#GetProductBundleListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[GetProductBundleCreateResponse](#GetProductBundleCreateResponse)> |  no  |  |

---


 
 
 #### [ProductBundleUpdateRequest](#ProductBundleUpdateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | same_store_assignment | Boolean |  no  |  |
 | choice | String? |  yes  |  |
 | is_active | Boolean? |  yes  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | slug | String? |  yes  |  |
 | products | ArrayList<[ProductBundleItem](#ProductBundleItem)>? |  yes  |  |
 | modified_on | String |  no  |  |
 | page_visibility | ArrayList<String> |  no  |  |
 | modified_by | HashMap<String,Any> |  no  |  |
 | name | String? |  yes  |  |
 | logo | String |  no  |  |

---


 
 
 #### [Size](#Size)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | display | String |  no  |  |
 | quantity | Int |  no  |  |
 | is_available | Boolean |  no  |  |

---


 
 
 #### [Price](#Price)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency | String |  no  |  |
 | min_effective | Double |  no  |  |
 | max_effective | Double |  no  |  |
 | min_marked | Double |  no  |  |
 | max_marked | Double |  no  |  |

---


 
 
 #### [LimitedProductData](#LimitedProductData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Int |  no  |  |
 | short_description | String |  no  |  |
 | item_code | String |  no  |  |
 | identifier | HashMap<String,Any> |  no  |  |
 | attributes | HashMap<String,Any> |  no  |  |
 | country_of_origin | String |  no  |  |
 | slug | String |  no  |  |
 | sizes | ArrayList<String> |  no  |  |
 | images | ArrayList<String> |  no  |  |
 | price | HashMap<String,Any> |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [GetProducts](#GetProducts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allow_remove | Boolean |  no  |  |
 | max_quantity | Int |  no  |  |
 | product_uid | Int |  no  |  |
 | auto_select | Boolean |  no  |  |
 | sizes | ArrayList<[Size](#Size)> |  no  |  |
 | min_quantity | Int |  no  |  |
 | price | [Price](#Price) |  no  |  |
 | product_details | [LimitedProductData](#LimitedProductData) |  no  |  |
 | auto_add_to_cart | Boolean |  no  |  |

---


 
 
 #### [GetProductBundleResponse](#GetProductBundleResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | same_store_assignment | Boolean |  no  |  |
 | choice | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | logo | String |  no  |  |
 | company_id | Int |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | slug | String |  no  |  |
 | page_visibility | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | products | ArrayList<[GetProducts](#GetProducts)> |  no  |  |

---


 
 
 #### [Meta](#Meta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unit | String |  no  |  |
 | headers | HashMap<String,Any> |  no  |  |
 | values | ArrayList<HashMap<String,Any>> |  no  |  |

---


 
 
 #### [Guide](#Guide)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | [Meta](#Meta) |  no  |  |

---


 
 
 #### [ValidateSizeGuide](#ValidateSizeGuide)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tag | String |  no  |  |
 | subtitle | String |  no  |  |
 | created_on | String |  no  |  |
 | description | String |  no  |  |
 | brand_id | Int |  no  |  |
 | company_id | Int |  no  |  |
 | image | String |  no  |  |
 | modified_on | String |  no  |  |
 | active | Boolean |  no  |  |
 | id | String |  no  |  |
 | created_by | HashMap<String,Any> |  no  |  |
 | guide | [Guide](#Guide) |  no  |  |
 | modified_by | HashMap<String,Any> |  no  |  |
 | name | String? |  yes  |  |
 | title | String? |  yes  |  |

---


 
 
 #### [SuccessResponse](#SuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [ListSizeGuide](#ListSizeGuide)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | HashMap<String,Any> |  no  |  |
 | items | ArrayList<HashMap<String,Any>> |  no  |  |

---


 
 
 #### [SizeGuideResponse](#SizeGuideResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tag | String |  no  |  |
 | created_on | String |  no  |  |
 | subtitle | String |  no  |  |
 | brand_id | Int |  no  |  |
 | company_id | Int |  no  |  |
 | modified_on | String |  no  |  |
 | active | Boolean |  no  |  |
 | id | String |  no  |  |
 | created_by | HashMap<String,Any> |  no  |  |
 | guide | HashMap<String,Any> |  no  |  |
 | modified_by | HashMap<String,Any> |  no  |  |
 | name | String |  no  |  |
 | title | String |  no  |  |

---


 
 
 #### [MetaDataListingFilterMetaResponse](#MetaDataListingFilterMetaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | key | String |  no  |  |
 | units | ArrayList<HashMap<String,Any>> |  no  |  |
 | filter_types | ArrayList<String> |  no  |  |

---


 
 
 #### [MetaDataListingFilterResponse](#MetaDataListingFilterResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[MetaDataListingFilterMetaResponse](#MetaDataListingFilterMetaResponse)> |  no  |  |

---


 
 
 #### [MetaDataListingSortMetaResponse](#MetaDataListingSortMetaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | key | String |  no  |  |

---


 
 
 #### [MetaDataListingSortResponse](#MetaDataListingSortResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[MetaDataListingSortMetaResponse](#MetaDataListingSortMetaResponse)> |  no  |  |

---


 
 
 #### [MetaDataListingResponse](#MetaDataListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filter | [MetaDataListingFilterResponse](#MetaDataListingFilterResponse)? |  yes  |  |
 | sort | [MetaDataListingSortResponse](#MetaDataListingSortResponse)? |  yes  |  |

---


 
 
 #### [GetCatalogConfigurationDetailsProduct](#GetCatalogConfigurationDetailsProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | variant | HashMap<String,Any> |  no  |  |
 | compare | HashMap<String,Any> |  no  |  |
 | detail | HashMap<String,Any> |  no  |  |
 | similar | HashMap<String,Any> |  no  |  |

---


 
 
 #### [GetCatalogConfigurationMetaData](#GetCatalogConfigurationMetaData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | listing | [MetaDataListingResponse](#MetaDataListingResponse) |  no  |  |
 | product | [GetCatalogConfigurationDetailsProduct](#GetCatalogConfigurationDetailsProduct) |  no  |  |

---


 
 
 #### [ConfigurationBucketPoints](#ConfigurationBucketPoints)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | end | Double |  no  |  |
 | start | Double |  no  |  |

---


 
 
 #### [ConfigurationListingFilterValue](#ConfigurationListingFilterValue)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sort | String |  no  |  |
 | value | String |  no  |  |
 | bucket_points | ArrayList<[ConfigurationBucketPoints](#ConfigurationBucketPoints)> |  no  |  |
 | condition | String |  no  |  |
 | map | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ConfigurationListingFilterConfig](#ConfigurationListingFilterConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_active | Boolean? |  yes  |  |
 | key | String? |  yes  |  |
 | value_config | [ConfigurationListingFilterValue](#ConfigurationListingFilterValue) |  no  |  |
 | name | String |  no  |  |
 | logo | String |  no  |  |
 | type | String? |  yes  |  |
 | priority | Int? |  yes  |  |

---


 
 
 #### [ConfigurationListingFilter](#ConfigurationListingFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attribute_config | ArrayList<[ConfigurationListingFilterConfig](#ConfigurationListingFilterConfig)> |  no  |  |
 | allow_single | Boolean? |  yes  |  |

---


 
 
 #### [ConfigurationListingSortConfig](#ConfigurationListingSortConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_active | Boolean? |  yes  |  |
 | key | String? |  yes  |  |
 | name | String |  no  |  |
 | logo | String |  no  |  |
 | priority | Int? |  yes  |  |

---


 
 
 #### [ConfigurationListingSort](#ConfigurationListingSort)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config | ArrayList<[ConfigurationListingSortConfig](#ConfigurationListingSortConfig)> |  no  |  |
 | default_key | String? |  yes  |  |

---


 
 
 #### [ConfigurationListing](#ConfigurationListing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filter | [ConfigurationListingFilter](#ConfigurationListingFilter)? |  yes  |  |
 | sort | [ConfigurationListingSort](#ConfigurationListingSort)? |  yes  |  |

---


 
 
 #### [ProductSize](#ProductSize)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | Int? |  yes  |  |
 | max | Int? |  yes  |  |

---


 
 
 #### [ConfigurationProductVariantConfig](#ConfigurationProductVariantConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display_type | String? |  yes  |  |
 | is_active | Boolean? |  yes  |  |
 | key | String? |  yes  |  |
 | size | [ProductSize](#ProductSize)? |  yes  |  |
 | name | String? |  yes  |  |
 | logo | String |  no  |  |
 | priority | Int? |  yes  |  |

---


 
 
 #### [ConfigurationProductVariant](#ConfigurationProductVariant)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config | ArrayList<[ConfigurationProductVariantConfig](#ConfigurationProductVariantConfig)> |  no  |  |

---


 
 
 #### [ConfigurationProductConfig](#ConfigurationProductConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subtitle | String |  no  |  |
 | is_active | Boolean? |  yes  |  |
 | key | String? |  yes  |  |
 | size | [ProductSize](#ProductSize) |  no  |  |
 | title | String |  no  |  |
 | logo | String |  no  |  |
 | priority | Int? |  yes  |  |

---


 
 
 #### [ConfigurationProductSimilar](#ConfigurationProductSimilar)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config | ArrayList<[ConfigurationProductConfig](#ConfigurationProductConfig)> |  no  |  |

---


 
 
 #### [ConfigurationProduct](#ConfigurationProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | variant | [ConfigurationProductVariant](#ConfigurationProductVariant)? |  yes  |  |
 | similar | [ConfigurationProductSimilar](#ConfigurationProductSimilar)? |  yes  |  |

---


 
 
 #### [AppConfiguration](#AppConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config_id | String |  no  |  |
 | app_id | String? |  yes  |  |
 | config_type | String? |  yes  |  |
 | listing | [ConfigurationListing](#ConfigurationListing) |  no  |  |
 | product | [ConfigurationProduct](#ConfigurationProduct) |  no  |  |

---


 
 
 #### [AppCatalogConfiguration](#AppCatalogConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config_id | String |  no  |  |
 | app_id | String? |  yes  |  |
 | id | String |  no  |  |
 | config_type | String? |  yes  |  |
 | listing | [ConfigurationListing](#ConfigurationListing) |  no  |  |
 | product | [ConfigurationProduct](#ConfigurationProduct) |  no  |  |

---


 
 
 #### [GetAppCatalogConfiguration](#GetAppCatalogConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [AppCatalogConfiguration](#AppCatalogConfiguration) |  no  |  |
 | is_default | Boolean |  no  |  |

---


 
 
 #### [GetCatalogConfigurationDetailsSchemaListing](#GetCatalogConfigurationDetailsSchemaListing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filter | HashMap<String,Any> |  no  |  |
 | sort | HashMap<String,Any> |  no  |  |

---


 
 
 #### [EntityConfiguration](#EntityConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config_id | String |  no  |  |
 | app_id | String? |  yes  |  |
 | id | String |  no  |  |
 | config_type | String? |  yes  |  |
 | listing | [GetCatalogConfigurationDetailsSchemaListing](#GetCatalogConfigurationDetailsSchemaListing) |  no  |  |
 | product | [GetCatalogConfigurationDetailsProduct](#GetCatalogConfigurationDetailsProduct) |  no  |  |

---


 
 
 #### [GetAppCatalogEntityConfiguration](#GetAppCatalogEntityConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [EntityConfiguration](#EntityConfiguration) |  no  |  |
 | is_default | Boolean |  no  |  |

---


 
 
 #### [ProductSortOn](#ProductSortOn)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | name | String |  no  |  |
 | is_selected | Boolean |  no  |  |

---


 
 
 #### [ProductFiltersKey](#ProductFiltersKey)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | name | String? |  yes  |  |
 | logo | String |  no  |  |
 | kind | String |  no  |  |

---


 
 
 #### [ProductFiltersValue](#ProductFiltersValue)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | Int |  no  |  |
 | value | String? |  yes  |  |
 | is_selected | Boolean? |  yes  |  |
 | currency_code | String |  no  |  |
 | selected_max | Int |  no  |  |
 | query_format | String |  no  |  |
 | selected_min | Int |  no  |  |
 | display_format | String |  no  |  |
 | count | Int |  no  |  |
 | display | String? |  yes  |  |
 | min | Int |  no  |  |
 | currency_symbol | String |  no  |  |

---


 
 
 #### [ProductFilters](#ProductFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | [ProductFiltersKey](#ProductFiltersKey)? |  yes  |  |
 | values | ArrayList<[ProductFiltersValue](#ProductFiltersValue)>? |  yes  |  |

---


 
 
 #### [GetCollectionQueryOptionResponse](#GetCollectionQueryOptionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sort_on | ArrayList<[ProductSortOn](#ProductSortOn)> |  no  |  |
 | filters | ArrayList<[ProductFilters](#ProductFilters)> |  no  |  |

---


 
 
 #### [SeoDetail](#SeoDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | title | String |  no  |  |

---


 
 
 #### [UserInfo](#UserInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user_id | String |  no  |  |
 | username | String |  no  |  |
 | uid | String |  no  |  |
 | email | String |  no  |  |

---


 
 
 #### [Schedule](#Schedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | end | String |  no  |  |
 | duration | Int |  no  |  |
 | cron | String |  no  |  |
 | start | String |  no  |  |

---


 
 
 #### [CollectionBadge](#CollectionBadge)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | color | String |  no  |  |

---


 
 
 #### [CollectionImage](#CollectionImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspect_ratio | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [CollectionBanner](#CollectionBanner)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | landscape | [CollectionImage](#CollectionImage)? |  yes  |  |
 | portrait | [CollectionImage](#CollectionImage)? |  yes  |  |

---


 
 
 #### [CreateCollection](#CreateCollection)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allow_sort | Boolean |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | seo | [SeoDetail](#SeoDetail) |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | app_id | String? |  yes  |  |
 | created_by | [UserInfo](#UserInfo) |  no  |  |
 | _schedule | [Schedule](#Schedule) |  no  |  |
 | name | String? |  yes  |  |
 | allow_facets | Boolean |  no  |  |
 | badge | [CollectionBadge](#CollectionBadge) |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | slug | String? |  yes  |  |
 | sort_on | String |  no  |  |
 | modified_by | [UserInfo](#UserInfo) |  no  |  |
 | logo | [CollectionImage](#CollectionImage)? |  yes  |  |
 | type | String? |  yes  |  |
 | is_active | Boolean |  no  |  |
 | description | String |  no  |  |
 | _locale_language | HashMap<String,Any> |  no  |  |
 | query | HashMap<String,Any> |  no  |  |
 | published | Boolean |  no  |  |
 | visible_facets_keys | ArrayList<String> |  no  |  |
 | banners | [CollectionBanner](#CollectionBanner)? |  yes  |  |

---


 
 
 #### [BannerImage](#BannerImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspect_ratio | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [ImageUrls](#ImageUrls)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | landscape | [BannerImage](#BannerImage) |  no  |  |
 | portrait | [BannerImage](#BannerImage) |  no  |  |

---


 
 
 #### [CollectionCreateResponse](#CollectionCreateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allow_sort | Boolean |  no  |  |
 | _schedule | HashMap<String,Any> |  no  |  |
 | tag | ArrayList<String> |  no  |  |
 | is_active | Boolean |  no  |  |
 | description | String |  no  |  |
 | badge | HashMap<String,Any> |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | app_id | String |  no  |  |
 | slug | String |  no  |  |
 | visible_facets_keys | ArrayList<String> |  no  |  |
 | cron | HashMap<String,Any> |  no  |  |
 | query | HashMap<String,Any> |  no  |  |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | name | String |  no  |  |
 | logo | [BannerImage](#BannerImage) |  no  |  |
 | type | String |  no  |  |
 | allow_facets | Boolean |  no  |  |

---


 
 
 #### [CollectionListingFilterTag](#CollectionListingFilterTag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | name | String |  no  |  |
 | is_selected | Boolean |  no  |  |

---


 
 
 #### [CollectionListingFilterType](#CollectionListingFilterType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | name | String |  no  |  |
 | is_selected | Boolean |  no  |  |

---


 
 
 #### [CollectionListingFilter](#CollectionListingFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tags | ArrayList<[CollectionListingFilterTag](#CollectionListingFilterTag)> |  no  |  |
 | type | ArrayList<[CollectionListingFilterType](#CollectionListingFilterType)> |  no  |  |

---


 
 
 #### [Media1](#Media1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |
 | type | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ProductListingActionPage](#ProductListingActionPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | query | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ProductListingAction](#ProductListingAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [ProductListingActionPage](#ProductListingActionPage) |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [GetCollectionDetailNest](#GetCollectionDetailNest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allow_sort | Boolean |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | app_id | String |  no  |  |
 | _schedule | HashMap<String,Any> |  no  |  |
 | name | String |  no  |  |
 | uid | String |  no  |  |
 | allow_facets | Boolean |  no  |  |
 | badge | HashMap<String,Any> |  no  |  |
 | slug | String |  no  |  |
 | cron | HashMap<String,Any> |  no  |  |
 | logo | [Media1](#Media1) |  no  |  |
 | type | String |  no  |  |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | is_active | Boolean |  no  |  |
 | description | String |  no  |  |
 | query | HashMap<String,Any> |  no  |  |
 | tag | ArrayList<String> |  no  |  |
 | visible_facets_keys | ArrayList<String> |  no  |  |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |

---


 
 
 #### [GetCollectionListingResponse](#GetCollectionListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | filters | [CollectionListingFilter](#CollectionListingFilter) |  no  |  |
 | items | ArrayList<[GetCollectionDetailNest](#GetCollectionDetailNest)> |  no  |  |

---


 
 
 #### [CollectionDetailResponse](#CollectionDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allow_sort | Boolean |  no  |  |
 | _schedule | HashMap<String,Any> |  no  |  |
 | tag | ArrayList<String> |  no  |  |
 | is_active | Boolean |  no  |  |
 | description | String |  no  |  |
 | badge | HashMap<String,Any> |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | app_id | String |  no  |  |
 | slug | String |  no  |  |
 | visible_facets_keys | ArrayList<String> |  no  |  |
 | cron | HashMap<String,Any> |  no  |  |
 | query | HashMap<String,Any> |  no  |  |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | name | String |  no  |  |
 | logo | [Media1](#Media1) |  no  |  |
 | type | String |  no  |  |
 | allow_facets | Boolean |  no  |  |

---


 
 
 #### [UpdateCollection](#UpdateCollection)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allow_sort | Boolean |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | seo | [SeoDetail](#SeoDetail) |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | _schedule | [Schedule](#Schedule) |  no  |  |
 | name | String |  no  |  |
 | allow_facets | Boolean |  no  |  |
 | badge | [CollectionBadge](#CollectionBadge) |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | slug | String |  no  |  |
 | sort_on | String |  no  |  |
 | modified_by | [UserInfo](#UserInfo) |  no  |  |
 | logo | [CollectionImage](#CollectionImage) |  no  |  |
 | is_active | Boolean |  no  |  |
 | description | String |  no  |  |
 | _locale_language | HashMap<String,Any> |  no  |  |
 | query | HashMap<String,Any> |  no  |  |
 | published | Boolean |  no  |  |
 | visible_facets_keys | ArrayList<String> |  no  |  |
 | banners | [CollectionBanner](#CollectionBanner) |  no  |  |

---


 
 
 #### [CollectionItemRequest](#CollectionItemRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page_no | Int? |  yes  |  |
 | page_size | Int? |  yes  |  |

---


 
 
 #### [UpdatedResponse](#UpdatedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [ProductDetailAttribute](#ProductDetailAttribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | key | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ProductDetailGroupedAttribute](#ProductDetailGroupedAttribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | details | ArrayList<[ProductDetailAttribute](#ProductDetailAttribute)> |  no  |  |

---


 
 
 #### [ProductBrand](#ProductBrand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | logo | [Media1](#Media1) |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [Price1](#Price1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency_code | String |  no  |  |
 | min | Double |  no  |  |
 | max | Double |  no  |  |
 | currency_symbol | String |  no  |  |

---


 
 
 #### [ProductListingPrice](#ProductListingPrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marked | [Price1](#Price1) |  no  |  |
 | effective | [Price1](#Price1) |  no  |  |

---


 
 
 #### [ProductListingDetail](#ProductListingDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | color | String |  no  |  |
 | highlights | ArrayList<String> |  no  |  |
 | grouped_attributes | ArrayList<[ProductDetailGroupedAttribute](#ProductDetailGroupedAttribute)> |  no  |  |
 | tryouts | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | medias | ArrayList<[Media1](#Media1)> |  no  |  |
 | uid | Int |  no  |  |
 | brand | [ProductBrand](#ProductBrand) |  no  |  |
 | similars | ArrayList<String> |  no  |  |
 | teaser_tag | HashMap<String,Any> |  no  |  |
 | image_nature | String |  no  |  |
 | promo_meta | HashMap<String,Any> |  no  |  |
 | item_code | String |  no  |  |
 | slug | String? |  yes  |  |
 | product_online_date | String |  no  |  |
 | price | [ProductListingPrice](#ProductListingPrice) |  no  |  |
 | type | String |  no  |  |
 | sellable | Boolean |  no  |  |
 | discount | String |  no  |  |
 | has_variant | Boolean |  no  |  |
 | description | String |  no  |  |
 | rating_count | Int |  no  |  |
 | rating | Double |  no  |  |
 | short_description | String |  no  |  |
 | item_type | String |  no  |  |
 | attributes | HashMap<String,Any> |  no  |  |

---


 
 
 #### [GetCollectionItemsResponse](#GetCollectionItemsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | filters | ArrayList<[ProductFilters](#ProductFilters)> |  no  |  |
 | sort_on | ArrayList<[ProductSortOn](#ProductSortOn)> |  no  |  |
 | items | ArrayList<[ProductListingDetail](#ProductListingDetail)> |  no  |  |

---


 
 
 #### [CatalogInsightItem](#CatalogInsightItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |
 | sellable_count | Int |  no  |  |
 | out_of_stock_count | Int |  no  |  |

---


 
 
 #### [CatalogInsightBrand](#CatalogInsightBrand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | available_sizes | Int |  no  |  |
 | available_articles | Int |  no  |  |
 | article_freshness | Int |  no  |  |
 | total_articles | Int |  no  |  |
 | total_sizes | Int |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [CatalogInsightResponse](#CatalogInsightResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | item | [CatalogInsightItem](#CatalogInsightItem) |  no  |  |
 | brand_distribution | [CatalogInsightBrand](#CatalogInsightBrand) |  no  |  |

---


 
 
 #### [CrossSellingData](#CrossSellingData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | products | Int |  no  |  |
 | articles | Int |  no  |  |

---


 
 
 #### [CrossSellingResponse](#CrossSellingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [CrossSellingData](#CrossSellingData) |  no  |  |
 | brand_distribution | [CatalogInsightBrand](#CatalogInsightBrand) |  no  |  |

---


 
 
 #### [OptInPostRequest](#OptInPostRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | opt_level | String? |  yes  |  |
 | store_ids | ArrayList<Int> |  no  |  |
 | brand_ids | ArrayList<Int> |  no  |  |

---


 
 
 #### [CompanyOptIn](#CompanyOptIn)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |
 | opt_level | String? |  yes  |  |
 | store_ids | ArrayList<Int>? |  yes  |  |
 | created_on | Int? |  yes  |  |
 | modified_by | HashMap<String,Any> |  no  |  |
 | company_id | Int? |  yes  |  |
 | modified_on | Int? |  yes  |  |
 | created_by | HashMap<String,Any> |  no  |  |
 | brand_ids | ArrayList<Int>? |  yes  |  |
 | platform | String? |  yes  |  |

---


 
 
 #### [GetOptInPlatform](#GetOptInPlatform)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page)? |  yes  |  |
 | items | ArrayList<[CompanyOptIn](#CompanyOptIn)>? |  yes  |  |

---


 
 
 #### [OptinCompanyDetail](#OptinCompanyDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | business_type | String |  no  |  |
 | company_type | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [CompanyBrandDetail](#CompanyBrandDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand_name | String |  no  |  |
 | company_id | Int |  no  |  |
 | total_article | Int |  no  |  |
 | brand_id | Int |  no  |  |

---


 
 
 #### [OptinCompanyBrandDetailsView](#OptinCompanyBrandDetailsView)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[CompanyBrandDetail](#CompanyBrandDetail)> |  no  |  |

---


 
 
 #### [OptinCompanyMetrics](#OptinCompanyMetrics)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | Int |  no  |  |
 | company | String |  no  |  |
 | store | Int |  no  |  |

---


 
 
 #### [StoreDetail](#StoreDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | created_on | String |  no  |  |
 | company_id | Int |  no  |  |
 | display_name | String |  no  |  |
 | store_type | String |  no  |  |
 | modified_on | String |  no  |  |
 | store_code | String |  no  |  |
 | documents | ArrayList<HashMap<String,Any>> |  no  |  |
 | additional_contacts | ArrayList<HashMap<String,Any>> |  no  |  |
 | name | String |  no  |  |
 | timing | HashMap<String,Any> |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [OptinStoreDetails](#OptinStoreDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[StoreDetail](#StoreDetail)> |  no  |  |

---


 
 
 #### [AttributeMasterDetails](#AttributeMasterDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display_type | String? |  yes  |  |

---


 
 
 #### [AttributeMasterMandatoryDetails](#AttributeMasterMandatoryDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | l3_keys | ArrayList<String> |  no  |  |

---


 
 
 #### [AttributeMasterMeta](#AttributeMasterMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enriched | Boolean |  no  |  |
 | mandatory_details | [AttributeMasterMandatoryDetails](#AttributeMasterMandatoryDetails)? |  yes  |  |

---


 
 
 #### [AttributeMasterFilter](#AttributeMasterFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | indexing | Boolean? |  yes  |  |
 | depends_on | ArrayList<String> |  no  |  |
 | priority | Int |  no  |  |

---


 
 
 #### [AttributeSchemaRange](#AttributeSchemaRange)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | Int |  no  |  |
 | max | Int |  no  |  |

---


 
 
 #### [AttributeMaster](#AttributeMaster)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allowed_values | ArrayList<String> |  no  |  |
 | mandatory | Boolean |  no  |  |
 | format | String |  no  |  |
 | range | [AttributeSchemaRange](#AttributeSchemaRange) |  no  |  |
 | type | String? |  yes  |  |
 | multi | Boolean |  no  |  |

---


 
 
 #### [GenderDetail](#GenderDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled_for_end_consumer | Boolean |  no  |  |
 | is_nested | Boolean |  no  |  |
 | departments | ArrayList<String> |  no  |  |
 | details | [AttributeMasterDetails](#AttributeMasterDetails) |  no  |  |
 | description | String |  no  |  |
 | logo | String |  no  |  |
 | meta | [AttributeMasterMeta](#AttributeMasterMeta) |  no  |  |
 | slug | String |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | filters | [AttributeMasterFilter](#AttributeMasterFilter) |  no  |  |
 | schema | [AttributeMaster](#AttributeMaster) |  no  |  |

---


 
 
 #### [ProdcutTemplateCategoriesResponse](#ProdcutTemplateCategoriesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<HashMap<String,Any>> |  no  |  |

---


 
 
 #### [PTErrorResponse](#PTErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | errors | HashMap<String,Any> |  no  |  |
 | status | Int |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | code | String |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [UserSerializer](#UserSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String |  no  |  |
 | contact | String |  no  |  |
 | user_id | String |  no  |  |

---


 
 
 #### [GetDepartment](#GetDepartment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | search | String |  no  |  |
 | created_on | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | priority_order | Int |  no  |  |
 | synonyms | ArrayList<String> |  no  |  |
 | page_size | Int |  no  |  |
 | item_type | String |  no  |  |
 | slug | String |  no  |  |
 | modified_on | String |  no  |  |
 | page_no | Int |  no  |  |
 | created_by | [UserSerializer](#UserSerializer) |  no  |  |
 | modified_by | [UserSerializer](#UserSerializer) |  no  |  |
 | name | String |  no  |  |
 | logo | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [DepartmentsResponse](#DepartmentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[GetDepartment](#GetDepartment)> |  no  |  |

---


 
 
 #### [DepartmentErrorResponse](#DepartmentErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | errors | HashMap<String,Any> |  no  |  |
 | status | Int |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | code | String |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [ProductTemplate](#ProductTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tag | String |  no  |  |
 | created_on | String |  no  |  |
 | departments | ArrayList<String> |  no  |  |
 | is_archived | Boolean |  no  |  |
 | is_active | Boolean |  no  |  |
 | is_physical | Boolean? |  yes  |  |
 | description | String |  no  |  |
 | attributes | ArrayList<String> |  no  |  |
 | slug | String? |  yes  |  |
 | categories | ArrayList<String> |  no  |  |
 | modified_on | String |  no  |  |
 | created_by | HashMap<String,Any> |  no  |  |
 | modified_by | HashMap<String,Any> |  no  |  |
 | name | String |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [TemplatesResponse](#TemplatesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | [ProductTemplate](#ProductTemplate) |  no  |  |

---


 
 
 #### [Properties](#Properties)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | no_of_boxes | HashMap<String,Any> |  no  |  |
 | highlights | HashMap<String,Any> |  no  |  |
 | media | HashMap<String,Any> |  no  |  |
 | country_of_origin | HashMap<String,Any> |  no  |  |
 | category_slug | HashMap<String,Any> |  no  |  |
 | brand_uid | HashMap<String,Any> |  no  |  |
 | name | HashMap<String,Any> |  no  |  |
 | custom_order | HashMap<String,Any> |  no  |  |
 | item_code | HashMap<String,Any> |  no  |  |
 | teaser_tag | HashMap<String,Any> |  no  |  |
 | tags | HashMap<String,Any> |  no  |  |
 | slug | HashMap<String,Any> |  no  |  |
 | variants | HashMap<String,Any> |  no  |  |
 | product_publish | HashMap<String,Any> |  no  |  |
 | multi_size | HashMap<String,Any> |  no  |  |
 | is_active | HashMap<String,Any> |  no  |  |
 | description | HashMap<String,Any> |  no  |  |
 | trader_type | HashMap<String,Any> |  no  |  |
 | return_config | HashMap<String,Any> |  no  |  |
 | short_description | HashMap<String,Any> |  no  |  |
 | currency | HashMap<String,Any> |  no  |  |
 | item_type | HashMap<String,Any> |  no  |  |
 | is_dependent | HashMap<String,Any> |  no  |  |
 | moq | HashMap<String,Any> |  no  |  |
 | product_group_tag | HashMap<String,Any> |  no  |  |
 | sizes | HashMap<String,Any> |  no  |  |
 | size_guide | HashMap<String,Any> |  no  |  |
 | command | HashMap<String,Any> |  no  |  |
 | trader | HashMap<String,Any> |  no  |  |
 | hsn_code | HashMap<String,Any> |  no  |  |

---


 
 
 #### [GlobalValidation](#GlobalValidation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | definitions | HashMap<String,Any> |  no  |  |
 | properties | [Properties](#Properties) |  no  |  |
 | required | ArrayList<String> |  no  |  |
 | title | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [TemplateValidationData](#TemplateValidationData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | template_validation | HashMap<String,Any> |  no  |  |
 | global_validation | [GlobalValidation](#GlobalValidation) |  no  |  |

---


 
 
 #### [TemplateDetails](#TemplateDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tag | String |  no  |  |
 | departments | ArrayList<String> |  no  |  |
 | is_archived | Boolean |  no  |  |
 | is_active | Boolean |  no  |  |
 | is_physical | Boolean? |  yes  |  |
 | description | String |  no  |  |
 | attributes | ArrayList<String> |  no  |  |
 | slug | String? |  yes  |  |
 | categories | ArrayList<String> |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [TemplatesValidationResponse](#TemplatesValidationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [TemplateValidationData](#TemplateValidationData) |  no  |  |
 | template_details | [TemplateDetails](#TemplateDetails) |  no  |  |

---


 
 
 #### [InventoryValidationResponse](#InventoryValidationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | HashMap<String,Any> |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [HSNData](#HSNData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country_of_origin | ArrayList<String> |  no  |  |
 | hsn_code | ArrayList<String> |  no  |  |

---


 
 
 #### [HSNCodesResponse](#HSNCodesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [HSNData](#HSNData) |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [ProductDownloadItemsData](#ProductDownloadItemsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | templates | ArrayList<String> |  no  |  |
 | brand | ArrayList<String> |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [VerifiedBy](#VerifiedBy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String |  no  |  |
 | user_id | String |  no  |  |

---


 
 
 #### [ProductDownloadsItems](#ProductDownloadsItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [ProductDownloadItemsData](#ProductDownloadItemsData) |  no  |  |
 | template_tags | HashMap<String,Any> |  no  |  |
 | url | String |  no  |  |
 | task_id | String |  no  |  |
 | status | String |  no  |  |
 | completed_on | String |  no  |  |
 | id | String |  no  |  |
 | seller_id | Double |  no  |  |
 | created_by | [VerifiedBy](#VerifiedBy) |  no  |  |
 | trigger_on | String |  no  |  |

---


 
 
 #### [ProductDownloadsResponse](#ProductDownloadsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | [ProductDownloadsItems](#ProductDownloadsItems) |  no  |  |

---


 
 
 #### [ProductConfigurationDownloads](#ProductConfigurationDownloads)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<HashMap<String,Any>> |  no  |  |
 | multivalue | Boolean |  no  |  |

---


 
 
 #### [CategoryMappingValues](#CategoryMappingValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | catalog_id | Int |  no  |  |

---


 
 
 #### [CategoryMapping](#CategoryMapping)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ajio | [CategoryMappingValues](#CategoryMappingValues) |  no  |  |
 | facebook | [CategoryMappingValues](#CategoryMappingValues) |  no  |  |
 | google | [CategoryMappingValues](#CategoryMappingValues) |  no  |  |

---


 
 
 #### [Hierarchy](#Hierarchy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | l2 | Int? |  yes  |  |
 | l1 | Int? |  yes  |  |
 | department | Int? |  yes  |  |

---


 
 
 #### [Media2](#Media2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | landscape | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | portrait | String? |  yes  |  |

---


 
 
 #### [CategoryRequestBody](#CategoryRequestBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marketplaces | [CategoryMapping](#CategoryMapping) |  no  |  |
 | level | Int? |  yes  |  |
 | hierarchy | ArrayList<[Hierarchy](#Hierarchy)> |  no  |  |
 | departments | ArrayList<Int>? |  yes  |  |
 | is_active | Boolean? |  yes  |  |
 | media | [Media2](#Media2) |  no  |  |
 | synonyms | ArrayList<String> |  no  |  |
 | slug | String |  no  |  |
 | tryouts | ArrayList<String> |  no  |  |
 | name | String? |  yes  |  |
 | priority | Int |  no  |  |

---


 
 
 #### [CategoryCreateResponse](#CategoryCreateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [Category](#Category)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marketplaces | [CategoryMapping](#CategoryMapping) |  no  |  |
 | created_on | String |  no  |  |
 | level | Int? |  yes  |  |
 | hierarchy | ArrayList<[Hierarchy](#Hierarchy)> |  no  |  |
 | departments | ArrayList<Int>? |  yes  |  |
 | is_active | Boolean? |  yes  |  |
 | media | [Media2](#Media2) |  no  |  |
 | synonyms | ArrayList<String> |  no  |  |
 | priority | Int |  no  |  |
 | slug | String |  no  |  |
 | modified_on | String |  no  |  |
 | tryouts | ArrayList<String> |  no  |  |
 | _id | String |  no  |  |
 | created_by | HashMap<String,Any> |  no  |  |
 | modified_by | HashMap<String,Any> |  no  |  |
 | name | String? |  yes  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [CategoryResponse](#CategoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[Category](#Category)> |  no  |  |

---


 
 
 #### [CategoryUpdateResponse](#CategoryUpdateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [SingleCategoryResponse](#SingleCategoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [Category](#Category) |  no  |  |

---


 
 
 #### [CustomOrder](#CustomOrder)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | manufacturing_time_unit | String |  no  |  |
 | manufacturing_time | Int |  no  |  |
 | is_custom_order | Boolean |  no  |  |

---


 
 
 #### [TeaserTag](#TeaserTag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tag | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [ProductPublish](#ProductPublish)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | product_online_date | String |  no  |  |
 | is_set | Boolean |  no  |  |

---


 
 
 #### [ReturnConfig](#ReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnable | Boolean |  no  |  |
 | time | Int |  no  |  |
 | unit | String |  no  |  |

---


 
 
 #### [OrderQuantity](#OrderQuantity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | maximum | Int |  no  |  |
 | minimum | Int |  no  |  |
 | is_set | Boolean |  no  |  |

---


 
 
 #### [Trader](#Trader)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | address | String? |  yes  |  |

---


 
 
 #### [ProductCreateUpdate](#ProductCreateUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | no_of_boxes | Int |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | highlights | ArrayList<String> |  no  |  |
 | media | ArrayList<[Media1](#Media1)> |  no  |  |
 | country_of_origin | String? |  yes  |  |
 | category_slug | String? |  yes  |  |
 | template_tag | String? |  yes  |  |
 | brand_uid | Int? |  yes  |  |
 | name | String? |  yes  |  |
 | custom_order | [CustomOrder](#CustomOrder) |  no  |  |
 | uid | Int |  no  |  |
 | departments | ArrayList<Int>? |  yes  |  |
 | item_code | String? |  yes  |  |
 | teaser_tag | [TeaserTag](#TeaserTag) |  no  |  |
 | company_id | Int? |  yes  |  |
 | is_set | Boolean |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | slug | String? |  yes  |  |
 | variants | HashMap<String,Any> |  no  |  |
 | is_image_less_product | Boolean |  no  |  |
 | product_publish | [ProductPublish](#ProductPublish) |  no  |  |
 | multi_size | Boolean |  no  |  |
 | is_active | Boolean |  no  |  |
 | description | String |  no  |  |
 | trader_type | String |  no  |  |
 | requester | String |  no  |  |
 | return_config | [ReturnConfig](#ReturnConfig) |  no  |  |
 | short_description | String |  no  |  |
 | change_request_id | String |  no  |  |
 | currency | String? |  yes  |  |
 | item_type | String? |  yes  |  |
 | is_dependent | Boolean |  no  |  |
 | moq | [OrderQuantity](#OrderQuantity) |  no  |  |
 | product_group_tag | ArrayList<String> |  no  |  |
 | size_guide | String |  no  |  |
 | trader | [Trader](#Trader) |  no  |  |
 | hsn_code | String? |  yes  |  |

---


 
 
 #### [Logo](#Logo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspect_ratio_f | Int |  no  |  |
 | aspect_ratio | String |  no  |  |
 | url | String |  no  |  |
 | secure_url | String |  no  |  |

---


 
 
 #### [Brand](#Brand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | logo | [Logo](#Logo) |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [ProductPublished](#ProductPublished)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | product_online_date | Int |  no  |  |
 | is_set | Boolean |  no  |  |

---


 
 
 #### [UserCommon](#UserCommon)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String |  no  |  |
 | company_id | Int |  no  |  |
 | user_id | String |  no  |  |

---


 
 
 #### [Attributes](#Attributes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | color | String |  no  |  |
 | pattern | String |  no  |  |
 | created_by | [UserCommon](#UserCommon) |  no  |  |
 | meta_nature | String |  no  |  |
 | created_on | String |  no  |  |
 | image_nature | String |  no  |  |
 | stage | String |  no  |  |
 | modified_on | String |  no  |  |
 | neck_type | String |  no  |  |
 | verified_by | [VerifiedBy](#VerifiedBy) |  no  |  |
 | modified_by | [UserCommon](#UserCommon) |  no  |  |
 | essential | String |  no  |  |
 | is_image_less_product | Boolean |  no  |  |
 | verified_on | String |  no  |  |
 | sleeve_length | String |  no  |  |
 | l3_mapping | ArrayList<String> |  no  |  |
 | material | String |  no  |  |
 | product_fit | String |  no  |  |
 | gender | ArrayList<String> |  no  |  |
 | primary_material | String |  no  |  |
 | primary_color | String |  no  |  |

---


 
 
 #### [Image](#Image)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspect_ratio_f | Double |  no  |  |
 | aspect_ratio | String |  no  |  |
 | url | String |  no  |  |
 | secure_url | String |  no  |  |

---


 
 
 #### [Product](#Product)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | highlights | String |  no  |  |
 | media | ArrayList<[Media1](#Media1)> |  no  |  |
 | country_of_origin | String |  no  |  |
 | category_slug | String |  no  |  |
 | id | String |  no  |  |
 | all_sizes | ArrayList<String> |  no  |  |
 | template_tag | String |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |
 | brand | [Brand](#Brand) |  no  |  |
 | departments | ArrayList<Int> |  no  |  |
 | item_code | String |  no  |  |
 | company_id | Int |  no  |  |
 | is_set | Boolean |  no  |  |
 | slug | String |  no  |  |
 | product_publish | [ProductPublished](#ProductPublished) |  no  |  |
 | multi_size | Boolean |  no  |  |
 | is_active | Boolean |  no  |  |
 | description | String |  no  |  |
 | currency | String |  no  |  |
 | item_type | String |  no  |  |
 | is_dependent | Boolean |  no  |  |
 | attributes | [Attributes](#Attributes) |  no  |  |
 | size_guide | String |  no  |  |
 | images | ArrayList<[Image](#Image)> |  no  |  |
 | sizes | ArrayList<HashMap<String,Any>> |  no  |  |
 | hsn_code | String |  no  |  |

---


 
 
 #### [ProductListingResponse](#ProductListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[Product](#Product)> |  no  |  |

---


 
 
 #### [ValidateProduct](#ValidateProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | valid | Boolean |  no  |  |

---


 
 
 #### [UserInfo1](#UserInfo1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user_id | String |  no  |  |
 | username | String |  no  |  |
 | uid | String |  no  |  |
 | email | String |  no  |  |

---


 
 
 #### [BulkJob](#BulkJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | file_path | String |  no  |  |
 | tracking_url | String |  no  |  |
 | failed | Int |  no  |  |
 | succeed | Int |  no  |  |
 | created_on | String? |  yes  |  |
 | cancelled | Int |  no  |  |
 | failed_records | ArrayList<HashMap<String,Any>> |  no  |  |
 | custom_template_tag | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | company_id | Int? |  yes  |  |
 | total | Int? |  yes  |  |
 | stage | String |  no  |  |
 | modified_on | String |  no  |  |
 | template_tag | String |  no  |  |
 | created_by | [UserInfo1](#UserInfo1) |  no  |  |
 | modified_by | [UserInfo1](#UserInfo1) |  no  |  |
 | cancelled_records | ArrayList<HashMap<String,Any>> |  no  |  |

---


 
 
 #### [UserDetail](#UserDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String |  no  |  |
 | user_id | String |  no  |  |
 | full_name | String |  no  |  |

---


 
 
 #### [ProductBulkRequest](#ProductBulkRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | file_path | String |  no  |  |
 | failed | Int |  no  |  |
 | succeed | Int |  no  |  |
 | created_on | String |  no  |  |
 | failed_records | ArrayList<String> |  no  |  |
 | cancelled | Int |  no  |  |
 | template | [ProductTemplate](#ProductTemplate) |  no  |  |
 | is_active | Boolean |  no  |  |
 | company_id | Int |  no  |  |
 | total | Int |  no  |  |
 | stage | String |  no  |  |
 | modified_on | String |  no  |  |
 | template_tag | String |  no  |  |
 | created_by | [UserDetail](#UserDetail) |  no  |  |
 | modified_by | [UserDetail](#UserDetail) |  no  |  |
 | cancelled_records | ArrayList<String> |  no  |  |

---


 
 
 #### [ProductBulkRequestList](#ProductBulkRequestList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | [ProductBulkRequest](#ProductBulkRequest) |  no  |  |

---


 
 
 #### [BulkProductRequest](#BulkProductRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | company_id | Int? |  yes  |  |
 | template_tag | String? |  yes  |  |
 | batch_id | String? |  yes  |  |

---


 
 
 #### [NestedTags](#NestedTags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tags | ArrayList<String> |  no  |  |

---


 
 
 #### [ProductTagsViewResponse](#ProductTagsViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [NestedTags](#NestedTags) |  no  |  |

---


 
 
 #### [ProductBulkAssets](#ProductBulkAssets)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | company_id | Int |  no  |  |
 | user | HashMap<String,Any>? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [Items](#Items)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | file_path | String |  no  |  |
 | tracking_url | String |  no  |  |
 | failed | Int |  no  |  |
 | succeed | Int |  no  |  |
 | created_on | String |  no  |  |
 | failed_records | ArrayList<String> |  no  |  |
 | cancelled | Int |  no  |  |
 | retry | Int |  no  |  |
 | is_active | Boolean |  no  |  |
 | total | Int |  no  |  |
 | company_id | Int |  no  |  |
 | stage | String |  no  |  |
 | modified_on | String |  no  |  |
 | id | String |  no  |  |
 | created_by | [UserCommon](#UserCommon) |  no  |  |
 | modified_by | [UserCommon](#UserCommon) |  no  |  |
 | cancelled_records | ArrayList<String> |  no  |  |

---


 
 
 #### [BulkAssetResponse](#BulkAssetResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[Items](#Items)> |  no  |  |

---


 
 
 #### [ProductSizeDeleteDataResponse](#ProductSizeDeleteDataResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | company_id | Int |  no  |  |
 | size | String |  no  |  |
 | item_id | Int |  no  |  |

---


 
 
 #### [ProductSizeDeleteResponse](#ProductSizeDeleteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [ProductSizeDeleteDataResponse](#ProductSizeDeleteDataResponse) |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [ItemQuery](#ItemQuery)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand_uid | Int |  no  |  |
 | item_code | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [GTIN](#GTIN)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | primary | Boolean |  no  |  |
 | gtin_type | String? |  yes  |  |
 | gtin_value | String? |  yes  |  |

---


 
 
 #### [SetSize](#SetSize)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | String? |  yes  |  |
 | pieces | Int? |  yes  |  |

---


 
 
 #### [SizeDistribution](#SizeDistribution)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sizes | ArrayList<[SetSize](#SetSize)>? |  yes  |  |

---


 
 
 #### [InventorySet](#InventorySet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Int |  no  |  |
 | size_distribution | [SizeDistribution](#SizeDistribution)? |  yes  |  |

---


 
 
 #### [InvSize](#InvSize)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Int? |  yes  |  |
 | store_code | String? |  yes  |  |
 | identifiers | ArrayList<[GTIN](#GTIN)>? |  yes  |  |
 | item_width | Double |  no  |  |
 | item_length | Double |  no  |  |
 | is_set | Boolean |  no  |  |
 | price_effective | Double? |  yes  |  |
 | item_weight_unit_of_measure | String |  no  |  |
 | currency | String? |  yes  |  |
 | item_height | Double |  no  |  |
 | price_transfer | Double |  no  |  |
 | item_dimensions_unit_of_measure | String |  no  |  |
 | item_weight | Double |  no  |  |
 | price | Double? |  yes  |  |
 | set | [InventorySet](#InventorySet) |  no  |  |
 | size | String? |  yes  |  |

---


 
 
 #### [InventoryRequest](#InventoryRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | item | [ItemQuery](#ItemQuery)? |  yes  |  |
 | sizes | ArrayList<[InvSize](#InvSize)>? |  yes  |  |
 | company_id | Int? |  yes  |  |

---


 
 
 #### [InventoryResponse](#InventoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Int |  no  |  |
 | identifiers | HashMap<String,Any> |  no  |  |
 | currency | String |  no  |  |
 | price_effective | Int |  no  |  |
 | seller_identifier | Int |  no  |  |
 | store | HashMap<String,Any> |  no  |  |
 | uid | String |  no  |  |
 | price_transfer | Int |  no  |  |
 | size | String |  no  |  |
 | price | Int |  no  |  |
 | inventory_updated_on | String |  no  |  |
 | sellable_quantity | Int |  no  |  |
 | item_id | Int |  no  |  |

---


 
 
 #### [InventoryDeleteData](#InventoryDeleteData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | location_id | Int |  no  |  |
 | size | String |  no  |  |
 | item_id | Int |  no  |  |

---


 
 
 #### [InventoryDelete](#InventoryDelete)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [InventoryDeleteData](#InventoryDeleteData) |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [CommonResponse](#CommonResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | String |  no  |  |

---


 
 
 #### [BulkInventoryGetItems](#BulkInventoryGetItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | file_path | String |  no  |  |
 | failed | Int |  no  |  |
 | cancelled | Int |  no  |  |
 | created_on | String |  no  |  |
 | failed_records | ArrayList<String> |  no  |  |
 | succeed | Int |  no  |  |
 | is_active | Boolean |  no  |  |
 | company_id | Int |  no  |  |
 | total | Int |  no  |  |
 | stage | String |  no  |  |
 | id | String |  no  |  |
 | modified_on | String |  no  |  |
 | created_by | HashMap<String,Any> |  no  |  |
 | modified_by | HashMap<String,Any> |  no  |  |
 | cancelled_records | ArrayList<String> |  no  |  |

---


 
 
 #### [BulkInventoryGet](#BulkInventoryGet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[BulkInventoryGetItems](#BulkInventoryGetItems)> |  no  |  |

---


 
 
 #### [Size1](#Size1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Int? |  yes  |  |
 | store_code | String? |  yes  |  |
 | identifiers | ArrayList<HashMap<String,Any>> |  no  |  |
 | item_width | Double |  no  |  |
 | item_length | Double |  no  |  |
 | is_set | Boolean |  no  |  |
 | price_effective | Double? |  yes  |  |
 | item_weight_unit_of_measure | String |  no  |  |
 | currency | String? |  yes  |  |
 | item_height | Double |  no  |  |
 | price_transfer | Double |  no  |  |
 | item_dimensions_unit_of_measure | String |  no  |  |
 | item_weight | Double |  no  |  |
 | price | Double? |  yes  |  |
 | set | [InventorySet](#InventorySet) |  no  |  |
 | seller_identifier | String? |  yes  |  |
 | size | String |  no  |  |

---


 
 
 #### [InventoryBulkRequest](#InventoryBulkRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batch_id | String? |  yes  |  |
 | sizes | ArrayList<[Size1](#Size1)>? |  yes  |  |
 | company_id | Int? |  yes  |  |
 | user | HashMap<String,Any> |  no  |  |

---


 
 
 #### [InventoryExportRequest](#InventoryExportRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | ArrayList<Int> |  no  |  |
 | type | String |  no  |  |
 | store | ArrayList<Int> |  no  |  |

---


 
 
 #### [InventoryExportJob](#InventoryExportJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | request_params | HashMap<String,Any> |  no  |  |
 | task_id | String? |  yes  |  |
 | status | String |  no  |  |
 | completed_on | String |  no  |  |
 | seller_id | Int? |  yes  |  |
 | trigger_on | String |  no  |  |

---


 
 
 #### [FilerList](#FilerList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | display | String |  no  |  |

---


 
 
 #### [InventoryConfig](#InventoryConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[FilerList](#FilerList)> |  no  |  |
 | multivalues | Boolean |  no  |  |

---


 
 
 #### [HsnUpsert](#HsnUpsert)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | threshold1 | Double? |  yes  |  |
 | hs2_code | String? |  yes  |  |
 | tax1 | Double? |  yes  |  |
 | threshold2 | Double |  no  |  |
 | company_id | Int? |  yes  |  |
 | tax_on_mrp | Boolean? |  yes  |  |
 | hsn_code | String? |  yes  |  |
 | tax2 | Double |  no  |  |
 | tax_on_esp | Boolean |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [HsnCodesObject](#HsnCodesObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | threshold1 | Double |  no  |  |
 | hs2_code | String |  no  |  |
 | tax1 | Double |  no  |  |
 | threshold2 | Double |  no  |  |
 | company_id | Int |  no  |  |
 | tax_on_mrp | Boolean |  no  |  |
 | id | String |  no  |  |
 | modified_on | String |  no  |  |
 | hsn_code | String |  no  |  |
 | tax2 | Double |  no  |  |
 | tax_on_esp | Boolean |  no  |  |

---


 
 
 #### [HsnCode](#HsnCode)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [HsnCodesObject](#HsnCodesObject) |  no  |  |

---


 
 
 #### [PageResponse](#PageResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | String |  no  |  |
 | has_previous | Boolean |  no  |  |
 | has_next | Boolean |  no  |  |
 | item_total | Int |  no  |  |
 | size | Int |  no  |  |

---


 
 
 #### [HsnCodesListingResponse](#HsnCodesListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [PageResponse](#PageResponse) |  no  |  |
 | items | ArrayList<[HsnCodesObject](#HsnCodesObject)> |  no  |  |

---


 
 
 #### [BulkHsnUpsert](#BulkHsnUpsert)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[HsnUpsert](#HsnUpsert)>? |  yes  |  |

---


 
 
 #### [BulkHsnResponse](#BulkHsnResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |

---


 
 
 #### [BrandItem](#BrandItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | discount | String |  no  |  |
 | departments | ArrayList<String> |  no  |  |
 | slug | String |  no  |  |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | name | String |  no  |  |
 | logo | [Media](#Media) |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [BrandListingResponse](#BrandListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page)? |  yes  |  |
 | items | ArrayList<[BrandItem](#BrandItem)> |  no  |  |

---


 
 
 #### [Department](#Department)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priority_order | Int |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | logo | [Media](#Media) |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [DepartmentResponse](#DepartmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Department](#Department)> |  no  |  |

---


 
 
 #### [ThirdLevelChild](#ThirdLevelChild)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | slug | String |  no  |  |
 | childs | ArrayList<HashMap<String,Any>> |  no  |  |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [SecondLevelChild](#SecondLevelChild)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | slug | String |  no  |  |
 | childs | ArrayList<[ThirdLevelChild](#ThirdLevelChild)> |  no  |  |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [Child](#Child)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | slug | String |  no  |  |
 | childs | ArrayList<[SecondLevelChild](#SecondLevelChild)> |  no  |  |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [CategoryItems](#CategoryItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | slug | String |  no  |  |
 | childs | ArrayList<[Child](#Child)> |  no  |  |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [DepartmentCategoryTree](#DepartmentCategoryTree)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | department | String |  no  |  |
 | items | ArrayList<[CategoryItems](#CategoryItems)> |  no  |  |

---


 
 
 #### [DepartmentIdentifier](#DepartmentIdentifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [CategoryListingResponse](#CategoryListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[DepartmentCategoryTree](#DepartmentCategoryTree)> |  no  |  |
 | departments | ArrayList<[DepartmentIdentifier](#DepartmentIdentifier)> |  no  |  |

---


 
 
 #### [ApplicationProductListingResponse](#ApplicationProductListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page)? |  yes  |  |
 | filters | ArrayList<[ProductFilters](#ProductFilters)> |  no  |  |
 | sort_on | ArrayList<[ProductSortOn](#ProductSortOn)> |  no  |  |
 | items | ArrayList<[ProductListingDetail](#ProductListingDetail)> |  no  |  |

---


 
 
 #### [ProductDetail](#ProductDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | color | String |  no  |  |
 | highlights | ArrayList<String> |  no  |  |
 | grouped_attributes | ArrayList<[ProductDetailGroupedAttribute](#ProductDetailGroupedAttribute)> |  no  |  |
 | tryouts | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | medias | ArrayList<[Media1](#Media1)> |  no  |  |
 | uid | Int |  no  |  |
 | brand | [ProductBrand](#ProductBrand) |  no  |  |
 | similars | ArrayList<String> |  no  |  |
 | teaser_tag | HashMap<String,Any> |  no  |  |
 | image_nature | String |  no  |  |
 | promo_meta | HashMap<String,Any> |  no  |  |
 | item_code | String |  no  |  |
 | slug | String? |  yes  |  |
 | product_online_date | String |  no  |  |
 | type | String |  no  |  |
 | has_variant | Boolean |  no  |  |
 | description | String |  no  |  |
 | rating_count | Int |  no  |  |
 | rating | Double |  no  |  |
 | short_description | String |  no  |  |
 | item_type | String |  no  |  |
 | attributes | HashMap<String,Any> |  no  |  |

---




 
 
 #### [Document](#Document)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String? |  yes  |  |
 | verified | Boolean |  no  |  |
 | url | String |  no  |  |
 | type | String? |  yes  |  |
 | legal_name | String |  no  |  |

---


 
 
 #### [GetAddressSerializer](#GetAddressSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | latitude | Double |  no  |  |
 | country_code | String |  no  |  |
 | pincode | Int |  no  |  |
 | address_type | String |  no  |  |
 | country | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | longitude | Double |  no  |  |
 | address1 | String |  no  |  |
 | landmark | String |  no  |  |
 | address2 | String |  no  |  |

---


 
 
 #### [Website](#Website)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |

---


 
 
 #### [BusinessDetails](#BusinessDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | website | [Website](#Website) |  no  |  |

---


 
 
 #### [SellerPhoneNumber](#SellerPhoneNumber)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country_code | Int? |  yes  |  |
 | number | String? |  yes  |  |

---


 
 
 #### [ContactDetails](#ContactDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)> |  no  |  |
 | emails | ArrayList<String> |  no  |  |

---


 
 
 #### [BusinessCountryInfo](#BusinessCountryInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country_code | String |  no  |  |
 | country | String |  no  |  |

---


 
 
 #### [GetCompanyProfileSerializerResponse](#GetCompanyProfileSerializerResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified_on | String |  no  |  |
 | verified_by | [UserSerializer](#UserSerializer) |  no  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | company_type | String? |  yes  |  |
 | documents | ArrayList<[Document](#Document)> |  no  |  |
 | addresses | ArrayList<[GetAddressSerializer](#GetAddressSerializer)> |  no  |  |
 | created_on | String |  no  |  |
 | created_by | [UserSerializer](#UserSerializer) |  no  |  |
 | uid | Int? |  yes  |  |
 | business_info | String |  no  |  |
 | business_type | String? |  yes  |  |
 | business_details | [BusinessDetails](#BusinessDetails) |  no  |  |
 | franchise_enabled | Boolean |  no  |  |
 | notification_emails | ArrayList<String> |  no  |  |
 | mode | String |  no  |  |
 | contact_details | [ContactDetails](#ContactDetails) |  no  |  |
 | name | String |  no  |  |
 | business_country_info | [BusinessCountryInfo](#BusinessCountryInfo) |  no  |  |
 | modified_on | String |  no  |  |
 | modified_by | [UserSerializer](#UserSerializer) |  no  |  |
 | stage | String |  no  |  |

---


 
 
 #### [CreateUpdateAddressSerializer](#CreateUpdateAddressSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | latitude | Double? |  yes  |  |
 | country_code | String |  no  |  |
 | pincode | Int? |  yes  |  |
 | address_type | String? |  yes  |  |
 | country | String? |  yes  |  |
 | city | String? |  yes  |  |
 | state | String? |  yes  |  |
 | longitude | Double? |  yes  |  |
 | address1 | String? |  yes  |  |
 | landmark | String |  no  |  |
 | address2 | String |  no  |  |

---


 
 
 #### [UpdateCompany](#UpdateCompany)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documents | ArrayList<[Document](#Document)> |  no  |  |
 | business_details | [BusinessDetails](#BusinessDetails) |  no  |  |
 | addresses | ArrayList<[CreateUpdateAddressSerializer](#CreateUpdateAddressSerializer)> |  no  |  |
 | reject_reason | String |  no  |  |
 | franchise_enabled | Boolean |  no  |  |
 | notification_emails | ArrayList<String> |  no  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | contact_details | [ContactDetails](#ContactDetails) |  no  |  |
 | company_type | String |  no  |  |
 | business_info | String |  no  |  |
 | business_type | String |  no  |  |

---


 
 
 #### [DocumentsObj](#DocumentsObj)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pending | Int |  no  |  |
 | verified | Int |  no  |  |

---


 
 
 #### [MetricsSerializer](#MetricsSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | product | [DocumentsObj](#DocumentsObj) |  no  |  |
 | store | [DocumentsObj](#DocumentsObj) |  no  |  |
 | brand | [DocumentsObj](#DocumentsObj) |  no  |  |
 | store_documents | [DocumentsObj](#DocumentsObj) |  no  |  |
 | company_documents | [DocumentsObj](#DocumentsObj) |  no  |  |
 | uid | Int |  no  |  |
 | stage | String |  no  |  |

---


 
 
 #### [BrandBannerSerializer](#BrandBannerSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | portrait | String |  no  |  |
 | landscape | String |  no  |  |

---


 
 
 #### [CreateUpdateBrandRequestSerializer](#CreateUpdateBrandRequestSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | banner | [BrandBannerSerializer](#BrandBannerSerializer) |  no  |  |
 | logo | String? |  yes  |  |
 | company_id | Int |  no  |  |
 | _locale_language | HashMap<String,Any> |  no  |  |
 | description | String |  no  |  |
 | synonyms | ArrayList<String> |  no  |  |
 | name | String? |  yes  |  |
 | brand_tier | String |  no  |  |
 | uid | Int |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |

---


 
 
 #### [UserSerializer1](#UserSerializer1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user_id | String |  no  |  |
 | contact | String |  no  |  |
 | username | String |  no  |  |

---


 
 
 #### [GetBrandResponseSerializer](#GetBrandResponseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | banner | [BrandBannerSerializer](#BrandBannerSerializer) |  no  |  |
 | logo | String |  no  |  |
 | reject_reason | String |  no  |  |
 | created_on | String |  no  |  |
 | slug_key | String |  no  |  |
 | _locale_language | HashMap<String,Any> |  no  |  |
 | verified_on | String |  no  |  |
 | verified_by | [UserSerializer1](#UserSerializer1) |  no  |  |
 | modified_on | String |  no  |  |
 | modified_by | [UserSerializer1](#UserSerializer1) |  no  |  |
 | synonyms | ArrayList<String> |  no  |  |
 | name | String? |  yes  |  |
 | description | String |  no  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | created_by | [UserSerializer1](#UserSerializer1) |  no  |  |
 | uid | Int |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | stage | String |  no  |  |

---


 
 
 #### [GetCompanySerializer](#GetCompanySerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addresses | ArrayList<[GetAddressSerializer](#GetAddressSerializer)> |  no  |  |
 | reject_reason | String |  no  |  |
 | created_on | String |  no  |  |
 | verified_on | String |  no  |  |
 | verified_by | [UserSerializer](#UserSerializer) |  no  |  |
 | modified_on | String |  no  |  |
 | modified_by | [UserSerializer](#UserSerializer) |  no  |  |
 | name | String |  no  |  |
 | company_type | String |  no  |  |
 | created_by | [UserSerializer](#UserSerializer) |  no  |  |
 | uid | Int |  no  |  |
 | stage | String |  no  |  |
 | business_type | String |  no  |  |

---


 
 
 #### [CompanyBrandSerializer](#CompanyBrandSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reject_reason | String |  no  |  |
 | created_on | String |  no  |  |
 | verified_on | String |  no  |  |
 | verified_by | [UserSerializer1](#UserSerializer1) |  no  |  |
 | modified_on | String |  no  |  |
 | modified_by | [UserSerializer1](#UserSerializer1) |  no  |  |
 | brand | [GetBrandResponseSerializer](#GetBrandResponseSerializer) |  no  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | created_by | [UserSerializer1](#UserSerializer1) |  no  |  |
 | uid | Int |  no  |  |
 | company | [GetCompanySerializer](#GetCompanySerializer) |  no  |  |
 | stage | String |  no  |  |

---


 
 
 #### [CompanyBrandListSerializer](#CompanyBrandListSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CompanyBrandSerializer](#CompanyBrandSerializer)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [CompanyBrandPostRequestSerializer](#CompanyBrandPostRequestSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brands | ArrayList<Int>? |  yes  |  |
 | uid | Int |  no  |  |
 | company | Int? |  yes  |  |

---


 
 
 #### [ProductReturnConfigSerializer](#ProductReturnConfigSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | on_same_store | Boolean |  no  |  |
 | store_uid | Int |  no  |  |

---


 
 
 #### [LocationIntegrationType](#LocationIntegrationType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | String |  no  |  |
 | inventory | String |  no  |  |

---


 
 
 #### [InvoiceCredSerializer](#InvoiceCredSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | password | String |  no  |  |
 | enabled | Boolean |  no  |  |
 | username | String |  no  |  |

---


 
 
 #### [InvoiceDetailsSerializer](#InvoiceDetailsSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | e_invoice | [InvoiceCredSerializer](#InvoiceCredSerializer) |  no  |  |
 | e_waybill | [InvoiceCredSerializer](#InvoiceCredSerializer) |  no  |  |

---


 
 
 #### [LocationTimingSerializer](#LocationTimingSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | minute | Int |  no  |  |
 | hour | Int |  no  |  |

---


 
 
 #### [LocationDayWiseSerializer](#LocationDayWiseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | closing | [LocationTimingSerializer](#LocationTimingSerializer) |  no  |  |
 | opening | [LocationTimingSerializer](#LocationTimingSerializer) |  no  |  |
 | open | Boolean? |  yes  |  |
 | weekday | String? |  yes  |  |

---


 
 
 #### [LocationManagerSerializer](#LocationManagerSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile_no | [SellerPhoneNumber](#SellerPhoneNumber)? |  yes  |  |
 | email | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [GetLocationSerializer](#GetLocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | product_return_config | [ProductReturnConfigSerializer](#ProductReturnConfigSerializer) |  no  |  |
 | verified_on | String |  no  |  |
 | verified_by | [UserSerializer1](#UserSerializer1) |  no  |  |
 | integration_type | [LocationIntegrationType](#LocationIntegrationType) |  no  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | documents | ArrayList<[Document](#Document)> |  no  |  |
 | created_on | String |  no  |  |
 | gst_credentials | [InvoiceDetailsSerializer](#InvoiceDetailsSerializer) |  no  |  |
 | created_by | [UserSerializer1](#UserSerializer1) |  no  |  |
 | address | [GetAddressSerializer](#GetAddressSerializer)? |  yes  |  |
 | uid | Int |  no  |  |
 | company | [GetCompanySerializer](#GetCompanySerializer) |  no  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | code | String? |  yes  |  |
 | store_type | String |  no  |  |
 | contact_numbers | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)> |  no  |  |
 | notification_emails | ArrayList<String> |  no  |  |
 | name | String? |  yes  |  |
 | timing | ArrayList<[LocationDayWiseSerializer](#LocationDayWiseSerializer)> |  no  |  |
 | manager | [LocationManagerSerializer](#LocationManagerSerializer) |  no  |  |
 | display_name | String? |  yes  |  |
 | modified_on | String |  no  |  |
 | phone_number | String? |  yes  |  |
 | modified_by | [UserSerializer1](#UserSerializer1) |  no  |  |
 | stage | String |  no  |  |

---


 
 
 #### [LocationListSerializer](#LocationListSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetLocationSerializer](#GetLocationSerializer)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [GetAddressSerializer1](#GetAddressSerializer1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | latitude | Double |  no  |  |
 | country_code | String |  no  |  |
 | pincode | Int |  no  |  |
 | address_type | String |  no  |  |
 | country | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | longitude | Double |  no  |  |
 | address1 | String |  no  |  |
 | landmark | String |  no  |  |
 | address2 | String |  no  |  |

---


 
 
 #### [LocationSerializer](#LocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documents | ArrayList<[Document](#Document)> |  no  |  |
 | product_return_config | [ProductReturnConfigSerializer](#ProductReturnConfigSerializer) |  no  |  |
 | store_type | String |  no  |  |
 | contact_numbers | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)> |  no  |  |
 | manager | [LocationManagerSerializer](#LocationManagerSerializer) |  no  |  |
 | timing | ArrayList<[LocationDayWiseSerializer](#LocationDayWiseSerializer)> |  no  |  |
 | display_name | String? |  yes  |  |
 | gst_credentials | [InvoiceDetailsSerializer](#InvoiceDetailsSerializer) |  no  |  |
 | notification_emails | ArrayList<String> |  no  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | name | String? |  yes  |  |
 | address | [GetAddressSerializer1](#GetAddressSerializer1)? |  yes  |  |
 | uid | Int |  no  |  |
 | company | Int? |  yes  |  |
 | _custom_json | HashMap<String,Any> |  no  |  |
 | stage | String |  no  |  |
 | code | String? |  yes  |  |

---


 
 
 #### [BulkLocationSerializer](#BulkLocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[LocationSerializer](#LocationSerializer)> |  no  |  |

---




 
 
 #### [FailedResponse](#FailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [CDN](#CDN)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |

---


 
 
 #### [Upload](#Upload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | expiry | Int? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [StartResponse](#StartResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | file_name | String? |  yes  |  |
 | file_path | String? |  yes  |  |
 | content_type | String? |  yes  |  |
 | method | String? |  yes  |  |
 | namespace | String? |  yes  |  |
 | operation | String? |  yes  |  |
 | size | Int? |  yes  |  |
 | upload | [Upload](#Upload)? |  yes  |  |
 | cdn | [CDN](#CDN)? |  yes  |  |
 | tags | ArrayList<String> |  no  |  |

---


 
 
 #### [StartRequest](#StartRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | file_name | String? |  yes  |  |
 | content_type | String? |  yes  |  |
 | size | Int? |  yes  |  |
 | tags | ArrayList<String> |  no  |  |
 | params | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CompleteResponse](#CompleteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String? |  yes  |  |
 | file_name | String? |  yes  |  |
 | file_path | String? |  yes  |  |
 | content_type | String? |  yes  |  |
 | method | String? |  yes  |  |
 | namespace | String? |  yes  |  |
 | operation | String? |  yes  |  |
 | size | Int? |  yes  |  |
 | upload | [Upload](#Upload)? |  yes  |  |
 | cdn | [CDN](#CDN)? |  yes  |  |
 | success | String? |  yes  |  |
 | tags | ArrayList<String> |  no  |  |
 | created_on | String? |  yes  |  |
 | modified_on | String? |  yes  |  |

---


 
 
 #### [Opts](#Opts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attempts | Int |  no  |  |
 | timestamp | Int |  no  |  |
 | delay | Int |  no  |  |

---


 
 
 #### [CopyFileTask](#CopyFileTask)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | data | [BulkRequest](#BulkRequest)? |  yes  |  |
 | opts | [Opts](#Opts)? |  yes  |  |
 | progress | Int? |  yes  |  |
 | delay | Int? |  yes  |  |
 | timestamp | Int? |  yes  |  |
 | attempts_made | Int? |  yes  |  |
 | stacktrace | ArrayList<String> |  no  |  |
 | finished_on | Int? |  yes  |  |
 | processed_on | Int? |  yes  |  |

---


 
 
 #### [BulkResponse](#BulkResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tracking_url | String? |  yes  |  |
 | task | [CopyFileTask](#CopyFileTask)? |  yes  |  |

---


 
 
 #### [ReqConfiguration](#ReqConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | concurrency | Int |  no  |  |

---


 
 
 #### [Destination](#Destination)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | namespace | String? |  yes  |  |
 | rewrite | String? |  yes  |  |
 | basepath | String |  no  |  |

---


 
 
 #### [BulkRequest](#BulkRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | urls | ArrayList<String>? |  yes  |  |
 | destination | [Destination](#Destination)? |  yes  |  |
 | configuration | [ReqConfiguration](#ReqConfiguration) |  no  |  |

---


 
 
 #### [Urls](#Urls)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |
 | signed_url | String? |  yes  |  |
 | expiry | Int? |  yes  |  |

---


 
 
 #### [SignUrlResponse](#SignUrlResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | urls | ArrayList<[Urls](#Urls)>? |  yes  |  |

---


 
 
 #### [SignUrlRequest](#SignUrlRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | expiry | Int? |  yes  |  |
 | urls | ArrayList<String>? |  yes  |  |

---


 
 
 #### [DbRecord](#DbRecord)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | _id | String? |  yes  |  |
 | file_name | String? |  yes  |  |
 | operation | String |  no  |  |
 | namespace | String? |  yes  |  |
 | content_type | String? |  yes  |  |
 | file_path | String? |  yes  |  |
 | upload | [Upload](#Upload)? |  yes  |  |
 | cdn | [CDN](#CDN)? |  yes  |  |
 | created_on | String? |  yes  |  |
 | modified_on | String? |  yes  |  |

---


 
 
 #### [BrowseResponse](#BrowseResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[DbRecord](#DbRecord)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---




 
 
 #### [RedirectDevice](#RedirectDevice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | link | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [WebRedirect](#WebRedirect)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | link | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [Redirects](#Redirects)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ios | [RedirectDevice](#RedirectDevice) |  no  |  |
 | android | [RedirectDevice](#RedirectDevice) |  no  |  |
 | web | [WebRedirect](#WebRedirect) |  no  |  |
 | force_web | Boolean |  no  |  |

---


 
 
 #### [CampaignShortLink](#CampaignShortLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | source | String |  no  |  |
 | medium | String |  no  |  |

---


 
 
 #### [Attribution](#Attribution)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | campaign_cookie_expiry | String |  no  |  |

---


 
 
 #### [SocialMediaTags](#SocialMediaTags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | description | String |  no  |  |
 | image | String |  no  |  |

---


 
 
 #### [ShortLinkReq](#ShortLinkReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  | Give a name to the link. |
 | url | String? |  yes  | The web address to shorten. |
 | hash | String |  no  |  |
 | active | Boolean |  no  |  |
 | expire_at | String |  no  |  |
 | enable_tracking | Boolean |  no  |  |
 | personalized | Boolean |  no  | To create personalized short links. |
 | campaign | [CampaignShortLink](#CampaignShortLink) |  no  |  |
 | redirects | [Redirects](#Redirects) |  no  |  |
 | attribution | [Attribution](#Attribution) |  no  |  |
 | social_media_tags | [SocialMediaTags](#SocialMediaTags) |  no  |  |
 | count | Int |  no  |  |

---


 
 
 #### [UrlInfo](#UrlInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | original | String |  no  |  |
 | short | String |  no  |  |
 | hash | String |  no  |  |

---


 
 
 #### [ShortLinkRes](#ShortLinkRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | url | [UrlInfo](#UrlInfo) |  no  |  |
 | created_by | String |  no  |  |
 | app_redirect | Boolean |  no  |  |
 | fallback | String |  no  |  |
 | active | Boolean |  no  |  |
 | _id | String |  no  |  |
 | enable_tracking | Boolean |  no  |  |
 | expire_at | String |  no  |  |
 | application | String |  no  |  |
 | user_id | String |  no  |  |
 | created_at | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | updated_at | String |  no  |  |
 | personalized | Boolean |  no  | To create personalized short links |
 | campaign | [CampaignShortLink](#CampaignShortLink) |  no  |  |
 | redirects | [Redirects](#Redirects) |  no  |  |
 | attribution | [Attribution](#Attribution) |  no  |  |
 | social_media_tags | [SocialMediaTags](#SocialMediaTags) |  no  |  |
 | count | Int |  no  |  |

---


 
 
 #### [ShortLinkList](#ShortLinkList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ShortLinkRes](#ShortLinkRes)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [ErrorRes](#ErrorRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---




 
 
 #### [DataTresholdDTO](#DataTresholdDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min_price | Double |  no  |  |
 | safe_stock | Int |  no  |  |
 | period_threshold | Int |  no  |  |
 | period_threshold_type | String |  no  |  |
 | period_type_list | ArrayList<[GenericDTO](#GenericDTO)> |  no  |  |

---


 
 
 #### [GenericDTO](#GenericDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | value | HashMap<String,Any> |  no  |  |

---


 
 
 #### [JobConfigDTO](#JobConfigDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | integration | String? |  yes  |  |
 | integration_data | HashMap<String,HashMap<String,Any>> |  no  |  |
 | company_name | String |  no  |  |
 | company_id | Int? |  yes  |  |
 | task_details | [TaskDTO](#TaskDTO) |  no  |  |
 | threshold_details | [DataTresholdDTO](#DataTresholdDTO) |  no  |  |
 | job_code | String |  no  |  |
 | alias | String |  no  |  |

---


 
 
 #### [TaskDTO](#TaskDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | Int |  no  |  |
 | group_list | ArrayList<[GenericDTO](#GenericDTO)> |  no  |  |

---


 
 
 #### [ResponseEnvelopeString](#ResponseEnvelopeString)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String |  no  |  |
 | status | Int |  no  |  |
 | error | String |  no  |  |
 | exception | String |  no  |  |
 | message | String |  no  |  |
 | total_time_taken_in_millis | Int |  no  |  |
 | http_status | String |  no  |  |
 | items | String |  no  |  |
 | payload | String |  no  |  |
 | trace_id | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [AWSS3config](#AWSS3config)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bucket | String |  no  |  |
 | region | String |  no  |  |
 | dir | String |  no  |  |
 | access_key | String |  no  |  |
 | secret_key | String |  no  |  |
 | local_file_path | String |  no  |  |
 | archive_path | String |  no  |  |
 | archive | Boolean |  no  |  |
 | delete | Boolean |  no  |  |
 | unzip | Boolean |  no  |  |
 | zip_format | String |  no  |  |
 | file_regex | String |  no  |  |
 | archive_config | [ArchiveConfig](#ArchiveConfig) |  no  |  |

---


 
 
 #### [ArchiveConfig](#ArchiveConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | delete | Boolean |  no  |  |
 | archive | Boolean |  no  |  |
 | archive_dir | String |  no  |  |

---


 
 
 #### [Audit](#Audit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | created_by | String |  no  |  |
 | modified_by | String |  no  |  |
 | created_on | String |  no  |  |
 | modified_on | String |  no  |  |

---


 
 
 #### [CatalogMasterConfig](#CatalogMasterConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | source_slug | String |  no  |  |

---


 
 
 #### [CompanyConfig](#CompanyConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | company_id | Int |  no  |  |
 | exclude_steps | ArrayList<Int> |  no  |  |
 | hidden_closet_keys | ArrayList<String> |  no  |  |
 | open_tags | HashMap<String,HashMap<String,Any>> |  no  |  |
 | tax_identifiers | ArrayList<String> |  no  |  |
 | delete_quantity_threshold | Int |  no  |  |

---


 
 
 #### [DBConfig](#DBConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | vendor | String |  no  |  |
 | host | String |  no  |  |
 | port | Int |  no  |  |
 | username | String |  no  |  |
 | password | String |  no  |  |
 | dbname | String |  no  |  |
 | query | String |  no  |  |
 | procedure | Boolean |  no  |  |
 | driver_class | String |  no  |  |
 | jdbc_url | String |  no  |  |
 | optional_properties | HashMap<String,String> |  no  |  |

---


 
 
 #### [DBConnectionProfile](#DBConnectionProfile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | inventory | String |  no  |  |

---


 
 
 #### [DBParamConfig](#DBParamConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | params | HashMap<String,HashMap<String,Any>> |  no  |  |

---


 
 
 #### [DefaultHeadersDTO](#DefaultHeadersDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | store | [PropBeanDTO](#PropBeanDTO) |  no  |  |
 | intf_article_id | [PropBeanDTO](#PropBeanDTO) |  no  |  |
 | price_effective | [PropBeanDTO](#PropBeanDTO) |  no  |  |
 | quantity | [PropBeanDTO](#PropBeanDTO) |  no  |  |

---


 
 
 #### [DocMappingConfig](#DocMappingConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | properties | HashMap<String,HashMap<String,Any>> |  no  |  |
 | junk_data_threshold_count | Int |  no  |  |
 | prop_bean_configs | ArrayList<[PropBeanConfig](#PropBeanConfig)> |  no  |  |
 | unwind_field | String |  no  |  |
 | default_headers | [DefaultHeadersDTO](#DefaultHeadersDTO) |  no  |  |

---


 
 
 #### [EmailConfig](#EmailConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recepient | String |  no  |  |
 | host | String |  no  |  |
 | username | String |  no  |  |
 | password | String |  no  |  |
 | unzip | Boolean |  no  |  |
 | read_from_content | Boolean |  no  |  |
 | filter_based_on_recepients | Boolean |  no  |  |
 | pcol | String |  no  |  |
 | subject_line_regex | String |  no  |  |
 | sender_address | String |  no  |  |
 | local_dir | String |  no  |  |
 | folder_name_hierarchies | ArrayList<String> |  no  |  |
 | attachment_regex | String |  no  |  |
 | body_content_regex | String |  no  |  |
 | password_protected | Boolean |  no  |  |
 | zip_format | String |  no  |  |
 | attachment_mandate | Boolean |  no  |  |
 | filter_files_after_extraction | Boolean |  no  |  |
 | archive_config | [ArchiveConfig](#ArchiveConfig) |  no  |  |
 | read_all_unread_mails | Boolean |  no  |  |
 | content_type | String |  no  |  |
 | downloadable_link | Boolean |  no  |  |
 | properties | HashMap<String,String> |  no  |  |

---


 
 
 #### [FTPConfig](#FTPConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | host | String |  no  |  |
 | port | Int |  no  |  |
 | username | String |  no  |  |
 | password | String |  no  |  |
 | unzip | Boolean |  no  |  |
 | retries | Int |  no  |  |
 | interval | Int |  no  |  |
 | local_dir | String |  no  |  |
 | remote_dir | String |  no  |  |
 | zip_file_regex | String |  no  |  |
 | archive_config | [ArchiveConfig](#ArchiveConfig) |  no  |  |
 | file_regex | String |  no  |  |
 | zip_format | String |  no  |  |
 | read_all_files | Boolean |  no  |  |

---


 
 
 #### [FileConfig](#FileConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | delimiter | String |  no  |  |
 | charset | String |  no  |  |
 | properties | HashMap<String,HashMap<String,Any>> |  no  |  |
 | file_has_header | Boolean |  no  |  |
 | header_index | Int |  no  |  |
 | header_array | ArrayList<String> |  no  |  |
 | data_start_index | Int |  no  |  |
 | prop_bean_configs | ArrayList<[PropBeanConfig](#PropBeanConfig)> |  no  |  |
 | junk_data_threshold_count | Int |  no  |  |
 | file_type | String |  no  |  |
 | line_validity_check | Boolean |  no  |  |
 | sheet_names | ArrayList<String> |  no  |  |
 | read_all_sheets | Boolean |  no  |  |
 | quote_char | String |  no  |  |
 | escape_char | String |  no  |  |
 | default_headers | [DefaultHeadersDTO](#DefaultHeadersDTO) |  no  |  |

---


 
 
 #### [GoogleSpreadSheetConfig](#GoogleSpreadSheetConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | range | String |  no  |  |
 | sheet_id | String |  no  |  |
 | client_secret_location | String |  no  |  |
 | cred_storage_directory | String |  no  |  |
 | local_dir | String |  no  |  |
 | archive_config | [ArchiveConfig](#ArchiveConfig) |  no  |  |

---


 
 
 #### [HttpConfig](#HttpConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hosturl | String |  no  |  |
 | username | String |  no  |  |
 | password | String |  no  |  |
 | request_params | HashMap<String,String> |  no  |  |
 | http_method | String |  no  |  |
 | request_payload | String |  no  |  |
 | local_path | String |  no  |  |
 | archive_config | [ArchiveConfig](#ArchiveConfig) |  no  |  |

---


 
 
 #### [JobConfig](#JobConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | Int |  no  |  |
 | job_code | String |  no  |  |
 | task_type | String |  no  |  |
 | sync_delay | Int |  no  |  |
 | cron_expression | String |  no  |  |
 | store_filter | [StoreFilter](#StoreFilter) |  no  |  |
 | process_config | [ProcessConfig](#ProcessConfig) |  no  |  |
 | store_config | ArrayList<[StoreConfig](#StoreConfig)> |  no  |  |
 | properties | HashMap<String,String> |  no  |  |
 | immediate_first_run | Boolean |  no  |  |
 | disable | Boolean |  no  |  |
 | dependent_job_codes | ArrayList<String> |  no  |  |
 | company_config | ArrayList<[CompanyConfig](#CompanyConfig)> |  no  |  |
 | company_ids | ArrayList<Int> |  no  |  |
 | tax_identifiers | ArrayList<String> |  no  |  |
 | priority | String |  no  |  |
 | period_threshold | Int |  no  |  |
 | period_threshold_type | String |  no  |  |
 | db_connection_profile | [DBConnectionProfile](#DBConnectionProfile) |  no  |  |
 | params | HashMap<String,HashMap<String,Any>> |  no  |  |
 | open_tags | HashMap<String,HashMap<String,Any>> |  no  |  |
 | delete_quantity_threshold | Int |  no  |  |
 | catalog_master_config | [CatalogMasterConfig](#CatalogMasterConfig) |  no  |  |
 | aggregator_types | ArrayList<String> |  no  |  |
 | integration_type | String |  no  |  |
 | min_price | Double |  no  |  |
 | audit | [Audit](#Audit) |  no  |  |
 | version | Int |  no  |  |
 | alias | String |  no  |  |

---


 
 
 #### [JobConfigRawDTO](#JobConfigRawDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | integration | String? |  yes  |  |
 | company_name | String? |  yes  |  |
 | company_id | Int? |  yes  |  |
 | data | [JobConfig](#JobConfig) |  no  |  |

---


 
 
 #### [JsonDocConfig](#JsonDocConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | prop_bean_configs | ArrayList<[PropBeanConfig](#PropBeanConfig)> |  no  |  |

---


 
 
 #### [LocalFileConfig](#LocalFileConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | retries | Int |  no  |  |
 | interval | Int |  no  |  |
 | local_dir | String |  no  |  |
 | working_dir | String |  no  |  |
 | unzip | Boolean |  no  |  |
 | zip_file_regex | String |  no  |  |
 | file_regex | String |  no  |  |
 | zip_format | String |  no  |  |
 | archive_config | [ArchiveConfig](#ArchiveConfig) |  no  |  |
 | read_all_files | Boolean |  no  |  |

---


 
 
 #### [MongoDocConfig](#MongoDocConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | collection_name | String |  no  |  |
 | find_query | HashMap<String,HashMap<String,Any>> |  no  |  |
 | projection_query | HashMap<String,HashMap<String,Any>> |  no  |  |
 | prop_bean_configs | ArrayList<[PropBeanConfig](#PropBeanConfig)> |  no  |  |
 | aggregate_pipeline | ArrayList<HashMap<String,HashMap<String,Any>>> |  no  |  |
 | skip_save | Boolean |  no  |  |

---


 
 
 #### [OAuthConfig](#OAuthConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | limit | Int |  no  |  |
 | pages | Int |  no  |  |
 | interval | Int |  no  |  |
 | consumer_key | String |  no  |  |
 | consumer_secret | String |  no  |  |
 | token | String |  no  |  |
 | token_secret | String |  no  |  |
 | rest_url | String |  no  |  |
 | rest_base_url | String |  no  |  |
 | function_name | String |  no  |  |

---


 
 
 #### [ProcessConfig](#ProcessConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | db_config | [DBConfig](#DBConfig) |  no  |  |
 | db_param_config | [DBParamConfig](#DBParamConfig) |  no  |  |
 | sftp_config | [SFTPConfig](#SFTPConfig) |  no  |  |
 | aws_s3_config | [AWSS3config](#AWSS3config) |  no  |  |
 | mongo_doc_config | [MongoDocConfig](#MongoDocConfig) |  no  |  |
 | ftp_config | [FTPConfig](#FTPConfig) |  no  |  |
 | email_config | [EmailConfig](#EmailConfig) |  no  |  |
 | file_config | [FileConfig](#FileConfig) |  no  |  |
 | json_doc_config | [JsonDocConfig](#JsonDocConfig) |  no  |  |
 | doc_mapping_config | [DocMappingConfig](#DocMappingConfig) |  no  |  |
 | task_step_config | [TaskStepConfig](#TaskStepConfig) |  no  |  |
 | http_config | [HttpConfig](#HttpConfig) |  no  |  |
 | local_file_config | [LocalFileConfig](#LocalFileConfig) |  no  |  |
 | oauth_config | [OAuthConfig](#OAuthConfig) |  no  |  |
 | google_spreadsheet_config | [GoogleSpreadSheetConfig](#GoogleSpreadSheetConfig) |  no  |  |

---


 
 
 #### [PropBeanConfig](#PropBeanConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | required | Boolean |  no  |  |
 | mapping | HashMap<String,[PropBeanConfig](#PropBeanConfig)> |  no  |  |
 | optional | Boolean |  no  |  |
 | send | [Send](#Send) |  no  |  |
 | validations | ArrayList<HashMap<String,HashMap<String,Any>>> |  no  |  |
 | values | ArrayList<String> |  no  |  |
 | include | Boolean |  no  |  |
 | source_field | String |  no  |  |
 | source_fields | ArrayList<String> |  no  |  |
 | destination_field | String |  no  |  |
 | data_type | String |  no  |  |
 | default_value | HashMap<String,Any> |  no  |  |
 | const_value | HashMap<String,Any> |  no  |  |
 | concat_str | String |  no  |  |
 | function_name | String |  no  |  |
 | transformer_name | String |  no  |  |
 | all_param_function_name | String |  no  |  |
 | sub_separator | String |  no  |  |
 | index_field | String |  no  |  |
 | ignore_if_not_exists | Boolean |  no  |  |
 | identifier_type | String |  no  |  |
 | projection_query | HashMap<String,HashMap<String,Any>> |  no  |  |
 | enrich_from_master | Boolean |  no  |  |

---


 
 
 #### [PropBeanDTO](#PropBeanDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | required | Boolean |  no  |  |
 | optional | Boolean |  no  |  |
 | include | Boolean |  no  |  |
 | source_field | String |  no  |  |
 | source_fields | ArrayList<String> |  no  |  |
 | destination_field | String |  no  |  |
 | data_type | String |  no  |  |
 | default_value | HashMap<String,Any> |  no  |  |
 | const_value | HashMap<String,Any> |  no  |  |
 | concat_str | String |  no  |  |
 | function_name | String |  no  |  |
 | transformer_name | String |  no  |  |
 | all_param_function_name | String |  no  |  |
 | sub_separator | String |  no  |  |
 | index_field | String |  no  |  |
 | ignore_if_not_exists | Boolean |  no  |  |
 | identifier_type | String |  no  |  |
 | projection_query | HashMap<String,HashMap<String,Any>> |  no  |  |
 | enrich_from_master | Boolean |  no  |  |

---


 
 
 #### [ResponseEnvelopeListJobConfigRawDTO](#ResponseEnvelopeListJobConfigRawDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String |  no  |  |
 | status | Int |  no  |  |
 | error | String |  no  |  |
 | exception | String |  no  |  |
 | message | String |  no  |  |
 | total_time_taken_in_millis | Int |  no  |  |
 | http_status | String |  no  |  |
 | items | ArrayList<[JobConfigRawDTO](#JobConfigRawDTO)> |  no  |  |
 | payload | ArrayList<[JobConfigRawDTO](#JobConfigRawDTO)> |  no  |  |
 | trace_id | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [SFTPConfig](#SFTPConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | host | String |  no  |  |
 | port | Int |  no  |  |
 | username | String |  no  |  |
 | password | String |  no  |  |
 | unzip | Boolean |  no  |  |
 | retries | Int |  no  |  |
 | interval | Int |  no  |  |
 | private_key_path | String |  no  |  |
 | strict_host_key_checking | Boolean |  no  |  |
 | local_dir | String |  no  |  |
 | remote_dir | String |  no  |  |
 | password_protected | Boolean |  no  |  |
 | zip_file_regex | String |  no  |  |
 | file_regex | String |  no  |  |
 | zip_format | String |  no  |  |
 | archive_config | [ArchiveConfig](#ArchiveConfig) |  no  |  |
 | read_all_files | Boolean |  no  |  |

---


 
 
 #### [Send](#Send)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | raw | Boolean |  no  |  |
 | processed | Boolean |  no  |  |

---


 
 
 #### [StoreConfig](#StoreConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | job_code | String |  no  |  |
 | storeid | String |  no  |  |
 | store_alias | String |  no  |  |
 | store_file_regex | String |  no  |  |
 | store_file_name | String |  no  |  |
 | process_config | [ProcessConfig](#ProcessConfig) |  no  |  |
 | properties | HashMap<String,String> |  no  |  |

---


 
 
 #### [StoreFilter](#StoreFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | include_tags | ArrayList<String> |  no  |  |
 | exclude_tags | ArrayList<String> |  no  |  |
 | query | HashMap<String,HashMap<String,Any>> |  no  |  |

---


 
 
 #### [TaskConfig](#TaskConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | task_config_id | Int |  no  |  |
 | task_params | ArrayList<[TaskParam](#TaskParam)> |  no  |  |

---


 
 
 #### [TaskParam](#TaskParam)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | value | HashMap<String,Any> |  no  |  |

---


 
 
 #### [TaskStepConfig](#TaskStepConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | task_configs | ArrayList<[TaskConfig](#TaskConfig)> |  no  |  |
 | task_config_ids | ArrayList<Int> |  no  |  |
 | task_config_group_ids | ArrayList<Int> |  no  |  |

---


 
 
 #### [ResponseEnvelopeListJobConfigDTO](#ResponseEnvelopeListJobConfigDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String |  no  |  |
 | status | Int |  no  |  |
 | error | String |  no  |  |
 | exception | String |  no  |  |
 | message | String |  no  |  |
 | total_time_taken_in_millis | Int |  no  |  |
 | http_status | String |  no  |  |
 | items | ArrayList<[JobConfigDTO](#JobConfigDTO)> |  no  |  |
 | payload | ArrayList<[JobConfigDTO](#JobConfigDTO)> |  no  |  |
 | trace_id | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [ResponseEnvelopeJobConfigDTO](#ResponseEnvelopeJobConfigDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String |  no  |  |
 | status | Int |  no  |  |
 | error | String |  no  |  |
 | exception | String |  no  |  |
 | message | String |  no  |  |
 | total_time_taken_in_millis | Int |  no  |  |
 | http_status | String |  no  |  |
 | items | [JobConfigDTO](#JobConfigDTO) |  no  |  |
 | payload | [JobConfigDTO](#JobConfigDTO) |  no  |  |
 | trace_id | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [JobHistoryDto](#JobHistoryDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | total_added_count | Int |  no  |  |
 | total_updated_count | Int |  no  |  |
 | total_suppressed_count | Int |  no  |  |
 | job_id | Int |  no  |  |
 | status | String |  no  |  |
 | job_code | String |  no  |  |
 | processed_on | String |  no  |  |
 | filename | ArrayList<String> |  no  |  |

---


 
 
 #### [JobMetricsDto](#JobMetricsDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | job_code | String |  no  |  |
 | is_run_more_than_usual | String |  no  |  |
 | job_history | ArrayList<[JobHistoryDto](#JobHistoryDto)> |  no  |  |
 | total_success_count | Int |  no  |  |
 | total_failure_count | Int |  no  |  |
 | total_warning_count | Int |  no  |  |
 | total_suppressed_count | Int |  no  |  |
 | total_job_runs | Int |  no  |  |

---


 
 
 #### [ResponseEnvelopeJobMetricsDto](#ResponseEnvelopeJobMetricsDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String |  no  |  |
 | status | Int |  no  |  |
 | error | String |  no  |  |
 | exception | String |  no  |  |
 | message | String |  no  |  |
 | total_time_taken_in_millis | Int |  no  |  |
 | http_status | String |  no  |  |
 | items | [JobMetricsDto](#JobMetricsDto) |  no  |  |
 | payload | [JobMetricsDto](#JobMetricsDto) |  no  |  |
 | trace_id | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [JobConfigListDTO](#JobConfigListDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  |  |
 | alias | String |  no  |  |
 | modified_by | String |  no  |  |
 | created_by | String |  no  |  |
 | modified_on | String |  no  |  |
 | created_on | String |  no  |  |
 | active | Boolean |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ResponseEnvelopeListJobConfigListDTO](#ResponseEnvelopeListJobConfigListDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String |  no  |  |
 | status | Int |  no  |  |
 | error | String |  no  |  |
 | exception | String |  no  |  |
 | message | String |  no  |  |
 | total_time_taken_in_millis | Int |  no  |  |
 | http_status | String |  no  |  |
 | items | ArrayList<[JobConfigListDTO](#JobConfigListDTO)> |  no  |  |
 | payload | ArrayList<[JobConfigListDTO](#JobConfigListDTO)> |  no  |  |
 | trace_id | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---




 
 
 #### [ApplicationInventory](#ApplicationInventory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | inventory | [AppInventoryConfig](#AppInventoryConfig) |  no  |  |
 | authentication | [AuthenticationConfig](#AuthenticationConfig) |  no  |  |
 | article_assignment | [ArticleAssignmentConfig](#ArticleAssignmentConfig) |  no  |  |
 | reward_points | [RewardPointsConfig](#RewardPointsConfig) |  no  |  |
 | cart | [AppCartConfig](#AppCartConfig) |  no  |  |
 | payment | [AppPaymentConfig](#AppPaymentConfig) |  no  |  |
 | order | [AppOrderConfig](#AppOrderConfig) |  no  |  |
 | logistics | [AppLogisticsConfig](#AppLogisticsConfig) |  no  |  |
 | business | String |  no  |  |
 | comms_enabled | Boolean |  no  |  |
 | platforms | ArrayList<String> |  no  |  |
 | _id | String |  no  |  |
 | loyalty_points | [LoyaltyPointsConfig](#LoyaltyPointsConfig) |  no  |  |
 | app | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | modified_by | String |  no  |  |

---


 
 
 #### [AppInventoryConfig](#AppInventoryConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | [InventoryBrand](#InventoryBrand) |  no  |  |
 | store | [InventoryStore](#InventoryStore) |  no  |  |
 | category | [InventoryCategory](#InventoryCategory) |  no  |  |
 | price | [InventoryPrice](#InventoryPrice) |  no  |  |
 | discount | [InventoryDiscount](#InventoryDiscount) |  no  |  |
 | out_of_stock | Boolean |  no  |  |
 | franchise_enabled | Boolean |  no  |  |
 | exclude_category | ArrayList<Any> |  no  |  |
 | image | ArrayList<String> |  no  |  |
 | company_store | ArrayList<Any> |  no  |  |

---


 
 
 #### [InventoryBrand](#InventoryBrand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | criteria | String |  no  |  |
 | brands | ArrayList<Any> |  no  |  |

---


 
 
 #### [InventoryStore](#InventoryStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | criteria | String |  no  |  |
 | stores | ArrayList<Any> |  no  |  |
 | rules | [AppStoreRules](#AppStoreRules) |  no  |  |

---


 
 
 #### [AppStoreRules](#AppStoreRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companies | ArrayList<Int> |  no  |  |
 | brands | ArrayList<Any> |  no  |  |

---


 
 
 #### [InventoryCategory](#InventoryCategory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | criteria | String |  no  |  |
 | categories | ArrayList<Any> |  no  |  |

---


 
 
 #### [InventoryPrice](#InventoryPrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | Double |  no  |  |
 | max | Double |  no  |  |

---


 
 
 #### [InventoryDiscount](#InventoryDiscount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | Double |  no  |  |
 | max | Double |  no  |  |

---


 
 
 #### [AuthenticationConfig](#AuthenticationConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | required | Boolean |  no  |  |
 | provider | String |  no  |  |

---


 
 
 #### [ArticleAssignmentConfig](#ArticleAssignmentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rules | [ArticleAssignmentRules](#ArticleAssignmentRules) |  no  |  |
 | post_order_reassignment | Boolean |  no  |  |
 | enforced_stores | ArrayList<Any> |  no  |  |

---


 
 
 #### [ArticleAssignmentRules](#ArticleAssignmentRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | store_priority | [StorePriority](#StorePriority) |  no  |  |

---


 
 
 #### [StorePriority](#StorePriority)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | storetype_order | ArrayList<Any> |  no  |  |

---


 
 
 #### [RewardPointsConfig](#RewardPointsConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credit | [Credit](#Credit) |  no  |  |
 | debit | [Debit](#Debit) |  no  |  |

---


 
 
 #### [Credit](#Credit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [Debit](#Debit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | auto_apply | Boolean |  no  |  |
 | strategy_channel | String |  no  |  |

---


 
 
 #### [AppCartConfig](#AppCartConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | delivery_charges | [DeliveryCharges](#DeliveryCharges) |  no  |  |
 | enabled | Boolean |  no  |  |
 | max_cart_items | Int |  no  |  |
 | min_cart_value | Double |  no  |  |
 | bulk_coupons | Boolean |  no  |  |

---


 
 
 #### [DeliveryCharges](#DeliveryCharges)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | charges | [Charges](#Charges) |  no  |  |

---


 
 
 #### [Charges](#Charges)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | threshold | Double |  no  |  |
 | charges | Double |  no  |  |

---


 
 
 #### [AppPaymentConfig](#AppPaymentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | callback_url | [CallbackUrl](#CallbackUrl) |  no  |  |
 | methods | [Methods](#Methods) |  no  |  |
 | payment_selection_lock | [PaymentSelectionLock](#PaymentSelectionLock) |  no  |  |
 | mode_of_payment | String |  no  |  |
 | source | String |  no  |  |
 | enabled | Boolean |  no  |  |
 | cod_amount_limit | Double |  no  |  |
 | cod_charges | Double |  no  |  |

---


 
 
 #### [CallbackUrl](#CallbackUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app | String |  no  |  |
 | web | String |  no  |  |

---


 
 
 #### [Methods](#Methods)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pl | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | card | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | nb | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | wl | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | ps | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | upi | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | qr | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | cod | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | pp | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | jp | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | pac | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | fc | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | jiopp | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | stripepg | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | juspaypg | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | payubizpg | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | payumoneypg | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | rupifipg | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |
 | simpl | [PaymentModeConfig](#PaymentModeConfig) |  no  |  |

---


 
 
 #### [PaymentModeConfig](#PaymentModeConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [PaymentSelectionLock](#PaymentSelectionLock)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | default_options | String |  no  |  |
 | payment_identifier | String |  no  |  |

---


 
 
 #### [AppOrderConfig](#AppOrderConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | force_reassignment | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [AppLogisticsConfig](#AppLogisticsConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logistics_by_seller | Boolean |  no  |  |
 | serviceability_check | Boolean |  no  |  |
 | same_day_delivery | Boolean |  no  |  |
 | dp_assignment | Boolean |  no  |  |

---


 
 
 #### [LoyaltyPointsConfig](#LoyaltyPointsConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | auto_apply | Boolean |  no  |  |

---


 
 
 #### [AppInventoryPartialUpdate](#AppInventoryPartialUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reward_points | [RewardPointsConfig](#RewardPointsConfig) |  no  |  |
 | cart | [AppCartConfig](#AppCartConfig) |  no  |  |
 | payment | [AppPaymentConfig](#AppPaymentConfig) |  no  |  |
 | loyalty_points | [LoyaltyPointsConfig](#LoyaltyPointsConfig) |  no  |  |
 | comms_enabled | Boolean |  no  |  |

---


 
 
 #### [BrandCompanyInfo](#BrandCompanyInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | company_name | String |  no  |  |
 | company_id | Int |  no  |  |

---


 
 
 #### [CompanyByBrandsRequest](#CompanyByBrandsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brands | Int? |  yes  | Brand uids |
 | search_text | String |  no  | Search company by name |

---


 
 
 #### [CompanyByBrandsResponse](#CompanyByBrandsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[BrandCompanyInfo](#BrandCompanyInfo)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [StoreByBrandsRequest](#StoreByBrandsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | company_id | Int |  no  | Current company id for current company stores only. Don't send in case of cross selling enabled |
 | brands | Int? |  yes  | Brand uids |
 | search_text | String |  no  | Search store by name or store code |

---


 
 
 #### [StoreByBrandsResponse](#StoreByBrandsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[BrandStoreInfo](#BrandStoreInfo)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [BrandStoreInfo](#BrandStoreInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | store_name | String |  no  |  |
 | store_id | Int |  no  |  |
 | store_type | String |  no  |  |
 | store_code | String |  no  |  |
 | store_address | [OptedStoreAddress](#OptedStoreAddress) |  no  |  |
 | company | [OptedCompany](#OptedCompany) |  no  |  |

---


 
 
 #### [CompanyBrandInfo](#CompanyBrandInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | value | Int |  no  |  |
 | brand_logo_url | String |  no  |  |
 | brand_banner_url | String |  no  |  |
 | brand_banner_portrait_url | String |  no  |  |

---


 
 
 #### [BrandsByCompanyResponse](#BrandsByCompanyResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brands | [CompanyBrandInfo](#CompanyBrandInfo) |  no  |  |

---


 
 
 #### [CreateApplicationRequest](#CreateApplicationRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app | [App](#App) |  no  |  |
 | configuration | [AppInventory](#AppInventory) |  no  |  |
 | domain | [AppDomain](#AppDomain) |  no  |  |

---


 
 
 #### [CreateAppResponse](#CreateAppResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app | [Application](#Application) |  no  |  |
 | configuration | [ApplicationInventory](#ApplicationInventory) |  no  |  |

---


 
 
 #### [ApplicationsResponse](#ApplicationsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Application](#Application)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [MobileAppConfiguration](#MobileAppConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_active | Boolean |  no  |  |
 | _id | String |  no  |  |
 | app_name | String |  no  |  |
 | landing_image | [LandingImage](#LandingImage) |  no  |  |
 | splash_image | [SplashImage](#SplashImage) |  no  |  |
 | application | String |  no  |  |
 | platform_type | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |
 | package_name | String |  no  |  |

---


 
 
 #### [LandingImage](#LandingImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspect_ratio | String |  no  |  |
 | secure_url | String |  no  |  |

---


 
 
 #### [SplashImage](#SplashImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspect_ratio | String |  no  |  |
 | secure_url | String |  no  |  |

---


 
 
 #### [MobileAppConfigRequest](#MobileAppConfigRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app_name | String |  no  |  |
 | landing_image | [LandingImage](#LandingImage) |  no  |  |
 | splash_image | [SplashImage](#SplashImage) |  no  |  |
 | is_active | Boolean |  no  |  |

---


 
 
 #### [BuildVersionHistory](#BuildVersionHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | versions | [BuildVersion](#BuildVersion) |  no  |  |
 | latest_available_version_name | String |  no  |  |

---


 
 
 #### [BuildVersion](#BuildVersion)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | application | String |  no  |  |
 | platform_type | String |  no  |  |
 | build_status | String |  no  |  |
 | version_name | String |  no  |  |
 | version_code | Int |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [AppSupportedCurrency](#AppSupportedCurrency)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | supported_currency | ArrayList<String> |  no  |  |
 | application | String |  no  |  |
 | default_currency | [DefaultCurrency](#DefaultCurrency) |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |

---


 
 
 #### [DefaultCurrency](#DefaultCurrency)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ref | String |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [CurrencyConfig](#CurrencyConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | name | String |  no  |  |
 | code | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | decimal_digits | Int |  no  |  |
 | symbol | String |  no  |  |

---


 
 
 #### [DomainAdd](#DomainAdd)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  | Full domain name |

---


 
 
 #### [DomainAddRequest](#DomainAddRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domain | [DomainAdd](#DomainAdd) |  no  |  |

---


 
 
 #### [DomainsResponse](#DomainsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domains | ArrayList<[Domain](#Domain)> |  no  |  |

---


 
 
 #### [UpdateDomain](#UpdateDomain)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |

---


 
 
 #### [UpdateDomainTypeRequest](#UpdateDomainTypeRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domain | [UpdateDomain](#UpdateDomain) |  no  |  |
 | action | String |  no  |  |

---


 
 
 #### [DomainStatusRequest](#DomainStatusRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domain_url | String |  no  | Domain url |

---


 
 
 #### [DomainStatus](#DomainStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | status | Boolean |  no  |  |

---


 
 
 #### [DomainStatusResponse](#DomainStatusResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | connected | Boolean |  no  |  |
 | status | ArrayList<[DomainStatus](#DomainStatus)> |  no  |  |

---


 
 
 #### [DomainSuggestionsRequest](#DomainSuggestionsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domain_url | String |  no  | Domain url |
 | custom | Boolean |  no  | Get suggestion for custom domains or fynd domains |

---


 
 
 #### [DomainSuggestion](#DomainSuggestion)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | unsupported | Boolean |  no  | Whether TLD domain is supported or not |
 | is_available | Boolean? |  yes  |  |
 | price | Double |  no  | Price for purchasing a custom domain. Not present for fynd domain |
 | currency | String |  no  | Custom domain price currency. Not present for fynd domain |

---


 
 
 #### [DomainSuggestionsResponse](#DomainSuggestionsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domains | ArrayList<[DomainSuggestion](#DomainSuggestion)> |  no  | Domain url |

---


 
 
 #### [GetIntegrationsOptInsResponse](#GetIntegrationsOptInsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [IntegrationOptIn](#IntegrationOptIn) |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [IntegrationOptIn](#IntegrationOptIn)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | validators | [Validators](#Validators) |  no  |  |
 | description | String |  no  |  |
 | description_html | String |  no  |  |
 | constants | String |  no  |  |
 | companies | ArrayList<HashMap<String,Any>> |  no  |  |
 | support | ArrayList<String> |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | meta | [IntegrationMeta](#IntegrationMeta) |  no  |  |
 | icon | String |  no  |  |
 | owner | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | token | String |  no  |  |
 | secret | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [Validators](#Validators)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | company | [CompanyValidator](#CompanyValidator) |  no  |  |
 | store | [StoreValidator](#StoreValidator) |  no  |  |
 | inventory | [InventoryValidator](#InventoryValidator) |  no  |  |
 | order | [OrderValidator](#OrderValidator) |  no  |  |

---


 
 
 #### [CompanyValidator](#CompanyValidator)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | json_schema | [JsonSchema](#JsonSchema) |  no  |  |
 | browser_script | String |  no  |  |

---


 
 
 #### [JsonSchema](#JsonSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | key | String |  no  |  |
 | type | String |  no  |  |
 | tooltip | String |  no  |  |

---


 
 
 #### [StoreValidator](#StoreValidator)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | json_schema | ArrayList<[JsonSchema](#JsonSchema)> |  no  |  |
 | browser_script | String |  no  |  |

---


 
 
 #### [InventoryValidator](#InventoryValidator)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | json_schema | ArrayList<[JsonSchema](#JsonSchema)> |  no  |  |
 | browser_script | String |  no  |  |

---


 
 
 #### [OrderValidator](#OrderValidator)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | json_schema | ArrayList<[JsonSchema](#JsonSchema)> |  no  |  |
 | browser_script | String |  no  |  |

---


 
 
 #### [IntegrationMeta](#IntegrationMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_public | Boolean |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [Integration](#Integration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | validators | [Validators](#Validators) |  no  |  |
 | description | String |  no  |  |
 | description_html | String |  no  |  |
 | constants | HashMap<String,Any> |  no  |  |
 | companies | ArrayList<HashMap<String,Any>> |  no  |  |
 | support | ArrayList<String> |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | meta | [IntegrationMeta](#IntegrationMeta) |  no  |  |
 | icon | String |  no  |  |
 | owner | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | token | String |  no  |  |
 | secret | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [IntegrationConfigResponse](#IntegrationConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [IntegrationLevel](#IntegrationLevel) |  no  |  |

---


 
 
 #### [IntegrationLevel](#IntegrationLevel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | opted | Boolean |  no  |  |
 | permissions | ArrayList<HashMap<String,Any>> |  no  |  |
 | last_patch | ArrayList<HashMap<String,Any>> |  no  |  |
 | _id | String |  no  |  |
 | integration | String |  no  |  |
 | level | String |  no  |  |
 | uid | Int |  no  |  |
 | meta | ArrayList<Any> |  no  |  |
 | token | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |
 | data | HashMap<String,Any> |  no  |  |

---


 
 
 #### [OptedStoreIntegration](#OptedStoreIntegration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | other_opted | Boolean |  no  |  |
 | other_integration | [IntegrationOptIn](#IntegrationOptIn) |  no  |  |
 | other_entity | [OtherEntity](#OtherEntity) |  no  |  |

---


 
 
 #### [OtherEntity](#OtherEntity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | opted | Boolean |  no  |  |
 | permissions | ArrayList<String> |  no  |  |
 | last_patch | [LastPatch](#LastPatch) |  no  |  |
 | _id | String |  no  |  |
 | integration | String |  no  |  |
 | level | String |  no  |  |
 | uid | Int |  no  |  |
 | data | [OtherEntityData](#OtherEntityData) |  no  |  |
 | meta | ArrayList<HashMap<String,Any>> |  no  |  |
 | token | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [LastPatch](#LastPatch)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | op | String |  no  |  |
 | path | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [OtherEntityData](#OtherEntityData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | article_identifier | String |  no  |  |

---


 
 
 #### [App](#App)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | company_id | String |  no  | Current company id |
 | channel_type | String |  no  |  |
 | auth | [ApplicationAuth](#ApplicationAuth) |  no  |  |
 | name | String |  no  | User friendly name for application |
 | desc | String |  no  | Basic description of application |

---


 
 
 #### [AppInventory](#AppInventory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | [InventoryBrandRule](#InventoryBrandRule) |  no  |  |
 | store | [InventoryStoreRule](#InventoryStoreRule) |  no  |  |
 | image | ArrayList<String> |  no  |  |
 | franchise_enabled | Boolean |  no  |  |
 | out_of_stock | Boolean |  no  |  |
 | payment | [InventoryPaymentConfig](#InventoryPaymentConfig) |  no  |  |
 | article_assignment | [InventoryArticleAssignment](#InventoryArticleAssignment) |  no  |  |

---


 
 
 #### [AppDomain](#AppDomain)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |

---


 
 
 #### [CompaniesResponse](#CompaniesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [AppInventoryCompanies](#AppInventoryCompanies) |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [AppInventoryCompanies](#AppInventoryCompanies)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Int |  no  |  |
 | name | String |  no  |  |
 | company_type | String |  no  |  |

---


 
 
 #### [StoresResponse](#StoresResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [AppInventoryStores](#AppInventoryStores) |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [AppInventoryStores](#AppInventoryStores)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | modified_on | String |  no  |  |
 | uid | Int |  no  |  |
 | name | String |  no  |  |
 | display_name | String |  no  |  |
 | store_type | String |  no  |  |
 | store_code | String |  no  |  |
 | company_id | Int |  no  |  |

---


 
 
 #### [FilterOrderingStoreRequest](#FilterOrderingStoreRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | all_stores | Boolean |  no  |  |
 | deployed_stores | ArrayList<Int> |  no  |  |
 | q | String |  no  |  |

---


 
 
 #### [DeploymentMeta](#DeploymentMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deployed_stores | ArrayList<Int> |  no  |  |
 | all_stores | Boolean |  no  |  |
 | enabled | Boolean |  no  |  |
 | type | String |  no  |  |
 | _id | String |  no  |  |
 | app | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [OrderingStoreConfig](#OrderingStoreConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deployment_meta | [DeploymentMeta](#DeploymentMeta) |  no  |  |

---


 
 
 #### [OtherSellerCompany](#OtherSellerCompany)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Int |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [OtherSellerApplication](#OtherSellerApplication)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | _id | String |  no  |  |
 | domain | String |  no  |  |
 | company | [OtherSellerCompany](#OtherSellerCompany) |  no  |  |
 | opt_type | String |  no  |  |

---


 
 
 #### [OtherSellerApplications](#OtherSellerApplications)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[OtherSellerApplication](#OtherSellerApplication)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [OptedApplicationResponse](#OptedApplicationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | _id | String |  no  |  |
 | domain | String |  no  |  |
 | company | [OptedCompany](#OptedCompany) |  no  |  |
 | opted_inventory | [OptedInventory](#OptedInventory) |  no  |  |
 | opt_out_inventory | [OptOutInventory](#OptOutInventory) |  no  |  |

---


 
 
 #### [OptedCompany](#OptedCompany)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Int |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [OptedInventory](#OptedInventory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | opt_type | [OptType](#OptType) |  no  |  |
 | items | Any |  no  |  |

---


 
 
 #### [OptType](#OptType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | display | String |  no  |  |

---


 
 
 #### [OptedStore](#OptedStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | store_code | String |  no  |  |
 | _id | String |  no  |  |
 | modified_on | String |  no  |  |
 | uid | Int |  no  |  |
 | address | [OptedStoreAddress](#OptedStoreAddress) |  no  |  |
 | display_name | String |  no  |  |
 | store_type | String |  no  |  |
 | company_id | Int |  no  |  |

---


 
 
 #### [OptOutInventory](#OptOutInventory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | store | ArrayList<Int>? |  yes  |  |
 | company | ArrayList<Int>? |  yes  |  |

---


 
 
 #### [TokenResponse](#TokenResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tokens | [Tokens](#Tokens) |  no  |  |
 | _id | String |  no  |  |
 | application | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [Tokens](#Tokens)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firebase | [Firebase](#Firebase) |  no  |  |
 | moengage | [Moengage](#Moengage) |  no  |  |
 | segment | [Segment](#Segment) |  no  |  |
 | gtm | [Gtm](#Gtm) |  no  |  |
 | freshchat | [Freshchat](#Freshchat) |  no  |  |
 | safetynet | [Safetynet](#Safetynet) |  no  |  |
 | fynd_rewards | [FyndRewards](#FyndRewards) |  no  |  |
 | google_map | [GoogleMap](#GoogleMap) |  no  |  |

---


 
 
 #### [Firebase](#Firebase)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credentials | [Credentials](#Credentials) |  no  |  |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [Credentials](#Credentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ios | [Ios](#Ios) |  no  |  |
 | android | [Android](#Android) |  no  |  |
 | project_id | String |  no  |  |
 | gcm_sender_id | String |  no  |  |
 | application_id | String |  no  |  |
 | api_key | String |  no  |  |

---


 
 
 #### [Ios](#Ios)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application_id | String |  no  |  |
 | api_key | String |  no  |  |

---


 
 
 #### [Android](#Android)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application_id | String |  no  |  |
 | api_key | String |  no  |  |

---


 
 
 #### [Moengage](#Moengage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credentials | [MoengageCredentials](#MoengageCredentials) |  no  |  |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [MoengageCredentials](#MoengageCredentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app_id | String |  no  |  |

---


 
 
 #### [Segment](#Segment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credentials | [SegmentCredentials](#SegmentCredentials) |  no  |  |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [SegmentCredentials](#SegmentCredentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | write_key | String |  no  |  |

---


 
 
 #### [Gtm](#Gtm)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credentials | [GtmCredentials](#GtmCredentials) |  no  |  |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [GtmCredentials](#GtmCredentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | api_key | String |  no  |  |

---


 
 
 #### [Freshchat](#Freshchat)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credentials | [FreshchatCredentials](#FreshchatCredentials) |  no  |  |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [FreshchatCredentials](#FreshchatCredentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app_id | String |  no  |  |
 | app_key | String |  no  |  |
 | web_token | String |  no  |  |

---


 
 
 #### [Safetynet](#Safetynet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credentials | [SafetynetCredentials](#SafetynetCredentials) |  no  |  |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [SafetynetCredentials](#SafetynetCredentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | api_key | String |  no  |  |

---


 
 
 #### [FyndRewards](#FyndRewards)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credentials | [FyndRewardsCredentials](#FyndRewardsCredentials) |  no  |  |

---


 
 
 #### [FyndRewardsCredentials](#FyndRewardsCredentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | public_key | String |  no  |  |

---


 
 
 #### [GoogleMap](#GoogleMap)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credentials | [GoogleMapCredentials](#GoogleMapCredentials) |  no  |  |

---


 
 
 #### [GoogleMapCredentials](#GoogleMapCredentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | api_key | String |  no  |  |

---


 
 
 #### [ProductDetailFeature](#ProductDetailFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | similar | ArrayList<String> |  no  |  |
 | seller_selection | Boolean |  no  |  |
 | update_product_meta | Boolean |  no  |  |
 | request_product | Boolean |  no  |  |

---


 
 
 #### [LaunchPage](#LaunchPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page_type | String |  no  |  |
 | params | HashMap<String,Any> |  no  |  |
 | query | HashMap<String,Any> |  no  |  |

---


 
 
 #### [LandingPageFeature](#LandingPageFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | launch_page | [LaunchPage](#LaunchPage) |  no  |  |
 | continue_as_guest | Boolean |  no  |  |
 | login_btn_text | String |  no  |  |
 | show_domain_textbox | Boolean |  no  |  |
 | show_register_btn | Boolean |  no  |  |

---


 
 
 #### [RegistrationPageFeature](#RegistrationPageFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ask_store_address | Boolean |  no  |  |

---


 
 
 #### [AppFeature](#AppFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | product_detail | [ProductDetailFeature](#ProductDetailFeature) |  no  |  |
 | landing_page | [LandingPageFeature](#LandingPageFeature) |  no  |  |
 | registration_page | [RegistrationPageFeature](#RegistrationPageFeature) |  no  |  |
 | home_page | [HomePageFeature](#HomePageFeature) |  no  |  |
 | common | [CommonFeature](#CommonFeature) |  no  |  |
 | cart | [CartFeature](#CartFeature) |  no  |  |
 | qr | [QrFeature](#QrFeature) |  no  |  |
 | pcr | [PcrFeature](#PcrFeature) |  no  |  |
 | order | [OrderFeature](#OrderFeature) |  no  |  |
 | _id | String |  no  |  |
 | app | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [HomePageFeature](#HomePageFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order_processing | Boolean |  no  |  |

---


 
 
 #### [CommonFeature](#CommonFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | communication_optin_dialog | [CommunicationOptinDialogFeature](#CommunicationOptinDialogFeature) |  no  |  |
 | deployment_store_selection | [DeploymentStoreSelectionFeature](#DeploymentStoreSelectionFeature) |  no  |  |
 | listing_price | [ListingPriceFeature](#ListingPriceFeature) |  no  |  |
 | listing_page | [ListingPageFeature](#ListingPageFeature) |  no  |  |
 | currency | [CurrencyFeature](#CurrencyFeature) |  no  |  |
 | revenue_engine | [RevenueEngineFeature](#RevenueEngineFeature) |  no  |  |
 | feedback | [FeedbackFeature](#FeedbackFeature) |  no  |  |
 | compare_products | [CompareProductsFeature](#CompareProductsFeature) |  no  |  |

---


 
 
 #### [CommunicationOptinDialogFeature](#CommunicationOptinDialogFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | visibility | Boolean |  no  |  |

---


 
 
 #### [DeploymentStoreSelectionFeature](#DeploymentStoreSelectionFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ListingPriceFeature](#ListingPriceFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | sort | String |  no  |  |

---


 
 
 #### [ListingPageFeature](#ListingPageFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sort_on | String |  no  |  |

---


 
 
 #### [CurrencyFeature](#CurrencyFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | ArrayList<String> |  no  |  |
 | type | String |  no  |  |
 | default_currency | String |  no  |  |

---


 
 
 #### [RevenueEngineFeature](#RevenueEngineFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [FeedbackFeature](#FeedbackFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [CompareProductsFeature](#CompareProductsFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [CartFeature](#CartFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gst_input | Boolean |  no  |  |
 | staff_selection | Boolean |  no  |  |
 | placing_for_customer | Boolean |  no  |  |
 | google_map | Boolean |  no  |  |

---


 
 
 #### [QrFeature](#QrFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application | Boolean |  no  |  |
 | products | Boolean |  no  |  |
 | collections | Boolean |  no  |  |

---


 
 
 #### [PcrFeature](#PcrFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | staff_selection | Boolean |  no  |  |

---


 
 
 #### [OrderFeature](#OrderFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | buy_again | Boolean |  no  |  |

---


 
 
 #### [AppFeatureRequest](#AppFeatureRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | feature | [AppFeature](#AppFeature) |  no  |  |

---


 
 
 #### [AppFeatureResponse](#AppFeatureResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | feature | [AppFeature](#AppFeature) |  no  |  |

---


 
 
 #### [Currency](#Currency)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | is_active | Boolean |  no  |  |
 | name | String |  no  |  |
 | code | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | decimal_digits | Int |  no  |  |
 | symbol | String |  no  |  |

---


 
 
 #### [Domain](#Domain)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Boolean |  no  |  |
 | is_primary | Boolean |  no  |  |
 | is_default | Boolean |  no  |  |
 | is_shortlink | Boolean |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [ApplicationWebsite](#ApplicationWebsite)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | basepath | String |  no  |  |

---


 
 
 #### [ApplicationCors](#ApplicationCors)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domains | ArrayList<String> |  no  |  |

---


 
 
 #### [ApplicationAuth](#ApplicationAuth)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [ApplicationRedirections](#ApplicationRedirections)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | from | String |  no  |  |
 | redirect_to | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ApplicationMeta](#ApplicationMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [SecureUrl](#SecureUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | secure_url | String |  no  |  |

---


 
 
 #### [Application](#Application)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | website | [ApplicationWebsite](#ApplicationWebsite) |  no  |  |
 | cors | [ApplicationCors](#ApplicationCors) |  no  |  |
 | auth | [ApplicationAuth](#ApplicationAuth) |  no  |  |
 | description | String |  no  |  |
 | channel_type | String |  no  |  |
 | cache_ttl | Int |  no  |  |
 | is_internal | Boolean |  no  |  |
 | is_active | Boolean |  no  |  |
 | _id | String |  no  |  |
 | name | String |  no  |  |
 | owner | String |  no  |  |
 | company_id | Int |  no  |  |
 | token | String |  no  |  |
 | redirections | ArrayList<[ApplicationRedirections](#ApplicationRedirections)> |  no  |  |
 | meta | ArrayList<[ApplicationMeta](#ApplicationMeta)> |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |
 | banner | [SecureUrl](#SecureUrl) |  no  |  |
 | logo | [SecureUrl](#SecureUrl) |  no  |  |
 | favicon | [SecureUrl](#SecureUrl) |  no  |  |
 | domains | ArrayList<[Domain](#Domain)> |  no  |  |
 | app_type | String |  no  |  |
 | mobile_logo | [SecureUrl](#SecureUrl) |  no  |  |
 | domain | [Domain](#Domain) |  no  |  |

---


 
 
 #### [NotFound](#NotFound)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [UnhandledError](#UnhandledError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [InvalidPayloadRequest](#InvalidPayloadRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [SuccessMessageResponse](#SuccessMessageResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [InventoryBrandRule](#InventoryBrandRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | criteria | String |  no  | Whether enable all or explicitly few brands as inventory |
 | brands | ArrayList<Int> |  no  | Brand uids in case of explicit criteria |

---


 
 
 #### [StoreCriteriaRule](#StoreCriteriaRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companies | ArrayList<Int> |  no  | list of company uids |
 | brands | ArrayList<Int> |  no  | list of brand uids |

---


 
 
 #### [InventoryStoreRule](#InventoryStoreRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | criteria | String |  no  | Whether enable all or explicitly few stores or use filter of brands and company as inventory stores |
 | rules | ArrayList<[StoreCriteriaRule](#StoreCriteriaRule)> |  no  | List of rules with company and brands uids. Used when critera is `filter` |
 | stores | ArrayList<Int> |  no  | List of store uids. Used when critera is `explicit` |

---


 
 
 #### [InventoryPaymentConfig](#InventoryPaymentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mode_of_payment | String |  no  |  |
 | source | String |  no  |  |

---


 
 
 #### [StorePriorityRule](#StorePriorityRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | storetype_order | ArrayList<String> |  no  |  |

---


 
 
 #### [ArticleAssignmentRule](#ArticleAssignmentRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | store_priority | [StorePriorityRule](#StorePriorityRule) |  no  |  |

---


 
 
 #### [InventoryArticleAssignment](#InventoryArticleAssignment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | post_order_reassignment | Boolean |  no  |  |
 | enforced_stores | ArrayList<Int> |  no  |  |
 | rules | [ArticleAssignmentRule](#ArticleAssignmentRule) |  no  |  |

---


 
 
 #### [CompanyAboutAddress](#CompanyAboutAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | Int |  no  |  |
 | address1 | String |  no  |  |
 | address2 | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | country | String |  no  |  |
 | address_type | String |  no  |  |

---


 
 
 #### [UserEmail](#UserEmail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean |  no  |  |
 | primary | Boolean |  no  |  |
 | verified | Boolean |  no  |  |
 | email | String |  no  |  |

---


 
 
 #### [UserPhoneNumber](#UserPhoneNumber)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean |  no  |  |
 | primary | Boolean |  no  |  |
 | verified | Boolean |  no  |  |
 | country_code | Int |  no  |  |
 | phone | String |  no  |  |

---


 
 
 #### [ApplicationInformation](#ApplicationInformation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | [InformationAddress](#InformationAddress) |  no  |  |
 | support | [InformationSupport](#InformationSupport) |  no  |  |
 | social_links | [SocialLinks](#SocialLinks) |  no  |  |
 | links | [Links](#Links) |  no  |  |
 | copyright_text | String |  no  |  |
 | _id | String |  no  |  |
 | business_highlights | [BusinessHighlights](#BusinessHighlights) |  no  |  |
 | application | String |  no  |  |
 | created_at | String |  no  |  |
 | updated_at | String |  no  |  |
 | __v | Int |  no  |  |

---


 
 
 #### [InformationAddress](#InformationAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | loc | String |  no  |  |
 | address_line | ArrayList<String> |  no  |  |
 | phone | [InformationPhone](#InformationPhone) |  no  |  |
 | city | String |  no  |  |
 | country | String |  no  |  |
 | pincode | Int |  no  |  |

---


 
 
 #### [InformationPhone](#InformationPhone)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  |  |
 | number | String |  no  |  |

---


 
 
 #### [InformationSupport](#InformationSupport)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | ArrayList<String> |  no  |  |
 | email | ArrayList<String> |  no  |  |
 | timing | String |  no  |  |

---


 
 
 #### [SocialLinks](#SocialLinks)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | facebook | [FacebookLink](#FacebookLink) |  no  |  |
 | instagram | [InstagramLink](#InstagramLink) |  no  |  |
 | twitter | [TwitterLink](#TwitterLink) |  no  |  |
 | pinterest | [PinterestLink](#PinterestLink) |  no  |  |
 | google_plus | [GooglePlusLink](#GooglePlusLink) |  no  |  |
 | youtube | [YoutubeLink](#YoutubeLink) |  no  |  |
 | linked_in | [LinkedInLink](#LinkedInLink) |  no  |  |
 | vimeo | [VimeoLink](#VimeoLink) |  no  |  |
 | blog_link | [BlogLink](#BlogLink) |  no  |  |

---


 
 
 #### [FacebookLink](#FacebookLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | icon | String |  no  |  |
 | link | String |  no  |  |

---


 
 
 #### [InstagramLink](#InstagramLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | icon | String |  no  |  |
 | link | String |  no  |  |

---


 
 
 #### [TwitterLink](#TwitterLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | icon | String |  no  |  |
 | link | String |  no  |  |

---


 
 
 #### [PinterestLink](#PinterestLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | icon | String |  no  |  |
 | link | String |  no  |  |

---


 
 
 #### [GooglePlusLink](#GooglePlusLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | icon | String |  no  |  |
 | link | String |  no  |  |

---


 
 
 #### [YoutubeLink](#YoutubeLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | icon | String |  no  |  |
 | link | String |  no  |  |

---


 
 
 #### [LinkedInLink](#LinkedInLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | icon | String |  no  |  |
 | link | String |  no  |  |

---


 
 
 #### [VimeoLink](#VimeoLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | icon | String |  no  |  |
 | link | String |  no  |  |

---


 
 
 #### [BlogLink](#BlogLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | icon | String |  no  |  |
 | link | String |  no  |  |

---


 
 
 #### [Links](#Links)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | link | String |  no  |  |

---


 
 
 #### [BusinessHighlights](#BusinessHighlights)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | title | String |  no  |  |
 | icon | String |  no  |  |
 | sub_title | String |  no  |  |

---


 
 
 #### [ApplicationDetail](#ApplicationDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | description | String? |  yes  |  |
 | logo | [SecureUrl](#SecureUrl)? |  yes  |  |
 | mobile_logo | [SecureUrl](#SecureUrl)? |  yes  |  |
 | favicon | [SecureUrl](#SecureUrl)? |  yes  |  |
 | banner | [SecureUrl](#SecureUrl)? |  yes  |  |
 | domain | [Domain](#Domain) |  no  |  |
 | domains | ArrayList<[Domain](#Domain)> |  no  |  |
 | _id | String |  no  |  |

---


 
 
 #### [CurrenciesResponse](#CurrenciesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Currency](#Currency)> |  no  |  |

---


 
 
 #### [StoreLatLong](#StoreLatLong)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | coordinates | ArrayList<Double> |  no  |  |

---


 
 
 #### [OptedStoreAddress](#OptedStoreAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | state | String |  no  |  |
 | address1 | String |  no  |  |
 | lat_long | [StoreLatLong](#StoreLatLong) |  no  |  |
 | address2 | String |  no  |  |
 | pincode | Int |  no  |  |
 | country | String |  no  |  |
 | city | String |  no  |  |

---


 
 
 #### [OrderingStore](#OrderingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | [OptedStoreAddress](#OptedStoreAddress) |  no  |  |
 | _id | String |  no  |  |
 | uid | Int |  no  |  |
 | name | String |  no  |  |
 | display_name | String |  no  |  |
 | store_type | String |  no  |  |
 | store_code | String |  no  |  |
 | pincode | Int |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [OrderingStores](#OrderingStores)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[OrderingStore](#OrderingStore)> |  no  |  |
 | deployed_stores | ArrayList<Int> |  no  |  |
 | all_stores | Boolean |  no  |  |
 | enabled | Boolean |  no  |  |
 | type | String |  no  |  |
 | _id | String |  no  |  |
 | app | String |  no  |  |
 | __v | Int |  no  |  |

---




 
 
 #### [Rule](#Rule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | Double |  no  |  |
 | max | Double |  no  |  |
 | discount_qty | Double |  no  |  |
 | value | Double |  no  |  |
 | min | Double |  no  |  |

---


 
 
 #### [BulkBundleRestriction](#BulkBundleRestriction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | multi_store_allowed | Boolean? |  yes  |  |

---


 
 
 #### [UsesRemaining](#UsesRemaining)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app | Int |  no  |  |
 | total | Int |  no  |  |
 | user | Int |  no  |  |

---


 
 
 #### [UsesRestriction](#UsesRestriction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | remaining | [UsesRemaining](#UsesRemaining) |  no  |  |
 | maximum | [UsesRemaining](#UsesRemaining) |  no  |  |

---


 
 
 #### [PaymentAllowValue](#PaymentAllowValue)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | Int |  no  |  |

---


 
 
 #### [PaymentModes](#PaymentModes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | types | ArrayList<String> |  no  |  |
 | networks | ArrayList<String> |  no  |  |
 | codes | ArrayList<String> |  no  |  |
 | uses | [PaymentAllowValue](#PaymentAllowValue) |  no  |  |

---


 
 
 #### [PaymentCodes](#PaymentCodes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pl | [PaymentModes](#PaymentModes) |  no  |  |
 | ps | [PaymentModes](#PaymentModes) |  no  |  |
 | upi | [PaymentModes](#PaymentModes) |  no  |  |
 | wl | [PaymentModes](#PaymentModes) |  no  |  |
 | qr | [PaymentModes](#PaymentModes) |  no  |  |
 | card | [PaymentModes](#PaymentModes) |  no  |  |
 | nb | [PaymentModes](#PaymentModes) |  no  |  |

---


 
 
 #### [PostOrder](#PostOrder)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cancellation_allowed | Boolean |  no  |  |
 | return_allowed | Boolean |  no  |  |

---


 
 
 #### [PriceRange](#PriceRange)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | Int |  no  |  |
 | max | Int |  no  |  |

---


 
 
 #### [Restrictions](#Restrictions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | coupon_allowed | Boolean |  no  |  |
 | bulk_bundle | [BulkBundleRestriction](#BulkBundleRestriction) |  no  |  |
 | uses | [UsesRestriction](#UsesRestriction) |  no  |  |
 | platforms | ArrayList<String> |  no  |  |
 | payments | [PaymentCodes](#PaymentCodes) |  no  |  |
 | post_order | [PostOrder](#PostOrder) |  no  |  |
 | ordering_stores | ArrayList<Int> |  no  |  |
 | price_range | [PriceRange](#PriceRange) |  no  |  |

---


 
 
 #### [Ownership](#Ownership)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payable_category | String? |  yes  |  |
 | payable_by | String? |  yes  |  |

---


 
 
 #### [State](#State)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | is_archived | Boolean |  no  |  |
 | is_public | Boolean |  no  |  |
 | is_display | Boolean |  no  |  |

---


 
 
 #### [CouponAction](#CouponAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | txn_mode | String |  no  |  |
 | action_date | String |  no  |  |

---


 
 
 #### [Validation](#Validation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user_registered_after | String |  no  |  |
 | anonymous | Boolean |  no  |  |
 | app_id | ArrayList<String> |  no  |  |

---


 
 
 #### [RuleDefinition](#RuleDefinition)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value_type | String? |  yes  |  |
 | auto_apply | Boolean |  no  |  |
 | scope | ArrayList<String> |  no  |  |
 | currency_code | String |  no  |  |
 | calculate_on | String? |  yes  |  |
 | is_exact | Boolean |  no  |  |
 | applicable_on | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [Identifier](#Identifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | category_id | ArrayList<Int> |  no  |  |
 | collection_id | ArrayList<String> |  no  |  |
 | company_id | ArrayList<Int> |  no  |  |
 | item_id | ArrayList<Int> |  no  |  |
 | brand_id | ArrayList<Int> |  no  |  |
 | user_id | ArrayList<String> |  no  |  |
 | article_id | ArrayList<String> |  no  |  |
 | store_id | ArrayList<Int> |  no  |  |

---


 
 
 #### [CouponSchedule](#CouponSchedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | next_schedule | ArrayList<HashMap<String,Any>> |  no  |  |
 | start | String |  no  |  |
 | duration | Int |  no  |  |
 | end | String |  no  |  |
 | cron | String |  no  |  |

---


 
 
 #### [DisplayMetaDict](#DisplayMetaDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | subtitle | String |  no  |  |

---


 
 
 #### [DisplayMeta](#DisplayMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | auto | [DisplayMetaDict](#DisplayMetaDict) |  no  |  |
 | title | String |  no  |  |
 | remove | [DisplayMetaDict](#DisplayMetaDict) |  no  |  |
 | apply | [DisplayMetaDict](#DisplayMetaDict) |  no  |  |
 | description | String |  no  |  |
 | subtitle | String |  no  |  |

---


 
 
 #### [CouponAuthor](#CouponAuthor)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | created_by | String |  no  |  |
 | modified_by | String |  no  |  |

---


 
 
 #### [Validity](#Validity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priority | Int |  no  |  |

---


 
 
 #### [CouponDateMeta](#CouponDateMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | created_on | String |  no  |  |
 | modified_on | String |  no  |  |

---


 
 
 #### [CouponAdd](#CouponAdd)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rule | ArrayList<[Rule](#Rule)>? |  yes  |  |
 | restrictions | [Restrictions](#Restrictions) |  no  |  |
 | ownership | [Ownership](#Ownership)? |  yes  |  |
 | state | [State](#State) |  no  |  |
 | action | [CouponAction](#CouponAction) |  no  |  |
 | validation | [Validation](#Validation) |  no  |  |
 | rule_definition | [RuleDefinition](#RuleDefinition)? |  yes  |  |
 | identifiers | [Identifier](#Identifier)? |  yes  |  |
 | _schedule | [CouponSchedule](#CouponSchedule) |  no  |  |
 | type_slug | String? |  yes  |  |
 | display_meta | [DisplayMeta](#DisplayMeta)? |  yes  |  |
 | tags | ArrayList<String> |  no  |  |
 | author | [CouponAuthor](#CouponAuthor) |  no  |  |
 | validity | [Validity](#Validity)? |  yes  |  |
 | code | String? |  yes  |  |
 | date_meta | [CouponDateMeta](#CouponDateMeta) |  no  |  |

---


 
 
 #### [CouponsResponse](#CouponsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [CouponAdd](#CouponAdd) |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [SuccessMessage](#SuccessMessage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [OperationErrorResponse](#OperationErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [CouponUpdate](#CouponUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rule | ArrayList<[Rule](#Rule)>? |  yes  |  |
 | restrictions | [Restrictions](#Restrictions) |  no  |  |
 | ownership | [Ownership](#Ownership)? |  yes  |  |
 | state | [State](#State) |  no  |  |
 | action | [CouponAction](#CouponAction) |  no  |  |
 | validation | [Validation](#Validation) |  no  |  |
 | rule_definition | [RuleDefinition](#RuleDefinition)? |  yes  |  |
 | identifiers | [Identifier](#Identifier)? |  yes  |  |
 | _schedule | [CouponSchedule](#CouponSchedule) |  no  |  |
 | type_slug | String? |  yes  |  |
 | display_meta | [DisplayMeta](#DisplayMeta)? |  yes  |  |
 | tags | ArrayList<String> |  no  |  |
 | author | [CouponAuthor](#CouponAuthor) |  no  |  |
 | validity | [Validity](#Validity)? |  yes  |  |
 | code | String? |  yes  |  |
 | date_meta | [CouponDateMeta](#CouponDateMeta) |  no  |  |

---


 
 
 #### [CouponPartialUpdate](#CouponPartialUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | schedule | [CouponSchedule](#CouponSchedule) |  no  |  |
 | archive | Boolean |  no  | Send true to unpublish coupon |

---




 
 
 #### [AppUser](#AppUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | active | Boolean |  no  |  |
 | application_id | String |  no  |  |
 | block_reason | String |  no  |  |
 | updated_at | String |  no  |  |
 | updated_by | String |  no  |  |
 | user_id | String |  no  |  |

---


 
 
 #### [E](#E)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | HashMap<String,Any> |  no  |  |
 | exception | String |  no  |  |
 | info | String |  no  |  |
 | message | String |  no  |  |
 | request_id | String |  no  |  |
 | stack_trace | String |  no  |  |
 | status | Int |  no  |  |

---


 
 
 #### [Giveaway](#Giveaway)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | _schedule | [Schedule](#Schedule) |  no  |  |
 | active | Boolean |  no  |  |
 | application_id | String |  no  |  |
 | audience | [RewardsAudience](#RewardsAudience) |  no  |  |
 | banner_image | [Asset](#Asset) |  no  |  |
 | created_at | String |  no  |  |
 | description | String |  no  |  |
 | name | String |  no  |  |
 | rule | [RewardsRule](#RewardsRule) |  no  |  |
 | title | String |  no  |  |
 | updated_at | String |  no  |  |

---


 
 
 #### [GiveawayResponse](#GiveawayResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Giveaway](#Giveaway)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [HistoryPretty](#HistoryPretty)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | application_id | String |  no  |  |
 | claimed | Boolean |  no  |  |
 | created_at | String |  no  |  |
 | expires_on | String |  no  |  |
 | points | Double |  no  |  |
 | remaining_points | Double |  no  |  |
 | text_1 | String |  no  |  |
 | text_2 | String |  no  |  |
 | text_3 | String |  no  |  |
 | txn_name | String |  no  |  |
 | updated_at | String |  no  |  |
 | user_id | String |  no  |  |

---


 
 
 #### [HistoryRes](#HistoryRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[HistoryPretty](#HistoryPretty)> |  no  |  |
 | page | [Page](#Page) |  no  |  |
 | points | Double |  no  |  |

---


 
 
 #### [Offer](#Offer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _schedule | [Schedule](#Schedule) |  no  |  |
 | active | Boolean |  no  |  |
 | application_id | String |  no  |  |
 | banner_image | [Asset](#Asset) |  no  |  |
 | created_at | String |  no  |  |
 | name | String |  no  |  |
 | rule | HashMap<String,Any> |  no  |  |
 | share | [ShareMessages](#ShareMessages) |  no  |  |
 | sub_text | String |  no  |  |
 | text | String |  no  |  |
 | type | String |  no  |  |
 | updated_at | String |  no  |  |
 | updated_by | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [Points](#Points)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | available | Double |  no  |  |

---


 
 
 #### [Referral](#Referral)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  |  |

---


 
 
 #### [RewardUser](#RewardUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | active | Boolean |  no  |  |
 | created_at | String |  no  |  |
 | referral | [Referral](#Referral) |  no  |  |
 | uid | Int |  no  |  |
 | updated_at | String |  no  |  |
 | user_block_reason | String |  no  |  |
 | user_id | String |  no  |  |

---


 
 
 #### [RewardsAudience](#RewardsAudience)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | header_user_id | String |  no  |  |
 | id | String |  no  |  |

---


 
 
 #### [RewardsRule](#RewardsRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | Double |  no  |  |

---


 
 
 #### [ShareMessages](#ShareMessages)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | facebook | String |  no  |  |
 | fallback | String |  no  |  |
 | message | String |  no  |  |
 | messenger | String |  no  |  |
 | sms | String |  no  |  |
 | text | String |  no  |  |
 | twitter | String |  no  |  |
 | whatsapp | String |  no  |  |

---


 
 
 #### [UserRes](#UserRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | points | [Points](#Points) |  no  |  |
 | user | [RewardUser](#RewardUser) |  no  |  |

---




 
 
 #### [StatGroup](#StatGroup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | url | String |  no  |  |
 | title | String |  no  |  |

---


 
 
 #### [StatsGroups](#StatsGroups)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | groups | ArrayList<[StatGroup](#StatGroup)> |  no  |  |

---


 
 
 #### [StatsGroupComponent](#StatsGroupComponent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | url | String |  no  |  |
 | title | String |  no  |  |
 | type | String |  no  |  |
 | filters | HashMap<String,Any> |  no  |  |

---


 
 
 #### [StatsGroupComponents](#StatsGroupComponents)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | components | ArrayList<[StatsGroupComponent](#StatsGroupComponent)> |  no  |  |

---


 
 
 #### [StatsRes](#StatsRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | title | String |  no  |  |
 | type | String |  no  |  |
 | data | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ReceivedAt](#ReceivedAt)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |

---


 
 
 #### [AbandonCartsDetail](#AbandonCartsDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | properties_cart_id | String |  no  |  |
 | context_traits_first_name | String |  no  |  |
 | context_traits_last_name | String |  no  |  |
 | context_traits_phone_number | String |  no  |  |
 | context_traits_email | String |  no  |  |
 | context_app_application_id | String |  no  |  |
 | properties_breakup_values_raw_total | String |  no  |  |
 | received_at | [ReceivedAt](#ReceivedAt) |  no  |  |

---


 
 
 #### [AbandonCartsList](#AbandonCartsList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[AbandonCartsDetail](#AbandonCartsDetail)> |  no  |  |
 | cart_total | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [AbandonCartDetail](#AbandonCartDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | user_id | String |  no  |  |
 | cart_value | String |  no  |  |
 | articles | ArrayList<HashMap<String,Any>> |  no  |  |
 | breakup | HashMap<String,Any> |  no  |  |
 | address | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ExportJobReq](#ExportJobReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marketplace_name | String |  no  |  |
 | start_time | String |  no  |  |
 | end_time | String |  no  |  |
 | event_type | String |  no  |  |
 | trace_id | String |  no  |  |

---


 
 
 #### [ExportJobRes](#ExportJobRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | job_id | String |  no  |  |

---


 
 
 #### [ExportJobStatusRes](#ExportJobStatusRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | job_id | String |  no  |  |
 | download_url | String |  no  |  |

---


 
 
 #### [GetLogsListReq](#GetLogsListReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marketplace_name | String |  no  |  |
 | start_date | String |  no  |  |
 | company_id | String |  no  |  |
 | end_date | String |  no  |  |

---


 
 
 #### [MkpLogsResp](#MkpLogsResp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start_time_iso | String |  no  |  |
 | end_time_iso | String |  no  |  |
 | event_type | String |  no  |  |
 | trace_id | String |  no  |  |
 | count | String |  no  |  |
 | status | String |  no  |  |

---


 
 
 #### [GetLogsListRes](#GetLogsListRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[MkpLogsResp](#MkpLogsResp)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [SearchLogReq](#SearchLogReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marketplace_name | String |  no  |  |
 | start_date | String |  no  |  |
 | company_id | String |  no  |  |
 | end_date | String |  no  |  |
 | identifier | String |  no  |  |
 | identifier_value | String |  no  |  |

---


 
 
 #### [LogInfo](#LogInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | status | String |  no  |  |
 | event_type | String |  no  |  |
 | marketplace_name | String |  no  |  |
 | event | String |  no  |  |
 | trace_id | String |  no  |  |
 | company_id | Double |  no  |  |
 | brand_id | Double |  no  |  |
 | store_code | String |  no  |  |
 | store_id | Double |  no  |  |
 | item_id | Double |  no  |  |
 | article_id | String |  no  |  |
 | seller_identifier | String |  no  |  |

---


 
 
 #### [SearchLogRes](#SearchLogRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[LogInfo](#LogInfo)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---




 
 
 #### [ValidityObject](#ValidityObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start | String? |  yes  |  |
 | end | String? |  yes  |  |

---


 
 
 #### [CreateUpdateDiscount](#CreateUpdateDiscount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | company_id | Int? |  yes  |  |
 | is_active | Boolean? |  yes  |  |
 | app_ids | ArrayList<String>? |  yes  |  |
 | job_type | String? |  yes  |  |
 | discount_type | String? |  yes  |  |
 | discount_level | String? |  yes  |  |
 | value | Int |  no  |  |
 | file_path | String |  no  |  |
 | brand_ids | ArrayList<Int> |  no  |  |
 | store_ids | ArrayList<Int> |  no  |  |
 | validity | [ValidityObject](#ValidityObject)? |  yes  |  |

---


 
 
 #### [DiscountJob](#DiscountJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | company_id | Int? |  yes  |  |
 | is_active | Boolean? |  yes  |  |
 | app_ids | ArrayList<String> |  no  |  |
 | job_type | String |  no  |  |
 | discount_type | String |  no  |  |
 | discount_level | String |  no  |  |
 | value | Int |  no  |  |
 | file_path | String |  no  |  |
 | brand_ids | ArrayList<Int> |  no  |  |
 | store_ids | ArrayList<Int> |  no  |  |
 | validity | [ValidityObject](#ValidityObject)? |  yes  |  |
 | created_on | String? |  yes  |  |
 | modified_on | String? |  yes  |  |
 | created_by | [UserDetails](#UserDetails)? |  yes  |  |
 | modified_by | [UserDetails](#UserDetails)? |  yes  |  |
 | meta | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ListOrCalender](#ListOrCalender)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[DiscountJob](#DiscountJob)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [FileJobResponse](#FileJobResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stage | String? |  yes  |  |
 | total | Int? |  yes  |  |
 | failed | Int? |  yes  |  |
 | company_id | Int? |  yes  |  |
 | body | HashMap<String,Any> |  no  |  |
 | type | String? |  yes  |  |
 | file_type | String? |  yes  |  |

---


 
 
 #### [DownloadFileJob](#DownloadFileJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand_ids | ArrayList<Int> |  no  |  |
 | store_ids | ArrayList<Int> |  no  |  |

---


 
 
 #### [CancelJobResponse](#CancelJobResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [UserDetails](#UserDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |
 | user_id | String? |  yes  |  |

---


 
 
 #### [BadRequestObject](#BadRequestObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---




 
 
 #### [AddProxyReq](#AddProxyReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attached_path | String |  no  | Proxy path slug |
 | proxy_url | String |  no  | Proxied url |

---


 
 
 #### [AddProxyResponse](#AddProxyResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | _id | String |  no  |  |
 | attached_path | String |  no  |  |
 | proxy_url | String |  no  |  |
 | company_id | String |  no  |  |
 | application_id | String |  no  |  |
 | extension_id | String |  no  |  |
 | created_at | String |  no  |  |
 | modified_at | String |  no  |  |

---


 
 
 #### [ApiError](#ApiError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  |  |
 | message | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |

---


 
 
 #### [RemoveProxyResponse](#RemoveProxyResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | data | HashMap<String,Any> |  no  |  |

---




 
 
 #### [EventConfig](#EventConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | event_name | String |  no  |  |
 | event_type | String |  no  |  |
 | version | String |  no  |  |
 | display_name | String |  no  |  |
 | description | String |  no  |  |
 | created_on | String |  no  |  |

---


 
 
 #### [EventConfigList](#EventConfigList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[EventConfig](#EventConfig)> |  no  |  |

---


 
 
 #### [SubscriberConfigList](#SubscriberConfigList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subscribers | ArrayList<[SubscriberConfig](#SubscriberConfig)> |  no  |  |

---


 
 
 #### [EventProcessedStatus](#EventProcessedStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | subscriber_id | String |  no  |  |
 | attempt | Int |  no  |  |
 | response_code | String |  no  |  |
 | response_message | String |  no  |  |
 | created_on | String |  no  |  |
 | processed_on | String |  no  |  |
 | status | Boolean |  no  |  |

---


 
 
 #### [EventPayload](#EventPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | event_trace_id | String |  no  |  |
 | event_company_id | Int |  no  |  |
 | event_application_id | String |  no  |  |
 | event_extension_id | String |  no  |  |
 | event_name | String |  no  |  |
 | status | Boolean |  no  |  |

---


 
 
 #### [SubscriberConfig](#SubscriberConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | webhook_url | String |  no  |  |
 | company_id | Int |  no  |  |
 | application_id | String |  no  |  |
 | extension_id | String |  no  |  |
 | status | String |  no  |  |
 | auth_meta | [AuthMeta](#AuthMeta) |  no  |  |
 | created_on | String |  no  |  |
 | updated_on | String |  no  |  |
 | subscriber_event_mapping | [SubscriberEvent](#SubscriberEvent) |  no  |  |

---


 
 
 #### [SubscriberEvent](#SubscriberEvent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | subscriber_id | Int |  no  |  |
 | event_id | Int |  no  |  |
 | created_date | String |  no  |  |

---


 
 
 #### [AuthMeta](#AuthMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | username | String |  no  |  |
 | password | String |  no  |  |

---


