# FDK Platform Front API Documentaion


* [Lead](#Lead) - Handles communication between Administrator <-> Staff and Staff <-> Users 
* [User](#User) - Authentication Service 
* [Payment](#Payment) - Collect payment through many payment gateway i.e Stripe, Razorpay, Juspay etc.into Fynd or Self account 
* [Order](#Order) - Handles Platform websites OMS 
* [Catalog](#Catalog) - Catalog API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features.  
* [CompanyProfile](#CompanyProfile) - Company Profile API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features.  
* [FileStorage](#FileStorage) - File Storage 
* [Share](#Share) - Short link and QR Code 
* [Configuration](#Configuration) - Application configuration apis 
* [Cart](#Cart) - Cart APIs 

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
 
* [User](#User)
  * [User#getCustomers](#usergetcustomers)
  * [User#searchUsers](#usersearchusers)
  * [User#createUser](#usercreateuser)
  * [User#updateUser](#userupdateuser)
  * [User#createUserSession](#usercreateusersession)
  * [User#getPlatformConfig](#usergetplatformconfig)
  * [User#updatePlatformConfig](#userupdateplatformconfig)
 
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
  * [Catalog#deleteSearchKeywords](#catalogdeletesearchkeywords)
  * [Catalog#updateSearchKeywords](#catalogupdatesearchkeywords)
  * [Catalog#getAllSearchKeyword](#cataloggetallsearchkeyword)
  * [Catalog#createCustomKeyword](#catalogcreatecustomkeyword)
  * [Catalog#getAutocompleteKeywordDetail](#cataloggetautocompletekeyworddetail)
  * [Catalog#deleteAutocompleteKeyword](#catalogdeleteautocompletekeyword)
  * [Catalog#updateAutocompleteKeyword](#catalogupdateautocompletekeyword)
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
  * [Catalog#getCategoryData](#cataloggetcategorydata)
  * [Catalog#updateCategory](#catalogupdatecategory)
  * [Catalog#getProducts](#cataloggetproducts)
  * [Catalog#createProduct](#catalogcreateproduct)
  * [Catalog#getProduct](#cataloggetproduct)
  * [Catalog#deleteProduct](#catalogdeleteproduct)
  * [Catalog#editProduct](#catalogeditproduct)
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
  * [Catalog#getHsnCode](#cataloggethsncode)
  * [Catalog#updateHsnCode](#catalogupdatehsncode)
  * [Catalog#bulkHsnCode](#catalogbulkhsncode)
  * [Catalog#getApplicationBrands](#cataloggetapplicationbrands)
  * [Catalog#getDepartments](#cataloggetdepartments)
  * [Catalog#getCategories](#cataloggetcategories)
  * [Catalog#getAppicationProducts](#cataloggetappicationproducts)
  * [Catalog#getProductDetailBySlug](#cataloggetproductdetailbyslug)
 
* [CompanyProfile](#CompanyProfile)
  * [CompanyProfile#cbsOnboardGet](#companyprofilecbsonboardget)
  * [CompanyProfile#updateCompany](#companyprofileupdatecompany)
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
| priority | String? | Filter tickets on priority |   
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
| priority | String? | Filter tickets on priority |   
| category | String? | Filter tickets on category |  



Gets the list of Application level Tickets and/or ticket filters

*Success Response*



Success


Schema: `TicketList`






---


#### getTicket
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
| companyId | String? | Company ID for which the data will be returned |   
| ticketId | String? | Tiket ID of the ticket to be fetched |  



Retreives ticket details of a company level ticket

*Success Response*



Success


Schema: `Ticket`






---


#### editTicket
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
| companyId | String? | Company ID for ticket |   
| ticketId | String? | Ticket ID of ticket to be edited |  



Edits ticket details of a company level ticket such as status, priority, category, tags, attachments, assigne & ticket content changes

*Success Response*



Success


Schema: `Ticket`






---


#### getTicket
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for which the data will be returned |   
| ticketId | String? | Tiket ID of the ticket to be fetched |  



Retreives ticket details of a application level ticket with ticket ID

*Success Response*



Success


Schema: `Ticket`






---


#### editTicket
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for ticket |   
| ticketId | String? | Ticket ID of ticket to be edited |  



Edits ticket details of a application level ticket such as status, priority, category, tags, attachments, assigne & ticket content changes

*Success Response*



Success


Schema: `Ticket`






---


#### createHistory
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
| companyId | String? | Company ID for ticket |   
| ticketId | String? | Ticket ID for which history is created |  



Create history for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Success Response*



Success


Schema: `TicketHistory`






---


#### getTicketHistory
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
| companyId | String? | Company ID for ticket |   
| ticketId | String? | Ticket ID for which history is to be fetched |  



Gets history list for specific company level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Success Response*



Success


Schema: `TicketHistoryList`






---


#### createHistory
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
| companyId | String? | Company ID of the application |   
| applicationId | String? | Application ID for ticket |   
| ticketId | String? | Ticket ID for which history is created |  



Create history for specific application level ticket, this history is seen on ticket detail page, this can be comment, log or rating.

*Success Response*



Success


Schema: `TicketHistory`






---


#### getTicketHistory
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
| companyId | String? | Company ID of application |   
| applicationId | String? | Application ID for ticket |   
| ticketId | String? | Ticket ID for which history is to be fetched |  



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


## User


#### getCustomers
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
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| q | String? | The search query. This can be a partial or complete name of a either a product, brand or category |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 10. |   
| pageNo | Int? | Page number. Default is 1. |  



Used to get application customers list

*Success Response*



Customer list


Schema: `CustomerListResponseSchema`








Schema: `AuthenticationApiError`








Schema: `AuthenticationApiError`






---


#### searchUsers
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
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |   
| q | String? | The search query. This can be a partial or complete name of a either a product, brand or category |  



Search users

*Success Response*



User list


Schema: `UserSearchResponseSchema`








Schema: `AuthenticationApiError`








Schema: `AuthenticationApiError`






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








Schema: `AuthenticationApiError`








Schema: `AuthenticationApiError`






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








Schema: `AuthenticationApiError`








Schema: `AuthenticationApiError`






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








Schema: `AuthenticationApiError`








Schema: `AuthenticationApiError`






---


#### getPlatformConfig
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
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Used to get platform config

*Success Response*



Platform Config


Schema: `PlatformSchema`








Schema: `AuthenticationApiError`








Schema: `AuthenticationApiError`






---


#### updatePlatformConfig
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
| companyId | String? | Company ID |   
| applicationId | String? | Application ID |  



Used to update platform config

*Success Response*



Platform Config


Schema: `PlatformSchema`








Schema: `AuthenticationApiError`








Schema: `AuthenticationApiError`






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





Internal Server Error


Schema: `ErrorCodeDescription`





Internal Server Error


Schema: `ErrorCodeDescription`






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





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





Bad Request Error


Schema: `HttpErrorCodeAndResponse`





Internal Server Error


Schema: `HttpErrorCodeAndResponse`






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





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






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





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






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





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






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





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






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





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






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





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






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





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






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





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






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





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






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





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






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





API Error


Schema: `ApefaceApiError`





Internal Server Error


Schema: `ApefaceApiError`






---



---
---


## Catalog


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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### updateCollection
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String? | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String? | A `id` is a unique identifier of a collection. |  



Update a collection by it's id. On successful request, returns the updated collection

*Success Response*



The Collection object. See example below or refer `CollectionCreateResponse` for details.


Schema: `CollectionCreateResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






---


#### listDepartmentsData
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |  



Allows you to list all departments, also can search using name and filter active and incative departments, and item type

*Success Response*



List of custom search keywords. See example below or refer `DepartmentsResponse` for details


Schema: `DepartmentsResponse`





Bad request. See the error object in the response body for specific reason


Schema: `DepartmentErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `DepartmentErrorResponse`






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



List of custom search keywords. See example below or refer `TemplatesResponse` for details


Schema: `TemplatesResponse`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






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



Can vies details including trigger data, task id , etc.

*Success Response*



List of custom search keywords. See example below or refer `TemplatesResponse` for details


Schema: `TemplatesResponse`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






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



List of Templates, Brands or Types. See example below or refer `ProductConfligurationDownloads` for details


Schema: `ProductConfligurationDownloads`





Bad request. See the error object in the response body for specific reason


Schema: `PTErrorResponse`






---


#### listCategories
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
| companyId | String? | A `company_id` is a unique identifier for a particular seller account. |   
| level | String? | Get category for multiple levels |   
| q | String? | Get multiple categories filtered by search string |  



This API gets meta associated to product categories.

*Success Response*



Category Meta. See example below or refer `CategoryResponse` for details


Schema: `CategoryResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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



Category Meta. See example below or refer `CategorySchema` for details


Schema: `Category`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


#### getProducts
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
| companyId | Double? | Get list of products filtered by company Id |   
| brandIds | Double? | Get multiple products filtered by brand Ids |   
| categoryIds | Double? | Get multiple products filtered by category Ids |   
| search | String? | Get multiple products filtered by search string |   
| pageNo | Int? | The page number to navigate through the given set of results |   
| pageSize | Int? | Number of items to retrieve in each page. Default is 10. |  



This API gets meta associated to products.

*Success Response*



Product Meta. See example below for details


Schema: `ProductListingResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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


Schema: `InventoryRequest`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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
| itemId | Double? | Item of the company associated to product that is to be viewed. |   
| size | String? | Size in which inventory is to be added. |  



This API allows add Inventory for particular size and store.

*Success Response*



Returns a success response


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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


Schema: `SuccessResponse`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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



List of bulk Inventory upload jobs. See `BulkRequestGetSchema` for details


Schema: `BulkRequestGet`





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request.


Schema: `ErrorResponse`






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





Bad request.


Schema: `ErrorResponse`






---


#### getHsnCode
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
| companyId | String? | company id |   
| uid | Int? | uid |  



Fetch Hsn Code.

*Success Response*



See example below details


Schema: `HsnCode`





Bad request.


Schema: `ErrorResponse`






---


#### updateHsnCode
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
| companyId | String? | company id |   
| uid | Int? | uid |  



Update Hsn Code.

*Success Response*



See example below for details


Schema: `HsnCode`





Bad request.


Schema: `ErrorResponse`






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





Bad request.


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---



---
---


## CompanyProfile


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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






---


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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Bad request. See the error object in the response body for specific reason


Schema: `ErrorResponse`






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





Failed


Schema: `FailedResponse`






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





Failed


Schema: `FailedResponse`






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





Failed


Schema: `FailedResponse`






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





Failed


Schema: `FailedResponse`






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





Failed


Schema: `FailedResponse`






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





Failed


Schema: `FailedResponse`






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





Failed


Schema: `FailedResponse`






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





Failed


Schema: `FailedResponse`






---


#### appBrowse
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
| namespace | String? | bucket name |   
| companyId | Int? | company_id |   
| applicationId | Int? | application_id |   
| pageNo | Int? | page no |  



Browse Files

*Success Response*



Success


Schema: `BrowseResponse`





Failed


Schema: `FailedResponse`






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





Error


Schema: `ErrorRes`






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





Error


Schema: `ErrorRes`






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





Error


Schema: `ErrorRes`






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





Error


Schema: `ErrorRes`






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
| companyId | String? | Current company id |   
| applicationId | String? | Current application id |   
| platformType | String? | Current platform name |  



Get previous versions

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





Not found


Schema: `NotFound`






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





Invalid/Missing params


Schema: `InvalidPayloadRequest`






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





Invalid/Missing params


Schema: `InvalidPayloadRequest`






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





Invalid request or Missing params


Schema: `InvalidPayloadRequest`





Invalid/Missing params


Schema: `NotFound`






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





Invalid/Missing params


Schema: `NotFound`






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
configuration.getIntegrationLevelConfig(companyId: companyId, id: id, level: level).safeAwait{ response,error->
    
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





Not found


Schema: `NotFound`






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





Invalid params or Not configured inventory


Schema: `InvalidPayloadRequest`





Not found


Schema: `NotFound`






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



Coupon Created successfully


Schema: `SuccessMessage`





Invalid coupon data or existing coupon code


Schema: `OperationErrorResponse`






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





Coupon not found for passed `id`


Schema: `OperationErrorResponse`






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





Coupon not found for `id` from path params


Schema: `OperationErrorResponse`






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





Coupon not found for `id` from path params


Schema: `OperationErrorResponse`






---



---
---
