package com.yangfan.spi.dubbo.impl;

import com.yangfan.spi.dubbo.api.Robot;

public class RobotWrapper implements Robot {
    private Robot robot;

    public RobotWrapper(Robot robot) {
        this.robot = robot;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void sayHello() {
        System.out.println("before");
        robot.sayHello();
        System.out.println("after");
    }
}
