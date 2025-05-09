/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.retail.v2.model;

/**
 * Catalog level attribute config for an attribute. For example, if customers want to enable/disable
 * facet for a specific attribute.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI Search for commerce API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2CatalogAttribute extends com.google.api.client.json.GenericJson {

  /**
   * If DYNAMIC_FACETABLE_ENABLED, attribute values are available for dynamic facet. Could only be
   * DYNAMIC_FACETABLE_DISABLED if CatalogAttribute.indexable_option is INDEXABLE_DISABLED.
   * Otherwise, an INVALID_ARGUMENT error is returned. Must be specified, otherwise throws
   * INVALID_FORMAT error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dynamicFacetableOption;

  /**
   * If EXACT_SEARCHABLE_ENABLED, attribute values will be exact searchable. This property only
   * applies to textual custom attributes and requires indexable set to enabled to enable exact-
   * searchable. If unset, the server behavior defaults to EXACT_SEARCHABLE_DISABLED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exactSearchableOption;

  /**
   * Contains facet options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2CatalogAttributeFacetConfig facetConfig;

  /**
   * Output only. Indicates whether this attribute has been used by any products. `True` if at least
   * one Product is using this attribute in Product.attributes. Otherwise, this field is `False`.
   * CatalogAttribute can be pre-loaded by using CatalogService.AddCatalogAttribute or
   * CatalogService.UpdateAttributesConfig APIs. This field is `False` for pre-loaded
   * CatalogAttributes. Only pre-loaded catalog attributes that are neither in use by products nor
   * predefined can be deleted. Catalog attributes that are either in use by products or are
   * predefined attributes cannot be deleted; however, their configuration properties will reset to
   * default values upon removal request. After catalog changes, it takes about 10 minutes for this
   * field to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean inUse;

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * INDEXABLE_ENABLED attribute values are indexed so that it can be filtered, faceted, or boosted
   * in SearchService.Search. Must be specified when AttributesConfig.attribute_config_level is
   * CATALOG_LEVEL_ATTRIBUTE_CONFIG, otherwise throws INVALID_FORMAT error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String indexableOption;

  /**
   * Required. Attribute name. For example: `color`, `brands`, `attributes.custom_attribute`, such
   * as `attributes.xyz`. To be indexable, the attribute name can contain only alpha-numeric
   * characters and underscores. For example, an attribute named `attributes.abc_xyz` can be
   * indexed, but an attribute named `attributes.abc-xyz` cannot be indexed. If the attribute key
   * starts with `attributes.`, then the attribute is a custom attribute. Attributes such as
   * `brands`, `patterns`, and `title` are built-in and called system attributes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * If RETRIEVABLE_ENABLED, attribute values are retrievable in the search results. If unset, the
   * server behavior defaults to RETRIEVABLE_DISABLED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String retrievableOption;

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * SEARCHABLE_ENABLED, attribute values are searchable by text queries in SearchService.Search. If
   * SEARCHABLE_ENABLED but attribute type is numerical, attribute values will not be searchable by
   * text queries in SearchService.Search, as there are no text values associated to numerical
   * attributes. Must be specified, when AttributesConfig.attribute_config_level is
   * CATALOG_LEVEL_ATTRIBUTE_CONFIG, otherwise throws INVALID_FORMAT error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchableOption;

  /**
   * Output only. The type of this attribute. This is derived from the attribute in
   * Product.attributes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * If DYNAMIC_FACETABLE_ENABLED, attribute values are available for dynamic facet. Could only be
   * DYNAMIC_FACETABLE_DISABLED if CatalogAttribute.indexable_option is INDEXABLE_DISABLED.
   * Otherwise, an INVALID_ARGUMENT error is returned. Must be specified, otherwise throws
   * INVALID_FORMAT error.
   * @return value or {@code null} for none
   */
  public java.lang.String getDynamicFacetableOption() {
    return dynamicFacetableOption;
  }

  /**
   * If DYNAMIC_FACETABLE_ENABLED, attribute values are available for dynamic facet. Could only be
   * DYNAMIC_FACETABLE_DISABLED if CatalogAttribute.indexable_option is INDEXABLE_DISABLED.
   * Otherwise, an INVALID_ARGUMENT error is returned. Must be specified, otherwise throws
   * INVALID_FORMAT error.
   * @param dynamicFacetableOption dynamicFacetableOption or {@code null} for none
   */
  public GoogleCloudRetailV2CatalogAttribute setDynamicFacetableOption(java.lang.String dynamicFacetableOption) {
    this.dynamicFacetableOption = dynamicFacetableOption;
    return this;
  }

  /**
   * If EXACT_SEARCHABLE_ENABLED, attribute values will be exact searchable. This property only
   * applies to textual custom attributes and requires indexable set to enabled to enable exact-
   * searchable. If unset, the server behavior defaults to EXACT_SEARCHABLE_DISABLED.
   * @return value or {@code null} for none
   */
  public java.lang.String getExactSearchableOption() {
    return exactSearchableOption;
  }

  /**
   * If EXACT_SEARCHABLE_ENABLED, attribute values will be exact searchable. This property only
   * applies to textual custom attributes and requires indexable set to enabled to enable exact-
   * searchable. If unset, the server behavior defaults to EXACT_SEARCHABLE_DISABLED.
   * @param exactSearchableOption exactSearchableOption or {@code null} for none
   */
  public GoogleCloudRetailV2CatalogAttribute setExactSearchableOption(java.lang.String exactSearchableOption) {
    this.exactSearchableOption = exactSearchableOption;
    return this;
  }

  /**
   * Contains facet options.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2CatalogAttributeFacetConfig getFacetConfig() {
    return facetConfig;
  }

  /**
   * Contains facet options.
   * @param facetConfig facetConfig or {@code null} for none
   */
  public GoogleCloudRetailV2CatalogAttribute setFacetConfig(GoogleCloudRetailV2CatalogAttributeFacetConfig facetConfig) {
    this.facetConfig = facetConfig;
    return this;
  }

  /**
   * Output only. Indicates whether this attribute has been used by any products. `True` if at least
   * one Product is using this attribute in Product.attributes. Otherwise, this field is `False`.
   * CatalogAttribute can be pre-loaded by using CatalogService.AddCatalogAttribute or
   * CatalogService.UpdateAttributesConfig APIs. This field is `False` for pre-loaded
   * CatalogAttributes. Only pre-loaded catalog attributes that are neither in use by products nor
   * predefined can be deleted. Catalog attributes that are either in use by products or are
   * predefined attributes cannot be deleted; however, their configuration properties will reset to
   * default values upon removal request. After catalog changes, it takes about 10 minutes for this
   * field to update.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInUse() {
    return inUse;
  }

  /**
   * Output only. Indicates whether this attribute has been used by any products. `True` if at least
   * one Product is using this attribute in Product.attributes. Otherwise, this field is `False`.
   * CatalogAttribute can be pre-loaded by using CatalogService.AddCatalogAttribute or
   * CatalogService.UpdateAttributesConfig APIs. This field is `False` for pre-loaded
   * CatalogAttributes. Only pre-loaded catalog attributes that are neither in use by products nor
   * predefined can be deleted. Catalog attributes that are either in use by products or are
   * predefined attributes cannot be deleted; however, their configuration properties will reset to
   * default values upon removal request. After catalog changes, it takes about 10 minutes for this
   * field to update.
   * @param inUse inUse or {@code null} for none
   */
  public GoogleCloudRetailV2CatalogAttribute setInUse(java.lang.Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * INDEXABLE_ENABLED attribute values are indexed so that it can be filtered, faceted, or boosted
   * in SearchService.Search. Must be specified when AttributesConfig.attribute_config_level is
   * CATALOG_LEVEL_ATTRIBUTE_CONFIG, otherwise throws INVALID_FORMAT error.
   * @return value or {@code null} for none
   */
  public java.lang.String getIndexableOption() {
    return indexableOption;
  }

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * INDEXABLE_ENABLED attribute values are indexed so that it can be filtered, faceted, or boosted
   * in SearchService.Search. Must be specified when AttributesConfig.attribute_config_level is
   * CATALOG_LEVEL_ATTRIBUTE_CONFIG, otherwise throws INVALID_FORMAT error.
   * @param indexableOption indexableOption or {@code null} for none
   */
  public GoogleCloudRetailV2CatalogAttribute setIndexableOption(java.lang.String indexableOption) {
    this.indexableOption = indexableOption;
    return this;
  }

  /**
   * Required. Attribute name. For example: `color`, `brands`, `attributes.custom_attribute`, such
   * as `attributes.xyz`. To be indexable, the attribute name can contain only alpha-numeric
   * characters and underscores. For example, an attribute named `attributes.abc_xyz` can be
   * indexed, but an attribute named `attributes.abc-xyz` cannot be indexed. If the attribute key
   * starts with `attributes.`, then the attribute is a custom attribute. Attributes such as
   * `brands`, `patterns`, and `title` are built-in and called system attributes.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Required. Attribute name. For example: `color`, `brands`, `attributes.custom_attribute`, such
   * as `attributes.xyz`. To be indexable, the attribute name can contain only alpha-numeric
   * characters and underscores. For example, an attribute named `attributes.abc_xyz` can be
   * indexed, but an attribute named `attributes.abc-xyz` cannot be indexed. If the attribute key
   * starts with `attributes.`, then the attribute is a custom attribute. Attributes such as
   * `brands`, `patterns`, and `title` are built-in and called system attributes.
   * @param key key or {@code null} for none
   */
  public GoogleCloudRetailV2CatalogAttribute setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * If RETRIEVABLE_ENABLED, attribute values are retrievable in the search results. If unset, the
   * server behavior defaults to RETRIEVABLE_DISABLED.
   * @return value or {@code null} for none
   */
  public java.lang.String getRetrievableOption() {
    return retrievableOption;
  }

  /**
   * If RETRIEVABLE_ENABLED, attribute values are retrievable in the search results. If unset, the
   * server behavior defaults to RETRIEVABLE_DISABLED.
   * @param retrievableOption retrievableOption or {@code null} for none
   */
  public GoogleCloudRetailV2CatalogAttribute setRetrievableOption(java.lang.String retrievableOption) {
    this.retrievableOption = retrievableOption;
    return this;
  }

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * SEARCHABLE_ENABLED, attribute values are searchable by text queries in SearchService.Search. If
   * SEARCHABLE_ENABLED but attribute type is numerical, attribute values will not be searchable by
   * text queries in SearchService.Search, as there are no text values associated to numerical
   * attributes. Must be specified, when AttributesConfig.attribute_config_level is
   * CATALOG_LEVEL_ATTRIBUTE_CONFIG, otherwise throws INVALID_FORMAT error.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchableOption() {
    return searchableOption;
  }

  /**
   * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if
   * SEARCHABLE_ENABLED, attribute values are searchable by text queries in SearchService.Search. If
   * SEARCHABLE_ENABLED but attribute type is numerical, attribute values will not be searchable by
   * text queries in SearchService.Search, as there are no text values associated to numerical
   * attributes. Must be specified, when AttributesConfig.attribute_config_level is
   * CATALOG_LEVEL_ATTRIBUTE_CONFIG, otherwise throws INVALID_FORMAT error.
   * @param searchableOption searchableOption or {@code null} for none
   */
  public GoogleCloudRetailV2CatalogAttribute setSearchableOption(java.lang.String searchableOption) {
    this.searchableOption = searchableOption;
    return this;
  }

  /**
   * Output only. The type of this attribute. This is derived from the attribute in
   * Product.attributes.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Output only. The type of this attribute. This is derived from the attribute in
   * Product.attributes.
   * @param type type or {@code null} for none
   */
  public GoogleCloudRetailV2CatalogAttribute setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudRetailV2CatalogAttribute set(String fieldName, Object value) {
    return (GoogleCloudRetailV2CatalogAttribute) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2CatalogAttribute clone() {
    return (GoogleCloudRetailV2CatalogAttribute) super.clone();
  }

}
