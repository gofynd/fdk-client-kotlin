



##### [Back to Platform docs](./README.md)

## Orders Methods
Handles all platform order and shipment api(s)
* [getShipmentDetails](#getshipmentdetails)
* [getLaneConfig](#getlaneconfig)
* [getOrderShipmentDetails](#getordershipmentdetails)
* [getShipmentList](#getshipmentlist)
* [getShipmentToManifest](#getshipmenttomanifest)
* [getOrders](#getorders)



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
client.orders.getLaneConfig(superLane: superLane, groupEntity: groupEntity, fromDate: fromDate, toDate: toDate).safeAwait{ response, error->
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
| groupEntity | String? | no |  |   
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
client.orders.getShipmentList(lane: lane, searchType: searchType, searchId: searchId, fromDate: fromDate, toDate: toDate, dpIds: dpIds, orderingCompanyId: orderingCompanyId, stores: stores, salesChannel: salesChannel, requestByExt: requestByExt, isPrioritySort: isPrioritySort).safeAwait{ response, error->
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
| dpIds | String? | no |  |   
| orderingCompanyId | String? | no |  |   
| stores | String? | no |  |   
| salesChannel | String? | no |  |   
| requestByExt | String? | no |  |   
| isPrioritySort | Boolean? | no |  |  





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


### getOrders





```kotlin
client.orders.getOrders(lane: lane, searchType: searchType, searchValue: searchValue, fromDate: fromDate, toDate: toDate, dpIds: dpIds, stores: stores, salesChannel: salesChannel, isPrioritySort: isPrioritySort).safeAwait{ response, error->
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
| searchValue | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| stores | String? | no |  |   
| salesChannel | String? | no |  |   
| isPrioritySort | Boolean? | no |  |  





*Returned Response:*




[OrderListingResponse](#OrderListingResponse)

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
 | email | String |  no  |  |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | pincode | String |  no  |  |
 | phone | String |  no  |  |
 | state | String |  no  |  |
 | country | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [DPDetails](#DPDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | awbNo | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | trackUrl | String? |  yes  |  |
 | country | String? |  yes  |  |
 | name | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | String? |  yes  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | pincode | String |  no  |  |
 | phone | String |  no  |  |
 | country | String |  no  |  |
 | storeName | String |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | code | String |  no  |  |
 | state | String |  no  |  |
 | id | String |  no  |  |
 | contactPerson | String |  no  |  |

---


 
 
 #### [ShipmentPricesData](#ShipmentPricesData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | taxCollectedAtSource | Int? |  yes  |  |
 | brandCalculatedAmount | Int? |  yes  |  |
 | gstFee | Int? |  yes  |  |
 | valueOfGood | Int? |  yes  |  |
 | gstinCode | String? |  yes  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | journeyType | String |  no  |  |
 | deliverySlot | HashMap<String,Any> |  no  |  |
 | paymentMode | String |  no  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | bags | HashMap<String,Any> |  no  |  |
 | shipmentPrices | [ShipmentPricesData](#ShipmentPricesData)? |  yes  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | bagStatusHistory | ArrayList<String>? |  yes  |  |
 | shipmentQuantity | Int |  no  |  |
 | shipmentId | String |  no  |  |

---


 
 
 #### [ShipmentDetailsResponse](#ShipmentDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[Shipment](#Shipment)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reason | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [SubLane](#SubLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | index | Int |  no  |  |
 | displayName | String |  no  |  |
 | totalShipments | Int |  no  |  |
 | currentState | ArrayList<String>? |  yes  |  |
 | nextState | ArrayList<String>? |  yes  |  |
 | name | String |  no  |  |

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


 
 
 #### [PaymentModeInfo](#PaymentModeInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [FulFillingStore](#FulFillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  |  |
 | id | String |  no  |  |

---


 
 
 #### [Item](#Item)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | String |  no  |  |
 | l3Category | Int |  no  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | l3CategoryName | String |  no  |  |
 | canReturn | Boolean |  no  |  |
 | departmentId | Int |  no  |  |
 | image | ArrayList<String>? |  yes  |  |
 | code | String |  no  |  |
 | canCancel | Boolean |  no  |  |
 | color | String? |  yes  |  |
 | name | String |  no  |  |
 | id | Int |  no  |  |

---


 
 
 #### [GST](#GST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | taxCollectedAtSource | Double |  no  |  |
 | brandCalculatedAmount | Double |  no  |  |
 | gstFee | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | gstinCode | String |  no  |  |

---


 
 
 #### [Prices](#Prices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | taxCollectedAtSource | Double |  no  |  |
 | codCharges | Double |  no  |  |
 | discount | Double |  no  |  |
 | cashbackApplied | Double |  no  |  |
 | priceMarked | Double |  no  |  |
 | couponValue | Double |  no  |  |
 | promotionEffectiveDiscount | Double |  no  |  |
 | refundCredit | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | refundAmount | Double |  no  |  |
 | priceEffective | Double |  no  |  |
 | amountPaidRoundoff | Double |  no  |  |
 | cashback | Double |  no  |  |
 | fyndCredits | Double |  no  |  |
 | deliveryCharge | Double |  no  |  |

---


 
 
 #### [BagUnit](#BagUnit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderingChannel | String |  no  |  |
 | item | [Item](#Item)? |  yes  |  |
 | bagId | Int |  no  |  |
 | gst | [GST](#GST)? |  yes  |  |
 | itemQuantity | Int |  no  |  |
 | totalShipmentBags | Int |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | status | HashMap<String,Any> |  no  |  |
 | shipmentId | String |  no  |  |

---


 
 
 #### [UserDataInfo](#UserDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String |  no  |  |
 | uid | Int |  no  |  |
 | email | String |  no  |  |
 | lastName | String |  no  |  |
 | isAnonymousUser | Boolean |  no  |  |
 | gender | String |  no  |  |
 | firstName | String |  no  |  |
 | avisUserId | String |  no  |  |

---


 
 
 #### [ShipmentStatus](#ShipmentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | opsStatus | String |  no  |  |
 | hexCode | String |  no  |  |
 | title | String |  no  |  |
 | actualStatus | String |  no  |  |
 | status | String |  no  |  |

---


 
 
 #### [ShipmentItem](#ShipmentItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalBagsCount | Int |  no  |  |
 | paymentModeInfo | [PaymentModeInfo](#PaymentModeInfo)? |  yes  |  |
 | fulfillingStore | [FulFillingStore](#FulFillingStore)? |  yes  |  |
 | sla | HashMap<String,Any>? |  yes  |  |
 | bags | ArrayList<[BagUnit](#BagUnit)>? |  yes  |  |
 | shipmentCreatedAt | Int |  no  |  |
 | user | [UserDataInfo](#UserDataInfo)? |  yes  |  |
 | shipmentStatus | [ShipmentStatus](#ShipmentStatus)? |  yes  |  |
 | application | HashMap<String,Any>? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | createdAt | String |  no  |  |
 | fulfillingCentre | String |  no  |  |
 | totalShipmentsInOrder | Int |  no  |  |
 | channel | HashMap<String,Any>? |  yes  |  |
 | id | String |  no  |  |

---


 
 
 #### [FilterInfoOption](#FilterInfoOption)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [FiltersInfo](#FiltersInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | text | String |  no  |  |
 | value | String |  no  |  |
 | options | ArrayList<[FilterInfoOption](#FilterInfoOption)>? |  yes  |  |

---


 
 
 #### [ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ShipmentItem](#ShipmentItem)>? |  yes  |  |
 | appliedFilters | HashMap<String,Any>? |  yes  |  |
 | page | HashMap<String,Any>? |  yes  |  |
 | filters | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |

---


 
 
 #### [ShipmentPricesDataSet](#ShipmentPricesDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | taxCollectedAtSource | Int? |  yes  |  |
 | codCharges | Int? |  yes  |  |
 | discount | String? |  yes  |  |
 | cashbackApplied | Int? |  yes  |  |
 | priceMarked | Int? |  yes  |  |
 | brandCalculatedAmount | Int? |  yes  |  |
 | refundCredit | Int? |  yes  |  |
 | gstFee | Int? |  yes  |  |
 | valueOfGood | Int? |  yes  |  |
 | couponEffectiveDiscount | Int? |  yes  |  |
 | amountPaid | Int? |  yes  |  |
 | priceEffective | Int? |  yes  |  |
 | cashback | Int? |  yes  |  |
 | fyndCredits | Int? |  yes  |  |
 | deliveryCharge | Int? |  yes  |  |

---


 
 
 #### [Shipment1](#Shipment1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String |  no  |  |
 | shipmentStatus | String |  no  |  |
 | totalItems | String |  no  |  |
 | prices | [ShipmentPricesDataSet](#ShipmentPricesDataSet)? |  yes  |  |
 | rtdDone | String |  no  |  |
 | shipmentId | String |  no  |  |

---


 
 
 #### [ManifestShipmentResponse](#ManifestShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[Shipment1](#Shipment1)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [ErrorSchemaDataSet](#ErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reason | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | codCharges | Int? |  yes  |  |
 | discount | Int? |  yes  |  |
 | couponValue | String? |  yes  |  |
 | priceMarked | Int? |  yes  |  |
 | cashbackApplied | Int? |  yes  |  |
 | refundCredit | Int? |  yes  |  |
 | valueOfGood | Int? |  yes  |  |
 | amountPaid | Int? |  yes  |  |
 | refundAmount | Int? |  yes  |  |
 | priceEffective | Int? |  yes  |  |
 | cashback | Int? |  yes  |  |
 | fyndCredits | Int? |  yes  |  |
 | deliveryCharge | Int? |  yes  |  |

---


 
 
 #### [ShipmentDataSet](#ShipmentDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | taxCollectedAtSource | Int? |  yes  |  |
 | cashbackApplied | Int? |  yes  |  |
 | brandCalculatedAmount | Int? |  yes  |  |
 | refundCredit | Int? |  yes  |  |
 | couponEffectiveDiscount | Int? |  yes  |  |
 | valueOfGood | Int? |  yes  |  |
 | shipmentStatus | HashMap<String,Any> |  no  |  |
 | priceEffective | Int? |  yes  |  |
 | cashback | Int? |  yes  |  |
 | totalItems | Int |  no  |  |
 | prices | [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)? |  yes  |  |
 | totalBags | Int |  no  |  |
 | fyndCredits | Int? |  yes  |  |
 | deliveryCharge | Int? |  yes  |  |
 | shipmentImages | ArrayList<String>? |  yes  |  |
 | shipmentId | String |  no  |  |

---


 
 
 #### [UserDataSet](#UserDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | Int |  no  |  |
 | gender | String? |  yes  |  |
 | name | String |  no  |  |
 | email | String? |  yes  |  |

---


 
 
 #### [OrderDataSet](#OrderDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderCreatedTime | String |  no  |  |
 | shipments | ArrayList<[ShipmentDataSet](#ShipmentDataSet)>? |  yes  |  |
 | orderId | String |  no  |  |
 | userInfo | [UserDataSet](#UserDataSet)? |  yes  |  |

---


 
 
 #### [OrderListingResponse](#OrderListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orders | ArrayList<[OrderDataSet](#OrderDataSet)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [OrderErrorSchemaDataSet](#OrderErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reason | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---



