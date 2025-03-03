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

package com.google.api.services.bigqueryconnection.v1.model;

/**
 * Credential info for the Cloud SQL.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery Connection API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudSqlCredential extends com.google.api.client.json.GenericJson {

  /**
   * The password for the credential.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * The username for the credential.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * The password for the credential.
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * The password for the credential.
   * @param password password or {@code null} for none
   */
  public CloudSqlCredential setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * The username for the credential.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * The username for the credential.
   * @param username username or {@code null} for none
   */
  public CloudSqlCredential setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public CloudSqlCredential set(String fieldName, Object value) {
    return (CloudSqlCredential) super.set(fieldName, value);
  }

  @Override
  public CloudSqlCredential clone() {
    return (CloudSqlCredential) super.clone();
  }

}
