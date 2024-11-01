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

package com.google.api.services.monitoring.v3.model;

/**
 * Control over how the notification channels in notification_channels are notified when this alert
 * fires.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AlertStrategy extends com.google.api.client.json.GenericJson {

  /**
   * If an alerting policy that was active has no data for this long, any open incidents will close
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String autoClose;

  /**
   * Control how notifications will be sent out, on a per-channel basis.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NotificationChannelStrategy> notificationChannelStrategy;

  /**
   * For log-based alert policies, the notification prompts is always OPENED. For non log-based
   * alert policies, the notification prompts can be OPENED or OPENED, CLOSED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> notificationPrompts;

  /**
   * Required for log-based alerting policies, i.e. policies with a LogMatch condition.This limit is
   * not implemented for alerting policies that do not have a LogMatch condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NotificationRateLimit notificationRateLimit;

  /**
   * If an alerting policy that was active has no data for this long, any open incidents will close
   * @return value or {@code null} for none
   */
  public String getAutoClose() {
    return autoClose;
  }

  /**
   * If an alerting policy that was active has no data for this long, any open incidents will close
   * @param autoClose autoClose or {@code null} for none
   */
  public AlertStrategy setAutoClose(String autoClose) {
    this.autoClose = autoClose;
    return this;
  }

  /**
   * Control how notifications will be sent out, on a per-channel basis.
   * @return value or {@code null} for none
   */
  public java.util.List<NotificationChannelStrategy> getNotificationChannelStrategy() {
    return notificationChannelStrategy;
  }

  /**
   * Control how notifications will be sent out, on a per-channel basis.
   * @param notificationChannelStrategy notificationChannelStrategy or {@code null} for none
   */
  public AlertStrategy setNotificationChannelStrategy(java.util.List<NotificationChannelStrategy> notificationChannelStrategy) {
    this.notificationChannelStrategy = notificationChannelStrategy;
    return this;
  }

  /**
   * For log-based alert policies, the notification prompts is always OPENED. For non log-based
   * alert policies, the notification prompts can be OPENED or OPENED, CLOSED.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNotificationPrompts() {
    return notificationPrompts;
  }

  /**
   * For log-based alert policies, the notification prompts is always OPENED. For non log-based
   * alert policies, the notification prompts can be OPENED or OPENED, CLOSED.
   * @param notificationPrompts notificationPrompts or {@code null} for none
   */
  public AlertStrategy setNotificationPrompts(java.util.List<java.lang.String> notificationPrompts) {
    this.notificationPrompts = notificationPrompts;
    return this;
  }

  /**
   * Required for log-based alerting policies, i.e. policies with a LogMatch condition.This limit is
   * not implemented for alerting policies that do not have a LogMatch condition.
   * @return value or {@code null} for none
   */
  public NotificationRateLimit getNotificationRateLimit() {
    return notificationRateLimit;
  }

  /**
   * Required for log-based alerting policies, i.e. policies with a LogMatch condition.This limit is
   * not implemented for alerting policies that do not have a LogMatch condition.
   * @param notificationRateLimit notificationRateLimit or {@code null} for none
   */
  public AlertStrategy setNotificationRateLimit(NotificationRateLimit notificationRateLimit) {
    this.notificationRateLimit = notificationRateLimit;
    return this;
  }

  @Override
  public AlertStrategy set(String fieldName, Object value) {
    return (AlertStrategy) super.set(fieldName, value);
  }

  @Override
  public AlertStrategy clone() {
    return (AlertStrategy) super.clone();
  }

}
