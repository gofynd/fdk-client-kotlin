package com.sdk.application

class ApplicationClient(val config:ApplicationConfig) {
    
    val catalog by lazy { CatalogDataManagerClass(config)}
    
    val cart by lazy { CartDataManagerClass(config)}
    
    val fileStorage by lazy { FileStorageDataManagerClass(config)}
    
    val feedback by lazy { FeedbackDataManagerClass(config)}
    
    val posCart by lazy { PosCartDataManagerClass(config)}
    
}