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
 * Configuration for custom Active View video viewability metrics.
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
public final class ActiveViewVideoViewabilityMetricConfig extends com.google.api.client.json.GenericJson {

  /**
   * Required. The display name of the custom metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The minimum visible video duration required (in seconds) in order for an impression to be
   * recorded. You must specify minimum_duration, minimum_quartile or both. If both are specified,
   * an impression meets the metric criteria if either requirement is met (whichever happens first).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minimumDuration;

  /**
   * The minimum visible video duration required, based on the video quartiles, in order for an
   * impression to be recorded. You must specify minimum_duration, minimum_quartile or both. If both
   * are specified, an impression meets the metric criteria if either requirement is met (whichever
   * happens first).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minimumQuartile;

  /**
   * Required. The minimum percentage of the video ad's pixels visible on the screen in order for an
   * impression to be recorded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minimumViewability;

  /**
   * Required. The minimum percentage of the video ad's volume required in order for an impression
   * to be recorded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minimumVolume;

  /**
   * Required. The display name of the custom metric.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the custom metric.
   * @param displayName displayName or {@code null} for none
   */
  public ActiveViewVideoViewabilityMetricConfig setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The minimum visible video duration required (in seconds) in order for an impression to be
   * recorded. You must specify minimum_duration, minimum_quartile or both. If both are specified,
   * an impression meets the metric criteria if either requirement is met (whichever happens first).
   * @return value or {@code null} for none
   */
  public java.lang.String getMinimumDuration() {
    return minimumDuration;
  }

  /**
   * The minimum visible video duration required (in seconds) in order for an impression to be
   * recorded. You must specify minimum_duration, minimum_quartile or both. If both are specified,
   * an impression meets the metric criteria if either requirement is met (whichever happens first).
   * @param minimumDuration minimumDuration or {@code null} for none
   */
  public ActiveViewVideoViewabilityMetricConfig setMinimumDuration(java.lang.String minimumDuration) {
    this.minimumDuration = minimumDuration;
    return this;
  }

  /**
   * The minimum visible video duration required, based on the video quartiles, in order for an
   * impression to be recorded. You must specify minimum_duration, minimum_quartile or both. If both
   * are specified, an impression meets the metric criteria if either requirement is met (whichever
   * happens first).
   * @return value or {@code null} for none
   */
  public java.lang.String getMinimumQuartile() {
    return minimumQuartile;
  }

  /**
   * The minimum visible video duration required, based on the video quartiles, in order for an
   * impression to be recorded. You must specify minimum_duration, minimum_quartile or both. If both
   * are specified, an impression meets the metric criteria if either requirement is met (whichever
   * happens first).
   * @param minimumQuartile minimumQuartile or {@code null} for none
   */
  public ActiveViewVideoViewabilityMetricConfig setMinimumQuartile(java.lang.String minimumQuartile) {
    this.minimumQuartile = minimumQuartile;
    return this;
  }

  /**
   * Required. The minimum percentage of the video ad's pixels visible on the screen in order for an
   * impression to be recorded.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinimumViewability() {
    return minimumViewability;
  }

  /**
   * Required. The minimum percentage of the video ad's pixels visible on the screen in order for an
   * impression to be recorded.
   * @param minimumViewability minimumViewability or {@code null} for none
   */
  public ActiveViewVideoViewabilityMetricConfig setMinimumViewability(java.lang.String minimumViewability) {
    this.minimumViewability = minimumViewability;
    return this;
  }

  /**
   * Required. The minimum percentage of the video ad's volume required in order for an impression
   * to be recorded.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinimumVolume() {
    return minimumVolume;
  }

  /**
   * Required. The minimum percentage of the video ad's volume required in order for an impression
   * to be recorded.
   * @param minimumVolume minimumVolume or {@code null} for none
   */
  public ActiveViewVideoViewabilityMetricConfig setMinimumVolume(java.lang.String minimumVolume) {
    this.minimumVolume = minimumVolume;
    return this;
  }

  @Override
  public ActiveViewVideoViewabilityMetricConfig set(String fieldName, Object value) {
    return (ActiveViewVideoViewabilityMetricConfig) super.set(fieldName, value);
  }

  @Override
  public ActiveViewVideoViewabilityMetricConfig clone() {
    return (ActiveViewVideoViewabilityMetricConfig) super.clone();
  }

}
