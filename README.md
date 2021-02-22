# FDK Kotlin


Kotlin 

# Getting Started
Get started with the Kotlin Development SDK for Fynd Platform


# Usage

1. Add the dependency in your app build.gradle 
    `implementation 'com.github.gofynd:fdk-client-kotlin:v0.0.1'` 
    in your app build.gradle 

2. Add it in your root build.gradle at the end of repositories:
     `allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}`
3. Start integrating


### Sample Usage:


1. Initialize SDK in Application Class or in Application Module (if using Dagger)
```
     var applicationConfig: ApplicationConfig? = null
        try {
            applicationConfig = ApplicationConfig(
                applicationId = "YOUR_APPLICATION_ID",
                applicationToken = "YOUR_APPLICATION_TOKEN",
                userAgent = "YOUR_USER_AGENT"
            )
        } catch (e: Exception) {
            print(e.message)
        }

        applicationConfig?.let { config ->
            val applicationClient = ApplicationClient(config = config)
            scope.launch {
                applicationClient.lead.getCustomForm("asdf444")
                    .safeAwait(
                        onSuccess = { form ->
                            val title = form.peekContent()?.title
                            print("$title")
                        },
                        onFailure = { error ->
                            print("${error.message}")
                        }
                    )
            }
        }

```

### Documentation

* [Application Front](documentation/APPLICATION.md)
* [Platform](documentation/PLATFORM.md)
* [Code Examples](documentation/EXAMPLES.md)