package com.example.demoweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DemoWebController {
    private NameService nameService;
    private GreetingService greetingService;

    public DemoWebController(NameService nameService, GreetingService greetingService)
    {
        this.greetingService = greetingService;
        this.nameService = nameService;
    }

    @RequestMapping
    public String index(HttpServletRequest request) {
        String greeting =  new StringBuilder().append(greetingService.getGreeting()).
                append(" ").append(nameService.getName()).toString();

        return greeting;
    }
}
