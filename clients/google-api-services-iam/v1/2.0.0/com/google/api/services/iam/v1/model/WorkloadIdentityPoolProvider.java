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

package com.google.api.services.iam.v1.model;

/**
 * A configuration for an external identity provider.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkloadIdentityPoolProvider extends com.google.api.client.json.GenericJson {

  /**
   * Optional. [A Common Expression Language](https://opensource.google/projects/cel) expression, in
   * plain text, to restrict what otherwise valid authentication credentials issued by the provider
   * should not be accepted. The expression must output a boolean representing whether to allow the
   * federation. The following keywords may be referenced in the expressions: * `assertion`: JSON
   * representing the authentication credential issued by the provider. * `google`: The Google
   * attributes mapped from the assertion in the `attribute_mappings`. * `attribute`: The custom
   * attributes mapped from the assertion in the `attribute_mappings`. The maximum length of the
   * attribute condition expression is 4096 characters. If unspecified, all valid authentication
   * credential are accepted. The following example shows how to only allow credentials with a
   * mapped `google.groups` value of `admins`: ``` "'admins' in google.groups" ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributeCondition;

  /**
   * Optional. Maps attributes from authentication credentials issued by an external identity
   * provider to Google Cloud attributes, such as `subject` and `segment`. Each key must be a string
   * specifying the Google Cloud IAM attribute to map to. The following keys are supported: *
   * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM
   * bindings. This is also the subject that appears in Cloud Logging logs. Cannot exceed 127 bytes.
   * * `google.groups`: Groups the external identity belongs to. You can grant groups access to
   * resources using an IAM `principalSet` binding; access applies to all members of the group. You
   * can also provide custom attributes by specifying `attribute.{custom_attribute}`, where
   * `{custom_attribute}` is the name of the custom attribute to be mapped. You can define a maximum
   * of 50 custom attributes. The maximum length of a mapped attribute key is 100 characters, and
   * the key may only contain the characters [a-z0-9_]. You can reference these attributes in IAM
   * policies to define fine-grained access for a workload to Google Cloud resources. For example: *
   * `google.subject`: `principal://iam.googleapis.com/projects/{project}/locations/{location}/workl
   * oadIdentityPools/{pool}/subject/{value}` * `google.groups`: `principalSet://iam.googleapis.com/
   * projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}` *
   * `attribute.{custom_attribute}`: `principalSet://iam.googleapis.com/projects/{project}/locations
   * /{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}` Each value must
   * be a [Common Expression Language] (https://opensource.google/projects/cel) function that maps
   * an identity provider credential to the normalized attribute specified by the corresponding map
   * key. You can use the `assertion` keyword in the expression to access a JSON representation of
   * the authentication credential issued by the provider. The maximum length of an attribute
   * mapping expression is 2048 characters. When evaluated, the total size of all mapped attributes
   * must not exceed 8KB. For AWS providers, if no attribute mapping is defined, the following
   * default mapping applies: ``` { "google.subject":"assertion.arn", "attribute.aws_role":
   * "assertion.arn.contains('assumed-role')" " ? assertion.arn.extract('{account_arn}assumed-
   * role/')" " + 'assumed-role/'" " + assertion.arn.extract('assumed-role/{role_name}/')" " :
   * assertion.arn", } ``` If any custom attribute mappings are defined, they must include a mapping
   * to the `google.subject` attribute. For OIDC providers, you must supply a custom mapping, which
   * must include the `google.subject` attribute. For example, the following maps the `sub` claim of
   * the incoming credential to the `subject` attribute on a Google token: ``` {"google.subject":
   * "assertion.sub"} ```
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> attributeMapping;

  /**
   * An Amazon Web Services identity provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Aws aws;

  /**
   * Optional. A description for the provider. Cannot exceed 256 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Whether the provider is disabled. You cannot use a disabled provider to exchange
   * tokens. However, existing tokens still grant access.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * Optional. A display name for the provider. Cannot exceed 32 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Time after which the workload identity pool provider will be permanently purged
   * and cannot be recovered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Output only. The resource name of the provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * An OpenId Connect 1.0 identity provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Oidc oidc;

  /**
   * An SAML 2.0 identity provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Saml saml;

  /**
   * Output only. The state of the provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * An X.509-type identity provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private X509 x509;

  /**
   * Optional. [A Common Expression Language](https://opensource.google/projects/cel) expression, in
   * plain text, to restrict what otherwise valid authentication credentials issued by the provider
   * should not be accepted. The expression must output a boolean representing whether to allow the
   * federation. The following keywords may be referenced in the expressions: * `assertion`: JSON
   * representing the authentication credential issued by the provider. * `google`: The Google
   * attributes mapped from the assertion in the `attribute_mappings`. * `attribute`: The custom
   * attributes mapped from the assertion in the `attribute_mappings`. The maximum length of the
   * attribute condition expression is 4096 characters. If unspecified, all valid authentication
   * credential are accepted. The following example shows how to only allow credentials with a
   * mapped `google.groups` value of `admins`: ``` "'admins' in google.groups" ```
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributeCondition() {
    return attributeCondition;
  }

  /**
   * Optional. [A Common Expression Language](https://opensource.google/projects/cel) expression, in
   * plain text, to restrict what otherwise valid authentication credentials issued by the provider
   * should not be accepted. The expression must output a boolean representing whether to allow the
   * federation. The following keywords may be referenced in the expressions: * `assertion`: JSON
   * representing the authentication credential issued by the provider. * `google`: The Google
   * attributes mapped from the assertion in the `attribute_mappings`. * `attribute`: The custom
   * attributes mapped from the assertion in the `attribute_mappings`. The maximum length of the
   * attribute condition expression is 4096 characters. If unspecified, all valid authentication
   * credential are accepted. The following example shows how to only allow credentials with a
   * mapped `google.groups` value of `admins`: ``` "'admins' in google.groups" ```
   * @param attributeCondition attributeCondition or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setAttributeCondition(java.lang.String attributeCondition) {
    this.attributeCondition = attributeCondition;
    return this;
  }

  /**
   * Optional. Maps attributes from authentication credentials issued by an external identity
   * provider to Google Cloud attributes, such as `subject` and `segment`. Each key must be a string
   * specifying the Google Cloud IAM attribute to map to. The following keys are supported: *
   * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM
   * bindings. This is also the subject that appears in Cloud Logging logs. Cannot exceed 127 bytes.
   * * `google.groups`: Groups the external identity belongs to. You can grant groups access to
   * resources using an IAM `principalSet` binding; access applies to all members of the group. You
   * can also provide custom attributes by specifying `attribute.{custom_attribute}`, where
   * `{custom_attribute}` is the name of the custom attribute to be mapped. You can define a maximum
   * of 50 custom attributes. The maximum length of a mapped attribute key is 100 characters, and
   * the key may only contain the characters [a-z0-9_]. You can reference these attributes in IAM
   * policies to define fine-grained access for a workload to Google Cloud resources. For example: *
   * `google.subject`: `principal://iam.googleapis.com/projects/{project}/locations/{location}/workl
   * oadIdentityPools/{pool}/subject/{value}` * `google.groups`: `principalSet://iam.googleapis.com/
   * projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}` *
   * `attribute.{custom_attribute}`: `principalSet://iam.googleapis.com/projects/{project}/locations
   * /{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}` Each value must
   * be a [Common Expression Language] (https://opensource.google/projects/cel) function that maps
   * an identity provider credential to the normalized attribute specified by the corresponding map
   * key. You can use the `assertion` keyword in the expression to access a JSON representation of
   * the authentication credential issued by the provider. The maximum length of an attribute
   * mapping expression is 2048 characters. When evaluated, the total size of all mapped attributes
   * must not exceed 8KB. For AWS providers, if no attribute mapping is defined, the following
   * default mapping applies: ``` { "google.subject":"assertion.arn", "attribute.aws_role":
   * "assertion.arn.contains('assumed-role')" " ? assertion.arn.extract('{account_arn}assumed-
   * role/')" " + 'assumed-role/'" " + assertion.arn.extract('assumed-role/{role_name}/')" " :
   * assertion.arn", } ``` If any custom attribute mappings are defined, they must include a mapping
   * to the `google.subject` attribute. For OIDC providers, you must supply a custom mapping, which
   * must include the `google.subject` attribute. For example, the following maps the `sub` claim of
   * the incoming credential to the `subject` attribute on a Google token: ``` {"google.subject":
   * "assertion.sub"} ```
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAttributeMapping() {
    return attributeMapping;
  }

  /**
   * Optional. Maps attributes from authentication credentials issued by an external identity
   * provider to Google Cloud attributes, such as `subject` and `segment`. Each key must be a string
   * specifying the Google Cloud IAM attribute to map to. The following keys are supported: *
   * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM
   * bindings. This is also the subject that appears in Cloud Logging logs. Cannot exceed 127 bytes.
   * * `google.groups`: Groups the external identity belongs to. You can grant groups access to
   * resources using an IAM `principalSet` binding; access applies to all members of the group. You
   * can also provide custom attributes by specifying `attribute.{custom_attribute}`, where
   * `{custom_attribute}` is the name of the custom attribute to be mapped. You can define a maximum
   * of 50 custom attributes. The maximum length of a mapped attribute key is 100 characters, and
   * the key may only contain the characters [a-z0-9_]. You can reference these attributes in IAM
   * policies to define fine-grained access for a workload to Google Cloud resources. For example: *
   * `google.subject`: `principal://iam.googleapis.com/projects/{project}/locations/{location}/workl
   * oadIdentityPools/{pool}/subject/{value}` * `google.groups`: `principalSet://iam.googleapis.com/
   * projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}` *
   * `attribute.{custom_attribute}`: `principalSet://iam.googleapis.com/projects/{project}/locations
   * /{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}` Each value must
   * be a [Common Expression Language] (https://opensource.google/projects/cel) function that maps
   * an identity provider credential to the normalized attribute specified by the corresponding map
   * key. You can use the `assertion` keyword in the expression to access a JSON representation of
   * the authentication credential issued by the provider. The maximum length of an attribute
   * mapping expression is 2048 characters. When evaluated, the total size of all mapped attributes
   * must not exceed 8KB. For AWS providers, if no attribute mapping is defined, the following
   * default mapping applies: ``` { "google.subject":"assertion.arn", "attribute.aws_role":
   * "assertion.arn.contains('assumed-role')" " ? assertion.arn.extract('{account_arn}assumed-
   * role/')" " + 'assumed-role/'" " + assertion.arn.extract('assumed-role/{role_name}/')" " :
   * assertion.arn", } ``` If any custom attribute mappings are defined, they must include a mapping
   * to the `google.subject` attribute. For OIDC providers, you must supply a custom mapping, which
   * must include the `google.subject` attribute. For example, the following maps the `sub` claim of
   * the incoming credential to the `subject` attribute on a Google token: ``` {"google.subject":
   * "assertion.sub"} ```
   * @param attributeMapping attributeMapping or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setAttributeMapping(java.util.Map<String, java.lang.String> attributeMapping) {
    this.attributeMapping = attributeMapping;
    return this;
  }

  /**
   * An Amazon Web Services identity provider.
   * @return value or {@code null} for none
   */
  public Aws getAws() {
    return aws;
  }

  /**
   * An Amazon Web Services identity provider.
   * @param aws aws or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setAws(Aws aws) {
    this.aws = aws;
    return this;
  }

  /**
   * Optional. A description for the provider. Cannot exceed 256 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A description for the provider. Cannot exceed 256 characters.
   * @param description description or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Whether the provider is disabled. You cannot use a disabled provider to exchange
   * tokens. However, existing tokens still grant access.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * Optional. Whether the provider is disabled. You cannot use a disabled provider to exchange
   * tokens. However, existing tokens still grant access.
   * @param disabled disabled or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Optional. A display name for the provider. Cannot exceed 32 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. A display name for the provider. Cannot exceed 32 characters.
   * @param displayName displayName or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Time after which the workload identity pool provider will be permanently purged
   * and cannot be recovered.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. Time after which the workload identity pool provider will be permanently purged
   * and cannot be recovered.
   * @param expireTime expireTime or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Output only. The resource name of the provider.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the provider.
   * @param name name or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * An OpenId Connect 1.0 identity provider.
   * @return value or {@code null} for none
   */
  public Oidc getOidc() {
    return oidc;
  }

  /**
   * An OpenId Connect 1.0 identity provider.
   * @param oidc oidc or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setOidc(Oidc oidc) {
    this.oidc = oidc;
    return this;
  }

  /**
   * An SAML 2.0 identity provider.
   * @return value or {@code null} for none
   */
  public Saml getSaml() {
    return saml;
  }

  /**
   * An SAML 2.0 identity provider.
   * @param saml saml or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setSaml(Saml saml) {
    this.saml = saml;
    return this;
  }

  /**
   * Output only. The state of the provider.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the provider.
   * @param state state or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * An X.509-type identity provider.
   * @return value or {@code null} for none
   */
  public X509 getX509() {
    return x509;
  }

  /**
   * An X.509-type identity provider.
   * @param x509 x509 or {@code null} for none
   */
  public WorkloadIdentityPoolProvider setX509(X509 x509) {
    this.x509 = x509;
    return this;
  }

  @Override
  public WorkloadIdentityPoolProvider set(String fieldName, Object value) {
    return (WorkloadIdentityPoolProvider) super.set(fieldName, value);
  }

  @Override
  public WorkloadIdentityPoolProvider clone() {
    return (WorkloadIdentityPoolProvider) super.clone();
  }

}
