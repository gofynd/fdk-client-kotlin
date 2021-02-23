package com.sdk.application

class ApplicationClient(config:ApplicationConfig) {
    
    val catalog by lazy {
        CatalogDataManagerClass(config)
    }
    
    val cart by lazy {
        CartDataManagerClass(config)
    }
    
    val lead by lazy {
        LeadDataManagerClass(config)
    }
    
    val payment by lazy {
        PaymentDataManagerClass(config)
    }
    
    val posCart by lazy {
        PosCartDataManagerClass(config)
    }
    
}