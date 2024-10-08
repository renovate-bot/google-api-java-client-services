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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * A `CustomDomain` is an entity that links a domain name to a Firebase Hosting site. Add a
 * `CustomDomain` to your site to allow Hosting to serve the site's content in response to requests
 * against your domain name.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomDomain extends com.google.api.client.json.GenericJson {

  /**
   * Annotations you can add to leave both human- and machine-readable metadata about your
   * `CustomDomain`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Output only. The SSL certificate Hosting has for this custom domain's domain name. For new
   * custom domains, this often represents Hosting's intent to create a certificate, rather than an
   * actual cert. Check the `state` field for more.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Certificate cert;

  /**
   * A field that lets you specify which SSL certificate type Hosting creates for your domain name.
   * Spark plan custom domains only have access to the `GROUPED` cert type, while Blaze plan domains
   * can select any option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certPreference;

  /**
   * Output only. The custom domain's create time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The time the `CustomDomain` was deleted; null for custom domains that haven't been
   * deleted. Deleted custom domains persist for approximately 30 days, after which time Hosting
   * removes them completely. To restore a deleted custom domain, make an `UndeleteCustomDomain`
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String deleteTime;

  /**
   * Output only. A string that represents the current state of the `CustomDomain` and allows you to
   * confirm its initial state in requests that would modify it. Use the tag to ensure consistency
   * when making `UpdateCustomDomain`, `DeleteCustomDomain`, and `UndeleteCustomDomain` requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. The minimum time before a soft-deleted `CustomDomain` is completely removed from
   * Hosting; null for custom domains that haven't been deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Output only. The `HostState` of the domain name this `CustomDomain` refers to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostState;

  /**
   * Output only. A set of errors Hosting systems encountered when trying to establish Hosting's
   * ability to serve secure content for your domain name. Resolve these issues to ensure your
   * `CustomDomain` behaves properly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Status> issues;

  /**
   * Labels used for extra metadata and/or filtering.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The fully-qualified name of the `CustomDomain`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The `OwnershipState` of the domain name this `CustomDomain` refers to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ownershipState;

  /**
   * Output only. A field that, if true, indicates that Hosting's systems are attmepting to make the
   * custom domain's state match your preferred state. This is most frequently `true` when initially
   * provisioning a `CustomDomain` after a `CreateCustomDomain` request or when creating a new SSL
   * certificate to match an updated `cert_preference` after an `UpdateCustomDomain` request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reconciling;

  /**
   * A domain name that this `CustomDomain` should direct traffic towards. If specified, Hosting
   * will respond to requests against this custom domain with an HTTP 301 code, and route traffic to
   * the specified `redirect_target` instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String redirectTarget;

  /**
   * Output only. A set of updates you should make to the domain name's DNS records to let Hosting
   * serve secure content on its behalf.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DnsUpdates requiredDnsUpdates;

  /**
   * Output only. The last time the `CustomDomain` was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Annotations you can add to leave both human- and machine-readable metadata about your
   * `CustomDomain`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Annotations you can add to leave both human- and machine-readable metadata about your
   * `CustomDomain`.
   * @param annotations annotations or {@code null} for none
   */
  public CustomDomain setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Output only. The SSL certificate Hosting has for this custom domain's domain name. For new
   * custom domains, this often represents Hosting's intent to create a certificate, rather than an
   * actual cert. Check the `state` field for more.
   * @return value or {@code null} for none
   */
  public Certificate getCert() {
    return cert;
  }

  /**
   * Output only. The SSL certificate Hosting has for this custom domain's domain name. For new
   * custom domains, this often represents Hosting's intent to create a certificate, rather than an
   * actual cert. Check the `state` field for more.
   * @param cert cert or {@code null} for none
   */
  public CustomDomain setCert(Certificate cert) {
    this.cert = cert;
    return this;
  }

  /**
   * A field that lets you specify which SSL certificate type Hosting creates for your domain name.
   * Spark plan custom domains only have access to the `GROUPED` cert type, while Blaze plan domains
   * can select any option.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertPreference() {
    return certPreference;
  }

  /**
   * A field that lets you specify which SSL certificate type Hosting creates for your domain name.
   * Spark plan custom domains only have access to the `GROUPED` cert type, while Blaze plan domains
   * can select any option.
   * @param certPreference certPreference or {@code null} for none
   */
  public CustomDomain setCertPreference(java.lang.String certPreference) {
    this.certPreference = certPreference;
    return this;
  }

  /**
   * Output only. The custom domain's create time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The custom domain's create time.
   * @param createTime createTime or {@code null} for none
   */
  public CustomDomain setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The time the `CustomDomain` was deleted; null for custom domains that haven't been
   * deleted. Deleted custom domains persist for approximately 30 days, after which time Hosting
   * removes them completely. To restore a deleted custom domain, make an `UndeleteCustomDomain`
   * request.
   * @return value or {@code null} for none
   */
  public String getDeleteTime() {
    return deleteTime;
  }

  /**
   * Output only. The time the `CustomDomain` was deleted; null for custom domains that haven't been
   * deleted. Deleted custom domains persist for approximately 30 days, after which time Hosting
   * removes them completely. To restore a deleted custom domain, make an `UndeleteCustomDomain`
   * request.
   * @param deleteTime deleteTime or {@code null} for none
   */
  public CustomDomain setDeleteTime(String deleteTime) {
    this.deleteTime = deleteTime;
    return this;
  }

  /**
   * Output only. A string that represents the current state of the `CustomDomain` and allows you to
   * confirm its initial state in requests that would modify it. Use the tag to ensure consistency
   * when making `UpdateCustomDomain`, `DeleteCustomDomain`, and `UndeleteCustomDomain` requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. A string that represents the current state of the `CustomDomain` and allows you to
   * confirm its initial state in requests that would modify it. Use the tag to ensure consistency
   * when making `UpdateCustomDomain`, `DeleteCustomDomain`, and `UndeleteCustomDomain` requests.
   * @param etag etag or {@code null} for none
   */
  public CustomDomain setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. The minimum time before a soft-deleted `CustomDomain` is completely removed from
   * Hosting; null for custom domains that haven't been deleted.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. The minimum time before a soft-deleted `CustomDomain` is completely removed from
   * Hosting; null for custom domains that haven't been deleted.
   * @param expireTime expireTime or {@code null} for none
   */
  public CustomDomain setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Output only. The `HostState` of the domain name this `CustomDomain` refers to.
   * @return value or {@code null} for none
   */
  public java.lang.String getHostState() {
    return hostState;
  }

  /**
   * Output only. The `HostState` of the domain name this `CustomDomain` refers to.
   * @param hostState hostState or {@code null} for none
   */
  public CustomDomain setHostState(java.lang.String hostState) {
    this.hostState = hostState;
    return this;
  }

  /**
   * Output only. A set of errors Hosting systems encountered when trying to establish Hosting's
   * ability to serve secure content for your domain name. Resolve these issues to ensure your
   * `CustomDomain` behaves properly.
   * @return value or {@code null} for none
   */
  public java.util.List<Status> getIssues() {
    return issues;
  }

  /**
   * Output only. A set of errors Hosting systems encountered when trying to establish Hosting's
   * ability to serve secure content for your domain name. Resolve these issues to ensure your
   * `CustomDomain` behaves properly.
   * @param issues issues or {@code null} for none
   */
  public CustomDomain setIssues(java.util.List<Status> issues) {
    this.issues = issues;
    return this;
  }

  /**
   * Labels used for extra metadata and/or filtering.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels used for extra metadata and/or filtering.
   * @param labels labels or {@code null} for none
   */
  public CustomDomain setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The fully-qualified name of the `CustomDomain`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The fully-qualified name of the `CustomDomain`.
   * @param name name or {@code null} for none
   */
  public CustomDomain setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The `OwnershipState` of the domain name this `CustomDomain` refers to.
   * @return value or {@code null} for none
   */
  public java.lang.String getOwnershipState() {
    return ownershipState;
  }

  /**
   * Output only. The `OwnershipState` of the domain name this `CustomDomain` refers to.
   * @param ownershipState ownershipState or {@code null} for none
   */
  public CustomDomain setOwnershipState(java.lang.String ownershipState) {
    this.ownershipState = ownershipState;
    return this;
  }

  /**
   * Output only. A field that, if true, indicates that Hosting's systems are attmepting to make the
   * custom domain's state match your preferred state. This is most frequently `true` when initially
   * provisioning a `CustomDomain` after a `CreateCustomDomain` request or when creating a new SSL
   * certificate to match an updated `cert_preference` after an `UpdateCustomDomain` request.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReconciling() {
    return reconciling;
  }

  /**
   * Output only. A field that, if true, indicates that Hosting's systems are attmepting to make the
   * custom domain's state match your preferred state. This is most frequently `true` when initially
   * provisioning a `CustomDomain` after a `CreateCustomDomain` request or when creating a new SSL
   * certificate to match an updated `cert_preference` after an `UpdateCustomDomain` request.
   * @param reconciling reconciling or {@code null} for none
   */
  public CustomDomain setReconciling(java.lang.Boolean reconciling) {
    this.reconciling = reconciling;
    return this;
  }

  /**
   * A domain name that this `CustomDomain` should direct traffic towards. If specified, Hosting
   * will respond to requests against this custom domain with an HTTP 301 code, and route traffic to
   * the specified `redirect_target` instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getRedirectTarget() {
    return redirectTarget;
  }

  /**
   * A domain name that this `CustomDomain` should direct traffic towards. If specified, Hosting
   * will respond to requests against this custom domain with an HTTP 301 code, and route traffic to
   * the specified `redirect_target` instead.
   * @param redirectTarget redirectTarget or {@code null} for none
   */
  public CustomDomain setRedirectTarget(java.lang.String redirectTarget) {
    this.redirectTarget = redirectTarget;
    return this;
  }

  /**
   * Output only. A set of updates you should make to the domain name's DNS records to let Hosting
   * serve secure content on its behalf.
   * @return value or {@code null} for none
   */
  public DnsUpdates getRequiredDnsUpdates() {
    return requiredDnsUpdates;
  }

  /**
   * Output only. A set of updates you should make to the domain name's DNS records to let Hosting
   * serve secure content on its behalf.
   * @param requiredDnsUpdates requiredDnsUpdates or {@code null} for none
   */
  public CustomDomain setRequiredDnsUpdates(DnsUpdates requiredDnsUpdates) {
    this.requiredDnsUpdates = requiredDnsUpdates;
    return this;
  }

  /**
   * Output only. The last time the `CustomDomain` was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last time the `CustomDomain` was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public CustomDomain setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public CustomDomain set(String fieldName, Object value) {
    return (CustomDomain) super.set(fieldName, value);
  }

  @Override
  public CustomDomain clone() {
    return (CustomDomain) super.clone();
  }

}
