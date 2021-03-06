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

package com.google.api.services.mybusinesslodging.v1.model;

/**
 * Minimized contact measures implemented by the hotel during COVID-19.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Lodging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MinimizedContact extends com.google.api.client.json.GenericJson {

  /**
   * No-contact check-in and check-out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean contactlessCheckinCheckout;

  /**
   * Contactless check-in check-out exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contactlessCheckinCheckoutException;

  /**
   * Keyless mobile entry to guest rooms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean digitalGuestRoomKeys;

  /**
   * Digital guest room keys exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String digitalGuestRoomKeysException;

  /**
   * Housekeeping scheduled by request only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean housekeepingScheduledRequestOnly;

  /**
   * Housekeeping scheduled request only exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String housekeepingScheduledRequestOnlyException;

  /**
   * High-touch items, such as magazines, removed from common areas.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean noHighTouchItemsCommonAreas;

  /**
   * No high touch items common areas exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String noHighTouchItemsCommonAreasException;

  /**
   * High-touch items, such as decorative pillows, removed from guest rooms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean noHighTouchItemsGuestRooms;

  /**
   * No high touch items guest rooms exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String noHighTouchItemsGuestRoomsException;

  /**
   * Plastic key cards are disinfected or discarded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean plasticKeycardsDisinfected;

  /**
   * Plastic keycards disinfected exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String plasticKeycardsDisinfectedException;

  /**
   * Buffer maintained between room bookings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean roomBookingsBuffer;

  /**
   * Room bookings buffer exception.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roomBookingsBufferException;

  /**
   * No-contact check-in and check-out.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getContactlessCheckinCheckout() {
    return contactlessCheckinCheckout;
  }

  /**
   * No-contact check-in and check-out.
   * @param contactlessCheckinCheckout contactlessCheckinCheckout or {@code null} for none
   */
  public MinimizedContact setContactlessCheckinCheckout(java.lang.Boolean contactlessCheckinCheckout) {
    this.contactlessCheckinCheckout = contactlessCheckinCheckout;
    return this;
  }

  /**
   * Contactless check-in check-out exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getContactlessCheckinCheckoutException() {
    return contactlessCheckinCheckoutException;
  }

  /**
   * Contactless check-in check-out exception.
   * @param contactlessCheckinCheckoutException contactlessCheckinCheckoutException or {@code null} for none
   */
  public MinimizedContact setContactlessCheckinCheckoutException(java.lang.String contactlessCheckinCheckoutException) {
    this.contactlessCheckinCheckoutException = contactlessCheckinCheckoutException;
    return this;
  }

  /**
   * Keyless mobile entry to guest rooms.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDigitalGuestRoomKeys() {
    return digitalGuestRoomKeys;
  }

  /**
   * Keyless mobile entry to guest rooms.
   * @param digitalGuestRoomKeys digitalGuestRoomKeys or {@code null} for none
   */
  public MinimizedContact setDigitalGuestRoomKeys(java.lang.Boolean digitalGuestRoomKeys) {
    this.digitalGuestRoomKeys = digitalGuestRoomKeys;
    return this;
  }

  /**
   * Digital guest room keys exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getDigitalGuestRoomKeysException() {
    return digitalGuestRoomKeysException;
  }

  /**
   * Digital guest room keys exception.
   * @param digitalGuestRoomKeysException digitalGuestRoomKeysException or {@code null} for none
   */
  public MinimizedContact setDigitalGuestRoomKeysException(java.lang.String digitalGuestRoomKeysException) {
    this.digitalGuestRoomKeysException = digitalGuestRoomKeysException;
    return this;
  }

  /**
   * Housekeeping scheduled by request only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHousekeepingScheduledRequestOnly() {
    return housekeepingScheduledRequestOnly;
  }

  /**
   * Housekeeping scheduled by request only.
   * @param housekeepingScheduledRequestOnly housekeepingScheduledRequestOnly or {@code null} for none
   */
  public MinimizedContact setHousekeepingScheduledRequestOnly(java.lang.Boolean housekeepingScheduledRequestOnly) {
    this.housekeepingScheduledRequestOnly = housekeepingScheduledRequestOnly;
    return this;
  }

  /**
   * Housekeeping scheduled request only exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getHousekeepingScheduledRequestOnlyException() {
    return housekeepingScheduledRequestOnlyException;
  }

  /**
   * Housekeeping scheduled request only exception.
   * @param housekeepingScheduledRequestOnlyException housekeepingScheduledRequestOnlyException or {@code null} for none
   */
  public MinimizedContact setHousekeepingScheduledRequestOnlyException(java.lang.String housekeepingScheduledRequestOnlyException) {
    this.housekeepingScheduledRequestOnlyException = housekeepingScheduledRequestOnlyException;
    return this;
  }

  /**
   * High-touch items, such as magazines, removed from common areas.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNoHighTouchItemsCommonAreas() {
    return noHighTouchItemsCommonAreas;
  }

  /**
   * High-touch items, such as magazines, removed from common areas.
   * @param noHighTouchItemsCommonAreas noHighTouchItemsCommonAreas or {@code null} for none
   */
  public MinimizedContact setNoHighTouchItemsCommonAreas(java.lang.Boolean noHighTouchItemsCommonAreas) {
    this.noHighTouchItemsCommonAreas = noHighTouchItemsCommonAreas;
    return this;
  }

  /**
   * No high touch items common areas exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getNoHighTouchItemsCommonAreasException() {
    return noHighTouchItemsCommonAreasException;
  }

  /**
   * No high touch items common areas exception.
   * @param noHighTouchItemsCommonAreasException noHighTouchItemsCommonAreasException or {@code null} for none
   */
  public MinimizedContact setNoHighTouchItemsCommonAreasException(java.lang.String noHighTouchItemsCommonAreasException) {
    this.noHighTouchItemsCommonAreasException = noHighTouchItemsCommonAreasException;
    return this;
  }

  /**
   * High-touch items, such as decorative pillows, removed from guest rooms.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNoHighTouchItemsGuestRooms() {
    return noHighTouchItemsGuestRooms;
  }

  /**
   * High-touch items, such as decorative pillows, removed from guest rooms.
   * @param noHighTouchItemsGuestRooms noHighTouchItemsGuestRooms or {@code null} for none
   */
  public MinimizedContact setNoHighTouchItemsGuestRooms(java.lang.Boolean noHighTouchItemsGuestRooms) {
    this.noHighTouchItemsGuestRooms = noHighTouchItemsGuestRooms;
    return this;
  }

  /**
   * No high touch items guest rooms exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getNoHighTouchItemsGuestRoomsException() {
    return noHighTouchItemsGuestRoomsException;
  }

  /**
   * No high touch items guest rooms exception.
   * @param noHighTouchItemsGuestRoomsException noHighTouchItemsGuestRoomsException or {@code null} for none
   */
  public MinimizedContact setNoHighTouchItemsGuestRoomsException(java.lang.String noHighTouchItemsGuestRoomsException) {
    this.noHighTouchItemsGuestRoomsException = noHighTouchItemsGuestRoomsException;
    return this;
  }

  /**
   * Plastic key cards are disinfected or discarded.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPlasticKeycardsDisinfected() {
    return plasticKeycardsDisinfected;
  }

  /**
   * Plastic key cards are disinfected or discarded.
   * @param plasticKeycardsDisinfected plasticKeycardsDisinfected or {@code null} for none
   */
  public MinimizedContact setPlasticKeycardsDisinfected(java.lang.Boolean plasticKeycardsDisinfected) {
    this.plasticKeycardsDisinfected = plasticKeycardsDisinfected;
    return this;
  }

  /**
   * Plastic keycards disinfected exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlasticKeycardsDisinfectedException() {
    return plasticKeycardsDisinfectedException;
  }

  /**
   * Plastic keycards disinfected exception.
   * @param plasticKeycardsDisinfectedException plasticKeycardsDisinfectedException or {@code null} for none
   */
  public MinimizedContact setPlasticKeycardsDisinfectedException(java.lang.String plasticKeycardsDisinfectedException) {
    this.plasticKeycardsDisinfectedException = plasticKeycardsDisinfectedException;
    return this;
  }

  /**
   * Buffer maintained between room bookings.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRoomBookingsBuffer() {
    return roomBookingsBuffer;
  }

  /**
   * Buffer maintained between room bookings.
   * @param roomBookingsBuffer roomBookingsBuffer or {@code null} for none
   */
  public MinimizedContact setRoomBookingsBuffer(java.lang.Boolean roomBookingsBuffer) {
    this.roomBookingsBuffer = roomBookingsBuffer;
    return this;
  }

  /**
   * Room bookings buffer exception.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoomBookingsBufferException() {
    return roomBookingsBufferException;
  }

  /**
   * Room bookings buffer exception.
   * @param roomBookingsBufferException roomBookingsBufferException or {@code null} for none
   */
  public MinimizedContact setRoomBookingsBufferException(java.lang.String roomBookingsBufferException) {
    this.roomBookingsBufferException = roomBookingsBufferException;
    return this;
  }

  @Override
  public MinimizedContact set(String fieldName, Object value) {
    return (MinimizedContact) super.set(fieldName, value);
  }

  @Override
  public MinimizedContact clone() {
    return (MinimizedContact) super.clone();
  }

}
