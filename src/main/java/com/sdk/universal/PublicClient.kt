package com.sdk.universal

import com.sdk.universal.datamanager.*

class PublicClient(val config:PublicConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) {
    
    val configuration by lazy { ConfigurationDataManagerClass(config, unauthorizedAction)}
    
}
