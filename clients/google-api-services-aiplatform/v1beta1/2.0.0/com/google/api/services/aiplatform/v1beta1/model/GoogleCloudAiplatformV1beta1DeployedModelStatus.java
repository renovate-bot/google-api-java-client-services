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
 * Runtime status of the deployed model.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1DeployedModelStatus extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The number of available replicas of the deployed model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer availableReplicaCount;

  /**
   * Output only. The time at which the status was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastUpdateTime;

  /**
   * Output only. The latest deployed model's status message (if any).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Output only. The number of available replicas of the deployed model.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAvailableReplicaCount() {
    return availableReplicaCount;
  }

  /**
   * Output only. The number of available replicas of the deployed model.
   * @param availableReplicaCount availableReplicaCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DeployedModelStatus setAvailableReplicaCount(java.lang.Integer availableReplicaCount) {
    this.availableReplicaCount = availableReplicaCount;
    return this;
  }

  /**
   * Output only. The time at which the status was last updated.
   * @return value or {@code null} for none
   */
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  /**
   * Output only. The time at which the status was last updated.
   * @param lastUpdateTime lastUpdateTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DeployedModelStatus setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * Output only. The latest deployed model's status message (if any).
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Output only. The latest deployed model's status message (if any).
   * @param message message or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DeployedModelStatus setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1DeployedModelStatus set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1DeployedModelStatus) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1DeployedModelStatus clone() {
    return (GoogleCloudAiplatformV1beta1DeployedModelStatus) super.clone();
  }

}
