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

package com.google.api.services.dataform.v1beta1.model;

/**
 * Represents a Dataform release configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataform API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReleaseConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If set, fields of `code_compilation_config` override the default compilation settings
   * that are specified in dataform.json.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CodeCompilationConfig codeCompilationConfig;

  /**
   * Optional. Optional schedule (in cron format) for automatic creation of compilation results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cronSchedule;

  /**
   * Optional. Disables automatic creation of compilation results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * Required. Git commit/tag/branch name at which the repository should be compiled. Must exist in
   * the remote repository. Examples: - a commit SHA: `12ade345` - a tag: `tag1` - a branch name:
   * `branch1`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gitCommitish;

  /**
   * Output only. All the metadata information that is used internally to serve the resource. For
   * example: timestamps, flags, status fields, etc. The format of this field is a JSON string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String internalMetadata;

  /**
   * Identifier. The release config's name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Records of the 10 most recent scheduled release attempts, ordered in descending
   * order of `release_time`. Updated whenever automatic creation of a compilation result is
   * triggered by cron_schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ScheduledReleaseRecord> recentScheduledReleaseRecords;

  /**
   * Optional. The name of the currently released compilation result for this release config. This
   * value is updated when a compilation result is automatically created from this release config
   * (using cron_schedule), or when this resource is updated by API call (perhaps to roll back to an
   * earlier release). The compilation result must have been created using this release config. Must
   * be in the format `projects/locations/repositories/compilationResults`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String releaseCompilationResult;

  /**
   * Optional. Specifies the time zone to be used when interpreting cron_schedule. Must be a time
   * zone name from the time zone database
   * (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left unspecified, the
   * default is UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * Optional. If set, fields of `code_compilation_config` override the default compilation settings
   * that are specified in dataform.json.
   * @return value or {@code null} for none
   */
  public CodeCompilationConfig getCodeCompilationConfig() {
    return codeCompilationConfig;
  }

  /**
   * Optional. If set, fields of `code_compilation_config` override the default compilation settings
   * that are specified in dataform.json.
   * @param codeCompilationConfig codeCompilationConfig or {@code null} for none
   */
  public ReleaseConfig setCodeCompilationConfig(CodeCompilationConfig codeCompilationConfig) {
    this.codeCompilationConfig = codeCompilationConfig;
    return this;
  }

  /**
   * Optional. Optional schedule (in cron format) for automatic creation of compilation results.
   * @return value or {@code null} for none
   */
  public java.lang.String getCronSchedule() {
    return cronSchedule;
  }

  /**
   * Optional. Optional schedule (in cron format) for automatic creation of compilation results.
   * @param cronSchedule cronSchedule or {@code null} for none
   */
  public ReleaseConfig setCronSchedule(java.lang.String cronSchedule) {
    this.cronSchedule = cronSchedule;
    return this;
  }

  /**
   * Optional. Disables automatic creation of compilation results.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * Optional. Disables automatic creation of compilation results.
   * @param disabled disabled or {@code null} for none
   */
  public ReleaseConfig setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Required. Git commit/tag/branch name at which the repository should be compiled. Must exist in
   * the remote repository. Examples: - a commit SHA: `12ade345` - a tag: `tag1` - a branch name:
   * `branch1`
   * @return value or {@code null} for none
   */
  public java.lang.String getGitCommitish() {
    return gitCommitish;
  }

  /**
   * Required. Git commit/tag/branch name at which the repository should be compiled. Must exist in
   * the remote repository. Examples: - a commit SHA: `12ade345` - a tag: `tag1` - a branch name:
   * `branch1`
   * @param gitCommitish gitCommitish or {@code null} for none
   */
  public ReleaseConfig setGitCommitish(java.lang.String gitCommitish) {
    this.gitCommitish = gitCommitish;
    return this;
  }

  /**
   * Output only. All the metadata information that is used internally to serve the resource. For
   * example: timestamps, flags, status fields, etc. The format of this field is a JSON string.
   * @return value or {@code null} for none
   */
  public java.lang.String getInternalMetadata() {
    return internalMetadata;
  }

  /**
   * Output only. All the metadata information that is used internally to serve the resource. For
   * example: timestamps, flags, status fields, etc. The format of this field is a JSON string.
   * @param internalMetadata internalMetadata or {@code null} for none
   */
  public ReleaseConfig setInternalMetadata(java.lang.String internalMetadata) {
    this.internalMetadata = internalMetadata;
    return this;
  }

  /**
   * Identifier. The release config's name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The release config's name.
   * @param name name or {@code null} for none
   */
  public ReleaseConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Records of the 10 most recent scheduled release attempts, ordered in descending
   * order of `release_time`. Updated whenever automatic creation of a compilation result is
   * triggered by cron_schedule.
   * @return value or {@code null} for none
   */
  public java.util.List<ScheduledReleaseRecord> getRecentScheduledReleaseRecords() {
    return recentScheduledReleaseRecords;
  }

  /**
   * Output only. Records of the 10 most recent scheduled release attempts, ordered in descending
   * order of `release_time`. Updated whenever automatic creation of a compilation result is
   * triggered by cron_schedule.
   * @param recentScheduledReleaseRecords recentScheduledReleaseRecords or {@code null} for none
   */
  public ReleaseConfig setRecentScheduledReleaseRecords(java.util.List<ScheduledReleaseRecord> recentScheduledReleaseRecords) {
    this.recentScheduledReleaseRecords = recentScheduledReleaseRecords;
    return this;
  }

  /**
   * Optional. The name of the currently released compilation result for this release config. This
   * value is updated when a compilation result is automatically created from this release config
   * (using cron_schedule), or when this resource is updated by API call (perhaps to roll back to an
   * earlier release). The compilation result must have been created using this release config. Must
   * be in the format `projects/locations/repositories/compilationResults`.
   * @return value or {@code null} for none
   */
  public java.lang.String getReleaseCompilationResult() {
    return releaseCompilationResult;
  }

  /**
   * Optional. The name of the currently released compilation result for this release config. This
   * value is updated when a compilation result is automatically created from this release config
   * (using cron_schedule), or when this resource is updated by API call (perhaps to roll back to an
   * earlier release). The compilation result must have been created using this release config. Must
   * be in the format `projects/locations/repositories/compilationResults`.
   * @param releaseCompilationResult releaseCompilationResult or {@code null} for none
   */
  public ReleaseConfig setReleaseCompilationResult(java.lang.String releaseCompilationResult) {
    this.releaseCompilationResult = releaseCompilationResult;
    return this;
  }

  /**
   * Optional. Specifies the time zone to be used when interpreting cron_schedule. Must be a time
   * zone name from the time zone database
   * (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left unspecified, the
   * default is UTC.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * Optional. Specifies the time zone to be used when interpreting cron_schedule. Must be a time
   * zone name from the time zone database
   * (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left unspecified, the
   * default is UTC.
   * @param timeZone timeZone or {@code null} for none
   */
  public ReleaseConfig setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public ReleaseConfig set(String fieldName, Object value) {
    return (ReleaseConfig) super.set(fieldName, value);
  }

  @Override
  public ReleaseConfig clone() {
    return (ReleaseConfig) super.clone();
  }

}
