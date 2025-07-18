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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * A dimension determines the grouping key for the query. In SQL terms, these would be part of both
 * the "SELECT" and "GROUP BY" clauses.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1Dimension extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Metadata about the agent dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1DimensionAgentDimensionMetadata agentDimensionMetadata;

  /**
   * The key of the dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dimensionKey;

  /**
   * Output only. Metadata about the issue dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1DimensionIssueDimensionMetadata issueDimensionMetadata;

  /**
   * Output only. Metadata about the QA question-answer dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1DimensionQaQuestionAnswerDimensionMetadata qaQuestionAnswerDimensionMetadata;

  /**
   * Output only. Metadata about the QA question dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1DimensionQaQuestionDimensionMetadata qaQuestionDimensionMetadata;

  /**
   * Output only. Metadata about the agent dimension.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1DimensionAgentDimensionMetadata getAgentDimensionMetadata() {
    return agentDimensionMetadata;
  }

  /**
   * Output only. Metadata about the agent dimension.
   * @param agentDimensionMetadata agentDimensionMetadata or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1Dimension setAgentDimensionMetadata(GoogleCloudContactcenterinsightsV1DimensionAgentDimensionMetadata agentDimensionMetadata) {
    this.agentDimensionMetadata = agentDimensionMetadata;
    return this;
  }

  /**
   * The key of the dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getDimensionKey() {
    return dimensionKey;
  }

  /**
   * The key of the dimension.
   * @param dimensionKey dimensionKey or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1Dimension setDimensionKey(java.lang.String dimensionKey) {
    this.dimensionKey = dimensionKey;
    return this;
  }

  /**
   * Output only. Metadata about the issue dimension.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1DimensionIssueDimensionMetadata getIssueDimensionMetadata() {
    return issueDimensionMetadata;
  }

  /**
   * Output only. Metadata about the issue dimension.
   * @param issueDimensionMetadata issueDimensionMetadata or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1Dimension setIssueDimensionMetadata(GoogleCloudContactcenterinsightsV1DimensionIssueDimensionMetadata issueDimensionMetadata) {
    this.issueDimensionMetadata = issueDimensionMetadata;
    return this;
  }

  /**
   * Output only. Metadata about the QA question-answer dimension.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1DimensionQaQuestionAnswerDimensionMetadata getQaQuestionAnswerDimensionMetadata() {
    return qaQuestionAnswerDimensionMetadata;
  }

  /**
   * Output only. Metadata about the QA question-answer dimension.
   * @param qaQuestionAnswerDimensionMetadata qaQuestionAnswerDimensionMetadata or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1Dimension setQaQuestionAnswerDimensionMetadata(GoogleCloudContactcenterinsightsV1DimensionQaQuestionAnswerDimensionMetadata qaQuestionAnswerDimensionMetadata) {
    this.qaQuestionAnswerDimensionMetadata = qaQuestionAnswerDimensionMetadata;
    return this;
  }

  /**
   * Output only. Metadata about the QA question dimension.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1DimensionQaQuestionDimensionMetadata getQaQuestionDimensionMetadata() {
    return qaQuestionDimensionMetadata;
  }

  /**
   * Output only. Metadata about the QA question dimension.
   * @param qaQuestionDimensionMetadata qaQuestionDimensionMetadata or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1Dimension setQaQuestionDimensionMetadata(GoogleCloudContactcenterinsightsV1DimensionQaQuestionDimensionMetadata qaQuestionDimensionMetadata) {
    this.qaQuestionDimensionMetadata = qaQuestionDimensionMetadata;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1Dimension set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1Dimension) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1Dimension clone() {
    return (GoogleCloudContactcenterinsightsV1Dimension) super.clone();
  }

}
