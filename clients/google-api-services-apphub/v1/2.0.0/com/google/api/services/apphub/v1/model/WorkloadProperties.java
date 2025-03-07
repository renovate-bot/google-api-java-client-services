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

package com.google.api.services.apphub.v1.model;

/**
 * Properties of an underlying compute resource represented by the Workload.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkloadProperties extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The service project identifier that the underlying cloud resource resides in.
   * Empty for non-cloud resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcpProject;

  /**
   * Output only. The location that the underlying compute resource resides in (for example, us-
   * west1).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Output only. The location that the underlying compute resource resides in if it is zonal (for
   * example, us-west1-a).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Output only. The service project identifier that the underlying cloud resource resides in.
   * Empty for non-cloud resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcpProject() {
    return gcpProject;
  }

  /**
   * Output only. The service project identifier that the underlying cloud resource resides in.
   * Empty for non-cloud resources.
   * @param gcpProject gcpProject or {@code null} for none
   */
  public WorkloadProperties setGcpProject(java.lang.String gcpProject) {
    this.gcpProject = gcpProject;
    return this;
  }

  /**
   * Output only. The location that the underlying compute resource resides in (for example, us-
   * west1).
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Output only. The location that the underlying compute resource resides in (for example, us-
   * west1).
   * @param location location or {@code null} for none
   */
  public WorkloadProperties setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Output only. The location that the underlying compute resource resides in if it is zonal (for
   * example, us-west1-a).
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Output only. The location that the underlying compute resource resides in if it is zonal (for
   * example, us-west1-a).
   * @param zone zone or {@code null} for none
   */
  public WorkloadProperties setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public WorkloadProperties set(String fieldName, Object value) {
    return (WorkloadProperties) super.set(fieldName, value);
  }

  @Override
  public WorkloadProperties clone() {
    return (WorkloadProperties) super.clone();
  }

}
