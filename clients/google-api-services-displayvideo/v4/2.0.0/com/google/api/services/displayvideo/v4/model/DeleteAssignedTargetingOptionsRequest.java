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

package com.google.api.services.displayvideo.v4.model;

/**
 * A request listing which assigned targeting options of a given targeting type should be deleted.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeleteAssignedTargetingOptionsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The assigned targeting option IDs to delete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> assignedTargetingOptionIds;

  /**
   * Required. Identifies the type of this assigned targeting option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetingType;

  /**
   * Required. The assigned targeting option IDs to delete.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAssignedTargetingOptionIds() {
    return assignedTargetingOptionIds;
  }

  /**
   * Required. The assigned targeting option IDs to delete.
   * @param assignedTargetingOptionIds assignedTargetingOptionIds or {@code null} for none
   */
  public DeleteAssignedTargetingOptionsRequest setAssignedTargetingOptionIds(java.util.List<java.lang.String> assignedTargetingOptionIds) {
    this.assignedTargetingOptionIds = assignedTargetingOptionIds;
    return this;
  }

  /**
   * Required. Identifies the type of this assigned targeting option.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetingType() {
    return targetingType;
  }

  /**
   * Required. Identifies the type of this assigned targeting option.
   * @param targetingType targetingType or {@code null} for none
   */
  public DeleteAssignedTargetingOptionsRequest setTargetingType(java.lang.String targetingType) {
    this.targetingType = targetingType;
    return this;
  }

  @Override
  public DeleteAssignedTargetingOptionsRequest set(String fieldName, Object value) {
    return (DeleteAssignedTargetingOptionsRequest) super.set(fieldName, value);
  }

  @Override
  public DeleteAssignedTargetingOptionsRequest clone() {
    return (DeleteAssignedTargetingOptionsRequest) super.clone();
  }

}
