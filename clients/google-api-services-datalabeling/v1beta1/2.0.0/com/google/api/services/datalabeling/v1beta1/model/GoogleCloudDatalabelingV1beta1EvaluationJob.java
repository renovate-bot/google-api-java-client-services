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

package com.google.api.services.datalabeling.v1beta1.model;

/**
 * Defines an evaluation job that runs periodically to generate Evaluations. [Creating an evaluation
 * job](/ml-engine/docs/continuous-evaluation/create-job) is the starting point for using continuous
 * evaluation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1EvaluationJob extends com.google.api.client.json.GenericJson {

  /**
   * Required. Name of the AnnotationSpecSet describing all the labels that your machine learning
   * model outputs. You must create this resource before you create an evaluation job and provide
   * its name in the following format:
   * "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String annotationSpecSet;

  /**
   * Output only. Every time the evaluation job runs and an error occurs, the failed attempt is
   * appended to this array.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDatalabelingV1beta1Attempt> attempts;

  static {
    // hack to force ProGuard to consider GoogleCloudDatalabelingV1beta1Attempt used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDatalabelingV1beta1Attempt.class);
  }

  /**
   * Output only. Timestamp of when this evaluation job was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. Description of the job. The description can be up to 25,000 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. Configuration details for the evaluation job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDatalabelingV1beta1EvaluationJobConfig evaluationJobConfig;

  /**
   * Required. Whether you want Data Labeling Service to provide ground truth labels for prediction
   * input. If you want the service to assign human labelers to annotate your data, set this to
   * `true`. If you want to provide your own ground truth labels in the evaluation job's BigQuery
   * table, set this to `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean labelMissingGroundTruth;

  /**
   * Required. The [AI Platform Prediction model version](/ml-engine/docs/prediction-overview) to be
   * evaluated. Prediction input and output is sampled from this model version. When creating an
   * evaluation job, specify the model version in the following format:
   * "projects/{project_id}/models/{model_name}/versions/{version_name}" There can only be one
   * evaluation job per model version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelVersion;

  /**
   * Output only. After you create a job, Data Labeling Service assigns a name to the job with the
   * following format: "projects/{project_id}/evaluationJobs/ {evaluation_job_id}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Describes the interval at which the job runs. This interval must be at least 1 day,
   * and it is rounded to the nearest day. For example, if you specify a 50-hour interval, the job
   * runs every 2 days. You can provide the schedule in [crontab
   * format](/scheduler/docs/configuring/cron-job-schedules) or in an [English-like
   * format](/appengine/docs/standard/python/config/cronref#schedule_format). Regardless of what you
   * specify, the job will run at 10:00 AM UTC. Only the interval from this schedule is used, not
   * the specific time of day.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schedule;

  /**
   * Output only. Describes the current state of the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. Name of the AnnotationSpecSet describing all the labels that your machine learning
   * model outputs. You must create this resource before you create an evaluation job and provide
   * its name in the following format:
   * "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
   * @return value or {@code null} for none
   */
  public java.lang.String getAnnotationSpecSet() {
    return annotationSpecSet;
  }

  /**
   * Required. Name of the AnnotationSpecSet describing all the labels that your machine learning
   * model outputs. You must create this resource before you create an evaluation job and provide
   * its name in the following format:
   * "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
   * @param annotationSpecSet annotationSpecSet or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJob setAnnotationSpecSet(java.lang.String annotationSpecSet) {
    this.annotationSpecSet = annotationSpecSet;
    return this;
  }

  /**
   * Output only. Every time the evaluation job runs and an error occurs, the failed attempt is
   * appended to this array.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDatalabelingV1beta1Attempt> getAttempts() {
    return attempts;
  }

  /**
   * Output only. Every time the evaluation job runs and an error occurs, the failed attempt is
   * appended to this array.
   * @param attempts attempts or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJob setAttempts(java.util.List<GoogleCloudDatalabelingV1beta1Attempt> attempts) {
    this.attempts = attempts;
    return this;
  }

  /**
   * Output only. Timestamp of when this evaluation job was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp of when this evaluation job was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJob setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. Description of the job. The description can be up to 25,000 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Required. Description of the job. The description can be up to 25,000 characters long.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJob setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. Configuration details for the evaluation job.
   * @return value or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJobConfig getEvaluationJobConfig() {
    return evaluationJobConfig;
  }

  /**
   * Required. Configuration details for the evaluation job.
   * @param evaluationJobConfig evaluationJobConfig or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJob setEvaluationJobConfig(GoogleCloudDatalabelingV1beta1EvaluationJobConfig evaluationJobConfig) {
    this.evaluationJobConfig = evaluationJobConfig;
    return this;
  }

  /**
   * Required. Whether you want Data Labeling Service to provide ground truth labels for prediction
   * input. If you want the service to assign human labelers to annotate your data, set this to
   * `true`. If you want to provide your own ground truth labels in the evaluation job's BigQuery
   * table, set this to `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLabelMissingGroundTruth() {
    return labelMissingGroundTruth;
  }

  /**
   * Required. Whether you want Data Labeling Service to provide ground truth labels for prediction
   * input. If you want the service to assign human labelers to annotate your data, set this to
   * `true`. If you want to provide your own ground truth labels in the evaluation job's BigQuery
   * table, set this to `false`.
   * @param labelMissingGroundTruth labelMissingGroundTruth or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJob setLabelMissingGroundTruth(java.lang.Boolean labelMissingGroundTruth) {
    this.labelMissingGroundTruth = labelMissingGroundTruth;
    return this;
  }

  /**
   * Required. The [AI Platform Prediction model version](/ml-engine/docs/prediction-overview) to be
   * evaluated. Prediction input and output is sampled from this model version. When creating an
   * evaluation job, specify the model version in the following format:
   * "projects/{project_id}/models/{model_name}/versions/{version_name}" There can only be one
   * evaluation job per model version.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelVersion() {
    return modelVersion;
  }

  /**
   * Required. The [AI Platform Prediction model version](/ml-engine/docs/prediction-overview) to be
   * evaluated. Prediction input and output is sampled from this model version. When creating an
   * evaluation job, specify the model version in the following format:
   * "projects/{project_id}/models/{model_name}/versions/{version_name}" There can only be one
   * evaluation job per model version.
   * @param modelVersion modelVersion or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJob setModelVersion(java.lang.String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  /**
   * Output only. After you create a job, Data Labeling Service assigns a name to the job with the
   * following format: "projects/{project_id}/evaluationJobs/ {evaluation_job_id}"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. After you create a job, Data Labeling Service assigns a name to the job with the
   * following format: "projects/{project_id}/evaluationJobs/ {evaluation_job_id}"
   * @param name name or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJob setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Describes the interval at which the job runs. This interval must be at least 1 day,
   * and it is rounded to the nearest day. For example, if you specify a 50-hour interval, the job
   * runs every 2 days. You can provide the schedule in [crontab
   * format](/scheduler/docs/configuring/cron-job-schedules) or in an [English-like
   * format](/appengine/docs/standard/python/config/cronref#schedule_format). Regardless of what you
   * specify, the job will run at 10:00 AM UTC. Only the interval from this schedule is used, not
   * the specific time of day.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchedule() {
    return schedule;
  }

  /**
   * Required. Describes the interval at which the job runs. This interval must be at least 1 day,
   * and it is rounded to the nearest day. For example, if you specify a 50-hour interval, the job
   * runs every 2 days. You can provide the schedule in [crontab
   * format](/scheduler/docs/configuring/cron-job-schedules) or in an [English-like
   * format](/appengine/docs/standard/python/config/cronref#schedule_format). Regardless of what you
   * specify, the job will run at 10:00 AM UTC. Only the interval from this schedule is used, not
   * the specific time of day.
   * @param schedule schedule or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJob setSchedule(java.lang.String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Output only. Describes the current state of the job.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Describes the current state of the job.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1EvaluationJob setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1EvaluationJob set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1EvaluationJob) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1EvaluationJob clone() {
    return (GoogleCloudDatalabelingV1beta1EvaluationJob) super.clone();
  }

}
