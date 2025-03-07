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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * This field allows restricts to be based on numeric comparisons rather than categorical tokens.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction extends com.google.api.client.json.GenericJson {

  /**
   * The namespace of this restriction. e.g.: cost.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespace;

  /**
   * This MUST be specified for queries and must NOT be specified for datapoints.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String op;

  /**
   * Represents 64 bit float.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double valueDouble;

  /**
   * Represents 32 bit float.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float valueFloat;

  /**
   * Represents 64 bit integer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long valueInt;

  /**
   * The namespace of this restriction. e.g.: cost.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespace() {
    return namespace;
  }

  /**
   * The namespace of this restriction. e.g.: cost.
   * @param namespace namespace or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * This MUST be specified for queries and must NOT be specified for datapoints.
   * @return value or {@code null} for none
   */
  public java.lang.String getOp() {
    return op;
  }

  /**
   * This MUST be specified for queries and must NOT be specified for datapoints.
   * @param op op or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction setOp(java.lang.String op) {
    this.op = op;
    return this;
  }

  /**
   * Represents 64 bit float.
   * @return value or {@code null} for none
   */
  public java.lang.Double getValueDouble() {
    return valueDouble;
  }

  /**
   * Represents 64 bit float.
   * @param valueDouble valueDouble or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction setValueDouble(java.lang.Double valueDouble) {
    this.valueDouble = valueDouble;
    return this;
  }

  /**
   * Represents 32 bit float.
   * @return value or {@code null} for none
   */
  public java.lang.Float getValueFloat() {
    return valueFloat;
  }

  /**
   * Represents 32 bit float.
   * @param valueFloat valueFloat or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction setValueFloat(java.lang.Float valueFloat) {
    this.valueFloat = valueFloat;
    return this;
  }

  /**
   * Represents 64 bit integer.
   * @return value or {@code null} for none
   */
  public java.lang.Long getValueInt() {
    return valueInt;
  }

  /**
   * Represents 64 bit integer.
   * @param valueInt valueInt or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction setValueInt(java.lang.Long valueInt) {
    this.valueInt = valueInt;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction clone() {
    return (GoogleCloudAiplatformV1beta1IndexDatapointNumericRestriction) super.clone();
  }

}
