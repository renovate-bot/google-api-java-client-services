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

package com.google.api.services.compute.model;

/**
 * Represents a License resource. A License represents billing and aggregate usage data for public
 * and marketplace images. *Caution* This resource is intended for use only by third-party partners
 * who are creating Cloud Marketplace images.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class License extends com.google.api.client.json.GenericJson {

  /**
   * Specifies licenseCodes of licenses that can replace this license. Note: such replacements are
   * allowed even if removable_from_disk is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedReplacementLicenses;

  /**
   * If true, this license can be appended to an existing disk's set of licenses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean appendableToDisk;

  /**
   * [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean chargesUseFee;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Specifies licenseCodes of licenses that are incompatible with this license. If a license is
   * incompatible with this license, it cannot be attached to the same disk or image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> incompatibleLicenses;

  /**
   * [Output Only] Type of resource. Always compute#license for licenses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output Only] The unique code used to attach this license to images, snapshots, and disks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger licenseCode;

  /**
   * If set, this license will be unable to be removed or replaced once attached to a disk until the
   * minimum_retention period has passed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Duration minimumRetention;

  /**
   * If true, this license can only be used on VMs on multi tenant nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean multiTenantOnly;

  /**
   * Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * If true, indicates this is an OS license. Only one OS license can be attached to a disk or
   * image at a time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean osLicense;

  /**
   * If true, this license can be removed from a disk's set of licenses, with no replacement license
   * needed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean removableFromDisk;

  /**
   * Specifies the set of permissible coattached licenseCodes of licenses that satisfy the
   * coattachment requirement of this license. At least one license from the set must be attached to
   * the same disk or image as this license.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> requiredCoattachedLicenses;

  /**
   * [Input Only] Deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LicenseResourceRequirements resourceRequirements;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * If true, this license can only be used on VMs on sole tenant nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean soleTenantOnly;

  /**
   * If false, licenses will not be copied from the source resource when creating an image from a
   * disk, disk from snapshot, or snapshot from disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean transferable;

  /**
   * [Output Only] Last update timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updateTimestamp;

  /**
   * Specifies licenseCodes of licenses that can replace this license. Note: such replacements are
   * allowed even if removable_from_disk is false.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedReplacementLicenses() {
    return allowedReplacementLicenses;
  }

  /**
   * Specifies licenseCodes of licenses that can replace this license. Note: such replacements are
   * allowed even if removable_from_disk is false.
   * @param allowedReplacementLicenses allowedReplacementLicenses or {@code null} for none
   */
  public License setAllowedReplacementLicenses(java.util.List<java.lang.String> allowedReplacementLicenses) {
    this.allowedReplacementLicenses = allowedReplacementLicenses;
    return this;
  }

  /**
   * If true, this license can be appended to an existing disk's set of licenses.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAppendableToDisk() {
    return appendableToDisk;
  }

  /**
   * If true, this license can be appended to an existing disk's set of licenses.
   * @param appendableToDisk appendableToDisk or {@code null} for none
   */
  public License setAppendableToDisk(java.lang.Boolean appendableToDisk) {
    this.appendableToDisk = appendableToDisk;
    return this;
  }

  /**
   * [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getChargesUseFee() {
    return chargesUseFee;
  }

  /**
   * [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee.
   * @param chargesUseFee chargesUseFee or {@code null} for none
   */
  public License setChargesUseFee(java.lang.Boolean chargesUseFee) {
    this.chargesUseFee = chargesUseFee;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public License setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional textual description of the resource; provided by the client when the resource is
   * created.
   * @param description description or {@code null} for none
   */
  public License setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public License setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Specifies licenseCodes of licenses that are incompatible with this license. If a license is
   * incompatible with this license, it cannot be attached to the same disk or image.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncompatibleLicenses() {
    return incompatibleLicenses;
  }

  /**
   * Specifies licenseCodes of licenses that are incompatible with this license. If a license is
   * incompatible with this license, it cannot be attached to the same disk or image.
   * @param incompatibleLicenses incompatibleLicenses or {@code null} for none
   */
  public License setIncompatibleLicenses(java.util.List<java.lang.String> incompatibleLicenses) {
    this.incompatibleLicenses = incompatibleLicenses;
    return this;
  }

  /**
   * [Output Only] Type of resource. Always compute#license for licenses.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of resource. Always compute#license for licenses.
   * @param kind kind or {@code null} for none
   */
  public License setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output Only] The unique code used to attach this license to images, snapshots, and disks.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getLicenseCode() {
    return licenseCode;
  }

  /**
   * [Output Only] The unique code used to attach this license to images, snapshots, and disks.
   * @param licenseCode licenseCode or {@code null} for none
   */
  public License setLicenseCode(java.math.BigInteger licenseCode) {
    this.licenseCode = licenseCode;
    return this;
  }

  /**
   * If set, this license will be unable to be removed or replaced once attached to a disk until the
   * minimum_retention period has passed.
   * @return value or {@code null} for none
   */
  public Duration getMinimumRetention() {
    return minimumRetention;
  }

  /**
   * If set, this license will be unable to be removed or replaced once attached to a disk until the
   * minimum_retention period has passed.
   * @param minimumRetention minimumRetention or {@code null} for none
   */
  public License setMinimumRetention(Duration minimumRetention) {
    this.minimumRetention = minimumRetention;
    return this;
  }

  /**
   * If true, this license can only be used on VMs on multi tenant nodes.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMultiTenantOnly() {
    return multiTenantOnly;
  }

  /**
   * If true, this license can only be used on VMs on multi tenant nodes.
   * @param multiTenantOnly multiTenantOnly or {@code null} for none
   */
  public License setMultiTenantOnly(java.lang.Boolean multiTenantOnly) {
    this.multiTenantOnly = multiTenantOnly;
    return this;
  }

  /**
   * Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
   * @param name name or {@code null} for none
   */
  public License setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * If true, indicates this is an OS license. Only one OS license can be attached to a disk or
   * image at a time.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOsLicense() {
    return osLicense;
  }

  /**
   * If true, indicates this is an OS license. Only one OS license can be attached to a disk or
   * image at a time.
   * @param osLicense osLicense or {@code null} for none
   */
  public License setOsLicense(java.lang.Boolean osLicense) {
    this.osLicense = osLicense;
    return this;
  }

  /**
   * If true, this license can be removed from a disk's set of licenses, with no replacement license
   * needed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRemovableFromDisk() {
    return removableFromDisk;
  }

  /**
   * If true, this license can be removed from a disk's set of licenses, with no replacement license
   * needed.
   * @param removableFromDisk removableFromDisk or {@code null} for none
   */
  public License setRemovableFromDisk(java.lang.Boolean removableFromDisk) {
    this.removableFromDisk = removableFromDisk;
    return this;
  }

  /**
   * Specifies the set of permissible coattached licenseCodes of licenses that satisfy the
   * coattachment requirement of this license. At least one license from the set must be attached to
   * the same disk or image as this license.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRequiredCoattachedLicenses() {
    return requiredCoattachedLicenses;
  }

  /**
   * Specifies the set of permissible coattached licenseCodes of licenses that satisfy the
   * coattachment requirement of this license. At least one license from the set must be attached to
   * the same disk or image as this license.
   * @param requiredCoattachedLicenses requiredCoattachedLicenses or {@code null} for none
   */
  public License setRequiredCoattachedLicenses(java.util.List<java.lang.String> requiredCoattachedLicenses) {
    this.requiredCoattachedLicenses = requiredCoattachedLicenses;
    return this;
  }

  /**
   * [Input Only] Deprecated.
   * @return value or {@code null} for none
   */
  public LicenseResourceRequirements getResourceRequirements() {
    return resourceRequirements;
  }

  /**
   * [Input Only] Deprecated.
   * @param resourceRequirements resourceRequirements or {@code null} for none
   */
  public License setResourceRequirements(LicenseResourceRequirements resourceRequirements) {
    this.resourceRequirements = resourceRequirements;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public License setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public License setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * If true, this license can only be used on VMs on sole tenant nodes.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSoleTenantOnly() {
    return soleTenantOnly;
  }

  /**
   * If true, this license can only be used on VMs on sole tenant nodes.
   * @param soleTenantOnly soleTenantOnly or {@code null} for none
   */
  public License setSoleTenantOnly(java.lang.Boolean soleTenantOnly) {
    this.soleTenantOnly = soleTenantOnly;
    return this;
  }

  /**
   * If false, licenses will not be copied from the source resource when creating an image from a
   * disk, disk from snapshot, or snapshot from disk.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTransferable() {
    return transferable;
  }

  /**
   * If false, licenses will not be copied from the source resource when creating an image from a
   * disk, disk from snapshot, or snapshot from disk.
   * @param transferable transferable or {@code null} for none
   */
  public License setTransferable(java.lang.Boolean transferable) {
    this.transferable = transferable;
    return this;
  }

  /**
   * [Output Only] Last update timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdateTimestamp() {
    return updateTimestamp;
  }

  /**
   * [Output Only] Last update timestamp in RFC3339 text format.
   * @param updateTimestamp updateTimestamp or {@code null} for none
   */
  public License setUpdateTimestamp(java.lang.String updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
    return this;
  }

  @Override
  public License set(String fieldName, Object value) {
    return (License) super.set(fieldName, value);
  }

  @Override
  public License clone() {
    return (License) super.clone();
  }

}
