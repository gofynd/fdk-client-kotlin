package com.sdk.application

class ApplicationClient(config:ApplicationConfig) {
    
    val catalog by lazy {
        CatalogDataManagerClass(config)
    }
    
    val lead by lazy {
        LeadDataManagerClass(config)
    }
    
    val payment by lazy {
        PaymentDataManagerClass(config)
    }
    
    val order by lazy {
        OrderDataManagerClass(config)
    }
    
    val posCart by lazy {
        PosCartDataManagerClass(config)
    }
    
}