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
 * The ganglia component is used for sending metrics to the Ganglia monitoring
 * system.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public class GangliaEndpoint {


    public static class GangliaCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        GangliaCommon(String path) {
            super("ganglia", path);
        }
        /**
         * Host name for Ganglia server. The option is a java.lang.String type.
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * Port for Ganglia server. The option is a int type.
         */
        public T port(int port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Minumum time in seconds before Ganglia will purge the metric value if
         * it expires. Set to 0 and the value will remain in Ganglia
         * indefinitely until a gmond agent restart. The option is a int type.
         */
        public T dmax(int dmax) {
            this.properties.put("dmax", dmax);
            return (T) this;
        }
        /**
         * The group that the metric belongs to. The option is a
         * java.lang.String type.
         */
        public T groupName(String groupName) {
            this.properties.put("groupName", groupName);
            return (T) this;
        }
        /**
         * The name to use for the metric. The option is a java.lang.String
         * type.
         */
        public T metricName(String metricName) {
            this.properties.put("metricName", metricName);
            return (T) this;
        }
        /**
         * Send the UDP metric packets using MULTICAST or UNICAST. The option is
         * a info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode type.
         */
        public T mode(Object mode) {
            this.properties.put("mode", mode);
            return (T) this;
        }
        /**
         * Prefix the metric name with this string and an underscore. The option
         * is a java.lang.String type.
         */
        public T prefix(String prefix) {
            this.properties.put("prefix", prefix);
            return (T) this;
        }
        /**
         * The slope. The option is a
         * info.ganglia.gmetric4j.gmetric.GMetricSlope type.
         */
        public T slope(GMetricSlope slope) {
            this.properties.put("slope", slope);
            return (T) this;
        }
        /**
         * Spoofing information IP:hostname. The option is a java.lang.String
         * type.
         */
        public T spoofHostname(String spoofHostname) {
            this.properties.put("spoofHostname", spoofHostname);
            return (T) this;
        }
        /**
         * Maximum time in seconds that the value can be considered current.
         * After this, Ganglia considers the value to have expired. The option
         * is a int type.
         */
        public T tmax(int tmax) {
            this.properties.put("tmax", tmax);
            return (T) this;
        }
        /**
         * If using multicast, set the TTL of the packets. The option is a int
         * type.
         */
        public T ttl(int ttl) {
            this.properties.put("ttl", ttl);
            return (T) this;
        }
        /**
         * The type of value. The option is a
         * info.ganglia.gmetric4j.gmetric.GMetricType type.
         */
        public T type(GMetricType type) {
            this.properties.put("type", type);
            return (T) this;
        }
        /**
         * Any unit of measurement that qualifies the metric, e.g. widgets,
         * litres, bytes. Do not include a prefix such as k (kilo) or m (milli),
         * other tools may scale the units later. The value should be unscaled.
         * The option is a java.lang.String type.
         */
        public T units(String units) {
            this.properties.put("units", units);
            return (T) this;
        }
        /**
         * Use the wire format of Ganglia 3.1.0 and later versions. Set this to
         * false to use Ganglia 3.0.x or earlier. The option is a boolean type.
         */
        public T wireFormat31x(boolean wireFormat31x) {
            this.properties.put("wireFormat31x", wireFormat31x);
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

    public static class GangliaProducer
            extends
                GangliaCommon<GangliaProducer>
            implements
                EndpointDefinition.Producer {
        public GangliaProducer(String path) {
            super(path);
        }
    }

    public static enum GMetricSlope {
        ZERO, POSITIVE, NEGATIVE, BOTH;
    }

    public static enum GMetricType {
        STRING, INT8, UINT8, INT16, UINT16, INT32, UINT32, FLOAT, DOUBLE;
    }
}