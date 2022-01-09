package com.yangfan.duboconsumer.controller;

import com.yangfan.dubbointerface.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/consumer")
    public String consumer() {
        return providerService.SayHello("hello");
    }
}
