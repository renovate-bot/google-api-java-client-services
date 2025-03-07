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

package com.google.api.services.bigquery.model;

/**
 * Metadata about open source compatible table. The fields contained in these options correspond to
 * Hive metastore's table-level properties.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExternalCatalogTableOptions extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A connection ID that specifies the credentials to be used to read external storage,
   * such as Azure Blob, Cloud Storage, or Amazon S3. This connection is needed to read the open
   * source table from BigQuery. The connection_id format must be either `..` or
   * `projects//locations//connections/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectionId;

  /**
   * Optional. A map of the key-value pairs defining the parameters and properties of the open
   * source table. Corresponds with Hive metastore table parameters. Maximum size of 4MiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> parameters;

  /**
   * Optional. A storage descriptor containing information about the physical storage of this table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageDescriptor storageDescriptor;

  /**
   * Optional. A connection ID that specifies the credentials to be used to read external storage,
   * such as Azure Blob, Cloud Storage, or Amazon S3. This connection is needed to read the open
   * source table from BigQuery. The connection_id format must be either `..` or
   * `projects//locations//connections/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectionId() {
    return connectionId;
  }

  /**
   * Optional. A connection ID that specifies the credentials to be used to read external storage,
   * such as Azure Blob, Cloud Storage, or Amazon S3. This connection is needed to read the open
   * source table from BigQuery. The connection_id format must be either `..` or
   * `projects//locations//connections/`.
   * @param connectionId connectionId or {@code null} for none
   */
  public ExternalCatalogTableOptions setConnectionId(java.lang.String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  /**
   * Optional. A map of the key-value pairs defining the parameters and properties of the open
   * source table. Corresponds with Hive metastore table parameters. Maximum size of 4MiB.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getParameters() {
    return parameters;
  }

  /**
   * Optional. A map of the key-value pairs defining the parameters and properties of the open
   * source table. Corresponds with Hive metastore table parameters. Maximum size of 4MiB.
   * @param parameters parameters or {@code null} for none
   */
  public ExternalCatalogTableOptions setParameters(java.util.Map<String, java.lang.String> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Optional. A storage descriptor containing information about the physical storage of this table.
   * @return value or {@code null} for none
   */
  public StorageDescriptor getStorageDescriptor() {
    return storageDescriptor;
  }

  /**
   * Optional. A storage descriptor containing information about the physical storage of this table.
   * @param storageDescriptor storageDescriptor or {@code null} for none
   */
  public ExternalCatalogTableOptions setStorageDescriptor(StorageDescriptor storageDescriptor) {
    this.storageDescriptor = storageDescriptor;
    return this;
  }

  @Override
  public ExternalCatalogTableOptions set(String fieldName, Object value) {
    return (ExternalCatalogTableOptions) super.set(fieldName, value);
  }

  @Override
  public ExternalCatalogTableOptions clone() {
    return (ExternalCatalogTableOptions) super.clone();
  }

}
