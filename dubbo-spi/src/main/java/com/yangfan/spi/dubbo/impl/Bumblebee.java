package com.yangfan.spi.dubbo.impl;

import com.yangfan.spi.dubbo.api.Robot;
import org.apache.dubbo.common.URL;

public class Bumblebee implements Robot {
    @Override
    public void sayHello(URL url) {
        System.out.println("Hello,I am Bumblebee");
    }
}
