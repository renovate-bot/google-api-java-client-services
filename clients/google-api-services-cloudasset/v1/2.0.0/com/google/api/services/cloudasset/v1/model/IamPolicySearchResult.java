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

package com.google.api.services.cloudasset.v1.model;

/**
 * A result of IAM Policy search, containing information of an IAM policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IamPolicySearchResult extends com.google.api.client.json.GenericJson {

  /**
   * The type of the resource associated with this IAM policy. Example:
   * `compute.googleapis.com/Disk`. To search against the `asset_type`: * specify the `asset_types`
   * field in your search request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetType;

  /**
   * Explanation about the IAM policy search result. It contains additional information to explain
   * why the search result matches the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Explanation explanation;

  /**
   * The folder(s) that the IAM policy belongs to, in the form of folders/{FOLDER_NUMBER}. This
   * field is available when the IAM policy belongs to one or more folders. To search against
   * `folders`: * use a field query. Example: `folders:(123 OR 456)` * use a free text query.
   * Example: `123` * specify the `scope` field as this folder in your search request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> folders;

  /**
   * The organization that the IAM policy belongs to, in the form of
   * organizations/{ORGANIZATION_NUMBER}. This field is available when the IAM policy belongs to an
   * organization. To search against `organization`: * use a field query. Example:
   * `organization:123` * use a free text query. Example: `123` * specify the `scope` field as this
   * organization in your search request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organization;

  /**
   * The IAM policy directly set on the given resource. Note that the original IAM policy can
   * contain multiple bindings. This only contains the bindings that match the given query. For
   * queries that don't contain a constrain on policies (e.g., an empty query), this contains all
   * the bindings. To search against the `policy` bindings: * use a field query: - query by the
   * policy contained members. Example: `policy:amy@gmail.com` - query by the policy contained
   * roles. Example: `policy:roles/compute.admin` - query by the policy contained roles' included
   * permissions. Example: `policy.role.permissions:compute.instances.create`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Policy policy;

  /**
   * The project that the associated Google Cloud resource belongs to, in the form of
   * projects/{PROJECT_NUMBER}. If an IAM policy is set on a resource (like VM instance, Cloud
   * Storage bucket), the project field will indicate the project that contains the resource. If an
   * IAM policy is set on a folder or organization, this field will be empty. To search against the
   * `project`: * specify the `scope` field as this project in your search request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * The full resource name of the resource associated with this IAM policy. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Cloud
   * Asset Inventory Resource Name Format](https://cloud.google.com/asset-inventory/docs/resource-
   * name-format) for more information. To search against the `resource`: * use a field query.
   * Example: `resource:organizations/123`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resource;

  /**
   * The type of the resource associated with this IAM policy. Example:
   * `compute.googleapis.com/Disk`. To search against the `asset_type`: * specify the `asset_types`
   * field in your search request.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssetType() {
    return assetType;
  }

  /**
   * The type of the resource associated with this IAM policy. Example:
   * `compute.googleapis.com/Disk`. To search against the `asset_type`: * specify the `asset_types`
   * field in your search request.
   * @param assetType assetType or {@code null} for none
   */
  public IamPolicySearchResult setAssetType(java.lang.String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Explanation about the IAM policy search result. It contains additional information to explain
   * why the search result matches the query.
   * @return value or {@code null} for none
   */
  public Explanation getExplanation() {
    return explanation;
  }

  /**
   * Explanation about the IAM policy search result. It contains additional information to explain
   * why the search result matches the query.
   * @param explanation explanation or {@code null} for none
   */
  public IamPolicySearchResult setExplanation(Explanation explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * The folder(s) that the IAM policy belongs to, in the form of folders/{FOLDER_NUMBER}. This
   * field is available when the IAM policy belongs to one or more folders. To search against
   * `folders`: * use a field query. Example: `folders:(123 OR 456)` * use a free text query.
   * Example: `123` * specify the `scope` field as this folder in your search request.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFolders() {
    return folders;
  }

  /**
   * The folder(s) that the IAM policy belongs to, in the form of folders/{FOLDER_NUMBER}. This
   * field is available when the IAM policy belongs to one or more folders. To search against
   * `folders`: * use a field query. Example: `folders:(123 OR 456)` * use a free text query.
   * Example: `123` * specify the `scope` field as this folder in your search request.
   * @param folders folders or {@code null} for none
   */
  public IamPolicySearchResult setFolders(java.util.List<java.lang.String> folders) {
    this.folders = folders;
    return this;
  }

  /**
   * The organization that the IAM policy belongs to, in the form of
   * organizations/{ORGANIZATION_NUMBER}. This field is available when the IAM policy belongs to an
   * organization. To search against `organization`: * use a field query. Example:
   * `organization:123` * use a free text query. Example: `123` * specify the `scope` field as this
   * organization in your search request.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganization() {
    return organization;
  }

  /**
   * The organization that the IAM policy belongs to, in the form of
   * organizations/{ORGANIZATION_NUMBER}. This field is available when the IAM policy belongs to an
   * organization. To search against `organization`: * use a field query. Example:
   * `organization:123` * use a free text query. Example: `123` * specify the `scope` field as this
   * organization in your search request.
   * @param organization organization or {@code null} for none
   */
  public IamPolicySearchResult setOrganization(java.lang.String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * The IAM policy directly set on the given resource. Note that the original IAM policy can
   * contain multiple bindings. This only contains the bindings that match the given query. For
   * queries that don't contain a constrain on policies (e.g., an empty query), this contains all
   * the bindings. To search against the `policy` bindings: * use a field query: - query by the
   * policy contained members. Example: `policy:amy@gmail.com` - query by the policy contained
   * roles. Example: `policy:roles/compute.admin` - query by the policy contained roles' included
   * permissions. Example: `policy.role.permissions:compute.instances.create`
   * @return value or {@code null} for none
   */
  public Policy getPolicy() {
    return policy;
  }

  /**
   * The IAM policy directly set on the given resource. Note that the original IAM policy can
   * contain multiple bindings. This only contains the bindings that match the given query. For
   * queries that don't contain a constrain on policies (e.g., an empty query), this contains all
   * the bindings. To search against the `policy` bindings: * use a field query: - query by the
   * policy contained members. Example: `policy:amy@gmail.com` - query by the policy contained
   * roles. Example: `policy:roles/compute.admin` - query by the policy contained roles' included
   * permissions. Example: `policy.role.permissions:compute.instances.create`
   * @param policy policy or {@code null} for none
   */
  public IamPolicySearchResult setPolicy(Policy policy) {
    this.policy = policy;
    return this;
  }

  /**
   * The project that the associated Google Cloud resource belongs to, in the form of
   * projects/{PROJECT_NUMBER}. If an IAM policy is set on a resource (like VM instance, Cloud
   * Storage bucket), the project field will indicate the project that contains the resource. If an
   * IAM policy is set on a folder or organization, this field will be empty. To search against the
   * `project`: * specify the `scope` field as this project in your search request.
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * The project that the associated Google Cloud resource belongs to, in the form of
   * projects/{PROJECT_NUMBER}. If an IAM policy is set on a resource (like VM instance, Cloud
   * Storage bucket), the project field will indicate the project that contains the resource. If an
   * IAM policy is set on a folder or organization, this field will be empty. To search against the
   * `project`: * specify the `scope` field as this project in your search request.
   * @param project project or {@code null} for none
   */
  public IamPolicySearchResult setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  /**
   * The full resource name of the resource associated with this IAM policy. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Cloud
   * Asset Inventory Resource Name Format](https://cloud.google.com/asset-inventory/docs/resource-
   * name-format) for more information. To search against the `resource`: * use a field query.
   * Example: `resource:organizations/123`
   * @return value or {@code null} for none
   */
  public java.lang.String getResource() {
    return resource;
  }

  /**
   * The full resource name of the resource associated with this IAM policy. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Cloud
   * Asset Inventory Resource Name Format](https://cloud.google.com/asset-inventory/docs/resource-
   * name-format) for more information. To search against the `resource`: * use a field query.
   * Example: `resource:organizations/123`
   * @param resource resource or {@code null} for none
   */
  public IamPolicySearchResult setResource(java.lang.String resource) {
    this.resource = resource;
    return this;
  }

  @Override
  public IamPolicySearchResult set(String fieldName, Object value) {
    return (IamPolicySearchResult) super.set(fieldName, value);
  }

  @Override
  public IamPolicySearchResult clone() {
    return (IamPolicySearchResult) super.clone();
  }

}
