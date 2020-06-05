/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dataset;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.mock.MockEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DataSetEndpointConfigurer extends MockEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DataSetEndpoint target = (DataSetEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumedelay":
        case "consumeDelay": target.setConsumeDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "datasetindex":
        case "dataSetIndex": target.setDataSetIndex(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "minrate":
        case "minRate": target.setMinRate(property(camelContext, int.class, value)); return true;
        case "preloadsize":
        case "preloadSize": target.setPreloadSize(property(camelContext, long.class, value)); return true;
        case "producedelay":
        case "produceDelay": target.setProduceDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = super.getAllOptions(target);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("consumeDelay", long.class);
        answer.put("dataSetIndex", java.lang.String.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("initialDelay", long.class);
        answer.put("minRate", int.class);
        answer.put("preloadSize", long.class);
        answer.put("produceDelay", long.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DataSetEndpoint target = (DataSetEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumedelay":
        case "consumeDelay": return target.getConsumeDelay();
        case "datasetindex":
        case "dataSetIndex": return target.getDataSetIndex();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "minrate":
        case "minRate": return target.getMinRate();
        case "preloadsize":
        case "preloadSize": return target.getPreloadSize();
        case "producedelay":
        case "produceDelay": return target.getProduceDelay();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

