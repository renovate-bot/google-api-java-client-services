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

package com.google.api.services.eventarc.v1.model;

/**
 * An enrollment represents a subscription for messages on a particular message bus. It defines a
 * matching criteria for messages on the bus and the subscriber endpoint where matched messages
 * should be delivered.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Eventarc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Enrollment extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Resource annotations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Required. A CEL expression identifying which messages this enrollment applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String celMatch;

  /**
   * Output only. The creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. Destination is the Pipeline that the Enrollment is delivering to. It must point to
   * the full resource name of a Pipeline. Format:
   * "projects/{PROJECT_ID}/locations/{region}/pipelines/{PIPELINE_ID)"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destination;

  /**
   * Optional. Resource display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. This checksum is computed by the server based on the value of other fields, and
   * might be sent only on update and delete requests to ensure that the client has an up-to-date
   * value before proceeding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Optional. Resource labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. Immutable. Resource name of the message bus identifying the source of the messages.
   * It matches the form projects/{project}/locations/{location}/messageBuses/{messageBus}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageBus;

  /**
   * Identifier. Resource name of the form
   * projects/{project}/locations/{location}/enrollments/{enrollment}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Server assigned unique identifier for the channel. The value is a UUID4 string and
   * guaranteed to remain unchanged until the resource is deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. The last-modified time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Resource annotations.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Optional. Resource annotations.
   * @param annotations annotations or {@code null} for none
   */
  public Enrollment setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Required. A CEL expression identifying which messages this enrollment applies to.
   * @return value or {@code null} for none
   */
  public java.lang.String getCelMatch() {
    return celMatch;
  }

  /**
   * Required. A CEL expression identifying which messages this enrollment applies to.
   * @param celMatch celMatch or {@code null} for none
   */
  public Enrollment setCelMatch(java.lang.String celMatch) {
    this.celMatch = celMatch;
    return this;
  }

  /**
   * Output only. The creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time.
   * @param createTime createTime or {@code null} for none
   */
  public Enrollment setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. Destination is the Pipeline that the Enrollment is delivering to. It must point to
   * the full resource name of a Pipeline. Format:
   * "projects/{PROJECT_ID}/locations/{region}/pipelines/{PIPELINE_ID)"
   * @return value or {@code null} for none
   */
  public java.lang.String getDestination() {
    return destination;
  }

  /**
   * Required. Destination is the Pipeline that the Enrollment is delivering to. It must point to
   * the full resource name of a Pipeline. Format:
   * "projects/{PROJECT_ID}/locations/{region}/pipelines/{PIPELINE_ID)"
   * @param destination destination or {@code null} for none
   */
  public Enrollment setDestination(java.lang.String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Optional. Resource display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. Resource display name.
   * @param displayName displayName or {@code null} for none
   */
  public Enrollment setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. This checksum is computed by the server based on the value of other fields, and
   * might be sent only on update and delete requests to ensure that the client has an up-to-date
   * value before proceeding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. This checksum is computed by the server based on the value of other fields, and
   * might be sent only on update and delete requests to ensure that the client has an up-to-date
   * value before proceeding.
   * @param etag etag or {@code null} for none
   */
  public Enrollment setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Optional. Resource labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Resource labels.
   * @param labels labels or {@code null} for none
   */
  public Enrollment setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. Immutable. Resource name of the message bus identifying the source of the messages.
   * It matches the form projects/{project}/locations/{location}/messageBuses/{messageBus}.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageBus() {
    return messageBus;
  }

  /**
   * Required. Immutable. Resource name of the message bus identifying the source of the messages.
   * It matches the form projects/{project}/locations/{location}/messageBuses/{messageBus}.
   * @param messageBus messageBus or {@code null} for none
   */
  public Enrollment setMessageBus(java.lang.String messageBus) {
    this.messageBus = messageBus;
    return this;
  }

  /**
   * Identifier. Resource name of the form
   * projects/{project}/locations/{location}/enrollments/{enrollment}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Resource name of the form
   * projects/{project}/locations/{location}/enrollments/{enrollment}
   * @param name name or {@code null} for none
   */
  public Enrollment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Server assigned unique identifier for the channel. The value is a UUID4 string and
   * guaranteed to remain unchanged until the resource is deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. Server assigned unique identifier for the channel. The value is a UUID4 string and
   * guaranteed to remain unchanged until the resource is deleted.
   * @param uid uid or {@code null} for none
   */
  public Enrollment setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. The last-modified time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last-modified time.
   * @param updateTime updateTime or {@code null} for none
   */
  public Enrollment setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Enrollment set(String fieldName, Object value) {
    return (Enrollment) super.set(fieldName, value);
  }

  @Override
  public Enrollment clone() {
    return (Enrollment) super.clone();
  }

}
