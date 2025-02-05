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

package com.google.api.services.analyticsadmin.v1beta.model;

/**
 * A virtual resource representing an overview of an account and all its child Google Analytics
 * properties.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1betaAccountSummary extends com.google.api.client.json.GenericJson {

  /**
   * Resource name of account referred to by this account summary Format: accounts/{account_id}
   * Example: "accounts/1000"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String account;

  /**
   * Display name for the account referred to in this account summary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Resource name for this account summary. Format: accountSummaries/{account_id} Example:
   * "accountSummaries/1000"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * List of summaries for child accounts of this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAnalyticsAdminV1betaPropertySummary> propertySummaries;

  /**
   * Resource name of account referred to by this account summary Format: accounts/{account_id}
   * Example: "accounts/1000"
   * @return value or {@code null} for none
   */
  public java.lang.String getAccount() {
    return account;
  }

  /**
   * Resource name of account referred to by this account summary Format: accounts/{account_id}
   * Example: "accounts/1000"
   * @param account account or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaAccountSummary setAccount(java.lang.String account) {
    this.account = account;
    return this;
  }

  /**
   * Display name for the account referred to in this account summary.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name for the account referred to in this account summary.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaAccountSummary setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Resource name for this account summary. Format: accountSummaries/{account_id} Example:
   * "accountSummaries/1000"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name for this account summary. Format: accountSummaries/{account_id} Example:
   * "accountSummaries/1000"
   * @param name name or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaAccountSummary setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * List of summaries for child accounts of this account.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAnalyticsAdminV1betaPropertySummary> getPropertySummaries() {
    return propertySummaries;
  }

  /**
   * List of summaries for child accounts of this account.
   * @param propertySummaries propertySummaries or {@code null} for none
   */
  public GoogleAnalyticsAdminV1betaAccountSummary setPropertySummaries(java.util.List<GoogleAnalyticsAdminV1betaPropertySummary> propertySummaries) {
    this.propertySummaries = propertySummaries;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1betaAccountSummary set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1betaAccountSummary) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1betaAccountSummary clone() {
    return (GoogleAnalyticsAdminV1betaAccountSummary) super.clone();
  }

}
