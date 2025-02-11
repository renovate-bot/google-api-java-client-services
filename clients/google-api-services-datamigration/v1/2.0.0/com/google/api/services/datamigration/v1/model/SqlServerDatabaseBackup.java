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

package com.google.api.services.datamigration.v1.model;

/**
 * Specifies the backup details for a single database in Cloud Storage for homogeneous migration to
 * Cloud SQL for SQL Server.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Database Migration API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SqlServerDatabaseBackup extends com.google.api.client.json.GenericJson {

  /**
   * Required. Name of a SQL Server database for which to define backup configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String database;

  /**
   * Optional. Encryption settings for the database. Required if provided database backups are
   * encrypted. Encryption settings include path to certificate, path to certificate private key,
   * and key password.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SqlServerEncryptionOptions encryptionOptions;

  /**
   * Required. Name of a SQL Server database for which to define backup configuration.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabase() {
    return database;
  }

  /**
   * Required. Name of a SQL Server database for which to define backup configuration.
   * @param database database or {@code null} for none
   */
  public SqlServerDatabaseBackup setDatabase(java.lang.String database) {
    this.database = database;
    return this;
  }

  /**
   * Optional. Encryption settings for the database. Required if provided database backups are
   * encrypted. Encryption settings include path to certificate, path to certificate private key,
   * and key password.
   * @return value or {@code null} for none
   */
  public SqlServerEncryptionOptions getEncryptionOptions() {
    return encryptionOptions;
  }

  /**
   * Optional. Encryption settings for the database. Required if provided database backups are
   * encrypted. Encryption settings include path to certificate, path to certificate private key,
   * and key password.
   * @param encryptionOptions encryptionOptions or {@code null} for none
   */
  public SqlServerDatabaseBackup setEncryptionOptions(SqlServerEncryptionOptions encryptionOptions) {
    this.encryptionOptions = encryptionOptions;
    return this;
  }

  @Override
  public SqlServerDatabaseBackup set(String fieldName, Object value) {
    return (SqlServerDatabaseBackup) super.set(fieldName, value);
  }

  @Override
  public SqlServerDatabaseBackup clone() {
    return (SqlServerDatabaseBackup) super.clone();
  }

}
