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

package com.google.api.services.language.v2.model;

/**
 * Model definition for XPSTablesTrainingOperationMetadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class XPSTablesTrainingOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Current stage of creating model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String createModelStage;

  /**
   * The optimization objective for model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String optimizationObjective;

  /**
   * This field is for training. When the operation is terminated successfully, AutoML Backend post
   * this field to operation metadata in spanner. If the metadata has no trials returned, the
   * training operation is supposed to be a failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<XPSTuningTrial> topTrials;

  /**
   * Creating model budget.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long trainBudgetMilliNodeHours;

  /**
   * This field records the training objective value with respect to time, giving insight into how
   * the model architecture search is performing as training time elapses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<XPSTrainingObjectivePoint> trainingObjectivePoints;

  /**
   * Timestamp when training process starts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String trainingStartTime;

  /**
   * Current stage of creating model.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreateModelStage() {
    return createModelStage;
  }

  /**
   * Current stage of creating model.
   * @param createModelStage createModelStage or {@code null} for none
   */
  public XPSTablesTrainingOperationMetadata setCreateModelStage(java.lang.String createModelStage) {
    this.createModelStage = createModelStage;
    return this;
  }

  /**
   * The optimization objective for model.
   * @return value or {@code null} for none
   */
  public java.lang.String getOptimizationObjective() {
    return optimizationObjective;
  }

  /**
   * The optimization objective for model.
   * @param optimizationObjective optimizationObjective or {@code null} for none
   */
  public XPSTablesTrainingOperationMetadata setOptimizationObjective(java.lang.String optimizationObjective) {
    this.optimizationObjective = optimizationObjective;
    return this;
  }

  /**
   * This field is for training. When the operation is terminated successfully, AutoML Backend post
   * this field to operation metadata in spanner. If the metadata has no trials returned, the
   * training operation is supposed to be a failure.
   * @return value or {@code null} for none
   */
  public java.util.List<XPSTuningTrial> getTopTrials() {
    return topTrials;
  }

  /**
   * This field is for training. When the operation is terminated successfully, AutoML Backend post
   * this field to operation metadata in spanner. If the metadata has no trials returned, the
   * training operation is supposed to be a failure.
   * @param topTrials topTrials or {@code null} for none
   */
  public XPSTablesTrainingOperationMetadata setTopTrials(java.util.List<XPSTuningTrial> topTrials) {
    this.topTrials = topTrials;
    return this;
  }

  /**
   * Creating model budget.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTrainBudgetMilliNodeHours() {
    return trainBudgetMilliNodeHours;
  }

  /**
   * Creating model budget.
   * @param trainBudgetMilliNodeHours trainBudgetMilliNodeHours or {@code null} for none
   */
  public XPSTablesTrainingOperationMetadata setTrainBudgetMilliNodeHours(java.lang.Long trainBudgetMilliNodeHours) {
    this.trainBudgetMilliNodeHours = trainBudgetMilliNodeHours;
    return this;
  }

  /**
   * This field records the training objective value with respect to time, giving insight into how
   * the model architecture search is performing as training time elapses.
   * @return value or {@code null} for none
   */
  public java.util.List<XPSTrainingObjectivePoint> getTrainingObjectivePoints() {
    return trainingObjectivePoints;
  }

  /**
   * This field records the training objective value with respect to time, giving insight into how
   * the model architecture search is performing as training time elapses.
   * @param trainingObjectivePoints trainingObjectivePoints or {@code null} for none
   */
  public XPSTablesTrainingOperationMetadata setTrainingObjectivePoints(java.util.List<XPSTrainingObjectivePoint> trainingObjectivePoints) {
    this.trainingObjectivePoints = trainingObjectivePoints;
    return this;
  }

  /**
   * Timestamp when training process starts.
   * @return value or {@code null} for none
   */
  public String getTrainingStartTime() {
    return trainingStartTime;
  }

  /**
   * Timestamp when training process starts.
   * @param trainingStartTime trainingStartTime or {@code null} for none
   */
  public XPSTablesTrainingOperationMetadata setTrainingStartTime(String trainingStartTime) {
    this.trainingStartTime = trainingStartTime;
    return this;
  }

  @Override
  public XPSTablesTrainingOperationMetadata set(String fieldName, Object value) {
    return (XPSTablesTrainingOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public XPSTablesTrainingOperationMetadata clone() {
    return (XPSTablesTrainingOperationMetadata) super.clone();
  }

}
