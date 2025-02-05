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

package com.google.api.services.cloudbilling.v1beta.model;

/**
 * Encapsulates the latest price for a billing account SKU.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice extends com.google.api.client.json.GenericJson {

  /**
   * ISO-4217 currency code for the price.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * Resource name for the latest billing account price.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Background information on the origin of the price.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBillingBillingaccountpricesV1betaPriceReason priceReason;

  /**
   * Rate price metadata. Billing account SKUs with `Rate` price are offered by pricing tiers. The
   * price can have 1 or more rate pricing tiers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBillingBillingaccountpricesV1betaRate rate;

  /**
   * Type of the price. The possible values are: ["unspecified", "rate"].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueType;

  /**
   * ISO-4217 currency code for the price.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * ISO-4217 currency code for the price.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Resource name for the latest billing account price.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name for the latest billing account price.
   * @param name name or {@code null} for none
   */
  public GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Background information on the origin of the price.
   * @return value or {@code null} for none
   */
  public GoogleCloudBillingBillingaccountpricesV1betaPriceReason getPriceReason() {
    return priceReason;
  }

  /**
   * Background information on the origin of the price.
   * @param priceReason priceReason or {@code null} for none
   */
  public GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice setPriceReason(GoogleCloudBillingBillingaccountpricesV1betaPriceReason priceReason) {
    this.priceReason = priceReason;
    return this;
  }

  /**
   * Rate price metadata. Billing account SKUs with `Rate` price are offered by pricing tiers. The
   * price can have 1 or more rate pricing tiers.
   * @return value or {@code null} for none
   */
  public GoogleCloudBillingBillingaccountpricesV1betaRate getRate() {
    return rate;
  }

  /**
   * Rate price metadata. Billing account SKUs with `Rate` price are offered by pricing tiers. The
   * price can have 1 or more rate pricing tiers.
   * @param rate rate or {@code null} for none
   */
  public GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice setRate(GoogleCloudBillingBillingaccountpricesV1betaRate rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Type of the price. The possible values are: ["unspecified", "rate"].
   * @return value or {@code null} for none
   */
  public java.lang.String getValueType() {
    return valueType;
  }

  /**
   * Type of the price. The possible values are: ["unspecified", "rate"].
   * @param valueType valueType or {@code null} for none
   */
  public GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice setValueType(java.lang.String valueType) {
    this.valueType = valueType;
    return this;
  }

  @Override
  public GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice set(String fieldName, Object value) {
    return (GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice clone() {
    return (GoogleCloudBillingBillingaccountpricesV1betaBillingAccountPrice) super.clone();
  }

}
