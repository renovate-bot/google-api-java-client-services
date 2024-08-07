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
 * The status of cancelling a single data source object refresh.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CancelDataSourceRefreshStatus extends com.google.api.client.json.GenericJson {

  /**
   * Reference to the data source object whose refresh is being cancelled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataSourceObjectReference reference;

  /**
   * The cancellation status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RefreshCancellationStatus refreshCancellationStatus;

  /**
   * Reference to the data source object whose refresh is being cancelled.
   * @return value or {@code null} for none
   */
  public DataSourceObjectReference getReference() {
    return reference;
  }

  /**
   * Reference to the data source object whose refresh is being cancelled.
   * @param reference reference or {@code null} for none
   */
  public CancelDataSourceRefreshStatus setReference(DataSourceObjectReference reference) {
    this.reference = reference;
    return this;
  }

  /**
   * The cancellation status.
   * @return value or {@code null} for none
   */
  public RefreshCancellationStatus getRefreshCancellationStatus() {
    return refreshCancellationStatus;
  }

  /**
   * The cancellation status.
   * @param refreshCancellationStatus refreshCancellationStatus or {@code null} for none
   */
  public CancelDataSourceRefreshStatus setRefreshCancellationStatus(RefreshCancellationStatus refreshCancellationStatus) {
    this.refreshCancellationStatus = refreshCancellationStatus;
    return this;
  }

  @Override
  public CancelDataSourceRefreshStatus set(String fieldName, Object value) {
    return (CancelDataSourceRefreshStatus) super.set(fieldName, value);
  }

  @Override
  public CancelDataSourceRefreshStatus clone() {
    return (CancelDataSourceRefreshStatus) super.clone();
  }

}
