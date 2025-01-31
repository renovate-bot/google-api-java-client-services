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

package com.google.api.services.doubleclickbidmanager.model;

/**
 * Settings on when and how frequently to run a query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QuerySchedule extends com.google.api.client.json.GenericJson {

  /**
   * The date on which to end the scheduled runs. This field is required if frequency is not set to
   * `ONE_TIME`. Otherwise, it will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date endDate;

  /**
   * How frequently to run the query. If set to `ONE_TIME`, the query will only be run when
   * queries.run is called.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String frequency;

  /**
   * The canonical code for the timezone the query schedule is based on. Scheduled runs are usually
   * conducted in the morning of a given day. Defaults to `America/New_York`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextRunTimezoneCode;

  /**
   * The date on which to begin the scheduled runs. This field is required if frequency is not set
   * to `ONE_TIME`. Otherwise, it will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date startDate;

  /**
   * The date on which to end the scheduled runs. This field is required if frequency is not set to
   * `ONE_TIME`. Otherwise, it will be ignored.
   * @return value or {@code null} for none
   */
  public Date getEndDate() {
    return endDate;
  }

  /**
   * The date on which to end the scheduled runs. This field is required if frequency is not set to
   * `ONE_TIME`. Otherwise, it will be ignored.
   * @param endDate endDate or {@code null} for none
   */
  public QuerySchedule setEndDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * How frequently to run the query. If set to `ONE_TIME`, the query will only be run when
   * queries.run is called.
   * @return value or {@code null} for none
   */
  public java.lang.String getFrequency() {
    return frequency;
  }

  /**
   * How frequently to run the query. If set to `ONE_TIME`, the query will only be run when
   * queries.run is called.
   * @param frequency frequency or {@code null} for none
   */
  public QuerySchedule setFrequency(java.lang.String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * The canonical code for the timezone the query schedule is based on. Scheduled runs are usually
   * conducted in the morning of a given day. Defaults to `America/New_York`.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextRunTimezoneCode() {
    return nextRunTimezoneCode;
  }

  /**
   * The canonical code for the timezone the query schedule is based on. Scheduled runs are usually
   * conducted in the morning of a given day. Defaults to `America/New_York`.
   * @param nextRunTimezoneCode nextRunTimezoneCode or {@code null} for none
   */
  public QuerySchedule setNextRunTimezoneCode(java.lang.String nextRunTimezoneCode) {
    this.nextRunTimezoneCode = nextRunTimezoneCode;
    return this;
  }

  /**
   * The date on which to begin the scheduled runs. This field is required if frequency is not set
   * to `ONE_TIME`. Otherwise, it will be ignored.
   * @return value or {@code null} for none
   */
  public Date getStartDate() {
    return startDate;
  }

  /**
   * The date on which to begin the scheduled runs. This field is required if frequency is not set
   * to `ONE_TIME`. Otherwise, it will be ignored.
   * @param startDate startDate or {@code null} for none
   */
  public QuerySchedule setStartDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public QuerySchedule set(String fieldName, Object value) {
    return (QuerySchedule) super.set(fieldName, value);
  }

  @Override
  public QuerySchedule clone() {
    return (QuerySchedule) super.clone();
  }

}
