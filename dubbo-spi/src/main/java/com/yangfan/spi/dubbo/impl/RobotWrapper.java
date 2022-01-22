package com.yangfan.spi.dubbo.impl;

import com.yangfan.spi.dubbo.api.Robot;
import org.apache.dubbo.common.URL;

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
    public void sayHello(URL url) {
        System.out.println("before");
        robot.sayHello(url);
        System.out.println("after");
    }
}
