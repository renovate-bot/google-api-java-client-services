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

package com.google.api.services.documentai.v1.model;

/**
 * Label attaches schema information and/or other metadata to segments within a Document. Multiple
 * Labels on a single field can denote either different labels, different instances of the same
 * label created at different times, or some combination of both.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta2DocumentLabel extends com.google.api.client.json.GenericJson {

  /**
   * Label is generated AutoML model. This field stores the full resource name of the AutoML model.
   * Format: `projects/{project-id}/locations/{location-id}/models/{model-id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String automlModel;

  /**
   * Confidence score between 0 and 1 for label assignment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Name of the label. When the label is generated from AutoML Text Classification model, this
   * field represents the name of the category.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Label is generated AutoML model. This field stores the full resource name of the AutoML model.
   * Format: `projects/{project-id}/locations/{location-id}/models/{model-id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getAutomlModel() {
    return automlModel;
  }

  /**
   * Label is generated AutoML model. This field stores the full resource name of the AutoML model.
   * Format: `projects/{project-id}/locations/{location-id}/models/{model-id}`
   * @param automlModel automlModel or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentLabel setAutomlModel(java.lang.String automlModel) {
    this.automlModel = automlModel;
    return this;
  }

  /**
   * Confidence score between 0 and 1 for label assignment.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Confidence score between 0 and 1 for label assignment.
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentLabel setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Name of the label. When the label is generated from AutoML Text Classification model, this
   * field represents the name of the category.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the label. When the label is generated from AutoML Text Classification model, this
   * field represents the name of the category.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentLabel setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentLabel set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentLabel) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentLabel clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentLabel) super.clone();
  }

}
