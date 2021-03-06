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

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * The `MembershipRole` expiry details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExpiryDetail extends com.google.api.client.json.GenericJson {

  /**
   * The time at which the `MembershipRole` will expire.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * The time at which the `MembershipRole` will expire.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * The time at which the `MembershipRole` will expire.
   * @param expireTime expireTime or {@code null} for none
   */
  public ExpiryDetail setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  @Override
  public ExpiryDetail set(String fieldName, Object value) {
    return (ExpiryDetail) super.set(fieldName, value);
  }

  @Override
  public ExpiryDetail clone() {
    return (ExpiryDetail) super.clone();
  }

}
