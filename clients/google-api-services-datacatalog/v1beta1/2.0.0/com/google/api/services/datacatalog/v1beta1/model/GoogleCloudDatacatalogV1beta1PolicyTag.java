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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * Denotes one policy tag in a taxonomy (e.g. ssn). Policy Tags can be defined in a hierarchy. For
 * example, consider the following hierarchy: Geolocation -> (LatLong, City, ZipCode). PolicyTag
 * "Geolocation" contains three child policy tags: "LatLong", "City", and "ZipCode".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1beta1PolicyTag extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Resource names of child policy tags of this policy tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> childPolicyTags;

  /**
   * Description of this policy tag. It must: contain only unicode characters, tabs, newlines,
   * carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not
   * set, defaults to an empty description. If not set, defaults to an empty description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. User defined name of this policy tag. It must: be unique within the parent taxonomy;
   * contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with
   * spaces; and be at most 200 bytes long when encoded in UTF-8.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Identifier. Resource name of this policy tag, whose format is:
   * "projects/{project_number}/locations/{location_id}/taxonomies/{taxonomy_id}/policyTags/{id}".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Resource name of this policy tag's parent policy tag (e.g. for the "LatLong" policy tag in the
   * example above, this field contains the resource name of the "Geolocation" policy tag). If
   * empty, it means this policy tag is a top level policy tag (e.g. this field is empty for the
   * "Geolocation" policy tag in the example above). If not set, defaults to an empty string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentPolicyTag;

  /**
   * Output only. Resource names of child policy tags of this policy tag.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getChildPolicyTags() {
    return childPolicyTags;
  }

  /**
   * Output only. Resource names of child policy tags of this policy tag.
   * @param childPolicyTags childPolicyTags or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1PolicyTag setChildPolicyTags(java.util.List<java.lang.String> childPolicyTags) {
    this.childPolicyTags = childPolicyTags;
    return this;
  }

  /**
   * Description of this policy tag. It must: contain only unicode characters, tabs, newlines,
   * carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not
   * set, defaults to an empty description. If not set, defaults to an empty description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of this policy tag. It must: contain only unicode characters, tabs, newlines,
   * carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not
   * set, defaults to an empty description. If not set, defaults to an empty description.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1PolicyTag setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. User defined name of this policy tag. It must: be unique within the parent taxonomy;
   * contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with
   * spaces; and be at most 200 bytes long when encoded in UTF-8.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. User defined name of this policy tag. It must: be unique within the parent taxonomy;
   * contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with
   * spaces; and be at most 200 bytes long when encoded in UTF-8.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1PolicyTag setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Identifier. Resource name of this policy tag, whose format is:
   * "projects/{project_number}/locations/{location_id}/taxonomies/{taxonomy_id}/policyTags/{id}".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. Resource name of this policy tag, whose format is:
   * "projects/{project_number}/locations/{location_id}/taxonomies/{taxonomy_id}/policyTags/{id}".
   * @param name name or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1PolicyTag setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Resource name of this policy tag's parent policy tag (e.g. for the "LatLong" policy tag in the
   * example above, this field contains the resource name of the "Geolocation" policy tag). If
   * empty, it means this policy tag is a top level policy tag (e.g. this field is empty for the
   * "Geolocation" policy tag in the example above). If not set, defaults to an empty string.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentPolicyTag() {
    return parentPolicyTag;
  }

  /**
   * Resource name of this policy tag's parent policy tag (e.g. for the "LatLong" policy tag in the
   * example above, this field contains the resource name of the "Geolocation" policy tag). If
   * empty, it means this policy tag is a top level policy tag (e.g. this field is empty for the
   * "Geolocation" policy tag in the example above). If not set, defaults to an empty string.
   * @param parentPolicyTag parentPolicyTag or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1PolicyTag setParentPolicyTag(java.lang.String parentPolicyTag) {
    this.parentPolicyTag = parentPolicyTag;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1beta1PolicyTag set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1beta1PolicyTag) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1beta1PolicyTag clone() {
    return (GoogleCloudDatacatalogV1beta1PolicyTag) super.clone();
  }

}
