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

package com.google.api.services.backupdr.v1.model;

/**
 * BackupApplianceApplication describes a Source Resource when it is an application backed up by a
 * BackupAppliance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup and DR Service API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSourceBackupApplianceApplication extends com.google.api.client.json.GenericJson {

  /**
   * Appliance Id of the Backup Appliance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long applianceId;

  /**
   * The appid field of the application within the Backup Appliance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long applicationId;

  /**
   * The name of the Application as known to the Backup Appliance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String applicationName;

  /**
   * Appliance name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backupAppliance;

  /**
   * Hostid of the application host.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long hostId;

  /**
   * Hostname of the host where the application is running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostname;

  /**
   * The type of the application. e.g. VMBackup
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Appliance Id of the Backup Appliance.
   * @return value or {@code null} for none
   */
  public java.lang.Long getApplianceId() {
    return applianceId;
  }

  /**
   * Appliance Id of the Backup Appliance.
   * @param applianceId applianceId or {@code null} for none
   */
  public DataSourceBackupApplianceApplication setApplianceId(java.lang.Long applianceId) {
    this.applianceId = applianceId;
    return this;
  }

  /**
   * The appid field of the application within the Backup Appliance.
   * @return value or {@code null} for none
   */
  public java.lang.Long getApplicationId() {
    return applicationId;
  }

  /**
   * The appid field of the application within the Backup Appliance.
   * @param applicationId applicationId or {@code null} for none
   */
  public DataSourceBackupApplianceApplication setApplicationId(java.lang.Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * The name of the Application as known to the Backup Appliance.
   * @return value or {@code null} for none
   */
  public java.lang.String getApplicationName() {
    return applicationName;
  }

  /**
   * The name of the Application as known to the Backup Appliance.
   * @param applicationName applicationName or {@code null} for none
   */
  public DataSourceBackupApplianceApplication setApplicationName(java.lang.String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  /**
   * Appliance name.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackupAppliance() {
    return backupAppliance;
  }

  /**
   * Appliance name.
   * @param backupAppliance backupAppliance or {@code null} for none
   */
  public DataSourceBackupApplianceApplication setBackupAppliance(java.lang.String backupAppliance) {
    this.backupAppliance = backupAppliance;
    return this;
  }

  /**
   * Hostid of the application host.
   * @return value or {@code null} for none
   */
  public java.lang.Long getHostId() {
    return hostId;
  }

  /**
   * Hostid of the application host.
   * @param hostId hostId or {@code null} for none
   */
  public DataSourceBackupApplianceApplication setHostId(java.lang.Long hostId) {
    this.hostId = hostId;
    return this;
  }

  /**
   * Hostname of the host where the application is running.
   * @return value or {@code null} for none
   */
  public java.lang.String getHostname() {
    return hostname;
  }

  /**
   * Hostname of the host where the application is running.
   * @param hostname hostname or {@code null} for none
   */
  public DataSourceBackupApplianceApplication setHostname(java.lang.String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * The type of the application. e.g. VMBackup
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the application. e.g. VMBackup
   * @param type type or {@code null} for none
   */
  public DataSourceBackupApplianceApplication setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public DataSourceBackupApplianceApplication set(String fieldName, Object value) {
    return (DataSourceBackupApplianceApplication) super.set(fieldName, value);
  }

  @Override
  public DataSourceBackupApplianceApplication clone() {
    return (DataSourceBackupApplianceApplication) super.clone();
  }

}
