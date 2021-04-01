package com.sdk.platform

class PlatformClient(val config:PlatformConfig) {
    
    val user by lazy { UserDataManagerClass(config)}
    
    val payment by lazy { PaymentDataManagerClass(config)}
    
    val catalog by lazy { CatalogDataManagerClass(config)}
    
    val companyProfile by lazy { CompanyProfileDataManagerClass(config)}
    
    val assets by lazy { AssetsDataManagerClass(config)}
    
    fun application(applicationId:String): ApplicationClient {
        return ApplicationClient(applicationId = applicationId,config = config)
    }

    inner class ApplicationClient(val applicationId:String,val config: PlatformConfig) {     
    
    val user by lazy { this@PlatformClient.user.ApplicationClient(applicationId,config)}
    
    val payment by lazy { this@PlatformClient.payment.ApplicationClient(applicationId,config)}
    
    val catalog by lazy { this@PlatformClient.catalog.ApplicationClient(applicationId,config)}
    
    val companyProfile by lazy { this@PlatformClient.companyProfile.ApplicationClient(applicationId,config)}
    
    val assets by lazy { this@PlatformClient.assets.ApplicationClient(applicationId,config)}
    
    }

}