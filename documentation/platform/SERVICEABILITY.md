



##### [Back to Platform docs](./README.md)

## Serviceability Methods
Logistics Configuration API's allows you to configure zone, application logistics and many more useful features. 
* [getApplicationServiceability](#getapplicationserviceability)
* [getEntityRegionView](#getentityregionview)
* [getListView](#getlistview)
* [getCompanyStoreView](#getcompanystoreview)
* [updateZoneControllerView](#updatezonecontrollerview)
* [getZoneDataView](#getzonedataview)
* [upsertZoneControllerView](#upsertzonecontrollerview)
* [getZoneFromPincode](#getzonefrompincode)



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


### upsertZoneControllerView
Insertion of zone in database.




```kotlin
client.serviceability.upsertZoneControllerView(body: body).safeAwait{ response, error->
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


This API returns response of insertion of zone in mongo database.<br>Correction- `zone_id` in the path must be removed.<br> path is `/service/platform/logistics-internal/v1.0/company/{company_id}/zone/`

*Returned Response:*




[ZoneResponse](#ZoneResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getZoneFromPincode
GET zone from the Pincode.




```kotlin
client.application("<APPLICATION_ID>").serviceability.getZoneFromPincode(body: body).safeAwait{ response, error->
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



### Schemas

 
 
 #### [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelId | String |  no  |  |
 | serviceabilityType | String |  no  |  |
 | channelType | String |  no  |  |

---


 
 
 #### [ServiceabilityrErrorResponse](#ServiceabilityrErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | message | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [ApplicationServiceabilityConfigResponse](#ApplicationServiceabilityConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | data | [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)? |  yes  |  |
 | error | [ServiceabilityrErrorResponse](#ServiceabilityrErrorResponse)? |  yes  |  |

---


 
 
 #### [EntityRegionView_Request](#EntityRegionView_Request)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subType | ArrayList<String> |  no  |  |
 | parentId | ArrayList<String>? |  yes  |  |

---


 
 
 #### [EntityRegionView_Items](#EntityRegionView_Items)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subType | String |  no  |  |
 | name | String |  no  |  |
 | uid | String |  no  |  |

---


 
 
 #### [EntityRegionView_page](#EntityRegionView_page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemTotal | Int |  no  |  |
 | current | Int |  no  |  |
 | type | String |  no  |  |
 | size | Int |  no  |  |
 | hasNext | Boolean |  no  |  |

---


 
 
 #### [EntityRegionView_Error](#EntityRegionView_Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | message | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [EntityRegionView_Response](#EntityRegionView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | data | ArrayList<[EntityRegionView_Items](#EntityRegionView_Items)> |  no  |  |
 | page | [EntityRegionView_page](#EntityRegionView_page) |  no  |  |
 | error | [EntityRegionView_Error](#EntityRegionView_Error) |  no  |  |

---


 
 
 #### [ListViewProduct](#ListViewProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | count | Int |  no  |  |

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
 | isActive | Boolean |  no  |  |
 | product | [ListViewProduct](#ListViewProduct) |  no  |  |
 | companyId | Int |  no  |  |
 | slug | String |  no  |  |
 | channels | [ListViewChannels](#ListViewChannels) |  no  |  |
 | pincodesCount | Int |  no  |  |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | storesCount | Int |  no  |  |

---


 
 
 #### [ZoneDataItem](#ZoneDataItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemTotal | Int |  no  |  |
 | current | Int |  no  |  |
 | type | String |  no  |  |
 | size | Int |  no  |  |
 | hasNext | Boolean |  no  |  |

---


 
 
 #### [ListViewSummary](#ListViewSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalActiveZones | Int |  no  |  |
 | totalPincodesServed | Int |  no  |  |
 | totalZones | Int |  no  |  |

---


 
 
 #### [ListViewResponse](#ListViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |
 | page | ArrayList<[ZoneDataItem](#ZoneDataItem)> |  no  |  |
 | summary | ArrayList<[ListViewSummary](#ListViewSummary)> |  no  |  |

---


 
 
 #### [CompanyStoreView_PageItems](#CompanyStoreView_PageItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemTotal | Int |  no  |  |
 | current | Int |  no  |  |
 | type | String |  no  |  |
 | size | Int |  no  |  |
 | hasNext | Boolean |  no  |  |

---


 
 
 #### [CompanyStoreView_Response](#CompanyStoreView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | page | ArrayList<[CompanyStoreView_PageItems](#CompanyStoreView_PageItems)> |  no  |  |

---


 
 
 #### [ZoneProductTypes](#ZoneProductTypes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |

---


 
 
 #### [GetZoneDataViewChannels](#GetZoneDataViewChannels)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelId | String |  no  |  |
 | channelType | String |  no  |  |

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
 | isActive | Boolean |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | companyId | Int |  no  |  |
 | slug | String |  no  |  |
 | regionType | String |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |

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
 | isActive | Boolean |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | companyId | Int |  no  |  |
 | slug | String |  no  |  |
 | regionType | String |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | pincodesCount | Int |  no  |  |
 | zoneId | String |  no  |  |
 | storesCount | Int |  no  |  |
 | name | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |

---


 
 
 #### [GetSingleZoneDataViewResponse](#GetSingleZoneDataViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetZoneDataViewItems](#GetZoneDataViewItems) |  no  |  |

---


 
 
 #### [CreateZoneData](#CreateZoneData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | storeIds | ArrayList<Int> |  no  |  |
 | companyId | Int |  no  |  |
 | slug | String |  no  |  |
 | regionType | String |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | name | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |

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
 | success | Boolean |  no  |  |
 | zoneId | String |  no  |  |
 | statusCode | Int |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewRequest](#GetZoneFromPincodeViewRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewResponse](#GetZoneFromPincodeViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | serviceabilityType | String |  no  |  |
 | zones | ArrayList<String> |  no  |  |

---



