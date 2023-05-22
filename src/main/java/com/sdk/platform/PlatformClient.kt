package com.sdk.platform

import com.sdk.common.HttpClient
import com.sdk.platform.datamanager.*

class PlatformClient(val config:PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) {

    init {
        HttpClient.reset()
    }

    
    val common by lazy { CommonDataManagerClass(config, unauthorizedAction)}
    
    val lead by lazy { LeadDataManagerClass(config, unauthorizedAction)}
    
    val theme by lazy { ThemeDataManagerClass(config, unauthorizedAction)}
    
    val user by lazy { UserDataManagerClass(config, unauthorizedAction)}
    
    val content by lazy { ContentDataManagerClass(config, unauthorizedAction)}
    
    val billing by lazy { BillingDataManagerClass(config, unauthorizedAction)}
    
    val communication by lazy { CommunicationDataManagerClass(config, unauthorizedAction)}
    
    val payment by lazy { PaymentDataManagerClass(config, unauthorizedAction)}
    
    val order by lazy { OrderDataManagerClass(config, unauthorizedAction)}
    
    val catalog by lazy { CatalogDataManagerClass(config, unauthorizedAction)}
    
    val companyProfile by lazy { CompanyProfileDataManagerClass(config, unauthorizedAction)}
    
    val fileStorage by lazy { FileStorageDataManagerClass(config, unauthorizedAction)}
    
    val share by lazy { ShareDataManagerClass(config, unauthorizedAction)}
    
    val inventory by lazy { InventoryDataManagerClass(config, unauthorizedAction)}
    
    val configuration by lazy { ConfigurationDataManagerClass(config, unauthorizedAction)}
    
    val cart by lazy { CartDataManagerClass(config, unauthorizedAction)}
    
    val rewards by lazy { RewardsDataManagerClass(config, unauthorizedAction)}
    
    val discount by lazy { DiscountDataManagerClass(config, unauthorizedAction)}
    
    val partner by lazy { PartnerDataManagerClass(config, unauthorizedAction)}
    
    val webhook by lazy { WebhookDataManagerClass(config, unauthorizedAction)}
    
    val auditTrail by lazy { AuditTrailDataManagerClass(config, unauthorizedAction)}
    
    val logistics by lazy { LogisticsDataManagerClass(config, unauthorizedAction)}
    
    fun application(applicationId:String): ApplicationClient {
        return ApplicationClient(applicationId = applicationId,config = config)
    }

    inner class ApplicationClient(val applicationId:String,val config: PlatformConfig) {     
    
    val common by lazy { this@PlatformClient.common.ApplicationClient(applicationId,config)}
    
    val lead by lazy { this@PlatformClient.lead.ApplicationClient(applicationId,config)}
    
    val theme by lazy { this@PlatformClient.theme.ApplicationClient(applicationId,config)}
    
    val user by lazy { this@PlatformClient.user.ApplicationClient(applicationId,config)}
    
    val content by lazy { this@PlatformClient.content.ApplicationClient(applicationId,config)}
    
    val billing by lazy { this@PlatformClient.billing.ApplicationClient(applicationId,config)}
    
    val communication by lazy { this@PlatformClient.communication.ApplicationClient(applicationId,config)}
    
    val payment by lazy { this@PlatformClient.payment.ApplicationClient(applicationId,config)}
    
    val order by lazy { this@PlatformClient.order.ApplicationClient(applicationId,config)}
    
    val catalog by lazy { this@PlatformClient.catalog.ApplicationClient(applicationId,config)}
    
    val companyProfile by lazy { this@PlatformClient.companyProfile.ApplicationClient(applicationId,config)}
    
    val fileStorage by lazy { this@PlatformClient.fileStorage.ApplicationClient(applicationId,config)}
    
    val share by lazy { this@PlatformClient.share.ApplicationClient(applicationId,config)}
    
    val inventory by lazy { this@PlatformClient.inventory.ApplicationClient(applicationId,config)}
    
    val configuration by lazy { this@PlatformClient.configuration.ApplicationClient(applicationId,config)}
    
    val cart by lazy { this@PlatformClient.cart.ApplicationClient(applicationId,config)}
    
    val rewards by lazy { this@PlatformClient.rewards.ApplicationClient(applicationId,config)}
    
    val discount by lazy { this@PlatformClient.discount.ApplicationClient(applicationId,config)}
    
    val partner by lazy { this@PlatformClient.partner.ApplicationClient(applicationId,config)}
    
    val webhook by lazy { this@PlatformClient.webhook.ApplicationClient(applicationId,config)}
    
    val auditTrail by lazy { this@PlatformClient.auditTrail.ApplicationClient(applicationId,config)}
    
    val logistics by lazy { this@PlatformClient.logistics.ApplicationClient(applicationId,config)}
    
    }

}