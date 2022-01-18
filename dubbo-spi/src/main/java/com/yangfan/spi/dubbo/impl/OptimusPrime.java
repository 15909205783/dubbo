package com.yangfan.spi.dubbo.impl;

import com.yangfan.spi.dubbo.api.Robot;

public class OptimusPrime implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello,I am OptimusPrime");
    }
}
