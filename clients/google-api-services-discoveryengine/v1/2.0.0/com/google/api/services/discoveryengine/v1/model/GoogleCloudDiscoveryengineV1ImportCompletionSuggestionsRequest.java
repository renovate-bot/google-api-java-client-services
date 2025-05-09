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

package com.google.api.services.discoveryengine.v1.model;

/**
 * Request message for CompletionService.ImportCompletionSuggestions method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest extends com.google.api.client.json.GenericJson {

  /**
   * BigQuery input source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1BigQuerySource bigquerySource;

  /**
   * The desired location of errors incurred during the Import.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1ImportErrorConfig errorConfig;

  /**
   * Cloud Storage location for the input content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1GcsSource gcsSource;

  /**
   * The Inline source for suggestion entries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequestInlineSource inlineSource;

  /**
   * BigQuery input source.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1BigQuerySource getBigquerySource() {
    return bigquerySource;
  }

  /**
   * BigQuery input source.
   * @param bigquerySource bigquerySource or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest setBigquerySource(GoogleCloudDiscoveryengineV1BigQuerySource bigquerySource) {
    this.bigquerySource = bigquerySource;
    return this;
  }

  /**
   * The desired location of errors incurred during the Import.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ImportErrorConfig getErrorConfig() {
    return errorConfig;
  }

  /**
   * The desired location of errors incurred during the Import.
   * @param errorConfig errorConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest setErrorConfig(GoogleCloudDiscoveryengineV1ImportErrorConfig errorConfig) {
    this.errorConfig = errorConfig;
    return this;
  }

  /**
   * Cloud Storage location for the input content.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1GcsSource getGcsSource() {
    return gcsSource;
  }

  /**
   * Cloud Storage location for the input content.
   * @param gcsSource gcsSource or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest setGcsSource(GoogleCloudDiscoveryengineV1GcsSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  /**
   * The Inline source for suggestion entries.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequestInlineSource getInlineSource() {
    return inlineSource;
  }

  /**
   * The Inline source for suggestion entries.
   * @param inlineSource inlineSource or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest setInlineSource(GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequestInlineSource inlineSource) {
    this.inlineSource = inlineSource;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest clone() {
    return (GoogleCloudDiscoveryengineV1ImportCompletionSuggestionsRequest) super.clone();
  }

}
