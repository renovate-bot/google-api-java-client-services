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

package com.google.api.services.accessapproval.v1.model;

/**
 * A decision that has been made to approve access to a resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Approval API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApproveDecision extends com.google.api.client.json.GenericJson {

  /**
   * The time at which approval was granted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String approveTime;

  /**
   * True when the request has been auto-approved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoApproved;

  /**
   * The time at which the approval expires.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * If set, denotes the timestamp at which the approval is invalidated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String invalidateTime;

  /**
   * True when the request has been approved by the customer's defined policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean policyApproved;

  /**
   * The signature for the ApprovalRequest and details on how it was signed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SignatureInfo signatureInfo;

  /**
   * The time at which approval was granted.
   * @return value or {@code null} for none
   */
  public String getApproveTime() {
    return approveTime;
  }

  /**
   * The time at which approval was granted.
   * @param approveTime approveTime or {@code null} for none
   */
  public ApproveDecision setApproveTime(String approveTime) {
    this.approveTime = approveTime;
    return this;
  }

  /**
   * True when the request has been auto-approved.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoApproved() {
    return autoApproved;
  }

  /**
   * True when the request has been auto-approved.
   * @param autoApproved autoApproved or {@code null} for none
   */
  public ApproveDecision setAutoApproved(java.lang.Boolean autoApproved) {
    this.autoApproved = autoApproved;
    return this;
  }

  /**
   * The time at which the approval expires.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * The time at which the approval expires.
   * @param expireTime expireTime or {@code null} for none
   */
  public ApproveDecision setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * If set, denotes the timestamp at which the approval is invalidated.
   * @return value or {@code null} for none
   */
  public String getInvalidateTime() {
    return invalidateTime;
  }

  /**
   * If set, denotes the timestamp at which the approval is invalidated.
   * @param invalidateTime invalidateTime or {@code null} for none
   */
  public ApproveDecision setInvalidateTime(String invalidateTime) {
    this.invalidateTime = invalidateTime;
    return this;
  }

  /**
   * True when the request has been approved by the customer's defined policy.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPolicyApproved() {
    return policyApproved;
  }

  /**
   * True when the request has been approved by the customer's defined policy.
   * @param policyApproved policyApproved or {@code null} for none
   */
  public ApproveDecision setPolicyApproved(java.lang.Boolean policyApproved) {
    this.policyApproved = policyApproved;
    return this;
  }

  /**
   * The signature for the ApprovalRequest and details on how it was signed.
   * @return value or {@code null} for none
   */
  public SignatureInfo getSignatureInfo() {
    return signatureInfo;
  }

  /**
   * The signature for the ApprovalRequest and details on how it was signed.
   * @param signatureInfo signatureInfo or {@code null} for none
   */
  public ApproveDecision setSignatureInfo(SignatureInfo signatureInfo) {
    this.signatureInfo = signatureInfo;
    return this;
  }

  @Override
  public ApproveDecision set(String fieldName, Object value) {
    return (ApproveDecision) super.set(fieldName, value);
  }

  @Override
  public ApproveDecision clone() {
    return (ApproveDecision) super.clone();
  }

}
