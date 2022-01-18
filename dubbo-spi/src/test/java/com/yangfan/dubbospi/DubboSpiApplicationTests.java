package com.yangfan.dubbospi;

import com.yangfan.spi.Application;
import com.yangfan.spi.dubbo.api.Robot;
import com.yangfan.spi.java.api.CarInterface;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ServiceLoader;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
class DubboSpiApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testJavaSPI() {
        ServiceLoader<CarInterface> loaders = ServiceLoader.load(CarInterface.class);
        for (CarInterface carInterface : loaders) {
            carInterface.hello();
        }
    }

    @Test
    public void testDubboSPI() {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }
}
