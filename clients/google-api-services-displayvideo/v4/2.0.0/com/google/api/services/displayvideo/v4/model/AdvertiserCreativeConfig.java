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
 * Creatives related settings of an advertiser.
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
public final class AdvertiserCreativeConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether or not the advertiser is enabled for dynamic creatives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dynamicCreativeEnabled;

  /**
   * An ID for configuring campaign monitoring provided by Integral Ad Service (IAS). The DV360
   * system will append an IAS "Campaign Monitor" tag containing this ID to the creative tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long iasClientId;

  /**
   * Whether or not to disable Google's About this Ad feature that adds badging (to identify the
   * content as an ad) and transparency information (on interaction with About this Ad) to your ads
   * for Online Behavioral Advertising (OBA) and regulatory requirements. About this Ad gives users
   * greater control over the ads they see and helps you explain why they're seeing your ad. [Learn
   * more](//support.google.com/displayvideo/answer/14315795). If you choose to set this field to
   * `true`, note that ads served through Display & Video 360 must comply to the following: * Be
   * Online Behavioral Advertising (OBA) compliant, as per your contract with Google Marketing
   * Platform. * In the European Economic Area (EEA), include transparency information and a
   * mechanism for users to report illegal content in ads. If using an alternative ad badging,
   * transparency, and reporting solution, you must ensure it includes the required transparency
   * information and illegal content flagging mechanism and that you notify Google of any illegal
   * content reports using the appropriate [form](//support.google.com/legal/troubleshooter/1114905?
   * sjid=6787484030557261960-EU#ts=2981967%2C2982031%2C12980091).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean obaComplianceDisabled;

  /**
   * By setting this field to `true`, you, on behalf of your company, authorize Google to use video
   * creatives associated with this Display & Video 360 advertiser to provide reporting and features
   * related to the advertiser's television campaigns. Applicable only when the advertiser has a
   * CM360 hybrid ad server configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean videoCreativeDataSharingAuthorized;

  /**
   * Whether or not the advertiser is enabled for dynamic creatives.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDynamicCreativeEnabled() {
    return dynamicCreativeEnabled;
  }

  /**
   * Whether or not the advertiser is enabled for dynamic creatives.
   * @param dynamicCreativeEnabled dynamicCreativeEnabled or {@code null} for none
   */
  public AdvertiserCreativeConfig setDynamicCreativeEnabled(java.lang.Boolean dynamicCreativeEnabled) {
    this.dynamicCreativeEnabled = dynamicCreativeEnabled;
    return this;
  }

  /**
   * An ID for configuring campaign monitoring provided by Integral Ad Service (IAS). The DV360
   * system will append an IAS "Campaign Monitor" tag containing this ID to the creative tag.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIasClientId() {
    return iasClientId;
  }

  /**
   * An ID for configuring campaign monitoring provided by Integral Ad Service (IAS). The DV360
   * system will append an IAS "Campaign Monitor" tag containing this ID to the creative tag.
   * @param iasClientId iasClientId or {@code null} for none
   */
  public AdvertiserCreativeConfig setIasClientId(java.lang.Long iasClientId) {
    this.iasClientId = iasClientId;
    return this;
  }

  /**
   * Whether or not to disable Google's About this Ad feature that adds badging (to identify the
   * content as an ad) and transparency information (on interaction with About this Ad) to your ads
   * for Online Behavioral Advertising (OBA) and regulatory requirements. About this Ad gives users
   * greater control over the ads they see and helps you explain why they're seeing your ad. [Learn
   * more](//support.google.com/displayvideo/answer/14315795). If you choose to set this field to
   * `true`, note that ads served through Display & Video 360 must comply to the following: * Be
   * Online Behavioral Advertising (OBA) compliant, as per your contract with Google Marketing
   * Platform. * In the European Economic Area (EEA), include transparency information and a
   * mechanism for users to report illegal content in ads. If using an alternative ad badging,
   * transparency, and reporting solution, you must ensure it includes the required transparency
   * information and illegal content flagging mechanism and that you notify Google of any illegal
   * content reports using the appropriate [form](//support.google.com/legal/troubleshooter/1114905?
   * sjid=6787484030557261960-EU#ts=2981967%2C2982031%2C12980091).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getObaComplianceDisabled() {
    return obaComplianceDisabled;
  }

  /**
   * Whether or not to disable Google's About this Ad feature that adds badging (to identify the
   * content as an ad) and transparency information (on interaction with About this Ad) to your ads
   * for Online Behavioral Advertising (OBA) and regulatory requirements. About this Ad gives users
   * greater control over the ads they see and helps you explain why they're seeing your ad. [Learn
   * more](//support.google.com/displayvideo/answer/14315795). If you choose to set this field to
   * `true`, note that ads served through Display & Video 360 must comply to the following: * Be
   * Online Behavioral Advertising (OBA) compliant, as per your contract with Google Marketing
   * Platform. * In the European Economic Area (EEA), include transparency information and a
   * mechanism for users to report illegal content in ads. If using an alternative ad badging,
   * transparency, and reporting solution, you must ensure it includes the required transparency
   * information and illegal content flagging mechanism and that you notify Google of any illegal
   * content reports using the appropriate [form](//support.google.com/legal/troubleshooter/1114905?
   * sjid=6787484030557261960-EU#ts=2981967%2C2982031%2C12980091).
   * @param obaComplianceDisabled obaComplianceDisabled or {@code null} for none
   */
  public AdvertiserCreativeConfig setObaComplianceDisabled(java.lang.Boolean obaComplianceDisabled) {
    this.obaComplianceDisabled = obaComplianceDisabled;
    return this;
  }

  /**
   * By setting this field to `true`, you, on behalf of your company, authorize Google to use video
   * creatives associated with this Display & Video 360 advertiser to provide reporting and features
   * related to the advertiser's television campaigns. Applicable only when the advertiser has a
   * CM360 hybrid ad server configuration.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVideoCreativeDataSharingAuthorized() {
    return videoCreativeDataSharingAuthorized;
  }

  /**
   * By setting this field to `true`, you, on behalf of your company, authorize Google to use video
   * creatives associated with this Display & Video 360 advertiser to provide reporting and features
   * related to the advertiser's television campaigns. Applicable only when the advertiser has a
   * CM360 hybrid ad server configuration.
   * @param videoCreativeDataSharingAuthorized videoCreativeDataSharingAuthorized or {@code null} for none
   */
  public AdvertiserCreativeConfig setVideoCreativeDataSharingAuthorized(java.lang.Boolean videoCreativeDataSharingAuthorized) {
    this.videoCreativeDataSharingAuthorized = videoCreativeDataSharingAuthorized;
    return this;
  }

  @Override
  public AdvertiserCreativeConfig set(String fieldName, Object value) {
    return (AdvertiserCreativeConfig) super.set(fieldName, value);
  }

  @Override
  public AdvertiserCreativeConfig clone() {
    return (AdvertiserCreativeConfig) super.clone();
  }

}
