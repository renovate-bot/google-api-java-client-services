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

package com.google.api.services.netapp.v1.model;

/**
 * Volume provides a filesystem that you can mount.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the NetApp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Volume extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Specifies the ActiveDirectory name of a SMB volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String activeDirectory;

  /**
   * BackupConfig of the volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BackupConfig backupConfig;

  /**
   * Required. Capacity in GIB of the volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long capacityGib;

  /**
   * Output only. Size of the volume cold tier data in GiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long coldTierSizeGib;

  /**
   * Output only. Create time of the volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Description of the volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. Specified the current volume encryption key source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptionType;

  /**
   * Optional. Export policy of the volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExportPolicy exportPolicy;

  /**
   * Output only. Indicates whether the volume is part of a replication relationship.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasReplication;

  /**
   * Optional. The Hybrid Replication parameters for the volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HybridReplicationParameters hybridReplicationParameters;

  /**
   * Optional. Flag indicating if the volume is a kerberos volume or not, export policy rules
   * control kerberos security modes (krb5, krb5i, krb5p).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean kerberosEnabled;

  /**
   * Output only. Specifies the KMS config to be used for volume encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsConfig;

  /**
   * Optional. Labels as key value pairs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. Flag indicating if the volume will be a large capacity volume or a regular volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean largeCapacity;

  /**
   * Output only. Flag indicating if the volume is NFS LDAP enabled or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ldapEnabled;

  /**
   * Output only. Mount options of this volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MountOption> mountOptions;

  static {
    // hack to force ProGuard to consider MountOption used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MountOption.class);
  }

  /**
   * Optional. Flag indicating if the volume will have an IP address per node for volumes supporting
   * multiple IP endpoints. Only the volume with large_capacity will be allowed to have multiple
   * endpoints.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean multipleEndpoints;

  /**
   * Identifier. Name of the volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. VPC Network name. Format: projects/{project}/global/networks/{network}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Required. Protocols required for the volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> protocols;

  /**
   * Output only. This field is not implemented. The values provided in this field are ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String psaRange;

  /**
   * Output only. Specifies the replica zone for regional volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String replicaZone;

  /**
   * Optional. Specifies the source of the volume to be created from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RestoreParameters restoreParameters;

  /**
   * Optional. List of actions that are restricted on this volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> restrictedActions;

  /**
   * Optional. Security Style of the Volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String securityStyle;

  /**
   * Output only. Service level of the volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceLevel;

  /**
   * Required. Share name of the volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shareName;

  /**
   * Optional. SMB share settings for the volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> smbSettings;

  /**
   * Optional. Snap_reserve specifies percentage of volume storage reserved for snapshot storage.
   * Default is 0 percent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double snapReserve;

  /**
   * Optional. Snapshot_directory if enabled (true) the volume will contain a read-only .snapshot
   * directory which provides access to each of the volume's snapshots.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean snapshotDirectory;

  /**
   * Optional. SnapshotPolicy for a volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SnapshotPolicy snapshotPolicy;

  /**
   * Output only. State of the volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. State details of the volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateDetails;

  /**
   * Required. StoragePool name of the volume
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storagePool;

  /**
   * Tiering policy for the volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TieringPolicy tieringPolicy;

  /**
   * Optional. Default unix style permission (e.g. 777) the mount point will be created with.
   * Applicable for NFS protocol types only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unixPermissions;

  /**
   * Output only. Used capacity in GIB of the volume. This is computed periodically and it does not
   * represent the realtime usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long usedGib;

  /**
   * Output only. Specifies the active zone for regional volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Output only. Specifies the ActiveDirectory name of a SMB volume.
   * @return value or {@code null} for none
   */
  public java.lang.String getActiveDirectory() {
    return activeDirectory;
  }

  /**
   * Output only. Specifies the ActiveDirectory name of a SMB volume.
   * @param activeDirectory activeDirectory or {@code null} for none
   */
  public Volume setActiveDirectory(java.lang.String activeDirectory) {
    this.activeDirectory = activeDirectory;
    return this;
  }

  /**
   * BackupConfig of the volume.
   * @return value or {@code null} for none
   */
  public BackupConfig getBackupConfig() {
    return backupConfig;
  }

  /**
   * BackupConfig of the volume.
   * @param backupConfig backupConfig or {@code null} for none
   */
  public Volume setBackupConfig(BackupConfig backupConfig) {
    this.backupConfig = backupConfig;
    return this;
  }

  /**
   * Required. Capacity in GIB of the volume
   * @return value or {@code null} for none
   */
  public java.lang.Long getCapacityGib() {
    return capacityGib;
  }

  /**
   * Required. Capacity in GIB of the volume
   * @param capacityGib capacityGib or {@code null} for none
   */
  public Volume setCapacityGib(java.lang.Long capacityGib) {
    this.capacityGib = capacityGib;
    return this;
  }

  /**
   * Output only. Size of the volume cold tier data in GiB.
   * @return value or {@code null} for none
   */
  public java.lang.Long getColdTierSizeGib() {
    return coldTierSizeGib;
  }

  /**
   * Output only. Size of the volume cold tier data in GiB.
   * @param coldTierSizeGib coldTierSizeGib or {@code null} for none
   */
  public Volume setColdTierSizeGib(java.lang.Long coldTierSizeGib) {
    this.coldTierSizeGib = coldTierSizeGib;
    return this;
  }

  /**
   * Output only. Create time of the volume
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Create time of the volume
   * @param createTime createTime or {@code null} for none
   */
  public Volume setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Description of the volume
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the volume
   * @param description description or {@code null} for none
   */
  public Volume setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. Specified the current volume encryption key source.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptionType() {
    return encryptionType;
  }

  /**
   * Output only. Specified the current volume encryption key source.
   * @param encryptionType encryptionType or {@code null} for none
   */
  public Volume setEncryptionType(java.lang.String encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

  /**
   * Optional. Export policy of the volume
   * @return value or {@code null} for none
   */
  public ExportPolicy getExportPolicy() {
    return exportPolicy;
  }

  /**
   * Optional. Export policy of the volume
   * @param exportPolicy exportPolicy or {@code null} for none
   */
  public Volume setExportPolicy(ExportPolicy exportPolicy) {
    this.exportPolicy = exportPolicy;
    return this;
  }

  /**
   * Output only. Indicates whether the volume is part of a replication relationship.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasReplication() {
    return hasReplication;
  }

  /**
   * Output only. Indicates whether the volume is part of a replication relationship.
   * @param hasReplication hasReplication or {@code null} for none
   */
  public Volume setHasReplication(java.lang.Boolean hasReplication) {
    this.hasReplication = hasReplication;
    return this;
  }

  /**
   * Optional. The Hybrid Replication parameters for the volume.
   * @return value or {@code null} for none
   */
  public HybridReplicationParameters getHybridReplicationParameters() {
    return hybridReplicationParameters;
  }

  /**
   * Optional. The Hybrid Replication parameters for the volume.
   * @param hybridReplicationParameters hybridReplicationParameters or {@code null} for none
   */
  public Volume setHybridReplicationParameters(HybridReplicationParameters hybridReplicationParameters) {
    this.hybridReplicationParameters = hybridReplicationParameters;
    return this;
  }

  /**
   * Optional. Flag indicating if the volume is a kerberos volume or not, export policy rules
   * control kerberos security modes (krb5, krb5i, krb5p).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getKerberosEnabled() {
    return kerberosEnabled;
  }

  /**
   * Optional. Flag indicating if the volume is a kerberos volume or not, export policy rules
   * control kerberos security modes (krb5, krb5i, krb5p).
   * @param kerberosEnabled kerberosEnabled or {@code null} for none
   */
  public Volume setKerberosEnabled(java.lang.Boolean kerberosEnabled) {
    this.kerberosEnabled = kerberosEnabled;
    return this;
  }

  /**
   * Output only. Specifies the KMS config to be used for volume encryption.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsConfig() {
    return kmsConfig;
  }

  /**
   * Output only. Specifies the KMS config to be used for volume encryption.
   * @param kmsConfig kmsConfig or {@code null} for none
   */
  public Volume setKmsConfig(java.lang.String kmsConfig) {
    this.kmsConfig = kmsConfig;
    return this;
  }

  /**
   * Optional. Labels as key value pairs
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Labels as key value pairs
   * @param labels labels or {@code null} for none
   */
  public Volume setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. Flag indicating if the volume will be a large capacity volume or a regular volume.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLargeCapacity() {
    return largeCapacity;
  }

  /**
   * Optional. Flag indicating if the volume will be a large capacity volume or a regular volume.
   * @param largeCapacity largeCapacity or {@code null} for none
   */
  public Volume setLargeCapacity(java.lang.Boolean largeCapacity) {
    this.largeCapacity = largeCapacity;
    return this;
  }

  /**
   * Output only. Flag indicating if the volume is NFS LDAP enabled or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLdapEnabled() {
    return ldapEnabled;
  }

  /**
   * Output only. Flag indicating if the volume is NFS LDAP enabled or not.
   * @param ldapEnabled ldapEnabled or {@code null} for none
   */
  public Volume setLdapEnabled(java.lang.Boolean ldapEnabled) {
    this.ldapEnabled = ldapEnabled;
    return this;
  }

  /**
   * Output only. Mount options of this volume
   * @return value or {@code null} for none
   */
  public java.util.List<MountOption> getMountOptions() {
    return mountOptions;
  }

  /**
   * Output only. Mount options of this volume
   * @param mountOptions mountOptions or {@code null} for none
   */
  public Volume setMountOptions(java.util.List<MountOption> mountOptions) {
    this.mountOptions = mountOptions;
    return this;
  }

  /**
   * Optional. Flag indicating if the volume will have an IP address per node for volumes supporting
   * multiple IP endpoints. Only the volume with large_capacity will be allowed to have multiple
   * endpoints.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMultipleEndpoints() {
    return multipleEndpoints;
  }

  /**
   * Optional. Flag indicating if the volume will have an IP address per node for volumes supporting
   * multiple IP endpoints. Only the volume with large_capacity will be allowed to have multiple
   * endpoints.
   * @param multipleEndpoints multipleEndpoints or {@code null} for none
   */
  public Volume setMultipleEndpoints(java.lang.Boolean multipleEndpoints) {
    this.multipleEndpoints = multipleEndpoints;
    return this;
  }

  /**
   * Identifier. Name of the volume
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Name of the volume
   * @param name name or {@code null} for none
   */
  public Volume setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. VPC Network name. Format: projects/{project}/global/networks/{network}
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Output only. VPC Network name. Format: projects/{project}/global/networks/{network}
   * @param network network or {@code null} for none
   */
  public Volume setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Required. Protocols required for the volume
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProtocols() {
    return protocols;
  }

  /**
   * Required. Protocols required for the volume
   * @param protocols protocols or {@code null} for none
   */
  public Volume setProtocols(java.util.List<java.lang.String> protocols) {
    this.protocols = protocols;
    return this;
  }

  /**
   * Output only. This field is not implemented. The values provided in this field are ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getPsaRange() {
    return psaRange;
  }

  /**
   * Output only. This field is not implemented. The values provided in this field are ignored.
   * @param psaRange psaRange or {@code null} for none
   */
  public Volume setPsaRange(java.lang.String psaRange) {
    this.psaRange = psaRange;
    return this;
  }

  /**
   * Output only. Specifies the replica zone for regional volume.
   * @return value or {@code null} for none
   */
  public java.lang.String getReplicaZone() {
    return replicaZone;
  }

  /**
   * Output only. Specifies the replica zone for regional volume.
   * @param replicaZone replicaZone or {@code null} for none
   */
  public Volume setReplicaZone(java.lang.String replicaZone) {
    this.replicaZone = replicaZone;
    return this;
  }

  /**
   * Optional. Specifies the source of the volume to be created from.
   * @return value or {@code null} for none
   */
  public RestoreParameters getRestoreParameters() {
    return restoreParameters;
  }

  /**
   * Optional. Specifies the source of the volume to be created from.
   * @param restoreParameters restoreParameters or {@code null} for none
   */
  public Volume setRestoreParameters(RestoreParameters restoreParameters) {
    this.restoreParameters = restoreParameters;
    return this;
  }

  /**
   * Optional. List of actions that are restricted on this volume.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRestrictedActions() {
    return restrictedActions;
  }

  /**
   * Optional. List of actions that are restricted on this volume.
   * @param restrictedActions restrictedActions or {@code null} for none
   */
  public Volume setRestrictedActions(java.util.List<java.lang.String> restrictedActions) {
    this.restrictedActions = restrictedActions;
    return this;
  }

  /**
   * Optional. Security Style of the Volume
   * @return value or {@code null} for none
   */
  public java.lang.String getSecurityStyle() {
    return securityStyle;
  }

  /**
   * Optional. Security Style of the Volume
   * @param securityStyle securityStyle or {@code null} for none
   */
  public Volume setSecurityStyle(java.lang.String securityStyle) {
    this.securityStyle = securityStyle;
    return this;
  }

  /**
   * Output only. Service level of the volume
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceLevel() {
    return serviceLevel;
  }

  /**
   * Output only. Service level of the volume
   * @param serviceLevel serviceLevel or {@code null} for none
   */
  public Volume setServiceLevel(java.lang.String serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

  /**
   * Required. Share name of the volume
   * @return value or {@code null} for none
   */
  public java.lang.String getShareName() {
    return shareName;
  }

  /**
   * Required. Share name of the volume
   * @param shareName shareName or {@code null} for none
   */
  public Volume setShareName(java.lang.String shareName) {
    this.shareName = shareName;
    return this;
  }

  /**
   * Optional. SMB share settings for the volume.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSmbSettings() {
    return smbSettings;
  }

  /**
   * Optional. SMB share settings for the volume.
   * @param smbSettings smbSettings or {@code null} for none
   */
  public Volume setSmbSettings(java.util.List<java.lang.String> smbSettings) {
    this.smbSettings = smbSettings;
    return this;
  }

  /**
   * Optional. Snap_reserve specifies percentage of volume storage reserved for snapshot storage.
   * Default is 0 percent.
   * @return value or {@code null} for none
   */
  public java.lang.Double getSnapReserve() {
    return snapReserve;
  }

  /**
   * Optional. Snap_reserve specifies percentage of volume storage reserved for snapshot storage.
   * Default is 0 percent.
   * @param snapReserve snapReserve or {@code null} for none
   */
  public Volume setSnapReserve(java.lang.Double snapReserve) {
    this.snapReserve = snapReserve;
    return this;
  }

  /**
   * Optional. Snapshot_directory if enabled (true) the volume will contain a read-only .snapshot
   * directory which provides access to each of the volume's snapshots.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSnapshotDirectory() {
    return snapshotDirectory;
  }

  /**
   * Optional. Snapshot_directory if enabled (true) the volume will contain a read-only .snapshot
   * directory which provides access to each of the volume's snapshots.
   * @param snapshotDirectory snapshotDirectory or {@code null} for none
   */
  public Volume setSnapshotDirectory(java.lang.Boolean snapshotDirectory) {
    this.snapshotDirectory = snapshotDirectory;
    return this;
  }

  /**
   * Optional. SnapshotPolicy for a volume.
   * @return value or {@code null} for none
   */
  public SnapshotPolicy getSnapshotPolicy() {
    return snapshotPolicy;
  }

  /**
   * Optional. SnapshotPolicy for a volume.
   * @param snapshotPolicy snapshotPolicy or {@code null} for none
   */
  public Volume setSnapshotPolicy(SnapshotPolicy snapshotPolicy) {
    this.snapshotPolicy = snapshotPolicy;
    return this;
  }

  /**
   * Output only. State of the volume
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the volume
   * @param state state or {@code null} for none
   */
  public Volume setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. State details of the volume
   * @return value or {@code null} for none
   */
  public java.lang.String getStateDetails() {
    return stateDetails;
  }

  /**
   * Output only. State details of the volume
   * @param stateDetails stateDetails or {@code null} for none
   */
  public Volume setStateDetails(java.lang.String stateDetails) {
    this.stateDetails = stateDetails;
    return this;
  }

  /**
   * Required. StoragePool name of the volume
   * @return value or {@code null} for none
   */
  public java.lang.String getStoragePool() {
    return storagePool;
  }

  /**
   * Required. StoragePool name of the volume
   * @param storagePool storagePool or {@code null} for none
   */
  public Volume setStoragePool(java.lang.String storagePool) {
    this.storagePool = storagePool;
    return this;
  }

  /**
   * Tiering policy for the volume.
   * @return value or {@code null} for none
   */
  public TieringPolicy getTieringPolicy() {
    return tieringPolicy;
  }

  /**
   * Tiering policy for the volume.
   * @param tieringPolicy tieringPolicy or {@code null} for none
   */
  public Volume setTieringPolicy(TieringPolicy tieringPolicy) {
    this.tieringPolicy = tieringPolicy;
    return this;
  }

  /**
   * Optional. Default unix style permission (e.g. 777) the mount point will be created with.
   * Applicable for NFS protocol types only.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnixPermissions() {
    return unixPermissions;
  }

  /**
   * Optional. Default unix style permission (e.g. 777) the mount point will be created with.
   * Applicable for NFS protocol types only.
   * @param unixPermissions unixPermissions or {@code null} for none
   */
  public Volume setUnixPermissions(java.lang.String unixPermissions) {
    this.unixPermissions = unixPermissions;
    return this;
  }

  /**
   * Output only. Used capacity in GIB of the volume. This is computed periodically and it does not
   * represent the realtime usage.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUsedGib() {
    return usedGib;
  }

  /**
   * Output only. Used capacity in GIB of the volume. This is computed periodically and it does not
   * represent the realtime usage.
   * @param usedGib usedGib or {@code null} for none
   */
  public Volume setUsedGib(java.lang.Long usedGib) {
    this.usedGib = usedGib;
    return this;
  }

  /**
   * Output only. Specifies the active zone for regional volume.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Output only. Specifies the active zone for regional volume.
   * @param zone zone or {@code null} for none
   */
  public Volume setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public Volume set(String fieldName, Object value) {
    return (Volume) super.set(fieldName, value);
  }

  @Override
  public Volume clone() {
    return (Volume) super.clone();
  }

}
