package com.yangfan.spi.java.impl;


import com.yangfan.spi.java.api.Robot;

public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}
