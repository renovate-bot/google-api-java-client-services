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

package com.google.api.services.osconfig.v2.model;

/**
 * Message to configure the rollout at the zonal level for the OS policy assignment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OSPolicyAssignmentRollout extends com.google.api.client.json.GenericJson {

  /**
   * Required. The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FixedOrPercent disruptionBudget;

  /**
   * Required. This determines the minimum duration of time to wait after the configuration changes
   * are applied through the current rollout. A VM continues to count towards the
   * `disruption_budget` at least until this duration of time has passed after configuration changes
   * are applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String minWaitDuration;

  /**
   * Required. The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
   * @return value or {@code null} for none
   */
  public FixedOrPercent getDisruptionBudget() {
    return disruptionBudget;
  }

  /**
   * Required. The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
   * @param disruptionBudget disruptionBudget or {@code null} for none
   */
  public OSPolicyAssignmentRollout setDisruptionBudget(FixedOrPercent disruptionBudget) {
    this.disruptionBudget = disruptionBudget;
    return this;
  }

  /**
   * Required. This determines the minimum duration of time to wait after the configuration changes
   * are applied through the current rollout. A VM continues to count towards the
   * `disruption_budget` at least until this duration of time has passed after configuration changes
   * are applied.
   * @return value or {@code null} for none
   */
  public String getMinWaitDuration() {
    return minWaitDuration;
  }

  /**
   * Required. This determines the minimum duration of time to wait after the configuration changes
   * are applied through the current rollout. A VM continues to count towards the
   * `disruption_budget` at least until this duration of time has passed after configuration changes
   * are applied.
   * @param minWaitDuration minWaitDuration or {@code null} for none
   */
  public OSPolicyAssignmentRollout setMinWaitDuration(String minWaitDuration) {
    this.minWaitDuration = minWaitDuration;
    return this;
  }

  @Override
  public OSPolicyAssignmentRollout set(String fieldName, Object value) {
    return (OSPolicyAssignmentRollout) super.set(fieldName, value);
  }

  @Override
  public OSPolicyAssignmentRollout clone() {
    return (OSPolicyAssignmentRollout) super.clone();
  }

}
