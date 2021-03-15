# FDK Application Front API Documentaion


* [Lead](#Lead) - Handles communication between Administrator <-> Staff and Staff <-> Users 
* [Theme](#Theme) - Responsible for themes 
* [User](#User) - Authentication Service 
* [Communication](#Communication) - Manages email, sms, push notifications sent to users 
* [Payment](#Payment) - Collect payment through many payment gateway i.e Stripe, Razorpay, Juspay etc.into Fynd or Self account 
* [CompanyProfile](#CompanyProfile) - Catalog API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features.  
* [Inventory](#Inventory) -  

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
  * [Communication#upsertPushtoken](#communicationupsertpushtoken)
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
 
* [CompanyProfile](#CompanyProfile)
  * [CompanyProfile#cbsOnboardEdit](#companyprofilecbsonboardedit)
  * [CompanyProfile#cbsOnboardGet](#companyprofilecbsonboardget)
  * [CompanyProfile#getCompanyMetrics](#companyprofilegetcompanymetrics)
  * [CompanyProfile#getBrand](#companyprofilegetbrand)
  * [CompanyProfile#editBrand](#companyprofileeditbrand)
  * [CompanyProfile#createBrand](#companyprofilecreatebrand)
  * [CompanyProfile#createCompanyBrand](#companyprofilecreatecompanybrand)
  * [CompanyProfile#getCompanyBrands](#companyprofilegetcompanybrands)
  * [CompanyProfile#createLocation](#companyprofilecreatelocation)
  * [CompanyProfile#locationList](#companyprofilelocationlist)
  * [CompanyProfile#getSingleLocation](#companyprofilegetsinglelocation)
  * [CompanyProfile#editLocation](#companyprofileeditlocation)
 
* [Inventory](#Inventory)
  * [Inventory#getJobsByCompany](#inventorygetjobsbycompany)
  * [Inventory#updateJob](#inventoryupdatejob)
  * [Inventory#createJob](#inventorycreatejob)
  * [Inventory#getJobByCompanyAndIntegration](#inventorygetjobbycompanyandintegration)
  * [Inventory#getJobConfigDefaults](#inventorygetjobconfigdefaults)
  * [Inventory#getJobByCode](#inventorygetjobbycode)
  * [Inventory#getJobCodesByCompanyAndIntegration](#inventorygetjobcodesbycompanyandintegration)
 

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
const promise = lead.getTickets(company_id, items, filters, page_no, page_size, );

// Async/Await
const data = await lead.getTickets(company_id, items, filters, page_no, page_size, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID for which the data will be returned | 
| items | boolean | Decides that the reponse will contain the list of tickets | 
| filters | boolean | Decides that the reponse will contain the ticket filters | 
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
const promise = lead.getTickets(company_id, application_id, items, filters, );

// Async/Await
const data = await lead.getTickets(company_id, application_id, items, filters, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for which the data will be returned | 
| items | boolean | Decides that the reponse will contain the list of tickets | 
| filters | boolean | Decides that the reponse will contain the ticket filters | 


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
const promise = lead.closeVideoRoom(company_id, application_id, );

// Async/Await
const data = await lead.closeVideoRoom(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID of the application | 
| application_id | string | Application ID for video room | 


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
const promise = user.searchUsers(company_id, application_id, query, );

// Async/Await
const data = await user.searchUsers(company_id, application_id, query, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company ID | 
| application_id | string | Application ID | 
| query | string | The search query. This can be a partial or complete name of a either a product, brand or category | 


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


#### Communication#upsertPushtoken
Upsert push token of a user

```javascript
// Promise
const promise = communication.upsertPushtoken(company_id, application_id, );

// Async/Await
const data = await communication.upsertPushtoken(company_id, application_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Company id | 
| application_id | string | Application id | 


Upsert push token of a user


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


## CompanyProfile

```javascript
const { Configuration, CompanyProfile } = require('fdk-client-nodejs/platform')
const conf = new Configuration({
    OAuth2Token: "5ljdffg191e810c19729de860ea"
});
const companyprofile = new CompanyProfile(conf);

```


#### CompanyProfile#cbsOnboardEdit
Edit company profile

```javascript
// Promise
const promise = companyprofile.cbsOnboardEdit(company_id, );

// Async/Await
const data = await companyprofile.cbsOnboardEdit(company_id, );

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


#### CompanyProfile#getBrand
Get a single brand.

```javascript
// Promise
const promise = companyprofile.getBrand(brand_id, );

// Async/Await
const data = await companyprofile.getBrand(brand_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| brand_id | string | Id of the brand to be viewed. | 


This API helps to get data associated to a particular brand.


---


#### CompanyProfile#editBrand
Edit a brand.

```javascript
// Promise
const promise = companyprofile.editBrand(brand_id, );

// Async/Await
const data = await companyprofile.editBrand(brand_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| brand_id | string | Id of the brand to be viewed. | 


This API allows to edit meta of a brand.


---


#### CompanyProfile#createBrand
Create a Brand.

```javascript
// Promise
const promise = companyprofile.createBrand();

// Async/Await
const data = await companyprofile.createBrand();

```




This API allows to create a brand associated to a company.


---


#### CompanyProfile#createCompanyBrand
Create a company brand mapping.

```javascript
// Promise
const promise = companyprofile.createCompanyBrand(company_id, );

// Async/Await
const data = await companyprofile.createCompanyBrand(company_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the brand is to be mapped. | 


This API allows to create a company brand mapping, for a already existing brand in the system.


---


#### CompanyProfile#getCompanyBrands
Get brands associated to a company

```javascript
// Promise
const promise = companyprofile.getCompanyBrands(company_id, );

// Async/Await
const data = await companyprofile.getCompanyBrands(company_id, );

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


#### CompanyProfile#locationList
Get list of locations

```javascript
// Promise
const promise = companyprofile.locationList(company_id, store_type, q, stage, page_no, page_size, );

// Async/Await
const data = await companyprofile.locationList(company_id, store_type, q, stage, page_no, page_size, );

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


#### CompanyProfile#getSingleLocation
Get a single location.

```javascript
// Promise
const promise = companyprofile.getSingleLocation(company_id, location_id, );

// Async/Await
const data = await companyprofile.getSingleLocation(company_id, location_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the location lies. | 
| location_id | string | Id of the location which you want to view. | 


This API helps to get data associated to a particular location.


---


#### CompanyProfile#editLocation
Edit a location asscoiated to a company.

```javascript
// Promise
const promise = companyprofile.editLocation(company_id, location_id, );

// Async/Await
const data = await companyprofile.editLocation(company_id, location_id, );

```



| Argument  |  Type  | Description |
| --------- | ----  | --- |
| company_id | string | Id of the company inside which the location is to be created. | 
| location_id | string | Id of the location which you want to edit. | 


This API allows to edit a location associated to a company.


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
