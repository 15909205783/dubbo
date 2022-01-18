package com.yangfan.spi.dubbo.impl;

import com.yangfan.spi.dubbo.api.Robot;

public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello,I am Bumblebee");
    }
}
