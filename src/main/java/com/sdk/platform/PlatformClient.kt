package com.sdk.platform

class PlatformClient(val config:PlatformConfig) {
    
    val lead by lazy { LeadDataManagerClass(config)}
    
    val theme by lazy { ThemeDataManagerClass(config)}
    
    val user by lazy { UserDataManagerClass(config)}
    
    val content by lazy { ContentDataManagerClass(config)}
    
    val companyProfile by lazy { CompanyProfileDataManagerClass(config)}
    
    val inventory by lazy { InventoryDataManagerClass(config)}
    
    fun application(applicationId:String): Application {
        return Application(applicationId = applicationId,config = config)
    }

    class Application(val applicationId:String,val config: PlatformConfig) {     
    
    val lead by lazy { LeadDataManagerClass.Application(applicationId,config)}
    
    val theme by lazy { ThemeDataManagerClass.Application(applicationId,config)}
    
    val user by lazy { UserDataManagerClass.Application(applicationId,config)}
    
    val content by lazy { ContentDataManagerClass.Application(applicationId,config)}
    
    val companyProfile by lazy { CompanyProfileDataManagerClass.Application(applicationId,config)}
    
    val inventory by lazy { InventoryDataManagerClass.Application(applicationId,config)}
    
    }

}