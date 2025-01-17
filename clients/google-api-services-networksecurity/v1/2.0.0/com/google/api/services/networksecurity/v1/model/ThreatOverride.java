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

package com.google.api.services.networksecurity.v1.model;

/**
 * Defines what action to take for a specific threat_id match.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Security API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ThreatOverride extends com.google.api.client.json.GenericJson {

  /**
   * Required. Threat action override. For some threat types, only a subset of actions applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * Required. Vendor-specific ID of a threat to override.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String threatId;

  /**
   * Output only. Type of the threat (read only).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Required. Threat action override. For some threat types, only a subset of actions applies.
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Required. Threat action override. For some threat types, only a subset of actions applies.
   * @param action action or {@code null} for none
   */
  public ThreatOverride setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * Required. Vendor-specific ID of a threat to override.
   * @return value or {@code null} for none
   */
  public java.lang.String getThreatId() {
    return threatId;
  }

  /**
   * Required. Vendor-specific ID of a threat to override.
   * @param threatId threatId or {@code null} for none
   */
  public ThreatOverride setThreatId(java.lang.String threatId) {
    this.threatId = threatId;
    return this;
  }

  /**
   * Output only. Type of the threat (read only).
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Output only. Type of the threat (read only).
   * @param type type or {@code null} for none
   */
  public ThreatOverride setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ThreatOverride set(String fieldName, Object value) {
    return (ThreatOverride) super.set(fieldName, value);
  }

  @Override
  public ThreatOverride clone() {
    return (ThreatOverride) super.clone();
  }

}
