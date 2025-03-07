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

package com.google.api.services.chat.v1.model;

/**
 * A list of buttons layed out horizontally. For an example in Google Chat apps, see [Add a
 * button](https://developers.google.com/workspace/chat/design-interactive-card-
 * dialog#add_a_button). [Google Workspace add-ons and Chat
 * apps](https://developers.google.com/workspace/extend):
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1ButtonList extends com.google.api.client.json.GenericJson {

  /**
   * An array of buttons.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleAppsCardV1Button> buttons;

  static {
    // hack to force ProGuard to consider GoogleAppsCardV1Button used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleAppsCardV1Button.class);
  }

  /**
   * An array of buttons.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleAppsCardV1Button> getButtons() {
    return buttons;
  }

  /**
   * An array of buttons.
   * @param buttons buttons or {@code null} for none
   */
  public GoogleAppsCardV1ButtonList setButtons(java.util.List<GoogleAppsCardV1Button> buttons) {
    this.buttons = buttons;
    return this;
  }

  @Override
  public GoogleAppsCardV1ButtonList set(String fieldName, Object value) {
    return (GoogleAppsCardV1ButtonList) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1ButtonList clone() {
    return (GoogleAppsCardV1ButtonList) super.clone();
  }

}
