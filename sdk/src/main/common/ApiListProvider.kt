object ApiListProvider{
    fun getApiList():ApiList{
        val headerList: Map<String, String>
        val interceptorMap = HashMap<String, List<Interceptor>>()
        headerList = NetworkUtils.getCommonRestHeaders(uniketApplication)

        val authCredentials = Credentials.basic(AppConstants.AUTH_UNAME, AppConstants.AUTH_PWORD)
        val authInterceptor = AuthenticationInterceptor(authCredentials)
        val headerInterceptor = HeaderInterceptor(uniketApplication)
        val requestSignerInterceptor = RequestSignerInterceptor()

        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(authInterceptor)
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setHttpLoggingInterceptor(HttpLoggingInterceptor.Level.BODY)
        val retrofitHttpClient = HttpClient.initialize(
            SDK.application, SDK.domain,
            headerList, interceptorMap, "uniket"
        )
        val cookieManager = retrofitHttpClient.cookieManager
        val okHttpClient = retrofitHttpClient.okHttpClient
        val apiService = retrofitHttpClient.initializeRestClient(ApiList::class.java) as ApiList
        return apiService
    }
}