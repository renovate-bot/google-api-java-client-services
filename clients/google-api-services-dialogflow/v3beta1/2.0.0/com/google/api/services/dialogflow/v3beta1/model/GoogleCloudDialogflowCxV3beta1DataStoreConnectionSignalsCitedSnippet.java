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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Snippet cited by the answer generation model.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1DataStoreConnectionSignalsCitedSnippet extends com.google.api.client.json.GenericJson {

  /**
   * Details of the snippet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3beta1DataStoreConnectionSignalsSearchSnippet searchSnippet;

  /**
   * Index of the snippet in `search_snippets` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer snippetIndex;

  /**
   * Details of the snippet.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1DataStoreConnectionSignalsSearchSnippet getSearchSnippet() {
    return searchSnippet;
  }

  /**
   * Details of the snippet.
   * @param searchSnippet searchSnippet or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1DataStoreConnectionSignalsCitedSnippet setSearchSnippet(GoogleCloudDialogflowCxV3beta1DataStoreConnectionSignalsSearchSnippet searchSnippet) {
    this.searchSnippet = searchSnippet;
    return this;
  }

  /**
   * Index of the snippet in `search_snippets` field.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSnippetIndex() {
    return snippetIndex;
  }

  /**
   * Index of the snippet in `search_snippets` field.
   * @param snippetIndex snippetIndex or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1DataStoreConnectionSignalsCitedSnippet setSnippetIndex(java.lang.Integer snippetIndex) {
    this.snippetIndex = snippetIndex;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1DataStoreConnectionSignalsCitedSnippet set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1DataStoreConnectionSignalsCitedSnippet) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1DataStoreConnectionSignalsCitedSnippet clone() {
    return (GoogleCloudDialogflowCxV3beta1DataStoreConnectionSignalsCitedSnippet) super.clone();
  }

}
