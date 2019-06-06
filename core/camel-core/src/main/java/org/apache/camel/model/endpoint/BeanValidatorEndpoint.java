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
 * The Validator component performs bean validation of the message body using
 * the Java Bean Validation API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class BeanValidatorEndpoint {


    public static class BeanValidatorCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        BeanValidatorCommon(String path) {
            super("bean-validator", path);
        }
        /**
         * Where label is an arbitrary text value describing the endpoint. The
         * option is a java.lang.String type.
         */
        public T label(String label) {
            this.properties.put("label", label);
            return (T) this;
        }
        /**
         * To use a custom ConstraintValidatorFactory. The option is a
         * javax.validation.ConstraintValidatorFactory type.
         */
        public T constraintValidatorFactory(Object constraintValidatorFactory) {
            this.properties.put("constraintValidatorFactory", constraintValidatorFactory);
            return (T) this;
        }
        /**
         * To use a custom validation group. The option is a java.lang.String
         * type.
         */
        public T group(String group) {
            this.properties.put("group", group);
            return (T) this;
        }
        /**
         * To use a custom MessageInterpolator. The option is a
         * javax.validation.MessageInterpolator type.
         */
        public T messageInterpolator(Object messageInterpolator) {
            this.properties.put("messageInterpolator", messageInterpolator);
            return (T) this;
        }
        /**
         * To use a custom TraversableResolver. The option is a
         * javax.validation.TraversableResolver type.
         */
        public T traversableResolver(Object traversableResolver) {
            this.properties.put("traversableResolver", traversableResolver);
            return (T) this;
        }
        /**
         * To use a a custom ValidationProviderResolver. The option is a
         * javax.validation.ValidationProviderResolver type.
         */
        public T validationProviderResolver(Object validationProviderResolver) {
            this.properties.put("validationProviderResolver", validationProviderResolver);
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

    public static class BeanValidatorProducer
            extends
                BeanValidatorCommon<BeanValidatorProducer>
            implements
                EndpointDefinition.Producer {
        public BeanValidatorProducer(String path) {
            super(path);
        }
    }
}