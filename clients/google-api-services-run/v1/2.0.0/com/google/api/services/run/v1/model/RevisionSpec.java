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

package com.google.api.services.run.v1.model;

/**
 * RevisionSpec holds the desired state of the Revision (from the client).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RevisionSpec extends com.google.api.client.json.GenericJson {

  /**
   * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per
   * container instance of the Revision. If not specified or 0, defaults to 80 when requested CPU >=
   * 1 and defaults to 1 when requested CPU < 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer containerConcurrency;

  /**
   * Required. Containers holds the list which define the units of execution for this Revision. In
   * the context of a Revision, we disallow a number of fields on this Container, including: name
   * and lifecycle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Container> containers;

  static {
    // hack to force ProGuard to consider Container used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Container.class);
  }

  /**
   * Not supported by Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableServiceLinks;

  /**
   * Not supported by Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LocalObjectReference> imagePullSecrets;

  static {
    // hack to force ProGuard to consider LocalObjectReference used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LocalObjectReference.class);
  }

  /**
   * Optional. The Node Selector configuration. Map of selector key to a value which matches a node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> nodeSelector;

  /**
   * Runtime. Leave unset for default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtimeClassName;

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has. If not provided, the revision will use the project's default
   * service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountName;

  /**
   * Optional. TimeoutSeconds holds the max duration the instance is allowed for responding to a
   * request. Cloud Run: defaults to 300 seconds (5 minutes). Maximum allowed value is 3600 seconds
   * (1 hour).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timeoutSeconds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Volume> volumes;

  /**
   * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per
   * container instance of the Revision. If not specified or 0, defaults to 80 when requested CPU >=
   * 1 and defaults to 1 when requested CPU < 1.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getContainerConcurrency() {
    return containerConcurrency;
  }

  /**
   * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per
   * container instance of the Revision. If not specified or 0, defaults to 80 when requested CPU >=
   * 1 and defaults to 1 when requested CPU < 1.
   * @param containerConcurrency containerConcurrency or {@code null} for none
   */
  public RevisionSpec setContainerConcurrency(java.lang.Integer containerConcurrency) {
    this.containerConcurrency = containerConcurrency;
    return this;
  }

  /**
   * Required. Containers holds the list which define the units of execution for this Revision. In
   * the context of a Revision, we disallow a number of fields on this Container, including: name
   * and lifecycle.
   * @return value or {@code null} for none
   */
  public java.util.List<Container> getContainers() {
    return containers;
  }

  /**
   * Required. Containers holds the list which define the units of execution for this Revision. In
   * the context of a Revision, we disallow a number of fields on this Container, including: name
   * and lifecycle.
   * @param containers containers or {@code null} for none
   */
  public RevisionSpec setContainers(java.util.List<Container> containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Not supported by Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableServiceLinks() {
    return enableServiceLinks;
  }

  /**
   * Not supported by Cloud Run.
   * @param enableServiceLinks enableServiceLinks or {@code null} for none
   */
  public RevisionSpec setEnableServiceLinks(java.lang.Boolean enableServiceLinks) {
    this.enableServiceLinks = enableServiceLinks;
    return this;
  }

  /**
   * Not supported by Cloud Run.
   * @return value or {@code null} for none
   */
  public java.util.List<LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  /**
   * Not supported by Cloud Run.
   * @param imagePullSecrets imagePullSecrets or {@code null} for none
   */
  public RevisionSpec setImagePullSecrets(java.util.List<LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  /**
   * Optional. The Node Selector configuration. Map of selector key to a value which matches a node.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getNodeSelector() {
    return nodeSelector;
  }

  /**
   * Optional. The Node Selector configuration. Map of selector key to a value which matches a node.
   * @param nodeSelector nodeSelector or {@code null} for none
   */
  public RevisionSpec setNodeSelector(java.util.Map<String, java.lang.String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  /**
   * Runtime. Leave unset for default.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntimeClassName() {
    return runtimeClassName;
  }

  /**
   * Runtime. Leave unset for default.
   * @param runtimeClassName runtimeClassName or {@code null} for none
   */
  public RevisionSpec setRuntimeClassName(java.lang.String runtimeClassName) {
    this.runtimeClassName = runtimeClassName;
    return this;
  }

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has. If not provided, the revision will use the project's default
   * service account.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountName() {
    return serviceAccountName;
  }

  /**
   * Email address of the IAM service account associated with the revision of the service. The
   * service account represents the identity of the running revision, and determines what
   * permissions the revision has. If not provided, the revision will use the project's default
   * service account.
   * @param serviceAccountName serviceAccountName or {@code null} for none
   */
  public RevisionSpec setServiceAccountName(java.lang.String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

  /**
   * Optional. TimeoutSeconds holds the max duration the instance is allowed for responding to a
   * request. Cloud Run: defaults to 300 seconds (5 minutes). Maximum allowed value is 3600 seconds
   * (1 hour).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  /**
   * Optional. TimeoutSeconds holds the max duration the instance is allowed for responding to a
   * request. Cloud Run: defaults to 300 seconds (5 minutes). Maximum allowed value is 3600 seconds
   * (1 hour).
   * @param timeoutSeconds timeoutSeconds or {@code null} for none
   */
  public RevisionSpec setTimeoutSeconds(java.lang.Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Volume> getVolumes() {
    return volumes;
  }

  /**
   * @param volumes volumes or {@code null} for none
   */
  public RevisionSpec setVolumes(java.util.List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  @Override
  public RevisionSpec set(String fieldName, Object value) {
    return (RevisionSpec) super.set(fieldName, value);
  }

  @Override
  public RevisionSpec clone() {
    return (RevisionSpec) super.clone();
  }

}
