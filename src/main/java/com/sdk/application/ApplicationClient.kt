package com.sdk.application

import com.sdk.application.datamanager.*

class ApplicationClient(val config:ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) {
    
    val catalog by lazy { CatalogDataManagerClass(config, unauthorizedAction)}
    
    val cart by lazy { CartDataManagerClass(config, unauthorizedAction)}
    
    val common by lazy { CommonDataManagerClass(config, unauthorizedAction)}
    
    val lead by lazy { LeadDataManagerClass(config, unauthorizedAction)}
    
    val theme by lazy { ThemeDataManagerClass(config, unauthorizedAction)}
    
    val user by lazy { UserDataManagerClass(config, unauthorizedAction)}
    
    val content by lazy { ContentDataManagerClass(config, unauthorizedAction)}
    
    val communication by lazy { CommunicationDataManagerClass(config, unauthorizedAction)}
    
    val fileStorage by lazy { FileStorageDataManagerClass(config, unauthorizedAction)}
    
    val configuration by lazy { ConfigurationDataManagerClass(config, unauthorizedAction)}
    
    val payment by lazy { PaymentDataManagerClass(config, unauthorizedAction)}
    
    val order by lazy { OrderDataManagerClass(config, unauthorizedAction)}
    
    val rewards by lazy { RewardsDataManagerClass(config, unauthorizedAction)}
    
    val posCart by lazy { PosCartDataManagerClass(config, unauthorizedAction)}
    
    val logistic by lazy { LogisticDataManagerClass(config, unauthorizedAction)}
    
}