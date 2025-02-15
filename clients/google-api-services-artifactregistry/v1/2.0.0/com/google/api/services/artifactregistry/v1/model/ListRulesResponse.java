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

package com.google.api.services.artifactregistry.v1.model;

/**
 * The response from listing rules.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListRulesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The token to retrieve the next page of rules, or empty if there are no more rules to return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The rules returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleDevtoolsArtifactregistryV1Rule> rules;

  static {
    // hack to force ProGuard to consider GoogleDevtoolsArtifactregistryV1Rule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleDevtoolsArtifactregistryV1Rule.class);
  }

  /**
   * The token to retrieve the next page of rules, or empty if there are no more rules to return.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token to retrieve the next page of rules, or empty if there are no more rules to return.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListRulesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The rules returned.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleDevtoolsArtifactregistryV1Rule> getRules() {
    return rules;
  }

  /**
   * The rules returned.
   * @param rules rules or {@code null} for none
   */
  public ListRulesResponse setRules(java.util.List<GoogleDevtoolsArtifactregistryV1Rule> rules) {
    this.rules = rules;
    return this;
  }

  @Override
  public ListRulesResponse set(String fieldName, Object value) {
    return (ListRulesResponse) super.set(fieldName, value);
  }

  @Override
  public ListRulesResponse clone() {
    return (ListRulesResponse) super.clone();
  }

}
