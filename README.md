# FDK kotlin


FDK client for Kotlin language


## Getting Started
Get started with the Kotlin Development SDK for Fynd Platform


# Usage

1. Add the dependency in your app build.gradle `implementation 'com.github.gofynd:fdk-client-kotlin:v0.0.7'` in your app build.gradle 
2. Add it in your root build.gradle at the end of repositories:
   allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	} 
3. Start integrating

### Sample Usage - ApplicationClient

```kotlin
  var config: ApplicationConfig? = null
    try {
          config = ApplicationConfig(
          applicationId = "YOUR_APPLICATION_ID",
          applicationToken = "YOUR_APPLICATION_TOKEN"
          )
        } catch (e: Exception) {
            print(e.message)
        }
    applicationConfig?.let { config ->
    val applicationClient = ApplicationClient(config = config)
        GlobalScope.launch {
            applicationClient.catalog.getProductDetailBySlug(slug: "product-slug")
                .safeAwait{ response,error ->
                    response?.let{
                        print(it.peekContent()?.name)
                    }
                    error?.let{
                        print(it.message)
                    }
        }
  }
```

### Sample Usage - PlatformClient

```kotlin
  var config: PlatformConfig? = null
    try {
          config = PlatformConfig(
          companyId = "COMPANY_ID",
          apiKey = "API_KEY",
          apiSecret = "API_SECRET",
          domain = "DOMAIN"
          )
        } catch (e: Exception) {
            print(e.message)
        }
    platormConfig?.let { config ->
    val platfromClient = PlatformClient(config = config)
        GlobalScope.launch {
            platformClient.catalog.getCompanyDetail()
                .safeAwait{ response,error ->
                    response?.let{
                        print(it.peekContent()?.name)
                    }
                    error?.let{
                        print(it.message)
                    }
        }
  }
```


### Documentation

- [Public Front](documentation/public/README.md)
- [Application Front](documentation/application/README.md)
- [Platform Front](documentation/platform/README.md)

