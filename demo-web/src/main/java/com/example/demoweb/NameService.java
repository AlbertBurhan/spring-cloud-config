package com.example.demoweb;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class NameService {
    private NameFeignClient nameFeignClient;

    public NameService(NameFeignClient nameFeignClient) {
        this.nameFeignClient = nameFeignClient;
    }

    public String getName() {
        return nameFeignClient.getName();
    }

    @FeignClient("nama")
    static interface NameFeignClient
    {
        @RequestMapping("/")
        public String getName();
    }
}
