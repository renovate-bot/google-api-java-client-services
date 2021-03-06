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

package com.google.api.services.testing.model;

/**
 * An opaque binary blob file to install on the device before the test starts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ObbFile extends com.google.api.client.json.GenericJson {

  /**
   * Required. Opaque Binary Blob (OBB) file(s) to install on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FileReference obb;

  /**
   * Required. OBB file name which must conform to the format as specified by Android e.g.
   * [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on
   * the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String obbFileName;

  /**
   * Required. Opaque Binary Blob (OBB) file(s) to install on the device.
   * @return value or {@code null} for none
   */
  public FileReference getObb() {
    return obb;
  }

  /**
   * Required. Opaque Binary Blob (OBB) file(s) to install on the device.
   * @param obb obb or {@code null} for none
   */
  public ObbFile setObb(FileReference obb) {
    this.obb = obb;
    return this;
  }

  /**
   * Required. OBB file name which must conform to the format as specified by Android e.g.
   * [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on
   * the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getObbFileName() {
    return obbFileName;
  }

  /**
   * Required. OBB file name which must conform to the format as specified by Android e.g.
   * [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on
   * the device.
   * @param obbFileName obbFileName or {@code null} for none
   */
  public ObbFile setObbFileName(java.lang.String obbFileName) {
    this.obbFileName = obbFileName;
    return this;
  }

  @Override
  public ObbFile set(String fieldName, Object value) {
    return (ObbFile) super.set(fieldName, value);
  }

  @Override
  public ObbFile clone() {
    return (ObbFile) super.clone();
  }

}
