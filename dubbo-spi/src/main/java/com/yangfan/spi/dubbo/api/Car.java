package com.yangfan.spi.dubbo.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Car {

    void makeCar(URL url);
}
