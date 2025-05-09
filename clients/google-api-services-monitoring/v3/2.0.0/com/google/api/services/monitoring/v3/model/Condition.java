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

package com.google.api.services.monitoring.v3.model;

/**
 * A condition is a true/false test that determines when an alerting policy should open an incident.
 * If a condition evaluates to true, it signifies that something is wrong.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Condition extends com.google.api.client.json.GenericJson {

  /**
   * A condition that checks that a time series continues to receive new data points.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricAbsence conditionAbsent;

  /**
   * A condition that checks for log messages matching given constraints. If set, no other
   * conditions can be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LogMatch conditionMatchedLog;

  /**
   * A condition that uses the Monitoring Query Language to define alerts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitoringQueryLanguageCondition conditionMonitoringQueryLanguage;

  /**
   * A condition that uses the Prometheus query language to define alerts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrometheusQueryLanguageCondition conditionPrometheusQueryLanguage;

  /**
   * A condition that periodically evaluates a SQL query result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SqlCondition conditionSql;

  /**
   * A condition that compares a time series against a threshold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricThreshold conditionThreshold;

  /**
   * A short name or phrase used to identify the condition in dashboards, notifications, and
   * incidents. To avoid confusion, don't use the same display name for multiple conditions in the
   * same policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required if the condition exists. The unique resource name for this condition. Its format is:
   * projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID]
   * [CONDITION_ID] is assigned by Cloud Monitoring when the condition is created as part of a new
   * or updated alerting policy.When calling the alertPolicies.create method, do not include the
   * name field in the conditions of the requested alerting policy. Cloud Monitoring creates the
   * condition identifiers and includes them in the new policy.When calling the alertPolicies.update
   * method to update a policy, including a condition name causes the existing condition to be
   * updated. Conditions without names are added to the updated policy. Existing conditions are
   * deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only
   * small changes, such as those to condition thresholds, durations, or trigger values. Otherwise,
   * treat the change as a new condition and let the existing condition be deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A condition that checks that a time series continues to receive new data points.
   * @return value or {@code null} for none
   */
  public MetricAbsence getConditionAbsent() {
    return conditionAbsent;
  }

  /**
   * A condition that checks that a time series continues to receive new data points.
   * @param conditionAbsent conditionAbsent or {@code null} for none
   */
  public Condition setConditionAbsent(MetricAbsence conditionAbsent) {
    this.conditionAbsent = conditionAbsent;
    return this;
  }

  /**
   * A condition that checks for log messages matching given constraints. If set, no other
   * conditions can be present.
   * @return value or {@code null} for none
   */
  public LogMatch getConditionMatchedLog() {
    return conditionMatchedLog;
  }

  /**
   * A condition that checks for log messages matching given constraints. If set, no other
   * conditions can be present.
   * @param conditionMatchedLog conditionMatchedLog or {@code null} for none
   */
  public Condition setConditionMatchedLog(LogMatch conditionMatchedLog) {
    this.conditionMatchedLog = conditionMatchedLog;
    return this;
  }

  /**
   * A condition that uses the Monitoring Query Language to define alerts.
   * @return value or {@code null} for none
   */
  public MonitoringQueryLanguageCondition getConditionMonitoringQueryLanguage() {
    return conditionMonitoringQueryLanguage;
  }

  /**
   * A condition that uses the Monitoring Query Language to define alerts.
   * @param conditionMonitoringQueryLanguage conditionMonitoringQueryLanguage or {@code null} for none
   */
  public Condition setConditionMonitoringQueryLanguage(MonitoringQueryLanguageCondition conditionMonitoringQueryLanguage) {
    this.conditionMonitoringQueryLanguage = conditionMonitoringQueryLanguage;
    return this;
  }

  /**
   * A condition that uses the Prometheus query language to define alerts.
   * @return value or {@code null} for none
   */
  public PrometheusQueryLanguageCondition getConditionPrometheusQueryLanguage() {
    return conditionPrometheusQueryLanguage;
  }

  /**
   * A condition that uses the Prometheus query language to define alerts.
   * @param conditionPrometheusQueryLanguage conditionPrometheusQueryLanguage or {@code null} for none
   */
  public Condition setConditionPrometheusQueryLanguage(PrometheusQueryLanguageCondition conditionPrometheusQueryLanguage) {
    this.conditionPrometheusQueryLanguage = conditionPrometheusQueryLanguage;
    return this;
  }

  /**
   * A condition that periodically evaluates a SQL query result.
   * @return value or {@code null} for none
   */
  public SqlCondition getConditionSql() {
    return conditionSql;
  }

  /**
   * A condition that periodically evaluates a SQL query result.
   * @param conditionSql conditionSql or {@code null} for none
   */
  public Condition setConditionSql(SqlCondition conditionSql) {
    this.conditionSql = conditionSql;
    return this;
  }

  /**
   * A condition that compares a time series against a threshold.
   * @return value or {@code null} for none
   */
  public MetricThreshold getConditionThreshold() {
    return conditionThreshold;
  }

  /**
   * A condition that compares a time series against a threshold.
   * @param conditionThreshold conditionThreshold or {@code null} for none
   */
  public Condition setConditionThreshold(MetricThreshold conditionThreshold) {
    this.conditionThreshold = conditionThreshold;
    return this;
  }

  /**
   * A short name or phrase used to identify the condition in dashboards, notifications, and
   * incidents. To avoid confusion, don't use the same display name for multiple conditions in the
   * same policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * A short name or phrase used to identify the condition in dashboards, notifications, and
   * incidents. To avoid confusion, don't use the same display name for multiple conditions in the
   * same policy.
   * @param displayName displayName or {@code null} for none
   */
  public Condition setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required if the condition exists. The unique resource name for this condition. Its format is:
   * projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID]
   * [CONDITION_ID] is assigned by Cloud Monitoring when the condition is created as part of a new
   * or updated alerting policy.When calling the alertPolicies.create method, do not include the
   * name field in the conditions of the requested alerting policy. Cloud Monitoring creates the
   * condition identifiers and includes them in the new policy.When calling the alertPolicies.update
   * method to update a policy, including a condition name causes the existing condition to be
   * updated. Conditions without names are added to the updated policy. Existing conditions are
   * deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only
   * small changes, such as those to condition thresholds, durations, or trigger values. Otherwise,
   * treat the change as a new condition and let the existing condition be deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required if the condition exists. The unique resource name for this condition. Its format is:
   * projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID]
   * [CONDITION_ID] is assigned by Cloud Monitoring when the condition is created as part of a new
   * or updated alerting policy.When calling the alertPolicies.create method, do not include the
   * name field in the conditions of the requested alerting policy. Cloud Monitoring creates the
   * condition identifiers and includes them in the new policy.When calling the alertPolicies.update
   * method to update a policy, including a condition name causes the existing condition to be
   * updated. Conditions without names are added to the updated policy. Existing conditions are
   * deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only
   * small changes, such as those to condition thresholds, durations, or trigger values. Otherwise,
   * treat the change as a new condition and let the existing condition be deleted.
   * @param name name or {@code null} for none
   */
  public Condition setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Condition set(String fieldName, Object value) {
    return (Condition) super.set(fieldName, value);
  }

  @Override
  public Condition clone() {
    return (Condition) super.clone();
  }

}
