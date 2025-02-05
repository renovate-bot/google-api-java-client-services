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

package com.google.api.services.language.v2.model;

/**
 * The data statistics of a series of ARRAY values.
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
public final class XPSArrayStats extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private XPSCommonStats commonStats;

  /**
   * Stats of all the values of all arrays, as if they were a single long series of data. The type
   * depends on the element type of the array.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private XPSDataStats memberStats;

  /**
   * @return value or {@code null} for none
   */
  public XPSCommonStats getCommonStats() {
    return commonStats;
  }

  /**
   * @param commonStats commonStats or {@code null} for none
   */
  public XPSArrayStats setCommonStats(XPSCommonStats commonStats) {
    this.commonStats = commonStats;
    return this;
  }

  /**
   * Stats of all the values of all arrays, as if they were a single long series of data. The type
   * depends on the element type of the array.
   * @return value or {@code null} for none
   */
  public XPSDataStats getMemberStats() {
    return memberStats;
  }

  /**
   * Stats of all the values of all arrays, as if they were a single long series of data. The type
   * depends on the element type of the array.
   * @param memberStats memberStats or {@code null} for none
   */
  public XPSArrayStats setMemberStats(XPSDataStats memberStats) {
    this.memberStats = memberStats;
    return this;
  }

  @Override
  public XPSArrayStats set(String fieldName, Object value) {
    return (XPSArrayStats) super.set(fieldName, value);
  }

  @Override
  public XPSArrayStats clone() {
    return (XPSArrayStats) super.clone();
  }

}
