# FDK Application Front API Documentaion


* [Lead](#Lead) - Handles communication between Administrator <-> Staff and Staff <-> Users 
* [Theme](#Theme) - Responsible for themes 
* [User](#User) - Authentication Service 
* [Payment](#Payment) - Collect payment through many payment gateway i.e Stripe, Razorpay, Juspay etc.into Fynd or Self account 
* [Order](#Order) - Handles Platform websites OMS 
* [CompanyProfile](#CompanyProfile) - Company Profile API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features.  
* [Assets](#Assets) - File Storage 
* [Share](#Share) - Short link and QR Code 
* [Inventory](#Inventory) -  
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
 
* [CompanyProfile](#CompanyProfile)
  * [CompanyProfile#updateCompany](#companyprofileupdatecompany)
  * [CompanyProfile#cbsOnboardGet](#companyprofilecbsonboardget)
  * [CompanyProfile#getCompanyMetrics](#companyprofilegetcompanymetrics)
  * [CompanyProfile#editBrand](#companyprofileeditbrand)
  * [CompanyProfile#getBrand](#companyprofilegetbrand)
  * [CompanyProfile#createBrand](#companyprofilecreatebrand)
  * [CompanyProfile#createBrand](#companyprofilecreatebrand)
  * [CompanyProfile#getBrands](#companyprofilegetbrands)
  * [CompanyProfile#createLocation](#companyprofilecreatelocation)
  * [CompanyProfile#getLocations](#companyprofilegetlocations)
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
 
* [Inventory](#Inventory)
  * [Inventory#getJobsByCompany](#inventorygetjobsbycompany)
  * [Inventory#updateJob](#inventoryupdatejob)
  * [Inventory#createJob](#inventorycreatejob)
  * [Inventory#getJobByCompanyAndIntegration](#inventorygetjobbycompanyandintegration)
  * [Inventory#getJobConfigDefaults](#inventorygetjobconfigdefaults)
  * [Inventory#getJobByCode](#inventorygetjobbycode)
  * [Inventory#getJobCodesByCompanyAndIntegration](#inventorygetjobcodesbycompanyandintegration)
 
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
  * [Marketplaces#updateChannelInventoryConfig](#marketplacesupdatechannelinventoryconfig)
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

```javascript
// Promise
const promise = inventory.getJobsByCompany(company_id, page_no, page_size, );

// Async/Await
const data = await inventory.getJobsByCompany(company_id, page_no, page_size, );

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

```javascript
// Promise
const promise = inventory.updateJob(company_id, x-user-data, );

// Async/Await
const data = await inventory.updateJob(company_id, x-user-data, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| x-user-data | string |  | 


REST Endpoint that updates a job config


---


#### Inventory#createJob
Creates A New Job Config

```javascript
// Promise
const promise = inventory.createJob(company_id, x-user-data, );

// Async/Await
const data = await inventory.createJob(company_id, x-user-data, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| x-user-data | string |  | 


REST Endpoint that creates a new job config


---


#### Inventory#getJobByCompanyAndIntegration
Get Job Configs By Company And Integration

```javascript
// Promise
const promise = inventory.getJobByCompanyAndIntegration(company_id, integration_id, page_no, page_size, );

// Async/Await
const data = await inventory.getJobByCompanyAndIntegration(company_id, integration_id, page_no, page_size, );

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

```javascript
// Promise
const promise = inventory.getJobConfigDefaults(company_id, );

// Async/Await
const data = await inventory.getJobConfigDefaults(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 


REST Endpoint that returns default fields job configs by company And integration


---


#### Inventory#getJobByCode
Get Job Config By Code

```javascript
// Promise
const promise = inventory.getJobByCode(company_id, code, );

// Async/Await
const data = await inventory.getJobByCode(company_id, code, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | integer | Company Id | 
| code | string | Job Code | 


REST Endpoint that returns job config by code


---


#### Inventory#getJobCodesByCompanyAndIntegration
Get Job Codes By Company And Integration

```javascript
// Promise
const promise = inventory.getJobCodesByCompanyAndIntegration(company_id, integration_id, page_no, page_size, );

// Async/Await
const data = await inventory.getJobCodesByCompanyAndIntegration(company_id, integration_id, page_no, page_size, );

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


#### Marketplaces#updateChannelInventoryConfig
Update inventory sync configuration of marketplace channel for a seller

```javascript
// Promise
const promise = marketplaces.updateChannelInventoryConfig(company_id, channel, validate_cred, );

// Async/Await
const data = await marketplaces.updateChannelInventoryConfig(company_id, channel, validate_cred, );

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
