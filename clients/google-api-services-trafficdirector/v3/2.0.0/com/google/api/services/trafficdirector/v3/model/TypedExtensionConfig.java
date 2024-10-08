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

package com.google.api.services.trafficdirector.v3.model;

/**
 * Message type for extension configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Traffic Director API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TypedExtensionConfig extends com.google.api.client.json.GenericJson {

  /**
   * The name of an extension. This is not used to select the extension, instead it serves the role
   * of an opaque identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The typed config for the extension. The type URL will be used to identify the extension. In the
   * case that the type URL is *xds.type.v3.TypedStruct* (or, for historical reasons,
   * *udpa.type.v1.TypedStruct*), the inner type URL of *TypedStruct* will be utilized. See the
   * :ref:`extension configuration overview ` for further details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> typedConfig;

  /**
   * The name of an extension. This is not used to select the extension, instead it serves the role
   * of an opaque identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of an extension. This is not used to select the extension, instead it serves the role
   * of an opaque identifier.
   * @param name name or {@code null} for none
   */
  public TypedExtensionConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The typed config for the extension. The type URL will be used to identify the extension. In the
   * case that the type URL is *xds.type.v3.TypedStruct* (or, for historical reasons,
   * *udpa.type.v1.TypedStruct*), the inner type URL of *TypedStruct* will be utilized. See the
   * :ref:`extension configuration overview ` for further details.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getTypedConfig() {
    return typedConfig;
  }

  /**
   * The typed config for the extension. The type URL will be used to identify the extension. In the
   * case that the type URL is *xds.type.v3.TypedStruct* (or, for historical reasons,
   * *udpa.type.v1.TypedStruct*), the inner type URL of *TypedStruct* will be utilized. See the
   * :ref:`extension configuration overview ` for further details.
   * @param typedConfig typedConfig or {@code null} for none
   */
  public TypedExtensionConfig setTypedConfig(java.util.Map<String, java.lang.Object> typedConfig) {
    this.typedConfig = typedConfig;
    return this;
  }

  @Override
  public TypedExtensionConfig set(String fieldName, Object value) {
    return (TypedExtensionConfig) super.set(fieldName, value);
  }

  @Override
  public TypedExtensionConfig clone() {
    return (TypedExtensionConfig) super.clone();
  }

}
