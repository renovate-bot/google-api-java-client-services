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

package com.google.api.services.workloadmanager.v1.model;

/**
 * The body of sap workload
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Workload Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SapWorkload extends com.google.api.client.json.GenericJson {

  /**
   * Output only. the acsc componment
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SapComponent application;

  /**
   * Output only. the architecture
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String architecture;

  /**
   * Output only. the database componment
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SapComponent database;

  /**
   * Output only. The metadata for SAP workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Output only. the products on this workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Product> products;

  static {
    // hack to force ProGuard to consider Product used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Product.class);
  }

  /**
   * Output only. the acsc componment
   * @return value or {@code null} for none
   */
  public SapComponent getApplication() {
    return application;
  }

  /**
   * Output only. the acsc componment
   * @param application application or {@code null} for none
   */
  public SapWorkload setApplication(SapComponent application) {
    this.application = application;
    return this;
  }

  /**
   * Output only. the architecture
   * @return value or {@code null} for none
   */
  public java.lang.String getArchitecture() {
    return architecture;
  }

  /**
   * Output only. the architecture
   * @param architecture architecture or {@code null} for none
   */
  public SapWorkload setArchitecture(java.lang.String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Output only. the database componment
   * @return value or {@code null} for none
   */
  public SapComponent getDatabase() {
    return database;
  }

  /**
   * Output only. the database componment
   * @param database database or {@code null} for none
   */
  public SapWorkload setDatabase(SapComponent database) {
    this.database = database;
    return this;
  }

  /**
   * Output only. The metadata for SAP workload.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Output only. The metadata for SAP workload.
   * @param metadata metadata or {@code null} for none
   */
  public SapWorkload setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Output only. the products on this workload.
   * @return value or {@code null} for none
   */
  public java.util.List<Product> getProducts() {
    return products;
  }

  /**
   * Output only. the products on this workload.
   * @param products products or {@code null} for none
   */
  public SapWorkload setProducts(java.util.List<Product> products) {
    this.products = products;
    return this;
  }

  @Override
  public SapWorkload set(String fieldName, Object value) {
    return (SapWorkload) super.set(fieldName, value);
  }

  @Override
  public SapWorkload clone() {
    return (SapWorkload) super.clone();
  }

}
