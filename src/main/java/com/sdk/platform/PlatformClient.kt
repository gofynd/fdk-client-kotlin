package com.sdk.platform

class PlatformClient(val config:PlatformConfig) {
    
    val lead by lazy { LeadDataManagerClass(config)}
    
    val theme by lazy { ThemeDataManagerClass(config)}
    
    val user by lazy { UserDataManagerClass(config)}
    
    val content by lazy { ContentDataManagerClass(config)}
    
    val billing by lazy { BillingDataManagerClass(config)}
    
    val communication by lazy { CommunicationDataManagerClass(config)}
    
    val payment by lazy { PaymentDataManagerClass(config)}
    
    val order by lazy { OrderDataManagerClass(config)}
    
    val companyProfile by lazy { CompanyProfileDataManagerClass(config)}
    
    val assets by lazy { AssetsDataManagerClass(config)}
    
    val share by lazy { ShareDataManagerClass(config)}
    
    val inventory by lazy { InventoryDataManagerClass(config)}
    
    fun application(applicationId:String): Application {
        return Application(applicationId = applicationId,config = config)
    }

    inner class Application(val applicationId:String,val config: PlatformConfig) {     
    
    val lead by lazy { this@PlatformClient.lead.Application(applicationId,config)}
    
    val theme by lazy { this@PlatformClient.theme.Application(applicationId,config)}
    
    val user by lazy { this@PlatformClient.user.Application(applicationId,config)}
    
    val content by lazy { this@PlatformClient.content.Application(applicationId,config)}
    
    val billing by lazy { this@PlatformClient.billing.Application(applicationId,config)}
    
    val communication by lazy { this@PlatformClient.communication.Application(applicationId,config)}
    
    val payment by lazy { this@PlatformClient.payment.Application(applicationId,config)}
    
    val order by lazy { this@PlatformClient.order.Application(applicationId,config)}
    
    val companyProfile by lazy { this@PlatformClient.companyProfile.Application(applicationId,config)}
    
    val assets by lazy { this@PlatformClient.assets.Application(applicationId,config)}
    
    val share by lazy { this@PlatformClient.share.Application(applicationId,config)}
    
    val inventory by lazy { this@PlatformClient.inventory.Application(applicationId,config)}
    
    }

}