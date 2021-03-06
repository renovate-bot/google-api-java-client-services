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

package com.google.api.services.poly.v1.model;

/**
 * Hints for displaying the asset, based on information available when the asset was uploaded.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Poly API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PresentationParams extends com.google.api.client.json.GenericJson {

  /**
   * A background color which could be used for displaying the 3D asset in a 'thumbnail' or
   * 'palette' style view. Authors have the option to set this background color when publishing or
   * editing their asset. This is represented as a six-digit hexademical triplet specifying the RGB
   * components of the background color, e.g. #FF0000 for Red.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backgroundColor;

  /**
   * The materials' diffuse/albedo color. This does not apply to vertex colors or texture maps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String colorSpace;

  /**
   * A rotation that should be applied to the object root to make it upright. More precisely, this
   * quaternion transforms from "object space" (the space in which the object is defined) to
   * "presentation space", a coordinate system where +Y is up, +X is right, -Z is forward. For
   * example, if the object is the Eiffel Tower, in its local coordinate system the object might be
   * laid out such that the base of the tower is on the YZ plane and the tip of the tower is towards
   * positive X. In this case this quaternion would specify a rotation (of 90 degrees about the Z
   * axis) such that in the presentation space the base of the tower is aligned with the XZ plane,
   * and the tip of the tower lies towards +Y. This rotation is unrelated to the object's pose in
   * the web preview, which is just a camera position setting and is *not* reflected in this
   * rotation. Please note: this is applicable only to the gLTF.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quaternion orientingRotation;

  /**
   * A background color which could be used for displaying the 3D asset in a 'thumbnail' or
   * 'palette' style view. Authors have the option to set this background color when publishing or
   * editing their asset. This is represented as a six-digit hexademical triplet specifying the RGB
   * components of the background color, e.g. #FF0000 for Red.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackgroundColor() {
    return backgroundColor;
  }

  /**
   * A background color which could be used for displaying the 3D asset in a 'thumbnail' or
   * 'palette' style view. Authors have the option to set this background color when publishing or
   * editing their asset. This is represented as a six-digit hexademical triplet specifying the RGB
   * components of the background color, e.g. #FF0000 for Red.
   * @param backgroundColor backgroundColor or {@code null} for none
   */
  public PresentationParams setBackgroundColor(java.lang.String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * The materials' diffuse/albedo color. This does not apply to vertex colors or texture maps.
   * @return value or {@code null} for none
   */
  public java.lang.String getColorSpace() {
    return colorSpace;
  }

  /**
   * The materials' diffuse/albedo color. This does not apply to vertex colors or texture maps.
   * @param colorSpace colorSpace or {@code null} for none
   */
  public PresentationParams setColorSpace(java.lang.String colorSpace) {
    this.colorSpace = colorSpace;
    return this;
  }

  /**
   * A rotation that should be applied to the object root to make it upright. More precisely, this
   * quaternion transforms from "object space" (the space in which the object is defined) to
   * "presentation space", a coordinate system where +Y is up, +X is right, -Z is forward. For
   * example, if the object is the Eiffel Tower, in its local coordinate system the object might be
   * laid out such that the base of the tower is on the YZ plane and the tip of the tower is towards
   * positive X. In this case this quaternion would specify a rotation (of 90 degrees about the Z
   * axis) such that in the presentation space the base of the tower is aligned with the XZ plane,
   * and the tip of the tower lies towards +Y. This rotation is unrelated to the object's pose in
   * the web preview, which is just a camera position setting and is *not* reflected in this
   * rotation. Please note: this is applicable only to the gLTF.
   * @return value or {@code null} for none
   */
  public Quaternion getOrientingRotation() {
    return orientingRotation;
  }

  /**
   * A rotation that should be applied to the object root to make it upright. More precisely, this
   * quaternion transforms from "object space" (the space in which the object is defined) to
   * "presentation space", a coordinate system where +Y is up, +X is right, -Z is forward. For
   * example, if the object is the Eiffel Tower, in its local coordinate system the object might be
   * laid out such that the base of the tower is on the YZ plane and the tip of the tower is towards
   * positive X. In this case this quaternion would specify a rotation (of 90 degrees about the Z
   * axis) such that in the presentation space the base of the tower is aligned with the XZ plane,
   * and the tip of the tower lies towards +Y. This rotation is unrelated to the object's pose in
   * the web preview, which is just a camera position setting and is *not* reflected in this
   * rotation. Please note: this is applicable only to the gLTF.
   * @param orientingRotation orientingRotation or {@code null} for none
   */
  public PresentationParams setOrientingRotation(Quaternion orientingRotation) {
    this.orientingRotation = orientingRotation;
    return this;
  }

  @Override
  public PresentationParams set(String fieldName, Object value) {
    return (PresentationParams) super.set(fieldName, value);
  }

  @Override
  public PresentationParams clone() {
    return (PresentationParams) super.clone();
  }

}
