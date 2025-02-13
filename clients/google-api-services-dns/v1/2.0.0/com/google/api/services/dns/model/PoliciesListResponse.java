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

package com.google.api.services.dns.model;

/**
 * Model definition for PoliciesListResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PoliciesListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Type of resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * This field indicates that more results are available beyond the last page displayed. To fetch
   * the results, make another list request and use this value as your page token. This lets you
   * retrieve the complete contents of a very large collection one page at a time. However, if the
   * contents of the collection change between the first and last paginated list request, the set of
   * all elements returned are an inconsistent view of the collection. You can't retrieve a
   * consistent snapshot of a collection larger than the maximum page size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The policy resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Policy> policies;

  /**
   * Type of resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type of resource.
   * @param kind kind or {@code null} for none
   */
  public PoliciesListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * This field indicates that more results are available beyond the last page displayed. To fetch
   * the results, make another list request and use this value as your page token. This lets you
   * retrieve the complete contents of a very large collection one page at a time. However, if the
   * contents of the collection change between the first and last paginated list request, the set of
   * all elements returned are an inconsistent view of the collection. You can't retrieve a
   * consistent snapshot of a collection larger than the maximum page size.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * This field indicates that more results are available beyond the last page displayed. To fetch
   * the results, make another list request and use this value as your page token. This lets you
   * retrieve the complete contents of a very large collection one page at a time. However, if the
   * contents of the collection change between the first and last paginated list request, the set of
   * all elements returned are an inconsistent view of the collection. You can't retrieve a
   * consistent snapshot of a collection larger than the maximum page size.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public PoliciesListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The policy resources.
   * @return value or {@code null} for none
   */
  public java.util.List<Policy> getPolicies() {
    return policies;
  }

  /**
   * The policy resources.
   * @param policies policies or {@code null} for none
   */
  public PoliciesListResponse setPolicies(java.util.List<Policy> policies) {
    this.policies = policies;
    return this;
  }

  @Override
  public PoliciesListResponse set(String fieldName, Object value) {
    return (PoliciesListResponse) super.set(fieldName, value);
  }

  @Override
  public PoliciesListResponse clone() {
    return (PoliciesListResponse) super.clone();
  }

}
