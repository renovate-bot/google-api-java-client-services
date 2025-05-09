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

package com.google.api.services.apigee.v1.model;

/**
 * Model definition for GoogleCloudApigeeV1DeveloperApp.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1DeveloperApp extends com.google.api.client.json.GenericJson {

  /**
   * List of API products associated with the developer app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> apiProducts;

  /**
   * Developer app family.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appFamily;

  /**
   * ID of the developer app. This ID is not user specified but is automatically generated on app
   * creation. appId is a UUID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * List of attributes for the developer app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1Attribute> attributes;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1Attribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1Attribute.class);
  }

  /**
   * Callback URL used by OAuth 2.0 authorization servers to communicate authorization codes back to
   * developer apps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String callbackUrl;

  /**
   * Output only. Time the developer app was created in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long createdAt;

  /**
   * Output only. Set of credentials for the developer app consisting of the consumer key/secret
   * pairs associated with the API products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1Credential> credentials;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1Credential used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1Credential.class);
  }

  /**
   * ID of the developer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String developerId;

  /**
   * Expiration time, in milliseconds, for the consumer key that is generated for the developer app.
   * If not set or left to the default value of `-1`, the API key never expires. The expiration time
   * can't be updated after it is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long keyExpiresIn;

  /**
   * Output only. Time the developer app was modified in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastModifiedAt;

  /**
   * Name of the developer app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Scopes to apply to the developer app. The specified scopes must already exist for the API
   * product that you associate with the developer app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> scopes;

  /**
   * Status of the credential. Valid values include `approved` or `revoked`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * List of API products associated with the developer app.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getApiProducts() {
    return apiProducts;
  }

  /**
   * List of API products associated with the developer app.
   * @param apiProducts apiProducts or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setApiProducts(java.util.List<java.lang.String> apiProducts) {
    this.apiProducts = apiProducts;
    return this;
  }

  /**
   * Developer app family.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppFamily() {
    return appFamily;
  }

  /**
   * Developer app family.
   * @param appFamily appFamily or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setAppFamily(java.lang.String appFamily) {
    this.appFamily = appFamily;
    return this;
  }

  /**
   * ID of the developer app. This ID is not user specified but is automatically generated on app
   * creation. appId is a UUID.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * ID of the developer app. This ID is not user specified but is automatically generated on app
   * creation. appId is a UUID.
   * @param appId appId or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * List of attributes for the developer app.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1Attribute> getAttributes() {
    return attributes;
  }

  /**
   * List of attributes for the developer app.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setAttributes(java.util.List<GoogleCloudApigeeV1Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Callback URL used by OAuth 2.0 authorization servers to communicate authorization codes back to
   * developer apps.
   * @return value or {@code null} for none
   */
  public java.lang.String getCallbackUrl() {
    return callbackUrl;
  }

  /**
   * Callback URL used by OAuth 2.0 authorization servers to communicate authorization codes back to
   * developer apps.
   * @param callbackUrl callbackUrl or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setCallbackUrl(java.lang.String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * Output only. Time the developer app was created in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Output only. Time the developer app was created in milliseconds since epoch.
   * @param createdAt createdAt or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setCreatedAt(java.lang.Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Output only. Set of credentials for the developer app consisting of the consumer key/secret
   * pairs associated with the API products.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1Credential> getCredentials() {
    return credentials;
  }

  /**
   * Output only. Set of credentials for the developer app consisting of the consumer key/secret
   * pairs associated with the API products.
   * @param credentials credentials or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setCredentials(java.util.List<GoogleCloudApigeeV1Credential> credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * ID of the developer.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeveloperId() {
    return developerId;
  }

  /**
   * ID of the developer.
   * @param developerId developerId or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setDeveloperId(java.lang.String developerId) {
    this.developerId = developerId;
    return this;
  }

  /**
   * Expiration time, in milliseconds, for the consumer key that is generated for the developer app.
   * If not set or left to the default value of `-1`, the API key never expires. The expiration time
   * can't be updated after it is set.
   * @return value or {@code null} for none
   */
  public java.lang.Long getKeyExpiresIn() {
    return keyExpiresIn;
  }

  /**
   * Expiration time, in milliseconds, for the consumer key that is generated for the developer app.
   * If not set or left to the default value of `-1`, the API key never expires. The expiration time
   * can't be updated after it is set.
   * @param keyExpiresIn keyExpiresIn or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setKeyExpiresIn(java.lang.Long keyExpiresIn) {
    this.keyExpiresIn = keyExpiresIn;
    return this;
  }

  /**
   * Output only. Time the developer app was modified in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastModifiedAt() {
    return lastModifiedAt;
  }

  /**
   * Output only. Time the developer app was modified in milliseconds since epoch.
   * @param lastModifiedAt lastModifiedAt or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setLastModifiedAt(java.lang.Long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

  /**
   * Name of the developer app.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the developer app.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Scopes to apply to the developer app. The specified scopes must already exist for the API
   * product that you associate with the developer app.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getScopes() {
    return scopes;
  }

  /**
   * Scopes to apply to the developer app. The specified scopes must already exist for the API
   * product that you associate with the developer app.
   * @param scopes scopes or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setScopes(java.util.List<java.lang.String> scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Status of the credential. Valid values include `approved` or `revoked`.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the credential. Valid values include `approved` or `revoked`.
   * @param status status or {@code null} for none
   */
  public GoogleCloudApigeeV1DeveloperApp setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1DeveloperApp set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1DeveloperApp) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1DeveloperApp clone() {
    return (GoogleCloudApigeeV1DeveloperApp) super.clone();
  }

}
