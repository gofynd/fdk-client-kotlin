



##### [Back to Platform docs](./README.md)

## Rewards Methods
Earn and redeem reward points
* [showGiveaways](#showgiveaways)
* [saveGiveAway](#savegiveaway)
* [getGiveawayById](#getgiveawaybyid)
* [updateGiveAway](#updategiveaway)
* [getGiveawayAudienceStatus](#getgiveawayaudiencestatus)
* [showOffers](#showoffers)
* [getOfferByName](#getofferbyname)
* [updateOfferByName](#updateofferbyname)
* [updateUserStatus](#updateuserstatus)
* [getUserDetails](#getuserdetails)
* [getUserPointsHistory](#getuserpointshistory)
* [getRewardsConfiguration](#getrewardsconfiguration)
* [setRewardsConfiguration](#setrewardsconfiguration)



## Methods with example and description


### showGiveaways
List of giveaways of the current application.




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.showGiveaways(pageId: pageId, pageSize: pageSize).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageId | String | yes | pagination page id |   
| pageSize | Int | yes | pagination page size |  



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


### saveGiveAway
List of giveaways of the current application.




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.saveGiveAway(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
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


### getGiveawayById
Get giveaway by ID.




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.getGiveawayById(id: id).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
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


### updateGiveAway
Updates the giveaway by it's ID.




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.updateGiveAway(id: id, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
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


### getGiveawayAudienceStatus
Get the Giveaway audience status




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.getGiveawayAudienceStatus(id: id, audienceId: audienceId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String | yes | Giveaway ID |   
| audienceId | String | yes | audience id |  



Get giveaway audience status

*Returned Response:*




[GiveawayAudience](#GiveawayAudience)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### showOffers
List of offers of the current application.




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.showOffers().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






List of offers of the current application.

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
Get offer by name




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.getOfferByName(name: name).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| name | String | yes | The name given to the offer. |  



Use this API to get the offer details and configuration by entering the name of the offer.

*Returned Response:*




[Offer](#Offer)

Success. Check example below or refer `Offer` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateOfferByName
Update offer by name




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.updateOfferByName(name: name, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| name | String | yes | The name given to the offer. |  
| body | [Offer](#Offer) | yes | Request body |


Use this API to update the offer details

*Returned Response:*




[Offer](#Offer)

Success. Check example below or refer `Offer` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateUserStatus
Update user status




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.updateUserStatus(userId: userId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| userId | String | yes | user id |  
| body | [AppUser](#AppUser) | yes | Request body |


Use this API to update the user status active/archive

*Returned Response:*




[AppUser](#AppUser)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getUserDetails
Get user reward details




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.getUserDetails(userId: userId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| userId | String | yes | user id |  



Use this API to get the user reward details

*Returned Response:*




[UserRes](#UserRes)

Success. Check example below or refer `UserRes` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getUserPointsHistory
Get all transactions of reward points




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.getUserPointsHistory(userId: userId, pageId: pageId, pageSize: pageSize).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| userId | String | yes | user id |   
| pageId | String? | no | PageID is the ID of the requested page. For first request it should be kept empty. |   
| pageSize | Int? | no | The number of items to retrieve in each page. |  



Use this API to get a list of points transactions.

*Returned Response:*




[HistoryRes](#HistoryRes)

Success. Check example below or refer `HistoryRes` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getRewardsConfiguration
Get all valid android paths




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.getRewardsConfiguration().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






Use this API to get a list of valid android paths required by the Rewards INIT API to validate a fradualent device.

*Returned Response:*




[ConfigurationRes](#ConfigurationRes)

Success. Refer `ConfigurationRes` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### setRewardsConfiguration
Updates the collection with given android paths.




```kotlin
platformClient.application("<APPLICATION_ID>").rewards.setRewardsConfiguration(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ConfigurationRequest](#ConfigurationRequest) | yes | Request body |


Updates the configuration or inserts new records.

*Returned Response:*




[SetConfigurationRes](#SetConfigurationRes)

ok




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [E](#E)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | Int? |  yes  |  |
 | exception | String? |  yes  |  |
 | info | String? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [GiveawayResponse](#GiveawayResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Giveaway](#Giveaway)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

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


 
 
 #### [Schedule](#Schedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | duration | Int? |  yes  |  |
 | end | String? |  yes  |  |
 | start | String? |  yes  |  |
 | cron | String? |  yes  |  |

---


 
 
 #### [RewardsAudience](#RewardsAudience)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | headerUserId | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [Asset](#Asset)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String? |  yes  |  |
 | id | String? |  yes  |  |
 | secureUrl | String? |  yes  |  |

---


 
 
 #### [RewardsRule](#RewardsRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | Double? |  yes  |  |

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


 
 
 #### [ShareMessages](#ShareMessages)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | Int? |  yes  |  |
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


 
 
 #### [Points](#Points)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | available | Double? |  yes  |  |

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


 
 
 #### [Referral](#Referral)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |

---


 
 
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


 
 
 #### [GiveawayAudience](#GiveawayAudience)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | audienceId | String? |  yes  |  |
 | currentCount | Double? |  yes  |  |

---


 
 
 #### [HistoryRes](#HistoryRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[PointsHistory](#PointsHistory)>? |  yes  | History is the list of points transaction. |
 | page | [Page](#Page)? |  yes  |  |
 | points | Double? |  yes  |  |

---


 
 
 #### [PointsHistory](#PointsHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | applicationId | String? |  yes  |  |
 | claimed | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | expiresOn | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | points | Double? |  yes  |  |
 | remainingPoints | Double? |  yes  |  |
 | text1 | String? |  yes  |  |
 | text2 | String? |  yes  |  |
 | text3 | String? |  yes  |  |
 | txnName | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [ConfigurationRes](#ConfigurationRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | validAndroidPackages | ArrayList<String>? |  yes  | Contains array of string items, Valid android package names. |
 | termsConditionsLink | String? |  yes  | A URL that redirects to the referral information suport page link |
 | applicationId | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [SetConfigurationRes](#SetConfigurationRes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [ConfigurationRequest](#ConfigurationRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | validAndroidPackages | ArrayList<String>? |  yes  |  |
 | termsConditionsLink | String? |  yes  |  |

---



