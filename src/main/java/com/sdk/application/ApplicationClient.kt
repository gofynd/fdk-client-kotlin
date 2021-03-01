package com.sdk.application

class ApplicationClient(config:ApplicationConfig) {
    
    val catalog by lazy {
        CatalogDataManagerClass(config)
    }
    
    val lead by lazy {
        LeadDataManagerClass(config)
    }
    
    val theme by lazy {
        ThemeDataManagerClass(config)
    }
    
    val user by lazy {
        UserDataManagerClass(config)
    }
    
    val content by lazy {
        ContentDataManagerClass(config)
    }
    
    val communication by lazy {
        CommunicationDataManagerClass(config)
    }
    
    val share by lazy {
        ShareDataManagerClass(config)
    }
    
    val fileStorage by lazy {
        FileStorageDataManagerClass(config)
    }
    
    val order by lazy {
        OrderDataManagerClass(config)
    }
    
    val feedback by lazy {
        FeedbackDataManagerClass(config)
    }
    
    val posCart by lazy {
        PosCartDataManagerClass(config)
    }
    
}