package com.sdk.application

import com.sdk.application.*
 
import com.sdk.application.cart.* 
import com.sdk.application.catalog.* 
import com.sdk.application.common.* 
import com.sdk.application.communication.* 
import com.sdk.application.configuration.* 
import com.sdk.application.content.* 
import com.sdk.application.filestorage.* 
import com.sdk.application.finance.* 
import com.sdk.application.lead.* 
import com.sdk.application.logistic.* 
import com.sdk.application.order.* 
import com.sdk.application.payment.* 
import com.sdk.application.rewards.* 
import com.sdk.application.share.* 
import com.sdk.application.theme.* 
import com.sdk.application.user.* 
import com.sdk.application.webhook.*
import com.sdk.common.LocationHeader

class ApplicationClient(val config:ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) {

    fun setLocationHeader(locationHeader: LocationHeader){
            config.locationDetail = locationHeader
    }

    fun setCurrencyCode(currencyCode:String){
        config.currencyCode = currencyCode
    }

    
    val cart by lazy { CartDataManagerClass(config, unauthorizedAction)}
    
    val catalog by lazy { CatalogDataManagerClass(config, unauthorizedAction)}
    
    val common by lazy { CommonDataManagerClass(config, unauthorizedAction)}
    
    val communication by lazy { CommunicationDataManagerClass(config, unauthorizedAction)}
    
    val configuration by lazy { ConfigurationDataManagerClass(config, unauthorizedAction)}
    
    val content by lazy { ContentDataManagerClass(config, unauthorizedAction)}
    
    val fileStorage by lazy { FileStorageDataManagerClass(config, unauthorizedAction)}
    
    val finance by lazy { FinanceDataManagerClass(config, unauthorizedAction)}
    
    val lead by lazy { LeadDataManagerClass(config, unauthorizedAction)}
    
    val logistic by lazy { LogisticDataManagerClass(config, unauthorizedAction)}
    
    val order by lazy { OrderDataManagerClass(config, unauthorizedAction)}
    
    val payment by lazy { PaymentDataManagerClass(config, unauthorizedAction)}
    
    val rewards by lazy { RewardsDataManagerClass(config, unauthorizedAction)}
    
    val share by lazy { ShareDataManagerClass(config, unauthorizedAction)}
    
    val theme by lazy { ThemeDataManagerClass(config, unauthorizedAction)}
    
    val user by lazy { UserDataManagerClass(config, unauthorizedAction)}
    
    val webhook by lazy { WebhookDataManagerClass(config, unauthorizedAction)}
    
}