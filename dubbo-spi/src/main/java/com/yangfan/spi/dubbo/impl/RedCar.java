package com.yangfan.spi.dubbo.impl;

import com.yangfan.spi.dubbo.api.Car;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

public class RedCar implements Car {

    @Override
    public void getColor(URL url) {
        System.out.println("I am drivering red");
    }
}
