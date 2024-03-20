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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Encodes the value as an 8-byte big endian twos complement `Bytes` value. * Natural sort? No
 * (positive values only) * Self-delimiting? Yes * Compatibility? - BigQuery Federation `BINARY`
 * encoding - HBase `Bytes.toBytes` - Java `ByteBuffer.putLong()` with `ByteOrder.BIG_ENDIAN`
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleBigtableAdminV2TypeInt64EncodingBigEndianBytes extends com.google.api.client.json.GenericJson {

  /**
   * The underlying `Bytes` type, which may be able to encode further.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleBigtableAdminV2TypeBytes bytesType;

  /**
   * The underlying `Bytes` type, which may be able to encode further.
   * @return value or {@code null} for none
   */
  public GoogleBigtableAdminV2TypeBytes getBytesType() {
    return bytesType;
  }

  /**
   * The underlying `Bytes` type, which may be able to encode further.
   * @param bytesType bytesType or {@code null} for none
   */
  public GoogleBigtableAdminV2TypeInt64EncodingBigEndianBytes setBytesType(GoogleBigtableAdminV2TypeBytes bytesType) {
    this.bytesType = bytesType;
    return this;
  }

  @Override
  public GoogleBigtableAdminV2TypeInt64EncodingBigEndianBytes set(String fieldName, Object value) {
    return (GoogleBigtableAdminV2TypeInt64EncodingBigEndianBytes) super.set(fieldName, value);
  }

  @Override
  public GoogleBigtableAdminV2TypeInt64EncodingBigEndianBytes clone() {
    return (GoogleBigtableAdminV2TypeInt64EncodingBigEndianBytes) super.clone();
  }

}