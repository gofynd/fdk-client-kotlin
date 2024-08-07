package com.sdk.platform.finance

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.HeaderMap
import com.sdk.platform.*

interface FinanceApiList {
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/generate-report")
    suspend fun generateReport(@Path("company_id") companyId: String,@Body body: GenerateReportReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<GenerateReportJson>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-report")
    suspend fun downloadReport(@Path("company_id") companyId: String,@Body body: DownloadReport, @HeaderMap headers: Map<String, String>? = null)
    : Response<DownloadReportList>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-data")
    suspend fun getData(@Path("company_id") companyId: String,@Body body: GetEngineReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetEngineResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-reason")
    suspend fun getReason(@Path("company_id") companyId: String,@Body body: GetReasonReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetReasonResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-report-list")
    suspend fun getReportList(@Path("company_id") companyId: String,@Body body: GetReportListReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetReportListResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-affiliate-list")
    suspend fun getAffiliate(@Path("company_id") companyId: String,@Body body: GetAffiliate, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetAffiliateResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-credit-debit-note")
    suspend fun downloadCreditDebitNote(@Path("company_id") companyId: String,@Body body: DownloadCreditDebitNoteReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<DownloadCreditDebitNoteResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/payment-process")
    suspend fun paymentProcess(@Path("company_id") companyId: String,@Body body: PaymentProcessReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<PaymentProcessResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/credit-line-data")
    suspend fun creditlineDataplatform(@Path("company_id") companyId: String,@Body body: CreditlineDataPlatformReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreditlineDataPlatformResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/creditline-opted")
    suspend fun isCreditlinePlatform(@Path("company_id") companyId: String,@Body body: IsCreditlinePlatformReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<IsCreditlinePlatformResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice-type")
    suspend fun invoiceType(@Path("company_id") companyId: String,@Body body: InvoiceTypeReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<InvoiceTypeResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice/listing")
    suspend fun invoiceListing(@Path("company_id") companyId: String,@Body body: InvoiceListingReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<InvoiceListingResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice/pdf-view")
    suspend fun invoicePDF(@Path("company_id") companyId: String,@Body body: InvoicePdfReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<InvoicePdfResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/cn-as-refund-method")
    suspend fun isCnRefundMethod(@Path("company_id") companyId: String,@Body body: IsCnRefundMethodReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<IsCnRefundMethodResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/create-update-credit-note-config")
    suspend fun createSellerCreditNoteConfig(@Path("company_id") companyId: String,@Body body: CreateSellerCreditNoteConfigReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreateSellerCreditNoteConfigResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/delete-seller-config")
    suspend fun deleteConfig(@Path("company_id") companyId: String,@Body body: DeleteConfigReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<DeleteConfigResponse>
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/channel-display-names")
    suspend fun channelDisplayName(@Path("company_id") companyId: String, @Query("filter_key") filterKey: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<ChannelDisplayNameResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-cn-pdf-link")
    suspend fun getPdfUrlView(@Path("company_id") companyId: String,@Body body: GetPdfUrlViewReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetPdfUrlViewResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/credit-note-details")
    suspend fun creditNoteDetails(@Path("company_id") companyId: String,@Body body: CreditNoteDetailsReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<CreditNoteDetailsResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/customer-credit-balance")
    suspend fun getCustomerCreditBalance(@Path("company_id") companyId: String,@Body body: GetCustomerCreditBalanceReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCustomerCreditBalanceResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-seller-cn-config")
    suspend fun getCnConfig(@Path("company_id") companyId: String,@Body body: GetCnConfigReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetCnConfigResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/generate-report-customer-cn")
    suspend fun generateReportCustomerCn(@Path("company_id") companyId: String,@Body body: GenerateReportCustomerCnReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<GenerateReportCustomerCnResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-report-customer-cn")
    suspend fun downloadReportCustomerCn(@Path("company_id") companyId: String,@Body body: DownloadReportCustomerCnReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<DownloadReportCustomerCnResponse>
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/reporting-filters")
    suspend fun getReportingFilters(@Path("company_id") companyId: String, @Query("filter_key") filterKey: String, @Query("affiliate_id") affiliateId: String?, @HeaderMap headers: Map<String, String>? = null)
    : Response<GetReportingFiltersResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice-payment-options")
    suspend fun invoicePaymentOptions(@Path("company_id") companyId: String,@Body body: InvoicePaymentOptionsReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<InvoicePaymentOptionsResponse>
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/invoice/{invoice_number}/payment")
    suspend fun invoicePaymentDetails(@Path("company_id") companyId: String, @Path("invoice_number") invoiceNumber: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<InvoicePaymentDetailsResponse>
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/invoice/{invoice_number}/activity")
    suspend fun invoiceActivityLogs(@Path("company_id") companyId: String, @Path("invoice_number") invoiceNumber: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<InvoiceActivityLogsResponse>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/credit-notes/unlock")
    suspend fun unlockCreditNote(@Path("company_id") companyId: String,@Body body: UnlockCreditNoteReq, @HeaderMap headers: Map<String, String>? = null)
    : Response<UnlockCreditNoteResponse>
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/order/freeze")
    suspend fun orderFreeze(@Path("company_id") companyId: String, @HeaderMap headers: Map<String, String>? = null)
    : Response<OrederFreezeResponse>
    
}
