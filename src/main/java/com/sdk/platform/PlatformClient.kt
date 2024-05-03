package com.sdk.platform

import com.sdk.platform.*
import com.sdk.common.HttpClient
import com.sdk.common.LocationHeader
 
import com.sdk.platform.audittrail.* 
import com.sdk.platform.billing.* 
import com.sdk.platform.cart.* 
import com.sdk.platform.catalog.* 
import com.sdk.platform.common.* 
import com.sdk.platform.communication.* 
import com.sdk.platform.companyprofile.* 
import com.sdk.platform.configuration.* 
import com.sdk.platform.content.* 
import com.sdk.platform.discount.* 
import com.sdk.platform.filestorage.* 
import com.sdk.platform.finance.* 
import com.sdk.platform.lead.* 
import com.sdk.platform.serviceability.* 
import com.sdk.platform.order.* 
import com.sdk.platform.partner.* 
import com.sdk.platform.payment.* 
import com.sdk.platform.rewards.* 
import com.sdk.platform.share.* 
import com.sdk.platform.theme.* 
import com.sdk.platform.user.* 
import com.sdk.platform.webhook.*


class PlatformClient(val config:PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) {

    init {
        HttpClient.reset()
    }

    fun setLocationHeader(locationHeader: LocationHeader){
            config.locationDetail = locationHeader
    }

    fun setCurrencyCode(currencyCode:String){
        config.currencyCode = currencyCode
    }

    
    val auditTrail by lazy { AuditTrailDataManagerClass(config, unauthorizedAction)}
    
    val billing by lazy { BillingDataManagerClass(config, unauthorizedAction)}
    
    val cart by lazy { CartDataManagerClass(config, unauthorizedAction)}
    
    val catalog by lazy { CatalogDataManagerClass(config, unauthorizedAction)}
    
    val common by lazy { CommonDataManagerClass(config, unauthorizedAction)}
    
    val communication by lazy { CommunicationDataManagerClass(config, unauthorizedAction)}
    
    val companyProfile by lazy { CompanyProfileDataManagerClass(config, unauthorizedAction)}
    
    val configuration by lazy { ConfigurationDataManagerClass(config, unauthorizedAction)}
    
    val content by lazy { ContentDataManagerClass(config, unauthorizedAction)}
    
    val discount by lazy { DiscountDataManagerClass(config, unauthorizedAction)}
    
    val fileStorage by lazy { FileStorageDataManagerClass(config, unauthorizedAction)}
    
    val finance by lazy { FinanceDataManagerClass(config, unauthorizedAction)}
    
    val lead by lazy { LeadDataManagerClass(config, unauthorizedAction)}
    
    val serviceability by lazy { ServiceabilityDataManagerClass(config, unauthorizedAction)}
    
    val order by lazy { OrderDataManagerClass(config, unauthorizedAction)}
    
    val partner by lazy { PartnerDataManagerClass(config, unauthorizedAction)}
    
    val payment by lazy { PaymentDataManagerClass(config, unauthorizedAction)}
    
    val rewards by lazy { RewardsDataManagerClass(config, unauthorizedAction)}
    
    val share by lazy { ShareDataManagerClass(config, unauthorizedAction)}
    
    val theme by lazy { ThemeDataManagerClass(config, unauthorizedAction)}
    
    val user by lazy { UserDataManagerClass(config, unauthorizedAction)}
    
    val webhook by lazy { WebhookDataManagerClass(config, unauthorizedAction)}
    
    fun application(applicationId:String): ApplicationClient {
        return ApplicationClient(applicationId = applicationId,config = config)
    }

    inner class ApplicationClient(val applicationId:String,val config: PlatformConfig) {     
    
    val auditTrail by lazy { this@PlatformClient.auditTrail.ApplicationClient(applicationId,config)}
    
    val billing by lazy { this@PlatformClient.billing.ApplicationClient(applicationId,config)}
    
    val cart by lazy { this@PlatformClient.cart.ApplicationClient(applicationId,config)}
    
    val catalog by lazy { this@PlatformClient.catalog.ApplicationClient(applicationId,config)}
    
    val common by lazy { this@PlatformClient.common.ApplicationClient(applicationId,config)}
    
    val communication by lazy { this@PlatformClient.communication.ApplicationClient(applicationId,config)}
    
    val companyProfile by lazy { this@PlatformClient.companyProfile.ApplicationClient(applicationId,config)}
    
    val configuration by lazy { this@PlatformClient.configuration.ApplicationClient(applicationId,config)}
    
    val content by lazy { this@PlatformClient.content.ApplicationClient(applicationId,config)}
    
    val discount by lazy { this@PlatformClient.discount.ApplicationClient(applicationId,config)}
    
    val fileStorage by lazy { this@PlatformClient.fileStorage.ApplicationClient(applicationId,config)}
    
    val finance by lazy { this@PlatformClient.finance.ApplicationClient(applicationId,config)}
    
    val lead by lazy { this@PlatformClient.lead.ApplicationClient(applicationId,config)}
    
    val serviceability by lazy { this@PlatformClient.serviceability.ApplicationClient(applicationId,config)}
    
    val order by lazy { this@PlatformClient.order.ApplicationClient(applicationId,config)}
    
    val partner by lazy { this@PlatformClient.partner.ApplicationClient(applicationId,config)}
    
    val payment by lazy { this@PlatformClient.payment.ApplicationClient(applicationId,config)}
    
    val rewards by lazy { this@PlatformClient.rewards.ApplicationClient(applicationId,config)}
    
    val share by lazy { this@PlatformClient.share.ApplicationClient(applicationId,config)}
    
    val theme by lazy { this@PlatformClient.theme.ApplicationClient(applicationId,config)}
    
    val user by lazy { this@PlatformClient.user.ApplicationClient(applicationId,config)}
    
    val webhook by lazy { this@PlatformClient.webhook.ApplicationClient(applicationId,config)}
    
    }

}