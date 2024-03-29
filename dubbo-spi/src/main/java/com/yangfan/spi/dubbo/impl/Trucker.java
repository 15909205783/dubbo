package com.yangfan.spi.dubbo.impl;

import com.yangfan.spi.dubbo.api.Car;
import com.yangfan.spi.dubbo.api.Driver;
import org.apache.dubbo.common.URL;

public class Trucker implements Driver {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void driver(URL url) {
        car.getColor(url);
    }
}
