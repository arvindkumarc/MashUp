package com.arvindc.resources;

import com.arvindc.configurations.MessageConfiguration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value = "/hello")
public class HelloResource {
    private final MessageConfiguration configuration;

    public HelloResource(MessageConfiguration configuration) {
        this.configuration = configuration;
    }

    @GET
    public String sayHello() {
        return configuration.getHello();
    }
}
