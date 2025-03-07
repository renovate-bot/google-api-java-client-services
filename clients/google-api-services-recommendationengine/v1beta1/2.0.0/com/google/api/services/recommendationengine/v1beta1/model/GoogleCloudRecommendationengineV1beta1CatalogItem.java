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

package com.google.api.services.recommendationengine.v1beta1.model;

/**
 * CatalogItem captures all metadata information of items to be recommended.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommendations AI (Beta). For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommendationengineV1beta1CatalogItem extends com.google.api.client.json.GenericJson {

  /**
   * Required. Catalog item categories. This field is repeated for supporting one catalog item
   * belonging to several parallel category hierarchies. For example, if a shoes product belongs to
   * both ["Shoes & Accessories" -> "Shoes"] and ["Sports & Fitness" -> "Athletic Clothing" ->
   * "Shoes"], it could be represented as: "categoryHierarchies": [ { "categories": ["Shoes &
   * Accessories", "Shoes"]}, { "categories": ["Sports & Fitness", "Athletic Clothing", "Shoes"] } ]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy> categoryHierarchies;

  /**
   * Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This
   * id must be unique among all catalog items within the same catalog. It should also be used when
   * logging user events in order for the user events to be joined with the Catalog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation
   * model. For example, for retail products, this could include the store name, vendor, style,
   * color, etc. These are very strong signals for recommendation model, thus we highly recommend
   * providing the item attributes here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecommendationengineV1beta1FeatureMap itemAttributes;

  /**
   * Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length
   * limit of 128 bytes. This field must be enabled before it can be used. [Learn
   * more](/recommendations-ai/docs/catalog#item-group-id).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String itemGroupId;

  /**
   * Optional. Deprecated. The model automatically detects the text language. Your catalog can
   * include text in different languages, but duplicating catalog items to provide text in multiple
   * languages can result in degraded model performance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Optional. Metadata specific to retail products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecommendationengineV1beta1ProductCatalogItem productMetadata;

  /**
   * Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded
   * string with a length limit of 1 KiB. This tag can be used for filtering recommendation results
   * by passing the tag as part of the predict request filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Required. Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Required. Catalog item categories. This field is repeated for supporting one catalog item
   * belonging to several parallel category hierarchies. For example, if a shoes product belongs to
   * both ["Shoes & Accessories" -> "Shoes"] and ["Sports & Fitness" -> "Athletic Clothing" ->
   * "Shoes"], it could be represented as: "categoryHierarchies": [ { "categories": ["Shoes &
   * Accessories", "Shoes"]}, { "categories": ["Sports & Fitness", "Athletic Clothing", "Shoes"] } ]
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy> getCategoryHierarchies() {
    return categoryHierarchies;
  }

  /**
   * Required. Catalog item categories. This field is repeated for supporting one catalog item
   * belonging to several parallel category hierarchies. For example, if a shoes product belongs to
   * both ["Shoes & Accessories" -> "Shoes"] and ["Sports & Fitness" -> "Athletic Clothing" ->
   * "Shoes"], it could be represented as: "categoryHierarchies": [ { "categories": ["Shoes &
   * Accessories", "Shoes"]}, { "categories": ["Sports & Fitness", "Athletic Clothing", "Shoes"] } ]
   * @param categoryHierarchies categoryHierarchies or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1CatalogItem setCategoryHierarchies(java.util.List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy> categoryHierarchies) {
    this.categoryHierarchies = categoryHierarchies;
    return this;
  }

  /**
   * Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
   * @param description description or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1CatalogItem setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This
   * id must be unique among all catalog items within the same catalog. It should also be used when
   * logging user events in order for the user events to be joined with the Catalog.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This
   * id must be unique among all catalog items within the same catalog. It should also be used when
   * logging user events in order for the user events to be joined with the Catalog.
   * @param id id or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1CatalogItem setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation
   * model. For example, for retail products, this could include the store name, vendor, style,
   * color, etc. These are very strong signals for recommendation model, thus we highly recommend
   * providing the item attributes here.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1FeatureMap getItemAttributes() {
    return itemAttributes;
  }

  /**
   * Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation
   * model. For example, for retail products, this could include the store name, vendor, style,
   * color, etc. These are very strong signals for recommendation model, thus we highly recommend
   * providing the item attributes here.
   * @param itemAttributes itemAttributes or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1CatalogItem setItemAttributes(GoogleCloudRecommendationengineV1beta1FeatureMap itemAttributes) {
    this.itemAttributes = itemAttributes;
    return this;
  }

  /**
   * Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length
   * limit of 128 bytes. This field must be enabled before it can be used. [Learn
   * more](/recommendations-ai/docs/catalog#item-group-id).
   * @return value or {@code null} for none
   */
  public java.lang.String getItemGroupId() {
    return itemGroupId;
  }

  /**
   * Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length
   * limit of 128 bytes. This field must be enabled before it can be used. [Learn
   * more](/recommendations-ai/docs/catalog#item-group-id).
   * @param itemGroupId itemGroupId or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1CatalogItem setItemGroupId(java.lang.String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

  /**
   * Optional. Deprecated. The model automatically detects the text language. Your catalog can
   * include text in different languages, but duplicating catalog items to provide text in multiple
   * languages can result in degraded model performance.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Optional. Deprecated. The model automatically detects the text language. Your catalog can
   * include text in different languages, but duplicating catalog items to provide text in multiple
   * languages can result in degraded model performance.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1CatalogItem setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Optional. Metadata specific to retail products.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1ProductCatalogItem getProductMetadata() {
    return productMetadata;
  }

  /**
   * Optional. Metadata specific to retail products.
   * @param productMetadata productMetadata or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1CatalogItem setProductMetadata(GoogleCloudRecommendationengineV1beta1ProductCatalogItem productMetadata) {
    this.productMetadata = productMetadata;
    return this;
  }

  /**
   * Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded
   * string with a length limit of 1 KiB. This tag can be used for filtering recommendation results
   * by passing the tag as part of the predict request filter.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded
   * string with a length limit of 1 KiB. This tag can be used for filtering recommendation results
   * by passing the tag as part of the predict request filter.
   * @param tags tags or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1CatalogItem setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Required. Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
   * @param title title or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1CatalogItem setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1CatalogItem set(String fieldName, Object value) {
    return (GoogleCloudRecommendationengineV1beta1CatalogItem) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1CatalogItem clone() {
    return (GoogleCloudRecommendationengineV1beta1CatalogItem) super.clone();
  }

}
