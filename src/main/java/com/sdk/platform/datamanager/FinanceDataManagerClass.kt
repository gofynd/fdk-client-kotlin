package com.sdk.platform.datamanager

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*
import com.sdk.platform.models.finance.*
import com.sdk.platform.apis.finance.*




class FinanceDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {        
       
    private val financeApiList by lazy {
        generatefinanceApiList()
    }
    
    private fun generatefinanceApiList(): FinanceApiList? {
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
            namespace = "PlatformFinance",
            persistentCookieStore = config.persistentCookieStore
        )
        return retrofitHttpClient?.initializeRestClient(FinanceApiList::class.java) as? FinanceApiList
    }
    
    
    suspend fun generateReport(body: GenerateReportRequest)
    : Deferred<Response<GenerateReportJson>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.generateReport(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun downloadReport(body: DownloadReport)
    : Deferred<Response<DownloadReportList>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.downloadReport(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getData(body: GetEngineRequest)
    : Deferred<Response<GetEngineResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getData(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getReason(body: GetReasonRequest)
    : Deferred<Response<GetReasonResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getReason(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getReportList(body: GetReportListRequest)
    : Deferred<Response<GetEngineResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getReportList(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getAffiliate(body: GetAffiliate)
    : Deferred<Response<GetAffiliateResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getAffiliate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun downloadCreditDebitNote(body: DownloadCreditDebitNoteRequest)
    : Deferred<Response<DownloadCreditDebitNoteResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.downloadCreditDebitNote(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun paymentProcess(body: PaymentProcessRequest)
    : Deferred<Response<PaymentProcessResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.paymentProcess(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun creditlineDataplatform(body: CreditlineDataPlatformRequest)
    : Deferred<Response<CreditlineDataPlatformResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.creditlineDataplatform(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun isCreditlinePlatform(body: IsCreditlinePlatformRequest)
    : Deferred<Response<IsCreditlinePlatformResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.isCreditlinePlatform(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun invoiceType(body: InvoiceTypeRequest)
    : Deferred<Response<InvoiceTypeResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoiceType(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun invoiceListing(body: InvoiceListingRequest)
    : Deferred<Response<InvoiceListingResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoiceListing(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun invoicePDF(body: InvoicePdfRequest)
    : Deferred<Response<InvoicePdfResponse>>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoicePDF(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}