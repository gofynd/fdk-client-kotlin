package com.sdk.platform.finance

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*

interface FinanceApiList {
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/generate-report")
    suspend fun generateReport(@Path("company_id") companyId: String,@Body body: GenerateReportRequest)
    : Response<GenerateReportJson>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-report")
    suspend fun downloadReport(@Path("company_id") companyId: String,@Body body: DownloadReport)
    : Response<DownloadReportList>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-data")
    suspend fun getData(@Path("company_id") companyId: String,@Body body: GetEngineRequest)
    : Response<GetEngineResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-reason")
    suspend fun getReason(@Path("company_id") companyId: String,@Body body: GetReasonRequest)
    : Response<GetReasonResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-report-list")
    suspend fun getReportList(@Path("company_id") companyId: String,@Body body: GetReportListRequest)
    : Response<GetEngineResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-affiliate-list")
    suspend fun getAffiliate(@Path("company_id") companyId: String,@Body body: GetAffiliate)
    : Response<GetAffiliateResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-credit-debit-note")
    suspend fun downloadCreditDebitNote(@Path("company_id") companyId: String,@Body body: DownloadCreditDebitNoteRequest)
    : Response<DownloadCreditDebitNoteResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/payment-process")
    suspend fun paymentProcess(@Path("company_id") companyId: String,@Body body: PaymentProcessRequest)
    : Response<PaymentProcessResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/credit-line-data")
    suspend fun creditlineDataplatform(@Path("company_id") companyId: String,@Body body: CreditlineDataPlatformRequest)
    : Response<CreditlineDataPlatformResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/creditline-opted")
    suspend fun isCreditlinePlatform(@Path("company_id") companyId: String,@Body body: IsCreditlinePlatformRequest)
    : Response<IsCreditlinePlatformResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice-type")
    suspend fun invoiceType(@Path("company_id") companyId: String,@Body body: InvoiceTypeRequest)
    : Response<InvoiceTypeResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice/listing")
    suspend fun invoiceListing(@Path("company_id") companyId: String,@Body body: InvoiceListingRequest)
    : Response<InvoiceListingResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice/pdf-view")
    suspend fun invoicePDF(@Path("company_id") companyId: String,@Body body: InvoicePdfRequest)
    : Response<InvoicePdfResponse>
    
}