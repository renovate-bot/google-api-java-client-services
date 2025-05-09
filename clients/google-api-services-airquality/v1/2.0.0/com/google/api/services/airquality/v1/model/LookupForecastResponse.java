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

package com.google.api.services.airquality.v1.model;

/**
 * The response object of the air quality forecast API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Air Quality API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LookupForecastResponse extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Contains the air quality information for each hour in the requested range. For
   * example, if the request is for 48 hours of forecast there will be 48 elements of hourly
   * forecasts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HourlyForecast> hourlyForecasts;

  static {
    // hack to force ProGuard to consider HourlyForecast used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HourlyForecast.class);
  }

  /**
   * Optional. The token to retrieve the next page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Optional. The ISO_3166-1 alpha-2 code of the country/region corresponding to the location
   * provided in the request. This field might be omitted from the response if the location provided
   * in the request resides in a disputed territory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Optional. Contains the air quality information for each hour in the requested range. For
   * example, if the request is for 48 hours of forecast there will be 48 elements of hourly
   * forecasts.
   * @return value or {@code null} for none
   */
  public java.util.List<HourlyForecast> getHourlyForecasts() {
    return hourlyForecasts;
  }

  /**
   * Optional. Contains the air quality information for each hour in the requested range. For
   * example, if the request is for 48 hours of forecast there will be 48 elements of hourly
   * forecasts.
   * @param hourlyForecasts hourlyForecasts or {@code null} for none
   */
  public LookupForecastResponse setHourlyForecasts(java.util.List<HourlyForecast> hourlyForecasts) {
    this.hourlyForecasts = hourlyForecasts;
    return this;
  }

  /**
   * Optional. The token to retrieve the next page.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Optional. The token to retrieve the next page.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public LookupForecastResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Optional. The ISO_3166-1 alpha-2 code of the country/region corresponding to the location
   * provided in the request. This field might be omitted from the response if the location provided
   * in the request resides in a disputed territory.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * Optional. The ISO_3166-1 alpha-2 code of the country/region corresponding to the location
   * provided in the request. This field might be omitted from the response if the location provided
   * in the request resides in a disputed territory.
   * @param regionCode regionCode or {@code null} for none
   */
  public LookupForecastResponse setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  @Override
  public LookupForecastResponse set(String fieldName, Object value) {
    return (LookupForecastResponse) super.set(fieldName, value);
  }

  @Override
  public LookupForecastResponse clone() {
    return (LookupForecastResponse) super.clone();
  }

}
