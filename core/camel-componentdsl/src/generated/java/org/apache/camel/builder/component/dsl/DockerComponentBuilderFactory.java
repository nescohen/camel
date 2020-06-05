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
import org.apache.camel.component.docker.DockerComponent;

/**
 * Manage Docker containers.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface DockerComponentBuilderFactory {

    /**
     * Docker (camel-docker)
     * Manage Docker containers.
     * 
     * Category: cloud,container,paas
     * Since: 2.15
     * Maven coordinates: org.apache.camel:camel-docker
     */
    static DockerComponentBuilder docker() {
        return new DockerComponentBuilderImpl();
    }

    /**
     * Builder for the Docker component.
     */
    interface DockerComponentBuilder
            extends
                ComponentBuilder<DockerComponent> {
        /**
         * To use the shared docker configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.docker.DockerConfiguration</code>
         * type.
         * 
         * Group: common
         */
        default DockerComponentBuilder configuration(
                org.apache.camel.component.docker.DockerConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Email address associated with the user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default DockerComponentBuilder email(java.lang.String email) {
            doSetProperty("email", email);
            return this;
        }
        /**
         * Docker host.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: localhost
         * Group: common
         */
        default DockerComponentBuilder host(java.lang.String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * Docker port.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 2375
         * Group: common
         */
        default DockerComponentBuilder port(java.lang.Integer port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * Request timeout for response (in seconds).
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: common
         */
        default DockerComponentBuilder requestTimeout(
                java.lang.Integer requestTimeout) {
            doSetProperty("requestTimeout", requestTimeout);
            return this;
        }
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
        default DockerComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default DockerComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default DockerComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The fully qualified class name of the DockerCmdExecFactory
         * implementation to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: com.github.dockerjava.netty.NettyDockerCmdExecFactory
         * Group: advanced
         */
        default DockerComponentBuilder cmdExecFactory(
                java.lang.String cmdExecFactory) {
            doSetProperty("cmdExecFactory", cmdExecFactory);
            return this;
        }
        /**
         * Whether to follow redirect filter.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default DockerComponentBuilder followRedirectFilter(
                boolean followRedirectFilter) {
            doSetProperty("followRedirectFilter", followRedirectFilter);
            return this;
        }
        /**
         * Whether to use logging filter.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default DockerComponentBuilder loggingFilter(boolean loggingFilter) {
            doSetProperty("loggingFilter", loggingFilter);
            return this;
        }
        /**
         * Maximum route connections.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 100
         * Group: advanced
         */
        default DockerComponentBuilder maxPerRouteConnections(
                java.lang.Integer maxPerRouteConnections) {
            doSetProperty("maxPerRouteConnections", maxPerRouteConnections);
            return this;
        }
        /**
         * Maximum total connections.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 100
         * Group: advanced
         */
        default DockerComponentBuilder maxTotalConnections(
                java.lang.Integer maxTotalConnections) {
            doSetProperty("maxTotalConnections", maxTotalConnections);
            return this;
        }
        /**
         * Additional configuration parameters as key/value pairs.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         * 
         * Group: advanced
         */
        default DockerComponentBuilder parameters(
                java.util.Map<java.lang.String, java.lang.Object> parameters) {
            doSetProperty("parameters", parameters);
            return this;
        }
        /**
         * Server address for docker registry.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: https://index.docker.io/v1/
         * Group: advanced
         */
        default DockerComponentBuilder serverAddress(
                java.lang.String serverAddress) {
            doSetProperty("serverAddress", serverAddress);
            return this;
        }
        /**
         * Socket connection mode.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: advanced
         */
        default DockerComponentBuilder socket(boolean socket) {
            doSetProperty("socket", socket);
            return this;
        }
        /**
         * Location containing the SSL certificate chain.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default DockerComponentBuilder certPath(java.lang.String certPath) {
            doSetProperty("certPath", certPath);
            return this;
        }
        /**
         * Password to authenticate with.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default DockerComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Use HTTPS communication.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default DockerComponentBuilder secure(boolean secure) {
            doSetProperty("secure", secure);
            return this;
        }
        /**
         * Check TLS.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default DockerComponentBuilder tlsVerify(boolean tlsVerify) {
            doSetProperty("tlsVerify", tlsVerify);
            return this;
        }
        /**
         * User name to authenticate with.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default DockerComponentBuilder username(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    class DockerComponentBuilderImpl
            extends
                AbstractComponentBuilder<DockerComponent>
            implements
                DockerComponentBuilder {
        @Override
        protected DockerComponent buildConcreteComponent() {
            return new DockerComponent();
        }
        private org.apache.camel.component.docker.DockerConfiguration getOrCreateConfiguration(
                org.apache.camel.component.docker.DockerComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.docker.DockerConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((DockerComponent) component).setConfiguration((org.apache.camel.component.docker.DockerConfiguration) value); return true;
            case "email": getOrCreateConfiguration((DockerComponent) component).setEmail((java.lang.String) value); return true;
            case "host": getOrCreateConfiguration((DockerComponent) component).setHost((java.lang.String) value); return true;
            case "port": getOrCreateConfiguration((DockerComponent) component).setPort((java.lang.Integer) value); return true;
            case "requestTimeout": getOrCreateConfiguration((DockerComponent) component).setRequestTimeout((java.lang.Integer) value); return true;
            case "bridgeErrorHandler": ((DockerComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((DockerComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((DockerComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "cmdExecFactory": getOrCreateConfiguration((DockerComponent) component).setCmdExecFactory((java.lang.String) value); return true;
            case "followRedirectFilter": getOrCreateConfiguration((DockerComponent) component).setFollowRedirectFilter((boolean) value); return true;
            case "loggingFilter": getOrCreateConfiguration((DockerComponent) component).setLoggingFilter((boolean) value); return true;
            case "maxPerRouteConnections": getOrCreateConfiguration((DockerComponent) component).setMaxPerRouteConnections((java.lang.Integer) value); return true;
            case "maxTotalConnections": getOrCreateConfiguration((DockerComponent) component).setMaxTotalConnections((java.lang.Integer) value); return true;
            case "parameters": getOrCreateConfiguration((DockerComponent) component).setParameters((java.util.Map) value); return true;
            case "serverAddress": getOrCreateConfiguration((DockerComponent) component).setServerAddress((java.lang.String) value); return true;
            case "socket": getOrCreateConfiguration((DockerComponent) component).setSocket((boolean) value); return true;
            case "certPath": getOrCreateConfiguration((DockerComponent) component).setCertPath((java.lang.String) value); return true;
            case "password": getOrCreateConfiguration((DockerComponent) component).setPassword((java.lang.String) value); return true;
            case "secure": getOrCreateConfiguration((DockerComponent) component).setSecure((boolean) value); return true;
            case "tlsVerify": getOrCreateConfiguration((DockerComponent) component).setTlsVerify((boolean) value); return true;
            case "username": getOrCreateConfiguration((DockerComponent) component).setUsername((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}