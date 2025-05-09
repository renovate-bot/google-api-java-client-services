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

package com.google.api.services.displayvideo.v4.model;

/**
 * Targeting settings related to ad serving of an advertiser.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdvertiserTargetingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether or not connected TV devices are exempt from viewability targeting for all video line
   * items under the advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean exemptTvFromViewabilityTargeting;

  /**
   * Whether or not connected TV devices are exempt from viewability targeting for all video line
   * items under the advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExemptTvFromViewabilityTargeting() {
    return exemptTvFromViewabilityTargeting;
  }

  /**
   * Whether or not connected TV devices are exempt from viewability targeting for all video line
   * items under the advertiser.
   * @param exemptTvFromViewabilityTargeting exemptTvFromViewabilityTargeting or {@code null} for none
   */
  public AdvertiserTargetingConfig setExemptTvFromViewabilityTargeting(java.lang.Boolean exemptTvFromViewabilityTargeting) {
    this.exemptTvFromViewabilityTargeting = exemptTvFromViewabilityTargeting;
    return this;
  }

  @Override
  public AdvertiserTargetingConfig set(String fieldName, Object value) {
    return (AdvertiserTargetingConfig) super.set(fieldName, value);
  }

  @Override
  public AdvertiserTargetingConfig clone() {
    return (AdvertiserTargetingConfig) super.clone();
  }

}
