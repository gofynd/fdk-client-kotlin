package com.sdk.application

class ApplicationClient(val config:ApplicationConfig) {
    
    val catalog by lazy { CatalogDataManagerClass(config)}
    
    val cart by lazy { CartDataManagerClass(config)}
    
    val lead by lazy { LeadDataManagerClass(config)}
    
    val user by lazy { UserDataManagerClass(config)}
    
    val communication by lazy { CommunicationDataManagerClass(config)}
    
    val share by lazy { ShareDataManagerClass(config)}
    
    val configuration by lazy { ConfigurationDataManagerClass(config)}
    
    val payment by lazy { PaymentDataManagerClass(config)}
    
    val posCart by lazy { PosCartDataManagerClass(config)}
    
    val logistic by lazy { LogisticDataManagerClass(config)}
    
}