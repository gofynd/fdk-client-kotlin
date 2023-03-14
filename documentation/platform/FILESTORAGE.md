



##### [Back to Platform docs](./README.md)

## FileStorage Methods
File Storage
* [startUpload](#startupload)
* [completeUpload](#completeupload)
* [appStartUpload](#appstartupload)
* [appCompleteUpload](#appcompleteupload)
* [getSignUrls](#getsignurls)
* [copyFiles](#copyfiles)
* [appCopyFiles](#appcopyfiles)
* [browse](#browse)
* [browse](#browse)
* [proxy](#proxy)



## Methods with example and description


### startUpload
This operation initiates upload and returns storage link which is valid for 30 Minutes. You can use that storage link to make subsequent upload request with file buffer or blob.




```kotlin
client.filestorage.startUpload(namespace: namespace, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| namespace | String | yes | bucket name |  
| body | [StartRequest](#StartRequest) | yes | Request body |


Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `startUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `startUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `completeUpload` api to complete the upload process.
This operation will return the url for the uploaded file.


*Returned Response:*




[StartResponse](#StartResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### completeUpload
This will complete the upload process. After successfully uploading file, you can call this operation to complete the upload process.




```kotlin
client.filestorage.completeUpload(namespace: namespace, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| namespace | String | yes | bucket name |  
| body | [StartResponse](#StartResponse) | yes | Request body |


Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `startUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `startUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `completeUpload` api to complete the upload process.
This operation will return the url for the uploaded file.


*Returned Response:*




[CompleteResponse](#CompleteResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### appStartUpload
This operation initiates upload and returns storage link which is valid for 30 Minutes. You can use that storage link to make subsequent upload request with file buffer or blob.




```kotlin
client.application("<APPLICATION_ID>").filestorage.appStartUpload(namespace: namespace, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| namespace | String | yes | bucket name |  
| body | [StartRequest](#StartRequest) | yes | Request body |


Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `appStartUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `appStartUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `appCompleteUpload` api to complete the upload process.
This operation will return the url for the uploaded file.


*Returned Response:*




[StartResponse](#StartResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### appCompleteUpload
This will complete the upload process. After successfully uploading file, you can call this operation to complete the upload process.




```kotlin
client.application("<APPLICATION_ID>").filestorage.appCompleteUpload(namespace: namespace, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| namespace | String | yes | bucket name |  
| body | [StartResponse](#StartResponse) | yes | Request body |


Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `appStartUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `appStartUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `appCompleteUpload` api to complete the upload process.
This operation will return the url for the uploaded file.


*Returned Response:*




[CompleteResponse](#CompleteResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getSignUrls
Gives signed urls to access private files




```kotlin
client.filestorage.getSignUrls(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [SignUrlRequest](#SignUrlRequest) | yes | Request body |


Describe here

*Returned Response:*




[SignUrlResponse](#SignUrlResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### copyFiles
Copy Files




```kotlin
client.filestorage.copyFiles(sync: sync, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| sync | Boolean? | no | sync |  
| body | [BulkRequest](#BulkRequest) | yes | Request body |


Copy Files

*Returned Response:*




[BulkUploadResponse](#BulkUploadResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "tracking_url": "https://xxx.xxx.xxx/2",
  "task": {
    "id": "2",
    "name": "__default__",
    "data": {
      "urls": [
        "https://xxx.xxx.xxx/files.csv"
      ],
      "destination": {
        "namespace": "/domaine/path",
        "rewrite": "{{namespace}}/bar/{{dest.path}}"
      }
    },
    "opts": {
      "attempts": 1,
      "delay": 0,
      "timestamp": 1613534206645
    },
    "progress": 0,
    "delay": 0,
    "timestamp": 1613534206645,
    "attempts_made": 0,
    "stacktrace": [],
    "finished_on": 1613534206645,
    "processed_on": 1613534206645
  }
}
```
</details>









---


### appCopyFiles
Copy Files




```kotlin
client.application("<APPLICATION_ID>").filestorage.appCopyFiles(sync: sync, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| sync | Boolean? | no | sync |  
| body | [BulkRequest](#BulkRequest) | yes | Request body |


Copy Files

*Returned Response:*




[BulkUploadResponse](#BulkUploadResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "tracking_url": "https://xxx.xxx.xxx/2",
  "task": {
    "id": "2",
    "name": "__default__",
    "data": {
      "urls": [
        "https://xxx.xxx.xxx/files.csv"
      ],
      "destination": {
        "namespace": "/domaine/path",
        "rewrite": "{{namespace}}/bar/{{dest.path}}"
      }
    },
    "opts": {
      "attempts": 1,
      "delay": 0,
      "timestamp": 1613534206645
    },
    "progress": 0,
    "delay": 0,
    "timestamp": 1613534206645,
    "attempts_made": 0,
    "stacktrace": [],
    "finished_on": 1613534206645,
    "processed_on": 1613534206645
  }
}
```
</details>









---


### browse
Browse Files




```kotlin
client.filestorage.browse(namespace: namespace, pageNo: pageNo).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| namespace | String | yes | bucket name |   
| pageNo | Int? | no | page no |  



Browse Files

*Returned Response:*




[BrowseResponse](#BrowseResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### browse
Browse Files




```kotlin
client.application("<APPLICATION_ID>").filestorage.browse(namespace: namespace, pageNo: pageNo).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| namespace | String | yes | bucket name |   
| pageNo | Int? | no | page no |  



Browse Files

*Returned Response:*




[BrowseResponse](#BrowseResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### proxy
Proxy




```kotlin
client.filestorage.proxy(url: url).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| url | String | yes | url |  



Proxy

*Returned Response:*




[String](#String)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [FailedResponse](#FailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [CDN](#CDN)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | absoluteUrl | String? |  yes  |  |
 | relativeUrl | String? |  yes  |  |

---


 
 
 #### [Upload](#Upload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | expiry | Int |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [StartResponse](#StartResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fileName | String |  no  |  |
 | filePath | String |  no  |  |
 | contentType | String |  no  |  |
 | method | String? |  yes  |  |
 | namespace | String |  no  |  |
 | operation | String |  no  |  |
 | size | Int |  no  |  |
 | upload | [Upload](#Upload) |  no  |  |
 | cdn | [CDN](#CDN) |  no  |  |
 | tags | ArrayList<String>? |  yes  |  |

---


 
 
 #### [StartRequest](#StartRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fileName | String |  no  |  |
 | contentType | String |  no  |  |
 | size | Int |  no  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | params | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [CompleteResponse](#CompleteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | fileName | String |  no  |  |
 | filePath | String |  no  |  |
 | contentType | String |  no  |  |
 | namespace | String |  no  |  |
 | operation | String |  no  |  |
 | size | Int |  no  |  |
 | upload | [Upload](#Upload) |  no  |  |
 | cdn | [CDN](#CDN) |  no  |  |
 | success | Boolean |  no  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |

---


 
 
 #### [Opts](#Opts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attempts | Int? |  yes  |  |
 | timestamp | Int? |  yes  |  |
 | delay | Int? |  yes  |  |

---


 
 
 #### [CopyFileTask](#CopyFileTask)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | data | [BulkRequest](#BulkRequest) |  no  |  |
 | opts | [Opts](#Opts) |  no  |  |
 | progress | Int |  no  |  |
 | delay | Int |  no  |  |
 | timestamp | Int |  no  |  |
 | attemptsMade | Int |  no  |  |
 | stacktrace | ArrayList<String>? |  yes  |  |
 | finishedOn | Int |  no  |  |
 | processedOn | Int |  no  |  |

---


 
 
 #### [BulkUploadResponse](#BulkUploadResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | trackingUrl | String |  no  |  |
 | task | [CopyFileTask](#CopyFileTask) |  no  |  |

---


 
 
 #### [ReqConfiguration](#ReqConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | concurrency | Int? |  yes  |  |

---


 
 
 #### [Destination](#Destination)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | namespace | String |  no  |  |
 | rewrite | String |  no  |  |
 | basepath | String? |  yes  |  |

---


 
 
 #### [BulkRequest](#BulkRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | urls | ArrayList<String> |  no  |  |
 | destination | [Destination](#Destination) |  no  |  |
 | configuration | [ReqConfiguration](#ReqConfiguration)? |  yes  |  |

---


 
 
 #### [Urls](#Urls)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | signedUrl | String |  no  |  |
 | expiry | Int |  no  |  |

---


 
 
 #### [SignUrlResponse](#SignUrlResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | urls | ArrayList<[Urls](#Urls)> |  no  |  |

---


 
 
 #### [SignUrlRequest](#SignUrlRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | expiry | Int |  no  |  |
 | urls | ArrayList<String> |  no  |  |

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


 
 
 #### [DbRecord](#DbRecord)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | id | String |  no  |  |
 | fileName | String |  no  |  |
 | operation | String? |  yes  |  |
 | namespace | String |  no  |  |
 | contentType | String |  no  |  |
 | filePath | String |  no  |  |
 | upload | [Upload](#Upload) |  no  |  |
 | cdn | [CDN](#CDN) |  no  |  |
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |

---


 
 
 #### [BrowseResponse](#BrowseResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[DbRecord](#DbRecord)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---



