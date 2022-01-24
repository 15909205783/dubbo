package com.yangfan.dubbospi;

import com.yangfan.spi.Application;
import com.yangfan.spi.dubbo.api.Car;
import com.yangfan.spi.dubbo.api.CarInterface;
import com.yangfan.spi.dubbo.api.Driver;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestDubboSPI {
    @Test
    public void testAdaptive() {
        ExtensionLoader<Driver> carExtensionLoader = ExtensionLoader.getExtensionLoader(Driver.class);
        Driver driver= carExtensionLoader.getExtension("trucker");
        Map<String,String> map= new HashMap<>();
        map.put("carType","red");
        URL url = new URL("","",0,map);

        driver.driver(url);
    }

}
