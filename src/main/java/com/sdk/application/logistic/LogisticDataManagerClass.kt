package com.sdk.application.logistic

import com.sdk.common.*
import com.sdk.application.*
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response


class LogisticDataManagerClass(val config: ApplicationConfig, val unauthorizedAction: ((url: String, responseCode: Int) -> Unit)? = null) : BaseRepository() {

    private val logisticApiList by lazy {
        generatelogisticApiList()
    }

    private var _relativeUrls : HashMap<String,String> = HashMap<String,String>()

    init{
            
                    _relativeUrls["getPincodeCity"] = "/service/application/logistics/v1.0/pincode/{pincode}".substring(1)
            
                    _relativeUrls["getTatProduct"] = "/service/application/logistics/v1.0/".substring(1)
            
                    _relativeUrls["getAllCountries"] = "/service/application/logistics/v1.0/country-list".substring(1)
            
                    _relativeUrls["getPincodeZones"] = "/service/application/logistics/v1.0/pincode/zones".substring(1)
            
                    _relativeUrls["getOptimalLocations"] = "/service/application/logistics/v1.0/reassign_stores".substring(1)
            
                    _relativeUrls["getCourierPartners"] = "/service/application/logistics/v1.0/company/{company_id}/application/{application_id}/shipment/courier-partners".substring(1)
            
                    _relativeUrls["getLocations"] = "/service/application/logistics/v1.0/locations".substring(1)
            
                    _relativeUrls["getCountries"] = "/service/application/logistics/v2.0/countries".substring(1)
            
                    _relativeUrls["getCountry"] = "/service/application/logistics/v1.0/countries/{country_iso_code}".substring(1)
            
                    _relativeUrls["getDeliveryPromise"] = "/service/application/logistics/v1.0/delivery-promise".substring(1)
            
                    _relativeUrls["getLocalities"] = "/service/application/logistics/v1.0/localities/{locality_type}".substring(1)
            
                    _relativeUrls["getLocality"] = "/service/application/logistics/v1.0/localities/{locality_type}/{locality_value}".substring(1)
            
                    _relativeUrls["validateAddress"] = "/service/application/logistics/v1.0/country/{country_iso_code}/address/templates/{template_name}/validate".substring(1)
            
    }

    public fun update(updatedUrlMap : HashMap<String,String>){
            for((key,value) in updatedUrlMap){
                _relativeUrls[key] = value
            }
    }


