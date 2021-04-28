package com.sdk.platform

class PlatformClient(val config:PlatformConfig) {
    
    val lead by lazy { LeadDataManagerClass(config)}
    
    val user by lazy { UserDataManagerClass(config)}
    
    val payment by lazy { PaymentDataManagerClass(config)}
    
    val order by lazy { OrderDataManagerClass(config)}
    
    val catalog by lazy { CatalogDataManagerClass(config)}
    
    val fileStorage by lazy { FileStorageDataManagerClass(config)}
    
    val share by lazy { ShareDataManagerClass(config)}
    
    val configuration by lazy { ConfigurationDataManagerClass(config)}
    
    val cart by lazy { CartDataManagerClass(config)}
    
    fun application(applicationId:String): ApplicationClient {
        return ApplicationClient(applicationId = applicationId,config = config)
    }

    inner class ApplicationClient(val applicationId:String,val config: PlatformConfig) {     
    
    val lead by lazy { this@PlatformClient.lead.ApplicationClient(applicationId,config)}
    
    val user by lazy { this@PlatformClient.user.ApplicationClient(applicationId,config)}
    
    val payment by lazy { this@PlatformClient.payment.ApplicationClient(applicationId,config)}
    
    val order by lazy { this@PlatformClient.order.ApplicationClient(applicationId,config)}
    
    val catalog by lazy { this@PlatformClient.catalog.ApplicationClient(applicationId,config)}
    
    val fileStorage by lazy { this@PlatformClient.fileStorage.ApplicationClient(applicationId,config)}
    
    val share by lazy { this@PlatformClient.share.ApplicationClient(applicationId,config)}
    
    val configuration by lazy { this@PlatformClient.configuration.ApplicationClient(applicationId,config)}
    
    val cart by lazy { this@PlatformClient.cart.ApplicationClient(applicationId,config)}
    
    }

}