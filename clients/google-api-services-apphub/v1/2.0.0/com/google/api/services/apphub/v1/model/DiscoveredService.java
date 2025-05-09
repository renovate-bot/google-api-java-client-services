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

package com.google.api.services.apphub.v1.model;

/**
 * DiscoveredService is a network or API interface that exposes some functionality to clients for
 * consumption over the network. A discovered service can be registered to a App Hub service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DiscoveredService extends com.google.api.client.json.GenericJson {

  /**
   * Identifier. The resource name of the discovered service. Format: `"projects/{host-project-
   * id}/locations/{location}/discoveredServices/{uuid}"`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Properties of an underlying compute resource that can comprise a Service. These
   * are immutable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceProperties serviceProperties;

  /**
   * Output only. Reference to an underlying networking resource that can comprise a Service. These
   * are immutable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServiceReference serviceReference;

  /**
   * Identifier. The resource name of the discovered service. Format: `"projects/{host-project-
   * id}/locations/{location}/discoveredServices/{uuid}"`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the discovered service. Format: `"projects/{host-project-
   * id}/locations/{location}/discoveredServices/{uuid}"`
   * @param name name or {@code null} for none
   */
  public DiscoveredService setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Properties of an underlying compute resource that can comprise a Service. These
   * are immutable.
   * @return value or {@code null} for none
   */
  public ServiceProperties getServiceProperties() {
    return serviceProperties;
  }

  /**
   * Output only. Properties of an underlying compute resource that can comprise a Service. These
   * are immutable.
   * @param serviceProperties serviceProperties or {@code null} for none
   */
  public DiscoveredService setServiceProperties(ServiceProperties serviceProperties) {
    this.serviceProperties = serviceProperties;
    return this;
  }

  /**
   * Output only. Reference to an underlying networking resource that can comprise a Service. These
   * are immutable.
   * @return value or {@code null} for none
   */
  public ServiceReference getServiceReference() {
    return serviceReference;
  }

  /**
   * Output only. Reference to an underlying networking resource that can comprise a Service. These
   * are immutable.
   * @param serviceReference serviceReference or {@code null} for none
   */
  public DiscoveredService setServiceReference(ServiceReference serviceReference) {
    this.serviceReference = serviceReference;
    return this;
  }

  @Override
  public DiscoveredService set(String fieldName, Object value) {
    return (DiscoveredService) super.set(fieldName, value);
  }

  @Override
  public DiscoveredService clone() {
    return (DiscoveredService) super.clone();
  }

}
