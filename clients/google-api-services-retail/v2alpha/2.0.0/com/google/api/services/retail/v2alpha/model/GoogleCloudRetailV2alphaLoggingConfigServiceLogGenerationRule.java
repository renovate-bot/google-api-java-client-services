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

package com.google.api.services.retail.v2alpha.model;

/**
 * The granular logging configurations for supported services.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI Search for commerce API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaLoggingConfigServiceLogGenerationRule extends com.google.api.client.json.GenericJson {

  /**
   * The log generation rule that applies to this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2alphaLoggingConfigLogGenerationRule logGenerationRule;

  /**
   * Required. Supported service names: "CatalogService", "CompletionService", "ControlService",
   * "MerchantCenterStreaming", "ModelService", "PredictionService", "ProductService",
   * "ServingConfigService", "UserEventService",
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceName;

  /**
   * The log generation rule that applies to this service.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2alphaLoggingConfigLogGenerationRule getLogGenerationRule() {
    return logGenerationRule;
  }

  /**
   * The log generation rule that applies to this service.
   * @param logGenerationRule logGenerationRule or {@code null} for none
   */
  public GoogleCloudRetailV2alphaLoggingConfigServiceLogGenerationRule setLogGenerationRule(GoogleCloudRetailV2alphaLoggingConfigLogGenerationRule logGenerationRule) {
    this.logGenerationRule = logGenerationRule;
    return this;
  }

  /**
   * Required. Supported service names: "CatalogService", "CompletionService", "ControlService",
   * "MerchantCenterStreaming", "ModelService", "PredictionService", "ProductService",
   * "ServingConfigService", "UserEventService",
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceName() {
    return serviceName;
  }

  /**
   * Required. Supported service names: "CatalogService", "CompletionService", "ControlService",
   * "MerchantCenterStreaming", "ModelService", "PredictionService", "ProductService",
   * "ServingConfigService", "UserEventService",
   * @param serviceName serviceName or {@code null} for none
   */
  public GoogleCloudRetailV2alphaLoggingConfigServiceLogGenerationRule setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaLoggingConfigServiceLogGenerationRule set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaLoggingConfigServiceLogGenerationRule) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaLoggingConfigServiceLogGenerationRule clone() {
    return (GoogleCloudRetailV2alphaLoggingConfigServiceLogGenerationRule) super.clone();
  }

}
