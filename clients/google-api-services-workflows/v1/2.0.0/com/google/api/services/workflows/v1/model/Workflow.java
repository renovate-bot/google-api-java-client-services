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

package com.google.api.services.workflows.v1.model;

/**
 * Workflow program to be executed by Workflows.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Workflows API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Workflow extends com.google.api.client.json.GenericJson {

  /**
   * Output only. A list of all KMS crypto keys used to encrypt or decrypt the data associated with
   * the workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allKmsKeys;

  /**
   * Output only. A list of all KMS crypto key versions used to encrypt or decrypt the data
   * associated with the workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allKmsKeysVersions;

  /**
   * Optional. Describes the level of platform logging to apply to calls and call responses during
   * executions of this workflow. If both the workflow and the execution specify a logging level,
   * the execution level takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String callLogLevel;

  /**
   * Output only. The timestamp for when the workflow was created. This is a workflow-wide field and
   * is not tied to a specific revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. The resource name of a KMS crypto key used to encrypt or decrypt the data associated
   * with the workflow. Format:
   * projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey} Using `-` as
   * a wildcard for the `{project}` or not providing one at all will infer the project from the
   * account. If not provided, data associated with the workflow will not be CMEK-encrypted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cryptoKeyName;

  /**
   * Output only. The resource name of a KMS crypto key version used to encrypt or decrypt the data
   * associated with the workflow. Format: projects/{project}/locations/{location}/keyRings/{keyRing
   * }/cryptoKeys/{cryptoKey}/cryptoKeyVersions/{cryptoKeyVersion}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cryptoKeyVersion;

  /**
   * Description of the workflow provided by the user. Must be at most 1000 Unicode characters long.
   * This is a workflow-wide field and is not tied to a specific revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Describes the execution history level to apply to this workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionHistoryLevel;

  /**
   * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values
   * can be no longer than 63 characters and can only contain lowercase letters, numeric characters,
   * underscores, and dashes. Label keys must start with a letter. International characters are
   * allowed. This is a workflow-wide field and is not tied to a specific revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The resource name of the workflow. Format:
   * projects/{project}/locations/{location}/workflows/{workflow}. This is a workflow-wide field and
   * is not tied to a specific revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The timestamp for the latest revision of the workflow's creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String revisionCreateTime;

  /**
   * Output only. The revision of the workflow. A new revision of a workflow is created as a result
   * of updating the following properties of a workflow: - Service account - Workflow code to be
   * executed The format is "000001-a4d", where the first six characters define the zero-padded
   * revision ordinal number. They are followed by a hyphen and three hexadecimal random characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * The service account associated with the latest workflow version. This service account
   * represents the identity of the workflow and determines what permissions the workflow has.
   * Format: projects/{project}/serviceAccounts/{account} or {account} Using `-` as a wildcard for
   * the `{project}` or not providing one at all will infer the project from the account. The
   * `{account}` value can be the `email` address or the `unique_id` of the service account. If not
   * provided, workflow will use the project's default service account. Modifying this field for an
   * existing workflow results in a new workflow revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Workflow code to be executed. The size limit is 128KB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceContents;

  /**
   * Output only. State of the workflow deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Error regarding the state of the workflow. For example, this field will have error
   * details if the execution data is unavailable due to revoked KMS key permissions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StateError stateError;

  /**
   * Optional. Input only. Immutable. Tags associated with this workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> tags;

  /**
   * Output only. The timestamp for when the workflow was last updated. This is a workflow-wide
   * field and is not tied to a specific revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. User-defined environment variables associated with this workflow revision. This map
   * has a maximum length of 20. Each string can take up to 4KiB. Keys cannot be empty strings and
   * cannot start with "GOOGLE" or "WORKFLOWS".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> userEnvVars;

  /**
   * Output only. A list of all KMS crypto keys used to encrypt or decrypt the data associated with
   * the workflow.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllKmsKeys() {
    return allKmsKeys;
  }

  /**
   * Output only. A list of all KMS crypto keys used to encrypt or decrypt the data associated with
   * the workflow.
   * @param allKmsKeys allKmsKeys or {@code null} for none
   */
  public Workflow setAllKmsKeys(java.util.List<java.lang.String> allKmsKeys) {
    this.allKmsKeys = allKmsKeys;
    return this;
  }

  /**
   * Output only. A list of all KMS crypto key versions used to encrypt or decrypt the data
   * associated with the workflow.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllKmsKeysVersions() {
    return allKmsKeysVersions;
  }

  /**
   * Output only. A list of all KMS crypto key versions used to encrypt or decrypt the data
   * associated with the workflow.
   * @param allKmsKeysVersions allKmsKeysVersions or {@code null} for none
   */
  public Workflow setAllKmsKeysVersions(java.util.List<java.lang.String> allKmsKeysVersions) {
    this.allKmsKeysVersions = allKmsKeysVersions;
    return this;
  }

  /**
   * Optional. Describes the level of platform logging to apply to calls and call responses during
   * executions of this workflow. If both the workflow and the execution specify a logging level,
   * the execution level takes precedence.
   * @return value or {@code null} for none
   */
  public java.lang.String getCallLogLevel() {
    return callLogLevel;
  }

  /**
   * Optional. Describes the level of platform logging to apply to calls and call responses during
   * executions of this workflow. If both the workflow and the execution specify a logging level,
   * the execution level takes precedence.
   * @param callLogLevel callLogLevel or {@code null} for none
   */
  public Workflow setCallLogLevel(java.lang.String callLogLevel) {
    this.callLogLevel = callLogLevel;
    return this;
  }

  /**
   * Output only. The timestamp for when the workflow was created. This is a workflow-wide field and
   * is not tied to a specific revision.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp for when the workflow was created. This is a workflow-wide field and
   * is not tied to a specific revision.
   * @param createTime createTime or {@code null} for none
   */
  public Workflow setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. The resource name of a KMS crypto key used to encrypt or decrypt the data associated
   * with the workflow. Format:
   * projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey} Using `-` as
   * a wildcard for the `{project}` or not providing one at all will infer the project from the
   * account. If not provided, data associated with the workflow will not be CMEK-encrypted.
   * @return value or {@code null} for none
   */
  public java.lang.String getCryptoKeyName() {
    return cryptoKeyName;
  }

  /**
   * Optional. The resource name of a KMS crypto key used to encrypt or decrypt the data associated
   * with the workflow. Format:
   * projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey} Using `-` as
   * a wildcard for the `{project}` or not providing one at all will infer the project from the
   * account. If not provided, data associated with the workflow will not be CMEK-encrypted.
   * @param cryptoKeyName cryptoKeyName or {@code null} for none
   */
  public Workflow setCryptoKeyName(java.lang.String cryptoKeyName) {
    this.cryptoKeyName = cryptoKeyName;
    return this;
  }

  /**
   * Output only. The resource name of a KMS crypto key version used to encrypt or decrypt the data
   * associated with the workflow. Format: projects/{project}/locations/{location}/keyRings/{keyRing
   * }/cryptoKeys/{cryptoKey}/cryptoKeyVersions/{cryptoKeyVersion}
   * @return value or {@code null} for none
   */
  public java.lang.String getCryptoKeyVersion() {
    return cryptoKeyVersion;
  }

  /**
   * Output only. The resource name of a KMS crypto key version used to encrypt or decrypt the data
   * associated with the workflow. Format: projects/{project}/locations/{location}/keyRings/{keyRing
   * }/cryptoKeys/{cryptoKey}/cryptoKeyVersions/{cryptoKeyVersion}
   * @param cryptoKeyVersion cryptoKeyVersion or {@code null} for none
   */
  public Workflow setCryptoKeyVersion(java.lang.String cryptoKeyVersion) {
    this.cryptoKeyVersion = cryptoKeyVersion;
    return this;
  }

  /**
   * Description of the workflow provided by the user. Must be at most 1000 Unicode characters long.
   * This is a workflow-wide field and is not tied to a specific revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the workflow provided by the user. Must be at most 1000 Unicode characters long.
   * This is a workflow-wide field and is not tied to a specific revision.
   * @param description description or {@code null} for none
   */
  public Workflow setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Describes the execution history level to apply to this workflow.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionHistoryLevel() {
    return executionHistoryLevel;
  }

  /**
   * Optional. Describes the execution history level to apply to this workflow.
   * @param executionHistoryLevel executionHistoryLevel or {@code null} for none
   */
  public Workflow setExecutionHistoryLevel(java.lang.String executionHistoryLevel) {
    this.executionHistoryLevel = executionHistoryLevel;
    return this;
  }

  /**
   * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values
   * can be no longer than 63 characters and can only contain lowercase letters, numeric characters,
   * underscores, and dashes. Label keys must start with a letter. International characters are
   * allowed. This is a workflow-wide field and is not tied to a specific revision.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values
   * can be no longer than 63 characters and can only contain lowercase letters, numeric characters,
   * underscores, and dashes. Label keys must start with a letter. International characters are
   * allowed. This is a workflow-wide field and is not tied to a specific revision.
   * @param labels labels or {@code null} for none
   */
  public Workflow setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The resource name of the workflow. Format:
   * projects/{project}/locations/{location}/workflows/{workflow}. This is a workflow-wide field and
   * is not tied to a specific revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the workflow. Format:
   * projects/{project}/locations/{location}/workflows/{workflow}. This is a workflow-wide field and
   * is not tied to a specific revision.
   * @param name name or {@code null} for none
   */
  public Workflow setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The timestamp for the latest revision of the workflow's creation.
   * @return value or {@code null} for none
   */
  public String getRevisionCreateTime() {
    return revisionCreateTime;
  }

  /**
   * Output only. The timestamp for the latest revision of the workflow's creation.
   * @param revisionCreateTime revisionCreateTime or {@code null} for none
   */
  public Workflow setRevisionCreateTime(String revisionCreateTime) {
    this.revisionCreateTime = revisionCreateTime;
    return this;
  }

  /**
   * Output only. The revision of the workflow. A new revision of a workflow is created as a result
   * of updating the following properties of a workflow: - Service account - Workflow code to be
   * executed The format is "000001-a4d", where the first six characters define the zero-padded
   * revision ordinal number. They are followed by a hyphen and three hexadecimal random characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * Output only. The revision of the workflow. A new revision of a workflow is created as a result
   * of updating the following properties of a workflow: - Service account - Workflow code to be
   * executed The format is "000001-a4d", where the first six characters define the zero-padded
   * revision ordinal number. They are followed by a hyphen and three hexadecimal random characters.
   * @param revisionId revisionId or {@code null} for none
   */
  public Workflow setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * The service account associated with the latest workflow version. This service account
   * represents the identity of the workflow and determines what permissions the workflow has.
   * Format: projects/{project}/serviceAccounts/{account} or {account} Using `-` as a wildcard for
   * the `{project}` or not providing one at all will infer the project from the account. The
   * `{account}` value can be the `email` address or the `unique_id` of the service account. If not
   * provided, workflow will use the project's default service account. Modifying this field for an
   * existing workflow results in a new workflow revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * The service account associated with the latest workflow version. This service account
   * represents the identity of the workflow and determines what permissions the workflow has.
   * Format: projects/{project}/serviceAccounts/{account} or {account} Using `-` as a wildcard for
   * the `{project}` or not providing one at all will infer the project from the account. The
   * `{account}` value can be the `email` address or the `unique_id` of the service account. If not
   * provided, workflow will use the project's default service account. Modifying this field for an
   * existing workflow results in a new workflow revision.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public Workflow setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Workflow code to be executed. The size limit is 128KB.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceContents() {
    return sourceContents;
  }

  /**
   * Workflow code to be executed. The size limit is 128KB.
   * @param sourceContents sourceContents or {@code null} for none
   */
  public Workflow setSourceContents(java.lang.String sourceContents) {
    this.sourceContents = sourceContents;
    return this;
  }

  /**
   * Output only. State of the workflow deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the workflow deployment.
   * @param state state or {@code null} for none
   */
  public Workflow setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Error regarding the state of the workflow. For example, this field will have error
   * details if the execution data is unavailable due to revoked KMS key permissions.
   * @return value or {@code null} for none
   */
  public StateError getStateError() {
    return stateError;
  }

  /**
   * Output only. Error regarding the state of the workflow. For example, this field will have error
   * details if the execution data is unavailable due to revoked KMS key permissions.
   * @param stateError stateError or {@code null} for none
   */
  public Workflow setStateError(StateError stateError) {
    this.stateError = stateError;
    return this;
  }

  /**
   * Optional. Input only. Immutable. Tags associated with this workflow.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getTags() {
    return tags;
  }

  /**
   * Optional. Input only. Immutable. Tags associated with this workflow.
   * @param tags tags or {@code null} for none
   */
  public Workflow setTags(java.util.Map<String, java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Output only. The timestamp for when the workflow was last updated. This is a workflow-wide
   * field and is not tied to a specific revision.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp for when the workflow was last updated. This is a workflow-wide
   * field and is not tied to a specific revision.
   * @param updateTime updateTime or {@code null} for none
   */
  public Workflow setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Optional. User-defined environment variables associated with this workflow revision. This map
   * has a maximum length of 20. Each string can take up to 4KiB. Keys cannot be empty strings and
   * cannot start with "GOOGLE" or "WORKFLOWS".
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getUserEnvVars() {
    return userEnvVars;
  }

  /**
   * Optional. User-defined environment variables associated with this workflow revision. This map
   * has a maximum length of 20. Each string can take up to 4KiB. Keys cannot be empty strings and
   * cannot start with "GOOGLE" or "WORKFLOWS".
   * @param userEnvVars userEnvVars or {@code null} for none
   */
  public Workflow setUserEnvVars(java.util.Map<String, java.lang.String> userEnvVars) {
    this.userEnvVars = userEnvVars;
    return this;
  }

  @Override
  public Workflow set(String fieldName, Object value) {
    return (Workflow) super.set(fieldName, value);
  }

  @Override
  public Workflow clone() {
    return (Workflow) super.clone();
  }

}