    private fun generatelogisticApiList(): LogisticApiList? {
        val interceptorMap = HashMap<String, List<Interceptor>>()
        val headerInterceptor = ApplicationHeaderInterceptor(config)
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
            namespace = "ApplicationLogistic",
            persistentCookieStore = config.persistentCookieStore,
            certPublicKey = config.certPublicKey
        )
        return retrofitHttpClient?.initializeRestClient(LogisticApiList::class.java) as? LogisticApiList
    }
    
    suspend fun getPincodeCity(pincode: String, headers: Map<String, String> = emptyMap()): Response<PincodeDetails>? {
        var fullUrl : String? = _relativeUrls["getPincodeCity"]
        
        fullUrl = fullUrl?.replace("{" + "pincode" +"}",pincode.toString())
        
        return logisticApiList?.getPincodeCity(fullUrl,  headers = headers)}

    
    
    suspend fun getTatProduct(body: TATViewDetails, headers: Map<String, String> = emptyMap()): Response<TATViewResult>? {
        var fullUrl : String? = _relativeUrls["getTatProduct"]
        
        return logisticApiList?.getTatProduct(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getAllCountries( headers: Map<String, String> = emptyMap()): Response<CountryListResult>? {
        var fullUrl : String? = _relativeUrls["getAllCountries"]
        
        return logisticApiList?.getAllCountries(fullUrl, headers = headers)}

    
    
    suspend fun getPincodeZones(body: GetZoneFromPincodeViewDetails, headers: Map<String, String> = emptyMap()): Response<GetZoneFromPincodeViewResult>? {
        var fullUrl : String? = _relativeUrls["getPincodeZones"]
        
        return logisticApiList?.getPincodeZones(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getOptimalLocations(body: ReAssignStoreDetails, headers: Map<String, String> = emptyMap()): Response<ReAssignStoreResult>? {
        var fullUrl : String? = _relativeUrls["getOptimalLocations"]
        
        return logisticApiList?.getOptimalLocations(fullUrl, body = body,headers = headers)}

    
    
    suspend fun getCourierPartners(companyId: Int,applicationId: String,body: ShipmentCourierPartnerDetails, headers: Map<String, String> = emptyMap()): Response<ShipmentCourierPartnerResult>? {
        var fullUrl : String? = _relativeUrls["getCourierPartners"]
        
        fullUrl = fullUrl?.replace("{" + "company_id" +"}",companyId.toString())
        
        fullUrl = fullUrl?.replace("{" + "application_id" +"}",applicationId.toString())
        
        return logisticApiList?.getCourierPartners(fullUrl,   body = body,headers = headers)}

    
    
    suspend fun getLocations(xApplicationId: String,xApplicationData: String,country: String?=null,state: String?=null,city: String?=null,pincode: Int?=null,sector: String?=null,pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<GetStoreResult>? {
        var fullUrl : String? = _relativeUrls["getLocations"]
        
        return logisticApiList?.getLocations(fullUrl,   xApplicationId = xApplicationId,  xApplicationData = xApplicationData,  country = country,  state = state,  city = city,  pincode = pincode,  sector = sector,  pageNo = pageNo,  pageSize = pageSize,headers = headers)}

    
    
    suspend fun getCountries(onboarding: Boolean?=null,pageNo: Int?=null,pageSize: Int?=null,q: String?=null,hierarchy: String?=null, headers: Map<String, String> = emptyMap()): Response<GetCountries>? {
        var fullUrl : String? = _relativeUrls["getCountries"]
        
        return logisticApiList?.getCountries(fullUrl,   onboarding = onboarding,  pageNo = pageNo,  pageSize = pageSize,  q = q,  hierarchy = hierarchy,headers = headers)}

    
    
    suspend fun getCountry(countryIsoCode: String, headers: Map<String, String> = emptyMap()): Response<GetCountry>? {
        var fullUrl : String? = _relativeUrls["getCountry"]
        
        fullUrl = fullUrl?.replace("{" + "country_iso_code" +"}",countryIsoCode.toString())
        
        return logisticApiList?.getCountry(fullUrl,  headers = headers)}

    
    
    suspend fun getDeliveryPromise(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<GetPromiseDetails>? {
        var fullUrl : String? = _relativeUrls["getDeliveryPromise"]
        
        return logisticApiList?.getDeliveryPromise(fullUrl,   pageNo = pageNo,  pageSize = pageSize,headers = headers)}

    
    
    suspend fun getLocalities(localityType: String,country: String?=null,state: String?=null,city: String?=null,pageNo: Int?=null,pageSize: Int?=null,q: String?=null,sector: String?=null, headers: Map<String, String> = emptyMap()): Response<GetLocalities>? {
        var fullUrl : String? = _relativeUrls["getLocalities"]
        
        fullUrl = fullUrl?.replace("{" + "locality_type" +"}",localityType.toString())
        
        return logisticApiList?.getLocalities(fullUrl,    country = country,  state = state,  city = city,  pageNo = pageNo,  pageSize = pageSize,  q = q,  sector = sector,headers = headers)}

    
    
    suspend fun getLocality(localityType: String,localityValue: String,country: String?=null,state: String?=null,city: String?=null, headers: Map<String, String> = emptyMap()): Response<GetLocality>? {
        var fullUrl : String? = _relativeUrls["getLocality"]
        
        fullUrl = fullUrl?.replace("{" + "locality_type" +"}",localityType.toString())
        
        fullUrl = fullUrl?.replace("{" + "locality_value" +"}",localityValue.toString())
        
        return logisticApiList?.getLocality(fullUrl,     country = country,  state = state,  city = city,headers = headers)}

    
    
    suspend fun validateAddress(countryIsoCode: String,templateName: String,body: ValidateAddressDetails, headers: Map<String, String> = emptyMap()): Response<ValidateAddressDetails>? {
        var fullUrl : String? = _relativeUrls["validateAddress"]
        
        fullUrl = fullUrl?.replace("{" + "country_iso_code" +"}",countryIsoCode.toString())
        
        fullUrl = fullUrl?.replace("{" + "template_name" +"}",templateName.toString())
        
        return logisticApiList?.validateAddress(fullUrl,   body = body,headers = headers)}

    
    
}
