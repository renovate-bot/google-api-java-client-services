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
 * Inserts cells into a range, shifting the existing cells over or down.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InsertRangeRequest extends com.google.api.client.json.GenericJson {

  /**
   * The range to insert new cells into. The range is constrained to the current sheet boundaries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange range;

  /**
   * The dimension which will be shifted when inserting cells. If ROWS, existing cells will be
   * shifted down. If COLUMNS, existing cells will be shifted right.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shiftDimension;

  /**
   * The range to insert new cells into. The range is constrained to the current sheet boundaries.
   * @return value or {@code null} for none
   */
  public GridRange getRange() {
    return range;
  }

  /**
   * The range to insert new cells into. The range is constrained to the current sheet boundaries.
   * @param range range or {@code null} for none
   */
  public InsertRangeRequest setRange(GridRange range) {
    this.range = range;
    return this;
  }

  /**
   * The dimension which will be shifted when inserting cells. If ROWS, existing cells will be
   * shifted down. If COLUMNS, existing cells will be shifted right.
   * @return value or {@code null} for none
   */
  public java.lang.String getShiftDimension() {
    return shiftDimension;
  }

  /**
   * The dimension which will be shifted when inserting cells. If ROWS, existing cells will be
   * shifted down. If COLUMNS, existing cells will be shifted right.
   * @param shiftDimension shiftDimension or {@code null} for none
   */
  public InsertRangeRequest setShiftDimension(java.lang.String shiftDimension) {
    this.shiftDimension = shiftDimension;
    return this;
  }

  @Override
  public InsertRangeRequest set(String fieldName, Object value) {
    return (InsertRangeRequest) super.set(fieldName, value);
  }

  @Override
  public InsertRangeRequest clone() {
    return (InsertRangeRequest) super.clone();
  }

}
