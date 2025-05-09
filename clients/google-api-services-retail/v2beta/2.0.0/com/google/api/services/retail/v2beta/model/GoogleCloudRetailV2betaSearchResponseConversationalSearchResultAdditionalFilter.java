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

package com.google.api.services.retail.v2beta.model;

/**
 * Additional filter that client side need to apply.
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
public final class GoogleCloudRetailV2betaSearchResponseConversationalSearchResultAdditionalFilter extends com.google.api.client.json.GenericJson {

  /**
   * Product attribute value, including an attribute key and an attribute value. Other types can be
   * added here in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaProductAttributeValue productAttributeValue;

  /**
   * Product attribute value, including an attribute key and an attribute value. Other types can be
   * added here in the future.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaProductAttributeValue getProductAttributeValue() {
    return productAttributeValue;
  }

  /**
   * Product attribute value, including an attribute key and an attribute value. Other types can be
   * added here in the future.
   * @param productAttributeValue productAttributeValue or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponseConversationalSearchResultAdditionalFilter setProductAttributeValue(GoogleCloudRetailV2betaProductAttributeValue productAttributeValue) {
    this.productAttributeValue = productAttributeValue;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaSearchResponseConversationalSearchResultAdditionalFilter set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaSearchResponseConversationalSearchResultAdditionalFilter) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaSearchResponseConversationalSearchResultAdditionalFilter clone() {
    return (GoogleCloudRetailV2betaSearchResponseConversationalSearchResultAdditionalFilter) super.clone();
  }

}
