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

package com.google.api.services.fitness.model;

/**
 * Model definition for Application.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fitness API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Application extends com.google.api.client.json.GenericJson {

  /**
   * An optional URI that can be used to link back to the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detailsUrl;

  /**
   * The name of this application. This is required for REST clients, but we do not enforce
   * uniqueness of this name. It is provided as a matter of convenience for other developers who
   * would like to identify which REST created an Application or Data Source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Package name for this application. This is used as a unique identifier when created by Android
   * applications, but cannot be specified by REST clients. REST clients will have their developer
   * project number reflected into the Data Source data stream IDs, instead of the packageName.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * Version of the application. You should update this field whenever the application changes in a
   * way that affects the computation of the data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * An optional URI that can be used to link back to the application.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetailsUrl() {
    return detailsUrl;
  }

  /**
   * An optional URI that can be used to link back to the application.
   * @param detailsUrl detailsUrl or {@code null} for none
   */
  public Application setDetailsUrl(java.lang.String detailsUrl) {
    this.detailsUrl = detailsUrl;
    return this;
  }

  /**
   * The name of this application. This is required for REST clients, but we do not enforce
   * uniqueness of this name. It is provided as a matter of convenience for other developers who
   * would like to identify which REST created an Application or Data Source.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of this application. This is required for REST clients, but we do not enforce
   * uniqueness of this name. It is provided as a matter of convenience for other developers who
   * would like to identify which REST created an Application or Data Source.
   * @param name name or {@code null} for none
   */
  public Application setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Package name for this application. This is used as a unique identifier when created by Android
   * applications, but cannot be specified by REST clients. REST clients will have their developer
   * project number reflected into the Data Source data stream IDs, instead of the packageName.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * Package name for this application. This is used as a unique identifier when created by Android
   * applications, but cannot be specified by REST clients. REST clients will have their developer
   * project number reflected into the Data Source data stream IDs, instead of the packageName.
   * @param packageName packageName or {@code null} for none
   */
  public Application setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Version of the application. You should update this field whenever the application changes in a
   * way that affects the computation of the data.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Version of the application. You should update this field whenever the application changes in a
   * way that affects the computation of the data.
   * @param version version or {@code null} for none
   */
  public Application setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public Application set(String fieldName, Object value) {
    return (Application) super.set(fieldName, value);
  }

  @Override
  public Application clone() {
    return (Application) super.clone();
  }

}
