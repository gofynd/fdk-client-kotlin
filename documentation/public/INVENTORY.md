



##### [Back to Public docs](./README.md)

## Inventory Methods

* [getJobConfigByIntegrationType](#getjobconfigbyintegrationtype)
* [getJobCodesMetrics](#getjobcodesmetrics)
* [saveJobCodesMetrics](#savejobcodesmetrics)



## Methods with example and description


### getJobConfigByIntegrationType
Get Job Configs By Integration Type




```kotlin
inventory.getJobConfigByIntegrationType(integrationType: integrationType, disable: disable).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| integrationType | String | yes | Integration Type |   
| disable | Boolean? | no | JobConfig current state |  



REST Endpoint that returns all job Configs by Integration Type

*Returned Response:*




[ResponseEnvelopeListJobConfigDTO](#ResponseEnvelopeListJobConfigDTO)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getJobCodesMetrics
Find all the JobCodes from Metrics Collection based on the field Values




```kotlin
inventory.getJobCodesMetrics(dailyJob: dailyJob, jobCode: jobCode).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| dailyJob | Boolean? | no | Daily Job Flag |   
| jobCode | String? | no | Email Job Code |  



Endpoint to return all JobCodes present in Metrics Collection

*Returned Response:*




[ResponseEnvelopeObject](#ResponseEnvelopeObject)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### saveJobCodesMetrics
Save JobCode Metrics




```kotlin
inventory.saveJobCodesMetrics(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [EmailJobMetrics](#EmailJobMetrics) | yes | Request body |


Endpoint to save JobCode Metrics

*Returned Response:*




[ResponseEnvelopeEmailJobMetrics](#ResponseEnvelopeEmailJobMetrics)

JobCode Metrics entry Created Successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [DataTresholdDTO](#DataTresholdDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | minPrice | Double? |  yes  |  |
 | safeStock | Int? |  yes  |  |
 | periodThreshold | Int? |  yes  |  |
 | periodThresholdType | String? |  yes  |  |
 | periodTypeList | ArrayList<[GenericDTO](#GenericDTO)>? |  yes  |  |

---


 
 
 #### [GenericDTO](#GenericDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String? |  yes  |  |
 | value | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [JobConfigDTO](#JobConfigDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | integration | String |  no  |  |
 | integrationData | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | companyName | String? |  yes  |  |
 | companyId | Int |  no  |  |
 | taskDetails | [TaskDTO](#TaskDTO)? |  yes  |  |
 | thresholdDetails | [DataTresholdDTO](#DataTresholdDTO)? |  yes  |  |
 | jobCode | String? |  yes  |  |
 | alias | String? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | size | Int? |  yes  |  |
 | current | Int? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | itemTotal | Int? |  yes  |  |
 | nextId | String? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeListJobConfigDTO](#ResponseEnvelopeListJobConfigDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | ArrayList<[JobConfigDTO](#JobConfigDTO)>? |  yes  |  |
 | payload | ArrayList<[JobConfigDTO](#JobConfigDTO)>? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [TaskDTO](#TaskDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | Int? |  yes  |  |
 | groupList | ArrayList<[GenericDTO](#GenericDTO)>? |  yes  |  |

---


 
 
 #### [EmailJobMetrics](#EmailJobMetrics)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | executed | Boolean? |  yes  |  |
 | id | String? |  yes  |  |
 | jobCode | String? |  yes  |  |
 | dailyJob | Boolean? |  yes  |  |
 | lastExecutedOn | String? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeEmailJobMetrics](#ResponseEnvelopeEmailJobMetrics)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | [EmailJobMetrics](#EmailJobMetrics)? |  yes  |  |
 | payload | [EmailJobMetrics](#EmailJobMetrics)? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeObject](#ResponseEnvelopeObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | HashMap<String,Any>? |  yes  |  |
 | payload | HashMap<String,Any>? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---



