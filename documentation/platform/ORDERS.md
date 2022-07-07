



##### [Back to Platform docs](./README.md)

## Orders Methods
Handles all platform order and shipment api(s)
* [getShipmentDetails](#getshipmentdetails)
* [getLaneConfig](#getlaneconfig)
* [getOrderShipmentDetails](#getordershipmentdetails)
* [getShipmentList](#getshipmentlist)
* [getShipmentToManifest](#getshipmenttomanifest)



## Methods with example and description


### getShipmentDetails





```kotlin
client.orders.getShipmentDetails(shipmentId: shipmentId).safeAwait{ response, error->
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





*Returned Response:*




[ShipmentDetailsResponse](#ShipmentDetailsResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getLaneConfig





```kotlin
client.orders.getLaneConfig(superLane: superLane, fromDate: fromDate, toDate: toDate).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| superLane | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |  





*Returned Response:*




[LaneConfigResponse](#LaneConfigResponse)

Response containing count of shipments of the given status




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOrderShipmentDetails





```kotlin
client.orders.getOrderShipmentDetails(orderId: orderId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| orderId | String | yes |  |  





*Returned Response:*




[ShipmentDetailsResponse](#ShipmentDetailsResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getShipmentList





```kotlin
client.orders.getShipmentList(lane: lane, searchType: searchType, searchId: searchId, fromDate: fromDate, toDate: toDate).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lane | String? | no |  |   
| searchType | String? | no |  |   
| searchId | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |  





*Returned Response:*




[ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getShipmentToManifest





```kotlin
client.orders.getShipmentToManifest(groupEntity: groupEntity, salesChannel: salesChannel, dpIds: dpIds).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| groupEntity | String | yes |  |   
| salesChannel | String? | no |  |   
| dpIds | String? | no |  |  





*Returned Response:*




[ManifestShipmentResponse](#ManifestShipmentResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [UserDetailsData](#UserDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | String |  no  |  |
 | phone | String |  no  |  |
 | pincode | String |  no  |  |
 | state | String |  no  |  |
 | email | String |  no  |  |
 | country | String |  no  |  |
 | name | String |  no  |  |
 | city | String |  no  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contactPerson | String |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | address | String |  no  |  |
 | storeName | String |  no  |  |
 | phone | String |  no  |  |
 | code | String |  no  |  |
 | id | String |  no  |  |
 | state | String |  no  |  |
 | pincode | String |  no  |  |
 | country | String |  no  |  |
 | city | String |  no  |  |

---


 
 
 #### [ShipmentPricesData](#ShipmentPricesData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstFee | Int? |  yes  |  |
 | taxCollectedAtSource | Int? |  yes  |  |
 | brandCalculatedAmount | Int? |  yes  |  |
 | gstinCode | String? |  yes  |  |
 | valueOfGood | Int? |  yes  |  |

---


 
 
 #### [DPDetails](#DPDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | trackUrl | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |
 | id | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | country | String? |  yes  |  |
 | name | String? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | awbNo | String? |  yes  |  |

---


 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | String? |  yes  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | bagStatusHistory | ArrayList<String>? |  yes  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | shipmentPrices | [ShipmentPricesData](#ShipmentPricesData)? |  yes  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | journeyType | String |  no  |  |
 | shipmentId | String |  no  |  |
 | bags | HashMap<String,Any> |  no  |  |
 | deliverySlot | HashMap<String,Any> |  no  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | paymentMode | String |  no  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | shipmentQuantity | Int |  no  |  |

---


 
 
 #### [ShipmentDetailsResponse](#ShipmentDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | shipments | ArrayList<[Shipment](#Shipment)>? |  yes  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | reason | String? |  yes  |  |

---


 
 
 #### [SubLane](#SubLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayName | String |  no  |  |
 | currentState | ArrayList<String>? |  yes  |  |
 | index | Int |  no  |  |
 | nextState | ArrayList<String>? |  yes  |  |
 | name | String |  no  |  |
 | totalShipments | Int |  no  |  |

---


 
 
 #### [SuperLane](#SuperLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayName | String |  no  |  |
 | options | ArrayList<[SubLane](#SubLane)>? |  yes  |  |

---


 
 
 #### [LaneConfigResponse](#LaneConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | superLanes | ArrayList<[SuperLane](#SuperLane)>? |  yes  |  |

---


 
 
 #### [FilterOption](#FilterOption)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [Filters](#Filters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | text | String |  no  |  |
 | value | String |  no  |  |
 | options | ArrayList<[FilterOption](#FilterOption)>? |  yes  |  |

---


 
 
 #### [FulFillingStore](#FulFillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  |  |
 | id | String |  no  |  |

---


 
 
 #### [Channel](#Channel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [UserInfo](#UserInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String |  no  |  |
 | isAnonymousUser | Boolean |  no  |  |
 | lastName | String |  no  |  |
 | gender | String |  no  |  |
 | avisUserId | String |  no  |  |
 | mobile | String |  no  |  |
 | email | String |  no  |  |
 | uid | Int |  no  |  |

---


 
 
 #### [Prices](#Prices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndCredits | Double |  no  |  |
 | discount | Double |  no  |  |
 | cashback | Double |  no  |  |
 | promotionEffectiveDiscount | Double |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | amountPaidRoundoff | Double |  no  |  |
 | deliveryCharge | Double |  no  |  |
 | couponValue | Double |  no  |  |
 | codCharges | Double |  no  |  |
 | priceEffective | Double |  no  |  |
 | refundCredit | Double |  no  |  |
 | cashbackApplied | Double |  no  |  |
 | refundAmount | Double |  no  |  |
 | priceMarked | Double |  no  |  |
 | valueOfGood | Double |  no  |  |

---


 
 
 #### [ShipmentStatus](#ShipmentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | actualStatus | String |  no  |  |
 | hexCode | String |  no  |  |
 | opsStatus | String |  no  |  |
 | title | String |  no  |  |
 | status | String |  no  |  |

---


 
 
 #### [PaymentModeInfo](#PaymentModeInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [Item](#Item)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | departmentId | Int |  no  |  |
 | canCancel | Boolean |  no  |  |
 | l3Category | Int |  no  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | code | String |  no  |  |
 | size | String |  no  |  |
 | id | Int |  no  |  |
 | l3CategoryName | String |  no  |  |
 | image | ArrayList<String>? |  yes  |  |
 | canReturn | Boolean |  no  |  |
 | name | String |  no  |  |
 | color | String? |  yes  |  |

---


 
 
 #### [GST](#GST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstFee | Double |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | brandCalculatedAmount | Double |  no  |  |
 | gstinCode | String |  no  |  |
 | valueOfGood | Double |  no  |  |

---


 
 
 #### [BagItem](#BagItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemQuantity | Int |  no  |  |
 | totalShipmentBags | Int |  no  |  |
 | item | [Item](#Item)? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | gst | [GST](#GST)? |  yes  |  |
 | shipmentId | String |  no  |  |
 | status | HashMap<String,Any> |  no  |  |
 | bagId | Int |  no  |  |
 | orderingChannel | String |  no  |  |

---


 
 
 #### [Application](#Application)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |

---


 
 
 #### [ShipmentItem](#ShipmentItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sla | HashMap<String,Any>? |  yes  |  |
 | fulfillingStore | [FulFillingStore](#FulFillingStore)? |  yes  |  |
 | channel | [Channel](#Channel)? |  yes  |  |
 | user | [UserInfo](#UserInfo)? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | fulfillingCentre | String |  no  |  |
 | createdAt | String |  no  |  |
 | id | String |  no  |  |
 | shipmentStatus | [ShipmentStatus](#ShipmentStatus)? |  yes  |  |
 | paymentModeInfo | [PaymentModeInfo](#PaymentModeInfo)? |  yes  |  |
 | bags | ArrayList<[BagItem](#BagItem)>? |  yes  |  |
 | totalBagsCount | Int |  no  |  |
 | totalShipmentsInOrder | Int |  no  |  |
 | application | [Application](#Application)? |  yes  |  |
 | shipmentCreatedAt | Int |  no  |  |

---


 
 
 #### [ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | HashMap<String,Any>? |  yes  |  |
 | filters | ArrayList<[Filters](#Filters)>? |  yes  |  |
 | items | ArrayList<[ShipmentItem](#ShipmentItem)>? |  yes  |  |
 | appliedFilters | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [ShipmentPricesDataSet](#ShipmentPricesDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndCredits | Int? |  yes  |  |
 | gstFee | Int? |  yes  |  |
 | couponEffectiveDiscount | Int? |  yes  |  |
 | discount | String? |  yes  |  |
 | cashback | Int? |  yes  |  |
 | taxCollectedAtSource | Int? |  yes  |  |
 | brandCalculatedAmount | Int? |  yes  |  |
 | amountPaid | Int? |  yes  |  |
 | deliveryCharge | Int? |  yes  |  |
 | codCharges | Int? |  yes  |  |
 | priceEffective | Int? |  yes  |  |
 | refundCredit | Int? |  yes  |  |
 | cashbackApplied | Int? |  yes  |  |
 | priceMarked | Int? |  yes  |  |
 | valueOfGood | Int? |  yes  |  |

---


 
 
 #### [Shipment1](#Shipment1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rtdDone | String |  no  |  |
 | prices | [ShipmentPricesDataSet](#ShipmentPricesDataSet)? |  yes  |  |
 | totalItems | String |  no  |  |
 | shipmentStatus | String |  no  |  |
 | shipmentId | String |  no  |  |
 | orderId | String |  no  |  |

---


 
 
 #### [ManifestShipmentResponse](#ManifestShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | shipments | ArrayList<[Shipment1](#Shipment1)>? |  yes  |  |

---



