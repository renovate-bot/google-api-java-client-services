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

package com.google.api.services.migrationcenter.v1.model;

/**
 * Specific details for a Mysql database.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MySqlSchemaDetails extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Mysql storage engine tables.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MySqlStorageEngineDetails> storageEngines;

  /**
   * Optional. Mysql storage engine tables.
   * @return value or {@code null} for none
   */
  public java.util.List<MySqlStorageEngineDetails> getStorageEngines() {
    return storageEngines;
  }

  /**
   * Optional. Mysql storage engine tables.
   * @param storageEngines storageEngines or {@code null} for none
   */
  public MySqlSchemaDetails setStorageEngines(java.util.List<MySqlStorageEngineDetails> storageEngines) {
    this.storageEngines = storageEngines;
    return this;
  }

  @Override
  public MySqlSchemaDetails set(String fieldName, Object value) {
    return (MySqlSchemaDetails) super.set(fieldName, value);
  }

  @Override
  public MySqlSchemaDetails clone() {
    return (MySqlSchemaDetails) super.clone();
  }

}
