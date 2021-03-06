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

package com.google.api.services.transcoder.v1beta1.model;

/**
 * Estimated fractional progress for each step, from `0` to `1`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Progress extends com.google.api.client.json.GenericJson {

  /**
   * Estimated fractional progress for `analyzing` step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double analyzed;

  /**
   * Estimated fractional progress for `encoding` step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double encoded;

  /**
   * Estimated fractional progress for `notifying` step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double notified;

  /**
   * Estimated fractional progress for `uploading` step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double uploaded;

  /**
   * Estimated fractional progress for `analyzing` step.
   * @return value or {@code null} for none
   */
  public java.lang.Double getAnalyzed() {
    return analyzed;
  }

  /**
   * Estimated fractional progress for `analyzing` step.
   * @param analyzed analyzed or {@code null} for none
   */
  public Progress setAnalyzed(java.lang.Double analyzed) {
    this.analyzed = analyzed;
    return this;
  }

  /**
   * Estimated fractional progress for `encoding` step.
   * @return value or {@code null} for none
   */
  public java.lang.Double getEncoded() {
    return encoded;
  }

  /**
   * Estimated fractional progress for `encoding` step.
   * @param encoded encoded or {@code null} for none
   */
  public Progress setEncoded(java.lang.Double encoded) {
    this.encoded = encoded;
    return this;
  }

  /**
   * Estimated fractional progress for `notifying` step.
   * @return value or {@code null} for none
   */
  public java.lang.Double getNotified() {
    return notified;
  }

  /**
   * Estimated fractional progress for `notifying` step.
   * @param notified notified or {@code null} for none
   */
  public Progress setNotified(java.lang.Double notified) {
    this.notified = notified;
    return this;
  }

  /**
   * Estimated fractional progress for `uploading` step.
   * @return value or {@code null} for none
   */
  public java.lang.Double getUploaded() {
    return uploaded;
  }

  /**
   * Estimated fractional progress for `uploading` step.
   * @param uploaded uploaded or {@code null} for none
   */
  public Progress setUploaded(java.lang.Double uploaded) {
    this.uploaded = uploaded;
    return this;
  }

  @Override
  public Progress set(String fieldName, Object value) {
    return (Progress) super.set(fieldName, value);
  }

  @Override
  public Progress clone() {
    return (Progress) super.clone();
  }

}
