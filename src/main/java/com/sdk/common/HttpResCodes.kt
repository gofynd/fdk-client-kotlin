package com.sdk.common

class HttpResCodes {
    companion object {
        const val STATUS_NO_ITEMS_FOUND = 200
        const val STATUS_NOT_FOUND = 404
        const val STATUS_UNAUTHORIZED = 401
        const val STATUS_SERVER_ERROR = 500
        const val STATUS_NO_INTERNET = -1
        const val STATUS_INTERNAL_ERROR = 0
    }
}