



##### [Back to Internal docs](./README.md)

## Analytics Methods
This node js service provides 3 servers, Platform - which contains APIs to power platform analytics. Internal which contains APIs to interact with BQ and Admin which contains APIs to power dunzo dashboard analytics

* [executeJobForProvidedParameters](#executejobforprovidedparameters)
* [startDownloadForQuery](#startdownloadforquery)
* [checkJobStatusByName](#checkjobstatusbyname)



## Methods with example and description


### executeJobForProvidedParameters
Execute given query and returns paginated data




```kotlin
internalClient.analytics.executeJobForProvidedParameters(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [InternalReqBody](#InternalReqBody) | yes | Request body |


accepts query, current page number, total page size and required headers as an request body returns paginated JSON response alog with page object

*Returned Response:*




[TableResponseModel](#TableResponseModel)

Returns the response with pagination information




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### startDownloadForQuery
start_download Copy




```kotlin
internalClient.analytics.startDownloadForQuery(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [FileDownloadRequestBody](#FileDownloadRequestBody) | yes | Request body |


accepts query as an argument and create job for exporting result to csv file and returns job id as a response

*Returned Response:*




[String](#String)

Returns unique job name




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### checkJobStatusByName
check export status




```kotlin
internalClient.analytics.checkJobStatusByName(exportJobName: exportJobName).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| exportJobName | String | yes | Export job name |  



Takes job id in path param to check the status of job Returns file URL if downloading is done else returns status of job

*Returned Response:*




[FileStatusModel](#FileStatusModel)

Returns export job running status if job is running else returns file download url




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [TableResponseModel](#TableResponseModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rows | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | page | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [InternalReqBody](#InternalReqBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | query | String? |  yes  |  |
 | currentPage | Int? |  yes  |  |
 | pageSize | Int? |  yes  |  |

---


 
 
 #### [InternalServerError](#InternalServerError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  | Internal server Server error |
 | timestamp | String? |  yes  | Timestamp |

---


 
 
 #### [FileStatusModel](#FileStatusModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | message | String? |  yes  |  |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |

---


 
 
 #### [FileDownloadRequestBody](#FileDownloadRequestBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | query | String? |  yes  |  |
 | useCompression | String? |  yes  |  |
 | splitFiles | String? |  yes  |  |

---



