



##### [Back to Application docs](./README.md)

## Theme Methods
Responsible for themes
* [getAllPages](#getallpages)
* [getPage](#getpage)
* [getAppliedTheme](#getappliedtheme)
* [getThemeForPreview](#getthemeforpreview)



## Methods with example and description


### getAllPages
Get all pages of a theme




```kotlin
theme.getAllPages(themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| themeId | String | yes | ID of the theme to be retrieved |  



Use this API to retrieve all the available pages of a theme by its ID.

*Returned Response:*




[AllAvailablePageSchema](#AllAvailablePageSchema)

Success. Returns an array all the pages of the theme. Refer `AllAvailablePageSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; All pages</i></summary>

```json
{
  "$ref": "#/components/examples/AllAvailablePagesExample"
}
```
</details>

</details>









---


### getPage
Get page of a theme




```kotlin
theme.getPage(themeId: themeId, pageValue: pageValue).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| themeId | String | yes | ID of the theme to be retrieved |   
| pageValue | String | yes | Value of the page to be retrieved |  



Use this API to retrieve a page of a theme.

*Returned Response:*




[AvailablePageSchema](#AvailablePageSchema)

Success. Returns an object of the pages.  Refer `AvailablePageSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Home page</i></summary>

```json
{
  "$ref": "#/components/examples/AvailablePageExample"
}
```
</details>

</details>









---


### getAppliedTheme
Get the theme currently applied to an application




```kotlin
theme.getAppliedTheme().safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```




An application has multiple themes, but only one theme can be applied at a time. Use this API to retrieve the theme currently applied to the application.

*Returned Response:*




[ThemesSchema](#ThemesSchema)

Success. Returns a JSON object of the theme. Check the example shown below or    refer `ThemesSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Applied Theme</i></summary>

```json
{
  "$ref": "#/components/examples/Themes"
}
```
</details>

</details>









---


### getThemeForPreview
Get a theme for a preview




```kotlin
theme.getThemeForPreview(themeId: themeId).safeAwait{ response,error->
    
    response?.let{
      // Use response
    } ->
     
    error?.let{
      
    } 
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| themeId | String | yes | ID of the theme to be retrieved |  



A theme can be previewed before applying it. Use this API to retrieve the preview of a theme by its ID.

*Returned Response:*




[ThemesSchema](#ThemesSchema)

Success. Returns a JSON object of the theme. Check the example shown below or refer `ThemesSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Preview Theme</i></summary>

```json
{
  "$ref": "#/components/examples/Themes"
}
```
</details>

</details>









---



### Schemas

 
 
 #### [AvailablePageSchema](#AvailablePageSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String? |  yes  |  |
 | text | String? |  yes  |  |
 | path | String? |  yes  |  |
 | type | String? |  yes  |  |
 | sections | ArrayList<[AvailablePageSchemaSections](#AvailablePageSchemaSections)>? |  yes  |  |
 | sectionsMeta | ArrayList<[AvailablePageSectionMetaAttributes](#AvailablePageSectionMetaAttributes)>? |  yes  |  |
 | theme | String? |  yes  |  |
 | seo | [AvailablePageSeo](#AvailablePageSeo)? |  yes  |  |
 | props | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [AvailablePageSectionMetaAttributes](#AvailablePageSectionMetaAttributes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [AvailablePageSeo](#AvailablePageSeo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  |  |
 | description | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [AvailablePageSchemaSections](#AvailablePageSchemaSections)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | label | String? |  yes  |  |
 | props | HashMap<String,Any>? |  yes  |  |
 | blocks | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | preset | HashMap<String,Any>? |  yes  |  |
 | predicate | [AvailablePagePredicate](#AvailablePagePredicate)? |  yes  |  |

---


 
 
 #### [AvailablePageScreenPredicate](#AvailablePageScreenPredicate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | Boolean? |  yes  |  |
 | desktop | Boolean? |  yes  |  |
 | tablet | Boolean? |  yes  |  |

---


 
 
 #### [AvailablePageUserPredicate](#AvailablePageUserPredicate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | authenticated | Boolean? |  yes  |  |
 | anonymous | Boolean? |  yes  |  |

---


 
 
 #### [AvailablePageRoutePredicate](#AvailablePageRoutePredicate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | selected | String? |  yes  |  |
 | exactUrl | String? |  yes  |  |
 | query | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [AvailablePagePredicate](#AvailablePagePredicate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | screen | [AvailablePageScreenPredicate](#AvailablePageScreenPredicate)? |  yes  |  |
 | user | [AvailablePageUserPredicate](#AvailablePageUserPredicate)? |  yes  |  |
 | route | [AvailablePageRoutePredicate](#AvailablePageRoutePredicate)? |  yes  |  |

---


 
 
 #### [AllAvailablePageSchema](#AllAvailablePageSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pages | ArrayList<[AvailablePageSchema](#AvailablePageSchema)>? |  yes  |  |

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


 
 
 #### [ThemesListingResponseSchema](#ThemesListingResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ThemesSchema](#ThemesSchema)>? |  yes  |  |
 | page | [PaginationSchema](#PaginationSchema)? |  yes  |  |

---


 
 
 #### [AddThemeRequestSchema](#AddThemeRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | themeId | String? |  yes  |  |

---


 
 
 #### [UpgradableThemeSchema](#UpgradableThemeSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | parentTheme | String? |  yes  |  |
 | appliedTheme | String? |  yes  |  |
 | upgrade | Boolean? |  yes  |  |

---


 
 
 #### [FontsSchema](#FontsSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [FontsSchemaItems](#FontsSchemaItems)? |  yes  |  |
 | kind | String? |  yes  |  |

---


 
 
 #### [BlitzkriegApiErrorSchema](#BlitzkriegApiErrorSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [BlitzkriegNotFoundSchema](#BlitzkriegNotFoundSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [BlitzkriegInternalServerErrorSchema](#BlitzkriegInternalServerErrorSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [FontsSchemaItems](#FontsSchemaItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | family | String? |  yes  |  |
 | variants | ArrayList<String>? |  yes  |  |
 | subsets | ArrayList<String>? |  yes  |  |
 | version | String? |  yes  |  |
 | lastModified | String? |  yes  |  |
 | files | [FontsSchemaItemsFiles](#FontsSchemaItemsFiles)? |  yes  |  |
 | category | String? |  yes  |  |
 | kind | String? |  yes  |  |

---


 
 
 #### [FontsSchemaItemsFiles](#FontsSchemaItemsFiles)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | regular | String? |  yes  |  |
 | italic | String? |  yes  |  |
 | bold | String? |  yes  |  |

---


 
 
 #### [ThemesSchema](#ThemesSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | application | String? |  yes  |  |
 | applied | Boolean? |  yes  |  |
 | customized | Boolean? |  yes  |  |
 | published | Boolean? |  yes  |  |
 | archived | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | version | String? |  yes  |  |
 | parentThemeVersion | String? |  yes  |  |
 | parentTheme | String? |  yes  |  |
 | information | [Information](#Information)? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | src | [Src](#Src)? |  yes  |  |
 | assets | [AssetsSchema](#AssetsSchema)? |  yes  |  |
 | availableSections | ArrayList<[availableSectionSchema](#availableSectionSchema)>? |  yes  |  |
 | constants | HashMap<String,Any>? |  yes  |  |
 | styles | HashMap<String,Any>? |  yes  |  |
 | config | [Config](#Config)? |  yes  |  |
 | settings | HashMap<String,Any>? |  yes  |  |
 | font | [Font](#Font)? |  yes  |  |
 | id | String? |  yes  |  |
 | v | Int? |  yes  |  |
 | colors | [Colors](#Colors)? |  yes  |  |

---


 
 
 #### [availableSectionSchema](#availableSectionSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | blocks | ArrayList<[Blocks](#Blocks)>? |  yes  |  |
 | name | String? |  yes  |  |
 | label | String? |  yes  |  |
 | props | ArrayList<[BlocksProps](#BlocksProps)>? |  yes  |  |

---


 
 
 #### [Information](#Information)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | images | [Images](#Images)? |  yes  |  |
 | features | ArrayList<String>? |  yes  |  |
 | name | String? |  yes  |  |
 | description | String? |  yes  |  |

---


 
 
 #### [Images](#Images)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | desktop | ArrayList<String>? |  yes  |  |
 | android | ArrayList<String>? |  yes  |  |
 | ios | ArrayList<String>? |  yes  |  |
 | thumbnail | ArrayList<String>? |  yes  |  |

---


 
 
 #### [Src](#Src)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | link | String? |  yes  |  |

---


 
 
 #### [AssetsSchema](#AssetsSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | umdJs | [UmdJs](#UmdJs)? |  yes  |  |
 | commonJs | [CommonJs](#CommonJs)? |  yes  |  |
 | css | [Css](#Css)? |  yes  |  |

---


 
 
 #### [UmdJs](#UmdJs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | link | String? |  yes  |  |

---


 
 
 #### [CommonJs](#CommonJs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | link | String? |  yes  |  |

---


 
 
 #### [Css](#Css)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | link | String? |  yes  |  |

---


 
 
 #### [Seo](#Seo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  |  |
 | description | String? |  yes  |  |

---


 
 
 #### [Sections](#Sections)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | String? |  yes  |  |

---


 
 
 #### [Config](#Config)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | preset | [Preset](#Preset)? |  yes  |  |
 | globalSchema | [GlobalSchema](#GlobalSchema)? |  yes  |  |
 | current | String? |  yes  |  |
 | list | ArrayList<[ListSchemaItem](#ListSchemaItem)>? |  yes  |  |

---


 
 
 #### [Preset](#Preset)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pages | ArrayList<[AvailablePageSchema](#AvailablePageSchema)>? |  yes  |  |

---


 
 
 #### [GlobalSchema](#GlobalSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | props | ArrayList<[GlobalSchemaProps](#GlobalSchemaProps)>? |  yes  |  |

---


 
 
 #### [ListSchemaItem](#ListSchemaItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | global | HashMap<String,Any>? |  yes  |  |
 | page | ArrayList<[ConfigPage](#ConfigPage)>? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [Colors](#Colors)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bgColor | String? |  yes  |  |
 | primaryColor | String? |  yes  |  |
 | secondaryColor | String? |  yes  |  |
 | accentColor | String? |  yes  |  |
 | linkColor | String? |  yes  |  |
 | buttonSecondaryColor | String? |  yes  |  |

---


 
 
 #### [Custom](#Custom)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | props | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [ConfigPage](#ConfigPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | settings | HashMap<String,Any>? |  yes  |  |
 | page | String? |  yes  |  |

---


 
 
 #### [Font](#Font)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | family | String? |  yes  |  |
 | variants | [Variants](#Variants)? |  yes  |  |

---


 
 
 #### [Variants](#Variants)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | medium | [Medium](#Medium)? |  yes  |  |
 | semiBold | [SemiBold](#SemiBold)? |  yes  |  |
 | bold | [Bold](#Bold)? |  yes  |  |
 | light | [Light](#Light)? |  yes  |  |
 | regular | [Regular](#Regular)? |  yes  |  |

---


 
 
 #### [Medium](#Medium)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | file | String? |  yes  |  |

---


 
 
 #### [SemiBold](#SemiBold)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | file | String? |  yes  |  |

---


 
 
 #### [Bold](#Bold)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | file | String? |  yes  |  |

---


 
 
 #### [Light](#Light)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | file | String? |  yes  |  |

---


 
 
 #### [Regular](#Regular)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | file | String? |  yes  |  |

---


 
 
 #### [Blocks](#Blocks)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | name | String? |  yes  |  |
 | props | ArrayList<[BlocksProps](#BlocksProps)>? |  yes  |  |

---


 
 
 #### [GlobalSchemaProps](#GlobalSchemaProps)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | label | String? |  yes  |  |
 | type | String? |  yes  |  |
 | category | String? |  yes  |  |

---


 
 
 #### [BlocksProps](#BlocksProps)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | label | String? |  yes  |  |
 | type | String? |  yes  |  |

---



