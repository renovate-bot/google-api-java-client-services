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
 * Dataset spec for data stored in Google Cloud Storage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1ModelMonitoringInputModelMonitoringDatasetModelMonitoringGcsSource extends com.google.api.client.json.GenericJson {

  /**
   * Data format of the dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * Google Cloud Storage URI to the input file(s). May contain wildcards. For more information on
   * wildcards, see https://cloud.google.com/storage/docs/wildcards.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsUri;

  /**
   * Data format of the dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * Data format of the dataset.
   * @param format format or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringInputModelMonitoringDatasetModelMonitoringGcsSource setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * Google Cloud Storage URI to the input file(s). May contain wildcards. For more information on
   * wildcards, see https://cloud.google.com/storage/docs/wildcards.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsUri() {
    return gcsUri;
  }

  /**
   * Google Cloud Storage URI to the input file(s). May contain wildcards. For more information on
   * wildcards, see https://cloud.google.com/storage/docs/wildcards.
   * @param gcsUri gcsUri or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1ModelMonitoringInputModelMonitoringDatasetModelMonitoringGcsSource setGcsUri(java.lang.String gcsUri) {
    this.gcsUri = gcsUri;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1ModelMonitoringInputModelMonitoringDatasetModelMonitoringGcsSource set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1ModelMonitoringInputModelMonitoringDatasetModelMonitoringGcsSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1ModelMonitoringInputModelMonitoringDatasetModelMonitoringGcsSource clone() {
    return (GoogleCloudAiplatformV1beta1ModelMonitoringInputModelMonitoringDatasetModelMonitoringGcsSource) super.clone();
  }

}
