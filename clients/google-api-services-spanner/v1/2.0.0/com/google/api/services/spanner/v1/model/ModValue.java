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

package com.google.api.services.spanner.v1.model;

/**
 * Returns the value and associated metadata for a particular field of the Mod.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModValue extends com.google.api.client.json.GenericJson {

  /**
   * Index within the repeated column_metadata field, to obtain the column metadata for the column
   * that was modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer columnMetadataIndex;

  /**
   * The value of the column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object value;

  /**
   * Index within the repeated column_metadata field, to obtain the column metadata for the column
   * that was modified.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumnMetadataIndex() {
    return columnMetadataIndex;
  }

  /**
   * Index within the repeated column_metadata field, to obtain the column metadata for the column
   * that was modified.
   * @param columnMetadataIndex columnMetadataIndex or {@code null} for none
   */
  public ModValue setColumnMetadataIndex(java.lang.Integer columnMetadataIndex) {
    this.columnMetadataIndex = columnMetadataIndex;
    return this;
  }

  /**
   * The value of the column.
   * @return value or {@code null} for none
   */
  public java.lang.Object getValue() {
    return value;
  }

  /**
   * The value of the column.
   * @param value value or {@code null} for none
   */
  public ModValue setValue(java.lang.Object value) {
    this.value = value;
    return this;
  }

  @Override
  public ModValue set(String fieldName, Object value) {
    return (ModValue) super.set(fieldName, value);
  }

  @Override
  public ModValue clone() {
    return (ModValue) super.clone();
  }

}
