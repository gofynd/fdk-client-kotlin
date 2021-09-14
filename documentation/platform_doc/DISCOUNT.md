



##### [Back to Platform docs](./README.md)

## Discount Methods
Discount
* [getDiscounts](#getdiscounts)
* [createDiscount](#creatediscount)
* [getDiscount](#getdiscount)
* [updateDiscount](#updatediscount)
* [validateDiscountFile](#validatediscountfile)
* [downloadDiscountFile](#downloaddiscountfile)
* [getValidationJob](#getvalidationjob)
* [cancelValidationJob](#cancelvalidationjob)
* [getDownloadJob](#getdownloadjob)
* [cancelDownloadJob](#canceldownloadjob)



## Methods with example and description


### getDiscounts
Fetch discount list.




```kotlin
client.discount.getDiscounts(view: view, q: q, pageNo: pageNo, pageSize: pageSize, archived: archived, month: month, year: year, type: type, appIds: appIds).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Int | yes | company_id |   
| view | String? | no | listing or calender.  Default is listing. |   
| q | String? | no | The search query. This can be a partial or complete name of a discount. |   
| pageNo | Int? | no | page number. Default is 1. |   
| pageSize | Int? | no | page size. Default is 12. |   
| archived | Boolean? | no | archived. Default is false. |   
| month | Int? | no | month. Default is current month. |   
| year | Int? | no | year. Default is current year. |   
| type | String? | no | basic or custom. |   
| appIds | ArrayList<String>? | no | application ids. |  



Fetch discount list.

*Returned Response:*




[ListOrCalender](#ListOrCalender)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createDiscount
Create Discount.




```kotlin
client.discount.createDiscount(body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Int | yes | company_id |  
| body | [CreateUpdateDiscount](#CreateUpdateDiscount) | yes | Request body |


Create Discount.

*Returned Response:*




[DiscountJob](#DiscountJob)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getDiscount
Fetch discount.




```kotlin
client.discount.getDiscount(id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Int | yes | company_id |   
| id | String | yes | unique id. |  



Fetch discount.

*Returned Response:*




[DiscountJob](#DiscountJob)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateDiscount
Create Discount.




```kotlin
client.discount.updateDiscount(id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Int | yes | company_id |   
| id | String | yes | id |  
| body | [CreateUpdateDiscount](#CreateUpdateDiscount) | yes | Request body |


Create Discount.

*Returned Response:*




[DiscountJob](#DiscountJob)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### validateDiscountFile
Validate File.




```kotlin
client.discount.validateDiscountFile(discount: discount, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Int | yes | company_id |   
| discount | String? | no | discount |  
| body | [DiscountJob](#DiscountJob) | yes | Request body |


Validate File.

*Returned Response:*




[FileJobResponse](#FileJobResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### downloadDiscountFile
Validate File.




```kotlin
client.discount.downloadDiscountFile(type: type, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Int | yes | company_id |   
| type | String | yes | type |  
| body | [DownloadFileJob](#DownloadFileJob) | yes | Request body |


Validate File.

*Returned Response:*




[FileJobResponse](#FileJobResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getValidationJob
Validate File Job.




```kotlin
client.discount.getValidationJob(id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Int | yes | company_id |   
| id | String | yes | id |  



Validate File Job.

*Returned Response:*




[FileJobResponse](#FileJobResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### cancelValidationJob
Cancel Validation Job.




```kotlin
client.discount.cancelValidationJob(id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Int | yes | company_id |   
| id | String | yes | id |  



Cancel Validation Job.

*Returned Response:*




[CancelJobResponse](#CancelJobResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getDownloadJob
Download File Job.




```kotlin
client.discount.getDownloadJob(id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Int | yes | company_id |   
| id | String | yes | id |  



Download File Job.

*Returned Response:*




[FileJobResponse](#FileJobResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### cancelDownloadJob
Cancel Download Job.




```kotlin
client.discount.cancelDownloadJob(id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Int | yes | company_id |   
| id | String | yes | id |  



Cancel Download Job.

*Returned Response:*




[CancelJobResponse](#CancelJobResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [ValidityObject](#ValidityObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start | String |  no  |  |
 | end | String |  no  |  |

---


 
 
 #### [CreateUpdateDiscount](#CreateUpdateDiscount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | companyId | Int |  no  |  |
 | isActive | Boolean |  no  |  |
 | appIds | ArrayList<String> |  no  |  |
 | jobType | String |  no  |  |
 | discountType | String |  no  |  |
 | discountLevel | String |  no  |  |
 | value | Int? |  yes  |  |
 | filePath | String? |  yes  |  |
 | brandIds | ArrayList<Int>? |  yes  |  |
 | storeIds | ArrayList<Int>? |  yes  |  |
 | validity | [ValidityObject](#ValidityObject) |  no  |  |

---


 
 
 #### [DiscountJob](#DiscountJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | companyId | Int |  no  |  |
 | isActive | Boolean |  no  |  |
 | appIds | ArrayList<String>? |  yes  |  |
 | jobType | String? |  yes  |  |
 | discountType | String? |  yes  |  |
 | discountLevel | String? |  yes  |  |
 | value | Int? |  yes  |  |
 | filePath | String? |  yes  |  |
 | brandIds | ArrayList<Int>? |  yes  |  |
 | storeIds | ArrayList<Int>? |  yes  |  |
 | validity | [ValidityObject](#ValidityObject) |  no  |  |
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | createdBy | [UserDetails](#UserDetails) |  no  |  |
 | modifiedBy | [UserDetails](#UserDetails) |  no  |  |
 | meta | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [ListOrCalender](#ListOrCalender)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[DiscountJob](#DiscountJob)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [FileJobResponse](#FileJobResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stage | String |  no  |  |
 | total | Int |  no  |  |
 | failed | Int |  no  |  |
 | companyId | Int |  no  |  |
 | body | HashMap<String,Any>? |  yes  |  |
 | type | String |  no  |  |
 | fileType | String |  no  |  |

---


 
 
 #### [DownloadFileJob](#DownloadFileJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Int>? |  yes  |  |
 | storeIds | ArrayList<Int>? |  yes  |  |

---


 
 
 #### [CancelJobResponse](#CancelJobResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemTotal | Int? |  yes  |  |
 | nextId | String? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | current | Int? |  yes  |  |
 | type | Int |  no  |  |
 | size | Int? |  yes  |  |

---


 
 
 #### [UserDetails](#UserDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String |  no  |  |
 | userId | String |  no  |  |

---


 
 
 #### [BadRequestObject](#BadRequestObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---



