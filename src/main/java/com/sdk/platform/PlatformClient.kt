package com.sdk.platform

class PlatformClient(val config:PlatformConfig) {
    
    val lead by lazy { LeadDataManagerClass(config)}
    
    val theme by lazy { ThemeDataManagerClass(config)}
    
    val user by lazy { UserDataManagerClass(config)}
    
    val content by lazy { ContentDataManagerClass(config)}
    
    val communication by lazy { CommunicationDataManagerClass(config)}
    
    val companyProfile by lazy { CompanyProfileDataManagerClass(config)}
    
    val inventory by lazy { InventoryDataManagerClass(config)}
    
    fun application(applicationId:String): Application {
        return Application(applicationId = applicationId,config = config)
    }

    inner class Application(val applicationId:String,val config: PlatformConfig) {     
    
    val lead by lazy { this@PlatformClient.lead.Application(applicationId,config)}
    
    val theme by lazy { this@PlatformClient.theme.Application(applicationId,config)}
    
    val user by lazy { this@PlatformClient.user.Application(applicationId,config)}
    
    val content by lazy { this@PlatformClient.content.Application(applicationId,config)}
    
    val communication by lazy { this@PlatformClient.communication.Application(applicationId,config)}
    
    val companyProfile by lazy { this@PlatformClient.companyProfile.Application(applicationId,config)}
    
    val inventory by lazy { this@PlatformClient.inventory.Application(applicationId,config)}
    
    }

}