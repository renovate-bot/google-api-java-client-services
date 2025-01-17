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

package com.google.api.services.merchantapi.accounts_v1beta.model;

/**
 * An object representing a short code, which is a phone number that is typically much shorter than
 * regular phone numbers and can be used to address messages in MMS and SMS systems, as well as for
 * abbreviated dialing (For example "Text 611 to see how many minutes you have remaining on your
 * plan."). Short codes are restricted to a region and are not internationally dialable, which means
 * the same short code can exist in different regions, with different usage and pricing, even if
 * those regions share the same country calling code (For example: US and CA).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShortCode extends com.google.api.client.json.GenericJson {

  /**
   * Required. The short code digits, without a leading plus ('+') or country calling code. For
   * example "611".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String number;

  /**
   * Required. The BCP-47 region code of the location where calls to this short code can be made,
   * such as "US" and "BB". Reference(s): -
   * http://www.unicode.org/reports/tr35/#unicode_region_subtag
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Required. The short code digits, without a leading plus ('+') or country calling code. For
   * example "611".
   * @return value or {@code null} for none
   */
  public java.lang.String getNumber() {
    return number;
  }

  /**
   * Required. The short code digits, without a leading plus ('+') or country calling code. For
   * example "611".
   * @param number number or {@code null} for none
   */
  public ShortCode setNumber(java.lang.String number) {
    this.number = number;
    return this;
  }

  /**
   * Required. The BCP-47 region code of the location where calls to this short code can be made,
   * such as "US" and "BB". Reference(s): -
   * http://www.unicode.org/reports/tr35/#unicode_region_subtag
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * Required. The BCP-47 region code of the location where calls to this short code can be made,
   * such as "US" and "BB". Reference(s): -
   * http://www.unicode.org/reports/tr35/#unicode_region_subtag
   * @param regionCode regionCode or {@code null} for none
   */
  public ShortCode setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  @Override
  public ShortCode set(String fieldName, Object value) {
    return (ShortCode) super.set(fieldName, value);
  }

  @Override
  public ShortCode clone() {
    return (ShortCode) super.clone();
  }

}
