package com.sdk.platform.models.inventory

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: DataTresholdDTO
*/
@Parcelize
data class DataTresholdDTO(
    
    
    
    @SerializedName("min_price")
    var minPrice: Double?=null,
    
    @SerializedName("safe_stock")
    var safeStock: Int?=null,
    
    @SerializedName("period_threshold")
    var periodThreshold: Int?=null,
    
    @SerializedName("period_threshold_type")
    var periodThresholdType: String?=null,
    
    @SerializedName("period_type_list")
    var periodTypeList: ArrayList<GenericDTO>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenericDTO
*/
@Parcelize
data class GenericDTO(
    
    
    
    @SerializedName("text")
    var text: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: JobConfigDTO
*/
@Parcelize
data class JobConfigDTO(
    
    
    
    @SerializedName("integration")
    var integration: String?=null,
    
    @SerializedName("integration_data")
    var integrationData: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("task_details")
    var taskDetails: TaskDTO?=null,
    
    @SerializedName("threshold_details")
    var thresholdDetails: DataTresholdDTO?=null,
    
    @SerializedName("job_code")
    var jobCode: String?=null,
    
    @SerializedName("alias")
    var alias: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaskDTO
*/
@Parcelize
data class TaskDTO(
    
    
    
    @SerializedName("type")
    var type: Int?=null,
    
    @SerializedName("group_list")
    var groupList: ArrayList<GenericDTO>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Page
*/
@Parcelize
data class Page(
    
    
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("current")
    var current: Int?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ResponseEnvelopeString
*/
@Parcelize
data class ResponseEnvelopeString(
    
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    
    @SerializedName("http_status")
    var httpStatus: String?=null,
    
    @SerializedName("items")
    var items: String?=null,
    
    @SerializedName("payload")
    var payload: String?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AWSS3config
*/
@Parcelize
data class AWSS3config(
    
    
    
    @SerializedName("bucket")
    var bucket: String?=null,
    
    @SerializedName("region")
    var region: String?=null,
    
    @SerializedName("dir")
    var dir: String?=null,
    
    @SerializedName("access_key")
    var accessKey: String?=null,
    
    @SerializedName("secret_key")
    var secretKey: String?=null,
    
    @SerializedName("local_file_path")
    var localFilePath: String?=null,
    
    @SerializedName("archive_path")
    var archivePath: String?=null,
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    
    @SerializedName("delete")
    var delete: Boolean?=null,
    
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArchiveConfig
*/
@Parcelize
data class ArchiveConfig(
    
    
    
    @SerializedName("delete")
    var delete: Boolean?=null,
    
    @SerializedName("archive")
    var archive: Boolean?=null,
    
    @SerializedName("archive_dir")
    var archiveDir: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Audit
*/
@Parcelize
data class Audit(
    
    
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CatalogMasterConfig
*/
@Parcelize
data class CatalogMasterConfig(
    
    
    
    @SerializedName("source_slug")
    var sourceSlug: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CompanyConfig
*/
@Parcelize
data class CompanyConfig(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("exclude_steps")
    var excludeSteps: ArrayList<Int>?=null,
    
    @SerializedName("hidden_closet_keys")
    var hiddenClosetKeys: ArrayList<String>?=null,
    
    @SerializedName("open_tags")
    var openTags: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("tax_identifiers")
    var taxIdentifiers: ArrayList<String>?=null,
    
    @SerializedName("delete_quantity_threshold")
    var deleteQuantityThreshold: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DBConfig
*/
@Parcelize
data class DBConfig(
    
    
    
    @SerializedName("vendor")
    var vendor: String?=null,
    
    @SerializedName("host")
    var host: String?=null,
    
    @SerializedName("port")
    var port: Int?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("dbname")
    var dbname: String?=null,
    
    @SerializedName("query")
    var query: String?=null,
    
    @SerializedName("procedure")
    var procedure: Boolean?=null,
    
    @SerializedName("driver_class")
    var driverClass: String?=null,
    
    @SerializedName("jdbc_url")
    var jdbcUrl: String?=null,
    
    @SerializedName("optional_properties")
    var optionalProperties: HashMap<String,String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DBConnectionProfile
*/
@Parcelize
data class DBConnectionProfile(
    
    
    
    @SerializedName("inventory")
    var inventory: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DBParamConfig
*/
@Parcelize
data class DBParamConfig(
    
    
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DefaultHeadersDTO
*/
@Parcelize
data class DefaultHeadersDTO(
    
    
    
    @SerializedName("store")
    var store: PropBeanDTO?=null,
    
    @SerializedName("intf_article_id")
    var intfArticleId: PropBeanDTO?=null,
    
    @SerializedName("price_effective")
    var priceEffective: PropBeanDTO?=null,
    
    @SerializedName("quantity")
    var quantity: PropBeanDTO?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DocMappingConfig
*/
@Parcelize
data class DocMappingConfig(
    
    
    
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("junk_data_threshold_count")
    var junkDataThresholdCount: Int?=null,
    
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null,
    
    @SerializedName("unwind_field")
    var unwindField: String?=null,
    
    @SerializedName("default_headers")
    var defaultHeaders: DefaultHeadersDTO?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: EmailConfig
*/
@Parcelize
data class EmailConfig(
    
    
    
    @SerializedName("recepient")
    var recepient: String?=null,
    
    @SerializedName("host")
    var host: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    
    @SerializedName("read_from_content")
    var readFromContent: Boolean?=null,
    
    @SerializedName("filter_based_on_recepients")
    var filterBasedOnRecepients: Boolean?=null,
    
    @SerializedName("pcol")
    var pcol: String?=null,
    
    @SerializedName("subject_line_regex")
    var subjectLineRegex: String?=null,
    
    @SerializedName("sender_address")
    var senderAddress: String?=null,
    
    @SerializedName("local_dir")
    var localDir: String?=null,
    
    @SerializedName("folder_name_hierarchies")
    var folderNameHierarchies: ArrayList<String>?=null,
    
    @SerializedName("attachment_regex")
    var attachmentRegex: String?=null,
    
    @SerializedName("body_content_regex")
    var bodyContentRegex: String?=null,
    
    @SerializedName("password_protected")
    var passwordProtected: Boolean?=null,
    
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    
    @SerializedName("attachment_mandate")
    var attachmentMandate: Boolean?=null,
    
    @SerializedName("filter_files_after_extraction")
    var filterFilesAfterExtraction: Boolean?=null,
    
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    
    @SerializedName("read_all_unread_mails")
    var readAllUnreadMails: Boolean?=null,
    
    @SerializedName("content_type")
    var contentType: String?=null,
    
    @SerializedName("downloadable_link")
    var downloadableLink: Boolean?=null,
    
    @SerializedName("properties")
    var properties: HashMap<String,String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FTPConfig
*/
@Parcelize
data class FTPConfig(
    
    
    
    @SerializedName("host")
    var host: String?=null,
    
    @SerializedName("port")
    var port: Int?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    
    @SerializedName("retries")
    var retries: Int?=null,
    
    @SerializedName("interval")
    var interval: Int?=null,
    
    @SerializedName("local_dir")
    var localDir: String?=null,
    
    @SerializedName("remote_dir")
    var remoteDir: String?=null,
    
    @SerializedName("zip_file_regex")
    var zipFileRegex: String?=null,
    
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    
    @SerializedName("read_all_files")
    var readAllFiles: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: FileConfig
*/
@Parcelize
data class FileConfig(
    
    
    
    @SerializedName("delimiter")
    var delimiter: String?=null,
    
    @SerializedName("charset")
    var charset: String?=null,
    
    @SerializedName("properties")
    var properties: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("file_has_header")
    var fileHasHeader: Boolean?=null,
    
    @SerializedName("header_index")
    var headerIndex: Int?=null,
    
    @SerializedName("header_array")
    var headerArray: ArrayList<String>?=null,
    
    @SerializedName("data_start_index")
    var dataStartIndex: Int?=null,
    
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null,
    
    @SerializedName("junk_data_threshold_count")
    var junkDataThresholdCount: Int?=null,
    
    @SerializedName("file_type")
    var fileType: String?=null,
    
    @SerializedName("line_validity_check")
    var lineValidityCheck: Boolean?=null,
    
    @SerializedName("sheet_names")
    var sheetNames: ArrayList<String>?=null,
    
    @SerializedName("read_all_sheets")
    var readAllSheets: Boolean?=null,
    
    @SerializedName("quote_char")
    var quoteChar: String?=null,
    
    @SerializedName("escape_char")
    var escapeChar: String?=null,
    
    @SerializedName("default_headers")
    var defaultHeaders: DefaultHeadersDTO?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GoogleSpreadSheetConfig
*/
@Parcelize
data class GoogleSpreadSheetConfig(
    
    
    
    @SerializedName("range")
    var range: String?=null,
    
    @SerializedName("sheet_id")
    var sheetId: String?=null,
    
    @SerializedName("client_secret_location")
    var clientSecretLocation: String?=null,
    
    @SerializedName("cred_storage_directory")
    var credStorageDirectory: String?=null,
    
    @SerializedName("local_dir")
    var localDir: String?=null,
    
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HttpConfig
*/
@Parcelize
data class HttpConfig(
    
    
    
    @SerializedName("hosturl")
    var hosturl: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("request_params")
    var requestParams: HashMap<String,String>?=null,
    
    @SerializedName("http_method")
    var httpMethod: String?=null,
    
    @SerializedName("request_payload")
    var requestPayload: String?=null,
    
    @SerializedName("local_path")
    var localPath: String?=null,
    
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JobConfig
*/
@Parcelize
data class JobConfig(
    
    
    
    @SerializedName("_id")
    var id: Int?=null,
    
    @SerializedName("job_code")
    var jobCode: String?=null,
    
    @SerializedName("task_type")
    var taskType: String?=null,
    
    @SerializedName("sync_delay")
    var syncDelay: Int?=null,
    
    @SerializedName("cron_expression")
    var cronExpression: String?=null,
    
    @SerializedName("store_filter")
    var storeFilter: StoreFilter?=null,
    
    @SerializedName("process_config")
    var processConfig: ProcessConfig?=null,
    
    @SerializedName("store_config")
    var storeConfig: ArrayList<StoreConfig>?=null,
    
    @SerializedName("properties")
    var properties: HashMap<String,String>?=null,
    
    @SerializedName("immediate_first_run")
    var immediateFirstRun: Boolean?=null,
    
    @SerializedName("disable")
    var disable: Boolean?=null,
    
    @SerializedName("dependent_job_codes")
    var dependentJobCodes: ArrayList<String>?=null,
    
    @SerializedName("company_config")
    var companyConfig: ArrayList<CompanyConfig>?=null,
    
    @SerializedName("company_ids")
    var companyIds: ArrayList<Int>?=null,
    
    @SerializedName("tax_identifiers")
    var taxIdentifiers: ArrayList<String>?=null,
    
    @SerializedName("priority")
    var priority: String?=null,
    
    @SerializedName("period_threshold")
    var periodThreshold: Int?=null,
    
    @SerializedName("period_threshold_type")
    var periodThresholdType: String?=null,
    
    @SerializedName("db_connection_profile")
    var dbConnectionProfile: DBConnectionProfile?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("open_tags")
    var openTags: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("delete_quantity_threshold")
    var deleteQuantityThreshold: Int?=null,
    
    @SerializedName("catalog_master_config")
    var catalogMasterConfig: CatalogMasterConfig?=null,
    
    @SerializedName("aggregator_types")
    var aggregatorTypes: ArrayList<String>?=null,
    
    @SerializedName("integration_type")
    var integrationType: String?=null,
    
    @SerializedName("min_price")
    var minPrice: Double?=null,
    
    @SerializedName("audit")
    var audit: Audit?=null,
    
    @SerializedName("version")
    var version: Int?=null,
    
    @SerializedName("alias")
    var alias: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JobConfigRawDTO
*/
@Parcelize
data class JobConfigRawDTO(
    
    
    
    @SerializedName("integration")
    var integration: String?=null,
    
    @SerializedName("company_name")
    var companyName: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("data")
    var data: JobConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JsonDocConfig
*/
@Parcelize
data class JsonDocConfig(
    
    
    
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: LocalFileConfig
*/
@Parcelize
data class LocalFileConfig(
    
    
    
    @SerializedName("retries")
    var retries: Int?=null,
    
    @SerializedName("interval")
    var interval: Int?=null,
    
    @SerializedName("local_dir")
    var localDir: String?=null,
    
    @SerializedName("working_dir")
    var workingDir: String?=null,
    
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    
    @SerializedName("zip_file_regex")
    var zipFileRegex: String?=null,
    
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    
    @SerializedName("read_all_files")
    var readAllFiles: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MongoDocConfig
*/
@Parcelize
data class MongoDocConfig(
    
    
    
    @SerializedName("collection_name")
    var collectionName: String?=null,
    
    @SerializedName("find_query")
    var findQuery: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("projection_query")
    var projectionQuery: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("prop_bean_configs")
    var propBeanConfigs: ArrayList<PropBeanConfig>?=null,
    
    @SerializedName("aggregate_pipeline")
    var aggregatePipeline: @RawValue ArrayList<HashMap<String,HashMap<String,Any>>>?=null,
    
    @SerializedName("skip_save")
    var skipSave: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OAuthConfig
*/
@Parcelize
data class OAuthConfig(
    
    
    
    @SerializedName("limit")
    var limit: Int?=null,
    
    @SerializedName("pages")
    var pages: Int?=null,
    
    @SerializedName("interval")
    var interval: Int?=null,
    
    @SerializedName("consumer_key")
    var consumerKey: String?=null,
    
    @SerializedName("consumer_secret")
    var consumerSecret: String?=null,
    
    @SerializedName("token")
    var token: String?=null,
    
    @SerializedName("token_secret")
    var tokenSecret: String?=null,
    
    @SerializedName("rest_url")
    var restUrl: String?=null,
    
    @SerializedName("rest_base_url")
    var restBaseUrl: String?=null,
    
    @SerializedName("function_name")
    var functionName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProcessConfig
*/
@Parcelize
data class ProcessConfig(
    
    
    
    @SerializedName("db_config")
    var dbConfig: DBConfig?=null,
    
    @SerializedName("db_param_config")
    var dbParamConfig: DBParamConfig?=null,
    
    @SerializedName("sftp_config")
    var sftpConfig: SFTPConfig?=null,
    
    @SerializedName("aws_s3_config")
    var awsS3Config: AWSS3config?=null,
    
    @SerializedName("mongo_doc_config")
    var mongoDocConfig: MongoDocConfig?=null,
    
    @SerializedName("ftp_config")
    var ftpConfig: FTPConfig?=null,
    
    @SerializedName("email_config")
    var emailConfig: EmailConfig?=null,
    
    @SerializedName("file_config")
    var fileConfig: FileConfig?=null,
    
    @SerializedName("json_doc_config")
    var jsonDocConfig: JsonDocConfig?=null,
    
    @SerializedName("doc_mapping_config")
    var docMappingConfig: DocMappingConfig?=null,
    
    @SerializedName("task_step_config")
    var taskStepConfig: TaskStepConfig?=null,
    
    @SerializedName("http_config")
    var httpConfig: HttpConfig?=null,
    
    @SerializedName("local_file_config")
    var localFileConfig: LocalFileConfig?=null,
    
    @SerializedName("oauth_config")
    var oauthConfig: OAuthConfig?=null,
    
    @SerializedName("google_spreadsheet_config")
    var googleSpreadsheetConfig: GoogleSpreadSheetConfig?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PropBeanConfig
*/
@Parcelize
data class PropBeanConfig(
    
    
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("optional")
    var optional: Boolean?=null,
    
    @SerializedName("send")
    var send: Send?=null,
    
    @SerializedName("validations")
    var validations: @RawValue ArrayList<HashMap<String,HashMap<String,Any>>>?=null,
    
    @SerializedName("values")
    var values: ArrayList<String>?=null,
    
    @SerializedName("include")
    var include: Boolean?=null,
    
    @SerializedName("source_field")
    var sourceField: String?=null,
    
    @SerializedName("source_fields")
    var sourceFields: ArrayList<String>?=null,
    
    @SerializedName("destination_field")
    var destinationField: String?=null,
    
    @SerializedName("data_type")
    var dataType: String?=null,
    
    @SerializedName("default_value")
    var defaultValue: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("const_value")
    var constValue: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("concat_str")
    var concatStr: String?=null,
    
    @SerializedName("function_name")
    var functionName: String?=null,
    
    @SerializedName("transformer_name")
    var transformerName: String?=null,
    
    @SerializedName("all_param_function_name")
    var allParamFunctionName: String?=null,
    
    @SerializedName("sub_separator")
    var subSeparator: String?=null,
    
    @SerializedName("index_field")
    var indexField: String?=null,
    
    @SerializedName("ignore_if_not_exists")
    var ignoreIfNotExists: Boolean?=null,
    
    @SerializedName("identifier_type")
    var identifierType: String?=null,
    
    @SerializedName("projection_query")
    var projectionQuery: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("enrich_from_master")
    var enrichFromMaster: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PropBeanDTO
*/
@Parcelize
data class PropBeanDTO(
    
    
    
    @SerializedName("required")
    var required: Boolean?=null,
    
    @SerializedName("optional")
    var optional: Boolean?=null,
    
    @SerializedName("include")
    var include: Boolean?=null,
    
    @SerializedName("source_field")
    var sourceField: String?=null,
    
    @SerializedName("source_fields")
    var sourceFields: ArrayList<String>?=null,
    
    @SerializedName("destination_field")
    var destinationField: String?=null,
    
    @SerializedName("data_type")
    var dataType: String?=null,
    
    @SerializedName("default_value")
    var defaultValue: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("const_value")
    var constValue: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("concat_str")
    var concatStr: String?=null,
    
    @SerializedName("function_name")
    var functionName: String?=null,
    
    @SerializedName("transformer_name")
    var transformerName: String?=null,
    
    @SerializedName("all_param_function_name")
    var allParamFunctionName: String?=null,
    
    @SerializedName("sub_separator")
    var subSeparator: String?=null,
    
    @SerializedName("index_field")
    var indexField: String?=null,
    
    @SerializedName("ignore_if_not_exists")
    var ignoreIfNotExists: Boolean?=null,
    
    @SerializedName("identifier_type")
    var identifierType: String?=null,
    
    @SerializedName("projection_query")
    var projectionQuery: @RawValue HashMap<String,HashMap<String,Any>>?=null,
    
    @SerializedName("enrich_from_master")
    var enrichFromMaster: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ResponseEnvelopeListJobConfigRawDTO
*/
@Parcelize
data class ResponseEnvelopeListJobConfigRawDTO(
    
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    
    @SerializedName("http_status")
    var httpStatus: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<JobConfigRawDTO>?=null,
    
    @SerializedName("payload")
    var payload: ArrayList<JobConfigRawDTO>?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SFTPConfig
*/
@Parcelize
data class SFTPConfig(
    
    
    
    @SerializedName("host")
    var host: String?=null,
    
    @SerializedName("port")
    var port: Int?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("unzip")
    var unzip: Boolean?=null,
    
    @SerializedName("retries")
    var retries: Int?=null,
    
    @SerializedName("interval")
    var interval: Int?=null,
    
    @SerializedName("private_key_path")
    var privateKeyPath: String?=null,
    
    @SerializedName("strict_host_key_checking")
    var strictHostKeyChecking: Boolean?=null,
    
    @SerializedName("local_dir")
    var localDir: String?=null,
    
    @SerializedName("remote_dir")
    var remoteDir: String?=null,
    
    @SerializedName("password_protected")
    var passwordProtected: Boolean?=null,
    
    @SerializedName("zip_file_regex")
    var zipFileRegex: String?=null,
    
    @SerializedName("file_regex")
    var fileRegex: String?=null,
    
    @SerializedName("zip_format")
    var zipFormat: String?=null,
    
    @SerializedName("archive_config")
    var archiveConfig: ArchiveConfig?=null,
    
    @SerializedName("read_all_files")
    var readAllFiles: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Send
*/
@Parcelize
data class Send(
    
    
    
    @SerializedName("raw")
    var raw: Boolean?=null,
    
    @SerializedName("processed")
    var processed: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreConfig
*/
@Parcelize
data class StoreConfig(
    
    
    
    @SerializedName("job_code")
    var jobCode: String?=null,
    
    @SerializedName("storeid")
    var storeid: String?=null,
    
    @SerializedName("store_alias")
    var storeAlias: String?=null,
    
    @SerializedName("store_file_regex")
    var storeFileRegex: String?=null,
    
    @SerializedName("store_file_name")
    var storeFileName: String?=null,
    
    @SerializedName("process_config")
    var processConfig: ProcessConfig?=null,
    
    @SerializedName("properties")
    var properties: HashMap<String,String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreFilter
*/
@Parcelize
data class StoreFilter(
    
    
    
    @SerializedName("include_tags")
    var includeTags: ArrayList<String>?=null,
    
    @SerializedName("exclude_tags")
    var excludeTags: ArrayList<String>?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaskConfig
*/
@Parcelize
data class TaskConfig(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("task_config_id")
    var taskConfigId: Int?=null,
    
    @SerializedName("task_params")
    var taskParams: ArrayList<TaskParam>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaskParam
*/
@Parcelize
data class TaskParam(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("value")
    var value: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TaskStepConfig
*/
@Parcelize
data class TaskStepConfig(
    
    
    
    @SerializedName("task_configs")
    var taskConfigs: ArrayList<TaskConfig>?=null,
    
    @SerializedName("task_config_ids")
    var taskConfigIds: ArrayList<Int>?=null,
    
    @SerializedName("task_config_group_ids")
    var taskConfigGroupIds: ArrayList<Int>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JobStepsDTO
*/
@Parcelize
data class JobStepsDTO(
    
    
    
    @SerializedName("step_name")
    var stepName: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("step_execution_time")
    var stepExecutionTime: Int?=null,
    
    @SerializedName("start_count")
    var startCount: Int?=null,
    
    @SerializedName("end_count")
    var endCount: Int?=null,
    
    @SerializedName("deleted_count")
    var deletedCount: Int?=null,
    
    @SerializedName("processed_start_time")
    var processedStartTime: String?=null,
    
    @SerializedName("processed_at")
    var processedAt: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ResponseEnvelopeListJobStepsDTO
*/
@Parcelize
data class ResponseEnvelopeListJobStepsDTO(
    
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    
    @SerializedName("http_status")
    var httpStatus: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<JobStepsDTO>?=null,
    
    @SerializedName("payload")
    var payload: ArrayList<JobStepsDTO>?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ResponseEnvelopeListJobConfigDTO
*/
@Parcelize
data class ResponseEnvelopeListJobConfigDTO(
    
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    
    @SerializedName("http_status")
    var httpStatus: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<JobConfigDTO>?=null,
    
    @SerializedName("payload")
    var payload: ArrayList<JobConfigDTO>?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ResponseEnvelopeJobConfigDTO
*/
@Parcelize
data class ResponseEnvelopeJobConfigDTO(
    
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    
    @SerializedName("http_status")
    var httpStatus: String?=null,
    
    @SerializedName("items")
    var items: JobConfigDTO?=null,
    
    @SerializedName("payload")
    var payload: JobConfigDTO?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JobHistoryDto
*/
@Parcelize
data class JobHistoryDto(
    
    
    
    @SerializedName("total_added_count")
    var totalAddedCount: Int?=null,
    
    @SerializedName("total_updated_count")
    var totalUpdatedCount: Int?=null,
    
    @SerializedName("total_suppressed_count")
    var totalSuppressedCount: Int?=null,
    
    @SerializedName("total_initial_count")
    var totalInitialCount: Int?=null,
    
    @SerializedName("job_id")
    var jobId: Int?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("job_code")
    var jobCode: String?=null,
    
    @SerializedName("processed_on")
    var processedOn: String?=null,
    
    @SerializedName("filename")
    var filename: ArrayList<String>?=null,
    
    @SerializedName("error_type")
    var errorType: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JobMetricsDto
*/
@Parcelize
data class JobMetricsDto(
    
    
    
    @SerializedName("job_code")
    var jobCode: String?=null,
    
    @SerializedName("is_run_more_than_usual")
    var isRunMoreThanUsual: String?=null,
    
    @SerializedName("job_history")
    var jobHistory: ArrayList<JobHistoryDto>?=null,
    
    @SerializedName("total_success_count")
    var totalSuccessCount: Int?=null,
    
    @SerializedName("total_failure_count")
    var totalFailureCount: Int?=null,
    
    @SerializedName("total_warning_count")
    var totalWarningCount: Int?=null,
    
    @SerializedName("total_suppressed_count")
    var totalSuppressedCount: Int?=null,
    
    @SerializedName("total_job_runs")
    var totalJobRuns: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ResponseEnvelopeJobMetricsDto
*/
@Parcelize
data class ResponseEnvelopeJobMetricsDto(
    
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    
    @SerializedName("http_status")
    var httpStatus: String?=null,
    
    @SerializedName("items")
    var items: JobMetricsDto?=null,
    
    @SerializedName("payload")
    var payload: JobMetricsDto?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: JobConfigListDTO
*/
@Parcelize
data class JobConfigListDTO(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("alias")
    var alias: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: String?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ResponseEnvelopeListJobConfigListDTO
*/
@Parcelize
data class ResponseEnvelopeListJobConfigListDTO(
    
    
    
    @SerializedName("timestamp")
    var timestamp: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("error")
    var error: String?=null,
    
    @SerializedName("exception")
    var exception: String?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("total_time_taken_in_millis")
    var totalTimeTakenInMillis: Int?=null,
    
    @SerializedName("http_status")
    var httpStatus: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<JobConfigListDTO>?=null,
    
    @SerializedName("payload")
    var payload: ArrayList<JobConfigListDTO>?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("page")
    var page: Page?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



