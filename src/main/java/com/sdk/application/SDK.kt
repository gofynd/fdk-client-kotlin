package com.sdk.application

import android.app.Application

object SDK{

    var applicationID: String? = null
    var applicationToken: String? = null
    var domain: String? = null
    var application: Application? = null

    fun init(applicationID:String, applicationToken: String, domain:String="https://api.fynd.com",application:Application){
        this.applicationID=applicationID
        this.applicationToken=applicationToken
        this.domain=domain
        this.application=application
    }

}