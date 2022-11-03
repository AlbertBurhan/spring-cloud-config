package com.example.demogreeting;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({DemoGreetingProperties.class})
public class DemoGreetingController {
    private DemoGreetingProperties greetingProperties;

    public DemoGreetingController(DemoGreetingProperties greetingProperties)
    {
        this.greetingProperties = greetingProperties;
    }

    @RequestMapping("/")
    public String getGreeting(){
//        LOG.info("Greeting: " + greetingProperties.getGreeting());
        return greetingProperties.getGreeting();
    }
}
