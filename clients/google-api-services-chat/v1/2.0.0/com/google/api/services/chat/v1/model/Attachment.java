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
 * An attachment in Google Chat.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Attachment extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A reference to the attachment data. This field is used to create or update messages
   * with attachments, or with the media API to download the attachment data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AttachmentDataRef attachmentDataRef;

  /**
   * Output only. The original file name for the content, not the full path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentName;

  /**
   * Output only. The content type (MIME type) of the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentType;

  /**
   * Output only. The download URL which should be used to allow a human user to download the
   * attachment. Chat apps shouldn't use this URL to download attachment content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String downloadUri;

  /**
   * Output only. A reference to the Google Drive attachment. This field is used with the Google
   * Drive API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveDataRef driveDataRef;

  /**
   * Optional. Resource name of the attachment, in the form
   * `spaces/{space}/messages/{message}/attachments/{attachment}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The source of the attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * Output only. The thumbnail URL which should be used to preview the attachment to a human user.
   * Chat apps shouldn't use this URL to download attachment content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailUri;

  /**
   * Optional. A reference to the attachment data. This field is used to create or update messages
   * with attachments, or with the media API to download the attachment data.
   * @return value or {@code null} for none
   */
  public AttachmentDataRef getAttachmentDataRef() {
    return attachmentDataRef;
  }

  /**
   * Optional. A reference to the attachment data. This field is used to create or update messages
   * with attachments, or with the media API to download the attachment data.
   * @param attachmentDataRef attachmentDataRef or {@code null} for none
   */
  public Attachment setAttachmentDataRef(AttachmentDataRef attachmentDataRef) {
    this.attachmentDataRef = attachmentDataRef;
    return this;
  }

  /**
   * Output only. The original file name for the content, not the full path.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentName() {
    return contentName;
  }

  /**
   * Output only. The original file name for the content, not the full path.
   * @param contentName contentName or {@code null} for none
   */
  public Attachment setContentName(java.lang.String contentName) {
    this.contentName = contentName;
    return this;
  }

  /**
   * Output only. The content type (MIME type) of the file.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentType() {
    return contentType;
  }

  /**
   * Output only. The content type (MIME type) of the file.
   * @param contentType contentType or {@code null} for none
   */
  public Attachment setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Output only. The download URL which should be used to allow a human user to download the
   * attachment. Chat apps shouldn't use this URL to download attachment content.
   * @return value or {@code null} for none
   */
  public java.lang.String getDownloadUri() {
    return downloadUri;
  }

  /**
   * Output only. The download URL which should be used to allow a human user to download the
   * attachment. Chat apps shouldn't use this URL to download attachment content.
   * @param downloadUri downloadUri or {@code null} for none
   */
  public Attachment setDownloadUri(java.lang.String downloadUri) {
    this.downloadUri = downloadUri;
    return this;
  }

  /**
   * Output only. A reference to the Google Drive attachment. This field is used with the Google
   * Drive API.
   * @return value or {@code null} for none
   */
  public DriveDataRef getDriveDataRef() {
    return driveDataRef;
  }

  /**
   * Output only. A reference to the Google Drive attachment. This field is used with the Google
   * Drive API.
   * @param driveDataRef driveDataRef or {@code null} for none
   */
  public Attachment setDriveDataRef(DriveDataRef driveDataRef) {
    this.driveDataRef = driveDataRef;
    return this;
  }

  /**
   * Optional. Resource name of the attachment, in the form
   * `spaces/{space}/messages/{message}/attachments/{attachment}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. Resource name of the attachment, in the form
   * `spaces/{space}/messages/{message}/attachments/{attachment}`.
   * @param name name or {@code null} for none
   */
  public Attachment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The source of the attachment.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Output only. The source of the attachment.
   * @param source source or {@code null} for none
   */
  public Attachment setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * Output only. The thumbnail URL which should be used to preview the attachment to a human user.
   * Chat apps shouldn't use this URL to download attachment content.
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailUri() {
    return thumbnailUri;
  }

  /**
   * Output only. The thumbnail URL which should be used to preview the attachment to a human user.
   * Chat apps shouldn't use this URL to download attachment content.
   * @param thumbnailUri thumbnailUri or {@code null} for none
   */
  public Attachment setThumbnailUri(java.lang.String thumbnailUri) {
    this.thumbnailUri = thumbnailUri;
    return this;
  }

  @Override
  public Attachment set(String fieldName, Object value) {
    return (Attachment) super.set(fieldName, value);
  }

  @Override
  public Attachment clone() {
    return (Attachment) super.clone();
  }

}
