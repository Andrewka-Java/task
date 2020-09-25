package com.epolsoft.soap_app.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;


//TODO: that resolve the problem with CORS(work?)
@Component
public class HttpHeaderInterceptor implements EndpointInterceptor {

    private static final Logger LOG = LoggerFactory.getLogger(HttpHeaderInterceptor.class);

    @Override
    public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {
        LOG.debug("Endpoint Request Handling");
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {
        LOG.debug("Endpoint Response Handling");
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
        LOG.debug("Endpoint Exception Handling");
        return true;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {
        LOG.debug("Execute code after completion");
    }
}
