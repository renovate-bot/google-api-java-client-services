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

package com.google.api.services.analyticsdata.v1beta.model;

/**
 * The response report table corresponding to a request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RunReportResponse extends com.google.api.client.json.GenericJson {

  /**
   * Describes dimension columns. The number of DimensionHeaders and ordering of DimensionHeaders
   * matches the dimensions present in rows.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DimensionHeader> dimensionHeaders;

  static {
    // hack to force ProGuard to consider DimensionHeader used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DimensionHeader.class);
  }

  /**
   * Identifies what kind of resource this message is. This `kind` is always the fixed string
   * "analyticsData#runReport". Useful to distinguish between response types in JSON.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * If requested, the maximum values of metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Row> maximums;

  static {
    // hack to force ProGuard to consider Row used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Row.class);
  }

  /**
   * Metadata for the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResponseMetaData metadata;

  /**
   * Describes metric columns. The number of MetricHeaders and ordering of MetricHeaders matches the
   * metrics present in rows.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricHeader> metricHeaders;

  static {
    // hack to force ProGuard to consider MetricHeader used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MetricHeader.class);
  }

  /**
   * If requested, the minimum values of metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Row> minimums;

  static {
    // hack to force ProGuard to consider Row used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Row.class);
  }

  /**
   * This Google Analytics property's quota state including this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PropertyQuota propertyQuota;

  /**
   * The total number of rows in the query result. `rowCount` is independent of the number of rows
   * returned in the response, the `limit` request parameter, and the `offset` request parameter.
   * For example if a query returns 175 rows and includes `limit` of 50 in the API request, the
   * response will contain `rowCount` of 175 but only 50 rows. To learn more about this pagination
   * parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1
   * /basics#pagination).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rowCount;

  /**
   * Rows of dimension value combinations and metric values in the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Row> rows;

  static {
    // hack to force ProGuard to consider Row used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Row.class);
  }

  /**
   * If requested, the totaled values of metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Row> totals;

  static {
    // hack to force ProGuard to consider Row used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Row.class);
  }

  /**
   * Describes dimension columns. The number of DimensionHeaders and ordering of DimensionHeaders
   * matches the dimensions present in rows.
   * @return value or {@code null} for none
   */
  public java.util.List<DimensionHeader> getDimensionHeaders() {
    return dimensionHeaders;
  }

  /**
   * Describes dimension columns. The number of DimensionHeaders and ordering of DimensionHeaders
   * matches the dimensions present in rows.
   * @param dimensionHeaders dimensionHeaders or {@code null} for none
   */
  public RunReportResponse setDimensionHeaders(java.util.List<DimensionHeader> dimensionHeaders) {
    this.dimensionHeaders = dimensionHeaders;
    return this;
  }

  /**
   * Identifies what kind of resource this message is. This `kind` is always the fixed string
   * "analyticsData#runReport". Useful to distinguish between response types in JSON.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this message is. This `kind` is always the fixed string
   * "analyticsData#runReport". Useful to distinguish between response types in JSON.
   * @param kind kind or {@code null} for none
   */
  public RunReportResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * If requested, the maximum values of metrics.
   * @return value or {@code null} for none
   */
  public java.util.List<Row> getMaximums() {
    return maximums;
  }

  /**
   * If requested, the maximum values of metrics.
   * @param maximums maximums or {@code null} for none
   */
  public RunReportResponse setMaximums(java.util.List<Row> maximums) {
    this.maximums = maximums;
    return this;
  }

  /**
   * Metadata for the report.
   * @return value or {@code null} for none
   */
  public ResponseMetaData getMetadata() {
    return metadata;
  }

  /**
   * Metadata for the report.
   * @param metadata metadata or {@code null} for none
   */
  public RunReportResponse setMetadata(ResponseMetaData metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Describes metric columns. The number of MetricHeaders and ordering of MetricHeaders matches the
   * metrics present in rows.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricHeader> getMetricHeaders() {
    return metricHeaders;
  }

  /**
   * Describes metric columns. The number of MetricHeaders and ordering of MetricHeaders matches the
   * metrics present in rows.
   * @param metricHeaders metricHeaders or {@code null} for none
   */
  public RunReportResponse setMetricHeaders(java.util.List<MetricHeader> metricHeaders) {
    this.metricHeaders = metricHeaders;
    return this;
  }

  /**
   * If requested, the minimum values of metrics.
   * @return value or {@code null} for none
   */
  public java.util.List<Row> getMinimums() {
    return minimums;
  }

  /**
   * If requested, the minimum values of metrics.
   * @param minimums minimums or {@code null} for none
   */
  public RunReportResponse setMinimums(java.util.List<Row> minimums) {
    this.minimums = minimums;
    return this;
  }

  /**
   * This Google Analytics property's quota state including this request.
   * @return value or {@code null} for none
   */
  public PropertyQuota getPropertyQuota() {
    return propertyQuota;
  }

  /**
   * This Google Analytics property's quota state including this request.
   * @param propertyQuota propertyQuota or {@code null} for none
   */
  public RunReportResponse setPropertyQuota(PropertyQuota propertyQuota) {
    this.propertyQuota = propertyQuota;
    return this;
  }

  /**
   * The total number of rows in the query result. `rowCount` is independent of the number of rows
   * returned in the response, the `limit` request parameter, and the `offset` request parameter.
   * For example if a query returns 175 rows and includes `limit` of 50 in the API request, the
   * response will contain `rowCount` of 175 but only 50 rows. To learn more about this pagination
   * parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1
   * /basics#pagination).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowCount() {
    return rowCount;
  }

  /**
   * The total number of rows in the query result. `rowCount` is independent of the number of rows
   * returned in the response, the `limit` request parameter, and the `offset` request parameter.
   * For example if a query returns 175 rows and includes `limit` of 50 in the API request, the
   * response will contain `rowCount` of 175 but only 50 rows. To learn more about this pagination
   * parameter, see [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1
   * /basics#pagination).
   * @param rowCount rowCount or {@code null} for none
   */
  public RunReportResponse setRowCount(java.lang.Integer rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  /**
   * Rows of dimension value combinations and metric values in the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Row> getRows() {
    return rows;
  }

  /**
   * Rows of dimension value combinations and metric values in the report.
   * @param rows rows or {@code null} for none
   */
  public RunReportResponse setRows(java.util.List<Row> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * If requested, the totaled values of metrics.
   * @return value or {@code null} for none
   */
  public java.util.List<Row> getTotals() {
    return totals;
  }

  /**
   * If requested, the totaled values of metrics.
   * @param totals totals or {@code null} for none
   */
  public RunReportResponse setTotals(java.util.List<Row> totals) {
    this.totals = totals;
    return this;
  }

  @Override
  public RunReportResponse set(String fieldName, Object value) {
    return (RunReportResponse) super.set(fieldName, value);
  }

  @Override
  public RunReportResponse clone() {
    return (RunReportResponse) super.clone();
  }

}
