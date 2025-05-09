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

package com.google.api.services.chromepolicy.v1;

/**
 * Available OAuth 2.0 scopes for use with the Chrome Policy API.
 *
 * @since 1.4
 */
public class ChromePolicyScopes {

  /** See, edit, create or delete policies applied to ChromeOS and Chrome Browsers managed within your organization. */
  public static final String CHROME_MANAGEMENT_POLICY = "https://www.googleapis.com/auth/chrome.management.policy";

  /** See policies applied to ChromeOS and Chrome Browsers managed within your organization. */
  public static final String CHROME_MANAGEMENT_POLICY_READONLY = "https://www.googleapis.com/auth/chrome.management.policy.readonly";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(CHROME_MANAGEMENT_POLICY);
    set.add(CHROME_MANAGEMENT_POLICY_READONLY);
    return java.util.Collections.unmodifiableSet(set);
  }

  private ChromePolicyScopes() {
  }
}
