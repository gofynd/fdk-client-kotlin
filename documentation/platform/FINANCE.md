



##### [Back to Platform docs](./README.md)

## Finance Methods
Handles all finance related activities
* [generateReport](#generatereport)
* [downloadReport](#downloadreport)
* [getData](#getdata)
* [getReason](#getreason)
* [getReportList](#getreportlist)
* [getAffiliate](#getaffiliate)
* [downloadCreditDebitNote](#downloadcreditdebitnote)
* [paymentProcess](#paymentprocess)
* [creditlineDataplatform](#creditlinedataplatform)
* [isCreditlinePlatform](#iscreditlineplatform)
* [invoiceType](#invoicetype)
* [invoiceListing](#invoicelisting)
* [invoicePDF](#invoicepdf)



## Methods with example and description


### generateReport





```kotlin
platformClient.finance.generateReport(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GenerateReportRequest](#GenerateReportRequest) | yes | Request body |




*Returned Response:*




[GenerateReportJson](#GenerateReportJson)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### downloadReport





```kotlin
platformClient.finance.downloadReport(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [DownloadReport](#DownloadReport) | yes | Request body |




*Returned Response:*




[DownloadReportList](#DownloadReportList)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getData





```kotlin
platformClient.finance.getData(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GetEngineRequest](#GetEngineRequest) | yes | Request body |




*Returned Response:*




[GetEngineResponse](#GetEngineResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getReason





```kotlin
platformClient.finance.getReason(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GetReasonRequest](#GetReasonRequest) | yes | Request body |




*Returned Response:*




[GetReasonResponse](#GetReasonResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getReportList





```kotlin
platformClient.finance.getReportList(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GetReportListRequest](#GetReportListRequest) | yes | Request body |




*Returned Response:*




[GetEngineResponse](#GetEngineResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getAffiliate





```kotlin
platformClient.finance.getAffiliate(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GetAffiliate](#GetAffiliate) | yes | Request body |




*Returned Response:*




[GetAffiliateResponse](#GetAffiliateResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### downloadCreditDebitNote





```kotlin
platformClient.finance.downloadCreditDebitNote(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [DownloadCreditDebitNoteRequest](#DownloadCreditDebitNoteRequest) | yes | Request body |




*Returned Response:*




[DownloadCreditDebitNoteResponse](#DownloadCreditDebitNoteResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### paymentProcess





```kotlin
platformClient.finance.paymentProcess(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [PaymentProcessRequest](#PaymentProcessRequest) | yes | Request body |




*Returned Response:*




[PaymentProcessResponse](#PaymentProcessResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### creditlineDataplatform





```kotlin
platformClient.finance.creditlineDataplatform(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreditlineDataPlatformRequest](#CreditlineDataPlatformRequest) | yes | Request body |




*Returned Response:*




[CreditlineDataPlatformResponse](#CreditlineDataPlatformResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "summary": "Example Response",
  "value": {
    "headers": [
      "Date",
      "Purpose",
      "Transaction Type",
      "Amount",
      "Credit Balance",
      "MR Balance"
    ],
    "items": [
      {
        "table_data": [
          {
            "date": "2023-06-03",
            "purpose": "Variable Commission Adjustment",
            "transaction_type": "Credit",
            "amount": "₹5.00",
            "credit_balance": "₹3080.00",
            "mr_balance": "₹1955.00"
          }
        ]
      }
    ],
    "creditline": {
      "total_amount": 3010,
      "used_amount": -70,
      "balance": 3080
    },
    "minimum_retainership": {
      "total_amount": 2000,
      "used_amount": 45,
      "balance": 1955
    },
    "show_mr": true,
    "item_count": 46,
    "page": {
      "type": "number",
      "size": 10,
      "current": 1,
      "has_next": true,
      "item_count": 46
    }
  }
}
```
</details>









---


### isCreditlinePlatform





```kotlin
platformClient.finance.isCreditlinePlatform(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [IsCreditlinePlatformRequest](#IsCreditlinePlatformRequest) | yes | Request body |




*Returned Response:*




[IsCreditlinePlatformResponse](#IsCreditlinePlatformResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "code": 200,
  "is_creditline_opted": true
}
```
</details>









---


### invoiceType





```kotlin
platformClient.finance.invoiceType(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [InvoiceTypeRequest](#InvoiceTypeRequest) | yes | Request body |




*Returned Response:*




[InvoiceTypeResponse](#InvoiceTypeResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "summary": "Example Response",
  "value": {
    "success": true,
    "invoice_type_list": [
      {
        "text": "Creditline Invoice",
        "value": "1zz78cf4-2d25-4bba-9d42-6515dfaf1751"
      },
      {
        "text": "Seller Invoice",
        "value": "1ec78cf4-2d25-4bba-9d42-6515dfaf1751"
      }
    ],
    "payment_status_list": [
      {
        "text": "Paid",
        "value": "paid"
      },
      {
        "text": "Unpaid",
        "value": "unaid"
      }
    ]
  }
}
```
</details>









---


### invoiceListing





```kotlin
platformClient.finance.invoiceListing(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [InvoiceListingRequest](#InvoiceListingRequest) | yes | Request body |




*Returned Response:*




[InvoiceListingResponse](#InvoiceListingResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "summary": "Example Response",
  "value": {
    "items": [
      {
        "company": "(1)Example Company 1",
        "invoice_number": "INV-001",
        "invoice_type": "Example Type",
        "invoice_date": "05-05-23",
        "period": "02-05-23 - 05-05-23",
        "amount": 100,
        "status": "UNPAID",
        "due_date": "07-05-23",
        "is_downloadable": false,
        "invoice_id": 12345
      },
      {
        "company": "(2)Example Company 2",
        "invoice_number": "INV-002",
        "invoice_type": "Example Type",
        "invoice_date": "05-06-23",
        "period": "02-05-23 - 05-05-23",
        "amount": 200,
        "status": "PAID",
        "due_date": "07-05-23",
        "is_downloadable": true,
        "invoice_id": 67890
      }
    ],
    "unpaid_invoice_data": {
      "total_unpaid_amount": 500,
      "total_unpaid_invoice_count": 5,
      "currency": "INR",
      "item_count": 10
    },
    "page": {
      "page_number": 1,
      "page_size": 10,
      "total_pages": 2
    }
  }
}
```
</details>









---


### invoicePDF





```kotlin
platformClient.finance.invoicePDF(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [InvoicePdfRequest](#InvoicePdfRequest) | yes | Request body |




*Returned Response:*




[InvoicePdfResponse](#InvoicePdfResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "summary": "Example Response",
  "value": {
    "success": true,
    "data": [
      "example1.pdf",
      "example2.pdf"
    ],
    "error": [
      "invoice_no1",
      "invoice_no2"
    ]
  }
}
```
</details>









---



### Schemas

 
 
 #### [GenerateReportFilters](#GenerateReportFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | company | ArrayList<String>? |  yes  |  |
 | channel | ArrayList<String>? |  yes  |  |
 | brand | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GenerateReportMeta](#GenerateReportMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | company | String? |  yes  |  |
 | channel | String? |  yes  |  |
 | brand | String? |  yes  |  |

---


 
 
 #### [GenerateReportPlatform](#GenerateReportPlatform)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reportId | String? |  yes  |  |
 | filters | [GenerateReportFilters](#GenerateReportFilters)? |  yes  |  |
 | endDate | String? |  yes  |  |
 | meta | [GenerateReportMeta](#GenerateReportMeta)? |  yes  |  |
 | startDate | String? |  yes  |  |

---


 
 
 #### [GenerateReportRequest](#GenerateReportRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GenerateReportPlatform](#GenerateReportPlatform)? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | Int? |  yes  |  |
 | itemTotal | Int? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | type | String? |  yes  |  |
 | current | Int? |  yes  |  |

---


 
 
 #### [GenerateReportJson](#GenerateReportJson)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCount | Int? |  yes  |  |
 | headers | ArrayList<String>? |  yes  |  |
 | endDate | String? |  yes  |  |
 | startDate | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |
 | items | ArrayList<ArrayList<String>>? |  yes  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reason | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [DownloadReport](#DownloadReport)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startDate | String? |  yes  |  |
 | pagesize | Int? |  yes  |  |
 | page | Int? |  yes  |  |
 | endDate | String? |  yes  |  |

---


 
 
 #### [DownloadReportItems](#DownloadReportItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reportId | String? |  yes  |  |
 | filters | [GenerateReportFilters](#GenerateReportFilters)? |  yes  |  |
 | endDate | String? |  yes  |  |
 | typeOfRequest | String? |  yes  |  |
 | meta | [GenerateReportMeta](#GenerateReportMeta)? |  yes  |  |
 | startDate | String? |  yes  |  |

---


 
 
 #### [DownloadReportList](#DownloadReportList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCount | Int? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |
 | items | ArrayList<[DownloadReportItems](#DownloadReportItems)>? |  yes  |  |

---


 
 
 #### [GetEngineFilters](#GetEngineFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | configField | String? |  yes  |  |

---


 
 
 #### [GetEngineData](#GetEngineData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tableName | String? |  yes  |  |
 | project | ArrayList<String>? |  yes  |  |
 | filters | [GetEngineFilters](#GetEngineFilters)? |  yes  |  |

---


 
 
 #### [GetEngineRequest](#GetEngineRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetEngineData](#GetEngineData)? |  yes  |  |

---


 
 
 #### [GetEngineResponse](#GetEngineResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCount | Int? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | items | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [GetReason](#GetReason)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reasonType | String? |  yes  |  |

---


 
 
 #### [GetReasonRequest](#GetReasonRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetReason](#GetReason)? |  yes  |  |

---


 
 
 #### [GetDocs](#GetDocs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | docs | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [GetReasonResponse](#GetReasonResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetDocs](#GetDocs)? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [GetReportListData](#GetReportListData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | listingEnabled | Boolean? |  yes  |  |
 | roleName | String? |  yes  |  |

---


 
 
 #### [GetReportListRequest](#GetReportListRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetReportListData](#GetReportListData)? |  yes  |  |

---


 
 
 #### [GetAffiliate](#GetAffiliate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Int? |  yes  |  |

---


 
 
 #### [GetAffiliateResponse](#GetAffiliateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | docs | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [DownloadCreditDebitNote](#DownloadCreditDebitNote)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | noteId | ArrayList<String>? |  yes  |  |

---


 
 
 #### [DownloadCreditDebitNoteRequest](#DownloadCreditDebitNoteRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [DownloadCreditDebitNote](#DownloadCreditDebitNote)? |  yes  |  |

---


 
 
 #### [DownloadCreditDebitNoteResponseData](#DownloadCreditDebitNoteResponseData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | pdfS3Url | String? |  yes  |  |

---


 
 
 #### [DownloadCreditDebitNoteResponse](#DownloadCreditDebitNoteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[DownloadCreditDebitNoteResponseData](#DownloadCreditDebitNoteResponseData)>? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [PaymentProcessPayload](#PaymentProcessPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoiceNumber | String? |  yes  |  |
 | sellerId | String? |  yes  |  |
 | currency | String? |  yes  |  |
 | amount | String? |  yes  |  |
 | transactionType | String? |  yes  |  |
 | sourceReference | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | platform | String? |  yes  |  |
 | totalAmount | String? |  yes  |  |
 | modeOfPayment | String? |  yes  |  |

---


 
 
 #### [PaymentProcessRequest](#PaymentProcessRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [PaymentProcessPayload](#PaymentProcessPayload)? |  yes  |  |

---


 
 
 #### [PaymentProcessResponse](#PaymentProcessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | transactionId | String? |  yes  |  |
 | code | Int? |  yes  |  |
 | message | String? |  yes  |  |
 | redirectUrl | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [CreditlineDataPlatformPayload](#CreditlineDataPlatformPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startEnd | String? |  yes  |  |
 | sellerId | String? |  yes  |  |
 | endEnd | String? |  yes  |  |
 | pagesize | Int? |  yes  |  |
 | page | Int? |  yes  |  |

---


 
 
 #### [CreditlineDataPlatformRequest](#CreditlineDataPlatformRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [CreditlineDataPlatformPayload](#CreditlineDataPlatformPayload)? |  yes  |  |

---


 
 
 #### [CreditlineDataPlatformResponse](#CreditlineDataPlatformResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | Int? |  yes  |  |
 | itemCount | Int? |  yes  |  |
 | headers | ArrayList<String>? |  yes  |  |
 | message | String? |  yes  |  |
 | showMr | Boolean? |  yes  |  |
 | page | HashMap<String,Any>? |  yes  |  |
 | items | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [IsCreditlinePayload](#IsCreditlinePayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sellerId | String? |  yes  |  |

---


 
 
 #### [IsCreditlinePlatformRequest](#IsCreditlinePlatformRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [IsCreditlinePayload](#IsCreditlinePayload)? |  yes  |  |

---


 
 
 #### [IsCreditlinePlatformResponse](#IsCreditlinePlatformResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isCreditlineOpted | Boolean? |  yes  |  |
 | code | Int? |  yes  |  |

---


 
 
 #### [InvoiceTypePayloadData](#InvoiceTypePayloadData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [InvoiceTypeRequest](#InvoiceTypeRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [InvoiceTypePayloadData](#InvoiceTypePayloadData)? |  yes  |  |

---


 
 
 #### [InvoiceTypeResponseItems](#InvoiceTypeResponseItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String? |  yes  |  |
 | text | String? |  yes  |  |

---


 
 
 #### [InvoiceTypeResponse](#InvoiceTypeResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoiceTypeList | ArrayList<[InvoiceTypeResponseItems](#InvoiceTypeResponseItems)>? |  yes  |  |
 | paymentStatusList | ArrayList<[InvoiceTypeResponseItems](#InvoiceTypeResponseItems)>? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [InoviceListingPayloadDataFilters](#InoviceListingPayloadDataFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoiceType | ArrayList<String>? |  yes  |  |
 | companyId | ArrayList<String>? |  yes  |  |
 | paymentStatus | ArrayList<String>? |  yes  |  |

---


 
 
 #### [InvoiceListingPayloadData](#InvoiceListingPayloadData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | [InoviceListingPayloadDataFilters](#InoviceListingPayloadDataFilters)? |  yes  |  |
 | endDate | String? |  yes  |  |
 | search | String? |  yes  |  |
 | startDate | String? |  yes  |  |
 | page | Int? |  yes  |  |
 | pageSize | Int? |  yes  |  |

---


 
 
 #### [InvoiceListingRequest](#InvoiceListingRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [InvoiceListingPayloadData](#InvoiceListingPayloadData)? |  yes  |  |

---


 
 
 #### [UnpaidInvoiceDataItems](#UnpaidInvoiceDataItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalUnpaidInvoiceCount | Int? |  yes  |  |
 | totalUnpaidAmount | Double? |  yes  |  |
 | currency | String? |  yes  |  |

---


 
 
 #### [InvoiceListingResponseItems](#InvoiceListingResponseItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoiceNumber | String? |  yes  |  |
 | amount | String? |  yes  |  |
 | invoiceId | String? |  yes  |  |
 | invoiceType | String? |  yes  |  |
 | status | String? |  yes  |  |
 | dueDate | String? |  yes  |  |
 | company | String? |  yes  |  |
 | isDownloadable | Boolean? |  yes  |  |
 | period | String? |  yes  |  |
 | invoiceDate | String? |  yes  |  |

---


 
 
 #### [InvoiceListingResponse](#InvoiceListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCount | Int? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |
 | unpaidInvoiceData | [UnpaidInvoiceDataItems](#UnpaidInvoiceDataItems)? |  yes  |  |
 | items | ArrayList<[InvoiceListingResponseItems](#InvoiceListingResponseItems)>? |  yes  |  |

---


 
 
 #### [InvoicePdfPayloadData](#InvoicePdfPayloadData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoiceNumber | ArrayList<String>? |  yes  |  |

---


 
 
 #### [InvoicePdfRequest](#InvoicePdfRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [InvoicePdfPayloadData](#InvoicePdfPayloadData)? |  yes  |  |

---


 
 
 #### [InvoicePdfResponse](#InvoicePdfResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | ArrayList<String>? |  yes  |  |
 | data | ArrayList<String>? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


