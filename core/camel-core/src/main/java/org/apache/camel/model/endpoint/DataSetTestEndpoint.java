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

import javax.annotation.Generated;
import org.apache.camel.model.EndpointDefinition;

/**
 * The dataset-test component extends the mock component by on startup to pull
 * messages from another endpoint to set the expected message bodies.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class DataSetTestEndpoint {


    public static class DataSetTestCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        DataSetTestCommon(String path) {
            super("dataset-test", path);
        }
        /**
         * Name of endpoint to lookup in the registry to use for polling
         * messages used for testing. The option is a java.lang.String type.
         */
        public T name(String name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * Whether the expected messages should arrive in the same order or can
         * be in any order. The option is a boolean type.
         */
        public T anyOrder(boolean anyOrder) {
            this.properties.put("anyOrder", anyOrder);
            return (T) this;
        }
        /**
         * The split delimiter to use when split is enabled. By default the
         * delimiter is new line based. The delimiter can be a regular
         * expression. The option is a java.lang.String type.
         */
        public T delimiter(String delimiter) {
            this.properties.put("delimiter", delimiter);
            return (T) this;
        }
        /**
         * If enabled the messages loaded from the test endpoint will be split
         * using new line delimiters so each line is an expected message. For
         * example to use a file endpoint to load a file where each line is an
         * expected message. The option is a boolean type.
         */
        public T split(boolean split) {
            this.properties.put("split", split);
            return (T) this;
        }
        /**
         * The timeout to use when polling for message bodies from the URI. The
         * option is a long type.
         */
        public T timeout(long timeout) {
            this.properties.put("timeout", timeout);
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
    }

    public static class DataSetTestProducer
            extends
                DataSetTestCommon<DataSetTestProducer>
            implements
                EndpointDefinition.Producer {
        public DataSetTestProducer(String path) {
            super(path);
        }
        /**
         * Sets a grace period after which the mock endpoint will re-assert to
         * ensure the preliminary assertion is still valid. This is used for
         * example to assert that exactly a number of messages arrives. For
         * example if expectedMessageCount(int) was set to 5, then the assertion
         * is satisfied when 5 or more message arrives. To ensure that exactly 5
         * messages arrives, then you would need to wait a little period to
         * ensure no further message arrives. This is what you can use this
         * method for. By default this period is disabled. The option is a long
         * type.
         */
        public DataSetTestProducer assertPeriod(long assertPeriod) {
            this.properties.put("assertPeriod", assertPeriod);
            return (DataSetTestProducer) this;
        }
        /**
         * Specifies the expected number of message exchanges that should be
         * received by this endpoint. Beware: If you want to expect that 0
         * messages, then take extra care, as 0 matches when the tests starts,
         * so you need to set a assert period time to let the test run for a
         * while to make sure there are still no messages arrived; for that use
         * setAssertPeriod(long). An alternative is to use NotifyBuilder, and
         * use the notifier to know when Camel is done routing some messages,
         * before you call the assertIsSatisfied() method on the mocks. This
         * allows you to not use a fixed assert period, to speedup testing
         * times. If you want to assert that exactly n'th message arrives to
         * this mock endpoint, then see also the setAssertPeriod(long) method
         * for further details. The option is a int type.
         */
        public DataSetTestProducer expectedCount(int expectedCount) {
            this.properties.put("expectedCount", expectedCount);
            return (DataSetTestProducer) this;
        }
        /**
         * A number that is used to turn on throughput logging based on groups
         * of the size. The option is a int type.
         */
        public DataSetTestProducer reportGroup(int reportGroup) {
            this.properties.put("reportGroup", reportGroup);
            return (DataSetTestProducer) this;
        }
        /**
         * Sets the minimum expected amount of time (in millis) the
         * assertIsSatisfied() will wait on a latch until it is satisfied. The
         * option is a long type.
         */
        public DataSetTestProducer resultMinimumWaitTime(
                long resultMinimumWaitTime) {
            this.properties.put("resultMinimumWaitTime", resultMinimumWaitTime);
            return (DataSetTestProducer) this;
        }
        /**
         * Sets the maximum amount of time (in millis) the assertIsSatisfied()
         * will wait on a latch until it is satisfied. The option is a long
         * type.
         */
        public DataSetTestProducer resultWaitTime(long resultWaitTime) {
            this.properties.put("resultWaitTime", resultWaitTime);
            return (DataSetTestProducer) this;
        }
        /**
         * Specifies to only retain the first n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the first 10 Exchanges, then the getReceivedCounter()
         * will still return 5000 but there is only the first 10 Exchanges in
         * the getExchanges() and getReceivedExchanges() methods. When using
         * this method, then some of the other expectation methods is not
         * supported, for example the expectedBodiesReceived(Object...) sets a
         * expectation on the first number of bodies received. You can configure
         * both setRetainFirst(int) and setRetainLast(int) methods, to limit
         * both the first and last received. The option is a int type.
         */
        public DataSetTestProducer retainFirst(int retainFirst) {
            this.properties.put("retainFirst", retainFirst);
            return (DataSetTestProducer) this;
        }
        /**
         * Specifies to only retain the last n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the last 20 Exchanges, then the getReceivedCounter() will
         * still return 5000 but there is only the last 20 Exchanges in the
         * getExchanges() and getReceivedExchanges() methods. When using this
         * method, then some of the other expectation methods is not supported,
         * for example the expectedBodiesReceived(Object...) sets a expectation
         * on the first number of bodies received. You can configure both
         * setRetainFirst(int) and setRetainLast(int) methods, to limit both the
         * first and last received. The option is a int type.
         */
        public DataSetTestProducer retainLast(int retainLast) {
            this.properties.put("retainLast", retainLast);
            return (DataSetTestProducer) this;
        }
        /**
         * Allows a sleep to be specified to wait to check that this endpoint
         * really is empty when expectedMessageCount(int) is called with zero.
         * The option is a long type.
         */
        public DataSetTestProducer sleepForEmptyTest(long sleepForEmptyTest) {
            this.properties.put("sleepForEmptyTest", sleepForEmptyTest);
            return (DataSetTestProducer) this;
        }
        /**
         * Sets whether to make a deep copy of the incoming Exchange when
         * received at this mock endpoint. Is by default true. The option is a
         * boolean type.
         */
        public DataSetTestProducer copyOnExchange(boolean copyOnExchange) {
            this.properties.put("copyOnExchange", copyOnExchange);
            return (DataSetTestProducer) this;
        }
    }
}