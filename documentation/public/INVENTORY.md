



##### [Back to Public docs](./README.md)

## Inventory Methods

* [getJobCodesMetrics](#getjobcodesmetrics)
* [saveJobCodesMetrics](#savejobcodesmetrics)
* [getConfigByApiKey](#getconfigbyapikey)
* [getApiKey](#getapikey)
* [getJobByCode](#getjobbycode)
* [getJobConfigByIntegrationType](#getjobconfigbyintegrationtype)



## Methods with example and description


### getJobCodesMetrics
Find all the JobCodes from Metrics Collection based on the field Values




```kotlin
publicClient.inventory.getJobCodesMetrics(dailyJob: dailyJob, jobCode: jobCode).safeAwait{ response, error->
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
publicClient.inventory.saveJobCodesMetrics(body: body).safeAwait{ response, error->
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


### getConfigByApiKey
Get Slingshot Configuration Of  A Company using API key




```kotlin
publicClient.inventory.getConfigByApiKey(apikey: apikey).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| apikey | String | yes | Api key |  



REST Endpoint that returns all configuration detail of a company

*Returned Response:*




[ResponseEnvelopeSlingshotConfigurationDetail](#ResponseEnvelopeSlingshotConfigurationDetail)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getApiKey
Get apikey  for  Company  to call other Slingshot Configuration APIs 




```kotlin
publicClient.inventory.getApiKey(userName: userName, password: password).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| userName | String | yes | Integration id |   
| password | String | yes | company/store token |  



REST Endpoint that returns apikey by username by password

*Returned Response:*




[ResponseEnvelopeApikeyModel](#ResponseEnvelopeApikeyModel)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getJobByCode
Get Job Config By Code




```kotlin
publicClient.inventory.getJobByCode(code: code).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| code | String | yes | Job Code |  



REST Endpoint that returns job config by code

*Returned Response:*




[ResponseEnvelopeJobConfigDTO](#ResponseEnvelopeJobConfigDTO)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getJobConfigByIntegrationType
Get Job Configs By Integration Type




```kotlin
publicClient.inventory.getJobConfigByIntegrationType(integrationType: integrationType, disable: disable).safeAwait{ response, error->
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



### Schemas

 
 
 #### [EmailJobMetrics](#EmailJobMetrics)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | executed | Boolean? |  yes  |  |
 | id | String? |  yes  |  |
 | jobCode | String? |  yes  |  |
 | dailyJob | Boolean? |  yes  |  |
 | lastExecutedOn | String? |  yes  |  |

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


 
 
 #### [GCompany](#GCompany)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | integration | String? |  yes  |  |
 | level | String? |  yes  |  |
 | uid | Int? |  yes  |  |
 | opted | Boolean? |  yes  |  |
 | permissions | ArrayList<String>? |  yes  |  |
 | token | String? |  yes  |  |
 | name | String? |  yes  |  |
 | stores | ArrayList<[GStore](#GStore)>? |  yes  |  |

---


 
 
 #### [GStore](#GStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | integration | String? |  yes  |  |
 | level | String? |  yes  |  |
 | uid | Int? |  yes  |  |
 | opted | Boolean? |  yes  |  |
 | permissions | ArrayList<String>? |  yes  |  |
 | token | String? |  yes  |  |
 | code | String? |  yes  |  |
 | name | String? |  yes  |  |
 | data | [StoreData](#StoreData)? |  yes  |  |

---


 
 
 #### [Metum](#Metum)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeSlingshotConfigurationDetail](#ResponseEnvelopeSlingshotConfigurationDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | [SlingshotConfigurationDetail](#SlingshotConfigurationDetail)? |  yes  |  |
 | payload | [SlingshotConfigurationDetail](#SlingshotConfigurationDetail)? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [SlingshotConfigurationDetail](#SlingshotConfigurationDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | integration | [SlingshotIntegration](#SlingshotIntegration)? |  yes  |  |
 | companies | ArrayList<[GCompany](#GCompany)>? |  yes  |  |

---


 
 
 #### [SlingshotIntegration](#SlingshotIntegration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | description | String? |  yes  |  |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | meta | ArrayList<[Metum](#Metum)>? |  yes  |  |

---


 
 
 #### [StoreData](#StoreData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | locationId | String? |  yes  |  |

---


 
 
 #### [ApikeyModel](#ApikeyModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sessionId | String? |  yes  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeApikeyModel](#ResponseEnvelopeApikeyModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | [ApikeyModel](#ApikeyModel)? |  yes  |  |
 | payload | [ApikeyModel](#ApikeyModel)? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
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
 | integrationData | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | companyName | String? |  yes  |  |
 | integration | String |  no  |  |
 | companyId | Int |  no  |  |
 | taskDetails | [TaskDTO](#TaskDTO)? |  yes  |  |
 | thresholdDetails | [DataTresholdDTO](#DataTresholdDTO)? |  yes  |  |
 | jobCode | String? |  yes  |  |
 | alias | String? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeJobConfigDTO](#ResponseEnvelopeJobConfigDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | [JobConfigDTO](#JobConfigDTO)? |  yes  |  |
 | payload | [JobConfigDTO](#JobConfigDTO)? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [TaskDTO](#TaskDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | Int? |  yes  |  |
 | groupList | ArrayList<[GenericDTO](#GenericDTO)>? |  yes  |  |

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



