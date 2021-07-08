package com.sdk.application

class ApplicationClient(val config:ApplicationConfig) {
    
    val catalog by lazy { CatalogDataManagerClass(config)}
    
    val cart by lazy { CartDataManagerClass(config)}
    
    val common by lazy { CommonDataManagerClass(config)}
    
    val lead by lazy { LeadDataManagerClass(config)}
    
    val theme by lazy { ThemeDataManagerClass(config)}
    
    val user by lazy { UserDataManagerClass(config)}
    
    val content by lazy { ContentDataManagerClass(config)}
    
    val communication by lazy { CommunicationDataManagerClass(config)}
    
    val share by lazy { ShareDataManagerClass(config)}
    
    val fileStorage by lazy { FileStorageDataManagerClass(config)}
    
    val configuration by lazy { ConfigurationDataManagerClass(config)}
    
    val payment by lazy { PaymentDataManagerClass(config)}
    
    val order by lazy { OrderDataManagerClass(config)}
    
    val rewards by lazy { RewardsDataManagerClass(config)}
    
    val feedback by lazy { FeedbackDataManagerClass(config)}
    
    val posCart by lazy { PosCartDataManagerClass(config)}
    
    val logistic by lazy { LogisticDataManagerClass(config)}
    
}