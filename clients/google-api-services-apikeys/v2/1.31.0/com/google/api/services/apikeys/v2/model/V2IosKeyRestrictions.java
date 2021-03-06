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

package com.google.api.services.apikeys.v2.model;

/**
 * The iOS apps that are allowed to use the key.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Keys API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class V2IosKeyRestrictions extends com.google.api.client.json.GenericJson {

  /**
   * A list of bundle IDs that are allowed when making API calls with this key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedBundleIds;

  /**
   * A list of bundle IDs that are allowed when making API calls with this key.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedBundleIds() {
    return allowedBundleIds;
  }

  /**
   * A list of bundle IDs that are allowed when making API calls with this key.
   * @param allowedBundleIds allowedBundleIds or {@code null} for none
   */
  public V2IosKeyRestrictions setAllowedBundleIds(java.util.List<java.lang.String> allowedBundleIds) {
    this.allowedBundleIds = allowedBundleIds;
    return this;
  }

  @Override
  public V2IosKeyRestrictions set(String fieldName, Object value) {
    return (V2IosKeyRestrictions) super.set(fieldName, value);
  }

  @Override
  public V2IosKeyRestrictions clone() {
    return (V2IosKeyRestrictions) super.clone();
  }

}
