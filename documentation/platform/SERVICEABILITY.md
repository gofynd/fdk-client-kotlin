



##### [Back to Platform docs](./README.md)

## Serviceability Methods
Logistics Configuration API's allows you to configure zone, application logistics and many more useful features. 
* [getApplicationServiceability](#getapplicationserviceability)
* [getEntityRegionView](#getentityregionview)
* [getListView](#getlistview)
* [getCompanyStoreView](#getcompanystoreview)
* [updateZoneControllerView](#updatezonecontrollerview)
* [getZoneDataView](#getzonedataview)
* [createZone](#createzone)
* [getZonesFromApplicationIdView](#getzonesfromapplicationidview)
* [getZoneFromPincodeView](#getzonefrompincodeview)
* [getStore](#getstore)
* [getAllStores](#getallstores)
* [updatePincodeMopView](#updatepincodemopview)
* [updatePincodeBulkView](#updatepincodebulkview)
* [updatePincodeCoDListing](#updatepincodecodlisting)
* [updatePincodeAuditHistory](#updatepincodeaudithistory)



## Methods with example and description


### getApplicationServiceability
Zone configuration of application.




```kotlin
client.application("<APPLICATION_ID>").serviceability.getApplicationServiceability().safeAwait{ response, error->
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
client.serviceability.getEntityRegionView(body: body).safeAwait{ response, error->
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
client.serviceability.getListView(pageNumber: pageNumber, pageSize: pageSize, name: name, isActive: isActive, channelIds: channelIds).safeAwait{ response, error->
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
client.serviceability.getCompanyStoreView().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






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


### updateZoneControllerView
Updation of zone collections in database.




```kotlin
client.serviceability.updateZoneControllerView(zoneId: zoneId, body: body).safeAwait{ response, error->
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


### getZoneDataView
Zone Data View of application.




```kotlin
client.serviceability.getZoneDataView(zoneId: zoneId).safeAwait{ response, error->
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


### createZone
Insertion of zone in database.




```kotlin
client.serviceability.createZone(body: body).safeAwait{ response, error->
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


This API returns response of insertion of zone in mongo database.<br>Correction- `zone_id` in the path must be removed.<br> path is `/service/platform/logistics-internal/v1.0/company/{}/zone/`

*Returned Response:*




[ZoneResponse](#ZoneResponse)

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
client.application("<APPLICATION_ID>").serviceability.getZonesFromApplicationIdView(pageNo: pageNo, pageSize: pageSize, zoneId: zoneId, q: q).safeAwait{ response, error->
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


### getZoneFromPincodeView
GET zone from the Pincode.




```kotlin
client.application("<APPLICATION_ID>").serviceability.getZoneFromPincodeView(body: body).safeAwait{ response, error->
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


### getStore
GET stores data




```kotlin
client.serviceability.getStore(storeUid: storeUid).safeAwait{ response, error->
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
client.serviceability.getAllStores().safeAwait{ response, error->
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


### updatePincodeMopView
PincodeView update of MOP.




```kotlin
client.application("<APPLICATION_ID>").serviceability.updatePincodeMopView(body: body).safeAwait{ response, error->
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
client.application("<APPLICATION_ID>").serviceability.updatePincodeBulkView(body: body).safeAwait{ response, error->
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
client.application("<APPLICATION_ID>").serviceability.updatePincodeCoDListing(body: body).safeAwait{ response, error->
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
client.application("<APPLICATION_ID>").serviceability.updatePincodeAuditHistory(body: body).safeAwait{ response, error->
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



### Schemas

 
 
 #### [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | serviceabilityType | String |  no  |  |
 | channelType | String |  no  |  |
 | channelId | String |  no  |  |

---


 
 
 #### [ServiceabilityrErrorResponse](#ServiceabilityrErrorResponse)

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
 | success | Boolean |  no  |  |
 | error | [ServiceabilityrErrorResponse](#ServiceabilityrErrorResponse)? |  yes  |  |

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


 
 
 #### [EntityRegionView_Error](#EntityRegionView_Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [EntityRegionView_page](#EntityRegionView_page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | Int |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Int |  no  |  |
 | current | Int |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [EntityRegionView_Response](#EntityRegionView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[EntityRegionView_Items](#EntityRegionView_Items)> |  no  |  |
 | success | Boolean |  no  |  |
 | error | [EntityRegionView_Error](#EntityRegionView_Error) |  no  |  |
 | page | [EntityRegionView_page](#EntityRegionView_page) |  no  |  |

---


 
 
 #### [ListViewSummary](#ListViewSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalZones | Int |  no  |  |
 | totalActiveZones | Int |  no  |  |
 | totalPincodesServed | Int |  no  |  |

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
 | channelType | String |  no  |  |
 | channelId | String |  no  |  |

---


 
 
 #### [ListViewItems](#ListViewItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | product | [ListViewProduct](#ListViewProduct) |  no  |  |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | pincodesCount | Int |  no  |  |
 | channels | [ListViewChannels](#ListViewChannels) |  no  |  |
 | companyId | Int |  no  |  |
 | storesCount | Int |  no  |  |

---


 
 
 #### [ZoneDataItem](#ZoneDataItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | Int |  no  |  |
 | hasNext | Boolean |  no  |  |
 | type | String |  no  |  |
 | itemTotal | Int |  no  |  |
 | current | Int |  no  |  |

---


 
 
 #### [ListViewResponse](#ListViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | summary | ArrayList<[ListViewSummary](#ListViewSummary)> |  no  |  |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |
 | page | ArrayList<[ZoneDataItem](#ZoneDataItem)> |  no  |  |

---


 
 
 #### [CompanyStoreView_PageItems](#CompanyStoreView_PageItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | Int |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Int |  no  |  |
 | current | Int |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [CompanyStoreView_Response](#CompanyStoreView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | page | ArrayList<[CompanyStoreView_PageItems](#CompanyStoreView_PageItems)> |  no  |  |

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
 | tags | ArrayList<String> |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ZoneMappingType](#ZoneMappingType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | ArrayList<String>? |  yes  |  |
 | state | ArrayList<String>? |  yes  |  |
 | country | String |  no  |  |

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
 | success | Boolean |  no  |  |
 | statusCode | Int |  no  |  |

---


 
 
 #### [GetZoneDataViewItems](#GetZoneDataViewItems)

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
 | storesCount | Int |  no  |  |
 | pincodesCount | Int |  no  |  |

---


 
 
 #### [GetSingleZoneDataViewResponse](#GetSingleZoneDataViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetZoneDataViewItems](#GetZoneDataViewItems) |  no  |  |

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
 | success | Boolean |  no  |  |
 | statusCode | Int |  no  |  |

---


 
 
 #### [GetZoneFromApplicationIdViewResponse](#GetZoneFromApplicationIdViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |
 | page | ArrayList<[ZoneDataItem](#ZoneDataItem)> |  no  |  |

---


 
 
 #### [ServiceabilityErrorResponse](#ServiceabilityErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | type | String |  no  |  |
 | value | String |  no  |  |

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
 | serviceabilityType | String |  no  |  |
 | zones | ArrayList<String> |  no  |  |

---


 
 
 #### [ProductReturnConfigResponse](#ProductReturnConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | onSameStore | Boolean? |  yes  |  |

---


 
 
 #### [ModifiedByResponse](#ModifiedByResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [MobileNo](#MobileNo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | Int? |  yes  |  |
 | number | String? |  yes  |  |

---


 
 
 #### [ManagerResponse](#ManagerResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | email | String? |  yes  |  |
 | mobileNo | [MobileNo](#MobileNo)? |  yes  |  |

---


 
 
 #### [AddressResponse](#AddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address1 | String? |  yes  |  |
 | latitude | Double? |  yes  |  |
 | country | String? |  yes  |  |
 | city | String? |  yes  |  |
 | pincode | Int? |  yes  |  |
 | longitude | Double? |  yes  |  |
 | address2 | String? |  yes  |  |
 | state | String? |  yes  |  |
 | landmark | String? |  yes  |  |

---


 
 
 #### [CreatedByResponse](#CreatedByResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [IntegrationTypeResponse](#IntegrationTypeResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | String? |  yes  |  |
 | inventory | String? |  yes  |  |

---


 
 
 #### [DocumentsResponse](#DocumentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | legalName | String? |  yes  |  |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |
 | verified | Boolean? |  yes  |  |

---


 
 
 #### [WarningsResponse](#WarningsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeAddress | String? |  yes  |  |

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


 
 
 #### [Dp](#Dp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentMode | String? |  yes  |  |
 | rvpPriority | Int? |  yes  |  |
 | assignDpFromSb | Boolean? |  yes  |  |
 | fmPriority | Int? |  yes  |  |
 | transportMode | String? |  yes  |  |
 | internalAccountId | String? |  yes  |  |
 | areaCode | Int? |  yes  |  |
 | operations | ArrayList<String>? |  yes  |  |
 | lmPriority | Int? |  yes  |  |
 | externalAccountId | String? |  yes  |  |

---


 
 
 #### [LogisticsResponse](#LogisticsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | override | Boolean? |  yes  |  |
 | dp | [Dp](#Dp)? |  yes  |  |

---


 
 
 #### [ContactNumberResponse](#ContactNumberResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | Int? |  yes  |  |
 | number | String? |  yes  |  |

---


 
 
 #### [OpeningClosing](#OpeningClosing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hour | Int? |  yes  |  |
 | minute | Int? |  yes  |  |

---


 
 
 #### [TimmingResponse](#TimmingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | weekday | String? |  yes  |  |
 | closing | [OpeningClosing](#OpeningClosing)? |  yes  |  |
 | opening | [OpeningClosing](#OpeningClosing)? |  yes  |  |
 | open | Boolean? |  yes  |  |

---


 
 
 #### [ItemResponse](#ItemResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayName | String? |  yes  |  |
 | productReturnConfig | [ProductReturnConfigResponse](#ProductReturnConfigResponse)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | modifiedBy | [ModifiedByResponse](#ModifiedByResponse)? |  yes  |  |
 | code | String? |  yes  |  |
 | cls | String? |  yes  |  |
 | manager | [ManagerResponse](#ManagerResponse)? |  yes  |  |
 | stage | String? |  yes  |  |
 | address | [AddressResponse](#AddressResponse)? |  yes  |  |
 | company | Int? |  yes  |  |
 | storeType | String? |  yes  |  |
 | createdBy | [CreatedByResponse](#CreatedByResponse)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | integrationType | [IntegrationTypeResponse](#IntegrationTypeResponse)? |  yes  |  |
 | documents | ArrayList<[DocumentsResponse](#DocumentsResponse)>? |  yes  |  |
 | warnings | [WarningsResponse](#WarningsResponse)? |  yes  |  |
 | uid | Int? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | verifiedBy | [ModifiedByResponse](#ModifiedByResponse)? |  yes  |  |
 | subType | String? |  yes  |  |
 | gstCredentials | [GstCredentialsResponse](#GstCredentialsResponse)? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | logistics | [LogisticsResponse](#LogisticsResponse)? |  yes  |  |
 | name | String? |  yes  |  |
 | contactNumbers | ArrayList<[ContactNumberResponse](#ContactNumberResponse)>? |  yes  |  |
 | timing | ArrayList<[TimmingResponse](#TimmingResponse)>? |  yes  |  |

---


 
 
 #### [PageResponse](#PageResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | Int? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | itemTotal | Int? |  yes  |  |
 | current | Int? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [GetStoresViewResponse](#GetStoresViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ItemResponse](#ItemResponse)>? |  yes  |  |
 | page | [PageResponse](#PageResponse) |  no  |  |

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
 | currentPageNumber | Int? |  yes  |  |
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
 | currentPageNumber | Int |  no  |  |
 | size | Int |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Int |  no  |  |
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



