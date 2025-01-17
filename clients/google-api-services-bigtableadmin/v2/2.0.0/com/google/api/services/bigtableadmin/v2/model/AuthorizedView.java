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
 * An Authorized View of a Cloud Bigtable Table.
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
public final class AuthorizedView extends com.google.api.client.json.GenericJson {

  /**
   * Set to true to make the AuthorizedView protected against deletion. The parent Table and
   * containing Instance cannot be deleted if an AuthorizedView has this bit set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deletionProtection;

  /**
   * The etag for this AuthorizedView. If this is provided on update, it must match the server's
   * etag. The server returns ABORTED error on a mismatched etag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Identifier. The name of this AuthorizedView. Values are of the form
   * `projects/{project}/instances/{instance}/tables/{table}/authorizedViews/{authorized_view}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * An AuthorizedView permitting access to an explicit subset of a Table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleBigtableAdminV2AuthorizedViewSubsetView subsetView;

  /**
   * Set to true to make the AuthorizedView protected against deletion. The parent Table and
   * containing Instance cannot be deleted if an AuthorizedView has this bit set.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeletionProtection() {
    return deletionProtection;
  }

  /**
   * Set to true to make the AuthorizedView protected against deletion. The parent Table and
   * containing Instance cannot be deleted if an AuthorizedView has this bit set.
   * @param deletionProtection deletionProtection or {@code null} for none
   */
  public AuthorizedView setDeletionProtection(java.lang.Boolean deletionProtection) {
    this.deletionProtection = deletionProtection;
    return this;
  }

  /**
   * The etag for this AuthorizedView. If this is provided on update, it must match the server's
   * etag. The server returns ABORTED error on a mismatched etag.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The etag for this AuthorizedView. If this is provided on update, it must match the server's
   * etag. The server returns ABORTED error on a mismatched etag.
   * @param etag etag or {@code null} for none
   */
  public AuthorizedView setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Identifier. The name of this AuthorizedView. Values are of the form
   * `projects/{project}/instances/{instance}/tables/{table}/authorizedViews/{authorized_view}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The name of this AuthorizedView. Values are of the form
   * `projects/{project}/instances/{instance}/tables/{table}/authorizedViews/{authorized_view}`
   * @param name name or {@code null} for none
   */
  public AuthorizedView setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * An AuthorizedView permitting access to an explicit subset of a Table.
   * @return value or {@code null} for none
   */
  public GoogleBigtableAdminV2AuthorizedViewSubsetView getSubsetView() {
    return subsetView;
  }

  /**
   * An AuthorizedView permitting access to an explicit subset of a Table.
   * @param subsetView subsetView or {@code null} for none
   */
  public AuthorizedView setSubsetView(GoogleBigtableAdminV2AuthorizedViewSubsetView subsetView) {
    this.subsetView = subsetView;
    return this;
  }

  @Override
  public AuthorizedView set(String fieldName, Object value) {
    return (AuthorizedView) super.set(fieldName, value);
  }

  @Override
  public AuthorizedView clone() {
    return (AuthorizedView) super.clone();
  }

}
