package com.sdk.application

class ApplicationClient(config:ApplicationConfig) {
    
    val catalog by lazy {
        CatalogDataManagerClass(config)
    }
    
    val lead by lazy {
        LeadDataManagerClass(config)
    }
    
    val share by lazy {
        ShareDataManagerClass(config)
    }
    
}