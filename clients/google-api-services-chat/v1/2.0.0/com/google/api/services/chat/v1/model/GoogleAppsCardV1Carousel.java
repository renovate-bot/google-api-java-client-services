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

package com.google.api.services.chat.v1.model;

/**
 * [Developer Preview](https://developers.google.com/workspace/preview): A carousel, also known as a
 * slider, rotates and displays a list of widgets in a slideshow format, with buttons navigating to
 * the previous or next widget. For example, this is a JSON representation of a carousel that
 * contains three text paragraph widgets. ``` { "carouselCards": [ { "widgets": [ { "textParagraph":
 * { "text": "First text paragraph in carousel", } } ] }, { "widgets": [ { "textParagraph": {
 * "text": "Second text paragraph in carousel", } } ] }, { "widgets": [ { "textParagraph": { "text":
 * "Third text paragraph in carousel", } } ] } ] } ``` [Google Chat
 * apps](https://developers.google.com/workspace/chat):
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1Carousel extends com.google.api.client.json.GenericJson {

  /**
   * A list of cards included in the carousel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsCardV1CarouselCard> carouselCards;

  /**
   * A list of cards included in the carousel.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsCardV1CarouselCard> getCarouselCards() {
    return carouselCards;
  }

  /**
   * A list of cards included in the carousel.
   * @param carouselCards carouselCards or {@code null} for none
   */
  public GoogleAppsCardV1Carousel setCarouselCards(java.util.List<GoogleAppsCardV1CarouselCard> carouselCards) {
    this.carouselCards = carouselCards;
    return this;
  }

  @Override
  public GoogleAppsCardV1Carousel set(String fieldName, Object value) {
    return (GoogleAppsCardV1Carousel) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1Carousel clone() {
    return (GoogleAppsCardV1Carousel) super.clone();
  }

}
