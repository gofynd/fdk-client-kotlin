



##### [Back to Public docs](./README.md)

## Billing Methods
Handle public plans

Default
* [getStandardPlans](#getstandardplans)
* [getPlanDetails](#getplandetails)




## Methods with example and description



### getStandardPlans
Get Standard/Public Plans




```kotlin
publicClient.billing.getStandardPlans(platformType: platformType).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| platformType | String | yes | The type of platform for which plans are requested. |  



Get Standard/Public Plans.


*Returned Response:*




[DetailList](#DetailList)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getPlanDetails
Get plan details




```kotlin
publicClient.billing.getPlanDetails(planId: planId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| planId | String | yes | Plan unique id. |  



Get plan details.


*Returned Response:*




[PlanDetails](#PlanDetails)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---




### Schemas

 
 
 #### [InternalServerError](#InternalServerError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  | Internal server Server error |
 | code | String? |  yes  | Error code |

---


 
 
 #### [PlanRecurring](#PlanRecurring)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | interval | String? |  yes  |  |
 | intervalCount | Double? |  yes  |  |

---


 
 
 #### [Plan](#Plan)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recurring | [PlanRecurring](#PlanRecurring)? |  yes  |  |
 | isTrialPlan | Boolean? |  yes  |  |
 | planGroup | String? |  yes  |  |
 | tagLines | ArrayList<String>? |  yes  |  |
 | currency | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isVisible | Boolean? |  yes  |  |
 | trialPeriod | Double? |  yes  |  |
 | addons | ArrayList<String>? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | type | String? |  yes  |  |
 | country | String? |  yes  |  |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | description | String? |  yes  |  |
 | amount | Double? |  yes  |  |
 | productSuiteId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | modifiedAt | String? |  yes  |  |

---


 
 
 #### [DetailList](#DetailList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | plans | ArrayList<[Plan](#Plan)>? |  yes  |  |
 | trialPlan | [Plan](#Plan)? |  yes  |  |
 | componentGroups | ArrayList<String>? |  yes  |  |

---


 
 
 #### [PlanTaxation](#PlanTaxation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gst | Double? |  yes  |  |

---


 
 
 #### [OneTimeFees](#OneTimeFees)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | developement | Int? |  yes  |  |
 | marketing | Int? |  yes  |  |

---


 
 
 #### [CreditLine](#CreditLine)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [PlanMeta](#PlanMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | planPlatformDisplayName | String? |  yes  |  |

---


 
 
 #### [FeatureConfig](#FeatureConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [PlanConfig](#PlanConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean? |  yes  |  |
 | displayText | String? |  yes  |  |
 | isDefault | Boolean? |  yes  |  |
 | processingType | String? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | featureConfig | [FeatureConfig](#FeatureConfig)? |  yes  |  |
 | id | String? |  yes  |  |
 | componentId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | modifiedAt | String? |  yes  |  |

---


 
 
 #### [ComponentsSchema](#ComponentsSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | description | String? |  yes  |  |
 | group | String? |  yes  |  |
 | icon | String? |  yes  |  |
 | links | HashMap<String,Any>? |  yes  |  |
 | config | [PlanConfig](#PlanConfig)? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | displayText | String? |  yes  |  |

---


 
 
 #### [PlanDetails](#PlanDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recurring | [PlanRecurring](#PlanRecurring)? |  yes  |  |
 | isTrialPlan | Boolean? |  yes  |  |
 | planGroup | String? |  yes  |  |
 | tagLines | ArrayList<String>? |  yes  |  |
 | currency | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isVisible | Boolean? |  yes  |  |
 | trialPeriod | Double? |  yes  |  |
 | addons | ArrayList<String>? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | type | String? |  yes  |  |
 | country | String? |  yes  |  |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | description | String? |  yes  |  |
 | amount | Double? |  yes  |  |
 | productSuiteId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | modifiedAt | String? |  yes  |  |
 | taxation | [PlanTaxation](#PlanTaxation)? |  yes  |  |
 | oneTimeFees | [OneTimeFees](#OneTimeFees)? |  yes  |  |
 | creditLine | [CreditLine](#CreditLine)? |  yes  |  |
 | currentStatus | String? |  yes  |  |
 | meta | [PlanMeta](#PlanMeta)? |  yes  |  |
 | components | ArrayList<[ComponentsSchema](#ComponentsSchema)>? |  yes  |  |

---



