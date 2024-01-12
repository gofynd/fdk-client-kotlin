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
    : Response<GetReportListResponse>
    
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
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/cn-as-refund-method")
    suspend fun isCnRefundMethod(@Path("company_id") companyId: String,@Body body: IsCnRefundMethodRequest)
    : Response<IsCnRefundMethodResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/create-update-credit-note-config")
    suspend fun createSellerCreditNoteConfig(@Path("company_id") companyId: String,@Body body: CreateSellerCreditNoteConfigRequest)
    : Response<CreateSellerCreditNoteConfigResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/delete-seller-config")
    suspend fun deleteConfig(@Path("company_id") companyId: String,@Body body: DeleteConfigRequest)
    : Response<DeleteConfigResponse>
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/channel-display-names")
    suspend fun channelDisplayName(@Path("company_id") companyId: String, @Query("filter_key") filterKey: String)
    : Response<ChannelDisplayNameResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-cn-pdf-link")
    suspend fun getPdfUrlView(@Path("company_id") companyId: String,@Body body: GetPdfUrlViewRequest)
    : Response<GetPdfUrlViewResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/credit-note-details")
    suspend fun creditNoteDetails(@Path("company_id") companyId: String,@Body body: CreditNoteDetailsRequest)
    : Response<CreditNoteDetailsResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/customer-credit-balance")
    suspend fun getCustomerCreditBalance(@Path("company_id") companyId: String,@Body body: GetCustomerCreditBalanceRequest)
    : Response<GetCustomerCreditBalanceResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-seller-cn-config")
    suspend fun getCnConfig(@Path("company_id") companyId: String,@Body body: GetCnConfigRequest)
    : Response<GetCnConfigResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/generate-report-customer-cn")
    suspend fun generateReportCustomerCn(@Path("company_id") companyId: String,@Body body: GenerateReportCustomerCnRequest)
    : Response<GenerateReportCustomerCnResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-report-customer-cn")
    suspend fun downloadReportCustomerCn(@Path("company_id") companyId: String,@Body body: DownloadReportCustomerCnRequest)
    : Response<DownloadReportCustomerCnResponse>
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/reporting-filters")
    suspend fun getReportingFilters(@Path("company_id") companyId: String, @Query("filter_key") filterKey: String, @Query("affiliate_id") affiliateId: String?)
    : Response<GetReportingFiltersResponse>
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/invoice/{invoice_number}/payment")
    suspend fun invoicePaymentDetails(@Path("company_id") companyId: String, @Path("invoice_number") invoiceNumber: String)
    : Response<InvoicePaymentDetailsResponse>
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/invoice/{invoice_number}/activity")
    suspend fun invoiceActivityLogs(@Path("company_id") companyId: String, @Path("invoice_number") invoiceNumber: String)
    : Response<InvoiceActivityLogsResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/credit-notes/unlock")
    suspend fun unlockCreditNote(@Path("company_id") companyId: String,@Body body: UnlockCreditNoteRequest)
    : Response<UnlockCreditNoteResponse>
    
}