package com.yangfan.spi.java.impl;


import com.yangfan.spi.java.api.CarInterface;

public class RedCar implements CarInterface {

    @Override
    public void hello() {
        System.out.println("Red");
    }
}
