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

package com.google.api.services.walletobjects.model;

/**
 * Locations of interest for this class or object. Currently, this location is used for geofenced
 * notifications. When a user is within a set radius of this lat/long, and dwells there, Google will
 * trigger a notification. When a user exits this radius, the notification will be hidden.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Wallet API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MerchantLocation extends com.google.api.client.json.GenericJson {

  /**
   * The latitude specified as any value in the range of -90.0 through +90.0, both inclusive. Values
   * outside these bounds will be rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double latitude;

  /**
   * The longitude specified in the range -180.0 through +180.0, both inclusive. Values outside
   * these bounds will be rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double longitude;

  /**
   * The latitude specified as any value in the range of -90.0 through +90.0, both inclusive. Values
   * outside these bounds will be rejected.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * The latitude specified as any value in the range of -90.0 through +90.0, both inclusive. Values
   * outside these bounds will be rejected.
   * @param latitude latitude or {@code null} for none
   */
  public MerchantLocation setLatitude(java.lang.Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * The longitude specified in the range -180.0 through +180.0, both inclusive. Values outside
   * these bounds will be rejected.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLongitude() {
    return longitude;
  }

  /**
   * The longitude specified in the range -180.0 through +180.0, both inclusive. Values outside
   * these bounds will be rejected.
   * @param longitude longitude or {@code null} for none
   */
  public MerchantLocation setLongitude(java.lang.Double longitude) {
    this.longitude = longitude;
    return this;
  }

  @Override
  public MerchantLocation set(String fieldName, Object value) {
    return (MerchantLocation) super.set(fieldName, value);
  }

  @Override
  public MerchantLocation clone() {
    return (MerchantLocation) super.clone();
  }

}
