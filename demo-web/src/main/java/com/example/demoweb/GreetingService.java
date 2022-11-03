package com.example.demoweb;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class GreetingService {
    private GreetingFeignClient greetingFeignClient;

    public GreetingService(GreetingFeignClient greetingFeignClient)
    {
        this.greetingFeignClient = greetingFeignClient;
    }

    public String getGreeting()
    {
        return greetingFeignClient.getGreeting();
    }

    @FeignClient("greeting")
    static interface GreetingFeignClient
    {
        @RequestMapping("/")
        public String getGreeting();
    }
}
