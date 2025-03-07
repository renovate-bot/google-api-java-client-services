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

package com.google.api.services.gkebackup.v1.model;

/**
 * Defines the filter for `Restore`. This filter can be used to further refine the resource
 * selection of the `Restore` beyond the coarse-grained scope defined in the `RestorePlan`.
 * `exclusion_filters` take precedence over `inclusion_filters`. If a resource matches both
 * `inclusion_filters` and `exclusion_filters`, it will not be restored.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup for GKE API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Filter extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Excludes resources from restoration. If specified, a resource will not be restored if
   * it matches any `ResourceSelector` of the `exclusion_filters`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceSelector> exclusionFilters;

  /**
   * Optional. Selects resources for restoration. If specified, only resources which match
   * `inclusion_filters` will be selected for restoration. A resource will be selected if it matches
   * any `ResourceSelector` of the `inclusion_filters`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceSelector> inclusionFilters;

  /**
   * Optional. Excludes resources from restoration. If specified, a resource will not be restored if
   * it matches any `ResourceSelector` of the `exclusion_filters`.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceSelector> getExclusionFilters() {
    return exclusionFilters;
  }

  /**
   * Optional. Excludes resources from restoration. If specified, a resource will not be restored if
   * it matches any `ResourceSelector` of the `exclusion_filters`.
   * @param exclusionFilters exclusionFilters or {@code null} for none
   */
  public Filter setExclusionFilters(java.util.List<ResourceSelector> exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
    return this;
  }

  /**
   * Optional. Selects resources for restoration. If specified, only resources which match
   * `inclusion_filters` will be selected for restoration. A resource will be selected if it matches
   * any `ResourceSelector` of the `inclusion_filters`.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceSelector> getInclusionFilters() {
    return inclusionFilters;
  }

  /**
   * Optional. Selects resources for restoration. If specified, only resources which match
   * `inclusion_filters` will be selected for restoration. A resource will be selected if it matches
   * any `ResourceSelector` of the `inclusion_filters`.
   * @param inclusionFilters inclusionFilters or {@code null} for none
   */
  public Filter setInclusionFilters(java.util.List<ResourceSelector> inclusionFilters) {
    this.inclusionFilters = inclusionFilters;
    return this;
  }

  @Override
  public Filter set(String fieldName, Object value) {
    return (Filter) super.set(fieldName, value);
  }

  @Override
  public Filter clone() {
    return (Filter) super.clone();
  }

}
