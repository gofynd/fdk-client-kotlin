package com.sdk.common

import androidx.annotation.NonNull

class StateLiveData<T> : SingleLiveEvent<StateData<T>>() {
    /**
     * Use this to put the Data on a LOADING Status
     */
    fun postLoading() {
        postValue(StateData<T>().loading())
    }

    /**
     * Use this to put the Data on a ERROR DataStatus
     * @param throwable the error to be handled
     */
    fun postError(
        errorCode: Int = HttpResCodes.STATUS_INTERNAL_ERROR,
        errorMessage: String? = null
    ) {
        postValue(StateData<T>().error(errorCode, message = errorMessage))
    }

    /**
     * Use this to put the Data on a SUCCESS DataStatus
     * @param data
     */
    fun postSuccess(@NonNull data: T) {
        postValue(StateData<T>().success(data))
    }

}