package com.sdk.universal.catalog

import kotlinx.coroutines.Deferred
import retrofit2.Response
import okhttp3.ResponseBody
import retrofit2.http.*
import retrofit2.http.Url
import retrofit2.http.HeaderMap
import com.sdk.universal.*

interface CatalogApiList {
    
    
    @GET
    suspend fun getTaxonomyByLevel(@Url url1: String?     ,      @Query("l0_slug") l0Slug: String?, @Query("l1_slug") l1Slug: String?, @Query("l2_slug") l2Slug: String?, @Query("l3_slug") l3Slug: String?, @Query("limit") limit: Double?, @HeaderMap headers: Map<String, String>? = null)
    : Response<TaxonomyResponseSchema>
    
}
