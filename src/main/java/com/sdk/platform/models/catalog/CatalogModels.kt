package com.sdk.platform.models.catalog

import com.sdk.platform.*


import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: SearchKeywordResult
*/
@Parcelize
data class SearchKeywordResult(
    
    
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateSearchKeyword
*/
@Parcelize
data class CreateSearchKeyword(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    
    @SerializedName("result")
    var result: SearchKeywordResult?=null,
    
    @SerializedName("app_id")
    var appId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetSearchWordsData
*/
@Parcelize
data class GetSearchWordsData(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    
    @SerializedName("result")
    var result: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ErrorResponse
*/
@Parcelize
data class ErrorResponse(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DeleteResponse
*/
@Parcelize
data class DeleteResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
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
    Model: GetSearchWordsDetailResponse
*/
@Parcelize
data class GetSearchWordsDetailResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: GetSearchWordsData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetSearchWordsResponse
*/
@Parcelize
data class GetSearchWordsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetSearchWordsData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Media
*/
@Parcelize
data class Media(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AutocompletePageAction
*/
@Parcelize
data class AutocompletePageAction(
    
    
    
    @SerializedName("query")
    var query: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("params")
    var params: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AutocompleteAction
*/
@Parcelize
data class AutocompleteAction(
    
    
    
    @SerializedName("page")
    var page: AutocompletePageAction?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AutocompleteResult
*/
@Parcelize
data class AutocompleteResult(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null,
    
    @SerializedName("action")
    var action: AutocompleteAction?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateAutocompleteKeyword
*/
@Parcelize
data class CreateAutocompleteKeyword(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("results")
    var results: ArrayList<AutocompleteResult>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAutocompleteWordsData
*/
@Parcelize
data class GetAutocompleteWordsData(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAutocompleteWordsResponse
*/
@Parcelize
data class GetAutocompleteWordsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetAutocompleteWordsData>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CreateAutocompleteWordsResponse
*/
@Parcelize
data class CreateAutocompleteWordsResponse(
    
    
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("results")
    var results: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("words")
    var words: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBundleItem
*/
@Parcelize
data class ProductBundleItem(
    
    
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("product_uid")
    var productUid: Int?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBundleRequest
*/
@Parcelize
data class ProductBundleRequest(
    
    
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetProductBundleCreateResponse
*/
@Parcelize
data class GetProductBundleCreateResponse(
    
    
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetProductBundleListingResponse
*/
@Parcelize
data class GetProductBundleListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetProductBundleCreateResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBundleUpdateRequest
*/
@Parcelize
data class ProductBundleUpdateRequest(
    
    
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("products")
    var products: ArrayList<ProductBundleItem>?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Size
*/
@Parcelize
data class Size(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("is_available")
    var isAvailable: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LimitedProductData
*/
@Parcelize
data class LimitedProductData(
    
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<String>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("images")
    var images: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price")
    var price: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Price
*/
@Parcelize
data class Price(
    
    
    
    @SerializedName("min_effective")
    var minEffective: Double?=null,
    
    @SerializedName("min_marked")
    var minMarked: Double?=null,
    
    @SerializedName("max_effective")
    var maxEffective: Double?=null,
    
    @SerializedName("max_marked")
    var maxMarked: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetProducts
*/
@Parcelize
data class GetProducts(
    
    
    
    @SerializedName("auto_add_to_cart")
    var autoAddToCart: Boolean?=null,
    
    @SerializedName("max_quantity")
    var maxQuantity: Int?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<Size>?=null,
    
    @SerializedName("min_quantity")
    var minQuantity: Int?=null,
    
    @SerializedName("allow_remove")
    var allowRemove: Boolean?=null,
    
    @SerializedName("product_details")
    var productDetails: LimitedProductData?=null,
    
    @SerializedName("auto_select")
    var autoSelect: Boolean?=null,
    
    @SerializedName("price")
    var price: Price?=null,
    
    @SerializedName("product_uid")
    var productUid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetProductBundleResponse
*/
@Parcelize
data class GetProductBundleResponse(
    
    
    
    @SerializedName("same_store_assignment")
    var sameStoreAssignment: Boolean?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("page_visibility")
    var pageVisibility: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("products")
    var products: ArrayList<GetProducts>?=null,
    
    @SerializedName("choice")
    var choice: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Meta
*/
@Parcelize
data class Meta(
    
    
    
    @SerializedName("headers")
    var headers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("values")
    var values: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Guide
*/
@Parcelize
data class Guide(
    
    
    
    @SerializedName("meta")
    var meta: Meta?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateSizeGuide
*/
@Parcelize
data class ValidateSizeGuide(
    
    
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("guide")
    var guide: Guide?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("image")
    var image: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SuccessResponse
*/
@Parcelize
data class SuccessResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ListSizeGuide
*/
@Parcelize
data class ListSizeGuide(
    
    
    
    @SerializedName("page")
    var page: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SizeGuideResponse
*/
@Parcelize
data class SizeGuideResponse(
    
    
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("active")
    var active: Boolean?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("guide")
    var guide: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MOQData
*/
@Parcelize
data class MOQData(
    
    
    
    @SerializedName("maximum")
    var maximum: Int?=null,
    
    @SerializedName("increment_unit")
    var incrementUnit: Int?=null,
    
    @SerializedName("minimum")
    var minimum: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SEOData
*/
@Parcelize
data class SEOData(
    
    
    
    @SerializedName("description")
    var description: @RawValue Any?=null,
    
    @SerializedName("title")
    var title: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OwnerAppItemResponse
*/
@Parcelize
data class OwnerAppItemResponse(
    
    
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null,
    
    @SerializedName("moq")
    var moq: MOQData?=null,
    
    @SerializedName("alt_text")
    var altText: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_cod")
    var isCod: Boolean?=null,
    
    @SerializedName("seo")
    var seo: SEOData?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationItemMOQ
*/
@Parcelize
data class ApplicationItemMOQ(
    
    
    
    @SerializedName("maximum")
    var maximum: Int?=null,
    
    @SerializedName("increment_unit")
    var incrementUnit: Int?=null,
    
    @SerializedName("minimum")
    var minimum: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MetaFields
*/
@Parcelize
data class MetaFields(
    
    
    
    @SerializedName("key")
    var key: @RawValue Any?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationItemSEO
*/
@Parcelize
data class ApplicationItemSEO(
    
    
    
    @SerializedName("description")
    var description: @RawValue Any?=null,
    
    @SerializedName("title")
    var title: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationItemMeta
*/
@Parcelize
data class ApplicationItemMeta(
    
    
    
    @SerializedName("is_gift")
    var isGift: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("moq")
    var moq: ApplicationItemMOQ?=null,
    
    @SerializedName("alt_text")
    var altText: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_custom_meta")
    var customMeta: ArrayList<MetaFields>?=null,
    
    @SerializedName("is_cod")
    var isCod: Boolean?=null,
    
    @SerializedName("seo")
    var seo: ApplicationItemSEO?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SuccessResponse1
*/
@Parcelize
data class SuccessResponse1(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetConfigMetadataResponse
*/
@Parcelize
data class GetConfigMetadataResponse(
    
    
    
    @SerializedName("values")
    var values: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("condition")
    var condition: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeDetailsGroup
*/
@Parcelize
data class AttributeDetailsGroup(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppConfigurationDetail
*/
@Parcelize
data class AppConfigurationDetail(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("template_slugs")
    var templateSlugs: ArrayList<String>?=null,
    
    @SerializedName("attributes")
    var attributes: ArrayList<AttributeDetailsGroup>?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigErrorResponse
*/
@Parcelize
data class ConfigErrorResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PageResponseType
*/
@Parcelize
data class PageResponseType(
    
    
    
    @SerializedName("total_count")
    var totalCount: Int?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("next")
    var next: Int?=null,
    
    @SerializedName("current")
    var current: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetConfigResponse
*/
@Parcelize
data class GetConfigResponse(
    
    
    
    @SerializedName("page")
    var page: PageResponseType?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigSuccessResponse
*/
@Parcelize
data class ConfigSuccessResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AppConfigurationsSort
*/
@Parcelize
data class AppConfigurationsSort(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("default_key")
    var defaultKey: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AllowSingleRequest
*/
@Parcelize
data class AllowSingleRequest(
    
    
    
    @SerializedName("allow_single")
    var allowSingle: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DefaultKeyRequest
*/
@Parcelize
data class DefaultKeyRequest(
    
    
    
    @SerializedName("default_key")
    var defaultKey: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: GetCatalogConfigurationDetailsProduct
*/
@Parcelize
data class GetCatalogConfigurationDetailsProduct(
    
    
    
    @SerializedName("variant")
    var variant: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("compare")
    var compare: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("similar")
    var similar: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("detail")
    var detail: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MetaDataListingSortMetaResponse
*/
@Parcelize
data class MetaDataListingSortMetaResponse(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: MetaDataListingSortResponse
*/
@Parcelize
data class MetaDataListingSortResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<MetaDataListingSortMetaResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: MetaDataListingFilterMetaResponse
*/
@Parcelize
data class MetaDataListingFilterMetaResponse(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("units")
    var units: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("filter_types")
    var filterTypes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: MetaDataListingFilterResponse
*/
@Parcelize
data class MetaDataListingFilterResponse(
    
    
    
    @SerializedName("data")
    var data: ArrayList<MetaDataListingFilterMetaResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: MetaDataListingResponse
*/
@Parcelize
data class MetaDataListingResponse(
    
    
    
    @SerializedName("sort")
    var sort: MetaDataListingSortResponse?=null,
    
    @SerializedName("filter")
    var filter: MetaDataListingFilterResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCatalogConfigurationMetaData
*/
@Parcelize
data class GetCatalogConfigurationMetaData(
    
    
    
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null,
    
    @SerializedName("listing")
    var listing: MetaDataListingResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListingSortConfig
*/
@Parcelize
data class ConfigurationListingSortConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListingSort
*/
@Parcelize
data class ConfigurationListingSort(
    
    
    
    @SerializedName("default_key")
    var defaultKey: String?=null,
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationListingSortConfig>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationBucketPoints
*/
@Parcelize
data class ConfigurationBucketPoints(
    
    
    
    @SerializedName("end")
    var end: Double?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("start")
    var start: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListingFilterValue
*/
@Parcelize
data class ConfigurationListingFilterValue(
    
    
    
    @SerializedName("sort")
    var sort: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("bucket_points")
    var bucketPoints: ArrayList<ConfigurationBucketPoints>?=null,
    
    @SerializedName("map_values")
    var mapValues: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("condition")
    var condition: String?=null,
    
    @SerializedName("map")
    var map: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListingFilterConfig
*/
@Parcelize
data class ConfigurationListingFilterConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("value_config")
    var valueConfig: ConfigurationListingFilterValue?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListingFilter
*/
@Parcelize
data class ConfigurationListingFilter(
    
    
    
    @SerializedName("attribute_config")
    var attributeConfig: ArrayList<ConfigurationListingFilterConfig>?=null,
    
    @SerializedName("allow_single")
    var allowSingle: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationListing
*/
@Parcelize
data class ConfigurationListing(
    
    
    
    @SerializedName("sort")
    var sort: ConfigurationListingSort?=null,
    
    @SerializedName("filter")
    var filter: ConfigurationListingFilter?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSize
*/
@Parcelize
data class ProductSize(
    
    
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationProductVariantConfig
*/
@Parcelize
data class ConfigurationProductVariantConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("size")
    var size: ProductSize?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("display_type")
    var displayType: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationProductVariant
*/
@Parcelize
data class ConfigurationProductVariant(
    
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationProductVariantConfig>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ConfigurationProductConfig
*/
@Parcelize
data class ConfigurationProductConfig(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("subtitle")
    var subtitle: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("size")
    var size: ProductSize?=null,
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ConfigurationProductSimilar
*/
@Parcelize
data class ConfigurationProductSimilar(
    
    
    
    @SerializedName("config")
    var config: ArrayList<ConfigurationProductConfig>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ConfigurationProduct
*/
@Parcelize
data class ConfigurationProduct(
    
    
    
    @SerializedName("variant")
    var variant: ConfigurationProductVariant?=null,
    
    @SerializedName("similar")
    var similar: ConfigurationProductSimilar?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AppConfiguration
*/
@Parcelize
data class AppConfiguration(
    
    
    
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("config_id")
    var configId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AppCatalogConfiguration
*/
@Parcelize
data class AppCatalogConfiguration(
    
    
    
    @SerializedName("listing")
    var listing: ConfigurationListing?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product")
    var product: ConfigurationProduct?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("config_id")
    var configId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAppCatalogConfiguration
*/
@Parcelize
data class GetAppCatalogConfiguration(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("data")
    var data: AppCatalogConfiguration?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCatalogConfigurationDetailsSchemaListing
*/
@Parcelize
data class GetCatalogConfigurationDetailsSchemaListing(
    
    
    
    @SerializedName("sort")
    var sort: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filter")
    var filter: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: EntityConfiguration
*/
@Parcelize
data class EntityConfiguration(
    
    
    
    @SerializedName("listing")
    var listing: GetCatalogConfigurationDetailsSchemaListing?=null,
    
    @SerializedName("config_type")
    var configType: String?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("product")
    var product: GetCatalogConfigurationDetailsProduct?=null,
    
    @SerializedName("config_id")
    var configId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAppCatalogEntityConfiguration
*/
@Parcelize
data class GetAppCatalogEntityConfiguration(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("data")
    var data: EntityConfiguration?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSortOn
*/
@Parcelize
data class ProductSortOn(
    
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFiltersKey
*/
@Parcelize
data class ProductFiltersKey(
    
    
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("operators")
    var operators: ArrayList<String>?=null,
    
    @SerializedName("kind")
    var kind: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFiltersValue
*/
@Parcelize
data class ProductFiltersValue(
    
    
    
    @SerializedName("display_format")
    var displayFormat: String?=null,
    
    @SerializedName("selected_max")
    var selectedMax: Int?=null,
    
    @SerializedName("value")
    var value: @RawValue Any?=null,
    
    @SerializedName("selected_min")
    var selectedMin: Int?=null,
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("query_format")
    var queryFormat: String?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("count")
    var count: Int?=null,
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductFilters
*/
@Parcelize
data class ProductFilters(
    
    
    
    @SerializedName("key")
    var key: ProductFiltersKey?=null,
    
    @SerializedName("values")
    var values: ArrayList<ProductFiltersValue>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: GetCollectionQueryOptionResponse
*/
@Parcelize
data class GetCollectionQueryOptionResponse(
    
    
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    
    @SerializedName("operators")
    var operators: HashMap<String,String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SeoDetail
*/
@Parcelize
data class SeoDetail(
    
    
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionQuery
*/
@Parcelize
data class CollectionQuery(
    
    
    
    @SerializedName("op")
    var op: String?=null,
    
    @SerializedName("attribute")
    var attribute: String?=null,
    
    @SerializedName("value")
    var value: @RawValue ArrayList<Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionBadge
*/
@Parcelize
data class CollectionBadge(
    
    
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("text")
    var text: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionImage
*/
@Parcelize
data class CollectionImage(
    
    
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionBanner
*/
@Parcelize
data class CollectionBanner(
    
    
    
    @SerializedName("portrait")
    var portrait: CollectionImage?=null,
    
    @SerializedName("landscape")
    var landscape: CollectionImage?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserInfo
*/
@Parcelize
data class UserInfo(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NextSchedule
*/
@Parcelize
data class NextSchedule(
    
    
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("start")
    var start: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionSchedule
*/
@Parcelize
data class CollectionSchedule(
    
    
    
    @SerializedName("next_schedule")
    var nextSchedule: ArrayList<NextSchedule>?=null,
    
    @SerializedName("duration")
    var duration: Int?=null,
    
    @SerializedName("start")
    var start: String?=null,
    
    @SerializedName("end")
    var end: String?=null,
    
    @SerializedName("cron")
    var cron: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CreateCollection
*/
@Parcelize
data class CreateCollection(
    
    
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("badge")
    var badge: CollectionBadge?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo?=null,
    
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("_schedule")
    var schedule: CollectionSchedule?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BannerImage
*/
@Parcelize
data class BannerImage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ImageUrls
*/
@Parcelize
data class ImageUrls(
    
    
    
    @SerializedName("portrait")
    var portrait: BannerImage?=null,
    
    @SerializedName("landscape")
    var landscape: BannerImage?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionCreateResponse
*/
@Parcelize
data class CollectionCreateResponse(
    
    
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("logo")
    var logo: BannerImage?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionListingFilterType
*/
@Parcelize
data class CollectionListingFilterType(
    
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionListingFilterTag
*/
@Parcelize
data class CollectionListingFilterTag(
    
    
    
    @SerializedName("is_selected")
    var isSelected: Boolean?=null,
    
    @SerializedName("display")
    var display: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionListingFilter
*/
@Parcelize
data class CollectionListingFilter(
    
    
    
    @SerializedName("type")
    var type: ArrayList<CollectionListingFilterType>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<CollectionListingFilterTag>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ActionPage
*/
@Parcelize
data class ActionPage(
    
    
    
    @SerializedName("params")
    var params: HashMap<String,ArrayList<String>>?=null,
    
    @SerializedName("query")
    var query: HashMap<String,ArrayList<String>>?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("type")
    var type: PageType?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Action
*/
@Parcelize
data class Action(
    
    
    
    @SerializedName("page")
    var page: ActionPage?=null,
    
    @SerializedName("popup")
    var popup: ActionPage?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Media1
*/
@Parcelize
data class Media1(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCollectionDetailNest
*/
@Parcelize
data class GetCollectionDetailNest(
    
    
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCollectionListingResponse
*/
@Parcelize
data class GetCollectionListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("filters")
    var filters: CollectionListingFilter?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetCollectionDetailNest>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionDetailResponse
*/
@Parcelize
data class CollectionDetailResponse(
    
    
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("badge")
    var badge: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("tag")
    var tag: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("cron")
    var cron: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("_schedule")
    var schedule: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdateCollection
*/
@Parcelize
data class UpdateCollection(
    
    
    
    @SerializedName("published")
    var published: Boolean?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("seo")
    var seo: SeoDetail?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("badge")
    var badge: CollectionBadge?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("is_visible")
    var isVisible: Boolean?=null,
    
    @SerializedName("banners")
    var banners: CollectionBanner?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("_locale_language")
    var localeLanguage: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: CollectionImage?=null,
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("sort_on")
    var sortOn: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("_schedule")
    var schedule: CollectionSchedule?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionItem
*/
@Parcelize
data class CollectionItem(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("action")
    var action: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CollectionItemUpdate
*/
@Parcelize
data class CollectionItemUpdate(
    
    
    
    @SerializedName("visible_facets_keys")
    var visibleFacetsKeys: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("allow_sort")
    var allowSort: Boolean?=null,
    
    @SerializedName("allow_facets")
    var allowFacets: Boolean?=null,
    
    @SerializedName("query")
    var query: ArrayList<CollectionQuery>?=null,
    
    @SerializedName("items")
    var items: ArrayList<CollectionItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UpdatedResponse
*/
@Parcelize
data class UpdatedResponse(
    
    
    
    @SerializedName("items_not_updated")
    var itemsNotUpdated: ArrayList<Int>?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetailAttribute
*/
@Parcelize
data class ProductDetailAttribute(
    
    
    
    @SerializedName("key")
    var key: String?=null,
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetailGroupedAttribute
*/
@Parcelize
data class ProductDetailGroupedAttribute(
    
    
    
    @SerializedName("details")
    var details: ArrayList<ProductDetailAttribute>?=null,
    
    @SerializedName("title")
    var title: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBrand
*/
@Parcelize
data class ProductBrand(
    
    
    
    @SerializedName("logo")
    var logo: Media1?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Price1
*/
@Parcelize
data class Price1(
    
    
    
    @SerializedName("currency_code")
    var currencyCode: String?=null,
    
    @SerializedName("currency_symbol")
    var currencySymbol: String?=null,
    
    @SerializedName("max")
    var max: Double?=null,
    
    @SerializedName("min")
    var min: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingPrice
*/
@Parcelize
data class ProductListingPrice(
    
    
    
    @SerializedName("marked")
    var marked: Price1?=null,
    
    @SerializedName("effective")
    var effective: Price1?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingDetail
*/
@Parcelize
data class ProductListingDetail(
    
    
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("sellable")
    var sellable: Boolean?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media1>?=null,
    
    @SerializedName("price")
    var price: ProductListingPrice?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCollectionItemsResponse
*/
@Parcelize
data class GetCollectionItemsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CatalogInsightItem
*/
@Parcelize
data class CatalogInsightItem(
    
    
    
    @SerializedName("out_of_stock_count")
    var outOfStockCount: Int?=null,
    
    @SerializedName("sellable_count")
    var sellableCount: Int?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CatalogInsightBrand
*/
@Parcelize
data class CatalogInsightBrand(
    
    
    
    @SerializedName("article_freshness")
    var articleFreshness: Int?=null,
    
    @SerializedName("total_articles")
    var totalArticles: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("available_sizes")
    var availableSizes: Int?=null,
    
    @SerializedName("available_articles")
    var availableArticles: Int?=null,
    
    @SerializedName("total_sizes")
    var totalSizes: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CatalogInsightResponse
*/
@Parcelize
data class CatalogInsightResponse(
    
    
    
    @SerializedName("item")
    var item: CatalogInsightItem?=null,
    
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CrossSellingData
*/
@Parcelize
data class CrossSellingData(
    
    
    
    @SerializedName("products")
    var products: Int?=null,
    
    @SerializedName("articles")
    var articles: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CrossSellingResponse
*/
@Parcelize
data class CrossSellingResponse(
    
    
    
    @SerializedName("brand_distribution")
    var brandDistribution: CatalogInsightBrand?=null,
    
    @SerializedName("data")
    var data: CrossSellingData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptInPostRequest
*/
@Parcelize
data class OptInPostRequest(
    
    
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("opt_level")
    var optLevel: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyOptIn
*/
@Parcelize
data class CompanyOptIn(
    
    
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("platform")
    var platform: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("opt_level")
    var optLevel: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetOptInPlatform
*/
@Parcelize
data class GetOptInPlatform(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<CompanyOptIn>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptinCompanyDetail
*/
@Parcelize
data class OptinCompanyDetail(
    
    
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyBrandDetail
*/
@Parcelize
data class CompanyBrandDetail(
    
    
    
    @SerializedName("total_article")
    var totalArticle: Int?=null,
    
    @SerializedName("brand_name")
    var brandName: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("brand_id")
    var brandId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptinCompanyBrandDetailsView
*/
@Parcelize
data class OptinCompanyBrandDetailsView(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<CompanyBrandDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: OptinCompanyMetrics
*/
@Parcelize
data class OptinCompanyMetrics(
    
    
    
    @SerializedName("company")
    var company: String?=null,
    
    @SerializedName("brand")
    var brand: Int?=null,
    
    @SerializedName("store")
    var store: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: StoreDetail
*/
@Parcelize
data class StoreDetail(
    
    
    
    @SerializedName("manager")
    var manager: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("documents")
    var documents: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("timing")
    var timing: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("address")
    var address: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("additional_contacts")
    var additionalContacts: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: OptinStoreDetails
*/
@Parcelize
data class OptinStoreDetails(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<StoreDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeMasterDetails
*/
@Parcelize
data class AttributeMasterDetails(
    
    
    
    @SerializedName("display_type")
    var displayType: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AttributeMasterMandatoryDetails
*/
@Parcelize
data class AttributeMasterMandatoryDetails(
    
    
    
    @SerializedName("l3_keys")
    var l3Keys: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: AttributeMasterMeta
*/
@Parcelize
data class AttributeMasterMeta(
    
    
    
    @SerializedName("mandatory_details")
    var mandatoryDetails: AttributeMasterMandatoryDetails?=null,
    
    @SerializedName("enriched")
    var enriched: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeSchemaRange
*/
@Parcelize
data class AttributeSchemaRange(
    
    
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeMaster
*/
@Parcelize
data class AttributeMaster(
    
    
    
    @SerializedName("allowed_values")
    var allowedValues: ArrayList<String>?=null,
    
    @SerializedName("range")
    var range: AttributeSchemaRange?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("mandatory")
    var mandatory: Boolean?=null,
    
    @SerializedName("multi")
    var multi: Boolean?=null,
    
    @SerializedName("format")
    var format: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeMasterFilter
*/
@Parcelize
data class AttributeMasterFilter(
    
    
    
    @SerializedName("depends_on")
    var dependsOn: ArrayList<String>?=null,
    
    @SerializedName("indexing")
    var indexing: Boolean?=null,
    
    @SerializedName("priority")
    var priority: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GenderDetail
*/
@Parcelize
data class GenderDetail(
    
    
    
    @SerializedName("is_nested")
    var isNested: Boolean?=null,
    
    @SerializedName("details")
    var details: AttributeMasterDetails?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("enabled_for_end_consumer")
    var enabledForEndConsumer: Boolean?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("meta")
    var meta: AttributeMasterMeta?=null,
    
    @SerializedName("schema")
    var schema: AttributeMaster?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("filters")
    var filters: AttributeMasterFilter?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoriesResponse
*/
@Parcelize
data class CategoriesResponse(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("slug_key")
    var slugKey: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("template_slug")
    var templateSlug: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProdcutTemplateCategoriesResponse
*/
@Parcelize
data class ProdcutTemplateCategoriesResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<CategoriesResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: PTErrorResponse
*/
@Parcelize
data class PTErrorResponse(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentCreateUpdate
*/
@Parcelize
data class DepartmentCreateUpdate(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("_cls")
    var cls: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("platforms")
    var platforms: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentCreateResponse
*/
@Parcelize
data class DepartmentCreateResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentCreateErrorResponse
*/
@Parcelize
data class DepartmentCreateErrorResponse(
    
    
    
    @SerializedName("error")
    var error: String?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: UserSerializer
*/
@Parcelize
data class UserSerializer(
    
    
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("username")
    var username: String?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetDepartment
*/
@Parcelize
data class GetDepartment(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("page_no")
    var pageNo: Int?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("page_size")
    var pageSize: Int?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("search")
    var search: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentsResponse
*/
@Parcelize
data class DepartmentsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetDepartment>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentErrorResponse
*/
@Parcelize
data class DepartmentErrorResponse(
    
    
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("status")
    var status: Int?=null,
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("errors")
    var errors: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDetail
*/
@Parcelize
data class UserDetail(
    
    
    
    @SerializedName("super_user")
    var superUser: Boolean?=null,
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentModel
*/
@Parcelize
data class DepartmentModel(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("synonyms")
    var synonyms: @RawValue ArrayList<Any>?=null,
    
    @SerializedName("slug")
    var slug: @RawValue Any?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserDetail?=null,
    
    @SerializedName("_id")
    var id: @RawValue Any?=null,
    
    @SerializedName("_cls")
    var cls: @RawValue Any?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("name")
    var name: @RawValue Any?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetail?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductTemplate
*/
@Parcelize
data class ProductTemplate(
    
    
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TemplatesResponse
*/
@Parcelize
data class TemplatesResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ProductTemplate?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TemplateDetails
*/
@Parcelize
data class TemplateDetails(
    
    
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("is_archived")
    var isArchived: Boolean?=null,
    
    @SerializedName("attributes")
    var attributes: ArrayList<String>?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("categories")
    var categories: ArrayList<String>?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Properties
*/
@Parcelize
data class Properties(
    
    
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_uid")
    var brandUid: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("command")
    var command: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_active")
    var isActive: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_code")
    var itemCode: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_dependent")
    var isDependent: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_config")
    var returnConfig: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trader_type")
    var traderType: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("slug")
    var slug: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("multi_size")
    var multiSize: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("trader")
    var trader: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("tags")
    var tags: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("category_slug")
    var categorySlug: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("short_description")
    var shortDescription: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("item_type")
    var itemType: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_publish")
    var productPublish: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("highlights")
    var highlights: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("media")
    var media: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GlobalValidation
*/
@Parcelize
data class GlobalValidation(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("title")
    var title: String?=null,
    
    @SerializedName("properties")
    var properties: Properties?=null,
    
    @SerializedName("definitions")
    var definitions: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("required")
    var required: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TemplateValidationData
*/
@Parcelize
data class TemplateValidationData(
    
    
    
    @SerializedName("global_validation")
    var globalValidation: GlobalValidation?=null,
    
    @SerializedName("template_validation")
    var templateValidation: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TemplatesValidationResponse
*/
@Parcelize
data class TemplatesValidationResponse(
    
    
    
    @SerializedName("template_details")
    var templateDetails: TemplateDetails?=null,
    
    @SerializedName("data")
    var data: TemplateValidationData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryValidationResponse
*/
@Parcelize
data class InventoryValidationResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HSNData
*/
@Parcelize
data class HSNData(
    
    
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: ArrayList<String>?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HSNCodesResponse
*/
@Parcelize
data class HSNCodesResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("data")
    var data: HSNData?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserInfo1
*/
@Parcelize
data class UserInfo1(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductTemplateExportResponse
*/
@Parcelize
data class ProductTemplateExportResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("completed_on")
    var completedOn: String?=null,
    
    @SerializedName("filters")
    var filters: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDownloadsResponse
*/
@Parcelize
data class ProductDownloadsResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<ProductTemplateExportResponse>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductTemplateExportFilterRequest
*/
@Parcelize
data class ProductTemplateExportFilterRequest(
    
    
    
    @SerializedName("to_date")
    var toDate: String?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<String>?=null,
    
    @SerializedName("templates")
    var templates: ArrayList<String>?=null,
    
    @SerializedName("catalogue_types")
    var catalogueTypes: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductTemplateDownloadsExport
*/
@Parcelize
data class ProductTemplateDownloadsExport(
    
    
    
    @SerializedName("filters")
    var filters: ProductTemplateExportFilterRequest?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductConfigurationDownloads
*/
@Parcelize
data class ProductConfigurationDownloads(
    
    
    
    @SerializedName("multivalue")
    var multivalue: Boolean?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryMappingValues
*/
@Parcelize
data class CategoryMappingValues(
    
    
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("catalog_id")
    var catalogId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryMapping
*/
@Parcelize
data class CategoryMapping(
    
    
    
    @SerializedName("facebook")
    var facebook: CategoryMappingValues?=null,
    
    @SerializedName("ajio")
    var ajio: CategoryMappingValues?=null,
    
    @SerializedName("google")
    var google: CategoryMappingValues?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Hierarchy
*/
@Parcelize
data class Hierarchy(
    
    
    
    @SerializedName("department")
    var department: Int?=null,
    
    @SerializedName("l2")
    var l2: Int?=null,
    
    @SerializedName("l1")
    var l1: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Media2
*/
@Parcelize
data class Media2(
    
    
    
    @SerializedName("portrait")
    var portrait: String?=null,
    
    @SerializedName("landscape")
    var landscape: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryRequestBody
*/
@Parcelize
data class CategoryRequestBody(
    
    
    
    @SerializedName("level")
    var level: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("media")
    var media: Media2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryCreateResponse
*/
@Parcelize
data class CategoryCreateResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Category
*/
@Parcelize
data class Category(
    
    
    
    @SerializedName("level")
    var level: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("synonyms")
    var synonyms: ArrayList<String>?=null,
    
    @SerializedName("marketplaces")
    var marketplaces: CategoryMapping?=null,
    
    @SerializedName("priority")
    var priority: Int?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("hierarchy")
    var hierarchy: ArrayList<Hierarchy>?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("media")
    var media: Media2?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryResponse
*/
@Parcelize
data class CategoryResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<Category>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryUpdateResponse
*/
@Parcelize
data class CategoryUpdateResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SingleCategoryResponse
*/
@Parcelize
data class SingleCategoryResponse(
    
    
    
    @SerializedName("data")
    var data: Category?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: NetQuantity
*/
@Parcelize
data class NetQuantity(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("unit")
    var unit: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TeaserTag
*/
@Parcelize
data class TeaserTag(
    
    
    
    @SerializedName("tag")
    var tag: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TaxIdentifier
*/
@Parcelize
data class TaxIdentifier(
    
    
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("reporting_hsn")
    var reportingHsn: String?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ReturnConfig
*/
@Parcelize
data class ReturnConfig(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CustomOrder
*/
@Parcelize
data class CustomOrder(
    
    
    
    @SerializedName("manufacturing_time")
    var manufacturingTime: Int?=null,
    
    @SerializedName("manufacturing_time_unit")
    var manufacturingTimeUnit: String?=null,
    
    @SerializedName("is_custom_order")
    var isCustomOrder: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Trader
*/
@Parcelize
data class Trader(
    
    
    
    @SerializedName("address")
    var address: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPublish
*/
@Parcelize
data class ProductPublish(
    
    
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductCreateUpdateSchemaV2
*/
@Parcelize
data class ProductCreateUpdateSchemaV2(
    
    
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantity?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("requester")
    var requester: String?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("variant_group")
    var variantGroup: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: TeaserTag?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: TaxIdentifier?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("action")
    var action: String?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig?=null,
    
    @SerializedName("change_request_id")
    var changeRequestId: @RawValue Any?=null,
    
    @SerializedName("custom_order")
    var customOrder: CustomOrder?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublish?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("variant_media")
    var variantMedia: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    
    @SerializedName("bulk_job_id")
    var bulkJobId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: NetQuantityResponse
*/
@Parcelize
data class NetQuantityResponse(
    
    
    
    @SerializedName("value")
    var value: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ReturnConfigResponse
*/
@Parcelize
data class ReturnConfigResponse(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Logo
*/
@Parcelize
data class Logo(
    
    
    
    @SerializedName("aspect_ratio_f")
    var aspectRatioF: Int?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Brand
*/
@Parcelize
data class Brand(
    
    
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("logo")
    var logo: Logo?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Image
*/
@Parcelize
data class Image(
    
    
    
    @SerializedName("aspect_ratio_f")
    var aspectRatioF: Double?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("aspect_ratio")
    var aspectRatio: String?=null,
    
    @SerializedName("secure_url")
    var secureUrl: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: VerifiedBy
*/
@Parcelize
data class VerifiedBy(
    
    
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductPublish1
*/
@Parcelize
data class ProductPublish1(
    
    
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSchemaV2
*/
@Parcelize
data class ProductSchemaV2(
    
    
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("category_uid")
    var categoryUid: Int?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantityResponse?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("l3_mapping")
    var l3Mapping: ArrayList<String>?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("variant_group")
    var variantGroup: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfigResponse?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("pending")
    var pending: String?=null,
    
    @SerializedName("moq")
    var moq: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("all_identifiers")
    var allIdentifiers: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    
    @SerializedName("images")
    var images: ArrayList<Image>?=null,
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("all_company_ids")
    var allCompanyIds: ArrayList<Int>?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: VerifiedBy?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublish1?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("all_sizes")
    var allSizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("variant_media")
    var variantMedia: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingResponseV2
*/
@Parcelize
data class ProductListingResponseV2(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductSchemaV2>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductVariants
*/
@Parcelize
data class ProductVariants(
    
    
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("category_uid")
    var categoryUid: Int?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductVariantsResponse
*/
@Parcelize
data class ProductVariantsResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("variants")
    var variants: ArrayList<ProductVariants>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AttributeMasterSerializer
*/
@Parcelize
data class AttributeMasterSerializer(
    
    
    
    @SerializedName("enabled_for_end_consumer")
    var enabledForEndConsumer: Boolean?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("filters")
    var filters: AttributeMasterFilter?=null,
    
    @SerializedName("suggestion")
    var suggestion: String?=null,
    
    @SerializedName("raw_key")
    var rawKey: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("schema")
    var schema: AttributeMaster?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("logo")
    var logo: String?=null,
    
    @SerializedName("is_nested")
    var isNested: Boolean?=null,
    
    @SerializedName("details")
    var details: AttributeMasterDetails?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("synonyms")
    var synonyms: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("variant")
    var variant: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductAttributesResponse
*/
@Parcelize
data class ProductAttributesResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<AttributeMasterSerializer>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: SingleProductResponse
*/
@Parcelize
data class SingleProductResponse(
    
    
    
    @SerializedName("data")
    var data: ProductSchemaV2?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateIdentifier
*/
@Parcelize
data class ValidateIdentifier(
    
    
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("gtin_type")
    var gtinType: String?=null,
    
    @SerializedName("gtin_value")
    var gtinValue: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AllSizes
*/
@Parcelize
data class AllSizes(
    
    
    
    @SerializedName("item_length")
    var itemLength: Double?=null,
    
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: ArrayList<ValidateIdentifier>?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: @RawValue Any?=null,
    
    @SerializedName("size")
    var size: @RawValue Any?=null,
    
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    
    @SerializedName("item_weight")
    var itemWeight: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAllSizes
*/
@Parcelize
data class GetAllSizes(
    
    
    
    @SerializedName("all_sizes")
    var allSizes: ArrayList<AllSizes>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidateProduct
*/
@Parcelize
data class ValidateProduct(
    
    
    
    @SerializedName("valid")
    var valid: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductPublished
*/
@Parcelize
data class ProductPublished(
    
    
    
    @SerializedName("product_online_date")
    var productOnlineDate: Int?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Product
*/
@Parcelize
data class Product(
    
    
    
    @SerializedName("no_of_boxes")
    var noOfBoxes: Int?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("category_uid")
    var categoryUid: Int?=null,
    
    @SerializedName("net_quantity")
    var netQuantity: NetQuantityResponse?=null,
    
    @SerializedName("variants")
    var variants: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("l3_mapping")
    var l3Mapping: ArrayList<String>?=null,
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("sizes")
    var sizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("primary_color")
    var primaryColor: String?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("variant_group")
    var variantGroup: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("size_guide")
    var sizeGuide: String?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("is_dependent")
    var isDependent: Boolean?=null,
    
    @SerializedName("is_expirable")
    var isExpirable: Boolean?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfigResponse?=null,
    
    @SerializedName("brand")
    var brand: Brand?=null,
    
    @SerializedName("custom_order")
    var customOrder: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("pending")
    var pending: String?=null,
    
    @SerializedName("moq")
    var moq: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("all_identifiers")
    var allIdentifiers: ArrayList<String>?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<Int>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("is_image_less_product")
    var isImageLessProduct: Boolean?=null,
    
    @SerializedName("images")
    var images: ArrayList<Image>?=null,
    
    @SerializedName("category")
    var category: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("multi_size")
    var multiSize: Boolean?=null,
    
    @SerializedName("all_company_ids")
    var allCompanyIds: ArrayList<Int>?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader>?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("is_physical")
    var isPhysical: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("category_slug")
    var categorySlug: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: VerifiedBy?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("product_publish")
    var productPublish: ProductPublished?=null,
    
    @SerializedName("product_group_tag")
    var productGroupTag: ArrayList<String>?=null,
    
    @SerializedName("all_sizes")
    var allSizes: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("variant_media")
    var variantMedia: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null,
    
    @SerializedName("media")
    var media: ArrayList<Media1>?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductListingResponse
*/
@Parcelize
data class ProductListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<Product>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkJob
*/
@Parcelize
data class BulkJob(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed_records")
    var failedRecords: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("custom_template_tag")
    var customTemplateTag: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo1?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkResponse
*/
@Parcelize
data class BulkResponse(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserInfo1?=null,
    
    @SerializedName("created_by")
    var createdBy: UserInfo1?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserDetail1
*/
@Parcelize
data class UserDetail1(
    
    
    
    @SerializedName("full_name")
    var fullName: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBulkRequest
*/
@Parcelize
data class ProductBulkRequest(
    
    
    
    @SerializedName("template")
    var template: ProductTemplate?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserDetail1?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail1?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductBulkRequestList
*/
@Parcelize
data class ProductBulkRequestList(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ProductBulkRequest?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkProductRequest
*/
@Parcelize
data class BulkProductRequest(
    
    
    
    @SerializedName("batch_id")
    var batchId: String?=null,
    
    @SerializedName("template_tag")
    var templateTag: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("data")
    var data: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductTagsViewResponse
*/
@Parcelize
data class ProductTagsViewResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ProductBulkAssets
*/
@Parcelize
data class ProductBulkAssets(
    
    
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserCommon
*/
@Parcelize
data class UserCommon(
    
    
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Items
*/
@Parcelize
data class Items(
    
    
    
    @SerializedName("retry")
    var retry: Int?=null,
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("tracking_url")
    var trackingUrl: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserCommon?=null,
    
    @SerializedName("created_by")
    var createdBy: UserCommon?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkAssetResponse
*/
@Parcelize
data class BulkAssetResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<Items>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSizeDeleteDataResponse
*/
@Parcelize
data class ProductSizeDeleteDataResponse(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductSizeDeleteResponse
*/
@Parcelize
data class ProductSizeDeleteResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null,
    
    @SerializedName("data")
    var data: ProductSizeDeleteDataResponse?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ItemQuery
*/
@Parcelize
data class ItemQuery(
    
    
    
    @SerializedName("brand_uid")
    var brandUid: Int?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SetSize
*/
@Parcelize
data class SetSize(
    
    
    
    @SerializedName("pieces")
    var pieces: Int?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: SizeDistribution
*/
@Parcelize
data class SizeDistribution(
    
    
    
    @SerializedName("sizes")
    var sizes: ArrayList<SetSize>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: InventorySet
*/
@Parcelize
data class InventorySet(
    
    
    
    @SerializedName("size_distribution")
    var sizeDistribution: SizeDistribution?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GTIN
*/
@Parcelize
data class GTIN(
    
    
    
    @SerializedName("primary")
    var primary: Boolean?=null,
    
    @SerializedName("gtin_type")
    var gtinType: String?=null,
    
    @SerializedName("gtin_value")
    var gtinValue: @RawValue Any?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvSize
*/
@Parcelize
data class InvSize(
    
    
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("item_width")
    var itemWidth: Double?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_length")
    var itemLength: Double?=null,
    
    @SerializedName("item_height")
    var itemHeight: Double?=null,
    
    @SerializedName("set")
    var set: InventorySet?=null,
    
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: ArrayList<GTIN>?=null,
    
    @SerializedName("size")
    var size: @RawValue Any?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("item_weight")
    var itemWeight: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryRequest
*/
@Parcelize
data class InventoryRequest(
    
    
    
    @SerializedName("item")
    var item: ItemQuery?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<InvSize>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryResponse
*/
@Parcelize
data class InventoryResponse(
    
    
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("inventory_updated_on")
    var inventoryUpdatedOn: String?=null,
    
    @SerializedName("store")
    var store: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("identifiers")
    var identifiers: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("price_transfer")
    var priceTransfer: Double?=null,
    
    @SerializedName("sellable_quantity")
    var sellableQuantity: Int?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryResponsePaginated
*/
@Parcelize
data class InventoryResponsePaginated(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<InventoryResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreMeta
*/
@Parcelize
data class StoreMeta(
    
    
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: CompanyMeta
*/
@Parcelize
data class CompanyMeta(
    
    
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ReturnConfig1
*/
@Parcelize
data class ReturnConfig1(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrandMeta
*/
@Parcelize
data class BrandMeta(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: QuantityBase
*/
@Parcelize
data class QuantityBase(
    
    
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Quantities
*/
@Parcelize
data class Quantities(
    
    
    
    @SerializedName("sellable")
    var sellable: QuantityBase?=null,
    
    @SerializedName("order_committed")
    var orderCommitted: QuantityBase?=null,
    
    @SerializedName("damaged")
    var damaged: QuantityBase?=null,
    
    @SerializedName("not_available")
    var notAvailable: QuantityBase?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WeightResponse
*/
@Parcelize
data class WeightResponse(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("shipping")
    var shipping: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Trader1
*/
@Parcelize
data class Trader1(
    
    
    
    @SerializedName("address")
    var address: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManufacturerResponse
*/
@Parcelize
data class ManufacturerResponse(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DimensionResponse
*/
@Parcelize
data class DimensionResponse(
    
    
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("length")
    var length: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PriceMeta
*/
@Parcelize
data class PriceMeta(
    
    
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("updated_at")
    var updatedAt: String?=null,
    
    @SerializedName("transfer")
    var transfer: Double?=null,
    
    @SerializedName("tp_notes")
    var tpNotes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventorySellerResponse
*/
@Parcelize
data class InventorySellerResponse(
    
    
    
    @SerializedName("store")
    var store: StoreMeta?=null,
    
    @SerializedName("fynd_article_code")
    var fyndArticleCode: String?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("fragile")
    var fragile: Boolean?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("company")
    var company: CompanyMeta?=null,
    
    @SerializedName("fynd_meta")
    var fyndMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig1?=null,
    
    @SerializedName("brand")
    var brand: BrandMeta?=null,
    
    @SerializedName("quantities")
    var quantities: Quantities?=null,
    
    @SerializedName("set")
    var set: InventorySet?=null,
    
    @SerializedName("weight")
    var weight: WeightResponse?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader1>?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("fynd_item_code")
    var fyndItemCode: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("manufacturer")
    var manufacturer: ManufacturerResponse?=null,
    
    @SerializedName("dimension")
    var dimension: DimensionResponse?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("added_on_store")
    var addedOnStore: String?=null,
    
    @SerializedName("raw_meta")
    var rawMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("price")
    var price: PriceMeta?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventorySellerIdentifierResponsePaginated
*/
@Parcelize
data class InventorySellerIdentifierResponsePaginated(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<InventorySellerResponse>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleStoreResponse
*/
@Parcelize
data class ArticleStoreResponse(
    
    
    
    @SerializedName("store_code")
    var storeCode: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CompanyMeta1
*/
@Parcelize
data class CompanyMeta1(
    
    
    
    @SerializedName("id")
    var id: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ReturnConfig2
*/
@Parcelize
data class ReturnConfig2(
    
    
    
    @SerializedName("returnable")
    var returnable: Boolean?=null,
    
    @SerializedName("time")
    var time: Int?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrandMeta1
*/
@Parcelize
data class BrandMeta1(
    
    
    
    @SerializedName("id")
    var id: Int?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Quantity
*/
@Parcelize
data class Quantity(
    
    
    
    @SerializedName("count")
    var count: Int?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: QuantitiesArticle
*/
@Parcelize
data class QuantitiesArticle(
    
    
    
    @SerializedName("sellable")
    var sellable: Quantity?=null,
    
    @SerializedName("order_committed")
    var orderCommitted: Quantity?=null,
    
    @SerializedName("damaged")
    var damaged: Quantity?=null,
    
    @SerializedName("not_available")
    var notAvailable: Quantity?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: WeightResponse1
*/
@Parcelize
data class WeightResponse1(
    
    
    
    @SerializedName("shipping")
    var shipping: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Trader2
*/
@Parcelize
data class Trader2(
    
    
    
    @SerializedName("address")
    var address: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ManufacturerResponse1
*/
@Parcelize
data class ManufacturerResponse1(
    
    
    
    @SerializedName("is_default")
    var isDefault: Boolean?=null,
    
    @SerializedName("address")
    var address: String?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DimensionResponse1
*/
@Parcelize
data class DimensionResponse1(
    
    
    
    @SerializedName("height")
    var height: Double?=null,
    
    @SerializedName("width")
    var width: Double?=null,
    
    @SerializedName("length")
    var length: Double?=null,
    
    @SerializedName("unit")
    var unit: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DateMeta
*/
@Parcelize
data class DateMeta(
    
    
    
    @SerializedName("inventory_updated_on")
    var inventoryUpdatedOn: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("added_on_store")
    var addedOnStore: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: PriceArticle
*/
@Parcelize
data class PriceArticle(
    
    
    
    @SerializedName("marked")
    var marked: Double?=null,
    
    @SerializedName("transfer")
    var transfer: Double?=null,
    
    @SerializedName("tp_notes")
    var tpNotes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("effective")
    var effective: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetInventories
*/
@Parcelize
data class GetInventories(
    
    
    
    @SerializedName("store")
    var store: ArticleStoreResponse?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("country_of_origin")
    var countryOfOrigin: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("tax_identifier")
    var taxIdentifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("inventory_updated_on")
    var inventoryUpdatedOn: String?=null,
    
    @SerializedName("company")
    var company: CompanyMeta1?=null,
    
    @SerializedName("return_config")
    var returnConfig: ReturnConfig2?=null,
    
    @SerializedName("brand")
    var brand: BrandMeta1?=null,
    
    @SerializedName("quantities")
    var quantities: QuantitiesArticle?=null,
    
    @SerializedName("weight")
    var weight: WeightResponse1?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("trader")
    var trader: ArrayList<Trader2>?=null,
    
    @SerializedName("identifier")
    var identifier: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer?=null,
    
    @SerializedName("manufacturer")
    var manufacturer: ManufacturerResponse1?=null,
    
    @SerializedName("is_set")
    var isSet: Boolean?=null,
    
    @SerializedName("dimension")
    var dimension: DimensionResponse1?=null,
    
    @SerializedName("date_meta")
    var dateMeta: DateMeta?=null,
    
    @SerializedName("platforms")
    var platforms: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("track_inventory")
    var trackInventory: Boolean?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("price")
    var price: PriceArticle?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetInventoriesResponse
*/
@Parcelize
data class GetInventoriesResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetInventories>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BulkInventoryGetItems
*/
@Parcelize
data class BulkInventoryGetItems(
    
    
    
    @SerializedName("cancelled_records")
    var cancelledRecords: ArrayList<String>?=null,
    
    @SerializedName("failed")
    var failed: Int?=null,
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("total")
    var total: Int?=null,
    
    @SerializedName("failed_records")
    var failedRecords: ArrayList<String>?=null,
    
    @SerializedName("succeed")
    var succeed: Int?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("file_path")
    var filePath: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("cancelled")
    var cancelled: Int?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BulkInventoryGet
*/
@Parcelize
data class BulkInventoryGet(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<BulkInventoryGetItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryJobPayload
*/
@Parcelize
data class InventoryJobPayload(
    
    
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("item_dimensions_unit_of_measure")
    var itemDimensionsUnitOfMeasure: String?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("item_weight_unit_of_measure")
    var itemWeightUnitOfMeasure: String?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null,
    
    @SerializedName("price")
    var price: Double?=null,
    
    @SerializedName("currency")
    var currency: String?=null,
    
    @SerializedName("store_code")
    var storeCode: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryBulkRequest
*/
@Parcelize
data class InventoryBulkRequest(
    
    
    
    @SerializedName("user")
    var user: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("sizes")
    var sizes: ArrayList<InventoryJobPayload>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("batch_id")
    var batchId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportRequest
*/
@Parcelize
data class InventoryExportRequest(
    
    
    
    @SerializedName("brand")
    var brand: ArrayList<Int>?=null,
    
    @SerializedName("store")
    var store: ArrayList<Int>?=null,
    
    @SerializedName("type")
    var type: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportResponse
*/
@Parcelize
data class InventoryExportResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("filters")
    var filters: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("created_by")
    var createdBy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportQuantityFilter
*/
@Parcelize
data class InventoryExportQuantityFilter(
    
    
    
    @SerializedName("operators")
    var operators: String?=null,
    
    @SerializedName("max")
    var max: Int?=null,
    
    @SerializedName("min")
    var min: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportAdvanceOption
*/
@Parcelize
data class InventoryExportAdvanceOption(
    
    
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    
    @SerializedName("to_date")
    var toDate: String?=null,
    
    @SerializedName("quantity")
    var quantity: InventoryExportQuantityFilter?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportJob
*/
@Parcelize
data class InventoryExportJob(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null,
    
    @SerializedName("status")
    var status: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("completed_on")
    var completedOn: String?=null,
    
    @SerializedName("filters")
    var filters: InventoryExportAdvanceOption?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportFilter
*/
@Parcelize
data class InventoryExportFilter(
    
    
    
    @SerializedName("brand_ids")
    var brandIds: ArrayList<Int>?=null,
    
    @SerializedName("to_date")
    var toDate: String?=null,
    
    @SerializedName("quantity")
    var quantity: InventoryExportQuantityFilter?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryCreateRequest
*/
@Parcelize
data class InventoryCreateRequest(
    
    
    
    @SerializedName("filters")
    var filters: InventoryExportFilter?=null,
    
    @SerializedName("data")
    var data: ArrayList<String>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryJobFilters
*/
@Parcelize
data class InventoryJobFilters(
    
    
    
    @SerializedName("to_date")
    var toDate: String?=null,
    
    @SerializedName("quantity")
    var quantity: InventoryExportQuantityFilter?=null,
    
    @SerializedName("from_date")
    var fromDate: String?=null,
    
    @SerializedName("stores")
    var stores: ArrayList<String>?=null,
    
    @SerializedName("brands")
    var brands: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryJobDetailResponse
*/
@Parcelize
data class InventoryJobDetailResponse(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("task_id")
    var taskId: String?=null,
    
    @SerializedName("status")
    var status: @RawValue Any?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("cancelled_on")
    var cancelledOn: String?=null,
    
    @SerializedName("cancelled_by")
    var cancelledBy: UserDetail?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("seller_id")
    var sellerId: Int?=null,
    
    @SerializedName("url")
    var url: String?=null,
    
    @SerializedName("completed_on")
    var completedOn: String?=null,
    
    @SerializedName("filters")
    var filters: InventoryJobFilters?=null,
    
    @SerializedName("created_by")
    var createdBy: UserDetail?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryExportJobListResponse
*/
@Parcelize
data class InventoryExportJobListResponse(
    
    
    
    @SerializedName("items")
    var items: InventoryJobDetailResponse?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: FilerList
*/
@Parcelize
data class FilerList(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("display")
    var display: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryConfig
*/
@Parcelize
data class InventoryConfig(
    
    
    
    @SerializedName("multivalues")
    var multivalues: Boolean?=null,
    
    @SerializedName("data")
    var data: ArrayList<FilerList>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryPayload
*/
@Parcelize
data class InventoryPayload(
    
    
    
    @SerializedName("price_effective")
    var priceEffective: Double?=null,
    
    @SerializedName("total_quantity")
    var totalQuantity: Int?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("seller_identifier")
    var sellerIdentifier: String?=null,
    
    @SerializedName("expiration_date")
    var expirationDate: String?=null,
    
    @SerializedName("trace_id")
    var traceId: String?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Double?=null,
    
    @SerializedName("tags")
    var tags: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryRequestSchemaV2
*/
@Parcelize
data class InventoryRequestSchemaV2(
    
    
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("payload")
    var payload: ArrayList<InventoryPayload>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryFailedReason
*/
@Parcelize
data class InventoryFailedReason(
    
    
    
    @SerializedName("errors")
    var errors: String?=null,
    
    @SerializedName("message")
    var message: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryResponseItem
*/
@Parcelize
data class InventoryResponseItem(
    
    
    
    @SerializedName("reason")
    var reason: InventoryFailedReason?=null,
    
    @SerializedName("data")
    var data: InventoryPayload?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryUpdateResponse
*/
@Parcelize
data class InventoryUpdateResponse(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<InventoryResponseItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: HsnUpsert
*/
@Parcelize
data class HsnUpsert(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("tax2")
    var tax2: Double?=null,
    
    @SerializedName("tax_on_mrp")
    var taxOnMrp: Boolean?=null,
    
    @SerializedName("hs2_code")
    var hs2Code: String?=null,
    
    @SerializedName("threshold2")
    var threshold2: Double?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("threshold1")
    var threshold1: Double?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("tax1")
    var tax1: Double?=null,
    
    @SerializedName("tax_on_esp")
    var taxOnEsp: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HsnCodesObject
*/
@Parcelize
data class HsnCodesObject(
    
    
    
    @SerializedName("tax2")
    var tax2: Double?=null,
    
    @SerializedName("tax_on_mrp")
    var taxOnMrp: Boolean?=null,
    
    @SerializedName("hs2_code")
    var hs2Code: String?=null,
    
    @SerializedName("threshold2")
    var threshold2: Double?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("threshold1")
    var threshold1: Double?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("tax1")
    var tax1: Double?=null,
    
    @SerializedName("tax_on_esp")
    var taxOnEsp: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HsnCode
*/
@Parcelize
data class HsnCode(
    
    
    
    @SerializedName("data")
    var data: HsnCodesObject?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkHsnUpsert
*/
@Parcelize
data class BulkHsnUpsert(
    
    
    
    @SerializedName("data")
    var data: ArrayList<HsnUpsert>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: BulkHsnResponse
*/
@Parcelize
data class BulkHsnResponse(
    
    
    
    @SerializedName("success")
    var success: Boolean?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: PageResponse
*/
@Parcelize
data class PageResponse(
    
    
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("current")
    var current: String?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null,
    
    @SerializedName("size")
    var size: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaxSlab
*/
@Parcelize
data class TaxSlab(
    
    
    
    @SerializedName("effective_date")
    var effectiveDate: String?=null,
    
    @SerializedName("rate")
    var rate: Double?=null,
    
    @SerializedName("cess")
    var cess: Double?=null,
    
    @SerializedName("threshold")
    var threshold: Double?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HSNDataInsertV2
*/
@Parcelize
data class HSNDataInsertV2(
    
    
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("taxes")
    var taxes: ArrayList<TaxSlab>?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("hsn_code")
    var hsnCode: String?=null,
    
    @SerializedName("reporting_hsn")
    var reportingHsn: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("created_by")
    var createdBy: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("hsn_code_id")
    var hsnCodeId: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: HsnCodesListingResponseSchemaV2
*/
@Parcelize
data class HsnCodesListingResponseSchemaV2(
    
    
    
    @SerializedName("page")
    var page: PageResponse?=null,
    
    @SerializedName("items")
    var items: ArrayList<HSNDataInsertV2>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: BrandItem
*/
@Parcelize
data class BrandItem(
    
    
    
    @SerializedName("discount")
    var discount: String?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("departments")
    var departments: ArrayList<String>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: BrandListingResponse
*/
@Parcelize
data class BrandListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<BrandItem>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Department
*/
@Parcelize
data class Department(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("priority_order")
    var priorityOrder: Int?=null,
    
    @SerializedName("logo")
    var logo: Media?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentResponse
*/
@Parcelize
data class DepartmentResponse(
    
    
    
    @SerializedName("items")
    var items: ArrayList<Department>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: DepartmentIdentifier
*/
@Parcelize
data class DepartmentIdentifier(
    
    
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ThirdLevelChild
*/
@Parcelize
data class ThirdLevelChild(
    
    
    
    @SerializedName("childs")
    var childs: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SecondLevelChild
*/
@Parcelize
data class SecondLevelChild(
    
    
    
    @SerializedName("childs")
    var childs: ArrayList<ThirdLevelChild>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: Child
*/
@Parcelize
data class Child(
    
    
    
    @SerializedName("childs")
    var childs: ArrayList<SecondLevelChild>?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryItems
*/
@Parcelize
data class CategoryItems(
    
    
    
    @SerializedName("childs")
    var childs: ArrayList<Child>?=null,
    
    @SerializedName("action")
    var action: Action?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("banners")
    var banners: ImageUrls?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: DepartmentCategoryTree
*/
@Parcelize
data class DepartmentCategoryTree(
    
    
    
    @SerializedName("department")
    var department: String?=null,
    
    @SerializedName("items")
    var items: ArrayList<CategoryItems>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: CategoryListingResponse
*/
@Parcelize
data class CategoryListingResponse(
    
    
    
    @SerializedName("departments")
    var departments: ArrayList<DepartmentIdentifier>?=null,
    
    @SerializedName("data")
    var data: ArrayList<DepartmentCategoryTree>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationProductListingResponse
*/
@Parcelize
data class ApplicationProductListingResponse(
    
    
    
    @SerializedName("sort_on")
    var sortOn: ArrayList<ProductSortOn>?=null,
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("operators")
    var operators: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("filters")
    var filters: ArrayList<ProductFilters>?=null,
    
    @SerializedName("items")
    var items: ArrayList<ProductListingDetail>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ProductDetail
*/
@Parcelize
data class ProductDetail(
    
    
    
    @SerializedName("image_nature")
    var imageNature: String?=null,
    
    @SerializedName("tryouts")
    var tryouts: ArrayList<String>?=null,
    
    @SerializedName("teaser_tag")
    var teaserTag: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("grouped_attributes")
    var groupedAttributes: ArrayList<ProductDetailGroupedAttribute>?=null,
    
    @SerializedName("item_code")
    var itemCode: String?=null,
    
    @SerializedName("similars")
    var similars: ArrayList<String>?=null,
    
    @SerializedName("has_variant")
    var hasVariant: Boolean?=null,
    
    @SerializedName("brand")
    var brand: ProductBrand?=null,
    
    @SerializedName("rating")
    var rating: Double?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("rating_count")
    var ratingCount: Int?=null,
    
    @SerializedName("description")
    var description: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("attributes")
    var attributes: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("product_online_date")
    var productOnlineDate: String?=null,
    
    @SerializedName("promo_meta")
    var promoMeta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("color")
    var color: String?=null,
    
    @SerializedName("item_type")
    var itemType: String?=null,
    
    @SerializedName("short_description")
    var shortDescription: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("medias")
    var medias: ArrayList<Media1>?=null,
    
    @SerializedName("highlights")
    var highlights: ArrayList<String>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryPage
*/
@Parcelize
data class InventoryPage(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("item_total")
    var itemTotal: Int?=null,
    
    @SerializedName("next_id")
    var nextId: String?=null,
    
    @SerializedName("has_previous")
    var hasPrevious: Boolean?=null,
    
    @SerializedName("has_next")
    var hasNext: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InventoryStockResponse
*/
@Parcelize
data class InventoryStockResponse(
    
    
    
    @SerializedName("page")
    var page: InventoryPage?=null,
    
    @SerializedName("items")
    var items: @RawValue ArrayList<HashMap<String,Any>>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleQuery
*/
@Parcelize
data class ArticleQuery(
    
    
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("ignored_stores")
    var ignoredStores: ArrayList<Int>?=null,
    
    @SerializedName("size")
    var size: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAssignment
*/
@Parcelize
data class ArticleAssignment(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: AssignStoreArticle
*/
@Parcelize
data class AssignStoreArticle(
    
    
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("query")
    var query: ArticleQuery?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: AssignStore
*/
@Parcelize
data class AssignStore(
    
    
    
    @SerializedName("channel_identifier")
    var channelIdentifier: String?=null,
    
    @SerializedName("store_ids")
    var storeIds: ArrayList<Int>?=null,
    
    @SerializedName("channel_type")
    var channelType: String?=null,
    
    @SerializedName("pincode")
    var pincode: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("articles")
    var articles: ArrayList<AssignStoreArticle>?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ArticleAssignment1
*/
@Parcelize
data class ArticleAssignment1(
    
    
    
    @SerializedName("level")
    var level: String?=null,
    
    @SerializedName("strategy")
    var strategy: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: StoreAssignResponse
*/
@Parcelize
data class StoreAssignResponse(
    
    
    
    @SerializedName("index")
    var index: Int?=null,
    
    @SerializedName("price_effective")
    var priceEffective: Int?=null,
    
    @SerializedName("quantity")
    var quantity: Int?=null,
    
    @SerializedName("store_pincode")
    var storePincode: Int?=null,
    
    @SerializedName("status")
    var status: Boolean?=null,
    
    @SerializedName("item_id")
    var itemId: Int?=null,
    
    @SerializedName("store_id")
    var storeId: Int?=null,
    
    @SerializedName("group_id")
    var groupId: String?=null,
    
    @SerializedName("meta")
    var meta: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("_id")
    var id: String?=null,
    
    @SerializedName("company_id")
    var companyId: Int?=null,
    
    @SerializedName("price_marked")
    var priceMarked: Int?=null,
    
    @SerializedName("strategy_wise_listing")
    var strategyWiseListing: @RawValue ArrayList<HashMap<String,Any>>?=null,
    
    @SerializedName("uid")
    var uid: String?=null,
    
    @SerializedName("size")
    var size: String?=null,
    
    @SerializedName("s_city")
    var sCity: String?=null,
    
    @SerializedName("article_assignment")
    var articleAssignment: ArticleAssignment1?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: SellerPhoneNumber
*/
@Parcelize
data class SellerPhoneNumber(
    
    
    
    @SerializedName("country_code")
    var countryCode: Int?=null,
    
    @SerializedName("number")
    var number: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ProductReturnConfigSerializer
*/
@Parcelize
data class ProductReturnConfigSerializer(
    
    
    
    @SerializedName("store_uid")
    var storeUid: Int?=null,
    
    @SerializedName("on_same_store")
    var onSameStore: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: UserSerializer1
*/
@Parcelize
data class UserSerializer1(
    
    
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetAddressSerializer
*/
@Parcelize
data class GetAddressSerializer(
    
    
    
    @SerializedName("state")
    var state: String?=null,
    
    @SerializedName("latitude")
    var latitude: Double?=null,
    
    @SerializedName("country_code")
    var countryCode: String?=null,
    
    @SerializedName("country")
    var country: String?=null,
    
    @SerializedName("landmark")
    var landmark: String?=null,
    
    @SerializedName("longitude")
    var longitude: Double?=null,
    
    @SerializedName("address2")
    var address2: String?=null,
    
    @SerializedName("pincode")
    var pincode: Int?=null,
    
    @SerializedName("address1")
    var address1: String?=null,
    
    @SerializedName("address_type")
    var addressType: String?=null,
    
    @SerializedName("city")
    var city: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetCompanySerializer
*/
@Parcelize
data class GetCompanySerializer(
    
    
    
    @SerializedName("reject_reason")
    var rejectReason: String?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer1?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("business_type")
    var businessType: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("company_type")
    var companyType: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer1?=null,
    
    @SerializedName("addresses")
    var addresses: ArrayList<GetAddressSerializer>?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer1?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceCredSerializer
*/
@Parcelize
data class InvoiceCredSerializer(
    
    
    
    @SerializedName("enabled")
    var enabled: Boolean?=null,
    
    @SerializedName("password")
    var password: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: InvoiceDetailsSerializer
*/
@Parcelize
data class InvoiceDetailsSerializer(
    
    
    
    @SerializedName("e_waybill")
    var eWaybill: InvoiceCredSerializer?=null,
    
    @SerializedName("e_invoice")
    var eInvoice: InvoiceCredSerializer?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocationManagerSerializer
*/
@Parcelize
data class LocationManagerSerializer(
    
    
    
    @SerializedName("email")
    var email: String?=null,
    
    @SerializedName("mobile_no")
    var mobileNo: SellerPhoneNumber?=null,
    
    @SerializedName("name")
    var name: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: UserSerializer2
*/
@Parcelize
data class UserSerializer2(
    
    
    
    @SerializedName("contact")
    var contact: String?=null,
    
    @SerializedName("user_id")
    var userId: String?=null,
    
    @SerializedName("username")
    var username: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationIntegrationType
*/
@Parcelize
data class LocationIntegrationType(
    
    
    
    @SerializedName("inventory")
    var inventory: String?=null,
    
    @SerializedName("order")
    var order: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: Document
*/
@Parcelize
data class Document(
    
    
    
    @SerializedName("value")
    var value: String?=null,
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("legal_name")
    var legalName: String?=null,
    
    @SerializedName("verified")
    var verified: Boolean?=null,
    
    @SerializedName("url")
    var url: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationTimingSerializer
*/
@Parcelize
data class LocationTimingSerializer(
    
    
    
    @SerializedName("hour")
    var hour: Int?=null,
    
    @SerializedName("minute")
    var minute: Int?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: LocationDayWiseSerializer
*/
@Parcelize
data class LocationDayWiseSerializer(
    
    
    
    @SerializedName("open")
    var open: Boolean?=null,
    
    @SerializedName("opening")
    var opening: LocationTimingSerializer?=null,
    
    @SerializedName("closing")
    var closing: LocationTimingSerializer?=null,
    
    @SerializedName("weekday")
    var weekday: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: GetLocationSerializer
*/
@Parcelize
data class GetLocationSerializer(
    
    
    
    @SerializedName("contact_numbers")
    var contactNumbers: ArrayList<SellerPhoneNumber>?=null,
    
    @SerializedName("display_name")
    var displayName: String?=null,
    
    @SerializedName("product_return_config")
    var productReturnConfig: ProductReturnConfigSerializer?=null,
    
    @SerializedName("store_type")
    var storeType: String?=null,
    
    @SerializedName("warnings")
    var warnings: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("verified_on")
    var verifiedOn: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("company")
    var company: GetCompanySerializer?=null,
    
    @SerializedName("gst_credentials")
    var gstCredentials: InvoiceDetailsSerializer?=null,
    
    @SerializedName("manager")
    var manager: LocationManagerSerializer?=null,
    
    @SerializedName("phone_number")
    var phoneNumber: String?=null,
    
    @SerializedName("code")
    var code: String?=null,
    
    @SerializedName("modified_on")
    var modifiedOn: String?=null,
    
    @SerializedName("created_on")
    var createdOn: String?=null,
    
    @SerializedName("address")
    var address: GetAddressSerializer?=null,
    
    @SerializedName("notification_emails")
    var notificationEmails: ArrayList<String>?=null,
    
    @SerializedName("modified_by")
    var modifiedBy: UserSerializer2?=null,
    
    @SerializedName("created_by")
    var createdBy: UserSerializer2?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("integration_type")
    var integrationType: LocationIntegrationType?=null,
    
    @SerializedName("verified_by")
    var verifiedBy: UserSerializer2?=null,
    
    @SerializedName("documents")
    var documents: ArrayList<Document>?=null,
    
    @SerializedName("timing")
    var timing: ArrayList<LocationDayWiseSerializer>?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("stage")
    var stage: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: LocationListSerializer
*/
@Parcelize
data class LocationListSerializer(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<GetLocationSerializer>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationBrandJson
*/
@Parcelize
data class ApplicationBrandJson(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationCategoryJson
*/
@Parcelize
data class ApplicationCategoryJson(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationDepartment
*/
@Parcelize
data class ApplicationDepartment(
    
    
    
    @SerializedName("is_active")
    var isActive: Boolean?=null,
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null,
    
    @SerializedName("app_id")
    var appId: String?=null,
    
    @SerializedName("uid")
    var uid: Int?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("logo")
    var logo: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationDepartmentListingResponse
*/
@Parcelize
data class ApplicationDepartmentListingResponse(
    
    
    
    @SerializedName("page")
    var page: Page?=null,
    
    @SerializedName("items")
    var items: ArrayList<ApplicationDepartment>?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: ApplicationDepartmentJson
*/
@Parcelize
data class ApplicationDepartmentJson(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ApplicationStoreJson
*/
@Parcelize
data class ApplicationStoreJson(
    
    
    
    @SerializedName("_custom_json")
    var customJson: @RawValue HashMap<String,Any>?=null
    
): Parcelable {
    
    
    
    
    
}



