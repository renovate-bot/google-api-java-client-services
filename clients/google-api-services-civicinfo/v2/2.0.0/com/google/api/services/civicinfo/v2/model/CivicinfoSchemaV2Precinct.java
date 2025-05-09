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

package com.google.api.services.civicinfo.v2.model;

/**
 * Model definition for CivicinfoSchemaV2Precinct.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CivicinfoSchemaV2Precinct extends com.google.api.client.json.GenericJson {

  /**
   * ID of the AdministrationRegion message for this precinct. Corresponds to LocalityId xml tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String administrationRegionId;

  /**
   * ID(s) of the Contest message(s) for this precinct.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> contestId;

  /**
   * Required. Dataset ID. What datasets our Precincts come from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long datasetId;

  /**
   * ID(s) of the PollingLocation message(s) for this precinct.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> earlyVoteSiteId;

  /**
   * ID(s) of the ElectoralDistrict message(s) for this precinct.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> electoralDistrictId;

  /**
   * Required. A unique identifier for this precinct.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Specifies if the precinct runs mail-only elections.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mailOnly;

  /**
   * Required. The name of the precinct.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The number of the precinct.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String number;

  /**
   * Encouraged. The OCD ID of the precinct
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ocdId;

  /**
   * ID(s) of the PollingLocation message(s) for this precinct.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> pollingLocationId;

  /**
   * ID(s) of the SpatialBoundary message(s) for this precinct. Used to specify a geometrical
   * boundary of the precinct.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> spatialBoundaryId;

  /**
   * If present, this proto corresponds to one portion of split precinct. Other portions of this
   * precinct are guaranteed to have the same `name`. If not present, this proto represents a full
   * precicnt.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String splitName;

  /**
   * Specifies the ward the precinct is contained within.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ward;

  /**
   * ID of the AdministrationRegion message for this precinct. Corresponds to LocalityId xml tag.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdministrationRegionId() {
    return administrationRegionId;
  }

  /**
   * ID of the AdministrationRegion message for this precinct. Corresponds to LocalityId xml tag.
   * @param administrationRegionId administrationRegionId or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setAdministrationRegionId(java.lang.String administrationRegionId) {
    this.administrationRegionId = administrationRegionId;
    return this;
  }

  /**
   * ID(s) of the Contest message(s) for this precinct.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getContestId() {
    return contestId;
  }

  /**
   * ID(s) of the Contest message(s) for this precinct.
   * @param contestId contestId or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setContestId(java.util.List<java.lang.String> contestId) {
    this.contestId = contestId;
    return this;
  }

  /**
   * Required. Dataset ID. What datasets our Precincts come from.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDatasetId() {
    return datasetId;
  }

  /**
   * Required. Dataset ID. What datasets our Precincts come from.
   * @param datasetId datasetId or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setDatasetId(java.lang.Long datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * ID(s) of the PollingLocation message(s) for this precinct.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEarlyVoteSiteId() {
    return earlyVoteSiteId;
  }

  /**
   * ID(s) of the PollingLocation message(s) for this precinct.
   * @param earlyVoteSiteId earlyVoteSiteId or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setEarlyVoteSiteId(java.util.List<java.lang.String> earlyVoteSiteId) {
    this.earlyVoteSiteId = earlyVoteSiteId;
    return this;
  }

  /**
   * ID(s) of the ElectoralDistrict message(s) for this precinct.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getElectoralDistrictId() {
    return electoralDistrictId;
  }

  /**
   * ID(s) of the ElectoralDistrict message(s) for this precinct.
   * @param electoralDistrictId electoralDistrictId or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setElectoralDistrictId(java.util.List<java.lang.String> electoralDistrictId) {
    this.electoralDistrictId = electoralDistrictId;
    return this;
  }

  /**
   * Required. A unique identifier for this precinct.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. A unique identifier for this precinct.
   * @param id id or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Specifies if the precinct runs mail-only elections.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMailOnly() {
    return mailOnly;
  }

  /**
   * Specifies if the precinct runs mail-only elections.
   * @param mailOnly mailOnly or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setMailOnly(java.lang.Boolean mailOnly) {
    this.mailOnly = mailOnly;
    return this;
  }

  /**
   * Required. The name of the precinct.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name of the precinct.
   * @param name name or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The number of the precinct.
   * @return value or {@code null} for none
   */
  public java.lang.String getNumber() {
    return number;
  }

  /**
   * The number of the precinct.
   * @param number number or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setNumber(java.lang.String number) {
    this.number = number;
    return this;
  }

  /**
   * Encouraged. The OCD ID of the precinct
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOcdId() {
    return ocdId;
  }

  /**
   * Encouraged. The OCD ID of the precinct
   * @param ocdId ocdId or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setOcdId(java.util.List<java.lang.String> ocdId) {
    this.ocdId = ocdId;
    return this;
  }

  /**
   * ID(s) of the PollingLocation message(s) for this precinct.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPollingLocationId() {
    return pollingLocationId;
  }

  /**
   * ID(s) of the PollingLocation message(s) for this precinct.
   * @param pollingLocationId pollingLocationId or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setPollingLocationId(java.util.List<java.lang.String> pollingLocationId) {
    this.pollingLocationId = pollingLocationId;
    return this;
  }

  /**
   * ID(s) of the SpatialBoundary message(s) for this precinct. Used to specify a geometrical
   * boundary of the precinct.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSpatialBoundaryId() {
    return spatialBoundaryId;
  }

  /**
   * ID(s) of the SpatialBoundary message(s) for this precinct. Used to specify a geometrical
   * boundary of the precinct.
   * @param spatialBoundaryId spatialBoundaryId or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setSpatialBoundaryId(java.util.List<java.lang.String> spatialBoundaryId) {
    this.spatialBoundaryId = spatialBoundaryId;
    return this;
  }

  /**
   * If present, this proto corresponds to one portion of split precinct. Other portions of this
   * precinct are guaranteed to have the same `name`. If not present, this proto represents a full
   * precicnt.
   * @return value or {@code null} for none
   */
  public java.lang.String getSplitName() {
    return splitName;
  }

  /**
   * If present, this proto corresponds to one portion of split precinct. Other portions of this
   * precinct are guaranteed to have the same `name`. If not present, this proto represents a full
   * precicnt.
   * @param splitName splitName or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setSplitName(java.lang.String splitName) {
    this.splitName = splitName;
    return this;
  }

  /**
   * Specifies the ward the precinct is contained within.
   * @return value or {@code null} for none
   */
  public java.lang.String getWard() {
    return ward;
  }

  /**
   * Specifies the ward the precinct is contained within.
   * @param ward ward or {@code null} for none
   */
  public CivicinfoSchemaV2Precinct setWard(java.lang.String ward) {
    this.ward = ward;
    return this;
  }

  @Override
  public CivicinfoSchemaV2Precinct set(String fieldName, Object value) {
    return (CivicinfoSchemaV2Precinct) super.set(fieldName, value);
  }

  @Override
  public CivicinfoSchemaV2Precinct clone() {
    return (CivicinfoSchemaV2Precinct) super.clone();
  }

}
