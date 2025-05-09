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
 * Represents configuration for the VMware VCenter for the user cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE On-Prem API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VmwareVCenterConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The vCenter IP address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * Contains the vCenter CA certificate public key for SSL verification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String caCertData;

  /**
   * The name of the vCenter cluster for the user cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cluster;

  /**
   * The name of the vCenter datacenter for the user cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datacenter;

  /**
   * The name of the vCenter datastore for the user cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datastore;

  /**
   * The name of the vCenter folder for the user cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String folder;

  /**
   * The name of the vCenter resource pool for the user cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourcePool;

  /**
   * The name of the vCenter storage policy for the user cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storagePolicyName;

  /**
   * Output only. The vCenter IP address.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * Output only. The vCenter IP address.
   * @param address address or {@code null} for none
   */
  public VmwareVCenterConfig setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * Contains the vCenter CA certificate public key for SSL verification.
   * @return value or {@code null} for none
   */
  public java.lang.String getCaCertData() {
    return caCertData;
  }

  /**
   * Contains the vCenter CA certificate public key for SSL verification.
   * @param caCertData caCertData or {@code null} for none
   */
  public VmwareVCenterConfig setCaCertData(java.lang.String caCertData) {
    this.caCertData = caCertData;
    return this;
  }

  /**
   * The name of the vCenter cluster for the user cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getCluster() {
    return cluster;
  }

  /**
   * The name of the vCenter cluster for the user cluster.
   * @param cluster cluster or {@code null} for none
   */
  public VmwareVCenterConfig setCluster(java.lang.String cluster) {
    this.cluster = cluster;
    return this;
  }

  /**
   * The name of the vCenter datacenter for the user cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatacenter() {
    return datacenter;
  }

  /**
   * The name of the vCenter datacenter for the user cluster.
   * @param datacenter datacenter or {@code null} for none
   */
  public VmwareVCenterConfig setDatacenter(java.lang.String datacenter) {
    this.datacenter = datacenter;
    return this;
  }

  /**
   * The name of the vCenter datastore for the user cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatastore() {
    return datastore;
  }

  /**
   * The name of the vCenter datastore for the user cluster.
   * @param datastore datastore or {@code null} for none
   */
  public VmwareVCenterConfig setDatastore(java.lang.String datastore) {
    this.datastore = datastore;
    return this;
  }

  /**
   * The name of the vCenter folder for the user cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getFolder() {
    return folder;
  }

  /**
   * The name of the vCenter folder for the user cluster.
   * @param folder folder or {@code null} for none
   */
  public VmwareVCenterConfig setFolder(java.lang.String folder) {
    this.folder = folder;
    return this;
  }

  /**
   * The name of the vCenter resource pool for the user cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourcePool() {
    return resourcePool;
  }

  /**
   * The name of the vCenter resource pool for the user cluster.
   * @param resourcePool resourcePool or {@code null} for none
   */
  public VmwareVCenterConfig setResourcePool(java.lang.String resourcePool) {
    this.resourcePool = resourcePool;
    return this;
  }

  /**
   * The name of the vCenter storage policy for the user cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getStoragePolicyName() {
    return storagePolicyName;
  }

  /**
   * The name of the vCenter storage policy for the user cluster.
   * @param storagePolicyName storagePolicyName or {@code null} for none
   */
  public VmwareVCenterConfig setStoragePolicyName(java.lang.String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
    return this;
  }

  @Override
  public VmwareVCenterConfig set(String fieldName, Object value) {
    return (VmwareVCenterConfig) super.set(fieldName, value);
  }

  @Override
  public VmwareVCenterConfig clone() {
    return (VmwareVCenterConfig) super.clone();
  }

}
