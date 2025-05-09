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

package com.google.api.services.pubsub.model;

/**
 * A subscription resource. If none of `push_config`, `bigquery_config`, or `cloud_storage_config`
 * is set, then the subscriber will pull and ack messages using API methods. At most one of these
 * fields may be set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Subscription extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The approximate amount of time (on a best-effort basis) Pub/Sub waits for the
   * subscriber to acknowledge receipt before resending the message. In the interval after the
   * message is delivered and before it is acknowledged, it is considered to be _outstanding_.
   * During that time period, the message will not be redelivered (on a best-effort basis). For pull
   * subscriptions, this value is used as the initial value for the ack deadline. To override this
   * value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using
   * non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using
   * streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom
   * deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value
   * of 10 seconds is used. For push delivery, this value is also used to set the request timeout
   * for the call to the push endpoint. If the subscriber never acknowledges the message, the
   * Pub/Sub system will eventually redeliver the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ackDeadlineSeconds;

  /**
   * Output only. Information about the associated Analytics Hub subscription. Only set if the
   * subscritpion is created by Analytics Hub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AnalyticsHubSubscriptionInfo analyticsHubSubscriptionInfo;

  /**
   * Optional. If delivery to BigQuery is used with this subscription, this field is used to
   * configure it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BigQueryConfig bigqueryConfig;

  /**
   * Optional. If delivery to Google Cloud Storage is used with this subscription, this field is
   * used to configure it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudStorageConfig cloudStorageConfig;

  /**
   * Optional. A policy that specifies the conditions for dead lettering messages in this
   * subscription. If dead_letter_policy is not set, dead lettering is disabled. The Pub/Sub service
   * account associated with this subscriptions's parent project (i.e.,
   * service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to
   * Acknowledge() messages on this subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeadLetterPolicy deadLetterPolicy;

  /**
   * Optional. Indicates whether the subscription is detached from its topic. Detached subscriptions
   * don't receive messages from their topic and don't retain any backlog. `Pull` and
   * `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push
   * subscription, pushes to the endpoint will not be made.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean detached;

  /**
   * Optional. If true, Pub/Sub provides the following guarantees for the delivery of a message with
   * a given value of `message_id` on this subscription: * The message sent to a subscriber is
   * guaranteed not to be resent before the message's acknowledgment deadline expires. * An
   * acknowledged message will not be resent to a subscriber. Note that subscribers may still
   * receive multiple copies of a message when `enable_exactly_once_delivery` is true if the message
   * was published multiple times by a publisher client. These copies are considered distinct by
   * Pub/Sub and have distinct `message_id` values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableExactlyOnceDelivery;

  /**
   * Optional. If true, messages published with the same `ordering_key` in `PubsubMessage` will be
   * delivered to the subscribers in the order in which they are received by the Pub/Sub system.
   * Otherwise, they may be delivered in any order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableMessageOrdering;

  /**
   * Optional. A policy that specifies the conditions for this subscription's expiration. A
   * subscription is considered active as long as any connected subscriber is successfully consuming
   * messages from the subscription or is issuing operations on the subscription. If
   * `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The
   * minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but
   * `expiration_policy.ttl` is not set, the subscription never expires.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExpirationPolicy expirationPolicy;

  /**
   * Optional. An expression written in the Pub/Sub [filter
   * language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only
   * `PubsubMessage`s whose `attributes` field matches the filter are delivered on this
   * subscription. If empty, then no messages are filtered out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Optional. See [Creating and managing labels](https://cloud.google.com/pubsub/docs/labels).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. How long to retain unacknowledged messages in the subscription's backlog, from the
   * moment a message is published. If `retain_acked_messages` is true, then this also configures
   * the retention of acknowledged messages, and thus configures how far back in time a `Seek` can
   * be done. Defaults to 7 days. Cannot be more than 31 days or less than 10 minutes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String messageRetentionDuration;

  /**
   * Optional. Transforms to be applied to messages before they are delivered to subscribers.
   * Transforms are applied in the order specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MessageTransform> messageTransforms;

  static {
    // hack to force ProGuard to consider MessageTransform used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MessageTransform.class);
  }

  /**
   * Required. The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`),
   * periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255
   * characters in length, and it must not start with `"goog"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. If push delivery is used with this subscription, this field is used to configure it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PushConfig pushConfig;

  /**
   * Optional. Indicates whether to retain acknowledged messages. If true, then messages are not
   * expunged from the subscription's backlog, even if they are acknowledged, until they fall out of
   * the `message_retention_duration` window. This must be true if you would like to [`Seek` to a
   * timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to
   * replay previously-acknowledged messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean retainAckedMessages;

  /**
   * Optional. A policy that specifies how Pub/Sub retries message delivery for this subscription.
   * If not set, the default retry policy is applied. This generally implies that messages will be
   * retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or
   * acknowledgment deadline exceeded events for a given message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RetryPolicy retryPolicy;

  /**
   * Output only. An output-only field indicating whether or not the subscription can receive
   * messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. The name of the topic from which this subscription is receiving messages. Format is
   * `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the
   * topic has been deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topic;

  /**
   * Output only. Indicates the minimum duration for which a message is retained after it is
   * published to the subscription's topic. If this field is set, messages published to the
   * subscription's topic in the last `topic_message_retention_duration` are always available to
   * subscribers. See the `message_retention_duration` field in `Topic`. This field is set only in
   * responses from the server; it is ignored if it is set in any requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String topicMessageRetentionDuration;

  /**
   * Optional. The approximate amount of time (on a best-effort basis) Pub/Sub waits for the
   * subscriber to acknowledge receipt before resending the message. In the interval after the
   * message is delivered and before it is acknowledged, it is considered to be _outstanding_.
   * During that time period, the message will not be redelivered (on a best-effort basis). For pull
   * subscriptions, this value is used as the initial value for the ack deadline. To override this
   * value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using
   * non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using
   * streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom
   * deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value
   * of 10 seconds is used. For push delivery, this value is also used to set the request timeout
   * for the call to the push endpoint. If the subscriber never acknowledges the message, the
   * Pub/Sub system will eventually redeliver the message.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAckDeadlineSeconds() {
    return ackDeadlineSeconds;
  }

  /**
   * Optional. The approximate amount of time (on a best-effort basis) Pub/Sub waits for the
   * subscriber to acknowledge receipt before resending the message. In the interval after the
   * message is delivered and before it is acknowledged, it is considered to be _outstanding_.
   * During that time period, the message will not be redelivered (on a best-effort basis). For pull
   * subscriptions, this value is used as the initial value for the ack deadline. To override this
   * value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using
   * non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using
   * streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom
   * deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value
   * of 10 seconds is used. For push delivery, this value is also used to set the request timeout
   * for the call to the push endpoint. If the subscriber never acknowledges the message, the
   * Pub/Sub system will eventually redeliver the message.
   * @param ackDeadlineSeconds ackDeadlineSeconds or {@code null} for none
   */
  public Subscription setAckDeadlineSeconds(java.lang.Integer ackDeadlineSeconds) {
    this.ackDeadlineSeconds = ackDeadlineSeconds;
    return this;
  }

  /**
   * Output only. Information about the associated Analytics Hub subscription. Only set if the
   * subscritpion is created by Analytics Hub.
   * @return value or {@code null} for none
   */
  public AnalyticsHubSubscriptionInfo getAnalyticsHubSubscriptionInfo() {
    return analyticsHubSubscriptionInfo;
  }

  /**
   * Output only. Information about the associated Analytics Hub subscription. Only set if the
   * subscritpion is created by Analytics Hub.
   * @param analyticsHubSubscriptionInfo analyticsHubSubscriptionInfo or {@code null} for none
   */
  public Subscription setAnalyticsHubSubscriptionInfo(AnalyticsHubSubscriptionInfo analyticsHubSubscriptionInfo) {
    this.analyticsHubSubscriptionInfo = analyticsHubSubscriptionInfo;
    return this;
  }

  /**
   * Optional. If delivery to BigQuery is used with this subscription, this field is used to
   * configure it.
   * @return value or {@code null} for none
   */
  public BigQueryConfig getBigqueryConfig() {
    return bigqueryConfig;
  }

  /**
   * Optional. If delivery to BigQuery is used with this subscription, this field is used to
   * configure it.
   * @param bigqueryConfig bigqueryConfig or {@code null} for none
   */
  public Subscription setBigqueryConfig(BigQueryConfig bigqueryConfig) {
    this.bigqueryConfig = bigqueryConfig;
    return this;
  }

  /**
   * Optional. If delivery to Google Cloud Storage is used with this subscription, this field is
   * used to configure it.
   * @return value or {@code null} for none
   */
  public CloudStorageConfig getCloudStorageConfig() {
    return cloudStorageConfig;
  }

  /**
   * Optional. If delivery to Google Cloud Storage is used with this subscription, this field is
   * used to configure it.
   * @param cloudStorageConfig cloudStorageConfig or {@code null} for none
   */
  public Subscription setCloudStorageConfig(CloudStorageConfig cloudStorageConfig) {
    this.cloudStorageConfig = cloudStorageConfig;
    return this;
  }

  /**
   * Optional. A policy that specifies the conditions for dead lettering messages in this
   * subscription. If dead_letter_policy is not set, dead lettering is disabled. The Pub/Sub service
   * account associated with this subscriptions's parent project (i.e.,
   * service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to
   * Acknowledge() messages on this subscription.
   * @return value or {@code null} for none
   */
  public DeadLetterPolicy getDeadLetterPolicy() {
    return deadLetterPolicy;
  }

  /**
   * Optional. A policy that specifies the conditions for dead lettering messages in this
   * subscription. If dead_letter_policy is not set, dead lettering is disabled. The Pub/Sub service
   * account associated with this subscriptions's parent project (i.e.,
   * service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to
   * Acknowledge() messages on this subscription.
   * @param deadLetterPolicy deadLetterPolicy or {@code null} for none
   */
  public Subscription setDeadLetterPolicy(DeadLetterPolicy deadLetterPolicy) {
    this.deadLetterPolicy = deadLetterPolicy;
    return this;
  }

  /**
   * Optional. Indicates whether the subscription is detached from its topic. Detached subscriptions
   * don't receive messages from their topic and don't retain any backlog. `Pull` and
   * `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push
   * subscription, pushes to the endpoint will not be made.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDetached() {
    return detached;
  }

  /**
   * Optional. Indicates whether the subscription is detached from its topic. Detached subscriptions
   * don't receive messages from their topic and don't retain any backlog. `Pull` and
   * `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push
   * subscription, pushes to the endpoint will not be made.
   * @param detached detached or {@code null} for none
   */
  public Subscription setDetached(java.lang.Boolean detached) {
    this.detached = detached;
    return this;
  }

  /**
   * Optional. If true, Pub/Sub provides the following guarantees for the delivery of a message with
   * a given value of `message_id` on this subscription: * The message sent to a subscriber is
   * guaranteed not to be resent before the message's acknowledgment deadline expires. * An
   * acknowledged message will not be resent to a subscriber. Note that subscribers may still
   * receive multiple copies of a message when `enable_exactly_once_delivery` is true if the message
   * was published multiple times by a publisher client. These copies are considered distinct by
   * Pub/Sub and have distinct `message_id` values.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableExactlyOnceDelivery() {
    return enableExactlyOnceDelivery;
  }

  /**
   * Optional. If true, Pub/Sub provides the following guarantees for the delivery of a message with
   * a given value of `message_id` on this subscription: * The message sent to a subscriber is
   * guaranteed not to be resent before the message's acknowledgment deadline expires. * An
   * acknowledged message will not be resent to a subscriber. Note that subscribers may still
   * receive multiple copies of a message when `enable_exactly_once_delivery` is true if the message
   * was published multiple times by a publisher client. These copies are considered distinct by
   * Pub/Sub and have distinct `message_id` values.
   * @param enableExactlyOnceDelivery enableExactlyOnceDelivery or {@code null} for none
   */
  public Subscription setEnableExactlyOnceDelivery(java.lang.Boolean enableExactlyOnceDelivery) {
    this.enableExactlyOnceDelivery = enableExactlyOnceDelivery;
    return this;
  }

  /**
   * Optional. If true, messages published with the same `ordering_key` in `PubsubMessage` will be
   * delivered to the subscribers in the order in which they are received by the Pub/Sub system.
   * Otherwise, they may be delivered in any order.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableMessageOrdering() {
    return enableMessageOrdering;
  }

  /**
   * Optional. If true, messages published with the same `ordering_key` in `PubsubMessage` will be
   * delivered to the subscribers in the order in which they are received by the Pub/Sub system.
   * Otherwise, they may be delivered in any order.
   * @param enableMessageOrdering enableMessageOrdering or {@code null} for none
   */
  public Subscription setEnableMessageOrdering(java.lang.Boolean enableMessageOrdering) {
    this.enableMessageOrdering = enableMessageOrdering;
    return this;
  }

  /**
   * Optional. A policy that specifies the conditions for this subscription's expiration. A
   * subscription is considered active as long as any connected subscriber is successfully consuming
   * messages from the subscription or is issuing operations on the subscription. If
   * `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The
   * minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but
   * `expiration_policy.ttl` is not set, the subscription never expires.
   * @return value or {@code null} for none
   */
  public ExpirationPolicy getExpirationPolicy() {
    return expirationPolicy;
  }

  /**
   * Optional. A policy that specifies the conditions for this subscription's expiration. A
   * subscription is considered active as long as any connected subscriber is successfully consuming
   * messages from the subscription or is issuing operations on the subscription. If
   * `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The
   * minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but
   * `expiration_policy.ttl` is not set, the subscription never expires.
   * @param expirationPolicy expirationPolicy or {@code null} for none
   */
  public Subscription setExpirationPolicy(ExpirationPolicy expirationPolicy) {
    this.expirationPolicy = expirationPolicy;
    return this;
  }

  /**
   * Optional. An expression written in the Pub/Sub [filter
   * language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only
   * `PubsubMessage`s whose `attributes` field matches the filter are delivered on this
   * subscription. If empty, then no messages are filtered out.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Optional. An expression written in the Pub/Sub [filter
   * language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only
   * `PubsubMessage`s whose `attributes` field matches the filter are delivered on this
   * subscription. If empty, then no messages are filtered out.
   * @param filter filter or {@code null} for none
   */
  public Subscription setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Optional. See [Creating and managing labels](https://cloud.google.com/pubsub/docs/labels).
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. See [Creating and managing labels](https://cloud.google.com/pubsub/docs/labels).
   * @param labels labels or {@code null} for none
   */
  public Subscription setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. How long to retain unacknowledged messages in the subscription's backlog, from the
   * moment a message is published. If `retain_acked_messages` is true, then this also configures
   * the retention of acknowledged messages, and thus configures how far back in time a `Seek` can
   * be done. Defaults to 7 days. Cannot be more than 31 days or less than 10 minutes.
   * @return value or {@code null} for none
   */
  public String getMessageRetentionDuration() {
    return messageRetentionDuration;
  }

  /**
   * Optional. How long to retain unacknowledged messages in the subscription's backlog, from the
   * moment a message is published. If `retain_acked_messages` is true, then this also configures
   * the retention of acknowledged messages, and thus configures how far back in time a `Seek` can
   * be done. Defaults to 7 days. Cannot be more than 31 days or less than 10 minutes.
   * @param messageRetentionDuration messageRetentionDuration or {@code null} for none
   */
  public Subscription setMessageRetentionDuration(String messageRetentionDuration) {
    this.messageRetentionDuration = messageRetentionDuration;
    return this;
  }

  /**
   * Optional. Transforms to be applied to messages before they are delivered to subscribers.
   * Transforms are applied in the order specified.
   * @return value or {@code null} for none
   */
  public java.util.List<MessageTransform> getMessageTransforms() {
    return messageTransforms;
  }

  /**
   * Optional. Transforms to be applied to messages before they are delivered to subscribers.
   * Transforms are applied in the order specified.
   * @param messageTransforms messageTransforms or {@code null} for none
   */
  public Subscription setMessageTransforms(java.util.List<MessageTransform> messageTransforms) {
    this.messageTransforms = messageTransforms;
    return this;
  }

  /**
   * Required. The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`),
   * periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255
   * characters in length, and it must not start with `"goog"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name of the subscription. It must have the format
   * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`),
   * periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255
   * characters in length, and it must not start with `"goog"`.
   * @param name name or {@code null} for none
   */
  public Subscription setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. If push delivery is used with this subscription, this field is used to configure it.
   * @return value or {@code null} for none
   */
  public PushConfig getPushConfig() {
    return pushConfig;
  }

  /**
   * Optional. If push delivery is used with this subscription, this field is used to configure it.
   * @param pushConfig pushConfig or {@code null} for none
   */
  public Subscription setPushConfig(PushConfig pushConfig) {
    this.pushConfig = pushConfig;
    return this;
  }

  /**
   * Optional. Indicates whether to retain acknowledged messages. If true, then messages are not
   * expunged from the subscription's backlog, even if they are acknowledged, until they fall out of
   * the `message_retention_duration` window. This must be true if you would like to [`Seek` to a
   * timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to
   * replay previously-acknowledged messages.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRetainAckedMessages() {
    return retainAckedMessages;
  }

  /**
   * Optional. Indicates whether to retain acknowledged messages. If true, then messages are not
   * expunged from the subscription's backlog, even if they are acknowledged, until they fall out of
   * the `message_retention_duration` window. This must be true if you would like to [`Seek` to a
   * timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to
   * replay previously-acknowledged messages.
   * @param retainAckedMessages retainAckedMessages or {@code null} for none
   */
  public Subscription setRetainAckedMessages(java.lang.Boolean retainAckedMessages) {
    this.retainAckedMessages = retainAckedMessages;
    return this;
  }

  /**
   * Optional. A policy that specifies how Pub/Sub retries message delivery for this subscription.
   * If not set, the default retry policy is applied. This generally implies that messages will be
   * retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or
   * acknowledgment deadline exceeded events for a given message.
   * @return value or {@code null} for none
   */
  public RetryPolicy getRetryPolicy() {
    return retryPolicy;
  }

  /**
   * Optional. A policy that specifies how Pub/Sub retries message delivery for this subscription.
   * If not set, the default retry policy is applied. This generally implies that messages will be
   * retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or
   * acknowledgment deadline exceeded events for a given message.
   * @param retryPolicy retryPolicy or {@code null} for none
   */
  public Subscription setRetryPolicy(RetryPolicy retryPolicy) {
    this.retryPolicy = retryPolicy;
    return this;
  }

  /**
   * Output only. An output-only field indicating whether or not the subscription can receive
   * messages.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. An output-only field indicating whether or not the subscription can receive
   * messages.
   * @param state state or {@code null} for none
   */
  public Subscription setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Required. The name of the topic from which this subscription is receiving messages. Format is
   * `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the
   * topic has been deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopic() {
    return topic;
  }

  /**
   * Required. The name of the topic from which this subscription is receiving messages. Format is
   * `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the
   * topic has been deleted.
   * @param topic topic or {@code null} for none
   */
  public Subscription setTopic(java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Output only. Indicates the minimum duration for which a message is retained after it is
   * published to the subscription's topic. If this field is set, messages published to the
   * subscription's topic in the last `topic_message_retention_duration` are always available to
   * subscribers. See the `message_retention_duration` field in `Topic`. This field is set only in
   * responses from the server; it is ignored if it is set in any requests.
   * @return value or {@code null} for none
   */
  public String getTopicMessageRetentionDuration() {
    return topicMessageRetentionDuration;
  }

  /**
   * Output only. Indicates the minimum duration for which a message is retained after it is
   * published to the subscription's topic. If this field is set, messages published to the
   * subscription's topic in the last `topic_message_retention_duration` are always available to
   * subscribers. See the `message_retention_duration` field in `Topic`. This field is set only in
   * responses from the server; it is ignored if it is set in any requests.
   * @param topicMessageRetentionDuration topicMessageRetentionDuration or {@code null} for none
   */
  public Subscription setTopicMessageRetentionDuration(String topicMessageRetentionDuration) {
    this.topicMessageRetentionDuration = topicMessageRetentionDuration;
    return this;
  }

  @Override
  public Subscription set(String fieldName, Object value) {
    return (Subscription) super.set(fieldName, value);
  }

  @Override
  public Subscription clone() {
    return (Subscription) super.clone();
  }

}
