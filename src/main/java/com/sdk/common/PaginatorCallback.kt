package com.sdk.common

interface PaginatorCallback<T:Any>  {
   suspend fun onNext(
      onSuccess: (Event<T>) -> Unit,
      onFailure: (FdkError) -> Unit
   )
}