package com.sdk.common

import okhttp3.Headers

open class Event<out T>(private val content: T?, private val headers: Headers? = null) {
    var hasBeenHandled = false
        private set

    fun getContentIfNotHanlded(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    fun sethasBeenHandled(isHandled:Boolean){
        hasBeenHandled=isHandled
    }

    fun peekContent() = content

    fun peekHeaders() = headers

    fun getHeadersIfNotHandled(): Headers? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            headers
        }
    }
}