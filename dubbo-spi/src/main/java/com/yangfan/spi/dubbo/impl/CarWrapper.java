package com.yangfan.spi.dubbo.impl;

import com.yangfan.spi.dubbo.api.Car;
import org.apache.dubbo.common.URL;

public class CarWrapper implements Car {

    private Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public void getColor(URL url) {
        System.out.println("before...........");
        car.getColor(url);
        System.out.println("after...........");
    }
}
