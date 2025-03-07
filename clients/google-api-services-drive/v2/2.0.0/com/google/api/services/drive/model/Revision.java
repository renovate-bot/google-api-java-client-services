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

package com.google.api.services.drive.model;

/**
 * A revision of a file. Some resource methods (such as `revisions.update`) require a `revisionId`.
 * Use the `revisions.list` method to retrieve the ID for a revision.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Revision extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Short term download URL for the file. This will only be populated on files with
   * content stored in Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String downloadUrl;

  /**
   * Output only. The ETag of the revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. Links for exporting Docs Editors files to specific formats.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> exportLinks;

  /**
   * Output only. The size of the revision in bytes. This will only be populated on files with
   * content stored in Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long fileSize;

  /**
   * Output only. The ID of the revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Output only. This is always `drive#revision`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Output only. The last user to modify this revision. This field is only populated when the last
   * modification was performed by a signed-in user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User lastModifyingUser;

  /**
   * Output only. Name of the last user to modify this revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastModifyingUserName;

  /**
   * Output only. An MD5 checksum for the content of this revision. This will only be populated on
   * files with content stored in Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String md5Checksum;

  /**
   * Output only. The MIME type of the revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Last time this revision was modified (formatted RFC 3339 timestamp).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime modifiedDate;

  /**
   * Output only. The original filename when this revision was created. This will only be populated
   * on files with content stored in Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalFilename;

  /**
   * Whether this revision is pinned to prevent automatic purging. If not set, the revision is
   * automatically purged 30 days after newer content is uploaded. This field can only be modified
   * on files with content stored in Drive, excluding Docs Editors files. Revisions can also be
   * pinned when they are created through the drive.files.insert/update/copy by using the pinned
   * query parameter. Pinned revisions are stored indefinitely using additional storage quota, up to
   * a maximum of 200 revisions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean pinned;

  /**
   * Whether subsequent revisions will be automatically republished. This is only populated and can
   * only be modified for Docs Editors files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean publishAuto;

  /**
   * Whether this revision is published. This is only populated and can only be modified for Docs
   * Editors files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean published;

  /**
   * Output only. A link to the published revision. This is only populated for Docs Editors files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publishedLink;

  /**
   * Whether this revision is published outside the domain. This is only populated and can only be
   * modified for Docs Editors files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean publishedOutsideDomain;

  /**
   * Output only. A link back to this revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Output only. Short term download URL for the file. This will only be populated on files with
   * content stored in Drive.
   * @return value or {@code null} for none
   */
  public java.lang.String getDownloadUrl() {
    return downloadUrl;
  }

  /**
   * Output only. Short term download URL for the file. This will only be populated on files with
   * content stored in Drive.
   * @param downloadUrl downloadUrl or {@code null} for none
   */
  public Revision setDownloadUrl(java.lang.String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * Output only. The ETag of the revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. The ETag of the revision.
   * @param etag etag or {@code null} for none
   */
  public Revision setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. Links for exporting Docs Editors files to specific formats.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getExportLinks() {
    return exportLinks;
  }

  /**
   * Output only. Links for exporting Docs Editors files to specific formats.
   * @param exportLinks exportLinks or {@code null} for none
   */
  public Revision setExportLinks(java.util.Map<String, java.lang.String> exportLinks) {
    this.exportLinks = exportLinks;
    return this;
  }

  /**
   * Output only. The size of the revision in bytes. This will only be populated on files with
   * content stored in Drive.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFileSize() {
    return fileSize;
  }

  /**
   * Output only. The size of the revision in bytes. This will only be populated on files with
   * content stored in Drive.
   * @param fileSize fileSize or {@code null} for none
   */
  public Revision setFileSize(java.lang.Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * Output only. The ID of the revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Output only. The ID of the revision.
   * @param id id or {@code null} for none
   */
  public Revision setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. This is always `drive#revision`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Output only. This is always `drive#revision`.
   * @param kind kind or {@code null} for none
   */
  public Revision setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Output only. The last user to modify this revision. This field is only populated when the last
   * modification was performed by a signed-in user.
   * @return value or {@code null} for none
   */
  public User getLastModifyingUser() {
    return lastModifyingUser;
  }

  /**
   * Output only. The last user to modify this revision. This field is only populated when the last
   * modification was performed by a signed-in user.
   * @param lastModifyingUser lastModifyingUser or {@code null} for none
   */
  public Revision setLastModifyingUser(User lastModifyingUser) {
    this.lastModifyingUser = lastModifyingUser;
    return this;
  }

  /**
   * Output only. Name of the last user to modify this revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastModifyingUserName() {
    return lastModifyingUserName;
  }

  /**
   * Output only. Name of the last user to modify this revision.
   * @param lastModifyingUserName lastModifyingUserName or {@code null} for none
   */
  public Revision setLastModifyingUserName(java.lang.String lastModifyingUserName) {
    this.lastModifyingUserName = lastModifyingUserName;
    return this;
  }

  /**
   * Output only. An MD5 checksum for the content of this revision. This will only be populated on
   * files with content stored in Drive.
   * @return value or {@code null} for none
   */
  public java.lang.String getMd5Checksum() {
    return md5Checksum;
  }

  /**
   * Output only. An MD5 checksum for the content of this revision. This will only be populated on
   * files with content stored in Drive.
   * @param md5Checksum md5Checksum or {@code null} for none
   */
  public Revision setMd5Checksum(java.lang.String md5Checksum) {
    this.md5Checksum = md5Checksum;
    return this;
  }

  /**
   * Output only. The MIME type of the revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Output only. The MIME type of the revision.
   * @param mimeType mimeType or {@code null} for none
   */
  public Revision setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Last time this revision was modified (formatted RFC 3339 timestamp).
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getModifiedDate() {
    return modifiedDate;
  }

  /**
   * Last time this revision was modified (formatted RFC 3339 timestamp).
   * @param modifiedDate modifiedDate or {@code null} for none
   */
  public Revision setModifiedDate(com.google.api.client.util.DateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Output only. The original filename when this revision was created. This will only be populated
   * on files with content stored in Drive.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalFilename() {
    return originalFilename;
  }

  /**
   * Output only. The original filename when this revision was created. This will only be populated
   * on files with content stored in Drive.
   * @param originalFilename originalFilename or {@code null} for none
   */
  public Revision setOriginalFilename(java.lang.String originalFilename) {
    this.originalFilename = originalFilename;
    return this;
  }

  /**
   * Whether this revision is pinned to prevent automatic purging. If not set, the revision is
   * automatically purged 30 days after newer content is uploaded. This field can only be modified
   * on files with content stored in Drive, excluding Docs Editors files. Revisions can also be
   * pinned when they are created through the drive.files.insert/update/copy by using the pinned
   * query parameter. Pinned revisions are stored indefinitely using additional storage quota, up to
   * a maximum of 200 revisions.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPinned() {
    return pinned;
  }

  /**
   * Whether this revision is pinned to prevent automatic purging. If not set, the revision is
   * automatically purged 30 days after newer content is uploaded. This field can only be modified
   * on files with content stored in Drive, excluding Docs Editors files. Revisions can also be
   * pinned when they are created through the drive.files.insert/update/copy by using the pinned
   * query parameter. Pinned revisions are stored indefinitely using additional storage quota, up to
   * a maximum of 200 revisions.
   * @param pinned pinned or {@code null} for none
   */
  public Revision setPinned(java.lang.Boolean pinned) {
    this.pinned = pinned;
    return this;
  }

  /**
   * Whether subsequent revisions will be automatically republished. This is only populated and can
   * only be modified for Docs Editors files.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPublishAuto() {
    return publishAuto;
  }

  /**
   * Whether subsequent revisions will be automatically republished. This is only populated and can
   * only be modified for Docs Editors files.
   * @param publishAuto publishAuto or {@code null} for none
   */
  public Revision setPublishAuto(java.lang.Boolean publishAuto) {
    this.publishAuto = publishAuto;
    return this;
  }

  /**
   * Whether this revision is published. This is only populated and can only be modified for Docs
   * Editors files.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPublished() {
    return published;
  }

  /**
   * Whether this revision is published. This is only populated and can only be modified for Docs
   * Editors files.
   * @param published published or {@code null} for none
   */
  public Revision setPublished(java.lang.Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * Output only. A link to the published revision. This is only populated for Docs Editors files.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublishedLink() {
    return publishedLink;
  }

  /**
   * Output only. A link to the published revision. This is only populated for Docs Editors files.
   * @param publishedLink publishedLink or {@code null} for none
   */
  public Revision setPublishedLink(java.lang.String publishedLink) {
    this.publishedLink = publishedLink;
    return this;
  }

  /**
   * Whether this revision is published outside the domain. This is only populated and can only be
   * modified for Docs Editors files.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPublishedOutsideDomain() {
    return publishedOutsideDomain;
  }

  /**
   * Whether this revision is published outside the domain. This is only populated and can only be
   * modified for Docs Editors files.
   * @param publishedOutsideDomain publishedOutsideDomain or {@code null} for none
   */
  public Revision setPublishedOutsideDomain(java.lang.Boolean publishedOutsideDomain) {
    this.publishedOutsideDomain = publishedOutsideDomain;
    return this;
  }

  /**
   * Output only. A link back to this revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Output only. A link back to this revision.
   * @param selfLink selfLink or {@code null} for none
   */
  public Revision setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public Revision set(String fieldName, Object value) {
    return (Revision) super.set(fieldName, value);
  }

  @Override
  public Revision clone() {
    return (Revision) super.clone();
  }

}
