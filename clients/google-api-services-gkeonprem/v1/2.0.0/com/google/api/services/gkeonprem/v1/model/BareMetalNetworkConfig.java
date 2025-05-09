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

package com.google.api.services.gkeonprem.v1.model;

/**
 * Specifies the cluster network configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE On-Prem API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BareMetalNetworkConfig extends com.google.api.client.json.GenericJson {

  /**
   * Enables the use of advanced Anthos networking features, such as Bundled Load Balancing with BGP
   * or the egress NAT gateway. Setting configuration for advanced networking features will
   * automatically set this flag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean advancedNetworking;

  /**
   * Configuration for island mode CIDR. In an island-mode network, nodes have unique IP addresses,
   * but pods don't have unique addresses across clusters. This doesn't cause problems because pods
   * in one cluster never directly communicate with pods in another cluster. Instead, there are
   * gateways that mediate between a pod in one cluster and a pod in another cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BareMetalIslandModeCidrConfig islandModeCidr;

  /**
   * Configuration for multiple network interfaces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BareMetalMultipleNetworkInterfacesConfig multipleNetworkInterfacesConfig;

  /**
   * Configuration for SR-IOV.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BareMetalSrIovConfig srIovConfig;

  /**
   * Enables the use of advanced Anthos networking features, such as Bundled Load Balancing with BGP
   * or the egress NAT gateway. Setting configuration for advanced networking features will
   * automatically set this flag.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdvancedNetworking() {
    return advancedNetworking;
  }

  /**
   * Enables the use of advanced Anthos networking features, such as Bundled Load Balancing with BGP
   * or the egress NAT gateway. Setting configuration for advanced networking features will
   * automatically set this flag.
   * @param advancedNetworking advancedNetworking or {@code null} for none
   */
  public BareMetalNetworkConfig setAdvancedNetworking(java.lang.Boolean advancedNetworking) {
    this.advancedNetworking = advancedNetworking;
    return this;
  }

  /**
   * Configuration for island mode CIDR. In an island-mode network, nodes have unique IP addresses,
   * but pods don't have unique addresses across clusters. This doesn't cause problems because pods
   * in one cluster never directly communicate with pods in another cluster. Instead, there are
   * gateways that mediate between a pod in one cluster and a pod in another cluster.
   * @return value or {@code null} for none
   */
  public BareMetalIslandModeCidrConfig getIslandModeCidr() {
    return islandModeCidr;
  }

  /**
   * Configuration for island mode CIDR. In an island-mode network, nodes have unique IP addresses,
   * but pods don't have unique addresses across clusters. This doesn't cause problems because pods
   * in one cluster never directly communicate with pods in another cluster. Instead, there are
   * gateways that mediate between a pod in one cluster and a pod in another cluster.
   * @param islandModeCidr islandModeCidr or {@code null} for none
   */
  public BareMetalNetworkConfig setIslandModeCidr(BareMetalIslandModeCidrConfig islandModeCidr) {
    this.islandModeCidr = islandModeCidr;
    return this;
  }

  /**
   * Configuration for multiple network interfaces.
   * @return value or {@code null} for none
   */
  public BareMetalMultipleNetworkInterfacesConfig getMultipleNetworkInterfacesConfig() {
    return multipleNetworkInterfacesConfig;
  }

  /**
   * Configuration for multiple network interfaces.
   * @param multipleNetworkInterfacesConfig multipleNetworkInterfacesConfig or {@code null} for none
   */
  public BareMetalNetworkConfig setMultipleNetworkInterfacesConfig(BareMetalMultipleNetworkInterfacesConfig multipleNetworkInterfacesConfig) {
    this.multipleNetworkInterfacesConfig = multipleNetworkInterfacesConfig;
    return this;
  }

  /**
   * Configuration for SR-IOV.
   * @return value or {@code null} for none
   */
  public BareMetalSrIovConfig getSrIovConfig() {
    return srIovConfig;
  }

  /**
   * Configuration for SR-IOV.
   * @param srIovConfig srIovConfig or {@code null} for none
   */
  public BareMetalNetworkConfig setSrIovConfig(BareMetalSrIovConfig srIovConfig) {
    this.srIovConfig = srIovConfig;
    return this;
  }

  @Override
  public BareMetalNetworkConfig set(String fieldName, Object value) {
    return (BareMetalNetworkConfig) super.set(fieldName, value);
  }

  @Override
  public BareMetalNetworkConfig clone() {
    return (BareMetalNetworkConfig) super.clone();
  }

}
