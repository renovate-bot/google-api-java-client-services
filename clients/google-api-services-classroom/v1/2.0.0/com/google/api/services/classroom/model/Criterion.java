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

package com.google.api.services.classroom.model;

/**
 * A rubric criterion. Each criterion is a dimension on which performance is rated.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Criterion extends com.google.api.client.json.GenericJson {

  /**
   * The description of the criterion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The criterion ID. On creation, an ID is assigned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The list of levels within this criterion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Level> levels;

  /**
   * The title of the criterion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The description of the criterion.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the criterion.
   * @param description description or {@code null} for none
   */
  public Criterion setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The criterion ID. On creation, an ID is assigned.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The criterion ID. On creation, an ID is assigned.
   * @param id id or {@code null} for none
   */
  public Criterion setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The list of levels within this criterion.
   * @return value or {@code null} for none
   */
  public java.util.List<Level> getLevels() {
    return levels;
  }

  /**
   * The list of levels within this criterion.
   * @param levels levels or {@code null} for none
   */
  public Criterion setLevels(java.util.List<Level> levels) {
    this.levels = levels;
    return this;
  }

  /**
   * The title of the criterion.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the criterion.
   * @param title title or {@code null} for none
   */
  public Criterion setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Criterion set(String fieldName, Object value) {
    return (Criterion) super.set(fieldName, value);
  }

  @Override
  public Criterion clone() {
    return (Criterion) super.clone();
  }

}
