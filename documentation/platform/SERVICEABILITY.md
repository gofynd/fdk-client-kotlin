



##### [Back to Platform docs](./README.md)

## Serviceability Methods
Logistics Configuration API's allows you to configure zone, application logistics and many more useful features. 

Default
* [getZones](#getzones)
* [createZone](#createzone)
* [updateZoneById](#updatezonebyid)
* [getZoneById](#getzonebyid)
* [getAllStores](#getallstores)
* [getOptimalLocations](#getoptimallocations)
* [updatePincodeMopView](#updatepincodemopview)
* [updatePincodeBulkView](#updatepincodebulkview)
* [updatePincodeCoDListing](#updatepincodecodlisting)
* [updatePincodeAuditHistory](#updatepincodeaudithistory)
* [createCourierPartnerAccount](#createcourierpartneraccount)
* [getCourierPartnerAccounts](#getcourierpartneraccounts)
* [updateCourierPartnerAccount](#updatecourierpartneraccount)
* [getCourierPartnerAccount](#getcourierpartneraccount)
* [updateCourierRule](#updatecourierrule)
* [getCourierPartnerRule](#getcourierpartnerrule)
* [createCourierPartnerRule](#createcourierpartnerrule)
* [getCourierPartnerRules](#getcourierpartnerrules)
* [updateCompanyConfiguration](#updatecompanyconfiguration)
* [getCompanyConfiguration](#getcompanyconfiguration)
* [updateApplicationConfiguration](#updateapplicationconfiguration)
* [getApplicationConfiguration](#getapplicationconfiguration)
* [bulkTat](#bulktat)
* [getBulkTat](#getbulktat)
* [patchApplicationServiceabilitySelfShipment](#patchapplicationserviceabilityselfshipment)
* [getApplicationServiceabilitySelfShipment](#getapplicationserviceabilityselfshipment)
* [getApplicationConfig](#getapplicationconfig)
* [insertApplicationConfig](#insertapplicationconfig)
* [updateStoreRulesConfig](#updatestorerulesconfig)
* [getStoreRules](#getstorerules)
* [createStoreRules](#createstorerules)
* [getStoreRule](#getstorerule)
* [updateStoreRules](#updatestorerules)
* [bulkServiceability](#bulkserviceability)
* [getBulkServiceability](#getbulkserviceability)
* [getServiceability](#getserviceability)
* [updateServiceability](#updateserviceability)
* [createPackageMaterial](#createpackagematerial)
* [getPackageMaterialList](#getpackagemateriallist)
* [createPackageMaterialRule](#createpackagematerialrule)
* [getPackageMaterialRules](#getpackagematerialrules)
* [updatePackageMaterialRule](#updatepackagematerialrule)
* [getPackageMaterialRule](#getpackagematerialrule)
* [updatePackageMaterials](#updatepackagematerials)
* [getPackageMaterials](#getpackagematerials)
* [updateCourierPartnerRulePriority](#updatecourierpartnerrulepriority)




## Methods with example and description



### getZones
Shows zones defined at the company level




```kotlin
platformClient.serviceability.getZones(pageNo: pageNo, pageSize: pageSize, isActive: isActive, channelId: channelId, q: q, country: country, state: state, city: city, pincode: pincode, sector: sector).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |   
| isActive | Boolean? | no | Status of Zone (either active or inactive) |   
| channelId | String? | no | Zones filtered by an application |   
| q | String? | no | search with name as a free text |   
| country | String? | no | ISO2 code of the country |   
| state | String? | no | State name |   
| city | String? | no | City name |   
| pincode | String? | no | Pincode value to search zones |   
| sector | String? | no | Sector value to search zones |  



Return the list of zones that are defined at the company level.

*Returned Response:*




[ListViewResponse](#ListViewResponse)

Zone List of application in descending order of their last modified date.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Zone Listing with q=zone</i></summary>

```json
{
  "value": {
    "items": [
      {
        "name": "company2 zone",
        "slug": "company2-zone",
        "company_id": 2,
        "is_active": true,
        "channels": [
          {
            "channel_id": "64c22ef872985245a6334afa",
            "channel_type": "application"
          }
        ],
        "zone_id": "64c3a0926ea670363c8e2e3d",
        "stores_count": 2,
        "regions_count": 4242,
        "product": {
          "count": 0,
          "type": "all"
        }
      }
    ],
    "page": {
      "type": "number",
      "size": 1,
      "current": 1,
      "has_next": false,
      "item_total": 1
    }
  }
}
```
</details>

</details>









---


### createZone
Creates a new Zone




```kotlin
platformClient.serviceability.createZone(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateZoneData](#CreateZoneData) | yes | Request body |


Creates a new zone with the specified mapping. A zone enables serviceability based on given regions. By creating a zone and including specific regions, you can ensure that the stores associated with the zone are serviceable for those added regions. This functionality is particularly useful when you need to ensure serviceability for multiple regions by grouping them into a single zone.

*Returned Response:*




[ZoneResponse](#ZoneResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "status_code": 200,
  "zone_id": "64809f27f2b8f575d5cb9c56"
}
```
</details>









---


### updateZoneById
Update details of a Zone




```kotlin
platformClient.serviceability.updateZoneById(zoneId: zoneId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| zoneId | String | yes | A `zone_id` is a unique identifier for a particular zone. |  
| body | [UpdateZoneData](#UpdateZoneData) | yes | Request body |


Updates the region, application, store mapping and other details in the Zone.

*Returned Response:*




[ZoneSuccessResponse](#ZoneSuccessResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getZoneById
Get details of the Zone




```kotlin
platformClient.serviceability.getZoneById(zoneId: zoneId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| zoneId | String | yes | A `zone_id` is a unique identifier for a particular zone. |  



Returns the region, application, store mapping and other details in the Zone.

*Returned Response:*




[GetZoneByIdSchema](#GetZoneByIdSchema)

Get details of the Zone




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Gujarat Zone</i></summary>

```json
{
  "value": {
    "name": "Test Zone",
    "slug": "test-zone",
    "is_active": false,
    "channels": [
      {
        "channel_id": "64aed475db2cfb5b8a9f623d",
        "channel_type": "application"
      },
      {
        "channel_id": "64ba6650932a416fb67557fa",
        "channel_type": "application"
      }
    ],
    "product": {
      "type": "all",
      "tags": []
    },
    "store_ids": [
      2,
      1462,
      3470,
      3471,
      3475,
      3742,
      3748,
      3751,
      3752,
      3753
    ],
    "region_type": "non-pincode",
    "mapping": [
      {
        "country": "64aec5a93a079bd328537835",
        "regions": [
          "64aec5a93a079bd328537838"
        ]
      }
    ],
    "zone_id": "64d22858f8aafe61d79f07ea",
    "stores_count": 10,
    "display_name_mapping": {
      "64aec5a93a079bd328537835": "India",
      "64aec5a93a079bd328537838": "GUJARAT"
    }
  }
}
```
</details>

</details>









---


### getAllStores
GET stores data




```kotlin
platformClient.serviceability.getAllStores().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






This API returns stores data.

*Returned Response:*




[GetStoresViewResponse](#GetStoresViewResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOptimalLocations
Get serviceable store of the item




```kotlin
platformClient.serviceability.getOptimalLocations(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ReAssignStoreRequest](#ReAssignStoreRequest) | yes | Request body |


This API returns serviceable store of the item.

*Returned Response:*




[ReAssignStoreResponse](#ReAssignStoreResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updatePincodeMopView
PincodeView update of MOP.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.updatePincodeMopView(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [PincodeMopData](#PincodeMopData) | yes | Request body |


This API updates Pincode method of payment.

*Returned Response:*




[PincodeMOPresponse](#PincodeMOPresponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updatePincodeBulkView
Bulk Update of pincode in the application.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.updatePincodeBulkView(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [PincodeMopBulkData](#PincodeMopBulkData) | yes | Request body |


This API constructs bulk write operations to update the MOP data for each pincode in the payload.

*Returned Response:*




[PincodeBulkViewResponse](#PincodeBulkViewResponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "batch_id": "string",
  "s3_url": "string"
}
```
</details>









---


### updatePincodeCoDListing
Pincode count view of application.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.updatePincodeCoDListing(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [PincodeCodStatusListingRequest](#PincodeCodStatusListingRequest) | yes | Request body |


This API returns count of active pincode.

*Returned Response:*




[PincodeCodStatusListingResponse](#PincodeCodStatusListingResponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updatePincodeAuditHistory
Auditlog configuration of application.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.updatePincodeAuditHistory(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [PincodeMopUpdateAuditHistoryRequest](#PincodeMopUpdateAuditHistoryRequest) | yes | Request body |


This API returns Audit logs of Pincode.

*Returned Response:*




[PincodeMopUpdateAuditHistoryResponseData](#PincodeMopUpdateAuditHistoryResponseData)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createCourierPartnerAccount
Creation of Courier Account




```kotlin
platformClient.serviceability.createCourierPartnerAccount(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CourierAccount](#CourierAccount) | yes | Request body |


This API Creates a new Courier Account

*Returned Response:*




[CourierAccount](#CourierAccount)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCourierPartnerAccounts
Getting Courier Account list of a company.




```kotlin
platformClient.serviceability.getCourierPartnerAccounts(pageNo: pageNo, pageSize: pageSize, stage: stage, paymentMode: paymentMode, transportType: transportType).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |   
| stage | String? | no | stage of the account. enabled/disabled |   
| paymentMode | String? | no | Filters dp accounts based on payment mode |   
| transportType | String? | no | Filters dp accounts based on transport_type |  



This API returns Courier Account of a company.

*Returned Response:*




[CompanyCourierPartnerAccountListResponse](#CompanyCourierPartnerAccountListResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateCourierPartnerAccount
Update Courier Account in database.




```kotlin
platformClient.serviceability.updateCourierPartnerAccount(accountId: accountId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| accountId | String | yes | Unique ID of courier account |  
| body | [CourierAccount](#CourierAccount) | yes | Request body |


Updates Courier Account

*Returned Response:*




[CourierAccountResponse](#CourierAccountResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCourierPartnerAccount
Getting Courier Account of a company from database.




```kotlin
platformClient.serviceability.getCourierPartnerAccount(accountId: accountId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| accountId | String | yes | Unique ID of courier account |  



This API returns response DpAccount of a company from mongo database.

*Returned Response:*




[CourierAccountResponse](#CourierAccountResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateCourierRule
Updating of Courier Rule.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.updateCourierRule(ruleId: ruleId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| ruleId | String | yes | A `rule_id` is a unique identifier for a particular Dp. |  
| body | [CourierPartnerRule](#CourierPartnerRule) | yes | Request body |


This API updates and returns Courier Rule.

*Returned Response:*




[CourierPartnerRule](#CourierPartnerRule)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCourierPartnerRule
Fetch of Courier Rule.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.getCourierPartnerRule(ruleId: ruleId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| ruleId | String | yes | A `rule_id` is a unique identifier for a rule. |  



This API returns Courier Rule.

*Returned Response:*




[CourierPartnerRule](#CourierPartnerRule)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createCourierPartnerRule
Create Courier Rules.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.createCourierPartnerRule(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CourierPartnerRule](#CourierPartnerRule) | yes | Request body |


Creates Courier Rules with rule configuration and dp priority

*Returned Response:*




[CourierPartnerRule](#CourierPartnerRule)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCourierPartnerRules
Fetch Courier Rules List




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.getCourierPartnerRules(pageNo: pageNo, pageSize: pageSize, status: status).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |   
| status | String? | no | Filter rules based on rule status |  



This API returns Courier Rules List

*Returned Response:*




[CourierPartnerRulesListResponse](#CourierPartnerRulesListResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateCompanyConfiguration
Apply Courier Rule to company.




```kotlin
platformClient.serviceability.updateCompanyConfiguration(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CompanyConfig](#CompanyConfig) | yes | Request body |


Apply Courier Rule to company with rules priority

*Returned Response:*




[CompanyConfig](#CompanyConfig)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCompanyConfiguration
Get All Courier Rules applied to company.




```kotlin
platformClient.serviceability.getCompanyConfiguration().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






This API returns all Courier Rules applied for company.

*Returned Response:*




[CompanyConfig](#CompanyConfig)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateApplicationConfiguration
Apply configuration to an application




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.updateApplicationConfiguration(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ApplicationConfig](#ApplicationConfig) | yes | Request body |


Apply configuration to application to set DP rules and Zone configuration

*Returned Response:*




[ApplicationConfig](#ApplicationConfig)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getApplicationConfiguration
Get All Courier Rules applied to application




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.getApplicationConfiguration().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






This API returns all the Courier Rules applied to an application

*Returned Response:*




[ApplicationConfig](#ApplicationConfig)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### bulkTat
Region TAT Import or Export




```kotlin
platformClient.serviceability.bulkTat(extensionId: extensionId, schemeId: schemeId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |  
| body | [BulkRegionJobSerializer](#BulkRegionJobSerializer) | yes | Request body |


Region TAT Import or Export

*Returned Response:*




[BulkRegionResponseItemData](#BulkRegionResponseItemData)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getBulkTat
Get region tat bulk history




```kotlin
platformClient.serviceability.getBulkTat(extensionId: extensionId, schemeId: schemeId, pageNo: pageNo, pageSize: pageSize, batchId: batchId, action: action, status: status, country: country, region: region, startDate: startDate, endDate: endDate).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |   
| pageNo | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |   
| batchId | String? | no | Unique identifier of bulk job |   
| action | String? | no | import or export bulk type |   
| status | String? | no | Status of the bulk actions |   
| country | String? | no | Country for which bulk job is initiated |   
| region | String? | no | Region for which bulk job is initiated |   
| startDate | String? | no | Fetch job history after a particule date |   
| endDate | String? | no | Fetch job history before a particule date |  



Get region tat bulk history

*Returned Response:*




[BulkRegionResponse](#BulkRegionResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### patchApplicationServiceabilitySelfShipment
Self-ship configuration of application.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.patchApplicationServiceabilitySelfShipment(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [SelfShipResponse](#SelfShipResponse) | yes | Request body |


This API updates Self-ship configuration of the application.

*Returned Response:*




[ApplicationSelfShipConfigResponse](#ApplicationSelfShipConfigResponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": {
    "is_active": true,
    "tat": 3
  },
  "success": true,
  "error": {
    "type": "",
    "value": "",
    "message": ""
  }
}
```
</details>









---


### getApplicationServiceabilitySelfShipment
Self-ship configuration of application.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.getApplicationServiceabilitySelfShipment().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






This API returns Self-ship configuration of the application.

*Returned Response:*




[ApplicationSelfShipConfigResponse](#ApplicationSelfShipConfigResponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": {
    "is_active": true,
    "tat": 3
  },
  "success": true,
  "error": {
    "type": "",
    "value": "",
    "message": ""
  }
}
```
</details>









---


### getApplicationConfig
Get Application Configuration




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.getApplicationConfig().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






Get Application Configuration

*Returned Response:*




[StoreRuleConfigData](#StoreRuleConfigData)

Successful Response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### insertApplicationConfig
Insert Application Configuration




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.insertApplicationConfig(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [StoreRuleConfigData](#StoreRuleConfigData) | yes | Request body |


Insert Application Configuration

*Returned Response:*




[StoreRuleConfigData](#StoreRuleConfigData)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateStoreRulesConfig
Update Store Rule Configuration




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.updateStoreRulesConfig(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [StoreRuleConfigData](#StoreRuleConfigData) | yes | Request body |


Update Store Rule Configuration

*Returned Response:*




[StoreRuleConfigData](#StoreRuleConfigData)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getStoreRules
Get Multiple Store Rules




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.getStoreRules(pageNo: pageNo, pageSize: pageSize, status: status).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Int? | no |  |   
| pageSize | Int? | no |  |   
| status | String? | no |  |  



Get Multiple Store Rules

*Returned Response:*




[GetStoreRulesApiResponse](#GetStoreRulesApiResponse)

Successful Response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createStoreRules
Create Store Rule




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.createStoreRules(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateStoreRuleRequestSchema](#CreateStoreRuleRequestSchema) | yes | Request body |


Create Store Rule

*Returned Response:*




[StoreRuleResponseSchema](#StoreRuleResponseSchema)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getStoreRule
Get Single Store Rule




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.getStoreRule(ruleUid: ruleUid).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| ruleUid | String | yes | A `rule_uid` is a unique identifier for a particular rule object. |  



Get Single Store Rule

*Returned Response:*




[StoreRuleDataSchema](#StoreRuleDataSchema)

Successful Response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateStoreRules
Update Store Rule




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.updateStoreRules(ruleUid: ruleUid, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| ruleUid | String | yes | A `rule_uid` is a unique identifier for a particular rule object. |  
| body | [CreateStoreRuleRequestSchema](#CreateStoreRuleRequestSchema) | yes | Request body |


Update Store Rule

*Returned Response:*




[StoreRuleUpdateResponseSchema](#StoreRuleUpdateResponseSchema)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### bulkServiceability
Serviceability Import or Export




```kotlin
platformClient.serviceability.bulkServiceability(extensionId: extensionId, schemeId: schemeId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |  
| body | [BulkRegionJobSerializer](#BulkRegionJobSerializer) | yes | Request body |


Serviceability Import or Export

*Returned Response:*




[BulkRegionResponseItemData](#BulkRegionResponseItemData)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getBulkServiceability
Get Region Serviceability Bulk History




```kotlin
platformClient.serviceability.getBulkServiceability(extensionId: extensionId, schemeId: schemeId, pageNo: pageNo, pageSize: pageSize, batchId: batchId, action: action, status: status, country: country, region: region, startDate: startDate, endDate: endDate).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |   
| pageNo | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |   
| batchId | String? | no | Unique identifier of bulk job |   
| action | String? | no | import or export bulk type |   
| status | String? | no | Status of the bulk actions |   
| country | String? | no | Country for which bulk job is initiated |   
| region | String? | no | Region for which bulk job is initiated |   
| startDate | String? | no | Fetch job history after a particule date |   
| endDate | String? | no | Fetch job history before a particule date |  



Get Region Serviceability Bulk History

*Returned Response:*




[BulkRegionResponse](#BulkRegionResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getServiceability
Get Serviceability of a region




```kotlin
platformClient.serviceability.getServiceability(extensionId: extensionId, schemeId: schemeId, regionId: regionId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |   
| regionId | String | yes | Unique identifier of a region |  



Get Serviceability of a region

*Returned Response:*




[ServiceabilityModel](#ServiceabilityModel)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateServiceability
Serviceability Update for a region




```kotlin
platformClient.serviceability.updateServiceability(extensionId: extensionId, schemeId: schemeId, regionId: regionId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |   
| regionId | String | yes | Unique identifier of a region |  
| body | [ServiceabilityModel](#ServiceabilityModel) | yes | Request body |


Serviceability Update for a region

*Returned Response:*




[ServiceabilityModel](#ServiceabilityModel)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createPackageMaterial
Upsert of PackageMaterial in database.




```kotlin
platformClient.serviceability.createPackageMaterial(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [PackageMaterial](#PackageMaterial) | yes | Request body |


This API returns response of upsert of PackageMaterial in mongo database.

*Returned Response:*




[PackageMaterialResponse](#PackageMaterialResponse)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageMaterial</i></summary>

```json
{
  "value": {
    "id": "64b8526e5ca47d41582b9fa1",
    "name": "Package1",
    "item_id": 1234,
    "company_id": 1,
    "length": 1,
    "height": 1,
    "width": 1,
    "weight": 1,
    "error_rate": 0,
    "store_ids": [
      1,
      9,
      5
    ],
    "rules": [
      {
        "rule_id": "64b4337a0c607fbfbcd0156b",
        "quantity": {
          "min": 1,
          "max": 2
        },
        "weight": 100
      }
    ],
    "channels": [
      {
        "id": "64b4337a0c607fbfbcd0190b",
        "type": "application"
      }
    ],
    "media": [
      "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/sandeepmaale/products/pictures/bundle/free/original/LOc5XW0cc-Logo.png"
    ],
    "package_type": "box",
    "size": "small",
    "status": "active",
    "track_inventory": false,
    "max_weight": 100,
    "package_vol_weight": 100,
    "auto_calculate": true
  }
}
```
</details>

</details>









---


### getPackageMaterialList
Fetching of PackageMaterials from database.




```kotlin
platformClient.serviceability.getPackageMaterialList(pageNo: pageNo, pageSize: pageSize, q: q, size: size, packageType: packageType).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |   
| q | String? | no | perform regex search on items matching name for given value |   
| size | String? | no | filters items based on given size |   
| packageType | String? | no | filters items based on given package_type |  



This API returns response of PackageMaterials from mongo database.

*Returned Response:*




[PackageMaterialList](#PackageMaterialList)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageMaterialList</i></summary>

```json
{
  "value": {
    "items": [
      {
        "id": "64b8526e5ca47d41582b9fa1",
        "name": "Package1",
        "item_id": 1234,
        "company_id": 1,
        "length": 1,
        "height": 1,
        "width": 1,
        "weight": 1,
        "error_rate": 0,
        "store_ids": [
          1,
          9,
          5
        ],
        "rules": [
          {
            "rule_id": "64b4337a0c607fbfbcd0156b",
            "quantity": {
              "min": 1,
              "max": 2
            },
            "weight": 100
          }
        ],
        "channels": [
          {
            "id": "64b4337a0c607fbfbcd0190b",
            "type": "application"
          }
        ],
        "media": [
          "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/sandeepmaale/products/pictures/bundle/free/original/LOc5XW0cc-Logo.png"
        ],
        "package_type": "box",
        "size": "small",
        "status": "active",
        "track_inventory": true,
        "max_weight": 100,
        "package_vol_weight": 100,
        "auto_calculate": true
      }
    ],
    "page": {
      "type": "number",
      "size": 1,
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 1
    }
  }
}
```
</details>

</details>









---


### createPackageMaterialRule
Upsert of Package Material Rule in database.




```kotlin
platformClient.serviceability.createPackageMaterialRule(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [PackageRule](#PackageRule) | yes | Request body |


This API returns response of upsert of Package Material Rule in mongo database.

*Returned Response:*




[PackageRuleResponse](#PackageRuleResponse)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageRule</i></summary>

```json
{
  "value": {
    "id": "64b4337a0c607fbfbcd0156b",
    "company_id": 1,
    "name": "Rule For Dev Contract",
    "category_id": {
      "includes": [
        1,
        2
      ]
    },
    "product_tag": {
      "includes": [
        "abc",
        "xyz"
      ]
    },
    "product_id": {
      "includes": [
        1,
        2
      ]
    },
    "type": "package",
    "is_active": true
  }
}
```
</details>

</details>









---


### getPackageMaterialRules
Fetching of Package Material Rules from database.




```kotlin
platformClient.serviceability.getPackageMaterialRules(pageNo: pageNo, pageSize: pageSize, isActive: isActive).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |   
| isActive | String? | no | filters items based on given is_active |  



This API returns response of Package Materials Rules from mongo database.

*Returned Response:*




[PackageMaterialRuleList](#PackageMaterialRuleList)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageMaterialRuleList</i></summary>

```json
{
  "value": {
    "items": [
      {
        "id": "64b4337a0c607fbfbcd0156b",
        "company_id": 1,
        "name": "Rule For Dev Contract",
        "category_id": {
          "includes": [
            1,
            2
          ]
        },
        "product_tag": {
          "includes": [
            "abc",
            "xyz"
          ]
        },
        "product_id": {
          "includes": [
            1,
            2
          ]
        },
        "type": "package",
        "is_active": true
      }
    ],
    "page": {
      "type": "number",
      "size": 1,
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 1
    }
  }
}
```
</details>

</details>









---


### updatePackageMaterialRule
Fetching of Package Material Rules into database.




```kotlin
platformClient.serviceability.updatePackageMaterialRule(ruleId: ruleId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| ruleId | String | yes | A `package_material_rule_id` is a unique identifier for a Package Material Rule |  
| body | [PackageRule](#PackageRule) | yes | Request body |


This API updates Package Material Rules into mongo database.

*Returned Response:*




[PackageRuleResponse](#PackageRuleResponse)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageRule</i></summary>

```json
{
  "value": {
    "id": "64b4337a0c607fbfbcd0156b",
    "company_id": 1,
    "name": "Rule For Dev Contract",
    "category_id": {
      "includes": [
        1,
        2
      ]
    },
    "product_tag": {
      "includes": [
        "abc",
        "xyz"
      ]
    },
    "product_id": {
      "includes": [
        1,
        2
      ]
    },
    "type": "package",
    "is_active": true
  }
}
```
</details>

</details>









---


### getPackageMaterialRule
Fetching of Package Material from database.




```kotlin
platformClient.serviceability.getPackageMaterialRule(ruleId: ruleId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| ruleId | String | yes | A `package_material_rule_id` is a unique identifier for a Package Material Rule |  



This API returns response of Package Material from mongo database.

*Returned Response:*




[PackageRuleResponse](#PackageRuleResponse)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageRule</i></summary>

```json
{
  "value": {
    "id": "64b4337a0c607fbfbcd0156b",
    "company_id": 1,
    "name": "Rule For Dev Contract",
    "category_id": {
      "includes": [
        1,
        2
      ]
    },
    "product_tag": {
      "includes": [
        "abc",
        "xyz"
      ]
    },
    "product_id": {
      "includes": [
        1,
        2
      ]
    },
    "type": "package",
    "is_active": true
  }
}
```
</details>

</details>









---


### updatePackageMaterials
Update Package Material to database.




```kotlin
platformClient.serviceability.updatePackageMaterials(packageMaterialId: packageMaterialId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| packageMaterialId | String | yes | A `package_material_id` is a unique identifier for a Package Material |  
| body | [PackageMaterial](#PackageMaterial) | yes | Request body |


This API updates Package Materials from into mongo database.

*Returned Response:*




[PackageMaterialResponse](#PackageMaterialResponse)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageMaterial</i></summary>

```json
{
  "value": {
    "id": "64b8526e5ca47d41582b9fa1",
    "name": "Package1",
    "item_id": 1234,
    "company_id": 1,
    "length": 1,
    "height": 1,
    "width": 1,
    "weight": 1,
    "error_rate": 0,
    "store_ids": [
      1,
      9,
      5
    ],
    "rules": [
      {
        "rule_id": "64b4337a0c607fbfbcd0156b",
        "quantity": {
          "min": 1,
          "max": 2
        },
        "weight": 100
      }
    ],
    "channels": [
      {
        "id": "64b4337a0c607fbfbcd0190b",
        "type": "application"
      }
    ],
    "media": [
      "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/sandeepmaale/products/pictures/bundle/free/original/LOc5XW0cc-Logo.png"
    ],
    "package_type": "box",
    "size": "small",
    "status": "active",
    "track_inventory": false,
    "max_weight": 100,
    "package_vol_weight": 100,
    "auto_calculate": true
  }
}
```
</details>

</details>









---


### getPackageMaterials
Fetching of Package Material from database.




```kotlin
platformClient.serviceability.getPackageMaterials(packageMaterialId: packageMaterialId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| packageMaterialId | String | yes | A `package_material_id` is a unique identifier for a Package Material |  



This API returns response of Package Material from mongo database.

*Returned Response:*




[PackageMaterialResponse](#PackageMaterialResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateCourierPartnerRulePriority
Updates Courier Partner Rules Priority for a sales channel




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.updateCourierPartnerRulePriority(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [RulePriorityRequest](#RulePriorityRequest) | yes | Request body |


Updates Courier Partner Rules Priority for a sales channel

*Returned Response:*




[RulePriorityResponse](#RulePriorityResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---




### Schemas

 
 
 #### [UpdateZoneConfigRequest](#UpdateZoneConfigRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | serviceabilityType | String? |  yes  |  |

---


 
 
 #### [ServiceabilityErrorResponse](#ServiceabilityErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | value | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelId | String |  no  |  |
 | serviceabilityType | String |  no  |  |
 | channelType | String |  no  |  |

---


 
 
 #### [ApplicationServiceabilityConfigResponse](#ApplicationServiceabilityConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | [ServiceabilityErrorResponse](#ServiceabilityErrorResponse)? |  yes  |  |
 | data | [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [EntityRegionView_Request](#EntityRegionView_Request)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subType | ArrayList<String> |  no  |  |
 | parentId | ArrayList<String>? |  yes  |  |

---


 
 
 #### [EntityRegionView_Error](#EntityRegionView_Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | value | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [EntityRegionView_page](#EntityRegionView_page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Int |  no  |  |
 | size | Int |  no  |  |
 | current | Int |  no  |  |

---


 
 
 #### [getAppRegionZonesResponse](#getAppRegionZonesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | ArrayList<[PageSchema](#PageSchema)> |  no  |  |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |

---


 
 
 #### [PageSchema](#PageSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Int |  no  |  |
 | size | Int |  no  |  |
 | current | Int |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [EntityRegionView_Items](#EntityRegionView_Items)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subType | String |  no  |  |
 | uid | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [EntityRegionView_Response](#EntityRegionView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | [EntityRegionView_Error](#EntityRegionView_Error) |  no  |  |
 | page | [EntityRegionView_page](#EntityRegionView_page) |  no  |  |
 | data | ArrayList<[EntityRegionView_Items](#EntityRegionView_Items)> |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [ListViewSummary](#ListViewSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalZones | Int |  no  |  |
 | totalPincodesServed | Int |  no  |  |
 | totalActiveZones | Int |  no  |  |

---


 
 
 #### [ZoneDataItem](#ZoneDataItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Int |  no  |  |
 | size | Int |  no  |  |
 | current | Int |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ListViewProduct](#ListViewProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ListViewChannels](#ListViewChannels)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelId | String |  no  |  |
 | channelType | String |  no  |  |

---


 
 
 #### [ListViewItems](#ListViewItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | storesCount | Int |  no  |  |
 | isActive | Boolean |  no  |  |
 | product | [ListViewProduct](#ListViewProduct) |  no  |  |
 | regionsCount | Int |  no  |  |
 | companyId | Int |  no  |  |
 | channels | [ListViewChannels](#ListViewChannels) |  no  |  |

---


 
 
 #### [ListViewResponse](#ListViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | ArrayList<[ZoneDataItem](#ZoneDataItem)> |  no  |  |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |

---


 
 
 #### [CompanyStoreView_PageItems](#CompanyStoreView_PageItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Int |  no  |  |
 | size | Int |  no  |  |
 | current | Int |  no  |  |

---


 
 
 #### [CompanyStoreView_Response](#CompanyStoreView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | ArrayList<[CompanyStoreView_PageItems](#CompanyStoreView_PageItems)> |  no  |  |
 | items | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [GetZoneDataViewChannels](#GetZoneDataViewChannels)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelId | String |  no  |  |
 | channelType | String |  no  |  |

---


 
 
 #### [ZoneProductTypes](#ZoneProductTypes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |

---


 
 
 #### [ZoneMappingType](#ZoneMappingType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | pincode | ArrayList<String>? |  yes  |  |
 | state | ArrayList<String>? |  yes  |  |

---


 
 
 #### [UpdateZoneData](#UpdateZoneData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | companyId | Int |  no  |  |
 | isActive | Boolean |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | regionType | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | assignmentPreference | String? |  yes  |  |

---


 
 
 #### [ZoneUpdateRequest](#ZoneUpdateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String |  no  |  |
 | data | [UpdateZoneData](#UpdateZoneData) |  no  |  |

---


 
 
 #### [ZoneSuccessResponse](#ZoneSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statusCode | Int |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [GetZoneDataViewItems](#GetZoneDataViewItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | companyId | Int? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | regionType | String? |  yes  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | assignmentPreference | String? |  yes  |  |
 | storesCount | Int |  no  |  |

---


 
 
 #### [GetSingleZoneDataViewResponse](#GetSingleZoneDataViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetZoneDataViewItems](#GetZoneDataViewItems) |  no  |  |

---


 
 
 #### [GetZoneByIdSchema](#GetZoneByIdSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | companyId | Int? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | regionType | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | assignmentPreference | String? |  yes  |  |
 | storesCount | Int |  no  |  |

---


 
 
 #### [CreateZoneData](#CreateZoneData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | companyId | Int |  no  |  |
 | isActive | Boolean |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | regionType | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | assignmentPreference | String? |  yes  |  |

---


 
 
 #### [ZoneResponse](#ZoneResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statusCode | Int |  no  |  |
 | zoneId | String |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewRequest](#GetZoneFromPincodeViewRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [Zone](#Zone)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | type | String |  no  |  |
 | name | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | slug | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | assignmentPreference | String |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewResponse](#GetZoneFromPincodeViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | serviceabilityType | String |  no  |  |
 | zones | ArrayList<[Zone](#Zone)> |  no  |  |

---


 
 
 #### [GetZoneFromApplicationIdViewResponse](#GetZoneFromApplicationIdViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | ArrayList<[ZoneDataItem](#ZoneDataItem)> |  no  |  |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |

---


 
 
 #### [ServiceabilityPageResponse](#ServiceabilityPageResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | itemTotal | Int? |  yes  |  |
 | size | Int? |  yes  |  |
 | current | Int? |  yes  |  |

---


 
 
 #### [MobileNo](#MobileNo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | String? |  yes  |  |
 | countryCode | Int? |  yes  |  |

---


 
 
 #### [ManagerResponse](#ManagerResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | mobileNo | [MobileNo](#MobileNo)? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [ModifiedByResponse](#ModifiedByResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [IntegrationTypeResponse](#IntegrationTypeResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | inventory | String? |  yes  |  |
 | order | String? |  yes  |  |

---


 
 
 #### [ProductReturnConfigResponse](#ProductReturnConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | onSameStore | Boolean? |  yes  |  |

---


 
 
 #### [ContactNumberResponse](#ContactNumberResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | String? |  yes  |  |
 | countryCode | Int? |  yes  |  |

---


 
 
 #### [AddressResponse](#AddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | city | String? |  yes  |  |
 | address1 | String? |  yes  |  |
 | pincode | Int? |  yes  |  |
 | address2 | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | state | String? |  yes  |  |
 | country | String? |  yes  |  |
 | latitude | Double? |  yes  |  |
 | longitude | Double? |  yes  |  |

---


 
 
 #### [CreatedByResponse](#CreatedByResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [EwayBillResponse](#EwayBillResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [EinvoiceResponse](#EinvoiceResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [GstCredentialsResponse](#GstCredentialsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eWaybill | [EwayBillResponse](#EwayBillResponse)? |  yes  |  |
 | eInvoice | [EinvoiceResponse](#EinvoiceResponse)? |  yes  |  |

---


 
 
 #### [WarningsResponse](#WarningsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeAddress | String? |  yes  |  |

---


 
 
 #### [OpeningClosing](#OpeningClosing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | minute | Int? |  yes  |  |
 | hour | Int? |  yes  |  |

---


 
 
 #### [TimmingResponse](#TimmingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | open | Boolean? |  yes  |  |
 | weekday | String? |  yes  |  |
 | closing | [OpeningClosing](#OpeningClosing)? |  yes  |  |
 | opening | [OpeningClosing](#OpeningClosing)? |  yes  |  |

---


 
 
 #### [DocumentsResponse](#DocumentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | legalName | String? |  yes  |  |
 | value | String? |  yes  |  |
 | type | String? |  yes  |  |
 | verified | Boolean? |  yes  |  |

---


 
 
 #### [Dp](#Dp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fmPriority | Int? |  yes  |  |
 | rvpPriority | Int? |  yes  |  |
 | lmPriority | Int? |  yes  |  |
 | internalAccountId | String? |  yes  |  |
 | areaCode | Int? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | operations | ArrayList<String>? |  yes  |  |
 | externalAccountId | String? |  yes  |  |
 | transportMode | String? |  yes  |  |
 | assignDpFromSb | Boolean? |  yes  |  |

---


 
 
 #### [LogisticsResponse](#LogisticsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | override | Boolean? |  yes  |  |
 | dp | [Dp](#Dp)? |  yes  |  |

---


 
 
 #### [ItemResponse](#ItemResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdOn | String? |  yes  |  |
 | manager | [ManagerResponse](#ManagerResponse)? |  yes  |  |
 | modifiedBy | [ModifiedByResponse](#ModifiedByResponse)? |  yes  |  |
 | integrationType | [IntegrationTypeResponse](#IntegrationTypeResponse)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | productReturnConfig | [ProductReturnConfigResponse](#ProductReturnConfigResponse)? |  yes  |  |
 | contactNumbers | ArrayList<[ContactNumberResponse](#ContactNumberResponse)>? |  yes  |  |
 | verifiedBy | [ModifiedByResponse](#ModifiedByResponse)? |  yes  |  |
 | stage | String? |  yes  |  |
 | address | [AddressResponse](#AddressResponse)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdBy | [CreatedByResponse](#CreatedByResponse)? |  yes  |  |
 | gstCredentials | [GstCredentialsResponse](#GstCredentialsResponse)? |  yes  |  |
 | displayName | String? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | uid | Int? |  yes  |  |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | code | String? |  yes  |  |
 | warnings | [WarningsResponse](#WarningsResponse)? |  yes  |  |
 | name | String? |  yes  |  |
 | timing | ArrayList<[TimmingResponse](#TimmingResponse)>? |  yes  |  |
 | documents | ArrayList<[DocumentsResponse](#DocumentsResponse)>? |  yes  |  |
 | storeType | String? |  yes  |  |
 | subType | String? |  yes  |  |
 | company | Int? |  yes  |  |
 | cls | String? |  yes  |  |
 | logistics | [LogisticsResponse](#LogisticsResponse)? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GetStoresViewResponse](#GetStoresViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [ServiceabilityPageResponse](#ServiceabilityPageResponse) |  no  |  |
 | items | ArrayList<[ItemResponse](#ItemResponse)>? |  yes  |  |

---


 
 
 #### [ReAssignStoreRequest](#ReAssignStoreRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | toPincode | String |  no  |  |
 | identifier | String |  no  |  |
 | configuration | HashMap<String,Any> |  no  |  |
 | ignoredLocations | ArrayList<String> |  no  |  |
 | articles | ArrayList<HashMap<String,Any>> |  no  |  |

---


 
 
 #### [ReAssignStoreResponse](#ReAssignStoreResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | toPincode | String |  no  |  |
 | success | Boolean |  no  |  |
 | error | HashMap<String,Any> |  no  |  |
 | articles | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [PincodeMopData](#PincodeMopData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincodes | ArrayList<Int> |  no  |  |
 | country | String |  no  |  |
 | action | String |  no  |  |

---


 
 
 #### [PincodeMopUpdateResponse](#PincodeMopUpdateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | Int |  no  |  |
 | channelId | String |  no  |  |
 | country | String |  no  |  |
 | isActive | Boolean |  no  |  |

---


 
 
 #### [PincodeMOPresponse](#PincodeMOPresponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | statusCode | Int |  no  |  |
 | batchId | String |  no  |  |
 | country | String |  no  |  |
 | action | String |  no  |  |
 | pincodes | ArrayList<Int>? |  yes  |  |
 | updatedPincodes | ArrayList<[PincodeMopUpdateResponse](#PincodeMopUpdateResponse)>? |  yes  |  |

---


 
 
 #### [CommonError](#CommonError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statusCode | String? |  yes  |  |
 | error | Any? |  yes  |  |
 | success | String? |  yes  |  |

---


 
 
 #### [PincodeMopBulkData](#PincodeMopBulkData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String |  no  |  |
 | s3Url | String |  no  |  |

---


 
 
 #### [PincodeBulkViewResponse](#PincodeBulkViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String |  no  |  |
 | s3Url | String |  no  |  |

---


 
 
 #### [PincodeCodStatusListingRequest](#PincodeCodStatusListingRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | pincode | Int? |  yes  |  |
 | current | Int? |  yes  |  |
 | pageSize | Int? |  yes  |  |

---


 
 
 #### [PincodeCodStatusListingResponse](#PincodeCodStatusListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | data | ArrayList<[PincodeCodStatusListingResponse](#PincodeCodStatusListingResponse)> |  no  |  |
 | success | Boolean |  no  |  |
 | errors | ArrayList<[Error](#Error)>? |  yes  |  |
 | page | [PincodeCodStatusListingPage](#PincodeCodStatusListingPage) |  no  |  |
 | summary | [PincodeCodStatusListingSummary](#PincodeCodStatusListingSummary) |  no  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [PincodeCodStatusListingPage](#PincodeCodStatusListingPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Int |  no  |  |
 | size | Int |  no  |  |
 | current | Int |  no  |  |

---


 
 
 #### [PincodeCodStatusListingSummary](#PincodeCodStatusListingSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalActivePincodes | Int |  no  |  |
 | totalInactivePincodes | Int |  no  |  |

---


 
 
 #### [PincodeMopUpdateAuditHistoryRequest](#PincodeMopUpdateAuditHistoryRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityType | String |  no  |  |
 | fileName | String? |  yes  |  |

---


 
 
 #### [PincodeMopUpdateAuditHistoryPaging](#PincodeMopUpdateAuditHistoryPaging)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | size | Int? |  yes  |  |
 | current | Int? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | itemTotal | Int? |  yes  |  |

---


 
 
 #### [PincodeMopUpdateAuditHistoryResponse](#PincodeMopUpdateAuditHistoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String? |  yes  |  |
 | entityType | String? |  yes  |  |
 | errorFileS3Url | String? |  yes  |  |
 | s3Url | String? |  yes  |  |
 | fileName | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | updatedBy | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [PincodeMopUpdateAuditHistoryResponseData](#PincodeMopUpdateAuditHistoryResponseData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityType | String? |  yes  |  |
 | page | [PincodeMopUpdateAuditHistoryPaging](#PincodeMopUpdateAuditHistoryPaging) |  no  |  |
 | data | ArrayList<[PincodeMopUpdateAuditHistoryResponse](#PincodeMopUpdateAuditHistoryResponse)> |  no  |  |

---


 
 
 #### [ArithmeticOperations](#ArithmeticOperations)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lt | Int? |  yes  |  |
 | gt | Int? |  yes  |  |
 | lte | Int? |  yes  |  |
 | gte | Int? |  yes  |  |

---


 
 
 #### [SchemeRulesFeatures](#SchemeRulesFeatures)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | qualityCheck | Boolean? |  yes  |  |
 | quickResponseCode | Boolean? |  yes  |  |
 | eWaybill | Boolean? |  yes  |  |
 | multiPartShipments | Boolean? |  yes  |  |
 | flammable | Boolean? |  yes  |  |
 | hazmat | Boolean? |  yes  |  |
 | batteryOperated | Boolean? |  yes  |  |

---


 
 
 #### [SchemeRules](#SchemeRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | weight | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |
 | transportType | ArrayList<String>? |  yes  |  |
 | region | String? |  yes  |  |
 | paymentMode | ArrayList<String>? |  yes  |  |
 | feature | [SchemeRulesFeatures](#SchemeRulesFeatures)? |  yes  |  |

---


 
 
 #### [CourierAccount](#CourierAccount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | extensionId | String |  no  |  |
 | accountId | String |  no  |  |
 | schemeId | String |  no  |  |
 | isSelfShip | Boolean |  no  |  |
 | stage | String |  no  |  |
 | isOwnAccount | Boolean |  no  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | message | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [CourierPartnerAccountFailureResponse](#CourierPartnerAccountFailureResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | error | ArrayList<[ErrorResponse](#ErrorResponse)> |  no  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | Int |  no  |  |
 | itemTotal | Int |  no  |  |
 | hasPrevious | Boolean |  no  |  |
 | type | String |  no  |  |
 | current | Int |  no  |  |
 | hasNext | Boolean |  no  |  |

---


 
 
 #### [CourierPartnerList](#CourierPartnerList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | extensionId | String |  no  |  |
 | accountId | String |  no  |  |
 | name | String |  no  |  |
 | isSelfShip | Boolean |  no  |  |

---


 
 
 #### [LocationRuleValues](#LocationRuleValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | subType | String? |  yes  |  |
 | name | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | parentId | String? |  yes  |  |
 | parentIds | ArrayList<String>? |  yes  |  |

---


 
 
 #### [LocationRule](#LocationRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | includes | ArrayList<[LocationRuleValues](#LocationRuleValues)>? |  yes  |  |

---


 
 
 #### [StringComparisonOperations](#StringComparisonOperations)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includes | ArrayList<String>? |  yes  |  |

---


 
 
 #### [IntComparisonOperations](#IntComparisonOperations)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includes | ArrayList<Int>? |  yes  |  |

---


 
 
 #### [CourierPartnerRuleConditions](#CourierPartnerRuleConditions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | forward | [LocationRule](#LocationRule)? |  yes  |  |
 | reverse | [LocationRule](#LocationRule)? |  yes  |  |
 | paymentMode | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | categoryIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | productIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | productTags | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | zoneIds | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | departmentIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | brandIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | orderPlaceDate | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |
 | storeIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | storeType | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | storeTags | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | shipmentWeight | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |
 | shipmentCost | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |
 | shipmentVolumetricWeight | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |

---


 
 
 #### [CourierPartnerRule](#CourierPartnerRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | cpList | ArrayList<[CourierPartnerList](#CourierPartnerList)>? |  yes  |  |
 | name | String |  no  |  |
 | conditions | [CourierPartnerRuleConditions](#CourierPartnerRuleConditions) |  no  |  |
 | sort | ArrayList<String> |  no  |  |

---


 
 
 #### [FailureResponse](#FailureResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | error | ArrayList<[ErrorResponse](#ErrorResponse)> |  no  |  |

---


 
 
 #### [CourierPartnerRulesListResponse](#CourierPartnerRulesListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CourierPartnerRule](#CourierPartnerRule)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [CompanyConfig](#CompanyConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleIds | ArrayList<String> |  no  |  |
 | sort | ArrayList<String> |  no  |  |
 | logisticsAsActual | Boolean? |  yes  |  |

---


 
 
 #### [ZoneConfig](#ZoneConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | serviceabilityType | String? |  yes  |  |

---


 
 
 #### [ApplicationConfig](#ApplicationConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleIds | ArrayList<String>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |
 | zones | [ZoneConfig](#ZoneConfig)? |  yes  |  |

---


 
 
 #### [BulkRegionJobSerializer](#BulkRegionJobSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filePath | String? |  yes  |  |
 | country | String |  no  |  |
 | action | String |  no  |  |
 | region | String |  no  |  |

---


 
 
 #### [BulkRegionResponseItemData](#BulkRegionResponseItemData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filePath | String |  no  |  |
 | failed | Int? |  yes  |  |
 | failedRecords | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | action | String |  no  |  |
 | batchId | String |  no  |  |
 | country | String |  no  |  |
 | success | Int? |  yes  |  |
 | region | String |  no  |  |
 | status | String |  no  |  |
 | total | Int? |  yes  |  |
 | errorFilePath | String? |  yes  |  |

---


 
 
 #### [BulkRegionResponse](#BulkRegionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[BulkRegionResponseItemData](#BulkRegionResponseItemData)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [SelfShipResponse](#SelfShipResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | tat | Double |  no  |  |

---


 
 
 #### [ApplicationSelfShipConfig](#ApplicationSelfShipConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | selfShip | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [ApplicationSelfShipConfigResponse](#ApplicationSelfShipConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | [ServiceabilityErrorResponse](#ServiceabilityErrorResponse)? |  yes  |  |
 | data | [ApplicationSelfShipConfig](#ApplicationSelfShipConfig)? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [StoreRuleConfigData](#StoreRuleConfigData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleIds | ArrayList<String>? |  yes  |  |
 | typeBasedPriority | ArrayList<String>? |  yes  |  |
 | tagBasedPriority | ArrayList<String>? |  yes  |  |
 | storePriority | ArrayList<[StorePrioritySchema](#StorePrioritySchema)>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CustomerRadiusSchema](#CustomerRadiusSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unit | String |  no  |  |
 | lt | Int? |  yes  |  |
 | lte | Int? |  yes  |  |
 | gt | Int? |  yes  |  |
 | gte | Int? |  yes  |  |

---


 
 
 #### [StoreRuleConditionSchema](#StoreRuleConditionSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | departmentIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | categoryIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | brandIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | toLocation | [LocationRule](#LocationRule)? |  yes  |  |
 | customerRadius | [CustomerRadiusSchema](#CustomerRadiusSchema)? |  yes  |  |
 | storeType | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | productTags | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | productIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | storeTags | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | orderPlaceDate | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |
 | zoneIds | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |

---


 
 
 #### [StoreRuleDataSchema](#StoreRuleDataSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | applicationId | String? |  yes  |  |
 | typeBasedPriority | ArrayList<String>? |  yes  |  |
 | tagBasedPriority | ArrayList<String>? |  yes  |  |
 | storePriority | ArrayList<[StorePrioritySchema](#StorePrioritySchema)>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |
 | conditions | [StoreRuleConditionSchema](#StoreRuleConditionSchema)? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [StorePrioritySchema](#StorePrioritySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [GetStoreRulesApiResponse](#GetStoreRulesApiResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[StoreRuleDataSchema](#StoreRuleDataSchema)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [CreateStoreRuleRequestSchema](#CreateStoreRuleRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | conditions | [StoreRuleConditionSchema](#StoreRuleConditionSchema)? |  yes  |  |
 | typeBasedPriority | ArrayList<String>? |  yes  |  |
 | tagBasedPriority | ArrayList<String>? |  yes  |  |
 | storePriority | ArrayList<[StorePrioritySchema](#StorePrioritySchema)>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |

---


 
 
 #### [StoreRuleResponseSchema](#StoreRuleResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | type | String? |  yes  |  |
 | typeBasedPriority | ArrayList<String>? |  yes  |  |
 | tagBasedPriority | ArrayList<String>? |  yes  |  |
 | storePriority | ArrayList<[StorePrioritySchema](#StorePrioritySchema)>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |
 | conditions | [StoreRuleConditionSchema](#StoreRuleConditionSchema)? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [StoreRuleUpdateResponseSchema](#StoreRuleUpdateResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | type | String? |  yes  |  |
 | typeBasedPriority | ArrayList<String>? |  yes  |  |
 | tagBasedPriority | ArrayList<String>? |  yes  |  |
 | storePriority | ArrayList<[StorePrioritySchema](#StorePrioritySchema)>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |
 | conditions | [StoreRuleConditionSchema](#StoreRuleConditionSchema)? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | applicationId | String? |  yes  |  |

---


 
 
 #### [ServiceabilityModel](#ServiceabilityModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lmCodLimit | Int |  no  |  |
 | isQc | Boolean |  no  |  |
 | pickupCutoff | String |  no  |  |
 | routeCode | String |  no  |  |
 | isFirstMile | Boolean |  no  |  |
 | isReturn | Boolean |  no  |  |
 | isInstallation | Boolean |  no  |  |
 | isLastMile | Boolean |  no  |  |

---


 
 
 #### [CourierPartnerSchemeFeatures](#CourierPartnerSchemeFeatures)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | doorstepQc | Boolean? |  yes  |  |
 | qr | Boolean? |  yes  |  |
 | mps | Boolean? |  yes  |  |
 | ndr | Boolean? |  yes  |  |
 | ndrAttempts | Int? |  yes  |  |
 | dangerousGoods | Boolean? |  yes  |  |
 | fragileGoods | Boolean? |  yes  |  |
 | restrictedGoods | Boolean? |  yes  |  |
 | coldStorageGoods | Boolean? |  yes  |  |
 | doorstepExchange | Boolean? |  yes  |  |
 | doorstepReturn | Boolean? |  yes  |  |
 | productInstallation | Boolean? |  yes  |  |
 | openboxDelivery | Boolean? |  yes  |  |
 | statusUpdates | String? |  yes  |  |
 | multiPickSingleDrop | Boolean? |  yes  |  |
 | singlePickMultiDrop | Boolean? |  yes  |  |
 | multiPickMultiDrop | Boolean? |  yes  |  |
 | ewaybill | Boolean? |  yes  |  |

---


 
 
 #### [CourierPartnerSchemeModel](#CourierPartnerSchemeModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | extensionId | String |  no  |  |
 | schemeId | String |  no  |  |
 | weight | [ArithmeticOperations](#ArithmeticOperations) |  no  |  |
 | transportType | String |  no  |  |
 | region | String |  no  |  |
 | deliveryType | String |  no  |  |
 | paymentMode | ArrayList<String> |  no  |  |
 | stage | String |  no  |  |
 | feature | [CourierPartnerSchemeFeatures](#CourierPartnerSchemeFeatures) |  no  |  |

---


 
 
 #### [CourierAccountResponse](#CourierAccountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | accountId | String |  no  |  |
 | schemeId | String |  no  |  |
 | isSelfShip | Boolean |  no  |  |
 | stage | String |  no  |  |
 | isOwnAccount | Boolean |  no  |  |
 | schemeRules | [CourierPartnerSchemeModel](#CourierPartnerSchemeModel) |  no  |  |

---


 
 
 #### [CompanyCourierPartnerAccountListResponse](#CompanyCourierPartnerAccountListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CourierAccountResponse](#CourierAccountResponse)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [PackageMaterial](#PackageMaterial)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | width | Double |  no  |  |
 | height | Double |  no  |  |
 | length | Double |  no  |  |
 | rules | ArrayList<[PackageMaterialRule](#PackageMaterialRule)>? |  yes  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | weight | Double |  no  |  |
 | errorRate | Double |  no  |  |
 | packageType | String |  no  |  |
 | size | String |  no  |  |
 | media | ArrayList<String>? |  yes  |  |
 | channels | ArrayList<[Channel](#Channel)> |  no  |  |
 | trackInventory | Boolean? |  yes  |  |
 | status | String |  no  |  |
 | maxWeight | Double? |  yes  |  |
 | packageVolWeight | Double? |  yes  |  |
 | autoCalculate | Boolean? |  yes  |  |

---


 
 
 #### [PackageMaterialResponse](#PackageMaterialResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | id | String? |  yes  |  |
 | itemId | Int? |  yes  |  |
 | width | Double |  no  |  |
 | height | Double |  no  |  |
 | length | Double |  no  |  |
 | rules | ArrayList<[PackageMaterialRule](#PackageMaterialRule)>? |  yes  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | weight | Double |  no  |  |
 | errorRate | Double |  no  |  |
 | packageType | String |  no  |  |
 | size | String |  no  |  |
 | media | ArrayList<String>? |  yes  |  |
 | channels | ArrayList<[Channel](#Channel)> |  no  |  |
 | trackInventory | Boolean? |  yes  |  |
 | status | String |  no  |  |
 | maxWeight | Double? |  yes  |  |
 | packageVolWeight | Double? |  yes  |  |
 | autoCalculate | Boolean? |  yes  |  |

---


 
 
 #### [PackageMaterialRule](#PackageMaterialRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleId | String? |  yes  |  |
 | quantity | [PackageMaterialRuleQuantity](#PackageMaterialRuleQuantity)? |  yes  |  |
 | weight | Int? |  yes  |  |

---


 
 
 #### [PackageRule](#PackageRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | companyId | Int |  no  |  |
 | type | String |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | productTag | [PackageRuleProductTag](#PackageRuleProductTag)? |  yes  |  |
 | productId | [PackageRuleProduct](#PackageRuleProduct)? |  yes  |  |
 | categoryId | [PackageRuleCategory](#PackageRuleCategory)? |  yes  |  |

---


 
 
 #### [PackageRuleResponse](#PackageRuleResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String |  no  |  |
 | companyId | Int |  no  |  |
 | type | String |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | productTag | [PackageRuleProductTag](#PackageRuleProductTag)? |  yes  |  |
 | productId | [PackageRuleProduct](#PackageRuleProduct)? |  yes  |  |
 | categoryId | [PackageRuleCategory](#PackageRuleCategory)? |  yes  |  |

---


 
 
 #### [Channel](#Channel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [PackageMaterialRuleList](#PackageMaterialRuleList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [PackageRuleResponse](#PackageRuleResponse)? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [PackageMaterialList](#PackageMaterialList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [PackageMaterialResponse](#PackageMaterialResponse)? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [PackageRuleProduct](#PackageRuleProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includes | ArrayList<Int>? |  yes  |  |

---


 
 
 #### [PackageRuleProductTag](#PackageRuleProductTag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includes | ArrayList<String>? |  yes  |  |

---


 
 
 #### [PackageRuleCategory](#PackageRuleCategory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includes | ArrayList<Int>? |  yes  |  |

---


 
 
 #### [PackageMaterialRuleQuantity](#PackageMaterialRuleQuantity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | Int? |  yes  |  |
 | max | Int? |  yes  |  |

---


 
 
 #### [RulePriorityRequest](#RulePriorityRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleId | String |  no  |  |
 | priority | Int |  no  |  |

---


 
 
 #### [RulePriorityResponse](#RulePriorityResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---



