package com.sdk.common

class Paginator<T:Any> {

    var hasNext :Boolean = true
    var nextId: String?="*"
    var pageNo: Int?=1

    private var actionCallBack: PaginatorCallback<T>? = null

    fun setCallBack(actionCallBack: PaginatorCallback<T>) {
        this.actionCallBack = actionCallBack
    }


    fun hasNext(): Boolean {
        return hasNext
    }

    suspend fun next(
        onSuccess: (Event<T>) -> Unit,
        onFailure: (FdkError) -> Unit
    ) {
        actionCallBack?.onNext(onSuccess, onFailure)
    }


    fun setPaginator(hasNext: Boolean,nextId:String?=null) {
        this.hasNext = hasNext
        this.nextId = nextId
    }

     fun setPaginator(hasNext: Boolean,pageNo:Int?=null) {
        this.hasNext = hasNext
        this.pageNo = pageNo
    }

    fun reset() {
        this.hasNext = true
        this.nextId = "*"
        this.pageNo = 1
    }
}
