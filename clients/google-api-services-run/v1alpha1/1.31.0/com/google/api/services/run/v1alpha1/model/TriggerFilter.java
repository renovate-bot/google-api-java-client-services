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

package com.google.api.services.run.v1alpha1.model;

/**
 * Model definition for TriggerFilter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TriggerFilter extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Attributes filters events by exact match on event context attributes. Each key in the
   * map is compared with the equivalent key in the event context. An event passes the filter if all
   * values are equal to the specified values. Nested context attributes are not supported as keys.
   * Only string values are supported. Note that this field is optional in knative. In fully
   * managed, 'type' attribute is required due to different broker implementation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> attributes;

  /**
   * Optional. Attributes filters events by exact match on event context attributes. Each key in the
   * map is compared with the equivalent key in the event context. An event passes the filter if all
   * values are equal to the specified values. Nested context attributes are not supported as keys.
   * Only string values are supported. Note that this field is optional in knative. In fully
   * managed, 'type' attribute is required due to different broker implementation.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAttributes() {
    return attributes;
  }

  /**
   * Optional. Attributes filters events by exact match on event context attributes. Each key in the
   * map is compared with the equivalent key in the event context. An event passes the filter if all
   * values are equal to the specified values. Nested context attributes are not supported as keys.
   * Only string values are supported. Note that this field is optional in knative. In fully
   * managed, 'type' attribute is required due to different broker implementation.
   * @param attributes attributes or {@code null} for none
   */
  public TriggerFilter setAttributes(java.util.Map<String, java.lang.String> attributes) {
    this.attributes = attributes;
    return this;
  }

  @Override
  public TriggerFilter set(String fieldName, Object value) {
    return (TriggerFilter) super.set(fieldName, value);
  }

  @Override
  public TriggerFilter clone() {
    return (TriggerFilter) super.clone();
  }

}
