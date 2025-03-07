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

package com.google.api.services.vmwareengine.v1.model;

/**
 * HCX activation key. A default key is created during private cloud provisioning, but this behavior
 * is subject to change and you should always verify active keys. Use
 * VmwareEngine.ListHcxActivationKeys to retrieve existing keys and
 * VmwareEngine.CreateHcxActivationKey to create new ones.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VMware Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HcxActivationKey extends com.google.api.client.json.GenericJson {

  /**
   * Output only. HCX activation key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String activationKey;

  /**
   * Output only. Creation time of HCX activation key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The resource name of this HcxActivationKey. Resource names are schemeless URIs
   * that follow the conventions in https://cloud.google.com/apis/design/resource_names. For
   * example: `projects/my-project/locations/us-central1/privateClouds/my-
   * cloud/hcxActivationKeys/my-key`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. State of HCX activation key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. System-generated unique identifier for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. HCX activation key.
   * @return value or {@code null} for none
   */
  public java.lang.String getActivationKey() {
    return activationKey;
  }

  /**
   * Output only. HCX activation key.
   * @param activationKey activationKey or {@code null} for none
   */
  public HcxActivationKey setActivationKey(java.lang.String activationKey) {
    this.activationKey = activationKey;
    return this;
  }

  /**
   * Output only. Creation time of HCX activation key.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Creation time of HCX activation key.
   * @param createTime createTime or {@code null} for none
   */
  public HcxActivationKey setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The resource name of this HcxActivationKey. Resource names are schemeless URIs
   * that follow the conventions in https://cloud.google.com/apis/design/resource_names. For
   * example: `projects/my-project/locations/us-central1/privateClouds/my-
   * cloud/hcxActivationKeys/my-key`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of this HcxActivationKey. Resource names are schemeless URIs
   * that follow the conventions in https://cloud.google.com/apis/design/resource_names. For
   * example: `projects/my-project/locations/us-central1/privateClouds/my-
   * cloud/hcxActivationKeys/my-key`
   * @param name name or {@code null} for none
   */
  public HcxActivationKey setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. State of HCX activation key.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of HCX activation key.
   * @param state state or {@code null} for none
   */
  public HcxActivationKey setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. System-generated unique identifier for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. System-generated unique identifier for the resource.
   * @param uid uid or {@code null} for none
   */
  public HcxActivationKey setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  @Override
  public HcxActivationKey set(String fieldName, Object value) {
    return (HcxActivationKey) super.set(fieldName, value);
  }

  @Override
  public HcxActivationKey clone() {
    return (HcxActivationKey) super.clone();
  }

}
