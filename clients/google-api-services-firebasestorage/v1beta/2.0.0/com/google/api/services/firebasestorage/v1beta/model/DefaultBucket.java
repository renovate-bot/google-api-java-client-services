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

package com.google.api.services.firebasestorage.v1beta.model;

/**
 * Spark tier-eligible Cloud Storage bucket. One per project. This resource exists if the underlying
 * Cloud Storage bucket exists and it is linked to your Firebase project. See
 * https://firebase.google.com/pricing for pricing details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Storage for Firebase API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DefaultBucket extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Underlying bucket resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Bucket bucket;

  /**
   * Immutable. Location of the default bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Resource name of the default bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. Storage class of the default bucket. Supported values are available at
   * https://cloud.google.com/storage/docs/storage-classes#classes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storageClass;

  /**
   * Output only. Underlying bucket resource.
   * @return value or {@code null} for none
   */
  public Bucket getBucket() {
    return bucket;
  }

  /**
   * Output only. Underlying bucket resource.
   * @param bucket bucket or {@code null} for none
   */
  public DefaultBucket setBucket(Bucket bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Immutable. Location of the default bucket.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Immutable. Location of the default bucket.
   * @param location location or {@code null} for none
   */
  public DefaultBucket setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Resource name of the default bucket.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of the default bucket.
   * @param name name or {@code null} for none
   */
  public DefaultBucket setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. Storage class of the default bucket. Supported values are available at
   * https://cloud.google.com/storage/docs/storage-classes#classes.
   * @return value or {@code null} for none
   */
  public java.lang.String getStorageClass() {
    return storageClass;
  }

  /**
   * Immutable. Storage class of the default bucket. Supported values are available at
   * https://cloud.google.com/storage/docs/storage-classes#classes.
   * @param storageClass storageClass or {@code null} for none
   */
  public DefaultBucket setStorageClass(java.lang.String storageClass) {
    this.storageClass = storageClass;
    return this;
  }

  @Override
  public DefaultBucket set(String fieldName, Object value) {
    return (DefaultBucket) super.set(fieldName, value);
  }

  @Override
  public DefaultBucket clone() {
    return (DefaultBucket) super.clone();
  }

}
