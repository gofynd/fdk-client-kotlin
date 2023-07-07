



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
* [asCnRefund](#ascnrefund)
* [createSellerCreditNoteConfig](#createsellercreditnoteconfig)
* [deleteConfig](#deleteconfig)
* [channelDisplayName](#channeldisplayname)
* [getPdfUrlView](#getpdfurlview)
* [creditNoteDetails](#creditnotedetails)
* [getCustomerCreditBalance](#getcustomercreditbalance)
* [getCnConfig](#getcnconfig)
* [generateReportCustomerCn](#generatereportcustomercn)
* [downloadReportCustomerCn](#downloadreportcustomercn)
* [getReportingFilters](#getreportingfilters)



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


### asCnRefund





```kotlin
platformClient.finance.asCnRefund(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [AsCnRefundRequest](#AsCnRefundRequest) | yes | Request body |




*Returned Response:*




[AsCnRefundResponse](#AsCnRefundResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createSellerCreditNoteConfig





```kotlin
platformClient.finance.createSellerCreditNoteConfig(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateSellerCreditNoteConfigRequest](#CreateSellerCreditNoteConfigRequest) | yes | Request body |




*Returned Response:*




[CreateSellerCreditNoteConfigResponse](#CreateSellerCreditNoteConfigResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### deleteConfig





```kotlin
platformClient.finance.deleteConfig(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [DeleteConfigRequest](#DeleteConfigRequest) | yes | Request body |




*Returned Response:*




[DeleteConfigResponse](#DeleteConfigResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### channelDisplayName





```kotlin
platformClient.finance.channelDisplayName(filterKey: filterKey).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| filterKey | String | yes | gives display name for channel. |  





*Returned Response:*




[ChannelDisplayNameResponse](#ChannelDisplayNameResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getPdfUrlView





```kotlin
platformClient.finance.getPdfUrlView(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GetPdfUrlViewRequest](#GetPdfUrlViewRequest) | yes | Request body |




*Returned Response:*




[GetPdfUrlViewResponse](#GetPdfUrlViewResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### creditNoteDetails





```kotlin
platformClient.finance.creditNoteDetails(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreditNoteDetailsRequest](#CreditNoteDetailsRequest) | yes | Request body |




*Returned Response:*




[CreditNoteDetailsResponse](#CreditNoteDetailsResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCustomerCreditBalance





```kotlin
platformClient.finance.getCustomerCreditBalance(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GetCustomerCreditBalanceRequest](#GetCustomerCreditBalanceRequest) | yes | Request body |




*Returned Response:*




[GetCustomerCreditBalanceResponse](#GetCustomerCreditBalanceResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCnConfig





```kotlin
platformClient.finance.getCnConfig(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GetCnConfigRequest](#GetCnConfigRequest) | yes | Request body |




*Returned Response:*




[GetCnConfigResponse](#GetCnConfigResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### generateReportCustomerCn





```kotlin
platformClient.finance.generateReportCustomerCn(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [GenerateReportCustomerCnRequest](#GenerateReportCustomerCnRequest) | yes | Request body |




*Returned Response:*




[GenerateReportCustomerCnResponse](#GenerateReportCustomerCnResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### downloadReportCustomerCn





```kotlin
platformClient.finance.downloadReportCustomerCn(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [DownloadReportCustomerCnRequest](#DownloadReportCustomerCnRequest) | yes | Request body |




*Returned Response:*




[DownloadReportCustomerCnResponse](#DownloadReportCustomerCnResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getReportingFilters





```kotlin
platformClient.finance.getReportingFilters(filterKey: filterKey, affiliateId: affiliateId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| filterKey | String | yes | filter type. |   
| affiliateId | String? | no | affiliate id. |  





*Returned Response:*




[GetReportingFiltersResponse](#GetReportingFiltersResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [GenerateReportFilters](#GenerateReportFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channel | ArrayList<String>? |  yes  |  |
 | company | ArrayList<String>? |  yes  |  |
 | brand | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GenerateReportMeta](#GenerateReportMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channel | String? |  yes  |  |
 | company | String? |  yes  |  |
 | brand | String? |  yes  |  |

---


 
 
 #### [GenerateReportPlatform](#GenerateReportPlatform)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reportId | String? |  yes  |  |
 | filters | [GenerateReportFilters](#GenerateReportFilters)? |  yes  |  |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |
 | meta | [GenerateReportMeta](#GenerateReportMeta)? |  yes  |  |

---


 
 
 #### [GenerateReportRequest](#GenerateReportRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GenerateReportPlatform](#GenerateReportPlatform)? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | itemTotal | Int? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | current | Int? |  yes  |  |
 | size | Int? |  yes  |  |

---


 
 
 #### [GenerateReportJson](#GenerateReportJson)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCount | Int? |  yes  |  |
 | headers | ArrayList<String>? |  yes  |  |
 | startDate | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |
 | items | ArrayList<ArrayList<String>>? |  yes  |  |
 | endDate | String? |  yes  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | reason | String? |  yes  |  |

---


 
 
 #### [DownloadReport](#DownloadReport)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startDate | String? |  yes  |  |
 | page | Int? |  yes  |  |
 | pagesize | Int? |  yes  |  |
 | endDate | String? |  yes  |  |

---


 
 
 #### [DownloadReportItems](#DownloadReportItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reportId | String? |  yes  |  |
 | filters | [GenerateReportFilters](#GenerateReportFilters)? |  yes  |  |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |
 | meta | [GenerateReportMeta](#GenerateReportMeta)? |  yes  |  |
 | typeOfRequest | String? |  yes  |  |

---


 
 
 #### [DownloadReportList](#DownloadReportList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page)? |  yes  |  |
 | items | ArrayList<[DownloadReportItems](#DownloadReportItems)>? |  yes  |  |
 | itemCount | Int? |  yes  |  |

---


 
 
 #### [GetEngineFilters](#GetEngineFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | configField | String? |  yes  |  |

---


 
 
 #### [GetEngineData](#GetEngineData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | [GetEngineFilters](#GetEngineFilters)? |  yes  |  |
 | tableName | String? |  yes  |  |
 | project | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GetEngineRequest](#GetEngineRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetEngineData](#GetEngineData)? |  yes  |  |

---


 
 
 #### [GetEngineResponse](#GetEngineResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page)? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | itemCount | Int? |  yes  |  |
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
 | success | Boolean? |  yes  |  |
 | data | [GetDocs](#GetDocs)? |  yes  |  |

---


 
 
 #### [GetReportListData](#GetReportListData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | roleName | String? |  yes  |  |
 | listingEnabled | Boolean? |  yes  |  |

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
 | pdfS3Url | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [DownloadCreditDebitNoteResponse](#DownloadCreditDebitNoteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | data | ArrayList<[DownloadCreditDebitNoteResponseData](#DownloadCreditDebitNoteResponseData)>? |  yes  |  |

---


 
 
 #### [PaymentProcessPayload](#PaymentProcessPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modeOfPayment | String? |  yes  |  |
 | totalAmount | String? |  yes  |  |
 | amount | String? |  yes  |  |
 | sourceReference | String? |  yes  |  |
 | platform | String? |  yes  |  |
 | sellerId | String? |  yes  |  |
 | transactionType | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | invoiceNumber | String? |  yes  |  |
 | currency | String? |  yes  |  |

---


 
 
 #### [PaymentProcessRequest](#PaymentProcessRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [PaymentProcessPayload](#PaymentProcessPayload)? |  yes  |  |

---


 
 
 #### [PaymentProcessResponse](#PaymentProcessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | transactionId | String? |  yes  |  |
 | code | Int? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | redirectUrl | String? |  yes  |  |

---


 
 
 #### [CreditlineDataPlatformPayload](#CreditlineDataPlatformPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pagesize | Int? |  yes  |  |
 | endEnd | String? |  yes  |  |
 | startEnd | String? |  yes  |  |
 | sellerId | String? |  yes  |  |
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
 | message | String? |  yes  |  |
 | itemCount | Int? |  yes  |  |
 | headers | ArrayList<String>? |  yes  |  |
 | code | Int? |  yes  |  |
 | items | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | page | HashMap<String,Any>? |  yes  |  |
 | showMr | Boolean? |  yes  |  |

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
 | code | Int? |  yes  |  |
 | isCreditlineOpted | Boolean? |  yes  |  |

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
 | success | Boolean? |  yes  |  |
 | invoiceTypeList | ArrayList<[InvoiceTypeResponseItems](#InvoiceTypeResponseItems)>? |  yes  |  |
 | paymentStatusList | ArrayList<[InvoiceTypeResponseItems](#InvoiceTypeResponseItems)>? |  yes  |  |

---


 
 
 #### [InoviceListingPayloadDataFilters](#InoviceListingPayloadDataFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentStatus | ArrayList<String>? |  yes  |  |
 | invoiceType | ArrayList<String>? |  yes  |  |
 | companyId | ArrayList<String>? |  yes  |  |

---


 
 
 #### [InvoiceListingPayloadData](#InvoiceListingPayloadData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | search | String? |  yes  |  |
 | filters | [InoviceListingPayloadDataFilters](#InoviceListingPayloadDataFilters)? |  yes  |  |
 | startDate | String? |  yes  |  |
 | page | Int? |  yes  |  |
 | endDate | String? |  yes  |  |
 | pageSize | Int? |  yes  |  |

---


 
 
 #### [InvoiceListingRequest](#InvoiceListingRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [InvoiceListingPayloadData](#InvoiceListingPayloadData)? |  yes  |  |

---


 
 
 #### [InvoiceListingResponseItems](#InvoiceListingResponseItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoiceType | String? |  yes  |  |
 | dueDate | String? |  yes  |  |
 | invoiceDate | String? |  yes  |  |
 | period | String? |  yes  |  |
 | status | String? |  yes  |  |
 | amount | String? |  yes  |  |
 | invoiceId | String? |  yes  |  |
 | isDownloadable | Boolean? |  yes  |  |
 | invoiceNumber | String? |  yes  |  |
 | company | String? |  yes  |  |

---


 
 
 #### [UnpaidInvoiceDataItems](#UnpaidInvoiceDataItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency | String? |  yes  |  |
 | totalUnpaidAmount | Double? |  yes  |  |
 | totalUnpaidInvoiceCount | Int? |  yes  |  |

---


 
 
 #### [InvoiceListingResponse](#InvoiceListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page)? |  yes  |  |
 | items | ArrayList<[InvoiceListingResponseItems](#InvoiceListingResponseItems)>? |  yes  |  |
 | itemCount | Int? |  yes  |  |
 | unpaidInvoiceData | [UnpaidInvoiceDataItems](#UnpaidInvoiceDataItems)? |  yes  |  |

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
 | success | Boolean? |  yes  |  |
 | data | ArrayList<String>? |  yes  |  |

---


 
 
 #### [AsCnRefundData](#AsCnRefundData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | toggleEditRequired | Boolean? |  yes  |  |
 | affiliateId | String? |  yes  |  |
 | sellerId | Int? |  yes  |  |

---


 
 
 #### [AsCnRefundRequest](#AsCnRefundRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [AsCnRefundData](#AsCnRefundData)? |  yes  |  |

---


 
 
 #### [AsCnRefundResponseData](#AsCnRefundResponseData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isFirstTimeUser | Boolean? |  yes  |  |

---


 
 
 #### [AsCnRefundResponse](#AsCnRefundResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | data | [AsCnRefundResponseData](#AsCnRefundResponseData)? |  yes  |  |

---


 
 
 #### [CreditNoteConfigNotificationEvents](#CreditNoteConfigNotificationEvents)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | expirationReminderToCustomer | Int? |  yes  |  |

---


 
 
 #### [CreateSellerCreditNoteConfig](#CreateSellerCreditNoteConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateId | String? |  yes  |  |
 | orderingChannel | ArrayList<String>? |  yes  |  |
 | notificationEvents | [CreditNoteConfigNotificationEvents](#CreditNoteConfigNotificationEvents)? |  yes  |  |
 | sellerId | Int? |  yes  |  |
 | sourceChannel | ArrayList<String>? |  yes  |  |
 | validity | Int? |  yes  |  |
 | currencyType | String? |  yes  |  |
 | slugValues | ArrayList<String>? |  yes  |  |
 | salesChannelName | String? |  yes  |  |
 | isCnAsRefundMethod | Boolean? |  yes  |  |

---


 
 
 #### [CreateSellerCreditNoteConfigRequest](#CreateSellerCreditNoteConfigRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [CreateSellerCreditNoteConfig](#CreateSellerCreditNoteConfig)? |  yes  |  |

---


 
 
 #### [CreateSellerCreditNoteConfigResponse](#CreateSellerCreditNoteConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [DeleteConfig](#DeleteConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateId | String? |  yes  |  |
 | slugValues | ArrayList<String>? |  yes  |  |
 | sellerId | Int? |  yes  |  |

---


 
 
 #### [DeleteConfigRequest](#DeleteConfigRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [DeleteConfig](#DeleteConfig)? |  yes  |  |

---


 
 
 #### [DeleteConfigResponse](#DeleteConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [ChannelDisplayName](#ChannelDisplayName)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | platformPos | String? |  yes  |  |

---


 
 
 #### [ChannelDisplayNameResponse](#ChannelDisplayNameResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | data | [ChannelDisplayName](#ChannelDisplayName)? |  yes  |  |

---


 
 
 #### [CnReferenceNumber](#CnReferenceNumber)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cnReferenceNumber | String? |  yes  |  |

---


 
 
 #### [GetPdfUrlViewRequest](#GetPdfUrlViewRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [CnReferenceNumber](#CnReferenceNumber)? |  yes  |  |

---


 
 
 #### [GetPdfUrlViewResponseData](#GetPdfUrlViewResponseData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | s3PdfLink | String? |  yes  |  |
 | cnReferenceNumber | String? |  yes  |  |

---


 
 
 #### [GetPdfUrlViewResponse](#GetPdfUrlViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | data | [GetPdfUrlViewResponseData](#GetPdfUrlViewResponseData)? |  yes  |  |

---


 
 
 #### [CreditNoteDetailsRequest](#CreditNoteDetailsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [CnReferenceNumber](#CnReferenceNumber)? |  yes  |  |

---


 
 
 #### [RedemptionDetails](#RedemptionDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | staffId | String? |  yes  |  |
 | orderingChannel | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | storeId | String? |  yes  |  |
 | amountDebited | Int? |  yes  |  |
 | invoiceNumber | String? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | orderId | String? |  yes  |  |

---


 
 
 #### [CnDetails](#CnDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | staffId | String? |  yes  |  |
 | orderingChannel | String? |  yes  |  |
 | expiryDate | String? |  yes  |  |
 | dateIssued | String? |  yes  |  |
 | channelOfIssuance | String? |  yes  |  |
 | storeId | String? |  yes  |  |
 | invoiceNumber | String? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | orderId | String? |  yes  |  |

---


 
 
 #### [CreditNoteDetails](#CreditNoteDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customerMobileNumber | String? |  yes  |  |
 | availableCnBalance | Int? |  yes  |  |
 | redemptionDetails | ArrayList<[RedemptionDetails](#RedemptionDetails)>? |  yes  |  |
 | cnStatus | String? |  yes  |  |
 | cnDetails | ArrayList<[CnDetails](#CnDetails)>? |  yes  |  |
 | remainingCnAmount | Int? |  yes  |  |
 | cnAmount | Int? |  yes  |  |
 | cnReferenceNumber | String? |  yes  |  |

---


 
 
 #### [CreditNoteDetailsResponse](#CreditNoteDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | data | [CreditNoteDetails](#CreditNoteDetails)? |  yes  |  |

---


 
 
 #### [GetCustomerCreditBalance](#GetCustomerCreditBalance)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateId | String? |  yes  |  |
 | customerMobileNumber | String? |  yes  |  |
 | sellerId | Int? |  yes  |  |

---


 
 
 #### [GetCustomerCreditBalanceRequest](#GetCustomerCreditBalanceRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetCustomerCreditBalance](#GetCustomerCreditBalance)? |  yes  |  |

---


 
 
 #### [GetCustomerCreditBalanceResponseData](#GetCustomerCreditBalanceResponseData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customerMobileNumber | String? |  yes  |  |
 | totalCreditedBalance | Int? |  yes  |  |

---


 
 
 #### [GetCustomerCreditBalanceResponse](#GetCustomerCreditBalanceResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | data | [GetCustomerCreditBalanceResponseData](#GetCustomerCreditBalanceResponseData)? |  yes  |  |

---


 
 
 #### [GetCnConfigRequest](#GetCnConfigRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [DeleteConfig](#DeleteConfig)? |  yes  |  |

---


 
 
 #### [GetCnConfigResponseMeta](#GetCnConfigResponseMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sourceChannel | ArrayList<String>? |  yes  |  |
 | reason | String? |  yes  |  |

---


 
 
 #### [GetCnConfigResponseData](#GetCnConfigResponseData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateId | String? |  yes  |  |
 | redemptionOrderingChannel | ArrayList<String>? |  yes  |  |
 | notificationEvents | [CreditNoteConfigNotificationEvents](#CreditNoteConfigNotificationEvents)? |  yes  |  |
 | sellerId | Int? |  yes  |  |
 | validity | Int? |  yes  |  |
 | meta | [GetCnConfigResponseMeta](#GetCnConfigResponseMeta)? |  yes  |  |
 | currencyType | String? |  yes  |  |
 | isCnAsRefundMethod | Boolean? |  yes  |  |

---


 
 
 #### [GetCnConfigResponse](#GetCnConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | data | [GetCnConfigResponseData](#GetCnConfigResponseData)? |  yes  |  |

---


 
 
 #### [CnGenerateReportFilters](#CnGenerateReportFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | staffId | ArrayList<String>? |  yes  |  |
 | orderingChannel | ArrayList<String>? |  yes  |  |
 | typesOfTransaction | ArrayList<String>? |  yes  |  |
 | channelOfIssuance | ArrayList<String>? |  yes  |  |
 | storeId | ArrayList<Int>? |  yes  |  |
 | utilisation | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CnGenerateReport](#CnGenerateReport)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateId | String? |  yes  |  |
 | search | String? |  yes  |  |
 | pagesize | Int? |  yes  |  |
 | reportId | String? |  yes  |  |
 | filters | [CnGenerateReportFilters](#CnGenerateReportFilters)? |  yes  |  |
 | searchType | String? |  yes  |  |
 | startDate | String? |  yes  |  |
 | page | Int? |  yes  |  |
 | endDate | String? |  yes  |  |
 | meta | [GenerateReportFilters](#GenerateReportFilters)? |  yes  |  |

---


 
 
 #### [GenerateReportCustomerCnRequest](#GenerateReportCustomerCnRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [CnGenerateReport](#CnGenerateReport)? |  yes  |  |

---


 
 
 #### [CnGenerateReportItems](#CnGenerateReportItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | expiryDate | String? |  yes  |  |
 | dateIssued | String? |  yes  |  |
 | totalAmount | Int? |  yes  |  |
 | status | String? |  yes  |  |
 | creditNoteNumber | String? |  yes  |  |
 | invoiceNumber | String? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | orderId | String? |  yes  |  |

---


 
 
 #### [GenerateReportCustomerCnResponse](#GenerateReportCustomerCnResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCount | Int? |  yes  |  |
 | headers | ArrayList<String>? |  yes  |  |
 | startDate | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |
 | items | ArrayList<[CnGenerateReportItems](#CnGenerateReportItems)>? |  yes  |  |
 | endDate | String? |  yes  |  |
 | primaryHeaders | ArrayList<String>? |  yes  |  |
 | allowedFilters | ArrayList<String>? |  yes  |  |
 | rowHeaderDisplayOrder | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [CnDownloadReport](#CnDownloadReport)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | search | String? |  yes  |  |
 | affiliateId | String? |  yes  |  |
 | pagesize | Int? |  yes  |  |
 | status | ArrayList<String>? |  yes  |  |
 | searchType | String? |  yes  |  |
 | startDate | String? |  yes  |  |
 | page | Int? |  yes  |  |
 | endDate | String? |  yes  |  |

---


 
 
 #### [DownloadReportCustomerCnRequest](#DownloadReportCustomerCnRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [CnDownloadReport](#CnDownloadReport)? |  yes  |  |

---


 
 
 #### [DownloadReportResponseData](#DownloadReportResponseData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | requestDict | HashMap<String,Any>? |  yes  |  |
 | filters | HashMap<String,Any>? |  yes  |  |
 | status | String? |  yes  |  |
 | downloadLink | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | reportConfigId | String? |  yes  |  |
 | startDate | String? |  yes  |  |
 | msg | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | endDate | String? |  yes  |  |
 | reportName | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | fullName | String? |  yes  |  |
 | requestedBy | String? |  yes  |  |

---


 
 
 #### [DownloadReportCustomerCnResponse](#DownloadReportCustomerCnResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[DownloadReportResponseData](#DownloadReportResponseData)>? |  yes  |  |

---


 
 
 #### [GetReportingFilters](#GetReportingFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | options | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | value | String? |  yes  |  |
 | type | String? |  yes  |  |
 | text | String? |  yes  |  |

---


 
 
 #### [GetReportingNestedFilters](#GetReportingNestedFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | options | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | value | String? |  yes  |  |
 | text | String? |  yes  |  |
 | required | Boolean? |  yes  |  |
 | placeholderText | String? |  yes  |  |

---


 
 
 #### [GetReportingFiltersResponse](#GetReportingFiltersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | [GetReportingFilters](#GetReportingFilters)? |  yes  |  |
 | search | [GetReportingFilters](#GetReportingFilters)? |  yes  |  |
 | filters | ArrayList<[GetReportingNestedFilters](#GetReportingNestedFilters)>? |  yes  |  |

---



