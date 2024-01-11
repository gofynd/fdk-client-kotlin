



##### [Back to Public docs](./README.md)

## Billing Methods
Handle public plans

Default
* [getStandardPlans](#getstandardplans)




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



