package com.sdk.common

interface PaginatorCallback<T:Any>  {
  
   suspend fun onNext(
      onResponse: (Event<T>?, FdkError?) -> Unit = { response, error -> }
   )
}