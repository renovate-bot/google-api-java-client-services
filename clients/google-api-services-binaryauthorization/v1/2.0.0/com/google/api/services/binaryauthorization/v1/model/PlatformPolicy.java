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

package com.google.api.services.binaryauthorization.v1.model;

/**
 * A Binary Authorization platform policy for deployments on various platforms.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Binary Authorization API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlatformPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A description comment about the policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Used to prevent updating the policy when another request has updated it since it was
   * retrieved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Optional. GKE platform-specific policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GkePolicy gkePolicy;

  /**
   * Output only. The relative resource name of the Binary Authorization platform policy, in the
   * form of `projects/platforms/policies`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Time when the policy was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. A description comment about the policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A description comment about the policy.
   * @param description description or {@code null} for none
   */
  public PlatformPolicy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Used to prevent updating the policy when another request has updated it since it was
   * retrieved.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. Used to prevent updating the policy when another request has updated it since it was
   * retrieved.
   * @param etag etag or {@code null} for none
   */
  public PlatformPolicy setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Optional. GKE platform-specific policy.
   * @return value or {@code null} for none
   */
  public GkePolicy getGkePolicy() {
    return gkePolicy;
  }

  /**
   * Optional. GKE platform-specific policy.
   * @param gkePolicy gkePolicy or {@code null} for none
   */
  public PlatformPolicy setGkePolicy(GkePolicy gkePolicy) {
    this.gkePolicy = gkePolicy;
    return this;
  }

  /**
   * Output only. The relative resource name of the Binary Authorization platform policy, in the
   * form of `projects/platforms/policies`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The relative resource name of the Binary Authorization platform policy, in the
   * form of `projects/platforms/policies`.
   * @param name name or {@code null} for none
   */
  public PlatformPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Time when the policy was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time when the policy was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public PlatformPolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public PlatformPolicy set(String fieldName, Object value) {
    return (PlatformPolicy) super.set(fieldName, value);
  }

  @Override
  public PlatformPolicy clone() {
    return (PlatformPolicy) super.clone();
  }

}
