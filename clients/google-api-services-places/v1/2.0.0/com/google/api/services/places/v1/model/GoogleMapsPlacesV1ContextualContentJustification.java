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

package com.google.api.services.places.v1.model;

/**
 * Experimental: See https://developers.google.com/maps/documentation/places/web-
 * service/experimental/places-generative for more details. Justifications for the place.
 * Justifications answers the question of why a place could interest an end user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Places API (New). For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsPlacesV1ContextualContentJustification extends com.google.api.client.json.GenericJson {

  /**
   * Experimental: See https://developers.google.com/maps/documentation/places/web-
   * service/experimental/places-generative for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMapsPlacesV1ContextualContentJustificationBusinessAvailabilityAttributesJustification businessAvailabilityAttributesJustification;

  /**
   * Experimental: See https://developers.google.com/maps/documentation/places/web-
   * service/experimental/places-generative for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMapsPlacesV1ContextualContentJustificationReviewJustification reviewJustification;

  /**
   * Experimental: See https://developers.google.com/maps/documentation/places/web-
   * service/experimental/places-generative for more details.
   * @return value or {@code null} for none
   */
  public GoogleMapsPlacesV1ContextualContentJustificationBusinessAvailabilityAttributesJustification getBusinessAvailabilityAttributesJustification() {
    return businessAvailabilityAttributesJustification;
  }

  /**
   * Experimental: See https://developers.google.com/maps/documentation/places/web-
   * service/experimental/places-generative for more details.
   * @param businessAvailabilityAttributesJustification businessAvailabilityAttributesJustification or {@code null} for none
   */
  public GoogleMapsPlacesV1ContextualContentJustification setBusinessAvailabilityAttributesJustification(GoogleMapsPlacesV1ContextualContentJustificationBusinessAvailabilityAttributesJustification businessAvailabilityAttributesJustification) {
    this.businessAvailabilityAttributesJustification = businessAvailabilityAttributesJustification;
    return this;
  }

  /**
   * Experimental: See https://developers.google.com/maps/documentation/places/web-
   * service/experimental/places-generative for more details.
   * @return value or {@code null} for none
   */
  public GoogleMapsPlacesV1ContextualContentJustificationReviewJustification getReviewJustification() {
    return reviewJustification;
  }

  /**
   * Experimental: See https://developers.google.com/maps/documentation/places/web-
   * service/experimental/places-generative for more details.
   * @param reviewJustification reviewJustification or {@code null} for none
   */
  public GoogleMapsPlacesV1ContextualContentJustification setReviewJustification(GoogleMapsPlacesV1ContextualContentJustificationReviewJustification reviewJustification) {
    this.reviewJustification = reviewJustification;
    return this;
  }

  @Override
  public GoogleMapsPlacesV1ContextualContentJustification set(String fieldName, Object value) {
    return (GoogleMapsPlacesV1ContextualContentJustification) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsPlacesV1ContextualContentJustification clone() {
    return (GoogleMapsPlacesV1ContextualContentJustification) super.clone();
  }

}
