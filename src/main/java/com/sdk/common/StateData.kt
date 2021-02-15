package com.sdk.common

open class StateData<T> {
    var status: DataStatus = DataStatus.CREATED
    var data: T? = null
    var errorCode: Int? = null
    var message: String? = null
    var position:Int=-1

    var errorCodeHandled = false

    fun getErrorCodeIfNotHandled(): Int? {
        return if (!errorCodeHandled) {
            errorCodeHandled = true
            errorCode
        } else {
            null
        }
    }

    fun loading(): StateData<T> {
        this.status = DataStatus.LOADING
        this.data = null
        this.errorCode = null
        return this
    }

    fun success(data: T): StateData<T> {
        this.status = DataStatus.SUCCESS
        this.data = data
        this.errorCode = null
        return this
    }

    fun error(errorCode: Int, data: T? = null,message:String?=null): StateData<T> {
        this.status = DataStatus.ERROR
        this.message=message
        this.data = data
        this.errorCode = errorCode
        return this
    }

    enum class DataStatus {
        CREATED,
        SUCCESS,
        ERROR,
        LOADING
    }
}