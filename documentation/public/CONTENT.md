



##### [Back to Public docs](./README.md)

## Content Methods
Content System

Default
* [getCredentialsByEntity](#getcredentialsbyentity)




## Methods with example and description



### getCredentialsByEntity
Get credentials to power chat support systems




```kotlin
publicClient.content.getCredentialsByEntity(entity: entity).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| entity | String? | no | Server Type |  



Get credentials for support system

*Returned Response:*




[CredentialsSchema](#CredentialsSchema)

Success. Refer `CredentialsSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; default</i></summary>

```json
{
  "value": {
    "entity_type": "partner",
    "type": "freshchat",
    "is_enable": true,
    "configuration": {
      "token": "a3e4gf20b-d11g-4512-n3zq-03b9aa7e1yxz",
      "siteId": "a3e8f20b-d97f-452f-bd72-03b9aa7e1bf0",
      "host": "https://wchat.freshchat.com"
    }
  }
}
```
</details>

</details>









---




### Schemas

 
 
 #### [CredentialSchema](#CredentialSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | configuration | HashMap<String,Any>? |  yes  |  |
 | entityType | String? |  yes  |  |
 | type | String? |  yes  |  |
 | isEnable | Boolean? |  yes  |  |

---


 
 
 #### [CredentialsSchema](#CredentialsSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CredentialSchema](#CredentialSchema)>? |  yes  |  |

---


 
 
 #### [ContentAPIError](#ContentAPIError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | status | Double? |  yes  |  |
 | code | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | info | String? |  yes  |  |
 | requestId | String? |  yes  |  |
 | stackTrace | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |

---



