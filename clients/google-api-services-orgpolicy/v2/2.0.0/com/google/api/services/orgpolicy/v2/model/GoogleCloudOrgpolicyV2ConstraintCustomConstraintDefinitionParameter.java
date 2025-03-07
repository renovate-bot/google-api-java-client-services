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

package com.google.api.services.orgpolicy.v2.model;

/**
 * Defines a parameter structure.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Organization Policy API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameter extends com.google.api.client.json.GenericJson {

  /**
   * Sets the value of the parameter in an assignment if no value is given.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object defaultValue;

  /**
   * Determines the parameter's value structure. For example, `LIST` can be specified by defining
   * `type: LIST`, and `item: STRING`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String item;

  /**
   * Defines subproperties primarily used by the UI to display user-friendly information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameterMetadata metadata;

  /**
   * Type of the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Provides a CEL expression to specify the acceptable parameter values during assignment. For
   * example, parameterName in ("parameterValue1", "parameterValue2")
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String validValuesExpr;

  /**
   * Sets the value of the parameter in an assignment if no value is given.
   * @return value or {@code null} for none
   */
  public java.lang.Object getDefaultValue() {
    return defaultValue;
  }

  /**
   * Sets the value of the parameter in an assignment if no value is given.
   * @param defaultValue defaultValue or {@code null} for none
   */
  public GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameter setDefaultValue(java.lang.Object defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Determines the parameter's value structure. For example, `LIST` can be specified by defining
   * `type: LIST`, and `item: STRING`.
   * @return value or {@code null} for none
   */
  public java.lang.String getItem() {
    return item;
  }

  /**
   * Determines the parameter's value structure. For example, `LIST` can be specified by defining
   * `type: LIST`, and `item: STRING`.
   * @param item item or {@code null} for none
   */
  public GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameter setItem(java.lang.String item) {
    this.item = item;
    return this;
  }

  /**
   * Defines subproperties primarily used by the UI to display user-friendly information.
   * @return value or {@code null} for none
   */
  public GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameterMetadata getMetadata() {
    return metadata;
  }

  /**
   * Defines subproperties primarily used by the UI to display user-friendly information.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameter setMetadata(GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameterMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Type of the parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of the parameter.
   * @param type type or {@code null} for none
   */
  public GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameter setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Provides a CEL expression to specify the acceptable parameter values during assignment. For
   * example, parameterName in ("parameterValue1", "parameterValue2")
   * @return value or {@code null} for none
   */
  public java.lang.String getValidValuesExpr() {
    return validValuesExpr;
  }

  /**
   * Provides a CEL expression to specify the acceptable parameter values during assignment. For
   * example, parameterName in ("parameterValue1", "parameterValue2")
   * @param validValuesExpr validValuesExpr or {@code null} for none
   */
  public GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameter setValidValuesExpr(java.lang.String validValuesExpr) {
    this.validValuesExpr = validValuesExpr;
    return this;
  }

  @Override
  public GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameter set(String fieldName, Object value) {
    return (GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameter) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameter clone() {
    return (GoogleCloudOrgpolicyV2ConstraintCustomConstraintDefinitionParameter) super.clone();
  }

}
