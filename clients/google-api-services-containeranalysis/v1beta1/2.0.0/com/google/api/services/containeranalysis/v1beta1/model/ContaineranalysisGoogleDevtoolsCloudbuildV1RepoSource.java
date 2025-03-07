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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * Location of the source in a Google Cloud Source Repository.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource extends com.google.api.client.json.GenericJson {

  /**
   * Regex matching branches to build. The syntax of the regular expressions accepted is the syntax
   * accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String branchName;

  /**
   * Explicit commit SHA to build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commitSha;

  /**
   * Optional. Directory, relative to the source root, in which to run the build. This must be a
   * relative path. If a step's `dir` is specified and is an absolute path, this value is ignored
   * for that step's execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dir;

  /**
   * Optional. Only trigger a build if the revision regex does NOT match the revision regex.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean invertRegex;

  /**
   * Optional. ID of the project that owns the Cloud Source Repository. If omitted, the project ID
   * requesting the build is assumed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Required. Name of the Cloud Source Repository.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String repoName;

  /**
   * Optional. Substitutions to use in a triggered build. Should only be used with RunBuildTrigger
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> substitutions;

  /**
   * Regex matching tags to build. The syntax of the regular expressions accepted is the syntax
   * accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagName;

  /**
   * Regex matching branches to build. The syntax of the regular expressions accepted is the syntax
   * accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
   * @return value or {@code null} for none
   */
  public java.lang.String getBranchName() {
    return branchName;
  }

  /**
   * Regex matching branches to build. The syntax of the regular expressions accepted is the syntax
   * accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
   * @param branchName branchName or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource setBranchName(java.lang.String branchName) {
    this.branchName = branchName;
    return this;
  }

  /**
   * Explicit commit SHA to build.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommitSha() {
    return commitSha;
  }

  /**
   * Explicit commit SHA to build.
   * @param commitSha commitSha or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource setCommitSha(java.lang.String commitSha) {
    this.commitSha = commitSha;
    return this;
  }

  /**
   * Optional. Directory, relative to the source root, in which to run the build. This must be a
   * relative path. If a step's `dir` is specified and is an absolute path, this value is ignored
   * for that step's execution.
   * @return value or {@code null} for none
   */
  public java.lang.String getDir() {
    return dir;
  }

  /**
   * Optional. Directory, relative to the source root, in which to run the build. This must be a
   * relative path. If a step's `dir` is specified and is an absolute path, this value is ignored
   * for that step's execution.
   * @param dir dir or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource setDir(java.lang.String dir) {
    this.dir = dir;
    return this;
  }

  /**
   * Optional. Only trigger a build if the revision regex does NOT match the revision regex.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInvertRegex() {
    return invertRegex;
  }

  /**
   * Optional. Only trigger a build if the revision regex does NOT match the revision regex.
   * @param invertRegex invertRegex or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource setInvertRegex(java.lang.Boolean invertRegex) {
    this.invertRegex = invertRegex;
    return this;
  }

  /**
   * Optional. ID of the project that owns the Cloud Source Repository. If omitted, the project ID
   * requesting the build is assumed.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Optional. ID of the project that owns the Cloud Source Repository. If omitted, the project ID
   * requesting the build is assumed.
   * @param projectId projectId or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Required. Name of the Cloud Source Repository.
   * @return value or {@code null} for none
   */
  public java.lang.String getRepoName() {
    return repoName;
  }

  /**
   * Required. Name of the Cloud Source Repository.
   * @param repoName repoName or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource setRepoName(java.lang.String repoName) {
    this.repoName = repoName;
    return this;
  }

  /**
   * Optional. Substitutions to use in a triggered build. Should only be used with RunBuildTrigger
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getSubstitutions() {
    return substitutions;
  }

  /**
   * Optional. Substitutions to use in a triggered build. Should only be used with RunBuildTrigger
   * @param substitutions substitutions or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource setSubstitutions(java.util.Map<String, java.lang.String> substitutions) {
    this.substitutions = substitutions;
    return this;
  }

  /**
   * Regex matching tags to build. The syntax of the regular expressions accepted is the syntax
   * accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
   * @return value or {@code null} for none
   */
  public java.lang.String getTagName() {
    return tagName;
  }

  /**
   * Regex matching tags to build. The syntax of the regular expressions accepted is the syntax
   * accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
   * @param tagName tagName or {@code null} for none
   */
  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource setTagName(java.lang.String tagName) {
    this.tagName = tagName;
    return this;
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource set(String fieldName, Object value) {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource) super.set(fieldName, value);
  }

  @Override
  public ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource clone() {
    return (ContaineranalysisGoogleDevtoolsCloudbuildV1RepoSource) super.clone();
  }

}
