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

package com.google.api.services.apigee.v1.model;

/**
 * ControlPlaneAccess is the request body and response body of UpdateControlPlaneAccess. and the
 * response body of GetControlPlaneAccess. The input identities contains an array of service
 * accounts to grant access to the respective control plane resource, with each service account
 * specified using the following format: `serviceAccount:`***service-account-name***. The
 * ***service-account-name*** is formatted like an email address. For example: `my-control-plane-
 * service_account@my_project_id.iam.gserviceaccount.com` You might specify multiple service
 * accounts, for example, if you have multiple environments and wish to assign a unique service
 * account to each one.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ControlPlaneAccess extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Array of service accounts authorized to publish analytics data to the control plane
   * (for the Message Processor component).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> analyticsPublisherIdentities;

  /**
   * Identifier. The resource name of the ControlPlaneAccess. Format:
   * "organizations/{org}/controlPlaneAccess"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Array of service accounts to grant access to control plane resources (for the
   * Synchronizer component). The service accounts must have **Apigee Synchronizer Manager** role.
   * See also [Create service accounts](https://cloud.google.com/apigee/docs/hybrid/latest/sa-
   * about#create-the-service-accounts).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> synchronizerIdentities;

  /**
   * Optional. Array of service accounts authorized to publish analytics data to the control plane
   * (for the Message Processor component).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAnalyticsPublisherIdentities() {
    return analyticsPublisherIdentities;
  }

  /**
   * Optional. Array of service accounts authorized to publish analytics data to the control plane
   * (for the Message Processor component).
   * @param analyticsPublisherIdentities analyticsPublisherIdentities or {@code null} for none
   */
  public GoogleCloudApigeeV1ControlPlaneAccess setAnalyticsPublisherIdentities(java.util.List<java.lang.String> analyticsPublisherIdentities) {
    this.analyticsPublisherIdentities = analyticsPublisherIdentities;
    return this;
  }

  /**
   * Identifier. The resource name of the ControlPlaneAccess. Format:
   * "organizations/{org}/controlPlaneAccess"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the ControlPlaneAccess. Format:
   * "organizations/{org}/controlPlaneAccess"
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1ControlPlaneAccess setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Array of service accounts to grant access to control plane resources (for the
   * Synchronizer component). The service accounts must have **Apigee Synchronizer Manager** role.
   * See also [Create service accounts](https://cloud.google.com/apigee/docs/hybrid/latest/sa-
   * about#create-the-service-accounts).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSynchronizerIdentities() {
    return synchronizerIdentities;
  }

  /**
   * Optional. Array of service accounts to grant access to control plane resources (for the
   * Synchronizer component). The service accounts must have **Apigee Synchronizer Manager** role.
   * See also [Create service accounts](https://cloud.google.com/apigee/docs/hybrid/latest/sa-
   * about#create-the-service-accounts).
   * @param synchronizerIdentities synchronizerIdentities or {@code null} for none
   */
  public GoogleCloudApigeeV1ControlPlaneAccess setSynchronizerIdentities(java.util.List<java.lang.String> synchronizerIdentities) {
    this.synchronizerIdentities = synchronizerIdentities;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ControlPlaneAccess set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ControlPlaneAccess) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ControlPlaneAccess clone() {
    return (GoogleCloudApigeeV1ControlPlaneAccess) super.clone();
  }

}
