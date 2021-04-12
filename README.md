# FDK kotlin


FDK client for Kotlin language


## Getting Started
Get started with the Kotlin Development SDK for Fynd Platform


# Usage

1. Add the dependency in your app build.gradle `implementation 'com.github.gofynd:fdk-client-kotlin:v0.0.4'` in your app build.gradle 
2. Add it in your root build.gradle at the end of repositories:
   allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	} 
3. Start integrating

### Sample Usage:
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


### Documentation

* [Application Front](documentation/APPLICATION.md)
* [Platform Front](documentation/PLATFORM.md)