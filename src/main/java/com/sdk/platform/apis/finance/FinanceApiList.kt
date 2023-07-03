package com.sdk.platform.apis.finance

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import com.sdk.platform.*
import com.sdk.platform.models.finance.*

interface FinanceApiList {
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/generate-report")
    fun generateReport(@Path("company_id") companyId: String,@Body body: GenerateReportRequest)
    : Deferred<Response<GenerateReportJson>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-report")
    fun downloadReport(@Path("company_id") companyId: String,@Body body: DownloadReport)
    : Deferred<Response<DownloadReportList>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-data")
    fun getData(@Path("company_id") companyId: String,@Body body: GetEngineRequest)
    : Deferred<Response<GetEngineResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-reason")
    fun getReason(@Path("company_id") companyId: String,@Body body: GetReasonRequest)
    : Deferred<Response<GetReasonResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-report-list")
    fun getReportList(@Path("company_id") companyId: String,@Body body: GetReportListRequest)
    : Deferred<Response<GetEngineResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-affiliate-list")
    fun getAffiliate(@Path("company_id") companyId: String,@Body body: GetAffiliate)
    : Deferred<Response<GetAffiliateResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-credit-debit-note")
    fun downloadCreditDebitNote(@Path("company_id") companyId: String,@Body body: DownloadCreditDebitNoteRequest)
    : Deferred<Response<DownloadCreditDebitNoteResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/payment-process")
    fun paymentProcess(@Path("company_id") companyId: String,@Body body: PaymentProcessRequest)
    : Deferred<Response<PaymentProcessResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/credit-line-data")
    fun creditlineDataplatform(@Path("company_id") companyId: String,@Body body: CreditlineDataPlatformRequest)
    : Deferred<Response<CreditlineDataPlatformResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/creditline-opted")
    fun isCreditlinePlatform(@Path("company_id") companyId: String,@Body body: IsCreditlinePlatformRequest)
    : Deferred<Response<IsCreditlinePlatformResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice-type")
    fun invoiceType(@Path("company_id") companyId: String,@Body body: InvoiceTypeRequest)
    : Deferred<Response<InvoiceTypeResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice/listing")
    fun invoiceListing(@Path("company_id") companyId: String,@Body body: InvoiceListingRequest)
    : Deferred<Response<InvoiceListingResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice/pdf-view")
    fun invoicePDF(@Path("company_id") companyId: String,@Body body: InvoicePdfRequest)
    : Deferred<Response<InvoicePdfResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/cn-as-refund-method")
    fun asCnRefund(@Path("company_id") companyId: String,@Body body: AsCnRefundRequest)
    : Deferred<Response<AsCnRefundResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/create-update-credit-note-config")
    fun createSellerCreditNoteConfig(@Path("company_id") companyId: String,@Body body: CreateSellerCreditNoteConfigRequest)
    : Deferred<Response<CreateSellerCreditNoteConfigResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/delete-seller-config")
    fun deleteConfig(@Path("company_id") companyId: String,@Body body: DeleteConfigRequest)
    : Deferred<Response<DeleteConfigResponse>>
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/channel-display-names")
    fun channelDisplayName(@Path("company_id") companyId: String, @Query("filter_key") filterKey: String)
    : Deferred<Response<ChannelDisplayNameResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-cn-pdf-link")
    fun getPdfUrlView(@Path("company_id") companyId: String,@Body body: GetPdfUrlViewRequest)
    : Deferred<Response<GetPdfUrlViewResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/credit-note-details")
    fun creditNoteDetails(@Path("company_id") companyId: String,@Body body: CreditNoteDetailsRequest)
    : Deferred<Response<CreditNoteDetailsResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/customer-credit-balance")
    fun getCustomerCreditBalance(@Path("company_id") companyId: String,@Body body: GetCustomerCreditBalanceRequest)
    : Deferred<Response<GetCustomerCreditBalanceResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-seller-cn-config")
    fun getCnConfig(@Path("company_id") companyId: String,@Body body: GetCnConfigRequest)
    : Deferred<Response<GetCnConfigResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/generate-report-customer-cn")
    fun generateReportCustomerCn(@Path("company_id") companyId: String,@Body body: GenerateReportCustomerCnRequest)
    : Deferred<Response<GenerateReportCustomerCnResponse>>
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-report-customer-cn")
    fun downloadReportCustomerCn(@Path("company_id") companyId: String,@Body body: DownloadReportCustomerCnRequest)
    : Deferred<Response<DownloadReportCustomerCnResponse>>
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/reporting-filters")
    fun getReportingFilters(@Path("company_id") companyId: String, @Query("filter_key") filterKey: String, @Query("affiliate_id") affiliateId: String?)
    : Deferred<Response<GetReportingFiltersResponse>>
    
}