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

package com.google.api.services.securityposture.v1.model;

/**
 * The details of a posture.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Posture API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Posture extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The user-specified annotations for the posture. For details about the values you can
   * use in an annotation, see [AIP-148: Standard fields](https://google.aip.dev/148#annotations).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Output only. The categories that the posture belongs to, as determined by the Security Posture
   * API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> categories;

  /**
   * Output only. The time at which the posture was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. A description of the posture.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. An opaque identifier for the current version of the posture at the specified
   * `revision_id`. To prevent concurrent updates from overwriting each other, always provide the
   * `etag` when you update a posture. You can also provide the `etag` when you delete a posture, to
   * help ensure that you're deleting the intended version of the posture.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Required. Identifier. The name of the posture, in the format
   * `organizations/{organization}/locations/global/postures/{posture_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The PolicySet resources that the posture includes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PolicySet> policySets;

  static {
    // hack to force ProGuard to consider PolicySet used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PolicySet.class);
  }

  /**
   * Output only. Whether the posture is in the process of being updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reconciling;

  /**
   * Output only. Immutable. An opaque eight-character string that identifies the revision of the
   * posture. A posture can have multiple revisions; when you deploy a posture, you deploy a
   * specific revision of the posture.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * Required. The state of the posture at the specified `revision_id`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time at which the posture was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. The user-specified annotations for the posture. For details about the values you can
   * use in an annotation, see [AIP-148: Standard fields](https://google.aip.dev/148#annotations).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Optional. The user-specified annotations for the posture. For details about the values you can
   * use in an annotation, see [AIP-148: Standard fields](https://google.aip.dev/148#annotations).
   * @param annotations annotations or {@code null} for none
   */
  public Posture setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Output only. The categories that the posture belongs to, as determined by the Security Posture
   * API.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCategories() {
    return categories;
  }

  /**
   * Output only. The categories that the posture belongs to, as determined by the Security Posture
   * API.
   * @param categories categories or {@code null} for none
   */
  public Posture setCategories(java.util.List<java.lang.String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Output only. The time at which the posture was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which the posture was created.
   * @param createTime createTime or {@code null} for none
   */
  public Posture setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. A description of the posture.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A description of the posture.
   * @param description description or {@code null} for none
   */
  public Posture setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. An opaque identifier for the current version of the posture at the specified
   * `revision_id`. To prevent concurrent updates from overwriting each other, always provide the
   * `etag` when you update a posture. You can also provide the `etag` when you delete a posture, to
   * help ensure that you're deleting the intended version of the posture.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. An opaque identifier for the current version of the posture at the specified
   * `revision_id`. To prevent concurrent updates from overwriting each other, always provide the
   * `etag` when you update a posture. You can also provide the `etag` when you delete a posture, to
   * help ensure that you're deleting the intended version of the posture.
   * @param etag etag or {@code null} for none
   */
  public Posture setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Required. Identifier. The name of the posture, in the format
   * `organizations/{organization}/locations/global/postures/{posture_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Identifier. The name of the posture, in the format
   * `organizations/{organization}/locations/global/postures/{posture_id}`.
   * @param name name or {@code null} for none
   */
  public Posture setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The PolicySet resources that the posture includes.
   * @return value or {@code null} for none
   */
  public java.util.List<PolicySet> getPolicySets() {
    return policySets;
  }

  /**
   * Required. The PolicySet resources that the posture includes.
   * @param policySets policySets or {@code null} for none
   */
  public Posture setPolicySets(java.util.List<PolicySet> policySets) {
    this.policySets = policySets;
    return this;
  }

  /**
   * Output only. Whether the posture is in the process of being updated.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReconciling() {
    return reconciling;
  }

  /**
   * Output only. Whether the posture is in the process of being updated.
   * @param reconciling reconciling or {@code null} for none
   */
  public Posture setReconciling(java.lang.Boolean reconciling) {
    this.reconciling = reconciling;
    return this;
  }

  /**
   * Output only. Immutable. An opaque eight-character string that identifies the revision of the
   * posture. A posture can have multiple revisions; when you deploy a posture, you deploy a
   * specific revision of the posture.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * Output only. Immutable. An opaque eight-character string that identifies the revision of the
   * posture. A posture can have multiple revisions; when you deploy a posture, you deploy a
   * specific revision of the posture.
   * @param revisionId revisionId or {@code null} for none
   */
  public Posture setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * Required. The state of the posture at the specified `revision_id`.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Required. The state of the posture at the specified `revision_id`.
   * @param state state or {@code null} for none
   */
  public Posture setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time at which the posture was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time at which the posture was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Posture setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Posture set(String fieldName, Object value) {
    return (Posture) super.set(fieldName, value);
  }

  @Override
  public Posture clone() {
    return (Posture) super.clone();
  }

}
