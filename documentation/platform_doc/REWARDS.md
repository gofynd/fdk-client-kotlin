



##### [Back to Platform docs](./README.md)

## Rewards Methods
Rewards
* [getGiveaways](#getgiveaways)
* [createGiveaway](#creategiveaway)
* [getGiveawayByID](#getgiveawaybyid)
* [updateGiveaway](#updategiveaway)
* [getOffers](#getoffers)
* [getOfferByName](#getofferbyname)
* [updateOfferByName](#updateofferbyname)
* [getUserAvailablePoints](#getuseravailablepoints)
* [updateUserStatus](#updateuserstatus)
* [getUserPointsHistory](#getuserpointshistory)



## Methods with example and description


### getGiveaways
List of giveaways of the current application.




```kotlin
client.application("<APPLICATION_ID>").rewards.getGiveaways(pageId: pageId, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | company id |   
| applicationId | String | yes | application id |   
| pageId | String? | no | pagination page id |   
| pageSize | Int? | no | pagination page size |  



List of giveaways of the current application.

*Returned Response:*




[GiveawayResponse](#GiveawayResponse)

ok




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createGiveaway
Adds a new giveaway.




```kotlin
client.application("<APPLICATION_ID>").rewards.createGiveaway(body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | company id |   
| applicationId | String | yes | application id |  
| body | [Giveaway](#Giveaway) | yes | Request body |


Adds a new giveaway.

*Returned Response:*




[Giveaway](#Giveaway)

ok




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getGiveawayByID
Get giveaway by ID.




```kotlin
client.application("<APPLICATION_ID>").rewards.getGiveawayByID(id: id).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | company id |   
| applicationId | String | yes | application id |   
| id | String | yes | Giveaway ID |  



Get giveaway by ID.

*Returned Response:*




[Giveaway](#Giveaway)

ok




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateGiveaway
Updates the giveaway by it's ID.




```kotlin
client.application("<APPLICATION_ID>").rewards.updateGiveaway(id: id, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | company id |   
| applicationId | String | yes | application id |   
| id | String | yes | Giveaway ID |  
| body | [Giveaway](#Giveaway) | yes | Request body |


Updates the giveaway by it's ID.

*Returned Response:*




[Giveaway](#Giveaway)

ok




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOffers
List of offer of the current application.




```kotlin
client.application("<APPLICATION_ID>").rewards.getOffers().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | company id |   
| applicationId | String | yes | application id |  



List of offer of the current application.

*Returned Response:*




[ArrayList<Offer>](#ArrayList<Offer>)

ok




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOfferByName
Get offer by name.




```kotlin
client.application("<APPLICATION_ID>").rewards.getOfferByName(cookie: cookie, name: name).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | company id |   
| applicationId | String | yes | application id |   
| cookie | String | yes | User's session cookie. This cookie is set in browser cookie when logged-in to fynd's authentication system i.e. `Grimlock` or by using grimlock-backend SDK for backend implementation. |   
| name | String | yes | Offer name |  



Get offer by name.

*Returned Response:*




[Offer](#Offer)

ok




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateOfferByName
Updates the offer by name.




```kotlin
client.application("<APPLICATION_ID>").rewards.updateOfferByName(name: name, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | company id |   
| applicationId | String | yes | application id |   
| name | String | yes | Offer name |  
| body | [Offer](#Offer) | yes | Request body |


Updates the offer by name.

*Returned Response:*




[Offer](#Offer)

ok




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getUserAvailablePoints
User's reward details.




```kotlin
client.application("<APPLICATION_ID>").rewards.getUserAvailablePoints(userId: userId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | company id |   
| applicationId | String | yes | application id |   
| userId | String | yes | user id |  



User's reward details.

*Returned Response:*




[UserRes](#UserRes)

ok




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateUserStatus
Update User status




```kotlin
client.application("<APPLICATION_ID>").rewards.updateUserStatus(userId: userId, body: body).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | company id |   
| applicationId | String | yes | application id |   
| userId | String | yes | user id |  
| body | [AppUser](#AppUser) | yes | Request body |


Update user status, active/archive

*Returned Response:*




[AppUser](#AppUser)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getUserPointsHistory
Get list of points transactions.




```kotlin
client.application("<APPLICATION_ID>").rewards.getUserPointsHistory(userId: userId, pageId: pageId, pageLimit: pageLimit, pageSize: pageSize).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | company id |   
| applicationId | String | yes | application id |   
| userId | String | yes | user id |   
| pageId | String? | no | PageID is the ID of the requested page. For first request it should be kept empty. |   
| pageLimit | Int? | no | PageLimit is the number of requested items in response. |   
| pageSize | Int? | no | PageSize is the number of requested items in response. |  



Get list of points transactions.
The list of points history is paginated.

*Returned Response:*




[HistoryRes](#HistoryRes)

ok




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [AppUser](#AppUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | applicationId | String? |  yes  |  |
 | blockReason | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | updatedBy | String? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [Asset](#Asset)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String? |  yes  |  |
 | id | String? |  yes  |  |
 | secureUrl | String? |  yes  |  |

---


 
 
 #### [E](#E)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | HashMap<String,Any>? |  yes  |  |
 | exception | String? |  yes  |  |
 | info | String? |  yes  |  |
 | message | String? |  yes  |  |
 | requestId | String? |  yes  |  |
 | stackTrace | String? |  yes  |  |
 | status | Int? |  yes  |  |

---


 
 
 #### [Giveaway](#Giveaway)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | schedule | [Schedule](#Schedule)? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | applicationId | String? |  yes  |  |
 | audience | [RewardsAudience](#RewardsAudience)? |  yes  |  |
 | bannerImage | [Asset](#Asset)? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | description | String? |  yes  |  |
 | name | String? |  yes  |  |
 | rule | [RewardsRule](#RewardsRule)? |  yes  |  |
 | title | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |

---


 
 
 #### [GiveawayResponse](#GiveawayResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Giveaway](#Giveaway)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [HistoryPretty](#HistoryPretty)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | applicationId | String? |  yes  |  |
 | claimed | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | expiresOn | String? |  yes  |  |
 | points | Double? |  yes  |  |
 | remainingPoints | Double? |  yes  |  |
 | text1 | String? |  yes  |  |
 | text2 | String? |  yes  |  |
 | text3 | String? |  yes  |  |
 | txnName | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [HistoryRes](#HistoryRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[HistoryPretty](#HistoryPretty)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |
 | points | Double? |  yes  |  |

---


 
 
 #### [Offer](#Offer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | schedule | [Schedule](#Schedule)? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | applicationId | String? |  yes  |  |
 | bannerImage | [Asset](#Asset)? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | name | String? |  yes  |  |
 | rule | HashMap<String,Any>? |  yes  |  |
 | share | [ShareMessages](#ShareMessages)? |  yes  |  |
 | subText | String? |  yes  |  |
 | text | String? |  yes  |  |
 | type | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | updatedBy | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Int? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | itemTotal | Int? |  yes  |  |
 | nextId | String? |  yes  |  |
 | size | Int? |  yes  |  |
 | type | String |  no  |  |

---


 
 
 #### [Points](#Points)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | available | Double? |  yes  |  |

---


 
 
 #### [Referral](#Referral)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |

---


 
 
 #### [RewardUser](#RewardUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | referral | [Referral](#Referral)? |  yes  |  |
 | uid | Int? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | userBlockReason | String? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [RewardsAudience](#RewardsAudience)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | headerUserId | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [RewardsRule](#RewardsRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | Double? |  yes  |  |

---


 
 
 #### [Schedule](#Schedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cron | String? |  yes  |  |
 | duration | Int? |  yes  |  |
 | end | String? |  yes  |  |
 | start | String? |  yes  |  |

---


 
 
 #### [ShareMessages](#ShareMessages)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | facebook | String? |  yes  |  |
 | fallback | String? |  yes  |  |
 | message | String? |  yes  |  |
 | messenger | String? |  yes  |  |
 | sms | String? |  yes  |  |
 | text | String? |  yes  |  |
 | twitter | String? |  yes  |  |
 | whatsapp | String? |  yes  |  |

---


 
 
 #### [UserRes](#UserRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | points | [Points](#Points)? |  yes  |  |
 | user | [RewardUser](#RewardUser)? |  yes  |  |

---



