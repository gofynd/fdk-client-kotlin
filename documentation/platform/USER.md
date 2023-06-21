



##### [Back to Platform docs](./README.md)

## User Methods
Authentication Service
* [getCustomers](#getcustomers)
* [searchUsers](#searchusers)
* [createUser](#createuser)
* [blockOrUnblockUsers](#blockorunblockusers)
* [archiveUser](#archiveuser)
* [unDeleteUser](#undeleteuser)
* [updateUser](#updateuser)
* [createUserSession](#createusersession)
* [deleteSession](#deletesession)
* [getActiveSessions](#getactivesessions)
* [deleteActiveSessions](#deleteactivesessions)
* [getPlatformConfig](#getplatformconfig)
* [updatePlatformConfig](#updateplatformconfig)
* [createUserGroup](#createusergroup)
* [getUserGroups](#getusergroups)
* [updateUserGroup](#updateusergroup)
* [getUserGroupById](#getusergroupbyid)



## Methods with example and description


### getCustomers
Get a list of customers




```kotlin
platformClient.application("<APPLICATION_ID>").user.getCustomers(q: q, pageSize: pageSize, pageNo: pageNo).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| q | HashMap<String,Any>? | no | The search query. Mobile number or email ID of a customer. |   
| pageSize | Int? | no | The number of items to retrieve in each page. Default value is 10. |   
| pageNo | Int? | no | The page number to navigate through the given set of results. Default value is 1.  |  



Use this API to retrieve a list of customers who have registered in the application.

*Returned Response:*




[CustomerListResponseSchema](#CustomerListResponseSchema)

Success. Refer `CustomerListResponseSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_id": "000000000000000023106198",
        "gender": "male",
        "active": true,
        "emails": [
          {
            "active": true,
            "primary": true,
            "verified": true,
            "email": "raaz.crzy@gmail.com"
          }
        ],
        "username": "raaz_crzy_gmail_com_63747_23106198",
        "__v": 7,
        "debug": {
          "source": "deadlock",
          "platform": "000000000000000000000003"
        },
        "dob": "1995-07-23T00:00:00.000Z",
        "id": "000000000000000023106198",
        "account_type": "user",
        "profile_pic_url": "https://hdn-1.fynd.com/user/profile/original/000000000000000023106198/1586498418772.jpg",
        "first_name": "Prince",
        "last_name": "Raj",
        "phone_numbers": [
          {
            "active": true,
            "primary": true,
            "verified": true,
            "phone": "7008963113",
            "country_code": 91
          }
        ],
        "created_at": "2019-05-15T14:07:52.872Z",
        "updated_at": "2020-09-21T06:38:41.388Z",
        "has_old_password_hash": false
      }
    ],
    "page": {
      "type": "number",
      "current": 1,
      "size": 10,
      "item_total": 0,
      "has_next": false
    }
  }
}
```
</details>

</details>









---


### searchUsers
Search an existing user.




```kotlin
platformClient.application("<APPLICATION_ID>").user.searchUsers(q: q).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| q | String? | no | The search query. Mobile number or email ID of a customer. |  



Use this API to retrieve an existing user from a list.

*Returned Response:*




[UserSearchResponseSchema](#UserSearchResponseSchema)

Success. Returns first name, last name, emails, phone number and gender of the user. Refer `UserSearchResponseSchema` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "users": [
    {
      "_id": "5e68af49cfa09bf7233022f1",
      "gender": "male",
      "active": true,
      "emails": [
        {
          "active": true,
          "primary": true,
          "verified": true,
          "email": "akashmane@gofynd.com"
        },
        {
          "active": true,
          "primary": false,
          "verified": true,
          "email": "akashmane@fynd.com"
        },
        {
          "active": true,
          "primary": false,
          "verified": true,
          "email": "akashmane@uniket.store"
        }
      ],
      "account_type": "user",
      "first_name": "Akash",
      "last_name": "Mane",
      "phone_numbers": [
        {
          "active": true,
          "primary": true,
          "verified": true,
          "phone": "8652523958",
          "country_code": 91
        }
      ],
      "created_at": "2020-03-11T09:28:41.982Z",
      "updated_at": "2020-03-11T09:28:41.982Z"
    }
  ]
}
```
</details>









---


### createUser
Create user




```kotlin
platformClient.application("<APPLICATION_ID>").user.createUser(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateUserRequestSchema](#CreateUserRequestSchema) | yes | Request body |


Create user

*Returned Response:*




[CreateUserResponseSchema](#CreateUserResponseSchema)

User create




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "user": {
    "_id": "5e68af49cfa09bf7233022f1",
    "gender": "male",
    "active": true,
    "emails": [
      {
        "active": true,
        "primary": true,
        "verified": true,
        "email": "akashmane@gofynd.com"
      },
      {
        "active": true,
        "primary": false,
        "verified": true,
        "email": "akashmane@fynd.com"
      },
      {
        "active": true,
        "primary": false,
        "verified": true,
        "email": "akashmane@uniket.store"
      }
    ],
    "external_id": "100002000036789",
    "account_type": "user",
    "first_name": "Akash",
    "last_name": "Mane",
    "phone_numbers": [
      {
        "active": true,
        "primary": true,
        "verified": true,
        "phone": "8652523958",
        "country_code": 91
      }
    ],
    "meta": {},
    "created_at": "2020-03-11T09:28:41.982Z",
    "updated_at": "2020-03-11T09:28:41.982Z"
  }
}
```
</details>









---


### blockOrUnblockUsers
Block/Unblock user




```kotlin
platformClient.application("<APPLICATION_ID>").user.blockOrUnblockUsers(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [BlockUserRequestSchema](#BlockUserRequestSchema) | yes | Request body |


Block/Unblock user

*Returned Response:*




[BlockUserSuccess](#BlockUserSuccess)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true
}
```
</details>









---


### archiveUser
archive user




```kotlin
platformClient.application("<APPLICATION_ID>").user.archiveUser(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ArchiveUserRequestSchema](#ArchiveUserRequestSchema) | yes | Request body |


archive user

*Returned Response:*




[ArchiveUserSuccess](#ArchiveUserSuccess)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true
}
```
</details>









---


### unDeleteUser
undelete user who deleted from application and have not elapsed the platform configured delete days




```kotlin
platformClient.application("<APPLICATION_ID>").user.unDeleteUser(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UnDeleteUserRequestSchema](#UnDeleteUserRequestSchema) | yes | Request body |


undelete user who deleted from application and have not elapsed the platform configured delete days

*Returned Response:*




[UnDeleteUserSuccess](#UnDeleteUserSuccess)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true
}
```
</details>









---


### updateUser
Update user




```kotlin
platformClient.application("<APPLICATION_ID>").user.updateUser(userId: userId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| userId | String | yes | User ID |  
| body | [UpdateUserRequestSchema](#UpdateUserRequestSchema) | yes | Request body |


Use this API to update user details, Note: Existing emails and phone numbers of user will be replaced directly if phone_numbers or emails field sent in request data.

*Returned Response:*




[CreateUserResponseSchema](#CreateUserResponseSchema)

User update




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "user": {
    "_id": "5e68af49cfa09bf7233022f1",
    "gender": "male",
    "active": true,
    "emails": [
      {
        "active": true,
        "primary": true,
        "verified": true,
        "email": "akashmane@gofynd.com"
      },
      {
        "active": true,
        "primary": false,
        "verified": true,
        "email": "akashmane@fynd.com"
      },
      {
        "active": true,
        "primary": false,
        "verified": true,
        "email": "akashmane@uniket.store"
      }
    ],
    "external_id": "100002000036789",
    "account_type": "user",
    "first_name": "Akash",
    "last_name": "Mane",
    "phone_numbers": [
      {
        "active": true,
        "primary": true,
        "verified": true,
        "phone": "8652523958",
        "country_code": 91
      }
    ],
    "meta": {},
    "created_at": "2020-03-11T09:28:41.982Z",
    "updated_at": "2020-03-11T09:28:41.982Z"
  }
}
```
</details>









---


### createUserSession
Create user session




```kotlin
platformClient.application("<APPLICATION_ID>").user.createUserSession(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateUserSessionRequestSchema](#CreateUserSessionRequestSchema) | yes | Request body |


Create user session

*Returned Response:*




[CreateUserSessionResponseSchema](#CreateUserSessionResponseSchema)

Create user session




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "domain": "vinit.com",
  "max_age": 4555555,
  "secure": true,
  "http_only": true,
  "cookie": {
    "f.session": "s%3A-LrEF5FVR8jrT5DCtCHSbAy7JFyX-f9T.uXOQwzje8nOfx4ODANrLi4yNX5fW2W5kLQ2rkBdO2xE"
  }
}
```
</details>









---


### deleteSession
Delete a session for a user




```kotlin
platformClient.application("<APPLICATION_ID>").user.deleteSession(id: id, sessionId: sessionId, reason: reason).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String | yes | ID of a customer. |   
| sessionId | String | yes | Session ID of a customer. |   
| reason | String | yes | Reason for deleting session. |  



Use this API to Delete a session of customers who have registered in the application.

*Returned Response:*




[SessionDeleteResponseSchema](#SessionDeleteResponseSchema)

Success. Refer `SessionDeleteResponseSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Success</i></summary>

```json
{
  "value": {
    "items": [
      "sess:123",
      "sess:456"
    ]
  }
}
```
</details>

</details>









---


### getActiveSessions
Get a list of all session with info for a user




```kotlin
platformClient.application("<APPLICATION_ID>").user.getActiveSessions(id: id).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String | yes | ID of a customer. |  



Use this API to retrieve a list of session with info of customers who have registered in the application.

*Returned Response:*




[SessionListResponseSchema](#SessionListResponseSchema)

Success. Refer `SessionListResponseSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Success</i></summary>

```json
{
  "value": {
    "items": [
      "sess:123",
      "sess:456"
    ]
  }
}
```
</details>

</details>









---


### deleteActiveSessions
Delete a list of all session for a user




```kotlin
platformClient.application("<APPLICATION_ID>").user.deleteActiveSessions(id: id, reason: reason).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String | yes | ID of a customer. |   
| reason | String | yes | Reason to delete sessions. |  



Use this API to Delete a list of session of customers who have registered in the application.

*Returned Response:*




[SessionDeleteResponseSchema](#SessionDeleteResponseSchema)

Success. Refer `SessionDeleteResponseSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Success</i></summary>

```json
{
  "value": {
    "items": [
      "sess:123",
      "sess:456"
    ]
  }
}
```
</details>

</details>









---


### getPlatformConfig
Get platform configurations




```kotlin
platformClient.application("<APPLICATION_ID>").user.getPlatformConfig().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






Use this API to get all the platform configurations such as mobile image, desktop image, social logins, and all other text.

*Returned Response:*




[PlatformSchema](#PlatformSchema)

Success. Returns a JSON object containing the all the platform configurations. Refer `PlatformSchema` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "active": true,
  "mobile_image": "",
  "desktop_image": "",
  "social": {
    "facebook": true,
    "google": true,
    "account_kit": true
  },
  "flash_card": {
    "text": "",
    "text_color": "#FFFFFF",
    "background_color": "#EF5350"
  },
  "register": true,
  "forgot_password": true,
  "login": {
    "password": true,
    "otp": true
  },
  "skip_captcha": false,
  "display": "Fynd",
  "subtext": "Login to Fynd",
  "name": "Fynd",
  "meta": {},
  "required_fields": {
    "email": {
      "is_required": false,
      "level": "hard"
    },
    "mobile": {
      "is_required": true,
      "level": "hard"
    }
  },
  "register_required_fields": {
    "email": {
      "is_required": false,
      "level": "hard"
    },
    "mobile": {
      "is_required": true,
      "level": "hard"
    }
  },
  "skip_login": false,
  "look_and_feel": {
    "background_color": "#F5F5F5",
    "card_position": "center"
  },
  "social_tokens": {
    "google": {
      "appId": "token_123"
    },
    "facebook": {
      "appId": "token_123"
    },
    "account_kit": {
      "appId": "token_123"
    }
  },
  "session_config": {
    "duration": 30,
    "type": "Days",
    "is_rolling": false
  },
  "delete_account_reasons": [
    {
      "reason_text": "test",
      "reason_id": "123",
      "show_text_area": true
    }
  ],
  "delete_account_day": 7,
  "delete_account_consent": {
    "consent_text": ""
  },
  "_id": "5e04a5e5220bc15839ad9bc0",
  "created_at": "2019-12-26T12:21:57.878Z",
  "updated_at": "2020-08-13T14:31:09.878Z",
  "__v": 0
}
```
</details>









---


### updatePlatformConfig
Update platform configurations




```kotlin
platformClient.application("<APPLICATION_ID>").user.updatePlatformConfig(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [PlatformSchema](#PlatformSchema) | yes | Request body |


Use this API to edit the existing platform configurations such as mobile image, desktop image, social logins, and all other text.

*Returned Response:*




[PlatformSchema](#PlatformSchema)

Success. Returns a JSON object with the updated platform configurations. Refer `PlatformSchema` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "active": true,
  "mobile_image": "",
  "desktop_image": "",
  "social": {
    "facebook": true,
    "google": true,
    "account_kit": true
  },
  "flash_card": {
    "text": "",
    "text_color": "#FFFFFF",
    "background_color": "#EF5350"
  },
  "register": true,
  "forgot_password": true,
  "login": {
    "password": true,
    "otp": true
  },
  "skip_captcha": false,
  "display": "Fynd",
  "subtext": "Login to Fynd",
  "name": "Fynd",
  "meta": {},
  "required_fields": {
    "email": {
      "is_required": false,
      "level": "hard"
    },
    "mobile": {
      "is_required": true,
      "level": "hard"
    }
  },
  "register_required_fields": {
    "email": {
      "is_required": false,
      "level": "hard"
    },
    "mobile": {
      "is_required": true,
      "level": "hard"
    }
  },
  "skip_login": false,
  "look_and_feel": {
    "background_color": "#F5F5F5",
    "card_position": "center"
  },
  "social_tokens": {
    "google": {
      "appId": "token_123"
    },
    "facebook": {
      "appId": "token_123"
    },
    "account_kit": {
      "appId": "token_123"
    }
  },
  "session_config": {
    "duration": 30,
    "type": "Days",
    "is_rolling": false
  },
  "delete_account_reasons": [
    {
      "reason_text": "test",
      "reason_id": "123",
      "show_text_area": true
    }
  ],
  "delete_account_day": 7,
  "delete_account_consent": {
    "consent_text": ""
  },
  "_id": "5e04a5e5220bc15839ad9bc0",
  "created_at": "2019-12-26T12:21:57.878Z",
  "updated_at": "2020-08-13T14:31:09.878Z",
  "__v": 0
}
```
</details>









---


### createUserGroup
Create an User Group




```kotlin
platformClient.application("<APPLICATION_ID>").user.createUserGroup(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateUserGroupSchema](#CreateUserGroupSchema) | yes | Request body |


Use this API to create new user Group

*Returned Response:*




[UserGroupResponseSchema](#UserGroupResponseSchema)

Success. returns created User Group. `UserGroupResponseSchema` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "is_active": true,
  "_id": "6345677535474fbb6944b7ce",
  "name": "Group 1",
  "description": "description",
  "file_url": "url",
  "status": "pending",
  "uid": 1,
  "application_id": "000000000000000000000001",
  "created_at": "2022-10-11T12:54:13.539Z",
  "modified_at": "2022-10-11T12:54:13.539Z",
  "__v": 0
}
```
</details>









---


### getUserGroups
Get User Groups mathcing criteria




```kotlin
platformClient.application("<APPLICATION_ID>").user.getUserGroups(pageNo: pageNo, pageSize: pageSize, name: name, status: status, groupUid: groupUid).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | String? | no | page number for pagination result |   
| pageSize | String? | no | page size for pagination result |   
| name | String? | no | to seartch for User Groups which contains given string in their name |   
| status | String? | no | to get User Groups with given status |   
| groupUid | Int? | no | to get User Groups with given uid |  



Use this API to get User Groups mathing criteria passed in query

*Returned Response:*




[UserGroupListResponseSchema](#UserGroupListResponseSchema)

Success. User Group details. `UserGroupListResponseSchema` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "is_active": true,
      "_id": "6345677535474fbb6944b7ce",
      "name": "Group 1",
      "description": "description",
      "file_url": "url",
      "status": "pending",
      "uid": 1,
      "application_id": "000000000000000000000001",
      "created_at": "2022-10-11T12:54:13.539Z",
      "modified_at": "2022-10-11T12:54:13.539Z",
      "__v": 0
    },
    {
      "is_active": true,
      "_id": "6345677535474fbb6944b7ced",
      "name": "Group 2",
      "description": "description",
      "file_url": "url2",
      "status": "pending",
      "uid": 1,
      "application_id": "000000000000000000000001",
      "created_at": "2022-10-11T12:54:13.539Z",
      "modified_at": "2022-10-11T12:54:13.539Z",
      "__v": 0
    }
  ],
  "page": {
    "type": "number",
    "current": 1,
    "size": 10,
    "item_total": 0,
    "has_next": false
  }
}
```
</details>









---


### updateUserGroup
Update an User Group




```kotlin
platformClient.application("<APPLICATION_ID>").user.updateUserGroup(groupId: groupId, body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| groupId | String | yes | Numeric ID allotted to a User Group |  
| body | [UpdateUserGroupSchema](#UpdateUserGroupSchema) | yes | Request body |


Use this API to update an existing user Group

*Returned Response:*




[UserGroupResponseSchema](#UserGroupResponseSchema)

Success. returns updated User Group. `UserGroupResponseSchema` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "is_active": true,
  "_id": "6345677535474fbb6944b7ce",
  "name": "Group 1",
  "description": "description",
  "file_url": "url",
  "status": "pending",
  "uid": 1,
  "application_id": "000000000000000000000001",
  "created_at": "2022-10-11T12:54:13.539Z",
  "modified_at": "2022-10-11T12:54:13.539Z",
  "__v": 0
}
```
</details>









---


### getUserGroupById
Get an User Group by Id




```kotlin
platformClient.application("<APPLICATION_ID>").user.getUserGroupById(groupId: groupId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| groupId | String | yes | Numeric ID allotted to a User Group |  



Use this API to get details of an existing user Group

*Returned Response:*




[UserGroupResponseSchema](#UserGroupResponseSchema)

Success. User Group details. `UserGroupResponseSchema` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "is_active": true,
  "_id": "6345677535474fbb6944b7ce",
  "name": "Group 1",
  "description": "description",
  "file_url": "url",
  "status": "pending",
  "uid": 1,
  "application_id": "000000000000000000000001",
  "created_at": "2022-10-11T12:54:13.539Z",
  "modified_at": "2022-10-11T12:54:13.539Z",
  "__v": 0
}
```
</details>









---



### Schemas

 
 
 #### [BlockUserRequestSchema](#BlockUserRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | Boolean? |  yes  |  |
 | userId | ArrayList<String>? |  yes  |  |
 | reason | String? |  yes  |  |

---


 
 
 #### [ArchiveUserRequestSchema](#ArchiveUserRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |

---


 
 
 #### [DeleteApplicationUserRequestSchema](#DeleteApplicationUserRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | reason | String? |  yes  |  |
 | reasonId | String? |  yes  |  |
 | requestId | String? |  yes  |  |
 | otp | String? |  yes  |  |

---


 
 
 #### [UnDeleteUserRequestSchema](#UnDeleteUserRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | reason | String? |  yes  |  |
 | reasonId | String? |  yes  |  |

---


 
 
 #### [EditEmailRequestSchema](#EditEmailRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |

---


 
 
 #### [SendVerificationLinkMobileRequestSchema](#SendVerificationLinkMobileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Boolean? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | phone | String? |  yes  |  |
 | primary | Boolean? |  yes  |  |

---


 
 
 #### [EditMobileRequestSchema](#EditMobileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String? |  yes  |  |
 | phone | String? |  yes  |  |

---


 
 
 #### [EditProfileRequestSchema](#EditProfileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | mobile | [EditProfileMobileSchema](#EditProfileMobileSchema)? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | email | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | dob | String? |  yes  |  |
 | profilePicUrl | String? |  yes  |  |
 | androidHash | String? |  yes  |  |
 | sender | String? |  yes  |  |
 | registerToken | String? |  yes  |  |

---


 
 
 #### [EditProfileMobileSchema](#EditProfileMobileSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | String? |  yes  |  |
 | countryCode | String? |  yes  |  |

---


 
 
 #### [SendEmailOtpRequestSchema](#SendEmailOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | action | String? |  yes  |  |
 | token | String? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | captchaCode | String? |  yes  |  |

---


 
 
 #### [VerifyEmailOtpRequestSchema](#VerifyEmailOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | action | String? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | otp | String? |  yes  |  |

---


 
 
 #### [VerifyOtpRequestSchema](#VerifyOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | requestId | String? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | otp | String? |  yes  |  |

---


 
 
 #### [SendMobileOtpRequestSchema](#SendMobileOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | action | String? |  yes  |  |
 | token | String? |  yes  |  |
 | androidHash | String? |  yes  |  |
 | force | String? |  yes  |  |
 | captchaCode | String? |  yes  |  |

---


 
 
 #### [UpdatePasswordRequestSchema](#UpdatePasswordRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | oldPassword | String? |  yes  |  |
 | newPassword | String? |  yes  |  |

---


 
 
 #### [FormRegisterRequestSchema](#FormRegisterRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | email | String? |  yes  |  |
 | password | String? |  yes  |  |
 | phone | [FormRegisterRequestSchemaPhone](#FormRegisterRequestSchemaPhone)? |  yes  |  |
 | registerToken | String? |  yes  |  |

---


 
 
 #### [TokenRequestBodySchema](#TokenRequestBodySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | token | String? |  yes  |  |

---


 
 
 #### [ForgotPasswordRequestSchema](#ForgotPasswordRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |
 | password | String? |  yes  |  |

---


 
 
 #### [CodeRequestBodySchema](#CodeRequestBodySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |

---


 
 
 #### [SendResetPasswordEmailRequestSchema](#SendResetPasswordEmailRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | captchaCode | String? |  yes  |  |

---


 
 
 #### [SendResetPasswordMobileRequestSchema](#SendResetPasswordMobileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | captchaCode | String? |  yes  |  |

---


 
 
 #### [PasswordLoginRequestSchema](#PasswordLoginRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | captchaCode | String? |  yes  |  |
 | password | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [SendOtpRequestSchema](#SendOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String? |  yes  |  |
 | captchaCode | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | androidHash | String? |  yes  |  |

---


 
 
 #### [OAuthRequestSchema](#OAuthRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSignedIn | Boolean? |  yes  |  |
 | oauth2 | [OAuthRequestSchemaOauth2](#OAuthRequestSchemaOauth2)? |  yes  |  |
 | profile | [OAuthRequestSchemaProfile](#OAuthRequestSchemaProfile)? |  yes  |  |

---


 
 
 #### [OAuthRequestAppleSchema](#OAuthRequestAppleSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userIdentifier | String? |  yes  |  |
 | oauth | [OAuthRequestAppleSchemaOauth](#OAuthRequestAppleSchemaOauth)? |  yes  |  |
 | profile | [OAuthRequestAppleSchemaProfile](#OAuthRequestAppleSchemaProfile)? |  yes  |  |

---


 
 
 #### [UserObjectSchema](#UserObjectSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |

---


 
 
 #### [AuthSuccess](#AuthSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | registerToken | String? |  yes  |  |
 | userExists | Boolean? |  yes  |  |
 | user | [UserSchema](#UserSchema)? |  yes  |  |

---


 
 
 #### [SendOtpResponse](#SendOtpResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | resendTimer | Int? |  yes  |  |
 | resendToken | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | requestId | String? |  yes  |  |
 | message | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | email | String? |  yes  |  |
 | resendEmailToken | String? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | verifyEmailOtp | Boolean? |  yes  |  |
 | verifyMobileOtp | Boolean? |  yes  |  |
 | userExists | Boolean? |  yes  |  |

---


 
 
 #### [ProfileEditSuccess](#ProfileEditSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | resendEmailToken | String? |  yes  |  |
 | userExists | Boolean? |  yes  |  |
 | verifyEmailLink | Boolean? |  yes  |  |
 | verifyEmailOtp | Boolean? |  yes  |  |
 | verifyMobileOtp | Boolean? |  yes  |  |
 | email | String? |  yes  |  |
 | requestId | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | resendTimer | Int? |  yes  |  |
 | resendToken | String? |  yes  |  |

---


 
 
 #### [LoginSuccess](#LoginSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |
 | requestId | String? |  yes  |  |
 | registerToken | String? |  yes  |  |

---


 
 
 #### [VerifyOtpSuccess](#VerifyOtpSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |
 | userExists | Boolean? |  yes  |  |
 | registerToken | String? |  yes  |  |

---


 
 
 #### [ResetPasswordSuccess](#ResetPasswordSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |

---


 
 
 #### [RegisterFormSuccess](#RegisterFormSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | resendTimer | Int? |  yes  |  |
 | resendToken | String? |  yes  |  |
 | resendEmailToken | String? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | requestId | String? |  yes  |  |
 | message | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | verifyEmailOtp | Boolean? |  yes  |  |
 | verifyMobileOtp | Boolean? |  yes  |  |
 | userExists | Boolean? |  yes  |  |

---


 
 
 #### [VerifyEmailSuccess](#VerifyEmailSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [HasPasswordSuccess](#HasPasswordSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | Boolean? |  yes  |  |

---


 
 
 #### [LogoutSuccess](#LogoutSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logout | Boolean? |  yes  |  |

---


 
 
 #### [BlockUserSuccess](#BlockUserSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [ArchiveUserSuccess](#ArchiveUserSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [DeleteUserSuccess](#DeleteUserSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [UnDeleteUserSuccess](#UnDeleteUserSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [OtpSuccess](#OtpSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | resendTimer | Int? |  yes  |  |
 | resendToken | String? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | requestId | String? |  yes  |  |
 | message | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | countryCode | String? |  yes  |  |

---


 
 
 #### [EmailOtpSuccess](#EmailOtpSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [SessionListSuccess](#SessionListSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sessions | ArrayList<String>? |  yes  |  |

---


 
 
 #### [VerifyMobileOTPSuccess](#VerifyMobileOTPSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |
 | verifyMobileLink | Boolean? |  yes  |  |

---


 
 
 #### [VerifyEmailOTPSuccess](#VerifyEmailOTPSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |
 | verifyEmailLink | Boolean? |  yes  |  |

---


 
 
 #### [SendMobileVerifyLinkSuccess](#SendMobileVerifyLinkSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verifyMobileLink | Boolean? |  yes  |  |

---


 
 
 #### [SendEmailVerifyLinkSuccess](#SendEmailVerifyLinkSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verifyEmailLink | Boolean? |  yes  |  |

---


 
 
 #### [UserSearchResponseSchema](#UserSearchResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | users | ArrayList<[UserSchema](#UserSchema)>? |  yes  |  |

---


 
 
 #### [CustomerListResponseSchema](#CustomerListResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[UserSchema](#UserSchema)>? |  yes  |  |
 | page | [PaginationSchema](#PaginationSchema)? |  yes  |  |

---


 
 
 #### [PaginationSchema](#PaginationSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | Int? |  yes  |  |
 | itemTotal | Int? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | type | String? |  yes  |  |
 | current | Int? |  yes  |  |

---


 
 
 #### [SessionListResponseSchema](#SessionListResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[SessionListResponseInfo](#SessionListResponseInfo)>? |  yes  |  |

---


 
 
 #### [SessionDeleteResponseSchema](#SessionDeleteResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<String>? |  yes  |  |

---


 
 
 #### [UnauthorizedSchema](#UnauthorizedSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [UnauthenticatedSchema](#UnauthenticatedSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | authenticated | Boolean? |  yes  |  |

---


 
 
 #### [NotFoundSchema](#NotFoundSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [AuthenticationInternalServerErrorSchema](#AuthenticationInternalServerErrorSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [AuthenticationApiErrorSchema](#AuthenticationApiErrorSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [ProfileEditSuccessSchema](#ProfileEditSuccessSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | verifyEmailOtp | Boolean? |  yes  |  |
 | verifyEmailLink | Boolean? |  yes  |  |
 | verifyMobileOtp | Boolean? |  yes  |  |
 | user | String? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | userExists | Boolean? |  yes  |  |

---


 
 
 #### [FormRegisterRequestSchemaPhone](#FormRegisterRequestSchemaPhone)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String? |  yes  |  |
 | mobile | String? |  yes  |  |

---


 
 
 #### [OAuthRequestSchemaOauth2](#OAuthRequestSchemaOauth2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | accessToken | String? |  yes  |  |
 | expiry | Int? |  yes  |  |
 | refreshToken | String? |  yes  |  |

---


 
 
 #### [OAuthRequestSchemaProfile](#OAuthRequestSchemaProfile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lastName | String? |  yes  |  |
 | image | String? |  yes  |  |
 | id | String? |  yes  |  |
 | email | String? |  yes  |  |
 | fullName | String? |  yes  |  |
 | firstName | String? |  yes  |  |

---


 
 
 #### [OAuthRequestAppleSchemaOauth](#OAuthRequestAppleSchemaOauth)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identityToken | String? |  yes  |  |

---


 
 
 #### [OAuthRequestAppleSchemaProfile](#OAuthRequestAppleSchemaProfile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lastName | String? |  yes  |  |
 | fullName | String? |  yes  |  |
 | firstName | String? |  yes  |  |

---


 
 
 #### [AuthSuccessUser](#AuthSuccessUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | debug | [AuthSuccessUserDebug](#AuthSuccessUserDebug)? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | emails | [AuthSuccessUserEmails](#AuthSuccessUserEmails)? |  yes  |  |

---


 
 
 #### [SessionListResponseInfo](#SessionListResponseInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sessionId | String? |  yes  |  |
 | userAgent | String? |  yes  |  |
 | ip | String? |  yes  |  |
 | domain | String? |  yes  |  |
 | expireIn | String? |  yes  |  |

---


 
 
 #### [AuthSuccessUserDebug](#AuthSuccessUserDebug)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | platform | String? |  yes  |  |

---


 
 
 #### [AuthSuccessUserEmails](#AuthSuccessUserEmails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | verified | Boolean? |  yes  |  |
 | primary | Boolean? |  yes  |  |
 | active | Boolean? |  yes  |  |

---


 
 
 #### [UserGroupResponseSchema](#UserGroupResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | description | String? |  yes  |  |
 | fileUrl | String? |  yes  |  |
 | id | String? |  yes  |  |
 | status | String? |  yes  |  |
 | uid | Int? |  yes  |  |
 | applicationId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | modifiedAt | String? |  yes  |  |
 | v | Int? |  yes  |  |

---


 
 
 #### [UserGroupListResponseSchema](#UserGroupListResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[UserGroupResponseSchema](#UserGroupResponseSchema)>? |  yes  |  |
 | page | [PaginationSchema](#PaginationSchema)? |  yes  |  |

---


 
 
 #### [CreateUserGroupSchema](#CreateUserGroupSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | fileUrl | String |  no  |  |

---


 
 
 #### [CreateUserRequestSchema](#CreateUserRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phoneNumber | String |  no  |  |
 | email | String? |  yes  |  |
 | firstName | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | username | String |  no  |  |
 | meta | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [CreateUserResponseSchema](#CreateUserResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |

---


 
 
 #### [CreateUserSessionRequestSchema](#CreateUserSessionRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domain | String? |  yes  |  |
 | maxAge | Double? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [CreateUserSessionResponseSchema](#CreateUserSessionResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | domain | String? |  yes  |  |
 | maxAge | Double? |  yes  |  |
 | secure | Boolean? |  yes  |  |
 | httpOnly | Boolean? |  yes  |  |
 | cookie | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [PlatformSchema](#PlatformSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | lookAndFeel | [LookAndFeel](#LookAndFeel)? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | forgotPassword | Boolean? |  yes  |  |
 | login | [Login](#Login)? |  yes  |  |
 | skipCaptcha | Boolean? |  yes  |  |
 | name | String? |  yes  |  |
 | meta | [MetaSchema](#MetaSchema)? |  yes  |  |
 | id | String? |  yes  |  |
 | social | [Social](#Social)? |  yes  |  |
 | requiredFields | [RequiredFields](#RequiredFields)? |  yes  |  |
 | registerRequiredFields | [RegisterRequiredFields](#RegisterRequiredFields)? |  yes  |  |
 | skipLogin | Boolean? |  yes  |  |
 | flashCard | [FlashCard](#FlashCard)? |  yes  |  |
 | subtext | String? |  yes  |  |
 | socialTokens | [SocialTokens](#SocialTokens)? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | register | Boolean? |  yes  |  |
 | mobileImage | String? |  yes  |  |
 | desktopImage | String? |  yes  |  |
 | deleteAccountDay | Int? |  yes  |  |
 | deleteAccountReasons | ArrayList<[DeleteAccountReasons](#DeleteAccountReasons)>? |  yes  |  |
 | deleteAccountConsent | HashMap<String,Any>? |  yes  |  |
 | sessionConfig | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [LookAndFeel](#LookAndFeel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cardPosition | String? |  yes  |  |
 | backgroundColor | String? |  yes  |  |

---


 
 
 #### [Login](#Login)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | password | Boolean? |  yes  |  |
 | otp | Boolean? |  yes  |  |

---


 
 
 #### [MetaSchema](#MetaSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndDefault | Boolean? |  yes  |  |

---


 
 
 #### [Social](#Social)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | accountKit | Boolean? |  yes  |  |
 | facebook | Boolean? |  yes  |  |
 | google | Boolean? |  yes  |  |
 | apple | Boolean? |  yes  |  |

---


 
 
 #### [RequiredFields](#RequiredFields)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | [PlatformEmail](#PlatformEmail)? |  yes  |  |
 | mobile | [PlatformMobile](#PlatformMobile)? |  yes  |  |

---


 
 
 #### [PlatformEmail](#PlatformEmail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isRequired | Boolean? |  yes  |  |
 | level | String? |  yes  |  |

---


 
 
 #### [PlatformMobile](#PlatformMobile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isRequired | Boolean? |  yes  |  |
 | level | String? |  yes  |  |

---


 
 
 #### [RegisterRequiredFields](#RegisterRequiredFields)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | [RegisterRequiredFieldsEmail](#RegisterRequiredFieldsEmail)? |  yes  |  |
 | mobile | [RegisterRequiredFieldsMobile](#RegisterRequiredFieldsMobile)? |  yes  |  |

---


 
 
 #### [RegisterRequiredFieldsEmail](#RegisterRequiredFieldsEmail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isRequired | Boolean? |  yes  |  |
 | level | String? |  yes  |  |

---


 
 
 #### [RegisterRequiredFieldsMobile](#RegisterRequiredFieldsMobile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isRequired | Boolean? |  yes  |  |
 | level | String? |  yes  |  |

---


 
 
 #### [FlashCard](#FlashCard)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String? |  yes  |  |
 | textColor | String? |  yes  |  |
 | backgroundColor | String? |  yes  |  |

---


 
 
 #### [SocialTokens](#SocialTokens)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | facebook | [Facebook](#Facebook)? |  yes  |  |
 | accountKit | [Accountkit](#Accountkit)? |  yes  |  |
 | google | [Google](#Google)? |  yes  |  |

---


 
 
 #### [DeleteAccountReasons](#DeleteAccountReasons)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reasonText | String? |  yes  |  |
 | reasonId | String? |  yes  |  |
 | showTextArea | Boolean? |  yes  |  |

---


 
 
 #### [DeleteAccountConsent](#DeleteAccountConsent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | consentText | String? |  yes  |  |

---


 
 
 #### [Facebook](#Facebook)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String? |  yes  |  |

---


 
 
 #### [Accountkit](#Accountkit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String? |  yes  |  |

---


 
 
 #### [Google](#Google)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String? |  yes  |  |

---


 
 
 #### [SessionExpiry](#SessionExpiry)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | duration | Int? |  yes  |  |
 | type | String? |  yes  |  |
 | isRolling | Boolean? |  yes  |  |

---


 
 
 #### [UpdateUserGroupSchema](#UpdateUserGroupSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | description | String? |  yes  |  |
 | fileUrl | String? |  yes  |  |

---


 
 
 #### [UpdateUserRequestSchema](#UpdateUserRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | externalId | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | phoneNumbers | ArrayList<[UserPhoneNumbers](#UserPhoneNumbers)>? |  yes  |  |
 | emails | ArrayList<[UserEmails](#UserEmails)>? |  yes  |  |

---


 
 
 #### [UserEmails](#UserEmails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean? |  yes  |  |
 | primary | Boolean? |  yes  |  |
 | verified | Boolean? |  yes  |  |
 | email | String? |  yes  |  |

---


 
 
 #### [UserPhoneNumbers](#UserPhoneNumbers)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean? |  yes  |  |
 | primary | Boolean? |  yes  |  |
 | verified | Boolean? |  yes  |  |
 | phone | String? |  yes  |  |
 | countryCode | String? |  yes  |  |

---


 
 
 #### [UserSchema](#UserSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | applicationId | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | firstName | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | lastName | String? |  yes  |  |
 | phoneNumbers | ArrayList<[PhoneNumber](#PhoneNumber)>? |  yes  |  |
 | emails | ArrayList<[Email](#Email)>? |  yes  |  |
 | gender | String? |  yes  |  |
 | dob | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | profilePicUrl | String? |  yes  |  |
 | username | String? |  yes  |  |
 | accountType | String? |  yes  |  |
 | id | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |

---


 
 
 #### [PhoneNumber](#PhoneNumber)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean? |  yes  |  |
 | primary | Boolean? |  yes  |  |
 | verified | Boolean? |  yes  |  |
 | phone | String? |  yes  |  |
 | countryCode | Int? |  yes  |  |

---


 
 
 #### [Email](#Email)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | primary | Boolean? |  yes  |  |
 | verified | Boolean? |  yes  |  |
 | email | String? |  yes  |  |
 | active | Boolean? |  yes  |  |

---



