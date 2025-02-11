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

package com.google.api.services.dialogflow.v2.model;

/**
 * Represents an intent suggestion.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2IntentSuggestion extends com.google.api.client.json.GenericJson {

  /**
   * Human readable description for better understanding an intent like its scope, content, result
   * etc. Maximum character limit: 140 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The display name of the intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The unique identifier of this intent. Format: `projects//locations//agent/intents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String intentV2;

  /**
   * Human readable description for better understanding an intent like its scope, content, result
   * etc. Maximum character limit: 140 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Human readable description for better understanding an intent like its scope, content, result
   * etc. Maximum character limit: 140 characters.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentSuggestion setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The display name of the intent.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the intent.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentSuggestion setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The unique identifier of this intent. Format: `projects//locations//agent/intents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getIntentV2() {
    return intentV2;
  }

  /**
   * The unique identifier of this intent. Format: `projects//locations//agent/intents/`.
   * @param intentV2 intentV2 or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentSuggestion setIntentV2(java.lang.String intentV2) {
    this.intentV2 = intentV2;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2IntentSuggestion set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2IntentSuggestion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2IntentSuggestion clone() {
    return (GoogleCloudDialogflowV2IntentSuggestion) super.clone();
  }

}
