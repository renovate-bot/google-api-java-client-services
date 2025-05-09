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

package com.google.api.services.run.v1.model;

/**
 * A list of WorkerPool resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListWorkerPoolsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The API version for this call; returns "run.googleapis.com/v1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * List of WorkerPools.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WorkerPool> items;

  /**
   * The kind of this resource; returns "WorkerPoolList".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Metadata associated with this WorkerPool list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ListMeta metadata;

  /**
   * For calls against the global endpoint, returns the list of Cloud locations that could not be
   * reached. For regional calls, this field is not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * The API version for this call; returns "run.googleapis.com/v1".
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * The API version for this call; returns "run.googleapis.com/v1".
   * @param apiVersion apiVersion or {@code null} for none
   */
  public ListWorkerPoolsResponse setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * List of WorkerPools.
   * @return value or {@code null} for none
   */
  public java.util.List<WorkerPool> getItems() {
    return items;
  }

  /**
   * List of WorkerPools.
   * @param items items or {@code null} for none
   */
  public ListWorkerPoolsResponse setItems(java.util.List<WorkerPool> items) {
    this.items = items;
    return this;
  }

  /**
   * The kind of this resource; returns "WorkerPoolList".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of this resource; returns "WorkerPoolList".
   * @param kind kind or {@code null} for none
   */
  public ListWorkerPoolsResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Metadata associated with this WorkerPool list.
   * @return value or {@code null} for none
   */
  public ListMeta getMetadata() {
    return metadata;
  }

  /**
   * Metadata associated with this WorkerPool list.
   * @param metadata metadata or {@code null} for none
   */
  public ListWorkerPoolsResponse setMetadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * For calls against the global endpoint, returns the list of Cloud locations that could not be
   * reached. For regional calls, this field is not used.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * For calls against the global endpoint, returns the list of Cloud locations that could not be
   * reached. For regional calls, this field is not used.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListWorkerPoolsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListWorkerPoolsResponse set(String fieldName, Object value) {
    return (ListWorkerPoolsResponse) super.set(fieldName, value);
  }

  @Override
  public ListWorkerPoolsResponse clone() {
    return (ListWorkerPoolsResponse) super.clone();
  }

}
