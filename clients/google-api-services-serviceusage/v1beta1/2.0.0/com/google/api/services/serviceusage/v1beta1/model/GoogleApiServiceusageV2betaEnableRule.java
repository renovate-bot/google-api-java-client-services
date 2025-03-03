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

package com.google.api.services.serviceusage.v1beta1.model;

/**
 * The consumer policy rule that defines enabled services, groups, and categories.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleApiServiceusageV2betaEnableRule extends com.google.api.client.json.GenericJson {

  /**
   * The names of the services that are enabled. Example: `services/storage.googleapis.com`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> services;

  /**
   * The names of the services that are enabled. Example: `services/storage.googleapis.com`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getServices() {
    return services;
  }

  /**
   * The names of the services that are enabled. Example: `services/storage.googleapis.com`.
   * @param services services or {@code null} for none
   */
  public GoogleApiServiceusageV2betaEnableRule setServices(java.util.List<java.lang.String> services) {
    this.services = services;
    return this;
  }

  @Override
  public GoogleApiServiceusageV2betaEnableRule set(String fieldName, Object value) {
    return (GoogleApiServiceusageV2betaEnableRule) super.set(fieldName, value);
  }

  @Override
  public GoogleApiServiceusageV2betaEnableRule clone() {
    return (GoogleApiServiceusageV2betaEnableRule) super.clone();
  }

}
