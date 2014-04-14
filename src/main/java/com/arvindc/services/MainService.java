package com.arvindc.services;

import com.arvindc.configurations.MashupConfiguration;
import com.arvindc.resources.HelloResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class MainService extends Service<MashupConfiguration>
{
    public static void main(String[] args) throws Exception {
        new MainService().run(args);
    }

    @Override
    public void initialize(Bootstrap<MashupConfiguration> mashupConfigurationBootstrap) {
        mashupConfigurationBootstrap.setName("Mashup Service");
    }

    @Override
    public void run(MashupConfiguration mashupConfiguration, Environment environment) throws Exception {
        environment.addResource(new HelloResource(mashupConfiguration.getMessages()));
    }
}
