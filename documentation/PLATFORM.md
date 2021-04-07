# FDK Application Front API Documentaion


* [Lead](#Lead) - Handles communication between Administrator <-> Staff and Staff <-> Users 
* [Theme](#Theme) - Responsible for themes 
* [User](#User) - Authentication Service 
* [Communication](#Communication) - Manages email, sms, push notifications sent to users 
* [Payment](#Payment) - Collect payment through many payment gateway i.e Stripe, Razorpay, Juspay etc.into Fynd or Self account 
* [Order](#Order) - Handles Platform websites OMS 
* [Catalog](#Catalog) - Catalog API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features.  
* [CompanyProfile](#CompanyProfile) - Company Profile API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features.  
* [Assets](#Assets) - File Storage 
* [Share](#Share) - Short link and QR Code 
* [Configuration](#Configuration) - Application configuration apis 
* [Cart](#Cart) - Cart APIs 
* [Marketplaces](#Marketplaces) - Marketplaces 
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
  * [Catalog#getSearchKeywords](#cataloggetsearchkeywords)
  * [Catalog#updateSearchKeywords](#catalogupdatesearchkeywords)
  * [Catalog#deleteSearchKeywords](#catalogdeletesearchkeywords)
  * [Catalog#getAllSearchKeyword](#cataloggetallsearchkeyword)
  * [Catalog#createCustomKeyword](#catalogcreatecustomkeyword)
  * [Catalog#getAutocompleteKeywordDetail](#cataloggetautocompletekeyworddetail)
  * [Catalog#updateAutocompleteKeyword](#catalogupdateautocompletekeyword)
  * [Catalog#deleteAutocompleteKeyword](#catalogdeleteautocompletekeyword)
  * [Catalog#getAutocompleteConfig](#cataloggetautocompleteconfig)
  * [Catalog#createCustomAutocompleteRule](#catalogcreatecustomautocompleterule)
  * [Catalog#getProductBundle](#cataloggetproductbundle)
  * [Catalog#createProductBundle](#catalogcreateproductbundle)
  * [Catalog#getProductBundleDetail](#cataloggetproductbundledetail)
  * [Catalog#updateProductBundle](#catalogupdateproductbundle)
  * [Catalog#getSizeGuides](#cataloggetsizeguides)
  * [Catalog#createSizeGuide](#catalogcreatesizeguide)
  * [Catalog#getSizeGuide](#cataloggetsizeguide)
  * [Catalog#updateSizeGuide](#catalogupdatesizeguide)
  * [Catalog#getCatalogConfiguration](#cataloggetcatalogconfiguration)
  * [Catalog#getConfigurations](#cataloggetconfigurations)
  * [Catalog#createConfigurationProductListing](#catalogcreateconfigurationproductlisting)
  * [Catalog#getConfigurationByType](#cataloggetconfigurationbytype)
  * [Catalog#createConfigurationByType](#catalogcreateconfigurationbytype)
  * [Catalog#getQueryFilters](#cataloggetqueryfilters)
  * [Catalog#getAllCollections](#cataloggetallcollections)
  * [Catalog#createCollection](#catalogcreatecollection)
  * [Catalog#getCollectionDetail](#cataloggetcollectiondetail)
  * [Catalog#updateCollection](#catalogupdatecollection)
  * [Catalog#deleteCollection](#catalogdeletecollection)
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
  * [Catalog#getCategoryData](#cataloggetcategorydata)
  * [Catalog#updateCategory](#catalogupdatecategory)
  * [Catalog#getProducts](#cataloggetproducts)
  * [Catalog#createProduct](#catalogcreateproduct)
  * [Catalog#getProduct](#cataloggetproduct)
  * [Catalog#editProduct](#catalogeditproduct)
  * [Catalog#deleteProduct](#catalogdeleteproduct)
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
 
* [CompanyProfile](#CompanyProfile)
  * [CompanyProfile#updateCompany](#companyprofileupdatecompany)
  * [CompanyProfile#cbsOnboardGet](#companyprofilecbsonboardget)
  * [CompanyProfile#getCompanyMetrics](#companyprofilegetcompanymetrics)
  * [CompanyProfile#editBrand](#companyprofileeditbrand)
  * [CompanyProfile#getBrand](#companyprofilegetbrand)
  * [CompanyProfile#createBrand](#companyprofilecreatebrand)
  * [CompanyProfile#getBrands](#companyprofilegetbrands)
  * [CompanyProfile#createBrand](#companyprofilecreatebrand)
  * [CompanyProfile#getLocations](#companyprofilegetlocations)
  * [CompanyProfile#createLocation](#companyprofilecreatelocation)
  * [CompanyProfile#updateLocation](#companyprofileupdatelocation)
  * [CompanyProfile#getLocationDetail](#companyprofilegetlocationdetail)
 
* [Assets](#Assets)
  * [Assets#startUpload](#assetsstartupload)
  * [Assets#completeUpload](#assetscompleteupload)
  * [Assets#appStartUpload](#assetsappstartupload)
  * [Assets#appCompleteUpload](#assetsappcompleteupload)
  * [Assets#getSignUrls](#assetsgetsignurls)
  * [Assets#copyFiles](#assetscopyfiles)
  * [Assets#appCopyFiles](#assetsappcopyfiles)
  * [Assets#browse](#assetsbrowse)
  * [Assets#appBrowse](#assetsappbrowse)
  * [Assets#proxy](#assetsproxy)
 
* [Share](#Share)
  * [Share#createShortLink](#sharecreateshortlink)
  * [Share#getShortLinks](#sharegetshortlinks)
  * [Share#getShortLinkByHash](#sharegetshortlinkbyhash)
  * [Share#updateShortLinkById](#shareupdateshortlinkbyid)
 
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

```javascript
// Promise
const promise = lead.getTickets(company_id, items, filters, q, status, priority, category, page_no, page_size, );

// Async/Await
const data = await lead.getTickets(company_id, items, filters, q, status, priority, category, page_no, page_size, );

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

```javascript
// Promise
const promise = lead.createTicket(company_id, );

// Async/Await
const data = await lead.createTicket(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for which the data will be returned | 


Creates a company level ticket


---


#### Lead#getTickets
Gets the list of Application level Tickets and/or ticket filters depending on query params

```javascript
// Promise
const promise = lead.getTickets(company_id, application_id, items, filters, q, status, priority, category, );

// Async/Await
const data = await lead.getTickets(company_id, application_id, items, filters, q, status, priority, category, );

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

```javascript
// Promise
const promise = lead.getTicket(company_id, ticket_id, );

// Async/Await
const data = await lead.getTicket(company_id, ticket_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for which the data will be returned | 
| ticket_id | string | Tiket ID of the ticket to be fetched | 


Retreives ticket details of a company level ticket


---


#### Lead#editTicket
Edits ticket details of a company level ticket

```javascript
// Promise
const promise = lead.editTicket(company_id, ticket_id, );

// Async/Await
const data = await lead.editTicket(company_id, ticket_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for ticket | 
| ticket_id | string | Ticket ID of ticket to be edited | 


Edits ticket details of a company level ticket such as status, priority, category, tags, attachments, assigne & ticket content changes


---


#### Lead#getTicket
Retreives ticket details of a application level ticket

```javascript
// Promise
const promise = lead.getTicket(company_id, application_id, ticket_id, );

// Async/Await
const data = await lead.getTicket(company_id, application_id, ticket_id, );

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

```javascript
// Promise
const promise = lead.editTicket(company_id, application_id, ticket_id, );

// Async/Await
const data = await lead.editTicket(company_id, application_id, ticket_id, );

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

```javascript
// Promise
const promise = lead.createHistory(company_id, ticket_id, );

// Async/Await
const data = await lead.createHistory(company_id, ticket_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for ticket | 
| ticket_id | string | Ticket ID for which history is created | 


Create history for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.


---


#### Lead#getTicketHistory
Gets history list for specific company level ticket

```javascript
// Promise
const promise = lead.getTicketHistory(company_id, ticket_id, );

// Async/Await
const data = await lead.getTicketHistory(company_id, ticket_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for ticket | 
| ticket_id | string | Ticket ID for which history is to be fetched | 


Gets history list for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.


---


#### Lead#createHistory
Create history for specific application level ticket

```javascript
// Promise
const promise = lead.createHistory(company_id, application_id, ticket_id, );

// Async/Await
const data = await lead.createHistory(company_id, application_id, ticket_id, );

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

```javascript
// Promise
const promise = lead.getTicketHistory(company_id, application_id, ticket_id, );

// Async/Await
const data = await lead.getTicketHistory(company_id, application_id, ticket_id, );

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

```javascript
// Promise
const promise = lead.getCustomForm(company_id, application_id, slug, );

// Async/Await
const data = await lead.getCustomForm(company_id, application_id, slug, );

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

```javascript
// Promise
const promise = lead.editCustomForm(company_id, application_id, slug, );

// Async/Await
const data = await lead.editCustomForm(company_id, application_id, slug, );

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

```javascript
// Promise
const promise = lead.getCustomForms(company_id, application_id, );

// Async/Await
const data = await lead.getCustomForms(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for the form | 


Get list of custom form for given application


---


#### Lead#createCustomForm
Creates a new custom form

```javascript
// Promise
const promise = lead.createCustomForm(company_id, application_id, );

// Async/Await
const data = await lead.createCustomForm(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for the form | 


Creates a new custom form for given application


---


#### Lead#getTokenForVideoRoom
Get Token to join a specific Video Room using it's unqiue name

```javascript
// Promise
const promise = lead.getTokenForVideoRoom(company_id, application_id, unique_name, );

// Async/Await
const data = await lead.getTokenForVideoRoom(company_id, application_id, unique_name, );

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

```javascript
// Promise
const promise = lead.getVideoParticipants(company_id, application_id, unique_name, );

// Async/Await
const data = await lead.getVideoParticipants(company_id, application_id, unique_name, );

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

```javascript
// Promise
const promise = lead.openVideoRoom(company_id, application_id, );

// Async/Await
const data = await lead.openVideoRoom(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for video room | 


Open a video room.


---


#### Lead#closeVideoRoom
Close the video room and force all participants to leave.

```javascript
// Promise
const promise = lead.closeVideoRoom(company_id, application_id, unique_name, );

// Async/Await
const data = await lead.closeVideoRoom(company_id, application_id, unique_name, );

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

```javascript
// Promise
const promise = theme.getThemeLibrary(company_id, application_id, page_size, page_no, );

// Async/Await
const data = await theme.getThemeLibrary(company_id, application_id, page_size, page_no, );

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

```javascript
// Promise
const promise = theme.addToThemeLibrary(company_id, application_id, );

// Async/Await
const data = await theme.addToThemeLibrary(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Add theme to theme library


---


#### Theme#applyTheme
Apply theme

```javascript
// Promise
const promise = theme.applyTheme(company_id, application_id, );

// Async/Await
const data = await theme.applyTheme(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Apply theme


---


#### Theme#isUpgradable
Checks if theme is upgradable

```javascript
// Promise
const promise = theme.isUpgradable(company_id, application_id, theme_id, );

// Async/Await
const data = await theme.isUpgradable(company_id, application_id, theme_id, );

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

```javascript
// Promise
const promise = theme.upgradeTheme(company_id, application_id, theme_id, );

// Async/Await
const data = await theme.upgradeTheme(company_id, application_id, theme_id, );

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

```javascript
// Promise
const promise = theme.getPublicThemes(company_id, application_id, page_size, page_no, );

// Async/Await
const data = await theme.getPublicThemes(company_id, application_id, page_size, page_no, );

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

```javascript
// Promise
const promise = theme.createTheme(company_id, application_id, );

// Async/Await
const data = await theme.createTheme(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Create new theme


---


#### Theme#getAppliedTheme
Get applied theme

```javascript
// Promise
const promise = theme.getAppliedTheme(company_id, application_id, );

// Async/Await
const data = await theme.getAppliedTheme(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Get applied theme


---


#### Theme#getFonts
Gets fonts

```javascript
// Promise
const promise = theme.getFonts(company_id, application_id, );

// Async/Await
const data = await theme.getFonts(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Gets fonts


---


#### Theme#getThemeById
Gets theme by id

```javascript
// Promise
const promise = theme.getThemeById(company_id, application_id, theme_id, );

// Async/Await
const data = await theme.getThemeById(company_id, application_id, theme_id, );

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

```javascript
// Promise
const promise = theme.updateTheme(company_id, application_id, theme_id, );

// Async/Await
const data = await theme.updateTheme(company_id, application_id, theme_id, );

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

```javascript
// Promise
const promise = theme.deleteTheme(company_id, application_id, theme_id, );

// Async/Await
const data = await theme.deleteTheme(company_id, application_id, theme_id, );

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

```javascript
// Promise
const promise = theme.getThemeForPreview(company_id, application_id, theme_id, );

// Async/Await
const data = await theme.getThemeForPreview(company_id, application_id, theme_id, );

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

```javascript
// Promise
const promise = theme.publishTheme(company_id, application_id, theme_id, );

// Async/Await
const data = await theme.publishTheme(company_id, application_id, theme_id, );

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

```javascript
// Promise
const promise = theme.unpublishTheme(company_id, application_id, theme_id, );

// Async/Await
const data = await theme.unpublishTheme(company_id, application_id, theme_id, );

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

```javascript
// Promise
const promise = theme.archiveTheme(company_id, application_id, theme_id, );

// Async/Await
const data = await theme.archiveTheme(company_id, application_id, theme_id, );

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

```javascript
// Promise
const promise = theme.unarchiveTheme(company_id, application_id, theme_id, );

// Async/Await
const data = await theme.unarchiveTheme(company_id, application_id, theme_id, );

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

```javascript
// Promise
const promise = user.getCustomers(company_id, application_id, q, page_size, page_no, );

// Async/Await
const data = await user.getCustomers(company_id, application_id, q, page_size, page_no, );

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

```javascript
// Promise
const promise = user.searchUsers(company_id, application_id, q, );

// Async/Await
const data = await user.searchUsers(company_id, application_id, q, );

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

```javascript
// Promise
const promise = user.getPlatformConfig(company_id, application_id, );

// Async/Await
const data = await user.getPlatformConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Used to get platform config


---


#### User#updatePlatformConfig
Update platform config

```javascript
// Promise
const promise = user.updatePlatformConfig(company_id, application_id, );

// Async/Await
const data = await user.updatePlatformConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 


Used to update platform config


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

```javascript
// Promise
const promise = communication.getCampaigns(company_id, application_id, );

// Async/Await
const data = await communication.getCampaigns(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get campaigns


---


#### Communication#createCampaign
Create campaign

```javascript
// Promise
const promise = communication.createCampaign(company_id, application_id, );

// Async/Await
const data = await communication.createCampaign(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create campaign


---


#### Communication#getCampaignById
Get campaign by id

```javascript
// Promise
const promise = communication.getCampaignById(company_id, application_id, id, );

// Async/Await
const data = await communication.getCampaignById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.updateCampaignById(company_id, application_id, id, );

// Async/Await
const data = await communication.updateCampaignById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.getStatsOfCampaignById(company_id, application_id, id, );

// Async/Await
const data = await communication.getStatsOfCampaignById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.getAudiences(company_id, application_id, );

// Async/Await
const data = await communication.getAudiences(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get audiences


---


#### Communication#createAudience
Create audience

```javascript
// Promise
const promise = communication.createAudience(company_id, application_id, );

// Async/Await
const data = await communication.createAudience(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create audience


---


#### Communication#getBigqueryHeaders
Get bigquery headers

```javascript
// Promise
const promise = communication.getBigqueryHeaders(company_id, application_id, );

// Async/Await
const data = await communication.getBigqueryHeaders(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get bigquery headers


---


#### Communication#getAudienceById
Get audience by id

```javascript
// Promise
const promise = communication.getAudienceById(company_id, application_id, id, );

// Async/Await
const data = await communication.getAudienceById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.updateAudienceById(company_id, application_id, id, );

// Async/Await
const data = await communication.updateAudienceById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.getNSampleRecordsFromCsv(company_id, application_id, );

// Async/Await
const data = await communication.getNSampleRecordsFromCsv(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get n sample records from csv


---


#### Communication#getEmailProviders
Get email providers

```javascript
// Promise
const promise = communication.getEmailProviders(company_id, application_id, );

// Async/Await
const data = await communication.getEmailProviders(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get email providers


---


#### Communication#createEmailProvider
Create email provider

```javascript
// Promise
const promise = communication.createEmailProvider(company_id, application_id, );

// Async/Await
const data = await communication.createEmailProvider(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create email provider


---


#### Communication#getEmailProviderById
Get email provider by id

```javascript
// Promise
const promise = communication.getEmailProviderById(company_id, application_id, id, );

// Async/Await
const data = await communication.getEmailProviderById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.updateEmailProviderById(company_id, application_id, id, );

// Async/Await
const data = await communication.updateEmailProviderById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.getEmailTemplates(company_id, application_id, );

// Async/Await
const data = await communication.getEmailTemplates(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get email templates


---


#### Communication#createEmailTemplate
Create email template

```javascript
// Promise
const promise = communication.createEmailTemplate(company_id, application_id, );

// Async/Await
const data = await communication.createEmailTemplate(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create email template


---


#### Communication#getSystemEmailTemplates
Get system email templates

```javascript
// Promise
const promise = communication.getSystemEmailTemplates(company_id, application_id, );

// Async/Await
const data = await communication.getSystemEmailTemplates(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get system email templates


---


#### Communication#getEmailTemplateById
Get email template by id

```javascript
// Promise
const promise = communication.getEmailTemplateById(company_id, application_id, id, );

// Async/Await
const data = await communication.getEmailTemplateById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.updateEmailTemplateById(company_id, application_id, id, );

// Async/Await
const data = await communication.updateEmailTemplateById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.deleteEmailTemplateById(company_id, application_id, id, );

// Async/Await
const data = await communication.deleteEmailTemplateById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.getEventSubscriptions(company_id, application_id, );

// Async/Await
const data = await communication.getEventSubscriptions(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get event subscriptions


---


#### Communication#getJobs
Get jobs

```javascript
// Promise
const promise = communication.getJobs(company_id, application_id, );

// Async/Await
const data = await communication.getJobs(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get jobs


---


#### Communication#triggerCampaignJob
Trigger campaign job

```javascript
// Promise
const promise = communication.triggerCampaignJob(company_id, application_id, );

// Async/Await
const data = await communication.triggerCampaignJob(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Trigger campaign job


---


#### Communication#getJobLogs
Get job logs

```javascript
// Promise
const promise = communication.getJobLogs(company_id, application_id, );

// Async/Await
const data = await communication.getJobLogs(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get job logs


---


#### Communication#getCommunicationLogs
Get communication logs

```javascript
// Promise
const promise = communication.getCommunicationLogs(company_id, application_id, );

// Async/Await
const data = await communication.getCommunicationLogs(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get communication logs


---


#### Communication#getSystemNotifications
Get system notifications

```javascript
// Promise
const promise = communication.getSystemNotifications(company_id, query, page_no, page_size, );

// Async/Await
const data = await communication.getSystemNotifications(company_id, query, page_no, page_size, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| query | object |  | 
| page_no | integer |  | 
| page_size | integer |  | 


Get system notifications


---


#### Communication#getSmsProviders
Get sms providers

```javascript
// Promise
const promise = communication.getSmsProviders(company_id, application_id, );

// Async/Await
const data = await communication.getSmsProviders(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get sms providers


---


#### Communication#createSmsProvider
Create sms provider

```javascript
// Promise
const promise = communication.createSmsProvider(company_id, application_id, );

// Async/Await
const data = await communication.createSmsProvider(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create sms provider


---


#### Communication#getSmsProviderById
Get sms provider by id

```javascript
// Promise
const promise = communication.getSmsProviderById(company_id, application_id, id, );

// Async/Await
const data = await communication.getSmsProviderById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.updateSmsProviderById(company_id, application_id, id, );

// Async/Await
const data = await communication.updateSmsProviderById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.getSmsTemplates(company_id, application_id, );

// Async/Await
const data = await communication.getSmsTemplates(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Get sms templates


---


#### Communication#createSmsTemplate
Create sms template

```javascript
// Promise
const promise = communication.createSmsTemplate(company_id, application_id, );

// Async/Await
const data = await communication.createSmsTemplate(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Create sms template


---


#### Communication#getSmsTemplateById
Get sms template by id

```javascript
// Promise
const promise = communication.getSmsTemplateById(company_id, application_id, id, );

// Async/Await
const data = await communication.getSmsTemplateById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.updateSmsTemplateById(company_id, application_id, id, );

// Async/Await
const data = await communication.updateSmsTemplateById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.deleteSmsTemplateById(company_id, application_id, id, );

// Async/Await
const data = await communication.deleteSmsTemplateById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = communication.getSystemSystemTemplates(company_id, application_id, );

// Async/Await
const data = await communication.getSystemSystemTemplates(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


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

```javascript
// Promise
const promise = payment.getBrandPaymentGatewayConfig(company_id, application_id, );

// Async/Await
const data = await payment.getBrandPaymentGatewayConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| application_id | string | Application id | 


Get All Brand Payment Gateway Config Secret


---


#### Payment#saveBrandPaymentGatewayConfig
Save Config Secret For Brand Payment Gateway

```javascript
// Promise
const promise = payment.saveBrandPaymentGatewayConfig(company_id, application_id, );

// Async/Await
const data = await payment.saveBrandPaymentGatewayConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| application_id | string | Application id | 


Save Config Secret For Brand Payment Gateway


---


#### Payment#updateBrandPaymentGatewayConfig
Save Config Secret For Brand Payment Gateway

```javascript
// Promise
const promise = payment.updateBrandPaymentGatewayConfig(company_id, application_id, );

// Async/Await
const data = await payment.updateBrandPaymentGatewayConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| application_id | string | Application id | 


Save Config Secret For Brand Payment Gateway


---


#### Payment#getPaymentModeRoutes
Get All Valid Payment Options

```javascript
// Promise
const promise = payment.getPaymentModeRoutes(company_id, application_id, refresh, request_type, );

// Async/Await
const data = await payment.getPaymentModeRoutes(company_id, application_id, refresh, request_type, );

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

```javascript
// Promise
const promise = payment.getAllPayouts(company_id, unique_external_id, );

// Async/Await
const data = await payment.getAllPayouts(company_id, unique_external_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| unique_external_id | string | Fetch payouts using unique external id | 


Get All Payouts


---


#### Payment#savePayout
Save Payout

```javascript
// Promise
const promise = payment.savePayout(company_id, );

// Async/Await
const data = await payment.savePayout(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 


Save Payout


---


#### Payment#updatePayout
Update Payout

```javascript
// Promise
const promise = payment.updatePayout(company_id, unique_transfer_no, );

// Async/Await
const data = await payment.updatePayout(company_id, unique_transfer_no, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| unique_transfer_no | string | Unique transfer id | 


Update Payout


---


#### Payment#activateAndDectivatePayout
Partial Update Payout

```javascript
// Promise
const promise = payment.activateAndDectivatePayout(company_id, unique_transfer_no, );

// Async/Await
const data = await payment.activateAndDectivatePayout(company_id, unique_transfer_no, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| unique_transfer_no | string | Unique transfer id | 


Partial Update Payout


---


#### Payment#deletePayout
Delete Payout

```javascript
// Promise
const promise = payment.deletePayout(company_id, unique_transfer_no, );

// Async/Await
const data = await payment.deletePayout(company_id, unique_transfer_no, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| unique_transfer_no | string | Unique transfer id | 


Delete Payout


---


#### Payment#getSubscriptionPaymentMethod
List Subscription Payment Method

```javascript
// Promise
const promise = payment.getSubscriptionPaymentMethod(company_id, );

// Async/Await
const data = await payment.getSubscriptionPaymentMethod(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 


Get all  Subscription  Payment Method


---


#### Payment#deleteSubscriptionPaymentMethod
Delete Subscription Payment Method

```javascript
// Promise
const promise = payment.deleteSubscriptionPaymentMethod(company_id, unique_external_id, payment_method_id, );

// Async/Await
const data = await payment.deleteSubscriptionPaymentMethod(company_id, unique_external_id, payment_method_id, );

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

```javascript
// Promise
const promise = payment.getSubscriptionConfig(company_id, );

// Async/Await
const data = await payment.getSubscriptionConfig(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 


Get all  Subscription Config details


---


#### Payment#saveSubscriptionSetupIntent
Save Subscription Setup Intent

```javascript
// Promise
const promise = payment.saveSubscriptionSetupIntent(company_id, );

// Async/Await
const data = await payment.saveSubscriptionSetupIntent(company_id, );

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

```javascript
// Promise
const promise = order.shipmentStatusUpdate(company_id, );

// Async/Await
const data = await order.shipmentStatusUpdate(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Update Shipment Status


---


#### Order#activityStatus
Get Activity Status

```javascript
// Promise
const promise = order.activityStatus(company_id, bag_id, );

// Async/Await
const data = await order.activityStatus(company_id, bag_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| bag_id | string | Bag Id | 


Get Activity Status


---


#### Order#storeProcessShipmentUpdate
Update Store Process-Shipment

```javascript
// Promise
const promise = order.storeProcessShipmentUpdate(company_id, );

// Async/Await
const data = await order.storeProcessShipmentUpdate(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Update Store Process-Shipment


---


#### Order#getOrdersByCompanyId
Get Orders for company based on Company Id

```javascript
// Promise
const promise = order.getOrdersByCompanyId(company_id, page_no, page_size, from_date, to_date, q, stage, sales_channels, order_id, stores, status, shorten_urls, filter_type, );

// Async/Await
const data = await order.getOrdersByCompanyId(company_id, page_no, page_size, from_date, to_date, q, stage, sales_channels, order_id, stores, status, shorten_urls, filter_type, );

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

```javascript
// Promise
const promise = order.trackShipmentPlatform(company_id, application_id, shipment_id, );

// Async/Await
const data = await order.trackShipmentPlatform(company_id, application_id, shipment_id, );

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

```javascript
// Promise
const promise = order.trackOrder(company_id, application_id, order_id, );

// Async/Await
const data = await order.trackOrder(company_id, application_id, order_id, );

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

```javascript
// Promise
const promise = order.failedOrders(company_id, application_id, );

// Async/Await
const data = await order.failedOrders(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 


Failed Orders


---


#### Order#reprocessOrder
Reprocess order by order id

```javascript
// Promise
const promise = order.reprocessOrder(company_id, application_id, order_id, );

// Async/Await
const data = await order.reprocessOrder(company_id, application_id, order_id, );

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

```javascript
// Promise
const promise = order.getPing(company_id, );

// Async/Await
const data = await order.getPing(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Get Ping


---


#### Order#voiceCallback
Get Voice Callback

```javascript
// Promise
const promise = order.voiceCallback(company_id, );

// Async/Await
const data = await order.voiceCallback(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Voice Callback


---


#### Order#voiceClickToCall
Get Voice Click to Call

```javascript
// Promise
const promise = order.voiceClickToCall(company_id, caller, receiver, );

// Async/Await
const data = await order.voiceClickToCall(company_id, caller, receiver, );

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


#### Catalog#getSearchKeywords
Get a Search Keywords Details

```javascript
// Promise
const promise = catalog.getSearchKeywords(company_id, application_id, id, );

// Async/Await
const data = await catalog.getSearchKeywords(company_id, application_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. | 


Get the details of a words by its `id`. If successful, returns a Collection resource in the response body specified in `GetSearchWordsDetailResponseSchema`


---


#### Catalog#updateSearchKeywords
Update Search Keyword

```javascript
// Promise
const promise = catalog.updateSearchKeywords(company_id, application_id, id, );

// Async/Await
const data = await catalog.updateSearchKeywords(company_id, application_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. | 


Update Search Keyword by its id. On successful request, returns the updated collection


---


#### Catalog#deleteSearchKeywords
Delete a Search Keywords

```javascript
// Promise
const promise = catalog.deleteSearchKeywords(company_id, application_id, id, );

// Async/Await
const data = await catalog.deleteSearchKeywords(company_id, application_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. | 


Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully


---


#### Catalog#getAllSearchKeyword
List all Search Custom Keyword Listing

```javascript
// Promise
const promise = catalog.getAllSearchKeyword(company_id, application_id, );

// Async/Await
const data = await catalog.getAllSearchKeyword(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Custom Search Keyword allows you to map conditions with keywords to give you the ultimate results


---


#### Catalog#createCustomKeyword
Add a Custom Search Keywords

```javascript
// Promise
const promise = catalog.createCustomKeyword(company_id, application_id, );

// Async/Await
const data = await catalog.createCustomKeyword(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Create a Custom Search Keywords. See `CreateSearchKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateSearchKeywordSchema`


---


#### Catalog#getAutocompleteKeywordDetail
Get a Autocomplete Keywords Details

```javascript
// Promise
const promise = catalog.getAutocompleteKeywordDetail(company_id, application_id, id, );

// Async/Await
const data = await catalog.getAutocompleteKeywordDetail(company_id, application_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. | 


Get the details of a words by its `id`. If successful, returns a keywords resource in the response body specified in `GetAutocompleteWordsResponseSchema`


---


#### Catalog#updateAutocompleteKeyword
Create & Update Autocomplete Keyword

```javascript
// Promise
const promise = catalog.updateAutocompleteKeyword(company_id, application_id, id, );

// Async/Await
const data = await catalog.updateAutocompleteKeyword(company_id, application_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. | 


Update a mapping by it's id. On successful request, returns the updated Keyword mapping


---


#### Catalog#deleteAutocompleteKeyword
Delete a Autocomplete Keywords

```javascript
// Promise
const promise = catalog.deleteAutocompleteKeyword(company_id, application_id, id, );

// Async/Await
const data = await catalog.deleteAutocompleteKeyword(company_id, application_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. | 


Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully


---


#### Catalog#getAutocompleteConfig
List all Autocomplete Keyword Listing

```javascript
// Promise
const promise = catalog.getAutocompleteConfig(company_id, application_id, );

// Async/Await
const data = await catalog.getAutocompleteConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Custom Autocomplete Keyword allows you to map conditions with keywords to give you the ultimate results


---


#### Catalog#createCustomAutocompleteRule
Add a Custom Autocomplete Keywords

```javascript
// Promise
const promise = catalog.createCustomAutocompleteRule(company_id, application_id, );

// Async/Await
const data = await catalog.createCustomAutocompleteRule(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Create a Custom Autocomplete Keywords. See `CreateAutocompleteKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateAutocompleteKeywordSchema`


---


#### Catalog#getProductBundle
List all Product Bundles

```javascript
// Promise
const promise = catalog.getProductBundle(company_id, q, );

// Async/Await
const data = await catalog.getProductBundle(company_id, q, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| q | string | A search string that is searched with product bundle name. | 


Get all product bundles for a particular company


---


#### Catalog#createProductBundle
Create Product Bundle

```javascript
// Promise
const promise = catalog.createProductBundle(company_id, );

// Async/Await
const data = await catalog.createProductBundle(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


Create Product Bundle. See `ProductBundleRequest` for the request body parameter need to create a product bundle. On successful request, returns in `ProductBundleRequest` with id


---


#### Catalog#getProductBundleDetail
Get a particular Product Bundle details

```javascript
// Promise
const promise = catalog.getProductBundleDetail(company_id, id, );

// Async/Await
const data = await catalog.getProductBundleDetail(company_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. | 


Get a particular Bundle details by its `id`. If successful, returns a Product bundle resource in the response body specified in `GetProductBundleResponse`


---


#### Catalog#updateProductBundle
Update a Product Bundle

```javascript
// Promise
const promise = catalog.updateProductBundle(company_id, id, );

// Async/Await
const data = await catalog.updateProductBundle(company_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| id | string | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. | 


Update a Product Bundle by its id. On successful request, returns the updated product bundle


---


#### Catalog#getSizeGuides
Get list of size guides

```javascript
// Promise
const promise = catalog.getSizeGuides(company_id, active, q, tag, page_no, page_size, );

// Async/Await
const data = await catalog.getSizeGuides(company_id, active, q, tag, page_no, page_size, );

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


#### Catalog#createSizeGuide
Create a size guide.

```javascript
// Promise
const promise = catalog.createSizeGuide(company_id, );

// Async/Await
const data = await catalog.createSizeGuide(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the size guide is to be created. | 


This API allows to create a size guide associated to a brand.


---


#### Catalog#getSizeGuide
Get a single size guide.

```javascript
// Promise
const promise = catalog.getSizeGuide(company_id, id, );

// Async/Await
const data = await catalog.getSizeGuide(company_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to size guide. | 
| id | string | Id of the size guide to be viewed. | 


This API helps to get data associated to a size guide.


---


#### Catalog#updateSizeGuide
Edit a size guide.

```javascript
// Promise
const promise = catalog.updateSizeGuide(company_id, id, );

// Async/Await
const data = await catalog.updateSizeGuide(company_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company. | 
| id | string | Mongo id of the size guide to be edited | 


This API allows to edit a size guide.


---


#### Catalog#getCatalogConfiguration
Get configuration meta  details for catalog for admin panel

```javascript
// Promise
const promise = catalog.getCatalogConfiguration(company_id, application_id, );

// Async/Await
const data = await catalog.getCatalogConfiguration(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


configuration meta  details for catalog.


---


#### Catalog#getConfigurations
Get configured details for catalog

```javascript
// Promise
const promise = catalog.getConfigurations(company_id, application_id, );

// Async/Await
const data = await catalog.getConfigurations(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


configured details for catalog.


---


#### Catalog#createConfigurationProductListing
Add configuration for products & listings

```javascript
// Promise
const promise = catalog.createConfigurationProductListing(company_id, application_id, );

// Async/Await
const data = await catalog.createConfigurationProductListing(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Add configuration for products & listing.


---


#### Catalog#getConfigurationByType
Get configured details for catalog

```javascript
// Promise
const promise = catalog.getConfigurationByType(company_id, application_id, type, );

// Async/Await
const data = await catalog.getConfigurationByType(company_id, application_id, type, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| type | string | type can be brands, categories etc. | 


configured details for catalog.


---


#### Catalog#createConfigurationByType
Add configuration for categories and brands

```javascript
// Promise
const promise = catalog.createConfigurationByType(company_id, application_id, type, );

// Async/Await
const data = await catalog.createConfigurationByType(company_id, application_id, type, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| type | string | type can be brands, categories etc. | 


Add configuration for categories & brands.


---


#### Catalog#getQueryFilters
Get query filters to configure a collection

```javascript
// Promise
const promise = catalog.getQueryFilters(company_id, application_id, );

// Async/Await
const data = await catalog.getQueryFilters(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Get query filters to configure a collection


---


#### Catalog#getAllCollections
List all the collections

```javascript
// Promise
const promise = catalog.getAllCollections(company_id, application_id, );

// Async/Await
const data = await catalog.getAllCollections(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


A Collection allows you to organize your products into hierarchical groups. For example, a dress might be in the category _Clothing_, the individual product might also be in the collection _Summer_. On successful request, returns all the collections as specified in `CollectionListingSchema`


---


#### Catalog#createCollection
Add a Collection

```javascript
// Promise
const promise = catalog.createCollection(company_id, application_id, );

// Async/Await
const data = await catalog.createCollection(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 


Create a collection. See `CreateCollectionRequestSchema` for the list of attributes needed to create a collection and collections/query-options for the available options to create a collection. On successful request, returns a paginated list of collections specified in `CollectionCreateResponse`


---


#### Catalog#getCollectionDetail
Get a particular collection

```javascript
// Promise
const promise = catalog.getCollectionDetail(company_id, application_id, slug, );

// Async/Await
const data = await catalog.getCollectionDetail(company_id, application_id, slug, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| slug | string | A `slug` is a human readable, URL friendly unique identifier of an object. Pass the `slug` of the collection which you want to retrieve. | 


Get the details of a collection by its `slug`. If successful, returns a Collection resource in the response body specified in `CollectionDetailResponse`


---


#### Catalog#updateCollection
Update a collection

```javascript
// Promise
const promise = catalog.updateCollection(company_id, application_id, id, );

// Async/Await
const data = await catalog.updateCollection(company_id, application_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier of a collection. | 


Update a collection by it's id. On successful request, returns the updated collection


---


#### Catalog#deleteCollection
Delete a Collection

```javascript
// Promise
const promise = catalog.deleteCollection(company_id, application_id, id, );

// Async/Await
const data = await catalog.deleteCollection(company_id, application_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier of a collection. | 


Delete a collection by it's id. Returns an object that tells whether the collection was deleted successfully


---


#### Catalog#getCollectionItems
Get the items for a collection

```javascript
// Promise
const promise = catalog.getCollectionItems(company_id, application_id, id, sort_on, page_id, page_size, );

// Async/Await
const data = await catalog.getCollectionItems(company_id, application_id, id, sort_on, page_id, page_size, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier of a collection. | 
| sort_on | string | Each response will contain sort_on param, which should be sent back to make pagination work. | 
| page_id | string | Each response will contain next_page_id param, which should be sent back to make pagination work. | 
| page_size | integer | Number of items to retrieve in each page. Default is 12. | 


Get items from a collection specified by its `id`.


---


#### Catalog#addCollectionItems
Add items to a collection

```javascript
// Promise
const promise = catalog.addCollectionItems(company_id, application_id, id, );

// Async/Await
const data = await catalog.addCollectionItems(company_id, application_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| application_id | string | A `application_id` is a unique identifier for a particular sale channel. | 
| id | string | A `id` is a unique identifier of a collection. | 


Adds items to a collection specified by its `id`. See `CollectionItemRequest` for the list of attributes needed to add items to an collection.


---


#### Catalog#getCatalogInsights
Analytics data of catalog and inventory.

```javascript
// Promise
const promise = catalog.getCatalogInsights(company_id, application_id, brand, );

// Async/Await
const data = await catalog.getCatalogInsights(company_id, application_id, brand, );

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

```javascript
// Promise
const promise = catalog.getSellerInsights(company_id, seller_app_id, );

// Async/Await
const data = await catalog.getSellerInsights(company_id, seller_app_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| seller_app_id | string | Id of the seller application which is serving the invetory/catalog of the company | 


Analytics data of catalog and inventory that are being cross-selled.


---


#### Catalog#createMarketplaceOptin
Create/Update opt-in infomation.

```javascript
// Promise
const promise = catalog.createMarketplaceOptin(company_id, marketplace, );

// Async/Await
const data = await catalog.createMarketplaceOptin(company_id, marketplace, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | The company id for which the detail needs to be retrieved. | 
| marketplace | string | The marketplace for which the detail needs to be retrieved. | 


Use this API to create/update opt-in information for given platform. If successful, returns data in the response body as specified in `OptInPostResponseSchema`


---


#### Catalog#getMarketplaceOptinDetail
Get opt-in infomation.

```javascript
// Promise
const promise = catalog.getMarketplaceOptinDetail(company_id, );

// Async/Await
const data = await catalog.getMarketplaceOptinDetail(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer |  | 


Use this API to fetch opt-in information for all the platforms. If successful, returns a logs in the response body as specified in `GetOptInPlatformSchema`


---


#### Catalog#getCompanyDetail
Get the Company details.

```javascript
// Promise
const promise = catalog.getCompanyDetail(company_id, );

// Async/Await
const data = await catalog.getCompanyDetail(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | The company id for which the detail needs to be retrieved. | 


Get the details of the company associated with the given company_id passed.


---


#### Catalog#getCompanyBrandDetail
Get the Company Brand details of Optin.

```javascript
// Promise
const promise = catalog.getCompanyBrandDetail(company_id, is_active, q, page_no, page_size, marketplace, );

// Async/Await
const data = await catalog.getCompanyBrandDetail(company_id, is_active, q, page_no, page_size, marketplace, );

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

```javascript
// Promise
const promise = catalog.getCompanyMetrics(company_id, );

// Async/Await
const data = await catalog.getCompanyMetrics(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | The company id for which the detail needs to be retrieved. | 


Get the Company metrics associated with the company ID passed.


---


#### Catalog#getStoreDetail
Get the Store details.

```javascript
// Promise
const promise = catalog.getStoreDetail(company_id, q, page_no, page_size, );

// Async/Await
const data = await catalog.getStoreDetail(company_id, q, page_no, page_size, );

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

```javascript
// Promise
const promise = catalog.listProductTemplateCategories(company_id, departments, item_type, );

// Async/Await
const data = await catalog.listProductTemplateCategories(company_id, departments, item_type, );

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

```javascript
// Promise
const promise = catalog.listDepartmentsData(company_id, );

// Async/Await
const data = await catalog.listDepartmentsData(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


Allows you to list all departments, also can search using name and filter active and incative departments, and item type


---


#### Catalog#getDepartmentData
Get specific departments details by passing in unique id of the department

```javascript
// Promise
const promise = catalog.getDepartmentData(company_id, uid, );

// Async/Await
const data = await catalog.getDepartmentData(company_id, uid, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| uid | string | A `uid` is a unique identifier of a department. | 


Allows you to get department data, by uid


---


#### Catalog#listProductTemplate
List all Templates

```javascript
// Promise
const promise = catalog.listProductTemplate(company_id, departments, );

// Async/Await
const data = await catalog.listProductTemplate(company_id, departments, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| departments | string | A `departments` is the name of a particular department. | 


Allows you to list all product templates, also can filter by department


---


#### Catalog#validateProductTemplate
Validate Product Template Schema

```javascript
// Promise
const promise = catalog.validateProductTemplate(company_id, slug, );

// Async/Await
const data = await catalog.validateProductTemplate(company_id, slug, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| slug | string | A `slug` is a unique identifier for a particular template. | 


Allows you to list all product templates validation values for all the fields present in the database


---


#### Catalog#downloadProductTemplateViews
Download Product Template View

```javascript
// Promise
const promise = catalog.downloadProductTemplateViews(company_id, slug, );

// Async/Await
const data = await catalog.downloadProductTemplateViews(company_id, slug, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| slug | string | A `slug` is a unique identifier for a particular template. | 


Allows you to download product template data


---


#### Catalog#downloadProductTemplateView
Download Product Template View

```javascript
// Promise
const promise = catalog.downloadProductTemplateView(company_id, item_type, );

// Async/Await
const data = await catalog.downloadProductTemplateView(company_id, item_type, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| item_type | string | An `item_type` defines the type of item. | 


Allows you to download product template data


---


#### Catalog#validateProductTemplateSchema
Validate Product Template Schema

```javascript
// Promise
const promise = catalog.validateProductTemplateSchema(company_id, item_type, );

// Async/Await
const data = await catalog.validateProductTemplateSchema(company_id, item_type, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| item_type | string | An `item_type` defines the type of item. The default value is standard. | 


Allows you to list all product templates validation values for all the fields present in the database


---


#### Catalog#listHSNCodes
List HSN Codes

```javascript
// Promise
const promise = catalog.listHSNCodes(company_id, );

// Async/Await
const data = await catalog.listHSNCodes(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


Allows you to list all hsn Codes


---


#### Catalog#listProductTemplateExportDetails
Allows you to list all product templates export list details

```javascript
// Promise
const promise = catalog.listProductTemplateExportDetails(company_id, );

// Async/Await
const data = await catalog.listProductTemplateExportDetails(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


Can vies details including trigger data, task id , etc.


---


#### Catalog#listTemplateBrandTypeValues
Allows you to list all values for Templates, Brands or Type

```javascript
// Promise
const promise = catalog.listTemplateBrandTypeValues(company_id, filter, );

// Async/Await
const data = await catalog.listTemplateBrandTypeValues(company_id, filter, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| filter | string | A `filter` is the unique identifier of the type of value required. | 


The filter type query parameter defines what type of data to return. The type of query returns the valid values for the same


---


#### Catalog#listCategories
Get product categories list

```javascript
// Promise
const promise = catalog.listCategories(company_id, level, q, );

// Async/Await
const data = await catalog.listCategories(company_id, level, q, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| level | string | Get category for multiple levels | 
| q | string | Get multiple categories filtered by search string | 


This API gets meta associated to product categories.


---


#### Catalog#createCategories
Create product categories

```javascript
// Promise
const promise = catalog.createCategories(company_id, );

// Async/Await
const data = await catalog.createCategories(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


This API lets user create product categories


---


#### Catalog#getCategoryData
Get product category by uid

```javascript
// Promise
const promise = catalog.getCategoryData(company_id, uid, );

// Async/Await
const data = await catalog.getCategoryData(company_id, uid, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| uid | string | Category unique id | 


This API gets meta associated to product categories.


---


#### Catalog#updateCategory
Update product categories

```javascript
// Promise
const promise = catalog.updateCategory(company_id, uid, );

// Async/Await
const data = await catalog.updateCategory(company_id, uid, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 
| uid | string | Category unique id | 


Update a product category using this apu


---


#### Catalog#getProducts
Get product list

```javascript
// Promise
const promise = catalog.getProducts(company_id, brand_ids, category_ids, search, page_no, page_size, );

// Async/Await
const data = await catalog.getProducts(company_id, brand_ids, category_ids, search, page_no, page_size, );

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


#### Catalog#createProduct
Create a product.

```javascript
// Promise
const promise = catalog.createProduct(company_id, );

// Async/Await
const data = await catalog.createProduct(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to product that is to be viewed. | 


This API allows to create product.


---


#### Catalog#getProduct
Get a single product.

```javascript
// Promise
const promise = catalog.getProduct(item_code, company_id, item_id, brand_uid, uid, );

// Async/Await
const data = await catalog.getProduct(item_code, company_id, item_id, brand_uid, uid, );

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


#### Catalog#editProduct
Edit a product.

```javascript
// Promise
const promise = catalog.editProduct(company_id, item_id, );

// Async/Await
const data = await catalog.editProduct(company_id, item_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to product that is to be viewed. | 
| item_id | integer | Id of the product to be updated. | 


This API allows to edit product.


---


#### Catalog#deleteProduct
Delete a product.

```javascript
// Promise
const promise = catalog.deleteProduct(company_id, item_id, );

// Async/Await
const data = await catalog.deleteProduct(company_id, item_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id of the company associated to product that is to be deleted. | 
| item_id | integer | Id of the product to be updated. | 


This API allows to delete product.


---


#### Catalog#getProductValidation
Validate product/size data

```javascript
// Promise
const promise = catalog.getProductValidation(company_id, );

// Async/Await
const data = await catalog.getProductValidation(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | number | Validates data against given company | 


This API validates product data.


---


#### Catalog#getProductSize
Get a single product size.

```javascript
// Promise
const promise = catalog.getProductSize(item_code, company_id, item_id, brand_uid, uid, );

// Async/Await
const data = await catalog.getProductSize(item_code, company_id, item_id, brand_uid, uid, );

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


#### Catalog#getProductBulkUploadHistory
Get a list of all bulk product upload jobs.

```javascript
// Promise
const promise = catalog.getProductBulkUploadHistory(company_id, page_no, page_size, );

// Async/Await
const data = await catalog.getProductBulkUploadHistory(company_id, page_no, page_size, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id of of which Product Bulk Upload History to be obtained. | 
| page_no | integer | The page number to navigate through the given set of results | 
| page_size | integer | Number of items to retrieve in each page. Default is 12. | 


This API helps to get bulk product upload jobs data.


---


#### Catalog#updateProductAssetsInBulk
Create a Bulk asset upload Job.

```javascript
// Promise
const promise = catalog.updateProductAssetsInBulk(company_id, );

// Async/Await
const data = await catalog.updateProductAssetsInBulk(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which assets to be uploaded. | 


This API helps to create a bulk asset upload job.


---


#### Catalog#deleteProductBulkJob
Delete Bulk product job.

```javascript
// Promise
const promise = catalog.deleteProductBulkJob(company_id, batch_id, );

// Async/Await
const data = await catalog.deleteProductBulkJob(company_id, batch_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id of the company associated to size that is to be deleted. | 
| batch_id | integer | Batch Id of the bulk product job to be deleted. | 


This API allows to delete bulk product job associated with company.


---


#### Catalog#createProductsInBulk
Create products in bulk associated with given batch Id.

```javascript
// Promise
const promise = catalog.createProductsInBulk(company_id, batch_id, );

// Async/Await
const data = await catalog.createProductsInBulk(company_id, batch_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which assets to be uploaded. | 
| batch_id | string | Batch Id in which assets to be uploaded. | 


This API helps to create products in bulk push to kafka for approval/creation.


---


#### Catalog#getCompanyTags
Get a list of all tags associated with company.

```javascript
// Promise
const promise = catalog.getCompanyTags(company_id, );

// Async/Await
const data = await catalog.getCompanyTags(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id of the product size. | 


This API helps to get tags data associated to a particular copmpany.


---


#### Catalog#getProductAssetsInBulk
Get a list of all bulk asset jobs.

```javascript
// Promise
const promise = catalog.getProductAssetsInBulk(company_id, page_no, page_size, );

// Async/Await
const data = await catalog.getProductAssetsInBulk(company_id, page_no, page_size, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id of the product size. | 
| page_no | integer | The page number to navigate through the given set of results | 
| page_size | integer | Number of items to retrieve in each page. Default is 12. | 


This API helps to get bulk asset jobs data associated to a particular company.


---


#### Catalog#createProductAssetsInBulk
Create a Bulk asset upload Job.

```javascript
// Promise
const promise = catalog.createProductAssetsInBulk(company_id, );

// Async/Await
const data = await catalog.createProductAssetsInBulk(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which assets to be uploaded. | 


This API helps to create a bulk asset upload job.


---


#### Catalog#deleteSize
Delete a Size associated with product.

```javascript
// Promise
const promise = catalog.deleteSize(company_id, item_id, size, );

// Async/Await
const data = await catalog.deleteSize(company_id, item_id, size, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id of the company associated to size that is to be deleted. | 
| item_id | integer | Item Id of the product associated with size to be deleted. | 
| size | integer | size to be deleted. | 


This API allows to delete size associated with product.


---


#### Catalog#getInventory
Get Inventory for company

```javascript
// Promise
const promise = catalog.getInventory(company_id, item_id, size, page_no, page_size, );

// Async/Await
const data = await catalog.getInventory(company_id, item_id, size, page_no, page_size, );

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


#### Catalog#addInventory
Add Inventory for particular size and store.

```javascript
// Promise
const promise = catalog.addInventory(company_id, item_id, size, );

// Async/Await
const data = await catalog.addInventory(company_id, item_id, size, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to product that is to be viewed. | 
| item_id | number | Item of the company associated to product that is to be viewed. | 
| size | string | Size in which inventory is to be added. | 


This API allows add Inventory for particular size and store.


---


#### Catalog#deleteInventory
Delete a Inventory.

```javascript
// Promise
const promise = catalog.deleteInventory(company_id, item_id, location_id, );

// Async/Await
const data = await catalog.deleteInventory(company_id, item_id, location_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id of the company associated with Inventory that is to be deleted. | 
| item_id | integer | Id of the product associated with Inventory to be deleted. | 
| location_id | number | Location ID of store of which inventory is to be deleted. | 


This API allows to delete inventory of a particular product for particular company.


---


#### Catalog#getInventoryBulkUploadHistory
Get a list of all bulk Inventory upload jobs.

```javascript
// Promise
const promise = catalog.getInventoryBulkUploadHistory(company_id, page_no, page_size, );

// Async/Await
const data = await catalog.getInventoryBulkUploadHistory(company_id, page_no, page_size, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id of of which Inventory Bulk Upload History to be obtained. | 
| page_no | integer | The page number to navigate through the given set of results | 
| page_size | integer | Number of items to retrieve in each page. Default is 12. | 


This API helps to get bulk Inventory upload jobs data.


---


#### Catalog#createBulkInventoryJob
Create a Bulk Inventory upload Job.

```javascript
// Promise
const promise = catalog.createBulkInventoryJob(company_id, );

// Async/Await
const data = await catalog.createBulkInventoryJob(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which Inventory to be uploaded. | 


This API helps to create a bulk Inventory upload job.


---


#### Catalog#deleteBulkInventoryJob
Delete Bulk Inventory job.

```javascript
// Promise
const promise = catalog.deleteBulkInventoryJob(company_id, );

// Async/Await
const data = await catalog.deleteBulkInventoryJob(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id of the company of which bulk Inventory job is to be deleted. | 


This API allows to delete bulk Inventory job associated with company.


---


#### Catalog#createBulkInventory
Create products in bulk associated with given batch Id.

```javascript
// Promise
const promise = catalog.createBulkInventory(company_id, );

// Async/Await
const data = await catalog.createBulkInventory(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which Inventory is to be uploaded. | 


This API helps to create products in bulk push to kafka for approval/creation.


---


#### Catalog#getInventoryExport
Get Inventory export history.

```javascript
// Promise
const promise = catalog.getInventoryExport(company_id, );

// Async/Await
const data = await catalog.getInventoryExport(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which assets to be uploaded. | 


This API helps to get Inventory export history.


---


#### Catalog#createInventoryExportJob
Create a Inventory export Job.

```javascript
// Promise
const promise = catalog.createInventoryExportJob(company_id, );

// Async/Await
const data = await catalog.createInventoryExportJob(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id in which assets to be uploaded. | 


This API helps to create a Inventory export job.


---


#### Catalog#exportInventoryConfig
Get List of different filters for inventory export

```javascript
// Promise
const promise = catalog.exportInventoryConfig(company_id, filter_type, );

// Async/Await
const data = await catalog.exportInventoryConfig(company_id, filter_type, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to product that is to be viewed. | 
| filter_type | string | filter type from any one of ['brand', 'store', 'type'] | 


This API allows get List of different filters like brand, store, and type for inventory export.


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

```javascript
// Promise
const promise = companyprofile.updateCompany(company_id, );

// Async/Await
const data = await companyprofile.updateCompany(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


This API allows to edit the company profile of the seller account.


---


#### CompanyProfile#cbsOnboardGet
Get company profile

```javascript
// Promise
const promise = companyprofile.cbsOnboardGet(company_id, );

// Async/Await
const data = await companyprofile.cbsOnboardGet(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


This API allows to view the company profile of the seller account.


---


#### CompanyProfile#getCompanyMetrics
Get company metrics

```javascript
// Promise
const promise = companyprofile.getCompanyMetrics(company_id, );

// Async/Await
const data = await companyprofile.getCompanyMetrics(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | A `company_id` is a unique identifier for a particular seller account. | 


This API allows to view the company metrics, i.e. the status of its brand and stores. Also its allows to view the number of products, company documents & store documents which are verified and unverified.


---


#### CompanyProfile#editBrand
Edit a brand.

```javascript
// Promise
const promise = companyprofile.editBrand(company_id, brand_id, );

// Async/Await
const data = await companyprofile.editBrand(company_id, brand_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to brand that is to be viewed. | 
| brand_id | string | Id of the brand to be viewed. | 


This API allows to edit meta of a brand.


---


#### CompanyProfile#getBrand
Get a single brand.

```javascript
// Promise
const promise = companyprofile.getBrand(company_id, brand_id, );

// Async/Await
const data = await companyprofile.getBrand(company_id, brand_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company associated to brand that is to be viewed. | 
| brand_id | string | Id of the brand to be viewed. | 


This API helps to get data associated to a particular brand.


---


#### CompanyProfile#createBrand
Create a Brand.

```javascript
// Promise
const promise = companyprofile.createBrand(company_id, );

// Async/Await
const data = await companyprofile.createBrand(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company. | 


This API allows to create a brand associated to a company.


---


#### CompanyProfile#getBrands
Get brands associated to a company

```javascript
// Promise
const promise = companyprofile.getBrands(company_id, );

// Async/Await
const data = await companyprofile.getBrands(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company. | 


This API helps to get view brands associated to a particular company.


---


#### CompanyProfile#createBrand
Create a company brand mapping.

```javascript
// Promise
const promise = companyprofile.createBrand(company_id, );

// Async/Await
const data = await companyprofile.createBrand(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the brand is to be mapped. | 


This API allows to create a company brand mapping, for a already existing brand in the system.


---


#### CompanyProfile#getLocations
Get list of locations

```javascript
// Promise
const promise = companyprofile.getLocations(company_id, store_type, q, stage, page_no, page_size, );

// Async/Await
const data = await companyprofile.getLocations(company_id, store_type, q, stage, page_no, page_size, );

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

```javascript
// Promise
const promise = companyprofile.createLocation(company_id, );

// Async/Await
const data = await companyprofile.createLocation(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the location is to be created. | 


This API allows to create a location associated to a company.


---


#### CompanyProfile#updateLocation
Edit a location asscoiated to a company.

```javascript
// Promise
const promise = companyprofile.updateLocation(company_id, location_id, );

// Async/Await
const data = await companyprofile.updateLocation(company_id, location_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the location is to be created. | 
| location_id | string | Id of the location which you want to edit. | 


This API allows to edit a location associated to a company.


---


#### CompanyProfile#getLocationDetail
Get details of a specific location.

```javascript
// Promise
const promise = companyprofile.getLocationDetail(company_id, location_id, );

// Async/Await
const data = await companyprofile.getLocationDetail(company_id, location_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the location lies. | 
| location_id | string | Id of the location which you want to view. | 


This API helps to get data associated to a specific location.


---



---
---


## Assets

```javascript
const { Configuration, Assets } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const assets = new Assets(conf);

```


#### Assets#startUpload
This operation initiates upload and returns storage link which is valid for 30 Minutes. You can use that storage link to make subsequent upload request with file buffer or blob.

```javascript
// Promise
const promise = assets.startUpload(namespace, company_id, );

// Async/Await
const data = await assets.startUpload(namespace, company_id, );

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


#### Assets#completeUpload
This will complete the upload process. After successfully uploading file, you can call this operation to complete the upload process.

```javascript
// Promise
const promise = assets.completeUpload(namespace, company_id, );

// Async/Await
const data = await assets.completeUpload(namespace, company_id, );

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


#### Assets#appStartUpload
This operation initiates upload and returns storage link which is valid for 30 Minutes. You can use that storage link to make subsequent upload request with file buffer or blob.

```javascript
// Promise
const promise = assets.appStartUpload(namespace, company_id, application_id, );

// Async/Await
const data = await assets.appStartUpload(namespace, company_id, application_id, );

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


#### Assets#appCompleteUpload
This will complete the upload process. After successfully uploading file, you can call this operation to complete the upload process.

```javascript
// Promise
const promise = assets.appCompleteUpload(namespace, company_id, application_id, );

// Async/Await
const data = await assets.appCompleteUpload(namespace, company_id, application_id, );

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


#### Assets#getSignUrls
Explain here

```javascript
// Promise
const promise = assets.getSignUrls(company_id, );

// Async/Await
const data = await assets.getSignUrls(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | company_id | 


Describe here


---


#### Assets#copyFiles
Copy Files

```javascript
// Promise
const promise = assets.copyFiles(sync, company_id, );

// Async/Await
const data = await assets.copyFiles(sync, company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| sync | boolean | sync | 
| company_id | integer | company_id | 


Copy Files


---


#### Assets#appCopyFiles
Copy Files

```javascript
// Promise
const promise = assets.appCopyFiles(sync, company_id, application_id, );

// Async/Await
const data = await assets.appCopyFiles(sync, company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| sync | boolean | sync | 
| company_id | integer | company_id | 
| application_id | integer | application_id | 


Copy Files


---


#### Assets#browse
Browse Files

```javascript
// Promise
const promise = assets.browse(namespace, company_id, );

// Async/Await
const data = await assets.browse(namespace, company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| namespace | string | bucket name | 
| company_id | integer | company_id | 


Browse Files


---


#### Assets#appBrowse
Browse Files

```javascript
// Promise
const promise = assets.appBrowse(namespace, company_id, application_id, );

// Async/Await
const data = await assets.appBrowse(namespace, company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| namespace | string | bucket name | 
| company_id | integer | company_id | 
| application_id | integer | application_id | 


Browse Files


---


#### Assets#proxy
Proxy

```javascript
// Promise
const promise = assets.proxy(company_id, url, );

// Async/Await
const data = await assets.proxy(company_id, url, );

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

```javascript
// Promise
const promise = share.createShortLink(company_id, application_id, );

// Async/Await
const data = await share.createShortLink(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 


Create short link


---


#### Share#getShortLinks
Get short links

```javascript
// Promise
const promise = share.getShortLinks(company_id, application_id, page_no, page_size, created_by, active, q, );

// Async/Await
const data = await share.getShortLinks(company_id, application_id, page_no, page_size, created_by, active, q, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| page_no | string | Current page number | 
| page_size | string | Current page size | 
| created_by | string | Short link creator | 
| active | string | Short link active status | 
| q | string | Search text for original and short url | 


Get short links


---


#### Share#getShortLinkByHash
Get short link by hash

```javascript
// Promise
const promise = share.getShortLinkByHash(company_id, application_id, hash, );

// Async/Await
const data = await share.getShortLinkByHash(company_id, application_id, hash, );

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

```javascript
// Promise
const promise = share.updateShortLinkById(company_id, application_id, id, );

// Async/Await
const data = await share.updateShortLinkById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = configuration.getBuildConfig(company_id, application_id, platform_type, );

// Async/Await
const data = await configuration.getBuildConfig(company_id, application_id, platform_type, );

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

```javascript
// Promise
const promise = configuration.updateBuildConfig(company_id, application_id, platform_type, );

// Async/Await
const data = await configuration.updateBuildConfig(company_id, application_id, platform_type, );

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

```javascript
// Promise
const promise = configuration.getPreviousVersions(company_id, application_id, platform_type, );

// Async/Await
const data = await configuration.getPreviousVersions(company_id, application_id, platform_type, );

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

```javascript
// Promise
const promise = configuration.getAppFeatures(company_id, application_id, );

// Async/Await
const data = await configuration.getAppFeatures(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get features of application


---


#### Configuration#updateAppFeatures
Update features of application

```javascript
// Promise
const promise = configuration.updateAppFeatures(company_id, application_id, );

// Async/Await
const data = await configuration.updateAppFeatures(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Update features of application


---


#### Configuration#getAppBasicDetails
Get basic application details

```javascript
// Promise
const promise = configuration.getAppBasicDetails(company_id, application_id, );

// Async/Await
const data = await configuration.getAppBasicDetails(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get basic application details like name


---


#### Configuration#updateAppBasicDetails
Add or update application's basic details

```javascript
// Promise
const promise = configuration.updateAppBasicDetails(company_id, application_id, );

// Async/Await
const data = await configuration.updateAppBasicDetails(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Add or update application's basic details


---


#### Configuration#getAppContactInfo
Get application information

```javascript
// Promise
const promise = configuration.getAppContactInfo(company_id, application_id, );

// Async/Await
const data = await configuration.getAppContactInfo(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get Application Current Information. This includes information about social links, address and contact information of company/seller/brand of the application.


---


#### Configuration#updateAppContactInfo
Get application information

```javascript
// Promise
const promise = configuration.updateAppContactInfo(company_id, application_id, );

// Async/Await
const data = await configuration.updateAppContactInfo(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Save Application Current Information. This includes information about social links, address and contact information of an application.


---


#### Configuration#getAppApiTokens
Get social tokens

```javascript
// Promise
const promise = configuration.getAppApiTokens(company_id, application_id, );

// Async/Await
const data = await configuration.getAppApiTokens(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get social tokens.


---


#### Configuration#updateAppApiTokens
Add social tokens

```javascript
// Promise
const promise = configuration.updateAppApiTokens(company_id, application_id, );

// Async/Await
const data = await configuration.updateAppApiTokens(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Add social tokens.


---


#### Configuration#getAppCompanies
Application inventory enabled companies

```javascript
// Promise
const promise = configuration.getAppCompanies(company_id, application_id, );

// Async/Await
const data = await configuration.getAppCompanies(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Application inventory enabled companies.


---


#### Configuration#getAppStores
Application inventory enabled stores

```javascript
// Promise
const promise = configuration.getAppStores(company_id, application_id, );

// Async/Await
const data = await configuration.getAppStores(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Application inventory enabled stores.


---


#### Configuration#getInventoryConfig
Get application configuration

```javascript
// Promise
const promise = configuration.getInventoryConfig(company_id, application_id, );

// Async/Await
const data = await configuration.getInventoryConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get application configuration for various features and data


---


#### Configuration#updateInventoryConfig
Update application configuration

```javascript
// Promise
const promise = configuration.updateInventoryConfig(company_id, application_id, );

// Async/Await
const data = await configuration.updateInventoryConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Update application configuration for various features and data


---


#### Configuration#partiallyUpdateInventoryConfig
Partially update application configuration

```javascript
// Promise
const promise = configuration.partiallyUpdateInventoryConfig(company_id, application_id, );

// Async/Await
const data = await configuration.partiallyUpdateInventoryConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Partially update application configuration for various features and data


---


#### Configuration#getAppCurrencyConfig
Get application enabled currency list

```javascript
// Promise
const promise = configuration.getAppCurrencyConfig(company_id, application_id, );

// Async/Await
const data = await configuration.getAppCurrencyConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get application enabled currency list


---


#### Configuration#updateAppCurrencyConfig
Add initial application supported currency

```javascript
// Promise
const promise = configuration.updateAppCurrencyConfig(company_id, application_id, );

// Async/Await
const data = await configuration.updateAppCurrencyConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Add initial application supported currency for various features and data. Default INR will be enabled.


---


#### Configuration#getOrderingStoresByFilter
Get ordering store by filter

```javascript
// Promise
const promise = configuration.getOrderingStoresByFilter(company_id, application_id, );

// Async/Await
const data = await configuration.getOrderingStoresByFilter(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get ordering store by filter


---


#### Configuration#updateOrderingStoreConfig
Add/Update ordering store config

```javascript
// Promise
const promise = configuration.updateOrderingStoreConfig(company_id, application_id, );

// Async/Await
const data = await configuration.updateOrderingStoreConfig(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Add/Update ordering store config.


---


#### Configuration#getDomains
Get attached domain list

```javascript
// Promise
const promise = configuration.getDomains(company_id, application_id, );

// Async/Await
const data = await configuration.getDomains(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get attached domain list.


---


#### Configuration#addDomain
Add new domain to application

```javascript
// Promise
const promise = configuration.addDomain(company_id, application_id, );

// Async/Await
const data = await configuration.addDomain(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Add new domain to application.


---


#### Configuration#removeDomainById
Remove attached domain

```javascript
// Promise
const promise = configuration.removeDomainById(company_id, application_id, id, );

// Async/Await
const data = await configuration.removeDomainById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = configuration.changeDomainType(company_id, application_id, );

// Async/Await
const data = await configuration.changeDomainType(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Change a domain to Primary or Shortlink domain


---


#### Configuration#getDomainStatus
Get domain connected status.

```javascript
// Promise
const promise = configuration.getDomainStatus(company_id, application_id, );

// Async/Await
const data = await configuration.getDomainStatus(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get domain connected status. Check if domain is live and mapped to appropriate IP to fynd servers.


---


#### Configuration#createApplication
Create application

```javascript
// Promise
const promise = configuration.createApplication(company_id, );

// Async/Await
const data = await configuration.createApplication(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 


Create new application


---


#### Configuration#getApplications
Get list of application under company

```javascript
// Promise
const promise = configuration.getApplications(company_id, page_no, page_size, q, );

// Async/Await
const data = await configuration.getApplications(company_id, page_no, page_size, q, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| page_no | integer |  | 
| page_size | integer |  | 
| q | object | Url encoded object used as mongodb query | 


Get list of application under company


---


#### Configuration#getApplicationById
Get application data from id

```javascript
// Promise
const promise = configuration.getApplicationById(company_id, application_id, );

// Async/Await
const data = await configuration.getApplicationById(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current application id | 


Get application data from id


---


#### Configuration#getCurrencies
Get all currencies

```javascript
// Promise
const promise = configuration.getCurrencies(company_id, );

// Async/Await
const data = await configuration.getCurrencies(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 


Get all currencies


---


#### Configuration#getDomainAvailibility
Check domain availibility before linking to application

```javascript
// Promise
const promise = configuration.getDomainAvailibility(company_id, );

// Async/Await
const data = await configuration.getDomainAvailibility(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 


Check domain availibility before linking to application. Also sends domain suggestions with similar to queried domain. \ Custom domain search is currently powered by GoDaddy provider.


---


#### Configuration#getIntegrationById
Get integration data

```javascript
// Promise
const promise = configuration.getIntegrationById(company_id, id, );

// Async/Await
const data = await configuration.getIntegrationById(company_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| id | integer | Integration id | 


Get integration data


---


#### Configuration#getAvailableOptIns
Get all available integration opt-ins

```javascript
// Promise
const promise = configuration.getAvailableOptIns(company_id, page_no, page_size, );

// Async/Await
const data = await configuration.getAvailableOptIns(company_id, page_no, page_size, );

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

```javascript
// Promise
const promise = configuration.getSelectedOptIns(company_id, level, uid, page_no, page_size, );

// Async/Await
const data = await configuration.getSelectedOptIns(company_id, level, uid, page_no, page_size, );

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

```javascript
// Promise
const promise = configuration.getIntegrationLevelConfig(company_id, id, level, );

// Async/Await
const data = await configuration.getIntegrationLevelConfig(company_id, id, level, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| id | string | Integration id | 
| level | string | Integration level | 


Get integration level config


---


#### Configuration#getIntegrationByLevelId
Get level data for integration

```javascript
// Promise
const promise = configuration.getIntegrationByLevelId(company_id, id, level, uid, );

// Async/Await
const data = await configuration.getIntegrationByLevelId(company_id, id, level, uid, );

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

```javascript
// Promise
const promise = configuration.getLevelActiveIntegrations(company_id, id, level, uid, );

// Async/Await
const data = await configuration.getLevelActiveIntegrations(company_id, id, level, uid, );

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

```javascript
// Promise
const promise = configuration.getBrandsByCompany(company_id, q, );

// Async/Await
const data = await configuration.getBrandsByCompany(company_id, q, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| q | string | Search text for brand name | 


Get brands by company


---


#### Configuration#getCompanyByBrands
Get company by brand uids

```javascript
// Promise
const promise = configuration.getCompanyByBrands(company_id, page_no, page_size, );

// Async/Await
const data = await configuration.getCompanyByBrands(company_id, page_no, page_size, );

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

```javascript
// Promise
const promise = configuration.getStoreByBrands(company_id, page_no, page_size, );

// Async/Await
const data = await configuration.getStoreByBrands(company_id, page_no, page_size, );

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

```javascript
// Promise
const promise = configuration.getOtherSellerApplications(company_id, );

// Async/Await
const data = await configuration.getOtherSellerApplications(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 


Get other seller applications who has opted current company as inventory


---


#### Configuration#getOtherSellerApplicationById
Get other seller applications

```javascript
// Promise
const promise = configuration.getOtherSellerApplicationById(company_id, id, );

// Async/Await
const data = await configuration.getOtherSellerApplicationById(company_id, id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| id | string | Application Id | 


Get other seller application


---


#### Configuration#optOutFromApplication
Opt out company or store from other seller application

```javascript
// Promise
const promise = configuration.optOutFromApplication(company_id, id, );

// Async/Await
const data = await configuration.optOutFromApplication(company_id, id, );

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

```javascript
// Promise
const promise = cart.getCoupons(company_id, application_id, page_no, page_size, is_archived, title, is_public, is_display, type_slug, code, );

// Async/Await
const data = await cart.getCoupons(company_id, application_id, page_no, page_size, is_archived, title, is_public, is_display, type_slug, code, );

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

```javascript
// Promise
const promise = cart.createCoupon(company_id, application_id, );

// Async/Await
const data = await cart.createCoupon(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Current company id | 
| application_id | string | Current Application _id | 


Create new coupon


---


#### Cart#getCouponById
Get with single coupon details or coupon list

```javascript
// Promise
const promise = cart.getCouponById(company_id, application_id, id, );

// Async/Await
const data = await cart.getCouponById(company_id, application_id, id, );

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

```javascript
// Promise
const promise = cart.updateCoupon(company_id, application_id, id, );

// Async/Await
const data = await cart.updateCoupon(company_id, application_id, id, );

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

```javascript
// Promise
const promise = cart.updateCouponPartially(company_id, application_id, id, );

// Async/Await
const data = await cart.updateCouponPartially(company_id, application_id, id, );

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

```javascript
// Promise
const promise = marketplaces.getAvailableChannels(company_id, );

// Async/Await
const data = await marketplaces.getAvailableChannels(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Get available marketplace channels


---


#### Marketplaces#getChannels
Get all registered marketplace channels for a seller

```javascript
// Promise
const promise = marketplaces.getChannels(company_id, );

// Async/Await
const data = await marketplaces.getChannels(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Get all registered marketplace channels for a seller


---


#### Marketplaces#getChannel
Get registered marketplace channel for a seller

```javascript
// Promise
const promise = marketplaces.getChannel(company_id, channel, );

// Async/Await
const data = await marketplaces.getChannel(company_id, channel, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 


Get registered marketplace channel for a seller


---


#### Marketplaces#registerMyntraChannel
Create Myntra marketplace channel for a seller

```javascript
// Promise
const promise = marketplaces.registerMyntraChannel(company_id, );

// Async/Await
const data = await marketplaces.registerMyntraChannel(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Create Myntra marketplace channel for a seller


---


#### Marketplaces#updateMyntraChannelCredentials
Update Myntra marketplace channel credentials for a seller

```javascript
// Promise
const promise = marketplaces.updateMyntraChannelCredentials(company_id, );

// Async/Await
const data = await marketplaces.updateMyntraChannelCredentials(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Update Myntra marketplace channel credentials for a seller


---


#### Marketplaces#registerAmazonChannel
Create Amazon marketplace channel for a seller

```javascript
// Promise
const promise = marketplaces.registerAmazonChannel(company_id, );

// Async/Await
const data = await marketplaces.registerAmazonChannel(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Create Amazon marketplace channel for a seller


---


#### Marketplaces#updateAmazonChannelCredentials
Update Amazon marketplace channel credentials for a seller

```javascript
// Promise
const promise = marketplaces.updateAmazonChannelCredentials(company_id, );

// Async/Await
const data = await marketplaces.updateAmazonChannelCredentials(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Update Amazon marketplace channel credentials for a seller


---


#### Marketplaces#registerFlipkartChannel
Create Flipkart / Flipkart Assured marketplace channel for a seller

```javascript
// Promise
const promise = marketplaces.registerFlipkartChannel(company_id, flipkart_channel, );

// Async/Await
const data = await marketplaces.registerFlipkartChannel(company_id, flipkart_channel, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| flipkart_channel | string | Name of marketplace channel | 


Create Flipkart / Flipkart Assured marketplace channel for a seller


---


#### Marketplaces#updateFlipkartChannelCredentials
Update Flipkart / Flipkart Assured marketplace channel credentials for a seller

```javascript
// Promise
const promise = marketplaces.updateFlipkartChannelCredentials(company_id, flipkart_channel, );

// Async/Await
const data = await marketplaces.updateFlipkartChannelCredentials(company_id, flipkart_channel, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| flipkart_channel | string | Name of marketplace channel | 


Update Flipkart / Flipkart Assured marketplace channel credentials for a seller


---


#### Marketplaces#registerTatacliqChannel
Create Tatacliq / Tatacliq Luxury marketplace channel for a seller

```javascript
// Promise
const promise = marketplaces.registerTatacliqChannel(company_id, tatacliq_channel, );

// Async/Await
const data = await marketplaces.registerTatacliqChannel(company_id, tatacliq_channel, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| tatacliq_channel | string | Name of marketplace channel | 


Create Tatacliq / Tatacliq Luxury marketplace channel for a seller


---


#### Marketplaces#updateTatacliqChannelCredentials
Update Tatacliq / Tatacliq Luxury Assured marketplace channel credentials for a seller

```javascript
// Promise
const promise = marketplaces.updateTatacliqChannelCredentials(company_id, tatacliq_channel, );

// Async/Await
const data = await marketplaces.updateTatacliqChannelCredentials(company_id, tatacliq_channel, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| tatacliq_channel | string | Name of marketplace channel | 


Update Tatacliq / Tatacliq Luxury marketplace channel credentials for a seller


---


#### Marketplaces#registerAjioChannel
Create Ajio marketplace channel for a seller

```javascript
// Promise
const promise = marketplaces.registerAjioChannel(company_id, );

// Async/Await
const data = await marketplaces.registerAjioChannel(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Create Ajio marketplace channel for a seller


---


#### Marketplaces#updateAjioChannelCredentials
Update Ajio marketplace channel credentials for a seller

```javascript
// Promise
const promise = marketplaces.updateAjioChannelCredentials(company_id, );

// Async/Await
const data = await marketplaces.updateAjioChannelCredentials(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 


Update Ajio marketplace channel credentials for a seller


---


#### Marketplaces#updateChannelInventorySyncConfig
Update inventory sync configuration of marketplace channel for a seller

```javascript
// Promise
const promise = marketplaces.updateChannelInventorySyncConfig(company_id, channel, validate_cred, );

// Async/Await
const data = await marketplaces.updateChannelInventorySyncConfig(company_id, channel, validate_cred, );

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

```javascript
// Promise
const promise = marketplaces.getChannelLocationConfig(company_id, channel, );

// Async/Await
const data = await marketplaces.getChannelLocationConfig(company_id, channel, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 


Get marketplace channel location config for a seller


---


#### Marketplaces#updateChannelLocationConfig
update marketplace channel location config for a seller

```javascript
// Promise
const promise = marketplaces.updateChannelLocationConfig(company_id, channel, );

// Async/Await
const data = await marketplaces.updateChannelLocationConfig(company_id, channel, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 


update marketplace channel location config for a seller


---


#### Marketplaces#getChannelStatus
Get marketplace channel active status for a seller

```javascript
// Promise
const promise = marketplaces.getChannelStatus(company_id, channel, );

// Async/Await
const data = await marketplaces.getChannelStatus(company_id, channel, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 


Get marketplace channel active status for a seller


---


#### Marketplaces#updateChannelStatus
Update marketplace channel active status for a seller

```javascript
// Promise
const promise = marketplaces.updateChannelStatus(company_id, channel, );

// Async/Await
const data = await marketplaces.updateChannelStatus(company_id, channel, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| channel | string | Name of marketplace channel | 


Update marketplace channel active status for a seller


---


#### Marketplaces#triggerChannelInventoryUpdates
Trigger marketplace channel inventory updates for a seller

```javascript
// Promise
const promise = marketplaces.triggerChannelInventoryUpdates(company_id, channel, update_type, );

// Async/Await
const data = await marketplaces.triggerChannelInventoryUpdates(company_id, channel, update_type, );

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

```javascript
// Promise
const promise = analytics.getStatiscticsGroups(company_id, application_id, );

// Async/Await
const data = await analytics.getStatiscticsGroups(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 


Get statistics groups


---


#### Analytics#getStatiscticsGroupComponents
Get statistics group components

```javascript
// Promise
const promise = analytics.getStatiscticsGroupComponents(company_id, application_id, group_name, );

// Async/Await
const data = await analytics.getStatiscticsGroupComponents(company_id, application_id, group_name, );

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

```javascript
// Promise
const promise = analytics.getComponentStatsCSV(company_id, application_id, component_name, );

// Async/Await
const data = await analytics.getComponentStatsCSV(company_id, application_id, component_name, );

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

```javascript
// Promise
const promise = analytics.getComponentStatsPDF(company_id, application_id, component_name, );

// Async/Await
const data = await analytics.getComponentStatsPDF(company_id, application_id, component_name, );

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

```javascript
// Promise
const promise = analytics.getComponentStats(company_id, application_id, component_name, );

// Async/Await
const data = await analytics.getComponentStats(company_id, application_id, component_name, );

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

```javascript
// Promise
const promise = analytics.getAbandonCartList(company_id, application_id, from, to, page_no, page_size, );

// Async/Await
const data = await analytics.getAbandonCartList(company_id, application_id, from, to, page_no, page_size, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| from | string | From date | 
| to | string | To date | 
| page_no | string | Current page number | 
| page_size | string | Current page size | 


Get abandon carts list


---


#### Analytics#getAbandonCartsCSV
Get abandon carts csv

```javascript
// Promise
const promise = analytics.getAbandonCartsCSV(company_id, application_id, from, to, );

// Async/Await
const data = await analytics.getAbandonCartsCSV(company_id, application_id, from, to, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| application_id | string | Application Id | 
| from | string | From date | 
| to | string | To date | 


Get abandon carts csv


---


#### Analytics#getAbandonCartDetail
Get abandon carts details

```javascript
// Promise
const promise = analytics.getAbandonCartDetail(company_id, application_id, cart_id, );

// Async/Await
const data = await analytics.getAbandonCartDetail(company_id, application_id, cart_id, );

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

```javascript
// Promise
const promise = analytics.createExportJob(company_id, export_type, );

// Async/Await
const data = await analytics.createExportJob(company_id, export_type, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| export_type | string | Export type / format | 


Create data export job in required format


---


#### Analytics#getExportJobStatus
Get data export job status

```javascript
// Promise
const promise = analytics.getExportJobStatus(company_id, export_type, job_id, );

// Async/Await
const data = await analytics.getExportJobStatus(company_id, export_type, job_id, );

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

```javascript
// Promise
const promise = analytics.getLogsList(company_id, log_type, page_no, page_size, );

// Async/Await
const data = await analytics.getLogsList(company_id, log_type, page_no, page_size, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| log_type | string | Log type | 
| page_no | string | Current page number | 
| page_size | string | Current page size | 


Get logs list


---


#### Analytics#searchLogs
Search logs

```javascript
// Promise
const promise = analytics.searchLogs(company_id, page_no, page_size, log_type, );

// Async/Await
const data = await analytics.searchLogs(company_id, page_no, page_size, log_type, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company Id | 
| page_no | string | Current page number | 
| page_size | string | Current page size | 
| log_type | string | Log type | 


Search logs


---



---
---
