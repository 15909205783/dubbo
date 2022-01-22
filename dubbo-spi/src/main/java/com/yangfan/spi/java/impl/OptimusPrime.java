package com.yangfan.spi.java.impl;

import com.yangfan.spi.java.api.Robot;
import org.apache.dubbo.common.extension.Adaptive;

@Adaptive
public class OptimusPrime implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
}
