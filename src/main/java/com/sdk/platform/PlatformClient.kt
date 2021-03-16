package com.sdk.platform

class PlatformClient(val config:PlatformConfig) {
    
    val lead by lazy { LeadDataManagerClass(config)}
    
    val theme by lazy { ThemeDataManagerClass(config)}
    
    val payment by lazy { PaymentDataManagerClass(config)}
    
    fun application(applicationId:String): Application {
        return Application(applicationId = applicationId,config = config)
    }

    inner class Application(val applicationId:String,val config: PlatformConfig) {     
    
    val lead by lazy { this@PlatformClient.lead.Application(applicationId,config)}
    
    val theme by lazy { this@PlatformClient.theme.Application(applicationId,config)}
    
    val payment by lazy { this@PlatformClient.payment.Application(applicationId,config)}
    
    }

}