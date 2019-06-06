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
import java.util.concurrent.ExecutorService;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The jmx component allows to receive JMX notifications.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class JMXEndpoint {


    public static class JMXCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        JMXCommon(String path) {
            super("jmx", path);
        }
        /**
         * Server url comes from the remaining endpoint. Use platform to connect
         * to local JVM. The option is a java.lang.String type.
         */
        public T serverURL(String serverURL) {
            this.properties.put("serverURL", serverURL);
            return (T) this;
        }
        /**
         * Format for the message body. Either xml or raw. If xml, the
         * notification is serialized to xml. If raw, then the raw java object
         * is set as the body. The option is a java.lang.String type.
         */
        public T format(String format) {
            this.properties.put("format", format);
            return (T) this;
        }
        /**
         * The frequency to poll the bean to check the monitor (monitor types
         * only). The option is a long type.
         */
        public T granularityPeriod(long granularityPeriod) {
            this.properties.put("granularityPeriod", granularityPeriod);
            return (T) this;
        }
        /**
         * The type of monitor to create. One of string, gauge, counter (monitor
         * types only). The option is a java.lang.String type.
         */
        public T monitorType(String monitorType) {
            this.properties.put("monitorType", monitorType);
            return (T) this;
        }
        /**
         * The domain for the mbean you're connecting to. The option is a
         * java.lang.String type.
         */
        public T objectDomain(String objectDomain) {
            this.properties.put("objectDomain", objectDomain);
            return (T) this;
        }
        /**
         * The name key for the mbean you're connecting to. This value is
         * mutually exclusive with the object properties that get passed. The
         * option is a java.lang.String type.
         */
        public T objectName(String objectName) {
            this.properties.put("objectName", objectName);
            return (T) this;
        }
        /**
         * The attribute to observe for the monitor bean or consumer. The option
         * is a java.lang.String type.
         */
        public T observedAttribute(String observedAttribute) {
            this.properties.put("observedAttribute", observedAttribute);
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
         * To use a custom shared thread pool for the consumers. By default each
         * consume has their own thread-pool to process and route notifications.
         * The option is a java.util.concurrent.ExecutorService type.
         */
        public T executorService(ExecutorService executorService) {
            this.properties.put("executorService", executorService);
            return (T) this;
        }
        /**
         * Value to handback to the listener when a notification is received.
         * This value will be put in the message header with the key
         * jmx.handback. The option is a java.lang.Object type.
         */
        public T handback(Object handback) {
            this.properties.put("handback", handback);
            return (T) this;
        }
        /**
         * Reference to a bean that implements the NotificationFilter. The
         * option is a javax.management.NotificationFilter type.
         */
        public T notificationFilter(Object notificationFilter) {
            this.properties.put("notificationFilter", notificationFilter);
            return (T) this;
        }
        /**
         * Properties for the object name. These values will be used if the
         * objectName param is not set. The option is a
         * java.util.Map<java.lang.String,java.lang.String> type.
         */
        public T objectProperties(Map<String, String> objectProperties) {
            this.properties.put("objectProperties", objectProperties);
            return (T) this;
        }
        /**
         * The number of seconds to wait before attempting to retry
         * establishment of the initial connection or attempt to reconnect a
         * lost connection. The option is a int type.
         */
        public T reconnectDelay(int reconnectDelay) {
            this.properties.put("reconnectDelay", reconnectDelay);
            return (T) this;
        }
        /**
         * If true the consumer will attempt to reconnect to the JMX server when
         * any connection failure occurs. The consumer will attempt to
         * re-establish the JMX connection every 'x' seconds until the
         * connection is made-- where 'x' is the configured reconnectionDelay.
         * The option is a boolean type.
         */
        public T reconnectOnConnectionFailure(
                boolean reconnectOnConnectionFailure) {
            this.properties.put("reconnectOnConnectionFailure", reconnectOnConnectionFailure);
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
         * If true the consumer will throw an exception if unable to establish
         * the JMX connection upon startup. If false, the consumer will attempt
         * to establish the JMX connection every 'x' seconds until the
         * connection is made -- where 'x' is the configured reconnectionDelay.
         * The option is a boolean type.
         */
        public T testConnectionOnStartup(boolean testConnectionOnStartup) {
            this.properties.put("testConnectionOnStartup", testConnectionOnStartup);
            return (T) this;
        }
        /**
         * Initial threshold for the monitor. The value must exceed this before
         * notifications are fired (counter monitor only). The option is a int
         * type.
         */
        public T initThreshold(int initThreshold) {
            this.properties.put("initThreshold", initThreshold);
            return (T) this;
        }
        /**
         * The value at which the counter is reset to zero (counter monitor
         * only). The option is a int type.
         */
        public T modulus(int modulus) {
            this.properties.put("modulus", modulus);
            return (T) this;
        }
        /**
         * The amount to increment the threshold after it's been exceeded
         * (counter monitor only). The option is a int type.
         */
        public T offset(int offset) {
            this.properties.put("offset", offset);
            return (T) this;
        }
        /**
         * If true, then the value reported in the notification is the
         * difference from the threshold as opposed to the value itself (counter
         * and gauge monitor only). The option is a boolean type.
         */
        public T differenceMode(boolean differenceMode) {
            this.properties.put("differenceMode", differenceMode);
            return (T) this;
        }
        /**
         * If true, the gauge will fire a notification when the high threshold
         * is exceeded (gauge monitor only). The option is a boolean type.
         */
        public T notifyHigh(boolean notifyHigh) {
            this.properties.put("notifyHigh", notifyHigh);
            return (T) this;
        }
        /**
         * If true, the gauge will fire a notification when the low threshold is
         * exceeded (gauge monitor only). The option is a boolean type.
         */
        public T notifyLow(boolean notifyLow) {
            this.properties.put("notifyLow", notifyLow);
            return (T) this;
        }
        /**
         * Value for the gauge's high threshold (gauge monitor only). The option
         * is a java.lang.Double type.
         */
        public T thresholdHigh(Double thresholdHigh) {
            this.properties.put("thresholdHigh", thresholdHigh);
            return (T) this;
        }
        /**
         * Value for the gauge's low threshold (gauge monitor only). The option
         * is a java.lang.Double type.
         */
        public T thresholdLow(Double thresholdLow) {
            this.properties.put("thresholdLow", thresholdLow);
            return (T) this;
        }
        /**
         * Credentials for making a remote connection. The option is a
         * java.lang.String type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Credentials for making a remote connection. The option is a
         * java.lang.String type.
         */
        public T user(String user) {
            this.properties.put("user", user);
            return (T) this;
        }
    }

    public static class JMXConsumer
            extends
                JMXCommon<JMXConsumer>
            implements
                EndpointDefinition.Consumer {
        public JMXConsumer(String path) {
            super(path);
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
        public JMXConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (JMXConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public JMXConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (JMXConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public JMXConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (JMXConsumer) this;
        }
        /**
         * If true, will fire a notification when the string attribute differs
         * from the string to compare (string monitor or consumer). By default
         * the consumer will notify match if observed attribute and string to
         * compare has been configured. The option is a boolean type.
         */
        public JMXConsumer notifyDiffer(boolean notifyDiffer) {
            this.properties.put("notifyDiffer", notifyDiffer);
            return (JMXConsumer) this;
        }
        /**
         * If true, will fire a notification when the string attribute matches
         * the string to compare (string monitor or consumer). By default the
         * consumer will notify match if observed attribute and string to
         * compare has been configured. The option is a boolean type.
         */
        public JMXConsumer notifyMatch(boolean notifyMatch) {
            this.properties.put("notifyMatch", notifyMatch);
            return (JMXConsumer) this;
        }
        /**
         * Value for attribute to compare (string monitor or consumer). By
         * default the consumer will notify match if observed attribute and
         * string to compare has been configured. The option is a
         * java.lang.String type.
         */
        public JMXConsumer stringToCompare(String stringToCompare) {
            this.properties.put("stringToCompare", stringToCompare);
            return (JMXConsumer) this;
        }
    }
}