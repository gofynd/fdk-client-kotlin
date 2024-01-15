package com.sdk.platform.finance

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




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
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(FinanceApiList::class.java) as? FinanceApiList
    }
    
    
    suspend fun generateReport(body: GenerateReportRequest)
    : Response<GenerateReportJson>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.generateReport(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun downloadReport(body: DownloadReport)
    : Response<DownloadReportList>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.downloadReport(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getData(body: GetEngineRequest)
    : Response<GetEngineResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getData(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getReason(body: GetReasonRequest)
    : Response<GetReasonResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getReason(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getReportList(body: GetReportListRequest)
    : Response<GetReportListResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getReportList(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getAffiliate(body: GetAffiliate)
    : Response<GetAffiliateResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getAffiliate(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun downloadCreditDebitNote(body: DownloadCreditDebitNoteRequest)
    : Response<DownloadCreditDebitNoteResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.downloadCreditDebitNote(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun paymentProcess(body: PaymentProcessRequest)
    : Response<PaymentProcessResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.paymentProcess(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun creditlineDataplatform(body: CreditlineDataPlatformRequest)
    : Response<CreditlineDataPlatformResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.creditlineDataplatform(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun isCreditlinePlatform(body: IsCreditlinePlatformRequest)
    : Response<IsCreditlinePlatformResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.isCreditlinePlatform(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun invoiceType(body: InvoiceTypeRequest)
    : Response<InvoiceTypeResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoiceType(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun invoiceListing(body: InvoiceListingRequest)
    : Response<InvoiceListingResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoiceListing(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun invoicePDF(body: InvoicePdfRequest)
    : Response<InvoicePdfResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoicePDF(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun isCnRefundMethod(body: IsCnRefundMethodRequest)
    : Response<IsCnRefundMethodResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.isCnRefundMethod(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun createSellerCreditNoteConfig(body: CreateSellerCreditNoteConfigRequest)
    : Response<CreateSellerCreditNoteConfigResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.createSellerCreditNoteConfig(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun deleteConfig(body: DeleteConfigRequest)
    : Response<DeleteConfigResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.deleteConfig(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun channelDisplayName(filterKey: String)
    : Response<ChannelDisplayNameResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.channelDisplayName(
        companyId = config.companyId, filterKey = filterKey )
        } else {
            null
        } 
    }
    
    
    suspend fun getPdfUrlView(body: GetPdfUrlViewRequest)
    : Response<GetPdfUrlViewResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getPdfUrlView(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun creditNoteDetails(body: CreditNoteDetailsRequest)
    : Response<CreditNoteDetailsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.creditNoteDetails(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCustomerCreditBalance(body: GetCustomerCreditBalanceRequest)
    : Response<GetCustomerCreditBalanceResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getCustomerCreditBalance(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getCnConfig(body: GetCnConfigRequest)
    : Response<GetCnConfigResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getCnConfig(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun generateReportCustomerCn(body: GenerateReportCustomerCnRequest)
    : Response<GenerateReportCustomerCnResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.generateReportCustomerCn(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun downloadReportCustomerCn(body: DownloadReportCustomerCnRequest)
    : Response<DownloadReportCustomerCnResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.downloadReportCustomerCn(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    
    
    suspend fun getReportingFilters(filterKey: String, affiliateId: String?=null)
    : Response<GetReportingFiltersResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getReportingFilters(
        companyId = config.companyId, filterKey = filterKey, affiliateId = affiliateId )
        } else {
            null
        } 
    }
    
    
    suspend fun invoicePaymentDetails(invoiceNumber: String)
    : Response<InvoicePaymentDetailsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoicePaymentDetails(
        companyId = config.companyId, invoiceNumber = invoiceNumber )
        } else {
            null
        } 
    }
    
    
    suspend fun invoiceActivityLogs(invoiceNumber: String)
    : Response<InvoiceActivityLogsResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoiceActivityLogs(
        companyId = config.companyId, invoiceNumber = invoiceNumber )
        } else {
            null
        } 
    }
    
    
    suspend fun unlockCreditNote(body: UnlockCreditNoteRequest)
    : Response<UnlockCreditNoteResponse>? {
        
        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.unlockCreditNote(
        companyId = config.companyId, body = body)
        } else {
            null
        } 
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}