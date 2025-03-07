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

package com.google.api.services.connectors.v1.model;

/**
 * Resource definition
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Resource extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Template to uniquely represent a Google Cloud resource in a format IAM expects This
   * is a template that can have references to other values provided in the config variable
   * template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pathTemplate;

  /**
   * Optional. Different types of resource supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Optional. Template to uniquely represent a Google Cloud resource in a format IAM expects This
   * is a template that can have references to other values provided in the config variable
   * template.
   * @return value or {@code null} for none
   */
  public java.lang.String getPathTemplate() {
    return pathTemplate;
  }

  /**
   * Optional. Template to uniquely represent a Google Cloud resource in a format IAM expects This
   * is a template that can have references to other values provided in the config variable
   * template.
   * @param pathTemplate pathTemplate or {@code null} for none
   */
  public Resource setPathTemplate(java.lang.String pathTemplate) {
    this.pathTemplate = pathTemplate;
    return this;
  }

  /**
   * Optional. Different types of resource supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Optional. Different types of resource supported.
   * @param type type or {@code null} for none
   */
  public Resource setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Resource set(String fieldName, Object value) {
    return (Resource) super.set(fieldName, value);
  }

  @Override
  public Resource clone() {
    return (Resource) super.clone();
  }

}
