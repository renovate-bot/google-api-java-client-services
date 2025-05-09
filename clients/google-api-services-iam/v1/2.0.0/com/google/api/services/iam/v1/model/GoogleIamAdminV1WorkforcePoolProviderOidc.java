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
 * Represents an OpenId Connect 1.0 identity provider.
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
public final class GoogleIamAdminV1WorkforcePoolProviderOidc extends com.google.api.client.json.GenericJson {

  /**
   * Required. The client ID. Must match the audience claim of the JWT issued by the identity
   * provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientId;

  /**
   * Optional. The optional client secret. Required to enable Authorization Code flow for web sign-
   * in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIamAdminV1WorkforcePoolProviderOidcClientSecret clientSecret;

  /**
   * Required. The OIDC issuer URI. Must be a valid URI using the `https` scheme.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String issuerUri;

  /**
   * Optional. OIDC JWKs in JSON String format. For details on the definition of a JWK, see
   * https://tools.ietf.org/html/rfc7517. If not set, the `jwks_uri` from the discovery
   * document(fetched from the .well-known path of the `issuer_uri`) will be used. Currently, RSA
   * and EC asymmetric keys are supported. The JWK must use following format and include only the
   * following fields: { "keys": [ { "kty": "RSA/EC", "alg": "", "use": "sig", "kid": "", "n": "",
   * "e": "", "x": "", "y": "", "crv": "" } ] }
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jwksJson;

  /**
   * Required. Configuration for web single sign-on for the OIDC provider. Here, web sign-in refers
   * to console sign-in and gcloud sign-in through the browser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIamAdminV1WorkforcePoolProviderOidcWebSsoConfig webSsoConfig;

  /**
   * Required. The client ID. Must match the audience claim of the JWT issued by the identity
   * provider.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientId() {
    return clientId;
  }

  /**
   * Required. The client ID. Must match the audience claim of the JWT issued by the identity
   * provider.
   * @param clientId clientId or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderOidc setClientId(java.lang.String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Optional. The optional client secret. Required to enable Authorization Code flow for web sign-
   * in.
   * @return value or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderOidcClientSecret getClientSecret() {
    return clientSecret;
  }

  /**
   * Optional. The optional client secret. Required to enable Authorization Code flow for web sign-
   * in.
   * @param clientSecret clientSecret or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderOidc setClientSecret(GoogleIamAdminV1WorkforcePoolProviderOidcClientSecret clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Required. The OIDC issuer URI. Must be a valid URI using the `https` scheme.
   * @return value or {@code null} for none
   */
  public java.lang.String getIssuerUri() {
    return issuerUri;
  }

  /**
   * Required. The OIDC issuer URI. Must be a valid URI using the `https` scheme.
   * @param issuerUri issuerUri or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderOidc setIssuerUri(java.lang.String issuerUri) {
    this.issuerUri = issuerUri;
    return this;
  }

  /**
   * Optional. OIDC JWKs in JSON String format. For details on the definition of a JWK, see
   * https://tools.ietf.org/html/rfc7517. If not set, the `jwks_uri` from the discovery
   * document(fetched from the .well-known path of the `issuer_uri`) will be used. Currently, RSA
   * and EC asymmetric keys are supported. The JWK must use following format and include only the
   * following fields: { "keys": [ { "kty": "RSA/EC", "alg": "", "use": "sig", "kid": "", "n": "",
   * "e": "", "x": "", "y": "", "crv": "" } ] }
   * @return value or {@code null} for none
   */
  public java.lang.String getJwksJson() {
    return jwksJson;
  }

  /**
   * Optional. OIDC JWKs in JSON String format. For details on the definition of a JWK, see
   * https://tools.ietf.org/html/rfc7517. If not set, the `jwks_uri` from the discovery
   * document(fetched from the .well-known path of the `issuer_uri`) will be used. Currently, RSA
   * and EC asymmetric keys are supported. The JWK must use following format and include only the
   * following fields: { "keys": [ { "kty": "RSA/EC", "alg": "", "use": "sig", "kid": "", "n": "",
   * "e": "", "x": "", "y": "", "crv": "" } ] }
   * @param jwksJson jwksJson or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderOidc setJwksJson(java.lang.String jwksJson) {
    this.jwksJson = jwksJson;
    return this;
  }

  /**
   * Required. Configuration for web single sign-on for the OIDC provider. Here, web sign-in refers
   * to console sign-in and gcloud sign-in through the browser.
   * @return value or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderOidcWebSsoConfig getWebSsoConfig() {
    return webSsoConfig;
  }

  /**
   * Required. Configuration for web single sign-on for the OIDC provider. Here, web sign-in refers
   * to console sign-in and gcloud sign-in through the browser.
   * @param webSsoConfig webSsoConfig or {@code null} for none
   */
  public GoogleIamAdminV1WorkforcePoolProviderOidc setWebSsoConfig(GoogleIamAdminV1WorkforcePoolProviderOidcWebSsoConfig webSsoConfig) {
    this.webSsoConfig = webSsoConfig;
    return this;
  }

  @Override
  public GoogleIamAdminV1WorkforcePoolProviderOidc set(String fieldName, Object value) {
    return (GoogleIamAdminV1WorkforcePoolProviderOidc) super.set(fieldName, value);
  }

  @Override
  public GoogleIamAdminV1WorkforcePoolProviderOidc clone() {
    return (GoogleIamAdminV1WorkforcePoolProviderOidc) super.clone();
  }

}
