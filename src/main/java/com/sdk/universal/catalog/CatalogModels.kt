package com.sdk.universal.catalog

import com.sdk.universal.*




import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import android.util.Base64
import com.google.gson.annotations.SerializedName

             
/*
    Model: TaxonomyItemAttributeSchemaObject
*/
@Parcelize
data class TaxonomyItemAttributeSchemaObject(
    
    
    
    @SerializedName("type")
    var type: String?=null,
    
    @SerializedName("mandatory")
    var mandatory: Boolean?=null
    
): Parcelable {
    
    
    
    
    
    
    
}



             
/*
    Model: TaxonomyItemAttributesResponseSchema
*/
@Parcelize
data class TaxonomyItemAttributesResponseSchema(
    
    
    
    @SerializedName("id")
    var id: String?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("schema")
    var schema: TaxonomyItemAttributeSchemaObject?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaxonomyItemResponseSchema
*/
@Parcelize
data class TaxonomyItemResponseSchema(
    
    
    
    @SerializedName("uid")
    var uid: Double?=null,
    
    @SerializedName("name")
    var name: String?=null,
    
    @SerializedName("slug")
    var slug: String?=null,
    
    @SerializedName("level")
    var level: Int?=null,
    
    @SerializedName("attributes")
    var attributes: ArrayList<TaxonomyItemAttributesResponseSchema>?=null,
    
    @SerializedName("product_template_slug")
    var productTemplateSlug: String?=null,
    
    @SerializedName("product_template_name")
    var productTemplateName: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}



             
/*
    Model: TaxonomyResponseSchema
*/
@Parcelize
data class TaxonomyResponseSchema(
    
    
    
    @SerializedName("items")
    var items: ArrayList<TaxonomyItemResponseSchema>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidationErrors
*/
@Parcelize
data class ValidationErrors(
    
    
    
    @SerializedName("errors")
    var errors: ArrayList<ValidationError>?=null
    
): Parcelable {
    
    
    
    
    
}



             
/*
    Model: ValidationError
*/
@Parcelize
data class ValidationError(
    
    
    
    @SerializedName("message")
    var message: String?=null,
    
    @SerializedName("field")
    var field: String?=null
    
): Parcelable {
    
    
    
    
    
    
    
}





