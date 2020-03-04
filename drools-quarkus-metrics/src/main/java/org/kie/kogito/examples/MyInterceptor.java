package org.kie.kogito.examples;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.ext.Provider;

import org.kie.addons.monitoring.system.interceptor.MetricsInterceptor;

@Provider
public class MyInterceptor extends MetricsInterceptor {
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        super.filter(requestContext, responseContext);
    }
}
