package com.sdk.common

interface ResponseCallBack<T> {
    fun onSuccess(response: T)
    fun onFailure(error: FdkError?)
}