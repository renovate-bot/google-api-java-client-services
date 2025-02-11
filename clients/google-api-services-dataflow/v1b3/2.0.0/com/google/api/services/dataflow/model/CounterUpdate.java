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

package com.google.api.services.dataflow.model;

/**
 * An update to a Counter sent from a worker. Next ID: 17
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CounterUpdate extends com.google.api.client.json.GenericJson {

  /**
   * Boolean value for And, Or.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("boolean")
  private java.lang.Boolean boolean__;

  /**
   * Bounded trie data
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BoundedTrie boundedTrie;

  /**
   * True if this counter is reported as the total cumulative aggregate value accumulated since the
   * worker started working on this WorkItem. By default this is false, indicating that this counter
   * is reported as a delta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cumulative;

  /**
   * Distribution data
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DistributionUpdate distribution;

  /**
   * Floating point value for Sum, Max, Min.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double floatingPoint;

  /**
   * List of floating point numbers, for Set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FloatingPointList floatingPointList;

  /**
   * Floating point mean aggregation value for Mean.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FloatingPointMean floatingPointMean;

  /**
   * Integer value for Sum, Max, Min.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("integer")
  private SplitInt64 integer__;

  /**
   * Gauge data
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IntegerGauge integerGauge;

  /**
   * List of integers, for Set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IntegerList integerList;

  /**
   * Integer mean aggregation value for Mean.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IntegerMean integerMean;

  /**
   * Value for internally-defined counters used by the Dataflow service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object internal;

  /**
   * Counter name and aggregation type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NameAndKind nameAndKind;

  /**
   * The service-generated short identifier for this counter. The short_id -> (name, metadata)
   * mapping is constant for the lifetime of a job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long shortId;

  /**
   * List of strings, for Set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StringList stringList;

  /**
   * Counter structured name and metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CounterStructuredNameAndMetadata structuredNameAndMetadata;

  /**
   * Boolean value for And, Or.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoolean() {
    return boolean__;
  }

  /**
   * Boolean value for And, Or.
   * @param boolean__ boolean__ or {@code null} for none
   */
  public CounterUpdate setBoolean(java.lang.Boolean boolean__) {
    this.boolean__ = boolean__;
    return this;
  }

  /**
   * Bounded trie data
   * @return value or {@code null} for none
   */
  public BoundedTrie getBoundedTrie() {
    return boundedTrie;
  }

  /**
   * Bounded trie data
   * @param boundedTrie boundedTrie or {@code null} for none
   */
  public CounterUpdate setBoundedTrie(BoundedTrie boundedTrie) {
    this.boundedTrie = boundedTrie;
    return this;
  }

  /**
   * True if this counter is reported as the total cumulative aggregate value accumulated since the
   * worker started working on this WorkItem. By default this is false, indicating that this counter
   * is reported as a delta.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCumulative() {
    return cumulative;
  }

  /**
   * True if this counter is reported as the total cumulative aggregate value accumulated since the
   * worker started working on this WorkItem. By default this is false, indicating that this counter
   * is reported as a delta.
   * @param cumulative cumulative or {@code null} for none
   */
  public CounterUpdate setCumulative(java.lang.Boolean cumulative) {
    this.cumulative = cumulative;
    return this;
  }

  /**
   * Distribution data
   * @return value or {@code null} for none
   */
  public DistributionUpdate getDistribution() {
    return distribution;
  }

  /**
   * Distribution data
   * @param distribution distribution or {@code null} for none
   */
  public CounterUpdate setDistribution(DistributionUpdate distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * Floating point value for Sum, Max, Min.
   * @return value or {@code null} for none
   */
  public java.lang.Double getFloatingPoint() {
    return floatingPoint;
  }

  /**
   * Floating point value for Sum, Max, Min.
   * @param floatingPoint floatingPoint or {@code null} for none
   */
  public CounterUpdate setFloatingPoint(java.lang.Double floatingPoint) {
    this.floatingPoint = floatingPoint;
    return this;
  }

  /**
   * List of floating point numbers, for Set.
   * @return value or {@code null} for none
   */
  public FloatingPointList getFloatingPointList() {
    return floatingPointList;
  }

  /**
   * List of floating point numbers, for Set.
   * @param floatingPointList floatingPointList or {@code null} for none
   */
  public CounterUpdate setFloatingPointList(FloatingPointList floatingPointList) {
    this.floatingPointList = floatingPointList;
    return this;
  }

  /**
   * Floating point mean aggregation value for Mean.
   * @return value or {@code null} for none
   */
  public FloatingPointMean getFloatingPointMean() {
    return floatingPointMean;
  }

  /**
   * Floating point mean aggregation value for Mean.
   * @param floatingPointMean floatingPointMean or {@code null} for none
   */
  public CounterUpdate setFloatingPointMean(FloatingPointMean floatingPointMean) {
    this.floatingPointMean = floatingPointMean;
    return this;
  }

  /**
   * Integer value for Sum, Max, Min.
   * @return value or {@code null} for none
   */
  public SplitInt64 getInteger() {
    return integer__;
  }

  /**
   * Integer value for Sum, Max, Min.
   * @param integer__ integer__ or {@code null} for none
   */
  public CounterUpdate setInteger(SplitInt64 integer__) {
    this.integer__ = integer__;
    return this;
  }

  /**
   * Gauge data
   * @return value or {@code null} for none
   */
  public IntegerGauge getIntegerGauge() {
    return integerGauge;
  }

  /**
   * Gauge data
   * @param integerGauge integerGauge or {@code null} for none
   */
  public CounterUpdate setIntegerGauge(IntegerGauge integerGauge) {
    this.integerGauge = integerGauge;
    return this;
  }

  /**
   * List of integers, for Set.
   * @return value or {@code null} for none
   */
  public IntegerList getIntegerList() {
    return integerList;
  }

  /**
   * List of integers, for Set.
   * @param integerList integerList or {@code null} for none
   */
  public CounterUpdate setIntegerList(IntegerList integerList) {
    this.integerList = integerList;
    return this;
  }

  /**
   * Integer mean aggregation value for Mean.
   * @return value or {@code null} for none
   */
  public IntegerMean getIntegerMean() {
    return integerMean;
  }

  /**
   * Integer mean aggregation value for Mean.
   * @param integerMean integerMean or {@code null} for none
   */
  public CounterUpdate setIntegerMean(IntegerMean integerMean) {
    this.integerMean = integerMean;
    return this;
  }

  /**
   * Value for internally-defined counters used by the Dataflow service.
   * @return value or {@code null} for none
   */
  public java.lang.Object getInternal() {
    return internal;
  }

  /**
   * Value for internally-defined counters used by the Dataflow service.
   * @param internal internal or {@code null} for none
   */
  public CounterUpdate setInternal(java.lang.Object internal) {
    this.internal = internal;
    return this;
  }

  /**
   * Counter name and aggregation type.
   * @return value or {@code null} for none
   */
  public NameAndKind getNameAndKind() {
    return nameAndKind;
  }

  /**
   * Counter name and aggregation type.
   * @param nameAndKind nameAndKind or {@code null} for none
   */
  public CounterUpdate setNameAndKind(NameAndKind nameAndKind) {
    this.nameAndKind = nameAndKind;
    return this;
  }

  /**
   * The service-generated short identifier for this counter. The short_id -> (name, metadata)
   * mapping is constant for the lifetime of a job.
   * @return value or {@code null} for none
   */
  public java.lang.Long getShortId() {
    return shortId;
  }

  /**
   * The service-generated short identifier for this counter. The short_id -> (name, metadata)
   * mapping is constant for the lifetime of a job.
   * @param shortId shortId or {@code null} for none
   */
  public CounterUpdate setShortId(java.lang.Long shortId) {
    this.shortId = shortId;
    return this;
  }

  /**
   * List of strings, for Set.
   * @return value or {@code null} for none
   */
  public StringList getStringList() {
    return stringList;
  }

  /**
   * List of strings, for Set.
   * @param stringList stringList or {@code null} for none
   */
  public CounterUpdate setStringList(StringList stringList) {
    this.stringList = stringList;
    return this;
  }

  /**
   * Counter structured name and metadata.
   * @return value or {@code null} for none
   */
  public CounterStructuredNameAndMetadata getStructuredNameAndMetadata() {
    return structuredNameAndMetadata;
  }

  /**
   * Counter structured name and metadata.
   * @param structuredNameAndMetadata structuredNameAndMetadata or {@code null} for none
   */
  public CounterUpdate setStructuredNameAndMetadata(CounterStructuredNameAndMetadata structuredNameAndMetadata) {
    this.structuredNameAndMetadata = structuredNameAndMetadata;
    return this;
  }

  @Override
  public CounterUpdate set(String fieldName, Object value) {
    return (CounterUpdate) super.set(fieldName, value);
  }

  @Override
  public CounterUpdate clone() {
    return (CounterUpdate) super.clone();
  }

}
