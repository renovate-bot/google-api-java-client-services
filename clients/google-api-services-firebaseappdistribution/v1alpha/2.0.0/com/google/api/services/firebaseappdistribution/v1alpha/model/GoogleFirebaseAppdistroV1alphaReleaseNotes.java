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

package com.google.api.services.firebaseappdistribution.v1alpha.model;

/**
 * Release notes for a release.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Distribution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppdistroV1alphaReleaseNotes extends com.google.api.client.json.GenericJson {

  /**
   * The actual release notes text from the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String releaseNotes;

  /**
   * The actual release notes text from the user.
   * @return value or {@code null} for none
   */
  public java.lang.String getReleaseNotes() {
    return releaseNotes;
  }

  /**
   * The actual release notes text from the user.
   * @param releaseNotes releaseNotes or {@code null} for none
   */
  public GoogleFirebaseAppdistroV1alphaReleaseNotes setReleaseNotes(java.lang.String releaseNotes) {
    this.releaseNotes = releaseNotes;
    return this;
  }

  @Override
  public GoogleFirebaseAppdistroV1alphaReleaseNotes set(String fieldName, Object value) {
    return (GoogleFirebaseAppdistroV1alphaReleaseNotes) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppdistroV1alphaReleaseNotes clone() {
    return (GoogleFirebaseAppdistroV1alphaReleaseNotes) super.clone();
  }

}
