



##### [Back to Platform docs](./README.md)

## Serviceability Methods
Logistics Configuration API's allows you to configure zone, application logistics and many more useful features. 
* [getApplicationServiceability](#getapplicationserviceability)
* [getEntityRegionView](#getentityregionview)
* [getListView](#getlistview)
* [getCompanyStoreView](#getcompanystoreview)
* [getZoneDataView](#getzonedataview)
* [updateZoneControllerView](#updatezonecontrollerview)
* [createZone](#createzone)
* [getZoneFromPincodeView](#getzonefrompincodeview)
* [getZonesFromApplicationIdView](#getzonesfromapplicationidview)
* [getZoneListView](#getzonelistview)
* [getStore](#getstore)
* [getAllStores](#getallstores)
* [getOptimalLocations](#getoptimallocations)
* [addAppDp](#addappdp)
* [updatePincodeMopView](#updatepincodemopview)
* [updatePincodeBulkView](#updatepincodebulkview)
* [updatePincodeCoDListing](#updatepincodecodlisting)
* [updatePincodeAuditHistory](#updatepincodeaudithistory)
* [postRegionJobBulk](#postregionjobbulk)
* [getRegionJobBulk](#getregionjobbulk)
* [getRegionJobBulkBatchId](#getregionjobbulkbatchid)
* [upsertDpAccount](#upsertdpaccount)
* [getDpAccountList](#getdpaccountlist)
* [getDpRule](#getdprule)
* [updateDpRule](#updatedprule)
* [createDpRule](#createdprule)
* [getDpRuleList](#getdprulelist)
* [getDpCompanyRulePriority](#getdpcompanyrulepriority)
* [upsertDpCompanyRulePriority](#upsertdpcompanyrulepriority)
* [getDpApplicationRulePriority](#getdpapplicationrulepriority)
* [upsertDpApplicationRulePriority](#upsertdpapplicationrulepriority)
* [patchApplicationServiceabilitySelfShipment](#patchapplicationserviceabilityselfshipment)
* [getApplicationServiceabilitySelfShipment](#getapplicationserviceabilityselfshipment)



## Methods with example and description


### getApplicationServiceability
Zone configuration of application.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.getApplicationServiceability().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






This API returns serviceability config of the application.

*Returned Response:*




[ApplicationServiceabilityConfigResponse](#ApplicationServiceabilityConfigResponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "error": {
    "type": null,
    "value": null,
    "message": null
  },
  "success": true,
  "data": {
    "channel_id": "5d656121a81320c2e6ee2a72",
    "channel_type": "application",
    "serviceability_type": "all"
  }
}
```
</details>









---


### getEntityRegionView
Get country and state list




```kotlin
platformClient.serviceability.getEntityRegionView(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [EntityRegionView_Request](#EntityRegionView_Request) | yes | Request body |


This API returns response for Entity Region View.

*Returned Response:*




[EntityRegionView_Response](#EntityRegionView_Response)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getListView
Zone List of application.




```kotlin
platformClient.serviceability.getListView(pageNumber: pageNumber, pageSize: pageSize, name: name, isActive: isActive, channelIds: channelIds, q: q).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNumber | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |   
| name | String? | no | Name of particular zone in the seller account |   
| isActive | Boolean? | no | status of  zone whether active or inactive |   
| channelIds | String? | no | zones associated with the given channel ids' |   
| q | String? | no | search with name as a free text |  



This API returns Zone List View of the application.

*Returned Response:*




[ListViewResponse](#ListViewResponse)

Zone List of application in descending order of their last modified date.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCompanyStoreView
Company Store View of application.




```kotlin
platformClient.serviceability.getCompanyStoreView(pageNumber: pageNumber, pageSize: pageSize).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNumber | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |  



This API returns Company Store View of the application.

*Returned Response:*




[CompanyStoreView_Response](#CompanyStoreView_Response)

Get Company Store View Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getZoneDataView
Zone Data View of application.




```kotlin
platformClient.serviceability.getZoneDataView(zoneId: zoneId).safeAwait{ response, error->
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



This API returns Zone Data View of the application.

*Returned Response:*




[GetSingleZoneDataViewResponse](#GetSingleZoneDataViewResponse)

Get Application Zone Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateZoneControllerView
Updation of zone collections in database.




```kotlin
platformClient.serviceability.updateZoneControllerView(zoneId: zoneId, body: body).safeAwait{ response, error->
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
| body | [ZoneUpdateRequest](#ZoneUpdateRequest) | yes | Request body |


This API returns response of updation of zone in mongo database.

*Returned Response:*




[ZoneSuccessResponse](#ZoneSuccessResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createZone
Creation of a new zone




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
| body | [ZoneRequest](#ZoneRequest) | yes | Request body |


This API allows you to create a new zone with the specified information. A zone enables serviceability based on given pincodes or regions. By creating a zone and including specific pincodes or regions, you can ensure that the stores associated with the zone are serviceable for those added pincodes or regions. This functionality is particularly useful when you need to ensure serviceability for multiple pincodes or regions by grouping them into a single zone.

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


### getZoneFromPincodeView
GET zone from the Pincode.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.getZoneFromPincodeView(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GetZoneFromPincodeViewRequest](#GetZoneFromPincodeViewRequest) | yes | Request body |


This API returns zone from the Pincode View.

*Returned Response:*




[GetZoneFromPincodeViewResponse](#GetZoneFromPincodeViewResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getZonesFromApplicationIdView
GET zones from the application_id.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.getZonesFromApplicationIdView(pageNo: pageNo, pageSize: pageSize, zoneId: zoneId, q: q).safeAwait{ response, error->
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
| zoneId | ArrayList<String>? | no | list of zones to query for |   
| q | String? | no | search with name as a free text |  



This API returns zones from the application_id View.

*Returned Response:*




[GetZoneFromApplicationIdViewResponse](#GetZoneFromApplicationIdViewResponse)

List of zones for the given application_id




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getZoneListView
Zone List of application.




```kotlin
platformClient.serviceability.getZoneListView(pageNumber: pageNumber, pageNo: pageNo, pageSize: pageSize, name: name, isActive: isActive, channelIds: channelIds, q: q, zoneId: zoneId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNumber | Int? | no | index of the item to start returning with |   
| pageNo | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |   
| name | String? | no | Name of particular zone in the seller account |   
| isActive | Boolean? | no | status of  zone whether active or inactive |   
| channelIds | String? | no | zones associated with the given channel ids' |   
| q | String? | no | search with name as a free text |   
| zoneId | ArrayList<String>? | no | list of zones to query for |  



This API returns Zone List View of the application.

*Returned Response:*




[ListViewResponse](#ListViewResponse)

Zone List of application in descending order of their last modified date.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getStore
GET stores data




```kotlin
platformClient.serviceability.getStore(storeUid: storeUid).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| storeUid | Int | yes | A `store_uid` contains a specific ID of a store. |  



This API returns stores data.

*Returned Response:*




[GetStoresViewResponse](#GetStoresViewResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "uid": 2,
      "_cls": "Store",
      "address": {
        "city": "MUMBAI",
        "country": "INDIA",
        "address2": "",
        "address1": "POLARIS 2ND FLOOR, ANDHERI",
        "landmark": "",
        "state": "MAHARASHTRA",
        "pincode": 400001,
        "longitude": 72.8776559,
        "latitude": 19.0759837
      },
      "code": "HS-a0c85",
      "company_id": 2,
      "contact_numbers": [
        {
          "country_code": 91,
          "number": "9096686804"
        }
      ],
      "created_by": {
        "user_id": "605e8e86493f54a9ccaa47be",
        "username": "parvezshaikh_gofynd_com_07710"
      },
      "created_on": "2021-08-07T06:21:25.293000",
      "display_name": "Test",
      "documents": [
        {
          "type": "gst",
          "verified": true,
          "value": "27AALCA0442L1ZM",
          "legal_name": "SHOPSENSE RETAIL TECHNOLOGIES PRIVATE LIMITED"
        }
      ],
      "gst_credentials": {
        "e_waybill": {
          "enabled": false
        },
        "e_invoice": {
          "enabled": false
        }
      },
      "integration_type": {
        "order": "pulse",
        "inventory": "pulse"
      },
      "logistics": {
        "dp": {
          "1": {
            "fm_priority": 1,
            "lm_priority": 1,
            "rvp_priority": 1,
            "payment_mode": "all",
            "operations": [
              "inter_city"
            ],
            "area_code": null,
            "assign_dp_from_sb": true,
            "transport_mode": "air",
            "external_account_id": null,
            "internal_account_id": "1"
          },
          "19": {
            "fm_priority": 2,
            "lm_priority": 2,
            "rvp_priority": 2,
            "payment_mode": "all",
            "operations": "inter_city",
            "area_code": null,
            "assign_dp_from_sb": true,
            "transport_mode": "air",
            "external_account_id": null,
            "internal_account_id": "19"
          }
        },
        "override": false
      },
      "manager": {
        "name": "Parvez Shaikh",
        "mobile_no": {
          "country_code": 91,
          "number": "9096686804"
        },
        "email": "parvezshaikh@gofynd.com"
      },
      "modified_by": {
        "user_id": "38ac93a8a5495305fc794e76",
        "username": "919594495254_32111"
      },
      "modified_on": "2021-08-17T14:18:10.788000",
      "name": "Test",
      "notification_emails": [
        "parvezshaikh@gofynd.com"
      ],
      "product_return_config": {
        "on_same_store": true
      },
      "stage": "verified",
      "store_type": "high_street",
      "sub_type": "store",
      "timing": [
        {
          "open": true,
          "opening": {
            "hour": 11,
            "minute": 0
          },
          "closing": {
            "hour": 21,
            "minute": 30
          },
          "weekday": "monday"
        },
        {
          "open": true,
          "opening": {
            "hour": 11,
            "minute": 0
          },
          "closing": {
            "hour": 21,
            "minute": 30
          },
          "weekday": "tuesday"
        },
        {
          "open": true,
          "opening": {
            "hour": 11,
            "minute": 0
          },
          "closing": {
            "hour": 21,
            "minute": 30
          },
          "weekday": "wednesday"
        },
        {
          "open": true,
          "opening": {
            "hour": 11,
            "minute": 0
          },
          "closing": {
            "hour": 21,
            "minute": 30
          },
          "weekday": "thursday"
        },
        {
          "open": true,
          "opening": {
            "hour": 11,
            "minute": 0
          },
          "closing": {
            "hour": 21,
            "minute": 30
          },
          "weekday": "friday"
        },
        {
          "open": true,
          "opening": {
            "hour": 11,
            "minute": 0
          },
          "closing": {
            "hour": 21,
            "minute": 30
          },
          "weekday": "saturday"
        },
        {
          "open": true,
          "opening": {
            "hour": 11,
            "minute": 0
          },
          "closing": {
            "hour": 21,
            "minute": 30
          },
          "weekday": "sunday"
        }
      ],
      "verified_by": {
        "user_id": "0",
        "username": "Silverbolt"
      },
      "verified_on": "2022-03-23T13:35:46.869000",
      "warnings": {
        "store_address": "Address: Address seems to be inappropriate this might affect the delivery."
      },
      "_custom_json": {},
      "company": 2
    }
  ],
  "page": {
    "type": "number",
    "size": 2,
    "current": 1,
    "has_next": true,
    "item_total": 3276
  }
}
```
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


### addAppDp
Add application dp data




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.addAppDp(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ApplicationCompanyDpViewRequest](#ApplicationCompanyDpViewRequest) | yes | Request body |


This API add application dp data.

*Returned Response:*




[ApplicationCompanyDpViewResponse](#ApplicationCompanyDpViewResponse)

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


### postRegionJobBulk
This Api creates a Bulk Job for region tat data upsert




```kotlin
platformClient.serviceability.postRegionJobBulk(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [BulkRegionJobSerializer](#BulkRegionJobSerializer) | yes | Request body |


This API takes request body, validates it and sends it to kafka topic

*Returned Response:*




[PostBulkRegionJobResponse](#PostBulkRegionJobResponse)

Successful response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getRegionJobBulk
Get bulk_export_job collection all records




```kotlin
platformClient.serviceability.getRegionJobBulk(currentPageNumber: currentPageNumber, pageSize: pageSize).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| currentPageNumber | Int? | no | The current page number |   
| pageSize | Int? | no | The page size |  



This API takes gives all the records of bulk_export_job collection

*Returned Response:*




[GetBulkRegionJobResponse](#GetBulkRegionJobResponse)

Successful response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getRegionJobBulkBatchId
Get bulk_export_job data for a given batch_id




```kotlin
platformClient.serviceability.getRegionJobBulkBatchId(batchId: batchId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| batchId | String | yes | The batch ID |  



This API takes batch_id and gives the detail of bulk_export_job collection for the batch_id

*Returned Response:*




[GetBulkRegionJobResponse](#GetBulkRegionJobResponse)

Successful response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### upsertDpAccount
Upsertion of DpAccount in database.




```kotlin
platformClient.serviceability.upsertDpAccount(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CompanyDpAccountRequest](#CompanyDpAccountRequest) | yes | Request body |


This API returns response of upsertion of DpAccount in mongo database.

*Returned Response:*




[CompanyDpAccountResponse](#CompanyDpAccountResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getDpAccountList
Getting DpAccount of a company from database.




```kotlin
platformClient.serviceability.getDpAccountList(pageNumber: pageNumber, pageSize: pageSize, stage: stage, paymentMode: paymentMode, transportType: transportType).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNumber | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |   
| stage | String? | no | stage of the account. enabled/disabled |   
| paymentMode | String? | no | Filters dp accounts based on payment mode |   
| transportType | String? | no | Filters dp accounts based on transport_type |  



This API returns response DpAccount of a company from mongo database.

*Returned Response:*




[CompanyDpAccountListResponse](#CompanyDpAccountListResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getDpRule
Fetching of DpRules from database.




```kotlin
platformClient.serviceability.getDpRule(ruleUid: ruleUid).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| ruleUid | String | yes | A `rule_uid` is a unique identifier for a particular Dp. |  



This API returns response of DpRules from mongo database.

*Returned Response:*




[DpRuleSuccessResponse](#DpRuleSuccessResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateDpRule
Updating of DpRules from database.




```kotlin
platformClient.serviceability.updateDpRule(ruleUid: ruleUid, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| ruleUid | String | yes | A `rule_uid` is a unique identifier for a particular Dp. |  
| body | [DpRulesUpdateRequest](#DpRulesUpdateRequest) | yes | Request body |


This API updates and returns response of DpRules from mongo database.

*Returned Response:*




[DpRuleUpdateSuccessResponse](#DpRuleUpdateSuccessResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createDpRule
Upsert of DpRules in database.




```kotlin
platformClient.serviceability.createDpRule(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [DpRuleRequest](#DpRuleRequest) | yes | Request body |


This API returns response of upsert of DpRules in mongo database.

*Returned Response:*




[DpRuleSuccessResponse](#DpRuleSuccessResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getDpRuleList
Fetching of DpRules from database.




```kotlin
platformClient.serviceability.getDpRuleList(pageNumber: pageNumber, pageSize: pageSize).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNumber | Int? | no | index of the item to start returning with |   
| pageSize | Int? | no | determines the items to be displayed in a page |  



This API returns response of DpRules from mongo database.

*Returned Response:*




[DpMultipleRuleSuccessResponse](#DpMultipleRuleSuccessResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getDpCompanyRulePriority
Get All DpCompanyRules applied to company from database.




```kotlin
platformClient.serviceability.getDpCompanyRulePriority().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






This API returns response of all DpCompanyRules from mongo database.

*Returned Response:*




[DPCompanyRuleResponse](#DPCompanyRuleResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### upsertDpCompanyRulePriority
Upsert of DpCompanyRules in database.




```kotlin
platformClient.serviceability.upsertDpCompanyRulePriority(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [DPCompanyRuleRequest](#DPCompanyRuleRequest) | yes | Request body |


This API returns response of upsert of DpCompanyRules in mongo database.

*Returned Response:*




[DPCompanyRuleResponse](#DPCompanyRuleResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getDpApplicationRulePriority
Get All DpApplicationRules rules added at application level from database.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.getDpApplicationRulePriority().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






This API returns response of all rules of DpApplicationRules from mongo database.

*Returned Response:*




[DPApplicationRuleResponse](#DPApplicationRuleResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### upsertDpApplicationRulePriority
Upsert of DpApplicationRules in database.




```kotlin
platformClient.application("<APPLICATION_ID>").serviceability.upsertDpApplicationRulePriority(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [DPApplicationRuleRequest](#DPApplicationRuleRequest) | yes | Request body |


This API returns response of upsert of DpApplicationRules in mongo database.

*Returned Response:*




[DPApplicationRuleResponse](#DPApplicationRuleResponse)

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
    "type": null,
    "value": null,
    "message": null
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
    "type": null,
    "value": null,
    "message": null
  }
}
```
</details>









---



### Schemas

 
 
 #### [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelType | String |  no  |  |
 | channelId | String |  no  |  |
 | serviceabilityType | String |  no  |  |

---


 
 
 #### [ServiceabilityErrorResponse](#ServiceabilityErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | type | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [ApplicationServiceabilityConfigResponse](#ApplicationServiceabilityConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)? |  yes  |  |
 | error | [ServiceabilityErrorResponse](#ServiceabilityErrorResponse)? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [EntityRegionView_Request](#EntityRegionView_Request)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | parentId | ArrayList<String>? |  yes  |  |
 | subType | ArrayList<String> |  no  |  |

---


 
 
 #### [EntityRegionView_Items](#EntityRegionView_Items)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | subType | String |  no  |  |
 | uid | String |  no  |  |

---


 
 
 #### [EntityRegionView_page](#EntityRegionView_page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Int |  no  |  |
 | size | Int |  no  |  |
 | itemTotal | Int |  no  |  |
 | hasNext | Boolean |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [EntityRegionView_Error](#EntityRegionView_Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [EntityRegionView_Response](#EntityRegionView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[EntityRegionView_Items](#EntityRegionView_Items)> |  no  |  |
 | page | [EntityRegionView_page](#EntityRegionView_page) |  no  |  |
 | error | [EntityRegionView_Error](#EntityRegionView_Error) |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [ZoneDataItem](#ZoneDataItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Int |  no  |  |
 | size | Int |  no  |  |
 | itemTotal | Int |  no  |  |
 | type | String |  no  |  |
 | hasNext | Boolean |  no  |  |

---


 
 
 #### [ListViewChannels](#ListViewChannels)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelType | String |  no  |  |
 | channelId | String |  no  |  |

---


 
 
 #### [ListViewProduct](#ListViewProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Int |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ListViewItems](#ListViewItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | storesCount | Int |  no  |  |
 | channels | [ListViewChannels](#ListViewChannels) |  no  |  |
 | pincodesCount | Int |  no  |  |
 | product | [ListViewProduct](#ListViewProduct) |  no  |  |
 | companyId | Int |  no  |  |
 | isActive | Boolean |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |

---


 
 
 #### [ListViewSummary](#ListViewSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalZones | Int |  no  |  |
 | totalActiveZones | Int |  no  |  |
 | totalPincodesServed | Int |  no  |  |

---


 
 
 #### [ListViewResponse](#ListViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | ArrayList<[ZoneDataItem](#ZoneDataItem)> |  no  |  |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |
 | summary | ArrayList<[ListViewSummary](#ListViewSummary)> |  no  |  |

---


 
 
 #### [CompanyStoreView_PageItems](#CompanyStoreView_PageItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Int |  no  |  |
 | size | Int |  no  |  |
 | itemTotal | Int |  no  |  |
 | hasNext | Boolean |  no  |  |
 | type | String |  no  |  |

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
 | channelType | String |  no  |  |
 | channelId | String |  no  |  |

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
 | state | ArrayList<String>? |  yes  |  |
 | pincode | ArrayList<String>? |  yes  |  |
 | country | String |  no  |  |

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
 | regionType | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | assignmentPreference | String? |  yes  |  |
 | storesCount | Int |  no  |  |
 | pincodesCount | Int |  no  |  |

---


 
 
 #### [GetSingleZoneDataViewResponse](#GetSingleZoneDataViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetZoneDataViewItems](#GetZoneDataViewItems) |  no  |  |

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
 | data | [UpdateZoneData](#UpdateZoneData) |  no  |  |
 | identifier | String |  no  |  |

---


 
 
 #### [ZoneSuccessResponse](#ZoneSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statusCode | Int |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [CreateZoneData](#CreateZoneData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
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


 
 
 #### [ZoneRequest](#ZoneRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [CreateZoneData](#CreateZoneData) |  no  |  |
 | identifier | String |  no  |  |

---


 
 
 #### [ZoneResponse](#ZoneResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | statusCode | Int |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewRequest](#GetZoneFromPincodeViewRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | String |  no  |  |
 | country | String |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewResponse](#GetZoneFromPincodeViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zones | ArrayList<String> |  no  |  |
 | serviceabilityType | String |  no  |  |

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
 | current | Int? |  yes  |  |
 | size | Int? |  yes  |  |
 | itemTotal | Int? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [CreatedByResponse](#CreatedByResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [ModifiedByResponse](#ModifiedByResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |
 | userId | String? |  yes  |  |

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
 | closing | [OpeningClosing](#OpeningClosing)? |  yes  |  |
 | weekday | String? |  yes  |  |
 | opening | [OpeningClosing](#OpeningClosing)? |  yes  |  |

---


 
 
 #### [DocumentsResponse](#DocumentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Boolean? |  yes  |  |
 | legalName | String? |  yes  |  |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |

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
 | mobileNo | [MobileNo](#MobileNo)? |  yes  |  |
 | email | String? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [ContactNumberResponse](#ContactNumberResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | String? |  yes  |  |
 | countryCode | Int? |  yes  |  |

---


 
 
 #### [Dp](#Dp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | internalAccountId | String? |  yes  |  |
 | fmPriority | Int? |  yes  |  |
 | externalAccountId | String? |  yes  |  |
 | lmPriority | Int? |  yes  |  |
 | operations | ArrayList<String>? |  yes  |  |
 | rvpPriority | Int? |  yes  |  |
 | transportMode | String? |  yes  |  |
 | assignDpFromSb | Boolean? |  yes  |  |
 | areaCode | Int? |  yes  |  |
 | paymentMode | String? |  yes  |  |

---


 
 
 #### [LogisticsResponse](#LogisticsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dp | [Dp](#Dp)? |  yes  |  |
 | override | Boolean? |  yes  |  |

---


 
 
 #### [EinvoiceResponse](#EinvoiceResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [EwayBillResponse](#EwayBillResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [GstCredentialsResponse](#GstCredentialsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eInvoice | [EinvoiceResponse](#EinvoiceResponse)? |  yes  |  |
 | eWaybill | [EwayBillResponse](#EwayBillResponse)? |  yes  |  |

---


 
 
 #### [IntegrationTypeResponse](#IntegrationTypeResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | String? |  yes  |  |
 | inventory | String? |  yes  |  |

---


 
 
 #### [ProductReturnConfigResponse](#ProductReturnConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | onSameStore | Boolean? |  yes  |  |

---


 
 
 #### [AddressResponse](#AddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address2 | String? |  yes  |  |
 | pincode | Int? |  yes  |  |
 | address1 | String? |  yes  |  |
 | latitude | Double? |  yes  |  |
 | state | String? |  yes  |  |
 | longitude | Double? |  yes  |  |
 | landmark | String? |  yes  |  |
 | city | String? |  yes  |  |
 | country | String? |  yes  |  |

---


 
 
 #### [ItemResponse](#ItemResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | [CreatedByResponse](#CreatedByResponse)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | subType | String? |  yes  |  |
 | modifiedBy | [ModifiedByResponse](#ModifiedByResponse)? |  yes  |  |
 | name | String? |  yes  |  |
 | warnings | [WarningsResponse](#WarningsResponse)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | timing | ArrayList<[TimmingResponse](#TimmingResponse)>? |  yes  |  |
 | documents | ArrayList<[DocumentsResponse](#DocumentsResponse)>? |  yes  |  |
 | code | String? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | manager | [ManagerResponse](#ManagerResponse)? |  yes  |  |
 | contactNumbers | ArrayList<[ContactNumberResponse](#ContactNumberResponse)>? |  yes  |  |
 | verifiedBy | [ModifiedByResponse](#ModifiedByResponse)? |  yes  |  |
 | logistics | [LogisticsResponse](#LogisticsResponse)? |  yes  |  |
 | uid | Int? |  yes  |  |
 | gstCredentials | [GstCredentialsResponse](#GstCredentialsResponse)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | company | Int? |  yes  |  |
 | displayName | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | integrationType | [IntegrationTypeResponse](#IntegrationTypeResponse)? |  yes  |  |
 | cls | String? |  yes  |  |
 | storeType | String? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | productReturnConfig | [ProductReturnConfigResponse](#ProductReturnConfigResponse)? |  yes  |  |
 | address | [AddressResponse](#AddressResponse)? |  yes  |  |

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
 | ignoredLocations | ArrayList<String> |  no  |  |
 | toPincode | String |  no  |  |
 | articles | ArrayList<HashMap<String,Any>> |  no  |  |
 | identifier | String |  no  |  |
 | configuration | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ReAssignStoreResponse](#ReAssignStoreResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | HashMap<String,Any> |  no  |  |
 | toPincode | String |  no  |  |
 | articles | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [ApplicationCompanyDpViewRequest](#ApplicationCompanyDpViewRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dpId | String? |  yes  |  |

---


 
 
 #### [ApplicationCompanyDpViewResponse](#ApplicationCompanyDpViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | applicationId | String |  no  |  |
 | companyId | Int |  no  |  |
 | courierPartnerId | Int? |  yes  |  |
 | success | Boolean |  no  |  |

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
 | error | Any? |  yes  |  |
 | statusCode | String? |  yes  |  |
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
 | current | Int |  no  |  |
 | size | Int |  no  |  |
 | itemTotal | Int |  no  |  |
 | hasNext | Boolean |  no  |  |
 | type | String |  no  |  |

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


 
 
 #### [BulkRegionJobSerializer](#BulkRegionJobSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryIsoCode | String? |  yes  |  |
 | fileUrl | String |  no  |  |
 | action | String |  no  |  |
 | batchId | String |  no  |  |
 | jobAction | String |  no  |  |

---


 
 
 #### [PostBulkRegionJobResponse](#PostBulkRegionJobResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eventEmitted | Boolean |  no  |  |
 | response | Boolean |  no  |  |
 | message | String |  no  |  |
 | batchId | String |  no  |  |

---


 
 
 #### [CSVFileRecord](#CSVFileRecord)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | planId | Int? |  yes  |  |
 | error | ArrayList<String>? |  yes  |  |
 | minTat | Int? |  yes  |  |
 | toRegion | String? |  yes  |  |
 | maxTat | Int? |  yes  |  |
 | regionType | String? |  yes  |  |
 | isError | Boolean? |  yes  |  |
 | dpId | Int? |  yes  |  |
 | fromRegion | String? |  yes  |  |
 | sNo | Int? |  yes  |  |
 | tatType | String? |  yes  |  |
 | country | String? |  yes  |  |

---


 
 
 #### [BulkRecordError](#BulkRecordError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isError | Boolean |  no  |  |
 | error | ArrayList<String> |  no  |  |

---


 
 
 #### [BulkRegionData](#BulkRegionData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | successCount | Int |  no  |  |
 | totalRec | Int |  no  |  |
 | createdOn | String? |  yes  |  |
 | failedCount | Int |  no  |  |
 | stage | String |  no  |  |
 | filePath | String |  no  |  |
 | failedRec | ArrayList<[CSVFileRecord](#CSVFileRecord)>? |  yes  |  |
 | batchId | String |  no  |  |
 | error | [BulkRecordError](#BulkRecordError)? |  yes  |  |
 | action | String |  no  |  |

---


 
 
 #### [GetBulkRegionJobResponse](#GetBulkRegionJobResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[BulkRegionData](#BulkRegionData)> |  no  |  |
 | batchId | String? |  yes  |  |
 | currentPageNumber | Int? |  yes  |  |

---


 
 
 #### [Dp1](#Dp1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | planId | String |  no  |  |
 | name | String |  no  |  |
 | isSelfShip | Boolean |  no  |  |
 | planRules | HashMap<String,Any> |  no  |  |
 | accountId | String |  no  |  |
 | stage | String |  no  |  |
 | dpId | String |  no  |  |

---


 
 
 #### [CompanyDpAccountRequest](#CompanyDpAccountRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[Dp1](#Dp1)> |  no  |  |

---


 
 
 #### [CompanyDpAccountResponse](#CompanyDpAccountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | type | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [DpAccountFailureResponse](#DpAccountFailureResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | ArrayList<[ErrorResponse](#ErrorResponse)> |  no  |  |
 | statusCode | Int |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | total | Int |  no  |  |
 | current | Int |  no  |  |
 | hasPrevious | Boolean |  no  |  |
 | size | Int |  no  |  |
 | itemTotal | Int |  no  |  |
 | hasNext | Boolean |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [CompanyDpAccountListResponse](#CompanyDpAccountListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[Dp1](#Dp1)> |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [DpSchemaInRuleListing](#DpSchemaInRuleListing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | planId | String |  no  |  |
 | priority | Int |  no  |  |
 | name | String |  no  |  |
 | isSelfShip | Boolean |  no  |  |
 | planRules | HashMap<String,Any> |  no  |  |
 | accountId | String |  no  |  |
 | stage | String |  no  |  |
 | dpId | String |  no  |  |

---


 
 
 #### [DpRule](#DpRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | conditions | ArrayList<HashMap<String,Any>> |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | dpIds | HashMap<String,[DpSchemaInRuleListing](#DpSchemaInRuleListing)> |  no  |  |

---


 
 
 #### [DpRuleSuccessResponse](#DpRuleSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [DpRule](#DpRule) |  no  |  |
 | statusCode | Int |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [FailureResponse](#FailureResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | ArrayList<[ErrorResponse](#ErrorResponse)> |  no  |  |
 | statusCode | Int |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [DpRulesUpdateRequest](#DpRulesUpdateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | conditions | ArrayList<HashMap<String,Any>> |  no  |  |
 | name | String |  no  |  |
 | dpIds | HashMap<String,HashMap<String,Any>> |  no  |  |

---


 
 
 #### [DpRuleResponse](#DpRuleResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | HashMap<String,Any>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedBy | HashMap<String,Any>? |  yes  |  |
 | name | String |  no  |  |
 | uid | String |  no  |  |
 | conditions | ArrayList<String> |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | companyId | Int |  no  |  |
 | dpIds | HashMap<String,Any> |  no  |  |

---


 
 
 #### [DpRuleUpdateSuccessResponse](#DpRuleUpdateSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [DpRuleResponse](#DpRuleResponse) |  no  |  |
 | statusCode | Int |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [DpIds](#DpIds)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean |  no  |  |
 | priority | Int |  no  |  |
 | meta | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [DpRuleRequest](#DpRuleRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | conditions | ArrayList<HashMap<String,Any>> |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | dpIds | HashMap<String,[DpIds](#DpIds)> |  no  |  |

---


 
 
 #### [DpMultipleRuleSuccessResponse](#DpMultipleRuleSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page) |  no  |  |
 | items | ArrayList<[DpRule](#DpRule)> |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [DPCompanyRuleResponse](#DPCompanyRuleResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[DpRuleResponse](#DpRuleResponse)> |  no  |  |
 | statusCode | Int |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [DPCompanyRuleRequest](#DPCompanyRuleRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleIds | ArrayList<String> |  no  |  |

---


 
 
 #### [DPApplicationRuleResponse](#DPApplicationRuleResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[DpRuleResponse](#DpRuleResponse)> |  no  |  |
 | statusCode | Boolean |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [DPApplicationRuleRequest](#DPApplicationRuleRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shippingRules | ArrayList<String> |  no  |  |

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
 | selfShip | [SelfShipResponse](#SelfShipResponse)? |  yes  |  |

---


 
 
 #### [ApplicationSelfShipConfigResponse](#ApplicationSelfShipConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [ApplicationSelfShipConfig](#ApplicationSelfShipConfig)? |  yes  |  |
 | error | [ServiceabilityErrorResponse](#ServiceabilityErrorResponse)? |  yes  |  |
 | success | Boolean |  no  |  |

---



