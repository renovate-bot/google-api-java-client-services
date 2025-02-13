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

package com.google.api.services.monitoring.v1.model;

/**
 * QueryExemplarsRequest holds all parameters of the Prometheus upstream API for querying exemplars.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryExemplarsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted
   * timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String end;

  /**
   * A PromQL query string. Query language documentation:
   * https://prometheus.io/docs/prometheus/latest/querying/basics/.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339
   * formatted timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String start;

  /**
   * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted
   * timestamp.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnd() {
    return end;
  }

  /**
   * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted
   * timestamp.
   * @param end end or {@code null} for none
   */
  public QueryExemplarsRequest setEnd(java.lang.String end) {
    this.end = end;
    return this;
  }

  /**
   * A PromQL query string. Query language documentation:
   * https://prometheus.io/docs/prometheus/latest/querying/basics/.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * A PromQL query string. Query language documentation:
   * https://prometheus.io/docs/prometheus/latest/querying/basics/.
   * @param query query or {@code null} for none
   */
  public QueryExemplarsRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339
   * formatted timestamp.
   * @return value or {@code null} for none
   */
  public java.lang.String getStart() {
    return start;
  }

  /**
   * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339
   * formatted timestamp.
   * @param start start or {@code null} for none
   */
  public QueryExemplarsRequest setStart(java.lang.String start) {
    this.start = start;
    return this;
  }

  @Override
  public QueryExemplarsRequest set(String fieldName, Object value) {
    return (QueryExemplarsRequest) super.set(fieldName, value);
  }

  @Override
  public QueryExemplarsRequest clone() {
    return (QueryExemplarsRequest) super.clone();
  }

}
