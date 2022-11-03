package com.example.demonameservice;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(NameProperties.class)
public class NameController {
    private NameProperties nameProperties;

    public NameController(NameProperties nameProperties)
    {
        this.nameProperties = nameProperties;
    }
    @RequestMapping("/")
    public String getName()
    {
        return nameProperties.getNama();
    }
}
