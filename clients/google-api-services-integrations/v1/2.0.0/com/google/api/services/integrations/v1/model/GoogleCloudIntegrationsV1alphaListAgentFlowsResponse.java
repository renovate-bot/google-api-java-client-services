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

package com.google.api.services.integrations.v1.model;

/**
 * Response for ListAgentFlows.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaListAgentFlowsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The AgentFlows from the specified collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudIntegrationsV1alphaAgentFlow> agentFlows;

  static {
    // hack to force ProGuard to consider GoogleCloudIntegrationsV1alphaAgentFlow used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudIntegrationsV1alphaAgentFlow.class);
  }

  /**
   * Output only. A token, which can be sent as `page_token` to retrieve the next page. If this
   * field is omitted, there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Output only. The AgentFlows from the specified collection.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudIntegrationsV1alphaAgentFlow> getAgentFlows() {
    return agentFlows;
  }

  /**
   * Output only. The AgentFlows from the specified collection.
   * @param agentFlows agentFlows or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaListAgentFlowsResponse setAgentFlows(java.util.List<GoogleCloudIntegrationsV1alphaAgentFlow> agentFlows) {
    this.agentFlows = agentFlows;
    return this;
  }

  /**
   * Output only. A token, which can be sent as `page_token` to retrieve the next page. If this
   * field is omitted, there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Output only. A token, which can be sent as `page_token` to retrieve the next page. If this
   * field is omitted, there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaListAgentFlowsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaListAgentFlowsResponse set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaListAgentFlowsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaListAgentFlowsResponse clone() {
    return (GoogleCloudIntegrationsV1alphaListAgentFlowsResponse) super.clone();
  }

}
