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
 * Metadata type for the operation returned by UpdateInstance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateInstanceMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The time at which this operation was cancelled. If set, this operation is in the process of
   * undoing itself (which is guaranteed to succeed) and cannot be cancelled again.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String cancelTime;

  /**
   * The time at which this operation failed or was completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The expected fulfillment period of this update operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expectedFulfillmentPeriod;

  /**
   * The desired end state of the update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Instance instance;

  /**
   * The time at which UpdateInstance request was received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The time at which this operation was cancelled. If set, this operation is in the process of
   * undoing itself (which is guaranteed to succeed) and cannot be cancelled again.
   * @return value or {@code null} for none
   */
  public String getCancelTime() {
    return cancelTime;
  }

  /**
   * The time at which this operation was cancelled. If set, this operation is in the process of
   * undoing itself (which is guaranteed to succeed) and cannot be cancelled again.
   * @param cancelTime cancelTime or {@code null} for none
   */
  public UpdateInstanceMetadata setCancelTime(String cancelTime) {
    this.cancelTime = cancelTime;
    return this;
  }

  /**
   * The time at which this operation failed or was completed successfully.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time at which this operation failed or was completed successfully.
   * @param endTime endTime or {@code null} for none
   */
  public UpdateInstanceMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The expected fulfillment period of this update operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getExpectedFulfillmentPeriod() {
    return expectedFulfillmentPeriod;
  }

  /**
   * The expected fulfillment period of this update operation.
   * @param expectedFulfillmentPeriod expectedFulfillmentPeriod or {@code null} for none
   */
  public UpdateInstanceMetadata setExpectedFulfillmentPeriod(java.lang.String expectedFulfillmentPeriod) {
    this.expectedFulfillmentPeriod = expectedFulfillmentPeriod;
    return this;
  }

  /**
   * The desired end state of the update.
   * @return value or {@code null} for none
   */
  public Instance getInstance() {
    return instance;
  }

  /**
   * The desired end state of the update.
   * @param instance instance or {@code null} for none
   */
  public UpdateInstanceMetadata setInstance(Instance instance) {
    this.instance = instance;
    return this;
  }

  /**
   * The time at which UpdateInstance request was received.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The time at which UpdateInstance request was received.
   * @param startTime startTime or {@code null} for none
   */
  public UpdateInstanceMetadata setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public UpdateInstanceMetadata set(String fieldName, Object value) {
    return (UpdateInstanceMetadata) super.set(fieldName, value);
  }

  @Override
  public UpdateInstanceMetadata clone() {
    return (UpdateInstanceMetadata) super.clone();
  }

}
