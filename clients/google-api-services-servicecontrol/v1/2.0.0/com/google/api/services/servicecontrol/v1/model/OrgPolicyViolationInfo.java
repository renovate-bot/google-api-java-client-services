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

package com.google.api.services.servicecontrol.v1.model;

/**
 * Represents OrgPolicy Violation information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrgPolicyViolationInfo extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Deprecated. Resource payload that is currently in scope and is subjected to orgpolicy
   * conditions. This payload may be the subset of the actual Resource that may come in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> payload;

  /**
   * Optional. Deprecated. Tags referenced on the resource at the time of evaluation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> resourceTags;

  /**
   * Optional. Resource type that the orgpolicy is checked against. Example:
   * compute.googleapis.com/Instance, store.googleapis.com/bucket
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceType;

  /**
   * Optional. Policy violations
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ViolationInfo> violationInfo;

  /**
   * Optional. Deprecated. Resource payload that is currently in scope and is subjected to orgpolicy
   * conditions. This payload may be the subset of the actual Resource that may come in the request.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPayload() {
    return payload;
  }

  /**
   * Optional. Deprecated. Resource payload that is currently in scope and is subjected to orgpolicy
   * conditions. This payload may be the subset of the actual Resource that may come in the request.
   * @param payload payload or {@code null} for none
   */
  public OrgPolicyViolationInfo setPayload(java.util.Map<String, java.lang.Object> payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Optional. Deprecated. Tags referenced on the resource at the time of evaluation.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getResourceTags() {
    return resourceTags;
  }

  /**
   * Optional. Deprecated. Tags referenced on the resource at the time of evaluation.
   * @param resourceTags resourceTags or {@code null} for none
   */
  public OrgPolicyViolationInfo setResourceTags(java.util.Map<String, java.lang.String> resourceTags) {
    this.resourceTags = resourceTags;
    return this;
  }

  /**
   * Optional. Resource type that the orgpolicy is checked against. Example:
   * compute.googleapis.com/Instance, store.googleapis.com/bucket
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceType() {
    return resourceType;
  }

  /**
   * Optional. Resource type that the orgpolicy is checked against. Example:
   * compute.googleapis.com/Instance, store.googleapis.com/bucket
   * @param resourceType resourceType or {@code null} for none
   */
  public OrgPolicyViolationInfo setResourceType(java.lang.String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Optional. Policy violations
   * @return value or {@code null} for none
   */
  public java.util.List<ViolationInfo> getViolationInfo() {
    return violationInfo;
  }

  /**
   * Optional. Policy violations
   * @param violationInfo violationInfo or {@code null} for none
   */
  public OrgPolicyViolationInfo setViolationInfo(java.util.List<ViolationInfo> violationInfo) {
    this.violationInfo = violationInfo;
    return this;
  }

  @Override
  public OrgPolicyViolationInfo set(String fieldName, Object value) {
    return (OrgPolicyViolationInfo) super.set(fieldName, value);
  }

  @Override
  public OrgPolicyViolationInfo clone() {
    return (OrgPolicyViolationInfo) super.clone();
  }

}
