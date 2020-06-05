/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.openstack.glance;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GlanceEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GlanceEndpoint target = (GlanceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": target.setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "config": target.setConfig(property(camelContext, org.openstack4j.core.transport.Config.class, value)); return true;
        case "domain": target.setDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "project": target.setProject(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("apiVersion", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("config", org.openstack4j.core.transport.Config.class);
        answer.put("domain", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("operation", java.lang.String.class);
        answer.put("password", java.lang.String.class);
        answer.put("project", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("username", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GlanceEndpoint target = (GlanceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": return target.getApiVersion();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "config": return target.getConfig();
        case "domain": return target.getDomain();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getOperation();
        case "password": return target.getPassword();
        case "project": return target.getProject();
        case "synchronous": return target.isSynchronous();
        case "username": return target.getUsername();
        default: return null;
        }
    }
}

