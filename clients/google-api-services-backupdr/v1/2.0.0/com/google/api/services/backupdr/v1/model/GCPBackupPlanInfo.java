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
 * GCPBackupPlanInfo captures the plan configuration details of Google Cloud resources at the time
 * of backup.
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
public final class GCPBackupPlanInfo extends com.google.api.client.json.GenericJson {

  /**
   * Resource name of backup plan by which workload is protected at the time of the backup. Format:
   * projects/{project}/locations/{location}/backupPlans/{backupPlanId}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backupPlan;

  /**
   * The user friendly id of the backup plan revision which triggered this backup in case of
   * scheduled backup or used for on demand backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backupPlanRevisionId;

  /**
   * Resource name of the backup plan revision which triggered this backup in case of scheduled
   * backup or used for on demand backup. Format:
   * projects/{project}/locations/{location}/backupPlans/{backupPlanId}/revisions/{revisionId}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backupPlanRevisionName;

  /**
   * The rule id of the backup plan which triggered this backup in case of scheduled backup or used
   * for
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backupPlanRuleId;

  /**
   * Resource name of backup plan by which workload is protected at the time of the backup. Format:
   * projects/{project}/locations/{location}/backupPlans/{backupPlanId}
   * @return value or {@code null} for none
   */
  public java.lang.String getBackupPlan() {
    return backupPlan;
  }

  /**
   * Resource name of backup plan by which workload is protected at the time of the backup. Format:
   * projects/{project}/locations/{location}/backupPlans/{backupPlanId}
   * @param backupPlan backupPlan or {@code null} for none
   */
  public GCPBackupPlanInfo setBackupPlan(java.lang.String backupPlan) {
    this.backupPlan = backupPlan;
    return this;
  }

  /**
   * The user friendly id of the backup plan revision which triggered this backup in case of
   * scheduled backup or used for on demand backup.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackupPlanRevisionId() {
    return backupPlanRevisionId;
  }

  /**
   * The user friendly id of the backup plan revision which triggered this backup in case of
   * scheduled backup or used for on demand backup.
   * @param backupPlanRevisionId backupPlanRevisionId or {@code null} for none
   */
  public GCPBackupPlanInfo setBackupPlanRevisionId(java.lang.String backupPlanRevisionId) {
    this.backupPlanRevisionId = backupPlanRevisionId;
    return this;
  }

  /**
   * Resource name of the backup plan revision which triggered this backup in case of scheduled
   * backup or used for on demand backup. Format:
   * projects/{project}/locations/{location}/backupPlans/{backupPlanId}/revisions/{revisionId}
   * @return value or {@code null} for none
   */
  public java.lang.String getBackupPlanRevisionName() {
    return backupPlanRevisionName;
  }

  /**
   * Resource name of the backup plan revision which triggered this backup in case of scheduled
   * backup or used for on demand backup. Format:
   * projects/{project}/locations/{location}/backupPlans/{backupPlanId}/revisions/{revisionId}
   * @param backupPlanRevisionName backupPlanRevisionName or {@code null} for none
   */
  public GCPBackupPlanInfo setBackupPlanRevisionName(java.lang.String backupPlanRevisionName) {
    this.backupPlanRevisionName = backupPlanRevisionName;
    return this;
  }

  /**
   * The rule id of the backup plan which triggered this backup in case of scheduled backup or used
   * for
   * @return value or {@code null} for none
   */
  public java.lang.String getBackupPlanRuleId() {
    return backupPlanRuleId;
  }

  /**
   * The rule id of the backup plan which triggered this backup in case of scheduled backup or used
   * for
   * @param backupPlanRuleId backupPlanRuleId or {@code null} for none
   */
  public GCPBackupPlanInfo setBackupPlanRuleId(java.lang.String backupPlanRuleId) {
    this.backupPlanRuleId = backupPlanRuleId;
    return this;
  }

  @Override
  public GCPBackupPlanInfo set(String fieldName, Object value) {
    return (GCPBackupPlanInfo) super.set(fieldName, value);
  }

  @Override
  public GCPBackupPlanInfo clone() {
    return (GCPBackupPlanInfo) super.clone();
  }

}
