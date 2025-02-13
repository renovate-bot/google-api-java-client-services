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

package com.google.api.services.androidpublisher.model;

/**
 * Request message for ActivateBasePlan.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ActivateBasePlanRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The unique base plan ID of the base plan to activate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String basePlanId;

  /**
   * Optional. The latency tolerance for the propagation of this product update. Defaults to
   * latency-sensitive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latencyTolerance;

  /**
   * Required. The parent app (package name) of the base plan to activate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * Required. The parent subscription (ID) of the base plan to activate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * Required. The unique base plan ID of the base plan to activate.
   * @return value or {@code null} for none
   */
  public java.lang.String getBasePlanId() {
    return basePlanId;
  }

  /**
   * Required. The unique base plan ID of the base plan to activate.
   * @param basePlanId basePlanId or {@code null} for none
   */
  public ActivateBasePlanRequest setBasePlanId(java.lang.String basePlanId) {
    this.basePlanId = basePlanId;
    return this;
  }

  /**
   * Optional. The latency tolerance for the propagation of this product update. Defaults to
   * latency-sensitive.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatencyTolerance() {
    return latencyTolerance;
  }

  /**
   * Optional. The latency tolerance for the propagation of this product update. Defaults to
   * latency-sensitive.
   * @param latencyTolerance latencyTolerance or {@code null} for none
   */
  public ActivateBasePlanRequest setLatencyTolerance(java.lang.String latencyTolerance) {
    this.latencyTolerance = latencyTolerance;
    return this;
  }

  /**
   * Required. The parent app (package name) of the base plan to activate.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * Required. The parent app (package name) of the base plan to activate.
   * @param packageName packageName or {@code null} for none
   */
  public ActivateBasePlanRequest setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Required. The parent subscription (ID) of the base plan to activate.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * Required. The parent subscription (ID) of the base plan to activate.
   * @param productId productId or {@code null} for none
   */
  public ActivateBasePlanRequest setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  @Override
  public ActivateBasePlanRequest set(String fieldName, Object value) {
    return (ActivateBasePlanRequest) super.set(fieldName, value);
  }

  @Override
  public ActivateBasePlanRequest clone() {
    return (ActivateBasePlanRequest) super.clone();
  }

}
