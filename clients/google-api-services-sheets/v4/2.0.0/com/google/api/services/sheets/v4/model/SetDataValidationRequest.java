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

package com.google.api.services.sheets.v4.model;

/**
 * Sets a data validation rule to every cell in the range. To clear validation in a range, call this
 * with no rule specified.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SetDataValidationRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If true, the data validation rule will be applied to the filtered rows as well.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean filteredRowsIncluded;

  /**
   * The range the data validation rule should apply to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange range;

  /**
   * The data validation rule to set on each cell in the range, or empty to clear the data
   * validation in the range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataValidationRule rule;

  /**
   * Optional. If true, the data validation rule will be applied to the filtered rows as well.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFilteredRowsIncluded() {
    return filteredRowsIncluded;
  }

  /**
   * Optional. If true, the data validation rule will be applied to the filtered rows as well.
   * @param filteredRowsIncluded filteredRowsIncluded or {@code null} for none
   */
  public SetDataValidationRequest setFilteredRowsIncluded(java.lang.Boolean filteredRowsIncluded) {
    this.filteredRowsIncluded = filteredRowsIncluded;
    return this;
  }

  /**
   * The range the data validation rule should apply to.
   * @return value or {@code null} for none
   */
  public GridRange getRange() {
    return range;
  }

  /**
   * The range the data validation rule should apply to.
   * @param range range or {@code null} for none
   */
  public SetDataValidationRequest setRange(GridRange range) {
    this.range = range;
    return this;
  }

  /**
   * The data validation rule to set on each cell in the range, or empty to clear the data
   * validation in the range.
   * @return value or {@code null} for none
   */
  public DataValidationRule getRule() {
    return rule;
  }

  /**
   * The data validation rule to set on each cell in the range, or empty to clear the data
   * validation in the range.
   * @param rule rule or {@code null} for none
   */
  public SetDataValidationRequest setRule(DataValidationRule rule) {
    this.rule = rule;
    return this;
  }

  @Override
  public SetDataValidationRequest set(String fieldName, Object value) {
    return (SetDataValidationRequest) super.set(fieldName, value);
  }

  @Override
  public SetDataValidationRequest clone() {
    return (SetDataValidationRequest) super.clone();
  }

}
