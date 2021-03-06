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

package com.google.api.services.tagmanager.model;

/**
 * Represents a child container of a Zone.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ZoneChildContainer extends com.google.api.client.json.GenericJson {

  /**
   * The zone's nickname for the child container.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nickname;

  /**
   * The child container's public id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publicId;

  /**
   * The zone's nickname for the child container.
   * @return value or {@code null} for none
   */
  public java.lang.String getNickname() {
    return nickname;
  }

  /**
   * The zone's nickname for the child container.
   * @param nickname nickname or {@code null} for none
   */
  public ZoneChildContainer setNickname(java.lang.String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * The child container's public id.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublicId() {
    return publicId;
  }

  /**
   * The child container's public id.
   * @param publicId publicId or {@code null} for none
   */
  public ZoneChildContainer setPublicId(java.lang.String publicId) {
    this.publicId = publicId;
    return this;
  }

  @Override
  public ZoneChildContainer set(String fieldName, Object value) {
    return (ZoneChildContainer) super.set(fieldName, value);
  }

  @Override
  public ZoneChildContainer clone() {
    return (ZoneChildContainer) super.clone();
  }

}
