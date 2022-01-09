package com.yangfan.service.impl;

import com.yangfan.dubbointerface.ProviderService;

public class ProviderServiceImpl implements ProviderService {
    @Override
    public String SayHello(String word) {
        return word;
    }
}
