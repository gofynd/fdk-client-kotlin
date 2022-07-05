



##### [Back to Platform docs](./README.md)

## Orders Methods
Handles all platform order and shipment api(s)
* [getOrderShipmentDetails](#getordershipmentdetails)
* [getShipmentDetails](#getshipmentdetails)



## Methods with example and description


### getOrderShipmentDetails





```kotlin
client.orders.getOrderShipmentDetails(shipmentId: shipmentId).safeAwait{ response, error->
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


### getShipmentDetails





```kotlin
client.orders.getShipmentDetails(orderId: orderId).safeAwait{ response, error->
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



### Schemas

 
 
 #### [OrderDetails](#OrderDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | String? |  yes  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | String |  no  |  |
 | storeName | String |  no  |  |
 | city | String |  no  |  |
 | phone | String |  no  |  |
 | contactPerson | String |  no  |  |
 | code | String |  no  |  |
 | id | String |  no  |  |
 | state | String |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [UserDetails](#UserDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | city | String |  no  |  |
 | address | String |  no  |  |
 | phone | String |  no  |  |
 | state | String |  no  |  |
 | email | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [ShipmentPrices](#ShipmentPrices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandCalculatedAmount | Int? |  yes  |  |
 | taxCollectedAtSource | Int? |  yes  |  |
 | gstinCode | String? |  yes  |  |
 | valueOfGood | Int? |  yes  |  |
 | gstFee | Int? |  yes  |  |

---


 
 
 #### [DPDetails](#DPDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | awbNo | String? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | trackUrl | String? |  yes  |  |
 | id | String? |  yes  |  |
 | country | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | [OrderDetails](#OrderDetails)? |  yes  |  |
 | paymentMode | String |  no  |  |
 | bagStatusHistory | ArrayList<String>? |  yes  |  |
 | deliverySlot | HashMap<String,Any> |  no  |  |
 | shipmentQuantity | Int |  no  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | shipmentId | String |  no  |  |
 | deliveryDetails | [UserDetails](#UserDetails)? |  yes  |  |
 | shipmentPrices | [ShipmentPrices](#ShipmentPrices)? |  yes  |  |
 | billingDetails | [UserDetails](#UserDetails)? |  yes  |  |
 | journeyType | String |  no  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | bags | HashMap<String,Any> |  no  |  |

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



