package com.sdk.platform.filestorage

import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import okhttp3.ResponseBody
import com.sdk.common.*
import com.sdk.platform.*




class FileStorageDataManagerClass(val config: PlatformConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val fileStorageApiList by lazy {
        generatefileStorageApiList()
    }

    private fun generatefileStorageApiList(): FileStorageApiList? {
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
            namespace = "PlatformFileStorage",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(FileStorageApiList::class.java) as? FileStorageApiList
    }
    
    
    suspend fun startUpload(namespace: String,body: StartRequest, headers: Map<String, String> = emptyMap())
    : Response<StartResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.startUpload(
        namespace = namespace,companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun completeUpload(namespace: String,body: StartResponse, headers: Map<String, String> = emptyMap())
    : Response<CompleteResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.completeUpload(
        namespace = namespace,companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun getSignUrls(body: SignUrlRequest, headers: Map<String, String> = emptyMap())
    : Response<SignUrlResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.getSignUrls(
        companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun copyFiles(sync: Boolean?=null,body: CopyFiles, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.copyFiles(
        sync = sync,companyId = config.companyId, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun browse(namespace: String,page: Int?=null,limit: Int?=null, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.browse(
        namespace = namespace,companyId = config.companyId,page = page,limit = limit, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun proxy(url: String, headers: Map<String, String> = emptyMap())
    : Response<ProxyResponse>? {

        return if (config.oauthClient.isAccessTokenValid()) {
            fileStorageApiList?.proxy(
        companyId = config.companyId,url = url, headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    
    
    
    

inner class ApplicationClient(val applicationId:String,val config: PlatformConfig){

    
    
    
    
    suspend fun appStartUpload(namespace: String,body: StartRequest, headers: Map<String, String> = emptyMap())
    : Response<StartResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.appStartUpload(namespace = namespace,companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun appCompleteUpload(namespace: String,body: StartResponse, headers: Map<String, String> = emptyMap())
    : Response<CompleteResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.appCompleteUpload(namespace = namespace,companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    
    suspend fun appCopyFiles(sync: Boolean?=null,body: CopyFiles, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.appCopyFiles(sync = sync,companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun appbrowse(namespace: String,page: Int?=null,limit: Int?=null,search: String?=null, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.appbrowse(namespace = namespace,companyId = config.companyId ,applicationId = applicationId ,page = page,limit = limit,search = search, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun browsefiles(namespace: String,page: Int?=null,limit: Int?=null,search: String?=null,body: ExtensionSlug, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.browsefiles(namespace = namespace,companyId = config.companyId ,applicationId = applicationId ,page = page,limit = limit,search = search, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    
    suspend fun getPdfTypes(countryCode: String?=null, headers: Map<String, String> = emptyMap())
    : Response<InvoiceTypesResponse>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.getPdfTypes(companyId = config.companyId ,applicationId = applicationId ,countryCode = countryCode, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDefaultPdfData(pdfTypeId: Int,countryCode: String?=null, headers: Map<String, String> = emptyMap())
    : Response<DummyTemplateDataItems>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.getDefaultPdfData(companyId = config.companyId ,applicationId = applicationId ,pdfTypeId = pdfTypeId,countryCode = countryCode, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun updateHtmlTemplate(id: String,body: PdfConfig, headers: Map<String, String> = emptyMap())
    : Response<PdfConfigSaveSuccess>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.updateHtmlTemplate(companyId = config.companyId ,applicationId = applicationId ,id = id, body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDefaultHtmlTemplate(pdfTypeId: Int,format: String,countryCode: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PdfConfigSuccess>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.getDefaultHtmlTemplate(companyId = config.companyId ,applicationId = applicationId ,pdfTypeId = pdfTypeId,format = format,countryCode = countryCode, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun saveHtmlTemplate(body: PdfConfig, headers: Map<String, String> = emptyMap())
    : Response<PdfConfigSaveSuccess>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.saveHtmlTemplate(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun getDefaultPdfTemplate(pdfTypeId: Int,format: String,countryCode: String?=null, headers: Map<String, String> = emptyMap())
    : Response<PdfDefaultTemplateSuccess>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.getDefaultPdfTemplate(companyId = config.companyId ,applicationId = applicationId ,pdfTypeId = pdfTypeId,format = format,countryCode = countryCode, headers = headers)
        } else {
            null
        }
    }
    
    
    suspend fun generatePaymentReceipt(body: PaymentReceiptRequestBody, headers: Map<String, String> = emptyMap())
    : Response<HashMap<String,Any>>? {
        return if (config.oauthClient.isAccessTokenValid()) {
                fileStorageApiList?.generatePaymentReceipt(companyId = config.companyId ,applicationId = applicationId , body = body,headers = headers)
        } else {
            null
        }
    }
    
}
}