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
    
    
    suspend fun generateReport(body: GenerateReportReq, headers: Map<String, String> = emptyMap())
    : Response<GenerateReportJson>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.generateReport(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun downloadReport(body: DownloadReport, headers: Map<String, String> = emptyMap())
    : Response<DownloadReportList>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.downloadReport(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getData(body: GetEngineReq, headers: Map<String, String> = emptyMap())
    : Response<GetEngineResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getData(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getReason(body: GetReasonReq, headers: Map<String, String> = emptyMap())
    : Response<GetReasonResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getReason(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getReportList(body: GetReportListReq, headers: Map<String, String> = emptyMap())
    : Response<GetReportListResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getReportList(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getAffiliate(body: GetAffiliate, headers: Map<String, String> = emptyMap())
    : Response<GetAffiliateResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getAffiliate(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun downloadCreditDebitNote(body: DownloadCreditDebitNoteReq, headers: Map<String, String> = emptyMap())
    : Response<DownloadCreditDebitNoteResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.downloadCreditDebitNote(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun paymentProcess(body: PaymentProcessReq, headers: Map<String, String> = emptyMap())
    : Response<PaymentProcessResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.paymentProcess(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun creditlineDataplatform(body: CreditlineDataPlatformReq, headers: Map<String, String> = emptyMap())
    : Response<CreditlineDataPlatformResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.creditlineDataplatform(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun isCreditlinePlatform(body: IsCreditlinePlatformReq, headers: Map<String, String> = emptyMap())
    : Response<IsCreditlinePlatformResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.isCreditlinePlatform(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun invoiceType(body: InvoiceTypeReq, headers: Map<String, String> = emptyMap())
    : Response<InvoiceTypeResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoiceType(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun invoiceListing(body: InvoiceListingReq, headers: Map<String, String> = emptyMap())
    : Response<InvoiceListingResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoiceListing(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun invoicePDF(body: InvoicePdfReq, headers: Map<String, String> = emptyMap())
    : Response<InvoicePdfResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoicePDF(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun isCnRefundMethod(body: IsCnRefundMethodReq, headers: Map<String, String> = emptyMap())
    : Response<IsCnRefundMethodResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.isCnRefundMethod(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun createSellerCreditNoteConfig(body: CreateSellerCreditNoteConfigReq, headers: Map<String, String> = emptyMap())
    : Response<CreateSellerCreditNoteConfigResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.createSellerCreditNoteConfig(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun deleteConfig(body: DeleteConfigReq, headers: Map<String, String> = emptyMap())
    : Response<DeleteConfigResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.deleteConfig(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun channelDisplayName(filterKey: String, headers: Map<String, String> = emptyMap())
    : Response<ChannelDisplayNameResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.channelDisplayName(
        companyId = config.companyId,filterKey = filterKey, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getPdfUrlView(body: GetPdfUrlViewReq, headers: Map<String, String> = emptyMap())
    : Response<GetPdfUrlViewResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getPdfUrlView(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun creditNoteDetails(body: CreditNoteDetailsReq, headers: Map<String, String> = emptyMap())
    : Response<CreditNoteDetailsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.creditNoteDetails(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCustomerCreditBalance(body: GetCustomerCreditBalanceReq, headers: Map<String, String> = emptyMap())
    : Response<GetCustomerCreditBalanceResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getCustomerCreditBalance(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getCnConfig(body: GetCnConfigReq, headers: Map<String, String> = emptyMap())
    : Response<GetCnConfigResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getCnConfig(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun generateReportCustomerCn(body: GenerateReportCustomerCnReq, headers: Map<String, String> = emptyMap())
    : Response<GenerateReportCustomerCnResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.generateReportCustomerCn(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun downloadReportCustomerCn(body: DownloadReportCustomerCnReq, headers: Map<String, String> = emptyMap())
    : Response<DownloadReportCustomerCnResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.downloadReportCustomerCn(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getReportingFilters(filterKey: String,affiliateId: String?=null, headers: Map<String, String> = emptyMap())
    : Response<GetReportingFiltersResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.getReportingFilters(
        companyId = config.companyId,filterKey = filterKey,affiliateId = affiliateId, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun invoicePaymentOptions(body: InvoicePaymentOptionsReq, headers: Map<String, String> = emptyMap())
    : Response<InvoicePaymentOptionsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoicePaymentOptions(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun invoicePaymentDetails(invoiceNumber: String, headers: Map<String, String> = emptyMap())
    : Response<InvoicePaymentDetailsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoicePaymentDetails(
        companyId = config.companyId,invoiceNumber = invoiceNumber, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun invoiceActivityLogs(invoiceNumber: String, headers: Map<String, String> = emptyMap())
    : Response<InvoiceActivityLogsResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.invoiceActivityLogs(
        companyId = config.companyId,invoiceNumber = invoiceNumber, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun unlockCreditNote(body: UnlockCreditNoteReq, headers: Map<String, String> = emptyMap())
    : Response<UnlockCreditNoteResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.unlockCreditNote(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun orderFreeze( headers: Map<String, String> = emptyMap())
    : Response<OrederFreezeResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            financeApiList?.orderFreeze(
        companyId = config.companyId, headers = headers)
        } else {
            null
        }
    }
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}