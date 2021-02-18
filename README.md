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
    SDK.init(
    applicationID: "YOUR_APPLICATION_ID",
    applicationToken: "YOUR_APPLICATION_TOKEN",
    application = "YOUR_APPLICATION_CLASS",
    domain = "BASE_URL"
    )

```


2. Implementation
```
    var ticketDataManager = LeadDataManagerClass() as LeadDataManager
    val parentJob = Job()
    val coroutineContext = parentJob + Dispatchers.IO
    val scope =  CoroutineScope(coroutineContext)
    scope.launch {
        val response = ticketDataManager?.getCustomForm(slug= "form-slug"")?.safeAwait()
        customFormLiveData.postValue(response)
    }

```

```
    Now customFormLiveData can be observed in View

    viewModel.customFormLiveData?.observe(viewLifecycleOwner, Observer {
    when (it.status) {
        
        StateData.DataStatus.SUCCESS -> {
            it.data?.getContentIfNotHanlded()?.let {
                 print(form.title)
            }
        }

        StateData.DataStatus.LOADING -> {
            print("Loading")
        }
        
        StateData.DataStatus.ERROR -> {
            print(error.message)
        }
    }
})
```


### Documentation

* [Application Front](documentation/APPLICATION.md)
* [Platform](documentation/PLATFORM.md)
* [Code Examples](documentation/EXAMPLES.md)