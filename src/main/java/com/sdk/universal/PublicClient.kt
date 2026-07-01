package com.sdk.universal

import com.sdk.universal.*

import com.sdk.universal.catalog.*
import com.sdk.universal.configuration.*
import com.sdk.universal.content.*
import com.sdk.universal.partner.*
import com.sdk.universal.webhook.*

class PublicClient(val config:PublicConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) {
    
    val catalog by lazy { CatalogDataManagerClass(config, unauthorizedAction)}
    
    val configuration by lazy { ConfigurationDataManagerClass(config, unauthorizedAction)}
    
    val content by lazy { ContentDataManagerClass(config, unauthorizedAction)}
    
    val partner by lazy { PartnerDataManagerClass(config, unauthorizedAction)}
    
    val webhook by lazy { WebhookDataManagerClass(config, unauthorizedAction)}
    
}
