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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.sjms.batch.SjmsBatchComponent;

/**
 * Highly performant and transactional batch consumption of messages from a JMS
 * queue.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface SjmsBatchComponentBuilderFactory {

    /**
     * Simple JMS Batch (camel-sjms)
     * Highly performant and transactional batch consumption of messages from a
     * JMS queue.
     * 
     * Category: messaging
     * Since: 2.16
     * Maven coordinates: org.apache.camel:camel-sjms
     */
    static SjmsBatchComponentBuilder sjmsBatch() {
        return new SjmsBatchComponentBuilderImpl();
    }

    /**
     * Builder for the Simple JMS Batch component.
     */
    interface SjmsBatchComponentBuilder
            extends
                ComponentBuilder<SjmsBatchComponent> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SjmsBatchComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether to startup the consumer message listener asynchronously, when
         * starting a route. For example if a JmsConsumer cannot get a
         * connection to a remote JMS broker, then it may block while retrying
         * and/or failover. This will cause Camel to block while starting
         * routes. By setting this option to true, you will let routes startup,
         * while the JmsConsumer connects to the JMS broker using a dedicated
         * thread in asynchronous mode. If this option is used, then beware that
         * if the connection could not be established, then an exception is
         * logged at WARN level, and the consumer will not be able to receive
         * messages; You can then restart the route to retry.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default SjmsBatchComponentBuilder asyncStartListener(
                boolean asyncStartListener) {
            doSetProperty("asyncStartListener", asyncStartListener);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default SjmsBatchComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * A ConnectionFactory is required to enable the SjmsBatchComponent.
         * 
         * The option is a: <code>javax.jms.ConnectionFactory</code> type.
         * 
         * Group: advanced
         */
        default SjmsBatchComponentBuilder connectionFactory(
                javax.jms.ConnectionFactory connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Specifies the interval between recovery attempts, i.e. when a
         * connection is being refreshed, in milliseconds. The default is 5000
         * ms, that is, 5 seconds.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 5000
         * Group: advanced
         */
        default SjmsBatchComponentBuilder recoveryInterval(int recoveryInterval) {
            doSetProperty("recoveryInterval", recoveryInterval);
            return this;
        }
        /**
         * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
         * header to and from Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: filter
         */
        default SjmsBatchComponentBuilder headerFilterStrategy(
                org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
    }

    class SjmsBatchComponentBuilderImpl
            extends
                AbstractComponentBuilder<SjmsBatchComponent>
            implements
                SjmsBatchComponentBuilder {
        @Override
        protected SjmsBatchComponent buildConcreteComponent() {
            return new SjmsBatchComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((SjmsBatchComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "asyncStartListener": ((SjmsBatchComponent) component).setAsyncStartListener((boolean) value); return true;
            case "basicPropertyBinding": ((SjmsBatchComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "connectionFactory": ((SjmsBatchComponent) component).setConnectionFactory((javax.jms.ConnectionFactory) value); return true;
            case "recoveryInterval": ((SjmsBatchComponent) component).setRecoveryInterval((int) value); return true;
            case "headerFilterStrategy": ((SjmsBatchComponent) component).setHeaderFilterStrategy((org.apache.camel.spi.HeaderFilterStrategy) value); return true;
            default: return false;
            }
        }
    }
}