/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * The aws-ddbstream component is used for working with Amazon DynamoDB Streams.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class DdbStreamEndpoint {


    public static class DdbStreamCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        DdbStreamCommon(String path) {
            super("aws-ddbstream", path);
        }
        /**
         * To define a proxy host when instantiating the DDBStreams client. The
         * option is a java.lang.String type.
         */
        public T proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (T) this;
        }
        /**
         * To define a proxy port when instantiating the DDBStreams client. The
         * option is a java.lang.Integer type.
         */
        public T proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
        /**
         * The region in which DDBStreams client needs to work. The option is a
         * java.lang.String type.
         */
        public T region(String region) {
            this.properties.put("region", region);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Amazon AWS Access Key. The option is a java.lang.String type.
         */
        public T accessKey(String accessKey) {
            this.properties.put("accessKey", accessKey);
            return (T) this;
        }
        /**
         * Amazon AWS Secret Key. The option is a java.lang.String type.
         */
        public T secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (T) this;
        }
    }

    public static class DdbStreamConsumer
            extends
                DdbStreamCommon<DdbStreamConsumer>
            implements
                EndpointDefinition.Consumer {
        public DdbStreamConsumer(String path) {
            super(path);
        }
        /**
         * Name of the dynamodb table. The option is a java.lang.String type.
         */
        public DdbStreamConsumer tableName(String tableName) {
            this.properties.put("tableName", tableName);
            return (DdbStreamConsumer) this;
        }
        /**
         * Amazon DynamoDB client to use for all requests for this endpoint. The
         * option is a com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams
         * type.
         */
        public DdbStreamConsumer amazonDynamoDbStreamsClient(
                Object amazonDynamoDbStreamsClient) {
            this.properties.put("amazonDynamoDbStreamsClient", amazonDynamoDbStreamsClient);
            return (DdbStreamConsumer) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public DdbStreamConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (DdbStreamConsumer) this;
        }
        /**
         * Defines where in the DynaboDB stream to start getting records. Note
         * that using TRIM_HORIZON can cause a significant delay before the
         * stream has caught up to real-time. if {AT,AFTER}_SEQUENCE_NUMBER are
         * used, then a sequenceNumberProvider MUST be supplied. The option is a
         * com.amazonaws.services.dynamodbv2.model.ShardIteratorType type.
         */
        public DdbStreamConsumer iteratorType(ShardIteratorType iteratorType) {
            this.properties.put("iteratorType", iteratorType);
            return (DdbStreamConsumer) this;
        }
        /**
         * Maximum number of records that will be fetched in each poll. The
         * option is a int type.
         */
        public DdbStreamConsumer maxResultsPerRequest(int maxResultsPerRequest) {
            this.properties.put("maxResultsPerRequest", maxResultsPerRequest);
            return (DdbStreamConsumer) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        public DdbStreamConsumer sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (DdbStreamConsumer) this;
        }
        /**
         * Provider for the sequence number when using one of the two
         * ShardIteratorType.{AT,AFTER}_SEQUENCE_NUMBER iterator types. Can be a
         * registry reference or a literal sequence number. The option is a
         * org.apache.camel.component.aws.ddbstream.SequenceNumberProvider type.
         */
        public DdbStreamConsumer sequenceNumberProvider(
                Object sequenceNumberProvider) {
            this.properties.put("sequenceNumberProvider", sequenceNumberProvider);
            return (DdbStreamConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public DdbStreamConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (DdbStreamConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public DdbStreamConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (DdbStreamConsumer) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        public DdbStreamConsumer pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (DdbStreamConsumer) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a int type.
         */
        public DdbStreamConsumer backoffErrorThreshold(int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (DdbStreamConsumer) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a int type.
         */
        public DdbStreamConsumer backoffIdleThreshold(int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (DdbStreamConsumer) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a int type.
         */
        public DdbStreamConsumer backoffMultiplier(int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (DdbStreamConsumer) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public DdbStreamConsumer delay(long delay) {
            this.properties.put("delay", delay);
            return (DdbStreamConsumer) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a boolean type.
         */
        public DdbStreamConsumer greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (DdbStreamConsumer) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public DdbStreamConsumer initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (DdbStreamConsumer) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a org.apache.camel.LoggingLevel type.
         */
        public DdbStreamConsumer runLoggingLevel(LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (DdbStreamConsumer) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a java.util.concurrent.ScheduledExecutorService
         * type.
         */
        public DdbStreamConsumer scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (DdbStreamConsumer) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        public DdbStreamConsumer scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (DdbStreamConsumer) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public DdbStreamConsumer schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (DdbStreamConsumer) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a boolean
         * type.
         */
        public DdbStreamConsumer startScheduler(boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (DdbStreamConsumer) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * java.util.concurrent.TimeUnit type.
         */
        public DdbStreamConsumer timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (DdbStreamConsumer) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a boolean
         * type.
         */
        public DdbStreamConsumer useFixedDelay(boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (DdbStreamConsumer) this;
        }
    }

    public static enum ShardIteratorType {
        TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER;
    }
}