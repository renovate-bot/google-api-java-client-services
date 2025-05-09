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

package com.google.api.services.pubsub.model;

/**
 * Ingestion settings for Azure Event Hubs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AzureEventHubs extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The client id of the Azure application that is being used to authenticate Pub/Sub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientId;

  /**
   * Optional. The name of the Event Hub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventHub;

  /**
   * Optional. The GCP service account to be used for Federated Identity authentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcpServiceAccount;

  /**
   * Optional. The name of the Event Hubs namespace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespace;

  /**
   * Optional. Name of the resource group within the azure subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceGroup;

  /**
   * Output only. An output-only field that indicates the state of the Event Hubs ingestion source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Optional. The Azure subscription id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subscriptionId;

  /**
   * Optional. The tenant id of the Azure application that is being used to authenticate Pub/Sub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantId;

  /**
   * Optional. The client id of the Azure application that is being used to authenticate Pub/Sub.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientId() {
    return clientId;
  }

  /**
   * Optional. The client id of the Azure application that is being used to authenticate Pub/Sub.
   * @param clientId clientId or {@code null} for none
   */
  public AzureEventHubs setClientId(java.lang.String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Optional. The name of the Event Hub.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventHub() {
    return eventHub;
  }

  /**
   * Optional. The name of the Event Hub.
   * @param eventHub eventHub or {@code null} for none
   */
  public AzureEventHubs setEventHub(java.lang.String eventHub) {
    this.eventHub = eventHub;
    return this;
  }

  /**
   * Optional. The GCP service account to be used for Federated Identity authentication.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcpServiceAccount() {
    return gcpServiceAccount;
  }

  /**
   * Optional. The GCP service account to be used for Federated Identity authentication.
   * @param gcpServiceAccount gcpServiceAccount or {@code null} for none
   */
  public AzureEventHubs setGcpServiceAccount(java.lang.String gcpServiceAccount) {
    this.gcpServiceAccount = gcpServiceAccount;
    return this;
  }

  /**
   * Optional. The name of the Event Hubs namespace.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespace() {
    return namespace;
  }

  /**
   * Optional. The name of the Event Hubs namespace.
   * @param namespace namespace or {@code null} for none
   */
  public AzureEventHubs setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Optional. Name of the resource group within the azure subscription.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Optional. Name of the resource group within the azure subscription.
   * @param resourceGroup resourceGroup or {@code null} for none
   */
  public AzureEventHubs setResourceGroup(java.lang.String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

  /**
   * Output only. An output-only field that indicates the state of the Event Hubs ingestion source.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. An output-only field that indicates the state of the Event Hubs ingestion source.
   * @param state state or {@code null} for none
   */
  public AzureEventHubs setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Optional. The Azure subscription id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * Optional. The Azure subscription id.
   * @param subscriptionId subscriptionId or {@code null} for none
   */
  public AzureEventHubs setSubscriptionId(java.lang.String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Optional. The tenant id of the Azure application that is being used to authenticate Pub/Sub.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantId() {
    return tenantId;
  }

  /**
   * Optional. The tenant id of the Azure application that is being used to authenticate Pub/Sub.
   * @param tenantId tenantId or {@code null} for none
   */
  public AzureEventHubs setTenantId(java.lang.String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  @Override
  public AzureEventHubs set(String fieldName, Object value) {
    return (AzureEventHubs) super.set(fieldName, value);
  }

  @Override
  public AzureEventHubs clone() {
    return (AzureEventHubs) super.clone();
  }

}
