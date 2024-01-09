package com.sdk.universal

import com.sdk.universal.*

import com.sdk.universal.configuration.*
import com.sdk.universal.inventory.*
import com.sdk.universal.partner.*
import com.sdk.universal.webhook.*

class PublicClient(val config:PublicConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) {
    
    val configuration by lazy { ConfigurationDataManagerClass(config, unauthorizedAction)}
    
    val inventory by lazy { InventoryDataManagerClass(config, unauthorizedAction)}
    
    val partner by lazy { PartnerDataManagerClass(config, unauthorizedAction)}
    
    val webhook by lazy { WebhookDataManagerClass(config, unauthorizedAction)}
    
}
