package com.arvindc.configurations;

import com.yammer.dropwizard.config.Configuration;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;

@Getter
@Setter
public class MashupConfiguration extends Configuration {
    @Valid
    private MessageConfiguration messages;
}
