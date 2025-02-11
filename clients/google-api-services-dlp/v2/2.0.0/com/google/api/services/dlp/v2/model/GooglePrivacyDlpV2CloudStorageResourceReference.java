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

package com.google.api.services.dlp.v2.model;

/**
 * Identifies a single Cloud Storage bucket.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Sensitive Data Protection (DLP). For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2CloudStorageResourceReference extends com.google.api.client.json.GenericJson {

  /**
   * Required. The bucket to scan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bucketName;

  /**
   * Required. If within a project-level config, then this must match the config's project id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Required. The bucket to scan.
   * @return value or {@code null} for none
   */
  public java.lang.String getBucketName() {
    return bucketName;
  }

  /**
   * Required. The bucket to scan.
   * @param bucketName bucketName or {@code null} for none
   */
  public GooglePrivacyDlpV2CloudStorageResourceReference setBucketName(java.lang.String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

  /**
   * Required. If within a project-level config, then this must match the config's project id.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Required. If within a project-level config, then this must match the config's project id.
   * @param projectId projectId or {@code null} for none
   */
  public GooglePrivacyDlpV2CloudStorageResourceReference setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2CloudStorageResourceReference set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2CloudStorageResourceReference) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2CloudStorageResourceReference clone() {
    return (GooglePrivacyDlpV2CloudStorageResourceReference) super.clone();
  }

}
