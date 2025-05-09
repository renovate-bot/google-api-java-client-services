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

package com.google.api.services.vmwareengine.v1.model;

/**
 * Describes Private cloud Upgrade.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VMware Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Upgrade extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Output Only. The list of component upgrades.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VmwareUpgradeComponent> componentUpgrades;

  /**
   * Output only. Output Only. Creation time of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Output Only. The description of the upgrade. This is used to provide additional
   * information about the private cloud upgrade, such as the upgrade's purpose, the changes
   * included in the upgrade, or any other relevant information about the upgrade.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. Output Only. End time of the upgrade.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. Output Only. The estimated total duration of the upgrade. This information can be
   * used to plan or schedule upgrades to minimize disruptions. Please note that the estimated
   * duration is only an estimate. The actual upgrade duration may vary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String estimatedDuration;

  /**
   * The etag for the upgrade resource. If this is provided on update, it must match the server's
   * etag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. Identifier. The resource name of the private cloud `Upgrade`. Resource names are
   * schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names. For example: `projects/my-
   * project/locations/us-west1-a/privateClouds/my-cloud/upgrades/my-upgrade`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Schedule details for the upgrade.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Schedule schedule;

  /**
   * Output only. Output Only. The start version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startVersion;

  /**
   * Output only. The current state of the upgrade.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Output Only. The target version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetVersion;

  /**
   * Output only. Output Only. The type of upgrade.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. System-generated unique identifier for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. Output Only. Last update time of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Output only. Output Only. The list of component upgrades.
   * @return value or {@code null} for none
   */
  public java.util.List<VmwareUpgradeComponent> getComponentUpgrades() {
    return componentUpgrades;
  }

  /**
   * Output only. Output Only. The list of component upgrades.
   * @param componentUpgrades componentUpgrades or {@code null} for none
   */
  public Upgrade setComponentUpgrades(java.util.List<VmwareUpgradeComponent> componentUpgrades) {
    this.componentUpgrades = componentUpgrades;
    return this;
  }

  /**
   * Output only. Output Only. Creation time of this resource.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Output Only. Creation time of this resource.
   * @param createTime createTime or {@code null} for none
   */
  public Upgrade setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Output Only. The description of the upgrade. This is used to provide additional
   * information about the private cloud upgrade, such as the upgrade's purpose, the changes
   * included in the upgrade, or any other relevant information about the upgrade.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Output only. Output Only. The description of the upgrade. This is used to provide additional
   * information about the private cloud upgrade, such as the upgrade's purpose, the changes
   * included in the upgrade, or any other relevant information about the upgrade.
   * @param description description or {@code null} for none
   */
  public Upgrade setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. Output Only. End time of the upgrade.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. Output Only. End time of the upgrade.
   * @param endTime endTime or {@code null} for none
   */
  public Upgrade setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. Output Only. The estimated total duration of the upgrade. This information can be
   * used to plan or schedule upgrades to minimize disruptions. Please note that the estimated
   * duration is only an estimate. The actual upgrade duration may vary.
   * @return value or {@code null} for none
   */
  public String getEstimatedDuration() {
    return estimatedDuration;
  }

  /**
   * Output only. Output Only. The estimated total duration of the upgrade. This information can be
   * used to plan or schedule upgrades to minimize disruptions. Please note that the estimated
   * duration is only an estimate. The actual upgrade duration may vary.
   * @param estimatedDuration estimatedDuration or {@code null} for none
   */
  public Upgrade setEstimatedDuration(String estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
    return this;
  }

  /**
   * The etag for the upgrade resource. If this is provided on update, it must match the server's
   * etag.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The etag for the upgrade resource. If this is provided on update, it must match the server's
   * etag.
   * @param etag etag or {@code null} for none
   */
  public Upgrade setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. Identifier. The resource name of the private cloud `Upgrade`. Resource names are
   * schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names. For example: `projects/my-
   * project/locations/us-west1-a/privateClouds/my-cloud/upgrades/my-upgrade`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Identifier. The resource name of the private cloud `Upgrade`. Resource names are
   * schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names. For example: `projects/my-
   * project/locations/us-west1-a/privateClouds/my-cloud/upgrades/my-upgrade`
   * @param name name or {@code null} for none
   */
  public Upgrade setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Schedule details for the upgrade.
   * @return value or {@code null} for none
   */
  public Schedule getSchedule() {
    return schedule;
  }

  /**
   * Schedule details for the upgrade.
   * @param schedule schedule or {@code null} for none
   */
  public Upgrade setSchedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Output only. Output Only. The start version
   * @return value or {@code null} for none
   */
  public java.lang.String getStartVersion() {
    return startVersion;
  }

  /**
   * Output only. Output Only. The start version
   * @param startVersion startVersion or {@code null} for none
   */
  public Upgrade setStartVersion(java.lang.String startVersion) {
    this.startVersion = startVersion;
    return this;
  }

  /**
   * Output only. The current state of the upgrade.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the upgrade.
   * @param state state or {@code null} for none
   */
  public Upgrade setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Output Only. The target version
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetVersion() {
    return targetVersion;
  }

  /**
   * Output only. Output Only. The target version
   * @param targetVersion targetVersion or {@code null} for none
   */
  public Upgrade setTargetVersion(java.lang.String targetVersion) {
    this.targetVersion = targetVersion;
    return this;
  }

  /**
   * Output only. Output Only. The type of upgrade.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Output only. Output Only. The type of upgrade.
   * @param type type or {@code null} for none
   */
  public Upgrade setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. System-generated unique identifier for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. System-generated unique identifier for the resource.
   * @param uid uid or {@code null} for none
   */
  public Upgrade setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. Output Only. Last update time of this resource.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Output Only. Last update time of this resource.
   * @param updateTime updateTime or {@code null} for none
   */
  public Upgrade setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Output only.
   * @param version version or {@code null} for none
   */
  public Upgrade setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public Upgrade set(String fieldName, Object value) {
    return (Upgrade) super.set(fieldName, value);
  }

  @Override
  public Upgrade clone() {
    return (Upgrade) super.clone();
  }

}
