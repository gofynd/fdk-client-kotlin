package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.analytics.*
import com.sdk.platform.apis.analytics.*




class AnalyticsDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val analyticsApiList by lazy {
        generateanalyticsApiList()
    }
    
    private fun generateanalyticsApiList(): AnalyticsApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = AccessTokenInterceptor(platformConfig = config)
        val requestSignerInterceptor = RequestSignerInterceptor()
        val interceptorList = ArrayList<Interceptor>()
        interceptorList.add(headerInterceptor)
        interceptorList.add(requestSignerInterceptor)
        if(unauthorizedAction != null){
            val accessUnauthorizedInterceptor = AccessUnauthorizedInterceptor(unauthorizedAction)
            interceptorList.add(accessUnauthorizedInterceptor)
        }
        config.interceptors?.let {
            interceptorList.addAll(it)
        }
        interceptorMap["interceptor"] = interceptorList
        HttpClient.setDebuggable(config.debuggable)
        val retrofitHttpClient = HttpClient.initialize(
            baseUrl = config.domain,
            interceptorList = interceptorMap,
            namespace = "PlatformAnalytics",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(AnalyticsApiList::class.java) as? AnalyticsApiList
    }
    
    
    
    
    
    
    
    
    
    
    suspend fun createExportJob(exportType: String,body: ExportJobReq)
    : Deferred<Response<ExportJobRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.createExportJob(
        companyId = config.companyId, exportType = exportType, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getExportJobStatus(exportType: String, jobId: String)
    : Deferred<Response<ExportJobStatusRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.getExportJobStatus(
        companyId = config.companyId, exportType = exportType, jobId = jobId )
        } else {
            null
        } 
    }
    
    
    suspend fun getLogsList(logType: String, pageNo: Int?=null, pageSize: Int?=null,body: GetLogsListReq)
    : Deferred<Response<GetLogsListRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.getLogsList(
        companyId = config.companyId, logType = logType, pageNo = pageNo, pageSize = pageSize, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun searchLogs(pageNo: Int?=null, pageSize: Int?=null, logType: String,body: SearchLogReq)
    : Deferred<Response<SearchLogRes>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            analyticsApiList?.searchLogs(
        companyId = config.companyId, pageNo = pageNo, pageSize = pageSize, logType = logType, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    suspend fun getStatiscticsGroups()
    : Deferred<Response<StatsGroups>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getStatiscticsGroups(companyId = config.companyId , applicationId = applicationId  )
        } else {
            null
        }
    }
    
    
    suspend fun getStatiscticsGroupComponents(groupName: String)
    : Deferred<Response<StatsGroupComponents>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getStatiscticsGroupComponents(companyId = config.companyId , applicationId = applicationId , groupName = groupName )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentStatsCSV(componentName: String)
    : Deferred<Response<ResponseBody>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getComponentStatsCSV(companyId = config.companyId , applicationId = applicationId , componentName = componentName )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentStatsPDF(componentName: String)
    : Deferred<Response<ResponseBody>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getComponentStatsPDF(companyId = config.companyId , applicationId = applicationId , componentName = componentName )
        } else {
            null
        }
    }
    
    
    suspend fun getComponentStats(componentName: String)
    : Deferred<Response<StatsRes>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getComponentStats(companyId = config.companyId , applicationId = applicationId , componentName = componentName )
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonCartList(fromDate: String, toDate: String, pageNo: Int?=null, pageSize: Int?=null)
    : Deferred<Response<AbandonCartsList>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getAbandonCartList(companyId = config.companyId , applicationId = applicationId , fromDate = fromDate, toDate = toDate, pageNo = pageNo, pageSize = pageSize )
        } else {
            null
        }
    }
    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getAbandonCartList
    **/
    fun getAbandonCartListPaginator(
    fromDate: String, toDate: String, pageSize: Int?=null
    
    ) : Paginator<AbandonCartsList>{
        val paginator = Paginator<AbandonCartsList>()
        paginator.setCallBack(object : PaginatorCallback<AbandonCartsList> {
            
            override suspend fun onNext(
                onResponse: (Event<AbandonCartsList>?,FdkError?) -> Unit){

                if (config.oauthClient.isAccessTokenValid()) {
                    val pageId = paginator.nextId
                    val pageNo = paginator.pageNo
                    val pageType = "number"
                    analyticsApiList?.getAbandonCartList(companyId = config.companyId , applicationId = applicationId , fromDate = fromDate, toDate = toDate, pageNo = pageNo, pageSize = pageSize)?.safeAwait{ response, error ->
                        response?.let {
                            val page = response.peekContent()?.page
                            paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                            onResponse.invoke(response,null)
                        }
                        
                        error?.let {
                            onResponse.invoke(null,error)
                        }
                    }

                } else {
                    null
                }
            }
        
    })
    return paginator
    }
    
    suspend fun getAbandonCartsCSV(fromDate: String, toDate: String)
    : Deferred<Response<ResponseBody>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getAbandonCartsCSV(companyId = config.companyId , applicationId = applicationId , fromDate = fromDate, toDate = toDate )
        } else {
            null
        }
    }
    
    
    suspend fun getAbandonCartDetail(cartId: String)
    : Deferred<Response<AbandonCartDetail>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                analyticsApiList?.getAbandonCartDetail(companyId = config.companyId , applicationId = applicationId , cartId = cartId )
        } else {
            null
        }
    }
    
    
    
    
    
}
}