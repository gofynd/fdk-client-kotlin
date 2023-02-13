



##### [Back to Platform docs](./README.md)

## OrderManage Methods
Handles all platform order and shipment api(s)
* [invalidateShipmentCache](#invalidateshipmentcache)
* [reassignLocation](#reassignlocation)
* [updateShipmentLock](#updateshipmentlock)
* [getAnnouncements](#getannouncements)
* [updateAddress](#updateaddress)
* [click2Call](#click2call)
* [updateShipmentStatus](#updateshipmentstatus)
* [processManifest](#processmanifest)
* [dispatchManifest](#dispatchmanifest)
* [getRoleBasedActions](#getrolebasedactions)
* [getShipmentHistory](#getshipmenthistory)
* [sendSmsNinja](#sendsmsninja)
* [platformManualAssignDPToShipment](#platformmanualassigndptoshipment)
* [updatePackagingDimensions](#updatepackagingdimensions)
* [createOrder](#createorder)
* [getChannelConfig](#getchannelconfig)
* [createChannelConfig](#createchannelconfig)
* [uploadConsent](#uploadconsent)
* [orderUpdate](#orderupdate)
* [checkOrderStatus](#checkorderstatus)
* [sendSmsNinjaPlatform](#sendsmsninjaplatform)



## Methods with example and description


### invalidateShipmentCache





```kotlin
client.ordermanage.invalidateShipmentCache(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [InvalidateShipmentCachePayload](#InvalidateShipmentCachePayload) | yes | Request body |


Invalidate shipment Cache

*Returned Response:*




[InvalidateShipmentCacheResponse](#InvalidateShipmentCacheResponse)

Successfully updated shipment cache!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### reassignLocation





```kotlin
client.ordermanage.reassignLocation(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [StoreReassign](#StoreReassign) | yes | Request body |


Reassign Location

*Returned Response:*




[StoreReassignResponse](#StoreReassignResponse)

Successfully reassigned location!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateShipmentLock





```kotlin
client.ordermanage.updateShipmentLock(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UpdateShipmentLockPayload](#UpdateShipmentLockPayload) | yes | Request body |


update shipment lock

*Returned Response:*




[UpdateShipmentLockResponse](#UpdateShipmentLockResponse)

Successfully updated shipment cache!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getAnnouncements





```kotlin
client.ordermanage.getAnnouncements(date: date).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| date | String? | no |  |  





*Returned Response:*




[AnnouncementsResponse](#AnnouncementsResponse)

Announcements retrieved successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateAddress





```kotlin
client.ordermanage.updateAddress(shipmentId: shipmentId, name: name, address: address, addressType: addressType, pincode: pincode, phone: phone, email: email, landmark: landmark, addressCategory: addressCategory, city: city, state: state, country: country).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| shipmentId | String | yes |  |   
| name | String? | no |  |   
| address | String? | no |  |   
| addressType | String? | no |  |   
| pincode | String? | no |  |   
| phone | String? | no |  |   
| email | String? | no |  |   
| landmark | String? | no |  |   
| addressCategory | String | yes |  |   
| city | String? | no |  |   
| state | String? | no |  |   
| country | String? | no |  |  





*Returned Response:*




[BaseResponse](#BaseResponse)

Update Address will be processed!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### click2Call





```kotlin
client.ordermanage.click2Call(caller: caller, receiver: receiver, bagId: bagId, callingTo: callingTo, callerId: callerId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| caller | String | yes |  |   
| receiver | String | yes |  |   
| bagId | String | yes |  |   
| callingTo | String? | no |  |   
| callerId | String? | no |  |  





*Returned Response:*




[Click2CallResponse](#Click2CallResponse)

Process call on request!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateShipmentStatus





```kotlin
client.ordermanage.updateShipmentStatus(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UpdateShipmentStatusRequest](#UpdateShipmentStatusRequest) | yes | Request body |


Update shipment status

*Returned Response:*




[UpdateShipmentStatusResponseBody](#UpdateShipmentStatusResponseBody)

Successfully reassigned location!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### processManifest





```kotlin
client.ordermanage.processManifest(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateOrderPayload](#CreateOrderPayload) | yes | Request body |




*Returned Response:*




[CreateOrderResponse](#CreateOrderResponse)

Manifest will be processed!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### dispatchManifest





```kotlin
client.ordermanage.dispatchManifest(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [DispatchManifest](#DispatchManifest) | yes | Request body |




*Returned Response:*




[SuccessResponse](#SuccessResponse)

Shipment Dispatched mapped with manifest!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getRoleBasedActions





```kotlin
client.ordermanage.getRoleBasedActions().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```








*Returned Response:*




[GetActionsResponse](#GetActionsResponse)

You will get an array of actions allowed for that particular user based on their role




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getShipmentHistory





```kotlin
client.ordermanage.getShipmentHistory(shipmentId: shipmentId, bagId: bagId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| shipmentId | Int? | no |  |   
| bagId | Int? | no |  |  





*Returned Response:*




[ShipmentHistoryResponse](#ShipmentHistoryResponse)

It shows the journey of the shipment!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "activity_history": [
    {
      "message": {
        "message": "Bag status changed to pending",
        "store_id": 10,
        "store_code": "SF94",
        "store_name": "shub",
        "reason": {},
        "type": "activity_status"
      },
      "createdat": "01 Apr 2022, 17:57:PM",
      "user": "system",
      "type": "activity_status",
      "l1_detail": null,
      "l2_detail": null,
      "l3_detail": null,
      "ticket_id": null,
      "ticket_url": null
    },
    {
      "message": {
        "message": "Bag status changed to placed",
        "store_id": 10,
        "store_code": "SF94",
        "store_name": "shub",
        "reason": {},
        "type": "activity_status"
      },
      "createdat": "01 Apr 2022, 17:57:PM",
      "user": "system",
      "type": "activity_status",
      "l1_detail": null,
      "l2_detail": null,
      "l3_detail": null,
      "ticket_id": null,
      "ticket_url": null
    }
  ]
}
```
</details>









---


### sendSmsNinja





```kotlin
client.ordermanage.sendSmsNinja(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [SendSmsPayload](#SendSmsPayload) | yes | Request body |




*Returned Response:*




[OrderStatusResult](#OrderStatusResult)

Sms Sent successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### platformManualAssignDPToShipment





```kotlin
client.ordermanage.platformManualAssignDPToShipment(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ManualAssignDPToShipment](#ManualAssignDPToShipment) | yes | Request body |




*Returned Response:*




[ManualAssignDPToShipmentResponse](#ManualAssignDPToShipmentResponse)

DP Assigned for the given shipment Ids.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updatePackagingDimensions





```kotlin
client.ordermanage.updatePackagingDimensions(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateOrderPayload](#CreateOrderPayload) | yes | Request body |




*Returned Response:*




[CreateOrderResponse](#CreateOrderResponse)

Manifest will be processed!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createOrder





```kotlin
client.ordermanage.createOrder(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateOrderAPI](#CreateOrderAPI) | yes | Request body |




*Returned Response:*




[CreateOrderResponse](#CreateOrderResponse)

Successfully created an order!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getChannelConfig





```kotlin
client.ordermanage.getChannelConfig().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






getChannelConfig

*Returned Response:*




[CreateChannelConfigData](#CreateChannelConfigData)

Successfully created the config data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "config_data": {
    "payment_info": {
      "payment_methods": [
        {
          "mode": "COD",
          "collect_by": "gringotts",
          "refund_by": "gringotts"
        }
      ],
      "source": "fynd",
      "mode_of_payment": "COD"
    },
    "dp_configuration": {
      "shipping_by": "fynd"
    },
    "logo_url": {},
    "location_reassignment": false,
    "lock_states": [
      "bag_packed"
    ],
    "shipment_assignment": "16703096324891701814"
  }
}
```
</details>









---


### createChannelConfig





```kotlin
client.ordermanage.createChannelConfig(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateChannelConfigData](#CreateChannelConfigData) | yes | Request body |


createChannelConfig

*Returned Response:*




[CreateChannelConfigResponse](#CreateChannelConfigResponse)

Successfully updateShipmentStatus!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": {
    "acknowledged": true,
    "is_upserted": false,
    "is_inserted": false
  }
}
```
</details>









---


### uploadConsent





```kotlin
client.ordermanage.uploadConsent(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadConsent](#UploadConsent) | yes | Request body |




*Returned Response:*




[SuccessResponse](#SuccessResponse)

Successful Manifest upload!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### orderUpdate





```kotlin
client.ordermanage.orderUpdate(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [PlatformOrderUpdate](#PlatformOrderUpdate) | yes | Request body |




*Returned Response:*




[ResponseDetail](#ResponseDetail)

We are processing the order!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### checkOrderStatus





```kotlin
client.ordermanage.checkOrderStatus(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [OrderStatus](#OrderStatus) | yes | Request body |




*Returned Response:*




[OrderStatusResult](#OrderStatusResult)

Order Status retrieved successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### sendSmsNinjaPlatform





```kotlin
client.ordermanage.sendSmsNinjaPlatform().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```








*Returned Response:*




[OrderStatusResult](#OrderStatusResult)

Sms Sent successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [InvalidateShipmentCachePayload](#InvalidateShipmentCachePayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentIds | ArrayList<String> |  no  |  |

---


 
 
 #### [InvalidateShipmentCacheNestedResponse](#InvalidateShipmentCacheNestedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentId | String? |  yes  |  |
 | error | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [InvalidateShipmentCacheResponse](#InvalidateShipmentCacheResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | response | ArrayList<[InvalidateShipmentCacheNestedResponse](#InvalidateShipmentCacheNestedResponse)>? |  yes  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | errorTrace | String? |  yes  |  |
 | status | Int |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [StoreReassign](#StoreReassign)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeId | Int |  no  |  |
 | affiliateBagId | String? |  yes  |  |
 | itemId | String? |  yes  |  |
 | bagId | Int? |  yes  |  |
 | fyndOrderId | String? |  yes  |  |
 | mongoArticleId | String? |  yes  |  |
 | reasonIds | ArrayList<Int>? |  yes  |  |
 | setId | String? |  yes  |  |
 | affiliateId | String? |  yes  |  |
 | affiliateOrderId | String? |  yes  |  |

---


 
 
 #### [StoreReassignResponse](#StoreReassignResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [Entities](#Entities)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateBagId | String? |  yes  |  |
 | affiliateShipmentId | String? |  yes  |  |
 | reasonText | String |  no  |  |
 | id | String? |  yes  |  |
 | affiliateId | String? |  yes  |  |
 | affiliateOrderId | String? |  yes  |  |

---


 
 
 #### [UpdateShipmentLockPayload](#UpdateShipmentLockPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityType | String |  no  |  |
 | action | String |  no  |  |
 | actionType | String |  no  |  |
 | entities | ArrayList<[Entities](#Entities)> |  no  |  |

---


 
 
 #### [Bags](#Bags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateBagId | String? |  yes  |  |
 | affiliateOrderId | String? |  yes  |  |
 | isLocked | Boolean? |  yes  |  |
 | bagId | Int? |  yes  |  |

---


 
 
 #### [OriginalFilter](#OriginalFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateShipmentId | String? |  yes  |  |
 | affiliateId | String? |  yes  |  |

---


 
 
 #### [CheckResponse](#CheckResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bags | ArrayList<[Bags](#Bags)>? |  yes  |  |
 | isBagLocked | Boolean? |  yes  |  |
 | isShipmentLocked | Boolean? |  yes  |  |
 | status | String? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | affiliateShipmentId | String? |  yes  |  |
 | originalFilter | [OriginalFilter](#OriginalFilter)? |  yes  |  |
 | lockStatus | Boolean? |  yes  |  |
 | affiliateId | String? |  yes  |  |

---


 
 
 #### [UpdateShipmentLockResponse](#UpdateShipmentLockResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | checkResponse | ArrayList<[CheckResponse](#CheckResponse)>? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [AnnouncementResponse](#AnnouncementResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logoUrl | String? |  yes  |  |
 | description | String? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | toDatetime | String? |  yes  |  |
 | platformId | String? |  yes  |  |
 | fromDatetime | String? |  yes  |  |
 | title | String? |  yes  |  |
 | id | Int |  no  |  |
 | platformName | String? |  yes  |  |

---


 
 
 #### [AnnouncementsResponse](#AnnouncementsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | announcements | ArrayList<[AnnouncementResponse](#AnnouncementResponse)>? |  yes  |  |

---


 
 
 #### [BaseResponse](#BaseResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [Click2CallResponse](#Click2CallResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | callId | String |  no  |  |
 | status | Boolean |  no  |  |

---


 
 
 #### [ProductsDataUpdatesFilters](#ProductsDataUpdatesFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lineNumber | Int? |  yes  |  |
 | identifier | String? |  yes  |  |

---


 
 
 #### [ProductsDataUpdates](#ProductsDataUpdates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | HashMap<String,Any>? |  yes  |  |
 | filters | ArrayList<[ProductsDataUpdatesFilters](#ProductsDataUpdatesFilters)>? |  yes  |  |

---


 
 
 #### [EntitiesDataUpdates](#EntitiesDataUpdates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | HashMap<String,Any>? |  yes  |  |
 | filters | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [DataUpdates](#DataUpdates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | products | ArrayList<[ProductsDataUpdates](#ProductsDataUpdates)>? |  yes  |  |
 | entities | ArrayList<[EntitiesDataUpdates](#EntitiesDataUpdates)>? |  yes  |  |

---


 
 
 #### [Products](#Products)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lineNumber | Int? |  yes  |  |
 | identifier | String? |  yes  |  |
 | quantity | Int? |  yes  |  |

---


 
 
 #### [ProductsReasonsData](#ProductsReasonsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reasonText | String? |  yes  |  |
 | reasonId | Int? |  yes  |  |

---


 
 
 #### [ProductsReasonsFilters](#ProductsReasonsFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lineNumber | Int? |  yes  |  |
 | identifier | String? |  yes  |  |
 | quantity | Int? |  yes  |  |

---


 
 
 #### [ProductsReasons](#ProductsReasons)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [ProductsReasonsData](#ProductsReasonsData)? |  yes  |  |
 | filters | ArrayList<[ProductsReasonsFilters](#ProductsReasonsFilters)>? |  yes  |  |

---


 
 
 #### [EntityReasonData](#EntityReasonData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reasonText | String? |  yes  |  |
 | reasonId | Int? |  yes  |  |

---


 
 
 #### [EntitiesReasons](#EntitiesReasons)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [EntityReasonData](#EntityReasonData)? |  yes  |  |
 | filters | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [ReasonsData](#ReasonsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | products | ArrayList<[ProductsReasons](#ProductsReasons)>? |  yes  |  |
 | entities | ArrayList<[EntitiesReasons](#EntitiesReasons)>? |  yes  |  |

---


 
 
 #### [ShipmentsRequest](#ShipmentsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dataUpdates | [DataUpdates](#DataUpdates)? |  yes  |  |
 | products | ArrayList<[Products](#Products)>? |  yes  |  |
 | identifier | String |  no  |  |
 | reasons | [ReasonsData](#ReasonsData)? |  yes  |  |

---


 
 
 #### [StatuesRequest](#StatuesRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | excludeBagsNextState | String? |  yes  |  |
 | shipments | ArrayList<[ShipmentsRequest](#ShipmentsRequest)>? |  yes  |  |
 | status | String? |  yes  |  |

---


 
 
 #### [UpdateShipmentStatusRequest](#UpdateShipmentStatusRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | task | Boolean? |  yes  |  |
 | forceTransition | Boolean? |  yes  |  |
 | statuses | ArrayList<[StatuesRequest](#StatuesRequest)>? |  yes  |  |
 | unlockBeforeTransition | Boolean? |  yes  |  |
 | lockAfterTransition | Boolean? |  yes  |  |

---


 
 
 #### [ShipmentsResponse](#ShipmentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stackTrace | String? |  yes  |  |
 | code | String? |  yes  |  |
 | message | String? |  yes  |  |
 | identifier | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | exception | String? |  yes  |  |
 | finalState | HashMap<String,Any>? |  yes  |  |
 | status | Int? |  yes  |  |

---


 
 
 #### [StatuesResponse](#StatuesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[ShipmentsResponse](#ShipmentsResponse)>? |  yes  |  |

---


 
 
 #### [UpdateShipmentStatusResponseBody](#UpdateShipmentStatusResponseBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statuses | ArrayList<[StatuesResponse](#StatuesResponse)>? |  yes  |  |

---


 
 
 #### [MarketPlacePdf](#MarketPlacePdf)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | label | String? |  yes  |  |
 | invoice | String? |  yes  |  |

---


 
 
 #### [AffiliateBag](#AffiliateBag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | avlQty | Int |  no  |  |
 | hsnCodeId | String |  no  |  |
 | pdfLinks | [MarketPlacePdf](#MarketPlacePdf)? |  yes  |  |
 | itemSize | String |  no  |  |
 | transferPrice | Int |  no  |  |
 | storeId | Int |  no  |  |
 | itemId | Int |  no  |  |
 | affiliateStoreId | String |  no  |  |
 | affiliateMeta | HashMap<String,Any> |  no  |  |
 | priceMarked | Double |  no  |  |
 | fyndStoreId | String |  no  |  |
 | identifier | HashMap<String,Any> |  no  |  |
 | discount | Double |  no  |  |
 | sellerIdentifier | String |  no  |  |
 | deliveryCharge | Double |  no  |  |
 | unitPrice | Double |  no  |  |
 | priceEffective | Double |  no  |  |
 | companyId | Int |  no  |  |
 | quantity | Int |  no  |  |
 | sku | String |  no  |  |
 | amountPaid | Double |  no  |  |
 | id | String |  no  |  |
 | modifiedOn | String |  no  |  |

---


 
 
 #### [OrderUser](#OrderUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | mobile | Int |  no  |  |
 | lastName | String |  no  |  |
 | phone | Int |  no  |  |
 | email | String |  no  |  |
 | firstName | String |  no  |  |
 | city | String |  no  |  |
 | pincode | String |  no  |  |
 | address2 | String? |  yes  |  |
 | address1 | String? |  yes  |  |
 | state | String |  no  |  |

---


 
 
 #### [UserData](#UserData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shippingUser | [OrderUser](#OrderUser)? |  yes  |  |
 | billingUser | [OrderUser](#OrderUser)? |  yes  |  |

---


 
 
 #### [OrderPriority](#OrderPriority)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfilmentPriority | Int? |  yes  |  |
 | affiliatePriorityCode | String? |  yes  |  |
 | fulfilmentPriorityText | String? |  yes  |  |

---


 
 
 #### [ArticleDetails](#ArticleDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | brandId | Int |  no  |  |
 | attributes | HashMap<String,Any> |  no  |  |
 | category | HashMap<String,Any> |  no  |  |
 | quantity | Int |  no  |  |
 | dimension | HashMap<String,Any> |  no  |  |
 | weight | HashMap<String,Any> |  no  |  |

---


 
 
 #### [LocationDetails](#LocationDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfillmentId | Int |  no  |  |
 | fulfillmentType | String |  no  |  |
 | articles | ArrayList<[ArticleDetails](#ArticleDetails)> |  no  |  |

---


 
 
 #### [ShipmentDetails](#ShipmentDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dpId | Int? |  yes  |  |
 | affiliateShipmentId | String |  no  |  |
 | boxType | String? |  yes  |  |
 | fulfillmentId | Int |  no  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | articles | ArrayList<[ArticleDetails](#ArticleDetails)> |  no  |  |
 | shipments | Int |  no  |  |

---


 
 
 #### [ShipmentConfig](#ShipmentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | toPincode | String |  no  |  |
 | identifier | String |  no  |  |
 | locationDetails | [LocationDetails](#LocationDetails)? |  yes  |  |
 | shipment | ArrayList<[ShipmentDetails](#ShipmentDetails)> |  no  |  |
 | journey | String |  no  |  |
 | action | String |  no  |  |
 | source | String |  no  |  |
 | paymentMode | String |  no  |  |

---


 
 
 #### [ShipmentData](#ShipmentData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentData | [ShipmentConfig](#ShipmentConfig) |  no  |  |

---


 
 
 #### [OrderInfo](#OrderInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bags | ArrayList<[AffiliateBag](#AffiliateBag)> |  no  |  |
 | payment | HashMap<String,Any>? |  yes  |  |
 | user | [UserData](#UserData) |  no  |  |
 | orderPriority | [OrderPriority](#OrderPriority)? |  yes  |  |
 | codCharges | Double |  no  |  |
 | items | HashMap<String,Any> |  no  |  |
 | coupon | String? |  yes  |  |
 | shipment | [ShipmentData](#ShipmentData)? |  yes  |  |
 | orderValue | Double |  no  |  |
 | discount | Double |  no  |  |
 | deliveryCharges | Double |  no  |  |
 | billingAddress | [OrderUser](#OrderUser) |  no  |  |
 | shippingAddress | [OrderUser](#OrderUser) |  no  |  |
 | paymentMode | String |  no  |  |
 | affiliateOrderId | String? |  yes  |  |

---


 
 
 #### [AffiliateStoreIdMapping](#AffiliateStoreIdMapping)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marketplaceStoreId | String |  no  |  |
 | storeId | Int |  no  |  |

---


 
 
 #### [AffiliateAppConfigMeta](#AffiliateAppConfigMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [AffiliateAppConfig](#AffiliateAppConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | secret | String |  no  |  |
 | description | String? |  yes  |  |
 | createdAt | String |  no  |  |
 | token | String |  no  |  |
 | meta | ArrayList<[AffiliateAppConfigMeta](#AffiliateAppConfigMeta)>? |  yes  |  |
 | name | String |  no  |  |
 | updatedAt | String |  no  |  |
 | id | String |  no  |  |
 | owner | String |  no  |  |

---


 
 
 #### [AffiliateInventoryOrderConfig](#AffiliateInventoryOrderConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | forceReassignment | Boolean? |  yes  |  |

---


 
 
 #### [AffiliateInventoryPaymentConfig](#AffiliateInventoryPaymentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | source | String? |  yes  |  |
 | modeOfPayment | String? |  yes  |  |

---


 
 
 #### [AffiliateInventoryLogisticsConfig](#AffiliateInventoryLogisticsConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dpAssignment | Boolean? |  yes  |  |

---


 
 
 #### [AffiliateInventoryStoreConfig](#AffiliateInventoryStoreConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | store | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [AffiliateInventoryArticleAssignmentConfig](#AffiliateInventoryArticleAssignmentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | postOrderReassignment | Boolean? |  yes  |  |

---


 
 
 #### [AffiliateInventoryConfig](#AffiliateInventoryConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | [AffiliateInventoryOrderConfig](#AffiliateInventoryOrderConfig)? |  yes  |  |
 | payment | [AffiliateInventoryPaymentConfig](#AffiliateInventoryPaymentConfig)? |  yes  |  |
 | logistics | [AffiliateInventoryLogisticsConfig](#AffiliateInventoryLogisticsConfig)? |  yes  |  |
 | inventory | [AffiliateInventoryStoreConfig](#AffiliateInventoryStoreConfig)? |  yes  |  |
 | articleAssignment | [AffiliateInventoryArticleAssignmentConfig](#AffiliateInventoryArticleAssignmentConfig)? |  yes  |  |

---


 
 
 #### [AffiliateConfig](#AffiliateConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app | [AffiliateAppConfig](#AffiliateAppConfig)? |  yes  |  |
 | inventory | [AffiliateInventoryConfig](#AffiliateInventoryConfig)? |  yes  |  |

---


 
 
 #### [Affiliate](#Affiliate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config | [AffiliateConfig](#AffiliateConfig)? |  yes  |  |
 | token | String |  no  |  |
 | id | String |  no  |  |

---


 
 
 #### [OrderConfig](#OrderConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createUser | Boolean? |  yes  |  |
 | articleLookup | String? |  yes  |  |
 | bagEndState | String? |  yes  |  |
 | affiliateStoreIdMapping | ArrayList<[AffiliateStoreIdMapping](#AffiliateStoreIdMapping)> |  no  |  |
 | affiliate | [Affiliate](#Affiliate) |  no  |  |
 | storeLookup | String? |  yes  |  |

---


 
 
 #### [CreateOrderPayload](#CreateOrderPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderInfo | [OrderInfo](#OrderInfo) |  no  |  |
 | orderConfig | [OrderConfig](#OrderConfig) |  no  |  |
 | affiliateId | String |  no  |  |

---


 
 
 #### [CreateOrderResponse](#CreateOrderResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndOrderId | String |  no  |  |

---


 
 
 #### [DispatchManifest](#DispatchManifest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | manifestId | String |  no  |  |

---


 
 
 #### [SuccessResponse](#SuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [ActionInfo](#ActionInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String |  no  |  |
 | id | Int |  no  |  |
 | displayText | String |  no  |  |
 | description | String |  no  |  |

---


 
 
 #### [GetActionsResponse](#GetActionsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | permissions | [ActionInfo](#ActionInfo) |  no  |  |

---


 
 
 #### [HistoryDict](#HistoryDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdat | String |  no  |  |
 | bagId | Int? |  yes  |  |
 | type | String |  no  |  |
 | user | String |  no  |  |
 | message | String |  no  |  |
 | l2Detail | String? |  yes  |  |
 | l3Detail | String? |  yes  |  |
 | ticketId | String? |  yes  |  |
 | l1Detail | String? |  yes  |  |
 | ticketUrl | String? |  yes  |  |

---


 
 
 #### [ShipmentHistoryResponse](#ShipmentHistoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | activityHistory | ArrayList<[HistoryDict](#HistoryDict)>? |  yes  |  |

---


 
 
 #### [ErrorDetail](#ErrorDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [SmsDataPayload](#SmsDataPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customerName | String |  no  |  |
 | phoneNumber | Int |  no  |  |
 | paymentMode | String |  no  |  |
 | message | String |  no  |  |
 | shipmentId | Int |  no  |  |
 | orderId | String |  no  |  |
 | amountPaid | Int |  no  |  |
 | brandName | String |  no  |  |
 | countryCode | String |  no  |  |

---


 
 
 #### [SendSmsPayload](#SendSmsPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [SmsDataPayload](#SmsDataPayload)? |  yes  |  |
 | slug | String |  no  |  |
 | bagId | Int |  no  |  |

---


 
 
 #### [Meta](#Meta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | kafkaEmissionStatus | Int? |  yes  |  |
 | stateManagerUsed | String? |  yes  |  |

---


 
 
 #### [ShipmentDetail](#ShipmentDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int |  no  |  |
 | remarks | String? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | meta | [Meta](#Meta) |  no  |  |
 | bagList | ArrayList<Int>? |  yes  |  |
 | status | String? |  yes  |  |

---


 
 
 #### [OrderDetails](#OrderDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndOrderId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |

---


 
 
 #### [OrderStatusData](#OrderStatusData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentDetails | ArrayList<[ShipmentDetail](#ShipmentDetail)>? |  yes  |  |
 | errors | ArrayList<String>? |  yes  |  |
 | orderDetails | [OrderDetails](#OrderDetails) |  no  |  |

---


 
 
 #### [OrderStatusResult](#OrderStatusResult)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | ArrayList<[OrderStatusData](#OrderStatusData)>? |  yes  |  |
 | success | String |  no  |  |

---


 
 
 #### [ManualAssignDPToShipment](#ManualAssignDPToShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | qcRequired | String |  no  |  |
 | shipmentIds | ArrayList<String>? |  yes  |  |
 | orderType | String |  no  |  |
 | dpId | Int |  no  |  |

---


 
 
 #### [ManualAssignDPToShipmentResponse](#ManualAssignDPToShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | errors | ArrayList<String>? |  yes  |  |
 | success | String |  no  |  |

---


 
 
 #### [PaymentMethod](#PaymentMethod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | collectBy | String |  no  |  |
 | mode | String |  no  |  |
 | transactionData | HashMap<String,Any>? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | name | String |  no  |  |
 | amount | Double |  no  |  |
 | refundBy | String |  no  |  |

---


 
 
 #### [PaymentInfo](#PaymentInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | primaryMode | String |  no  |  |
 | paymentMethods | ArrayList<[PaymentMethod](#PaymentMethod)>? |  yes  |  |

---


 
 
 #### [TaxInfo](#TaxInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstin | String? |  yes  |  |
 | b2BGstinNumber | String? |  yes  |  |

---


 
 
 #### [Tax](#Tax)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rate | Double |  no  |  |
 | amount | HashMap<String,Any> |  no  |  |
 | breakup | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | name | String |  no  |  |

---


 
 
 #### [Charge](#Charge)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | tax | [Tax](#Tax)? |  yes  |  |
 | code | String? |  yes  |  |
 | name | String |  no  |  |
 | amount | HashMap<String,Any> |  no  |  |

---


 
 
 #### [LineItem](#LineItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | charges | ArrayList<[Charge](#Charge)> |  no  |  |
 | quantity | Int? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | sellerIdentifier | String |  no  |  |
 | externalLineId | String? |  yes  |  |
 | customMessasge | String? |  yes  |  |

---


 
 
 #### [ProcessingDates](#ProcessingDates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dispatchAfterDate | String? |  yes  |  |
 | dispatchByDate | String? |  yes  |  |
 | confirmByDate | String? |  yes  |  |
 | packByDate | String? |  yes  |  |
 | dpPickupSlot | HashMap<String,Any>? |  yes  |  |
 | customerPickupSlot | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lineItems | ArrayList<[LineItem](#LineItem)> |  no  |  |
 | priority | Int? |  yes  |  |
 | externalShipmentId | Double? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | processingDates | [ProcessingDates](#ProcessingDates)? |  yes  |  |
 | locationId | Int |  no  |  |

---


 
 
 #### [ShippingInfo](#ShippingInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gender | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | stateCode | String? |  yes  |  |
 | firstName | String |  no  |  |
 | title | String? |  yes  |  |
 | address2 | String? |  yes  |  |
 | alternateMobileNumber | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | alternateEmail | String? |  yes  |  |
 | address1 | String |  no  |  |
 | state | String |  no  |  |
 | primaryMobileNumber | String |  no  |  |
 | middleName | String? |  yes  |  |
 | externalCustomerCode | String? |  yes  |  |
 | floorNo | String? |  yes  |  |
 | slot | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | city | String |  no  |  |
 | pincode | String |  no  |  |
 | customerCode | String? |  yes  |  |
 | shippingType | String? |  yes  |  |
 | country | String |  no  |  |
 | landmark | String? |  yes  |  |
 | geoLocation | HashMap<String,Any>? |  yes  |  |
 | houseNo | String? |  yes  |  |
 | addressType | String? |  yes  |  |
 | primaryEmail | String |  no  |  |

---


 
 
 #### [BillingInfo](#BillingInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gender | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | stateCode | String? |  yes  |  |
 | firstName | String |  no  |  |
 | title | String? |  yes  |  |
 | address2 | String? |  yes  |  |
 | alternateMobileNumber | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | alternateEmail | String? |  yes  |  |
 | address1 | String |  no  |  |
 | primaryMobileNumber | String |  no  |  |
 | state | String |  no  |  |
 | middleName | String? |  yes  |  |
 | externalCustomerCode | String? |  yes  |  |
 | floorNo | String? |  yes  |  |
 | city | String |  no  |  |
 | pincode | String |  no  |  |
 | customerCode | String? |  yes  |  |
 | country | String |  no  |  |
 | houseNo | String? |  yes  |  |
 | primaryEmail | String |  no  |  |

---


 
 
 #### [CreateOrderAPI](#CreateOrderAPI)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentInfo | [PaymentInfo](#PaymentInfo) |  no  |  |
 | taxInfo | [TaxInfo](#TaxInfo)? |  yes  |  |
 | externalCreationDate | String? |  yes  |  |
 | charges | ArrayList<[Charge](#Charge)> |  no  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | externalOrderId | String? |  yes  |  |
 | shipments | ArrayList<[Shipment](#Shipment)> |  no  |  |
 | currencyInfo | HashMap<String,Any>? |  yes  |  |
 | shippingInfo | [ShippingInfo](#ShippingInfo) |  no  |  |
 | billingInfo | [BillingInfo](#BillingInfo) |  no  |  |

---


 
 
 #### [CreateOrderErrorReponse](#CreateOrderErrorReponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | requestId | String? |  yes  |  |
 | info | Any? |  yes  |  |
 | stackTrace | String? |  yes  |  |
 | code | String? |  yes  |  |
 | message | String |  no  |  |
 | meta | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | status | Int |  no  |  |

---


 
 
 #### [PaymentMethods](#PaymentMethods)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | collectBy | String? |  yes  |  |
 | mode | String? |  yes  |  |
 | refundBy | String? |  yes  |  |

---


 
 
 #### [CreateChannelPaymentInfo](#CreateChannelPaymentInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | source | String? |  yes  |  |
 | modeOfPayment | String? |  yes  |  |
 | paymentMethods | ArrayList<[PaymentMethods](#PaymentMethods)>? |  yes  |  |

---


 
 
 #### [DpConfiguration](#DpConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shippingBy | String? |  yes  |  |

---


 
 
 #### [CreateChannelConfig](#CreateChannelConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logoUrl | HashMap<String,Any>? |  yes  |  |
 | lockStates | ArrayList<String>? |  yes  |  |
 | paymentInfo | [CreateChannelPaymentInfo](#CreateChannelPaymentInfo)? |  yes  |  |
 | locationReassignment | Boolean? |  yes  |  |
 | dpConfiguration | [DpConfiguration](#DpConfiguration)? |  yes  |  |
 | shipmentAssignment | String? |  yes  |  |

---


 
 
 #### [CreateChannelConfigData](#CreateChannelConfigData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | configData | [CreateChannelConfig](#CreateChannelConfig)? |  yes  |  |

---


 
 
 #### [CreateChannelConifgErrorResponse](#CreateChannelConifgErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | String? |  yes  |  |

---


 
 
 #### [CreateChannelConfigResponse](#CreateChannelConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isInserted | Boolean? |  yes  |  |
 | isUpserted | Boolean? |  yes  |  |
 | acknowledged | Boolean? |  yes  |  |

---


 
 
 #### [UploadConsent](#UploadConsent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | manifestId | String |  no  |  |
 | consentUrl | String |  no  |  |

---


 
 
 #### [PlatformOrderUpdate](#PlatformOrderUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String |  no  |  |

---


 
 
 #### [ResponseDetail](#ResponseDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | ArrayList<String>? |  yes  |  |

---


 
 
 #### [FyndOrderIdList](#FyndOrderIdList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndOrderId | ArrayList<String>? |  yes  |  |

---


 
 
 #### [OrderStatus](#OrderStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | Int |  no  |  |
 | orderDetails | ArrayList<[FyndOrderIdList](#FyndOrderIdList)>? |  yes  |  |
 | endDate | String |  no  |  |
 | startDate | String |  no  |  |

---



