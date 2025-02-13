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

package com.google.api.services.dataplex.v1.model;

/**
 * Describes BigQuery publishing configurations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1DataDiscoveryResultBigQueryPublishing extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The BigQuery dataset to publish to. It takes the form
   * projects/{project_id}/datasets/{dataset_id}. If not set, the service creates a default
   * publishing dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataset;

  /**
   * Output only. The BigQuery dataset to publish to. It takes the form
   * projects/{project_id}/datasets/{dataset_id}. If not set, the service creates a default
   * publishing dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataset() {
    return dataset;
  }

  /**
   * Output only. The BigQuery dataset to publish to. It takes the form
   * projects/{project_id}/datasets/{dataset_id}. If not set, the service creates a default
   * publishing dataset.
   * @param dataset dataset or {@code null} for none
   */
  public GoogleCloudDataplexV1DataDiscoveryResultBigQueryPublishing setDataset(java.lang.String dataset) {
    this.dataset = dataset;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1DataDiscoveryResultBigQueryPublishing set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1DataDiscoveryResultBigQueryPublishing) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1DataDiscoveryResultBigQueryPublishing clone() {
    return (GoogleCloudDataplexV1DataDiscoveryResultBigQueryPublishing) super.clone();
  }

}
