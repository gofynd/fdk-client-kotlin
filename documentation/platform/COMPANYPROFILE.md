



##### [Back to Platform docs](./README.md)

## CompanyProfile Methods

* [cbsOnboardGet](#cbsonboardget)
* [updateCompany](#updatecompany)
* [getCompanyMetrics](#getcompanymetrics)
* [getBrand](#getbrand)
* [editBrand](#editbrand)
* [createBrand](#createbrand)
* [getBrands](#getbrands)
* [createCompanyBrandMapping](#createcompanybrandmapping)
* [getLocations](#getlocations)
* [createLocation](#createlocation)
* [getLocationDetail](#getlocationdetail)
* [updateLocation](#updatelocation)
* [createLocationBulk](#createlocationbulk)



## Methods with example and description


### cbsOnboardGet
Get company profile




```kotlin
client.companyprofile.cbsOnboardGet().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






This API allows to view the company profile of the seller account.

*Returned Response:*




[GetCompanyProfileSerializerResponse](#GetCompanyProfileSerializerResponse)

Company profile object. See example below or refer `GetCompanyProfileSerializerResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "documents": [
    {
      "verified": true,
      "legal_name": "SHOPSENSE RETAIL TECHNOLOGIES PRIVATE LIMITED",
      "value": "AALCA0442L",
      "type": "pan"
    }
  ],
  "created_by": {
    "user_id": "123",
    "username": "917827311650_22960"
  },
  "business_info": "I sell",
  "franchise_enabled": true,
  "company_type": "mbo",
  "warnings": {},
  "business_details": {
    "website": {
      "url": "https://www.google.com"
    }
  },
  "addresses": [
    {
      "country": "India",
      "longitude": 72.8231511,
      "state": "Maharashtra",
      "address1": "A/204, Sai Vandan, Tulinj Road. Nallasopara East, ",
      "country_code": "IN",
      "latitude": 19.4232024,
      "pincode": 401209,
      "address_type": "office",
      "city": "Mumbai"
    },
    {
      "country": "India",
      "longitude": 72.8231511,
      "state": "Maharashtra",
      "address1": "A/204, Sai Vandan, Tulinj Road. Nallasopara East, ",
      "country_code": "IN",
      "latitude": 19.4232024,
      "pincode": 401209,
      "address_type": "registered",
      "city": "Mumbai"
    }
  ],
  "modified_by": {
    "user_id": "123",
    "username": "917827311650_22960"
  },
  "notification_emails": [
    "gaurangpatel@gofynd.com"
  ],
  "business_type": "huf",
  "name": "Cache Company",
  "stage": "verified",
  "uid": 1,
  "business_country_info": {
    "country": "India",
    "country_code": "IN"
  }
}
```
</details>









---


### updateCompany
Edit company profile




```kotlin
client.companyprofile.updateCompany(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UpdateCompany](#UpdateCompany) | yes | Request body |


This API allows to edit the company profile of the seller account.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success message




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "success": true
}
```
</details>









---


### getCompanyMetrics
Get company metrics




```kotlin
client.companyprofile.getCompanyMetrics().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






This API allows to view the company metrics, i.e. the status of its brand and stores. Also its allows to view the number of products, company documents & store documents which are verified and unverified.

*Returned Response:*




[MetricsSerializer](#MetricsSerializer)

Metrics response object. See example below or refer `MetricsSerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "stage": "complete",
  "store": {
    "verified": 1,
    "pending": 1
  },
  "brand": {
    "verified": 1,
    "pending": 1
  },
  "product": {
    "verified": 0,
    "pending": 0
  },
  "company_documents": {
    "verified": 1,
    "pending": 0
  },
  "store_documents": {
    "verified": 0,
    "pending": 2
  }
}
```
</details>









---


### getBrand
Get a single brand.




```kotlin
client.companyprofile.getBrand(brandId: brandId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| brandId | String | yes | Id of the brand to be viewed. |  



This API helps to get data associated to a particular brand.

*Returned Response:*




[GetBrandResponseSerializer](#GetBrandResponseSerializer)

Brand object. See example below or refer `GetBrandResponseSerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "stage": "verified",
  "_custom_json": {},
  "uid": 1,
  "logo": "http://cdn4.gofynd.com/media/logo/brand/original/4597_40d1ce44d61940d4829a3c54951bd9ee.jpg",
  "warnings": {},
  "_locale_language": {},
  "name": "edited brand",
  "slug_key": "brand-2",
  "banner": {
    "portrait": "http://cdn4.gofynd.com/media/banner_portrait/brand/original/7021_16fc50205c40477daf419b64ec64c64c.jpg",
    "landscape": "http://cdn4.gofynd.com/media/banner/brand/original/7020_f9e91f7d501c4f2985c09bd196ed304d.jpg"
  },
  "created_by": {
    "username": "silverbolt",
    "user_id": "0"
  },
  "modified_by": {
    "username": "917827311650_22960",
    "user_id": "123"
  },
  "verified_by": {
    "username": "917827311650_22960",
    "user_id": "123"
  },
  "synonyms": [
    "xyz"
  ]
}
```
</details>









---


### editBrand
Edit a brand.




```kotlin
client.companyprofile.editBrand(brandId: brandId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| brandId | String | yes | Id of the brand to be viewed. |  
| body | [CreateUpdateBrandRequestSerializer](#CreateUpdateBrandRequestSerializer) | yes | Request body |


This API allows to edit meta of a brand.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "success": true
}
```
</details>









---


### createBrand
Create a Brand.




```kotlin
client.companyprofile.createBrand(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateUpdateBrandRequestSerializer](#CreateUpdateBrandRequestSerializer) | yes | Request body |


This API allows to create a brand associated to a company.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "success": true
}
```
</details>









---


### getBrands
Get brands associated to a company




```kotlin
client.companyprofile.getBrands(pageNo: pageNo, pageSize: pageSize, q: q).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Int? | no | The page number to navigate through the given set of results |   
| pageSize | Int? | no | Number of items to retrieve in each page. Default is 10. |   
| q | String? | no | Search term for name. |  



This API helps to get view brands associated to a particular company.

*Returned Response:*




[CompanyBrandListSerializer](#CompanyBrandListSerializer)

Brand object. See example below or refer `CompanyBrandListSerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "brand": {
        "stage": "complete",
        "uid": 2,
        "banner": {
          "portrait": "http://cdn4.gofynd.com/media/banner_portrait/brand/original/7021_16fc50205c40477daf419b64ec64c64c.jpg",
          "landscape": "http://cdn4.gofynd.com/media/banner/brand/original/7020_f9e91f7d501c4f2985c09bd196ed304d.jpg"
        },
        "modified_by": {
          "user_id": "123",
          "username": "917827311650_22960"
        },
        "slug_key": "test-post",
        "synonyms": [
          "xyz"
        ],
        "created_on": "2021-02-25T15:21:57.666000+00:00",
        "created_by": {
          "user_id": "123",
          "username": "917827311650_22960"
        },
        "modified_on": "2021-02-25T15:21:57.666000+00:00",
        "name": "test_post",
        "logo": "http://cdn4.gofynd.com/media/logo/brand/original/4597_40d1ce44d61940d4829a3c54951bd9ee.jpg"
      },
      "stage": "complete",
      "uid": 2,
      "modified_by": {
        "user_id": "123",
        "username": "917827311650_22960"
      },
      "company": {
        "business_type": "huf",
        "stage": "complete",
        "uid": 1,
        "addresses": [
          {
            "city": "Mumbai Suburban",
            "latitude": 19.058461,
            "longitude": 72.871395,
            "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
            "country_code": "IN",
            "state": "Maharashtra",
            "country": "India",
            "pincode": 400070,
            "address_type": "office"
          },
          {
            "city": "Mumbai Suburban",
            "latitude": 19.058461,
            "longitude": 72.871395,
            "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
            "country_code": "IN",
            "state": "Maharashtra",
            "country": "India",
            "pincode": 400070,
            "address_type": "registered"
          }
        ],
        "modified_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "company_type": "mbo",
        "created_on": "2021-02-25T15:21:51.526000+00:00",
        "created_by": {
          "user_id": "123",
          "username": "917827311650_22960"
        },
        "modified_on": "2021-02-25T17:44:55.722000+00:00",
        "name": "Cache Company"
      },
      "created_by": {
        "user_id": "123",
        "username": "917827311650_22960"
      }
    }
  ],
  "page": {
    "current": 1,
    "size": 1,
    "has_previous": false,
    "has_next": false,
    "item_count": 1
  }
}
```
</details>









---


### createCompanyBrandMapping
Create a company brand mapping.




```kotlin
client.companyprofile.createCompanyBrandMapping(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CompanyBrandPostRequestSerializer](#CompanyBrandPostRequestSerializer) | yes | Request body |


This API allows to create a company brand mapping, for a already existing brand in the system.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true
}
```
</details>









---


### getLocations
Get list of locations




```kotlin
client.companyprofile.getLocations(storeType: storeType, q: q, stage: stage, pageNo: pageNo, pageSize: pageSize, locationIds: locationIds).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| storeType | String? | no | Helps to sort the location list on the basis of location type. |   
| q | String? | no | Query that is to be searched. |   
| stage | String? | no | to filter companies on basis of verified or unverified companies. |   
| pageNo | Int? | no | The page number to navigate through the given set of results |   
| pageSize | Int? | no | Number of items to retrieve in each page. Default is 10. |   
| locationIds | ArrayList<Int>? | no | Helps to filter stores on the basis of uids. |  



This API allows to view all the locations associated to a company.

*Returned Response:*




[LocationListSerializer](#LocationListSerializer)

Company profile object. See example below or refer `LocationListSerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "company": {
        "business_type": "huf",
        "stage": "complete",
        "uid": 1,
        "addresses": [
          {
            "city": "Mumbai Suburban",
            "latitude": 19.058461,
            "longitude": 72.871395,
            "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
            "country_code": "IN",
            "state": "Maharashtra",
            "country": "India",
            "pincode": 400070,
            "address_type": "office"
          },
          {
            "city": "Mumbai Suburban",
            "latitude": 19.058461,
            "longitude": 72.871395,
            "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
            "country_code": "IN",
            "state": "Maharashtra",
            "country": "India",
            "pincode": 400070,
            "address_type": "registered"
          }
        ],
        "modified_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "company_type": "mbo",
        "created_on": "2021-02-25T15:21:51.526000+00:00",
        "created_by": {
          "user_id": "123",
          "username": "917827311650_22960"
        },
        "modified_on": "2021-02-25T17:44:55.722000+00:00",
        "name": "Cache Company"
      },
      "address": {
        "city": "MUMBAI",
        "latitude": 19.4232024,
        "longitude": 72.8231511,
        "address1": "A/204, SAI VANDAN, NARAYAN NAGAR, TULINJ ROAD",
        "state": "MAHARASHTRA",
        "country": "INDIA",
        "pincode": 401209
      },
      "timing": [
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "monday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "tuesday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "wednesday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "thursday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "friday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "saturday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "sunday"
        }
      ],
      "documents": [],
      "display_name": "new store",
      "manager": {
        "name": "Yrf",
        "mobile_no": {
          "country_code": 91,
          "number": "83456774567"
        },
        "email": "gbp@jkl.com"
      },
      "code": "code2",
      "product_return_config": {
        "on_same_store": true
      },
      "created_on": "2021-02-25T15:22:04.913000+00:00",
      "created_by": {
        "user_id": "123",
        "username": "917827311650_22960"
      },
      "name": "location2",
      "gst_credentials": {
        "e_invoice": {
          "enabled": false
        }
      },
      "store_type": "high_street",
      "contact_numbers": [
        {
          "country_code": 91,
          "number": "7208229698"
        }
      ],
      "stage": "complete",
      "uid": 2,
      "notification_emails": []
    }
  ],
  "page": {
    "current": 1,
    "size": 1,
    "has_previous": false,
    "has_next": false,
    "item_count": 1
  }
}
```
</details>









---


### createLocation
Create a location associated to a company.




```kotlin
client.companyprofile.createLocation(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [LocationSerializer](#LocationSerializer) | yes | Request body |


This API allows to edit a location associated to a company.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "success": true
}
```
</details>









---


### getLocationDetail
Get details of a specific location.




```kotlin
client.companyprofile.getLocationDetail(locationId: locationId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| locationId | String | yes | Id of the location which you want to view. |  



This API helps to get data associated to a specific location.

*Returned Response:*




[GetLocationSerializer](#GetLocationSerializer)

Brand object. See example below or refer `GetLocationSerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "verified_on": "2021-02-25T15:22:07.140000+00:00",
  "company": {
    "business_type": "huf",
    "stage": "complete",
    "uid": 1,
    "addresses": [
      {
        "city": "Mumbai Suburban",
        "latitude": 19.058461,
        "longitude": 72.871395,
        "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
        "country_code": "IN",
        "state": "Maharashtra",
        "country": "India",
        "pincode": 400070,
        "address_type": "office"
      },
      {
        "city": "Mumbai Suburban",
        "latitude": 19.058461,
        "longitude": 72.871395,
        "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
        "country_code": "IN",
        "state": "Maharashtra",
        "country": "India",
        "pincode": 400070,
        "address_type": "registered"
      }
    ],
    "modified_by": {
      "user_id": "-1",
      "username": "silverbolt"
    },
    "company_type": "mbo",
    "created_by": {
      "user_id": "123",
      "username": "917827311650_22960"
    },
    "name": "Cache Company"
  },
  "address": {
    "city": "MUMBAI",
    "landmark": "",
    "latitude": 19.4232024,
    "longitude": 72.8231511,
    "address2": "",
    "address1": "A/204, SAI VANDAN, NARAYAN NAGAR, TULINJ ROAD",
    "state": "MAHARASHTRA",
    "country": "INDIA",
    "pincode": 401209
  },
  "timing": [
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "monday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "tuesday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "wednesday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "thursday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "friday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "saturday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "sunday"
    }
  ],
  "documents": [],
  "warnings": {},
  "display_name": "new store",
  "manager": {
    "name": "Yrf",
    "mobile_no": {
      "country_code": 91,
      "number": "83456774567"
    },
    "email": "gbp@jkl.com"
  },
  "code": "store1",
  "product_return_config": {
    "on_same_store": true
  },
  "modified_by": {
    "user_id": "-1",
    "username": "silverbolt"
  },
  "created_by": {
    "user_id": "123",
    "username": "917827311650_22960"
  },
  "name": "edited_store",
  "gst_credentials": {
    "e_invoice": {
      "enabled": false
    }
  },
  "verified_by": {
    "user_id": "-1",
    "username": "silverbolt"
  },
  "store_type": "high_street",
  "contact_numbers": [
    {
      "country_code": 91,
      "number": "7208229698"
    }
  ],
  "stage": "verified",
  "uid": 1,
  "notification_emails": []
}
```
</details>









---


### updateLocation
Edit a location asscoiated to a company.




```kotlin
client.companyprofile.updateLocation(locationId: locationId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| locationId | String | yes | Id of the location which you want to edit. |  
| body | [LocationSerializer](#LocationSerializer) | yes | Request body |


This API allows to edit a location associated to a company.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "success": true
}
```
</details>









---


### createLocationBulk
Create a location asscoiated to a company in bulk.




```kotlin
client.companyprofile.createLocationBulk(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [BulkLocationSerializer](#BulkLocationSerializer) | yes | Request body |


This API allows to create a location associated to a company.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "10 stores inserted",
  "success": true
}
```
</details>









---



### Schemas

 
 
 #### [GetAddressSerializer](#GetAddressSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address2 | String? |  yes  |  |
 | pincode | Int? |  yes  |  |
 | latitude | Double? |  yes  |  |
 | landmark | String? |  yes  |  |
 | city | String? |  yes  |  |
 | longitude | Double? |  yes  |  |
 | address1 | String? |  yes  |  |
 | addressType | String? |  yes  |  |
 | country | String? |  yes  |  |
 | state | String? |  yes  |  |
 | countryCode | String? |  yes  |  |

---


 
 
 #### [CompanyTaxesSerializer](#CompanyTaxesSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rate | Double? |  yes  |  |
 | enable | Boolean? |  yes  |  |
 | effectiveDate | String? |  yes  |  |

---


 
 
 #### [Document](#Document)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | verified | Boolean? |  yes  |  |
 | url | String? |  yes  |  |
 | value | String |  no  |  |
 | legalName | String? |  yes  |  |

---


 
 
 #### [UserSerializer](#UserSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | contact | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [SellerPhoneNumber](#SellerPhoneNumber)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | String |  no  |  |
 | countryCode | Int |  no  |  |

---


 
 
 #### [ContactDetails](#ContactDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)>? |  yes  |  |
 | emails | ArrayList<String>? |  yes  |  |

---


 
 
 #### [Website](#Website)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |

---


 
 
 #### [BusinessDetails](#BusinessDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | website | [Website](#Website)? |  yes  |  |

---


 
 
 #### [BusinessCountryInfo](#BusinessCountryInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String? |  yes  |  |
 | countryCode | String? |  yes  |  |

---


 
 
 #### [GetCompanyProfileSerializerResponse](#GetCompanyProfileSerializerResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addresses | ArrayList<[GetAddressSerializer](#GetAddressSerializer)>? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | stage | String? |  yes  |  |
 | taxes | ArrayList<[CompanyTaxesSerializer](#CompanyTaxesSerializer)>? |  yes  |  |
 | mode | String? |  yes  |  |
 | warnings | HashMap<String,Any>? |  yes  |  |
 | documents | ArrayList<[Document](#Document)>? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | contactDetails | [ContactDetails](#ContactDetails)? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | companyType | String |  no  |  |
 | businessDetails | [BusinessDetails](#BusinessDetails)? |  yes  |  |
 | uid | Int |  no  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | businessInfo | String? |  yes  |  |
 | franchiseEnabled | Boolean? |  yes  |  |
 | name | String? |  yes  |  |
 | businessCountryInfo | [BusinessCountryInfo](#BusinessCountryInfo)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | businessType | String |  no  |  |
 | createdOn | String? |  yes  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | HashMap<String,Any>? |  yes  |  |
 | status | Int? |  yes  |  |
 | message | String? |  yes  |  |
 | code | String? |  yes  |  |

---


 
 
 #### [CreateUpdateAddressSerializer](#CreateUpdateAddressSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | Int |  no  |  |
 | address2 | String? |  yes  |  |
 | latitude | Double |  no  |  |
 | landmark | String? |  yes  |  |
 | city | String |  no  |  |
 | longitude | Double |  no  |  |
 | address1 | String |  no  |  |
 | addressType | String |  no  |  |
 | country | String |  no  |  |
 | state | String |  no  |  |
 | countryCode | String? |  yes  |  |

---


 
 
 #### [CompanyTaxesSerializer1](#CompanyTaxesSerializer1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rate | Double? |  yes  |  |
 | enable | Boolean? |  yes  |  |
 | effectiveDate | String? |  yes  |  |

---


 
 
 #### [UpdateCompany](#UpdateCompany)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addresses | ArrayList<[CreateUpdateAddressSerializer](#CreateUpdateAddressSerializer)>? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | franchiseEnabled | Boolean? |  yes  |  |
 | companyType | String? |  yes  |  |
 | name | String? |  yes  |  |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | businessDetails | [BusinessDetails](#BusinessDetails)? |  yes  |  |
 | taxes | ArrayList<[CompanyTaxesSerializer1](#CompanyTaxesSerializer1)>? |  yes  |  |
 | rejectReason | String? |  yes  |  |
 | businessType | String? |  yes  |  |
 | contactDetails | [ContactDetails](#ContactDetails)? |  yes  |  |
 | businessInfo | String? |  yes  |  |
 | warnings | HashMap<String,Any>? |  yes  |  |
 | documents | ArrayList<[Document](#Document)>? |  yes  |  |

---


 
 
 #### [ProfileSuccessResponse](#ProfileSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | uid | Int? |  yes  |  |

---


 
 
 #### [DocumentsObj](#DocumentsObj)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Int? |  yes  |  |
 | pending | Int? |  yes  |  |

---


 
 
 #### [MetricsSerializer](#MetricsSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | [DocumentsObj](#DocumentsObj)? |  yes  |  |
 | stage | String? |  yes  |  |
 | storeDocuments | [DocumentsObj](#DocumentsObj)? |  yes  |  |
 | store | [DocumentsObj](#DocumentsObj)? |  yes  |  |
 | uid | Int? |  yes  |  |
 | companyDocuments | [DocumentsObj](#DocumentsObj)? |  yes  |  |
 | product | [DocumentsObj](#DocumentsObj)? |  yes  |  |

---


 
 
 #### [BrandBannerSerializer](#BrandBannerSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | portrait | String? |  yes  |  |
 | landscape | String? |  yes  |  |

---


 
 
 #### [GetBrandResponseSerializer](#GetBrandResponseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stage | String? |  yes  |  |
 | rejectReason | String? |  yes  |  |
 | mode | String? |  yes  |  |
 | warnings | HashMap<String,Any>? |  yes  |  |
 | logo | String? |  yes  |  |
 | description | String? |  yes  |  |
 | synonyms | ArrayList<String>? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | banner | [BrandBannerSerializer](#BrandBannerSerializer)? |  yes  |  |
 | uid | Int? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | name | String |  no  |  |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | slugKey | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | localeLanguage | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [CreateUpdateBrandRequestSerializer](#CreateUpdateBrandRequestSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandTier | String? |  yes  |  |
 | logo | String |  no  |  |
 | name | String |  no  |  |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | description | String? |  yes  |  |
 | synonyms | ArrayList<String>? |  yes  |  |
 | banner | [BrandBannerSerializer](#BrandBannerSerializer)? |  yes  |  |
 | uid | Int? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | localeLanguage | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [CompanySocialAccounts](#CompanySocialAccounts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [CompanyDetails](#CompanyDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | socials | ArrayList<[CompanySocialAccounts](#CompanySocialAccounts)>? |  yes  |  |
 | websiteUrl | String? |  yes  |  |

---


 
 
 #### [CompanySerializer](#CompanySerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addresses | ArrayList<[GetAddressSerializer](#GetAddressSerializer)>? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | name | String? |  yes  |  |
 | companyType | String |  no  |  |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | stage | String? |  yes  |  |
 | businessCountryInfo | [BusinessCountryInfo](#BusinessCountryInfo)? |  yes  |  |
 | details | [CompanyDetails](#CompanyDetails)? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | uid | Int? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | businessType | String |  no  |  |
 | rejectReason | String? |  yes  |  |
 | marketChannels | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CompanyBrandSerializer](#CompanyBrandSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | brand | [GetBrandResponseSerializer](#GetBrandResponseSerializer)? |  yes  |  |
 | stage | String? |  yes  |  |
 | warnings | HashMap<String,Any>? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | uid | Int? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | company | [CompanySerializer](#CompanySerializer)? |  yes  |  |
 | rejectReason | String? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | nextId | String? |  yes  |  |
 | current | Int? |  yes  |  |
 | itemTotal | Int? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | size | Int? |  yes  |  |

---


 
 
 #### [CompanyBrandListSerializer](#CompanyBrandListSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CompanyBrandSerializer](#CompanyBrandSerializer)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [CompanyBrandPostRequestSerializer](#CompanyBrandPostRequestSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Int? |  yes  |  |
 | brands | ArrayList<Int> |  no  |  |
 | company | Int |  no  |  |

---


 
 
 #### [ProductReturnConfigSerializer](#ProductReturnConfigSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeUid | Int? |  yes  |  |
 | onSameStore | Boolean? |  yes  |  |

---


 
 
 #### [LocationTimingSerializer](#LocationTimingSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | minute | Int |  no  |  |
 | hour | Int |  no  |  |

---


 
 
 #### [LocationDayWiseSerializer](#LocationDayWiseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | open | Boolean |  no  |  |
 | weekday | String |  no  |  |
 | closing | [LocationTimingSerializer](#LocationTimingSerializer)? |  yes  |  |
 | opening | [LocationTimingSerializer](#LocationTimingSerializer)? |  yes  |  |

---


 
 
 #### [InvoiceCredSerializer](#InvoiceCredSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | password | String? |  yes  |  |
 | username | String? |  yes  |  |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [InvoiceDetailsSerializer](#InvoiceDetailsSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eWaybill | [InvoiceCredSerializer](#InvoiceCredSerializer)? |  yes  |  |
 | eInvoice | [InvoiceCredSerializer](#InvoiceCredSerializer)? |  yes  |  |

---


 
 
 #### [GetCompanySerializer](#GetCompanySerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addresses | ArrayList<[GetAddressSerializer](#GetAddressSerializer)>? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | name | String? |  yes  |  |
 | companyType | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | uid | Int? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | businessType | String? |  yes  |  |
 | rejectReason | String? |  yes  |  |

---


 
 
 #### [LocationManagerSerializer](#LocationManagerSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobileNo | [SellerPhoneNumber](#SellerPhoneNumber) |  no  |  |
 | name | String? |  yes  |  |
 | email | String? |  yes  |  |

---


 
 
 #### [GetLocationSerializer](#GetLocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | stage | String? |  yes  |  |
 | displayName | String |  no  |  |
 | code | String |  no  |  |
 | warnings | HashMap<String,Any>? |  yes  |  |
 | documents | ArrayList<[Document](#Document)>? |  yes  |  |
 | productReturnConfig | [ProductReturnConfigSerializer](#ProductReturnConfigSerializer)? |  yes  |  |
 | timing | ArrayList<[LocationDayWiseSerializer](#LocationDayWiseSerializer)>? |  yes  |  |
 | gstCredentials | [InvoiceDetailsSerializer](#InvoiceDetailsSerializer)? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | phoneNumber | String |  no  |  |
 | company | [GetCompanySerializer](#GetCompanySerializer)? |  yes  |  |
 | manager | [LocationManagerSerializer](#LocationManagerSerializer)? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | uid | Int? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | address | [GetAddressSerializer](#GetAddressSerializer) |  no  |  |
 | storeType | String? |  yes  |  |
 | name | String |  no  |  |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | contactNumbers | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)>? |  yes  |  |

---


 
 
 #### [LocationListSerializer](#LocationListSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetLocationSerializer](#GetLocationSerializer)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [LocationSerializer](#LocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | [GetAddressSerializer](#GetAddressSerializer) |  no  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | storeType | String? |  yes  |  |
 | name | String |  no  |  |
 | customJson | HashMap<String,Any>? |  yes  |  |
 | stage | String? |  yes  |  |
 | timing | ArrayList<[LocationDayWiseSerializer](#LocationDayWiseSerializer)>? |  yes  |  |
 | displayName | String |  no  |  |
 | gstCredentials | [InvoiceDetailsSerializer](#InvoiceDetailsSerializer)? |  yes  |  |
 | code | String |  no  |  |
 | manager | [LocationManagerSerializer](#LocationManagerSerializer)? |  yes  |  |
 | uid | Int? |  yes  |  |
 | company | Int |  no  |  |
 | warnings | HashMap<String,Any>? |  yes  |  |
 | documents | ArrayList<[Document](#Document)>? |  yes  |  |
 | contactNumbers | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)>? |  yes  |  |
 | productReturnConfig | [ProductReturnConfigSerializer](#ProductReturnConfigSerializer)? |  yes  |  |

---


 
 
 #### [BulkLocationSerializer](#BulkLocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[LocationSerializer](#LocationSerializer)>? |  yes  |  |

---



