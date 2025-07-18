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

package com.google.api.services.gmail.model;

/**
 * A client-side encryption S/MIME key pair, which is comprised of a public key, its certificate
 * chain, and metadata for its paired private key. Gmail uses the key pair to complete the following
 * tasks: - Sign outgoing client-side encrypted messages. - Save and reopen drafts of client-side
 * encrypted messages. - Save and reopen sent messages. - Decrypt incoming or archived S/MIME
 * messages. For administrators managing identities and keypairs for users in their organization,
 * requests require authorization with a [service
 * account](https://developers.google.com/identity/protocols/OAuth2ServiceAccount) that has [domain-
 * wide delegation authority](https://developers.google.com/identity/protocols/OAuth2ServiceAccount#
 * delegatingauthority) to impersonate users with the
 * `https://www.googleapis.com/auth/gmail.settings.basic` scope. For users managing their own
 * identities and keypairs, requests require [hardware key
 * encryption](https://support.google.com/a/answer/14153163) turned on and configured.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CseKeyPair extends com.google.api.client.json.GenericJson {

  /**
   * Output only. If a key pair is set to `DISABLED`, the time that the key pair's state changed
   * from `ENABLED` to `DISABLED`. This field is present only when the key pair is in state
   * `DISABLED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String disableTime;

  /**
   * Output only. The current state of the key pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enablementState;

  /**
   * Output only. The immutable ID for the client-side encryption S/MIME key pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyPairId;

  /**
   * Output only. The public key and its certificate chain, in
   * [PEM](https://en.wikipedia.org/wiki/Privacy-Enhanced_Mail) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pem;

  /**
   * Input only. The public key and its certificate chain. The chain must be in
   * [PKCS#7](https://en.wikipedia.org/wiki/PKCS_7) format and use PEM encoding and ASCII armor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pkcs7;

  /**
   * Metadata for instances of this key pair's private key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CsePrivateKeyMetadata> privateKeyMetadata;

  /**
   * Output only. The email address identities that are specified on the leaf certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> subjectEmailAddresses;

  /**
   * Output only. If a key pair is set to `DISABLED`, the time that the key pair's state changed
   * from `ENABLED` to `DISABLED`. This field is present only when the key pair is in state
   * `DISABLED`.
   * @return value or {@code null} for none
   */
  public String getDisableTime() {
    return disableTime;
  }

  /**
   * Output only. If a key pair is set to `DISABLED`, the time that the key pair's state changed
   * from `ENABLED` to `DISABLED`. This field is present only when the key pair is in state
   * `DISABLED`.
   * @param disableTime disableTime or {@code null} for none
   */
  public CseKeyPair setDisableTime(String disableTime) {
    this.disableTime = disableTime;
    return this;
  }

  /**
   * Output only. The current state of the key pair.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnablementState() {
    return enablementState;
  }

  /**
   * Output only. The current state of the key pair.
   * @param enablementState enablementState or {@code null} for none
   */
  public CseKeyPair setEnablementState(java.lang.String enablementState) {
    this.enablementState = enablementState;
    return this;
  }

  /**
   * Output only. The immutable ID for the client-side encryption S/MIME key pair.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyPairId() {
    return keyPairId;
  }

  /**
   * Output only. The immutable ID for the client-side encryption S/MIME key pair.
   * @param keyPairId keyPairId or {@code null} for none
   */
  public CseKeyPair setKeyPairId(java.lang.String keyPairId) {
    this.keyPairId = keyPairId;
    return this;
  }

  /**
   * Output only. The public key and its certificate chain, in
   * [PEM](https://en.wikipedia.org/wiki/Privacy-Enhanced_Mail) format.
   * @return value or {@code null} for none
   */
  public java.lang.String getPem() {
    return pem;
  }

  /**
   * Output only. The public key and its certificate chain, in
   * [PEM](https://en.wikipedia.org/wiki/Privacy-Enhanced_Mail) format.
   * @param pem pem or {@code null} for none
   */
  public CseKeyPair setPem(java.lang.String pem) {
    this.pem = pem;
    return this;
  }

  /**
   * Input only. The public key and its certificate chain. The chain must be in
   * [PKCS#7](https://en.wikipedia.org/wiki/PKCS_7) format and use PEM encoding and ASCII armor.
   * @return value or {@code null} for none
   */
  public java.lang.String getPkcs7() {
    return pkcs7;
  }

  /**
   * Input only. The public key and its certificate chain. The chain must be in
   * [PKCS#7](https://en.wikipedia.org/wiki/PKCS_7) format and use PEM encoding and ASCII armor.
   * @param pkcs7 pkcs7 or {@code null} for none
   */
  public CseKeyPair setPkcs7(java.lang.String pkcs7) {
    this.pkcs7 = pkcs7;
    return this;
  }

  /**
   * Metadata for instances of this key pair's private key.
   * @return value or {@code null} for none
   */
  public java.util.List<CsePrivateKeyMetadata> getPrivateKeyMetadata() {
    return privateKeyMetadata;
  }

  /**
   * Metadata for instances of this key pair's private key.
   * @param privateKeyMetadata privateKeyMetadata or {@code null} for none
   */
  public CseKeyPair setPrivateKeyMetadata(java.util.List<CsePrivateKeyMetadata> privateKeyMetadata) {
    this.privateKeyMetadata = privateKeyMetadata;
    return this;
  }

  /**
   * Output only. The email address identities that are specified on the leaf certificate.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubjectEmailAddresses() {
    return subjectEmailAddresses;
  }

  /**
   * Output only. The email address identities that are specified on the leaf certificate.
   * @param subjectEmailAddresses subjectEmailAddresses or {@code null} for none
   */
  public CseKeyPair setSubjectEmailAddresses(java.util.List<java.lang.String> subjectEmailAddresses) {
    this.subjectEmailAddresses = subjectEmailAddresses;
    return this;
  }

  @Override
  public CseKeyPair set(String fieldName, Object value) {
    return (CseKeyPair) super.set(fieldName, value);
  }

  @Override
  public CseKeyPair clone() {
    return (CseKeyPair) super.clone();
  }

}
