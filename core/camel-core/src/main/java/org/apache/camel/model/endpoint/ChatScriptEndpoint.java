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
 * Represents a ChatScript endpoint.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class ChatScriptEndpoint {


    public static class ChatScriptCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        ChatScriptCommon(String path) {
            super("chatscript", path);
        }
        /**
         * Hostname or IP of the server on which CS server is running. The
         * option is a java.lang.String type.
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * Port on which ChatScript is listening to. The option is a int type.
         */
        public T port(int port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Name of the Bot in CS to converse with. The option is a
         * java.lang.String type.
         */
        public T botName(String botName) {
            this.properties.put("botName", botName);
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
         * Issues :reset command to start a new conversation everytime. The
         * option is a boolean type.
         */
        public T resetchat(boolean resetchat) {
            this.properties.put("resetchat", resetchat);
            return (T) this;
        }
        /**
         * Username who initializes the CS conversation. To be set when chat is
         * initialized from camel route. The option is a java.lang.String type.
         */
        public T chatUserName(String chatUserName) {
            this.properties.put("chatUserName", chatUserName);
            return (T) this;
        }
    }

    public static class ChatScriptProducer
            extends
                ChatScriptCommon<ChatScriptProducer>
            implements
                EndpointDefinition.Producer {
        public ChatScriptProducer(String path) {
            super(path);
        }
    }
}