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

package com.google.api.services.language.v1.model;

/**
 * Metrics for Tables regression problems.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class XPSTablesRegressionMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Mean absolute error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double meanAbsoluteError;

  /**
   * Mean absolute percentage error, only set if all of the target column's values are positive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double meanAbsolutePercentageError;

  /**
   * R squared.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double rSquared;

  /**
   * A list of actual versus predicted points for the model being evaluated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<XPSRegressionMetricsEntry> regressionMetricsEntries;

  static {
    // hack to force ProGuard to consider XPSRegressionMetricsEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(XPSRegressionMetricsEntry.class);
  }

  /**
   * Root mean squared error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double rootMeanSquaredError;

  /**
   * Root mean squared log error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double rootMeanSquaredLogError;

  /**
   * Mean absolute error.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMeanAbsoluteError() {
    return meanAbsoluteError;
  }

  /**
   * Mean absolute error.
   * @param meanAbsoluteError meanAbsoluteError or {@code null} for none
   */
  public XPSTablesRegressionMetrics setMeanAbsoluteError(java.lang.Double meanAbsoluteError) {
    this.meanAbsoluteError = meanAbsoluteError;
    return this;
  }

  /**
   * Mean absolute percentage error, only set if all of the target column's values are positive.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMeanAbsolutePercentageError() {
    return meanAbsolutePercentageError;
  }

  /**
   * Mean absolute percentage error, only set if all of the target column's values are positive.
   * @param meanAbsolutePercentageError meanAbsolutePercentageError or {@code null} for none
   */
  public XPSTablesRegressionMetrics setMeanAbsolutePercentageError(java.lang.Double meanAbsolutePercentageError) {
    this.meanAbsolutePercentageError = meanAbsolutePercentageError;
    return this;
  }

  /**
   * R squared.
   * @return value or {@code null} for none
   */
  public java.lang.Double getRSquared() {
    return rSquared;
  }

  /**
   * R squared.
   * @param rSquared rSquared or {@code null} for none
   */
  public XPSTablesRegressionMetrics setRSquared(java.lang.Double rSquared) {
    this.rSquared = rSquared;
    return this;
  }

  /**
   * A list of actual versus predicted points for the model being evaluated.
   * @return value or {@code null} for none
   */
  public java.util.List<XPSRegressionMetricsEntry> getRegressionMetricsEntries() {
    return regressionMetricsEntries;
  }

  /**
   * A list of actual versus predicted points for the model being evaluated.
   * @param regressionMetricsEntries regressionMetricsEntries or {@code null} for none
   */
  public XPSTablesRegressionMetrics setRegressionMetricsEntries(java.util.List<XPSRegressionMetricsEntry> regressionMetricsEntries) {
    this.regressionMetricsEntries = regressionMetricsEntries;
    return this;
  }

  /**
   * Root mean squared error.
   * @return value or {@code null} for none
   */
  public java.lang.Double getRootMeanSquaredError() {
    return rootMeanSquaredError;
  }

  /**
   * Root mean squared error.
   * @param rootMeanSquaredError rootMeanSquaredError or {@code null} for none
   */
  public XPSTablesRegressionMetrics setRootMeanSquaredError(java.lang.Double rootMeanSquaredError) {
    this.rootMeanSquaredError = rootMeanSquaredError;
    return this;
  }

  /**
   * Root mean squared log error.
   * @return value or {@code null} for none
   */
  public java.lang.Double getRootMeanSquaredLogError() {
    return rootMeanSquaredLogError;
  }

  /**
   * Root mean squared log error.
   * @param rootMeanSquaredLogError rootMeanSquaredLogError or {@code null} for none
   */
  public XPSTablesRegressionMetrics setRootMeanSquaredLogError(java.lang.Double rootMeanSquaredLogError) {
    this.rootMeanSquaredLogError = rootMeanSquaredLogError;
    return this;
  }

  @Override
  public XPSTablesRegressionMetrics set(String fieldName, Object value) {
    return (XPSTablesRegressionMetrics) super.set(fieldName, value);
  }

  @Override
  public XPSTablesRegressionMetrics clone() {
    return (XPSTablesRegressionMetrics) super.clone();
  }

}
