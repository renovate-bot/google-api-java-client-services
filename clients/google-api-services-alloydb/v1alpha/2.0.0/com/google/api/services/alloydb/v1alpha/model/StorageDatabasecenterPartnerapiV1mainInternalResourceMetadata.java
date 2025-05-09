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

package com.google.api.services.alloydb.v1alpha.model;

/**
 * Metadata for individual internal resources in an instance. e.g. spanner instance can have
 * multiple databases with unique configuration settings. Similarly bigtable can have multiple
 * clusters within same bigtable instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AlloyDB API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StorageDatabasecenterPartnerapiV1mainInternalResourceMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Backup configuration for this database
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageDatabasecenterPartnerapiV1mainBackupConfiguration backupConfiguration;

  /**
   * Information about the last backup attempt for this database
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageDatabasecenterPartnerapiV1mainBackupRun backupRun;

  /**
   * Whether deletion protection is enabled for this internal resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDeletionProtectionEnabled;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageDatabasecenterProtoCommonProduct product;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageDatabasecenterPartnerapiV1mainDatabaseResourceId resourceId;

  /**
   * Required. internal resource name for spanner this will be database name
   * e.g."spanner.googleapis.com/projects/123/abc/instances/inst1/databases/db1"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * Backup configuration for this database
   * @return value or {@code null} for none
   */
  public StorageDatabasecenterPartnerapiV1mainBackupConfiguration getBackupConfiguration() {
    return backupConfiguration;
  }

  /**
   * Backup configuration for this database
   * @param backupConfiguration backupConfiguration or {@code null} for none
   */
  public StorageDatabasecenterPartnerapiV1mainInternalResourceMetadata setBackupConfiguration(StorageDatabasecenterPartnerapiV1mainBackupConfiguration backupConfiguration) {
    this.backupConfiguration = backupConfiguration;
    return this;
  }

  /**
   * Information about the last backup attempt for this database
   * @return value or {@code null} for none
   */
  public StorageDatabasecenterPartnerapiV1mainBackupRun getBackupRun() {
    return backupRun;
  }

  /**
   * Information about the last backup attempt for this database
   * @param backupRun backupRun or {@code null} for none
   */
  public StorageDatabasecenterPartnerapiV1mainInternalResourceMetadata setBackupRun(StorageDatabasecenterPartnerapiV1mainBackupRun backupRun) {
    this.backupRun = backupRun;
    return this;
  }

  /**
   * Whether deletion protection is enabled for this internal resource.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDeletionProtectionEnabled() {
    return isDeletionProtectionEnabled;
  }

  /**
   * Whether deletion protection is enabled for this internal resource.
   * @param isDeletionProtectionEnabled isDeletionProtectionEnabled or {@code null} for none
   */
  public StorageDatabasecenterPartnerapiV1mainInternalResourceMetadata setIsDeletionProtectionEnabled(java.lang.Boolean isDeletionProtectionEnabled) {
    this.isDeletionProtectionEnabled = isDeletionProtectionEnabled;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public StorageDatabasecenterProtoCommonProduct getProduct() {
    return product;
  }

  /**
   * @param product product or {@code null} for none
   */
  public StorageDatabasecenterPartnerapiV1mainInternalResourceMetadata setProduct(StorageDatabasecenterProtoCommonProduct product) {
    this.product = product;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public StorageDatabasecenterPartnerapiV1mainDatabaseResourceId getResourceId() {
    return resourceId;
  }

  /**
   * @param resourceId resourceId or {@code null} for none
   */
  public StorageDatabasecenterPartnerapiV1mainInternalResourceMetadata setResourceId(StorageDatabasecenterPartnerapiV1mainDatabaseResourceId resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Required. internal resource name for spanner this will be database name
   * e.g."spanner.googleapis.com/projects/123/abc/instances/inst1/databases/db1"
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * Required. internal resource name for spanner this will be database name
   * e.g."spanner.googleapis.com/projects/123/abc/instances/inst1/databases/db1"
   * @param resourceName resourceName or {@code null} for none
   */
  public StorageDatabasecenterPartnerapiV1mainInternalResourceMetadata setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  @Override
  public StorageDatabasecenterPartnerapiV1mainInternalResourceMetadata set(String fieldName, Object value) {
    return (StorageDatabasecenterPartnerapiV1mainInternalResourceMetadata) super.set(fieldName, value);
  }

  @Override
  public StorageDatabasecenterPartnerapiV1mainInternalResourceMetadata clone() {
    return (StorageDatabasecenterPartnerapiV1mainInternalResourceMetadata) super.clone();
  }

}
