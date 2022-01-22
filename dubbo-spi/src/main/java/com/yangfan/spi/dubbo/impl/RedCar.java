package com.yangfan.spi.dubbo.impl;

import com.yangfan.spi.dubbo.api.Car;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

@Adaptive
public class RedCar implements Car {
    @Override
    public void makeCar(URL url) {
        System.out.println("red");
    }
}
