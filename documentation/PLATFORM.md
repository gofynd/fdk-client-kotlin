

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
  * Methods
    * [getLocations](#getlocations)
    

* ## [Lead](#Lead)
  * Methods
    * [getTickets](#gettickets)
    * [createTicket](#createticket)
    * [getTickets](#gettickets)
    * [getTicket](#getticket)
    * [editTicket](#editticket)
    * [getTicket](#getticket)
    * [editTicket](#editticket)
    * [createHistory](#createhistory)
    * [getTicketHistory](#gettickethistory)
    * [getFeedbacks](#getfeedbacks)
    * [submitFeedback](#submitfeedback)
    * [createHistory](#createhistory)
    * [getTicketHistory](#gettickethistory)
    * [getCustomForm](#getcustomform)
    * [editCustomForm](#editcustomform)
    * [getCustomForms](#getcustomforms)
    * [createCustomForm](#createcustomform)
    * [getTokenForVideoRoom](#gettokenforvideoroom)
    * [getTokenForVideoRoom](#gettokenforvideoroom)
    * [getVideoParticipants](#getvideoparticipants)
    * [getVideoParticipants](#getvideoparticipants)
    * [openVideoRoom](#openvideoroom)
    * [closeVideoRoom](#closevideoroom)
    

* ## [Feedback](#Feedback)
  * Methods
    * [getAttributes](#getattributes)
    * [getCustomerReviews](#getcustomerreviews)
    * [updateApprove](#updateapprove)
    * [getHistory](#gethistory)
    * [getApplicationTemplates](#getapplicationtemplates)
    * [createTemplate](#createtemplate)
    * [getTemplateById](#gettemplatebyid)
    * [updateTemplate](#updatetemplate)
    * [updateTemplateStatus](#updatetemplatestatus)
    

* ## [Theme](#Theme)
  * Methods
    * [getAllPages](#getallpages)
    * [createPage](#createpage)
    * [updateMultiplePages](#updatemultiplepages)
    * [getPage](#getpage)
    * [updatePage](#updatepage)
    * [deletePage](#deletepage)
    * [getThemeLibrary](#getthemelibrary)
    * [addToThemeLibrary](#addtothemelibrary)
    * [applyTheme](#applytheme)
    * [isUpgradable](#isupgradable)
    * [upgradeTheme](#upgradetheme)
    * [getPublicThemes](#getpublicthemes)
    * [createTheme](#createtheme)
    * [getAppliedTheme](#getappliedtheme)
    * [getFonts](#getfonts)
    * [getThemeById](#getthemebyid)
    * [updateTheme](#updatetheme)
    * [deleteTheme](#deletetheme)
    * [getThemeForPreview](#getthemeforpreview)
    * [publishTheme](#publishtheme)
    * [unpublishTheme](#unpublishtheme)
    * [archiveTheme](#archivetheme)
    * [unarchiveTheme](#unarchivetheme)
    

* ## [User](#User)
  * Methods
    * [getCustomers](#getcustomers)
    * [searchUsers](#searchusers)
    * [createUser](#createuser)
    * [updateUser](#updateuser)
    * [createUserSession](#createusersession)
    * [getPlatformConfig](#getplatformconfig)
    * [updatePlatformConfig](#updateplatformconfig)
    

* ## [Content](#Content)
  * Methods
    * [getAnnouncementsList](#getannouncementslist)
    * [createAnnouncement](#createannouncement)
    * [getAnnouncementById](#getannouncementbyid)
    * [updateAnnouncement](#updateannouncement)
    * [updateAnnouncementSchedule](#updateannouncementschedule)
    * [deleteAnnouncement](#deleteannouncement)
    * [createBlog](#createblog)
    * [getBlogs](#getblogs)
    * [updateBlog](#updateblog)
    * [deleteBlog](#deleteblog)
    * [getComponentById](#getcomponentbyid)
    * [getFaqCategories](#getfaqcategories)
    * [getFaqCategoryBySlugOrId](#getfaqcategorybyslugorid)
    * [createFaqCategory](#createfaqcategory)
    * [updateFaqCategory](#updatefaqcategory)
    * [deleteFaqCategory](#deletefaqcategory)
    * [getFaqsByCategoryIdOrSlug](#getfaqsbycategoryidorslug)
    * [addFaq](#addfaq)
    * [updateFaq](#updatefaq)
    * [deleteFaq](#deletefaq)
    * [getFaqByIdOrSlug](#getfaqbyidorslug)
    * [getLandingPages](#getlandingpages)
    * [createLandingPage](#createlandingpage)
    * [updateLandingPage](#updatelandingpage)
    * [deleteLandingPage](#deletelandingpage)
    * [getLegalInformation](#getlegalinformation)
    * [updateLegalInformation](#updatelegalinformation)
    * [getNavigations](#getnavigations)
    * [createNavigation](#createnavigation)
    * [getDefaultNavigations](#getdefaultnavigations)
    * [getNavigationBySlug](#getnavigationbyslug)
    * [updateNavigation](#updatenavigation)
    * [deleteNavigation](#deletenavigation)
    * [getPageMeta](#getpagemeta)
    * [getPageSpec](#getpagespec)
    * [createPage](#createpage)
    * [getPages](#getpages)
    * [createPagePreview](#createpagepreview)
    * [updatePagePreview](#updatepagepreview)
    * [updatePage](#updatepage)
    * [deletePage](#deletepage)
    * [getPageBySlug](#getpagebyslug)
    * [getSEOConfiguration](#getseoconfiguration)
    * [updateSEOConfiguration](#updateseoconfiguration)
    * [getSlideshows](#getslideshows)
    * [createSlideshow](#createslideshow)
    * [getSlideshowBySlug](#getslideshowbyslug)
    * [updateSlideshow](#updateslideshow)
    * [deleteSlideshow](#deleteslideshow)
    * [getSupportInformation](#getsupportinformation)
    * [updateSupportInformation](#updatesupportinformation)
    * [updateInjectableTag](#updateinjectabletag)
    * [deleteAllInjectableTags](#deleteallinjectabletags)
    * [getInjectableTags](#getinjectabletags)
    * [addInjectableTag](#addinjectabletag)
    * [removeInjectableTag](#removeinjectabletag)
    * [editInjectableTag](#editinjectabletag)
    

* ## [Assignment](#Assignment)
  * Methods
    * [createPickupLocation](#createpickuplocation)
    * [getPickupLocation](#getpickuplocation)
    * [updatePickupLocation](#updatepickuplocation)
    * [getPickupLocationById](#getpickuplocationbyid)
    * [createPickupConfiguration](#createpickupconfiguration)
    * [getPickupConfiguration](#getpickupconfiguration)
    * [getAllocationConfiguration](#getallocationconfiguration)
    * [createAllocationConfiguration](#createallocationconfiguration)
    * [updateAllocationConfiguration](#updateallocationconfiguration)
    * [getAllocationLocations](#getallocationlocations)
    * [getAllocationLocationById](#getallocationlocationbyid)
    * [updateAllocationLocation](#updateallocationlocation)
    * [createAllocationLocation](#createallocationlocation)
    * [getDestinationZones](#getdestinationzones)
    * [postDestinationZone](#postdestinationzone)
    * [getDestinationZoneById](#getdestinationzonebyid)
    * [updateDestinationZone](#updatedestinationzone)
    

* ## [Billing](#Billing)
  * Methods
    * [createSubscriptionCharge](#createsubscriptioncharge)
    * [getSubscriptionCharge](#getsubscriptioncharge)
    * [cancelSubscriptionCharge](#cancelsubscriptioncharge)
    * [getInvoices](#getinvoices)
    * [getInvoiceById](#getinvoicebyid)
    * [getCustomerDetail](#getcustomerdetail)
    * [upsertCustomerDetail](#upsertcustomerdetail)
    * [getSubscription](#getsubscription)
    * [getFeatureLimitConfig](#getfeaturelimitconfig)
    * [activateSubscriptionPlan](#activatesubscriptionplan)
    * [cancelSubscriptionPlan](#cancelsubscriptionplan)
    

* ## [Communication](#Communication)
  * Methods
    * [getCampaigns](#getcampaigns)
    * [createCampaign](#createcampaign)
    * [getCampaignById](#getcampaignbyid)
    * [updateCampaignById](#updatecampaignbyid)
    * [getStatsOfCampaignById](#getstatsofcampaignbyid)
    * [getAudiences](#getaudiences)
    * [createAudience](#createaudience)
    * [getBigqueryHeaders](#getbigqueryheaders)
    * [getAudienceById](#getaudiencebyid)
    * [updateAudienceById](#updateaudiencebyid)
    * [getNSampleRecordsFromCsv](#getnsamplerecordsfromcsv)
    * [getEmailProviders](#getemailproviders)
    * [createEmailProvider](#createemailprovider)
    * [getEmailProviderById](#getemailproviderbyid)
    * [updateEmailProviderById](#updateemailproviderbyid)
    * [getEmailTemplates](#getemailtemplates)
    * [createEmailTemplate](#createemailtemplate)
    * [getSystemEmailTemplates](#getsystememailtemplates)
    * [getEmailTemplateById](#getemailtemplatebyid)
    * [updateEmailTemplateById](#updateemailtemplatebyid)
    * [deleteEmailTemplateById](#deleteemailtemplatebyid)
    * [getEventSubscriptions](#geteventsubscriptions)
    * [getJobs](#getjobs)
    * [triggerCampaignJob](#triggercampaignjob)
    * [getJobLogs](#getjoblogs)
    * [getCommunicationLogs](#getcommunicationlogs)
    * [getSystemNotifications](#getsystemnotifications)
    * [getSmsProviders](#getsmsproviders)
    * [createSmsProvider](#createsmsprovider)
    * [getSmsProviderById](#getsmsproviderbyid)
    * [updateSmsProviderById](#updatesmsproviderbyid)
    * [getSmsTemplates](#getsmstemplates)
    * [createSmsTemplate](#createsmstemplate)
    * [getSmsTemplateById](#getsmstemplatebyid)
    * [updateSmsTemplateById](#updatesmstemplatebyid)
    * [deleteSmsTemplateById](#deletesmstemplatebyid)
    * [getSystemSystemTemplates](#getsystemsystemtemplates)
    

* ## [Payment](#Payment)
  * Methods
    * [getBrandPaymentGatewayConfig](#getbrandpaymentgatewayconfig)
    * [saveBrandPaymentGatewayConfig](#savebrandpaymentgatewayconfig)
    * [updateBrandPaymentGatewayConfig](#updatebrandpaymentgatewayconfig)
    * [getPaymentModeRoutes](#getpaymentmoderoutes)
    * [getAllPayouts](#getallpayouts)
    * [savePayout](#savepayout)
    * [updatePayout](#updatepayout)
    * [activateAndDectivatePayout](#activateanddectivatepayout)
    * [deletePayout](#deletepayout)
    * [getSubscriptionPaymentMethod](#getsubscriptionpaymentmethod)
    * [deleteSubscriptionPaymentMethod](#deletesubscriptionpaymentmethod)
    * [getSubscriptionConfig](#getsubscriptionconfig)
    * [saveSubscriptionSetupIntent](#savesubscriptionsetupintent)
    * [addBeneficiaryDetails](#addbeneficiarydetails)
    * [verifyIfscCode](#verifyifsccode)
    * [getUserOrderBeneficiaries](#getuserorderbeneficiaries)
    * [getUserBeneficiaries](#getuserbeneficiaries)
    

* ## [Order](#Order)
  * Methods
    * [shipmentStatusUpdate](#shipmentstatusupdate)
    * [activityStatus](#activitystatus)
    * [storeProcessShipmentUpdate](#storeprocessshipmentupdate)
    * [checkRefund](#checkrefund)
    * [getOrdersByCompanyId](#getordersbycompanyid)
    * [getOrderDetails](#getorderdetails)
    * [getPicklistOrdersByCompanyId](#getpicklistordersbycompanyid)
    * [trackShipmentPlatform](#trackshipmentplatform)
    * [trackOrder](#trackorder)
    * [failedOrders](#failedorders)
    * [reprocessOrder](#reprocessorder)
    * [updateShipment](#updateshipment)
    * [getPlatformShipmentReasons](#getplatformshipmentreasons)
    * [getShipmentTrackDetails](#getshipmenttrackdetails)
    * [getShipmentAddress](#getshipmentaddress)
    * [updateShipmentAddress](#updateshipmentaddress)
    * [getPing](#getping)
    * [voiceCallback](#voicecallback)
    * [voiceClickToCall](#voiceclicktocall)
    

* ## [Catalog](#Catalog)
  * Methods
    * [deleteSearchKeywords](#deletesearchkeywords)
    * [getSearchKeywords](#getsearchkeywords)
    * [updateSearchKeywords](#updatesearchkeywords)
    * [createCustomKeyword](#createcustomkeyword)
    * [getAllSearchKeyword](#getallsearchkeyword)
    * [deleteAutocompleteKeyword](#deleteautocompletekeyword)
    * [getAutocompleteKeywordDetail](#getautocompletekeyworddetail)
    * [updateAutocompleteKeyword](#updateautocompletekeyword)
    * [createCustomAutocompleteRule](#createcustomautocompleterule)
    * [getAutocompleteConfig](#getautocompleteconfig)
    * [createProductBundle](#createproductbundle)
    * [getProductBundle](#getproductbundle)
    * [getProductBundleDetail](#getproductbundledetail)
    * [updateProductBundle](#updateproductbundle)
    * [createSizeGuide](#createsizeguide)
    * [getSizeGuides](#getsizeguides)
    * [getSizeGuide](#getsizeguide)
    * [updateSizeGuide](#updatesizeguide)
    * [getCatalogConfiguration](#getcatalogconfiguration)
    * [createConfigurationProductListing](#createconfigurationproductlisting)
    * [getConfigurations](#getconfigurations)
    * [createConfigurationByType](#createconfigurationbytype)
    * [getConfigurationByType](#getconfigurationbytype)
    * [getQueryFilters](#getqueryfilters)
    * [createCollection](#createcollection)
    * [getAllCollections](#getallcollections)
    * [getCollectionDetail](#getcollectiondetail)
    * [deleteCollection](#deletecollection)
    * [updateCollection](#updatecollection)
    * [addCollectionItems](#addcollectionitems)
    * [getCollectionItems](#getcollectionitems)
    * [getCatalogInsights](#getcataloginsights)
    * [getSellerInsights](#getsellerinsights)
    * [createMarketplaceOptin](#createmarketplaceoptin)
    * [getMarketplaceOptinDetail](#getmarketplaceoptindetail)
    * [getCompanyDetail](#getcompanydetail)
    * [getCompanyBrandDetail](#getcompanybranddetail)
    * [getCompanyMetrics](#getcompanymetrics)
    * [getStoreDetail](#getstoredetail)
    * [getGenderAttribute](#getgenderattribute)
    * [listProductTemplateCategories](#listproducttemplatecategories)
    * [listDepartmentsData](#listdepartmentsdata)
    * [getDepartmentData](#getdepartmentdata)
    * [listProductTemplate](#listproducttemplate)
    * [validateProductTemplate](#validateproducttemplate)
    * [downloadProductTemplateViews](#downloadproducttemplateviews)
    * [downloadProductTemplateView](#downloadproducttemplateview)
    * [validateProductTemplateSchema](#validateproducttemplateschema)
    * [listHSNCodes](#listhsncodes)
    * [listProductTemplateExportDetails](#listproducttemplateexportdetails)
    * [listTemplateBrandTypeValues](#listtemplatebrandtypevalues)
    * [createCategories](#createcategories)
    * [listCategories](#listcategories)
    * [getCategoryData](#getcategorydata)
    * [updateCategory](#updatecategory)
    * [createProduct](#createproduct)
    * [getProducts](#getproducts)
    * [deleteProduct](#deleteproduct)
    * [getProduct](#getproduct)
    * [editProduct](#editproduct)
    * [getProductValidation](#getproductvalidation)
    * [getProductSize](#getproductsize)
    * [updateProductAssetsInBulk](#updateproductassetsinbulk)
    * [getProductBulkUploadHistory](#getproductbulkuploadhistory)
    * [deleteProductBulkJob](#deleteproductbulkjob)
    * [createProductsInBulk](#createproductsinbulk)
    * [getCompanyTags](#getcompanytags)
    * [createProductAssetsInBulk](#createproductassetsinbulk)
    * [getProductAssetsInBulk](#getproductassetsinbulk)
    * [deleteSize](#deletesize)
    * [addInventory](#addinventory)
    * [getInventoryBySize](#getinventorybysize)
    * [getInventoryBySizeIdentifier](#getinventorybysizeidentifier)
    * [deleteInventory](#deleteinventory)
    * [createBulkInventoryJob](#createbulkinventoryjob)
    * [getInventoryBulkUploadHistory](#getinventorybulkuploadhistory)
    * [deleteBulkInventoryJob](#deletebulkinventoryjob)
    * [createBulkInventory](#createbulkinventory)
    * [createInventoryExportJob](#createinventoryexportjob)
    * [getInventoryExport](#getinventoryexport)
    * [exportInventoryConfig](#exportinventoryconfig)
    * [createHsnCode](#createhsncode)
    * [getAllHsnCodes](#getallhsncodes)
    * [getHsnCode](#gethsncode)
    * [updateHsnCode](#updatehsncode)
    * [bulkHsnCode](#bulkhsncode)
    * [getApplicationBrands](#getapplicationbrands)
    * [getDepartments](#getdepartments)
    * [getCategories](#getcategories)
    * [getAppicationProducts](#getappicationproducts)
    * [getProductDetailBySlug](#getproductdetailbyslug)
    

* ## [CompanyProfile](#CompanyProfile)
  * Methods
    * [cbsOnboardGet](#cbsonboardget)
    * [updateCompany](#updatecompany)
    * [getCompanyMetrics](#getcompanymetrics)
    * [getBrand](#getbrand)
    * [editBrand](#editbrand)
    * [createBrand](#createbrand)
    * [createCompanyBrandMapping](#createcompanybrandmapping)
    * [getBrands](#getbrands)
    * [createLocation](#createlocation)
    * [getLocations](#getlocations)
    * [getLocationDetail](#getlocationdetail)
    * [updateLocation](#updatelocation)
    * [createLocationBulk](#createlocationbulk)
    

* ## [FileStorage](#FileStorage)
  * Methods
    * [startUpload](#startupload)
    * [completeUpload](#completeupload)
    * [appStartUpload](#appstartupload)
    * [appCompleteUpload](#appcompleteupload)
    * [getSignUrls](#getsignurls)
    * [copyFiles](#copyfiles)
    * [appCopyFiles](#appcopyfiles)
    * [browse](#browse)
    * [browse](#browse)
    * [proxy](#proxy)
    

* ## [Share](#Share)
  * Methods
    * [createShortLink](#createshortlink)
    * [getShortLinks](#getshortlinks)
    * [getShortLinkByHash](#getshortlinkbyhash)
    * [updateShortLinkById](#updateshortlinkbyid)
    

* ## [Inventory](#Inventory)
  * Methods
    * [getJobsByCompany](#getjobsbycompany)
    * [updateJob](#updatejob)
    * [createJob](#createjob)
    * [getJobByCompanyAndIntegration](#getjobbycompanyandintegration)
    * [getJobConfigDefaults](#getjobconfigdefaults)
    * [getJobByCode](#getjobbycode)
    * [getJobCodeMetrics](#getjobcodemetrics)
    * [getJobCodesByCompanyAndIntegration](#getjobcodesbycompanyandintegration)
    

* ## [Configuration](#Configuration)
  * Methods
    * [getBuildConfig](#getbuildconfig)
    * [updateBuildConfig](#updatebuildconfig)
    * [getPreviousVersions](#getpreviousversions)
    * [getAppFeatures](#getappfeatures)
    * [updateAppFeatures](#updateappfeatures)
    * [getAppBasicDetails](#getappbasicdetails)
    * [updateAppBasicDetails](#updateappbasicdetails)
    * [getAppContactInfo](#getappcontactinfo)
    * [updateAppContactInfo](#updateappcontactinfo)
    * [getAppApiTokens](#getappapitokens)
    * [updateAppApiTokens](#updateappapitokens)
    * [getAppCompanies](#getappcompanies)
    * [getAppStores](#getappstores)
    * [getInventoryConfig](#getinventoryconfig)
    * [updateInventoryConfig](#updateinventoryconfig)
    * [partiallyUpdateInventoryConfig](#partiallyupdateinventoryconfig)
    * [getAppCurrencyConfig](#getappcurrencyconfig)
    * [updateAppCurrencyConfig](#updateappcurrencyconfig)
    * [getOrderingStoresByFilter](#getorderingstoresbyfilter)
    * [updateOrderingStoreConfig](#updateorderingstoreconfig)
    * [getDomains](#getdomains)
    * [addDomain](#adddomain)
    * [removeDomainById](#removedomainbyid)
    * [changeDomainType](#changedomaintype)
    * [getDomainStatus](#getdomainstatus)
    * [createApplication](#createapplication)
    * [getApplications](#getapplications)
    * [getApplicationById](#getapplicationbyid)
    * [getCurrencies](#getcurrencies)
    * [getDomainAvailibility](#getdomainavailibility)
    * [getIntegrationById](#getintegrationbyid)
    * [getAvailableOptIns](#getavailableoptins)
    * [getSelectedOptIns](#getselectedoptins)
    * [getIntegrationLevelConfig](#getintegrationlevelconfig)
    * [getIntegrationByLevelId](#getintegrationbylevelid)
    * [getLevelActiveIntegrations](#getlevelactiveintegrations)
    * [getBrandsByCompany](#getbrandsbycompany)
    * [getCompanyByBrands](#getcompanybybrands)
    * [getStoreByBrands](#getstorebybrands)
    * [getOtherSellerApplications](#getothersellerapplications)
    * [getOtherSellerApplicationById](#getothersellerapplicationbyid)
    * [optOutFromApplication](#optoutfromapplication)
    

* ## [Cart](#Cart)
  * Methods
    * [getCoupons](#getcoupons)
    * [createCoupon](#createcoupon)
    * [getCouponById](#getcouponbyid)
    * [updateCoupon](#updatecoupon)
    * [updateCouponPartially](#updatecouponpartially)
    

* ## [Rewards](#Rewards)
  * Methods
    * [getGiveaways](#getgiveaways)
    * [createGiveaway](#creategiveaway)
    * [getGiveawayByID](#getgiveawaybyid)
    * [updateGiveaway](#updategiveaway)
    * [getOffers](#getoffers)
    * [getOfferByName](#getofferbyname)
    * [updateOfferByName](#updateofferbyname)
    * [getUserAvailablePoints](#getuseravailablepoints)
    * [updateUserStatus](#updateuserstatus)
    * [getUserPointsHistory](#getuserpointshistory)
    

* ## [Analytics](#Analytics)
  * Methods
    * [getStatiscticsGroups](#getstatiscticsgroups)
    * [getStatiscticsGroupComponents](#getstatiscticsgroupcomponents)
    * [getComponentStatsCSV](#getcomponentstatscsv)
    * [getComponentStatsPDF](#getcomponentstatspdf)
    * [getComponentStats](#getcomponentstats)
    * [getAbandonCartList](#getabandoncartlist)
    * [getAbandonCartsCSV](#getabandoncartscsv)
    * [getAbandonCartDetail](#getabandoncartdetail)
    * [createExportJob](#createexportjob)
    * [getExportJobStatus](#getexportjobstatus)
    * [getLogsList](#getlogslist)
    * [searchLogs](#searchlogs)
    

* ## [Discount](#Discount)
  * Methods
    * [getDiscounts](#getdiscounts)
    * [createDiscount](#creatediscount)
    * [getDiscount](#getdiscount)
    * [updateDiscount](#updatediscount)
    * [validateDiscountFile](#validatediscountfile)
    * [downloadDiscountFile](#downloaddiscountfile)
    * [getValidationJob](#getvalidationjob)
    * [cancelValidationJob](#cancelvalidationjob)
    * [getDownloadJob](#getdownloadjob)
    * [cancelDownloadJob](#canceldownloadjob)
    

* ## [Partner](#Partner)
  * Methods
    * [addProxyPath](#addproxypath)
    * [removeProxyPath](#removeproxypath)
    

* ## [Webhook](#Webhook)
  * Methods
    * [getSubscribersByCompanyAndEventId](#getsubscribersbycompanyandeventid)
    * [registerSubscriberToEvent](#registersubscribertoevent)
    * [updateSubscriberConfig](#updatesubscriberconfig)
    

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
 | phoneCode | String |  no  |  |
 | type | String |  no  |  |
 | uid | Int |  no  |  |
 | v | Int |  no  |  |
 | id | String |  no  |  |
 | defaultCurrency | [LocationDefaultCurrency](#LocationDefaultCurrency) |  no  |  |
 | defaultLanguage | [LocationDefaultLanguage](#LocationDefaultLanguage) |  no  |  |

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
 | itemTotal | Int |  no  |  |
 | nextId | String |  no  |  |
 | hasPrevious | Boolean |  no  |  |
 | hasNext | Boolean |  no  |  |
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
 | headerImage | String |  no  | Header image that is to be shown for the form |
 | priority | Any? |  yes  | Describes the priority of the tickets created by the form |
 | shouldNotify | Boolean |  no  | Indicates if staff should be notified when a response is received |
 | successMessage | String |  no  | Success message that will be shown on submission |
 | pollForAssignment | [PollForAssignment](#PollForAssignment) |  no  | Describes how polling will be done for the tickets createds |

---


 
 
 #### [EditCustomFormPayload](#EditCustomFormPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  | Title for the form |
 | inputs | ArrayList<HashMap<String,Any>>? |  yes  | List of all the form components |
 | description | String |  no  | Description of the form |
 | priority | Any? |  yes  | Describes the priority of the tickets created by the form |
 | headerImage | String |  no  | Header image that is to be shown for the form |
 | shouldNotify | Boolean |  no  | Indicates if staff should be notified when a response is received |
 | loginRequired | Boolean |  no  | Denotes if login is required to make a form response submission |
 | successMessage | String |  no  | Success message that will be shown on submission |
 | pollForAssignment | [PollForAssignment](#PollForAssignment) |  no  | Describes how polling will be done for the tickets createds |

---


 
 
 #### [EditTicketPayload](#EditTicketPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | content | [TicketContent](#TicketContent) |  no  | Ticket conetent details |
 | category | String |  no  | Category assigned to the ticket |
 | subCategory | String |  no  | Sub-category assigned to the ticket |
 | source | String |  no  | Denotes if the ticket was created at company or application level |
 | status | String |  no  | Denotes in what state is the ticket |
 | priority | Any |  no  | Denotes the priority of ticket |
 | assignedTo | [AgentChangePayload](#AgentChangePayload) |  no  | Details of support staff to whom ticket is assigned |
 | tags | ArrayList<String> |  no  | Tags relevant to ticket |

---


 
 
 #### [AgentChangePayload](#AgentChangePayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | agentId | String? |  yes  | Agent's unique ID |

---


 
 
 #### [CreateVideoRoomResponse](#CreateVideoRoomResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uniqueName | String? |  yes  | Video Room's unique name |

---


 
 
 #### [CloseVideoRoomResponse](#CloseVideoRoomResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  | Denotes if operation was successfully |

---


 
 
 #### [CreateVideoRoomPayload](#CreateVideoRoomPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uniqueName | String? |  yes  | Ticket id |
 | notify | ArrayList<[NotifyUser](#NotifyUser)> |  no  | List of people to be notified |

---


 
 
 #### [NotifyUser](#NotifyUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String? |  yes  | Country code |
 | phoneNumber | String? |  yes  | Phone number |

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
 | accessToken | String? |  yes  | Access token to be used for video room |

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
 | countryCode | Int |  no  | Country code |

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
 | applicationId | String |  no  | Application ID related to the ticket |
 | companyId | String? |  yes  | Company ID related to the ticket |

---


 
 
 #### [CreatedOn](#CreatedOn)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userAgent | String? |  yes  | Useragent details |

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
 | createdBy | HashMap<String,Any> |  no  | Creator of the ticket |
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
 | subCategories | ArrayList<[TicketSubCategory](#TicketSubCategory)> |  no  | Sub-category related to the category |
 | feedbackForm | [TicketFeedbackForm](#TicketFeedbackForm) |  no  | Feedback form of category used to submit ticket feedback |

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
 | formResponse | HashMap<String,Any> |  no  | Key-value pairs of all the form fields and their response |

---


 
 
 #### [SubmitButton](#SubmitButton)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  | Title for submit button |
 | titleColor | String? |  yes  | Title color submit button |
 | backgroundColor | String? |  yes  | Color for submit button |

---


 
 
 #### [PollForAssignment](#PollForAssignment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | duration | Double? |  yes  | Duration for polling of staff |
 | message | String? |  yes  | Message for polling |
 | successMessage | String? |  yes  | Message for successful polling |
 | failureMessage | String? |  yes  | Message if polling failed |

---


 
 
 #### [CustomForm](#CustomForm)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | applicationId | String? |  yes  | Application ID for form |
 | slug | String? |  yes  | Slug for the form, which is to be used for accessing the form |
 | headerImage | String |  no  | Form header image that will be shown to the user |
 | title | String? |  yes  | Form title that will be shown to the user |
 | description | String |  no  | Form description that will be shown to the user |
 | priority | [Priority](#Priority)? |  yes  | Sets priority of tickets created by form response |
 | loginRequired | Boolean? |  yes  | Denotes if login is required to make a form response submission |
 | shouldNotify | Boolean? |  yes  | Denotes if new response submission for the form should be notified to the assignees |
 | successMessage | String |  no  | Message that is to be shown on succesfull form response submission |
 | submitButton | [SubmitButton](#SubmitButton) |  no  | Details for submit button |
 | inputs | ArrayList<HashMap<String,Any>>? |  yes  | List of all the form fields |
 | createdOn | [CreatedOn](#CreatedOn) |  no  | Gives details of when the form was created |
 | createdBy | HashMap<String,Any> |  no  | Gives details of user who created the form |
 | pollForAssignment | [PollForAssignment](#PollForAssignment) |  no  | Details of how polling should be done for support |
 | id | String? |  yes  | Unique identifier for the form |

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
 | id | String? |  yes  | Unique identifier for the feedback |
 | ticketId | String? |  yes  | Readable ticket number |
 | companyId | String? |  yes  | Company id for which ticket was raised |
 | response | ArrayList<[FeedbackResponseItem](#FeedbackResponseItem)>? |  yes  |  |
 | category | String |  no  | Category of the ticket |
 | user | HashMap<String,Any> |  no  | User who submitted the feedback |
 | updatedAt | String |  no  | Time when the feedback was last updated |
 | createdAt | String |  no  | Time when the feedback was created |

---


 
 
 #### [TicketHistory](#TicketHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  | Type of the history event |
 | value | HashMap<String,Any>? |  yes  | Data of the history event |
 | ticketId | String? |  yes  | Readable ticket number |
 | createdOn | [CreatedOn](#CreatedOn) |  no  | Time of creation of the history event |
 | createdBy | HashMap<String,Any> |  no  | User who created the history event |
 | id | String? |  yes  | Unique identifier of the history event |
 | updatedAt | String |  no  | Time of last update of the history event |
 | createdAt | String |  no  | Time of creation of the history event |

---


 
 
 #### [Ticket](#Ticket)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | context | [TicketContext](#TicketContext) |  no  | Details of company and application realated to the ticket |
 | createdOn | [CreatedOn](#CreatedOn) |  no  | Details of company and application realated to the ticket |
 | responseId | String |  no  | Details of company and application realated to the ticket |
 | content | [TicketContent](#TicketContent) |  no  | Ticket conetent details |
 | ticketId | String? |  yes  | Readable ticket number |
 | category | [TicketCategory](#TicketCategory)? |  yes  | Category assigned to the ticket |
 | subCategory | [TicketSubCategory](#TicketSubCategory) |  no  | Sub-category assigned to the ticket |
 | source | Any? |  yes  | Denotes if the ticket was created at company or application level |
 | status | [Status](#Status)? |  yes  | Denotes in what state is the ticket |
 | priority | [Priority](#Priority)? |  yes  | Denotes the priority of ticket |
 | createdBy | HashMap<String,Any> |  no  | User details of ticket creator |
 | assignedTo | HashMap<String,Any> |  no  | Details of support staff to whom ticket is assigned |
 | tags | ArrayList<String> |  no  | Tags relevant to ticket |
 | customJson | HashMap<String,Any> |  no  | custom json relevant to the ticket |
 | isFeedbackPending | Boolean |  no  | Denotes if feedback submission is pending for the ticket |
 | id | String? |  yes  | Unique identifier for the ticket |
 | updatedAt | String |  no  | Time when the ticket was last updated |
 | createdAt | String |  no  | Time when the ticket was created |

---




 
 
 #### [Activity](#Activity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currentState | HashMap<String,Any> |  no  |  |
 | documentId | String |  no  |  |
 | previousState | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ActivityDump](#ActivityDump)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | activity | [Activity](#Activity) |  no  |  |
 | createdBy | [CreatedBy](#CreatedBy) |  no  |  |
 | dateMeta | [DateMeta](#DateMeta) |  no  |  |
 | id | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [AddMediaListRequest](#AddMediaListRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityId | String |  no  |  |
 | entityType | String |  no  |  |
 | mediaList | ArrayList<[AddMediaRequest](#AddMediaRequest)> |  no  |  |
 | refId | String |  no  |  |
 | refType | String |  no  |  |

---


 
 
 #### [AddMediaRequest](#AddMediaRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cloudId | String |  no  |  |
 | cloudName | String |  no  |  |
 | cloudProvider | String |  no  |  |
 | entityId | String |  no  |  |
 | entityType | String |  no  |  |
 | mediaUrl | String |  no  |  |
 | refId | String |  no  |  |
 | refType | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | thumbnailUrl | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ApproveRequest](#ApproveRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | approve | Boolean |  no  |  |
 | entityType | String |  no  |  |
 | id | String? |  yes  |  |
 | reason | String |  no  |  |

---


 
 
 #### [Attribute](#Attribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dateMeta | [DateMeta](#DateMeta) |  no  |  |
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
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |

---


 
 
 #### [DeviceMeta](#DeviceMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appVersion | String |  no  |  |
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
 | entityId | String |  no  |  |
 | entityType | String |  no  |  |

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
 | requestId | String |  no  |  |
 | stackTrace | String |  no  |  |
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
 | maxCount | Int |  no  |  |
 | size | Int |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [MediaMetaRequest](#MediaMetaRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | maxCount | Int? |  yes  |  |
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
 | hasNext | Boolean |  no  |  |
 | hasPrevious | Boolean |  no  |  |
 | itemTotal | Int |  no  |  |
 | nextId | String |  no  |  |
 | size | Int? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [PageNumber](#PageNumber)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Int |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Int |  no  |  |
 | size | Int |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [Rating](#Rating)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | ArrayList<[Attribute](#Attribute)> |  no  |  |
 | attributesSlugs | ArrayList<String> |  no  |  |
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
 | entityId | String? |  yes  |  |
 | entityType | String? |  yes  |  |

---


 
 
 #### [Review](#Review)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | header | String |  no  |  |
 | imageMeta | [MediaMeta](#MediaMeta) |  no  |  |
 | title | String |  no  |  |
 | videoMeta | [MediaMeta](#MediaMeta) |  no  |  |
 | voteAllowed | Boolean |  no  |  |

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
 | imageMeta | [MediaMetaRequest](#MediaMetaRequest)? |  yes  |  |
 | isVoteAllowed | Boolean? |  yes  |  |
 | title | String? |  yes  |  |
 | videoMeta | [MediaMetaRequest](#MediaMetaRequest)? |  yes  |  |

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
 | dateMeta | [DateMeta](#DateMeta) |  no  |  |
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
 | enableMediaType | String |  no  | image | video | any |
 | enableQna | Boolean |  no  |  |
 | enableRating | Boolean? |  yes  |  |
 | enableReview | Boolean? |  yes  |  |
 | entity | [EntityRequest](#EntityRequest)? |  yes  |  |
 | rating | [RatingRequest](#RatingRequest)? |  yes  |  |
 | review | [ReviewRequest](#ReviewRequest)? |  yes  |  |

---


 
 
 #### [TemplateRequestList](#TemplateRequestList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | templateList | ArrayList<[TemplateRequest](#TemplateRequest)>? |  yes  |  |

---


 
 
 #### [UI](#UI)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | feedbackQuestion | ArrayList<String> |  no  |  |
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
 | attributesRating | ArrayList<[AttributeObject](#AttributeObject)> |  no  |  |
 | description | String |  no  |  |
 | deviceMeta | [DeviceMeta](#DeviceMeta) |  no  |  |
 | entityId | String |  no  |  |
 | entityType | String |  no  |  |
 | mediaResource | ArrayList<[MediaMeta](#MediaMeta)> |  no  |  |
 | rating | Double |  no  |  |
 | reviewId | String |  no  |  |
 | templateId | String |  no  |  |
 | title | String |  no  |  |

---


 
 
 #### [UpdateTemplateRequest](#UpdateTemplateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean? |  yes  |  |
 | enableMediaType | String |  no  | image | video | any |
 | enableQna | Boolean |  no  |  |
 | enableRating | Boolean? |  yes  |  |
 | enableReview | Boolean? |  yes  |  |
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
 | sectionsMeta | ArrayList<[AvailablePageSectionMetaAttributes](#AvailablePageSectionMetaAttributes)> |  no  |  |
 | theme | String |  no  |  |
 | seo | [AvailablePageSeo](#AvailablePageSeo) |  no  |  |
 | props | ArrayList<HashMap<String,Any>> |  no  |  |
 | id | String |  no  |  |

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
 | id | String |  no  |  |

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
 | exactUrl | String |  no  |  |
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
 | itemTotal | Int |  no  |  |
 | hasNext | Boolean |  no  |  |
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
 | themeId | String |  no  |  |

---


 
 
 #### [UpgradableThemeSchema](#UpgradableThemeSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | parentTheme | String |  no  |  |
 | appliedTheme | String |  no  |  |
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
 | lastModified | String |  no  |  |
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
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | version | String |  no  |  |
 | parentThemeVersion | String |  no  |  |
 | parentTheme | String |  no  |  |
 | information | [Information](#Information) |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | src | [Src](#Src) |  no  |  |
 | assets | [AssetsSchema](#AssetsSchema) |  no  |  |
 | availableSections | ArrayList<[availableSectionSchema](#availableSectionSchema)> |  no  |  |
 | constants | HashMap<String,Any> |  no  |  |
 | styles | HashMap<String,Any> |  no  |  |
 | config | [Config](#Config) |  no  |  |
 | settings | HashMap<String,Any> |  no  |  |
 | font | [Font](#Font) |  no  |  |
 | id | String |  no  |  |
 | v | Int |  no  |  |
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
 | umdJs | [UmdJs](#UmdJs) |  no  |  |
 | commonJs | [CommonJs](#CommonJs) |  no  |  |
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
 | globalSchema | [GlobalSchema](#GlobalSchema) |  no  |  |
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
 | bgColor | String |  no  |  |
 | primaryColor | String |  no  |  |
 | secondaryColor | String |  no  |  |
 | accentColor | String |  no  |  |
 | linkColor | String |  no  |  |
 | buttonSecondaryColor | String |  no  |  |

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
 | semiBold | [SemiBold](#SemiBold) |  no  |  |
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
 | countryCode | String |  no  |  |
 | phone | String |  no  |  |
 | primary | Boolean |  no  |  |

---


 
 
 #### [EditMobileRequestSchema](#EditMobileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String |  no  |  |
 | phone | String |  no  |  |

---


 
 
 #### [EditProfileRequestSchema](#EditProfileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String |  no  |  |
 | lastName | String |  no  |  |
 | mobile | [EditProfileMobileSchema](#EditProfileMobileSchema) |  no  |  |
 | countryCode | String |  no  |  |
 | email | String |  no  |  |
 | gender | String |  no  |  |
 | dob | String |  no  |  |
 | profilePicUrl | String |  no  |  |
 | androidHash | String |  no  |  |
 | sender | String |  no  |  |
 | registerToken | String |  no  |  |

---


 
 
 #### [EditProfileMobileSchema](#EditProfileMobileSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | String |  no  |  |
 | countryCode | String |  no  |  |

---


 
 
 #### [SendEmailOtpRequestSchema](#SendEmailOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | action | String |  no  |  |
 | token | String |  no  |  |
 | registerToken | String |  no  |  |

---


 
 
 #### [VerifyEmailOtpRequestSchema](#VerifyEmailOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | action | String |  no  |  |
 | registerToken | String |  no  |  |
 | otp | String |  no  |  |

---


 
 
 #### [VerifyOtpRequestSchema](#VerifyOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | requestId | String |  no  |  |
 | registerToken | String |  no  |  |
 | otp | String |  no  |  |

---


 
 
 #### [SendMobileOtpRequestSchema](#SendMobileOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String |  no  |  |
 | countryCode | String |  no  |  |
 | action | String |  no  |  |
 | token | String |  no  |  |
 | androidHash | String |  no  |  |
 | force | String |  no  |  |
 | captchaCode | String |  no  |  |

---


 
 
 #### [UpdatePasswordRequestSchema](#UpdatePasswordRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | oldPassword | String |  no  |  |
 | newPassword | String |  no  |  |

---


 
 
 #### [FormRegisterRequestSchema](#FormRegisterRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String |  no  |  |
 | lastName | String |  no  |  |
 | gender | String |  no  |  |
 | email | String |  no  |  |
 | password | String |  no  |  |
 | phone | [FormRegisterRequestSchemaPhone](#FormRegisterRequestSchemaPhone) |  no  |  |
 | registerToken | String |  no  |  |

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
 | captchaCode | String |  no  |  |

---


 
 
 #### [PasswordLoginRequestSchema](#PasswordLoginRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | captchaCode | String |  no  |  |
 | password | String |  no  |  |
 | username | String |  no  |  |

---


 
 
 #### [SendOtpRequestSchema](#SendOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String |  no  |  |
 | captchaCode | String |  no  |  |
 | mobile | String |  no  |  |

---


 
 
 #### [OAuthRequestSchema](#OAuthRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSignedIn | Boolean |  no  |  |
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
 | registerToken | String |  no  |  |
 | userExists | Boolean |  no  |  |
 | user | [UserSchema](#UserSchema) |  no  |  |

---


 
 
 #### [SendOtpResponse](#SendOtpResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | resendTimer | Int |  no  |  |
 | resendToken | String |  no  |  |
 | success | Boolean |  no  |  |
 | requestId | String |  no  |  |
 | message | String |  no  |  |
 | mobile | String |  no  |  |
 | countryCode | String |  no  |  |
 | email | String |  no  |  |
 | resendEmailToken | String |  no  |  |
 | registerToken | String |  no  |  |
 | verifyEmailOtp | Boolean |  no  |  |
 | verifyMobileOtp | Boolean |  no  |  |
 | userExists | Boolean |  no  |  |

---


 
 
 #### [ProfileEditSuccess](#ProfileEditSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  |  |
 | registerToken | String |  no  |  |
 | userExists | Boolean |  no  |  |
 | verifyEmailLink | Boolean |  no  |  |
 | verifyEmailOtp | Boolean |  no  |  |
 | verifyMobileOtp | Boolean |  no  |  |
 | email | String |  no  |  |

---


 
 
 #### [LoginSuccess](#LoginSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  |  |
 | requestId | String |  no  |  |
 | registerToken | String |  no  |  |

---


 
 
 #### [VerifyOtpSuccess](#VerifyOtpSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  |  |
 | userExists | Boolean |  no  |  |
 | registerToken | String |  no  |  |

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
 | resendTimer | Int |  no  |  |
 | resendToken | String |  no  |  |
 | resendEmailToken | String |  no  |  |
 | registerToken | String |  no  |  |
 | success | Boolean |  no  |  |
 | requestId | String |  no  |  |
 | message | String |  no  |  |
 | mobile | String |  no  |  |
 | countryCode | String |  no  |  |
 | verifyEmailOtp | Boolean |  no  |  |
 | verifyMobileOtp | Boolean |  no  |  |
 | userExists | Boolean |  no  |  |

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
 | resendTimer | Int |  no  |  |
 | resendToken | String |  no  |  |
 | registerToken | String |  no  |  |
 | success | Boolean |  no  |  |
 | requestId | String |  no  |  |
 | message | String |  no  |  |
 | mobile | String |  no  |  |
 | countryCode | String |  no  |  |

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
 | verifyMobileLink | Boolean |  no  |  |

---


 
 
 #### [VerifyEmailOTPSuccess](#VerifyEmailOTPSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema) |  no  |  |
 | verifyEmailLink | Boolean |  no  |  |

---


 
 
 #### [SendMobileVerifyLinkSuccess](#SendMobileVerifyLinkSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verifyMobileLink | Boolean |  no  |  |

---


 
 
 #### [SendEmailVerifyLinkSuccess](#SendEmailVerifyLinkSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verifyEmailLink | Boolean |  no  |  |

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
 | verifyEmailOtp | Boolean |  no  |  |
 | verifyEmailLink | Boolean |  no  |  |
 | verifyMobileOtp | Boolean |  no  |  |
 | user | String |  no  |  |
 | registerToken | String |  no  |  |
 | userExists | Boolean |  no  |  |

---


 
 
 #### [FormRegisterRequestSchemaPhone](#FormRegisterRequestSchemaPhone)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String |  no  |  |
 | mobile | String |  no  |  |

---


 
 
 #### [OAuthRequestSchemaOauth2](#OAuthRequestSchemaOauth2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | accessToken | String |  no  |  |
 | expiry | Int |  no  |  |
 | refreshToken | String |  no  |  |

---


 
 
 #### [OAuthRequestSchemaProfile](#OAuthRequestSchemaProfile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lastName | String |  no  |  |
 | image | String |  no  |  |
 | id | String |  no  |  |
 | email | String |  no  |  |
 | fullName | String |  no  |  |
 | firstName | String |  no  |  |

---


 
 
 #### [AuthSuccessUser](#AuthSuccessUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String |  no  |  |
 | lastName | String |  no  |  |
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
 | phoneNumber | String? |  yes  |  |
 | email | String |  no  |  |
 | firstName | String |  no  |  |
 | lastName | String |  no  |  |
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
 | maxAge | Double |  no  |  |
 | userId | String |  no  |  |

---


 
 
 #### [CreateUserSessionResponseSchema](#CreateUserSessionResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domain | String |  no  |  |
 | maxAge | Double |  no  |  |
 | secure | Boolean |  no  |  |
 | httpOnly | Boolean |  no  |  |
 | cookie | HashMap<String,Any> |  no  |  |

---


 
 
 #### [PlatformSchema](#PlatformSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | lookAndFeel | [LookAndFeel](#LookAndFeel) |  no  |  |
 | updatedAt | String |  no  |  |
 | active | Boolean |  no  |  |
 | forgotPassword | Boolean |  no  |  |
 | login | [Login](#Login) |  no  |  |
 | skipCaptcha | Boolean |  no  |  |
 | name | String |  no  |  |
 | meta | [MetaSchema](#MetaSchema) |  no  |  |
 | id | String |  no  |  |
 | social | [Social](#Social) |  no  |  |
 | requiredFields | [RequiredFields](#RequiredFields) |  no  |  |
 | registerRequiredFields | [RegisterRequiredFields](#RegisterRequiredFields) |  no  |  |
 | skipLogin | Boolean |  no  |  |
 | flashCard | [FlashCard](#FlashCard) |  no  |  |
 | subtext | String |  no  |  |
 | socialTokens | [SocialTokens](#SocialTokens) |  no  |  |
 | createdAt | String |  no  |  |
 | register | Boolean |  no  |  |
 | mobileImage | String |  no  |  |
 | desktopImage | String |  no  |  |

---


 
 
 #### [LookAndFeel](#LookAndFeel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cardPosition | String |  no  |  |
 | backgroundColor | String |  no  |  |

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
 | fyndDefault | Boolean |  no  |  |

---


 
 
 #### [Social](#Social)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | accountKit | Boolean |  no  |  |
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
 | isRequired | Boolean |  no  |  |
 | level | String |  no  |  |

---


 
 
 #### [PlatformMobile](#PlatformMobile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isRequired | Boolean |  no  |  |
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
 | isRequired | Boolean |  no  |  |
 | level | String |  no  |  |

---


 
 
 #### [RegisterRequiredFieldsMobile](#RegisterRequiredFieldsMobile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isRequired | Boolean |  no  |  |
 | level | String |  no  |  |

---


 
 
 #### [FlashCard](#FlashCard)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | textColor | String |  no  |  |
 | backgroundColor | String |  no  |  |

---


 
 
 #### [SocialTokens](#SocialTokens)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | facebook | [Facebook](#Facebook) |  no  |  |
 | accountKit | [Accountkit](#Accountkit) |  no  |  |
 | google | [Google](#Google) |  no  |  |

---


 
 
 #### [Facebook](#Facebook)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String |  no  |  |

---


 
 
 #### [Accountkit](#Accountkit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String |  no  |  |

---


 
 
 #### [Google](#Google)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String |  no  |  |

---


 
 
 #### [UpdateUserRequestSchema](#UpdateUserRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String |  no  |  |
 | lastName | String |  no  |  |
 | gender | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |

---


 
 
 #### [UserSchema](#UserSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | lastName | String |  no  |  |
 | phoneNumbers | ArrayList<[PhoneNumber](#PhoneNumber)> |  no  |  |
 | emails | ArrayList<[Email](#Email)> |  no  |  |
 | gender | String |  no  |  |
 | dob | String |  no  |  |
 | active | Boolean |  no  |  |
 | profilePicUrl | String |  no  |  |
 | username | String |  no  |  |
 | accountType | String |  no  |  |
 | uid | String |  no  |  |
 | debug | [Debug](#Debug) |  no  |  |
 | hasOldPasswordHash | Boolean |  no  |  |
 | id | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |

---




 
 
 #### [ApplicationLegal](#ApplicationLegal)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application | String |  no  |  |
 | tnc | String |  no  |  |
 | policy | String |  no  |  |
 | shipping | String |  no  |  |
 | faq | ArrayList<[ApplicationLegalFAQ](#ApplicationLegalFAQ)> |  no  |  |
 | id | String |  no  |  |
 | updatedAt | String |  no  |  |
 | createdAt | String |  no  |  |

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
 | id | String |  no  |  |
 | robotsTxt | String |  no  |  |
 | sitemapEnabled | Boolean |  no  |  |
 | customMetaTags | ArrayList<HashMap<String,Any>> |  no  |  |
 | details | [Detail](#Detail) |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |

---


 
 
 #### [CustomMetaTag](#CustomMetaTag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | content | String |  no  |  |
 | id | String |  no  |  |

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
 | pageSlug | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [EditorMeta](#EditorMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | foregroundColor | String |  no  |  |
 | backgroundColor | String |  no  |  |
 | contentType | String |  no  |  |
 | content | String |  no  |  |

---


 
 
 #### [AnnouncementAuthorSchema](#AnnouncementAuthorSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | String |  no  |  |
 | modifiedBy | String |  no  |  |

---


 
 
 #### [AdminAnnouncementSchema](#AdminAnnouncementSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | platforms | ArrayList<String> |  no  |  |
 | title | String |  no  |  |
 | announcement | String |  no  |  |
 | pages | ArrayList<[AnnouncementPageSchema](#AnnouncementPageSchema)> |  no  |  |
 | editorMeta | [EditorMeta](#EditorMeta) |  no  |  |
 | author | [AnnouncementAuthorSchema](#AnnouncementAuthorSchema) |  no  |  |
 | createdAt | String |  no  |  |
 | app | String |  no  |  |
 | modifiedAt | String |  no  |  |
 | schedule | [ScheduleSchema](#ScheduleSchema) |  no  |  |

---


 
 
 #### [ScheduleSchema](#ScheduleSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cron | String |  no  |  |
 | start | String |  no  |  |
 | end | String |  no  |  |
 | duration | Double |  no  |  |
 | nextSchedule | ArrayList<HashMap<String,Any>> |  no  |  |

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
 | aspectRatio | String |  no  |  |
 | id | String |  no  |  |
 | secureUrl | String |  no  |  |

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
 | id | String |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | application | String |  no  |  |
 | archived | Boolean |  no  |  |
 | author | [Author](#Author) |  no  |  |
 | content | ArrayList<[ResourceContent](#ResourceContent)> |  no  |  |
 | featureImage | [Asset](#Asset) |  no  |  |
 | published | Boolean |  no  |  |
 | readingTime | String |  no  |  |
 | slug | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | seo | [SEO](#SEO) |  no  |  |
 | schedule | [CronSchedule](#CronSchedule) |  no  |  |
 | title | String |  no  |  |
 | dateMeta | [DateMeta](#DateMeta) |  no  |  |

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
 | customJson | HashMap<String,Any> |  no  |  |
 | author | [Author](#Author) |  no  |  |
 | content | ArrayList<[ResourceContent](#ResourceContent)> |  no  |  |
 | featureImage | [Asset](#Asset) |  no  |  |
 | published | Boolean |  no  |  |
 | readingTime | String |  no  |  |
 | slug | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | title | String |  no  |  |
 | seo | [SEO](#SEO) |  no  |  |
 | schedule | [CronSchedule](#CronSchedule) |  no  |  |

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
 | createdBy | [CreatedBySchema](#CreatedBySchema) |  no  |  |
 | dateMeta | [DateMeta](#DateMeta) |  no  |  |
 | id | String |  no  |  |
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
 | enUs | [Language](#Language) |  no  |  |

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
 | localeLanguage | [LocaleLanguage](#LocaleLanguage) |  no  |  |
 | image | String |  no  |  |
 | type | String |  no  |  |
 | action | [Action](#Action) |  no  |  |
 | active | Boolean |  no  |  |
 | display | String |  no  |  |
 | sortOrder | Int |  no  |  |
 | subNavigation | ArrayList<[NavigationReference](#NavigationReference)> |  no  |  |

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
 | sleepTime | Int |  no  |  |
 | startOnLaunch | Boolean |  no  |  |
 | duration | Int |  no  |  |
 | slideDirection | String |  no  |  |

---


 
 
 #### [SlideshowMedia](#SlideshowMedia)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | url | String |  no  |  |
 | bgColor | String |  no  |  |
 | duration | Int |  no  |  |
 | autoDecideDuration | Boolean |  no  |  |
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
 | refreshRate | Int |  no  | number of seconds after which api should hit again to fetch new announcements |
 | refreshPages | ArrayList<String> |  no  | list of page slugs on which announcement should be fetched as soon as they are loaded |

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
 | subType | String |  no  |  |
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
 | subType | String |  no  |  |
 | id | String |  no  |  |
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
 | requestId | String |  no  |  |
 | stackTrace | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CategorySchema](#CategorySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | index | Int |  no  |  |
 | title | String |  no  |  |
 | description | String |  no  |  |
 | children | ArrayList<String> |  no  |  |
 | id | String |  no  |  |
 | slug | String |  no  |  |
 | application | String |  no  |  |
 | iconUrl | String |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ChildrenSchema](#ChildrenSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | question | String |  no  |  |
 | answer | String |  no  |  |
 | slug | String |  no  |  |
 | application | String |  no  |  |
 | id | String |  no  |  |

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
 | id | String |  no  |  |
 | slug | String |  no  |  |
 | application | String |  no  |  |
 | iconUrl | String |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |

---


 
 
 #### [FaqSchema](#FaqSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String |  no  |  |
 | application | String |  no  |  |
 | id | String |  no  |  |
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
 | createdBy | [CreatedBySchema](#CreatedBySchema) |  no  |  |
 | dateMeta | [DateMeta](#DateMeta) |  no  |  |
 | id | String |  no  |  |
 | application | String |  no  |  |
 | archived | Boolean |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |

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
 | id | String |  no  |  |
 | application | String |  no  |  |
 | archived | Boolean |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | platform | ArrayList<String> |  no  |  |
 | createdBy | [CreatedBySchema](#CreatedBySchema) |  no  |  |
 | dateMeta | [DateMeta](#DateMeta) |  no  |  |
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
 | id | String |  no  |  |
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
 | createdBy | [CreatedBySchema](#CreatedBySchema) |  no  |  |
 | dateMeta | [DateMeta](#DateMeta) |  no  |  |
 | schedule | [ScheduleSchema](#ScheduleSchema) |  no  |  |

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
 | secureUrl | String |  no  |  |

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
 | pageType | String |  no  |  |
 | displayName | String |  no  |  |
 | params | ArrayList<[PageSpecParam](#PageSpecParam)> |  no  |  |
 | query | ArrayList<[PageSpecParam](#PageSpecParam)> |  no  |  |

---


 
 
 #### [PageSchema](#PageSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | application | String |  no  |  |
 | componentIds | ArrayList<String> |  no  | Components can be used to store multiple components |
 | content | ArrayList<[PageContent](#PageContent)> |  no  |  |
 | createdBy | [CreatedBySchema](#CreatedBySchema) |  no  |  |
 | dateMeta | [DateMeta](#DateMeta) |  no  |  |
 | description | String |  no  |  |
 | featureImage | [Asset](#Asset) |  no  |  |
 | pageMeta | ArrayList<[PageMeta](#PageMeta)> |  no  |  |
 | schedule | [ScheduleSchema](#ScheduleSchema) |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
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
 | schedule | [CronSchedule](#CronSchedule) |  no  |  |
 | application | String |  no  |  |
 | author | [Author](#Author) |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | orientation | String |  no  |  |
 | content | ArrayList<HashMap<String,Any>> |  no  |  |
 | featureImage | [Asset](#Asset) |  no  |  |
 | published | Boolean |  no  |  |
 | readingTime | String |  no  |  |
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
 | systemPages | ArrayList<[NavigationSchema](#NavigationSchema)> |  no  |  |
 | customPages | ArrayList<[PageSchema](#PageSchema)> |  no  |  |
 | applicationId | String |  no  |  |

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
 | id | String |  no  |  |
 | slug | String |  no  |  |
 | dateMeta | [DateMeta](#DateMeta) |  no  |  |
 | application | String |  no  |  |
 | platform | String |  no  |  |
 | configuration | [ConfigurationSchema](#ConfigurationSchema) |  no  |  |
 | media | ArrayList<[SlideshowMedia](#SlideshowMedia)> |  no  |  |
 | active | Boolean |  no  |  |
 | archived | Boolean |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |

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
 | id | String |  no  |  |
 | configType | String |  no  |  |
 | application | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
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
 | id | String |  no  |  |
 | tags | ArrayList<[TagSchema](#TagSchema)> |  no  |  |

---


 
 
 #### [TagSchema](#TagSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | url | String |  no  |  |
 | type | String |  no  |  |
 | subType | String |  no  |  |
 | id | String |  no  |  |
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
 | userId | String |  no  |  |

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
 | notificationEmails | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | code | String |  no  |  |
 | address | [AddressObject](#AddressObject) |  no  |  |
 | additionalContacts | [AdditionalContactsObject](#AdditionalContactsObject) |  no  |  |
 | timing | ArrayList<[AdditionalContactsObject](#AdditionalContactsObject)> |  no  |  |
 | createdBy | [CreatedModifiedByObject](#CreatedModifiedByObject) |  no  |  |
 | modifiedBy | [TimingObject](#TimingObject) |  no  |  |
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |

---


 
 
 #### [ItemProperties](#ItemProperties)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | notificationEmails | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | code | String |  no  |  |
 | address | [AddressObject](#AddressObject) |  no  |  |
 | additionalContacts | [AdditionalContactsObject](#AdditionalContactsObject) |  no  |  |
 | timing | ArrayList<[AdditionalContactsObject](#AdditionalContactsObject)> |  no  |  |
 | createdBy | [CreatedModifiedByObject](#CreatedModifiedByObject) |  no  |  |
 | modifiedBy | [TimingObject](#TimingObject) |  no  |  |
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |

---


 
 
 #### [AddressObject](#AddressObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address1 | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | pincode | Double |  no  |  |
 | country | String |  no  |  |
 | countryCode | String |  no  |  |

---


 
 
 #### [AdditionalContactsObject](#AdditionalContactsObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | Double |  no  |  |
 | countryCode | Double |  no  |  |

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
 | datetimeCheck | Boolean |  no  |  |
 | header | String |  no  |  |
 | instructionForCustomer | String |  no  |  |

---


 
 
 #### [PickupResponseItems](#PickupResponseItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | datetimeCheck | Boolean |  no  |  |
 | header | String |  no  |  |
 | instructionForCustomer | String |  no  |  |
 | appId | String |  no  |  |

---


 
 
 #### [ShippingSchema](#ShippingSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | assignment | [AssignmentSchema](#AssignmentSchema) |  no  |  |
 | id | String |  no  |  |
 | appId | String |  no  |  |

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
 | fulfillmentPriority | [FulfillmentPriorityObject](#FulfillmentPriorityObject) |  no  |  |
 | defaultSortStrategy | String |  no  |  |

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
 | id | String |  no  |  |

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
 | assignmentType | String |  no  |  |

---


 
 
 #### [StrategyObject](#StrategyObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rules | ArrayList<[StrategyItems](#StrategyItems)> |  no  |  |

---


 
 
 #### [StrategyItems](#StrategyItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | productTags | ArrayList<String> |  no  |  |
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
 | zoneDetail | [ZoneDetailsObject](#ZoneDetailsObject) |  no  |  |
 | id | String |  no  |  |

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
 | pincodeList | ArrayList<Double> |  no  |  |

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
 | intervalCount | Double |  no  |  |

---


 
 
 #### [Plan](#Plan)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recurring | [PlanRecurring](#PlanRecurring) |  no  |  |
 | isTrialPlan | Boolean |  no  |  |
 | planGroup | String |  no  |  |
 | tagLines | ArrayList<String> |  no  |  |
 | currency | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | isVisible | Boolean |  no  |  |
 | trialPeriod | Double |  no  |  |
 | addons | ArrayList<String> |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | type | String |  no  |  |
 | country | String |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | amount | Double |  no  |  |
 | productSuiteId | String |  no  |  |
 | createdAt | String |  no  |  |
 | modifiedAt | String |  no  |  |

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
 | displayText | String |  no  |  |

---


 
 
 #### [DetailedPlan](#DetailedPlan)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recurring | [PlanRecurring](#PlanRecurring) |  no  |  |
 | isTrialPlan | Boolean |  no  |  |
 | planGroup | String |  no  |  |
 | tagLines | ArrayList<String> |  no  |  |
 | currency | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | isVisible | Boolean |  no  |  |
 | trialPeriod | Double |  no  |  |
 | addons | ArrayList<String> |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | type | String |  no  |  |
 | country | String |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | amount | Double |  no  |  |
 | productSuiteId | String |  no  |  |
 | createdAt | String |  no  |  |
 | modifiedAt | String |  no  |  |
 | components | ArrayList<[DetailedPlanComponents](#DetailedPlanComponents)> |  no  |  |

---


 
 
 #### [SubscriptionTrialPeriod](#SubscriptionTrialPeriod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startDate | String |  no  |  |
 | endDate | String |  no  |  |

---


 
 
 #### [EntityChargePrice](#EntityChargePrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | Double? |  yes  |  |
 | currencyCode | String? |  yes  |  |

---


 
 
 #### [EntityChargeRecurring](#EntityChargeRecurring)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | interval | String? |  yes  |  |
 | intervalTime | Int? |  yes  |  |

---


 
 
 #### [ChargeLineItem](#ChargeLineItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | term | String? |  yes  |  |
 | pricingType | String? |  yes  |  |
 | price | [EntityChargePrice](#EntityChargePrice)? |  yes  |  |
 | recurring | [EntityChargeRecurring](#EntityChargeRecurring) |  no  |  |
 | cappedAmount | Double |  no  |  |
 | trialDays | Int |  no  |  |
 | isTest | Boolean |  no  |  |
 | metadata | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CreateSubscriptionCharge](#CreateSubscriptionCharge)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | trialDays | Int |  no  |  |
 | lineItems | ArrayList<[ChargeLineItem](#ChargeLineItem)>? |  yes  |  |
 | isTest | Boolean |  no  |  |
 | returnUrl | String? |  yes  |  |

---


 
 
 #### [CurrentPeriod](#CurrentPeriod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startDate | String |  no  |  |
 | endDate | String |  no  |  |

---


 
 
 #### [SubscriptionCharge](#SubscriptionCharge)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | term | String |  no  |  |
 | pricingType | String |  no  |  |
 | price | [EntityChargePrice](#EntityChargePrice) |  no  |  |
 | recurring | [EntityChargeRecurring](#EntityChargeRecurring) |  no  |  |
 | cappedAmount | Double |  no  |  |
 | activatedOn | String |  no  |  |
 | cancelledOn | String |  no  |  |
 | billingDate | String |  no  |  |
 | currentPeriod | [CurrentPeriod](#CurrentPeriod) |  no  |  |
 | status | String |  no  |  |
 | isTest | Boolean |  no  |  |
 | metadata | HashMap<String,Any> |  no  |  |

---


 
 
 #### [EntitySubscription](#EntitySubscription)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | status | String |  no  |  |
 | companyId | Int |  no  |  |
 | activatedOn | String |  no  |  |
 | cancelledOn | String |  no  |  |
 | trialDays | Int |  no  |  |
 | trialPeriod | [SubscriptionTrialPeriod](#SubscriptionTrialPeriod) |  no  |  |
 | metadata | HashMap<String,Any> |  no  |  |
 | lineItems | ArrayList<[SubscriptionCharge](#SubscriptionCharge)> |  no  |  |

---


 
 
 #### [CreateSubscriptionResponse](#CreateSubscriptionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subscription | [EntitySubscription](#EntitySubscription) |  no  |  |
 | confirmUrl | String |  no  |  |

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
 | addressLines | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | email | String |  no  |  |
 | phone | String |  no  |  |

---


 
 
 #### [InvoiceDetailsStatusTrail](#InvoiceDetailsStatusTrail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | value | String |  no  |  |
 | timestamp | String |  no  |  |

---


 
 
 #### [InvoiceDetailsPaymentMethodsDataChecks](#InvoiceDetailsPaymentMethodsDataChecks)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cvcCheck | String |  no  |  |
 | addressLine1Check | String |  no  |  |
 | addressPostalCodeCheck | String |  no  |  |

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
 | expYear | Int |  no  |  |
 | networks | [InvoiceDetailsPaymentMethodsDataNetworks](#InvoiceDetailsPaymentMethodsDataNetworks) |  no  |  |
 | expMonth | Int |  no  |  |
 | fingerprint | String |  no  |  |
 | generatedFrom | String |  no  |  |
 | threeDSecureUsage | [InvoiceDetailsPaymentMethodsDataThreeDSecureUsage](#InvoiceDetailsPaymentMethodsDataThreeDSecureUsage) |  no  |  |

---


 
 
 #### [InvoiceDetailsPaymentMethods](#InvoiceDetailsPaymentMethods)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | type | String |  no  |  |
 | pgPaymentMethodId | String |  no  |  |
 | data | [InvoiceDetailsPaymentMethodsData](#InvoiceDetailsPaymentMethodsData) |  no  |  |
 | isDefault | Boolean |  no  |  |

---


 
 
 #### [InvoicePaymentMethod](#InvoicePaymentMethod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pgPaymentMethodId | String |  no  |  |

---


 
 
 #### [InvoiceDetails](#InvoiceDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | period | [InvoiceDetailsPeriod](#InvoiceDetailsPeriod) |  no  |  |
 | client | [InvoiceDetailsClient](#InvoiceDetailsClient) |  no  |  |
 | autoAdvance | Boolean |  no  |  |
 | currency | String |  no  |  |
 | paid | Boolean |  no  |  |
 | attemp | Int |  no  |  |
 | id | String |  no  |  |
 | collectionMethod | String |  no  |  |
 | subscriberId | String |  no  |  |
 | invoiceUrl | String |  no  |  |
 | number | String |  no  |  |
 | pgData | HashMap<String,Any> |  no  |  |
 | receiptNumber | String |  no  |  |
 | statementDescriptor | String |  no  |  |
 | currentStatus | String |  no  |  |
 | statusTrail | ArrayList<[InvoiceDetailsStatusTrail](#InvoiceDetailsStatusTrail)> |  no  |  |
 | subtotal | Double |  no  |  |
 | total | Double |  no  |  |
 | subscription | String |  no  |  |
 | nextActionTime | String |  no  |  |
 | createdAt | String |  no  |  |
 | modifiedAt | String |  no  |  |
 | hashIdentifier | String |  no  |  |
 | paymentMethod | [InvoicePaymentMethod](#InvoicePaymentMethod) |  no  |  |

---


 
 
 #### [InvoiceItemsPlanRecurring](#InvoiceItemsPlanRecurring)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | interval | String |  no  |  |
 | intervalCount | Int |  no  |  |

---


 
 
 #### [InvoiceItemsPlan](#InvoiceItemsPlan)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recurring | [InvoiceItemsPlanRecurring](#InvoiceItemsPlanRecurring) |  no  |  |
 | isTrialPlan | Boolean |  no  |  |
 | planGroup | String |  no  |  |
 | tagLines | ArrayList<String> |  no  |  |
 | currency | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | isVisible | Boolean |  no  |  |
 | trialPeriod | Int |  no  |  |
 | addons | ArrayList<String> |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | type | String |  no  |  |
 | country | String |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | amount | Int |  no  |  |
 | productSuiteId | String |  no  |  |
 | createdAt | String |  no  |  |
 | modifiedAt | String |  no  |  |

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
 | id | String |  no  |  |
 | currency | String |  no  |  |
 | plan | [InvoiceItemsPlan](#InvoiceItemsPlan) |  no  |  |
 | name | String |  no  |  |
 | quantity | Int |  no  |  |
 | description | String |  no  |  |
 | period | [InvoiceItemsPeriod](#InvoiceItemsPeriod) |  no  |  |
 | unitAmount | Double |  no  |  |
 | amount | Double |  no  |  |
 | type | String |  no  |  |
 | invoiceId | String |  no  |  |
 | createdAt | String |  no  |  |
 | modifiedAt | String |  no  |  |

---


 
 
 #### [Invoice](#Invoice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoice | [InvoiceDetails](#InvoiceDetails) |  no  |  |
 | invoiceItems | ArrayList<[InvoiceItems](#InvoiceItems)> |  no  |  |

---


 
 
 #### [InvoicesDataClient](#InvoicesDataClient)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | email | String |  no  |  |
 | phone | String |  no  |  |
 | addressLines | ArrayList<String> |  no  |  |

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
 | pgPaymentMethodId | String |  no  |  |

---


 
 
 #### [InvoicesData](#InvoicesData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | client | [InvoicesDataClient](#InvoicesDataClient) |  no  |  |
 | autoAdvance | Boolean |  no  |  |
 | currency | String |  no  |  |
 | paid | Boolean |  no  |  |
 | attemp | Int |  no  |  |
 | collectionMethod | String |  no  |  |
 | subscriberId | String |  no  |  |
 | invoiceUrl | String |  no  |  |
 | number | String |  no  |  |
 | pgData | HashMap<String,Any> |  no  |  |
 | period | [InvoicesDataPeriod](#InvoicesDataPeriod) |  no  |  |
 | receiptNumber | String |  no  |  |
 | statementDescriptor | String |  no  |  |
 | currentStatus | String |  no  |  |
 | statusTrail | ArrayList<[InvoiceDetailsStatusTrail](#InvoiceDetailsStatusTrail)> |  no  |  |
 | subtotal | Double |  no  |  |
 | total | Double |  no  |  |
 | subscription | String |  no  |  |
 | nextActionTime | String |  no  |  |
 | createdAt | String |  no  |  |
 | modifiedAt | String |  no  |  |
 | hashIdentifier | String |  no  |  |
 | paymentMethod | [InvoicesDataPaymentMethod](#InvoicesDataPaymentMethod) |  no  |  |
 | invoiceItems | ArrayList<[InvoiceItems](#InvoiceItems)> |  no  |  |

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
 | phoneNumber | String |  no  |  |
 | phoneCountryCode | String |  no  |  |

---


 
 
 #### [SubscriptionBillingAddress](#SubscriptionBillingAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | state | String |  no  |  |
 | city | String |  no  |  |
 | line1 | String |  no  |  |
 | line2 | String |  no  |  |
 | postalCode | String |  no  |  |

---


 
 
 #### [SubscriptionCustomer](#SubscriptionCustomer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | [Phone](#Phone) |  no  |  |
 | billingAddress | [SubscriptionBillingAddress](#SubscriptionBillingAddress) |  no  |  |
 | id | String |  no  |  |
 | uniqueId | String |  no  |  |
 | type | String |  no  |  |
 | name | String |  no  |  |
 | email | String |  no  |  |
 | createdAt | String |  no  |  |
 | modifiedAt | String |  no  |  |
 | data | HashMap<String,Any> |  no  |  |

---


 
 
 #### [SubscriptionCustomerCreate](#SubscriptionCustomerCreate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | [Phone](#Phone) |  no  |  |
 | billingAddress | [SubscriptionBillingAddress](#SubscriptionBillingAddress) |  no  |  |
 | uniqueId | String |  no  |  |
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
 | resumeAt | String |  no  |  |

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
 | currentPeriod | [SubscriptionCurrentPeriod](#SubscriptionCurrentPeriod) |  no  |  |
 | pauseCollection | [SubscriptionPauseCollection](#SubscriptionPauseCollection) |  no  |  |
 | trial | [SubscriptionTrial](#SubscriptionTrial) |  no  |  |
 | invoiceSettings | [SubscriptionInvoiceSettings](#SubscriptionInvoiceSettings) |  no  |  |
 | isActive | Boolean |  no  |  |
 | cancelAtPeriodEnd | Boolean |  no  |  |
 | id | String |  no  |  |
 | subscriberId | String |  no  |  |
 | planId | String |  no  |  |
 | productSuiteId | String |  no  |  |
 | planData | [Plan](#Plan) |  no  |  |
 | currentStatus | String |  no  |  |
 | collectionMethod | String |  no  |  |
 | createdAt | String |  no  |  |
 | modifiedAt | String |  no  |  |
 | latestInvoice | String |  no  |  |

---


 
 
 #### [SubscriptionStatus](#SubscriptionStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isEnabled | Boolean |  no  |  |
 | subscription | [Subscription](#Subscription) |  no  |  |

---


 
 
 #### [SubscriptionLimitApplication](#SubscriptionLimitApplication)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | hardLimit | Int |  no  |  |
 | softLimit | Int |  no  |  |

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
 | otherPlatform | [SubscriptionLimitOtherPlatform](#SubscriptionLimitOtherPlatform) |  no  |  |
 | team | [SubscriptionLimitTeam](#SubscriptionLimitTeam) |  no  |  |
 | products | [SubscriptionLimitProducts](#SubscriptionLimitProducts) |  no  |  |
 | extensions | [SubscriptionLimitExtensions](#SubscriptionLimitExtensions) |  no  |  |
 | integrations | [SubscriptionLimitIntegrations](#SubscriptionLimitIntegrations) |  no  |  |
 | isTrialPlan | Boolean |  no  |  |

---


 
 
 #### [SubscriptionActivateReq](#SubscriptionActivateReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uniqueId | String |  no  |  |
 | type | String |  no  |  |
 | productSuite | String |  no  |  |
 | planId | String |  no  |  |
 | paymentMethod | String |  no  |  |

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
 | uniqueId | String |  no  |  |
 | type | String |  no  |  |
 | productSuite | String |  no  |  |
 | subscriptionId | String |  no  |  |

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
 | id | String |  no  |  |
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
 | isActive | Boolean |  no  |  |
 | name | String |  no  |  |
 | fileUrl | String |  no  |  |
 | type | String |  no  |  |
 | recordsCount | Int |  no  |  |
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
 | id | String |  no  |  |
 | fromName | String |  no  |  |
 | fromEmail | String |  no  |  |

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
 | recipientHeaders | [RecipientHeaders](#RecipientHeaders) |  no  |  |
 | email | [CampaignEmail](#CampaignEmail) |  no  |  |
 | description | String |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | isActive | Boolean |  no  |  |
 | id | String |  no  |  |
 | datasource | String |  no  |  |
 | type | String |  no  |  |
 | name | String |  no  |  |
 | application | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | slug | String |  no  |  |
 | v | Int |  no  |  |

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
 | phoneNumber | String |  no  |  |
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
 | isActive | Boolean |  no  |  |
 | name | String |  no  |  |
 | fileUrl | String |  no  |  |
 | type | String |  no  |  |
 | recordsCount | Int |  no  |  |
 | application | String |  no  |  |

---


 
 
 #### [Audience](#Audience)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | headers | ArrayList<String> |  no  |  |
 | isActive | Boolean |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | fileUrl | String |  no  |  |
 | type | String |  no  |  |
 | recordsCount | Int |  no  |  |
 | application | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | slug | String |  no  |  |
 | v | Int |  no  |  |

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
 | isDefault | Boolean |  no  |  |

---


 
 
 #### [EmailProviderReq](#EmailProviderReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | apiKey | String |  no  |  |
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
 | id | String |  no  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | apiKey | String |  no  |  |
 | application | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | slug | String |  no  |  |
 | v | Int |  no  |  |

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
 | staticTo | ArrayList<String> |  no  |  |
 | staticCc | ArrayList<String> |  no  |  |
 | staticBcc | ArrayList<String> |  no  |  |
 | replyTo | String |  no  |  |
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
 | templateType | String |  no  |  |
 | template | String |  no  |  |

---


 
 
 #### [EmailTemplateRes](#EmailTemplateRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSystem | Boolean |  no  |  |
 | isInternal | Boolean |  no  |  |
 | description | String |  no  |  |
 | staticTo | ArrayList<String> |  no  |  |
 | staticCc | ArrayList<String> |  no  |  |
 | staticBcc | ArrayList<String> |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |
 | published | Boolean |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | keys | [EmailTemplateKeys](#EmailTemplateKeys) |  no  |  |
 | from | String |  no  |  |
 | replyTo | String |  no  |  |
 | headers | ArrayList<[EmailTemplateHeaders](#EmailTemplateHeaders)> |  no  |  |
 | subject | [TemplateAndType](#TemplateAndType) |  no  |  |
 | html | [TemplateAndType](#TemplateAndType) |  no  |  |
 | text | [TemplateAndType](#TemplateAndType) |  no  |  |
 | attachments | ArrayList<Any> |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | slug | String |  no  |  |
 | v | Int |  no  |  |

---


 
 
 #### [EmailTemplate](#EmailTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSystem | Boolean |  no  |  |
 | isInternal | Boolean |  no  |  |
 | description | String |  no  |  |
 | staticTo | ArrayList<Any> |  no  |  |
 | staticCc | ArrayList<Any> |  no  |  |
 | staticBcc | ArrayList<Any> |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |
 | published | Boolean |  no  |  |
 | id | String |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | from | String |  no  |  |
 | fromName | String |  no  |  |
 | subject | [TemplateAndType](#TemplateAndType) |  no  |  |
 | html | [TemplateAndType](#TemplateAndType) |  no  |  |
 | text | [TemplateAndType](#TemplateAndType) |  no  |  |
 | headers | ArrayList<Any> |  no  |  |
 | attachments | ArrayList<Any> |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

---


 
 
 #### [SystemEmailTemplate](#SystemEmailTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSystem | Boolean |  no  |  |
 | isInternal | Boolean |  no  |  |
 | description | String |  no  |  |
 | staticTo | ArrayList<Any> |  no  |  |
 | staticCc | ArrayList<Any> |  no  |  |
 | staticBcc | ArrayList<Any> |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |
 | published | Boolean |  no  |  |
 | id | String |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | from | String |  no  |  |
 | fromName | String |  no  |  |
 | subject | [TemplateAndType](#TemplateAndType) |  no  |  |
 | html | [TemplateAndType](#TemplateAndType) |  no  |  |
 | text | [TemplateAndType](#TemplateAndType) |  no  |  |
 | headers | ArrayList<Any> |  no  |  |
 | attachments | ArrayList<Any> |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

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
 | isDefault | Boolean |  no  |  |
 | id | String |  no  |  |
 | application | String |  no  |  |
 | event | String |  no  |  |
 | slug | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

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
 | jobId | String |  no  |  |

---


 
 
 #### [Job](#Job)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | completed | Boolean |  no  |  |
 | isActive | Boolean |  no  |  |
 | id | String |  no  |  |
 | campaign | String |  no  |  |
 | application | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

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
 | id | String |  no  |  |
 | job | String |  no  |  |
 | campaign | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

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
 | id | String |  no  |  |
 | application | String |  no  |  |
 | service | String |  no  |  |
 | step | String |  no  |  |
 | status | String |  no  |  |
 | data | Any |  no  |  |
 | expireAt | String |  no  |  |
 | createdAt | String |  no  |  |

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
 | bundleIdentifier | String |  no  |  |
 | pushToken | String |  no  |  |
 | uniqueDeviceId | String |  no  |  |

---


 
 
 #### [PushtokenRes](#PushtokenRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | bundleIdentifier | String |  no  |  |
 | pushToken | String |  no  |  |
 | uniqueDeviceId | String |  no  |  |
 | type | String |  no  |  |
 | platform | String |  no  |  |
 | applicationId | String |  no  |  |
 | userId | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | expiredAt | String |  no  |  |

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
 | id | String |  no  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | sender | String |  no  |  |
 | username | String |  no  |  |
 | authkey | String |  no  |  |
 | application | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | slug | String |  no  |  |
 | v | Int |  no  |  |

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
 | templateType | String |  no  |  |
 | template | String |  no  |  |

---


 
 
 #### [SmsTemplateReq](#SmsTemplateReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | message | [SmsTemplateMessage](#SmsTemplateMessage) |  no  |  |
 | templateVariables | Any |  no  |  |
 | attachments | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |

---


 
 
 #### [SmsTemplateRes](#SmsTemplateRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSystem | Boolean |  no  |  |
 | isInternal | Boolean |  no  |  |
 | description | String |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |
 | published | Boolean |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | message | [SmsTemplateMessage](#SmsTemplateMessage) |  no  |  |
 | templateVariables | Any |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | slug | String |  no  |  |
 | v | Int |  no  |  |

---


 
 
 #### [SmsTemplate](#SmsTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSystem | Boolean |  no  |  |
 | isInternal | Boolean |  no  |  |
 | description | String |  no  |  |
 | priority | String |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | published | Boolean |  no  |  |
 | id | String |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | message | [SmsTemplateMessage](#SmsTemplateMessage) |  no  |  |
 | templateVariables | Any |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

---


 
 
 #### [SystemSmsTemplate](#SystemSmsTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSystem | Boolean |  no  |  |
 | isInternal | Boolean |  no  |  |
 | description | String |  no  |  |
 | tags | ArrayList<Any> |  no  |  |
 | priority | String |  no  |  |
 | published | Boolean |  no  |  |
 | id | String |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | message | [SmsTemplateMessage](#SmsTemplateMessage) |  no  |  |
 | templateVariables | Any |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

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
 | clickAction | String |  no  |  |

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
 | timeToLive | String |  no  |  |

---


 
 
 #### [SystemNotification](#SystemNotification)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | notification | [Notification](#Notification) |  no  |  |
 | user | [SystemNotificationUser](#SystemNotificationUser) |  no  |  |
 | settings | [SystemNotificationUser](#SystemNotificationUser) |  no  |  |
 | id | String |  no  |  |
 | group | String |  no  |  |
 | createdAt | String |  no  |  |

---


 
 
 #### [SystemNotificationsPage](#SystemNotificationsPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | current | Int |  no  |  |
 | size | Int |  no  |  |
 | itemTotal | Int |  no  |  |
 | hasNext | Boolean |  no  |  |

---


 
 
 #### [SystemNotifications](#SystemNotifications)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[SystemNotification](#SystemNotification)> |  no  |  |
 | lastReadAnchor | Int |  no  |  |
 | page | [Page](#Page) |  no  |  |

---




 
 
 #### [PaymentGatewayConfigResponse](#PaymentGatewayConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String? |  yes  | Application Id to which Payment config Mapped |
 | success | Boolean? |  yes  | Response is successful or not |
 | excludedFields | ArrayList<String>? |  yes  | List of all excluded  options with their Details. |
 | aggregators | ArrayList<HashMap<String,Any>> |  no  | List of all speceific Payment options with their Details. |
 | created | Boolean? |  yes  | Response is created or not |
 | displayFields | ArrayList<String>? |  yes  | List of all included  options with their Details. |

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
 | merchantSalt | String? |  yes  | Merchant key of the payment aggregator |
 | secret | String? |  yes  | Secret Key of the payment aggregator |
 | configType | String? |  yes  | Config Type of the aggregator |
 | key | String? |  yes  | Api key of the payment aggregator |
 | isActive | Boolean |  no  | Enable/ Disable Flag |

---


 
 
 #### [PaymentGatewayConfigRequest](#PaymentGatewayConfigRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aggregatorName | [PaymentGatewayConfig](#PaymentGatewayConfig) |  no  |  |
 | appId | String? |  yes  | Application Id to which Payment config Mapped |
 | isActive | Boolean |  no  | Enable/ Disable Flag |

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
 | cardName | String |  no  | card_name |
 | name | String |  no  | name |
 | cardBrandImage | String |  no  | card_brand_image |
 | fyndVpa | String |  no  | fynd_vpa |
 | cardIsin | String |  no  | card_isin |
 | cardFingerprint | String |  no  | card_fingerprint |
 | cardId | String |  no  | card_id |
 | cardToken | String |  no  | card_token |
 | expMonth | Int |  no  | exp_month |
 | code | String |  no  | code |
 | displayName | String |  no  | display name |
 | cardType | String |  no  | card_type |
 | aggregatorName | String? |  yes  | aggregator_name |
 | cardNumber | String |  no  | card_number |
 | cardBrand | String |  no  | card_brand |
 | cardReference | String |  no  | card_reference |
 | expired | Boolean |  no  | expired |
 | cardIssuer | String |  no  | card_issuer |
 | intentFlow | String |  no  | intent_flow |
 | timeout | Int |  no  | timeout |
 | logoUrl | [PaymentModeLogo](#PaymentModeLogo) |  no  | Logo |
 | nickname | String |  no  | nickname |
 | merchantCode | String |  no  | merchant code |
 | displayPriority | Int |  no  | Dispaly Priority |
 | expYear | Int |  no  | exp_year |
 | retryCount | Int |  no  | retry_count |
 | intentAppErrorList | ArrayList<String> |  no  | intent_app_error_list |

---


 
 
 #### [RootPaymentMode](#RootPaymentMode)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  | Payment mode name |
 | displayPriority | Int? |  yes  | Dispaly Priority |
 | anonymousEnable | Boolean |  no  | Annonymous card flag |
 | displayName | String? |  yes  | Payment mode display name |
 | list | ArrayList<[PaymentModeList](#PaymentModeList)> |  no  | Payment mode |
 | aggregatorName | String |  no  | Dispaly Priority |
 | addCardEnabled | Boolean |  no  | Annonymous card flag |

---


 
 
 #### [PaymentOptions](#PaymentOptions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentOption | ArrayList<[RootPaymentMode](#RootPaymentMode)>? |  yes  | Payment options |

---


 
 
 #### [PaymentOptionsResponse](#PaymentOptionsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentOptions | [PaymentOptions](#PaymentOptions)? |  yes  | Payment options |
 | success | Boolean? |  yes  | Response is successful or not |

---


 
 
 #### [PayoutsResponse](#PayoutsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customers | HashMap<String,Any>? |  yes  | customers details object |
 | transferType | String? |  yes  | transafer type |
 | uniqueTransferNo | HashMap<String,Any>? |  yes  | display priority of the payment mode |
 | isActive | Boolean? |  yes  | Enable/DIsable Flag Payout |
 | moreAttributes | HashMap<String,Any>? |  yes  | bank details object |
 | payoutsAggregators | ArrayList<HashMap<String,Any>>? |  yes  | payout aggregator object |
 | isDefault | Boolean? |  yes  | default or not  |

---


 
 
 #### [PayoutBankDetails](#PayoutBankDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | state | String |  no  |  |
 | accountNo | String |  no  |  |
 | accountType | String? |  yes  |  |
 | ifscCode | String? |  yes  |  |
 | city | String |  no  |  |
 | branchName | String |  no  |  |
 | bankName | String |  no  |  |
 | country | String |  no  |  |
 | pincode | Int |  no  |  |
 | accountHolder | String |  no  |  |

---


 
 
 #### [PayoutRequest](#PayoutRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | users | HashMap<String,Any>? |  yes  | payout users object |
 | transferType | String? |  yes  | transafer type |
 | aggregator | String? |  yes  | Aggregator Name |
 | isActive | Boolean? |  yes  | Enable/Disable Flag Payout |
 | uniqueExternalId | String? |  yes  | Unique Id of Payout |
 | bankDetails | [PayoutBankDetails](#PayoutBankDetails)? |  yes  | payout bank details object |

---


 
 
 #### [PayoutResponse](#PayoutResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  | Response is successful or not |
 | users | HashMap<String,Any>? |  yes  | users details object |
 | payouts | HashMap<String,Any>? |  yes  | payout  object |
 | transferType | String? |  yes  | transfer type |
 | aggregator | String? |  yes  | Aggregator Name |
 | created | Boolean? |  yes  | created flag |
 | uniqueTransferNo | String? |  yes  | unique transfer no |
 | isActive | Boolean? |  yes  | Enable/DIsable Flag Payout |
 | bankDetails | HashMap<String,Any>? |  yes  | payout bank_details object |
 | paymentStatus | String? |  yes  | status of payment |

---


 
 
 #### [UpdatePayoutResponse](#UpdatePayoutResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDefault | Boolean? |  yes  | Enable/Disable Default Payout |
 | success | Boolean? |  yes  | Response is successful or not |
 | isActive | Boolean? |  yes  | Enable/DIsable Flag Payout |

---


 
 
 #### [UpdatePayoutRequest](#UpdatePayoutRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDefault | Boolean? |  yes  | Enable/Disable Default Payout |
 | isActive | Boolean? |  yes  | Enable/Disable Flag Payout |
 | uniqueExternalId | String? |  yes  | Unique Id of Payout |

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
 | uniqueExternalId | String? |  yes  | Unique id i.e company:id |

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
 | accountNo | String? |  yes  | Account NUmber of the Account Holder |
 | comment | String |  no  | Remarks added by The user |
 | ifscCode | String? |  yes  | Ifsc Code of the Account |
 | mobile | String? |  yes  | Moblie Number of the User |
 | branchName | String? |  yes  | Branch Name of the Account |
 | bankName | String? |  yes  | Bank Name of the Account |
 | vpa | String |  no  |  |
 | wallet | String |  no  |  |
 | accountHolder | String? |  yes  | Name of the Account Holder |

---


 
 
 #### [AddBeneficiaryDetailsRequest](#AddBeneficiaryDetailsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String? |  yes  | Merchant Order Id |
 | transferMode | String? |  yes  | Transfer Mode of the Beneficiary to be added |
 | delights | Boolean? |  yes  | True if  beneficiary to be added by delights or False if by User |
 | otp | String |  no  |  |
 | requestId | String |  no  |  |
 | shipmentId | String? |  yes  | Shipment Id of the respective Merchant Order Id |
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
 | bankName | String? |  yes  | Bank Name Of Account |
 | success | Boolean |  no  | Response is successful or not |
 | branchName | String? |  yes  | Branch Name Of Account |

---


 
 
 #### [OrderBeneficiaryDetails](#OrderBeneficiaryDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  | EMail of User |
 | address | String? |  yes  | Address of User |
 | id | Int? |  yes  |   |
 | transferMode | String? |  yes  | Transfer Mode Of Account |
 | title | String? |  yes  | Title Of Account |
 | createdOn | String? |  yes  | Creation Date of Beneficiary |
 | ifscCode | String? |  yes  | Ifsc Code Of Account |
 | displayName | String? |  yes  | Display Name Of Account |
 | isActive | Boolean? |  yes  | Boolean Flag whether Beneficiary set or not |
 | bankName | String? |  yes  | Bank Name Of Account |
 | delightsUserName | String? |  yes  | User Id Who filled the Beneficiary  |
 | beneficiaryId | String? |  yes  | Benenficiary Id |
 | subtitle | String? |  yes  | SHort Title Of Account |
 | accountNo | String? |  yes  | Account Number |
 | comment | Boolean |  no  | Remarks |
 | mobile | Boolean |  no  | MObile no of User |
 | branchName | Boolean |  no  | Branch Name Of Account |
 | modifiedOn | String? |  yes  | MOdification Date of Beneficiary |
 | accountHolder | String? |  yes  | Account Holder Name |

---


 
 
 #### [OrderBeneficiaryResponse](#OrderBeneficiaryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | beneficiaries | ArrayList<[OrderBeneficiaryDetails](#OrderBeneficiaryDetails)>? |  yes  | All Beneficiaries Of An Order |
 | showBeneficiaryDetails | Boolean |  no  | Show beneficiary details or not. |

---




 
 
 #### [GetActivityStatus](#GetActivityStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | activityHistory | [ActivityHistory](#ActivityHistory)? |  yes  |  |

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
 | updatedAt | String |  no  |  |
 | id | String |  no  |  |
 | reason | String |  no  |  |
 | marketplaceOrder | [MarketplaceOrder](#MarketplaceOrder) |  no  |  |
 | marketplaceOrderId | String |  no  |  |
 | createdAt | String |  no  |  |
 | appId | String |  no  |  |
 | marketplace | String |  no  |  |
 | companyId | Int |  no  |  |

---


 
 
 #### [MarketplaceOrder](#MarketplaceOrder)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderStatusUrl | String |  no  |  |
 | adminGraphqlApiId | String |  no  |  |
 | email | String |  no  |  |
 | test | Boolean |  no  |  |
 | note | String |  no  |  |
 | totalPrice | String |  no  |  |
 | appId | Int |  no  |  |
 | totalDiscountsSet | [TotalDiscountsSet](#TotalDiscountsSet) |  no  |  |
 | totalPriceSet | [TotalPriceSet](#TotalPriceSet) |  no  |  |
 | totalTaxSet | [TotalTaxSet](#TotalTaxSet) |  no  |  |
 | gateway | String |  no  |  |
 | name | String |  no  |  |
 | subtotalPriceSet | [SubtotalPriceSet](#SubtotalPriceSet) |  no  |  |
 | number | Int |  no  |  |
 | buyerAcceptsMarketing | Boolean |  no  |  |
 | contactEmail | String |  no  |  |
 | token | String |  no  |  |
 | sourceName | String |  no  |  |
 | paymentGatewayNames | ArrayList<Any> |  no  |  |
 | presentmentCurrency | String |  no  |  |
 | subtotalPrice | String |  no  |  |
 | processedAt | String |  no  |  |
 | orderNumber | Int |  no  |  |
 | totalTipReceived | String |  no  |  |
 | id | Int |  no  |  |
 | confirmed | Boolean |  no  |  |
 | currency | String |  no  |  |
 | totalLineItemsPrice | String |  no  |  |
 | lineItems | [LineItems](#LineItems) |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | totalWeight | Int |  no  |  |
 | billingAddress | [BillingAddress](#BillingAddress) |  no  |  |
 | totalShippingPriceSet | [TotalShippingPriceSet](#TotalShippingPriceSet) |  no  |  |
 | customer | [Customer](#Customer) |  no  |  |
 | totalDiscounts | String |  no  |  |
 | totalLineItemsPriceSet | [TotalLineItemsPriceSet](#TotalLineItemsPriceSet) |  no  |  |
 | tags | String |  no  |  |
 | totalPriceUsd | String |  no  |  |
 | userId | Int |  no  |  |
 | totalTax | String |  no  |  |
 | processingMethod | String |  no  |  |
 | shippingAddress | [ShippingAddress](#ShippingAddress) |  no  |  |
 | taxesIncluded | Boolean |  no  |  |
 | financialStatus | String |  no  |  |

---


 
 
 #### [TotalDiscountsSet](#TotalDiscountsSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | presentmentMoney | [PresentmentMoney](#PresentmentMoney) |  no  |  |
 | shopMoney | [ShopMoney](#ShopMoney) |  no  |  |

---


 
 
 #### [PresentmentMoney](#PresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [ShopMoney](#ShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [TotalPriceSet](#TotalPriceSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shopMoney | [TotalPriceSetShopMoney](#TotalPriceSetShopMoney) |  no  |  |
 | presentmentMoney | [TotalPriceSetPresentmentMoney](#TotalPriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [TotalPriceSetShopMoney](#TotalPriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [TotalPriceSetPresentmentMoney](#TotalPriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [TotalTaxSet](#TotalTaxSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shopMoney | [TotalTaxSetShopMoney](#TotalTaxSetShopMoney) |  no  |  |
 | presentmentMoney | [TotalTaxSetPresentmentMoney](#TotalTaxSetPresentmentMoney) |  no  |  |

---


 
 
 #### [TotalTaxSetShopMoney](#TotalTaxSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [TotalTaxSetPresentmentMoney](#TotalTaxSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [SubtotalPriceSet](#SubtotalPriceSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shopMoney | [SubtotalPriceSetShopMoney](#SubtotalPriceSetShopMoney) |  no  |  |
 | presentmentMoney | [SubtotalPriceSetPresentmentMoney](#SubtotalPriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [SubtotalPriceSetShopMoney](#SubtotalPriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [SubtotalPriceSetPresentmentMoney](#SubtotalPriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [LineItems](#LineItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sku | String |  no  |  |
 | fulfillableQuantity | Int |  no  |  |
 | grams | Int |  no  |  |
 | totalDiscount | String |  no  |  |
 | article | [LineItemsArticle](#LineItemsArticle) |  no  |  |
 | title | String |  no  |  |
 | variantInventoryManagement | String |  no  |  |
 | id | Int |  no  |  |
 | variantId | Int |  no  |  |
 | variantTitle | String |  no  |  |
 | productExists | Boolean |  no  |  |
 | price | String |  no  |  |
 | adminGraphqlApiId | String |  no  |  |
 | quantity | Int |  no  |  |
 | vendor | String |  no  |  |
 | fulfillmentService | String |  no  |  |
 | taxable | Boolean |  no  |  |
 | name | String |  no  |  |
 | productId | Int |  no  |  |
 | priceSet | [PriceSet](#PriceSet) |  no  |  |
 | taxLines | [TaxLines](#TaxLines) |  no  |  |
 | requiresShipping | Boolean |  no  |  |
 | giftCard | Boolean |  no  |  |
 | totalDiscountSet | [TotalDiscountSet](#TotalDiscountSet) |  no  |  |

---


 
 
 #### [LineItemsArticle](#LineItemsArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantities | [Quantities](#Quantities) |  no  |  |
 | oldArticleUid | String |  no  |  |
 | totalQuantity | Int |  no  |  |
 | manufacturer | [Manufacturer](#Manufacturer) |  no  |  |
 | price | [ArticlePrice](#ArticlePrice) |  no  |  |
 | trackInventory | Boolean |  no  |  |
 | company | [Company](#Company) |  no  |  |
 | isActive | Boolean |  no  |  |
 | dateMeta | [FailOrderDateMeta](#FailOrderDateMeta) |  no  |  |
 | fragile | Boolean |  no  |  |
 | marketplaceIdentifiers | [MarketplaceIdentifiers](#MarketplaceIdentifiers) |  no  |  |
 | size | String |  no  |  |
 | isSet | Boolean |  no  |  |
 | dimension | [Dimension](#Dimension) |  no  |  |
 | weight | [Weight](#Weight) |  no  |  |
 | store | [Store](#Store) |  no  |  |
 | meta | [ArticleMeta](#ArticleMeta) |  no  |  |
 | uid | String |  no  |  |
 | brand | [ArticleBrand](#ArticleBrand) |  no  |  |
 | itemId | Int |  no  |  |
 | fyndArticleCode | String |  no  |  |
 | id | String |  no  |  |
 | identifier | [LineItemsArticleIdentifier](#LineItemsArticleIdentifier) |  no  |  |
 | sellerIdentifier | String |  no  |  |
 | fyndItemCode | String |  no  |  |
 | countryOfOrigin | String |  no  |  |

---


 
 
 #### [Quantities](#Quantities)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | notAvailable | [NotAvailable](#NotAvailable) |  no  |  |
 | sellable | [Sellable](#Sellable) |  no  |  |
 | orderCommitted | [OrderCommitted](#OrderCommitted) |  no  |  |
 | damaged | [Damaged](#Damaged) |  no  |  |

---


 
 
 #### [NotAvailable](#NotAvailable)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |
 | updatedAt | String |  no  |  |

---


 
 
 #### [Sellable](#Sellable)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |
 | updatedAt | String |  no  |  |

---


 
 
 #### [OrderCommitted](#OrderCommitted)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |
 | updatedAt | String |  no  |  |

---


 
 
 #### [Damaged](#Damaged)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | updatedAt | String |  no  |  |
 | count | Int |  no  |  |

---


 
 
 #### [Manufacturer](#Manufacturer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDefault | Boolean |  no  |  |
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
 | companyType | String |  no  |  |
 | businessType | String |  no  |  |
 | companyName | String |  no  |  |
 | createdOn | String |  no  |  |
 | panNo | String |  no  |  |
 | returnAllowed | Boolean |  no  |  |
 | meta | String |  no  |  |
 | exchangeAllowed | Boolean |  no  |  |
 | agreementStartDate | String |  no  |  |
 | exchangeWithinDays | Int |  no  |  |
 | paymentProcesingCharge | Int |  no  |  |
 | fyndAFitAvailable | Boolean |  no  |  |
 | modifiedOn | String |  no  |  |
 | returnWithinDays | Int |  no  |  |

---


 
 
 #### [FailOrderDateMeta](#FailOrderDateMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addedOnStore | String |  no  |  |
 | inventoryUpdatedOn | String |  no  |  |
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |

---


 
 
 #### [MarketplaceIdentifiers](#MarketplaceIdentifiers)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tatacliqLuxury | [TatacliqLuxury](#TatacliqLuxury) |  no  |  |

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
 | isDefault | Boolean |  no  |  |

---


 
 
 #### [Weight](#Weight)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDefault | Boolean |  no  |  |
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
 | skuCode | String |  no  |  |

---


 
 
 #### [PriceSet](#PriceSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shopMoney | [PriceSetShopMoney](#PriceSetShopMoney) |  no  |  |
 | presentmentMoney | [PriceSetPresentmentMoney](#PriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [PriceSetShopMoney](#PriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [PriceSetPresentmentMoney](#PriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [TaxLines](#TaxLines)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | price | String |  no  |  |
 | rate | Int |  no  |  |
 | priceSet | [TaxLinesPriceSet](#TaxLinesPriceSet) |  no  |  |

---


 
 
 #### [TaxLinesPriceSet](#TaxLinesPriceSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shopMoney | [TaxLinesPriceSetShopMoney](#TaxLinesPriceSetShopMoney) |  no  |  |
 | presentmentMoney | [TaxLinesPriceSetPresentmentMoney](#TaxLinesPriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [TaxLinesPriceSetShopMoney](#TaxLinesPriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [TaxLinesPriceSetPresentmentMoney](#TaxLinesPriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currencyCode | String |  no  |  |
 | amount | String |  no  |  |

---


 
 
 #### [TotalDiscountSet](#TotalDiscountSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | presentmentMoney | [TotalDiscountSetPresentmentMoney](#TotalDiscountSetPresentmentMoney) |  no  |  |
 | shopMoney | [TotalDiscountSetShopMoney](#TotalDiscountSetShopMoney) |  no  |  |

---


 
 
 #### [TotalDiscountSetPresentmentMoney](#TotalDiscountSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [TotalDiscountSetShopMoney](#TotalDiscountSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [BillingAddress](#BillingAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address1 | String |  no  |  |
 | city | String |  no  |  |
 | zip | String |  no  |  |
 | lastName | String |  no  |  |
 | address2 | String |  no  |  |
 | longitude | Double |  no  |  |
 | provinceCode | String |  no  |  |
 | phone | String |  no  |  |
 | company | String |  no  |  |
 | latitude | Double |  no  |  |
 | name | String |  no  |  |
 | country | String |  no  |  |
 | countryCode | String |  no  |  |
 | firstName | String |  no  |  |
 | province | String |  no  |  |

---


 
 
 #### [TotalShippingPriceSet](#TotalShippingPriceSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shopMoney | [TotalShippingPriceSetShopMoney](#TotalShippingPriceSetShopMoney) |  no  |  |
 | presentmentMoney | [TotalShippingPriceSetPresentmentMoney](#TotalShippingPriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [TotalShippingPriceSetShopMoney](#TotalShippingPriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [TotalShippingPriceSetPresentmentMoney](#TotalShippingPriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [Customer](#Customer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdAt | String |  no  |  |
 | id | Int |  no  |  |
 | lastName | String |  no  |  |
 | state | String |  no  |  |
 | lastOrderId | Int |  no  |  |
 | note | String |  no  |  |
 | verifiedEmail | Boolean |  no  |  |
 | phone | String |  no  |  |
 | acceptsMarketing | Boolean |  no  |  |
 | firstName | String |  no  |  |
 | tags | String |  no  |  |
 | lastOrderName | String |  no  |  |
 | ordersCount | Int |  no  |  |
 | totalSpent | String |  no  |  |
 | taxExempt | Boolean |  no  |  |
 | currency | String |  no  |  |
 | acceptsMarketingUpdatedAt | String |  no  |  |
 | email | String |  no  |  |
 | updatedAt | String |  no  |  |
 | adminGraphqlApiId | String |  no  |  |
 | defaultAddress | [DefaultAddress](#DefaultAddress) |  no  |  |

---


 
 
 #### [DefaultAddress](#DefaultAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lastName | String |  no  |  |
 | name | String |  no  |  |
 | provinceCode | String |  no  |  |
 | countryCode | String |  no  |  |
 | isDefault | Boolean |  no  |  |
 | id | Int |  no  |  |
 | customerId | Int |  no  |  |
 | firstName | String |  no  |  |
 | address1 | String |  no  |  |
 | phone | String |  no  |  |
 | countryName | String |  no  |  |
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
 | shopMoney | [TotalLineItemsPriceSetShopMoney](#TotalLineItemsPriceSetShopMoney) |  no  |  |
 | presentmentMoney | [TotalLineItemsPriceSetPresentmentMoney](#TotalLineItemsPriceSetPresentmentMoney) |  no  |  |

---


 
 
 #### [TotalLineItemsPriceSetShopMoney](#TotalLineItemsPriceSetShopMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [TotalLineItemsPriceSetPresentmentMoney](#TotalLineItemsPriceSetPresentmentMoney)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | String |  no  |  |
 | currencyCode | String |  no  |  |

---


 
 
 #### [ShippingAddress](#ShippingAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address1 | String |  no  |  |
 | zip | String |  no  |  |
 | address2 | String |  no  |  |
 | countryCode | String |  no  |  |
 | country | String |  no  |  |
 | lastName | String |  no  |  |
 | latitude | Double |  no  |  |
 | provinceCode | String |  no  |  |
 | firstName | String |  no  |  |
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
 | nextOrderStatus | HashMap<String,Any>? |  yes  |  |
 | page | [PlatformOrderPage](#PlatformOrderPage)? |  yes  |  |
 | appliedFilters | [AppliedFilters](#AppliedFilters)? |  yes  |  |

---


 
 
 #### [OrderItems](#OrderItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [PlatformOrderUserInfo](#PlatformOrderUserInfo) |  no  |  |
 | deliveryAddress | [PlatformDeliveryAddress](#PlatformDeliveryAddress) |  no  |  |
 | channel | [Channel](#Channel) |  no  |  |
 | id | String |  no  |  |
 | application | [PlatformApplication](#PlatformApplication) |  no  |  |
 | shipments | [PlatformShipment](#PlatformShipment) |  no  |  |
 | createdAt | String |  no  |  |
 | totalShipmentsInOrder | Int |  no  |  |

---


 
 
 #### [PlatformOrderUserInfo](#PlatformOrderUserInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String |  no  |  |
 | firstName | String |  no  |  |
 | gender | String |  no  |  |
 | email | String |  no  |  |
 | lastName | String |  no  |  |
 | isAnonymousUser | Boolean |  no  |  |
 | uid | Int |  no  |  |
 | avisUserId | String |  no  |  |

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
 | updatedAt | String |  no  |  |
 | city | String |  no  |  |
 | landmark | String |  no  |  |
 | createdAt | String |  no  |  |
 | name | String |  no  |  |
 | address | String |  no  |  |
 | phone | String |  no  |  |
 | longitude | Double |  no  |  |
 | addressType | String |  no  |  |
 | email | String |  no  |  |
 | pincode | String |  no  |  |
 | address2 | String |  no  |  |
 | contactPerson | String |  no  |  |
 | addressCategory | String |  no  |  |

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
 | totalShipmentBags | Int |  no  |  |

---


 
 
 #### [PlatformShipmentStatus](#PlatformShipmentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | bagList | ArrayList<Int> |  no  |  |
 | createdAt | String |  no  |  |
 | status | String |  no  |  |
 | name | String |  no  |  |
 | progress | Int |  no  |  |
 | shipmentId | String |  no  |  |
 | currentShipmentStatus | String |  no  |  |
 | colorCode | String |  no  |  |

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
 | slugKey | String |  no  |  |
 | canReturn | Boolean |  no  |  |
 | brandId | Int |  no  |  |
 | l2Category | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | code | String |  no  |  |
 | canCancel | Boolean |  no  |  |
 | attributes | [BagItemAttributes](#BagItemAttributes) |  no  |  |
 | l3CategoryName | String |  no  |  |
 | l3Category | Int |  no  |  |
 | l1Category | ArrayList<String> |  no  |  |
 | image | ArrayList<String> |  no  |  |
 | brand | String |  no  |  |
 | lastUpdatedAt | String |  no  |  |

---


 
 
 #### [BagItemAttributes](#BagItemAttributes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCode | String |  no  |  |
 | brandName | String |  no  |  |
 | countryOfOrigin | String |  no  |  |

---


 
 
 #### [ShipmentPrices](#ShipmentPrices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | refundAmount | Double |  no  |  |
 | cashbackApplied | Double |  no  |  |
 | transferPrice | Double |  no  |  |
 | couponValue | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | deliveryCharge | Double |  no  |  |
 | couponEffectiveDiscount | Double |  no  |  |
 | codCharges | Double |  no  |  |
 | refundCredit | Double |  no  |  |
 | addedToFyndCash | Boolean |  no  |  |
 | gstTaxPercentage | Double |  no  |  |
 | priceMarked | Double |  no  |  |
 | priceEffective | Double |  no  |  |
 | discount | Double |  no  |  |
 | promotionEffectiveDiscount | Double |  no  |  |
 | amountPaidRoundoff | Double |  no  |  |
 | fyndCredits | Double |  no  |  |
 | brandCalculatedAmount | Double |  no  |  |
 | cashback | Double |  no  |  |
 | valueOfGood | Double |  no  |  |

---


 
 
 #### [Payments](#Payments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | displayName | String |  no  |  |
 | logo | String |  no  |  |
 | source | String |  no  |  |
 | sourceNickname | String |  no  |  |
 | displayPriority | Int |  no  |  |
 | id | Int |  no  |  |
 | mode | String |  no  |  |
 | paymentIdentifier | String |  no  |  |

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
 | isDefault | Boolean |  no  |  |
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
 | hasNext | Boolean |  no  |  |
 | itemTotal | [ItemTotal](#ItemTotal) |  no  |  |

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
 | fromDate | String |  no  |  |
 | toDate | String |  no  |  |

---


 
 
 #### [OrderDetails](#OrderDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[OrderPicklistListing](#OrderPicklistListing)>? |  yes  |  |
 | page | [PlatformOrderPage](#PlatformOrderPage)? |  yes  |  |
 | filters | [Filters](#Filters)? |  yes  |  |
 | nextOrderStatus | HashMap<String,Any>? |  yes  |  |
 | appliedFilters | [AppliedFilters](#AppliedFilters)? |  yes  |  |

---


 
 
 #### [OrderDetailsItem](#OrderDetailsItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [PlatformOrderUserInfo](#PlatformOrderUserInfo) |  no  |  |
 | deliveryAddress | [PlatformDeliveryAddress](#PlatformDeliveryAddress) |  no  |  |
 | channel | [Channel](#Channel) |  no  |  |
 | breakupValues | [PlatformBreakupValues](#PlatformBreakupValues) |  no  |  |
 | id | String |  no  |  |
 | application | [PlatformApplication](#PlatformApplication) |  no  |  |
 | shipments | [PlatformShipmentDetails](#PlatformShipmentDetails) |  no  |  |
 | createdAt | String |  no  |  |
 | totalShipmentsInOrder | Int |  no  |  |
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
 | breakupValues | [ShipmentBreakupValues](#ShipmentBreakupValues) |  no  |  |
 | id | String |  no  |  |
 | dpDetails | [DpDetails](#DpDetails) |  no  |  |
 | invoice | [ShipmentInvoice](#ShipmentInvoice) |  no  |  |
 | fulfillingStore | [PlatformFulfillingStore](#PlatformFulfillingStore) |  no  |  |
 | payments | [Payments](#Payments) |  no  |  |
 | gst | [ShipmentGst](#ShipmentGst) |  no  |  |
 | company | [Company](#Company) |  no  |  |
 | brand | [PlatformShipmentDetailsBrand](#PlatformShipmentDetailsBrand) |  no  |  |
 | coupon | HashMap<String,Any> |  no  |  |
 | orderSource | String |  no  |  |
 | isNotFyndSource | Boolean |  no  |  |
 | comment | String |  no  |  |
 | promise | [Promise](#Promise) |  no  |  |
 | trackingDetails | [ShipmentTrackingDetails](#ShipmentTrackingDetails) |  no  |  |
 | isFyndCoupon | Boolean |  no  |  |
 | orderType | String |  no  |  |
 | totalShipmentBags | Int |  no  |  |
 | pod | HashMap<String,Any> |  no  |  |
 | lockStatus | Boolean |  no  |  |
 | orderingChannel | String |  no  |  |

---


 
 
 #### [PlatformShipmentDetailsStatus](#PlatformShipmentDetailsStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | bagList | ArrayList<Int> |  no  |  |
 | createdAt | String |  no  |  |
 | status | String |  no  |  |
 | name | String |  no  |  |
 | progress | Int |  no  |  |
 | shipmentId | String |  no  |  |
 | currentShipmentStatus | String |  no  |  |
 | colorCode | String |  no  |  |

---


 
 
 #### [BagsDetails](#BagsDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | financialBreakup | ArrayList<[BagFinancialBreakup](#BagFinancialBreakup)> |  no  |  |
 | status | [BagCurrStatus](#BagCurrStatus) |  no  |  |
 | item | [BagItem](#BagItem) |  no  |  |
 | article | [BagArticle](#BagArticle) |  no  |  |
 | id | Int |  no  |  |
 | prices | [BagPrices](#BagPrices) |  no  |  |
 | gstDetails | [GstDetails](#GstDetails) |  no  |  |
 | breakupValues | [BagBreakupValues](#BagBreakupValues) |  no  |  |
 | updateTime | Int |  no  |  |
 | currentStatus | [BagCurrentStatus](#BagCurrentStatus) |  no  |  |
 | bagStatus | [BagStatus](#BagStatus) |  no  |  |

---


 
 
 #### [BagFinancialBreakup](#BagFinancialBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | valueOfGood | Double |  no  |  |
 | hsnCode | String |  no  |  |
 | priceEffective | Double |  no  |  |
 | codCharges | Double |  no  |  |
 | gstFee | String |  no  |  |
 | fyndCredits | Double |  no  |  |
 | refundAmount | Double |  no  |  |
 | cashbackApplied | Double |  no  |  |
 | transferPrice | Double |  no  |  |
 | amountPaidRoundoff | Double |  no  |  |
 | couponValue | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | gstTaxPercentage | Double |  no  |  |
 | size | String |  no  |  |
 | totalUnits | Int |  no  |  |
 | discount | Double |  no  |  |
 | couponEffectiveDiscount | Double |  no  |  |
 | cashback | Double |  no  |  |
 | promotionEffectiveDiscount | Double |  no  |  |
 | gstTag | String |  no  |  |
 | deliveryCharge | Double |  no  |  |
 | refundCredit | Double |  no  |  |
 | priceMarked | Double |  no  |  |
 | identifiers | [Identifiers](#Identifiers) |  no  |  |
 | itemName | String |  no  |  |
 | addedToFyndCash | Boolean |  no  |  |
 | brandCalculatedAmount | Double |  no  |  |

---


 
 
 #### [Identifiers](#Identifiers)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ean | String |  no  |  |

---


 
 
 #### [BagCurrStatus](#BagCurrStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enableTracking | Boolean |  no  |  |
 | isCustomerReturnAllowed | Boolean |  no  |  |
 | isActive | Boolean |  no  |  |
 | isReturnable | Boolean |  no  |  |
 | canBeCancelled | Boolean |  no  |  |

---


 
 
 #### [BagArticle](#BagArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifiers | [ArticleIdentifiers](#ArticleIdentifiers) |  no  |  |
 | espModified | Boolean |  no  |  |
 | isSet | Boolean |  no  |  |
 | size | String |  no  |  |
 | code | String |  no  |  |
 | set | [Set](#Set) |  no  |  |
 | sellerIdentifier | String |  no  |  |
 | returnConfig | [BagArticleReturnConfig](#BagArticleReturnConfig) |  no  |  |
 | id | String |  no  |  |
 | uid | String |  no  |  |
 | childDetails | HashMap<String,Any> |  no  |  |

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
 | sizeDistribution | [SetSizeDistribution](#SetSizeDistribution) |  no  |  |

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
 | brandCalculatedAmount | Double |  no  |  |
 | gstFee | String |  no  |  |
 | gstTag | String |  no  |  |
 | hsnCode | String |  no  |  |
 | valueOfGood | Double |  no  |  |
 | gstTaxPercentage | Double |  no  |  |
 | isDefaultHsnCode | Boolean |  no  |  |

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
 | updatedAt | String |  no  |  |
 | bagStateMapper | [BagStateMapper](#BagStateMapper) |  no  |  |
 | status | String |  no  |  |
 | stateType | String |  no  |  |

---


 
 
 #### [BagStateMapper](#BagStateMapper)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appStateName | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | displayName | String |  no  |  |
 | name | String |  no  |  |
 | appDisplayName | String |  no  |  |

---


 
 
 #### [BagStatus](#BagStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | stateType | String |  no  |  |
 | updatedAt | String |  no  |  |
 | bagStateMapper | [BagStatusBagStateMapper](#BagStatusBagStateMapper) |  no  |  |

---


 
 
 #### [BagStatusBagStateMapper](#BagStatusBagStateMapper)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | displayName | String |  no  |  |
 | name | String |  no  |  |
 | appDisplayName | String |  no  |  |
 | appStateName | String |  no  |  |

---


 
 
 #### [BagPrices](#BagPrices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cashback | Double |  no  |  |
 | refundCredit | Double |  no  |  |
 | couponValue | Double |  no  |  |
 | deliveryCharge | Double |  no  |  |
 | fyndCredits | Double |  no  |  |
 | priceMarked | Double |  no  |  |
 | cashbackApplied | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | amountPaidRoundoff | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | codCharges | Double |  no  |  |
 | priceEffective | Double |  no  |  |
 | refundAmount | Double |  no  |  |
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
 | gstTag | String |  no  |  |

---


 
 
 #### [ShipmentInvoice](#ShipmentInvoice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentType | String |  no  |  |
 | updatedDate | String |  no  |  |
 | invoiceUrl | String |  no  |  |
 | labelUrl | String |  no  |  |
 | paymentMode | String |  no  |  |
 | amountToCollect | Double |  no  |  |
 | rtoAddress | [RtoAddress](#RtoAddress) |  no  |  |

---


 
 
 #### [RtoAddress](#RtoAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | id | Int |  no  |  |
 | phone | String |  no  |  |
 | locationType | String |  no  |  |
 | storeAddressJson | [StoreAddressJson](#StoreAddressJson) |  no  |  |
 | code | String |  no  |  |
 | address1 | String |  no  |  |
 | city | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |
 | companyId | Int |  no  |  |
 | contactPerson | String |  no  |  |
 | state | String |  no  |  |
 | storeEmail | String |  no  |  |
 | address2 | String |  no  |  |

---


 
 
 #### [StoreAddressJson](#StoreAddressJson)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | latitude | Double |  no  |  |
 | updatedAt | String |  no  |  |
 | area | String |  no  |  |
 | state | String |  no  |  |
 | addressType | String |  no  |  |
 | city | String |  no  |  |
 | pincode | String |  no  |  |
 | address1 | String |  no  |  |
 | address2 | String |  no  |  |
 | longitude | Double |  no  |  |
 | email | String |  no  |  |
 | phone | String |  no  |  |
 | createdAt | String |  no  |  |
 | contactPerson | String |  no  |  |
 | addressCategory | String |  no  |  |
 | version | String |  no  |  |
 | landmark | String |  no  |  |

---


 
 
 #### [PlatformFulfillingStore](#PlatformFulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | packagingMaterialCount | Int |  no  |  |
 | locationType | String |  no  |  |
 | code | String |  no  |  |
 | city | String |  no  |  |
 | meta | [FulfillingStoreMeta](#FulfillingStoreMeta) |  no  |  |
 | name | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | address1 | String |  no  |  |
 | storeEmail | String |  no  |  |
 | isArchived | Boolean |  no  |  |
 | state | String |  no  |  |
 | address2 | String |  no  |  |
 | contactPerson | String |  no  |  |
 | phone | String |  no  |  |
 | isEnabledForRecon | Boolean |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | createdAt | String |  no  |  |
 | id | Int |  no  |  |
 | pincode | String |  no  |  |
 | brandStoreTags | ArrayList<String> |  no  |  |
 | companyId | Int |  no  |  |
 | storeAddressJson | [FulfillingStoreStoreAddressJson](#FulfillingStoreStoreAddressJson) |  no  |  |
 | updatedAt | String |  no  |  |
 | loginUsername | String |  no  |  |
 | country | String |  no  |  |

---


 
 
 #### [FulfillingStoreMeta](#FulfillingStoreMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | additionalContactDetails | [AdditionalContactDetails](#AdditionalContactDetails) |  no  |  |
 | documents | [Documents](#Documents) |  no  |  |
 | gstNumber | String |  no  |  |
 | displayName | String |  no  |  |
 | productReturnConfig | [ProductReturnConfig](#ProductReturnConfig) |  no  |  |
 | allowDpAssignmentFromFynd | Boolean |  no  |  |
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
 | legalName | String |  no  |  |
 | type | String |  no  |  |
 | value | String |  no  |  |
 | verified | Boolean |  no  |  |

---


 
 
 #### [ProductReturnConfig](#ProductReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | onSameStore | Boolean |  no  |  |

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
 | contactPerson | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |
 | version | String |  no  |  |
 | createdAt | String |  no  |  |
 | addressType | String |  no  |  |
 | city | String |  no  |  |
 | address1 | String |  no  |  |
 | landmark | String |  no  |  |
 | latitude | Double |  no  |  |
 | longitude | Double |  no  |  |
 | updatedAt | String |  no  |  |
 | addressCategory | String |  no  |  |

---


 
 
 #### [ShipmentGst](#ShipmentGst)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandCalculatedAmount | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | gstFee | Double |  no  |  |

---


 
 
 #### [PlatformShipmentDetailsBrand](#PlatformShipmentDetailsBrand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | creditNoteAllowed | Boolean |  no  |  |
 | brandName | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | id | Int |  no  |  |
 | isVirtualInvoice | Boolean |  no  |  |
 | createdOn | String |  no  |  |
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
 | isPassed | Boolean |  no  |  |
 | isCurrent | Boolean |  no  |  |

---


 
 
 #### [ItemsPayments](#ItemsPayments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayPriority | Int |  no  |  |
 | id | Int |  no  |  |
 | isActive | Boolean |  no  |  |
 | displayName | String |  no  |  |
 | logo | String |  no  |  |
 | paymentIdentifier | String |  no  |  |
 | sourceNickname | String |  no  |  |
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
 | requestId | String? |  yes  |  |
 | message | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | resendTimer | Int? |  yes  |  |
 | resendToken | String |  no  |  |

---


 
 
 #### [OrderPicklistListing](#OrderPicklistListing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [PlatformOrderUserInfo](#PlatformOrderUserInfo) |  no  |  |
 | deliveryAddress | [PlatformDeliveryAddress](#PlatformDeliveryAddress) |  no  |  |
 | channel | [Channel](#Channel) |  no  |  |
 | breakupValues | [PlatformBreakupValues](#PlatformBreakupValues) |  no  |  |
 | id | String |  no  |  |
 | application | [PlatformApplication](#PlatformApplication) |  no  |  |
 | shipments | [PlatformShipmentDetails](#PlatformShipmentDetails) |  no  |  |
 | createdAt | String |  no  |  |
 | totalShipmentsInOrder | Int |  no  |  |
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
 | addressType | String |  no  |  |
 | addressCategory | String |  no  |  |
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
 | addressType | String? |  yes  |  |
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
 | bagList | ArrayList<[ShipmentTrackResponseBagListItem](#ShipmentTrackResponseBagListItem)>? |  yes  |  |
 | message | String? |  yes  |  |
 | orderValue | Int? |  yes  |  |

---


 
 
 #### [ShipmentTrackResponseBagListItem](#ShipmentTrackResponseBagListItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enableTracking | Boolean |  no  |  |
 | price | String |  no  |  |
 | timeSlot | String |  no  |  |
 | productName | String |  no  |  |
 | canReturn | Boolean |  no  |  |
 | orderDate | String |  no  |  |
 | isTryAtHome | Boolean |  no  |  |
 | breakupValues | ArrayList<[ShipmentTrackResponseBagListItemBreakValues](#ShipmentTrackResponseBagListItemBreakValues)> |  no  |  |
 | statuses | ArrayList<[ShipmentTrackResponseBagListItemStatuses](#ShipmentTrackResponseBagListItemStatuses)> |  no  |  |
 | isActive | Boolean |  no  |  |
 | bagId | String |  no  |  |
 | orderId | String |  no  |  |
 | size | String |  no  |  |
 | paymentModeSource | String |  no  |  |
 | dpDetails | [ShipmentTrackResponseBagListItemDpDetails](#ShipmentTrackResponseBagListItemDpDetails) |  no  |  |
 | productId | Int |  no  |  |
 | productImage | [ShipmentTrackResponseBagListItemsProductImage](#ShipmentTrackResponseBagListItemsProductImage) |  no  |  |
 | brandName | String |  no  |  |
 | priceMarked | String |  no  |  |
 | status | String |  no  |  |
 | canCancel | Boolean |  no  |  |
 | paymentMode | String |  no  |  |
 | fyndCashMsg | String |  no  |  |
 | deliveryAddress | String |  no  |  |

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
 | npsRating | Int |  no  |  |
 | npsString | String |  no  |  |
 | progressStatus | ArrayList<[ShipmentTrackResponseBagListItemStatusesProgress](#ShipmentTrackResponseBagListItemStatusesProgress)> |  no  |  |
 | flowType | String |  no  |  |
 | statusProgress | Int |  no  |  |
 | isNpsDone | Boolean |  no  |  |
 | headerMessage | String |  no  |  |
 | isDelayed | String |  no  |  |
 | trackingList | ArrayList<[ShipmentTrackResponseBagListItemStatusesTrack](#ShipmentTrackResponseBagListItemStatusesTrack)> |  no  |  |

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
 | isPassed | Boolean |  no  |  |
 | isCurrent | Boolean |  no  |  |

---


 
 
 #### [ShipmentTrackResponseBagListItemDpDetails](#ShipmentTrackResponseBagListItemDpDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | trackingNo | String |  no  |  |
 | courier | String |  no  |  |

---


 
 
 #### [ShipmentTrackResponseBagListItemsProductImage](#ShipmentTrackResponseBagListItemsProductImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [UpdateShipmentStatusResponse](#UpdateShipmentStatusResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | HashMap<String,Any>? |  yes  |  |
 | errorShipments | ArrayList<Any> |  no  |  |

---


 
 
 #### [UpdateShipmentStatusBody](#UpdateShipmentStatusBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | HashMap<String,Any>? |  yes  |  |
 | forceTransition | Boolean? |  yes  |  |
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
 | reasonId | Double |  no  |  |
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
 | updatedAt | String |  no  |  |
 | lastLocationRecievedAt | String |  no  |  |
 | reason | String |  no  |  |
 | shipmentType | String |  no  |  |
 | status | String |  no  |  |
 | updatedTime | String |  no  |  |
 | accountName | String |  no  |  |

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
 | shipmentIds | ArrayList<String>? |  yes  |  |
 | expectedStatus | String? |  yes  |  |

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




 
 
 #### [DeleteResponse](#DeleteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | Int |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | message | String |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [GetSearchWordsData](#GetSearchWordsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | HashMap<String,Any> |  no  |  |
 | words | ArrayList<String> |  no  |  |
 | uid | String |  no  |  |
 | appId | String |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |

---


 
 
 #### [GetSearchWordsDetailResponse](#GetSearchWordsDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | [GetSearchWordsData](#GetSearchWordsData) |  no  |  |

---


 
 
 #### [SearchKeywordResult](#SearchKeywordResult)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sortOn | String? |  yes  |  |
 | query | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [CreateSearchKeyword](#CreateSearchKeyword)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | result | [SearchKeywordResult](#SearchKeywordResult)? |  yes  |  |
 | words | ArrayList<String> |  no  |  |
 | appId | String |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |

---


 
 
 #### [GetSearchWordsResponse](#GetSearchWordsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[GetSearchWordsData](#GetSearchWordsData)> |  no  |  |

---


 
 
 #### [GetAutocompleteWordsData](#GetAutocompleteWordsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | words | ArrayList<String> |  no  |  |
 | uid | String |  no  |  |
 | appId | String |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | results | ArrayList<HashMap<String,Any>> |  no  |  |

---


 
 
 #### [GetAutocompleteWordsResponse](#GetAutocompleteWordsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[GetAutocompleteWordsData](#GetAutocompleteWordsData)> |  no  |  |

---


 
 
 #### [Media](#Media)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [AutocompletePageAction](#AutocompletePageAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | params | HashMap<String,Any> |  no  |  |
 | type | String? |  yes  |  |
 | url | String |  no  |  |
 | query | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [AutocompleteAction](#AutocompleteAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [AutocompletePageAction](#AutocompletePageAction) |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [AutocompleteResult](#AutocompleteResult)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Any> |  no  |  |
 | logo | [Media](#Media) |  no  |  |
 | display | String |  no  |  |
 | action | [AutocompleteAction](#AutocompleteAction) |  no  |  |

---


 
 
 #### [CreateAutocompleteKeyword](#CreateAutocompleteKeyword)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | words | ArrayList<String> |  no  |  |
 | appId | String |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | results | ArrayList<[AutocompleteResult](#AutocompleteResult)> |  no  |  |

---


 
 
 #### [CreateAutocompleteWordsResponse](#CreateAutocompleteWordsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | words | ArrayList<String> |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | results | ArrayList<HashMap<String,Any>> |  no  |  |
 | appId | String |  no  |  |

---


 
 
 #### [ProductBundleItem](#ProductBundleItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | productUid | Int? |  yes  |  |
 | minQuantity | Int? |  yes  |  |
 | allowRemove | Boolean |  no  |  |
 | autoSelect | Boolean |  no  |  |
 | maxQuantity | Int? |  yes  |  |
 | autoAddToCart | Boolean |  no  |  |

---


 
 
 #### [ProductBundleRequest](#ProductBundleRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | choice | String? |  yes  |  |
 | logo | String |  no  |  |
 | products | ArrayList<[ProductBundleItem](#ProductBundleItem)>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | modifiedBy | HashMap<String,Any> |  no  |  |
 | modifiedOn | String |  no  |  |
 | createdBy | HashMap<String,Any> |  no  |  |
 | createdOn | String |  no  |  |
 | name | String? |  yes  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | slug | String? |  yes  |  |
 | pageVisibility | ArrayList<String> |  no  |  |
 | sameStoreAssignment | Boolean |  no  |  |

---


 
 
 #### [GetProductBundleCreateResponse](#GetProductBundleCreateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | choice | String? |  yes  |  |
 | logo | String |  no  |  |
 | products | ArrayList<[ProductBundleItem](#ProductBundleItem)>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | modifiedBy | HashMap<String,Any> |  no  |  |
 | modifiedOn | String |  no  |  |
 | createdBy | HashMap<String,Any> |  no  |  |
 | id | String |  no  |  |
 | companyId | Int |  no  |  |
 | createdOn | String |  no  |  |
 | name | String? |  yes  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | slug | String? |  yes  |  |
 | pageVisibility | ArrayList<String> |  no  |  |
 | sameStoreAssignment | Boolean |  no  |  |

---


 
 
 #### [GetProductBundleListingResponse](#GetProductBundleListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[GetProductBundleCreateResponse](#GetProductBundleCreateResponse)> |  no  |  |

---


 
 
 #### [Size](#Size)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isAvailable | Boolean |  no  |  |
 | value | String |  no  |  |
 | display | String |  no  |  |
 | quantity | Int |  no  |  |

---


 
 
 #### [Price](#Price)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | maxEffective | Double |  no  |  |
 | minEffective | Double |  no  |  |
 | currency | String |  no  |  |
 | maxMarked | Double |  no  |  |
 | minMarked | Double |  no  |  |

---


 
 
 #### [LimitedProductData](#LimitedProductData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | images | ArrayList<String> |  no  |  |
 | price | HashMap<String,Any> |  no  |  |
 | quantity | Int |  no  |  |
 | shortDescription | String |  no  |  |
 | sizes | ArrayList<String> |  no  |  |
 | identifier | HashMap<String,Any> |  no  |  |
 | countryOfOrigin | String |  no  |  |
 | attributes | HashMap<String,Any> |  no  |  |
 | uid | Int |  no  |  |
 | slug | String |  no  |  |
 | itemCode | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [GetProducts](#GetProducts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | productUid | Int |  no  |  |
 | sizes | ArrayList<[Size](#Size)> |  no  |  |
 | price | [Price](#Price) |  no  |  |
 | minQuantity | Int |  no  |  |
 | productDetails | [LimitedProductData](#LimitedProductData) |  no  |  |
 | allowRemove | Boolean |  no  |  |
 | autoSelect | Boolean |  no  |  |
 | maxQuantity | Int |  no  |  |
 | autoAddToCart | Boolean |  no  |  |

---


 
 
 #### [GetProductBundleResponse](#GetProductBundleResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | choice | String |  no  |  |
 | logo | String |  no  |  |
 | products | ArrayList<[GetProducts](#GetProducts)> |  no  |  |
 | isActive | Boolean |  no  |  |
 | companyId | Int |  no  |  |
 | pageVisibility | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | sameStoreAssignment | Boolean |  no  |  |

---


 
 
 #### [ProductBundleUpdateRequest](#ProductBundleUpdateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | choice | String? |  yes  |  |
 | logo | String |  no  |  |
 | products | ArrayList<[ProductBundleItem](#ProductBundleItem)>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | modifiedBy | HashMap<String,Any> |  no  |  |
 | modifiedOn | String |  no  |  |
 | name | String? |  yes  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | slug | String? |  yes  |  |
 | pageVisibility | ArrayList<String> |  no  |  |
 | sameStoreAssignment | Boolean |  no  |  |

---


 
 
 #### [Meta](#Meta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | headers | HashMap<String,Any> |  no  |  |
 | unit | String |  no  |  |
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
 | description | String |  no  |  |
 | subtitle | String |  no  |  |
 | image | String |  no  |  |
 | modifiedBy | HashMap<String,Any> |  no  |  |
 | modifiedOn | String |  no  |  |
 | id | String |  no  |  |
 | createdBy | HashMap<String,Any> |  no  |  |
 | guide | [Guide](#Guide) |  no  |  |
 | companyId | Int |  no  |  |
 | title | String? |  yes  |  |
 | createdOn | String |  no  |  |
 | active | Boolean |  no  |  |
 | name | String? |  yes  |  |
 | brandId | Int |  no  |  |
 | tag | String |  no  |  |

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
 | subtitle | String |  no  |  |
 | modifiedBy | HashMap<String,Any> |  no  |  |
 | modifiedOn | String |  no  |  |
 | id | String |  no  |  |
 | createdBy | HashMap<String,Any> |  no  |  |
 | guide | HashMap<String,Any> |  no  |  |
 | companyId | Int |  no  |  |
 | title | String |  no  |  |
 | createdOn | String |  no  |  |
 | active | Boolean |  no  |  |
 | name | String |  no  |  |
 | brandId | Int |  no  |  |
 | tag | String |  no  |  |

---


 
 
 #### [MetaDataListingSortMetaResponse](#MetaDataListingSortMetaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | display | String |  no  |  |

---


 
 
 #### [MetaDataListingSortResponse](#MetaDataListingSortResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[MetaDataListingSortMetaResponse](#MetaDataListingSortMetaResponse)> |  no  |  |

---


 
 
 #### [MetaDataListingFilterMetaResponse](#MetaDataListingFilterMetaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filterTypes | ArrayList<String> |  no  |  |
 | key | String |  no  |  |
 | display | String |  no  |  |
 | units | ArrayList<HashMap<String,Any>> |  no  |  |

---


 
 
 #### [MetaDataListingFilterResponse](#MetaDataListingFilterResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[MetaDataListingFilterMetaResponse](#MetaDataListingFilterMetaResponse)> |  no  |  |

---


 
 
 #### [MetaDataListingResponse](#MetaDataListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sort | [MetaDataListingSortResponse](#MetaDataListingSortResponse)? |  yes  |  |
 | filter | [MetaDataListingFilterResponse](#MetaDataListingFilterResponse)? |  yes  |  |

---


 
 
 #### [GetCatalogConfigurationDetailsProduct](#GetCatalogConfigurationDetailsProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | compare | HashMap<String,Any> |  no  |  |
 | detail | HashMap<String,Any> |  no  |  |
 | variant | HashMap<String,Any> |  no  |  |
 | similar | HashMap<String,Any> |  no  |  |

---


 
 
 #### [GetCatalogConfigurationMetaData](#GetCatalogConfigurationMetaData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | listing | [MetaDataListingResponse](#MetaDataListingResponse) |  no  |  |
 | product | [GetCatalogConfigurationDetailsProduct](#GetCatalogConfigurationDetailsProduct) |  no  |  |

---


 
 
 #### [ConfigurationListingSortConfig](#ConfigurationListingSortConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean? |  yes  |  |
 | logo | String |  no  |  |
 | priority | Int? |  yes  |  |
 | key | String? |  yes  |  |
 | name | String |  no  |  |

---


 
 
 #### [ConfigurationListingSort](#ConfigurationListingSort)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config | ArrayList<[ConfigurationListingSortConfig](#ConfigurationListingSortConfig)> |  no  |  |
 | defaultKey | String? |  yes  |  |

---


 
 
 #### [ConfigurationBucketPoints](#ConfigurationBucketPoints)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start | Double |  no  |  |
 | end | Double |  no  |  |

---


 
 
 #### [ConfigurationListingFilterValue](#ConfigurationListingFilterValue)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | condition | String |  no  |  |
 | bucketPoints | ArrayList<[ConfigurationBucketPoints](#ConfigurationBucketPoints)> |  no  |  |
 | value | String |  no  |  |
 | sort | String |  no  |  |
 | map | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ConfigurationListingFilterConfig](#ConfigurationListingFilterConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean? |  yes  |  |
 | logo | String |  no  |  |
 | priority | Int? |  yes  |  |
 | key | String? |  yes  |  |
 | name | String |  no  |  |
 | valueConfig | [ConfigurationListingFilterValue](#ConfigurationListingFilterValue) |  no  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [ConfigurationListingFilter](#ConfigurationListingFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allowSingle | Boolean? |  yes  |  |
 | attributeConfig | ArrayList<[ConfigurationListingFilterConfig](#ConfigurationListingFilterConfig)> |  no  |  |

---


 
 
 #### [ConfigurationListing](#ConfigurationListing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sort | [ConfigurationListingSort](#ConfigurationListingSort)? |  yes  |  |
 | filter | [ConfigurationListingFilter](#ConfigurationListingFilter)? |  yes  |  |

---


 
 
 #### [ProductSize](#ProductSize)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | Int? |  yes  |  |
 | min | Int? |  yes  |  |

---


 
 
 #### [ConfigurationProductVariantConfig](#ConfigurationProductVariantConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean? |  yes  |  |
 | logo | String |  no  |  |
 | priority | Int? |  yes  |  |
 | displayType | String? |  yes  |  |
 | size | [ProductSize](#ProductSize)? |  yes  |  |
 | key | String? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [ConfigurationProductVariant](#ConfigurationProductVariant)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config | ArrayList<[ConfigurationProductVariantConfig](#ConfigurationProductVariantConfig)> |  no  |  |

---


 
 
 #### [ConfigurationProductConfig](#ConfigurationProductConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean? |  yes  |  |
 | logo | String |  no  |  |
 | subtitle | String |  no  |  |
 | priority | Int? |  yes  |  |
 | title | String |  no  |  |
 | size | [ProductSize](#ProductSize) |  no  |  |
 | key | String? |  yes  |  |

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
 | listing | [ConfigurationListing](#ConfigurationListing) |  no  |  |
 | product | [ConfigurationProduct](#ConfigurationProduct) |  no  |  |
 | configId | String |  no  |  |
 | appId | String? |  yes  |  |
 | configType | String? |  yes  |  |

---


 
 
 #### [AppCatalogConfiguration](#AppCatalogConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | listing | [ConfigurationListing](#ConfigurationListing) |  no  |  |
 | id | String |  no  |  |
 | product | [ConfigurationProduct](#ConfigurationProduct) |  no  |  |
 | configId | String |  no  |  |
 | appId | String? |  yes  |  |
 | configType | String? |  yes  |  |

---


 
 
 #### [GetAppCatalogConfiguration](#GetAppCatalogConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [AppCatalogConfiguration](#AppCatalogConfiguration) |  no  |  |
 | isDefault | Boolean |  no  |  |

---


 
 
 #### [GetCatalogConfigurationDetailsSchemaListing](#GetCatalogConfigurationDetailsSchemaListing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sort | HashMap<String,Any> |  no  |  |
 | filter | HashMap<String,Any> |  no  |  |

---


 
 
 #### [EntityConfiguration](#EntityConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | listing | [GetCatalogConfigurationDetailsSchemaListing](#GetCatalogConfigurationDetailsSchemaListing) |  no  |  |
 | id | String |  no  |  |
 | product | [GetCatalogConfigurationDetailsProduct](#GetCatalogConfigurationDetailsProduct) |  no  |  |
 | configId | String |  no  |  |
 | appId | String? |  yes  |  |
 | configType | String? |  yes  |  |

---


 
 
 #### [GetAppCatalogEntityConfiguration](#GetAppCatalogEntityConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [EntityConfiguration](#EntityConfiguration) |  no  |  |
 | isDefault | Boolean |  no  |  |

---


 
 
 #### [ProductFiltersKey](#ProductFiltersKey)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | kind | String |  no  |  |
 | logo | String |  no  |  |
 | display | String? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [ProductFiltersValue](#ProductFiltersValue)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | queryFormat | String |  no  |  |
 | currencySymbol | String |  no  |  |
 | displayFormat | String |  no  |  |
 | isSelected | Boolean? |  yes  |  |
 | value | String? |  yes  |  |
 | max | Int |  no  |  |
 | display | String? |  yes  |  |
 | count | Int |  no  |  |
 | selectedMin | Int |  no  |  |
 | selectedMax | Int |  no  |  |
 | currencyCode | String |  no  |  |
 | min | Int |  no  |  |

---


 
 
 #### [ProductFilters](#ProductFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | [ProductFiltersKey](#ProductFiltersKey)? |  yes  |  |
 | values | ArrayList<[ProductFiltersValue](#ProductFiltersValue)>? |  yes  |  |

---


 
 
 #### [ProductSortOn](#ProductSortOn)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSelected | Boolean |  no  |  |
 | value | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [GetCollectionQueryOptionResponse](#GetCollectionQueryOptionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[ProductFilters](#ProductFilters)> |  no  |  |
 | sortOn | ArrayList<[ProductSortOn](#ProductSortOn)> |  no  |  |

---


 
 
 #### [CollectionImage](#CollectionImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [CollectionBanner](#CollectionBanner)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | landscape | [CollectionImage](#CollectionImage)? |  yes  |  |
 | portrait | [CollectionImage](#CollectionImage)? |  yes  |  |

---


 
 
 #### [UserInfo](#UserInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | username | String |  no  |  |
 | userId | String |  no  |  |
 | uid | String |  no  |  |

---


 
 
 #### [CollectionBadge](#CollectionBadge)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | color | String |  no  |  |

---


 
 
 #### [SeoDetail](#SeoDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | title | String |  no  |  |

---


 
 
 #### [Schedule](#Schedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | duration | Int |  no  |  |
 | start | String |  no  |  |
 | end | String |  no  |  |
 | cron | String |  no  |  |

---


 
 
 #### [CreateCollection](#CreateCollection)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | banners | [CollectionBanner](#CollectionBanner)? |  yes  |  |
 | modifiedBy | [UserInfo](#UserInfo) |  no  |  |
 | badge | [CollectionBadge](#CollectionBadge) |  no  |  |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | appId | String? |  yes  |  |
 | allowFacets | Boolean |  no  |  |
 | seo | [SeoDetail](#SeoDetail) |  no  |  |
 | description | String |  no  |  |
 | allowSort | Boolean |  no  |  |
 | localeLanguage | HashMap<String,Any> |  no  |  |
 | sortOn | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | logo | [CollectionImage](#CollectionImage)? |  yes  |  |
 | published | Boolean |  no  |  |
 | visibleFacetsKeys | ArrayList<String> |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | isActive | Boolean |  no  |  |
 | createdBy | [UserInfo](#UserInfo) |  no  |  |
 | schedule | [Schedule](#Schedule) |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | query | HashMap<String,Any> |  no  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [BannerImage](#BannerImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String |  no  |  |
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
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | description | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | logo | [BannerImage](#BannerImage) |  no  |  |
 | query | HashMap<String,Any> |  no  |  |
 | allowSort | Boolean |  no  |  |
 | tag | ArrayList<String> |  no  |  |
 | badge | HashMap<String,Any> |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | schedule | HashMap<String,Any> |  no  |  |
 | appId | String |  no  |  |
 | visibleFacetsKeys | ArrayList<String> |  no  |  |
 | allowFacets | Boolean |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | cron | HashMap<String,Any> |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [CollectionListingFilterTag](#CollectionListingFilterTag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | isSelected | Boolean |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [CollectionListingFilterType](#CollectionListingFilterType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | isSelected | Boolean |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [CollectionListingFilter](#CollectionListingFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tags | ArrayList<[CollectionListingFilterTag](#CollectionListingFilterTag)> |  no  |  |
 | type | ArrayList<[CollectionListingFilterType](#CollectionListingFilterType)> |  no  |  |

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


 
 
 #### [Media1](#Media1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | HashMap<String,Any> |  no  |  |
 | type | String |  no  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [GetCollectionDetailNest](#GetCollectionDetailNest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | badge | HashMap<String,Any> |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | appId | String |  no  |  |
 | allowFacets | Boolean |  no  |  |
 | tag | ArrayList<String> |  no  |  |
 | description | String |  no  |  |
 | allowSort | Boolean |  no  |  |
 | uid | String |  no  |  |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | cron | HashMap<String,Any> |  no  |  |
 | logo | [Media1](#Media1) |  no  |  |
 | visibleFacetsKeys | ArrayList<String> |  no  |  |
 | isActive | Boolean |  no  |  |
 | schedule | HashMap<String,Any> |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | query | HashMap<String,Any> |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [GetCollectionListingResponse](#GetCollectionListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | [CollectionListingFilter](#CollectionListingFilter) |  no  |  |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[GetCollectionDetailNest](#GetCollectionDetailNest)> |  no  |  |

---


 
 
 #### [CollectionDetailResponse](#CollectionDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | description | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | logo | [Media1](#Media1) |  no  |  |
 | query | HashMap<String,Any> |  no  |  |
 | allowSort | Boolean |  no  |  |
 | tag | ArrayList<String> |  no  |  |
 | badge | HashMap<String,Any> |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | schedule | HashMap<String,Any> |  no  |  |
 | appId | String |  no  |  |
 | visibleFacetsKeys | ArrayList<String> |  no  |  |
 | allowFacets | Boolean |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | cron | HashMap<String,Any> |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [UpdateCollection](#UpdateCollection)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | banners | [CollectionBanner](#CollectionBanner) |  no  |  |
 | modifiedBy | [UserInfo](#UserInfo) |  no  |  |
 | badge | [CollectionBadge](#CollectionBadge) |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | allowFacets | Boolean |  no  |  |
 | seo | [SeoDetail](#SeoDetail) |  no  |  |
 | description | String |  no  |  |
 | allowSort | Boolean |  no  |  |
 | localeLanguage | HashMap<String,Any> |  no  |  |
 | sortOn | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | logo | [CollectionImage](#CollectionImage) |  no  |  |
 | published | Boolean |  no  |  |
 | visibleFacetsKeys | ArrayList<String> |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | isActive | Boolean |  no  |  |
 | schedule | [Schedule](#Schedule) |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | query | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CollectionItemRequest](#CollectionItemRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pageSize | Int? |  yes  |  |
 | pageNo | Int? |  yes  |  |

---


 
 
 #### [UpdatedResponse](#UpdatedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [ProductDetailAttribute](#ProductDetailAttribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | value | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ProductDetailGroupedAttribute](#ProductDetailGroupedAttribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | details | ArrayList<[ProductDetailAttribute](#ProductDetailAttribute)> |  no  |  |

---


 
 
 #### [Price1](#Price1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currencyCode | String |  no  |  |
 | currencySymbol | String |  no  |  |
 | max | Double |  no  |  |
 | min | Double |  no  |  |

---


 
 
 #### [ProductListingPrice](#ProductListingPrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marked | [Price1](#Price1) |  no  |  |
 | effective | [Price1](#Price1) |  no  |  |

---


 
 
 #### [ProductBrand](#ProductBrand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | [Media1](#Media1) |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |

---


 
 
 #### [ProductListingDetail](#ProductListingDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | similars | ArrayList<String> |  no  |  |
 | rating | Double |  no  |  |
 | name | String |  no  |  |
 | slug | String? |  yes  |  |
 | highlights | ArrayList<String> |  no  |  |
 | groupedAttributes | ArrayList<[ProductDetailGroupedAttribute](#ProductDetailGroupedAttribute)> |  no  |  |
 | description | String |  no  |  |
 | price | [ProductListingPrice](#ProductListingPrice) |  no  |  |
 | discount | String |  no  |  |
 | medias | ArrayList<[Media1](#Media1)> |  no  |  |
 | promoMeta | HashMap<String,Any> |  no  |  |
 | color | String |  no  |  |
 | ratingCount | Int |  no  |  |
 | uid | Int |  no  |  |
 | shortDescription | String |  no  |  |
 | hasVariant | Boolean |  no  |  |
 | imageNature | String |  no  |  |
 | sellable | Boolean |  no  |  |
 | productOnlineDate | String |  no  |  |
 | tryouts | ArrayList<String> |  no  |  |
 | itemType | String |  no  |  |
 | attributes | HashMap<String,Any> |  no  |  |
 | brand | [ProductBrand](#ProductBrand) |  no  |  |
 | teaserTag | HashMap<String,Any> |  no  |  |
 | itemCode | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [GetCollectionItemsResponse](#GetCollectionItemsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[ProductFilters](#ProductFilters)> |  no  |  |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[ProductListingDetail](#ProductListingDetail)> |  no  |  |
 | sortOn | ArrayList<[ProductSortOn](#ProductSortOn)> |  no  |  |

---


 
 
 #### [CatalogInsightBrand](#CatalogInsightBrand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalSizes | Int |  no  |  |
 | totalArticles | Int |  no  |  |
 | availableSizes | Int |  no  |  |
 | availableArticles | Int |  no  |  |
 | name | String |  no  |  |
 | articleFreshness | Int |  no  |  |

---


 
 
 #### [CatalogInsightItem](#CatalogInsightItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |
 | outOfStockCount | Int |  no  |  |
 | sellableCount | Int |  no  |  |

---


 
 
 #### [CatalogInsightResponse](#CatalogInsightResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandDistribution | [CatalogInsightBrand](#CatalogInsightBrand) |  no  |  |
 | item | [CatalogInsightItem](#CatalogInsightItem) |  no  |  |

---


 
 
 #### [CrossSellingData](#CrossSellingData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | articles | Int |  no  |  |
 | products | Int |  no  |  |

---


 
 
 #### [CrossSellingResponse](#CrossSellingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandDistribution | [CatalogInsightBrand](#CatalogInsightBrand) |  no  |  |
 | data | [CrossSellingData](#CrossSellingData) |  no  |  |

---


 
 
 #### [OptInPostRequest](#OptInPostRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Int> |  no  |  |
 | optLevel | String? |  yes  |  |
 | enabled | Boolean |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |

---


 
 
 #### [CompanyOptIn](#CompanyOptIn)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Int>? |  yes  |  |
 | enabled | Boolean? |  yes  |  |
 | modifiedBy | HashMap<String,Any> |  no  |  |
 | modifiedOn | Int? |  yes  |  |
 | createdBy | HashMap<String,Any> |  no  |  |
 | companyId | Int? |  yes  |  |
 | platform | String? |  yes  |  |
 | createdOn | Int? |  yes  |  |
 | storeIds | ArrayList<Int>? |  yes  |  |
 | optLevel | String? |  yes  |  |

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
 | businessType | String |  no  |  |
 | companyType | String |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [CompanyBrandDetail](#CompanyBrandDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalArticle | Int |  no  |  |
 | companyId | Int |  no  |  |
 | brandName | String |  no  |  |
 | brandId | Int |  no  |  |

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
 | store | Int |  no  |  |
 | company | String |  no  |  |
 | brand | Int |  no  |  |

---


 
 
 #### [StoreDetail](#StoreDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayName | String |  no  |  |
 | documents | ArrayList<HashMap<String,Any>> |  no  |  |
 | modifiedOn | String |  no  |  |
 | timing | HashMap<String,Any> |  no  |  |
 | storeType | String |  no  |  |
 | companyId | Int |  no  |  |
 | additionalContacts | ArrayList<HashMap<String,Any>> |  no  |  |
 | createdOn | String |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |
 | storeCode | String |  no  |  |

---


 
 
 #### [OptinStoreDetails](#OptinStoreDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[StoreDetail](#StoreDetail)> |  no  |  |

---


 
 
 #### [AttributeMasterMandatoryDetails](#AttributeMasterMandatoryDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | l3Keys | ArrayList<String> |  no  |  |

---


 
 
 #### [AttributeMasterMeta](#AttributeMasterMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enriched | Boolean |  no  |  |
 | mandatoryDetails | [AttributeMasterMandatoryDetails](#AttributeMasterMandatoryDetails)? |  yes  |  |

---


 
 
 #### [AttributeMasterFilter](#AttributeMasterFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dependsOn | ArrayList<String> |  no  |  |
 | indexing | Boolean? |  yes  |  |
 | priority | Int |  no  |  |

---


 
 
 #### [AttributeMasterDetails](#AttributeMasterDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayType | String? |  yes  |  |

---


 
 
 #### [AttributeSchemaRange](#AttributeSchemaRange)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | Int |  no  |  |
 | min | Int |  no  |  |

---


 
 
 #### [AttributeMaster](#AttributeMaster)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | multi | Boolean |  no  |  |
 | range | [AttributeSchemaRange](#AttributeSchemaRange) |  no  |  |
 | format | String |  no  |  |
 | mandatory | Boolean |  no  |  |
 | allowedValues | ArrayList<String> |  no  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [GenderDetail](#GenderDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | logo | String |  no  |  |
 | id | String |  no  |  |
 | departments | ArrayList<String> |  no  |  |
 | enabledForEndConsumer | Boolean |  no  |  |
 | name | String |  no  |  |
 | meta | [AttributeMasterMeta](#AttributeMasterMeta) |  no  |  |
 | slug | String |  no  |  |
 | filters | [AttributeMasterFilter](#AttributeMasterFilter) |  no  |  |
 | details | [AttributeMasterDetails](#AttributeMasterDetails) |  no  |  |
 | isNested | Boolean |  no  |  |
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
 | status | Int |  no  |  |
 | message | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | code | String |  no  |  |
 | errors | HashMap<String,Any> |  no  |  |

---


 
 
 #### [UserSerializer](#UserSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String |  no  |  |
 | userId | String |  no  |  |
 | contact | String |  no  |  |

---


 
 
 #### [GetDepartment](#GetDepartment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | logo | String |  no  |  |
 | priorityOrder | Int |  no  |  |
 | modifiedOn | String |  no  |  |
 | modifiedBy | [UserSerializer](#UserSerializer) |  no  |  |
 | createdBy | [UserSerializer](#UserSerializer) |  no  |  |
 | pageSize | Int |  no  |  |
 | itemType | String |  no  |  |
 | createdOn | String |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |
 | slug | String |  no  |  |
 | search | String |  no  |  |
 | synonyms | ArrayList<String> |  no  |  |
 | pageNo | Int |  no  |  |

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
 | status | Int |  no  |  |
 | message | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | code | String |  no  |  |
 | errors | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ProductTemplate](#ProductTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | categories | ArrayList<String> |  no  |  |
 | isArchived | Boolean |  no  |  |
 | logo | String |  no  |  |
 | isPhysical | Boolean? |  yes  |  |
 | modifiedBy | HashMap<String,Any> |  no  |  |
 | departments | ArrayList<String> |  no  |  |
 | createdBy | HashMap<String,Any> |  no  |  |
 | modifiedOn | String |  no  |  |
 | createdOn | String |  no  |  |
 | name | String |  no  |  |
 | attributes | ArrayList<String> |  no  |  |
 | slug | String? |  yes  |  |
 | tag | String |  no  |  |

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
 | isDependent | HashMap<String,Any> |  no  |  |
 | countryOfOrigin | HashMap<String,Any> |  no  |  |
 | multiSize | HashMap<String,Any> |  no  |  |
 | name | HashMap<String,Any> |  no  |  |
 | slug | HashMap<String,Any> |  no  |  |
 | highlights | HashMap<String,Any> |  no  |  |
 | variants | HashMap<String,Any> |  no  |  |
 | moq | HashMap<String,Any> |  no  |  |
 | description | HashMap<String,Any> |  no  |  |
 | media | HashMap<String,Any> |  no  |  |
 | tags | HashMap<String,Any> |  no  |  |
 | brandUid | HashMap<String,Any> |  no  |  |
 | traderType | HashMap<String,Any> |  no  |  |
 | customOrder | HashMap<String,Any> |  no  |  |
 | shortDescription | HashMap<String,Any> |  no  |  |
 | trader | HashMap<String,Any> |  no  |  |
 | returnConfig | HashMap<String,Any> |  no  |  |
 | currency | HashMap<String,Any> |  no  |  |
 | hsnCode | HashMap<String,Any> |  no  |  |
 | command | HashMap<String,Any> |  no  |  |
 | isActive | HashMap<String,Any> |  no  |  |
 | productPublish | HashMap<String,Any> |  no  |  |
 | sizes | HashMap<String,Any> |  no  |  |
 | productGroupTag | HashMap<String,Any> |  no  |  |
 | sizeGuide | HashMap<String,Any> |  no  |  |
 | noOfBoxes | HashMap<String,Any> |  no  |  |
 | itemType | HashMap<String,Any> |  no  |  |
 | teaserTag | HashMap<String,Any> |  no  |  |
 | itemCode | HashMap<String,Any> |  no  |  |
 | categorySlug | HashMap<String,Any> |  no  |  |

---


 
 
 #### [GlobalValidation](#GlobalValidation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | properties | [Properties](#Properties) |  no  |  |
 | title | String |  no  |  |
 | definitions | HashMap<String,Any> |  no  |  |
 | required | ArrayList<String> |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [TemplateValidationData](#TemplateValidationData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | globalValidation | [GlobalValidation](#GlobalValidation) |  no  |  |
 | templateValidation | HashMap<String,Any> |  no  |  |

---


 
 
 #### [TemplateDetails](#TemplateDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | categories | ArrayList<String> |  no  |  |
 | isArchived | Boolean |  no  |  |
 | logo | String |  no  |  |
 | isPhysical | Boolean? |  yes  |  |
 | id | String |  no  |  |
 | departments | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | attributes | ArrayList<String> |  no  |  |
 | slug | String? |  yes  |  |
 | tag | String |  no  |  |

---


 
 
 #### [TemplatesValidationResponse](#TemplatesValidationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [TemplateValidationData](#TemplateValidationData) |  no  |  |
 | templateDetails | [TemplateDetails](#TemplateDetails) |  no  |  |

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
 | hsnCode | ArrayList<String> |  no  |  |
 | countryOfOrigin | ArrayList<String> |  no  |  |

---


 
 
 #### [HSNCodesResponse](#HSNCodesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [HSNData](#HSNData) |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [VerifiedBy](#VerifiedBy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String |  no  |  |
 | userId | String |  no  |  |

---


 
 
 #### [ProductDownloadItemsData](#ProductDownloadItemsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | brand | ArrayList<String> |  no  |  |
 | templates | ArrayList<String> |  no  |  |

---


 
 
 #### [ProductDownloadsItems](#ProductDownloadsItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | taskId | String |  no  |  |
 | completedOn | String |  no  |  |
 | id | String |  no  |  |
 | createdBy | [VerifiedBy](#VerifiedBy) |  no  |  |
 | templateTags | HashMap<String,Any> |  no  |  |
 | triggerOn | String |  no  |  |
 | sellerId | Double |  no  |  |
 | url | String |  no  |  |
 | data | [ProductDownloadItemsData](#ProductDownloadItemsData) |  no  |  |

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
 | multivalue | Boolean |  no  |  |
 | data | ArrayList<HashMap<String,Any>> |  no  |  |

---


 
 
 #### [Media2](#Media2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String? |  yes  |  |
 | landscape | String? |  yes  |  |
 | portrait | String? |  yes  |  |

---


 
 
 #### [CategoryMappingValues](#CategoryMappingValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | catalogId | Int |  no  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [CategoryMapping](#CategoryMapping)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | google | [CategoryMappingValues](#CategoryMappingValues) |  no  |  |
 | facebook | [CategoryMappingValues](#CategoryMappingValues) |  no  |  |
 | ajio | [CategoryMappingValues](#CategoryMappingValues) |  no  |  |

---


 
 
 #### [Hierarchy](#Hierarchy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | l1 | Int? |  yes  |  |
 | department | Int? |  yes  |  |
 | l2 | Int? |  yes  |  |

---


 
 
 #### [CategoryRequestBody](#CategoryRequestBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | level | Int? |  yes  |  |
 | media | [Media2](#Media2) |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | priority | Int |  no  |  |
 | departments | ArrayList<Int>? |  yes  |  |
 | marketplaces | [CategoryMapping](#CategoryMapping) |  no  |  |
 | tryouts | ArrayList<String> |  no  |  |
 | name | String? |  yes  |  |
 | slug | String |  no  |  |
 | hierarchy | ArrayList<[Hierarchy](#Hierarchy)> |  no  |  |
 | synonyms | ArrayList<String> |  no  |  |

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
 | level | Int? |  yes  |  |
 | media | [Media2](#Media2) |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | modifiedBy | HashMap<String,Any> |  no  |  |
 | modifiedOn | String |  no  |  |
 | priority | Int |  no  |  |
 | departments | ArrayList<Int>? |  yes  |  |
 | createdBy | HashMap<String,Any> |  no  |  |
 | marketplaces | [CategoryMapping](#CategoryMapping) |  no  |  |
 | tryouts | ArrayList<String> |  no  |  |
 | id | String |  no  |  |
 | createdOn | String |  no  |  |
 | name | String? |  yes  |  |
 | uid | Int |  no  |  |
 | slug | String |  no  |  |
 | hierarchy | ArrayList<[Hierarchy](#Hierarchy)> |  no  |  |
 | synonyms | ArrayList<String> |  no  |  |

---


 
 
 #### [CategoryResponse](#CategoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[Category](#Category)> |  no  |  |

---


 
 
 #### [SingleCategoryResponse](#SingleCategoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [Category](#Category) |  no  |  |

---


 
 
 #### [CategoryUpdateResponse](#CategoryUpdateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [OrderQuantity](#OrderQuantity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | maximum | Int |  no  |  |
 | minimum | Int |  no  |  |
 | isSet | Boolean |  no  |  |

---


 
 
 #### [CustomOrder](#CustomOrder)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | manufacturingTime | Int |  no  |  |
 | isCustomOrder | Boolean |  no  |  |
 | manufacturingTimeUnit | String |  no  |  |

---


 
 
 #### [Trader](#Trader)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | String? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [ReturnConfig](#ReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | time | Int |  no  |  |
 | unit | String |  no  |  |
 | returnable | Boolean |  no  |  |

---


 
 
 #### [ProductPublish](#ProductPublish)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | productOnlineDate | String |  no  |  |
 | isSet | Boolean |  no  |  |

---


 
 
 #### [TeaserTag](#TeaserTag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tag | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [ProductCreateUpdate](#ProductCreateUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDependent | Boolean |  no  |  |
 | isSet | Boolean |  no  |  |
 | countryOfOrigin | String? |  yes  |  |
 | multiSize | Boolean |  no  |  |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | highlights | ArrayList<String> |  no  |  |
 | variants | HashMap<String,Any> |  no  |  |
 | moq | [OrderQuantity](#OrderQuantity) |  no  |  |
 | description | String |  no  |  |
 | media | ArrayList<[Media1](#Media1)> |  no  |  |
 | templateTag | String? |  yes  |  |
 | departments | ArrayList<Int>? |  yes  |  |
 | uid | Int |  no  |  |
 | brandUid | Int? |  yes  |  |
 | tags | ArrayList<String> |  no  |  |
 | traderType | String |  no  |  |
 | isImageLessProduct | Boolean |  no  |  |
 | requester | String |  no  |  |
 | customOrder | [CustomOrder](#CustomOrder) |  no  |  |
 | shortDescription | String |  no  |  |
 | trader | [Trader](#Trader) |  no  |  |
 | returnConfig | [ReturnConfig](#ReturnConfig) |  no  |  |
 | companyId | Int? |  yes  |  |
 | currency | String? |  yes  |  |
 | hsnCode | String? |  yes  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | isActive | Boolean |  no  |  |
 | productPublish | [ProductPublish](#ProductPublish) |  no  |  |
 | productGroupTag | ArrayList<String> |  no  |  |
 | sizeGuide | String |  no  |  |
 | noOfBoxes | Int |  no  |  |
 | itemType | String? |  yes  |  |
 | teaserTag | [TeaserTag](#TeaserTag) |  no  |  |
 | itemCode | String? |  yes  |  |
 | changeRequestId | String |  no  |  |
 | categorySlug | String? |  yes  |  |

---


 
 
 #### [Image](#Image)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | secureUrl | String |  no  |  |
 | aspectRatio | String |  no  |  |
 | url | String |  no  |  |
 | aspectRatioF | Double |  no  |  |

---


 
 
 #### [ProductPublished](#ProductPublished)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | productOnlineDate | Int |  no  |  |
 | isSet | Boolean |  no  |  |

---


 
 
 #### [UserCommon](#UserCommon)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String |  no  |  |
 | companyId | Int |  no  |  |
 | userId | String |  no  |  |

---


 
 
 #### [Attributes](#Attributes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modifiedBy | [UserCommon](#UserCommon) |  no  |  |
 | modifiedOn | String |  no  |  |
 | material | String |  no  |  |
 | metaNature | String |  no  |  |
 | essential | String |  no  |  |
 | gender | ArrayList<String> |  no  |  |
 | color | String |  no  |  |
 | verifiedOn | String |  no  |  |
 | neckType | String |  no  |  |
 | isImageLessProduct | Boolean |  no  |  |
 | l3Mapping | ArrayList<String> |  no  |  |
 | verifiedBy | [VerifiedBy](#VerifiedBy) |  no  |  |
 | primaryColor | String |  no  |  |
 | productFit | String |  no  |  |
 | stage | String |  no  |  |
 | imageNature | String |  no  |  |
 | pattern | String |  no  |  |
 | primaryMaterial | String |  no  |  |
 | createdBy | [UserCommon](#UserCommon) |  no  |  |
 | createdOn | String |  no  |  |
 | sleeveLength | String |  no  |  |

---


 
 
 #### [Logo](#Logo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | secureUrl | String |  no  |  |
 | aspectRatio | String |  no  |  |
 | url | String |  no  |  |
 | aspectRatioF | Int |  no  |  |

---


 
 
 #### [Brand](#Brand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | [Logo](#Logo) |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [Product](#Product)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDependent | Boolean |  no  |  |
 | isSet | Boolean |  no  |  |
 | countryOfOrigin | String |  no  |  |
 | multiSize | Boolean |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | highlights | String |  no  |  |
 | allSizes | ArrayList<String> |  no  |  |
 | description | String |  no  |  |
 | media | ArrayList<[Media1](#Media1)> |  no  |  |
 | templateTag | String |  no  |  |
 | departments | ArrayList<Int> |  no  |  |
 | uid | Int |  no  |  |
 | images | ArrayList<[Image](#Image)> |  no  |  |
 | id | String |  no  |  |
 | companyId | Int |  no  |  |
 | currency | String |  no  |  |
 | hsnCode | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | sizeGuide | String |  no  |  |
 | productPublish | [ProductPublished](#ProductPublished) |  no  |  |
 | sizes | ArrayList<HashMap<String,Any>> |  no  |  |
 | itemType | String |  no  |  |
 | attributes | [Attributes](#Attributes) |  no  |  |
 | brand | [Brand](#Brand) |  no  |  |
 | itemCode | String |  no  |  |
 | categorySlug | String |  no  |  |

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
 | email | String |  no  |  |
 | username | String |  no  |  |
 | userId | String |  no  |  |
 | uid | String |  no  |  |

---


 
 
 #### [BulkJob](#BulkJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | failed | Int |  no  |  |
 | total | Int? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | modifiedBy | [UserInfo1](#UserInfo1) |  no  |  |
 | modifiedOn | String |  no  |  |
 | templateTag | String |  no  |  |
 | createdBy | [UserInfo1](#UserInfo1) |  no  |  |
 | cancelled | Int |  no  |  |
 | companyId | Int? |  yes  |  |
 | failedRecords | ArrayList<HashMap<String,Any>> |  no  |  |
 | createdOn | String? |  yes  |  |
 | succeed | Int |  no  |  |
 | cancelledRecords | ArrayList<HashMap<String,Any>> |  no  |  |
 | trackingUrl | String |  no  |  |
 | stage | String |  no  |  |
 | filePath | String |  no  |  |
 | customTemplateTag | String |  no  |  |

---


 
 
 #### [UserDetail](#UserDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String |  no  |  |
 | fullName | String |  no  |  |
 | userId | String |  no  |  |

---


 
 
 #### [ProductBulkRequest](#ProductBulkRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | failed | Int |  no  |  |
 | total | Int |  no  |  |
 | isActive | Boolean |  no  |  |
 | modifiedBy | [UserDetail](#UserDetail) |  no  |  |
 | templateTag | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | createdBy | [UserDetail](#UserDetail) |  no  |  |
 | cancelled | Int |  no  |  |
 | companyId | Int |  no  |  |
 | template | [ProductTemplate](#ProductTemplate) |  no  |  |
 | failedRecords | ArrayList<String> |  no  |  |
 | createdOn | String |  no  |  |
 | succeed | Int |  no  |  |
 | cancelledRecords | ArrayList<String> |  no  |  |
 | stage | String |  no  |  |
 | filePath | String |  no  |  |

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
 | batchId | String? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | data | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | templateTag | String? |  yes  |  |

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
 | user | HashMap<String,Any>? |  yes  |  |
 | companyId | Int |  no  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [Items](#Items)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | failed | Int |  no  |  |
 | total | Int |  no  |  |
 | isActive | Boolean |  no  |  |
 | modifiedBy | [UserCommon](#UserCommon) |  no  |  |
 | modifiedOn | String |  no  |  |
 | id | String |  no  |  |
 | createdBy | [UserCommon](#UserCommon) |  no  |  |
 | cancelled | Int |  no  |  |
 | companyId | Int |  no  |  |
 | failedRecords | ArrayList<String> |  no  |  |
 | createdOn | String |  no  |  |
 | succeed | Int |  no  |  |
 | cancelledRecords | ArrayList<String> |  no  |  |
 | retry | Int |  no  |  |
 | trackingUrl | String |  no  |  |
 | stage | String |  no  |  |
 | filePath | String |  no  |  |

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
 | companyId | Int |  no  |  |
 | size | String |  no  |  |
 | itemId | Int |  no  |  |

---


 
 
 #### [ProductSizeDeleteResponse](#ProductSizeDeleteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | data | [ProductSizeDeleteDataResponse](#ProductSizeDeleteDataResponse) |  no  |  |

---


 
 
 #### [ItemQuery](#ItemQuery)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCode | String |  no  |  |
 | brandUid | Int |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [GTIN](#GTIN)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gtinType | String? |  yes  |  |
 | primary | Boolean |  no  |  |
 | gtinValue | String? |  yes  |  |

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
 | sizeDistribution | [SizeDistribution](#SizeDistribution)? |  yes  |  |
 | quantity | Int |  no  |  |

---


 
 
 #### [InvSize](#InvSize)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | price | Double? |  yes  |  |
 | quantity | Int? |  yes  |  |
 | isSet | Boolean |  no  |  |
 | itemLength | Double |  no  |  |
 | itemWeightUnitOfMeasure | String |  no  |  |
 | size | String? |  yes  |  |
 | itemWeight | Double |  no  |  |
 | itemHeight | Double |  no  |  |
 | itemDimensionsUnitOfMeasure | String |  no  |  |
 | currency | String? |  yes  |  |
 | identifiers | ArrayList<[GTIN](#GTIN)>? |  yes  |  |
 | priceEffective | Double? |  yes  |  |
 | priceTransfer | Double |  no  |  |
 | set | [InventorySet](#InventorySet) |  no  |  |
 | storeCode | String? |  yes  |  |
 | itemWidth | Double |  no  |  |

---


 
 
 #### [InventoryRequest](#InventoryRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Int? |  yes  |  |
 | item | [ItemQuery](#ItemQuery)? |  yes  |  |
 | sizes | ArrayList<[InvSize](#InvSize)>? |  yes  |  |

---


 
 
 #### [InventoryResponse](#InventoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sellerIdentifier | Int |  no  |  |
 | store | HashMap<String,Any> |  no  |  |
 | price | Int |  no  |  |
 | inventoryUpdatedOn | String |  no  |  |
 | quantity | Int |  no  |  |
 | itemId | Int |  no  |  |
 | sellableQuantity | Int |  no  |  |
 | currency | String |  no  |  |
 | size | String |  no  |  |
 | identifiers | HashMap<String,Any> |  no  |  |
 | priceEffective | Int |  no  |  |
 | priceTransfer | Int |  no  |  |
 | uid | String |  no  |  |

---


 
 
 #### [InventoryDeleteData](#InventoryDeleteData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | String |  no  |  |
 | itemId | Int |  no  |  |
 | locationId | Int |  no  |  |

---


 
 
 #### [InventoryDelete](#InventoryDelete)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | data | [InventoryDeleteData](#InventoryDeleteData) |  no  |  |

---


 
 
 #### [CommonResponse](#CommonResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | String |  no  |  |

---


 
 
 #### [BulkInventoryGetItems](#BulkInventoryGetItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | failed | Int |  no  |  |
 | total | Int |  no  |  |
 | isActive | Boolean |  no  |  |
 | modifiedBy | HashMap<String,Any> |  no  |  |
 | id | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | createdBy | HashMap<String,Any> |  no  |  |
 | cancelled | Int |  no  |  |
 | companyId | Int |  no  |  |
 | failedRecords | ArrayList<String> |  no  |  |
 | createdOn | String |  no  |  |
 | succeed | Int |  no  |  |
 | cancelledRecords | ArrayList<String> |  no  |  |
 | stage | String |  no  |  |
 | filePath | String |  no  |  |

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
 | sellerIdentifier | String? |  yes  |  |
 | price | Double? |  yes  |  |
 | quantity | Int? |  yes  |  |
 | isSet | Boolean |  no  |  |
 | itemLength | Double |  no  |  |
 | itemWeightUnitOfMeasure | String |  no  |  |
 | size | String |  no  |  |
 | itemWeight | Double |  no  |  |
 | itemHeight | Double |  no  |  |
 | itemDimensionsUnitOfMeasure | String |  no  |  |
 | currency | String? |  yes  |  |
 | identifiers | ArrayList<HashMap<String,Any>> |  no  |  |
 | priceEffective | Double? |  yes  |  |
 | priceTransfer | Double |  no  |  |
 | set | [InventorySet](#InventorySet) |  no  |  |
 | storeCode | String? |  yes  |  |
 | itemWidth | Double |  no  |  |

---


 
 
 #### [InventoryBulkRequest](#InventoryBulkRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | sizes | ArrayList<[Size1](#Size1)>? |  yes  |  |
 | user | HashMap<String,Any> |  no  |  |

---


 
 
 #### [InventoryExportRequest](#InventoryExportRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | store | ArrayList<Int> |  no  |  |
 | type | String |  no  |  |
 | brand | ArrayList<Int> |  no  |  |

---


 
 
 #### [InventoryExportJob](#InventoryExportJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | taskId | String? |  yes  |  |
 | completedOn | String |  no  |  |
 | triggerOn | String |  no  |  |
 | sellerId | Int? |  yes  |  |
 | url | String |  no  |  |
 | requestParams | HashMap<String,Any> |  no  |  |

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
 | multivalues | Boolean |  no  |  |
 | data | ArrayList<[FilerList](#FilerList)> |  no  |  |

---


 
 
 #### [HsnUpsert](#HsnUpsert)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tax2 | Double |  no  |  |
 | taxOnEsp | Boolean |  no  |  |
 | companyId | Int? |  yes  |  |
 | threshold1 | Double? |  yes  |  |
 | threshold2 | Double |  no  |  |
 | hsnCode | String? |  yes  |  |
 | tax1 | Double? |  yes  |  |
 | taxOnMrp | Boolean? |  yes  |  |
 | uid | Int |  no  |  |
 | hs2Code | String? |  yes  |  |

---


 
 
 #### [HsnCodesObject](#HsnCodesObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tax2 | Double |  no  |  |
 | taxOnEsp | Boolean |  no  |  |
 | id | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | companyId | Int |  no  |  |
 | threshold1 | Double |  no  |  |
 | threshold2 | Double |  no  |  |
 | hsnCode | String |  no  |  |
 | tax1 | Double |  no  |  |
 | taxOnMrp | Boolean |  no  |  |
 | hs2Code | String |  no  |  |

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
 | hasPrevious | Boolean |  no  |  |
 | size | Int |  no  |  |
 | itemTotal | Int |  no  |  |
 | hasNext | Boolean |  no  |  |

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
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | logo | [Media](#Media) |  no  |  |
 | departments | ArrayList<String> |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | discount | String |  no  |  |

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
 | logo | [Media](#Media) |  no  |  |
 | priorityOrder | Int |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |
 | slug | String |  no  |  |

---


 
 
 #### [DepartmentResponse](#DepartmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Department](#Department)> |  no  |  |

---


 
 
 #### [DepartmentIdentifier](#DepartmentIdentifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Int |  no  |  |
 | slug | String |  no  |  |

---


 
 
 #### [ThirdLevelChild](#ThirdLevelChild)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | childs | ArrayList<HashMap<String,Any>> |  no  |  |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |
 | slug | String |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |

---


 
 
 #### [SecondLevelChild](#SecondLevelChild)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | childs | ArrayList<[ThirdLevelChild](#ThirdLevelChild)> |  no  |  |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |
 | slug | String |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |

---


 
 
 #### [Child](#Child)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | childs | ArrayList<[SecondLevelChild](#SecondLevelChild)> |  no  |  |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |
 | slug | String |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CategoryItems](#CategoryItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | banners | [ImageUrls](#ImageUrls) |  no  |  |
 | childs | ArrayList<[Child](#Child)> |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | uid | Int |  no  |  |
 | action | [ProductListingAction](#ProductListingAction) |  no  |  |

---


 
 
 #### [DepartmentCategoryTree](#DepartmentCategoryTree)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | department | String |  no  |  |
 | items | ArrayList<[CategoryItems](#CategoryItems)> |  no  |  |

---


 
 
 #### [CategoryListingResponse](#CategoryListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | departments | ArrayList<[DepartmentIdentifier](#DepartmentIdentifier)> |  no  |  |
 | data | ArrayList<[DepartmentCategoryTree](#DepartmentCategoryTree)> |  no  |  |

---


 
 
 #### [ApplicationProductListingResponse](#ApplicationProductListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[ProductFilters](#ProductFilters)> |  no  |  |
 | items | ArrayList<[ProductListingDetail](#ProductListingDetail)> |  no  |  |
 | page | [Page](#Page)? |  yes  |  |
 | sortOn | ArrayList<[ProductSortOn](#ProductSortOn)> |  no  |  |

---


 
 
 #### [ProductDetail](#ProductDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | similars | ArrayList<String> |  no  |  |
 | rating | Double |  no  |  |
 | name | String |  no  |  |
 | slug | String? |  yes  |  |
 | highlights | ArrayList<String> |  no  |  |
 | groupedAttributes | ArrayList<[ProductDetailGroupedAttribute](#ProductDetailGroupedAttribute)> |  no  |  |
 | description | String |  no  |  |
 | medias | ArrayList<[Media1](#Media1)> |  no  |  |
 | promoMeta | HashMap<String,Any> |  no  |  |
 | color | String |  no  |  |
 | ratingCount | Int |  no  |  |
 | uid | Int |  no  |  |
 | shortDescription | String |  no  |  |
 | hasVariant | Boolean |  no  |  |
 | imageNature | String |  no  |  |
 | productOnlineDate | String |  no  |  |
 | tryouts | ArrayList<String> |  no  |  |
 | itemType | String |  no  |  |
 | attributes | HashMap<String,Any> |  no  |  |
 | brand | [ProductBrand](#ProductBrand) |  no  |  |
 | teaserTag | HashMap<String,Any> |  no  |  |
 | itemCode | String |  no  |  |
 | type | String |  no  |  |

---




 
 
 #### [GetAddressSerializer](#GetAddressSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | Int |  no  |  |
 | longitude | Double |  no  |  |
 | landmark | String |  no  |  |
 | address2 | String |  no  |  |
 | country | String |  no  |  |
 | latitude | Double |  no  |  |
 | address1 | String |  no  |  |
 | city | String |  no  |  |
 | countryCode | String |  no  |  |
 | state | String |  no  |  |
 | addressType | String |  no  |  |

---


 
 
 #### [BusinessCountryInfo](#BusinessCountryInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | countryCode | String |  no  |  |

---


 
 
 #### [SellerPhoneNumber](#SellerPhoneNumber)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | Int? |  yes  |  |
 | number | String? |  yes  |  |

---


 
 
 #### [ContactDetails](#ContactDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)> |  no  |  |
 | emails | ArrayList<String> |  no  |  |

---


 
 
 #### [Document](#Document)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Boolean |  no  |  |
 | value | String? |  yes  |  |
 | url | String |  no  |  |
 | type | String? |  yes  |  |
 | legalName | String |  no  |  |

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


 
 
 #### [GetCompanyProfileSerializerResponse](#GetCompanyProfileSerializerResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | createdBy | [UserSerializer](#UserSerializer) |  no  |  |
 | addresses | ArrayList<[GetAddressSerializer](#GetAddressSerializer)> |  no  |  |
 | createdOn | String |  no  |  |
 | companyType | String? |  yes  |  |
 | modifiedOn | String |  no  |  |
 | verifiedOn | String |  no  |  |
 | stage | String |  no  |  |
 | uid | Int? |  yes  |  |
 | businessCountryInfo | [BusinessCountryInfo](#BusinessCountryInfo) |  no  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | contactDetails | [ContactDetails](#ContactDetails) |  no  |  |
 | documents | ArrayList<[Document](#Document)> |  no  |  |
 | mode | String |  no  |  |
 | notificationEmails | ArrayList<String> |  no  |  |
 | franchiseEnabled | Boolean |  no  |  |
 | businessDetails | [BusinessDetails](#BusinessDetails) |  no  |  |
 | verifiedBy | [UserSerializer](#UserSerializer) |  no  |  |
 | modifiedBy | [UserSerializer](#UserSerializer) |  no  |  |
 | businessInfo | String |  no  |  |
 | businessType | String? |  yes  |  |

---


 
 
 #### [CreateUpdateAddressSerializer](#CreateUpdateAddressSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | Int? |  yes  |  |
 | longitude | Double? |  yes  |  |
 | landmark | String |  no  |  |
 | address2 | String |  no  |  |
 | country | String? |  yes  |  |
 | latitude | Double? |  yes  |  |
 | address1 | String? |  yes  |  |
 | city | String? |  yes  |  |
 | countryCode | String |  no  |  |
 | state | String? |  yes  |  |
 | addressType | String? |  yes  |  |

---


 
 
 #### [UpdateCompany](#UpdateCompany)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documents | ArrayList<[Document](#Document)> |  no  |  |
 | franchiseEnabled | Boolean |  no  |  |
 | rejectReason | String |  no  |  |
 | addresses | ArrayList<[CreateUpdateAddressSerializer](#CreateUpdateAddressSerializer)> |  no  |  |
 | businessDetails | [BusinessDetails](#BusinessDetails) |  no  |  |
 | companyType | String |  no  |  |
 | notificationEmails | ArrayList<String> |  no  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | contactDetails | [ContactDetails](#ContactDetails) |  no  |  |
 | businessInfo | String |  no  |  |
 | businessType | String |  no  |  |

---


 
 
 #### [DocumentsObj](#DocumentsObj)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Int |  no  |  |
 | pending | Int |  no  |  |

---


 
 
 #### [MetricsSerializer](#MetricsSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stage | String |  no  |  |
 | uid | Int |  no  |  |
 | companyDocuments | [DocumentsObj](#DocumentsObj) |  no  |  |
 | brand | [DocumentsObj](#DocumentsObj) |  no  |  |
 | storeDocuments | [DocumentsObj](#DocumentsObj) |  no  |  |
 | product | [DocumentsObj](#DocumentsObj) |  no  |  |
 | store | [DocumentsObj](#DocumentsObj) |  no  |  |

---


 
 
 #### [UserSerializer1](#UserSerializer1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contact | String |  no  |  |
 | userId | String |  no  |  |
 | username | String |  no  |  |

---


 
 
 #### [BrandBannerSerializer](#BrandBannerSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | landscape | String |  no  |  |
 | portrait | String |  no  |  |

---


 
 
 #### [GetBrandResponseSerializer](#GetBrandResponseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stage | String |  no  |  |
 | name | String? |  yes  |  |
 | createdBy | [UserSerializer1](#UserSerializer1) |  no  |  |
 | uid | Int |  no  |  |
 | slugKey | String |  no  |  |
 | rejectReason | String |  no  |  |
 | createdOn | String |  no  |  |
 | synonyms | ArrayList<String> |  no  |  |
 | verifiedBy | [UserSerializer1](#UserSerializer1) |  no  |  |
 | modifiedOn | String |  no  |  |
 | description | String |  no  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | banner | [BrandBannerSerializer](#BrandBannerSerializer) |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | localeLanguage | HashMap<String,Any> |  no  |  |
 | modifiedBy | [UserSerializer1](#UserSerializer1) |  no  |  |
 | verifiedOn | String |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [CreateUpdateBrandRequestSerializer](#CreateUpdateBrandRequestSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | uid | Int |  no  |  |
 | brandTier | String |  no  |  |
 | synonyms | ArrayList<String> |  no  |  |
 | companyId | Int |  no  |  |
 | description | String |  no  |  |
 | localeLanguage | HashMap<String,Any> |  no  |  |
 | banner | [BrandBannerSerializer](#BrandBannerSerializer) |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | logo | String? |  yes  |  |

---


 
 
 #### [CompanyBrandPostRequestSerializer](#CompanyBrandPostRequestSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brands | ArrayList<Int>? |  yes  |  |
 | uid | Int |  no  |  |
 | company | Int? |  yes  |  |

---


 
 
 #### [GetCompanySerializer](#GetCompanySerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stage | String |  no  |  |
 | name | String |  no  |  |
 | createdBy | [UserSerializer](#UserSerializer) |  no  |  |
 | uid | Int |  no  |  |
 | rejectReason | String |  no  |  |
 | addresses | ArrayList<[GetAddressSerializer](#GetAddressSerializer)> |  no  |  |
 | createdOn | String |  no  |  |
 | companyType | String |  no  |  |
 | verifiedBy | [UserSerializer](#UserSerializer) |  no  |  |
 | modifiedOn | String |  no  |  |
 | modifiedBy | [UserSerializer](#UserSerializer) |  no  |  |
 | verifiedOn | String |  no  |  |
 | businessType | String |  no  |  |

---


 
 
 #### [CompanyBrandSerializer](#CompanyBrandSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stage | String |  no  |  |
 | createdBy | [UserSerializer1](#UserSerializer1) |  no  |  |
 | uid | Int |  no  |  |
 | rejectReason | String |  no  |  |
 | createdOn | String |  no  |  |
 | brand | [GetBrandResponseSerializer](#GetBrandResponseSerializer) |  no  |  |
 | verifiedBy | [UserSerializer1](#UserSerializer1) |  no  |  |
 | company | [GetCompanySerializer](#GetCompanySerializer) |  no  |  |
 | modifiedOn | String |  no  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | modifiedBy | [UserSerializer1](#UserSerializer1) |  no  |  |
 | verifiedOn | String |  no  |  |

---


 
 
 #### [CompanyBrandListSerializer](#CompanyBrandListSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CompanyBrandSerializer](#CompanyBrandSerializer)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [LocationManagerSerializer](#LocationManagerSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobileNo | [SellerPhoneNumber](#SellerPhoneNumber)? |  yes  |  |
 | name | String |  no  |  |
 | email | String |  no  |  |

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
 | weekday | String? |  yes  |  |
 | opening | [LocationTimingSerializer](#LocationTimingSerializer) |  no  |  |
 | open | Boolean? |  yes  |  |
 | closing | [LocationTimingSerializer](#LocationTimingSerializer) |  no  |  |

---


 
 
 #### [ProductReturnConfigSerializer](#ProductReturnConfigSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | onSameStore | Boolean |  no  |  |
 | storeUid | Int |  no  |  |

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
 | eInvoice | [InvoiceCredSerializer](#InvoiceCredSerializer) |  no  |  |
 | eWaybill | [InvoiceCredSerializer](#InvoiceCredSerializer) |  no  |  |

---


 
 
 #### [GetAddressSerializer1](#GetAddressSerializer1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | Int |  no  |  |
 | longitude | Double |  no  |  |
 | landmark | String |  no  |  |
 | address2 | String |  no  |  |
 | country | String |  no  |  |
 | latitude | Double |  no  |  |
 | address1 | String |  no  |  |
 | city | String |  no  |  |
 | countryCode | String |  no  |  |
 | state | String |  no  |  |
 | addressType | String |  no  |  |

---


 
 
 #### [LocationSerializer](#LocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documents | ArrayList<[Document](#Document)> |  no  |  |
 | name | String? |  yes  |  |
 | manager | [LocationManagerSerializer](#LocationManagerSerializer) |  no  |  |
 | uid | Int |  no  |  |
 | timing | ArrayList<[LocationDayWiseSerializer](#LocationDayWiseSerializer)> |  no  |  |
 | displayName | String? |  yes  |  |
 | stage | String |  no  |  |
 | productReturnConfig | [ProductReturnConfigSerializer](#ProductReturnConfigSerializer) |  no  |  |
 | gstCredentials | [InvoiceDetailsSerializer](#InvoiceDetailsSerializer) |  no  |  |
 | notificationEmails | ArrayList<String> |  no  |  |
 | company | Int? |  yes  |  |
 | contactNumbers | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)> |  no  |  |
 | address | [GetAddressSerializer1](#GetAddressSerializer1)? |  yes  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | code | String? |  yes  |  |
 | storeType | String |  no  |  |

---


 
 
 #### [LocationIntegrationType](#LocationIntegrationType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | inventory | String |  no  |  |
 | order | String |  no  |  |

---


 
 
 #### [GetLocationSerializer](#GetLocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | createdBy | [UserSerializer1](#UserSerializer1) |  no  |  |
 | productReturnConfig | [ProductReturnConfigSerializer](#ProductReturnConfigSerializer) |  no  |  |
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | verifiedOn | String |  no  |  |
 | storeType | String |  no  |  |
 | stage | String |  no  |  |
 | uid | Int |  no  |  |
 | address | [GetAddressSerializer](#GetAddressSerializer)? |  yes  |  |
 | warnings | HashMap<String,Any> |  no  |  |
 | integrationType | [LocationIntegrationType](#LocationIntegrationType) |  no  |  |
 | phoneNumber | String? |  yes  |  |
 | manager | [LocationManagerSerializer](#LocationManagerSerializer) |  no  |  |
 | documents | ArrayList<[Document](#Document)> |  no  |  |
 | displayName | String? |  yes  |  |
 | gstCredentials | [InvoiceDetailsSerializer](#InvoiceDetailsSerializer) |  no  |  |
 | notificationEmails | ArrayList<String> |  no  |  |
 | customJson | HashMap<String,Any> |  no  |  |
 | code | String? |  yes  |  |
 | timing | ArrayList<[LocationDayWiseSerializer](#LocationDayWiseSerializer)> |  no  |  |
 | verifiedBy | [UserSerializer1](#UserSerializer1) |  no  |  |
 | company | [GetCompanySerializer](#GetCompanySerializer) |  no  |  |
 | contactNumbers | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)> |  no  |  |
 | modifiedBy | [UserSerializer1](#UserSerializer1) |  no  |  |

---


 
 
 #### [LocationListSerializer](#LocationListSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetLocationSerializer](#GetLocationSerializer)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

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
 | fileName | String? |  yes  |  |
 | filePath | String? |  yes  |  |
 | contentType | String? |  yes  |  |
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
 | fileName | String? |  yes  |  |
 | contentType | String? |  yes  |  |
 | size | Int? |  yes  |  |
 | tags | ArrayList<String> |  no  |  |
 | params | HashMap<String,Any> |  no  |  |

---


 
 
 #### [CompleteResponse](#CompleteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | fileName | String? |  yes  |  |
 | filePath | String? |  yes  |  |
 | contentType | String? |  yes  |  |
 | method | String? |  yes  |  |
 | namespace | String? |  yes  |  |
 | operation | String? |  yes  |  |
 | size | Int? |  yes  |  |
 | upload | [Upload](#Upload)? |  yes  |  |
 | cdn | [CDN](#CDN)? |  yes  |  |
 | success | String? |  yes  |  |
 | tags | ArrayList<String> |  no  |  |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |

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
 | attemptsMade | Int? |  yes  |  |
 | stacktrace | ArrayList<String> |  no  |  |
 | finishedOn | Int? |  yes  |  |
 | processedOn | Int? |  yes  |  |

---


 
 
 #### [BulkResponse](#BulkResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | trackingUrl | String? |  yes  |  |
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
 | signedUrl | String? |  yes  |  |
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
 | id | String? |  yes  |  |
 | fileName | String? |  yes  |  |
 | operation | String |  no  |  |
 | namespace | String? |  yes  |  |
 | contentType | String? |  yes  |  |
 | filePath | String? |  yes  |  |
 | upload | [Upload](#Upload)? |  yes  |  |
 | cdn | [CDN](#CDN)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |

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
 | forceWeb | Boolean |  no  |  |

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
 | campaignCookieExpiry | String |  no  |  |

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
 | expireAt | String |  no  |  |
 | enableTracking | Boolean |  no  |  |
 | personalized | Boolean |  no  | To create personalized short links. |
 | campaign | [CampaignShortLink](#CampaignShortLink) |  no  |  |
 | redirects | [Redirects](#Redirects) |  no  |  |
 | attribution | [Attribution](#Attribution) |  no  |  |
 | socialMediaTags | [SocialMediaTags](#SocialMediaTags) |  no  |  |
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
 | createdBy | String |  no  |  |
 | appRedirect | Boolean |  no  |  |
 | fallback | String |  no  |  |
 | active | Boolean |  no  |  |
 | id | String |  no  |  |
 | enableTracking | Boolean |  no  |  |
 | expireAt | String |  no  |  |
 | application | String |  no  |  |
 | userId | String |  no  |  |
 | createdAt | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | updatedAt | String |  no  |  |
 | personalized | Boolean |  no  | To create personalized short links |
 | campaign | [CampaignShortLink](#CampaignShortLink) |  no  |  |
 | redirects | [Redirects](#Redirects) |  no  |  |
 | attribution | [Attribution](#Attribution) |  no  |  |
 | socialMediaTags | [SocialMediaTags](#SocialMediaTags) |  no  |  |
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
 | minPrice | Double |  no  |  |
 | safeStock | Int |  no  |  |
 | periodThreshold | Int |  no  |  |
 | periodThresholdType | String |  no  |  |
 | periodTypeList | ArrayList<[GenericDTO](#GenericDTO)> |  no  |  |

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
 | integrationData | HashMap<String,HashMap<String,Any>> |  no  |  |
 | companyName | String |  no  |  |
 | companyId | Int? |  yes  |  |
 | taskDetails | [TaskDTO](#TaskDTO) |  no  |  |
 | thresholdDetails | [DataTresholdDTO](#DataTresholdDTO) |  no  |  |
 | jobCode | String |  no  |  |
 | alias | String |  no  |  |

---


 
 
 #### [TaskDTO](#TaskDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | Int |  no  |  |
 | groupList | ArrayList<[GenericDTO](#GenericDTO)> |  no  |  |

---


 
 
 #### [ResponseEnvelopeString](#ResponseEnvelopeString)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String |  no  |  |
 | status | Int |  no  |  |
 | error | String |  no  |  |
 | exception | String |  no  |  |
 | message | String |  no  |  |
 | totalTimeTakenInMillis | Int |  no  |  |
 | httpStatus | String |  no  |  |
 | items | String |  no  |  |
 | payload | String |  no  |  |
 | traceId | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [AWSS3config](#AWSS3config)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bucket | String |  no  |  |
 | region | String |  no  |  |
 | dir | String |  no  |  |
 | accessKey | String |  no  |  |
 | secretKey | String |  no  |  |
 | localFilePath | String |  no  |  |
 | archivePath | String |  no  |  |
 | archive | Boolean |  no  |  |
 | delete | Boolean |  no  |  |
 | unzip | Boolean |  no  |  |
 | zipFormat | String |  no  |  |
 | fileRegex | String |  no  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig) |  no  |  |

---


 
 
 #### [ArchiveConfig](#ArchiveConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | delete | Boolean |  no  |  |
 | archive | Boolean |  no  |  |
 | archiveDir | String |  no  |  |

---


 
 
 #### [Audit](#Audit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | String |  no  |  |
 | modifiedBy | String |  no  |  |
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |

---


 
 
 #### [CatalogMasterConfig](#CatalogMasterConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sourceSlug | String |  no  |  |

---


 
 
 #### [CompanyConfig](#CompanyConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Int |  no  |  |
 | excludeSteps | ArrayList<Int> |  no  |  |
 | hiddenClosetKeys | ArrayList<String> |  no  |  |
 | openTags | HashMap<String,HashMap<String,Any>> |  no  |  |
 | taxIdentifiers | ArrayList<String> |  no  |  |
 | deleteQuantityThreshold | Int |  no  |  |

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
 | driverClass | String |  no  |  |
 | jdbcUrl | String |  no  |  |
 | optionalProperties | HashMap<String,String> |  no  |  |

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
 | intfArticleId | [PropBeanDTO](#PropBeanDTO) |  no  |  |
 | priceEffective | [PropBeanDTO](#PropBeanDTO) |  no  |  |
 | quantity | [PropBeanDTO](#PropBeanDTO) |  no  |  |

---


 
 
 #### [DocMappingConfig](#DocMappingConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | properties | HashMap<String,HashMap<String,Any>> |  no  |  |
 | junkDataThresholdCount | Int |  no  |  |
 | propBeanConfigs | ArrayList<[PropBeanConfig](#PropBeanConfig)> |  no  |  |
 | unwindField | String |  no  |  |
 | defaultHeaders | [DefaultHeadersDTO](#DefaultHeadersDTO) |  no  |  |

---


 
 
 #### [EmailConfig](#EmailConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recepient | String |  no  |  |
 | host | String |  no  |  |
 | username | String |  no  |  |
 | password | String |  no  |  |
 | unzip | Boolean |  no  |  |
 | readFromContent | Boolean |  no  |  |
 | filterBasedOnRecepients | Boolean |  no  |  |
 | pcol | String |  no  |  |
 | subjectLineRegex | String |  no  |  |
 | senderAddress | String |  no  |  |
 | localDir | String |  no  |  |
 | folderNameHierarchies | ArrayList<String> |  no  |  |
 | attachmentRegex | String |  no  |  |
 | bodyContentRegex | String |  no  |  |
 | passwordProtected | Boolean |  no  |  |
 | zipFormat | String |  no  |  |
 | attachmentMandate | Boolean |  no  |  |
 | filterFilesAfterExtraction | Boolean |  no  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig) |  no  |  |
 | readAllUnreadMails | Boolean |  no  |  |
 | contentType | String |  no  |  |
 | downloadableLink | Boolean |  no  |  |
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
 | localDir | String |  no  |  |
 | remoteDir | String |  no  |  |
 | zipFileRegex | String |  no  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig) |  no  |  |
 | fileRegex | String |  no  |  |
 | zipFormat | String |  no  |  |
 | readAllFiles | Boolean |  no  |  |

---


 
 
 #### [FileConfig](#FileConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | delimiter | String |  no  |  |
 | charset | String |  no  |  |
 | properties | HashMap<String,HashMap<String,Any>> |  no  |  |
 | fileHasHeader | Boolean |  no  |  |
 | headerIndex | Int |  no  |  |
 | headerArray | ArrayList<String> |  no  |  |
 | dataStartIndex | Int |  no  |  |
 | propBeanConfigs | ArrayList<[PropBeanConfig](#PropBeanConfig)> |  no  |  |
 | junkDataThresholdCount | Int |  no  |  |
 | fileType | String |  no  |  |
 | lineValidityCheck | Boolean |  no  |  |
 | sheetNames | ArrayList<String> |  no  |  |
 | readAllSheets | Boolean |  no  |  |
 | quoteChar | String |  no  |  |
 | escapeChar | String |  no  |  |
 | defaultHeaders | [DefaultHeadersDTO](#DefaultHeadersDTO) |  no  |  |

---


 
 
 #### [GoogleSpreadSheetConfig](#GoogleSpreadSheetConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | range | String |  no  |  |
 | sheetId | String |  no  |  |
 | clientSecretLocation | String |  no  |  |
 | credStorageDirectory | String |  no  |  |
 | localDir | String |  no  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig) |  no  |  |

---


 
 
 #### [HttpConfig](#HttpConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hosturl | String |  no  |  |
 | username | String |  no  |  |
 | password | String |  no  |  |
 | requestParams | HashMap<String,String> |  no  |  |
 | httpMethod | String |  no  |  |
 | requestPayload | String |  no  |  |
 | localPath | String |  no  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig) |  no  |  |

---


 
 
 #### [JobConfig](#JobConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | jobCode | String |  no  |  |
 | taskType | String |  no  |  |
 | syncDelay | Int |  no  |  |
 | cronExpression | String |  no  |  |
 | storeFilter | [StoreFilter](#StoreFilter) |  no  |  |
 | processConfig | [ProcessConfig](#ProcessConfig) |  no  |  |
 | storeConfig | ArrayList<[StoreConfig](#StoreConfig)> |  no  |  |
 | properties | HashMap<String,String> |  no  |  |
 | immediateFirstRun | Boolean |  no  |  |
 | disable | Boolean |  no  |  |
 | dependentJobCodes | ArrayList<String> |  no  |  |
 | companyConfig | ArrayList<[CompanyConfig](#CompanyConfig)> |  no  |  |
 | companyIds | ArrayList<Int> |  no  |  |
 | taxIdentifiers | ArrayList<String> |  no  |  |
 | priority | String |  no  |  |
 | periodThreshold | Int |  no  |  |
 | periodThresholdType | String |  no  |  |
 | dbConnectionProfile | [DBConnectionProfile](#DBConnectionProfile) |  no  |  |
 | params | HashMap<String,HashMap<String,Any>> |  no  |  |
 | openTags | HashMap<String,HashMap<String,Any>> |  no  |  |
 | deleteQuantityThreshold | Int |  no  |  |
 | catalogMasterConfig | [CatalogMasterConfig](#CatalogMasterConfig) |  no  |  |
 | aggregatorTypes | ArrayList<String> |  no  |  |
 | integrationType | String |  no  |  |
 | minPrice | Double |  no  |  |
 | audit | [Audit](#Audit) |  no  |  |
 | version | Int |  no  |  |
 | alias | String |  no  |  |

---


 
 
 #### [JobConfigRawDTO](#JobConfigRawDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | integration | String? |  yes  |  |
 | companyName | String? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | data | [JobConfig](#JobConfig) |  no  |  |

---


 
 
 #### [JsonDocConfig](#JsonDocConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | propBeanConfigs | ArrayList<[PropBeanConfig](#PropBeanConfig)> |  no  |  |

---


 
 
 #### [LocalFileConfig](#LocalFileConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | retries | Int |  no  |  |
 | interval | Int |  no  |  |
 | localDir | String |  no  |  |
 | workingDir | String |  no  |  |
 | unzip | Boolean |  no  |  |
 | zipFileRegex | String |  no  |  |
 | fileRegex | String |  no  |  |
 | zipFormat | String |  no  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig) |  no  |  |
 | readAllFiles | Boolean |  no  |  |

---


 
 
 #### [MongoDocConfig](#MongoDocConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | collectionName | String |  no  |  |
 | findQuery | HashMap<String,HashMap<String,Any>> |  no  |  |
 | projectionQuery | HashMap<String,HashMap<String,Any>> |  no  |  |
 | propBeanConfigs | ArrayList<[PropBeanConfig](#PropBeanConfig)> |  no  |  |
 | aggregatePipeline | ArrayList<HashMap<String,HashMap<String,Any>>> |  no  |  |
 | skipSave | Boolean |  no  |  |

---


 
 
 #### [OAuthConfig](#OAuthConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | limit | Int |  no  |  |
 | pages | Int |  no  |  |
 | interval | Int |  no  |  |
 | consumerKey | String |  no  |  |
 | consumerSecret | String |  no  |  |
 | token | String |  no  |  |
 | tokenSecret | String |  no  |  |
 | restUrl | String |  no  |  |
 | restBaseUrl | String |  no  |  |
 | functionName | String |  no  |  |

---


 
 
 #### [ProcessConfig](#ProcessConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dbConfig | [DBConfig](#DBConfig) |  no  |  |
 | dbParamConfig | [DBParamConfig](#DBParamConfig) |  no  |  |
 | sftpConfig | [SFTPConfig](#SFTPConfig) |  no  |  |
 | awsS3Config | [AWSS3config](#AWSS3config) |  no  |  |
 | mongoDocConfig | [MongoDocConfig](#MongoDocConfig) |  no  |  |
 | ftpConfig | [FTPConfig](#FTPConfig) |  no  |  |
 | emailConfig | [EmailConfig](#EmailConfig) |  no  |  |
 | fileConfig | [FileConfig](#FileConfig) |  no  |  |
 | jsonDocConfig | [JsonDocConfig](#JsonDocConfig) |  no  |  |
 | docMappingConfig | [DocMappingConfig](#DocMappingConfig) |  no  |  |
 | taskStepConfig | [TaskStepConfig](#TaskStepConfig) |  no  |  |
 | httpConfig | [HttpConfig](#HttpConfig) |  no  |  |
 | localFileConfig | [LocalFileConfig](#LocalFileConfig) |  no  |  |
 | oauthConfig | [OAuthConfig](#OAuthConfig) |  no  |  |
 | googleSpreadsheetConfig | [GoogleSpreadSheetConfig](#GoogleSpreadSheetConfig) |  no  |  |

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
 | sourceField | String |  no  |  |
 | sourceFields | ArrayList<String> |  no  |  |
 | destinationField | String |  no  |  |
 | dataType | String |  no  |  |
 | defaultValue | HashMap<String,Any> |  no  |  |
 | constValue | HashMap<String,Any> |  no  |  |
 | concatStr | String |  no  |  |
 | functionName | String |  no  |  |
 | transformerName | String |  no  |  |
 | allParamFunctionName | String |  no  |  |
 | subSeparator | String |  no  |  |
 | indexField | String |  no  |  |
 | ignoreIfNotExists | Boolean |  no  |  |
 | identifierType | String |  no  |  |
 | projectionQuery | HashMap<String,HashMap<String,Any>> |  no  |  |
 | enrichFromMaster | Boolean |  no  |  |

---


 
 
 #### [PropBeanDTO](#PropBeanDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | required | Boolean |  no  |  |
 | optional | Boolean |  no  |  |
 | include | Boolean |  no  |  |
 | sourceField | String |  no  |  |
 | sourceFields | ArrayList<String> |  no  |  |
 | destinationField | String |  no  |  |
 | dataType | String |  no  |  |
 | defaultValue | HashMap<String,Any> |  no  |  |
 | constValue | HashMap<String,Any> |  no  |  |
 | concatStr | String |  no  |  |
 | functionName | String |  no  |  |
 | transformerName | String |  no  |  |
 | allParamFunctionName | String |  no  |  |
 | subSeparator | String |  no  |  |
 | indexField | String |  no  |  |
 | ignoreIfNotExists | Boolean |  no  |  |
 | identifierType | String |  no  |  |
 | projectionQuery | HashMap<String,HashMap<String,Any>> |  no  |  |
 | enrichFromMaster | Boolean |  no  |  |

---


 
 
 #### [ResponseEnvelopeListJobConfigRawDTO](#ResponseEnvelopeListJobConfigRawDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String |  no  |  |
 | status | Int |  no  |  |
 | error | String |  no  |  |
 | exception | String |  no  |  |
 | message | String |  no  |  |
 | totalTimeTakenInMillis | Int |  no  |  |
 | httpStatus | String |  no  |  |
 | items | ArrayList<[JobConfigRawDTO](#JobConfigRawDTO)> |  no  |  |
 | payload | ArrayList<[JobConfigRawDTO](#JobConfigRawDTO)> |  no  |  |
 | traceId | String |  no  |  |
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
 | privateKeyPath | String |  no  |  |
 | strictHostKeyChecking | Boolean |  no  |  |
 | localDir | String |  no  |  |
 | remoteDir | String |  no  |  |
 | passwordProtected | Boolean |  no  |  |
 | zipFileRegex | String |  no  |  |
 | fileRegex | String |  no  |  |
 | zipFormat | String |  no  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig) |  no  |  |
 | readAllFiles | Boolean |  no  |  |

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
 | jobCode | String |  no  |  |
 | storeid | String |  no  |  |
 | storeAlias | String |  no  |  |
 | storeFileRegex | String |  no  |  |
 | storeFileName | String |  no  |  |
 | processConfig | [ProcessConfig](#ProcessConfig) |  no  |  |
 | properties | HashMap<String,String> |  no  |  |

---


 
 
 #### [StoreFilter](#StoreFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includeTags | ArrayList<String> |  no  |  |
 | excludeTags | ArrayList<String> |  no  |  |
 | query | HashMap<String,HashMap<String,Any>> |  no  |  |

---


 
 
 #### [TaskConfig](#TaskConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | taskConfigId | Int |  no  |  |
 | taskParams | ArrayList<[TaskParam](#TaskParam)> |  no  |  |

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
 | taskConfigs | ArrayList<[TaskConfig](#TaskConfig)> |  no  |  |
 | taskConfigIds | ArrayList<Int> |  no  |  |
 | taskConfigGroupIds | ArrayList<Int> |  no  |  |

---


 
 
 #### [ResponseEnvelopeListJobConfigDTO](#ResponseEnvelopeListJobConfigDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String |  no  |  |
 | status | Int |  no  |  |
 | error | String |  no  |  |
 | exception | String |  no  |  |
 | message | String |  no  |  |
 | totalTimeTakenInMillis | Int |  no  |  |
 | httpStatus | String |  no  |  |
 | items | ArrayList<[JobConfigDTO](#JobConfigDTO)> |  no  |  |
 | payload | ArrayList<[JobConfigDTO](#JobConfigDTO)> |  no  |  |
 | traceId | String |  no  |  |
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
 | totalTimeTakenInMillis | Int |  no  |  |
 | httpStatus | String |  no  |  |
 | items | [JobConfigDTO](#JobConfigDTO) |  no  |  |
 | payload | [JobConfigDTO](#JobConfigDTO) |  no  |  |
 | traceId | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [JobHistoryDto](#JobHistoryDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalAddedCount | Int |  no  |  |
 | totalUpdatedCount | Int |  no  |  |
 | totalSuppressedCount | Int |  no  |  |
 | jobId | Int |  no  |  |
 | status | String |  no  |  |
 | jobCode | String |  no  |  |
 | processedOn | String |  no  |  |
 | filename | ArrayList<String> |  no  |  |

---


 
 
 #### [JobMetricsDto](#JobMetricsDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | jobCode | String |  no  |  |
 | isRunMoreThanUsual | String |  no  |  |
 | jobHistory | ArrayList<[JobHistoryDto](#JobHistoryDto)> |  no  |  |
 | totalSuccessCount | Int |  no  |  |
 | totalFailureCount | Int |  no  |  |
 | totalWarningCount | Int |  no  |  |
 | totalSuppressedCount | Int |  no  |  |
 | totalJobRuns | Int |  no  |  |

---


 
 
 #### [ResponseEnvelopeJobMetricsDto](#ResponseEnvelopeJobMetricsDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String |  no  |  |
 | status | Int |  no  |  |
 | error | String |  no  |  |
 | exception | String |  no  |  |
 | message | String |  no  |  |
 | totalTimeTakenInMillis | Int |  no  |  |
 | httpStatus | String |  no  |  |
 | items | [JobMetricsDto](#JobMetricsDto) |  no  |  |
 | payload | [JobMetricsDto](#JobMetricsDto) |  no  |  |
 | traceId | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [JobConfigListDTO](#JobConfigListDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  |  |
 | alias | String |  no  |  |
 | modifiedBy | String |  no  |  |
 | createdBy | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | createdOn | String |  no  |  |
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
 | totalTimeTakenInMillis | Int |  no  |  |
 | httpStatus | String |  no  |  |
 | items | ArrayList<[JobConfigListDTO](#JobConfigListDTO)> |  no  |  |
 | payload | ArrayList<[JobConfigListDTO](#JobConfigListDTO)> |  no  |  |
 | traceId | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---




 
 
 #### [ApplicationInventory](#ApplicationInventory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | inventory | [AppInventoryConfig](#AppInventoryConfig) |  no  |  |
 | authentication | [AuthenticationConfig](#AuthenticationConfig) |  no  |  |
 | articleAssignment | [ArticleAssignmentConfig](#ArticleAssignmentConfig) |  no  |  |
 | rewardPoints | [RewardPointsConfig](#RewardPointsConfig) |  no  |  |
 | cart | [AppCartConfig](#AppCartConfig) |  no  |  |
 | payment | [AppPaymentConfig](#AppPaymentConfig) |  no  |  |
 | order | [AppOrderConfig](#AppOrderConfig) |  no  |  |
 | logistics | [AppLogisticsConfig](#AppLogisticsConfig) |  no  |  |
 | business | String |  no  |  |
 | commsEnabled | Boolean |  no  |  |
 | platforms | ArrayList<String> |  no  |  |
 | id | String |  no  |  |
 | loyaltyPoints | [LoyaltyPointsConfig](#LoyaltyPointsConfig) |  no  |  |
 | app | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | modifiedBy | String |  no  |  |

---


 
 
 #### [AppInventoryConfig](#AppInventoryConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | [InventoryBrand](#InventoryBrand) |  no  |  |
 | store | [InventoryStore](#InventoryStore) |  no  |  |
 | category | [InventoryCategory](#InventoryCategory) |  no  |  |
 | price | [InventoryPrice](#InventoryPrice) |  no  |  |
 | discount | [InventoryDiscount](#InventoryDiscount) |  no  |  |
 | outOfStock | Boolean |  no  |  |
 | franchiseEnabled | Boolean |  no  |  |
 | excludeCategory | ArrayList<Any> |  no  |  |
 | image | ArrayList<String> |  no  |  |
 | companyStore | ArrayList<Any> |  no  |  |

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
 | postOrderReassignment | Boolean |  no  |  |
 | enforcedStores | ArrayList<Any> |  no  |  |

---


 
 
 #### [ArticleAssignmentRules](#ArticleAssignmentRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storePriority | [StorePriority](#StorePriority) |  no  |  |

---


 
 
 #### [StorePriority](#StorePriority)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | storetypeOrder | ArrayList<Any> |  no  |  |

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
 | autoApply | Boolean |  no  |  |
 | strategyChannel | String |  no  |  |

---


 
 
 #### [AppCartConfig](#AppCartConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deliveryCharges | [DeliveryCharges](#DeliveryCharges) |  no  |  |
 | enabled | Boolean |  no  |  |
 | maxCartItems | Int |  no  |  |
 | minCartValue | Double |  no  |  |
 | bulkCoupons | Boolean |  no  |  |

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
 | callbackUrl | [CallbackUrl](#CallbackUrl) |  no  |  |
 | methods | [Methods](#Methods) |  no  |  |
 | paymentSelectionLock | [PaymentSelectionLock](#PaymentSelectionLock) |  no  |  |
 | modeOfPayment | String |  no  |  |
 | source | String |  no  |  |
 | enabled | Boolean |  no  |  |
 | codAmountLimit | Double |  no  |  |
 | codCharges | Double |  no  |  |

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
 | defaultOptions | String |  no  |  |
 | paymentIdentifier | String |  no  |  |

---


 
 
 #### [AppOrderConfig](#AppOrderConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | forceReassignment | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [AppLogisticsConfig](#AppLogisticsConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logisticsBySeller | Boolean |  no  |  |
 | serviceabilityCheck | Boolean |  no  |  |
 | sameDayDelivery | Boolean |  no  |  |
 | dpAssignment | Boolean |  no  |  |

---


 
 
 #### [LoyaltyPointsConfig](#LoyaltyPointsConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | autoApply | Boolean |  no  |  |

---


 
 
 #### [AppInventoryPartialUpdate](#AppInventoryPartialUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rewardPoints | [RewardPointsConfig](#RewardPointsConfig) |  no  |  |
 | cart | [AppCartConfig](#AppCartConfig) |  no  |  |
 | payment | [AppPaymentConfig](#AppPaymentConfig) |  no  |  |
 | loyaltyPoints | [LoyaltyPointsConfig](#LoyaltyPointsConfig) |  no  |  |
 | commsEnabled | Boolean |  no  |  |

---


 
 
 #### [BrandCompanyInfo](#BrandCompanyInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyName | String |  no  |  |
 | companyId | Int |  no  |  |

---


 
 
 #### [CompanyByBrandsRequest](#CompanyByBrandsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brands | Int? |  yes  | Brand uids |
 | searchText | String |  no  | Search company by name |

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
 | companyId | Int |  no  | Current company id for current company stores only. Don't send in case of cross selling enabled |
 | brands | Int? |  yes  | Brand uids |
 | searchText | String |  no  | Search store by name or store code |

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
 | storeName | String |  no  |  |
 | storeId | Int |  no  |  |
 | storeType | String |  no  |  |
 | storeCode | String |  no  |  |
 | storeAddress | [OptedStoreAddress](#OptedStoreAddress) |  no  |  |
 | company | [OptedCompany](#OptedCompany) |  no  |  |

---


 
 
 #### [CompanyBrandInfo](#CompanyBrandInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | value | Int |  no  |  |
 | brandLogoUrl | String |  no  |  |
 | brandBannerUrl | String |  no  |  |
 | brandBannerPortraitUrl | String |  no  |  |

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
 | isActive | Boolean |  no  |  |
 | id | String |  no  |  |
 | appName | String |  no  |  |
 | landingImage | [LandingImage](#LandingImage) |  no  |  |
 | splashImage | [SplashImage](#SplashImage) |  no  |  |
 | application | String |  no  |  |
 | platformType | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |
 | packageName | String |  no  |  |

---


 
 
 #### [LandingImage](#LandingImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String |  no  |  |
 | secureUrl | String |  no  |  |

---


 
 
 #### [SplashImage](#SplashImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String |  no  |  |
 | secureUrl | String |  no  |  |

---


 
 
 #### [MobileAppConfigRequest](#MobileAppConfigRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appName | String |  no  |  |
 | landingImage | [LandingImage](#LandingImage) |  no  |  |
 | splashImage | [SplashImage](#SplashImage) |  no  |  |
 | isActive | Boolean |  no  |  |

---


 
 
 #### [BuildVersionHistory](#BuildVersionHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | versions | [BuildVersion](#BuildVersion) |  no  |  |
 | latestAvailableVersionName | String |  no  |  |

---


 
 
 #### [BuildVersion](#BuildVersion)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | application | String |  no  |  |
 | platformType | String |  no  |  |
 | buildStatus | String |  no  |  |
 | versionName | String |  no  |  |
 | versionCode | Int |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

---


 
 
 #### [AppSupportedCurrency](#AppSupportedCurrency)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | supportedCurrency | ArrayList<String> |  no  |  |
 | application | String |  no  |  |
 | defaultCurrency | [DefaultCurrency](#DefaultCurrency) |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |

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
 | id | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | name | String |  no  |  |
 | code | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | decimalDigits | Int |  no  |  |
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
 | id | String |  no  |  |

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
 | domainUrl | String |  no  | Domain url |

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
 | domainUrl | String |  no  | Domain url |
 | custom | Boolean |  no  | Get suggestion for custom domains or fynd domains |

---


 
 
 #### [DomainSuggestion](#DomainSuggestion)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | unsupported | Boolean |  no  | Whether TLD domain is supported or not |
 | isAvailable | Boolean? |  yes  |  |
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
 | descriptionHtml | String |  no  |  |
 | constants | String |  no  |  |
 | companies | ArrayList<HashMap<String,Any>> |  no  |  |
 | support | ArrayList<String> |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | meta | [IntegrationMeta](#IntegrationMeta) |  no  |  |
 | icon | String |  no  |  |
 | owner | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | token | String |  no  |  |
 | secret | String |  no  |  |
 | v | Int |  no  |  |

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
 | jsonSchema | [JsonSchema](#JsonSchema) |  no  |  |
 | browserScript | String |  no  |  |

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
 | jsonSchema | ArrayList<[JsonSchema](#JsonSchema)> |  no  |  |
 | browserScript | String |  no  |  |

---


 
 
 #### [InventoryValidator](#InventoryValidator)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | jsonSchema | ArrayList<[JsonSchema](#JsonSchema)> |  no  |  |
 | browserScript | String |  no  |  |

---


 
 
 #### [OrderValidator](#OrderValidator)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | jsonSchema | ArrayList<[JsonSchema](#JsonSchema)> |  no  |  |
 | browserScript | String |  no  |  |

---


 
 
 #### [IntegrationMeta](#IntegrationMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isPublic | Boolean |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [Integration](#Integration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | validators | [Validators](#Validators) |  no  |  |
 | description | String |  no  |  |
 | descriptionHtml | String |  no  |  |
 | constants | HashMap<String,Any> |  no  |  |
 | companies | ArrayList<HashMap<String,Any>> |  no  |  |
 | support | ArrayList<String> |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | meta | [IntegrationMeta](#IntegrationMeta) |  no  |  |
 | icon | String |  no  |  |
 | owner | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | token | String |  no  |  |
 | secret | String |  no  |  |
 | v | Int |  no  |  |

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
 | lastPatch | ArrayList<HashMap<String,Any>> |  no  |  |
 | id | String |  no  |  |
 | integration | String |  no  |  |
 | level | String |  no  |  |
 | uid | Int |  no  |  |
 | meta | ArrayList<Any> |  no  |  |
 | token | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |
 | data | HashMap<String,Any> |  no  |  |

---


 
 
 #### [OptedStoreIntegration](#OptedStoreIntegration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | otherOpted | Boolean |  no  |  |
 | otherIntegration | [IntegrationOptIn](#IntegrationOptIn) |  no  |  |
 | otherEntity | [OtherEntity](#OtherEntity) |  no  |  |

---


 
 
 #### [OtherEntity](#OtherEntity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | opted | Boolean |  no  |  |
 | permissions | ArrayList<String> |  no  |  |
 | lastPatch | [LastPatch](#LastPatch) |  no  |  |
 | id | String |  no  |  |
 | integration | String |  no  |  |
 | level | String |  no  |  |
 | uid | Int |  no  |  |
 | data | [OtherEntityData](#OtherEntityData) |  no  |  |
 | meta | ArrayList<HashMap<String,Any>> |  no  |  |
 | token | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

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
 | articleIdentifier | String |  no  |  |

---


 
 
 #### [App](#App)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | String |  no  | Current company id |
 | channelType | String |  no  |  |
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
 | franchiseEnabled | Boolean |  no  |  |
 | outOfStock | Boolean |  no  |  |
 | payment | [InventoryPaymentConfig](#InventoryPaymentConfig) |  no  |  |
 | articleAssignment | [InventoryArticleAssignment](#InventoryArticleAssignment) |  no  |  |

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
 | companyType | String |  no  |  |

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
 | id | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | uid | Int |  no  |  |
 | name | String |  no  |  |
 | displayName | String |  no  |  |
 | storeType | String |  no  |  |
 | storeCode | String |  no  |  |
 | companyId | Int |  no  |  |

---


 
 
 #### [FilterOrderingStoreRequest](#FilterOrderingStoreRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allStores | Boolean |  no  |  |
 | deployedStores | ArrayList<Int> |  no  |  |
 | q | String |  no  |  |

---


 
 
 #### [DeploymentMeta](#DeploymentMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deployedStores | ArrayList<Int> |  no  |  |
 | allStores | Boolean |  no  |  |
 | enabled | Boolean |  no  |  |
 | type | String |  no  |  |
 | id | String |  no  |  |
 | app | String |  no  |  |
 | v | Int |  no  |  |

---


 
 
 #### [OrderingStoreConfig](#OrderingStoreConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deploymentMeta | [DeploymentMeta](#DeploymentMeta) |  no  |  |

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
 | id | String |  no  |  |
 | domain | String |  no  |  |
 | company | [OtherSellerCompany](#OtherSellerCompany) |  no  |  |
 | optType | String |  no  |  |

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
 | id | String |  no  |  |
 | domain | String |  no  |  |
 | company | [OptedCompany](#OptedCompany) |  no  |  |
 | optedInventory | [OptedInventory](#OptedInventory) |  no  |  |
 | optOutInventory | [OptOutInventory](#OptOutInventory) |  no  |  |

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
 | optType | [OptType](#OptType) |  no  |  |
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
 | storeCode | String |  no  |  |
 | id | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | uid | Int |  no  |  |
 | address | [OptedStoreAddress](#OptedStoreAddress) |  no  |  |
 | displayName | String |  no  |  |
 | storeType | String |  no  |  |
 | companyId | Int |  no  |  |

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
 | id | String |  no  |  |
 | application | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

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
 | fyndRewards | [FyndRewards](#FyndRewards) |  no  |  |
 | googleMap | [GoogleMap](#GoogleMap) |  no  |  |

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
 | projectId | String |  no  |  |
 | gcmSenderId | String |  no  |  |
 | applicationId | String |  no  |  |
 | apiKey | String |  no  |  |

---


 
 
 #### [Ios](#Ios)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | applicationId | String |  no  |  |
 | apiKey | String |  no  |  |

---


 
 
 #### [Android](#Android)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | applicationId | String |  no  |  |
 | apiKey | String |  no  |  |

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
 | appId | String |  no  |  |

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
 | writeKey | String |  no  |  |

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
 | apiKey | String |  no  |  |

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
 | appId | String |  no  |  |
 | appKey | String |  no  |  |
 | webToken | String |  no  |  |

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
 | apiKey | String |  no  |  |

---


 
 
 #### [FyndRewards](#FyndRewards)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credentials | [FyndRewardsCredentials](#FyndRewardsCredentials) |  no  |  |

---


 
 
 #### [FyndRewardsCredentials](#FyndRewardsCredentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | publicKey | String |  no  |  |

---


 
 
 #### [GoogleMap](#GoogleMap)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | credentials | [GoogleMapCredentials](#GoogleMapCredentials) |  no  |  |

---


 
 
 #### [GoogleMapCredentials](#GoogleMapCredentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | apiKey | String |  no  |  |

---


 
 
 #### [ProductDetailFeature](#ProductDetailFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | similar | ArrayList<String> |  no  |  |
 | sellerSelection | Boolean |  no  |  |
 | updateProductMeta | Boolean |  no  |  |
 | requestProduct | Boolean |  no  |  |

---


 
 
 #### [LaunchPage](#LaunchPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pageType | String |  no  |  |
 | params | HashMap<String,Any> |  no  |  |
 | query | HashMap<String,Any> |  no  |  |

---


 
 
 #### [LandingPageFeature](#LandingPageFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | launchPage | [LaunchPage](#LaunchPage) |  no  |  |
 | continueAsGuest | Boolean |  no  |  |
 | loginBtnText | String |  no  |  |
 | showDomainTextbox | Boolean |  no  |  |
 | showRegisterBtn | Boolean |  no  |  |

---


 
 
 #### [RegistrationPageFeature](#RegistrationPageFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | askStoreAddress | Boolean |  no  |  |

---


 
 
 #### [AppFeature](#AppFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | productDetail | [ProductDetailFeature](#ProductDetailFeature) |  no  |  |
 | landingPage | [LandingPageFeature](#LandingPageFeature) |  no  |  |
 | registrationPage | [RegistrationPageFeature](#RegistrationPageFeature) |  no  |  |
 | homePage | [HomePageFeature](#HomePageFeature) |  no  |  |
 | common | [CommonFeature](#CommonFeature) |  no  |  |
 | cart | [CartFeature](#CartFeature) |  no  |  |
 | qr | [QrFeature](#QrFeature) |  no  |  |
 | pcr | [PcrFeature](#PcrFeature) |  no  |  |
 | order | [OrderFeature](#OrderFeature) |  no  |  |
 | id | String |  no  |  |
 | app | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

---


 
 
 #### [HomePageFeature](#HomePageFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderProcessing | Boolean |  no  |  |

---


 
 
 #### [CommonFeature](#CommonFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | communicationOptinDialog | [CommunicationOptinDialogFeature](#CommunicationOptinDialogFeature) |  no  |  |
 | deploymentStoreSelection | [DeploymentStoreSelectionFeature](#DeploymentStoreSelectionFeature) |  no  |  |
 | listingPrice | [ListingPriceFeature](#ListingPriceFeature) |  no  |  |
 | listingPage | [ListingPageFeature](#ListingPageFeature) |  no  |  |
 | currency | [CurrencyFeature](#CurrencyFeature) |  no  |  |
 | revenueEngine | [RevenueEngineFeature](#RevenueEngineFeature) |  no  |  |
 | feedback | [FeedbackFeature](#FeedbackFeature) |  no  |  |
 | compareProducts | [CompareProductsFeature](#CompareProductsFeature) |  no  |  |

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
 | sortOn | String |  no  |  |

---


 
 
 #### [CurrencyFeature](#CurrencyFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | ArrayList<String> |  no  |  |
 | type | String |  no  |  |
 | defaultCurrency | String |  no  |  |

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
 | gstInput | Boolean |  no  |  |
 | staffSelection | Boolean |  no  |  |
 | placingForCustomer | Boolean |  no  |  |
 | googleMap | Boolean |  no  |  |

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
 | staffSelection | Boolean |  no  |  |

---


 
 
 #### [OrderFeature](#OrderFeature)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | buyAgain | Boolean |  no  |  |

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
 | id | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | name | String |  no  |  |
 | code | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | decimalDigits | Int |  no  |  |
 | symbol | String |  no  |  |

---


 
 
 #### [Domain](#Domain)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Boolean |  no  |  |
 | isPrimary | Boolean |  no  |  |
 | isDefault | Boolean |  no  |  |
 | isShortlink | Boolean |  no  |  |
 | id | String |  no  |  |
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
 | redirectTo | String |  no  |  |
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
 | secureUrl | String |  no  |  |

---


 
 
 #### [Application](#Application)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | website | [ApplicationWebsite](#ApplicationWebsite) |  no  |  |
 | cors | [ApplicationCors](#ApplicationCors) |  no  |  |
 | auth | [ApplicationAuth](#ApplicationAuth) |  no  |  |
 | description | String |  no  |  |
 | channelType | String |  no  |  |
 | cacheTtl | Int |  no  |  |
 | isInternal | Boolean |  no  |  |
 | isActive | Boolean |  no  |  |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | owner | String |  no  |  |
 | companyId | Int |  no  |  |
 | token | String |  no  |  |
 | redirections | ArrayList<[ApplicationRedirections](#ApplicationRedirections)> |  no  |  |
 | meta | ArrayList<[ApplicationMeta](#ApplicationMeta)> |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |
 | banner | [SecureUrl](#SecureUrl) |  no  |  |
 | logo | [SecureUrl](#SecureUrl) |  no  |  |
 | favicon | [SecureUrl](#SecureUrl) |  no  |  |
 | domains | ArrayList<[Domain](#Domain)> |  no  |  |
 | appType | String |  no  |  |
 | mobileLogo | [SecureUrl](#SecureUrl) |  no  |  |
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
 | modeOfPayment | String |  no  |  |
 | source | String |  no  |  |

---


 
 
 #### [StorePriorityRule](#StorePriorityRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | storetypeOrder | ArrayList<String> |  no  |  |

---


 
 
 #### [ArticleAssignmentRule](#ArticleAssignmentRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storePriority | [StorePriorityRule](#StorePriorityRule) |  no  |  |

---


 
 
 #### [InventoryArticleAssignment](#InventoryArticleAssignment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | postOrderReassignment | Boolean |  no  |  |
 | enforcedStores | ArrayList<Int> |  no  |  |
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
 | addressType | String |  no  |  |

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
 | countryCode | Int |  no  |  |
 | phone | String |  no  |  |

---


 
 
 #### [ApplicationInformation](#ApplicationInformation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | [InformationAddress](#InformationAddress) |  no  |  |
 | support | [InformationSupport](#InformationSupport) |  no  |  |
 | socialLinks | [SocialLinks](#SocialLinks) |  no  |  |
 | links | [Links](#Links) |  no  |  |
 | copyrightText | String |  no  |  |
 | id | String |  no  |  |
 | businessHighlights | [BusinessHighlights](#BusinessHighlights) |  no  |  |
 | application | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | v | Int |  no  |  |

---


 
 
 #### [InformationAddress](#InformationAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | loc | String |  no  |  |
 | addressLine | ArrayList<String> |  no  |  |
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
 | googlePlus | [GooglePlusLink](#GooglePlusLink) |  no  |  |
 | youtube | [YoutubeLink](#YoutubeLink) |  no  |  |
 | linkedIn | [LinkedInLink](#LinkedInLink) |  no  |  |
 | vimeo | [VimeoLink](#VimeoLink) |  no  |  |
 | blogLink | [BlogLink](#BlogLink) |  no  |  |

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
 | id | String |  no  |  |
 | title | String |  no  |  |
 | icon | String |  no  |  |
 | subTitle | String |  no  |  |

---


 
 
 #### [ApplicationDetail](#ApplicationDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | description | String? |  yes  |  |
 | logo | [SecureUrl](#SecureUrl)? |  yes  |  |
 | mobileLogo | [SecureUrl](#SecureUrl)? |  yes  |  |
 | favicon | [SecureUrl](#SecureUrl)? |  yes  |  |
 | banner | [SecureUrl](#SecureUrl)? |  yes  |  |
 | domain | [Domain](#Domain) |  no  |  |
 | domains | ArrayList<[Domain](#Domain)> |  no  |  |
 | id | String |  no  |  |

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
 | latLong | [StoreLatLong](#StoreLatLong) |  no  |  |
 | address2 | String |  no  |  |
 | pincode | Int |  no  |  |
 | country | String |  no  |  |
 | city | String |  no  |  |

---


 
 
 #### [OrderingStore](#OrderingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | [OptedStoreAddress](#OptedStoreAddress) |  no  |  |
 | id | String |  no  |  |
 | uid | Int |  no  |  |
 | name | String |  no  |  |
 | displayName | String |  no  |  |
 | storeType | String |  no  |  |
 | storeCode | String |  no  |  |
 | pincode | Int |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [OrderingStores](#OrderingStores)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[OrderingStore](#OrderingStore)> |  no  |  |
 | deployedStores | ArrayList<Int> |  no  |  |
 | allStores | Boolean |  no  |  |
 | enabled | Boolean |  no  |  |
 | type | String |  no  |  |
 | id | String |  no  |  |
 | app | String |  no  |  |
 | v | Int |  no  |  |

---




 
 
 #### [Rule](#Rule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | Double |  no  |  |
 | max | Double |  no  |  |
 | discountQty | Double |  no  |  |
 | value | Double |  no  |  |
 | min | Double |  no  |  |

---


 
 
 #### [BulkBundleRestriction](#BulkBundleRestriction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | multiStoreAllowed | Boolean? |  yes  |  |

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
 | cancellationAllowed | Boolean |  no  |  |
 | returnAllowed | Boolean |  no  |  |

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
 | couponAllowed | Boolean |  no  |  |
 | bulkBundle | [BulkBundleRestriction](#BulkBundleRestriction) |  no  |  |
 | uses | [UsesRestriction](#UsesRestriction) |  no  |  |
 | platforms | ArrayList<String> |  no  |  |
 | payments | [PaymentCodes](#PaymentCodes) |  no  |  |
 | postOrder | [PostOrder](#PostOrder) |  no  |  |
 | orderingStores | ArrayList<Int> |  no  |  |
 | priceRange | [PriceRange](#PriceRange) |  no  |  |

---


 
 
 #### [Ownership](#Ownership)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payableCategory | String? |  yes  |  |
 | payableBy | String? |  yes  |  |

---


 
 
 #### [State](#State)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isArchived | Boolean |  no  |  |
 | isPublic | Boolean |  no  |  |
 | isDisplay | Boolean |  no  |  |

---


 
 
 #### [CouponAction](#CouponAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | txnMode | String |  no  |  |
 | actionDate | String |  no  |  |

---


 
 
 #### [Validation](#Validation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userRegisteredAfter | String |  no  |  |
 | anonymous | Boolean |  no  |  |
 | appId | ArrayList<String> |  no  |  |

---


 
 
 #### [RuleDefinition](#RuleDefinition)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | valueType | String? |  yes  |  |
 | autoApply | Boolean |  no  |  |
 | scope | ArrayList<String> |  no  |  |
 | currencyCode | String |  no  |  |
 | calculateOn | String? |  yes  |  |
 | isExact | Boolean |  no  |  |
 | applicableOn | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [Identifier](#Identifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | categoryId | ArrayList<Int> |  no  |  |
 | collectionId | ArrayList<String> |  no  |  |
 | companyId | ArrayList<Int> |  no  |  |
 | itemId | ArrayList<Int> |  no  |  |
 | brandId | ArrayList<Int> |  no  |  |
 | userId | ArrayList<String> |  no  |  |
 | articleId | ArrayList<String> |  no  |  |
 | storeId | ArrayList<Int> |  no  |  |

---


 
 
 #### [CouponSchedule](#CouponSchedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | nextSchedule | ArrayList<HashMap<String,Any>> |  no  |  |
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
 | createdBy | String |  no  |  |
 | modifiedBy | String |  no  |  |

---


 
 
 #### [Validity](#Validity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priority | Int |  no  |  |

---


 
 
 #### [CouponDateMeta](#CouponDateMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |

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
 | ruleDefinition | [RuleDefinition](#RuleDefinition)? |  yes  |  |
 | identifiers | [Identifier](#Identifier)? |  yes  |  |
 | schedule | [CouponSchedule](#CouponSchedule) |  no  |  |
 | typeSlug | String? |  yes  |  |
 | displayMeta | [DisplayMeta](#DisplayMeta)? |  yes  |  |
 | tags | ArrayList<String> |  no  |  |
 | author | [CouponAuthor](#CouponAuthor) |  no  |  |
 | validity | [Validity](#Validity)? |  yes  |  |
 | code | String? |  yes  |  |
 | dateMeta | [CouponDateMeta](#CouponDateMeta) |  no  |  |

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
 | ruleDefinition | [RuleDefinition](#RuleDefinition)? |  yes  |  |
 | identifiers | [Identifier](#Identifier)? |  yes  |  |
 | schedule | [CouponSchedule](#CouponSchedule) |  no  |  |
 | typeSlug | String? |  yes  |  |
 | displayMeta | [DisplayMeta](#DisplayMeta)? |  yes  |  |
 | tags | ArrayList<String> |  no  |  |
 | author | [CouponAuthor](#CouponAuthor) |  no  |  |
 | validity | [Validity](#Validity)? |  yes  |  |
 | code | String? |  yes  |  |
 | dateMeta | [CouponDateMeta](#CouponDateMeta) |  no  |  |

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
 | id | String |  no  |  |
 | active | Boolean |  no  |  |
 | applicationId | String |  no  |  |
 | blockReason | String |  no  |  |
 | updatedAt | String |  no  |  |
 | updatedBy | String |  no  |  |
 | userId | String |  no  |  |

---


 
 
 #### [E](#E)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | HashMap<String,Any> |  no  |  |
 | exception | String |  no  |  |
 | info | String |  no  |  |
 | message | String |  no  |  |
 | requestId | String |  no  |  |
 | stackTrace | String |  no  |  |
 | status | Int |  no  |  |

---


 
 
 #### [Giveaway](#Giveaway)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | schedule | [Schedule](#Schedule) |  no  |  |
 | active | Boolean |  no  |  |
 | applicationId | String |  no  |  |
 | audience | [RewardsAudience](#RewardsAudience) |  no  |  |
 | bannerImage | [Asset](#Asset) |  no  |  |
 | createdAt | String |  no  |  |
 | description | String |  no  |  |
 | name | String |  no  |  |
 | rule | [RewardsRule](#RewardsRule) |  no  |  |
 | title | String |  no  |  |
 | updatedAt | String |  no  |  |

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
 | id | String |  no  |  |
 | applicationId | String |  no  |  |
 | claimed | Boolean |  no  |  |
 | createdAt | String |  no  |  |
 | expiresOn | String |  no  |  |
 | points | Double |  no  |  |
 | remainingPoints | Double |  no  |  |
 | text1 | String |  no  |  |
 | text2 | String |  no  |  |
 | text3 | String |  no  |  |
 | txnName | String |  no  |  |
 | updatedAt | String |  no  |  |
 | userId | String |  no  |  |

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
 | schedule | [Schedule](#Schedule) |  no  |  |
 | active | Boolean |  no  |  |
 | applicationId | String |  no  |  |
 | bannerImage | [Asset](#Asset) |  no  |  |
 | createdAt | String |  no  |  |
 | name | String |  no  |  |
 | rule | HashMap<String,Any> |  no  |  |
 | share | [ShareMessages](#ShareMessages) |  no  |  |
 | subText | String |  no  |  |
 | text | String |  no  |  |
 | type | String |  no  |  |
 | updatedAt | String |  no  |  |
 | updatedBy | String |  no  |  |
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
 | id | String |  no  |  |
 | active | Boolean |  no  |  |
 | createdAt | String |  no  |  |
 | referral | [Referral](#Referral) |  no  |  |
 | uid | Int |  no  |  |
 | updatedAt | String |  no  |  |
 | userBlockReason | String |  no  |  |
 | userId | String |  no  |  |

---


 
 
 #### [RewardsAudience](#RewardsAudience)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | headerUserId | String |  no  |  |
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
 | propertiesCartId | String |  no  |  |
 | contextTraitsFirstName | String |  no  |  |
 | contextTraitsLastName | String |  no  |  |
 | contextTraitsPhoneNumber | String |  no  |  |
 | contextTraitsEmail | String |  no  |  |
 | contextAppApplicationId | String |  no  |  |
 | propertiesBreakupValuesRawTotal | String |  no  |  |
 | receivedAt | [ReceivedAt](#ReceivedAt) |  no  |  |

---


 
 
 #### [AbandonCartsList](#AbandonCartsList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[AbandonCartsDetail](#AbandonCartsDetail)> |  no  |  |
 | cartTotal | String |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [AbandonCartDetail](#AbandonCartDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | userId | String |  no  |  |
 | cartValue | String |  no  |  |
 | articles | ArrayList<HashMap<String,Any>> |  no  |  |
 | breakup | HashMap<String,Any> |  no  |  |
 | address | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ExportJobReq](#ExportJobReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marketplaceName | String |  no  |  |
 | startTime | String |  no  |  |
 | endTime | String |  no  |  |
 | eventType | String |  no  |  |
 | traceId | String |  no  |  |

---


 
 
 #### [ExportJobRes](#ExportJobRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | jobId | String |  no  |  |

---


 
 
 #### [ExportJobStatusRes](#ExportJobStatusRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | jobId | String |  no  |  |
 | downloadUrl | String |  no  |  |

---


 
 
 #### [GetLogsListReq](#GetLogsListReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marketplaceName | String |  no  |  |
 | startDate | String |  no  |  |
 | companyId | String |  no  |  |
 | endDate | String |  no  |  |

---


 
 
 #### [MkpLogsResp](#MkpLogsResp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startTimeIso | String |  no  |  |
 | endTimeIso | String |  no  |  |
 | eventType | String |  no  |  |
 | traceId | String |  no  |  |
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
 | marketplaceName | String |  no  |  |
 | startDate | String |  no  |  |
 | companyId | String |  no  |  |
 | endDate | String |  no  |  |
 | identifier | String |  no  |  |
 | identifierValue | String |  no  |  |

---


 
 
 #### [LogInfo](#LogInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | status | String |  no  |  |
 | eventType | String |  no  |  |
 | marketplaceName | String |  no  |  |
 | event | String |  no  |  |
 | traceId | String |  no  |  |
 | companyId | Double |  no  |  |
 | brandId | Double |  no  |  |
 | storeCode | String |  no  |  |
 | storeId | Double |  no  |  |
 | itemId | Double |  no  |  |
 | articleId | String |  no  |  |
 | sellerIdentifier | String |  no  |  |

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
 | companyId | Int? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | appIds | ArrayList<String>? |  yes  |  |
 | jobType | String? |  yes  |  |
 | discountType | String? |  yes  |  |
 | discountLevel | String? |  yes  |  |
 | value | Int |  no  |  |
 | filePath | String |  no  |  |
 | brandIds | ArrayList<Int> |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | validity | [ValidityObject](#ValidityObject)? |  yes  |  |

---


 
 
 #### [DiscountJob](#DiscountJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | appIds | ArrayList<String> |  no  |  |
 | jobType | String |  no  |  |
 | discountType | String |  no  |  |
 | discountLevel | String |  no  |  |
 | value | Int |  no  |  |
 | filePath | String |  no  |  |
 | brandIds | ArrayList<Int> |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | validity | [ValidityObject](#ValidityObject)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdBy | [UserDetails](#UserDetails)? |  yes  |  |
 | modifiedBy | [UserDetails](#UserDetails)? |  yes  |  |
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
 | companyId | Int? |  yes  |  |
 | body | HashMap<String,Any> |  no  |  |
 | type | String? |  yes  |  |
 | fileType | String? |  yes  |  |

---


 
 
 #### [DownloadFileJob](#DownloadFileJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Int> |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |

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
 | userId | String? |  yes  |  |

---


 
 
 #### [BadRequestObject](#BadRequestObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---




 
 
 #### [AddProxyReq](#AddProxyReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attachedPath | String |  no  | Proxy path slug |
 | proxyUrl | String |  no  | Proxied url |

---


 
 
 #### [AddProxyResponse](#AddProxyResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | attachedPath | String |  no  |  |
 | proxyUrl | String |  no  |  |
 | companyId | String |  no  |  |
 | applicationId | String |  no  |  |
 | extensionId | String |  no  |  |
 | createdAt | String |  no  |  |
 | modifiedAt | String |  no  |  |

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
 | eventName | String |  no  |  |
 | eventType | String |  no  |  |
 | version | String |  no  |  |
 | displayName | String |  no  |  |
 | description | String |  no  |  |
 | createdOn | String |  no  |  |

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
 | subscriberId | String |  no  |  |
 | attempt | Int |  no  |  |
 | responseCode | String |  no  |  |
 | responseMessage | String |  no  |  |
 | createdOn | String |  no  |  |
 | processedOn | String |  no  |  |
 | status | Boolean |  no  |  |

---


 
 
 #### [EventPayload](#EventPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | eventTraceId | String |  no  |  |
 | eventCompanyId | Int |  no  |  |
 | eventApplicationId | String |  no  |  |
 | eventExtensionId | String |  no  |  |
 | eventName | String |  no  |  |
 | status | Boolean |  no  |  |

---


 
 
 #### [SubscriberConfig](#SubscriberConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | webhookUrl | String |  no  |  |
 | companyId | Int |  no  |  |
 | applicationId | String |  no  |  |
 | extensionId | String |  no  |  |
 | status | String |  no  |  |
 | authMeta | [AuthMeta](#AuthMeta) |  no  |  |
 | createdOn | String |  no  |  |
 | updatedOn | String |  no  |  |
 | subscriberEventMapping | [SubscriberEvent](#SubscriberEvent) |  no  |  |

---


 
 
 #### [SubscriberEvent](#SubscriberEvent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | subscriberId | Int |  no  |  |
 | eventId | Int |  no  |  |
 | createdDate | String |  no  |  |

---


 
 
 #### [AuthMeta](#AuthMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | username | String |  no  |  |
 | password | String |  no  |  |

---


