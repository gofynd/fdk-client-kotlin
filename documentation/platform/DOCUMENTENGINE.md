



##### [Back to Platform docs](./README.md)

## DocumentEngine Methods
Handles financial pdf generation of Fulfilment
* [generateBulkPackageLabel](#generatebulkpackagelabel)
* [generateBulkBoxLabel](#generatebulkboxlabel)
* [generateBulkShipmentLabel](#generatebulkshipmentlabel)
* [generateNoc](#generatenoc)
* [getLabelStatus](#getlabelstatus)
* [getNocStatus](#getnocstatus)
* [getPresignedURL](#getpresignedurl)
* [getLabelPresignedURL](#getlabelpresignedurl)
* [getNocPresignedURL](#getnocpresignedurl)



## Methods with example and description


### generateBulkPackageLabel
Generate Labels for Packages




```kotlin
client.documentengine.generateBulkPackageLabel(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GenerateBulkPackageLabel](#GenerateBulkPackageLabel) | yes | Request body |


Use this API to generate label for Packages

*Returned Response:*




[SuccessResponseGenerateBulk](#SuccessResponseGenerateBulk)

Sucsess Response, Labels will be generated




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### generateBulkBoxLabel
Generate Labels for Boxes which will go inside package




```kotlin
client.documentengine.generateBulkBoxLabel(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GenerateBulkBoxLabel](#GenerateBulkBoxLabel) | yes | Request body |


Use this API to generate label for Boxes

*Returned Response:*




[SuccessResponseGenerateBulk](#SuccessResponseGenerateBulk)

Sucsess Response, Labels will be generated




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### generateBulkShipmentLabel
Generate Labels for Shipments which contains packaged




```kotlin
client.documentengine.generateBulkShipmentLabel(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GenerateBulkShipmentLabel](#GenerateBulkShipmentLabel) | yes | Request body |


Use this API to generate label for Shipments

*Returned Response:*




[SuccessResponseGenerateBulk](#SuccessResponseGenerateBulk)

Sucsess Response, Labels will be generated




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### generateNoc
Generate NOC for Seller having access to a fullfillment center




```kotlin
client.documentengine.generateNoc(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GenerateNoc](#GenerateNoc) | yes | Request body |


Use this API to generate NOC for Seller

*Returned Response:*




[SuccessResponseGenerateBulk](#SuccessResponseGenerateBulk)

Sucsess Response, NOC Pdf will be generated




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success response</i></summary>

```json
{
  "value": {
    "status": true
  }
}
```
</details>

</details>









---


### getLabelStatus
Get Staus of Label generations




```kotlin
client.documentengine.getLabelStatus(uid: uid).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| uid | String | yes | UID given at time of generate request |  



Use this API to fetch status of PDF generation of Labels

*Returned Response:*




[StatusSuccessResponse](#StatusSuccessResponse)

Sucess Response, Status Of Label generation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getNocStatus
Get Staus of NOC generation




```kotlin
client.documentengine.getNocStatus(uid: uid).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| uid | String | yes | UID given at time of generate request |  



Use this API to fetch status of PDF generation of NOC

*Returned Response:*




[StatusSuccessResponse](#StatusSuccessResponse)

Sucess Response, Status Of NOC Pdf generation




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success response</i></summary>

```json
{
  "value": {
    "success": true,
    "status": "created"
  }
}
```
</details>

</details>









---


### getPresignedURL
Get Presigned URL to download PDFs




```kotlin
client.documentengine.getPresignedURL(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [InvoiceLabelPresignedRequestBody](#InvoiceLabelPresignedRequestBody) | yes | Request body |


Use this API to generate Presigned URLs for downloading PDFs

*Returned Response:*




[SignedSuccessResponse](#SignedSuccessResponse)

Sucess Response, Presigned URL of PDFs




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getLabelPresignedURL
Get Presigned URL to download labels




```kotlin
client.documentengine.getLabelPresignedURL(uid: uid).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| uid | String | yes | UID given at time of generate request |  



Use this API to generate Presigned URLs for downloading labels

*Returned Response:*




[SignedSuccessResponse](#SignedSuccessResponse)

Sucess Response, Presigned URL of Labels




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getNocPresignedURL
Get Presigned URL to download NOC Pdf




```kotlin
client.documentengine.getNocPresignedURL(uid: uid).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| uid | String | yes | UID given at time of generate request |  



Use this API to generate Presigned URL for downloading NOC Pdf

*Returned Response:*




[SignedSuccessResponse](#SignedSuccessResponse)

Sucess Response, Presigned URL of NOC Pdf




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success response</i></summary>

```json
{
  "value": {
    "uid": "l27h38uy",
    "expires_in": 300,
    "url": "presigned-url"
  }
}
```
</details>

</details>









---



### Schemas

 
 
 #### [GenerateBulkInvoiceLabelShipment](#GenerateBulkInvoiceLabelShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeId | Double |  no  |  |
 | fromDate | String |  no  |  |
 | toDate | String |  no  |  |
 | documentType | String |  no  |  |
 | shipmentIds | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GenerateBulkInvoiceOrLabelUrl](#GenerateBulkInvoiceOrLabelUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | String |  no  |  |
 | documentType | String |  no  |  |
 | batchId | Double |  no  |  |

---


 
 
 #### [DocumentType](#DocumentType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoice | String |  no  |  |
 | label | String |  no  |  |

---


 
 
 #### [BulkListBadRequestResponse](#BulkListBadRequestResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | error | String? |  yes  |  |

---


 
 
 #### [BulkListFailedResponse](#BulkListFailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | error | String? |  yes  |  |

---


 
 
 #### [SuccessResponseGenerateBulkShipment](#SuccessResponseGenerateBulkShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | jobId | Double |  no  |  |

---


 
 
 #### [GenerateBulkUrlSuccessResponse](#GenerateBulkUrlSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | uid | String |  no  |  |
 | expiresIn | Double |  no  |  |
 | presignedType | String |  no  |  |

---


 
 
 #### [InternalErrorResponseGenerateBulkShipment](#InternalErrorResponseGenerateBulkShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | error | String |  no  |  |

---


 
 
 #### [BadRequestResponseGenerateBulkUrl](#BadRequestResponseGenerateBulkUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [InternalErrorResponseGenerateBulkUrl](#InternalErrorResponseGenerateBulkUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [BadRequestResponseGenerateBulkItemParameters](#BadRequestResponseGenerateBulkItemParameters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | missingProperty | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [BadRequestResponseGenerateBulkItem](#BadRequestResponseGenerateBulkItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | keyword | String? |  yes  |  |
 | dataPath | String? |  yes  |  |
 | schemaPath | String? |  yes  |  |
 | parameters | [BadRequestResponseGenerateBulkItemParameters](#BadRequestResponseGenerateBulkItemParameters)? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [SuccessResponseGenerateBulk](#SuccessResponseGenerateBulk)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |

---


 
 
 #### [BadRequestResponseGenerateBulk](#BadRequestResponseGenerateBulk)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | errorMessage | ArrayList<[BadRequestResponseGenerateBulkItem](#BadRequestResponseGenerateBulkItem)> |  no  |  |

---


 
 
 #### [InternalErrorResponseGenerateBulk](#InternalErrorResponseGenerateBulk)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [ShippingToAddress](#ShippingToAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [SellerAddress](#SellerAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [BoxDetails](#BoxDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | boxId | String |  no  |  |
 | totalQuantity | String |  no  |  |
 | packageCount | String |  no  |  |
 | dimension | String |  no  |  |
 | weight | String |  no  |  |

---


 
 
 #### [ShipmentDetails](#ShipmentDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentNo | String |  no  |  |
 | appointmentNo | String |  no  |  |
 | totalSku | String |  no  |  |
 | itemQty | String |  no  |  |
 | noOfBoxes | String |  no  |  |
 | shippingTo | String |  no  |  |
 | sellerName | String |  no  |  |
 | gstinNumber | String |  no  |  |
 | shippingAddress | [ShippingToAddress](#ShippingToAddress) |  no  |  |
 | sellerAddress | [SellerAddress](#SellerAddress) |  no  |  |

---


 
 
 #### [GenerateBulkBoxLabel](#GenerateBulkBoxLabel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stockTransferId | String |  no  |  |
 | labelType | String |  no  |  |
 | uid | String |  no  |  |
 | sellerName | String |  no  |  |
 | templateId | Double |  no  |  |
 | boxDetails | ArrayList<[BoxDetails](#BoxDetails)> |  no  |  |

---


 
 
 #### [GenerateBulkShipmentLabel](#GenerateBulkShipmentLabel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | labelType | String |  no  |  |
 | uid | String |  no  |  |
 | templateId | Double |  no  |  |
 | shipments | ArrayList<[ShipmentDetails](#ShipmentDetails)> |  no  |  |

---


 
 
 #### [GenerateNoc](#GenerateNoc)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | String |  no  |  |
 | sellerName | String |  no  |  |
 | sellerGstin | String |  no  |  |
 | fcGstin | String |  no  |  |
 | templateId | Double |  no  |  |
 | fcAddress | [SellerAddress](#SellerAddress) |  no  |  |
 | sellerAddress | [SellerAddress](#SellerAddress) |  no  |  |

---


 
 
 #### [PackageDetails](#PackageDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | packageId | String |  no  |  |
 | itemQuantity | String |  no  |  |
 | packageType | String |  no  |  |
 | packagingType | String |  no  |  |
 | dimension | String |  no  |  |
 | weight | String |  no  |  |

---


 
 
 #### [PackageItemDetails](#PackageItemDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | jioCode | String |  no  |  |
 | itemName | String |  no  |  |
 | mrp | String |  no  |  |
 | countryOfOrigin | String |  no  |  |
 | bestBeforeDate | String |  no  |  |
 | ean | String |  no  |  |
 | packageDetails | ArrayList<[PackageDetails](#PackageDetails)> |  no  |  |

---


 
 
 #### [GenerateBulkPackageLabel](#GenerateBulkPackageLabel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stockTransferId | String |  no  |  |
 | labelType | String |  no  |  |
 | uid | String |  no  |  |
 | sellerName | String |  no  |  |
 | templateId | Double |  no  |  |
 | itemDetails | ArrayList<[PackageItemDetails](#PackageItemDetails)> |  no  |  |

---


 
 
 #### [SignedSuccessResponse](#SignedSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | String? |  yes  |  |
 | url | String? |  yes  |  |
 | expiresIn | Double? |  yes  |  |

---


 
 
 #### [SignedBadRequestResponse](#SignedBadRequestResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [SignedFailedResponse](#SignedFailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [StatusSuccessResponse](#StatusSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | status | String? |  yes  |  |

---


 
 
 #### [StatusBadRequestResponse](#StatusBadRequestResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [StatusFailedResponse](#StatusFailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [GenerateManifest](#GenerateManifest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeId | Double |  no  |  |
 | fromDate | String |  no  |  |
 | toDate | String |  no  |  |
 | shipmentIds | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GeneratePresignedManifestUrl](#GeneratePresignedManifestUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | manifestId | String |  no  |  |
 | uid | String |  no  |  |

---


 
 
 #### [ManifestLink](#ManifestLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | manifestId | String |  no  |  |

---


 
 
 #### [GenerateManifestUrlSuccessResponse](#GenerateManifestUrlSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | uid | String |  no  |  |
 | manifestId | String |  no  |  |
 | expiresIn | Double |  no  |  |
 | presignedType | String |  no  |  |

---


 
 
 #### [ManifestListFailedResponse](#ManifestListFailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | error | String? |  yes  |  |

---


 
 
 #### [InvoiceLabelPresignedRequestBody](#InvoiceLabelPresignedRequestBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documentType | String |  no  |  |
 | entityId | String |  no  |  |
 | expiresIn | Double? |  yes  |  |

---


 
 
 #### [OrderInvoiceEngineError](#OrderInvoiceEngineError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---



