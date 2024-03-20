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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * Document captures all raw metadata information of items to be recommended or searched.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaProcessedDocument extends com.google.api.client.json.GenericJson {

  /**
   * Required. Full resource name of the referenced document, in the format
   * `projects/locations/collections/dataStores/branches/documents`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String document;

  /**
   * The JSON string representation of the processed document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jsonData;

  /**
   * Required. Full resource name of the referenced document, in the format
   * `projects/locations/collections/dataStores/branches/documents`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocument() {
    return document;
  }

  /**
   * Required. Full resource name of the referenced document, in the format
   * `projects/locations/collections/dataStores/branches/documents`.
   * @param document document or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaProcessedDocument setDocument(java.lang.String document) {
    this.document = document;
    return this;
  }

  /**
   * The JSON string representation of the processed document.
   * @return value or {@code null} for none
   */
  public java.lang.String getJsonData() {
    return jsonData;
  }

  /**
   * The JSON string representation of the processed document.
   * @param jsonData jsonData or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaProcessedDocument setJsonData(java.lang.String jsonData) {
    this.jsonData = jsonData;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaProcessedDocument set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaProcessedDocument) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaProcessedDocument clone() {
    return (GoogleCloudDiscoveryengineV1alphaProcessedDocument) super.clone();
  }

}