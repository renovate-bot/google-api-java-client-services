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

package com.google.api.services.migrationcenter.v1.model;

/**
 * PostgreSql setting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PostgreSqlSetting extends com.google.api.client.json.GenericJson {

  /**
   * Required. The setting boolean value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boolValue;

  /**
   * Required. The setting int value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long intValue;

  /**
   * Required. The setting real value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float realValue;

  /**
   * Required. The setting name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String setting;

  /**
   * Required. The setting source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * Required. The setting string value. Notice that enum values are stored as strings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringValue;

  /**
   * Optional. The setting unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * Required. The setting boolean value.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoolValue() {
    return boolValue;
  }

  /**
   * Required. The setting boolean value.
   * @param boolValue boolValue or {@code null} for none
   */
  public PostgreSqlSetting setBoolValue(java.lang.Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  /**
   * Required. The setting int value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIntValue() {
    return intValue;
  }

  /**
   * Required. The setting int value.
   * @param intValue intValue or {@code null} for none
   */
  public PostgreSqlSetting setIntValue(java.lang.Long intValue) {
    this.intValue = intValue;
    return this;
  }

  /**
   * Required. The setting real value.
   * @return value or {@code null} for none
   */
  public java.lang.Float getRealValue() {
    return realValue;
  }

  /**
   * Required. The setting real value.
   * @param realValue realValue or {@code null} for none
   */
  public PostgreSqlSetting setRealValue(java.lang.Float realValue) {
    this.realValue = realValue;
    return this;
  }

  /**
   * Required. The setting name.
   * @return value or {@code null} for none
   */
  public java.lang.String getSetting() {
    return setting;
  }

  /**
   * Required. The setting name.
   * @param setting setting or {@code null} for none
   */
  public PostgreSqlSetting setSetting(java.lang.String setting) {
    this.setting = setting;
    return this;
  }

  /**
   * Required. The setting source.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Required. The setting source.
   * @param source source or {@code null} for none
   */
  public PostgreSqlSetting setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * Required. The setting string value. Notice that enum values are stored as strings.
   * @return value or {@code null} for none
   */
  public java.lang.String getStringValue() {
    return stringValue;
  }

  /**
   * Required. The setting string value. Notice that enum values are stored as strings.
   * @param stringValue stringValue or {@code null} for none
   */
  public PostgreSqlSetting setStringValue(java.lang.String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  /**
   * Optional. The setting unit.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * Optional. The setting unit.
   * @param unit unit or {@code null} for none
   */
  public PostgreSqlSetting setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  @Override
  public PostgreSqlSetting set(String fieldName, Object value) {
    return (PostgreSqlSetting) super.set(fieldName, value);
  }

  @Override
  public PostgreSqlSetting clone() {
    return (PostgreSqlSetting) super.clone();
  }

}
