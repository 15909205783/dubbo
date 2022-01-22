package com.yangfan.spi.dubbo.impl;

import com.yangfan.spi.dubbo.api.Robot;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;


public class OptimusPrime implements Robot {
    @Override
    @Adaptive
    public void sayHello(URL url) {
        System.out.println("Hello,I am OptimusPrime");
    }
}
