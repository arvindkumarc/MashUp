package com.arvindc.configurations;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class MessageConfiguration {
    @NotNull
    private String hello;
}
