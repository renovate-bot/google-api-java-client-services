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
 * Response message for ListPostures.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Posture API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListPosturesResponse extends com.google.api.client.json.GenericJson {

  /**
   * A pagination token. To retrieve the next page of results, call the method again with this
   * token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of Posture resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Posture> postures;

  /**
   * Locations that were temporarily unavailable and could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * A pagination token. To retrieve the next page of results, call the method again with this
   * token.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A pagination token. To retrieve the next page of results, call the method again with this
   * token.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListPosturesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of Posture resources.
   * @return value or {@code null} for none
   */
  public java.util.List<Posture> getPostures() {
    return postures;
  }

  /**
   * The list of Posture resources.
   * @param postures postures or {@code null} for none
   */
  public ListPosturesResponse setPostures(java.util.List<Posture> postures) {
    this.postures = postures;
    return this;
  }

  /**
   * Locations that were temporarily unavailable and could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Locations that were temporarily unavailable and could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListPosturesResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListPosturesResponse set(String fieldName, Object value) {
    return (ListPosturesResponse) super.set(fieldName, value);
  }

  @Override
  public ListPosturesResponse clone() {
    return (ListPosturesResponse) super.clone();
  }

}
