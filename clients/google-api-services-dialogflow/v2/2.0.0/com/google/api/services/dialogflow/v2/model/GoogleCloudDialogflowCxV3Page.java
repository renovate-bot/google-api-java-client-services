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
 * A Dialogflow CX conversation (session) can be described and visualized as a state machine. The
 * states of a CX session are represented by pages. For each flow, you define many pages, where your
 * combined pages can handle a complete conversation on the topics the flow is designed for. At any
 * given moment, exactly one page is the current page, the current page is considered active, and
 * the flow associated with that page is considered active. Every flow has a special start page.
 * When a flow initially becomes active, the start page page becomes the current page. For each
 * conversational turn, the current page will either stay the same or transition to another page.
 * You configure each page to collect information from the end-user that is relevant for the
 * conversational state represented by the page. For more information, see the [Page
 * guide](https://cloud.google.com/dialogflow/cx/docs/concept/page).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3Page extends com.google.api.client.json.GenericJson {

  /**
   * Hierarchical advanced settings for this page. The settings exposed at the lower level overrides
   * the settings exposed at the higher level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3AdvancedSettings advancedSettings;

  /**
   * The description of the page. The maximum length is 500 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The human-readable name of the page, unique within the flow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The fulfillment to call when the session is entering the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3Fulfillment entryFulfillment;

  /**
   * Handlers associated with the page to handle events such as webhook errors, no match or no
   * input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3EventHandler> eventHandlers;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowCxV3EventHandler used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowCxV3EventHandler.class);
  }

  /**
   * The form associated with the page, used for collecting parameters relevant to the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3Form form;

  /**
   * Optional. Knowledge connector configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowCxV3KnowledgeConnectorSettings knowledgeConnectorSettings;

  /**
   * The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage
   * populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Ordered list of `TransitionRouteGroups` added to the page. Transition route groups must be
   * unique within a page. If the page links both flow-level transition route groups and agent-level
   * transition route groups, the flow-level ones will have higher priority and will be put before
   * the agent-level ones. * If multiple transition routes within a page scope refer to the same
   * intent, then the precedence order is: page's transition route -> page's transition route group
   * -> flow's transition routes. * If multiple transition route groups within a page contain the
   * same intent, then the first group in the ordered list takes precedence.
   * Format:`projects//locations//agents//flows//transitionRouteGroups/` or
   * `projects//locations//agents//transitionRouteGroups/` for agent-level groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> transitionRouteGroups;

  /**
   * A list of transitions for the transition rules of this page. They route the conversation to
   * another page in the same flow, or another flow. When we are in a certain page, the
   * TransitionRoutes are evaluated in the following order: * TransitionRoutes defined in the page
   * with intent specified. * TransitionRoutes defined in the transition route groups with intent
   * specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined
   * in the transition route groups with intent specified. * TransitionRoutes defined in the page
   * with only condition specified. * TransitionRoutes defined in the transition route groups with
   * only condition specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowCxV3TransitionRoute> transitionRoutes;

  /**
   * Hierarchical advanced settings for this page. The settings exposed at the lower level overrides
   * the settings exposed at the higher level.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3AdvancedSettings getAdvancedSettings() {
    return advancedSettings;
  }

  /**
   * Hierarchical advanced settings for this page. The settings exposed at the lower level overrides
   * the settings exposed at the higher level.
   * @param advancedSettings advancedSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Page setAdvancedSettings(GoogleCloudDialogflowCxV3AdvancedSettings advancedSettings) {
    this.advancedSettings = advancedSettings;
    return this;
  }

  /**
   * The description of the page. The maximum length is 500 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the page. The maximum length is 500 characters.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Page setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The human-readable name of the page, unique within the flow.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The human-readable name of the page, unique within the flow.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Page setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The fulfillment to call when the session is entering the page.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Fulfillment getEntryFulfillment() {
    return entryFulfillment;
  }

  /**
   * The fulfillment to call when the session is entering the page.
   * @param entryFulfillment entryFulfillment or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Page setEntryFulfillment(GoogleCloudDialogflowCxV3Fulfillment entryFulfillment) {
    this.entryFulfillment = entryFulfillment;
    return this;
  }

  /**
   * Handlers associated with the page to handle events such as webhook errors, no match or no
   * input.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3EventHandler> getEventHandlers() {
    return eventHandlers;
  }

  /**
   * Handlers associated with the page to handle events such as webhook errors, no match or no
   * input.
   * @param eventHandlers eventHandlers or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Page setEventHandlers(java.util.List<GoogleCloudDialogflowCxV3EventHandler> eventHandlers) {
    this.eventHandlers = eventHandlers;
    return this;
  }

  /**
   * The form associated with the page, used for collecting parameters relevant to the page.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Form getForm() {
    return form;
  }

  /**
   * The form associated with the page, used for collecting parameters relevant to the page.
   * @param form form or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Page setForm(GoogleCloudDialogflowCxV3Form form) {
    this.form = form;
    return this;
  }

  /**
   * Optional. Knowledge connector configuration.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3KnowledgeConnectorSettings getKnowledgeConnectorSettings() {
    return knowledgeConnectorSettings;
  }

  /**
   * Optional. Knowledge connector configuration.
   * @param knowledgeConnectorSettings knowledgeConnectorSettings or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Page setKnowledgeConnectorSettings(GoogleCloudDialogflowCxV3KnowledgeConnectorSettings knowledgeConnectorSettings) {
    this.knowledgeConnectorSettings = knowledgeConnectorSettings;
    return this;
  }

  /**
   * The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage
   * populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage
   * populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Page setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Ordered list of `TransitionRouteGroups` added to the page. Transition route groups must be
   * unique within a page. If the page links both flow-level transition route groups and agent-level
   * transition route groups, the flow-level ones will have higher priority and will be put before
   * the agent-level ones. * If multiple transition routes within a page scope refer to the same
   * intent, then the precedence order is: page's transition route -> page's transition route group
   * -> flow's transition routes. * If multiple transition route groups within a page contain the
   * same intent, then the first group in the ordered list takes precedence.
   * Format:`projects//locations//agents//flows//transitionRouteGroups/` or
   * `projects//locations//agents//transitionRouteGroups/` for agent-level groups.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTransitionRouteGroups() {
    return transitionRouteGroups;
  }

  /**
   * Ordered list of `TransitionRouteGroups` added to the page. Transition route groups must be
   * unique within a page. If the page links both flow-level transition route groups and agent-level
   * transition route groups, the flow-level ones will have higher priority and will be put before
   * the agent-level ones. * If multiple transition routes within a page scope refer to the same
   * intent, then the precedence order is: page's transition route -> page's transition route group
   * -> flow's transition routes. * If multiple transition route groups within a page contain the
   * same intent, then the first group in the ordered list takes precedence.
   * Format:`projects//locations//agents//flows//transitionRouteGroups/` or
   * `projects//locations//agents//transitionRouteGroups/` for agent-level groups.
   * @param transitionRouteGroups transitionRouteGroups or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Page setTransitionRouteGroups(java.util.List<java.lang.String> transitionRouteGroups) {
    this.transitionRouteGroups = transitionRouteGroups;
    return this;
  }

  /**
   * A list of transitions for the transition rules of this page. They route the conversation to
   * another page in the same flow, or another flow. When we are in a certain page, the
   * TransitionRoutes are evaluated in the following order: * TransitionRoutes defined in the page
   * with intent specified. * TransitionRoutes defined in the transition route groups with intent
   * specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined
   * in the transition route groups with intent specified. * TransitionRoutes defined in the page
   * with only condition specified. * TransitionRoutes defined in the transition route groups with
   * only condition specified.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowCxV3TransitionRoute> getTransitionRoutes() {
    return transitionRoutes;
  }

  /**
   * A list of transitions for the transition rules of this page. They route the conversation to
   * another page in the same flow, or another flow. When we are in a certain page, the
   * TransitionRoutes are evaluated in the following order: * TransitionRoutes defined in the page
   * with intent specified. * TransitionRoutes defined in the transition route groups with intent
   * specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined
   * in the transition route groups with intent specified. * TransitionRoutes defined in the page
   * with only condition specified. * TransitionRoutes defined in the transition route groups with
   * only condition specified.
   * @param transitionRoutes transitionRoutes or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3Page setTransitionRoutes(java.util.List<GoogleCloudDialogflowCxV3TransitionRoute> transitionRoutes) {
    this.transitionRoutes = transitionRoutes;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3Page set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3Page) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3Page clone() {
    return (GoogleCloudDialogflowCxV3Page) super.clone();
  }

}
