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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Spec for MetricX instance - The fields used for evaluation are dependent on the MetricX version.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1MetricxInstance extends com.google.api.client.json.GenericJson {

  /**
   * Required. Output of the evaluated model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prediction;

  /**
   * Optional. Ground truth used to compare against the prediction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reference;

  /**
   * Optional. Source text in original language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * Required. Output of the evaluated model.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrediction() {
    return prediction;
  }

  /**
   * Required. Output of the evaluated model.
   * @param prediction prediction or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1MetricxInstance setPrediction(java.lang.String prediction) {
    this.prediction = prediction;
    return this;
  }

  /**
   * Optional. Ground truth used to compare against the prediction.
   * @return value or {@code null} for none
   */
  public java.lang.String getReference() {
    return reference;
  }

  /**
   * Optional. Ground truth used to compare against the prediction.
   * @param reference reference or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1MetricxInstance setReference(java.lang.String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Optional. Source text in original language.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Optional. Source text in original language.
   * @param source source or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1MetricxInstance setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1MetricxInstance set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1MetricxInstance) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1MetricxInstance clone() {
    return (GoogleCloudAiplatformV1beta1MetricxInstance) super.clone();
  }

}
