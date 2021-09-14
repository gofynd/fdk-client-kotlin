



##### [Back to Application docs](./README.md)

## Logistic Methods
Handles Platform websites OMS
* [getTatProduct](#gettatproduct)
* [getPincodeCity](#getpincodecity)



## Methods with example and description


### getTatProduct
Get TAT of a product




```kotlin
logistic.getTatProduct(body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GetTatProductReqBody](#GetTatProductReqBody) | yes | Request body |


Use this API to know the delivery turnaround time (TAT) by entering the product details along with the PIN Code of the location.

*Returned Response:*




[GetTatProductResponse](#GetTatProductResponse)

Success. Check the example shown below or refer `GetTatProductResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getPincodeCity
Get city from PIN Code




```kotlin
logistic.getPincodeCity(pincode: pincode).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pincode | String | yes | The PIN Code of the area, e.g. 400059 |  



Use this API to retrieve a city by its PIN Code.

*Returned Response:*




[GetPincodeCityResponse](#GetPincodeCityResponse)

Success. Returns a JSON object containing the city name, state and country identified by its PIN Code. Check the example shown below or refer `GetPincodeCityResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [GetPincodeCityResponse](#GetPincodeCityResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | requestUuid | String |  no  |  |
 | stormbreakerUuid | String |  no  |  |
 | success | Boolean |  no  |  |
 | data | ArrayList<[LogisticPincodeData](#LogisticPincodeData)> |  no  |  |

---


 
 
 #### [LogisticPincodeData](#LogisticPincodeData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | [LogisticMeta](#LogisticMeta)? |  yes  |  |
 | parents | ArrayList<[LogisticParents](#LogisticParents)>? |  yes  |  |
 | subType | String? |  yes  |  |
 | name | String? |  yes  |  |
 | error | [LogisticError](#LogisticError)? |  yes  |  |
 | uid | String? |  yes  |  |
 | displayName | String? |  yes  |  |

---


 
 
 #### [LogisticMeta](#LogisticMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zone | String? |  yes  |  |
 | deliverables | ArrayList<Any>? |  yes  |  |

---


 
 
 #### [LogisticParents](#LogisticParents)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subType | String? |  yes  |  |
 | name | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | uid | String? |  yes  |  |

---


 
 
 #### [LogisticError](#LogisticError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [GetTatProductReqBody](#GetTatProductReqBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | locationDetails | ArrayList<[LocationDetailsReq](#LocationDetailsReq)> |  no  |  |
 | toPincode | String |  no  |  |
 | action | String? |  yes  |  |

---


 
 
 #### [LocationDetailsReq](#LocationDetailsReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fromPincode | String? |  yes  |  |
 | articles | ArrayList<[TatReqProductArticles](#TatReqProductArticles)>? |  yes  |  |
 | fulfillmentId | Int? |  yes  |  |

---


 
 
 #### [TatReqProductArticles](#TatReqProductArticles)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | category | [LogisticRequestCategory](#LogisticRequestCategory)? |  yes  |  |

---


 
 
 #### [LogisticRequestCategory](#LogisticRequestCategory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int? |  yes  |  |
 | level | String? |  yes  |  |

---


 
 
 #### [GetTatProductResponse](#GetTatProductResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | locationDetails | ArrayList<[LocationDetails](#LocationDetails)> |  no  |  |
 | requestUuid | String |  no  |  |
 | error | HashMap<String,Any> |  no  |  |
 | toCity | String |  no  |  |
 | source | String |  no  |  |
 | toPincode | String |  no  |  |
 | action | String |  no  |  |
 | stormbreakerUuid | String |  no  |  |
 | success | Boolean |  no  |  |
 | identifier | String |  no  |  |
 | journey | String |  no  |  |

---


 
 
 #### [LocationDetails](#LocationDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fromPincode | String? |  yes  |  |
 | articles | ArrayList<[TatProductArticles](#TatProductArticles)>? |  yes  |  |
 | fulfillmentId | Int? |  yes  |  |

---


 
 
 #### [TatProductArticles](#TatProductArticles)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | HashMap<String,Any>? |  yes  |  |
 | category | [LogisticResponseCategory](#LogisticResponseCategory)? |  yes  |  |
 | promise | [LogisticPromise](#LogisticPromise)? |  yes  |  |

---


 
 
 #### [LogisticResponseCategory](#LogisticResponseCategory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int? |  yes  |  |
 | level | String? |  yes  |  |

---


 
 
 #### [LogisticPromise](#LogisticPromise)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | [LogisticTimestamp](#LogisticTimestamp)? |  yes  |  |
 | formatted | [Formatted](#Formatted)? |  yes  |  |

---


 
 
 #### [LogisticTimestamp](#LogisticTimestamp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | Int? |  yes  |  |
 | max | Int? |  yes  |  |

---


 
 
 #### [Formatted](#Formatted)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | String? |  yes  |  |
 | max | String? |  yes  |  |

---


 
 
 #### [ApefaceApiError](#ApefaceApiError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---



