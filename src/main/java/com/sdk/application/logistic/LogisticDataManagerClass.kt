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
            
                    _relativeUrls["getAllCountries"] = "/service/application/logistics/v1.0/country-list".substring(1)
            
                    _relativeUrls["getZones"] = "/service/application/logistics/v2.0/company/{company_id}/application/{application_id}/zones".substring(1)
            
                    _relativeUrls["getGeoAreas"] = "/service/application/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas".substring(1)
            
                    _relativeUrls["getCountries"] = "/service/application/logistics/v2.0/countries".substring(1)
            
                    _relativeUrls["getCountry"] = "/service/application/logistics/v1.0/countries/{country_iso_code}".substring(1)
            
                    _relativeUrls["getLocalitiesByPrefix"] = "/service/application/logistics/v1.0/localities".substring(1)
            
                    _relativeUrls["getLocalities"] = "/service/application/logistics/v1.0/localities/{locality_type}".substring(1)
            
                    _relativeUrls["getLocality"] = "/service/application/logistics/v1.0/localities/{locality_type}/{locality_value}".substring(1)
            
                    _relativeUrls["validateAddress"] = "/service/application/logistics/v1.0/country/{country_iso_code}/address/templates/{template_name}/validate".substring(1)
            
                    _relativeUrls["createShipments"] = "/service/application/logistics/v1.0/company/{company_id}/application/{application_id}/shipments".substring(1)
            
                    _relativeUrls["getDeliveryPromise"] = "/service/application/logistics/v1.0/delivery-promise".substring(1)
            
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
    
    suspend fun getPincodeCity(pincode: String, headers: Map<String, String> = emptyMap()): Response<PincodeApiResponse>? {
        var fullUrl : String? = _relativeUrls["getPincodeCity"]
        
        fullUrl = fullUrl?.replace("{" + "pincode" +"}",pincode.toString())
        
        return logisticApiList?.getPincodeCity(fullUrl,  headers = headers)}

    
    
    suspend fun getAllCountries( headers: Map<String, String> = emptyMap()): Response<CountryListResponse>? {
        var fullUrl : String? = _relativeUrls["getAllCountries"]
        
        return logisticApiList?.getAllCountries(fullUrl, headers = headers)}

    
    
    suspend fun getZones(companyId: Int,applicationId: String,stage: String?=null,type: String?=null,pageSize: Int?=null,pageNo: Int?=null,isActive: Boolean?=null,q: String?=null,countryIsoCode: String?=null,pincode: String?=null,state: String?=null,city: String?=null,sector: String?=null, headers: Map<String, String> = emptyMap()): Response<ListViewResponseV2>? {
        var fullUrl : String? = _relativeUrls["getZones"]
        
        fullUrl = fullUrl?.replace("{" + "company_id" +"}",companyId.toString())
        
        fullUrl = fullUrl?.replace("{" + "application_id" +"}",applicationId.toString())
        
        return logisticApiList?.getZones(fullUrl,     stage = stage,  type = type,  pageSize = pageSize,  pageNo = pageNo,  isActive = isActive,  q = q,  countryIsoCode = countryIsoCode,  pincode = pincode,  state = state,  city = city,  sector = sector,headers = headers)}

    
    
    suspend fun getGeoAreas(applicationId: String,companyId: Int,pageSize: Int?=null,pageNo: Int?=null,type: String?=null,isActive: Boolean?=null,q: String?=null,countryIsoCode: String?=null,state: String?=null,city: String?=null,pincode: String?=null,sector: String?=null, headers: Map<String, String> = emptyMap()): Response<GeoAreaGetResponseBody>? {
        var fullUrl : String? = _relativeUrls["getGeoAreas"]
        
        fullUrl = fullUrl?.replace("{" + "application_id" +"}",applicationId.toString())
        
        fullUrl = fullUrl?.replace("{" + "company_id" +"}",companyId.toString())
        
        return logisticApiList?.getGeoAreas(fullUrl,     pageSize = pageSize,  pageNo = pageNo,  type = type,  isActive = isActive,  q = q,  countryIsoCode = countryIsoCode,  state = state,  city = city,  pincode = pincode,  sector = sector,headers = headers)}

    
    
    suspend fun getCountries(onboard: Boolean?=null,pageNo: Int?=null,pageSize: Int?=null,q: String?=null,hierarchy: String?=null, headers: Map<String, String> = emptyMap()): Response<GetCountries>? {
        var fullUrl : String? = _relativeUrls["getCountries"]
        
        return logisticApiList?.getCountries(fullUrl,   onboard = onboard,  pageNo = pageNo,  pageSize = pageSize,  q = q,  hierarchy = hierarchy,headers = headers)}

    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getCountries
    **/
    fun getCountriesPaginator(onboard: Boolean?=null, pageSize: Int?=null, q: String?=null, hierarchy: String?=null) : Paginator<GetCountries>{

    val paginator = Paginator<GetCountries>()

    paginator.setCallBack(object : PaginatorCallback<GetCountries> {

            override suspend fun onNext(
                onResponse: (Event<GetCountries>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                var fullUrl : String? = _relativeUrls["getCountries"]
                
                logisticApiList?.getCountries(fullUrl , onboard = onboard, pageNo = pageNo, pageSize = pageSize, q = q, hierarchy = hierarchy)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                        onResponse.invoke(response, null)
                    }

                    error?.let {
                        onResponse.invoke(null,error)
                    }
            }
        }

    })

    return paginator
    }
    
    suspend fun getCountry(countryIsoCode: String, headers: Map<String, String> = emptyMap()): Response<GetCountry>? {
        var fullUrl : String? = _relativeUrls["getCountry"]
        
        fullUrl = fullUrl?.replace("{" + "country_iso_code" +"}",countryIsoCode.toString())
        
        return logisticApiList?.getCountry(fullUrl,  headers = headers)}

    
    
    suspend fun getLocalitiesByPrefix(companyId: Int,pageNo: Int?=null,pageSize: Int?=null,q: String?=null, headers: Map<String, String> = emptyMap()): Response<GetLocalities>? {
        var fullUrl : String? = _relativeUrls["getLocalitiesByPrefix"]
        
        fullUrl = fullUrl?.replace("{" + "company_id" +"}",companyId.toString())
        
        return logisticApiList?.getLocalitiesByPrefix(fullUrl,    pageNo = pageNo,  pageSize = pageSize,  q = q,headers = headers)}

    
    
    
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getLocalitiesByPrefix
    **/
    fun getLocalitiesByPrefixPaginator(companyId: Int, pageSize: Int?=null, q: String?=null) : Paginator<GetLocalities>{

    val paginator = Paginator<GetLocalities>()

    paginator.setCallBack(object : PaginatorCallback<GetLocalities> {

            override suspend fun onNext(
                onResponse: (Event<GetLocalities>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                var fullUrl : String? = _relativeUrls["getLocalitiesByPrefix"]
                
                fullUrl = fullUrl?.replace("{" + "company_id" +"}",companyId.toString())
                
                logisticApiList?.getLocalitiesByPrefix(fullUrl , pageNo = pageNo, pageSize = pageSize, q = q)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                        onResponse.invoke(response, null)
                    }

                    error?.let {
                        onResponse.invoke(null,error)
                    }
            }
        }

    })

    return paginator
    }
    
    suspend fun getLocalities(localityType: String,country: String?=null,state: String?=null,city: String?=null,pageNo: Int?=null,pageSize: Int?=null,q: String?=null,name: String?=null, headers: Map<String, String> = emptyMap()): Response<GetLocalities>? {
        var fullUrl : String? = _relativeUrls["getLocalities"]
        
        fullUrl = fullUrl?.replace("{" + "locality_type" +"}",localityType.toString())
        
        return logisticApiList?.getLocalities(fullUrl,    country = country,  state = state,  city = city,  pageNo = pageNo,  pageSize = pageSize,  q = q,  name = name,headers = headers)}

    
    
    
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
            
            
        
            
                
            
            
        
            
                
            
            
        
            
                
            
            
        
    /**
    *
    * Summary: Paginator for getLocalities
    **/
    fun getLocalitiesPaginator(localityType: String, country: String?=null, state: String?=null, city: String?=null, pageSize: Int?=null, q: String?=null, name: String?=null) : Paginator<GetLocalities>{

    val paginator = Paginator<GetLocalities>()

    paginator.setCallBack(object : PaginatorCallback<GetLocalities> {

            override suspend fun onNext(
                onResponse: (Event<GetLocalities>?,FdkError?) -> Unit) {
                val pageId = paginator.nextId
                val pageNo = paginator.pageNo
                val pageType = "number"
                var fullUrl : String? = _relativeUrls["getLocalities"]
                
                fullUrl = fullUrl?.replace("{" + "locality_type" +"}",localityType.toString())
                
                logisticApiList?.getLocalities(fullUrl , country = country, state = state, city = city, pageNo = pageNo, pageSize = pageSize, q = q, name = name)?.safeAwait{ response, error ->
                    response?.let {
                        val page = response.peekContent()?.page
                        paginator.setPaginator(hasNext=page?.hasNext?:false,pageNo=if (page?.hasNext == true) ((pageNo ?: 0) + 1) else pageNo)
                        onResponse.invoke(response, null)
                    }

                    error?.let {
                        onResponse.invoke(null,error)
                    }
            }
        }

    })

    return paginator
    }
    
    suspend fun getLocality(localityType: String,localityValue: String,country: String?=null,state: String?=null,city: String?=null, headers: Map<String, String> = emptyMap()): Response<GetLocality>? {
        var fullUrl : String? = _relativeUrls["getLocality"]
        
        fullUrl = fullUrl?.replace("{" + "locality_type" +"}",localityType.toString())
        
        fullUrl = fullUrl?.replace("{" + "locality_value" +"}",localityValue.toString())
        
        return logisticApiList?.getLocality(fullUrl,     country = country,  state = state,  city = city,headers = headers)}

    
    
    suspend fun validateAddress(countryIsoCode: String,templateName: String,body: ValidateAddressRequest, headers: Map<String, String> = emptyMap()): Response<ValidateAddressRequest>? {
        var fullUrl : String? = _relativeUrls["validateAddress"]
        
        fullUrl = fullUrl?.replace("{" + "country_iso_code" +"}",countryIsoCode.toString())
        
        fullUrl = fullUrl?.replace("{" + "template_name" +"}",templateName.toString())
        
        return logisticApiList?.validateAddress(fullUrl,   body = body,headers = headers)}

    
    
    suspend fun createShipments(companyId: Int,applicationId: String,body: GenerateShipmentsRequest, headers: Map<String, String> = emptyMap()): Response<GenerateShipmentsAndCourierPartnerResponse>? {
        var fullUrl : String? = _relativeUrls["createShipments"]
        
        fullUrl = fullUrl?.replace("{" + "company_id" +"}",companyId.toString())
        
        fullUrl = fullUrl?.replace("{" + "application_id" +"}",applicationId.toString())
        
        return logisticApiList?.createShipments(fullUrl,   body = body,headers = headers)}

    
    
    suspend fun getDeliveryPromise(pageNo: Int?=null,pageSize: Int?=null, headers: Map<String, String> = emptyMap()): Response<GetPromiseDetails>? {
        var fullUrl : String? = _relativeUrls["getDeliveryPromise"]
        
        return logisticApiList?.getDeliveryPromise(fullUrl,   pageNo = pageNo,  pageSize = pageSize,headers = headers)}

    
    
}
