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

package com.google.api.services.dfareporting.model;

/**
 * Technology Targeting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TechnologyTargeting extends com.google.api.client.json.GenericJson {

  /**
   * Browsers that this ad targets. For each browser either set browserVersionId or dartId along
   * with the version numbers. If both are specified, only browserVersionId will be used. The other
   * fields are populated automatically when the ad is inserted or updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Browser> browsers;

  static {
    // hack to force ProGuard to consider Browser used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Browser.class);
  }

  /**
   * Connection types that this ad targets. For each connection type only id is required. The other
   * fields are populated automatically when the ad is inserted or updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConnectionType> connectionTypes;

  static {
    // hack to force ProGuard to consider ConnectionType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ConnectionType.class);
  }

  /**
   * Mobile carriers that this ad targets. For each mobile carrier only id is required, and the
   * other fields are populated automatically when the ad is inserted or updated. If targeting a
   * mobile carrier, do not set targeting for any zip codes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MobileCarrier> mobileCarriers;

  static {
    // hack to force ProGuard to consider MobileCarrier used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MobileCarrier.class);
  }

  /**
   * Operating system versions that this ad targets. To target all versions, use operatingSystems.
   * For each operating system version, only id is required. The other fields are populated
   * automatically when the ad is inserted or updated. If targeting an operating system version, do
   * not set targeting for the corresponding operating system in operatingSystems.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OperatingSystemVersion> operatingSystemVersions;

  static {
    // hack to force ProGuard to consider OperatingSystemVersion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OperatingSystemVersion.class);
  }

  /**
   * Operating systems that this ad targets. To target specific versions, use
   * operatingSystemVersions. For each operating system only dartId is required. The other fields
   * are populated automatically when the ad is inserted or updated. If targeting an operating
   * system, do not set targeting for operating system versions for the same operating system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OperatingSystem> operatingSystems;

  static {
    // hack to force ProGuard to consider OperatingSystem used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OperatingSystem.class);
  }

  /**
   * Platform types that this ad targets. For example, desktop, mobile, or tablet. For each platform
   * type, only id is required, and the other fields are populated automatically when the ad is
   * inserted or updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PlatformType> platformTypes;

  static {
    // hack to force ProGuard to consider PlatformType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PlatformType.class);
  }

  /**
   * Browsers that this ad targets. For each browser either set browserVersionId or dartId along
   * with the version numbers. If both are specified, only browserVersionId will be used. The other
   * fields are populated automatically when the ad is inserted or updated.
   * @return value or {@code null} for none
   */
  public java.util.List<Browser> getBrowsers() {
    return browsers;
  }

  /**
   * Browsers that this ad targets. For each browser either set browserVersionId or dartId along
   * with the version numbers. If both are specified, only browserVersionId will be used. The other
   * fields are populated automatically when the ad is inserted or updated.
   * @param browsers browsers or {@code null} for none
   */
  public TechnologyTargeting setBrowsers(java.util.List<Browser> browsers) {
    this.browsers = browsers;
    return this;
  }

  /**
   * Connection types that this ad targets. For each connection type only id is required. The other
   * fields are populated automatically when the ad is inserted or updated.
   * @return value or {@code null} for none
   */
  public java.util.List<ConnectionType> getConnectionTypes() {
    return connectionTypes;
  }

  /**
   * Connection types that this ad targets. For each connection type only id is required. The other
   * fields are populated automatically when the ad is inserted or updated.
   * @param connectionTypes connectionTypes or {@code null} for none
   */
  public TechnologyTargeting setConnectionTypes(java.util.List<ConnectionType> connectionTypes) {
    this.connectionTypes = connectionTypes;
    return this;
  }

  /**
   * Mobile carriers that this ad targets. For each mobile carrier only id is required, and the
   * other fields are populated automatically when the ad is inserted or updated. If targeting a
   * mobile carrier, do not set targeting for any zip codes.
   * @return value or {@code null} for none
   */
  public java.util.List<MobileCarrier> getMobileCarriers() {
    return mobileCarriers;
  }

  /**
   * Mobile carriers that this ad targets. For each mobile carrier only id is required, and the
   * other fields are populated automatically when the ad is inserted or updated. If targeting a
   * mobile carrier, do not set targeting for any zip codes.
   * @param mobileCarriers mobileCarriers or {@code null} for none
   */
  public TechnologyTargeting setMobileCarriers(java.util.List<MobileCarrier> mobileCarriers) {
    this.mobileCarriers = mobileCarriers;
    return this;
  }

  /**
   * Operating system versions that this ad targets. To target all versions, use operatingSystems.
   * For each operating system version, only id is required. The other fields are populated
   * automatically when the ad is inserted or updated. If targeting an operating system version, do
   * not set targeting for the corresponding operating system in operatingSystems.
   * @return value or {@code null} for none
   */
  public java.util.List<OperatingSystemVersion> getOperatingSystemVersions() {
    return operatingSystemVersions;
  }

  /**
   * Operating system versions that this ad targets. To target all versions, use operatingSystems.
   * For each operating system version, only id is required. The other fields are populated
   * automatically when the ad is inserted or updated. If targeting an operating system version, do
   * not set targeting for the corresponding operating system in operatingSystems.
   * @param operatingSystemVersions operatingSystemVersions or {@code null} for none
   */
  public TechnologyTargeting setOperatingSystemVersions(java.util.List<OperatingSystemVersion> operatingSystemVersions) {
    this.operatingSystemVersions = operatingSystemVersions;
    return this;
  }

  /**
   * Operating systems that this ad targets. To target specific versions, use
   * operatingSystemVersions. For each operating system only dartId is required. The other fields
   * are populated automatically when the ad is inserted or updated. If targeting an operating
   * system, do not set targeting for operating system versions for the same operating system.
   * @return value or {@code null} for none
   */
  public java.util.List<OperatingSystem> getOperatingSystems() {
    return operatingSystems;
  }

  /**
   * Operating systems that this ad targets. To target specific versions, use
   * operatingSystemVersions. For each operating system only dartId is required. The other fields
   * are populated automatically when the ad is inserted or updated. If targeting an operating
   * system, do not set targeting for operating system versions for the same operating system.
   * @param operatingSystems operatingSystems or {@code null} for none
   */
  public TechnologyTargeting setOperatingSystems(java.util.List<OperatingSystem> operatingSystems) {
    this.operatingSystems = operatingSystems;
    return this;
  }

  /**
   * Platform types that this ad targets. For example, desktop, mobile, or tablet. For each platform
   * type, only id is required, and the other fields are populated automatically when the ad is
   * inserted or updated.
   * @return value or {@code null} for none
   */
  public java.util.List<PlatformType> getPlatformTypes() {
    return platformTypes;
  }

  /**
   * Platform types that this ad targets. For example, desktop, mobile, or tablet. For each platform
   * type, only id is required, and the other fields are populated automatically when the ad is
   * inserted or updated.
   * @param platformTypes platformTypes or {@code null} for none
   */
  public TechnologyTargeting setPlatformTypes(java.util.List<PlatformType> platformTypes) {
    this.platformTypes = platformTypes;
    return this;
  }

  @Override
  public TechnologyTargeting set(String fieldName, Object value) {
    return (TechnologyTargeting) super.set(fieldName, value);
  }

  @Override
  public TechnologyTargeting clone() {
    return (TechnologyTargeting) super.clone();
  }

}
